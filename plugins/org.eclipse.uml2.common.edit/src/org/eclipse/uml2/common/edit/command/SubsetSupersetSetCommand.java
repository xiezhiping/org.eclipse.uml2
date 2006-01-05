/*
 * Copyright (c) 2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: SubsetSupersetSetCommand.java,v 1.1 2006/01/05 13:49:51 khussey Exp $
 */
package org.eclipse.uml2.common.edit.command;

import java.util.Collections;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;

public class SubsetSupersetSetCommand
		extends SubsetSupersetCommand {

	protected final Object value;

	public SubsetSupersetSetCommand(EditingDomain domain, EObject owner,
			EStructuralFeature feature, EStructuralFeature[] supersetFeatures,
			EStructuralFeature[] subsetFeatures, Object value) {
		super(domain, owner, feature, supersetFeatures, subsetFeatures,
			new SetCommand(domain, owner, feature, value));

		this.value = value;
	}

	public void execute() {

		if (supersetFeatures != null) {

			if (null != value) {

				for (int i = 0; i < supersetFeatures.length; i++) {

					if (supersetFeatures[i].isMany()) {

						if (!((EList) owner.eGet(supersetFeatures[i]))
							.contains(value)) {
							appendAndExecute(AddCommand.create(domain, owner,
								supersetFeatures[i], Collections
									.singleton(value),
								CommandParameter.NO_INDEX));
						}
					} else {

						if (null == owner.eGet(feature)
							&& value != owner.eGet(supersetFeatures[i])) {
							appendAndExecute(SetCommand.create(domain, owner,
								supersetFeatures[i], value));
						}
					}
				}
			}
		}

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