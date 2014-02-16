/*
 * Copyright (c) 2013, 2014 CEA and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Christian W. Damus (CEA) - initial API and implementation
 *   Christian W. Damus (CEA) - 286404
 *
 */
package org.eclipse.uml2.ant.tests;

import static org.eclipse.uml2.uml.util.UMLUtil.UML2EcoreConverter.*;
import static org.eclipse.uml2.uml.util.UMLUtil.*;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.apache.tools.ant.BuildException;
import org.eclipse.ant.core.AntRunner;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.common.util.UML2Util;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.tests.util.StandaloneSupport;

/**
 * Tests the profile definition Ant task.
 * 
 * @see https://bugs.eclipse.org/bugs/show_bug.cgi?id=286404
 */
public class DefineProfileTaskTest
		extends TestCase {

	private static final String ECORE_ANNOTATION_URI = "http://www.eclipse.org/emf/2002/Ecore";

	private static final String OCL_ANNOTATION_URI = ECORE_ANNOTATION_URI
		+ "/OCL";

	private File tempDir;

	private ResourceSet rset;

	public DefineProfileTaskTest() {
		super();
	}

	public DefineProfileTaskTest(String name) {
		super(name);
	}

	public static Test suite() {
		return new TestSuite(DefineProfileTaskTest.class,
			"UML Profile Definition Ant Task tests"); //$NON-NLS-1$
	}

	void assertDefaultOptions(Profile profile) {
		// default option for untyped properties is to report (checked by the
		// reporter)
		EClass bean = getEClass(profile, "Bean");
		EStructuralFeature attachment = bean
			.getEStructuralFeature("attachment");
		assertNotNull(attachment);
		assertNull(attachment.getEType());

		// default option for OCL constraints is to drop them
		EClass finder = getEClass(profile, "Finder");
		assertNoValidationOperations(finder);
		assertNoAnnotation(finder, OCL_ANNOTATION_URI, "is_static");
		assertNoAnnotation(finder, ECORE_ANNOTATION_URI, "constraints");
	}

	Map<String, String> getTestOptions() {
		return options(OPTION__INVARIANT_CONSTRAINTS, OPTION__PROCESS,
			OPTION__VALIDATION_DELEGATES, OPTION__PROCESS,
			OPTION__NON_API_INVARIANTS, OPTION__PROCESS,
			OPTION__UNTYPED_PROPERTIES, OPTION__DISCARD);
	}

	void assertTestOptions(Profile profile) {
		EClass bean = getEClass(profile, "Bean");
		EStructuralFeature attachment = bean
			.getEStructuralFeature("attachment");
		assertNull(attachment);

		EClass finder = getEClass(profile, "Finder");
		assertNoValidationOperations(finder);
		assertEcoreAnnotation(finder, "constraints", "is_static");
		assertOCLAnnotation(finder, "is_static", "base_Operation.isStatic");
	}

	public void testAntBuildDefaultOptions() {
		URI uri = copyTestProfile();

		Profile profile = defineProfileByAntBuild(uri,
			ProfileAntLocationKind.PROFILE_ATTRIBUTE, null);

		assertDefaultOptions(profile);
	}

	public void testAntBuildWithOptions() {
		URI uri = copyTestProfile();

		Profile profile = defineProfileByAntBuild(uri,
			ProfileAntLocationKind.PROFILE_ATTRIBUTE, getTestOptions());

		assertTestOptions(profile);
	}

	public void testAntBuildProfileElement() {
		URI uri = copyTestProfile();

		Profile profile = defineProfileByAntBuild(uri,
			ProfileAntLocationKind.PROFILE_ELEMENT, getTestOptions());

		assertTestOptions(profile);
	}

	public void testAntBuildProfileSet() {
		URI uri = copyTestProfile();

		Profile profile = defineProfileByAntBuild(uri,
			ProfileAntLocationKind.PROFILESET_ELEMENT, getTestOptions());

		assertTestOptions(profile);
	}

	public void testAntBuildNoProfileSpecified() {
		try {
			defineProfileByAntBuild(null,
				ProfileAntLocationKind.PROFILE_ATTRIBUTE, getTestOptions());
			fail("And build should have failed.");
		} catch (RuntimeException e) {
			assertEquals("Unexpected exception: " + e.getLocalizedMessage(),
				BuildException.class.getName(), e.getClass().getName());
		}
	}

	public void testAntBuildProfileElementMissingFile() {
		try {
			defineProfileByAntBuild(null,
				ProfileAntLocationKind.PROFILE_ELEMENT, getTestOptions());
			fail("And build should have failed.");
		} catch (RuntimeException e) {
			assertEquals("Unexpected exception: " + e.getLocalizedMessage(),
				BuildException.class.getName(), e.getClass().getName());
		}
	}

	public void testAntBuildProfileSetSelectsNothing() {
		try {
			defineProfileByAntBuild(null,
				ProfileAntLocationKind.PROFILESET_ELEMENT, getTestOptions());
			fail("And build should have failed.");
		} catch (RuntimeException e) {
			assertEquals("Unexpected exception: " + e.getLocalizedMessage(),
				BuildException.class.getName(), e.getClass().getName());
		}
	}

	//
	// Test framework
	//

	@Override
	protected void setUp()
			throws Exception {

		rset = new ResourceSetImpl();
		if (StandaloneSupport.isStandalone()) {
			StandaloneSupport.init(rset);
		}

		// create a temporary file and convert it to a directory
		tempDir = File.createTempFile(getName(), ".tmp");
		tempDir.delete();
		tempDir.mkdir();
	}

	@Override
	protected void tearDown()
			throws Exception {

		rmdir(tempDir);

		// clean up the CacheAdapter as well as we can
		for (Resource next : rset.getResources()) {
			next.unload();
			next.eAdapters().clear();
		}

		rset.getResources().clear();
		rset.eAdapters().clear();
	}

	static void rmdir(File directory) {
		for (File next : directory.listFiles()) {
			if (next.isDirectory()) {
				rmdir(next);
			} else {
				next.delete();
			}
		}

		directory.delete();
	}

	Profile defineProfileByAntBuild(URI profileURI,
			ProfileAntLocationKind antLocationKind, Map<String, String> options) {

		AntRunner runner = new AntRunner();

		try {
			runner.setBuildFileLocation(createAntBuildFile(profileURI,
				antLocationKind, options).getAbsolutePath());
			runner.run();
		} catch (CoreException e) {
			Throwable cause = unwrap(e);

			// the BuildException class is loaded in a distinct class loader by
			// the AntRunner, so we cannot do an instanceof check here
			if (cause.getClass().getName()
				.equals(BuildException.class.getName())) {
				// RuntimeException class is loaded by the bootstrap
				// classloader, so this is OK
				throw (RuntimeException) cause;
			}

			e.printStackTrace();
			fail("Failed to run Ant build: " + e.getLocalizedMessage());
		} catch (Exception e) {
			e.printStackTrace();
			fail("Failed to run Ant build: " + e.getLocalizedMessage());
		}

		return (Profile) UML2Util.load(rset, profileURI,
			UMLPackage.Literals.PROFILE);
	}

	Throwable unwrap(CoreException e) {
		Throwable result = null;
		Throwable cause = e.getCause();

		if ((cause != null) && (cause != e)) {
			result = cause;

			while (result instanceof InvocationTargetException) {
				result = ((InvocationTargetException) result)
					.getTargetException();
			}
		} else {
			result = e;
		}

		return result;
	}

	File createAntBuildFile(URI profileURI,
			ProfileAntLocationKind antLocationKind, Map<String, String> options)
			throws IOException {

		if (options == null) {
			options = Collections.emptyMap();
		}

		File result = new File(tempDir, "build.xml");
		PrintWriter writer = null;

		try {
			writer = new PrintWriter(result);
			writer
				.println("<project name=\"define.profiles\" default=\"define\">");
			writer
				.println("   <property name=\"profiles.base\" location=\".\"/>");

			if (antLocationKind == ProfileAntLocationKind.PROFILESET_ELEMENT) {
				writer
					.println("   <fileset dir=\"${profiles.base}\" id=\"profiles.to.define\">");
				if (profileURI != null) {
					writer.println("      <include name=\"*.profile.uml\"/>");
				} else {
					// this won't match anything
					writer.println("      <include name=\"*.bogus\"/>");
				}
				writer.println("   </fileset>");
			}

			writer
				.println("   <target name=\"define\" description=\"Define our profiles\">");

			switch (antLocationKind) {
				case PROFILE_ATTRIBUTE :
					if (profileURI != null) {
						writer
							.printf(
								"      <uml2.defineProfile profile=\"${profiles.base}/%s\">%n",
								profileURI.lastSegment());
					} else {
						writer.println("      <uml2.defineProfile>");
					}
					break;
				case PROFILE_ELEMENT :
					writer.println("      <uml2.defineProfile>");
					if (profileURI != null) {
						writer
							.printf(
								"         <profile file=\"${profiles.base}/%s\"/>%n",
								profileURI.lastSegment());
					} else {
						writer.println("         <profile/>");
					}
					break;
				case PROFILESET_ELEMENT :
					writer.println("      <uml2.defineProfile>");
					writer
						.println("         <profileset refid=\"profiles.to.define\"/>");
					break;
			}

			for (Map.Entry<String, String> option : options.entrySet()) {
				writer.printf("         <arg line=\"-%s %s\"/>%n",
					option.getKey(), option.getValue());
			}
			writer.println("      </uml2.defineProfile>");
			writer.println("   </target>");
			writer.println("</project>");
		} finally {
			if (writer != null) {
				try {
					writer.close();
				} catch (Exception e) {
					e.printStackTrace();
					fail("Failed to close Ant build file: "
						+ e.getLocalizedMessage());
				}
			}
		}

		return result;
	}

	URI copyTestProfile() {
		final String resourceName = getClass().getSimpleName() + ".profile.uml";
		URL url = getClass().getResource(resourceName);
		File result = new File(tempDir, resourceName);
		InputStream input = null;
		OutputStream output = null;
		ReadableByteChannel inChan = null;
		WritableByteChannel outChan = null;

		try {
			ByteBuffer buf = ByteBuffer.allocate(2048);
			input = url.openStream();
			output = new FileOutputStream(result);
			inChan = Channels.newChannel(input);
			outChan = Channels.newChannel(output);

			for (int read = inChan.read(buf); read >= 0; read = inChan
				.read(buf)) {

				buf.flip();

				for (int written = outChan.write(buf); written < read;) {
					written += outChan.write(buf);
				}

				buf.flip();
			}
		} catch (IOException e) {
			e.printStackTrace();
			fail("Failed to read resource or write temporary file: "
				+ e.getLocalizedMessage());
		} finally {
			if (outChan != null) {
				try {
					outChan.close();
				} catch (Exception e) {
					e.printStackTrace();
					fail("Failed to close temporary file: "
						+ e.getLocalizedMessage());
				}
			}
			if (inChan != null) {
				try {
					inChan.close();
				} catch (Exception e) {
					e.printStackTrace();
					fail("Failed to close resource: " + e.getLocalizedMessage());
				}
			}
		}

		return URI.createFileURI(result.getAbsolutePath());
	}

	Map<String, String> options(String option, String value, String... more) {
		Map<String, String> result = new HashMap<String, String>();

		result.put(option, value);

		for (int i = 0; i < more.length;) {
			option = more[i++];
			value = more[i++];
			result.put(option, value);
		}

		return result;
	}

	EClass getEClass(Profile profile, String name) {
		return getEClassifier(profile, name, EClass.class);
	}

	EDataType getEDataType(Profile profile, String name) {
		return getEClassifier(profile, name, EDataType.class);
	}

	<T extends EClassifier> T getEClassifier(Profile profile, String name,
			Class<T> metaclass) {

		EClassifier result = profile.getDefinition().getEClassifier(name);
		assertTrue(metaclass.isInstance(result));
		return metaclass.cast(result);
	}

	EOperation getEOperation(EClass eClass, String name) {
		for (EOperation eOperation : eClass.getEOperations()) {
			if (name.equals(eOperation.getName())) {
				return eOperation;
			}
		}

		fail("EOperation not found: " + name);
		return null; // unreachable
	}

	void assertEcoreAnnotation(EModelElement element, String key, String value) {
		assertAnnotation(element, ECORE_ANNOTATION_URI, key, value);
	}

	void assertOCLAnnotation(EModelElement element, String key, String value) {
		assertAnnotation(element, OCL_ANNOTATION_URI, key, value);
	}

	void assertAnnotation(EModelElement element, String source, String key,
			String value) {

		String annotation = EcoreUtil.getAnnotation(element, source, key);
		assertNotNull("Annotation key not found", annotation);
		assertTrue(Pattern
			.compile(
				String.format("(?:^|\\s)%s(?:$|\\s)", Pattern.quote(value)))
			.matcher(annotation).find());
	}

	void assertNoAnnotation(EModelElement element, String source, String key) {
		String annotation = EcoreUtil.getAnnotation(element, source, key);
		assertNull("Found annotation key", annotation);
	}

	void assertHasValidationOperations(EClass eclass) {
		for (EOperation operation : eclass.getEOperations()) {
			for (EParameter parameter : operation.getEParameters()) {
				if (parameter.getEType() == EcorePackage.Literals.EDIAGNOSTIC_CHAIN) {
					// success
					return;
				}
			}
		}

		fail("Did not find a validation operation");
	}

	void assertNoValidationOperations(EClass eclass) {
		for (EOperation operation : eclass.getEOperations()) {
			for (EParameter parameter : operation.getEParameters()) {
				assertNotSame(EcorePackage.Literals.EDIAGNOSTIC_CHAIN,
					parameter.getEType());
			}
		}
	}

	//
	// Nested types
	//

	enum ProfileAntLocationKind {
		PROFILE_ATTRIBUTE, PROFILE_ELEMENT, PROFILESET_ELEMENT;
	}
}
