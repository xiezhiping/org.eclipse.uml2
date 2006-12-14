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
 * $Id: ConnectorEndImpl.java,v 1.15 2006/12/14 15:49:29 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.uml.Comment;
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
	 * The cached value of the '{@link #getPartWithPort() <em>Part With Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartWithPort()
	 * @generated
	 * @ordered
	 */
	protected Property partWithPort = null;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected ConnectableElement role = null;

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
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.CONNECTOR_END;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getDefiningEnd() {
		Property definingEnd = basicGetDefiningEnd();
		return definingEnd != null && definingEnd.eIsProxy()
			? (Property) eResolveProxy((InternalEObject) definingEnd)
			: definingEnd;
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
		if (partWithPort != null && partWithPort.eIsProxy()) {
			InternalEObject oldPartWithPort = (InternalEObject) partWithPort;
			partWithPort = (Property) eResolveProxy(oldPartWithPort);
			if (partWithPort != oldPartWithPort) {
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
		return partWithPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartWithPort(Property newPartWithPort) {

		Property oldPartWithPort = partWithPort;
		partWithPort = newPartWithPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.CONNECTOR_END__PART_WITH_PORT, oldPartWithPort,
				partWithPort));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectableElement getRole() {
		if (role != null && role.eIsProxy()) {
			InternalEObject oldRole = (InternalEObject) role;
			role = (ConnectableElement) eResolveProxy(oldRole);
			if (role != oldRole) {
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
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRole(ConnectableElement newRole,
			NotificationChain msgs) {
		ConnectableElement oldRole = role;
		role = newRole;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET, UMLPackage.CONNECTOR_END__ROLE, oldRole,
				newRole);
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
	public boolean validateMultiplicity(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConnectorEndOperations.validateMultiplicity(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePartWithPortEmpty(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConnectorEndOperations.validatePartWithPortEmpty(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoleAndPartWithPort(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConnectorEndOperations.validateRoleAndPartWithPort(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSelfPartWithPort(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConnectorEndOperations.validateSelfPartWithPort(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.CONNECTOR_END__EANNOTATIONS :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getEAnnotations())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.CONNECTOR_END__ROLE :
				if (role != null)
					msgs = ((InternalEObject) role).eInverseRemove(this,
						UMLPackage.CONNECTABLE_ELEMENT__END,
						ConnectableElement.class, msgs);
				return basicSetRole((ConnectableElement) otherEnd, msgs);
		}
		return eDynamicInverseAdd(otherEnd, featureID, msgs);
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
			case UMLPackage.CONNECTOR_END__EANNOTATIONS :
				return ((InternalEList<?>) getEAnnotations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.CONNECTOR_END__OWNED_COMMENT :
				return ((InternalEList<?>) getOwnedComments()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.CONNECTOR_END__UPPER_VALUE :
				return basicSetUpperValue(null, msgs);
			case UMLPackage.CONNECTOR_END__LOWER_VALUE :
				return basicSetLowerValue(null, msgs);
			case UMLPackage.CONNECTOR_END__ROLE :
				return basicSetRole(null, msgs);
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
				if (resolve)
					return getUpperValue();
				return basicGetUpperValue();
			case UMLPackage.CONNECTOR_END__LOWER_VALUE :
				if (resolve)
					return getLowerValue();
				return basicGetLowerValue();
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
			case UMLPackage.CONNECTOR_END__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll(
					(Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.CONNECTOR_END__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll(
					(Collection<? extends Comment>) newValue);
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
			case UMLPackage.CONNECTOR_END__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.CONNECTOR_END__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.CONNECTOR_END__OWNER :
				return isSetOwner();
			case UMLPackage.CONNECTOR_END__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.CONNECTOR_END__IS_ORDERED :
				return ((eFlags & IS_ORDERED_EFLAG) != 0) != IS_ORDERED_EDEFAULT;
			case UMLPackage.CONNECTOR_END__IS_UNIQUE :
				return ((eFlags & IS_UNIQUE_EFLAG) != 0) != IS_UNIQUE_EDEFAULT;
			case UMLPackage.CONNECTOR_END__UPPER :
				return getUpper() != UPPER_EDEFAULT;
			case UMLPackage.CONNECTOR_END__LOWER :
				return getLower() != LOWER_EDEFAULT;
			case UMLPackage.CONNECTOR_END__UPPER_VALUE :
				return upperValue != null;
			case UMLPackage.CONNECTOR_END__LOWER_VALUE :
				return lowerValue != null;
			case UMLPackage.CONNECTOR_END__DEFINING_END :
				return basicGetDefiningEnd() != null;
			case UMLPackage.CONNECTOR_END__PART_WITH_PORT :
				return partWithPort != null;
			case UMLPackage.CONNECTOR_END__ROLE :
				return role != null;
		}
		return eDynamicIsSet(featureID);
	}

} //ConnectorEndImpl
