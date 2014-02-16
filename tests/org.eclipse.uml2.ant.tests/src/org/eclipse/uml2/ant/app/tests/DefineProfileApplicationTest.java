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
package org.eclipse.uml2.ant.app.tests;

import static org.eclipse.uml2.uml.util.UMLUtil.UML2EcoreConverter.*;
import static org.eclipse.uml2.uml.util.UMLUtil.*;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.Diagnostic;
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
import org.eclipse.uml2.ant.app.DefineProfileApplication;
import org.eclipse.uml2.ant.app.IDiagnosticReporter;
import org.eclipse.uml2.common.util.UML2Util;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.tests.util.StandaloneSupport;

/**
 * Tests the profile definition application.
 * 
 * @see https://bugs.eclipse.org/bugs/show_bug.cgi?id=286404
 */
public class DefineProfileApplicationTest
		extends TestCase {

	private static final String ECORE_ANNOTATION_URI = "http://www.eclipse.org/emf/2002/Ecore";

	private static final String OCL_ANNOTATION_URI = ECORE_ANNOTATION_URI
		+ "/OCL";

	private File tempDir;

	private ResourceSet rset;

	public DefineProfileApplicationTest() {
		super();
	}

	public DefineProfileApplicationTest(String name) {
		super(name);
	}

	public static Test suite() {
		return new TestSuite(DefineProfileApplicationTest.class,
			"DefineProfileApplication tests"); //$NON-NLS-1$
	}

	public void testApplicationDefaultOptions() {
		Profile profile = defineProfileByApplication(null,
			new ValidatingReporter().assertDiagnostic(UNTYPED_PROPERTY,
				Diagnostic.ERROR));

		assertDefaultOptions(profile);
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

	public void testApplicationWithOptions() {
		Profile profile = defineProfileByApplication(getTestOptions(),
			new ValidatingReporter().assertNotDiagnostic(UNTYPED_PROPERTY,
				Diagnostic.ERROR));

		assertTestOptions(profile);
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

	Profile defineProfileByApplication(Map<String, String> options,
			IDiagnosticReporter reporter) {

		URI uri = copyTestProfile();

		if (options == null) {
			options = Collections.emptyMap();
		}

		List<String> args = new java.util.ArrayList<String>(
			options.size() * 2 + 1);
		args.add(uri.toFileString());
		for (Map.Entry<String, String> option : options.entrySet()) {
			args.add("-" + option.getKey());
			args.add(option.getValue());
		}

		try {
			new DefineProfileApplication(reporter).run(
				new NullProgressMonitor(),
				args.toArray(new String[args.size()]));
		} catch (Exception e) {
			e.printStackTrace();
			fail("Exception in profile definition application: "
				+ e.getLocalizedMessage());
		}

		if (reporter instanceof ValidatingReporter) {
			((ValidatingReporter) reporter).assertDiagnostics();
		}

		return (Profile) UML2Util.load(rset, uri, UMLPackage.Literals.PROFILE);
	}

	URI copyTestProfile() {
		URL url = getClass().getResource(
			"DefineProfileApplicationTest.profile.uml");
		File result = new File(tempDir,
			"DefineProfileApplicationTest.profile.uml");
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

	static class ValidatingReporter
			implements IDiagnosticReporter {

		private final Map<Integer, Integer> assertions = new java.util.HashMap<Integer, Integer>();

		private final Map<Integer, Integer> failedNegatives = new java.util.HashMap<Integer, Integer>();

		ValidatingReporter assertDiagnostic(int code, int severity) {
			assertions.put(code, severity);
			return this;
		}

		ValidatingReporter assertNotDiagnostic(int code, int severity) {
			assertions.put(-code, severity);
			return this;
		}

		public void report(Diagnostic diagnostic) {
			Integer code = diagnostic.getCode();
			Integer expectedSeverity = assertions.get(code);

			if ((expectedSeverity != null)
				&& (expectedSeverity.intValue() == diagnostic.getSeverity())) {

				assertions.remove(code);
			}

			code = -diagnostic.getCode();
			expectedSeverity = assertions.get(code);

			if ((expectedSeverity != null)
				&& (expectedSeverity.intValue() == diagnostic.getSeverity())) {

				assertions.remove(code);
				failedNegatives.put(diagnostic.getCode(), expectedSeverity);
			}

			if (!diagnostic.getChildren().isEmpty()) {
				for (Diagnostic child : diagnostic.getChildren()) {
					report(child);
				}
			}
		}

		void assertDiagnostics() {
			// remove negative assertions, which are successes if they remain
			for (Iterator<Integer> iter = assertions.keySet().iterator(); iter
				.hasNext();) {
				if (iter.next().intValue() < 0) {
					iter.remove();
				}
			}

			if (!assertions.isEmpty()) {
				fail("Not all expected diagnostics were reported: "
					+ assertions);
			}

			if (!failedNegatives.isEmpty()) {
				fail("Some diagnostics were reported that should not have been: "
					+ failedNegatives);
			}
		}
	}
}
