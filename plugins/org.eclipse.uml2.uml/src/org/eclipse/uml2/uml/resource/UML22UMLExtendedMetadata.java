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
 * $Id: UML22UMLExtendedMetadata.java,v 1.3 2006/04/06 04:30:32 khussey Exp $
 */
package org.eclipse.uml2.uml.resource;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.mapping.ecore2xml.Ecore2XMLRegistry;

import org.eclipse.emf.mapping.ecore2xml.util.Ecore2XMLExtendedMetaData;

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

			uriMap.put(URI.createURI(UML2Resource__ECORE_PRIMITIVE_TYPES_LIBRARY_URI), URI.createURI(UMLResource.ECORE_PRIMITIVE_TYPES_LIBRARY_URI));
			uriMap.put(URI.createURI(UML2Resource__JAVA_PRIMITIVE_TYPES_LIBRARY_URI), URI.createURI(UMLResource.JAVA_PRIMITIVE_TYPES_LIBRARY_URI));
			uriMap.put(URI.createURI(UML2Resource__UML2_PRIMITIVE_TYPES_LIBRARY_URI), URI.createURI(UMLResource.UML_PRIMITIVE_TYPES_LIBRARY_URI));

			uriMap.put(URI.createURI(UML2Resource__ECORE_METAMODEL_URI), URI.createURI(UMLResource.ECORE_METAMODEL_URI));
			uriMap.put(URI.createURI(UML2Resource__UML2_METAMODEL_URI), URI.createURI(UMLResource.UML_METAMODEL_URI));

			uriMap.put(URI.createURI(UML2Resource__BASIC_PROFILE_URI), URI.createURI(UMLResource.STANDARD_PROFILE_URI));
			uriMap.put(URI.createURI(UML2Resource__INTERMEDIATE_PROFILE_URI), URI.createURI(UMLResource.STANDARD_PROFILE_URI));
			uriMap.put(URI.createURI(UML2Resource__COMPLETE_PROFILE_URI), URI.createURI(UMLResource.STANDARD_PROFILE_URI));
			uriMap.put(URI.createURI(UML2Resource__ECORE_PROFILE_URI), URI.createURI(UMLResource.ECORE_PROFILE_URI));
		}

		return uriMap;
	}

	protected static Map fragmentMap = null;

	public static Map getFragmentMap() {

		if (fragmentMap == null) {
			fragmentMap = new HashMap();

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
			fragmentMap.put("_utHC9q87Edi5QpYeY_yIpg", "EAttribute"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_utA8XK87Edi5QpYeY_yIpg", "EStructuralFeature"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m8eNva86EdiEh75YJ_3n8g", "ETypedElement"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_ur9MZq87Edi5QpYeY_yIpg", "ENamedElement"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m8eN0a86EdiEh75YJ_3n8g", "EModelElement"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m8kUlq86EdiEh75YJ_3n8g", "EAnnotation"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m8kUp686EdiEh75YJ_3n8g", "EStringToStringMapEntry"); //$NON-NLS-1$ //$NON-NLS-2$
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
			fragmentMap.put("_m8qbka86EdiEh75YJ_3n8g", "TemplateParameterSubstitution"); //$NON-NLS-1$ //$NON-NLS-2$
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
			fragmentMap.put("_m9C2NK86EdiEh75YJ_3n8g", "DeploymentSpecification"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9C2Oq86EdiEh75YJ_3n8g", "Artifact"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9C2ja86EdiEh75YJ_3n8g", "Operation"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9I8Kq86EdiEh75YJ_3n8g", "BehavioralFeature"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9C2dK86EdiEh75YJ_3n8g", "Parameter"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9PCoK86EdiEh75YJ_3n8g", "ParameterSet"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m8whsa86EdiEh75YJ_3n8g", "Constraint"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9I8Ua86EdiEh75YJ_3n8g", "Behavior"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m88uxq86EdiEh75YJ_3n8g", "Class"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9bRVq86EdiEh75YJ_3n8g", "EncapsulatedClassifier"); //$NON-NLS-1$ //$NON-NLS-2$
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
			fragmentMap.put("_m9bQH686EdiEh75YJ_3n8g", "ConnectionPointReference"); //$NON-NLS-1$ //$NON-NLS-2$
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
			fragmentMap.put("_m9neA686EdiEh75YJ_3n8g", "RedefinableTemplateSignature"); //$NON-NLS-1$ //$NON-NLS-2$
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
			fragmentMap.put("_m9nd-686EdiEh75YJ_3n8g", "OperationTemplateParameter"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9neCK86EdiEh75YJ_3n8g", "ConnectableElementTemplateParameter"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9nd_a86EdiEh75YJ_3n8g", "ClassifierTemplateParameter"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9ndKK86EdiEh75YJ_3n8g", "LiteralSpecification"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9ndOK86EdiEh75YJ_3n8g", "LiteralInteger"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9ndKq86EdiEh75YJ_3n8g", "LiteralString"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9ndIK86EdiEh75YJ_3n8g", "LiteralBoolean"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9ndMq86EdiEh75YJ_3n8g", "LiteralNull"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9ndSK86EdiEh75YJ_3n8g", "InstanceValue"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9ndQK86EdiEh75YJ_3n8g", "LiteralUnlimitedNatural"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9VK5q86EdiEh75YJ_3n8g", "Action"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9VK-q86EdiEh75YJ_3n8g", "ExecutableNode"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9VKlq86EdiEh75YJ_3n8g", "ActivityNode"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9VKza86EdiEh75YJ_3n8g", "StructuredActivityNode"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9VKs686EdiEh75YJ_3n8g", "ActivityGroup"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9VKYK86EdiEh75YJ_3n8g", "Activity"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9bQXa86EdiEh75YJ_3n8g", "Variable"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9VKfK86EdiEh75YJ_3n8g", "ActivityEdge"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9bQZ686EdiEh75YJ_3n8g", "ActivityPartition"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9bQgq86EdiEh75YJ_3n8g", "InterruptibleActivityRegion"); //$NON-NLS-1$ //$NON-NLS-2$
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
			fragmentMap.put("_m9nfLa86EdiEh75YJ_3n8g", "StructuralFeatureAction"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9nfN686EdiEh75YJ_3n8g", "ReadStructuralFeatureAction"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9nfPq86EdiEh75YJ_3n8g", "WriteStructuralFeatureAction"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9nfRa86EdiEh75YJ_3n8g", "ClearStructuralFeatureAction"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9nfR686EdiEh75YJ_3n8g", "RemoveStructuralFeatureValueAction"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9nfSa86EdiEh75YJ_3n8g", "AddStructuralFeatureValueAction"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9nfU686EdiEh75YJ_3n8g", "LinkAction"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9nfWq86EdiEh75YJ_3n8g", "LinkEndData"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9nfaK86EdiEh75YJ_3n8g", "QualifierValue"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9nfcK86EdiEh75YJ_3n8g", "ReadLinkAction"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9nfd686EdiEh75YJ_3n8g", "LinkEndCreationData"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9nfga86EdiEh75YJ_3n8g", "CreateLinkAction"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9nfha86EdiEh75YJ_3n8g", "WriteLinkAction"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9nfh686EdiEh75YJ_3n8g", "DestroyLinkAction"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9nfia86EdiEh75YJ_3n8g", "ClearAssociationAction"); //$NON-NLS-1$ //$NON-NLS-2$
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
			fragmentMap.put("_m9nfqK86EdiEh75YJ_3n8g", "AddVariableValueAction"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9nfsq86EdiEh75YJ_3n8g", "RemoveVariableValueAction"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9ngxq86EdiEh75YJ_3n8g", "RaiseExceptionAction"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9ndU686EdiEh75YJ_3n8g", "InformationItem"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9ndWq86EdiEh75YJ_3n8g", "InformationFlow"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9ngRK86EdiEh75YJ_3n8g", "ReadExtentAction"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9ngTq86EdiEh75YJ_3n8g", "ReclassifyObjectAction"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9ngYa86EdiEh75YJ_3n8g", "ReadIsClassifiedObjectAction"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9ngea86EdiEh75YJ_3n8g", "ReadLinkObjectEndAction"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9ngiK86EdiEh75YJ_3n8g", "ReadLinkObjectEndQualifierAction"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9ngl686EdiEh75YJ_3n8g", "CreateLinkObjectAction"); //$NON-NLS-1$ //$NON-NLS-2$
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
			fragmentMap.put("_m9bQ7686EdiEh75YJ_3n8g", "CollaborationUse"); //$NON-NLS-1$ //$NON-NLS-2$

			fragmentMap.put("_m82oJq86EdiEh75YJ_3n8g", "VisibilityKind"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m82oJ686EdiEh75YJ_3n8g", "VisibilityKind-public"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m82oKK86EdiEh75YJ_3n8g", "VisibilityKind-private"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m82oKa86EdiEh75YJ_3n8g", "VisibilityKind-protected"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m82oKq86EdiEh75YJ_3n8g", "VisibilityKind-package"); //$NON-NLS-1$ //$NON-NLS-2$

			fragmentMap.put("_m9PCza86EdiEh75YJ_3n8g", "ParameterDirectionKind"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9PCzq86EdiEh75YJ_3n8g", "ParameterDirectionKind-in"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9PCz686EdiEh75YJ_3n8g", "ParameterDirectionKind-inout"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9PC0K86EdiEh75YJ_3n8g", "ParameterDirectionKind-out"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9PC0a86EdiEh75YJ_3n8g", "ParameterDirectionKind-return"); //$NON-NLS-1$ //$NON-NLS-2$

			fragmentMap.put("_m9PC1K86EdiEh75YJ_3n8g", "ParameterEffectKind"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9PC1a86EdiEh75YJ_3n8g", "ParameterEffectKind-create"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9PC1q86EdiEh75YJ_3n8g", "ParameterEffectKind-read"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9PC1686EdiEh75YJ_3n8g", "ParameterEffectKind-update"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9PC2K86EdiEh75YJ_3n8g", "ParameterEffectKind-delete"); //$NON-NLS-1$ //$NON-NLS-2$

			fragmentMap.put("_m9VKMK86EdiEh75YJ_3n8g", "TransitionKind"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9VKMa86EdiEh75YJ_3n8g", "TransitionKind-internal"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9VKMq86EdiEh75YJ_3n8g", "TransitionKind-local"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9VKM686EdiEh75YJ_3n8g", "TransitionKind-external"); //$NON-NLS-1$ //$NON-NLS-2$

			fragmentMap.put("_m9bP6a86EdiEh75YJ_3n8g", "ObjectNodeOrderingKind"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9bP6q86EdiEh75YJ_3n8g", "ObjectNodeOrderingKind-unordered"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9bP6686EdiEh75YJ_3n8g", "ObjectNodeOrderingKind-ordered"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9bP7K86EdiEh75YJ_3n8g", "ObjectNodeOrderingKind-LIFO"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9bP7a86EdiEh75YJ_3n8g", "ObjectNodeOrderingKind-FIFO"); //$NON-NLS-1$ //$NON-NLS-2$

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

			fragmentMap.put("_m9PCrK86EdiEh75YJ_3n8g", "CallConcurrencyKind"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9PCra86EdiEh75YJ_3n8g", "CallConcurrencyKind-sequential"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9PCrq86EdiEh75YJ_3n8g", "CallConcurrencyKind-guarded"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9PCr686EdiEh75YJ_3n8g", "CallConcurrencyKind-concurrent"); //$NON-NLS-1$ //$NON-NLS-2$

			fragmentMap.put("_m9bROK86EdiEh75YJ_3n8g", "ConnectorKind"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9bROa86EdiEh75YJ_3n8g", "ConnectorKind-assembly"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9bROq86EdiEh75YJ_3n8g", "ConnectorKind-delegation"); //$NON-NLS-1$ //$NON-NLS-2$

			fragmentMap.put("_m9VJZ686EdiEh75YJ_3n8g", "AggregationKind"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9VJaK86EdiEh75YJ_3n8g", "AggregationKind-none"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9VJaa86EdiEh75YJ_3n8g", "AggregationKind-shared"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_m9VJaq86EdiEh75YJ_3n8g", "AggregationKind-composite"); //$NON-NLS-1$ //$NON-NLS-2$

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
			fragmentMap.put("_9vsGw686Edih9-GG5afQ0g", "BuildComponent"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_9vsGyK86Edih9-GG5afQ0g", "BuildComponent-base_Component"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_9vsGxa86Edih9-GG5afQ0g", "Component_BuildComponent"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_9vsGxq86Edih9-GG5afQ0g", "Component_BuildComponent-extension_BuildComponent"); //$NON-NLS-1$ //$NON-NLS-2$
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
			fragmentMap.put("_Ox98AK87Edih9-GG5afQ0g", "Metamodel"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_O1-5VK87Edih9-GG5afQ0g", "Metamodel-base_Model"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_O1-5Ua87Edih9-GG5afQ0g", "Model_Metamodel"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_O1-5Uq87Edih9-GG5afQ0g", "Model_Metamodel-extension_Metamodel"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_O1-5Va87Edih9-GG5afQ0g", "SystemModel"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_O2E_8687Edih9-GG5afQ0g", "SystemModel-base_Model"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_O2E_8K87Edih9-GG5afQ0g", "Model_SystemModel"); //$NON-NLS-1$ //$NON-NLS-2$
			fragmentMap.put("_O2E_8a87Edih9-GG5afQ0g", "Model_SystemModel-extension_SystemModel"); //$NON-NLS-1$ //$NON-NLS-2$

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

		return fragmentMap;
	}

	public UML22UMLExtendedMetadata(EPackage.Registry ePackageRegistry,
			Ecore2XMLRegistry ecore2xmlRegistry) {
		super(ePackageRegistry, ecore2xmlRegistry);
	}

}
