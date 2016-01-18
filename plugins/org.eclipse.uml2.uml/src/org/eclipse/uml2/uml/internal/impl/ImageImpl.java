/*
 * Copyright (c) 2005, 2016 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 327039, 451350, 485756
 *
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Image;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Image</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ImageImpl#getContent <em>Content</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ImageImpl#getFormat <em>Format</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ImageImpl#getLocation <em>Location</em>}</li>
 * </ul>
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
	 * The cached value of the '{@link #getContent() <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected String content = CONTENT_EDEFAULT;

	/**
	 * The flag representing whether the Content attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int CONTENT_ESETFLAG = 1 << 8;

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
	 * The cached value of the '{@link #getFormat() <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormat()
	 * @generated
	 * @ordered
	 */
	protected String format = FORMAT_EDEFAULT;

	/**
	 * The flag representing whether the Format attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int FORMAT_ESETFLAG = 1 << 9;

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
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected String location = LOCATION_EDEFAULT;

	/**
	 * The flag representing whether the Location attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int LOCATION_ESETFLAG = 1 << 10;

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
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.IMAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContent() {
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContent(String newContent) {
		String oldContent = content;
		content = newContent;
		boolean oldContentESet = (eFlags & CONTENT_ESETFLAG) != 0;
		eFlags |= CONTENT_ESETFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.IMAGE__CONTENT, oldContent, content,
				!oldContentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetContent() {
		String oldContent = content;
		boolean oldContentESet = (eFlags & CONTENT_ESETFLAG) != 0;
		content = CONTENT_EDEFAULT;
		eFlags &= ~CONTENT_ESETFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
				UMLPackage.IMAGE__CONTENT, oldContent, CONTENT_EDEFAULT,
				oldContentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetContent() {
		return (eFlags & CONTENT_ESETFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(String newLocation) {
		String oldLocation = location;
		location = newLocation;
		boolean oldLocationESet = (eFlags & LOCATION_ESETFLAG) != 0;
		eFlags |= LOCATION_ESETFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.IMAGE__LOCATION, oldLocation, location,
				!oldLocationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLocation() {
		String oldLocation = location;
		boolean oldLocationESet = (eFlags & LOCATION_ESETFLAG) != 0;
		location = LOCATION_EDEFAULT;
		eFlags &= ~LOCATION_ESETFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
				UMLPackage.IMAGE__LOCATION, oldLocation, LOCATION_EDEFAULT,
				oldLocationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLocation() {
		return (eFlags & LOCATION_ESETFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFormat() {
		return format;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormat(String newFormat) {
		String oldFormat = format;
		format = newFormat;
		boolean oldFormatESet = (eFlags & FORMAT_ESETFLAG) != 0;
		eFlags |= FORMAT_ESETFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.IMAGE__FORMAT, oldFormat, format, !oldFormatESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFormat() {
		String oldFormat = format;
		boolean oldFormatESet = (eFlags & FORMAT_ESETFLAG) != 0;
		format = FORMAT_EDEFAULT;
		eFlags &= ~FORMAT_ESETFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
				UMLPackage.IMAGE__FORMAT, oldFormat, FORMAT_EDEFAULT,
				oldFormatESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFormat() {
		return (eFlags & FORMAT_ESETFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.IMAGE__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.IMAGE__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.IMAGE__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.IMAGE__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.IMAGE__CONTENT :
				return getContent();
			case UMLPackage.IMAGE__FORMAT :
				return getFormat();
			case UMLPackage.IMAGE__LOCATION :
				return getLocation();
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
			case UMLPackage.IMAGE__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations()
					.addAll((Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.IMAGE__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments()
					.addAll((Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.IMAGE__CONTENT :
				setContent((String) newValue);
				return;
			case UMLPackage.IMAGE__FORMAT :
				setFormat((String) newValue);
				return;
			case UMLPackage.IMAGE__LOCATION :
				setLocation((String) newValue);
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
			case UMLPackage.IMAGE__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.IMAGE__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.IMAGE__CONTENT :
				unsetContent();
				return;
			case UMLPackage.IMAGE__FORMAT :
				unsetFormat();
				return;
			case UMLPackage.IMAGE__LOCATION :
				unsetLocation();
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
			case UMLPackage.IMAGE__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.IMAGE__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.IMAGE__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.IMAGE__OWNER :
				return isSetOwner();
			case UMLPackage.IMAGE__CONTENT :
				return isSetContent();
			case UMLPackage.IMAGE__FORMAT :
				return isSetFormat();
			case UMLPackage.IMAGE__LOCATION :
				return isSetLocation();
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (content: "); //$NON-NLS-1$
		if ((eFlags & CONTENT_ESETFLAG) != 0)
			result.append(content);
		else
			result.append("<unset>"); //$NON-NLS-1$
		result.append(", format: "); //$NON-NLS-1$
		if ((eFlags & FORMAT_ESETFLAG) != 0)
			result.append(format);
		else
			result.append("<unset>"); //$NON-NLS-1$
		result.append(", location: "); //$NON-NLS-1$
		if ((eFlags & LOCATION_ESETFLAG) != 0)
			result.append(location);
		else
			result.append("<unset>"); //$NON-NLS-1$
		result.append(')');
		return result.toString();
	}

} //ImageImpl
