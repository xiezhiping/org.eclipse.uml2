/*
 * Copyright (c) 2006, 2007 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: SubsetSupersetReplaceCommand.java,v 1.3 2007/01/04 18:53:35 khussey Exp $
 */
package org.eclipse.uml2.common.edit.command;

import java.util.Collection;
import java.util.Collections;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.command.ReplaceCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;

public class SubsetSupersetReplaceCommand
		extends SubsetSupersetCommand {

	protected final Object value;

	protected final Collection<?> collection;

	public SubsetSupersetReplaceCommand(EditingDomain domain, EObject owner,
			EStructuralFeature feature, EStructuralFeature[] supersetFeatures,
			EStructuralFeature[] subsetFeatures, Object value,
			Collection<?> collection) {

		super(domain, owner, feature, supersetFeatures, subsetFeatures,
			new ReplaceCommand(domain, owner, feature, value, collection));

		this.value = value;
		this.collection = collection;
	}

	@Override
	public void execute() {

		if (supersetFeatures != null) {

			for (Object element : collection) {

				for (int i = 0; i < supersetFeatures.length; i++) {

					if (supersetFeatures[i].isMany()) {
						@SuppressWarnings("unchecked")
						EList<EObject> values = (EList<EObject>) owner
							.eGet(supersetFeatures[i]);

						if (!values.contains(element)) {
							appendAndExecute(AddCommand.create(domain, owner,
								supersetFeatures[i], Collections
									.singleton(element),
								CommandParameter.NO_INDEX));
						}
					}
				}
			}
		}

		if (subsetFeatures != null) {

			for (int i = 0; i < subsetFeatures.length; i++) {

				if (subsetFeatures[i].isMany()) {
					@SuppressWarnings("unchecked")
					EList<EObject> values = (EList<EObject>) owner
						.eGet(subsetFeatures[i]);

					if (values.contains(value)) {
						appendAndExecute(RemoveCommand.create(domain, owner,
							subsetFeatures[i], Collections.singleton(value)));
					}
				} else {

					if (value == owner.eGet(subsetFeatures[i])) {
						EReference subsetReference = (EReference) subsetFeatures[i];

						appendAndExecute(subsetReference.isContainer()
							&& !subsetReference.getEOpposite().isMany()
							? new SetCommand(domain, owner, subsetFeatures[i],
								null)
							: SetCommand.create(domain, owner,
								subsetFeatures[i], null));
					}
				}
			}
		}

		super.execute();
	}

}