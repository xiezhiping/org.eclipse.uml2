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
 * $Id: BehavioralFeatureTest.java,v 1.4 2006/05/29 17:27:34 khussey Exp $
 */
package org.eclipse.uml2.tests;

import org.eclipse.uml2.BehavioralFeature;
import java.util.Iterator;

import org.eclipse.uml2.Classifier;
import org.eclipse.uml2.RedefinableElement;
import org.eclipse.uml2.UML2Factory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Behavioral Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.RedefinableElement#validateRedefinitionContextValid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Redefinition Context Valid</em>}</li>
 *   <li>{@link org.eclipse.uml2.RedefinableElement#validateRedefinitionConsistent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Redefinition Consistent</em>}</li>
 *   <li>{@link org.eclipse.uml2.RedefinableElement#isConsistentWith(org.eclipse.uml2.RedefinableElement) <em>Is Consistent With</em>}</li>
 *   <li>{@link org.eclipse.uml2.RedefinableElement#isRedefinitionContextValid(org.eclipse.uml2.RedefinableElement) <em>Is Redefinition Context Valid</em>}</li>
 *   <li>{@link org.eclipse.uml2.BehavioralFeature#isDistinguishableFrom(org.eclipse.uml2.NamedElement, org.eclipse.uml2.Namespace) <em>Is Distinguishable From</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public abstract class BehavioralFeatureTest extends NamespaceTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Constructs a new Behavioral Feature test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehavioralFeatureTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Behavioral Feature test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private BehavioralFeature getFixture() {
		return (BehavioralFeature)fixture;
	}

	public void testGetRedefinitionContexts() {
		setUpRedefinitionContexts();

		for (Iterator redefinitionContexts = getFixture().getRedefinitionContexts().iterator(); redefinitionContexts.hasNext();) {
			assertTrue(Classifier.class.isInstance(redefinitionContexts.next()));
		}
	}

	public void testGetFeaturingClassifiers() {
		setUpFeaturingClassifiers();

		for (Iterator featuringClassifiers = getFixture().getFeaturingClassifiers().iterator(); featuringClassifiers.hasNext();) {
			assertTrue(Classifier.class.isInstance(featuringClassifiers.next()));
		}
	}

	public void testGetParameters() {
		getFixture().getFormalParameters().add(UML2Factory.eINSTANCE.createParameter());
		getFixture().getFormalParameters().add(UML2Factory.eINSTANCE.createParameter());

		getFixture().getReturnResults().add(UML2Factory.eINSTANCE.createParameter());
		getFixture().getReturnResults().add(UML2Factory.eINSTANCE.createParameter());

		assertTrue(getFixture().getParameters().containsAll(getFixture().getFormalParameters()));
		assertTrue(getFixture().getParameters().containsAll(getFixture().getReturnResults()));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.RedefinableElement#validateRedefinitionContextValid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Redefinition Context Valid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.RedefinableElement#validateRedefinitionContextValid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateRedefinitionContextValid__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.RedefinableElement#validateRedefinitionConsistent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Redefinition Consistent</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.RedefinableElement#validateRedefinitionConsistent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateRedefinitionConsistent__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.RedefinableElement#isConsistentWith(org.eclipse.uml2.RedefinableElement) <em>Is Consistent With</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.RedefinableElement#isConsistentWith(org.eclipse.uml2.RedefinableElement)
	 * @generated
	 */
	public void testIsConsistentWith__RedefinableElement() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.RedefinableElement#isRedefinitionContextValid(org.eclipse.uml2.RedefinableElement) <em>Is Redefinition Context Valid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.RedefinableElement#isRedefinitionContextValid(org.eclipse.uml2.RedefinableElement)
	 * @generated
	 */
	public void testIsRedefinitionContextValid__RedefinableElement() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testGetRedefinedElements() {
		setUpRedefinedElements();

		for (Iterator redefinedElements = getFixture().getRedefinedElements().iterator(); redefinedElements.hasNext();) {
			assertTrue(RedefinableElement.class.isInstance(redefinedElements.next()));
		}
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.BehavioralFeature#isDistinguishableFrom(org.eclipse.uml2.NamedElement, org.eclipse.uml2.Namespace) <em>Is Distinguishable From</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.BehavioralFeature#isDistinguishableFrom(org.eclipse.uml2.NamedElement, org.eclipse.uml2.Namespace)
	 * @generated
	 */
	public void testIsDistinguishableFrom__NamedElement_Namespace() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}


	public void testGetMembers() {
		super.testGetMembers();

		assertTrue(getFixture().getMembers().containsAll(getFixture().getParameters()));
	}

	public void testGetOwnedMembers() {
		super.testGetOwnedMembers();

		assertTrue(getFixture().getOwnedMembers().containsAll(getFixture().getFormalParameters()));
		assertTrue(getFixture().getOwnedMembers().containsAll(getFixture().getReturnResults()));
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.NamespaceImplTest#setUpOwnedMembers()
	 */
	protected void setUpOwnedMembers() {
		super.setUpOwnedMembers();

		getFixture().getFormalParameters().add(UML2Factory.eINSTANCE.createParameter());
		getFixture().getFormalParameters().add(UML2Factory.eINSTANCE.createParameter());

		getFixture().getReturnResults().add(UML2Factory.eINSTANCE.createParameter());
		getFixture().getReturnResults().add(UML2Factory.eINSTANCE.createParameter());
	}

	protected void setUpRedefinitionContexts() {
		// do nothing
	}

	protected void setUpRedefinedElements() {
		// do nothing
	}

	protected void setUpFeaturingClassifiers() {
		// do nothing
	}

} //BehavioralFeatureImplTest
