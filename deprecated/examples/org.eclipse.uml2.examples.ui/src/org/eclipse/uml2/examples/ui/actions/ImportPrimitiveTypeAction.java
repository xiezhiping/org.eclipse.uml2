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
 * $Id: ImportPrimitiveTypeAction.java,v 1.2 2004/05/04 19:16:52 khussey Exp $
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
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.ui.celleditor.FeatureEditorDialog;
import org.eclipse.jface.action.IAction;
import org.eclipse.uml2.PrimitiveType;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.VisibilityKind;
import org.eclipse.uml2.edit.util.ChangeCommand;
import org.eclipse.uml2.examples.ui.ExamplesUIPlugin;
import org.eclipse.uml2.util.UML2Resource;

/**
 *  
 */
public class ImportPrimitiveTypeAction
	extends UML2CommandAction {

	public ImportPrimitiveTypeAction() {
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

			List choiceOfValues = new ArrayList();

			try {
				Resource resource = package_
					.eResource()
					.getResourceSet()
					.getResource(
						URI
							.createURI(UML2Resource.UML2_PRIMITIVE_TYPES_LIBRARY_URI),
						true);

				for (Iterator contents = resource.getAllContents(); contents
					.hasNext();) {

					Object object = contents.next();

					if (PrimitiveType.class.isInstance(object)
						&& !package_.getImportedMembers().contains(object)) {

						choiceOfValues.add(object);
					}
				}
			} catch (Exception e) {
				// ignore
			}

			try {
				Resource resource = package_
					.eResource()
					.getResourceSet()
					.getResource(
						URI
							.createURI(UML2Resource.JAVA_PRIMITIVE_TYPES_LIBRARY_URI),
						true);

				for (Iterator contents = resource.getAllContents(); contents
					.hasNext();) {

					Object object = contents.next();

					if (PrimitiveType.class.isInstance(object)
						&& !package_.getImportedMembers().contains(object)) {

						choiceOfValues.add(object);
					}
				}
			} catch (Exception e) {
				// ignore
			}

			try {
				Resource resource = package_
					.eResource()
					.getResourceSet()
					.getResource(
						URI
							.createURI(UML2Resource.ECORE_PRIMITIVE_TYPES_LIBRARY_URI),
						true);

				for (Iterator contents = resource.getAllContents(); contents
					.hasNext();) {

					Object object = contents.next();

					if (PrimitiveType.class.isInstance(object)
						&& !package_.getImportedMembers().contains(object)) {

						choiceOfValues.add(object);
					}
				}
			} catch (Exception e) {
				// ignore
			}

			Collections.sort(choiceOfValues, new Comparator() {

				public int compare(Object o1, Object o2) {
					return getLabelProvider().getText(o1).compareTo(
						getLabelProvider().getText(o2));
				}
			});

			String label = ExamplesUIPlugin.getDefault().getString(
				"_UI_ImportPrimitiveTypeActionCommand_label"); //$NON-NLS-1$

			final FeatureEditorDialog dialog = new FeatureEditorDialog(
					editorPart.getSite().getShell(), getLabelProvider(),
					package_, UML2Package.eINSTANCE.getPackageableElement(),
					Collections.EMPTY_LIST, label, choiceOfValues);
			dialog.open();

			if (FeatureEditorDialog.OK == dialog.getReturnCode()) {
				editingDomain.getCommandStack().execute(
					new ChangeCommand(editingDomain, new Runnable() {

						public void run() {

							for (Iterator primitiveTypes = dialog.getResult()
								.iterator(); primitiveTypes.hasNext();) {

								package_.importElement(
									VisibilityKind.PUBLIC_LITERAL,
									(PrimitiveType) primitiveTypes.next());
							}
						}
					}, label));
			}
		}
	}

}