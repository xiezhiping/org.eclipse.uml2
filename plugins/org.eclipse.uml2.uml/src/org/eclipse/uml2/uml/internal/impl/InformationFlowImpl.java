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
 * $Id: InformationFlowImpl.java,v 1.3 2005/11/23 13:27:41 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.ActivityEdge;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Connector;
import org.eclipse.uml2.uml.DirectedRelationship;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.InformationFlow;
import org.eclipse.uml2.uml.Message;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Relationship;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.InformationFlowOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Information Flow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InformationFlowImpl#getRelatedElements <em>Related Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InformationFlowImpl#getSources <em>Source</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InformationFlowImpl#getTargets <em>Target</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InformationFlowImpl#getRealizations <em>Realization</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InformationFlowImpl#getConveyeds <em>Conveyed</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InformationFlowImpl#getInformationSources <em>Information Source</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InformationFlowImpl#getInformationTargets <em>Information Target</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InformationFlowImpl#getRealizingActivityEdges <em>Realizing Activity Edge</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InformationFlowImpl#getRealizingConnectors <em>Realizing Connector</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InformationFlowImpl#getRealizingMessages <em>Realizing Message</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InformationFlowImpl
		extends PackageableElementImpl
		implements InformationFlow {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InformationFlowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.eINSTANCE.getInformationFlow();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getRelatedElements() {
		List relatedElement = (List) eVirtualGet(UMLPackage.INFORMATION_FLOW__RELATED_ELEMENT);
		if (relatedElement == null) {
			eVirtualSet(UMLPackage.INFORMATION_FLOW__RELATED_ELEMENT,
				relatedElement = new DerivedUnionEObjectEList(Element.class,
					this, UMLPackage.INFORMATION_FLOW__RELATED_ELEMENT,
					new int[]{UMLPackage.INFORMATION_FLOW__SOURCE,
						UMLPackage.INFORMATION_FLOW__TARGET}));
		}
		return relatedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getSources() {
		List source = (List) eVirtualGet(UMLPackage.INFORMATION_FLOW__SOURCE);
		if (source == null) {
			eVirtualSet(UMLPackage.INFORMATION_FLOW__SOURCE,
				source = new DerivedUnionEObjectEList(Element.class, this,
					UMLPackage.INFORMATION_FLOW__SOURCE,
					new int[]{UMLPackage.INFORMATION_FLOW__INFORMATION_SOURCE}));
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getTargets() {
		List target = (List) eVirtualGet(UMLPackage.INFORMATION_FLOW__TARGET);
		if (target == null) {
			eVirtualSet(UMLPackage.INFORMATION_FLOW__TARGET,
				target = new DerivedUnionEObjectEList(Element.class, this,
					UMLPackage.INFORMATION_FLOW__TARGET,
					new int[]{UMLPackage.INFORMATION_FLOW__INFORMATION_TARGET}));
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getRealizations() {
		List realization = (List) eVirtualGet(UMLPackage.INFORMATION_FLOW__REALIZATION);
		if (realization == null) {
			eVirtualSet(UMLPackage.INFORMATION_FLOW__REALIZATION,
				realization = new EObjectResolvingEList(Relationship.class,
					this, UMLPackage.INFORMATION_FLOW__REALIZATION));
		}
		return realization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getConveyeds() {
		List conveyed = (List) eVirtualGet(UMLPackage.INFORMATION_FLOW__CONVEYED);
		if (conveyed == null) {
			eVirtualSet(UMLPackage.INFORMATION_FLOW__CONVEYED,
				conveyed = new EObjectResolvingEList(Classifier.class, this,
					UMLPackage.INFORMATION_FLOW__CONVEYED));
		}
		return conveyed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getConveyed(String name) {
		for (Iterator i = getConveyeds().iterator(); i.hasNext();) {
			Classifier conveyed = (Classifier) i.next();
			if (name.equals(conveyed.getName())) {
				return conveyed;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getInformationSources() {
		List informationSource = (List) eVirtualGet(UMLPackage.INFORMATION_FLOW__INFORMATION_SOURCE);
		if (informationSource == null) {
			eVirtualSet(UMLPackage.INFORMATION_FLOW__INFORMATION_SOURCE,
				informationSource = new EObjectResolvingEList(
					NamedElement.class, this,
					UMLPackage.INFORMATION_FLOW__INFORMATION_SOURCE));
		}
		return informationSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement getInformationSource(String name) {
		for (Iterator i = getInformationSources().iterator(); i.hasNext();) {
			NamedElement informationSource = (NamedElement) i.next();
			if (name.equals(informationSource.getName())) {
				return informationSource;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getInformationTargets() {
		List informationTarget = (List) eVirtualGet(UMLPackage.INFORMATION_FLOW__INFORMATION_TARGET);
		if (informationTarget == null) {
			eVirtualSet(UMLPackage.INFORMATION_FLOW__INFORMATION_TARGET,
				informationTarget = new EObjectResolvingEList(
					NamedElement.class, this,
					UMLPackage.INFORMATION_FLOW__INFORMATION_TARGET));
		}
		return informationTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement getInformationTarget(String name) {
		for (Iterator i = getInformationTargets().iterator(); i.hasNext();) {
			NamedElement informationTarget = (NamedElement) i.next();
			if (name.equals(informationTarget.getName())) {
				return informationTarget;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getRealizingActivityEdges() {
		List realizingActivityEdge = (List) eVirtualGet(UMLPackage.INFORMATION_FLOW__REALIZING_ACTIVITY_EDGE);
		if (realizingActivityEdge == null) {
			eVirtualSet(UMLPackage.INFORMATION_FLOW__REALIZING_ACTIVITY_EDGE,
				realizingActivityEdge = new EObjectResolvingEList(
					ActivityEdge.class, this,
					UMLPackage.INFORMATION_FLOW__REALIZING_ACTIVITY_EDGE));
		}
		return realizingActivityEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityEdge getRealizingActivityEdge(String name) {
		for (Iterator i = getRealizingActivityEdges().iterator(); i.hasNext();) {
			ActivityEdge realizingActivityEdge = (ActivityEdge) i.next();
			if (name.equals(realizingActivityEdge.getName())) {
				return realizingActivityEdge;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getRealizingConnectors() {
		List realizingConnector = (List) eVirtualGet(UMLPackage.INFORMATION_FLOW__REALIZING_CONNECTOR);
		if (realizingConnector == null) {
			eVirtualSet(UMLPackage.INFORMATION_FLOW__REALIZING_CONNECTOR,
				realizingConnector = new EObjectResolvingEList(Connector.class,
					this, UMLPackage.INFORMATION_FLOW__REALIZING_CONNECTOR));
		}
		return realizingConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector getRealizingConnector(String name) {
		for (Iterator i = getRealizingConnectors().iterator(); i.hasNext();) {
			Connector realizingConnector = (Connector) i.next();
			if (name.equals(realizingConnector.getName())) {
				return realizingConnector;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getRealizingMessages() {
		List realizingMessage = (List) eVirtualGet(UMLPackage.INFORMATION_FLOW__REALIZING_MESSAGE);
		if (realizingMessage == null) {
			eVirtualSet(UMLPackage.INFORMATION_FLOW__REALIZING_MESSAGE,
				realizingMessage = new EObjectResolvingEList(Message.class,
					this, UMLPackage.INFORMATION_FLOW__REALIZING_MESSAGE));
		}
		return realizingMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message getRealizingMessage(String name) {
		for (Iterator i = getRealizingMessages().iterator(); i.hasNext();) {
			Message realizingMessage = (Message) i.next();
			if (name.equals(realizingMessage.getName())) {
				return realizingMessage;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSourcesAndTargetsKind(DiagnosticChain diagnostics,
			Map context) {
		return InformationFlowOperations.validateSourcesAndTargetsKind(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMustConform(DiagnosticChain diagnostics, Map context) {
		return InformationFlowOperations.validateMustConform(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConveyClassifiers(DiagnosticChain diagnostics,
			Map context) {
		return InformationFlowOperations.validateConveyClassifiers(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.INFORMATION_FLOW__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.INFORMATION_FLOW__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.INFORMATION_FLOW__OWNER :
				return getOwner();
			case UMLPackage.INFORMATION_FLOW__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.INFORMATION_FLOW__NAME :
				return getName();
			case UMLPackage.INFORMATION_FLOW__VISIBILITY :
				return getVisibility();
			case UMLPackage.INFORMATION_FLOW__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.INFORMATION_FLOW__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.INFORMATION_FLOW__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.INFORMATION_FLOW__NAME_EXPRESSION :
				return getNameExpression();
			case UMLPackage.INFORMATION_FLOW__TEMPLATE_PARAMETER :
				if (resolve)
					return getTemplateParameter();
				return basicGetTemplateParameter();
			case UMLPackage.INFORMATION_FLOW__OWNING_TEMPLATE_PARAMETER :
				if (resolve)
					return getOwningTemplateParameter();
				return basicGetOwningTemplateParameter();
			case UMLPackage.INFORMATION_FLOW__RELATED_ELEMENT :
				return getRelatedElements();
			case UMLPackage.INFORMATION_FLOW__SOURCE :
				return getSources();
			case UMLPackage.INFORMATION_FLOW__TARGET :
				return getTargets();
			case UMLPackage.INFORMATION_FLOW__REALIZATION :
				return getRealizations();
			case UMLPackage.INFORMATION_FLOW__CONVEYED :
				return getConveyeds();
			case UMLPackage.INFORMATION_FLOW__INFORMATION_SOURCE :
				return getInformationSources();
			case UMLPackage.INFORMATION_FLOW__INFORMATION_TARGET :
				return getInformationTargets();
			case UMLPackage.INFORMATION_FLOW__REALIZING_ACTIVITY_EDGE :
				return getRealizingActivityEdges();
			case UMLPackage.INFORMATION_FLOW__REALIZING_CONNECTOR :
				return getRealizingConnectors();
			case UMLPackage.INFORMATION_FLOW__REALIZING_MESSAGE :
				return getRealizingMessages();
		}
		return eDynamicGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UMLPackage.INFORMATION_FLOW__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.INFORMATION_FLOW__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.INFORMATION_FLOW__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.INFORMATION_FLOW__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.INFORMATION_FLOW__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.INFORMATION_FLOW__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.INFORMATION_FLOW__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.INFORMATION_FLOW__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.INFORMATION_FLOW__REALIZATION :
				getRealizations().clear();
				getRealizations().addAll((Collection) newValue);
				return;
			case UMLPackage.INFORMATION_FLOW__CONVEYED :
				getConveyeds().clear();
				getConveyeds().addAll((Collection) newValue);
				return;
			case UMLPackage.INFORMATION_FLOW__INFORMATION_SOURCE :
				getInformationSources().clear();
				getInformationSources().addAll((Collection) newValue);
				return;
			case UMLPackage.INFORMATION_FLOW__INFORMATION_TARGET :
				getInformationTargets().clear();
				getInformationTargets().addAll((Collection) newValue);
				return;
			case UMLPackage.INFORMATION_FLOW__REALIZING_ACTIVITY_EDGE :
				getRealizingActivityEdges().clear();
				getRealizingActivityEdges().addAll((Collection) newValue);
				return;
			case UMLPackage.INFORMATION_FLOW__REALIZING_CONNECTOR :
				getRealizingConnectors().clear();
				getRealizingConnectors().addAll((Collection) newValue);
				return;
			case UMLPackage.INFORMATION_FLOW__REALIZING_MESSAGE :
				getRealizingMessages().clear();
				getRealizingMessages().addAll((Collection) newValue);
				return;
		}
		eDynamicSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case UMLPackage.INFORMATION_FLOW__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.INFORMATION_FLOW__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.INFORMATION_FLOW__NAME :
				setName(NAME_EDEFAULT);
				return;
			case UMLPackage.INFORMATION_FLOW__VISIBILITY :
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UMLPackage.INFORMATION_FLOW__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.INFORMATION_FLOW__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.INFORMATION_FLOW__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.INFORMATION_FLOW__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.INFORMATION_FLOW__REALIZATION :
				getRealizations().clear();
				return;
			case UMLPackage.INFORMATION_FLOW__CONVEYED :
				getConveyeds().clear();
				return;
			case UMLPackage.INFORMATION_FLOW__INFORMATION_SOURCE :
				getInformationSources().clear();
				return;
			case UMLPackage.INFORMATION_FLOW__INFORMATION_TARGET :
				getInformationTargets().clear();
				return;
			case UMLPackage.INFORMATION_FLOW__REALIZING_ACTIVITY_EDGE :
				getRealizingActivityEdges().clear();
				return;
			case UMLPackage.INFORMATION_FLOW__REALIZING_CONNECTOR :
				getRealizingConnectors().clear();
				return;
			case UMLPackage.INFORMATION_FLOW__REALIZING_MESSAGE :
				getRealizingMessages().clear();
				return;
		}
		eDynamicUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UMLPackage.INFORMATION_FLOW__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.INFORMATION_FLOW__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.INFORMATION_FLOW__OWNER :
				return isSetOwner();
			case UMLPackage.INFORMATION_FLOW__OWNED_COMMENT :
				List ownedComment = (List) eVirtualGet(UMLPackage.INFORMATION_FLOW__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.INFORMATION_FLOW__NAME :
				String name = (String) eVirtualGet(
					UMLPackage.INFORMATION_FLOW__NAME, NAME_EDEFAULT);
				return NAME_EDEFAULT == null
					? name != null
					: !NAME_EDEFAULT.equals(name);
			case UMLPackage.INFORMATION_FLOW__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.INFORMATION_FLOW__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.INFORMATION_FLOW__CLIENT_DEPENDENCY :
				List clientDependency = (List) eVirtualGet(UMLPackage.INFORMATION_FLOW__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.INFORMATION_FLOW__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.INFORMATION_FLOW__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.INFORMATION_FLOW__NAME_EXPRESSION) != null;
			case UMLPackage.INFORMATION_FLOW__TEMPLATE_PARAMETER :
				return eVirtualGet(UMLPackage.INFORMATION_FLOW__TEMPLATE_PARAMETER) != null;
			case UMLPackage.INFORMATION_FLOW__OWNING_TEMPLATE_PARAMETER :
				return basicGetOwningTemplateParameter() != null;
			case UMLPackage.INFORMATION_FLOW__RELATED_ELEMENT :
				return isSetRelatedElements();
			case UMLPackage.INFORMATION_FLOW__SOURCE :
				return isSetSources();
			case UMLPackage.INFORMATION_FLOW__TARGET :
				return isSetTargets();
			case UMLPackage.INFORMATION_FLOW__REALIZATION :
				List realization = (List) eVirtualGet(UMLPackage.INFORMATION_FLOW__REALIZATION);
				return realization != null && !realization.isEmpty();
			case UMLPackage.INFORMATION_FLOW__CONVEYED :
				List conveyed = (List) eVirtualGet(UMLPackage.INFORMATION_FLOW__CONVEYED);
				return conveyed != null && !conveyed.isEmpty();
			case UMLPackage.INFORMATION_FLOW__INFORMATION_SOURCE :
				List informationSource = (List) eVirtualGet(UMLPackage.INFORMATION_FLOW__INFORMATION_SOURCE);
				return informationSource != null
					&& !informationSource.isEmpty();
			case UMLPackage.INFORMATION_FLOW__INFORMATION_TARGET :
				List informationTarget = (List) eVirtualGet(UMLPackage.INFORMATION_FLOW__INFORMATION_TARGET);
				return informationTarget != null
					&& !informationTarget.isEmpty();
			case UMLPackage.INFORMATION_FLOW__REALIZING_ACTIVITY_EDGE :
				List realizingActivityEdge = (List) eVirtualGet(UMLPackage.INFORMATION_FLOW__REALIZING_ACTIVITY_EDGE);
				return realizingActivityEdge != null
					&& !realizingActivityEdge.isEmpty();
			case UMLPackage.INFORMATION_FLOW__REALIZING_CONNECTOR :
				List realizingConnector = (List) eVirtualGet(UMLPackage.INFORMATION_FLOW__REALIZING_CONNECTOR);
				return realizingConnector != null
					&& !realizingConnector.isEmpty();
			case UMLPackage.INFORMATION_FLOW__REALIZING_MESSAGE :
				List realizingMessage = (List) eVirtualGet(UMLPackage.INFORMATION_FLOW__REALIZING_MESSAGE);
				return realizingMessage != null && !realizingMessage.isEmpty();
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == Relationship.class) {
			switch (derivedFeatureID) {
				case UMLPackage.INFORMATION_FLOW__RELATED_ELEMENT :
					return UMLPackage.RELATIONSHIP__RELATED_ELEMENT;
				default :
					return -1;
			}
		}
		if (baseClass == DirectedRelationship.class) {
			switch (derivedFeatureID) {
				case UMLPackage.INFORMATION_FLOW__SOURCE :
					return UMLPackage.DIRECTED_RELATIONSHIP__SOURCE;
				case UMLPackage.INFORMATION_FLOW__TARGET :
					return UMLPackage.DIRECTED_RELATIONSHIP__TARGET;
				default :
					return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class baseClass) {
		if (baseClass == Relationship.class) {
			switch (baseFeatureID) {
				case UMLPackage.RELATIONSHIP__RELATED_ELEMENT :
					return UMLPackage.INFORMATION_FLOW__RELATED_ELEMENT;
				default :
					return -1;
			}
		}
		if (baseClass == DirectedRelationship.class) {
			switch (baseFeatureID) {
				case UMLPackage.DIRECTED_RELATIONSHIP__SOURCE :
					return UMLPackage.INFORMATION_FLOW__SOURCE;
				case UMLPackage.DIRECTED_RELATIONSHIP__TARGET :
					return UMLPackage.INFORMATION_FLOW__TARGET;
				default :
					return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRelatedElements() {
		return isSetSources() || isSetTargets();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSources() {
		return eIsSet(UMLPackage.INFORMATION_FLOW__INFORMATION_SOURCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTargets() {
		return eIsSet(UMLPackage.INFORMATION_FLOW__INFORMATION_TARGET);
	}

} //InformationFlowImpl
