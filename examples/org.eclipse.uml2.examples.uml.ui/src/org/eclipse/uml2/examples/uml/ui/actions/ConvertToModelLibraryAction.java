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
 * $Id: ConvertToModelLibraryAction.java,v 1.1 2006/03/28 21:07:32 khussey Exp $
 */
package org.eclipse.uml2.examples.uml.ui.actions;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.UnexecutableCommand;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.uml2.examples.uml.ui.UMLExamplesUIPlugin;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.eclipse.uml2.uml.util.UMLSwitch;

public class ConvertToModelLibraryAction
		extends ConvertModelAction {

	protected static final String STEREOTYPE_NAME__MODEL_LIBRARY = "ModelLibrary"; //$NON-NLS-1$

	protected Command createActionCommand(EditingDomain editingDomain,
			Collection collection) {

		if (collection.size() == 1) {
			Object object = collection.toArray()[0];

			if (object instanceof Model) {
				final Model model = (Model) object;

				return new RefreshingChangeCommand(editingDomain,
					new Runnable() {

						public void run() {
							EcoreUtil.resolveAll(model);

							Profile umlProfile = applyProfile(model,
								UMLResource.STANDARD_PROFILE_URI);

							if (umlProfile != null) {
								applyStereotype(
									model,
									umlProfile
										.getOwnedStereotype(STEREOTYPE_NAME__MODEL_LIBRARY));
							}

							new UMLSwitch() {

								public Object defaultCase(EObject eObject) {
									setID(eObject);

									for (Iterator eContents = eObject
										.eContents().iterator(); eContents
										.hasNext();) {

										doSwitch((EObject) eContents.next());
									}

									return this;
								}
							}.doSwitch(model);
						}
					}, UMLExamplesUIPlugin.INSTANCE.getString(
						"_UI_ConvertToModelLibraryActionCommand_label", //$NON-NLS-1$
						new Object[]{getLabelProvider().getText(model)}));
			}
		}

		return UnexecutableCommand.INSTANCE;
	}

}
