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
 * $Id: DeploymentTargetOperations.java,v 1.4 2005/12/12 18:11:59 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.uml2.common.util.UnionEObjectEList;
import org.eclipse.uml2.uml.Artifact;
import org.eclipse.uml2.uml.DeployedArtifact;
import org.eclipse.uml2.uml.Deployment;
import org.eclipse.uml2.uml.DeploymentTarget;
import org.eclipse.uml2.uml.Manifestation;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.UMLPackage;

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
 * @generated not
 */
public final class DeploymentTargetOperations
		extends UMLOperations {

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
	 * @generated NOT
	 */
	public static List getDeployedElements(DeploymentTarget deploymentTarget) {
		List deployedElements = new UniqueEList();

		for (Iterator deployments = deploymentTarget.getDeployments()
			.iterator(); deployments.hasNext();) {

			for (Iterator deployedArtifacts = ((Deployment) deployments.next())
				.getDeployedArtifacts().iterator(); deployedArtifacts.hasNext();) {

				DeployedArtifact deployedArtifact = (DeployedArtifact) deployedArtifacts
					.next();

				if (deployedArtifact instanceof Artifact) {

					for (Iterator manifestations = ((Artifact) deployedArtifact)
						.getManifestations().iterator(); manifestations
						.hasNext();) {

						PackageableElement utilizedElement = (PackageableElement) ((Manifestation) manifestations
							.next())
							.eGet(
								UMLPackage.Literals.MANIFESTATION__UTILIZED_ELEMENT,
								false);

						if (utilizedElement != null) {
							deployedElements.add(utilizedElement);
						}
					}
				}
			}
		}

		return new UnionEObjectEList((InternalEObject) deploymentTarget,
			UMLPackage.Literals.DEPLOYMENT_TARGET__DEPLOYED_ELEMENT,
			deployedElements.size(), deployedElements.toArray());
	}

} // DeploymentTargetOperations