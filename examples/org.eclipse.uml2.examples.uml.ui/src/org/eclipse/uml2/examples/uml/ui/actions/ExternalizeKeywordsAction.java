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
 * $Id: ExternalizeKeywordsAction.java,v 1.4 2007/01/04 18:47:13 khussey Exp $
 */
package org.eclipse.uml2.examples.uml.ui.actions;

import java.io.PrintWriter;
import java.util.Collection;

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

	@Override
	protected Command createActionCommand(EditingDomain editingDomain,
			Collection<?> collection) {

		if (collection.size() == 1
			&& collection.iterator().next() instanceof Profile) {

			return IdentityCommand.INSTANCE;
		}

		return UnexecutableCommand.INSTANCE;
	}

	@Override
	public void run(IAction action) {

		if (command != UnexecutableCommand.INSTANCE) {
			final Profile profile = (Profile) collection.iterator().next();

			final PrintWriter propertiesWriter = getPropertiesWriter(profile);

			new UMLSwitch<Object>() {

				@Override
				public Object caseStereotype(Stereotype stereotype) {
					String qualifiedName = stereotype.getQualifiedName();

					if (!UML2Util.isEmpty(qualifiedName)) {
						propertiesWriter.println(getPropertiesKey(
							UML2Util.EMPTY_STRING, qualifiedName)
							+ PROPERTIES_SEPARATOR + stereotype.getKeyword());
					}

					return super.caseStereotype(stereotype);
				}

				@Override
				public Object defaultCase(EObject eObject) {

					for (EObject c : eObject.eContents()) {
						doSwitch(c);
					}

					return super.defaultCase(eObject);
				}

			}.doSwitch(profile);
		}
	}
}
