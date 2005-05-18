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
 * $Id: MultiplicityElementOperationsTest.java,v 1.3 2005/05/18 17:04:28 khussey Exp $
 */
package org.eclipse.uml2.internal.operation.tests;

import java.util.Iterator;

import junit.textui.TestRunner;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.uml2.MultiplicityElement;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.ValueSpecification;
import org.eclipse.uml2.internal.operation.MultiplicityElementOperations;

/**
 * A test case for the '<em><b>Multiplicity Element Operations</b></em>'
 * utility.
 */
public class MultiplicityElementOperationsTest
	extends UML2OperationsTest {

	public static void main(String[] args) {
		TestRunner.run(MultiplicityElementOperationsTest.class);
	}

	/**
	 * Constructs a new Multiplicity Element Operations test case with the
	 * given name.
	 */
	public MultiplicityElementOperationsTest(String name) {
		super(name);
	}

	/**
	 * Returns the element for this Multiplicity Element Operations test case.
	 */
	private MultiplicityElement getElement() {
		return (MultiplicityElement) element;
	}

	/**
	 * Tests the '
	 * {@link org.eclipse.uml2.internal.operation.MultiplicityElementOperations#setLowerBound() <em>Set Lower Bound</em>}'
	 * method.
	 * 
	 * @see org.eclipse.uml2.internal.operation.MultiplicityElementOperations#setLowerBound()
	 */
	public void testSetLowerBound() {

		try {
			MultiplicityElementOperations.setLowerBound(null,
				MultiplicityElement.UNLIMITED_UPPER_BOUND);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		for (Iterator eAllSubClasses = getEAllSubClasses(
			UML2Package.eINSTANCE.getMultiplicityElement()).iterator(); eAllSubClasses
			.hasNext();) {

			setElement((MultiplicityElement) UML2Factory.eINSTANCE
				.create((EClass) eAllSubClasses.next()));

			try {
				MultiplicityElementOperations.setLowerBound(getElement(),
					MultiplicityElement.UNLIMITED_UPPER_BOUND);
				fail();
			} catch (IllegalArgumentException iae) {
				// pass
			}

			try {
				MultiplicityElementOperations.setLowerBound(getElement(), 2);
				fail();
			} catch (IllegalArgumentException iae) {
				// pass
			}

			try {
				MultiplicityElementOperations.setLowerBound(getElement(), 0);
			} catch (IllegalArgumentException iae) {
				fail();
			}

			ValueSpecification lowerValue = getElement().getLowerValue();

			assertNotNull(lowerValue);
			assertEquals(0, lowerValue.integerValue());

			try {
				MultiplicityElementOperations.setLowerBound(getElement(), 1);
			} catch (IllegalArgumentException iae) {
				fail();
			}

			assertSame(lowerValue, getElement().getLowerValue());
			assertEquals(1, lowerValue.integerValue());
		}
	}

	/**
	 * Tests the '
	 * {@link org.eclipse.uml2.internal.operation.MultiplicityElementOperations#setUpperBound() <em>Set Upper Bound</em>}'
	 * method.
	 * 
	 * @see org.eclipse.uml2.internal.operation.MultiplicityElementOperations#setUpperBound()
	 */
	public void testSetUpperBound() {

		try {
			MultiplicityElementOperations.setUpperBound(null, 0);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		for (Iterator eAllSubClasses = getEAllSubClasses(
			UML2Package.eINSTANCE.getMultiplicityElement()).iterator(); eAllSubClasses
			.hasNext();) {

			setElement((MultiplicityElement) UML2Factory.eINSTANCE
				.create((EClass) eAllSubClasses.next()));

			try {
				MultiplicityElementOperations.setUpperBound(getElement(), 0);
				fail();
			} catch (IllegalArgumentException iae) {
				// pass
			}

			try {
				MultiplicityElementOperations.setUpperBound(getElement(),
					MultiplicityElement.UNLIMITED_UPPER_BOUND);
			} catch (IllegalArgumentException iae) {
				fail();
			}

			ValueSpecification upperValue = getElement().getUpperValue();

			assertNotNull(upperValue);
			assertEquals(MultiplicityElement.UNLIMITED_UPPER_BOUND, upperValue
				.unlimitedValue());

			try {
				MultiplicityElementOperations.setUpperBound(getElement(), 1);
			} catch (IllegalArgumentException iae) {
				fail();
			}

			assertSame(upperValue, getElement().getUpperValue());
			assertEquals(1, upperValue.unlimitedValue());
		}
	}

}