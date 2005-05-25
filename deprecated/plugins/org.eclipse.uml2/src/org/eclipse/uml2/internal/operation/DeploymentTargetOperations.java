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
 * $Id: DeploymentTargetOperations.java,v 1.1 2005/05/25 15:21:32 khussey Exp $
 */
package org.eclipse.uml2.internal.operation;

import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.uml2.Artifact;
import org.eclipse.uml2.DeployedArtifact;
import org.eclipse.uml2.Deployment;
import org.eclipse.uml2.DeploymentTarget;
import org.eclipse.uml2.Manifestation;

/**
 * A static utility class that provides operations related to '<em><b>Deployment Target</b></em>'
 * model objects.
 */
public final class DeploymentTargetOperations
		extends UML2Operations {

	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	private DeploymentTargetOperations() {
		super();
	}

	public static EList getDeployedElements(DeploymentTarget deploymentTarget) {
		EList deployedElements = new UniqueEList();

		if (deploymentTarget != null) {

			for (Iterator deployments = deploymentTarget.getDeployments()
				.iterator(); deployments.hasNext();) {

				for (Iterator deployedArtifacts = ((Deployment) deployments
					.next()).getDeployedArtifacts().iterator(); deployedArtifacts
					.hasNext();) {

					DeployedArtifact deployedArtifact = (DeployedArtifact) deployedArtifacts
						.next();

					if (Artifact.class.isInstance(deployedArtifact)) {

						for (Iterator manifestations = ((Artifact) deployedArtifact)
							.getManifestations().iterator(); manifestations
							.hasNext();) {

							deployedElements
								.add(((Manifestation) manifestations.next())
									.getUtilizedElement());
						}
					}
				}
			}
		}

		return deployedElements;
	}

} // DeploymentTargetOperations
