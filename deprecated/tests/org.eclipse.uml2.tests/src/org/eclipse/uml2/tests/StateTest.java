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
 * $Id: StateTest.java,v 1.1 2005/04/04 20:06:07 khussey Exp $
 */
package org.eclipse.uml2.tests;

import java.util.Map;

import junit.textui.TestRunner;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.uml2.RedefinableElement;
import org.eclipse.uml2.State;
import org.eclipse.uml2.UML2Factory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.RedefinableElement#getRedefinitionContexts() <em>Redefinition Context</em>}</li>
 *   <li>{@link org.eclipse.uml2.State#isComposite() <em>Is Composite</em>}</li>
 *   <li>{@link org.eclipse.uml2.State#isOrthogonal() <em>Is Orthogonal</em>}</li>
 *   <li>{@link org.eclipse.uml2.State#isSimple() <em>Is Simple</em>}</li>
 *   <li>{@link org.eclipse.uml2.State#isSubmachineState() <em>Is Submachine State</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.RedefinableElement#validateRedefinitionContextValid(DiagnosticChain, Map) <em>Validate Redefinition Context Valid</em>}</li>
 *   <li>{@link org.eclipse.uml2.RedefinableElement#validateRedefinitionConsistent(DiagnosticChain, Map) <em>Validate Redefinition Consistent</em>}</li>
 *   <li>{@link org.eclipse.uml2.RedefinableElement#isConsistentWith(RedefinableElement) <em>Is Consistent With</em>}</li>
 *   <li>{@link org.eclipse.uml2.RedefinableElement#isRedefinitionContextValid(RedefinableElement) <em>Is Redefinition Context Valid</em>}</li>
 *   <li>{@link org.eclipse.uml2.RedefinableElement#getRedefinedElements() <em>Get Redefined Elements</em>}</li>
 *   <li>{@link org.eclipse.uml2.Vertex#getOwner() <em>Get Owner</em>}</li>
 *   <li>{@link org.eclipse.uml2.State#getRedefinitionContexts() <em>Get Redefinition Contexts</em>}</li>
 *   <li>{@link org.eclipse.uml2.State#getRedefinedElements() <em>Get Redefined Elements</em>}</li>
 *   <li>{@link org.eclipse.uml2.State#getOwnedElements() <em>Get Owned Elements</em>}</li>
 *   <li>{@link org.eclipse.uml2.State#getOwnedMembers() <em>Get Owned Members</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class StateTest extends NamespaceTest {

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
		TestRunner.run(StateTest.class);
	}

	/**
	 * Constructs a new State test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this State test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private State getFixture() {
		return (State)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(UML2Factory.eINSTANCE.createState());
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
	 * Tests the '{@link org.eclipse.uml2.State#isComposite() <em>Is Composite</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.State#isComposite()
	 * @generated
	 */
	public void testIsCompositeGen() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testIsComposite() {
		testIsCompositeGen();
		
		getFixture().getRegions().clear();

		assertFalse(getFixture().isComposite());

		getFixture().getRegions().add(UML2Factory.eINSTANCE.createRegion());

		assertTrue(getFixture().isComposite());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.State#isOrthogonal() <em>Is Orthogonal</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.State#isOrthogonal()
	 * @generated
	 */
	public void testIsOrthogonalGen() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testIsOrthogonal() {
		testIsOrthogonalGen();
		
		getFixture().getRegions().clear();

		assertFalse(getFixture().isOrthogonal());

		getFixture().getRegions().add(UML2Factory.eINSTANCE.createRegion());

		assertFalse(getFixture().isOrthogonal());

		getFixture().getRegions().add(UML2Factory.eINSTANCE.createRegion());

		assertTrue(getFixture().isOrthogonal());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.State#isSimple() <em>Is Simple</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.State#isSimple()
	 * @generated
	 */
	public void testIsSimpleGen() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testIsSimple() {
		testIsSimpleGen();
		
		getFixture().getRegions().clear();

		assertTrue(getFixture().isSimple());

		getFixture().getRegions().add(UML2Factory.eINSTANCE.createRegion());

		assertFalse(getFixture().isSimple());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.State#isSubmachineState() <em>Is Submachine State</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.State#isSubmachineState()
	 * @generated
	 */
	public void testIsSubmachineStateGen() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testIsSubmachineState() {
		testIsSubmachineStateGen();
		
		getFixture().setSubmachine(null);

		assertFalse(getFixture().isSubmachineState());

		getFixture().setSubmachine(UML2Factory.eINSTANCE.createStateMachine());

		assertTrue(getFixture().isSubmachineState());
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
	 * Tests the '{@link org.eclipse.uml2.Vertex#getOwner() <em>Get Owner</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Vertex#getOwner()
	 * @generated
	 */
	public void testGetOwnerGen() {
		// TODO: implement this getter operation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testGetOwner() {
		testGetOwnerGen();
		
		super.testGetOwner();

		assertSame(getFixture().getContainer(), getFixture().getOwner());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.State#getRedefinitionContexts() <em>Get Redefinition Contexts</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.State#getRedefinitionContexts()
	 * @generated
	 */
	public void testGetRedefinitionContextsGen() {
		// TODO: implement this getter operation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testGetRedefinitionContexts() {
		testGetRedefinitionContextsGen();
		
		assertTrue(getFixture().getRedefinitionContexts().isEmpty());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.State#getRedefinedElements() <em>Get Redefined Elements</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.State#getRedefinedElements()
	 * @generated
	 */
	public void testGetRedefinedElementsGen() {
		// TODO: implement this getter operation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testGetRedefinedElements() {
		testGetRedefinedElementsGen();
		
		assertTrue(getFixture().getRedefinedElements().isEmpty());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.State#getOwnedElements() <em>Get Owned Elements</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.State#getOwnedElements()
	 * @generated
	 */
	public void testGetOwnedElementsGen() {
		// TODO: implement this getter operation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testGetOwnedElements() {
		testGetOwnedElementsGen();
		
		super.testGetOwnedElements();

		assertTrue(getFixture().getOwnedElements().containsAll(getFixture().getConnections()));
		assertTrue(getFixture().getOwnedElements().contains(getFixture().getDoActivity()));
		assertTrue(getFixture().getOwnedElements().contains(getFixture().getEntry()));
		assertTrue(getFixture().getOwnedElements().contains(getFixture().getExit()));
		assertTrue(getFixture().getOwnedElements().contains(getFixture().getStateInvariant()));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.State#getOwnedMembers() <em>Get Owned Members</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.State#getOwnedMembers()
	 * @generated
	 */
	public void testGetOwnedMembersGen() {
		// TODO: implement this getter operation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testGetOwnedMembers() {
		testGetOwnedMembersGen();
		
		super.testGetOwnedMembers();
		
		assertTrue(getFixture().getOwnedMembers().containsAll(getFixture().getRegions()));
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.NamedElementImplTest#setUpNamespace()
	 */
	protected void setUpNamespace() {
		UML2Factory.eINSTANCE.createRegion().getSubvertices().add(getFixture());
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.ElementImplTest#setUpOwner()
	 */
	protected void setUpOwner() {
		UML2Factory.eINSTANCE.createRegion().getSubvertices().add(getFixture());
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.ElementImplTest#setUpOwnedElements()
	 */
	protected void setUpOwnedElements() {
		super.setUpOwnedElements();

		getFixture().getConnections().add(UML2Factory.eINSTANCE.createConnectionPointReference());
		getFixture().getConnections().add(UML2Factory.eINSTANCE.createConnectionPointReference());

		getFixture().setDoActivity(UML2Factory.eINSTANCE.createActivity());

		getFixture().setEntry(UML2Factory.eINSTANCE.createActivity());

		getFixture().setExit(UML2Factory.eINSTANCE.createActivity());

		getFixture().setStateInvariant(UML2Factory.eINSTANCE.createConstraint());
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.NamespaceImplTest#setUpOwnedMembers()
	 */
	protected void setUpOwnedMembers() {
		super.setUpOwnedMembers();
		
		getFixture().getRegions().add(UML2Factory.eINSTANCE.createRegion());
		getFixture().getRegions().add(UML2Factory.eINSTANCE.createRegion());
	}
	
} //StateImplTest
