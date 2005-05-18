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
 * $Id: InterfaceTest.java,v 1.2 2005/05/18 17:04:28 khussey Exp $
 */
package org.eclipse.uml2.tests;

import junit.textui.TestRunner;

import org.eclipse.uml2.Interface;
import org.eclipse.uml2.UML2Factory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class InterfaceTest extends ClassifierTest {

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
		TestRunner.run(InterfaceTest.class);
	}

	/**
	 * Constructs a new Interface test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Interface test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Interface getFixture() {
		return (Interface)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(UML2Factory.eINSTANCE.createInterface());
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
	 * Tests the '{@link org.eclipse.uml2.Classifier#getAttributes() <em>Attribute</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Classifier#getAttributes()
	 * @generated
	 */
	public void testGetAttributesGen() {
		// TODO: implement this union feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testGetAttributes() {
		testGetAttributesGen();
		
		super.testGetAttributes();

		assertTrue(getFixture().getAttributes().containsAll(getFixture().getOwnedAttributes()));
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

		assertTrue(getFixture().getOwnedMembers().containsAll(getFixture().getNestedClassifiers()));
		assertTrue(getFixture().getOwnedMembers().containsAll(getFixture().getOwnedAttributes()));
		assertTrue(getFixture().getOwnedMembers().containsAll(getFixture().getOwnedOperations()));
		assertTrue(getFixture().getOwnedMembers().containsAll(getFixture().getOwnedReceptions()));
		assertTrue(getFixture().getOwnedMembers().contains(getFixture().getProtocol()));
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

		assertTrue(getFixture().getFeatures().containsAll(getFixture().getOwnedOperations()));
		assertTrue(getFixture().getFeatures().containsAll(getFixture().getOwnedReceptions()));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.RedefinableElement#getRedefinedElements() <em>Redefined Element</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.RedefinableElement#getRedefinedElements()
	 * @generated
	 */
	public void testGetRedefinedElementsGen() {
		// TODO: implement this union feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}
	public void testGetRedefinedElements() {
		testGetRedefinedElementsGen();
		
		super.testGetRedefinedElements();

		assertTrue(getFixture().getRedefinedElements().containsAll(getFixture().getRedefinedInterfaces()));
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
	 * @see org.eclipse.uml2.impl.tests.NamespaceImplTest#setUpOwnedMembers()
	 */
	protected void setUpOwnedMembers() {
		super.setUpOwnedMembers();

		getFixture().getNestedClassifiers().add(UML2Factory.eINSTANCE.createInterface());
		getFixture().getNestedClassifiers().add(UML2Factory.eINSTANCE.createInterface());

		getFixture().getOwnedAttributes().add(UML2Factory.eINSTANCE.createProperty());
		getFixture().getOwnedAttributes().add(UML2Factory.eINSTANCE.createProperty());

		getFixture().getOwnedOperations().add(UML2Factory.eINSTANCE.createOperation());
		getFixture().getOwnedOperations().add(UML2Factory.eINSTANCE.createOperation());

		getFixture().getOwnedReceptions().add(UML2Factory.eINSTANCE.createReception());
		getFixture().getOwnedReceptions().add(UML2Factory.eINSTANCE.createReception());

		getFixture().setProtocol(UML2Factory.eINSTANCE.createProtocolStateMachine());
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.ClassifierImplTest#setUpAttributes()
	 */
	protected void setUpAttributes() {
		super.setUpAttributes();

		getFixture().getOwnedAttributes().add(UML2Factory.eINSTANCE.createProperty());
		getFixture().getOwnedAttributes().add(UML2Factory.eINSTANCE.createProperty());
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.ClassifierImplTest#setUpFeatures()
	 */
	protected void setUpFeatures() {
		super.setUpFeatures();

		getFixture().getOwnedOperations().add(UML2Factory.eINSTANCE.createOperation());
		getFixture().getOwnedOperations().add(UML2Factory.eINSTANCE.createOperation());

		getFixture().getOwnedReceptions().add(UML2Factory.eINSTANCE.createReception());
		getFixture().getOwnedReceptions().add(UML2Factory.eINSTANCE.createReception());

		getFixture().setProtocol(UML2Factory.eINSTANCE.createProtocolStateMachine());
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.ClassifierImplTest#setUpRedefinedElements()
	 */
	protected void setUpRedefinedElements() {
		super.setUpRedefinedElements();

		getFixture().getRedefinedInterfaces().add(UML2Factory.eINSTANCE.createInterface());
		getFixture().getRedefinedInterfaces().add(UML2Factory.eINSTANCE.createInterface());
	}

} //InterfaceImplTest
