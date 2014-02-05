/*
 * Copyright (c) 2005, 2014 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 327039, 400546, 418466
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

public class GenerateStandardStereotypesAction
		extends GenerateProfileAction {

	@Override
	public void run(IAction action) {

		if (command != UnexecutableCommand.INSTANCE) {
			final Profile profile = (Profile) collection.iterator().next();

			editingDomain.getCommandStack().execute(
				new ChangeCommand(editingDomain, new Runnable() {

					public void run() {
						Stereotype auxiliaryStereotype = generateOwnedStereotype(
							profile, "Auxiliary", false); //$NON-NLS-1$
						org.eclipse.uml2.uml.Class classMetaclass = getReferencedUMLMetaclass(
							profile, UMLPackage.Literals.CLASS);
						generateExtension(auxiliaryStereotype, classMetaclass,
							false);

						Stereotype callStereotype = generateOwnedStereotype(
							profile, "Call", false); //$NON-NLS-1$
						org.eclipse.uml2.uml.Class usageMetaclass = getReferencedUMLMetaclass(
							profile, UMLPackage.Literals.USAGE);
						generateExtension(callStereotype, usageMetaclass, false);

						Stereotype createStereotype = generateOwnedStereotype(
							profile, "Create", false); //$NON-NLS-1$
						org.eclipse.uml2.uml.Class behavioralFeatureMetaclass = getReferencedUMLMetaclass(
							profile, UMLPackage.Literals.BEHAVIORAL_FEATURE);
						getMetaclassEnd(
							generateExtension(createStereotype,
								behavioralFeatureMetaclass, false)).setLower(0);
						getMetaclassEnd(
							generateExtension(createStereotype, usageMetaclass,
								false)).setLower(0);

						Stereotype deriveStereotype = generateOwnedStereotype(
							profile, "Derive", false); //$NON-NLS-1$
						org.eclipse.uml2.uml.Class abstractionMetaclass = getReferencedUMLMetaclass(
							profile, UMLPackage.Literals.ABSTRACTION);
						generateExtension(deriveStereotype,
							abstractionMetaclass, false);
						org.eclipse.uml2.uml.Class valueSpecificationMetaclass = getReferencedUMLMetaclass(
							profile, UMLPackage.Literals.VALUE_SPECIFICATION);
						generateOwnedAttribute(deriveStereotype, "computation", //$NON-NLS-1$
							valueSpecificationMetaclass, 1, 1);

						Stereotype destroyStereotype = generateOwnedStereotype(
							profile, "Destroy", false); //$NON-NLS-1$
						generateExtension(destroyStereotype,
							behavioralFeatureMetaclass, false);

						Stereotype documentStereotype = generateOwnedStereotype(
							profile, "Document", false); //$NON-NLS-1$
						org.eclipse.uml2.uml.Class artifactMetaclass = getReferencedUMLMetaclass(
							profile, UMLPackage.Literals.ARTIFACT);
						generateExtension(documentStereotype,
							artifactMetaclass, false);

						Stereotype entityStereotype = generateOwnedStereotype(
							profile, "Entity", false); //$NON-NLS-1$
						org.eclipse.uml2.uml.Class componentMetaclass = getReferencedUMLMetaclass(
							profile, UMLPackage.Literals.COMPONENT);
						generateExtension(entityStereotype, componentMetaclass,
							false);

						Stereotype executableStereotype = generateOwnedStereotype(
							profile, "Executable", false); //$NON-NLS-1$
						generateExtension(executableStereotype,
							artifactMetaclass, false);

						Stereotype fileStereotype = generateOwnedStereotype(
							profile, "File", true); //$NON-NLS-1$
						generateExtension(fileStereotype, artifactMetaclass,
							false);
						generateGeneralization(documentStereotype,
							fileStereotype);
						generateGeneralization(executableStereotype,
							fileStereotype);

						Stereotype focusStereotype = generateOwnedStereotype(
							profile, "Focus", false); //$NON-NLS-1$
						generateExtension(focusStereotype, classMetaclass,
							false);

						Stereotype frameworkStereotype = generateOwnedStereotype(
							profile, "Framework", false); //$NON-NLS-1$
						org.eclipse.uml2.uml.Class packageMetaclass = getReferencedUMLMetaclass(
							profile, UMLPackage.Literals.PACKAGE);
						generateExtension(frameworkStereotype,
							packageMetaclass, false);

						Stereotype implementStereotype = generateOwnedStereotype(
							profile, "Implement", false); //$NON-NLS-1$
						generateExtension(implementStereotype,
							componentMetaclass, false);

						Stereotype implementationClassStereotype = generateOwnedStereotype(
							profile, "ImplementationClass", false); //$NON-NLS-1$
						generateExtension(implementationClassStereotype,
							classMetaclass, false);

						Stereotype instantiateStereotype = generateOwnedStereotype(
							profile, "Instantiate", false); //$NON-NLS-1$
						generateExtension(instantiateStereotype,
							usageMetaclass, false);

						Stereotype libraryStereotype = generateOwnedStereotype(
							profile, "Library", false); //$NON-NLS-1$
						generateExtension(libraryStereotype, artifactMetaclass,
							false);
						generateGeneralization(libraryStereotype,
							fileStereotype);

						Stereotype metaclassStereotype = generateOwnedStereotype(
							profile, "Metaclass", false); //$NON-NLS-1$
						generateExtension(metaclassStereotype, classMetaclass,
							false);

						Stereotype modelLibraryStereotype = generateOwnedStereotype(
							profile, "ModelLibrary", false); //$NON-NLS-1$
						generateExtension(modelLibraryStereotype,
							packageMetaclass, false);

						Stereotype procesStereotype = generateOwnedStereotype(
							profile, "Process", false); //$NON-NLS-1$
						generateExtension(procesStereotype, componentMetaclass,
							false);

						Stereotype realizationStereotype = generateOwnedStereotype(
							profile, "Realization", false); //$NON-NLS-1$
						org.eclipse.uml2.uml.Class classifierMetaclass = getReferencedUMLMetaclass(
							profile, UMLPackage.Literals.CLASSIFIER);
						generateExtension(realizationStereotype,
							classifierMetaclass, false);

						Stereotype refineStereotype = generateOwnedStereotype(
							profile, "Refine", false); //$NON-NLS-1$
						generateExtension(refineStereotype,
							abstractionMetaclass, false);

						Stereotype responsibilityStereotype = generateOwnedStereotype(
							profile, "Responsibility", false); //$NON-NLS-1$
						generateExtension(responsibilityStereotype,
							usageMetaclass, false);

						Stereotype scriptStereotype = generateOwnedStereotype(
							profile, "Script", false); //$NON-NLS-1$
						generateExtension(scriptStereotype, artifactMetaclass,
							false);
						generateGeneralization(scriptStereotype, fileStereotype);

						Stereotype sendStereotype = generateOwnedStereotype(
							profile, "Send", false); //$NON-NLS-1$
						generateExtension(sendStereotype, usageMetaclass, false);

						Stereotype serviceStereotype = generateOwnedStereotype(
							profile, "Service", false); //$NON-NLS-1$
						generateExtension(serviceStereotype,
							componentMetaclass, false);

						Stereotype sourceStereotype = generateOwnedStereotype(
							profile, "Source", false); //$NON-NLS-1$
						generateExtension(sourceStereotype, artifactMetaclass,
							false);
						generateGeneralization(sourceStereotype, fileStereotype);

						Stereotype specificationStereotype = generateOwnedStereotype(
							profile, "Specification", false); //$NON-NLS-1$
						generateExtension(specificationStereotype,
							classifierMetaclass, false);

						Stereotype subsystemStereotype = generateOwnedStereotype(
							profile, "Subsystem", false); //$NON-NLS-1$
						generateExtension(subsystemStereotype,
							componentMetaclass, false);

						Stereotype traceStereotype = generateOwnedStereotype(
							profile, "Trace", false); //$NON-NLS-1$
						generateExtension(traceStereotype,
							abstractionMetaclass, false);

						Stereotype typeStereotype = generateOwnedStereotype(
							profile, "Type", false); //$NON-NLS-1$
						generateExtension(typeStereotype, classMetaclass, false);

						Stereotype utilityStereotype = generateOwnedStereotype(
							profile, "Utility", false); //$NON-NLS-1$
						generateExtension(utilityStereotype, classMetaclass,
							false);

						Stereotype buildComponentStereotype = generateOwnedStereotype(
							profile, "BuildComponent", false); //$NON-NLS-1$
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
					"_UI_GenerateStandardStereotypesActionCommand_label", //$NON-NLS-1$
					new Object[]{getLabelProvider().getText(profile)})));
		}
	}

}
