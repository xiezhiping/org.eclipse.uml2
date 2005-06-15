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
 * $Id: DeploymentTarget.java,v 1.8 2005/06/15 20:06:01 khussey Exp $
 */
package org.eclipse.uml2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deployment Target</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A deployment target is the location for a deployed artifact. In the metamodel, DeploymentTarget is an abstract metaclass that is a specialization of NamedElement. A DeploymentTarget owns a set of Deployments. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.DeploymentTarget#getDeployments <em>Deployment</em>}</li>
 *   <li>{@link org.eclipse.uml2.DeploymentTarget#getDeployedElements <em>Deployed Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.UML2Package#getDeploymentTarget()
 * @model abstract="true"
 * @generated
 */
public interface DeploymentTarget extends NamedElement{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Deployment</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.Deployment}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.Deployment#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deployment</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployment</em>' containment reference list.
	 * @see org.eclipse.uml2.UML2Package#getDeploymentTarget_Deployment()
	 * @see org.eclipse.uml2.Deployment#getLocation
	 * @model type="org.eclipse.uml2.Deployment" opposite="location" containment="true" ordered="false"
	 * @generated
	 */
	EList getDeployments();


	/**
	 * Retrieves the {@link org.eclipse.uml2.Deployment} with the specified '<em><b>Name</b></em>' from the '<em><b>Deployment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.Deployment} to retrieve.
	 * @return The {@link org.eclipse.uml2.Deployment} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getDeployments()
	 * @generated
	 */
    Deployment getDeployment(String name);

    /**
     * Creates a {@link org.eclipse.uml2.Deployment} and appends it to the '<em><b>Deployment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.Deployment} to create.
	 * @return The new {@link org.eclipse.uml2.Deployment}.
	 * @see #getDeployments()
	 * @generated NOT
	 * @deprecated Use #createDeployment() instead.
     */
    Deployment createDeployment(EClass eClass);

	/**
	 * Creates a {@link org.eclipse.uml2.Deployment} and appends it to the '<em><b>Deployment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The new {@link org.eclipse.uml2.Deployment}.
	 * @see #getDeployments()
	 * @generated
	 */
    Deployment createDeployment();

	/**
	 * Returns the value of the '<em><b>Deployed Element</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.PackageableElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deployed Element</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployed Element</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getDeploymentTarget_DeployedElement()
	 * @model type="org.eclipse.uml2.PackageableElement" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList getDeployedElements();


	/**
	 * Retrieves the {@link org.eclipse.uml2.PackageableElement} with the specified '<em><b>Name</b></em>' from the '<em><b>Deployed Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.PackageableElement} to retrieve.
	 * @return The {@link org.eclipse.uml2.PackageableElement} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getDeployedElements()
	 * @generated
	 */
    PackageableElement getDeployedElement(String name);

} // DeploymentTarget
