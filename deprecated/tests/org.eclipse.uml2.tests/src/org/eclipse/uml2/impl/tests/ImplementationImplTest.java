/*
 * Copyright (c) 2003, 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: ImplementationImplTest.java,v 1.3 2005/03/15 18:51:29 khussey Exp $
 */
package org.eclipse.uml2.impl.tests;

import java.util.Iterator;

import junit.textui.TestRunner;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.uml2.BehavioredClassifier;
import org.eclipse.uml2.Interface;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.impl.ImplementationImpl;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Implementation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.ImplementationImpl#getContract() <em>Contract</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ImplementationImpl#getImplementingClassifier() <em>Implementing Classifier</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.ImplementationImpl#getSuppliers() <em>Get Suppliers</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ImplementationImpl#getTargets() <em>Get Targets</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ImplementationImpl#getClients() <em>Get Clients</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ImplementationImpl#getSources() <em>Get Sources</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class ImplementationImplTest extends RealizationImplTest {

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
		TestRunner.run(ImplementationImplTest.class);
	}

	/**
	 * Constructs a new Implementation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationImplTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Implementation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ImplementationImpl getFixture() {
		return (ImplementationImpl) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture((ImplementationImpl) UML2Factory.eINSTANCE.createImplementation());
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
	 * Tests the '{@link org.eclipse.uml2.impl.ImplementationImpl#getContract() <em>Contract</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ImplementationImpl#getContract()
	 * @generated
	 */
	public void testGetContractGen() {
		// TODO: implement this feature getter test method
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
	 * Tests the '{@link org.eclipse.uml2.impl.ImplementationImpl#setContract() <em>Contract</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ImplementationImpl#setContract()
	 * @generated
	 */
	public void testSetContractGen() {
		// TODO: implement this feature setter test method
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
	 * Tests the '{@link org.eclipse.uml2.impl.ImplementationImpl#getImplementingClassifier() <em>Implementing Classifier</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ImplementationImpl#getImplementingClassifier()
	 * @generated
	 */
	public void testGetImplementingClassifierGen() {
		// TODO: implement this feature getter test method
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
	 * Tests the '{@link org.eclipse.uml2.impl.ImplementationImpl#setImplementingClassifier() <em>Implementing Classifier</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ImplementationImpl#setImplementingClassifier()
	 * @generated
	 */
	public void testSetImplementingClassifierGen() {
		// TODO: implement this feature setter test method
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
	 * Tests the '{@link org.eclipse.uml2.impl.ImplementationImpl#getSuppliers() <em>Get Suppliers</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ImplementationImpl#getSuppliers()
	 * @generated
	 */
	public void testGetSuppliersGen() {
		// TODO: implement this getter operation test method
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
	 * Tests the '{@link org.eclipse.uml2.impl.ImplementationImpl#getTargets() <em>Get Targets</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ImplementationImpl#getTargets()
	 * @generated
	 */
	public void testGetTargetsGen() {
		// TODO: implement this getter operation test method
	}

	public void testGetTargets() {
		testGetTargetsGen();
		
		super.testGetTargets();

		assertTrue(getFixture().getTargets().contains(getFixture().getContract()));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ImplementationImpl#getClients() <em>Get Clients</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ImplementationImpl#getClients()
	 * @generated
	 */
	public void testGetClientsGen() {
		// TODO: implement this getter operation test method
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
	 * Tests the '{@link org.eclipse.uml2.impl.ImplementationImpl#getSources() <em>Get Sources</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ImplementationImpl#getSources()
	 * @generated
	 */
	public void testGetSourcesGen() {
		// TODO: implement this getter operation test method
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
