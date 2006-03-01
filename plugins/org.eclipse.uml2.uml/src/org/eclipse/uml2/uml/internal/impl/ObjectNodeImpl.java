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
 * $Id: ObjectNodeImpl.java,v 1.15 2006/03/01 17:56:37 khussey Exp $
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
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.ObjectNode;
import org.eclipse.uml2.uml.ObjectNodeOrderingKind;
import org.eclipse.uml2.uml.State;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.StructuredActivityNode;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.TypedElement;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.ValueSpecification;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.ObjectNodeOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ObjectNodeImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ObjectNodeImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ObjectNodeImpl#getOrdering <em>Ordering</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ObjectNodeImpl#isControlType <em>Is Control Type</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ObjectNodeImpl#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ObjectNodeImpl#getInStates <em>In State</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ObjectNodeImpl#getSelection <em>Selection</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ObjectNodeImpl
		extends ActivityNodeImpl
		implements ObjectNode {

	/**
	 * The default value of the '{@link #getOrdering() <em>Ordering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrdering()
	 * @generated
	 * @ordered
	 */
	protected static final ObjectNodeOrderingKind ORDERING_EDEFAULT = ObjectNodeOrderingKind.FIFO_LITERAL;

	/**
	 * The default value of the '{@link #isControlType() <em>Is Control Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isControlType()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_CONTROL_TYPE_EDEFAULT = false;

	/**
	 * The flag representing the value of the '{@link #isControlType() <em>Is Control Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isControlType()
	 * @generated
	 * @ordered
	 */
	protected static final int IS_CONTROL_TYPE_EFLAG = 1 << 9;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.Literals.OBJECT_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getType() {
		Type type = (Type) eVirtualGet(UMLPackage.OBJECT_NODE__TYPE);
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject) type;
			type = (Type) eResolveProxy(oldType);
			if (type != oldType) {
				eVirtualSet(UMLPackage.OBJECT_NODE__TYPE, type);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.OBJECT_NODE__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetType() {
		return (Type) eVirtualGet(UMLPackage.OBJECT_NODE__TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Type newType) {
		Type type = newType;
		Object oldType = eVirtualSet(UMLPackage.OBJECT_NODE__TYPE, type);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.OBJECT_NODE__TYPE, oldType == EVIRTUAL_NO_VALUE
					? null
					: oldType, type));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedElements() {
		EList ownedElement = (EList) eVirtualGet(UMLPackage.OBJECT_NODE__OWNED_ELEMENT);
		if (ownedElement == null) {
			eVirtualSet(UMLPackage.OBJECT_NODE__OWNED_ELEMENT,
				ownedElement = new DerivedUnionEObjectEList(Element.class,
					this, UMLPackage.OBJECT_NODE__OWNED_ELEMENT, new int[]{
						UMLPackage.OBJECT_NODE__OWNED_COMMENT,
						UMLPackage.OBJECT_NODE__NAME_EXPRESSION,
						UMLPackage.OBJECT_NODE__UPPER_BOUND}));
		}
		return ownedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectNodeOrderingKind getOrdering() {
		return (ObjectNodeOrderingKind) eVirtualGet(
			UMLPackage.OBJECT_NODE__ORDERING, ORDERING_EDEFAULT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrdering(ObjectNodeOrderingKind newOrdering) {
		ObjectNodeOrderingKind ordering = newOrdering == null
			? ORDERING_EDEFAULT
			: newOrdering;
		Object oldOrdering = eVirtualSet(UMLPackage.OBJECT_NODE__ORDERING,
			ordering);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.OBJECT_NODE__ORDERING,
				oldOrdering == EVIRTUAL_NO_VALUE
					? ORDERING_EDEFAULT
					: oldOrdering, ordering));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isControlType() {
		return (eFlags & IS_CONTROL_TYPE_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsControlType(boolean newIsControlType) {
		boolean oldIsControlType = (eFlags & IS_CONTROL_TYPE_EFLAG) != 0;
		if (newIsControlType)
			eFlags |= IS_CONTROL_TYPE_EFLAG;
		else
			eFlags &= ~IS_CONTROL_TYPE_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.OBJECT_NODE__IS_CONTROL_TYPE, oldIsControlType,
				newIsControlType));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getUpperBound() {
		ValueSpecification upperBound = (ValueSpecification) eVirtualGet(UMLPackage.OBJECT_NODE__UPPER_BOUND);
		if (upperBound != null && upperBound.eIsProxy()) {
			InternalEObject oldUpperBound = (InternalEObject) upperBound;
			upperBound = (ValueSpecification) eResolveProxy(oldUpperBound);
			if (upperBound != oldUpperBound) {
				InternalEObject newUpperBound = (InternalEObject) upperBound;
				NotificationChain msgs = oldUpperBound.eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.OBJECT_NODE__UPPER_BOUND, null, null);
				if (newUpperBound.eInternalContainer() == null) {
					msgs = newUpperBound.eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
							- UMLPackage.OBJECT_NODE__UPPER_BOUND, null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.OBJECT_NODE__UPPER_BOUND, oldUpperBound,
						upperBound));
			}
		}
		return upperBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification basicGetUpperBound() {
		return (ValueSpecification) eVirtualGet(UMLPackage.OBJECT_NODE__UPPER_BOUND);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpperBound(
			ValueSpecification newUpperBound, NotificationChain msgs) {
		Object oldUpperBound = eVirtualSet(UMLPackage.OBJECT_NODE__UPPER_BOUND,
			newUpperBound);
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET, UMLPackage.OBJECT_NODE__UPPER_BOUND,
				oldUpperBound == EVIRTUAL_NO_VALUE
					? null
					: oldUpperBound, newUpperBound);
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
	public void setUpperBound(ValueSpecification newUpperBound) {
		ValueSpecification upperBound = (ValueSpecification) eVirtualGet(UMLPackage.OBJECT_NODE__UPPER_BOUND);
		if (newUpperBound != upperBound) {
			NotificationChain msgs = null;
			if (upperBound != null)
				msgs = ((InternalEObject) upperBound).eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.OBJECT_NODE__UPPER_BOUND, null, msgs);
			if (newUpperBound != null)
				msgs = ((InternalEObject) newUpperBound).eInverseAdd(this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.OBJECT_NODE__UPPER_BOUND, null, msgs);
			msgs = basicSetUpperBound(newUpperBound, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.OBJECT_NODE__UPPER_BOUND, newUpperBound,
				newUpperBound));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification createUpperBound(String name, Type type,
			EClass eClass) {
		ValueSpecification newUpperBound = (ValueSpecification) EcoreUtil
			.create(eClass);
		if (name != null)
			newUpperBound.setName(name);
		if (type != null)
			newUpperBound.setType(type);
		setUpperBound(newUpperBound);
		return newUpperBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getInStates() {
		EList inState = (EList) eVirtualGet(UMLPackage.OBJECT_NODE__IN_STATE);
		if (inState == null) {
			eVirtualSet(UMLPackage.OBJECT_NODE__IN_STATE,
				inState = new EObjectResolvingEList(State.class, this,
					UMLPackage.OBJECT_NODE__IN_STATE));
		}
		return inState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getInState(String name) {
		return getInState(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getInState(String name, boolean ignoreCase, EClass eClass) {
		inStateLoop : for (Iterator i = getInStates().iterator(); i.hasNext();) {
			State inState = (State) i.next();
			if (eClass != null && !eClass.isInstance(inState))
				continue inStateLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(inState.getName())
				: name.equals(inState.getName())))
				continue inStateLoop;
			return inState;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior getSelection() {
		Behavior selection = (Behavior) eVirtualGet(UMLPackage.OBJECT_NODE__SELECTION);
		if (selection != null && selection.eIsProxy()) {
			InternalEObject oldSelection = (InternalEObject) selection;
			selection = (Behavior) eResolveProxy(oldSelection);
			if (selection != oldSelection) {
				eVirtualSet(UMLPackage.OBJECT_NODE__SELECTION, selection);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.OBJECT_NODE__SELECTION, oldSelection,
						selection));
			}
		}
		return selection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior basicGetSelection() {
		return (Behavior) eVirtualGet(UMLPackage.OBJECT_NODE__SELECTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelection(Behavior newSelection) {
		Behavior selection = newSelection;
		Object oldSelection = eVirtualSet(UMLPackage.OBJECT_NODE__SELECTION,
			selection);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.OBJECT_NODE__SELECTION,
				oldSelection == EVIRTUAL_NO_VALUE
					? null
					: oldSelection, selection));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectFlowEdges(DiagnosticChain diagnostics,
			Map context) {
		return ObjectNodeOperations.validateObjectFlowEdges(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNotUnique(DiagnosticChain diagnostics, Map context) {
		return ObjectNodeOperations.validateNotUnique(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSelectionBehavior(DiagnosticChain diagnostics,
			Map context) {
		return ObjectNodeOperations.validateSelectionBehavior(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInputOutputParameter(DiagnosticChain diagnostics,
			Map context) {
		return ObjectNodeOperations.validateInputOutputParameter(this,
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
			case UMLPackage.OBJECT_NODE__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.OBJECT_NODE__OWNED_COMMENT :
				return ((InternalEList) getOwnedComments()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.OBJECT_NODE__CLIENT_DEPENDENCY :
				return ((InternalEList) getClientDependencies()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.OBJECT_NODE__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.OBJECT_NODE__IN_STRUCTURED_NODE :
				return basicSetInStructuredNode(null, msgs);
			case UMLPackage.OBJECT_NODE__ACTIVITY :
				return basicSetActivity(null, msgs);
			case UMLPackage.OBJECT_NODE__OUTGOING :
				return ((InternalEList) getOutgoings()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.OBJECT_NODE__INCOMING :
				return ((InternalEList) getIncomings()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.OBJECT_NODE__IN_PARTITION :
				return ((InternalEList) getInPartitions()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.OBJECT_NODE__IN_INTERRUPTIBLE_REGION :
				return ((InternalEList) getInInterruptibleRegions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.OBJECT_NODE__UPPER_BOUND :
				return basicSetUpperBound(null, msgs);
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
			case UMLPackage.OBJECT_NODE__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.OBJECT_NODE__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.OBJECT_NODE__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.OBJECT_NODE__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.OBJECT_NODE__NAME :
				return getName();
			case UMLPackage.OBJECT_NODE__VISIBILITY :
				return getVisibility();
			case UMLPackage.OBJECT_NODE__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.OBJECT_NODE__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.OBJECT_NODE__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.OBJECT_NODE__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.OBJECT_NODE__IS_LEAF :
				return isLeaf()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.OBJECT_NODE__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.OBJECT_NODE__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.OBJECT_NODE__IN_STRUCTURED_NODE :
				return getInStructuredNode();
			case UMLPackage.OBJECT_NODE__ACTIVITY :
				return getActivity();
			case UMLPackage.OBJECT_NODE__OUTGOING :
				return getOutgoings();
			case UMLPackage.OBJECT_NODE__INCOMING :
				return getIncomings();
			case UMLPackage.OBJECT_NODE__IN_PARTITION :
				return getInPartitions();
			case UMLPackage.OBJECT_NODE__IN_INTERRUPTIBLE_REGION :
				return getInInterruptibleRegions();
			case UMLPackage.OBJECT_NODE__IN_GROUP :
				return getInGroups();
			case UMLPackage.OBJECT_NODE__REDEFINED_NODE :
				return getRedefinedNodes();
			case UMLPackage.OBJECT_NODE__TYPE :
				if (resolve)
					return getType();
				return basicGetType();
			case UMLPackage.OBJECT_NODE__ORDERING :
				return getOrdering();
			case UMLPackage.OBJECT_NODE__IS_CONTROL_TYPE :
				return isControlType()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.OBJECT_NODE__UPPER_BOUND :
				if (resolve)
					return getUpperBound();
				return basicGetUpperBound();
			case UMLPackage.OBJECT_NODE__IN_STATE :
				return getInStates();
			case UMLPackage.OBJECT_NODE__SELECTION :
				if (resolve)
					return getSelection();
				return basicGetSelection();
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
			case UMLPackage.OBJECT_NODE__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.OBJECT_NODE__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.OBJECT_NODE__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.OBJECT_NODE__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.OBJECT_NODE__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.OBJECT_NODE__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.OBJECT_NODE__IS_LEAF :
				setIsLeaf(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.OBJECT_NODE__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) newValue);
				return;
			case UMLPackage.OBJECT_NODE__ACTIVITY :
				setActivity((Activity) newValue);
				return;
			case UMLPackage.OBJECT_NODE__OUTGOING :
				getOutgoings().clear();
				getOutgoings().addAll((Collection) newValue);
				return;
			case UMLPackage.OBJECT_NODE__INCOMING :
				getIncomings().clear();
				getIncomings().addAll((Collection) newValue);
				return;
			case UMLPackage.OBJECT_NODE__IN_PARTITION :
				getInPartitions().clear();
				getInPartitions().addAll((Collection) newValue);
				return;
			case UMLPackage.OBJECT_NODE__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				getInInterruptibleRegions().addAll((Collection) newValue);
				return;
			case UMLPackage.OBJECT_NODE__REDEFINED_NODE :
				getRedefinedNodes().clear();
				getRedefinedNodes().addAll((Collection) newValue);
				return;
			case UMLPackage.OBJECT_NODE__TYPE :
				setType((Type) newValue);
				return;
			case UMLPackage.OBJECT_NODE__ORDERING :
				setOrdering((ObjectNodeOrderingKind) newValue);
				return;
			case UMLPackage.OBJECT_NODE__IS_CONTROL_TYPE :
				setIsControlType(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.OBJECT_NODE__UPPER_BOUND :
				setUpperBound((ValueSpecification) newValue);
				return;
			case UMLPackage.OBJECT_NODE__IN_STATE :
				getInStates().clear();
				getInStates().addAll((Collection) newValue);
				return;
			case UMLPackage.OBJECT_NODE__SELECTION :
				setSelection((Behavior) newValue);
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
			case UMLPackage.OBJECT_NODE__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.OBJECT_NODE__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.OBJECT_NODE__NAME :
				unsetName();
				return;
			case UMLPackage.OBJECT_NODE__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.OBJECT_NODE__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.OBJECT_NODE__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.OBJECT_NODE__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.OBJECT_NODE__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) null);
				return;
			case UMLPackage.OBJECT_NODE__ACTIVITY :
				setActivity((Activity) null);
				return;
			case UMLPackage.OBJECT_NODE__OUTGOING :
				getOutgoings().clear();
				return;
			case UMLPackage.OBJECT_NODE__INCOMING :
				getIncomings().clear();
				return;
			case UMLPackage.OBJECT_NODE__IN_PARTITION :
				getInPartitions().clear();
				return;
			case UMLPackage.OBJECT_NODE__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				return;
			case UMLPackage.OBJECT_NODE__REDEFINED_NODE :
				getRedefinedNodes().clear();
				return;
			case UMLPackage.OBJECT_NODE__TYPE :
				setType((Type) null);
				return;
			case UMLPackage.OBJECT_NODE__ORDERING :
				setOrdering(ORDERING_EDEFAULT);
				return;
			case UMLPackage.OBJECT_NODE__IS_CONTROL_TYPE :
				setIsControlType(IS_CONTROL_TYPE_EDEFAULT);
				return;
			case UMLPackage.OBJECT_NODE__UPPER_BOUND :
				setUpperBound((ValueSpecification) null);
				return;
			case UMLPackage.OBJECT_NODE__IN_STATE :
				getInStates().clear();
				return;
			case UMLPackage.OBJECT_NODE__SELECTION :
				setSelection((Behavior) null);
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
			case UMLPackage.OBJECT_NODE__EANNOTATIONS :
				EList eAnnotations = (EList) eVirtualGet(UMLPackage.OBJECT_NODE__EANNOTATIONS);
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.OBJECT_NODE__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.OBJECT_NODE__OWNER :
				return isSetOwner();
			case UMLPackage.OBJECT_NODE__OWNED_COMMENT :
				EList ownedComment = (EList) eVirtualGet(UMLPackage.OBJECT_NODE__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.OBJECT_NODE__NAME :
				return isSetName();
			case UMLPackage.OBJECT_NODE__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.OBJECT_NODE__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.OBJECT_NODE__CLIENT_DEPENDENCY :
				EList clientDependency = (EList) eVirtualGet(UMLPackage.OBJECT_NODE__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.OBJECT_NODE__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.OBJECT_NODE__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.OBJECT_NODE__NAME_EXPRESSION) != null;
			case UMLPackage.OBJECT_NODE__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.OBJECT_NODE__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.OBJECT_NODE__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.OBJECT_NODE__IN_STRUCTURED_NODE :
				return getInStructuredNode() != null;
			case UMLPackage.OBJECT_NODE__ACTIVITY :
				return getActivity() != null;
			case UMLPackage.OBJECT_NODE__OUTGOING :
				EList outgoing = (EList) eVirtualGet(UMLPackage.OBJECT_NODE__OUTGOING);
				return outgoing != null && !outgoing.isEmpty();
			case UMLPackage.OBJECT_NODE__INCOMING :
				EList incoming = (EList) eVirtualGet(UMLPackage.OBJECT_NODE__INCOMING);
				return incoming != null && !incoming.isEmpty();
			case UMLPackage.OBJECT_NODE__IN_PARTITION :
				EList inPartition = (EList) eVirtualGet(UMLPackage.OBJECT_NODE__IN_PARTITION);
				return inPartition != null && !inPartition.isEmpty();
			case UMLPackage.OBJECT_NODE__IN_INTERRUPTIBLE_REGION :
				EList inInterruptibleRegion = (EList) eVirtualGet(UMLPackage.OBJECT_NODE__IN_INTERRUPTIBLE_REGION);
				return inInterruptibleRegion != null
					&& !inInterruptibleRegion.isEmpty();
			case UMLPackage.OBJECT_NODE__IN_GROUP :
				return isSetInGroups();
			case UMLPackage.OBJECT_NODE__REDEFINED_NODE :
				EList redefinedNode = (EList) eVirtualGet(UMLPackage.OBJECT_NODE__REDEFINED_NODE);
				return redefinedNode != null && !redefinedNode.isEmpty();
			case UMLPackage.OBJECT_NODE__TYPE :
				return eVirtualGet(UMLPackage.OBJECT_NODE__TYPE) != null;
			case UMLPackage.OBJECT_NODE__ORDERING :
				return eVirtualGet(UMLPackage.OBJECT_NODE__ORDERING,
					ORDERING_EDEFAULT) != ORDERING_EDEFAULT;
			case UMLPackage.OBJECT_NODE__IS_CONTROL_TYPE :
				return ((eFlags & IS_CONTROL_TYPE_EFLAG) != 0) != IS_CONTROL_TYPE_EDEFAULT;
			case UMLPackage.OBJECT_NODE__UPPER_BOUND :
				return eVirtualGet(UMLPackage.OBJECT_NODE__UPPER_BOUND) != null;
			case UMLPackage.OBJECT_NODE__IN_STATE :
				EList inState = (EList) eVirtualGet(UMLPackage.OBJECT_NODE__IN_STATE);
				return inState != null && !inState.isEmpty();
			case UMLPackage.OBJECT_NODE__SELECTION :
				return eVirtualGet(UMLPackage.OBJECT_NODE__SELECTION) != null;
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == TypedElement.class) {
			switch (derivedFeatureID) {
				case UMLPackage.OBJECT_NODE__TYPE :
					return UMLPackage.TYPED_ELEMENT__TYPE;
				default :
					return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class baseClass) {
		if (baseClass == TypedElement.class) {
			switch (baseFeatureID) {
				case UMLPackage.TYPED_ELEMENT__TYPE :
					return UMLPackage.OBJECT_NODE__TYPE;
				default :
					return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (ordering: "); //$NON-NLS-1$
		result.append(eVirtualGet(UMLPackage.OBJECT_NODE__ORDERING,
			ORDERING_EDEFAULT));
		result.append(", isControlType: "); //$NON-NLS-1$
		result.append((eFlags & IS_CONTROL_TYPE_EFLAG) != 0);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| eIsSet(UMLPackage.OBJECT_NODE__UPPER_BOUND);
	}

} //ObjectNodeImpl
