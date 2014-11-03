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

import java.util.ArrayList;
import java.util.List;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.eclipse.emf.common.util.URI;
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
import org.eclipse.uml2.uml.util.UMLUtil.ProfileApplicationHelper;

public class Bug444588ProfilesTest
		extends TestCase {

	private ResourceSet rset;

	private Element fixture;

	private Profile profile;

	private Stereotype stereo;

	public Bug444588ProfilesTest() {
		super();
	}

	public Bug444588ProfilesTest(String name) {
		super(name);
	}

	public static Test suite() {
		return new TestSuite(Bug444588ProfilesTest.class,
			"Bug 444588 tests for Profile Applications"); //$NON-NLS-1$
	}

	//
	// Tests
	//

	/**
	 * Test the case of a resource-set helper.
	 */
	public void test_applyStereotype_withCompanionResource() {
		CompanionResourcePAHelper.createCompanion(fixture.getNearestPackage(),
			profile);

		EObject application = fixture.applyStereotype(stereo);

		assertNotNull("No stereotype application created", application);
		assertTrue("Stereotype not known to be applicable",
			fixture.isStereotypeApplicable(stereo));
	}

	/**
	 * Ensure continued support for operation in the usual UML way.
	 */
	public void test_applyStereotype_withoutCompanionResource() {
		fixture.getNearestPackage().applyProfile(profile);

		EObject application = fixture.applyStereotype(stereo);

		assertNotNull("No stereotype application created", application);
		assertTrue("Stereotype not known to be applicable",
			fixture.isStereotypeApplicable(stereo));
	}

	/**
	 * Ensure that a stereotype is not applicable if the companion resource is
	 * not available.
	 */
	public void test_applyStereotype_companionNotAvailable() {
		final Package companion = CompanionResourcePAHelper.createCompanion(
			fixture.getNearestPackage(), profile);
		final Resource companionResource = companion.eResource();

		EObject application = fixture.applyStereotype(stereo);

		assertNotNull("No stereotype application created", application);
		assertTrue("Stereotype not known to be applied",
			fixture.isStereotypeApplied(stereo));

		// Eliminate the companion
		companionResource.unload();
		companionResource.getResourceSet().getResources()
			.remove(companionResource);

		assertFalse("Stereotype is applicable",
			fixture.isStereotypeApplicable(stereo));
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

		ProfileApplicationHelper.setInstance(rset,
			new CompanionResourcePAHelper());

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

	static class CompanionResourcePAHelper
			extends ProfileApplicationHelper {

		static Package createCompanion(Package package_, Profile... profile) {
			Resource modelResource = package_.eResource();
			ResourceSet resourceSet = modelResource.getResourceSet();
			URI companionURI = modelResource.getURI().trimFileExtension()
				.appendFileExtension("profiles.xmi");
			Resource companionResource = resourceSet.createResource(
				companionURI, UMLPackage.eCONTENT_TYPE);

			Package result = UMLFactory.eINSTANCE.createPackage();
			result.setName("companion");
			companionResource.getContents().add(result);
			for (Profile next : profile) {
				result.applyProfile(next);
			}

			return result;
		}

		@Override
		public Iterable<Package> getOtherApplyingPackages(Package package_) {
			Resource modelResource = package_.eResource();
			ResourceSet resourceSet = (modelResource == null)
				? null
				: modelResource.getResourceSet();
			if (resourceSet != null) {
				URI companionURI = modelResource.getURI().trimFileExtension()
					.appendFileExtension("profiles.xmi");

				try {
					Resource companionResource = resourceSet.getResource(
						companionURI, false);

					if (companionResource != null) {
						List<Package> result = new ArrayList<Package>();

						for (Package next : super
							.getOtherApplyingPackages(package_)) {
							result.add(next);
						}
						for (Object next : EcoreUtil.getObjectsByType(
							companionResource.getContents(),
							UMLPackage.Literals.PACKAGE)) {
							result.add((Package) next);
						}

						return result;
					}
				} catch (Exception e) {
					// Doesn't exist. Fine
				}

			}

			return super.getOtherApplyingPackages(package_);
		}
	}
}
