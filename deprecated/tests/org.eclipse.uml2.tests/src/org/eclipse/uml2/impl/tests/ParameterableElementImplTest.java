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
 * $Id: ParameterableElementImplTest.java,v 1.3 2005/03/15 18:51:30 khussey Exp $
 */
package org.eclipse.uml2.impl.tests;

import org.eclipse.uml2.TemplateParameter;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.impl.ParameterableElementImpl;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Parameterable Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.ParameterableElementImpl#getTemplateParameter() <em>Template Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ParameterableElementImpl#getOwningParameter() <em>Owning Parameter</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.ParameterableElementImpl#getOwner() <em>Get Owner</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public abstract class ParameterableElementImplTest extends ElementImplTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Constructs a new Parameterable Element test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterableElementImplTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Parameterable Element test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ParameterableElementImpl getFixture() {
		return (ParameterableElementImpl) fixture;
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ParameterableElementImpl#getTemplateParameter() <em>Template Parameter</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ParameterableElementImpl#getTemplateParameter()
	 * @generated
	 */
	public void testGetTemplateParameterGen() {
		// TODO: implement this feature getter test method
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
	 * Tests the '{@link org.eclipse.uml2.impl.ParameterableElementImpl#setTemplateParameter() <em>Template Parameter</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ParameterableElementImpl#setTemplateParameter()
	 * @generated
	 */
	public void testSetTemplateParameterGen() {
		// TODO: implement this feature setter test method
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
	 * Tests the '{@link org.eclipse.uml2.impl.ParameterableElementImpl#getOwningParameter() <em>Owning Parameter</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ParameterableElementImpl#getOwningParameter()
	 * @generated
	 */
	public void testGetOwningParameterGen() {
		// TODO: implement this feature getter test method
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
	 * Tests the '{@link org.eclipse.uml2.impl.ParameterableElementImpl#setOwningParameter() <em>Owning Parameter</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ParameterableElementImpl#setOwningParameter()
	 * @generated
	 */
	public void testSetOwningParameterGen() {
		// TODO: implement this feature setter test method
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
	 * Tests the '{@link org.eclipse.uml2.impl.ParameterableElementImpl#getOwner() <em>Get Owner</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ParameterableElementImpl#getOwner()
	 * @generated
	 */
	public void testGetOwnerGen() {
		// TODO: implement this getter operation test method
	}

	public void testGetOwner() {
		testGetOwnerGen();
		
		super.testGetOwner();

		if (null != getFixture().getOwningParameter()) {
			assertSame(getFixture().getOwningParameter(), getFixture().getOwner());
		}
	}

} //ParameterableElementImplTest
