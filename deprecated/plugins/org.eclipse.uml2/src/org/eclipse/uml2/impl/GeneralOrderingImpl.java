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
 * $Id: GeneralOrderingImpl.java,v 1.15 2005/11/28 17:18:05 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.uml2.EventOccurrence;
import org.eclipse.uml2.GeneralOrdering;
import org.eclipse.uml2.StringExpression;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>General Ordering</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.GeneralOrderingImpl#getBefore <em>Before</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.GeneralOrderingImpl#getAfter <em>After</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GeneralOrderingImpl extends NamedElementImpl implements GeneralOrdering {
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
	protected GeneralOrderingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UML2Package.Literals.GENERAL_ORDERING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventOccurrence getBefore() {
		EventOccurrence before = (EventOccurrence)eVirtualGet(UML2Package.GENERAL_ORDERING__BEFORE);
		if (before != null && before.eIsProxy()) {
			InternalEObject oldBefore = (InternalEObject)before;
			before = (EventOccurrence)eResolveProxy(oldBefore);
			if (before != oldBefore) {
				eVirtualSet(UML2Package.GENERAL_ORDERING__BEFORE, before);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2Package.GENERAL_ORDERING__BEFORE, oldBefore, before));
			}
		}
		return before;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventOccurrence basicGetBefore() {
		return (EventOccurrence)eVirtualGet(UML2Package.GENERAL_ORDERING__BEFORE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBefore(EventOccurrence newBefore, NotificationChain msgs) {
		Object oldBefore = eVirtualSet(UML2Package.GENERAL_ORDERING__BEFORE, newBefore);
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UML2Package.GENERAL_ORDERING__BEFORE, oldBefore == EVIRTUAL_NO_VALUE ? null : oldBefore, newBefore);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBefore(EventOccurrence newBefore) {
		EventOccurrence before = (EventOccurrence)eVirtualGet(UML2Package.GENERAL_ORDERING__BEFORE);
		if (newBefore != before) {
			NotificationChain msgs = null;
			if (before != null)
				msgs = ((InternalEObject)before).eInverseRemove(this, UML2Package.EVENT_OCCURRENCE__TO_AFTER, EventOccurrence.class, msgs);
			if (newBefore != null)
				msgs = ((InternalEObject)newBefore).eInverseAdd(this, UML2Package.EVENT_OCCURRENCE__TO_AFTER, EventOccurrence.class, msgs);
			msgs = basicSetBefore(newBefore, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.GENERAL_ORDERING__BEFORE, newBefore, newBefore));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventOccurrence getAfter() {
		EventOccurrence after = (EventOccurrence)eVirtualGet(UML2Package.GENERAL_ORDERING__AFTER);
		if (after != null && after.eIsProxy()) {
			InternalEObject oldAfter = (InternalEObject)after;
			after = (EventOccurrence)eResolveProxy(oldAfter);
			if (after != oldAfter) {
				eVirtualSet(UML2Package.GENERAL_ORDERING__AFTER, after);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2Package.GENERAL_ORDERING__AFTER, oldAfter, after));
			}
		}
		return after;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventOccurrence basicGetAfter() {
		return (EventOccurrence)eVirtualGet(UML2Package.GENERAL_ORDERING__AFTER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAfter(EventOccurrence newAfter, NotificationChain msgs) {
		Object oldAfter = eVirtualSet(UML2Package.GENERAL_ORDERING__AFTER, newAfter);
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UML2Package.GENERAL_ORDERING__AFTER, oldAfter == EVIRTUAL_NO_VALUE ? null : oldAfter, newAfter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAfter(EventOccurrence newAfter) {
		EventOccurrence after = (EventOccurrence)eVirtualGet(UML2Package.GENERAL_ORDERING__AFTER);
		if (newAfter != after) {
			NotificationChain msgs = null;
			if (after != null)
				msgs = ((InternalEObject)after).eInverseRemove(this, UML2Package.EVENT_OCCURRENCE__TO_BEFORE, EventOccurrence.class, msgs);
			if (newAfter != null)
				msgs = ((InternalEObject)newAfter).eInverseAdd(this, UML2Package.EVENT_OCCURRENCE__TO_BEFORE, EventOccurrence.class, msgs);
			msgs = basicSetAfter(newAfter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.GENERAL_ORDERING__AFTER, newAfter, newAfter));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UML2Package.GENERAL_ORDERING__EANNOTATIONS:
				return ((InternalEList)getEAnnotations()).basicAdd(otherEnd, msgs);
			case UML2Package.GENERAL_ORDERING__TEMPLATE_BINDING:
				return ((InternalEList)getTemplateBindings()).basicAdd(otherEnd, msgs);
			case UML2Package.GENERAL_ORDERING__OWNED_TEMPLATE_SIGNATURE:
				TemplateSignature ownedTemplateSignature = (TemplateSignature)eVirtualGet(UML2Package.GENERAL_ORDERING__OWNED_TEMPLATE_SIGNATURE);
				if (ownedTemplateSignature != null)
					msgs = ((InternalEObject)ownedTemplateSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.GENERAL_ORDERING__OWNED_TEMPLATE_SIGNATURE, null, msgs);
				return basicSetOwnedTemplateSignature((TemplateSignature)otherEnd, msgs);
			case UML2Package.GENERAL_ORDERING__CLIENT_DEPENDENCY:
				return ((InternalEList)getClientDependencies()).basicAdd(otherEnd, msgs);
			case UML2Package.GENERAL_ORDERING__BEFORE:
				EventOccurrence before = (EventOccurrence)eVirtualGet(UML2Package.GENERAL_ORDERING__BEFORE);
				if (before != null)
					msgs = ((InternalEObject)before).eInverseRemove(this, UML2Package.EVENT_OCCURRENCE__TO_AFTER, EventOccurrence.class, msgs);
				return basicSetBefore((EventOccurrence)otherEnd, msgs);
			case UML2Package.GENERAL_ORDERING__AFTER:
				EventOccurrence after = (EventOccurrence)eVirtualGet(UML2Package.GENERAL_ORDERING__AFTER);
				if (after != null)
					msgs = ((InternalEObject)after).eInverseRemove(this, UML2Package.EVENT_OCCURRENCE__TO_BEFORE, EventOccurrence.class, msgs);
				return basicSetAfter((EventOccurrence)otherEnd, msgs);
		}
		return eDynamicInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UML2Package.GENERAL_ORDERING__EANNOTATIONS:
				return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
			case UML2Package.GENERAL_ORDERING__OWNED_COMMENT:
				return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
			case UML2Package.GENERAL_ORDERING__TEMPLATE_BINDING:
				return ((InternalEList)getTemplateBindings()).basicRemove(otherEnd, msgs);
			case UML2Package.GENERAL_ORDERING__OWNED_TEMPLATE_SIGNATURE:
				return basicSetOwnedTemplateSignature(null, msgs);
			case UML2Package.GENERAL_ORDERING__CLIENT_DEPENDENCY:
				return ((InternalEList)getClientDependencies()).basicRemove(otherEnd, msgs);
			case UML2Package.GENERAL_ORDERING__NAME_EXPRESSION:
				return basicSetNameExpression(null, msgs);
			case UML2Package.GENERAL_ORDERING__BEFORE:
				return basicSetBefore(null, msgs);
			case UML2Package.GENERAL_ORDERING__AFTER:
				return basicSetAfter(null, msgs);
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
			case UML2Package.GENERAL_ORDERING__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.GENERAL_ORDERING__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.GENERAL_ORDERING__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.GENERAL_ORDERING__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.GENERAL_ORDERING__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.GENERAL_ORDERING__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UML2Package.GENERAL_ORDERING__NAME:
				return getName();
			case UML2Package.GENERAL_ORDERING__QUALIFIED_NAME:
				return getQualifiedName();
			case UML2Package.GENERAL_ORDERING__VISIBILITY:
				return getVisibility();
			case UML2Package.GENERAL_ORDERING__CLIENT_DEPENDENCY:
				return getClientDependencies();
			case UML2Package.GENERAL_ORDERING__NAME_EXPRESSION:
				return getNameExpression();
			case UML2Package.GENERAL_ORDERING__BEFORE:
				if (resolve) return getBefore();
				return basicGetBefore();
			case UML2Package.GENERAL_ORDERING__AFTER:
				if (resolve) return getAfter();
				return basicGetAfter();
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
			case UML2Package.GENERAL_ORDERING__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.GENERAL_ORDERING__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.GENERAL_ORDERING__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection)newValue);
				return;
			case UML2Package.GENERAL_ORDERING__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case UML2Package.GENERAL_ORDERING__NAME:
				setName((String)newValue);
				return;
			case UML2Package.GENERAL_ORDERING__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case UML2Package.GENERAL_ORDERING__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection)newValue);
				return;
			case UML2Package.GENERAL_ORDERING__NAME_EXPRESSION:
				setNameExpression((StringExpression)newValue);
				return;
			case UML2Package.GENERAL_ORDERING__BEFORE:
				setBefore((EventOccurrence)newValue);
				return;
			case UML2Package.GENERAL_ORDERING__AFTER:
				setAfter((EventOccurrence)newValue);
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
			case UML2Package.GENERAL_ORDERING__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.GENERAL_ORDERING__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.GENERAL_ORDERING__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				return;
			case UML2Package.GENERAL_ORDERING__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case UML2Package.GENERAL_ORDERING__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UML2Package.GENERAL_ORDERING__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UML2Package.GENERAL_ORDERING__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				return;
			case UML2Package.GENERAL_ORDERING__NAME_EXPRESSION:
				setNameExpression((StringExpression)null);
				return;
			case UML2Package.GENERAL_ORDERING__BEFORE:
				setBefore((EventOccurrence)null);
				return;
			case UML2Package.GENERAL_ORDERING__AFTER:
				setAfter((EventOccurrence)null);
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
			case UML2Package.GENERAL_ORDERING__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.GENERAL_ORDERING__OWNED_ELEMENT:
				return isSetOwnedElements();
			case UML2Package.GENERAL_ORDERING__OWNER:
				return isSetOwner();
			case UML2Package.GENERAL_ORDERING__OWNED_COMMENT:
				EList ownedComment = (EList)eVirtualGet(UML2Package.GENERAL_ORDERING__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.GENERAL_ORDERING__TEMPLATE_BINDING:
				EList templateBinding = (EList)eVirtualGet(UML2Package.GENERAL_ORDERING__TEMPLATE_BINDING);
				return templateBinding != null && !templateBinding.isEmpty();
			case UML2Package.GENERAL_ORDERING__OWNED_TEMPLATE_SIGNATURE:
				return eVirtualGet(UML2Package.GENERAL_ORDERING__OWNED_TEMPLATE_SIGNATURE) != null;
			case UML2Package.GENERAL_ORDERING__NAME:
				String name = (String)eVirtualGet(UML2Package.GENERAL_ORDERING__NAME, NAME_EDEFAULT);
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.GENERAL_ORDERING__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UML2Package.GENERAL_ORDERING__VISIBILITY:
				return eVirtualGet(UML2Package.GENERAL_ORDERING__VISIBILITY, VISIBILITY_EDEFAULT) != VISIBILITY_EDEFAULT;
			case UML2Package.GENERAL_ORDERING__CLIENT_DEPENDENCY:
				EList clientDependency = (EList)eVirtualGet(UML2Package.GENERAL_ORDERING__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UML2Package.GENERAL_ORDERING__NAME_EXPRESSION:
				return eVirtualGet(UML2Package.GENERAL_ORDERING__NAME_EXPRESSION) != null;
			case UML2Package.GENERAL_ORDERING__BEFORE:
				return eVirtualGet(UML2Package.GENERAL_ORDERING__BEFORE) != null;
			case UML2Package.GENERAL_ORDERING__AFTER:
				return eVirtualGet(UML2Package.GENERAL_ORDERING__AFTER) != null;
		}
		return eDynamicIsSet(featureID);
	}


} //GeneralOrderingImpl
