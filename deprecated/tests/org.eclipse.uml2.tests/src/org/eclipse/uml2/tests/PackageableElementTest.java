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
 * $Id: PackageableElementTest.java,v 1.3 2005/05/18 17:04:28 khussey Exp $
 */
package org.eclipse.uml2.tests;

import org.eclipse.uml2.PackageableElement;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Packageable Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.PackageableElement#getPackageableElement_visibility() <em>Packageable Element visibility</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public abstract class PackageableElementTest extends NamedElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Constructs a new Packageable Element test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageableElementTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Packageable Element test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private PackageableElement getFixture() {
		return (PackageableElement)fixture;
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.PackageableElement#getPackageableElement_visibility() <em>Packageable Element visibility</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.PackageableElement#getPackageableElement_visibility()
	 * @generated
	 */
	public void testGetPackageableElement_visibility() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.PackageableElement#setPackageableElement_visibility(org.eclipse.uml2.VisibilityKind) <em>Packageable Element visibility</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.PackageableElement#setPackageableElement_visibility(org.eclipse.uml2.VisibilityKind)
	 * @generated
	 */
	public void testSetPackageableElement_visibility() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}



	/**
	 * Tests the '{@link org.eclipse.uml2.Element#getOwner() <em>Owner</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Element#getOwner()
	 * @generated
	 */
	public void testGetOwnerGen() {
		// TODO: implement this union feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testGetOwner() {
		testGetOwnerGen();
		
		super.testGetOwner();

		if (null != getFixture().getOwningParameter()) {
			assertSame(getFixture().getOwningParameter(), getFixture().getOwner());
		}
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.NamedElement#getVisibility() <em>Visibility</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.NamedElement#getVisibility()
	 * @generated
	 */
	public void testGetVisibility() {
		// TODO: implement this redefined feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.NamedElement#setVisibility(org.eclipse.uml2.VisibilityKind) <em>Visibility</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.NamedElement#setVisibility(org.eclipse.uml2.VisibilityKind)
	 * @generated
	 */
	public void testSetVisibility() {
		// TODO: implement this redefined feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}
} //PackageableElementImplTest
