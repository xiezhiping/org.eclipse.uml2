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
 * $Id: DeploymentImplTest.java,v 1.3 2005/03/15 18:51:29 khussey Exp $
 */
package org.eclipse.uml2.impl.tests;

import java.util.Iterator;

import junit.textui.TestRunner;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.uml2.DeployedArtifact;
import org.eclipse.uml2.DeploymentTarget;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.impl.DeploymentImpl;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Deployment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.DeploymentImpl#getDeployedArtifacts() <em>Deployed Artifact</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.DeploymentImpl#getLocation() <em>Location</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.DeploymentImpl#getSuppliers() <em>Get Suppliers</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.DeploymentImpl#getTargets() <em>Get Targets</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.DeploymentImpl#getSources() <em>Get Sources</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.DeploymentImpl#getClients() <em>Get Clients</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.DeploymentImpl#getOwnedElements() <em>Get Owned Elements</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class DeploymentImplTest extends DependencyImplTest {

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
		TestRunner.run(DeploymentImplTest.class);
	}

	/**
	 * Constructs a new Deployment test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentImplTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Deployment test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private DeploymentImpl getFixture() {
		return (DeploymentImpl) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture((DeploymentImpl) UML2Factory.eINSTANCE.createDeployment());
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
	 * Tests the '{@link org.eclipse.uml2.impl.DeploymentImpl#getDeployedArtifacts() <em>Deployed Artifact</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.DeploymentImpl#getDeployedArtifacts()
	 * @generated
	 */
	public void testGetDeployedArtifactsGen() {
		// TODO: implement this feature getter test method
	}

	public void testGetDeployedArtifacts() {
		testGetDeployedArtifactsGen();

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

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.DeploymentImpl#getLocation() <em>Location</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.DeploymentImpl#getLocation()
	 * @generated
	 */
	public void testGetLocationGen() {
		// TODO: implement this feature getter test method
	}

	public void testGetLocation() {
		testGetLocationGen();

		for (Iterator eAllSubClasses = getEAllSubClasses(UML2Package.eINSTANCE.getDeploymentTarget()).iterator(); eAllSubClasses.hasNext();) {
			DeploymentTarget deploymentTarget = (DeploymentTarget) UML2Factory.eINSTANCE.create((EClass) eAllSubClasses.next());

			getFixture().setLocation(deploymentTarget);

			assertSame(deploymentTarget, getFixture().getLocation());

			getFixture().setLocation(null);

			assertSame(null, getFixture().getLocation());
		}
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.DeploymentImpl#setLocation() <em>Location</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.DeploymentImpl#setLocation()
	 * @generated
	 */
	public void testSetLocationGen() {
		// TODO: implement this feature setter test method
	}

	public void testSetLocation() {
		testSetLocationGen();

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

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.DeploymentImpl#getSuppliers() <em>Get Suppliers</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.DeploymentImpl#getSuppliers()
	 * @generated
	 */
	public void testGetSuppliersGen() {
		// TODO: implement this getter operation test method
	}

	public void testGetSuppliers() {
		testGetSuppliersGen();
		
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

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.DeploymentImpl#getTargets() <em>Get Targets</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.DeploymentImpl#getTargets()
	 * @generated
	 */
	public void testGetTargetsGen() {
		// TODO: implement this getter operation test method
	}

	public void testGetTargets() {
		testGetTargetsGen();
		
		super.testGetTargets();

		assertTrue(getFixture().getTargets().containsAll(getFixture().getDeployedArtifacts()));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.DeploymentImpl#getSources() <em>Get Sources</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.DeploymentImpl#getSources()
	 * @generated
	 */
	public void testGetSourcesGen() {
		// TODO: implement this getter operation test method
	}

	public void testGetSources() {
		testGetSourcesGen();
		
		super.testGetSources();

		assertTrue(getFixture().getSources().contains(getFixture().getLocation()));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.DeploymentImpl#getClients() <em>Get Clients</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.DeploymentImpl#getClients()
	 * @generated
	 */
	public void testGetClientsGen() {
		// TODO: implement this getter operation test method
	}

	public void testGetClients() {
		testGetClientsGen();
		
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

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.DeploymentImpl#getOwnedElements() <em>Get Owned Elements</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.DeploymentImpl#getOwnedElements()
	 * @generated
	 */
	public void testGetOwnedElementsGen() {
		// TODO: implement this getter operation test method
	}

	public void testGetOwnedElements() {
		testGetOwnedElementsGen();
		
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
