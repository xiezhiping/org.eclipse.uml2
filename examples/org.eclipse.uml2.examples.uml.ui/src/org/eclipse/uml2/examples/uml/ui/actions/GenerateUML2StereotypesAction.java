/*
 * Copyright (c) 2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: GenerateUML2StereotypesAction.java,v 1.1 2006/04/25 20:58:28 khussey Exp $
 */
package org.eclipse.uml2.examples.uml.ui.actions;

import java.util.Collection;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.UnexecutableCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.uml2.common.edit.command.ChangeCommand;
import org.eclipse.uml2.examples.uml.ui.UMLExamplesUIPlugin;
import org.eclipse.uml2.uml.AggregationKind;
import org.eclipse.uml2.uml.LiteralUnlimitedNatural;
import org.eclipse.uml2.uml.PrimitiveType;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLPackage;

public class GenerateUML2StereotypesAction
		extends GenerateProfileAction {

	protected Command createActionCommand(EditingDomain editingDomain,
			Collection collection) {

		if (collection.size() == 1) {
			Object object = collection.toArray()[0];

			if (object instanceof Profile) {
				final Profile profile = (Profile) object;

				return new ChangeCommand(editingDomain, new Runnable() {

					public void run() {
						Stereotype actionStereotype = generateOwnedStereotype(
							profile, "Action", false); //$NON-NLS-1$
						org.eclipse.uml2.uml.Class actionMetaclass = getReferencedUMLMetaclass(
							profile, UMLPackage.Literals.ACTION);
						generateExtension(actionStereotype, actionMetaclass,
							false);
						PrimitiveType stringPrimitiveType = getImportedUMLPrimitiveType(
							profile, "String"); //$NON-NLS-1$
						generateOwnedAttribute(actionStereotype, "effect", //$NON-NLS-1$
							stringPrimitiveType, 0, 1);

						Stereotype activityStereotype = generateOwnedStereotype(
							profile, "Activity", false); //$NON-NLS-1$
						org.eclipse.uml2.uml.Class activityMetaclass = getReferencedUMLMetaclass(
							profile, UMLPackage.Literals.ACTIVITY);
						generateExtension(activityStereotype,
							activityMetaclass, false);
						generateOwnedAttribute(activityStereotype, "body", //$NON-NLS-1$
							stringPrimitiveType, 0, 1);
						generateOwnedAttribute(activityStereotype, "language", //$NON-NLS-1$
							stringPrimitiveType, 0, 1);

						Stereotype commentStereotype = generateOwnedStereotype(
							profile, "Comment", false); //$NON-NLS-1$
						org.eclipse.uml2.uml.Class commentMetaclass = getReferencedUMLMetaclass(
							profile, UMLPackage.Literals.COMMENT);
						generateExtension(commentStereotype, commentMetaclass,
							false);
						org.eclipse.uml2.uml.Class stringExpressionMetaclass = getReferencedUMLMetaclass(
							profile, UMLPackage.Literals.STRING_EXPRESSION);
						generateOwnedAttribute(commentStereotype,
							"bodyExpression", //$NON-NLS-1$
							stringExpressionMetaclass, 0, 1).setAggregation(
							AggregationKind.COMPOSITE_LITERAL);

						Stereotype messageStereotype = generateOwnedStereotype(
							profile, "Message", false); //$NON-NLS-1$
						org.eclipse.uml2.uml.Class messageMetaclass = getReferencedUMLMetaclass(
							profile, UMLPackage.Literals.MESSAGE);
						generateExtension(messageStereotype, messageMetaclass,
							false);
						org.eclipse.uml2.uml.Class namedElementMetaclass = getReferencedUMLMetaclass(
							profile, UMLPackage.Literals.NAMED_ELEMENT);
						generateOwnedAttribute(messageStereotype, "signature", //$NON-NLS-1$
							namedElementMetaclass, 0, 1);

						Stereotype templateSignatureStereotype = generateOwnedStereotype(
							profile, "TemplateSignature", false); //$NON-NLS-1$
						org.eclipse.uml2.uml.Class templateSignatureMetaclass = getReferencedUMLMetaclass(
							profile, UMLPackage.Literals.TEMPLATE_SIGNATURE);
						generateExtension(templateSignatureStereotype,
							templateSignatureMetaclass, false);
						generateOwnedAttribute(
							templateSignatureStereotype,
							"nestedSignature", //$NON-NLS-1$
							templateSignatureMetaclass, 0,
							LiteralUnlimitedNatural.UNLIMITED);
						generateOwnedAttribute(templateSignatureStereotype,
							"nestingSignature", //$NON-NLS-1$
							templateSignatureMetaclass, 0, 1);

						setIDs(profile);
					}
				}, UMLExamplesUIPlugin.INSTANCE.getString(
					"_UI_GenerateUML2StereotypesActionCommand_label", //$NON-NLS-1$
					new Object[]{getLabelProvider().getText(profile)}));
			}
		}

		return UnexecutableCommand.INSTANCE;
	}

}
