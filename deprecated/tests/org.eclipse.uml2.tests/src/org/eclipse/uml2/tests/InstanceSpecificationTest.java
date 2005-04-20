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
 * $Id: InstanceSpecificationTest.java,v 1.2 2005/04/20 19:00:46 khussey Exp $
 */
package org.eclipse.uml2.tests;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import junit.textui.TestRunner;

import org.eclipse.uml2.InstanceSpecification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.uml2.Artifact;
import org.eclipse.uml2.Deployment;
import org.eclipse.uml2.Manifestation;
import org.eclipse.uml2.PackageableElement;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Instance Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.DeploymentTarget#getDeployments() <em>Deployment</em>}</li>
 *   <li>{@link org.eclipse.uml2.DeploymentTarget#getDeployedElements() <em>Deployed Element</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.DeploymentTarget#getOwnedElements() <em>Get Owned Elements</em>}</li>
 *   <li>{@link org.eclipse.uml2.DeploymentTarget#getClientDependencies() <em>Get Client Dependencies</em>}</li>
 *   <li>{@link org.eclipse.uml2.InstanceSpecification#validateSlotsAreDefined(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Slots Are Defined</em>}</li>
 *   <li>{@link org.eclipse.uml2.InstanceSpecification#validateNoDuplicateSlots(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate No Duplicate Slots</em>}</li>
 *   <li>{@link org.eclipse.uml2.InstanceSpecification#getOwnedElements() <em>Get Owned Elements</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class InstanceSpecificationTest extends PackageableElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2003, 2005 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(InstanceSpecificationTest.class);
	}

	/**
	 * Constructs a new Instance Specification test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceSpecificationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Instance Specification test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private InstanceSpecification getFixture() {
		return (InstanceSpecification)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(UML2Factory.eINSTANCE.createInstanceSpecification());
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
	 * Tests the '{@link org.eclipse.uml2.DeploymentTarget#getDeployments() <em>Deployment</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.DeploymentTarget#getDeployments()
	 * @generated
	 */
	public void testGetDeployments() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.DeploymentTarget#getDeployedElements() <em>Deployed Element</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.DeploymentTarget#getDeployedElements()
	 * @generated
	 */
	public void testGetDeployedElementsGen() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testGetDeployedElements() {
		testGetDeployedElementsGen();
		
		List packageableElements = new ArrayList();

		for (Iterator eAllSubClasses = getEAllSubClasses(UML2Package.eINSTANCE.getPackageableElement()).iterator(); eAllSubClasses.hasNext();) {
			packageableElements.add(UML2Factory.eINSTANCE.create((EClass) eAllSubClasses.next()));
		}

		for (Iterator utilizedElements = packageableElements.iterator(); utilizedElements.hasNext();) {
			PackageableElement utilizedElement = (PackageableElement) utilizedElements.next();

			Deployment deployment = UML2Factory.eINSTANCE.createDeployment();

			Artifact deployedArtifact = UML2Factory.eINSTANCE.createArtifact();

			Manifestation manifestation = UML2Factory.eINSTANCE.createManifestation();
			manifestation.getSuppliers().add(utilizedElement);
			manifestation.setUtilizedElement(utilizedElement);

			deployedArtifact.getManifestations().add(manifestation);

			deployment.getDeployedArtifacts().add(deployedArtifact);

			getFixture().getDeployments().add(deployment);
		}

		assertTrue(getFixture().getDeployedElements().containsAll(packageableElements));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.DeploymentTarget#getClientDependencies() <em>Get Client Dependencies</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.DeploymentTarget#getClientDependencies()
	 * @generated
	 */
	public void testGetClientDependencies() {
		// TODO: implement this getter operation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.InstanceSpecification#validateSlotsAreDefined(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Slots Are Defined</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.InstanceSpecification#validateSlotsAreDefined(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateSlotsAreDefined__DiagnosticChain_Map() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.InstanceSpecification#validateNoDuplicateSlots(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate No Duplicate Slots</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.InstanceSpecification#validateNoDuplicateSlots(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateNoDuplicateSlots__DiagnosticChain_Map() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.InstanceSpecification#getOwnedElements() <em>Get Owned Elements</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.InstanceSpecification#getOwnedElements()
	 * @generated
	 */
	public void testGetOwnedElementsGen() {
		// TODO: implement this getter operation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testGetOwnedElements() {
		testGetOwnedElementsGen();
		
		super.testGetOwnedElements();

		assertTrue(getFixture().getOwnedElements().containsAll(getFixture().getSlots()));
		assertTrue(getFixture().getOwnedElements().contains(getFixture().getSpecification()));
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.NamedElementImplTest#setUpNamespace()
	 */
	protected void setUpNamespace() {
		UML2Factory.eINSTANCE.createPackage().getOwnedMembers().add(getFixture());
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.ElementImplTest#setUpOwner()
	 */
	protected void setUpOwner() {
		UML2Factory.eINSTANCE.createTemplateParameter().setOwnedParameteredElement(getFixture());
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.ElementImplTest#setUpOwnedElements()
	 */
	protected void setUpOwnedElements() {
		super.setUpOwnedElements();

		getFixture().getSlots().add(UML2Factory.eINSTANCE.createSlot());
		getFixture().getSlots().add(UML2Factory.eINSTANCE.createSlot());

		getFixture().setSpecification(UML2Factory.eINSTANCE.createInstanceValue());
	}

} //InstanceSpecificationImplTest
