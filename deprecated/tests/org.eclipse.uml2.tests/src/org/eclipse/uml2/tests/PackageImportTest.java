/*
 * Copyright (c) 2003, 2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: PackageImportTest.java,v 1.4 2006/05/29 17:27:34 khussey Exp $
 */
package org.eclipse.uml2.tests;

import java.util.Iterator;

import junit.textui.TestRunner;

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
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.PackageImport#validatePublicOrPrivate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Public Or Private</em>}</li>
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
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

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

	public void testGetImportedPackage() {
		org.eclipse.uml2.Package package_ = UML2Factory.eINSTANCE.createPackage();

		getFixture().setImportedPackage(package_);

		assertSame(package_, getFixture().getImportedPackage());

		getFixture().setImportedPackage(null);

		assertSame(null, getFixture().getImportedPackage());
	}

	public void testSetImportedPackage() {
		org.eclipse.uml2.Package package_ = UML2Factory.eINSTANCE.createPackage();

		getFixture().setImportedPackage(package_);

		assertSame(package_, getFixture().getImportedPackage());

		getFixture().setImportedPackage(null);

		assertSame(null, getFixture().getImportedPackage());
	}

	public void testGetImportingNamespace() {

		for (Iterator eAllSubClasses = getEAllSubClasses(UML2Package.eINSTANCE.getNamespace()).iterator(); eAllSubClasses.hasNext();) {
			Namespace namespace = (Namespace) UML2Factory.eINSTANCE.create((EClass) eAllSubClasses.next());

			namespace.getPackageImports().add(getFixture());

			assertSame(namespace, getFixture().getImportingNamespace());

			namespace.getPackageImports().remove(getFixture());

			assertSame(null, getFixture().getImportingNamespace());
		}
	}

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
	 * Tests the '{@link org.eclipse.uml2.PackageImport#validatePublicOrPrivate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Public Or Private</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.PackageImport#validatePublicOrPrivate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidatePublicOrPrivate__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}


	public void testGetTargets() {
		super.testGetTargets();

		assertTrue(getFixture().getTargets().contains(getFixture().getImportedPackage()));
	}

	public void testGetSources() {
		super.testGetSources();

		assertTrue(getFixture().getSources().contains(getFixture().getImportingNamespace()));
	}

	public void testGetOwner() {
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
