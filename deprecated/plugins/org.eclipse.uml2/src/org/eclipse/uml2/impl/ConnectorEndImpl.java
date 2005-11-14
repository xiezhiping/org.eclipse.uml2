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
 * $Id: ConnectorEndImpl.java,v 1.13 2005/11/14 17:31:10 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.uml2.Association;
import org.eclipse.uml2.ConnectableElement;
import org.eclipse.uml2.Connector;
import org.eclipse.uml2.ConnectorEnd;
import org.eclipse.uml2.Property;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.ValueSpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector End</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.ConnectorEndImpl#getDefiningEnd <em>Defining End</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ConnectorEndImpl#getRole <em>Role</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ConnectorEndImpl#getPartWithPort <em>Part With Port</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConnectorEndImpl extends MultiplicityElementImpl implements ConnectorEnd {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

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
		return UML2Package.eINSTANCE.getConnectorEnd();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getDefiningEnd() {
		Property definingEnd = basicGetDefiningEnd();
		return definingEnd == null ? null : (definingEnd.eIsProxy() ? (Property)eResolveProxy((InternalEObject)definingEnd) : definingEnd);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Property basicGetDefiningEnd() {

		if (Connector.class.isInstance(eContainer)) {
			Connector connector = (Connector) eContainer;
			Association type = connector.getType();

			if (null != type) {
				List ends = connector.getEnds();
				List memberEnds = type.getMemberEnds();

				if (ends.size() == memberEnds.size()) {
					return (Property) memberEnds.get(ends.indexOf(this));
				}
			}
		}

		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectableElement getRole() {
		ConnectableElement role = (ConnectableElement)eVirtualGet(UML2Package.CONNECTOR_END__ROLE);
		if (role != null && role.eIsProxy()) {
			ConnectableElement oldRole = role;
			role = (ConnectableElement)eResolveProxy((InternalEObject)role);
			if (role != oldRole) {
				eVirtualSet(UML2Package.CONNECTOR_END__ROLE, role);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2Package.CONNECTOR_END__ROLE, oldRole, role));
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
		return (ConnectableElement)eVirtualGet(UML2Package.CONNECTOR_END__ROLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRole(ConnectableElement newRole, NotificationChain msgs) {
		Object oldRole = eVirtualSet(UML2Package.CONNECTOR_END__ROLE, newRole);
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UML2Package.CONNECTOR_END__ROLE, oldRole == EVIRTUAL_NO_VALUE ? null : oldRole, newRole);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole(ConnectableElement newRole) {
		ConnectableElement role = (ConnectableElement)eVirtualGet(UML2Package.CONNECTOR_END__ROLE);
		if (newRole != role) {
			NotificationChain msgs = null;
			if (role != null)
				msgs = ((InternalEObject)role).eInverseRemove(this, UML2Package.CONNECTABLE_ELEMENT__END, ConnectableElement.class, msgs);
			if (newRole != null)
				msgs = ((InternalEObject)newRole).eInverseAdd(this, UML2Package.CONNECTABLE_ELEMENT__END, ConnectableElement.class, msgs);
			msgs = basicSetRole(newRole, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.CONNECTOR_END__ROLE, newRole, newRole));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getPartWithPort() {
		Property partWithPort = (Property)eVirtualGet(UML2Package.CONNECTOR_END__PART_WITH_PORT);
		if (partWithPort != null && partWithPort.eIsProxy()) {
			Property oldPartWithPort = partWithPort;
			partWithPort = (Property)eResolveProxy((InternalEObject)partWithPort);
			if (partWithPort != oldPartWithPort) {
				eVirtualSet(UML2Package.CONNECTOR_END__PART_WITH_PORT, partWithPort);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2Package.CONNECTOR_END__PART_WITH_PORT, oldPartWithPort, partWithPort));
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
		return (Property)eVirtualGet(UML2Package.CONNECTOR_END__PART_WITH_PORT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartWithPort(Property newPartWithPort) {
		Property partWithPort = newPartWithPort;
		Object oldPartWithPort = eVirtualSet(UML2Package.CONNECTOR_END__PART_WITH_PORT, partWithPort);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.CONNECTOR_END__PART_WITH_PORT, oldPartWithPort == EVIRTUAL_NO_VALUE ? null : oldPartWithPort, partWithPort));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UML2Package.CONNECTOR_END__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicAdd(otherEnd, msgs);
				case UML2Package.CONNECTOR_END__ROLE:
					ConnectableElement role = (ConnectableElement)eVirtualGet(UML2Package.CONNECTOR_END__ROLE);
					if (role != null)
						msgs = ((InternalEObject)role).eInverseRemove(this, UML2Package.CONNECTABLE_ELEMENT__END, ConnectableElement.class, msgs);
					return basicSetRole((ConnectableElement)otherEnd, msgs);
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
				case UML2Package.CONNECTOR_END__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
				case UML2Package.CONNECTOR_END__OWNED_COMMENT:
					return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
				case UML2Package.CONNECTOR_END__UPPER_VALUE:
					return basicSetUpperValue(null, msgs);
				case UML2Package.CONNECTOR_END__LOWER_VALUE:
					return basicSetLowerValue(null, msgs);
				case UML2Package.CONNECTOR_END__ROLE:
					return basicSetRole(null, msgs);
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
			case UML2Package.CONNECTOR_END__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.CONNECTOR_END__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.CONNECTOR_END__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.CONNECTOR_END__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.CONNECTOR_END__IS_ORDERED:
				return isOrdered() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.CONNECTOR_END__IS_UNIQUE:
				return isUnique() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.CONNECTOR_END__LOWER:
				return new Integer(getLower());
			case UML2Package.CONNECTOR_END__UPPER:
				return new Integer(getUpper());
			case UML2Package.CONNECTOR_END__UPPER_VALUE:
				return getUpperValue();
			case UML2Package.CONNECTOR_END__LOWER_VALUE:
				return getLowerValue();
			case UML2Package.CONNECTOR_END__DEFINING_END:
				if (resolve) return getDefiningEnd();
				return basicGetDefiningEnd();
			case UML2Package.CONNECTOR_END__ROLE:
				if (resolve) return getRole();
				return basicGetRole();
			case UML2Package.CONNECTOR_END__PART_WITH_PORT:
				if (resolve) return getPartWithPort();
				return basicGetPartWithPort();
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
			case UML2Package.CONNECTOR_END__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.CONNECTOR_END__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.CONNECTOR_END__IS_ORDERED:
				setIsOrdered(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.CONNECTOR_END__IS_UNIQUE:
				setIsUnique(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.CONNECTOR_END__UPPER_VALUE:
				setUpperValue((ValueSpecification)newValue);
				return;
			case UML2Package.CONNECTOR_END__LOWER_VALUE:
				setLowerValue((ValueSpecification)newValue);
				return;
			case UML2Package.CONNECTOR_END__ROLE:
				setRole((ConnectableElement)newValue);
				return;
			case UML2Package.CONNECTOR_END__PART_WITH_PORT:
				setPartWithPort((Property)newValue);
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
			case UML2Package.CONNECTOR_END__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.CONNECTOR_END__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.CONNECTOR_END__IS_ORDERED:
				setIsOrdered(IS_ORDERED_EDEFAULT);
				return;
			case UML2Package.CONNECTOR_END__IS_UNIQUE:
				setIsUnique(IS_UNIQUE_EDEFAULT);
				return;
			case UML2Package.CONNECTOR_END__UPPER_VALUE:
				setUpperValue((ValueSpecification)null);
				return;
			case UML2Package.CONNECTOR_END__LOWER_VALUE:
				setLowerValue((ValueSpecification)null);
				return;
			case UML2Package.CONNECTOR_END__ROLE:
				setRole((ConnectableElement)null);
				return;
			case UML2Package.CONNECTOR_END__PART_WITH_PORT:
				setPartWithPort((Property)null);
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
			case UML2Package.CONNECTOR_END__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.CONNECTOR_END__OWNED_ELEMENT:
				return isSetOwnedElements();
			case UML2Package.CONNECTOR_END__OWNER:
				return isSetOwner();
			case UML2Package.CONNECTOR_END__OWNED_COMMENT:
				EList ownedComment = (EList)eVirtualGet(UML2Package.CONNECTOR_END__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.CONNECTOR_END__IS_ORDERED:
				return ((eFlags & IS_ORDERED_EFLAG) != 0) != IS_ORDERED_EDEFAULT;
			case UML2Package.CONNECTOR_END__IS_UNIQUE:
				return ((eFlags & IS_UNIQUE_EFLAG) != 0) != IS_UNIQUE_EDEFAULT;
			case UML2Package.CONNECTOR_END__LOWER:
				return getLower() != LOWER_EDEFAULT;
			case UML2Package.CONNECTOR_END__UPPER:
				return getUpper() != UPPER_EDEFAULT;
			case UML2Package.CONNECTOR_END__UPPER_VALUE:
				return eVirtualGet(UML2Package.CONNECTOR_END__UPPER_VALUE) != null;
			case UML2Package.CONNECTOR_END__LOWER_VALUE:
				return eVirtualGet(UML2Package.CONNECTOR_END__LOWER_VALUE) != null;
			case UML2Package.CONNECTOR_END__DEFINING_END:
				return basicGetDefiningEnd() != null;
			case UML2Package.CONNECTOR_END__ROLE:
				return eVirtualGet(UML2Package.CONNECTOR_END__ROLE) != null;
			case UML2Package.CONNECTOR_END__PART_WITH_PORT:
				return eVirtualGet(UML2Package.CONNECTOR_END__PART_WITH_PORT) != null;
		}
		return eDynamicIsSet(eFeature);
	}


} //ConnectorEndImpl
