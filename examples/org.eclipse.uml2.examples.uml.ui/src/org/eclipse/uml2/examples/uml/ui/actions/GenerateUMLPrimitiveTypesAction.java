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
 * $Id: GenerateUMLPrimitiveTypesAction.java,v 1.1 2006/03/28 21:07:32 khussey Exp $
 */
package org.eclipse.uml2.examples.uml.ui.actions;

import java.util.Collection;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.UnexecutableCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.uml2.common.edit.command.ChangeCommand;
import org.eclipse.uml2.examples.uml.ui.UMLExamplesUIPlugin;
import org.eclipse.uml2.uml.Model;

public class GenerateUMLPrimitiveTypesAction
		extends GenerateModelAction {

	protected Command createActionCommand(EditingDomain editingDomain,
			Collection collection) {

		if (collection.size() == 1) {
			Object object = collection.toArray()[0];

			if (object instanceof Model) {
				final Model model = (Model) object;

				return new ChangeCommand(editingDomain, new Runnable() {

					public void run() {
						generateOwnedPrimitiveType(model, "Boolean"); //$NON-NLS-1$
						generateOwnedPrimitiveType(model, "Integer"); //$NON-NLS-1$
						generateOwnedPrimitiveType(model, "String"); //$NON-NLS-1$
						generateOwnedPrimitiveType(model, "UnlimitedNatural"); //$NON-NLS-1$
					}
				}, UMLExamplesUIPlugin.INSTANCE.getString(
					"_UI_GenerateUMLPrimitiveTypesActionCommand_label", //$NON-NLS-1$
					new Object[]{getLabelProvider().getText(model)}));
			}
		}

		return UnexecutableCommand.INSTANCE;
	}

}
