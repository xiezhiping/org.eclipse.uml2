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
 * $Id: RealizationTest.java,v 1.4 2006/05/29 17:27:34 khussey Exp $
 */
package org.eclipse.uml2.tests;

import java.util.Iterator;

import junit.textui.TestRunner;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.uml2.Classifier;
import org.eclipse.uml2.Component;
import org.eclipse.uml2.Realization;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Realization</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RealizationTest extends AbstractionTest {

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
		TestRunner.run(RealizationTest.class);
	}

	/**
	 * Constructs a new Realization test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealizationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Realization test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Realization getFixture() {
		return (Realization)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(UML2Factory.eINSTANCE.createRealization());
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


	public void testGetAbstraction() {
		Component component = UML2Factory.eINSTANCE.createComponent();

		getFixture().setAbstraction(component);

		assertSame(component, getFixture().getAbstraction());

		getFixture().setAbstraction(null);

		assertSame(null, getFixture().getAbstraction());
	}

	public void testSetAbstraction() {
		Component component = UML2Factory.eINSTANCE.createComponent();

		getFixture().setAbstraction(component);

		assertSame(component, getFixture().getAbstraction());
		assertTrue(component.getRealizations().contains(getFixture()));
		assertTrue(getFixture().getClients().contains(component));

		getFixture().setAbstraction(null);

		assertSame(null, getFixture().getAbstraction());
		assertFalse(component.getRealizations().contains(getFixture()));
		assertTrue(getFixture().getClients().contains(component));
	}

	public void testGetRealizingClassifier() {

		for (Iterator eAllSubClasses = getEAllSubClasses(UML2Package.eINSTANCE.getClassifier()).iterator(); eAllSubClasses.hasNext();) {
			Classifier classifier = (Classifier) UML2Factory.eINSTANCE.create((EClass) eAllSubClasses.next());

			getFixture().setRealizingClassifier(classifier);

			assertSame(classifier, getFixture().getRealizingClassifier());

			getFixture().setRealizingClassifier(null);

			assertSame(null, getFixture().getRealizingClassifier());
		}
	}

	public void testSetRealizingClassifier() {

		for (Iterator eAllSubClasses = getEAllSubClasses(UML2Package.eINSTANCE.getClassifier()).iterator(); eAllSubClasses.hasNext();) {
			Classifier classifier = (Classifier) UML2Factory.eINSTANCE.create((EClass) eAllSubClasses.next());

			getFixture().setRealizingClassifier(classifier);

			assertSame(classifier, getFixture().getRealizingClassifier());
			assertTrue(getFixture().getSuppliers().contains(classifier));

			getFixture().setRealizingClassifier(null);

			assertSame(null, getFixture().getRealizingClassifier());
			assertTrue(getFixture().getSuppliers().contains(classifier));
		}
	}

	public void testGetSources() {
		super.testGetSources();

		if (null != getFixture().getAbstraction()) {
			assertTrue(getFixture().getSources().contains(getFixture().getAbstraction()));
		}
	}

	public void testGetOwner() {
		super.testGetOwner();

		assertSame(getFixture().getAbstraction(), getFixture().getOwner());
	}

	public void testGetClients() {
		super.testGetClients();

		Component component = UML2Factory.eINSTANCE.createComponent();

		getFixture().setAbstraction(component);

		getFixture().getClients().remove(component);

		assertFalse(getFixture().getClients().contains(component));
		assertFalse(component.getClientDependencies().contains(getFixture()));
		assertSame(null, getFixture().getAbstraction());

		getFixture().getClients().add(component);

		assertTrue(getFixture().getClients().contains(component));
		assertTrue(component.getClientDependencies().contains(getFixture()));
		assertSame(null, getFixture().getAbstraction());
	}

	public void testGetSuppliers() {
		super.testGetSuppliers();

		for (Iterator eAllSubClasses = getEAllSubClasses(UML2Package.eINSTANCE.getClassifier()).iterator(); eAllSubClasses.hasNext();) {
			Classifier classifier = (Classifier) UML2Factory.eINSTANCE.create((EClass) eAllSubClasses.next());

			getFixture().setRealizingClassifier(classifier);

			getFixture().getSuppliers().remove(classifier);

			assertFalse(getFixture().getSuppliers().contains(classifier));
			assertSame(null, getFixture().getRealizingClassifier());

			getFixture().getSuppliers().add(classifier);

			assertTrue(getFixture().getSuppliers().contains(classifier));
			assertSame(null, getFixture().getRealizingClassifier());
		}
	}

	public void testGetTargets() {
		super.testGetTargets();

		assertTrue(getFixture().getTargets().contains(getFixture().getRealizingClassifier()));
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.ElementImplTest#setUpOwner()
	 */
	protected void setUpOwner() {
		UML2Factory.eINSTANCE.createComponent().getRealizations().add(getFixture());
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.DependencyImplTest#setUpSources()
	 */
	protected void setUpSources() {
		super.setUpSources();

		getFixture().setAbstraction(UML2Factory.eINSTANCE.createComponent());
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.DependencyImplTest#setUpTargets()
	 */
	protected void setUpTargets() {
		super.setUpTargets();

		getFixture().setRealizingClassifier(UML2Factory.eINSTANCE.createActor());
	}

} //RealizationImplTest
