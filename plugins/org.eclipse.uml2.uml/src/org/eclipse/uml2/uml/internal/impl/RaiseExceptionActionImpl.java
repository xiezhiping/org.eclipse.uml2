/*
 * Copyright (c) 2005, 2016 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 327039, 351774, 418466, 451350, 485756
 *
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.resource.Resource;

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
import org.eclipse.uml2.uml.RaiseExceptionAction;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.StructuredActivityNode;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Raise Exception Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.RaiseExceptionActionImpl#getInputs <em>Input</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.RaiseExceptionActionImpl#getException <em>Exception</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RaiseExceptionActionImpl
		extends ActionImpl
		implements RaiseExceptionAction {

	/**
	 * The cached value of the '{@link #getException() <em>Exception</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getException()
	 * @generated
	 * @ordered
	 */
	protected InputPin exception;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RaiseExceptionActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.RAISE_EXCEPTION_ACTION;
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
						InputPin.class, this,
						UMLPackage.RAISE_EXCEPTION_ACTION__INPUT,
						INPUT_ESUBSETS));
			}
			return inputs;
		}
		return new DerivedUnionEObjectEList<InputPin>(InputPin.class, this,
			UMLPackage.RAISE_EXCEPTION_ACTION__INPUT, INPUT_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin getException() {
		if (exception != null && exception.eIsProxy()) {
			InternalEObject oldException = (InternalEObject) exception;
			exception = (InputPin) eResolveProxy(oldException);
			if (exception != oldException) {
				InternalEObject newException = (InternalEObject) exception;
				NotificationChain msgs = oldException.eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.RAISE_EXCEPTION_ACTION__EXCEPTION,
					null, null);
				if (newException.eInternalContainer() == null) {
					msgs = newException.eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
							- UMLPackage.RAISE_EXCEPTION_ACTION__EXCEPTION,
						null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.RAISE_EXCEPTION_ACTION__EXCEPTION,
						oldException, exception));
			}
		}
		return exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin basicGetException() {
		return exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetException(InputPin newException,
			NotificationChain msgs) {
		InputPin oldException = exception;
		exception = newException;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET, UMLPackage.RAISE_EXCEPTION_ACTION__EXCEPTION,
				oldException, newException);
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
	public void setException(InputPin newException) {
		if (newException != exception) {
			NotificationChain msgs = null;
			if (exception != null)
				msgs = ((InternalEObject) exception).eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.RAISE_EXCEPTION_ACTION__EXCEPTION,
					null, msgs);
			if (newException != null)
				msgs = ((InternalEObject) newException).eInverseAdd(this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.RAISE_EXCEPTION_ACTION__EXCEPTION,
					null, msgs);
			msgs = basicSetException(newException, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.RAISE_EXCEPTION_ACTION__EXCEPTION, newException,
				newException));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin createException(String name, Type type, EClass eClass) {
		InputPin newException = (InputPin) create(eClass);
		setException(newException);
		if (name != null)
			newException.setName(name);
		if (type != null)
			newException.setType(type);
		return newException;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin createException(String name, Type type) {
		return createException(name, type, UMLPackage.Literals.INPUT_PIN);
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
			case UMLPackage.RAISE_EXCEPTION_ACTION__EANNOTATIONS :
				return ((InternalEList<?>) getEAnnotations())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.RAISE_EXCEPTION_ACTION__OWNED_COMMENT :
				return ((InternalEList<?>) getOwnedComments())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.RAISE_EXCEPTION_ACTION__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.RAISE_EXCEPTION_ACTION__IN_INTERRUPTIBLE_REGION :
				return ((InternalEList<?>) getInInterruptibleRegions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.RAISE_EXCEPTION_ACTION__IN_STRUCTURED_NODE :
				return basicSetInStructuredNode(null, msgs);
			case UMLPackage.RAISE_EXCEPTION_ACTION__INCOMING :
				return ((InternalEList<?>) getIncomings()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.RAISE_EXCEPTION_ACTION__OUTGOING :
				return ((InternalEList<?>) getOutgoings()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.RAISE_EXCEPTION_ACTION__IN_PARTITION :
				return ((InternalEList<?>) getInPartitions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.RAISE_EXCEPTION_ACTION__HANDLER :
				return ((InternalEList<?>) getHandlers()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.RAISE_EXCEPTION_ACTION__LOCAL_POSTCONDITION :
				return ((InternalEList<?>) getLocalPostconditions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.RAISE_EXCEPTION_ACTION__LOCAL_PRECONDITION :
				return ((InternalEList<?>) getLocalPreconditions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.RAISE_EXCEPTION_ACTION__EXCEPTION :
				return basicSetException(null, msgs);
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
			case UMLPackage.RAISE_EXCEPTION_ACTION__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.RAISE_EXCEPTION_ACTION__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.RAISE_EXCEPTION_ACTION__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.RAISE_EXCEPTION_ACTION__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.RAISE_EXCEPTION_ACTION__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.RAISE_EXCEPTION_ACTION__NAME :
				return getName();
			case UMLPackage.RAISE_EXCEPTION_ACTION__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.RAISE_EXCEPTION_ACTION__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.RAISE_EXCEPTION_ACTION__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.RAISE_EXCEPTION_ACTION__VISIBILITY :
				return getVisibility();
			case UMLPackage.RAISE_EXCEPTION_ACTION__IS_LEAF :
				return isLeaf();
			case UMLPackage.RAISE_EXCEPTION_ACTION__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.RAISE_EXCEPTION_ACTION__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.RAISE_EXCEPTION_ACTION__ACTIVITY :
				if (resolve)
					return getActivity();
				return basicGetActivity();
			case UMLPackage.RAISE_EXCEPTION_ACTION__IN_GROUP :
				return getInGroups();
			case UMLPackage.RAISE_EXCEPTION_ACTION__IN_INTERRUPTIBLE_REGION :
				return getInInterruptibleRegions();
			case UMLPackage.RAISE_EXCEPTION_ACTION__IN_STRUCTURED_NODE :
				if (resolve)
					return getInStructuredNode();
				return basicGetInStructuredNode();
			case UMLPackage.RAISE_EXCEPTION_ACTION__INCOMING :
				return getIncomings();
			case UMLPackage.RAISE_EXCEPTION_ACTION__OUTGOING :
				return getOutgoings();
			case UMLPackage.RAISE_EXCEPTION_ACTION__REDEFINED_NODE :
				return getRedefinedNodes();
			case UMLPackage.RAISE_EXCEPTION_ACTION__IN_PARTITION :
				return getInPartitions();
			case UMLPackage.RAISE_EXCEPTION_ACTION__HANDLER :
				return getHandlers();
			case UMLPackage.RAISE_EXCEPTION_ACTION__CONTEXT :
				if (resolve)
					return getContext();
				return basicGetContext();
			case UMLPackage.RAISE_EXCEPTION_ACTION__INPUT :
				return getInputs();
			case UMLPackage.RAISE_EXCEPTION_ACTION__IS_LOCALLY_REENTRANT :
				return isLocallyReentrant();
			case UMLPackage.RAISE_EXCEPTION_ACTION__LOCAL_POSTCONDITION :
				return getLocalPostconditions();
			case UMLPackage.RAISE_EXCEPTION_ACTION__LOCAL_PRECONDITION :
				return getLocalPreconditions();
			case UMLPackage.RAISE_EXCEPTION_ACTION__OUTPUT :
				return getOutputs();
			case UMLPackage.RAISE_EXCEPTION_ACTION__EXCEPTION :
				if (resolve)
					return getException();
				return basicGetException();
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
			case UMLPackage.RAISE_EXCEPTION_ACTION__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations()
					.addAll((Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.RAISE_EXCEPTION_ACTION__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments()
					.addAll((Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.RAISE_EXCEPTION_ACTION__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.RAISE_EXCEPTION_ACTION__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.RAISE_EXCEPTION_ACTION__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.RAISE_EXCEPTION_ACTION__IS_LEAF :
				setIsLeaf((Boolean) newValue);
				return;
			case UMLPackage.RAISE_EXCEPTION_ACTION__ACTIVITY :
				setActivity((Activity) newValue);
				return;
			case UMLPackage.RAISE_EXCEPTION_ACTION__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				getInInterruptibleRegions().addAll(
					(Collection<? extends InterruptibleActivityRegion>) newValue);
				return;
			case UMLPackage.RAISE_EXCEPTION_ACTION__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) newValue);
				return;
			case UMLPackage.RAISE_EXCEPTION_ACTION__INCOMING :
				getIncomings().clear();
				getIncomings()
					.addAll((Collection<? extends ActivityEdge>) newValue);
				return;
			case UMLPackage.RAISE_EXCEPTION_ACTION__OUTGOING :
				getOutgoings().clear();
				getOutgoings()
					.addAll((Collection<? extends ActivityEdge>) newValue);
				return;
			case UMLPackage.RAISE_EXCEPTION_ACTION__REDEFINED_NODE :
				getRedefinedNodes().clear();
				getRedefinedNodes()
					.addAll((Collection<? extends ActivityNode>) newValue);
				return;
			case UMLPackage.RAISE_EXCEPTION_ACTION__IN_PARTITION :
				getInPartitions().clear();
				getInPartitions()
					.addAll((Collection<? extends ActivityPartition>) newValue);
				return;
			case UMLPackage.RAISE_EXCEPTION_ACTION__HANDLER :
				getHandlers().clear();
				getHandlers()
					.addAll((Collection<? extends ExceptionHandler>) newValue);
				return;
			case UMLPackage.RAISE_EXCEPTION_ACTION__IS_LOCALLY_REENTRANT :
				setIsLocallyReentrant((Boolean) newValue);
				return;
			case UMLPackage.RAISE_EXCEPTION_ACTION__LOCAL_POSTCONDITION :
				getLocalPostconditions().clear();
				getLocalPostconditions()
					.addAll((Collection<? extends Constraint>) newValue);
				return;
			case UMLPackage.RAISE_EXCEPTION_ACTION__LOCAL_PRECONDITION :
				getLocalPreconditions().clear();
				getLocalPreconditions()
					.addAll((Collection<? extends Constraint>) newValue);
				return;
			case UMLPackage.RAISE_EXCEPTION_ACTION__EXCEPTION :
				setException((InputPin) newValue);
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
			case UMLPackage.RAISE_EXCEPTION_ACTION__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.RAISE_EXCEPTION_ACTION__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.RAISE_EXCEPTION_ACTION__NAME :
				unsetName();
				return;
			case UMLPackage.RAISE_EXCEPTION_ACTION__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.RAISE_EXCEPTION_ACTION__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.RAISE_EXCEPTION_ACTION__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.RAISE_EXCEPTION_ACTION__ACTIVITY :
				setActivity((Activity) null);
				return;
			case UMLPackage.RAISE_EXCEPTION_ACTION__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				return;
			case UMLPackage.RAISE_EXCEPTION_ACTION__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) null);
				return;
			case UMLPackage.RAISE_EXCEPTION_ACTION__INCOMING :
				getIncomings().clear();
				return;
			case UMLPackage.RAISE_EXCEPTION_ACTION__OUTGOING :
				getOutgoings().clear();
				return;
			case UMLPackage.RAISE_EXCEPTION_ACTION__REDEFINED_NODE :
				getRedefinedNodes().clear();
				return;
			case UMLPackage.RAISE_EXCEPTION_ACTION__IN_PARTITION :
				getInPartitions().clear();
				return;
			case UMLPackage.RAISE_EXCEPTION_ACTION__HANDLER :
				getHandlers().clear();
				return;
			case UMLPackage.RAISE_EXCEPTION_ACTION__IS_LOCALLY_REENTRANT :
				setIsLocallyReentrant(IS_LOCALLY_REENTRANT_EDEFAULT);
				return;
			case UMLPackage.RAISE_EXCEPTION_ACTION__LOCAL_POSTCONDITION :
				getLocalPostconditions().clear();
				return;
			case UMLPackage.RAISE_EXCEPTION_ACTION__LOCAL_PRECONDITION :
				getLocalPreconditions().clear();
				return;
			case UMLPackage.RAISE_EXCEPTION_ACTION__EXCEPTION :
				setException((InputPin) null);
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
			case UMLPackage.RAISE_EXCEPTION_ACTION__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.RAISE_EXCEPTION_ACTION__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.RAISE_EXCEPTION_ACTION__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.RAISE_EXCEPTION_ACTION__OWNER :
				return isSetOwner();
			case UMLPackage.RAISE_EXCEPTION_ACTION__CLIENT_DEPENDENCY :
				return !getClientDependencies().isEmpty();
			case UMLPackage.RAISE_EXCEPTION_ACTION__NAME :
				return isSetName();
			case UMLPackage.RAISE_EXCEPTION_ACTION__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.RAISE_EXCEPTION_ACTION__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.RAISE_EXCEPTION_ACTION__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.RAISE_EXCEPTION_ACTION__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.RAISE_EXCEPTION_ACTION__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.RAISE_EXCEPTION_ACTION__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.RAISE_EXCEPTION_ACTION__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.RAISE_EXCEPTION_ACTION__ACTIVITY :
				return basicGetActivity() != null;
			case UMLPackage.RAISE_EXCEPTION_ACTION__IN_GROUP :
				return isSetInGroups();
			case UMLPackage.RAISE_EXCEPTION_ACTION__IN_INTERRUPTIBLE_REGION :
				return inInterruptibleRegions != null
					&& !inInterruptibleRegions.isEmpty();
			case UMLPackage.RAISE_EXCEPTION_ACTION__IN_STRUCTURED_NODE :
				return basicGetInStructuredNode() != null;
			case UMLPackage.RAISE_EXCEPTION_ACTION__INCOMING :
				return incomings != null && !incomings.isEmpty();
			case UMLPackage.RAISE_EXCEPTION_ACTION__OUTGOING :
				return outgoings != null && !outgoings.isEmpty();
			case UMLPackage.RAISE_EXCEPTION_ACTION__REDEFINED_NODE :
				return redefinedNodes != null && !redefinedNodes.isEmpty();
			case UMLPackage.RAISE_EXCEPTION_ACTION__IN_PARTITION :
				return inPartitions != null && !inPartitions.isEmpty();
			case UMLPackage.RAISE_EXCEPTION_ACTION__HANDLER :
				return handlers != null && !handlers.isEmpty();
			case UMLPackage.RAISE_EXCEPTION_ACTION__CONTEXT :
				return basicGetContext() != null;
			case UMLPackage.RAISE_EXCEPTION_ACTION__INPUT :
				return isSetInputs();
			case UMLPackage.RAISE_EXCEPTION_ACTION__IS_LOCALLY_REENTRANT :
				return ((eFlags
					& IS_LOCALLY_REENTRANT_EFLAG) != 0) != IS_LOCALLY_REENTRANT_EDEFAULT;
			case UMLPackage.RAISE_EXCEPTION_ACTION__LOCAL_POSTCONDITION :
				return localPostconditions != null
					&& !localPostconditions.isEmpty();
			case UMLPackage.RAISE_EXCEPTION_ACTION__LOCAL_PRECONDITION :
				return localPreconditions != null
					&& !localPreconditions.isEmpty();
			case UMLPackage.RAISE_EXCEPTION_ACTION__OUTPUT :
				return isSetOutputs();
			case UMLPackage.RAISE_EXCEPTION_ACTION__EXCEPTION :
				return exception != null;
		}
		return eDynamicIsSet(featureID);
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
		UMLPackage.RAISE_EXCEPTION_ACTION__EXCEPTION};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetInputs() {
		return super.isSetInputs()
			|| eIsSet(UMLPackage.RAISE_EXCEPTION_ACTION__EXCEPTION);
	}

} //RaiseExceptionActionImpl
