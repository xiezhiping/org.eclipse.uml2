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
 * $Id: SubstitutionImplTest.java,v 1.3 2005/03/15 18:51:29 khussey Exp $
 */
package org.eclipse.uml2.impl.tests;

import java.util.Iterator;

import junit.textui.TestRunner;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.uml2.Classifier;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.impl.SubstitutionImpl;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Substitution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.SubstitutionImpl#getContract() <em>Contract</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.SubstitutionImpl#getSubstitutingClassifier() <em>Substituting Classifier</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.SubstitutionImpl#getSuppliers() <em>Get Suppliers</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.SubstitutionImpl#getTargets() <em>Get Targets</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.SubstitutionImpl#getClients() <em>Get Clients</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.SubstitutionImpl#getSources() <em>Get Sources</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class SubstitutionImplTest extends RealizationImplTest {

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
		TestRunner.run(SubstitutionImplTest.class);
	}

	/**
	 * Constructs a new Substitution test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubstitutionImplTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Substitution test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private SubstitutionImpl getFixture() {
		return (SubstitutionImpl) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture((SubstitutionImpl) UML2Factory.eINSTANCE.createSubstitution());
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
	 * Tests the '{@link org.eclipse.uml2.impl.SubstitutionImpl#getContract() <em>Contract</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.SubstitutionImpl#getContract()
	 * @generated
	 */
	public void testGetContractGen() {
		// TODO: implement this feature getter test method
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
	 * Tests the '{@link org.eclipse.uml2.impl.SubstitutionImpl#setContract() <em>Contract</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.SubstitutionImpl#setContract()
	 * @generated
	 */
	public void testSetContractGen() {
		// TODO: implement this feature setter test method
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
	 * Tests the '{@link org.eclipse.uml2.impl.SubstitutionImpl#getSubstitutingClassifier() <em>Substituting Classifier</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.SubstitutionImpl#getSubstitutingClassifier()
	 * @generated
	 */
	public void testGetSubstitutingClassifierGen() {
		// TODO: implement this feature getter test method
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
	 * Tests the '{@link org.eclipse.uml2.impl.SubstitutionImpl#setSubstitutingClassifier() <em>Substituting Classifier</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.SubstitutionImpl#setSubstitutingClassifier()
	 * @generated
	 */
	public void testSetSubstitutingClassifierGen() {
		// TODO: implement this feature setter test method
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
	 * Tests the '{@link org.eclipse.uml2.impl.SubstitutionImpl#getSuppliers() <em>Get Suppliers</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.SubstitutionImpl#getSuppliers()
	 * @generated
	 */
	public void testGetSuppliersGen() {
		// TODO: implement this getter operation test method
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
	 * Tests the '{@link org.eclipse.uml2.impl.SubstitutionImpl#getTargets() <em>Get Targets</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.SubstitutionImpl#getTargets()
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
	 * Tests the '{@link org.eclipse.uml2.impl.SubstitutionImpl#getClients() <em>Get Clients</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.SubstitutionImpl#getClients()
	 * @generated
	 */
	public void testGetClientsGen() {
		// TODO: implement this getter operation test method
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
	 * Tests the '{@link org.eclipse.uml2.impl.SubstitutionImpl#getSources() <em>Get Sources</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.SubstitutionImpl#getSources()
	 * @generated
	 */
	public void testGetSourcesGen() {
		// TODO: implement this getter operation test method
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
