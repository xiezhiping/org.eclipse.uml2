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
 * $Id: BehavioralFeatureTest.java,v 1.1 2005/04/04 20:06:08 khussey Exp $
 */
package org.eclipse.uml2.tests;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.uml2.BehavioralFeature;
import org.eclipse.uml2.NamedElement;
import org.eclipse.uml2.Namespace;
import java.util.Iterator;

import org.eclipse.uml2.Classifier;
import org.eclipse.uml2.RedefinableElement;
import org.eclipse.uml2.UML2Factory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Behavioral Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.RedefinableElement#getRedefinitionContexts() <em>Redefinition Context</em>}</li>
 *   <li>{@link org.eclipse.uml2.Feature#getFeaturingClassifiers() <em>Featuring Classifier</em>}</li>
 *   <li>{@link org.eclipse.uml2.BehavioralFeature#getParameters() <em>Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.BehavioralFeature#getFormalParameters() <em>Formal Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.BehavioralFeature#getRaisedExceptions() <em>Raised Exception</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.RedefinableElement#validateRedefinitionContextValid(DiagnosticChain, Map) <em>Validate Redefinition Context Valid</em>}</li>
 *   <li>{@link org.eclipse.uml2.RedefinableElement#validateRedefinitionConsistent(DiagnosticChain, Map) <em>Validate Redefinition Consistent</em>}</li>
 *   <li>{@link org.eclipse.uml2.RedefinableElement#isConsistentWith(RedefinableElement) <em>Is Consistent With</em>}</li>
 *   <li>{@link org.eclipse.uml2.RedefinableElement#isRedefinitionContextValid(RedefinableElement) <em>Is Redefinition Context Valid</em>}</li>
 *   <li>{@link org.eclipse.uml2.RedefinableElement#getRedefinedElements() <em>Get Redefined Elements</em>}</li>
 *   <li>{@link org.eclipse.uml2.BehavioralFeature#isDistinguishableFrom(NamedElement, Namespace) <em>Is Distinguishable From</em>}</li>
 *   <li>{@link org.eclipse.uml2.BehavioralFeature#getMembers() <em>Get Members</em>}</li>
 *   <li>{@link org.eclipse.uml2.BehavioralFeature#getOwnedMembers() <em>Get Owned Members</em>}</li>
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
	public static final String copyright = "Copyright (c) 2003, 2005 IBM Corporation and others."; //$NON-NLS-1$

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

	/**
	 * Tests the '{@link org.eclipse.uml2.RedefinableElement#getRedefinitionContexts() <em>Redefinition Context</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.RedefinableElement#getRedefinitionContexts()
	 * @generated
	 */
	public void testGetRedefinitionContextsGen() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testGetRedefinitionContexts() {
		testGetRedefinitionContextsGen();
		
		setUpRedefinitionContexts();

		for (Iterator redefinitionContexts = getFixture().getRedefinitionContexts().iterator(); redefinitionContexts.hasNext();) {
			assertTrue(Classifier.class.isInstance(redefinitionContexts.next()));
		}
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Feature#getFeaturingClassifiers() <em>Featuring Classifier</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Feature#getFeaturingClassifiers()
	 * @generated
	 */
	public void testGetFeaturingClassifiersGen() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testGetFeaturingClassifiers() {
		testGetFeaturingClassifiersGen();
		
		setUpFeaturingClassifiers();

		for (Iterator featuringClassifiers = getFixture().getFeaturingClassifiers().iterator(); featuringClassifiers.hasNext();) {
			assertTrue(Classifier.class.isInstance(featuringClassifiers.next()));
		}
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.BehavioralFeature#getParameters() <em>Parameter</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.BehavioralFeature#getParameters()
	 * @generated
	 */
	public void testGetParametersGen() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testGetParameters() {
		testGetParametersGen();
		
		getFixture().getFormalParameters().add(UML2Factory.eINSTANCE.createParameter());
		getFixture().getFormalParameters().add(UML2Factory.eINSTANCE.createParameter());

		getFixture().getReturnResults().add(UML2Factory.eINSTANCE.createParameter());
		getFixture().getReturnResults().add(UML2Factory.eINSTANCE.createParameter());

		assertTrue(getFixture().getParameters().containsAll(getFixture().getFormalParameters()));
		assertTrue(getFixture().getParameters().containsAll(getFixture().getReturnResults()));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.BehavioralFeature#getFormalParameters() <em>Formal Parameter</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.BehavioralFeature#getFormalParameters()
	 * @generated
	 */
	public void testGetFormalParameters() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.BehavioralFeature#getRaisedExceptions() <em>Raised Exception</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.BehavioralFeature#getRaisedExceptions()
	 * @generated
	 */
	public void testGetRaisedExceptions() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.RedefinableElement#validateRedefinitionContextValid(DiagnosticChain, Map) <em>Validate Redefinition Context Valid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.RedefinableElement#validateRedefinitionContextValid(DiagnosticChain, Map)
	 * @generated
	 */
	public void testValidateRedefinitionContextValid__DiagnosticChain_Map() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.RedefinableElement#validateRedefinitionConsistent(DiagnosticChain, Map) <em>Validate Redefinition Consistent</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.RedefinableElement#validateRedefinitionConsistent(DiagnosticChain, Map)
	 * @generated
	 */
	public void testValidateRedefinitionConsistent__DiagnosticChain_Map() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.RedefinableElement#isConsistentWith(RedefinableElement) <em>Is Consistent With</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.RedefinableElement#isConsistentWith(RedefinableElement)
	 * @generated
	 */
	public void testIsConsistentWith__RedefinableElement() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.RedefinableElement#isRedefinitionContextValid(RedefinableElement) <em>Is Redefinition Context Valid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.RedefinableElement#isRedefinitionContextValid(RedefinableElement)
	 * @generated
	 */
	public void testIsRedefinitionContextValid__RedefinableElement() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.RedefinableElement#getRedefinedElements() <em>Get Redefined Elements</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.RedefinableElement#getRedefinedElements()
	 * @generated
	 */
	public void testGetRedefinedElementsGen() {
		// TODO: implement this getter operation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testGetRedefinedElements() {
		testGetRedefinedElementsGen();
		
		setUpRedefinedElements();

		for (Iterator redefinedElements = getFixture().getRedefinedElements().iterator(); redefinedElements.hasNext();) {
			assertTrue(RedefinableElement.class.isInstance(redefinedElements.next()));
		}
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.BehavioralFeature#isDistinguishableFrom(NamedElement, Namespace) <em>Is Distinguishable From</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.BehavioralFeature#isDistinguishableFrom(NamedElement, Namespace)
	 * @generated
	 */
	public void testIsDistinguishableFrom__NamedElement_Namespace() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.BehavioralFeature#getMembers() <em>Get Members</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.BehavioralFeature#getMembers()
	 * @generated
	 */
	public void testGetMembersGen() {
		// TODO: implement this getter operation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testGetMembers() {
		testGetMembersGen();
		
		super.testGetMembers();

		assertTrue(getFixture().getMembers().containsAll(getFixture().getParameters()));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.BehavioralFeature#getOwnedMembers() <em>Get Owned Members</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.BehavioralFeature#getOwnedMembers()
	 * @generated
	 */
	public void testGetOwnedMembersGen() {
		// TODO: implement this getter operation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testGetOwnedMembers() {
		testGetOwnedMembersGen();
		
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
