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
 * $Id: OperationTemplateParameterImpl.java,v 1.1 2005/11/14 22:26:03 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

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
		return UMLPackage.eINSTANCE.getOperationTemplateParameter();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterableElement getParameteredElement() {
		ParameterableElement parameteredElement = (ParameterableElement) eVirtualGet(UMLPackage.OPERATION_TEMPLATE_PARAMETER__PARAMETERED_ELEMENT);
		if (parameteredElement != null && parameteredElement.eIsProxy()) {
			ParameterableElement oldParameteredElement = parameteredElement;
			parameteredElement = (ParameterableElement) eResolveProxy((InternalEObject) parameteredElement);
			if (parameteredElement != oldParameteredElement) {
				eVirtualSet(
					UMLPackage.OPERATION_TEMPLATE_PARAMETER__PARAMETERED_ELEMENT,
					parameteredElement);
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
		return (ParameterableElement) eVirtualGet(UMLPackage.OPERATION_TEMPLATE_PARAMETER__PARAMETERED_ELEMENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParameteredElement(
			ParameterableElement newParameteredElement, NotificationChain msgs) {
		Object oldParameteredElement = eVirtualSet(
			UMLPackage.OPERATION_TEMPLATE_PARAMETER__PARAMETERED_ELEMENT,
			newParameteredElement);
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET,
				UMLPackage.OPERATION_TEMPLATE_PARAMETER__PARAMETERED_ELEMENT,
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameteredElement(ParameterableElement newParameteredElement) {
		ParameterableElement parameteredElement = (ParameterableElement) eVirtualGet(UMLPackage.OPERATION_TEMPLATE_PARAMETER__PARAMETERED_ELEMENT);
		if (newParameteredElement != parameteredElement) {
			NotificationChain msgs = null;
			if (parameteredElement != null)
				msgs = ((InternalEObject) parameteredElement).eInverseRemove(
					this, UMLPackage.OPERATION__TEMPLATE_PARAMETER,
					Operation.class, msgs);
			if (newParameteredElement != null)
				msgs = ((InternalEObject) newParameteredElement).eInverseAdd(
					this, UMLPackage.OPERATION__TEMPLATE_PARAMETER,
					Operation.class, msgs);
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
		return eVirtualGet(UMLPackage.OPERATION_TEMPLATE_PARAMETER__PARAMETERED_ELEMENT) != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
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
				return getSignature();
			case UMLPackage.OPERATION_TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT :
				return getOwnedParameteredElement();
			case UMLPackage.OPERATION_TEMPLATE_PARAMETER__DEFAULT :
				if (resolve)
					return getDefault();
				return basicGetDefault();
			case UMLPackage.OPERATION_TEMPLATE_PARAMETER__OWNED_DEFAULT :
				return getOwnedDefault();
			case UMLPackage.OPERATION_TEMPLATE_PARAMETER__PARAMETERED_ELEMENT :
				if (resolve)
					return getParameteredElement();
				return basicGetParameteredElement();
		}
		return eDynamicGet(eFeature, resolve);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UMLPackage.OPERATION_TEMPLATE_PARAMETER__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.OPERATION_TEMPLATE_PARAMETER__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.OPERATION_TEMPLATE_PARAMETER__OWNER :
				return isSetOwner();
			case UMLPackage.OPERATION_TEMPLATE_PARAMETER__OWNED_COMMENT :
				List ownedComment = (List) eVirtualGet(UMLPackage.OPERATION_TEMPLATE_PARAMETER__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.OPERATION_TEMPLATE_PARAMETER__SIGNATURE :
				return getSignature() != null;
			case UMLPackage.OPERATION_TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT :
				return eVirtualGet(UMLPackage.OPERATION_TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT) != null;
			case UMLPackage.OPERATION_TEMPLATE_PARAMETER__DEFAULT :
				return eVirtualGet(UMLPackage.OPERATION_TEMPLATE_PARAMETER__DEFAULT) != null;
			case UMLPackage.OPERATION_TEMPLATE_PARAMETER__OWNED_DEFAULT :
				return eVirtualGet(UMLPackage.OPERATION_TEMPLATE_PARAMETER__OWNED_DEFAULT) != null;
			case UMLPackage.OPERATION_TEMPLATE_PARAMETER__PARAMETERED_ELEMENT :
				return eVirtualGet(UMLPackage.OPERATION_TEMPLATE_PARAMETER__PARAMETERED_ELEMENT) != null;
		}
		return eDynamicIsSet(eFeature);
	}

} //OperationTemplateParameterImpl
