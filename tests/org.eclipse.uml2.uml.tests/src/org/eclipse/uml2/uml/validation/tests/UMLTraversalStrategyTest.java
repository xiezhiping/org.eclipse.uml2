/*
 * Copyright (c) 2013, 2014 CEA and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Christian W. Damus (CEA) - initial API and implementation
 *   Kenn Hussey (CEA) - 418466
 */
package org.eclipse.uml2.uml.validation.tests;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.validation.service.ITraversalStrategy;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.eclipse.uml2.uml.tests.util.StandaloneSupport;
import org.eclipse.uml2.uml.util.UMLUtil;
import org.eclipse.uml2.uml.validation.UMLTraversalStrategy;

/**
 * Test suite for the {@link UMLTraversalStrategy} class and attendant classes.
 */
public class UMLTraversalStrategyTest
		extends TestCase {

	private ITraversalStrategy fixture;

	private Package model;

	private Class utils;

	/**
	 * Initializes me with my name.
	 * 
	 * @param name
	 *            my name
	 */
	public UMLTraversalStrategyTest(String name) {
		super(name);
	}

	public static Test suite() {
		return new TestSuite(UMLTraversalStrategyTest.class,
			"UML traversal strategy tests"); //$NON-NLS-1$
	}

	public void testTraversalCoversStereotypesFromRootPackage() {
		assertTraversal(model, new Element[]{model, utils});
	}

	public void testTraversalCoversStereotypesFromNestedElement() {
		assertTraversal(utils, new Element[]{utils}, new Element[]{model});
	}

	public void testTraversalCoversStereotypesFromRootNonPackage() {
		// make the Utils class a root
		EcoreUtil.remove(utils);
		model.eResource().getContents().add(utils);

		assertTraversal(utils, new Element[]{utils}, new Element[]{model});
	}

	//
	// Test framework
	//

	@Override
	protected void setUp()
			throws Exception {
		super.setUp();

		fixture = new UMLTraversalStrategy();

		ResourceSet rset = new ResourceSetImpl();
		if (StandaloneSupport.isStandalone()) {
			StandaloneSupport.init(rset);
		}

		Resource res = rset.createResource(URI.createURI("bogus:///model.uml"));
		model = UMLFactory.eINSTANCE.createPackage();
		model.setName("model");
		res.getContents().add(model);

		Profile profile = (Profile) UMLUtil.load(rset,
			URI.createURI(UMLResource.STANDARD_PROFILE_URI),
			UMLPackage.Literals.PROFILE);

		model.applyProfile(profile);
		model.applyStereotype(profile.getOwnedStereotype("ModelLibrary"));

		utils = model.createOwnedClass("Utils", false);
		utils.applyStereotype(profile.getOwnedStereotype("Utility"));
		utils
			.applyStereotype(profile.getOwnedStereotype("ImplementationClass"));
	}

	@Override
	protected void tearDown()
			throws Exception {

		ResourceSet rset = model.eResource().getResourceSet();
		for (Resource next : rset.getResources()) {
			next.unload();
		}
		rset.getResources().clear();
		rset.eAdapters().clear();

		model = null;
		fixture = null;

		super.tearDown();
	}

	EObject requireApplication(Element element, Stereotype stereotype) {
		EObject result = element.getStereotypeApplication(stereotype);
		assertNotNull("Stereotype not applied", result);
		return result;
	}

	void assertTraversal(Element root, Element[] required) {
		assertTraversal(root, required, new Element[0]);
	}

	void assertTraversal(Element root, Element[] required, Element[] forbidden) {
		List<Element> expectedTraversal = Arrays.asList(required);
		Set<EObject> unexpected = new java.util.HashSet<EObject>(
			Arrays.asList(forbidden));
		for (Element next : forbidden) {
			unexpected.addAll(next.getStereotypeApplications());
		}

		PushBackIterator<Element> expected = new PushBackIterator<Element>(
			expectedTraversal.iterator());

		fixture.startTraversal(Collections.singleton(root),
			new NullProgressMonitor());
		while (expected.hasNext()) {
			assertTrue("Traversal has too few elements", fixture.hasNext());

			Element next = expected.next();
			EObject actual = fixture.next();

			assertFalse("Traversal includes a forbidden element",
				unexpected.contains(actual));

			if (next != actual) {
				// compare it with the next one, then
				expected.pushBack(next);
			} else {
				// now grab its stereotype applications, which are in
				// non-deterministic order
				Set<EObject> stereotypeApplications = new java.util.HashSet<EObject>(
					next.getStereotypeApplications());
				while (!stereotypeApplications.isEmpty()) {
					assertTrue("Traversal has too few elements",
						fixture.hasNext());
					assertTrue(
						"Traversal did not provide a stereotype application",
						stereotypeApplications.remove(fixture.next()));
				}
			}
		}
	}

	static final class PushBackIterator<E>
			implements Iterator<E> {

		private final Iterator<E> delegate;

		private E pushedBack;

		PushBackIterator(Iterator<E> delegate) {
			this.delegate = delegate;
		}

		public boolean hasNext() {
			return (pushedBack != null) || delegate.hasNext();
		}

		public E next() {
			E result = pushedBack;

			if (result == null) {
				result = delegate.next();
			} else {
				pushedBack = null;
			}

			return result;
		}

		public void pushBack(E element) {
			if (pushedBack != null) {
				throw new IllegalStateException(
					"already pushed an element back");
			} else if (element == null) {
				throw new IllegalArgumentException("cannot push null back");
			}
		}

		public void remove() {
			throw new UnsupportedOperationException("remove");
		}
	}
}
