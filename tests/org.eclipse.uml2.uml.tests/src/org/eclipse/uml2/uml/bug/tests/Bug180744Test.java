/*
 * Copyright (c) 2013, 2015 CEA and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Christian W. Damus (CEA) - initial API and implementation
 *   Kenn Hussey (CEA) - 458906
 *
 */
package org.eclipse.uml2.uml.bug.tests;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.uml2.common.util.UML2Util;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.AttributeOwner;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.InstanceValue;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.OperationOwner;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.TemplateableElement;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.tests.util.StandaloneSupport;
import org.eclipse.uml2.uml.util.UMLUtil;
import org.eclipse.uml2.uml.util.UMLValidator;
import org.eclipse.uml2.uml.util.UMLUtil.PackageMerger;
import org.eclipse.uml2.uml.util.UMLUtil.TemplateExpander;

/**
 * Tests the template expander utility.
 * 
 * @see https://bugs.eclipse.org/bugs/show_bug.cgi?id=180744
 */
public class Bug180744Test
		extends TestCase {

	private ResourceSet rset;

	private Package fixture;

	public Bug180744Test() {
		super();
	}

	public Bug180744Test(String name) {
		super(name);
	}

	public static Test suite() {
		return new TestSuite(Bug180744Test.class, "Bug 180744 tests"); //$NON-NLS-1$
	}

	/**
	 * Verify a classifier with a single template binding having all parameters
	 * explicitly substituted.
	 */
	public void testClassifierSingleBindingExplicit() {
		Class listOfBars = expand(getClass("ListOfBars"));

		assertCollectionKind(listOfBars, "sequence");
		assertOperation(listOfBars, "add", "element", getClass("Bar"));
	}

	/**
	 * Verify a classifier with a single template binding having a defaulted
	 * parameter.
	 */
	public void testClassifierSingleBindingWithDefault() {
		Class bagOfFoos = expand(getClass("BagOfFoos"));

		assertCollectionKind(bagOfFoos, "bag"); // default enum literal sub
		assertOperation(bagOfFoos, "remove", "element", getClass("Foo"));
	}

	/**
	 * Verify a classifier that has multiple bindings (to the same template, no
	 * less!).
	 */
	public void testClassifierMultipleBindings() {
		Class bagListOfFooBars = expand(getClass("BagListOfFooBars"));

		// multiple bindings generate an anonymous superclass each, so these
		// features are not owned but inherited

		assertTrue(bagListOfFooBars.getOwnedAttributes().isEmpty());
		assertTrue(bagListOfFooBars.getOwnedOperations().isEmpty());
		assertEquals(2, bagListOfFooBars.getGeneralizations().size());

		Class general1 = (Class) bagListOfFooBars.getGeneralizations().get(0)
			.getGeneral();
		Class general2 = (Class) bagListOfFooBars.getGeneralizations().get(1)
			.getGeneral();

		assertCollectionKind(general1, "sequence");
		assertOperation(general1, "add", "element", getClass("Bar"));

		assertCollectionKind(general2, "bag"); // default enum literal sub
		assertOperation(general2, "remove", "element", getClass("Foo"));
	}

	/**
	 * Verify a package that has a single binding with actual parameters that
	 * are owned classes and defaulted name-expression parameters.
	 */
	public void testPackageSingleBindingWithOwnedActualParametersAndDefaultNameParts() {
		Package rentalSystem = expand(getPackage("rental system"));

		Class car = getClass(rentalSystem, "Car");
		Class carSpec = getClass(rentalSystem, "CarSpec");

		assertProperty(car, "kind", carSpec);
		assertProperty(car, "mileage", "Integer"); // not from the template

		assertProperty(carSpec, "resource", car);
		assertProperty(carSpec, "model", "String"); // not from the template

		// the default name-expression part is an empty string replacing
		// the '${ResourceKind}' part in '${ResourceKind}Allocation' and
		// '${ResourceKind}Request'
		Class allocation = getClass(rentalSystem, "Allocation");
		Class request = getClass(rentalSystem, "Request");

		assertProperty(allocation, "resource", car);
		assertProperty(request, "kind", carSpec);

		// the anonymous associations are not all merged together
		assertAssociation(rentalSystem, car, carSpec);
		assertAssociation(rentalSystem, allocation, car);
		assertAssociation(rentalSystem, request, carSpec);
	}

	/**
	 * Verify a package that has multiple bindings to the same template, using
	 * name expressions to ensure that classes substituting for template
	 * parameters are expanded with distinct names so that they are not merged
	 * together.
	 */
	public void testPackageMultipleBindingWithNameExpressionsHavingDistinctSubstitutions() {
		Package deploymentSystem = expand(getPackage("deployment system"));

		Class softwarePackage = getClass(deploymentSystem, "SoftwarePackage");
		Class softwareSpec = getClass(deploymentSystem, "SoftwareSpec");

		assertProperty(softwarePackage, "kind", softwareSpec);
		assertProperty(softwarePackage, "id", "Integer"); // not from the
															// template

		assertProperty(softwareSpec, "resource", softwarePackage);
		assertProperty(softwareSpec, "version", "String"); // not from the
															// template

		// the actual name-expression part is 'Software' replacing
		// the '${ResourceKind}' part in '${ResourceKind}Allocation' and
		// '${ResourceKind}Request'
		Class softwareAllocation = getClass(deploymentSystem,
			"SoftwareAllocation");
		Class softwareRequest = getClass(deploymentSystem, "SoftwareRequest");

		assertProperty(softwareAllocation, "resource", softwarePackage);
		assertProperty(softwareRequest, "kind", softwareSpec);

		// the anonymous associations are not all merged together
		assertAssociation(deploymentSystem, softwarePackage, softwareSpec);
		assertAssociation(deploymentSystem, softwareAllocation, softwarePackage);
		assertAssociation(deploymentSystem, softwareRequest, softwareSpec);

		Class hardwareComponent = getClass(deploymentSystem,
			"HardwareComponent");
		Class hardwareSpec = getClass(deploymentSystem, "HardwareSpec");

		assertProperty(hardwareComponent, "kind", hardwareSpec);
		assertProperty(hardwareComponent, "id", "Integer"); // not from the
															// template

		assertProperty(hardwareSpec, "resource", hardwareComponent);
		assertProperty(hardwareSpec, "deviceName", "String"); // not from the
																// template

		// the actual name-expression part is 'Hardware' replacing
		// the '${ResourceKind}' part in '${ResourceKind}Allocation' and
		// '${ResourceKind}Request'
		Class hardwareAllocation = getClass(deploymentSystem,
			"HardwareAllocation");
		Class hardwareRequest = getClass(deploymentSystem, "HardwareRequest");

		assertProperty(hardwareAllocation, "resource", hardwareComponent);
		assertProperty(hardwareRequest, "kind", hardwareSpec);

		// the anonymous associations are not all merged together
		assertAssociation(deploymentSystem, hardwareComponent, hardwareSpec);
		assertAssociation(deploymentSystem, hardwareAllocation,
			hardwareComponent);
		assertAssociation(deploymentSystem, hardwareRequest, hardwareSpec);
	}

	/**
	 * Verifies that stereotype applications are copied from templates to the
	 * bound elements.
	 */
	public void testStereotypesOnTemplates() {
		Package rentalSystem = getPackage("rental system");

		Class originalCar = getClass(rentalSystem, "Car");
		assertEquals(0, originalCar.getAppliedStereotypes().size());

		expand(rentalSystem);

		Class car = getClass(rentalSystem, "Car");

		assertSame(originalCar, car); // the class hasn't been replaced

		assertEquals(1, car.getAppliedStereotypes().size());
		assertEquals("Limited", car.getAppliedStereotypes().get(0).getName());
	}

	public void testMissingParameterSubstitutions() {
		BasicDiagnostic diagnostic = new BasicDiagnostic();

		Class badCollection = expand(getClass("BadCollection"), diagnostic);

		// default enum literal substitution
		assertCollectionKind(badCollection, "bag");

		// contents are copied, but with the unsubstituted template parameter
		Class template = getClass("Collection");
		Classifier parameterE = (Classifier) template
			.getOwnedTemplateSignature().getParameters().get(0)
			.getOwnedParameteredElement();
		assertOperation(badCollection, "remove", "element", parameterE);

		// but there was no substitution for E
		assertDiagnostic(diagnostic,
			TemplateExpander.MISSING_PARAMETER_SUBSTITUTION);
	}

	public void testUsualMergeCapabilityTracesPackage() {
		Package rentalSystem = expand(getPackage("rental system"));

		Package system = getPackage("system");

		// a parametered element
		Class car = getClass(rentalSystem, "Car");
		assertCapabilityTrace(rentalSystem, system, car);

		// not a parametered element
		Class request = getClass(rentalSystem, "Request");
		assertCapabilityTrace(rentalSystem, system, request);
	}

	public void testUsualMergeCapabilityTracesClassifier() {
		Class listOfBars = expand(getClass("ListOfBars"));
		Class collection = getClass("Collection");

		Operation remove = getOperation(listOfBars, "remove");
		assertCapabilityTrace(listOfBars, collection, remove);
	}

	public void testMergeCapabilityTracesClassifierMultipleBindings() {
		Class bagListOfFooBars = expand(getClass("BagListOfFooBars"));
		Class general1 = (Class) bagListOfFooBars.getNestedClassifiers().get(0);
		Class general2 = (Class) bagListOfFooBars.getNestedClassifiers().get(1);
		Class collection = getClass("Collection");

		// the traces are in the expanded template that owns the nested
		// anonymous superclasses
		Operation remove = getOperation(general1, "remove");
		assertCapabilityTrace(bagListOfFooBars, collection, remove);
		Property kind = getProperty(general2, "kind");
		assertCapabilityTrace(bagListOfFooBars, collection, kind);
	}

	public void testMergeCapabilityTracesPackageMultipleBindings() {
		Package deploymentSystem = expand(getPackage("deployment system"));
		Package system = getPackage("system");

		// a class defined in the bound template that substitutes for a
		// parameter in the template
		Class softwareSpec = (Class) deploymentSystem
			.getOwnedType("SoftwareSpec");

		// a class defined solely in the template and merged into the bound
		// template
		Class hardwareRequest = (Class) deploymentSystem
			.getOwnedType("HardwareRequest");

		assertCapabilityTrace(deploymentSystem, system, softwareSpec);
		assertCapabilityTrace(deploymentSystem, system, hardwareRequest);
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

	Class getClass(String name) {
		return getClass(fixture, name);
	}

	Class getClass(Package package_, String name) {
		return (Class) package_.getOwnedType(name);
	}

	Package getPackage(String name) {
		return fixture.getNestedPackage(name);
	}

	Package getTestModel() {
		URL url = getClass().getResource("Bug180744.uml"); //$NON-NLS-1$
		return (Package) UML2Util.load(rset,
			URI.createURI(url.toExternalForm()), UMLPackage.Literals.PACKAGE);
	}

	Property getProperty(AttributeOwner owner, String name) {
		return owner.getOwnedAttribute(name, null);
	}

	Operation getOperation(OperationOwner owner, String name) {
		return owner.getOwnedOperation(name, null, null);
	}

	<T extends TemplateableElement> T expand(T boundElement) {
		assertFalse(boundElement.getTemplateBindings().isEmpty());

		Map<String, String> options = new HashMap<String, String>();
		options
			.put(PackageMerger.OPTION__CAPABILITIES, UMLUtil.OPTION__PROCESS);

		UMLUtil.expand(boundElement, options);

		assertExpanded(boundElement);

		return boundElement;
	}

	<T extends TemplateableElement> T expand(T boundElement,
			DiagnosticChain diagnostics) {
		assertFalse(boundElement.getTemplateBindings().isEmpty());

		Map<String, String> options = new HashMap<String, String>();
		options
			.put(PackageMerger.OPTION__CAPABILITIES, UMLUtil.OPTION__PROCESS);
		options.put(TemplateExpander.OPTION__MISSING_PARAMETER_SUBSTITUTIONS,
			UMLUtil.OPTION__REPORT);

		UMLUtil.expand(boundElement, options, diagnostics, null);

		assertExpanded(boundElement);

		return boundElement;
	}

	void assertExpanded(TemplateableElement element) {
		assertEquals(0, element.getTemplateBindings().size());
	}

	void assertCollectionKind(Class collectionType, String kindLiteral) {
		Enumeration kindEnum = (Enumeration) fixture
			.getOwnedType("CollectionKind");
		EnumerationLiteral literal = kindEnum.getOwnedLiteral(kindLiteral);
		assertNotNull(literal);

		Property kind = collectionType.getOwnedAttribute("kind", kindEnum);
		assertNotNull(kind);
		assertTrue(kind.isStatic());
		assertTrue(kind.getDefaultValue() instanceof InstanceValue);
		assertSame(literal,
			((InstanceValue) kind.getDefaultValue()).getInstance());
	}

	void assertProperty(Class class_, String name, Type type) {
		Property property = class_.getOwnedAttribute(name, type);
		assertNotNull(property);
	}

	void assertProperty(Class class_, String name, String type) {
		Property property = class_.getOwnedAttribute(name, null);
		assertNotNull(property);
		assertNotNull(property.getType());
		assertEquals(type, property.getType().getName());
	}

	void assertOperation(Class class_, String name, String param1Name,
			Type param1Type) {
		Operation operation = class_.getOwnedOperation(name,
			ECollections.singletonEList(param1Name),
			ECollections.singletonEList(param1Type));
		assertNotNull(operation);
	}

	void assertAssociation(Package package_, Type endType1, Type endType2) {
		Association found = null;

		for (Type next : package_.getOwnedTypes()) {
			if (next instanceof Association) {
				Association association = (Association) next;

				if (association.isBinary()
					&& association.getEndTypes().contains(endType1)
					&& association.getEndTypes().contains(endType2)) {

					found = association;
					break;
				}
			}
		}

		assertNotNull(found);
	}

	void assertCapabilityTrace(Element receivingElement,
			NamedElement capability, Element capabilityElement) {

		EAnnotation annotation = receivingElement
			.getEAnnotation(UMLUtil.UML2_UML_PACKAGE_2_0_NS_URI);
		assertNotNull(annotation);

		annotation = annotation.getEAnnotation(capability.getQualifiedName()
			.replace(NamedElement.SEPARATOR, "/")); //$NON-NLS-1$
		assertNotNull(annotation);

		if (capabilityElement == null) {
			assertTrue(annotation.getReferences().contains(capabilityElement));
		}
	}

	void assertDiagnostic(Diagnostic diagnostics, int code) {
		for (Diagnostic child : diagnostics.getChildren()) {
			if (UMLValidator.DIAGNOSTIC_SOURCE.equals(child.getSource())
				&& (child.getCode() == code)) {
				// found it
				return;
			}
		}

		fail("Did not find diagnostic with code " + code);
	}
}
