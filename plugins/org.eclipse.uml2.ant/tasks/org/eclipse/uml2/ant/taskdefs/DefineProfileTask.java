/*
 * Copyright (c) 2013, 2014 CEA and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Christian W. Damus (CEA) - initial API and implementation
 *   Christian W. Damus (CEA) - 286404
 */

package org.eclipse.uml2.ant.taskdefs;

import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.types.Commandline;
import org.apache.tools.ant.types.FileSet;
import org.apache.tools.ant.types.Resource;
import org.apache.tools.ant.types.resources.FileResource;
import org.eclipse.emf.ant.taskdefs.EMFTask;
import org.eclipse.uml2.ant.app.DefineProfileApplication;
import org.eclipse.uml2.ant.util.AntDiagnosticReporter;


/**
 * <p>
 * Creates dynamic profile definitions embedded in the profiles specified in
 * <b>UML</b> files.
 * </p>
 * <p>
 * Usage example:
 * </p>
 * 
 * <pre>
 * &lt;uml2.defineProfile profile="/Users/scott/profiles/j2ee.profile.uml"&gt;
 *        &lt;arg line="-INVARIANT_CONSTRAINTS PROCESS -VALIDATION_DELEGATES PROCESS"/&gt;
 *        &lt;arg line="-NON_API_INVARIANTS PROCESS -CAMEL_CASE_NAMES PROCESS"/&gt;
 *        &lt;arg line="-UNTYPED_PROPERTIES REPORT"/&gt;
 * &lt;/uml2.defineProfile&gt;
 * </pre>
 * <p>
 * Defining several profiles at once:
 * </p>
 * 
 * <pre>
 * &lt;uml2.defineProfile&gt;
 *        &lt;profile file="/Users/scott/profiles/j2ee.profile.uml"/&gt;
 *        &lt;profile file="/Users/scott/profiles/rdbms.profile.uml"/&gt;
 *        &lt;profile file="/Users/scott/profiles/jpa.profile.uml"/&gt;
 *        &lt;arg line="-INVARIANT_CONSTRAINTS PROCESS -VALIDATION_DELEGATES PROCESS"/&gt;
 *        &lt;arg line="-NON_API_INVARIANTS PROCESS -CAMEL_CASE_NAMES PROCESS"/&gt;
 *        &lt;arg line="-UNTYPED_PROPERTIES REPORT"/&gt;
 * &lt;/uml2.defineProfile&gt;
 * </pre>
 * <p>
 * Or, using a fileset:
 * </p>
 * 
 * <pre>
 * &lt;fileset dir="${profiles.dir}" id="profiles.to.define"&gt;
 *        &lt;include name="*.profile.uml"/&gt;
 * &lt;/fileset&gt;
 * &lt;uml2.defineProfile&gt;
 *        &lt;profileset refid="profiles.to.define"/&gt;
 *        &lt;arg line="-INVARIANT_CONSTRAINTS PROCESS -VALIDATION_DELEGATES PROCESS"/&gt;
 *        &lt;arg line="-NON_API_INVARIANTS PROCESS -CAMEL_CASE_NAMES PROCESS"/&gt;
 *        &lt;arg line="-UNTYPED_PROPERTIES REPORT"/&gt;
 * &lt;/uml2.defineProfile&gt;
 * </pre>
 * 
 */
public class DefineProfileTask
		extends EMFTask {
		
	private Commandline commandline = new Commandline();

	private List<ProfileLocation> profileLocations = new java.util.ArrayList<ProfileLocation>(
		1);

	private List<FileSet> profileSets = new java.util.ArrayList<FileSet>(1);

	protected Commandline getCommandline() {
		return commandline;
	}

	public Commandline.Argument createArg() {
		return getCommandline().createArgument();
	}

	public ProfileLocation createProfile() {
		ProfileLocation result = new ProfileLocation();
		profileLocations.add(result);
		return result;
	}

	public FileSet createProfileSet() {
		FileSet result = new FileSet();
		profileSets.add(result);
		return result;
	}

	public void setProfile(File location) {
		createProfile().setFile(location);
	}

	@Override
	protected void checkAttributes()
			throws BuildException {

		assertTrue("No profile locations specified.",
			!profileLocations.isEmpty() || !profileSets.isEmpty());
		if (!profileLocations.isEmpty()) {
			for (ProfileLocation profile : profileLocations) {
				profile.checkAttributes();
			}
		} else {
			assertTrue("Profile sets do not include any profile resources.",
				getProfileSets().hasNext());
		}

		super.checkAttributes();
	}

	protected Iterator<File> getProfileSets() {
		return new Iterator<File>() {

			private Iterator<FileSet> fileSets = profileSets.iterator();

			private Iterator<Resource> resources;

			private File preparedNext;

			public boolean hasNext() {
				out : while (preparedNext == null) {
					while ((resources == null) || !resources.hasNext()) {
						if (!fileSets.hasNext()) {
							break out;
						}

						resources = fileSets.next().iterator();
					}

					if (resources.hasNext()) {
						preparedNext = as(resources.next(), FileResource.class)
							.getFile();
					}
				}

				return preparedNext != null;
			}

			public File next() {
				if (!hasNext()) {
					throw new NoSuchElementException();
				}

				File result = preparedNext;
				preparedNext = null;
				return result;
			}

			public void remove() {
				throw new UnsupportedOperationException("remove"); //$NON-NLS-1$
			}
		};
	}

	static <T> T as(Object o, Class<T> type) {
		return type.isInstance(o)
			? type.cast(o)
			: null;
	}

	@Override
	protected void doExecute()
			throws Exception {

		// collect profiles from <profile> elements (and 'profile' attribute)
		for (ProfileLocation profile : profileLocations) {
			getCommandline().createArgument(true).setFile(profile.getFile());
		}

		// collect profiles from <profileSet> elements
		for (Iterator<File> profileSets = getProfileSets(); profileSets
			.hasNext();) {

			getCommandline().createArgument(true).setFile(profileSets.next());
		}

		new DefineProfileApplication(AntDiagnosticReporter.create(this))
			.run(getCommandline().getArguments());
	}

	//
	// Nested types
	//

	public static class ProfileLocation {

		private File file;

		public void setFile(File file) {
			this.file = file;
		}

		public File getFile() {
			return file;
		}

		protected void checkAttributes()
				throws BuildException {

			assertTrue("Profile element missing file location.", file != null);
		}
	}
}