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
 * $Id: StateImplTest.java,v 1.1 2004/04/29 14:56:47 khussey Exp $
 */
package org.eclipse.uml2.impl.tests;

import junit.textui.TestRunner;

import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.impl.StateImpl;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.StateImpl#isComposite() <em>Is Composite</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.StateImpl#isOrthogonal() <em>Is Orthogonal</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.StateImpl#isSimple() <em>Is Simple</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.StateImpl#isSubmachineState() <em>Is Submachine State</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.StateImpl#getOwner() <em>Get Owner</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.StateImpl#getRedefinitionContexts() <em>Get Redefinition Contexts</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.StateImpl#getRedefinedElements() <em>Get Redefined Elements</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.StateImpl#getOwnedElements() <em>Get Owned Elements</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class StateImplTest extends RedefinableElementImplTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StateImplTest.class);
	}

	/**
	 * Constructs a new State test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateImplTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this State test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private StateImpl getFixture() {
		return (StateImpl) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture((StateImpl) UML2Factory.eINSTANCE.createState());
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
	 * Tests the '{@link org.eclipse.uml2.impl.StateImpl#isComposite() <em>Is Composite</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.StateImpl#isComposite()
	 * @generated NOT
	 */
	public void testIsComposite() {
		getFixture().getRegions().clear();

		assertFalse(getFixture().isComposite());

		getFixture().getRegions().add(UML2Factory.eINSTANCE.createRegion());

		assertTrue(getFixture().isComposite());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.StateImpl#isOrthogonal() <em>Is Orthogonal</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.StateImpl#isOrthogonal()
	 * @generated NOT
	 */
	public void testIsOrthogonal() {
		getFixture().getRegions().clear();

		assertFalse(getFixture().isOrthogonal());

		getFixture().getRegions().add(UML2Factory.eINSTANCE.createRegion());

		assertFalse(getFixture().isOrthogonal());

		getFixture().getRegions().add(UML2Factory.eINSTANCE.createRegion());

		assertTrue(getFixture().isOrthogonal());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.StateImpl#isSimple() <em>Is Simple</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.StateImpl#isSimple()
	 * @generated NOT
	 */
	public void testIsSimple() {
		getFixture().getRegions().clear();

		assertTrue(getFixture().isSimple());

		getFixture().getRegions().add(UML2Factory.eINSTANCE.createRegion());

		assertFalse(getFixture().isSimple());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.StateImpl#isSubmachineState() <em>Is Submachine State</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.StateImpl#isSubmachineState()
	 * @generated NOT
	 */
	public void testIsSubmachineState() {
		getFixture().setSubmachine(null);

		assertFalse(getFixture().isSubmachineState());

		getFixture().setSubmachine(UML2Factory.eINSTANCE.createStateMachine());

		assertTrue(getFixture().isSubmachineState());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.StateImpl#getOwner() <em>Get Owner</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.StateImpl#getOwner()
	 * @generated NOT
	 */
	public void testGetOwner() {
		super.testGetOwner();

		assertSame(getFixture().getContainer(), getFixture().getOwner());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.StateImpl#getRedefinitionContexts() <em>Get Redefinition Contexts</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.StateImpl#getRedefinitionContexts()
	 * @generated NOT
	 */
	public void testGetRedefinitionContexts() {
		assertTrue(getFixture().getRedefinitionContexts().isEmpty());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.StateImpl#getRedefinedElements() <em>Get Redefined Elements</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.StateImpl#getRedefinedElements()
	 * @generated NOT
	 */
	public void testGetRedefinedElements() {
		assertTrue(getFixture().getRedefinedElements().isEmpty());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.StateImpl#getOwnedElements() <em>Get Owned Elements</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.StateImpl#getOwnedElements()
	 * @generated NOT
	 */
	public void testGetOwnedElements() {
		super.testGetOwnedElements();

		assertTrue(getFixture().getOwnedElements().containsAll(getFixture().getConnections()));
		assertTrue(getFixture().getOwnedElements().contains(getFixture().getDoActivity()));
		assertTrue(getFixture().getOwnedElements().contains(getFixture().getEntry()));
		assertTrue(getFixture().getOwnedElements().contains(getFixture().getExit()));
		assertTrue(getFixture().getOwnedElements().contains(getFixture().getStateInvariant()));
	}

	/**
	 * @see org.eclipse.uml2.impl.tests.NamedElementImplTest#setUpNamespace()
	 */
	protected void setUpNamespace() {
		// TODO implement setUpNamespace
	}

	/**
	 * @see org.eclipse.uml2.impl.tests.ElementImplTest#setUpOwner()
	 */
	protected void setUpOwner() {
		UML2Factory.eINSTANCE.createRegion().getSubvertices().add(getFixture());
	}

	/**
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

} //StateImplTest
