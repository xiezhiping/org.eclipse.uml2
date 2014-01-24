/*
 * Copyright (c) 2005, 2014 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey - 323181
 *   Kenn Hussey (CEA) - 327039, 418466
 *
 */
package org.eclipse.uml2.uml.tests;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.uml2.uml.ElementImport;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.PackageImport;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Namespace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Namespace#getImportedMembers() <em>Imported Member</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Namespace#validateMembersDistinguishable(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Members Distinguishable</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Namespace#validateCannotImportSelf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cannot Import Self</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Namespace#validateCannotImportOwnedMembers(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cannot Import Owned Members</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Namespace#createElementImport(org.eclipse.uml2.uml.PackageableElement, org.eclipse.uml2.uml.VisibilityKind) <em>Create Element Import</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Namespace#createPackageImport(org.eclipse.uml2.uml.Package, org.eclipse.uml2.uml.VisibilityKind) <em>Create Package Import</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Namespace#getImportedElements() <em>Get Imported Elements</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Namespace#getImportedPackages() <em>Get Imported Packages</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Namespace#excludeCollisions(org.eclipse.emf.common.util.EList) <em>Exclude Collisions</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Namespace#getNamesOfMember(org.eclipse.uml2.uml.NamedElement) <em>Get Names Of Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Namespace#importMembers(org.eclipse.emf.common.util.EList) <em>Import Members</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Namespace#membersAreDistinguishable() <em>Members Are Distinguishable</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public abstract class NamespaceTest
		extends NamedElementTest {

	/**
	 * Constructs a new Namespace test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamespaceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Namespace test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Namespace getFixture() {
		return (Namespace) fixture;
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Namespace#getImportedMembers() <em>Imported Member</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Namespace#getImportedMembers()
	 * @generated
	 */
	public void testGetImportedMembers() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Namespace#validateMembersDistinguishable(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Members Distinguishable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Namespace#validateMembersDistinguishable(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateMembersDistinguishable__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Namespace#validateCannotImportSelf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cannot Import Self</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Namespace#validateCannotImportSelf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateCannotImportSelf__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Namespace#validateCannotImportOwnedMembers(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cannot Import Owned Members</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Namespace#validateCannotImportOwnedMembers(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateCannotImportOwnedMembers__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Namespace#createElementImport(org.eclipse.uml2.uml.PackageableElement, org.eclipse.uml2.uml.VisibilityKind) <em>Create Element Import</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Namespace#createElementImport(org.eclipse.uml2.uml.PackageableElement, org.eclipse.uml2.uml.VisibilityKind)
	 * @generated NOT
	 */
	public void testCreateElementImport__PackageableElement_VisibilityKind() {

		try {
			getFixture().createElementImport(null,
				VisibilityKind.PRIVATE_LITERAL);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		EList<EClass> packageableElementSubClasses = getEAllSubClasses(UMLPackage.Literals.PACKAGEABLE_ELEMENT);

		for (int i = 0; i < packageableElementSubClasses.size(); i++) {
			PackageableElement packageableElement = (PackageableElement) UMLFactory.eINSTANCE
				.create(packageableElementSubClasses.get(i));

			try {
				getFixture().createElementImport(packageableElement, null);
				fail();
			} catch (IllegalArgumentException iae) {
				// pass
			}

			try {
				getFixture().createElementImport(packageableElement,
					VisibilityKind.PRIVATE_LITERAL);
			} catch (IllegalArgumentException iae) {
				fail();
			}

			assertEquals(i + 1, getFixture().getElementImports().size());

			ElementImport elementImport = getFixture().getElementImports().get(
				i);

			assertSame(packageableElement, elementImport.getImportedElement());
			assertSame(VisibilityKind.PRIVATE_LITERAL,
				elementImport.getVisibility());

			try {
				getFixture().createElementImport(packageableElement,
					VisibilityKind.PRIVATE_LITERAL);
				fail();
			} catch (IllegalArgumentException iae) {
				// pass
			}
		}
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Namespace#createPackageImport(org.eclipse.uml2.uml.Package, org.eclipse.uml2.uml.VisibilityKind) <em>Create Package Import</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Namespace#createPackageImport(org.eclipse.uml2.uml.Package, org.eclipse.uml2.uml.VisibilityKind)
	 * @generated NOT
	 */
	public void testCreatePackageImport__Package_VisibilityKind() {

		try {
			getFixture().createPackageImport(null,
				VisibilityKind.PRIVATE_LITERAL);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		org.eclipse.uml2.uml.Package package_ = UMLFactory.eINSTANCE
			.createPackage();

		try {
			getFixture().createPackageImport(package_, null);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}

		try {
			getFixture().createPackageImport(package_,
				VisibilityKind.PRIVATE_LITERAL);
		} catch (IllegalArgumentException iae) {
			fail();
		}

		assertEquals(1, getFixture().getPackageImports().size());

		PackageImport packageImport = getFixture().getPackageImports().get(0);

		assertSame(package_, packageImport.getImportedPackage());
		assertSame(VisibilityKind.PRIVATE_LITERAL,
			packageImport.getVisibility());

		try {
			getFixture().createPackageImport(package_,
				VisibilityKind.PRIVATE_LITERAL);
			fail();
		} catch (IllegalArgumentException iae) {
			// pass
		}
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Namespace#getImportedElements() <em>Get Imported Elements</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Namespace#getImportedElements()
	 * @generated NOT
	 */
	public void testGetImportedElements() {
		assertEquals(0, getFixture().getImportedElements().size());

		org.eclipse.uml2.uml.Class class_ = UMLFactory.eINSTANCE.createClass();

		ElementImport elementImport = getFixture().createElementImport(null);
		elementImport.setImportedElement(class_);

		EList<PackageableElement> importedElements = getFixture()
			.getImportedElements();

		assertEquals(1, importedElements.size());
		assertTrue(importedElements.contains(class_));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Namespace#getImportedPackages() <em>Get Imported Packages</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Namespace#getImportedPackages()
	 * @generated NOT
	 */
	public void testGetImportedPackages() {
		assertEquals(0, getFixture().getImportedPackages().size());

		org.eclipse.uml2.uml.Package package_ = UMLFactory.eINSTANCE
			.createPackage();

		PackageImport packageImport = getFixture().createPackageImport(null);
		packageImport.setImportedPackage(package_);

		EList<org.eclipse.uml2.uml.Package> importedPackages = getFixture()
			.getImportedPackages();

		assertEquals(1, importedPackages.size());
		assertTrue(importedPackages.contains(package_));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Namespace#getNamesOfMember(org.eclipse.uml2.uml.NamedElement) <em>Get Names Of Member</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Namespace#getNamesOfMember(org.eclipse.uml2.uml.NamedElement)
	 * @generated
	 */
	public void testGetNamesOfMember__NamedElement() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Namespace#membersAreDistinguishable() <em>Members Are Distinguishable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Namespace#membersAreDistinguishable()
	 * @generated
	 */
	public void testMembersAreDistinguishable() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Namespace#importMembers(org.eclipse.emf.common.util.EList) <em>Import Members</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Namespace#importMembers(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	public void testImportMembers__EList() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Namespace#excludeCollisions(org.eclipse.emf.common.util.EList) <em>Exclude Collisions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Namespace#excludeCollisions(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	public void testExcludeCollisions__EList() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

} //NamespaceTest
