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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAnnotation;
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
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.CommentImpl#getAnnotatedElements <em>Annotated Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.CommentImpl#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommentImpl
		extends ElementImpl
		implements Comment {

	/**
	 * The cached value of the '{@link #getAnnotatedElements() <em>Annotated Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotatedElements()
	 * @generated
	 * @ordered
	 */
	protected EList<Element> annotatedElements;

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
	 * The cached value of the '{@link #getBody() <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected String body = BODY_EDEFAULT;

	/**
	 * The flag representing whether the Body attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int BODY_ESETFLAG = 1 << 8;

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
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.COMMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBody() {
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody(String newBody) {
		String oldBody = body;
		body = newBody;
		boolean oldBodyESet = (eFlags & BODY_ESETFLAG) != 0;
		eFlags |= BODY_ESETFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.COMMENT__BODY, oldBody, body, !oldBodyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBody() {
		String oldBody = body;
		boolean oldBodyESet = (eFlags & BODY_ESETFLAG) != 0;
		body = BODY_EDEFAULT;
		eFlags &= ~BODY_ESETFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
				UMLPackage.COMMENT__BODY, oldBody, BODY_EDEFAULT, oldBodyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBody() {
		return (eFlags & BODY_ESETFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getAnnotatedElements() {
		if (annotatedElements == null) {
			annotatedElements = new EObjectResolvingEList<Element>(
				Element.class, this, UMLPackage.COMMENT__ANNOTATED_ELEMENT);
		}
		return annotatedElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.COMMENT__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.COMMENT__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.COMMENT__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.COMMENT__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.COMMENT__ANNOTATED_ELEMENT :
				return getAnnotatedElements();
			case UMLPackage.COMMENT__BODY :
				return getBody();
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
			case UMLPackage.COMMENT__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations()
					.addAll((Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.COMMENT__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments()
					.addAll((Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.COMMENT__ANNOTATED_ELEMENT :
				getAnnotatedElements().clear();
				getAnnotatedElements()
					.addAll((Collection<? extends Element>) newValue);
				return;
			case UMLPackage.COMMENT__BODY :
				setBody((String) newValue);
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
			case UMLPackage.COMMENT__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.COMMENT__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.COMMENT__ANNOTATED_ELEMENT :
				getAnnotatedElements().clear();
				return;
			case UMLPackage.COMMENT__BODY :
				unsetBody();
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
			case UMLPackage.COMMENT__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.COMMENT__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.COMMENT__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.COMMENT__OWNER :
				return isSetOwner();
			case UMLPackage.COMMENT__ANNOTATED_ELEMENT :
				return annotatedElements != null
					&& !annotatedElements.isEmpty();
			case UMLPackage.COMMENT__BODY :
				return isSetBody();
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
		result.append(" (body: "); //$NON-NLS-1$
		if ((eFlags & BODY_ESETFLAG) != 0)
			result.append(body);
		else
			result.append("<unset>"); //$NON-NLS-1$
		result.append(')');
		return result.toString();
	}

} //CommentImpl
