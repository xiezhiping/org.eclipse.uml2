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
 * $Id: TypeTest.java,v 1.2 2005/04/20 19:00:46 khussey Exp $
 */
package org.eclipse.uml2.tests;

import org.eclipse.uml2.Type;

import org.eclipse.uml2.UML2Factory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.Type#getPackage() <em>Package</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.Type#conformsTo(org.eclipse.uml2.Type) <em>Conforms To</em>}</li>
 *   <li>{@link org.eclipse.uml2.Type#getNamespace() <em>Get Namespace</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public abstract class TypeTest extends PackageableElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2003, 2005 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Constructs a new Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Type getFixture() {
		return (Type)fixture;
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Type#getPackage() <em>Package</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Type#getPackage()
	 * @generated
	 */
	public void testGetPackageGen() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testGetPackage() {
		testGetPackageGen();
		
		org.eclipse.uml2.Package package_ = UML2Factory.eINSTANCE.createPackage();

		package_.getOwnedMembers().add(getFixture());
		assertSame(package_, getFixture().getPackage());

		package_.getOwnedMembers().remove(getFixture());
		assertNull(getFixture().getPackage());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Type#conformsTo(org.eclipse.uml2.Type) <em>Conforms To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Type#conformsTo(org.eclipse.uml2.Type)
	 * @generated
	 */
	public void testConformsTo__Type() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Type#getNamespace() <em>Get Namespace</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Type#getNamespace()
	 * @generated
	 */
	public void testGetNamespaceGen() {
		// TODO: implement this getter operation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testGetNamespace() {
		testGetNamespaceGen();
		
		super.testGetNamespace();

		if (null != getFixture().getPackage()) {
			assertSame(getFixture().getPackage(), getFixture().getNamespace());
		}
	}

} //TypeImplTest
