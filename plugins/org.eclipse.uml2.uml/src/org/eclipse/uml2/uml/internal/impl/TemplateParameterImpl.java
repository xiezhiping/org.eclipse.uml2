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
 * $Id: TemplateParameterImpl.java,v 1.11 2006/03/01 17:56:37 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.ParameterableElement;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.TemplateSignature;
import org.eclipse.uml2.uml.UMLPackage;

import org.eclipse.uml2.uml.internal.operations.TemplateParameterOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Template Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.TemplateParameterImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.TemplateParameterImpl#getParameteredElement <em>Parametered Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.TemplateParameterImpl#getDefault <em>Default</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.TemplateParameterImpl#getSignature <em>Signature</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.TemplateParameterImpl#getOwnedParameteredElement <em>Owned Parametered Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.TemplateParameterImpl#getOwnedDefault <em>Owned Default</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TemplateParameterImpl
		extends ElementImpl
		implements TemplateParameter {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemplateParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.Literals.TEMPLATE_PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedElements() {
		EList ownedElement = (EList) eVirtualGet(UMLPackage.TEMPLATE_PARAMETER__OWNED_ELEMENT);
		if (ownedElement == null) {
			eVirtualSet(
				UMLPackage.TEMPLATE_PARAMETER__OWNED_ELEMENT,
				ownedElement = new DerivedUnionEObjectEList(
					Element.class,
					this,
					UMLPackage.TEMPLATE_PARAMETER__OWNED_ELEMENT,
					new int[]{
						UMLPackage.TEMPLATE_PARAMETER__OWNED_COMMENT,
						UMLPackage.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
						UMLPackage.TEMPLATE_PARAMETER__OWNED_DEFAULT}));
		}
		return ownedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterableElement getParameteredElement() {
		ParameterableElement parameteredElement = (ParameterableElement) eVirtualGet(UMLPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT);
		if (parameteredElement != null && parameteredElement.eIsProxy()) {
			InternalEObject oldParameteredElement = (InternalEObject) parameteredElement;
			parameteredElement = (ParameterableElement) eResolveProxy(oldParameteredElement);
			if (parameteredElement != oldParameteredElement) {
				eVirtualSet(UMLPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT,
					parameteredElement);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT,
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
		return (ParameterableElement) eVirtualGet(UMLPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParameteredElement(
			ParameterableElement newParameteredElement, NotificationChain msgs) {
		Object oldParameteredElement = eVirtualSet(
			UMLPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT,
			newParameteredElement);
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET,
				UMLPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT,
				oldParameteredElement == EVIRTUAL_NO_VALUE
					? null
					: oldParameteredElement, newParameteredElement);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}

		Resource.Internal eInternalResource = eInternalResource();
		if (eInternalResource == null || !eInternalResource.isLoading()) {
			Object ownedParameteredElement = eVirtualGet(UMLPackage.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT);
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
		ParameterableElement parameteredElement = (ParameterableElement) eVirtualGet(UMLPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT);
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
				UMLPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT,
				newParameteredElement, newParameteredElement));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterableElement getDefault() {
		ParameterableElement default_ = (ParameterableElement) eVirtualGet(UMLPackage.TEMPLATE_PARAMETER__DEFAULT);
		if (default_ != null && default_.eIsProxy()) {
			InternalEObject oldDefault = (InternalEObject) default_;
			default_ = (ParameterableElement) eResolveProxy(oldDefault);
			if (default_ != oldDefault) {
				eVirtualSet(UMLPackage.TEMPLATE_PARAMETER__DEFAULT, default_);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.TEMPLATE_PARAMETER__DEFAULT, oldDefault,
						default_));
			}
		}
		return default_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterableElement basicGetDefault() {
		return (ParameterableElement) eVirtualGet(UMLPackage.TEMPLATE_PARAMETER__DEFAULT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefault(ParameterableElement newDefault) {
		ParameterableElement default_ = newDefault;
		Object oldDefault = eVirtualSet(UMLPackage.TEMPLATE_PARAMETER__DEFAULT,
			default_);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.TEMPLATE_PARAMETER__DEFAULT,
				oldDefault == EVIRTUAL_NO_VALUE
					? null
					: oldDefault, default_));

		Resource.Internal eInternalResource = eInternalResource();
		if (eInternalResource == null || !eInternalResource.isLoading()) {
			Object ownedDefault = eVirtualGet(UMLPackage.TEMPLATE_PARAMETER__OWNED_DEFAULT);
			if (ownedDefault != null && ownedDefault != newDefault) {
				setOwnedDefault(null);
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateSignature getSignature() {
		if (eContainerFeatureID != UMLPackage.TEMPLATE_PARAMETER__SIGNATURE)
			return null;
		return (TemplateSignature) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSignature(TemplateSignature newSignature,
			NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newSignature,
			UMLPackage.TEMPLATE_PARAMETER__SIGNATURE, msgs);

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignature(TemplateSignature newSignature) {
		if (newSignature != eInternalContainer()
			|| (eContainerFeatureID != UMLPackage.TEMPLATE_PARAMETER__SIGNATURE && newSignature != null)) {
			if (EcoreUtil.isAncestor(this, newSignature))
				throw new IllegalArgumentException(
					"Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSignature != null)
				msgs = ((InternalEObject) newSignature).eInverseAdd(this,
					UMLPackage.TEMPLATE_SIGNATURE__OWNED_PARAMETER,
					TemplateSignature.class, msgs);
			msgs = basicSetSignature(newSignature, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.TEMPLATE_PARAMETER__SIGNATURE, newSignature,
				newSignature));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterableElement getOwnedParameteredElement() {
		ParameterableElement ownedParameteredElement = (ParameterableElement) eVirtualGet(UMLPackage.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT);
		if (ownedParameteredElement != null
			&& ownedParameteredElement.eIsProxy()) {
			InternalEObject oldOwnedParameteredElement = (InternalEObject) ownedParameteredElement;
			ownedParameteredElement = (ParameterableElement) eResolveProxy(oldOwnedParameteredElement);
			if (ownedParameteredElement != oldOwnedParameteredElement) {
				InternalEObject newOwnedParameteredElement = (InternalEObject) ownedParameteredElement;
				NotificationChain msgs = oldOwnedParameteredElement
					.eInverseRemove(
						this,
						UMLPackage.PARAMETERABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER,
						ParameterableElement.class, null);
				if (newOwnedParameteredElement.eInternalContainer() == null) {
					msgs = newOwnedParameteredElement
						.eInverseAdd(
							this,
							UMLPackage.PARAMETERABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER,
							ParameterableElement.class, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(
						this,
						Notification.RESOLVE,
						UMLPackage.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
						oldOwnedParameteredElement, ownedParameteredElement));
			}
		}
		return ownedParameteredElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterableElement basicGetOwnedParameteredElement() {
		return (ParameterableElement) eVirtualGet(UMLPackage.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedParameteredElement(
			ParameterableElement newOwnedParameteredElement,
			NotificationChain msgs) {
		Object oldOwnedParameteredElement = eVirtualSet(
			UMLPackage.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
			newOwnedParameteredElement);
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET,
				UMLPackage.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				oldOwnedParameteredElement == EVIRTUAL_NO_VALUE
					? null
					: oldOwnedParameteredElement, newOwnedParameteredElement);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}

		Resource.Internal eInternalResource = eInternalResource();
		if (eInternalResource == null || !eInternalResource.isLoading()) {
			if (newOwnedParameteredElement != null) {
				Object parameteredElement = eVirtualGet(UMLPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT);
				if (newOwnedParameteredElement != parameteredElement) {
					setParameteredElement(newOwnedParameteredElement);
				}
			}
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedParameteredElement(
			ParameterableElement newOwnedParameteredElement) {
		ParameterableElement ownedParameteredElement = (ParameterableElement) eVirtualGet(UMLPackage.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT);
		if (newOwnedParameteredElement != ownedParameteredElement) {
			NotificationChain msgs = null;
			if (ownedParameteredElement != null)
				msgs = ((InternalEObject) ownedParameteredElement)
					.eInverseRemove(
						this,
						UMLPackage.PARAMETERABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER,
						ParameterableElement.class, msgs);
			if (newOwnedParameteredElement != null)
				msgs = ((InternalEObject) newOwnedParameteredElement)
					.eInverseAdd(
						this,
						UMLPackage.PARAMETERABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER,
						ParameterableElement.class, msgs);
			msgs = basicSetOwnedParameteredElement(newOwnedParameteredElement,
				msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				newOwnedParameteredElement, newOwnedParameteredElement));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterableElement createOwnedParameteredElement(EClass eClass) {
		ParameterableElement newOwnedParameteredElement = (ParameterableElement) EcoreUtil
			.create(eClass);
		setOwnedParameteredElement(newOwnedParameteredElement);
		return newOwnedParameteredElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterableElement getOwnedDefault() {
		ParameterableElement ownedDefault = (ParameterableElement) eVirtualGet(UMLPackage.TEMPLATE_PARAMETER__OWNED_DEFAULT);
		if (ownedDefault != null && ownedDefault.eIsProxy()) {
			InternalEObject oldOwnedDefault = (InternalEObject) ownedDefault;
			ownedDefault = (ParameterableElement) eResolveProxy(oldOwnedDefault);
			if (ownedDefault != oldOwnedDefault) {
				InternalEObject newOwnedDefault = (InternalEObject) ownedDefault;
				NotificationChain msgs = oldOwnedDefault.eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.TEMPLATE_PARAMETER__OWNED_DEFAULT, null,
					null);
				if (newOwnedDefault.eInternalContainer() == null) {
					msgs = newOwnedDefault.eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
							- UMLPackage.TEMPLATE_PARAMETER__OWNED_DEFAULT,
						null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.TEMPLATE_PARAMETER__OWNED_DEFAULT,
						oldOwnedDefault, ownedDefault));
			}
		}
		return ownedDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterableElement basicGetOwnedDefault() {
		return (ParameterableElement) eVirtualGet(UMLPackage.TEMPLATE_PARAMETER__OWNED_DEFAULT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedDefault(
			ParameterableElement newOwnedDefault, NotificationChain msgs) {
		Object oldOwnedDefault = eVirtualSet(
			UMLPackage.TEMPLATE_PARAMETER__OWNED_DEFAULT, newOwnedDefault);
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET, UMLPackage.TEMPLATE_PARAMETER__OWNED_DEFAULT,
				oldOwnedDefault == EVIRTUAL_NO_VALUE
					? null
					: oldOwnedDefault, newOwnedDefault);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}

		Resource.Internal eInternalResource = eInternalResource();
		if (eInternalResource == null || !eInternalResource.isLoading()) {
			if (newOwnedDefault != null) {
				Object default_ = eVirtualGet(UMLPackage.TEMPLATE_PARAMETER__DEFAULT);
				if (newOwnedDefault != default_) {
					setDefault(newOwnedDefault);
				}
			}
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedDefault(ParameterableElement newOwnedDefault) {
		ParameterableElement ownedDefault = (ParameterableElement) eVirtualGet(UMLPackage.TEMPLATE_PARAMETER__OWNED_DEFAULT);
		if (newOwnedDefault != ownedDefault) {
			NotificationChain msgs = null;
			if (ownedDefault != null)
				msgs = ((InternalEObject) ownedDefault).eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.TEMPLATE_PARAMETER__OWNED_DEFAULT, null,
					msgs);
			if (newOwnedDefault != null)
				msgs = ((InternalEObject) newOwnedDefault).eInverseAdd(this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.TEMPLATE_PARAMETER__OWNED_DEFAULT, null,
					msgs);
			msgs = basicSetOwnedDefault(newOwnedDefault, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.TEMPLATE_PARAMETER__OWNED_DEFAULT, newOwnedDefault,
				newOwnedDefault));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterableElement createOwnedDefault(EClass eClass) {
		ParameterableElement newOwnedDefault = (ParameterableElement) EcoreUtil
			.create(eClass);
		setOwnedDefault(newOwnedDefault);
		return newOwnedDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMustBeCompatible(DiagnosticChain diagnostics,
			Map context) {
		return TemplateParameterOperations.validateMustBeCompatible(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.TEMPLATE_PARAMETER__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.TEMPLATE_PARAMETER__SIGNATURE :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSignature((TemplateSignature) otherEnd, msgs);
			case UMLPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT :
				ParameterableElement parameteredElement = (ParameterableElement) eVirtualGet(UMLPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT);
				if (parameteredElement != null)
					msgs = ((InternalEObject) parameteredElement)
						.eInverseRemove(
							this,
							UMLPackage.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER,
							ParameterableElement.class, msgs);
				return basicSetParameteredElement(
					(ParameterableElement) otherEnd, msgs);
			case UMLPackage.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT :
				ParameterableElement ownedParameteredElement = (ParameterableElement) eVirtualGet(UMLPackage.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT);
				if (ownedParameteredElement != null)
					msgs = ((InternalEObject) ownedParameteredElement)
						.eInverseRemove(
							this,
							EOPPOSITE_FEATURE_BASE
								- UMLPackage.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
							null, msgs);
				return basicSetOwnedParameteredElement(
					(ParameterableElement) otherEnd, msgs);
		}
		return eDynamicInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.TEMPLATE_PARAMETER__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.TEMPLATE_PARAMETER__OWNED_COMMENT :
				return ((InternalEList) getOwnedComments()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.TEMPLATE_PARAMETER__SIGNATURE :
				return basicSetSignature(null, msgs);
			case UMLPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT :
				return basicSetParameteredElement(null, msgs);
			case UMLPackage.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT :
				return basicSetOwnedParameteredElement(null, msgs);
			case UMLPackage.TEMPLATE_PARAMETER__OWNED_DEFAULT :
				return basicSetOwnedDefault(null, msgs);
		}
		return eDynamicInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eBasicRemoveFromContainerFeature(
			NotificationChain msgs) {
		switch (eContainerFeatureID) {
			case UMLPackage.TEMPLATE_PARAMETER__SIGNATURE :
				return eInternalContainer().eInverseRemove(this,
					UMLPackage.TEMPLATE_SIGNATURE__OWNED_PARAMETER,
					TemplateSignature.class, msgs);
		}
		return eDynamicBasicRemoveFromContainer(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.TEMPLATE_PARAMETER__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.TEMPLATE_PARAMETER__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.TEMPLATE_PARAMETER__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.TEMPLATE_PARAMETER__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.TEMPLATE_PARAMETER__SIGNATURE :
				return getSignature();
			case UMLPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT :
				if (resolve)
					return getParameteredElement();
				return basicGetParameteredElement();
			case UMLPackage.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT :
				if (resolve)
					return getOwnedParameteredElement();
				return basicGetOwnedParameteredElement();
			case UMLPackage.TEMPLATE_PARAMETER__DEFAULT :
				if (resolve)
					return getDefault();
				return basicGetDefault();
			case UMLPackage.TEMPLATE_PARAMETER__OWNED_DEFAULT :
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UMLPackage.TEMPLATE_PARAMETER__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.TEMPLATE_PARAMETER__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.TEMPLATE_PARAMETER__SIGNATURE :
				setSignature((TemplateSignature) newValue);
				return;
			case UMLPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT :
				setParameteredElement((ParameterableElement) newValue);
				return;
			case UMLPackage.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT :
				setOwnedParameteredElement((ParameterableElement) newValue);
				return;
			case UMLPackage.TEMPLATE_PARAMETER__DEFAULT :
				setDefault((ParameterableElement) newValue);
				return;
			case UMLPackage.TEMPLATE_PARAMETER__OWNED_DEFAULT :
				setOwnedDefault((ParameterableElement) newValue);
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
			case UMLPackage.TEMPLATE_PARAMETER__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.TEMPLATE_PARAMETER__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.TEMPLATE_PARAMETER__SIGNATURE :
				setSignature((TemplateSignature) null);
				return;
			case UMLPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT :
				setParameteredElement((ParameterableElement) null);
				return;
			case UMLPackage.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT :
				setOwnedParameteredElement((ParameterableElement) null);
				return;
			case UMLPackage.TEMPLATE_PARAMETER__DEFAULT :
				setDefault((ParameterableElement) null);
				return;
			case UMLPackage.TEMPLATE_PARAMETER__OWNED_DEFAULT :
				setOwnedDefault((ParameterableElement) null);
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
			case UMLPackage.TEMPLATE_PARAMETER__EANNOTATIONS :
				EList eAnnotations = (EList) eVirtualGet(UMLPackage.TEMPLATE_PARAMETER__EANNOTATIONS);
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.TEMPLATE_PARAMETER__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.TEMPLATE_PARAMETER__OWNER :
				return isSetOwner();
			case UMLPackage.TEMPLATE_PARAMETER__OWNED_COMMENT :
				EList ownedComment = (EList) eVirtualGet(UMLPackage.TEMPLATE_PARAMETER__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.TEMPLATE_PARAMETER__SIGNATURE :
				return getSignature() != null;
			case UMLPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT :
				return eVirtualGet(UMLPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT) != null;
			case UMLPackage.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT :
				return eVirtualGet(UMLPackage.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT) != null;
			case UMLPackage.TEMPLATE_PARAMETER__DEFAULT :
				return eVirtualGet(UMLPackage.TEMPLATE_PARAMETER__DEFAULT) != null;
			case UMLPackage.TEMPLATE_PARAMETER__OWNED_DEFAULT :
				return eVirtualGet(UMLPackage.TEMPLATE_PARAMETER__OWNED_DEFAULT) != null;
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetOwner() {
		TemplateSignature signature = getSignature();
		if (signature != null) {
			return signature;
		}
		return super.basicGetOwner();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwner() {
		return super.isSetOwner()
			|| eIsSet(UMLPackage.TEMPLATE_PARAMETER__SIGNATURE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| eIsSet(UMLPackage.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT)
			|| eIsSet(UMLPackage.TEMPLATE_PARAMETER__OWNED_DEFAULT);
	}

} //TemplateParameterImpl
