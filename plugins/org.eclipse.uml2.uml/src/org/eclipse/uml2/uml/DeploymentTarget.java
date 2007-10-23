/*
 * Copyright (c) 2005, 2007 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: DeploymentTarget.java,v 1.9 2007/10/23 15:54:22 jbruck Exp $
 */
package org.eclipse.uml2.uml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deployment Target</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A deployment target is the location for a deployed artifact.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.DeploymentTarget#getDeployments <em>Deployment</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.DeploymentTarget#getDeployedElements <em>Deployed Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getDeploymentTarget()
 * @model abstract="true"
 * @generated
 */
public interface DeploymentTarget
		extends NamedElement {

	/**
	 * Returns the value of the '<em><b>Deployment</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Deployment}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.Deployment#getLocation <em>Location</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Element#getOwnedElements() <em>Owned Element</em>}'</li>
	 *   <li>'{@link org.eclipse.uml2.uml.NamedElement#getClientDependencies() <em>Client Dependency</em>}'</li>
	 * </ul>
	 * </p>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The set of Deployments for a DeploymentTarget.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Deployment</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getDeploymentTarget_Deployment()
	 * @see org.eclipse.uml2.uml.Deployment#getLocation
	 * @model opposite="location" containment="true" resolveProxies="true" ordered="false"
	 * @generated
	 */
	EList<Deployment> getDeployments();

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.Deployment}, with the specified '<em><b>Name</b></em>', and appends it to the '<em><b>Deployment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.Deployment}, or <code>null</code>.
	 * @return The new {@link org.eclipse.uml2.uml.Deployment}.
	 * @see #getDeployments()
	 * @generated
	 */
	Deployment createDeployment(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Deployment} with the specified '<em><b>Name</b></em>' from the '<em><b>Deployment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Deployment} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.Deployment} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getDeployments()
	 * @generated
	 */
	Deployment getDeployment(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Deployment} with the specified '<em><b>Name</b></em>' from the '<em><b>Deployment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Deployment} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param createOnDemand Whether to create a {@link org.eclipse.uml2.uml.Deployment} on demand if not found.
	 * @return The first {@link org.eclipse.uml2.uml.Deployment} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getDeployments()
	 * @generated
	 */
	Deployment getDeployment(String name, boolean ignoreCase,
			boolean createOnDemand);

	/**
	 * Returns the value of the '<em><b>Deployed Element</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.PackageableElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The set of elements that are manifested in an Artifact that is involved in Deployment to a DeploymentTarget.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Deployed Element</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getDeploymentTarget_DeployedElement()
	 * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<PackageableElement> getDeployedElements();

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.PackageableElement} with the specified '<em><b>Name</b></em>' from the '<em><b>Deployed Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.PackageableElement} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.PackageableElement} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getDeployedElements()
	 * @generated
	 */
	PackageableElement getDeployedElement(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.PackageableElement} with the specified '<em><b>Name</b></em>' from the '<em><b>Deployed Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.PackageableElement} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.PackageableElement} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.PackageableElement} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getDeployedElements()
	 * @generated
	 */
	PackageableElement getDeployedElement(String name, boolean ignoreCase,
			EClass eClass);

} // DeploymentTarget
