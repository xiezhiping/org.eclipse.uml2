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
 * $Id: InteractionTest.java,v 1.2 2005/05/18 17:04:27 khussey Exp $
 */
package org.eclipse.uml2.tests;

import java.util.Iterator;

import junit.textui.TestRunner;

import org.eclipse.uml2.Interaction;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Interaction</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class InteractionTest extends BehaviorTest {

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
		TestRunner.run(InteractionTest.class);
	}

	/**
	 * Constructs a new Interaction test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Interaction test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Interaction getFixture() {
		return (Interaction)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(UML2Factory.eINSTANCE.createInteraction());
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
	 * Tests the '{@link org.eclipse.uml2.Element#getOwnedElements() <em>Owned Element</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Element#getOwnedElements()
	 * @generated
	 */
	public void testGetOwnedElementsGen() {
		// TODO: implement this union feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testGetOwnedElements() {
		testGetOwnedElementsGen();
		
		super.testGetOwnedElements();

		assertTrue(getFixture().getOwnedElements().containsAll(getFixture().getGeneralOrderings()));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.NamedElement#getNamespace() <em>Namespace</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.NamedElement#getNamespace()
	 * @generated
	 */
	public void testGetNamespaceGen() {
		// TODO: implement this union feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testGetNamespace() {
		testGetNamespaceGen();
		
		setUpNamespace();

		if (null != getFixture().getEnclosingOperand()) {
			assertSame(getFixture().getEnclosingOperand(), getFixture().getNamespace());
		}
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

		assertTrue(getFixture().getOwnedMembers().containsAll(getFixture().getFormalGates()));
		assertTrue(getFixture().getOwnedMembers().containsAll(getFixture().getLifelines()));
		assertTrue(getFixture().getOwnedMembers().containsAll(getFixture().getMessages()));
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.ElementImplTest#setUpOwnedElements()
	 */
	protected void setUpOwnedElements() {
		super.setUpOwnedElements();

		getFixture().getGeneralOrderings().add(UML2Factory.eINSTANCE.createGeneralOrdering());
		getFixture().getGeneralOrderings().add(UML2Factory.eINSTANCE.createGeneralOrdering());
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.NamespaceImplTest#setUpOwnedMembers()
	 */
	protected void setUpOwnedMembers() {
		super.setUpOwnedMembers();

		getFixture().getFormalGates().add(UML2Factory.eINSTANCE.createGate());
		getFixture().getFormalGates().add(UML2Factory.eINSTANCE.createGate());

		getFixture().getLifelines().add(UML2Factory.eINSTANCE.createLifeline());
		getFixture().getLifelines().add(UML2Factory.eINSTANCE.createLifeline());

		getFixture().getMessages().add(UML2Factory.eINSTANCE.createMessage());
		getFixture().getMessages().add(UML2Factory.eINSTANCE.createMessage());
	}

	public void testGetFragments() {

		for (Iterator interactionFragmentSubClasses = getEAllSubClasses(UML2Package.eINSTANCE.getInteractionFragment()).iterator();
			interactionFragmentSubClasses.hasNext();
			) {

			EClass interactionFragmentSubClass = (EClass) interactionFragmentSubClasses.next();

			for (int i = 0; i < 5; i++) {
				assertTrue(getFixture().getFragments().contains(getFixture().createFragment(interactionFragmentSubClass)));
			}
		}
	}

} //InteractionImplTest
