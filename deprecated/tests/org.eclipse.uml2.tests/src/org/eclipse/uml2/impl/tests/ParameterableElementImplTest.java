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
 * $Id: ParameterableElementImplTest.java,v 1.1 2004/04/29 14:56:47 khussey Exp $
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
	 * @generated NOT
	 */
	public void testGetTemplateParameter() {
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
	 * @generated NOT
	 */
	public void testSetTemplateParameter() {
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
	 * @generated NOT
	 */
	public void testGetOwningParameter() {
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
	 * @generated NOT
	 */
	public void testSetOwningParameter() {
		TemplateParameter templateParameter = UML2Factory.eINSTANCE.createTemplateParameter();

		getFixture().setOwningParameter(templateParameter);

		assertSame(templateParameter, getFixture().getOwningParameter());
		assertSame(getFixture(), templateParameter.getOwnedParameteredElement());

		getFixture().setOwningParameter(null);

		assertSame(null, getFixture().getOwningParameter());
		assertSame(null, templateParameter.getOwnedParameteredElement());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ParameterableElementImpl#getOwner() <em>Get Owner</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ParameterableElementImpl#getOwner()
	 * @generated NOT
	 */
	public void testGetOwner() {
		super.testGetOwner();

		if (null != getFixture().getOwningParameter()) {
			assertSame(getFixture().getOwningParameter(), getFixture().getOwner());
		}
	}

} //ParameterableElementImplTest
