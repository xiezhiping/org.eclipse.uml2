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
 * $Id: GenerateUML2StereotypesAction.java,v 1.4 2007/01/04 18:47:13 khussey Exp $
 */
package org.eclipse.uml2.examples.uml.ui.actions;

import org.eclipse.emf.common.command.UnexecutableCommand;
import org.eclipse.jface.action.IAction;
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

	@Override
	public void run(IAction action) {

		if (command != UnexecutableCommand.INSTANCE) {
			final Profile profile = (Profile) collection.iterator().next();

			editingDomain.getCommandStack().execute(
				new ChangeCommand(editingDomain, new Runnable() {

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

						Stereotype expressionStereotype = generateOwnedStereotype(
							profile, "Expression", false); //$NON-NLS-1$
						org.eclipse.uml2.uml.Class opaqueExpressionMetaclass = getReferencedUMLMetaclass(
							profile, UMLPackage.Literals.OPAQUE_EXPRESSION);
						generateExtension(expressionStereotype,
							opaqueExpressionMetaclass, false);
						org.eclipse.uml2.uml.Class valueSpecificationMetaclass = getReferencedUMLMetaclass(
							profile, UMLPackage.Literals.VALUE_SPECIFICATION);
						generateOwnedAttribute(expressionStereotype,
							"operand", //$NON-NLS-1$
							valueSpecificationMetaclass, 0,
							LiteralUnlimitedNatural.UNLIMITED).setAggregation(
							AggregationKind.COMPOSITE_LITERAL);
						generateOwnedAttribute(expressionStereotype, "symbol", //$NON-NLS-1$
							stringPrimitiveType, 0, 1);

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

						Stereotype opaqueExpressionStereotype = generateOwnedStereotype(
							profile, "OpaqueExpression", false); //$NON-NLS-1$
						org.eclipse.uml2.uml.Class expressionMetaclass = getReferencedUMLMetaclass(
							profile, UMLPackage.Literals.EXPRESSION);
						generateExtension(opaqueExpressionStereotype,
							expressionMetaclass, false);
						org.eclipse.uml2.uml.Class behaviorMetaclass = getReferencedUMLMetaclass(
							profile, UMLPackage.Literals.BEHAVIOR);
						generateOwnedAttribute(opaqueExpressionStereotype,
							"behavior", //$NON-NLS-1$
							behaviorMetaclass, 0, 1);
						generateOwnedAttribute(opaqueExpressionStereotype,
							"body", //$NON-NLS-1$
							stringPrimitiveType, 0, 1);
						generateOwnedAttribute(opaqueExpressionStereotype,
							"language", //$NON-NLS-1$
							stringPrimitiveType, 0, 1);

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
					new Object[]{getLabelProvider().getText(profile)})));
		}
	}

}
