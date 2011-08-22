/*
 * Copyright (c) 2005, 2011 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 327039
 *
 * $Id: GenerateUMLPrimitiveTypesAction.java,v 1.3 2007/01/04 18:47:13 khussey Exp $
 */
package org.eclipse.uml2.examples.uml.ui.actions;

import org.eclipse.emf.common.command.UnexecutableCommand;
import org.eclipse.jface.action.IAction;
import org.eclipse.uml2.common.edit.command.ChangeCommand;
import org.eclipse.uml2.examples.uml.ui.UMLExamplesUIPlugin;
import org.eclipse.uml2.uml.Model;

public class GenerateUMLPrimitiveTypesAction
		extends GenerateModelAction {

	@Override
	public void run(IAction action) {

		if (command != UnexecutableCommand.INSTANCE) {
			final Model model = (Model) collection.iterator().next();

			editingDomain.getCommandStack().execute(
				new ChangeCommand(editingDomain, new Runnable() {

					public void run() {
						generateOwnedPrimitiveType(model, "Boolean"); //$NON-NLS-1$
						generateOwnedPrimitiveType(model, "Integer"); //$NON-NLS-1$
						generateOwnedPrimitiveType(model, "String"); //$NON-NLS-1$
						generateOwnedPrimitiveType(model, "UnlimitedNatural"); //$NON-NLS-1$
                        generateOwnedPrimitiveType(model, "Real"); //$NON-NLS-1$
					}
				}, UMLExamplesUIPlugin.INSTANCE.getString(
					"_UI_GenerateUMLPrimitiveTypesActionCommand_label", //$NON-NLS-1$
					new Object[]{getLabelProvider().getText(model)})));
		}
	}

}
