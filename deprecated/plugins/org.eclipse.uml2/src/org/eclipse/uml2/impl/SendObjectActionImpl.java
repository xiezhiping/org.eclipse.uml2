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
 * $Id: SendObjectActionImpl.java,v 1.11 2005/05/18 16:38:26 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.util.Collection;
import java.util.Collections;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.Activity;
import org.eclipse.uml2.InputPin;
import org.eclipse.uml2.Port;
import org.eclipse.uml2.SendObjectAction;
import org.eclipse.uml2.StringExpression;
import org.eclipse.uml2.StructuredActivityNode;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Send Object Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.SendObjectActionImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.SendObjectActionImpl#getRequest <em>Request</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SendObjectActionImpl extends InvocationActionImpl implements SendObjectAction {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected InputPin target = null;

	/**
	 * The cached value of the '{@link #getRequest() <em>Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequest()
	 * @generated
	 * @ordered
	 */
	protected InputPin request = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SendObjectActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UML2Package.eINSTANCE.getSendObjectAction();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin getTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(InputPin newTarget, NotificationChain msgs) {
		InputPin oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UML2Package.SEND_OBJECT_ACTION__TARGET, oldTarget, newTarget);
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
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject)target).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.SEND_OBJECT_ACTION__TARGET, null, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject)newTarget).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UML2Package.SEND_OBJECT_ACTION__TARGET, null, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.SEND_OBJECT_ACTION__TARGET, newTarget, newTarget));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin createTarget(EClass eClass) {
		InputPin newTarget = (InputPin) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.SEND_OBJECT_ACTION__TARGET, null, newTarget));
		}
		setTarget(newTarget);
		return newTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin createTarget() {
		InputPin newTarget = UML2Factory.eINSTANCE.createInputPin();
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.SEND_OBJECT_ACTION__TARGET, null, newTarget));
		}
		setTarget(newTarget);
		return newTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin getRequest() {
		return request;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequest(InputPin newRequest, NotificationChain msgs) {
		InputPin oldRequest = request;
		request = newRequest;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UML2Package.SEND_OBJECT_ACTION__REQUEST, oldRequest, newRequest);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequest(InputPin newRequest) {
		if (newRequest != request) {
			NotificationChain msgs = null;
			if (request != null)
				msgs = ((InternalEObject)request).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.SEND_OBJECT_ACTION__REQUEST, null, msgs);
			if (newRequest != null)
				msgs = ((InternalEObject)newRequest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UML2Package.SEND_OBJECT_ACTION__REQUEST, null, msgs);
			msgs = basicSetRequest(newRequest, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.SEND_OBJECT_ACTION__REQUEST, newRequest, newRequest));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin createRequest(EClass eClass) {
		InputPin newRequest = (InputPin) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.SEND_OBJECT_ACTION__REQUEST, null, newRequest));
		}
		setRequest(newRequest);
		return newRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin createRequest() {
		InputPin newRequest = UML2Factory.eINSTANCE.createInputPin();
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.SEND_OBJECT_ACTION__REQUEST, null, newRequest));
		}
		setRequest(newRequest);
		return newRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getArguments() {
		return new EcoreEList.UnmodifiableEList(this, UML2Package.eINSTANCE.getInvocationAction_Argument(), 0, Collections.EMPTY_LIST.toArray());
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UML2Package.SEND_OBJECT_ACTION__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicAdd(otherEnd, msgs);
				case UML2Package.SEND_OBJECT_ACTION__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicAdd(otherEnd, msgs);
				case UML2Package.SEND_OBJECT_ACTION__OWNED_TEMPLATE_SIGNATURE:
					if (ownedTemplateSignature != null)
						msgs = ((InternalEObject)ownedTemplateSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.SEND_OBJECT_ACTION__OWNED_TEMPLATE_SIGNATURE, null, msgs);
					return basicSetOwnedTemplateSignature((TemplateSignature)otherEnd, msgs);
				case UML2Package.SEND_OBJECT_ACTION__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicAdd(otherEnd, msgs);
				case UML2Package.SEND_OBJECT_ACTION__OUTGOING:
					return ((InternalEList)getOutgoings()).basicAdd(otherEnd, msgs);
				case UML2Package.SEND_OBJECT_ACTION__INCOMING:
					return ((InternalEList)getIncomings()).basicAdd(otherEnd, msgs);
				case UML2Package.SEND_OBJECT_ACTION__ACTIVITY:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, UML2Package.SEND_OBJECT_ACTION__ACTIVITY, msgs);
				case UML2Package.SEND_OBJECT_ACTION__IN_STRUCTURED_NODE:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, UML2Package.SEND_OBJECT_ACTION__IN_STRUCTURED_NODE, msgs);
				case UML2Package.SEND_OBJECT_ACTION__IN_PARTITION:
					return ((InternalEList)getInPartitions()).basicAdd(otherEnd, msgs);
				case UML2Package.SEND_OBJECT_ACTION__IN_INTERRUPTIBLE_REGION:
					return ((InternalEList)getInInterruptibleRegions()).basicAdd(otherEnd, msgs);
				case UML2Package.SEND_OBJECT_ACTION__HANDLER:
					return ((InternalEList)getHandlers()).basicAdd(otherEnd, msgs);
				default:
					return eDynamicInverseAdd(otherEnd, featureID, baseClass, msgs);
			}
		}
		if (eContainer != null)
			msgs = eBasicRemoveFromContainer(msgs);
		return eBasicSetContainer(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UML2Package.SEND_OBJECT_ACTION__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
				case UML2Package.SEND_OBJECT_ACTION__OWNED_COMMENT:
					return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
				case UML2Package.SEND_OBJECT_ACTION__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicRemove(otherEnd, msgs);
				case UML2Package.SEND_OBJECT_ACTION__OWNED_TEMPLATE_SIGNATURE:
					return basicSetOwnedTemplateSignature(null, msgs);
				case UML2Package.SEND_OBJECT_ACTION__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicRemove(otherEnd, msgs);
				case UML2Package.SEND_OBJECT_ACTION__NAME_EXPRESSION:
					return basicSetNameExpression(null, msgs);
				case UML2Package.SEND_OBJECT_ACTION__OUTGOING:
					return ((InternalEList)getOutgoings()).basicRemove(otherEnd, msgs);
				case UML2Package.SEND_OBJECT_ACTION__INCOMING:
					return ((InternalEList)getIncomings()).basicRemove(otherEnd, msgs);
				case UML2Package.SEND_OBJECT_ACTION__ACTIVITY:
					return eBasicSetContainer(null, UML2Package.SEND_OBJECT_ACTION__ACTIVITY, msgs);
				case UML2Package.SEND_OBJECT_ACTION__IN_STRUCTURED_NODE:
					return eBasicSetContainer(null, UML2Package.SEND_OBJECT_ACTION__IN_STRUCTURED_NODE, msgs);
				case UML2Package.SEND_OBJECT_ACTION__IN_PARTITION:
					return ((InternalEList)getInPartitions()).basicRemove(otherEnd, msgs);
				case UML2Package.SEND_OBJECT_ACTION__IN_INTERRUPTIBLE_REGION:
					return ((InternalEList)getInInterruptibleRegions()).basicRemove(otherEnd, msgs);
				case UML2Package.SEND_OBJECT_ACTION__HANDLER:
					return ((InternalEList)getHandlers()).basicRemove(otherEnd, msgs);
				case UML2Package.SEND_OBJECT_ACTION__LOCAL_PRECONDITION:
					return ((InternalEList)getLocalPreconditions()).basicRemove(otherEnd, msgs);
				case UML2Package.SEND_OBJECT_ACTION__LOCAL_POSTCONDITION:
					return ((InternalEList)getLocalPostconditions()).basicRemove(otherEnd, msgs);
				case UML2Package.SEND_OBJECT_ACTION__ARGUMENT:
					return ((InternalEList)getArguments()).basicRemove(otherEnd, msgs);
				case UML2Package.SEND_OBJECT_ACTION__TARGET:
					return basicSetTarget(null, msgs);
				case UML2Package.SEND_OBJECT_ACTION__REQUEST:
					return basicSetRequest(null, msgs);
				default:
					return eDynamicInverseRemove(otherEnd, featureID, baseClass, msgs);
			}
		}
		return eBasicSetContainer(null, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eBasicRemoveFromContainer(NotificationChain msgs) {
		if (eContainerFeatureID >= 0) {
			switch (eContainerFeatureID) {
				case UML2Package.SEND_OBJECT_ACTION__ACTIVITY:
					return eContainer.eInverseRemove(this, UML2Package.ACTIVITY__NODE, Activity.class, msgs);
				case UML2Package.SEND_OBJECT_ACTION__IN_STRUCTURED_NODE:
					return eContainer.eInverseRemove(this, UML2Package.STRUCTURED_ACTIVITY_NODE__CONTAINED_NODE, StructuredActivityNode.class, msgs);
				default:
					return eDynamicBasicRemoveFromContainer(msgs);
			}
		}
		return eContainer.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - eContainerFeatureID, null, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UML2Package.SEND_OBJECT_ACTION__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.SEND_OBJECT_ACTION__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.SEND_OBJECT_ACTION__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.SEND_OBJECT_ACTION__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.SEND_OBJECT_ACTION__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.SEND_OBJECT_ACTION__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UML2Package.SEND_OBJECT_ACTION__NAME:
				return getName();
			case UML2Package.SEND_OBJECT_ACTION__QUALIFIED_NAME:
				return getQualifiedName();
			case UML2Package.SEND_OBJECT_ACTION__VISIBILITY:
				return getVisibility();
			case UML2Package.SEND_OBJECT_ACTION__CLIENT_DEPENDENCY:
				return getClientDependencies();
			case UML2Package.SEND_OBJECT_ACTION__NAME_EXPRESSION:
				return getNameExpression();
			case UML2Package.SEND_OBJECT_ACTION__REDEFINITION_CONTEXT:
				return getRedefinitionContexts();
			case UML2Package.SEND_OBJECT_ACTION__IS_LEAF:
				return isLeaf() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.SEND_OBJECT_ACTION__OUTGOING:
				return getOutgoings();
			case UML2Package.SEND_OBJECT_ACTION__INCOMING:
				return getIncomings();
			case UML2Package.SEND_OBJECT_ACTION__IN_GROUP:
				return getInGroups();
			case UML2Package.SEND_OBJECT_ACTION__ACTIVITY:
				return getActivity();
			case UML2Package.SEND_OBJECT_ACTION__REDEFINED_ELEMENT:
				return getRedefinedElements();
			case UML2Package.SEND_OBJECT_ACTION__IN_STRUCTURED_NODE:
				return getInStructuredNode();
			case UML2Package.SEND_OBJECT_ACTION__IN_PARTITION:
				return getInPartitions();
			case UML2Package.SEND_OBJECT_ACTION__IN_INTERRUPTIBLE_REGION:
				return getInInterruptibleRegions();
			case UML2Package.SEND_OBJECT_ACTION__HANDLER:
				return getHandlers();
			case UML2Package.SEND_OBJECT_ACTION__EFFECT:
				return getEffect();
			case UML2Package.SEND_OBJECT_ACTION__OUTPUT:
				return getOutputs();
			case UML2Package.SEND_OBJECT_ACTION__INPUT:
				return getInputs();
			case UML2Package.SEND_OBJECT_ACTION__CONTEXT:
				if (resolve) return getContext();
				return basicGetContext();
			case UML2Package.SEND_OBJECT_ACTION__LOCAL_PRECONDITION:
				return getLocalPreconditions();
			case UML2Package.SEND_OBJECT_ACTION__LOCAL_POSTCONDITION:
				return getLocalPostconditions();
			case UML2Package.SEND_OBJECT_ACTION__ARGUMENT:
				return getArguments();
			case UML2Package.SEND_OBJECT_ACTION__ON_PORT:
				if (resolve) return getOnPort();
				return basicGetOnPort();
			case UML2Package.SEND_OBJECT_ACTION__TARGET:
				return getTarget();
			case UML2Package.SEND_OBJECT_ACTION__REQUEST:
				return getRequest();
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
			case UML2Package.SEND_OBJECT_ACTION__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.SEND_OBJECT_ACTION__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.SEND_OBJECT_ACTION__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection)newValue);
				return;
			case UML2Package.SEND_OBJECT_ACTION__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case UML2Package.SEND_OBJECT_ACTION__NAME:
				setName((String)newValue);
				return;
			case UML2Package.SEND_OBJECT_ACTION__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case UML2Package.SEND_OBJECT_ACTION__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection)newValue);
				return;
			case UML2Package.SEND_OBJECT_ACTION__NAME_EXPRESSION:
				setNameExpression((StringExpression)newValue);
				return;
			case UML2Package.SEND_OBJECT_ACTION__IS_LEAF:
				setIsLeaf(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.SEND_OBJECT_ACTION__OUTGOING:
				getOutgoings().clear();
				getOutgoings().addAll((Collection)newValue);
				return;
			case UML2Package.SEND_OBJECT_ACTION__INCOMING:
				getIncomings().clear();
				getIncomings().addAll((Collection)newValue);
				return;
			case UML2Package.SEND_OBJECT_ACTION__ACTIVITY:
				setActivity((Activity)newValue);
				return;
			case UML2Package.SEND_OBJECT_ACTION__REDEFINED_ELEMENT:
				getRedefinedElements().clear();
				getRedefinedElements().addAll((Collection)newValue);
				return;
			case UML2Package.SEND_OBJECT_ACTION__IN_STRUCTURED_NODE:
				setInStructuredNode((StructuredActivityNode)newValue);
				return;
			case UML2Package.SEND_OBJECT_ACTION__IN_PARTITION:
				getInPartitions().clear();
				getInPartitions().addAll((Collection)newValue);
				return;
			case UML2Package.SEND_OBJECT_ACTION__IN_INTERRUPTIBLE_REGION:
				getInInterruptibleRegions().clear();
				getInInterruptibleRegions().addAll((Collection)newValue);
				return;
			case UML2Package.SEND_OBJECT_ACTION__HANDLER:
				getHandlers().clear();
				getHandlers().addAll((Collection)newValue);
				return;
			case UML2Package.SEND_OBJECT_ACTION__EFFECT:
				setEffect((String)newValue);
				return;
			case UML2Package.SEND_OBJECT_ACTION__LOCAL_PRECONDITION:
				getLocalPreconditions().clear();
				getLocalPreconditions().addAll((Collection)newValue);
				return;
			case UML2Package.SEND_OBJECT_ACTION__LOCAL_POSTCONDITION:
				getLocalPostconditions().clear();
				getLocalPostconditions().addAll((Collection)newValue);
				return;
			case UML2Package.SEND_OBJECT_ACTION__ARGUMENT:
				getArguments().clear();
				getArguments().addAll((Collection)newValue);
				return;
			case UML2Package.SEND_OBJECT_ACTION__ON_PORT:
				setOnPort((Port)newValue);
				return;
			case UML2Package.SEND_OBJECT_ACTION__TARGET:
				setTarget((InputPin)newValue);
				return;
			case UML2Package.SEND_OBJECT_ACTION__REQUEST:
				setRequest((InputPin)newValue);
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
			case UML2Package.SEND_OBJECT_ACTION__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.SEND_OBJECT_ACTION__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.SEND_OBJECT_ACTION__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				return;
			case UML2Package.SEND_OBJECT_ACTION__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case UML2Package.SEND_OBJECT_ACTION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UML2Package.SEND_OBJECT_ACTION__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UML2Package.SEND_OBJECT_ACTION__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				return;
			case UML2Package.SEND_OBJECT_ACTION__NAME_EXPRESSION:
				setNameExpression((StringExpression)null);
				return;
			case UML2Package.SEND_OBJECT_ACTION__IS_LEAF:
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UML2Package.SEND_OBJECT_ACTION__OUTGOING:
				getOutgoings().clear();
				return;
			case UML2Package.SEND_OBJECT_ACTION__INCOMING:
				getIncomings().clear();
				return;
			case UML2Package.SEND_OBJECT_ACTION__ACTIVITY:
				setActivity((Activity)null);
				return;
			case UML2Package.SEND_OBJECT_ACTION__REDEFINED_ELEMENT:
				getRedefinedElements().clear();
				return;
			case UML2Package.SEND_OBJECT_ACTION__IN_STRUCTURED_NODE:
				setInStructuredNode((StructuredActivityNode)null);
				return;
			case UML2Package.SEND_OBJECT_ACTION__IN_PARTITION:
				getInPartitions().clear();
				return;
			case UML2Package.SEND_OBJECT_ACTION__IN_INTERRUPTIBLE_REGION:
				getInInterruptibleRegions().clear();
				return;
			case UML2Package.SEND_OBJECT_ACTION__HANDLER:
				getHandlers().clear();
				return;
			case UML2Package.SEND_OBJECT_ACTION__EFFECT:
				setEffect(EFFECT_EDEFAULT);
				return;
			case UML2Package.SEND_OBJECT_ACTION__LOCAL_PRECONDITION:
				getLocalPreconditions().clear();
				return;
			case UML2Package.SEND_OBJECT_ACTION__LOCAL_POSTCONDITION:
				getLocalPostconditions().clear();
				return;
			case UML2Package.SEND_OBJECT_ACTION__ARGUMENT:
				getArguments().clear();
				return;
			case UML2Package.SEND_OBJECT_ACTION__ON_PORT:
				setOnPort((Port)null);
				return;
			case UML2Package.SEND_OBJECT_ACTION__TARGET:
				setTarget((InputPin)null);
				return;
			case UML2Package.SEND_OBJECT_ACTION__REQUEST:
				setRequest((InputPin)null);
				return;
		}
		eDynamicUnset(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSetGen(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UML2Package.SEND_OBJECT_ACTION__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.SEND_OBJECT_ACTION__OWNED_ELEMENT:
				return !getOwnedElements().isEmpty();
			case UML2Package.SEND_OBJECT_ACTION__OWNER:
				return basicGetOwner() != null;
			case UML2Package.SEND_OBJECT_ACTION__OWNED_COMMENT:
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.SEND_OBJECT_ACTION__TEMPLATE_BINDING:
				return templateBinding != null && !templateBinding.isEmpty();
			case UML2Package.SEND_OBJECT_ACTION__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case UML2Package.SEND_OBJECT_ACTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.SEND_OBJECT_ACTION__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UML2Package.SEND_OBJECT_ACTION__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case UML2Package.SEND_OBJECT_ACTION__CLIENT_DEPENDENCY:
				return clientDependency != null && !clientDependency.isEmpty();
			case UML2Package.SEND_OBJECT_ACTION__NAME_EXPRESSION:
				return nameExpression != null;
			case UML2Package.SEND_OBJECT_ACTION__REDEFINITION_CONTEXT:
				return !getRedefinitionContexts().isEmpty();
			case UML2Package.SEND_OBJECT_ACTION__IS_LEAF:
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UML2Package.SEND_OBJECT_ACTION__OUTGOING:
				return outgoing != null && !outgoing.isEmpty();
			case UML2Package.SEND_OBJECT_ACTION__INCOMING:
				return incoming != null && !incoming.isEmpty();
			case UML2Package.SEND_OBJECT_ACTION__IN_GROUP:
				return !getInGroups().isEmpty();
			case UML2Package.SEND_OBJECT_ACTION__ACTIVITY:
				return getActivity() != null;
			case UML2Package.SEND_OBJECT_ACTION__REDEFINED_ELEMENT:
				return redefinedElement != null && !redefinedElement.isEmpty();
			case UML2Package.SEND_OBJECT_ACTION__IN_STRUCTURED_NODE:
				return getInStructuredNode() != null;
			case UML2Package.SEND_OBJECT_ACTION__IN_PARTITION:
				return inPartition != null && !inPartition.isEmpty();
			case UML2Package.SEND_OBJECT_ACTION__IN_INTERRUPTIBLE_REGION:
				return inInterruptibleRegion != null && !inInterruptibleRegion.isEmpty();
			case UML2Package.SEND_OBJECT_ACTION__HANDLER:
				return handler != null && !handler.isEmpty();
			case UML2Package.SEND_OBJECT_ACTION__EFFECT:
				return EFFECT_EDEFAULT == null ? effect != null : !EFFECT_EDEFAULT.equals(effect);
			case UML2Package.SEND_OBJECT_ACTION__OUTPUT:
				return !getOutputs().isEmpty();
			case UML2Package.SEND_OBJECT_ACTION__INPUT:
				return !getInputs().isEmpty();
			case UML2Package.SEND_OBJECT_ACTION__CONTEXT:
				return basicGetContext() != null;
			case UML2Package.SEND_OBJECT_ACTION__LOCAL_PRECONDITION:
				return localPrecondition != null && !localPrecondition.isEmpty();
			case UML2Package.SEND_OBJECT_ACTION__LOCAL_POSTCONDITION:
				return localPostcondition != null && !localPostcondition.isEmpty();
			case UML2Package.SEND_OBJECT_ACTION__ARGUMENT:
				return !getArguments().isEmpty();
			case UML2Package.SEND_OBJECT_ACTION__ON_PORT:
				return onPort != null;
			case UML2Package.SEND_OBJECT_ACTION__TARGET:
				return target != null;
			case UML2Package.SEND_OBJECT_ACTION__REQUEST:
				return request != null;
		}
		return eDynamicIsSet(eFeature);
	}


	public boolean eIsSet(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UML2Package.SEND_OBJECT_ACTION__ARGUMENT:
				return false;
		}
		return eIsSetGen(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EList getInputsHelper(EList input) {
		super.getInputsHelper(input);
		if (target != null) {
			input.add(target);
		}
		return input;
	}


} //SendObjectActionImpl
