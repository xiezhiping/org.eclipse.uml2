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
 * $Id: TemplateBindingTest.java,v 1.3 2006/05/29 17:27:34 khussey Exp $
 */
package org.eclipse.uml2.tests;

import junit.textui.TestRunner;

import org.eclipse.uml2.TemplateBinding;
import org.eclipse.uml2.UML2Factory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Template Binding</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TemplateBindingTest extends DirectedRelationshipTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TemplateBindingTest.class);
	}

	/**
	 * Constructs a new Template Binding test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateBindingTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Template Binding test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TemplateBinding getFixture() {
		return (TemplateBinding)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(UML2Factory.eINSTANCE.createTemplateBinding());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	protected void tearDown() throws Exception {
		setFixture(null);
	}


	public void testGetOwner() {
		super.testGetOwner();

		assertSame(getFixture().getBoundElement(), getFixture().getOwner());
	}

	public void testGetSources() {
		super.testGetSources();

		assertTrue(getFixture().getSources().contains(getFixture().getBoundElement()));
	}

	public void testGetTargets() {
		super.testGetTargets();

		assertTrue(getFixture().getTargets().contains(getFixture().getSignature()));
	}

	public void testGetOwnedElements() {
		super.testGetOwnedElements();

		assertTrue(getFixture().getOwnedElements().containsAll(getFixture().getParameterSubstitutions()));
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.ElementImplTest#setUpOwner()
	 */
	protected void setUpOwner() {
		UML2Factory.eINSTANCE.createComment().getTemplateBindings().add(getFixture());
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.DirectedRelationshipImplTest#setUpSources()
	 */
	protected void setUpSources() {
		setUpOwner();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.DirectedRelationshipImplTest#setUpTargets()
	 */
	protected void setUpTargets() {
		getFixture().setSignature(UML2Factory.eINSTANCE.createTemplateSignature());
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.ElementImplTest#setUpOwnedElements()
	 */
	protected void setUpOwnedElements() {
		super.setUpOwnedElements();

		getFixture().getParameterSubstitutions().add(UML2Factory.eINSTANCE.createTemplateParameterSubstitution());
		getFixture().getParameterSubstitutions().add(UML2Factory.eINSTANCE.createTemplateParameterSubstitution());
	}

} //TemplateBindingImplTest
