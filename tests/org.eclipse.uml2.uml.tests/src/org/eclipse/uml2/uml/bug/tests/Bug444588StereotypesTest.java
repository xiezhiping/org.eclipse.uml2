/*
 * Copyright (c) 2014 Christian W. Damus and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Christian W. Damus - initial API and implementation
 *   
 */
package org.eclipse.uml2.uml.bug.tests;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.eclipse.uml2.uml.tests.util.StandaloneSupport;
import org.eclipse.uml2.uml.util.UMLUtil.StereotypeApplicationHelper;

public class Bug444588StereotypesTest
		extends TestCase {

	private ResourceSet rset;

	private Element fixture;

	private Profile profile;

	private Stereotype stereo;

	public Bug444588StereotypesTest() {
		super();
	}

	public Bug444588StereotypesTest(String name) {
		super(name);
	}

	public static Test suite() {
		return new TestSuite(Bug444588StereotypesTest.class,
			"Bug 444588 tests for Stereotype Applications"); //$NON-NLS-1$
	}

	//
	// Tests
	//

	/**
	 * Test the case of a resource-set helper.
	 */
	public void test_applyStereotype_withResourceSet() {
		EObject application = fixture.applyStereotype(stereo);

		assertNotNull("No stereotype application created", application);
		assertNotNull("Stereotype application not in a resource",
			application.eResource());
		assertNotSame("Stereotype application created in the model resource",
			fixture.eResource(), application.eResource());
		assertSame("Stereotype application created in the wrong resource set",
			fixture.eResource().getResourceSet(), application.eResource()
				.getResourceSet());

		// Paranoia check (the helper is not involved in finding stereotype
		// applications)
		assertTrue("Stereotype not known to be applied",
			fixture.isStereotypeApplied(stereo));
	}

	/**
	 * Ensure continued support for operation without a resource set.
	 */
	public void test_applyStereotype_withoutResourceSet() {
		// Remove the resource from its resource-set context
		rset.getResources().remove(fixture.eResource());

		try {
			EObject application = fixture.applyStereotype(stereo);

			assertNotNull("No stereotype application created", application);
			assertNotNull("Stereotype application not in a resource",
				application.eResource());
			assertSame(
				"Stereotype application not created in the model resource",
				fixture.eResource(), application.eResource());

			// Paranoia check (the helper is not involved in finding stereotype
			// applications)
			assertTrue("Stereotype not known to be applied",
				fixture.isStereotypeApplied(stereo));
		} finally {
			// Allow for clean-up
			rset.getResources().add(fixture.eResource());
		}
	}

	/**
	 * Ensure continued support for operation without a resource at all.
	 */
	public void test_applyStereotype_withoutResource() {
		// Remove the model from its resource
		final EObject root = EcoreUtil.getRootContainer(fixture);
		final Resource resource = root.eResource();
		resource.getContents().remove(root);

		EObject application = null;
		try {
			application = fixture.applyStereotype(stereo);

			assertNotNull("No stereotype application created", application);
			assertNull("Stereotype application is in a resource",
				application.eResource());

			// Paranoia check (the helper is not involved in finding stereotype
			// applications)
			assertTrue("Stereotype not known to be applied",
				fixture.isStereotypeApplied(stereo));
		} finally {
			// Allow for clean-up
			resource.getContents().add(root);
			if (application != null) {
				resource.getContents().add(application);
			}
		}
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
			rset.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put("xmi", new XMIResourceFactoryImpl());
		}

		StereotypeApplicationHelper.setInstance(rset,
			new CompanionResourceSAHelper());

		Resource res = rset.createResource(URI
			.createURI("bogus://uml/test/test.uml"));

		Package pkg = UMLFactory.eINSTANCE.createPackage();
		pkg.setName("pkg");
		res.getContents().add(pkg);

		fixture = pkg.createOwnedClass("Foo", false);

		profile = UMLFactory.eINSTANCE.createProfile();
		profile.setName("profile");
		profile.setURI("http://www.eclipse.org/bogus/schema/2013/profile");
		res.getContents().add(profile);

		Class metaclass = getMetaclass("Class");
		profile.createMetaclassReference(metaclass);
		stereo = profile.createOwnedStereotype("test", false);
		stereo.createExtension(metaclass, false);

		profile.define();
		pkg.applyProfile(profile);
	}

	@Override
	protected void tearDown()
			throws Exception {

		// clean up the CacheAdapter as well as we can
		for (Resource next : rset.getResources()) {
			next.unload();
			next.eAdapters().clear();
		}

		rset.getResources().clear();
		rset.eAdapters().clear();
	}

	protected Class getMetaclass(String name) {
		Resource res = rset.getResource(
			URI.createURI(UMLResource.UML_METAMODEL_URI), true);
		assertNotNull("Could not find UML metamodel", res);
		assertTrue("Could not load UML metamodel", res.isLoaded());

		Package uml = (Package) EcoreUtil.getObjectByType(res.getContents(),
			UMLPackage.Literals.PACKAGE);
		assertNotNull(uml);

		return (Class) uml.getOwnedType(name);
	}

	static class CompanionResourceSAHelper
			extends StereotypeApplicationHelper {

		@Override
		protected EList<EObject> getContainmentList(Element element,
				EClass definition) {

			Resource companionResource = null;

			Resource modelResource = element.eResource();
			if (modelResource != null) {
				ResourceSet rset = modelResource.getResourceSet();
				if (rset != null) {
					URI companionURI = modelResource.getURI()
						.trimFileExtension()
						.appendFileExtension("stereotypes.xmi");

					try {
						companionResource = rset
							.getResource(companionURI, true);
					} catch (Exception e) {
						// Doesn't exist. Create it, next
					}

					if (companionResource == null) {
						companionResource = rset.createResource(companionURI);
					}
				}
			}

			return (companionResource != null)
				? companionResource.getContents()
				: super.getContainmentList(element, definition);
		}
	}
}
