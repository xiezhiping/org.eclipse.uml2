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
 * $Id: GenerateJavaPrimitiveTypesAction.java,v 1.1 2005/12/22 20:19:56 khussey Exp $
 */
package org.eclipse.uml2.examples.ui.uml.actions;

import java.util.Collection;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.UnexecutableCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.uml2.common.edit.command.ChangeCommand;
import org.eclipse.uml2.examples.ui.ExamplesUIPlugin;
import org.eclipse.uml2.uml.Model;

public class GenerateJavaPrimitiveTypesAction
		extends GenerateModelAction {

	protected Command createActionCommand(EditingDomain editingDomain,
			Collection collection) {

		if (collection.size() == 1) {
			Object object = collection.toArray()[0];

			if (object instanceof Model) {
				final Model model = (Model) object;

				return new ChangeCommand(editingDomain, new Runnable() {

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
				}, ExamplesUIPlugin.INSTANCE.getString(
					"_UI_GenerateJavaPrimitiveTypesActionCommand_label", //$NON-NLS-1$
					new Object[]{getLabelProvider().getText(model)}));
			}
		}

		return UnexecutableCommand.INSTANCE;
	}

}
