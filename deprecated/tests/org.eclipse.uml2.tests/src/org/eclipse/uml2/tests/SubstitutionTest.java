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
 * $Id: SubstitutionTest.java,v 1.3 2005/05/18 17:04:28 khussey Exp $
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
 * @generated
 */
public class SubstitutionTest extends RealizationTest {

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



	public void testGetContract() {

		for (Iterator eAllSubClasses = getEAllSubClasses(UML2Package.eINSTANCE.getClassifier()).iterator(); eAllSubClasses.hasNext();) {
			Classifier classifier = (Classifier) UML2Factory.eINSTANCE.create((EClass) eAllSubClasses.next());

			getFixture().setContract(classifier);

			assertSame(classifier, getFixture().getContract());

			getFixture().setContract(null);

			assertSame(null, getFixture().getContract());
		}
	}

	public void testSetContract() {

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

	public void testGetSubstitutingClassifier() {

		for (Iterator eAllSubClasses = getEAllSubClasses(UML2Package.eINSTANCE.getClassifier()).iterator(); eAllSubClasses.hasNext();) {
			Classifier classifier = (Classifier) UML2Factory.eINSTANCE.create((EClass) eAllSubClasses.next());

			getFixture().setSubstitutingClassifier(classifier);

			assertSame(classifier, getFixture().getSubstitutingClassifier());

			getFixture().setSubstitutingClassifier(null);

			assertSame(null, getFixture().getSubstitutingClassifier());
		}
	}

	public void testSetSubstitutingClassifier() {

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

	public void testGetSuppliers() {
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
