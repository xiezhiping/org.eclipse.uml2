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
 * $Id: GenerateEcoreStereotypesAction.java,v 1.7 2007/05/16 17:35:54 khussey Exp $
 */
package org.eclipse.uml2.examples.uml.ui.actions;

import org.eclipse.emf.common.command.UnexecutableCommand;
import org.eclipse.jface.action.IAction;
import org.eclipse.uml2.common.edit.command.ChangeCommand;
import org.eclipse.uml2.examples.uml.ui.UMLExamplesUIPlugin;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.LiteralUnlimitedNatural;
import org.eclipse.uml2.uml.PrimitiveType;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLPackage;

public class GenerateEcoreStereotypesAction
		extends GenerateProfileAction {

	@Override
	public void run(IAction action) {

		if (command != UnexecutableCommand.INSTANCE) {
			final Profile profile = (Profile) collection.iterator().next();

			editingDomain.getCommandStack().execute(
				new ChangeCommand(editingDomain, new Runnable() {

					public void run() {
						Stereotype ePackageStereotype = generateOwnedStereotype(
							profile, "EPackage", false); //$NON-NLS-1$
						generateIcon(ePackageStereotype,
							"../icons/full/ovr16/EPackage.gif"); //$NON-NLS-1$
						org.eclipse.uml2.uml.Class packageMetaclass = getReferencedUMLMetaclass(
							profile, UMLPackage.Literals.PACKAGE);
						generateExtension(ePackageStereotype, packageMetaclass,
							false);
						PrimitiveType stringUMLPrimitiveType = getImportedUMLPrimitiveType(
							profile, "String"); //$NON-NLS-1$
						generateOwnedAttribute(ePackageStereotype,
							"packageName", //$NON-NLS-1$
							stringUMLPrimitiveType, 0, 1);
						generateOwnedAttribute(ePackageStereotype, "nsPrefix", //$NON-NLS-1$
							stringUMLPrimitiveType, 0, 1);
						generateOwnedAttribute(ePackageStereotype, "nsURI", //$NON-NLS-1$
							stringUMLPrimitiveType, 0, 1);
						generateOwnedAttribute(ePackageStereotype,
							"basePackage", //$NON-NLS-1$
							stringUMLPrimitiveType, 0, 1);
						generateOwnedAttribute(ePackageStereotype, "prefix", //$NON-NLS-1$
							stringUMLPrimitiveType, 0, 1);

						Stereotype eNamedElementStereotype = generateOwnedStereotype(
							profile, "ENamedElement", true); //$NON-NLS-1$
						generateOwnedAttribute(eNamedElementStereotype,
							"xmlName", //$NON-NLS-1$
							stringUMLPrimitiveType, 0, 1);

						Stereotype eClassifierStereotype = generateOwnedStereotype(
							profile, "EClassifier", true); //$NON-NLS-1$
						generateGeneralization(eClassifierStereotype,
							eNamedElementStereotype);
						generateOwnedAttribute(eClassifierStereotype,
							"instanceClassName", stringUMLPrimitiveType, 0, 1); //$NON-NLS-1$

						Enumeration contentKindEnumeration = generateOwnedEnumeration(
							profile, "ContentKind"); //$NON-NLS-1$
						generateOwnedLiteral(contentKindEnumeration,
							"Unspecified"); //$NON-NLS-1$
						generateOwnedLiteral(contentKindEnumeration, "Empty"); //$NON-NLS-1$
						generateOwnedLiteral(contentKindEnumeration, "Simple"); //$NON-NLS-1$
						generateOwnedLiteral(contentKindEnumeration, "Mixed"); //$NON-NLS-1$
						generateOwnedLiteral(contentKindEnumeration,
							"ElementOnly"); //$NON-NLS-1$

						Stereotype eClassStereotype = generateOwnedStereotype(
							profile, "EClass", false); //$NON-NLS-1$
						generateIcon(eClassStereotype,
							"../icons/full/ovr16/EClass.gif"); //$NON-NLS-1$
						org.eclipse.uml2.uml.Class classMetaclass = getReferencedUMLMetaclass(
							profile, UMLPackage.Literals.CLASS);
						org.eclipse.uml2.uml.Class interfaceMetaclass = getReferencedUMLMetaclass(
							profile, UMLPackage.Literals.INTERFACE);
						org.eclipse.uml2.uml.Class dataTypeMetaclass = getReferencedUMLMetaclass(
							profile, UMLPackage.Literals.DATA_TYPE);
						generateExtension(eClassStereotype, classMetaclass,
							false);
						generateExtension(eClassStereotype, interfaceMetaclass,
							false);
						generateExtension(eClassStereotype, dataTypeMetaclass,
							false);
						generateGeneralization(eClassStereotype,
							eClassifierStereotype);
						generateOwnedAttribute(eClassStereotype, "className", //$NON-NLS-1$
							stringUMLPrimitiveType, 0, 1);
						generateOwnedAttribute(eClassStereotype,
							"xmlContentKind", //$NON-NLS-1$
							contentKindEnumeration, 0, 1);

						Stereotype eDataTypeStereotype = generateOwnedStereotype(
							profile, "EDataType", false); //$NON-NLS-1$
						generateIcon(eDataTypeStereotype,
							"../icons/full/ovr16/EDataType.gif"); //$NON-NLS-1$
						org.eclipse.uml2.uml.Class primitiveTypeMetaclass = getReferencedUMLMetaclass(
							profile, UMLPackage.Literals.PRIMITIVE_TYPE);
						generateExtension(eDataTypeStereotype,
							primitiveTypeMetaclass, false);
						generateGeneralization(eDataTypeStereotype,
							eClassifierStereotype);
						generateOwnedAttribute(eDataTypeStereotype,
							"dataTypeName", //$NON-NLS-1$
							stringUMLPrimitiveType, 0, 1);

						Stereotype eEnumStereotype = generateOwnedStereotype(
							profile, "EEnum", false); //$NON-NLS-1$
						generateIcon(eEnumStereotype,
							"../icons/full/ovr16/EEnum.gif"); //$NON-NLS-1$
						org.eclipse.uml2.uml.Class enumerationMetaclass = getReferencedUMLMetaclass(
							profile, UMLPackage.Literals.ENUMERATION);
						generateExtension(eEnumStereotype,
							enumerationMetaclass, false);
						generateGeneralization(eEnumStereotype,
							eNamedElementStereotype);
						generateOwnedAttribute(eEnumStereotype, "enumName", //$NON-NLS-1$
							stringUMLPrimitiveType, 0, 1);

						Stereotype eEnumLiteralStereotype = generateOwnedStereotype(
							profile, "EEnumLiteral", false); //$NON-NLS-1$
						generateIcon(eEnumLiteralStereotype,
							"../icons/full/ovr16/EEnumLiteral.gif"); //$NON-NLS-1$
						org.eclipse.uml2.uml.Class enumerationLiteralMetaclass = getReferencedUMLMetaclass(
							profile, UMLPackage.Literals.ENUMERATION_LITERAL);
						generateExtension(eEnumLiteralStereotype,
							enumerationLiteralMetaclass, false);
						generateGeneralization(eEnumLiteralStereotype,
							eNamedElementStereotype);
						generateOwnedAttribute(eEnumLiteralStereotype,
							"enumLiteralName", stringUMLPrimitiveType, 0, 1); //$NON-NLS-1$

						Stereotype eOperationStereotype = generateOwnedStereotype(
							profile, "EOperation", false); //$NON-NLS-1$
						generateIcon(eOperationStereotype,
							"../icons/full/ovr16/EOperation.gif"); //$NON-NLS-1$
						org.eclipse.uml2.uml.Class operationMetaclass = getReferencedUMLMetaclass(
							profile, UMLPackage.Literals.OPERATION);
						generateExtension(eOperationStereotype,
							operationMetaclass, false);
						generateOwnedAttribute(eOperationStereotype,
							"operationName", stringUMLPrimitiveType, 0, 1); //$NON-NLS-1$

						Stereotype eParameterStereotype = generateOwnedStereotype(
							profile, "EParameter", false); //$NON-NLS-1$
						generateIcon(eParameterStereotype,
							"../icons/full/ovr16/EParameter.gif"); //$NON-NLS-1$
						org.eclipse.uml2.uml.Class parameterMetaclass = getReferencedUMLMetaclass(
							profile, UMLPackage.Literals.PARAMETER);
						generateExtension(eParameterStereotype,
							parameterMetaclass, false);
						generateOwnedAttribute(eParameterStereotype,
							"parameterName", stringUMLPrimitiveType, 0, 1); //$NON-NLS-1$

						Enumeration featureKindEnumeration = generateOwnedEnumeration(
							profile, "FeatureKind"); //$NON-NLS-1$
						generateOwnedLiteral(featureKindEnumeration,
							"Unspecified"); //$NON-NLS-1$
						generateOwnedLiteral(featureKindEnumeration, "Simple"); //$NON-NLS-1$
						generateOwnedLiteral(featureKindEnumeration,
							"Attribute"); //$NON-NLS-1$
						generateOwnedLiteral(featureKindEnumeration,
							"AttributeWildcard"); //$NON-NLS-1$
						generateOwnedLiteral(featureKindEnumeration, "Element"); //$NON-NLS-1$
						generateOwnedLiteral(featureKindEnumeration,
							"ElementWildcard"); //$NON-NLS-1$
						generateOwnedLiteral(featureKindEnumeration, "Group"); //$NON-NLS-1$

						Enumeration visibilityKindEnumeration = generateOwnedEnumeration(
							profile, "VisibilityKind"); //$NON-NLS-1$
						generateOwnedLiteral(visibilityKindEnumeration,
							"Unspecified"); //$NON-NLS-1$
						generateOwnedLiteral(visibilityKindEnumeration, "None"); //$NON-NLS-1$
						generateOwnedLiteral(visibilityKindEnumeration,
							"ReadOnly"); //$NON-NLS-1$
						generateOwnedLiteral(visibilityKindEnumeration,
							"ReadWrite"); //$NON-NLS-1$
						generateOwnedLiteral(visibilityKindEnumeration,
							"ReadOnlyUnsettable"); //$NON-NLS-1$
						generateOwnedLiteral(visibilityKindEnumeration,
							"ReadWriteUnsettable"); //$NON-NLS-1$

						Stereotype eStructuralFeatureStereotype = generateOwnedStereotype(
							profile, "EStructuralFeature", true); //$NON-NLS-1$
						generateGeneralization(eStructuralFeatureStereotype,
							eNamedElementStereotype);
						PrimitiveType booleanPrimitiveType = getImportedUMLPrimitiveType(
							profile, "Boolean"); //$NON-NLS-1$
						generateOwnedAttribute(eStructuralFeatureStereotype,
							"isTransient", booleanPrimitiveType, 0, 1); //$NON-NLS-1$
						generateOwnedAttribute(eStructuralFeatureStereotype,
							"isVolatile", booleanPrimitiveType, 0, 1); //$NON-NLS-1$
						generateOwnedAttribute(eStructuralFeatureStereotype,
							"isUnsettable", booleanPrimitiveType, 0, 1); //$NON-NLS-1$
						generateOwnedAttribute(eStructuralFeatureStereotype,
							"xmlNamespace", stringUMLPrimitiveType, 0, 1); //$NON-NLS-1$
						generateOwnedAttribute(eStructuralFeatureStereotype,
							"xmlFeatureKind", featureKindEnumeration, 0, 1); //$NON-NLS-1$
						generateOwnedAttribute(eStructuralFeatureStereotype,
							"visibility", visibilityKindEnumeration, 0, 1); //$NON-NLS-1$

						Stereotype eAttributeStereotype = generateOwnedStereotype(
							profile, "EAttribute", false); //$NON-NLS-1$
						generateIcon(eAttributeStereotype,
							"../icons/full/ovr16/EAttribute.gif"); //$NON-NLS-1$
						org.eclipse.uml2.uml.Class propertyMetaclass = getReferencedUMLMetaclass(
							profile, UMLPackage.Literals.PROPERTY);
						generateExtension(eAttributeStereotype,
							propertyMetaclass, false);
						generateGeneralization(eAttributeStereotype,
							eStructuralFeatureStereotype);
						generateOwnedAttribute(eAttributeStereotype,
							"attributeName", stringUMLPrimitiveType, 0, 1); //$NON-NLS-1$
						generateOwnedAttribute(eAttributeStereotype,
							"isID", booleanPrimitiveType, 0, 1); //$NON-NLS-1$

						Stereotype eReferenceStereotype = generateOwnedStereotype(
							profile, "EReference", false); //$NON-NLS-1$
						generateIcon(eReferenceStereotype,
							"../icons/full/ovr16/EReference.gif"); //$NON-NLS-1$
						generateExtension(eReferenceStereotype,
							propertyMetaclass, false);
						generateGeneralization(eReferenceStereotype,
							eStructuralFeatureStereotype);
						generateOwnedAttribute(eReferenceStereotype,
							"referenceName", stringUMLPrimitiveType, 0, 1); //$NON-NLS-1$
						generateOwnedAttribute(eReferenceStereotype,
							"isResolveProxies", booleanPrimitiveType, 0, 1) //$NON-NLS-1$
							.setBooleanDefaultValue(true);

						Stereotype eTypeParameterStereotype = generateOwnedStereotype(
							profile, "ETypeParameter", false); //$NON-NLS-1$
						generateIcon(eTypeParameterStereotype,
							"../icons/full/ovr16/ETypeParameter.gif"); //$NON-NLS-1$
						org.eclipse.uml2.uml.Class templateParameterMetaclass = getReferencedUMLMetaclass(
							profile, UMLPackage.Literals.TEMPLATE_PARAMETER);
						generateExtension(eTypeParameterStereotype,
							templateParameterMetaclass, false);
						generateGeneralization(eTypeParameterStereotype,
							eNamedElementStereotype);
						org.eclipse.uml2.uml.Class classifierMetaclass = getReferencedUMLMetaclass(
							profile, UMLPackage.Literals.CLASSIFIER);
						generateOwnedAttribute(
							eTypeParameterStereotype,
							"bounds", //$NON-NLS-1$
							classifierMetaclass, 0,
							LiteralUnlimitedNatural.UNLIMITED);

						Stereotype eGenericTypeStereotype = generateOwnedStereotype(
							profile, "EGenericType", false); //$NON-NLS-1$
						generateIcon(eGenericTypeStereotype,
							"../icons/full/ovr16/EGenericType.gif"); //$NON-NLS-1$
						generateExtension(eGenericTypeStereotype,
							classMetaclass, false);
						generateExtension(eGenericTypeStereotype,
							interfaceMetaclass, false);
						generateExtension(eGenericTypeStereotype,
							dataTypeMetaclass, false);
						generateOwnedAttribute(eGenericTypeStereotype,
							"upperBound", //$NON-NLS-1$
							classifierMetaclass, 0, 1);
						generateOwnedAttribute(eGenericTypeStereotype,
							"lowerBound", //$NON-NLS-1$
							classifierMetaclass, 0, 1);

						setIDs(profile);
					}
				}, UMLExamplesUIPlugin.INSTANCE.getString(
					"_UI_GenerateEcoreStereotypesActionCommand_label", //$NON-NLS-1$
					new Object[]{getLabelProvider().getText(profile)})));
		}
	}

}
