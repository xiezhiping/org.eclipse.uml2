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
 * $Id: MultiplicityElementImpl.java,v 1.2 2005/11/16 19:03:04 khussey Exp $
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

import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.MultiplicityElement;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.ValueSpecification;

import org.eclipse.uml2.uml.internal.operations.MultiplicityElementOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multiplicity Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.MultiplicityElementImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.MultiplicityElementImpl#isOrdered <em>Is Ordered</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.MultiplicityElementImpl#isUnique <em>Is Unique</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.MultiplicityElementImpl#getUpper <em>Upper</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.MultiplicityElementImpl#getLower <em>Lower</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.MultiplicityElementImpl#getUpperValue <em>Upper Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.MultiplicityElementImpl#getLowerValue <em>Lower Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class MultiplicityElementImpl
		extends ElementImpl
		implements MultiplicityElement {

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
	protected static final int IS_ORDERED_EFLAG = 1 << 8;

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
	protected static final int IS_UNIQUE_EFLAG = 1 << 9;

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
	 * The default value of the '{@link #getLower() <em>Lower</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLower()
	 * @generated
	 * @ordered
	 */
	protected static final int LOWER_EDEFAULT = 1;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultiplicityElementImpl() {
		super();
		eFlags |= IS_UNIQUE_EFLAG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.eINSTANCE.getMultiplicityElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getOwnedElements() {
		List ownedElement = (List) eVirtualGet(UMLPackage.MULTIPLICITY_ELEMENT__OWNED_ELEMENT);
		if (ownedElement == null) {
			eVirtualSet(UMLPackage.MULTIPLICITY_ELEMENT__OWNED_ELEMENT,
				ownedElement = new DerivedUnionEObjectEList(Element.class,
					this, UMLPackage.MULTIPLICITY_ELEMENT__OWNED_ELEMENT,
					new EStructuralFeature[]{
						UMLPackage.eINSTANCE.getElement_OwnedComment(),
						UMLPackage.eINSTANCE
							.getMultiplicityElement_UpperValue(),
						UMLPackage.eINSTANCE
							.getMultiplicityElement_LowerValue()}));
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
				UMLPackage.MULTIPLICITY_ELEMENT__IS_ORDERED, oldIsOrdered,
				newIsOrdered));

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
				UMLPackage.MULTIPLICITY_ELEMENT__IS_UNIQUE, oldIsUnique,
				newIsUnique));

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
	public ValueSpecification getUpperValue() {
		ValueSpecification upperValue = (ValueSpecification) eVirtualGet(UMLPackage.MULTIPLICITY_ELEMENT__UPPER_VALUE);
		return upperValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpperValue(
			ValueSpecification newUpperValue, NotificationChain msgs) {
		Object oldUpperValue = eVirtualSet(
			UMLPackage.MULTIPLICITY_ELEMENT__UPPER_VALUE, newUpperValue);
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET, UMLPackage.MULTIPLICITY_ELEMENT__UPPER_VALUE,
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
		ValueSpecification upperValue = (ValueSpecification) eVirtualGet(UMLPackage.MULTIPLICITY_ELEMENT__UPPER_VALUE);
		if (newUpperValue != upperValue) {
			NotificationChain msgs = null;
			if (upperValue != null)
				msgs = ((InternalEObject) upperValue).eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.MULTIPLICITY_ELEMENT__UPPER_VALUE, null,
					msgs);
			if (newUpperValue != null)
				msgs = ((InternalEObject) newUpperValue).eInverseAdd(this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.MULTIPLICITY_ELEMENT__UPPER_VALUE, null,
					msgs);
			msgs = basicSetUpperValue(newUpperValue, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.MULTIPLICITY_ELEMENT__UPPER_VALUE, newUpperValue,
				newUpperValue));

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
		ValueSpecification lowerValue = (ValueSpecification) eVirtualGet(UMLPackage.MULTIPLICITY_ELEMENT__LOWER_VALUE);
		return lowerValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLowerValue(
			ValueSpecification newLowerValue, NotificationChain msgs) {
		Object oldLowerValue = eVirtualSet(
			UMLPackage.MULTIPLICITY_ELEMENT__LOWER_VALUE, newLowerValue);
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET, UMLPackage.MULTIPLICITY_ELEMENT__LOWER_VALUE,
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
		ValueSpecification lowerValue = (ValueSpecification) eVirtualGet(UMLPackage.MULTIPLICITY_ELEMENT__LOWER_VALUE);
		if (newLowerValue != lowerValue) {
			NotificationChain msgs = null;
			if (lowerValue != null)
				msgs = ((InternalEObject) lowerValue).eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.MULTIPLICITY_ELEMENT__LOWER_VALUE, null,
					msgs);
			if (newLowerValue != null)
				msgs = ((InternalEObject) newLowerValue).eInverseAdd(this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.MULTIPLICITY_ELEMENT__LOWER_VALUE, null,
					msgs);
			msgs = basicSetLowerValue(newLowerValue, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.MULTIPLICITY_ELEMENT__LOWER_VALUE, newLowerValue,
				newLowerValue));

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
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UMLPackage.MULTIPLICITY_ELEMENT__EANNOTATIONS :
					return ((InternalEList) getEAnnotations()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.MULTIPLICITY_ELEMENT__OWNED_COMMENT :
					return ((InternalEList) getOwnedComments()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.MULTIPLICITY_ELEMENT__UPPER_VALUE :
					return basicSetUpperValue(null, msgs);
				case UMLPackage.MULTIPLICITY_ELEMENT__LOWER_VALUE :
					return basicSetLowerValue(null, msgs);
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
			case UMLPackage.MULTIPLICITY_ELEMENT__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.MULTIPLICITY_ELEMENT__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.MULTIPLICITY_ELEMENT__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.MULTIPLICITY_ELEMENT__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.MULTIPLICITY_ELEMENT__IS_ORDERED :
				return isOrdered()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.MULTIPLICITY_ELEMENT__IS_UNIQUE :
				return isUnique()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.MULTIPLICITY_ELEMENT__UPPER :
				return new Integer(getUpper());
			case UMLPackage.MULTIPLICITY_ELEMENT__LOWER :
				return new Integer(getLower());
			case UMLPackage.MULTIPLICITY_ELEMENT__UPPER_VALUE :
				return getUpperValue();
			case UMLPackage.MULTIPLICITY_ELEMENT__LOWER_VALUE :
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
			case UMLPackage.MULTIPLICITY_ELEMENT__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.MULTIPLICITY_ELEMENT__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.MULTIPLICITY_ELEMENT__IS_ORDERED :
				setIsOrdered(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.MULTIPLICITY_ELEMENT__IS_UNIQUE :
				setIsUnique(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.MULTIPLICITY_ELEMENT__UPPER :
				setUpper(((Integer) newValue).intValue());
				return;
			case UMLPackage.MULTIPLICITY_ELEMENT__LOWER :
				setLower(((Integer) newValue).intValue());
				return;
			case UMLPackage.MULTIPLICITY_ELEMENT__UPPER_VALUE :
				setUpperValue((ValueSpecification) newValue);
				return;
			case UMLPackage.MULTIPLICITY_ELEMENT__LOWER_VALUE :
				setLowerValue((ValueSpecification) newValue);
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
			case UMLPackage.MULTIPLICITY_ELEMENT__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.MULTIPLICITY_ELEMENT__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.MULTIPLICITY_ELEMENT__IS_ORDERED :
				setIsOrdered(IS_ORDERED_EDEFAULT);
				return;
			case UMLPackage.MULTIPLICITY_ELEMENT__IS_UNIQUE :
				setIsUnique(IS_UNIQUE_EDEFAULT);
				return;
			case UMLPackage.MULTIPLICITY_ELEMENT__UPPER :
				setUpper(UPPER_EDEFAULT);
				return;
			case UMLPackage.MULTIPLICITY_ELEMENT__LOWER :
				setLower(LOWER_EDEFAULT);
				return;
			case UMLPackage.MULTIPLICITY_ELEMENT__UPPER_VALUE :
				setUpperValue((ValueSpecification) null);
				return;
			case UMLPackage.MULTIPLICITY_ELEMENT__LOWER_VALUE :
				setLowerValue((ValueSpecification) null);
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
			case UMLPackage.MULTIPLICITY_ELEMENT__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.MULTIPLICITY_ELEMENT__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.MULTIPLICITY_ELEMENT__OWNER :
				return isSetOwner();
			case UMLPackage.MULTIPLICITY_ELEMENT__OWNED_COMMENT :
				List ownedComment = (List) eVirtualGet(UMLPackage.MULTIPLICITY_ELEMENT__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.MULTIPLICITY_ELEMENT__IS_ORDERED :
				return ((eFlags & IS_ORDERED_EFLAG) != 0) != IS_ORDERED_EDEFAULT;
			case UMLPackage.MULTIPLICITY_ELEMENT__IS_UNIQUE :
				return ((eFlags & IS_UNIQUE_EFLAG) != 0) != IS_UNIQUE_EDEFAULT;
			case UMLPackage.MULTIPLICITY_ELEMENT__UPPER :
				return getUpper() != UPPER_EDEFAULT;
			case UMLPackage.MULTIPLICITY_ELEMENT__LOWER :
				return getLower() != LOWER_EDEFAULT;
			case UMLPackage.MULTIPLICITY_ELEMENT__UPPER_VALUE :
				return eVirtualGet(UMLPackage.MULTIPLICITY_ELEMENT__UPPER_VALUE) != null;
			case UMLPackage.MULTIPLICITY_ELEMENT__LOWER_VALUE :
				return eVirtualGet(UMLPackage.MULTIPLICITY_ELEMENT__LOWER_VALUE) != null;
		}
		return eDynamicIsSet(eFeature);
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
			|| eIsSet(UMLPackage.eINSTANCE.getMultiplicityElement_UpperValue())
			|| eIsSet(UMLPackage.eINSTANCE.getMultiplicityElement_LowerValue());
	}

} //MultiplicityElementImpl
