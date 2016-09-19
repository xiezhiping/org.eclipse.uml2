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

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.UML2Util;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.tests.util.StandaloneSupport;
import org.eclipse.uml2.uml.util.UMLUtil;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Tests that we can more efficiently process profile/stereotype operations
 * on a large number of packages and stereotype applications using the
 * {@link UMLUtil#executeOperation(Runnable)} API.
 * 
 * @see https://bugs.eclipse.org/bugs/show_bug.cgi?id=497359
 */
public class Bug497359Test extends TestCase {

	private ResourceSet rset;

	private Package fixture;

	public Bug497359Test() {
		super();
	}

	public Bug497359Test(String name) {
		super(name);
	}

	public static Test suite() {
		return new TestSuite(Bug497359Test.class, "Bug 497359 tests"); //$NON-NLS-1$
	}

	/**
	 * Verify performance improvement in profile reapplication within
	 * a profile operation context.
	 */
	public void testReapplyProfile() {
		// There is only the one
		final Profile profile = fixture.getAppliedProfiles().get(0);
		
		runProfileOperationExperiment("reapply profile", 10, new Runnable() {
			
			public void run() {
				fixture.applyProfile(profile);
			}
		});
	}

	//
	// Test framework
	//

	@Override
	protected void setUp() throws Exception {

		rset = new ResourceSetImpl();
		if (StandaloneSupport.isStandalone()) {
			StandaloneSupport.init(rset);
		}
		
		// Papyrus and other applications use this option because otherwise
		// the profile-application annotation reference to the applied EPackage
		// isn't set until after root elements are attached, and then because
		// the profile application has no definition when sub-unit root is
		// attached to its container, all of its stereotype applications are
		// destroyed
		rset.getLoadOptions().put(XMLResource.OPTION_DEFER_ATTACHMENT, true);
		rset.getLoadOptions().put(XMLResource.OPTION_DEFER_IDREF_RESOLUTION, true);
		rset.getLoadOptions().put(XMLResource.OPTION_LAX_FEATURE_PROCESSING, Boolean.TRUE);
		rset.getLoadOptions().put(XMLResource.OPTION_RECORD_UNKNOWN_FEATURE, Boolean.TRUE);
		rset.getLoadOptions().put(XMLResource.OPTION_USE_PACKAGE_NS_URI_AS_LOCATION, Boolean.FALSE);

		fixture = getTestModel();
	}

	@Override
	protected void tearDown() throws Exception {

		fixture = null;

		// clean up the CacheAdapter as well as we can
		for (Resource next : rset.getResources()) {
			next.unload();
			next.eAdapters().clear();
		}

		rset.getResources().clear();
		rset.eAdapters().clear();
	}

	Package getTestModel() {
		URL url = getClass().getResource("Bug497359.uml"); //$NON-NLS-1$
		Package result = (Package) UML2Util.load(rset,
			URI.createURI(url.toExternalForm()), UMLPackage.Literals.PACKAGE);
		
		// Load all of the sub-model units and send profile-ish resources
		// to the end of the list
		EcoreUtil.resolveAll(result);
		EList<Resource> resources = rset.getResources();
		int last = resources.size() - 1;
		for (int i = last; i >= 0; i--) {
			if (!resources.get(i).getURI().isPlatform()) {
				resources.move(last, i);
				last = last - 1; // Keep them in the same relative order
			}
		}
		
		return result;
	}

	void runProfileOperationExperiment(String label, int expectedFactor,
			final Runnable operation) {
		
		final int NUM_ITERATIONS = 10;
		
		// Take an average of a few runs on the operation as is
		long withoutPOC = measure(NUM_ITERATIONS, operation);
		
		System.out.printf(
				"Mean time to %s: %02.3fs%n",
				label,
				(double) withoutPOC / 1000.0);

		// Take an average of a few runs on the operation in context
		long withPOC = measure(NUM_ITERATIONS, new Runnable() {
			
			public void run() {
				UMLUtil.executeOperation(operation);
			}
		});

		System.out.printf(
				"Mean time to %s in context: %02.3fs%n",
				label,
				(double) withPOC / 1000.0);
		
		// Expect at least the expected factor of reduction in time
		assertTrue(String.format(
					"Expected %d times improvement in profile operation context",
					expectedFactor),
				withPOC <= (withoutPOC / expectedFactor));
	}
	
	long measure(int numSamples, Runnable experiment) {
		List<Long> samples = new ArrayList<Long>();
		
		for (int i = 0; i < numSamples; i++) {
			long start = System.currentTimeMillis();
			experiment.run();
			long end = System.currentTimeMillis();
			
			// Exclude the effects of the CacheAdapter
			CacheAdapter.getInstance().clear();
			
			samples.add(end - start);
		}
		
		// Throw out the extremes
		int min = 0;
		int max = 0;
		for (int i = 1; i < numSamples; i++) {
			if (samples.get(i) < samples.get(min)) {
				min = i;
			}
			if (samples.get(i) > samples.get(max)) {
				max = i;
			}
		}
		if (max > min) {
			samples.remove(max);
			samples.remove(min);
		} else {
			samples.remove(min);
			samples.remove(max);
		}
		
		// Average what's left
		long result = 0;
		for (long sample : samples) {
			result = result + sample;
		}
		result = result / samples.size();
		
		return result;
	}
	
	void walkAllStereotypeApplications(Element element) {
		TreeIterator<EObject> iter = UML2Util.getAllContents(element, true, false);
		while (iter.hasNext()) {
			EObject next = iter.next();
			if (next instanceof Element) {
				// Just get the stereotype applications
				((Element)next).getStereotypeApplications();
			} else {
				// There won't be any UML content in here
				iter.prune();
			}
		}
	}
}
