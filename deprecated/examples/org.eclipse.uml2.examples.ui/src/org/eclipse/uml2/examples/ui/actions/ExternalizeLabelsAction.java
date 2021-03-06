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
 * $Id: ExternalizeLabelsAction.java,v 1.3 2005/12/22 20:19:56 khussey Exp $
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
import org.eclipse.uml2.NamedElement;
import org.eclipse.uml2.common.util.UML2Util;
import org.eclipse.uml2.util.UML2Switch;

/**
 * 
 */
public class ExternalizeLabelsAction
		extends PropertiesAction {

	/*
	 * @see org.eclipse.emf.edit.ui.action.CommandAction#createActionCommand(org.eclipse.emf.edit.domain.EditingDomain,
	 *      java.util.Collection)
	 */
	protected Command createActionCommand(EditingDomain editingDomain,
			Collection collection) {

		return 1 == collection.size()
			&& org.eclipse.uml2.Package.class
				.isInstance(collection.toArray()[0])
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
			final org.eclipse.uml2.Package package_ = (org.eclipse.uml2.Package) collection
				.toArray()[0];

			final PrintWriter propertiesWriter = getPropertiesWriter(package_);

			new UML2Switch() {

				public Object caseNamedElement(NamedElement namedElement) {
					String qualifiedName = namedElement.getQualifiedName();

					if (!UML2Util.isEmpty(qualifiedName)) {
						propertiesWriter.println(getPropertiesKey("_label_", //$NON-NLS-1$
							qualifiedName) + PROPERTIES_SEPARATOR
							+ format(capName(namedElement.getLabel()), " ", //$NON-NLS-1$
								null, false));
					}

					return super.caseNamedElement(namedElement);
				}

				public Object defaultCase(EObject eObject) {

					for (Iterator eContents = eObject.eContents().iterator(); eContents
						.hasNext();) {

						doSwitch((EObject) eContents.next());
					}

					return super.defaultCase(eObject);
				}

			}.doSwitch(package_);

			propertiesWriter.close();
		}
	}
}