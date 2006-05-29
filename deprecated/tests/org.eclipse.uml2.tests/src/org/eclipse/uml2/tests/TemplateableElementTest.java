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
 * $Id: TemplateableElementTest.java,v 1.3 2006/05/29 17:27:34 khussey Exp $
 */
package org.eclipse.uml2.tests;

import org.eclipse.uml2.TemplateableElement;

import org.eclipse.uml2.UML2Factory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Templateable Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.TemplateableElement#parameterableElements() <em>Parameterable Elements</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public abstract class TemplateableElementTest extends ElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Constructs a new Templateable Element test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateableElementTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Templateable Element test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TemplateableElement getFixture() {
		return (TemplateableElement)fixture;
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.TemplateableElement#parameterableElements() <em>Parameterable Elements</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.TemplateableElement#parameterableElements()
	 * @generated
	 */
	public void testParameterableElementsGen() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}


	public void testParameterableElements() {
		testParameterableElementsGen();
		
		assertTrue(getFixture().getOwnedElements().containsAll(getFixture().parameterableElements()));
	}

	public void testGetOwnedElements() {
		super.testGetOwnedElements();

		assertTrue(getFixture().getOwnedElements().containsAll(getFixture().getTemplateBindings()));
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.ElementImplTest#setUpOwnedElements()
	 */
	protected void setUpOwnedElements() {
		super.setUpOwnedElements();

		getFixture().getTemplateBindings().add(UML2Factory.eINSTANCE.createTemplateBinding());
		getFixture().getTemplateBindings().add(UML2Factory.eINSTANCE.createTemplateBinding());
	}

} //TemplateableElementImplTest
