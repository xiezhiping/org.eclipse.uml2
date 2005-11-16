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
 * $Id: ConnectorEndImpl.java,v 1.2 2005/11/16 19:03:04 khussey Exp $
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

import org.eclipse.uml2.uml.ConnectableElement;
import org.eclipse.uml2.uml.ConnectorEnd;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.ValueSpecification;

import org.eclipse.uml2.uml.internal.operations.ConnectorEndOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector End</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ConnectorEndImpl#getDefiningEnd <em>Defining End</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ConnectorEndImpl#getPartWithPort <em>Part With Port</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ConnectorEndImpl#getRole <em>Role</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConnectorEndImpl
		extends MultiplicityElementImpl
		implements ConnectorEnd {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectorEndImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.eINSTANCE.getConnectorEnd();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getDefiningEnd() {
		Property definingEnd = basicGetDefiningEnd();
		return definingEnd == null
			? null
			: (definingEnd.eIsProxy()
				? (Property) eResolveProxy((InternalEObject) definingEnd)
				: definingEnd);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property basicGetDefiningEnd() {
		return ConnectorEndOperations.getDefiningEnd(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getPartWithPort() {
		Property partWithPort = (Property) eVirtualGet(UMLPackage.CONNECTOR_END__PART_WITH_PORT);
		if (partWithPort != null && partWithPort.eIsProxy()) {
			Property oldPartWithPort = partWithPort;
			partWithPort = (Property) eResolveProxy((InternalEObject) partWithPort);
			if (partWithPort != oldPartWithPort) {
				eVirtualSet(UMLPackage.CONNECTOR_END__PART_WITH_PORT,
					partWithPort);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.CONNECTOR_END__PART_WITH_PORT,
						oldPartWithPort, partWithPort));
			}
		}
		return partWithPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property basicGetPartWithPort() {
		return (Property) eVirtualGet(UMLPackage.CONNECTOR_END__PART_WITH_PORT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartWithPort(Property newPartWithPort) {
		Property partWithPort = newPartWithPort;
		Object oldPartWithPort = eVirtualSet(
			UMLPackage.CONNECTOR_END__PART_WITH_PORT, partWithPort);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.CONNECTOR_END__PART_WITH_PORT,
				oldPartWithPort == EVIRTUAL_NO_VALUE
					? null
					: oldPartWithPort, partWithPort));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectableElement getRole() {
		ConnectableElement role = (ConnectableElement) eVirtualGet(UMLPackage.CONNECTOR_END__ROLE);
		if (role != null && role.eIsProxy()) {
			ConnectableElement oldRole = role;
			role = (ConnectableElement) eResolveProxy((InternalEObject) role);
			if (role != oldRole) {
				eVirtualSet(UMLPackage.CONNECTOR_END__ROLE, role);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.CONNECTOR_END__ROLE, oldRole, role));
			}
		}
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectableElement basicGetRole() {
		return (ConnectableElement) eVirtualGet(UMLPackage.CONNECTOR_END__ROLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRole(ConnectableElement newRole,
			NotificationChain msgs) {
		Object oldRole = eVirtualSet(UMLPackage.CONNECTOR_END__ROLE, newRole);
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET, UMLPackage.CONNECTOR_END__ROLE,
				oldRole == EVIRTUAL_NO_VALUE
					? null
					: oldRole, newRole);
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
	public void setRole(ConnectableElement newRole) {
		ConnectableElement role = (ConnectableElement) eVirtualGet(UMLPackage.CONNECTOR_END__ROLE);
		if (newRole != role) {
			NotificationChain msgs = null;
			if (role != null)
				msgs = ((InternalEObject) role).eInverseRemove(this,
					UMLPackage.CONNECTABLE_ELEMENT__END,
					ConnectableElement.class, msgs);
			if (newRole != null)
				msgs = ((InternalEObject) newRole).eInverseAdd(this,
					UMLPackage.CONNECTABLE_ELEMENT__END,
					ConnectableElement.class, msgs);
			msgs = basicSetRole(newRole, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.CONNECTOR_END__ROLE, newRole, newRole));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultiplicity(DiagnosticChain diagnostics, Map context) {
		return ConnectorEndOperations.validateMultiplicity(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePartWithPortEmpty(DiagnosticChain diagnostics,
			Map context) {
		return ConnectorEndOperations.validatePartWithPortEmpty(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoleAndPartWithPort(DiagnosticChain diagnostics,
			Map context) {
		return ConnectorEndOperations.validateRoleAndPartWithPort(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSelfPartWithPort(DiagnosticChain diagnostics,
			Map context) {
		return ConnectorEndOperations.validateSelfPartWithPort(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UMLPackage.CONNECTOR_END__EANNOTATIONS :
					return ((InternalEList) getEAnnotations()).basicAdd(
						otherEnd, msgs);
				case UMLPackage.CONNECTOR_END__ROLE :
					ConnectableElement role = (ConnectableElement) eVirtualGet(UMLPackage.CONNECTOR_END__ROLE);
					if (role != null)
						msgs = ((InternalEObject) role).eInverseRemove(this,
							UMLPackage.CONNECTABLE_ELEMENT__END,
							ConnectableElement.class, msgs);
					return basicSetRole((ConnectableElement) otherEnd, msgs);
				default :
					return eDynamicInverseAdd(otherEnd, featureID, baseClass,
						msgs);
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UMLPackage.CONNECTOR_END__EANNOTATIONS :
					return ((InternalEList) getEAnnotations()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.CONNECTOR_END__OWNED_COMMENT :
					return ((InternalEList) getOwnedComments()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.CONNECTOR_END__UPPER_VALUE :
					return basicSetUpperValue(null, msgs);
				case UMLPackage.CONNECTOR_END__LOWER_VALUE :
					return basicSetLowerValue(null, msgs);
				case UMLPackage.CONNECTOR_END__ROLE :
					return basicSetRole(null, msgs);
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
			case UMLPackage.CONNECTOR_END__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.CONNECTOR_END__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.CONNECTOR_END__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.CONNECTOR_END__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.CONNECTOR_END__IS_ORDERED :
				return isOrdered()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.CONNECTOR_END__IS_UNIQUE :
				return isUnique()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.CONNECTOR_END__UPPER :
				return new Integer(getUpper());
			case UMLPackage.CONNECTOR_END__LOWER :
				return new Integer(getLower());
			case UMLPackage.CONNECTOR_END__UPPER_VALUE :
				return getUpperValue();
			case UMLPackage.CONNECTOR_END__LOWER_VALUE :
				return getLowerValue();
			case UMLPackage.CONNECTOR_END__DEFINING_END :
				if (resolve)
					return getDefiningEnd();
				return basicGetDefiningEnd();
			case UMLPackage.CONNECTOR_END__PART_WITH_PORT :
				if (resolve)
					return getPartWithPort();
				return basicGetPartWithPort();
			case UMLPackage.CONNECTOR_END__ROLE :
				if (resolve)
					return getRole();
				return basicGetRole();
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
			case UMLPackage.CONNECTOR_END__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.CONNECTOR_END__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.CONNECTOR_END__IS_ORDERED :
				setIsOrdered(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.CONNECTOR_END__IS_UNIQUE :
				setIsUnique(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.CONNECTOR_END__UPPER :
				setUpper(((Integer) newValue).intValue());
				return;
			case UMLPackage.CONNECTOR_END__LOWER :
				setLower(((Integer) newValue).intValue());
				return;
			case UMLPackage.CONNECTOR_END__UPPER_VALUE :
				setUpperValue((ValueSpecification) newValue);
				return;
			case UMLPackage.CONNECTOR_END__LOWER_VALUE :
				setLowerValue((ValueSpecification) newValue);
				return;
			case UMLPackage.CONNECTOR_END__PART_WITH_PORT :
				setPartWithPort((Property) newValue);
				return;
			case UMLPackage.CONNECTOR_END__ROLE :
				setRole((ConnectableElement) newValue);
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
			case UMLPackage.CONNECTOR_END__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.CONNECTOR_END__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.CONNECTOR_END__IS_ORDERED :
				setIsOrdered(IS_ORDERED_EDEFAULT);
				return;
			case UMLPackage.CONNECTOR_END__IS_UNIQUE :
				setIsUnique(IS_UNIQUE_EDEFAULT);
				return;
			case UMLPackage.CONNECTOR_END__UPPER :
				setUpper(UPPER_EDEFAULT);
				return;
			case UMLPackage.CONNECTOR_END__LOWER :
				setLower(LOWER_EDEFAULT);
				return;
			case UMLPackage.CONNECTOR_END__UPPER_VALUE :
				setUpperValue((ValueSpecification) null);
				return;
			case UMLPackage.CONNECTOR_END__LOWER_VALUE :
				setLowerValue((ValueSpecification) null);
				return;
			case UMLPackage.CONNECTOR_END__PART_WITH_PORT :
				setPartWithPort((Property) null);
				return;
			case UMLPackage.CONNECTOR_END__ROLE :
				setRole((ConnectableElement) null);
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
			case UMLPackage.CONNECTOR_END__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.CONNECTOR_END__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.CONNECTOR_END__OWNER :
				return isSetOwner();
			case UMLPackage.CONNECTOR_END__OWNED_COMMENT :
				List ownedComment = (List) eVirtualGet(UMLPackage.CONNECTOR_END__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.CONNECTOR_END__IS_ORDERED :
				return ((eFlags & IS_ORDERED_EFLAG) != 0) != IS_ORDERED_EDEFAULT;
			case UMLPackage.CONNECTOR_END__IS_UNIQUE :
				return ((eFlags & IS_UNIQUE_EFLAG) != 0) != IS_UNIQUE_EDEFAULT;
			case UMLPackage.CONNECTOR_END__UPPER :
				return getUpper() != UPPER_EDEFAULT;
			case UMLPackage.CONNECTOR_END__LOWER :
				return getLower() != LOWER_EDEFAULT;
			case UMLPackage.CONNECTOR_END__UPPER_VALUE :
				return eVirtualGet(UMLPackage.CONNECTOR_END__UPPER_VALUE) != null;
			case UMLPackage.CONNECTOR_END__LOWER_VALUE :
				return eVirtualGet(UMLPackage.CONNECTOR_END__LOWER_VALUE) != null;
			case UMLPackage.CONNECTOR_END__DEFINING_END :
				return basicGetDefiningEnd() != null;
			case UMLPackage.CONNECTOR_END__PART_WITH_PORT :
				return eVirtualGet(UMLPackage.CONNECTOR_END__PART_WITH_PORT) != null;
			case UMLPackage.CONNECTOR_END__ROLE :
				return eVirtualGet(UMLPackage.CONNECTOR_END__ROLE) != null;
		}
		return eDynamicIsSet(eFeature);
	}

} //ConnectorEndImpl
