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
 * $Id: PackageImportImplTest.java,v 1.2 2004/05/11 15:20:49 khussey Exp $
 */
package org.eclipse.uml2.impl.tests;

import java.util.Iterator;

import junit.textui.TestRunner;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.uml2.Namespace;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.impl.PackageImportImpl;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Package Import</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.PackageImportImpl#getImportedPackage() <em>Imported Package</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.PackageImportImpl#getImportingNamespace() <em>Importing Namespace</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.PackageImportImpl#validatePublicOrPrivate(EDiagnosticChain, EMap) <em>Validate Public Or Private</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.PackageImportImpl#getTargets() <em>Get Targets</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.PackageImportImpl#getSources() <em>Get Sources</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.PackageImportImpl#getOwner() <em>Get Owner</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class PackageImportImplTest extends DirectedRelationshipImplTest {

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
		TestRunner.run(PackageImportImplTest.class);
	}

	/**
	 * Constructs a new Package Import test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageImportImplTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Package Import test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private PackageImportImpl getFixture() {
		return (PackageImportImpl) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture((PackageImportImpl) UML2Factory.eINSTANCE.createPackageImport());
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
	 * Tests the '{@link org.eclipse.uml2.impl.PackageImportImpl#getImportedPackage() <em>Imported Package</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.PackageImportImpl#getImportedPackage()
	 * @generated NOT
	 */
	public void testGetImportedPackage() {
		org.eclipse.uml2.Package package_ = UML2Factory.eINSTANCE.createPackage();

		getFixture().setImportedPackage(package_);

		assertSame(package_, getFixture().getImportedPackage());

		getFixture().setImportedPackage(null);

		assertSame(null, getFixture().getImportedPackage());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.PackageImportImpl#setImportedPackage() <em>Imported Package</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.PackageImportImpl#setImportedPackage()
	 * @generated NOT
	 */
	public void testSetImportedPackage() {
		org.eclipse.uml2.Package package_ = UML2Factory.eINSTANCE.createPackage();

		getFixture().setImportedPackage(package_);

		assertSame(package_, getFixture().getImportedPackage());

		getFixture().setImportedPackage(null);

		assertSame(null, getFixture().getImportedPackage());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.PackageImportImpl#getImportingNamespace() <em>Importing Namespace</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.PackageImportImpl#getImportingNamespace()
	 * @generated NOT
	 */
	public void testGetImportingNamespace() {

		for (Iterator eAllSubClasses = getEAllSubClasses(UML2Package.eINSTANCE.getNamespace()).iterator(); eAllSubClasses.hasNext();) {
			Namespace namespace = (Namespace) UML2Factory.eINSTANCE.create((EClass) eAllSubClasses.next());

			namespace.getPackageImports().add(getFixture());

			assertSame(namespace, getFixture().getImportingNamespace());

			namespace.getPackageImports().remove(getFixture());

			assertSame(null, getFixture().getImportingNamespace());
		}
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.PackageImportImpl#setImportingNamespace() <em>Importing Namespace</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.PackageImportImpl#setImportingNamespace()
	 * @generated NOT
	 */
	public void testSetImportingNamespace() {

		for (Iterator eAllSubClasses = getEAllSubClasses(UML2Package.eINSTANCE.getNamespace()).iterator(); eAllSubClasses.hasNext();) {
			Namespace namespace = (Namespace) UML2Factory.eINSTANCE.create((EClass) eAllSubClasses.next());

			getFixture().setImportingNamespace(namespace);

			assertSame(namespace, getFixture().getImportingNamespace());
			assertTrue(namespace.getPackageImports().contains(getFixture()));

			getFixture().setImportingNamespace(null);

			assertSame(null, getFixture().getImportingNamespace());
			assertFalse(namespace.getPackageImports().contains(getFixture()));
		}
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.PackageImportImpl#validatePublicOrPrivate(EDiagnosticChain, EMap) <em>Validate Public Or Private</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.PackageImportImpl#validatePublicOrPrivate(EDiagnosticChain, EMap)
	 * @generated
	 */
	public void testValidatePublicOrPrivate__EDiagnosticChain_EMap() {
		// TODO: implement this operation test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.PackageImportImpl#getTargets() <em>Get Targets</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.PackageImportImpl#getTargets()
	 * @generated NOT
	 */
	public void testGetTargets() {
		super.testGetTargets();

		assertTrue(getFixture().getTargets().contains(getFixture().getImportedPackage()));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.PackageImportImpl#getSources() <em>Get Sources</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.PackageImportImpl#getSources()
	 * @generated NOT
	 */
	public void testGetSources() {
		super.testGetSources();

		assertTrue(getFixture().getSources().contains(getFixture().getImportingNamespace()));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.PackageImportImpl#getOwner() <em>Get Owner</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.PackageImportImpl#getOwner()
	 * @generated NOT
	 */
	public void testGetOwner() {
		super.testGetOwner();

		assertSame(getFixture().getImportingNamespace(), getFixture().getOwner());
	}

	/**
	 * @see org.eclipse.uml2.impl.tests.ElementImplTest#setUpOwner()
	 */
	protected void setUpOwner() {
		UML2Factory.eINSTANCE.createPackage().getPackageImports().add(getFixture());
	}

	/**
	 * @see org.eclipse.uml2.impl.tests.DirectedRelationshipImplTest#setUpSources()
	 */
	protected void setUpSources() {
		setUpOwner();
	}

	/**
	 * @see org.eclipse.uml2.impl.tests.DirectedRelationshipImplTest#setUpTargets()
	 */
	protected void setUpTargets() {
		getFixture().setImportedPackage(UML2Factory.eINSTANCE.createPackage());
	}

} //PackageImportImplTest
