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
 * $Id: InstanceSpecificationImplTest.java,v 1.1 2004/04/29 14:56:47 khussey Exp $
 */
package org.eclipse.uml2.impl.tests;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import junit.textui.TestRunner;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.uml2.Artifact;
import org.eclipse.uml2.Deployment;
import org.eclipse.uml2.Manifestation;
import org.eclipse.uml2.PackageableElement;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.impl.InstanceSpecificationImpl;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Instance Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.InstanceSpecificationImpl#getDeployments() <em>Deployment</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.InstanceSpecificationImpl#getDeployedElements() <em>Deployed Element</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.InstanceSpecificationImpl#getOwnedElements() <em>Get Owned Elements</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.InstanceSpecificationImpl#getClientDependencies() <em>Get Client Dependencies</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.InstanceSpecificationImpl#validateSlotsAreDefined() <em>Validate Slots Are Defined</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.InstanceSpecificationImpl#validateNoDuplicateSlots() <em>Validate No Duplicate Slots</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.InstanceSpecificationImpl#getOwnedElements() <em>Get Owned Elements</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class InstanceSpecificationImplTest extends PackageableElementImplTest {

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
		TestRunner.run(InstanceSpecificationImplTest.class);
	}

	/**
	 * Constructs a new Instance Specification test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceSpecificationImplTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Instance Specification test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private InstanceSpecificationImpl getFixture() {
		return (InstanceSpecificationImpl) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture((InstanceSpecificationImpl) UML2Factory.eINSTANCE.createInstanceSpecification());
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
	 * Tests the '{@link org.eclipse.uml2.impl.InstanceSpecificationImpl#getDeployments() <em>Deployment</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.InstanceSpecificationImpl#getDeployments()
	 * @generated
	 */
	public void testGetDeployments() {
		// TODO: implement this feature getter test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.InstanceSpecificationImpl#getDeployedElements() <em>Deployed Element</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.InstanceSpecificationImpl#getDeployedElements()
	 * @generated NOT
	 */
	public void testGetDeployedElements() {
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
	 * Tests the '{@link org.eclipse.uml2.impl.InstanceSpecificationImpl#getClientDependencies() <em>Get Client Dependencies</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.InstanceSpecificationImpl#getClientDependencies()
	 * @generated
	 */
	public void testGetClientDependencies() {
		// TODO: implement this getter operation test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.InstanceSpecificationImpl#validateSlotsAreDefined() <em>Validate Slots Are Defined</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.InstanceSpecificationImpl#validateSlotsAreDefined()
	 * @generated
	 */
	public void testValidateSlotsAreDefined() {
		// TODO: implement this operation test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.InstanceSpecificationImpl#validateNoDuplicateSlots() <em>Validate No Duplicate Slots</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.InstanceSpecificationImpl#validateNoDuplicateSlots()
	 * @generated
	 */
	public void testValidateNoDuplicateSlots() {
		// TODO: implement this operation test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.InstanceSpecificationImpl#getOwnedElements() <em>Get Owned Elements</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.InstanceSpecificationImpl#getOwnedElements()
	 * @generated NOT
	 */
	public void testGetOwnedElements() {
		super.testGetOwnedElements();

		assertTrue(getFixture().getOwnedElements().containsAll(getFixture().getSlots()));
		assertTrue(getFixture().getOwnedElements().contains(getFixture().getSpecification()));
	}

	/**
	 * @see org.eclipse.uml2.impl.tests.NamedElementImplTest#setUpNamespace()
	 */
	protected void setUpNamespace() {
		UML2Factory.eINSTANCE.createPackage().getOwnedMembers().add(getFixture());
	}

	/**
	 * @see org.eclipse.uml2.impl.tests.ElementImplTest#setUpOwner()
	 */
	protected void setUpOwner() {
		UML2Factory.eINSTANCE.createTemplateParameter().setOwnedParameteredElement(getFixture());
	}

	/**
	 * @see org.eclipse.uml2.impl.tests.ElementImplTest#setUpOwnedElements()
	 */
	protected void setUpOwnedElements() {
		super.setUpOwnedElements();

		getFixture().getSlots().add(UML2Factory.eINSTANCE.createSlot());
		getFixture().getSlots().add(UML2Factory.eINSTANCE.createSlot());

		getFixture().setSpecification(UML2Factory.eINSTANCE.createInstanceValue());
	}

} //InstanceSpecificationImplTest
