/*
 * Copyright (c) 2003, 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *
 * $Id: ApplyProfileAction.java,v 1.4 2004/10/01 19:28:50 khussey Exp $
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
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.ui.celleditor.FeatureEditorDialog;
import org.eclipse.jface.action.IAction;
import org.eclipse.ui.IEditorReference;
import org.eclipse.uml2.Profile;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.edit.util.ChangeCommand;
import org.eclipse.uml2.examples.ui.ExamplesUIPlugin;
import org.eclipse.uml2.presentation.UML2Editor;
import org.eclipse.uml2.util.UML2Resource;

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

			ResourceSet resourceSet = package_.eResource().getResourceSet();

			List choiceOfValues = new ArrayList();

			IEditorReference[] editorReferences = editorPart.getSite()
				.getPage().getEditorReferences();

			for (int i = 0; i < editorReferences.length; i++) {

				if ("org.eclipse.uml2.presentation.UML2EditorID" //$NON-NLS-1$
					.equals(editorReferences[i].getId())) {

					Resource resource = (Resource) ((UML2Editor) editorReferences[i]
						.getEditor(true)).getEditingDomain().getResourceSet()
						.getResources().get(0);

					if (resourceSet != resource.getResourceSet()) {

						resource = resourceSet.getResource(resource.getURI(),
							true);

						Profile profile = (Profile) (null == resource
							? null
							: EcoreUtil.getObjectByType(resource.getContents(),
								UML2Package.eINSTANCE.getProfile()));

						if (null != profile
							&& profile.isDefined()
							&& package_.getAppliedVersion(profile) != profile
								.getVersion()) {

							choiceOfValues.add(profile);
						}
					}
				}
			}

			String[] uris = new String[]{UML2Resource.BASIC_PROFILE_URI,
				UML2Resource.INTERMEDIATE_PROFILE_URI,
				UML2Resource.COMPLETE_PROFILE_URI,
				UML2Resource.ECORE_PROFILE_URI};

			for (int i = 0; i < uris.length; i++) {

				try {
					Resource resource = resourceSet.getResource(URI
						.createURI(uris[i]), true);

					Profile profile = (Profile) (null == resource
						? null
						: EcoreUtil.getObjectByType(resource.getContents(),
							UML2Package.eINSTANCE.getProfile()));

					if (null != profile
						&& profile.isDefined()
						&& package_.getAppliedVersion(profile) != profile
							.getVersion()) {

						choiceOfValues.add(profile);
					}
				} catch (Exception e) {
					// ignore
				}
			}

			Collections.sort(choiceOfValues, new Comparator() {

				public int compare(Object o1, Object o2) {
					return getLabelProvider().getText(o1).compareTo(
						getLabelProvider().getText(o2));
				}
			});

			String label = ExamplesUIPlugin.getDefault().getString(
				"_UI_ApplyProfileActionCommand_label"); //$NON-NLS-1$

			final FeatureEditorDialog dialog = new FeatureEditorDialog(
				editorPart.getSite().getShell(), getLabelProvider(), package_,
				UML2Package.eINSTANCE.getProfile(), Collections.EMPTY_LIST,
				label, choiceOfValues);
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