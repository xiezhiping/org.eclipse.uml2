/*
 * Copyright (c) 2003, 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: DecisionNodeImpl.java,v 1.11 2005/11/14 17:31:09 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.uml2.Activity;
import org.eclipse.uml2.Behavior;
import org.eclipse.uml2.DecisionNode;
import org.eclipse.uml2.StringExpression;
import org.eclipse.uml2.StructuredActivityNode;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Decision Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.DecisionNodeImpl#getDecisionInput <em>Decision Input</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DecisionNodeImpl extends ControlNodeImpl implements DecisionNode {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DecisionNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UML2Package.eINSTANCE.getDecisionNode();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior getDecisionInput() {
		Behavior decisionInput = (Behavior)eVirtualGet(UML2Package.DECISION_NODE__DECISION_INPUT);
		if (decisionInput != null && decisionInput.eIsProxy()) {
			Behavior oldDecisionInput = decisionInput;
			decisionInput = (Behavior)eResolveProxy((InternalEObject)decisionInput);
			if (decisionInput != oldDecisionInput) {
				eVirtualSet(UML2Package.DECISION_NODE__DECISION_INPUT, decisionInput);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2Package.DECISION_NODE__DECISION_INPUT, oldDecisionInput, decisionInput));
			}
		}
		return decisionInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior basicGetDecisionInput() {
		return (Behavior)eVirtualGet(UML2Package.DECISION_NODE__DECISION_INPUT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecisionInput(Behavior newDecisionInput) {
		Behavior decisionInput = newDecisionInput;
		Object oldDecisionInput = eVirtualSet(UML2Package.DECISION_NODE__DECISION_INPUT, decisionInput);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.DECISION_NODE__DECISION_INPUT, oldDecisionInput == EVIRTUAL_NO_VALUE ? null : oldDecisionInput, decisionInput));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UML2Package.DECISION_NODE__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.DECISION_NODE__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.DECISION_NODE__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.DECISION_NODE__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.DECISION_NODE__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.DECISION_NODE__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UML2Package.DECISION_NODE__NAME:
				return getName();
			case UML2Package.DECISION_NODE__QUALIFIED_NAME:
				return getQualifiedName();
			case UML2Package.DECISION_NODE__VISIBILITY:
				return getVisibility();
			case UML2Package.DECISION_NODE__CLIENT_DEPENDENCY:
				return getClientDependencies();
			case UML2Package.DECISION_NODE__NAME_EXPRESSION:
				return getNameExpression();
			case UML2Package.DECISION_NODE__REDEFINITION_CONTEXT:
				return getRedefinitionContexts();
			case UML2Package.DECISION_NODE__IS_LEAF:
				return isLeaf() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.DECISION_NODE__OUTGOING:
				return getOutgoings();
			case UML2Package.DECISION_NODE__INCOMING:
				return getIncomings();
			case UML2Package.DECISION_NODE__IN_GROUP:
				return getInGroups();
			case UML2Package.DECISION_NODE__ACTIVITY:
				return getActivity();
			case UML2Package.DECISION_NODE__REDEFINED_ELEMENT:
				return getRedefinedElements();
			case UML2Package.DECISION_NODE__IN_STRUCTURED_NODE:
				return getInStructuredNode();
			case UML2Package.DECISION_NODE__IN_PARTITION:
				return getInPartitions();
			case UML2Package.DECISION_NODE__IN_INTERRUPTIBLE_REGION:
				return getInInterruptibleRegions();
			case UML2Package.DECISION_NODE__DECISION_INPUT:
				if (resolve) return getDecisionInput();
				return basicGetDecisionInput();
		}
		return eDynamicGet(eFeature, resolve);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(EStructuralFeature eFeature, Object newValue) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UML2Package.DECISION_NODE__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.DECISION_NODE__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.DECISION_NODE__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection)newValue);
				return;
			case UML2Package.DECISION_NODE__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case UML2Package.DECISION_NODE__NAME:
				setName((String)newValue);
				return;
			case UML2Package.DECISION_NODE__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case UML2Package.DECISION_NODE__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection)newValue);
				return;
			case UML2Package.DECISION_NODE__NAME_EXPRESSION:
				setNameExpression((StringExpression)newValue);
				return;
			case UML2Package.DECISION_NODE__IS_LEAF:
				setIsLeaf(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.DECISION_NODE__OUTGOING:
				getOutgoings().clear();
				getOutgoings().addAll((Collection)newValue);
				return;
			case UML2Package.DECISION_NODE__INCOMING:
				getIncomings().clear();
				getIncomings().addAll((Collection)newValue);
				return;
			case UML2Package.DECISION_NODE__ACTIVITY:
				setActivity((Activity)newValue);
				return;
			case UML2Package.DECISION_NODE__REDEFINED_ELEMENT:
				getRedefinedElements().clear();
				getRedefinedElements().addAll((Collection)newValue);
				return;
			case UML2Package.DECISION_NODE__IN_STRUCTURED_NODE:
				setInStructuredNode((StructuredActivityNode)newValue);
				return;
			case UML2Package.DECISION_NODE__IN_PARTITION:
				getInPartitions().clear();
				getInPartitions().addAll((Collection)newValue);
				return;
			case UML2Package.DECISION_NODE__IN_INTERRUPTIBLE_REGION:
				getInInterruptibleRegions().clear();
				getInInterruptibleRegions().addAll((Collection)newValue);
				return;
			case UML2Package.DECISION_NODE__DECISION_INPUT:
				setDecisionInput((Behavior)newValue);
				return;
		}
		eDynamicSet(eFeature, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UML2Package.DECISION_NODE__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.DECISION_NODE__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.DECISION_NODE__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				return;
			case UML2Package.DECISION_NODE__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case UML2Package.DECISION_NODE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UML2Package.DECISION_NODE__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UML2Package.DECISION_NODE__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				return;
			case UML2Package.DECISION_NODE__NAME_EXPRESSION:
				setNameExpression((StringExpression)null);
				return;
			case UML2Package.DECISION_NODE__IS_LEAF:
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UML2Package.DECISION_NODE__OUTGOING:
				getOutgoings().clear();
				return;
			case UML2Package.DECISION_NODE__INCOMING:
				getIncomings().clear();
				return;
			case UML2Package.DECISION_NODE__ACTIVITY:
				setActivity((Activity)null);
				return;
			case UML2Package.DECISION_NODE__REDEFINED_ELEMENT:
				getRedefinedElements().clear();
				return;
			case UML2Package.DECISION_NODE__IN_STRUCTURED_NODE:
				setInStructuredNode((StructuredActivityNode)null);
				return;
			case UML2Package.DECISION_NODE__IN_PARTITION:
				getInPartitions().clear();
				return;
			case UML2Package.DECISION_NODE__IN_INTERRUPTIBLE_REGION:
				getInInterruptibleRegions().clear();
				return;
			case UML2Package.DECISION_NODE__DECISION_INPUT:
				setDecisionInput((Behavior)null);
				return;
		}
		eDynamicUnset(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UML2Package.DECISION_NODE__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.DECISION_NODE__OWNED_ELEMENT:
				return isSetOwnedElements();
			case UML2Package.DECISION_NODE__OWNER:
				return isSetOwner();
			case UML2Package.DECISION_NODE__OWNED_COMMENT:
				EList ownedComment = (EList)eVirtualGet(UML2Package.DECISION_NODE__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.DECISION_NODE__TEMPLATE_BINDING:
				EList templateBinding = (EList)eVirtualGet(UML2Package.DECISION_NODE__TEMPLATE_BINDING);
				return templateBinding != null && !templateBinding.isEmpty();
			case UML2Package.DECISION_NODE__OWNED_TEMPLATE_SIGNATURE:
				return eVirtualGet(UML2Package.DECISION_NODE__OWNED_TEMPLATE_SIGNATURE) != null;
			case UML2Package.DECISION_NODE__NAME:
				String name = eVirtualIsSet(UML2Package.DECISION_NODE__NAME) ? (String)eVirtualGet(UML2Package.DECISION_NODE__NAME) : NAME_EDEFAULT;
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.DECISION_NODE__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UML2Package.DECISION_NODE__VISIBILITY:
				return eVirtualIsSet(UML2Package.DECISION_NODE__VISIBILITY) && eVirtualGet(UML2Package.DECISION_NODE__VISIBILITY) != VISIBILITY_EDEFAULT;
			case UML2Package.DECISION_NODE__CLIENT_DEPENDENCY:
				EList clientDependency = (EList)eVirtualGet(UML2Package.DECISION_NODE__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UML2Package.DECISION_NODE__NAME_EXPRESSION:
				return eVirtualGet(UML2Package.DECISION_NODE__NAME_EXPRESSION) != null;
			case UML2Package.DECISION_NODE__REDEFINITION_CONTEXT:
				return isSetRedefinitionContexts();
			case UML2Package.DECISION_NODE__IS_LEAF:
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UML2Package.DECISION_NODE__OUTGOING:
				EList outgoing = (EList)eVirtualGet(UML2Package.DECISION_NODE__OUTGOING);
				return outgoing != null && !outgoing.isEmpty();
			case UML2Package.DECISION_NODE__INCOMING:
				EList incoming = (EList)eVirtualGet(UML2Package.DECISION_NODE__INCOMING);
				return incoming != null && !incoming.isEmpty();
			case UML2Package.DECISION_NODE__IN_GROUP:
				return isSetInGroups();
			case UML2Package.DECISION_NODE__ACTIVITY:
				return getActivity() != null;
			case UML2Package.DECISION_NODE__REDEFINED_ELEMENT:
				return isSetRedefinedElements();
			case UML2Package.DECISION_NODE__IN_STRUCTURED_NODE:
				return getInStructuredNode() != null;
			case UML2Package.DECISION_NODE__IN_PARTITION:
				EList inPartition = (EList)eVirtualGet(UML2Package.DECISION_NODE__IN_PARTITION);
				return inPartition != null && !inPartition.isEmpty();
			case UML2Package.DECISION_NODE__IN_INTERRUPTIBLE_REGION:
				EList inInterruptibleRegion = (EList)eVirtualGet(UML2Package.DECISION_NODE__IN_INTERRUPTIBLE_REGION);
				return inInterruptibleRegion != null && !inInterruptibleRegion.isEmpty();
			case UML2Package.DECISION_NODE__DECISION_INPUT:
				return eVirtualGet(UML2Package.DECISION_NODE__DECISION_INPUT) != null;
		}
		return eDynamicIsSet(eFeature);
	}


} //DecisionNodeImpl
