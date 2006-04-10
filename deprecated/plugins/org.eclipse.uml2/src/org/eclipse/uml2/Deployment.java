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
 * $Id: Deployment.java,v 1.10 2006/04/10 20:40:27 khussey Exp $
 */
package org.eclipse.uml2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deployment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.Deployment#getDeployedArtifacts <em>Deployed Artifact</em>}</li>
 *   <li>{@link org.eclipse.uml2.Deployment#getLocation <em>Location</em>}</li>
 *   <li>{@link org.eclipse.uml2.Deployment#getConfigurations <em>Configuration</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.UML2Package#getDeployment()
 * @model
 * @generated
 */
public interface Deployment extends Dependency {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Deployed Artifact</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.DeployedArtifact}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deployed Artifact</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployed Artifact</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getDeployment_DeployedArtifact()
	 * @model type="org.eclipse.uml2.DeployedArtifact" ordered="false"
	 * @generated
	 */
	EList getDeployedArtifacts();


	/**
	 * Retrieves the first {@link org.eclipse.uml2.DeployedArtifact} with the specified '<em><b>Name</b></em>' from the '<em><b>Deployed Artifact</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.DeployedArtifact} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.DeployedArtifact} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getDeployedArtifacts()
	 * @generated
	 */
    DeployedArtifact getDeployedArtifact(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.DeployedArtifact} with the specified '<em><b>Name</b></em>' from the '<em><b>Deployed Artifact</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.DeployedArtifact} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.DeployedArtifact} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.DeployedArtifact} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getDeployedArtifacts()
	 * @generated
	 */
	DeployedArtifact getDeployedArtifact(String name, boolean ignoreCase, EClass eClass);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.DeploymentTarget#getDeployments <em>Deployment</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' container reference.
	 * @see #setLocation(DeploymentTarget)
	 * @see org.eclipse.uml2.UML2Package#getDeployment_Location()
	 * @see org.eclipse.uml2.DeploymentTarget#getDeployments
	 * @model opposite="deployment" resolveProxies="false" required="true"
	 * @generated
	 */
	DeploymentTarget getLocation();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.Deployment#getLocation <em>Location</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' container reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(DeploymentTarget value);


	/**
	 * Returns the value of the '<em><b>Configuration</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.DeploymentSpecification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configuration</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration</em>' containment reference list.
	 * @see org.eclipse.uml2.UML2Package#getDeployment_Configuration()
	 * @model type="org.eclipse.uml2.DeploymentSpecification" containment="true" resolveProxies="false" ordered="false"
	 * @generated
	 */
	EList getConfigurations();


	/**
	 * Retrieves the first {@link org.eclipse.uml2.DeploymentSpecification} with the specified '<em><b>Name</b></em>' from the '<em><b>Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.DeploymentSpecification} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.DeploymentSpecification} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getConfigurations()
	 * @generated
	 */
    DeploymentSpecification getConfiguration(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.DeploymentSpecification} with the specified '<em><b>Name</b></em>' from the '<em><b>Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.DeploymentSpecification} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @return The first {@link org.eclipse.uml2.DeploymentSpecification} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getConfigurations()
	 * @generated
	 */
	DeploymentSpecification getConfiguration(String name, boolean ignoreCase);


    /**
     * Creates a {@link org.eclipse.uml2.DeploymentSpecification} and appends it to the '<em><b>Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.DeploymentSpecification} to create.
	 * @return The new {@link org.eclipse.uml2.DeploymentSpecification}.
	 * @see #getConfigurations()
	 * @generated NOT
	 * @deprecated Use #createConfiguration() instead.
     */
    DeploymentSpecification createConfiguration(EClass eClass);

	/**
	 * Creates a {@link org.eclipse.uml2.DeploymentSpecification} and appends it to the '<em><b>Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The new {@link org.eclipse.uml2.DeploymentSpecification}.
	 * @see #getConfigurations()
	 * @generated NOT
	 */
    DeploymentSpecification createConfiguration();

} // Deployment
