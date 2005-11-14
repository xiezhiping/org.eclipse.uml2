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
 * $Id: CallBehaviorActionImpl.java,v 1.12 2005/11/14 17:31:07 khussey Exp $
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
import org.eclipse.uml2.CallBehaviorAction;
import org.eclipse.uml2.Port;
import org.eclipse.uml2.StringExpression;
import org.eclipse.uml2.StructuredActivityNode;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Call Behavior Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.CallBehaviorActionImpl#getBehavior <em>Behavior</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CallBehaviorActionImpl extends CallActionImpl implements CallBehaviorAction {
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
	protected CallBehaviorActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UML2Package.eINSTANCE.getCallBehaviorAction();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior getBehavior() {
		Behavior behavior = (Behavior)eVirtualGet(UML2Package.CALL_BEHAVIOR_ACTION__BEHAVIOR);
		if (behavior != null && behavior.eIsProxy()) {
			Behavior oldBehavior = behavior;
			behavior = (Behavior)eResolveProxy((InternalEObject)behavior);
			if (behavior != oldBehavior) {
				eVirtualSet(UML2Package.CALL_BEHAVIOR_ACTION__BEHAVIOR, behavior);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2Package.CALL_BEHAVIOR_ACTION__BEHAVIOR, oldBehavior, behavior));
			}
		}
		return behavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior basicGetBehavior() {
		return (Behavior)eVirtualGet(UML2Package.CALL_BEHAVIOR_ACTION__BEHAVIOR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBehavior(Behavior newBehavior) {
		Behavior behavior = newBehavior;
		Object oldBehavior = eVirtualSet(UML2Package.CALL_BEHAVIOR_ACTION__BEHAVIOR, behavior);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.CALL_BEHAVIOR_ACTION__BEHAVIOR, oldBehavior == EVIRTUAL_NO_VALUE ? null : oldBehavior, behavior));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UML2Package.CALL_BEHAVIOR_ACTION__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.CALL_BEHAVIOR_ACTION__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.CALL_BEHAVIOR_ACTION__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.CALL_BEHAVIOR_ACTION__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.CALL_BEHAVIOR_ACTION__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.CALL_BEHAVIOR_ACTION__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UML2Package.CALL_BEHAVIOR_ACTION__NAME:
				return getName();
			case UML2Package.CALL_BEHAVIOR_ACTION__QUALIFIED_NAME:
				return getQualifiedName();
			case UML2Package.CALL_BEHAVIOR_ACTION__VISIBILITY:
				return getVisibility();
			case UML2Package.CALL_BEHAVIOR_ACTION__CLIENT_DEPENDENCY:
				return getClientDependencies();
			case UML2Package.CALL_BEHAVIOR_ACTION__NAME_EXPRESSION:
				return getNameExpression();
			case UML2Package.CALL_BEHAVIOR_ACTION__REDEFINITION_CONTEXT:
				return getRedefinitionContexts();
			case UML2Package.CALL_BEHAVIOR_ACTION__IS_LEAF:
				return isLeaf() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.CALL_BEHAVIOR_ACTION__OUTGOING:
				return getOutgoings();
			case UML2Package.CALL_BEHAVIOR_ACTION__INCOMING:
				return getIncomings();
			case UML2Package.CALL_BEHAVIOR_ACTION__IN_GROUP:
				return getInGroups();
			case UML2Package.CALL_BEHAVIOR_ACTION__ACTIVITY:
				return getActivity();
			case UML2Package.CALL_BEHAVIOR_ACTION__REDEFINED_ELEMENT:
				return getRedefinedElements();
			case UML2Package.CALL_BEHAVIOR_ACTION__IN_STRUCTURED_NODE:
				return getInStructuredNode();
			case UML2Package.CALL_BEHAVIOR_ACTION__IN_PARTITION:
				return getInPartitions();
			case UML2Package.CALL_BEHAVIOR_ACTION__IN_INTERRUPTIBLE_REGION:
				return getInInterruptibleRegions();
			case UML2Package.CALL_BEHAVIOR_ACTION__HANDLER:
				return getHandlers();
			case UML2Package.CALL_BEHAVIOR_ACTION__EFFECT:
				return getEffect();
			case UML2Package.CALL_BEHAVIOR_ACTION__OUTPUT:
				return getOutputs();
			case UML2Package.CALL_BEHAVIOR_ACTION__INPUT:
				return getInputs();
			case UML2Package.CALL_BEHAVIOR_ACTION__CONTEXT:
				return getContext();
			case UML2Package.CALL_BEHAVIOR_ACTION__LOCAL_PRECONDITION:
				return getLocalPreconditions();
			case UML2Package.CALL_BEHAVIOR_ACTION__LOCAL_POSTCONDITION:
				return getLocalPostconditions();
			case UML2Package.CALL_BEHAVIOR_ACTION__ARGUMENT:
				return getArguments();
			case UML2Package.CALL_BEHAVIOR_ACTION__ON_PORT:
				if (resolve) return getOnPort();
				return basicGetOnPort();
			case UML2Package.CALL_BEHAVIOR_ACTION__IS_SYNCHRONOUS:
				return isSynchronous() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.CALL_BEHAVIOR_ACTION__RESULT:
				return getResults();
			case UML2Package.CALL_BEHAVIOR_ACTION__BEHAVIOR:
				if (resolve) return getBehavior();
				return basicGetBehavior();
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
			case UML2Package.CALL_BEHAVIOR_ACTION__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.CALL_BEHAVIOR_ACTION__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.CALL_BEHAVIOR_ACTION__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection)newValue);
				return;
			case UML2Package.CALL_BEHAVIOR_ACTION__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case UML2Package.CALL_BEHAVIOR_ACTION__NAME:
				setName((String)newValue);
				return;
			case UML2Package.CALL_BEHAVIOR_ACTION__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case UML2Package.CALL_BEHAVIOR_ACTION__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection)newValue);
				return;
			case UML2Package.CALL_BEHAVIOR_ACTION__NAME_EXPRESSION:
				setNameExpression((StringExpression)newValue);
				return;
			case UML2Package.CALL_BEHAVIOR_ACTION__IS_LEAF:
				setIsLeaf(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.CALL_BEHAVIOR_ACTION__OUTGOING:
				getOutgoings().clear();
				getOutgoings().addAll((Collection)newValue);
				return;
			case UML2Package.CALL_BEHAVIOR_ACTION__INCOMING:
				getIncomings().clear();
				getIncomings().addAll((Collection)newValue);
				return;
			case UML2Package.CALL_BEHAVIOR_ACTION__ACTIVITY:
				setActivity((Activity)newValue);
				return;
			case UML2Package.CALL_BEHAVIOR_ACTION__REDEFINED_ELEMENT:
				getRedefinedElements().clear();
				getRedefinedElements().addAll((Collection)newValue);
				return;
			case UML2Package.CALL_BEHAVIOR_ACTION__IN_STRUCTURED_NODE:
				setInStructuredNode((StructuredActivityNode)newValue);
				return;
			case UML2Package.CALL_BEHAVIOR_ACTION__IN_PARTITION:
				getInPartitions().clear();
				getInPartitions().addAll((Collection)newValue);
				return;
			case UML2Package.CALL_BEHAVIOR_ACTION__IN_INTERRUPTIBLE_REGION:
				getInInterruptibleRegions().clear();
				getInInterruptibleRegions().addAll((Collection)newValue);
				return;
			case UML2Package.CALL_BEHAVIOR_ACTION__HANDLER:
				getHandlers().clear();
				getHandlers().addAll((Collection)newValue);
				return;
			case UML2Package.CALL_BEHAVIOR_ACTION__EFFECT:
				setEffect((String)newValue);
				return;
			case UML2Package.CALL_BEHAVIOR_ACTION__LOCAL_PRECONDITION:
				getLocalPreconditions().clear();
				getLocalPreconditions().addAll((Collection)newValue);
				return;
			case UML2Package.CALL_BEHAVIOR_ACTION__LOCAL_POSTCONDITION:
				getLocalPostconditions().clear();
				getLocalPostconditions().addAll((Collection)newValue);
				return;
			case UML2Package.CALL_BEHAVIOR_ACTION__ARGUMENT:
				getArguments().clear();
				getArguments().addAll((Collection)newValue);
				return;
			case UML2Package.CALL_BEHAVIOR_ACTION__ON_PORT:
				setOnPort((Port)newValue);
				return;
			case UML2Package.CALL_BEHAVIOR_ACTION__IS_SYNCHRONOUS:
				setIsSynchronous(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.CALL_BEHAVIOR_ACTION__RESULT:
				getResults().clear();
				getResults().addAll((Collection)newValue);
				return;
			case UML2Package.CALL_BEHAVIOR_ACTION__BEHAVIOR:
				setBehavior((Behavior)newValue);
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
			case UML2Package.CALL_BEHAVIOR_ACTION__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.CALL_BEHAVIOR_ACTION__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.CALL_BEHAVIOR_ACTION__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				return;
			case UML2Package.CALL_BEHAVIOR_ACTION__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case UML2Package.CALL_BEHAVIOR_ACTION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UML2Package.CALL_BEHAVIOR_ACTION__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UML2Package.CALL_BEHAVIOR_ACTION__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				return;
			case UML2Package.CALL_BEHAVIOR_ACTION__NAME_EXPRESSION:
				setNameExpression((StringExpression)null);
				return;
			case UML2Package.CALL_BEHAVIOR_ACTION__IS_LEAF:
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UML2Package.CALL_BEHAVIOR_ACTION__OUTGOING:
				getOutgoings().clear();
				return;
			case UML2Package.CALL_BEHAVIOR_ACTION__INCOMING:
				getIncomings().clear();
				return;
			case UML2Package.CALL_BEHAVIOR_ACTION__ACTIVITY:
				setActivity((Activity)null);
				return;
			case UML2Package.CALL_BEHAVIOR_ACTION__REDEFINED_ELEMENT:
				getRedefinedElements().clear();
				return;
			case UML2Package.CALL_BEHAVIOR_ACTION__IN_STRUCTURED_NODE:
				setInStructuredNode((StructuredActivityNode)null);
				return;
			case UML2Package.CALL_BEHAVIOR_ACTION__IN_PARTITION:
				getInPartitions().clear();
				return;
			case UML2Package.CALL_BEHAVIOR_ACTION__IN_INTERRUPTIBLE_REGION:
				getInInterruptibleRegions().clear();
				return;
			case UML2Package.CALL_BEHAVIOR_ACTION__HANDLER:
				getHandlers().clear();
				return;
			case UML2Package.CALL_BEHAVIOR_ACTION__EFFECT:
				setEffect(EFFECT_EDEFAULT);
				return;
			case UML2Package.CALL_BEHAVIOR_ACTION__LOCAL_PRECONDITION:
				getLocalPreconditions().clear();
				return;
			case UML2Package.CALL_BEHAVIOR_ACTION__LOCAL_POSTCONDITION:
				getLocalPostconditions().clear();
				return;
			case UML2Package.CALL_BEHAVIOR_ACTION__ARGUMENT:
				getArguments().clear();
				return;
			case UML2Package.CALL_BEHAVIOR_ACTION__ON_PORT:
				setOnPort((Port)null);
				return;
			case UML2Package.CALL_BEHAVIOR_ACTION__IS_SYNCHRONOUS:
				setIsSynchronous(IS_SYNCHRONOUS_EDEFAULT);
				return;
			case UML2Package.CALL_BEHAVIOR_ACTION__RESULT:
				getResults().clear();
				return;
			case UML2Package.CALL_BEHAVIOR_ACTION__BEHAVIOR:
				setBehavior((Behavior)null);
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
			case UML2Package.CALL_BEHAVIOR_ACTION__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.CALL_BEHAVIOR_ACTION__OWNED_ELEMENT:
				return isSetOwnedElements();
			case UML2Package.CALL_BEHAVIOR_ACTION__OWNER:
				return isSetOwner();
			case UML2Package.CALL_BEHAVIOR_ACTION__OWNED_COMMENT:
				EList ownedComment = (EList)eVirtualGet(UML2Package.CALL_BEHAVIOR_ACTION__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.CALL_BEHAVIOR_ACTION__TEMPLATE_BINDING:
				EList templateBinding = (EList)eVirtualGet(UML2Package.CALL_BEHAVIOR_ACTION__TEMPLATE_BINDING);
				return templateBinding != null && !templateBinding.isEmpty();
			case UML2Package.CALL_BEHAVIOR_ACTION__OWNED_TEMPLATE_SIGNATURE:
				return eVirtualGet(UML2Package.CALL_BEHAVIOR_ACTION__OWNED_TEMPLATE_SIGNATURE) != null;
			case UML2Package.CALL_BEHAVIOR_ACTION__NAME:
				String name = eVirtualIsSet(UML2Package.CALL_BEHAVIOR_ACTION__NAME) ? (String)eVirtualGet(UML2Package.CALL_BEHAVIOR_ACTION__NAME) : NAME_EDEFAULT;
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.CALL_BEHAVIOR_ACTION__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UML2Package.CALL_BEHAVIOR_ACTION__VISIBILITY:
				return eVirtualIsSet(UML2Package.CALL_BEHAVIOR_ACTION__VISIBILITY) && eVirtualGet(UML2Package.CALL_BEHAVIOR_ACTION__VISIBILITY) != VISIBILITY_EDEFAULT;
			case UML2Package.CALL_BEHAVIOR_ACTION__CLIENT_DEPENDENCY:
				EList clientDependency = (EList)eVirtualGet(UML2Package.CALL_BEHAVIOR_ACTION__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UML2Package.CALL_BEHAVIOR_ACTION__NAME_EXPRESSION:
				return eVirtualGet(UML2Package.CALL_BEHAVIOR_ACTION__NAME_EXPRESSION) != null;
			case UML2Package.CALL_BEHAVIOR_ACTION__REDEFINITION_CONTEXT:
				return isSetRedefinitionContexts();
			case UML2Package.CALL_BEHAVIOR_ACTION__IS_LEAF:
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UML2Package.CALL_BEHAVIOR_ACTION__OUTGOING:
				EList outgoing = (EList)eVirtualGet(UML2Package.CALL_BEHAVIOR_ACTION__OUTGOING);
				return outgoing != null && !outgoing.isEmpty();
			case UML2Package.CALL_BEHAVIOR_ACTION__INCOMING:
				EList incoming = (EList)eVirtualGet(UML2Package.CALL_BEHAVIOR_ACTION__INCOMING);
				return incoming != null && !incoming.isEmpty();
			case UML2Package.CALL_BEHAVIOR_ACTION__IN_GROUP:
				return isSetInGroups();
			case UML2Package.CALL_BEHAVIOR_ACTION__ACTIVITY:
				return getActivity() != null;
			case UML2Package.CALL_BEHAVIOR_ACTION__REDEFINED_ELEMENT:
				return isSetRedefinedElements();
			case UML2Package.CALL_BEHAVIOR_ACTION__IN_STRUCTURED_NODE:
				return getInStructuredNode() != null;
			case UML2Package.CALL_BEHAVIOR_ACTION__IN_PARTITION:
				EList inPartition = (EList)eVirtualGet(UML2Package.CALL_BEHAVIOR_ACTION__IN_PARTITION);
				return inPartition != null && !inPartition.isEmpty();
			case UML2Package.CALL_BEHAVIOR_ACTION__IN_INTERRUPTIBLE_REGION:
				EList inInterruptibleRegion = (EList)eVirtualGet(UML2Package.CALL_BEHAVIOR_ACTION__IN_INTERRUPTIBLE_REGION);
				return inInterruptibleRegion != null && !inInterruptibleRegion.isEmpty();
			case UML2Package.CALL_BEHAVIOR_ACTION__HANDLER:
				EList handler = (EList)eVirtualGet(UML2Package.CALL_BEHAVIOR_ACTION__HANDLER);
				return handler != null && !handler.isEmpty();
			case UML2Package.CALL_BEHAVIOR_ACTION__EFFECT:
				String effect = eVirtualIsSet(UML2Package.CALL_BEHAVIOR_ACTION__EFFECT) ? (String)eVirtualGet(UML2Package.CALL_BEHAVIOR_ACTION__EFFECT) : EFFECT_EDEFAULT;
				return EFFECT_EDEFAULT == null ? effect != null : !EFFECT_EDEFAULT.equals(effect);
			case UML2Package.CALL_BEHAVIOR_ACTION__OUTPUT:
				return isSetOutputs();
			case UML2Package.CALL_BEHAVIOR_ACTION__INPUT:
				return isSetInputs();
			case UML2Package.CALL_BEHAVIOR_ACTION__CONTEXT:
				return getContext() != null;
			case UML2Package.CALL_BEHAVIOR_ACTION__LOCAL_PRECONDITION:
				EList localPrecondition = (EList)eVirtualGet(UML2Package.CALL_BEHAVIOR_ACTION__LOCAL_PRECONDITION);
				return localPrecondition != null && !localPrecondition.isEmpty();
			case UML2Package.CALL_BEHAVIOR_ACTION__LOCAL_POSTCONDITION:
				EList localPostcondition = (EList)eVirtualGet(UML2Package.CALL_BEHAVIOR_ACTION__LOCAL_POSTCONDITION);
				return localPostcondition != null && !localPostcondition.isEmpty();
			case UML2Package.CALL_BEHAVIOR_ACTION__ARGUMENT:
				EList argument = (EList)eVirtualGet(UML2Package.CALL_BEHAVIOR_ACTION__ARGUMENT);
				return argument != null && !argument.isEmpty();
			case UML2Package.CALL_BEHAVIOR_ACTION__ON_PORT:
				return eVirtualGet(UML2Package.CALL_BEHAVIOR_ACTION__ON_PORT) != null;
			case UML2Package.CALL_BEHAVIOR_ACTION__IS_SYNCHRONOUS:
				return ((eFlags & IS_SYNCHRONOUS_EFLAG) != 0) != IS_SYNCHRONOUS_EDEFAULT;
			case UML2Package.CALL_BEHAVIOR_ACTION__RESULT:
				EList result = (EList)eVirtualGet(UML2Package.CALL_BEHAVIOR_ACTION__RESULT);
				return result != null && !result.isEmpty();
			case UML2Package.CALL_BEHAVIOR_ACTION__BEHAVIOR:
				return eVirtualGet(UML2Package.CALL_BEHAVIOR_ACTION__BEHAVIOR) != null;
		}
		return eDynamicIsSet(eFeature);
	}


} //CallBehaviorActionImpl
