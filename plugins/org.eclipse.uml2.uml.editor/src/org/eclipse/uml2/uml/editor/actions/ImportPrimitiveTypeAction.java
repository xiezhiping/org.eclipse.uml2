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
 * $Id: ImportPrimitiveTypeAction.java,v 1.1 2005/12/22 20:21:06 khussey Exp $
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
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.ui.celleditor.FeatureEditorDialog;
import org.eclipse.jface.action.IAction;
import org.eclipse.uml2.common.edit.command.ChangeCommand;
import org.eclipse.uml2.uml.PrimitiveType;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;
import org.eclipse.uml2.uml.editor.UMLEditorPlugin;
import org.eclipse.uml2.uml.resource.UMLResource;

public class ImportPrimitiveTypeAction
		extends UMLCommandAction {

	public ImportPrimitiveTypeAction() {
		super();
	}

	protected Command createActionCommand(EditingDomain editingDomain,
			Collection collection) {

		if (collection.size() == 1
			&& collection.toArray()[0] instanceof org.eclipse.uml2.uml.Package) {

			return IdentityCommand.INSTANCE;
		}

		return UnexecutableCommand.INSTANCE;
	}

	public void run(IAction action) {

		if (command != UnexecutableCommand.INSTANCE) {
			final org.eclipse.uml2.uml.Package package_ = (org.eclipse.uml2.uml.Package) collection
				.toArray()[0];

			List choiceOfValues = new ArrayList();

			Resource eResource = package_.eResource();
			ResourceSet resourceSet = eResource == null
				? null
				: eResource.getResourceSet();

			if (resourceSet != null) {

				try {
					Resource resource = resourceSet
						.getResource(
							URI
								.createURI(UMLResource.UML_PRIMITIVE_TYPES_LIBRARY_URI),
							true);

					for (Iterator contents = resource.getAllContents(); contents
						.hasNext();) {

						Object object = contents.next();

						if (object instanceof PrimitiveType
							&& !package_.getImportedElements().contains(object)) {

							choiceOfValues.add(object);
						}
					}
				} catch (Exception e) {
					// ignore
				}

				try {
					Resource resource = resourceSet
						.getResource(
							URI
								.createURI(UMLResource.JAVA_PRIMITIVE_TYPES_LIBRARY_URI),
							true);

					for (Iterator contents = resource.getAllContents(); contents
						.hasNext();) {

						Object object = contents.next();

						if (object instanceof PrimitiveType
							&& !package_.getImportedElements().contains(object)) {

							choiceOfValues.add(object);
						}
					}
				} catch (Exception e) {
					// ignore
				}

				try {
					Resource resource = resourceSet
						.getResource(
							URI
								.createURI(UMLResource.ECORE_PRIMITIVE_TYPES_LIBRARY_URI),
							true);

					for (Iterator contents = resource.getAllContents(); contents
						.hasNext();) {

						Object object = contents.next();

						if (object instanceof PrimitiveType
							&& !package_.getImportedElements().contains(object)) {

							choiceOfValues.add(object);
						}
					}
				} catch (Exception e) {
					// ignore
				}
			}

			Collections.sort(choiceOfValues, new TextComparator());

			String label = UMLEditorPlugin.INSTANCE
				.getString("_UI_ImportPrimitiveTypeActionCommand_label"); //$NON-NLS-1$

			final FeatureEditorDialog dialog = new FeatureEditorDialog(
				workbenchPart.getSite().getShell(), getLabelProvider(),
				package_, UMLPackage.Literals.PACKAGEABLE_ELEMENT,
				Collections.EMPTY_LIST, label, choiceOfValues);
			dialog.open();

			if (dialog.getReturnCode() == FeatureEditorDialog.OK) {
				editingDomain.getCommandStack().execute(
					new ChangeCommand(editingDomain, new Runnable() {

						public void run() {

							for (Iterator primitiveTypes = dialog.getResult()
								.iterator(); primitiveTypes.hasNext();) {

								package_.createElementImport(
									(PrimitiveType) primitiveTypes.next(),
									VisibilityKind.PUBLIC_LITERAL);
							}
						}
					}, label));
			}
		}
	}

}
