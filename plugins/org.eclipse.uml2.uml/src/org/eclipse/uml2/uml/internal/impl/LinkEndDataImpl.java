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
 * $Id: LinkEndDataImpl.java,v 1.1 2005/11/14 22:26:04 khussey Exp $
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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.uml.InputPin;
import org.eclipse.uml2.uml.LinkEndData;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.QualifierValue;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;

import org.eclipse.uml2.uml.internal.operations.LinkEndDataOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link End Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.LinkEndDataImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.LinkEndDataImpl#getEnd <em>End</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.LinkEndDataImpl#getQualifiers <em>Qualifier</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LinkEndDataImpl
		extends ElementImpl
		implements LinkEndData {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkEndDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.eINSTANCE.getLinkEndData();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin getValue() {
		InputPin value = (InputPin) eVirtualGet(UMLPackage.LINK_END_DATA__VALUE);
		if (value != null && value.eIsProxy()) {
			InputPin oldValue = value;
			value = (InputPin) eResolveProxy((InternalEObject) value);
			if (value != oldValue) {
				eVirtualSet(UMLPackage.LINK_END_DATA__VALUE, value);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.LINK_END_DATA__VALUE, oldValue, value));
			}
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin basicGetValue() {
		return (InputPin) eVirtualGet(UMLPackage.LINK_END_DATA__VALUE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(InputPin newValue) {
		InputPin value = newValue;
		Object oldValue = eVirtualSet(UMLPackage.LINK_END_DATA__VALUE, value);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.LINK_END_DATA__VALUE, oldValue == EVIRTUAL_NO_VALUE
					? null
					: oldValue, value));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getEnd() {
		Property end = (Property) eVirtualGet(UMLPackage.LINK_END_DATA__END);
		if (end != null && end.eIsProxy()) {
			Property oldEnd = end;
			end = (Property) eResolveProxy((InternalEObject) end);
			if (end != oldEnd) {
				eVirtualSet(UMLPackage.LINK_END_DATA__END, end);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.LINK_END_DATA__END, oldEnd, end));
			}
		}
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property basicGetEnd() {
		return (Property) eVirtualGet(UMLPackage.LINK_END_DATA__END);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnd(Property newEnd) {
		Property end = newEnd;
		Object oldEnd = eVirtualSet(UMLPackage.LINK_END_DATA__END, end);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.LINK_END_DATA__END, oldEnd == EVIRTUAL_NO_VALUE
					? null
					: oldEnd, end));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getQualifiers() {
		List qualifier = (List) eVirtualGet(UMLPackage.LINK_END_DATA__QUALIFIER);
		if (qualifier == null) {
			eVirtualSet(UMLPackage.LINK_END_DATA__QUALIFIER,
				qualifier = new EObjectContainmentEList(QualifierValue.class,
					this, UMLPackage.LINK_END_DATA__QUALIFIER));
		}
		return qualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualifierValue createQualifier() {
		QualifierValue newQualifier = UMLFactory.eINSTANCE
			.createQualifierValue();
		getQualifiers().add(newQualifier);
		return newQualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertyIsAssociationEnd(
			DiagnosticChain diagnostics, Map context) {
		return LinkEndDataOperations.validatePropertyIsAssociationEnd(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSameType(DiagnosticChain diagnostics, Map context) {
		return LinkEndDataOperations.validateSameType(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultiplicity(DiagnosticChain diagnostics, Map context) {
		return LinkEndDataOperations.validateMultiplicity(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQualifiers(DiagnosticChain diagnostics, Map context) {
		return LinkEndDataOperations.validateQualifiers(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEndObjectInputPin(DiagnosticChain diagnostics,
			Map context) {
		return LinkEndDataOperations.validateEndObjectInputPin(this,
			diagnostics, context);
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
				case UMLPackage.LINK_END_DATA__EANNOTATIONS :
					return ((InternalEList) getEAnnotations()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.LINK_END_DATA__OWNED_COMMENT :
					return ((InternalEList) getOwnedComments()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.LINK_END_DATA__QUALIFIER :
					return ((InternalEList) getQualifiers()).basicRemove(
						otherEnd, msgs);
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
			case UMLPackage.LINK_END_DATA__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.LINK_END_DATA__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.LINK_END_DATA__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.LINK_END_DATA__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.LINK_END_DATA__VALUE :
				if (resolve)
					return getValue();
				return basicGetValue();
			case UMLPackage.LINK_END_DATA__END :
				if (resolve)
					return getEnd();
				return basicGetEnd();
			case UMLPackage.LINK_END_DATA__QUALIFIER :
				return getQualifiers();
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
			case UMLPackage.LINK_END_DATA__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.LINK_END_DATA__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.LINK_END_DATA__VALUE :
				setValue((InputPin) newValue);
				return;
			case UMLPackage.LINK_END_DATA__END :
				setEnd((Property) newValue);
				return;
			case UMLPackage.LINK_END_DATA__QUALIFIER :
				getQualifiers().clear();
				getQualifiers().addAll((Collection) newValue);
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
			case UMLPackage.LINK_END_DATA__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.LINK_END_DATA__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.LINK_END_DATA__VALUE :
				setValue((InputPin) null);
				return;
			case UMLPackage.LINK_END_DATA__END :
				setEnd((Property) null);
				return;
			case UMLPackage.LINK_END_DATA__QUALIFIER :
				getQualifiers().clear();
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
			case UMLPackage.LINK_END_DATA__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.LINK_END_DATA__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.LINK_END_DATA__OWNER :
				return isSetOwner();
			case UMLPackage.LINK_END_DATA__OWNED_COMMENT :
				List ownedComment = (List) eVirtualGet(UMLPackage.LINK_END_DATA__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.LINK_END_DATA__VALUE :
				return eVirtualGet(UMLPackage.LINK_END_DATA__VALUE) != null;
			case UMLPackage.LINK_END_DATA__END :
				return eVirtualGet(UMLPackage.LINK_END_DATA__END) != null;
			case UMLPackage.LINK_END_DATA__QUALIFIER :
				List qualifier = (List) eVirtualGet(UMLPackage.LINK_END_DATA__QUALIFIER);
				return qualifier != null && !qualifier.isEmpty();
		}
		return eDynamicIsSet(eFeature);
	}

} //LinkEndDataImpl
