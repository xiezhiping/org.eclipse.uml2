/*
 * Copyright (c) 2005, 2016 IBM Corporation, Embarcadero Technologies, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (Embarcadero Technologies) - 204200
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
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;
import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.ActivityEdge;
import org.eclipse.uml2.uml.ActivityNode;
import org.eclipse.uml2.uml.ActivityPartition;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.InterruptibleActivityRegion;
import org.eclipse.uml2.uml.MultiplicityElement;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.ObjectNodeOrderingKind;
import org.eclipse.uml2.uml.RedefinableElement;
import org.eclipse.uml2.uml.State;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.StructuredActivityNode;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.ValuePin;
import org.eclipse.uml2.uml.ValueSpecification;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.ValuePinOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Pin</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ValuePinImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ValuePinImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValuePinImpl
		extends InputPinImpl
		implements ValuePin {

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected ValueSpecification value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValuePinImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.VALUE_PIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Element> getOwnedElements() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			@SuppressWarnings("unchecked")
			EList<Element> ownedElements = (EList<Element>) cache.get(eResource,
				this, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
			if (ownedElements == null) {
				cache.put(eResource, this,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT,
					ownedElements = new DerivedUnionEObjectEList<Element>(
						Element.class, this,
						UMLPackage.VALUE_PIN__OWNED_ELEMENT,
						OWNED_ELEMENT_ESUBSETS));
			}
			return ownedElements;
		}
		return new DerivedUnionEObjectEList<Element>(Element.class, this,
			UMLPackage.VALUE_PIN__OWNED_ELEMENT, OWNED_ELEMENT_ESUBSETS);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getOwnedElements() <em>Owned Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedElements()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_ELEMENT_ESUBSETS = new int[]{
		UMLPackage.VALUE_PIN__OWNED_COMMENT,
		UMLPackage.VALUE_PIN__NAME_EXPRESSION,
		UMLPackage.VALUE_PIN__UPPER_BOUND, UMLPackage.VALUE_PIN__LOWER_VALUE,
		UMLPackage.VALUE_PIN__UPPER_VALUE, UMLPackage.VALUE_PIN__VALUE};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getValue() {
		if (value != null && value.eIsProxy()) {
			InternalEObject oldValue = (InternalEObject) value;
			value = (ValueSpecification) eResolveProxy(oldValue);
			if (value != oldValue) {
				InternalEObject newValue = (InternalEObject) value;
				NotificationChain msgs = oldValue.eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE - UMLPackage.VALUE_PIN__VALUE, null,
					null);
				if (newValue.eInternalContainer() == null) {
					msgs = newValue.eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - UMLPackage.VALUE_PIN__VALUE,
						null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.VALUE_PIN__VALUE, oldValue, value));
			}
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification basicGetValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue(ValueSpecification newValue,
			NotificationChain msgs) {
		ValueSpecification oldValue = value;
		value = newValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET, UMLPackage.VALUE_PIN__VALUE, oldValue,
				newValue);
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
	public void setValue(ValueSpecification newValue) {
		if (newValue != value) {
			NotificationChain msgs = null;
			if (value != null)
				msgs = ((InternalEObject) value).eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE - UMLPackage.VALUE_PIN__VALUE, null,
					msgs);
			if (newValue != null)
				msgs = ((InternalEObject) newValue).eInverseAdd(this,
					EOPPOSITE_FEATURE_BASE - UMLPackage.VALUE_PIN__VALUE, null,
					msgs);
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.VALUE_PIN__VALUE, newValue, newValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification createValue(String name, Type type,
			EClass eClass) {
		ValueSpecification newValue = (ValueSpecification) create(eClass);
		setValue(newValue);
		if (name != null)
			newValue.setName(name);
		if (type != null)
			newValue.setType(type);
		return newValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompatibleType(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ValuePinOperations.validateCompatibleType(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNoIncomingEdges(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ValuePinOperations.validateNoIncomingEdges(this, diagnostics,
			context);
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
			case UMLPackage.VALUE_PIN__EANNOTATIONS :
				return ((InternalEList<?>) getEAnnotations())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.VALUE_PIN__OWNED_COMMENT :
				return ((InternalEList<?>) getOwnedComments())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.VALUE_PIN__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.VALUE_PIN__IN_INTERRUPTIBLE_REGION :
				return ((InternalEList<?>) getInInterruptibleRegions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.VALUE_PIN__IN_STRUCTURED_NODE :
				return basicSetInStructuredNode(null, msgs);
			case UMLPackage.VALUE_PIN__INCOMING :
				return ((InternalEList<?>) getIncomings()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.VALUE_PIN__OUTGOING :
				return ((InternalEList<?>) getOutgoings()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.VALUE_PIN__IN_PARTITION :
				return ((InternalEList<?>) getInPartitions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.VALUE_PIN__UPPER_BOUND :
				return basicSetUpperBound(null, msgs);
			case UMLPackage.VALUE_PIN__LOWER_VALUE :
				return basicSetLowerValue(null, msgs);
			case UMLPackage.VALUE_PIN__UPPER_VALUE :
				return basicSetUpperValue(null, msgs);
			case UMLPackage.VALUE_PIN__VALUE :
				return basicSetValue(null, msgs);
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
			case UMLPackage.VALUE_PIN__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.VALUE_PIN__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.VALUE_PIN__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.VALUE_PIN__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.VALUE_PIN__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.VALUE_PIN__NAME :
				return getName();
			case UMLPackage.VALUE_PIN__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.VALUE_PIN__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.VALUE_PIN__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.VALUE_PIN__VISIBILITY :
				return getVisibility();
			case UMLPackage.VALUE_PIN__IS_LEAF :
				return isLeaf();
			case UMLPackage.VALUE_PIN__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.VALUE_PIN__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.VALUE_PIN__ACTIVITY :
				if (resolve)
					return getActivity();
				return basicGetActivity();
			case UMLPackage.VALUE_PIN__IN_GROUP :
				return getInGroups();
			case UMLPackage.VALUE_PIN__IN_INTERRUPTIBLE_REGION :
				return getInInterruptibleRegions();
			case UMLPackage.VALUE_PIN__IN_STRUCTURED_NODE :
				if (resolve)
					return getInStructuredNode();
				return basicGetInStructuredNode();
			case UMLPackage.VALUE_PIN__INCOMING :
				return getIncomings();
			case UMLPackage.VALUE_PIN__OUTGOING :
				return getOutgoings();
			case UMLPackage.VALUE_PIN__REDEFINED_NODE :
				return getRedefinedNodes();
			case UMLPackage.VALUE_PIN__IN_PARTITION :
				return getInPartitions();
			case UMLPackage.VALUE_PIN__TYPE :
				if (resolve)
					return getType();
				return basicGetType();
			case UMLPackage.VALUE_PIN__IN_STATE :
				return getInStates();
			case UMLPackage.VALUE_PIN__IS_CONTROL_TYPE :
				return isControlType();
			case UMLPackage.VALUE_PIN__ORDERING :
				return getOrdering();
			case UMLPackage.VALUE_PIN__SELECTION :
				if (resolve)
					return getSelection();
				return basicGetSelection();
			case UMLPackage.VALUE_PIN__UPPER_BOUND :
				if (resolve)
					return getUpperBound();
				return basicGetUpperBound();
			case UMLPackage.VALUE_PIN__IS_ORDERED :
				return isOrdered();
			case UMLPackage.VALUE_PIN__IS_UNIQUE :
				return isUnique();
			case UMLPackage.VALUE_PIN__LOWER :
				return getLower();
			case UMLPackage.VALUE_PIN__LOWER_VALUE :
				if (resolve)
					return getLowerValue();
				return basicGetLowerValue();
			case UMLPackage.VALUE_PIN__UPPER :
				return getUpper();
			case UMLPackage.VALUE_PIN__UPPER_VALUE :
				if (resolve)
					return getUpperValue();
				return basicGetUpperValue();
			case UMLPackage.VALUE_PIN__IS_CONTROL :
				return isControl();
			case UMLPackage.VALUE_PIN__VALUE :
				if (resolve)
					return getValue();
				return basicGetValue();
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
			case UMLPackage.VALUE_PIN__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations()
					.addAll((Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.VALUE_PIN__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments()
					.addAll((Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.VALUE_PIN__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.VALUE_PIN__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.VALUE_PIN__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.VALUE_PIN__IS_LEAF :
				setIsLeaf((Boolean) newValue);
				return;
			case UMLPackage.VALUE_PIN__ACTIVITY :
				setActivity((Activity) newValue);
				return;
			case UMLPackage.VALUE_PIN__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				getInInterruptibleRegions().addAll(
					(Collection<? extends InterruptibleActivityRegion>) newValue);
				return;
			case UMLPackage.VALUE_PIN__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) newValue);
				return;
			case UMLPackage.VALUE_PIN__INCOMING :
				getIncomings().clear();
				getIncomings()
					.addAll((Collection<? extends ActivityEdge>) newValue);
				return;
			case UMLPackage.VALUE_PIN__OUTGOING :
				getOutgoings().clear();
				getOutgoings()
					.addAll((Collection<? extends ActivityEdge>) newValue);
				return;
			case UMLPackage.VALUE_PIN__REDEFINED_NODE :
				getRedefinedNodes().clear();
				getRedefinedNodes()
					.addAll((Collection<? extends ActivityNode>) newValue);
				return;
			case UMLPackage.VALUE_PIN__IN_PARTITION :
				getInPartitions().clear();
				getInPartitions()
					.addAll((Collection<? extends ActivityPartition>) newValue);
				return;
			case UMLPackage.VALUE_PIN__TYPE :
				setType((Type) newValue);
				return;
			case UMLPackage.VALUE_PIN__IN_STATE :
				getInStates().clear();
				getInStates().addAll((Collection<? extends State>) newValue);
				return;
			case UMLPackage.VALUE_PIN__IS_CONTROL_TYPE :
				setIsControlType((Boolean) newValue);
				return;
			case UMLPackage.VALUE_PIN__ORDERING :
				setOrdering((ObjectNodeOrderingKind) newValue);
				return;
			case UMLPackage.VALUE_PIN__SELECTION :
				setSelection((Behavior) newValue);
				return;
			case UMLPackage.VALUE_PIN__UPPER_BOUND :
				setUpperBound((ValueSpecification) newValue);
				return;
			case UMLPackage.VALUE_PIN__IS_ORDERED :
				setIsOrdered((Boolean) newValue);
				return;
			case UMLPackage.VALUE_PIN__IS_UNIQUE :
				setIsUnique((Boolean) newValue);
				return;
			case UMLPackage.VALUE_PIN__LOWER :
				setLower((Integer) newValue);
				return;
			case UMLPackage.VALUE_PIN__LOWER_VALUE :
				setLowerValue((ValueSpecification) newValue);
				return;
			case UMLPackage.VALUE_PIN__UPPER :
				setUpper((Integer) newValue);
				return;
			case UMLPackage.VALUE_PIN__UPPER_VALUE :
				setUpperValue((ValueSpecification) newValue);
				return;
			case UMLPackage.VALUE_PIN__IS_CONTROL :
				setIsControl((Boolean) newValue);
				return;
			case UMLPackage.VALUE_PIN__VALUE :
				setValue((ValueSpecification) newValue);
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
			case UMLPackage.VALUE_PIN__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.VALUE_PIN__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.VALUE_PIN__NAME :
				unsetName();
				return;
			case UMLPackage.VALUE_PIN__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.VALUE_PIN__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.VALUE_PIN__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.VALUE_PIN__ACTIVITY :
				setActivity((Activity) null);
				return;
			case UMLPackage.VALUE_PIN__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				return;
			case UMLPackage.VALUE_PIN__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) null);
				return;
			case UMLPackage.VALUE_PIN__INCOMING :
				getIncomings().clear();
				return;
			case UMLPackage.VALUE_PIN__OUTGOING :
				getOutgoings().clear();
				return;
			case UMLPackage.VALUE_PIN__REDEFINED_NODE :
				getRedefinedNodes().clear();
				return;
			case UMLPackage.VALUE_PIN__IN_PARTITION :
				getInPartitions().clear();
				return;
			case UMLPackage.VALUE_PIN__TYPE :
				setType((Type) null);
				return;
			case UMLPackage.VALUE_PIN__IN_STATE :
				getInStates().clear();
				return;
			case UMLPackage.VALUE_PIN__IS_CONTROL_TYPE :
				setIsControlType(IS_CONTROL_TYPE_EDEFAULT);
				return;
			case UMLPackage.VALUE_PIN__ORDERING :
				setOrdering(ORDERING_EDEFAULT);
				return;
			case UMLPackage.VALUE_PIN__SELECTION :
				setSelection((Behavior) null);
				return;
			case UMLPackage.VALUE_PIN__UPPER_BOUND :
				setUpperBound((ValueSpecification) null);
				return;
			case UMLPackage.VALUE_PIN__IS_ORDERED :
				setIsOrdered(IS_ORDERED_EDEFAULT);
				return;
			case UMLPackage.VALUE_PIN__IS_UNIQUE :
				setIsUnique(IS_UNIQUE_EDEFAULT);
				return;
			case UMLPackage.VALUE_PIN__LOWER :
				setLower(LOWER_EDEFAULT);
				return;
			case UMLPackage.VALUE_PIN__LOWER_VALUE :
				setLowerValue((ValueSpecification) null);
				return;
			case UMLPackage.VALUE_PIN__UPPER :
				setUpper(UPPER_EDEFAULT);
				return;
			case UMLPackage.VALUE_PIN__UPPER_VALUE :
				setUpperValue((ValueSpecification) null);
				return;
			case UMLPackage.VALUE_PIN__IS_CONTROL :
				setIsControl(IS_CONTROL_EDEFAULT);
				return;
			case UMLPackage.VALUE_PIN__VALUE :
				setValue((ValueSpecification) null);
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
			case UMLPackage.VALUE_PIN__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.VALUE_PIN__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.VALUE_PIN__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.VALUE_PIN__OWNER :
				return isSetOwner();
			case UMLPackage.VALUE_PIN__CLIENT_DEPENDENCY :
				return !getClientDependencies().isEmpty();
			case UMLPackage.VALUE_PIN__NAME :
				return isSetName();
			case UMLPackage.VALUE_PIN__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.VALUE_PIN__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.VALUE_PIN__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.VALUE_PIN__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.VALUE_PIN__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.VALUE_PIN__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.VALUE_PIN__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.VALUE_PIN__ACTIVITY :
				return basicGetActivity() != null;
			case UMLPackage.VALUE_PIN__IN_GROUP :
				return isSetInGroups();
			case UMLPackage.VALUE_PIN__IN_INTERRUPTIBLE_REGION :
				return inInterruptibleRegions != null
					&& !inInterruptibleRegions.isEmpty();
			case UMLPackage.VALUE_PIN__IN_STRUCTURED_NODE :
				return basicGetInStructuredNode() != null;
			case UMLPackage.VALUE_PIN__INCOMING :
				return incomings != null && !incomings.isEmpty();
			case UMLPackage.VALUE_PIN__OUTGOING :
				return outgoings != null && !outgoings.isEmpty();
			case UMLPackage.VALUE_PIN__REDEFINED_NODE :
				return redefinedNodes != null && !redefinedNodes.isEmpty();
			case UMLPackage.VALUE_PIN__IN_PARTITION :
				return inPartitions != null && !inPartitions.isEmpty();
			case UMLPackage.VALUE_PIN__TYPE :
				return type != null;
			case UMLPackage.VALUE_PIN__IN_STATE :
				return inStates != null && !inStates.isEmpty();
			case UMLPackage.VALUE_PIN__IS_CONTROL_TYPE :
				return ((eFlags
					& IS_CONTROL_TYPE_EFLAG) != 0) != IS_CONTROL_TYPE_EDEFAULT;
			case UMLPackage.VALUE_PIN__ORDERING :
				return (eFlags & ORDERING_EFLAG) != ORDERING_EFLAG_DEFAULT;
			case UMLPackage.VALUE_PIN__SELECTION :
				return selection != null;
			case UMLPackage.VALUE_PIN__UPPER_BOUND :
				return upperBound != null;
			case UMLPackage.VALUE_PIN__IS_ORDERED :
				return ((eFlags
					& IS_ORDERED_EFLAG) != 0) != IS_ORDERED_EDEFAULT;
			case UMLPackage.VALUE_PIN__IS_UNIQUE :
				return ((eFlags & IS_UNIQUE_EFLAG) != 0) != IS_UNIQUE_EDEFAULT;
			case UMLPackage.VALUE_PIN__LOWER :
				return getLower() != LOWER_EDEFAULT;
			case UMLPackage.VALUE_PIN__LOWER_VALUE :
				return lowerValue != null;
			case UMLPackage.VALUE_PIN__UPPER :
				return getUpper() != UPPER_EDEFAULT;
			case UMLPackage.VALUE_PIN__UPPER_VALUE :
				return upperValue != null;
			case UMLPackage.VALUE_PIN__IS_CONTROL :
				return ((eFlags
					& IS_CONTROL_EFLAG) != 0) != IS_CONTROL_EDEFAULT;
			case UMLPackage.VALUE_PIN__VALUE :
				return value != null;
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
			case UMLPackage.VALUE_PIN___GET_EANNOTATION__STRING :
				return getEAnnotation((String) arguments.get(0));
			case UMLPackage.VALUE_PIN___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP :
				return validateHasOwner((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.VALUE_PIN___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP :
				return validateNotOwnSelf((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.VALUE_PIN___ADD_KEYWORD__STRING :
				return addKeyword((String) arguments.get(0));
			case UMLPackage.VALUE_PIN___APPLY_STEREOTYPE__STEREOTYPE :
				return applyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.VALUE_PIN___CREATE_EANNOTATION__STRING :
				return createEAnnotation((String) arguments.get(0));
			case UMLPackage.VALUE_PIN___DESTROY :
				destroy();
				return null;
			case UMLPackage.VALUE_PIN___GET_KEYWORDS :
				return getKeywords();
			case UMLPackage.VALUE_PIN___GET_APPLICABLE_STEREOTYPE__STRING :
				return getApplicableStereotype((String) arguments.get(0));
			case UMLPackage.VALUE_PIN___GET_APPLICABLE_STEREOTYPES :
				return getApplicableStereotypes();
			case UMLPackage.VALUE_PIN___GET_APPLIED_STEREOTYPE__STRING :
				return getAppliedStereotype((String) arguments.get(0));
			case UMLPackage.VALUE_PIN___GET_APPLIED_STEREOTYPES :
				return getAppliedStereotypes();
			case UMLPackage.VALUE_PIN___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING :
				return getAppliedSubstereotype((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.VALUE_PIN___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE :
				return getAppliedSubstereotypes((Stereotype) arguments.get(0));
			case UMLPackage.VALUE_PIN___GET_MODEL :
				return getModel();
			case UMLPackage.VALUE_PIN___GET_NEAREST_PACKAGE :
				return getNearestPackage();
			case UMLPackage.VALUE_PIN___GET_RELATIONSHIPS :
				return getRelationships();
			case UMLPackage.VALUE_PIN___GET_RELATIONSHIPS__ECLASS :
				return getRelationships((EClass) arguments.get(0));
			case UMLPackage.VALUE_PIN___GET_REQUIRED_STEREOTYPE__STRING :
				return getRequiredStereotype((String) arguments.get(0));
			case UMLPackage.VALUE_PIN___GET_REQUIRED_STEREOTYPES :
				return getRequiredStereotypes();
			case UMLPackage.VALUE_PIN___GET_SOURCE_DIRECTED_RELATIONSHIPS :
				return getSourceDirectedRelationships();
			case UMLPackage.VALUE_PIN___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS :
				return getSourceDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.VALUE_PIN___GET_STEREOTYPE_APPLICATION__STEREOTYPE :
				return getStereotypeApplication((Stereotype) arguments.get(0));
			case UMLPackage.VALUE_PIN___GET_STEREOTYPE_APPLICATIONS :
				return getStereotypeApplications();
			case UMLPackage.VALUE_PIN___GET_TARGET_DIRECTED_RELATIONSHIPS :
				return getTargetDirectedRelationships();
			case UMLPackage.VALUE_PIN___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS :
				return getTargetDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.VALUE_PIN___GET_VALUE__STEREOTYPE_STRING :
				return getValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.VALUE_PIN___HAS_KEYWORD__STRING :
				return hasKeyword((String) arguments.get(0));
			case UMLPackage.VALUE_PIN___HAS_VALUE__STEREOTYPE_STRING :
				return hasValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.VALUE_PIN___IS_STEREOTYPE_APPLICABLE__STEREOTYPE :
				return isStereotypeApplicable((Stereotype) arguments.get(0));
			case UMLPackage.VALUE_PIN___IS_STEREOTYPE_APPLIED__STEREOTYPE :
				return isStereotypeApplied((Stereotype) arguments.get(0));
			case UMLPackage.VALUE_PIN___IS_STEREOTYPE_REQUIRED__STEREOTYPE :
				return isStereotypeRequired((Stereotype) arguments.get(0));
			case UMLPackage.VALUE_PIN___REMOVE_KEYWORD__STRING :
				return removeKeyword((String) arguments.get(0));
			case UMLPackage.VALUE_PIN___SET_VALUE__STEREOTYPE_STRING_OBJECT :
				setValue((Stereotype) arguments.get(0),
					(String) arguments.get(1), arguments.get(2));
				return null;
			case UMLPackage.VALUE_PIN___UNAPPLY_STEREOTYPE__STEREOTYPE :
				return unapplyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.VALUE_PIN___ALL_OWNED_ELEMENTS :
				return allOwnedElements();
			case UMLPackage.VALUE_PIN___MUST_BE_OWNED :
				return mustBeOwned();
			case UMLPackage.VALUE_PIN___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP :
				return validateVisibilityNeedsOwnership(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.VALUE_PIN___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.VALUE_PIN___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasNoQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.VALUE_PIN___CREATE_DEPENDENCY__NAMEDELEMENT :
				return createDependency((NamedElement) arguments.get(0));
			case UMLPackage.VALUE_PIN___CREATE_USAGE__NAMEDELEMENT :
				return createUsage((NamedElement) arguments.get(0));
			case UMLPackage.VALUE_PIN___GET_LABEL :
				return getLabel();
			case UMLPackage.VALUE_PIN___GET_LABEL__BOOLEAN :
				return getLabel((Boolean) arguments.get(0));
			case UMLPackage.VALUE_PIN___GET_NAMESPACE :
				return getNamespace();
			case UMLPackage.VALUE_PIN___ALL_NAMESPACES :
				return allNamespaces();
			case UMLPackage.VALUE_PIN___ALL_OWNING_PACKAGES :
				return allOwningPackages();
			case UMLPackage.VALUE_PIN___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE :
				return isDistinguishableFrom((NamedElement) arguments.get(0),
					(Namespace) arguments.get(1));
			case UMLPackage.VALUE_PIN___GET_QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.VALUE_PIN___SEPARATOR :
				return separator();
			case UMLPackage.VALUE_PIN___GET_CLIENT_DEPENDENCIES :
				return getClientDependencies();
			case UMLPackage.VALUE_PIN___VALIDATE_REDEFINITION_CONSISTENT__DIAGNOSTICCHAIN_MAP :
				return validateRedefinitionConsistent(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.VALUE_PIN___VALIDATE_NON_LEAF_REDEFINITION__DIAGNOSTICCHAIN_MAP :
				return validateNonLeafRedefinition(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.VALUE_PIN___VALIDATE_REDEFINITION_CONTEXT_VALID__DIAGNOSTICCHAIN_MAP :
				return validateRedefinitionContextValid(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.VALUE_PIN___IS_CONSISTENT_WITH__REDEFINABLEELEMENT :
				return isConsistentWith((RedefinableElement) arguments.get(0));
			case UMLPackage.VALUE_PIN___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT :
				return isRedefinitionContextValid(
					(RedefinableElement) arguments.get(0));
			case UMLPackage.VALUE_PIN___CONTAINING_ACTIVITY :
				return containingActivity();
			case UMLPackage.VALUE_PIN___VALIDATE_INPUT_OUTPUT_PARAMETER__DIAGNOSTICCHAIN_MAP :
				return validateInputOutputParameter(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.VALUE_PIN___VALIDATE_SELECTION_BEHAVIOR__DIAGNOSTICCHAIN_MAP :
				return validateSelectionBehavior(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.VALUE_PIN___VALIDATE_OBJECT_FLOW_EDGES__DIAGNOSTICCHAIN_MAP :
				return validateObjectFlowEdges(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.VALUE_PIN___VALIDATE_UPPER_GE_LOWER__DIAGNOSTICCHAIN_MAP :
				return validateUpperGeLower((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.VALUE_PIN___VALIDATE_LOWER_GE0__DIAGNOSTICCHAIN_MAP :
				return validateLowerGe0((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.VALUE_PIN___VALIDATE_VALUE_SPECIFICATION_NO_SIDE_EFFECTS__DIAGNOSTICCHAIN_MAP :
				return validateValueSpecificationNoSideEffects(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.VALUE_PIN___VALIDATE_VALUE_SPECIFICATION_CONSTANT__DIAGNOSTICCHAIN_MAP :
				return validateValueSpecificationConstant(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.VALUE_PIN___VALIDATE_LOWER_IS_INTEGER__DIAGNOSTICCHAIN_MAP :
				return validateLowerIsInteger(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.VALUE_PIN___VALIDATE_UPPER_IS_UNLIMITED_NATURAL__DIAGNOSTICCHAIN_MAP :
				return validateUpperIsUnlimitedNatural(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.VALUE_PIN___SET_LOWER__INT :
				setLower((Integer) arguments.get(0));
				return null;
			case UMLPackage.VALUE_PIN___SET_UPPER__INT :
				setUpper((Integer) arguments.get(0));
				return null;
			case UMLPackage.VALUE_PIN___COMPATIBLE_WITH__MULTIPLICITYELEMENT :
				return compatibleWith((MultiplicityElement) arguments.get(0));
			case UMLPackage.VALUE_PIN___INCLUDES_MULTIPLICITY__MULTIPLICITYELEMENT :
				return includesMultiplicity(
					(MultiplicityElement) arguments.get(0));
			case UMLPackage.VALUE_PIN___IS__INT_INT :
				return is((Integer) arguments.get(0),
					(Integer) arguments.get(1));
			case UMLPackage.VALUE_PIN___IS_MULTIVALUED :
				return isMultivalued();
			case UMLPackage.VALUE_PIN___GET_LOWER :
				return getLower();
			case UMLPackage.VALUE_PIN___LOWER_BOUND :
				return lowerBound();
			case UMLPackage.VALUE_PIN___GET_UPPER :
				return getUpper();
			case UMLPackage.VALUE_PIN___UPPER_BOUND :
				return upperBound();
			case UMLPackage.VALUE_PIN___VALIDATE_CONTROL_PINS__DIAGNOSTICCHAIN_MAP :
				return validateControlPins((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.VALUE_PIN___VALIDATE_NOT_UNIQUE__DIAGNOSTICCHAIN_MAP :
				return validateNotUnique((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.VALUE_PIN___VALIDATE_OUTGOING_EDGES_STRUCTURED_ONLY__DIAGNOSTICCHAIN_MAP :
				return validateOutgoingEdgesStructuredOnly(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.VALUE_PIN___VALIDATE_NO_INCOMING_EDGES__DIAGNOSTICCHAIN_MAP :
				return validateNoIncomingEdges(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.VALUE_PIN___VALIDATE_COMPATIBLE_TYPE__DIAGNOSTICCHAIN_MAP :
				return validateCompatibleType(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		}
		return eDynamicInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| eIsSet(UMLPackage.VALUE_PIN__VALUE);
	}

} //ValuePinImpl
