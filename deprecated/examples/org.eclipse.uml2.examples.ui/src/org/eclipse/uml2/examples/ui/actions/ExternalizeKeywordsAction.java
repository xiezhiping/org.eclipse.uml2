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
 * $Id: ExternalizeKeywordsAction.java,v 1.1 2005/04/14 17:32:07 khussey Exp $
 */
package org.eclipse.uml2.examples.ui.actions;

import java.io.PrintWriter;
import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.IdentityCommand;
import org.eclipse.emf.common.command.UnexecutableCommand;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.action.IAction;
import org.eclipse.uml2.Profile;
import org.eclipse.uml2.Stereotype;
import org.eclipse.uml2.util.UML2Switch;
import org.eclipse.uml2.util.UML2Util;

/**
 * 
 */
public class ExternalizeKeywordsAction
		extends PropertiesAction {

	/*
	 * @see org.eclipse.emf.edit.ui.action.CommandAction#createActionCommand(org.eclipse.emf.edit.domain.EditingDomain,
	 *      java.util.Collection)
	 */
	protected Command createActionCommand(EditingDomain editingDomain,
			Collection collection) {

		return 1 == collection.size()
			&& Profile.class.isInstance(collection.toArray()[0])
			? (Command) IdentityCommand.INSTANCE
			: (Command) UnexecutableCommand.INSTANCE;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.IActionDelegate#run(org.eclipse.jface.action.IAction)
	 */
	public void run(IAction action) {

		if (UnexecutableCommand.INSTANCE != command) {
			final Profile profile = (Profile) collection.toArray()[0];

			final PrintWriter propertiesWriter = getPropertiesWriter(profile);

			new UML2Switch() {

				public Object caseStereotype(Stereotype stereotype) {
					String qualifiedName = stereotype.getQualifiedName();

					if (!isEmpty(qualifiedName)) {
						propertiesWriter.println(getPropertiesKey(
							UML2Util.EMPTY_STRING, qualifiedName)
							+ PROPERTIES_SEPARATOR + stereotype.getKeyword());
					}

					return super.caseStereotype(stereotype);
				}

				public Object defaultCase(EObject eObject) {

					for (Iterator eContents = eObject.eContents().iterator(); eContents
						.hasNext();) {

						doSwitch((EObject) eContents.next());
					}

					return super.defaultCase(eObject);
				}

			}.doSwitch(profile);
		}
	}
}