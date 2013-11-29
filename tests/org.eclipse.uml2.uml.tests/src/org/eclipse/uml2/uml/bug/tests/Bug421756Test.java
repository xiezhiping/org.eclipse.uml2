/*
 * Copyright (c) 2013 Yatta Solutions GmbH and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Manuel Bork <bork@yatta.de> (Yatta Solutions GmbH) - initial API and implementation
 */
package org.eclipse.uml2.uml.bug.tests;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.UMLFactory;

/**
 * Test suite for the changes introduced for Bug 421756.
 * 
 * @see https://bugs.eclipse.org/bugs/show_bug.cgi?id=421756
 */
public class Bug421756Test
		extends TestCase {

	/**
	 * Initializes me with my name.
	 * 
	 * @param name
	 *            my name
	 */
	public Bug421756Test(String name) {
		super(name);
	}

	public static Test suite() {
		return new TestSuite(Bug421756Test.class, "Bug 421756 tests"); //$NON-NLS-1$
	}

	public void test_DeleteEnumerationLiteral() {

		Enumeration enumeration = UMLFactory.eINSTANCE.createEnumeration();
		EnumerationLiteral literal = enumeration.createOwnedLiteral(getName());

		literal.destroy();
	}

}
