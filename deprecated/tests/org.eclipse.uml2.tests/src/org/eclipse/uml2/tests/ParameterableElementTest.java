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
 * $Id: ParameterableElementTest.java,v 1.4 2006/05/29 17:27:34 khussey Exp $
 */
package org.eclipse.uml2.tests;

import org.eclipse.uml2.ParameterableElement;
import org.eclipse.uml2.TemplateParameter;
import org.eclipse.uml2.UML2Factory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Parameterable Element</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public abstract class ParameterableElementTest extends ElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

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


	public void testGetTemplateParameter() {
		TemplateParameter templateParameter = UML2Factory.eINSTANCE.createTemplateParameter();

		templateParameter.setParameteredElement(getFixture());

		assertSame(templateParameter, getFixture().getTemplateParameter());

		templateParameter.setParameteredElement(null);

		assertSame(null, getFixture().getTemplateParameter());
	}

	public void testSetTemplateParameter() {
		TemplateParameter templateParameter = UML2Factory.eINSTANCE.createTemplateParameter();

		getFixture().setTemplateParameter(templateParameter);

		assertSame(templateParameter, getFixture().getTemplateParameter());
		assertSame(getFixture(), templateParameter.getParameteredElement());

		getFixture().setTemplateParameter(null);

		assertSame(null, getFixture().getTemplateParameter());
		assertSame(null, templateParameter.getParameteredElement());
	}

	public void testGetOwningParameter() {
		TemplateParameter templateParameter = UML2Factory.eINSTANCE.createTemplateParameter();

		templateParameter.setOwnedParameteredElement(getFixture());

		assertSame(templateParameter, getFixture().getOwningParameter());

		templateParameter.setOwnedParameteredElement(null);

		assertSame(null, getFixture().getOwningParameter());
	}

	public void testSetOwningParameter() {
		TemplateParameter templateParameter = UML2Factory.eINSTANCE.createTemplateParameter();

		getFixture().setOwningParameter(templateParameter);

		assertSame(templateParameter, getFixture().getOwningParameter());
		assertSame(getFixture(), templateParameter.getOwnedParameteredElement());

		getFixture().setOwningParameter(null);

		assertSame(null, getFixture().getOwningParameter());
		assertSame(null, templateParameter.getOwnedParameteredElement());
	}

	public void testGetOwner() {
		super.testGetOwner();

		if (null != getFixture().getOwningParameter()) {
			assertSame(getFixture().getOwningParameter(), getFixture().getOwner());
		}
	}

} //ParameterableElementImplTest
