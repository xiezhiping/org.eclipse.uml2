/*
 * Copyright (c) 2013, 2014 CEA and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Christian W. Damus (CEA) - initial API and implementation
 *   Christian W. Damus (CEA) - 409396, 403365, 300957, 405061, 401682, 176998, 180744, 403374, 420338, 405065, 332057, 431342, 433149, 437977
 *   Manuel Bork <bork@yatta.de> (Yatta Solutions GmbH) - 421756, 422000
 *   Kenn Hussey (CEA) - 424895
 *   Christian W. Damus - 444588
 *   
 */
package org.eclipse.uml2.uml.bug.tests;

import org.eclipse.uml2.uml.tests.util.StandaloneSupport;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test suite for regression tests for specific Bugzillas.
 */
public class UMLBugTests
		extends TestSuite {

	/**
	 * Initializes me with my name.
	 * 
	 * @param name
	 *            my name
	 */
	public UMLBugTests(String name) {
		super(name);
	}

	public static Test suite() {
		TestSuite result;

		result = new UMLBugTests("UML Bug Regression Tests"); //$NON-NLS-1$

		result.addTest(Bug392833Test.suite());
		result.addTest(Bug403365Test.suite());
		result.addTest(Bug300957Test.suite());
		result.addTest(Bug405061Test.suite());
		result.addTest(StandaloneSupport.standaloneTestSuite(
			"Bug 401682 tests", Bug401682Test.class)); //$NON-NLS-1$
		result.addTest(Bug409396Test.suite());
		result.addTest(Bug176998Test.suite());
		result.addTest(Bug421756Test.suite());
		result.addTest(Bug422000Test.suite());
		result.addTest(Bug180744Test.suite());
		result.addTest(Bug403374Test.suite());
		result.addTest(Bug416833Test.suite());
		result.addTest(Bug420338Test.suite());
		result.addTest(Bug405065Test.suite());
		result.addTest(Bug424895Test.suite());
		result.addTest(Bug431342Test.suite());
		result.addTest(Bug433149Test.suite());
		result.addTest(Bug437977Test.suite());
		result.addTest(Bug444588StereotypesTest.suite());
		result.addTest(Bug444588ProfilesTest.suite());

		// keep this one at the end because it runs long
		result.addTest(Bug332057Test.suite());

		return result;
	}
}
