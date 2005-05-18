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
 * $Id: AssociationTest.java,v 1.2 2005/05/18 17:04:28 khussey Exp $
 */
package org.eclipse.uml2.tests;

import java.util.Iterator;

import junit.textui.TestRunner;

import org.eclipse.uml2.Association;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.uml2.Property;
import org.eclipse.uml2.Type;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.Association#getEndTypes() <em>End Type</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class AssociationTest extends ClassifierTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AssociationTest.class);
	}

	/**
	 * Constructs a new Association test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Association test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Association getFixture() {
		return (Association)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(UML2Factory.eINSTANCE.createAssociation());
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
	 * Tests the '{@link org.eclipse.uml2.Classifier#getFeatures() <em>Feature</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Classifier#getFeatures()
	 * @generated
	 */
	public void testGetFeaturesGen() {
		// TODO: implement this union feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testGetFeatures() {
		testGetFeaturesGen();
		
		super.testGetFeatures();

		assertTrue(getFixture().getFeatures().containsAll(getFixture().getOwnedEnds()));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Namespace#getOwnedMembers() <em>Owned Member</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Namespace#getOwnedMembers()
	 * @generated
	 */
	public void testGetOwnedMembersGen() {
		// TODO: implement this union feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testGetOwnedMembers() {
		testGetOwnedMembersGen();
		
		super.testGetOwnedMembers();

		assertTrue(getFixture().getOwnedMembers().containsAll(getFixture().getOwnedEnds()));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Relationship#getRelatedElements() <em>Related Element</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Relationship#getRelatedElements()
	 * @generated
	 */
	public void testGetRelatedElementsGen() {
		// TODO: implement this union feature getter test method
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
	 * Tests the '{@link org.eclipse.uml2.Namespace#getMembers() <em>Member</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Namespace#getMembers()
	 * @generated
	 */
	public void testGetMembersGen() {
		// TODO: implement this union feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}
	public void testGetMembers() {
		testGetMembersGen();
		
		super.testGetMembers();

		assertTrue(getFixture().getMembers().containsAll(getFixture().getMemberEnds()));
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.NamedElementImplTest#setUpNamespace()
	 */
	protected void setUpNamespace() {
		UML2Factory.eINSTANCE.createPackage().getOwnedMembers().add(getFixture());
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.ElementImplTest#setUpOwner()
	 */
	protected void setUpOwner() {
		UML2Factory.eINSTANCE.createTemplateParameter().setOwnedParameteredElement(getFixture());
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

} //AssociationImplTest
