/*
 * Copyright (c) 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: StructuralFeatureActionImpl.java,v 1.5 2005/11/28 20:26:04 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.InputPin;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.StructuralFeature;
import org.eclipse.uml2.uml.StructuralFeatureAction;
import org.eclipse.uml2.uml.StructuredActivityNode;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.StructuralFeatureActionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Structural Feature Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StructuralFeatureActionImpl#getInputs <em>Input</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StructuralFeatureActionImpl#getStructuralFeature <em>Structural Feature</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StructuralFeatureActionImpl#getObject <em>Object</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class StructuralFeatureActionImpl
		extends ActionImpl
		implements StructuralFeatureAction {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructuralFeatureActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.Literals.STRUCTURAL_FEATURE_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getInputs() {
		List input = (List) eVirtualGet(UMLPackage.STRUCTURAL_FEATURE_ACTION__INPUT);
		if (input == null) {
			eVirtualSet(UMLPackage.STRUCTURAL_FEATURE_ACTION__INPUT,
				input = new DerivedUnionEObjectEList(InputPin.class, this,
					UMLPackage.STRUCTURAL_FEATURE_ACTION__INPUT,
					new int[]{UMLPackage.STRUCTURAL_FEATURE_ACTION__OBJECT}));
		}
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuralFeature getStructuralFeature() {
		StructuralFeature structuralFeature = (StructuralFeature) eVirtualGet(UMLPackage.STRUCTURAL_FEATURE_ACTION__STRUCTURAL_FEATURE);
		if (structuralFeature != null && structuralFeature.eIsProxy()) {
			InternalEObject oldStructuralFeature = (InternalEObject) structuralFeature;
			structuralFeature = (StructuralFeature) eResolveProxy(oldStructuralFeature);
			if (structuralFeature != oldStructuralFeature) {
				eVirtualSet(
					UMLPackage.STRUCTURAL_FEATURE_ACTION__STRUCTURAL_FEATURE,
					structuralFeature);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(
						this,
						Notification.RESOLVE,
						UMLPackage.STRUCTURAL_FEATURE_ACTION__STRUCTURAL_FEATURE,
						oldStructuralFeature, structuralFeature));
			}
		}
		return structuralFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuralFeature basicGetStructuralFeature() {
		return (StructuralFeature) eVirtualGet(UMLPackage.STRUCTURAL_FEATURE_ACTION__STRUCTURAL_FEATURE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStructuralFeature(StructuralFeature newStructuralFeature) {
		StructuralFeature structuralFeature = newStructuralFeature;
		Object oldStructuralFeature = eVirtualSet(
			UMLPackage.STRUCTURAL_FEATURE_ACTION__STRUCTURAL_FEATURE,
			structuralFeature);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.STRUCTURAL_FEATURE_ACTION__STRUCTURAL_FEATURE,
				oldStructuralFeature == EVIRTUAL_NO_VALUE
					? null
					: oldStructuralFeature, structuralFeature));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin getObject() {
		return (InputPin) eVirtualGet(UMLPackage.STRUCTURAL_FEATURE_ACTION__OBJECT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObject(InputPin newObject,
			NotificationChain msgs) {
		Object oldObject = eVirtualSet(
			UMLPackage.STRUCTURAL_FEATURE_ACTION__OBJECT, newObject);
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET, UMLPackage.STRUCTURAL_FEATURE_ACTION__OBJECT,
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
		InputPin object = (InputPin) eVirtualGet(UMLPackage.STRUCTURAL_FEATURE_ACTION__OBJECT);
		if (newObject != object) {
			NotificationChain msgs = null;
			if (object != null)
				msgs = ((InternalEObject) object).eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.STRUCTURAL_FEATURE_ACTION__OBJECT, null,
					msgs);
			if (newObject != null)
				msgs = ((InternalEObject) newObject).eInverseAdd(this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.STRUCTURAL_FEATURE_ACTION__OBJECT, null,
					msgs);
			msgs = basicSetObject(newObject, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.STRUCTURAL_FEATURE_ACTION__OBJECT, newObject,
				newObject));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin createObject(EClass eClass) {
		InputPin newObject = (InputPin) eClass.getEPackage()
			.getEFactoryInstance().create(eClass);
		setObject(newObject);
		return newObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin createObject() {
		InputPin newObject = UMLFactory.eINSTANCE.createInputPin();
		setObject(newObject);
		return newObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNotStatic(DiagnosticChain diagnostics, Map context) {
		return StructuralFeatureActionOperations.validateNotStatic(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSameType(DiagnosticChain diagnostics, Map context) {
		return StructuralFeatureActionOperations.validateSameType(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultiplicity(DiagnosticChain diagnostics, Map context) {
		return StructuralFeatureActionOperations.validateMultiplicity(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVisibility(DiagnosticChain diagnostics, Map context) {
		return StructuralFeatureActionOperations.validateVisibility(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOneFeaturingClassifier(DiagnosticChain diagnostics,
			Map context) {
		return StructuralFeatureActionOperations
			.validateOneFeaturingClassifier(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.STRUCTURAL_FEATURE_ACTION__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.STRUCTURAL_FEATURE_ACTION__OWNED_COMMENT :
				return ((InternalEList) getOwnedComments()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.STRUCTURAL_FEATURE_ACTION__CLIENT_DEPENDENCY :
				return ((InternalEList) getClientDependencies()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.STRUCTURAL_FEATURE_ACTION__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.STRUCTURAL_FEATURE_ACTION__OUTGOING :
				return ((InternalEList) getOutgoings()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.STRUCTURAL_FEATURE_ACTION__IN_PARTITION :
				return ((InternalEList) getInPartitions()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.STRUCTURAL_FEATURE_ACTION__IN_STRUCTURED_NODE :
				return eBasicSetContainer(null,
					UMLPackage.STRUCTURAL_FEATURE_ACTION__IN_STRUCTURED_NODE,
					msgs);
			case UMLPackage.STRUCTURAL_FEATURE_ACTION__ACTIVITY :
				return eBasicSetContainer(null,
					UMLPackage.STRUCTURAL_FEATURE_ACTION__ACTIVITY, msgs);
			case UMLPackage.STRUCTURAL_FEATURE_ACTION__INCOMING :
				return ((InternalEList) getIncomings()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.STRUCTURAL_FEATURE_ACTION__IN_INTERRUPTIBLE_REGION :
				return ((InternalEList) getInInterruptibleRegions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.STRUCTURAL_FEATURE_ACTION__HANDLER :
				return ((InternalEList) getHandlers()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.STRUCTURAL_FEATURE_ACTION__LOCAL_PRECONDITION :
				return ((InternalEList) getLocalPreconditions()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.STRUCTURAL_FEATURE_ACTION__LOCAL_POSTCONDITION :
				return ((InternalEList) getLocalPostconditions()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.STRUCTURAL_FEATURE_ACTION__OBJECT :
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
			case UMLPackage.STRUCTURAL_FEATURE_ACTION__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.STRUCTURAL_FEATURE_ACTION__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.STRUCTURAL_FEATURE_ACTION__OWNER :
				return getOwner();
			case UMLPackage.STRUCTURAL_FEATURE_ACTION__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.STRUCTURAL_FEATURE_ACTION__NAME :
				return getName();
			case UMLPackage.STRUCTURAL_FEATURE_ACTION__VISIBILITY :
				return getVisibility();
			case UMLPackage.STRUCTURAL_FEATURE_ACTION__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.STRUCTURAL_FEATURE_ACTION__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.STRUCTURAL_FEATURE_ACTION__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.STRUCTURAL_FEATURE_ACTION__NAME_EXPRESSION :
				return getNameExpression();
			case UMLPackage.STRUCTURAL_FEATURE_ACTION__IS_LEAF :
				return isLeaf()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.STRUCTURAL_FEATURE_ACTION__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.STRUCTURAL_FEATURE_ACTION__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.STRUCTURAL_FEATURE_ACTION__OUTGOING :
				return getOutgoings();
			case UMLPackage.STRUCTURAL_FEATURE_ACTION__IN_GROUP :
				return getInGroups();
			case UMLPackage.STRUCTURAL_FEATURE_ACTION__IN_PARTITION :
				return getInPartitions();
			case UMLPackage.STRUCTURAL_FEATURE_ACTION__IN_STRUCTURED_NODE :
				return getInStructuredNode();
			case UMLPackage.STRUCTURAL_FEATURE_ACTION__ACTIVITY :
				return getActivity();
			case UMLPackage.STRUCTURAL_FEATURE_ACTION__INCOMING :
				return getIncomings();
			case UMLPackage.STRUCTURAL_FEATURE_ACTION__IN_INTERRUPTIBLE_REGION :
				return getInInterruptibleRegions();
			case UMLPackage.STRUCTURAL_FEATURE_ACTION__REDEFINED_NODE :
				return getRedefinedNodes();
			case UMLPackage.STRUCTURAL_FEATURE_ACTION__HANDLER :
				return getHandlers();
			case UMLPackage.STRUCTURAL_FEATURE_ACTION__OUTPUT :
				return getOutputs();
			case UMLPackage.STRUCTURAL_FEATURE_ACTION__INPUT :
				return getInputs();
			case UMLPackage.STRUCTURAL_FEATURE_ACTION__CONTEXT :
				return getContext();
			case UMLPackage.STRUCTURAL_FEATURE_ACTION__LOCAL_PRECONDITION :
				return getLocalPreconditions();
			case UMLPackage.STRUCTURAL_FEATURE_ACTION__LOCAL_POSTCONDITION :
				return getLocalPostconditions();
			case UMLPackage.STRUCTURAL_FEATURE_ACTION__STRUCTURAL_FEATURE :
				if (resolve)
					return getStructuralFeature();
				return basicGetStructuralFeature();
			case UMLPackage.STRUCTURAL_FEATURE_ACTION__OBJECT :
				return getObject();
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
			case UMLPackage.STRUCTURAL_FEATURE_ACTION__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.STRUCTURAL_FEATURE_ACTION__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.STRUCTURAL_FEATURE_ACTION__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.STRUCTURAL_FEATURE_ACTION__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.STRUCTURAL_FEATURE_ACTION__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.STRUCTURAL_FEATURE_ACTION__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.STRUCTURAL_FEATURE_ACTION__IS_LEAF :
				setIsLeaf(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.STRUCTURAL_FEATURE_ACTION__OUTGOING :
				getOutgoings().clear();
				getOutgoings().addAll((Collection) newValue);
				return;
			case UMLPackage.STRUCTURAL_FEATURE_ACTION__IN_PARTITION :
				getInPartitions().clear();
				getInPartitions().addAll((Collection) newValue);
				return;
			case UMLPackage.STRUCTURAL_FEATURE_ACTION__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) newValue);
				return;
			case UMLPackage.STRUCTURAL_FEATURE_ACTION__ACTIVITY :
				setActivity((Activity) newValue);
				return;
			case UMLPackage.STRUCTURAL_FEATURE_ACTION__INCOMING :
				getIncomings().clear();
				getIncomings().addAll((Collection) newValue);
				return;
			case UMLPackage.STRUCTURAL_FEATURE_ACTION__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				getInInterruptibleRegions().addAll((Collection) newValue);
				return;
			case UMLPackage.STRUCTURAL_FEATURE_ACTION__REDEFINED_NODE :
				getRedefinedNodes().clear();
				getRedefinedNodes().addAll((Collection) newValue);
				return;
			case UMLPackage.STRUCTURAL_FEATURE_ACTION__HANDLER :
				getHandlers().clear();
				getHandlers().addAll((Collection) newValue);
				return;
			case UMLPackage.STRUCTURAL_FEATURE_ACTION__LOCAL_PRECONDITION :
				getLocalPreconditions().clear();
				getLocalPreconditions().addAll((Collection) newValue);
				return;
			case UMLPackage.STRUCTURAL_FEATURE_ACTION__LOCAL_POSTCONDITION :
				getLocalPostconditions().clear();
				getLocalPostconditions().addAll((Collection) newValue);
				return;
			case UMLPackage.STRUCTURAL_FEATURE_ACTION__STRUCTURAL_FEATURE :
				setStructuralFeature((StructuralFeature) newValue);
				return;
			case UMLPackage.STRUCTURAL_FEATURE_ACTION__OBJECT :
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
			case UMLPackage.STRUCTURAL_FEATURE_ACTION__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.STRUCTURAL_FEATURE_ACTION__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.STRUCTURAL_FEATURE_ACTION__NAME :
				setName(NAME_EDEFAULT);
				return;
			case UMLPackage.STRUCTURAL_FEATURE_ACTION__VISIBILITY :
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UMLPackage.STRUCTURAL_FEATURE_ACTION__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.STRUCTURAL_FEATURE_ACTION__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.STRUCTURAL_FEATURE_ACTION__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.STRUCTURAL_FEATURE_ACTION__OUTGOING :
				getOutgoings().clear();
				return;
			case UMLPackage.STRUCTURAL_FEATURE_ACTION__IN_PARTITION :
				getInPartitions().clear();
				return;
			case UMLPackage.STRUCTURAL_FEATURE_ACTION__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) null);
				return;
			case UMLPackage.STRUCTURAL_FEATURE_ACTION__ACTIVITY :
				setActivity((Activity) null);
				return;
			case UMLPackage.STRUCTURAL_FEATURE_ACTION__INCOMING :
				getIncomings().clear();
				return;
			case UMLPackage.STRUCTURAL_FEATURE_ACTION__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				return;
			case UMLPackage.STRUCTURAL_FEATURE_ACTION__REDEFINED_NODE :
				getRedefinedNodes().clear();
				return;
			case UMLPackage.STRUCTURAL_FEATURE_ACTION__HANDLER :
				getHandlers().clear();
				return;
			case UMLPackage.STRUCTURAL_FEATURE_ACTION__LOCAL_PRECONDITION :
				getLocalPreconditions().clear();
				return;
			case UMLPackage.STRUCTURAL_FEATURE_ACTION__LOCAL_POSTCONDITION :
				getLocalPostconditions().clear();
				return;
			case UMLPackage.STRUCTURAL_FEATURE_ACTION__STRUCTURAL_FEATURE :
				setStructuralFeature((StructuralFeature) null);
				return;
			case UMLPackage.STRUCTURAL_FEATURE_ACTION__OBJECT :
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
			case UMLPackage.STRUCTURAL_FEATURE_ACTION__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.STRUCTURAL_FEATURE_ACTION__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.STRUCTURAL_FEATURE_ACTION__OWNER :
				return isSetOwner();
			case UMLPackage.STRUCTURAL_FEATURE_ACTION__OWNED_COMMENT :
				List ownedComment = (List) eVirtualGet(UMLPackage.STRUCTURAL_FEATURE_ACTION__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.STRUCTURAL_FEATURE_ACTION__NAME :
				String name = (String) eVirtualGet(
					UMLPackage.STRUCTURAL_FEATURE_ACTION__NAME, NAME_EDEFAULT);
				return NAME_EDEFAULT == null
					? name != null
					: !NAME_EDEFAULT.equals(name);
			case UMLPackage.STRUCTURAL_FEATURE_ACTION__VISIBILITY :
				return eVirtualGet(
					UMLPackage.STRUCTURAL_FEATURE_ACTION__VISIBILITY,
					VISIBILITY_EDEFAULT) != VISIBILITY_EDEFAULT;
			case UMLPackage.STRUCTURAL_FEATURE_ACTION__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.STRUCTURAL_FEATURE_ACTION__CLIENT_DEPENDENCY :
				List clientDependency = (List) eVirtualGet(UMLPackage.STRUCTURAL_FEATURE_ACTION__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.STRUCTURAL_FEATURE_ACTION__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.STRUCTURAL_FEATURE_ACTION__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.STRUCTURAL_FEATURE_ACTION__NAME_EXPRESSION) != null;
			case UMLPackage.STRUCTURAL_FEATURE_ACTION__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.STRUCTURAL_FEATURE_ACTION__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.STRUCTURAL_FEATURE_ACTION__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.STRUCTURAL_FEATURE_ACTION__OUTGOING :
				List outgoing = (List) eVirtualGet(UMLPackage.STRUCTURAL_FEATURE_ACTION__OUTGOING);
				return outgoing != null && !outgoing.isEmpty();
			case UMLPackage.STRUCTURAL_FEATURE_ACTION__IN_GROUP :
				return isSetInGroups();
			case UMLPackage.STRUCTURAL_FEATURE_ACTION__IN_PARTITION :
				List inPartition = (List) eVirtualGet(UMLPackage.STRUCTURAL_FEATURE_ACTION__IN_PARTITION);
				return inPartition != null && !inPartition.isEmpty();
			case UMLPackage.STRUCTURAL_FEATURE_ACTION__IN_STRUCTURED_NODE :
				return getInStructuredNode() != null;
			case UMLPackage.STRUCTURAL_FEATURE_ACTION__ACTIVITY :
				return getActivity() != null;
			case UMLPackage.STRUCTURAL_FEATURE_ACTION__INCOMING :
				List incoming = (List) eVirtualGet(UMLPackage.STRUCTURAL_FEATURE_ACTION__INCOMING);
				return incoming != null && !incoming.isEmpty();
			case UMLPackage.STRUCTURAL_FEATURE_ACTION__IN_INTERRUPTIBLE_REGION :
				List inInterruptibleRegion = (List) eVirtualGet(UMLPackage.STRUCTURAL_FEATURE_ACTION__IN_INTERRUPTIBLE_REGION);
				return inInterruptibleRegion != null
					&& !inInterruptibleRegion.isEmpty();
			case UMLPackage.STRUCTURAL_FEATURE_ACTION__REDEFINED_NODE :
				List redefinedNode = (List) eVirtualGet(UMLPackage.STRUCTURAL_FEATURE_ACTION__REDEFINED_NODE);
				return redefinedNode != null && !redefinedNode.isEmpty();
			case UMLPackage.STRUCTURAL_FEATURE_ACTION__HANDLER :
				List handler = (List) eVirtualGet(UMLPackage.STRUCTURAL_FEATURE_ACTION__HANDLER);
				return handler != null && !handler.isEmpty();
			case UMLPackage.STRUCTURAL_FEATURE_ACTION__OUTPUT :
				return isSetOutputs();
			case UMLPackage.STRUCTURAL_FEATURE_ACTION__INPUT :
				return isSetInputs();
			case UMLPackage.STRUCTURAL_FEATURE_ACTION__CONTEXT :
				return getContext() != null;
			case UMLPackage.STRUCTURAL_FEATURE_ACTION__LOCAL_PRECONDITION :
				List localPrecondition = (List) eVirtualGet(UMLPackage.STRUCTURAL_FEATURE_ACTION__LOCAL_PRECONDITION);
				return localPrecondition != null
					&& !localPrecondition.isEmpty();
			case UMLPackage.STRUCTURAL_FEATURE_ACTION__LOCAL_POSTCONDITION :
				List localPostcondition = (List) eVirtualGet(UMLPackage.STRUCTURAL_FEATURE_ACTION__LOCAL_POSTCONDITION);
				return localPostcondition != null
					&& !localPostcondition.isEmpty();
			case UMLPackage.STRUCTURAL_FEATURE_ACTION__STRUCTURAL_FEATURE :
				return eVirtualGet(UMLPackage.STRUCTURAL_FEATURE_ACTION__STRUCTURAL_FEATURE) != null;
			case UMLPackage.STRUCTURAL_FEATURE_ACTION__OBJECT :
				return eVirtualGet(UMLPackage.STRUCTURAL_FEATURE_ACTION__OBJECT) != null;
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInputs() {
		return super.isSetInputs()
			|| eIsSet(UMLPackage.STRUCTURAL_FEATURE_ACTION__OBJECT);
	}

} //StructuralFeatureActionImpl
