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
 * $Id: TemplateBindingImplTest.java,v 1.3 2005/03/15 18:51:29 khussey Exp $
 */
package org.eclipse.uml2.impl.tests;

import junit.textui.TestRunner;

import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.impl.TemplateBindingImpl;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Template Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.TemplateBindingImpl#getOwner() <em>Get Owner</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.TemplateBindingImpl#getSources() <em>Get Sources</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.TemplateBindingImpl#getTargets() <em>Get Targets</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.TemplateBindingImpl#getOwnedElements() <em>Get Owned Elements</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class TemplateBindingImplTest extends DirectedRelationshipImplTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TemplateBindingImplTest.class);
	}

	/**
	 * Constructs a new Template Binding test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateBindingImplTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Template Binding test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TemplateBindingImpl getFixture() {
		return (TemplateBindingImpl) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture((TemplateBindingImpl) UML2Factory.eINSTANCE.createTemplateBinding());
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

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.TemplateBindingImpl#getOwner() <em>Get Owner</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.TemplateBindingImpl#getOwner()
	 * @generated
	 */
	public void testGetOwnerGen() {
		// TODO: implement this getter operation test method
	}

	public void testGetOwner() {
		testGetOwnerGen();
		
		super.testGetOwner();

		assertSame(getFixture().getBoundElement(), getFixture().getOwner());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.TemplateBindingImpl#getSources() <em>Get Sources</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.TemplateBindingImpl#getSources()
	 * @generated
	 */
	public void testGetSourcesGen() {
		// TODO: implement this getter operation test method
	}

	public void testGetSources() {
		testGetSourcesGen();
		
		super.testGetSources();

		assertTrue(getFixture().getSources().contains(getFixture().getBoundElement()));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.TemplateBindingImpl#getTargets() <em>Get Targets</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.TemplateBindingImpl#getTargets()
	 * @generated
	 */
	public void testGetTargetsGen() {
		// TODO: implement this getter operation test method
	}

	public void testGetTargets() {
		testGetTargetsGen();
		
		super.testGetTargets();

		assertTrue(getFixture().getTargets().contains(getFixture().getSignature()));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.TemplateBindingImpl#getOwnedElements() <em>Get Owned Elements</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.TemplateBindingImpl#getOwnedElements()
	 * @generated
	 */
	public void testGetOwnedElementsGen() {
		// TODO: implement this getter operation test method
	}

	public void testGetOwnedElements() {
		testGetOwnedElementsGen();
		
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
