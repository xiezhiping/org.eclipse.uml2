/*
 * Copyright (c) 2005, 2014 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 327039, 418466
 *
 */
package org.eclipse.uml2.examples.uml.ui.actions;

import org.eclipse.emf.common.command.UnexecutableCommand;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.action.IAction;
import org.eclipse.uml2.examples.uml.ui.UMLExamplesUIPlugin;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.DataType;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.VisibilityKind;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.eclipse.uml2.uml.util.UMLSwitch;

public class ConvertToMetamodelAction
		extends ConvertModelAction {

	protected static final String STEREOTYPE_NAME__METACLASS = "Metaclass"; //$NON-NLS-1$

	protected static final String STEREOTYPE_NAME__METAMODEL = "Metamodel"; //$NON-NLS-1$

	@Override
	public void run(IAction action) {

		if (command != UnexecutableCommand.INSTANCE) {
			final Model model = (Model) collection.iterator().next();

			editingDomain.getCommandStack().execute(
				new RefreshingChangeCommand(editingDomain, new Runnable() {

					public void run() {
						EcoreUtil.resolveAll(model);

						Profile standardProfile = applyProfile(model,
							UMLResource.STANDARD_PROFILE_URI);

						if (standardProfile != null) {
							applyStereotype(model, standardProfile
								.getOwnedStereotype(STEREOTYPE_NAME__METAMODEL));
						}

						final Stereotype metaclassStereotype = standardProfile == null
							? null
							: standardProfile
								.getOwnedStereotype(STEREOTYPE_NAME__METACLASS);

						new UMLSwitch<Object>() {

							@Override
							public Object caseClass(
									org.eclipse.uml2.uml.Class class_) {
								applyStereotype(class_, metaclassStereotype);

								return defaultCase(class_);
							}

							@Override
							public Object caseDataType(DataType object) {
								// simply exclude DataTypes from the caseClassifier to
								// preserve the user-specified visibility
								
								return defaultCase(object);
							}
							
							@Override
							public Object caseClassifier(Classifier classifier) {
								classifier
									.setVisibility(VisibilityKind.PRIVATE_LITERAL);

								return defaultCase(classifier);
							}

							@Override
							public Object defaultCase(EObject eObject) {
								setID(eObject);

								for (EObject c : eObject.eContents()) {
									doSwitch(c);
								}

								return this;
							}
						}.doSwitch(model);

					}
				}, UMLExamplesUIPlugin.INSTANCE.getString(
					"_UI_ConvertToMetamodelActionCommand_label", //$NON-NLS-1$
					new Object[]{getLabelProvider().getText(model)})));
		}
	}

}
