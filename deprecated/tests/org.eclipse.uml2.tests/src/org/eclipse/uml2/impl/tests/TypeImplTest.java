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
 * $Id: TypeImplTest.java,v 1.3 2005/03/15 18:51:30 khussey Exp $
 */
package org.eclipse.uml2.impl.tests;

import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.impl.TypeImpl;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.TypeImpl#getPackage() <em>Package</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.TypeImpl#conformsTo(Type) <em>Conforms To</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.TypeImpl#getNamespace() <em>Get Namespace</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public abstract class TypeImplTest extends PackageableElementImplTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Constructs a new Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeImplTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TypeImpl getFixture() {
		return (TypeImpl) fixture;
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.TypeImpl#getPackage() <em>Package</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.TypeImpl#getPackage()
	 * @generated
	 */
	public void testGetPackageGen() {
		// TODO: implement this feature getter test method
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
	 * Tests the '{@link org.eclipse.uml2.impl.TypeImpl#conformsTo(Type) <em>Conforms To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.TypeImpl#conformsTo(Type)
	 * @generated
	 */
	public void testConformsTo__Type() {
		// TODO: implement this operation test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.TypeImpl#getNamespace() <em>Get Namespace</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.TypeImpl#getNamespace()
	 * @generated
	 */
	public void testGetNamespaceGen() {
		// TODO: implement this getter operation test method
	}

	public void testGetNamespace() {
		testGetNamespaceGen();
		
		super.testGetNamespace();

		if (null != getFixture().getPackage()) {
			assertSame(getFixture().getPackage(), getFixture().getNamespace());
		}
	}

} //TypeImplTest
