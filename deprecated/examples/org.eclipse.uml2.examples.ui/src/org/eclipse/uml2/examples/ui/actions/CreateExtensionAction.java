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
 * $Id: CreateExtensionAction.java,v 1.6 2005/05/18 16:43:51 khussey Exp $
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
import org.eclipse.uml2.Stereotype;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.common.edit.command.ChangeCommand;
import org.eclipse.uml2.examples.ui.ExamplesUIPlugin;

/**
 * 
 */
public class CreateExtensionAction
		extends UML2CommandAction {

	public CreateExtensionAction() {
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
			&& Stereotype.class.isInstance(collection.toArray()[0])) {

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
			final Stereotype stereotype = (Stereotype) collection.toArray()[0];

			List choiceOfValues = new ArrayList();

			for (Iterator referencedMetaclasses = stereotype.getProfile()
				.getReferencedMetaclasses().iterator(); referencedMetaclasses
				.hasNext();) {

				org.eclipse.uml2.Class metaclass = (org.eclipse.uml2.Class) referencedMetaclasses
					.next();

				if (!stereotype.getAllExtendedMetaclasses().contains(metaclass)) {
					choiceOfValues.add(metaclass);
				}
			}

			Collections.sort(choiceOfValues, new Comparator() {

				public int compare(Object o1, Object o2) {
					return getLabelProvider().getText(o1).compareTo(
						getLabelProvider().getText(o2));
				}
			});

			String label = ExamplesUIPlugin.getDefault().getString(
				"_UI_CreateExtensionActionCommand_label"); //$NON-NLS-1$

			final FeatureEditorDialog dialog = new FeatureEditorDialog(
				editorPart.getSite().getShell(), getLabelProvider(),
				stereotype, UML2Package.eINSTANCE.getStereotype(),
				Collections.EMPTY_LIST, label, choiceOfValues);
			dialog.open();

			if (FeatureEditorDialog.OK == dialog.getReturnCode()) {
				editingDomain.getCommandStack().execute(
					new ChangeCommand(editingDomain, new Runnable() {

						public void run() {

							for (Iterator metaclasses = dialog.getResult()
								.iterator(); metaclasses.hasNext();) {

								stereotype
									.createExtension(
										(org.eclipse.uml2.Class) metaclasses
											.next(), false);
							}
						}
					}, label));
			}
		}
	}

}