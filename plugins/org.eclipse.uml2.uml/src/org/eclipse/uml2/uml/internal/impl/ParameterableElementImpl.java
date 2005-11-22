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
 * $Id: ParameterableElementImpl.java,v 1.2 2005/11/22 15:32:35 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.ParameterableElement;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.UMLPackage;

import org.eclipse.uml2.uml.internal.operations.ParameterableElementOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameterable Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ParameterableElementImpl#getTemplateParameter <em>Template Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ParameterableElementImpl#getOwningTemplateParameter <em>Owning Template Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ParameterableElementImpl
		extends ElementImpl
		implements ParameterableElement {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterableElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.eINSTANCE.getParameterableElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateParameter getTemplateParameter() {
		TemplateParameter templateParameter = (TemplateParameter) eVirtualGet(UMLPackage.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER);
		if (templateParameter != null && templateParameter.eIsProxy()) {
			InternalEObject oldTemplateParameter = (InternalEObject) templateParameter;
			templateParameter = (TemplateParameter) eResolveProxy(oldTemplateParameter);
			if (templateParameter != oldTemplateParameter) {
				eVirtualSet(
					UMLPackage.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER,
					templateParameter);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER,
						oldTemplateParameter, templateParameter));
			}
		}
		return templateParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateParameter basicGetTemplateParameter() {
		return (TemplateParameter) eVirtualGet(UMLPackage.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemplateParameter(
			TemplateParameter newTemplateParameter, NotificationChain msgs) {
		Object oldTemplateParameter = eVirtualSet(
			UMLPackage.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER,
			newTemplateParameter);
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET,
				UMLPackage.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER,
				oldTemplateParameter == EVIRTUAL_NO_VALUE
					? null
					: oldTemplateParameter, newTemplateParameter);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}

		if (getOwningTemplateParameter() != null
			&& getOwningTemplateParameter() != newTemplateParameter) {
			setOwningTemplateParameter(null);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemplateParameter(TemplateParameter newTemplateParameter) {
		TemplateParameter templateParameter = (TemplateParameter) eVirtualGet(UMLPackage.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER);
		if (newTemplateParameter != templateParameter) {
			NotificationChain msgs = null;
			if (templateParameter != null)
				msgs = ((InternalEObject) templateParameter).eInverseRemove(
					this, UMLPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT,
					TemplateParameter.class, msgs);
			if (newTemplateParameter != null)
				msgs = ((InternalEObject) newTemplateParameter).eInverseAdd(
					this, UMLPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT,
					TemplateParameter.class, msgs);
			msgs = basicSetTemplateParameter(newTemplateParameter, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER,
				newTemplateParameter, newTemplateParameter));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateParameter getOwningTemplateParameter() {
		if (eContainerFeatureID != UMLPackage.PARAMETERABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER)
			return null;
		return (TemplateParameter) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateParameter basicGetOwningTemplateParameter() {
		if (eContainerFeatureID != UMLPackage.PARAMETERABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER)
			return null;
		return (TemplateParameter) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningTemplateParameter(
			TemplateParameter newOwningTemplateParameter) {
		EObject oldOwningTemplateParameter = eContainer();
		if (newOwningTemplateParameter != eInternalContainer()
			|| (eContainerFeatureID != UMLPackage.PARAMETERABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER && newOwningTemplateParameter != null)) {
			if (EcoreUtil
				.isAncestor(this, (EObject) newOwningTemplateParameter))
				throw new IllegalArgumentException(
					"Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningTemplateParameter != null)
				msgs = ((InternalEObject) newOwningTemplateParameter)
					.eInverseAdd(
						this,
						UMLPackage.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
						TemplateParameter.class, msgs);
			msgs = eBasicSetContainer(
				(InternalEObject) newOwningTemplateParameter,
				UMLPackage.PARAMETERABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER,
				msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.PARAMETERABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER,
				newOwningTemplateParameter, newOwningTemplateParameter));

		if (newOwningTemplateParameter != null
			|| oldOwningTemplateParameter == eVirtualGet(UMLPackage.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER)) {
			setTemplateParameter(newOwningTemplateParameter);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCompatibleWith(ParameterableElement p) {
		return ParameterableElementOperations.isCompatibleWith(this, p);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTemplateParameter() {
		return ParameterableElementOperations.isTemplateParameter(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UMLPackage.PARAMETERABLE_ELEMENT__EANNOTATIONS :
					return ((InternalEList) getEAnnotations()).basicAdd(
						otherEnd, msgs);
				case UMLPackage.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER :
					TemplateParameter templateParameter = (TemplateParameter) eVirtualGet(UMLPackage.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER);
					if (templateParameter != null)
						msgs = ((InternalEObject) templateParameter)
							.eInverseRemove(
								this,
								UMLPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT,
								TemplateParameter.class, msgs);
					return basicSetTemplateParameter(
						(TemplateParameter) otherEnd, msgs);
				case UMLPackage.PARAMETERABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER :
					if (eInternalContainer() != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(
						otherEnd,
						UMLPackage.PARAMETERABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER,
						msgs);
				default :
					return eDynamicInverseAdd(otherEnd, featureID, baseClass,
						msgs);
			}
		}
		if (eInternalContainer() != null)
			msgs = eBasicRemoveFromContainer(msgs);
		return eBasicSetContainer(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UMLPackage.PARAMETERABLE_ELEMENT__EANNOTATIONS :
					return ((InternalEList) getEAnnotations()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.PARAMETERABLE_ELEMENT__OWNED_COMMENT :
					return ((InternalEList) getOwnedComments()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER :
					return basicSetTemplateParameter(null, msgs);
				case UMLPackage.PARAMETERABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER :
					return eBasicSetContainer(
						null,
						UMLPackage.PARAMETERABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER,
						msgs);
				default :
					return eDynamicInverseRemove(otherEnd, featureID,
						baseClass, msgs);
			}
		}
		return eBasicSetContainer(null, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eBasicRemoveFromContainer(NotificationChain msgs) {
		if (eContainerFeatureID >= 0) {
			switch (eContainerFeatureID) {
				case UMLPackage.PARAMETERABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER :
					return eInternalContainer()
						.eInverseRemove(
							this,
							UMLPackage.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
							TemplateParameter.class, msgs);
				default :
					return eDynamicBasicRemoveFromContainer(msgs);
			}
		}
		return eInternalContainer().eInverseRemove(this,
			EOPPOSITE_FEATURE_BASE - eContainerFeatureID, null, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UMLPackage.PARAMETERABLE_ELEMENT__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.PARAMETERABLE_ELEMENT__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.PARAMETERABLE_ELEMENT__OWNER :
				return getOwner();
			case UMLPackage.PARAMETERABLE_ELEMENT__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER :
				if (resolve)
					return getTemplateParameter();
				return basicGetTemplateParameter();
			case UMLPackage.PARAMETERABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER :
				if (resolve)
					return getOwningTemplateParameter();
				return basicGetOwningTemplateParameter();
		}
		return eDynamicGet(eFeature, resolve);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(EStructuralFeature eFeature, Object newValue) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UMLPackage.PARAMETERABLE_ELEMENT__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.PARAMETERABLE_ELEMENT__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.PARAMETERABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) newValue);
				return;
		}
		eDynamicSet(eFeature, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UMLPackage.PARAMETERABLE_ELEMENT__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.PARAMETERABLE_ELEMENT__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.PARAMETERABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) null);
				return;
		}
		eDynamicUnset(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UMLPackage.PARAMETERABLE_ELEMENT__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.PARAMETERABLE_ELEMENT__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.PARAMETERABLE_ELEMENT__OWNER :
				return isSetOwner();
			case UMLPackage.PARAMETERABLE_ELEMENT__OWNED_COMMENT :
				List ownedComment = (List) eVirtualGet(UMLPackage.PARAMETERABLE_ELEMENT__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER :
				return eVirtualGet(UMLPackage.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER) != null;
			case UMLPackage.PARAMETERABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER :
				return basicGetOwningTemplateParameter() != null;
		}
		return eDynamicIsSet(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getOwner() {
		TemplateParameter owningTemplateParameter = getOwningTemplateParameter();
		if (owningTemplateParameter != null) {
			return owningTemplateParameter;
		}
		return super.getOwner();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwner() {
		return super.isSetOwner()
			|| eIsSet(UMLPackage.eINSTANCE
				.getParameterableElement_OwningTemplateParameter());
	}

} //ParameterableElementImpl
