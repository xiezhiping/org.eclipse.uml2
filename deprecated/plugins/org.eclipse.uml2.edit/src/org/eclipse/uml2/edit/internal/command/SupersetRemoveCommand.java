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

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;

/**
 *
 */
public class SupersetRemoveCommand
	extends SupersetCommand {

	protected final Collection collection;

	public SupersetRemoveCommand(EditingDomain domain, EObject owner,
			EStructuralFeature feature, EStructuralFeature[] subsetFeatures,
			Collection collection) {
		super(domain, owner, feature, subsetFeatures, new RemoveCommand(domain,
			owner, feature, collection));

		this.collection = collection;
	}

	/**
	 * @see org.eclipse.emf.common.command.Command#execute()
	 */
	public void execute() {

		for (Iterator elements = collection.iterator(); elements.hasNext();) {
			Object element = elements.next();

			for (int i = 0; i < subsetFeatures.length; i++) {

				if (subsetFeatures[i].isMany()) {

					if (((EList) owner.eGet(subsetFeatures[i]))
						.contains(element)) {
						appendAndExecute(RemoveCommand.create(domain, owner,
							subsetFeatures[i], Collections.singleton(element)));
					}
				} else {

					if (element == owner.eGet(subsetFeatures[i])) {
						EReference subsetReference = (EReference) subsetFeatures[i];

						appendAndExecute(subsetReference.isContainer()
							&& !subsetReference.getEOpposite().isMany()
							? new SetCommand(domain, owner, subsetFeatures[i],
								null) : SetCommand.create(domain, owner,
								subsetFeatures[i], null));
					}
				}
			}
		}

		super.execute();
	}

}