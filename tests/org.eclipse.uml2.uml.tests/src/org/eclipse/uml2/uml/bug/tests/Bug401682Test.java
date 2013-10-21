/*
 * Copyright (c) 2013 CEA and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Christian W. Damus (CEA) - initial API and implementation
 */
package org.eclipse.uml2.uml.bug.tests;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.uml2.common.util.UML2Util;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.eclipse.uml2.uml.resources.ResourcesPlugin;
import org.eclipse.uml2.uml.tests.util.StandaloneSupport;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class Bug401682Test
		extends TestCase {

	private ResourceSet rset;

	/**
	 * Initializes me with my name.
	 * 
	 * @param name
	 *            my name
	 */
	public Bug401682Test(String name) {
		super(name);
	}

	public static Test suite() {
		return new TestSuite(Bug401682Test.class, "Bug 401682 tests"); //$NON-NLS-1$
	}

	public void testAccessResourcesByPathmapURI() {
		assertModel(UMLResource.ECORE_METAMODEL_URI);
		assertProfile(UMLResource.ECORE_PROFILE_URI);
		assertModel(UMLResource.ECORE_PRIMITIVE_TYPES_LIBRARY_URI);
	}

	public void testAccessResourcesByPlatformPluginURI() {
		assertModel(String.format(
			"platform:/plugin/%s/metamodels/Ecore.metamodel.uml",
			ResourcesPlugin.PLUGIN_ID));
		assertProfile(String.format(
			"platform:/plugin/%s/profiles/Ecore.profile.uml",
			ResourcesPlugin.PLUGIN_ID));
		assertModel(String.format(
			"platform:/plugin/%s/libraries/EcorePrimitiveTypes.library.uml",
			ResourcesPlugin.PLUGIN_ID));
	}

	public void testAccessResourcesByPlatformResourceURI() {
		assertModel(String.format(
			"platform:/resource/%s/metamodels/Ecore.metamodel.uml",
			ResourcesPlugin.PLUGIN_ID));
		assertProfile(String.format(
			"platform:/resource/%s/profiles/Ecore.profile.uml",
			ResourcesPlugin.PLUGIN_ID));
		assertModel(String.format(
			"platform:/resource/%s/libraries/EcorePrimitiveTypes.library.uml",
			ResourcesPlugin.PLUGIN_ID));
	}

	//
	// Test framework
	//

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

		for (Resource next : rset.getResources()) {
			next.unload();
		}

		rset.getResources().clear();
		rset.eAdapters().clear();
		rset = null;
	}

	void assertModel(String uri) {
		assertPackage(uri, Model.class);
	}

	void assertProfile(String uri) {
		assertPackage(uri, Profile.class);
	}

	void assertPackage(String uri, Class<? extends Package> packageType) {
		Package pkg = UML2Util.load(rset, URI.createURI(uri, true),
			UMLPackage.Literals.PACKAGE);
		assertNotNull("Resource not load", pkg);
		assertTrue(packageType.isInstance(pkg));
	}
}
