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
 * $Id: ImplementationTest.java,v 1.1 2005/04/04 20:06:06 khussey Exp $
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
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.Implementation#getContract() <em>Contract</em>}</li>
 *   <li>{@link org.eclipse.uml2.Implementation#getImplementingClassifier() <em>Implementing Classifier</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.Implementation#getSuppliers() <em>Get Suppliers</em>}</li>
 *   <li>{@link org.eclipse.uml2.Implementation#getTargets() <em>Get Targets</em>}</li>
 *   <li>{@link org.eclipse.uml2.Implementation#getClients() <em>Get Clients</em>}</li>
 *   <li>{@link org.eclipse.uml2.Implementation#getSources() <em>Get Sources</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class ImplementationTest extends RealizationTest {

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

	/**
	 * Tests the '{@link org.eclipse.uml2.Implementation#getContract() <em>Contract</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Implementation#getContract()
	 * @generated
	 */
	public void testGetContractGen() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testGetContract() {
		testGetClientsGen();
		
		Interface interface_ = UML2Factory.eINSTANCE.createInterface();

		getFixture().setContract(interface_);

		assertSame(interface_, getFixture().getContract());

		getFixture().setContract(null);

		assertSame(null, getFixture().getContract());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Implementation#setContract(Interface) <em>Contract</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Implementation#setContract(Interface)
	 * @generated
	 */
	public void testSetContractGen() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testSetContract() {
		testSetContractGen();
		
		Interface interface_ = UML2Factory.eINSTANCE.createInterface();

		getFixture().setContract(interface_);

		assertSame(interface_, getFixture().getContract());
		assertTrue(getFixture().getSuppliers().contains(interface_));

		getFixture().setContract(null);

		assertSame(null, getFixture().getContract());
		assertTrue(getFixture().getSuppliers().contains(interface_));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Implementation#getImplementingClassifier() <em>Implementing Classifier</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Implementation#getImplementingClassifier()
	 * @generated
	 */
	public void testGetImplementingClassifierGen() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testGetImplementingClassifier() {
		testGetImplementingClassifierGen();

		for (Iterator eAllSubClasses = getEAllSubClasses(UML2Package.eINSTANCE.getBehavioredClassifier()).iterator(); eAllSubClasses.hasNext();) {
			BehavioredClassifier behavioredClassifier = (BehavioredClassifier) UML2Factory.eINSTANCE.create((EClass) eAllSubClasses.next());

			getFixture().setImplementingClassifier(behavioredClassifier);

			assertSame(behavioredClassifier, getFixture().getImplementingClassifier());

			getFixture().setImplementingClassifier(null);

			assertSame(null, getFixture().getImplementingClassifier());
		}
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Implementation#setImplementingClassifier(BehavioredClassifier) <em>Implementing Classifier</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Implementation#setImplementingClassifier(BehavioredClassifier)
	 * @generated
	 */
	public void testSetImplementingClassifierGen() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testSetImplementingClassifier() {
		testSetImplementingClassifierGen();

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

	/**
	 * Tests the '{@link org.eclipse.uml2.Implementation#getSuppliers() <em>Get Suppliers</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Implementation#getSuppliers()
	 * @generated
	 */
	public void testGetSuppliersGen() {
		// TODO: implement this getter operation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testGetSuppliers() {
		testGetSuppliersGen();
		
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
	 * Tests the '{@link org.eclipse.uml2.Implementation#getTargets() <em>Get Targets</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Implementation#getTargets()
	 * @generated
	 */
	public void testGetTargetsGen() {
		// TODO: implement this getter operation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testGetTargets() {
		testGetTargetsGen();
		
		super.testGetTargets();

		assertTrue(getFixture().getTargets().contains(getFixture().getContract()));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Implementation#getClients() <em>Get Clients</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Implementation#getClients()
	 * @generated
	 */
	public void testGetClientsGen() {
		// TODO: implement this getter operation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testGetClients() {
		testGetClientsGen();
		
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
	 * Tests the '{@link org.eclipse.uml2.Implementation#getSources() <em>Get Sources</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Implementation#getSources()
	 * @generated
	 */
	public void testGetSourcesGen() {
		// TODO: implement this getter operation test method
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
