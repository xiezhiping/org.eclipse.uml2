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
 * $Id: LoopNodeImplTest.java,v 1.3 2004/10/01 19:28:30 khussey Exp $
 */
package org.eclipse.uml2.impl.tests;

import junit.textui.TestRunner;

import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.impl.LoopNodeImpl;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Loop Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.LoopNodeImpl#isTestedFirst() <em>Is Tested First</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.LoopNodeImpl#getOutputs() <em>Get Outputs</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.LoopNodeImpl#getOwnedElements() <em>Get Owned Elements</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.LoopNodeImpl#getInputs() <em>Get Inputs</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class LoopNodeImplTest extends StructuredActivityNodeImplTest {

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
		TestRunner.run(LoopNodeImplTest.class);
	}

	/**
	 * Constructs a new Loop Node test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoopNodeImplTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Loop Node test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private LoopNodeImpl getFixture() {
		return (LoopNodeImpl) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture((LoopNodeImpl) UML2Factory.eINSTANCE.createLoopNode());
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
	 * Tests the '{@link org.eclipse.uml2.impl.LoopNodeImpl#isTestedFirst() <em>Is Tested First</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.LoopNodeImpl#isTestedFirst()
	 * @generated
	 */
	public void testIsTestedFirst() {
		// TODO: implement this feature getter test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.LoopNodeImpl#setIsTestedFirst() <em>Is Tested First</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.LoopNodeImpl#setIsTestedFirst()
	 * @generated
	 */
	public void testSetIsTestedFirst() {
		// TODO: implement this feature setter test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.LoopNodeImpl#getOutputs() <em>Get Outputs</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.LoopNodeImpl#getOutputs()
	 * @generated
	 */
	public void testGetOutputsGen() {
		// TODO: implement this getter operation test method
	}

	public void testGetOutputs() {
		testGetOutputsGen();
		
		super.testGetOutputs();

		assertTrue(getFixture().getOutputs().containsAll(getFixture().getResults()));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.LoopNodeImpl#getOwnedElements() <em>Get Owned Elements</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.LoopNodeImpl#getOwnedElements()
	 * @generated
	 */
	public void testGetOwnedElementsGen() {
		// TODO: implement this getter operation test method
	}

	public void testGetOwnedElements() {
		testGetOwnedElementsGen();
		
		super.testGetOwnedElements();

		assertTrue(getFixture().getOwnedElements().containsAll(getFixture().getLoopVariables()));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.LoopNodeImpl#getInputs() <em>Get Inputs</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.LoopNodeImpl#getInputs()
	 * @generated
	 */
	public void testGetInputsGen() {
		// TODO: implement this getter operation test method
	}

	public void testGetInputs() {
		testGetInputsGen();
		
		super.testGetInputs();

		assertTrue(getFixture().getInputs().containsAll(getFixture().getLoopVariableInputs()));
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.ElementImplTest#setUpOwnedElements()
	 */
	protected void setUpOwnedElements() {
		super.setUpOwnedElements();

		getFixture().getLoopVariables().add(UML2Factory.eINSTANCE.createOutputPin());
		getFixture().getLoopVariables().add(UML2Factory.eINSTANCE.createOutputPin());
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.ActionImplTest#setUpInputs()
	 */
	protected void setUpInputs() {
		super.setUpInputs();

		getFixture().getLoopVariableInputs().add(UML2Factory.eINSTANCE.createInputPin());
		getFixture().getLoopVariableInputs().add(UML2Factory.eINSTANCE.createInputPin());
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.ActionImplTest#setUpOutputs()
	 */
	protected void setUpOutputs() {
		super.setUpOutputs();

		getFixture().getResults().add(UML2Factory.eINSTANCE.createOutputPin());
		getFixture().getResults().add(UML2Factory.eINSTANCE.createOutputPin());
	}

} //LoopNodeImplTest
