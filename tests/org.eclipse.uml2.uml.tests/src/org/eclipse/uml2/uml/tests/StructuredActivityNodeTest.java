/*
 * Copyright (c) 2005, 2014 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 327039, 351774, 418466
 *
 */
package org.eclipse.uml2.uml.tests;

import junit.textui.TestRunner;

import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.StructuredActivityNode;
import org.eclipse.uml2.uml.UMLFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Structured Activity Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Namespace#getImportedMembers() <em>Imported Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.StructuredActivityNode#getActivity() <em>Activity</em>}</li>
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
 *   <li>{@link org.eclipse.uml2.uml.ActivityGroup#validateNodesAndEdges(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nodes And Edges</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ActivityGroup#validateNotContained(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Not Contained</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.StructuredActivityNode#containingActivity() <em>Containing Activity</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.StructuredActivityNode#validateOutputPinEdges(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Output Pin Edges</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.StructuredActivityNode#validateEdges(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Edges</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.StructuredActivityNode#validateInputPinEdges(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Input Pin Edges</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.StructuredActivityNode#sourceNodes() <em>Source Nodes</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.StructuredActivityNode#targetNodes() <em>Target Nodes</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.StructuredActivityNode#allActions() <em>All Actions</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.StructuredActivityNode#allOwnedNodes() <em>All Owned Nodes</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class StructuredActivityNodeTest
		extends ActionTest {

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
	@Override
	protected StructuredActivityNode getFixture() {
		return (StructuredActivityNode) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp()
			throws Exception {
		setFixture(UMLFactory.eINSTANCE.createStructuredActivityNode());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown()
			throws Exception {
		setFixture(null);
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
	 * Tests the '{@link org.eclipse.uml2.uml.StructuredActivityNode#getActivity() <em>Activity</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.StructuredActivityNode#getActivity()
	 * @generated NOT
	 */
	public void testGetActivity() {
		Activity activity = UMLFactory.eINSTANCE.createActivity();
		activity.getStructuredNodes().add(getFixture());

		assertEquals(activity, getFixture().getActivity());

		activity.getNodes().remove(getFixture());

		assertNull(getFixture().getActivity());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.StructuredActivityNode#setActivity(org.eclipse.uml2.uml.Activity) <em>Activity</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.StructuredActivityNode#setActivity(org.eclipse.uml2.uml.Activity)
	 * @generated NOT
	 */
	public void testSetActivity() {
		Activity activity1 = UMLFactory.eINSTANCE.createActivity();
		getFixture().setActivity(activity1);

		assertTrue(activity1.getStructuredNodes().contains(getFixture()));
		assertTrue(activity1.getNodes().contains(getFixture()));

		Activity activity2 = UMLFactory.eINSTANCE.createActivity();
		getFixture().setActivity(activity2);

		assertFalse(activity1.getStructuredNodes().contains(getFixture()));
		assertFalse(activity1.getNodes().contains(getFixture()));
		assertTrue(activity2.getStructuredNodes().contains(getFixture()));
		assertTrue(activity2.getNodes().contains(getFixture()));

		getFixture().setActivity(null);

		assertFalse(activity2.getStructuredNodes().contains(getFixture()));
		assertFalse(activity2.getNodes().contains(getFixture()));
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
	 * @generated
	 */
	public void testCreateElementImport__PackageableElement_VisibilityKind() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Namespace#createPackageImport(org.eclipse.uml2.uml.Package, org.eclipse.uml2.uml.VisibilityKind) <em>Create Package Import</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Namespace#createPackageImport(org.eclipse.uml2.uml.Package, org.eclipse.uml2.uml.VisibilityKind)
	 * @generated
	 */
	public void testCreatePackageImport__Package_VisibilityKind() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Namespace#getImportedElements() <em>Get Imported Elements</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Namespace#getImportedElements()
	 * @generated
	 */
	public void testGetImportedElements() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Namespace#getImportedPackages() <em>Get Imported Packages</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Namespace#getImportedPackages()
	 * @generated
	 */
	public void testGetImportedPackages() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
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

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.ActivityGroup#validateNodesAndEdges(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nodes And Edges</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.ActivityGroup#validateNodesAndEdges(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateNodesAndEdges__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.ActivityGroup#validateNotContained(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Not Contained</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.ActivityGroup#validateNotContained(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateNotContained__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.StructuredActivityNode#containingActivity() <em>Containing Activity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.StructuredActivityNode#containingActivity()
	 * @generated
	 */
	public void testContainingActivity() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.StructuredActivityNode#validateOutputPinEdges(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Output Pin Edges</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.StructuredActivityNode#validateOutputPinEdges(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateOutputPinEdges__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.StructuredActivityNode#validateEdges(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Edges</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.StructuredActivityNode#validateEdges(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateEdges__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.StructuredActivityNode#validateInputPinEdges(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Input Pin Edges</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.StructuredActivityNode#validateInputPinEdges(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateInputPinEdges__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.StructuredActivityNode#sourceNodes() <em>Source Nodes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.StructuredActivityNode#sourceNodes()
	 * @generated
	 */
	public void testSourceNodes() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.StructuredActivityNode#targetNodes() <em>Target Nodes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.StructuredActivityNode#targetNodes()
	 * @generated
	 */
	public void testTargetNodes() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.StructuredActivityNode#allActions() <em>All Actions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.StructuredActivityNode#allActions()
	 * @generated
	 */
	@Override
	public void testAllActions() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.StructuredActivityNode#allOwnedNodes() <em>All Owned Nodes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.StructuredActivityNode#allOwnedNodes()
	 * @generated
	 */
	@Override
	public void testAllOwnedNodes() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.ActivityGroup#getInActivity() <em>In Activity</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.ActivityGroup#getInActivity()
	 * @generated NOT
	 */
	public void testGetInActivity() {
		Activity activity = UMLFactory.eINSTANCE.createActivity();
		activity.getStructuredNodes().add(getFixture());

		assertEquals(activity, getFixture().getInActivity());

		activity.getGroups().remove(getFixture());

		assertNull(getFixture().getInActivity());
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.ActivityGroup#setInActivity(org.eclipse.uml2.uml.Activity) <em>In Activity</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.ActivityGroup#setInActivity(org.eclipse.uml2.uml.Activity)
	 * @generated NOT
	 */
	public void testSetInActivity() {
		Activity activity1 = UMLFactory.eINSTANCE.createActivity();
		getFixture().setInActivity(activity1);

		assertTrue(activity1.getStructuredNodes().contains(getFixture()));
		assertTrue(activity1.getGroups().contains(getFixture()));

		Activity activity2 = UMLFactory.eINSTANCE.createActivity();
		getFixture().setInActivity(activity2);

		assertFalse(activity1.getStructuredNodes().contains(getFixture()));
		assertFalse(activity1.getGroups().contains(getFixture()));
		assertTrue(activity2.getStructuredNodes().contains(getFixture()));
		assertTrue(activity2.getGroups().contains(getFixture()));

		getFixture().setInActivity(null);

		assertFalse(activity2.getStructuredNodes().contains(getFixture()));
		assertFalse(activity2.getGroups().contains(getFixture()));
	}
} //StructuredActivityNodeTest
