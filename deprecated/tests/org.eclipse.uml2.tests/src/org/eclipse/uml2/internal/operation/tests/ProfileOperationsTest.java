/*
 * Copyright (c) 2003, 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: ProfileOperationsTest.java,v 1.3 2005/03/15 18:51:32 khussey Exp $
 */
package org.eclipse.uml2.internal.operation.tests;

import java.util.List;

import junit.textui.TestRunner;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.uml2.Association;
import org.eclipse.uml2.ElementImport;
import org.eclipse.uml2.Enumeration;
import org.eclipse.uml2.EnumerationLiteral;
import org.eclipse.uml2.Extension;
import org.eclipse.uml2.ExtensionEnd;
import org.eclipse.uml2.InstanceValue;
import org.eclipse.uml2.Model;
import org.eclipse.uml2.MultiplicityElement;
import org.eclipse.uml2.PackageImport;
import org.eclipse.uml2.PrimitiveType;
import org.eclipse.uml2.Profile;
import org.eclipse.uml2.ProfileApplication;
import org.eclipse.uml2.Property;
import org.eclipse.uml2.Stereotype;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.VisibilityKind;
import org.eclipse.uml2.internal.operation.ProfileOperations;
import org.eclipse.uml2.internal.operation.StereotypeOperations;

/**
 * A test case for the '<em><b>Profile Operations</b></em>' utility.
 */
public class ProfileOperationsTest
		extends UML2OperationsTest {

	public static void main(String[] args) {
		TestRunner.run(ProfileOperationsTest.class);
	}

	/**
	 * Constructs a new Profile Operations test case with the given name.
	 */
	public ProfileOperationsTest(String name) {
		super(name);
	}

	/**
	 * Returns the element for this Profile Operations test case.
	 */
	private Profile getElement() {
		return (Profile) element;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see junit.framework.TestCase#setUp()
	 */
	protected void setUp()
			throws Exception {

		super.setUp();

		setElement(UML2Factory.eINSTANCE.createProfile());
		getElement().setName(getName());

		Model metamodel = getUML2Metamodel();

		PackageImport metamodelReference = getElement().createPackageImport(
			UML2Package.eINSTANCE.getPackageImport());
		metamodelReference.setImportedPackage(metamodel);

		getElement().getMetamodelReferences().add(metamodelReference);

		Stereotype stereotype = (Stereotype) getElement().createOwnedMember(
			UML2Package.eINSTANCE.getStereotype());
		stereotype.setName(getName());

		Extension extension = (Extension) getElement().createOwnedMember(
			UML2Package.eINSTANCE.getExtension());

		ExtensionEnd extensionEnd = (ExtensionEnd) extension
			.createOwnedEnd(UML2Package.eINSTANCE.getExtensionEnd());
		extensionEnd
			.setName(StereotypeOperations.STEREOTYPE_EXTENSION_ROLE_PREFIX
				+ stereotype.getName());
		extensionEnd.setType(stereotype);

		Property stereotypeEnd = stereotype
			.createOwnedAttribute(UML2Package.eINSTANCE.getProperty());
		stereotypeEnd.setAssociation(extension);
		stereotypeEnd
			.setName(StereotypeOperations.METACLASS_EXTENSION_ROLE_PREFIX
				+ UML2Package.eINSTANCE.getClass_().getName());
		stereotypeEnd.setType(metamodel.getOwnedType(UML2Package.eINSTANCE
			.getClass_().getName()));

		Model primitiveTypes = getUML2PrimitiveTypesLibrary();

		PackageImport packageImport = getElement().createPackageImport(
			UML2Package.eINSTANCE.getPackageImport());
		packageImport.setImportedPackage(primitiveTypes);

		getElement().getPackageImports().add(packageImport);

		PrimitiveType booleanPrimitiveType = (PrimitiveType) primitiveTypes
			.getOwnedType("Boolean"); //$NON-NLS-1$

		Property booleanProperty = stereotype
			.createOwnedAttribute(UML2Package.eINSTANCE.getProperty());
		booleanProperty.setName("boolean"); //$NON-NLS-1$
		booleanProperty.setType(booleanPrimitiveType);
		booleanProperty.setBooleanDefault(true);

		Property booleansProperty = stereotype
			.createOwnedAttribute(UML2Package.eINSTANCE.getProperty());
		booleansProperty.setIsUnique(false);
		booleansProperty.setName("booleans"); //$NON-NLS-1$
		booleansProperty.setType(booleanPrimitiveType);
		booleansProperty
			.setUpperBound(MultiplicityElement.UNLIMITED_UPPER_BOUND);

		PrimitiveType integerPrimitiveType = (PrimitiveType) primitiveTypes
			.getOwnedType("Integer"); //$NON-NLS-1$

		Property integerProperty = stereotype
			.createOwnedAttribute(UML2Package.eINSTANCE.getProperty());
		integerProperty.setName("integer"); //$NON-NLS-1$
		integerProperty.setType(integerPrimitiveType);
		integerProperty.setIntegerDefault(Integer.MIN_VALUE);

		Property integersProperty = stereotype
			.createOwnedAttribute(UML2Package.eINSTANCE.getProperty());
		integersProperty.setIsUnique(false);
		integersProperty.setName("integers"); //$NON-NLS-1$
		integersProperty.setType(integerPrimitiveType);
		integersProperty
			.setUpperBound(MultiplicityElement.UNLIMITED_UPPER_BOUND);

		PrimitiveType unlimitedNaturalPrimitiveType = (PrimitiveType) primitiveTypes
			.getOwnedType("UnlimitedNatural"); //$NON-NLS-1$

		Property unlimitedNaturalProperty = stereotype
			.createOwnedAttribute(UML2Package.eINSTANCE.getProperty());
		unlimitedNaturalProperty.setName("unlimitedNatural"); //$NON-NLS-1$
		unlimitedNaturalProperty.setType(unlimitedNaturalPrimitiveType);
		unlimitedNaturalProperty.setUnlimitedNaturalDefault(Integer.MAX_VALUE);

		Property unlimitedNaturalsProperty = stereotype
			.createOwnedAttribute(UML2Package.eINSTANCE.getProperty());
		unlimitedNaturalsProperty.setIsUnique(false);
		unlimitedNaturalsProperty.setName("unlimitedNaturals"); //$NON-NLS-1$
		unlimitedNaturalsProperty.setType(unlimitedNaturalPrimitiveType);
		unlimitedNaturalsProperty
			.setUpperBound(MultiplicityElement.UNLIMITED_UPPER_BOUND);

		PrimitiveType stringPrimitiveType = (PrimitiveType) primitiveTypes
			.getOwnedType("String"); //$NON-NLS-1$

		Property stringProperty = stereotype
			.createOwnedAttribute(UML2Package.eINSTANCE.getProperty());
		stringProperty.setName("string"); //$NON-NLS-1$
		stringProperty.setType(stringPrimitiveType);
		stringProperty.setStringDefault(""); //$NON-NLS-1$

		Property stringsProperty = stereotype
			.createOwnedAttribute(UML2Package.eINSTANCE.getProperty());
		stringsProperty.setIsUnique(false);
		stringsProperty.setName("strings"); //$NON-NLS-1$
		stringsProperty.setType(stringPrimitiveType);
		stringsProperty
			.setUpperBound(MultiplicityElement.UNLIMITED_UPPER_BOUND);

		Enumeration enumeration = (Enumeration) getElement().createOwnedMember(
			UML2Package.eINSTANCE.getEnumeration());
		enumeration.setName(getName()
			+ UML2Package.eINSTANCE.getEnumeration().getName());

		EnumerationLiteral enumerationLiteral0 = enumeration
			.createOwnedLiteral(UML2Package.eINSTANCE.getEnumerationLiteral());
		enumerationLiteral0.setName(getName() + String.valueOf(0));

		EnumerationLiteral enumerationLiteral1 = enumeration
			.createOwnedLiteral(UML2Package.eINSTANCE.getEnumerationLiteral());
		enumerationLiteral1.setName(getName() + String.valueOf(1));

		Property enumerationProperty = stereotype
			.createOwnedAttribute(UML2Package.eINSTANCE.getProperty());
		enumerationProperty.setName("enumeration"); //$NON-NLS-1$
		enumerationProperty.setType(enumeration);

		InstanceValue enumerationDefaultValue = UML2Factory.eINSTANCE
			.createInstanceValue();
		enumerationDefaultValue.setInstance(enumerationLiteral1);
		enumerationProperty.setDefaultValue(enumerationDefaultValue);

		Property enumerationsProperty = stereotype
			.createOwnedAttribute(UML2Package.eINSTANCE.getProperty());
		enumerationsProperty.setIsUnique(false);
		enumerationsProperty.setName("enumerations"); //$NON-NLS-1$
		enumerationsProperty.setType(enumeration);
		enumerationsProperty
			.setUpperBound(MultiplicityElement.UNLIMITED_UPPER_BOUND);

		org.eclipse.uml2.Class dateClass = (org.eclipse.uml2.Class) getElement()
			.createOwnedMember(UML2Package.eINSTANCE.getClass_());
		dateClass.setName("Date"); //$NON-NLS-1$

		Property daysProperty = dateClass
			.createOwnedAttribute(UML2Package.eINSTANCE.getProperty());
		daysProperty.setName("days"); //$NON-NLS-1$
		daysProperty.setType(unlimitedNaturalPrimitiveType);

		org.eclipse.uml2.Class timeClass = (org.eclipse.uml2.Class) getElement()
			.createOwnedMember(UML2Package.eINSTANCE.getClass_());
		timeClass.setName("Time"); //$NON-NLS-1$

		Property millisecondsProperty = timeClass
			.createOwnedAttribute(UML2Package.eINSTANCE.getProperty());
		millisecondsProperty.setName("milliseconds"); //$NON-NLS-1$
		millisecondsProperty.setType(unlimitedNaturalPrimitiveType);

		org.eclipse.uml2.Class timestampClass = (org.eclipse.uml2.Class) getElement()
			.createOwnedMember(UML2Package.eINSTANCE.getClass_());
		timestampClass.setName("Timestamp"); //$NON-NLS-1$

		Association dateAssociation = (Association) getElement()
			.createOwnedMember(UML2Package.eINSTANCE.getAssociation());

		Property dateAssociationEnd = dateAssociation
			.createOwnedEnd(UML2Package.eINSTANCE.getProperty());
		dateAssociationEnd.setType(timestampClass);

		Property dateProperty = timestampClass
			.createOwnedAttribute(UML2Package.eINSTANCE.getProperty());
		dateProperty.setAssociation(dateAssociation);
		dateProperty.setName("date"); //$NON-NLS-1$
		dateProperty.setType(dateClass);

		Association timeAssociation = (Association) getElement()
			.createOwnedMember(UML2Package.eINSTANCE.getAssociation());

		Property timeAssociationEnd = timeAssociation
			.createOwnedEnd(UML2Package.eINSTANCE.getProperty());
		timeAssociationEnd.setType(timestampClass);

		Property timeProperty = timestampClass
			.createOwnedAttribute(UML2Package.eINSTANCE.getProperty());
		timeProperty.setAssociation(timeAssociation);
		timeProperty.setName("time"); //$NON-NLS-1$
		timeProperty.setType(timeClass);

		Association timestampAssociation = (Association) getElement()
			.createOwnedMember(UML2Package.eINSTANCE.getAssociation());

		Property timestampAssociationEnd = timestampAssociation
			.createOwnedEnd(UML2Package.eINSTANCE.getProperty());
		timestampAssociationEnd.setType(stereotype);

		Property timestampProperty = stereotype
			.createOwnedAttribute(UML2Package.eINSTANCE.getProperty());
		timestampProperty.setAssociation(timestampAssociation);
		timestampProperty.setName("timestamp"); //$NON-NLS-1$
		timestampProperty.setType(timestampClass);

		Association timestampsAssociation = (Association) getElement()
			.createOwnedMember(UML2Package.eINSTANCE.getAssociation());

		Property timestampsAssociationEnd = timestampsAssociation
			.createOwnedEnd(UML2Package.eINSTANCE.getProperty());
		timestampsAssociationEnd.setType(stereotype);

		Property timestampsProperty = stereotype
			.createOwnedAttribute(UML2Package.eINSTANCE.getProperty());
		timestampsProperty.setAssociation(timestampsAssociation);
		timestampsProperty.setName("timestamps"); //$NON-NLS-1$
		timestampsProperty.setType(timestampClass);
		timestampsProperty
			.setUpperBound(MultiplicityElement.UNLIMITED_UPPER_BOUND);
	}

	/**
	 * Tests the '
	 * {@link org.eclipse.uml2.internal.operation.ProfileOperations#apply(org.eclipse.uml2.Profile, org.eclipse.uml2.Package) <em>Apply</em>}'
	 * method.
	 * 
	 * @see org.eclipse.uml2.internal.operation.ProfileOperations#apply(org.eclipse.uml2.Profile,
	 *      org.eclipse.uml2.Package)
	 */
	public void testApply() {

		try {
			ProfileOperations.apply(null, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		try {
			ProfileOperations.apply(getElement(), null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		getElement().createEAnnotation(
			ProfileOperations.ANNOTATION_SOURCE__ATTRIBUTES).getDetails().put(
			ProfileOperations.ANNOTATION_DETAILS_KEY__VERSION,
			String.valueOf(0));
		getElement().createEAnnotation(
			ProfileOperations.ANNOTATION_SOURCE__E_PACKAGES).getContents().add(
			0, ProfileOperations.createEPackage(getElement()));

		try {
			ProfileOperations.apply(getElement(), null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		org.eclipse.uml2.Package package_ = UML2Factory.eINSTANCE
			.createPackage();

		try {
			ProfileOperations.apply(getElement(), package_);
		} catch (IllegalArgumentException iae) {
			fail();
		}

		assertEquals(1, package_.getAppliedProfiles().size());
		assertEquals(String.valueOf(0), ProfileOperations.getAppliedVersion(
			getElement(), package_));
		assertSame(getElement(), ((ProfileApplication) package_
			.getAppliedProfiles().get(0)).getImportedProfile());

		try {
			ProfileOperations.apply(getElement(), package_);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		Stereotype stereotype = (Stereotype) getElement().getOwnedStereotypes()
			.get(0);
		org.eclipse.uml2.Class class_ = (org.eclipse.uml2.Class) package_
			.createOwnedMember(UML2Package.eINSTANCE.getClass_());

		EClass eClass = StereotypeOperations.getEClass(stereotype, String
			.valueOf(0));
		EObject stereotypeEObject = eClass.getEPackage().getEFactoryInstance()
			.create(eClass);
		class_.createEAnnotation(
			StereotypeOperations.ANNOTATION_SOURCE__APPLIED_STEREOTYPES)
			.getContents().add(stereotypeEObject);

		stereotypeEObject.eSet(eClass.getEStructuralFeature("boolean"), //$NON-NLS-1$
			Boolean.FALSE);

		((List) stereotypeEObject
			.eGet(eClass.getEStructuralFeature("booleans"))) //$NON-NLS-1$
			.add(Boolean.TRUE);

		stereotypeEObject.eSet(eClass.getEStructuralFeature("integer"), //$NON-NLS-1$
			new Integer(0));

		((List) stereotypeEObject
			.eGet(eClass.getEStructuralFeature("integers"))) //$NON-NLS-1$
			.add(new Integer(Integer.MIN_VALUE));

		stereotypeEObject.eSet(
			eClass.getEStructuralFeature("unlimitedNatural"), //$NON-NLS-1$
			new Integer(0));

		((List) stereotypeEObject.eGet(eClass
			.getEStructuralFeature("unlimitedNaturals"))) //$NON-NLS-1$
			.add(new Integer(Integer.MAX_VALUE));

		stereotypeEObject.eSet(eClass.getEStructuralFeature("string"), //$NON-NLS-1$
			getName());

		((List) stereotypeEObject.eGet(eClass.getEStructuralFeature("strings"))) //$NON-NLS-1$
			.add(""); //$NON-NLS-1$

		EStructuralFeature enumerationEStructuralFeature = eClass
			.getEStructuralFeature("enumeration"); //$NON-NLS-1$
		stereotypeEObject.eSet(enumerationEStructuralFeature,
			((EEnum) enumerationEStructuralFeature.getEType()).getEEnumLiteral(
				getName() + String.valueOf(0)).getInstance());

		EStructuralFeature enumerationsEStructuralFeature = eClass
			.getEStructuralFeature("enumerations"); //$NON-NLS-1$
		((List) stereotypeEObject.eGet(enumerationsEStructuralFeature))
			.add(((EEnum) enumerationsEStructuralFeature.getEType())
				.getEEnumLiteral(getName() + String.valueOf(1)).getInstance());

		EStructuralFeature timestampEStructuralFeature = eClass
			.getEStructuralFeature("timestamp"); //$NON-NLS-1$
		EObject timestampEObject = eClass.getEPackage().getEFactoryInstance()
			.create((EClass) timestampEStructuralFeature.getEType());
		stereotypeEObject.eSet(timestampEStructuralFeature, timestampEObject);
		EStructuralFeature dateEStructuralFeature = timestampEObject.eClass()
			.getEStructuralFeature("date"); //$NON-NLS-1$
		EObject dateEObject = eClass.getEPackage().getEFactoryInstance()
			.create((EClass) dateEStructuralFeature.getEType());
		timestampEObject.eSet(dateEStructuralFeature, dateEObject);
		dateEObject.eSet(dateEObject.eClass().getEStructuralFeature("days"), //$NON-NLS-1$
			new Integer(Integer.MAX_VALUE));

		EStructuralFeature timestampsEStructuralFeature = eClass
			.getEStructuralFeature("timestamps"); //$NON-NLS-1$
		EObject timestampsEObject = eClass.getEPackage().getEFactoryInstance()
			.create((EClass) timestampsEStructuralFeature.getEType());
		((List) stereotypeEObject.eGet(timestampsEStructuralFeature))
			.add(timestampsEObject);
		EStructuralFeature timeEStructuralFeature = timestampsEObject.eClass()
			.getEStructuralFeature("time"); //$NON-NLS-1$
		EObject timeEObject = eClass.getEPackage().getEFactoryInstance()
			.create((EClass) timeEStructuralFeature.getEType());
		timestampsEObject.eSet(timeEStructuralFeature, timeEObject);
		timeEObject.eSet(timeEObject.eClass().getEStructuralFeature(
			"milliseconds"), new Integer(Integer.MAX_VALUE)); //$NON-NLS-1$

		getElement().getEAnnotation(
			ProfileOperations.ANNOTATION_SOURCE__ATTRIBUTES).getDetails().put(
			ProfileOperations.ANNOTATION_DETAILS_KEY__VERSION,
			String.valueOf(1));
		getElement().getEAnnotation(
			ProfileOperations.ANNOTATION_SOURCE__E_PACKAGES).getContents().add(
			0, ProfileOperations.createEPackage(getElement()));

		try {
			ProfileOperations.apply(getElement(), package_);
		} catch (IllegalArgumentException iae) {
			fail();
		}

		eClass = StereotypeOperations.getEClass(stereotype, String.valueOf(1));
		stereotypeEObject = (EObject) class_.getEAnnotation(
			StereotypeOperations.ANNOTATION_SOURCE__APPLIED_STEREOTYPES)
			.getContents().get(0);

		assertEquals(Boolean.FALSE, stereotypeEObject.eGet(eClass
			.getEStructuralFeature("boolean"))); //$NON-NLS-1$

		assertEquals(Boolean.TRUE, ((List) stereotypeEObject.eGet(eClass
			.getEStructuralFeature("booleans"))).get(0)); //$NON-NLS-1$

		assertEquals(new Integer(0), stereotypeEObject.eGet(eClass
			.getEStructuralFeature("integer"))); //$NON-NLS-1$

		assertEquals(new Integer(Integer.MIN_VALUE), ((List) stereotypeEObject
			.eGet(eClass.getEStructuralFeature("integers"))).get(0)); //$NON-NLS-1$

		assertEquals(new Integer(0), stereotypeEObject.eGet(eClass
			.getEStructuralFeature("unlimitedNatural"))); //$NON-NLS-1$

		assertEquals(new Integer(Integer.MAX_VALUE), ((List) stereotypeEObject
			.eGet(eClass.getEStructuralFeature("unlimitedNaturals"))) //$NON-NLS-1$
			.get(0));

		assertEquals(getName(), stereotypeEObject.eGet(eClass
			.getEStructuralFeature("string"))); //$NON-NLS-1$

		assertEquals("", ((List) stereotypeEObject.eGet(eClass //$NON-NLS-1$
			.getEStructuralFeature("strings"))).get(0)); //$NON-NLS-1$

		enumerationEStructuralFeature = eClass
			.getEStructuralFeature("enumeration"); //$NON-NLS-1$
		assertEquals(((EEnum) enumerationEStructuralFeature.getEType())
			.getEEnumLiteral(getName() + String.valueOf(0)).getInstance(),
			stereotypeEObject.eGet(enumerationEStructuralFeature));

		enumerationsEStructuralFeature = eClass
			.getEStructuralFeature("enumerations"); //$NON-NLS-1$
		assertEquals(((EEnum) enumerationEStructuralFeature.getEType())
			.getEEnumLiteral(getName() + String.valueOf(1)).getInstance(),
			((List) stereotypeEObject.eGet(enumerationsEStructuralFeature))
				.get(0));

		timestampEStructuralFeature = eClass.getEStructuralFeature("timestamp"); //$NON-NLS-1$
		timestampEObject = (EObject) stereotypeEObject
			.eGet(timestampEStructuralFeature);
		dateEStructuralFeature = timestampEObject.eClass()
			.getEStructuralFeature("date"); //$NON-NLS-1$
		dateEObject = (EObject) timestampEObject.eGet(dateEStructuralFeature);
		assertEquals(new Integer(Integer.MAX_VALUE), dateEObject
			.eGet(dateEObject.eClass().getEStructuralFeature("days"))); //$NON-NLS-1$

		timestampsEStructuralFeature = eClass
			.getEStructuralFeature("timestamps"); //$NON-NLS-1$
		timestampsEObject = (EObject) ((List) stereotypeEObject
			.eGet(timestampsEStructuralFeature)).get(0);
		timeEStructuralFeature = timestampsEObject.eClass()
			.getEStructuralFeature("time"); //$NON-NLS-1$
		timeEObject = (EObject) timestampsEObject.eGet(timeEStructuralFeature);
		assertEquals(new Integer(Integer.MAX_VALUE), timeEObject
			.eGet(timeEObject.eClass().getEStructuralFeature("milliseconds"))); //$NON-NLS-1$
	}

	/**
	 * Tests the '
	 * {@link org.eclipse.uml2.internal.operation.ProfileOperations#define(org.eclipse.uml2.Profile) <em>Define</em>}'
	 * method.
	 * 
	 * @see org.eclipse.uml2.internal.operation.ProfileOperations#define(org.eclipse.uml2.Profile)
	 */
	public void testDefine() {

		try {
			ProfileOperations.define(null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		try {
			ProfileOperations.define(UML2Factory.eINSTANCE.createProfile());
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		try {
			ProfileOperations.define(getElement());
		} catch (IllegalArgumentException iae) {
			fail();
		}

		assertEquals(String.valueOf(0), ProfileOperations
			.getVersion(getElement()));

		EAnnotation ePackagesAnnotation = getElement().getEAnnotation(
			ProfileOperations.ANNOTATION_SOURCE__E_PACKAGES);
		assertNotNull(ePackagesAnnotation);
		assertEquals(1, ePackagesAnnotation.getContents().size());

		EPackage ePackage = (EPackage) ePackagesAnnotation.getContents().get(0);
		assertEquals(getName() + '_' + String.valueOf(0), ePackage.getName());

		EClass stereotypeEClass = (EClass) ePackage.getEClassifier(getName()
			+ "__" + getName()); //$NON-NLS-1$
		assertNotNull(stereotypeEClass);
		assertEquals(12, stereotypeEClass.getEAllStructuralFeatures().size());

		EStructuralFeature booleanEStructuralFeature = stereotypeEClass
			.getEStructuralFeature("boolean"); //$NON-NLS-1$
		assertTrue(EAttribute.class.isInstance(booleanEStructuralFeature));
		assertEquals(Boolean.TRUE, booleanEStructuralFeature.getDefaultValue());
		assertSame(EcorePackage.eINSTANCE.getEBoolean(),
			booleanEStructuralFeature.getEType());

		EStructuralFeature booleansEStructuralFeature = stereotypeEClass
			.getEStructuralFeature("booleans"); //$NON-NLS-1$
		assertTrue(EAttribute.class.isInstance(booleansEStructuralFeature));
		assertFalse(booleansEStructuralFeature.isUnique());
		assertSame(EcorePackage.eINSTANCE.getEBoolean(),
			booleanEStructuralFeature.getEType());
		assertTrue(booleansEStructuralFeature.isMany());

		EStructuralFeature integerEStructuralFeature = stereotypeEClass
			.getEStructuralFeature("integer"); //$NON-NLS-1$
		assertTrue(EAttribute.class.isInstance(integerEStructuralFeature));
		assertEquals(new Integer(Integer.MIN_VALUE), integerEStructuralFeature
			.getDefaultValue());
		assertSame(EcorePackage.eINSTANCE.getEInt(), integerEStructuralFeature
			.getEType());

		EStructuralFeature integersEStructuralFeature = stereotypeEClass
			.getEStructuralFeature("integers"); //$NON-NLS-1$
		assertTrue(EAttribute.class.isInstance(integersEStructuralFeature));
		assertFalse(integersEStructuralFeature.isUnique());
		assertSame(EcorePackage.eINSTANCE.getEInt(), integersEStructuralFeature
			.getEType());
		assertTrue(integersEStructuralFeature.isMany());

		EStructuralFeature unlimitedNaturalEStructuralFeature = stereotypeEClass
			.getEStructuralFeature("unlimitedNatural"); //$NON-NLS-1$
		assertTrue(EAttribute.class
			.isInstance(unlimitedNaturalEStructuralFeature));
		assertEquals(new Integer(Integer.MAX_VALUE),
			unlimitedNaturalEStructuralFeature.getDefaultValue());
		assertSame(EcorePackage.eINSTANCE.getEInt(),
			unlimitedNaturalEStructuralFeature.getEType());

		EStructuralFeature unlimitedNaturalsEStructuralFeature = stereotypeEClass
			.getEStructuralFeature("unlimitedNaturals"); //$NON-NLS-1$
		assertTrue(EAttribute.class
			.isInstance(unlimitedNaturalsEStructuralFeature));
		assertFalse(unlimitedNaturalsEStructuralFeature.isUnique());
		assertSame(EcorePackage.eINSTANCE.getEInt(),
			unlimitedNaturalsEStructuralFeature.getEType());
		assertTrue(unlimitedNaturalsEStructuralFeature.isMany());

		EStructuralFeature stringEStructuralFeature = stereotypeEClass
			.getEStructuralFeature("string"); //$NON-NLS-1$
		assertTrue(EAttribute.class.isInstance(stringEStructuralFeature));
		assertEquals("", stringEStructuralFeature.getDefaultValue()); //$NON-NLS-1$
		assertSame(EcorePackage.eINSTANCE.getEString(),
			stringEStructuralFeature.getEType());

		EStructuralFeature stringsEStructuralFeature = stereotypeEClass
			.getEStructuralFeature("strings"); //$NON-NLS-1$
		assertTrue(EAttribute.class.isInstance(stringsEStructuralFeature));
		assertFalse(stringsEStructuralFeature.isUnique());
		assertSame(EcorePackage.eINSTANCE.getEString(),
			stringsEStructuralFeature.getEType());
		assertTrue(stringsEStructuralFeature.isMany());

		EStructuralFeature enumerationEStructuralFeature = stereotypeEClass
			.getEStructuralFeature("enumeration"); //$NON-NLS-1$
		assertTrue(EAttribute.class.isInstance(enumerationEStructuralFeature));
		assertTrue(EEnum.class.isInstance(enumerationEStructuralFeature
			.getEType()));
		assertEquals(1, ((EEnumLiteral) enumerationEStructuralFeature
			.getDefaultValue()).getValue());

		EStructuralFeature enumerationsEStructuralFeature = stereotypeEClass
			.getEStructuralFeature("enumerations"); //$NON-NLS-1$
		assertTrue(EAttribute.class.isInstance(enumerationsEStructuralFeature));
		assertFalse(enumerationsEStructuralFeature.isUnique());
		assertTrue(EEnum.class.isInstance(enumerationsEStructuralFeature
			.getEType()));
		assertTrue(enumerationsEStructuralFeature.isMany());

		EStructuralFeature classEStructuralFeature = stereotypeEClass
			.getEStructuralFeature("timestamp"); //$NON-NLS-1$
		assertTrue(EReference.class.isInstance(classEStructuralFeature));
		assertTrue(EClass.class.isInstance(classEStructuralFeature.getEType()));

		EClass timestampEClass = (EClass) classEStructuralFeature.getEType();
		assertEquals(2, timestampEClass.getEAllStructuralFeatures().size());

		EStructuralFeature dateEStructuralFeature = timestampEClass
			.getEStructuralFeature("date"); //$NON-NLS-1$
		assertTrue(EReference.class.isInstance(dateEStructuralFeature));
		assertTrue(EClass.class.isInstance(dateEStructuralFeature.getEType()));

		EClass dateEClass = (EClass) dateEStructuralFeature.getEType();
		assertEquals(1, dateEClass.getEAllStructuralFeatures().size());

		EStructuralFeature daysEStructuralFeature = dateEClass
			.getEStructuralFeature("days"); //$NON-NLS-1$
		assertTrue(EAttribute.class.isInstance(daysEStructuralFeature));
		assertSame(EcorePackage.eINSTANCE.getEInt(), daysEStructuralFeature
			.getEType());

		EStructuralFeature timeEStructuralFeature = timestampEClass
			.getEStructuralFeature("time"); //$NON-NLS-1$
		assertTrue(EReference.class.isInstance(timeEStructuralFeature));
		assertTrue(EClass.class.isInstance(timeEStructuralFeature.getEType()));

		EClass timeEClass = (EClass) timeEStructuralFeature.getEType();
		assertEquals(1, timeEClass.getEAllStructuralFeatures().size());

		EStructuralFeature millisecondsEStructuralFeature = timeEClass
			.getEStructuralFeature("milliseconds"); //$NON-NLS-1$
		assertTrue(EAttribute.class.isInstance(millisecondsEStructuralFeature));
		assertSame(EcorePackage.eINSTANCE.getEInt(),
			millisecondsEStructuralFeature.getEType());

		EStructuralFeature classesEStructuralFeature = stereotypeEClass
			.getEStructuralFeature("timestamps"); //$NON-NLS-1$
		assertTrue(EReference.class.isInstance(classesEStructuralFeature));
		assertEquals(timestampEClass, classesEStructuralFeature.getEType());
		assertTrue(classesEStructuralFeature.isMany());

	}

	/**
	 * Tests the '
	 * {@link org.eclipse.uml2.internal.operation.ProfileOperations#getAllAppliedProfiles(org.eclipse.uml2.Package) <em>Get All Applied Profiles</em>}'
	 * method.
	 * 
	 * @see org.eclipse.uml2.internal.operation.ProfileOperations#getAllAppliedProfiles(org.eclipse.uml2.Package)
	 */
	public void testGetAllAppliedProfiles() {

		assertEquals(0, ProfileOperations.getAllAppliedProfiles(null).size());

		getElement().createEAnnotation(
			ProfileOperations.ANNOTATION_SOURCE__ATTRIBUTES).getDetails().put(
			ProfileOperations.ANNOTATION_DETAILS_KEY__VERSION,
			String.valueOf(0));
		getElement().createEAnnotation(
			ProfileOperations.ANNOTATION_SOURCE__E_PACKAGES).getContents().add(
			0, ProfileOperations.createEPackage(getElement()));

		org.eclipse.uml2.Package package_ = UML2Factory.eINSTANCE
			.createPackage();

		assertEquals(0, ProfileOperations.getAllAppliedProfiles(package_)
			.size());

		ProfileApplication profileApplication = UML2Factory.eINSTANCE
			.createProfileApplication();
		profileApplication.setImportedProfile(getElement());

		profileApplication.createEAnnotation(
			ProfileOperations.ANNOTATION_SOURCE__ATTRIBUTES).getDetails().put(
			ProfileOperations.ANNOTATION_DETAILS_KEY__VERSION,
			String.valueOf(0));

		package_.getAppliedProfiles().add(profileApplication);

		assertEquals(1, ProfileOperations.getAllAppliedProfiles(package_)
			.size());
		assertTrue(ProfileOperations.getAllAppliedProfiles(package_).contains(
			getElement()));

		org.eclipse.uml2.Package nestedPackage = UML2Factory.eINSTANCE
			.createPackage();

		assertEquals(0, ProfileOperations.getAllAppliedProfiles(nestedPackage)
			.size());

		package_.getOwnedMembers().add(nestedPackage);

		assertEquals(1, ProfileOperations.getAllAppliedProfiles(nestedPackage)
			.size());
		assertTrue(ProfileOperations.getAllAppliedProfiles(nestedPackage)
			.contains(getElement()));
	}

	/**
	 * Tests the '
	 * {@link org.eclipse.uml2.internal.operation.ProfileOperations#isApplied(org.eclipse.uml2.Profile, org.eclipse.uml2.Package) <em>Is Applied</em>}'
	 * method.
	 * 
	 * @see org.eclipse.uml2.internal.operation.ProfileOperations#isApplied(org.eclipse.uml2.Profile,
	 *      org.eclipse.uml2.Package)
	 */
	public void testIsApplied() {

		assertFalse(ProfileOperations.isApplied(null, null));

		assertFalse(ProfileOperations.isApplied(getElement(), null));

		getElement().createEAnnotation(
			ProfileOperations.ANNOTATION_SOURCE__ATTRIBUTES).getDetails().put(
			ProfileOperations.ANNOTATION_DETAILS_KEY__VERSION,
			String.valueOf(0));
		getElement().createEAnnotation(
			ProfileOperations.ANNOTATION_SOURCE__E_PACKAGES).getContents().add(
			0, ProfileOperations.createEPackage(getElement()));

		assertFalse(ProfileOperations.isApplied(getElement(), null));

		org.eclipse.uml2.Package package_ = UML2Factory.eINSTANCE
			.createPackage();

		assertFalse(ProfileOperations.isApplied(getElement(), package_));

		ProfileApplication profileApplication = UML2Factory.eINSTANCE
			.createProfileApplication();
		profileApplication.setImportedProfile(getElement());

		profileApplication.createEAnnotation(
			ProfileOperations.ANNOTATION_SOURCE__ATTRIBUTES).getDetails().put(
			ProfileOperations.ANNOTATION_DETAILS_KEY__VERSION,
			String.valueOf(0));

		package_.getAppliedProfiles().add(profileApplication);

		assertTrue(ProfileOperations.isApplied(getElement(), package_));
	}

	/**
	 * Tests the '
	 * {@link org.eclipse.uml2.internal.operation.ProfileOperations#isDefined(org.eclipse.uml2.Profile) <em>Is Defined</em>}'
	 * method.
	 * 
	 * @see org.eclipse.uml2.internal.operation.ProfileOperations#isDefined(org.eclipse.uml2.Profile)
	 */
	public void testIsDefined() {

		assertFalse(ProfileOperations.isDefined(null));

		assertFalse(ProfileOperations.isDefined(UML2Factory.eINSTANCE
			.createProfile()));

		assertFalse(ProfileOperations.isDefined(getElement()));

		getElement().createEAnnotation(
			ProfileOperations.ANNOTATION_SOURCE__ATTRIBUTES).getDetails().put(
			ProfileOperations.ANNOTATION_DETAILS_KEY__VERSION,
			String.valueOf(0));
		getElement().createEAnnotation(
			ProfileOperations.ANNOTATION_SOURCE__E_PACKAGES).getContents().add(
			0, ProfileOperations.createEPackage(getElement()));

		assertTrue(ProfileOperations.isDefined(getElement()));
	}

	/**
	 * Tests the '
	 * {@link org.eclipse.uml2.internal.operation.ProfileOperations#unapply(org.eclipse.uml2.Profile, org.eclipse.uml2.Package) <em>Unapply</em>}'
	 * method.
	 * 
	 * @see org.eclipse.uml2.internal.operation.ProfileOperations#unapply(org.eclipse.uml2.Profile,
	 *      org.eclipse.uml2.Package)
	 */
	public void testUnapply() {

		try {
			ProfileOperations.unapply(null, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		try {
			ProfileOperations.unapply(getElement(), null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		getElement().createEAnnotation(
			ProfileOperations.ANNOTATION_SOURCE__ATTRIBUTES).getDetails().put(
			ProfileOperations.ANNOTATION_DETAILS_KEY__VERSION,
			String.valueOf(0));
		getElement().createEAnnotation(
			ProfileOperations.ANNOTATION_SOURCE__E_PACKAGES).getContents().add(
			0, ProfileOperations.createEPackage(getElement()));

		try {
			ProfileOperations.unapply(getElement(), null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		org.eclipse.uml2.Package package_ = UML2Factory.eINSTANCE
			.createPackage();

		try {
			ProfileOperations.unapply(getElement(), package_);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		ProfileApplication profileApplication = UML2Factory.eINSTANCE
			.createProfileApplication();
		profileApplication.setImportedProfile(getElement());

		profileApplication.createEAnnotation(
			ProfileOperations.ANNOTATION_SOURCE__ATTRIBUTES).getDetails().put(
			ProfileOperations.ANNOTATION_DETAILS_KEY__VERSION,
			String.valueOf(0));

		package_.getAppliedProfiles().add(profileApplication);

		try {
			ProfileOperations.unapply(getElement(), package_);
		} catch (IllegalArgumentException iae) {
			fail();
		}

		assertEquals(0, package_.getAppliedProfiles().size());

		try {
			ProfileOperations.unapply(getElement(), package_);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}
	}

	/**
	 * Tests the '
	 * {@link org.eclipse.uml2.internal.operation.ProfileOperations#getReferencedMetaclasses(org.eclipse.uml2.Profile) <em>Get Referenced Metaclasses</em>}'
	 * method.
	 * 
	 * @see org.eclipse.uml2.internal.operation.ProfileOperations#getReferencedMetaclasses(org.eclipse.uml2.Profile)
	 */
	public void testGetReferencedMetaclasses() {

		assertEquals(0, ProfileOperations.getReferencedMetaclasses(null).size());

		setElement(UML2Factory.eINSTANCE.createProfile());

		assertEquals(0, ProfileOperations
			.getReferencedMetaclasses(getElement()).size());

		org.eclipse.uml2.Class class_ = UML2Factory.eINSTANCE.createClass();

		ElementImport elementImport = UML2Factory.eINSTANCE
			.createElementImport();
		elementImport.setImportedElement(class_);

		getElement().getMetaclassReferences().add(elementImport);

		assertEquals(1, ProfileOperations
			.getReferencedMetaclasses(getElement()).size());
		assertTrue(ProfileOperations.getReferencedMetaclasses(getElement())
			.contains(class_));
	}

	/**
	 * Tests the '
	 * {@link org.eclipse.uml2.internal.operation.ProfileOperations#referenceMetaclass(org.eclipse.uml2.Profile, org.eclipse.uml2.Class) <em>Reference Metaclass</em>}'
	 * method.
	 * 
	 * @see org.eclipse.uml2.internal.operation.ProfileOperations#referenceMetaclass(org.eclipse.uml2.Profile,
	 *      org.eclipse.uml2.Class)
	 */
	public void testReferenceMetaclass() {

		try {
			ProfileOperations.referenceMetaclass(null, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		setElement(UML2Factory.eINSTANCE.createProfile());

		try {
			ProfileOperations.referenceMetaclass(getElement(), null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		org.eclipse.uml2.Class class_ = UML2Factory.eINSTANCE.createClass();

		try {
			ProfileOperations.referenceMetaclass(getElement(), class_);
		} catch (IllegalArgumentException iae) {
			fail();
		}

		assertEquals(1, getElement().getMetaclassReferences().size());
		assertSame(class_, ((ElementImport) getElement()
			.getMetaclassReferences().get(0)).getImportedElement());
		assertSame(VisibilityKind.PRIVATE_LITERAL,
			((ElementImport) getElement().getMetaclassReferences().get(0))
				.getVisibility());

		try {
			ProfileOperations.referenceMetaclass(getElement(), class_);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}
	}

	/**
	 * Tests the '
	 * {@link org.eclipse.uml2.internal.operation.ProfileOperations#getReferencedMetamodels(org.eclipse.uml2.Profile) <em>Get Referenced Metamodels</em>}'
	 * method.
	 * 
	 * @see org.eclipse.uml2.internal.operation.ProfileOperations#getReferencedMetamodels(org.eclipse.uml2.Profile)
	 */
	public void testGetReferencedMetamodels() {

		assertEquals(0, ProfileOperations.getReferencedMetamodels(null).size());

		setElement(UML2Factory.eINSTANCE.createProfile());

		assertEquals(0, ProfileOperations.getReferencedMetamodels(getElement())
			.size());

		Model model = UML2Factory.eINSTANCE.createModel();

		PackageImport packageImport = UML2Factory.eINSTANCE
			.createPackageImport();
		packageImport.setImportedPackage(model);

		getElement().getMetamodelReferences().add(packageImport);

		assertEquals(1, ProfileOperations.getReferencedMetamodels(getElement())
			.size());
		assertTrue(ProfileOperations.getReferencedMetamodels(getElement())
			.contains(model));
	}

	/**
	 * Tests the '
	 * {@link org.eclipse.uml2.internal.operation.ProfileOperations#referenceMetamodel(org.eclipse.uml2.Profile, org.eclipse.uml2.Model) <em>Reference Metamodel</em>}'
	 * method.
	 * 
	 * @see org.eclipse.uml2.internal.operation.ProfileOperations#referenceMetamodel(org.eclipse.uml2.Profile,
	 *      org.eclipse.uml2.Model)
	 */
	public void testReferenceMetamodel() {

		try {
			ProfileOperations.referenceMetamodel(null, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		setElement(UML2Factory.eINSTANCE.createProfile());

		try {
			ProfileOperations.referenceMetamodel(getElement(), null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		Model model = UML2Factory.eINSTANCE.createModel();

		try {
			ProfileOperations.referenceMetamodel(getElement(), model);
		} catch (IllegalArgumentException iae) {
			fail();
		}

		assertEquals(1, getElement().getMetamodelReferences().size());
		assertSame(model, ((PackageImport) getElement()
			.getMetamodelReferences().get(0)).getImportedPackage());
		assertSame(VisibilityKind.PRIVATE_LITERAL,
			((PackageImport) getElement().getMetamodelReferences().get(0))
				.getVisibility());

		try {
			ProfileOperations.referenceMetamodel(getElement(), model);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}
	}

	/**
	 * Tests the '
	 * {@link org.eclipse.uml2.internal.operation.ProfileOperations#create(org.eclipse.uml2.Profile, org.eclipse.uml2.Classifier) <em>Create</em>}'
	 * method.
	 * 
	 * @see org.eclipse.uml2.internal.operation.ProfileOperations#create(org.eclipse.uml2.Profile,
	 *      org.eclipse.uml2.Classifier)
	 */
	public void testCreate() {
		EObject instance = null;

		try {
			instance = ProfileOperations.create(null, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		try {
			ProfileOperations.create(getElement(), null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		getElement().createEAnnotation(
			ProfileOperations.ANNOTATION_SOURCE__ATTRIBUTES).getDetails().put(
			ProfileOperations.ANNOTATION_DETAILS_KEY__VERSION,
			String.valueOf(0));
		getElement().createEAnnotation(
			ProfileOperations.ANNOTATION_SOURCE__E_PACKAGES).getContents().add(
			0, ProfileOperations.createEPackage(getElement()));

		try {
			ProfileOperations.create(getElement(), null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		org.eclipse.uml2.Class class_ = UML2Factory.eINSTANCE.createClass();

		try {
			ProfileOperations.create(getElement(), class_);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		class_ = (org.eclipse.uml2.Class) getElement().getOwnedType("Date"); //$NON-NLS-1$

		try {
			instance = ProfileOperations.create(getElement(), class_);
		} catch (IllegalArgumentException iae) {
			fail();
		}

		EAnnotation ePackagesAnnotation = getElement().getEAnnotation(
			ProfileOperations.ANNOTATION_SOURCE__E_PACKAGES);
		EPackage ePackage = (EPackage) ePackagesAnnotation.getContents().get(0);
		EClass dateEClass = (EClass) ePackage.getEClassifier(getName()
			+ "__" + class_.getName()); //$NON-NLS-1$

		assertTrue(dateEClass.isInstance(instance));
	}

}