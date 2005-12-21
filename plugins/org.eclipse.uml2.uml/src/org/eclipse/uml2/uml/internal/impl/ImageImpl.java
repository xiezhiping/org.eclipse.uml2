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
 * $Id: ImageImpl.java,v 1.3 2005/12/21 20:13:08 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.uml.Image;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Image</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ImageImpl#getContent <em>Content</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ImageImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ImageImpl#getFormat <em>Format</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ImageImpl
		extends ElementImpl
		implements Image {

	/**
	 * The default value of the '{@link #getContent() <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getFormat() <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String FORMAT_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.Literals.IMAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContent() {
		return (String) eVirtualGet(UMLPackage.IMAGE__CONTENT, CONTENT_EDEFAULT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContent(String newContent) {
		String content = newContent;
		Object oldContent = eVirtualSet(UMLPackage.IMAGE__CONTENT, content);
		boolean isSetChange = oldContent == EVIRTUAL_NO_VALUE;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.IMAGE__CONTENT, isSetChange
					? CONTENT_EDEFAULT
					: oldContent, content, isSetChange));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetContent() {
		Object oldContent = eVirtualUnset(UMLPackage.IMAGE__CONTENT);
		boolean isSetChange = oldContent != EVIRTUAL_NO_VALUE;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
				UMLPackage.IMAGE__CONTENT, isSetChange
					? oldContent
					: CONTENT_EDEFAULT, CONTENT_EDEFAULT, isSetChange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetContent() {
		return eVirtualIsSet(UMLPackage.IMAGE__CONTENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocation() {
		return (String) eVirtualGet(UMLPackage.IMAGE__LOCATION,
			LOCATION_EDEFAULT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(String newLocation) {
		String location = newLocation;
		Object oldLocation = eVirtualSet(UMLPackage.IMAGE__LOCATION, location);
		boolean isSetChange = oldLocation == EVIRTUAL_NO_VALUE;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.IMAGE__LOCATION, isSetChange
					? LOCATION_EDEFAULT
					: oldLocation, location, isSetChange));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLocation() {
		Object oldLocation = eVirtualUnset(UMLPackage.IMAGE__LOCATION);
		boolean isSetChange = oldLocation != EVIRTUAL_NO_VALUE;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
				UMLPackage.IMAGE__LOCATION, isSetChange
					? oldLocation
					: LOCATION_EDEFAULT, LOCATION_EDEFAULT, isSetChange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLocation() {
		return eVirtualIsSet(UMLPackage.IMAGE__LOCATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFormat() {
		return (String) eVirtualGet(UMLPackage.IMAGE__FORMAT, FORMAT_EDEFAULT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormat(String newFormat) {
		String format = newFormat;
		Object oldFormat = eVirtualSet(UMLPackage.IMAGE__FORMAT, format);
		boolean isSetChange = oldFormat == EVIRTUAL_NO_VALUE;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.IMAGE__FORMAT, isSetChange
					? FORMAT_EDEFAULT
					: oldFormat, format, isSetChange));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFormat() {
		Object oldFormat = eVirtualUnset(UMLPackage.IMAGE__FORMAT);
		boolean isSetChange = oldFormat != EVIRTUAL_NO_VALUE;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
				UMLPackage.IMAGE__FORMAT, isSetChange
					? oldFormat
					: FORMAT_EDEFAULT, FORMAT_EDEFAULT, isSetChange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFormat() {
		return eVirtualIsSet(UMLPackage.IMAGE__FORMAT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.IMAGE__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.IMAGE__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.IMAGE__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.IMAGE__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.IMAGE__CONTENT :
				return getContent();
			case UMLPackage.IMAGE__LOCATION :
				return getLocation();
			case UMLPackage.IMAGE__FORMAT :
				return getFormat();
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
			case UMLPackage.IMAGE__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.IMAGE__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.IMAGE__CONTENT :
				setContent((String) newValue);
				return;
			case UMLPackage.IMAGE__LOCATION :
				setLocation((String) newValue);
				return;
			case UMLPackage.IMAGE__FORMAT :
				setFormat((String) newValue);
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
			case UMLPackage.IMAGE__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.IMAGE__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.IMAGE__CONTENT :
				unsetContent();
				return;
			case UMLPackage.IMAGE__LOCATION :
				unsetLocation();
				return;
			case UMLPackage.IMAGE__FORMAT :
				unsetFormat();
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
			case UMLPackage.IMAGE__EANNOTATIONS :
				EList eAnnotations = (EList) eVirtualGet(UMLPackage.IMAGE__EANNOTATIONS);
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.IMAGE__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.IMAGE__OWNER :
				return isSetOwner();
			case UMLPackage.IMAGE__OWNED_COMMENT :
				EList ownedComment = (EList) eVirtualGet(UMLPackage.IMAGE__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.IMAGE__CONTENT :
				return isSetContent();
			case UMLPackage.IMAGE__LOCATION :
				return isSetLocation();
			case UMLPackage.IMAGE__FORMAT :
				return isSetFormat();
		}
		return eDynamicIsSet(featureID);
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
		result.append(" (content: "); //$NON-NLS-1$
		if (eVirtualIsSet(UMLPackage.IMAGE__CONTENT))
			result.append(eVirtualGet(UMLPackage.IMAGE__CONTENT));
		else
			result.append("<unset>"); //$NON-NLS-1$
		result.append(", location: "); //$NON-NLS-1$
		if (eVirtualIsSet(UMLPackage.IMAGE__LOCATION))
			result.append(eVirtualGet(UMLPackage.IMAGE__LOCATION));
		else
			result.append("<unset>"); //$NON-NLS-1$
		result.append(", format: "); //$NON-NLS-1$
		if (eVirtualIsSet(UMLPackage.IMAGE__FORMAT))
			result.append(eVirtualGet(UMLPackage.IMAGE__FORMAT));
		else
			result.append("<unset>"); //$NON-NLS-1$
		result.append(')');
		return result.toString();
	}

} //ImageImpl
