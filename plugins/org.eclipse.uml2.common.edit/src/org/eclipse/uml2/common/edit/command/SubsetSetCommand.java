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
 * $Id: SubsetSetCommand.java,v 1.3 2006/03/01 17:11:12 khussey Exp $
 */
package org.eclipse.uml2.common.edit.command;

import java.util.Collections;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;

/**
 * @deprecated Use SubsetSupersetSetCommand
 */
public class SubsetSetCommand
		extends SubsetCommand {

	protected final Object value;

	public SubsetSetCommand(EditingDomain domain, EObject owner,
			EStructuralFeature feature, EStructuralFeature[] supersetFeatures,
			Object value) {
		super(domain, owner, feature, supersetFeatures, new SetCommand(domain,
			owner, feature, value));

		this.value = value;
	}

	/**
	 * @see org.eclipse.emf.common.command.Command#execute()
	 */
	public void execute() {

		if (supersetFeatures != null) {

			if (value != null) {

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

						if (value != owner.eGet(supersetFeatures[i])) {
							appendAndExecute(SetCommand.create(domain, owner,
								supersetFeatures[i], value));
						}
					}
				}
			}
		}

		super.execute();
	}

}