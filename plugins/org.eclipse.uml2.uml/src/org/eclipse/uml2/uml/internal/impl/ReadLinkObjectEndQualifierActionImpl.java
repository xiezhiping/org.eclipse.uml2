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
 * $Id: ReadLinkObjectEndQualifierActionImpl.java,v 1.2 2005/11/22 15:32:36 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.InputPin;
import org.eclipse.uml2.uml.OutputPin;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.ReadLinkObjectEndQualifierAction;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.StructuredActivityNode;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.ReadLinkObjectEndQualifierActionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Read Link Object End Qualifier Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ReadLinkObjectEndQualifierActionImpl#getInputs <em>Input</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ReadLinkObjectEndQualifierActionImpl#getOutputs <em>Output</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ReadLinkObjectEndQualifierActionImpl#getObject <em>Object</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ReadLinkObjectEndQualifierActionImpl#getResult <em>Result</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ReadLinkObjectEndQualifierActionImpl#getQualifier <em>Qualifier</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReadLinkObjectEndQualifierActionImpl
		extends ActionImpl
		implements ReadLinkObjectEndQualifierAction {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReadLinkObjectEndQualifierActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.eINSTANCE.getReadLinkObjectEndQualifierAction();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getInputs() {
		List input = (List) eVirtualGet(UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__INPUT);
		if (input == null) {
			eVirtualSet(
				UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__INPUT,
				input = new DerivedUnionEObjectEList(InputPin.class, this,
					UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__INPUT,
					new EStructuralFeature[]{UMLPackage.eINSTANCE
						.getReadLinkObjectEndQualifierAction_Object()}));
		}
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getOutputs() {
		List output = (List) eVirtualGet(UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__OUTPUT);
		if (output == null) {
			eVirtualSet(
				UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__OUTPUT,
				output = new DerivedUnionEObjectEList(OutputPin.class, this,
					UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__OUTPUT,
					new EStructuralFeature[]{UMLPackage.eINSTANCE
						.getReadLinkObjectEndQualifierAction_Result()}));
		}
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin getObject() {
		return (InputPin) eVirtualGet(UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__OBJECT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObject(InputPin newObject,
			NotificationChain msgs) {
		Object oldObject = eVirtualSet(
			UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__OBJECT, newObject);
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET,
				UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__OBJECT,
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
		InputPin object = (InputPin) eVirtualGet(UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__OBJECT);
		if (newObject != object) {
			NotificationChain msgs = null;
			if (object != null)
				msgs = ((InternalEObject) object)
					.eInverseRemove(
						this,
						EOPPOSITE_FEATURE_BASE
							- UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__OBJECT,
						null, msgs);
			if (newObject != null)
				msgs = ((InternalEObject) newObject)
					.eInverseAdd(
						this,
						EOPPOSITE_FEATURE_BASE
							- UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__OBJECT,
						null, msgs);
			msgs = basicSetObject(newObject, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__OBJECT,
				newObject, newObject));

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
	public OutputPin getResult() {
		return (OutputPin) eVirtualGet(UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__RESULT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResult(OutputPin newResult,
			NotificationChain msgs) {
		Object oldResult = eVirtualSet(
			UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__RESULT, newResult);
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET,
				UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__RESULT,
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
		OutputPin result = (OutputPin) eVirtualGet(UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__RESULT);
		if (newResult != result) {
			NotificationChain msgs = null;
			if (result != null)
				msgs = ((InternalEObject) result)
					.eInverseRemove(
						this,
						EOPPOSITE_FEATURE_BASE
							- UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__RESULT,
						null, msgs);
			if (newResult != null)
				msgs = ((InternalEObject) newResult)
					.eInverseAdd(
						this,
						EOPPOSITE_FEATURE_BASE
							- UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__RESULT,
						null, msgs);
			msgs = basicSetResult(newResult, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__RESULT,
				newResult, newResult));

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
	public Property getQualifier() {
		Property qualifier = (Property) eVirtualGet(UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__QUALIFIER);
		if (qualifier != null && qualifier.eIsProxy()) {
			InternalEObject oldQualifier = (InternalEObject) qualifier;
			qualifier = (Property) eResolveProxy(oldQualifier);
			if (qualifier != oldQualifier) {
				eVirtualSet(
					UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__QUALIFIER,
					qualifier);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(
						this,
						Notification.RESOLVE,
						UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__QUALIFIER,
						oldQualifier, qualifier));
			}
		}
		return qualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property basicGetQualifier() {
		return (Property) eVirtualGet(UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__QUALIFIER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQualifier(Property newQualifier) {
		Property qualifier = newQualifier;
		Object oldQualifier = eVirtualSet(
			UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__QUALIFIER,
			qualifier);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__QUALIFIER,
				oldQualifier == EVIRTUAL_NO_VALUE
					? null
					: oldQualifier, qualifier));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQualifierAttribute(DiagnosticChain diagnostics,
			Map context) {
		return ReadLinkObjectEndQualifierActionOperations
			.validateQualifierAttribute(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssociationOfAssociation(
			DiagnosticChain diagnostics, Map context) {
		return ReadLinkObjectEndQualifierActionOperations
			.validateAssociationOfAssociation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEndsOfAssociation(DiagnosticChain diagnostics,
			Map context) {
		return ReadLinkObjectEndQualifierActionOperations
			.validateEndsOfAssociation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeOfObject(DiagnosticChain diagnostics, Map context) {
		return ReadLinkObjectEndQualifierActionOperations.validateTypeOfObject(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultiplicityOfQualifier(DiagnosticChain diagnostics,
			Map context) {
		return ReadLinkObjectEndQualifierActionOperations
			.validateMultiplicityOfQualifier(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultiplicityOfObject(DiagnosticChain diagnostics,
			Map context) {
		return ReadLinkObjectEndQualifierActionOperations
			.validateMultiplicityOfObject(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSameType(DiagnosticChain diagnostics, Map context) {
		return ReadLinkObjectEndQualifierActionOperations.validateSameType(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultiplicityOfResult(DiagnosticChain diagnostics,
			Map context) {
		return ReadLinkObjectEndQualifierActionOperations
			.validateMultiplicityOfResult(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__EANNOTATIONS :
					return ((InternalEList) getEAnnotations()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__OWNED_COMMENT :
					return ((InternalEList) getOwnedComments()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__CLIENT_DEPENDENCY :
					return ((InternalEList) getClientDependencies())
						.basicRemove(otherEnd, msgs);
				case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__NAME_EXPRESSION :
					return basicSetNameExpression(null, msgs);
				case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__OUTGOING :
					return ((InternalEList) getOutgoings()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__IN_PARTITION :
					return ((InternalEList) getInPartitions()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__IN_STRUCTURED_NODE :
					return eBasicSetContainer(
						null,
						UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__IN_STRUCTURED_NODE,
						msgs);
				case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__ACTIVITY :
					return eBasicSetContainer(
						null,
						UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__ACTIVITY,
						msgs);
				case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__INCOMING :
					return ((InternalEList) getIncomings()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__IN_INTERRUPTIBLE_REGION :
					return ((InternalEList) getInInterruptibleRegions())
						.basicRemove(otherEnd, msgs);
				case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__HANDLER :
					return ((InternalEList) getHandlers()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__LOCAL_PRECONDITION :
					return ((InternalEList) getLocalPreconditions())
						.basicRemove(otherEnd, msgs);
				case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__LOCAL_POSTCONDITION :
					return ((InternalEList) getLocalPostconditions())
						.basicRemove(otherEnd, msgs);
				case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__OBJECT :
					return basicSetObject(null, msgs);
				case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__RESULT :
					return basicSetResult(null, msgs);
				default :
					return eDynamicInverseRemove(otherEnd, featureID,
						baseClass, msgs);
			}
		}
		return eBasicSetContainer(null, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__OWNER :
				return getOwner();
			case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__NAME :
				return getName();
			case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__VISIBILITY :
				return getVisibility();
			case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__NAME_EXPRESSION :
				return getNameExpression();
			case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__IS_LEAF :
				return isLeaf()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__OUTGOING :
				return getOutgoings();
			case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__IN_GROUP :
				return getInGroups();
			case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__IN_PARTITION :
				return getInPartitions();
			case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__IN_STRUCTURED_NODE :
				return getInStructuredNode();
			case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__ACTIVITY :
				return getActivity();
			case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__INCOMING :
				return getIncomings();
			case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__IN_INTERRUPTIBLE_REGION :
				return getInInterruptibleRegions();
			case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__REDEFINED_NODE :
				return getRedefinedNodes();
			case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__HANDLER :
				return getHandlers();
			case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__OUTPUT :
				return getOutputs();
			case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__INPUT :
				return getInputs();
			case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__CONTEXT :
				return getContext();
			case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__LOCAL_PRECONDITION :
				return getLocalPreconditions();
			case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__LOCAL_POSTCONDITION :
				return getLocalPostconditions();
			case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__OBJECT :
				return getObject();
			case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__RESULT :
				return getResult();
			case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__QUALIFIER :
				if (resolve)
					return getQualifier();
				return basicGetQualifier();
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
			case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__IS_LEAF :
				setIsLeaf(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__OUTGOING :
				getOutgoings().clear();
				getOutgoings().addAll((Collection) newValue);
				return;
			case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__IN_PARTITION :
				getInPartitions().clear();
				getInPartitions().addAll((Collection) newValue);
				return;
			case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) newValue);
				return;
			case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__ACTIVITY :
				setActivity((Activity) newValue);
				return;
			case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__INCOMING :
				getIncomings().clear();
				getIncomings().addAll((Collection) newValue);
				return;
			case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				getInInterruptibleRegions().addAll((Collection) newValue);
				return;
			case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__REDEFINED_NODE :
				getRedefinedNodes().clear();
				getRedefinedNodes().addAll((Collection) newValue);
				return;
			case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__HANDLER :
				getHandlers().clear();
				getHandlers().addAll((Collection) newValue);
				return;
			case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__LOCAL_PRECONDITION :
				getLocalPreconditions().clear();
				getLocalPreconditions().addAll((Collection) newValue);
				return;
			case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__LOCAL_POSTCONDITION :
				getLocalPostconditions().clear();
				getLocalPostconditions().addAll((Collection) newValue);
				return;
			case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__OBJECT :
				setObject((InputPin) newValue);
				return;
			case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__RESULT :
				setResult((OutputPin) newValue);
				return;
			case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__QUALIFIER :
				setQualifier((Property) newValue);
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
			case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__NAME :
				setName(NAME_EDEFAULT);
				return;
			case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__VISIBILITY :
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__OUTGOING :
				getOutgoings().clear();
				return;
			case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__IN_PARTITION :
				getInPartitions().clear();
				return;
			case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) null);
				return;
			case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__ACTIVITY :
				setActivity((Activity) null);
				return;
			case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__INCOMING :
				getIncomings().clear();
				return;
			case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				return;
			case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__REDEFINED_NODE :
				getRedefinedNodes().clear();
				return;
			case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__HANDLER :
				getHandlers().clear();
				return;
			case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__LOCAL_PRECONDITION :
				getLocalPreconditions().clear();
				return;
			case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__LOCAL_POSTCONDITION :
				getLocalPostconditions().clear();
				return;
			case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__OBJECT :
				setObject((InputPin) null);
				return;
			case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__RESULT :
				setResult((OutputPin) null);
				return;
			case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__QUALIFIER :
				setQualifier((Property) null);
				return;
		}
		eDynamicUnset(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__OWNER :
				return isSetOwner();
			case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__OWNED_COMMENT :
				List ownedComment = (List) eVirtualGet(UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__NAME :
				String name = (String) eVirtualGet(
					UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__NAME,
					NAME_EDEFAULT);
				return NAME_EDEFAULT == null
					? name != null
					: !NAME_EDEFAULT.equals(name);
			case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__VISIBILITY :
				return eVirtualGet(
					UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__VISIBILITY,
					VISIBILITY_EDEFAULT) != VISIBILITY_EDEFAULT;
			case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__CLIENT_DEPENDENCY :
				List clientDependency = (List) eVirtualGet(UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__NAME_EXPRESSION) != null;
			case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__OUTGOING :
				List outgoing = (List) eVirtualGet(UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__OUTGOING);
				return outgoing != null && !outgoing.isEmpty();
			case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__IN_GROUP :
				return isSetInGroups();
			case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__IN_PARTITION :
				List inPartition = (List) eVirtualGet(UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__IN_PARTITION);
				return inPartition != null && !inPartition.isEmpty();
			case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__IN_STRUCTURED_NODE :
				return getInStructuredNode() != null;
			case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__ACTIVITY :
				return getActivity() != null;
			case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__INCOMING :
				List incoming = (List) eVirtualGet(UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__INCOMING);
				return incoming != null && !incoming.isEmpty();
			case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__IN_INTERRUPTIBLE_REGION :
				List inInterruptibleRegion = (List) eVirtualGet(UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__IN_INTERRUPTIBLE_REGION);
				return inInterruptibleRegion != null
					&& !inInterruptibleRegion.isEmpty();
			case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__REDEFINED_NODE :
				List redefinedNode = (List) eVirtualGet(UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__REDEFINED_NODE);
				return redefinedNode != null && !redefinedNode.isEmpty();
			case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__HANDLER :
				List handler = (List) eVirtualGet(UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__HANDLER);
				return handler != null && !handler.isEmpty();
			case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__OUTPUT :
				return isSetOutputs();
			case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__INPUT :
				return isSetInputs();
			case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__CONTEXT :
				return getContext() != null;
			case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__LOCAL_PRECONDITION :
				List localPrecondition = (List) eVirtualGet(UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__LOCAL_PRECONDITION);
				return localPrecondition != null
					&& !localPrecondition.isEmpty();
			case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__LOCAL_POSTCONDITION :
				List localPostcondition = (List) eVirtualGet(UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__LOCAL_POSTCONDITION);
				return localPostcondition != null
					&& !localPostcondition.isEmpty();
			case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__OBJECT :
				return eVirtualGet(UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__OBJECT) != null;
			case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__RESULT :
				return eVirtualGet(UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__RESULT) != null;
			case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__QUALIFIER :
				return eVirtualGet(UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__QUALIFIER) != null;
		}
		return eDynamicIsSet(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInputs() {
		return super.isSetInputs()
			|| eIsSet(UMLPackage.eINSTANCE
				.getReadLinkObjectEndQualifierAction_Object());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOutputs() {
		return super.isSetOutputs()
			|| eIsSet(UMLPackage.eINSTANCE
				.getReadLinkObjectEndQualifierAction_Result());
	}

} //ReadLinkObjectEndQualifierActionImpl
