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
 * $Id: LinkEndDataImpl.java,v 1.12 2006/11/14 18:02:20 khussey Exp $
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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.uml.InputPin;
import org.eclipse.uml2.uml.LinkEndData;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.QualifierValue;
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
	 * The cached value of the '{@link #getValue() <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected InputPin value = null;

	/**
	 * The cached value of the '{@link #getEnd() <em>End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected Property end = null;

	/**
	 * The cached value of the '{@link #getQualifiers() <em>Qualifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifiers()
	 * @generated
	 * @ordered
	 */
	protected EList qualifiers = null;

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
		return UMLPackage.Literals.LINK_END_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin getValue() {
		if (value != null && value.eIsProxy()) {
			InternalEObject oldValue = (InternalEObject) value;
			value = (InputPin) eResolveProxy(oldValue);
			if (value != oldValue) {
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
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(InputPin newValue) {

		InputPin oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.LINK_END_DATA__VALUE, oldValue, value));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getEnd() {
		if (end != null && end.eIsProxy()) {
			InternalEObject oldEnd = (InternalEObject) end;
			end = (Property) eResolveProxy(oldEnd);
			if (end != oldEnd) {
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
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnd(Property newEnd) {

		Property oldEnd = end;
		end = newEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.LINK_END_DATA__END, oldEnd, end));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getQualifiers() {
		if (qualifiers == null) {
			qualifiers = new EObjectContainmentEList.Resolving(
				QualifierValue.class, this, UMLPackage.LINK_END_DATA__QUALIFIER);
		}
		return qualifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualifierValue createQualifier() {
		QualifierValue newQualifier = (QualifierValue) create(UMLPackage.Literals.QUALIFIER_VALUE);
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
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.LINK_END_DATA__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.LINK_END_DATA__OWNED_COMMENT :
				return ((InternalEList) getOwnedComments()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.LINK_END_DATA__QUALIFIER :
				return ((InternalEList) getQualifiers()).basicRemove(otherEnd,
					msgs);
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
		return eDynamicGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
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
		eDynamicSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
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
		eDynamicUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UMLPackage.LINK_END_DATA__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.LINK_END_DATA__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.LINK_END_DATA__OWNER :
				return isSetOwner();
			case UMLPackage.LINK_END_DATA__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.LINK_END_DATA__VALUE :
				return value != null;
			case UMLPackage.LINK_END_DATA__END :
				return end != null;
			case UMLPackage.LINK_END_DATA__QUALIFIER :
				return qualifiers != null && !qualifiers.isEmpty();
		}
		return eDynamicIsSet(featureID);
	}

} //LinkEndDataImpl
