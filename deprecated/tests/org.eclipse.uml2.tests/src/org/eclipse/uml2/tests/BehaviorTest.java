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
 * $Id: BehaviorTest.java,v 1.4 2006/05/29 17:27:34 khussey Exp $
 */
package org.eclipse.uml2.tests;

import org.eclipse.uml2.Behavior;

import org.eclipse.uml2.Parameter;
import org.eclipse.uml2.ParameterDirectionKind;
import org.eclipse.uml2.UML2Factory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Behavior</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.Behavior#getFormalParameters() <em>Formal Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.Behavior#getReturnResults() <em>Return Result</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public abstract class BehaviorTest extends ClassTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Constructs a new Behavior test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Behavior test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Behavior getFixture() {
		return (Behavior)fixture;
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Behavior#getFormalParameters() <em>Formal Parameter</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Behavior#getFormalParameters()
	 * @generated
	 */
	public void testGetFormalParametersGen() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testGetFormalParameters() {
		testGetFormalParametersGen();
		
		Parameter parameter0 = UML2Factory.eINSTANCE.createParameter();
		parameter0.setDirection(ParameterDirectionKind.RETURN_LITERAL);

		getFixture().getParameters().add(parameter0);

		assertEquals(0, getFixture().getFormalParameters().size());
		assertFalse(getFixture().getFormalParameters().contains(parameter0));

		Parameter parameter1 = UML2Factory.eINSTANCE.createParameter();
		parameter1.setDirection(ParameterDirectionKind.OUT_LITERAL);

		getFixture().getParameters().add(parameter1);

		assertEquals(1, getFixture().getFormalParameters().size());
		assertTrue(getFixture().getFormalParameters().contains(parameter1));

		Parameter parameter2 = UML2Factory.eINSTANCE.createParameter();
		parameter2.setDirection(ParameterDirectionKind.INOUT_LITERAL);

		getFixture().getParameters().add(parameter2);

		assertEquals(2, getFixture().getFormalParameters().size());
		assertTrue(getFixture().getFormalParameters().contains(parameter2));

		Parameter parameter3 = UML2Factory.eINSTANCE.createParameter();
		parameter3.setDirection(ParameterDirectionKind.IN_LITERAL);

		getFixture().getParameters().add(parameter3);

		assertEquals(3, getFixture().getFormalParameters().size());
		assertTrue(getFixture().getFormalParameters().contains(parameter3));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Behavior#getReturnResults() <em>Return Result</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Behavior#getReturnResults()
	 * @generated
	 */
	public void testGetReturnResultsGen() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}


	public void testGetReturnResults() {
		testGetReturnResultsGen();
		
		Parameter parameter0 = UML2Factory.eINSTANCE.createParameter();
		parameter0.setDirection(ParameterDirectionKind.RETURN_LITERAL);

		getFixture().getParameters().add(parameter0);

		assertEquals(1, getFixture().getReturnResults().size());
		assertTrue(getFixture().getReturnResults().contains(parameter0));

		Parameter parameter1 = UML2Factory.eINSTANCE.createParameter();
		parameter1.setDirection(ParameterDirectionKind.OUT_LITERAL);

		getFixture().getParameters().add(parameter1);

		assertEquals(1, getFixture().getReturnResults().size());
		assertFalse(getFixture().getReturnResults().contains(parameter1));

		Parameter parameter2 = UML2Factory.eINSTANCE.createParameter();
		parameter2.setDirection(ParameterDirectionKind.INOUT_LITERAL);

		getFixture().getParameters().add(parameter2);

		assertEquals(1, getFixture().getReturnResults().size());
		assertFalse(getFixture().getReturnResults().contains(parameter2));

		Parameter parameter3 = UML2Factory.eINSTANCE.createParameter();
		parameter3.setDirection(ParameterDirectionKind.IN_LITERAL);

		getFixture().getParameters().add(parameter3);

		assertEquals(1, getFixture().getReturnResults().size());
		assertFalse(getFixture().getReturnResults().contains(parameter3));
	}

	public void testGetRedefinedElements() {
		super.testGetRedefinedElements();

		assertTrue(getFixture().getRedefinedElements().containsAll(getFixture().getRedefinedBehaviors()));
	}

	public void testGetOwnedMembers() {
		super.testGetOwnedMembers();

		assertTrue(getFixture().getOwnedMembers().containsAll(getFixture().getParameters()));
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.NamespaceImplTest#setUpOwnedMembers()
	 */
	protected void setUpOwnedMembers() {
		super.setUpOwnedMembers();

		getFixture().getParameters().add(UML2Factory.eINSTANCE.createParameter());
		getFixture().getParameters().add(UML2Factory.eINSTANCE.createParameter());
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.ClassifierImplTest#setUpRedefinedElements()
	 */
	protected void setUpRedefinedElements() {
		super.setUpRedefinedElements();

		getFixture().getRedefinedBehaviors().add(UML2Factory.eINSTANCE.create(getFixture().eClass()));
		getFixture().getRedefinedBehaviors().add(UML2Factory.eINSTANCE.create(getFixture().eClass()));
	}

} //BehaviorImplTest
