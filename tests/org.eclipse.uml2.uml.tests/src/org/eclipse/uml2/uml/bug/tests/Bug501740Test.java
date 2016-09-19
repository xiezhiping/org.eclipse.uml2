/*
 * Copyright (c) 2016 Christian W. Damus and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Christian W. Damus - initial API and implementation
 *
 */
package org.eclipse.uml2.uml.bug.tests;

import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.UML2Util;
import org.eclipse.uml2.uml.Artifact;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.profile.standard.StandardPackage;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.eclipse.uml2.uml.tests.util.StandaloneSupport;
import org.eclipse.uml2.uml.tests.util.Stopwatch;
import org.eclipse.uml2.uml.util.UMLUtil.StereotypeApplicationHelper;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Tests the performance of operations on stereotype applications from static
 * profiles.
 * 
 * @see https://bugs.eclipse.org/bugs/show_bug.cgi?id=501740
 */
public class Bug501740Test
		extends TestCase {

	private static final int ITERATIONS = 10;

	private ResourceSet rset;

	private Package fixture;

	public Bug501740Test() {
		super();
	}

	public Bug501740Test(String name) {
		super(name);
	}

	public static Test suite() {
		return new TestSuite(Bug501740Test.class, "Bug 501740 tests"); //$NON-NLS-1$
	}

	public void testCreatingManyStereotypedElements() {
		Stopwatch watch = new Stopwatch();

		for (int i = 0; i < ITERATIONS; i++) {
			watch.start();
			createManyStereotypedElements();
			watch.end();

			// Clean up
			nextIteration();
		}

		watch.log("Creation");
	}

	private void createManyStereotypedElements() {
		for (int i = 0; i < 500; i++) {
			Class class_ = fixture.createOwnedClass(null, false);
			applyStereotype(class_, StandardPackage.Literals.AUXILIARY);

			Artifact artifact = (Artifact) fixture.createPackagedElement(null,
				UMLPackage.Literals.ARTIFACT);
			applyStereotype(artifact, StandardPackage.Literals.EXECUTABLE);

			Package nested = fixture.createNestedPackage(null);
			applyStereotype(nested, StandardPackage.Literals.MODEL_LIBRARY);
		}
	}

	public void testReadingManyStereotypedElements() {
		Stopwatch watch = new Stopwatch();

		// Create a bunch of elements to read
		createManyStereotypedElements();

		for (int i = 0; i < ITERATIONS; i++) {
			watch.start();
			readManyStereotypedElements();
			watch.end();

			// Clean up
			CacheAdapter.getCacheAdapter(fixture).clear();
		}

		watch.log("Reading");
	}

	private void readManyStereotypedElements() {
		for (PackageableElement next : fixture.getPackagedElements()) {
			List<Stereotype> stereos = next.getAppliedStereotypes();
			assertTrue(stereos.size() == 1);
			assertEquals("StandardProfile",
				stereos.get(0).getProfile().getName());
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

		fixture = getTestModel();
	}

	@Override
	protected void tearDown()
			throws Exception {

		fixture = null;

		// clean up the CacheAdapter as well as we can
		for (Resource next : rset.getResources()) {
			next.unload();
			next.eAdapters().clear();
		}

		rset.getResources().clear();
		rset.eAdapters().clear();
	}

	void nextIteration() {
		try {
			tearDown();
			setUp();
		} catch (Exception e) {
			e.printStackTrace();
			fail("Failed to reset for next iteration: " + e.getMessage());
		}
	}

	Package getTestModel() {
		// Just create a small model locally
		Resource resource = UMLResource.Factory.INSTANCE
			.createResource(URI.createURI("test:bug501740"));
		Package result = UMLFactory.eINSTANCE.createPackage();
		result.setName("bug501740");
		resource.getContents().add(result);
		rset.getResources().add(resource);

		// Apply the standard profile, which is statically generated
		Profile std = UML2Util.load(rset,
			URI.createURI(UMLResource.STANDARD_PROFILE_URI),
			UMLPackage.Literals.PROFILE);
		result.applyProfile(std);

		// Apply a stereotype to the package
		applyStereotype(result, StandardPackage.Literals.MODEL_LIBRARY);

		return result;
	}

	protected static EObject applyStereotype(Element element,
			EClass definition) {
		return StereotypeApplicationHelper.getInstance(element)
			.applyStereotype(element, definition);
	}

}
