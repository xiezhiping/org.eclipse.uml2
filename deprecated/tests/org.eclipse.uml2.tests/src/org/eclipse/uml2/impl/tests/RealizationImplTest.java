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
 * $Id: RealizationImplTest.java,v 1.1 2004/04/29 14:56:47 khussey Exp $
 */
package org.eclipse.uml2.impl.tests;

import java.util.Iterator;

import junit.textui.TestRunner;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.uml2.Classifier;
import org.eclipse.uml2.Component;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.impl.RealizationImpl;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Realization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.RealizationImpl#getAbstraction() <em>Abstraction</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.RealizationImpl#getRealizingClassifier() <em>Realizing Classifier</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.RealizationImpl#getSources() <em>Get Sources</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.RealizationImpl#getOwner() <em>Get Owner</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.RealizationImpl#getClients() <em>Get Clients</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.RealizationImpl#getSuppliers() <em>Get Suppliers</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.RealizationImpl#getTargets() <em>Get Targets</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class RealizationImplTest extends AbstractionImplTest {

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
		TestRunner.run(RealizationImplTest.class);
	}

	/**
	 * Constructs a new Realization test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealizationImplTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Realization test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private RealizationImpl getFixture() {
		return (RealizationImpl) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture((RealizationImpl) UML2Factory.eINSTANCE.createRealization());
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
	 * Tests the '{@link org.eclipse.uml2.impl.RealizationImpl#getAbstraction() <em>Abstraction</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.RealizationImpl#getAbstraction()
	 * @generated NOT
	 */
	public void testGetAbstraction() {
		Component component = UML2Factory.eINSTANCE.createComponent();

		getFixture().setAbstraction(component);

		assertSame(component, getFixture().getAbstraction());

		getFixture().setAbstraction(null);

		assertSame(null, getFixture().getAbstraction());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.RealizationImpl#setAbstraction() <em>Abstraction</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.RealizationImpl#setAbstraction()
	 * @generated NOT
	 */
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

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.RealizationImpl#getRealizingClassifier() <em>Realizing Classifier</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.RealizationImpl#getRealizingClassifier()
	 * @generated NOT
	 */
	public void testGetRealizingClassifier() {

		for (Iterator eAllSubClasses = getEAllSubClasses(UML2Package.eINSTANCE.getClassifier()).iterator(); eAllSubClasses.hasNext();) {
			Classifier classifier = (Classifier) UML2Factory.eINSTANCE.create((EClass) eAllSubClasses.next());

			getFixture().setRealizingClassifier(classifier);

			assertSame(classifier, getFixture().getRealizingClassifier());

			getFixture().setRealizingClassifier(null);

			assertSame(null, getFixture().getRealizingClassifier());
		}
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.RealizationImpl#setRealizingClassifier() <em>Realizing Classifier</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.RealizationImpl#setRealizingClassifier()
	 * @generated NOT
	 */
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

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.RealizationImpl#getSources() <em>Get Sources</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.RealizationImpl#getSources()
	 * @generated NOT
	 */
	public void testGetSources() {
		super.testGetSources();

		if (null != getFixture().getAbstraction()) {
			assertTrue(getFixture().getSources().contains(getFixture().getAbstraction()));
		}
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.RealizationImpl#getOwner() <em>Get Owner</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.RealizationImpl#getOwner()
	 * @generated NOT
	 */
	public void testGetOwner() {
		super.testGetOwner();

		assertSame(getFixture().getAbstraction(), getFixture().getOwner());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.RealizationImpl#getClients() <em>Get Clients</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.RealizationImpl#getClients()
	 * @generated NOT
	 */
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

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.RealizationImpl#getSuppliers() <em>Get Suppliers</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.RealizationImpl#getSuppliers()
	 * @generated NOT
	 */
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

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.RealizationImpl#getTargets() <em>Get Targets</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.RealizationImpl#getTargets()
	 * @generated NOT
	 */
	public void testGetTargets() {
		super.testGetTargets();

		assertTrue(getFixture().getTargets().contains(getFixture().getRealizingClassifier()));
	}

	/**
	 * @see org.eclipse.uml2.impl.tests.ElementImplTest#setUpOwner()
	 */
	protected void setUpOwner() {
		UML2Factory.eINSTANCE.createComponent().getRealizations().add(getFixture());
	}

	/**
	 * @see org.eclipse.uml2.impl.tests.DependencyImplTest#setUpSources()
	 */
	protected void setUpSources() {
		super.setUpSources();

		getFixture().setAbstraction(UML2Factory.eINSTANCE.createComponent());
	}

	/**
	 * @see org.eclipse.uml2.impl.tests.DependencyImplTest#setUpTargets()
	 */
	protected void setUpTargets() {
		super.setUpTargets();

		getFixture().setRealizingClassifier(UML2Factory.eINSTANCE.createActor());
	}

} //RealizationImplTest
