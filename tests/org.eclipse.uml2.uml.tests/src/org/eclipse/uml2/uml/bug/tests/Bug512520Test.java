/*
 * Copyright (c) 2017 CEA, Christian W. Damus, and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Kenn Hussey (CEA) - Initial API and implementation
 *   Christian W. Damus - 512520
 *   
 */

package org.eclipse.uml2.uml.bug.tests;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.common.util.UML2Util;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.tests.util.StandaloneSupport;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class Bug512520Test
		extends TestCase {

	private ResourceSet rset;

	private ResourceSet rset2;

	public Bug512520Test() {
		super();
	}

	@Override
	protected void setUp()
			throws Exception {

		rset = new ResourceSetImpl();

		if (StandaloneSupport.isStandalone()) {
			StandaloneSupport.init(rset);
		}
	}

	@Override
	protected void tearDown()
			throws Exception {

		dispose(rset);

		if (rset2 != null) {
			dispose(rset2);
		}
	}

	protected void dispose(ResourceSet rset) {
		for (Resource next : rset.getResources()) {
			next.unload();
			next.eAdapters().clear();
		}

		rset.getResources().clear();
		rset.eAdapters().clear();
	}

	public static Test suite() {
		return new TestSuite(Bug512520Test.class, "Bug 512520 tests"); //$NON-NLS-1$
	}

	public void testGetAppliedStereotype() {
		final URI modelURI = URI
			.createURI("pathmap://UML_TEST_MODELS/Bug401804.uml", true);

		//
		// Load the same model twice in different resource sets, first
		//

		Model model1 = UML2Util.load(rset, modelURI, UMLPackage.Literals.MODEL);
		EcoreUtil.resolveAll(rset);
		
		rset2 = new ResourceSetImpl();

		if (StandaloneSupport.isStandalone()) {
			StandaloneSupport.init(rset2);
		}

		Model model2 = UML2Util.load(rset2, modelURI, UMLPackage.Literals.MODEL);
		EcoreUtil.resolveAll(rset2);
		
		//
		// Now, look into the models once everything is loaded and
		// the CacheAdapter is stable
		//

		Type sessionManagerBean1 = model1.getOwnedType("SessionManager");

		Stereotype bean1 = sessionManagerBean1
			.getAppliedStereotype("bug401804::Bean");

		Stereotype specification1 = sessionManagerBean1
			.getAppliedStereotype("StandardProfile::Specification");

		Type sessionManagerBean2 = model2.getOwnedType("SessionManager");

		Stereotype bean2 = sessionManagerBean2
			.getAppliedStereotype("bug401804::Bean");

		Stereotype specification2 = sessionManagerBean2
			.getAppliedStereotype("StandardProfile::Specification");

		assertSame(bean1,
			sessionManagerBean1.getAppliedStereotype("bug401804::Bean"));

		assertNotSame(bean2,
			sessionManagerBean1.getAppliedStereotype("bug401804::Bean"));

		bean1 = sessionManagerBean1.getAppliedStereotype("bug401804::Bean");

		assertSame(specification1, sessionManagerBean1
			.getAppliedStereotype("StandardProfile::Specification"));

		assertNotSame(specification2, sessionManagerBean1
			.getAppliedStereotype("StandardProfile::Specification"));

		specification1 = sessionManagerBean1
			.getAppliedStereotype("StandardProfile::Specification");

		bean2 = sessionManagerBean2.getAppliedStereotype("bug401804::Bean");

		specification2 = sessionManagerBean2
			.getAppliedStereotype("StandardProfile::Specification");

		dispose(rset2);
		rset2 = null;

		assertSame(bean1,
			sessionManagerBean1.getAppliedStereotype("bug401804::Bean"));

		assertNotSame(bean2,
			sessionManagerBean1.getAppliedStereotype("bug401804::Bean"));

		assertSame(specification1, sessionManagerBean1
			.getAppliedStereotype("StandardProfile::Specification"));

		assertNotSame(specification2, sessionManagerBean1
			.getAppliedStereotype("StandardProfile::Specification"));

	}

}
