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
 * $Id: DeploymentTargetTest.java,v 1.1 2005/04/04 20:06:06 khussey Exp $
 */
package org.eclipse.uml2.tests;

import org.eclipse.uml2.DeploymentTarget;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.uml2.Artifact;
import org.eclipse.uml2.Deployment;
import org.eclipse.uml2.Manifestation;
import org.eclipse.uml2.PackageableElement;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Deployment Target</b></em>'.
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
 * </ul>
 * </p>
 * @generated
 */
public abstract class DeploymentTargetTest extends NamedElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2003, 2005 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Constructs a new Deployment Target test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentTargetTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Deployment Target test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private DeploymentTarget getFixture() {
		return (DeploymentTarget)fixture;
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
			Deployment deployment = UML2Factory.eINSTANCE.createDeployment();

			Artifact deployedArtifact = UML2Factory.eINSTANCE.createArtifact();

			Manifestation manifestation = UML2Factory.eINSTANCE.createManifestation();
			manifestation.setUtilizedElement((PackageableElement) utilizedElements.next());

			deployedArtifact.getManifestations().add(manifestation);

			deployment.getDeployedArtifacts().add(deployedArtifact);

			getFixture().getDeployments().add(deployment);
		}

		assertTrue(getFixture().getDeployedElements().containsAll(packageableElements));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.DeploymentTarget#getOwnedElements() <em>Get Owned Elements</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.DeploymentTarget#getOwnedElements()
	 * @generated
	 */
	public void testGetOwnedElementsGen() {
		// TODO: implement this getter operation test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	public void testGetOwnedElements() {
		testGetOwnedElementsGen();
		
		super.testGetOwnedElements();

		assertTrue(getFixture().getOwnedElements().containsAll(getFixture().getDeployments()));
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

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.ElementImplTest#setUpOwnedElements()
	 */
	protected void setUpOwnedElements() {
		super.setUpOwnedElements();

		getFixture().getDeployments().add(UML2Factory.eINSTANCE.createDeployment());
		getFixture().getDeployments().add(UML2Factory.eINSTANCE.createDeployment());
	}

} //DeploymentTargetImplTest
