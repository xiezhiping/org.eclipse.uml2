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
 * $Id: UnmarshallActionImpl.java,v 1.13 2006/02/22 20:48:16 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.InputPin;
import org.eclipse.uml2.uml.OutputPin;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.StructuredActivityNode;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.UnmarshallAction;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.UnmarshallActionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unmarshall Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.UnmarshallActionImpl#getOutputs <em>Output</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.UnmarshallActionImpl#getInputs <em>Input</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.UnmarshallActionImpl#getResults <em>Result</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.UnmarshallActionImpl#getUnmarshallType <em>Unmarshall Type</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.UnmarshallActionImpl#getObject <em>Object</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UnmarshallActionImpl
		extends ActionImpl
		implements UnmarshallAction {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnmarshallActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.Literals.UNMARSHALL_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOutputs() {
		EList output = (EList) eVirtualGet(UMLPackage.UNMARSHALL_ACTION__OUTPUT);
		if (output == null) {
			eVirtualSet(UMLPackage.UNMARSHALL_ACTION__OUTPUT,
				output = new DerivedUnionEObjectEList(OutputPin.class, this,
					UMLPackage.UNMARSHALL_ACTION__OUTPUT,
					new int[]{UMLPackage.UNMARSHALL_ACTION__RESULT}));
		}
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getInputs() {
		EList input = (EList) eVirtualGet(UMLPackage.UNMARSHALL_ACTION__INPUT);
		if (input == null) {
			eVirtualSet(UMLPackage.UNMARSHALL_ACTION__INPUT,
				input = new DerivedUnionEObjectEList(InputPin.class, this,
					UMLPackage.UNMARSHALL_ACTION__INPUT,
					new int[]{UMLPackage.UNMARSHALL_ACTION__OBJECT}));
		}
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getResults() {
		EList result = (EList) eVirtualGet(UMLPackage.UNMARSHALL_ACTION__RESULT);
		if (result == null) {
			eVirtualSet(UMLPackage.UNMARSHALL_ACTION__RESULT,
				result = new EObjectResolvingEList(OutputPin.class, this,
					UMLPackage.UNMARSHALL_ACTION__RESULT));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPin getResult(String name, Type type) {
		return getResult(name, type, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPin getResult(String name, Type type, boolean ignoreCase) {
		resultLoop : for (Iterator i = getResults().iterator(); i.hasNext();) {
			OutputPin result = (OutputPin) i.next();
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(result.getName())
				: name.equals(result.getName())))
				continue resultLoop;
			if (type != null && !type.equals(result.getType()))
				continue resultLoop;
			return result;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getUnmarshallType() {
		Classifier unmarshallType = (Classifier) eVirtualGet(UMLPackage.UNMARSHALL_ACTION__UNMARSHALL_TYPE);
		if (unmarshallType != null && unmarshallType.eIsProxy()) {
			InternalEObject oldUnmarshallType = (InternalEObject) unmarshallType;
			unmarshallType = (Classifier) eResolveProxy(oldUnmarshallType);
			if (unmarshallType != oldUnmarshallType) {
				eVirtualSet(UMLPackage.UNMARSHALL_ACTION__UNMARSHALL_TYPE,
					unmarshallType);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.UNMARSHALL_ACTION__UNMARSHALL_TYPE,
						oldUnmarshallType, unmarshallType));
			}
		}
		return unmarshallType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier basicGetUnmarshallType() {
		return (Classifier) eVirtualGet(UMLPackage.UNMARSHALL_ACTION__UNMARSHALL_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnmarshallType(Classifier newUnmarshallType) {
		Classifier unmarshallType = newUnmarshallType;
		Object oldUnmarshallType = eVirtualSet(
			UMLPackage.UNMARSHALL_ACTION__UNMARSHALL_TYPE, unmarshallType);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.UNMARSHALL_ACTION__UNMARSHALL_TYPE,
				oldUnmarshallType == EVIRTUAL_NO_VALUE
					? null
					: oldUnmarshallType, unmarshallType));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin getObject() {
		InputPin object = (InputPin) eVirtualGet(UMLPackage.UNMARSHALL_ACTION__OBJECT);
		if (object != null && object.eIsProxy()) {
			InternalEObject oldObject = (InternalEObject) object;
			object = (InputPin) eResolveProxy(oldObject);
			if (object != oldObject) {
				InternalEObject newObject = (InternalEObject) object;
				NotificationChain msgs = oldObject.eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.UNMARSHALL_ACTION__OBJECT, null, null);
				if (newObject.eInternalContainer() == null) {
					msgs = newObject.eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- UMLPackage.UNMARSHALL_ACTION__OBJECT, null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.UNMARSHALL_ACTION__OBJECT, oldObject, object));
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
		return (InputPin) eVirtualGet(UMLPackage.UNMARSHALL_ACTION__OBJECT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObject(InputPin newObject,
			NotificationChain msgs) {
		Object oldObject = eVirtualSet(UMLPackage.UNMARSHALL_ACTION__OBJECT,
			newObject);
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET, UMLPackage.UNMARSHALL_ACTION__OBJECT,
				oldObject == EVIRTUAL_NO_VALUE
					? null
					: oldObject, newObject);
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
		InputPin object = (InputPin) eVirtualGet(UMLPackage.UNMARSHALL_ACTION__OBJECT);
		if (newObject != object) {
			NotificationChain msgs = null;
			if (object != null)
				msgs = ((InternalEObject) object).eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.UNMARSHALL_ACTION__OBJECT, null, msgs);
			if (newObject != null)
				msgs = ((InternalEObject) newObject).eInverseAdd(this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.UNMARSHALL_ACTION__OBJECT, null, msgs);
			msgs = basicSetObject(newObject, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.UNMARSHALL_ACTION__OBJECT, newObject, newObject));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin createObject(String name, Type type, EClass eClass) {
		InputPin newObject = (InputPin) EcoreUtil.create(eClass);
		newObject.setName(name);
		newObject.setType(type);
		setObject(newObject);
		return newObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin createObject(String name, Type type) {
		InputPin newObject = UMLFactory.eINSTANCE.createInputPin();
		newObject.setName(name);
		newObject.setType(type);
		setObject(newObject);
		return newObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSameType(DiagnosticChain diagnostics, Map context) {
		return UnmarshallActionOperations.validateSameType(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultiplicityOfObject(DiagnosticChain diagnostics,
			Map context) {
		return UnmarshallActionOperations.validateMultiplicityOfObject(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumberOfResult(DiagnosticChain diagnostics,
			Map context) {
		return UnmarshallActionOperations.validateNumberOfResult(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeAndOrdering(DiagnosticChain diagnostics,
			Map context) {
		return UnmarshallActionOperations.validateTypeAndOrdering(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultiplicityOfResult(DiagnosticChain diagnostics,
			Map context) {
		return UnmarshallActionOperations.validateMultiplicityOfResult(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructuralFeature(DiagnosticChain diagnostics,
			Map context) {
		return UnmarshallActionOperations.validateStructuralFeature(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnmarshallTypeIsClassifier(
			DiagnosticChain diagnostics, Map context) {
		return UnmarshallActionOperations.validateUnmarshallTypeIsClassifier(
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
			case UMLPackage.UNMARSHALL_ACTION__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.UNMARSHALL_ACTION__OWNED_COMMENT :
				return ((InternalEList) getOwnedComments()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.UNMARSHALL_ACTION__CLIENT_DEPENDENCY :
				return ((InternalEList) getClientDependencies()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.UNMARSHALL_ACTION__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.UNMARSHALL_ACTION__IN_STRUCTURED_NODE :
				return eBasicSetContainer(null,
					UMLPackage.UNMARSHALL_ACTION__IN_STRUCTURED_NODE, msgs);
			case UMLPackage.UNMARSHALL_ACTION__ACTIVITY :
				return eBasicSetContainer(null,
					UMLPackage.UNMARSHALL_ACTION__ACTIVITY, msgs);
			case UMLPackage.UNMARSHALL_ACTION__OUTGOING :
				return ((InternalEList) getOutgoings()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.UNMARSHALL_ACTION__INCOMING :
				return ((InternalEList) getIncomings()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.UNMARSHALL_ACTION__IN_PARTITION :
				return ((InternalEList) getInPartitions()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.UNMARSHALL_ACTION__IN_INTERRUPTIBLE_REGION :
				return ((InternalEList) getInInterruptibleRegions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.UNMARSHALL_ACTION__HANDLER :
				return ((InternalEList) getHandlers()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.UNMARSHALL_ACTION__LOCAL_PRECONDITION :
				return ((InternalEList) getLocalPreconditions()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.UNMARSHALL_ACTION__LOCAL_POSTCONDITION :
				return ((InternalEList) getLocalPostconditions()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.UNMARSHALL_ACTION__OBJECT :
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
			case UMLPackage.UNMARSHALL_ACTION__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.UNMARSHALL_ACTION__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.UNMARSHALL_ACTION__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.UNMARSHALL_ACTION__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.UNMARSHALL_ACTION__NAME :
				return getName();
			case UMLPackage.UNMARSHALL_ACTION__VISIBILITY :
				return getVisibility();
			case UMLPackage.UNMARSHALL_ACTION__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.UNMARSHALL_ACTION__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.UNMARSHALL_ACTION__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.UNMARSHALL_ACTION__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.UNMARSHALL_ACTION__IS_LEAF :
				return isLeaf()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.UNMARSHALL_ACTION__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.UNMARSHALL_ACTION__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.UNMARSHALL_ACTION__IN_STRUCTURED_NODE :
				return getInStructuredNode();
			case UMLPackage.UNMARSHALL_ACTION__ACTIVITY :
				return getActivity();
			case UMLPackage.UNMARSHALL_ACTION__OUTGOING :
				return getOutgoings();
			case UMLPackage.UNMARSHALL_ACTION__INCOMING :
				return getIncomings();
			case UMLPackage.UNMARSHALL_ACTION__IN_PARTITION :
				return getInPartitions();
			case UMLPackage.UNMARSHALL_ACTION__IN_INTERRUPTIBLE_REGION :
				return getInInterruptibleRegions();
			case UMLPackage.UNMARSHALL_ACTION__IN_GROUP :
				return getInGroups();
			case UMLPackage.UNMARSHALL_ACTION__REDEFINED_NODE :
				return getRedefinedNodes();
			case UMLPackage.UNMARSHALL_ACTION__HANDLER :
				return getHandlers();
			case UMLPackage.UNMARSHALL_ACTION__OUTPUT :
				return getOutputs();
			case UMLPackage.UNMARSHALL_ACTION__INPUT :
				return getInputs();
			case UMLPackage.UNMARSHALL_ACTION__CONTEXT :
				return getContext();
			case UMLPackage.UNMARSHALL_ACTION__LOCAL_PRECONDITION :
				return getLocalPreconditions();
			case UMLPackage.UNMARSHALL_ACTION__LOCAL_POSTCONDITION :
				return getLocalPostconditions();
			case UMLPackage.UNMARSHALL_ACTION__RESULT :
				return getResults();
			case UMLPackage.UNMARSHALL_ACTION__UNMARSHALL_TYPE :
				if (resolve)
					return getUnmarshallType();
				return basicGetUnmarshallType();
			case UMLPackage.UNMARSHALL_ACTION__OBJECT :
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
			case UMLPackage.UNMARSHALL_ACTION__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.UNMARSHALL_ACTION__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.UNMARSHALL_ACTION__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.UNMARSHALL_ACTION__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.UNMARSHALL_ACTION__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.UNMARSHALL_ACTION__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.UNMARSHALL_ACTION__IS_LEAF :
				setIsLeaf(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.UNMARSHALL_ACTION__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) newValue);
				return;
			case UMLPackage.UNMARSHALL_ACTION__ACTIVITY :
				setActivity((Activity) newValue);
				return;
			case UMLPackage.UNMARSHALL_ACTION__OUTGOING :
				getOutgoings().clear();
				getOutgoings().addAll((Collection) newValue);
				return;
			case UMLPackage.UNMARSHALL_ACTION__INCOMING :
				getIncomings().clear();
				getIncomings().addAll((Collection) newValue);
				return;
			case UMLPackage.UNMARSHALL_ACTION__IN_PARTITION :
				getInPartitions().clear();
				getInPartitions().addAll((Collection) newValue);
				return;
			case UMLPackage.UNMARSHALL_ACTION__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				getInInterruptibleRegions().addAll((Collection) newValue);
				return;
			case UMLPackage.UNMARSHALL_ACTION__REDEFINED_NODE :
				getRedefinedNodes().clear();
				getRedefinedNodes().addAll((Collection) newValue);
				return;
			case UMLPackage.UNMARSHALL_ACTION__HANDLER :
				getHandlers().clear();
				getHandlers().addAll((Collection) newValue);
				return;
			case UMLPackage.UNMARSHALL_ACTION__LOCAL_PRECONDITION :
				getLocalPreconditions().clear();
				getLocalPreconditions().addAll((Collection) newValue);
				return;
			case UMLPackage.UNMARSHALL_ACTION__LOCAL_POSTCONDITION :
				getLocalPostconditions().clear();
				getLocalPostconditions().addAll((Collection) newValue);
				return;
			case UMLPackage.UNMARSHALL_ACTION__RESULT :
				getResults().clear();
				getResults().addAll((Collection) newValue);
				return;
			case UMLPackage.UNMARSHALL_ACTION__UNMARSHALL_TYPE :
				setUnmarshallType((Classifier) newValue);
				return;
			case UMLPackage.UNMARSHALL_ACTION__OBJECT :
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
			case UMLPackage.UNMARSHALL_ACTION__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.UNMARSHALL_ACTION__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.UNMARSHALL_ACTION__NAME :
				unsetName();
				return;
			case UMLPackage.UNMARSHALL_ACTION__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.UNMARSHALL_ACTION__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.UNMARSHALL_ACTION__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.UNMARSHALL_ACTION__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.UNMARSHALL_ACTION__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) null);
				return;
			case UMLPackage.UNMARSHALL_ACTION__ACTIVITY :
				setActivity((Activity) null);
				return;
			case UMLPackage.UNMARSHALL_ACTION__OUTGOING :
				getOutgoings().clear();
				return;
			case UMLPackage.UNMARSHALL_ACTION__INCOMING :
				getIncomings().clear();
				return;
			case UMLPackage.UNMARSHALL_ACTION__IN_PARTITION :
				getInPartitions().clear();
				return;
			case UMLPackage.UNMARSHALL_ACTION__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				return;
			case UMLPackage.UNMARSHALL_ACTION__REDEFINED_NODE :
				getRedefinedNodes().clear();
				return;
			case UMLPackage.UNMARSHALL_ACTION__HANDLER :
				getHandlers().clear();
				return;
			case UMLPackage.UNMARSHALL_ACTION__LOCAL_PRECONDITION :
				getLocalPreconditions().clear();
				return;
			case UMLPackage.UNMARSHALL_ACTION__LOCAL_POSTCONDITION :
				getLocalPostconditions().clear();
				return;
			case UMLPackage.UNMARSHALL_ACTION__RESULT :
				getResults().clear();
				return;
			case UMLPackage.UNMARSHALL_ACTION__UNMARSHALL_TYPE :
				setUnmarshallType((Classifier) null);
				return;
			case UMLPackage.UNMARSHALL_ACTION__OBJECT :
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
			case UMLPackage.UNMARSHALL_ACTION__EANNOTATIONS :
				EList eAnnotations = (EList) eVirtualGet(UMLPackage.UNMARSHALL_ACTION__EANNOTATIONS);
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.UNMARSHALL_ACTION__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.UNMARSHALL_ACTION__OWNER :
				return isSetOwner();
			case UMLPackage.UNMARSHALL_ACTION__OWNED_COMMENT :
				EList ownedComment = (EList) eVirtualGet(UMLPackage.UNMARSHALL_ACTION__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.UNMARSHALL_ACTION__NAME :
				return isSetName();
			case UMLPackage.UNMARSHALL_ACTION__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.UNMARSHALL_ACTION__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.UNMARSHALL_ACTION__CLIENT_DEPENDENCY :
				EList clientDependency = (EList) eVirtualGet(UMLPackage.UNMARSHALL_ACTION__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.UNMARSHALL_ACTION__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.UNMARSHALL_ACTION__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.UNMARSHALL_ACTION__NAME_EXPRESSION) != null;
			case UMLPackage.UNMARSHALL_ACTION__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.UNMARSHALL_ACTION__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.UNMARSHALL_ACTION__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.UNMARSHALL_ACTION__IN_STRUCTURED_NODE :
				return getInStructuredNode() != null;
			case UMLPackage.UNMARSHALL_ACTION__ACTIVITY :
				return getActivity() != null;
			case UMLPackage.UNMARSHALL_ACTION__OUTGOING :
				EList outgoing = (EList) eVirtualGet(UMLPackage.UNMARSHALL_ACTION__OUTGOING);
				return outgoing != null && !outgoing.isEmpty();
			case UMLPackage.UNMARSHALL_ACTION__INCOMING :
				EList incoming = (EList) eVirtualGet(UMLPackage.UNMARSHALL_ACTION__INCOMING);
				return incoming != null && !incoming.isEmpty();
			case UMLPackage.UNMARSHALL_ACTION__IN_PARTITION :
				EList inPartition = (EList) eVirtualGet(UMLPackage.UNMARSHALL_ACTION__IN_PARTITION);
				return inPartition != null && !inPartition.isEmpty();
			case UMLPackage.UNMARSHALL_ACTION__IN_INTERRUPTIBLE_REGION :
				EList inInterruptibleRegion = (EList) eVirtualGet(UMLPackage.UNMARSHALL_ACTION__IN_INTERRUPTIBLE_REGION);
				return inInterruptibleRegion != null
					&& !inInterruptibleRegion.isEmpty();
			case UMLPackage.UNMARSHALL_ACTION__IN_GROUP :
				return isSetInGroups();
			case UMLPackage.UNMARSHALL_ACTION__REDEFINED_NODE :
				EList redefinedNode = (EList) eVirtualGet(UMLPackage.UNMARSHALL_ACTION__REDEFINED_NODE);
				return redefinedNode != null && !redefinedNode.isEmpty();
			case UMLPackage.UNMARSHALL_ACTION__HANDLER :
				EList handler = (EList) eVirtualGet(UMLPackage.UNMARSHALL_ACTION__HANDLER);
				return handler != null && !handler.isEmpty();
			case UMLPackage.UNMARSHALL_ACTION__OUTPUT :
				return isSetOutputs();
			case UMLPackage.UNMARSHALL_ACTION__INPUT :
				return isSetInputs();
			case UMLPackage.UNMARSHALL_ACTION__CONTEXT :
				return getContext() != null;
			case UMLPackage.UNMARSHALL_ACTION__LOCAL_PRECONDITION :
				EList localPrecondition = (EList) eVirtualGet(UMLPackage.UNMARSHALL_ACTION__LOCAL_PRECONDITION);
				return localPrecondition != null
					&& !localPrecondition.isEmpty();
			case UMLPackage.UNMARSHALL_ACTION__LOCAL_POSTCONDITION :
				EList localPostcondition = (EList) eVirtualGet(UMLPackage.UNMARSHALL_ACTION__LOCAL_POSTCONDITION);
				return localPostcondition != null
					&& !localPostcondition.isEmpty();
			case UMLPackage.UNMARSHALL_ACTION__RESULT :
				EList result = (EList) eVirtualGet(UMLPackage.UNMARSHALL_ACTION__RESULT);
				return result != null && !result.isEmpty();
			case UMLPackage.UNMARSHALL_ACTION__UNMARSHALL_TYPE :
				return eVirtualGet(UMLPackage.UNMARSHALL_ACTION__UNMARSHALL_TYPE) != null;
			case UMLPackage.UNMARSHALL_ACTION__OBJECT :
				return eVirtualGet(UMLPackage.UNMARSHALL_ACTION__OBJECT) != null;
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOutputs() {
		return super.isSetOutputs()
			|| eIsSet(UMLPackage.UNMARSHALL_ACTION__RESULT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInputs() {
		return super.isSetInputs()
			|| eIsSet(UMLPackage.UNMARSHALL_ACTION__OBJECT);
	}

} //UnmarshallActionImpl
