/*
 * Copyright (c) 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: UML2CommandAction.java,v 1.3 2005/03/15 18:54:23 khussey Exp $
 */
package org.eclipse.uml2.examples.ui.actions;

import org.eclipse.emf.edit.ui.action.CommandAction;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.ui.IEditorPart;
import org.eclipse.uml2.presentation.UML2Editor;
import org.eclipse.uml2.provider.IItemQualifiedTextProvider;

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
			? null
			: new AdapterFactoryLabelProvider(((UML2Editor) editorPart)
				.getAdapterFactory()) {

				public String getColumnText(Object object, int columnIndex) {
					IItemQualifiedTextProvider itemQualifiedTextProvider = (IItemQualifiedTextProvider) adapterFactory
						.adapt(object, IItemQualifiedTextProvider.class);

					return null != itemQualifiedTextProvider
						? itemQualifiedTextProvider.getQualifiedText(object)
						: super.getColumnText(object, columnIndex);
				}

				public String getText(Object object) {
					IItemQualifiedTextProvider itemQualifiedTextProvider = (IItemQualifiedTextProvider) adapterFactory
						.adapt(object, IItemQualifiedTextProvider.class);

					return null != itemQualifiedTextProvider
						? itemQualifiedTextProvider.getQualifiedText(object)
						: super.getText(object);
				}
			};
	}
}