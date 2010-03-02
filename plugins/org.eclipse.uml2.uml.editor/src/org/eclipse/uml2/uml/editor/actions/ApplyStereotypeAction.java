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
 * $Id: ApplyStereotypeAction.java,v 1.6 2010/03/02 03:10:43 khussey Exp $
 */
package org.eclipse.uml2.uml.editor.actions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.IdentityCommand;
import org.eclipse.emf.common.command.UnexecutableCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.ui.celleditor.FeatureEditorDialog;
import org.eclipse.jface.action.IAction;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.editor.UMLEditorPlugin;

public class ApplyStereotypeAction
		extends UMLCommandAction {

	public ApplyStereotypeAction() {
		super();
	}

	@Override
	protected Command createActionCommand(EditingDomain editingDomain,
			Collection<?> collection) {

		if (collection.size() == 1
			&& collection.iterator().next() instanceof Element) {

			return IdentityCommand.INSTANCE;
		}

		return UnexecutableCommand.INSTANCE;
	}

	@Override
	public void run(IAction action) {

		if (command != UnexecutableCommand.INSTANCE) {
			final Element element = (Element) collection.iterator().next();

			List<Stereotype> choiceOfValues = new ArrayList<Stereotype>();

			for (Stereotype applicableStereotype : element
				.getApplicableStereotypes()) {

				if (!element.isStereotypeApplied(applicableStereotype)) {
					choiceOfValues.add(applicableStereotype);
				}
			}

			Collections.<Stereotype> sort(choiceOfValues,
				new TextComparator<Stereotype>());

			String label = UMLEditorPlugin.INSTANCE
				.getString("_UI_ApplyStereotypeActionCommand_label"); //$NON-NLS-1$

			final FeatureEditorDialog dialog = new FeatureEditorDialog(
				workbenchPart.getSite().getShell(), getLabelProvider(),
				element, UMLPackage.Literals.ELEMENT, Collections.EMPTY_LIST,
				label, choiceOfValues, false, false, true);
			dialog.open();

			if (dialog.getReturnCode() == FeatureEditorDialog.OK) {
				editingDomain.getCommandStack().execute(
					new RefreshingChangeCommand(editingDomain, new Runnable() {

						public void run() {

							for (Object result : dialog.getResult()) {
								element.applyStereotype((Stereotype) result);
							}
						}
					}, label));
			}
		}
	}

}
