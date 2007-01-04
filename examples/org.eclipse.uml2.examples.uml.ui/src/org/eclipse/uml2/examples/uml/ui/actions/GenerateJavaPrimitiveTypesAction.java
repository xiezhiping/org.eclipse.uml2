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
 * $Id: GenerateJavaPrimitiveTypesAction.java,v 1.3 2007/01/04 18:47:13 khussey Exp $
 */
package org.eclipse.uml2.examples.uml.ui.actions;

import org.eclipse.emf.common.command.UnexecutableCommand;
import org.eclipse.jface.action.IAction;
import org.eclipse.uml2.common.edit.command.ChangeCommand;
import org.eclipse.uml2.examples.uml.ui.UMLExamplesUIPlugin;
import org.eclipse.uml2.uml.Model;

public class GenerateJavaPrimitiveTypesAction
		extends GenerateModelAction {

	@Override
	public void run(IAction action) {

		if (command != UnexecutableCommand.INSTANCE) {
			final Model model = (Model) collection.iterator().next();

			editingDomain.getCommandStack().execute(
				new ChangeCommand(editingDomain, new Runnable() {

					public void run() {
						generateOwnedPrimitiveType(model, "boolean"); //$NON-NLS-1$
						generateOwnedPrimitiveType(model, "byte"); //$NON-NLS-1$
						generateOwnedPrimitiveType(model, "char"); //$NON-NLS-1$
						generateOwnedPrimitiveType(model, "double"); //$NON-NLS-1$
						generateOwnedPrimitiveType(model, "float"); //$NON-NLS-1$
						generateOwnedPrimitiveType(model, "int"); //$NON-NLS-1$
						generateOwnedPrimitiveType(model, "long"); //$NON-NLS-1$
						generateOwnedPrimitiveType(model, "short"); //$NON-NLS-1$
					}
				}, UMLExamplesUIPlugin.INSTANCE.getString(
					"_UI_GenerateJavaPrimitiveTypesActionCommand_label", //$NON-NLS-1$
					new Object[]{getLabelProvider().getText(model)})));
		}
	}

}
