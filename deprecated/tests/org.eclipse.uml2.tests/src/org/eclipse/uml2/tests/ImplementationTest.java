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
 * $Id: ImplementationTest.java,v 1.3 2005/05/18 17:04:28 khussey Exp $
 */
package org.eclipse.uml2.tests;

import java.util.Iterator;

import junit.textui.TestRunner;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.uml2.BehavioredClassifier;
import org.eclipse.uml2.Implementation;
import org.eclipse.uml2.Interface;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Implementation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ImplementationTest extends RealizationTest {

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
		TestRunner.run(ImplementationTest.class);
	}

	/**
	 * Constructs a new Implementation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Implementation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Implementation getFixture() {
		return (Implementation)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(UML2Factory.eINSTANCE.createImplementation());
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



	public void testGetContract() {
		Interface interface_ = UML2Factory.eINSTANCE.createInterface();

		getFixture().setContract(interface_);

		assertSame(interface_, getFixture().getContract());

		getFixture().setContract(null);

		assertSame(null, getFixture().getContract());
	}

	public void testSetContract() {
		Interface interface_ = UML2Factory.eINSTANCE.createInterface();

		getFixture().setContract(interface_);

		assertSame(interface_, getFixture().getContract());
		assertTrue(getFixture().getSuppliers().contains(interface_));

		getFixture().setContract(null);

		assertSame(null, getFixture().getContract());
		assertTrue(getFixture().getSuppliers().contains(interface_));
	}

	public void testGetImplementingClassifier() {

		for (Iterator eAllSubClasses = getEAllSubClasses(UML2Package.eINSTANCE.getBehavioredClassifier()).iterator(); eAllSubClasses.hasNext();) {
			BehavioredClassifier behavioredClassifier = (BehavioredClassifier) UML2Factory.eINSTANCE.create((EClass) eAllSubClasses.next());

			getFixture().setImplementingClassifier(behavioredClassifier);

			assertSame(behavioredClassifier, getFixture().getImplementingClassifier());

			getFixture().setImplementingClassifier(null);

			assertSame(null, getFixture().getImplementingClassifier());
		}
	}

	public void testSetImplementingClassifier() {

		for (Iterator eAllSubClasses = getEAllSubClasses(UML2Package.eINSTANCE.getBehavioredClassifier()).iterator(); eAllSubClasses.hasNext();) {
			BehavioredClassifier behavioredClassifier = (BehavioredClassifier) UML2Factory.eINSTANCE.create((EClass) eAllSubClasses.next());

			getFixture().setImplementingClassifier(behavioredClassifier);

			assertSame(behavioredClassifier, getFixture().getImplementingClassifier());
			assertTrue(behavioredClassifier.getImplementations().contains(getFixture()));
			assertTrue(getFixture().getClients().contains(behavioredClassifier));

			getFixture().setImplementingClassifier(null);

			assertSame(null, getFixture().getImplementingClassifier());
			assertFalse(behavioredClassifier.getImplementations().contains(getFixture()));
			assertTrue(getFixture().getClients().contains(behavioredClassifier));
		}
	}

	public void testGetSuppliers() {
		super.testGetSuppliers();

		Interface interface_ = UML2Factory.eINSTANCE.createInterface();

		getFixture().setContract(interface_);

		getFixture().getSuppliers().remove(interface_);

		assertFalse(getFixture().getSuppliers().contains(interface_));
		assertSame(null, getFixture().getContract());

		getFixture().getSuppliers().add(interface_);

		assertTrue(getFixture().getSuppliers().contains(interface_));
		assertSame(null, getFixture().getContract());
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
		
		super.testGetTargets();

		assertTrue(getFixture().getTargets().contains(getFixture().getContract()));
	}

	public void testGetClients() {
		super.testGetClients();

		for (Iterator eAllSubClasses = getEAllSubClasses(UML2Package.eINSTANCE.getBehavioredClassifier()).iterator(); eAllSubClasses.hasNext();) {
			BehavioredClassifier behavioredClassifier = (BehavioredClassifier) UML2Factory.eINSTANCE.create((EClass) eAllSubClasses.next());

			getFixture().setImplementingClassifier(behavioredClassifier);

			getFixture().getClients().remove(behavioredClassifier);

			assertFalse(getFixture().getClients().contains(behavioredClassifier));
			assertFalse(behavioredClassifier.getClientDependencies().contains(getFixture()));
			assertSame(null, getFixture().getImplementingClassifier());

			getFixture().getClients().add(behavioredClassifier);

			assertTrue(getFixture().getClients().contains(behavioredClassifier));
			assertTrue(behavioredClassifier.getClientDependencies().contains(getFixture()));
			assertSame(null, getFixture().getImplementingClassifier());
		}
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

		super.testGetSources();

		assertTrue(getFixture().getSources().contains(getFixture().getImplementingClassifier()));
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.DependencyImplTest#setUpSources()
	 */
	protected void setUpSources() {
		super.setUpSources();

		getFixture().setImplementingClassifier(UML2Factory.eINSTANCE.createUseCase());
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.DependencyImplTest#setUpTargets()
	 */
	protected void setUpTargets() {
		super.setUpTargets();

		getFixture().setContract(UML2Factory.eINSTANCE.createInterface());
	}

} //ImplementationImplTest
