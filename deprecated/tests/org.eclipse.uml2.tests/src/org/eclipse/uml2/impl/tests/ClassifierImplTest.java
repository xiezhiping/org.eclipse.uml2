/*
 * Copyright (c) 2003, 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *
 * $Id: ClassifierImplTest.java,v 1.3 2004/05/20 03:03:32 khussey Exp $
 */
package org.eclipse.uml2.impl.tests;

import java.util.Iterator;

import org.eclipse.uml2.Classifier;
import org.eclipse.uml2.Feature;
import org.eclipse.uml2.Generalization;
import org.eclipse.uml2.NamedElement;
import org.eclipse.uml2.Property;
import org.eclipse.uml2.RedefinableElement;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.VisibilityKind;
import org.eclipse.uml2.impl.ClassifierImpl;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Classifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.ClassifierImpl#getTemplateParameter() <em>Template Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassifierImpl#getOwningParameter() <em>Owning Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassifierImpl#getPackageableElement_visibility() <em>Packageable Element visibility</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassifierImpl#getPackage() <em>Package</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassifierImpl#getRedefinitionContexts() <em>Redefinition Context</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassifierImpl#getFeatures() <em>Feature</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassifierImpl#isAbstract() <em>Is Abstract</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassifierImpl#getInheritedMembers() <em>Inherited Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassifierImpl#getGenerals() <em>General</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassifierImpl#getAttributes() <em>Attribute</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassifierImpl#getSubstitutions() <em>Substitution</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassifierImpl#getRepresentation() <em>Representation</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassifierImpl#getOccurrences() <em>Occurrence</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.ClassifierImpl#getOwner() <em>Get Owner</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassifierImpl#getVisibility() <em>Get Visibility</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassifierImpl#setVisibility(VisibilityKind) <em>Set Visibility</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassifierImpl#conformsTo(Type) <em>Conforms To</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassifierImpl#getNamespace() <em>Get Namespace</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassifierImpl#validateRedefinitionContextValid(EDiagnosticChain, EMap) <em>Validate Redefinition Context Valid</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassifierImpl#validateRedefinitionConsistent(EDiagnosticChain, EMap) <em>Validate Redefinition Consistent</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassifierImpl#isConsistentWith(RedefinableElement) <em>Is Consistent With</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassifierImpl#isRedefinitionContextValid(RedefinableElement) <em>Is Redefinition Context Valid</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassifierImpl#getRedefinedElements() <em>Get Redefined Elements</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassifierImpl#allFeatures() <em>All Features</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassifierImpl#validateNoCyclesInGeneralization(EDiagnosticChain, EMap) <em>Validate No Cycles In Generalization</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassifierImpl#validateSpecializeType(EDiagnosticChain, EMap) <em>Validate Specialize Type</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassifierImpl#validateInheritedMember(EDiagnosticChain, EMap) <em>Validate Inherited Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassifierImpl#inheritedMember() <em>Inherited Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassifierImpl#parents() <em>Parents</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassifierImpl#allParents() <em>All Parents</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassifierImpl#inheritableMembers(Classifier) <em>Inheritable Members</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassifierImpl#hasVisibilityOf(NamedElement) <em>Has Visibility Of</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassifierImpl#inherit(Set) <em>Inherit</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassifierImpl#maySpecializeType(Classifier) <em>May Specialize Type</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassifierImpl#general() <em>General</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassifierImpl#validateGeneralEqualsParents(EDiagnosticChain, EMap) <em>Validate General Equals Parents</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassifierImpl#conformsTo(Classifier) <em>Conforms To</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassifierImpl#getMembers() <em>Get Members</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassifierImpl#getOwnedElements() <em>Get Owned Elements</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassifierImpl#getRedefinedElements() <em>Get Redefined Elements</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassifierImpl#getClientDependencies() <em>Get Client Dependencies</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassifierImpl#getOwnedMembers() <em>Get Owned Members</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public abstract class ClassifierImplTest extends NamespaceImplTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Constructs a new Classifier test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassifierImplTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Classifier test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ClassifierImpl getFixture() {
		return (ClassifierImpl) fixture;
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ClassifierImpl#getTemplateParameter() <em>Template Parameter</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ClassifierImpl#getTemplateParameter()
	 * @generated
	 */
	public void testGetTemplateParameter() {
		// TODO: implement this feature getter test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ClassifierImpl#setTemplateParameter() <em>Template Parameter</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ClassifierImpl#setTemplateParameter()
	 * @generated
	 */
	public void testSetTemplateParameter() {
		// TODO: implement this feature setter test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ClassifierImpl#getOwningParameter() <em>Owning Parameter</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ClassifierImpl#getOwningParameter()
	 * @generated
	 */
	public void testGetOwningParameter() {
		// TODO: implement this feature getter test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ClassifierImpl#setOwningParameter() <em>Owning Parameter</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ClassifierImpl#setOwningParameter()
	 * @generated
	 */
	public void testSetOwningParameter() {
		// TODO: implement this feature setter test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ClassifierImpl#getPackageableElement_visibility() <em>Packageable Element visibility</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ClassifierImpl#getPackageableElement_visibility()
	 * @generated
	 */
	public void testGetPackageableElement_visibility() {
		// TODO: implement this feature getter test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ClassifierImpl#setPackageableElement_visibility() <em>Packageable Element visibility</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ClassifierImpl#setPackageableElement_visibility()
	 * @generated
	 */
	public void testSetPackageableElement_visibility() {
		// TODO: implement this feature setter test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ClassifierImpl#getPackage() <em>Package</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ClassifierImpl#getPackage()
	 * @generated
	 */
	public void testGetPackageGen() {
		// TODO: implement this feature getter test method
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
	 * Tests the '{@link org.eclipse.uml2.impl.ClassifierImpl#getRedefinitionContexts() <em>Redefinition Context</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ClassifierImpl#getRedefinitionContexts()
	 * @generated
	 */
	public void testGetRedefinitionContextsGen() {
		// TODO: implement this feature getter test method
	}

	public void testGetRedefinitionContexts() {
		testGetRedefinitionContextsGen();
		
		setUpRedefinitionContexts();

		for (Iterator redefinitionContexts = getFixture().getRedefinitionContexts().iterator(); redefinitionContexts.hasNext();) {
			assertTrue(Classifier.class.isInstance(redefinitionContexts.next()));
		}
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ClassifierImpl#isAbstract() <em>Is Abstract</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ClassifierImpl#isAbstract()
	 * @generated
	 */
	public void testIsAbstract() {
		// TODO: implement this feature getter test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ClassifierImpl#setIsAbstract() <em>Is Abstract</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ClassifierImpl#setIsAbstract()
	 * @generated
	 */
	public void testSetIsAbstract() {
		// TODO: implement this feature setter test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ClassifierImpl#getFeatures() <em>Feature</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ClassifierImpl#getFeatures()
	 * @generated
	 */
	public void testGetFeaturesGen() {
		// TODO: implement this feature getter test method
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
	 * Tests the '{@link org.eclipse.uml2.impl.ClassifierImpl#getInheritedMembers() <em>Inherited Member</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ClassifierImpl#getInheritedMembers()
	 * @generated
	 */
	public void testGetInheritedMembers() {
		// TODO: implement this feature getter test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ClassifierImpl#getGenerals() <em>General</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ClassifierImpl#getGenerals()
	 * @generated
	 */
	public void testGetGeneralsGen() {
		// TODO: implement this feature getter test method
	}

	public void testGetGenerals() {
		testGetGeneralsGen();
		
		setUpParents();

		assertEquals(getFixture().general().size(), getFixture().getGenerals().size());
		assertTrue(getFixture().getGenerals().containsAll(getFixture().general()));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ClassifierImpl#getAttributes() <em>Attribute</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ClassifierImpl#getAttributes()
	 * @generated
	 */
	public void testGetAttributesGen() {
		// TODO: implement this feature getter test method
	}

	public void testGetAttributes() {
		testGetAttributesGen();
		
		setUpAttributes();

		for (Iterator attributes = getFixture().getAttributes().iterator(); attributes.hasNext();) {
			assertTrue(Property.class.isInstance(attributes.next()));
		}
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ClassifierImpl#getSubstitutions() <em>Substitution</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ClassifierImpl#getSubstitutions()
	 * @generated
	 */
	public void testGetSubstitutions() {
		// TODO: implement this feature getter test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ClassifierImpl#getRepresentation() <em>Representation</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ClassifierImpl#getRepresentation()
	 * @generated
	 */
	public void testGetRepresentation() {
		// TODO: implement this feature getter test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ClassifierImpl#setRepresentation() <em>Representation</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ClassifierImpl#setRepresentation()
	 * @generated
	 */
	public void testSetRepresentation() {
		// TODO: implement this feature setter test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ClassifierImpl#getOccurrences() <em>Occurrence</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ClassifierImpl#getOccurrences()
	 * @generated
	 */
	public void testGetOccurrences() {
		// TODO: implement this feature getter test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ClassifierImpl#getOwner() <em>Get Owner</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ClassifierImpl#getOwner()
	 * @generated
	 */
	public void testGetOwnerGen() {
		// TODO: implement this getter operation test method
	}

	public void testGetOwner() {
		testGetOwnerGen();
		
		super.testGetOwner();

		if (null != getFixture().getOwningParameter()) {
			assertSame(getFixture().getOwningParameter(), getFixture().getOwner());
		}
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ClassifierImpl#getVisibility() <em>Get Visibility</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ClassifierImpl#getVisibility()
	 * @generated
	 */
	public void testGetVisibilityGen() {
		// TODO: implement this getter operation test method
	}

	public void testGetVisibility() {
		testGetVisibilityGen();
		
		getFixture().setPackageableElement_visibility(VisibilityKind.PACKAGE_LITERAL);

		assertSame(getFixture().getPackageableElement_visibility(), getFixture().getVisibility());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ClassifierImpl#setVisibility(VisibilityKind) <em>Set Visibility</em>}' setter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ClassifierImpl#setVisibility(VisibilityKind)
	 * @generated
	 */
	public void testSetVisibility__VisibilityKindGen() {
		// TODO: implement this setter operation test method
	}

	public void testSetVisibility__VisibilityKind() {
		testSetVisibility__VisibilityKindGen();
		
		getFixture().setVisibility(VisibilityKind.PACKAGE_LITERAL);

		assertSame(getFixture().getVisibility(), getFixture().getPackageableElement_visibility());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ClassifierImpl#conformsTo(Type) <em>Conforms To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ClassifierImpl#conformsTo(Type)
	 * @generated
	 */
	public void testConformsTo__Type() {
		// TODO: implement this operation test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ClassifierImpl#getNamespace() <em>Get Namespace</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ClassifierImpl#getNamespace()
	 * @generated
	 */
	public void testGetNamespaceGen() {
		// TODO: implement this getter operation test method
	}

	public void testGetNamespace() {
		testGetNamespaceGen();
		
		super.testGetNamespace();

		if (null != getFixture().getPackage()) {
			assertSame(getFixture().getPackage(), getFixture().getNamespace());
		}
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ClassifierImpl#validateRedefinitionContextValid(EDiagnosticChain, EMap) <em>Validate Redefinition Context Valid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ClassifierImpl#validateRedefinitionContextValid(EDiagnosticChain, EMap)
	 * @generated
	 */
	public void testValidateRedefinitionContextValid__EDiagnosticChain_EMap() {
		// TODO: implement this operation test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ClassifierImpl#validateRedefinitionConsistent(EDiagnosticChain, EMap) <em>Validate Redefinition Consistent</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ClassifierImpl#validateRedefinitionConsistent(EDiagnosticChain, EMap)
	 * @generated
	 */
	public void testValidateRedefinitionConsistent__EDiagnosticChain_EMap() {
		// TODO: implement this operation test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ClassifierImpl#isConsistentWith(RedefinableElement) <em>Is Consistent With</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ClassifierImpl#isConsistentWith(RedefinableElement)
	 * @generated
	 */
	public void testIsConsistentWith__RedefinableElement() {
		// TODO: implement this operation test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ClassifierImpl#isRedefinitionContextValid(RedefinableElement) <em>Is Redefinition Context Valid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ClassifierImpl#isRedefinitionContextValid(RedefinableElement)
	 * @generated
	 */
	public void testIsRedefinitionContextValid__RedefinableElement() {
		// TODO: implement this operation test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ClassifierImpl#allFeatures() <em>All Features</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ClassifierImpl#allFeatures()
	 * @generated
	 */
	public void testAllFeaturesGen() {
		// TODO: implement this operation test method
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
	 * Tests the '{@link org.eclipse.uml2.impl.ClassifierImpl#validateNoCyclesInGeneralization(EDiagnosticChain, EMap) <em>Validate No Cycles In Generalization</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ClassifierImpl#validateNoCyclesInGeneralization(EDiagnosticChain, EMap)
	 * @generated
	 */
	public void testValidateNoCyclesInGeneralization__EDiagnosticChain_EMap() {
		// TODO: implement this operation test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ClassifierImpl#validateSpecializeType(EDiagnosticChain, EMap) <em>Validate Specialize Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ClassifierImpl#validateSpecializeType(EDiagnosticChain, EMap)
	 * @generated
	 */
	public void testValidateSpecializeType__EDiagnosticChain_EMap() {
		// TODO: implement this operation test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ClassifierImpl#validateInheritedMember(EDiagnosticChain, EMap) <em>Validate Inherited Member</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ClassifierImpl#validateInheritedMember(EDiagnosticChain, EMap)
	 * @generated
	 */
	public void testValidateInheritedMember__EDiagnosticChain_EMap() {
		// TODO: implement this operation test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ClassifierImpl#inheritedMember() <em>Inherited Member</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ClassifierImpl#inheritedMember()
	 * @generated
	 */
	public void testInheritedMember() {
		// TODO: implement this operation test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ClassifierImpl#parents() <em>Parents</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ClassifierImpl#parents()
	 * @generated
	 */
	public void testParentsGen() {
		// TODO: implement this operation test method
	}

	public void testParents() {
		testParentsGen();
		
		setUpParents();

		for (Iterator generalizations = getFixture().getGeneralizations().iterator(); generalizations.hasNext();) {
			assertTrue(getFixture().parents().contains(((Generalization) generalizations.next()).getGeneral()));
		}
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ClassifierImpl#allParents() <em>All Parents</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ClassifierImpl#allParents()
	 * @generated
	 */
	public void testAllParentsGen() {
		// TODO: implement this operation test method
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
	 * Tests the '{@link org.eclipse.uml2.impl.ClassifierImpl#inheritableMembers(Classifier) <em>Inheritable Members</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ClassifierImpl#inheritableMembers(Classifier)
	 * @generated
	 */
	public void testInheritableMembers__Classifier() {
		// TODO: implement this operation test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ClassifierImpl#hasVisibilityOf(NamedElement) <em>Has Visibility Of</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ClassifierImpl#hasVisibilityOf(NamedElement)
	 * @generated
	 */
	public void testHasVisibilityOf__NamedElement() {
		// TODO: implement this operation test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ClassifierImpl#inherit(Set) <em>Inherit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ClassifierImpl#inherit(Set)
	 * @generated
	 */
	public void testInherit__Set() {
		// TODO: implement this operation test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ClassifierImpl#maySpecializeType(Classifier) <em>May Specialize Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ClassifierImpl#maySpecializeType(Classifier)
	 * @generated
	 */
	public void testMaySpecializeType__Classifier() {
		// TODO: implement this operation test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ClassifierImpl#general() <em>General</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ClassifierImpl#general()
	 * @generated
	 */
	public void testGeneralGen() {
		// TODO: implement this operation test method
	}

	public void testGeneral() {
		testGeneralGen();
		
		setUpParents();

		assertTrue(getFixture().general().containsAll(getFixture().parents()));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ClassifierImpl#validateGeneralEqualsParents(EDiagnosticChain, EMap) <em>Validate General Equals Parents</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ClassifierImpl#validateGeneralEqualsParents(EDiagnosticChain, EMap)
	 * @generated
	 */
	public void testValidateGeneralEqualsParents__EDiagnosticChain_EMap() {
		// TODO: implement this operation test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ClassifierImpl#conformsTo(Classifier) <em>Conforms To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ClassifierImpl#conformsTo(Classifier)
	 * @generated
	 */
	public void testConformsTo__Classifier() {
		// TODO: implement this operation test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ClassifierImpl#getMembers() <em>Get Members</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ClassifierImpl#getMembers()
	 * @generated
	 */
	public void testGetMembersGen() {
		// TODO: implement this getter operation test method
	}

	public void testGetMembers() {
		testGetMembersGen();
		
		super.testGetMembers();

		assertTrue(getFixture().getMembers().containsAll(getFixture().getFeatures()));

		assertTrue(getFixture().getMembers().containsAll(getFixture().getInheritedMembers()));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ClassifierImpl#getOwnedElements() <em>Get Owned Elements</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ClassifierImpl#getOwnedElements()
	 * @generated
	 */
	public void testGetOwnedElementsGen() {
		// TODO: implement this getter operation test method
	}

	public void testGetOwnedElements() {
		testGetOwnedElementsGen();
		
		super.testGetOwnedElements();

		assertTrue(getFixture().getOwnedElements().containsAll(getFixture().getGeneralizations()));
		assertTrue(getFixture().getOwnedElements().containsAll(getFixture().getOccurrences()));
		assertTrue(getFixture().getOwnedElements().containsAll(getFixture().getSubstitutions()));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ClassifierImpl#getRedefinedElements() <em>Get Redefined Elements</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ClassifierImpl#getRedefinedElements()
	 * @generated
	 */
	public void testGetRedefinedElementsGen() {
		// TODO: implement this getter operation test method
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
	 * Tests the '{@link org.eclipse.uml2.impl.ClassifierImpl#getClientDependencies() <em>Get Client Dependencies</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ClassifierImpl#getClientDependencies()
	 * @generated
	 */
	public void testGetClientDependencies() {
		// TODO: implement this getter operation test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ClassifierImpl#getOwnedMembers() <em>Get Owned Members</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ClassifierImpl#getOwnedMembers()
	 * @generated
	 */
	public void testGetOwnedMembersGen() {
		// TODO: implement this getter operation test method
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
