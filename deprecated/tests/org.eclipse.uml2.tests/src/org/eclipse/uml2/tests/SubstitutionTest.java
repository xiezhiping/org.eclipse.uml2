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
 * $Id: SubstitutionTest.java,v 1.1 2005/04/04 20:06:08 khussey Exp $
 */
package org.eclipse.uml2.tests;

import java.util.Iterator;

import junit.textui.TestRunner;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.uml2.Classifier;
import org.eclipse.uml2.Substitution;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Substitution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.Substitution#getContract() <em>Contract</em>}</li>
 *   <li>{@link org.eclipse.uml2.Substitution#getSubstitutingClassifier() <em>Substituting Classifier</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.Substitution#getSuppliers() <em>Get Suppliers</em>}</li>
 *   <li>{@link org.eclipse.uml2.Substitution#getTargets() <em>Get Targets</em>}</li>
 *   <li>{@link org.eclipse.uml2.Substitution#getClients() <em>Get Clients</em>}</li>
 *   <li>{@link org.eclipse.uml2.Substitution#getSources() <em>Get Sources</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class SubstitutionTest extends RealizationTest {

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
		TestRunner.run(SubstitutionTest.class);
	}

	/**
	 * Constructs a new Substitution test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubstitutionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Substitution test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Substitution getFixture() {
		return (Substitution)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(UML2Factory.eINSTANCE.createSubstitution());
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
	 * Tests the '{@link org.eclipse.uml2.Substitution#getContract() <em>Contract</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Substitution#getContract()
	 * @generated
	 */
	public void testGetContractGen() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testGetContract() {
		testGetContractGen();

		for (Iterator eAllSubClasses = getEAllSubClasses(UML2Package.eINSTANCE.getClassifier()).iterator(); eAllSubClasses.hasNext();) {
			Classifier classifier = (Classifier) UML2Factory.eINSTANCE.create((EClass) eAllSubClasses.next());

			getFixture().setContract(classifier);

			assertSame(classifier, getFixture().getContract());

			getFixture().setContract(null);

			assertSame(null, getFixture().getContract());
		}
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Substitution#setContract(Classifier) <em>Contract</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Substitution#setContract(Classifier)
	 * @generated
	 */
	public void testSetContractGen() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testSetContract() {
		testSetContractGen();

		for (Iterator eAllSubClasses = getEAllSubClasses(UML2Package.eINSTANCE.getClassifier()).iterator(); eAllSubClasses.hasNext();) {
			Classifier classifier = (Classifier) UML2Factory.eINSTANCE.create((EClass) eAllSubClasses.next());

			getFixture().setContract(classifier);

			assertSame(classifier, getFixture().getContract());
			assertTrue(getFixture().getSuppliers().contains(classifier));

			getFixture().setContract(null);

			assertSame(null, getFixture().getContract());
			assertTrue(getFixture().getSuppliers().contains(classifier));
		}
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Substitution#getSubstitutingClassifier() <em>Substituting Classifier</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Substitution#getSubstitutingClassifier()
	 * @generated
	 */
	public void testGetSubstitutingClassifierGen() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testGetSubstitutingClassifier() {
		testGetSubstitutingClassifierGen();

		for (Iterator eAllSubClasses = getEAllSubClasses(UML2Package.eINSTANCE.getClassifier()).iterator(); eAllSubClasses.hasNext();) {
			Classifier classifier = (Classifier) UML2Factory.eINSTANCE.create((EClass) eAllSubClasses.next());

			getFixture().setSubstitutingClassifier(classifier);

			assertSame(classifier, getFixture().getSubstitutingClassifier());

			getFixture().setSubstitutingClassifier(null);

			assertSame(null, getFixture().getSubstitutingClassifier());
		}
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Substitution#setSubstitutingClassifier(Classifier) <em>Substituting Classifier</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Substitution#setSubstitutingClassifier(Classifier)
	 * @generated
	 */
	public void testSetSubstitutingClassifierGen() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testSetSubstitutingClassifier() {
		testSetSubstitutingClassifierGen();

		for (Iterator eAllSubClasses = getEAllSubClasses(UML2Package.eINSTANCE.getClassifier()).iterator(); eAllSubClasses.hasNext();) {
			Classifier classifier = (Classifier) UML2Factory.eINSTANCE.create((EClass) eAllSubClasses.next());

			getFixture().setSubstitutingClassifier(classifier);

			assertSame(classifier, getFixture().getSubstitutingClassifier());
			assertTrue(classifier.getSubstitutions().contains(getFixture()));
			assertTrue(getFixture().getClients().contains(classifier));

			getFixture().setSubstitutingClassifier(null);

			assertSame(null, getFixture().getSubstitutingClassifier());
			assertFalse(classifier.getSubstitutions().contains(getFixture()));
			assertTrue(getFixture().getClients().contains(classifier));
		}
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Substitution#getSuppliers() <em>Get Suppliers</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Substitution#getSuppliers()
	 * @generated
	 */
	public void testGetSuppliersGen() {
		// TODO: implement this getter operation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testGetSuppliers() {
		testGetSuppliersGen();
		
		super.testGetSuppliers();

		for (Iterator eAllSubClasses = getEAllSubClasses(UML2Package.eINSTANCE.getClassifier()).iterator(); eAllSubClasses.hasNext();) {
			Classifier classifier = (Classifier) UML2Factory.eINSTANCE.create((EClass) eAllSubClasses.next());

			getFixture().setContract(classifier);

			getFixture().getSuppliers().remove(classifier);

			assertFalse(getFixture().getSuppliers().contains(classifier));
			assertSame(null, getFixture().getContract());

			getFixture().getSuppliers().add(classifier);

			assertTrue(getFixture().getSuppliers().contains(classifier));
			assertSame(null, getFixture().getContract());
		}
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Substitution#getTargets() <em>Get Targets</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Substitution#getTargets()
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
	 * Tests the '{@link org.eclipse.uml2.Substitution#getClients() <em>Get Clients</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Substitution#getClients()
	 * @generated
	 */
	public void testGetClientsGen() {
		// TODO: implement this getter operation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testGetClients() {
		testGetClientsGen();
		
		super.testGetClients();

		for (Iterator eAllSubClasses = getEAllSubClasses(UML2Package.eINSTANCE.getClassifier()).iterator(); eAllSubClasses.hasNext();) {
			Classifier classifier = (Classifier) UML2Factory.eINSTANCE.create((EClass) eAllSubClasses.next());

			getFixture().setSubstitutingClassifier(classifier);

			getFixture().getClients().remove(classifier);

			assertFalse(getFixture().getClients().contains(classifier));
			assertFalse(classifier.getClientDependencies().contains(getFixture()));
			assertSame(null, getFixture().getSubstitutingClassifier());

			getFixture().getClients().add(classifier);

			assertTrue(getFixture().getClients().contains(classifier));
			assertTrue(classifier.getClientDependencies().contains(getFixture()));
			assertSame(null, getFixture().getSubstitutingClassifier());
		}
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Substitution#getSources() <em>Get Sources</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Substitution#getSources()
	 * @generated
	 */
	public void testGetSourcesGen() {
		// TODO: implement this getter operation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testGetSources() {
		testGetSourcesGen();
		
		super.testGetSources();

		assertTrue(getFixture().getSources().contains(getFixture().getSubstitutingClassifier()));
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.DependencyImplTest#setUpSources()
	 */
	protected void setUpSources() {
		super.setUpSources();

		getFixture().setSubstitutingClassifier(UML2Factory.eINSTANCE.createActor());
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.DependencyImplTest#setUpTargets()
	 */
	protected void setUpTargets() {
		super.setUpTargets();

		getFixture().setContract(UML2Factory.eINSTANCE.createActor());
	}

} //SubstitutionImplTest
