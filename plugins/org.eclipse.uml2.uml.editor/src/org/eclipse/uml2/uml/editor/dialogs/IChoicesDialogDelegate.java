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

import java.util.Collection;

import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.widgets.Composite;

/**
 * Protocol for a delegate that supplies application-specific information and
 * decisions to a {@link ChoicesDialog}.
 * 
 * @since 5.0
 * 
 * @see ChoicesDialog
 * @see AbstractChoicesDialogDelegate
 */
public interface IChoicesDialogDelegate<T> {

	Class<T> getElementType();

	String getChoicesLabelText();

	String getValuesLabelText();

	String getAddButtonText();

	String getRemoveButtonText();

	ILabelProvider getLabelProvider();

	ILabelProvider createLabelProvider(Viewer viewer);

	Collection<? extends T> getChoiceOfValues();

	boolean canAdd(IStructuredSelection selection, Collection<T> values);

	boolean canRemove(IStructuredSelection selection, Collection<T> choices);

	boolean allowsReordering();

	boolean hasAdditionalControls();

	void createAdditionalControls(Composite parent);

	boolean okPressed(Collection<T> values);
}
