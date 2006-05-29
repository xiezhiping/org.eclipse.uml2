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
 * $Id: DeploymentTest.java,v 1.4 2006/05/29 17:27:34 khussey Exp $
 */
package org.eclipse.uml2.tests;

import java.util.Iterator;

import junit.textui.TestRunner;

import org.eclipse.uml2.Deployment;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.uml2.DeployedArtifact;
import org.eclipse.uml2.DeploymentTarget;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Deployment</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DeploymentTest extends DependencyTest {

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
		TestRunner.run(DeploymentTest.class);
	}

	/**
	 * Constructs a new Deployment test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Deployment test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Deployment getFixture() {
		return (Deployment)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(UML2Factory.eINSTANCE.createDeployment());
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


	public void testGetDeployedArtifacts() {

		for (Iterator eAllSubClasses = getEAllSubClasses(UML2Package.eINSTANCE.getDeployedArtifact()).iterator(); eAllSubClasses.hasNext();) {
			DeployedArtifact deployedArtifact = (DeployedArtifact) UML2Factory.eINSTANCE.create((EClass) eAllSubClasses.next());

			getFixture().getDeployedArtifacts().add(deployedArtifact);

			assertTrue(getFixture().getDeployedArtifacts().contains(deployedArtifact));
			assertTrue(getFixture().getSuppliers().contains(deployedArtifact));

			getFixture().getDeployedArtifacts().remove(deployedArtifact);

			assertFalse(getFixture().getDeployedArtifacts().contains(deployedArtifact));
			assertTrue(getFixture().getSuppliers().contains(deployedArtifact));
		}
	}

	public void testGetLocation() {

		for (Iterator eAllSubClasses = getEAllSubClasses(UML2Package.eINSTANCE.getDeploymentTarget()).iterator(); eAllSubClasses.hasNext();) {
			DeploymentTarget deploymentTarget = (DeploymentTarget) UML2Factory.eINSTANCE.create((EClass) eAllSubClasses.next());

			getFixture().setLocation(deploymentTarget);

			assertSame(deploymentTarget, getFixture().getLocation());

			getFixture().setLocation(null);

			assertSame(null, getFixture().getLocation());
		}
	}

	public void testSetLocation() {

		for (Iterator eAllSubClasses = getEAllSubClasses(UML2Package.eINSTANCE.getDeploymentTarget()).iterator(); eAllSubClasses.hasNext();) {
			DeploymentTarget deploymentTarget = (DeploymentTarget) UML2Factory.eINSTANCE.create((EClass) eAllSubClasses.next());

			getFixture().setLocation(deploymentTarget);

			assertSame(deploymentTarget, getFixture().getLocation());
			assertTrue(deploymentTarget.getDeployments().contains(getFixture()));
			assertTrue(getFixture().getClients().contains(deploymentTarget));

			getFixture().setLocation(null);

			assertSame(null, getFixture().getLocation());
			assertFalse(deploymentTarget.getDeployments().contains(getFixture()));
			assertTrue(getFixture().getClients().contains(deploymentTarget));
		}
	}

	public void testGetSuppliers() {
		super.testGetSuppliers();

		for (Iterator eAllSubClasses = getEAllSubClasses(UML2Package.eINSTANCE.getDeployedArtifact()).iterator(); eAllSubClasses.hasNext();) {
			DeployedArtifact deployedArtifact = (DeployedArtifact) UML2Factory.eINSTANCE.create((EClass) eAllSubClasses.next());

			getFixture().getDeployedArtifacts().add(deployedArtifact);

			getFixture().getSuppliers().remove(deployedArtifact);

			assertFalse(getFixture().getSuppliers().contains(deployedArtifact));
			assertFalse(getFixture().getDeployedArtifacts().contains(deployedArtifact));

			getFixture().getSuppliers().add(deployedArtifact);

			assertTrue(getFixture().getSuppliers().contains(deployedArtifact));
			assertFalse(getFixture().getDeployedArtifacts().contains(deployedArtifact));
		}
	}

	public void testGetTargets() {
		super.testGetTargets();

		assertTrue(getFixture().getTargets().containsAll(getFixture().getDeployedArtifacts()));
	}

	public void testGetSources() {
		super.testGetSources();

		assertTrue(getFixture().getSources().contains(getFixture().getLocation()));
	}

	public void testGetClients() {
		super.testGetClients();

		for (Iterator eAllSubClasses = getEAllSubClasses(UML2Package.eINSTANCE.getDeploymentTarget()).iterator(); eAllSubClasses.hasNext();) {
			DeploymentTarget deploymentTarget = (DeploymentTarget) UML2Factory.eINSTANCE.create((EClass) eAllSubClasses.next());

			getFixture().setLocation(deploymentTarget);

			getFixture().getClients().remove(deploymentTarget);

			assertFalse(getFixture().getClients().contains(deploymentTarget));
			assertFalse(deploymentTarget.getClientDependencies().contains(getFixture()));
			assertSame(null, getFixture().getLocation());

			getFixture().getClients().add(deploymentTarget);

			assertTrue(getFixture().getClients().contains(deploymentTarget));
			assertTrue(deploymentTarget.getClientDependencies().contains(getFixture()));
			assertSame(null, getFixture().getLocation());
		}
	}

	public void testGetOwnedElements() {
		super.testGetOwnedElements();

		assertTrue(getFixture().getOwnedElements().containsAll(getFixture().getConfigurations()));
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.ElementImplTest#setUpOwnedElements()
	 */
	protected void setUpOwnedElements() {
		super.setUpOwnedElements();

		getFixture().getConfigurations().add(UML2Factory.eINSTANCE.createDeploymentSpecification());
		getFixture().getConfigurations().add(UML2Factory.eINSTANCE.createDeploymentSpecification());
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.DependencyImplTest#setUpSources()
	 */
	protected void setUpSources() {
		super.setUpSources();

		getFixture().setLocation(UML2Factory.eINSTANCE.createNode());
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.DependencyImplTest#setUpTargets()
	 */
	protected void setUpTargets() {
		super.setUpTargets();

		getFixture().getDeployedArtifacts().add(UML2Factory.eINSTANCE.createArtifact());
	}

} //DeploymentImplTest
