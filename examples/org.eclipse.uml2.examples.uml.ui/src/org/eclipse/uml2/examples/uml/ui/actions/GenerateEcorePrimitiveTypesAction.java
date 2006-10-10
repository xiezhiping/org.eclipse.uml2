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
 * $Id: GenerateEcorePrimitiveTypesAction.java,v 1.2 2006/10/10 20:40:47 khussey Exp $
 */
package org.eclipse.uml2.examples.uml.ui.actions;

import java.util.Iterator;

import org.eclipse.emf.common.command.UnexecutableCommand;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.util.EcoreSwitch;
import org.eclipse.jface.action.IAction;
import org.eclipse.uml2.common.edit.command.ChangeCommand;
import org.eclipse.uml2.examples.uml.ui.UMLExamplesUIPlugin;
import org.eclipse.uml2.uml.Model;

public class GenerateEcorePrimitiveTypesAction
		extends GenerateModelAction {

	public void run(IAction action) {

		if (command != UnexecutableCommand.INSTANCE) {
			final Model model = (Model) collection.iterator().next();

			editingDomain.getCommandStack().execute(
				new ChangeCommand(editingDomain, new Runnable() {

					public void run() {

						new EcoreSwitch() {

							public Object caseEDataType(EDataType eDataType) {
								return generateOwnedPrimitiveType(model,
									eDataType.getName());
							}

							public Object caseEEnum(EEnum eEnum) {
								return eEnum;
							}

							public Object defaultCase(EObject eObject) {

								for (Iterator eContents = eObject.eContents()
									.iterator(); eContents.hasNext();) {

									doSwitch((EObject) eContents.next());
								}

								return eObject;
							}
						}.doSwitch(EcorePackage.eINSTANCE);
					}
				}, UMLExamplesUIPlugin.INSTANCE.getString(
					"_UI_GenerateEcorePrimitiveTypesActionCommand_label", //$NON-NLS-1$
					new Object[]{getLabelProvider().getText(model)})));
		}
	}

}
