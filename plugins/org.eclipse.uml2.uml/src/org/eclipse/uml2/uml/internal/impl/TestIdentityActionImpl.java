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
 * $Id: TestIdentityActionImpl.java,v 1.22 2006/11/14 18:02:18 khussey Exp $
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

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.InputPin;
import org.eclipse.uml2.uml.OutputPin;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.StructuredActivityNode;
import org.eclipse.uml2.uml.TestIdentityAction;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.TestIdentityActionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Identity Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.TestIdentityActionImpl#getInputs <em>Input</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.TestIdentityActionImpl#getOutputs <em>Output</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.TestIdentityActionImpl#getFirst <em>First</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.TestIdentityActionImpl#getSecond <em>Second</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.TestIdentityActionImpl#getResult <em>Result</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TestIdentityActionImpl
		extends ActionImpl
		implements TestIdentityAction {

	/**
	 * The cached value of the '{@link #getFirst() <em>First</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirst()
	 * @generated
	 * @ordered
	 */
	protected InputPin first = null;

	/**
	 * The cached value of the '{@link #getSecond() <em>Second</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecond()
	 * @generated
	 * @ordered
	 */
	protected InputPin second = null;

	/**
	 * The cached value of the '{@link #getResult() <em>Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResult()
	 * @generated
	 * @ordered
	 */
	protected OutputPin result = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestIdentityActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.Literals.TEST_IDENTITY_ACTION;
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
			EList inputs = (EList) cache.get(eResource, this,
				UMLPackage.Literals.ACTION__INPUT);
			if (inputs == null) {
				cache
					.put(eResource, this, UMLPackage.Literals.ACTION__INPUT,
						inputs = new DerivedUnionEObjectEList(InputPin.class,
							this, UMLPackage.TEST_IDENTITY_ACTION__INPUT,
							INPUT_ESUBSETS));
			}
			return inputs;
		}
		return new DerivedUnionEObjectEList(InputPin.class, this,
			UMLPackage.TEST_IDENTITY_ACTION__INPUT, INPUT_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOutputs() {

		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			EList outputs = (EList) cache.get(eResource, this,
				UMLPackage.Literals.ACTION__OUTPUT);
			if (outputs == null) {
				cache.put(eResource, this, UMLPackage.Literals.ACTION__OUTPUT,
					outputs = new DerivedUnionEObjectEList(OutputPin.class,
						this, UMLPackage.TEST_IDENTITY_ACTION__OUTPUT,
						OUTPUT_ESUBSETS));
			}
			return outputs;
		}
		return new DerivedUnionEObjectEList(OutputPin.class, this,
			UMLPackage.TEST_IDENTITY_ACTION__OUTPUT, OUTPUT_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin getFirst() {
		if (first != null && first.eIsProxy()) {
			InternalEObject oldFirst = (InternalEObject) first;
			first = (InputPin) eResolveProxy(oldFirst);
			if (first != oldFirst) {
				InternalEObject newFirst = (InternalEObject) first;
				NotificationChain msgs = oldFirst.eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.TEST_IDENTITY_ACTION__FIRST, null, null);
				if (newFirst.eInternalContainer() == null) {
					msgs = newFirst.eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- UMLPackage.TEST_IDENTITY_ACTION__FIRST, null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.TEST_IDENTITY_ACTION__FIRST, oldFirst, first));
			}
		}
		return first;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin basicGetFirst() {
		return first;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFirst(InputPin newFirst,
			NotificationChain msgs) {
		InputPin oldFirst = first;
		first = newFirst;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET, UMLPackage.TEST_IDENTITY_ACTION__FIRST,
				oldFirst, newFirst);
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
	public void setFirst(InputPin newFirst) {

		if (newFirst != first) {
			NotificationChain msgs = null;
			if (first != null)
				msgs = ((InternalEObject) first).eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.TEST_IDENTITY_ACTION__FIRST, null, msgs);
			if (newFirst != null)
				msgs = ((InternalEObject) newFirst).eInverseAdd(this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.TEST_IDENTITY_ACTION__FIRST, null, msgs);
			msgs = basicSetFirst(newFirst, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.TEST_IDENTITY_ACTION__FIRST, newFirst, newFirst));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin createFirst(String name, Type type, EClass eClass) {
		InputPin newFirst = (InputPin) create(eClass);
		setFirst(newFirst);
		if (name != null)
			newFirst.setName(name);
		if (type != null)
			newFirst.setType(type);
		return newFirst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin createFirst(String name, Type type) {
		return createFirst(name, type, UMLPackage.Literals.INPUT_PIN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin getSecond() {
		if (second != null && second.eIsProxy()) {
			InternalEObject oldSecond = (InternalEObject) second;
			second = (InputPin) eResolveProxy(oldSecond);
			if (second != oldSecond) {
				InternalEObject newSecond = (InternalEObject) second;
				NotificationChain msgs = oldSecond.eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.TEST_IDENTITY_ACTION__SECOND, null, null);
				if (newSecond.eInternalContainer() == null) {
					msgs = newSecond.eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- UMLPackage.TEST_IDENTITY_ACTION__SECOND, null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.TEST_IDENTITY_ACTION__SECOND, oldSecond,
						second));
			}
		}
		return second;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin basicGetSecond() {
		return second;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecond(InputPin newSecond,
			NotificationChain msgs) {
		InputPin oldSecond = second;
		second = newSecond;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET, UMLPackage.TEST_IDENTITY_ACTION__SECOND,
				oldSecond, newSecond);
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
	public void setSecond(InputPin newSecond) {

		if (newSecond != second) {
			NotificationChain msgs = null;
			if (second != null)
				msgs = ((InternalEObject) second).eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.TEST_IDENTITY_ACTION__SECOND, null, msgs);
			if (newSecond != null)
				msgs = ((InternalEObject) newSecond).eInverseAdd(this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.TEST_IDENTITY_ACTION__SECOND, null, msgs);
			msgs = basicSetSecond(newSecond, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.TEST_IDENTITY_ACTION__SECOND, newSecond, newSecond));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin createSecond(String name, Type type, EClass eClass) {
		InputPin newSecond = (InputPin) create(eClass);
		setSecond(newSecond);
		if (name != null)
			newSecond.setName(name);
		if (type != null)
			newSecond.setType(type);
		return newSecond;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin createSecond(String name, Type type) {
		return createSecond(name, type, UMLPackage.Literals.INPUT_PIN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPin getResult() {
		if (result != null && result.eIsProxy()) {
			InternalEObject oldResult = (InternalEObject) result;
			result = (OutputPin) eResolveProxy(oldResult);
			if (result != oldResult) {
				InternalEObject newResult = (InternalEObject) result;
				NotificationChain msgs = oldResult.eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.TEST_IDENTITY_ACTION__RESULT, null, null);
				if (newResult.eInternalContainer() == null) {
					msgs = newResult.eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- UMLPackage.TEST_IDENTITY_ACTION__RESULT, null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.TEST_IDENTITY_ACTION__RESULT, oldResult,
						result));
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
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResult(OutputPin newResult,
			NotificationChain msgs) {
		OutputPin oldResult = result;
		result = newResult;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET, UMLPackage.TEST_IDENTITY_ACTION__RESULT,
				oldResult, newResult);
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

		if (newResult != result) {
			NotificationChain msgs = null;
			if (result != null)
				msgs = ((InternalEObject) result).eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.TEST_IDENTITY_ACTION__RESULT, null, msgs);
			if (newResult != null)
				msgs = ((InternalEObject) newResult).eInverseAdd(this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.TEST_IDENTITY_ACTION__RESULT, null, msgs);
			msgs = basicSetResult(newResult, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.TEST_IDENTITY_ACTION__RESULT, newResult, newResult));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPin createResult(String name, Type type) {
		OutputPin newResult = (OutputPin) create(UMLPackage.Literals.OUTPUT_PIN);
		setResult(newResult);
		if (name != null)
			newResult.setName(name);
		if (type != null)
			newResult.setType(type);
		return newResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNoType(DiagnosticChain diagnostics, Map context) {
		return TestIdentityActionOperations.validateNoType(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultiplicity(DiagnosticChain diagnostics, Map context) {
		return TestIdentityActionOperations.validateMultiplicity(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultIsBoolean(DiagnosticChain diagnostics,
			Map context) {
		return TestIdentityActionOperations.validateResultIsBoolean(this,
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
			case UMLPackage.TEST_IDENTITY_ACTION__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.TEST_IDENTITY_ACTION__OWNED_COMMENT :
				return ((InternalEList) getOwnedComments()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.TEST_IDENTITY_ACTION__CLIENT_DEPENDENCY :
				return ((InternalEList) getClientDependencies()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.TEST_IDENTITY_ACTION__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.TEST_IDENTITY_ACTION__IN_STRUCTURED_NODE :
				return basicSetInStructuredNode(null, msgs);
			case UMLPackage.TEST_IDENTITY_ACTION__ACTIVITY :
				return basicSetActivity(null, msgs);
			case UMLPackage.TEST_IDENTITY_ACTION__OUTGOING :
				return ((InternalEList) getOutgoings()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.TEST_IDENTITY_ACTION__INCOMING :
				return ((InternalEList) getIncomings()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.TEST_IDENTITY_ACTION__IN_PARTITION :
				return ((InternalEList) getInPartitions()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.TEST_IDENTITY_ACTION__IN_INTERRUPTIBLE_REGION :
				return ((InternalEList) getInInterruptibleRegions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.TEST_IDENTITY_ACTION__HANDLER :
				return ((InternalEList) getHandlers()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.TEST_IDENTITY_ACTION__LOCAL_PRECONDITION :
				return ((InternalEList) getLocalPreconditions()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.TEST_IDENTITY_ACTION__LOCAL_POSTCONDITION :
				return ((InternalEList) getLocalPostconditions()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.TEST_IDENTITY_ACTION__FIRST :
				return basicSetFirst(null, msgs);
			case UMLPackage.TEST_IDENTITY_ACTION__SECOND :
				return basicSetSecond(null, msgs);
			case UMLPackage.TEST_IDENTITY_ACTION__RESULT :
				return basicSetResult(null, msgs);
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
			case UMLPackage.TEST_IDENTITY_ACTION__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.TEST_IDENTITY_ACTION__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.TEST_IDENTITY_ACTION__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.TEST_IDENTITY_ACTION__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.TEST_IDENTITY_ACTION__NAME :
				return getName();
			case UMLPackage.TEST_IDENTITY_ACTION__VISIBILITY :
				return getVisibility();
			case UMLPackage.TEST_IDENTITY_ACTION__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.TEST_IDENTITY_ACTION__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.TEST_IDENTITY_ACTION__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.TEST_IDENTITY_ACTION__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.TEST_IDENTITY_ACTION__IS_LEAF :
				return isLeaf()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.TEST_IDENTITY_ACTION__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.TEST_IDENTITY_ACTION__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.TEST_IDENTITY_ACTION__IN_STRUCTURED_NODE :
				if (resolve)
					return getInStructuredNode();
				return basicGetInStructuredNode();
			case UMLPackage.TEST_IDENTITY_ACTION__ACTIVITY :
				if (resolve)
					return getActivity();
				return basicGetActivity();
			case UMLPackage.TEST_IDENTITY_ACTION__OUTGOING :
				return getOutgoings();
			case UMLPackage.TEST_IDENTITY_ACTION__INCOMING :
				return getIncomings();
			case UMLPackage.TEST_IDENTITY_ACTION__IN_PARTITION :
				return getInPartitions();
			case UMLPackage.TEST_IDENTITY_ACTION__IN_INTERRUPTIBLE_REGION :
				return getInInterruptibleRegions();
			case UMLPackage.TEST_IDENTITY_ACTION__IN_GROUP :
				return getInGroups();
			case UMLPackage.TEST_IDENTITY_ACTION__REDEFINED_NODE :
				return getRedefinedNodes();
			case UMLPackage.TEST_IDENTITY_ACTION__HANDLER :
				return getHandlers();
			case UMLPackage.TEST_IDENTITY_ACTION__OUTPUT :
				return getOutputs();
			case UMLPackage.TEST_IDENTITY_ACTION__INPUT :
				return getInputs();
			case UMLPackage.TEST_IDENTITY_ACTION__CONTEXT :
				if (resolve)
					return getContext();
				return basicGetContext();
			case UMLPackage.TEST_IDENTITY_ACTION__LOCAL_PRECONDITION :
				return getLocalPreconditions();
			case UMLPackage.TEST_IDENTITY_ACTION__LOCAL_POSTCONDITION :
				return getLocalPostconditions();
			case UMLPackage.TEST_IDENTITY_ACTION__FIRST :
				if (resolve)
					return getFirst();
				return basicGetFirst();
			case UMLPackage.TEST_IDENTITY_ACTION__SECOND :
				if (resolve)
					return getSecond();
				return basicGetSecond();
			case UMLPackage.TEST_IDENTITY_ACTION__RESULT :
				if (resolve)
					return getResult();
				return basicGetResult();
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
			case UMLPackage.TEST_IDENTITY_ACTION__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.TEST_IDENTITY_ACTION__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.TEST_IDENTITY_ACTION__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.TEST_IDENTITY_ACTION__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.TEST_IDENTITY_ACTION__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.TEST_IDENTITY_ACTION__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.TEST_IDENTITY_ACTION__IS_LEAF :
				setIsLeaf(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.TEST_IDENTITY_ACTION__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) newValue);
				return;
			case UMLPackage.TEST_IDENTITY_ACTION__ACTIVITY :
				setActivity((Activity) newValue);
				return;
			case UMLPackage.TEST_IDENTITY_ACTION__OUTGOING :
				getOutgoings().clear();
				getOutgoings().addAll((Collection) newValue);
				return;
			case UMLPackage.TEST_IDENTITY_ACTION__INCOMING :
				getIncomings().clear();
				getIncomings().addAll((Collection) newValue);
				return;
			case UMLPackage.TEST_IDENTITY_ACTION__IN_PARTITION :
				getInPartitions().clear();
				getInPartitions().addAll((Collection) newValue);
				return;
			case UMLPackage.TEST_IDENTITY_ACTION__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				getInInterruptibleRegions().addAll((Collection) newValue);
				return;
			case UMLPackage.TEST_IDENTITY_ACTION__REDEFINED_NODE :
				getRedefinedNodes().clear();
				getRedefinedNodes().addAll((Collection) newValue);
				return;
			case UMLPackage.TEST_IDENTITY_ACTION__HANDLER :
				getHandlers().clear();
				getHandlers().addAll((Collection) newValue);
				return;
			case UMLPackage.TEST_IDENTITY_ACTION__LOCAL_PRECONDITION :
				getLocalPreconditions().clear();
				getLocalPreconditions().addAll((Collection) newValue);
				return;
			case UMLPackage.TEST_IDENTITY_ACTION__LOCAL_POSTCONDITION :
				getLocalPostconditions().clear();
				getLocalPostconditions().addAll((Collection) newValue);
				return;
			case UMLPackage.TEST_IDENTITY_ACTION__FIRST :
				setFirst((InputPin) newValue);
				return;
			case UMLPackage.TEST_IDENTITY_ACTION__SECOND :
				setSecond((InputPin) newValue);
				return;
			case UMLPackage.TEST_IDENTITY_ACTION__RESULT :
				setResult((OutputPin) newValue);
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
			case UMLPackage.TEST_IDENTITY_ACTION__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.TEST_IDENTITY_ACTION__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.TEST_IDENTITY_ACTION__NAME :
				unsetName();
				return;
			case UMLPackage.TEST_IDENTITY_ACTION__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.TEST_IDENTITY_ACTION__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.TEST_IDENTITY_ACTION__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.TEST_IDENTITY_ACTION__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.TEST_IDENTITY_ACTION__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) null);
				return;
			case UMLPackage.TEST_IDENTITY_ACTION__ACTIVITY :
				setActivity((Activity) null);
				return;
			case UMLPackage.TEST_IDENTITY_ACTION__OUTGOING :
				getOutgoings().clear();
				return;
			case UMLPackage.TEST_IDENTITY_ACTION__INCOMING :
				getIncomings().clear();
				return;
			case UMLPackage.TEST_IDENTITY_ACTION__IN_PARTITION :
				getInPartitions().clear();
				return;
			case UMLPackage.TEST_IDENTITY_ACTION__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				return;
			case UMLPackage.TEST_IDENTITY_ACTION__REDEFINED_NODE :
				getRedefinedNodes().clear();
				return;
			case UMLPackage.TEST_IDENTITY_ACTION__HANDLER :
				getHandlers().clear();
				return;
			case UMLPackage.TEST_IDENTITY_ACTION__LOCAL_PRECONDITION :
				getLocalPreconditions().clear();
				return;
			case UMLPackage.TEST_IDENTITY_ACTION__LOCAL_POSTCONDITION :
				getLocalPostconditions().clear();
				return;
			case UMLPackage.TEST_IDENTITY_ACTION__FIRST :
				setFirst((InputPin) null);
				return;
			case UMLPackage.TEST_IDENTITY_ACTION__SECOND :
				setSecond((InputPin) null);
				return;
			case UMLPackage.TEST_IDENTITY_ACTION__RESULT :
				setResult((OutputPin) null);
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
			case UMLPackage.TEST_IDENTITY_ACTION__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.TEST_IDENTITY_ACTION__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.TEST_IDENTITY_ACTION__OWNER :
				return isSetOwner();
			case UMLPackage.TEST_IDENTITY_ACTION__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.TEST_IDENTITY_ACTION__NAME :
				return isSetName();
			case UMLPackage.TEST_IDENTITY_ACTION__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.TEST_IDENTITY_ACTION__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.TEST_IDENTITY_ACTION__CLIENT_DEPENDENCY :
				return clientDependencies != null
					&& !clientDependencies.isEmpty();
			case UMLPackage.TEST_IDENTITY_ACTION__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.TEST_IDENTITY_ACTION__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.TEST_IDENTITY_ACTION__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.TEST_IDENTITY_ACTION__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.TEST_IDENTITY_ACTION__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.TEST_IDENTITY_ACTION__IN_STRUCTURED_NODE :
				return basicGetInStructuredNode() != null;
			case UMLPackage.TEST_IDENTITY_ACTION__ACTIVITY :
				return basicGetActivity() != null;
			case UMLPackage.TEST_IDENTITY_ACTION__OUTGOING :
				return outgoings != null && !outgoings.isEmpty();
			case UMLPackage.TEST_IDENTITY_ACTION__INCOMING :
				return incomings != null && !incomings.isEmpty();
			case UMLPackage.TEST_IDENTITY_ACTION__IN_PARTITION :
				return inPartitions != null && !inPartitions.isEmpty();
			case UMLPackage.TEST_IDENTITY_ACTION__IN_INTERRUPTIBLE_REGION :
				return inInterruptibleRegions != null
					&& !inInterruptibleRegions.isEmpty();
			case UMLPackage.TEST_IDENTITY_ACTION__IN_GROUP :
				return isSetInGroups();
			case UMLPackage.TEST_IDENTITY_ACTION__REDEFINED_NODE :
				return redefinedNodes != null && !redefinedNodes.isEmpty();
			case UMLPackage.TEST_IDENTITY_ACTION__HANDLER :
				return handlers != null && !handlers.isEmpty();
			case UMLPackage.TEST_IDENTITY_ACTION__OUTPUT :
				return isSetOutputs();
			case UMLPackage.TEST_IDENTITY_ACTION__INPUT :
				return isSetInputs();
			case UMLPackage.TEST_IDENTITY_ACTION__CONTEXT :
				return basicGetContext() != null;
			case UMLPackage.TEST_IDENTITY_ACTION__LOCAL_PRECONDITION :
				return localPreconditions != null
					&& !localPreconditions.isEmpty();
			case UMLPackage.TEST_IDENTITY_ACTION__LOCAL_POSTCONDITION :
				return localPostconditions != null
					&& !localPostconditions.isEmpty();
			case UMLPackage.TEST_IDENTITY_ACTION__FIRST :
				return first != null;
			case UMLPackage.TEST_IDENTITY_ACTION__SECOND :
				return second != null;
			case UMLPackage.TEST_IDENTITY_ACTION__RESULT :
				return result != null;
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
		UMLPackage.TEST_IDENTITY_ACTION__FIRST,
		UMLPackage.TEST_IDENTITY_ACTION__SECOND};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInputs() {
		return super.isSetInputs()
			|| eIsSet(UMLPackage.TEST_IDENTITY_ACTION__FIRST)
			|| eIsSet(UMLPackage.TEST_IDENTITY_ACTION__SECOND);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getOutputs() <em>Output</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputs()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OUTPUT_ESUBSETS = new int[]{UMLPackage.TEST_IDENTITY_ACTION__RESULT};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOutputs() {
		return super.isSetOutputs()
			|| eIsSet(UMLPackage.TEST_IDENTITY_ACTION__RESULT);
	}

} //TestIdentityActionImpl
