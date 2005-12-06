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
 * $Id: LinkEndDataImpl.java,v 1.16 2005/12/06 23:18:03 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.uml2.InputPin;
import org.eclipse.uml2.LinkEndData;
import org.eclipse.uml2.Property;
import org.eclipse.uml2.QualifierValue;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link End Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.LinkEndDataImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.LinkEndDataImpl#getEnd <em>End</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.LinkEndDataImpl#getQualifiers <em>Qualifier</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LinkEndDataImpl extends ElementImpl implements LinkEndData {
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
	protected LinkEndDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UML2Package.Literals.LINK_END_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin getValue() {
		InputPin value = (InputPin)eVirtualGet(UML2Package.LINK_END_DATA__VALUE);
		if (value != null && value.eIsProxy()) {
			InternalEObject oldValue = (InternalEObject)value;
			value = (InputPin)eResolveProxy(oldValue);
			if (value != oldValue) {
				eVirtualSet(UML2Package.LINK_END_DATA__VALUE, value);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2Package.LINK_END_DATA__VALUE, oldValue, value));
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
		return (InputPin)eVirtualGet(UML2Package.LINK_END_DATA__VALUE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(InputPin newValue) {
		InputPin value = newValue;
		Object oldValue = eVirtualSet(UML2Package.LINK_END_DATA__VALUE, value);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.LINK_END_DATA__VALUE, oldValue == EVIRTUAL_NO_VALUE ? null : oldValue, value));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getEnd() {
		Property end = (Property)eVirtualGet(UML2Package.LINK_END_DATA__END);
		if (end != null && end.eIsProxy()) {
			InternalEObject oldEnd = (InternalEObject)end;
			end = (Property)eResolveProxy(oldEnd);
			if (end != oldEnd) {
				eVirtualSet(UML2Package.LINK_END_DATA__END, end);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2Package.LINK_END_DATA__END, oldEnd, end));
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
		return (Property)eVirtualGet(UML2Package.LINK_END_DATA__END);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnd(Property newEnd) {
		Property end = newEnd;
		Object oldEnd = eVirtualSet(UML2Package.LINK_END_DATA__END, end);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.LINK_END_DATA__END, oldEnd == EVIRTUAL_NO_VALUE ? null : oldEnd, end));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getQualifiers() {
		EList qualifier = (EList)eVirtualGet(UML2Package.LINK_END_DATA__QUALIFIER);
		if (qualifier == null) {
			eVirtualSet(UML2Package.LINK_END_DATA__QUALIFIER, qualifier = new EObjectContainmentEList(QualifierValue.class, this, UML2Package.LINK_END_DATA__QUALIFIER));
		}
		return qualifier;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @deprecated Use #createQualifier() instead.
	 */
	public QualifierValue createQualifier(EClass eClass) {
		QualifierValue newQualifier = (QualifierValue) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.LINK_END_DATA__QUALIFIER, null, newQualifier));
		}
		getQualifiers().add(newQualifier);
		return newQualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public QualifierValue createQualifier() {
		QualifierValue newQualifier = UML2Factory.eINSTANCE.createQualifierValue();
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.LINK_END_DATA__QUALIFIER, null, newQualifier));
		}
		getQualifiers().add(newQualifier);
		return newQualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UML2Package.LINK_END_DATA__EANNOTATIONS:
				return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
			case UML2Package.LINK_END_DATA__OWNED_COMMENT:
				return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
			case UML2Package.LINK_END_DATA__QUALIFIER:
				return ((InternalEList)getQualifiers()).basicRemove(otherEnd, msgs);
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
			case UML2Package.LINK_END_DATA__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.LINK_END_DATA__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.LINK_END_DATA__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.LINK_END_DATA__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.LINK_END_DATA__VALUE:
				if (resolve) return getValue();
				return basicGetValue();
			case UML2Package.LINK_END_DATA__END:
				if (resolve) return getEnd();
				return basicGetEnd();
			case UML2Package.LINK_END_DATA__QUALIFIER:
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
			case UML2Package.LINK_END_DATA__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.LINK_END_DATA__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.LINK_END_DATA__VALUE:
				setValue((InputPin)newValue);
				return;
			case UML2Package.LINK_END_DATA__END:
				setEnd((Property)newValue);
				return;
			case UML2Package.LINK_END_DATA__QUALIFIER:
				getQualifiers().clear();
				getQualifiers().addAll((Collection)newValue);
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
			case UML2Package.LINK_END_DATA__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.LINK_END_DATA__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.LINK_END_DATA__VALUE:
				setValue((InputPin)null);
				return;
			case UML2Package.LINK_END_DATA__END:
				setEnd((Property)null);
				return;
			case UML2Package.LINK_END_DATA__QUALIFIER:
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
			case UML2Package.LINK_END_DATA__EANNOTATIONS:
				EList eAnnotations = (EList)eVirtualGet(UML2Package.LINK_END_DATA__EANNOTATIONS);
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.LINK_END_DATA__OWNED_ELEMENT:
				return isSetOwnedElements();
			case UML2Package.LINK_END_DATA__OWNER:
				return isSetOwner();
			case UML2Package.LINK_END_DATA__OWNED_COMMENT:
				EList ownedComment = (EList)eVirtualGet(UML2Package.LINK_END_DATA__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.LINK_END_DATA__VALUE:
				return eVirtualGet(UML2Package.LINK_END_DATA__VALUE) != null;
			case UML2Package.LINK_END_DATA__END:
				return eVirtualGet(UML2Package.LINK_END_DATA__END) != null;
			case UML2Package.LINK_END_DATA__QUALIFIER:
				EList qualifier = (EList)eVirtualGet(UML2Package.LINK_END_DATA__QUALIFIER);
				return qualifier != null && !qualifier.isEmpty();
		}
		return eDynamicIsSet(featureID);
	}


} //LinkEndDataImpl
