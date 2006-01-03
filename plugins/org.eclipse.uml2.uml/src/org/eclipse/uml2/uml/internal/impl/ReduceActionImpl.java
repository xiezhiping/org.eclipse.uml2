/*
 * Copyright (c) 2005, 2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: ReduceActionImpl.java,v 1.5 2006/01/03 19:50:25 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.InputPin;
import org.eclipse.uml2.uml.OutputPin;
import org.eclipse.uml2.uml.ReduceAction;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.StructuredActivityNode;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.ReduceActionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reduce Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ReduceActionImpl#getOutputs <em>Output</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ReduceActionImpl#getInputs <em>Input</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ReduceActionImpl#getReducer <em>Reducer</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ReduceActionImpl#getResult <em>Result</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ReduceActionImpl#getCollection <em>Collection</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ReduceActionImpl#isOrdered <em>Is Ordered</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReduceActionImpl
		extends ActionImpl
		implements ReduceAction {

	/**
	 * The default value of the '{@link #isOrdered() <em>Is Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOrdered()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ORDERED_EDEFAULT = false;

	/**
	 * The flag representing the value of the '{@link #isOrdered() <em>Is Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOrdered()
	 * @generated
	 * @ordered
	 */
	protected static final int IS_ORDERED_EFLAG = 1 << 9;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReduceActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.Literals.REDUCE_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOutputs() {
		EList output = (EList) eVirtualGet(UMLPackage.REDUCE_ACTION__OUTPUT);
		if (output == null) {
			eVirtualSet(UMLPackage.REDUCE_ACTION__OUTPUT,
				output = new DerivedUnionEObjectEList(OutputPin.class, this,
					UMLPackage.REDUCE_ACTION__OUTPUT,
					new int[]{UMLPackage.REDUCE_ACTION__RESULT}));
		}
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getInputs() {
		EList input = (EList) eVirtualGet(UMLPackage.REDUCE_ACTION__INPUT);
		if (input == null) {
			eVirtualSet(UMLPackage.REDUCE_ACTION__INPUT,
				input = new DerivedUnionEObjectEList(InputPin.class, this,
					UMLPackage.REDUCE_ACTION__INPUT,
					new int[]{UMLPackage.REDUCE_ACTION__COLLECTION}));
		}
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior getReducer() {
		Behavior reducer = (Behavior) eVirtualGet(UMLPackage.REDUCE_ACTION__REDUCER);
		if (reducer != null && reducer.eIsProxy()) {
			InternalEObject oldReducer = (InternalEObject) reducer;
			reducer = (Behavior) eResolveProxy(oldReducer);
			if (reducer != oldReducer) {
				eVirtualSet(UMLPackage.REDUCE_ACTION__REDUCER, reducer);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.REDUCE_ACTION__REDUCER, oldReducer, reducer));
			}
		}
		return reducer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior basicGetReducer() {
		return (Behavior) eVirtualGet(UMLPackage.REDUCE_ACTION__REDUCER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReducer(Behavior newReducer) {
		Behavior reducer = newReducer;
		Object oldReducer = eVirtualSet(UMLPackage.REDUCE_ACTION__REDUCER,
			reducer);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.REDUCE_ACTION__REDUCER,
				oldReducer == EVIRTUAL_NO_VALUE
					? null
					: oldReducer, reducer));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPin getResult() {
		OutputPin result = (OutputPin) eVirtualGet(UMLPackage.REDUCE_ACTION__RESULT);
		if (result != null && result.eIsProxy()) {
			InternalEObject oldResult = (InternalEObject) result;
			result = (OutputPin) eResolveProxy(oldResult);
			if (result != oldResult) {
				InternalEObject newResult = (InternalEObject) result;
				NotificationChain msgs = oldResult.eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE - UMLPackage.REDUCE_ACTION__RESULT,
					null, null);
				if (newResult.eInternalContainer() != null) {
					msgs = newResult.eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- UMLPackage.REDUCE_ACTION__RESULT, null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.REDUCE_ACTION__RESULT, oldResult, result));
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPin basicGetResult() {
		return (OutputPin) eVirtualGet(UMLPackage.REDUCE_ACTION__RESULT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResult(OutputPin newResult,
			NotificationChain msgs) {
		Object oldResult = eVirtualSet(UMLPackage.REDUCE_ACTION__RESULT,
			newResult);
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET, UMLPackage.REDUCE_ACTION__RESULT,
				oldResult == EVIRTUAL_NO_VALUE
					? null
					: oldResult, newResult);
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
	public void setResult(OutputPin newResult) {
		OutputPin result = (OutputPin) eVirtualGet(UMLPackage.REDUCE_ACTION__RESULT);
		if (newResult != result) {
			NotificationChain msgs = null;
			if (result != null)
				msgs = ((InternalEObject) result).eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE - UMLPackage.REDUCE_ACTION__RESULT,
					null, msgs);
			if (newResult != null)
				msgs = ((InternalEObject) newResult).eInverseAdd(this,
					EOPPOSITE_FEATURE_BASE - UMLPackage.REDUCE_ACTION__RESULT,
					null, msgs);
			msgs = basicSetResult(newResult, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.REDUCE_ACTION__RESULT, newResult, newResult));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPin createResult() {
		OutputPin newResult = UMLFactory.eINSTANCE.createOutputPin();
		setResult(newResult);
		return newResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin getCollection() {
		InputPin collection = (InputPin) eVirtualGet(UMLPackage.REDUCE_ACTION__COLLECTION);
		if (collection != null && collection.eIsProxy()) {
			InternalEObject oldCollection = (InternalEObject) collection;
			collection = (InputPin) eResolveProxy(oldCollection);
			if (collection != oldCollection) {
				InternalEObject newCollection = (InternalEObject) collection;
				NotificationChain msgs = oldCollection.eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.REDUCE_ACTION__COLLECTION, null, null);
				if (newCollection.eInternalContainer() != null) {
					msgs = newCollection.eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
							- UMLPackage.REDUCE_ACTION__COLLECTION, null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.REDUCE_ACTION__COLLECTION, oldCollection,
						collection));
			}
		}
		return collection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin basicGetCollection() {
		return (InputPin) eVirtualGet(UMLPackage.REDUCE_ACTION__COLLECTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCollection(InputPin newCollection,
			NotificationChain msgs) {
		Object oldCollection = eVirtualSet(
			UMLPackage.REDUCE_ACTION__COLLECTION, newCollection);
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET, UMLPackage.REDUCE_ACTION__COLLECTION,
				oldCollection == EVIRTUAL_NO_VALUE
					? null
					: oldCollection, newCollection);
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
	public void setCollection(InputPin newCollection) {
		InputPin collection = (InputPin) eVirtualGet(UMLPackage.REDUCE_ACTION__COLLECTION);
		if (newCollection != collection) {
			NotificationChain msgs = null;
			if (collection != null)
				msgs = ((InternalEObject) collection).eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.REDUCE_ACTION__COLLECTION, null, msgs);
			if (newCollection != null)
				msgs = ((InternalEObject) newCollection).eInverseAdd(this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.REDUCE_ACTION__COLLECTION, null, msgs);
			msgs = basicSetCollection(newCollection, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.REDUCE_ACTION__COLLECTION, newCollection,
				newCollection));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin createCollection(EClass eClass) {
		InputPin newCollection = (InputPin) eClass.getEPackage()
			.getEFactoryInstance().create(eClass);
		setCollection(newCollection);
		return newCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin createCollection() {
		InputPin newCollection = UMLFactory.eINSTANCE.createInputPin();
		setCollection(newCollection);
		return newCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOrdered() {
		return (eFlags & IS_ORDERED_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsOrdered(boolean newIsOrdered) {
		boolean oldIsOrdered = (eFlags & IS_ORDERED_EFLAG) != 0;
		if (newIsOrdered)
			eFlags |= IS_ORDERED_EFLAG;
		else
			eFlags &= ~IS_ORDERED_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.REDUCE_ACTION__IS_ORDERED, oldIsOrdered,
				newIsOrdered));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInputTypeIsCollection(DiagnosticChain diagnostics,
			Map context) {
		return ReduceActionOperations.validateInputTypeIsCollection(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutputTypesAreCompatible(
			DiagnosticChain diagnostics, Map context) {
		return ReduceActionOperations.validateOutputTypesAreCompatible(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReducerInputsOutput(DiagnosticChain diagnostics,
			Map context) {
		return ReduceActionOperations.validateReducerInputsOutput(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.REDUCE_ACTION__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.REDUCE_ACTION__OWNED_COMMENT :
				return ((InternalEList) getOwnedComments()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.REDUCE_ACTION__CLIENT_DEPENDENCY :
				return ((InternalEList) getClientDependencies()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.REDUCE_ACTION__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.REDUCE_ACTION__IN_STRUCTURED_NODE :
				return eBasicSetContainer(null,
					UMLPackage.REDUCE_ACTION__IN_STRUCTURED_NODE, msgs);
			case UMLPackage.REDUCE_ACTION__ACTIVITY :
				return eBasicSetContainer(null,
					UMLPackage.REDUCE_ACTION__ACTIVITY, msgs);
			case UMLPackage.REDUCE_ACTION__OUTGOING :
				return ((InternalEList) getOutgoings()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.REDUCE_ACTION__INCOMING :
				return ((InternalEList) getIncomings()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.REDUCE_ACTION__IN_PARTITION :
				return ((InternalEList) getInPartitions()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.REDUCE_ACTION__IN_INTERRUPTIBLE_REGION :
				return ((InternalEList) getInInterruptibleRegions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.REDUCE_ACTION__HANDLER :
				return ((InternalEList) getHandlers()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.REDUCE_ACTION__LOCAL_PRECONDITION :
				return ((InternalEList) getLocalPreconditions()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.REDUCE_ACTION__LOCAL_POSTCONDITION :
				return ((InternalEList) getLocalPostconditions()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.REDUCE_ACTION__RESULT :
				return basicSetResult(null, msgs);
			case UMLPackage.REDUCE_ACTION__COLLECTION :
				return basicSetCollection(null, msgs);
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
			case UMLPackage.REDUCE_ACTION__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.REDUCE_ACTION__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.REDUCE_ACTION__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.REDUCE_ACTION__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.REDUCE_ACTION__NAME :
				return getName();
			case UMLPackage.REDUCE_ACTION__VISIBILITY :
				return getVisibility();
			case UMLPackage.REDUCE_ACTION__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.REDUCE_ACTION__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.REDUCE_ACTION__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.REDUCE_ACTION__NAME_EXPRESSION :
				return getNameExpression();
			case UMLPackage.REDUCE_ACTION__IS_LEAF :
				return isLeaf()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.REDUCE_ACTION__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.REDUCE_ACTION__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.REDUCE_ACTION__IN_STRUCTURED_NODE :
				return getInStructuredNode();
			case UMLPackage.REDUCE_ACTION__ACTIVITY :
				return getActivity();
			case UMLPackage.REDUCE_ACTION__OUTGOING :
				return getOutgoings();
			case UMLPackage.REDUCE_ACTION__INCOMING :
				return getIncomings();
			case UMLPackage.REDUCE_ACTION__IN_PARTITION :
				return getInPartitions();
			case UMLPackage.REDUCE_ACTION__IN_INTERRUPTIBLE_REGION :
				return getInInterruptibleRegions();
			case UMLPackage.REDUCE_ACTION__IN_GROUP :
				return getInGroups();
			case UMLPackage.REDUCE_ACTION__REDEFINED_NODE :
				return getRedefinedNodes();
			case UMLPackage.REDUCE_ACTION__HANDLER :
				return getHandlers();
			case UMLPackage.REDUCE_ACTION__OUTPUT :
				return getOutputs();
			case UMLPackage.REDUCE_ACTION__INPUT :
				return getInputs();
			case UMLPackage.REDUCE_ACTION__CONTEXT :
				return getContext();
			case UMLPackage.REDUCE_ACTION__LOCAL_PRECONDITION :
				return getLocalPreconditions();
			case UMLPackage.REDUCE_ACTION__LOCAL_POSTCONDITION :
				return getLocalPostconditions();
			case UMLPackage.REDUCE_ACTION__REDUCER :
				if (resolve)
					return getReducer();
				return basicGetReducer();
			case UMLPackage.REDUCE_ACTION__RESULT :
				if (resolve)
					return getResult();
				return basicGetResult();
			case UMLPackage.REDUCE_ACTION__COLLECTION :
				if (resolve)
					return getCollection();
				return basicGetCollection();
			case UMLPackage.REDUCE_ACTION__IS_ORDERED :
				return isOrdered()
					? Boolean.TRUE
					: Boolean.FALSE;
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
			case UMLPackage.REDUCE_ACTION__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.REDUCE_ACTION__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.REDUCE_ACTION__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.REDUCE_ACTION__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.REDUCE_ACTION__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.REDUCE_ACTION__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.REDUCE_ACTION__IS_LEAF :
				setIsLeaf(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.REDUCE_ACTION__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) newValue);
				return;
			case UMLPackage.REDUCE_ACTION__ACTIVITY :
				setActivity((Activity) newValue);
				return;
			case UMLPackage.REDUCE_ACTION__OUTGOING :
				getOutgoings().clear();
				getOutgoings().addAll((Collection) newValue);
				return;
			case UMLPackage.REDUCE_ACTION__INCOMING :
				getIncomings().clear();
				getIncomings().addAll((Collection) newValue);
				return;
			case UMLPackage.REDUCE_ACTION__IN_PARTITION :
				getInPartitions().clear();
				getInPartitions().addAll((Collection) newValue);
				return;
			case UMLPackage.REDUCE_ACTION__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				getInInterruptibleRegions().addAll((Collection) newValue);
				return;
			case UMLPackage.REDUCE_ACTION__REDEFINED_NODE :
				getRedefinedNodes().clear();
				getRedefinedNodes().addAll((Collection) newValue);
				return;
			case UMLPackage.REDUCE_ACTION__HANDLER :
				getHandlers().clear();
				getHandlers().addAll((Collection) newValue);
				return;
			case UMLPackage.REDUCE_ACTION__LOCAL_PRECONDITION :
				getLocalPreconditions().clear();
				getLocalPreconditions().addAll((Collection) newValue);
				return;
			case UMLPackage.REDUCE_ACTION__LOCAL_POSTCONDITION :
				getLocalPostconditions().clear();
				getLocalPostconditions().addAll((Collection) newValue);
				return;
			case UMLPackage.REDUCE_ACTION__REDUCER :
				setReducer((Behavior) newValue);
				return;
			case UMLPackage.REDUCE_ACTION__RESULT :
				setResult((OutputPin) newValue);
				return;
			case UMLPackage.REDUCE_ACTION__COLLECTION :
				setCollection((InputPin) newValue);
				return;
			case UMLPackage.REDUCE_ACTION__IS_ORDERED :
				setIsOrdered(((Boolean) newValue).booleanValue());
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
			case UMLPackage.REDUCE_ACTION__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.REDUCE_ACTION__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.REDUCE_ACTION__NAME :
				unsetName();
				return;
			case UMLPackage.REDUCE_ACTION__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.REDUCE_ACTION__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.REDUCE_ACTION__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.REDUCE_ACTION__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.REDUCE_ACTION__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) null);
				return;
			case UMLPackage.REDUCE_ACTION__ACTIVITY :
				setActivity((Activity) null);
				return;
			case UMLPackage.REDUCE_ACTION__OUTGOING :
				getOutgoings().clear();
				return;
			case UMLPackage.REDUCE_ACTION__INCOMING :
				getIncomings().clear();
				return;
			case UMLPackage.REDUCE_ACTION__IN_PARTITION :
				getInPartitions().clear();
				return;
			case UMLPackage.REDUCE_ACTION__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				return;
			case UMLPackage.REDUCE_ACTION__REDEFINED_NODE :
				getRedefinedNodes().clear();
				return;
			case UMLPackage.REDUCE_ACTION__HANDLER :
				getHandlers().clear();
				return;
			case UMLPackage.REDUCE_ACTION__LOCAL_PRECONDITION :
				getLocalPreconditions().clear();
				return;
			case UMLPackage.REDUCE_ACTION__LOCAL_POSTCONDITION :
				getLocalPostconditions().clear();
				return;
			case UMLPackage.REDUCE_ACTION__REDUCER :
				setReducer((Behavior) null);
				return;
			case UMLPackage.REDUCE_ACTION__RESULT :
				setResult((OutputPin) null);
				return;
			case UMLPackage.REDUCE_ACTION__COLLECTION :
				setCollection((InputPin) null);
				return;
			case UMLPackage.REDUCE_ACTION__IS_ORDERED :
				setIsOrdered(IS_ORDERED_EDEFAULT);
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
			case UMLPackage.REDUCE_ACTION__EANNOTATIONS :
				EList eAnnotations = (EList) eVirtualGet(UMLPackage.REDUCE_ACTION__EANNOTATIONS);
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.REDUCE_ACTION__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.REDUCE_ACTION__OWNER :
				return isSetOwner();
			case UMLPackage.REDUCE_ACTION__OWNED_COMMENT :
				EList ownedComment = (EList) eVirtualGet(UMLPackage.REDUCE_ACTION__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.REDUCE_ACTION__NAME :
				return isSetName();
			case UMLPackage.REDUCE_ACTION__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.REDUCE_ACTION__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.REDUCE_ACTION__CLIENT_DEPENDENCY :
				EList clientDependency = (EList) eVirtualGet(UMLPackage.REDUCE_ACTION__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.REDUCE_ACTION__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.REDUCE_ACTION__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.REDUCE_ACTION__NAME_EXPRESSION) != null;
			case UMLPackage.REDUCE_ACTION__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.REDUCE_ACTION__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.REDUCE_ACTION__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.REDUCE_ACTION__IN_STRUCTURED_NODE :
				return getInStructuredNode() != null;
			case UMLPackage.REDUCE_ACTION__ACTIVITY :
				return getActivity() != null;
			case UMLPackage.REDUCE_ACTION__OUTGOING :
				EList outgoing = (EList) eVirtualGet(UMLPackage.REDUCE_ACTION__OUTGOING);
				return outgoing != null && !outgoing.isEmpty();
			case UMLPackage.REDUCE_ACTION__INCOMING :
				EList incoming = (EList) eVirtualGet(UMLPackage.REDUCE_ACTION__INCOMING);
				return incoming != null && !incoming.isEmpty();
			case UMLPackage.REDUCE_ACTION__IN_PARTITION :
				EList inPartition = (EList) eVirtualGet(UMLPackage.REDUCE_ACTION__IN_PARTITION);
				return inPartition != null && !inPartition.isEmpty();
			case UMLPackage.REDUCE_ACTION__IN_INTERRUPTIBLE_REGION :
				EList inInterruptibleRegion = (EList) eVirtualGet(UMLPackage.REDUCE_ACTION__IN_INTERRUPTIBLE_REGION);
				return inInterruptibleRegion != null
					&& !inInterruptibleRegion.isEmpty();
			case UMLPackage.REDUCE_ACTION__IN_GROUP :
				return isSetInGroups();
			case UMLPackage.REDUCE_ACTION__REDEFINED_NODE :
				EList redefinedNode = (EList) eVirtualGet(UMLPackage.REDUCE_ACTION__REDEFINED_NODE);
				return redefinedNode != null && !redefinedNode.isEmpty();
			case UMLPackage.REDUCE_ACTION__HANDLER :
				EList handler = (EList) eVirtualGet(UMLPackage.REDUCE_ACTION__HANDLER);
				return handler != null && !handler.isEmpty();
			case UMLPackage.REDUCE_ACTION__OUTPUT :
				return isSetOutputs();
			case UMLPackage.REDUCE_ACTION__INPUT :
				return isSetInputs();
			case UMLPackage.REDUCE_ACTION__CONTEXT :
				return getContext() != null;
			case UMLPackage.REDUCE_ACTION__LOCAL_PRECONDITION :
				EList localPrecondition = (EList) eVirtualGet(UMLPackage.REDUCE_ACTION__LOCAL_PRECONDITION);
				return localPrecondition != null
					&& !localPrecondition.isEmpty();
			case UMLPackage.REDUCE_ACTION__LOCAL_POSTCONDITION :
				EList localPostcondition = (EList) eVirtualGet(UMLPackage.REDUCE_ACTION__LOCAL_POSTCONDITION);
				return localPostcondition != null
					&& !localPostcondition.isEmpty();
			case UMLPackage.REDUCE_ACTION__REDUCER :
				return eVirtualGet(UMLPackage.REDUCE_ACTION__REDUCER) != null;
			case UMLPackage.REDUCE_ACTION__RESULT :
				return eVirtualGet(UMLPackage.REDUCE_ACTION__RESULT) != null;
			case UMLPackage.REDUCE_ACTION__COLLECTION :
				return eVirtualGet(UMLPackage.REDUCE_ACTION__COLLECTION) != null;
			case UMLPackage.REDUCE_ACTION__IS_ORDERED :
				return ((eFlags & IS_ORDERED_EFLAG) != 0) != IS_ORDERED_EDEFAULT;
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isOrdered: "); //$NON-NLS-1$
		result.append((eFlags & IS_ORDERED_EFLAG) != 0);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOutputs() {
		return super.isSetOutputs() || eIsSet(UMLPackage.REDUCE_ACTION__RESULT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInputs() {
		return super.isSetInputs()
			|| eIsSet(UMLPackage.REDUCE_ACTION__COLLECTION);
	}

} //ReduceActionImpl
