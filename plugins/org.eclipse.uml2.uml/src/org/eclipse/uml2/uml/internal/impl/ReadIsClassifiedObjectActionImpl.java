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
 * $Id: ReadIsClassifiedObjectActionImpl.java,v 1.21 2006/05/24 20:54:28 khussey Exp $
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
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.InputPin;
import org.eclipse.uml2.uml.OutputPin;
import org.eclipse.uml2.uml.ReadIsClassifiedObjectAction;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.StructuredActivityNode;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.ReadIsClassifiedObjectActionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Read Is Classified Object Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ReadIsClassifiedObjectActionImpl#getOutputs <em>Output</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ReadIsClassifiedObjectActionImpl#getInputs <em>Input</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ReadIsClassifiedObjectActionImpl#isDirect <em>Is Direct</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ReadIsClassifiedObjectActionImpl#getClassifier <em>Classifier</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ReadIsClassifiedObjectActionImpl#getResult <em>Result</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ReadIsClassifiedObjectActionImpl#getObject <em>Object</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReadIsClassifiedObjectActionImpl
		extends ActionImpl
		implements ReadIsClassifiedObjectAction {

	/**
	 * The default value of the '{@link #isDirect() <em>Is Direct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDirect()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DIRECT_EDEFAULT = false;

	/**
	 * The flag representing the value of the '{@link #isDirect() <em>Is Direct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDirect()
	 * @generated
	 * @ordered
	 */
	protected static final int IS_DIRECT_EFLAG = 1 << 11;

	/**
	 * The cached value of the '{@link #getClassifier() <em>Classifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifier()
	 * @generated
	 * @ordered
	 */
	protected Classifier classifier = null;

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
	 * The cached value of the '{@link #getObject() <em>Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObject()
	 * @generated
	 * @ordered
	 */
	protected InputPin object = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReadIsClassifiedObjectActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.Literals.READ_IS_CLASSIFIED_OBJECT_ACTION;
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
						this,
						UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__OUTPUT,
						OUTPUT_ESUBSETS));
			}
			return outputs;
		}
		return new DerivedUnionEObjectEList(OutputPin.class, this,
			UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__OUTPUT,
			OUTPUT_ESUBSETS);
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
				cache.put(eResource, this, UMLPackage.Literals.ACTION__INPUT,
					inputs = new DerivedUnionEObjectEList(InputPin.class, this,
						UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__INPUT,
						INPUT_ESUBSETS));
			}
			return inputs;
		}
		return new DerivedUnionEObjectEList(InputPin.class, this,
			UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__INPUT, INPUT_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDirect() {
		return (eFlags & IS_DIRECT_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDirect(boolean newIsDirect) {
		boolean oldIsDirect = (eFlags & IS_DIRECT_EFLAG) != 0;
		if (newIsDirect)
			eFlags |= IS_DIRECT_EFLAG;
		else
			eFlags &= ~IS_DIRECT_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__IS_DIRECT,
				oldIsDirect, newIsDirect));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getClassifier() {
		if (classifier != null && classifier.eIsProxy()) {
			InternalEObject oldClassifier = (InternalEObject) classifier;
			classifier = (Classifier) eResolveProxy(oldClassifier);
			if (classifier != oldClassifier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(
						this,
						Notification.RESOLVE,
						UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__CLASSIFIER,
						oldClassifier, classifier));
			}
		}
		return classifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier basicGetClassifier() {
		return classifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassifier(Classifier newClassifier) {
		Classifier oldClassifier = classifier;
		classifier = newClassifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__CLASSIFIER,
				oldClassifier, classifier));

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
						- UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__RESULT,
					null, null);
				if (newResult.eInternalContainer() == null) {
					msgs = newResult.eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__RESULT,
						null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__RESULT,
						oldResult, result));
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
				Notification.SET,
				UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__RESULT, oldResult,
				newResult);
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
						- UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__RESULT,
					null, msgs);
			if (newResult != null)
				msgs = ((InternalEObject) newResult).eInverseAdd(this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__RESULT,
					null, msgs);
			msgs = basicSetResult(newResult, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__RESULT, newResult,
				newResult));

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
	public InputPin getObject() {
		if (object != null && object.eIsProxy()) {
			InternalEObject oldObject = (InternalEObject) object;
			object = (InputPin) eResolveProxy(oldObject);
			if (object != oldObject) {
				InternalEObject newObject = (InternalEObject) object;
				NotificationChain msgs = oldObject.eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__OBJECT,
					null, null);
				if (newObject.eInternalContainer() == null) {
					msgs = newObject.eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__OBJECT,
						null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__OBJECT,
						oldObject, object));
			}
		}
		return object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin basicGetObject() {
		return object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObject(InputPin newObject,
			NotificationChain msgs) {
		InputPin oldObject = object;
		object = newObject;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET,
				UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__OBJECT, oldObject,
				newObject);
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
	public void setObject(InputPin newObject) {
		if (newObject != object) {
			NotificationChain msgs = null;
			if (object != null)
				msgs = ((InternalEObject) object).eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__OBJECT,
					null, msgs);
			if (newObject != null)
				msgs = ((InternalEObject) newObject).eInverseAdd(this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__OBJECT,
					null, msgs);
			msgs = basicSetObject(newObject, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__OBJECT, newObject,
				newObject));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin createObject(String name, Type type, EClass eClass) {
		InputPin newObject = (InputPin) create(eClass);
		setObject(newObject);
		if (name != null)
			newObject.setName(name);
		if (type != null)
			newObject.setType(type);
		return newObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin createObject(String name, Type type) {
		return createObject(name, type, UMLPackage.Literals.INPUT_PIN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultiplicityOfInput(DiagnosticChain diagnostics,
			Map context) {
		return ReadIsClassifiedObjectActionOperations
			.validateMultiplicityOfInput(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNoType(DiagnosticChain diagnostics, Map context) {
		return ReadIsClassifiedObjectActionOperations.validateNoType(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultiplicityOfOutput(DiagnosticChain diagnostics,
			Map context) {
		return ReadIsClassifiedObjectActionOperations
			.validateMultiplicityOfOutput(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBooleanResult(DiagnosticChain diagnostics,
			Map context) {
		return ReadIsClassifiedObjectActionOperations.validateBooleanResult(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__OWNED_COMMENT :
				return ((InternalEList) getOwnedComments()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__CLIENT_DEPENDENCY :
				return ((InternalEList) getClientDependencies()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__IN_STRUCTURED_NODE :
				return basicSetInStructuredNode(null, msgs);
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__ACTIVITY :
				return basicSetActivity(null, msgs);
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__OUTGOING :
				return ((InternalEList) getOutgoings()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__INCOMING :
				return ((InternalEList) getIncomings()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__IN_PARTITION :
				return ((InternalEList) getInPartitions()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__IN_INTERRUPTIBLE_REGION :
				return ((InternalEList) getInInterruptibleRegions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__HANDLER :
				return ((InternalEList) getHandlers()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__LOCAL_PRECONDITION :
				return ((InternalEList) getLocalPreconditions()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__LOCAL_POSTCONDITION :
				return ((InternalEList) getLocalPostconditions()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__RESULT :
				return basicSetResult(null, msgs);
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__OBJECT :
				return basicSetObject(null, msgs);
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
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__NAME :
				return getName();
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__VISIBILITY :
				return getVisibility();
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__IS_LEAF :
				return isLeaf()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__IN_STRUCTURED_NODE :
				if (resolve)
					return getInStructuredNode();
				return basicGetInStructuredNode();
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__ACTIVITY :
				if (resolve)
					return getActivity();
				return basicGetActivity();
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__OUTGOING :
				return getOutgoings();
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__INCOMING :
				return getIncomings();
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__IN_PARTITION :
				return getInPartitions();
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__IN_INTERRUPTIBLE_REGION :
				return getInInterruptibleRegions();
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__IN_GROUP :
				return getInGroups();
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__REDEFINED_NODE :
				return getRedefinedNodes();
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__HANDLER :
				return getHandlers();
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__OUTPUT :
				return getOutputs();
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__INPUT :
				return getInputs();
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__CONTEXT :
				if (resolve)
					return getContext();
				return basicGetContext();
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__LOCAL_PRECONDITION :
				return getLocalPreconditions();
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__LOCAL_POSTCONDITION :
				return getLocalPostconditions();
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__IS_DIRECT :
				return isDirect()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__CLASSIFIER :
				if (resolve)
					return getClassifier();
				return basicGetClassifier();
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__RESULT :
				if (resolve)
					return getResult();
				return basicGetResult();
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__OBJECT :
				if (resolve)
					return getObject();
				return basicGetObject();
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
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__IS_LEAF :
				setIsLeaf(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) newValue);
				return;
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__ACTIVITY :
				setActivity((Activity) newValue);
				return;
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__OUTGOING :
				getOutgoings().clear();
				getOutgoings().addAll((Collection) newValue);
				return;
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__INCOMING :
				getIncomings().clear();
				getIncomings().addAll((Collection) newValue);
				return;
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__IN_PARTITION :
				getInPartitions().clear();
				getInPartitions().addAll((Collection) newValue);
				return;
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				getInInterruptibleRegions().addAll((Collection) newValue);
				return;
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__REDEFINED_NODE :
				getRedefinedNodes().clear();
				getRedefinedNodes().addAll((Collection) newValue);
				return;
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__HANDLER :
				getHandlers().clear();
				getHandlers().addAll((Collection) newValue);
				return;
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__LOCAL_PRECONDITION :
				getLocalPreconditions().clear();
				getLocalPreconditions().addAll((Collection) newValue);
				return;
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__LOCAL_POSTCONDITION :
				getLocalPostconditions().clear();
				getLocalPostconditions().addAll((Collection) newValue);
				return;
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__IS_DIRECT :
				setIsDirect(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__CLASSIFIER :
				setClassifier((Classifier) newValue);
				return;
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__RESULT :
				setResult((OutputPin) newValue);
				return;
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__OBJECT :
				setObject((InputPin) newValue);
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
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__NAME :
				unsetName();
				return;
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) null);
				return;
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__ACTIVITY :
				setActivity((Activity) null);
				return;
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__OUTGOING :
				getOutgoings().clear();
				return;
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__INCOMING :
				getIncomings().clear();
				return;
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__IN_PARTITION :
				getInPartitions().clear();
				return;
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				return;
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__REDEFINED_NODE :
				getRedefinedNodes().clear();
				return;
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__HANDLER :
				getHandlers().clear();
				return;
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__LOCAL_PRECONDITION :
				getLocalPreconditions().clear();
				return;
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__LOCAL_POSTCONDITION :
				getLocalPostconditions().clear();
				return;
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__IS_DIRECT :
				setIsDirect(IS_DIRECT_EDEFAULT);
				return;
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__CLASSIFIER :
				setClassifier((Classifier) null);
				return;
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__RESULT :
				setResult((OutputPin) null);
				return;
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__OBJECT :
				setObject((InputPin) null);
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
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__OWNER :
				return isSetOwner();
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__NAME :
				return isSetName();
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__CLIENT_DEPENDENCY :
				return clientDependencies != null
					&& !clientDependencies.isEmpty();
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__IN_STRUCTURED_NODE :
				return basicGetInStructuredNode() != null;
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__ACTIVITY :
				return basicGetActivity() != null;
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__OUTGOING :
				return outgoings != null && !outgoings.isEmpty();
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__INCOMING :
				return incomings != null && !incomings.isEmpty();
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__IN_PARTITION :
				return inPartitions != null && !inPartitions.isEmpty();
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__IN_INTERRUPTIBLE_REGION :
				return inInterruptibleRegions != null
					&& !inInterruptibleRegions.isEmpty();
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__IN_GROUP :
				return isSetInGroups();
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__REDEFINED_NODE :
				return redefinedNodes != null && !redefinedNodes.isEmpty();
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__HANDLER :
				return handlers != null && !handlers.isEmpty();
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__OUTPUT :
				return isSetOutputs();
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__INPUT :
				return isSetInputs();
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__CONTEXT :
				return basicGetContext() != null;
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__LOCAL_PRECONDITION :
				return localPreconditions != null
					&& !localPreconditions.isEmpty();
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__LOCAL_POSTCONDITION :
				return localPostconditions != null
					&& !localPostconditions.isEmpty();
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__IS_DIRECT :
				return ((eFlags & IS_DIRECT_EFLAG) != 0) != IS_DIRECT_EDEFAULT;
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__CLASSIFIER :
				return classifier != null;
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__RESULT :
				return result != null;
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__OBJECT :
				return object != null;
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
		result.append(" (isDirect: "); //$NON-NLS-1$
		result.append((eFlags & IS_DIRECT_EFLAG) != 0);
		result.append(')');
		return result.toString();
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getOutputs() <em>Output</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputs()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OUTPUT_ESUBSETS = new int[]{UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__RESULT};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOutputs() {
		return super.isSetOutputs()
			|| eIsSet(UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__RESULT);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getInputs() <em>Input</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputs()
	 * @generated
	 * @ordered
	 */
	protected static final int[] INPUT_ESUBSETS = new int[]{UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__OBJECT};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInputs() {
		return super.isSetInputs()
			|| eIsSet(UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__OBJECT);
	}

} //ReadIsClassifiedObjectActionImpl
