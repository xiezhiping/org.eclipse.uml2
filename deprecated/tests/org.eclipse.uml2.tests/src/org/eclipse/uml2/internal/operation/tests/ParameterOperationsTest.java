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
 * $Id: ParameterOperationsTest.java,v 1.2 2005/03/15 18:51:33 khussey Exp $
 */
package org.eclipse.uml2.internal.operation.tests;

import junit.textui.TestRunner;

import org.eclipse.uml2.Parameter;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.ValueSpecification;
import org.eclipse.uml2.internal.operation.ParameterOperations;

/**
 * A test case for the '<em><b>Parameter Operations</b></em>' utility.
 */
public class ParameterOperationsTest
	extends UML2OperationsTest {

	public static void main(String[] args) {
		TestRunner.run(ParameterOperationsTest.class);
	}

	/**
	 * Constructs a new Parameter Operations test case with the given name.
	 */
	public ParameterOperationsTest(String name) {
		super(name);
	}

	/**
	 * Returns the element for this Parameter Operations test case.
	 */
	private Parameter getElement() {
		return (Parameter) element;
	}

	/**
	 * Tests the '
	 * {@link org.eclipse.uml2.internal.operation.ParameterOperations#setBooleanDefault() <em>Set Boolean Default</em>}'
	 * method.
	 * 
	 * @see org.eclipse.uml2.internal.operation.ParameterOperations#setBooleanDefault()
	 */
	public void testSetBooleanDefault() {

		try {
			ParameterOperations.setBooleanDefault(null, false);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		setElement(UML2Factory.eINSTANCE.createParameter());

		try {
			ParameterOperations.setBooleanDefault(getElement(), false);
		} catch (IllegalArgumentException iae) {
			fail();
		}

		ValueSpecification defaultValue = getElement().getDefaultValue();

		assertNotNull(defaultValue);
		assertEquals(Boolean.FALSE.booleanValue(), defaultValue.booleanValue());

		try {
			ParameterOperations.setBooleanDefault(getElement(), true);
		} catch (IllegalArgumentException iae) {
			fail();
		}

		assertSame(defaultValue, getElement().getDefaultValue());
		assertEquals(Boolean.TRUE.booleanValue(), defaultValue.booleanValue());
	}

	/**
	 * Tests the '
	 * {@link org.eclipse.uml2.internal.operation.ParameterOperations#setIntegerDefault() <em>Set Integer Default</em>}'
	 * method.
	 * 
	 * @see org.eclipse.uml2.internal.operation.ParameterOperations#setIntegerDefault()
	 */
	public void testSetIntegerDefault() {

		try {
			ParameterOperations.setIntegerDefault(null, Integer.MIN_VALUE);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		setElement(UML2Factory.eINSTANCE.createParameter());

		try {
			ParameterOperations.setIntegerDefault(getElement(),
				Integer.MIN_VALUE);
		} catch (IllegalArgumentException iae) {
			fail();
		}

		ValueSpecification defaultValue = getElement().getDefaultValue();

		assertNotNull(defaultValue);
		assertEquals(Integer.MIN_VALUE, defaultValue.integerValue());

		try {
			ParameterOperations.setIntegerDefault(getElement(),
				Integer.MAX_VALUE);
		} catch (IllegalArgumentException iae) {
			fail();
		}

		assertSame(defaultValue, getElement().getDefaultValue());
		assertEquals(Integer.MAX_VALUE, defaultValue.integerValue());
	}

	/**
	 * Tests the '
	 * {@link org.eclipse.uml2.internal.operation.ParameterOperations#setStringDefault() <em>Set String Default</em>}'
	 * method.
	 * 
	 * @see org.eclipse.uml2.internal.operation.ParameterOperations#setStringDefault()
	 */
	public void testSetStringDefault() {

		try {
			ParameterOperations.setStringDefault(null, getName());
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		setElement(UML2Factory.eINSTANCE.createParameter());

		try {
			ParameterOperations.setStringDefault(getElement(), getName());
		} catch (IllegalArgumentException iae) {
			fail();
		}

		ValueSpecification defaultValue = getElement().getDefaultValue();

		assertNotNull(defaultValue);
		assertEquals(getName(), defaultValue.stringValue());

		try {
			ParameterOperations.setStringDefault(getElement(), null);
		} catch (IllegalArgumentException iae) {
			fail();
		}

		assertSame(defaultValue, getElement().getDefaultValue());
		assertEquals("", defaultValue.stringValue()); //$NON-NLS-1$

		try {
			ParameterOperations.setStringDefault(getElement(), ""); //$NON-NLS-1$
		} catch (IllegalArgumentException iae) {
			fail();
		}

		assertSame(defaultValue, getElement().getDefaultValue());
		assertEquals("", defaultValue.stringValue()); //$NON-NLS-1$
	}

	/**
	 * Tests the '
	 * {@link org.eclipse.uml2.internal.operation.ParameterOperations#setUnlimitedNaturalDefault() <em>Set Unlimited Natural Default</em>}'
	 * method.
	 * 
	 * @see org.eclipse.uml2.internal.operation.ParameterOperations#setUnlimitedNaturalDefault()
	 */
	public void testSetUnlimitedNaturalDefault() {

		try {
			ParameterOperations.setUnlimitedNaturalDefault(null,
				Integer.MIN_VALUE);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		setElement(UML2Factory.eINSTANCE.createParameter());

		try {
			ParameterOperations.setUnlimitedNaturalDefault(getElement(),
				Integer.MIN_VALUE);
		} catch (IllegalArgumentException iae) {
			fail();
		}

		ValueSpecification defaultValue = getElement().getDefaultValue();

		assertNotNull(defaultValue);
		assertEquals(Integer.MIN_VALUE, defaultValue.unlimitedValue());

		try {
			ParameterOperations.setUnlimitedNaturalDefault(getElement(),
				Integer.MAX_VALUE);
		} catch (IllegalArgumentException iae) {
			fail();
		}

		assertSame(defaultValue, getElement().getDefaultValue());
		assertEquals(Integer.MAX_VALUE, defaultValue.unlimitedValue());
	}

}