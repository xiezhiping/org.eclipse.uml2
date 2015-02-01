/*
 * Copyright (c) 2005, 2015 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 327039, 351774, 418466, 451350
 *   Christian W. Damus (CEA) - 251963
 *
 */
package org.eclipse.uml2.uml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deployment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A deployment is the allocation of an artifact or artifact instance to a deployment target.
 * A component deployment is the deployment of one or more artifacts or artifact instances to a deployment target, optionally parameterized by a deployment specification. Examples are executables and configuration files.
 * <p>From package UML::Deployments.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Deployment#getConfigurations <em>Configuration</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Deployment#getDeployedArtifacts <em>Deployed Artifact</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Deployment#getLocation <em>Location</em>}</li>
 * </ul>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getDeployment()
 * @model
 * @generated
 */
public interface Deployment
		extends Dependency {

	/**
	 * Returns the value of the '<em><b>Deployed Artifact</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.DeployedArtifact}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Dependency#getSuppliers() <em>Supplier</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Artifacts that are deployed onto a Node. This association specializes the supplier association.
	 * <p>From package UML::Deployments.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Deployed Artifact</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getDeployment_DeployedArtifact()
	 * @model ordered="false"
	 * @generated
	 */
	EList<DeployedArtifact> getDeployedArtifacts();

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.DeployedArtifact} with the specified '<em><b>Name</b></em>' from the '<em><b>Deployed Artifact</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.DeployedArtifact} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.DeployedArtifact} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getDeployedArtifacts()
	 * @generated
	 */
	DeployedArtifact getDeployedArtifact(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.DeployedArtifact} with the specified '<em><b>Name</b></em>' from the '<em><b>Deployed Artifact</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.DeployedArtifact} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.DeployedArtifact} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.DeployedArtifact} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getDeployedArtifacts()
	 * @generated
	 */
	DeployedArtifact getDeployedArtifact(String name, boolean ignoreCase,
			EClass eClass);

	/**
	 * Returns the value of the '<em><b>Configuration</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.DeploymentSpecification}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.DeploymentSpecification#getDeployment <em>Deployment</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Element#getOwnedElements() <em>Owned Element</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The specification of properties that parameterize the deployment and execution of one or more Artifacts.
	 * <p>From package UML::Deployments.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Configuration</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getDeployment_Configuration()
	 * @see org.eclipse.uml2.uml.DeploymentSpecification#getDeployment
	 * @model opposite="deployment" containment="true" resolveProxies="true" ordered="false"
	 * @generated
	 */
	EList<DeploymentSpecification> getConfigurations();

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.DeploymentSpecification}, with the specified '<em><b>Name</b></em>', and appends it to the '<em><b>Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.DeploymentSpecification}, or <code>null</code>.
	 * @return The new {@link org.eclipse.uml2.uml.DeploymentSpecification}.
	 * @see #getConfigurations()
	 * @generated
	 */
	DeploymentSpecification createConfiguration(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.DeploymentSpecification} with the specified '<em><b>Name</b></em>' from the '<em><b>Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.DeploymentSpecification} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.DeploymentSpecification} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getConfigurations()
	 * @generated
	 */
	DeploymentSpecification getConfiguration(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.DeploymentSpecification} with the specified '<em><b>Name</b></em>' from the '<em><b>Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.DeploymentSpecification} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param createOnDemand Whether to create a {@link org.eclipse.uml2.uml.DeploymentSpecification} on demand if not found.
	 * @return The first {@link org.eclipse.uml2.uml.DeploymentSpecification} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getConfigurations()
	 * @generated
	 */
	DeploymentSpecification getConfiguration(String name, boolean ignoreCase,
			boolean createOnDemand);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.DeploymentTarget#getDeployments <em>Deployment</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Dependency#getClients() <em>Client</em>}'</li>
	 *   <li>'{@link org.eclipse.uml2.uml.Element#getOwner() <em>Owner</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The DeployedTarget which is the target of a Deployment.
	 * <p>From package UML::Deployments.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location</em>' container reference.
	 * @see #setLocation(DeploymentTarget)
	 * @see org.eclipse.uml2.uml.UMLPackage#getDeployment_Location()
	 * @see org.eclipse.uml2.uml.DeploymentTarget#getDeployments
	 * @model opposite="deployment" required="true" transient="false" ordered="false"
	 * @generated
	 */
	DeploymentTarget getLocation();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.Deployment#getLocation <em>Location</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' container reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(DeploymentTarget value);

} // Deployment
