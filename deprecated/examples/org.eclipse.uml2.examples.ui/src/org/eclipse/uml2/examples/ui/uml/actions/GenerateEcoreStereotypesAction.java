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
 * $Id: GenerateEcoreStereotypesAction.java,v 1.1 2005/12/22 20:19:56 khussey Exp $
 */
package org.eclipse.uml2.examples.ui.uml.actions;

import java.util.Collection;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.UnexecutableCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.common.edit.command.ChangeCommand;
import org.eclipse.uml2.examples.ui.ExamplesUIPlugin;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.PrimitiveType;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLPackage;

public class GenerateEcoreStereotypesAction
		extends GenerateProfileAction {

	protected Command createActionCommand(EditingDomain editingDomain,
			Collection collection) {

		if (collection.size() == 1) {
			Object object = collection.toArray()[0];

			if (object instanceof Profile) {
				final Profile profile = (Profile) object;

				return new ChangeCommand(editingDomain, new Runnable() {

					public void run() {
						Stereotype ePackageStereotype = generateOwnedStereotype(
							profile, "EPackage", false); //$NON-NLS-1$
						org.eclipse.uml2.uml.Class packageMetaclass = getReferencedUMLMetaclass(
							profile, UMLPackage.Literals.PACKAGE);
						generateExtension(ePackageStereotype, packageMetaclass,
							false);
						PrimitiveType stringPrimitiveType = getImportedUMLPrimitiveType(
							profile, "String"); //$NON-NLS-1$
						generateOwnedAttribute(ePackageStereotype,
							"packageName", //$NON-NLS-1$
							stringPrimitiveType, 0, 1);
						generateOwnedAttribute(ePackageStereotype, "nsPrefix", //$NON-NLS-1$
							stringPrimitiveType, 0, 1);
						generateOwnedAttribute(ePackageStereotype, "nsURI", //$NON-NLS-1$
							stringPrimitiveType, 0, 1);
						generateOwnedAttribute(ePackageStereotype,
							"basePackage", //$NON-NLS-1$
							stringPrimitiveType, 0, 1);
						generateOwnedAttribute(ePackageStereotype, "prefix", //$NON-NLS-1$
							stringPrimitiveType, 0, 1);

						Stereotype eNamedElementStereotype = generateOwnedStereotype(
							profile, "ENamedElement", true); //$NON-NLS-1$
						generateOwnedAttribute(eNamedElementStereotype,
							"xmlName", //$NON-NLS-1$
							stringPrimitiveType, 0, 1);

						Stereotype eClassifierStereotype = generateOwnedStereotype(
							profile, "EClassifier", true); //$NON-NLS-1$
						generateGeneralization(eClassifierStereotype,
							eNamedElementStereotype);
						generateOwnedAttribute(eClassifierStereotype,
							"instanceClassName", stringPrimitiveType, 0, 1); //$NON-NLS-1$

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
						org.eclipse.uml2.uml.Class classMetaclass = getReferencedUMLMetaclass(
							profile, UMLPackage.Literals.CLASS);
						org.eclipse.uml2.uml.Class interfaceMetaclass = getReferencedUMLMetaclass(
							profile, UMLPackage.Literals.INTERFACE);
						generateExtension(eClassStereotype, classMetaclass,
							false);
						generateExtension(eClassStereotype, interfaceMetaclass,
							false);
						generateGeneralization(eClassStereotype,
							eClassifierStereotype);
						generateOwnedAttribute(eClassStereotype, "className", //$NON-NLS-1$
							stringPrimitiveType, 0, 1);
						generateOwnedAttribute(eClassStereotype,
							"xmlContentKind", //$NON-NLS-1$
							contentKindEnumeration, 0, 1);

						Stereotype eDataTypeStereotype = generateOwnedStereotype(
							profile, "EDataType", false); //$NON-NLS-1$
						org.eclipse.uml2.uml.Class primitiveTypeMetaclass = getReferencedUMLMetaclass(
							profile, UMLPackage.Literals.PRIMITIVE_TYPE);
						generateExtension(eDataTypeStereotype,
							primitiveTypeMetaclass, false);
						generateGeneralization(eDataTypeStereotype,
							eClassifierStereotype);
						generateOwnedAttribute(eDataTypeStereotype,
							"dataTypeName", //$NON-NLS-1$
							stringPrimitiveType, 0, 1);

						Stereotype eEnumStereotype = generateOwnedStereotype(
							profile, "EEnum", false); //$NON-NLS-1$
						org.eclipse.uml2.uml.Class enumerationMetaclass = getReferencedUMLMetaclass(
							profile, UMLPackage.Literals.ENUMERATION);
						generateExtension(eEnumStereotype,
							enumerationMetaclass, false);
						generateGeneralization(eEnumStereotype,
							eNamedElementStereotype);
						generateOwnedAttribute(eEnumStereotype, "enumName", //$NON-NLS-1$
							stringPrimitiveType, 0, 1);

						Stereotype eEnumLiteralStereotype = generateOwnedStereotype(
							profile, "EEnumLiteral", false); //$NON-NLS-1$
						org.eclipse.uml2.uml.Class enumerationLiteralMetaclass = getReferencedUMLMetaclass(
							profile, UML2Package.Literals.ENUMERATION_LITERAL);
						generateExtension(eEnumLiteralStereotype,
							enumerationLiteralMetaclass, false);
						generateGeneralization(eEnumLiteralStereotype,
							eNamedElementStereotype);
						generateOwnedAttribute(eEnumLiteralStereotype,
							"enumLiteralName", stringPrimitiveType, 0, 1); //$NON-NLS-1$

						Stereotype eOperationStereotype = generateOwnedStereotype(
							profile, "EOperation", false); //$NON-NLS-1$
						org.eclipse.uml2.uml.Class operationMetaclass = getReferencedUMLMetaclass(
							profile, UML2Package.Literals.OPERATION);
						generateExtension(eOperationStereotype,
							operationMetaclass, false);
						generateOwnedAttribute(eOperationStereotype,
							"operationName", stringPrimitiveType, 0, 1); //$NON-NLS-1$

						Stereotype eParameterStereotype = generateOwnedStereotype(
							profile, "EParameter", false); //$NON-NLS-1$
						org.eclipse.uml2.uml.Class parameterMetaclass = getReferencedUMLMetaclass(
							profile, UML2Package.Literals.PARAMETER);
						generateExtension(eParameterStereotype,
							parameterMetaclass, false);
						generateOwnedAttribute(eParameterStereotype,
							"parameterName", stringPrimitiveType, 0, 1); //$NON-NLS-1$

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
							"xmlNamespace", stringPrimitiveType, 0, 1); //$NON-NLS-1$
						generateOwnedAttribute(eStructuralFeatureStereotype,
							"xmlFeatureKind", featureKindEnumeration, 0, 1); //$NON-NLS-1$
						generateOwnedAttribute(eStructuralFeatureStereotype,
							"visibility", visibilityKindEnumeration, 0, 1); //$NON-NLS-1$

						Stereotype eAttributeStereotype = generateOwnedStereotype(
							profile, "EAttribute", false); //$NON-NLS-1$
						org.eclipse.uml2.uml.Class propertyMetaclass = getReferencedUMLMetaclass(
							profile, UMLPackage.Literals.PROPERTY);
						generateExtension(eAttributeStereotype,
							propertyMetaclass, false);
						generateGeneralization(eAttributeStereotype,
							eStructuralFeatureStereotype);
						generateOwnedAttribute(eAttributeStereotype,
							"attributeName", stringPrimitiveType, 0, 1); //$NON-NLS-1$
						generateOwnedAttribute(eAttributeStereotype,
							"isID", booleanPrimitiveType, 0, 1); //$NON-NLS-1$

						Stereotype eReferenceStereotype = generateOwnedStereotype(
							profile, "EReference", false); //$NON-NLS-1$
						generateExtension(eReferenceStereotype,
							propertyMetaclass, false);
						generateGeneralization(eReferenceStereotype,
							eStructuralFeatureStereotype);
						generateOwnedAttribute(eReferenceStereotype,
							"referenceName", stringPrimitiveType, 0, 1); //$NON-NLS-1$
						generateOwnedAttribute(eReferenceStereotype,
							"isResolveProxies", booleanPrimitiveType, 0, 1) //$NON-NLS-1$
							.setDefault(Boolean.TRUE.toString());
					}
				}, ExamplesUIPlugin.INSTANCE.getString(
					"_UI_GenerateEcoreStereotypesActionCommand_label", //$NON-NLS-1$
					new Object[]{getLabelProvider().getText(profile)}));
			}
		}

		return UnexecutableCommand.INSTANCE;
	}

}
