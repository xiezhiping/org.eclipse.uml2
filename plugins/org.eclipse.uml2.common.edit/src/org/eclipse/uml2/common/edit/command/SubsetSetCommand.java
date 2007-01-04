/*
 * Copyright (c) 2003, 2007 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: SubsetSetCommand.java,v 1.4 2007/01/04 18:53:35 khussey Exp $
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

@Deprecated
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

	@Override
	public void execute() {

		if (supersetFeatures != null) {

			if (value != null) {

				for (int i = 0; i < supersetFeatures.length; i++) {

					if (supersetFeatures[i].isMany()) {
						@SuppressWarnings("unchecked")
						EList<EObject> values = (EList<EObject>) owner
							.eGet(supersetFeatures[i]);

						if (!values.contains(value)) {

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