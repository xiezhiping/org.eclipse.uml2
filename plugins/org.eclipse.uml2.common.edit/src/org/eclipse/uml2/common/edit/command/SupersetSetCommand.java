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
 * $Id: SupersetSetCommand.java,v 1.2 2006/01/05 13:49:51 khussey Exp $
 */
package org.eclipse.uml2.common.edit.command;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;

/**
 * @deprecated Use SubsetSupersetSetCommand
 */
public class SupersetSetCommand
		extends SupersetCommand {

	protected final Object value;

	public SupersetSetCommand(EditingDomain domain, EObject owner,
			EStructuralFeature feature, EStructuralFeature[] subsetFeatures,
			Object value) {
		super(domain, owner, feature, subsetFeatures, new SetCommand(domain,
			owner, feature, value));

		this.value = value;
	}

	/**
	 * @see org.eclipse.emf.common.command.Command#execute()
	 */
	public void execute() {

		if (subsetFeatures != null) {

			for (int i = 0; i < subsetFeatures.length; i++) {
				Object object = owner.eGet(subsetFeatures[i]);

				if (null != object && value != object) {
					EReference subsetReference = (EReference) subsetFeatures[i];

					appendAndExecute(subsetReference.isContainer()
						&& !subsetReference.getEOpposite().isMany()
						? new SetCommand(domain, owner, subsetFeatures[i], null)
						: SetCommand.create(domain, owner, subsetFeatures[i],
							null));
				}
			}
		}

		super.execute();
	}

}