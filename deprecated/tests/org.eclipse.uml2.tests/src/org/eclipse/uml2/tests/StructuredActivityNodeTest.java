/*
 * Copyright (c) 2003, 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: StructuredActivityNodeTest.java,v 1.3 2005/05/18 17:04:27 khussey Exp $
 */
package org.eclipse.uml2.tests;

import junit.textui.TestRunner;

import org.eclipse.uml2.Activity;
import org.eclipse.uml2.StructuredActivityNode;
import org.eclipse.uml2.ElementImport;
import org.eclipse.uml2.PackageImport;
import org.eclipse.uml2.UML2Factory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Structured Activity Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.Namespace#getImportedMembers() <em>Imported Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.StructuredActivityNode#getActivity() <em>Activity</em>}</li>
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
public class StructuredActivityNodeTest extends ActionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StructuredActivityNodeTest.class);
	}

	/**
	 * Constructs a new Structured Activity Node test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredActivityNodeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Structured Activity Node test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private StructuredActivityNode getFixture() {
		return (StructuredActivityNode)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(UML2Factory.eINSTANCE.createStructuredActivityNode());
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
	 * Tests the '{@link org.eclipse.uml2.Namespace#getMembers() <em>Member</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Namespace#getMembers()
	 * @generated
	 */
	public void testGetMembersGen() {
		// TODO: implement this union feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
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
	 * Tests the '{@link org.eclipse.uml2.Namespace#getImportedMembers() <em>Imported Member</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Namespace#getImportedMembers()
	 * @generated
	 */
	public void testGetImportedMembers() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.ActivityGroup#getSuperGroup() <em>Super Group</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.ActivityGroup#getSuperGroup()
	 * @generated
	 */
	public void testGetSuperGroup() {
		// TODO: implement this union feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
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
	public void testImportedMember() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
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



	/**
	 * Tests the '{@link org.eclipse.uml2.Element#getOwnedElements() <em>Owned Element</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Element#getOwnedElements()
	 * @generated
	 */
	public void testGetOwnedElementsGen() {
		// TODO: implement this union feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testGetOwnedElements() {
		testGetOwnedElementsGen();
		
		super.testGetOwnedElements();

		assertTrue(getFixture().getOwnedElements().containsAll(getFixture().getElementImports()));
		assertTrue(getFixture().getOwnedElements().containsAll(getFixture().getOwnedMembers()));
		assertTrue(getFixture().getOwnedElements().containsAll(getFixture().getPackageImports()));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.ActivityGroup#getSubgroups() <em>Subgroup</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.ActivityGroup#getSubgroups()
	 * @generated
	 */
	public void testGetSubgroups() {
		// TODO: implement this union feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Element#getOwner() <em>Owner</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Element#getOwner()
	 * @generated
	 */
	public void testGetOwnerGen() {
		// TODO: implement this union feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testGetOwner() {
		testGetOwnerGen();
		
		super.testGetOwner();

		assertSame(getFixture().getActivityGroup_activity(), getFixture().getOwner());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.StructuredActivityNode#getActivity() <em>Activity</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.StructuredActivityNode#getActivity()
	 * @generated
	 */
	public void testGetActivityGen() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
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

	public void testSetActivity() {
		Activity activity = UML2Factory.eINSTANCE.createActivity();
		getFixture().setActivity(activity);

		assertNotSame(activity, getFixture().getActivity());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.ActivityGroup#getActivityGroup_activity() <em>Activity Group activity</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.ActivityGroup#getActivityGroup_activity()
	 * @generated
	 */
	public void testGetActivityGroup_activityGen() {
		// TODO: implement this redefined feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
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
	 * Tests the '{@link org.eclipse.uml2.ActivityGroup#setActivityGroup_activity(org.eclipse.uml2.Activity) <em>Activity Group activity</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.ActivityGroup#setActivityGroup_activity(org.eclipse.uml2.Activity)
	 * @generated
	 */
	public void testSetActivityGroup_activityGen() {
		// TODO: implement this redefined feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}
	public void testSetActivityGroup_activity() {
		testSetActivityGroup_activityGen();

		Activity activity = UML2Factory.eINSTANCE.createActivity();
		getFixture().setActivityGroup_activity(activity);

		assertNotSame(activity, getFixture().getActivityGroup_activity());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Namespace#getOwnedMembers() <em>Owned Member</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Namespace#getOwnedMembers()
	 * @generated
	 */
	public void testGetOwnedMembersGen() {
		// TODO: implement this union feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
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
