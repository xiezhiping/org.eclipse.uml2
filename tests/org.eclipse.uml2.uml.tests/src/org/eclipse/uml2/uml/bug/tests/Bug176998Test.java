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

import java.net.URL;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.common.util.UML2Util;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.tests.util.StandaloneSupport;
import org.eclipse.uml2.uml.util.UMLUtil;

/**
 * Tests that the package merger utility correctly updates references from the
 * receiving package to elements in merged packages, to reference instead the
 * results of those merges.
 * 
 * @see https://bugs.eclipse.org/bugs/show_bug.cgi?id=176998
 */
public class Bug176998Test
		extends TestCase {

	private ResourceSet rset;

	private Package fixture;

	public Bug176998Test() {
		super();
	}

	public Bug176998Test(String name) {
		super(name);
	}

	public static Test suite() {
		return new TestSuite(Bug176998Test.class, "Bug 176998 tests"); //$NON-NLS-1$
	}

	/**
	 * Verify that scalar references from the receiving package to elements in a
	 * merged package are updated to reference their counterparts in the merge
	 * result.
	 */
	public void testScalarReferencesToMergeResultsFromMergingPackage() {
		merge();

		Class classA = (Class) fixture.getOwnedType("A");
		Property b = classA.getOwnedAttribute("b", null);
		Class classB = (Class) fixture.getOwnedType("B");

		assertSame("Reference is not to merge result", classB, b.getType());
	}

	/**
	 * Verify that collection-valued references from the receiving package to
	 * elements in a merged package are updated to reference their counterparts
	 * in the merge result.
	 */
	public void testCollectionReferencesToMergeResultsFromMergingPackage() {
		Package merged = merge();

		Dependency dependency = (Dependency) fixture
			.getPackagedElement("dependency");
		Type classA = fixture.getOwnedType("A");
		Type classB = fixture.getOwnedType("B");
		Type classC = merged.getNestingPackage().getNestedPackage("not-merged")
			.getOwnedType("C");

		assertTrue("Reference is not to merge result", dependency
			.getSuppliers().contains(classA));
		assertTrue("Reference is not to merge result", dependency
			.getSuppliers().contains(classB));
		assertTrue("Reference is not to unmerged element", dependency
			.getSuppliers().contains(classC));
		assertEquals("Wrong number of suppliers", 3, dependency.getSuppliers()
			.size());
	}

	/**
	 * Verify that references from the receiving package to elements in a
	 * package that is not merged are not altered by the merge.
	 */
	public void testReferencesToUnmergedElementsFromMergingPackage() {
		merge();

		Class classA = (Class) fixture.getOwnedType("A");
		Property c = classA.getOwnedAttribute("c", null);
		Type classC = c.getType();

		assertNotNull("Reference was lost", classC);
		assertNotSame("Class C should not have been merged", fixture,
			classC.getNearestPackage());
		assertEquals("Class C is in the wrong package", "merged::not-merged",
			classC.getNearestPackage().getQualifiedName());
	}

	/**
	 * Verify that references from elements in the merged package to other
	 * elements in the merged package are merged as references to the
	 * corresponding merge results.
	 */
	public void testReferencesToMergeResultsFromMergedPackage() {
		merge();

		Class classA = (Class) fixture.getOwnedType("A");
		Class classB = (Class) fixture.getOwnedType("B");
		Property otherB = classB.getOwnedAttribute("otherB", null);
		Property a = classB.getOwnedAttribute("a", null);

		assertSame("Reference is not to merge result", classB, otherB.getType());
		assertSame("Reference is not to merge result", classA, a.getType());
	}

	/**
	 * Verify that the merge result has no references remaining to elements in
	 * the merged package (ignoring any potential traceability annotations).
	 */
	public void testNoReferencesToMergedElements() {
		Package merged = merge();

		for (TreeIterator<EObject> iter = fixture.eResource().getAllContents(); iter
			.hasNext();) {
			EObject next = iter.next();

			// skip annotations
			if (next instanceof EAnnotation) {
				iter.prune();
			} else {
				for (EObject xref : next.eCrossReferences()) {
					assertFalse(
						"Merge result references an element from the merged package",
						EcoreUtil.isAncestor(merged, xref));
				}
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

	Package getTestModel() {
		URL url = getClass().getResource("Bug176998-merging.uml"); //$NON-NLS-1$
		return (Package) UML2Util.load(rset,
			URI.createURI(url.toExternalForm()), UMLPackage.Literals.PACKAGE);
	}

	Package merge() {
		// the result is the merged package
		Package result = fixture.getPackageMerges().get(0).getMergedPackage();

		UMLUtil.merge(fixture, null);

		return result;
	}
}
