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
 * $Id: GeneralizationImplTest.java,v 1.3 2004/10/01 19:28:30 khussey Exp $
 */
package org.eclipse.uml2.impl.tests;

import junit.textui.TestRunner;

import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.impl.GeneralizationImpl;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Generalization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.GeneralizationImpl#isSubstitutable() <em>Is Substitutable</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.GeneralizationImpl#getSources() <em>Get Sources</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.GeneralizationImpl#getOwner() <em>Get Owner</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.GeneralizationImpl#getTargets() <em>Get Targets</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class GeneralizationImplTest extends DirectedRelationshipImplTest {

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
		TestRunner.run(GeneralizationImplTest.class);
	}

	/**
	 * Constructs a new Generalization test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralizationImplTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Generalization test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private GeneralizationImpl getFixture() {
		return (GeneralizationImpl) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture((GeneralizationImpl) UML2Factory.eINSTANCE.createGeneralization());
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
	 * Tests the '{@link org.eclipse.uml2.impl.GeneralizationImpl#isSubstitutable() <em>Is Substitutable</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.GeneralizationImpl#isSubstitutable()
	 * @generated
	 */
	public void testIsSubstitutable() {
		// TODO: implement this feature getter test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.GeneralizationImpl#setIsSubstitutable() <em>Is Substitutable</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.GeneralizationImpl#setIsSubstitutable()
	 * @generated
	 */
	public void testSetIsSubstitutable() {
		// TODO: implement this feature setter test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.GeneralizationImpl#getSources() <em>Get Sources</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.GeneralizationImpl#getSources()
	 * @generated
	 */
	public void testGetSourcesGen() {
		// TODO: implement this getter operation test method
	}

	public void testGetSources() {
		testGetSourcesGen();
		
		super.testGetSources();

		assertTrue(getFixture().getSources().contains(getFixture().getSpecific()));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.GeneralizationImpl#getOwner() <em>Get Owner</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.GeneralizationImpl#getOwner()
	 * @generated
	 */
	public void testGetOwnerGen() {
		// TODO: implement this getter operation test method
	}

	public void testGetOwner() {
		testGetOwnerGen();
		
		super.testGetOwner();

		assertSame(getFixture().getSpecific(), getFixture().getOwner());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.GeneralizationImpl#getTargets() <em>Get Targets</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.GeneralizationImpl#getTargets()
	 * @generated
	 */
	public void testGetTargetsGen() {
		// TODO: implement this getter operation test method
	}

	public void testGetTargets() {
		testGetTargetsGen();
		
		super.testGetTargets();

		assertTrue(getFixture().getTargets().contains(getFixture().getGeneral()));
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.ElementImplTest#setUpOwner()
	 */
	protected void setUpOwner() {
		UML2Factory.eINSTANCE.createInterface().getGeneralizations().add(getFixture());
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
		getFixture().setGeneral(UML2Factory.eINSTANCE.createInterface());
	}

} //GeneralizationImplTest
