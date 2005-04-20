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
 * $Id: PackageableElementTest.java,v 1.2 2005/04/20 19:00:46 khussey Exp $
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
 *   <li>{@link org.eclipse.uml2.ParameterableElement#getTemplateParameter() <em>Template Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.ParameterableElement#getOwningParameter() <em>Owning Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.PackageableElement#getPackageableElement_visibility() <em>Packageable Element visibility</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.ParameterableElement#getOwner() <em>Get Owner</em>}</li>
 *   <li>{@link org.eclipse.uml2.PackageableElement#getVisibility() <em>Get Visibility</em>}</li>
 *   <li>{@link org.eclipse.uml2.PackageableElement#setVisibility(org.eclipse.uml2.VisibilityKind) <em>Set Visibility</em>}</li>
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
	public static final String copyright = "Copyright (c) 2003, 2005 IBM Corporation and others."; //$NON-NLS-1$

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
	 * Tests the '{@link org.eclipse.uml2.ParameterableElement#getTemplateParameter() <em>Template Parameter</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.ParameterableElement#getTemplateParameter()
	 * @generated
	 */
	public void testGetTemplateParameter() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.ParameterableElement#setTemplateParameter(org.eclipse.uml2.TemplateParameter) <em>Template Parameter</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.ParameterableElement#setTemplateParameter(org.eclipse.uml2.TemplateParameter)
	 * @generated
	 */
	public void testSetTemplateParameter() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.ParameterableElement#getOwningParameter() <em>Owning Parameter</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.ParameterableElement#getOwningParameter()
	 * @generated
	 */
	public void testGetOwningParameter() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.ParameterableElement#setOwningParameter(org.eclipse.uml2.TemplateParameter) <em>Owning Parameter</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.ParameterableElement#setOwningParameter(org.eclipse.uml2.TemplateParameter)
	 * @generated
	 */
	public void testSetOwningParameter() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
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
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.ParameterableElement#getOwner() <em>Get Owner</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.ParameterableElement#getOwner()
	 * @generated
	 */
	public void testGetOwnerGen() {
		// TODO: implement this getter operation test method
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
	 * Tests the '{@link org.eclipse.uml2.PackageableElement#getVisibility() <em>Get Visibility</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.PackageableElement#getVisibility()
	 * @generated
	 */
	public void testGetVisibility() {
		// TODO: implement this getter operation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.PackageableElement#setVisibility(org.eclipse.uml2.VisibilityKind) <em>Set Visibility</em>}' setter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.PackageableElement#setVisibility(org.eclipse.uml2.VisibilityKind)
	 * @generated
	 */
	public void testSetVisibility() {
		// TODO: implement this setter operation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

} //PackageableElementImplTest
