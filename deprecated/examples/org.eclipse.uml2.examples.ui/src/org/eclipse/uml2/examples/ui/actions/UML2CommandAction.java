/*
 * Copyright (c) 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *
 * $Id: UML2CommandAction.java,v 1.1 2004/04/29 15:31:14 khussey Exp $
 */
package org.eclipse.uml2.examples.ui.actions;

import org.eclipse.emf.edit.ui.action.CommandAction;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.ui.IEditorPart;
import org.eclipse.uml2.NamedElement;
import org.eclipse.uml2.presentation.UML2Editor;

/**
 *  
 */
public class UML2CommandAction
	extends CommandAction {

	private ILabelProvider labelProvider = null;

	protected UML2CommandAction() {
		super();
	}

	protected ILabelProvider getLabelProvider() {
		return labelProvider;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.IEditorActionDelegate#setActiveEditor(org.eclipse.jface.action.IAction,
	 *      org.eclipse.ui.IEditorPart)
	 */
	public void setActiveEditor(IAction action, IEditorPart editorPart) {
		super.setActiveEditor(action, editorPart);

		labelProvider = null == editorPart
			? null : new AdapterFactoryLabelProvider(((UML2Editor) editorPart)
				.getAdapterFactory()) {

				public String getColumnText(Object object, int columnIndex) {

					if (NamedElement.class.isInstance(object)) {
						String qualifiedName = ((NamedElement) object)
							.getQualifiedName();

						if (null != qualifiedName
							&& 0 != qualifiedName.length()) {

							return qualifiedName;
						}
					}

					return super.getColumnText(object, columnIndex);
				}

				public String getText(Object object) {

					if (NamedElement.class.isInstance(object)) {
						String qualifiedName = ((NamedElement) object)
							.getQualifiedName();

						if (null != qualifiedName
							&& 0 != qualifiedName.length()) {

							return qualifiedName;
						}
					}

					return super.getText(object);
				}
			};
	}
}