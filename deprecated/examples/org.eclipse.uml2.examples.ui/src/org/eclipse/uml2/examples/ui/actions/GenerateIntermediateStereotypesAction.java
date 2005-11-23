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
 * $Id: GenerateIntermediateStereotypesAction.java,v 1.4 2005/11/23 20:09:07 khussey Exp $
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
public class GenerateIntermediateStereotypesAction
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
					Stereotype documentStereotype = generateOwnedStereotype(
						profile, "Document", false); //$NON-NLS-1$
					org.eclipse.uml2.Class artifactMetaclass = getReferencedUML2Metaclass(
						profile, UML2Package.Literals.ARTIFACT);
					generateExtension(documentStereotype, artifactMetaclass,
						false);

					Stereotype entityStereotype = generateOwnedStereotype(
						profile, "Entity", false); //$NON-NLS-1$
					org.eclipse.uml2.Class componentMetaclass = getReferencedUML2Metaclass(
						profile, UML2Package.Literals.COMPONENT);
					generateExtension(entityStereotype, componentMetaclass,
						false);

					Stereotype executableStereotype = generateOwnedStereotype(
						profile, "Executable", false); //$NON-NLS-1$
					generateExtension(executableStereotype, artifactMetaclass,
						false);

					Stereotype fileStereotype = generateOwnedStereotype(
						profile, "File", false); //$NON-NLS-1$
					generateExtension(fileStereotype, artifactMetaclass, false);

					Stereotype libraryStereotype = generateOwnedStereotype(
						profile, "Library", false); //$NON-NLS-1$
					generateExtension(libraryStereotype, artifactMetaclass,
						false);

					Stereotype procesStereotype = generateOwnedStereotype(
						profile, "Process", false); //$NON-NLS-1$
					generateExtension(procesStereotype, componentMetaclass,
						false);

					Stereotype realizationStereotype = generateOwnedStereotype(
						profile, "Realization", false); //$NON-NLS-1$
					org.eclipse.uml2.Class classifierMetaclass = getReferencedUML2Metaclass(
						profile, UML2Package.Literals.CLASSIFIER);
					generateExtension(realizationStereotype,
						classifierMetaclass, false);

					Stereotype serviceStereotype = generateOwnedStereotype(
						profile, "Service", false); //$NON-NLS-1$
					generateExtension(serviceStereotype, componentMetaclass,
						false);

					Stereotype sourceStereotype = generateOwnedStereotype(
						profile, "Source", false); //$NON-NLS-1$
					generateExtension(sourceStereotype, artifactMetaclass,
						false);

					Stereotype specificationStereotype = generateOwnedStereotype(
						profile, "Specification", false); //$NON-NLS-1$
					generateExtension(specificationStereotype,
						classifierMetaclass, false);

					Stereotype subsystemStereotype = generateOwnedStereotype(
						profile, "Subsystem", false); //$NON-NLS-1$
					generateExtension(subsystemStereotype, componentMetaclass,
						false);
				}
			}, ExamplesUIPlugin.INSTANCE.getString(
				"_UI_GenerateIntermediateStereotypesActionCommand_label", //$NON-NLS-1$
				new Object[]{getLabelProvider().getText(profile)}));
		}

		return UnexecutableCommand.INSTANCE;
	}

}
