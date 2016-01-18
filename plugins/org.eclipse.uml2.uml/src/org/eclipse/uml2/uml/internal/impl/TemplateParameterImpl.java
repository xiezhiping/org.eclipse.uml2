/*
 * Copyright (c) 2005, 2016 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey - 286329, 323181
 *   Kenn Hussey (CEA) - 327039, 351774, 418466, 451350, 485756
 *
 */
package org.eclipse.uml2.uml.internal.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.ParameterableElement;
import org.eclipse.uml2.uml.Stereotype;
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
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.TemplateParameterImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.TemplateParameterImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.TemplateParameterImpl#getDefault <em>Default</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.TemplateParameterImpl#getParameteredElement <em>Parametered Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.TemplateParameterImpl#getOwnedDefault <em>Owned Default</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.TemplateParameterImpl#getSignature <em>Signature</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.TemplateParameterImpl#getOwnedParameteredElement <em>Owned Parametered Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TemplateParameterImpl
		extends ElementImpl
		implements TemplateParameter {

	/**
	 * The cached value of the '{@link #getDefault() <em>Default</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault()
	 * @generated
	 * @ordered
	 */
	protected ParameterableElement default_;

	/**
	 * The cached value of the '{@link #getParameteredElement() <em>Parametered Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameteredElement()
	 * @generated
	 * @ordered
	 */
	protected ParameterableElement parameteredElement;

	/**
	 * The cached value of the '{@link #getOwnedDefault() <em>Owned Default</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedDefault()
	 * @generated
	 * @ordered
	 */
	protected ParameterableElement ownedDefault;

	/**
	 * The cached value of the '{@link #getOwnedParameteredElement() <em>Owned Parametered Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedParameteredElement()
	 * @generated
	 * @ordered
	 */
	protected ParameterableElement ownedParameteredElement;

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
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.TEMPLATE_PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element getOwner() {
		Element owner = basicGetOwner();
		return owner != null && owner.eIsProxy()
			? (Element) eResolveProxy((InternalEObject) owner)
			: owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Element> getOwnedElements() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			@SuppressWarnings("unchecked")
			EList<Element> ownedElements = (EList<Element>) cache.get(eResource,
				this, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
			if (ownedElements == null) {
				cache.put(eResource, this,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT,
					ownedElements = new DerivedUnionEObjectEList<Element>(
						Element.class, this,
						UMLPackage.TEMPLATE_PARAMETER__OWNED_ELEMENT,
						OWNED_ELEMENT_ESUBSETS));
			}
			return ownedElements;
		}
		return new DerivedUnionEObjectEList<Element>(Element.class, this,
			UMLPackage.TEMPLATE_PARAMETER__OWNED_ELEMENT,
			OWNED_ELEMENT_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterableElement getParameteredElement() {
		if (parameteredElement != null && parameteredElement.eIsProxy()) {
			InternalEObject oldParameteredElement = (InternalEObject) parameteredElement;
			parameteredElement = (ParameterableElement) eResolveProxy(
				oldParameteredElement);
			if (parameteredElement != oldParameteredElement) {
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
		return parameteredElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParameteredElement(
			ParameterableElement newParameteredElement,
			NotificationChain msgs) {
		ParameterableElement oldParameteredElement = parameteredElement;
		parameteredElement = newParameteredElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET,
				UMLPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT,
				oldParameteredElement, newParameteredElement);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
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
	public void setParameteredElement(
			ParameterableElement newParameteredElement) {
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
		if (default_ != null && default_.eIsProxy()) {
			InternalEObject oldDefault = (InternalEObject) default_;
			default_ = (ParameterableElement) eResolveProxy(oldDefault);
			if (default_ != oldDefault) {
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
		return default_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefault(ParameterableElement newDefault) {
		ParameterableElement oldDefault = default_;
		default_ = newDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.TEMPLATE_PARAMETER__DEFAULT, oldDefault, default_));
		Resource.Internal eInternalResource = eInternalResource();
		if (eInternalResource == null || !eInternalResource.isLoading()) {
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
		if (eContainerFeatureID() != UMLPackage.TEMPLATE_PARAMETER__SIGNATURE)
			return null;
		return (TemplateSignature) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateSignature basicGetSignature() {
		if (eContainerFeatureID() != UMLPackage.TEMPLATE_PARAMETER__SIGNATURE)
			return null;
		return (TemplateSignature) eInternalContainer();
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
			|| (eContainerFeatureID() != UMLPackage.TEMPLATE_PARAMETER__SIGNATURE
				&& newSignature != null)) {
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
		if (ownedParameteredElement != null
			&& ownedParameteredElement.eIsProxy()) {
			InternalEObject oldOwnedParameteredElement = (InternalEObject) ownedParameteredElement;
			ownedParameteredElement = (ParameterableElement) eResolveProxy(
				oldOwnedParameteredElement);
			if (ownedParameteredElement != oldOwnedParameteredElement) {
				InternalEObject newOwnedParameteredElement = (InternalEObject) ownedParameteredElement;
				NotificationChain msgs = oldOwnedParameteredElement
					.eInverseRemove(this,
						UMLPackage.PARAMETERABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER,
						ParameterableElement.class, null);
				if (newOwnedParameteredElement.eInternalContainer() == null) {
					msgs = newOwnedParameteredElement.eInverseAdd(this,
						UMLPackage.PARAMETERABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER,
						ParameterableElement.class, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
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
		return ownedParameteredElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedParameteredElement(
			ParameterableElement newOwnedParameteredElement,
			NotificationChain msgs) {
		ParameterableElement oldOwnedParameteredElement = ownedParameteredElement;
		ownedParameteredElement = newOwnedParameteredElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET,
				UMLPackage.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				oldOwnedParameteredElement, newOwnedParameteredElement);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		Resource.Internal eInternalResource = eInternalResource();
		if (eInternalResource == null || !eInternalResource.isLoading()) {
			if (newOwnedParameteredElement != null) {
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
		if (newOwnedParameteredElement != ownedParameteredElement) {
			NotificationChain msgs = null;
			if (ownedParameteredElement != null)
				msgs = ((InternalEObject) ownedParameteredElement)
					.eInverseRemove(this,
						UMLPackage.PARAMETERABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER,
						ParameterableElement.class, msgs);
			if (newOwnedParameteredElement != null)
				msgs = ((InternalEObject) newOwnedParameteredElement)
					.eInverseAdd(this,
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
		ParameterableElement newOwnedParameteredElement = (ParameterableElement) create(
			eClass);
		setOwnedParameteredElement(newOwnedParameteredElement);
		return newOwnedParameteredElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterableElement getOwnedDefault() {
		if (ownedDefault != null && ownedDefault.eIsProxy()) {
			InternalEObject oldOwnedDefault = (InternalEObject) ownedDefault;
			ownedDefault = (ParameterableElement) eResolveProxy(
				oldOwnedDefault);
			if (ownedDefault != oldOwnedDefault) {
				InternalEObject newOwnedDefault = (InternalEObject) ownedDefault;
				NotificationChain msgs = oldOwnedDefault.eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.TEMPLATE_PARAMETER__OWNED_DEFAULT,
					null, null);
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
		return ownedDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedDefault(
			ParameterableElement newOwnedDefault, NotificationChain msgs) {
		ParameterableElement oldOwnedDefault = ownedDefault;
		ownedDefault = newOwnedDefault;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET, UMLPackage.TEMPLATE_PARAMETER__OWNED_DEFAULT,
				oldOwnedDefault, newOwnedDefault);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		Resource.Internal eInternalResource = eInternalResource();
		if (eInternalResource == null || !eInternalResource.isLoading()) {
			if (newOwnedDefault != null) {
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
		if (newOwnedDefault != ownedDefault) {
			NotificationChain msgs = null;
			if (ownedDefault != null)
				msgs = ((InternalEObject) ownedDefault).eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.TEMPLATE_PARAMETER__OWNED_DEFAULT,
					null, msgs);
			if (newOwnedDefault != null)
				msgs = ((InternalEObject) newOwnedDefault).eInverseAdd(this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.TEMPLATE_PARAMETER__OWNED_DEFAULT,
					null, msgs);
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
		ParameterableElement newOwnedDefault = (ParameterableElement) create(
			eClass);
		setOwnedDefault(newOwnedDefault);
		return newOwnedDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMustBeCompatible(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return TemplateParameterOperations.validateMustBeCompatible(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.TEMPLATE_PARAMETER__EANNOTATIONS :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getEAnnotations())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT :
				if (parameteredElement != null)
					msgs = ((InternalEObject) parameteredElement)
						.eInverseRemove(this,
							UMLPackage.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER,
							ParameterableElement.class, msgs);
				return basicSetParameteredElement(
					(ParameterableElement) otherEnd, msgs);
			case UMLPackage.TEMPLATE_PARAMETER__SIGNATURE :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSignature((TemplateSignature) otherEnd, msgs);
			case UMLPackage.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT :
				if (ownedParameteredElement != null)
					msgs = ((InternalEObject) ownedParameteredElement)
						.eInverseRemove(this,
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
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.TEMPLATE_PARAMETER__EANNOTATIONS :
				return ((InternalEList<?>) getEAnnotations())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.TEMPLATE_PARAMETER__OWNED_COMMENT :
				return ((InternalEList<?>) getOwnedComments())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.TEMPLATE_PARAMETER__OWNED_DEFAULT :
				return basicSetOwnedDefault(null, msgs);
			case UMLPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT :
				return basicSetParameteredElement(null, msgs);
			case UMLPackage.TEMPLATE_PARAMETER__SIGNATURE :
				return basicSetSignature(null, msgs);
			case UMLPackage.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT :
				return basicSetOwnedParameteredElement(null, msgs);
		}
		return eDynamicInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(
			NotificationChain msgs) {
		switch (eContainerFeatureID()) {
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.TEMPLATE_PARAMETER__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.TEMPLATE_PARAMETER__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.TEMPLATE_PARAMETER__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.TEMPLATE_PARAMETER__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.TEMPLATE_PARAMETER__DEFAULT :
				if (resolve)
					return getDefault();
				return basicGetDefault();
			case UMLPackage.TEMPLATE_PARAMETER__OWNED_DEFAULT :
				if (resolve)
					return getOwnedDefault();
				return basicGetOwnedDefault();
			case UMLPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT :
				if (resolve)
					return getParameteredElement();
				return basicGetParameteredElement();
			case UMLPackage.TEMPLATE_PARAMETER__SIGNATURE :
				if (resolve)
					return getSignature();
				return basicGetSignature();
			case UMLPackage.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT :
				if (resolve)
					return getOwnedParameteredElement();
				return basicGetOwnedParameteredElement();
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
			case UMLPackage.TEMPLATE_PARAMETER__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations()
					.addAll((Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.TEMPLATE_PARAMETER__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments()
					.addAll((Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.TEMPLATE_PARAMETER__DEFAULT :
				setDefault((ParameterableElement) newValue);
				return;
			case UMLPackage.TEMPLATE_PARAMETER__OWNED_DEFAULT :
				setOwnedDefault((ParameterableElement) newValue);
				return;
			case UMLPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT :
				setParameteredElement((ParameterableElement) newValue);
				return;
			case UMLPackage.TEMPLATE_PARAMETER__SIGNATURE :
				setSignature((TemplateSignature) newValue);
				return;
			case UMLPackage.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT :
				setOwnedParameteredElement((ParameterableElement) newValue);
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
			case UMLPackage.TEMPLATE_PARAMETER__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.TEMPLATE_PARAMETER__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.TEMPLATE_PARAMETER__DEFAULT :
				setDefault((ParameterableElement) null);
				return;
			case UMLPackage.TEMPLATE_PARAMETER__OWNED_DEFAULT :
				setOwnedDefault((ParameterableElement) null);
				return;
			case UMLPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT :
				setParameteredElement((ParameterableElement) null);
				return;
			case UMLPackage.TEMPLATE_PARAMETER__SIGNATURE :
				setSignature((TemplateSignature) null);
				return;
			case UMLPackage.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT :
				setOwnedParameteredElement((ParameterableElement) null);
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
			case UMLPackage.TEMPLATE_PARAMETER__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.TEMPLATE_PARAMETER__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.TEMPLATE_PARAMETER__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.TEMPLATE_PARAMETER__OWNER :
				return isSetOwner();
			case UMLPackage.TEMPLATE_PARAMETER__DEFAULT :
				return default_ != null;
			case UMLPackage.TEMPLATE_PARAMETER__OWNED_DEFAULT :
				return ownedDefault != null;
			case UMLPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT :
				return parameteredElement != null;
			case UMLPackage.TEMPLATE_PARAMETER__SIGNATURE :
				return basicGetSignature() != null;
			case UMLPackage.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT :
				return ownedParameteredElement != null;
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments)
			throws InvocationTargetException {
		switch (operationID) {
			case UMLPackage.TEMPLATE_PARAMETER___GET_EANNOTATION__STRING :
				return getEAnnotation((String) arguments.get(0));
			case UMLPackage.TEMPLATE_PARAMETER___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP :
				return validateHasOwner((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.TEMPLATE_PARAMETER___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP :
				return validateNotOwnSelf((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.TEMPLATE_PARAMETER___ADD_KEYWORD__STRING :
				return addKeyword((String) arguments.get(0));
			case UMLPackage.TEMPLATE_PARAMETER___APPLY_STEREOTYPE__STEREOTYPE :
				return applyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.TEMPLATE_PARAMETER___CREATE_EANNOTATION__STRING :
				return createEAnnotation((String) arguments.get(0));
			case UMLPackage.TEMPLATE_PARAMETER___DESTROY :
				destroy();
				return null;
			case UMLPackage.TEMPLATE_PARAMETER___GET_KEYWORDS :
				return getKeywords();
			case UMLPackage.TEMPLATE_PARAMETER___GET_APPLICABLE_STEREOTYPE__STRING :
				return getApplicableStereotype((String) arguments.get(0));
			case UMLPackage.TEMPLATE_PARAMETER___GET_APPLICABLE_STEREOTYPES :
				return getApplicableStereotypes();
			case UMLPackage.TEMPLATE_PARAMETER___GET_APPLIED_STEREOTYPE__STRING :
				return getAppliedStereotype((String) arguments.get(0));
			case UMLPackage.TEMPLATE_PARAMETER___GET_APPLIED_STEREOTYPES :
				return getAppliedStereotypes();
			case UMLPackage.TEMPLATE_PARAMETER___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING :
				return getAppliedSubstereotype((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.TEMPLATE_PARAMETER___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE :
				return getAppliedSubstereotypes((Stereotype) arguments.get(0));
			case UMLPackage.TEMPLATE_PARAMETER___GET_MODEL :
				return getModel();
			case UMLPackage.TEMPLATE_PARAMETER___GET_NEAREST_PACKAGE :
				return getNearestPackage();
			case UMLPackage.TEMPLATE_PARAMETER___GET_RELATIONSHIPS :
				return getRelationships();
			case UMLPackage.TEMPLATE_PARAMETER___GET_RELATIONSHIPS__ECLASS :
				return getRelationships((EClass) arguments.get(0));
			case UMLPackage.TEMPLATE_PARAMETER___GET_REQUIRED_STEREOTYPE__STRING :
				return getRequiredStereotype((String) arguments.get(0));
			case UMLPackage.TEMPLATE_PARAMETER___GET_REQUIRED_STEREOTYPES :
				return getRequiredStereotypes();
			case UMLPackage.TEMPLATE_PARAMETER___GET_SOURCE_DIRECTED_RELATIONSHIPS :
				return getSourceDirectedRelationships();
			case UMLPackage.TEMPLATE_PARAMETER___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS :
				return getSourceDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.TEMPLATE_PARAMETER___GET_STEREOTYPE_APPLICATION__STEREOTYPE :
				return getStereotypeApplication((Stereotype) arguments.get(0));
			case UMLPackage.TEMPLATE_PARAMETER___GET_STEREOTYPE_APPLICATIONS :
				return getStereotypeApplications();
			case UMLPackage.TEMPLATE_PARAMETER___GET_TARGET_DIRECTED_RELATIONSHIPS :
				return getTargetDirectedRelationships();
			case UMLPackage.TEMPLATE_PARAMETER___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS :
				return getTargetDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.TEMPLATE_PARAMETER___GET_VALUE__STEREOTYPE_STRING :
				return getValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.TEMPLATE_PARAMETER___HAS_KEYWORD__STRING :
				return hasKeyword((String) arguments.get(0));
			case UMLPackage.TEMPLATE_PARAMETER___HAS_VALUE__STEREOTYPE_STRING :
				return hasValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.TEMPLATE_PARAMETER___IS_STEREOTYPE_APPLICABLE__STEREOTYPE :
				return isStereotypeApplicable((Stereotype) arguments.get(0));
			case UMLPackage.TEMPLATE_PARAMETER___IS_STEREOTYPE_APPLIED__STEREOTYPE :
				return isStereotypeApplied((Stereotype) arguments.get(0));
			case UMLPackage.TEMPLATE_PARAMETER___IS_STEREOTYPE_REQUIRED__STEREOTYPE :
				return isStereotypeRequired((Stereotype) arguments.get(0));
			case UMLPackage.TEMPLATE_PARAMETER___REMOVE_KEYWORD__STRING :
				return removeKeyword((String) arguments.get(0));
			case UMLPackage.TEMPLATE_PARAMETER___SET_VALUE__STEREOTYPE_STRING_OBJECT :
				setValue((Stereotype) arguments.get(0),
					(String) arguments.get(1), arguments.get(2));
				return null;
			case UMLPackage.TEMPLATE_PARAMETER___UNAPPLY_STEREOTYPE__STEREOTYPE :
				return unapplyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.TEMPLATE_PARAMETER___ALL_OWNED_ELEMENTS :
				return allOwnedElements();
			case UMLPackage.TEMPLATE_PARAMETER___MUST_BE_OWNED :
				return mustBeOwned();
			case UMLPackage.TEMPLATE_PARAMETER___VALIDATE_MUST_BE_COMPATIBLE__DIAGNOSTICCHAIN_MAP :
				return validateMustBeCompatible(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		}
		return eDynamicInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element basicGetOwner() {
		TemplateSignature signature = basicGetSignature();
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
	@Override
	public boolean isSetOwner() {
		return super.isSetOwner()
			|| eIsSet(UMLPackage.TEMPLATE_PARAMETER__SIGNATURE);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getOwnedElements() <em>Owned Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedElements()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_ELEMENT_ESUBSETS = new int[]{
		UMLPackage.TEMPLATE_PARAMETER__OWNED_COMMENT,
		UMLPackage.TEMPLATE_PARAMETER__OWNED_DEFAULT,
		UMLPackage.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| eIsSet(UMLPackage.TEMPLATE_PARAMETER__OWNED_DEFAULT)
			|| eIsSet(UMLPackage.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT);
	}

} //TemplateParameterImpl
