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
 * $Id: SupersetRemoveCommand.java,v 1.2 2006/01/05 13:49:51 khussey Exp $
 */
package org.eclipse.uml2.common.edit.command;

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

		if (subsetFeatures != null) {

			for (Iterator elements = collection.iterator(); elements.hasNext();) {
				Object element = elements.next();

				for (int i = 0; i < subsetFeatures.length; i++) {

					if (subsetFeatures[i].isMany()) {

						if (((EList) owner.eGet(subsetFeatures[i]))
							.contains(element)) {
							appendAndExecute(RemoveCommand.create(domain,
								owner, subsetFeatures[i], Collections
									.singleton(element)));
						}
					} else {

						if (element == owner.eGet(subsetFeatures[i])) {
							EReference subsetReference = (EReference) subsetFeatures[i];

							appendAndExecute(subsetReference.isContainer()
								&& !subsetReference.getEOpposite().isMany()
								? new SetCommand(domain, owner,
									subsetFeatures[i], null)
								: SetCommand.create(domain, owner,
									subsetFeatures[i], null));
						}
					}
				}
			}
		}

		super.execute();
	}

}