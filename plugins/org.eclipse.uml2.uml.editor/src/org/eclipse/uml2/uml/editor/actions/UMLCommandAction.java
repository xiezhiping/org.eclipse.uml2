/*
 * Copyright (c) 2005, 2007 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: UMLCommandAction.java,v 1.5 2007/05/28 20:02:28 khussey Exp $
 */
package org.eclipse.uml2.uml.editor.actions;

import java.util.Comparator;

import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.ui.viewer.IViewerProvider;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.ui.action.CommandAction;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.ui.IEditorPart;
import org.eclipse.uml2.common.edit.command.ChangeCommand;
import org.eclipse.uml2.common.edit.provider.IItemQualifiedTextProvider;
import org.eclipse.uml2.uml.editor.presentation.UMLEditor;

public class UMLCommandAction
		extends CommandAction {

	protected class TextComparator<T>
			implements Comparator<T> {

		public int compare(T t1, T t2) {
			return CommonPlugin.INSTANCE.getComparator().compare(
				getLabelProvider().getText(t1), getLabelProvider().getText(t2));
		}
	}

	protected class RefreshingChangeCommand
			extends ChangeCommand {

		public RefreshingChangeCommand(EditingDomain editingDomain,
				Runnable runnable, String label) {
			super(editingDomain, runnable, label);
		}

		@Override
		public void execute() {
			super.execute();

			refreshViewer();
		}

		@Override
		public void undo() {
			super.undo();

			refreshViewer();
		}

		@Override
		public void redo() {
			super.redo();

			refreshViewer();
		}

	}

	private ILabelProvider labelProvider = null;

	protected UMLCommandAction() {
		super();
	}

	protected ILabelProvider getLabelProvider() {
		return labelProvider;
	}

	protected AdapterFactory getAdapterFactory() {
		return workbenchPart instanceof UMLEditor
			? ((UMLEditor) workbenchPart).getAdapterFactory()
			: null;
	}

	@Override
	public void setActiveEditor(IAction action, IEditorPart editorPart) {
		super.setActiveEditor(action, editorPart);

		labelProvider = editorPart == null
			? null
			: new AdapterFactoryLabelProvider(getAdapterFactory()) {

				@Override
				public String getColumnText(Object object, int columnIndex) {
					IItemQualifiedTextProvider itemQualifiedTextProvider = (IItemQualifiedTextProvider) adapterFactory
						.adapt(object, IItemQualifiedTextProvider.class);

					return itemQualifiedTextProvider != null
						? itemQualifiedTextProvider.getQualifiedText(object)
						: super.getColumnText(object, columnIndex);
				}

				@Override
				public String getText(Object object) {
					IItemQualifiedTextProvider itemQualifiedTextProvider = (IItemQualifiedTextProvider) adapterFactory
						.adapt(object, IItemQualifiedTextProvider.class);

					return itemQualifiedTextProvider != null
						? itemQualifiedTextProvider.getQualifiedText(object)
						: super.getText(object);
				}
			};
	}

	protected void refreshViewer() {

		if (workbenchPart instanceof IViewerProvider) {
			((IViewerProvider) workbenchPart).getViewer().refresh();
		}
	}

}
