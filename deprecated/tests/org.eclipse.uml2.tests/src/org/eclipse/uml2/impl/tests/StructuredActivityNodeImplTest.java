/*
 * Copyright (c) 2003, 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: StructuredActivityNodeImplTest.java,v 1.5 2005/03/15 18:51:30 khussey Exp $
 */
package org.eclipse.uml2.impl.tests;

import junit.textui.TestRunner;

import org.eclipse.uml2.Activity;
import org.eclipse.uml2.ElementImport;
import org.eclipse.uml2.PackageImport;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.impl.StructuredActivityNodeImpl;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Structured Activity Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.StructuredActivityNodeImpl#getMembers() <em>Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.StructuredActivityNodeImpl#getOwnedRules() <em>Owned Rule</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.StructuredActivityNodeImpl#getImportedMembers() <em>Imported Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.StructuredActivityNodeImpl#getElementImports() <em>Element Import</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.StructuredActivityNodeImpl#getPackageImports() <em>Package Import</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.StructuredActivityNodeImpl#getSuperGroup() <em>Super Group</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.StructuredActivityNodeImpl#getActivityGroup_activity() <em>Activity Group activity</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.StructuredActivityNodeImpl#isMustIsolate() <em>Must Isolate</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.StructuredActivityNodeImpl#validateMembersAreDistinguishable(EDiagnosticChain, EMap) <em>Validate Members Are Distinguishable</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.StructuredActivityNodeImpl#getNamesOfMember(NamedElement) <em>Get Names Of Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.StructuredActivityNodeImpl#membersAreDistinguishable() <em>Members Are Distinguishable</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.StructuredActivityNodeImpl#validateImportedMemberDerived(EDiagnosticChain, EMap) <em>Validate Imported Member Derived</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.StructuredActivityNodeImpl#importedMember() <em>Imported Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.StructuredActivityNodeImpl#importMembers(Set) <em>Import Members</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.StructuredActivityNodeImpl#excludeCollisions(Set) <em>Exclude Collisions</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.StructuredActivityNodeImpl#getOwnedMembers() <em>Get Owned Members</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.StructuredActivityNodeImpl#getOwnedElements() <em>Get Owned Elements</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.StructuredActivityNodeImpl#getSubgroups() <em>Get Subgroups</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.StructuredActivityNodeImpl#getContainedEdges() <em>Get Contained Edges</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.StructuredActivityNodeImpl#getContainedNodes() <em>Get Contained Nodes</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.StructuredActivityNodeImpl#getActivity() <em>Get Activity</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.StructuredActivityNodeImpl#setActivity(Activity) <em>Set Activity</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.StructuredActivityNodeImpl#getOwnedElements() <em>Get Owned Elements</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.StructuredActivityNodeImpl#getOwner() <em>Get Owner</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.StructuredActivityNodeImpl#getActivity() <em>Get Activity</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.StructuredActivityNodeImpl#setActivity(Activity) <em>Set Activity</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.StructuredActivityNodeImpl#getActivityGroup_activity() <em>Get Activity Group activity</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.StructuredActivityNodeImpl#setActivityGroup_activity(Activity) <em>Set Activity Group activity</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.StructuredActivityNodeImpl#getOwnedMembers() <em>Get Owned Members</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class StructuredActivityNodeImplTest extends ActionImplTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StructuredActivityNodeImplTest.class);
	}

	/**
	 * Constructs a new Structured Activity Node test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredActivityNodeImplTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Structured Activity Node test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private StructuredActivityNodeImpl getFixture() {
		return (StructuredActivityNodeImpl) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture((StructuredActivityNodeImpl) UML2Factory.eINSTANCE.createStructuredActivityNode());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	protected void tearDown() throws Exception {
		setFixture(null);
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.StructuredActivityNodeImpl#getMembers() <em>Member</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.StructuredActivityNodeImpl#getMembers()
	 * @generated
	 */
	public void testGetMembersGen() {
		// TODO: implement this feature getter test method
	}

	public void testGetMembers() {
		testGetMembersGen();
		
		setUpOwnedMembers();

		ElementImport elementImport = UML2Factory.eINSTANCE.createElementImport();
		elementImport.setImportedElement(UML2Factory.eINSTANCE.createActor());
		getFixture().getElementImports().add(elementImport);

		PackageImport packageImport = UML2Factory.eINSTANCE.createPackageImport();
		packageImport.setImportedPackage(UML2Factory.eINSTANCE.createPackage());
		getFixture().getPackageImports().add(packageImport);

		assertTrue(getFixture().getMembers().containsAll(getFixture().getOwnedMembers()));
		assertTrue(getFixture().getMembers().containsAll(getFixture().getImportedMembers()));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.StructuredActivityNodeImpl#getOwnedRules() <em>Owned Rule</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.StructuredActivityNodeImpl#getOwnedRules()
	 * @generated
	 */
	public void testGetOwnedRules() {
		// TODO: implement this feature getter test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.StructuredActivityNodeImpl#getImportedMembers() <em>Imported Member</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.StructuredActivityNodeImpl#getImportedMembers()
	 * @generated
	 */
	public void testGetImportedMembers() {
		// TODO: implement this feature getter test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.StructuredActivityNodeImpl#getElementImports() <em>Element Import</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.StructuredActivityNodeImpl#getElementImports()
	 * @generated
	 */
	public void testGetElementImports() {
		// TODO: implement this feature getter test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.StructuredActivityNodeImpl#getPackageImports() <em>Package Import</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.StructuredActivityNodeImpl#getPackageImports()
	 * @generated
	 */
	public void testGetPackageImports() {
		// TODO: implement this feature getter test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.StructuredActivityNodeImpl#getSuperGroup() <em>Super Group</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.StructuredActivityNodeImpl#getSuperGroup()
	 * @generated
	 */
	public void testGetSuperGroup() {
		// TODO: implement this feature getter test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.StructuredActivityNodeImpl#isMustIsolate() <em>Must Isolate</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.StructuredActivityNodeImpl#isMustIsolate()
	 * @generated
	 */
	public void testIsMustIsolate() {
		// TODO: implement this feature getter test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.StructuredActivityNodeImpl#setMustIsolate() <em>Must Isolate</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.StructuredActivityNodeImpl#setMustIsolate()
	 * @generated
	 */
	public void testSetMustIsolate() {
		// TODO: implement this feature setter test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.StructuredActivityNodeImpl#validateMembersAreDistinguishable(EDiagnosticChain, EMap) <em>Validate Members Are Distinguishable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.StructuredActivityNodeImpl#validateMembersAreDistinguishable(EDiagnosticChain, EMap)
	 * @generated
	 */
	public void testValidateMembersAreDistinguishable__EDiagnosticChain_EMap() {
		// TODO: implement this operation test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.StructuredActivityNodeImpl#getNamesOfMember(NamedElement) <em>Get Names Of Member</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.StructuredActivityNodeImpl#getNamesOfMember(NamedElement)
	 * @generated
	 */
	public void testGetNamesOfMember__NamedElement() {
		// TODO: implement this operation test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.StructuredActivityNodeImpl#membersAreDistinguishable() <em>Members Are Distinguishable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.StructuredActivityNodeImpl#membersAreDistinguishable()
	 * @generated
	 */
	public void testMembersAreDistinguishable() {
		// TODO: implement this operation test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.StructuredActivityNodeImpl#validateImportedMemberDerived(EDiagnosticChain, EMap) <em>Validate Imported Member Derived</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.StructuredActivityNodeImpl#validateImportedMemberDerived(EDiagnosticChain, EMap)
	 * @generated
	 */
	public void testValidateImportedMemberDerived__EDiagnosticChain_EMap() {
		// TODO: implement this operation test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.StructuredActivityNodeImpl#importedMember() <em>Imported Member</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.StructuredActivityNodeImpl#importedMember()
	 * @generated
	 */
	public void testImportedMember() {
		// TODO: implement this operation test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.StructuredActivityNodeImpl#importMembers(Set) <em>Import Members</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.StructuredActivityNodeImpl#importMembers(Set)
	 * @generated
	 */
	public void testImportMembers__Set() {
		// TODO: implement this operation test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.StructuredActivityNodeImpl#excludeCollisions(Set) <em>Exclude Collisions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.StructuredActivityNodeImpl#excludeCollisions(Set)
	 * @generated
	 */
	public void testExcludeCollisions__Set() {
		// TODO: implement this operation test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.StructuredActivityNodeImpl#getOwnedElements() <em>Get Owned Elements</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.StructuredActivityNodeImpl#getOwnedElements()
	 * @generated
	 */
	public void testGetOwnedElementsGen() {
		// TODO: implement this getter operation test method
	}

	public void testGetOwnedElements() {
		testGetOwnedElementsGen();
		
		super.testGetOwnedElements();

		assertTrue(getFixture().getOwnedElements().containsAll(getFixture().getElementImports()));
		assertTrue(getFixture().getOwnedElements().containsAll(getFixture().getOwnedMembers()));
		assertTrue(getFixture().getOwnedElements().containsAll(getFixture().getPackageImports()));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.StructuredActivityNodeImpl#getSubgroups() <em>Get Subgroups</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.StructuredActivityNodeImpl#getSubgroups()
	 * @generated
	 */
	public void testGetSubgroups() {
		// TODO: implement this getter operation test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.StructuredActivityNodeImpl#getOwner() <em>Get Owner</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.StructuredActivityNodeImpl#getOwner()
	 * @generated
	 */
	public void testGetOwnerGen() {
		// TODO: implement this getter operation test method
	}

	public void testGetOwner() {
		testGetOwnerGen();
		
		super.testGetOwner();

		assertSame(getFixture().getActivityGroup_activity(), getFixture().getOwner());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.StructuredActivityNodeImpl#getActivity() <em>Get Activity</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.StructuredActivityNodeImpl#getActivity()
	 * @generated
	 */
	public void testGetActivityGen() {
		// TODO: implement this getter operation test method
	}

	public void testGetActivity() {
		testGetActivityGen();
		
		Activity activity = UML2Factory.eINSTANCE.createActivity();
		activity.getNodes().add(getFixture());

		assertSame(activity, getFixture().getActivity());
		assertSame(getFixture().getActivityGroup_activity(), getFixture().getActivity());

		UML2Factory.eINSTANCE.createActivity().getNodes().add(getFixture());

		assertNotSame(activity, getFixture().getActivity());
		assertSame(getFixture().getActivityGroup_activity(), getFixture().getActivity());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.StructuredActivityNodeImpl#setActivity(Activity) <em>Set Activity</em>}' setter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.StructuredActivityNodeImpl#setActivity(Activity)
	 * @generated
	 */
	public void testSetActivity__ActivityGen() {
		// TODO: implement this setter operation test method
	}

	public void testSetActivity__Activity() {
		testSetActivity__ActivityGen();

		Activity activity = UML2Factory.eINSTANCE.createActivity();
		getFixture().setActivity(activity);

		assertNotSame(activity, getFixture().getActivity());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.StructuredActivityNodeImpl#getActivityGroup_activity() <em>Get Activity Group activity</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.StructuredActivityNodeImpl#getActivityGroup_activity()
	 * @generated
	 */
	public void testGetActivityGroup_activityGen() {
		// TODO: implement this getter operation test method
	}

	public void testGetActivityGroup_activity() {
		testGetActivityGroup_activityGen();
		
		Activity activity = UML2Factory.eINSTANCE.createActivity();
		activity.getGroups().add(getFixture());

		assertSame(activity, getFixture().getActivityGroup_activity());
		assertSame(getFixture().getActivity(), getFixture().getActivityGroup_activity());

		UML2Factory.eINSTANCE.createActivity().getGroups().add(getFixture());

		assertNotSame(activity, getFixture().getActivityGroup_activity());
		assertSame(getFixture().getActivity(), getFixture().getActivityGroup_activity());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.StructuredActivityNodeImpl#setActivityGroup_activity(Activity) <em>Set Activity Group activity</em>}' setter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.StructuredActivityNodeImpl#setActivityGroup_activity(Activity)
	 * @generated
	 */
	public void testSetActivityGroup_activity__ActivityGen() {
		// TODO: implement this setter operation test method
	}

	public void testSetActivityGroup_activity__Activity() {
		testSetActivityGroup_activity__ActivityGen();

		Activity activity = UML2Factory.eINSTANCE.createActivity();
		getFixture().setActivityGroup_activity(activity);

		assertNotSame(activity, getFixture().getActivityGroup_activity());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.StructuredActivityNodeImpl#getOwnedMembers() <em>Get Owned Members</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.StructuredActivityNodeImpl#getOwnedMembers()
	 * @generated
	 */
	public void testGetOwnedMembersGen() {
		// TODO: implement this getter operation test method
	}

	public void testGetOwnedMembers() {
		testGetOwnedMembersGen();
		
		setUpOwnedMembers();

		assertTrue(getFixture().getOwnedMembers().containsAll(getFixture().getVariables()));
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.ElementImplTest#setUpOwner()
	 */
	protected void setUpOwner() {
		UML2Factory.eINSTANCE.createActivity().getNodes().add(getFixture());
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

	protected void setUpOwnedMembers() {
		getFixture().getVariables().add(UML2Factory.eINSTANCE.createVariable());
	}

} //StructuredActivityNodeImplTest
