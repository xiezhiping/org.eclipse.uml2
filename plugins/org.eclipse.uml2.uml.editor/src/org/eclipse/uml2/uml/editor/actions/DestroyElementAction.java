/*
 * Copyright (c) 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: DestroyElementAction.java,v 1.1 2005/12/22 20:21:06 khussey Exp $
 */
package org.eclipse.uml2.uml.editor.actions;

import java.util.Collection;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.UnexecutableCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.uml2.common.edit.command.ChangeCommand;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.editor.UMLEditorPlugin;

public class DestroyElementAction
		extends UMLCommandAction {

	public DestroyElementAction() {
		super();
	}

	protected Command createActionCommand(EditingDomain editingDomain,
			Collection collection) {

		if (collection.size() == 1) {
			final Object element = collection.toArray()[0];

			if (element instanceof Element
				&& ((Element) element).getOwner() != null) {

				return new ChangeCommand(editingDomain, new Runnable() {

					public void run() {
						((Element) element).destroy();
					}
				}, UMLEditorPlugin.INSTANCE.getString(
					"_UI_DestroyElementActionCommand_label", //$NON-NLS-1$
					new Object[]{getLabelProvider().getText(element)}));
			}
		}

		return UnexecutableCommand.INSTANCE;
	}

}
