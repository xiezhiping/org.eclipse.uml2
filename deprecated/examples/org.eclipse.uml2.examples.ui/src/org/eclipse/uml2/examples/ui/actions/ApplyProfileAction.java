/*
 * Copyright (c) 2003, 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: ApplyProfileAction.java,v 1.10 2005/11/23 20:09:07 khussey Exp $
 */
package org.eclipse.uml2.examples.ui.actions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.IdentityCommand;
import org.eclipse.emf.common.command.UnexecutableCommand;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.ui.celleditor.FeatureEditorDialog;
import org.eclipse.jface.action.IAction;
import org.eclipse.uml2.Profile;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.common.edit.command.ChangeCommand;
import org.eclipse.uml2.examples.ui.ExamplesUIPlugin;
import org.eclipse.uml2.util.UML2Resource;
import org.eclipse.uml2.util.UML2Switch;

/**
 * 
 */
public class ApplyProfileAction
		extends UML2CommandAction {

	public ApplyProfileAction() {
		super();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.edit.ui.action.CommandAction#createActionCommand(org.eclipse.emf.edit.domain.EditingDomain,
	 *      java.util.Collection)
	 */
	protected Command createActionCommand(EditingDomain editingDomain,
			Collection collection) {

		if (1 == collection.size()
			&& org.eclipse.uml2.Package.class
				.isInstance(collection.toArray()[0])) {

			return IdentityCommand.INSTANCE;
		}

		return UnexecutableCommand.INSTANCE;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.IActionDelegate#run(org.eclipse.jface.action.IAction)
	 */
	public void run(IAction action) {

		if (UnexecutableCommand.INSTANCE != command) {
			final org.eclipse.uml2.Package package_ = (org.eclipse.uml2.Package) collection
				.toArray()[0];

			final List choiceOfValues = new ArrayList();

			ResourceSet resourceSet = package_.eResource().getResourceSet();

			resourceSet.getResource(URI
				.createURI(UML2Resource.BASIC_PROFILE_URI), true);
			resourceSet.getResource(URI
				.createURI(UML2Resource.INTERMEDIATE_PROFILE_URI), true);
			resourceSet.getResource(URI
				.createURI(UML2Resource.COMPLETE_PROFILE_URI), true);

			resourceSet.getResource(URI
				.createURI(UML2Resource.ECORE_PROFILE_URI), true);

			for (Iterator resources = resourceSet.getResources().iterator(); resources
				.hasNext();) {

				Iterator allContents = ((Resource) resources.next())
					.getAllContents();

				while (allContents.hasNext()) {

					new UML2Switch() {

						public Object caseProfile(Profile profile) {

							if (profile.isDefined()
								&& package_.getAppliedVersion(profile) != profile
									.getVersion()) {

								choiceOfValues.add(profile);
							}

							return profile;
						}
					}.doSwitch((EObject) allContents.next());
				}
			}

			Collections.sort(choiceOfValues, new Comparator() {

				public int compare(Object o1, Object o2) {
					return getLabelProvider().getText(o1).compareTo(
						getLabelProvider().getText(o2));
				}
			});

			String label = ExamplesUIPlugin.INSTANCE
				.getString("_UI_ApplyProfileActionCommand_label"); //$NON-NLS-1$

			final FeatureEditorDialog dialog = new FeatureEditorDialog(
				workbenchPart.getSite().getShell(), getLabelProvider(),
				package_, UML2Package.Literals.PROFILE,
				Collections.EMPTY_LIST, label, choiceOfValues);
			dialog.open();

			if (FeatureEditorDialog.OK == dialog.getReturnCode()) {
				editingDomain.getCommandStack().execute(
					new ChangeCommand(editingDomain, new Runnable() {

						public void run() {

							for (Iterator profiles = dialog.getResult()
								.iterator(); profiles.hasNext();) {

								package_.apply((Profile) profiles.next());
							}
						}
					}, label));
			}
		}
	}
}