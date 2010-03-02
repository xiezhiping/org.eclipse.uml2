/*
 * Copyright (c) 2006, 2010 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey - 286329
 *
 * $Id: ImportTypeAction.java,v 1.5 2010/03/02 03:10:43 khussey Exp $
 */
package org.eclipse.uml2.uml.editor.actions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.IdentityCommand;
import org.eclipse.emf.common.command.UnexecutableCommand;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.ui.celleditor.FeatureEditorDialog;
import org.eclipse.jface.action.IAction;
import org.eclipse.uml2.common.edit.command.ChangeCommand;
import org.eclipse.uml2.uml.NamedElement;
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

	@Override
	protected Command createActionCommand(EditingDomain editingDomain,
			Collection<?> collection) {

		if (collection.size() == 1
			&& collection.iterator().next() instanceof org.eclipse.uml2.uml.Package) {

			return IdentityCommand.INSTANCE;
		}

		return UnexecutableCommand.INSTANCE;
	}

	protected List<Type> getChoiceOfValues(org.eclipse.uml2.uml.Package package_) {
		List<Type> choiceOfValues = new ArrayList<Type>();

		Resource eResource = package_.eResource();
		ResourceSet resourceSet = eResource == null
			? null
			: eResource.getResourceSet();

		if (resourceSet != null) {

			try {
				resourceSet.getResource(URI
					.createURI(UMLResource.UML_PRIMITIVE_TYPES_LIBRARY_URI),
					true);
			} catch (Exception e) {
				// ignore
			}

			try {
				resourceSet.getResource(URI
					.createURI(UMLResource.JAVA_PRIMITIVE_TYPES_LIBRARY_URI),
					true);
			} catch (Exception e) {
				// ignore
			}

			try {
				resourceSet.getResource(URI
					.createURI(UMLResource.ECORE_PRIMITIVE_TYPES_LIBRARY_URI),
					true);
			} catch (Exception e) {
				// ignore
			}

			try {
				resourceSet.getResource(URI
					.createURI(UMLResource.XML_PRIMITIVE_TYPES_LIBRARY_URI),
					true);
			} catch (Exception e) {
				// ignore
			}
		}

		if (eResource != null) {
			EList<NamedElement> members = package_.getMembers();
			TreeIterator<?> allContents = resourceSet == null
				? eResource.getAllContents()
				: resourceSet.getAllContents();

			while (allContents.hasNext()) {
				Object object = allContents.next();

				if (object instanceof Type && !members.contains(object)) {
					Type type = (Type) object;

					if (type.getNearestPackage().makesVisible(type)) {
						choiceOfValues.add(type);
					}
				}
			}
		}

		Collections.<Type> sort(choiceOfValues, new TextComparator<Type>());

		return choiceOfValues;
	}

	protected String getActionCommandLabel() {
		return UMLEditorPlugin.INSTANCE
			.getString("_UI_ImportTypeActionCommand_label"); //$NON-NLS-1$
	}

	@Override
	public void run(IAction action) {

		if (command != UnexecutableCommand.INSTANCE) {
			final org.eclipse.uml2.uml.Package package_ = (org.eclipse.uml2.uml.Package) collection
				.iterator().next();
			String label = getActionCommandLabel();

			final FeatureEditorDialog dialog = new FeatureEditorDialog(
				workbenchPart.getSite().getShell(), getLabelProvider(),
				package_, UMLPackage.Literals.PACKAGEABLE_ELEMENT,
				Collections.EMPTY_LIST, label, getChoiceOfValues(package_),
				false, false, true);
			dialog.open();

			if (dialog.getReturnCode() == FeatureEditorDialog.OK) {
				editingDomain.getCommandStack().execute(
					new ChangeCommand(editingDomain, new Runnable() {

						public void run() {

							for (Object result : dialog.getResult()) {
								package_.createElementImport((Type) result,
									VisibilityKind.PUBLIC_LITERAL);
							}
						}
					}, label));
			}
		}
	}

}
