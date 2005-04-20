/*
 * Copyright (c) 2003, 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: ParameterableElementTest.java,v 1.2 2005/04/20 19:00:46 khussey Exp $
 */
package org.eclipse.uml2.tests;

import org.eclipse.uml2.ParameterableElement;
import org.eclipse.uml2.TemplateParameter;
import org.eclipse.uml2.UML2Factory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Parameterable Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.ParameterableElement#getTemplateParameter() <em>Template Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.ParameterableElement#getOwningParameter() <em>Owning Parameter</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.ParameterableElement#getOwner() <em>Get Owner</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public abstract class ParameterableElementTest extends ElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2003, 2005 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Constructs a new Parameterable Element test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterableElementTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Parameterable Element test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ParameterableElement getFixture() {
		return (ParameterableElement)fixture;
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.ParameterableElement#getTemplateParameter() <em>Template Parameter</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.ParameterableElement#getTemplateParameter()
	 * @generated
	 */
	public void testGetTemplateParameterGen() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testGetTemplateParameter() {
		testGetTemplateParameterGen();
		
		TemplateParameter templateParameter = UML2Factory.eINSTANCE.createTemplateParameter();

		templateParameter.setParameteredElement(getFixture());

		assertSame(templateParameter, getFixture().getTemplateParameter());

		templateParameter.setParameteredElement(null);

		assertSame(null, getFixture().getTemplateParameter());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.ParameterableElement#setTemplateParameter(org.eclipse.uml2.TemplateParameter) <em>Template Parameter</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.ParameterableElement#setTemplateParameter(org.eclipse.uml2.TemplateParameter)
	 * @generated
	 */
	public void testSetTemplateParameterGen() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testSetTemplateParameter() {
		testSetTemplateParameterGen();
		
		TemplateParameter templateParameter = UML2Factory.eINSTANCE.createTemplateParameter();

		getFixture().setTemplateParameter(templateParameter);

		assertSame(templateParameter, getFixture().getTemplateParameter());
		assertSame(getFixture(), templateParameter.getParameteredElement());

		getFixture().setTemplateParameter(null);

		assertSame(null, getFixture().getTemplateParameter());
		assertSame(null, templateParameter.getParameteredElement());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.ParameterableElement#getOwningParameter() <em>Owning Parameter</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.ParameterableElement#getOwningParameter()
	 * @generated
	 */
	public void testGetOwningParameterGen() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testGetOwningParameter() {
		testGetOwningParameterGen();
		
		TemplateParameter templateParameter = UML2Factory.eINSTANCE.createTemplateParameter();

		templateParameter.setOwnedParameteredElement(getFixture());

		assertSame(templateParameter, getFixture().getOwningParameter());

		templateParameter.setOwnedParameteredElement(null);

		assertSame(null, getFixture().getOwningParameter());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.ParameterableElement#setOwningParameter(org.eclipse.uml2.TemplateParameter) <em>Owning Parameter</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.ParameterableElement#setOwningParameter(org.eclipse.uml2.TemplateParameter)
	 * @generated
	 */
	public void testSetOwningParameterGen() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testSetOwningParameter() {
		testSetOwningParameterGen();
		
		TemplateParameter templateParameter = UML2Factory.eINSTANCE.createTemplateParameter();

		getFixture().setOwningParameter(templateParameter);

		assertSame(templateParameter, getFixture().getOwningParameter());
		assertSame(getFixture(), templateParameter.getOwnedParameteredElement());

		getFixture().setOwningParameter(null);

		assertSame(null, getFixture().getOwningParameter());
		assertSame(null, templateParameter.getOwnedParameteredElement());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.ParameterableElement#getOwner() <em>Get Owner</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.ParameterableElement#getOwner()
	 * @generated
	 */
	public void testGetOwnerGen() {
		// TODO: implement this getter operation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testGetOwner() {
		testGetOwnerGen();
		
		super.testGetOwner();

		if (null != getFixture().getOwningParameter()) {
			assertSame(getFixture().getOwningParameter(), getFixture().getOwner());
		}
	}

} //ParameterableElementImplTest
