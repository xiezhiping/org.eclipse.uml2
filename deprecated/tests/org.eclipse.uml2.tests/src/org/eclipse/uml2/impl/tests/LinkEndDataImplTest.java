/*
 * Copyright (c) 2003, 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: LinkEndDataImplTest.java,v 1.3 2005/03/15 18:51:30 khussey Exp $
 */
package org.eclipse.uml2.impl.tests;

import junit.textui.TestRunner;

import org.eclipse.uml2.QualifierValue;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.impl.LinkEndDataImpl;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Link End Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.LinkEndDataImpl#getQualifiers() <em>Qualifier</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class LinkEndDataImplTest extends ElementImplTest {

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
		TestRunner.run(LinkEndDataImplTest.class);
	}

	/**
	 * Constructs a new Link End Data test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkEndDataImplTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Link End Data test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private LinkEndDataImpl getFixture() {
		return (LinkEndDataImpl) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture((LinkEndDataImpl) UML2Factory.eINSTANCE.createLinkEndData());
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
	 * Tests the '{@link org.eclipse.uml2.impl.LinkEndDataImpl#getQualifiers() <em>Qualifier</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.LinkEndDataImpl#getQualifiers()
	 * @generated
	 */
	public void testGetQualifiersGen() {
		// TODO: implement this feature getter test method
	}

	public void testGetQualifiers() {
		testGetQualifiersGen();
		
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
