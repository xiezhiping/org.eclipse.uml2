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
 * $Id: DependencyImplTest.java,v 1.1 2004/04/29 14:56:46 khussey Exp $
 */
package org.eclipse.uml2.impl.tests;

import java.util.Iterator;

import junit.textui.TestRunner;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.uml2.NamedElement;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.impl.DependencyImpl;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.DependencyImpl#getRelatedElements() <em>Related Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.DependencyImpl#getSources() <em>Source</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.DependencyImpl#getTargets() <em>Target</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.DependencyImpl#getClients() <em>Client</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.DependencyImpl#getSuppliers() <em>Supplier</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.DependencyImpl#getRelatedElements() <em>Get Related Elements</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class DependencyImplTest extends PackageableElementImplTest {

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
		TestRunner.run(DependencyImplTest.class);
	}

	/**
	 * Constructs a new Dependency test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DependencyImplTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Dependency test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private DependencyImpl getFixture() {
		return (DependencyImpl) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture((DependencyImpl) UML2Factory.eINSTANCE.createDependency());
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
	 * Tests the '{@link org.eclipse.uml2.impl.DependencyImpl#getRelatedElements() <em>Related Element</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.DependencyImpl#getRelatedElements()
	 * @generated NOT
	 */
	public void testGetRelatedElements() {
		setUpSources();
		setUpTargets();

		assertTrue(getFixture().getRelatedElements().containsAll(getFixture().getSources()));
		assertTrue(getFixture().getRelatedElements().containsAll(getFixture().getTargets()));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.DependencyImpl#getSources() <em>Source</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.DependencyImpl#getSources()
	 * @generated NOT
	 */
	public void testGetSources() {
		setUpSources();

		assertTrue(getFixture().getSources().containsAll(getFixture().getClients()));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.DependencyImpl#getTargets() <em>Target</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.DependencyImpl#getTargets()
	 * @generated NOT
	 */
	public void testGetTargets() {
		setUpTargets();

		assertTrue(getFixture().getTargets().containsAll(getFixture().getSuppliers()));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.DependencyImpl#getClients() <em>Client</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.DependencyImpl#getClients()
	 * @generated NOT
	 */
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

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.DependencyImpl#getSuppliers() <em>Supplier</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.DependencyImpl#getSuppliers()
	 * @generated NOT
	 */
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
