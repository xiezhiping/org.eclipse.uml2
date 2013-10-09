/*
 * Copyright (c) 2013 CEA and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Christian W. Damus (CEA) - Initial API and implementation
 *
 */
package org.eclipse.uml2.uml.editor.dialogs;

import java.util.Collection;

import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.Viewer;

/**
 * Protocol for a delegate that supplies application-specific information and
 * decisions to a {@link ChoicesDialog}.
 * 
 * @since 4.2
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

	boolean okPressed(Collection<T> values);
}
