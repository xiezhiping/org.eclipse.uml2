/*
 * Copyright (c) 2005, 2014 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 327039, 418466
 *
 */
package org.eclipse.uml2.examples.uml.ui.actions;

import java.util.Collection;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.IdentityCommand;
import org.eclipse.emf.common.command.UnexecutableCommand;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.domain.EditingDomain;

import org.eclipse.jface.action.IAction;
import org.eclipse.uml2.examples.uml.ui.UMLExamplesUIPlugin;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.eclipse.uml2.uml.util.UMLSwitch;

public class ConvertToModelLibraryAction
		extends ConvertModelAction {

	protected static final String STEREOTYPE_NAME__MODEL_LIBRARY = "ModelLibrary"; //$NON-NLS-1$

	@Override
	public void run(IAction action) {

		if (command != UnexecutableCommand.INSTANCE) {
			final org.eclipse.uml2.uml.Package package_ = (org.eclipse.uml2.uml.Package) collection
				.iterator().next();

			editingDomain.getCommandStack().execute(
				new RefreshingChangeCommand(editingDomain, new Runnable() {

					public void run() {
						EcoreUtil.resolveAll(package_);

						Profile standardProfile = applyProfile(package_,
							UMLResource.STANDARD_PROFILE_URI);

						if (standardProfile != null) {
							applyStereotype(
								package_,
								standardProfile
									.getOwnedStereotype(STEREOTYPE_NAME__MODEL_LIBRARY));
						}

						new UMLSwitch<Object>() {

							@Override
							public Object defaultCase(EObject eObject) {
								setID(eObject);

								for (EObject c : eObject.eContents()) {
									doSwitch(c);
								}

								return this;
							}
						}.doSwitch(package_);
					}
				}, UMLExamplesUIPlugin.INSTANCE.getString(
					"_UI_ConvertToModelLibraryActionCommand_label", //$NON-NLS-1$
					new Object[]{getLabelProvider().getText(package_)})));
		}
	}

	@Override
	protected Command createActionCommand(EditingDomain editingDomain,
			Collection<?> collection) {

		if (collection.size() == 1
			&& collection.iterator().next() instanceof org.eclipse.uml2.uml.Package) {

			return IdentityCommand.INSTANCE;
		}

		return UnexecutableCommand.INSTANCE;
	}

}
