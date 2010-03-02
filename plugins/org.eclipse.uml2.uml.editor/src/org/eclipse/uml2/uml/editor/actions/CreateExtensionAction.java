/*
 * Copyright (c) 2005, 2010 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey - 286329
 *
 * $Id: CreateExtensionAction.java,v 1.6 2010/03/02 03:10:43 khussey Exp $
 */
package org.eclipse.uml2.uml.editor.actions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.IdentityCommand;
import org.eclipse.emf.common.command.UnexecutableCommand;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.ui.celleditor.FeatureEditorDialog;
import org.eclipse.jface.action.IAction;
import org.eclipse.uml2.common.edit.command.ChangeCommand;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.editor.UMLEditorPlugin;

public class CreateExtensionAction
		extends UMLCommandAction {

	public CreateExtensionAction() {
		super();
	}

	@Override
	protected Command createActionCommand(EditingDomain editingDomain,
			Collection<?> collection) {

		if (collection.size() == 1
			&& collection.iterator().next() instanceof Stereotype) {

			return IdentityCommand.INSTANCE;
		}

		return UnexecutableCommand.INSTANCE;
	}

	@Override
	public void run(IAction action) {

		if (command != UnexecutableCommand.INSTANCE) {
			final Stereotype stereotype = (Stereotype) collection.iterator()
				.next();
			EList<org.eclipse.uml2.uml.Class> allExtendedMetaclasses = stereotype
				.getAllExtendedMetaclasses();

			List<org.eclipse.uml2.uml.Class> choiceOfValues = new ArrayList<org.eclipse.uml2.uml.Class>();

			Profile profile = stereotype.getProfile();

			if (profile != null) {

				for (Model referencedMetamodel : profile
					.getReferencedMetamodels()) {

					for (Type ownedType : referencedMetamodel.getOwnedTypes()) {

						if (ownedType instanceof org.eclipse.uml2.uml.Class) {
							org.eclipse.uml2.uml.Class ownedClass = (org.eclipse.uml2.uml.Class) ownedType;

							if (ownedClass.isMetaclass()
								&& !allExtendedMetaclasses.contains(ownedClass)) {
								choiceOfValues.add(ownedClass);
							}
						}
					}
				}

				for (org.eclipse.uml2.uml.Class referencedMetaclass : profile
					.getReferencedMetaclasses()) {

					if (!allExtendedMetaclasses.contains(referencedMetaclass)
						&& !choiceOfValues.contains(referencedMetaclass)) {

						choiceOfValues.add(referencedMetaclass);
					}
				}
			}

			Collections.<org.eclipse.uml2.uml.Class> sort(choiceOfValues,
				new TextComparator<org.eclipse.uml2.uml.Class>());

			String label = UMLEditorPlugin.INSTANCE
				.getString("_UI_CreateExtensionActionCommand_label"); //$NON-NLS-1$

			final FeatureEditorDialog dialog = new FeatureEditorDialog(
				workbenchPart.getSite().getShell(), getLabelProvider(),
				stereotype, UMLPackage.Literals.STEREOTYPE,
				Collections.EMPTY_LIST, label, choiceOfValues, false, false,
				true);
			dialog.open();

			if (dialog.getReturnCode() == FeatureEditorDialog.OK) {
				editingDomain.getCommandStack().execute(
					new ChangeCommand(editingDomain, new Runnable() {

						public void run() {

							for (Object result : dialog.getResult()) {
								stereotype.createExtension(
									(org.eclipse.uml2.uml.Class) result, false);
							}
						}
					}, label));
			}
		}
	}

}
