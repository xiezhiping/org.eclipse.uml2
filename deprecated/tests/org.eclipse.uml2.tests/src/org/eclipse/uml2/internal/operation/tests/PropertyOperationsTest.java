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
 * $Id: PropertyOperationsTest.java,v 1.1 2004/04/29 14:56:55 khussey Exp $
 */
package org.eclipse.uml2.internal.operation.tests;

import java.util.Iterator;

import junit.textui.TestRunner;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.Artifact;
import org.eclipse.uml2.Association;
import org.eclipse.uml2.DataType;
import org.eclipse.uml2.Interface;
import org.eclipse.uml2.Property;
import org.eclipse.uml2.Signal;
import org.eclipse.uml2.StructuredClassifier;
import org.eclipse.uml2.Type;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.ValueSpecification;
import org.eclipse.uml2.internal.operation.PropertyOperations;
import org.eclipse.uml2.util.UML2Switch;

/**
 * A test case for the '<em><b>Property Operations</b></em>' utility.
 */
public class PropertyOperationsTest
	extends UML2OperationsTest {

	public static void main(String[] args) {
		TestRunner.run(PropertyOperationsTest.class);
	}

	/**
	 * Constructs a new Property Operations test case with the given name.
	 */
	public PropertyOperationsTest(String name) {
		super(name);
	}

	/**
	 * Returns the element for this Property Operations test case.
	 */
	private Property getElement() {
		return (Property) element;
	}

	/**
	 * Tests the '
	 * {@link org.eclipse.uml2.internal.operation.PropertyOperations#isNavigable() <em>Is Navigable</em>}'
	 * method.
	 * 
	 * @see org.eclipse.uml2.internal.operation.PropertyOperations#isNavigable()
	 */
	public void testIsNavigable() {

		assertFalse(PropertyOperations.isNavigable(null));

		for (Iterator eAllSubClasses = getEAllSubClasses(
			UML2Package.eINSTANCE.getProperty()).iterator(); eAllSubClasses
			.hasNext();) {

			setElement((Property) UML2Factory.eINSTANCE
				.create((EClass) eAllSubClasses.next()));

			assertFalse(PropertyOperations.isNavigable(getElement()));

			Association association = UML2Factory.eINSTANCE.createAssociation();
			association.getOwnedEnds().add(getElement());

			assertFalse(PropertyOperations.isNavigable(getElement()));

			org.eclipse.uml2.Class class_ = UML2Factory.eINSTANCE.createClass();
			class_.getOwnedAttributes().add(getElement());

			assertTrue(PropertyOperations.isNavigable(getElement()));
		}
	}

	/**
	 * Tests the '
	 * {@link org.eclipse.uml2.internal.operation.PropertyOperations#setNavigable(org.eclipse.uml2.Property, boolean) <em>Set Navigable</em>}'
	 * method.
	 * 
	 * @see org.eclipse.uml2.internal.operation.PropertyOperations#setNavigable(org.eclipse.uml2.Property,
	 *      boolean)
	 */
	public void testSetNavigable() {

		try {
			PropertyOperations.setNavigable(null, false);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		setElement(UML2Factory.eINSTANCE.createProperty());

		try {
			PropertyOperations.setNavigable(getElement(), false);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		Association association = UML2Factory.eINSTANCE.createAssociation();
		association.getOwnedEnds().add(getElement());

		try {
			PropertyOperations.setNavigable(getElement(), false);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		association.createOwnedEnd(UML2Package.eINSTANCE.getProperty());

		try {
			PropertyOperations.setNavigable(getElement(), false);
		} catch (IllegalArgumentException iae) {
			fail();
		}

		try {
			PropertyOperations.setNavigable(getElement(), true);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		for (Iterator eAllSubClasses = getEAllSubClasses(
			UML2Package.eINSTANCE.getType()).iterator(); eAllSubClasses
			.hasNext();) {

			Type type = (Type) UML2Factory.eINSTANCE
				.create((EClass) eAllSubClasses.next());

			((Property) association.getMemberEnds().get(0)).setType(type);
			((Property) association.getMemberEnds().get(1)).setType(type);

			try {
				PropertyOperations.setNavigable(getElement(), false);
			} catch (IllegalArgumentException iae) {
				fail();
			}

			assertSame(association, getElement().getOwningAssociation());
			assertSame(association, getElement().getAssociation());

			if (Boolean.TRUE == new UML2Switch() {

				public Object caseArtifact(Artifact object) {
					return Boolean.TRUE;
				}

				public Object caseDataType(DataType object) {
					return Boolean.TRUE;
				}

				public Object caseInterface(Interface object) {
					return Boolean.TRUE;
				}

				public Object caseSignal(Signal object) {
					return Boolean.TRUE;
				}

				public Object caseStructuredClassifier(
						StructuredClassifier object) {
					return Boolean.TRUE;
				}

				public Object defaultCase(EObject object) {
					return Boolean.FALSE;
				}
			}.doSwitch(type)) {

				try {
					PropertyOperations.setNavigable(getElement(), true);
				} catch (IllegalArgumentException iae) {
					fail();
				}

				assertSame(null, getElement().getOwningAssociation());
				assertSame(association, getElement().getAssociation());
			} else {

				try {
					PropertyOperations.setNavigable(getElement(), true);
					fail();
				} catch (IllegalArgumentException iae) {
					// pass
				}

				assertSame(association, getElement().getOwningAssociation());
				assertSame(association, getElement().getAssociation());
			}

			try {
				PropertyOperations.setNavigable(getElement(), false);
			} catch (IllegalArgumentException iae) {
				fail();
			}

			assertSame(association, getElement().getOwningAssociation());
			assertSame(association, getElement().getAssociation());
		}
	}

	/**
	 * Tests the '
	 * {@link org.eclipse.uml2.internal.operation.PropertyOperations#setBooleanDefault() <em>Set Boolean Default</em>}'
	 * method.
	 * 
	 * @see org.eclipse.uml2.internal.operation.PropertyOperations#setBooleanDefault()
	 */
	public void testSetBooleanDefault() {

		try {
			PropertyOperations.setBooleanDefault(null, false);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		for (Iterator eAllSubClasses = getEAllSubClasses(
			UML2Package.eINSTANCE.getProperty()).iterator(); eAllSubClasses
			.hasNext();) {

			setElement((Property) UML2Factory.eINSTANCE
				.create((EClass) eAllSubClasses.next()));

			try {
				PropertyOperations.setBooleanDefault(getElement(), false);
			} catch (IllegalArgumentException iae) {
				fail();
			}

			ValueSpecification defaultValue = getElement().getDefaultValue();

			assertNotNull(defaultValue);
			assertEquals(Boolean.FALSE.booleanValue(), defaultValue
				.booleanValue());

			try {
				PropertyOperations.setBooleanDefault(getElement(), true);
			} catch (IllegalArgumentException iae) {
				fail();
			}

			assertSame(defaultValue, getElement().getDefaultValue());
			assertEquals(Boolean.TRUE.booleanValue(), defaultValue
				.booleanValue());
		}
	}

	/**
	 * Tests the '
	 * {@link org.eclipse.uml2.internal.operation.PropertyOperations#setIntegerDefault() <em>Set Integer Default</em>}'
	 * method.
	 * 
	 * @see org.eclipse.uml2.internal.operation.PropertyOperations#setIntegerDefault()
	 */
	public void testSetIntegerDefault() {

		try {
			PropertyOperations.setIntegerDefault(null, Integer.MIN_VALUE);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		for (Iterator eAllSubClasses = getEAllSubClasses(
			UML2Package.eINSTANCE.getProperty()).iterator(); eAllSubClasses
			.hasNext();) {

			setElement((Property) UML2Factory.eINSTANCE
				.create((EClass) eAllSubClasses.next()));

			try {
				PropertyOperations.setIntegerDefault(getElement(),
					Integer.MIN_VALUE);
			} catch (IllegalArgumentException iae) {
				fail();
			}

			ValueSpecification defaultValue = getElement().getDefaultValue();

			assertNotNull(defaultValue);
			assertEquals(Integer.MIN_VALUE, defaultValue.integerValue());

			try {
				PropertyOperations.setIntegerDefault(getElement(),
					Integer.MAX_VALUE);
			} catch (IllegalArgumentException iae) {
				fail();
			}

			assertSame(defaultValue, getElement().getDefaultValue());
			assertEquals(Integer.MAX_VALUE, defaultValue.integerValue());
		}
	}

	/**
	 * Tests the '
	 * {@link org.eclipse.uml2.internal.operation.PropertyOperations#setStringDefault() <em>Set String Default</em>}'
	 * method.
	 * 
	 * @see org.eclipse.uml2.internal.operation.PropertyOperations#setStringDefault()
	 */
	public void testSetStringDefault() {

		try {
			PropertyOperations.setStringDefault(null, getName());
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		for (Iterator eAllSubClasses = getEAllSubClasses(
			UML2Package.eINSTANCE.getProperty()).iterator(); eAllSubClasses
			.hasNext();) {
			
			setElement((Property) UML2Factory.eINSTANCE
				.create((EClass) eAllSubClasses.next()));

			try {
				PropertyOperations.setStringDefault(getElement(), getName());
			} catch (IllegalArgumentException iae) {
				fail();
			}

			ValueSpecification defaultValue = getElement().getDefaultValue();

			assertNotNull(defaultValue);
			assertEquals(getName(), defaultValue.stringValue());

			try {
				PropertyOperations.setStringDefault(getElement(), null);
			} catch (IllegalArgumentException iae) {
				fail();
			}

			assertSame(defaultValue, getElement().getDefaultValue());
			assertEquals("", defaultValue.stringValue()); //$NON-NLS-1$

			try {
				PropertyOperations.setStringDefault(getElement(), ""); //$NON-NLS-1$
			} catch (IllegalArgumentException iae) {
				fail();
			}

			assertSame(defaultValue, getElement().getDefaultValue());
			assertEquals("", defaultValue.stringValue()); //$NON-NLS-1$
		}
	}

	/**
	 * Tests the '
	 * {@link org.eclipse.uml2.internal.operation.PropertyOperations#setUnlimitedNaturalDefault() <em>Set Unlimited Natural Default</em>}'
	 * method.
	 * 
	 * @see org.eclipse.uml2.internal.operation.PropertyOperations#setUnlimitedNaturalDefault()
	 */
	public void testSetUnlimitedNaturalDefault() {

		try {
			PropertyOperations.setUnlimitedNaturalDefault(null,
				Integer.MIN_VALUE);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		for (Iterator eAllSubClasses = getEAllSubClasses(
			UML2Package.eINSTANCE.getProperty()).iterator(); eAllSubClasses
			.hasNext();) {

			setElement((Property) UML2Factory.eINSTANCE
				.create((EClass) eAllSubClasses.next()));

			try {
				PropertyOperations.setUnlimitedNaturalDefault(getElement(),
					Integer.MIN_VALUE);
			} catch (IllegalArgumentException iae) {
				fail();
			}

			ValueSpecification defaultValue = getElement().getDefaultValue();

			assertNotNull(defaultValue);
			assertEquals(Integer.MIN_VALUE, defaultValue.unlimitedValue());

			try {
				PropertyOperations.setUnlimitedNaturalDefault(getElement(),
					Integer.MAX_VALUE);
			} catch (IllegalArgumentException iae) {
				fail();
			}

			assertSame(defaultValue, getElement().getDefaultValue());
			assertEquals(Integer.MAX_VALUE, defaultValue.unlimitedValue());
		}
	}

}