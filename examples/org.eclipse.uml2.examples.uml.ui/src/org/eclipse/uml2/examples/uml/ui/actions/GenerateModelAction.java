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
 * $Id: GenerateModelAction.java,v 1.4 2007/02/23 03:11:38 khussey Exp $
 */
package org.eclipse.uml2.examples.uml.ui.actions;

import java.util.Collection;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.IdentityCommand;
import org.eclipse.emf.common.command.UnexecutableCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.uml2.common.util.UML2Util;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.ParameterableElement;
import org.eclipse.uml2.uml.PrimitiveType;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.TemplateSignature;
import org.eclipse.uml2.uml.TemplateableElement;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.editor.actions.UMLCommandAction;

public class GenerateModelAction
		extends UMLCommandAction {

	@Override
	protected Command createActionCommand(EditingDomain editingDomain,
			Collection<?> collection) {

		if (collection.size() == 1
			&& collection.iterator().next() instanceof Model) {

			return IdentityCommand.INSTANCE;
		}

		return UnexecutableCommand.INSTANCE;
	}

	protected PrimitiveType generateOwnedPrimitiveType(
			org.eclipse.uml2.uml.Package package_, String name) {
		return (PrimitiveType) package_.getPackagedElement(name, false,
			UMLPackage.Literals.PRIMITIVE_TYPE, true);
	}

	protected TemplateSignature generateTemplateSignature(
			TemplateableElement templateableElement) {
		TemplateSignature templateSignature = templateableElement
			.getOwnedTemplateSignature();

		if (templateSignature == null) {
			templateSignature = templateableElement
				.createOwnedTemplateSignature();
		}

		return templateSignature;
	}

	protected TemplateParameter generateTemplateParameter(
			TemplateSignature signature, String name) {
		TemplateParameter templateParameter = null;

		for (TemplateParameter ownedParameter : signature.getOwnedParameters()) {
			ParameterableElement ownedParameteredElement = ownedParameter
				.getOwnedParameteredElement();

			if (ownedParameteredElement instanceof org.eclipse.uml2.uml.Class
				&& UML2Util.safeEquals(name,
					((org.eclipse.uml2.uml.Class) ownedParameteredElement)
						.getName())) {

				templateParameter = ownedParameter;
				break;
			}
		}

		if (templateParameter == null) {
			templateParameter = signature
				.createOwnedParameter(UMLPackage.Literals.CLASSIFIER_TEMPLATE_PARAMETER);

			((org.eclipse.uml2.uml.Class) templateParameter
				.createOwnedParameteredElement(UMLPackage.Literals.CLASS))
				.setName(name);
		}

		return templateParameter;
	}
}
