/*
 * Copyright (c) 2005, 2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: ExternalizeKeywordsAction.java,v 1.1 2006/03/28 21:07:32 khussey Exp $
 */
package org.eclipse.uml2.examples.uml.ui.actions;

import java.io.PrintWriter;
import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.IdentityCommand;
import org.eclipse.emf.common.command.UnexecutableCommand;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.action.IAction;
import org.eclipse.uml2.common.util.UML2Util;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.util.UMLSwitch;

public class ExternalizeKeywordsAction
		extends PropertiesAction {

	protected Command createActionCommand(EditingDomain editingDomain,
			Collection collection) {

		return collection.size() == 1
			&& collection.toArray()[0] instanceof Profile
			? (Command) IdentityCommand.INSTANCE
			: (Command) UnexecutableCommand.INSTANCE;
	}

	public void run(IAction action) {

		if (command != UnexecutableCommand.INSTANCE) {
			final Profile profile = (Profile) collection.toArray()[0];

			final PrintWriter propertiesWriter = getPropertiesWriter(profile);

			new UMLSwitch() {

				public Object caseStereotype(Stereotype stereotype) {
					String qualifiedName = stereotype.getQualifiedName();

					if (UML2Util.isEmpty(qualifiedName)) {
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
