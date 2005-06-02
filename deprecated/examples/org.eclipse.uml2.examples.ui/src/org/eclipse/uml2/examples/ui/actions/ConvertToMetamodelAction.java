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
 * $Id: ConvertToMetamodelAction.java,v 1.4 2005/06/02 14:29:45 khussey Exp $
 */
package org.eclipse.uml2.examples.ui.actions;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.UnexecutableCommand;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.uml2.Model;
import org.eclipse.uml2.PackageableElement;
import org.eclipse.uml2.Profile;
import org.eclipse.uml2.Stereotype;
import org.eclipse.uml2.VisibilityKind;
import org.eclipse.uml2.common.edit.command.ChangeCommand;
import org.eclipse.uml2.examples.ui.ExamplesUIPlugin;
import org.eclipse.uml2.util.UML2Resource;
import org.eclipse.uml2.util.UML2Switch;

/**
 * 
 */
public class ConvertToMetamodelAction
		extends ConvertModelAction {

	protected static final String STEREOTYPE_NAME__METACLASS = "Metaclass"; //$NON-NLS-1$

	protected static final String STEREOTYPE_NAME__METAMODEL = "Metamodel"; //$NON-NLS-1$

	/*
	 * @see org.eclipse.emf.edit.ui.action.CommandAction#createActionCommand(org.eclipse.emf.edit.domain.EditingDomain,
	 *      java.util.Collection)
	 */
	protected Command createActionCommand(EditingDomain editingDomain,
			Collection collection) {

		if (1 == collection.size()
			&& Model.class.isInstance(collection.toArray()[0])) {

			final Model model = (Model) collection.toArray()[0];

			return new ChangeCommand(editingDomain, new Runnable() {

				public void run() {
					Profile completeProfile = applyProfile(model,
						UML2Resource.COMPLETE_PROFILE_URI);

					if (null != completeProfile) {
						applyStereotype(model, completeProfile
							.getOwnedStereotype(STEREOTYPE_NAME__METAMODEL));
					}

					Profile basicProfile = applyProfile(model,
						UML2Resource.BASIC_PROFILE_URI);

					if (null != basicProfile) {
						final Stereotype metaclassStereotype = basicProfile
							.getOwnedStereotype(STEREOTYPE_NAME__METACLASS);

						new UML2Switch() {

							public Object caseClass(
									org.eclipse.uml2.Class class_) {
								applyStereotype(class_, metaclassStereotype);

								return defaultCase(class_);
							}

							public Object casePackage(
									org.eclipse.uml2.Package package_) {
								return defaultCase(package_);
							}

							public Object casePackageableElement(
									PackageableElement packageableElement) {
								packageableElement
									.setVisibility(VisibilityKind.PRIVATE_LITERAL);

								return defaultCase(packageableElement);
							}

							public Object defaultCase(EObject eObject) {

								for (Iterator eContents = eObject.eContents()
									.iterator(); eContents.hasNext();) {

									doSwitch((EObject) eContents.next());
								}

								return this;
							}
						}.doSwitch(model);
					}
				}
			}, ExamplesUIPlugin.INSTANCE.getString(
				"_UI_ConvertToMetamodelActionCommand_label", //$NON-NLS-1$
				new Object[]{getLabelProvider().getText(model)}));
		}

		return UnexecutableCommand.INSTANCE;
	}

}
