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
 * $Id: ObjectFlowImplTest.java,v 1.4 2005/03/15 18:51:31 khussey Exp $
 */
package org.eclipse.uml2.impl.tests;

import junit.textui.TestRunner;

import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.impl.ObjectFlowImpl;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Object Flow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.ObjectFlowImpl#isMulticast() <em>Is Multicast</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ObjectFlowImpl#isMultireceive() <em>Is Multireceive</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class ObjectFlowImplTest extends ActivityEdgeImplTest {

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
		TestRunner.run(ObjectFlowImplTest.class);
	}

	/**
	 * Constructs a new Object Flow test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectFlowImplTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Object Flow test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ObjectFlowImpl getFixture() {
		return (ObjectFlowImpl) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture((ObjectFlowImpl) UML2Factory.eINSTANCE.createObjectFlow());
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
	 * Tests the '{@link org.eclipse.uml2.impl.ObjectFlowImpl#isMulticast() <em>Is Multicast</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ObjectFlowImpl#isMulticast()
	 * @generated
	 */
	public void testIsMulticast() {
		// TODO: implement this feature getter test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ObjectFlowImpl#setIsMulticast() <em>Is Multicast</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ObjectFlowImpl#setIsMulticast()
	 * @generated
	 */
	public void testSetIsMulticast() {
		// TODO: implement this feature setter test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ObjectFlowImpl#isMultireceive() <em>Is Multireceive</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ObjectFlowImpl#isMultireceive()
	 * @generated
	 */
	public void testIsMultireceive() {
		// TODO: implement this feature getter test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ObjectFlowImpl#setIsMultireceive() <em>Is Multireceive</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ObjectFlowImpl#setIsMultireceive()
	 * @generated
	 */
	public void testSetIsMultireceive() {
		// TODO: implement this feature setter test method
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.NamedElementImplTest#setUpNamespace()
	 */
	protected void setUpNamespace() {
		UML2Factory.eINSTANCE.createActivity().getEdges().add(getFixture());
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.ElementImplTest#setUpOwner()
	 */
	protected void setUpOwner() {
		UML2Factory.eINSTANCE.createActivity().getEdges().add(getFixture());
	}

} //ObjectFlowImplTest
