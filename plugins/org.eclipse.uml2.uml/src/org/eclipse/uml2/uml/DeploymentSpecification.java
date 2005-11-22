/*
 * Copyright (c) 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: DeploymentSpecification.java,v 1.2 2005/11/22 15:32:38 khussey Exp $
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
 * In the metamodel, a DeploymentSpecification is a subtype of Artifact. It defines a set of deployment properties that are specific to a certain Container type. An instance of a DeploymentSpecification with specific values for these properties may be contained in a complex Artifact.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.DeploymentSpecification#getDeploymentLocation <em>Deployment Location</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.DeploymentSpecification#getExecutionLocation <em>Execution Location</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.DeploymentSpecification#getDeployment <em>Deployment</em>}</li>
 * </ul>
 * </p>
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
	 * The location where an Artifact is deployed onto a Node. This is typically a 'directory' or 'memory address'.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Deployment Location</em>' attribute.
	 * @see #setDeploymentLocation(String)
	 * @see org.eclipse.uml2.uml.UMLPackage#getDeploymentSpecification_DeploymentLocation()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getDeploymentLocation();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.DeploymentSpecification#getDeploymentLocation <em>Deployment Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deployment Location</em>' attribute.
	 * @see #getDeploymentLocation()
	 * @generated
	 */
	void setDeploymentLocation(String value);

	/**
	 * Returns the value of the '<em><b>Execution Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The location where a component Artifact executes. This may be a local or remote location.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Execution Location</em>' attribute.
	 * @see #setExecutionLocation(String)
	 * @see org.eclipse.uml2.uml.UMLPackage#getDeploymentSpecification_ExecutionLocation()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getExecutionLocation();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.DeploymentSpecification#getExecutionLocation <em>Execution Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execution Location</em>' attribute.
	 * @see #getExecutionLocation()
	 * @generated
	 */
	void setExecutionLocation(String value);

	/**
	 * Returns the value of the '<em><b>Deployment</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.Deployment#getConfigurations <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The deployment with which the DeploymentSpecification is associated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Deployment</em>' container reference.
	 * @see #setDeployment(Deployment)
	 * @see org.eclipse.uml2.uml.UMLPackage#getDeploymentSpecification_Deployment()
	 * @see org.eclipse.uml2.uml.Deployment#getConfigurations
	 * @model opposite="configuration" resolveProxies="false" ordered="false"
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
	 * The deployedElements of a DeploymentTarget that are involved in a Deployment that has an associated Deployment-Specification is a kind of Component (i.e. the configured components).
	 * self.deployment->forAll (d | d.location.deployedElements->forAll (de |
	 * 
	 *   de.oclIsKindOf(Component)))
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateDeployedElements(DiagnosticChain diagnostics, Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The DeploymentTarget of a DeploymentSpecification is a kind of ExecutionEnvironment.
	 * result = self.deployment->forAll (d | d.location..oclIsKindOf(ExecutionEnvironment))
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateDeploymentTarget(DiagnosticChain diagnostics, Map context);

} // DeploymentSpecification
