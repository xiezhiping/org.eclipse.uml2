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
 * $Id: LinkEndCreationDataImplTest.java,v 1.2 2004/05/20 03:03:32 khussey Exp $
 */
package org.eclipse.uml2.impl.tests;

import junit.textui.TestRunner;

import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.impl.LinkEndCreationDataImpl;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Link End Creation Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.LinkEndCreationDataImpl#getQualifiers() <em>Get Qualifiers</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class LinkEndCreationDataImplTest extends LinkEndDataImplTest {

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
		TestRunner.run(LinkEndCreationDataImplTest.class);
	}

	/**
	 * Constructs a new Link End Creation Data test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkEndCreationDataImplTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Link End Creation Data test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private LinkEndCreationDataImpl getFixture() {
		return (LinkEndCreationDataImpl) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture((LinkEndCreationDataImpl) UML2Factory.eINSTANCE.createLinkEndCreationData());
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
	 * Tests the '{@link org.eclipse.uml2.impl.LinkEndCreationDataImpl#getQualifiers() <em>Get Qualifiers</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.LinkEndCreationDataImpl#getQualifiers()
	 * @generated
	 */
	public void testGetQualifiersGen() {
		// TODO: implement this getter operation test method
	}

	public void testGetQualifiers() {
		testGetQualifiersGen();
		
		super.testGetQualifiers();
	}

} //LinkEndCreationDataImplTest
