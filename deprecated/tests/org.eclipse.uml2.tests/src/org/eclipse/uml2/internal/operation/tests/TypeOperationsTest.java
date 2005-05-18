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
 * $Id: TypeOperationsTest.java,v 1.3 2005/05/18 17:04:28 khussey Exp $
 */
package org.eclipse.uml2.internal.operation.tests;

import java.util.Iterator;

import junit.textui.TestRunner;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.AggregationKind;
import org.eclipse.uml2.Artifact;
import org.eclipse.uml2.Association;
import org.eclipse.uml2.DataType;
import org.eclipse.uml2.Interface;
import org.eclipse.uml2.MultiplicityElement;
import org.eclipse.uml2.Property;
import org.eclipse.uml2.Signal;
import org.eclipse.uml2.StructuredClassifier;
import org.eclipse.uml2.Type;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.internal.operation.TypeOperations;
import org.eclipse.uml2.util.UML2Switch;

/**
 * A test case for the '<em><b>Type Operations</b></em>' utility.
 */
public class TypeOperationsTest
	extends UML2OperationsTest {

	public static void main(String[] args) {
		TestRunner.run(TypeOperationsTest.class);
	}

	/**
	 * Constructs a new Type Operations test case with the given name.
	 */
	public TypeOperationsTest(String name) {
		super(name);
	}

	/**
	 * Returns the element for this Type Operations test case.
	 */
	private Type getElement() {
		return (Type) element;
	}

	/**
	 * Tests the '
	 * {@link org.eclipse.uml2.internal.operation.TypeOperations#createAssocation() <em>Create Association</em>}'
	 * method.
	 * 
	 * @see org.eclipse.uml2.internal.operation.TypeOperations#createAssocation()
	 */
	public void testCreateAssociation() {

		try {
			TypeOperations.createAssociation(null, false, null, null, -1, 0,
				null, false, null, null, 1, 0);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		org.eclipse.uml2.Class class_ = UML2Factory.eINSTANCE.createClass();

		try {
			TypeOperations.createAssociation(class_, false, null, null, -1, 0,
				null, false, null, null, 1, 0);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		org.eclipse.uml2.Package package_ = UML2Factory.eINSTANCE
			.createPackage();
		package_.getOwnedMembers().add(class_);

		try {
			TypeOperations.createAssociation(class_, false, null, null, -1, 0,
				null, false, null, null, 1, 0);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		try {
			TypeOperations.createAssociation(class_, false,
				AggregationKind.NONE_LITERAL, null, -1, 0, null, false, null,
				null, 1, 0);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		try {
			TypeOperations.createAssociation(class_, false,
				AggregationKind.NONE_LITERAL, null, 0, 0, null, false, null,
				null, 1, 0);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		try {
			TypeOperations.createAssociation(class_, false,
				AggregationKind.NONE_LITERAL, null, 0, 1, null, false, null,
				null, 1, 0);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		try {
			TypeOperations.createAssociation(class_, false,
				AggregationKind.NONE_LITERAL, null, 0, 1, UML2Factory.eINSTANCE
					.createClass(), false, null, null, 1, 0);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		try {
			TypeOperations.createAssociation(class_, false,
				AggregationKind.NONE_LITERAL, null, 0, 1, UML2Factory.eINSTANCE
					.createClass(), false, AggregationKind.NONE_LITERAL, null,
				1, 0);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		try {
			TypeOperations.createAssociation(class_, false,
				AggregationKind.NONE_LITERAL, null, 0, 1, UML2Factory.eINSTANCE
					.createClass(), false, AggregationKind.NONE_LITERAL, null,
				1, 1);
		} catch (IllegalArgumentException iae) {
			fail();
		}

		for (Iterator eAllSubClasses = getEAllSubClasses(
			UML2Package.eINSTANCE.getType()).iterator(); eAllSubClasses
			.hasNext();) {

			EClass eClass = (EClass) eAllSubClasses.next();

			setElement((Type) UML2Factory.eINSTANCE.create(eClass));
			package_.getOwnedMembers().add(getElement());

			Type otherType = (Type) UML2Factory.eINSTANCE.create(eClass);

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
			}.doSwitch(getElement())) {
				Association association = TypeOperations.createAssociation(
					getElement(), true, AggregationKind.COMPOSITE_LITERAL,
					getName(), 0, MultiplicityElement.UNLIMITED_UPPER_BOUND,
					otherType, true, AggregationKind.NONE_LITERAL, getName(),
					0, 1);

				assertNotNull(association);

				assertEquals(0, association.getOwnedEnds().size());
				assertEquals(2, association.getMemberEnds().size());

				for (Iterator memberEnds = association.getMemberEnds()
					.iterator(); memberEnds.hasNext();) {

					Property memberEnd = (Property) memberEnds.next();

					assertEquals(getName(), memberEnd.getName());

					if (getElement() == memberEnd.getType()) {
						assertSame(otherType, memberEnd.eContainer());
						assertSame(AggregationKind.NONE_LITERAL, memberEnd
							.getAggregation());
						assertEquals(0, memberEnd.getLower());
						assertEquals(1, memberEnd.getUpper());
					} else if (otherType == memberEnd.getType()) {
						assertSame(getElement(), memberEnd.eContainer());
						assertSame(AggregationKind.COMPOSITE_LITERAL, memberEnd
							.getAggregation());
						assertEquals(0, memberEnd.getLower());
						assertEquals(MultiplicityElement.UNLIMITED_UPPER_BOUND,
							memberEnd.getUpper());
					} else {
						fail();
					}
				}

			} else {

				try {
					TypeOperations
						.createAssociation(getElement(), true,
							AggregationKind.SHARED_LITERAL, getName(), 0, 1,
							otherType, true, AggregationKind.NONE_LITERAL,
							getName(), 1,
							MultiplicityElement.UNLIMITED_UPPER_BOUND);
					fail();
				} catch (IllegalArgumentException iae) {
					// pass
				}

				try {
					TypeOperations
						.createAssociation(getElement(), false,
							AggregationKind.SHARED_LITERAL, getName(), 0, 1,
							otherType, true, AggregationKind.NONE_LITERAL,
							getName(), 1,
							MultiplicityElement.UNLIMITED_UPPER_BOUND);
					fail();
				} catch (IllegalArgumentException iae) {
					// pass
				}

				Association association = TypeOperations.createAssociation(
					getElement(), false, AggregationKind.SHARED_LITERAL,
					getName(), 0, 1, otherType, false,
					AggregationKind.NONE_LITERAL, getName(), 1,
					MultiplicityElement.UNLIMITED_UPPER_BOUND);

				assertNotNull(association);

				assertEquals(2, association.getOwnedEnds().size());
				assertEquals(2, association.getMemberEnds().size());

				for (Iterator memberEnds = association.getMemberEnds()
					.iterator(); memberEnds.hasNext();) {

					Property memberEnd = (Property) memberEnds.next();

					assertSame(association, memberEnd.eContainer());
					assertEquals(getName(), memberEnd.getName());

					if (getElement() == memberEnd.getType()) {
						assertSame(AggregationKind.NONE_LITERAL, memberEnd
							.getAggregation());
						assertEquals(1, memberEnd.getLower());
						assertEquals(MultiplicityElement.UNLIMITED_UPPER_BOUND,
							memberEnd.getUpper());
					} else if (otherType == memberEnd.getType()) {
						assertSame(AggregationKind.SHARED_LITERAL, memberEnd
							.getAggregation());
						assertEquals(0, memberEnd.getLower());
						assertEquals(1, memberEnd.getUpper());
					} else {
						fail();
					}
				}
			}
		}
	}

}