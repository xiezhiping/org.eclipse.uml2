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
 * $Id: ConnectableElementTemplateParameterImpl.java,v 1.11 2006/03/01 17:56:38 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.uml2.uml.ConnectableElement;
import org.eclipse.uml2.uml.ConnectableElementTemplateParameter;
import org.eclipse.uml2.uml.ParameterableElement;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connectable Element Template Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ConnectableElementTemplateParameterImpl#getParameteredElement <em>Parametered Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConnectableElementTemplateParameterImpl
		extends TemplateParameterImpl
		implements ConnectableElementTemplateParameter {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectableElementTemplateParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.Literals.CONNECTABLE_ELEMENT_TEMPLATE_PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterableElement getParameteredElement() {
		ParameterableElement parameteredElement = (ParameterableElement) eVirtualGet(UMLPackage.CONNECTABLE_ELEMENT_TEMPLATE_PARAMETER__PARAMETERED_ELEMENT);
		if (parameteredElement != null && parameteredElement.eIsProxy()) {
			InternalEObject oldParameteredElement = (InternalEObject) parameteredElement;
			parameteredElement = (ParameterableElement) eResolveProxy(oldParameteredElement);
			if (parameteredElement != oldParameteredElement) {
				eVirtualSet(
					UMLPackage.CONNECTABLE_ELEMENT_TEMPLATE_PARAMETER__PARAMETERED_ELEMENT,
					parameteredElement);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(
						this,
						Notification.RESOLVE,
						UMLPackage.CONNECTABLE_ELEMENT_TEMPLATE_PARAMETER__PARAMETERED_ELEMENT,
						oldParameteredElement, parameteredElement));
			}
		}
		return parameteredElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterableElement basicGetParameteredElement() {
		return (ParameterableElement) eVirtualGet(UMLPackage.CONNECTABLE_ELEMENT_TEMPLATE_PARAMETER__PARAMETERED_ELEMENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParameteredElementGen(
			ParameterableElement newParameteredElement, NotificationChain msgs) {
		Object oldParameteredElement = eVirtualSet(
			UMLPackage.CONNECTABLE_ELEMENT_TEMPLATE_PARAMETER__PARAMETERED_ELEMENT,
			newParameteredElement);
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this,
				Notification.SET,
				UMLPackage.CONNECTABLE_ELEMENT_TEMPLATE_PARAMETER__PARAMETERED_ELEMENT,
				oldParameteredElement == EVIRTUAL_NO_VALUE
					? null
					: oldParameteredElement, newParameteredElement);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}

		return msgs;
	}

	public NotificationChain basicSetParameteredElement(
			ParameterableElement newParameteredElement, NotificationChain msgs) {

		if (newParameteredElement != null
			&& !(newParameteredElement instanceof ConnectableElement)) {

			throw new IllegalArgumentException(newParameteredElement.toString());
		}

		msgs = basicSetParameteredElementGen(newParameteredElement, msgs);

		Resource.Internal eInternalResource = eInternalResource();

		if (eInternalResource == null || !eInternalResource.isLoading()) {
			Object ownedParameteredElement = eVirtualGet(UMLPackage.CONNECTABLE_ELEMENT_TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT);

			if (ownedParameteredElement != null
				&& ownedParameteredElement != newParameteredElement) {

				setOwnedParameteredElement(null);
			}
		}

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameteredElement(ParameterableElement newParameteredElement) {
		ParameterableElement parameteredElement = (ParameterableElement) eVirtualGet(UMLPackage.CONNECTABLE_ELEMENT_TEMPLATE_PARAMETER__PARAMETERED_ELEMENT);
		if (newParameteredElement != parameteredElement) {
			NotificationChain msgs = null;
			if (parameteredElement != null)
				msgs = ((InternalEObject) parameteredElement).eInverseRemove(
					this, UMLPackage.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER,
					ParameterableElement.class, msgs);
			if (newParameteredElement != null)
				msgs = ((InternalEObject) newParameteredElement).eInverseAdd(
					this, UMLPackage.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER,
					ParameterableElement.class, msgs);
			msgs = basicSetParameteredElement(newParameteredElement, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(
				this,
				Notification.SET,
				UMLPackage.CONNECTABLE_ELEMENT_TEMPLATE_PARAMETER__PARAMETERED_ELEMENT,
				newParameteredElement, newParameteredElement));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetParameteredElement() {
		return eVirtualGet(UMLPackage.CONNECTABLE_ELEMENT_TEMPLATE_PARAMETER__PARAMETERED_ELEMENT) != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.CONNECTABLE_ELEMENT_TEMPLATE_PARAMETER__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.CONNECTABLE_ELEMENT_TEMPLATE_PARAMETER__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.CONNECTABLE_ELEMENT_TEMPLATE_PARAMETER__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.CONNECTABLE_ELEMENT_TEMPLATE_PARAMETER__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.CONNECTABLE_ELEMENT_TEMPLATE_PARAMETER__SIGNATURE :
				return getSignature();
			case UMLPackage.CONNECTABLE_ELEMENT_TEMPLATE_PARAMETER__PARAMETERED_ELEMENT :
				if (resolve)
					return getParameteredElement();
				return basicGetParameteredElement();
			case UMLPackage.CONNECTABLE_ELEMENT_TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT :
				if (resolve)
					return getOwnedParameteredElement();
				return basicGetOwnedParameteredElement();
			case UMLPackage.CONNECTABLE_ELEMENT_TEMPLATE_PARAMETER__DEFAULT :
				if (resolve)
					return getDefault();
				return basicGetDefault();
			case UMLPackage.CONNECTABLE_ELEMENT_TEMPLATE_PARAMETER__OWNED_DEFAULT :
				if (resolve)
					return getOwnedDefault();
				return basicGetOwnedDefault();
		}
		return eDynamicGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UMLPackage.CONNECTABLE_ELEMENT_TEMPLATE_PARAMETER__EANNOTATIONS :
				EList eAnnotations = (EList) eVirtualGet(UMLPackage.CONNECTABLE_ELEMENT_TEMPLATE_PARAMETER__EANNOTATIONS);
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.CONNECTABLE_ELEMENT_TEMPLATE_PARAMETER__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.CONNECTABLE_ELEMENT_TEMPLATE_PARAMETER__OWNER :
				return isSetOwner();
			case UMLPackage.CONNECTABLE_ELEMENT_TEMPLATE_PARAMETER__OWNED_COMMENT :
				EList ownedComment = (EList) eVirtualGet(UMLPackage.CONNECTABLE_ELEMENT_TEMPLATE_PARAMETER__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.CONNECTABLE_ELEMENT_TEMPLATE_PARAMETER__SIGNATURE :
				return getSignature() != null;
			case UMLPackage.CONNECTABLE_ELEMENT_TEMPLATE_PARAMETER__PARAMETERED_ELEMENT :
				return isSetParameteredElement();
			case UMLPackage.CONNECTABLE_ELEMENT_TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT :
				return eVirtualGet(UMLPackage.CONNECTABLE_ELEMENT_TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT) != null;
			case UMLPackage.CONNECTABLE_ELEMENT_TEMPLATE_PARAMETER__DEFAULT :
				return eVirtualGet(UMLPackage.CONNECTABLE_ELEMENT_TEMPLATE_PARAMETER__DEFAULT) != null;
			case UMLPackage.CONNECTABLE_ELEMENT_TEMPLATE_PARAMETER__OWNED_DEFAULT :
				return eVirtualGet(UMLPackage.CONNECTABLE_ELEMENT_TEMPLATE_PARAMETER__OWNED_DEFAULT) != null;
		}
		return eDynamicIsSet(featureID);
	}

} //ConnectableElementTemplateParameterImpl
