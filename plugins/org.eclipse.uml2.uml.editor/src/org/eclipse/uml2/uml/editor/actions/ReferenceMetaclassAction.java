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
 * $Id: ReferenceMetaclassAction.java,v 1.4 2006/11/21 22:37:43 khussey Exp $
 */
package org.eclipse.uml2.uml.editor.actions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.IdentityCommand;
import org.eclipse.emf.common.command.UnexecutableCommand;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.ui.celleditor.FeatureEditorDialog;
import org.eclipse.jface.action.IAction;
import org.eclipse.uml2.common.edit.command.ChangeCommand;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.editor.UMLEditorPlugin;
import org.eclipse.uml2.uml.resource.UMLResource;

public class ReferenceMetaclassAction
		extends UMLCommandAction {

	public ReferenceMetaclassAction() {
		super();
	}

	protected Command createActionCommand(EditingDomain editingDomain,
			Collection collection) {

		if (collection.size() == 1
			&& collection.iterator().next() instanceof Profile) {

			return IdentityCommand.INSTANCE;
		}

		return UnexecutableCommand.INSTANCE;
	}

	public void run(IAction action) {

		if (command != UnexecutableCommand.INSTANCE) {
			final Profile profile = (Profile) collection.iterator().next();
			EList referencedMetaclasses = profile.getReferencedMetaclasses();

			List choiceOfValues = new ArrayList();

			try {
				ResourceSet resourceSet = profile.eResource().getResourceSet();

				try {
					resourceSet.getResource(URI
						.createURI(UMLResource.UML_METAMODEL_URI), true);
				} catch (Exception e) {
					// ignore
				}

				for (Iterator resources = resourceSet.getResources().iterator(); resources
					.hasNext();) {

					Resource resource = (Resource) resources.next();

					for (Iterator contents = resource.getAllContents(); contents
						.hasNext();) {

						Object object = contents.next();

						if (object instanceof org.eclipse.uml2.uml.Class
							&& ((org.eclipse.uml2.uml.Class) object)
								.isMetaclass()
							&& !referencedMetaclasses.contains(object)) {

							choiceOfValues.add(object);
						}
					}
				}
			} catch (Exception e) {
				// ignore
			}

			Collections.sort(choiceOfValues, new TextComparator());

			String label = UMLEditorPlugin.INSTANCE
				.getString("_UI_ReferenceMetaclassActionCommand_label"); //$NON-NLS-1$

			final FeatureEditorDialog dialog = new FeatureEditorDialog(
				workbenchPart.getSite().getShell(), getLabelProvider(),
				profile, UMLPackage.Literals.CLASS, Collections.EMPTY_LIST,
				label, choiceOfValues);
			dialog.open();

			if (dialog.getReturnCode() == FeatureEditorDialog.OK) {
				editingDomain.getCommandStack().execute(
					new ChangeCommand(editingDomain, new Runnable() {

						public void run() {

							for (Iterator metaclasses = dialog.getResult()
								.iterator(); metaclasses.hasNext();) {

								profile
									.createMetaclassReference((org.eclipse.uml2.uml.Class) metaclasses
										.next());
							}
						}
					}, label));
			}
		}
	}

}
