/*
 * Copyright (c) 2013 CEA and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Christian W. Damus (CEA) - initial API and implementation
 */
package org.eclipse.uml2.uml.bug.tests;

import java.net.URL;
import java.util.Map;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.uml2.common.util.UML2Util;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.tests.util.StandaloneSupport;
import org.eclipse.uml2.uml.util.UMLUtil;
import org.eclipse.uml2.uml.util.UMLUtil.UML2EcoreConverter;
import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * Test suite for the changes introduced for Bug 409396.
 * 
 * @see https://bugs.eclipse.org/bugs/show_bug.cgi?id=409396
 */
public class Bug409396Test
		extends TestCase {

	private ResourceSet rset;

	private Package model;

	/**
	 * Initializes me with my name.
	 * 
	 * @param name
	 *            my name
	 */
	public Bug409396Test(String name) {
		super(name);
	}

	public static Test suite() {
		return new TestSuite(Bug409396Test.class, "Bug 409396 tests"); //$NON-NLS-1$
	}

	public void testConvertWithDefaultType() {
		BasicDiagnostic diagnostics = new BasicDiagnostic();
		EPackage ePackage = convertModel(UMLUtil.OPTION__PROCESS, diagnostics);
		EStructuralFeature feature = getUntypedFeature(ePackage);
		assertTrue("Feature not a reference", feature instanceof EReference);
		assertSame(EcorePackage.Literals.EOBJECT, feature.getEType());
		assertProblem(Diagnostic.INFO, diagnostics);
	}

	public void testConvertWithReporting() {
		BasicDiagnostic diagnostics = new BasicDiagnostic();
		EPackage ePackage = convertModel(UMLUtil.OPTION__REPORT, diagnostics);
		EStructuralFeature feature = getUntypedFeature(ePackage);
		assertNotNull("Feature not converted", feature);
		assertNull("Feature has a type", feature.getEType());
		assertProblem(Diagnostic.ERROR, diagnostics);
	}

	public void testConvertWithDiscard() {
		BasicDiagnostic diagnostics = new BasicDiagnostic();
		EPackage ePackage = convertModel(UMLUtil.OPTION__DISCARD, diagnostics);
		EStructuralFeature feature = getUntypedFeature(ePackage);
		assertNull("Feature was converted", feature);
		assertProblem(Diagnostic.WARNING, diagnostics);
	}

	public void testConvertWithIgnore() {
		BasicDiagnostic diagnostics = new BasicDiagnostic();
		EPackage ePackage = convertModel(UMLUtil.OPTION__IGNORE, diagnostics);
		EStructuralFeature feature = getUntypedFeature(ePackage);
		assertNotNull("Feature not converted", feature);
		assertNull("Feature has a type", feature.getEType());
		assertNoProblem(diagnostics);
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

		model = getTestModel();
	}

	@Override
	protected void tearDown()
			throws Exception {

		model = null;

		for (Resource next : rset.getResources()) {
			next.unload();
		}

		rset.getResources().clear();
		rset.eAdapters().clear();
		rset = null;
	}

	Package getTestModel() {
		URL url = getClass().getResource("Bug409396.uml"); //$NON-NLS-1$
		return (Package) UML2Util.load(rset,
			URI.createURI(url.toExternalForm()), UMLPackage.Literals.PACKAGE);
	}

	EPackage convertModel(String action, DiagnosticChain diagnostics) {
		Map<String, String> options = new java.util.HashMap<String, String>();
		options.put(UML2EcoreConverter.OPTION__UNTYPED_PROPERTIES, action);
		return UMLUtil.convertToEcore(model, options, diagnostics, null)
			.iterator().next();
	}

	EStructuralFeature getUntypedFeature(EPackage ePackage) {
		return ((EClass) ePackage.getEClassifier("MyClass"))
			.getEStructuralFeature("untyped");
	}

	void assertProblem(int severity, Diagnostic diagnostic) {
		Diagnostic found = null;

		for (Diagnostic next : diagnostic.getChildren()) {
			if (UMLValidator.DIAGNOSTIC_SOURCE.equals(next.getSource())
				&& (next.getCode() == UML2EcoreConverter.UNTYPED_PROPERTY)) {

				found = next;
				break;
			}
		}

		assertNotNull("Did not find diagnostic", found);
		assertEquals(severity, found.getSeverity());
	}

	void assertNoProblem(Diagnostic diagnostic) {
		Diagnostic found = null;

		for (Diagnostic next : diagnostic.getChildren()) {
			if (UMLValidator.DIAGNOSTIC_SOURCE.equals(next.getSource())
				&& (next.getCode() == UML2EcoreConverter.UNTYPED_PROPERTY)) {

				found = next;
				break;
			}
		}

		assertNull("Found the diagnostic", found);
	}
}
