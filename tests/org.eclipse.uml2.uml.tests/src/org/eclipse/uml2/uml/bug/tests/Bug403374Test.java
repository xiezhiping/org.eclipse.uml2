/*
 * Copyright (c) 2013 CEA and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Christian W. Damus (CEA) - initial API and implementation
 *
 */
package org.eclipse.uml2.uml.bug.tests;

import java.net.URL;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.common.util.UML2Util;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.tests.util.StandaloneSupport;
import org.eclipse.uml2.uml.util.UMLUtil;

/**
 * Tests the support for non-API constraints in classifiers that convert to
 * Ecore EClasses.
 * 
 * @see https://bugs.eclipse.org/bugs/show_bug.cgi?id=403374
 */
public class Bug403374Test
		extends TestCase {

	private static final String ECORE_ANNOTATION_URI = "http://www.eclipse.org/emf/2002/Ecore";

	private static final String OCL_ANNOTATION_URI = ECORE_ANNOTATION_URI
		+ "/OCL";

	private ResourceSet rset;

	private Package fixture;

	public Bug403374Test() {
		super();
	}

	public Bug403374Test(String name) {
		super(name);
	}

	public static Test suite() {
		return new TestSuite(Bug403374Test.class, "Bug 403374 tests"); //$NON-NLS-1$
	}

	public void testEClassNonAPIInvariants() {
		EPackage ePackage = convert();

		EClass employee = getEClass(ePackage, "Employee");
		assertEcoreAnnotation(employee, "constraints", "emp_id");
		assertOCLAnnotation(employee, "emp_id", "self.id > 0");
		assertNoValidationOperations(employee);
	}

	public void testEClassWithoutNonAPIInvariants() {
		EPackage ePackage = convert(false);

		EClass employee = getEClass(ePackage, "Employee");
		assertNoAnnotation(employee, ECORE_ANNOTATION_URI, "constraints");
		assertHasValidationOperations(employee);
	}

	public void testEDataTypeNonAPIInvariant() {
		EPackage ePackage = convert();

		EDataType ssn = getEDataType(ePackage, "SSN");
		assertEcoreAnnotation(ssn, "constraints", "ssn_syntax");
		assertOCLAnnotation(ssn, "ssn_syntax",
			"self.toString().matches('\\d{3}-\\d{3}-\\d{3}')");
	}

	public void testOperationBody() {
		EPackage ePackage = convert();

		EClass employee = getEClass(ePackage, "Employee");
		EOperation allReports = getEOperation(employee, "allReports");
		assertOCLAnnotation(allReports, "body",
			"self.directReports->closure(directReports)");
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

		fixture = getTestModel();
	}

	@Override
	protected void tearDown()
			throws Exception {

		fixture = null;

		// clean up the CacheAdapter as well as we can
		for (Resource next : rset.getResources()) {
			next.unload();
			next.eAdapters().clear();
		}

		rset.getResources().clear();
		rset.eAdapters().clear();
	}

	Package getTestModel() {
		URL url = getClass().getResource("Bug403374.uml"); //$NON-NLS-1$
		return (Package) UML2Util.load(rset,
			URI.createURI(url.toExternalForm()), UMLPackage.Literals.PACKAGE);
	}

	EPackage convert() {
		return convert(fixture);
	}

	EPackage convert(boolean nonAPIInvariants) {
		return convert(fixture, nonAPIInvariants);
	}

	EPackage convert(Package package_) {
		return convert(package_, true);
	}

	EPackage convert(Package package_, boolean nonAPIInvariants) {
		Map<String, String> options = new HashMap<String, String>();
		options.put(UMLUtil.UML2EcoreConverter.OPTION__INVARIANT_CONSTRAINTS,
			UMLUtil.OPTION__PROCESS);
		options.put(UMLUtil.UML2EcoreConverter.OPTION__VALIDATION_DELEGATES,
			UMLUtil.OPTION__PROCESS);
		options.put(UMLUtil.UML2EcoreConverter.OPTION__OPERATION_BODIES,
			UMLUtil.OPTION__PROCESS);
		options.put(UMLUtil.UML2EcoreConverter.OPTION__INVOCATION_DELEGATES,
			UMLUtil.OPTION__PROCESS);

		if (nonAPIInvariants) {
			options.put(UMLUtil.UML2EcoreConverter.OPTION__NON_API_INVARIANTS,
				UMLUtil.OPTION__PROCESS);
		}

		Collection<EPackage> ecores = UMLUtil.convertToEcore(package_, options);

		assertNotNull(ecores);
		assertTrue(ecores.size() > 0);

		EPackage result = ecores.iterator().next();
		assertEquals("employee", result.getName());

		if (nonAPIInvariants) {
			assertEcoreAnnotation(result, "validationDelegates",
				OCL_ANNOTATION_URI);
		}
		assertEcoreAnnotation(result, "invocationDelegates", OCL_ANNOTATION_URI);

		return result;
	}

	EClass getEClass(EPackage ePackage, String name) {
		return getEClassifier(ePackage, name, EClass.class);
	}

	EDataType getEDataType(EPackage ePackage, String name) {
		return getEClassifier(ePackage, name, EDataType.class);
	}

	<T extends EClassifier> T getEClassifier(EPackage ePackage, String name,
			Class<T> metaclass) {
		EClassifier result = ePackage.getEClassifier(name);
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

		fail("Did not find a valiation operation");
	}

	void assertNoValidationOperations(EClass eclass) {
		for (EOperation operation : eclass.getEOperations()) {
			for (EParameter parameter : operation.getEParameters()) {
				assertNotSame(EcorePackage.Literals.EDIAGNOSTIC_CHAIN,
					parameter.getEType());
			}
		}
	}

}
