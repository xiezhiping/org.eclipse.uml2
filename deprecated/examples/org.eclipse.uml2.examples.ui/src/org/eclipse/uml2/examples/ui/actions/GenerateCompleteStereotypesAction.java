/*
 * Copyright (c) 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: GenerateCompleteStereotypesAction.java,v 1.4 2005/11/23 20:09:07 khussey Exp $
 */
package org.eclipse.uml2.examples.ui.actions;

import java.util.Collection;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.UnexecutableCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.uml2.Profile;
import org.eclipse.uml2.Stereotype;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.common.edit.command.ChangeCommand;
import org.eclipse.uml2.examples.ui.ExamplesUIPlugin;

/**
 * 
 */
public class GenerateCompleteStereotypesAction
		extends GenerateProfileAction {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.edit.ui.action.CommandAction#createActionCommand(org.eclipse.emf.edit.domain.EditingDomain,
	 *      java.util.Collection)
	 */
	protected Command createActionCommand(EditingDomain editingDomain,
			Collection collection) {

		if (1 == collection.size()
			&& Profile.class.isInstance(collection.toArray()[0])) {

			final Profile profile = (Profile) collection.toArray()[0];

			return new ChangeCommand(editingDomain, new Runnable() {

				public void run() {
					Stereotype metamodelStereotype = generateOwnedStereotype(
						profile, "Metamodel", false); //$NON-NLS-1$
					org.eclipse.uml2.Class modelMetaclass = getReferencedUML2Metaclass(
						profile, UML2Package.Literals.MODEL);
					generateExtension(metamodelStereotype, modelMetaclass,
						false);

					Stereotype systemModelStereotype = generateOwnedStereotype(
						profile, "SystemModel", false); //$NON-NLS-1$
					generateExtension(systemModelStereotype, modelMetaclass,
						false);
				}
			}, ExamplesUIPlugin.INSTANCE.getString(
				"_UI_GenerateCompleteStereotypesActionCommand_label", //$NON-NLS-1$
				new Object[]{getLabelProvider().getText(profile)}));
		}

		return UnexecutableCommand.INSTANCE;
	}

}
