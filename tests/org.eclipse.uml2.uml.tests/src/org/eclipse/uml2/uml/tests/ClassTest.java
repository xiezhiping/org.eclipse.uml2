/*
 * Copyright (c) 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: ClassTest.java,v 1.1 2006/02/21 16:32:28 khussey Exp $
 */
package org.eclipse.uml2.uml.tests;

import junit.textui.TestRunner;

import org.eclipse.uml2.uml.UMLFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Namespace#getOwnedMembers() <em>Owned Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#getOwnedElements() <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#getFeatures() <em>Feature</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#getAttributes() <em>Attribute</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Class#getSuperClasses() <em>Super Class</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Class#getExtensions() <em>Extension</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.BehavioredClassifier#validateClassBehavior(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Class Behavior</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.BehavioredClassifier#createInterfaceRealization(org.eclipse.uml2.uml.Interface) <em>Create Interface Realization</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Class#validatePassiveClass(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Passive Class</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Class#createOwnedOperation(java.lang.String, org.eclipse.uml2.uml.Type, org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList) <em>Create Owned Operation</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Class#isMetaclass() <em>Is Metaclass</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Class#inherit(org.eclipse.emf.common.util.EList) <em>Inherit</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class ClassTest
		extends EncapsulatedClassifierTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ClassTest.class);
	}

	/**
	 * Constructs a new Class test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Class test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private org.eclipse.uml2.uml.Class getFixture() {
		return (org.eclipse.uml2.uml.Class) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp()
			throws Exception {
		setFixture(UMLFactory.eINSTANCE.createClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	protected void tearDown()
			throws Exception {
		setFixture(null);
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Namespace#getOwnedMembers() <em>Owned Member</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Namespace#getOwnedMembers()
	 * @generated
	 */
	public void testGetOwnedMembers() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Element#getOwnedElements() <em>Owned Element</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Element#getOwnedElements()
	 * @generated
	 */
	public void testGetOwnedElements() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Classifier#getFeatures() <em>Feature</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Classifier#getFeatures()
	 * @generated
	 */
	public void testGetFeatures() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Classifier#getAttributes() <em>Attribute</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Classifier#getAttributes()
	 * @generated
	 */
	public void testGetAttributes() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Class#getSuperClasses() <em>Super Class</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Class#getSuperClasses()
	 * @generated
	 */
	public void testGetSuperClasses() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Class#getExtensions() <em>Extension</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Class#getExtensions()
	 * @generated
	 */
	public void testGetExtensions() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.BehavioredClassifier#validateClassBehavior(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Class Behavior</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.BehavioredClassifier#validateClassBehavior(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateClassBehavior__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.BehavioredClassifier#createInterfaceRealization(org.eclipse.uml2.uml.Interface) <em>Create Interface Realization</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.BehavioredClassifier#createInterfaceRealization(org.eclipse.uml2.uml.Interface)
	 * @generated
	 */
	public void testCreateInterfaceRealization__Interface() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Class#validatePassiveClass(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Passive Class</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Class#validatePassiveClass(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidatePassiveClass__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Class#createOwnedOperation(java.lang.String, org.eclipse.uml2.uml.Type, org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList) <em>Create Owned Operation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Class#createOwnedOperation(java.lang.String, org.eclipse.uml2.uml.Type, org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	public void testCreateOwnedOperation__String_Type_EList_EList() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Class#isMetaclass() <em>Is Metaclass</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Class#isMetaclass()
	 * @generated
	 */
	public void testIsMetaclass() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Class#inherit(org.eclipse.emf.common.util.EList) <em>Inherit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Class#inherit(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	public void testInherit__EList() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Classifier#getGenerals() <em>General</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Classifier#getGenerals()
	 * @generated
	 */
	public void testGetGenerals() {
		// TODO: implement this redefined feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}
} //ClassTest
