/*
 * Copyright (c) 2005, 2015 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 327039, 418466, 451350
 *   Christian W. Damus (CEA) - 251963
 *
 */
package org.eclipse.uml2.uml;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deployment Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A deployment specification specifies a set of properties that determine execution parameters of a component artifact that is deployed on a node. A deployment specification can be aimed at a specific type of container. An artifact that reifies or implements deployment specification properties is a deployment descriptor.
 * <p>From package UML::Deployments.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.DeploymentSpecification#getDeploymentLocation <em>Deployment Location</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.DeploymentSpecification#getExecutionLocation <em>Execution Location</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.DeploymentSpecification#getDeployment <em>Deployment</em>}</li>
 * </ul>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getDeploymentSpecification()
 * @model
 * @generated
 */
public interface DeploymentSpecification
		extends Artifact {

	/**
	 * Returns the value of the '<em><b>Deployment Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The location where an Artifact is deployed onto a Node. This is typically a 'directory' or 'memory address.'
	 * <p>From package UML::Deployments.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Deployment Location</em>' attribute.
	 * @see #isSetDeploymentLocation()
	 * @see #unsetDeploymentLocation()
	 * @see #setDeploymentLocation(String)
	 * @see org.eclipse.uml2.uml.UMLPackage#getDeploymentSpecification_DeploymentLocation()
	 * @model unsettable="true" dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getDeploymentLocation();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.DeploymentSpecification#getDeploymentLocation <em>Deployment Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deployment Location</em>' attribute.
	 * @see #isSetDeploymentLocation()
	 * @see #unsetDeploymentLocation()
	 * @see #getDeploymentLocation()
	 * @generated
	 */
	void setDeploymentLocation(String value);

	/**
	 * Unsets the value of the '{@link org.eclipse.uml2.uml.DeploymentSpecification#getDeploymentLocation <em>Deployment Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDeploymentLocation()
	 * @see #getDeploymentLocation()
	 * @see #setDeploymentLocation(String)
	 * @generated
	 */
	void unsetDeploymentLocation();

	/**
	 * Returns whether the value of the '{@link org.eclipse.uml2.uml.DeploymentSpecification#getDeploymentLocation <em>Deployment Location</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Deployment Location</em>' attribute is set.
	 * @see #unsetDeploymentLocation()
	 * @see #getDeploymentLocation()
	 * @see #setDeploymentLocation(String)
	 * @generated
	 */
	boolean isSetDeploymentLocation();

	/**
	 * Returns the value of the '<em><b>Execution Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The location where a component Artifact executes. This may be a local or remote location.
	 * <p>From package UML::Deployments.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Execution Location</em>' attribute.
	 * @see #isSetExecutionLocation()
	 * @see #unsetExecutionLocation()
	 * @see #setExecutionLocation(String)
	 * @see org.eclipse.uml2.uml.UMLPackage#getDeploymentSpecification_ExecutionLocation()
	 * @model unsettable="true" dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getExecutionLocation();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.DeploymentSpecification#getExecutionLocation <em>Execution Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execution Location</em>' attribute.
	 * @see #isSetExecutionLocation()
	 * @see #unsetExecutionLocation()
	 * @see #getExecutionLocation()
	 * @generated
	 */
	void setExecutionLocation(String value);

	/**
	 * Unsets the value of the '{@link org.eclipse.uml2.uml.DeploymentSpecification#getExecutionLocation <em>Execution Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetExecutionLocation()
	 * @see #getExecutionLocation()
	 * @see #setExecutionLocation(String)
	 * @generated
	 */
	void unsetExecutionLocation();

	/**
	 * Returns whether the value of the '{@link org.eclipse.uml2.uml.DeploymentSpecification#getExecutionLocation <em>Execution Location</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Execution Location</em>' attribute is set.
	 * @see #unsetExecutionLocation()
	 * @see #getExecutionLocation()
	 * @see #setExecutionLocation(String)
	 * @generated
	 */
	boolean isSetExecutionLocation();

	/**
	 * Returns the value of the '<em><b>Deployment</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.Deployment#getConfigurations <em>Configuration</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Element#getOwner() <em>Owner</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The deployment with which the DeploymentSpecification is associated.
	 * <p>From package UML::Deployments.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Deployment</em>' container reference.
	 * @see #setDeployment(Deployment)
	 * @see org.eclipse.uml2.uml.UMLPackage#getDeploymentSpecification_Deployment()
	 * @see org.eclipse.uml2.uml.Deployment#getConfigurations
	 * @model opposite="configuration" transient="false" ordered="false"
	 * @generated
	 */
	Deployment getDeployment();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.DeploymentSpecification#getDeployment <em>Deployment</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deployment</em>' container reference.
	 * @see #getDeployment()
	 * @generated
	 */
	void setDeployment(Deployment value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The deployedElements of a DeploymentTarget that are involved in a Deployment that has an associated Deployment-Specification is a kind of Component (i.e., the configured components).
	 * deployment->forAll (location.deployedElement->forAll (oclIsKindOf(Component)))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateDeployedElements(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The DeploymentTarget of a DeploymentSpecification is a kind of ExecutionEnvironment.
	 * deployment->forAll (location.oclIsKindOf(ExecutionEnvironment))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateDeploymentTarget(DiagnosticChain diagnostics,
			Map<Object, Object> context);

} // DeploymentSpecification
