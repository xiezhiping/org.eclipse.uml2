/*
 * Copyright (c) 2003, 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: StereotypeOperationsTest.java,v 1.10 2005/05/25 17:23:22 khussey Exp $
 */
package org.eclipse.uml2.internal.operation.tests;

import java.util.Iterator;
import java.util.List;

import junit.textui.TestRunner;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.uml2.AggregationKind;
import org.eclipse.uml2.Association;
import org.eclipse.uml2.Component;
import org.eclipse.uml2.Enumeration;
import org.eclipse.uml2.EnumerationLiteral;
import org.eclipse.uml2.Extension;
import org.eclipse.uml2.ExtensionEnd;
import org.eclipse.uml2.InstanceValue;
import org.eclipse.uml2.Interface;
import org.eclipse.uml2.MultiplicityElement;
import org.eclipse.uml2.NamedElement;
import org.eclipse.uml2.PackageImport;
import org.eclipse.uml2.PrimitiveType;
import org.eclipse.uml2.Profile;
import org.eclipse.uml2.ProfileApplication;
import org.eclipse.uml2.Property;
import org.eclipse.uml2.Stereotype;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.internal.operation.ProfileOperations;
import org.eclipse.uml2.internal.operation.StereotypeOperations;

/**
 * A test case for the '<em><b>Stereotype Operations</b></em>' utility.
 */
public class StereotypeOperationsTest
		extends UML2OperationsTest {

	/**
	 * The enumeration for this Stereotype Operations test case.
	 */
	protected Enumeration enumeration = null;

	public static void main(String[] args) {
		TestRunner.run(StereotypeOperationsTest.class);
	}

	/**
	 * Constructs a new Stereotype Operations test case with the given name.
	 */
	public StereotypeOperationsTest(String name) {
		super(name);
	}

	/**
	 * Returns the element for this Stereotype Operations test case.
	 */
	private Stereotype getElement() {
		return (Stereotype) element;
	}

	/**
	 * Sets the element for this Stereotype Operations test case.
	 */
	private void setEnumeration(Enumeration enumeration) {
		this.enumeration = enumeration;
	}

	/**
	 * Returns the element for this Stereotype Operations test case.
	 */
	private Enumeration getEnumeration() {
		return enumeration;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see junit.framework.TestCase#setUp()
	 */
	protected void setUp()
			throws Exception {

		Profile profile = UML2Factory.eINSTANCE.createProfile();
		profile.setName(getName());

		PackageImport metamodelReference = profile
			.createPackageImport(UML2Package.eINSTANCE.getPackageImport());
		metamodelReference.setImportedPackage(getUML2Metamodel());

		profile.getMetamodelReferences().add(metamodelReference);

		setElement(profile.createOwnedMember(UML2Package.eINSTANCE
			.getStereotype()));
		getElement().setName(getName());

		Extension extension = (Extension) profile
			.createOwnedMember(UML2Package.eINSTANCE.getExtension());

		ExtensionEnd extensionEnd = (ExtensionEnd) extension
			.createOwnedEnd(UML2Package.eINSTANCE.getExtensionEnd());
		extensionEnd
			.setName(StereotypeOperations.STEREOTYPE_EXTENSION_ROLE_PREFIX
				+ getElement().getName());
		extensionEnd.setType(getElement());

		Property stereotypeEnd = getElement().createOwnedAttribute(
			UML2Package.eINSTANCE.getProperty());
		stereotypeEnd.setAssociation(extension);
		stereotypeEnd
			.setName(StereotypeOperations.METACLASS_EXTENSION_ROLE_PREFIX
				+ UML2Package.eINSTANCE.getClass_().getName());
		stereotypeEnd.setType(getUML2Metaclass(UML2Package.eINSTANCE
			.getClass_()));

		PackageImport packageImport = profile
			.createPackageImport(UML2Package.eINSTANCE.getPackageImport());
		packageImport.setImportedPackage(getUML2PrimitiveTypesLibrary());

		profile.getPackageImports().add(packageImport);

		PrimitiveType booleanPrimitiveType = getUML2PrimitiveType("Boolean"); //$NON-NLS-1$

		Property booleanProperty = getElement().createOwnedAttribute(
			UML2Package.eINSTANCE.getProperty());
		booleanProperty.setName("boolean"); //$NON-NLS-1$
		booleanProperty.setType(booleanPrimitiveType);
		booleanProperty.setBooleanDefault(true);

		Property booleansProperty = getElement().createOwnedAttribute(
			UML2Package.eINSTANCE.getProperty());
		booleansProperty.setIsUnique(false);
		booleansProperty.setName("booleans"); //$NON-NLS-1$
		booleansProperty.setType(booleanPrimitiveType);
		booleansProperty
			.setUpperBound(MultiplicityElement.UNLIMITED_UPPER_BOUND);

		PrimitiveType integerPrimitiveType = getUML2PrimitiveType("Integer"); //$NON-NLS-1$

		Property integerProperty = getElement().createOwnedAttribute(
			UML2Package.eINSTANCE.getProperty());
		integerProperty.setName("integer"); //$NON-NLS-1$
		integerProperty.setType(integerPrimitiveType);
		integerProperty.setIntegerDefault(Integer.MIN_VALUE);

		Property integersProperty = getElement().createOwnedAttribute(
			UML2Package.eINSTANCE.getProperty());
		integersProperty.setIsUnique(false);
		integersProperty.setName("integers"); //$NON-NLS-1$
		integersProperty.setType(integerPrimitiveType);
		integersProperty
			.setUpperBound(MultiplicityElement.UNLIMITED_UPPER_BOUND);

		PrimitiveType unlimitedNaturalPrimitiveType = getUML2PrimitiveType("UnlimitedNatural"); //$NON-NLS-1$

		Property unlimitedNaturalProperty = getElement().createOwnedAttribute(
			UML2Package.eINSTANCE.getProperty());
		unlimitedNaturalProperty.setName("unlimitedNatural"); //$NON-NLS-1$
		unlimitedNaturalProperty.setType(unlimitedNaturalPrimitiveType);
		unlimitedNaturalProperty.setUnlimitedNaturalDefault(Integer.MAX_VALUE);

		Property unlimitedNaturalsProperty = getElement().createOwnedAttribute(
			UML2Package.eINSTANCE.getProperty());
		unlimitedNaturalsProperty.setIsUnique(false);
		unlimitedNaturalsProperty.setName("unlimitedNaturals"); //$NON-NLS-1$
		unlimitedNaturalsProperty.setType(unlimitedNaturalPrimitiveType);
		unlimitedNaturalsProperty
			.setUpperBound(MultiplicityElement.UNLIMITED_UPPER_BOUND);

		PrimitiveType stringPrimitiveType = getUML2PrimitiveType("String"); //$NON-NLS-1$

		Property stringProperty = getElement().createOwnedAttribute(
			UML2Package.eINSTANCE.getProperty());
		stringProperty.setName("string"); //$NON-NLS-1$
		stringProperty.setType(stringPrimitiveType);
		stringProperty.setStringDefault(""); //$NON-NLS-1$

		Property stringsProperty = getElement().createOwnedAttribute(
			UML2Package.eINSTANCE.getProperty());
		stringsProperty.setIsUnique(false);
		stringsProperty.setName("strings"); //$NON-NLS-1$
		stringsProperty.setType(stringPrimitiveType);
		stringsProperty
			.setUpperBound(MultiplicityElement.UNLIMITED_UPPER_BOUND);

		setEnumeration((Enumeration) profile
			.createOwnedMember(UML2Package.eINSTANCE.getEnumeration()));
		getEnumeration().setName(
			getName() + UML2Package.eINSTANCE.getEnumeration().getName());

		EnumerationLiteral enumerationLiteral0 = getEnumeration()
			.createOwnedLiteral();
		enumerationLiteral0.setName(getName() + ' ' + String.valueOf(0));

		EnumerationLiteral enumerationLiteral1 = getEnumeration()
			.createOwnedLiteral();
		enumerationLiteral1.setName(getName() + ' ' + String.valueOf(1));

		Property enumerationProperty = getElement().createOwnedAttribute(
			UML2Package.eINSTANCE.getProperty());
		enumerationProperty.setName("enumeration"); //$NON-NLS-1$
		enumerationProperty.setType(enumeration);

		InstanceValue enumerationDefaultValue = UML2Factory.eINSTANCE
			.createInstanceValue();
		enumerationDefaultValue.setInstance(enumerationLiteral1);
		enumerationProperty.setDefaultValue(enumerationDefaultValue);

		Property enumerationsProperty = getElement().createOwnedAttribute(
			UML2Package.eINSTANCE.getProperty());
		enumerationsProperty.setIsUnique(false);
		enumerationsProperty.setName("enumerations"); //$NON-NLS-1$
		enumerationsProperty.setType(enumeration);
		enumerationsProperty
			.setUpperBound(MultiplicityElement.UNLIMITED_UPPER_BOUND);

		org.eclipse.uml2.Class dateClass = (org.eclipse.uml2.Class) profile
			.createOwnedMember(UML2Package.eINSTANCE.getClass_());
		dateClass.setName("Date"); //$NON-NLS-1$

		Property daysProperty = dateClass
			.createOwnedAttribute(UML2Package.eINSTANCE.getProperty());
		daysProperty.setName("days"); //$NON-NLS-1$
		daysProperty.setType(unlimitedNaturalPrimitiveType);

		org.eclipse.uml2.Class timeClass = (org.eclipse.uml2.Class) profile
			.createOwnedMember(UML2Package.eINSTANCE.getClass_());
		timeClass.setName("Time"); //$NON-NLS-1$

		Property millisecondsProperty = timeClass
			.createOwnedAttribute(UML2Package.eINSTANCE.getProperty());
		millisecondsProperty.setName("milliseconds"); //$NON-NLS-1$
		millisecondsProperty.setType(unlimitedNaturalPrimitiveType);

		org.eclipse.uml2.Class timestampClass = (org.eclipse.uml2.Class) profile
			.createOwnedMember(UML2Package.eINSTANCE.getClass_());
		timestampClass.setName("Timestamp"); //$NON-NLS-1$

		Association dateAssociation = (Association) profile
			.createOwnedMember(UML2Package.eINSTANCE.getAssociation());

		Property dateAssociationEnd = dateAssociation
			.createOwnedEnd(UML2Package.eINSTANCE.getProperty());
		dateAssociationEnd.setType(timestampClass);

		Property dateProperty = timestampClass
			.createOwnedAttribute(UML2Package.eINSTANCE.getProperty());
		dateProperty.setAssociation(dateAssociation);
		dateProperty.setName("date"); //$NON-NLS-1$
		dateProperty.setType(dateClass);

		Association timeAssociation = (Association) profile
			.createOwnedMember(UML2Package.eINSTANCE.getAssociation());

		Property timeAssociationEnd = timeAssociation
			.createOwnedEnd(UML2Package.eINSTANCE.getProperty());
		timeAssociationEnd.setType(timestampClass);

		Property timeProperty = timestampClass
			.createOwnedAttribute(UML2Package.eINSTANCE.getProperty());
		timeProperty.setAssociation(timeAssociation);
		timeProperty.setName("time"); //$NON-NLS-1$
		timeProperty.setType(timeClass);

		Association timestampAssociation = (Association) profile
			.createOwnedMember(UML2Package.eINSTANCE.getAssociation());

		Property timestampAssociationEnd = timestampAssociation
			.createOwnedEnd(UML2Package.eINSTANCE.getProperty());
		timestampAssociationEnd.setType(getElement());

		Property timestampProperty = getElement().createOwnedAttribute(
			UML2Package.eINSTANCE.getProperty());
		timestampProperty.setAssociation(timestampAssociation);
		timestampProperty.setName("timestamp"); //$NON-NLS-1$
		timestampProperty.setType(timestampClass);

		Association timestampsAssociation = (Association) profile
			.createOwnedMember(UML2Package.eINSTANCE.getAssociation());

		Property timestampsAssociationEnd = timestampsAssociation
			.createOwnedEnd(UML2Package.eINSTANCE.getProperty());
		timestampsAssociationEnd.setType(getElement());

		Property timestampsProperty = getElement().createOwnedAttribute(
			UML2Package.eINSTANCE.getProperty());
		timestampsProperty.setAssociation(timestampsAssociation);
		timestampsProperty.setName("timestamps"); //$NON-NLS-1$
		timestampsProperty.setType(timestampClass);
		timestampsProperty
			.setUpperBound(MultiplicityElement.UNLIMITED_UPPER_BOUND);

		profile.createEAnnotation(
			ProfileOperations.ANNOTATION_SOURCE__ATTRIBUTES).getDetails().put(
			ProfileOperations.ANNOTATION_DETAILS_KEY__VERSION,
			String.valueOf(0));
		profile.createEAnnotation(
			ProfileOperations.ANNOTATION_SOURCE__E_PACKAGES).getContents().add(
			0, ProfileOperations.Profile2EPackageConverter.convert(profile));
	}

	protected void applyProfile(org.eclipse.uml2.Package package_,
			Profile profile) {
		ProfileApplication profileApplication = UML2Factory.eINSTANCE
			.createProfileApplication();
		profileApplication.setImportedProfile(profile);

		profileApplication.createEAnnotation(
			ProfileOperations.ANNOTATION_SOURCE__ATTRIBUTES).getDetails().put(
			ProfileOperations.ANNOTATION_DETAILS_KEY__VERSION,
			String.valueOf(profile.getVersion()));

		package_.getAppliedProfiles().add(profileApplication);
	}

	protected void setRequired(Stereotype stereotype, boolean required) {

		for (Iterator ownedAttributes = stereotype.getOwnedAttributes()
			.iterator(); ownedAttributes.hasNext();) {

			Property ownedAttribute = (Property) ownedAttributes.next();

			if (Extension.class.isInstance(ownedAttribute.getAssociation())) {
				((ExtensionEnd) ownedAttribute.getAssociation().getOwnedEnds()
					.get(0)).setLowerBound(required
					? 1
					: 0);
			}
		}
	}

	/**
	 * Tests the '
	 * {@link org.eclipse.uml2.internal.operation.StereotypeOperations#apply(org.eclipse.uml2.Stereotype, org.eclipse.uml2.Element) <em>Apply</em>}'
	 * method.
	 * 
	 * @see org.eclipse.uml2.internal.operation.StereotypeOperations#apply(org.eclipse.uml2.Stereotype,
	 *      org.eclipse.uml2.Element)
	 */
	public void testApply() {

		try {
			StereotypeOperations.apply(null, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		try {
			StereotypeOperations.apply(getElement(), null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		org.eclipse.uml2.Class class_ = UML2Factory.eINSTANCE.createClass();

		try {
			StereotypeOperations.apply(getElement(), class_);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		org.eclipse.uml2.Package package_ = UML2Factory.eINSTANCE
			.createPackage();
		package_.getOwnedMembers().add(class_);

		try {
			StereotypeOperations.apply(getElement(), class_);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		applyProfile(package_, getElement().getProfile());

		try {
			StereotypeOperations.apply(getElement(), class_);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		setRequired(getElement(), false);

		try {
			StereotypeOperations.apply(getElement(), class_);
		} catch (IllegalArgumentException iae) {
			fail();
		}

		EAnnotation appliedStereotypesAnnotation = class_
			.getEAnnotation(StereotypeOperations.ANNOTATION_SOURCE__APPLIED_STEREOTYPES);

		assertNotNull(appliedStereotypesAnnotation);
		assertEquals(1, appliedStereotypesAnnotation.getContents().size());

		try {
			StereotypeOperations.apply(getElement(), class_);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}
	}

	/**
	 * Tests the '
	 * {@link org.eclipse.uml2.internal.operation.StereotypeOperations#createExtension(org.eclipse.uml2.Stereotype, org.eclipse.uml2.Class, boolean) <em>Create Extension</em>}'
	 * method.
	 * 
	 * @see org.eclipse.uml2.internal.operation.StereotypeOperations#createExtension(org.eclipse.uml2.Stereotype,
	 *      org.eclipse.uml2.Class, boolean)
	 */
	public void testCreateExtension() {

		try {
			StereotypeOperations.createExtension(null,
				(org.eclipse.uml2.Class) null, false);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		try {
			StereotypeOperations.createExtension(getElement(),
				(org.eclipse.uml2.Class) null, false);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		try {
			StereotypeOperations.createExtension(getElement(),
				getUML2Metaclass(UML2Package.eINSTANCE.getClass_()), false);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		try {
			StereotypeOperations.createExtension(getElement(),
				getUML2Metaclass(UML2Package.eINSTANCE.getInterface()), false);
		} catch (IllegalArgumentException iae) {
			fail();
		}

		assertEquals(14, getElement().getOwnedAttributes().size());

		Property stereotypeEnd = (Property) getElement().getOwnedAttributes()
			.get(13);
		org.eclipse.uml2.Class metaclass = (org.eclipse.uml2.Class) stereotypeEnd
			.getType();

		assertNotNull(metaclass);
		assertEquals(UML2Package.eINSTANCE.getInterface().getName(), metaclass
			.getName());

		Extension extension = (Extension) stereotypeEnd.getAssociation();

		assertNotNull(extension);
		assertEquals(1, extension.getOwnedEnds().size());
		assertFalse(extension.isRequired());

		ExtensionEnd extensionEnd = (ExtensionEnd) extension.getOwnedEnds()
			.get(0);
		assertSame(AggregationKind.COMPOSITE_LITERAL, extensionEnd
			.getAggregation());
		assertSame(getElement(), extensionEnd.getType());

		try {
			StereotypeOperations.createExtension(getElement(),
				getUML2Metaclass(UML2Package.eINSTANCE.getDataType()), true);
		} catch (IllegalArgumentException iae) {
			fail();
		}

		assertEquals(15, getElement().getOwnedAttributes().size());

		stereotypeEnd = (Property) getElement().getOwnedAttributes().get(14);
		metaclass = (org.eclipse.uml2.Class) stereotypeEnd.getType();

		assertNotNull(metaclass);
		assertEquals(UML2Package.eINSTANCE.getDataType().getName(), metaclass
			.getName());

		extension = (Extension) stereotypeEnd.getAssociation();

		assertNotNull(extension);
		assertEquals(1, extension.getOwnedEnds().size());
		assertTrue(extension.isRequired());

		extensionEnd = (ExtensionEnd) extension.getOwnedEnds().get(0);
		assertSame(AggregationKind.COMPOSITE_LITERAL, extensionEnd
			.getAggregation());
		assertSame(getElement(), extensionEnd.getType());
	}

	/**
	 * Tests the '
	 * {@link org.eclipse.uml2.internal.operation.StereotypeOperations#getApplicableStereotypes(org.eclipse.uml2.Element) <em>Get Applicable Stereotypes</em>}'
	 * method.
	 * 
	 * @see org.eclipse.uml2.internal.operation.StereotypeOperations#getApplicableStereotypes(org.eclipse.uml2.Element)
	 */
	public void testGetApplicableStereotypes() {
		assertEquals(0, StereotypeOperations.getApplicableStereotypes(null)
			.size());

		org.eclipse.uml2.Class class_ = UML2Factory.eINSTANCE.createClass();

		assertEquals(0, StereotypeOperations.getApplicableStereotypes(class_)
			.size());

		org.eclipse.uml2.Package package_ = UML2Factory.eINSTANCE
			.createPackage();
		package_.getOwnedMembers().add(class_);

		assertEquals(0, StereotypeOperations.getApplicableStereotypes(class_)
			.size());

		applyProfile(package_, getElement().getProfile());

		assertEquals(1, StereotypeOperations.getApplicableStereotypes(class_)
			.size());
		assertTrue(StereotypeOperations.getApplicableStereotypes(class_)
			.contains(getElement()));

		org.eclipse.uml2.Class nestedClass = UML2Factory.eINSTANCE
			.createClass();

		assertEquals(0, StereotypeOperations.getApplicableStereotypes(
			nestedClass).size());

		class_.getNestedClassifiers().add(nestedClass);

		assertEquals(1, StereotypeOperations.getApplicableStereotypes(
			nestedClass).size());
		assertTrue(StereotypeOperations.getApplicableStereotypes(nestedClass)
			.contains(getElement()));

		org.eclipse.uml2.Package nestedPackage = UML2Factory.eINSTANCE
			.createPackage();
		package_.getOwnedMembers().add(nestedPackage);

		Interface interface_ = UML2Factory.eINSTANCE.createInterface();

		assertEquals(0, StereotypeOperations.getApplicableStereotypes(
			interface_).size());

		nestedPackage.getOwnedMembers().add(interface_);

		assertEquals(0, StereotypeOperations.getApplicableStereotypes(
			interface_).size());

		Component component = UML2Factory.eINSTANCE.createComponent();

		assertEquals(0, StereotypeOperations
			.getApplicableStereotypes(component).size());

		nestedPackage.getOwnedMembers().add(component);

		assertEquals(1, StereotypeOperations
			.getApplicableStereotypes(component).size());
		assertTrue(StereotypeOperations.getApplicableStereotypes(component)
			.contains(getElement()));

		Component nestedComponent = UML2Factory.eINSTANCE.createComponent();

		assertEquals(0, StereotypeOperations.getApplicableStereotypes(
			nestedComponent).size());

		component.getNestedClassifiers().add(nestedComponent);

		assertEquals(1, StereotypeOperations.getApplicableStereotypes(
			nestedComponent).size());
		assertTrue(StereotypeOperations.getApplicableStereotypes(
			nestedComponent).contains(getElement()));
	}

	/**
	 * Tests the '
	 * {@link org.eclipse.uml2.internal.operation.StereotypeOperations#getAppliedStereotypes(org.eclipse.uml2.Element) <em>Get Applied Stereotypes</em>}'
	 * method.
	 * 
	 * @see org.eclipse.uml2.internal.operation.StereotypeOperations#getAppliedStereotypes(org.eclipse.uml2.Element)
	 */
	public void testGetAppliedStereotypes() {
		assertEquals(0, StereotypeOperations.getAppliedStereotypes(null).size());

		org.eclipse.uml2.Class class_ = UML2Factory.eINSTANCE.createClass();

		assertEquals(0, StereotypeOperations.getAppliedStereotypes(class_)
			.size());

		org.eclipse.uml2.Package package_ = UML2Factory.eINSTANCE
			.createPackage();
		package_.getOwnedMembers().add(class_);

		assertEquals(0, StereotypeOperations.getAppliedStereotypes(class_)
			.size());

		applyProfile(package_, getElement().getProfile());

		assertEquals(1, StereotypeOperations.getAppliedStereotypes(class_)
			.size());
		assertTrue(StereotypeOperations.getAppliedStereotypes(class_).contains(
			getElement()));

		setRequired(getElement(), false);

		assertEquals(0, StereotypeOperations.getAppliedStereotypes(class_)
			.size());

		EClass eClass = StereotypeOperations.getEClass(getElement(), String
			.valueOf(0));
		class_.createEAnnotation(
			StereotypeOperations.ANNOTATION_SOURCE__APPLIED_STEREOTYPES)
			.getContents().add(
				eClass.getEPackage().getEFactoryInstance().create(eClass));

		assertEquals(1, StereotypeOperations.getAppliedStereotypes(class_)
			.size());
		assertTrue(StereotypeOperations.getAppliedStereotypes(class_).contains(
			getElement()));
	}

	/**
	 * Tests the '
	 * {@link org.eclipse.uml2.internal.operation.StereotypeOperations#getValue(org.eclipse.uml2.Stereotype, org.eclipse.uml2.Element, String) <em>Get Value</em>}'
	 * method.
	 * 
	 * @see org.eclipse.uml2.internal.operation.StereotypeOperations#getValue(org.eclipse.uml2.Stereotype,
	 *      org.eclipse.uml2.Element, String)
	 */
	public void testGetValue_Boolean() {
		Object value = null;

		try {
			value = StereotypeOperations.getValue(null, null, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		try {
			value = StereotypeOperations.getValue(getElement(), null, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		org.eclipse.uml2.Class class_ = UML2Factory.eINSTANCE.createClass();

		try {
			value = StereotypeOperations.getValue(getElement(), class_, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		org.eclipse.uml2.Package package_ = UML2Factory.eINSTANCE
			.createPackage();
		package_.getOwnedMembers().add(class_);

		try {
			value = StereotypeOperations.getValue(getElement(), class_, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		applyProfile(package_, getElement().getProfile());

		try {
			value = StereotypeOperations.getValue(getElement(), class_, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		try {
			value = StereotypeOperations.getValue(getElement(), class_, ""); //$NON-NLS-1$
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		try {
			value = StereotypeOperations.getValue(getElement(), class_,
				"boolean"); //$NON-NLS-1$
		} catch (IllegalArgumentException iae) {
			fail();
		}

		assertEquals(Boolean.TRUE, value);

		setRequired(getElement(), false);

		try {
			value = StereotypeOperations.getValue(getElement(), class_,
				"boolean"); //$NON-NLS-1$
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		EClass eClass = StereotypeOperations.getEClass(getElement(), String
			.valueOf(0));
		EObject stereotypeEObject = eClass.getEPackage().getEFactoryInstance()
			.create(eClass);
		class_.createEAnnotation(
			StereotypeOperations.ANNOTATION_SOURCE__APPLIED_STEREOTYPES)
			.getContents().add(stereotypeEObject);

		try {
			value = StereotypeOperations.getValue(getElement(), class_,
				"boolean"); //$NON-NLS-1$
		} catch (IllegalArgumentException iae) {
			fail();
		}

		assertEquals(Boolean.TRUE, value);

		stereotypeEObject.eSet(eClass.getEStructuralFeature("boolean"), //$NON-NLS-1$
			Boolean.FALSE);

		try {
			value = StereotypeOperations.getValue(getElement(), class_,
				"boolean"); //$NON-NLS-1$
		} catch (IllegalArgumentException iae) {
			fail();
		}

		assertEquals(Boolean.FALSE, value);
	}

	/**
	 * Tests the '
	 * {@link org.eclipse.uml2.internal.operation.StereotypeOperations#getValue(org.eclipse.uml2.Stereotype, org.eclipse.uml2.Element, String) <em>Get Value</em>}'
	 * method.
	 * 
	 * @see org.eclipse.uml2.internal.operation.StereotypeOperations#getValue(org.eclipse.uml2.Stereotype,
	 *      org.eclipse.uml2.Element, String)
	 */
	public void testGetValue_Booleans() {
		Object value = null;

		try {
			value = StereotypeOperations.getValue(null, null, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		try {
			value = StereotypeOperations.getValue(getElement(), null, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		org.eclipse.uml2.Class class_ = UML2Factory.eINSTANCE.createClass();

		try {
			value = StereotypeOperations.getValue(getElement(), class_, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		org.eclipse.uml2.Package package_ = UML2Factory.eINSTANCE
			.createPackage();
		package_.getOwnedMembers().add(class_);

		try {
			value = StereotypeOperations.getValue(getElement(), class_, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		applyProfile(package_, getElement().getProfile());

		try {
			value = StereotypeOperations.getValue(getElement(), class_, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		try {
			value = StereotypeOperations.getValue(getElement(), class_, ""); //$NON-NLS-1$
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		try {
			value = StereotypeOperations.getValue(getElement(), class_,
				"booleans"); //$NON-NLS-1$
		} catch (IllegalArgumentException iae) {
			fail();
		}

		assertEquals(0, ((List) value).size());

		setRequired(getElement(), false);

		try {
			value = StereotypeOperations.getValue(getElement(), class_,
				"booleans"); //$NON-NLS-1$
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		EClass eClass = StereotypeOperations.getEClass(getElement(), String
			.valueOf(0));
		EObject stereotypeEObject = eClass.getEPackage().getEFactoryInstance()
			.create(eClass);
		class_.createEAnnotation(
			StereotypeOperations.ANNOTATION_SOURCE__APPLIED_STEREOTYPES)
			.getContents().add(stereotypeEObject);

		try {
			value = StereotypeOperations.getValue(getElement(), class_,
				"booleans"); //$NON-NLS-1$
		} catch (IllegalArgumentException iae) {
			fail();
		}

		assertEquals(0, ((List) value).size());

		try {
			value = StereotypeOperations.getValue(getElement(), class_,
				"booleans["); //$NON-NLS-1$
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		try {
			value = StereotypeOperations.getValue(getElement(), class_,
				"booleans[0"); //$NON-NLS-1$
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		try {
			value = StereotypeOperations.getValue(getElement(), class_,
				"booleans[0]"); //$NON-NLS-1$
			fail();
		} catch (IndexOutOfBoundsException ioobe) {
			// pass
		}

		((List) stereotypeEObject
			.eGet(eClass.getEStructuralFeature("booleans"))) //$NON-NLS-1$
			.add(Boolean.FALSE);

		try {
			value = StereotypeOperations.getValue(getElement(), class_,
				"booleans[0]"); //$NON-NLS-1$
		} catch (IndexOutOfBoundsException ioobe) {
			fail();
		}

		assertEquals(Boolean.FALSE, value);
	}

	/**
	 * Tests the '
	 * {@link org.eclipse.uml2.internal.operation.StereotypeOperations#getValue(org.eclipse.uml2.Stereotype, org.eclipse.uml2.Element, String) <em>Get Value</em>}'
	 * method.
	 * 
	 * @see org.eclipse.uml2.internal.operation.StereotypeOperations#getValue(org.eclipse.uml2.Stereotype,
	 *      org.eclipse.uml2.Element, String)
	 */
	public void testGetValue_Integer() {
		Object value = null;

		try {
			value = StereotypeOperations.getValue(null, null, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		try {
			value = StereotypeOperations.getValue(getElement(), null, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		org.eclipse.uml2.Class class_ = UML2Factory.eINSTANCE.createClass();

		try {
			value = StereotypeOperations.getValue(getElement(), class_, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		org.eclipse.uml2.Package package_ = UML2Factory.eINSTANCE
			.createPackage();
		package_.getOwnedMembers().add(class_);

		try {
			value = StereotypeOperations.getValue(getElement(), class_, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		applyProfile(package_, getElement().getProfile());

		try {
			value = StereotypeOperations.getValue(getElement(), class_, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		try {
			value = StereotypeOperations.getValue(getElement(), class_, ""); //$NON-NLS-1$
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		try {
			value = StereotypeOperations.getValue(getElement(), class_,
				"integer"); //$NON-NLS-1$
		} catch (IllegalArgumentException iae) {
			fail();
		}

		assertEquals(new Integer(Integer.MIN_VALUE), value);

		setRequired(getElement(), false);

		try {
			value = StereotypeOperations.getValue(getElement(), class_,
				"integer"); //$NON-NLS-1$
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		EClass eClass = StereotypeOperations.getEClass(getElement(), String
			.valueOf(0));
		EObject stereotypeEObject = eClass.getEPackage().getEFactoryInstance()
			.create(eClass);
		class_.createEAnnotation(
			StereotypeOperations.ANNOTATION_SOURCE__APPLIED_STEREOTYPES)
			.getContents().add(stereotypeEObject);

		try {
			value = StereotypeOperations.getValue(getElement(), class_,
				"integer"); //$NON-NLS-1$
		} catch (IllegalArgumentException iae) {
			fail();
		}

		assertEquals(new Integer(Integer.MIN_VALUE), value);

		stereotypeEObject.eSet(eClass.getEStructuralFeature("integer"), //$NON-NLS-1$
			new Integer(Integer.MAX_VALUE));

		try {
			value = StereotypeOperations.getValue(getElement(), class_,
				"integer"); //$NON-NLS-1$
		} catch (IllegalArgumentException iae) {
			fail();
		}

		assertEquals(new Integer(Integer.MAX_VALUE), value);
	}

	/**
	 * Tests the '
	 * {@link org.eclipse.uml2.internal.operation.StereotypeOperations#getValue(org.eclipse.uml2.Stereotype, org.eclipse.uml2.Element, String) <em>Get Value</em>}'
	 * method.
	 * 
	 * @see org.eclipse.uml2.internal.operation.StereotypeOperations#getValue(org.eclipse.uml2.Stereotype,
	 *      org.eclipse.uml2.Element, String)
	 */
	public void testGetValue_Integers() {
		Object value = null;

		try {
			value = StereotypeOperations.getValue(null, null, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		try {
			value = StereotypeOperations.getValue(getElement(), null, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		org.eclipse.uml2.Class class_ = UML2Factory.eINSTANCE.createClass();

		try {
			value = StereotypeOperations.getValue(getElement(), class_, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		org.eclipse.uml2.Package package_ = UML2Factory.eINSTANCE
			.createPackage();
		package_.getOwnedMembers().add(class_);

		try {
			value = StereotypeOperations.getValue(getElement(), class_, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		applyProfile(package_, getElement().getProfile());

		try {
			value = StereotypeOperations.getValue(getElement(), class_, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		try {
			value = StereotypeOperations.getValue(getElement(), class_, ""); //$NON-NLS-1$
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		try {
			value = StereotypeOperations.getValue(getElement(), class_,
				"integers"); //$NON-NLS-1$
		} catch (IllegalArgumentException iae) {
			fail();
		}

		assertEquals(0, ((List) value).size());

		setRequired(getElement(), false);

		try {
			value = StereotypeOperations.getValue(getElement(), class_,
				"integers"); //$NON-NLS-1$
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		EClass eClass = StereotypeOperations.getEClass(getElement(), String
			.valueOf(0));
		EObject stereotypeEObject = eClass.getEPackage().getEFactoryInstance()
			.create(eClass);
		class_.createEAnnotation(
			StereotypeOperations.ANNOTATION_SOURCE__APPLIED_STEREOTYPES)
			.getContents().add(stereotypeEObject);

		try {
			value = StereotypeOperations.getValue(getElement(), class_,
				"integers"); //$NON-NLS-1$
		} catch (IllegalArgumentException iae) {
			fail();
		}

		assertEquals(0, ((List) value).size());

		try {
			value = StereotypeOperations.getValue(getElement(), class_,
				"integers["); //$NON-NLS-1$
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		try {
			value = StereotypeOperations.getValue(getElement(), class_,
				"integers[0"); //$NON-NLS-1$
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		try {
			value = StereotypeOperations.getValue(getElement(), class_,
				"integers[0]"); //$NON-NLS-1$
			fail();
		} catch (IndexOutOfBoundsException ioobe) {
			// pass
		}

		((List) stereotypeEObject
			.eGet(eClass.getEStructuralFeature("integers"))) //$NON-NLS-1$
			.add(new Integer(Integer.MAX_VALUE));

		try {
			value = StereotypeOperations.getValue(getElement(), class_,
				"integers[0]"); //$NON-NLS-1$
		} catch (IndexOutOfBoundsException ioobe) {
			fail();
		}

		assertEquals(new Integer(Integer.MAX_VALUE), value);
	}

	/**
	 * Tests the '
	 * {@link org.eclipse.uml2.internal.operation.StereotypeOperations#getValue(org.eclipse.uml2.Stereotype, org.eclipse.uml2.Element, String) <em>Get Value</em>}'
	 * method.
	 * 
	 * @see org.eclipse.uml2.internal.operation.StereotypeOperations#getValue(org.eclipse.uml2.Stereotype,
	 *      org.eclipse.uml2.Element, String)
	 */
	public void testGetValue_UnlimitedNatural() {
		Object value = null;

		try {
			value = StereotypeOperations.getValue(null, null, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		try {
			value = StereotypeOperations.getValue(getElement(), null, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		org.eclipse.uml2.Class class_ = UML2Factory.eINSTANCE.createClass();

		try {
			value = StereotypeOperations.getValue(getElement(), class_, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		org.eclipse.uml2.Package package_ = UML2Factory.eINSTANCE
			.createPackage();
		package_.getOwnedMembers().add(class_);

		try {
			value = StereotypeOperations.getValue(getElement(), class_, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		applyProfile(package_, getElement().getProfile());

		try {
			value = StereotypeOperations.getValue(getElement(), class_, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		try {
			value = StereotypeOperations.getValue(getElement(), class_, ""); //$NON-NLS-1$
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		try {
			value = StereotypeOperations.getValue(getElement(), class_,
				"unlimitedNatural"); //$NON-NLS-1$
		} catch (IllegalArgumentException iae) {
			fail();
		}

		assertEquals(new Integer(Integer.MAX_VALUE), value);

		setRequired(getElement(), false);

		try {
			value = StereotypeOperations.getValue(getElement(), class_,
				"unlimitedNatural"); //$NON-NLS-1$
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		EClass eClass = StereotypeOperations.getEClass(getElement(), String
			.valueOf(0));
		EObject stereotypeEObject = eClass.getEPackage().getEFactoryInstance()
			.create(eClass);
		class_.createEAnnotation(
			StereotypeOperations.ANNOTATION_SOURCE__APPLIED_STEREOTYPES)
			.getContents().add(stereotypeEObject);

		try {
			value = StereotypeOperations.getValue(getElement(), class_,
				"unlimitedNatural"); //$NON-NLS-1$
		} catch (IllegalArgumentException iae) {
			fail();
		}

		assertEquals(new Integer(Integer.MAX_VALUE), value);

		stereotypeEObject.eSet(
			eClass.getEStructuralFeature("unlimitedNatural"), //$NON-NLS-1$
			new Integer(0));

		try {
			value = StereotypeOperations.getValue(getElement(), class_,
				"unlimitedNatural"); //$NON-NLS-1$
		} catch (IllegalArgumentException iae) {
			fail();
		}

		assertEquals(new Integer(0), value);
	}

	/**
	 * Tests the '
	 * {@link org.eclipse.uml2.internal.operation.StereotypeOperations#getValue(org.eclipse.uml2.Stereotype, org.eclipse.uml2.Element, String) <em>Get Value</em>}'
	 * method.
	 * 
	 * @see org.eclipse.uml2.internal.operation.StereotypeOperations#getValue(org.eclipse.uml2.Stereotype,
	 *      org.eclipse.uml2.Element, String)
	 */
	public void testGetValue_UnlimitedNaturals() {
		Object value = null;

		try {
			value = StereotypeOperations.getValue(null, null, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		try {
			value = StereotypeOperations.getValue(getElement(), null, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		org.eclipse.uml2.Class class_ = UML2Factory.eINSTANCE.createClass();

		try {
			value = StereotypeOperations.getValue(getElement(), class_, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		org.eclipse.uml2.Package package_ = UML2Factory.eINSTANCE
			.createPackage();
		package_.getOwnedMembers().add(class_);

		try {
			value = StereotypeOperations.getValue(getElement(), class_, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		applyProfile(package_, getElement().getProfile());

		try {
			value = StereotypeOperations.getValue(getElement(), class_, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		try {
			value = StereotypeOperations.getValue(getElement(), class_, ""); //$NON-NLS-1$
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		try {
			value = StereotypeOperations.getValue(getElement(), class_,
				"unlimitedNaturals"); //$NON-NLS-1$
		} catch (IllegalArgumentException iae) {
			fail();
		}

		assertEquals(0, ((List) value).size());

		setRequired(getElement(), false);

		try {
			value = StereotypeOperations.getValue(getElement(), class_,
				"unlimitedNaturals"); //$NON-NLS-1$
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		EClass eClass = StereotypeOperations.getEClass(getElement(), String
			.valueOf(0));
		EObject stereotypeEObject = eClass.getEPackage().getEFactoryInstance()
			.create(eClass);
		class_.createEAnnotation(
			StereotypeOperations.ANNOTATION_SOURCE__APPLIED_STEREOTYPES)
			.getContents().add(stereotypeEObject);

		try {
			value = StereotypeOperations.getValue(getElement(), class_,
				"unlimitedNaturals"); //$NON-NLS-1$
		} catch (IllegalArgumentException iae) {
			fail();
		}

		assertEquals(0, ((List) value).size());

		try {
			value = StereotypeOperations.getValue(getElement(), class_,
				"unlimitedNaturals["); //$NON-NLS-1$
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		try {
			value = StereotypeOperations.getValue(getElement(), class_,
				"unlimitedNaturals[0"); //$NON-NLS-1$
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		try {
			value = StereotypeOperations.getValue(getElement(), class_,
				"unlimitedNaturals[0]"); //$NON-NLS-1$
			fail();
		} catch (IndexOutOfBoundsException ioobe) {
			// pass
		}

		((List) stereotypeEObject.eGet(eClass
			.getEStructuralFeature("unlimitedNaturals"))) //$NON-NLS-1$
			.add(new Integer(0));

		try {
			value = StereotypeOperations.getValue(getElement(), class_,
				"unlimitedNaturals[0]"); //$NON-NLS-1$
		} catch (IndexOutOfBoundsException ioobe) {
			fail();
		}

		assertEquals(new Integer(0), value);
	}

	/**
	 * Tests the '
	 * {@link org.eclipse.uml2.internal.operation.StereotypeOperations#getValue(org.eclipse.uml2.Stereotype, org.eclipse.uml2.Element, String) <em>Get Value</em>}'
	 * method.
	 * 
	 * @see org.eclipse.uml2.internal.operation.StereotypeOperations#getValue(org.eclipse.uml2.Stereotype,
	 *      org.eclipse.uml2.Element, String)
	 */
	public void testGetValue_String() {
		Object value = null;

		try {
			value = StereotypeOperations.getValue(null, null, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		try {
			value = StereotypeOperations.getValue(getElement(), null, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		org.eclipse.uml2.Class class_ = UML2Factory.eINSTANCE.createClass();

		try {
			value = StereotypeOperations.getValue(getElement(), class_, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		org.eclipse.uml2.Package package_ = UML2Factory.eINSTANCE
			.createPackage();
		package_.getOwnedMembers().add(class_);

		try {
			value = StereotypeOperations.getValue(getElement(), class_, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		applyProfile(package_, getElement().getProfile());

		try {
			value = StereotypeOperations.getValue(getElement(), class_, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		try {
			value = StereotypeOperations.getValue(getElement(), class_, ""); //$NON-NLS-1$
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		try {
			value = StereotypeOperations.getValue(getElement(), class_,
				"string"); //$NON-NLS-1$
		} catch (IllegalArgumentException iae) {
			fail();
		}

		assertEquals("", value); //$NON-NLS-1$

		setRequired(getElement(), false);

		try {
			value = StereotypeOperations.getValue(getElement(), class_,
				"string"); //$NON-NLS-1$
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		EClass eClass = StereotypeOperations.getEClass(getElement(), String
			.valueOf(0));
		EObject stereotypeEObject = eClass.getEPackage().getEFactoryInstance()
			.create(eClass);
		class_.createEAnnotation(
			StereotypeOperations.ANNOTATION_SOURCE__APPLIED_STEREOTYPES)
			.getContents().add(stereotypeEObject);

		try {
			value = StereotypeOperations.getValue(getElement(), class_,
				"string"); //$NON-NLS-1$
		} catch (IllegalArgumentException iae) {
			fail();
		}

		assertEquals("", value); //$NON-NLS-1$

		stereotypeEObject.eSet(eClass.getEStructuralFeature("string"), //$NON-NLS-1$
			getName());

		try {
			value = StereotypeOperations.getValue(getElement(), class_,
				"string"); //$NON-NLS-1$
		} catch (IllegalArgumentException iae) {
			fail();
		}

		assertEquals(getName(), value);
	}

	/**
	 * Tests the '
	 * {@link org.eclipse.uml2.internal.operation.StereotypeOperations#getValue(org.eclipse.uml2.Stereotype, org.eclipse.uml2.Element, String) <em>Get Value</em>}'
	 * method.
	 * 
	 * @see org.eclipse.uml2.internal.operation.StereotypeOperations#getValue(org.eclipse.uml2.Stereotype,
	 *      org.eclipse.uml2.Element, String)
	 */
	public void testGetValue_Strings() {
		Object value = null;

		try {
			value = StereotypeOperations.getValue(null, null, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		try {
			value = StereotypeOperations.getValue(getElement(), null, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		org.eclipse.uml2.Class class_ = UML2Factory.eINSTANCE.createClass();

		try {
			value = StereotypeOperations.getValue(getElement(), class_, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		org.eclipse.uml2.Package package_ = UML2Factory.eINSTANCE
			.createPackage();
		package_.getOwnedMembers().add(class_);

		try {
			value = StereotypeOperations.getValue(getElement(), class_, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		applyProfile(package_, getElement().getProfile());

		try {
			value = StereotypeOperations.getValue(getElement(), class_, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		try {
			value = StereotypeOperations.getValue(getElement(), class_, ""); //$NON-NLS-1$
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		try {
			value = StereotypeOperations.getValue(getElement(), class_,
				"strings"); //$NON-NLS-1$
		} catch (IllegalArgumentException iae) {
			fail();
		}

		assertEquals(0, ((List) value).size());

		setRequired(getElement(), false);

		try {
			value = StereotypeOperations.getValue(getElement(), class_,
				"strings"); //$NON-NLS-1$
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		EClass eClass = StereotypeOperations.getEClass(getElement(), String
			.valueOf(0));
		EObject stereotypeEObject = eClass.getEPackage().getEFactoryInstance()
			.create(eClass);
		class_.createEAnnotation(
			StereotypeOperations.ANNOTATION_SOURCE__APPLIED_STEREOTYPES)
			.getContents().add(stereotypeEObject);

		try {
			value = StereotypeOperations.getValue(getElement(), class_,
				"strings"); //$NON-NLS-1$
		} catch (IllegalArgumentException iae) {
			fail();
		}

		assertEquals(0, ((List) value).size());

		try {
			value = StereotypeOperations.getValue(getElement(), class_,
				"strings["); //$NON-NLS-1$
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		try {
			value = StereotypeOperations.getValue(getElement(), class_,
				"strings[0"); //$NON-NLS-1$
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		try {
			value = StereotypeOperations.getValue(getElement(), class_,
				"strings[0]"); //$NON-NLS-1$
			fail();
		} catch (IndexOutOfBoundsException ioobe) {
			// pass
		}

		((List) stereotypeEObject.eGet(eClass.getEStructuralFeature("strings"))) //$NON-NLS-1$
			.add(getName());

		try {
			value = StereotypeOperations.getValue(getElement(), class_,
				"strings[0]"); //$NON-NLS-1$
		} catch (IndexOutOfBoundsException ioobe) {
			fail();
		}

		assertEquals(getName(), value);
	}

	/**
	 * Tests the '
	 * {@link org.eclipse.uml2.internal.operation.StereotypeOperations#getValue() <em>Get Value</em>}'
	 * method.
	 * 
	 * @see org.eclipse.uml2.internal.operation.StereotypeOperations#getValue()
	 */
	public void testGetValue_Enumeration() {
		Object value = null;

		try {
			value = StereotypeOperations.getValue(null, null, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		try {
			value = StereotypeOperations.getValue(getElement(), null, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		org.eclipse.uml2.Class class_ = UML2Factory.eINSTANCE.createClass();

		try {
			value = StereotypeOperations.getValue(getElement(), class_, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		org.eclipse.uml2.Package package_ = UML2Factory.eINSTANCE
			.createPackage();
		package_.getOwnedMembers().add(class_);

		try {
			value = StereotypeOperations.getValue(getElement(), class_, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		applyProfile(package_, getElement().getProfile());

		try {
			value = StereotypeOperations.getValue(getElement(), class_, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		try {
			value = StereotypeOperations.getValue(getElement(), class_, ""); //$NON-NLS-1$
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		try {
			value = StereotypeOperations.getValue(getElement(), class_,
				"enumeration"); //$NON-NLS-1$
		} catch (IllegalArgumentException iae) {
			fail();
		}

		assertSame(getEnumeration().getOwnedLiterals().get(1), value);

		setRequired(getElement(), false);

		try {
			value = StereotypeOperations.getValue(getElement(), class_,
				"enumeration"); //$NON-NLS-1$
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		EClass eClass = StereotypeOperations.getEClass(getElement(), String
			.valueOf(0));
		EObject stereotypeEObject = eClass.getEPackage().getEFactoryInstance()
			.create(eClass);
		class_.createEAnnotation(
			StereotypeOperations.ANNOTATION_SOURCE__APPLIED_STEREOTYPES)
			.getContents().add(stereotypeEObject);

		try {
			value = StereotypeOperations.getValue(getElement(), class_,
				"enumeration"); //$NON-NLS-1$
		} catch (IllegalArgumentException iae) {
			fail();
		}

		assertSame(getEnumeration().getOwnedLiterals().get(1), value);

		EStructuralFeature enumerationEStructuralFeature = eClass
			.getEStructuralFeature("enumeration"); //$NON-NLS-1$

		stereotypeEObject.eSet(enumerationEStructuralFeature,
			((EEnum) enumerationEStructuralFeature.getEType()).getEEnumLiteral(
				getName() + ' ' + String.valueOf(0)).getInstance());

		try {
			value = StereotypeOperations.getValue(getElement(), class_,
				"enumeration"); //$NON-NLS-1$
		} catch (IllegalArgumentException iae) {
			fail();
		}

		assertSame(getEnumeration().getOwnedLiterals().get(0), value);
	}

	/**
	 * Tests the '
	 * {@link org.eclipse.uml2.internal.operation.StereotypeOperations#getValue(org.eclipse.uml2.Stereotype, org.eclipse.uml2.Element, String) <em>Get Value</em>}'
	 * method.
	 * 
	 * @see org.eclipse.uml2.internal.operation.StereotypeOperations#getValue(org.eclipse.uml2.Stereotype,
	 *      org.eclipse.uml2.Element, String)
	 */
	public void testGetValue_Enumerations() {
		Object value = null;

		try {
			value = StereotypeOperations.getValue(null, null, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		try {
			value = StereotypeOperations.getValue(getElement(), null, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		org.eclipse.uml2.Class class_ = UML2Factory.eINSTANCE.createClass();

		try {
			value = StereotypeOperations.getValue(getElement(), class_, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		org.eclipse.uml2.Package package_ = UML2Factory.eINSTANCE
			.createPackage();
		package_.getOwnedMembers().add(class_);

		try {
			value = StereotypeOperations.getValue(getElement(), class_, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		applyProfile(package_, getElement().getProfile());

		try {
			value = StereotypeOperations.getValue(getElement(), class_, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		try {
			value = StereotypeOperations.getValue(getElement(), class_, ""); //$NON-NLS-1$
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		try {
			value = StereotypeOperations.getValue(getElement(), class_,
				"enumerations"); //$NON-NLS-1$
		} catch (IllegalArgumentException iae) {
			fail();
		}

		assertEquals(0, ((List) value).size());

		setRequired(getElement(), false);

		try {
			value = StereotypeOperations.getValue(getElement(), class_,
				"enumerations"); //$NON-NLS-1$
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		EClass eClass = StereotypeOperations.getEClass(getElement(), String
			.valueOf(0));
		EObject stereotypeEObject = eClass.getEPackage().getEFactoryInstance()
			.create(eClass);
		class_.createEAnnotation(
			StereotypeOperations.ANNOTATION_SOURCE__APPLIED_STEREOTYPES)
			.getContents().add(stereotypeEObject);

		try {
			value = StereotypeOperations.getValue(getElement(), class_,
				"enumerations"); //$NON-NLS-1$
		} catch (IllegalArgumentException iae) {
			fail();
		}

		assertEquals(0, ((List) value).size());

		try {
			value = StereotypeOperations.getValue(getElement(), class_,
				"enumerations["); //$NON-NLS-1$
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		try {
			value = StereotypeOperations.getValue(getElement(), class_,
				"enumerations[0"); //$NON-NLS-1$
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		try {
			value = StereotypeOperations.getValue(getElement(), class_,
				"enumerations[0]"); //$NON-NLS-1$
			fail();
		} catch (IndexOutOfBoundsException ioobe) {
			// pass
		}

		EStructuralFeature enumerationsEStructuralFeature = eClass
			.getEStructuralFeature("enumerations"); //$NON-NLS-1$

		((List) stereotypeEObject.eGet(enumerationsEStructuralFeature))
			.add(((EEnum) enumerationsEStructuralFeature.getEType())
				.getEEnumLiteral(getName() + ' ' + String.valueOf(0))
				.getInstance());

		try {
			value = StereotypeOperations.getValue(getElement(), class_,
				"enumerations[0]"); //$NON-NLS-1$
		} catch (IndexOutOfBoundsException ioobe) {
			fail();
		}

		assertSame(getEnumeration().getOwnedLiterals().get(0), value);
	}

	/**
	 * Tests the '
	 * {@link org.eclipse.uml2.internal.operation.StereotypeOperations#getValue(org.eclipse.uml2.Stereotype, org.eclipse.uml2.Element, String) <em>Get Value</em>}'
	 * method.
	 * 
	 * @see org.eclipse.uml2.internal.operation.StereotypeOperations#getValue(org.eclipse.uml2.Stereotype,
	 *      org.eclipse.uml2.Element, String)
	 */
	public void testGetValue_Class() {
		Object value = null;

		try {
			value = StereotypeOperations.getValue(null, null, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		try {
			value = StereotypeOperations.getValue(getElement(), null, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		org.eclipse.uml2.Class class_ = UML2Factory.eINSTANCE.createClass();

		try {
			value = StereotypeOperations.getValue(getElement(), class_, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		org.eclipse.uml2.Package package_ = UML2Factory.eINSTANCE
			.createPackage();
		package_.getOwnedMembers().add(class_);

		try {
			value = StereotypeOperations.getValue(getElement(), class_, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		applyProfile(package_, getElement().getProfile());

		try {
			value = StereotypeOperations.getValue(getElement(), class_, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		try {
			value = StereotypeOperations.getValue(getElement(), class_, ""); //$NON-NLS-1$
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		try {
			value = StereotypeOperations.getValue(getElement(), class_,
				"timestamp"); //$NON-NLS-1$
		} catch (IllegalArgumentException iae) {
			fail();
		}

		assertNull(value);

		setRequired(getElement(), false);

		try {
			value = StereotypeOperations.getValue(getElement(), class_,
				"timestamp"); //$NON-NLS-1$
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		EClass eClass = StereotypeOperations.getEClass(getElement(), String
			.valueOf(0));
		EObject stereotypeEObject = eClass.getEPackage().getEFactoryInstance()
			.create(eClass);
		class_.createEAnnotation(
			StereotypeOperations.ANNOTATION_SOURCE__APPLIED_STEREOTYPES)
			.getContents().add(stereotypeEObject);

		try {
			value = StereotypeOperations.getValue(getElement(), class_,
				"timestamp"); //$NON-NLS-1$
		} catch (IllegalArgumentException iae) {
			fail();
		}

		assertNull(value);

		EStructuralFeature timestampEStructuralFeature = eClass
			.getEStructuralFeature("timestamp"); //$NON-NLS-1$
		EObject timestampEObject = eClass.getEPackage().getEFactoryInstance()
			.create((EClass) timestampEStructuralFeature.getEType());
		stereotypeEObject.eSet(timestampEStructuralFeature, timestampEObject);

		try {
			value = StereotypeOperations.getValue(getElement(), class_,
				"timestamp"); //$NON-NLS-1$
		} catch (IllegalArgumentException iae) {
			fail();
		}

		assertSame(timestampEObject, value);

		try {
			value = StereotypeOperations.getValue(getElement(), class_,
				"timestamp" + NamedElement.SEPARATOR + "d"); //$NON-NLS-1$ //$NON-NLS-2$
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		try {
			value = StereotypeOperations.getValue(getElement(), class_,
				"timestamp" + NamedElement.SEPARATOR + "date"); //$NON-NLS-1$ //$NON-NLS-2$
		} catch (IllegalArgumentException iae) {
			fail();
		}

		assertNull(value);

		EStructuralFeature dateEStructuralFeature = timestampEObject.eClass()
			.getEStructuralFeature("date"); //$NON-NLS-1$
		EObject dateEObject = eClass.getEPackage().getEFactoryInstance()
			.create((EClass) dateEStructuralFeature.getEType());
		timestampEObject.eSet(dateEStructuralFeature, dateEObject);

		try {
			value = StereotypeOperations.getValue(getElement(), class_,
				"timestamp" + NamedElement.SEPARATOR + "date"); //$NON-NLS-1$ //$NON-NLS-2$
		} catch (IllegalArgumentException iae) {
			fail();
		}

		assertSame(dateEObject, value);

		try {
			value = StereotypeOperations.getValue(getElement(), class_,
				"timestamp" + NamedElement.SEPARATOR + "date" //$NON-NLS-1$ //$NON-NLS-2$
					+ NamedElement.SEPARATOR + "d"); //$NON-NLS-1$
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		try {
			value = StereotypeOperations.getValue(getElement(), class_,
				"timestamp" + NamedElement.SEPARATOR + "date" //$NON-NLS-1$ //$NON-NLS-2$
					+ NamedElement.SEPARATOR + "days"); //$NON-NLS-1$
		} catch (IllegalArgumentException iae) {
			fail();
		}

		assertEquals(new Integer(0), value);
	}

	/**
	 * Tests the '
	 * {@link org.eclipse.uml2.internal.operation.StereotypeOperations#getValue(org.eclipse.uml2.Stereotype, org.eclipse.uml2.Element, String) <em>Get Value</em>}'
	 * method.
	 * 
	 * @see org.eclipse.uml2.internal.operation.StereotypeOperations#getValue(org.eclipse.uml2.Stereotype,
	 *      org.eclipse.uml2.Element, String)
	 */
	public void testGetValue_Classes() {
		Object value = null;

		try {
			value = StereotypeOperations.getValue(null, null, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		try {
			value = StereotypeOperations.getValue(getElement(), null, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		org.eclipse.uml2.Class class_ = UML2Factory.eINSTANCE.createClass();

		try {
			value = StereotypeOperations.getValue(getElement(), class_, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		org.eclipse.uml2.Package package_ = UML2Factory.eINSTANCE
			.createPackage();
		package_.getOwnedMembers().add(class_);

		try {
			value = StereotypeOperations.getValue(getElement(), class_, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		applyProfile(package_, getElement().getProfile());

		try {
			value = StereotypeOperations.getValue(getElement(), class_, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		try {
			value = StereotypeOperations.getValue(getElement(), class_, ""); //$NON-NLS-1$
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		try {
			value = StereotypeOperations.getValue(getElement(), class_,
				"timestamps"); //$NON-NLS-1$
		} catch (IllegalArgumentException iae) {
			fail();
		}

		assertEquals(0, ((List) value).size());

		try {
			value = StereotypeOperations.getValue(getElement(), class_,
				"timestamps["); //$NON-NLS-1$
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		try {
			value = StereotypeOperations.getValue(getElement(), class_,
				"timestamps[0"); //$NON-NLS-1$
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		try {
			value = StereotypeOperations.getValue(getElement(), class_,
				"timestamps[0]"); //$NON-NLS-1$
			fail();
		} catch (IndexOutOfBoundsException ioobe) {
			// pass
		}

		setRequired(getElement(), false);

		try {
			value = StereotypeOperations.getValue(getElement(), class_,
				"timestamps[0]"); //$NON-NLS-1$
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		EClass eClass = StereotypeOperations.getEClass(getElement(), String
			.valueOf(0));
		EObject stereotypeEObject = eClass.getEPackage().getEFactoryInstance()
			.create(eClass);
		class_.createEAnnotation(
			StereotypeOperations.ANNOTATION_SOURCE__APPLIED_STEREOTYPES)
			.getContents().add(stereotypeEObject);

		try {
			value = StereotypeOperations.getValue(getElement(), class_,
				"timestamps[0]"); //$NON-NLS-1$
			fail();
		} catch (IndexOutOfBoundsException ioobe) {
			// pass
		}

		EStructuralFeature timestampsEStructuralFeature = eClass
			.getEStructuralFeature("timestamps"); //$NON-NLS-1$
		EObject timestampEObject = eClass.getEPackage().getEFactoryInstance()
			.create((EClass) timestampsEStructuralFeature.getEType());
		((List) stereotypeEObject.eGet(timestampsEStructuralFeature))
			.add(timestampEObject);

		try {
			value = StereotypeOperations.getValue(getElement(), class_,
				"timestamps[0]"); //$NON-NLS-1$
		} catch (IndexOutOfBoundsException ioobe) {
			fail();
		}

		assertSame(timestampEObject, value);

		try {
			value = StereotypeOperations.getValue(getElement(), class_,
				"timestamps[0]" + NamedElement.SEPARATOR + "d"); //$NON-NLS-1$ //$NON-NLS-2$
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		try {
			value = StereotypeOperations.getValue(getElement(), class_,
				"timestamps[0]" + NamedElement.SEPARATOR + "date"); //$NON-NLS-1$ //$NON-NLS-2$
		} catch (IllegalArgumentException iae) {
			fail();
		}

		assertNull(value);

		EStructuralFeature dateEStructuralFeature = timestampEObject.eClass()
			.getEStructuralFeature("date"); //$NON-NLS-1$
		EObject dateEObject = eClass.getEPackage().getEFactoryInstance()
			.create((EClass) dateEStructuralFeature.getEType());
		timestampEObject.eSet(dateEStructuralFeature, dateEObject);

		try {
			value = StereotypeOperations.getValue(getElement(), class_,
				"timestamps[0]" + NamedElement.SEPARATOR + "date"); //$NON-NLS-1$ //$NON-NLS-2$
		} catch (IllegalArgumentException iae) {
			fail();
		}

		assertSame(dateEObject, value);

		try {
			value = StereotypeOperations.getValue(getElement(), class_,
				"timestamps[0]" + NamedElement.SEPARATOR + "date" //$NON-NLS-1$ //$NON-NLS-2$
					+ NamedElement.SEPARATOR + "d"); //$NON-NLS-1$
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		try {
			value = StereotypeOperations.getValue(getElement(), class_,
				"timestamps[0]" + NamedElement.SEPARATOR + "date" //$NON-NLS-1$ //$NON-NLS-2$
					+ NamedElement.SEPARATOR + "days"); //$NON-NLS-1$
		} catch (IllegalArgumentException iae) {
			fail();
		}

		assertEquals(new Integer(0), value);
	}

	/**
	 * Tests the '
	 * {@link org.eclipse.uml2.internal.operation.StereotypeOperations#isApplied(org.eclipse.uml2.Stereotype, org.eclipse.uml2.Element) <em>Is Applied</em>}'
	 * method.
	 * 
	 * @see org.eclipse.uml2.internal.operation.StereotypeOperations#isApplied(org.eclipse.uml2.Stereotype,
	 *      org.eclipse.uml2.Element)
	 */
	public void testIsApplied() {
		assertFalse(StereotypeOperations.isApplied(null, null));

		assertFalse(StereotypeOperations.isApplied(getElement(), null));

		org.eclipse.uml2.Class class_ = UML2Factory.eINSTANCE.createClass();

		assertFalse(StereotypeOperations.isApplied(getElement(), class_));

		org.eclipse.uml2.Package package_ = UML2Factory.eINSTANCE
			.createPackage();
		package_.getOwnedMembers().add(class_);

		assertFalse(StereotypeOperations.isApplied(getElement(), class_));

		applyProfile(package_, getElement().getProfile());

		assertTrue(StereotypeOperations.isApplied(getElement(), class_));

		setRequired(getElement(), false);

		assertFalse(StereotypeOperations.isApplied(getElement(), class_));

		EClass eClass = StereotypeOperations.getEClass(getElement(), String
			.valueOf(0));
		class_.createEAnnotation(
			StereotypeOperations.ANNOTATION_SOURCE__APPLIED_STEREOTYPES)
			.getContents().add(
				eClass.getEPackage().getEFactoryInstance().create(eClass));

		assertTrue(StereotypeOperations.isApplied(getElement(), class_));
	}

	/**
	 * Tests the '
	 * {@link org.eclipse.uml2.internal.operation.StereotypeOperations#isRequired(org.eclipse.uml2.Stereotype, org.eclipse.uml2.Element) <em>Is Required</em>}'
	 * method.
	 * 
	 * @see org.eclipse.uml2.internal.operation.StereotypeOperations#isRequired(org.eclipse.uml2.Stereotype,
	 *      org.eclipse.uml2.Element)
	 */
	public void testIsRequired() {
		assertFalse(StereotypeOperations.isRequired(null, null));

		assertFalse(StereotypeOperations.isRequired(getElement(), null));

		org.eclipse.uml2.Class class_ = UML2Factory.eINSTANCE.createClass();

		assertTrue(StereotypeOperations.isRequired(getElement(), class_));

		setRequired(getElement(), false);

		assertFalse(StereotypeOperations.isApplied(getElement(), class_));
	}

	/**
	 * Tests the '
	 * {@link org.eclipse.uml2.internal.operation.StereotypeOperations#setValue(org.eclipse.uml2.Stereotype, org.eclipse.uml2.Element, String, Object) <em>Set Value</em>}'
	 * method.
	 * 
	 * @see org.eclipse.uml2.internal.operation.StereotypeOperations#setValue(org.eclipse.uml2.Stereotype,
	 *      org.eclipse.uml2.Element, String, Object)
	 */
	public void testSetValue_Boolean() {

		try {
			StereotypeOperations.setValue(null, null, null, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		try {
			StereotypeOperations.setValue(getElement(), null, null, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		org.eclipse.uml2.Class class_ = UML2Factory.eINSTANCE.createClass();

		try {
			StereotypeOperations.setValue(getElement(), class_, null, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		org.eclipse.uml2.Package package_ = UML2Factory.eINSTANCE
			.createPackage();
		package_.getOwnedMembers().add(class_);

		try {
			StereotypeOperations.setValue(getElement(), class_, null, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		applyProfile(package_, getElement().getProfile());

		try {
			StereotypeOperations.setValue(getElement(), class_, null, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		try {
			StereotypeOperations.setValue(getElement(), class_, "", null); //$NON-NLS-1$
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		try {
			StereotypeOperations.setValue(getElement(), class_, "boolean", //$NON-NLS-1$
				null);
		} catch (IllegalArgumentException iae) {
			fail();
		}

		EAnnotation appliedStereotypesAnnotation = class_
			.getEAnnotation(StereotypeOperations.ANNOTATION_SOURCE__APPLIED_STEREOTYPES);

		assertNotNull(appliedStereotypesAnnotation);
		assertEquals(1, appliedStereotypesAnnotation.getContents().size());

		EObject stereotypeEObject = (EObject) appliedStereotypesAnnotation
			.getContents().get(0);

		assertEquals(Boolean.TRUE, stereotypeEObject.eGet(stereotypeEObject
			.eClass().getEStructuralFeature("boolean"))); //$NON-NLS-1$

		try {
			StereotypeOperations.setValue(getElement(), class_, "boolean", //$NON-NLS-1$
				Boolean.FALSE);
		} catch (IllegalArgumentException iae) {
			fail();
		}

		assertEquals(Boolean.FALSE, stereotypeEObject.eGet(stereotypeEObject
			.eClass().getEStructuralFeature("boolean"))); //$NON-NLS-1$

		try {
			StereotypeOperations.setValue(getElement(), class_, "boolean", //$NON-NLS-1$
				Boolean.TRUE);
		} catch (IllegalArgumentException iae) {
			fail();
		}

		assertEquals(Boolean.TRUE, stereotypeEObject.eGet(stereotypeEObject
			.eClass().getEStructuralFeature("boolean"))); //$NON-NLS-1$

		try {
			StereotypeOperations.setValue(getElement(), class_, "boolean", //$NON-NLS-1$
				String.valueOf(Boolean.FALSE));
		} catch (IllegalArgumentException iae) {
			fail();
		}

		assertEquals(Boolean.FALSE, stereotypeEObject.eGet(stereotypeEObject
			.eClass().getEStructuralFeature("boolean"))); //$NON-NLS-1$

		try {
			StereotypeOperations.setValue(getElement(), class_, "boolean", //$NON-NLS-1$
				String.valueOf(Boolean.TRUE));
		} catch (IllegalArgumentException iae) {
			fail();
		}

		assertEquals(Boolean.TRUE, stereotypeEObject.eGet(stereotypeEObject
			.eClass().getEStructuralFeature("boolean"))); //$NON-NLS-1$
	}

	/**
	 * Tests the '
	 * {@link org.eclipse.uml2.internal.operation.StereotypeOperations#setValue(org.eclipse.uml2.Stereotype, org.eclipse.uml2.Element, String, Object) <em>Set Value</em>}'
	 * method.
	 * 
	 * @see org.eclipse.uml2.internal.operation.StereotypeOperations#setValue(org.eclipse.uml2.Stereotype,
	 *      org.eclipse.uml2.Element, String, Object)
	 */
	public void testSetValue_Booleans() {

		try {
			StereotypeOperations.setValue(null, null, null, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		try {
			StereotypeOperations.setValue(getElement(), null, null, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		org.eclipse.uml2.Class class_ = UML2Factory.eINSTANCE.createClass();

		try {
			StereotypeOperations.setValue(getElement(), class_, null, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		org.eclipse.uml2.Package package_ = UML2Factory.eINSTANCE
			.createPackage();
		package_.getOwnedMembers().add(class_);

		try {
			StereotypeOperations.setValue(getElement(), class_, null, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		applyProfile(package_, getElement().getProfile());

		try {
			StereotypeOperations.setValue(getElement(), class_, null, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		try {
			StereotypeOperations.setValue(getElement(), class_, "", null); //$NON-NLS-1$
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		try {
			StereotypeOperations.setValue(getElement(), class_, "booleans", //$NON-NLS-1$
				null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		try {
			StereotypeOperations.setValue(getElement(), class_, "booleans[", //$NON-NLS-1$
				Boolean.TRUE);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		try {
			StereotypeOperations.setValue(getElement(), class_, "booleans[1", //$NON-NLS-1$
				Boolean.TRUE);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		try {
			StereotypeOperations.setValue(getElement(), class_, "booleans[1]", //$NON-NLS-1$
				null);
		} catch (IllegalArgumentException iae) {
			fail();
		}

		EAnnotation appliedStereotypesAnnotation = class_
			.getEAnnotation(StereotypeOperations.ANNOTATION_SOURCE__APPLIED_STEREOTYPES);

		assertNotNull(appliedStereotypesAnnotation);
		assertEquals(1, appliedStereotypesAnnotation.getContents().size());

		EObject stereotypeEObject = (EObject) appliedStereotypesAnnotation
			.getContents().get(0);

		assertEquals(Boolean.FALSE,
			((List) stereotypeEObject.eGet(stereotypeEObject.eClass()
				.getEStructuralFeature("booleans"))).get(0)); //$NON-NLS-1$
		assertEquals(Boolean.FALSE,
			((List) stereotypeEObject.eGet(stereotypeEObject.eClass()
				.getEStructuralFeature("booleans"))).get(1)); //$NON-NLS-1$

		try {
			StereotypeOperations.setValue(getElement(), class_, "booleans[1]", //$NON-NLS-1$
				Boolean.TRUE);
		} catch (IllegalArgumentException iae) {
			fail();
		}

		assertEquals(Boolean.TRUE,
			((List) stereotypeEObject.eGet(stereotypeEObject.eClass()
				.getEStructuralFeature("booleans"))).get(1)); //$NON-NLS-1$

		try {
			StereotypeOperations.setValue(getElement(), class_, "booleans[1]", //$NON-NLS-1$
				Boolean.FALSE);
		} catch (IllegalArgumentException iae) {
			fail();
		}

		assertEquals(Boolean.FALSE,
			((List) stereotypeEObject.eGet(stereotypeEObject.eClass()
				.getEStructuralFeature("booleans"))).get(1)); //$NON-NLS-1$

		try {
			StereotypeOperations.setValue(getElement(), class_, "booleans[1]", //$NON-NLS-1$
				String.valueOf(Boolean.TRUE));
		} catch (IllegalArgumentException iae) {
			fail();
		}

		assertEquals(Boolean.TRUE,
			((List) stereotypeEObject.eGet(stereotypeEObject.eClass()
				.getEStructuralFeature("booleans"))).get(1)); //$NON-NLS-1$

		try {
			StereotypeOperations.setValue(getElement(), class_, "booleans[1]", //$NON-NLS-1$
				String.valueOf(Boolean.FALSE));
		} catch (IllegalArgumentException iae) {
			fail();
		}

		assertEquals(Boolean.FALSE,
			((List) stereotypeEObject.eGet(stereotypeEObject.eClass()
				.getEStructuralFeature("booleans"))).get(1)); //$NON-NLS-1$
	}

	/**
	 * Tests the '
	 * {@link org.eclipse.uml2.internal.operation.StereotypeOperations#setValue(org.eclipse.uml2.Stereotype, org.eclipse.uml2.Element, String, Object) <em>Set Value</em>}'
	 * method.
	 * 
	 * @see org.eclipse.uml2.internal.operation.StereotypeOperations#setValue(org.eclipse.uml2.Stereotype,
	 *      org.eclipse.uml2.Element, String, Object)
	 */
	public void testSetValue_Integer() {

		try {
			StereotypeOperations.setValue(null, null, null, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		try {
			StereotypeOperations.setValue(getElement(), null, null, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		org.eclipse.uml2.Class class_ = UML2Factory.eINSTANCE.createClass();

		try {
			StereotypeOperations.setValue(getElement(), class_, null, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		org.eclipse.uml2.Package package_ = UML2Factory.eINSTANCE
			.createPackage();
		package_.getOwnedMembers().add(class_);

		try {
			StereotypeOperations.setValue(getElement(), class_, null, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		applyProfile(package_, getElement().getProfile());

		try {
			StereotypeOperations.setValue(getElement(), class_, null, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		try {
			StereotypeOperations.setValue(getElement(), class_, "", null); //$NON-NLS-1$
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		try {
			StereotypeOperations.setValue(getElement(), class_, "integer", //$NON-NLS-1$
				null);
		} catch (IllegalArgumentException iae) {
			fail();
		}

		EAnnotation appliedStereotypesAnnotation = class_
			.getEAnnotation(StereotypeOperations.ANNOTATION_SOURCE__APPLIED_STEREOTYPES);

		assertNotNull(appliedStereotypesAnnotation);
		assertEquals(1, appliedStereotypesAnnotation.getContents().size());

		EObject stereotypeEObject = (EObject) appliedStereotypesAnnotation
			.getContents().get(0);

		assertEquals(new Integer(Integer.MIN_VALUE), stereotypeEObject
			.eGet(stereotypeEObject.eClass().getEStructuralFeature("integer"))); //$NON-NLS-1$

		try {
			StereotypeOperations.setValue(getElement(), class_, "integer", //$NON-NLS-1$
				new Integer(0));
		} catch (IllegalArgumentException iae) {
			fail();
		}

		assertEquals(new Integer(0), stereotypeEObject.eGet(stereotypeEObject
			.eClass().getEStructuralFeature("integer"))); //$NON-NLS-1$

		try {
			StereotypeOperations.setValue(getElement(), class_, "integer", //$NON-NLS-1$
				new Integer(Integer.MIN_VALUE));
		} catch (IllegalArgumentException iae) {
			fail();
		}

		assertEquals(new Integer(Integer.MIN_VALUE), stereotypeEObject
			.eGet(stereotypeEObject.eClass().getEStructuralFeature("integer"))); //$NON-NLS-1$

		try {
			StereotypeOperations.setValue(getElement(), class_, "integer", //$NON-NLS-1$
				String.valueOf(0));
		} catch (IllegalArgumentException iae) {
			fail();
		}

		assertEquals(new Integer(0), stereotypeEObject.eGet(stereotypeEObject
			.eClass().getEStructuralFeature("integer"))); //$NON-NLS-1$

		try {
			StereotypeOperations.setValue(getElement(), class_, "integer", //$NON-NLS-1$
				String.valueOf(Integer.MIN_VALUE));
		} catch (IllegalArgumentException iae) {
			fail();
		}

		assertEquals(new Integer(Integer.MIN_VALUE), stereotypeEObject
			.eGet(stereotypeEObject.eClass().getEStructuralFeature("integer"))); //$NON-NLS-1$
	}

	/**
	 * Tests the '
	 * {@link org.eclipse.uml2.internal.operation.StereotypeOperations#setValue(org.eclipse.uml2.Stereotype, org.eclipse.uml2.Element, String, Object) <em>Set Value</em>}'
	 * method.
	 * 
	 * @see org.eclipse.uml2.internal.operation.StereotypeOperations#setValue(org.eclipse.uml2.Stereotype,
	 *      org.eclipse.uml2.Element, String, Object)
	 */
	public void testSetValue_Integers() {

		try {
			StereotypeOperations.setValue(null, null, null, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		try {
			StereotypeOperations.setValue(getElement(), null, null, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		org.eclipse.uml2.Class class_ = UML2Factory.eINSTANCE.createClass();

		try {
			StereotypeOperations.setValue(getElement(), class_, null, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		org.eclipse.uml2.Package package_ = UML2Factory.eINSTANCE
			.createPackage();
		package_.getOwnedMembers().add(class_);

		try {
			StereotypeOperations.setValue(getElement(), class_, null, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		applyProfile(package_, getElement().getProfile());

		try {
			StereotypeOperations.setValue(getElement(), class_, null, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		try {
			StereotypeOperations.setValue(getElement(), class_, "", null); //$NON-NLS-1$
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		try {
			StereotypeOperations.setValue(getElement(), class_, "integers", //$NON-NLS-1$
				null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		try {
			StereotypeOperations.setValue(getElement(), class_, "integers[", //$NON-NLS-1$
				new Integer(Integer.MIN_VALUE));
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		try {
			StereotypeOperations.setValue(getElement(), class_, "integers[1", //$NON-NLS-1$
				new Integer(Integer.MIN_VALUE));
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		try {
			StereotypeOperations.setValue(getElement(), class_, "integers[1]", //$NON-NLS-1$
				null);
		} catch (IllegalArgumentException iae) {
			fail();
		}

		EAnnotation appliedStereotypesAnnotation = class_
			.getEAnnotation(StereotypeOperations.ANNOTATION_SOURCE__APPLIED_STEREOTYPES);

		assertNotNull(appliedStereotypesAnnotation);
		assertEquals(1, appliedStereotypesAnnotation.getContents().size());

		EObject stereotypeEObject = (EObject) appliedStereotypesAnnotation
			.getContents().get(0);

		assertEquals(new Integer(0),
			((List) stereotypeEObject.eGet(stereotypeEObject.eClass()
				.getEStructuralFeature("integers"))).get(0)); //$NON-NLS-1$
		assertEquals(new Integer(0),
			((List) stereotypeEObject.eGet(stereotypeEObject.eClass()
				.getEStructuralFeature("integers"))).get(1)); //$NON-NLS-1$

		try {
			StereotypeOperations.setValue(getElement(), class_, "integers[1]", //$NON-NLS-1$
				new Integer(Integer.MIN_VALUE));
		} catch (IllegalArgumentException iae) {
			fail();
		}

		assertEquals(new Integer(Integer.MIN_VALUE),
			((List) stereotypeEObject.eGet(stereotypeEObject.eClass()
				.getEStructuralFeature("integers"))).get(1)); //$NON-NLS-1$

		try {
			StereotypeOperations.setValue(getElement(), class_, "integers[1]", //$NON-NLS-1$
				new Integer(0));
		} catch (IllegalArgumentException iae) {
			fail();
		}

		assertEquals(new Integer(0),
			((List) stereotypeEObject.eGet(stereotypeEObject.eClass()
				.getEStructuralFeature("integers"))).get(1)); //$NON-NLS-1$

		try {
			StereotypeOperations.setValue(getElement(), class_, "integers[1]", //$NON-NLS-1$
				String.valueOf(Integer.MIN_VALUE));
		} catch (IllegalArgumentException iae) {
			fail();
		}

		assertEquals(new Integer(Integer.MIN_VALUE),
			((List) stereotypeEObject.eGet(stereotypeEObject.eClass()
				.getEStructuralFeature("integers"))).get(1)); //$NON-NLS-1$

		try {
			StereotypeOperations.setValue(getElement(), class_, "integers[1]", //$NON-NLS-1$
				String.valueOf(0));
		} catch (IllegalArgumentException iae) {
			fail();
		}

		assertEquals(new Integer(0),
			((List) stereotypeEObject.eGet(stereotypeEObject.eClass()
				.getEStructuralFeature("integers"))).get(1)); //$NON-NLS-1$
	}

	/**
	 * Tests the '
	 * {@link org.eclipse.uml2.internal.operation.StereotypeOperations#setValue(org.eclipse.uml2.Stereotype, org.eclipse.uml2.Element, String, Object) <em>Set Value</em>}'
	 * method.
	 * 
	 * @see org.eclipse.uml2.internal.operation.StereotypeOperations#setValue(org.eclipse.uml2.Stereotype,
	 *      org.eclipse.uml2.Element, String, Object)
	 */
	public void testSetValue_UnlimitedNatural() {

		try {
			StereotypeOperations.setValue(null, null, null, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		try {
			StereotypeOperations.setValue(getElement(), null, null, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		org.eclipse.uml2.Class class_ = UML2Factory.eINSTANCE.createClass();

		try {
			StereotypeOperations.setValue(getElement(), class_, null, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		org.eclipse.uml2.Package package_ = UML2Factory.eINSTANCE
			.createPackage();
		package_.getOwnedMembers().add(class_);

		try {
			StereotypeOperations.setValue(getElement(), class_, null, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		applyProfile(package_, getElement().getProfile());

		try {
			StereotypeOperations.setValue(getElement(), class_, null, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		try {
			StereotypeOperations.setValue(getElement(), class_, "", null); //$NON-NLS-1$
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		try {
			StereotypeOperations.setValue(getElement(), class_,
				"unlimitedNatural", //$NON-NLS-1$
				null);
		} catch (IllegalArgumentException iae) {
			fail();
		}

		EAnnotation appliedStereotypesAnnotation = class_
			.getEAnnotation(StereotypeOperations.ANNOTATION_SOURCE__APPLIED_STEREOTYPES);

		assertNotNull(appliedStereotypesAnnotation);
		assertEquals(1, appliedStereotypesAnnotation.getContents().size());

		EObject stereotypeEObject = (EObject) appliedStereotypesAnnotation
			.getContents().get(0);

		assertEquals(new Integer(Integer.MAX_VALUE), stereotypeEObject
			.eGet(stereotypeEObject.eClass().getEStructuralFeature(
				"unlimitedNatural"))); //$NON-NLS-1$

		try {
			StereotypeOperations.setValue(getElement(), class_,
				"unlimitedNatural", //$NON-NLS-1$
				new Integer(0));
		} catch (IllegalArgumentException iae) {
			fail();
		}

		assertEquals(new Integer(0), stereotypeEObject.eGet(stereotypeEObject
			.eClass().getEStructuralFeature("unlimitedNatural"))); //$NON-NLS-1$

		try {
			StereotypeOperations.setValue(getElement(), class_,
				"unlimitedNatural", //$NON-NLS-1$
				new Integer(Integer.MAX_VALUE));
		} catch (IllegalArgumentException iae) {
			fail();
		}

		assertEquals(new Integer(Integer.MAX_VALUE), stereotypeEObject
			.eGet(stereotypeEObject.eClass().getEStructuralFeature(
				"unlimitedNatural"))); //$NON-NLS-1$

		try {
			StereotypeOperations.setValue(getElement(), class_,
				"unlimitedNatural", //$NON-NLS-1$
				String.valueOf(0));
		} catch (IllegalArgumentException iae) {
			fail();
		}

		assertEquals(new Integer(0), stereotypeEObject.eGet(stereotypeEObject
			.eClass().getEStructuralFeature("unlimitedNatural"))); //$NON-NLS-1$

		try {
			StereotypeOperations.setValue(getElement(), class_,
				"unlimitedNatural", //$NON-NLS-1$
				String.valueOf(Integer.MAX_VALUE));
		} catch (IllegalArgumentException iae) {
			fail();
		}

		assertEquals(new Integer(Integer.MAX_VALUE), stereotypeEObject
			.eGet(stereotypeEObject.eClass().getEStructuralFeature(
				"unlimitedNatural"))); //$NON-NLS-1$
	}

	/**
	 * Tests the '
	 * {@link org.eclipse.uml2.internal.operation.StereotypeOperations#setValue(org.eclipse.uml2.Stereotype, org.eclipse.uml2.Element, String, Object) <em>Set Value</em>}'
	 * method.
	 * 
	 * @see org.eclipse.uml2.internal.operation.StereotypeOperations#setValue(org.eclipse.uml2.Stereotype,
	 *      org.eclipse.uml2.Element, String, Object)
	 */
	public void testSetValue_UnlimitedNaturals() {

		try {
			StereotypeOperations.setValue(null, null, null, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		try {
			StereotypeOperations.setValue(getElement(), null, null, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		org.eclipse.uml2.Class class_ = UML2Factory.eINSTANCE.createClass();

		try {
			StereotypeOperations.setValue(getElement(), class_, null, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		org.eclipse.uml2.Package package_ = UML2Factory.eINSTANCE
			.createPackage();
		package_.getOwnedMembers().add(class_);

		try {
			StereotypeOperations.setValue(getElement(), class_, null, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		applyProfile(package_, getElement().getProfile());

		try {
			StereotypeOperations.setValue(getElement(), class_, null, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		try {
			StereotypeOperations.setValue(getElement(), class_, "", null); //$NON-NLS-1$
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		try {
			StereotypeOperations.setValue(getElement(), class_,
				"unlimitedNaturals", //$NON-NLS-1$
				null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		try {
			StereotypeOperations.setValue(getElement(), class_,
				"unlimitedNaturals[", //$NON-NLS-1$
				new Integer(Integer.MAX_VALUE));
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		try {
			StereotypeOperations.setValue(getElement(), class_,
				"unlimitedNaturals[1", //$NON-NLS-1$
				new Integer(Integer.MAX_VALUE));
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		try {
			StereotypeOperations.setValue(getElement(), class_,
				"unlimitedNaturals[1]", //$NON-NLS-1$
				null);
		} catch (IllegalArgumentException iae) {
			fail();
		}

		EAnnotation appliedStereotypesAnnotation = class_
			.getEAnnotation(StereotypeOperations.ANNOTATION_SOURCE__APPLIED_STEREOTYPES);

		assertNotNull(appliedStereotypesAnnotation);
		assertEquals(1, appliedStereotypesAnnotation.getContents().size());

		EObject stereotypeEObject = (EObject) appliedStereotypesAnnotation
			.getContents().get(0);

		assertEquals(new Integer(0), ((List) stereotypeEObject
			.eGet(stereotypeEObject.eClass().getEStructuralFeature(
				"unlimitedNaturals"))).get(0)); //$NON-NLS-1$
		assertEquals(new Integer(0), ((List) stereotypeEObject
			.eGet(stereotypeEObject.eClass().getEStructuralFeature(
				"unlimitedNaturals"))).get(1)); //$NON-NLS-1$

		try {
			StereotypeOperations.setValue(getElement(), class_,
				"unlimitedNaturals[1]", //$NON-NLS-1$
				new Integer(Integer.MAX_VALUE));
		} catch (IllegalArgumentException iae) {
			fail();
		}

		assertEquals(new Integer(Integer.MAX_VALUE), ((List) stereotypeEObject
			.eGet(stereotypeEObject.eClass().getEStructuralFeature(
				"unlimitedNaturals"))).get(1)); //$NON-NLS-1$

		try {
			StereotypeOperations.setValue(getElement(), class_,
				"unlimitedNaturals[1]", //$NON-NLS-1$
				new Integer(0));
		} catch (IllegalArgumentException iae) {
			fail();
		}

		assertEquals(new Integer(0), ((List) stereotypeEObject
			.eGet(stereotypeEObject.eClass().getEStructuralFeature(
				"unlimitedNaturals"))).get(1)); //$NON-NLS-1$

		try {
			StereotypeOperations.setValue(getElement(), class_,
				"unlimitedNaturals[1]", //$NON-NLS-1$
				String.valueOf(Integer.MAX_VALUE));
		} catch (IllegalArgumentException iae) {
			fail();
		}

		assertEquals(new Integer(Integer.MAX_VALUE), ((List) stereotypeEObject
			.eGet(stereotypeEObject.eClass().getEStructuralFeature(
				"unlimitedNaturals"))).get(1)); //$NON-NLS-1$

		try {
			StereotypeOperations.setValue(getElement(), class_,
				"unlimitedNaturals[1]", //$NON-NLS-1$
				String.valueOf(0));
		} catch (IllegalArgumentException iae) {
			fail();
		}

		assertEquals(new Integer(0), ((List) stereotypeEObject
			.eGet(stereotypeEObject.eClass().getEStructuralFeature(
				"unlimitedNaturals"))).get(1)); //$NON-NLS-1$
	}

	/**
	 * Tests the '
	 * {@link org.eclipse.uml2.internal.operation.StereotypeOperations#setValue(org.eclipse.uml2.Stereotype, org.eclipse.uml2.Element, String, Object) <em>Set Value</em>}'
	 * method.
	 * 
	 * @see org.eclipse.uml2.internal.operation.StereotypeOperations#setValue(org.eclipse.uml2.Stereotype,
	 *      org.eclipse.uml2.Element, String, Object)
	 */
	public void testSetValue_String() {

		try {
			StereotypeOperations.setValue(null, null, null, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		try {
			StereotypeOperations.setValue(getElement(), null, null, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		org.eclipse.uml2.Class class_ = UML2Factory.eINSTANCE.createClass();

		try {
			StereotypeOperations.setValue(getElement(), class_, null, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		org.eclipse.uml2.Package package_ = UML2Factory.eINSTANCE
			.createPackage();
		package_.getOwnedMembers().add(class_);

		try {
			StereotypeOperations.setValue(getElement(), class_, null, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		applyProfile(package_, getElement().getProfile());

		try {
			StereotypeOperations.setValue(getElement(), class_, null, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		try {
			StereotypeOperations.setValue(getElement(), class_, "", null); //$NON-NLS-1$
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		try {
			StereotypeOperations.setValue(getElement(), class_, "string", //$NON-NLS-1$
				null);
		} catch (IllegalArgumentException iae) {
			fail();
		}

		EAnnotation appliedStereotypesAnnotation = class_
			.getEAnnotation(StereotypeOperations.ANNOTATION_SOURCE__APPLIED_STEREOTYPES);

		assertNotNull(appliedStereotypesAnnotation);
		assertEquals(1, appliedStereotypesAnnotation.getContents().size());

		EObject stereotypeEObject = (EObject) appliedStereotypesAnnotation
			.getContents().get(0);

		assertEquals("", stereotypeEObject.eGet(stereotypeEObject //$NON-NLS-1$
			.eClass().getEStructuralFeature("string"))); //$NON-NLS-1$

		try {
			StereotypeOperations.setValue(getElement(), class_, "string", //$NON-NLS-1$
				getName());
		} catch (IllegalArgumentException iae) {
			fail();
		}

		assertEquals(getName(), stereotypeEObject.eGet(stereotypeEObject
			.eClass().getEStructuralFeature("string"))); //$NON-NLS-1$

		try {
			StereotypeOperations.setValue(getElement(), class_, "string", //$NON-NLS-1$
				""); //$NON-NLS-1$
		} catch (IllegalArgumentException iae) {
			fail();
		}

		assertEquals("", stereotypeEObject.eGet(stereotypeEObject.eClass() //$NON-NLS-1$
			.getEStructuralFeature("string"))); //$NON-NLS-1$
	}

	/**
	 * Tests the '
	 * {@link org.eclipse.uml2.internal.operation.StereotypeOperations#setValue(org.eclipse.uml2.Stereotype, org.eclipse.uml2.Element, String, Object) <em>Set Value</em>}'
	 * method.
	 * 
	 * @see org.eclipse.uml2.internal.operation.StereotypeOperations#setValue(org.eclipse.uml2.Stereotype,
	 *      org.eclipse.uml2.Element, String, Object)
	 */
	public void testSetValue_Strings() {

		try {
			StereotypeOperations.setValue(null, null, null, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		try {
			StereotypeOperations.setValue(getElement(), null, null, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		org.eclipse.uml2.Class class_ = UML2Factory.eINSTANCE.createClass();

		try {
			StereotypeOperations.setValue(getElement(), class_, null, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		org.eclipse.uml2.Package package_ = UML2Factory.eINSTANCE
			.createPackage();
		package_.getOwnedMembers().add(class_);

		try {
			StereotypeOperations.setValue(getElement(), class_, null, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		applyProfile(package_, getElement().getProfile());

		try {
			StereotypeOperations.setValue(getElement(), class_, null, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		try {
			StereotypeOperations.setValue(getElement(), class_, "", null); //$NON-NLS-1$
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		try {
			StereotypeOperations.setValue(getElement(), class_, "strings", //$NON-NLS-1$
				null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		try {
			StereotypeOperations.setValue(getElement(), class_, "strings[", //$NON-NLS-1$
				getName());
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		try {
			StereotypeOperations.setValue(getElement(), class_, "strings[1", //$NON-NLS-1$
				getName());
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		try {
			StereotypeOperations.setValue(getElement(), class_, "strings[1]", //$NON-NLS-1$
				null);
		} catch (IllegalArgumentException iae) {
			fail();
		}

		EAnnotation appliedStereotypesAnnotation = class_
			.getEAnnotation(StereotypeOperations.ANNOTATION_SOURCE__APPLIED_STEREOTYPES);

		assertNotNull(appliedStereotypesAnnotation);
		assertEquals(1, appliedStereotypesAnnotation.getContents().size());

		EObject stereotypeEObject = (EObject) appliedStereotypesAnnotation
			.getContents().get(0);

		assertEquals("", ((List) stereotypeEObject.eGet(stereotypeEObject //$NON-NLS-1$
			.eClass().getEStructuralFeature("strings"))).get(0)); //$NON-NLS-1$
		assertEquals("", ((List) stereotypeEObject //$NON-NLS-1$
			.eGet(stereotypeEObject.eClass().getEStructuralFeature("strings"))) //$NON-NLS-1$
			.get(1));

		try {
			StereotypeOperations.setValue(getElement(), class_, "strings[1]", //$NON-NLS-1$
				getName());
		} catch (IllegalArgumentException iae) {
			fail();
		}

		assertEquals(getName(), ((List) stereotypeEObject
			.eGet(stereotypeEObject.eClass().getEStructuralFeature("strings"))) //$NON-NLS-1$
			.get(1));

		try {
			StereotypeOperations.setValue(getElement(), class_, "strings[1]", //$NON-NLS-1$
				""); //$NON-NLS-1$
		} catch (IllegalArgumentException iae) {
			fail();
		}

		assertEquals("", ((List) stereotypeEObject.eGet(stereotypeEObject //$NON-NLS-1$
			.eClass().getEStructuralFeature("strings"))).get(1)); //$NON-NLS-1$
	}

	/**
	 * Tests the '
	 * {@link org.eclipse.uml2.internal.operation.StereotypeOperations#setValue(org.eclipse.uml2.Stereotype, org.eclipse.uml2.Element, String, Object) <em>Set Value</em>}'
	 * method.
	 * 
	 * @see org.eclipse.uml2.internal.operation.StereotypeOperations#setValue(org.eclipse.uml2.Stereotype,
	 *      org.eclipse.uml2.Element, String, Object)
	 */
	public void testSetValue_Enumeration() {

		try {
			StereotypeOperations.setValue(null, null, null, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		try {
			StereotypeOperations.setValue(getElement(), null, null, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		org.eclipse.uml2.Class class_ = UML2Factory.eINSTANCE.createClass();

		try {
			StereotypeOperations.setValue(getElement(), class_, null, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		org.eclipse.uml2.Package package_ = UML2Factory.eINSTANCE
			.createPackage();
		package_.getOwnedMembers().add(class_);

		try {
			StereotypeOperations.setValue(getElement(), class_, null, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		applyProfile(package_, getElement().getProfile());

		try {
			StereotypeOperations.setValue(getElement(), class_, null, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		try {
			StereotypeOperations.setValue(getElement(), class_, "", null); //$NON-NLS-1$
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		try {
			StereotypeOperations.setValue(getElement(), class_, "enumeration", //$NON-NLS-1$
				getEnumeration().getOwnedLiterals().get(0));
		} catch (IllegalArgumentException iae) {
			fail();
		}

		EAnnotation appliedStereotypesAnnotation = class_
			.getEAnnotation(StereotypeOperations.ANNOTATION_SOURCE__APPLIED_STEREOTYPES);

		assertNotNull(appliedStereotypesAnnotation);
		assertEquals(1, appliedStereotypesAnnotation.getContents().size());

		EObject stereotypeEObject = (EObject) appliedStereotypesAnnotation
			.getContents().get(0);

		assertEquals(getEnumeration().getOwnedLiterals().get(0),
			StereotypeOperations
				.getEnumerationLiteral((EEnumLiteral) stereotypeEObject
					.eGet(stereotypeEObject.eClass().getEStructuralFeature(
						"enumeration")))); //$NON-NLS-1$

		try {
			StereotypeOperations.setValue(getElement(), class_, "enumeration", //$NON-NLS-1$
				getEnumeration().getOwnedLiterals().get(1));
		} catch (IllegalArgumentException iae) {
			fail();
		}

		assertSame(getEnumeration().getOwnedLiterals().get(1),
			StereotypeOperations
				.getEnumerationLiteral((EEnumLiteral) stereotypeEObject
					.eGet(stereotypeEObject.eClass().getEStructuralFeature(
						"enumeration")))); //$NON-NLS-1$
	}

	/**
	 * Tests the '
	 * {@link org.eclipse.uml2.internal.operation.StereotypeOperations#setValue(org.eclipse.uml2.Stereotype, org.eclipse.uml2.Element, String, Object) <em>Set Value</em>}'
	 * method.
	 * 
	 * @see org.eclipse.uml2.internal.operation.StereotypeOperations#setValue(org.eclipse.uml2.Stereotype,
	 *      org.eclipse.uml2.Element, String, Object)
	 */
	public void testSetValue_Enumerations() {

		try {
			StereotypeOperations.setValue(null, null, null, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		try {
			StereotypeOperations.setValue(getElement(), null, null, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		org.eclipse.uml2.Class class_ = UML2Factory.eINSTANCE.createClass();

		try {
			StereotypeOperations.setValue(getElement(), class_, null, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		org.eclipse.uml2.Package package_ = UML2Factory.eINSTANCE
			.createPackage();
		package_.getOwnedMembers().add(class_);

		try {
			StereotypeOperations.setValue(getElement(), class_, null, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		applyProfile(package_, getElement().getProfile());

		try {
			StereotypeOperations.setValue(getElement(), class_, null, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		try {
			StereotypeOperations.setValue(getElement(), class_, "", null); //$NON-NLS-1$
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		try {
			StereotypeOperations.setValue(getElement(), class_, "enumerations", //$NON-NLS-1$
				null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		try {
			StereotypeOperations.setValue(getElement(), class_,
				"enumerations[", //$NON-NLS-1$
				getEnumeration().getOwnedLiterals().get(1));
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		try {
			StereotypeOperations.setValue(getElement(), class_,
				"enumerations[1", //$NON-NLS-1$
				getEnumeration().getOwnedLiterals().get(1));
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		try {
			StereotypeOperations.setValue(getElement(), class_,
				"enumerations[1]", //$NON-NLS-1$
				getEnumeration().getOwnedLiterals().get(1));
		} catch (IllegalArgumentException iae) {
			fail();
		}

		EAnnotation appliedStereotypesAnnotation = class_
			.getEAnnotation(StereotypeOperations.ANNOTATION_SOURCE__APPLIED_STEREOTYPES);

		assertNotNull(appliedStereotypesAnnotation);
		assertEquals(1, appliedStereotypesAnnotation.getContents().size());

		EObject stereotypeEObject = (EObject) appliedStereotypesAnnotation
			.getContents().get(0);

		assertEquals(getEnumeration().getOwnedLiterals().get(0),
			StereotypeOperations
				.getEnumerationLiteral((EEnumLiteral) ((List) stereotypeEObject
					.eGet(stereotypeEObject.eClass().getEStructuralFeature(
						"enumerations"))) //$NON-NLS-1$
					.get(0)));
		assertEquals(getEnumeration().getOwnedLiterals().get(1),
			StereotypeOperations
				.getEnumerationLiteral((EEnumLiteral) ((List) stereotypeEObject
					.eGet(stereotypeEObject.eClass().getEStructuralFeature(
						"enumerations"))) //$NON-NLS-1$
					.get(1)));

		try {
			StereotypeOperations.setValue(getElement(), class_,
				"enumerations[1]", //$NON-NLS-1$
				getEnumeration().getOwnedLiterals().get(0));
		} catch (IllegalArgumentException iae) {
			fail();
		}

		assertEquals(getEnumeration().getOwnedLiterals().get(0),
			StereotypeOperations
				.getEnumerationLiteral((EEnumLiteral) ((List) stereotypeEObject
					.eGet(stereotypeEObject.eClass().getEStructuralFeature(
						"enumerations"))) //$NON-NLS-1$
					.get(1)));
	}

	/**
	 * Tests the '
	 * {@link org.eclipse.uml2.internal.operation.StereotypeOperations#setValue(org.eclipse.uml2.Stereotype, org.eclipse.uml2.Element, String, Object) <em>Set Value</em>}'
	 * method.
	 * 
	 * @see org.eclipse.uml2.internal.operation.StereotypeOperations#setValue(org.eclipse.uml2.Stereotype,
	 *      org.eclipse.uml2.Element, String, Object)
	 */
	public void testSetValue_Class() {

		try {
			StereotypeOperations.setValue(null, null, null, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		try {
			StereotypeOperations.setValue(getElement(), null, null, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		org.eclipse.uml2.Class class_ = UML2Factory.eINSTANCE.createClass();

		try {
			StereotypeOperations.setValue(getElement(), class_, null, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		org.eclipse.uml2.Package package_ = UML2Factory.eINSTANCE
			.createPackage();
		package_.getOwnedMembers().add(class_);

		try {
			StereotypeOperations.setValue(getElement(), class_, null, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		applyProfile(package_, getElement().getProfile());

		try {
			StereotypeOperations.setValue(getElement(), class_, null, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		try {
			StereotypeOperations.setValue(getElement(), class_, "", null); //$NON-NLS-1$
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		EPackage profileEPackage = (EPackage) getElement().getProfile()
			.getEAnnotation(ProfileOperations.ANNOTATION_SOURCE__E_PACKAGES)
			.getContents().get(0);

		EClass timestampEClass = (EClass) profileEPackage
			.getEClassifier(getName() + "__Timestamp"); //$NON-NLS-1$

		EObject timestampEObject = (EObject) profileEPackage
			.getEFactoryInstance().create(timestampEClass);

		try {
			StereotypeOperations.setValue(getElement(), class_, "timestamp", //$NON-NLS-1$
				timestampEObject);
		} catch (IllegalArgumentException iae) {
			fail();
		}

		EAnnotation appliedStereotypesAnnotation = class_
			.getEAnnotation(StereotypeOperations.ANNOTATION_SOURCE__APPLIED_STEREOTYPES);

		assertNotNull(appliedStereotypesAnnotation);
		assertEquals(1, appliedStereotypesAnnotation.getContents().size());

		EObject stereotypeEObject = (EObject) appliedStereotypesAnnotation
			.getContents().get(0);

		assertEquals(timestampEObject, stereotypeEObject.eGet(stereotypeEObject
			.eClass().getEStructuralFeature("timestamp"))); //$NON-NLS-1$

		try {
			StereotypeOperations.setValue(getElement(), class_, "timestamp", //$NON-NLS-1$
				null);
		} catch (IllegalArgumentException iae) {
			fail();
		}

		assertNull(stereotypeEObject.eGet(stereotypeEObject.eClass()
			.getEStructuralFeature("timestamp"))); //$NON-NLS-1$

		EClass timeEClass = (EClass) profileEPackage.getEClassifier(getName()
			+ "__Time"); //$NON-NLS-1$

		EObject timeEObject = (EObject) profileEPackage.getEFactoryInstance()
			.create(timeEClass);

		try {
			StereotypeOperations.setValue(getElement(), class_, "timestamp" //$NON-NLS-1$
				+ NamedElement.SEPARATOR + "time", timeEObject); //$NON-NLS-1$
		} catch (IllegalArgumentException iae) {
			fail();
		}

		timestampEObject = (EObject) stereotypeEObject.eGet(stereotypeEObject
			.eClass().getEStructuralFeature("timestamp"));

		assertNotNull(timestampEObject);

		assertEquals(timeEObject, timestampEObject.eGet(timestampEClass
			.getEStructuralFeature("time"))); //$NON-NLS-1$

		try {
			StereotypeOperations.setValue(getElement(), class_, "timestamp" //$NON-NLS-1$
				+ NamedElement.SEPARATOR + "time", null); //$NON-NLS-1$
		} catch (IllegalArgumentException iae) {
			fail();
		}

		assertNull(timestampEObject.eGet(timestampEClass
			.getEStructuralFeature("time"))); //$NON-NLS-1$

		try {
			StereotypeOperations.setValue(getElement(), class_, "timestamp" //$NON-NLS-1$
				+ NamedElement.SEPARATOR + "time" + NamedElement.SEPARATOR //$NON-NLS-1$
				+ "milliseconds", new Integer(Integer.MAX_VALUE)); //$NON-NLS-1$
		} catch (IllegalArgumentException iae) {
			fail();
		}

		timeEObject = (EObject) timestampEObject.eGet(timestampEClass
			.getEStructuralFeature("time")); //$NON-NLS-1$

		assertEquals(new Integer(Integer.MAX_VALUE), timeEObject
			.eGet(timeEClass.getEStructuralFeature("milliseconds"))); //$NON-NLS-1$

		try {
			StereotypeOperations.setValue(getElement(), class_, "timestamp" //$NON-NLS-1$
				+ NamedElement.SEPARATOR + "time" + NamedElement.SEPARATOR //$NON-NLS-1$
				+ "milliseconds", new Integer(0)); //$NON-NLS-1$
		} catch (IllegalArgumentException iae) {
			fail();
		}

		assertEquals(new Integer(0), timeEObject.eGet(timeEClass
			.getEStructuralFeature("milliseconds"))); //$NON-NLS-1$
	}

	/**
	 * Tests the '
	 * {@link org.eclipse.uml2.internal.operation.StereotypeOperations#setValue(org.eclipse.uml2.Stereotype, org.eclipse.uml2.Element, String, Object) <em>Set Value</em>}'
	 * method.
	 * 
	 * @see org.eclipse.uml2.internal.operation.StereotypeOperations#setValue(org.eclipse.uml2.Stereotype,
	 *      org.eclipse.uml2.Element, String, Object)
	 */
	public void testSetValue_Classes() {

		try {
			StereotypeOperations.setValue(null, null, null, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		try {
			StereotypeOperations.setValue(getElement(), null, null, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		org.eclipse.uml2.Class class_ = UML2Factory.eINSTANCE.createClass();

		try {
			StereotypeOperations.setValue(getElement(), class_, null, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		org.eclipse.uml2.Package package_ = UML2Factory.eINSTANCE
			.createPackage();
		package_.getOwnedMembers().add(class_);

		try {
			StereotypeOperations.setValue(getElement(), class_, null, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		applyProfile(package_, getElement().getProfile());

		try {
			StereotypeOperations.setValue(getElement(), class_, null, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		try {
			StereotypeOperations.setValue(getElement(), class_, "", null); //$NON-NLS-1$
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		try {
			StereotypeOperations.setValue(getElement(), class_, "timestamps", //$NON-NLS-1$
				null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		try {
			StereotypeOperations.setValue(getElement(), class_, "timestamps[", //$NON-NLS-1$
				null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		try {
			StereotypeOperations.setValue(getElement(), class_, "timestamps[1", //$NON-NLS-1$
				null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		try {
			StereotypeOperations.setValue(getElement(), class_,
				"timestamps[1]", null); //$NON-NLS-1$
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		try {
			StereotypeOperations.setValue(getElement(), class_, "timestamps[1]" //$NON-NLS-1$
				+ NamedElement.SEPARATOR + "time", null); //$NON-NLS-1$
		} catch (IllegalArgumentException iae) {
			fail();
		}

		try {
			StereotypeOperations.setValue(getElement(), class_, "timestamps[1]" //$NON-NLS-1$
				+ NamedElement.SEPARATOR + "time" + NamedElement.SEPARATOR //$NON-NLS-1$
				+ "milliseconds", new Integer(Integer.MAX_VALUE)); //$NON-NLS-1$
		} catch (IllegalArgumentException iae) {
			fail();
		}

		EAnnotation appliedStereotypesAnnotation = class_
			.getEAnnotation(StereotypeOperations.ANNOTATION_SOURCE__APPLIED_STEREOTYPES);

		assertNotNull(appliedStereotypesAnnotation);
		assertEquals(1, appliedStereotypesAnnotation.getContents().size());

		EObject stereotypeEObject = (EObject) appliedStereotypesAnnotation
			.getContents().get(0);

		EObject timestampEObject = (EObject) ((List) stereotypeEObject
			.eGet(stereotypeEObject.eClass()
				.getEStructuralFeature("timestamps"))).get(1); //$NON-NLS-1$

		EObject timeEObject = (EObject) timestampEObject.eGet(timestampEObject
			.eClass().getEStructuralFeature("time")); //$NON-NLS-1$

		assertEquals(new Integer(Integer.MAX_VALUE), timeEObject
			.eGet(timeEObject.eClass().getEStructuralFeature("milliseconds"))); //$NON-NLS-1$

		try {
			StereotypeOperations.setValue(getElement(), class_, "timestamps[1]" //$NON-NLS-1$
				+ NamedElement.SEPARATOR + "time" + NamedElement.SEPARATOR //$NON-NLS-1$
				+ "milliseconds", new Integer(0)); //$NON-NLS-1$
		} catch (IllegalArgumentException iae) {
			fail();
		}

		assertEquals(new Integer(0), timeEObject.eGet(timeEObject.eClass()
			.getEStructuralFeature("milliseconds"))); //$NON-NLS-1$

		timestampEObject = (EObject) ((List) stereotypeEObject
			.eGet(stereotypeEObject.eClass()
				.getEStructuralFeature("timestamps"))).get(0); //$NON-NLS-1$

		try {
			StereotypeOperations.setValue(getElement(), class_,
				"timestamps[0]", null); //$NON-NLS-1$
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		EPackage profileEPackage = (EPackage) getElement().getProfile()
			.getEAnnotation(ProfileOperations.ANNOTATION_SOURCE__E_PACKAGES)
			.getContents().get(0);

		EClass timeEClass = (EClass) profileEPackage.getEClassifier(getName()
			+ "__Time"); //$NON-NLS-1$

		timeEObject = (EObject) profileEPackage.getEFactoryInstance().create(
			timeEClass);

		try {
			StereotypeOperations.setValue(getElement(), class_, "timestamps[0]" //$NON-NLS-1$
				+ NamedElement.SEPARATOR + "time", timeEObject); //$NON-NLS-1$
		} catch (IllegalArgumentException iae) {
			fail();
		}

		assertEquals(timeEObject, timestampEObject.eGet(timestampEObject
			.eClass().getEStructuralFeature("time"))); //$NON-NLS-1$

		try {
			StereotypeOperations.setValue(getElement(), class_, "timestamps[0]" //$NON-NLS-1$
				+ NamedElement.SEPARATOR + "time", null); //$NON-NLS-1$
		} catch (IllegalArgumentException iae) {
			fail();
		}

		assertNull(timestampEObject.eGet(timestampEObject.eClass()
			.getEStructuralFeature("time"))); //$NON-NLS-1$

		try {
			StereotypeOperations.setValue(getElement(), class_, "timestamps[0]" //$NON-NLS-1$
				+ NamedElement.SEPARATOR + "time" + NamedElement.SEPARATOR //$NON-NLS-1$
				+ "milliseconds", new Integer(Integer.MAX_VALUE)); //$NON-NLS-1$
		} catch (IllegalArgumentException iae) {
			fail();
		}

		timeEObject = (EObject) timestampEObject.eGet(timestampEObject.eClass()
			.getEStructuralFeature("time")); //$NON-NLS-1$

		assertEquals(new Integer(Integer.MAX_VALUE), timeEObject
			.eGet(timeEObject.eClass().getEStructuralFeature("milliseconds"))); //$NON-NLS-1$
	}

	/**
	 * Tests the '
	 * {@link org.eclipse.uml2.internal.operation.StereotypeOperations#unapply(org.eclipse.uml2.Stereotype, org.eclipse.uml2.Element) <em>Unapply</em>}'
	 * method.
	 * 
	 * @see org.eclipse.uml2.internal.operation.StereotypeOperations#unapply(org.eclipse.uml2.Stereotype,
	 *      org.eclipse.uml2.Element)
	 */
	public void testUnapply() {

		try {
			StereotypeOperations.unapply(null, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		try {
			StereotypeOperations.unapply(getElement(), null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		org.eclipse.uml2.Class class_ = UML2Factory.eINSTANCE.createClass();

		try {
			StereotypeOperations.unapply(getElement(), class_);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		org.eclipse.uml2.Package package_ = UML2Factory.eINSTANCE
			.createPackage();
		package_.getOwnedMembers().add(class_);

		try {
			StereotypeOperations.unapply(getElement(), class_);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		applyProfile(package_, getElement().getProfile());

		try {
			StereotypeOperations.unapply(getElement(), class_);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		setRequired(getElement(), false);

		try {
			StereotypeOperations.unapply(getElement(), class_);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		EAnnotation appliedStereotypesAnnotation = class_
			.createEAnnotation(StereotypeOperations.ANNOTATION_SOURCE__APPLIED_STEREOTYPES);

		EClass eClass = StereotypeOperations.getEClass(getElement(), String
			.valueOf(0));
		appliedStereotypesAnnotation.getContents().add(
			eClass.getEPackage().getEFactoryInstance().create(eClass));

		try {
			StereotypeOperations.unapply(getElement(), class_);
		} catch (IllegalArgumentException iae) {
			fail();
		}

		assertEquals(0, appliedStereotypesAnnotation.getContents().size());

		try {
			StereotypeOperations.unapply(getElement(), class_);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}
	}

	/**
	 * Tests the '
	 * {@link org.eclipse.uml2.internal.operation.StereotypeOperations#getProfile(org.eclipse.uml2.Stereotype) <em>Get Profile</em>}'
	 * method.
	 * 
	 * @see org.eclipse.uml2.internal.operation.StereotypeOperations#getProfile(org.eclipse.uml2.Stereotype)
	 */
	public void testGetProfile() {
		assertNull(StereotypeOperations.getProfile(null));

		setElement(UML2Factory.eINSTANCE.createStereotype());

		assertNull(StereotypeOperations.getProfile(getElement()));

		Profile profile = UML2Factory.eINSTANCE.createProfile();
		profile.getOwnedMembers().add(getElement());

		assertSame(profile, StereotypeOperations.getProfile(getElement()));
	}

	/**
	 * Tests the '
	 * {@link org.eclipse.uml2.internal.operation.StereotypeOperations#hasValue(org.eclipse.uml2.Stereotype, org.eclipse.uml2.Element, String) <em>Has Value</em>}'
	 * method.
	 * 
	 * @see org.eclipse.uml2.internal.operation.StereotypeOperations#hasValue(org.eclipse.uml2.Stereotype,
	 *      org.eclipse.uml2.Element, String)
	 */
	public void testHasValue_Boolean() {

		try {
			assertFalse(StereotypeOperations.hasValue(null, null, null));
		} catch (IllegalArgumentException iae) {
			fail();
		}

		try {
			assertFalse(StereotypeOperations.hasValue(getElement(), null, null));
		} catch (IllegalArgumentException iae) {
			fail();
		}

		org.eclipse.uml2.Class class_ = UML2Factory.eINSTANCE.createClass();

		try {
			assertFalse(StereotypeOperations.hasValue(getElement(), class_,
				null));
		} catch (IllegalArgumentException iae) {
			fail();
		}

		org.eclipse.uml2.Package package_ = UML2Factory.eINSTANCE
			.createPackage();
		package_.getOwnedMembers().add(class_);

		try {
			assertFalse(StereotypeOperations.hasValue(getElement(), class_,
				null));
		} catch (IllegalArgumentException iae) {
			fail();
		}

		applyProfile(package_, getElement().getProfile());

		try {
			assertFalse(StereotypeOperations.hasValue(getElement(), class_,
				null));
		} catch (IllegalArgumentException iae) {
			fail();
		}

		try {
			assertFalse(StereotypeOperations.hasValue(getElement(), class_, "")); //$NON-NLS-1$
		} catch (IllegalArgumentException iae) {
			fail();
		}

		try {
			assertFalse(StereotypeOperations.hasValue(getElement(), class_,
				"boolean")); //$NON-NLS-1$
		} catch (IllegalArgumentException iae) {
			fail();
		}

		setRequired(getElement(), false);

		try {
			assertFalse(StereotypeOperations.hasValue(getElement(), class_,
				"boolean")); //$NON-NLS-1$
		} catch (IllegalArgumentException iae) {
			fail();
		}

		EClass eClass = StereotypeOperations.getEClass(getElement(), String
			.valueOf(0));
		EObject stereotypeEObject = eClass.getEPackage().getEFactoryInstance()
			.create(eClass);
		class_.createEAnnotation(
			StereotypeOperations.ANNOTATION_SOURCE__APPLIED_STEREOTYPES)
			.getContents().add(stereotypeEObject);

		try {
			assertFalse(StereotypeOperations.hasValue(getElement(), class_,
				"boolean")); //$NON-NLS-1$
		} catch (IllegalArgumentException iae) {
			fail();
		}

		stereotypeEObject.eSet(eClass.getEStructuralFeature("boolean"), //$NON-NLS-1$
			Boolean.FALSE);

		try {
			assertTrue(StereotypeOperations.hasValue(getElement(), class_,
				"boolean")); //$NON-NLS-1$
		} catch (IllegalArgumentException iae) {
			fail();
		}

		stereotypeEObject.eSet(eClass.getEStructuralFeature("boolean"), //$NON-NLS-1$
			Boolean.TRUE);

		try {
			assertFalse(StereotypeOperations.hasValue(getElement(), class_,
				"boolean")); //$NON-NLS-1$
		} catch (IllegalArgumentException iae) {
			fail();
		}
	}

	/**
	 * Tests the '
	 * {@link org.eclipse.uml2.internal.operation.StereotypeOperations#hasValue(org.eclipse.uml2.Stereotype, org.eclipse.uml2.Element, String) <em>Has Value</em>}'
	 * method.
	 * 
	 * @see org.eclipse.uml2.internal.operation.StereotypeOperations#hasValue(org.eclipse.uml2.Stereotype,
	 *      org.eclipse.uml2.Element, String)
	 */
	public void testHasValue_Booleans() {

		try {
			assertFalse(StereotypeOperations.hasValue(null, null, null));
		} catch (IllegalArgumentException iae) {
			fail();
		}

		try {
			assertFalse(StereotypeOperations.hasValue(getElement(), null, null));
		} catch (IllegalArgumentException iae) {
			fail();
		}

		org.eclipse.uml2.Class class_ = UML2Factory.eINSTANCE.createClass();

		try {
			assertFalse(StereotypeOperations.hasValue(getElement(), class_,
				null));
		} catch (IllegalArgumentException iae) {
			fail();
		}

		org.eclipse.uml2.Package package_ = UML2Factory.eINSTANCE
			.createPackage();
		package_.getOwnedMembers().add(class_);

		try {
			assertFalse(StereotypeOperations.hasValue(getElement(), class_,
				null));
		} catch (IllegalArgumentException iae) {
			fail();
		}

		applyProfile(package_, getElement().getProfile());

		try {
			assertFalse(StereotypeOperations.hasValue(getElement(), class_,
				null));
		} catch (IllegalArgumentException iae) {
			fail();
		}

		try {
			assertFalse(StereotypeOperations.hasValue(getElement(), class_,
				null));
		} catch (IllegalArgumentException iae) {
			fail();
		}

		try {
			assertFalse(StereotypeOperations.hasValue(getElement(), class_,
				"booleans")); //$NON-NLS-1$
		} catch (IllegalArgumentException iae) {
			fail();
		}

		setRequired(getElement(), false);

		try {
			assertFalse(StereotypeOperations.hasValue(getElement(), class_,
				"booleans")); //$NON-NLS-1$
		} catch (IllegalArgumentException iae) {
			fail();
		}

		EClass eClass = StereotypeOperations.getEClass(getElement(), String
			.valueOf(0));
		EObject stereotypeEObject = eClass.getEPackage().getEFactoryInstance()
			.create(eClass);
		class_.createEAnnotation(
			StereotypeOperations.ANNOTATION_SOURCE__APPLIED_STEREOTYPES)
			.getContents().add(stereotypeEObject);

		try {
			assertFalse(StereotypeOperations.hasValue(getElement(), class_,
				"booleans")); //$NON-NLS-1$
		} catch (IllegalArgumentException iae) {
			fail();
		}

		try {
			assertFalse(StereotypeOperations.hasValue(getElement(), class_,
				"booleans[")); //$NON-NLS-1$
		} catch (IllegalArgumentException iae) {
			fail();
		}

		try {
			assertFalse(StereotypeOperations.hasValue(getElement(), class_,
				"booleans[0")); //$NON-NLS-1$
		} catch (IllegalArgumentException iae) {
			fail();
		}

		try {
			assertFalse(StereotypeOperations.hasValue(getElement(), class_,
				"booleans[0]")); //$NON-NLS-1$
			fail();
		} catch (IndexOutOfBoundsException ioobe) {
			// pass
		}

		((List) stereotypeEObject
			.eGet(eClass.getEStructuralFeature("booleans"))) //$NON-NLS-1$
			.add(Boolean.TRUE);

		try {
			assertTrue(StereotypeOperations.hasValue(getElement(), class_,
				"booleans")); //$NON-NLS-1$
		} catch (IndexOutOfBoundsException ioobe) {
			fail();
		}

		try {
			assertTrue(StereotypeOperations.hasValue(getElement(), class_,
				"booleans[0]")); //$NON-NLS-1$
		} catch (IndexOutOfBoundsException ioobe) {
			fail();
		}

		((List) stereotypeEObject
			.eGet(eClass.getEStructuralFeature("booleans"))) //$NON-NLS-1$
			.set(0, Boolean.FALSE);

		try {
			assertTrue(StereotypeOperations.hasValue(getElement(), class_,
				"booleans")); //$NON-NLS-1$
		} catch (IndexOutOfBoundsException ioobe) {
			fail();
		}

		try {
			assertFalse(StereotypeOperations.hasValue(getElement(), class_,
				"booleans[0]")); //$NON-NLS-1$
		} catch (IndexOutOfBoundsException ioobe) {
			fail();
		}
	}

	/**
	 * Tests the '
	 * {@link org.eclipse.uml2.internal.operation.StereotypeOperations#hasValue(org.eclipse.uml2.Stereotype, org.eclipse.uml2.Element, String) <em>Has Value</em>}'
	 * method.
	 * 
	 * @see org.eclipse.uml2.internal.operation.StereotypeOperations#hasValue(org.eclipse.uml2.Stereotype,
	 *      org.eclipse.uml2.Element, String)
	 */
	public void testHasValue_Integer() {

		try {
			assertFalse(StereotypeOperations.hasValue(null, null, null));
		} catch (IllegalArgumentException iae) {
			fail();
		}

		try {
			assertFalse(StereotypeOperations.hasValue(getElement(), null, null));
		} catch (IllegalArgumentException iae) {
			fail();
		}

		org.eclipse.uml2.Class class_ = UML2Factory.eINSTANCE.createClass();

		try {
			assertFalse(StereotypeOperations.hasValue(getElement(), class_,
				null));
		} catch (IllegalArgumentException iae) {
			fail();
		}

		org.eclipse.uml2.Package package_ = UML2Factory.eINSTANCE
			.createPackage();
		package_.getOwnedMembers().add(class_);

		try {
			assertFalse(StereotypeOperations.hasValue(getElement(), class_,
				null));
		} catch (IllegalArgumentException iae) {
			fail();
		}

		applyProfile(package_, getElement().getProfile());

		try {
			assertFalse(StereotypeOperations.hasValue(getElement(), class_,
				null));
		} catch (IllegalArgumentException iae) {
			fail();
		}

		try {
			assertFalse(StereotypeOperations.hasValue(getElement(), class_, "")); //$NON-NLS-1$
		} catch (IllegalArgumentException iae) {
			fail();
		}

		try {
			assertFalse(StereotypeOperations.hasValue(getElement(), class_,
				"integer")); //$NON-NLS-1$
		} catch (IllegalArgumentException iae) {
			fail();
		}

		setRequired(getElement(), false);

		try {
			assertFalse(StereotypeOperations.hasValue(getElement(), class_,
				"integer")); //$NON-NLS-1$
		} catch (IllegalArgumentException iae) {
			fail();
		}

		EClass eClass = StereotypeOperations.getEClass(getElement(), String
			.valueOf(0));
		EObject stereotypeEObject = eClass.getEPackage().getEFactoryInstance()
			.create(eClass);
		class_.createEAnnotation(
			StereotypeOperations.ANNOTATION_SOURCE__APPLIED_STEREOTYPES)
			.getContents().add(stereotypeEObject);

		try {
			assertFalse(StereotypeOperations.hasValue(getElement(), class_,
				"integer")); //$NON-NLS-1$
		} catch (IllegalArgumentException iae) {
			fail();
		}

		stereotypeEObject.eSet(eClass.getEStructuralFeature("integer"), //$NON-NLS-1$
			new Integer(Integer.MAX_VALUE));

		try {
			assertTrue(StereotypeOperations.hasValue(getElement(), class_,
				"integer")); //$NON-NLS-1$
		} catch (IllegalArgumentException iae) {
			fail();
		}

		stereotypeEObject.eSet(eClass.getEStructuralFeature("integer"), //$NON-NLS-1$
			new Integer(Integer.MIN_VALUE));

		try {
			assertFalse(StereotypeOperations.hasValue(getElement(), class_,
				"integer")); //$NON-NLS-1$
		} catch (IllegalArgumentException iae) {
			fail();
		}
	}

	/**
	 * Tests the '
	 * {@link org.eclipse.uml2.internal.operation.StereotypeOperations#hasValue(org.eclipse.uml2.Stereotype, org.eclipse.uml2.Element, String) <em>Has Value</em>}'
	 * method.
	 * 
	 * @see org.eclipse.uml2.internal.operation.StereotypeOperations#hasValue(org.eclipse.uml2.Stereotype,
	 *      org.eclipse.uml2.Element, String)
	 */
	public void testHasValue_Integers() {

		try {
			assertFalse(StereotypeOperations.hasValue(null, null, null));
		} catch (IllegalArgumentException iae) {
			fail();
		}

		try {
			assertFalse(StereotypeOperations.hasValue(getElement(), null, null));
		} catch (IllegalArgumentException iae) {
			fail();
		}

		org.eclipse.uml2.Class class_ = UML2Factory.eINSTANCE.createClass();

		try {
			assertFalse(StereotypeOperations.hasValue(getElement(), class_,
				null));
		} catch (IllegalArgumentException iae) {
			fail();
		}

		org.eclipse.uml2.Package package_ = UML2Factory.eINSTANCE
			.createPackage();
		package_.getOwnedMembers().add(class_);

		try {
			assertFalse(StereotypeOperations.hasValue(getElement(), class_,
				null));
		} catch (IllegalArgumentException iae) {
			fail();
		}

		applyProfile(package_, getElement().getProfile());

		try {
			assertFalse(StereotypeOperations.hasValue(getElement(), class_,
				null));
		} catch (IllegalArgumentException iae) {
			fail();
		}

		try {
			assertFalse(StereotypeOperations.hasValue(getElement(), class_, "")); //$NON-NLS-1$
		} catch (IllegalArgumentException iae) {
			fail();
		}

		try {
			assertFalse(StereotypeOperations.hasValue(getElement(), class_,
				"integers")); //$NON-NLS-1$
		} catch (IllegalArgumentException iae) {
			fail();
		}

		setRequired(getElement(), false);

		try {
			assertFalse(StereotypeOperations.hasValue(getElement(), class_,
				"integers")); //$NON-NLS-1$
		} catch (IllegalArgumentException iae) {
			fail();
		}

		EClass eClass = StereotypeOperations.getEClass(getElement(), String
			.valueOf(0));
		EObject stereotypeEObject = eClass.getEPackage().getEFactoryInstance()
			.create(eClass);
		class_.createEAnnotation(
			StereotypeOperations.ANNOTATION_SOURCE__APPLIED_STEREOTYPES)
			.getContents().add(stereotypeEObject);

		try {
			assertFalse(StereotypeOperations.hasValue(getElement(), class_,
				"integers")); //$NON-NLS-1$
		} catch (IllegalArgumentException iae) {
			fail();
		}

		try {
			assertFalse(StereotypeOperations.hasValue(getElement(), class_,
				"integers[")); //$NON-NLS-1$
		} catch (IllegalArgumentException iae) {
			fail();
		}

		try {
			assertFalse(StereotypeOperations.hasValue(getElement(), class_,
				"integers[0")); //$NON-NLS-1$
		} catch (IllegalArgumentException iae) {
			fail();
		}

		try {
			assertFalse(StereotypeOperations.hasValue(getElement(), class_,
				"integers[0]")); //$NON-NLS-1$
			fail();
		} catch (IndexOutOfBoundsException ioobe) {
			// pass
		}

		((List) stereotypeEObject
			.eGet(eClass.getEStructuralFeature("integers"))) //$NON-NLS-1$
			.add(new Integer(Integer.MIN_VALUE));

		try {
			assertTrue(StereotypeOperations.hasValue(getElement(), class_,
				"integers")); //$NON-NLS-1$
		} catch (IndexOutOfBoundsException ioobe) {
			fail();
		}

		try {
			assertTrue(StereotypeOperations.hasValue(getElement(), class_,
				"integers[0]")); //$NON-NLS-1$
		} catch (IndexOutOfBoundsException ioobe) {
			fail();
		}

		((List) stereotypeEObject
			.eGet(eClass.getEStructuralFeature("integers"))) //$NON-NLS-1$
			.set(0, new Integer(0));

		try {
			assertTrue(StereotypeOperations.hasValue(getElement(), class_,
				"integers")); //$NON-NLS-1$
		} catch (IndexOutOfBoundsException ioobe) {
			fail();
		}

		try {
			assertFalse(StereotypeOperations.hasValue(getElement(), class_,
				"integers[0]")); //$NON-NLS-1$
		} catch (IndexOutOfBoundsException ioobe) {
			fail();
		}
	}

	/**
	 * Tests the '
	 * {@link org.eclipse.uml2.internal.operation.StereotypeOperations#hasValue(org.eclipse.uml2.Stereotype, org.eclipse.uml2.Element, String) <em>Has Value</em>}'
	 * method.
	 * 
	 * @see org.eclipse.uml2.internal.operation.StereotypeOperations#hasValue(org.eclipse.uml2.Stereotype,
	 *      org.eclipse.uml2.Element, String)
	 */
	public void testHasValue_String() {

		try {
			assertFalse(StereotypeOperations.hasValue(null, null, null));
		} catch (IllegalArgumentException iae) {
			fail();
		}

		try {
			assertFalse(StereotypeOperations.hasValue(getElement(), null, null));
		} catch (IllegalArgumentException iae) {
			fail();
		}

		org.eclipse.uml2.Class class_ = UML2Factory.eINSTANCE.createClass();

		try {
			assertFalse(StereotypeOperations.hasValue(getElement(), class_,
				null));
		} catch (IllegalArgumentException iae) {
			fail();
		}

		org.eclipse.uml2.Package package_ = UML2Factory.eINSTANCE
			.createPackage();
		package_.getOwnedMembers().add(class_);

		try {
			assertFalse(StereotypeOperations.hasValue(getElement(), class_,
				null));
		} catch (IllegalArgumentException iae) {
			fail();
		}

		applyProfile(package_, getElement().getProfile());

		try {
			assertFalse(StereotypeOperations.hasValue(getElement(), class_,
				null));
		} catch (IllegalArgumentException iae) {
			fail();
		}

		try {
			assertFalse(StereotypeOperations.hasValue(getElement(), class_, "")); //$NON-NLS-1$
		} catch (IllegalArgumentException iae) {
			fail();
		}

		try {
			assertFalse(StereotypeOperations.hasValue(getElement(), class_,
				"string")); //$NON-NLS-1$
		} catch (IllegalArgumentException iae) {
			fail();
		}

		setRequired(getElement(), false);

		try {
			assertFalse(StereotypeOperations.hasValue(getElement(), class_,
				"string")); //$NON-NLS-1$
		} catch (IllegalArgumentException iae) {
			fail();
		}

		EClass eClass = StereotypeOperations.getEClass(getElement(), String
			.valueOf(0));
		EObject stereotypeEObject = eClass.getEPackage().getEFactoryInstance()
			.create(eClass);
		class_.createEAnnotation(
			StereotypeOperations.ANNOTATION_SOURCE__APPLIED_STEREOTYPES)
			.getContents().add(stereotypeEObject);

		try {
			assertFalse(StereotypeOperations.hasValue(getElement(), class_,
				"string")); //$NON-NLS-1$
		} catch (IllegalArgumentException iae) {
			fail();
		}

		stereotypeEObject.eSet(eClass.getEStructuralFeature("string"), //$NON-NLS-1$
			getName());

		try {
			assertTrue(StereotypeOperations.hasValue(getElement(), class_,
				"string")); //$NON-NLS-1$
		} catch (IllegalArgumentException iae) {
			fail();
		}

		stereotypeEObject.eSet(eClass.getEStructuralFeature("string"), //$NON-NLS-1$
			"");

		try {
			assertFalse(StereotypeOperations.hasValue(getElement(), class_,
				"string")); //$NON-NLS-1$
		} catch (IllegalArgumentException iae) {
			fail();
		}
	}

	/**
	 * Tests the '
	 * {@link org.eclipse.uml2.internal.operation.StereotypeOperations#hasValue(org.eclipse.uml2.Stereotype, org.eclipse.uml2.Element, String) <em>Has Value</em>}'
	 * method.
	 * 
	 * @see org.eclipse.uml2.internal.operation.StereotypeOperations#hasValue(org.eclipse.uml2.Stereotype,
	 *      org.eclipse.uml2.Element, String)
	 */
	public void testHasValue_Strings() {

		try {
			assertFalse(StereotypeOperations.hasValue(null, null, null));
		} catch (IllegalArgumentException iae) {
			fail();
		}

		try {
			assertFalse(StereotypeOperations.hasValue(getElement(), null, null));
		} catch (IllegalArgumentException iae) {
			fail();
		}

		org.eclipse.uml2.Class class_ = UML2Factory.eINSTANCE.createClass();

		try {
			assertFalse(StereotypeOperations.hasValue(getElement(), class_,
				null));
		} catch (IllegalArgumentException iae) {
			fail();
		}

		org.eclipse.uml2.Package package_ = UML2Factory.eINSTANCE
			.createPackage();
		package_.getOwnedMembers().add(class_);

		try {
			assertFalse(StereotypeOperations.hasValue(getElement(), class_,
				null));
		} catch (IllegalArgumentException iae) {
			fail();
		}

		applyProfile(package_, getElement().getProfile());

		try {
			assertFalse(StereotypeOperations.hasValue(getElement(), class_,
				null));
		} catch (IllegalArgumentException iae) {
			fail();
		}

		try {
			assertFalse(StereotypeOperations.hasValue(getElement(), class_, "")); //$NON-NLS-1$
		} catch (IllegalArgumentException iae) {
			fail();
		}

		try {
			assertFalse(StereotypeOperations.hasValue(getElement(), class_,
				"strings")); //$NON-NLS-1$
		} catch (IllegalArgumentException iae) {
			fail();
		}

		setRequired(getElement(), false);

		try {
			assertFalse(StereotypeOperations.hasValue(getElement(), class_,
				"strings")); //$NON-NLS-1$
		} catch (IllegalArgumentException iae) {
			fail();
		}

		EClass eClass = StereotypeOperations.getEClass(getElement(), String
			.valueOf(0));
		EObject stereotypeEObject = eClass.getEPackage().getEFactoryInstance()
			.create(eClass);
		class_.createEAnnotation(
			StereotypeOperations.ANNOTATION_SOURCE__APPLIED_STEREOTYPES)
			.getContents().add(stereotypeEObject);

		try {
			assertFalse(StereotypeOperations.hasValue(getElement(), class_,
				"strings")); //$NON-NLS-1$
		} catch (IllegalArgumentException iae) {
			fail();
		}

		try {
			assertFalse(StereotypeOperations.hasValue(getElement(), class_,
				"strings[")); //$NON-NLS-1$
		} catch (IllegalArgumentException iae) {
			fail();
		}

		try {
			assertFalse(StereotypeOperations.hasValue(getElement(), class_,
				"strings[0")); //$NON-NLS-1$
		} catch (IllegalArgumentException iae) {
			fail();
		}

		try {
			assertFalse(StereotypeOperations.hasValue(getElement(), class_,
				"strings[0]")); //$NON-NLS-1$
			fail();
		} catch (IndexOutOfBoundsException ioobe) {
			// pass
		}

		((List) stereotypeEObject.eGet(eClass.getEStructuralFeature("strings"))) //$NON-NLS-1$
			.add(getName());

		try {
			assertTrue(StereotypeOperations.hasValue(getElement(), class_,
				"strings")); //$NON-NLS-1$
		} catch (IndexOutOfBoundsException ioobe) {
			fail();
		}

		try {
			assertTrue(StereotypeOperations.hasValue(getElement(), class_,
				"strings[0]")); //$NON-NLS-1$
		} catch (IndexOutOfBoundsException ioobe) {
			fail();
		}

		((List) stereotypeEObject.eGet(eClass.getEStructuralFeature("strings"))) //$NON-NLS-1$
			.set(0, "");

		try {
			assertTrue(StereotypeOperations.hasValue(getElement(), class_,
				"strings")); //$NON-NLS-1$
		} catch (IndexOutOfBoundsException ioobe) {
			fail();
		}

		try {
			assertFalse(StereotypeOperations.hasValue(getElement(), class_,
				"strings[0]")); //$NON-NLS-1$
		} catch (IndexOutOfBoundsException ioobe) {
			fail();
		}
	}

	/**
	 * Tests the '
	 * {@link org.eclipse.uml2.internal.operation.StereotypeOperations#hasValue(org.eclipse.uml2.Stereotype, org.eclipse.uml2.Element, String) <em>Has Value</em>}'
	 * method.
	 * 
	 * @see org.eclipse.uml2.internal.operation.StereotypeOperations#hasValue(org.eclipse.uml2.Stereotype,
	 *      org.eclipse.uml2.Element, String)
	 */
	public void testHasValue_UnlimitedNatural() {

		try {
			assertFalse(StereotypeOperations.hasValue(null, null, null));
		} catch (IllegalArgumentException iae) {
			fail();
		}

		try {
			assertFalse(StereotypeOperations.hasValue(getElement(), null, null));
		} catch (IllegalArgumentException iae) {
			fail();
		}

		org.eclipse.uml2.Class class_ = UML2Factory.eINSTANCE.createClass();

		try {
			assertFalse(StereotypeOperations.hasValue(getElement(), class_,
				null));
		} catch (IllegalArgumentException iae) {
			fail();
		}

		org.eclipse.uml2.Package package_ = UML2Factory.eINSTANCE
			.createPackage();
		package_.getOwnedMembers().add(class_);

		try {
			assertFalse(StereotypeOperations.hasValue(getElement(), class_,
				null));
		} catch (IllegalArgumentException iae) {
			fail();
		}

		applyProfile(package_, getElement().getProfile());

		try {
			assertFalse(StereotypeOperations.hasValue(getElement(), class_,
				null));
		} catch (IllegalArgumentException iae) {
			fail();
		}

		try {
			assertFalse(StereotypeOperations.hasValue(getElement(), class_, "")); //$NON-NLS-1$
		} catch (IllegalArgumentException iae) {
			fail();
		}

		try {
			assertFalse(StereotypeOperations.hasValue(getElement(), class_,
				"unlimitedNatural")); //$NON-NLS-1$
		} catch (IllegalArgumentException iae) {
			fail();
		}

		setRequired(getElement(), false);

		try {
			assertFalse(StereotypeOperations.hasValue(getElement(), class_,
				"unlimitedNatural")); //$NON-NLS-1$
		} catch (IllegalArgumentException iae) {
			fail();
		}

		EClass eClass = StereotypeOperations.getEClass(getElement(), String
			.valueOf(0));
		EObject stereotypeEObject = eClass.getEPackage().getEFactoryInstance()
			.create(eClass);
		class_.createEAnnotation(
			StereotypeOperations.ANNOTATION_SOURCE__APPLIED_STEREOTYPES)
			.getContents().add(stereotypeEObject);

		try {
			assertFalse(StereotypeOperations.hasValue(getElement(), class_,
				"unlimitedNatural")); //$NON-NLS-1$
		} catch (IllegalArgumentException iae) {
			fail();
		}

		stereotypeEObject.eSet(
			eClass.getEStructuralFeature("unlimitedNatural"), //$NON-NLS-1$
			new Integer(Integer.MIN_VALUE));

		try {
			assertTrue(StereotypeOperations.hasValue(getElement(), class_,
				"unlimitedNatural")); //$NON-NLS-1$
		} catch (IllegalArgumentException iae) {
			fail();
		}

		stereotypeEObject.eSet(
			eClass.getEStructuralFeature("unlimitedNatural"), //$NON-NLS-1$
			new Integer(Integer.MAX_VALUE));

		try {
			assertFalse(StereotypeOperations.hasValue(getElement(), class_,
				"unlimitedNatural")); //$NON-NLS-1$
		} catch (IllegalArgumentException iae) {
			fail();
		}
	}

	/**
	 * Tests the '
	 * {@link org.eclipse.uml2.internal.operation.StereotypeOperations#hasValue(org.eclipse.uml2.Stereotype, org.eclipse.uml2.Element, String) <em>Has Value</em>}'
	 * method.
	 * 
	 * @see org.eclipse.uml2.internal.operation.StereotypeOperations#hasValue(org.eclipse.uml2.Stereotype,
	 *      org.eclipse.uml2.Element, String)
	 */
	public void testHasValue_UnlimitedNaturals() {

		try {
			assertFalse(StereotypeOperations.hasValue(null, null, null));
		} catch (IllegalArgumentException iae) {
			fail();
		}

		try {
			assertFalse(StereotypeOperations.hasValue(getElement(), null, null));
		} catch (IllegalArgumentException iae) {
			fail();
		}

		org.eclipse.uml2.Class class_ = UML2Factory.eINSTANCE.createClass();

		try {
			assertFalse(StereotypeOperations.hasValue(getElement(), class_,
				null));
		} catch (IllegalArgumentException iae) {
			fail();
		}

		org.eclipse.uml2.Package package_ = UML2Factory.eINSTANCE
			.createPackage();
		package_.getOwnedMembers().add(class_);

		try {
			assertFalse(StereotypeOperations.hasValue(getElement(), class_,
				null));
		} catch (IllegalArgumentException iae) {
			fail();
		}

		applyProfile(package_, getElement().getProfile());

		try {
			assertFalse(StereotypeOperations.hasValue(getElement(), class_,
				null));
		} catch (IllegalArgumentException iae) {
			fail();
		}

		try {
			assertFalse(StereotypeOperations.hasValue(getElement(), class_, "")); //$NON-NLS-1$
		} catch (IllegalArgumentException iae) {
			fail();
		}

		try {
			assertFalse(StereotypeOperations.hasValue(getElement(), class_,
				"unlimitedNaturals")); //$NON-NLS-1$
		} catch (IllegalArgumentException iae) {
			fail();
		}

		setRequired(getElement(), false);

		try {
			assertFalse(StereotypeOperations.hasValue(getElement(), class_,
				"unlimitedNaturals")); //$NON-NLS-1$
		} catch (IllegalArgumentException iae) {
			fail();
		}

		EClass eClass = StereotypeOperations.getEClass(getElement(), String
			.valueOf(0));
		EObject stereotypeEObject = eClass.getEPackage().getEFactoryInstance()
			.create(eClass);
		class_.createEAnnotation(
			StereotypeOperations.ANNOTATION_SOURCE__APPLIED_STEREOTYPES)
			.getContents().add(stereotypeEObject);

		try {
			assertFalse(StereotypeOperations.hasValue(getElement(), class_,
				"unlimitedNaturals")); //$NON-NLS-1$
		} catch (IllegalArgumentException iae) {
			fail();
		}

		try {
			assertFalse(StereotypeOperations.hasValue(getElement(), class_,
				"unlimitedNaturals[")); //$NON-NLS-1$
		} catch (IllegalArgumentException iae) {
			fail();
		}

		try {
			assertFalse(StereotypeOperations.hasValue(getElement(), class_,
				"unlimitedNaturals[0")); //$NON-NLS-1$
		} catch (IllegalArgumentException iae) {
			fail();
		}

		try {
			assertFalse(StereotypeOperations.hasValue(getElement(), class_,
				"unlimitedNaturals[0]")); //$NON-NLS-1$
			fail();
		} catch (IndexOutOfBoundsException ioobe) {
			// pass
		}

		((List) stereotypeEObject.eGet(eClass
			.getEStructuralFeature("unlimitedNaturals"))) //$NON-NLS-1$
			.add(new Integer(Integer.MAX_VALUE));

		try {
			assertTrue(StereotypeOperations.hasValue(getElement(), class_,
				"unlimitedNaturals")); //$NON-NLS-1$
		} catch (IndexOutOfBoundsException ioobe) {
			fail();
		}

		try {
			assertTrue(StereotypeOperations.hasValue(getElement(), class_,
				"unlimitedNaturals[0]")); //$NON-NLS-1$
		} catch (IndexOutOfBoundsException ioobe) {
			fail();
		}

		((List) stereotypeEObject.eGet(eClass
			.getEStructuralFeature("unlimitedNaturals"))) //$NON-NLS-1$
			.set(0, new Integer(0));

		try {
			assertTrue(StereotypeOperations.hasValue(getElement(), class_,
				"unlimitedNaturals")); //$NON-NLS-1$
		} catch (IndexOutOfBoundsException ioobe) {
			fail();
		}

		try {
			assertFalse(StereotypeOperations.hasValue(getElement(), class_,
				"unlimitedNaturals[0]")); //$NON-NLS-1$
		} catch (IndexOutOfBoundsException ioobe) {
			fail();
		}
	}

	/**
	 * Tests the '
	 * {@link org.eclipse.uml2.internal.operation.StereotypeOperations#hasValue(org.eclipse.uml2.Stereotype, org.eclipse.uml2.Element, String) <em>Has Value</em>}'
	 * method.
	 * 
	 * @see org.eclipse.uml2.internal.operation.StereotypeOperations#hasValue(org.eclipse.uml2.Stereotype,
	 *      org.eclipse.uml2.Element, String)
	 */
	public void testHasValue_Enumeration() {

		try {
			assertFalse(StereotypeOperations.hasValue(null, null, null));
		} catch (IllegalArgumentException iae) {
			fail();
		}

		try {
			assertFalse(StereotypeOperations.hasValue(getElement(), null, null));
		} catch (IllegalArgumentException iae) {
			fail();
		}

		org.eclipse.uml2.Class class_ = UML2Factory.eINSTANCE.createClass();

		try {
			assertFalse(StereotypeOperations.hasValue(getElement(), class_,
				null));
		} catch (IllegalArgumentException iae) {
			fail();
		}

		org.eclipse.uml2.Package package_ = UML2Factory.eINSTANCE
			.createPackage();
		package_.getOwnedMembers().add(class_);

		try {
			assertFalse(StereotypeOperations.hasValue(getElement(), class_,
				null));
		} catch (IllegalArgumentException iae) {
			fail();
		}

		applyProfile(package_, getElement().getProfile());

		try {
			assertFalse(StereotypeOperations.hasValue(getElement(), class_,
				null));
		} catch (IllegalArgumentException iae) {
			fail();
		}

		try {
			assertFalse(StereotypeOperations.hasValue(getElement(), class_, "")); //$NON-NLS-1$
		} catch (IllegalArgumentException iae) {
			fail();
		}

		try {
			assertFalse(StereotypeOperations.hasValue(getElement(), class_,
				"enumeration")); //$NON-NLS-1$
		} catch (IllegalArgumentException iae) {
			fail();
		}

		setRequired(getElement(), false);

		try {
			assertFalse(StereotypeOperations.hasValue(getElement(), class_,
				"enumeration")); //$NON-NLS-1$
		} catch (IllegalArgumentException iae) {
			fail();
		}

		EClass eClass = StereotypeOperations.getEClass(getElement(), String
			.valueOf(0));
		EObject stereotypeEObject = eClass.getEPackage().getEFactoryInstance()
			.create(eClass);
		class_.createEAnnotation(
			StereotypeOperations.ANNOTATION_SOURCE__APPLIED_STEREOTYPES)
			.getContents().add(stereotypeEObject);

		try {
			assertFalse(StereotypeOperations.hasValue(getElement(), class_,
				"enumeration")); //$NON-NLS-1$
		} catch (IllegalArgumentException iae) {
			fail();
		}

		EStructuralFeature enumerationEStructuralFeature = eClass
			.getEStructuralFeature("enumeration"); //$NON-NLS-1$

		stereotypeEObject.eSet(enumerationEStructuralFeature,
			((EEnum) enumerationEStructuralFeature.getEType()).getEEnumLiteral(
				getName() + ' ' + String.valueOf(0)).getInstance());

		try {
			assertTrue(StereotypeOperations.hasValue(getElement(), class_,
				"enumeration")); //$NON-NLS-1$
		} catch (IllegalArgumentException iae) {
			fail();
		}

		stereotypeEObject.eSet(enumerationEStructuralFeature,
			((EEnum) enumerationEStructuralFeature.getEType()).getEEnumLiteral(
				getName() + ' ' + String.valueOf(1)).getInstance());

		try {
			assertFalse(StereotypeOperations.hasValue(getElement(), class_,
				"enumeration")); //$NON-NLS-1$
		} catch (IllegalArgumentException iae) {
			fail();
		}
	}

	/**
	 * Tests the '
	 * {@link org.eclipse.uml2.internal.operation.StereotypeOperations#hasValue(org.eclipse.uml2.Stereotype, org.eclipse.uml2.Element, String) <em>Has Value</em>}'
	 * method.
	 * 
	 * @see org.eclipse.uml2.internal.operation.StereotypeOperations#hasValue(org.eclipse.uml2.Stereotype,
	 *      org.eclipse.uml2.Element, String)
	 */
	public void testHasValue_Enumerations() {

		try {
			assertFalse(StereotypeOperations.hasValue(null, null, null));
		} catch (IllegalArgumentException iae) {
			fail();
		}

		try {
			assertFalse(StereotypeOperations.hasValue(getElement(), null, null));
		} catch (IllegalArgumentException iae) {
			fail();
		}

		org.eclipse.uml2.Class class_ = UML2Factory.eINSTANCE.createClass();

		try {
			assertFalse(StereotypeOperations.hasValue(getElement(), class_,
				null));
		} catch (IllegalArgumentException iae) {
			fail();
		}

		org.eclipse.uml2.Package package_ = UML2Factory.eINSTANCE
			.createPackage();
		package_.getOwnedMembers().add(class_);

		try {
			assertFalse(StereotypeOperations.hasValue(getElement(), class_,
				null));
		} catch (IllegalArgumentException iae) {
			fail();
		}

		applyProfile(package_, getElement().getProfile());

		try {
			assertFalse(StereotypeOperations.hasValue(getElement(), class_,
				null));
		} catch (IllegalArgumentException iae) {
			fail();
		}

		try {
			assertFalse(StereotypeOperations.hasValue(getElement(), class_, "")); //$NON-NLS-1$
		} catch (IllegalArgumentException iae) {
			fail();
		}

		try {
			assertFalse(StereotypeOperations.hasValue(getElement(), class_,
				"enumerations")); //$NON-NLS-1$
		} catch (IllegalArgumentException iae) {
			fail();
		}

		setRequired(getElement(), false);

		try {
			assertFalse(StereotypeOperations.hasValue(getElement(), class_,
				"enumerations")); //$NON-NLS-1$
		} catch (IllegalArgumentException iae) {
			fail();
		}

		EClass eClass = StereotypeOperations.getEClass(getElement(), String
			.valueOf(0));
		EObject stereotypeEObject = eClass.getEPackage().getEFactoryInstance()
			.create(eClass);
		class_.createEAnnotation(
			StereotypeOperations.ANNOTATION_SOURCE__APPLIED_STEREOTYPES)
			.getContents().add(stereotypeEObject);

		try {
			assertFalse(StereotypeOperations.hasValue(getElement(), class_,
				"enumerations")); //$NON-NLS-1$
		} catch (IllegalArgumentException iae) {
			fail();
		}

		try {
			assertFalse(StereotypeOperations.hasValue(getElement(), class_,
				"enumerations[")); //$NON-NLS-1$
		} catch (IllegalArgumentException iae) {
			fail();
		}

		try {
			assertFalse(StereotypeOperations.hasValue(getElement(), class_,
				"enumerations[0")); //$NON-NLS-1$
		} catch (IllegalArgumentException iae) {
			fail();
		}

		try {
			assertFalse(StereotypeOperations.hasValue(getElement(), class_,
				"enumerations[0]")); //$NON-NLS-1$
			fail();
		} catch (IndexOutOfBoundsException ioobe) {
			// pass
		}

		EStructuralFeature enumerationsEStructuralFeature = eClass
			.getEStructuralFeature("enumerations"); //$NON-NLS-1$

		((List) stereotypeEObject.eGet(enumerationsEStructuralFeature))
			.add(((EEnum) enumerationsEStructuralFeature.getEType())
				.getEEnumLiteral(getName() + ' ' + String.valueOf(1))
				.getInstance());

		try {
			assertTrue(StereotypeOperations.hasValue(getElement(), class_,
				"enumerations")); //$NON-NLS-1$
		} catch (IndexOutOfBoundsException ioobe) {
			fail();
		}

		try {
			assertTrue(StereotypeOperations.hasValue(getElement(), class_,
				"enumerations[0]")); //$NON-NLS-1$
		} catch (IndexOutOfBoundsException ioobe) {
			fail();
		}

		((List) stereotypeEObject.eGet(enumerationsEStructuralFeature)).set(0,
			((EEnum) enumerationsEStructuralFeature.getEType())
				.getEEnumLiteral(getName() + ' ' + String.valueOf(0))
				.getInstance());

		try {
			assertTrue(StereotypeOperations.hasValue(getElement(), class_,
				"enumerations")); //$NON-NLS-1$
		} catch (IndexOutOfBoundsException ioobe) {
			fail();
		}

		try {
			assertFalse(StereotypeOperations.hasValue(getElement(), class_,
				"enumerations[0]")); //$NON-NLS-1$
		} catch (IndexOutOfBoundsException ioobe) {
			fail();
		}
	}

	/**
	 * Tests the '
	 * {@link org.eclipse.uml2.internal.operation.StereotypeOperations#hasValue(org.eclipse.uml2.Stereotype, org.eclipse.uml2.Element, String) <em>Has Value</em>}'
	 * method.
	 * 
	 * @see org.eclipse.uml2.internal.operation.StereotypeOperations#hasValue(org.eclipse.uml2.Stereotype,
	 *      org.eclipse.uml2.Element, String)
	 */
	public void testHasValue_Class() {

		try {
			assertFalse(StereotypeOperations.hasValue(null, null, null));
		} catch (IllegalArgumentException iae) {
			fail();
		}

		try {
			assertFalse(StereotypeOperations.hasValue(getElement(), null, null));
		} catch (IllegalArgumentException iae) {
			fail();
		}

		org.eclipse.uml2.Class class_ = UML2Factory.eINSTANCE.createClass();

		try {
			assertFalse(StereotypeOperations.hasValue(getElement(), class_,
				null));
		} catch (IllegalArgumentException iae) {
			fail();
		}

		org.eclipse.uml2.Package package_ = UML2Factory.eINSTANCE
			.createPackage();
		package_.getOwnedMembers().add(class_);

		try {
			assertFalse(StereotypeOperations.hasValue(getElement(), class_,
				null));
		} catch (IllegalArgumentException iae) {
			fail();
		}

		applyProfile(package_, getElement().getProfile());

		try {
			assertFalse(StereotypeOperations.hasValue(getElement(), class_,
				null));
		} catch (IllegalArgumentException iae) {
			fail();
		}

		try {
			assertFalse(StereotypeOperations.hasValue(getElement(), class_, "")); //$NON-NLS-1$
		} catch (IllegalArgumentException iae) {
			fail();
		}

		try {
			assertFalse(StereotypeOperations.hasValue(getElement(), class_,
				"timestamp")); //$NON-NLS-1$
		} catch (IllegalArgumentException iae) {
			fail();
		}

		setRequired(getElement(), false);

		try {
			assertFalse(StereotypeOperations.hasValue(getElement(), class_,
				"timestamp")); //$NON-NLS-1$
		} catch (IllegalArgumentException iae) {
			fail();
		}

		EClass eClass = StereotypeOperations.getEClass(getElement(), String
			.valueOf(0));
		EObject stereotypeEObject = eClass.getEPackage().getEFactoryInstance()
			.create(eClass);
		class_.createEAnnotation(
			StereotypeOperations.ANNOTATION_SOURCE__APPLIED_STEREOTYPES)
			.getContents().add(stereotypeEObject);

		try {
			assertFalse(StereotypeOperations.hasValue(getElement(), class_,
				"timestamp")); //$NON-NLS-1$
		} catch (IllegalArgumentException iae) {
			fail();
		}

		EStructuralFeature timestampEStructuralFeature = eClass
			.getEStructuralFeature("timestamp"); //$NON-NLS-1$
		EObject timestampEObject = eClass.getEPackage().getEFactoryInstance()
			.create((EClass) timestampEStructuralFeature.getEType());
		stereotypeEObject.eSet(timestampEStructuralFeature, timestampEObject);

		try {
			assertTrue(StereotypeOperations.hasValue(getElement(), class_,
				"timestamp")); //$NON-NLS-1$
		} catch (IllegalArgumentException iae) {
			fail();
		}

		try {
			assertFalse(StereotypeOperations.hasValue(getElement(), class_,
				"timestamp" + NamedElement.SEPARATOR + "d")); //$NON-NLS-1$ //$NON-NLS-2$
		} catch (IllegalArgumentException iae) {
			fail();
		}

		try {
			assertFalse(StereotypeOperations.hasValue(getElement(), class_,
				"timestamp" + NamedElement.SEPARATOR + "date")); //$NON-NLS-1$ //$NON-NLS-2$
		} catch (IllegalArgumentException iae) {
			fail();
		}

		EStructuralFeature dateEStructuralFeature = timestampEObject.eClass()
			.getEStructuralFeature("date"); //$NON-NLS-1$
		EObject dateEObject = eClass.getEPackage().getEFactoryInstance()
			.create((EClass) dateEStructuralFeature.getEType());
		timestampEObject.eSet(dateEStructuralFeature, dateEObject);

		try {
			assertTrue(StereotypeOperations.hasValue(getElement(), class_,
				"timestamp" + NamedElement.SEPARATOR + "date")); //$NON-NLS-1$ //$NON-NLS-2$
		} catch (IllegalArgumentException iae) {
			fail();
		}

		try {
			assertFalse(StereotypeOperations
				.hasValue(
					getElement(),
					class_,
					"timestamp" + NamedElement.SEPARATOR + "date" + NamedElement.SEPARATOR + "d")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		} catch (IllegalArgumentException iae) {
			fail();
		}

		try {
			assertFalse(StereotypeOperations
				.hasValue(
					getElement(),
					class_,
					"timestamp" + NamedElement.SEPARATOR + "date" + NamedElement.SEPARATOR + "days")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		} catch (IllegalArgumentException iae) {
			fail();
		}
	}

	/**
	 * Tests the '
	 * {@link org.eclipse.uml2.internal.operation.StereotypeOperations#hasValue(org.eclipse.uml2.Stereotype, org.eclipse.uml2.Element, String) <em>Has Value</em>}'
	 * method.
	 * 
	 * @see org.eclipse.uml2.internal.operation.StereotypeOperations#hasValue(org.eclipse.uml2.Stereotype,
	 *      org.eclipse.uml2.Element, String)
	 */
	public void testHasValue_Classes() {

		try {
			assertFalse(StereotypeOperations.hasValue(null, null, null));
		} catch (IllegalArgumentException iae) {
			fail();
		}

		try {
			assertFalse(StereotypeOperations.hasValue(getElement(), null, null));
		} catch (IllegalArgumentException iae) {
			fail();
		}

		org.eclipse.uml2.Class class_ = UML2Factory.eINSTANCE.createClass();

		try {
			assertFalse(StereotypeOperations.hasValue(getElement(), class_,
				null));
		} catch (IllegalArgumentException iae) {
			fail();
		}

		org.eclipse.uml2.Package package_ = UML2Factory.eINSTANCE
			.createPackage();
		package_.getOwnedMembers().add(class_);

		try {
			assertFalse(StereotypeOperations.hasValue(getElement(), class_,
				null));
		} catch (IllegalArgumentException iae) {
			fail();
		}

		applyProfile(package_, getElement().getProfile());

		try {
			assertFalse(StereotypeOperations.hasValue(getElement(), class_,
				null));
		} catch (IllegalArgumentException iae) {
			fail();
		}

		try {
			assertFalse(StereotypeOperations.hasValue(getElement(), class_, "")); //$NON-NLS-1$
		} catch (IllegalArgumentException iae) {
			fail();
		}

		try {
			assertFalse(StereotypeOperations.hasValue(getElement(), class_,
				"timestamps")); //$NON-NLS-1$
		} catch (IllegalArgumentException iae) {
			fail();
		}

		try {
			assertFalse(StereotypeOperations.hasValue(getElement(), class_,
				"timestamps[")); //$NON-NLS-1$
		} catch (IllegalArgumentException iae) {
			fail();
		}

		try {
			assertFalse(StereotypeOperations.hasValue(getElement(), class_,
				"timestamps[0")); //$NON-NLS-1$
		} catch (IllegalArgumentException iae) {
			fail();
		}

		try {
			assertFalse(StereotypeOperations.hasValue(getElement(), class_,
				"timestamps[0]")); //$NON-NLS-1$
			fail();
		} catch (IndexOutOfBoundsException ioobe) {
			// pass
		}

		setRequired(getElement(), false);

		try {
			assertFalse(StereotypeOperations.hasValue(getElement(), class_,
				"timestamps[0]")); //$NON-NLS-1$
		} catch (IllegalArgumentException iae) {
			fail();
		}

		EClass eClass = StereotypeOperations.getEClass(getElement(), String
			.valueOf(0));
		EObject stereotypeEObject = eClass.getEPackage().getEFactoryInstance()
			.create(eClass);
		class_.createEAnnotation(
			StereotypeOperations.ANNOTATION_SOURCE__APPLIED_STEREOTYPES)
			.getContents().add(stereotypeEObject);

		try {
			assertFalse(StereotypeOperations.hasValue(getElement(), class_,
				"timestamps[0]")); //$NON-NLS-1$
			fail();
		} catch (IndexOutOfBoundsException ioobe) {
			// pass
		}

		EStructuralFeature timestampsEStructuralFeature = eClass
			.getEStructuralFeature("timestamps"); //$NON-NLS-1$
		EObject timestampEObject = eClass.getEPackage().getEFactoryInstance()
			.create((EClass) timestampsEStructuralFeature.getEType());
		((List) stereotypeEObject.eGet(timestampsEStructuralFeature))
			.add(timestampEObject);

		try {
			assertTrue(StereotypeOperations.hasValue(getElement(), class_,
				"timestamps[0]")); //$NON-NLS-1$
		} catch (IndexOutOfBoundsException ioobe) {
			fail();
		}

		try {
			assertFalse(StereotypeOperations.hasValue(getElement(), class_,
				"timestamps[0]" + NamedElement.SEPARATOR + "d")); //$NON-NLS-1$ //$NON-NLS-2$
		} catch (IllegalArgumentException iae) {
			fail();
		}

		try {
			assertFalse(StereotypeOperations.hasValue(getElement(), class_,
				"timestamps[0]" + NamedElement.SEPARATOR + "date")); //$NON-NLS-1$ //$NON-NLS-2$
		} catch (IllegalArgumentException iae) {
			fail();
		}

		EStructuralFeature dateEStructuralFeature = timestampEObject.eClass()
			.getEStructuralFeature("date"); //$NON-NLS-1$
		EObject dateEObject = eClass.getEPackage().getEFactoryInstance()
			.create((EClass) dateEStructuralFeature.getEType());
		timestampEObject.eSet(dateEStructuralFeature, dateEObject);

		try {
			assertTrue(StereotypeOperations.hasValue(getElement(), class_,
				"timestamps[0]" + NamedElement.SEPARATOR + "date")); //$NON-NLS-1$ //$NON-NLS-2$
		} catch (IllegalArgumentException iae) {
			fail();
		}

		try {
			assertFalse(StereotypeOperations
				.hasValue(
					getElement(),
					class_,
					"timestamps[0]" + NamedElement.SEPARATOR + "date" + NamedElement.SEPARATOR + "d")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		} catch (IllegalArgumentException iae) {
			fail();
		}

		try {
			assertFalse(StereotypeOperations
				.hasValue(
					getElement(),
					class_,
					"timestamps[0]" + NamedElement.SEPARATOR + "date" + NamedElement.SEPARATOR + "days")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		} catch (IllegalArgumentException iae) {
			fail();
		}
	}

}