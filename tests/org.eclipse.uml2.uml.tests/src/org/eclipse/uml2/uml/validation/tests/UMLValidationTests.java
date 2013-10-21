/*
 * Copyright (c) 2012, 2013 CEA and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Christian W. Damus (CEA) - initial API and implementation
 *   Christian W. Damus (CEA) - 397508, 401682
 */
package org.eclipse.uml2.uml.validation.tests;

import org.eclipse.uml2.uml.tests.util.StandaloneSupport;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test suite for the {@code org.eclipse.uml2.uml.validation} package.
 */
public class UMLValidationTests
		extends TestSuite {

	/**
	 * Initializes me with my name.
	 * 
	 * @param name
	 *            my name
	 */
	public UMLValidationTests(String name) {
		super(name);
	}

	public static Test suite() {
		// these tests require an Eclipse instance
		return StandaloneSupport.eclipseTestSuite(
			"UML Validation Tests", //$NON-NLS-1$
			DelegatingConstraintProviderTest.class,
			UMLTraversalStrategyTest.class);
	}
}