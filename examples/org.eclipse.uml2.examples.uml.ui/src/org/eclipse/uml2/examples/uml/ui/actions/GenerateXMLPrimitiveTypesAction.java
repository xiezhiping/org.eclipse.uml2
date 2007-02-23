/*
 * Copyright (c) 2006, 2007 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: GenerateXMLPrimitiveTypesAction.java,v 1.3 2007/02/23 03:11:38 khussey Exp $
 */
package org.eclipse.uml2.examples.uml.ui.actions;

import org.eclipse.emf.common.command.UnexecutableCommand;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.util.EcoreSwitch;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.eclipse.jface.action.IAction;
import org.eclipse.uml2.common.edit.command.ChangeCommand;
import org.eclipse.uml2.examples.uml.ui.UMLExamplesUIPlugin;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.PrimitiveType;
import org.eclipse.uml2.uml.TemplateSignature;

public class GenerateXMLPrimitiveTypesAction
		extends GenerateModelAction {

	@Override
	public void run(IAction action) {

		if (command != UnexecutableCommand.INSTANCE) {
			final Model model = (Model) collection.iterator().next();

			editingDomain.getCommandStack().execute(
				new ChangeCommand(editingDomain, new Runnable() {

					public void run() {

						new EcoreSwitch<Object>() {

							@Override
							public Object caseEDataType(EDataType eDataType) {
								PrimitiveType ownedPrimitiveType = generateOwnedPrimitiveType(
									model, eDataType.getName());

								EList<ETypeParameter> eTypeParameters = eDataType
									.getETypeParameters();

								if (!eTypeParameters.isEmpty()) {
									TemplateSignature templateSignature = generateTemplateSignature(ownedPrimitiveType);

									for (ETypeParameter eTypeParameter : eTypeParameters) {
										generateTemplateParameter(
											templateSignature, eTypeParameter
												.getName());
									}
								}

								EDataType baseType = ExtendedMetaData.INSTANCE
									.getBaseType(eDataType);

								if (baseType != null) {
									ownedPrimitiveType.getGeneralization(
										(PrimitiveType) doSwitch(baseType),
										true);
								}

								return ownedPrimitiveType;
							}

							@Override
							public Object caseEEnum(EEnum eEnum) {
								return eEnum;
							}

							@Override
							public Object defaultCase(EObject eObject) {

								for (EObject c : eObject.eContents()) {
									doSwitch(c);
								}

								return eObject;
							}
						}.doSwitch(XMLTypePackage.eINSTANCE);
					}
				}, UMLExamplesUIPlugin.INSTANCE.getString(
					"_UI_GenerateXMLPrimitiveTypesActionCommand_label", //$NON-NLS-1$
					new Object[]{getLabelProvider().getText(model)})));
		}
	}

}
