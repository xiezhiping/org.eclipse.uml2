/*
 * Copyright (c) 2003, 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *
 * $Id: NamespaceImplTest.java,v 1.2 2004/05/11 15:20:50 khussey Exp $
 */
package org.eclipse.uml2.impl.tests;

import java.util.Iterator;

import org.eclipse.uml2.ElementImport;
import org.eclipse.uml2.NamedElement;
import org.eclipse.uml2.PackageImport;
import org.eclipse.uml2.PackageableElement;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.impl.NamespaceImpl;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Namespace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.NamespaceImpl#getMembers() <em>Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.NamespaceImpl#getOwnedRules() <em>Owned Rule</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.NamespaceImpl#getImportedMembers() <em>Imported Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.NamespaceImpl#getElementImports() <em>Element Import</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.NamespaceImpl#getPackageImports() <em>Package Import</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.NamespaceImpl#validateMembersAreDistinguishable(EDiagnosticChain, EMap) <em>Validate Members Are Distinguishable</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.NamespaceImpl#getNamesOfMember(NamedElement) <em>Get Names Of Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.NamespaceImpl#membersAreDistinguishable() <em>Members Are Distinguishable</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.NamespaceImpl#validateImportedMemberDerived(EDiagnosticChain, EMap) <em>Validate Imported Member Derived</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.NamespaceImpl#importedMember() <em>Imported Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.NamespaceImpl#importMembers(Set) <em>Import Members</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.NamespaceImpl#excludeCollisions(Set) <em>Exclude Collisions</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.NamespaceImpl#getOwnedMembers() <em>Get Owned Members</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.NamespaceImpl#getOwnedElements() <em>Get Owned Elements</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public abstract class NamespaceImplTest extends NamedElementImplTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Constructs a new Namespace test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamespaceImplTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Namespace test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private NamespaceImpl getFixture() {
		return (NamespaceImpl) fixture;
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.NamespaceImpl#getMembers() <em>Member</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.NamespaceImpl#getMembers()
	 * @generated NOT
	 */
	public void testGetMembers() {
		setUpMembers();

		for (Iterator members = getFixture().getMembers().iterator(); members.hasNext();) {
			assertTrue(NamedElement.class.isInstance(members.next()));
		}

		assertTrue(getFixture().getMembers().containsAll(getFixture().getOwnedMembers()));
		assertTrue(getFixture().getMembers().containsAll(getFixture().getImportedMembers()));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.NamespaceImpl#getOwnedRules() <em>Owned Rule</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.NamespaceImpl#getOwnedRules()
	 * @generated
	 */
	public void testGetOwnedRules() {
		// TODO: implement this feature getter test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.NamespaceImpl#getImportedMembers() <em>Imported Member</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.NamespaceImpl#getImportedMembers()
	 * @generated NOT
	 */
	public void testGetImportedMembers() {
		assertEquals(getFixture().importedMember().size(), getFixture().getImportedMembers().size());
		assertTrue(getFixture().getImportedMembers().containsAll(getFixture().importedMember()));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.NamespaceImpl#getElementImports() <em>Element Import</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.NamespaceImpl#getElementImports()
	 * @generated
	 */
	public void testGetElementImports() {
		// TODO: implement this feature getter test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.NamespaceImpl#getPackageImports() <em>Package Import</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.NamespaceImpl#getPackageImports()
	 * @generated
	 */
	public void testGetPackageImports() {
		// TODO: implement this feature getter test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.NamespaceImpl#validateMembersAreDistinguishable(EDiagnosticChain, EMap) <em>Validate Members Are Distinguishable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.NamespaceImpl#validateMembersAreDistinguishable(EDiagnosticChain, EMap)
	 * @generated
	 */
	public void testValidateMembersAreDistinguishable__EDiagnosticChain_EMap() {
		// TODO: implement this operation test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.NamespaceImpl#getNamesOfMember(NamedElement) <em>Get Names Of Member</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.NamespaceImpl#getNamesOfMember(NamedElement)
	 * @generated
	 */
	public void testGetNamesOfMember__NamedElement() {
		// TODO: implement this operation test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.NamespaceImpl#membersAreDistinguishable() <em>Members Are Distinguishable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.NamespaceImpl#membersAreDistinguishable()
	 * @generated
	 */
	public void testMembersAreDistinguishable() {
		// TODO: implement this operation test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.NamespaceImpl#validateImportedMemberDerived(EDiagnosticChain, EMap) <em>Validate Imported Member Derived</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.NamespaceImpl#validateImportedMemberDerived(EDiagnosticChain, EMap)
	 * @generated
	 */
	public void testValidateImportedMemberDerived__EDiagnosticChain_EMap() {
		// TODO: implement this operation test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.NamespaceImpl#importedMember() <em>Imported Member</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.NamespaceImpl#importedMember()
	 * @generated NOT
	 */
	public void testImportedMember() {
		setUpImportedMembers();

		for (Iterator elementImports = getFixture().getElementImports().iterator(); elementImports.hasNext();) {
			assertTrue(getFixture().importedMember().contains(((ElementImport) elementImports.next()).getImportedElement()));
		}

		for (Iterator packageImports = getFixture().getPackageImports().iterator(); packageImports.hasNext();) {
			assertTrue(getFixture().importedMember().containsAll(((PackageImport) packageImports.next()).getImportedPackage().visibleMembers()));
		}
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.NamespaceImpl#importMembers(Set) <em>Import Members</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.NamespaceImpl#importMembers(Set)
	 * @generated
	 */
	public void testImportMembers__Set() {
		// TODO: implement this operation test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.NamespaceImpl#excludeCollisions(Set) <em>Exclude Collisions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.NamespaceImpl#excludeCollisions(Set)
	 * @generated
	 */
	public void testExcludeCollisions__Set() {
		// TODO: implement this operation test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.NamespaceImpl#getOwnedMembers() <em>Get Owned Members</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.NamespaceImpl#getOwnedMembers()
	 * @generated NOT
	 */
	public void testGetOwnedMembers() {
		setUpOwnedMembers();

		for (Iterator ownedMembers = getFixture().getOwnedMembers().iterator(); ownedMembers.hasNext();) {
			assertTrue(NamedElement.class.isInstance(ownedMembers.next()));
		}

		assertTrue(getFixture().getOwnedMembers().containsAll(getFixture().getOwnedRules()));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.NamespaceImpl#getOwnedElements() <em>Get Owned Elements</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.NamespaceImpl#getOwnedElements()
	 * @generated NOT
	 */
	public void testGetOwnedElements() {
		super.testGetOwnedElements();

		assertTrue(getFixture().getOwnedElements().containsAll(getFixture().getElementImports()));
		assertTrue(getFixture().getOwnedElements().containsAll(getFixture().getOwnedMembers()));
		assertTrue(getFixture().getOwnedElements().containsAll(getFixture().getPackageImports()));
	}

	/**
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
