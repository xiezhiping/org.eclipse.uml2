/*
 * Copyright (c) 2013 CEA and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Christian W. Damus (CEA) - initial API and implementation
 *   Christian W. Damus (CEA) - 403365, 300957, 405061
 */
package org.eclipse.uml2.uml.bug.tests;

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

		return result;
	}
}