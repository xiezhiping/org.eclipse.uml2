/*
 * Copyright (c) 2003, 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: PinImpl.java,v 1.15 2005/11/14 17:31:08 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.Activity;
import org.eclipse.uml2.Behavior;
import org.eclipse.uml2.Element;
import org.eclipse.uml2.MultiplicityElement;
import org.eclipse.uml2.ObjectNodeOrderingKind;
import org.eclipse.uml2.Pin;
import org.eclipse.uml2.StringExpression;
import org.eclipse.uml2.StructuredActivityNode;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.Type;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.ValueSpecification;
import org.eclipse.uml2.VisibilityKind;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.internal.operation.MultiplicityElementOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pin</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.PinImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.PinImpl#isOrdered <em>Is Ordered</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.PinImpl#isUnique <em>Is Unique</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.PinImpl#getLower <em>Lower</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.PinImpl#getUpper <em>Upper</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.PinImpl#getUpperValue <em>Upper Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.PinImpl#getLowerValue <em>Lower Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class PinImpl extends ObjectNodeImpl implements Pin {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

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
	protected static final int IS_ORDERED_EFLAG = 1 << 9;

	/**
	 * The default value of the '{@link #isUnique() <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnique()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_UNIQUE_EDEFAULT = true;

	/**
	 * The flag representing the value of the '{@link #isUnique() <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnique()
	 * @generated
	 * @ordered
	 */
	protected static final int IS_UNIQUE_EFLAG = 1 << 10;

	/**
	 * The default value of the '{@link #getLower() <em>Lower</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLower()
	 * @generated
	 * @ordered
	 */
	protected static final int LOWER_EDEFAULT = 1;

	/**
	 * The default value of the '{@link #getUpper() <em>Upper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpper()
	 * @generated
	 * @ordered
	 */
	protected static final int UPPER_EDEFAULT = 1;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PinImpl() {
		super();
		eFlags |= IS_UNIQUE_EFLAG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UML2Package.eINSTANCE.getPin();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedElements() {
		EList ownedElement = (EList)eVirtualGet(UML2Package.PIN__OWNED_ELEMENT);
		if (ownedElement == null) {
			eVirtualSet(UML2Package.PIN__OWNED_ELEMENT, ownedElement = new DerivedUnionEObjectEList(Element.class, this, UML2Package.PIN__OWNED_ELEMENT, new EStructuralFeature[] {UML2Package.eINSTANCE.getElement_OwnedComment(), UML2Package.eINSTANCE.getTemplateableElement_TemplateBinding(), UML2Package.eINSTANCE.getTemplateableElement_OwnedTemplateSignature(), UML2Package.eINSTANCE.getNamedElement_NameExpression(), UML2Package.eINSTANCE.getObjectNode_UpperBound(), UML2Package.eINSTANCE.getMultiplicityElement_UpperValue(), UML2Package.eINSTANCE.getMultiplicityElement_LowerValue()}));
		}
		return ownedElement;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| eIsSet(UML2Package.eINSTANCE.getMultiplicityElement_UpperValue())
			|| eIsSet(UML2Package.eINSTANCE.getMultiplicityElement_LowerValue());
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
		if (newIsOrdered) eFlags |= IS_ORDERED_EFLAG; else eFlags &= ~IS_ORDERED_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.PIN__IS_ORDERED, oldIsOrdered, newIsOrdered));

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
		if (newIsUnique) eFlags |= IS_UNIQUE_EFLAG; else eFlags &= ~IS_UNIQUE_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.PIN__IS_UNIQUE, oldIsUnique, newIsUnique));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int getLower() {
		return lower();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int getUpper() {
		return upper();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getUpperValue() {
		ValueSpecification upperValue = (ValueSpecification)eVirtualGet(UML2Package.PIN__UPPER_VALUE);
		return upperValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpperValue(ValueSpecification newUpperValue, NotificationChain msgs) {
		Object oldUpperValue = eVirtualSet(UML2Package.PIN__UPPER_VALUE, newUpperValue);
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UML2Package.PIN__UPPER_VALUE, oldUpperValue == EVIRTUAL_NO_VALUE ? null : oldUpperValue, newUpperValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpperValue(ValueSpecification newUpperValue) {
		ValueSpecification upperValue = (ValueSpecification)eVirtualGet(UML2Package.PIN__UPPER_VALUE);
		if (newUpperValue != upperValue) {
			NotificationChain msgs = null;
			if (upperValue != null)
				msgs = ((InternalEObject)upperValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.PIN__UPPER_VALUE, null, msgs);
			if (newUpperValue != null)
				msgs = ((InternalEObject)newUpperValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UML2Package.PIN__UPPER_VALUE, null, msgs);
			msgs = basicSetUpperValue(newUpperValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.PIN__UPPER_VALUE, newUpperValue, newUpperValue));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification createUpperValue(EClass eClass) {
		ValueSpecification newUpperValue = (ValueSpecification) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.PIN__UPPER_VALUE, null, newUpperValue));
		}
		setUpperValue(newUpperValue);
		return newUpperValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getLowerValue() {
		ValueSpecification lowerValue = (ValueSpecification)eVirtualGet(UML2Package.PIN__LOWER_VALUE);
		return lowerValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLowerValue(ValueSpecification newLowerValue, NotificationChain msgs) {
		Object oldLowerValue = eVirtualSet(UML2Package.PIN__LOWER_VALUE, newLowerValue);
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UML2Package.PIN__LOWER_VALUE, oldLowerValue == EVIRTUAL_NO_VALUE ? null : oldLowerValue, newLowerValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowerValue(ValueSpecification newLowerValue) {
		ValueSpecification lowerValue = (ValueSpecification)eVirtualGet(UML2Package.PIN__LOWER_VALUE);
		if (newLowerValue != lowerValue) {
			NotificationChain msgs = null;
			if (lowerValue != null)
				msgs = ((InternalEObject)lowerValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.PIN__LOWER_VALUE, null, msgs);
			if (newLowerValue != null)
				msgs = ((InternalEObject)newLowerValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UML2Package.PIN__LOWER_VALUE, null, msgs);
			msgs = basicSetLowerValue(newLowerValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.PIN__LOWER_VALUE, newLowerValue, newLowerValue));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification createLowerValue(EClass eClass) {
		ValueSpecification newLowerValue = (ValueSpecification) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.PIN__LOWER_VALUE, null, newLowerValue));
		}
		setLowerValue(newLowerValue);
		return newLowerValue;
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
	public boolean validateUpperGt0(DiagnosticChain diagnostics, Map context) {
		return MultiplicityElementOperations.validateUpperGt0(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLowerGe0(DiagnosticChain diagnostics, Map context) {
		return MultiplicityElementOperations.validateLowerGe0(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUpperGeLower(DiagnosticChain diagnostics, Map context) {
		return MultiplicityElementOperations.validateUpperGeLower(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLowerEqLowerbound(DiagnosticChain diagnostics, Map context) {
		return MultiplicityElementOperations.validateLowerEqLowerbound(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUpperEqUpperbound(DiagnosticChain diagnostics, Map context) {
		return MultiplicityElementOperations.validateUpperEqUpperbound(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int lower() {
		return MultiplicityElementOperations.lower(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int upper() {
		return MultiplicityElementOperations.upper(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UML2Package.PIN__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
				case UML2Package.PIN__OWNED_COMMENT:
					return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
				case UML2Package.PIN__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicRemove(otherEnd, msgs);
				case UML2Package.PIN__OWNED_TEMPLATE_SIGNATURE:
					return basicSetOwnedTemplateSignature(null, msgs);
				case UML2Package.PIN__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicRemove(otherEnd, msgs);
				case UML2Package.PIN__NAME_EXPRESSION:
					return basicSetNameExpression(null, msgs);
				case UML2Package.PIN__OUTGOING:
					return ((InternalEList)getOutgoings()).basicRemove(otherEnd, msgs);
				case UML2Package.PIN__INCOMING:
					return ((InternalEList)getIncomings()).basicRemove(otherEnd, msgs);
				case UML2Package.PIN__ACTIVITY:
					return eBasicSetContainer(null, UML2Package.PIN__ACTIVITY, msgs);
				case UML2Package.PIN__IN_STRUCTURED_NODE:
					return eBasicSetContainer(null, UML2Package.PIN__IN_STRUCTURED_NODE, msgs);
				case UML2Package.PIN__IN_PARTITION:
					return ((InternalEList)getInPartitions()).basicRemove(otherEnd, msgs);
				case UML2Package.PIN__IN_INTERRUPTIBLE_REGION:
					return ((InternalEList)getInInterruptibleRegions()).basicRemove(otherEnd, msgs);
				case UML2Package.PIN__UPPER_BOUND:
					return basicSetUpperBound(null, msgs);
				case UML2Package.PIN__UPPER_VALUE:
					return basicSetUpperValue(null, msgs);
				case UML2Package.PIN__LOWER_VALUE:
					return basicSetLowerValue(null, msgs);
				default:
					return eDynamicInverseRemove(otherEnd, featureID, baseClass, msgs);
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
			case UML2Package.PIN__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.PIN__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.PIN__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.PIN__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.PIN__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.PIN__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UML2Package.PIN__NAME:
				return getName();
			case UML2Package.PIN__QUALIFIED_NAME:
				return getQualifiedName();
			case UML2Package.PIN__VISIBILITY:
				return getVisibility();
			case UML2Package.PIN__CLIENT_DEPENDENCY:
				return getClientDependencies();
			case UML2Package.PIN__NAME_EXPRESSION:
				return getNameExpression();
			case UML2Package.PIN__REDEFINITION_CONTEXT:
				return getRedefinitionContexts();
			case UML2Package.PIN__IS_LEAF:
				return isLeaf() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.PIN__OUTGOING:
				return getOutgoings();
			case UML2Package.PIN__INCOMING:
				return getIncomings();
			case UML2Package.PIN__IN_GROUP:
				return getInGroups();
			case UML2Package.PIN__ACTIVITY:
				return getActivity();
			case UML2Package.PIN__REDEFINED_ELEMENT:
				return getRedefinedElements();
			case UML2Package.PIN__IN_STRUCTURED_NODE:
				return getInStructuredNode();
			case UML2Package.PIN__IN_PARTITION:
				return getInPartitions();
			case UML2Package.PIN__IN_INTERRUPTIBLE_REGION:
				return getInInterruptibleRegions();
			case UML2Package.PIN__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case UML2Package.PIN__ORDERING:
				return getOrdering();
			case UML2Package.PIN__UPPER_BOUND:
				return getUpperBound();
			case UML2Package.PIN__IN_STATE:
				return getInStates();
			case UML2Package.PIN__SELECTION:
				if (resolve) return getSelection();
				return basicGetSelection();
			case UML2Package.PIN__IS_ORDERED:
				return isOrdered() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.PIN__IS_UNIQUE:
				return isUnique() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.PIN__LOWER:
				return new Integer(getLower());
			case UML2Package.PIN__UPPER:
				return new Integer(getUpper());
			case UML2Package.PIN__UPPER_VALUE:
				return getUpperValue();
			case UML2Package.PIN__LOWER_VALUE:
				return getLowerValue();
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
			case UML2Package.PIN__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.PIN__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.PIN__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection)newValue);
				return;
			case UML2Package.PIN__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case UML2Package.PIN__NAME:
				setName((String)newValue);
				return;
			case UML2Package.PIN__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case UML2Package.PIN__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection)newValue);
				return;
			case UML2Package.PIN__NAME_EXPRESSION:
				setNameExpression((StringExpression)newValue);
				return;
			case UML2Package.PIN__IS_LEAF:
				setIsLeaf(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.PIN__OUTGOING:
				getOutgoings().clear();
				getOutgoings().addAll((Collection)newValue);
				return;
			case UML2Package.PIN__INCOMING:
				getIncomings().clear();
				getIncomings().addAll((Collection)newValue);
				return;
			case UML2Package.PIN__ACTIVITY:
				setActivity((Activity)newValue);
				return;
			case UML2Package.PIN__REDEFINED_ELEMENT:
				getRedefinedElements().clear();
				getRedefinedElements().addAll((Collection)newValue);
				return;
			case UML2Package.PIN__IN_STRUCTURED_NODE:
				setInStructuredNode((StructuredActivityNode)newValue);
				return;
			case UML2Package.PIN__IN_PARTITION:
				getInPartitions().clear();
				getInPartitions().addAll((Collection)newValue);
				return;
			case UML2Package.PIN__IN_INTERRUPTIBLE_REGION:
				getInInterruptibleRegions().clear();
				getInInterruptibleRegions().addAll((Collection)newValue);
				return;
			case UML2Package.PIN__TYPE:
				setType((Type)newValue);
				return;
			case UML2Package.PIN__ORDERING:
				setOrdering((ObjectNodeOrderingKind)newValue);
				return;
			case UML2Package.PIN__UPPER_BOUND:
				setUpperBound((ValueSpecification)newValue);
				return;
			case UML2Package.PIN__IN_STATE:
				getInStates().clear();
				getInStates().addAll((Collection)newValue);
				return;
			case UML2Package.PIN__SELECTION:
				setSelection((Behavior)newValue);
				return;
			case UML2Package.PIN__IS_ORDERED:
				setIsOrdered(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.PIN__IS_UNIQUE:
				setIsUnique(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.PIN__UPPER_VALUE:
				setUpperValue((ValueSpecification)newValue);
				return;
			case UML2Package.PIN__LOWER_VALUE:
				setLowerValue((ValueSpecification)newValue);
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
			case UML2Package.PIN__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.PIN__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.PIN__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				return;
			case UML2Package.PIN__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case UML2Package.PIN__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UML2Package.PIN__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UML2Package.PIN__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				return;
			case UML2Package.PIN__NAME_EXPRESSION:
				setNameExpression((StringExpression)null);
				return;
			case UML2Package.PIN__IS_LEAF:
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UML2Package.PIN__OUTGOING:
				getOutgoings().clear();
				return;
			case UML2Package.PIN__INCOMING:
				getIncomings().clear();
				return;
			case UML2Package.PIN__ACTIVITY:
				setActivity((Activity)null);
				return;
			case UML2Package.PIN__REDEFINED_ELEMENT:
				getRedefinedElements().clear();
				return;
			case UML2Package.PIN__IN_STRUCTURED_NODE:
				setInStructuredNode((StructuredActivityNode)null);
				return;
			case UML2Package.PIN__IN_PARTITION:
				getInPartitions().clear();
				return;
			case UML2Package.PIN__IN_INTERRUPTIBLE_REGION:
				getInInterruptibleRegions().clear();
				return;
			case UML2Package.PIN__TYPE:
				setType((Type)null);
				return;
			case UML2Package.PIN__ORDERING:
				setOrdering(ORDERING_EDEFAULT);
				return;
			case UML2Package.PIN__UPPER_BOUND:
				setUpperBound((ValueSpecification)null);
				return;
			case UML2Package.PIN__IN_STATE:
				getInStates().clear();
				return;
			case UML2Package.PIN__SELECTION:
				setSelection((Behavior)null);
				return;
			case UML2Package.PIN__IS_ORDERED:
				setIsOrdered(IS_ORDERED_EDEFAULT);
				return;
			case UML2Package.PIN__IS_UNIQUE:
				setIsUnique(IS_UNIQUE_EDEFAULT);
				return;
			case UML2Package.PIN__UPPER_VALUE:
				setUpperValue((ValueSpecification)null);
				return;
			case UML2Package.PIN__LOWER_VALUE:
				setLowerValue((ValueSpecification)null);
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
			case UML2Package.PIN__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.PIN__OWNED_ELEMENT:
				return isSetOwnedElements();
			case UML2Package.PIN__OWNER:
				return isSetOwner();
			case UML2Package.PIN__OWNED_COMMENT:
				EList ownedComment = (EList)eVirtualGet(UML2Package.PIN__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.PIN__TEMPLATE_BINDING:
				EList templateBinding = (EList)eVirtualGet(UML2Package.PIN__TEMPLATE_BINDING);
				return templateBinding != null && !templateBinding.isEmpty();
			case UML2Package.PIN__OWNED_TEMPLATE_SIGNATURE:
				return eVirtualGet(UML2Package.PIN__OWNED_TEMPLATE_SIGNATURE) != null;
			case UML2Package.PIN__NAME:
				String name = eVirtualIsSet(UML2Package.PIN__NAME) ? (String)eVirtualGet(UML2Package.PIN__NAME) : NAME_EDEFAULT;
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.PIN__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UML2Package.PIN__VISIBILITY:
				return eVirtualIsSet(UML2Package.PIN__VISIBILITY) && eVirtualGet(UML2Package.PIN__VISIBILITY) != VISIBILITY_EDEFAULT;
			case UML2Package.PIN__CLIENT_DEPENDENCY:
				EList clientDependency = (EList)eVirtualGet(UML2Package.PIN__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UML2Package.PIN__NAME_EXPRESSION:
				return eVirtualGet(UML2Package.PIN__NAME_EXPRESSION) != null;
			case UML2Package.PIN__REDEFINITION_CONTEXT:
				return isSetRedefinitionContexts();
			case UML2Package.PIN__IS_LEAF:
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UML2Package.PIN__OUTGOING:
				EList outgoing = (EList)eVirtualGet(UML2Package.PIN__OUTGOING);
				return outgoing != null && !outgoing.isEmpty();
			case UML2Package.PIN__INCOMING:
				EList incoming = (EList)eVirtualGet(UML2Package.PIN__INCOMING);
				return incoming != null && !incoming.isEmpty();
			case UML2Package.PIN__IN_GROUP:
				return isSetInGroups();
			case UML2Package.PIN__ACTIVITY:
				return getActivity() != null;
			case UML2Package.PIN__REDEFINED_ELEMENT:
				return isSetRedefinedElements();
			case UML2Package.PIN__IN_STRUCTURED_NODE:
				return getInStructuredNode() != null;
			case UML2Package.PIN__IN_PARTITION:
				EList inPartition = (EList)eVirtualGet(UML2Package.PIN__IN_PARTITION);
				return inPartition != null && !inPartition.isEmpty();
			case UML2Package.PIN__IN_INTERRUPTIBLE_REGION:
				EList inInterruptibleRegion = (EList)eVirtualGet(UML2Package.PIN__IN_INTERRUPTIBLE_REGION);
				return inInterruptibleRegion != null && !inInterruptibleRegion.isEmpty();
			case UML2Package.PIN__TYPE:
				return eVirtualGet(UML2Package.PIN__TYPE) != null;
			case UML2Package.PIN__ORDERING:
				return eVirtualIsSet(UML2Package.PIN__ORDERING) && eVirtualGet(UML2Package.PIN__ORDERING) != ORDERING_EDEFAULT;
			case UML2Package.PIN__UPPER_BOUND:
				return eVirtualGet(UML2Package.PIN__UPPER_BOUND) != null;
			case UML2Package.PIN__IN_STATE:
				EList inState = (EList)eVirtualGet(UML2Package.PIN__IN_STATE);
				return inState != null && !inState.isEmpty();
			case UML2Package.PIN__SELECTION:
				return eVirtualGet(UML2Package.PIN__SELECTION) != null;
			case UML2Package.PIN__IS_ORDERED:
				return ((eFlags & IS_ORDERED_EFLAG) != 0) != IS_ORDERED_EDEFAULT;
			case UML2Package.PIN__IS_UNIQUE:
				return ((eFlags & IS_UNIQUE_EFLAG) != 0) != IS_UNIQUE_EDEFAULT;
			case UML2Package.PIN__LOWER:
				return getLower() != LOWER_EDEFAULT;
			case UML2Package.PIN__UPPER:
				return getUpper() != UPPER_EDEFAULT;
			case UML2Package.PIN__UPPER_VALUE:
				return eVirtualGet(UML2Package.PIN__UPPER_VALUE) != null;
			case UML2Package.PIN__LOWER_VALUE:
				return eVirtualGet(UML2Package.PIN__LOWER_VALUE) != null;
		}
		return eDynamicIsSet(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == MultiplicityElement.class) {
			switch (derivedFeatureID) {
				case UML2Package.PIN__IS_ORDERED: return UML2Package.MULTIPLICITY_ELEMENT__IS_ORDERED;
				case UML2Package.PIN__IS_UNIQUE: return UML2Package.MULTIPLICITY_ELEMENT__IS_UNIQUE;
				case UML2Package.PIN__LOWER: return UML2Package.MULTIPLICITY_ELEMENT__LOWER;
				case UML2Package.PIN__UPPER: return UML2Package.MULTIPLICITY_ELEMENT__UPPER;
				case UML2Package.PIN__UPPER_VALUE: return UML2Package.MULTIPLICITY_ELEMENT__UPPER_VALUE;
				case UML2Package.PIN__LOWER_VALUE: return UML2Package.MULTIPLICITY_ELEMENT__LOWER_VALUE;
				default: return -1;
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
				case UML2Package.MULTIPLICITY_ELEMENT__IS_ORDERED: return UML2Package.PIN__IS_ORDERED;
				case UML2Package.MULTIPLICITY_ELEMENT__IS_UNIQUE: return UML2Package.PIN__IS_UNIQUE;
				case UML2Package.MULTIPLICITY_ELEMENT__LOWER: return UML2Package.PIN__LOWER;
				case UML2Package.MULTIPLICITY_ELEMENT__UPPER: return UML2Package.PIN__UPPER;
				case UML2Package.MULTIPLICITY_ELEMENT__UPPER_VALUE: return UML2Package.PIN__UPPER_VALUE;
				case UML2Package.MULTIPLICITY_ELEMENT__LOWER_VALUE: return UML2Package.PIN__LOWER_VALUE;
				default: return -1;
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
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isOrdered: "); //$NON-NLS-1$
		result.append((eFlags & IS_ORDERED_EFLAG) != 0);
		result.append(", isUnique: "); //$NON-NLS-1$
		result.append((eFlags & IS_UNIQUE_EFLAG) != 0);
		result.append(')');
		return result.toString();
	}


	// <!-- begin-custom-operations -->

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.MultiplicityElement#setLowerBound(int)
	 */
	public void setLowerBound(int value) {
		MultiplicityElementOperations.setLowerBound(this, value);
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.MultiplicityElement#setUpperBound(int)
	 */
	public void setUpperBound(int value) {
		MultiplicityElementOperations.setUpperBound(this, value);
	}

	// <!-- end-custom-operations -->

} //PinImpl
