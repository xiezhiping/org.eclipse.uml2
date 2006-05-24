/*
 * Copyright (c) 2005, 2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: StructuredActivityNodeTest.java,v 1.3 2006/05/24 20:54:03 khussey Exp $
 */
package org.eclipse.uml2.uml.tests;

import junit.textui.TestRunner;

import org.eclipse.uml2.uml.StructuredActivityNode;
import org.eclipse.uml2.uml.UMLFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Structured Activity Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Element#getOwnedElements() <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Namespace#getOwnedMembers() <em>Owned Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Namespace#getMembers() <em>Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Namespace#getImportedMembers() <em>Imported Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ActivityGroup#getSubgroups() <em>Subgroup</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ActivityGroup#getSuperGroup() <em>Super Group</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#getOwner() <em>Owner</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ActivityGroup#getContainedEdges() <em>Contained Edge</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ActivityGroup#getContainedNodes() <em>Contained Node</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.StructuredActivityNode#getActivity() <em>Activity</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Namespace#validateMembersDistinguishable(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Members Distinguishable</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Namespace#createElementImport(org.eclipse.uml2.uml.PackageableElement, org.eclipse.uml2.uml.VisibilityKind) <em>Create Element Import</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Namespace#createPackageImport(org.eclipse.uml2.uml.Package, org.eclipse.uml2.uml.VisibilityKind) <em>Create Package Import</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Namespace#getImportedElements() <em>Get Imported Elements</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Namespace#getImportedPackages() <em>Get Imported Packages</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Namespace#getNamesOfMember(org.eclipse.uml2.uml.NamedElement) <em>Get Names Of Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Namespace#membersAreDistinguishable() <em>Members Are Distinguishable</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Namespace#importMembers(org.eclipse.emf.common.util.EList) <em>Import Members</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Namespace#excludeCollisions(org.eclipse.emf.common.util.EList) <em>Exclude Collisions</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ActivityGroup#validateNodesAndEdges(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nodes And Edges</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ActivityGroup#validateNotContained(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Not Contained</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ActivityGroup#validateGroupOwned(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Group Owned</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.StructuredActivityNode#validateEdges(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Edges</em>}</li>
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
	private StructuredActivityNode getFixture() {
		return (StructuredActivityNode) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
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
	protected void tearDown()
			throws Exception {
		setFixture(null);
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Element#getOwnedElements() <em>Owned Element</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Element#getOwnedElements()
	 * @generated
	 */
	public void testGetOwnedElements() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Namespace#getOwnedMembers() <em>Owned Member</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Namespace#getOwnedMembers()
	 * @generated
	 */
	public void testGetOwnedMembers() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Namespace#getMembers() <em>Member</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Namespace#getMembers()
	 * @generated
	 */
	public void testGetMembers() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
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
	 * Tests the '{@link org.eclipse.uml2.uml.ActivityGroup#getSubgroups() <em>Subgroup</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.ActivityGroup#getSubgroups()
	 * @generated
	 */
	public void testGetSubgroups() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.StructuredActivityNode#getActivity() <em>Activity</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.StructuredActivityNode#getActivity()
	 * @generated
	 */
	public void testGetActivity() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.StructuredActivityNode#setActivity(org.eclipse.uml2.uml.Activity) <em>Activity</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.StructuredActivityNode#setActivity(org.eclipse.uml2.uml.Activity)
	 * @generated
	 */
	public void testSetActivity() {
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
	 * Tests the '{@link org.eclipse.uml2.uml.ActivityGroup#validateGroupOwned(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Group Owned</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.ActivityGroup#validateGroupOwned(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateGroupOwned__DiagnosticChain_Map() {
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
	 * Tests the '{@link org.eclipse.uml2.uml.ActivityGroup#getSuperGroup() <em>Super Group</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.ActivityGroup#getSuperGroup()
	 * @generated
	 */
	public void testGetSuperGroup() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Element#getOwner() <em>Owner</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Element#getOwner()
	 * @generated
	 */
	public void testGetOwner() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.ActivityGroup#getContainedEdges() <em>Contained Edge</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.ActivityGroup#getContainedEdges()
	 * @generated
	 */
	public void testGetContainedEdges() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.ActivityGroup#getContainedNodes() <em>Contained Node</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.ActivityGroup#getContainedNodes()
	 * @generated
	 */
	public void testGetContainedNodes() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.ActivityGroup#getInActivity() <em>In Activity</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.ActivityGroup#getInActivity()
	 * @generated
	 */
	public void testGetInActivity() {
		// TODO: implement this redefined feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.ActivityGroup#setInActivity(org.eclipse.uml2.uml.Activity) <em>In Activity</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.ActivityGroup#setInActivity(org.eclipse.uml2.uml.Activity)
	 * @generated
	 */
	public void testSetInActivity() {
		// TODO: implement this redefined feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}
} //StructuredActivityNodeTest
