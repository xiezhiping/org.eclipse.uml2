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
 * $Id: PackageImportTest.java,v 1.1 2005/04/04 20:06:07 khussey Exp $
 */
package org.eclipse.uml2.tests;

import java.util.Map;

import java.util.Iterator;

import junit.textui.TestRunner;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.uml2.Namespace;
import org.eclipse.uml2.PackageImport;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Package Import</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.PackageImport#getImportedPackage() <em>Imported Package</em>}</li>
 *   <li>{@link org.eclipse.uml2.PackageImport#getImportingNamespace() <em>Importing Namespace</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.PackageImport#validatePublicOrPrivate(DiagnosticChain, Map) <em>Validate Public Or Private</em>}</li>
 *   <li>{@link org.eclipse.uml2.PackageImport#getTargets() <em>Get Targets</em>}</li>
 *   <li>{@link org.eclipse.uml2.PackageImport#getSources() <em>Get Sources</em>}</li>
 *   <li>{@link org.eclipse.uml2.PackageImport#getOwner() <em>Get Owner</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class PackageImportTest extends DirectedRelationshipTest {

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
		TestRunner.run(PackageImportTest.class);
	}

	/**
	 * Constructs a new Package Import test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageImportTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Package Import test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private PackageImport getFixture() {
		return (PackageImport)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(UML2Factory.eINSTANCE.createPackageImport());
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
	 * Tests the '{@link org.eclipse.uml2.PackageImport#getImportedPackage() <em>Imported Package</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.PackageImport#getImportedPackage()
	 * @generated
	 */
	public void testGetImportedPackageGen() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testGetImportedPackage() {
		testGetImportedPackageGen();
		
		org.eclipse.uml2.Package package_ = UML2Factory.eINSTANCE.createPackage();

		getFixture().setImportedPackage(package_);

		assertSame(package_, getFixture().getImportedPackage());

		getFixture().setImportedPackage(null);

		assertSame(null, getFixture().getImportedPackage());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.PackageImport#setImportedPackage(org.eclipse.uml2.Package) <em>Imported Package</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.PackageImport#setImportedPackage(org.eclipse.uml2.Package)
	 * @generated
	 */
	public void testSetImportedPackageGen() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testSetImportedPackage() {
		testSetImportedPackageGen();
		
		org.eclipse.uml2.Package package_ = UML2Factory.eINSTANCE.createPackage();

		getFixture().setImportedPackage(package_);

		assertSame(package_, getFixture().getImportedPackage());

		getFixture().setImportedPackage(null);

		assertSame(null, getFixture().getImportedPackage());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.PackageImport#getImportingNamespace() <em>Importing Namespace</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.PackageImport#getImportingNamespace()
	 * @generated
	 */
	public void testGetImportingNamespaceGen() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testGetImportingNamespace() {
		testGetImportingNamespaceGen();

		for (Iterator eAllSubClasses = getEAllSubClasses(UML2Package.eINSTANCE.getNamespace()).iterator(); eAllSubClasses.hasNext();) {
			Namespace namespace = (Namespace) UML2Factory.eINSTANCE.create((EClass) eAllSubClasses.next());

			namespace.getPackageImports().add(getFixture());

			assertSame(namespace, getFixture().getImportingNamespace());

			namespace.getPackageImports().remove(getFixture());

			assertSame(null, getFixture().getImportingNamespace());
		}
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.PackageImport#setImportingNamespace(Namespace) <em>Importing Namespace</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.PackageImport#setImportingNamespace(Namespace)
	 * @generated
	 */
	public void testSetImportingNamespaceGen() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testSetImportingNamespace() {
		testSetImportingNamespaceGen();

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
	 * Tests the '{@link org.eclipse.uml2.PackageImport#validatePublicOrPrivate(DiagnosticChain, Map) <em>Validate Public Or Private</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.PackageImport#validatePublicOrPrivate(DiagnosticChain, Map)
	 * @generated
	 */
	public void testValidatePublicOrPrivate__DiagnosticChain_Map() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.PackageImport#getTargets() <em>Get Targets</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.PackageImport#getTargets()
	 * @generated
	 */
	public void testGetTargetsGen() {
		// TODO: implement this getter operation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testGetTargets() {
		testGetTargetsGen();
		
		super.testGetTargets();

		assertTrue(getFixture().getTargets().contains(getFixture().getImportedPackage()));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.PackageImport#getSources() <em>Get Sources</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.PackageImport#getSources()
	 * @generated
	 */
	public void testGetSourcesGen() {
		// TODO: implement this getter operation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testGetSources() {
		testGetSourcesGen();
		
		super.testGetSources();

		assertTrue(getFixture().getSources().contains(getFixture().getImportingNamespace()));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.PackageImport#getOwner() <em>Get Owner</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.PackageImport#getOwner()
	 * @generated
	 */
	public void testGetOwnerGen() {
		// TODO: implement this getter operation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testGetOwner() {
		testGetOwnerGen();
		
		super.testGetOwner();

		assertSame(getFixture().getImportingNamespace(), getFixture().getOwner());
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.ElementImplTest#setUpOwner()
	 */
	protected void setUpOwner() {
		UML2Factory.eINSTANCE.createPackage().getPackageImports().add(getFixture());
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
		getFixture().setImportedPackage(UML2Factory.eINSTANCE.createPackage());
	}

} //PackageImportImplTest
