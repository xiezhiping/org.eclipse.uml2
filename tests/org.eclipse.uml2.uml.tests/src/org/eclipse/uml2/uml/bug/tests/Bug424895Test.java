/*
 * Copyright (c) 2014 CEA and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Kenn Hussey (CEA) - initial API and implementation
 */
package org.eclipse.uml2.uml.bug.tests;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.eclipse.emf.common.util.URI;
import org.eclipse.uml2.uml.RedefinableTemplateSignature;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.resource.UMLResource;

public class Bug424895Test
		extends TestCase {

	/**
	 * Initializes me with my name.
	 * 
	 * @param name
	 *            my name
	 */
	public Bug424895Test(String name) {
		super(name);
	}

	public static Test suite() {
		return new TestSuite(Bug424895Test.class, "Bug 424895 tests"); //$NON-NLS-1$
	}

	public void test_setOwnedTemplateSignature() {
		RedefinableTemplateSignature fixture = UMLFactory.eINSTANCE
			.createRedefinableTemplateSignature();

		try {
			UMLFactory.eINSTANCE.createClass().setOwnedTemplateSignature(
				fixture);
		} catch (Exception e) {
			fail(e.getLocalizedMessage());
		}

		UMLResource.Factory.INSTANCE
			.createResource(URI.createURI("temp://424895.uml")).getContents()
			.add(fixture);

		try {
			UMLFactory.eINSTANCE.createClass().setOwnedTemplateSignature(
				fixture);
		} catch (Exception e) {
			fail(e.getLocalizedMessage());
		}
	}

}
