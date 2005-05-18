/*
 * Copyright (c) 2004, 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: DestroyElementAction.java,v 1.3 2005/05/18 16:43:51 khussey Exp $
 */
package org.eclipse.uml2.examples.ui.actions;

import java.util.Collection;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.UnexecutableCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.uml2.Element;
import org.eclipse.uml2.common.edit.command.ChangeCommand;
import org.eclipse.uml2.examples.ui.ExamplesUIPlugin;

/**
 *  
 */
public class DestroyElementAction
	extends UML2CommandAction {

	public DestroyElementAction() {
		super();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.edit.ui.action.CommandAction#createActionCommand(org.eclipse.emf.edit.domain.EditingDomain,
	 *      java.util.Collection)
	 */
	protected Command createActionCommand(EditingDomain editingDomain,
			final Collection collection) {

		if (1 == collection.size()
			&& Element.class.isInstance(collection.toArray()[0])
			&& null != ((Element) collection.toArray()[0]).eContainer()) {

			return new ChangeCommand(editingDomain, new Runnable() {

				public void run() {
					((Element) collection.toArray()[0]).destroy();
				}
			}, ExamplesUIPlugin.getDefault().getString(
				"_UI_DestroyElementActionCommand_label", //$NON-NLS-1$
				new Object[] {getLabelProvider().getText(
					collection.toArray()[0])}));
		}

		return UnexecutableCommand.INSTANCE;
	}

}