/*
 * Copyright (c) 2013 CEA and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Kenn Hussey (CEA) - initial API and implementation
 *
 */
package org.eclipse.uml2.uml.bug.tests;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.uml2.common.util.UML2Util;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.AttributeOwner;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.LiteralUnlimitedNatural;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;
import org.eclipse.uml2.uml.tests.util.StandaloneSupport;
import org.eclipse.uml2.uml.util.UMLUtil;
import org.eclipse.uml2.uml.util.UMLUtil.PackageMerger;
import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * Tests the 'ATTRIBUTE_TRANSFORMATIONS' package merger option.
 * 
 * @see https://bugs.eclipse.org/bugs/show_bug.cgi?id=416833
 */
public class Bug416833Test
		extends TestCase {

	private ResourceSet rset;

	private Package fixture;

	public Bug416833Test() {
		super();
	}

	public Bug416833Test(String name) {
		super(name);
	}

	public static Test suite() {
		return new TestSuite(Bug416833Test.class, "Bug 416833 tests"); //$NON-NLS-1$
	}

	public void testIgnore() {
		Package receivingPackage = getPackage("receiving");
		BasicDiagnostic diagnostics = new BasicDiagnostic();

		merge(receivingPackage, diagnostics, UMLUtil.OPTION__IGNORE);
		
		assertNull(getDiagnostic(diagnostics, UMLUtil.PackageMerger.ATTRIBUTE_TRANSFORMATION));

		assertFalse(getAssociation(receivingPackage, "Association_IsDerived_false_false").isDerived());
		assertTrue(getAssociation(receivingPackage, "Association_IsDerived_false_true").isDerived());
		assertTrue(getAssociation(receivingPackage, "Association_IsDerived_true_false").isDerived());
		assertTrue(getAssociation(receivingPackage, "Association_IsDerived_true_true").isDerived());

		assertFalse(getClass(receivingPackage, "Classifier_IsAbstract_false_false").isAbstract());
		assertTrue(getClass(receivingPackage, "Classifier_IsAbstract_false_true").isAbstract());
		assertTrue(getClass(receivingPackage, "Classifier_IsAbstract_true_false").isAbstract());
		assertTrue(getClass(receivingPackage, "Classifier_IsAbstract_true_true").isAbstract());

		assertFalse(getClass(receivingPackage, "Classifier_IsFinalSpecialization_false_false").isFinalSpecialization());
		assertTrue(getClass(receivingPackage, "Classifier_IsFinalSpecialization_false_true").isFinalSpecialization());
		assertTrue(getClass(receivingPackage, "Classifier_IsFinalSpecialization_true_false").isFinalSpecialization());
		assertTrue(getClass(receivingPackage, "Classifier_IsFinalSpecialization_true_true").isFinalSpecialization());

		assertFalse(getProperty(getClass(receivingPackage, "MultiplicityElement_IsOrdered"), "_false_false").isOrdered());
		assertTrue(getProperty(getClass(receivingPackage, "MultiplicityElement_IsOrdered"), "_false_true").isOrdered());
		assertTrue(getProperty(getClass(receivingPackage, "MultiplicityElement_IsOrdered"), "_true_false").isOrdered());
		assertTrue(getProperty(getClass(receivingPackage, "MultiplicityElement_IsOrdered"), "_true_true").isOrdered());

		assertFalse(getProperty(getClass(receivingPackage, "MultiplicityElement_IsUnique"), "_false_false").isUnique());
		assertFalse(getProperty(getClass(receivingPackage, "MultiplicityElement_IsUnique"), "_false_true").isUnique());
		assertFalse(getProperty(getClass(receivingPackage, "MultiplicityElement_IsUnique"), "_true_false").isUnique());
		assertTrue(getProperty(getClass(receivingPackage, "MultiplicityElement_IsUnique"), "_true_true").isUnique());

		assertEquals(0, getProperty(getClass(receivingPackage, "MultiplicityElement_Lower"), "_less").getLower());
		assertEquals(0, getProperty(getClass(receivingPackage, "MultiplicityElement_Lower"), "_equal").getLower());
		assertEquals(0, getProperty(getClass(receivingPackage, "MultiplicityElement_Lower"), "_greater").getLower());

		assertEquals(LiteralUnlimitedNatural.UNLIMITED, getProperty(getClass(receivingPackage, "MultiplicityElement_Upper"), "_less").getUpper());
		assertEquals(LiteralUnlimitedNatural.UNLIMITED, getProperty(getClass(receivingPackage, "MultiplicityElement_Upper"), "_equal").getUpper());
		assertEquals(LiteralUnlimitedNatural.UNLIMITED, getProperty(getClass(receivingPackage, "MultiplicityElement_Upper"), "_greater").getUpper());

		assertEquals(VisibilityKind.PACKAGE_LITERAL, getClass(receivingPackage, "NamedElement_Visibility_package_package").getVisibility());
		assertEquals(VisibilityKind.PRIVATE_LITERAL, getClass(receivingPackage, "NamedElement_Visibility_package_private").getVisibility());
		assertEquals(VisibilityKind.PROTECTED_LITERAL, getClass(receivingPackage, "NamedElement_Visibility_package_protected").getVisibility());
		assertEquals(VisibilityKind.PACKAGE_LITERAL, getClass(receivingPackage, "NamedElement_Visibility_package_public").getVisibility());
		assertEquals(VisibilityKind.PACKAGE_LITERAL, getClass(receivingPackage, "NamedElement_Visibility_private_package").getVisibility());
		assertEquals(VisibilityKind.PRIVATE_LITERAL, getClass(receivingPackage, "NamedElement_Visibility_private_private").getVisibility());
		assertEquals(VisibilityKind.PROTECTED_LITERAL, getClass(receivingPackage, "NamedElement_Visibility_private_protected").getVisibility());
		assertEquals(VisibilityKind.PRIVATE_LITERAL, getClass(receivingPackage, "NamedElement_Visibility_private_public").getVisibility());
		assertEquals(VisibilityKind.PACKAGE_LITERAL, getClass(receivingPackage, "NamedElement_Visibility_protected_package").getVisibility());
		assertEquals(VisibilityKind.PRIVATE_LITERAL, getClass(receivingPackage, "NamedElement_Visibility_protected_private").getVisibility());
		assertEquals(VisibilityKind.PROTECTED_LITERAL, getClass(receivingPackage, "NamedElement_Visibility_protected_protected").getVisibility());
		assertEquals(VisibilityKind.PROTECTED_LITERAL, getClass(receivingPackage, "NamedElement_Visibility_protected_public").getVisibility());
		assertEquals(VisibilityKind.PACKAGE_LITERAL, getClass(receivingPackage, "NamedElement_Visibility_public_package").getVisibility());
		assertEquals(VisibilityKind.PRIVATE_LITERAL, getClass(receivingPackage, "NamedElement_Visibility_public_private").getVisibility());
		assertEquals(VisibilityKind.PROTECTED_LITERAL, getClass(receivingPackage, "NamedElement_Visibility_public_protected").getVisibility());
		assertEquals(VisibilityKind.PUBLIC_LITERAL, getClass(receivingPackage, "NamedElement_Visibility_public_public").getVisibility());

		assertFalse(getProperty(getClass(receivingPackage, "Property_IsDerived"), "_false_false").isDerived());
		assertTrue(getProperty(getClass(receivingPackage, "Property_IsDerived"), "_false_true").isDerived());
		assertTrue(getProperty(getClass(receivingPackage, "Property_IsDerived"), "_true_false").isDerived());
		assertTrue(getProperty(getClass(receivingPackage, "Property_IsDerived"), "_true_true").isDerived());

		assertFalse(getProperty(getClass(receivingPackage, "Property_IsDerivedUnion"), "_false_false").isDerivedUnion());
		assertTrue(getProperty(getClass(receivingPackage, "Property_IsDerivedUnion"), "_false_true").isDerivedUnion());
		assertTrue(getProperty(getClass(receivingPackage, "Property_IsDerivedUnion"), "_true_false").isDerivedUnion());
		assertTrue(getProperty(getClass(receivingPackage, "Property_IsDerivedUnion"), "_true_true").isDerivedUnion());

		assertFalse(getClass(receivingPackage, "RedefinableElement_IsLeaf_false_false").isLeaf());
		assertTrue(getClass(receivingPackage, "RedefinableElement_IsLeaf_false_true").isLeaf());
		assertTrue(getClass(receivingPackage, "RedefinableElement_IsLeaf_true_false").isLeaf());
		assertTrue(getClass(receivingPackage, "RedefinableElement_IsLeaf_true_true").isLeaf());

		assertFalse(getProperty(getClass(receivingPackage, "StructuralFeature_IsReadOnly"), "_false_false").isReadOnly());
		assertTrue(getProperty(getClass(receivingPackage, "StructuralFeature_IsReadOnly"), "_false_true").isReadOnly());
		assertTrue(getProperty(getClass(receivingPackage, "StructuralFeature_IsReadOnly"), "_true_false").isReadOnly());
		assertTrue(getProperty(getClass(receivingPackage, "StructuralFeature_IsReadOnly"), "_true_true").isReadOnly());
	}

	public void testReport() {
		Package receivingPackage = getPackage("receiving");
		BasicDiagnostic diagnostics = new BasicDiagnostic();

		merge(receivingPackage, diagnostics, UMLUtil.OPTION__REPORT);

		Diagnostic diagnostic = getDiagnostic(diagnostics, UMLUtil.PackageMerger.ATTRIBUTE_TRANSFORMATION);

		assertNotNull(diagnostic);
		assertEquals(Diagnostic.WARNING, diagnostic.getSeverity());

		assertFalse(getAssociation(receivingPackage, "Association_IsDerived_false_false").isDerived());
		assertFalse(getAssociation(receivingPackage, "Association_IsDerived_false_true").isDerived());
		assertTrue(getAssociation(receivingPackage, "Association_IsDerived_true_false").isDerived());
		assertTrue(getAssociation(receivingPackage, "Association_IsDerived_true_true").isDerived());

		assertFalse(getClass(receivingPackage, "Classifier_IsAbstract_false_false").isAbstract());
		assertFalse(getClass(receivingPackage, "Classifier_IsAbstract_false_true").isAbstract());
		assertTrue(getClass(receivingPackage, "Classifier_IsAbstract_true_false").isAbstract());
		assertTrue(getClass(receivingPackage, "Classifier_IsAbstract_true_true").isAbstract());

		assertFalse(getClass(receivingPackage, "Classifier_IsFinalSpecialization_false_false").isFinalSpecialization());
		assertFalse(getClass(receivingPackage, "Classifier_IsFinalSpecialization_false_true").isFinalSpecialization());
		assertTrue(getClass(receivingPackage, "Classifier_IsFinalSpecialization_true_false").isFinalSpecialization());
		assertTrue(getClass(receivingPackage, "Classifier_IsFinalSpecialization_true_true").isFinalSpecialization());

		assertFalse(getProperty(getClass(receivingPackage, "MultiplicityElement_IsOrdered"), "_false_false").isOrdered());
		assertFalse(getProperty(getClass(receivingPackage, "MultiplicityElement_IsOrdered"), "_false_true").isOrdered());
		assertTrue(getProperty(getClass(receivingPackage, "MultiplicityElement_IsOrdered"), "_true_false").isOrdered());
		assertTrue(getProperty(getClass(receivingPackage, "MultiplicityElement_IsOrdered"), "_true_true").isOrdered());

		assertFalse(getProperty(getClass(receivingPackage, "MultiplicityElement_IsUnique"), "_false_false").isUnique());
		assertFalse(getProperty(getClass(receivingPackage, "MultiplicityElement_IsUnique"), "_false_true").isUnique());
		assertTrue(getProperty(getClass(receivingPackage, "MultiplicityElement_IsUnique"), "_true_false").isUnique());
		assertTrue(getProperty(getClass(receivingPackage, "MultiplicityElement_IsUnique"), "_true_true").isUnique());

		assertEquals(0, getProperty(getClass(receivingPackage, "MultiplicityElement_Lower"), "_less").getLower());
		assertEquals(0, getProperty(getClass(receivingPackage, "MultiplicityElement_Lower"), "_equal").getLower());
		assertEquals(1, getProperty(getClass(receivingPackage, "MultiplicityElement_Lower"), "_greater").getLower());

		assertEquals(1, getProperty(getClass(receivingPackage, "MultiplicityElement_Upper"), "_less").getUpper());
		assertEquals(LiteralUnlimitedNatural.UNLIMITED, getProperty(getClass(receivingPackage, "MultiplicityElement_Upper"), "_equal").getUpper());
		assertEquals(LiteralUnlimitedNatural.UNLIMITED, getProperty(getClass(receivingPackage, "MultiplicityElement_Upper"), "_greater").getUpper());

		assertEquals(VisibilityKind.PACKAGE_LITERAL, getClass(receivingPackage, "NamedElement_Visibility_package_package").getVisibility());
		assertEquals(VisibilityKind.PACKAGE_LITERAL, getClass(receivingPackage, "NamedElement_Visibility_package_private").getVisibility());
		assertEquals(VisibilityKind.PACKAGE_LITERAL, getClass(receivingPackage, "NamedElement_Visibility_package_protected").getVisibility());
		assertEquals(VisibilityKind.PACKAGE_LITERAL, getClass(receivingPackage, "NamedElement_Visibility_package_public").getVisibility());
		assertEquals(VisibilityKind.PRIVATE_LITERAL, getClass(receivingPackage, "NamedElement_Visibility_private_package").getVisibility());
		assertEquals(VisibilityKind.PRIVATE_LITERAL, getClass(receivingPackage, "NamedElement_Visibility_private_private").getVisibility());
		assertEquals(VisibilityKind.PRIVATE_LITERAL, getClass(receivingPackage, "NamedElement_Visibility_private_protected").getVisibility());
		assertEquals(VisibilityKind.PRIVATE_LITERAL, getClass(receivingPackage, "NamedElement_Visibility_private_public").getVisibility());
		assertEquals(VisibilityKind.PROTECTED_LITERAL, getClass(receivingPackage, "NamedElement_Visibility_protected_package").getVisibility());
		assertEquals(VisibilityKind.PROTECTED_LITERAL, getClass(receivingPackage, "NamedElement_Visibility_protected_private").getVisibility());
		assertEquals(VisibilityKind.PROTECTED_LITERAL, getClass(receivingPackage, "NamedElement_Visibility_protected_protected").getVisibility());
		assertEquals(VisibilityKind.PROTECTED_LITERAL, getClass(receivingPackage, "NamedElement_Visibility_protected_public").getVisibility());
		assertEquals(VisibilityKind.PUBLIC_LITERAL, getClass(receivingPackage, "NamedElement_Visibility_public_package").getVisibility());
		assertEquals(VisibilityKind.PUBLIC_LITERAL, getClass(receivingPackage, "NamedElement_Visibility_public_private").getVisibility());
		assertEquals(VisibilityKind.PUBLIC_LITERAL, getClass(receivingPackage, "NamedElement_Visibility_public_protected").getVisibility());
		assertEquals(VisibilityKind.PUBLIC_LITERAL, getClass(receivingPackage, "NamedElement_Visibility_public_public").getVisibility());

		assertFalse(getProperty(getClass(receivingPackage, "Property_IsDerivedUnion"), "_false_false").isDerivedUnion());
		assertFalse(getProperty(getClass(receivingPackage, "Property_IsDerivedUnion"), "_false_true").isDerivedUnion());
		assertTrue(getProperty(getClass(receivingPackage, "Property_IsDerivedUnion"), "_true_false").isDerivedUnion());
		assertTrue(getProperty(getClass(receivingPackage, "Property_IsDerivedUnion"), "_true_true").isDerivedUnion());

		assertFalse(getClass(receivingPackage, "RedefinableElement_IsLeaf_false_false").isLeaf());
		assertFalse(getClass(receivingPackage, "RedefinableElement_IsLeaf_false_true").isLeaf());
		assertTrue(getClass(receivingPackage, "RedefinableElement_IsLeaf_true_false").isLeaf());
		assertTrue(getClass(receivingPackage, "RedefinableElement_IsLeaf_true_true").isLeaf());

		assertFalse(getProperty(getClass(receivingPackage, "StructuralFeature_IsReadOnly"), "_false_false").isReadOnly());
		assertFalse(getProperty(getClass(receivingPackage, "StructuralFeature_IsReadOnly"), "_false_true").isReadOnly());
		assertTrue(getProperty(getClass(receivingPackage, "StructuralFeature_IsReadOnly"), "_true_false").isReadOnly());
		assertTrue(getProperty(getClass(receivingPackage, "StructuralFeature_IsReadOnly"), "_true_true").isReadOnly());
	}

	public void testProcess() {
		Package receivingPackage = getPackage("receiving");
		BasicDiagnostic diagnostics = new BasicDiagnostic();

		merge(receivingPackage, diagnostics, UMLUtil.OPTION__PROCESS);
		
		Diagnostic diagnostic = getDiagnostic(diagnostics, UMLUtil.PackageMerger.ATTRIBUTE_TRANSFORMATION);

		assertNotNull(diagnostic);
		assertEquals(Diagnostic.INFO, diagnostic.getSeverity());

		assertFalse(getAssociation(receivingPackage, "Association_IsDerived_false_false").isDerived());
		assertTrue(getAssociation(receivingPackage, "Association_IsDerived_false_true").isDerived());
		assertTrue(getAssociation(receivingPackage, "Association_IsDerived_true_false").isDerived());
		assertTrue(getAssociation(receivingPackage, "Association_IsDerived_true_true").isDerived());

		assertFalse(getClass(receivingPackage, "Classifier_IsAbstract_false_false").isAbstract());
		assertFalse(getClass(receivingPackage, "Classifier_IsAbstract_false_true").isAbstract());
		assertFalse(getClass(receivingPackage, "Classifier_IsAbstract_true_false").isAbstract());
		assertTrue(getClass(receivingPackage, "Classifier_IsAbstract_true_true").isAbstract());

		assertFalse(getClass(receivingPackage, "Classifier_IsFinalSpecialization_false_false").isFinalSpecialization());
		assertFalse(getClass(receivingPackage, "Classifier_IsFinalSpecialization_false_true").isFinalSpecialization());
		assertFalse(getClass(receivingPackage, "Classifier_IsFinalSpecialization_true_false").isFinalSpecialization());
		assertTrue(getClass(receivingPackage, "Classifier_IsFinalSpecialization_true_true").isFinalSpecialization());

		assertFalse(getProperty(getClass(receivingPackage, "MultiplicityElement_IsOrdered"), "_false_false").isOrdered());
		assertTrue(getProperty(getClass(receivingPackage, "MultiplicityElement_IsOrdered"), "_false_true").isOrdered());
		assertTrue(getProperty(getClass(receivingPackage, "MultiplicityElement_IsOrdered"), "_true_false").isOrdered());
		assertTrue(getProperty(getClass(receivingPackage, "MultiplicityElement_IsOrdered"), "_true_true").isOrdered());

		assertFalse(getProperty(getClass(receivingPackage, "MultiplicityElement_IsUnique"), "_false_false").isUnique());
		assertFalse(getProperty(getClass(receivingPackage, "MultiplicityElement_IsUnique"), "_false_true").isUnique());
		assertFalse(getProperty(getClass(receivingPackage, "MultiplicityElement_IsUnique"), "_true_false").isUnique());
		assertTrue(getProperty(getClass(receivingPackage, "MultiplicityElement_IsUnique"), "_true_true").isUnique());

		assertEquals(0, getProperty(getClass(receivingPackage, "MultiplicityElement_Lower"), "_less").getLower());
		assertEquals(0, getProperty(getClass(receivingPackage, "MultiplicityElement_Lower"), "_equal").getLower());
		assertEquals(0, getProperty(getClass(receivingPackage, "MultiplicityElement_Lower"), "_greater").getLower());

		assertEquals(LiteralUnlimitedNatural.UNLIMITED, getProperty(getClass(receivingPackage, "MultiplicityElement_Upper"), "_less").getUpper());
		assertEquals(LiteralUnlimitedNatural.UNLIMITED, getProperty(getClass(receivingPackage, "MultiplicityElement_Upper"), "_equal").getUpper());
		assertEquals(LiteralUnlimitedNatural.UNLIMITED, getProperty(getClass(receivingPackage, "MultiplicityElement_Upper"), "_greater").getUpper());

		assertEquals(VisibilityKind.PUBLIC_LITERAL, getClass(receivingPackage, "NamedElement_Visibility_package_package").getVisibility());
		assertEquals(VisibilityKind.PUBLIC_LITERAL, getClass(receivingPackage, "NamedElement_Visibility_package_private").getVisibility());
		assertEquals(VisibilityKind.PUBLIC_LITERAL, getClass(receivingPackage, "NamedElement_Visibility_package_protected").getVisibility());
		assertEquals(VisibilityKind.PUBLIC_LITERAL, getClass(receivingPackage, "NamedElement_Visibility_package_public").getVisibility());
		assertEquals(VisibilityKind.PUBLIC_LITERAL, getClass(receivingPackage, "NamedElement_Visibility_private_package").getVisibility());
		assertEquals(VisibilityKind.PRIVATE_LITERAL, getClass(receivingPackage, "NamedElement_Visibility_private_private").getVisibility());
		assertEquals(VisibilityKind.PUBLIC_LITERAL, getClass(receivingPackage, "NamedElement_Visibility_private_protected").getVisibility());
		assertEquals(VisibilityKind.PUBLIC_LITERAL, getClass(receivingPackage, "NamedElement_Visibility_private_public").getVisibility());
		assertEquals(VisibilityKind.PUBLIC_LITERAL, getClass(receivingPackage, "NamedElement_Visibility_protected_package").getVisibility());
		assertEquals(VisibilityKind.PUBLIC_LITERAL, getClass(receivingPackage, "NamedElement_Visibility_protected_private").getVisibility());
		assertEquals(VisibilityKind.PUBLIC_LITERAL, getClass(receivingPackage, "NamedElement_Visibility_protected_protected").getVisibility());
		assertEquals(VisibilityKind.PUBLIC_LITERAL, getClass(receivingPackage, "NamedElement_Visibility_protected_public").getVisibility());
		assertEquals(VisibilityKind.PUBLIC_LITERAL, getClass(receivingPackage, "NamedElement_Visibility_public_package").getVisibility());
		assertEquals(VisibilityKind.PUBLIC_LITERAL, getClass(receivingPackage, "NamedElement_Visibility_public_private").getVisibility());
		assertEquals(VisibilityKind.PUBLIC_LITERAL, getClass(receivingPackage, "NamedElement_Visibility_public_protected").getVisibility());
		assertEquals(VisibilityKind.PUBLIC_LITERAL, getClass(receivingPackage, "NamedElement_Visibility_public_public").getVisibility());

		assertFalse(getProperty(getClass(receivingPackage, "Property_IsDerivedUnion"), "_false_false").isDerivedUnion());
		assertTrue(getProperty(getClass(receivingPackage, "Property_IsDerivedUnion"), "_false_true").isDerivedUnion());
		assertTrue(getProperty(getClass(receivingPackage, "Property_IsDerivedUnion"), "_true_false").isDerivedUnion());
		assertTrue(getProperty(getClass(receivingPackage, "Property_IsDerivedUnion"), "_true_true").isDerivedUnion());

		assertFalse(getClass(receivingPackage, "RedefinableElement_IsLeaf_false_false").isLeaf());
		assertFalse(getClass(receivingPackage, "RedefinableElement_IsLeaf_false_true").isLeaf());
		assertFalse(getClass(receivingPackage, "RedefinableElement_IsLeaf_true_false").isLeaf());
		assertTrue(getClass(receivingPackage, "RedefinableElement_IsLeaf_true_true").isLeaf());

		assertFalse(getProperty(getClass(receivingPackage, "StructuralFeature_IsReadOnly"), "_false_false").isReadOnly());
		assertFalse(getProperty(getClass(receivingPackage, "StructuralFeature_IsReadOnly"), "_false_true").isReadOnly());
		assertFalse(getProperty(getClass(receivingPackage, "StructuralFeature_IsReadOnly"), "_true_false").isReadOnly());
		assertTrue(getProperty(getClass(receivingPackage, "StructuralFeature_IsReadOnly"), "_true_true").isReadOnly());
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

	Association getAssociation(Package package_, String name) {
		return (Association) package_.getOwnedType(name);
	}

	Class getClass(Package package_, String name) {
		return (Class) package_.getOwnedType(name);
	}

	Property getProperty(AttributeOwner owner, String name) {
		return owner.getOwnedAttribute(name, null);
	}

	Package getPackage(String name) {
		return fixture.getNestedPackage(name);
	}

	Package getTestModel() {
		URL url = getClass().getResource("Bug416833.uml"); //$NON-NLS-1$
		return (Package) UML2Util.load(rset,
			URI.createURI(url.toExternalForm()), UMLPackage.Literals.PACKAGE);
	}

	void merge(org.eclipse.uml2.uml.Package package_,
			DiagnosticChain diagnostics, String option) {
		Map<String, String> options = new HashMap<String, String>();
		options
			.put(PackageMerger.OPTION__ATTRIBUTE_TRANSFORMATIONS, option);

		UMLUtil.merge(package_, options, diagnostics, null);
	}

	Diagnostic getDiagnostic(Diagnostic diagnostics, int code) {

		for (Diagnostic child : diagnostics.getChildren()) {

			if (UMLValidator.DIAGNOSTIC_SOURCE.equals(child.getSource())
				&& (child.getCode() == code)) {
				// found it
				return child;
			}
		}

		return null;
	}

}
