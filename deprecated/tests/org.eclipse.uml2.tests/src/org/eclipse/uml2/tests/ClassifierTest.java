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
 * $Id: ClassifierTest.java,v 1.1 2005/04/04 20:06:07 khussey Exp $
 */
package org.eclipse.uml2.tests;

import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.DiagnosticChain;

import java.util.Iterator;

import org.eclipse.uml2.Classifier;
import org.eclipse.uml2.CollaborationOccurrence;
import org.eclipse.uml2.Feature;
import org.eclipse.uml2.Generalization;
import org.eclipse.uml2.NamedElement;
import org.eclipse.uml2.Property;
import org.eclipse.uml2.RedefinableElement;
import org.eclipse.uml2.TemplateParameter;
import org.eclipse.uml2.Type;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Classifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.ParameterableElement#getTemplateParameter() <em>Template Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.ParameterableElement#getOwningParameter() <em>Owning Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.PackageableElement#getPackageableElement_visibility() <em>Packageable Element visibility</em>}</li>
 *   <li>{@link org.eclipse.uml2.Type#getPackage() <em>Package</em>}</li>
 *   <li>{@link org.eclipse.uml2.RedefinableElement#getRedefinitionContexts() <em>Redefinition Context</em>}</li>
 *   <li>{@link org.eclipse.uml2.Classifier#getFeatures() <em>Feature</em>}</li>
 *   <li>{@link org.eclipse.uml2.Classifier#isAbstract() <em>Is Abstract</em>}</li>
 *   <li>{@link org.eclipse.uml2.Classifier#getInheritedMembers() <em>Inherited Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.Classifier#getGenerals() <em>General</em>}</li>
 *   <li>{@link org.eclipse.uml2.Classifier#getAttributes() <em>Attribute</em>}</li>
 *   <li>{@link org.eclipse.uml2.Classifier#getSubstitutions() <em>Substitution</em>}</li>
 *   <li>{@link org.eclipse.uml2.Classifier#getRepresentation() <em>Representation</em>}</li>
 *   <li>{@link org.eclipse.uml2.Classifier#getOccurrences() <em>Occurrence</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.ParameterableElement#getOwner() <em>Get Owner</em>}</li>
 *   <li>{@link org.eclipse.uml2.PackageableElement#getVisibility() <em>Get Visibility</em>}</li>
 *   <li>{@link org.eclipse.uml2.PackageableElement#setVisibility(VisibilityKind) <em>Set Visibility</em>}</li>
 *   <li>{@link org.eclipse.uml2.Type#conformsTo(Type) <em>Conforms To</em>}</li>
 *   <li>{@link org.eclipse.uml2.Type#getNamespace() <em>Get Namespace</em>}</li>
 *   <li>{@link org.eclipse.uml2.RedefinableElement#validateRedefinitionContextValid(DiagnosticChain, Map) <em>Validate Redefinition Context Valid</em>}</li>
 *   <li>{@link org.eclipse.uml2.RedefinableElement#validateRedefinitionConsistent(DiagnosticChain, Map) <em>Validate Redefinition Consistent</em>}</li>
 *   <li>{@link org.eclipse.uml2.RedefinableElement#isConsistentWith(RedefinableElement) <em>Is Consistent With</em>}</li>
 *   <li>{@link org.eclipse.uml2.RedefinableElement#isRedefinitionContextValid(RedefinableElement) <em>Is Redefinition Context Valid</em>}</li>
 *   <li>{@link org.eclipse.uml2.RedefinableElement#getRedefinedElements() <em>Get Redefined Elements</em>}</li>
 *   <li>{@link org.eclipse.uml2.Classifier#allFeatures() <em>All Features</em>}</li>
 *   <li>{@link org.eclipse.uml2.Classifier#validateNoCyclesInGeneralization(DiagnosticChain, Map) <em>Validate No Cycles In Generalization</em>}</li>
 *   <li>{@link org.eclipse.uml2.Classifier#validateSpecializeType(DiagnosticChain, Map) <em>Validate Specialize Type</em>}</li>
 *   <li>{@link org.eclipse.uml2.Classifier#validateInheritedMember(DiagnosticChain, Map) <em>Validate Inherited Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.Classifier#inheritedMember() <em>Inherited Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.Classifier#parents() <em>Parents</em>}</li>
 *   <li>{@link org.eclipse.uml2.Classifier#allParents() <em>All Parents</em>}</li>
 *   <li>{@link org.eclipse.uml2.Classifier#inheritableMembers(Classifier) <em>Inheritable Members</em>}</li>
 *   <li>{@link org.eclipse.uml2.Classifier#hasVisibilityOf(NamedElement) <em>Has Visibility Of</em>}</li>
 *   <li>{@link org.eclipse.uml2.Classifier#inherit(Set) <em>Inherit</em>}</li>
 *   <li>{@link org.eclipse.uml2.Classifier#maySpecializeType(Classifier) <em>May Specialize Type</em>}</li>
 *   <li>{@link org.eclipse.uml2.Classifier#general() <em>General</em>}</li>
 *   <li>{@link org.eclipse.uml2.Classifier#validateGeneralEqualsParents(DiagnosticChain, Map) <em>Validate General Equals Parents</em>}</li>
 *   <li>{@link org.eclipse.uml2.Classifier#conformsTo(Classifier) <em>Conforms To</em>}</li>
 *   <li>{@link org.eclipse.uml2.Classifier#getMembers() <em>Get Members</em>}</li>
 *   <li>{@link org.eclipse.uml2.Classifier#getOwnedElements() <em>Get Owned Elements</em>}</li>
 *   <li>{@link org.eclipse.uml2.Classifier#getRedefinedElements() <em>Get Redefined Elements</em>}</li>
 *   <li>{@link org.eclipse.uml2.Classifier#getClientDependencies() <em>Get Client Dependencies</em>}</li>
 *   <li>{@link org.eclipse.uml2.Classifier#getOwnedMembers() <em>Get Owned Members</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public abstract class ClassifierTest extends NamespaceTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2003, 2005 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Constructs a new Classifier test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassifierTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Classifier test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Classifier getFixture() {
		return (Classifier)fixture;
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.ParameterableElement#getTemplateParameter() <em>Template Parameter</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.ParameterableElement#getTemplateParameter()
	 * @generated
	 */
	public void testGetTemplateParameter() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.ParameterableElement#setTemplateParameter(TemplateParameter) <em>Template Parameter</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.ParameterableElement#setTemplateParameter(TemplateParameter)
	 * @generated
	 */
	public void testSetTemplateParameter() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.ParameterableElement#getOwningParameter() <em>Owning Parameter</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.ParameterableElement#getOwningParameter()
	 * @generated
	 */
	public void testGetOwningParameter() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.ParameterableElement#setOwningParameter(TemplateParameter) <em>Owning Parameter</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.ParameterableElement#setOwningParameter(TemplateParameter)
	 * @generated
	 */
	public void testSetOwningParameter() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.PackageableElement#getPackageableElement_visibility() <em>Packageable Element visibility</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.PackageableElement#getPackageableElement_visibility()
	 * @generated
	 */
	public void testGetPackageableElement_visibility() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.PackageableElement#setPackageableElement_visibility(VisibilityKind) <em>Packageable Element visibility</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.PackageableElement#setPackageableElement_visibility(VisibilityKind)
	 * @generated
	 */
	public void testSetPackageableElement_visibility() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Type#getPackage() <em>Package</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Type#getPackage()
	 * @generated
	 */
	public void testGetPackageGen() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testGetPackage() {
		testGetPackageGen();
		
		org.eclipse.uml2.Package package_ = UML2Factory.eINSTANCE.createPackage();

		package_.getOwnedMembers().add(getFixture());
		assertSame(package_, getFixture().getPackage());

		package_.getOwnedMembers().remove(getFixture());
		assertNull(getFixture().getPackage());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.RedefinableElement#getRedefinitionContexts() <em>Redefinition Context</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.RedefinableElement#getRedefinitionContexts()
	 * @generated
	 */
	public void testGetRedefinitionContextsGen() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testGetRedefinitionContexts() {
		testGetRedefinitionContextsGen();
		
		setUpRedefinitionContexts();

		for (Iterator redefinitionContexts = getFixture().getRedefinitionContexts().iterator(); redefinitionContexts.hasNext();) {
			assertTrue(Classifier.class.isInstance(redefinitionContexts.next()));
		}
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Classifier#isAbstract() <em>Is Abstract</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Classifier#isAbstract()
	 * @generated
	 */
	public void testIsAbstract() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Classifier#setIsAbstract(boolean) <em>Is Abstract</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Classifier#setIsAbstract(boolean)
	 * @generated
	 */
	public void testSetIsAbstract() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Classifier#getFeatures() <em>Feature</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Classifier#getFeatures()
	 * @generated
	 */
	public void testGetFeaturesGen() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testGetFeatures() {
		testGetFeaturesGen();
		
		setUpFeatures();

		for (Iterator features = getFixture().getFeatures().iterator(); features.hasNext();) {
			assertTrue(Feature.class.isInstance(features.next()));
		}

		assertTrue(getFixture().getFeatures().containsAll(getFixture().getAttributes()));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Classifier#getInheritedMembers() <em>Inherited Member</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Classifier#getInheritedMembers()
	 * @generated
	 */
	public void testGetInheritedMembers() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Classifier#getGenerals() <em>General</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Classifier#getGenerals()
	 * @generated
	 */
	public void testGetGeneralsGen() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testGetGenerals() {
		testGetGeneralsGen();
		
		setUpParents();

		assertEquals(getFixture().general().size(), getFixture().getGenerals().size());
		assertTrue(getFixture().getGenerals().containsAll(getFixture().general()));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Classifier#getAttributes() <em>Attribute</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Classifier#getAttributes()
	 * @generated
	 */
	public void testGetAttributesGen() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testGetAttributes() {
		testGetAttributesGen();
		
		setUpAttributes();

		for (Iterator attributes = getFixture().getAttributes().iterator(); attributes.hasNext();) {
			assertTrue(Property.class.isInstance(attributes.next()));
		}
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Classifier#getSubstitutions() <em>Substitution</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Classifier#getSubstitutions()
	 * @generated
	 */
	public void testGetSubstitutions() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Classifier#getRepresentation() <em>Representation</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Classifier#getRepresentation()
	 * @generated
	 */
	public void testGetRepresentation() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Classifier#setRepresentation(CollaborationOccurrence) <em>Representation</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Classifier#setRepresentation(CollaborationOccurrence)
	 * @generated
	 */
	public void testSetRepresentation() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Classifier#getOccurrences() <em>Occurrence</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Classifier#getOccurrences()
	 * @generated
	 */
	public void testGetOccurrences() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.ParameterableElement#getOwner() <em>Get Owner</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.ParameterableElement#getOwner()
	 * @generated
	 */
	public void testGetOwnerGen() {
		// TODO: implement this getter operation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testGetOwner() {
		testGetOwnerGen();
		
		super.testGetOwner();

		if (null != getFixture().getOwningParameter()) {
			assertSame(getFixture().getOwningParameter(), getFixture().getOwner());
		}
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.PackageableElement#getVisibility() <em>Get Visibility</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.PackageableElement#getVisibility()
	 * @generated
	 */
	public void testGetVisibilityGen() {
		// TODO: implement this getter operation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testGetVisibility() {
		testGetVisibilityGen();
		
		getFixture().setPackageableElement_visibility(VisibilityKind.PACKAGE_LITERAL);

		assertSame(getFixture().getPackageableElement_visibility(), getFixture().getVisibility());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.PackageableElement#setVisibility(VisibilityKind) <em>Set Visibility</em>}' setter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.PackageableElement#setVisibility(VisibilityKind)
	 * @generated
	 */
	public void testSetVisibilityGen() {
		// TODO: implement this setter operation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testSetVisibility() {
		testSetVisibilityGen();
		
		getFixture().setVisibility(VisibilityKind.PACKAGE_LITERAL);

		assertSame(getFixture().getVisibility(), getFixture().getPackageableElement_visibility());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Type#conformsTo(Type) <em>Conforms To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Type#conformsTo(Type)
	 * @generated
	 */
	public void testConformsTo__Type() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Type#getNamespace() <em>Get Namespace</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Type#getNamespace()
	 * @generated
	 */
	public void testGetNamespaceGen() {
		// TODO: implement this getter operation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testGetNamespace() {
		testGetNamespaceGen();
		
		super.testGetNamespace();

		if (null != getFixture().getPackage()) {
			assertSame(getFixture().getPackage(), getFixture().getNamespace());
		}
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.RedefinableElement#validateRedefinitionContextValid(DiagnosticChain, Map) <em>Validate Redefinition Context Valid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.RedefinableElement#validateRedefinitionContextValid(DiagnosticChain, Map)
	 * @generated
	 */
	public void testValidateRedefinitionContextValid__DiagnosticChain_Map() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.RedefinableElement#validateRedefinitionConsistent(DiagnosticChain, Map) <em>Validate Redefinition Consistent</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.RedefinableElement#validateRedefinitionConsistent(DiagnosticChain, Map)
	 * @generated
	 */
	public void testValidateRedefinitionConsistent__DiagnosticChain_Map() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.RedefinableElement#isConsistentWith(RedefinableElement) <em>Is Consistent With</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.RedefinableElement#isConsistentWith(RedefinableElement)
	 * @generated
	 */
	public void testIsConsistentWith__RedefinableElement() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.RedefinableElement#isRedefinitionContextValid(RedefinableElement) <em>Is Redefinition Context Valid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.RedefinableElement#isRedefinitionContextValid(RedefinableElement)
	 * @generated
	 */
	public void testIsRedefinitionContextValid__RedefinableElement() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Classifier#allFeatures() <em>All Features</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Classifier#allFeatures()
	 * @generated
	 */
	public void testAllFeaturesGen() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testAllFeatures() {
		testAllFeaturesGen();
		
		setUpMembers();

		try {
			for (Iterator members = getFixture().getMembers().iterator(); members.hasNext();) {
				NamedElement member = (NamedElement) members.next();

				if (Feature.class.isInstance(member)) {
					assertTrue(getFixture().allFeatures().contains(member));
				}
			}
		} catch (ClassCastException cce) {
			fail();
		}
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Classifier#validateNoCyclesInGeneralization(DiagnosticChain, Map) <em>Validate No Cycles In Generalization</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Classifier#validateNoCyclesInGeneralization(DiagnosticChain, Map)
	 * @generated
	 */
	public void testValidateNoCyclesInGeneralization__DiagnosticChain_Map() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Classifier#validateSpecializeType(DiagnosticChain, Map) <em>Validate Specialize Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Classifier#validateSpecializeType(DiagnosticChain, Map)
	 * @generated
	 */
	public void testValidateSpecializeType__DiagnosticChain_Map() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Classifier#validateInheritedMember(DiagnosticChain, Map) <em>Validate Inherited Member</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Classifier#validateInheritedMember(DiagnosticChain, Map)
	 * @generated
	 */
	public void testValidateInheritedMember__DiagnosticChain_Map() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Classifier#inheritedMember() <em>Inherited Member</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Classifier#inheritedMember()
	 * @generated
	 */
	public void testInheritedMember() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Classifier#parents() <em>Parents</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Classifier#parents()
	 * @generated
	 */
	public void testParentsGen() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testParents() {
		testParentsGen();
		
		setUpParents();

		for (Iterator generalizations = getFixture().getGeneralizations().iterator(); generalizations.hasNext();) {
			assertTrue(getFixture().parents().contains(((Generalization) generalizations.next()).getGeneral()));
		}
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Classifier#allParents() <em>All Parents</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Classifier#allParents()
	 * @generated
	 */
	public void testAllParentsGen() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testAllParents() {
		testAllParentsGen();
		
		setUpParents();

		assertTrue(getFixture().allParents().containsAll(getFixture().parents()));

		for (Iterator allParents = getFixture().allParents().iterator(); allParents.hasNext();) {
			assertTrue(getFixture().allParents().containsAll(((Classifier) allParents.next()).allParents()));
		}

		Generalization generalization = UML2Factory.eINSTANCE.createGeneralization();
		generalization.setGeneral(getFixture());

		getFixture().getGeneralizations().add(generalization);

		assertTrue(getFixture().allParents().contains(getFixture()));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Classifier#inheritableMembers(Classifier) <em>Inheritable Members</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Classifier#inheritableMembers(Classifier)
	 * @generated
	 */
	public void testInheritableMembers__Classifier() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Classifier#hasVisibilityOf(NamedElement) <em>Has Visibility Of</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Classifier#hasVisibilityOf(NamedElement)
	 * @generated
	 */
	public void testHasVisibilityOf__NamedElement() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Classifier#inherit(Set) <em>Inherit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Classifier#inherit(Set)
	 * @generated
	 */
	public void testInherit__Set() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Classifier#maySpecializeType(Classifier) <em>May Specialize Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Classifier#maySpecializeType(Classifier)
	 * @generated
	 */
	public void testMaySpecializeType__Classifier() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Classifier#general() <em>General</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Classifier#general()
	 * @generated
	 */
	public void testGeneralGen() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testGeneral() {
		testGeneralGen();
		
		setUpParents();

		assertTrue(getFixture().general().containsAll(getFixture().parents()));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Classifier#validateGeneralEqualsParents(DiagnosticChain, Map) <em>Validate General Equals Parents</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Classifier#validateGeneralEqualsParents(DiagnosticChain, Map)
	 * @generated
	 */
	public void testValidateGeneralEqualsParents__DiagnosticChain_Map() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Classifier#conformsTo(Classifier) <em>Conforms To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Classifier#conformsTo(Classifier)
	 * @generated
	 */
	public void testConformsTo__Classifier() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Classifier#getMembers() <em>Get Members</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Classifier#getMembers()
	 * @generated
	 */
	public void testGetMembersGen() {
		// TODO: implement this getter operation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testGetMembers() {
		testGetMembersGen();
		
		super.testGetMembers();

		assertTrue(getFixture().getMembers().containsAll(getFixture().getFeatures()));

		assertTrue(getFixture().getMembers().containsAll(getFixture().getInheritedMembers()));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Classifier#getOwnedElements() <em>Get Owned Elements</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Classifier#getOwnedElements()
	 * @generated
	 */
	public void testGetOwnedElementsGen() {
		// TODO: implement this getter operation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testGetOwnedElements() {
		testGetOwnedElementsGen();
		
		super.testGetOwnedElements();

		assertTrue(getFixture().getOwnedElements().containsAll(getFixture().getGeneralizations()));
		assertTrue(getFixture().getOwnedElements().containsAll(getFixture().getOccurrences()));
		assertTrue(getFixture().getOwnedElements().containsAll(getFixture().getSubstitutions()));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Classifier#getRedefinedElements() <em>Get Redefined Elements</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Classifier#getRedefinedElements()
	 * @generated
	 */
	public void testGetRedefinedElementsGen() {
		// TODO: implement this getter operation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testGetRedefinedElements() {
		testGetRedefinedElementsGen();
		
		setUpRedefinedElements();

		for (Iterator redefinedElements = getFixture().getRedefinedElements().iterator(); redefinedElements.hasNext();) {
			assertTrue(RedefinableElement.class.isInstance(redefinedElements.next()));
		}

		assertTrue(getFixture().getRedefinedElements().containsAll(getFixture().getRedefinedClassifiers()));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Classifier#getClientDependencies() <em>Get Client Dependencies</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Classifier#getClientDependencies()
	 * @generated
	 */
	public void testGetClientDependencies() {
		// TODO: implement this getter operation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Classifier#getOwnedMembers() <em>Get Owned Members</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Classifier#getOwnedMembers()
	 * @generated
	 */
	public void testGetOwnedMembersGen() {
		// TODO: implement this getter operation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testGetOwnedMembers() {
		testGetOwnedMembersGen();
		
		super.testGetOwnedMembers();

		assertTrue(getFixture().getOwnedMembers().containsAll(getFixture().getOwnedUseCases()));
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.ElementImplTest#setUpOwnedElements()
	 */
	protected void setUpOwnedElements() {
		super.setUpOwnedElements();

		getFixture().getGeneralizations().add(UML2Factory.eINSTANCE.createGeneralization());
		getFixture().getGeneralizations().add(UML2Factory.eINSTANCE.createGeneralization());

		getFixture().getOccurrences().add(UML2Factory.eINSTANCE.createCollaborationOccurrence());
		getFixture().getOccurrences().add(UML2Factory.eINSTANCE.createCollaborationOccurrence());

		getFixture().getSubstitutions().add(UML2Factory.eINSTANCE.createSubstitution());
		getFixture().getSubstitutions().add(UML2Factory.eINSTANCE.createSubstitution());
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.NamespaceImplTest#setUpMembers()
	 */
	protected void setUpMembers() {
		super.setUpMembers();

		setUpFeatures();

		setUpParents();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.NamespaceImplTest#setUpOwnedMembers()
	 */
	protected void setUpOwnedMembers() {
		super.setUpOwnedMembers();

		getFixture().getOwnedUseCases().add(UML2Factory.eINSTANCE.createUseCase());
		getFixture().getOwnedUseCases().add(UML2Factory.eINSTANCE.createUseCase());
	}

	protected void setUpFeatures() {
		setUpAttributes();
	}

	protected void setUpAttributes() {
		// do nothing
	}

	protected void setUpParents() {
		getFixture().getGeneralizations().add(UML2Factory.eINSTANCE.createGeneralization());
		getFixture().getGeneralizations().add(UML2Factory.eINSTANCE.createGeneralization());

		for (Iterator generalizations = getFixture().getGeneralizations().iterator(); generalizations.hasNext();) {
			((Generalization) generalizations.next()).setGeneral((Classifier) UML2Factory.eINSTANCE.create(getFixture().eClass()));
		}
	}

	protected void setUpRedefinitionContexts() {
		// do nothing
	}

	protected void setUpRedefinedElements() {
		getFixture().getRedefinedClassifiers().add(UML2Factory.eINSTANCE.create(getFixture().eClass()));
		getFixture().getRedefinedClassifiers().add(UML2Factory.eINSTANCE.create(getFixture().eClass()));
	}

} //ClassifierImplTest
