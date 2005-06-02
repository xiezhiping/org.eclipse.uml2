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
 * $Id: ApplyStereotypeAction.java,v 1.4 2005/06/02 14:29:46 khussey Exp $
 */
package org.eclipse.uml2.examples.ui.actions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.IdentityCommand;
import org.eclipse.emf.common.command.UnexecutableCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.ui.celleditor.FeatureEditorDialog;
import org.eclipse.jface.action.IAction;
import org.eclipse.uml2.Element;
import org.eclipse.uml2.Stereotype;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.common.edit.command.ChangeCommand;
import org.eclipse.uml2.examples.ui.ExamplesUIPlugin;

/**
 * 
 */
public class ApplyStereotypeAction
		extends UML2CommandAction {

	public ApplyStereotypeAction() {
		super();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.edit.ui.action.CommandAction#createActionCommand(org.eclipse.emf.edit.domain.EditingDomain,
	 *      java.util.Collection)
	 */
	protected Command createActionCommand(EditingDomain editingDomain,
			Collection collection) {

		if (1 == collection.size()
			&& Element.class.isInstance(collection.toArray()[0])) {

			return IdentityCommand.INSTANCE;
		}

		return UnexecutableCommand.INSTANCE;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.IActionDelegate#run(org.eclipse.jface.action.IAction)
	 */
	public void run(IAction action) {

		if (UnexecutableCommand.INSTANCE != command) {
			final Element element = (Element) collection.toArray()[0];

			List choiceOfValues = new ArrayList();

			for (Iterator applicableStereotypes = element
				.getApplicableStereotypes().iterator(); applicableStereotypes
				.hasNext();) {

				Stereotype stereotype = (Stereotype) applicableStereotypes
					.next();

				if (!element.isApplied(stereotype)) {
					choiceOfValues.add(stereotype);
				}
			}

			Collections.sort(choiceOfValues, new Comparator() {

				public int compare(Object o1, Object o2) {
					return getLabelProvider().getText(o1).compareTo(
						getLabelProvider().getText(o2));
				}
			});

			String label = ExamplesUIPlugin.INSTANCE
				.getString("_UI_ApplyStereotypeActionCommand_label"); //$NON-NLS-1$

			final FeatureEditorDialog dialog = new FeatureEditorDialog(
				workbenchPart.getSite().getShell(), getLabelProvider(),
				element, UML2Package.eINSTANCE.getElement(),
				Collections.EMPTY_LIST, label, choiceOfValues);
			dialog.open();

			if (FeatureEditorDialog.OK == dialog.getReturnCode()) {
				editingDomain.getCommandStack().execute(
					new ChangeCommand(editingDomain, new Runnable() {

						public void run() {

							for (Iterator stereotypes = dialog.getResult()
								.iterator(); stereotypes.hasNext();) {

								element.apply((Stereotype) stereotypes.next());
							}
						}
					}, label));
			}
		}
	}

}