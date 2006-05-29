/*
 * Copyright (c) 2003, 2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: DataTypeTest.java,v 1.4 2006/05/29 17:27:34 khussey Exp $
 */
package org.eclipse.uml2.tests;

import junit.textui.TestRunner;

import org.eclipse.uml2.DataType;
import org.eclipse.uml2.UML2Factory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.DataType#inherit(java.util.Set) <em>Inherit</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class DataTypeTest extends ClassifierTest {

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
		TestRunner.run(DataTypeTest.class);
	}

	/**
	 * Constructs a new Data Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTypeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Data Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private DataType getFixture() {
		return (DataType)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(UML2Factory.eINSTANCE.createDataType());
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
	 * Tests the '{@link org.eclipse.uml2.DataType#inherit(java.util.Set) <em>Inherit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.DataType#inherit(java.util.Set)
	 * @generated
	 */
	public void testInherit__Set() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}


	public void testGetOwnedMembers() {
		super.testGetOwnedMembers();

		assertTrue(getFixture().getOwnedMembers().containsAll(getFixture().getOwnedAttributes()));
		assertTrue(getFixture().getOwnedMembers().containsAll(getFixture().getOwnedOperations()));
	}

	public void testGetAttributes() {
		super.testGetAttributes();

		assertTrue(getFixture().getAttributes().containsAll(getFixture().getOwnedAttributes()));
	}

	public void testGetFeatures() {
		super.testGetFeatures();

		assertTrue(getFixture().getFeatures().containsAll(getFixture().getOwnedOperations()));
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.NamespaceImplTest#setUpOwnedMembers()
	 */
	protected void setUpOwnedMembers() {
		super.setUpOwnedMembers();

		getFixture().getOwnedAttributes().add(UML2Factory.eINSTANCE.createProperty());
		getFixture().getOwnedAttributes().add(UML2Factory.eINSTANCE.createProperty());

		getFixture().getOwnedOperations().add(UML2Factory.eINSTANCE.createOperation());
		getFixture().getOwnedOperations().add(UML2Factory.eINSTANCE.createOperation());
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.ClassifierImplTest#setUpAttributes()
	 */
	protected void setUpAttributes() {
		super.setUpAttributes();

		getFixture().getOwnedAttributes().add(UML2Factory.eINSTANCE.createProperty());
		getFixture().getOwnedAttributes().add(UML2Factory.eINSTANCE.createProperty());
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.ClassifierImplTest#setUpFeatures()
	 */
	protected void setUpFeatures() {
		super.setUpFeatures();

		getFixture().getOwnedOperations().add(UML2Factory.eINSTANCE.createOperation());
		getFixture().getOwnedOperations().add(UML2Factory.eINSTANCE.createOperation());
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.NamedElementImplTest#setUpNamespace()
	 */
	protected void setUpNamespace() {
		UML2Factory.eINSTANCE.createPackage().getOwnedMembers().add(getFixture());
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.ElementImplTest#setUpOwner()
	 */
	protected void setUpOwner() {
		UML2Factory.eINSTANCE.createTemplateParameter().setOwnedParameteredElement(getFixture());
	}
	
} //DataTypeImplTest
