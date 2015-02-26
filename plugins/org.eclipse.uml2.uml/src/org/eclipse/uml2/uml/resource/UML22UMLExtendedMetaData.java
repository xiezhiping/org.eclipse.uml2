/*
 * Copyright (c) 2006, 2015 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 327039, 418466, 458656
 * 
 */
package org.eclipse.uml2.uml.resource;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.mapping.ecore2xml.Ecore2XMLRegistry;
import org.eclipse.emf.mapping.ecore2xml.util.Ecore2XMLExtendedMetaData;
import org.eclipse.uml2.uml.UMLPackage;

public class UML22UMLExtendedMetaData
		extends Ecore2XMLExtendedMetaData {

	protected static Map<URI, URI> uriMap = null;

	public static Map<URI, URI> getURIMap() {

		if (uriMap == null) {

			synchronized (UML22UMLExtendedMetaData.class) {

				if (uriMap == null) {
					uriMap = new HashMap<URI, URI>();

					uriMap.put(URI.createURI(UML22UMLResource.ECORE_PRIMITIVE_TYPES_LIBRARY_URI), URI.createURI(UMLResource.ECORE_PRIMITIVE_TYPES_LIBRARY_URI));
					uriMap.put(URI.createURI(UML22UMLResource.JAVA_PRIMITIVE_TYPES_LIBRARY_URI), URI.createURI(UMLResource.JAVA_PRIMITIVE_TYPES_LIBRARY_URI));
					uriMap.put(URI.createURI(UML22UMLResource.UML2_PRIMITIVE_TYPES_LIBRARY_URI), URI.createURI(UMLResource.UML_PRIMITIVE_TYPES_LIBRARY_URI));

					uriMap.put(URI.createURI(UML22UMLResource.ECORE_METAMODEL_URI), URI.createURI(UMLResource.ECORE_METAMODEL_URI));
					uriMap.put(URI.createURI(UML22UMLResource.UML2_METAMODEL_URI), URI.createURI(UMLResource.UML_METAMODEL_URI));

					// Basic.profile.uml2#BuildComponent -> Standard.profile.uml#BuildComponent
					uriMap.put(URI.createURI(UML22UMLResource.BASIC_PROFILE_URI).appendFragment("_9vsGw686Edih9-GG5afQ0g"), URI.createURI(UMLResource.STANDARD_PROFILE_URI).appendFragment("BuildComponent"));
					uriMap.put(URI.createURI(UML22UMLResource.BASIC_PROFILE_URI).appendFragment("_9vsGyK86Edih9-GG5afQ0g"), URI.createURI(UMLResource.STANDARD_PROFILE_URI).appendFragment("BuildComponent-base_Component"));
					uriMap.put(URI.createURI(UML22UMLResource.BASIC_PROFILE_URI).appendFragment("_9vsGxa86Edih9-GG5afQ0g"), URI.createURI(UMLResource.STANDARD_PROFILE_URI).appendFragment("Component_BuildComponent"));
					uriMap.put(URI.createURI(UML22UMLResource.BASIC_PROFILE_URI).appendFragment("_9vsGxq86Edih9-GG5afQ0g"), URI.createURI(UMLResource.STANDARD_PROFILE_URI).appendFragment("Component_BuildComponent-extension_BuildComponent"));

					// Complete.profile.uml2#Metamodel -> Standard.profile.uml#Metamodel
					uriMap.put(URI.createURI(UML22UMLResource.COMPLETE_PROFILE_URI).appendFragment("_Ox98AK87Edih9-GG5afQ0g"), URI.createURI(UMLResource.STANDARD_PROFILE_URI).appendFragment("Metamodel"));
					uriMap.put(URI.createURI(UML22UMLResource.COMPLETE_PROFILE_URI).appendFragment("_O1-5VK87Edih9-GG5afQ0g"), URI.createURI(UMLResource.STANDARD_PROFILE_URI).appendFragment("Metamodel-base_Model"));
					uriMap.put(URI.createURI(UML22UMLResource.COMPLETE_PROFILE_URI).appendFragment("_O1-5Ua87Edih9-GG5afQ0g"), URI.createURI(UMLResource.STANDARD_PROFILE_URI).appendFragment("Model_Metamodel"));
					uriMap.put(URI.createURI(UML22UMLResource.COMPLETE_PROFILE_URI).appendFragment("_O1-5Uq87Edih9-GG5afQ0g"), URI.createURI(UMLResource.STANDARD_PROFILE_URI).appendFragment("Model_Metamodel-extension_Metamodel"));

					// Complete.profile.uml2#SystemModel -> Standard.profile.uml#SystemModel
					uriMap.put(URI.createURI(UML22UMLResource.COMPLETE_PROFILE_URI).appendFragment("_O1-5Va87Edih9-GG5afQ0g"), URI.createURI(UMLResource.STANDARD_PROFILE_URI).appendFragment("SystemModel"));
					uriMap.put(URI.createURI(UML22UMLResource.COMPLETE_PROFILE_URI).appendFragment("_O2E_8687Edih9-GG5afQ0g"), URI.createURI(UMLResource.STANDARD_PROFILE_URI).appendFragment("SystemModel-base_Model"));
					uriMap.put(URI.createURI(UML22UMLResource.COMPLETE_PROFILE_URI).appendFragment("_O2E_8K87Edih9-GG5afQ0g"), URI.createURI(UMLResource.STANDARD_PROFILE_URI).appendFragment("Model_SystemModel"));
					uriMap.put(URI.createURI(UML22UMLResource.COMPLETE_PROFILE_URI).appendFragment("_O2E_8a87Edih9-GG5afQ0g"), URI.createURI(UMLResource.STANDARD_PROFILE_URI).appendFragment("Model_SystemModel-extension_SystemModel"));

					// Basic.profile.uml2 -> Standard.profile.uml
					uriMap.put(URI.createURI(UML22UMLResource.BASIC_PROFILE_URI), URI.createURI(UMLResource.STANDARD_PROFILE_URI));

					// Intermediate.profile.uml2 -> Standard.profile.uml
					uriMap.put(URI.createURI(UML22UMLResource.INTERMEDIATE_PROFILE_URI), URI.createURI(UMLResource.STANDARD_PROFILE_URI));

					// Complete.profile.uml2 -> Standard.profile.uml
					uriMap.put(URI.createURI(UML22UMLResource.COMPLETE_PROFILE_URI), URI.createURI(UMLResource.STANDARD_PROFILE_URI));

					uriMap.put(URI.createURI(UML22UMLResource.ECORE_PROFILE_URI), URI.createURI(UMLResource.ECORE_PROFILE_URI));
				}
			}
		}

		return uriMap;
	}

	protected static Map<String, String> fragmentMap = null;

	public static Map<String, String> getFragmentMap() {

		if (fragmentMap == null) {

			synchronized (UML22UMLExtendedMetaData.class) {

				if (fragmentMap == null) {
					fragmentMap = new HashMap<String, String>();

					// EcorePrimitiveTypes.library.uml2 -> EcorePrimitiveTypes.library.uml

					fragmentMap.put("_L8agoK86EdieaYgxtVWN8Q", "_0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_OQomAK86EdieaYgxtVWN8Q", "EBigDecimal"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_OQomAa86EdieaYgxtVWN8Q", "EBigInteger"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_OQomAq86EdieaYgxtVWN8Q", "EBoolean"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_OQusoK86EdieaYgxtVWN8Q", "EBooleanObject"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_OQusoa86EdieaYgxtVWN8Q", "EByte"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_OQusoq86EdieaYgxtVWN8Q", "EByteArray"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_OQuso686EdieaYgxtVWN8Q", "EByteObject"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_OQ0zQK86EdieaYgxtVWN8Q", "EChar"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_OQ0zQa86EdieaYgxtVWN8Q", "ECharacterObject"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_OQ0zQq86EdieaYgxtVWN8Q", "EDate"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_OQ0zQ686EdieaYgxtVWN8Q", "EDiagnosticChain"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_OQ654K86EdieaYgxtVWN8Q", "EDouble"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_OQ654a86EdieaYgxtVWN8Q", "EDoubleObject"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_OQ654q86EdieaYgxtVWN8Q", "EEList"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_OQ654686EdieaYgxtVWN8Q", "EEnumerator"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_ORBAgK86EdieaYgxtVWN8Q", "EFeatureMap"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_ORBAga86EdieaYgxtVWN8Q", "EFeatureMapEntry"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_ORBAgq86EdieaYgxtVWN8Q", "EFloat"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_ORBAg686EdieaYgxtVWN8Q", "EFloatObject"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_ORBAhK86EdieaYgxtVWN8Q", "EInt"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_ORHHIK86EdieaYgxtVWN8Q", "EIntegerObject"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_ORHHIa86EdieaYgxtVWN8Q", "EJavaClass"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_ORHHIq86EdieaYgxtVWN8Q", "EJavaObject"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_ORHHI686EdieaYgxtVWN8Q", "ELong"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_ORHHJK86EdieaYgxtVWN8Q", "ELongObject"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_ORNNwK86EdieaYgxtVWN8Q", "EMap"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_ORNNwa86EdieaYgxtVWN8Q", "EResource"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_ORNNwq86EdieaYgxtVWN8Q", "EResourceSet"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_ORNNw686EdieaYgxtVWN8Q", "EShort"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_ORTUYK86EdieaYgxtVWN8Q", "EShortObject"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_ORTUYa86EdieaYgxtVWN8Q", "EString"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_ORTUYq86EdieaYgxtVWN8Q", "ETreeIterator"); //$NON-NLS-1$ //$NON-NLS-2$

					// JavaPrimitiveTypes.library.uml2 -> JavaPrimitiveTypes.library.uml

					fragmentMap.put("_RjmyoK86EdieaYgxtVWN8Q", "_0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_TBfF4K86EdieaYgxtVWN8Q", "boolean"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_TBfF4a86EdieaYgxtVWN8Q", "byte"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_TBlMgK86EdieaYgxtVWN8Q", "char"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_TBlMga86EdieaYgxtVWN8Q", "double"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_TBlMgq86EdieaYgxtVWN8Q", "float"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_TBlMg686EdieaYgxtVWN8Q", "int"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_TBrTIK86EdieaYgxtVWN8Q", "long"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_TBrTIa86EdieaYgxtVWN8Q", "short"); //$NON-NLS-1$ //$NON-NLS-2$

					// UML2PrimitiveTypes.library.uml2 -> UMLPrimitiveTypes.library.uml

					fragmentMap.put("_EfRZoK86EdieaYgxtVWN8Q", "_0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_IXfBUK86EdieaYgxtVWN8Q", "Boolean"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_IXlH8K86EdieaYgxtVWN8Q", "Integer"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_IXlH8a86EdieaYgxtVWN8Q", "String"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_IXlH8q86EdieaYgxtVWN8Q", "UnlimitedNatural"); //$NON-NLS-1$ //$NON-NLS-2$

					// Ecore.metamodel.uml2 -> Ecore.metamodel.uml

					fragmentMap.put("_m8eNoK86EdiEh75YJ_3n8g", "_0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8eNoq86EdiEh75YJ_3n8g", "EAttribute"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8eNpK86EdiEh75YJ_3n8g", "EAttribute-iD"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8eNpq86EdiEh75YJ_3n8g", "EAttribute-eAttributeType"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8eNp686EdiEh75YJ_3n8g", "EStructuralFeature"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8eNqa86EdiEh75YJ_3n8g", "EStructuralFeature-eContainingClass"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8eNq686EdiEh75YJ_3n8g", "EStructuralFeature-changeable"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8eNra86EdiEh75YJ_3n8g", "EStructuralFeature-volatile"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8eNr686EdiEh75YJ_3n8g", "EStructuralFeature-transient"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8eNsa86EdiEh75YJ_3n8g", "EStructuralFeature-defaultValueLiteral"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8eNs686EdiEh75YJ_3n8g", "EStructuralFeature-defaultValue"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8eNta86EdiEh75YJ_3n8g", "EStructuralFeature-unsettable"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8eNt686EdiEh75YJ_3n8g", "EStructuralFeature-derived"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8eNua86EdiEh75YJ_3n8g", "EStructuralFeature-getFeatureID"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_h3j_hMenEdm17tz62ORDiA", "EStructuralFeature-getFeatureID-_ownedParameter.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8eNu686EdiEh75YJ_3n8g", "EStructuralFeature-getContainerClass"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_h3j_hsenEdm17tz62ORDiA", "EStructuralFeature-getContainerClass-_ownedParameter.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8eNva86EdiEh75YJ_3n8g", "ETypedElement"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8eNv686EdiEh75YJ_3n8g", "ETypedElement-ordered"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8eNwa86EdiEh75YJ_3n8g", "ETypedElement-unique"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8eNw686EdiEh75YJ_3n8g", "ETypedElement-lowerBound"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8eNxa86EdiEh75YJ_3n8g", "ETypedElement-upperBound"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8eNx686EdiEh75YJ_3n8g", "ETypedElement-many"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8eNya86EdiEh75YJ_3n8g", "ETypedElement-required"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8eNy686EdiEh75YJ_3n8g", "ETypedElement-eType"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8eNza86EdiEh75YJ_3n8g", "ENamedElement"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8eNz686EdiEh75YJ_3n8g", "ENamedElement-name"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h3j_n8enEdm17tz62ORDiA", "_ownedMember.4"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h3j_oMenEdm17tz62ORDiA", "_ownedMember.4-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8eOLa86EdiEh75YJ_3n8g", "EClassifier"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8eOL686EdiEh75YJ_3n8g", "EClassifier-instanceClassName"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8eOMa86EdiEh75YJ_3n8g", "EClassifier-instanceClass"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8eOM686EdiEh75YJ_3n8g", "EClassifier-defaultValue"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8eONa86EdiEh75YJ_3n8g", "EClassifier-ePackage"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8eON686EdiEh75YJ_3n8g", "EClassifier-isInstance"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_h3j_ssenEdm17tz62ORDiA", "EClassifier-isInstance-_ownedParameter.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8eOOa86EdiEh75YJ_3n8g", "EClassifier-isInstance-object"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8eOOq86EdiEh75YJ_3n8g", "EClassifier-getClassifierID"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_h3j_tcenEdm17tz62ORDiA", "EClassifier-getClassifierID-_ownedParameter.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8eOPK86EdiEh75YJ_3n8g", "EPackage"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8eOPq86EdiEh75YJ_3n8g", "EPackage-nsURI"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8eOQK86EdiEh75YJ_3n8g", "EPackage-nsPrefix"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8eOQq86EdiEh75YJ_3n8g", "EPackage-eFactoryInstance"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8kUQK86EdiEh75YJ_3n8g", "EPackage-eSubpackages"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8kUQ686EdiEh75YJ_3n8g", "EPackage-eSuperPackage"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8kURa86EdiEh75YJ_3n8g", "EPackage-eClassifiers"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8kUSK86EdiEh75YJ_3n8g", "EPackage-getEClassifier"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_h3j_ysenEdm17tz62ORDiA", "EPackage-getEClassifier-_ownedParameter.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8kUSq86EdiEh75YJ_3n8g", "EPackage-getEClassifier-name"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h3j_zMenEdm17tz62ORDiA", "_ownedMember.7"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8kUTK86EdiEh75YJ_3n8g", "EFactory"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8kUTq86EdiEh75YJ_3n8g", "EFactory-ePackage"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8kUT686EdiEh75YJ_3n8g", "EFactory-create"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_h3j_08enEdm17tz62ORDiA", "EFactory-create-_ownedParameter.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8kUUa86EdiEh75YJ_3n8g", "EFactory-create-eClass"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8kUUq86EdiEh75YJ_3n8g", "EFactory-createFromString"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_h3j_1senEdm17tz62ORDiA", "EFactory-createFromString-_ownedParameter.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8kUVK86EdiEh75YJ_3n8g", "EFactory-createFromString-eDataType"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8kUVa86EdiEh75YJ_3n8g", "EFactory-createFromString-literalValue"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8kUVq86EdiEh75YJ_3n8g", "EFactory-convertToString"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_h3j_2senEdm17tz62ORDiA", "EFactory-convertToString-_ownedParameter.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8kUWK86EdiEh75YJ_3n8g", "EFactory-convertToString-eDataType"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8kUWa86EdiEh75YJ_3n8g", "EFactory-convertToString-instanceValue"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8eN2a86EdiEh75YJ_3n8g", "EObject"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8eN2q86EdiEh75YJ_3n8g", "EObject-eClass"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_h3j_38enEdm17tz62ORDiA", "EObject-eClass-_ownedParameter.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8eN3K86EdiEh75YJ_3n8g", "EObject-eIsProxy"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_h3j_4cenEdm17tz62ORDiA", "EObject-eIsProxy-_ownedParameter.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8eN3q86EdiEh75YJ_3n8g", "EObject-eResource"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_h3j_48enEdm17tz62ORDiA", "EObject-eResource-_ownedParameter.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8eN4K86EdiEh75YJ_3n8g", "EObject-eContainer"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_h3j_5cenEdm17tz62ORDiA", "EObject-eContainer-_ownedParameter.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8eN4q86EdiEh75YJ_3n8g", "EObject-eContainingFeature"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_h3j_58enEdm17tz62ORDiA", "EObject-eContainingFeature-_ownedParameter.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8eN5K86EdiEh75YJ_3n8g", "EObject-eContainmentFeature"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_h3j_6cenEdm17tz62ORDiA", "EObject-eContainmentFeature-_ownedParameter.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8eN5q86EdiEh75YJ_3n8g", "EObject-eContents"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_h3j_68enEdm17tz62ORDiA", "EObject-eContents-_ownedParameter.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8eN6K86EdiEh75YJ_3n8g", "EObject-eAllContents"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_h3j_7cenEdm17tz62ORDiA", "EObject-eAllContents-_ownedParameter.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8eN6q86EdiEh75YJ_3n8g", "EObject-eCrossReferences"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_h3j_78enEdm17tz62ORDiA", "EObject-eCrossReferences-_ownedParameter.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8eN7K86EdiEh75YJ_3n8g", "EObject-eGet"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_h3j_8cenEdm17tz62ORDiA", "EObject-eGet-_ownedParameter.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8eN7q86EdiEh75YJ_3n8g", "EObject-eGet-feature"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8eN7686EdiEh75YJ_3n8g", "EObject-eGet.1"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_h3j_9MenEdm17tz62ORDiA", "EObject-eGet.1-_ownedParameter.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8eN8a86EdiEh75YJ_3n8g", "EObject-eGet.1-feature"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8eN8q86EdiEh75YJ_3n8g", "EObject-eGet.1-resolve"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8eN8686EdiEh75YJ_3n8g", "EObject-eSet"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8eN9K86EdiEh75YJ_3n8g", "EObject-eSet-feature"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8eN9a86EdiEh75YJ_3n8g", "EObject-eSet-newValue"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8eN9q86EdiEh75YJ_3n8g", "EObject-eIsSet"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_h3j_-8enEdm17tz62ORDiA", "EObject-eIsSet-_ownedParameter.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8eN-K86EdiEh75YJ_3n8g", "EObject-eIsSet-feature"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8eN-a86EdiEh75YJ_3n8g", "EObject-eUnset"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8eN-q86EdiEh75YJ_3n8g", "EObject-eUnset-feature"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8eN-686EdiEh75YJ_3n8g", "EClass"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8eN_a86EdiEh75YJ_3n8g", "EClass-abstract"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8eN_686EdiEh75YJ_3n8g", "EClass-interface"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8eOAa86EdiEh75YJ_3n8g", "EClass-eSuperTypes"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8eOBK86EdiEh75YJ_3n8g", "EClass-eOperations"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8eOB686EdiEh75YJ_3n8g", "EClass-eAllAttributes"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8eOCq86EdiEh75YJ_3n8g", "EClass-eAllReferences"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8eODa86EdiEh75YJ_3n8g", "EClass-eReferences"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8eOEK86EdiEh75YJ_3n8g", "EClass-eAttributes"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8eOE686EdiEh75YJ_3n8g", "EClass-eAllContainments"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8eOFq86EdiEh75YJ_3n8g", "EClass-eAllOperations"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8eOGa86EdiEh75YJ_3n8g", "EClass-eAllStructuralFeatures"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8eOHK86EdiEh75YJ_3n8g", "EClass-eAllSuperTypes"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8eOH686EdiEh75YJ_3n8g", "EClass-eIDAttribute"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8eOIa86EdiEh75YJ_3n8g", "EClass-eStructuralFeatures"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8eOJK86EdiEh75YJ_3n8g", "EClass-isSuperTypeOf"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_h3twlMenEdm17tz62ORDiA", "EClass-isSuperTypeOf-_ownedParameter.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8eOJq86EdiEh75YJ_3n8g", "EClass-isSuperTypeOf-someClass"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_h3twlsenEdm17tz62ORDiA", "EClass-getFeatureCount"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_h3twl8enEdm17tz62ORDiA", "EClass-getFeatureCount-_ownedParameter.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8eOJ686EdiEh75YJ_3n8g", "EClass-getEStructuralFeature"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_h3twmcenEdm17tz62ORDiA", "EClass-getEStructuralFeature-_ownedParameter.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8eOKa86EdiEh75YJ_3n8g", "EClass-getEStructuralFeature-featureID"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_h3twm8enEdm17tz62ORDiA", "EClass-getFeatureID"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_h3twnMenEdm17tz62ORDiA", "EClass-getFeatureID-_ownedParameter.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_h3twncenEdm17tz62ORDiA", "EClass-getFeatureID-feature"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8eOKq86EdiEh75YJ_3n8g", "EClass-getEStructuralFeature.1"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_h3twn8enEdm17tz62ORDiA", "EClass-getEStructuralFeature.1-_ownedParameter.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8eOLK86EdiEh75YJ_3n8g", "EClass-getEStructuralFeature.1-featureName"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h3twocenEdm17tz62ORDiA", "_ownedMember.11"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h3twosenEdm17tz62ORDiA", "_ownedMember.11-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h3two8enEdm17tz62ORDiA", "_ownedMember.12"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8kUY686EdiEh75YJ_3n8g", "EOperation"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8kUZa86EdiEh75YJ_3n8g", "EOperation-eParameters"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8kUaK86EdiEh75YJ_3n8g", "EOperation-eExceptions"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8kUa686EdiEh75YJ_3n8g", "EOperation-eContainingClass"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h3twsMenEdm17tz62ORDiA", "_ownedMember.14"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8kUbq86EdiEh75YJ_3n8g", "EParameter"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8kUcK86EdiEh75YJ_3n8g", "EParameter-eOperation"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h3twt8enEdm17tz62ORDiA", "_ownedMember.16"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h3twuMenEdm17tz62ORDiA", "_ownedMember.16-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h3twucenEdm17tz62ORDiA", "_ownedMember.17"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h3twusenEdm17tz62ORDiA", "_ownedMember.17-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h3twu8enEdm17tz62ORDiA", "_ownedMember.18"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h3twvMenEdm17tz62ORDiA", "_ownedMember.18-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8kUeK86EdiEh75YJ_3n8g", "EReference"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8kUeq86EdiEh75YJ_3n8g", "EReference-containment"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8kUfK86EdiEh75YJ_3n8g", "EReference-container"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8kUfq86EdiEh75YJ_3n8g", "EReference-resolveProxies"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8kUgK86EdiEh75YJ_3n8g", "EReference-eOpposite"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8kUgq86EdiEh75YJ_3n8g", "EReference-eReferenceType"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h3twzMenEdm17tz62ORDiA", "_ownedMember.20"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h3twzcenEdm17tz62ORDiA", "_ownedMember.20-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h3twzsenEdm17tz62ORDiA", "_ownedMember.21"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h3twz8enEdm17tz62ORDiA", "_ownedMember.21-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h3tw0MenEdm17tz62ORDiA", "_ownedMember.22"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h3tw0cenEdm17tz62ORDiA", "_ownedMember.22-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h3tw0senEdm17tz62ORDiA", "_ownedMember.23"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h3tw08enEdm17tz62ORDiA", "_ownedMember.23-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h3tw1MenEdm17tz62ORDiA", "_ownedMember.24"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h3tw1cenEdm17tz62ORDiA", "_ownedMember.24-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h3tw1senEdm17tz62ORDiA", "_ownedMember.25"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h3tw18enEdm17tz62ORDiA", "_ownedMember.25-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h3tw2MenEdm17tz62ORDiA", "_ownedMember.26"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h3tw2cenEdm17tz62ORDiA", "_ownedMember.26-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h3tw2senEdm17tz62ORDiA", "_ownedMember.27"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h3tw28enEdm17tz62ORDiA", "_ownedMember.27-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h3tw3MenEdm17tz62ORDiA", "_ownedMember.28"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h3tw3cenEdm17tz62ORDiA", "_ownedMember.28-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h3tw3senEdm17tz62ORDiA", "_ownedMember.29"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8kUWq86EdiEh75YJ_3n8g", "EDataType"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8kUXK86EdiEh75YJ_3n8g", "EDataType-serializable"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h3tw48enEdm17tz62ORDiA", "_ownedMember.31"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h3tw5MenEdm17tz62ORDiA", "_ownedMember.32"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h3tw5cenEdm17tz62ORDiA", "_ownedMember.33"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h3tw5senEdm17tz62ORDiA", "_ownedMember.33-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8kUlq86EdiEh75YJ_3n8g", "EAnnotation"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8kUmK86EdiEh75YJ_3n8g", "EAnnotation-source"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8kUmq86EdiEh75YJ_3n8g", "EAnnotation-details"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8kUna86EdiEh75YJ_3n8g", "EAnnotation-eModelElement"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8kUn686EdiEh75YJ_3n8g", "EAnnotation-contents"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8kUoq86EdiEh75YJ_3n8g", "EAnnotation-references"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h3tw-MenEdm17tz62ORDiA", "_ownedMember.35"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h3tw-cenEdm17tz62ORDiA", "_ownedMember.35-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8kUp686EdiEh75YJ_3n8g", "EStringToStringMapEntry"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8kUqK86EdiEh75YJ_3n8g", "EStringToStringMapEntry-key"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8kUqq86EdiEh75YJ_3n8g", "EStringToStringMapEntry-value"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h3txAcenEdm17tz62ORDiA", "_ownedMember.37"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h3txAsenEdm17tz62ORDiA", "_ownedMember.38"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h3txA8enEdm17tz62ORDiA", "_ownedMember.38-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h3txBMenEdm17tz62ORDiA", "_ownedMember.39"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h3txBcenEdm17tz62ORDiA", "_ownedMember.39-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8kUta86EdiEh75YJ_3n8g", "EEnum"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8kUt686EdiEh75YJ_3n8g", "EEnum-eLiterals"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8kUuq86EdiEh75YJ_3n8g", "EEnum-getEEnumLiteral"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_h3txDMenEdm17tz62ORDiA", "EEnum-getEEnumLiteral-_ownedParameter.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8kUvK86EdiEh75YJ_3n8g", "EEnum-getEEnumLiteral-name"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8kUva86EdiEh75YJ_3n8g", "EEnum-getEEnumLiteral.1"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_h3txD8enEdm17tz62ORDiA", "EEnum-getEEnumLiteral.1-_ownedParameter.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8kUv686EdiEh75YJ_3n8g", "EEnum-getEEnumLiteral.1-value"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8kUwK86EdiEh75YJ_3n8g", "EEnumLiteral"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8kUwq86EdiEh75YJ_3n8g", "EEnumLiteral-value"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8kUxK86EdiEh75YJ_3n8g", "EEnumLiteral-instance"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8qa4K86EdiEh75YJ_3n8g", "EEnumLiteral-eEnum"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h3txHcenEdm17tz62ORDiA", "_ownedMember.42"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_EQQPIMi3EdqOoq-j0hsILg", "EBigDecimal"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_EQQPIci3EdqOoq-j0hsILg", "EBigInteger"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_EQQPIsi3EdqOoq-j0hsILg", "EBoolean"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_EQQPI8i3EdqOoq-j0hsILg", "EBooleanObject"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_EQQPJMi3EdqOoq-j0hsILg", "EByte"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_EQQPJci3EdqOoq-j0hsILg", "EByteArray"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_EQQPJsi3EdqOoq-j0hsILg", "EByteObject"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_EQQPJ8i3EdqOoq-j0hsILg", "EChar"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_EQQPKMi3EdqOoq-j0hsILg", "ECharacterObject"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_EQQPKci3EdqOoq-j0hsILg", "EDate"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_EQQPKsi3EdqOoq-j0hsILg", "EDiagnosticChain"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_EQQPK8i3EdqOoq-j0hsILg", "EDouble"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_EQQPLMi3EdqOoq-j0hsILg", "EDoubleObject"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_EQQPLci3EdqOoq-j0hsILg", "EEList"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_EQQPLsi3EdqOoq-j0hsILg", "EEnumerator"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_EQQPL8i3EdqOoq-j0hsILg", "EFeatureMap"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_EQQPMMi3EdqOoq-j0hsILg", "EFeatureMapEntry"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_EQQPMci3EdqOoq-j0hsILg", "EFloat"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_EQQPMsi3EdqOoq-j0hsILg", "EFloatObject"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_EQQPM8i3EdqOoq-j0hsILg", "EInt"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_EQQPNMi3EdqOoq-j0hsILg", "EIntegerObject"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_EQQPNci3EdqOoq-j0hsILg", "EJavaClass"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_EQQPNsi3EdqOoq-j0hsILg", "EJavaObject"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_EQQPN8i3EdqOoq-j0hsILg", "ELong"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_EQQPOMi3EdqOoq-j0hsILg", "ELongObject"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_EQQPOci3EdqOoq-j0hsILg", "EMap"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_EQQPOsi3EdqOoq-j0hsILg", "EResource"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_EQQPO8i3EdqOoq-j0hsILg", "EResourceSet"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_EQQPPMi3EdqOoq-j0hsILg", "EShort"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_EQQPPci3EdqOoq-j0hsILg", "EShortObject"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_EQQPPsi3EdqOoq-j0hsILg", "EString"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_EQQPP8i3EdqOoq-j0hsILg", "ETreeIterator"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8eN0a86EdiEh75YJ_3n8g", "EModelElement"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8eN0686EdiEh75YJ_3n8g", "EModelElement-eAnnotations"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8eN1q86EdiEh75YJ_3n8g", "EModelElement-getEAnnotation"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_h3txRMenEdm17tz62ORDiA", "EModelElement-getEAnnotation-_ownedParameter.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8eN2K86EdiEh75YJ_3n8g", "EModelElement-getEAnnotation-source"); //$NON-NLS-1$ //$NON-NLS-2$

					// UML2.metamodel.uml2 -> UML.metamodel.uml

					fragmentMap.put("_m8qbA686EdiEh75YJ_3n8g", "_0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8qbBa86EdiEh75YJ_3n8g", "Integer"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8qbBq86EdiEh75YJ_3n8g", "Boolean"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8qbB686EdiEh75YJ_3n8g", "String"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8qbCK86EdiEh75YJ_3n8g", "UnlimitedNatural"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_m8qbCa86EdiEh75YJ_3n8g", "Sequence"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_m8qbCq86EdiEh75YJ_3n8g", "Set"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8qbC686EdiEh75YJ_3n8g", "Element"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8qbDa86EdiEh75YJ_3n8g", "Element-ownedElement"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8qbEK86EdiEh75YJ_3n8g", "Element-owner"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8qbEq86EdiEh75YJ_3n8g", "Element-ownedComment"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_h3txYMenEdm17tz62ORDiA", "Element-not_own_self"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h3txYcenEdm17tz62ORDiA", "Element-not_own_self-_returnResult.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h3txYsenEdm17tz62ORDiA", "Element-not_own_self-diagnostics"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h3txY8enEdm17tz62ORDiA", "Element-not_own_self-context"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_h3txZMenEdm17tz62ORDiA", "Element-has_owner"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h3txZcenEdm17tz62ORDiA", "Element-has_owner-_returnResult.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h3txZsenEdm17tz62ORDiA", "Element-has_owner-diagnostics"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h3txZ8enEdm17tz62ORDiA", "Element-has_owner-context"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8qbHa86EdiEh75YJ_3n8g", "Element-allOwnedElements"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_h3txacenEdm17tz62ORDiA", "Element-allOwnedElements-_ownedParameter.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8qbH686EdiEh75YJ_3n8g", "Element-mustBeOwned"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_h3txa8enEdm17tz62ORDiA", "Element-mustBeOwned-_ownedParameter.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h3txbMenEdm17tz62ORDiA", "_ownedMember.7"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h3txbcenEdm17tz62ORDiA", "_ownedMember.8"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h3txbsenEdm17tz62ORDiA", "_ownedMember.8-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8qbJK86EdiEh75YJ_3n8g", "Comment"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8qbJq86EdiEh75YJ_3n8g", "Comment-body"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8qbKK86EdiEh75YJ_3n8g", "Comment-annotatedElement"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_m8qbK686EdiEh75YJ_3n8g", "Comment-bodyExpression"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8qbL686EdiEh75YJ_3n8g", "TemplateableElement"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8qbMa86EdiEh75YJ_3n8g", "TemplateableElement-templateBinding"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8qbNK86EdiEh75YJ_3n8g", "TemplateableElement-ownedTemplateSignature"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8qbNq86EdiEh75YJ_3n8g", "TemplateableElement-parameterableElements"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_h3txgsenEdm17tz62ORDiA", "TemplateableElement-parameterableElements-_ownedParameter.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h3txg8enEdm17tz62ORDiA", "_ownedMember.11"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8qbO686EdiEh75YJ_3n8g", "TemplateBinding"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8qbPa86EdiEh75YJ_3n8g", "TemplateBinding-signature"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8qbPq86EdiEh75YJ_3n8g", "TemplateBinding-parameterSubstitution"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8qbQa86EdiEh75YJ_3n8g", "TemplateBinding-boundElement"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8qbSq86EdiEh75YJ_3n8g", "DirectedRelationship"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8qbTK86EdiEh75YJ_3n8g", "DirectedRelationship-source"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8qbTq86EdiEh75YJ_3n8g", "DirectedRelationship-target"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8qbUq86EdiEh75YJ_3n8g", "Relationship"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8qbVK86EdiEh75YJ_3n8g", "Relationship-relatedElement"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h3txncenEdm17tz62ORDiA", "_ownedMember.15"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h3txnsenEdm17tz62ORDiA", "_ownedMember.15-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h3txn8enEdm17tz62ORDiA", "_ownedMember.16"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h3txoMenEdm17tz62ORDiA", "_ownedMember.16-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h3txocenEdm17tz62ORDiA", "_ownedMember.17"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h3txosenEdm17tz62ORDiA", "_ownedMember.17-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h3txo8enEdm17tz62ORDiA", "_ownedMember.18"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h3txpMenEdm17tz62ORDiA", "_ownedMember.18-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8qbXq86EdiEh75YJ_3n8g", "TemplateSignature"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8qbYK86EdiEh75YJ_3n8g", "TemplateSignature-parameter"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8qbYq86EdiEh75YJ_3n8g", "TemplateSignature-ownedParameter"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_m8qbZa86EdiEh75YJ_3n8g", "TemplateSignature-nestedSignature"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_m8qbaK86EdiEh75YJ_3n8g", "TemplateSignature-nestingSignature"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8qbaq86EdiEh75YJ_3n8g", "TemplateSignature-template"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h3txtMenEdm17tz62ORDiA", "_ownedMember.20"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h3txtcenEdm17tz62ORDiA", "_ownedMember.20-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8qbca86EdiEh75YJ_3n8g", "TemplateParameter"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8qbc686EdiEh75YJ_3n8g", "TemplateParameter-signature"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8qbdK86EdiEh75YJ_3n8g", "TemplateParameter-parameteredElement"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8qbda86EdiEh75YJ_3n8g", "TemplateParameter-ownedParameteredElement"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8qbd686EdiEh75YJ_3n8g", "TemplateParameter-default"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8qbea86EdiEh75YJ_3n8g", "TemplateParameter-ownedDefault"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h3txwsenEdm17tz62ORDiA", "_ownedMember.22"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h3txw8enEdm17tz62ORDiA", "_ownedMember.23"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8qbga86EdiEh75YJ_3n8g", "ParameterableElement"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8qbg686EdiEh75YJ_3n8g", "ParameterableElement-owningTemplateParameter"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8qbha86EdiEh75YJ_3n8g", "ParameterableElement-templateParameter"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h3txzMenEdm17tz62ORDiA", "_ownedMember.25"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h3txzcenEdm17tz62ORDiA", "_ownedMember.26"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h3txzsenEdm17tz62ORDiA", "_ownedMember.26-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h3txz8enEdm17tz62ORDiA", "_ownedMember.27"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h3tx0MenEdm17tz62ORDiA", "_ownedMember.27-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h3tx0cenEdm17tz62ORDiA", "_ownedMember.28"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33hYMenEdm17tz62ORDiA", "_ownedMember.29"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33hYcenEdm17tz62ORDiA", "_ownedMember.30"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8qbka86EdiEh75YJ_3n8g", "TemplateParameterSubstitution"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8qbk686EdiEh75YJ_3n8g", "TemplateParameterSubstitution-formal"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8qblK86EdiEh75YJ_3n8g", "TemplateParameterSubstitution-actual"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8qblq86EdiEh75YJ_3n8g", "TemplateParameterSubstitution-ownedActual"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8qbma86EdiEh75YJ_3n8g", "TemplateParameterSubstitution-templateBinding"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33hbcenEdm17tz62ORDiA", "_ownedMember.32"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33hbsenEdm17tz62ORDiA", "_ownedMember.32-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33hb8enEdm17tz62ORDiA", "_ownedMember.33"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33hcMenEdm17tz62ORDiA", "_ownedMember.33-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33hccenEdm17tz62ORDiA", "_ownedMember.34"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33hcsenEdm17tz62ORDiA", "_ownedMember.34-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33hc8enEdm17tz62ORDiA", "_ownedMember.35"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33hdMenEdm17tz62ORDiA", "_ownedMember.35-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33hdcenEdm17tz62ORDiA", "_ownedMember.36"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33hdsenEdm17tz62ORDiA", "_ownedMember.36-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8qbqK86EdiEh75YJ_3n8g", "StringExpression"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8qbqq86EdiEh75YJ_3n8g", "StringExpression-subExpression"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8qbra86EdiEh75YJ_3n8g", "StringExpression-owningExpression"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33hgMenEdm17tz62ORDiA", "_ownedMember.38"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8qbtK86EdiEh75YJ_3n8g", "MultiplicityElement"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8qbtq86EdiEh75YJ_3n8g", "MultiplicityElement-isOrdered"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8qbuK86EdiEh75YJ_3n8g", "MultiplicityElement-isUnique"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8qbuq86EdiEh75YJ_3n8g", "MultiplicityElement-lower"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8qbvK86EdiEh75YJ_3n8g", "MultiplicityElement-upper"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8qbvq86EdiEh75YJ_3n8g", "MultiplicityElement-upperValue"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8qbwK86EdiEh75YJ_3n8g", "MultiplicityElement-lowerValue"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8qbwq86EdiEh75YJ_3n8g", "MultiplicityElement-lowerBound"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_h33hlMenEdm17tz62ORDiA", "MultiplicityElement-lowerBound-_ownedParameter.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8qbxK86EdiEh75YJ_3n8g", "MultiplicityElement-upperBound"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_h33hlsenEdm17tz62ORDiA", "MultiplicityElement-upperBound-_ownedParameter.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8qbxq86EdiEh75YJ_3n8g", "MultiplicityElement-isMultivalued"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_h33hmMenEdm17tz62ORDiA", "MultiplicityElement-isMultivalued-_ownedParameter.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8qbyK86EdiEh75YJ_3n8g", "MultiplicityElement-includesCardinality"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_h33hmsenEdm17tz62ORDiA", "MultiplicityElement-includesCardinality-_ownedParameter.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8qbyq86EdiEh75YJ_3n8g", "MultiplicityElement-includesCardinality-C"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8qby686EdiEh75YJ_3n8g", "MultiplicityElement-includesMultiplicity"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_h33hncenEdm17tz62ORDiA", "MultiplicityElement-includesMultiplicity-_ownedParameter.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8qbza86EdiEh75YJ_3n8g", "MultiplicityElement-includesMultiplicity-M"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_h33hn8enEdm17tz62ORDiA", "MultiplicityElement-upper_gt_0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33hoMenEdm17tz62ORDiA", "MultiplicityElement-upper_gt_0-_returnResult.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33hocenEdm17tz62ORDiA", "MultiplicityElement-upper_gt_0-diagnostics"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33hosenEdm17tz62ORDiA", "MultiplicityElement-upper_gt_0-context"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_h33ho8enEdm17tz62ORDiA", "MultiplicityElement-lower_ge_0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33hpMenEdm17tz62ORDiA", "MultiplicityElement-lower_ge_0-_returnResult.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33hpcenEdm17tz62ORDiA", "MultiplicityElement-lower_ge_0-diagnostics"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33hpsenEdm17tz62ORDiA", "MultiplicityElement-lower_ge_0-context"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_h33hp8enEdm17tz62ORDiA", "MultiplicityElement-upper_ge_lower"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33hqMenEdm17tz62ORDiA", "MultiplicityElement-upper_ge_lower-_returnResult.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33hqcenEdm17tz62ORDiA", "MultiplicityElement-upper_ge_lower-diagnostics"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33hqsenEdm17tz62ORDiA", "MultiplicityElement-upper_ge_lower-context"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33hq8enEdm17tz62ORDiA", "MultiplicityElement-lower_eq_lowerbound"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33hrMenEdm17tz62ORDiA", "MultiplicityElement-lower_eq_lowerbound-_returnResult.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33hrcenEdm17tz62ORDiA", "MultiplicityElement-lower_eq_lowerbound-diagnostics"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33hrsenEdm17tz62ORDiA", "MultiplicityElement-lower_eq_lowerbound-context"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33hr8enEdm17tz62ORDiA", "MultiplicityElement-upper_eq_upperbound"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33hsMenEdm17tz62ORDiA", "MultiplicityElement-upper_eq_upperbound-_returnResult.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33hscenEdm17tz62ORDiA", "MultiplicityElement-upper_eq_upperbound-diagnostics"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33hssenEdm17tz62ORDiA", "MultiplicityElement-upper_eq_upperbound-context"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8qb4q86EdiEh75YJ_3n8g", "MultiplicityElement-lower.1"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_h33htMenEdm17tz62ORDiA", "MultiplicityElement-lower.1-_ownedParameter.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8qb5K86EdiEh75YJ_3n8g", "MultiplicityElement-upper.1"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_h33htsenEdm17tz62ORDiA", "MultiplicityElement-upper.1-_ownedParameter.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33ht8enEdm17tz62ORDiA", "_ownedMember.40"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33huMenEdm17tz62ORDiA", "_ownedMember.40-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8qb6q86EdiEh75YJ_3n8g", "ValueSpecification"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8qb7a86EdiEh75YJ_3n8g", "ValueSpecification-isComputable"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_h33hvcenEdm17tz62ORDiA", "ValueSpecification-isComputable-_ownedParameter.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8qb7686EdiEh75YJ_3n8g", "ValueSpecification-integerValue"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_h33hv8enEdm17tz62ORDiA", "ValueSpecification-integerValue-_ownedParameter.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8qb8a86EdiEh75YJ_3n8g", "ValueSpecification-booleanValue"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_h33hwcenEdm17tz62ORDiA", "ValueSpecification-booleanValue-_ownedParameter.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8qb8686EdiEh75YJ_3n8g", "ValueSpecification-stringValue"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_h33hw8enEdm17tz62ORDiA", "ValueSpecification-stringValue-_ownedParameter.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8qb9a86EdiEh75YJ_3n8g", "ValueSpecification-unlimitedValue"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_h33hxcenEdm17tz62ORDiA", "ValueSpecification-unlimitedValue-_ownedParameter.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8qb9686EdiEh75YJ_3n8g", "ValueSpecification-isNull"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_h33hx8enEdm17tz62ORDiA", "ValueSpecification-isNull-_ownedParameter.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8qb-a86EdiEh75YJ_3n8g", "TypedElement"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8qb-686EdiEh75YJ_3n8g", "TypedElement-type"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8qb_a86EdiEh75YJ_3n8g", "NamedElement"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8qcAa86EdiEh75YJ_3n8g", "NamedElement-clientDependency"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8qcBK86EdiEh75YJ_3n8g", "NamedElement-name"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8qcBq86EdiEh75YJ_3n8g", "NamedElement-qualifiedName"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8qb_686EdiEh75YJ_3n8g", "NamedElement-visibility"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8qcCK86EdiEh75YJ_3n8g", "NamedElement-nameExpression"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33h2senEdm17tz62ORDiA", "NamedElement-no_name"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33h28enEdm17tz62ORDiA", "NamedElement-no_name-_returnResult.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33h3MenEdm17tz62ORDiA", "NamedElement-no_name-diagnostics"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33h3cenEdm17tz62ORDiA", "NamedElement-no_name-context"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33h3senEdm17tz62ORDiA", "NamedElement-qualified_name"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33h38enEdm17tz62ORDiA", "NamedElement-qualified_name-_returnResult.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33h4MenEdm17tz62ORDiA", "NamedElement-qualified_name-diagnostics"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33h4cenEdm17tz62ORDiA", "NamedElement-qualified_name-context"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8qcEq86EdiEh75YJ_3n8g", "NamedElement-allNamespaces"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_h33h48enEdm17tz62ORDiA", "NamedElement-allNamespaces-_ownedParameter.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8qcFK86EdiEh75YJ_3n8g", "NamedElement-isDistinguishableFrom"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_h33h5cenEdm17tz62ORDiA", "NamedElement-isDistinguishableFrom-_ownedParameter.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8qcFq86EdiEh75YJ_3n8g", "NamedElement-isDistinguishableFrom-n"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8qcF686EdiEh75YJ_3n8g", "NamedElement-isDistinguishableFrom-ns"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8qcGK86EdiEh75YJ_3n8g", "NamedElement-separator"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_h33h6cenEdm17tz62ORDiA", "NamedElement-separator-_ownedParameter.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8qcGq86EdiEh75YJ_3n8g", "NamedElement-qualifiedName.1"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_h33h68enEdm17tz62ORDiA", "NamedElement-qualifiedName.1-_ownedParameter.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_h33h7MenEdm17tz62ORDiA", "NamedElement-visibility_needs_ownership"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33h7cenEdm17tz62ORDiA", "NamedElement-visibility_needs_ownership-_returnResult.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33h7senEdm17tz62ORDiA", "NamedElement-visibility_needs_ownership-diagnostics"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33h78enEdm17tz62ORDiA", "NamedElement-visibility_needs_ownership-context"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8whhK86EdiEh75YJ_3n8g", "Namespace"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8whhq86EdiEh75YJ_3n8g", "Namespace-member"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8whia86EdiEh75YJ_3n8g", "Namespace-ownedRule"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8whjK86EdiEh75YJ_3n8g", "Namespace-importedMember"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8whj686EdiEh75YJ_3n8g", "Namespace-elementImport"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8whkq86EdiEh75YJ_3n8g", "Namespace-packageImport"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33iBcenEdm17tz62ORDiA", "Namespace-members_are_distinguishable"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33iBsenEdm17tz62ORDiA", "Namespace-members_are_distinguishable-_returnResult.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33iB8enEdm17tz62ORDiA", "Namespace-members_are_distinguishable-diagnostics"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33iCMenEdm17tz62ORDiA", "Namespace-members_are_distinguishable-context"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8whma86EdiEh75YJ_3n8g", "Namespace-getNamesOfMember"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_h33iCsenEdm17tz62ORDiA", "Namespace-getNamesOfMember-_ownedParameter.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8whm686EdiEh75YJ_3n8g", "Namespace-getNamesOfMember-element"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8whnK86EdiEh75YJ_3n8g", "Namespace-membersAreDistinguishable"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_h33iDcenEdm17tz62ORDiA", "Namespace-membersAreDistinguishable-_ownedParameter.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33iDsenEdm17tz62ORDiA", "Namespace-importedMember_derived"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33iD8enEdm17tz62ORDiA", "Namespace-importedMember_derived-_returnResult.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33iEMenEdm17tz62ORDiA", "Namespace-importedMember_derived-diagnostics"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33iEcenEdm17tz62ORDiA", "Namespace-importedMember_derived-context"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8whoq86EdiEh75YJ_3n8g", "Namespace-importedMember.1"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_h33iE8enEdm17tz62ORDiA", "Namespace-importedMember.1-_ownedParameter.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8whpK86EdiEh75YJ_3n8g", "Namespace-importMembers"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_h33iFcenEdm17tz62ORDiA", "Namespace-importMembers-_ownedParameter.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8whpq86EdiEh75YJ_3n8g", "Namespace-importMembers-imps"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8whp686EdiEh75YJ_3n8g", "Namespace-excludeCollisions"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_h33iGMenEdm17tz62ORDiA", "Namespace-excludeCollisions-_ownedParameter.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8whqa86EdiEh75YJ_3n8g", "Namespace-excludeCollisions-imps"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33iGsenEdm17tz62ORDiA", "_ownedMember.45"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33iG8enEdm17tz62ORDiA", "_ownedMember.45-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33iHMenEdm17tz62ORDiA", "_ownedMember.46"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8whsa86EdiEh75YJ_3n8g", "Constraint"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8whs686EdiEh75YJ_3n8g", "Constraint-context"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8whta86EdiEh75YJ_3n8g", "Constraint-specification"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8whtq86EdiEh75YJ_3n8g", "Constraint-constrainedElement"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8whua86EdiEh75YJ_3n8g", "Constraint-context"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_h33iK8enEdm17tz62ORDiA", "Constraint-not_apply_to_self"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33iLMenEdm17tz62ORDiA", "Constraint-not_apply_to_self-_returnResult.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33iLcenEdm17tz62ORDiA", "Constraint-not_apply_to_self-diagnostics"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33iLsenEdm17tz62ORDiA", "Constraint-not_apply_to_self-context"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m8whwa86EdiEh75YJ_3n8g", "PackageableElement"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m82oIK86EdiEh75YJ_3n8g", "PackageableElement-visibility"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m82oJq86EdiEh75YJ_3n8g", "VisibilityKind"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m82oJ686EdiEh75YJ_3n8g", "VisibilityKind-public"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m82oKK86EdiEh75YJ_3n8g", "VisibilityKind-private"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m82oKa86EdiEh75YJ_3n8g", "VisibilityKind-protected"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m82oKq86EdiEh75YJ_3n8g", "VisibilityKind-package"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33iO8enEdm17tz62ORDiA", "_ownedMember.50"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33iPMenEdm17tz62ORDiA", "_ownedMember.50-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33iPcenEdm17tz62ORDiA", "_ownedMember.51"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33iPsenEdm17tz62ORDiA", "_ownedMember.51-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33iP8enEdm17tz62ORDiA", "_ownedMember.52"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33iQMenEdm17tz62ORDiA", "_ownedMember.52-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33iQcenEdm17tz62ORDiA", "_ownedMember.53"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33iQsenEdm17tz62ORDiA", "_ownedMember.53-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33iQ8enEdm17tz62ORDiA", "_ownedMember.54"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m82oNK86EdiEh75YJ_3n8g", "ElementImport"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m82oNq86EdiEh75YJ_3n8g", "ElementImport-visibility"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m82oOK86EdiEh75YJ_3n8g", "ElementImport-alias"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m82oOq86EdiEh75YJ_3n8g", "ElementImport-importedElement"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m82oO686EdiEh75YJ_3n8g", "ElementImport-importingNamespace"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_h33iTsenEdm17tz62ORDiA", "ElementImport-visibility_public_or_private"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33iT8enEdm17tz62ORDiA", "ElementImport-visibility_public_or_private-_returnResult.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33iUMenEdm17tz62ORDiA", "ElementImport-visibility_public_or_private-diagnostics"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33iUcenEdm17tz62ORDiA", "ElementImport-visibility_public_or_private-context"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_h33iUsenEdm17tz62ORDiA", "ElementImport-imported_element_is_public"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33iU8enEdm17tz62ORDiA", "ElementImport-imported_element_is_public-_returnResult.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33iVMenEdm17tz62ORDiA", "ElementImport-imported_element_is_public-diagnostics"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33iVcenEdm17tz62ORDiA", "ElementImport-imported_element_is_public-context"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m82oRK86EdiEh75YJ_3n8g", "ElementImport-getName"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_h33iV8enEdm17tz62ORDiA", "ElementImport-getName-_ownedParameter.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33iWMenEdm17tz62ORDiA", "_ownedMember.56"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33iWcenEdm17tz62ORDiA", "_ownedMember.56-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33iWsenEdm17tz62ORDiA", "_ownedMember.57"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m82oT686EdiEh75YJ_3n8g", "PackageImport"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m82oUa86EdiEh75YJ_3n8g", "PackageImport-visibility"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m82oU686EdiEh75YJ_3n8g", "PackageImport-importedPackage"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m82oVK86EdiEh75YJ_3n8g", "PackageImport-importingNamespace"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_h33iY8enEdm17tz62ORDiA", "PackageImport-public_or_private"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33iZMenEdm17tz62ORDiA", "PackageImport-public_or_private-_returnResult.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33iZcenEdm17tz62ORDiA", "PackageImport-public_or_private-diagnostics"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33iZsenEdm17tz62ORDiA", "PackageImport-public_or_private-context"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33iZ8enEdm17tz62ORDiA", "_ownedMember.59"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33iaMenEdm17tz62ORDiA", "_ownedMember.59-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m82oYa86EdiEh75YJ_3n8g", "Package"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m82oZK86EdiEh75YJ_3n8g", "Package-nestedPackage"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m82oZ686EdiEh75YJ_3n8g", "Package-nestingPackage"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m82oaa86EdiEh75YJ_3n8g", "Package-ownedType"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m82obK86EdiEh75YJ_3n8g", "Package-packagedElement"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m82ob686EdiEh75YJ_3n8g", "Package-packageMerge"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m82oda86EdiEh75YJ_3n8g", "Package-profileApplication"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m82ocq86EdiEh75YJ_3n8g", "Package-packageMerge"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_h33iiMenEdm17tz62ORDiA", "Package-elements_public_or_private"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33iicenEdm17tz62ORDiA", "Package-elements_public_or_private-_returnResult.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33iisenEdm17tz62ORDiA", "Package-elements_public_or_private-diagnostics"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33ii8enEdm17tz62ORDiA", "Package-elements_public_or_private-context"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m82ofq86EdiEh75YJ_3n8g", "Package-visibleMembers"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_h33ijcenEdm17tz62ORDiA", "Package-visibleMembers-_ownedParameter.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m82ogK86EdiEh75YJ_3n8g", "Package-makesVisible"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_h33ij8enEdm17tz62ORDiA", "Package-makesVisible-_ownedParameter.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m82ogq86EdiEh75YJ_3n8g", "Package-makesVisible-el"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33ikcenEdm17tz62ORDiA", "_ownedMember.61"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33iksenEdm17tz62ORDiA", "_ownedMember.62"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m82oi686EdiEh75YJ_3n8g", "Type"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m82oja86EdiEh75YJ_3n8g", "Type-package"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m82oj686EdiEh75YJ_3n8g", "Type-conformsTo"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_h33imsenEdm17tz62ORDiA", "Type-conformsTo-_ownedParameter.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m82oka86EdiEh75YJ_3n8g", "Type-conformsTo-other"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33inMenEdm17tz62ORDiA", "_ownedMember.64"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33incenEdm17tz62ORDiA", "_ownedMember.64-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33insenEdm17tz62ORDiA", "_ownedMember.65"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m82ol686EdiEh75YJ_3n8g", "PackageMerge"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m82oma86EdiEh75YJ_3n8g", "PackageMerge-mergedPackage"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m82omq86EdiEh75YJ_3n8g", "PackageMerge-receivingPackage"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33ipcenEdm17tz62ORDiA", "_ownedMember.67"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33ipsenEdm17tz62ORDiA", "_ownedMember.67-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33ip8enEdm17tz62ORDiA", "_ownedMember.68"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33iqMenEdm17tz62ORDiA", "_ownedMember.68-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m82op686EdiEh75YJ_3n8g", "ProfileApplication"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m82oqa86EdiEh75YJ_3n8g", "ProfileApplication-appliedProfile"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33irMenEdm17tz62ORDiA", "_ownedMember.70"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33ircenEdm17tz62ORDiA", "_ownedMember.70-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m82orq86EdiEh75YJ_3n8g", "Profile"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m82osK86EdiEh75YJ_3n8g", "Profile-ownedStereotype"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m82os686EdiEh75YJ_3n8g", "Profile-metaclassReference"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m82otq86EdiEh75YJ_3n8g", "Profile-metamodelReference"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33iv8enEdm17tz62ORDiA", "_ownedMember.72"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33iwMenEdm17tz62ORDiA", "_ownedMember.72-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m88uxK86EdiEh75YJ_3n8g", "Stereotype"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m88uxq86EdiEh75YJ_3n8g", "Class"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m88uya86EdiEh75YJ_3n8g", "Class-ownedOperation"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m88uzK86EdiEh75YJ_3n8g", "Class-superClass"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m88u0q86EdiEh75YJ_3n8g", "Class-extension"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m88uz686EdiEh75YJ_3n8g", "Class-nestedClassifier"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m88u1a86EdiEh75YJ_3n8g", "Class-isActive"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m88u1686EdiEh75YJ_3n8g", "Class-ownedReception"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m88u6686EdiEh75YJ_3n8g", "BehavioredClassifier"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m88u7a86EdiEh75YJ_3n8g", "BehavioredClassifier-ownedBehavior"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m88u8K86EdiEh75YJ_3n8g", "BehavioredClassifier-ownedBehavior"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m88u8686EdiEh75YJ_3n8g", "BehavioredClassifier-classifierBehavior"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m88u9a86EdiEh75YJ_3n8g", "BehavioredClassifier-interfaceRealization"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m88u-K86EdiEh75YJ_3n8g", "BehavioredClassifier-ownedTrigger"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m88vAa86EdiEh75YJ_3n8g", "Classifier"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m88vBa86EdiEh75YJ_3n8g", "Classifier-feature"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m88vCK86EdiEh75YJ_3n8g", "Classifier-isAbstract"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m88vCq86EdiEh75YJ_3n8g", "Classifier-inheritedMember"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m88vDa86EdiEh75YJ_3n8g", "Classifier-general"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m88vEK86EdiEh75YJ_3n8g", "Classifier-generalization"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m88vE686EdiEh75YJ_3n8g", "Classifier-powertypeExtent"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m88vFq86EdiEh75YJ_3n8g", "Classifier-attribute"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m88vGa86EdiEh75YJ_3n8g", "Classifier-redefinedClassifier"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m88vHK86EdiEh75YJ_3n8g", "Classifier-substitution"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m88vH686EdiEh75YJ_3n8g", "Classifier-ownedUseCase"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m88vIq86EdiEh75YJ_3n8g", "Classifier-useCase"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m88vJa86EdiEh75YJ_3n8g", "Classifier-representation"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m88vJ686EdiEh75YJ_3n8g", "Classifier-collaborationUse"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m88vKq86EdiEh75YJ_3n8g", "Classifier-allFeatures"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_h33jI8enEdm17tz62ORDiA", "Classifier-allFeatures-_ownedParameter.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_h33jJMenEdm17tz62ORDiA", "Classifier-no_cycles_in_generalization"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33jJcenEdm17tz62ORDiA", "Classifier-no_cycles_in_generalization-_returnResult.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33jJsenEdm17tz62ORDiA", "Classifier-no_cycles_in_generalization-diagnostics"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33jJ8enEdm17tz62ORDiA", "Classifier-no_cycles_in_generalization-context"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_h33jKMenEdm17tz62ORDiA", "Classifier-specialize_type"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33jKcenEdm17tz62ORDiA", "Classifier-specialize_type-_returnResult.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33jKsenEdm17tz62ORDiA", "Classifier-specialize_type-diagnostics"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33jK8enEdm17tz62ORDiA", "Classifier-specialize_type-context"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33jLMenEdm17tz62ORDiA", "Classifier-inherited_member"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33jLcenEdm17tz62ORDiA", "Classifier-inherited_member-_returnResult.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33jLsenEdm17tz62ORDiA", "Classifier-inherited_member-diagnostics"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33jL8enEdm17tz62ORDiA", "Classifier-inherited_member-context"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m88vOK86EdiEh75YJ_3n8g", "Classifier-inheritedMember.1"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_h33jMcenEdm17tz62ORDiA", "Classifier-inheritedMember.1-_ownedParameter.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m88vOq86EdiEh75YJ_3n8g", "Classifier-parents"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_h33jM8enEdm17tz62ORDiA", "Classifier-parents-_ownedParameter.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m88vPK86EdiEh75YJ_3n8g", "Classifier-allParents"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_h33jNcenEdm17tz62ORDiA", "Classifier-allParents-_ownedParameter.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m88vPq86EdiEh75YJ_3n8g", "Classifier-inheritableMembers"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_h33jN8enEdm17tz62ORDiA", "Classifier-inheritableMembers-_ownedParameter.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m88vQK86EdiEh75YJ_3n8g", "Classifier-inheritableMembers-c"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m88vQa86EdiEh75YJ_3n8g", "Classifier-hasVisibilityOf"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_h33jOsenEdm17tz62ORDiA", "Classifier-hasVisibilityOf-_ownedParameter.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m88vQ686EdiEh75YJ_3n8g", "Classifier-hasVisibilityOf-n"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m88vRK86EdiEh75YJ_3n8g", "Classifier-inherit"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_h33jPcenEdm17tz62ORDiA", "Classifier-inherit-_ownedParameter.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m88vRq86EdiEh75YJ_3n8g", "Classifier-inherit-inhs"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m88vR686EdiEh75YJ_3n8g", "Classifier-maySpecializeType"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_h33jQMenEdm17tz62ORDiA", "Classifier-maySpecializeType-_ownedParameter.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m88vSa86EdiEh75YJ_3n8g", "Classifier-maySpecializeType-c"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m88vSq86EdiEh75YJ_3n8g", "Classifier-general.1"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_h33jQ8enEdm17tz62ORDiA", "Classifier-general.1-_ownedParameter.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33jRMenEdm17tz62ORDiA", "Classifier-general_equals_parents"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33jRcenEdm17tz62ORDiA", "Classifier-general_equals_parents-_returnResult.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33jRsenEdm17tz62ORDiA", "Classifier-general_equals_parents-diagnostics"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33jR8enEdm17tz62ORDiA", "Classifier-general_equals_parents-context"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m88vUK86EdiEh75YJ_3n8g", "Classifier-conformsTo"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_h33jScenEdm17tz62ORDiA", "Classifier-conformsTo-_ownedParameter.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m88vUq86EdiEh75YJ_3n8g", "Classifier-conformsTo-other"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m88vXa86EdiEh75YJ_3n8g", "RedefinableElement"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m88vX686EdiEh75YJ_3n8g", "RedefinableElement-redefinitionContext"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m88vYq86EdiEh75YJ_3n8g", "RedefinableElement-isLeaf"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_h33jU8enEdm17tz62ORDiA", "RedefinableElement-redefinition_context_valid"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33jVMenEdm17tz62ORDiA", "RedefinableElement-redefinition_context_valid-_returnResult.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33jVcenEdm17tz62ORDiA", "RedefinableElement-redefinition_context_valid-diagnostics"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33jVsenEdm17tz62ORDiA", "RedefinableElement-redefinition_context_valid-context"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_h33jV8enEdm17tz62ORDiA", "RedefinableElement-redefinition_consistent"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33jWMenEdm17tz62ORDiA", "RedefinableElement-redefinition_consistent-_returnResult.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33jWcenEdm17tz62ORDiA", "RedefinableElement-redefinition_consistent-diagnostics"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33jWsenEdm17tz62ORDiA", "RedefinableElement-redefinition_consistent-context"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m88vbK86EdiEh75YJ_3n8g", "RedefinableElement-isConsistentWith"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_h33jXMenEdm17tz62ORDiA", "RedefinableElement-isConsistentWith-_ownedParameter.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9C1YK86EdiEh75YJ_3n8g", "RedefinableElement-isConsistentWith-redefinee"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9C1Ya86EdiEh75YJ_3n8g", "RedefinableElement-isRedefinitionContextValid"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_h33jX8enEdm17tz62ORDiA", "RedefinableElement-isRedefinitionContextValid-_ownedParameter.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9C1Y686EdiEh75YJ_3n8g", "RedefinableElement-isRedefinitionContextValid-redefined"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33jYcenEdm17tz62ORDiA", "_ownedMember.78"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33jYsenEdm17tz62ORDiA", "_ownedMember.78-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33jY8enEdm17tz62ORDiA", "_ownedMember.79"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9C1aa86EdiEh75YJ_3n8g", "Feature"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9C1a686EdiEh75YJ_3n8g", "Feature-isStatic"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9C1ba86EdiEh75YJ_3n8g", "Feature-featuringClassifier"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33jbcenEdm17tz62ORDiA", "_ownedMember.81"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33jbsenEdm17tz62ORDiA", "_ownedMember.81-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33jb8enEdm17tz62ORDiA", "_ownedMember.82"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33jcMenEdm17tz62ORDiA", "_ownedMember.82-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33jccenEdm17tz62ORDiA", "_ownedMember.83"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9C1da86EdiEh75YJ_3n8g", "Generalization"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9C1d686EdiEh75YJ_3n8g", "Generalization-general"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9C1eK86EdiEh75YJ_3n8g", "Generalization-isSubstitutable"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9C1eq86EdiEh75YJ_3n8g", "Generalization-generalizationSet"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9C1fa86EdiEh75YJ_3n8g", "Generalization-specific"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33jfcenEdm17tz62ORDiA", "_ownedMember.85"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33jfsenEdm17tz62ORDiA", "_ownedMember.85-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33jf8enEdm17tz62ORDiA", "_ownedMember.86"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9C1h686EdiEh75YJ_3n8g", "GeneralizationSet"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9C1ia86EdiEh75YJ_3n8g", "GeneralizationSet-isCovering"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9C1i686EdiEh75YJ_3n8g", "GeneralizationSet-isDisjoint"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9C1ja86EdiEh75YJ_3n8g", "GeneralizationSet-powertype"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9C1j686EdiEh75YJ_3n8g", "GeneralizationSet-generalization"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33ji8enEdm17tz62ORDiA", "_ownedMember.88"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33jjMenEdm17tz62ORDiA", "_ownedMember.89"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h33jjcenEdm17tz62ORDiA", "_ownedMember.89-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9C1la86EdiEh75YJ_3n8g", "Property"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9C1ma86EdiEh75YJ_3n8g", "Property-datatype"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9C1m686EdiEh75YJ_3n8g", "Property-default"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9C1na86EdiEh75YJ_3n8g", "Property-isComposite"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9C1n686EdiEh75YJ_3n8g", "Property-isDerived"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9C1oa86EdiEh75YJ_3n8g", "Property-class"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9C1o686EdiEh75YJ_3n8g", "Property-opposite"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9C1pa86EdiEh75YJ_3n8g", "Property-isDerivedUnion"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9C1p686EdiEh75YJ_3n8g", "Property-association"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9C1qa86EdiEh75YJ_3n8g", "Property-owningAssociation"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9C1q686EdiEh75YJ_3n8g", "Property-redefinedProperty"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9C1rq86EdiEh75YJ_3n8g", "Property-subsettedProperty"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9C1sa86EdiEh75YJ_3n8g", "Property-aggregation"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9C1s686EdiEh75YJ_3n8g", "Property-defaultValue"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9C1ta86EdiEh75YJ_3n8g", "Property-qualifier"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9C1uK86EdiEh75YJ_3n8g", "Property-associationEnd"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4ArZsenEdm17tz62ORDiA", "Property-opposite_is_other_end"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4ArZ8enEdm17tz62ORDiA", "Property-opposite_is_other_end-_returnResult.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4AraMenEdm17tz62ORDiA", "Property-opposite_is_other_end-diagnostics"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4AracenEdm17tz62ORDiA", "Property-opposite_is_other_end-context"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9C1vq86EdiEh75YJ_3n8g", "Property-opposite.1"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_h4Ara8enEdm17tz62ORDiA", "Property-opposite.1-_ownedParameter.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_h4ArbMenEdm17tz62ORDiA", "Property-multiplicity_of_composite"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4ArbcenEdm17tz62ORDiA", "Property-multiplicity_of_composite-_returnResult.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4ArbsenEdm17tz62ORDiA", "Property-multiplicity_of_composite-diagnostics"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Arb8enEdm17tz62ORDiA", "Property-multiplicity_of_composite-context"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4ArcMenEdm17tz62ORDiA", "Property-subsetting_context"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4ArccenEdm17tz62ORDiA", "Property-subsetting_context-_returnResult.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4ArcsenEdm17tz62ORDiA", "Property-subsetting_context-diagnostics"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Arc8enEdm17tz62ORDiA", "Property-subsetting_context-context"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4ArdMenEdm17tz62ORDiA", "Property-navigable_property_redefinition"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4ArdcenEdm17tz62ORDiA", "Property-navigable_property_redefinition-_returnResult.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4ArdsenEdm17tz62ORDiA", "Property-navigable_property_redefinition-diagnostics"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Ard8enEdm17tz62ORDiA", "Property-navigable_property_redefinition-context"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_h4AreMenEdm17tz62ORDiA", "Property-subsetting_rules"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4ArecenEdm17tz62ORDiA", "Property-subsetting_rules-_returnResult.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4AresenEdm17tz62ORDiA", "Property-subsetting_rules-diagnostics"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Are8enEdm17tz62ORDiA", "Property-subsetting_rules-context"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_h4ArfMenEdm17tz62ORDiA", "Property-navigable_readonly"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4ArfcenEdm17tz62ORDiA", "Property-navigable_readonly-_returnResult.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4ArfsenEdm17tz62ORDiA", "Property-navigable_readonly-diagnostics"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Arf8enEdm17tz62ORDiA", "Property-navigable_readonly-context"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4ArgMenEdm17tz62ORDiA", "Property-derivedUnion_is_derived"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4ArgcenEdm17tz62ORDiA", "Property-derivedUnion_is_derived-_returnResult.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4ArgsenEdm17tz62ORDiA", "Property-derivedUnion_is_derived-diagnostics"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Arg8enEdm17tz62ORDiA", "Property-derivedUnion_is_derived-context"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9C12686EdiEh75YJ_3n8g", "Property-subsettingContext"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_h4ArhcenEdm17tz62ORDiA", "Property-subsettingContext-_ownedParameter.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9C16686EdiEh75YJ_3n8g", "StructuralFeature"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9C17686EdiEh75YJ_3n8g", "StructuralFeature-isReadOnly"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9C18a86EdiEh75YJ_3n8g", "ConnectableElement"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9C19K86EdiEh75YJ_3n8g", "ConnectableElement-end"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4ArksenEdm17tz62ORDiA", "_ownedMember.93"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9C1-K86EdiEh75YJ_3n8g", "ConnectorEnd"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9C1-q86EdiEh75YJ_3n8g", "ConnectorEnd-definingEnd"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9C1_K86EdiEh75YJ_3n8g", "ConnectorEnd-partWithPort"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9C1_q86EdiEh75YJ_3n8g", "ConnectorEnd-role"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4ArncenEdm17tz62ORDiA", "_ownedMember.95"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4ArnsenEdm17tz62ORDiA", "_ownedMember.95-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Arn8enEdm17tz62ORDiA", "_ownedMember.96"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4AroMenEdm17tz62ORDiA", "_ownedMember.96-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9C2BK86EdiEh75YJ_3n8g", "DeploymentTarget"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9C2Bq86EdiEh75YJ_3n8g", "DeploymentTarget-deployment"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9C2Ca86EdiEh75YJ_3n8g", "DeploymentTarget-deployedElement"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Arq8enEdm17tz62ORDiA", "_ownedMember.98"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9C2Ea86EdiEh75YJ_3n8g", "Deployment"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9C2E686EdiEh75YJ_3n8g", "Deployment-deployedArtifact"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9C2Fq86EdiEh75YJ_3n8g", "Deployment-configuration"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9C2Ga86EdiEh75YJ_3n8g", "Deployment-location"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9C2JK86EdiEh75YJ_3n8g", "Dependency"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9C2J686EdiEh75YJ_3n8g", "Dependency-client"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9C2Ka86EdiEh75YJ_3n8g", "Dependency-supplier"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4ArvsenEdm17tz62ORDiA", "_ownedMember.101"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Arv8enEdm17tz62ORDiA", "_ownedMember.102"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4ArwMenEdm17tz62ORDiA", "_ownedMember.102-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4ArwcenEdm17tz62ORDiA", "_ownedMember.103"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4ArwsenEdm17tz62ORDiA", "_ownedMember.103-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9C2MK86EdiEh75YJ_3n8g", "DeployedArtifact"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4ArxcenEdm17tz62ORDiA", "_ownedMember.105"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4ArxsenEdm17tz62ORDiA", "_ownedMember.105-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9C2NK86EdiEh75YJ_3n8g", "DeploymentSpecification"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9C2Nq86EdiEh75YJ_3n8g", "DeploymentSpecification-deploymentLocation"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9C2OK86EdiEh75YJ_3n8g", "DeploymentSpecification-executionLocation"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9C2Oq86EdiEh75YJ_3n8g", "Artifact"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9C2Pa86EdiEh75YJ_3n8g", "Artifact-fileName"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9C2P686EdiEh75YJ_3n8g", "Artifact-nestedArtifact"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9C2Qq86EdiEh75YJ_3n8g", "Artifact-manifestation"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9C2Ra86EdiEh75YJ_3n8g", "Artifact-ownedOperation"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9C2SK86EdiEh75YJ_3n8g", "Artifact-ownedAttribute"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Ar3senEdm17tz62ORDiA", "_ownedMember.108"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Ar38enEdm17tz62ORDiA", "_ownedMember.108-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Ar4MenEdm17tz62ORDiA", "_ownedMember.109"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Ar4cenEdm17tz62ORDiA", "_ownedMember.109-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9C2Wa86EdiEh75YJ_3n8g", "Manifestation"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9C2W686EdiEh75YJ_3n8g", "Manifestation-utilizedElement"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9C2YK86EdiEh75YJ_3n8g", "Abstraction"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9C2Yq86EdiEh75YJ_3n8g", "Abstraction-mapping"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Ar6cenEdm17tz62ORDiA", "_ownedMember.112"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Ar6senEdm17tz62ORDiA", "_ownedMember.112-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9C2aK86EdiEh75YJ_3n8g", "OpaqueExpression"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9C2aq86EdiEh75YJ_3n8g", "OpaqueExpression-body"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9C2bK86EdiEh75YJ_3n8g", "OpaqueExpression-language"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9C2bq86EdiEh75YJ_3n8g", "OpaqueExpression-result"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9C2cK86EdiEh75YJ_3n8g", "OpaqueExpression-behavior"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Ar-cenEdm17tz62ORDiA", "_ownedMember.114"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Ar-senEdm17tz62ORDiA", "_ownedMember.114-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9C2dK86EdiEh75YJ_3n8g", "Parameter"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9C2eK86EdiEh75YJ_3n8g", "Parameter-parameterSet"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9C2e686EdiEh75YJ_3n8g", "Parameter-operation"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9C2fa86EdiEh75YJ_3n8g", "Parameter-default"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9C2f686EdiEh75YJ_3n8g", "Parameter-direction"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9C2ga86EdiEh75YJ_3n8g", "Parameter-defaultValue"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9C2g686EdiEh75YJ_3n8g", "Parameter-isException"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9C2ha86EdiEh75YJ_3n8g", "Parameter-isStream"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9C2h686EdiEh75YJ_3n8g", "Parameter-effect"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9C2ja86EdiEh75YJ_3n8g", "Operation"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9C2kq86EdiEh75YJ_3n8g", "Operation-class"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9C2lK86EdiEh75YJ_3n8g", "Operation-isQuery"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9C2lq86EdiEh75YJ_3n8g", "Operation-datatype"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9C2mK86EdiEh75YJ_3n8g", "Operation-precondition"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9C2m686EdiEh75YJ_3n8g", "Operation-postcondition"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9C2nq86EdiEh75YJ_3n8g", "Operation-redefinedOperation"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9C2oa86EdiEh75YJ_3n8g", "Operation-bodyCondition"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9C2o686EdiEh75YJ_3n8g", "Operation-ownedParameter"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4AsN8enEdm17tz62ORDiA", "Operation-type_of_result"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4AsOMenEdm17tz62ORDiA", "Operation-type_of_result-_returnResult.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4AsOcenEdm17tz62ORDiA", "Operation-type_of_result-diagnostics"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4AsOsenEdm17tz62ORDiA", "Operation-type_of_result-context"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9C2qq86EdiEh75YJ_3n8g", "Operation-isOrdered"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_h4AsPMenEdm17tz62ORDiA", "Operation-isOrdered-_ownedParameter.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9C2rK86EdiEh75YJ_3n8g", "Operation-isUnique"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_h4AsPsenEdm17tz62ORDiA", "Operation-isUnique-_ownedParameter.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9I8Ba86EdiEh75YJ_3n8g", "Operation-type"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_h4AsQMenEdm17tz62ORDiA", "Operation-type-_ownedParameter.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_h4AsQcenEdm17tz62ORDiA", "Operation-only_body_for_query"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4AsQsenEdm17tz62ORDiA", "Operation-only_body_for_query-_returnResult.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4AsQ8enEdm17tz62ORDiA", "Operation-only_body_for_query-diagnostics"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4AsRMenEdm17tz62ORDiA", "Operation-only_body_for_query-context"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9I8Kq86EdiEh75YJ_3n8g", "BehavioralFeature"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9I8La86EdiEh75YJ_3n8g", "BehavioralFeature-ownedParameter"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9I8MK86EdiEh75YJ_3n8g", "BehavioralFeature-ownedParameter"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9I8M686EdiEh75YJ_3n8g", "BehavioralFeature-ownedParameter"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9I8Nq86EdiEh75YJ_3n8g", "BehavioralFeature-raisedException"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9I8Oa86EdiEh75YJ_3n8g", "BehavioralFeature-isAbstract"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9I8O686EdiEh75YJ_3n8g", "BehavioralFeature-method"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9I8Pq86EdiEh75YJ_3n8g", "BehavioralFeature-concurrency"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4AsXcenEdm17tz62ORDiA", "_ownedMember.118"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4AsXsenEdm17tz62ORDiA", "_ownedMember.118-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4AsX8enEdm17tz62ORDiA", "_ownedMember.119"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4AsYMenEdm17tz62ORDiA", "_ownedMember.119-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4AsYcenEdm17tz62ORDiA", "_ownedMember.120"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4AsYsenEdm17tz62ORDiA", "_ownedMember.120-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4AsY8enEdm17tz62ORDiA", "_ownedMember.121"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4AsZMenEdm17tz62ORDiA", "_ownedMember.121-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4AsZcenEdm17tz62ORDiA", "_ownedMember.122"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9I8Ua86EdiEh75YJ_3n8g", "Behavior"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9I8U686EdiEh75YJ_3n8g", "Behavior-isReentrant"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9I8Va86EdiEh75YJ_3n8g", "Behavior-context"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9I8V686EdiEh75YJ_3n8g", "Behavior-redefinedBehavior"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9I8Wq86EdiEh75YJ_3n8g", "Behavior-ownedParameter"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9I8Xa86EdiEh75YJ_3n8g", "Behavior-ownedParameter"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9I8YK86EdiEh75YJ_3n8g", "Behavior-ownedParameter"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9I8Y686EdiEh75YJ_3n8g", "Behavior-precondition"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9I8Zq86EdiEh75YJ_3n8g", "Behavior-postcondition"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9I8aa86EdiEh75YJ_3n8g", "Behavior-ownedParameterSet"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9I8bK86EdiEh75YJ_3n8g", "Behavior-specification"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4AsjcenEdm17tz62ORDiA", "_ownedMember.124"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4AsjsenEdm17tz62ORDiA", "_ownedMember.125"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Asj8enEdm17tz62ORDiA", "_ownedMember.125-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4AskMenEdm17tz62ORDiA", "_ownedMember.126"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4AskcenEdm17tz62ORDiA", "_ownedMember.126-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4AsksenEdm17tz62ORDiA", "_ownedMember.127"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Ask8enEdm17tz62ORDiA", "_ownedMember.127-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4AslMenEdm17tz62ORDiA", "_ownedMember.128"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4AslcenEdm17tz62ORDiA", "_ownedMember.128-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4AslsenEdm17tz62ORDiA", "_ownedMember.129"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Asl8enEdm17tz62ORDiA", "_ownedMember.129-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4AsmMenEdm17tz62ORDiA", "_ownedMember.130"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4AsmcenEdm17tz62ORDiA", "_ownedMember.130-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4AsmsenEdm17tz62ORDiA", "_ownedMember.131"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Asm8enEdm17tz62ORDiA", "_ownedMember.131-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9PCoK86EdiEh75YJ_3n8g", "ParameterSet"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9PCoq86EdiEh75YJ_3n8g", "ParameterSet-parameter"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9PCpK86EdiEh75YJ_3n8g", "ParameterSet-condition"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Aso8enEdm17tz62ORDiA", "_ownedMember.133"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4AspMenEdm17tz62ORDiA", "_ownedMember.134"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4AspcenEdm17tz62ORDiA", "_ownedMember.134-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9PCrK86EdiEh75YJ_3n8g", "CallConcurrencyKind"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9PCra86EdiEh75YJ_3n8g", "CallConcurrencyKind-sequential"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9PCrq86EdiEh75YJ_3n8g", "CallConcurrencyKind-guarded"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9PCr686EdiEh75YJ_3n8g", "CallConcurrencyKind-concurrent"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4AsqsenEdm17tz62ORDiA", "_ownedMember.136"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9PCsa86EdiEh75YJ_3n8g", "DataType"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9PCs686EdiEh75YJ_3n8g", "DataType-ownedAttribute"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9PCtq86EdiEh75YJ_3n8g", "DataType-ownedOperation"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Ass8enEdm17tz62ORDiA", "_ownedMember.138"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4AstMenEdm17tz62ORDiA", "_ownedMember.139"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4AstcenEdm17tz62ORDiA", "_ownedMember.140"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4AstsenEdm17tz62ORDiA", "_ownedMember.140-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Ast8enEdm17tz62ORDiA", "_ownedMember.141"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4AsuMenEdm17tz62ORDiA", "_ownedMember.141-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4AsucenEdm17tz62ORDiA", "_ownedMember.142"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4AsusenEdm17tz62ORDiA", "_ownedMember.142-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Asu8enEdm17tz62ORDiA", "_ownedMember.143"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4AsvMenEdm17tz62ORDiA", "_ownedMember.143-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4AsvcenEdm17tz62ORDiA", "_ownedMember.144"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9PCza86EdiEh75YJ_3n8g", "ParameterDirectionKind"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9PCzq86EdiEh75YJ_3n8g", "ParameterDirectionKind-in"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9PCz686EdiEh75YJ_3n8g", "ParameterDirectionKind-inout"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9PC0K86EdiEh75YJ_3n8g", "ParameterDirectionKind-out"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9PC0a86EdiEh75YJ_3n8g", "ParameterDirectionKind-return"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Asw8enEdm17tz62ORDiA", "_ownedMember.146"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4AsxMenEdm17tz62ORDiA", "_ownedMember.146-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9PC1K86EdiEh75YJ_3n8g", "ParameterEffectKind"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9PC1a86EdiEh75YJ_3n8g", "ParameterEffectKind-create"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9PC1q86EdiEh75YJ_3n8g", "ParameterEffectKind-read"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9PC1686EdiEh75YJ_3n8g", "ParameterEffectKind-update"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9PC2K86EdiEh75YJ_3n8g", "ParameterEffectKind-delete"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4AsysenEdm17tz62ORDiA", "_ownedMember.148"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Asy8enEdm17tz62ORDiA", "_ownedMember.148-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4AszMenEdm17tz62ORDiA", "_ownedMember.149"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4AszcenEdm17tz62ORDiA", "_ownedMember.149-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4AszsenEdm17tz62ORDiA", "_ownedMember.150"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Asz8enEdm17tz62ORDiA", "_ownedMember.150-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4As0MenEdm17tz62ORDiA", "_ownedMember.151"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4As0cenEdm17tz62ORDiA", "_ownedMember.151-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4As0senEdm17tz62ORDiA", "_ownedMember.152"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4As08enEdm17tz62ORDiA", "_ownedMember.152-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4As1MenEdm17tz62ORDiA", "_ownedMember.153"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4As1cenEdm17tz62ORDiA", "_ownedMember.153-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4As1senEdm17tz62ORDiA", "_ownedMember.154"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4As18enEdm17tz62ORDiA", "_ownedMember.154-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9VJSq86EdiEh75YJ_3n8g", "Association"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9VJTa86EdiEh75YJ_3n8g", "Association-isDerived"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9VJT686EdiEh75YJ_3n8g", "Association-endType"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9VJUa86EdiEh75YJ_3n8g", "Association-memberEnd"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9VJVK86EdiEh75YJ_3n8g", "Association-ownedEnd"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4As5senEdm17tz62ORDiA", "_ownedMember.156"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4As58enEdm17tz62ORDiA", "_ownedMember.156-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4As6MenEdm17tz62ORDiA", "_ownedMember.157"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4As6cenEdm17tz62ORDiA", "_ownedMember.158"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4As6senEdm17tz62ORDiA", "_ownedMember.159"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4As68enEdm17tz62ORDiA", "_ownedMember.159-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4As7MenEdm17tz62ORDiA", "_ownedMember.160"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4As7cenEdm17tz62ORDiA", "_ownedMember.160-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9VJZ686EdiEh75YJ_3n8g", "AggregationKind"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9VJaK86EdiEh75YJ_3n8g", "AggregationKind-none"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9VJaa86EdiEh75YJ_3n8g", "AggregationKind-shared"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9VJaq86EdiEh75YJ_3n8g", "AggregationKind-composite"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4As8senEdm17tz62ORDiA", "_ownedMember.162"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4As88enEdm17tz62ORDiA", "_ownedMember.162-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4As9MenEdm17tz62ORDiA", "_ownedMember.163"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4As9cenEdm17tz62ORDiA", "_ownedMember.164"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4As9senEdm17tz62ORDiA", "_ownedMember.164-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4As98enEdm17tz62ORDiA", "_ownedMember.165"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9VJca86EdiEh75YJ_3n8g", "Substitution"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9VJc686EdiEh75YJ_3n8g", "Substitution-contract"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9VJdK86EdiEh75YJ_3n8g", "Substitution-substitutingClassifier"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9VJfa86EdiEh75YJ_3n8g", "Realization"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9VJf686EdiEh75YJ_3n8g", "ComponentRealization-abstraction"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9VJga86EdiEh75YJ_3n8g", "ComponentRealization-realizingClassifier"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9VJjK86EdiEh75YJ_3n8g", "Component"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9VJjq86EdiEh75YJ_3n8g", "Component-isIndirectlyInstantiated"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9VJkK86EdiEh75YJ_3n8g", "Component-required"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9VJk686EdiEh75YJ_3n8g", "Component-provided"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9VJlq86EdiEh75YJ_3n8g", "Component-packagedElement"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9VJma86EdiEh75YJ_3n8g", "Component-realization"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4AtGcenEdm17tz62ORDiA", "_ownedMember.169"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4AtGsenEdm17tz62ORDiA", "_ownedMember.169-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9VJoq86EdiEh75YJ_3n8g", "Interface"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9VJpK86EdiEh75YJ_3n8g", "Interface-ownedAttribute"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9VJp686EdiEh75YJ_3n8g", "Interface-ownedOperation"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9VJqq86EdiEh75YJ_3n8g", "Interface-redefinedInterface"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9VJra86EdiEh75YJ_3n8g", "Interface-nestedClassifier"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9VJsK86EdiEh75YJ_3n8g", "Interface-ownedReception"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9VJs686EdiEh75YJ_3n8g", "Interface-protocol"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4AtLsenEdm17tz62ORDiA", "_ownedMember.171"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4AtL8enEdm17tz62ORDiA", "_ownedMember.171-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4AtMMenEdm17tz62ORDiA", "_ownedMember.172"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4AtMcenEdm17tz62ORDiA", "_ownedMember.172-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4AtMsenEdm17tz62ORDiA", "_ownedMember.173"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4AtM8enEdm17tz62ORDiA", "_ownedMember.173-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4AtNMenEdm17tz62ORDiA", "_ownedMember.174"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4AtNcenEdm17tz62ORDiA", "_ownedMember.174-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4AtNsenEdm17tz62ORDiA", "_ownedMember.175"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4AtN8enEdm17tz62ORDiA", "_ownedMember.175-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9VJx686EdiEh75YJ_3n8g", "Reception"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9VJya86EdiEh75YJ_3n8g", "Reception-signal"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4AtPMenEdm17tz62ORDiA", "_ownedMember.177"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4AtPcenEdm17tz62ORDiA", "_ownedMember.177-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9VJza86EdiEh75YJ_3n8g", "Signal"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9VJz686EdiEh75YJ_3n8g", "Signal-ownedAttribute"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4AtQ8enEdm17tz62ORDiA", "_ownedMember.179"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4AtRMenEdm17tz62ORDiA", "_ownedMember.179-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4AtRcenEdm17tz62ORDiA", "_ownedMember.180"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4AtRsenEdm17tz62ORDiA", "_ownedMember.180-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9VJ2q86EdiEh75YJ_3n8g", "ProtocolStateMachine"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9VJ3K86EdiEh75YJ_3n8g", "ProtocolStateMachine-conformance"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9VJ4a86EdiEh75YJ_3n8g", "StateMachine"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9VJ4686EdiEh75YJ_3n8g", "StateMachine-region"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9VJ5a86EdiEh75YJ_3n8g", "StateMachine-connectionPoint"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9VJ6K86EdiEh75YJ_3n8g", "StateMachine-extendedStateMachine"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_m9VJ6q86EdiEh75YJ_3n8g", "StateMachine-stateMachine_redefinitionContext"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4AtWcenEdm17tz62ORDiA", "_ownedMember.183"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9VJ8686EdiEh75YJ_3n8g", "Region"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9VJ9q86EdiEh75YJ_3n8g", "Region-subvertex"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9VJ-a86EdiEh75YJ_3n8g", "Region-transition"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9VJ_K86EdiEh75YJ_3n8g", "Region-state"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9VJ_q86EdiEh75YJ_3n8g", "Region-extendedRegion"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9VKAK86EdiEh75YJ_3n8g", "Region-stateMachine"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4AtbcenEdm17tz62ORDiA", "_ownedMember.185"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9VKC686EdiEh75YJ_3n8g", "Vertex"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9VKDa86EdiEh75YJ_3n8g", "Vertex-outgoing"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9VKEK86EdiEh75YJ_3n8g", "Vertex-incoming"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9VKE686EdiEh75YJ_3n8g", "Vertex-container"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4AtesenEdm17tz62ORDiA", "_ownedMember.187"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9VKGK86EdiEh75YJ_3n8g", "Transition"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9VKGq86EdiEh75YJ_3n8g", "Transition-kind"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9VKHK86EdiEh75YJ_3n8g", "Transition-container"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9VKHa86EdiEh75YJ_3n8g", "Transition-target"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9VKHq86EdiEh75YJ_3n8g", "Transition-redefinedTransition"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9VKIK86EdiEh75YJ_3n8g", "Transition-trigger"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9VKI686EdiEh75YJ_3n8g", "Transition-guard"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9VKJa86EdiEh75YJ_3n8g", "Transition-effect"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9VKJ686EdiEh75YJ_3n8g", "Transition-source"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9VKMK86EdiEh75YJ_3n8g", "TransitionKind"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9VKMa86EdiEh75YJ_3n8g", "TransitionKind-internal"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9VKMq86EdiEh75YJ_3n8g", "TransitionKind-local"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9VKM686EdiEh75YJ_3n8g", "TransitionKind-external"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4AtkcenEdm17tz62ORDiA", "_ownedMember.190"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4AtksenEdm17tz62ORDiA", "_ownedMember.191"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Atk8enEdm17tz62ORDiA", "_ownedMember.192"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4AtlMenEdm17tz62ORDiA", "_ownedMember.192-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4AtlcenEdm17tz62ORDiA", "_ownedMember.193"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4AtlsenEdm17tz62ORDiA", "_ownedMember.193-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9VKOq86EdiEh75YJ_3n8g", "Trigger"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9VKPK86EdiEh75YJ_3n8g", "Trigger-port"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4AtnMenEdm17tz62ORDiA", "_ownedMember.195"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4AtncenEdm17tz62ORDiA", "_ownedMember.195-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9VKQa86EdiEh75YJ_3n8g", "Port"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9VKQ686EdiEh75YJ_3n8g", "Port-isBehavior"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9VKRa86EdiEh75YJ_3n8g", "Port-isService"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9VKR686EdiEh75YJ_3n8g", "Port-required"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9VKSq86EdiEh75YJ_3n8g", "Port-redefinedPort"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9VKTa86EdiEh75YJ_3n8g", "Port-provided"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9VKUK86EdiEh75YJ_3n8g", "Port-protocol"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Ats8enEdm17tz62ORDiA", "_ownedMember.197"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4AttMenEdm17tz62ORDiA", "_ownedMember.197-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4AttcenEdm17tz62ORDiA", "_ownedMember.198"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4AttsenEdm17tz62ORDiA", "_ownedMember.198-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Att8enEdm17tz62ORDiA", "_ownedMember.199"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4AtuMenEdm17tz62ORDiA", "_ownedMember.199-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4AtucenEdm17tz62ORDiA", "_ownedMember.200"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4AtusenEdm17tz62ORDiA", "_ownedMember.200-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Atu8enEdm17tz62ORDiA", "_ownedMember.201"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4AtvMenEdm17tz62ORDiA", "_ownedMember.201-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4AtvcenEdm17tz62ORDiA", "_ownedMember.202"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4AtvsenEdm17tz62ORDiA", "_ownedMember.202-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9VKYK86EdiEh75YJ_3n8g", "Activity"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9VKYq86EdiEh75YJ_3n8g", "OpaqueBehavior-body"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9VKZK86EdiEh75YJ_3n8g", "OpaqueBehavior-language"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9VKZq86EdiEh75YJ_3n8g", "Activity-edge"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9VKaa86EdiEh75YJ_3n8g", "Activity-group"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9VKbK86EdiEh75YJ_3n8g", "Activity-node"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9VKb686EdiEh75YJ_3n8g", "Activity-node"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9VKcq86EdiEh75YJ_3n8g", "Activity-structuredNode"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9VKda86EdiEh75YJ_3n8g", "Activity-isSingleExecution"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9VKd686EdiEh75YJ_3n8g", "Activity-isReadOnly"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KcbMenEdm17tz62ORDiA", "_ownedMember.204"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9VKfK86EdiEh75YJ_3n8g", "ActivityEdge"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9VKfq86EdiEh75YJ_3n8g", "ActivityEdge-source"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9VKf686EdiEh75YJ_3n8g", "ActivityEdge-target"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9VKgK86EdiEh75YJ_3n8g", "ActivityEdge-inStructuredNode"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9VKgq86EdiEh75YJ_3n8g", "ActivityEdge-inPartition"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9VKha86EdiEh75YJ_3n8g", "ActivityEdge-interrupts"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9VKh686EdiEh75YJ_3n8g", "ActivityEdge-inGroup"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9VKiq86EdiEh75YJ_3n8g", "ActivityEdge-guard"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9VKi686EdiEh75YJ_3n8g", "ActivityEdge-redefinedEdge"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9VKjq86EdiEh75YJ_3n8g", "ActivityEdge-weight"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9VKj686EdiEh75YJ_3n8g", "ActivityEdge-activity"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KciMenEdm17tz62ORDiA", "_ownedMember.206"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9VKlq86EdiEh75YJ_3n8g", "ActivityNode"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9VKmK86EdiEh75YJ_3n8g", "ActivityNode-incoming"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9VKm686EdiEh75YJ_3n8g", "ActivityNode-inGroup"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9VKnq86EdiEh75YJ_3n8g", "ActivityNode-activity"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9VKoK86EdiEh75YJ_3n8g", "ActivityNode-redefinedNode"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9VKo686EdiEh75YJ_3n8g", "ActivityNode-inStructuredNode"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9VKpa86EdiEh75YJ_3n8g", "ActivityNode-inPartition"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9VKqK86EdiEh75YJ_3n8g", "ActivityNode-inInterruptibleRegion"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9VKq686EdiEh75YJ_3n8g", "ActivityNode-outgoing"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Kcp8enEdm17tz62ORDiA", "_ownedMember.208"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KcqMenEdm17tz62ORDiA", "_ownedMember.209"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KcqcenEdm17tz62ORDiA", "_ownedMember.209-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9VKs686EdiEh75YJ_3n8g", "ActivityGroup"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9VKta86EdiEh75YJ_3n8g", "ActivityGroup-superGroup"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9VKt686EdiEh75YJ_3n8g", "ActivityGroup-inActivity"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KctMenEdm17tz62ORDiA", "_ownedMember.211"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KctcenEdm17tz62ORDiA", "_ownedMember.211-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KctsenEdm17tz62ORDiA", "_ownedMember.212"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Kct8enEdm17tz62ORDiA", "_ownedMember.213"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KcuMenEdm17tz62ORDiA", "_ownedMember.214"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KcucenEdm17tz62ORDiA", "_ownedMember.214-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9VKza86EdiEh75YJ_3n8g", "StructuredActivityNode"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9VK0a86EdiEh75YJ_3n8g", "StructuredActivityNode-variable"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9VK1K86EdiEh75YJ_3n8g", "StructuredActivityNode-edge"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9VK1686EdiEh75YJ_3n8g", "StructuredActivityNode-mustIsolate"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9VK2a86EdiEh75YJ_3n8g", "StructuredActivityNode-node"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9VK5q86EdiEh75YJ_3n8g", "Action"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_m9VK6K86EdiEh75YJ_3n8g", "Action-effect"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9VK6q86EdiEh75YJ_3n8g", "Action-output"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9VK7a86EdiEh75YJ_3n8g", "Action-input"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9VK8K86EdiEh75YJ_3n8g", "Action-context"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9VK8q86EdiEh75YJ_3n8g", "Action-localPrecondition"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9VK9a86EdiEh75YJ_3n8g", "Action-localPostcondition"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9VK-q86EdiEh75YJ_3n8g", "ExecutableNode"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9VK_K86EdiEh75YJ_3n8g", "ExecutableNode-handler"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Kc5senEdm17tz62ORDiA", "_ownedMember.218"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9VLAq86EdiEh75YJ_3n8g", "ExceptionHandler"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9VLBK86EdiEh75YJ_3n8g", "ExceptionHandler-handlerBody"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9VLBa86EdiEh75YJ_3n8g", "ExceptionHandler-exceptionInput"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9VLBq86EdiEh75YJ_3n8g", "ExceptionHandler-exceptionType"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9VLCK86EdiEh75YJ_3n8g", "ExceptionHandler-protectedNode"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Kc8MenEdm17tz62ORDiA", "_ownedMember.220"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Kc8cenEdm17tz62ORDiA", "_ownedMember.220-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Kc8senEdm17tz62ORDiA", "_ownedMember.221"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Kc88enEdm17tz62ORDiA", "_ownedMember.221-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9VLD686EdiEh75YJ_3n8g", "ObjectNode"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9VLEq86EdiEh75YJ_3n8g", "ObjectNode-ordering"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9bP4a86EdiEh75YJ_3n8g", "ObjectNode-upperBound"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9bP4q86EdiEh75YJ_3n8g", "ObjectNode-inState"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9bP5a86EdiEh75YJ_3n8g", "ObjectNode-selection"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9bP6a86EdiEh75YJ_3n8g", "ObjectNodeOrderingKind"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9bP6q86EdiEh75YJ_3n8g", "ObjectNodeOrderingKind-unordered"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9bP6686EdiEh75YJ_3n8g", "ObjectNodeOrderingKind-ordered"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9bP7K86EdiEh75YJ_3n8g", "ObjectNodeOrderingKind-LIFO"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9bP7a86EdiEh75YJ_3n8g", "ObjectNodeOrderingKind-FIFO"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KdBMenEdm17tz62ORDiA", "_ownedMember.224"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KdBcenEdm17tz62ORDiA", "_ownedMember.224-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KdBsenEdm17tz62ORDiA", "_ownedMember.225"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KdB8enEdm17tz62ORDiA", "_ownedMember.225-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9bP8q86EdiEh75YJ_3n8g", "State"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9bP9q86EdiEh75YJ_3n8g", "State-isComposite"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9bP-K86EdiEh75YJ_3n8g", "State-isOrthogonal"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9bP-q86EdiEh75YJ_3n8g", "State-isSimple"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9bP_K86EdiEh75YJ_3n8g", "State-isSubmachineState"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9bP_q86EdiEh75YJ_3n8g", "State-submachine"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9bQAK86EdiEh75YJ_3n8g", "State-connection"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9bQA686EdiEh75YJ_3n8g", "State-redefinedState"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9bQBa86EdiEh75YJ_3n8g", "State-deferrableTrigger"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9bQCK86EdiEh75YJ_3n8g", "State-region"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9bQC686EdiEh75YJ_3n8g", "State-entry"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9bQDa86EdiEh75YJ_3n8g", "State-exit"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9bQD686EdiEh75YJ_3n8g", "State-doActivity"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9bQEa86EdiEh75YJ_3n8g", "State-stateInvariant"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KdMcenEdm17tz62ORDiA", "_ownedMember.227"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KdMsenEdm17tz62ORDiA", "_ownedMember.227-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KdM8enEdm17tz62ORDiA", "_ownedMember.228"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KdNMenEdm17tz62ORDiA", "_ownedMember.228-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9bQH686EdiEh75YJ_3n8g", "ConnectionPointReference"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9bQIa86EdiEh75YJ_3n8g", "ConnectionPointReference-entry"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9bQJK86EdiEh75YJ_3n8g", "ConnectionPointReference-exit"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KdPcenEdm17tz62ORDiA", "_ownedMember.230"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KdPsenEdm17tz62ORDiA", "_ownedMember.230-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9bQKa86EdiEh75YJ_3n8g", "Pseudostate"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9bQK686EdiEh75YJ_3n8g", "Pseudostate-kind"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9bQLa86EdiEh75YJ_3n8g", "PseudostateKind"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9bQLq86EdiEh75YJ_3n8g", "PseudostateKind-initial"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9bQL686EdiEh75YJ_3n8g", "PseudostateKind-deepHistory"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9bQMK86EdiEh75YJ_3n8g", "PseudostateKind-shallowHistory"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9bQMa86EdiEh75YJ_3n8g", "PseudostateKind-join"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9bQMq86EdiEh75YJ_3n8g", "PseudostateKind-fork"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9bQM686EdiEh75YJ_3n8g", "PseudostateKind-junction"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9bQNK86EdiEh75YJ_3n8g", "PseudostateKind-choice"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9bQNa86EdiEh75YJ_3n8g", "PseudostateKind-entryPoint"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9bQNq86EdiEh75YJ_3n8g", "PseudostateKind-exitPoint"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9bQN686EdiEh75YJ_3n8g", "PseudostateKind-terminate"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KdTsenEdm17tz62ORDiA", "_ownedMember.233"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KdT8enEdm17tz62ORDiA", "_ownedMember.233-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KdUMenEdm17tz62ORDiA", "_ownedMember.234"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KdUcenEdm17tz62ORDiA", "_ownedMember.234-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KdUsenEdm17tz62ORDiA", "_ownedMember.235"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KdU8enEdm17tz62ORDiA", "_ownedMember.235-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KdVMenEdm17tz62ORDiA", "_ownedMember.236"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KdVcenEdm17tz62ORDiA", "_ownedMember.237"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KdVsenEdm17tz62ORDiA", "_ownedMember.237-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KdV8enEdm17tz62ORDiA", "_ownedMember.238"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KdWMenEdm17tz62ORDiA", "_ownedMember.238-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KdWcenEdm17tz62ORDiA", "_ownedMember.239"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KdWsenEdm17tz62ORDiA", "_ownedMember.239-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KdW8enEdm17tz62ORDiA", "_ownedMember.240"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KdXMenEdm17tz62ORDiA", "_ownedMember.240-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KdXcenEdm17tz62ORDiA", "_ownedMember.241"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KdXsenEdm17tz62ORDiA", "_ownedMember.241-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KdX8enEdm17tz62ORDiA", "_ownedMember.242"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KdYMenEdm17tz62ORDiA", "_ownedMember.242-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KdYcenEdm17tz62ORDiA", "_ownedMember.243"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KdYsenEdm17tz62ORDiA", "_ownedMember.243-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9bQTa86EdiEh75YJ_3n8g", "OutputPin"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9bQT686EdiEh75YJ_3n8g", "Pin"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KdaMenEdm17tz62ORDiA", "_ownedMember.246"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KdacenEdm17tz62ORDiA", "_ownedMember.246-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9bQVK86EdiEh75YJ_3n8g", "InputPin"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KdbMenEdm17tz62ORDiA", "_ownedMember.248"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KdbcenEdm17tz62ORDiA", "_ownedMember.248-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KdbsenEdm17tz62ORDiA", "_ownedMember.249"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Kdb8enEdm17tz62ORDiA", "_ownedMember.249-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KdcMenEdm17tz62ORDiA", "_ownedMember.250"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KdccenEdm17tz62ORDiA", "_ownedMember.250-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KdcsenEdm17tz62ORDiA", "_ownedMember.251"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9bQXa86EdiEh75YJ_3n8g", "Variable"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9bQYa86EdiEh75YJ_3n8g", "Variable-scope"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KdesenEdm17tz62ORDiA", "_ownedMember.253"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Kde8enEdm17tz62ORDiA", "_ownedMember.254"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KdfMenEdm17tz62ORDiA", "_ownedMember.255"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9bQZ686EdiEh75YJ_3n8g", "ActivityPartition"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9bQaq86EdiEh75YJ_3n8g", "ActivityPartition-isDimension"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9bQbK86EdiEh75YJ_3n8g", "ActivityPartition-isExternal"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9bQbq86EdiEh75YJ_3n8g", "ActivityPartition-edge"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9bQca86EdiEh75YJ_3n8g", "ActivityPartition-subpartition"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9bQdK86EdiEh75YJ_3n8g", "ActivityPartition-superPartition"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9bQdq86EdiEh75YJ_3n8g", "ActivityPartition-represents"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9bQeK86EdiEh75YJ_3n8g", "ActivityPartition-node"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Kdk8enEdm17tz62ORDiA", "_ownedMember.257"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KdlMenEdm17tz62ORDiA", "_ownedMember.258"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KdlcenEdm17tz62ORDiA", "_ownedMember.259"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KdlsenEdm17tz62ORDiA", "_ownedMember.259-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Kdl8enEdm17tz62ORDiA", "_ownedMember.260"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9bQgq86EdiEh75YJ_3n8g", "InterruptibleActivityRegion"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9bQhK86EdiEh75YJ_3n8g", "InterruptibleActivityRegion-interruptingEdge"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9bQh686EdiEh75YJ_3n8g", "InterruptibleActivityRegion-node"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KdoMenEdm17tz62ORDiA", "_ownedMember.262"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KdocenEdm17tz62ORDiA", "_ownedMember.263"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KdosenEdm17tz62ORDiA", "_ownedMember.263-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Kdo8enEdm17tz62ORDiA", "_ownedMember.264"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KdpMenEdm17tz62ORDiA", "_ownedMember.264-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KdpcenEdm17tz62ORDiA", "_ownedMember.265"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KdpsenEdm17tz62ORDiA", "_ownedMember.265-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Kdp8enEdm17tz62ORDiA", "_ownedMember.266"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KdqMenEdm17tz62ORDiA", "_ownedMember.266-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KdqcenEdm17tz62ORDiA", "_ownedMember.267"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KdqsenEdm17tz62ORDiA", "_ownedMember.267-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Kdq8enEdm17tz62ORDiA", "_ownedMember.268"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KdrMenEdm17tz62ORDiA", "_ownedMember.268-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KdrcenEdm17tz62ORDiA", "_ownedMember.269"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KdrsenEdm17tz62ORDiA", "_ownedMember.269-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Kdr8enEdm17tz62ORDiA", "_ownedMember.270"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KdsMenEdm17tz62ORDiA", "_ownedMember.270-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KdscenEdm17tz62ORDiA", "_ownedMember.271"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KdssenEdm17tz62ORDiA", "_ownedMember.271-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Kds8enEdm17tz62ORDiA", "_ownedMember.272"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KdtMenEdm17tz62ORDiA", "_ownedMember.273"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9bQn686EdiEh75YJ_3n8g", "ProtocolConformance"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9bQoa86EdiEh75YJ_3n8g", "ProtocolConformance-generalMachine"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9bQoq86EdiEh75YJ_3n8g", "ProtocolConformance-specificMachine"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Kdu8enEdm17tz62ORDiA", "_ownedMember.275"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KdvMenEdm17tz62ORDiA", "_ownedMember.275-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KdvcenEdm17tz62ORDiA", "_ownedMember.276"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KdvsenEdm17tz62ORDiA", "_ownedMember.276-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Kdv8enEdm17tz62ORDiA", "_ownedMember.277"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KdwMenEdm17tz62ORDiA", "_ownedMember.277-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KdwcenEdm17tz62ORDiA", "_ownedMember.278"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KdwsenEdm17tz62ORDiA", "_ownedMember.279"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Kdw8enEdm17tz62ORDiA", "_ownedMember.279-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KdxMenEdm17tz62ORDiA", "_ownedMember.280"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KdxcenEdm17tz62ORDiA", "_ownedMember.280-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KdxsenEdm17tz62ORDiA", "_ownedMember.281"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Kdx8enEdm17tz62ORDiA", "_ownedMember.281-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9bQtq86EdiEh75YJ_3n8g", "UseCase"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9bQuK86EdiEh75YJ_3n8g", "UseCase-include"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9bQu686EdiEh75YJ_3n8g", "UseCase-extend"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9bQvq86EdiEh75YJ_3n8g", "UseCase-extensionPoint"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9bQwa86EdiEh75YJ_3n8g", "UseCase-subject"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Kd1senEdm17tz62ORDiA", "_ownedMember.283"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9bQx686EdiEh75YJ_3n8g", "Include"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9bQyq86EdiEh75YJ_3n8g", "Include-addition"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9bQy686EdiEh75YJ_3n8g", "Include-includingCase"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Kd3senEdm17tz62ORDiA", "_ownedMember.285"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Kd38enEdm17tz62ORDiA", "_ownedMember.285-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Kd4MenEdm17tz62ORDiA", "_ownedMember.286"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9bQ0686EdiEh75YJ_3n8g", "Extend"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9bQ1q86EdiEh75YJ_3n8g", "Extend-extendedCase"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9bQ1686EdiEh75YJ_3n8g", "Extend-condition"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9bQ2a86EdiEh75YJ_3n8g", "Extend-extensionLocation"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9bQ2686EdiEh75YJ_3n8g", "Extend-extension"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Kd7MenEdm17tz62ORDiA", "_ownedMember.288"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Kd7cenEdm17tz62ORDiA", "_ownedMember.288-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Kd7senEdm17tz62ORDiA", "_ownedMember.289"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Kd78enEdm17tz62ORDiA", "_ownedMember.289-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Kd8MenEdm17tz62ORDiA", "_ownedMember.290"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Kd8cenEdm17tz62ORDiA", "_ownedMember.290-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9bQ6K86EdiEh75YJ_3n8g", "ExtensionPoint"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9bQ6q86EdiEh75YJ_3n8g", "ExtensionPoint-useCase"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Kd98enEdm17tz62ORDiA", "_ownedMember.292"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Kd-MenEdm17tz62ORDiA", "_ownedMember.293"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Kd-cenEdm17tz62ORDiA", "_ownedMember.294"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Kd-senEdm17tz62ORDiA", "_ownedMember.294-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9bQ7686EdiEh75YJ_3n8g", "CollaborationUse"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9bQ8a86EdiEh75YJ_3n8g", "CollaborationUse-type"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9bQ8q86EdiEh75YJ_3n8g", "CollaborationUse-roleBinding"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KeAcenEdm17tz62ORDiA", "_ownedMember.296"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KeAsenEdm17tz62ORDiA", "_ownedMember.296-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9bQ-a86EdiEh75YJ_3n8g", "Collaboration"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9bQ_K86EdiEh75YJ_3n8g", "Collaboration-collaborationRole"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9bRAa86EdiEh75YJ_3n8g", "StructuredClassifier"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9bRA686EdiEh75YJ_3n8g", "StructuredClassifier-ownedAttribute"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9bRBq86EdiEh75YJ_3n8g", "StructuredClassifier-part"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9bRCa86EdiEh75YJ_3n8g", "StructuredClassifier-role"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9bRDK86EdiEh75YJ_3n8g", "StructuredClassifier-ownedConnector"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KeG8enEdm17tz62ORDiA", "_ownedMember.299"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KeHMenEdm17tz62ORDiA", "_ownedMember.299-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KeHcenEdm17tz62ORDiA", "_ownedMember.300"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KeHsenEdm17tz62ORDiA", "_ownedMember.300-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KeH8enEdm17tz62ORDiA", "_ownedMember.301"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KeIMenEdm17tz62ORDiA", "_ownedMember.301-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KeIcenEdm17tz62ORDiA", "_ownedMember.302"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KeIsenEdm17tz62ORDiA", "_ownedMember.302-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9bRH686EdiEh75YJ_3n8g", "Connector"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9bRIa86EdiEh75YJ_3n8g", "Connector-type"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9bRI686EdiEh75YJ_3n8g", "Connector-redefinedConnector"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9bRJq86EdiEh75YJ_3n8g", "Connector-end"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9bRKa86EdiEh75YJ_3n8g", "Connector-kind"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9bRK686EdiEh75YJ_3n8g", "Connector-contract"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KeMsenEdm17tz62ORDiA", "_ownedMember.304"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KeM8enEdm17tz62ORDiA", "_ownedMember.304-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KeNMenEdm17tz62ORDiA", "_ownedMember.305"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KeNcenEdm17tz62ORDiA", "_ownedMember.305-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KeNsenEdm17tz62ORDiA", "_ownedMember.306"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KeN8enEdm17tz62ORDiA", "_ownedMember.306-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9bROK86EdiEh75YJ_3n8g", "ConnectorKind"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9bROa86EdiEh75YJ_3n8g", "ConnectorKind-assembly"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9bROq86EdiEh75YJ_3n8g", "ConnectorKind-delegation"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KeO8enEdm17tz62ORDiA", "_ownedMember.308"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KePMenEdm17tz62ORDiA", "_ownedMember.308-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KePcenEdm17tz62ORDiA", "_ownedMember.309"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KePsenEdm17tz62ORDiA", "_ownedMember.309-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KeP8enEdm17tz62ORDiA", "_ownedMember.310"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KeQMenEdm17tz62ORDiA", "_ownedMember.310-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KeQcenEdm17tz62ORDiA", "_ownedMember.311"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KeQsenEdm17tz62ORDiA", "_ownedMember.311-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KeQ8enEdm17tz62ORDiA", "_ownedMember.312"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KeRMenEdm17tz62ORDiA", "_ownedMember.312-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KeRcenEdm17tz62ORDiA", "_ownedMember.313"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9bRRq86EdiEh75YJ_3n8g", "InterfaceRealization"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9bRSK86EdiEh75YJ_3n8g", "InterfaceRealization-contract"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9bRSa86EdiEh75YJ_3n8g", "InterfaceRealization-implementingClassifier"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KeTMenEdm17tz62ORDiA", "_ownedMember.315"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KeTcenEdm17tz62ORDiA", "_ownedMember.315-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KeTsenEdm17tz62ORDiA", "_ownedMember.316"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KeT8enEdm17tz62ORDiA", "_ownedMember.316-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9bRVq86EdiEh75YJ_3n8g", "EncapsulatedClassifier"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9bRWK86EdiEh75YJ_3n8g", "EncapsulatedClassifier-ownedPort"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KeVcenEdm17tz62ORDiA", "_ownedMember.318"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KeVsenEdm17tz62ORDiA", "_ownedMember.318-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KeV8enEdm17tz62ORDiA", "_ownedMember.319"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KeWMenEdm17tz62ORDiA", "_ownedMember.319-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KeWcenEdm17tz62ORDiA", "_ownedMember.320"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9bRZq86EdiEh75YJ_3n8g", "Extension"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9bRaK86EdiEh75YJ_3n8g", "Extension-isRequired"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9bRaq86EdiEh75YJ_3n8g", "Extension-metaclass"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KeY8enEdm17tz62ORDiA", "_ownedMember.322"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KeZMenEdm17tz62ORDiA", "_ownedMember.322-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KeZcenEdm17tz62ORDiA", "_ownedMember.323"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KeZsenEdm17tz62ORDiA", "_ownedMember.323-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KeZ8enEdm17tz62ORDiA", "_ownedMember.324"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KeaMenEdm17tz62ORDiA", "_ownedMember.324-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KeacenEdm17tz62ORDiA", "_ownedMember.325"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KeasenEdm17tz62ORDiA", "_ownedMember.325-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Kea8enEdm17tz62ORDiA", "_ownedMember.326"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KebMenEdm17tz62ORDiA", "_ownedMember.326-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KebcenEdm17tz62ORDiA", "_ownedMember.327"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KebsenEdm17tz62ORDiA", "_ownedMember.327-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Keb8enEdm17tz62ORDiA", "_ownedMember.328"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KecMenEdm17tz62ORDiA", "_ownedMember.328-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KeccenEdm17tz62ORDiA", "_ownedMember.329"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KecsenEdm17tz62ORDiA", "_ownedMember.329-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9bRs686EdiEh75YJ_3n8g", "Expression"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9bRta86EdiEh75YJ_3n8g", "Expression-symbol"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9bRt686EdiEh75YJ_3n8g", "Expression-operand"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KeesenEdm17tz62ORDiA", "_ownedMember.331"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Kee8enEdm17tz62ORDiA", "_ownedMember.331-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9bRea86EdiEh75YJ_3n8g", "Enumeration"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9bRe686EdiEh75YJ_3n8g", "Enumeration-ownedLiteral"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KegcenEdm17tz62ORDiA", "_ownedMember.333"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9bRga86EdiEh75YJ_3n8g", "EnumerationLiteral"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9bRg686EdiEh75YJ_3n8g", "EnumerationLiteral-enumeration"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9bRh686EdiEh75YJ_3n8g", "InstanceSpecification"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9bRi686EdiEh75YJ_3n8g", "InstanceSpecification-slot"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9bRjq86EdiEh75YJ_3n8g", "InstanceSpecification-classifier"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9bRka86EdiEh75YJ_3n8g", "InstanceSpecification-specification"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KelMenEdm17tz62ORDiA", "InstanceSpecification-slots_are_defined"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KelcenEdm17tz62ORDiA", "InstanceSpecification-slots_are_defined-_returnResult.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KelsenEdm17tz62ORDiA", "InstanceSpecification-slots_are_defined-diagnostics"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Kel8enEdm17tz62ORDiA", "InstanceSpecification-slots_are_defined-context"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KemMenEdm17tz62ORDiA", "InstanceSpecification-no_duplicate_slots"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KemcenEdm17tz62ORDiA", "InstanceSpecification-no_duplicate_slots-_returnResult.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KemsenEdm17tz62ORDiA", "InstanceSpecification-no_duplicate_slots-diagnostics"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Kem8enEdm17tz62ORDiA", "InstanceSpecification-no_duplicate_slots-context"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KenMenEdm17tz62ORDiA", "_ownedMember.336"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9bRnq86EdiEh75YJ_3n8g", "Slot"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9bRoK86EdiEh75YJ_3n8g", "Slot-value"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9bRo686EdiEh75YJ_3n8g", "Slot-definingFeature"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9bRpK86EdiEh75YJ_3n8g", "Slot-owningInstance"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KepsenEdm17tz62ORDiA", "_ownedMember.338"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Kep8enEdm17tz62ORDiA", "_ownedMember.338-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KeqMenEdm17tz62ORDiA", "_ownedMember.339"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KeqcenEdm17tz62ORDiA", "_ownedMember.339-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KeqsenEdm17tz62ORDiA", "_ownedMember.340"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Keq8enEdm17tz62ORDiA", "_ownedMember.340-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KerMenEdm17tz62ORDiA", "_ownedMember.341"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KercenEdm17tz62ORDiA", "_ownedMember.341-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9bRsa86EdiEh75YJ_3n8g", "PrimitiveType"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ndIK86EdiEh75YJ_3n8g", "LiteralBoolean"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ndIq86EdiEh75YJ_3n8g", "LiteralBoolean-value"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ndKK86EdiEh75YJ_3n8g", "LiteralSpecification"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ndKq86EdiEh75YJ_3n8g", "LiteralString"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ndLK86EdiEh75YJ_3n8g", "LiteralString-value"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ndMq86EdiEh75YJ_3n8g", "LiteralNull"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ndOK86EdiEh75YJ_3n8g", "LiteralInteger"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ndOq86EdiEh75YJ_3n8g", "LiteralInteger-value"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ndQK86EdiEh75YJ_3n8g", "LiteralUnlimitedNatural"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ndQq86EdiEh75YJ_3n8g", "LiteralUnlimitedNatural-value"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ndSK86EdiEh75YJ_3n8g", "InstanceValue"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ndSq86EdiEh75YJ_3n8g", "InstanceValue-instance"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Kex8enEdm17tz62ORDiA", "_ownedMember.350"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KeyMenEdm17tz62ORDiA", "_ownedMember.350-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ndTa86EdiEh75YJ_3n8g", "ExtensionEnd"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ndaa86EdiEh75YJ_3n8g", "Dependency"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9nda686EdiEh75YJ_3n8g", "Usage"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ndZq86EdiEh75YJ_3n8g", "AssociationClass"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ndU686EdiEh75YJ_3n8g", "InformationItem"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ndVa86EdiEh75YJ_3n8g", "InformationItem-represented"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Ke18enEdm17tz62ORDiA", "_ownedMember.356"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Ke2MenEdm17tz62ORDiA", "_ownedMember.356-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ndWq86EdiEh75YJ_3n8g", "InformationFlow"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ndXa86EdiEh75YJ_3n8g", "InformationFlow-realization"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ndYK86EdiEh75YJ_3n8g", "InformationFlow-conveyed"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Ke4cenEdm17tz62ORDiA", "_ownedMember.358"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Ke4senEdm17tz62ORDiA", "_ownedMember.358-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Ke48enEdm17tz62ORDiA", "_ownedMember.359"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Ke5MenEdm17tz62ORDiA", "_ownedMember.359-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ndba86EdiEh75YJ_3n8g", "Model"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ndb686EdiEh75YJ_3n8g", "Model-viewpoint"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ndc686EdiEh75YJ_3n8g", "ControlNode"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ndda86EdiEh75YJ_3n8g", "ControlFlow"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ndd686EdiEh75YJ_3n8g", "ObjectFlow"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ndea86EdiEh75YJ_3n8g", "ObjectFlow-isMulticast"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9nde686EdiEh75YJ_3n8g", "ObjectFlow-isMultireceive"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ndfa86EdiEh75YJ_3n8g", "ObjectFlow-transformation"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ndf686EdiEh75YJ_3n8g", "ObjectFlow-selection"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Ke98enEdm17tz62ORDiA", "_ownedMember.364"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Ke-MenEdm17tz62ORDiA", "_ownedMember.364-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Ke-cenEdm17tz62ORDiA", "_ownedMember.365"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Ke-senEdm17tz62ORDiA", "_ownedMember.365-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ndha86EdiEh75YJ_3n8g", "InitialNode"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ndh686EdiEh75YJ_3n8g", "FinalNode"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ndia86EdiEh75YJ_3n8g", "ActivityFinalNode"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ndi686EdiEh75YJ_3n8g", "DecisionNode"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ndja86EdiEh75YJ_3n8g", "DecisionNode-decisionInput"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KfBcenEdm17tz62ORDiA", "_ownedMember.370"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KfBsenEdm17tz62ORDiA", "_ownedMember.370-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ndka86EdiEh75YJ_3n8g", "MergeNode"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ndk686EdiEh75YJ_3n8g", "ActivityParameterNode"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ndla86EdiEh75YJ_3n8g", "ActivityParameterNode-parameter"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KfDMenEdm17tz62ORDiA", "_ownedMember.373"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KfDcenEdm17tz62ORDiA", "_ownedMember.373-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ndmK86EdiEh75YJ_3n8g", "ValuePin"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ndmq86EdiEh75YJ_3n8g", "ValuePin-value"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KfEcenEdm17tz62ORDiA", "_ownedMember.375"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KfEsenEdm17tz62ORDiA", "_ownedMember.375-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ndca86EdiEh75YJ_3n8g", "Actor"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ne0a86EdiEh75YJ_3n8g", "Trigger"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ne0686EdiEh75YJ_3n8g", "CallEvent-operation"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ne1K86EdiEh75YJ_3n8g", "Trigger"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KfGsenEdm17tz62ORDiA", "_ownedMember.379"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KfG8enEdm17tz62ORDiA", "_ownedMember.379-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ne2K86EdiEh75YJ_3n8g", "Trigger"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ne2q86EdiEh75YJ_3n8g", "ChangeEvent-changeExpression"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KfH8enEdm17tz62ORDiA", "_ownedMember.381"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KfIMenEdm17tz62ORDiA", "_ownedMember.381-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ne3686EdiEh75YJ_3n8g", "Trigger"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ne4a86EdiEh75YJ_3n8g", "SignalEvent-signal"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KfJsenEdm17tz62ORDiA", "_ownedMember.383"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KfJ8enEdm17tz62ORDiA", "_ownedMember.383-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ne5q86EdiEh75YJ_3n8g", "Trigger"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ne6K86EdiEh75YJ_3n8g", "TimeEvent-isRelative"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ne6q86EdiEh75YJ_3n8g", "TimeEvent-when"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KfLcenEdm17tz62ORDiA", "_ownedMember.385"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KfLsenEdm17tz62ORDiA", "_ownedMember.385-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ne7686EdiEh75YJ_3n8g", "Trigger"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ndna86EdiEh75YJ_3n8g", "ConditionalNode"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ndn686EdiEh75YJ_3n8g", "ConditionalNode-isDeterminate"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ndoa86EdiEh75YJ_3n8g", "ConditionalNode-isAssured"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ndo686EdiEh75YJ_3n8g", "ConditionalNode-clause"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ndpa86EdiEh75YJ_3n8g", "ConditionalNode-result"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KfPMenEdm17tz62ORDiA", "_ownedMember.388"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KfPcenEdm17tz62ORDiA", "_ownedMember.388-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ndrq86EdiEh75YJ_3n8g", "Clause"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ndsK86EdiEh75YJ_3n8g", "Clause-test"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9nds686EdiEh75YJ_3n8g", "Clause-body"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ndtq86EdiEh75YJ_3n8g", "Clause-predecessorClause"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ndua86EdiEh75YJ_3n8g", "Clause-successorClause"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ndvK86EdiEh75YJ_3n8g", "Clause-decider"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ndva86EdiEh75YJ_3n8g", "Clause-bodyOutput"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KfUMenEdm17tz62ORDiA", "_ownedMember.390"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KfUcenEdm17tz62ORDiA", "_ownedMember.390-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KfUsenEdm17tz62ORDiA", "_ownedMember.391"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KfU8enEdm17tz62ORDiA", "_ownedMember.391-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KfVMenEdm17tz62ORDiA", "_ownedMember.392"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KfVcenEdm17tz62ORDiA", "_ownedMember.393"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KfVsenEdm17tz62ORDiA", "_ownedMember.393-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KfV8enEdm17tz62ORDiA", "_ownedMember.394"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KfWMenEdm17tz62ORDiA", "_ownedMember.394-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KfWcenEdm17tz62ORDiA", "_ownedMember.395"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KfWsenEdm17tz62ORDiA", "_ownedMember.395-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ndy686EdiEh75YJ_3n8g", "LoopNode"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ndza86EdiEh75YJ_3n8g", "LoopNode-isTestedFirst"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ndz686EdiEh75YJ_3n8g", "LoopNode-bodyPart"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9nd0q86EdiEh75YJ_3n8g", "LoopNode-setupPart"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9nd1a86EdiEh75YJ_3n8g", "LoopNode-decider"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9nd1q86EdiEh75YJ_3n8g", "LoopNode-test"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9nd2a86EdiEh75YJ_3n8g", "LoopNode-result"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9nd3K86EdiEh75YJ_3n8g", "LoopNode-loopVariable"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9nd3686EdiEh75YJ_3n8g", "LoopNode-bodyOutput"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9nd4q86EdiEh75YJ_3n8g", "LoopNode-loopVariableInput"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KfdcenEdm17tz62ORDiA", "_ownedMember.397"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KfdsenEdm17tz62ORDiA", "_ownedMember.397-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Kfd8enEdm17tz62ORDiA", "_ownedMember.398"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KfeMenEdm17tz62ORDiA", "_ownedMember.398-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KfecenEdm17tz62ORDiA", "_ownedMember.399"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KfesenEdm17tz62ORDiA", "_ownedMember.399-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Kfe8enEdm17tz62ORDiA", "_ownedMember.400"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KffMenEdm17tz62ORDiA", "_ownedMember.400-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KffcenEdm17tz62ORDiA", "_ownedMember.401"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KffsenEdm17tz62ORDiA", "_ownedMember.401-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Kff8enEdm17tz62ORDiA", "_ownedMember.402"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KfgMenEdm17tz62ORDiA", "_ownedMember.402-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KfgcenEdm17tz62ORDiA", "_ownedMember.403"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KfgsenEdm17tz62ORDiA", "_ownedMember.403-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Kfg8enEdm17tz62ORDiA", "_ownedMember.404"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KfhMenEdm17tz62ORDiA", "_ownedMember.404-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9neCq86EdiEh75YJ_3n8g", "Interaction"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9neDa86EdiEh75YJ_3n8g", "Interaction-lifeline"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9neEK86EdiEh75YJ_3n8g", "Interaction-message"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9neE686EdiEh75YJ_3n8g", "Interaction-fragment"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9neFq86EdiEh75YJ_3n8g", "Interaction-formalGate"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9neG686EdiEh75YJ_3n8g", "InteractionFragment"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9neHa86EdiEh75YJ_3n8g", "InteractionFragment-covered"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9neIK86EdiEh75YJ_3n8g", "InteractionFragment-generalOrdering"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9neI686EdiEh75YJ_3n8g", "InteractionFragment-enclosingInteraction"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9neJa86EdiEh75YJ_3n8g", "InteractionFragment-enclosingOperand"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Kfo8enEdm17tz62ORDiA", "_ownedMember.407"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9neLK86EdiEh75YJ_3n8g", "Lifeline"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9neLq86EdiEh75YJ_3n8g", "Lifeline-represents"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9neL686EdiEh75YJ_3n8g", "Lifeline-interaction"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9neMK86EdiEh75YJ_3n8g", "Lifeline-selector"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9neMq86EdiEh75YJ_3n8g", "Lifeline-decomposedAs"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9neNK86EdiEh75YJ_3n8g", "Lifeline-coveredBy"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KfscenEdm17tz62ORDiA", "_ownedMember.409"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KfssenEdm17tz62ORDiA", "_ownedMember.409-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Kfs8enEdm17tz62ORDiA", "_ownedMember.410"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KftMenEdm17tz62ORDiA", "_ownedMember.411"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KftcenEdm17tz62ORDiA", "_ownedMember.411-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KftsenEdm17tz62ORDiA", "_ownedMember.412"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Kft8enEdm17tz62ORDiA", "_ownedMember.412-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9neQq86EdiEh75YJ_3n8g", "PartDecomposition"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9neRK86EdiEh75YJ_3n8g", "InteractionUse"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9neRq86EdiEh75YJ_3n8g", "InteractionUse-refersTo"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9neR686EdiEh75YJ_3n8g", "InteractionUse-actualGate"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9neSq86EdiEh75YJ_3n8g", "CallBehaviorAction-argument"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Kfw8enEdm17tz62ORDiA", "_ownedMember.415"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KfxMenEdm17tz62ORDiA", "_ownedMember.415-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KfxcenEdm17tz62ORDiA", "_ownedMember.416"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KfxsenEdm17tz62ORDiA", "_ownedMember.416-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9neU686EdiEh75YJ_3n8g", "Gate"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9neVa86EdiEh75YJ_3n8g", "MessageEnd"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9neV686EdiEh75YJ_3n8g", "MessageEnd-message"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9neWa86EdiEh75YJ_3n8g", "MessageEnd-message"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Kfz8enEdm17tz62ORDiA", "_ownedMember.419"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9neXK86EdiEh75YJ_3n8g", "Message"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9neXq86EdiEh75YJ_3n8g", "Message-messageKind"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9neYK86EdiEh75YJ_3n8g", "Message-messageSort"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9neYq86EdiEh75YJ_3n8g", "Message-sendEvent"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9neZK86EdiEh75YJ_3n8g", "Message-connector"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9neZq86EdiEh75YJ_3n8g", "Message-interaction"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9neZ686EdiEh75YJ_3n8g", "Message-signature"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9neaa86EdiEh75YJ_3n8g", "Message-argument"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9nebK86EdiEh75YJ_3n8g", "Message-receiveEvent"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9necq86EdiEh75YJ_3n8g", "MessageKind"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9nec686EdiEh75YJ_3n8g", "MessageKind-complete"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9nedK86EdiEh75YJ_3n8g", "MessageKind-lost"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9neda86EdiEh75YJ_3n8g", "MessageKind-found"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9nedq86EdiEh75YJ_3n8g", "MessageKind-unknown"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ned686EdiEh75YJ_3n8g", "MessageSort"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9neeK86EdiEh75YJ_3n8g", "MessageSort-synchCall"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9neea86EdiEh75YJ_3n8g", "MessageSort-asynchSignal"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9neeq86EdiEh75YJ_3n8g", "MessageSort-asynchCall"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9nee686EdiEh75YJ_3n8g", "MessageSort-asynchSignal"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Kf8MenEdm17tz62ORDiA", "_ownedMember.423"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Kf8cenEdm17tz62ORDiA", "_ownedMember.424"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Kf8senEdm17tz62ORDiA", "_ownedMember.424-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Kf88enEdm17tz62ORDiA", "_ownedMember.425"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Kf9MenEdm17tz62ORDiA", "_ownedMember.426"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Kf9cenEdm17tz62ORDiA", "_ownedMember.426-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Kf9senEdm17tz62ORDiA", "_ownedMember.427"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Kf98enEdm17tz62ORDiA", "_ownedMember.427-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Kf-MenEdm17tz62ORDiA", "_ownedMember.428"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Kf-cenEdm17tz62ORDiA", "_ownedMember.428-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Kf-senEdm17tz62ORDiA", "_ownedMember.429"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Kf-8enEdm17tz62ORDiA", "_ownedMember.429-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9neiK86EdiEh75YJ_3n8g", "GeneralOrdering"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9neiq86EdiEh75YJ_3n8g", "GeneralOrdering-before"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9nei686EdiEh75YJ_3n8g", "GeneralOrdering-after"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KgAMenEdm17tz62ORDiA", "_ownedMember.431"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9neja86EdiEh75YJ_3n8g", "OccurrenceSpecification"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_m9nekK86EdiEh75YJ_3n8g", "EventOccurrence-startExec"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_m9nek686EdiEh75YJ_3n8g", "EventOccurrence-finishExec"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9nelq86EdiEh75YJ_3n8g", "OccurrenceSpecification-toBefore"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9nema86EdiEh75YJ_3n8g", "OccurrenceSpecification-toAfter"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KgEMenEdm17tz62ORDiA", "_ownedMember.433"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9nen686EdiEh75YJ_3n8g", "ExecutionSpecification"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9neoa86EdiEh75YJ_3n8g", "ExecutionSpecification-finish"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9neoq86EdiEh75YJ_3n8g", "BehaviorExecutionOccurrence-behavior"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9nepa86EdiEh75YJ_3n8g", "ExecutionSpecification-start"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KgGMenEdm17tz62ORDiA", "_ownedMember.435"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KgGcenEdm17tz62ORDiA", "_ownedMember.436"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KgGsenEdm17tz62ORDiA", "_ownedMember.436-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KgG8enEdm17tz62ORDiA", "_ownedMember.437"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KgHMenEdm17tz62ORDiA", "_ownedMember.438"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9neq686EdiEh75YJ_3n8g", "InteractionOperand"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9nerq86EdiEh75YJ_3n8g", "InteractionOperand-guard"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9nesK86EdiEh75YJ_3n8g", "InteractionOperand-fragment"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KgJcenEdm17tz62ORDiA", "_ownedMember.440"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KgJsenEdm17tz62ORDiA", "_ownedMember.440-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9net686EdiEh75YJ_3n8g", "InteractionConstraint"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9neua86EdiEh75YJ_3n8g", "InteractionConstraint-minint"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9neu686EdiEh75YJ_3n8g", "InteractionConstraint-maxint"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KgLcenEdm17tz62ORDiA", "_ownedMember.442"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KgLsenEdm17tz62ORDiA", "_ownedMember.442-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KgL8enEdm17tz62ORDiA", "_ownedMember.443"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KgMMenEdm17tz62ORDiA", "_ownedMember.443-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KgMcenEdm17tz62ORDiA", "_ownedMember.444"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KgMsenEdm17tz62ORDiA", "_ownedMember.445"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KgM8enEdm17tz62ORDiA", "_ownedMember.445-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9nexq86EdiEh75YJ_3n8g", "StateInvariant"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9neyK86EdiEh75YJ_3n8g", "StateInvariant-invariant"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KgN8enEdm17tz62ORDiA", "_ownedMember.447"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KgOMenEdm17tz62ORDiA", "_ownedMember.447-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9nez686EdiEh75YJ_3n8g", "OccurrenceSpecification"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9nd-686EdiEh75YJ_3n8g", "OperationTemplateParameter"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9nd_a86EdiEh75YJ_3n8g", "ClassifierTemplateParameter"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9nd_686EdiEh75YJ_3n8g", "ClassifierTemplateParameter-allowSubstitutable"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9neAa86EdiEh75YJ_3n8g", "Classifier"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9neA686EdiEh75YJ_3n8g", "RedefinableTemplateSignature"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9neBq86EdiEh75YJ_3n8g", "Classifier"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9neCK86EdiEh75YJ_3n8g", "ConnectableElementTemplateParameter"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ne8a86EdiEh75YJ_3n8g", "ForkNode"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ne8686EdiEh75YJ_3n8g", "JoinNode"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ne9a86EdiEh75YJ_3n8g", "JoinNode-isCombineDuplicate"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ne9686EdiEh75YJ_3n8g", "JoinNode-joinSpec"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KgUcenEdm17tz62ORDiA", "_ownedMember.457"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KgUsenEdm17tz62ORDiA", "_ownedMember.457-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ne_K86EdiEh75YJ_3n8g", "FlowFinalNode"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ne_q86EdiEh75YJ_3n8g", "CentralBufferNode"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ngL686EdiEh75YJ_3n8g", "ExpansionNode"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ngMa86EdiEh75YJ_3n8g", "ExpansionNode-regionAsOutput"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ngM686EdiEh75YJ_3n8g", "ExpansionNode-regionAsInput"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KgXcenEdm17tz62ORDiA", "_ownedMember.461"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ngNq86EdiEh75YJ_3n8g", "ExpansionRegion"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ngOK86EdiEh75YJ_3n8g", "ExpansionRegion-mode"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ngOq86EdiEh75YJ_3n8g", "ExpansionRegion-inputElement"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ngPK86EdiEh75YJ_3n8g", "ExpansionRegion-outputElement"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ngP686EdiEh75YJ_3n8g", "ExpansionKind"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ngQK86EdiEh75YJ_3n8g", "ExpansionKind-parallel"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ngQa86EdiEh75YJ_3n8g", "ExpansionKind-iterative"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ngQq86EdiEh75YJ_3n8g", "ExpansionKind-stream"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Kga8enEdm17tz62ORDiA", "_ownedMember.464"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ngD686EdiEh75YJ_3n8g", "InteractionOperatorKind"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ngEK86EdiEh75YJ_3n8g", "InteractionOperatorKind-seq"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ngEa86EdiEh75YJ_3n8g", "InteractionOperatorKind-alt"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ngEq86EdiEh75YJ_3n8g", "InteractionOperatorKind-opt"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ngE686EdiEh75YJ_3n8g", "InteractionOperatorKind-break"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ngFK86EdiEh75YJ_3n8g", "InteractionOperatorKind-par"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ngFa86EdiEh75YJ_3n8g", "InteractionOperatorKind-strict"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ngFq86EdiEh75YJ_3n8g", "InteractionOperatorKind-loop"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ngF686EdiEh75YJ_3n8g", "InteractionOperatorKind-critical"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ngGK86EdiEh75YJ_3n8g", "InteractionOperatorKind-neg"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ngGa86EdiEh75YJ_3n8g", "InteractionOperatorKind-assert"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ngGq86EdiEh75YJ_3n8g", "InteractionOperatorKind-ignore"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ngG686EdiEh75YJ_3n8g", "InteractionOperatorKind-consider"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ngHK86EdiEh75YJ_3n8g", "CombinedFragment"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ngHq86EdiEh75YJ_3n8g", "CombinedFragment-interactionOperator"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ngIK86EdiEh75YJ_3n8g", "CombinedFragment-operand"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ngIq86EdiEh75YJ_3n8g", "CombinedFragment-cfragmentGate"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KggsenEdm17tz62ORDiA", "_ownedMember.467"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Kgg8enEdm17tz62ORDiA", "_ownedMember.467-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KghMenEdm17tz62ORDiA", "_ownedMember.468"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KghcenEdm17tz62ORDiA", "_ownedMember.468-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ngK686EdiEh75YJ_3n8g", "Continuation"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ngLa86EdiEh75YJ_3n8g", "Continuation-setting"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9nfAK86EdiEh75YJ_3n8g", "FinalState"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9nfAq86EdiEh75YJ_3n8g", "CreateObjectAction"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9nfBK86EdiEh75YJ_3n8g", "CreateObjectAction-classifier"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9nfBa86EdiEh75YJ_3n8g", "CreateObjectAction-result"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KgkMenEdm17tz62ORDiA", "_ownedMember.472"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KgkcenEdm17tz62ORDiA", "_ownedMember.472-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KgksenEdm17tz62ORDiA", "_ownedMember.473"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Kgk8enEdm17tz62ORDiA", "_ownedMember.473-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9nfDK86EdiEh75YJ_3n8g", "DestroyObjectAction"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9nfDq86EdiEh75YJ_3n8g", "DestroyObjectAction-isDestroyLinks"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9nfEK86EdiEh75YJ_3n8g", "DestroyObjectAction-isDestroyOwnedObjects"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9nfEq86EdiEh75YJ_3n8g", "DestroyObjectAction-target"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Kgm8enEdm17tz62ORDiA", "_ownedMember.475"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KgnMenEdm17tz62ORDiA", "_ownedMember.475-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9nfF686EdiEh75YJ_3n8g", "TestIdentityAction"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9nfGa86EdiEh75YJ_3n8g", "TestIdentityAction-first"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9nfGq86EdiEh75YJ_3n8g", "TestIdentityAction-second"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9nfG686EdiEh75YJ_3n8g", "TestIdentityAction-result"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KgosenEdm17tz62ORDiA", "_ownedMember.477"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Kgo8enEdm17tz62ORDiA", "_ownedMember.477-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KgpMenEdm17tz62ORDiA", "_ownedMember.478"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KgpcenEdm17tz62ORDiA", "_ownedMember.478-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KgpsenEdm17tz62ORDiA", "_ownedMember.479"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Kgp8enEdm17tz62ORDiA", "_ownedMember.479-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9nfJq86EdiEh75YJ_3n8g", "ReadSelfAction"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9nfKK86EdiEh75YJ_3n8g", "ReadSelfAction-result"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Kgq8enEdm17tz62ORDiA", "_ownedMember.481"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KgrMenEdm17tz62ORDiA", "_ownedMember.481-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9nfLa86EdiEh75YJ_3n8g", "StructuralFeatureAction"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9nfL686EdiEh75YJ_3n8g", "StructuralFeatureAction-structuralFeature"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9nfMK86EdiEh75YJ_3n8g", "StructuralFeatureAction-object"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KgscenEdm17tz62ORDiA", "_ownedMember.483"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KgssenEdm17tz62ORDiA", "_ownedMember.483-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Kgs8enEdm17tz62ORDiA", "_ownedMember.484"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KgtMenEdm17tz62ORDiA", "_ownedMember.484-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9nfN686EdiEh75YJ_3n8g", "ReadStructuralFeatureAction"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9nfOa86EdiEh75YJ_3n8g", "ReadStructuralFeatureAction-result"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KguMenEdm17tz62ORDiA", "_ownedMember.486"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KgucenEdm17tz62ORDiA", "_ownedMember.486-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9nfPq86EdiEh75YJ_3n8g", "WriteStructuralFeatureAction"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9nfQK86EdiEh75YJ_3n8g", "WriteStructuralFeatureAction-value"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KgvcenEdm17tz62ORDiA", "_ownedMember.488"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KgvsenEdm17tz62ORDiA", "_ownedMember.488-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9nfRa86EdiEh75YJ_3n8g", "ClearStructuralFeatureAction"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9nfR686EdiEh75YJ_3n8g", "RemoveStructuralFeatureValueAction"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9nfSa86EdiEh75YJ_3n8g", "AddStructuralFeatureValueAction"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9nfS686EdiEh75YJ_3n8g", "AddStructuralFeatureValueAction-isReplaceAll"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9nfTa86EdiEh75YJ_3n8g", "AddStructuralFeatureValueAction-insertAt"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KgycenEdm17tz62ORDiA", "_ownedMember.492"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KgysenEdm17tz62ORDiA", "_ownedMember.492-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9nfU686EdiEh75YJ_3n8g", "LinkAction"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9nfVa86EdiEh75YJ_3n8g", "LinkAction-endData"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Kg0MenEdm17tz62ORDiA", "_ownedMember.494"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Kg0cenEdm17tz62ORDiA", "_ownedMember.494-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9nfWq86EdiEh75YJ_3n8g", "LinkEndData"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9nfXK86EdiEh75YJ_3n8g", "LinkEndData-value"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9nfXq86EdiEh75YJ_3n8g", "LinkEndData-end"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9nfX686EdiEh75YJ_3n8g", "LinkEndData-qualifier"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Kg2cenEdm17tz62ORDiA", "_ownedMember.496"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Kg2senEdm17tz62ORDiA", "_ownedMember.496-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Kg28enEdm17tz62ORDiA", "_ownedMember.497"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Kg3MenEdm17tz62ORDiA", "_ownedMember.497-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Kg3cenEdm17tz62ORDiA", "_ownedMember.498"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Kg3senEdm17tz62ORDiA", "_ownedMember.498-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9nfaK86EdiEh75YJ_3n8g", "QualifierValue"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9nfaq86EdiEh75YJ_3n8g", "QualifierValue-qualifier"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9nfa686EdiEh75YJ_3n8g", "QualifierValue-value"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Kg48enEdm17tz62ORDiA", "_ownedMember.500"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Kg5MenEdm17tz62ORDiA", "_ownedMember.500-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Kg5cenEdm17tz62ORDiA", "_ownedMember.501"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Kg5senEdm17tz62ORDiA", "_ownedMember.501-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9nfcK86EdiEh75YJ_3n8g", "ReadLinkAction"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9nfcq86EdiEh75YJ_3n8g", "ReadLinkAction-result"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Kg6senEdm17tz62ORDiA", "_ownedMember.503"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Kg68enEdm17tz62ORDiA", "_ownedMember.503-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9nfd686EdiEh75YJ_3n8g", "LinkEndCreationData"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9nfea86EdiEh75YJ_3n8g", "LinkEndCreationData-isReplaceAll"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9nfe686EdiEh75YJ_3n8g", "LinkEndCreationData-insertAt"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Kg8senEdm17tz62ORDiA", "_ownedMember.505"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Kg88enEdm17tz62ORDiA", "_ownedMember.505-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9nfga86EdiEh75YJ_3n8g", "CreateLinkAction"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9nfha86EdiEh75YJ_3n8g", "WriteLinkAction"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9nfh686EdiEh75YJ_3n8g", "DestroyLinkAction"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9nfia86EdiEh75YJ_3n8g", "ClearAssociationAction"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9nfi686EdiEh75YJ_3n8g", "ClearAssociationAction-object"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9nfjK86EdiEh75YJ_3n8g", "ClearAssociationAction-association"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Kg_senEdm17tz62ORDiA", "_ownedMember.510"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Kg_8enEdm17tz62ORDiA", "_ownedMember.510-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KhAMenEdm17tz62ORDiA", "_ownedMember.511"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KhAcenEdm17tz62ORDiA", "_ownedMember.511-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9nfk686EdiEh75YJ_3n8g", "VariableAction"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9nfla86EdiEh75YJ_3n8g", "VariableAction-variable"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KhBcenEdm17tz62ORDiA", "_ownedMember.513"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KhBsenEdm17tz62ORDiA", "_ownedMember.513-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9nfmK86EdiEh75YJ_3n8g", "ReadVariableAction"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9nfmq86EdiEh75YJ_3n8g", "ReadVariableAction-result"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KhCsenEdm17tz62ORDiA", "_ownedMember.515"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KhC8enEdm17tz62ORDiA", "_ownedMember.515-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9nfn686EdiEh75YJ_3n8g", "WriteVariableAction"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9nfoa86EdiEh75YJ_3n8g", "WriteVariableAction-value"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KhD8enEdm17tz62ORDiA", "_ownedMember.517"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KhEMenEdm17tz62ORDiA", "_ownedMember.517-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9nfpq86EdiEh75YJ_3n8g", "ClearVariableAction"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9nfqK86EdiEh75YJ_3n8g", "AddVariableValueAction"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9nfqq86EdiEh75YJ_3n8g", "AddVariableValueAction-isReplaceAll"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9nfrK86EdiEh75YJ_3n8g", "AddVariableValueAction-insertAt"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KhGcenEdm17tz62ORDiA", "_ownedMember.520"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KhGsenEdm17tz62ORDiA", "_ownedMember.520-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9nfsq86EdiEh75YJ_3n8g", "RemoveVariableValueAction"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9nftK86EdiEh75YJ_3n8g", "CallBehaviorAction"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9nftq86EdiEh75YJ_3n8g", "CallBehaviorAction-behavior"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9nft686EdiEh75YJ_3n8g", "InvocationAction-argument"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9nfuq86EdiEh75YJ_3n8g", "CallAction-result"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KhJsenEdm17tz62ORDiA", "_ownedMember.523"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KhJ8enEdm17tz62ORDiA", "_ownedMember.523-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9nfw686EdiEh75YJ_3n8g", "FunctionBehavior"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9nfxa86EdiEh75YJ_3n8g", "OpaqueBehavior-body"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9nfx686EdiEh75YJ_3n8g", "OpaqueBehavior-language"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KhLsenEdm17tz62ORDiA", "_ownedMember.525"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KhL8enEdm17tz62ORDiA", "_ownedMember.525-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KhMMenEdm17tz62ORDiA", "_ownedMember.526"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KhMcenEdm17tz62ORDiA", "_ownedMember.526-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9nfza86EdiEh75YJ_3n8g", "CallAction"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9nfz686EdiEh75YJ_3n8g", "CallAction-isSynchronous"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9nf0a86EdiEh75YJ_3n8g", "CallAction-result"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9nf1q86EdiEh75YJ_3n8g", "InvocationAction"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9nf2K86EdiEh75YJ_3n8g", "InvocationAction-argument"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9nf2686EdiEh75YJ_3n8g", "InvocationAction-onPort"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KhQMenEdm17tz62ORDiA", "_ownedMember.529"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KhQcenEdm17tz62ORDiA", "_ownedMember.529-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KhQsenEdm17tz62ORDiA", "_ownedMember.530"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KhQ8enEdm17tz62ORDiA", "_ownedMember.530-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KhRMenEdm17tz62ORDiA", "_ownedMember.531"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KhRcenEdm17tz62ORDiA", "_ownedMember.531-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9nf5a86EdiEh75YJ_3n8g", "SendSignalAction"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9nf5686EdiEh75YJ_3n8g", "SendSignalAction-target"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9nf6K86EdiEh75YJ_3n8g", "SendSignalAction-signal"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KhSsenEdm17tz62ORDiA", "_ownedMember.533"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KhS8enEdm17tz62ORDiA", "_ownedMember.533-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KhTMenEdm17tz62ORDiA", "_ownedMember.534"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KhTcenEdm17tz62ORDiA", "_ownedMember.534-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9nf7686EdiEh75YJ_3n8g", "BroadcastSignalAction"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9nf8a86EdiEh75YJ_3n8g", "BroadcastSignalAction-signal"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KhUcenEdm17tz62ORDiA", "_ownedMember.536"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KhUsenEdm17tz62ORDiA", "_ownedMember.536-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9nf9K86EdiEh75YJ_3n8g", "SendObjectAction"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9nf9q86EdiEh75YJ_3n8g", "SendObjectAction-target"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9nf9686EdiEh75YJ_3n8g", "SendObjectAction-request"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KhV8enEdm17tz62ORDiA", "_ownedMember.538"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KhWMenEdm17tz62ORDiA", "_ownedMember.538-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KhWcenEdm17tz62ORDiA", "_ownedMember.539"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KhWsenEdm17tz62ORDiA", "_ownedMember.539-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ngAK86EdiEh75YJ_3n8g", "CallOperationAction"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ngAq86EdiEh75YJ_3n8g", "CallOperationAction-operation"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ngA686EdiEh75YJ_3n8g", "CallOperationAction-target"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KhX8enEdm17tz62ORDiA", "_ownedMember.541"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KhYMenEdm17tz62ORDiA", "_ownedMember.541-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KhYcenEdm17tz62ORDiA", "_ownedMember.542"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KhYsenEdm17tz62ORDiA", "_ownedMember.542-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ngCq86EdiEh75YJ_3n8g", "CallBehaviorAction"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ngDK86EdiEh75YJ_3n8g", "CallBehaviorAction-behavior"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KhZsenEdm17tz62ORDiA", "_ownedMember.544"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KhZ8enEdm17tz62ORDiA", "_ownedMember.544-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ng8q86EdiEh75YJ_3n8g", "TimeExpression"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ng9K86EdiEh75YJ_3n8g", "TimeObservation-firstEvent"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ng9q86EdiEh75YJ_3n8g", "TimeObservation-event"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KhbsenEdm17tz62ORDiA", "_ownedMember.546"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Khb8enEdm17tz62ORDiA", "_ownedMember.546-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ng-q86EdiEh75YJ_3n8g", "Duration"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ng_K86EdiEh75YJ_3n8g", "DurationObservation-firstEvent"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ng_q86EdiEh75YJ_3n8g", "DurationObservation-event"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Khd8enEdm17tz62ORDiA", "_ownedMember.548"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KheMenEdm17tz62ORDiA", "_ownedMember.548-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9nhA686EdiEh75YJ_3n8g", "OpaqueAction"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9nhBa86EdiEh75YJ_3n8g", "ValuePin-value"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KhfsenEdm17tz62ORDiA", "_ownedMember.550"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Khf8enEdm17tz62ORDiA", "_ownedMember.550-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9nhDq86EdiEh75YJ_3n8g", "DurationInterval"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9nhFK86EdiEh75YJ_3n8g", "Interval"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9nhFq86EdiEh75YJ_3n8g", "Interval-min"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9nhGa86EdiEh75YJ_3n8g", "Interval-max"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KhiMenEdm17tz62ORDiA", "_ownedMember.553"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KhicenEdm17tz62ORDiA", "_ownedMember.553-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KhisenEdm17tz62ORDiA", "_ownedMember.554"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Khi8enEdm17tz62ORDiA", "_ownedMember.554-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9nhIK86EdiEh75YJ_3n8g", "TimeConstraint"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9nhJq86EdiEh75YJ_3n8g", "IntervalConstraint"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9nhLK86EdiEh75YJ_3n8g", "TimeInterval"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9nhMq86EdiEh75YJ_3n8g", "OpaqueAction"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9nhNK86EdiEh75YJ_3n8g", "ValuePin-value"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Khl8enEdm17tz62ORDiA", "_ownedMember.559"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KhmMenEdm17tz62ORDiA", "_ownedMember.559-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9nhPa86EdiEh75YJ_3n8g", "DurationConstraint"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ng3a86EdiEh75YJ_3n8g", "DataStoreNode"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ngza86EdiEh75YJ_3n8g", "Node"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ng0K86EdiEh75YJ_3n8g", "Node-nestedNode"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Kho8enEdm17tz62ORDiA", "_ownedMember.563"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KhpMenEdm17tz62ORDiA", "_ownedMember.563-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ng1686EdiEh75YJ_3n8g", "Device"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ng2a86EdiEh75YJ_3n8g", "ExecutionEnvironment"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ng2686EdiEh75YJ_3n8g", "CommunicationPath"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ng3686EdiEh75YJ_3n8g", "ProtocolTransition"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ng4a86EdiEh75YJ_3n8g", "ProtocolTransition-postCondition"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ng4686EdiEh75YJ_3n8g", "ProtocolTransition-referred"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ng5q86EdiEh75YJ_3n8g", "ProtocolTransition-preCondition"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KhuMenEdm17tz62ORDiA", "_ownedMember.568"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KhucenEdm17tz62ORDiA", "_ownedMember.568-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KhusenEdm17tz62ORDiA", "_ownedMember.569"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Khu8enEdm17tz62ORDiA", "_ownedMember.569-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KhvMenEdm17tz62ORDiA", "_ownedMember.570"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KhvcenEdm17tz62ORDiA", "_ownedMember.570-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ngRK86EdiEh75YJ_3n8g", "ReadExtentAction"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ngRq86EdiEh75YJ_3n8g", "ReadExtentAction-result"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ngR686EdiEh75YJ_3n8g", "ReadExtentAction-classifier"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KhwsenEdm17tz62ORDiA", "_ownedMember.572"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Khw8enEdm17tz62ORDiA", "_ownedMember.572-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KhxMenEdm17tz62ORDiA", "_ownedMember.573"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KhxcenEdm17tz62ORDiA", "_ownedMember.573-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ngTq86EdiEh75YJ_3n8g", "ReclassifyObjectAction"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ngUK86EdiEh75YJ_3n8g", "ReclassifyObjectAction-isReplaceAll"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ngUq86EdiEh75YJ_3n8g", "ReclassifyObjectAction-oldClassifier"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ngVa86EdiEh75YJ_3n8g", "ReclassifyObjectAction-newClassifier"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ngWK86EdiEh75YJ_3n8g", "ReclassifyObjectAction-object"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Kh0cenEdm17tz62ORDiA", "_ownedMember.575"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Kh0senEdm17tz62ORDiA", "_ownedMember.575-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Kh08enEdm17tz62ORDiA", "_ownedMember.576"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Kh1MenEdm17tz62ORDiA", "_ownedMember.576-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Kh1cenEdm17tz62ORDiA", "_ownedMember.577"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Kh1senEdm17tz62ORDiA", "_ownedMember.577-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ngYa86EdiEh75YJ_3n8g", "ReadIsClassifiedObjectAction"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ngY686EdiEh75YJ_3n8g", "ReadIsClassifiedObjectAction-isDirect"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ngZa86EdiEh75YJ_3n8g", "ReadIsClassifiedObjectAction-classifier"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ngZq86EdiEh75YJ_3n8g", "ReadIsClassifiedObjectAction-result"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ngZ686EdiEh75YJ_3n8g", "ReadIsClassifiedObjectAction-object"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Kh3senEdm17tz62ORDiA", "_ownedMember.579"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Kh38enEdm17tz62ORDiA", "_ownedMember.579-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Kh4MenEdm17tz62ORDiA", "_ownedMember.580"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Kh4cenEdm17tz62ORDiA", "_ownedMember.580-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Kh4senEdm17tz62ORDiA", "_ownedMember.581"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Kh48enEdm17tz62ORDiA", "_ownedMember.581-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ngcq86EdiEh75YJ_3n8g", "StartClassifierBehaviorAction"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ngdK86EdiEh75YJ_3n8g", "StartClassifierBehaviorAction-object"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Kh58enEdm17tz62ORDiA", "_ownedMember.583"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Kh6MenEdm17tz62ORDiA", "_ownedMember.583-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ngea86EdiEh75YJ_3n8g", "ReadLinkObjectEndAction"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9nge686EdiEh75YJ_3n8g", "ReadLinkObjectEndAction-object"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ngfK86EdiEh75YJ_3n8g", "ReadLinkObjectEndAction-end"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ngfa86EdiEh75YJ_3n8g", "ReadLinkObjectEndAction-result"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Kh7senEdm17tz62ORDiA", "_ownedMember.585"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Kh78enEdm17tz62ORDiA", "_ownedMember.585-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Kh8MenEdm17tz62ORDiA", "_ownedMember.586"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Kh8cenEdm17tz62ORDiA", "_ownedMember.586-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Kh8senEdm17tz62ORDiA", "_ownedMember.587"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Kh88enEdm17tz62ORDiA", "_ownedMember.587-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ngiK86EdiEh75YJ_3n8g", "ReadLinkObjectEndQualifierAction"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ngiq86EdiEh75YJ_3n8g", "ReadLinkObjectEndQualifierAction-object"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ngi686EdiEh75YJ_3n8g", "ReadLinkObjectEndQualifierAction-result"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ngjK86EdiEh75YJ_3n8g", "ReadLinkObjectEndQualifierAction-qualifier"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Kh-cenEdm17tz62ORDiA", "_ownedMember.589"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Kh-senEdm17tz62ORDiA", "_ownedMember.589-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Kh-8enEdm17tz62ORDiA", "_ownedMember.590"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Kh_MenEdm17tz62ORDiA", "_ownedMember.590-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Kh_cenEdm17tz62ORDiA", "_ownedMember.591"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4Kh_senEdm17tz62ORDiA", "_ownedMember.591-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ngl686EdiEh75YJ_3n8g", "CreateLinkObjectAction"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ngma86EdiEh75YJ_3n8g", "CreateLinkObjectAction-result"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KiAsenEdm17tz62ORDiA", "_ownedMember.593"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KiA8enEdm17tz62ORDiA", "_ownedMember.593-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ngoK86EdiEh75YJ_3n8g", "AcceptEventAction"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ngoq86EdiEh75YJ_3n8g", "AcceptEventAction-trigger"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ngpa86EdiEh75YJ_3n8g", "AcceptEventAction-result"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KiC8enEdm17tz62ORDiA", "_ownedMember.595"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KiDMenEdm17tz62ORDiA", "_ownedMember.595-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KiDcenEdm17tz62ORDiA", "_ownedMember.596"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KiDsenEdm17tz62ORDiA", "_ownedMember.596-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ngrq86EdiEh75YJ_3n8g", "AcceptCallAction"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ngsK86EdiEh75YJ_3n8g", "AcceptCallAction-returnInformation"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KiEsenEdm17tz62ORDiA", "_ownedMember.598"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KiE8enEdm17tz62ORDiA", "_ownedMember.598-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ngt686EdiEh75YJ_3n8g", "ReplyAction"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ngua86EdiEh75YJ_3n8g", "ReplyAction-replyToCall"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9nguq86EdiEh75YJ_3n8g", "ReplyAction-replyValue"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ngva86EdiEh75YJ_3n8g", "ReplyAction-returnInformation"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KiG8enEdm17tz62ORDiA", "_ownedMember.600"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KiHMenEdm17tz62ORDiA", "_ownedMember.600-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KiHcenEdm17tz62ORDiA", "_ownedMember.601"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KiHsenEdm17tz62ORDiA", "_ownedMember.601-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KiH8enEdm17tz62ORDiA", "_ownedMember.602"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KiIMenEdm17tz62ORDiA", "_ownedMember.602-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ngxq86EdiEh75YJ_3n8g", "RaiseExceptionAction"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_m9ngyK86EdiEh75YJ_3n8g", "RaiseExceptionAction-exception"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KiJMenEdm17tz62ORDiA", "_ownedMember.604"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_h4KiJcenEdm17tz62ORDiA", "_ownedMember.604-_ownedEnd.0"); //$NON-NLS-1$ //$NON-NLS-2$

					// Basic.profile.uml2 -> Standard.profile.uml
					// Intermediate.profile.uml2 -> Standard.profile.uml
					// Complete.profile.uml2 -> Standard.profile.uml

					fragmentMap.put("_6mFRgK86Edih9-GG5afQ0g", "_0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_Cz7csK87Edih9-GG5afQ0g", "_0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_M7pTkK87Edih9-GG5afQ0g", "_0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_9l21UK86Edih9-GG5afQ0g", "Auxiliary"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_9vsGwq86Edih9-GG5afQ0g", "Auxiliary-base_Class"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_9vNloK86Edih9-GG5afQ0g", "Class_Auxiliary"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_9vsGwK86Edih9-GG5afQ0g", "Class_Auxiliary-extension_Auxiliary"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_9vsGw686Edih9-GG5afQ0g", "BuildComponent"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_9vsGyK86Edih9-GG5afQ0g", "BuildComponent-base_Component"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_9vsGxa86Edih9-GG5afQ0g", "Component_BuildComponent"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_9vsGxq86Edih9-GG5afQ0g", "Component_BuildComponent-extension_BuildComponent"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_9v4UBK86Edih9-GG5afQ0g", "Create"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_9v4UA686Edih9-GG5afQ0g", "Create-base_BehavioralFeature"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_9v-ao686Edih9-GG5afQ0g", "Create-base_Usage"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_9v4UAK86Edih9-GG5afQ0g", "BehavioralFeature_Create"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_9v4UAa86Edih9-GG5afQ0g", "BehavioralFeature_Create-extension_Create"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_9v-aoK86Edih9-GG5afQ0g", "Usage_Create"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_9v-aoa86Edih9-GG5afQ0g", "Usage_Create-extension_Create"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_9v-apK86Edih9-GG5afQ0g", "Call"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_9v-aqK86Edih9-GG5afQ0g", "Call-base_Usage"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_9v-apa86Edih9-GG5afQ0g", "Usage_Call"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_9v-apq86Edih9-GG5afQ0g", "Usage_Call-extension_Call"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_9wEhQK86Edih9-GG5afQ0g", "Derive"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_9wEhRa86Edih9-GG5afQ0g", "Derive-base_Abstraction"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_9wEhQq86Edih9-GG5afQ0g", "Abstraction_Derive"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_9wEhQ686Edih9-GG5afQ0g", "Abstraction_Derive-extension_Derive"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_9wKn4K86Edih9-GG5afQ0g", "Destroy"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_9wQug686Edih9-GG5afQ0g", "Destroy-base_BehavioralFeature"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_9wQugK86Edih9-GG5afQ0g", "BehavioralFeature_Destroy"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_9wQuga86Edih9-GG5afQ0g", "BehavioralFeature_Destroy-extension_Destroy"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_9wQuhK86Edih9-GG5afQ0g", "Focus"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_9wW1Iq86Edih9-GG5afQ0g", "Focus-base_Class"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_9wQuha86Edih9-GG5afQ0g", "Class_Focus"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_9wW1IK86Edih9-GG5afQ0g", "Class_Focus-extension_Focus"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_9wW1I686Edih9-GG5afQ0g", "Framework"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_9wc7w686Edih9-GG5afQ0g", "Framework-base_Package"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_9wc7wK86Edih9-GG5afQ0g", "Package_Framework"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_9wc7wa86Edih9-GG5afQ0g", "Package_Framework-extension_Framework"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_9wc7xK86Edih9-GG5afQ0g", "Implement"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_9wc7yK86Edih9-GG5afQ0g", "Implement-base_Component"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_9wc7xa86Edih9-GG5afQ0g", "Component_Implement"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_9wc7xq86Edih9-GG5afQ0g", "Component_Implement-extension_Implement"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_9wc7ya86Edih9-GG5afQ0g", "ImplementationClass"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_9wjCY686Edih9-GG5afQ0g", "ImplementationClass-base_Class"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_9wjCYK86Edih9-GG5afQ0g", "Class_ImplementationClass"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_9wjCYa86Edih9-GG5afQ0g", "Class_ImplementationClass-extension_ImplementationClass"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_9wjCZK86Edih9-GG5afQ0g", "Instantiate"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_9wpJA686Edih9-GG5afQ0g", "Instantiate-base_Usage"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_9wpJAK86Edih9-GG5afQ0g", "Usage_Instantiate"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_9wpJAa86Edih9-GG5afQ0g", "Usage_Instantiate-extension_Instantiate"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_9wpJBK86Edih9-GG5afQ0g", "Metaclass"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_9wpJCK86Edih9-GG5afQ0g", "Metaclass-base_Class"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_9wpJBa86Edih9-GG5afQ0g", "Class_Metaclass"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_9wpJBq86Edih9-GG5afQ0g", "Class_Metaclass-extension_Metaclass"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_9wpJCa86Edih9-GG5afQ0g", "ModelLibrary"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_9wvPo686Edih9-GG5afQ0g", "ModelLibrary-base_Package"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_9wvPoK86Edih9-GG5afQ0g", "Package_ModelLibrary"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_9wvPoa86Edih9-GG5afQ0g", "Package_ModelLibrary-extension_ModelLibrary"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_9wvPpK86Edih9-GG5afQ0g", "Refine"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_9wvPqK86Edih9-GG5afQ0g", "Refine-base_Abstraction"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_9wvPpa86Edih9-GG5afQ0g", "Abstraction_Refine"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_9wvPpq86Edih9-GG5afQ0g", "Abstraction_Refine-extension_Refine"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_9wvPqa86Edih9-GG5afQ0g", "Responsibility"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_9w1WQq86Edih9-GG5afQ0g", "Responsibility-base_Usage"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_9wvPqq86Edih9-GG5afQ0g", "Usage_Responsibility"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_9w1WQK86Edih9-GG5afQ0g", "Usage_Responsibility-extension_Responsibility"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_9w1WQ686Edih9-GG5afQ0g", "Script"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_9w1WSK86Edih9-GG5afQ0g", "Script-base_Artifact"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_9w1WRa86Edih9-GG5afQ0g", "Artifact_Script"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_9w1WRq86Edih9-GG5afQ0g", "Artifact_Script-extension_Script"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_9w1WSa86Edih9-GG5afQ0g", "Send"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_9w7c4686Edih9-GG5afQ0g", "Send-base_Usage"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_9w7c4K86Edih9-GG5afQ0g", "Usage_Send"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_9w7c4a86Edih9-GG5afQ0g", "Usage_Send-extension_Send"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_9w7c5K86Edih9-GG5afQ0g", "Trace"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_9w7c6K86Edih9-GG5afQ0g", "Trace-base_Abstraction"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_9w7c5a86Edih9-GG5afQ0g", "Abstraction_Trace"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_9w7c5q86Edih9-GG5afQ0g", "Abstraction_Trace-extension_Trace"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_9w7c6a86Edih9-GG5afQ0g", "Type"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_9xBjg686Edih9-GG5afQ0g", "Type-base_Class"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_9xBjgK86Edih9-GG5afQ0g", "Class_Type"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_9xBjga86Edih9-GG5afQ0g", "Class_Type-extension_Type"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_9xBjhK86Edih9-GG5afQ0g", "Utility"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_9xBjiK86Edih9-GG5afQ0g", "Utility-base_Class"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_9xBjha86Edih9-GG5afQ0g", "Class_Utility"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_9xBjhq86Edih9-GG5afQ0g", "Class_Utility-extension_Utility"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_Ftfq0K87Edih9-GG5afQ0g", "Document"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_FxmuxK87Edih9-GG5afQ0g", "Document-base_Artifact"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_Fxmuwa87Edih9-GG5afQ0g", "Artifact_Document"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_Fxmuwq87Edih9-GG5afQ0g", "Artifact_Document-extension_Document"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_Fxmuxa87Edih9-GG5afQ0g", "Entity"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_Fxs1ZK87Edih9-GG5afQ0g", "Entity-base_Component"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_Fxs1Ya87Edih9-GG5afQ0g", "Component_Entity"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_Fxs1Yq87Edih9-GG5afQ0g", "Component_Entity-extension_Entity"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_Fxs1Za87Edih9-GG5afQ0g", "Executable"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_Fxy8Aa87Edih9-GG5afQ0g", "Executable-base_Artifact"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_Fxs1Zq87Edih9-GG5afQ0g", "Artifact_Executable"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_Fxs1Z687Edih9-GG5afQ0g", "Artifact_Executable-extension_Executable"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_Fxy8Aq87Edih9-GG5afQ0g", "File"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_Fxy8Bq87Edih9-GG5afQ0g", "File-base_Artifact"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_Fxy8A687Edih9-GG5afQ0g", "Artifact_File"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_Fxy8BK87Edih9-GG5afQ0g", "Artifact_File-extension_File"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_Fxy8B687Edih9-GG5afQ0g", "Library"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_Fxy8C687Edih9-GG5afQ0g", "Library-base_Artifact"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_Fxy8CK87Edih9-GG5afQ0g", "Artifact_Library"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_Fxy8Ca87Edih9-GG5afQ0g", "Artifact_Library-extension_Library"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_Fxy8DK87Edih9-GG5afQ0g", "Process"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_Fx5Co687Edih9-GG5afQ0g", "Process-base_Component"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_Fx5CoK87Edih9-GG5afQ0g", "Component_Process"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_Fx5Coa87Edih9-GG5afQ0g", "Component_Process-extension_Process"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_Fx5CpK87Edih9-GG5afQ0g", "Realization"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_FyFP4a87Edih9-GG5afQ0g", "Realization-base_Classifier"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_Fx_JQK87Edih9-GG5afQ0g", "Classifier_Realization"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_Fx_JQa87Edih9-GG5afQ0g", "Classifier_Realization-extension_Realization"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_FyFP4q87Edih9-GG5afQ0g", "Service"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_FyFP5q87Edih9-GG5afQ0g", "Service-base_Component"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_FyFP4687Edih9-GG5afQ0g", "Component_Service"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_FyFP5K87Edih9-GG5afQ0g", "Component_Service-extension_Service"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_FyFP5687Edih9-GG5afQ0g", "Source"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_FyFP6687Edih9-GG5afQ0g", "Source-base_Artifact"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_FyFP6K87Edih9-GG5afQ0g", "Artifact_Source"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_FyFP6a87Edih9-GG5afQ0g", "Artifact_Source-extension_Source"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_FyFP7K87Edih9-GG5afQ0g", "Specification"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_FyLWg687Edih9-GG5afQ0g", "Specification-base_Classifier"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_FyLWgK87Edih9-GG5afQ0g", "Classifier_Specification"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_FyLWga87Edih9-GG5afQ0g", "Classifier_Specification-extension_Specification"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_FyLWhK87Edih9-GG5afQ0g", "Subsystem"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_FyLWiK87Edih9-GG5afQ0g", "Subsystem-base_Component"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_FyLWha87Edih9-GG5afQ0g", "Component_Subsystem"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_FyLWhq87Edih9-GG5afQ0g", "Component_Subsystem-extension_Subsystem"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_Ox98AK87Edih9-GG5afQ0g", "Metamodel"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_O1-5VK87Edih9-GG5afQ0g", "Metamodel-base_Model"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_O1-5Ua87Edih9-GG5afQ0g", "Model_Metamodel"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_O1-5Uq87Edih9-GG5afQ0g", "Model_Metamodel-extension_Metamodel"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_O1-5Va87Edih9-GG5afQ0g", "SystemModel"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_O2E_8687Edih9-GG5afQ0g", "SystemModel-base_Model"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_O2E_8K87Edih9-GG5afQ0g", "Model_SystemModel"); //$NON-NLS-1$ //$NON-NLS-2$
//					fragmentMap.put("_O2E_8a87Edih9-GG5afQ0g", "Model_SystemModel-extension_SystemModel"); //$NON-NLS-1$ //$NON-NLS-2$

					// Ecore.profile.uml2 -> Ecore.profile.uml

					fragmentMap.put("_siPt4K87Edi5QpYeY_yIpg", "_0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_ui4v8K87Edi5QpYeY_yIpg", "EPackage"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_urq4g687Edi5QpYeY_yIpg", "EPackage-base_Package"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_ur9MYa87Edi5QpYeY_yIpg", "EPackage-packageName"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_ur9MYq87Edi5QpYeY_yIpg", "EPackage-nsPrefix"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_ur9MY687Edi5QpYeY_yIpg", "EPackage-nsURI"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_ur9MZK87Edi5QpYeY_yIpg", "EPackage-basePackage"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_ur9MZa87Edi5QpYeY_yIpg", "EPackage-prefix"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_urq4gK87Edi5QpYeY_yIpg", "Package_EPackage"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_urq4ga87Edi5QpYeY_yIpg", "Package_EPackage-extension_EPackage"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_ur9MZq87Edi5QpYeY_yIpg", "ENamedElement"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_usDTAK87Edi5QpYeY_yIpg", "ENamedElement-xmlName"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_usDTAa87Edi5QpYeY_yIpg", "EClassifier"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_usJZoK87Edi5QpYeY_yIpg", "EClassifier-_generalization.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_usJZoa87Edi5QpYeY_yIpg", "EClassifier-instanceClassName"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_usJZoq87Edi5QpYeY_yIpg", "Extend"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_usPgQ687Edi5QpYeY_yIpg", "Extend-base_Generalization"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_usPgQK87Edi5QpYeY_yIpg", "Generalization_Extend"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_usPgQa87Edi5QpYeY_yIpg", "Generalization_Extend-extension_Extend"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_usPgRK87Edi5QpYeY_yIpg", "ContentKind"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_usPgRa87Edi5QpYeY_yIpg", "ContentKind-Unspecified"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_usPgRq87Edi5QpYeY_yIpg", "ContentKind-Empty"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_usPgR687Edi5QpYeY_yIpg", "ContentKind-Simple"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_usPgSK87Edi5QpYeY_yIpg", "ContentKind-Mixed"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_usPgSa87Edi5QpYeY_yIpg", "ContentKind-ElementOnly"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_usPgSq87Edi5QpYeY_yIpg", "EClass"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_usbtiK87Edi5QpYeY_yIpg", "EClass-_generalization.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_usbtg687Edi5QpYeY_yIpg", "EClass-base_Class"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_usbth687Edi5QpYeY_yIpg", "EClass-base_Interface"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_usbtia87Edi5QpYeY_yIpg", "EClass-className"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_usbtiq87Edi5QpYeY_yIpg", "EClass-xmlContentKind"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_usbtgK87Edi5QpYeY_yIpg", "Class_EClass"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_usbtga87Edi5QpYeY_yIpg", "Class_EClass-extension_EClass"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_usbthK87Edi5QpYeY_yIpg", "Interface_EClass"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_usbtha87Edi5QpYeY_yIpg", "Interface_EClass-extension_EClass"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_usbti687Edi5QpYeY_yIpg", "EDataType"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_ush0Ja87Edi5QpYeY_yIpg", "EDataType-_generalization.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_ush0JK87Edi5QpYeY_yIpg", "EDataType-base_PrimitiveType"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_ush0Jq87Edi5QpYeY_yIpg", "EDataType-dataTypeName"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_ush0Ia87Edi5QpYeY_yIpg", "PrimitiveType_EDataType"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_ush0Iq87Edi5QpYeY_yIpg", "PrimitiveType_EDataType-extension_EDataType"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_ush0J687Edi5QpYeY_yIpg", "EEnum"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_usn6xa87Edi5QpYeY_yIpg", "EEnum-_generalization.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_usn6xK87Edi5QpYeY_yIpg", "EEnum-base_Enumeration"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_usn6xq87Edi5QpYeY_yIpg", "EEnum-enumName"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_usn6wa87Edi5QpYeY_yIpg", "Enumeration_EEnum"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_usn6wq87Edi5QpYeY_yIpg", "Enumeration_EEnum-extension_EEnum"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_usn6x687Edi5QpYeY_yIpg", "EEnumLiteral"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_us0IBK87Edi5QpYeY_yIpg", "EEnumLiteral-_generalization.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_us0IA687Edi5QpYeY_yIpg", "EEnumLiteral-base_EnumerationLiteral"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_us0IBa87Edi5QpYeY_yIpg", "EEnumLiteral-enumLiteralName"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_us0IAK87Edi5QpYeY_yIpg", "EnumerationLiteral_EEnumLiteral"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_us0IAa87Edi5QpYeY_yIpg", "EnumerationLiteral_EEnumLiteral-extension_EEnumLiteral"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_us0IBq87Edi5QpYeY_yIpg", "EOperation"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_us6OpK87Edi5QpYeY_yIpg", "EOperation-base_Operation"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_us6Opa87Edi5QpYeY_yIpg", "EOperation-operationName"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_us6Ooa87Edi5QpYeY_yIpg", "Operation_EOperation"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_us6Ooq87Edi5QpYeY_yIpg", "Operation_EOperation-extension_EOperation"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_utA8UK87Edi5QpYeY_yIpg", "EParameter"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_utA8Va87Edi5QpYeY_yIpg", "EParameter-base_Parameter"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_utA8Vq87Edi5QpYeY_yIpg", "EParameter-parameterName"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_utA8Uq87Edi5QpYeY_yIpg", "Parameter_EParameter"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_utA8U687Edi5QpYeY_yIpg", "Parameter_EParameter-extension_EParameter"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_utA8V687Edi5QpYeY_yIpg", "FeatureKind"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_utA8WK87Edi5QpYeY_yIpg", "FeatureKind-Unspecified"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_utA8Wa87Edi5QpYeY_yIpg", "FeatureKind-Simple"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_utA8Wq87Edi5QpYeY_yIpg", "FeatureKind-Attribute"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_utA8W687Edi5QpYeY_yIpg", "FeatureKind-Element"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_0OdAscezEdmTJL3rR1ioJg", "FeatureKind-AttributeWildcard"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_0OdAssezEdmTJL3rR1ioJg", "FeatureKind-ElementWildcard"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_0OdAs8ezEdmTJL3rR1ioJg", "FeatureKind-Group"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_utA8XK87Edi5QpYeY_yIpg", "EStructuralFeature"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_utA8Xa87Edi5QpYeY_yIpg", "EStructuralFeature-_generalization.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_utHC8a87Edi5QpYeY_yIpg", "EStructuralFeature-isTransient"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_utHC8q87Edi5QpYeY_yIpg", "EStructuralFeature-isVolatile"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_utHC8687Edi5QpYeY_yIpg", "EStructuralFeature-isUnsettable"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_utHC9K87Edi5QpYeY_yIpg", "EStructuralFeature-xmlNamespace"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_utHC9a87Edi5QpYeY_yIpg", "EStructuralFeature-xmlFeatureKind"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_LtgO5jmHEdmHabrnfLjH-w", "EStructuralFeature-visibility"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_utHC9q87Edi5QpYeY_yIpg", "EAttribute"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_utHC_K87Edi5QpYeY_yIpg", "EAttribute-_generalization.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_utHC-687Edi5QpYeY_yIpg", "EAttribute-base_Property"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_utHC_a87Edi5QpYeY_yIpg", "EAttribute-attributeName"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_utHC_q87Edi5QpYeY_yIpg", "EAttribute-isID"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_utHC-K87Edi5QpYeY_yIpg", "Property_EAttribute"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_utHC-a87Edi5QpYeY_yIpg", "Property_EAttribute-extension_EAttribute"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_utNJkK87Edi5QpYeY_yIpg", "EReference"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_utNJla87Edi5QpYeY_yIpg", "EReference-_generalization.0"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_utNJlK87Edi5QpYeY_yIpg", "EReference-base_Property"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_utNJlq87Edi5QpYeY_yIpg", "EReference-referenceName"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_utNJl687Edi5QpYeY_yIpg", "EReference-isResolveProxies"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_utNJka87Edi5QpYeY_yIpg", "Property_EReference"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_utNJkq87Edi5QpYeY_yIpg", "Property_EReference-extension_EReference"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_LtaIQDmHEdmHabrnfLjH-w", "VisibilityKind"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_LtgO4DmHEdmHabrnfLjH-w", "VisibilityKind-Unspecified"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_LtgO4TmHEdmHabrnfLjH-w", "VisibilityKind-None"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_LtgO4jmHEdmHabrnfLjH-w", "VisibilityKind-ReadOnly"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_LtgO4zmHEdmHabrnfLjH-w", "VisibilityKind-ReadWrite"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_LtgO5DmHEdmHabrnfLjH-w", "VisibilityKind-ReadOnlyUnsettable"); //$NON-NLS-1$ //$NON-NLS-2$
					fragmentMap.put("_LtgO5TmHEdmHabrnfLjH-w", "VisibilityKind-ReadWriteUnsettable"); //$NON-NLS-1$ //$NON-NLS-2$
				}
			}
		}

		return fragmentMap;
	}

	protected static Map<String, Map<String, Map<EClassifier, String>>> typeToTypeMap = null;

	public static Map<String, Map<String, Map<EClassifier, String>>> getTypeToTypeMap() {

		if (typeToTypeMap == null) {

			synchronized (UML22UMLExtendedMetaData.class) {

				if (typeToTypeMap == null) {
					typeToTypeMap = new HashMap<String, Map<String, Map<EClassifier, String>>>();

					Map<EClassifier, String> typeMap = null;
					Map<String, Map<EClassifier, String>> featureMap = null;

					typeMap = new HashMap<EClassifier, String>();
					typeMap.put(UMLPackage.Literals.INTERACTION, "uml:EventOccurrence"); //$NON-NLS-1$
					typeMap.put(UMLPackage.Literals.INTERACTION_OPERAND, "uml:EventOccurrence"); //$NON-NLS-1$
					featureMap = new HashMap<String, Map<EClassifier, String>>();
					featureMap.put("fragment", typeMap); //$NON-NLS-1$
					typeToTypeMap.put("uml:Stop", featureMap); //$NON-NLS-1$

					typeMap = new HashMap<EClassifier, String>();
					typeMap.put(UMLPackage.Literals.DESTROY_LINK_ACTION, "uml:LinkEndDestructionData"); //$NON-NLS-1$
					featureMap = new HashMap<String, Map<EClassifier, String>>();
					featureMap.put("endData", typeMap); //$NON-NLS-1$
					typeToTypeMap.put("uml:LinkEndCreationData", featureMap); //$NON-NLS-1$
					typeToTypeMap.put("uml:LinkEndData", featureMap); //$NON-NLS-1$

					typeMap = new HashMap<EClassifier, String>();
					typeMap.put(UMLPackage.Literals.ACTIVITY, "uml:CallBehaviorAction"); //$NON-NLS-1$
					featureMap = new HashMap<String, Map<EClassifier, String>>();
					featureMap.put("node", typeMap); //$NON-NLS-1$
					typeToTypeMap.put("uml:ApplyFunctionAction", featureMap); //$NON-NLS-1$

					typeMap = new HashMap<EClassifier, String>();
					typeMap.put(UMLPackage.Literals.ACTIVITY, "uml:Action"); //$NON-NLS-1$
					featureMap = new HashMap<String, Map<EClassifier, String>>();
					featureMap.put("node", typeMap); //$NON-NLS-1$
					typeToTypeMap.put("uml:DurationObservationAction", featureMap); //$NON-NLS-1$
					typeToTypeMap.put("uml:TimeObservationAction", featureMap); //$NON-NLS-1$

					typeMap = new HashMap<EClassifier, String>();
					typeMap.put(UMLPackage.Literals.BEHAVIORED_CLASSIFIER, "uml:Trigger"); //$NON-NLS-1$
					featureMap = new HashMap<String, Map<EClassifier, String>>();
					featureMap.put("ownedTrigger", typeMap); //$NON-NLS-1$
					typeToTypeMap.put("uml:AnyTrigger", featureMap); //$NON-NLS-1$
					typeToTypeMap.put("uml:CallTrigger", featureMap); //$NON-NLS-1$
					typeToTypeMap.put("uml:ChangeTrigger", featureMap); //$NON-NLS-1$
					typeToTypeMap.put("uml:SignalTrigger", featureMap); //$NON-NLS-1$
					typeToTypeMap.put("uml:TimeTrigger", featureMap); //$NON-NLS-1$

					typeMap = new HashMap<EClassifier, String>();
					typeMap.put(UMLPackage.Literals.NAMESPACE, "uml:Dependency"); //$NON-NLS-1$
					featureMap = new HashMap<String, Map<EClassifier, String>>();
					featureMap.put("packagedElement", typeMap); //$NON-NLS-1$
					typeToTypeMap.put("uml:Permission", featureMap); //$NON-NLS-1$

					typeMap = new HashMap<EClassifier, String>();
					typeMap.put(UMLPackage.Literals.NAMED_ELEMENT, "uml:OpaqueExpression"); //$NON-NLS-1$
					featureMap = new HashMap<String, Map<EClassifier, String>>();
					featureMap.put("mapping", typeMap); //$NON-NLS-1$
					featureMap.put("selector", typeMap); //$NON-NLS-1$
					typeToTypeMap.put("uml:Expression", featureMap); //$NON-NLS-1$
				}
			}
		}

		return typeToTypeMap;
	}

	protected static Map<String, Map<EClassifier, String>> featureToTypeMap = null;

	public static Map<String, Map<EClassifier, String>> getFeatureToTypeMap() {

		if (featureToTypeMap == null) {

			synchronized (UML22UMLExtendedMetaData.class) {

				if (featureToTypeMap == null) {
					featureToTypeMap = new HashMap<String, Map<EClassifier, String>>();

					Map<EClassifier, String> typeMap = null;

					typeMap = new HashMap<EClassifier, String>();
					typeMap.put(UMLPackage.Literals.INTERACTION_USE, "uml:InputPin"); //$NON-NLS-1$
					featureToTypeMap.put("argument", typeMap); //$NON-NLS-1$

					typeMap = new HashMap<EClassifier, String>();
					typeMap.put(UMLPackage.Literals.COMMENT, "uml:StringExpression"); //$NON-NLS-1$
					featureToTypeMap.put("bodyExpression", typeMap); //$NON-NLS-1$

					typeMap = new HashMap<EClassifier, String>();
					typeMap.put(UMLPackage.Literals.OPAQUE_ACTION, "uml:Duration"); //$NON-NLS-1$
					featureToTypeMap.put("duration", typeMap); //$NON-NLS-1$

					typeMap = new HashMap<EClassifier, String>();
					typeMap.put(UMLPackage.Literals.TRANSITION, "uml:Activity"); //$NON-NLS-1$
					featureToTypeMap.put("effect", typeMap); //$NON-NLS-1$

					typeMap = new HashMap<EClassifier, String>();
					typeMap.put(UMLPackage.Literals.STATE, "uml:Activity"); //$NON-NLS-1$
					featureToTypeMap.put("doActivity", typeMap); //$NON-NLS-1$
					featureToTypeMap.put("entry", typeMap); //$NON-NLS-1$
					featureToTypeMap.put("exit", typeMap); //$NON-NLS-1$

					typeMap = new HashMap<EClassifier, String>();
					typeMap.put(UMLPackage.Literals.BEHAVIORAL_FEATURE, "uml:Parameter"); //$NON-NLS-1$
					featureToTypeMap.put("formalParameter", typeMap); //$NON-NLS-1$

					typeMap = new HashMap<EClassifier, String>();
					typeMap.put(UMLPackage.Literals.OPAQUE_ACTION, "uml:TimeExpression"); //$NON-NLS-1$
					featureToTypeMap.put("now", typeMap); //$NON-NLS-1$

					typeMap = new HashMap<EClassifier, String>();
					typeMap.put(UMLPackage.Literals.TRIGGER, "uml:Operation"); //$NON-NLS-1$
					featureToTypeMap.put("operation", typeMap); //$NON-NLS-1$

					typeMap = new HashMap<EClassifier, String>();
					typeMap.put(UMLPackage.Literals.BEHAVIORED_CLASSIFIER, "uml:StateMachine"); //$NON-NLS-1$
					featureToTypeMap.put("ownedStateMachine", typeMap); //$NON-NLS-1$

					typeMap = new HashMap<EClassifier, String>();
					typeMap.put(UMLPackage.Literals.CLASSIFIER, "uml:RedefinableTemplateSignature"); //$NON-NLS-1$
					featureToTypeMap.put("ownedTemplateSignature", typeMap); //$NON-NLS-1$

					typeMap = new HashMap<EClassifier, String>();
					typeMap.put(UMLPackage.Literals.PACKAGE, "uml:PackageMerge"); //$NON-NLS-1$
					featureToTypeMap.put("packageExtension", typeMap); //$NON-NLS-1$

					typeMap = new HashMap<EClassifier, String>();
					typeMap.put(UMLPackage.Literals.NAMESPACE, "uml:PackageImport"); //$NON-NLS-1$
					featureToTypeMap.put("packageImport", typeMap); //$NON-NLS-1$

					typeMap = new HashMap<EClassifier, String>();
					typeMap.put(UMLPackage.Literals.MESSAGE_END, "uml:Message"); //$NON-NLS-1$
					featureToTypeMap.put("receiveMessage", typeMap); //$NON-NLS-1$

					typeMap = new HashMap<EClassifier, String>();
					typeMap.put(UMLPackage.Literals.BEHAVIORAL_FEATURE, "uml:Parameter"); //$NON-NLS-1$
					featureToTypeMap.put("returnResult", typeMap); //$NON-NLS-1$

					typeMap = new HashMap<EClassifier, String>();
					typeMap.put(UMLPackage.Literals.LIFELINE, "uml:OpaqueExpression"); //$NON-NLS-1$
					featureToTypeMap.put("selector", typeMap); //$NON-NLS-1$

					typeMap = new HashMap<EClassifier, String>();
					typeMap.put(UMLPackage.Literals.MESSAGE_END, "uml:Message"); //$NON-NLS-1$
					featureToTypeMap.put("sendMessage", typeMap); //$NON-NLS-1$

					typeMap = new HashMap<EClassifier, String>();
					typeMap.put(UMLPackage.Literals.TRIGGER, "uml:Signal"); //$NON-NLS-1$
					featureToTypeMap.put("signal", typeMap); //$NON-NLS-1$	
					
					typeMap = new HashMap<EClassifier, String>();
					typeMap.put(UMLPackage.Literals.PROPERTY, "uml:TemplateSignature"); //$NON-NLS-1$
					featureToTypeMap.put("ownedTemplateSignature", typeMap); //$NON-NLS-1$

					typeMap = new HashMap<EClassifier, String>();
					typeMap.put(UMLPackage.Literals.PROPERTY, "uml:TemplateBinding"); //$NON-NLS-1$
					featureToTypeMap.put("templateBinding", typeMap); //$NON-NLS-1$

					typeMap = new HashMap<EClassifier, String>();
					typeMap.put(UMLPackage.Literals.CLASSIFIER_TEMPLATE_PARAMETER,
						"uml:Classifier"); //$NON-NLS-1$
					featureToTypeMap.put("defaultClassifier", typeMap); //$NON-NLS-1$
				}
			}
		}

		return featureToTypeMap;
	}

	public UML22UMLExtendedMetaData(EPackage.Registry ePackageRegistry,
			Ecore2XMLRegistry ecore2xmlRegistry) {
		super(ePackageRegistry, ecore2xmlRegistry);
	}

}
