/*
 * Copyright (c) 2003, 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *
 * $Id: MultiplicityElementImpl.java,v 1.7 2004/06/02 05:02:25 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.uml2.MultiplicityElement;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.ValueSpecification;

import org.eclipse.uml2.internal.operation.MultiplicityElementOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multiplicity Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.MultiplicityElementImpl#isOrdered <em>Is Ordered</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.MultiplicityElementImpl#isUnique <em>Is Unique</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.MultiplicityElementImpl#getLower <em>Lower</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.MultiplicityElementImpl#getUpper <em>Upper</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.MultiplicityElementImpl#getUpperValue <em>Upper Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.MultiplicityElementImpl#getLowerValue <em>Lower Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class MultiplicityElementImpl extends ElementImpl implements MultiplicityElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

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
	 * The cached value of the '{@link #isOrdered() <em>Is Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOrdered()
	 * @generated
	 * @ordered
	 */
	protected boolean isOrdered = IS_ORDERED_EDEFAULT;

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
	 * The cached value of the '{@link #isUnique() <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnique()
	 * @generated
	 * @ordered
	 */
	protected boolean isUnique = IS_UNIQUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUpperValue() <em>Upper Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperValue()
	 * @generated
	 * @ordered
	 */
	protected ValueSpecification upperValue = null;

	/**
	 * The cached value of the '{@link #getLowerValue() <em>Lower Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerValue()
	 * @generated
	 * @ordered
	 */
	protected ValueSpecification lowerValue = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultiplicityElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UML2Package.eINSTANCE.getMultiplicityElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOrdered() {
		return isOrdered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsOrdered(boolean newIsOrdered) {
		boolean oldIsOrdered = isOrdered;
		isOrdered = newIsOrdered;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.MULTIPLICITY_ELEMENT__IS_ORDERED, oldIsOrdered, isOrdered));
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUnique() {
		return isUnique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsUnique(boolean newIsUnique) {
		boolean oldIsUnique = isUnique;
		isUnique = newIsUnique;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.MULTIPLICITY_ELEMENT__IS_UNIQUE, oldIsUnique, isUnique));
		}

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
		return upperValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpperValue(ValueSpecification newUpperValue, NotificationChain msgs) {
		ValueSpecification oldUpperValue = upperValue;
		upperValue = newUpperValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UML2Package.MULTIPLICITY_ELEMENT__UPPER_VALUE, oldUpperValue, newUpperValue);
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
		if (newUpperValue != upperValue) {
			NotificationChain msgs = null;
			if (upperValue != null)
				msgs = ((InternalEObject)upperValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.MULTIPLICITY_ELEMENT__UPPER_VALUE, null, msgs);
			if (newUpperValue != null)
				msgs = ((InternalEObject)newUpperValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UML2Package.MULTIPLICITY_ELEMENT__UPPER_VALUE, null, msgs);
			msgs = basicSetUpperValue(newUpperValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.MULTIPLICITY_ELEMENT__UPPER_VALUE, newUpperValue, newUpperValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification createUpperValue(EClass eClass) {
		ValueSpecification newUpperValue = (ValueSpecification) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.MULTIPLICITY_ELEMENT__UPPER_VALUE, null, newUpperValue));
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
		return lowerValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLowerValue(ValueSpecification newLowerValue, NotificationChain msgs) {
		ValueSpecification oldLowerValue = lowerValue;
		lowerValue = newLowerValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UML2Package.MULTIPLICITY_ELEMENT__LOWER_VALUE, oldLowerValue, newLowerValue);
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
		if (newLowerValue != lowerValue) {
			NotificationChain msgs = null;
			if (lowerValue != null)
				msgs = ((InternalEObject)lowerValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.MULTIPLICITY_ELEMENT__LOWER_VALUE, null, msgs);
			if (newLowerValue != null)
				msgs = ((InternalEObject)newLowerValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UML2Package.MULTIPLICITY_ELEMENT__LOWER_VALUE, null, msgs);
			msgs = basicSetLowerValue(newLowerValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.MULTIPLICITY_ELEMENT__LOWER_VALUE, newLowerValue, newLowerValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification createLowerValue(EClass eClass) {
		ValueSpecification newLowerValue = (ValueSpecification) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.MULTIPLICITY_ELEMENT__LOWER_VALUE, null, newLowerValue));
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
		return org.eclipse.uml2.internal.operation.MultiplicityElementOperations.lowerBound(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int upperBound() {
		return org.eclipse.uml2.internal.operation.MultiplicityElementOperations.upperBound(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMultivalued() {
		return org.eclipse.uml2.internal.operation.MultiplicityElementOperations.isMultivalued(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean includesCardinality(int C) {
		return org.eclipse.uml2.internal.operation.MultiplicityElementOperations.includesCardinality(this, C);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean includesMultiplicity(MultiplicityElement M) {
		return org.eclipse.uml2.internal.operation.MultiplicityElementOperations.includesMultiplicity(this, M);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUpperGt0(DiagnosticChain diagnostics, Map context) {
		return org.eclipse.uml2.internal.operation.MultiplicityElementOperations.validateUpperGt0(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLowerGe0(DiagnosticChain diagnostics, Map context) {
		return org.eclipse.uml2.internal.operation.MultiplicityElementOperations.validateLowerGe0(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUpperGeLower(DiagnosticChain diagnostics, Map context) {
		return org.eclipse.uml2.internal.operation.MultiplicityElementOperations.validateUpperGeLower(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLowerEqLowerbound(DiagnosticChain diagnostics, Map context) {
		return org.eclipse.uml2.internal.operation.MultiplicityElementOperations.validateLowerEqLowerbound(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUpperEqUpperbound(DiagnosticChain diagnostics, Map context) {
		return org.eclipse.uml2.internal.operation.MultiplicityElementOperations.validateUpperEqUpperbound(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int lower() {
		return org.eclipse.uml2.internal.operation.MultiplicityElementOperations.lower(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int upper() {
		return org.eclipse.uml2.internal.operation.MultiplicityElementOperations.upper(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedElements() {
		EList ownedElement = (EList) getCacheAdapter().get(this, UML2Package.eINSTANCE.getElement_OwnedElement());

		if (null == ownedElement) {
			Set union = new LinkedHashSet();
			union.addAll(super.getOwnedElements());
			if (null != getUpperValue()) {
				union.add(getUpperValue());
			}
			if (null != getLowerValue()) {
				union.add(getLowerValue());
			}

			ownedElement = new EcoreEList.UnmodifiableEList(this, UML2Package.eINSTANCE.getElement_OwnedElement(), union.size(), union.toArray());
			getCacheAdapter().put(this, UML2Package.eINSTANCE.getElement_OwnedElement(), ownedElement);
		}

		return ownedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UML2Package.MULTIPLICITY_ELEMENT__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicAdd(otherEnd, msgs);
				default:
					return eDynamicInverseAdd(otherEnd, featureID, baseClass, msgs);
			}
		}
		if (eContainer != null)
			msgs = eBasicRemoveFromContainer(msgs);
		return eBasicSetContainer(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UML2Package.MULTIPLICITY_ELEMENT__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
				case UML2Package.MULTIPLICITY_ELEMENT__OWNED_COMMENT:
					return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
				case UML2Package.MULTIPLICITY_ELEMENT__UPPER_VALUE:
					return basicSetUpperValue(null, msgs);
				case UML2Package.MULTIPLICITY_ELEMENT__LOWER_VALUE:
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
			case UML2Package.MULTIPLICITY_ELEMENT__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.MULTIPLICITY_ELEMENT__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.MULTIPLICITY_ELEMENT__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.MULTIPLICITY_ELEMENT__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.MULTIPLICITY_ELEMENT__IS_ORDERED:
				return isOrdered() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.MULTIPLICITY_ELEMENT__IS_UNIQUE:
				return isUnique() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.MULTIPLICITY_ELEMENT__LOWER:
				return new Integer(getLower());
			case UML2Package.MULTIPLICITY_ELEMENT__UPPER:
				return new Integer(getUpper());
			case UML2Package.MULTIPLICITY_ELEMENT__UPPER_VALUE:
				return getUpperValue();
			case UML2Package.MULTIPLICITY_ELEMENT__LOWER_VALUE:
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
			case UML2Package.MULTIPLICITY_ELEMENT__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.MULTIPLICITY_ELEMENT__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.MULTIPLICITY_ELEMENT__IS_ORDERED:
				setIsOrdered(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.MULTIPLICITY_ELEMENT__IS_UNIQUE:
				setIsUnique(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.MULTIPLICITY_ELEMENT__UPPER_VALUE:
				setUpperValue((ValueSpecification)newValue);
				return;
			case UML2Package.MULTIPLICITY_ELEMENT__LOWER_VALUE:
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
			case UML2Package.MULTIPLICITY_ELEMENT__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.MULTIPLICITY_ELEMENT__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.MULTIPLICITY_ELEMENT__IS_ORDERED:
				setIsOrdered(IS_ORDERED_EDEFAULT);
				return;
			case UML2Package.MULTIPLICITY_ELEMENT__IS_UNIQUE:
				setIsUnique(IS_UNIQUE_EDEFAULT);
				return;
			case UML2Package.MULTIPLICITY_ELEMENT__UPPER_VALUE:
				setUpperValue((ValueSpecification)null);
				return;
			case UML2Package.MULTIPLICITY_ELEMENT__LOWER_VALUE:
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
			case UML2Package.MULTIPLICITY_ELEMENT__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.MULTIPLICITY_ELEMENT__OWNED_ELEMENT:
				return !getOwnedElements().isEmpty();
			case UML2Package.MULTIPLICITY_ELEMENT__OWNER:
				return basicGetOwner() != null;
			case UML2Package.MULTIPLICITY_ELEMENT__OWNED_COMMENT:
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.MULTIPLICITY_ELEMENT__IS_ORDERED:
				return isOrdered != IS_ORDERED_EDEFAULT;
			case UML2Package.MULTIPLICITY_ELEMENT__IS_UNIQUE:
				return isUnique != IS_UNIQUE_EDEFAULT;
			case UML2Package.MULTIPLICITY_ELEMENT__LOWER:
				return getLower() != 1;
			case UML2Package.MULTIPLICITY_ELEMENT__UPPER:
				return getUpper() != 1;
			case UML2Package.MULTIPLICITY_ELEMENT__UPPER_VALUE:
				return upperValue != null;
			case UML2Package.MULTIPLICITY_ELEMENT__LOWER_VALUE:
				return lowerValue != null;
		}
		return eDynamicIsSet(eFeature);
	}

	// <!-- begin-custom-operations -->

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.MultiplicityElement#setLowerBound(int)
	 */
	public void setLowerBound(int value) {
		MultiplicityElementOperations.setLowerBound(this, value);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.MultiplicityElement#setUpperBound(int)
	 */
	public void setUpperBound(int value) {
		MultiplicityElementOperations.setUpperBound(this, value);
	}

	// <!-- end-custom-operations -->

} //MultiplicityElementImpl
