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
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.domain.EditingDomain;

/**
 *
 */
public class SubsetAddCommand
	extends SubsetCommand {

	protected final Collection collection;

	protected final int index;

	public SubsetAddCommand(EditingDomain domain, EObject owner,
			EStructuralFeature feature, EStructuralFeature[] supersetFeatures,
			Collection collection, int index) {

		super(domain, owner, feature, supersetFeatures, new AddCommand(domain,
			owner, feature, collection, index));

		this.collection = collection;
		this.index = index;
	}

	/**
	 * @see org.eclipse.emf.common.command.Command#execute()
	 */
	public void execute() {

		for (Iterator elements = collection.iterator(); elements.hasNext();) {
			Object element = elements.next();

			for (int i = 0; i < supersetFeatures.length; i++) {

				if (supersetFeatures[i].isMany()) {

					if (!((EList) owner.eGet(supersetFeatures[i]))
						.contains(element)) {
						appendAndExecute(AddCommand.create(domain, owner,
							supersetFeatures[i],
							Collections.singleton(element),
							CommandParameter.NO_INDEX));
					}
				}
			}
		}

		super.execute();
	}

}