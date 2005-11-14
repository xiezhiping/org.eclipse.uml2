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
 * $Id: DeploymentTargetOperations.java,v 1.1 2005/11/14 22:25:55 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.List;

import org.eclipse.uml2.uml.DeploymentTarget;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Deployment Target</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.DeploymentTarget#getDeployedElements() <em>Get Deployed Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public final class DeploymentTargetOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private DeploymentTargetOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * result = ((self.deployment->collect(deployedArtifact))->collect(manifestation))->collect(utilizedElement)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static List getDeployedElements(DeploymentTarget deploymentTarget) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

} // DeploymentTargetOperations