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
 * $Id: LinkEndDataTest.java,v 1.2 2005/05/18 17:04:27 khussey Exp $
 */
package org.eclipse.uml2.tests;

import junit.textui.TestRunner;

import org.eclipse.uml2.LinkEndData;
import org.eclipse.uml2.QualifierValue;
import org.eclipse.uml2.UML2Factory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Link End Data</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LinkEndDataTest extends ElementTest {

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
		TestRunner.run(LinkEndDataTest.class);
	}

	/**
	 * Constructs a new Link End Data test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkEndDataTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Link End Data test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private LinkEndData getFixture() {
		return (LinkEndData)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(UML2Factory.eINSTANCE.createLinkEndData());
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


	public void testGetQualifiers() {
		QualifierValue qualifierValue = UML2Factory.eINSTANCE.createQualifierValue();

		getFixture().getQualifiers().add(qualifierValue);

		assertTrue(getFixture().getQualifiers().contains(qualifierValue));

		getFixture().getQualifiers().remove(qualifierValue);

		assertFalse(getFixture().getQualifiers().contains(qualifierValue));
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.ElementImplTest#setUpOwner()
	 */
	protected void setUpOwner() {
		UML2Factory.eINSTANCE.createReadLinkAction().getEndData().add(getFixture());
	}

} //LinkEndDataImplTest
