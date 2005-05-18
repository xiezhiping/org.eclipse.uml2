/*
 * Copyright (c) 2003, 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: SubsetSetCommand.java,v 1.4 2005/05/18 16:40:46 khussey Exp $
 */
package org.eclipse.uml2.edit.internal.command;

import java.util.Collections;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;

/**
 * @deprecated Use org.eclipse.uml2.common.edit.command.SubsetSetCommand instead.
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

		if (null != value) {

			for (int i = 0; i < supersetFeatures.length; i++) {

				if (supersetFeatures[i].isMany()) {

					if (!((EList) owner.eGet(supersetFeatures[i]))
						.contains(value)) {
						appendAndExecute(AddCommand.create(domain, owner,
							supersetFeatures[i], Collections.singleton(value),
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

		super.execute();
	}

}