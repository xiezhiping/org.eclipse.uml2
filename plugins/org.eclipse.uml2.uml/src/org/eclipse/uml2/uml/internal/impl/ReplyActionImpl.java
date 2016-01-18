/*
 * Copyright (c) 2005, 2016 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey - 286329, 323181
 *   Kenn Hussey (CEA) - 327039, 351774, 418466, 451350, 485756
 *
 */
package org.eclipse.uml2.uml.internal.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.ActivityEdge;
import org.eclipse.uml2.uml.ActivityNode;
import org.eclipse.uml2.uml.ActivityPartition;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.ExceptionHandler;
import org.eclipse.uml2.uml.InputPin;
import org.eclipse.uml2.uml.InterruptibleActivityRegion;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.RedefinableElement;
import org.eclipse.uml2.uml.ReplyAction;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.StructuredActivityNode;
import org.eclipse.uml2.uml.Trigger;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.ReplyActionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reply Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ReplyActionImpl#getInputs <em>Input</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ReplyActionImpl#getReplyToCall <em>Reply To Call</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ReplyActionImpl#getReplyValues <em>Reply Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ReplyActionImpl#getReturnInformation <em>Return Information</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReplyActionImpl
		extends ActionImpl
		implements ReplyAction {

	/**
	 * The cached value of the '{@link #getReplyToCall() <em>Reply To Call</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplyToCall()
	 * @generated
	 * @ordered
	 */
	protected Trigger replyToCall;

	/**
	 * The cached value of the '{@link #getReplyValues() <em>Reply Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplyValues()
	 * @generated
	 * @ordered
	 */
	protected EList<InputPin> replyValues;

	/**
	 * The cached value of the '{@link #getReturnInformation() <em>Return Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnInformation()
	 * @generated
	 * @ordered
	 */
	protected InputPin returnInformation;

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
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.REPLY_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InputPin> getInputs() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			@SuppressWarnings("unchecked")
			EList<InputPin> inputs = (EList<InputPin>) cache.get(eResource,
				this, UMLPackage.Literals.ACTION__INPUT);
			if (inputs == null) {
				cache.put(eResource, this, UMLPackage.Literals.ACTION__INPUT,
					inputs = new DerivedUnionEObjectEList<InputPin>(
						InputPin.class, this, UMLPackage.REPLY_ACTION__INPUT,
						INPUT_ESUBSETS));
			}
			return inputs;
		}
		return new DerivedUnionEObjectEList<InputPin>(InputPin.class, this,
			UMLPackage.REPLY_ACTION__INPUT, INPUT_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trigger getReplyToCall() {
		if (replyToCall != null && replyToCall.eIsProxy()) {
			InternalEObject oldReplyToCall = (InternalEObject) replyToCall;
			replyToCall = (Trigger) eResolveProxy(oldReplyToCall);
			if (replyToCall != oldReplyToCall) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.REPLY_ACTION__REPLY_TO_CALL, oldReplyToCall,
						replyToCall));
			}
		}
		return replyToCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trigger basicGetReplyToCall() {
		return replyToCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReplyToCall(Trigger newReplyToCall) {
		Trigger oldReplyToCall = replyToCall;
		replyToCall = newReplyToCall;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.REPLY_ACTION__REPLY_TO_CALL, oldReplyToCall,
				replyToCall));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin getReturnInformation() {
		if (returnInformation != null && returnInformation.eIsProxy()) {
			InternalEObject oldReturnInformation = (InternalEObject) returnInformation;
			returnInformation = (InputPin) eResolveProxy(oldReturnInformation);
			if (returnInformation != oldReturnInformation) {
				InternalEObject newReturnInformation = (InternalEObject) returnInformation;
				NotificationChain msgs = oldReturnInformation.eInverseRemove(
					this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.REPLY_ACTION__RETURN_INFORMATION,
					null, null);
				if (newReturnInformation.eInternalContainer() == null) {
					msgs = newReturnInformation.eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
							- UMLPackage.REPLY_ACTION__RETURN_INFORMATION,
						null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.REPLY_ACTION__RETURN_INFORMATION,
						oldReturnInformation, returnInformation));
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
	public NotificationChain basicSetReturnInformation(
			InputPin newReturnInformation, NotificationChain msgs) {
		InputPin oldReturnInformation = returnInformation;
		returnInformation = newReturnInformation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET, UMLPackage.REPLY_ACTION__RETURN_INFORMATION,
				oldReturnInformation, newReturnInformation);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnInformation(InputPin newReturnInformation) {
		if (newReturnInformation != returnInformation) {
			NotificationChain msgs = null;
			if (returnInformation != null)
				msgs = ((InternalEObject) returnInformation).eInverseRemove(
					this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.REPLY_ACTION__RETURN_INFORMATION,
					null, msgs);
			if (newReturnInformation != null)
				msgs = ((InternalEObject) newReturnInformation).eInverseAdd(
					this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.REPLY_ACTION__RETURN_INFORMATION,
					null, msgs);
			msgs = basicSetReturnInformation(newReturnInformation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.REPLY_ACTION__RETURN_INFORMATION,
				newReturnInformation, newReturnInformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin createReturnInformation(String name, Type type,
			EClass eClass) {
		InputPin newReturnInformation = (InputPin) create(eClass);
		setReturnInformation(newReturnInformation);
		if (name != null)
			newReturnInformation.setName(name);
		if (type != null)
			newReturnInformation.setType(type);
		return newReturnInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin createReturnInformation(String name, Type type) {
		return createReturnInformation(name, type,
			UMLPackage.Literals.INPUT_PIN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputPin> getReplyValues() {
		if (replyValues == null) {
			replyValues = new EObjectContainmentEList.Resolving<InputPin>(
				InputPin.class, this, UMLPackage.REPLY_ACTION__REPLY_VALUE);
		}
		return replyValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin createReplyValue(String name, Type type, EClass eClass) {
		InputPin newReplyValue = (InputPin) create(eClass);
		getReplyValues().add(newReplyValue);
		if (name != null)
			newReplyValue.setName(name);
		if (type != null)
			newReplyValue.setType(type);
		return newReplyValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin createReplyValue(String name, Type type) {
		return createReplyValue(name, type, UMLPackage.Literals.INPUT_PIN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin getReplyValue(String name, Type type) {
		return getReplyValue(name, type, false, null, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin getReplyValue(String name, Type type, boolean ignoreCase,
			EClass eClass, boolean createOnDemand) {
		replyValueLoop : for (InputPin replyValue : getReplyValues()) {
			if (eClass != null && !eClass.isInstance(replyValue))
				continue replyValueLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(replyValue.getName())
				: name.equals(replyValue.getName())))
				continue replyValueLoop;
			if (type != null && !type.equals(replyValue.getType()))
				continue replyValueLoop;
			return replyValue;
		}
		return createOnDemand && eClass != null
			? createReplyValue(name, type, eClass)
			: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePinsMatchParameter(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ReplyActionOperations.validatePinsMatchParameter(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEventOnReplyToCallTrigger(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReplyActionOperations.validateEventOnReplyToCallTrigger(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.REPLY_ACTION__EANNOTATIONS :
				return ((InternalEList<?>) getEAnnotations())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.REPLY_ACTION__OWNED_COMMENT :
				return ((InternalEList<?>) getOwnedComments())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.REPLY_ACTION__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.REPLY_ACTION__IN_INTERRUPTIBLE_REGION :
				return ((InternalEList<?>) getInInterruptibleRegions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.REPLY_ACTION__IN_STRUCTURED_NODE :
				return basicSetInStructuredNode(null, msgs);
			case UMLPackage.REPLY_ACTION__INCOMING :
				return ((InternalEList<?>) getIncomings()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.REPLY_ACTION__OUTGOING :
				return ((InternalEList<?>) getOutgoings()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.REPLY_ACTION__IN_PARTITION :
				return ((InternalEList<?>) getInPartitions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.REPLY_ACTION__HANDLER :
				return ((InternalEList<?>) getHandlers()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.REPLY_ACTION__LOCAL_POSTCONDITION :
				return ((InternalEList<?>) getLocalPostconditions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.REPLY_ACTION__LOCAL_PRECONDITION :
				return ((InternalEList<?>) getLocalPreconditions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.REPLY_ACTION__REPLY_VALUE :
				return ((InternalEList<?>) getReplyValues())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.REPLY_ACTION__RETURN_INFORMATION :
				return basicSetReturnInformation(null, msgs);
		}
		return eDynamicInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.REPLY_ACTION__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.REPLY_ACTION__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.REPLY_ACTION__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.REPLY_ACTION__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.REPLY_ACTION__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.REPLY_ACTION__NAME :
				return getName();
			case UMLPackage.REPLY_ACTION__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.REPLY_ACTION__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.REPLY_ACTION__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.REPLY_ACTION__VISIBILITY :
				return getVisibility();
			case UMLPackage.REPLY_ACTION__IS_LEAF :
				return isLeaf();
			case UMLPackage.REPLY_ACTION__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.REPLY_ACTION__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.REPLY_ACTION__ACTIVITY :
				if (resolve)
					return getActivity();
				return basicGetActivity();
			case UMLPackage.REPLY_ACTION__IN_GROUP :
				return getInGroups();
			case UMLPackage.REPLY_ACTION__IN_INTERRUPTIBLE_REGION :
				return getInInterruptibleRegions();
			case UMLPackage.REPLY_ACTION__IN_STRUCTURED_NODE :
				if (resolve)
					return getInStructuredNode();
				return basicGetInStructuredNode();
			case UMLPackage.REPLY_ACTION__INCOMING :
				return getIncomings();
			case UMLPackage.REPLY_ACTION__OUTGOING :
				return getOutgoings();
			case UMLPackage.REPLY_ACTION__REDEFINED_NODE :
				return getRedefinedNodes();
			case UMLPackage.REPLY_ACTION__IN_PARTITION :
				return getInPartitions();
			case UMLPackage.REPLY_ACTION__HANDLER :
				return getHandlers();
			case UMLPackage.REPLY_ACTION__CONTEXT :
				if (resolve)
					return getContext();
				return basicGetContext();
			case UMLPackage.REPLY_ACTION__INPUT :
				return getInputs();
			case UMLPackage.REPLY_ACTION__IS_LOCALLY_REENTRANT :
				return isLocallyReentrant();
			case UMLPackage.REPLY_ACTION__LOCAL_POSTCONDITION :
				return getLocalPostconditions();
			case UMLPackage.REPLY_ACTION__LOCAL_PRECONDITION :
				return getLocalPreconditions();
			case UMLPackage.REPLY_ACTION__OUTPUT :
				return getOutputs();
			case UMLPackage.REPLY_ACTION__REPLY_TO_CALL :
				if (resolve)
					return getReplyToCall();
				return basicGetReplyToCall();
			case UMLPackage.REPLY_ACTION__REPLY_VALUE :
				return getReplyValues();
			case UMLPackage.REPLY_ACTION__RETURN_INFORMATION :
				if (resolve)
					return getReturnInformation();
				return basicGetReturnInformation();
		}
		return eDynamicGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UMLPackage.REPLY_ACTION__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations()
					.addAll((Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.REPLY_ACTION__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments()
					.addAll((Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.REPLY_ACTION__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.REPLY_ACTION__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.REPLY_ACTION__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.REPLY_ACTION__IS_LEAF :
				setIsLeaf((Boolean) newValue);
				return;
			case UMLPackage.REPLY_ACTION__ACTIVITY :
				setActivity((Activity) newValue);
				return;
			case UMLPackage.REPLY_ACTION__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				getInInterruptibleRegions().addAll(
					(Collection<? extends InterruptibleActivityRegion>) newValue);
				return;
			case UMLPackage.REPLY_ACTION__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) newValue);
				return;
			case UMLPackage.REPLY_ACTION__INCOMING :
				getIncomings().clear();
				getIncomings()
					.addAll((Collection<? extends ActivityEdge>) newValue);
				return;
			case UMLPackage.REPLY_ACTION__OUTGOING :
				getOutgoings().clear();
				getOutgoings()
					.addAll((Collection<? extends ActivityEdge>) newValue);
				return;
			case UMLPackage.REPLY_ACTION__REDEFINED_NODE :
				getRedefinedNodes().clear();
				getRedefinedNodes()
					.addAll((Collection<? extends ActivityNode>) newValue);
				return;
			case UMLPackage.REPLY_ACTION__IN_PARTITION :
				getInPartitions().clear();
				getInPartitions()
					.addAll((Collection<? extends ActivityPartition>) newValue);
				return;
			case UMLPackage.REPLY_ACTION__HANDLER :
				getHandlers().clear();
				getHandlers()
					.addAll((Collection<? extends ExceptionHandler>) newValue);
				return;
			case UMLPackage.REPLY_ACTION__IS_LOCALLY_REENTRANT :
				setIsLocallyReentrant((Boolean) newValue);
				return;
			case UMLPackage.REPLY_ACTION__LOCAL_POSTCONDITION :
				getLocalPostconditions().clear();
				getLocalPostconditions()
					.addAll((Collection<? extends Constraint>) newValue);
				return;
			case UMLPackage.REPLY_ACTION__LOCAL_PRECONDITION :
				getLocalPreconditions().clear();
				getLocalPreconditions()
					.addAll((Collection<? extends Constraint>) newValue);
				return;
			case UMLPackage.REPLY_ACTION__REPLY_TO_CALL :
				setReplyToCall((Trigger) newValue);
				return;
			case UMLPackage.REPLY_ACTION__REPLY_VALUE :
				getReplyValues().clear();
				getReplyValues()
					.addAll((Collection<? extends InputPin>) newValue);
				return;
			case UMLPackage.REPLY_ACTION__RETURN_INFORMATION :
				setReturnInformation((InputPin) newValue);
				return;
		}
		eDynamicSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case UMLPackage.REPLY_ACTION__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.REPLY_ACTION__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.REPLY_ACTION__NAME :
				unsetName();
				return;
			case UMLPackage.REPLY_ACTION__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.REPLY_ACTION__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.REPLY_ACTION__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.REPLY_ACTION__ACTIVITY :
				setActivity((Activity) null);
				return;
			case UMLPackage.REPLY_ACTION__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				return;
			case UMLPackage.REPLY_ACTION__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) null);
				return;
			case UMLPackage.REPLY_ACTION__INCOMING :
				getIncomings().clear();
				return;
			case UMLPackage.REPLY_ACTION__OUTGOING :
				getOutgoings().clear();
				return;
			case UMLPackage.REPLY_ACTION__REDEFINED_NODE :
				getRedefinedNodes().clear();
				return;
			case UMLPackage.REPLY_ACTION__IN_PARTITION :
				getInPartitions().clear();
				return;
			case UMLPackage.REPLY_ACTION__HANDLER :
				getHandlers().clear();
				return;
			case UMLPackage.REPLY_ACTION__IS_LOCALLY_REENTRANT :
				setIsLocallyReentrant(IS_LOCALLY_REENTRANT_EDEFAULT);
				return;
			case UMLPackage.REPLY_ACTION__LOCAL_POSTCONDITION :
				getLocalPostconditions().clear();
				return;
			case UMLPackage.REPLY_ACTION__LOCAL_PRECONDITION :
				getLocalPreconditions().clear();
				return;
			case UMLPackage.REPLY_ACTION__REPLY_TO_CALL :
				setReplyToCall((Trigger) null);
				return;
			case UMLPackage.REPLY_ACTION__REPLY_VALUE :
				getReplyValues().clear();
				return;
			case UMLPackage.REPLY_ACTION__RETURN_INFORMATION :
				setReturnInformation((InputPin) null);
				return;
		}
		eDynamicUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UMLPackage.REPLY_ACTION__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.REPLY_ACTION__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.REPLY_ACTION__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.REPLY_ACTION__OWNER :
				return isSetOwner();
			case UMLPackage.REPLY_ACTION__CLIENT_DEPENDENCY :
				return !getClientDependencies().isEmpty();
			case UMLPackage.REPLY_ACTION__NAME :
				return isSetName();
			case UMLPackage.REPLY_ACTION__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.REPLY_ACTION__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.REPLY_ACTION__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.REPLY_ACTION__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.REPLY_ACTION__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.REPLY_ACTION__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.REPLY_ACTION__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.REPLY_ACTION__ACTIVITY :
				return basicGetActivity() != null;
			case UMLPackage.REPLY_ACTION__IN_GROUP :
				return isSetInGroups();
			case UMLPackage.REPLY_ACTION__IN_INTERRUPTIBLE_REGION :
				return inInterruptibleRegions != null
					&& !inInterruptibleRegions.isEmpty();
			case UMLPackage.REPLY_ACTION__IN_STRUCTURED_NODE :
				return basicGetInStructuredNode() != null;
			case UMLPackage.REPLY_ACTION__INCOMING :
				return incomings != null && !incomings.isEmpty();
			case UMLPackage.REPLY_ACTION__OUTGOING :
				return outgoings != null && !outgoings.isEmpty();
			case UMLPackage.REPLY_ACTION__REDEFINED_NODE :
				return redefinedNodes != null && !redefinedNodes.isEmpty();
			case UMLPackage.REPLY_ACTION__IN_PARTITION :
				return inPartitions != null && !inPartitions.isEmpty();
			case UMLPackage.REPLY_ACTION__HANDLER :
				return handlers != null && !handlers.isEmpty();
			case UMLPackage.REPLY_ACTION__CONTEXT :
				return basicGetContext() != null;
			case UMLPackage.REPLY_ACTION__INPUT :
				return isSetInputs();
			case UMLPackage.REPLY_ACTION__IS_LOCALLY_REENTRANT :
				return ((eFlags
					& IS_LOCALLY_REENTRANT_EFLAG) != 0) != IS_LOCALLY_REENTRANT_EDEFAULT;
			case UMLPackage.REPLY_ACTION__LOCAL_POSTCONDITION :
				return localPostconditions != null
					&& !localPostconditions.isEmpty();
			case UMLPackage.REPLY_ACTION__LOCAL_PRECONDITION :
				return localPreconditions != null
					&& !localPreconditions.isEmpty();
			case UMLPackage.REPLY_ACTION__OUTPUT :
				return isSetOutputs();
			case UMLPackage.REPLY_ACTION__REPLY_TO_CALL :
				return replyToCall != null;
			case UMLPackage.REPLY_ACTION__REPLY_VALUE :
				return replyValues != null && !replyValues.isEmpty();
			case UMLPackage.REPLY_ACTION__RETURN_INFORMATION :
				return returnInformation != null;
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments)
			throws InvocationTargetException {
		switch (operationID) {
			case UMLPackage.REPLY_ACTION___GET_EANNOTATION__STRING :
				return getEAnnotation((String) arguments.get(0));
			case UMLPackage.REPLY_ACTION___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP :
				return validateHasOwner((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.REPLY_ACTION___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP :
				return validateNotOwnSelf((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.REPLY_ACTION___ADD_KEYWORD__STRING :
				return addKeyword((String) arguments.get(0));
			case UMLPackage.REPLY_ACTION___APPLY_STEREOTYPE__STEREOTYPE :
				return applyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.REPLY_ACTION___CREATE_EANNOTATION__STRING :
				return createEAnnotation((String) arguments.get(0));
			case UMLPackage.REPLY_ACTION___DESTROY :
				destroy();
				return null;
			case UMLPackage.REPLY_ACTION___GET_KEYWORDS :
				return getKeywords();
			case UMLPackage.REPLY_ACTION___GET_APPLICABLE_STEREOTYPE__STRING :
				return getApplicableStereotype((String) arguments.get(0));
			case UMLPackage.REPLY_ACTION___GET_APPLICABLE_STEREOTYPES :
				return getApplicableStereotypes();
			case UMLPackage.REPLY_ACTION___GET_APPLIED_STEREOTYPE__STRING :
				return getAppliedStereotype((String) arguments.get(0));
			case UMLPackage.REPLY_ACTION___GET_APPLIED_STEREOTYPES :
				return getAppliedStereotypes();
			case UMLPackage.REPLY_ACTION___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING :
				return getAppliedSubstereotype((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.REPLY_ACTION___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE :
				return getAppliedSubstereotypes((Stereotype) arguments.get(0));
			case UMLPackage.REPLY_ACTION___GET_MODEL :
				return getModel();
			case UMLPackage.REPLY_ACTION___GET_NEAREST_PACKAGE :
				return getNearestPackage();
			case UMLPackage.REPLY_ACTION___GET_RELATIONSHIPS :
				return getRelationships();
			case UMLPackage.REPLY_ACTION___GET_RELATIONSHIPS__ECLASS :
				return getRelationships((EClass) arguments.get(0));
			case UMLPackage.REPLY_ACTION___GET_REQUIRED_STEREOTYPE__STRING :
				return getRequiredStereotype((String) arguments.get(0));
			case UMLPackage.REPLY_ACTION___GET_REQUIRED_STEREOTYPES :
				return getRequiredStereotypes();
			case UMLPackage.REPLY_ACTION___GET_SOURCE_DIRECTED_RELATIONSHIPS :
				return getSourceDirectedRelationships();
			case UMLPackage.REPLY_ACTION___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS :
				return getSourceDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.REPLY_ACTION___GET_STEREOTYPE_APPLICATION__STEREOTYPE :
				return getStereotypeApplication((Stereotype) arguments.get(0));
			case UMLPackage.REPLY_ACTION___GET_STEREOTYPE_APPLICATIONS :
				return getStereotypeApplications();
			case UMLPackage.REPLY_ACTION___GET_TARGET_DIRECTED_RELATIONSHIPS :
				return getTargetDirectedRelationships();
			case UMLPackage.REPLY_ACTION___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS :
				return getTargetDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.REPLY_ACTION___GET_VALUE__STEREOTYPE_STRING :
				return getValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.REPLY_ACTION___HAS_KEYWORD__STRING :
				return hasKeyword((String) arguments.get(0));
			case UMLPackage.REPLY_ACTION___HAS_VALUE__STEREOTYPE_STRING :
				return hasValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.REPLY_ACTION___IS_STEREOTYPE_APPLICABLE__STEREOTYPE :
				return isStereotypeApplicable((Stereotype) arguments.get(0));
			case UMLPackage.REPLY_ACTION___IS_STEREOTYPE_APPLIED__STEREOTYPE :
				return isStereotypeApplied((Stereotype) arguments.get(0));
			case UMLPackage.REPLY_ACTION___IS_STEREOTYPE_REQUIRED__STEREOTYPE :
				return isStereotypeRequired((Stereotype) arguments.get(0));
			case UMLPackage.REPLY_ACTION___REMOVE_KEYWORD__STRING :
				return removeKeyword((String) arguments.get(0));
			case UMLPackage.REPLY_ACTION___SET_VALUE__STEREOTYPE_STRING_OBJECT :
				setValue((Stereotype) arguments.get(0),
					(String) arguments.get(1), arguments.get(2));
				return null;
			case UMLPackage.REPLY_ACTION___UNAPPLY_STEREOTYPE__STEREOTYPE :
				return unapplyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.REPLY_ACTION___ALL_OWNED_ELEMENTS :
				return allOwnedElements();
			case UMLPackage.REPLY_ACTION___MUST_BE_OWNED :
				return mustBeOwned();
			case UMLPackage.REPLY_ACTION___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP :
				return validateVisibilityNeedsOwnership(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.REPLY_ACTION___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.REPLY_ACTION___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasNoQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.REPLY_ACTION___CREATE_DEPENDENCY__NAMEDELEMENT :
				return createDependency((NamedElement) arguments.get(0));
			case UMLPackage.REPLY_ACTION___CREATE_USAGE__NAMEDELEMENT :
				return createUsage((NamedElement) arguments.get(0));
			case UMLPackage.REPLY_ACTION___GET_LABEL :
				return getLabel();
			case UMLPackage.REPLY_ACTION___GET_LABEL__BOOLEAN :
				return getLabel((Boolean) arguments.get(0));
			case UMLPackage.REPLY_ACTION___GET_NAMESPACE :
				return getNamespace();
			case UMLPackage.REPLY_ACTION___ALL_NAMESPACES :
				return allNamespaces();
			case UMLPackage.REPLY_ACTION___ALL_OWNING_PACKAGES :
				return allOwningPackages();
			case UMLPackage.REPLY_ACTION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE :
				return isDistinguishableFrom((NamedElement) arguments.get(0),
					(Namespace) arguments.get(1));
			case UMLPackage.REPLY_ACTION___GET_QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.REPLY_ACTION___SEPARATOR :
				return separator();
			case UMLPackage.REPLY_ACTION___GET_CLIENT_DEPENDENCIES :
				return getClientDependencies();
			case UMLPackage.REPLY_ACTION___VALIDATE_REDEFINITION_CONSISTENT__DIAGNOSTICCHAIN_MAP :
				return validateRedefinitionConsistent(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.REPLY_ACTION___VALIDATE_NON_LEAF_REDEFINITION__DIAGNOSTICCHAIN_MAP :
				return validateNonLeafRedefinition(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.REPLY_ACTION___VALIDATE_REDEFINITION_CONTEXT_VALID__DIAGNOSTICCHAIN_MAP :
				return validateRedefinitionContextValid(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.REPLY_ACTION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT :
				return isConsistentWith((RedefinableElement) arguments.get(0));
			case UMLPackage.REPLY_ACTION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT :
				return isRedefinitionContextValid(
					(RedefinableElement) arguments.get(0));
			case UMLPackage.REPLY_ACTION___CONTAINING_ACTIVITY :
				return containingActivity();
			case UMLPackage.REPLY_ACTION___GET_CONTEXT :
				return getContext();
			case UMLPackage.REPLY_ACTION___ALL_ACTIONS :
				return allActions();
			case UMLPackage.REPLY_ACTION___ALL_OWNED_NODES :
				return allOwnedNodes();
			case UMLPackage.REPLY_ACTION___CONTAINING_BEHAVIOR :
				return containingBehavior();
			case UMLPackage.REPLY_ACTION___VALIDATE_PINS_MATCH_PARAMETER__DIAGNOSTICCHAIN_MAP :
				return validatePinsMatchParameter(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.REPLY_ACTION___VALIDATE_EVENT_ON_REPLY_TO_CALL_TRIGGER__DIAGNOSTICCHAIN_MAP :
				return validateEventOnReplyToCallTrigger(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		}
		return eDynamicInvoke(operationID, arguments);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getInputs() <em>Input</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputs()
	 * @generated
	 * @ordered
	 */
	protected static final int[] INPUT_ESUBSETS = new int[]{
		UMLPackage.REPLY_ACTION__REPLY_VALUE,
		UMLPackage.REPLY_ACTION__RETURN_INFORMATION};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetInputs() {
		return super.isSetInputs()
			|| eIsSet(UMLPackage.REPLY_ACTION__REPLY_VALUE)
			|| eIsSet(UMLPackage.REPLY_ACTION__RETURN_INFORMATION);
	}

} //ReplyActionImpl
