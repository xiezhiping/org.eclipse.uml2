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
 * $Id: DependencyTest.java,v 1.2 2005/05/18 17:04:28 khussey Exp $
 */
package org.eclipse.uml2.tests;

import java.util.Iterator;

import junit.textui.TestRunner;

import org.eclipse.uml2.Dependency;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.uml2.NamedElement;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Dependency</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DependencyTest extends PackageableElementTest {

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
		TestRunner.run(DependencyTest.class);
	}

	/**
	 * Constructs a new Dependency test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DependencyTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Dependency test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Dependency getFixture() {
		return (Dependency)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(UML2Factory.eINSTANCE.createDependency());
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
	 * Tests the '{@link org.eclipse.uml2.Relationship#getRelatedElements() <em>Related Element</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Relationship#getRelatedElements()
	 * @generated
	 */
	public void testGetRelatedElementsGen() {
		// TODO: implement this union feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testGetRelatedElements() {
		testGetRelatedElementsGen();
		
		setUpSources();
		setUpTargets();

		assertTrue(getFixture().getRelatedElements().containsAll(getFixture().getSources()));
		assertTrue(getFixture().getRelatedElements().containsAll(getFixture().getTargets()));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.DirectedRelationship#getSources() <em>Source</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.DirectedRelationship#getSources()
	 * @generated
	 */
	public void testGetSourcesGen() {
		// TODO: implement this union feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testGetSources() {
		testGetSourcesGen();
		
		setUpSources();

		assertTrue(getFixture().getSources().containsAll(getFixture().getClients()));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.DirectedRelationship#getTargets() <em>Target</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.DirectedRelationship#getTargets()
	 * @generated
	 */
	public void testGetTargetsGen() {
		// TODO: implement this union feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}
	public void testGetTargets() {
		testGetTargetsGen();
		
		setUpTargets();

		assertTrue(getFixture().getTargets().containsAll(getFixture().getSuppliers()));
	}

	public void testGetClients() {

		for (Iterator eAllSubClasses = getEAllSubClasses(UML2Package.eINSTANCE.getNamedElement()).iterator(); eAllSubClasses.hasNext();) {
			NamedElement namedElement = (NamedElement) UML2Factory.eINSTANCE.create((EClass) eAllSubClasses.next());

			getFixture().getClients().add(namedElement);

			assertTrue(getFixture().getClients().contains(namedElement));
			assertTrue(namedElement.getClientDependencies().contains(getFixture()));

			getFixture().getClients().remove(namedElement);

			assertFalse(getFixture().getClients().contains(namedElement));
			assertFalse(namedElement.getClientDependencies().contains(getFixture()));
		}
	}

	public void testGetSuppliers() {

		for (Iterator eAllSubClasses = getEAllSubClasses(UML2Package.eINSTANCE.getNamedElement()).iterator(); eAllSubClasses.hasNext();) {
			NamedElement namedElement = (NamedElement) UML2Factory.eINSTANCE.create((EClass) eAllSubClasses.next());

			getFixture().getSuppliers().add(namedElement);

			assertTrue(getFixture().getSuppliers().contains(namedElement));

			getFixture().getSuppliers().remove(namedElement);

			assertFalse(getFixture().getSuppliers().contains(namedElement));
		}
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.NamedElementImplTest#setUpNamespace()
	 */
	protected void setUpNamespace() {
		UML2Factory.eINSTANCE.createPackage().getOwnedMembers().add(getFixture());
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.ElementImplTest#setUpOwner()
	 */
	protected void setUpOwner() {
		UML2Factory.eINSTANCE.createTemplateParameter().setOwnedParameteredElement(getFixture());
	}

	protected void setUpSources() {
		getFixture().getClients().add(UML2Factory.eINSTANCE.createClass());
	}

	protected void setUpTargets() {
		getFixture().getSuppliers().add(UML2Factory.eINSTANCE.createClass());
	}

} //DependencyImplTest
