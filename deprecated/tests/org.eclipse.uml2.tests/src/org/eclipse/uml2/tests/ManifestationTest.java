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
 * $Id: ManifestationTest.java,v 1.1 2005/04/04 20:06:07 khussey Exp $
 */
package org.eclipse.uml2.tests;

import java.util.Iterator;

import junit.textui.TestRunner;

import org.eclipse.uml2.Manifestation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.uml2.PackageableElement;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Manifestation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.Manifestation#getUtilizedElement() <em>Utilized Element</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.Manifestation#getSuppliers() <em>Get Suppliers</em>}</li>
 *   <li>{@link org.eclipse.uml2.Manifestation#getTargets() <em>Get Targets</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class ManifestationTest extends AbstractionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2003, 2005 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ManifestationTest.class);
	}

	/**
	 * Constructs a new Manifestation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManifestationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Manifestation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Manifestation getFixture() {
		return (Manifestation)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(UML2Factory.eINSTANCE.createManifestation());
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
	 * Tests the '{@link org.eclipse.uml2.Manifestation#getUtilizedElement() <em>Utilized Element</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Manifestation#getUtilizedElement()
	 * @generated
	 */
	public void testGetUtilizedElementGen() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testGetUtilizedElement() {
		testGetUtilizedElementGen();

		for (Iterator eAllSubClasses = getEAllSubClasses(UML2Package.eINSTANCE.getPackageableElement()).iterator(); eAllSubClasses.hasNext();) {
			PackageableElement packageableElement = (PackageableElement) UML2Factory.eINSTANCE.create((EClass) eAllSubClasses.next());

			getFixture().setUtilizedElement(packageableElement);

			assertSame(packageableElement, getFixture().getUtilizedElement());

			getFixture().setUtilizedElement(null);

			assertSame(null, getFixture().getUtilizedElement());
		}
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Manifestation#setUtilizedElement(PackageableElement) <em>Utilized Element</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Manifestation#setUtilizedElement(PackageableElement)
	 * @generated
	 */
	public void testSetUtilizedElementGen() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testSetUtilizedElement() {
		testSetUtilizedElementGen();

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
	 * Tests the '{@link org.eclipse.uml2.Manifestation#getSuppliers() <em>Get Suppliers</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Manifestation#getSuppliers()
	 * @generated
	 */
	public void testGetSuppliersGen() {
		// TODO: implement this getter operation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testGetSuppliers() {
		testGetSuppliersGen();
		
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
	 * Tests the '{@link org.eclipse.uml2.Manifestation#getTargets() <em>Get Targets</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Manifestation#getTargets()
	 * @generated
	 */
	public void testGetTargetsGen() {
		// TODO: implement this getter operation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testGetTargets() {
		testGetTargetsGen();
		
		super.testGetTargets();

		assertTrue(getFixture().getTargets().contains(getFixture().getUtilizedElement()));
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.DependencyImplTest#setUpTargets()
	 */
	protected void setUpTargets() {
		super.setUpTargets();

		getFixture().setUtilizedElement(UML2Factory.eINSTANCE.createClass());
	}

} //ManifestationImplTest
