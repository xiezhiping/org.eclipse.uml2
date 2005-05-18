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
 * $Id: NodeTest.java,v 1.2 2005/05/18 17:04:27 khussey Exp $
 */
package org.eclipse.uml2.tests;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import junit.textui.TestRunner;

import org.eclipse.uml2.Node;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.uml2.Artifact;
import org.eclipse.uml2.Deployment;
import org.eclipse.uml2.Manifestation;
import org.eclipse.uml2.PackageableElement;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.DeploymentTarget#getDeployedElements() <em>Deployed Element</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class NodeTest extends ClassTest {

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
		TestRunner.run(NodeTest.class);
	}

	/**
	 * Constructs a new Node test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Node test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Node getFixture() {
		return (Node)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(UML2Factory.eINSTANCE.createNode());
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

		assertTrue(getFixture().getOwnedElements().containsAll(getFixture().getDeployments()));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Class#getNestedClassifiers() <em>Nested Classifier</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Class#getNestedClassifiers()
	 * @generated
	 */
	public void testGetNestedClassifiersGen() {
		// TODO: implement this redefined feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}
	public void testGetNestedClassifiers() {
		testGetNestedClassifiersGen();

		try {
			getFixture().getNestedClassifiers().add(UML2Factory.eINSTANCE.createClass());
			getFixture().getNestedClassifiers().add(UML2Factory.eINSTANCE.createClass());

			fail();
		} catch (Exception e) {
			getFixture().getNestedClassifiers().add(UML2Factory.eINSTANCE.createNode());
			getFixture().getNestedClassifiers().add(UML2Factory.eINSTANCE.createNode());

			assertEquals(2, getFixture().getNestedClassifiers().size());
			assertTrue(getFixture().getNestedNodes().containsAll(getFixture().getNestedClassifiers()));
		}
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.ElementImplTest#setUpOwnedElements()
	 */
	protected void setUpOwnedElements() {
		super.setUpOwnedElements();

		getFixture().getDeployments().add(UML2Factory.eINSTANCE.createDeployment());
		getFixture().getDeployments().add(UML2Factory.eINSTANCE.createDeployment());
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.NamespaceImplTest#setUpOwnedMembers()
	 */
	protected void setUpOwnedMembers() {
		getFixture().getOwnedRules().add(UML2Factory.eINSTANCE.createConstraint());
		getFixture().getOwnedRules().add(UML2Factory.eINSTANCE.createConstraint());

		getFixture().getOwnedUseCases().add(UML2Factory.eINSTANCE.createUseCase());
		getFixture().getOwnedUseCases().add(UML2Factory.eINSTANCE.createUseCase());

		getFixture().getOwnedAttributes().add(UML2Factory.eINSTANCE.createProperty());
		getFixture().getOwnedAttributes().add(UML2Factory.eINSTANCE.createProperty());

		getFixture().getOwnedConnectors().add(UML2Factory.eINSTANCE.createConnector());
		getFixture().getOwnedConnectors().add(UML2Factory.eINSTANCE.createConnector());

		getFixture().getOwnedPorts().add(UML2Factory.eINSTANCE.createPort());
		getFixture().getOwnedPorts().add(UML2Factory.eINSTANCE.createPort());

		getFixture().getNestedClassifiers().add(UML2Factory.eINSTANCE.createNode());
		getFixture().getNestedClassifiers().add(UML2Factory.eINSTANCE.createNode());

		getFixture().getOwnedOperations().add(UML2Factory.eINSTANCE.createOperation());
		getFixture().getOwnedOperations().add(UML2Factory.eINSTANCE.createOperation());

		getFixture().getOwnedReceptions().add(UML2Factory.eINSTANCE.createReception());
		getFixture().getOwnedReceptions().add(UML2Factory.eINSTANCE.createReception());
	}

} //NodeImplTest
