/*
 * Copyright (c) 2013 CEA and others.
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

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Extension;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.eclipse.uml2.uml.tests.util.StandaloneSupport;

/**
 * Tests that illegal-argument exceptions from the API for application and
 * unapplication of stereotypes convey more than just the stereotype name.
 */
public class Bug300957Test
		extends TestCase {

	private ResourceSet rset;

	private Element fixture;

	private Profile profile;

	private Stereotype stereo;

	private Extension extension;

	public Bug300957Test() {
		super();
	}

	public Bug300957Test(String name) {
		super(name);
	}

	public static Test suite() {
		return new TestSuite(Bug300957Test.class, "Bug 300957 tests"); //$NON-NLS-1$
	}

	//
	// Tests
	//

	public void testApply_stereoNull() {
		try {
			fixture.applyStereotype(null);
			fail("Should not have applied the stereotype.");
		} catch (IllegalArgumentException e) {
			checkException(e);
		}
	}

	public void testApply_stereoNotInAProfile() {
		applyProfile(true);

		EcoreUtil.remove(stereo);

		try {
			fixture.applyStereotype(stereo);
			fail("Should not have applied the stereotype.");
		} catch (IllegalArgumentException e) {
			checkException(e);

			// and test the non-required access
			assertNull(PrivateElementOperations.getDefinition(fixture, stereo));
		} finally {
			// clean up the CacheAdapter
			stereo.destroy();
		}
	}

	public void testApply_profileNotApplied() {
		defineProfile();

		try {
			fixture.applyStereotype(stereo);
			fail("Should not have applied the stereotype.");
		} catch (IllegalArgumentException e) {
			checkException(e);

			// and test the non-required access
			assertNull(PrivateElementOperations.getDefinition(fixture, stereo));
		}
	}

	public void testApply_stereoNotDefined() {
		EcoreUtil.remove(stereo);
		applyProfile(true);
		profile.getOwnedStereotypes().add(stereo);

		try {
			fixture.applyStereotype(stereo);
			fail("Should not have applied the stereotype.");
		} catch (IllegalArgumentException e) {
			checkException(e);

			// and test the non-required access
			assertNull(PrivateElementOperations.getDefinition(fixture, stereo));
		}
	}

	public void testApply_definitionAbstract() {
		stereo.setIsAbstract(true);
		applyProfile(true);

		try {
			fixture.applyStereotype(stereo);
			fail("Should not have applied the stereotype.");
		} catch (IllegalArgumentException e) {
			checkException(e);

			// and test the non-required access
			assertNull(PrivateElementOperations.getDefinition(fixture, stereo));
		}
	}

	public void testApply_noExtension() {
		extension.destroy();
		applyProfile(true);

		try {
			fixture.applyStereotype(stereo);
			fail("Should not have applied the stereotype.");
		} catch (IllegalArgumentException e) {
			checkException(e);
		}
	}

	public void testApply_alreadyApplied() {
		applyStereotype();

		try {
			fixture.applyStereotype(stereo);
			fail("Should not have applied the stereotype.");
		} catch (IllegalArgumentException e) {
			checkException(e);
		}
	}

	public void testUnapply_stereoNull() {
		applyStereotype();

		try {
			fixture.unapplyStereotype(null);
			fail("Should not have unapplied the stereotype.");
		} catch (IllegalArgumentException e) {
			checkException(e);
		}
	}

	public void testUnapply_requiredExtension() {
		// make the extension required
		extension.getOwnedEnds().get(0).setLower(1);

		// this implicitly applies the required extension
		applyProfile(true);

		try {
			fixture.unapplyStereotype(stereo);
			fail("Should not have unapplied the stereotype.");
		} catch (IllegalArgumentException e) {
			checkException(e);
		}
	}

	public void testUnapply_stereoNotApplied() {
		applyProfile(true);

		try {
			fixture.unapplyStereotype(stereo);
			fail("Should not have unapplied the stereotype.");
		} catch (IllegalArgumentException e) {
			checkException(e);
		}
	}

	public void testApplyProfile_null() {
		try {
			fixture.getNearestPackage().applyProfile(null);
			fail("Should not have applied the profile.");
		} catch (IllegalArgumentException e) {
			checkProfileException(e);
		}
	}

	public void testApplyProfile_notDefined() {
		try {
			fixture.getNearestPackage().applyProfile(profile);
			fail("Should not have applied the profile.");
		} catch (IllegalArgumentException e) {
			checkProfileException(e);
		}
	}

	public void testUnapplyProfile_null() {
		try {
			fixture.getNearestPackage().unapplyProfile(null);
			fail("Should not have applied the profile.");
		} catch (IllegalArgumentException e) {
			checkProfileException(e);
		}
	}

	public void testUnapplyProfile_notApplied() {
		try {
			fixture.getNearestPackage().unapplyProfile(profile);
			fail("Should not have applied the profile.");
		} catch (IllegalArgumentException e) {
			checkProfileException(e);
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
		}

		Resource res = rset.createResource(URI.createURI("bogus:///test.uml"));

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
		extension = stereo.createExtension(metaclass, false);

		// don't apply or define the profile! Some tests need to tweak it,
		// first, or even not define it
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

	protected void defineProfile() {
		profile.define();
	}

	protected void applyProfile(boolean defineIfNecessary) {
		if (defineIfNecessary && !profile.isDefined()) {
			profile.define();
		}

		if (fixture.getNearestPackage().getProfileApplication(profile, true) == null) {
			fixture.getNearestPackage().applyProfile(profile);
		}
	}

	protected void applyStereotype() {
		applyProfile(true);

		try {
			fixture.applyStereotype(stereo);
		} catch (IllegalArgumentException e) {
			fail("Should have applied the stereotype: "
				+ e.getLocalizedMessage());
		}
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

	protected void checkException(Exception e) {
		String message = e.getLocalizedMessage();

		assertFalse("No message in exception",
			(message == null) || (message.length() == 0));
		assertFalse("Message says 'null'", message.equals("null"));
		assertFalse("Message is just the stereotype name",
			message.equals(stereo.getName()));
		assertFalse("Message is just the stereotype string representation",
			message.equals(String.valueOf(stereo)));
	}

	protected void checkProfileException(Exception e) {
		String message = e.getLocalizedMessage();

		assertFalse("No message in exception",
			(message == null) || (message.length() == 0));
		assertFalse("Message says 'null'", message.equals("null"));
		assertFalse("Message is just the profile name",
			message.equals(profile.getName()));
		assertFalse("Message is just the profile string representation",
			message.equals(String.valueOf(profile)));
	}

	@SuppressWarnings("restriction")
	private static class PrivateElementOperations
			extends org.eclipse.uml2.uml.internal.operations.ElementOperations {

		protected static EClass getDefinition(Element element,
				Stereotype stereotype) {
			return org.eclipse.uml2.uml.internal.operations.ElementOperations
				.getDefinition(element, stereotype);
		}
	}
}
