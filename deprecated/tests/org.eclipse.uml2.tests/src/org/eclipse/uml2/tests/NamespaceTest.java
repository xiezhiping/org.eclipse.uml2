/*
 * Copyright (c) 2003, 2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: NamespaceTest.java,v 1.4 2006/05/29 17:27:34 khussey Exp $
 */
package org.eclipse.uml2.tests;

import java.util.Iterator;

import org.eclipse.uml2.ElementImport;
import org.eclipse.uml2.NamedElement;
import org.eclipse.uml2.Namespace;

import org.eclipse.uml2.PackageImport;
import org.eclipse.uml2.PackageableElement;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Namespace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.Namespace#getImportedMembers() <em>Imported Member</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.Namespace#validateMembersAreDistinguishable(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Members Are Distinguishable</em>}</li>
 *   <li>{@link org.eclipse.uml2.Namespace#getNamesOfMember(org.eclipse.uml2.NamedElement) <em>Get Names Of Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.Namespace#membersAreDistinguishable() <em>Members Are Distinguishable</em>}</li>
 *   <li>{@link org.eclipse.uml2.Namespace#validateImportedMemberDerived(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Imported Member Derived</em>}</li>
 *   <li>{@link org.eclipse.uml2.Namespace#importedMember() <em>Imported Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.Namespace#importMembers(java.util.Set) <em>Import Members</em>}</li>
 *   <li>{@link org.eclipse.uml2.Namespace#excludeCollisions(java.util.Set) <em>Exclude Collisions</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public abstract class NamespaceTest extends NamedElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

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
	private Namespace getFixture() {
		return (Namespace)fixture;
	}

	public void testGetMembers() {
		setUpMembers();

		for (Iterator members = getFixture().getMembers().iterator(); members.hasNext();) {
			assertTrue(NamedElement.class.isInstance(members.next()));
		}

		assertTrue(getFixture().getMembers().containsAll(getFixture().getOwnedMembers()));
		assertTrue(getFixture().getMembers().containsAll(getFixture().getImportedMembers()));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Namespace#getImportedMembers() <em>Imported Member</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Namespace#getImportedMembers()
	 * @generated
	 */
	public void testGetImportedMembersGen() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testGetImportedMembers() {
		testGetImportedMembersGen();
		
		assertEquals(getFixture().importedMember().size(), getFixture().getImportedMembers().size());
		assertTrue(getFixture().getImportedMembers().containsAll(getFixture().importedMember()));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Namespace#validateMembersAreDistinguishable(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Members Are Distinguishable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Namespace#validateMembersAreDistinguishable(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateMembersAreDistinguishable__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Namespace#getNamesOfMember(org.eclipse.uml2.NamedElement) <em>Get Names Of Member</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Namespace#getNamesOfMember(org.eclipse.uml2.NamedElement)
	 * @generated
	 */
	public void testGetNamesOfMember__NamedElement() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Namespace#membersAreDistinguishable() <em>Members Are Distinguishable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Namespace#membersAreDistinguishable()
	 * @generated
	 */
	public void testMembersAreDistinguishable() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Namespace#validateImportedMemberDerived(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Imported Member Derived</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Namespace#validateImportedMemberDerived(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateImportedMemberDerived__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Namespace#importedMember() <em>Imported Member</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Namespace#importedMember()
	 * @generated
	 */
	public void testImportedMemberGen() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testImportedMember() {
		testImportedMemberGen();
		
		setUpImportedMembers();

		for (Iterator elementImports = getFixture().getElementImports().iterator(); elementImports.hasNext();) {
			assertTrue(getFixture().importedMember().contains(((ElementImport) elementImports.next()).getImportedElement()));
		}

		for (Iterator packageImports = getFixture().getPackageImports().iterator(); packageImports.hasNext();) {
			assertTrue(getFixture().importedMember().containsAll(((PackageImport) packageImports.next()).getImportedPackage().visibleMembers()));
		}
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Namespace#importMembers(java.util.Set) <em>Import Members</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Namespace#importMembers(java.util.Set)
	 * @generated
	 */
	public void testImportMembers__Set() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Namespace#excludeCollisions(java.util.Set) <em>Exclude Collisions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Namespace#excludeCollisions(java.util.Set)
	 * @generated
	 */
	public void testExcludeCollisions__Set() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}


	public void testGetOwnedMembers() {
		setUpOwnedMembers();

		for (Iterator ownedMembers = getFixture().getOwnedMembers().iterator(); ownedMembers.hasNext();) {
			assertTrue(NamedElement.class.isInstance(ownedMembers.next()));
		}

		assertTrue(getFixture().getOwnedMembers().containsAll(getFixture().getOwnedRules()));
	}

	public void testGetOwnedElements() {
		super.testGetOwnedElements();

		assertTrue(getFixture().getOwnedElements().containsAll(getFixture().getElementImports()));
		assertTrue(getFixture().getOwnedElements().containsAll(getFixture().getOwnedMembers()));
		assertTrue(getFixture().getOwnedElements().containsAll(getFixture().getPackageImports()));
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.ElementImplTest#setUpOwnedElements()
	 */
	protected void setUpOwnedElements() {
		super.setUpOwnedElements();

		setUpOwnedMembers();

		getFixture().getElementImports().add(UML2Factory.eINSTANCE.createElementImport());
		getFixture().getElementImports().add(UML2Factory.eINSTANCE.createElementImport());

		getFixture().getPackageImports().add(UML2Factory.eINSTANCE.createPackageImport());
		getFixture().getPackageImports().add(UML2Factory.eINSTANCE.createPackageImport());
	}

	protected void setUpMembers() {
		setUpOwnedMembers();

		setUpImportedMembers();
	}

	protected void setUpOwnedMembers() {
		getFixture().getOwnedRules().add(UML2Factory.eINSTANCE.createConstraint());
		getFixture().getOwnedRules().add(UML2Factory.eINSTANCE.createConstraint());
	}

	protected void setUpImportedMembers() {
		getFixture().getElementImports().add(UML2Factory.eINSTANCE.createElementImport());
		getFixture().getElementImports().add(UML2Factory.eINSTANCE.createElementImport());

		for (Iterator elementImports = getFixture().getElementImports().iterator(); elementImports.hasNext();) {
			((ElementImport) elementImports.next()).setImportedElement(
				(PackageableElement) UML2Factory.eINSTANCE.create(
					PackageableElement.class.isInstance(getFixture()) ? getFixture().eClass() : UML2Package.eINSTANCE.getConstraint()));
		}

		getFixture().getPackageImports().add(UML2Factory.eINSTANCE.createPackageImport());
		getFixture().getPackageImports().add(UML2Factory.eINSTANCE.createPackageImport());

		for (Iterator packageImports = getFixture().getPackageImports().iterator(); packageImports.hasNext();) {
			((PackageImport) packageImports.next()).setImportedPackage(UML2Factory.eINSTANCE.createPackage());
		}
	}

} //NamespaceImplTest
