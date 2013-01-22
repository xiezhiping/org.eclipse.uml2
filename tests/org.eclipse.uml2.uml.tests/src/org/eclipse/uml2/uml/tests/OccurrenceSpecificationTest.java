/*
 * Copyright (c) 2005, 2013 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 297216
 *
 */
package org.eclipse.uml2.uml.tests;

import junit.textui.TestRunner;

import org.eclipse.uml2.uml.Lifeline;
import org.eclipse.uml2.uml.OccurrenceSpecification;

import org.eclipse.uml2.uml.UMLFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Occurrence Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.OccurrenceSpecification#getCovered() <em>Get Covered</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.OccurrenceSpecification#setCovered(org.eclipse.uml2.uml.Lifeline) <em>Set Covered</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class OccurrenceSpecificationTest
		extends InteractionFragmentTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OccurrenceSpecificationTest.class);
	}

	/**
	 * Constructs a new Occurrence Specification test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OccurrenceSpecificationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Occurrence Specification test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected OccurrenceSpecification getFixture() {
		return (OccurrenceSpecification) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp()
			throws Exception {
		setFixture(UMLFactory.eINSTANCE.createOccurrenceSpecification());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown()
			throws Exception {
		setFixture(null);
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.OccurrenceSpecification#getCovered() <em>Get Covered</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.OccurrenceSpecification#getCovered()
	 * @generated NOT
	 */
	public void testGetCovered() {
		assertNull(getFixture().getCovered());

		Lifeline covered = UMLFactory.eINSTANCE.createLifeline();
		getFixture().getCovereds().add(0, covered);

		assertEquals(covered, getFixture().getCovered());

		getFixture().getCovereds().add(0,
			covered = UMLFactory.eINSTANCE.createLifeline());

		assertEquals(covered, getFixture().getCovered());

		getFixture().getCovereds().clear();

		assertNull(getFixture().getCovered());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.OccurrenceSpecification#setCovered(org.eclipse.uml2.uml.Lifeline) <em>Set Covered</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.OccurrenceSpecification#setCovered(org.eclipse.uml2.uml.Lifeline)
	 * @generated NOT
	 */
	public void testSetCovered__Lifeline() {
		assertNull(getFixture().getCovered());
		assertEquals(0, getFixture().getCovereds().size());

		Lifeline covered = UMLFactory.eINSTANCE.createLifeline();
		getFixture().setCovered(covered);

		assertEquals(covered, getFixture().getCovered());
		assertEquals(1, getFixture().getCovereds().size());
		assertEquals(covered, getFixture().getCovereds().get(0));

		getFixture()
			.setCovered(covered = UMLFactory.eINSTANCE.createLifeline());

		assertEquals(covered, getFixture().getCovered());
		assertEquals(1, getFixture().getCovereds().size());
		assertEquals(covered, getFixture().getCovereds().get(0));

		getFixture().setCovered(null);

		assertNull(getFixture().getCovered());
		assertEquals(0, getFixture().getCovereds().size());
	}

} //OccurrenceSpecificationTest
