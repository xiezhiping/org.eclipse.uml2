/*
 * Copyright (c) 2005, 2013 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Christian W. Damus (CEA) - 373643, 392833, 414572
 *   Christian W. Damus - 388240, 419979
 *
 */
package org.eclipse.uml2.uml.tests;

import org.eclipse.uml2.uml.bug.tests.UMLBugTests;
import org.eclipse.uml2.uml.tests.util.StandaloneSupport;
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
		if (StandaloneSupport.isStandalone()) {
			// ensure that EMF knows how to create UML resources
			StandaloneSupport.initGlobals();
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
		String suiteName = String.format("UML Tests %s", //$NON-NLS-1$
			StandaloneSupport.isStandalone()
				? "stand-alone" //$NON-NLS-1$
				: "in Eclipse"); //$NON-NLS-1$
		TestSuite suite = new UMLAllTests(suiteName);
		suite.addTest(UMLTests.suite());
		suite.addTest(UMLValidationTests.suite());
		suite.addTest(UMLBugTests.suite());
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
