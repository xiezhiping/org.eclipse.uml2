/*
 * Copyright (c) 2003, 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: PackageOperationsTest.java,v 1.2 2005/03/15 18:51:32 khussey Exp $
 */
package org.eclipse.uml2.internal.operation.tests;

import junit.textui.TestRunner;

/**
 * A test case for the '<em><b>Package Operations</b></em>' utility.
 */
public class PackageOperationsTest
	extends UML2OperationsTest {

	public static void main(String[] args) {
		TestRunner.run(PackageOperationsTest.class);
	}

	/**
	 * Constructs a new Package Operations test case with the given name.
	 */
	public PackageOperationsTest(String name) {
		super(name);
	}

	/**
	 * Returns the element for this Package Operations test case.
	 */
	private org.eclipse.uml2.Package getElement() {
		return (org.eclipse.uml2.Package) element;
	}

}