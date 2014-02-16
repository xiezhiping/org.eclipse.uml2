/*
 * Copyright (c) 2013, 2014 CEA and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Christian W. Damus (CEA) - initial API and implementation
 *   Christian W. Damus (CEA) - 286444
 *
 */
package org.eclipse.uml2.uml.editor.dialogs;

import java.lang.reflect.Method;
import java.util.Collection;

import org.eclipse.emf.edit.ui.EMFEditUIPlugin;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.widgets.Composite;

/**
 * A partial implementation of the {@link IChoicesDialogDelegate} protocol,
 * useful for subclassing.
 * 
 * @since 5.0
 */
public abstract class AbstractChoicesDialogDelegate<T>
		implements IChoicesDialogDelegate<T> {

	private final Class<T> elementType;

	private ChoicesDialog<T> dialog;

	public AbstractChoicesDialogDelegate(Class<T> elementType) {
		this.elementType = elementType;
	}

	public final Class<T> getElementType() {
		return elementType;
	}

	protected ChoicesDialog<T> getDialog() {
		return dialog;
	}

	void setDialog(ChoicesDialog<T> dialog) {
		this.dialog = dialog;
	}

	public String getChoicesLabelText() {
		return EMFEditUIPlugin.INSTANCE.getString("_UI_Choices_label"); //$NON-NLS-1$
	}

	public String getValuesLabelText() {
		return EMFEditUIPlugin.INSTANCE.getString("_UI_Feature_label"); //$NON-NLS-1$
	}

	public String getAddButtonText() {
		return EMFEditUIPlugin.INSTANCE.getString("_UI_Add_label"); //$NON-NLS-1$
	}

	public String getRemoveButtonText() {
		return EMFEditUIPlugin.INSTANCE.getString("_UI_Remove_label"); //$NON-NLS-1$
	}

	public ILabelProvider createLabelProvider(Viewer viewer) {
		return getLabelProvider();
	}

	public boolean canAdd(IStructuredSelection selection, Collection<T> values) {
		return true;
	}

	public boolean canRemove(IStructuredSelection selection,
			Collection<T> choices) {

		return true;
	}

	public boolean allowsReordering() {
		return true;
	}

	public boolean hasAdditionalControls() {
		Method createAdditionalControls = null;
		try {
			createAdditionalControls = getClass().getMethod(
				"createAdditionalControls", Composite.class);
		} catch (Exception e) {
			// can't get the method? So, it doesn't exist
		}

		return (createAdditionalControls == null)
			|| (createAdditionalControls.getDeclaringClass() != AbstractChoicesDialogDelegate.class);
	}

	public void createAdditionalControls(Composite parent) {
		// pass
	}

	public boolean okPressed(Collection<T> values) {
		return true;
	}
}
