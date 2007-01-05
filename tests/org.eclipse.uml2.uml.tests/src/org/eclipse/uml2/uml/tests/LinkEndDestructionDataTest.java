/*
 * Copyright (c) 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: LinkEndDestructionDataTest.java,v 1.2 2007/01/05 21:48:58 khussey Exp $
 */
package org.eclipse.uml2.uml.tests;

import junit.textui.TestRunner;

import org.eclipse.uml2.uml.LinkEndDestructionData;
import org.eclipse.uml2.uml.UMLFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Link End Destruction Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.LinkEndDestructionData#validateDestroyLinkAction(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Destroy Link Action</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.LinkEndDestructionData#validateUnlimitedNaturalAndMultiplicity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unlimited Natural And Multiplicity</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class LinkEndDestructionDataTest
		extends LinkEndDataTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LinkEndDestructionDataTest.class);
	}

	/**
	 * Constructs a new Link End Destruction Data test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkEndDestructionDataTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Link End Destruction Data test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private LinkEndDestructionData getFixture() {
		return (LinkEndDestructionData) fixture;
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
		setFixture(UMLFactory.eINSTANCE.createLinkEndDestructionData());
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
	 * Tests the '{@link org.eclipse.uml2.uml.LinkEndDestructionData#validateDestroyLinkAction(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Destroy Link Action</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.LinkEndDestructionData#validateDestroyLinkAction(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateDestroyLinkAction__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.LinkEndDestructionData#validateUnlimitedNaturalAndMultiplicity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unlimited Natural And Multiplicity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.LinkEndDestructionData#validateUnlimitedNaturalAndMultiplicity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateUnlimitedNaturalAndMultiplicity__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

} //LinkEndDestructionDataTest
