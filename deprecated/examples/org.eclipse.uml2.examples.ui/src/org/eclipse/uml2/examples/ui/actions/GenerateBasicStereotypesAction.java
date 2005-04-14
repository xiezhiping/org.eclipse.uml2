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
 * $Id: GenerateBasicStereotypesAction.java,v 1.1 2005/04/14 17:32:07 khussey Exp $
 */
package org.eclipse.uml2.examples.ui.actions;

import java.util.Collection;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.UnexecutableCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.uml2.Profile;
import org.eclipse.uml2.Stereotype;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.edit.util.ChangeCommand;
import org.eclipse.uml2.examples.ui.ExamplesUIPlugin;

/**
 * 
 */
public class GenerateBasicStereotypesAction
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
					Stereotype auxiliaryStereotype = generateOwnedStereotype(
						profile, "Auxiliary", false); //$NON-NLS-1$
					org.eclipse.uml2.Class classMetaclass = getReferencedUML2Metaclass(
						profile, UML2Package.eINSTANCE.getClass_());
					generateExtension(auxiliaryStereotype, classMetaclass,
						false);

					Stereotype buildComponentStereotype = generateOwnedStereotype(
						profile, "BuildComponent", false); //$NON-NLS-1$
					org.eclipse.uml2.Class componentMetaclass = getReferencedUML2Metaclass(
						profile, UML2Package.eINSTANCE.getComponent());
					generateExtension(buildComponentStereotype,
						componentMetaclass, false);

					Stereotype createStereotype = generateOwnedStereotype(
						profile, "Create", false); //$NON-NLS-1$
					org.eclipse.uml2.Class behavioralFeatureMetaclass = getReferencedUML2Metaclass(
						profile, UML2Package.eINSTANCE.getBehavioralFeature());
					org.eclipse.uml2.Class usageMetaclass = getReferencedUML2Metaclass(
						profile, UML2Package.eINSTANCE.getUsage());
					generateExtension(createStereotype,
						behavioralFeatureMetaclass, false);
					generateExtension(createStereotype, usageMetaclass, false);

					Stereotype callStereotype = generateOwnedStereotype(
						profile, "Call", false); //$NON-NLS-1$
					generateExtension(callStereotype, usageMetaclass, false);

					Stereotype deriveStereotype = generateOwnedStereotype(
						profile, "Derive", false); //$NON-NLS-1$
					org.eclipse.uml2.Class abstractionMetaclass = getReferencedUML2Metaclass(
						profile, UML2Package.eINSTANCE.getAbstraction());
					generateExtension(deriveStereotype, abstractionMetaclass,
						false);

					Stereotype destroyStereotype = generateOwnedStereotype(
						profile, "Destroy", false); //$NON-NLS-1$
					generateExtension(destroyStereotype,
						behavioralFeatureMetaclass, false);

					Stereotype focusStereotype = generateOwnedStereotype(
						profile, "Focus", false); //$NON-NLS-1$
					generateExtension(focusStereotype, classMetaclass, false);

					Stereotype frameworkStereotype = generateOwnedStereotype(
						profile, "Framework", false); //$NON-NLS-1$
					org.eclipse.uml2.Class packageMetaclass = getReferencedUML2Metaclass(
						profile, UML2Package.eINSTANCE.getPackage());
					generateExtension(frameworkStereotype, packageMetaclass,
						false);

					Stereotype implementStereotype = generateOwnedStereotype(
						profile, "Implement", false); //$NON-NLS-1$
					generateExtension(implementStereotype, componentMetaclass,
						false);

					Stereotype implementationClassStereotype = generateOwnedStereotype(
						profile, "ImplementationClass", false); //$NON-NLS-1$
					generateExtension(implementationClassStereotype,
						classMetaclass, false);

					Stereotype instantiateStereotype = generateOwnedStereotype(
						profile, "Instantiate", false); //$NON-NLS-1$
					generateExtension(instantiateStereotype, usageMetaclass,
						false);

					Stereotype metaclassStereotype = generateOwnedStereotype(
						profile, "Metaclass", false); //$NON-NLS-1$
					generateExtension(metaclassStereotype, classMetaclass,
						false);

					Stereotype modelLibraryStereotype = generateOwnedStereotype(
						profile, "ModelLibrary", false); //$NON-NLS-1$
					generateExtension(modelLibraryStereotype, packageMetaclass,
						false);

					Stereotype refineStereotype = generateOwnedStereotype(
						profile, "Refine", false); //$NON-NLS-1$
					generateExtension(refineStereotype, abstractionMetaclass,
						false);

					Stereotype responsibilityStereotype = generateOwnedStereotype(
						profile, "Responsibility", false); //$NON-NLS-1$
					generateExtension(responsibilityStereotype, usageMetaclass,
						false);

					Stereotype scriptStereotype = generateOwnedStereotype(
						profile, "Script", false); //$NON-NLS-1$
					org.eclipse.uml2.Class artifactMetaclass = getReferencedUML2Metaclass(
						profile, UML2Package.eINSTANCE.getArtifact());
					generateExtension(scriptStereotype, artifactMetaclass,
						false);

					Stereotype sendStereotype = generateOwnedStereotype(
						profile, "Send", false); //$NON-NLS-1$
					generateExtension(sendStereotype, usageMetaclass, false);

					Stereotype traceStereotype = generateOwnedStereotype(
						profile, "Trace", false); //$NON-NLS-1$
					generateExtension(traceStereotype, abstractionMetaclass,
						false);

					Stereotype typeStereotype = generateOwnedStereotype(
						profile, "Type", false); //$NON-NLS-1$
					generateExtension(typeStereotype, classMetaclass, false);

					Stereotype utilityStereotype = generateOwnedStereotype(
						profile, "Utility", false); //$NON-NLS-1$
					generateExtension(utilityStereotype, classMetaclass, false);
				}
			}, ExamplesUIPlugin.getDefault().getString(
				"_UI_GenerateBasicStereotypesActionCommand_label", //$NON-NLS-1$
				new Object[]{getLabelProvider().getText(profile)}));
		}

		return UnexecutableCommand.INSTANCE;
	}

}
