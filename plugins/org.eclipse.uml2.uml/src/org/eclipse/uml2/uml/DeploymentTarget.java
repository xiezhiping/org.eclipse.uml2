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
 * $Id: DeploymentTarget.java,v 1.3 2006/02/21 16:12:19 khussey Exp $
 */
package org.eclipse.uml2.uml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deployment Target</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * In the metamodel, DeploymentTarget is an abstract metaclass that is a specialization of NamedElement. A DeploymentTarget owns a set of Deployments.
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The set of Deployments for a DeploymentTarget.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Deployment</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getDeploymentTarget_Deployment()
	 * @see org.eclipse.uml2.uml.Deployment#getLocation
	 * @model type="org.eclipse.uml2.uml.Deployment" opposite="location" containment="true" ordered="false"
	 * @generated
	 */
	EList getDeployments();

	/**
	 * Creates a {@link org.eclipse.uml2.uml.Deployment} and appends it to the '<em><b>Deployment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The new {@link org.eclipse.uml2.uml.Deployment}.
	 * @see #getDeployments()
	 * @generated
	 */
	Deployment createDeployment();

	/**
	 * Retrieves the {@link org.eclipse.uml2.uml.Deployment} with the specified '<em><b>Name</b></em>' from the '<em><b>Deployment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Deployment} to retrieve.
	 * @return The {@link org.eclipse.uml2.uml.Deployment} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getDeployments()
	 * @generated
	 */
	Deployment getDeployment(String name);

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
	 * @model type="org.eclipse.uml2.uml.PackageableElement" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList getDeployedElements();

	/**
	 * Retrieves the {@link org.eclipse.uml2.uml.PackageableElement} with the specified '<em><b>Name</b></em>' from the '<em><b>Deployed Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.PackageableElement} to retrieve.
	 * @return The {@link org.eclipse.uml2.uml.PackageableElement} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getDeployedElements()
	 * @generated
	 */
	PackageableElement getDeployedElement(String name);

} // DeploymentTarget
