/*
 * Copyright (c) 2005, 2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: ApplyStereotypeAction.java,v 1.2 2006/01/04 16:15:45 khussey Exp $
 */
package org.eclipse.uml2.uml.editor.actions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.IdentityCommand;
import org.eclipse.emf.common.command.UnexecutableCommand;
import org.eclipse.emf.common.ui.viewer.IViewerProvider;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.ui.celleditor.FeatureEditorDialog;
import org.eclipse.jface.action.IAction;
import org.eclipse.uml2.common.edit.command.ChangeCommand;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.editor.UMLEditorPlugin;

public class ApplyStereotypeAction
		extends UMLCommandAction {

	public ApplyStereotypeAction() {
		super();
	}

	protected Command createActionCommand(EditingDomain editingDomain,
			Collection collection) {

		if (collection.size() == 1
			&& collection.toArray()[0] instanceof Element) {

			return IdentityCommand.INSTANCE;
		}

		return UnexecutableCommand.INSTANCE;
	}

	public void run(IAction action) {

		if (command != UnexecutableCommand.INSTANCE) {
			final Element element = (Element) collection.toArray()[0];

			List choiceOfValues = new ArrayList();

			for (Iterator applicableStereotypes = element
				.getApplicableStereotypes().iterator(); applicableStereotypes
				.hasNext();) {

				Stereotype stereotype = (Stereotype) applicableStereotypes
					.next();

				if (!element.isStereotypeApplied(stereotype)) {
					choiceOfValues.add(stereotype);
				}
			}

			Collections.sort(choiceOfValues, new TextComparator());

			String label = UMLEditorPlugin.INSTANCE
				.getString("_UI_ApplyStereotypeActionCommand_label"); //$NON-NLS-1$

			final FeatureEditorDialog dialog = new FeatureEditorDialog(
				workbenchPart.getSite().getShell(), getLabelProvider(),
				element, UMLPackage.Literals.ELEMENT, Collections.EMPTY_LIST,
				label, choiceOfValues);
			dialog.open();

			if (dialog.getReturnCode() == FeatureEditorDialog.OK) {
				editingDomain.getCommandStack().execute(
					new ChangeCommand(editingDomain, new Runnable() {

						public void run() {

							for (Iterator stereotypes = dialog.getResult()
								.iterator(); stereotypes.hasNext();) {

								element
									.applyStereotype((Stereotype) stereotypes
										.next());
							}
						}
					}, label));
				
				if (workbenchPart instanceof IViewerProvider) {
					((IViewerProvider) workbenchPart).getViewer().refresh();
				}
			}
		}
	}

}
