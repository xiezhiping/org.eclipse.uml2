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
 * $Id: TimeConstraintTest.java,v 1.2 2005/04/20 19:00:46 khussey Exp $
 */
package org.eclipse.uml2.tests;

import junit.textui.TestRunner;

import org.eclipse.uml2.TimeConstraint;
import org.eclipse.uml2.UML2Factory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Time Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.TimeConstraint#getSpecification() <em>Get Specification</em>}</li>
 *   <li>{@link org.eclipse.uml2.TimeConstraint#setSpecification(org.eclipse.uml2.ValueSpecification) <em>Set Specification</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class TimeConstraintTest extends IntervalConstraintTest {

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
		TestRunner.run(TimeConstraintTest.class);
	}

	/**
	 * Constructs a new Time Constraint test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeConstraintTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Time Constraint test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TimeConstraint getFixture() {
		return (TimeConstraint)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(UML2Factory.eINSTANCE.createTimeConstraint());
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
	 * Tests the '{@link org.eclipse.uml2.TimeConstraint#getSpecification() <em>Get Specification</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.TimeConstraint#getSpecification()
	 * @generated
	 */
	public void testGetSpecificationGen() {
		// TODO: implement this getter operation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testGetSpecification() {
		testGetSpecificationGen();
		
		assertTrue(true);
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.TimeConstraint#setSpecification(org.eclipse.uml2.ValueSpecification) <em>Set Specification</em>}' setter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.TimeConstraint#setSpecification(org.eclipse.uml2.ValueSpecification)
	 * @generated
	 */
	public void testSetSpecificationGen() {
		// TODO: implement this setter operation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testSetSpecification() {
		testSetSpecificationGen();
		
		try {
			getFixture().setSpecification(UML2Factory.eINSTANCE.createLiteralString());
			fail();
		} catch (Exception e) {
			getFixture().setSpecification(UML2Factory.eINSTANCE.createTimeInterval());
		}
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.ElementImplTest#setUpOwnedElements()
	 */
	protected void setUpOwnedElements() {
		getFixture().getOwnedComments().add(UML2Factory.eINSTANCE.createComment());
		getFixture().getOwnedComments().add(UML2Factory.eINSTANCE.createComment());

		getFixture().getTemplateBindings().add(UML2Factory.eINSTANCE.createTemplateBinding());
		getFixture().getTemplateBindings().add(UML2Factory.eINSTANCE.createTemplateBinding());

		getFixture().setNameExpression(UML2Factory.eINSTANCE.createStringExpression());

		getFixture().setSpecification(UML2Factory.eINSTANCE.createTimeInterval());
	}

} //TimeConstraintImplTest
