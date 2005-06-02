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
 * $Id: GenerateEcorePrimitiveTypesAction.java,v 1.3 2005/06/02 14:29:46 khussey Exp $
 */
package org.eclipse.uml2.examples.ui.actions;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.UnexecutableCommand;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.util.EcoreSwitch;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.uml2.Model;
import org.eclipse.uml2.common.edit.command.ChangeCommand;
import org.eclipse.uml2.examples.ui.ExamplesUIPlugin;

/**
 * 
 */
public class GenerateEcorePrimitiveTypesAction
		extends GenerateModelAction {

	/*
	 * @see org.eclipse.emf.edit.ui.action.CommandAction#createActionCommand(org.eclipse.emf.edit.domain.EditingDomain,
	 *      java.util.Collection)
	 */
	protected Command createActionCommand(EditingDomain editingDomain,
			Collection collection) {

		if (1 == collection.size()
			&& Model.class.isInstance(collection.toArray()[0])) {

			final Model model = (Model) collection.toArray()[0];

			return new ChangeCommand(editingDomain, new Runnable() {

				public void run() {

					new EcoreSwitch() {

						public Object caseEDataType(EDataType eDataType) {
							return generateOwnedPrimitiveType(model, eDataType
								.getName());
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
			}, ExamplesUIPlugin.INSTANCE.getString(
				"_UI_GenerateEcorePrimitiveTypesActionCommand_label", //$NON-NLS-1$
				new Object[]{getLabelProvider().getText(model)}));
		}

		return UnexecutableCommand.INSTANCE;
	}

}
