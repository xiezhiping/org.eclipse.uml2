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
 * $Id: UML22UMLExtendedMetadata.java,v 1.2 2006/03/09 21:03:28 khussey Exp $
 */
package org.eclipse.uml2.uml.resource;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.mapping.ecore2xml.Ecore2XMLRegistry;
import org.eclipse.emf.mapping.ecore2xml.util.Ecore2XMLExtendedMetaData;
import org.eclipse.uml2.uml.UMLPackage;

public class UML22UMLExtendedMetadata
		extends Ecore2XMLExtendedMetaData {

	protected static final String UML2Resource__ECORE_PRIMITIVE_TYPES_LIBRARY_URI = "pathmap://UML2_LIBRARIES/EcorePrimitiveTypes.library.uml2"; //$NON-NLS-1$

	protected static final String UML2Resource__JAVA_PRIMITIVE_TYPES_LIBRARY_URI = "pathmap://UML2_LIBRARIES/JavaPrimitiveTypes.library.uml2"; //$NON-NLS-1$

	protected static final String UML2Resource__UML2_PRIMITIVE_TYPES_LIBRARY_URI = "pathmap://UML2_LIBRARIES/UML2PrimitiveTypes.library.uml2"; //$NON-NLS-1$

	protected static final String UML2Resource__ECORE_METAMODEL_URI = "pathmap://UML2_METAMODELS/Ecore.metamodel.uml2"; //$NON-NLS-1$

	protected static final String UML2Resource__UML2_METAMODEL_URI = "pathmap://UML2_METAMODELS/UML2.metamodel.uml2"; //$NON-NLS-1$

	protected static final String UML2Resource__BASIC_PROFILE_URI = "pathmap://UML2_PROFILES/Basic.profile.uml2"; //$NON-NLS-1$

	protected static final String UML2Resource__INTERMEDIATE_PROFILE_URI = "pathmap://UML2_PROFILES/Intermediate.profile.uml2"; //$NON-NLS-1$

	protected static final String UML2Resource__COMPLETE_PROFILE_URI = "pathmap://UML2_PROFILES/Complete.profile.uml2"; //$NON-NLS-1$

	protected static final String UML2Resource__ECORE_PROFILE_URI = "pathmap://UML2_PROFILES/Ecore.profile.uml2"; //$NON-NLS-1$

	protected static Map uriMap = null;

	public static Map getURIMap() {

		if (uriMap == null) {
			uriMap = new HashMap();

			uriMap.put(URI
				.createURI(UML2Resource__ECORE_PRIMITIVE_TYPES_LIBRARY_URI),
				URI.createURI(UMLResource.ECORE_PRIMITIVE_TYPES_LIBRARY_URI));
			uriMap.put(URI
				.createURI(UML2Resource__JAVA_PRIMITIVE_TYPES_LIBRARY_URI), URI
				.createURI(UMLResource.JAVA_PRIMITIVE_TYPES_LIBRARY_URI));
			uriMap.put(URI
				.createURI(UML2Resource__UML2_PRIMITIVE_TYPES_LIBRARY_URI), URI
				.createURI(UMLResource.UML_PRIMITIVE_TYPES_LIBRARY_URI));

			uriMap.put(URI.createURI(UML2Resource__ECORE_METAMODEL_URI), URI
				.createURI(UMLResource.ECORE_METAMODEL_URI));
			uriMap.put(URI.createURI(UML2Resource__UML2_METAMODEL_URI), URI
				.createURI(UMLResource.UML_METAMODEL_URI));

			uriMap.put(URI.createURI(UML2Resource__BASIC_PROFILE_URI), URI
				.createURI(UMLResource.STANDARD_PROFILE_URI));
			uriMap.put(URI.createURI(UML2Resource__INTERMEDIATE_PROFILE_URI),
				URI.createURI(UMLResource.STANDARD_PROFILE_URI));
			uriMap.put(URI.createURI(UML2Resource__COMPLETE_PROFILE_URI), URI
				.createURI(UMLResource.STANDARD_PROFILE_URI));
			uriMap.put(URI.createURI(UML2Resource__ECORE_PROFILE_URI), URI
				.createURI(UMLResource.ECORE_PROFILE_URI));
		}

		return uriMap;
	}

	protected static Map fragmentMap = null;

	public static Map getFragmentMap() {

		if (fragmentMap == null) {
			fragmentMap = new HashMap();

			// EcorePrimitiveTypes.library.uml2 ->
			// EcorePrimitiveTypes.library.uml

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
			fragmentMap.put("_utHC9q87Edi5QpYeY_yIpg", "EAttribute"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_utA8XK87Edi5QpYeY_yIpg", "EStructuralFeature"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m8eNva86EdiEh75YJ_3n8g", "ETypedElement"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_ur9MZq87Edi5QpYeY_yIpg", "ENamedElement"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m8eN0a86EdiEh75YJ_3n8g", "EModelElement"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m8kUlq86EdiEh75YJ_3n8g", "EAnnotation"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put(
				"_m8kUp686EdiEh75YJ_3n8g", "EStringToStringMapEntry"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_usDTAa87Edi5QpYeY_yIpg", "EClassifier"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_ui4v8K87Edi5QpYeY_yIpg", "EPackage"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m8kUTK86EdiEh75YJ_3n8g", "EFactory"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_usPgSq87Edi5QpYeY_yIpg", "EClass"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_us0IBq87Edi5QpYeY_yIpg", "EOperation"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_utA8UK87Edi5QpYeY_yIpg", "EParameter"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_utNJkK87Edi5QpYeY_yIpg", "EReference"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_usbti687Edi5QpYeY_yIpg", "EDataType"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_ush0J687Edi5QpYeY_yIpg", "EEnum"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_usn6x687Edi5QpYeY_yIpg", "EEnumLiteral"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m8eN2a86EdiEh75YJ_3n8g", "EObject"); //$NON-NLS-1$ //$NON-NLS-2$

			// UML2.metamodel.uml2 -> UML.metamodel.uml

			fragmentMap.put("_m8qbA686EdiEh75YJ_3n8g", "_0"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m8qbJK86EdiEh75YJ_3n8g", "Comment"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m8qbC686EdiEh75YJ_3n8g", "Element"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m82oYa86EdiEh75YJ_3n8g", "Package"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m8whhK86EdiEh75YJ_3n8g", "Namespace"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m8qb_a86EdiEh75YJ_3n8g", "NamedElement"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9C2JK86EdiEh75YJ_3n8g", "Dependency"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m8whwa86EdiEh75YJ_3n8g", "PackageableElement"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m8qbga86EdiEh75YJ_3n8g", "ParameterableElement"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m8qbca86EdiEh75YJ_3n8g", "TemplateParameter"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m8qbXq86EdiEh75YJ_3n8g", "TemplateSignature"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m8qbL686EdiEh75YJ_3n8g", "TemplateableElement"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m8qbO686EdiEh75YJ_3n8g", "TemplateBinding"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m8qbSq86EdiEh75YJ_3n8g", "DirectedRelationship"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m8qbUq86EdiEh75YJ_3n8g", "Relationship"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put(
				"_m8qbka86EdiEh75YJ_3n8g", "TemplateParameterSubstitution"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m8qbqK86EdiEh75YJ_3n8g", "StringExpression"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9bRs686EdiEh75YJ_3n8g", "Expression"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m8qb6q86EdiEh75YJ_3n8g", "ValueSpecification"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m8qb-a86EdiEh75YJ_3n8g", "TypedElement"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m82oi686EdiEh75YJ_3n8g", "Type"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9VJSq86EdiEh75YJ_3n8g", "Association"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m88vAa86EdiEh75YJ_3n8g", "Classifier"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m88vXa86EdiEh75YJ_3n8g", "RedefinableElement"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9C1da86EdiEh75YJ_3n8g", "Generalization"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9C1h686EdiEh75YJ_3n8g", "GeneralizationSet"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9C1la86EdiEh75YJ_3n8g", "Property"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9C16686EdiEh75YJ_3n8g", "StructuralFeature"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9C1aa86EdiEh75YJ_3n8g", "Feature"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m8qbtK86EdiEh75YJ_3n8g", "MultiplicityElement"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9C18a86EdiEh75YJ_3n8g", "ConnectableElement"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9C1-K86EdiEh75YJ_3n8g", "ConnectorEnd"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9C2BK86EdiEh75YJ_3n8g", "DeploymentTarget"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9C2Ea86EdiEh75YJ_3n8g", "Deployment"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9C2MK86EdiEh75YJ_3n8g", "DeployedArtifact"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put(
				"_m9C2NK86EdiEh75YJ_3n8g", "DeploymentSpecification"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9C2Oq86EdiEh75YJ_3n8g", "Artifact"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9C2ja86EdiEh75YJ_3n8g", "Operation"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9I8Kq86EdiEh75YJ_3n8g", "BehavioralFeature"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9C2dK86EdiEh75YJ_3n8g", "Parameter"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9PCoK86EdiEh75YJ_3n8g", "ParameterSet"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m8whsa86EdiEh75YJ_3n8g", "Constraint"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9I8Ua86EdiEh75YJ_3n8g", "Behavior"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m88uxq86EdiEh75YJ_3n8g", "Class"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap
				.put("_m9bRVq86EdiEh75YJ_3n8g", "EncapsulatedClassifier"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9bRAa86EdiEh75YJ_3n8g", "StructuredClassifier"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9bRH686EdiEh75YJ_3n8g", "Connector"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9VKQa86EdiEh75YJ_3n8g", "Port"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9VJoq86EdiEh75YJ_3n8g", "Interface"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9VJx686EdiEh75YJ_3n8g", "Reception"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9VJza86EdiEh75YJ_3n8g", "Signal"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9VJ2q86EdiEh75YJ_3n8g", "ProtocolStateMachine"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9VJ4a86EdiEh75YJ_3n8g", "StateMachine"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9bP8q86EdiEh75YJ_3n8g", "State"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9VKC686EdiEh75YJ_3n8g", "Vertex"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9VKGK86EdiEh75YJ_3n8g", "Transition"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9VJ8686EdiEh75YJ_3n8g", "Region"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9VKOq86EdiEh75YJ_3n8g", "Trigger"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put(
				"_m9bQH686EdiEh75YJ_3n8g", "ConnectionPointReference"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9bQKa86EdiEh75YJ_3n8g", "Pseudostate"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9bQn686EdiEh75YJ_3n8g", "ProtocolConformance"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m88u6686EdiEh75YJ_3n8g", "BehavioredClassifier"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9VJfa86EdiEh75YJ_3n8g", "Realization"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9C2YK86EdiEh75YJ_3n8g", "Abstraction"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9C2aK86EdiEh75YJ_3n8g", "OpaqueExpression"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9bRZq86EdiEh75YJ_3n8g", "Extension"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9PCsa86EdiEh75YJ_3n8g", "DataType"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9C2Wa86EdiEh75YJ_3n8g", "Manifestation"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9VJca86EdiEh75YJ_3n8g", "Substitution"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9bQ-a86EdiEh75YJ_3n8g", "Collaboration"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9bQtq86EdiEh75YJ_3n8g", "UseCase"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9bQx686EdiEh75YJ_3n8g", "Include"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9bQ0686EdiEh75YJ_3n8g", "Extend"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9bQ6K86EdiEh75YJ_3n8g", "ExtensionPoint"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put(
				"_m9neA686EdiEh75YJ_3n8g", "RedefinableTemplateSignature"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m82oNK86EdiEh75YJ_3n8g", "ElementImport"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m82oT686EdiEh75YJ_3n8g", "PackageImport"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9bRea86EdiEh75YJ_3n8g", "Enumeration"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9bRga86EdiEh75YJ_3n8g", "EnumerationLiteral"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9bRh686EdiEh75YJ_3n8g", "InstanceSpecification"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9bRnq86EdiEh75YJ_3n8g", "Slot"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9bRsa86EdiEh75YJ_3n8g", "PrimitiveType"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m82orq86EdiEh75YJ_3n8g", "Profile"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9ndba86EdiEh75YJ_3n8g", "Model"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m88uxK86EdiEh75YJ_3n8g", "Stereotype"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m82op686EdiEh75YJ_3n8g", "ProfileApplication"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m82ol686EdiEh75YJ_3n8g", "PackageMerge"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9ndTa86EdiEh75YJ_3n8g", "ExtensionEnd"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put(
				"_m9nd-686EdiEh75YJ_3n8g", "OperationTemplateParameter"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap
				.put(
					"_m9neCK86EdiEh75YJ_3n8g", "ConnectableElementTemplateParameter"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put(
				"_m9nd_a86EdiEh75YJ_3n8g", "ClassifierTemplateParameter"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9ndKK86EdiEh75YJ_3n8g", "LiteralSpecification"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9ndOK86EdiEh75YJ_3n8g", "LiteralInteger"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9ndKq86EdiEh75YJ_3n8g", "LiteralString"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9ndIK86EdiEh75YJ_3n8g", "LiteralBoolean"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9ndMq86EdiEh75YJ_3n8g", "LiteralNull"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9ndSK86EdiEh75YJ_3n8g", "InstanceValue"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put(
				"_m9ndQK86EdiEh75YJ_3n8g", "LiteralUnlimitedNatural"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9VK5q86EdiEh75YJ_3n8g", "Action"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9VK-q86EdiEh75YJ_3n8g", "ExecutableNode"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9VKlq86EdiEh75YJ_3n8g", "ActivityNode"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap
				.put("_m9VKza86EdiEh75YJ_3n8g", "StructuredActivityNode"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9VKs686EdiEh75YJ_3n8g", "ActivityGroup"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9VKYK86EdiEh75YJ_3n8g", "Activity"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9bQXa86EdiEh75YJ_3n8g", "Variable"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9VKfK86EdiEh75YJ_3n8g", "ActivityEdge"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9bQZ686EdiEh75YJ_3n8g", "ActivityPartition"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put(
				"_m9bQgq86EdiEh75YJ_3n8g", "InterruptibleActivityRegion"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9VLAq86EdiEh75YJ_3n8g", "ExceptionHandler"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9VLD686EdiEh75YJ_3n8g", "ObjectNode"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9bQTa86EdiEh75YJ_3n8g", "OutputPin"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9bQT686EdiEh75YJ_3n8g", "Pin"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9bQVK86EdiEh75YJ_3n8g", "InputPin"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9ndmK86EdiEh75YJ_3n8g", "ValuePin"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9nfza86EdiEh75YJ_3n8g", "CallAction"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9nf1q86EdiEh75YJ_3n8g", "InvocationAction"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9nf5a86EdiEh75YJ_3n8g", "SendSignalAction"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9ngAK86EdiEh75YJ_3n8g", "CallOperationAction"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9ngCq86EdiEh75YJ_3n8g", "CallBehaviorAction"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9nda686EdiEh75YJ_3n8g", "Usage"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9ndc686EdiEh75YJ_3n8g", "ControlNode"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9ndda86EdiEh75YJ_3n8g", "ControlFlow"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9ndha86EdiEh75YJ_3n8g", "InitialNode"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9ndk686EdiEh75YJ_3n8g", "ActivityParameterNode"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9neXK86EdiEh75YJ_3n8g", "Message"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9neVa86EdiEh75YJ_3n8g", "MessageEnd"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9neCq86EdiEh75YJ_3n8g", "Interaction"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9neG686EdiEh75YJ_3n8g", "InteractionFragment"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9neLK86EdiEh75YJ_3n8g", "Lifeline"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9neQq86EdiEh75YJ_3n8g", "PartDecomposition"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9neU686EdiEh75YJ_3n8g", "Gate"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9neiK86EdiEh75YJ_3n8g", "GeneralOrdering"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9neq686EdiEh75YJ_3n8g", "InteractionOperand"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9net686EdiEh75YJ_3n8g", "InteractionConstraint"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9nexq86EdiEh75YJ_3n8g", "StateInvariant"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9ndca86EdiEh75YJ_3n8g", "Actor"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9ne8a86EdiEh75YJ_3n8g", "ForkNode"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9ne_K86EdiEh75YJ_3n8g", "FlowFinalNode"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9ndh686EdiEh75YJ_3n8g", "FinalNode"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9ne_q86EdiEh75YJ_3n8g", "CentralBufferNode"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9ndka86EdiEh75YJ_3n8g", "MergeNode"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9ndi686EdiEh75YJ_3n8g", "DecisionNode"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9ndia86EdiEh75YJ_3n8g", "ActivityFinalNode"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9VJjK86EdiEh75YJ_3n8g", "Component"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9ngza86EdiEh75YJ_3n8g", "Node"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9ng1686EdiEh75YJ_3n8g", "Device"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9ng2a86EdiEh75YJ_3n8g", "ExecutionEnvironment"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9ng2686EdiEh75YJ_3n8g", "CommunicationPath"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9ngHK86EdiEh75YJ_3n8g", "CombinedFragment"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9ngK686EdiEh75YJ_3n8g", "Continuation"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9nfAq86EdiEh75YJ_3n8g", "CreateObjectAction"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9nfDK86EdiEh75YJ_3n8g", "DestroyObjectAction"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9nfF686EdiEh75YJ_3n8g", "TestIdentityAction"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9nfJq86EdiEh75YJ_3n8g", "ReadSelfAction"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put(
				"_m9nfLa86EdiEh75YJ_3n8g", "StructuralFeatureAction"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put(
				"_m9nfN686EdiEh75YJ_3n8g", "ReadStructuralFeatureAction"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put(
				"_m9nfPq86EdiEh75YJ_3n8g", "WriteStructuralFeatureAction"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put(
				"_m9nfRa86EdiEh75YJ_3n8g", "ClearStructuralFeatureAction"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap
				.put(
					"_m9nfR686EdiEh75YJ_3n8g", "RemoveStructuralFeatureValueAction"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put(
				"_m9nfSa86EdiEh75YJ_3n8g", "AddStructuralFeatureValueAction"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9nfU686EdiEh75YJ_3n8g", "LinkAction"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9nfWq86EdiEh75YJ_3n8g", "LinkEndData"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9nfaK86EdiEh75YJ_3n8g", "QualifierValue"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9nfcK86EdiEh75YJ_3n8g", "ReadLinkAction"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9nfd686EdiEh75YJ_3n8g", "LinkEndCreationData"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9nfga86EdiEh75YJ_3n8g", "CreateLinkAction"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9nfha86EdiEh75YJ_3n8g", "WriteLinkAction"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9nfh686EdiEh75YJ_3n8g", "DestroyLinkAction"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap
				.put("_m9nfia86EdiEh75YJ_3n8g", "ClearAssociationAction"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9nf7686EdiEh75YJ_3n8g", "BroadcastSignalAction"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9nf9K86EdiEh75YJ_3n8g", "SendObjectAction"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9ng8q86EdiEh75YJ_3n8g", "TimeExpression"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9ng-q86EdiEh75YJ_3n8g", "Duration"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9nhDq86EdiEh75YJ_3n8g", "DurationInterval"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9nhFK86EdiEh75YJ_3n8g", "Interval"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9nhIK86EdiEh75YJ_3n8g", "TimeConstraint"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9nhJq86EdiEh75YJ_3n8g", "IntervalConstraint"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9nhLK86EdiEh75YJ_3n8g", "TimeInterval"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9nhPa86EdiEh75YJ_3n8g", "DurationConstraint"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9nfAK86EdiEh75YJ_3n8g", "FinalState"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9nfk686EdiEh75YJ_3n8g", "VariableAction"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9nfmK86EdiEh75YJ_3n8g", "ReadVariableAction"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9nfn686EdiEh75YJ_3n8g", "WriteVariableAction"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9nfpq86EdiEh75YJ_3n8g", "ClearVariableAction"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap
				.put("_m9nfqK86EdiEh75YJ_3n8g", "AddVariableValueAction"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put(
				"_m9nfsq86EdiEh75YJ_3n8g", "RemoveVariableValueAction"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9ngxq86EdiEh75YJ_3n8g", "RaiseExceptionAction"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9ndU686EdiEh75YJ_3n8g", "InformationItem"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9ndWq86EdiEh75YJ_3n8g", "InformationFlow"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9ngRK86EdiEh75YJ_3n8g", "ReadExtentAction"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap
				.put("_m9ngTq86EdiEh75YJ_3n8g", "ReclassifyObjectAction"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put(
				"_m9ngYa86EdiEh75YJ_3n8g", "ReadIsClassifiedObjectAction"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put(
				"_m9ngea86EdiEh75YJ_3n8g", "ReadLinkObjectEndAction"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put(
				"_m9ngiK86EdiEh75YJ_3n8g", "ReadLinkObjectEndQualifierAction"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap
				.put("_m9ngl686EdiEh75YJ_3n8g", "CreateLinkObjectAction"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9ngoK86EdiEh75YJ_3n8g", "AcceptEventAction"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9ngrq86EdiEh75YJ_3n8g", "AcceptCallAction"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9ngt686EdiEh75YJ_3n8g", "ReplyAction"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9ne8686EdiEh75YJ_3n8g", "JoinNode"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9ng3a86EdiEh75YJ_3n8g", "DataStoreNode"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9ndd686EdiEh75YJ_3n8g", "ObjectFlow"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9ndna86EdiEh75YJ_3n8g", "ConditionalNode"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9ndrq86EdiEh75YJ_3n8g", "Clause"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9ndy686EdiEh75YJ_3n8g", "LoopNode"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9ngL686EdiEh75YJ_3n8g", "ExpansionNode"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9ngNq86EdiEh75YJ_3n8g", "ExpansionRegion"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9ng3686EdiEh75YJ_3n8g", "ProtocolTransition"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9ndZq86EdiEh75YJ_3n8g", "AssociationClass"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9bRRq86EdiEh75YJ_3n8g", "InterfaceRealization"); //$NON-NLS-1$ //$NON-NLS-2$

			// Basic.profile.uml2 -> Standard.profile.uml

			fragmentMap.put(
				"_6mFRgK86Edih9-GG5afQ0g", "_inxqMHMjEdqjLP0o6zXVqQ"); //$NON-NLS-1$ //$NON-NLS-2$

			// Intermediate.profile.uml2 -> Standard.profile.uml

			fragmentMap.put(
				"_Cz7csK87Edih9-GG5afQ0g", "_inxqMHMjEdqjLP0o6zXVqQ"); //$NON-NLS-1$ //$NON-NLS-2$

			// Complete.profile.uml2 -> Standard.profile.uml

			fragmentMap.put(
				"_M7pTkK87Edih9-GG5afQ0g", "_inxqMHMjEdqjLP0o6zXVqQ"); //$NON-NLS-1$ //$NON-NLS-2$
		}

		return fragmentMap;
	}

	public UML22UMLExtendedMetadata(EPackage.Registry ePackageRegistry,
			Ecore2XMLRegistry ecore2xmlRegistry) {
		super(ePackageRegistry, ecore2xmlRegistry);
	}

	public EStructuralFeature getElement(EClass eClass, String namespace,
			String name) {
		EStructuralFeature element = super.getElement(eClass, namespace, name);

		if (element == null) {

			if ("formalParameter".equals(name) || "returnResult".equals(name)) { //$NON-NLS-1$ //$NON-NLS-2$

				if (UMLPackage.Literals.BEHAVIOR.isSuperTypeOf(eClass)) {
					element = UMLPackage.Literals.BEHAVIOR__OWNED_PARAMETER;
				} else if (UMLPackage.Literals.BEHAVIORAL_FEATURE
					.isSuperTypeOf(eClass)) {

					element = UMLPackage.Literals.BEHAVIORAL_FEATURE__OWNED_PARAMETER;
				}
			} else if ("packageExtension".equals(name) && UMLPackage.Literals.PACKAGE.isSuperTypeOf(eClass)) { //$NON-NLS-1$
				element = UMLPackage.Literals.PACKAGE__PACKAGE_MERGE;
			}
		}

		return element;
	}

}
