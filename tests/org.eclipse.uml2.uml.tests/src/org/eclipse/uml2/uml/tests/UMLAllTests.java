/*
 * Copyright (c) 2005, 2012 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Christian W. Damus (CEA) - 373643
 *   Christian W. Damus - 388240
 *
 */
package org.eclipse.uml2.uml.tests;

import org.eclipse.uml2.uml.UMLPlugin;
import org.eclipse.uml2.uml.resources.util.UMLResourcesUtil;
import org.eclipse.uml2.uml.validation.tests.UMLValidationTests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>UML</b></em>' model.
 * <!-- end-user-doc -->
 * @generated
 */
public class UMLAllTests
		extends TestSuite {

	static {
		if (!UMLPlugin.IS_ECLIPSE_RUNNING) {
			// ensure that EMF knows how to create UML resources
			UMLResourcesUtil.init(null);
		}
	}

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
	 * @generated NOT
	 */
	public static Test suite() {
		TestSuite suite = new UMLAllTests("UML Tests"); //$NON-NLS-1$
		suite.addTest(UMLTests.suite());
		suite.addTest(UMLValidationTests.suite());
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLAllTests(String name) {
		super(name);
	}

} //UMLAllTests
