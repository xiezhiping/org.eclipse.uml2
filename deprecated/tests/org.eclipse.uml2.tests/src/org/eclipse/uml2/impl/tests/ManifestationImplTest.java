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
 * $Id: ManifestationImplTest.java,v 1.1 2004/04/29 14:56:47 khussey Exp $
 */
package org.eclipse.uml2.impl.tests;

import java.util.Iterator;

import junit.textui.TestRunner;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.uml2.PackageableElement;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.impl.ManifestationImpl;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Manifestation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.ManifestationImpl#getUtilizedElement() <em>Utilized Element</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.ManifestationImpl#getSuppliers() <em>Get Suppliers</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ManifestationImpl#getTargets() <em>Get Targets</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class ManifestationImplTest extends AbstractionImplTest {

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
		TestRunner.run(ManifestationImplTest.class);
	}

	/**
	 * Constructs a new Manifestation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManifestationImplTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Manifestation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ManifestationImpl getFixture() {
		return (ManifestationImpl) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture((ManifestationImpl) UML2Factory.eINSTANCE.createManifestation());
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
	 * Tests the '{@link org.eclipse.uml2.impl.ManifestationImpl#getUtilizedElement() <em>Utilized Element</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ManifestationImpl#getUtilizedElement()
	 * @generated NOT
	 */
	public void testGetUtilizedElement() {

		for (Iterator eAllSubClasses = getEAllSubClasses(UML2Package.eINSTANCE.getPackageableElement()).iterator(); eAllSubClasses.hasNext();) {
			PackageableElement packageableElement = (PackageableElement) UML2Factory.eINSTANCE.create((EClass) eAllSubClasses.next());

			getFixture().setUtilizedElement(packageableElement);

			assertSame(packageableElement, getFixture().getUtilizedElement());

			getFixture().setUtilizedElement(null);

			assertSame(null, getFixture().getUtilizedElement());
		}
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ManifestationImpl#setUtilizedElement() <em>Utilized Element</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ManifestationImpl#setUtilizedElement()
	 * @generated NOT
	 */
	public void testSetUtilizedElement() {

		for (Iterator eAllSubClasses = getEAllSubClasses(UML2Package.eINSTANCE.getPackageableElement()).iterator(); eAllSubClasses.hasNext();) {
			PackageableElement packageableElement = (PackageableElement) UML2Factory.eINSTANCE.create((EClass) eAllSubClasses.next());

			getFixture().setUtilizedElement(packageableElement);

			assertSame(packageableElement, getFixture().getUtilizedElement());
			assertTrue(getFixture().getSuppliers().contains(packageableElement));

			getFixture().setUtilizedElement(null);

			assertSame(null, getFixture().getUtilizedElement());
			assertTrue(getFixture().getSuppliers().contains(packageableElement));
		}
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ManifestationImpl#getSuppliers() <em>Get Suppliers</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ManifestationImpl#getSuppliers()
	 * @generated NOT
	 */
	public void testGetSuppliers() {
		super.testGetSuppliers();

		for (Iterator eAllSubClasses = getEAllSubClasses(UML2Package.eINSTANCE.getPackageableElement()).iterator(); eAllSubClasses.hasNext();) {
			PackageableElement packageableElement = (PackageableElement) UML2Factory.eINSTANCE.create((EClass) eAllSubClasses.next());

			getFixture().setUtilizedElement(packageableElement);

			getFixture().getSuppliers().remove(packageableElement);

			assertFalse(getFixture().getSuppliers().contains(packageableElement));
			assertSame(null, getFixture().getUtilizedElement());

			getFixture().getSuppliers().add(packageableElement);

			assertTrue(getFixture().getSuppliers().contains(packageableElement));
			assertSame(null, getFixture().getUtilizedElement());
		}
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ManifestationImpl#getTargets() <em>Get Targets</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ManifestationImpl#getTargets()
	 * @generated NOT
	 */
	public void testGetTargets() {
		super.testGetTargets();

		assertTrue(getFixture().getTargets().contains(getFixture().getUtilizedElement()));
	}

	/**
	 * @see org.eclipse.uml2.impl.tests.DependencyImplTest#setUpTargets()
	 */
	protected void setUpTargets() {
		super.setUpTargets();

		getFixture().setUtilizedElement(UML2Factory.eINSTANCE.createClass());
	}

} //ManifestationImplTest
