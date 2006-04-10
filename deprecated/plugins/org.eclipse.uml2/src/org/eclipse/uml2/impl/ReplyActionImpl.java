/*
 * Copyright (c) 2003, 2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: ReplyActionImpl.java,v 1.22 2006/04/10 20:40:18 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.uml2.Activity;
import org.eclipse.uml2.CallTrigger;
import org.eclipse.uml2.InputPin;
import org.eclipse.uml2.ReplyAction;
import org.eclipse.uml2.StringExpression;
import org.eclipse.uml2.StructuredActivityNode;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.VisibilityKind;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reply Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.ReplyActionImpl#getReplyToCall <em>Reply To Call</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ReplyActionImpl#getReplyValues <em>Reply Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ReplyActionImpl#getReturnInformation <em>Return Information</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReplyActionImpl extends ActionImpl implements ReplyAction {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getReplyToCall() <em>Reply To Call</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplyToCall()
	 * @generated
	 * @ordered
	 */
	protected CallTrigger replyToCall = null;

	/**
	 * The cached value of the '{@link #getReplyValues() <em>Reply Value</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplyValues()
	 * @generated
	 * @ordered
	 */
	protected EList replyValues = null;

	/**
	 * The cached value of the '{@link #getReturnInformation() <em>Return Information</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnInformation()
	 * @generated
	 * @ordered
	 */
	protected InputPin returnInformation = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReplyActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UML2Package.Literals.REPLY_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getInputs() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			EList inputs = (EList) cache.get(eResource, this, UML2Package.Literals.ACTION__INPUT);
			if (inputs == null) {
				cache.put(eResource, this, UML2Package.Literals.ACTION__INPUT, inputs = new DerivedUnionEObjectEList(InputPin.class, this, UML2Package.REPLY_ACTION__INPUT, INPUT_ESUBSETS));
			}
			return inputs;
		}
		return new DerivedUnionEObjectEList(InputPin.class, this, UML2Package.REPLY_ACTION__INPUT, INPUT_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInputs() {
		return super.isSetInputs()
			|| eIsSet(UML2Package.REPLY_ACTION__REPLY_VALUE)
			|| eIsSet(UML2Package.REPLY_ACTION__RETURN_INFORMATION);
	}


	/**
	 * The array of subset feature identifiers for the '{@link #getInputs() <em>Input</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputs()
	 * @generated
	 * @ordered
	 */
	protected static final int[] INPUT_ESUBSETS = new int[] {UML2Package.REPLY_ACTION__REPLY_VALUE, UML2Package.REPLY_ACTION__RETURN_INFORMATION};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallTrigger getReplyToCall() {
		if (replyToCall != null && replyToCall.eIsProxy()) {
			InternalEObject oldReplyToCall = (InternalEObject)replyToCall;
			replyToCall = (CallTrigger)eResolveProxy(oldReplyToCall);
			if (replyToCall != oldReplyToCall) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2Package.REPLY_ACTION__REPLY_TO_CALL, oldReplyToCall, replyToCall));
			}
		}
		return replyToCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallTrigger basicGetReplyToCall() {
		return replyToCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReplyToCall(CallTrigger newReplyToCall) {
		CallTrigger oldReplyToCall = replyToCall;
		replyToCall = newReplyToCall;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.REPLY_ACTION__REPLY_TO_CALL, oldReplyToCall, replyToCall));


	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getReplyValues() {
		if (replyValues == null) {
			replyValues = new EObjectResolvingEList(InputPin.class, this, UML2Package.REPLY_ACTION__REPLY_VALUE);
		}
		return replyValues;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public InputPin getReplyValue(String name) {
		return getReplyValue(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin getReplyValue(String name, boolean ignoreCase, EClass eClass) {
		replyValueLoop: for (Iterator i = getReplyValues().iterator(); i.hasNext(); ) {
			InputPin replyValue = (InputPin) i.next();
			if (eClass != null && !eClass.isInstance(replyValue))
				continue replyValueLoop;
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(replyValue.getName()) : name.equals(replyValue.getName())))
				continue replyValueLoop;
			return replyValue;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin getReturnInformation() {
		if (returnInformation != null && returnInformation.eIsProxy()) {
			InternalEObject oldReturnInformation = (InternalEObject)returnInformation;
			returnInformation = (InputPin)eResolveProxy(oldReturnInformation);
			if (returnInformation != oldReturnInformation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2Package.REPLY_ACTION__RETURN_INFORMATION, oldReturnInformation, returnInformation));
			}
		}
		return returnInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin basicGetReturnInformation() {
		return returnInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnInformation(InputPin newReturnInformation) {
		InputPin oldReturnInformation = returnInformation;
		returnInformation = newReturnInformation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.REPLY_ACTION__RETURN_INFORMATION, oldReturnInformation, returnInformation));


	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UML2Package.REPLY_ACTION__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.REPLY_ACTION__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.REPLY_ACTION__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.REPLY_ACTION__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.REPLY_ACTION__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.REPLY_ACTION__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UML2Package.REPLY_ACTION__NAME:
				return getName();
			case UML2Package.REPLY_ACTION__QUALIFIED_NAME:
				return getQualifiedName();
			case UML2Package.REPLY_ACTION__VISIBILITY:
				return getVisibility();
			case UML2Package.REPLY_ACTION__CLIENT_DEPENDENCY:
				return getClientDependencies();
			case UML2Package.REPLY_ACTION__NAME_EXPRESSION:
				return getNameExpression();
			case UML2Package.REPLY_ACTION__REDEFINITION_CONTEXT:
				return getRedefinitionContexts();
			case UML2Package.REPLY_ACTION__IS_LEAF:
				return isLeaf() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.REPLY_ACTION__OUTGOING:
				return getOutgoings();
			case UML2Package.REPLY_ACTION__INCOMING:
				return getIncomings();
			case UML2Package.REPLY_ACTION__IN_GROUP:
				return getInGroups();
			case UML2Package.REPLY_ACTION__ACTIVITY:
				return getActivity();
			case UML2Package.REPLY_ACTION__REDEFINED_ELEMENT:
				return getRedefinedElements();
			case UML2Package.REPLY_ACTION__IN_STRUCTURED_NODE:
				return getInStructuredNode();
			case UML2Package.REPLY_ACTION__IN_PARTITION:
				return getInPartitions();
			case UML2Package.REPLY_ACTION__IN_INTERRUPTIBLE_REGION:
				return getInInterruptibleRegions();
			case UML2Package.REPLY_ACTION__HANDLER:
				return getHandlers();
			case UML2Package.REPLY_ACTION__EFFECT:
				return getEffect();
			case UML2Package.REPLY_ACTION__OUTPUT:
				return getOutputs();
			case UML2Package.REPLY_ACTION__INPUT:
				return getInputs();
			case UML2Package.REPLY_ACTION__CONTEXT:
				return getContext();
			case UML2Package.REPLY_ACTION__LOCAL_PRECONDITION:
				return getLocalPreconditions();
			case UML2Package.REPLY_ACTION__LOCAL_POSTCONDITION:
				return getLocalPostconditions();
			case UML2Package.REPLY_ACTION__REPLY_TO_CALL:
				if (resolve) return getReplyToCall();
				return basicGetReplyToCall();
			case UML2Package.REPLY_ACTION__REPLY_VALUE:
				return getReplyValues();
			case UML2Package.REPLY_ACTION__RETURN_INFORMATION:
				if (resolve) return getReturnInformation();
				return basicGetReturnInformation();
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
			case UML2Package.REPLY_ACTION__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.REPLY_ACTION__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.REPLY_ACTION__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection)newValue);
				return;
			case UML2Package.REPLY_ACTION__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case UML2Package.REPLY_ACTION__NAME:
				setName((String)newValue);
				return;
			case UML2Package.REPLY_ACTION__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case UML2Package.REPLY_ACTION__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection)newValue);
				return;
			case UML2Package.REPLY_ACTION__NAME_EXPRESSION:
				setNameExpression((StringExpression)newValue);
				return;
			case UML2Package.REPLY_ACTION__IS_LEAF:
				setIsLeaf(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.REPLY_ACTION__OUTGOING:
				getOutgoings().clear();
				getOutgoings().addAll((Collection)newValue);
				return;
			case UML2Package.REPLY_ACTION__INCOMING:
				getIncomings().clear();
				getIncomings().addAll((Collection)newValue);
				return;
			case UML2Package.REPLY_ACTION__ACTIVITY:
				setActivity((Activity)newValue);
				return;
			case UML2Package.REPLY_ACTION__REDEFINED_ELEMENT:
				getRedefinedElements().clear();
				getRedefinedElements().addAll((Collection)newValue);
				return;
			case UML2Package.REPLY_ACTION__IN_STRUCTURED_NODE:
				setInStructuredNode((StructuredActivityNode)newValue);
				return;
			case UML2Package.REPLY_ACTION__IN_PARTITION:
				getInPartitions().clear();
				getInPartitions().addAll((Collection)newValue);
				return;
			case UML2Package.REPLY_ACTION__IN_INTERRUPTIBLE_REGION:
				getInInterruptibleRegions().clear();
				getInInterruptibleRegions().addAll((Collection)newValue);
				return;
			case UML2Package.REPLY_ACTION__HANDLER:
				getHandlers().clear();
				getHandlers().addAll((Collection)newValue);
				return;
			case UML2Package.REPLY_ACTION__EFFECT:
				setEffect((String)newValue);
				return;
			case UML2Package.REPLY_ACTION__LOCAL_PRECONDITION:
				getLocalPreconditions().clear();
				getLocalPreconditions().addAll((Collection)newValue);
				return;
			case UML2Package.REPLY_ACTION__LOCAL_POSTCONDITION:
				getLocalPostconditions().clear();
				getLocalPostconditions().addAll((Collection)newValue);
				return;
			case UML2Package.REPLY_ACTION__REPLY_TO_CALL:
				setReplyToCall((CallTrigger)newValue);
				return;
			case UML2Package.REPLY_ACTION__REPLY_VALUE:
				getReplyValues().clear();
				getReplyValues().addAll((Collection)newValue);
				return;
			case UML2Package.REPLY_ACTION__RETURN_INFORMATION:
				setReturnInformation((InputPin)newValue);
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
			case UML2Package.REPLY_ACTION__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.REPLY_ACTION__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.REPLY_ACTION__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				return;
			case UML2Package.REPLY_ACTION__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case UML2Package.REPLY_ACTION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UML2Package.REPLY_ACTION__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UML2Package.REPLY_ACTION__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				return;
			case UML2Package.REPLY_ACTION__NAME_EXPRESSION:
				setNameExpression((StringExpression)null);
				return;
			case UML2Package.REPLY_ACTION__IS_LEAF:
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UML2Package.REPLY_ACTION__OUTGOING:
				getOutgoings().clear();
				return;
			case UML2Package.REPLY_ACTION__INCOMING:
				getIncomings().clear();
				return;
			case UML2Package.REPLY_ACTION__ACTIVITY:
				setActivity((Activity)null);
				return;
			case UML2Package.REPLY_ACTION__REDEFINED_ELEMENT:
				getRedefinedElements().clear();
				return;
			case UML2Package.REPLY_ACTION__IN_STRUCTURED_NODE:
				setInStructuredNode((StructuredActivityNode)null);
				return;
			case UML2Package.REPLY_ACTION__IN_PARTITION:
				getInPartitions().clear();
				return;
			case UML2Package.REPLY_ACTION__IN_INTERRUPTIBLE_REGION:
				getInInterruptibleRegions().clear();
				return;
			case UML2Package.REPLY_ACTION__HANDLER:
				getHandlers().clear();
				return;
			case UML2Package.REPLY_ACTION__EFFECT:
				setEffect(EFFECT_EDEFAULT);
				return;
			case UML2Package.REPLY_ACTION__LOCAL_PRECONDITION:
				getLocalPreconditions().clear();
				return;
			case UML2Package.REPLY_ACTION__LOCAL_POSTCONDITION:
				getLocalPostconditions().clear();
				return;
			case UML2Package.REPLY_ACTION__REPLY_TO_CALL:
				setReplyToCall((CallTrigger)null);
				return;
			case UML2Package.REPLY_ACTION__REPLY_VALUE:
				getReplyValues().clear();
				return;
			case UML2Package.REPLY_ACTION__RETURN_INFORMATION:
				setReturnInformation((InputPin)null);
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
			case UML2Package.REPLY_ACTION__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.REPLY_ACTION__OWNED_ELEMENT:
				return isSetOwnedElements();
			case UML2Package.REPLY_ACTION__OWNER:
				return isSetOwner();
			case UML2Package.REPLY_ACTION__OWNED_COMMENT:
				return ownedComments != null && !ownedComments.isEmpty();
			case UML2Package.REPLY_ACTION__TEMPLATE_BINDING:
				return templateBindings != null && !templateBindings.isEmpty();
			case UML2Package.REPLY_ACTION__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case UML2Package.REPLY_ACTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.REPLY_ACTION__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UML2Package.REPLY_ACTION__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case UML2Package.REPLY_ACTION__CLIENT_DEPENDENCY:
				return clientDependencies != null && !clientDependencies.isEmpty();
			case UML2Package.REPLY_ACTION__NAME_EXPRESSION:
				return nameExpression != null;
			case UML2Package.REPLY_ACTION__REDEFINITION_CONTEXT:
				return isSetRedefinitionContexts();
			case UML2Package.REPLY_ACTION__IS_LEAF:
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UML2Package.REPLY_ACTION__OUTGOING:
				return outgoings != null && !outgoings.isEmpty();
			case UML2Package.REPLY_ACTION__INCOMING:
				return incomings != null && !incomings.isEmpty();
			case UML2Package.REPLY_ACTION__IN_GROUP:
				return isSetInGroups();
			case UML2Package.REPLY_ACTION__ACTIVITY:
				return getActivity() != null;
			case UML2Package.REPLY_ACTION__REDEFINED_ELEMENT:
				return isSetRedefinedElements();
			case UML2Package.REPLY_ACTION__IN_STRUCTURED_NODE:
				return getInStructuredNode() != null;
			case UML2Package.REPLY_ACTION__IN_PARTITION:
				return inPartitions != null && !inPartitions.isEmpty();
			case UML2Package.REPLY_ACTION__IN_INTERRUPTIBLE_REGION:
				return inInterruptibleRegions != null && !inInterruptibleRegions.isEmpty();
			case UML2Package.REPLY_ACTION__HANDLER:
				return handlers != null && !handlers.isEmpty();
			case UML2Package.REPLY_ACTION__EFFECT:
				return EFFECT_EDEFAULT == null ? effect != null : !EFFECT_EDEFAULT.equals(effect);
			case UML2Package.REPLY_ACTION__OUTPUT:
				return isSetOutputs();
			case UML2Package.REPLY_ACTION__INPUT:
				return isSetInputs();
			case UML2Package.REPLY_ACTION__CONTEXT:
				return getContext() != null;
			case UML2Package.REPLY_ACTION__LOCAL_PRECONDITION:
				return localPreconditions != null && !localPreconditions.isEmpty();
			case UML2Package.REPLY_ACTION__LOCAL_POSTCONDITION:
				return localPostconditions != null && !localPostconditions.isEmpty();
			case UML2Package.REPLY_ACTION__REPLY_TO_CALL:
				return replyToCall != null;
			case UML2Package.REPLY_ACTION__REPLY_VALUE:
				return replyValues != null && !replyValues.isEmpty();
			case UML2Package.REPLY_ACTION__RETURN_INFORMATION:
				return returnInformation != null;
		}
		return eDynamicIsSet(featureID);
	}


} //ReplyActionImpl
