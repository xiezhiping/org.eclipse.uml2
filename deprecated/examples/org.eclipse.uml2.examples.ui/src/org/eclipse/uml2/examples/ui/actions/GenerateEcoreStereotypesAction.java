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
 * $Id: GenerateEcoreStereotypesAction.java,v 1.4 2005/06/02 14:29:45 khussey Exp $
 */
package org.eclipse.uml2.examples.ui.actions;

import java.util.Collection;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.UnexecutableCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.uml2.Enumeration;
import org.eclipse.uml2.PrimitiveType;
import org.eclipse.uml2.Profile;
import org.eclipse.uml2.Stereotype;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.common.edit.command.ChangeCommand;
import org.eclipse.uml2.examples.ui.ExamplesUIPlugin;

/**
 * 
 */
public class GenerateEcoreStereotypesAction
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
					Stereotype ePackageStereotype = generateOwnedStereotype(
						profile, "EPackage", false); //$NON-NLS-1$
					org.eclipse.uml2.Class packageMetaclass = getReferencedUML2Metaclass(
						profile, UML2Package.eINSTANCE.getPackage());
					generateExtension(ePackageStereotype, packageMetaclass,
						false);
					PrimitiveType stringPrimitiveType = getImportedUML2PrimitiveType(
						profile, "String"); //$NON-NLS-1$
					generateOwnedAttribute(ePackageStereotype, "packageName", //$NON-NLS-1$
						stringPrimitiveType, 0, 1);
					generateOwnedAttribute(ePackageStereotype, "nsPrefix", //$NON-NLS-1$
						stringPrimitiveType, 0, 1);
					generateOwnedAttribute(ePackageStereotype, "nsURI", //$NON-NLS-1$
						stringPrimitiveType, 0, 1);
					generateOwnedAttribute(ePackageStereotype, "basePackage", //$NON-NLS-1$
						stringPrimitiveType, 0, 1);
					generateOwnedAttribute(ePackageStereotype, "prefix", //$NON-NLS-1$
						stringPrimitiveType, 0, 1);

					Stereotype eNamedElementStereotype = generateOwnedStereotype(
						profile, "ENamedElement", true); //$NON-NLS-1$
					generateOwnedAttribute(eNamedElementStereotype, "xmlName", //$NON-NLS-1$
						stringPrimitiveType, 0, 1);

					Stereotype eClassifierStereotype = generateOwnedStereotype(
						profile, "EClassifier", true); //$NON-NLS-1$
					generateGeneralization(eClassifierStereotype,
						eNamedElementStereotype);
					generateOwnedAttribute(eClassifierStereotype,
						"instanceClassName", stringPrimitiveType, 0, 1); //$NON-NLS-1$

					Enumeration contentKindEnumeration = generateOwnedEnumeration(
						profile, "ContentKind"); //$NON-NLS-1$
					generateOwnedLiteral(contentKindEnumeration, "Unspecified"); //$NON-NLS-1$
					generateOwnedLiteral(contentKindEnumeration, "Empty"); //$NON-NLS-1$
					generateOwnedLiteral(contentKindEnumeration, "Simple"); //$NON-NLS-1$
					generateOwnedLiteral(contentKindEnumeration, "Mixed"); //$NON-NLS-1$
					generateOwnedLiteral(contentKindEnumeration, "ElementOnly"); //$NON-NLS-1$

					Stereotype eClassStereotype = generateOwnedStereotype(
						profile, "EClass", false); //$NON-NLS-1$
					org.eclipse.uml2.Class classMetaclass = getReferencedUML2Metaclass(
						profile, UML2Package.eINSTANCE.getClass_());
					org.eclipse.uml2.Class interfaceMetaclass = getReferencedUML2Metaclass(
						profile, UML2Package.eINSTANCE.getInterface());
					generateExtension(eClassStereotype, classMetaclass, false);
					generateExtension(eClassStereotype, interfaceMetaclass,
						false);
					generateGeneralization(eClassStereotype,
						eClassifierStereotype);
					generateOwnedAttribute(eClassStereotype, "className", //$NON-NLS-1$
						stringPrimitiveType, 0, 1);
					generateOwnedAttribute(eClassStereotype, "xmlContentKind", //$NON-NLS-1$
						contentKindEnumeration, 0, 1);

					Stereotype eDataTypeStereotype = generateOwnedStereotype(
						profile, "EDataType", false); //$NON-NLS-1$
					org.eclipse.uml2.Class primitiveTypeMetaclass = getReferencedUML2Metaclass(
						profile, UML2Package.eINSTANCE.getPrimitiveType());
					generateExtension(eDataTypeStereotype,
						primitiveTypeMetaclass, false);
					generateGeneralization(eDataTypeStereotype,
						eClassifierStereotype);
					generateOwnedAttribute(eDataTypeStereotype, "dataTypeName", //$NON-NLS-1$
						stringPrimitiveType, 0, 1);

					Stereotype eEnumStereotype = generateOwnedStereotype(
						profile, "EEnum", false); //$NON-NLS-1$
					org.eclipse.uml2.Class enumerationMetaclass = getReferencedUML2Metaclass(
						profile, UML2Package.eINSTANCE.getEnumeration());
					generateExtension(eEnumStereotype, enumerationMetaclass,
						false);
					generateGeneralization(eEnumStereotype,
						eNamedElementStereotype);
					generateOwnedAttribute(eEnumStereotype, "enumName", //$NON-NLS-1$
						stringPrimitiveType, 0, 1);

					Stereotype eEnumLiteralStereotype = generateOwnedStereotype(
						profile, "EEnumLiteral", false); //$NON-NLS-1$
					org.eclipse.uml2.Class enumerationLiteralMetaclass = getReferencedUML2Metaclass(
						profile, UML2Package.eINSTANCE.getEnumerationLiteral());
					generateExtension(eEnumLiteralStereotype,
						enumerationLiteralMetaclass, false);
					generateGeneralization(eEnumLiteralStereotype,
						eNamedElementStereotype);
					generateOwnedAttribute(eEnumLiteralStereotype,
						"enumLiteralName", stringPrimitiveType, 0, 1); //$NON-NLS-1$

					Stereotype eOperationStereotype = generateOwnedStereotype(
						profile, "EOperation", false); //$NON-NLS-1$
					org.eclipse.uml2.Class operationMetaclass = getReferencedUML2Metaclass(
						profile, UML2Package.eINSTANCE.getOperation());
					generateExtension(eOperationStereotype, operationMetaclass,
						false);
					generateOwnedAttribute(eOperationStereotype,
						"operationName", stringPrimitiveType, 0, 1); //$NON-NLS-1$

					Stereotype eParameterStereotype = generateOwnedStereotype(
						profile, "EParameter", false); //$NON-NLS-1$
					org.eclipse.uml2.Class parameterMetaclass = getReferencedUML2Metaclass(
						profile, UML2Package.eINSTANCE.getParameter());
					generateExtension(eParameterStereotype, parameterMetaclass,
						false);
					generateOwnedAttribute(eParameterStereotype,
						"parameterName", stringPrimitiveType, 0, 1); //$NON-NLS-1$

					Enumeration featureKindEnumeration = generateOwnedEnumeration(
						profile, "FeatureKind"); //$NON-NLS-1$
					generateOwnedLiteral(featureKindEnumeration, "Unspecified"); //$NON-NLS-1$
					generateOwnedLiteral(featureKindEnumeration, "Simple"); //$NON-NLS-1$
					generateOwnedLiteral(featureKindEnumeration, "Attribute"); //$NON-NLS-1$
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
					generateOwnedLiteral(visibilityKindEnumeration, "ReadOnly"); //$NON-NLS-1$
					generateOwnedLiteral(visibilityKindEnumeration, "ReadWrite"); //$NON-NLS-1$
					generateOwnedLiteral(visibilityKindEnumeration,
						"ReadOnlyUnsettable"); //$NON-NLS-1$
					generateOwnedLiteral(visibilityKindEnumeration,
						"ReadWriteUnsettable"); //$NON-NLS-1$

					Stereotype eStructuralFeatureStereotype = generateOwnedStereotype(
						profile, "EStructuralFeature", true); //$NON-NLS-1$
					generateGeneralization(eStructuralFeatureStereotype,
						eNamedElementStereotype);
					PrimitiveType booleanPrimitiveType = getImportedUML2PrimitiveType(
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
					org.eclipse.uml2.Class propertyMetaclass = getReferencedUML2Metaclass(
						profile, UML2Package.eINSTANCE.getProperty());
					generateExtension(eAttributeStereotype, propertyMetaclass,
						false);
					generateGeneralization(eAttributeStereotype,
						eStructuralFeatureStereotype);
					generateOwnedAttribute(eAttributeStereotype,
						"attributeName", stringPrimitiveType, 0, 1); //$NON-NLS-1$
					generateOwnedAttribute(eAttributeStereotype,
						"isID", booleanPrimitiveType, 0, 1); //$NON-NLS-1$

					Stereotype eReferenceStereotype = generateOwnedStereotype(
						profile, "EReference", false); //$NON-NLS-1$
					generateExtension(eReferenceStereotype, propertyMetaclass,
						false);
					generateGeneralization(eReferenceStereotype,
						eStructuralFeatureStereotype);
					generateOwnedAttribute(eReferenceStereotype,
						"referenceName", stringPrimitiveType, 0, 1); //$NON-NLS-1$
					generateOwnedAttribute(eReferenceStereotype,
						"isResolveProxies", booleanPrimitiveType, 0, 1) //$NON-NLS-1$
						.setBooleanDefault(true);
				}
			}, ExamplesUIPlugin.INSTANCE.getString(
				"_UI_GenerateEcoreStereotypesActionCommand_label", //$NON-NLS-1$
				new Object[]{getLabelProvider().getText(profile)}));
		}

		return UnexecutableCommand.INSTANCE;
	}

}
