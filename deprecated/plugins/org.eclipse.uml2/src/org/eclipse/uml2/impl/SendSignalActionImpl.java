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
 * $Id: SendSignalActionImpl.java,v 1.24 2005/12/06 23:18:03 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.Activity;
import org.eclipse.uml2.InputPin;
import org.eclipse.uml2.Port;
import org.eclipse.uml2.SendSignalAction;
import org.eclipse.uml2.Signal;
import org.eclipse.uml2.StringExpression;
import org.eclipse.uml2.StructuredActivityNode;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.VisibilityKind;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Send Signal Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.SendSignalActionImpl#getInputs <em>Input</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.SendSignalActionImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.SendSignalActionImpl#getSignal <em>Signal</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SendSignalActionImpl extends InvocationActionImpl implements SendSignalAction {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * A bit field representing the indices of non-primitive feature values.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected int eVirtualIndexBits1 = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SendSignalActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UML2Package.Literals.SEND_SIGNAL_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getInputs() {
		EList input = (EList)eVirtualGet(UML2Package.SEND_SIGNAL_ACTION__INPUT);
		if (input == null) {
			eVirtualSet(UML2Package.SEND_SIGNAL_ACTION__INPUT, input = new DerivedUnionEObjectEList(InputPin.class, this, UML2Package.SEND_SIGNAL_ACTION__INPUT, new int[] {UML2Package.SEND_SIGNAL_ACTION__ARGUMENT, UML2Package.SEND_SIGNAL_ACTION__TARGET}));
		}
		return input;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInputs() {
		return super.isSetInputs()
			|| eIsSet(UML2Package.SEND_SIGNAL_ACTION__TARGET);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin getTarget() {
		return (InputPin)eVirtualGet(UML2Package.SEND_SIGNAL_ACTION__TARGET);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(InputPin newTarget, NotificationChain msgs) {
		Object oldTarget = eVirtualSet(UML2Package.SEND_SIGNAL_ACTION__TARGET, newTarget);
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UML2Package.SEND_SIGNAL_ACTION__TARGET, oldTarget == EVIRTUAL_NO_VALUE ? null : oldTarget, newTarget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(InputPin newTarget) {
		InputPin target = (InputPin)eVirtualGet(UML2Package.SEND_SIGNAL_ACTION__TARGET);
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject)target).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.SEND_SIGNAL_ACTION__TARGET, null, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject)newTarget).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UML2Package.SEND_SIGNAL_ACTION__TARGET, null, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.SEND_SIGNAL_ACTION__TARGET, newTarget, newTarget));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public InputPin createTarget(EClass eClass) {
		InputPin newTarget = (InputPin) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.SEND_SIGNAL_ACTION__TARGET, null, newTarget));
		}
		setTarget(newTarget);
		return newTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public InputPin createTarget() {
		InputPin newTarget = UML2Factory.eINSTANCE.createInputPin();
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.SEND_SIGNAL_ACTION__TARGET, null, newTarget));
		}
		setTarget(newTarget);
		return newTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signal getSignal() {
		Signal signal = (Signal)eVirtualGet(UML2Package.SEND_SIGNAL_ACTION__SIGNAL);
		if (signal != null && signal.eIsProxy()) {
			InternalEObject oldSignal = (InternalEObject)signal;
			signal = (Signal)eResolveProxy(oldSignal);
			if (signal != oldSignal) {
				eVirtualSet(UML2Package.SEND_SIGNAL_ACTION__SIGNAL, signal);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2Package.SEND_SIGNAL_ACTION__SIGNAL, oldSignal, signal));
			}
		}
		return signal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signal basicGetSignal() {
		return (Signal)eVirtualGet(UML2Package.SEND_SIGNAL_ACTION__SIGNAL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignal(Signal newSignal) {
		Signal signal = newSignal;
		Object oldSignal = eVirtualSet(UML2Package.SEND_SIGNAL_ACTION__SIGNAL, signal);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.SEND_SIGNAL_ACTION__SIGNAL, oldSignal == EVIRTUAL_NO_VALUE ? null : oldSignal, signal));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UML2Package.SEND_SIGNAL_ACTION__EANNOTATIONS:
				return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
			case UML2Package.SEND_SIGNAL_ACTION__OWNED_COMMENT:
				return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
			case UML2Package.SEND_SIGNAL_ACTION__TEMPLATE_BINDING:
				return ((InternalEList)getTemplateBindings()).basicRemove(otherEnd, msgs);
			case UML2Package.SEND_SIGNAL_ACTION__OWNED_TEMPLATE_SIGNATURE:
				return basicSetOwnedTemplateSignature(null, msgs);
			case UML2Package.SEND_SIGNAL_ACTION__CLIENT_DEPENDENCY:
				return ((InternalEList)getClientDependencies()).basicRemove(otherEnd, msgs);
			case UML2Package.SEND_SIGNAL_ACTION__NAME_EXPRESSION:
				return basicSetNameExpression(null, msgs);
			case UML2Package.SEND_SIGNAL_ACTION__OUTGOING:
				return ((InternalEList)getOutgoings()).basicRemove(otherEnd, msgs);
			case UML2Package.SEND_SIGNAL_ACTION__INCOMING:
				return ((InternalEList)getIncomings()).basicRemove(otherEnd, msgs);
			case UML2Package.SEND_SIGNAL_ACTION__ACTIVITY:
				return eBasicSetContainer(null, UML2Package.SEND_SIGNAL_ACTION__ACTIVITY, msgs);
			case UML2Package.SEND_SIGNAL_ACTION__IN_STRUCTURED_NODE:
				return eBasicSetContainer(null, UML2Package.SEND_SIGNAL_ACTION__IN_STRUCTURED_NODE, msgs);
			case UML2Package.SEND_SIGNAL_ACTION__IN_PARTITION:
				return ((InternalEList)getInPartitions()).basicRemove(otherEnd, msgs);
			case UML2Package.SEND_SIGNAL_ACTION__IN_INTERRUPTIBLE_REGION:
				return ((InternalEList)getInInterruptibleRegions()).basicRemove(otherEnd, msgs);
			case UML2Package.SEND_SIGNAL_ACTION__HANDLER:
				return ((InternalEList)getHandlers()).basicRemove(otherEnd, msgs);
			case UML2Package.SEND_SIGNAL_ACTION__LOCAL_PRECONDITION:
				return ((InternalEList)getLocalPreconditions()).basicRemove(otherEnd, msgs);
			case UML2Package.SEND_SIGNAL_ACTION__LOCAL_POSTCONDITION:
				return ((InternalEList)getLocalPostconditions()).basicRemove(otherEnd, msgs);
			case UML2Package.SEND_SIGNAL_ACTION__ARGUMENT:
				return ((InternalEList)getArguments()).basicRemove(otherEnd, msgs);
			case UML2Package.SEND_SIGNAL_ACTION__TARGET:
				return basicSetTarget(null, msgs);
		}
		return eDynamicInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UML2Package.SEND_SIGNAL_ACTION__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.SEND_SIGNAL_ACTION__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.SEND_SIGNAL_ACTION__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.SEND_SIGNAL_ACTION__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.SEND_SIGNAL_ACTION__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.SEND_SIGNAL_ACTION__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UML2Package.SEND_SIGNAL_ACTION__NAME:
				return getName();
			case UML2Package.SEND_SIGNAL_ACTION__QUALIFIED_NAME:
				return getQualifiedName();
			case UML2Package.SEND_SIGNAL_ACTION__VISIBILITY:
				return getVisibility();
			case UML2Package.SEND_SIGNAL_ACTION__CLIENT_DEPENDENCY:
				return getClientDependencies();
			case UML2Package.SEND_SIGNAL_ACTION__NAME_EXPRESSION:
				return getNameExpression();
			case UML2Package.SEND_SIGNAL_ACTION__REDEFINITION_CONTEXT:
				return getRedefinitionContexts();
			case UML2Package.SEND_SIGNAL_ACTION__IS_LEAF:
				return isLeaf() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.SEND_SIGNAL_ACTION__OUTGOING:
				return getOutgoings();
			case UML2Package.SEND_SIGNAL_ACTION__INCOMING:
				return getIncomings();
			case UML2Package.SEND_SIGNAL_ACTION__IN_GROUP:
				return getInGroups();
			case UML2Package.SEND_SIGNAL_ACTION__ACTIVITY:
				return getActivity();
			case UML2Package.SEND_SIGNAL_ACTION__REDEFINED_ELEMENT:
				return getRedefinedElements();
			case UML2Package.SEND_SIGNAL_ACTION__IN_STRUCTURED_NODE:
				return getInStructuredNode();
			case UML2Package.SEND_SIGNAL_ACTION__IN_PARTITION:
				return getInPartitions();
			case UML2Package.SEND_SIGNAL_ACTION__IN_INTERRUPTIBLE_REGION:
				return getInInterruptibleRegions();
			case UML2Package.SEND_SIGNAL_ACTION__HANDLER:
				return getHandlers();
			case UML2Package.SEND_SIGNAL_ACTION__EFFECT:
				return getEffect();
			case UML2Package.SEND_SIGNAL_ACTION__OUTPUT:
				return getOutputs();
			case UML2Package.SEND_SIGNAL_ACTION__INPUT:
				return getInputs();
			case UML2Package.SEND_SIGNAL_ACTION__CONTEXT:
				return getContext();
			case UML2Package.SEND_SIGNAL_ACTION__LOCAL_PRECONDITION:
				return getLocalPreconditions();
			case UML2Package.SEND_SIGNAL_ACTION__LOCAL_POSTCONDITION:
				return getLocalPostconditions();
			case UML2Package.SEND_SIGNAL_ACTION__ARGUMENT:
				return getArguments();
			case UML2Package.SEND_SIGNAL_ACTION__ON_PORT:
				if (resolve) return getOnPort();
				return basicGetOnPort();
			case UML2Package.SEND_SIGNAL_ACTION__TARGET:
				return getTarget();
			case UML2Package.SEND_SIGNAL_ACTION__SIGNAL:
				if (resolve) return getSignal();
				return basicGetSignal();
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
			case UML2Package.SEND_SIGNAL_ACTION__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.SEND_SIGNAL_ACTION__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.SEND_SIGNAL_ACTION__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection)newValue);
				return;
			case UML2Package.SEND_SIGNAL_ACTION__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case UML2Package.SEND_SIGNAL_ACTION__NAME:
				setName((String)newValue);
				return;
			case UML2Package.SEND_SIGNAL_ACTION__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case UML2Package.SEND_SIGNAL_ACTION__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection)newValue);
				return;
			case UML2Package.SEND_SIGNAL_ACTION__NAME_EXPRESSION:
				setNameExpression((StringExpression)newValue);
				return;
			case UML2Package.SEND_SIGNAL_ACTION__IS_LEAF:
				setIsLeaf(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.SEND_SIGNAL_ACTION__OUTGOING:
				getOutgoings().clear();
				getOutgoings().addAll((Collection)newValue);
				return;
			case UML2Package.SEND_SIGNAL_ACTION__INCOMING:
				getIncomings().clear();
				getIncomings().addAll((Collection)newValue);
				return;
			case UML2Package.SEND_SIGNAL_ACTION__ACTIVITY:
				setActivity((Activity)newValue);
				return;
			case UML2Package.SEND_SIGNAL_ACTION__REDEFINED_ELEMENT:
				getRedefinedElements().clear();
				getRedefinedElements().addAll((Collection)newValue);
				return;
			case UML2Package.SEND_SIGNAL_ACTION__IN_STRUCTURED_NODE:
				setInStructuredNode((StructuredActivityNode)newValue);
				return;
			case UML2Package.SEND_SIGNAL_ACTION__IN_PARTITION:
				getInPartitions().clear();
				getInPartitions().addAll((Collection)newValue);
				return;
			case UML2Package.SEND_SIGNAL_ACTION__IN_INTERRUPTIBLE_REGION:
				getInInterruptibleRegions().clear();
				getInInterruptibleRegions().addAll((Collection)newValue);
				return;
			case UML2Package.SEND_SIGNAL_ACTION__HANDLER:
				getHandlers().clear();
				getHandlers().addAll((Collection)newValue);
				return;
			case UML2Package.SEND_SIGNAL_ACTION__EFFECT:
				setEffect((String)newValue);
				return;
			case UML2Package.SEND_SIGNAL_ACTION__LOCAL_PRECONDITION:
				getLocalPreconditions().clear();
				getLocalPreconditions().addAll((Collection)newValue);
				return;
			case UML2Package.SEND_SIGNAL_ACTION__LOCAL_POSTCONDITION:
				getLocalPostconditions().clear();
				getLocalPostconditions().addAll((Collection)newValue);
				return;
			case UML2Package.SEND_SIGNAL_ACTION__ARGUMENT:
				getArguments().clear();
				getArguments().addAll((Collection)newValue);
				return;
			case UML2Package.SEND_SIGNAL_ACTION__ON_PORT:
				setOnPort((Port)newValue);
				return;
			case UML2Package.SEND_SIGNAL_ACTION__TARGET:
				setTarget((InputPin)newValue);
				return;
			case UML2Package.SEND_SIGNAL_ACTION__SIGNAL:
				setSignal((Signal)newValue);
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
			case UML2Package.SEND_SIGNAL_ACTION__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.SEND_SIGNAL_ACTION__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.SEND_SIGNAL_ACTION__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				return;
			case UML2Package.SEND_SIGNAL_ACTION__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case UML2Package.SEND_SIGNAL_ACTION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UML2Package.SEND_SIGNAL_ACTION__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UML2Package.SEND_SIGNAL_ACTION__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				return;
			case UML2Package.SEND_SIGNAL_ACTION__NAME_EXPRESSION:
				setNameExpression((StringExpression)null);
				return;
			case UML2Package.SEND_SIGNAL_ACTION__IS_LEAF:
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UML2Package.SEND_SIGNAL_ACTION__OUTGOING:
				getOutgoings().clear();
				return;
			case UML2Package.SEND_SIGNAL_ACTION__INCOMING:
				getIncomings().clear();
				return;
			case UML2Package.SEND_SIGNAL_ACTION__ACTIVITY:
				setActivity((Activity)null);
				return;
			case UML2Package.SEND_SIGNAL_ACTION__REDEFINED_ELEMENT:
				getRedefinedElements().clear();
				return;
			case UML2Package.SEND_SIGNAL_ACTION__IN_STRUCTURED_NODE:
				setInStructuredNode((StructuredActivityNode)null);
				return;
			case UML2Package.SEND_SIGNAL_ACTION__IN_PARTITION:
				getInPartitions().clear();
				return;
			case UML2Package.SEND_SIGNAL_ACTION__IN_INTERRUPTIBLE_REGION:
				getInInterruptibleRegions().clear();
				return;
			case UML2Package.SEND_SIGNAL_ACTION__HANDLER:
				getHandlers().clear();
				return;
			case UML2Package.SEND_SIGNAL_ACTION__EFFECT:
				setEffect(EFFECT_EDEFAULT);
				return;
			case UML2Package.SEND_SIGNAL_ACTION__LOCAL_PRECONDITION:
				getLocalPreconditions().clear();
				return;
			case UML2Package.SEND_SIGNAL_ACTION__LOCAL_POSTCONDITION:
				getLocalPostconditions().clear();
				return;
			case UML2Package.SEND_SIGNAL_ACTION__ARGUMENT:
				getArguments().clear();
				return;
			case UML2Package.SEND_SIGNAL_ACTION__ON_PORT:
				setOnPort((Port)null);
				return;
			case UML2Package.SEND_SIGNAL_ACTION__TARGET:
				setTarget((InputPin)null);
				return;
			case UML2Package.SEND_SIGNAL_ACTION__SIGNAL:
				setSignal((Signal)null);
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
			case UML2Package.SEND_SIGNAL_ACTION__EANNOTATIONS:
				EList eAnnotations = (EList)eVirtualGet(UML2Package.SEND_SIGNAL_ACTION__EANNOTATIONS);
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.SEND_SIGNAL_ACTION__OWNED_ELEMENT:
				return isSetOwnedElements();
			case UML2Package.SEND_SIGNAL_ACTION__OWNER:
				return isSetOwner();
			case UML2Package.SEND_SIGNAL_ACTION__OWNED_COMMENT:
				EList ownedComment = (EList)eVirtualGet(UML2Package.SEND_SIGNAL_ACTION__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.SEND_SIGNAL_ACTION__TEMPLATE_BINDING:
				EList templateBinding = (EList)eVirtualGet(UML2Package.SEND_SIGNAL_ACTION__TEMPLATE_BINDING);
				return templateBinding != null && !templateBinding.isEmpty();
			case UML2Package.SEND_SIGNAL_ACTION__OWNED_TEMPLATE_SIGNATURE:
				return eVirtualGet(UML2Package.SEND_SIGNAL_ACTION__OWNED_TEMPLATE_SIGNATURE) != null;
			case UML2Package.SEND_SIGNAL_ACTION__NAME:
				String name = (String)eVirtualGet(UML2Package.SEND_SIGNAL_ACTION__NAME, NAME_EDEFAULT);
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.SEND_SIGNAL_ACTION__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UML2Package.SEND_SIGNAL_ACTION__VISIBILITY:
				return eVirtualGet(UML2Package.SEND_SIGNAL_ACTION__VISIBILITY, VISIBILITY_EDEFAULT) != VISIBILITY_EDEFAULT;
			case UML2Package.SEND_SIGNAL_ACTION__CLIENT_DEPENDENCY:
				EList clientDependency = (EList)eVirtualGet(UML2Package.SEND_SIGNAL_ACTION__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UML2Package.SEND_SIGNAL_ACTION__NAME_EXPRESSION:
				return eVirtualGet(UML2Package.SEND_SIGNAL_ACTION__NAME_EXPRESSION) != null;
			case UML2Package.SEND_SIGNAL_ACTION__REDEFINITION_CONTEXT:
				return isSetRedefinitionContexts();
			case UML2Package.SEND_SIGNAL_ACTION__IS_LEAF:
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UML2Package.SEND_SIGNAL_ACTION__OUTGOING:
				EList outgoing = (EList)eVirtualGet(UML2Package.SEND_SIGNAL_ACTION__OUTGOING);
				return outgoing != null && !outgoing.isEmpty();
			case UML2Package.SEND_SIGNAL_ACTION__INCOMING:
				EList incoming = (EList)eVirtualGet(UML2Package.SEND_SIGNAL_ACTION__INCOMING);
				return incoming != null && !incoming.isEmpty();
			case UML2Package.SEND_SIGNAL_ACTION__IN_GROUP:
				return isSetInGroups();
			case UML2Package.SEND_SIGNAL_ACTION__ACTIVITY:
				return getActivity() != null;
			case UML2Package.SEND_SIGNAL_ACTION__REDEFINED_ELEMENT:
				return isSetRedefinedElements();
			case UML2Package.SEND_SIGNAL_ACTION__IN_STRUCTURED_NODE:
				return getInStructuredNode() != null;
			case UML2Package.SEND_SIGNAL_ACTION__IN_PARTITION:
				EList inPartition = (EList)eVirtualGet(UML2Package.SEND_SIGNAL_ACTION__IN_PARTITION);
				return inPartition != null && !inPartition.isEmpty();
			case UML2Package.SEND_SIGNAL_ACTION__IN_INTERRUPTIBLE_REGION:
				EList inInterruptibleRegion = (EList)eVirtualGet(UML2Package.SEND_SIGNAL_ACTION__IN_INTERRUPTIBLE_REGION);
				return inInterruptibleRegion != null && !inInterruptibleRegion.isEmpty();
			case UML2Package.SEND_SIGNAL_ACTION__HANDLER:
				EList handler = (EList)eVirtualGet(UML2Package.SEND_SIGNAL_ACTION__HANDLER);
				return handler != null && !handler.isEmpty();
			case UML2Package.SEND_SIGNAL_ACTION__EFFECT:
				String effect = (String)eVirtualGet(UML2Package.SEND_SIGNAL_ACTION__EFFECT, EFFECT_EDEFAULT);
				return EFFECT_EDEFAULT == null ? effect != null : !EFFECT_EDEFAULT.equals(effect);
			case UML2Package.SEND_SIGNAL_ACTION__OUTPUT:
				return isSetOutputs();
			case UML2Package.SEND_SIGNAL_ACTION__INPUT:
				return isSetInputs();
			case UML2Package.SEND_SIGNAL_ACTION__CONTEXT:
				return getContext() != null;
			case UML2Package.SEND_SIGNAL_ACTION__LOCAL_PRECONDITION:
				EList localPrecondition = (EList)eVirtualGet(UML2Package.SEND_SIGNAL_ACTION__LOCAL_PRECONDITION);
				return localPrecondition != null && !localPrecondition.isEmpty();
			case UML2Package.SEND_SIGNAL_ACTION__LOCAL_POSTCONDITION:
				EList localPostcondition = (EList)eVirtualGet(UML2Package.SEND_SIGNAL_ACTION__LOCAL_POSTCONDITION);
				return localPostcondition != null && !localPostcondition.isEmpty();
			case UML2Package.SEND_SIGNAL_ACTION__ARGUMENT:
				EList argument = (EList)eVirtualGet(UML2Package.SEND_SIGNAL_ACTION__ARGUMENT);
				return argument != null && !argument.isEmpty();
			case UML2Package.SEND_SIGNAL_ACTION__ON_PORT:
				return eVirtualGet(UML2Package.SEND_SIGNAL_ACTION__ON_PORT) != null;
			case UML2Package.SEND_SIGNAL_ACTION__TARGET:
				return eVirtualGet(UML2Package.SEND_SIGNAL_ACTION__TARGET) != null;
			case UML2Package.SEND_SIGNAL_ACTION__SIGNAL:
				return eVirtualGet(UML2Package.SEND_SIGNAL_ACTION__SIGNAL) != null;
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected int eVirtualIndexBits(int offset) {
		switch (offset) {
			case 0 :
				return eVirtualIndexBits0;
			case 1 :
				return eVirtualIndexBits1;
			default :
				throw new IndexOutOfBoundsException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void eSetVirtualIndexBits(int offset, int newIndexBits) {
		switch (offset) {
			case 0 :
				eVirtualIndexBits0 = newIndexBits;
				break;
			case 1 :
				eVirtualIndexBits1 = newIndexBits;
				break;
			default :
				throw new IndexOutOfBoundsException();
		}
	}


} //SendSignalActionImpl
