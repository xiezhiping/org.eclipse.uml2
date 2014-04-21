/*
 * Copyright (c) 2014 CEA and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Christian W. Damus (CEA) - initial API and implementation
 *
 */
package org.eclipse.uml2.uml.bug.tests;

import java.net.URL;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.uml2.common.util.UML2Util;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.resource.UML402UMLResource;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.eclipse.uml2.uml.tests.util.StandaloneSupport;

/**
 * Regression test for package registry interactions when loading UML 2.4.1
 * models with profiles applied.
 * 
 * @see https://bugs.eclipse.org/bugs/show_bug.cgi?id=433149
 */
public class Bug433149Test
		extends TestCase {

	private ResourceSet rset;

	private ResourceSet rset2;

	private Profile profile;

	private Package model;

	public Bug433149Test() {
		super();
	}

	public Bug433149Test(String name) {
		super(name);
	}

	public static Test suite() {
		return new TestSuite(Bug433149Test.class, "Bug 433149 tests"); //$NON-NLS-1$
	}

	/**
	 * Verify that the applied profile schema does not resolve the identical
	 * EPackage when loading models in different resource sets.
	 */
	public void testProfileNotSharedByResourceSets() {
		EObject stereo = getClass(model, "Foo").getStereotypeApplications()
			.get(0);

		Package model2 = getTestModel(rset2);
		EObject stereo2 = getClass(model2, "Foo").getStereotypeApplications()
			.get(0);

		assertNotSame(stereo.eClass(), stereo2.eClass());
	}

	/**
	 * Verify that we can migrate stereotype applications by re-applying the
	 * profile in a model that was loaded in a different resource set than
	 * another model in which we first loaded the profile.
	 */
	public void testProfileMigrationInOtherResourceSets() {
		// Migrate the first model
		model.applyProfile(profile);
		EObject stereo = getClass(model, "Foo").getStereotypeApplications()
			.get(0);
		assertNotNull("Stereotype instance does not have the new attribute",
			stereo.eClass().getEStructuralFeature("addedInNewVersion"));

		// Migrate a second model
		Package model2 = getTestModel(rset2);
		Profile profile2 = model2.getProfileApplications().get(0)
			.getAppliedProfile();
		model2.applyProfile(profile2);
		EObject stereo2 = getClass(model2, "Foo").getStereotypeApplications()
			.get(0);
		assertNotNull("Stereotype instance does not have the new attribute",
			stereo2.eClass().getEStructuralFeature("addedInNewVersion"));
	}

	//
	// Test framework
	//

	@Override
	protected void setUp()
			throws Exception {

		rset = createResourceSet();
		model = getTestModel(rset);
		profile = model.getProfileApplications().get(0).getAppliedProfile();

		rset2 = createResourceSet();
	}

	@Override
	protected void tearDown()
			throws Exception {

		dispose(rset);
		dispose(rset2);

		rset = null;
		rset2 = null;
		profile = null;
		model = null;
	}

	ResourceSet createResourceSet() {
		ResourceSet result = new ResourceSetImpl();
		if (StandaloneSupport.isStandalone()) {
			StandaloneSupport.init(result);
		}

		// These resources are UML 2.4.1 schema (UML2 4.0.2)
		result
			.getResourceFactoryRegistry()
			.getExtensionToFactoryMap()
			.put(UMLResource.FILE_EXTENSION, UML402UMLResource.Factory.INSTANCE);

		return result;
	}

	void dispose(ResourceSet rset) {
		// clean up the CacheAdapter as well as we can
		for (Resource next : rset.getResources()) {
			next.unload();
			next.eAdapters().clear();
		}

		rset.getResources().clear();
		rset.eAdapters().clear();
	}

	Class getClass(Package package_, String name) {
		return (Class) package_.getOwnedType(name);
	}

	Package getTestModel(ResourceSet rset) {
		URL url = getClass().getResource("Bug433149.uml"); //$NON-NLS-1$
		return (Package) UML2Util.load(rset,
			URI.createURI(url.toExternalForm()), UMLPackage.Literals.PACKAGE);
	}
}
