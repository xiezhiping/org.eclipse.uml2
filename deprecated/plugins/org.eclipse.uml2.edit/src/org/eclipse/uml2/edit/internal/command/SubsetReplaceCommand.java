/*
 * Copyright (c) 2003, 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: SubsetReplaceCommand.java,v 1.3 2005/03/15 18:48:29 khussey Exp $
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
import org.eclipse.emf.edit.command.ReplaceCommand;
import org.eclipse.emf.edit.domain.EditingDomain;

/**
 *
 */
public class SubsetReplaceCommand
	extends SubsetCommand {

	protected final Object value;

	protected final Collection collection;

	public SubsetReplaceCommand(EditingDomain domain, EObject owner,
			EStructuralFeature feature, EStructuralFeature[] supersetFeatures,
			Object value, Collection collection) {

		super(domain, owner, feature, supersetFeatures, new ReplaceCommand(
			domain, owner, feature, value, collection));

		this.value = value;
		this.collection = collection;
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