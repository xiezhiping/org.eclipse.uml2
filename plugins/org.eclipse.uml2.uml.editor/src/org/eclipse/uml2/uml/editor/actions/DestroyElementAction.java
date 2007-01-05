/*
 * Copyright (c) 2005, 2007 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: DestroyElementAction.java,v 1.3 2007/01/05 21:48:51 khussey Exp $
 */
package org.eclipse.uml2.uml.editor.actions;

import java.util.Collection;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.IdentityCommand;
import org.eclipse.emf.common.command.UnexecutableCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.action.IAction;
import org.eclipse.uml2.common.edit.command.ChangeCommand;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.editor.UMLEditorPlugin;

public class DestroyElementAction
		extends UMLCommandAction {

	public DestroyElementAction() {
		super();
	}

	@Override
	protected Command createActionCommand(EditingDomain editingDomain,
			Collection<?> collection) {

		if (collection.size() == 1) {
			Object object = collection.iterator().next();

			if (object instanceof Element
				&& ((Element) object).getOwner() != null) {

				return IdentityCommand.INSTANCE;
			}
		}

		return UnexecutableCommand.INSTANCE;
	}

	@Override
	public void run(IAction action) {

		if (command != UnexecutableCommand.INSTANCE) {
			final Element element = (Element) collection.iterator().next();

			editingDomain.getCommandStack().execute(
				new ChangeCommand(editingDomain, new Runnable() {

					public void run() {
						element.destroy();
					}
				}, UMLEditorPlugin.INSTANCE.getString(
					"_UI_DestroyElementActionCommand_label", //$NON-NLS-1$
					new Object[]{getLabelProvider().getText(element)})));
		}
	}

}
