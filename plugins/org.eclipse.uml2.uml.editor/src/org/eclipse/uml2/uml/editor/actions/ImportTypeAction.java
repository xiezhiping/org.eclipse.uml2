/*
 * Copyright (c) 2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: ImportTypeAction.java,v 1.1 2006/11/30 05:15:31 khussey Exp $
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
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;
import org.eclipse.uml2.uml.editor.UMLEditorPlugin;
import org.eclipse.uml2.uml.resource.UMLResource;

public class ImportTypeAction
		extends UMLCommandAction {

	public ImportTypeAction() {
		super();
	}

	protected Command createActionCommand(EditingDomain editingDomain,
			Collection collection) {

		if (collection.size() == 1
			&& collection.iterator().next() instanceof org.eclipse.uml2.uml.Package) {

			return IdentityCommand.INSTANCE;
		}

		return UnexecutableCommand.INSTANCE;
	}

	protected List getChoiceOfValues(org.eclipse.uml2.uml.Package package_) {
		List choiceOfValues = new ArrayList();

		Resource eResource = package_.eResource();
		ResourceSet resourceSet = eResource == null
			? null
			: eResource.getResourceSet();

		if (resourceSet != null) {

			try {
				Resource resource = resourceSet.getResource(URI
					.createURI(UMLResource.UML_PRIMITIVE_TYPES_LIBRARY_URI),
					true);
			} catch (Exception e) {
				// ignore
			}

			try {
				Resource resource = resourceSet.getResource(URI
					.createURI(UMLResource.JAVA_PRIMITIVE_TYPES_LIBRARY_URI),
					true);
			} catch (Exception e) {
				// ignore
			}

			try {
				Resource resource = resourceSet.getResource(URI
					.createURI(UMLResource.ECORE_PRIMITIVE_TYPES_LIBRARY_URI),
					true);
			} catch (Exception e) {
				// ignore
			}

			try {
				Resource resource = resourceSet.getResource(URI
					.createURI(UMLResource.XML_PRIMITIVE_TYPES_LIBRARY_URI),
					true);
			} catch (Exception e) {
				// ignore
			}
		}

		if (eResource != null) {
			EList members = package_.getMembers();
			Iterator allContents = resourceSet == null
				? eResource.getAllContents()
				: resourceSet.getAllContents();

			while (allContents.hasNext()) {
				Object object = allContents.next();

				if (object instanceof Type && !members.contains(object)) {
					choiceOfValues.add(object);
				}
			}
		}

		Collections.sort(choiceOfValues, new TextComparator());

		return choiceOfValues;
	}

	protected String getActionCommandLabel() {
		return UMLEditorPlugin.INSTANCE
			.getString("_UI_ImportTypeActionCommand_label"); //$NON-NLS-1$
	}

	public void run(IAction action) {

		if (command != UnexecutableCommand.INSTANCE) {
			final org.eclipse.uml2.uml.Package package_ = (org.eclipse.uml2.uml.Package) collection
				.iterator().next();
			String label = getActionCommandLabel();

			final FeatureEditorDialog dialog = new FeatureEditorDialog(
				workbenchPart.getSite().getShell(), getLabelProvider(),
				package_, UMLPackage.Literals.PACKAGEABLE_ELEMENT,
				Collections.EMPTY_LIST, label, getChoiceOfValues(package_));
			dialog.open();

			if (dialog.getReturnCode() == FeatureEditorDialog.OK) {
				editingDomain.getCommandStack().execute(
					new ChangeCommand(editingDomain, new Runnable() {

						public void run() {

							for (Iterator types = dialog.getResult().iterator(); types
								.hasNext();) {

								package_.createElementImport((Type) types
									.next(), VisibilityKind.PUBLIC_LITERAL);
							}
						}
					}, label));
			}
		}
	}

}
