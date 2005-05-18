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
 * $Id: UML2AllTests.java,v 1.2 2005/05/18 17:04:27 khussey Exp $
 */
package org.eclipse.uml2.tests;

import org.eclipse.uml2.internal.operation.tests.ClassifierOperationsTest;
import org.eclipse.uml2.internal.operation.tests.ElementOperationsTest;
import org.eclipse.uml2.internal.operation.tests.MultiplicityElementOperationsTest;
import org.eclipse.uml2.internal.operation.tests.NamespaceOperationsTest;
import org.eclipse.uml2.internal.operation.tests.ParameterOperationsTest;
import org.eclipse.uml2.internal.operation.tests.ProfileOperationsTest;
import org.eclipse.uml2.internal.operation.tests.PropertyOperationsTest;
import org.eclipse.uml2.internal.operation.tests.StereotypeOperationsTest;
import org.eclipse.uml2.internal.operation.tests.TypeOperationsTest;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>UML2</b></em>' model.
 * <!-- end-user-doc -->
 * @generated
 */
public class UML2AllTests extends TestSuite {
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
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suiteGen() {
		TestSuite suite = new UML2AllTests("UML2 Tests"); //$NON-NLS-1$
		suite.addTest(UML2Tests.suite());
		return suite;
	}

	public static Test suite() {
		TestSuite suite = (TestSuite) suiteGen();
		suite.addTestSuite(ElementOperationsTest.class);
		suite.addTestSuite(ClassifierOperationsTest.class);
		suite.addTestSuite(MultiplicityElementOperationsTest.class);
		suite.addTestSuite(NamespaceOperationsTest.class);
		suite.addTestSuite(ParameterOperationsTest.class);
		suite.addTestSuite(ProfileOperationsTest.class);
		suite.addTestSuite(PropertyOperationsTest.class);
		suite.addTestSuite(StereotypeOperationsTest.class);
		suite.addTestSuite(TypeOperationsTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UML2AllTests(String name) {
		super(name);
	}

} //UML2AllTests
