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
 * $Id: InformationFlowTest.java,v 1.2 2005/05/18 17:04:28 khussey Exp $
 */
package org.eclipse.uml2.tests;

import junit.textui.TestRunner;

import org.eclipse.uml2.InformationFlow;
import org.eclipse.uml2.UML2Factory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Information Flow</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class InformationFlowTest extends PackageableElementTest {

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
		TestRunner.run(InformationFlowTest.class);
	}

	/**
	 * Constructs a new Information Flow test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InformationFlowTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Information Flow test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private InformationFlow getFixture() {
		return (InformationFlow)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(UML2Factory.eINSTANCE.createInformationFlow());
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
	 * Tests the '{@link org.eclipse.uml2.Relationship#getRelatedElements() <em>Related Element</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Relationship#getRelatedElements()
	 * @generated
	 */
	public void testGetRelatedElements() {
		// TODO: implement this union feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.ElementImplTest#setUpOwner()
	 */
	protected void setUpOwner() {
		UML2Factory.eINSTANCE.createPackage().getOwnedMembers().add(getFixture());
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.NamedElementImplTest#setUpNamespace()
	 */
	protected void setUpNamespace() {
		UML2Factory.eINSTANCE.createPackage().getOwnedMembers().add(getFixture());
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.DirectedRelationshipImplTest#setUpSources()
	 */
	protected void setUpSources() {
		// TODO implement setUpSources
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.DirectedRelationshipImplTest#setUpTargets()
	 */
	protected void setUpTargets() {
		// TODO implement setUpTargets
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.DirectedRelationshipImplTest#testGetSources()
	 */
	public void testGetSources() {
		// TODO implement setUpSources
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.DirectedRelationshipImplTest#testGetTargets()
	 */
	public void testGetTargets() {
		// TODO implement setUpTargets
	}

} //InformationFlowImplTest
