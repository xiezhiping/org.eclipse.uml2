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
 * $Id: InstanceValueImplTest.java,v 1.3 2005/03/15 18:51:29 khussey Exp $
 */
package org.eclipse.uml2.impl.tests;

import junit.textui.TestRunner;

import org.eclipse.uml2.InstanceSpecification;
import org.eclipse.uml2.LiteralString;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.impl.InstanceValueImpl;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Instance Value</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class InstanceValueImplTest extends ValueSpecificationImplTest {

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
		TestRunner.run(InstanceValueImplTest.class);
	}

	/**
	 * Constructs a new Instance Value test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceValueImplTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Instance Value test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private InstanceValueImpl getFixture() {
		return (InstanceValueImpl) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture((InstanceValueImpl) UML2Factory.eINSTANCE.createInstanceValue());
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

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.ValueSpecificationImplTest#testStringValue()
	 */
	public void testStringValue() {
		super.testStringValue();

		InstanceSpecification instance = UML2Factory.eINSTANCE.createInstanceSpecification();
		getFixture().setInstance(instance);

		assertEquals("", getFixture().stringValue()); //$NON-NLS-1$

		LiteralString specification = UML2Factory.eINSTANCE.createLiteralString();
		instance.setSpecification(specification);

		assertEquals("", getFixture().stringValue()); //$NON-NLS-1$

		specification.setValue(getName());

		assertEquals(getName(), getFixture().stringValue());
	}

} //InstanceValueImplTest
