/*
 * Copyright (c) 2003, 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 */
package org.eclipse.uml2.edit.internal.command;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;

/**
 *
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

		for (int i = 0; i < subsetFeatures.length; i++) {
			Object object = owner.eGet(subsetFeatures[i]);

			if (null != object && value != object) {
				EReference subsetReference = (EReference) subsetFeatures[i];

				appendAndExecute(subsetReference.isContainer()
					&& !subsetReference.getEOpposite().isMany()
					? new SetCommand(domain, owner, subsetFeatures[i], null)
					: SetCommand.create(domain, owner, subsetFeatures[i], null));
			}
		}

		super.execute();
	}

}