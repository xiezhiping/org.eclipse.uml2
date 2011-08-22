/*
 * Copyright (c) 2005, 2011 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 327039
 *
 */
package org.eclipse.uml2.examples.uml.ui.actions;

import org.eclipse.emf.common.command.UnexecutableCommand;
import org.eclipse.jface.action.IAction;
import org.eclipse.uml2.common.edit.command.ChangeCommand;
import org.eclipse.uml2.examples.uml.ui.UMLExamplesUIPlugin;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLPackage;

public class GenerateStandardL3StereotypesAction
		extends GenerateProfileAction {

	@Override
	public void run(IAction action) {

		if (command != UnexecutableCommand.INSTANCE) {
			final Profile profile = (Profile) collection.iterator().next();

			editingDomain.getCommandStack().execute(
				new ChangeCommand(editingDomain, new Runnable() {

					public void run() {
						Stereotype buildComponentStereotype = generateOwnedStereotype(
							profile, "BuildComponent", false); //$NON-NLS-1$
						org.eclipse.uml2.uml.Class componentMetaclass = getReferencedUMLMetaclass(
							profile, UMLPackage.Literals.COMPONENT);
						generateExtension(buildComponentStereotype,
							componentMetaclass, false);

						Stereotype metamodelStereotype = generateOwnedStereotype(
							profile, "Metamodel", false); //$NON-NLS-1$
						org.eclipse.uml2.uml.Class modelMetaclass = getReferencedUMLMetaclass(
							profile, UMLPackage.Literals.MODEL);
						generateExtension(metamodelStereotype, modelMetaclass,
							false);

						Stereotype systemModelStereotype = generateOwnedStereotype(
							profile, "SystemModel", false); //$NON-NLS-1$
						generateExtension(systemModelStereotype,
							modelMetaclass, false);

						setIDs(profile);
					}
				}, UMLExamplesUIPlugin.INSTANCE.getString(
					"_UI_GenerateStandardL3StereotypesActionCommand_label", //$NON-NLS-1$
					new Object[]{getLabelProvider().getText(profile)})));
		}
	}

}
