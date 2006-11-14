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
 * $Id: OperationTemplateParameterImpl.java,v 1.14 2006/11/14 18:02:17 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.OperationTemplateParameter;
import org.eclipse.uml2.uml.ParameterableElement;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation Template Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.OperationTemplateParameterImpl#getParameteredElement <em>Parametered Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperationTemplateParameterImpl
		extends TemplateParameterImpl
		implements OperationTemplateParameter {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationTemplateParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.Literals.OPERATION_TEMPLATE_PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterableElement getParameteredElement() {
		if (parameteredElement != null && parameteredElement.eIsProxy()) {
			InternalEObject oldParameteredElement = (InternalEObject) parameteredElement;
			parameteredElement = (ParameterableElement) eResolveProxy(oldParameteredElement);
			if (parameteredElement != oldParameteredElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(
						this,
						Notification.RESOLVE,
						UMLPackage.OPERATION_TEMPLATE_PARAMETER__PARAMETERED_ELEMENT,
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
		return parameteredElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParameteredElementGen(
			ParameterableElement newParameteredElement, NotificationChain msgs) {
		ParameterableElement oldParameteredElement = parameteredElement;
		parameteredElement = newParameteredElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET,
				UMLPackage.OPERATION_TEMPLATE_PARAMETER__PARAMETERED_ELEMENT,
				oldParameteredElement, newParameteredElement);
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
			&& !(newParameteredElement instanceof Operation)) {

			throw new IllegalArgumentException(newParameteredElement.toString());
		}

		msgs = basicSetParameteredElementGen(newParameteredElement, msgs);

		Resource.Internal eInternalResource = eInternalResource();

		if (eInternalResource == null || !eInternalResource.isLoading()) {

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
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.OPERATION_TEMPLATE_PARAMETER__PARAMETERED_ELEMENT,
				newParameteredElement, newParameteredElement));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetParameteredElement() {
		return parameteredElement != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.OPERATION_TEMPLATE_PARAMETER__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.OPERATION_TEMPLATE_PARAMETER__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.OPERATION_TEMPLATE_PARAMETER__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.OPERATION_TEMPLATE_PARAMETER__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.OPERATION_TEMPLATE_PARAMETER__SIGNATURE :
				if (resolve)
					return getSignature();
				return basicGetSignature();
			case UMLPackage.OPERATION_TEMPLATE_PARAMETER__PARAMETERED_ELEMENT :
				if (resolve)
					return getParameteredElement();
				return basicGetParameteredElement();
			case UMLPackage.OPERATION_TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT :
				if (resolve)
					return getOwnedParameteredElement();
				return basicGetOwnedParameteredElement();
			case UMLPackage.OPERATION_TEMPLATE_PARAMETER__DEFAULT :
				if (resolve)
					return getDefault();
				return basicGetDefault();
			case UMLPackage.OPERATION_TEMPLATE_PARAMETER__OWNED_DEFAULT :
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
			case UMLPackage.OPERATION_TEMPLATE_PARAMETER__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.OPERATION_TEMPLATE_PARAMETER__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.OPERATION_TEMPLATE_PARAMETER__OWNER :
				return isSetOwner();
			case UMLPackage.OPERATION_TEMPLATE_PARAMETER__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.OPERATION_TEMPLATE_PARAMETER__SIGNATURE :
				return basicGetSignature() != null;
			case UMLPackage.OPERATION_TEMPLATE_PARAMETER__PARAMETERED_ELEMENT :
				return isSetParameteredElement();
			case UMLPackage.OPERATION_TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT :
				return ownedParameteredElement != null;
			case UMLPackage.OPERATION_TEMPLATE_PARAMETER__DEFAULT :
				return default_ != null;
			case UMLPackage.OPERATION_TEMPLATE_PARAMETER__OWNED_DEFAULT :
				return ownedDefault != null;
		}
		return eDynamicIsSet(featureID);
	}

} //OperationTemplateParameterImpl
