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
 * $Id: AssociationClassTest.java,v 1.1 2005/04/04 20:06:07 khussey Exp $
 */
package org.eclipse.uml2.tests;

import java.util.Iterator;

import junit.textui.TestRunner;

import org.eclipse.uml2.AssociationClass;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.uml2.Property;
import org.eclipse.uml2.Type;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Association Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.Relationship#getRelatedElements() <em>Related Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.Association#getOwnedEnds() <em>Owned End</em>}</li>
 *   <li>{@link org.eclipse.uml2.Association#getEndTypes() <em>End Type</em>}</li>
 *   <li>{@link org.eclipse.uml2.Association#getMemberEnds() <em>Member End</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.Association#getFeatures() <em>Get Features</em>}</li>
 *   <li>{@link org.eclipse.uml2.Association#getOwnedMembers() <em>Get Owned Members</em>}</li>
 *   <li>{@link org.eclipse.uml2.Association#getRelatedElements() <em>Get Related Elements</em>}</li>
 *   <li>{@link org.eclipse.uml2.Association#getMembers() <em>Get Members</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class AssociationClassTest extends ClassTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2003, 2005 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AssociationClassTest.class);
	}

	/**
	 * Constructs a new Association Class test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociationClassTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Association Class test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private AssociationClass getFixture() {
		return (AssociationClass)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(UML2Factory.eINSTANCE.createAssociationClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	protected void tearDown() throws Exception {
		setFixture(null);
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Relationship#getRelatedElements() <em>Related Element</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Relationship#getRelatedElements()
	 * @generated
	 */
	public void testGetRelatedElementsGen() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testGetRelatedElements() {
		testGetRelatedElementsGen();

		for (Iterator eAllSubClasses = getEAllSubClasses(UML2Package.eINSTANCE.getType()).iterator(); eAllSubClasses.hasNext();) {
			Property memberEnd = UML2Factory.eINSTANCE.createProperty();
			memberEnd.setType((Type) UML2Factory.eINSTANCE.create((EClass) eAllSubClasses.next()));

			getFixture().getMemberEnds().add(memberEnd);
			
			assertTrue(getFixture().getRelatedElements().contains(memberEnd.getType()));
		}

		Property memberEnd = UML2Factory.eINSTANCE.createProperty();

		getFixture().getMemberEnds().add(memberEnd);
		
		assertFalse(getFixture().getRelatedElements().contains(memberEnd.getType()));		
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Association#getOwnedEnds() <em>Owned End</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Association#getOwnedEnds()
	 * @generated
	 */
	public void testGetOwnedEnds() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Association#getEndTypes() <em>End Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Association#getEndTypes()
	 * @generated
	 */
	public void testGetEndTypesGen() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testGetEndTypes() {
		testGetEndTypesGen();

		for (Iterator eAllSubClasses = getEAllSubClasses(UML2Package.eINSTANCE.getType()).iterator(); eAllSubClasses.hasNext();) {
			Property memberEnd = UML2Factory.eINSTANCE.createProperty();
			memberEnd.setType((Type) UML2Factory.eINSTANCE.create((EClass) eAllSubClasses.next()));

			getFixture().getMemberEnds().add(memberEnd);
		}

		for (Iterator memberEnds = getFixture().getMemberEnds().iterator(); memberEnds.hasNext();) {
			assertTrue(getFixture().getEndTypes().contains(((Property) memberEnds.next()).getType()));
		}
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Association#getMemberEnds() <em>Member End</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Association#getMemberEnds()
	 * @generated
	 */
	public void testGetMemberEnds() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Association#getFeatures() <em>Get Features</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Association#getFeatures()
	 * @generated
	 */
	public void testGetFeaturesGen() {
		// TODO: implement this getter operation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testGetFeatures() {
		testGetFeaturesGen();
		
		super.testGetFeatures();

		assertTrue(getFixture().getFeatures().containsAll(getFixture().getOwnedEnds()));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Association#getOwnedMembers() <em>Get Owned Members</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Association#getOwnedMembers()
	 * @generated
	 */
	public void testGetOwnedMembersGen() {
		// TODO: implement this getter operation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testGetOwnedMembers() {
		testGetOwnedMembersGen();
		
		super.testGetOwnedMembers();

		assertTrue(getFixture().getOwnedMembers().containsAll(getFixture().getOwnedEnds()));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Association#getMembers() <em>Get Members</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Association#getMembers()
	 * @generated
	 */
	public void testGetMembersGen() {
		// TODO: implement this getter operation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testGetMembers() {
		testGetMembersGen();
		
		super.testGetMembers();

		assertTrue(getFixture().getMembers().containsAll(getFixture().getMemberEnds()));
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.NamespaceImplTest#setUpMembers()
	 */
	protected void setUpMembers() {
		super.setUpMembers();

		getFixture().getMemberEnds().add(UML2Factory.eINSTANCE.createProperty());
		getFixture().getMemberEnds().add(UML2Factory.eINSTANCE.createProperty());
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.NamespaceImplTest#setUpOwnedMembers()
	 */
	protected void setUpOwnedMembers() {
		super.setUpOwnedMembers();

		getFixture().getOwnedEnds().add(UML2Factory.eINSTANCE.createProperty());
		getFixture().getOwnedEnds().add(UML2Factory.eINSTANCE.createProperty());
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.ClassifierImplTest#setUpFeatures()
	 */
	protected void setUpFeatures() {
		super.setUpFeatures();

		getFixture().getOwnedEnds().add(UML2Factory.eINSTANCE.createProperty());
		getFixture().getOwnedEnds().add(UML2Factory.eINSTANCE.createProperty());
	}

} //AssociationClassImplTest
