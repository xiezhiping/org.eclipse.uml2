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
 * $Id: GeneralizationSetImplTest.java,v 1.3 2004/10/01 19:28:30 khussey Exp $
 */
package org.eclipse.uml2.impl.tests;

import junit.textui.TestRunner;

import org.eclipse.uml2.UML2Factory;

import org.eclipse.uml2.impl.GeneralizationSetImpl;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Generalization Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.GeneralizationSetImpl#isCovering() <em>Is Covering</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.GeneralizationSetImpl#isDisjoint() <em>Is Disjoint</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class GeneralizationSetImplTest extends PackageableElementImplTest {

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
		TestRunner.run(GeneralizationSetImplTest.class);
	}

	/**
	 * Constructs a new Generalization Set test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralizationSetImplTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Generalization Set test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private GeneralizationSetImpl getFixture() {
		return (GeneralizationSetImpl) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture((GeneralizationSetImpl) UML2Factory.eINSTANCE.createGeneralizationSet());
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
	 * Tests the '{@link org.eclipse.uml2.impl.GeneralizationSetImpl#isCovering() <em>Is Covering</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.GeneralizationSetImpl#isCovering()
	 * @generated
	 */
	public void testIsCovering() {
		// TODO: implement this feature getter test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.GeneralizationSetImpl#setIsCovering() <em>Is Covering</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.GeneralizationSetImpl#setIsCovering()
	 * @generated
	 */
	public void testSetIsCovering() {
		// TODO: implement this feature setter test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.GeneralizationSetImpl#isDisjoint() <em>Is Disjoint</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.GeneralizationSetImpl#isDisjoint()
	 * @generated
	 */
	public void testIsDisjoint() {
		// TODO: implement this feature getter test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.GeneralizationSetImpl#setIsDisjoint() <em>Is Disjoint</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.GeneralizationSetImpl#setIsDisjoint()
	 * @generated
	 */
	public void testSetIsDisjoint() {
		// TODO: implement this feature setter test method
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.NamedElementImplTest#setUpNamespace()
	 */
	protected void setUpNamespace() {
		UML2Factory.eINSTANCE.createPackage().getOwnedMembers().add(getFixture());
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.ElementImplTest#setUpOwner()
	 */
	protected void setUpOwner() {
		UML2Factory.eINSTANCE.createTemplateParameter().setOwnedParameteredElement(getFixture());
	}

} //GeneralizationSetImplTest
