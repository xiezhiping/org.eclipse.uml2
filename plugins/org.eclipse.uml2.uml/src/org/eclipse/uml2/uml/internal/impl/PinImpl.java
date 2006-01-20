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
 * $Id: PinImpl.java,v 1.11 2006/01/20 20:55:53 khussey Exp $
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
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.MultiplicityElement;
import org.eclipse.uml2.uml.ObjectNodeOrderingKind;
import org.eclipse.uml2.uml.Pin;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.StructuredActivityNode;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.ValueSpecification;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.MultiplicityElementOperations;
import org.eclipse.uml2.uml.internal.operations.PinOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pin</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PinImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PinImpl#isOrdered <em>Is Ordered</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PinImpl#isUnique <em>Is Unique</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PinImpl#getUpper <em>Upper</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PinImpl#getLower <em>Lower</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PinImpl#getUpperValue <em>Upper Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PinImpl#getLowerValue <em>Lower Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PinImpl#isControl <em>Is Control</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PinImpl
		extends ObjectNodeImpl
		implements Pin {

	/**
	 * A bit field representing the indices of non-primitive feature values.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected int eVirtualIndexBits1 = 0;

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
	protected static final int IS_ORDERED_EFLAG = 1 << 10;

	/**
	 * The default value of the '{@link #isUnique() <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnique()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_UNIQUE_EDEFAULT = false;

	/**
	 * The flag representing the value of the '{@link #isUnique() <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnique()
	 * @generated
	 * @ordered
	 */
	protected static final int IS_UNIQUE_EFLAG = 1 << 11;

	/**
	 * The default value of the '{@link #getUpper() <em>Upper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpper()
	 * @generated
	 * @ordered
	 */
	protected static final int UPPER_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getLower() <em>Lower</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLower()
	 * @generated
	 * @ordered
	 */
	protected static final int LOWER_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #isControl() <em>Is Control</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isControl()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_CONTROL_EDEFAULT = false;

	/**
	 * The flag representing the value of the '{@link #isControl() <em>Is Control</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isControl()
	 * @generated
	 * @ordered
	 */
	protected static final int IS_CONTROL_EFLAG = 1 << 12;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PinImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.Literals.PIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedElements() {
		EList ownedElement = (EList) eVirtualGet(UMLPackage.PIN__OWNED_ELEMENT);
		if (ownedElement == null) {
			eVirtualSet(UMLPackage.PIN__OWNED_ELEMENT,
				ownedElement = new DerivedUnionEObjectEList(Element.class,
					this, UMLPackage.PIN__OWNED_ELEMENT, new int[]{
						UMLPackage.PIN__OWNED_COMMENT,
						UMLPackage.PIN__NAME_EXPRESSION,
						UMLPackage.PIN__UPPER_BOUND,
						UMLPackage.PIN__UPPER_VALUE,
						UMLPackage.PIN__LOWER_VALUE}));
		}
		return ownedElement;
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
				UMLPackage.PIN__IS_ORDERED, oldIsOrdered, newIsOrdered));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUnique() {
		return (eFlags & IS_UNIQUE_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsUnique(boolean newIsUnique) {
		boolean oldIsUnique = (eFlags & IS_UNIQUE_EFLAG) != 0;
		if (newIsUnique)
			eFlags |= IS_UNIQUE_EFLAG;
		else
			eFlags &= ~IS_UNIQUE_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.PIN__IS_UNIQUE, oldIsUnique, newIsUnique));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getUpper() {
		return MultiplicityElementOperations.getUpper(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpper(int newUpper) {
		MultiplicityElementOperations.setUpper(this, newUpper);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUpper() {
		MultiplicityElementOperations.unsetUpper(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUpper() {
		return MultiplicityElementOperations.isSetUpper(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLower() {
		return MultiplicityElementOperations.getLower(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLower(int newLower) {
		MultiplicityElementOperations.setLower(this, newLower);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLower() {
		MultiplicityElementOperations.unsetLower(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLower() {
		return MultiplicityElementOperations.isSetLower(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getUpperValue() {
		return (ValueSpecification) eVirtualGet(UMLPackage.PIN__UPPER_VALUE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpperValue(
			ValueSpecification newUpperValue, NotificationChain msgs) {
		Object oldUpperValue = eVirtualSet(UMLPackage.PIN__UPPER_VALUE,
			newUpperValue);
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET, UMLPackage.PIN__UPPER_VALUE,
				oldUpperValue == EVIRTUAL_NO_VALUE
					? null
					: oldUpperValue, newUpperValue);
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
	public void setUpperValue(ValueSpecification newUpperValue) {
		ValueSpecification upperValue = (ValueSpecification) eVirtualGet(UMLPackage.PIN__UPPER_VALUE);
		if (newUpperValue != upperValue) {
			NotificationChain msgs = null;
			if (upperValue != null)
				msgs = ((InternalEObject) upperValue).eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE - UMLPackage.PIN__UPPER_VALUE, null,
					msgs);
			if (newUpperValue != null)
				msgs = ((InternalEObject) newUpperValue).eInverseAdd(this,
					EOPPOSITE_FEATURE_BASE - UMLPackage.PIN__UPPER_VALUE, null,
					msgs);
			msgs = basicSetUpperValue(newUpperValue, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.PIN__UPPER_VALUE, newUpperValue, newUpperValue));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification createUpperValue(EClass eClass) {
		ValueSpecification newUpperValue = (ValueSpecification) eClass
			.getEPackage().getEFactoryInstance().create(eClass);
		setUpperValue(newUpperValue);
		return newUpperValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getLowerValue() {
		return (ValueSpecification) eVirtualGet(UMLPackage.PIN__LOWER_VALUE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLowerValue(
			ValueSpecification newLowerValue, NotificationChain msgs) {
		Object oldLowerValue = eVirtualSet(UMLPackage.PIN__LOWER_VALUE,
			newLowerValue);
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET, UMLPackage.PIN__LOWER_VALUE,
				oldLowerValue == EVIRTUAL_NO_VALUE
					? null
					: oldLowerValue, newLowerValue);
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
	public void setLowerValue(ValueSpecification newLowerValue) {
		ValueSpecification lowerValue = (ValueSpecification) eVirtualGet(UMLPackage.PIN__LOWER_VALUE);
		if (newLowerValue != lowerValue) {
			NotificationChain msgs = null;
			if (lowerValue != null)
				msgs = ((InternalEObject) lowerValue).eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE - UMLPackage.PIN__LOWER_VALUE, null,
					msgs);
			if (newLowerValue != null)
				msgs = ((InternalEObject) newLowerValue).eInverseAdd(this,
					EOPPOSITE_FEATURE_BASE - UMLPackage.PIN__LOWER_VALUE, null,
					msgs);
			msgs = basicSetLowerValue(newLowerValue, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.PIN__LOWER_VALUE, newLowerValue, newLowerValue));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification createLowerValue(EClass eClass) {
		ValueSpecification newLowerValue = (ValueSpecification) eClass
			.getEPackage().getEFactoryInstance().create(eClass);
		setLowerValue(newLowerValue);
		return newLowerValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isControl() {
		return (eFlags & IS_CONTROL_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsControl(boolean newIsControl) {
		boolean oldIsControl = (eFlags & IS_CONTROL_EFLAG) != 0;
		if (newIsControl)
			eFlags |= IS_CONTROL_EFLAG;
		else
			eFlags &= ~IS_CONTROL_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.PIN__IS_CONTROL, oldIsControl, newIsControl));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUpperGt0(DiagnosticChain diagnostics, Map context) {
		return MultiplicityElementOperations.validateUpperGt0(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLowerGe0(DiagnosticChain diagnostics, Map context) {
		return MultiplicityElementOperations.validateLowerGe0(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUpperGeLower(DiagnosticChain diagnostics, Map context) {
		return MultiplicityElementOperations.validateUpperGeLower(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueSpecificationNoSideEffects(
			DiagnosticChain diagnostics, Map context) {
		return MultiplicityElementOperations
			.validateValueSpecificationNoSideEffects(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueSpecificationConstant(
			DiagnosticChain diagnostics, Map context) {
		return MultiplicityElementOperations
			.validateValueSpecificationConstant(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMultivalued() {
		return MultiplicityElementOperations.isMultivalued(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean includesCardinality(int C) {
		return MultiplicityElementOperations.includesCardinality(this, C);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean includesMultiplicity(MultiplicityElement M) {
		return MultiplicityElementOperations.includesMultiplicity(this, M);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int lowerBound() {
		return MultiplicityElementOperations.lowerBound(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int upperBound() {
		return MultiplicityElementOperations.upperBound(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateControlPins(DiagnosticChain diagnostics, Map context) {
		return PinOperations.validateControlPins(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.PIN__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.PIN__OWNED_COMMENT :
				return ((InternalEList) getOwnedComments()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.PIN__CLIENT_DEPENDENCY :
				return ((InternalEList) getClientDependencies()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.PIN__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.PIN__IN_STRUCTURED_NODE :
				return eBasicSetContainer(null,
					UMLPackage.PIN__IN_STRUCTURED_NODE, msgs);
			case UMLPackage.PIN__ACTIVITY :
				return eBasicSetContainer(null, UMLPackage.PIN__ACTIVITY, msgs);
			case UMLPackage.PIN__OUTGOING :
				return ((InternalEList) getOutgoings()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.PIN__INCOMING :
				return ((InternalEList) getIncomings()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.PIN__IN_PARTITION :
				return ((InternalEList) getInPartitions()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.PIN__IN_INTERRUPTIBLE_REGION :
				return ((InternalEList) getInInterruptibleRegions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.PIN__UPPER_BOUND :
				return basicSetUpperBound(null, msgs);
			case UMLPackage.PIN__UPPER_VALUE :
				return basicSetUpperValue(null, msgs);
			case UMLPackage.PIN__LOWER_VALUE :
				return basicSetLowerValue(null, msgs);
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
			case UMLPackage.PIN__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.PIN__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.PIN__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.PIN__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.PIN__NAME :
				return getName();
			case UMLPackage.PIN__VISIBILITY :
				return getVisibility();
			case UMLPackage.PIN__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.PIN__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.PIN__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.PIN__NAME_EXPRESSION :
				return getNameExpression();
			case UMLPackage.PIN__IS_LEAF :
				return isLeaf()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.PIN__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.PIN__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.PIN__IN_STRUCTURED_NODE :
				return getInStructuredNode();
			case UMLPackage.PIN__ACTIVITY :
				return getActivity();
			case UMLPackage.PIN__OUTGOING :
				return getOutgoings();
			case UMLPackage.PIN__INCOMING :
				return getIncomings();
			case UMLPackage.PIN__IN_PARTITION :
				return getInPartitions();
			case UMLPackage.PIN__IN_INTERRUPTIBLE_REGION :
				return getInInterruptibleRegions();
			case UMLPackage.PIN__IN_GROUP :
				return getInGroups();
			case UMLPackage.PIN__REDEFINED_NODE :
				return getRedefinedNodes();
			case UMLPackage.PIN__TYPE :
				if (resolve)
					return getType();
				return basicGetType();
			case UMLPackage.PIN__ORDERING :
				return getOrdering();
			case UMLPackage.PIN__IS_CONTROL_TYPE :
				return isControlType()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.PIN__UPPER_BOUND :
				return getUpperBound();
			case UMLPackage.PIN__IN_STATE :
				return getInStates();
			case UMLPackage.PIN__SELECTION :
				if (resolve)
					return getSelection();
				return basicGetSelection();
			case UMLPackage.PIN__IS_ORDERED :
				return isOrdered()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.PIN__IS_UNIQUE :
				return isUnique()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.PIN__UPPER :
				return new Integer(getUpper());
			case UMLPackage.PIN__LOWER :
				return new Integer(getLower());
			case UMLPackage.PIN__UPPER_VALUE :
				return getUpperValue();
			case UMLPackage.PIN__LOWER_VALUE :
				return getLowerValue();
			case UMLPackage.PIN__IS_CONTROL :
				return isControl()
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
			case UMLPackage.PIN__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.PIN__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.PIN__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.PIN__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.PIN__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.PIN__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.PIN__IS_LEAF :
				setIsLeaf(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.PIN__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) newValue);
				return;
			case UMLPackage.PIN__ACTIVITY :
				setActivity((Activity) newValue);
				return;
			case UMLPackage.PIN__OUTGOING :
				getOutgoings().clear();
				getOutgoings().addAll((Collection) newValue);
				return;
			case UMLPackage.PIN__INCOMING :
				getIncomings().clear();
				getIncomings().addAll((Collection) newValue);
				return;
			case UMLPackage.PIN__IN_PARTITION :
				getInPartitions().clear();
				getInPartitions().addAll((Collection) newValue);
				return;
			case UMLPackage.PIN__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				getInInterruptibleRegions().addAll((Collection) newValue);
				return;
			case UMLPackage.PIN__REDEFINED_NODE :
				getRedefinedNodes().clear();
				getRedefinedNodes().addAll((Collection) newValue);
				return;
			case UMLPackage.PIN__TYPE :
				setType((Type) newValue);
				return;
			case UMLPackage.PIN__ORDERING :
				setOrdering((ObjectNodeOrderingKind) newValue);
				return;
			case UMLPackage.PIN__IS_CONTROL_TYPE :
				setIsControlType(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.PIN__UPPER_BOUND :
				setUpperBound((ValueSpecification) newValue);
				return;
			case UMLPackage.PIN__IN_STATE :
				getInStates().clear();
				getInStates().addAll((Collection) newValue);
				return;
			case UMLPackage.PIN__SELECTION :
				setSelection((Behavior) newValue);
				return;
			case UMLPackage.PIN__IS_ORDERED :
				setIsOrdered(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.PIN__IS_UNIQUE :
				setIsUnique(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.PIN__UPPER :
				setUpper(((Integer) newValue).intValue());
				return;
			case UMLPackage.PIN__LOWER :
				setLower(((Integer) newValue).intValue());
				return;
			case UMLPackage.PIN__UPPER_VALUE :
				setUpperValue((ValueSpecification) newValue);
				return;
			case UMLPackage.PIN__LOWER_VALUE :
				setLowerValue((ValueSpecification) newValue);
				return;
			case UMLPackage.PIN__IS_CONTROL :
				setIsControl(((Boolean) newValue).booleanValue());
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
			case UMLPackage.PIN__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.PIN__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.PIN__NAME :
				unsetName();
				return;
			case UMLPackage.PIN__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.PIN__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.PIN__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.PIN__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.PIN__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) null);
				return;
			case UMLPackage.PIN__ACTIVITY :
				setActivity((Activity) null);
				return;
			case UMLPackage.PIN__OUTGOING :
				getOutgoings().clear();
				return;
			case UMLPackage.PIN__INCOMING :
				getIncomings().clear();
				return;
			case UMLPackage.PIN__IN_PARTITION :
				getInPartitions().clear();
				return;
			case UMLPackage.PIN__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				return;
			case UMLPackage.PIN__REDEFINED_NODE :
				getRedefinedNodes().clear();
				return;
			case UMLPackage.PIN__TYPE :
				setType((Type) null);
				return;
			case UMLPackage.PIN__ORDERING :
				setOrdering(ORDERING_EDEFAULT);
				return;
			case UMLPackage.PIN__IS_CONTROL_TYPE :
				setIsControlType(IS_CONTROL_TYPE_EDEFAULT);
				return;
			case UMLPackage.PIN__UPPER_BOUND :
				setUpperBound((ValueSpecification) null);
				return;
			case UMLPackage.PIN__IN_STATE :
				getInStates().clear();
				return;
			case UMLPackage.PIN__SELECTION :
				setSelection((Behavior) null);
				return;
			case UMLPackage.PIN__IS_ORDERED :
				setIsOrdered(IS_ORDERED_EDEFAULT);
				return;
			case UMLPackage.PIN__IS_UNIQUE :
				setIsUnique(IS_UNIQUE_EDEFAULT);
				return;
			case UMLPackage.PIN__UPPER :
				unsetUpper();
				return;
			case UMLPackage.PIN__LOWER :
				unsetLower();
				return;
			case UMLPackage.PIN__UPPER_VALUE :
				setUpperValue((ValueSpecification) null);
				return;
			case UMLPackage.PIN__LOWER_VALUE :
				setLowerValue((ValueSpecification) null);
				return;
			case UMLPackage.PIN__IS_CONTROL :
				setIsControl(IS_CONTROL_EDEFAULT);
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
			case UMLPackage.PIN__EANNOTATIONS :
				EList eAnnotations = (EList) eVirtualGet(UMLPackage.PIN__EANNOTATIONS);
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.PIN__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.PIN__OWNER :
				return isSetOwner();
			case UMLPackage.PIN__OWNED_COMMENT :
				EList ownedComment = (EList) eVirtualGet(UMLPackage.PIN__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.PIN__NAME :
				return isSetName();
			case UMLPackage.PIN__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.PIN__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.PIN__CLIENT_DEPENDENCY :
				EList clientDependency = (EList) eVirtualGet(UMLPackage.PIN__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.PIN__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.PIN__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.PIN__NAME_EXPRESSION) != null;
			case UMLPackage.PIN__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.PIN__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.PIN__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.PIN__IN_STRUCTURED_NODE :
				return getInStructuredNode() != null;
			case UMLPackage.PIN__ACTIVITY :
				return getActivity() != null;
			case UMLPackage.PIN__OUTGOING :
				EList outgoing = (EList) eVirtualGet(UMLPackage.PIN__OUTGOING);
				return outgoing != null && !outgoing.isEmpty();
			case UMLPackage.PIN__INCOMING :
				EList incoming = (EList) eVirtualGet(UMLPackage.PIN__INCOMING);
				return incoming != null && !incoming.isEmpty();
			case UMLPackage.PIN__IN_PARTITION :
				EList inPartition = (EList) eVirtualGet(UMLPackage.PIN__IN_PARTITION);
				return inPartition != null && !inPartition.isEmpty();
			case UMLPackage.PIN__IN_INTERRUPTIBLE_REGION :
				EList inInterruptibleRegion = (EList) eVirtualGet(UMLPackage.PIN__IN_INTERRUPTIBLE_REGION);
				return inInterruptibleRegion != null
					&& !inInterruptibleRegion.isEmpty();
			case UMLPackage.PIN__IN_GROUP :
				return isSetInGroups();
			case UMLPackage.PIN__REDEFINED_NODE :
				EList redefinedNode = (EList) eVirtualGet(UMLPackage.PIN__REDEFINED_NODE);
				return redefinedNode != null && !redefinedNode.isEmpty();
			case UMLPackage.PIN__TYPE :
				return eVirtualGet(UMLPackage.PIN__TYPE) != null;
			case UMLPackage.PIN__ORDERING :
				return eVirtualGet(UMLPackage.PIN__ORDERING, ORDERING_EDEFAULT) != ORDERING_EDEFAULT;
			case UMLPackage.PIN__IS_CONTROL_TYPE :
				return ((eFlags & IS_CONTROL_TYPE_EFLAG) != 0) != IS_CONTROL_TYPE_EDEFAULT;
			case UMLPackage.PIN__UPPER_BOUND :
				return eVirtualGet(UMLPackage.PIN__UPPER_BOUND) != null;
			case UMLPackage.PIN__IN_STATE :
				EList inState = (EList) eVirtualGet(UMLPackage.PIN__IN_STATE);
				return inState != null && !inState.isEmpty();
			case UMLPackage.PIN__SELECTION :
				return eVirtualGet(UMLPackage.PIN__SELECTION) != null;
			case UMLPackage.PIN__IS_ORDERED :
				return ((eFlags & IS_ORDERED_EFLAG) != 0) != IS_ORDERED_EDEFAULT;
			case UMLPackage.PIN__IS_UNIQUE :
				return ((eFlags & IS_UNIQUE_EFLAG) != 0) != IS_UNIQUE_EDEFAULT;
			case UMLPackage.PIN__UPPER :
				return isSetUpper();
			case UMLPackage.PIN__LOWER :
				return isSetLower();
			case UMLPackage.PIN__UPPER_VALUE :
				return eVirtualGet(UMLPackage.PIN__UPPER_VALUE) != null;
			case UMLPackage.PIN__LOWER_VALUE :
				return eVirtualGet(UMLPackage.PIN__LOWER_VALUE) != null;
			case UMLPackage.PIN__IS_CONTROL :
				return ((eFlags & IS_CONTROL_EFLAG) != 0) != IS_CONTROL_EDEFAULT;
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == MultiplicityElement.class) {
			switch (derivedFeatureID) {
				case UMLPackage.PIN__IS_ORDERED :
					return UMLPackage.MULTIPLICITY_ELEMENT__IS_ORDERED;
				case UMLPackage.PIN__IS_UNIQUE :
					return UMLPackage.MULTIPLICITY_ELEMENT__IS_UNIQUE;
				case UMLPackage.PIN__UPPER :
					return UMLPackage.MULTIPLICITY_ELEMENT__UPPER;
				case UMLPackage.PIN__LOWER :
					return UMLPackage.MULTIPLICITY_ELEMENT__LOWER;
				case UMLPackage.PIN__UPPER_VALUE :
					return UMLPackage.MULTIPLICITY_ELEMENT__UPPER_VALUE;
				case UMLPackage.PIN__LOWER_VALUE :
					return UMLPackage.MULTIPLICITY_ELEMENT__LOWER_VALUE;
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
		if (baseClass == MultiplicityElement.class) {
			switch (baseFeatureID) {
				case UMLPackage.MULTIPLICITY_ELEMENT__IS_ORDERED :
					return UMLPackage.PIN__IS_ORDERED;
				case UMLPackage.MULTIPLICITY_ELEMENT__IS_UNIQUE :
					return UMLPackage.PIN__IS_UNIQUE;
				case UMLPackage.MULTIPLICITY_ELEMENT__UPPER :
					return UMLPackage.PIN__UPPER;
				case UMLPackage.MULTIPLICITY_ELEMENT__LOWER :
					return UMLPackage.PIN__LOWER;
				case UMLPackage.MULTIPLICITY_ELEMENT__UPPER_VALUE :
					return UMLPackage.PIN__UPPER_VALUE;
				case UMLPackage.MULTIPLICITY_ELEMENT__LOWER_VALUE :
					return UMLPackage.PIN__LOWER_VALUE;
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
	protected int eVirtualIndexBits(int offset) {
		switch (offset) {
			case 0 :
				return eVirtualIndexBits0;
			case 1 :
				return eVirtualIndexBits1;
			default :
				throw new IndexOutOfBoundsException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void eSetVirtualIndexBits(int offset, int newIndexBits) {
		switch (offset) {
			case 0 :
				eVirtualIndexBits0 = newIndexBits;
				break;
			case 1 :
				eVirtualIndexBits1 = newIndexBits;
				break;
			default :
				throw new IndexOutOfBoundsException();
		}
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
		result.append(", isUnique: "); //$NON-NLS-1$
		result.append((eFlags & IS_UNIQUE_EFLAG) != 0);
		result.append(", isControl: "); //$NON-NLS-1$
		result.append((eFlags & IS_CONTROL_EFLAG) != 0);
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
			|| eIsSet(UMLPackage.PIN__UPPER_VALUE)
			|| eIsSet(UMLPackage.PIN__LOWER_VALUE);
	}

} //PinImpl
