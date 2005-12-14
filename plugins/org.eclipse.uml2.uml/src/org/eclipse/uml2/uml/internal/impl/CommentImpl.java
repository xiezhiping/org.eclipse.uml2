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
 * $Id: CommentImpl.java,v 1.8 2005/12/14 22:34:19 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.CommentImpl#getBody <em>Body</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.CommentImpl#getAnnotatedElements <em>Annotated Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CommentImpl
		extends ElementImpl
		implements Comment {

	/**
	 * The default value of the '{@link #getBody() <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected static final String BODY_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.Literals.COMMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBody() {
		return (String) eVirtualGet(UMLPackage.COMMENT__BODY, BODY_EDEFAULT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody(String newBody) {
		String body = newBody;
		Object oldBody = eVirtualSet(UMLPackage.COMMENT__BODY, body);
		boolean isSetChange = oldBody == EVIRTUAL_NO_VALUE;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.COMMENT__BODY, isSetChange
					? BODY_EDEFAULT
					: oldBody, body, isSetChange));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBody() {
		Object oldBody = eVirtualUnset(UMLPackage.COMMENT__BODY);
		boolean isSetChange = oldBody != EVIRTUAL_NO_VALUE;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
				UMLPackage.COMMENT__BODY, isSetChange
					? oldBody
					: BODY_EDEFAULT, BODY_EDEFAULT, isSetChange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBody() {
		return eVirtualIsSet(UMLPackage.COMMENT__BODY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAnnotatedElements() {
		EList annotatedElement = (EList) eVirtualGet(UMLPackage.COMMENT__ANNOTATED_ELEMENT);
		if (annotatedElement == null) {
			eVirtualSet(UMLPackage.COMMENT__ANNOTATED_ELEMENT,
				annotatedElement = new EObjectResolvingEList(Element.class,
					this, UMLPackage.COMMENT__ANNOTATED_ELEMENT));
		}
		return annotatedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.COMMENT__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.COMMENT__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.COMMENT__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.COMMENT__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.COMMENT__BODY :
				return getBody();
			case UMLPackage.COMMENT__ANNOTATED_ELEMENT :
				return getAnnotatedElements();
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
			case UMLPackage.COMMENT__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.COMMENT__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.COMMENT__BODY :
				setBody((String) newValue);
				return;
			case UMLPackage.COMMENT__ANNOTATED_ELEMENT :
				getAnnotatedElements().clear();
				getAnnotatedElements().addAll((Collection) newValue);
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
			case UMLPackage.COMMENT__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.COMMENT__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.COMMENT__BODY :
				unsetBody();
				return;
			case UMLPackage.COMMENT__ANNOTATED_ELEMENT :
				getAnnotatedElements().clear();
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
			case UMLPackage.COMMENT__EANNOTATIONS :
				EList eAnnotations = (EList) eVirtualGet(UMLPackage.COMMENT__EANNOTATIONS);
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.COMMENT__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.COMMENT__OWNER :
				return isSetOwner();
			case UMLPackage.COMMENT__OWNED_COMMENT :
				EList ownedComment = (EList) eVirtualGet(UMLPackage.COMMENT__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.COMMENT__BODY :
				return isSetBody();
			case UMLPackage.COMMENT__ANNOTATED_ELEMENT :
				EList annotatedElement = (EList) eVirtualGet(UMLPackage.COMMENT__ANNOTATED_ELEMENT);
				return annotatedElement != null && !annotatedElement.isEmpty();
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
		result.append(" (body: "); //$NON-NLS-1$
		if (eVirtualIsSet(UMLPackage.COMMENT__BODY))
			result.append(eVirtualGet(UMLPackage.COMMENT__BODY));
		else
			result.append("<unset>"); //$NON-NLS-1$
		result.append(')');
		return result.toString();
	}

} //CommentImpl
