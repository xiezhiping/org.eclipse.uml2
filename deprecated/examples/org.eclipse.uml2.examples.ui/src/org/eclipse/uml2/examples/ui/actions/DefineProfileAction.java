/*
 * Copyright (c) 2003, 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: DefineProfileAction.java,v 1.2 2005/03/15 18:54:23 khussey Exp $
 */
package org.eclipse.uml2.examples.ui.actions;

import java.util.Collection;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.UnexecutableCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.uml2.Profile;
import org.eclipse.uml2.edit.util.ChangeCommand;
import org.eclipse.uml2.examples.ui.ExamplesUIPlugin;

/**
 *  
 */
public class DefineProfileAction
	extends UML2CommandAction {

	public DefineProfileAction() {
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
			&& Profile.class.isInstance(collection.toArray()[0])
			&& null != ((Profile) collection.toArray()[0]).getQualifiedName()
			&& 0 != ((Profile) collection.toArray()[0]).getQualifiedName()
				.length()) {

			return new ChangeCommand(editingDomain, new Runnable() {

				public void run() {
					((Profile) collection.toArray()[0]).define();
				}
			}, ExamplesUIPlugin.getDefault().getString(
				"_UI_DefineProfileActionCommand_label", //$NON-NLS-1$
				new Object[] {getLabelProvider().getText(
					collection.toArray()[0])}));
		}

		return UnexecutableCommand.INSTANCE;
	}

}