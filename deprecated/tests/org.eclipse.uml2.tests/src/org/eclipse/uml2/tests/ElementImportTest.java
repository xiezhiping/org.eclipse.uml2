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
 * $Id: ElementImportTest.java,v 1.4 2006/05/29 17:27:34 khussey Exp $
 */
package org.eclipse.uml2.tests;

import java.util.Iterator;

import junit.textui.TestRunner;

import org.eclipse.uml2.ElementImport;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.uml2.Namespace;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Element Import</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.ElementImport#validateVisibilityPublicOrPrivate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visibility Public Or Private</em>}</li>
 *   <li>{@link org.eclipse.uml2.ElementImport#validateImportedElementIsPublic(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Imported Element Is Public</em>}</li>
 *   <li>{@link org.eclipse.uml2.ElementImport#getName() <em>Get Name</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class ElementImportTest extends DirectedRelationshipTest {

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
		TestRunner.run(ElementImportTest.class);
	}

	/**
	 * Constructs a new Element Import test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementImportTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Element Import test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ElementImport getFixture() {
		return (ElementImport)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(UML2Factory.eINSTANCE.createElementImport());
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

	public void testGetImportingNamespace() {

		for (Iterator eAllSubClasses = getEAllSubClasses(UML2Package.eINSTANCE.getNamespace()).iterator(); eAllSubClasses.hasNext();) {
			Namespace namespace = (Namespace) UML2Factory.eINSTANCE.create((EClass) eAllSubClasses.next());

			namespace.getElementImports().add(getFixture());

			assertSame(namespace, getFixture().getImportingNamespace());

			namespace.getElementImports().remove(getFixture());

			assertSame(null, getFixture().getImportingNamespace());
		}
	}

	public void testSetImportingNamespace() {

		for (Iterator eAllSubClasses = getEAllSubClasses(UML2Package.eINSTANCE.getNamespace()).iterator(); eAllSubClasses.hasNext();) {
			Namespace namespace = (Namespace) UML2Factory.eINSTANCE.create((EClass) eAllSubClasses.next());

			getFixture().setImportingNamespace(namespace);

			assertSame(namespace, getFixture().getImportingNamespace());
			assertTrue(namespace.getElementImports().contains(getFixture()));

			getFixture().setImportingNamespace(null);

			assertSame(null, getFixture().getImportingNamespace());
			assertFalse(namespace.getElementImports().contains(getFixture()));
		}
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.ElementImport#validateVisibilityPublicOrPrivate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visibility Public Or Private</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.ElementImport#validateVisibilityPublicOrPrivate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateVisibilityPublicOrPrivate__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.ElementImport#validateImportedElementIsPublic(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Imported Element Is Public</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.ElementImport#validateImportedElementIsPublic(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateImportedElementIsPublic__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.ElementImport#getName() <em>Get Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.ElementImport#getName()
	 * @generated
	 */
	public void testGetNameGen() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}


	public void testGetName() {
		testGetNameGen();
		
		setUpTargets();

		getFixture().setAlias(null);
		assertEquals(getFixture().getImportedElement().getName(), getFixture().getName());

		getFixture().setAlias(getName());
		assertEquals(getFixture().getAlias(), getFixture().getName());
	}

	public void testGetTargets() {
		super.testGetTargets();

		assertTrue(getFixture().getTargets().contains(getFixture().getImportedElement()));
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
		UML2Factory.eINSTANCE.createPackage().getElementImports().add(getFixture());
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
		getFixture().setImportedElement(UML2Factory.eINSTANCE.createActor());
	}

} //ElementImportImplTest
