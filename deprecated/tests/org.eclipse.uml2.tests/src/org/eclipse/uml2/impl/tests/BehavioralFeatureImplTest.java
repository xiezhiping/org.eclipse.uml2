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
 * $Id: BehavioralFeatureImplTest.java,v 1.1 2004/04/29 14:56:47 khussey Exp $
 */
package org.eclipse.uml2.impl.tests;

import java.util.Iterator;

import org.eclipse.uml2.Classifier;
import org.eclipse.uml2.RedefinableElement;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.impl.BehavioralFeatureImpl;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Behavioral Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.BehavioralFeatureImpl#getRedefinitionContexts() <em>Redefinition Context</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.BehavioralFeatureImpl#getFeaturingClassifiers() <em>Featuring Classifier</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.BehavioralFeatureImpl#getParameters() <em>Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.BehavioralFeatureImpl#getFormalParameters() <em>Formal Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.BehavioralFeatureImpl#getRaisedExceptions() <em>Raised Exception</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.BehavioralFeatureImpl#validateRedefinitionContextValid() <em>Validate Redefinition Context Valid</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.BehavioralFeatureImpl#validateRedefinitionConsistent() <em>Validate Redefinition Consistent</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.BehavioralFeatureImpl#isConsistentWith(RedefinableElement) <em>Is Consistent With</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.BehavioralFeatureImpl#isRedefinitionContextValid(RedefinableElement) <em>Is Redefinition Context Valid</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.BehavioralFeatureImpl#getRedefinedElements() <em>Get Redefined Elements</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.BehavioralFeatureImpl#isDistinguishableFrom(NamedElement, Namespace) <em>Is Distinguishable From</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.BehavioralFeatureImpl#getMembers() <em>Get Members</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.BehavioralFeatureImpl#getOwnedMembers() <em>Get Owned Members</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public abstract class BehavioralFeatureImplTest extends NamespaceImplTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Constructs a new Behavioral Feature test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehavioralFeatureImplTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Behavioral Feature test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private BehavioralFeatureImpl getFixture() {
		return (BehavioralFeatureImpl) fixture;
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.BehavioralFeatureImpl#getRedefinitionContexts() <em>Redefinition Context</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.BehavioralFeatureImpl#getRedefinitionContexts()
	 * @generated NOT
	 */
	public void testGetRedefinitionContexts() {
		setUpRedefinitionContexts();

		for (Iterator redefinitionContexts = getFixture().getRedefinitionContexts().iterator(); redefinitionContexts.hasNext();) {
			assertTrue(Classifier.class.isInstance(redefinitionContexts.next()));
		}
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.BehavioralFeatureImpl#getFeaturingClassifiers() <em>Featuring Classifier</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.BehavioralFeatureImpl#getFeaturingClassifiers()
	 * @generated NOT
	 */
	public void testGetFeaturingClassifiers() {
		setUpFeaturingClassifiers();

		for (Iterator featuringClassifiers = getFixture().getFeaturingClassifiers().iterator(); featuringClassifiers.hasNext();) {
			assertTrue(Classifier.class.isInstance(featuringClassifiers.next()));
		}
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.BehavioralFeatureImpl#getParameters() <em>Parameter</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.BehavioralFeatureImpl#getParameters()
	 * @generated NOT
	 */
	public void testGetParameters() {
		getFixture().getFormalParameters().add(UML2Factory.eINSTANCE.createParameter());
		getFixture().getFormalParameters().add(UML2Factory.eINSTANCE.createParameter());

		getFixture().getReturnResults().add(UML2Factory.eINSTANCE.createParameter());
		getFixture().getReturnResults().add(UML2Factory.eINSTANCE.createParameter());

		assertTrue(getFixture().getParameters().containsAll(getFixture().getFormalParameters()));
		assertTrue(getFixture().getParameters().containsAll(getFixture().getReturnResults()));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.BehavioralFeatureImpl#getFormalParameters() <em>Formal Parameter</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.BehavioralFeatureImpl#getFormalParameters()
	 * @generated
	 */
	public void testGetFormalParameters() {
		// TODO: implement this feature getter test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.BehavioralFeatureImpl#getRaisedExceptions() <em>Raised Exception</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.BehavioralFeatureImpl#getRaisedExceptions()
	 * @generated
	 */
	public void testGetRaisedExceptions() {
		// TODO: implement this feature getter test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.BehavioralFeatureImpl#validateRedefinitionContextValid() <em>Validate Redefinition Context Valid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.BehavioralFeatureImpl#validateRedefinitionContextValid()
	 * @generated
	 */
	public void testValidateRedefinitionContextValid() {
		// TODO: implement this operation test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.BehavioralFeatureImpl#validateRedefinitionConsistent() <em>Validate Redefinition Consistent</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.BehavioralFeatureImpl#validateRedefinitionConsistent()
	 * @generated
	 */
	public void testValidateRedefinitionConsistent() {
		// TODO: implement this operation test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.BehavioralFeatureImpl#isConsistentWith(RedefinableElement) <em>Is Consistent With</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.BehavioralFeatureImpl#isConsistentWith(RedefinableElement)
	 * @generated
	 */
	public void testIsConsistentWith__RedefinableElement() {
		// TODO: implement this operation test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.BehavioralFeatureImpl#isRedefinitionContextValid(RedefinableElement) <em>Is Redefinition Context Valid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.BehavioralFeatureImpl#isRedefinitionContextValid(RedefinableElement)
	 * @generated
	 */
	public void testIsRedefinitionContextValid__RedefinableElement() {
		// TODO: implement this operation test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.BehavioralFeatureImpl#getRedefinedElements() <em>Get Redefined Elements</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.BehavioralFeatureImpl#getRedefinedElements()
	 * @generated NOT
	 */
	public void testGetRedefinedElements() {
		setUpRedefinedElements();

		for (Iterator redefinedElements = getFixture().getRedefinedElements().iterator(); redefinedElements.hasNext();) {
			assertTrue(RedefinableElement.class.isInstance(redefinedElements.next()));
		}
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.BehavioralFeatureImpl#isDistinguishableFrom(NamedElement, Namespace) <em>Is Distinguishable From</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.BehavioralFeatureImpl#isDistinguishableFrom(NamedElement, Namespace)
	 * @generated
	 */
	public void testIsDistinguishableFrom__NamedElement_Namespace() {
		// TODO: implement this operation test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.BehavioralFeatureImpl#getMembers() <em>Get Members</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.BehavioralFeatureImpl#getMembers()
	 * @generated NOT
	 */
	public void testGetMembers() {
		super.testGetMembers();

		assertTrue(getFixture().getMembers().containsAll(getFixture().getParameters()));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.BehavioralFeatureImpl#getOwnedMembers() <em>Get Owned Members</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.BehavioralFeatureImpl#getOwnedMembers()
	 * @generated NOT
	 */
	public void testGetOwnedMembers() {
		super.testGetOwnedMembers();

		assertTrue(getFixture().getOwnedMembers().containsAll(getFixture().getFormalParameters()));
		assertTrue(getFixture().getOwnedMembers().containsAll(getFixture().getReturnResults()));
	}

	/**
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
