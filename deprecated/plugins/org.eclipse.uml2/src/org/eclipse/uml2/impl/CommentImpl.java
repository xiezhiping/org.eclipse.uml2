/*
 * Copyright (c) 2003, 2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: CommentImpl.java,v 1.22 2006/05/26 18:16:43 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.Comment;
import org.eclipse.uml2.Element;
import org.eclipse.uml2.StringExpression;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.CommentImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.CommentImpl#getBody <em>Body</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.CommentImpl#getAnnotatedElements <em>Annotated Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.CommentImpl#getBodyExpression <em>Body Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CommentImpl extends TemplateableElementImpl implements Comment {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * The default value of the '{@link #getBody() <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected static final String BODY_EDEFAULT = ""; //$NON-NLS-1$

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
	 * The cached value of the '{@link #getAnnotatedElements() <em>Annotated Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotatedElements()
	 * @generated
	 * @ordered
	 */
	protected EList annotatedElements = null;

	/**
	 * The cached value of the '{@link #getBodyExpression() <em>Body Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodyExpression()
	 * @generated
	 * @ordered
	 */
	protected StringExpression bodyExpression = null;

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
		return UML2Package.Literals.COMMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedElements() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			EList ownedElements = (EList) cache.get(eResource, this, UML2Package.Literals.ELEMENT__OWNED_ELEMENT);
			if (ownedElements == null) {
				cache.put(eResource, this, UML2Package.Literals.ELEMENT__OWNED_ELEMENT, ownedElements = new DerivedUnionEObjectEList(Element.class, this, UML2Package.COMMENT__OWNED_ELEMENT, OWNED_ELEMENT_ESUBSETS));
			}
			return ownedElements;
		}
		return new DerivedUnionEObjectEList(Element.class, this, UML2Package.COMMENT__OWNED_ELEMENT, OWNED_ELEMENT_ESUBSETS);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| eIsSet(UML2Package.COMMENT__BODY_EXPRESSION);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getOwnedElements() <em>Owned Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedElements()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_ELEMENT_ESUBSETS = new int[] {UML2Package.COMMENT__OWNED_COMMENT, UML2Package.COMMENT__TEMPLATE_BINDING, UML2Package.COMMENT__OWNED_TEMPLATE_SIGNATURE, UML2Package.COMMENT__BODY_EXPRESSION};

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
		newBody = newBody == null ? BODY_EDEFAULT : newBody;
		String oldBody = body;
		body = newBody;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.COMMENT__BODY, oldBody, body));


	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAnnotatedElements() {
		if (annotatedElements == null) {
			annotatedElements = new EObjectResolvingEList(Element.class, this, UML2Package.COMMENT__ANNOTATED_ELEMENT);
		}
		return annotatedElements;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringExpression getBodyExpression() {
		return bodyExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBodyExpression(StringExpression newBodyExpression, NotificationChain msgs) {
		StringExpression oldBodyExpression = bodyExpression;
		bodyExpression = newBodyExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UML2Package.COMMENT__BODY_EXPRESSION, oldBodyExpression, newBodyExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBodyExpression(StringExpression newBodyExpression) {
		if (newBodyExpression != bodyExpression) {
			NotificationChain msgs = null;
			if (bodyExpression != null)
				msgs = ((InternalEObject)bodyExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.COMMENT__BODY_EXPRESSION, null, msgs);
			if (newBodyExpression != null)
				msgs = ((InternalEObject)newBodyExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UML2Package.COMMENT__BODY_EXPRESSION, null, msgs);
			msgs = basicSetBodyExpression(newBodyExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.COMMENT__BODY_EXPRESSION, newBodyExpression, newBodyExpression));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @deprecated Use #createBodyExpression() instead.
	 */
	public StringExpression createBodyExpression(EClass eClass) {
		StringExpression newBodyExpression = (StringExpression) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.COMMENT__BODY_EXPRESSION, null, newBodyExpression));
		}
		setBodyExpression(newBodyExpression);
		return newBodyExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public StringExpression createBodyExpression() {
		StringExpression newBodyExpression = UML2Factory.eINSTANCE.createStringExpression();
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.COMMENT__BODY_EXPRESSION, null, newBodyExpression));
		}
		setBodyExpression(newBodyExpression);
		return newBodyExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UML2Package.COMMENT__EANNOTATIONS:
				return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
			case UML2Package.COMMENT__OWNED_COMMENT:
				return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
			case UML2Package.COMMENT__TEMPLATE_BINDING:
				return ((InternalEList)getTemplateBindings()).basicRemove(otherEnd, msgs);
			case UML2Package.COMMENT__OWNED_TEMPLATE_SIGNATURE:
				return basicSetOwnedTemplateSignature(null, msgs);
			case UML2Package.COMMENT__BODY_EXPRESSION:
				return basicSetBodyExpression(null, msgs);
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
			case UML2Package.COMMENT__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.COMMENT__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.COMMENT__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.COMMENT__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.COMMENT__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.COMMENT__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UML2Package.COMMENT__BODY:
				return getBody();
			case UML2Package.COMMENT__ANNOTATED_ELEMENT:
				return getAnnotatedElements();
			case UML2Package.COMMENT__BODY_EXPRESSION:
				return getBodyExpression();
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
			case UML2Package.COMMENT__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.COMMENT__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.COMMENT__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection)newValue);
				return;
			case UML2Package.COMMENT__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case UML2Package.COMMENT__BODY:
				setBody((String)newValue);
				return;
			case UML2Package.COMMENT__ANNOTATED_ELEMENT:
				getAnnotatedElements().clear();
				getAnnotatedElements().addAll((Collection)newValue);
				return;
			case UML2Package.COMMENT__BODY_EXPRESSION:
				setBodyExpression((StringExpression)newValue);
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
			case UML2Package.COMMENT__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.COMMENT__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.COMMENT__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				return;
			case UML2Package.COMMENT__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case UML2Package.COMMENT__BODY:
				setBody(BODY_EDEFAULT);
				return;
			case UML2Package.COMMENT__ANNOTATED_ELEMENT:
				getAnnotatedElements().clear();
				return;
			case UML2Package.COMMENT__BODY_EXPRESSION:
				setBodyExpression((StringExpression)null);
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
			case UML2Package.COMMENT__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.COMMENT__OWNED_ELEMENT:
				return isSetOwnedElements();
			case UML2Package.COMMENT__OWNER:
				return isSetOwner();
			case UML2Package.COMMENT__OWNED_COMMENT:
				return ownedComments != null && !ownedComments.isEmpty();
			case UML2Package.COMMENT__TEMPLATE_BINDING:
				return templateBindings != null && !templateBindings.isEmpty();
			case UML2Package.COMMENT__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case UML2Package.COMMENT__BODY:
				return BODY_EDEFAULT == null ? body != null : !BODY_EDEFAULT.equals(body);
			case UML2Package.COMMENT__ANNOTATED_ELEMENT:
				return annotatedElements != null && !annotatedElements.isEmpty();
			case UML2Package.COMMENT__BODY_EXPRESSION:
				return bodyExpression != null;
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (body: "); //$NON-NLS-1$
		result.append(body);
		result.append(')');
		return result.toString();
	}


} //CommentImpl
