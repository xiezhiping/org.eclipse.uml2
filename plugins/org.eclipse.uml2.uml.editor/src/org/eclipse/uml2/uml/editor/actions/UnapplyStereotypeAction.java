/*
 * Copyright (c) 2005, 2013 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey - 286329
 *   Christian W. Damus (CEA) - 326915
 *   
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
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.edit.ui.provider.DelegatingStyledCellLabelProvider;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.window.Window;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.editor.UMLEditorPlugin;
import org.eclipse.uml2.uml.editor.dialogs.AbstractChoicesDialogDelegate;
import org.eclipse.uml2.uml.editor.dialogs.ChoicesDialog;

public class UnapplyStereotypeAction
		extends UMLCommandAction {

	public UnapplyStereotypeAction() {
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

			final List<Stereotype> choiceOfValues = new ArrayList<Stereotype>();

			for (Stereotype appliedStereotype : element.getAppliedStereotypes()) {
				choiceOfValues.add(appliedStereotype);
			}

			Collections.<Stereotype> sort(choiceOfValues,
				new TextComparator<Stereotype>());

			String label = UMLEditorPlugin.INSTANCE
				.getString("_UI_UnapplyStereotypeActionCommand_label"); //$NON-NLS-1$

			final ChoicesDialog<Stereotype> dialog = new ChoicesDialog<Stereotype>(
				workbenchPart.getSite().getShell(),
				element,
				label,
				new AbstractChoicesDialogDelegate<Stereotype>(Stereotype.class) {

					@Override
					public String getChoicesLabelText() {
						return UMLEditorPlugin.INSTANCE
							.getString("_UI_AppliedStereotypes_label"); //$NON-NLS-1$
					}

					@Override
					public String getValuesLabelText() {
						return UMLEditorPlugin.INSTANCE
							.getString("_UI_StereotypesToUnapply_label"); //$NON-NLS-1$
					}

					@Override
					public String getAddButtonText() {
						return UMLEditorPlugin.INSTANCE
							.getString("_UI_Unapply_label"); //$NON-NLS-1$
					}

					@Override
					public String getRemoveButtonText() {
						return UMLEditorPlugin.INSTANCE
							.getString("_UI_Apply_label"); //$NON-NLS-1$
					}

					public ILabelProvider getLabelProvider() {
						return UnapplyStereotypeAction.this.getLabelProvider();
					}

					@Override
					public ILabelProvider createLabelProvider(Viewer viewer) {
						return new DelegatingStyledCellLabelProvider(
							new AdapterFactoryLabelProvider.StyledLabelProvider(
								getAdapterFactory(), viewer) {

								@Override
								public StyledString getStyledText(Object object) {
									StyledString result = super
										.getStyledText(object);

									if (object instanceof Stereotype) {
										if (element
											.isStereotypeRequired(((Stereotype) object))) {
											result.append(" (required)",
												StyledString.QUALIFIER_STYLER);
										}
									}

									return result;
								}
							});
					}

					public Collection<Stereotype> getChoiceOfValues() {
						return choiceOfValues;
					}

					@Override
					public boolean allowsReordering() {
						return false;
					}

					@Override
					public boolean canAdd(IStructuredSelection selection,
							Collection<Stereotype> values) {

						boolean result = true;

						for (Object next : selection.toList()) {
							if (element.isStereotypeRequired((Stereotype) next)) {
								result = false;
								break;
							}
						}

						return result;
					}
				});
			dialog.open();

			if ((dialog.getReturnCode() == Window.OK)
				&& !dialog.getResult().isEmpty()) {
				editingDomain.getCommandStack().execute(
					new RefreshingChangeCommand(editingDomain, new Runnable() {

						public void run() {

							for (Stereotype result : dialog.getResult()) {
								element.unapplyStereotype(result);
							}
						}
					}, label));
			}
		}
	}
}
