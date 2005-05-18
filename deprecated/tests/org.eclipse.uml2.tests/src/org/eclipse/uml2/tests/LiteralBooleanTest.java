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
 * $Id: LiteralBooleanTest.java,v 1.2 2005/05/18 17:04:27 khussey Exp $
 */
package org.eclipse.uml2.tests;

import junit.textui.TestRunner;

import org.eclipse.uml2.LiteralBoolean;
import org.eclipse.uml2.UML2Factory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Literal Boolean</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.LiteralBoolean#isComputable() <em>Is Computable</em>}</li>
 *   <li>{@link org.eclipse.uml2.LiteralBoolean#booleanValue() <em>Boolean Value</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class LiteralBooleanTest extends LiteralSpecificationTest {

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
		TestRunner.run(LiteralBooleanTest.class);
	}

	/**
	 * Constructs a new Literal Boolean test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralBooleanTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Literal Boolean test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private LiteralBoolean getFixture() {
		return (LiteralBoolean)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(UML2Factory.eINSTANCE.createLiteralBoolean());
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
	 * Tests the '{@link org.eclipse.uml2.LiteralBoolean#isComputable() <em>Is Computable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.LiteralBoolean#isComputable()
	 * @generated
	 */
	public void testIsComputableGen() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testIsComputable() {
		testIsComputableGen();
		
		assertTrue(getFixture().isComputable());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.LiteralBoolean#booleanValue() <em>Boolean Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.LiteralBoolean#booleanValue()
	 * @generated
	 */
	public void testBooleanValueGen() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}


	public void testBooleanValue() {
		testBooleanValueGen();
		
		getFixture().setValue(false);
		assertFalse(getFixture().booleanValue());

		getFixture().setValue(true);
		assertTrue(getFixture().booleanValue());
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.ValueSpecificationImplTest#testStringValue()
	 */
	public void testStringValue() {
		getFixture().setValue(false);
		assertEquals("false", getFixture().stringValue()); //$NON-NLS-1$

		getFixture().setValue(true);
		assertEquals("true", getFixture().stringValue()); //$NON-NLS-1$
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.NamedElementImplTest#setUpNamespace()
	 */
	protected void setUpNamespace() {
		// TODO implement setUpNamespace
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.ElementImplTest#setUpOwner()
	 */
	protected void setUpOwner() {
		UML2Factory.eINSTANCE.createTemplateParameter().setOwnedParameteredElement(getFixture());
	}

} //LiteralBooleanImplTest
