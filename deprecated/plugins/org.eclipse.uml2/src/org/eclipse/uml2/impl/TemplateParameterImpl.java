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
 * $Id: TemplateParameterImpl.java,v 1.27 2006/05/26 18:16:44 khussey Exp $
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

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.Element;
import org.eclipse.uml2.ParameterableElement;
import org.eclipse.uml2.TemplateParameter;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.UML2Package;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Template Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.TemplateParameterImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.TemplateParameterImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.TemplateParameterImpl#getParameteredElement <em>Parametered Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.TemplateParameterImpl#getDefault <em>Default</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.TemplateParameterImpl#getSignature <em>Signature</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.TemplateParameterImpl#getOwnedParameteredElement <em>Owned Parametered Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.TemplateParameterImpl#getOwnedDefault <em>Owned Default</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TemplateParameterImpl extends ElementImpl implements TemplateParameter {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getParameteredElement() <em>Parametered Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameteredElement()
	 * @generated
	 * @ordered
	 */
	protected ParameterableElement parameteredElement = null;

	/**
	 * The cached value of the '{@link #getDefault() <em>Default</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault()
	 * @generated
	 * @ordered
	 */
	protected ParameterableElement default_ = null;

	/**
	 * The cached value of the '{@link #getOwnedParameteredElement() <em>Owned Parametered Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedParameteredElement()
	 * @generated
	 * @ordered
	 */
	protected ParameterableElement ownedParameteredElement = null;

	/**
	 * The cached value of the '{@link #getOwnedDefault() <em>Owned Default</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedDefault()
	 * @generated
	 * @ordered
	 */
	protected ParameterableElement ownedDefault = null;

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
		return UML2Package.Literals.TEMPLATE_PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getOwner() {
		Element owner = basicGetOwner();
		return owner != null && owner.eIsProxy() ? (Element)eResolveProxy((InternalEObject)owner) : owner;
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
				cache.put(eResource, this, UML2Package.Literals.ELEMENT__OWNED_ELEMENT, ownedElements = new DerivedUnionEObjectEList(Element.class, this, UML2Package.TEMPLATE_PARAMETER__OWNED_ELEMENT, OWNED_ELEMENT_ESUBSETS));
			}
			return ownedElements;
		}
		return new DerivedUnionEObjectEList(Element.class, this, UML2Package.TEMPLATE_PARAMETER__OWNED_ELEMENT, OWNED_ELEMENT_ESUBSETS);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| eIsSet(UML2Package.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT)
			|| eIsSet(UML2Package.TEMPLATE_PARAMETER__OWNED_DEFAULT);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getOwnedElements() <em>Owned Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedElements()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_ELEMENT_ESUBSETS = new int[] {UML2Package.TEMPLATE_PARAMETER__OWNED_COMMENT, UML2Package.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT, UML2Package.TEMPLATE_PARAMETER__OWNED_DEFAULT};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateSignature getSignature() {
		if (eContainerFeatureID != UML2Package.TEMPLATE_PARAMETER__SIGNATURE) return null;
		return (TemplateSignature)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSignature(TemplateSignature newSignature, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSignature, UML2Package.TEMPLATE_PARAMETER__SIGNATURE, msgs);

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignature(TemplateSignature newSignature) {
		if (newSignature != eInternalContainer() || (eContainerFeatureID != UML2Package.TEMPLATE_PARAMETER__SIGNATURE && newSignature != null)) {
			if (EcoreUtil.isAncestor(this, newSignature))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSignature != null)
				msgs = ((InternalEObject)newSignature).eInverseAdd(this, UML2Package.TEMPLATE_SIGNATURE__OWNED_PARAMETER, TemplateSignature.class, msgs);
			msgs = basicSetSignature(newSignature, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.TEMPLATE_PARAMETER__SIGNATURE, newSignature, newSignature));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterableElement getParameteredElement() {
		if (parameteredElement != null && parameteredElement.eIsProxy()) {
			InternalEObject oldParameteredElement = (InternalEObject)parameteredElement;
			parameteredElement = (ParameterableElement)eResolveProxy(oldParameteredElement);
			if (parameteredElement != oldParameteredElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2Package.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT, oldParameteredElement, parameteredElement));
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
	public NotificationChain basicSetParameteredElement(ParameterableElement newParameteredElement, NotificationChain msgs) {
		ParameterableElement oldParameteredElement = parameteredElement;
		parameteredElement = newParameteredElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UML2Package.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT, oldParameteredElement, newParameteredElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}

		Resource.Internal eInternalResource = eInternalResource();
		if (eInternalResource == null || !eInternalResource.isLoading()) {
			if (ownedParameteredElement != null && ownedParameteredElement != newParameteredElement) {
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
				msgs = ((InternalEObject)parameteredElement).eInverseRemove(this, UML2Package.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER, ParameterableElement.class, msgs);
			if (newParameteredElement != null)
				msgs = ((InternalEObject)newParameteredElement).eInverseAdd(this, UML2Package.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER, ParameterableElement.class, msgs);
			msgs = basicSetParameteredElement(newParameteredElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT, newParameteredElement, newParameteredElement));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterableElement getOwnedParameteredElement() {
		return ownedParameteredElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedParameteredElement(ParameterableElement newOwnedParameteredElement, NotificationChain msgs) {
		ParameterableElement oldOwnedParameteredElement = ownedParameteredElement;
		ownedParameteredElement = newOwnedParameteredElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UML2Package.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT, oldOwnedParameteredElement, newOwnedParameteredElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
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
	public void setOwnedParameteredElement(ParameterableElement newOwnedParameteredElement) {
		if (newOwnedParameteredElement != ownedParameteredElement) {
			NotificationChain msgs = null;
			if (ownedParameteredElement != null)
				msgs = ((InternalEObject)ownedParameteredElement).eInverseRemove(this, UML2Package.PARAMETERABLE_ELEMENT__OWNING_PARAMETER, ParameterableElement.class, msgs);
			if (newOwnedParameteredElement != null)
				msgs = ((InternalEObject)newOwnedParameteredElement).eInverseAdd(this, UML2Package.PARAMETERABLE_ELEMENT__OWNING_PARAMETER, ParameterableElement.class, msgs);
			msgs = basicSetOwnedParameteredElement(newOwnedParameteredElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT, newOwnedParameteredElement, newOwnedParameteredElement));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ParameterableElement createOwnedParameteredElement(EClass eClass) {
		ParameterableElement newOwnedParameteredElement = (ParameterableElement) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT, null, newOwnedParameteredElement));
		}
		setOwnedParameteredElement(newOwnedParameteredElement);
		return newOwnedParameteredElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterableElement getDefault() {
		if (default_ != null && default_.eIsProxy()) {
			InternalEObject oldDefault = (InternalEObject)default_;
			default_ = (ParameterableElement)eResolveProxy(oldDefault);
			if (default_ != oldDefault) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2Package.TEMPLATE_PARAMETER__DEFAULT, oldDefault, default_));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.TEMPLATE_PARAMETER__DEFAULT, oldDefault, default_));


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
	public ParameterableElement getOwnedDefault() {
		return ownedDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedDefault(ParameterableElement newOwnedDefault, NotificationChain msgs) {
		ParameterableElement oldOwnedDefault = ownedDefault;
		ownedDefault = newOwnedDefault;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UML2Package.TEMPLATE_PARAMETER__OWNED_DEFAULT, oldOwnedDefault, newOwnedDefault);
			if (msgs == null) msgs = notification; else msgs.add(notification);
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
				msgs = ((InternalEObject)ownedDefault).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.TEMPLATE_PARAMETER__OWNED_DEFAULT, null, msgs);
			if (newOwnedDefault != null)
				msgs = ((InternalEObject)newOwnedDefault).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UML2Package.TEMPLATE_PARAMETER__OWNED_DEFAULT, null, msgs);
			msgs = basicSetOwnedDefault(newOwnedDefault, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.TEMPLATE_PARAMETER__OWNED_DEFAULT, newOwnedDefault, newOwnedDefault));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ParameterableElement createOwnedDefault(EClass eClass) {
		ParameterableElement newOwnedDefault = (ParameterableElement) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.TEMPLATE_PARAMETER__OWNED_DEFAULT, null, newOwnedDefault));
		}
		setOwnedDefault(newOwnedDefault);
		return newOwnedDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UML2Package.TEMPLATE_PARAMETER__EANNOTATIONS:
				return ((InternalEList)getEAnnotations()).basicAdd(otherEnd, msgs);
			case UML2Package.TEMPLATE_PARAMETER__SIGNATURE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSignature((TemplateSignature)otherEnd, msgs);
			case UML2Package.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT:
				if (parameteredElement != null)
					msgs = ((InternalEObject)parameteredElement).eInverseRemove(this, UML2Package.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER, ParameterableElement.class, msgs);
				return basicSetParameteredElement((ParameterableElement)otherEnd, msgs);
			case UML2Package.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT:
				if (ownedParameteredElement != null)
					msgs = ((InternalEObject)ownedParameteredElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT, null, msgs);
				return basicSetOwnedParameteredElement((ParameterableElement)otherEnd, msgs);
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
			case UML2Package.TEMPLATE_PARAMETER__EANNOTATIONS:
				return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
			case UML2Package.TEMPLATE_PARAMETER__OWNED_COMMENT:
				return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
			case UML2Package.TEMPLATE_PARAMETER__SIGNATURE:
				return basicSetSignature(null, msgs);
			case UML2Package.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT:
				return basicSetParameteredElement(null, msgs);
			case UML2Package.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT:
				return basicSetOwnedParameteredElement(null, msgs);
			case UML2Package.TEMPLATE_PARAMETER__OWNED_DEFAULT:
				return basicSetOwnedDefault(null, msgs);
		}
		return eDynamicInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID) {
			case UML2Package.TEMPLATE_PARAMETER__SIGNATURE:
				return eInternalContainer().eInverseRemove(this, UML2Package.TEMPLATE_SIGNATURE__OWNED_PARAMETER, TemplateSignature.class, msgs);
		}
		return eDynamicBasicRemoveFromContainer(msgs);
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
			|| eIsSet(UML2Package.TEMPLATE_PARAMETER__SIGNATURE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UML2Package.TEMPLATE_PARAMETER__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.TEMPLATE_PARAMETER__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.TEMPLATE_PARAMETER__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.TEMPLATE_PARAMETER__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.TEMPLATE_PARAMETER__SIGNATURE:
				return getSignature();
			case UML2Package.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT:
				if (resolve) return getParameteredElement();
				return basicGetParameteredElement();
			case UML2Package.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT:
				return getOwnedParameteredElement();
			case UML2Package.TEMPLATE_PARAMETER__DEFAULT:
				if (resolve) return getDefault();
				return basicGetDefault();
			case UML2Package.TEMPLATE_PARAMETER__OWNED_DEFAULT:
				return getOwnedDefault();
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
			case UML2Package.TEMPLATE_PARAMETER__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.TEMPLATE_PARAMETER__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.TEMPLATE_PARAMETER__SIGNATURE:
				setSignature((TemplateSignature)newValue);
				return;
			case UML2Package.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT:
				setParameteredElement((ParameterableElement)newValue);
				return;
			case UML2Package.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT:
				setOwnedParameteredElement((ParameterableElement)newValue);
				return;
			case UML2Package.TEMPLATE_PARAMETER__DEFAULT:
				setDefault((ParameterableElement)newValue);
				return;
			case UML2Package.TEMPLATE_PARAMETER__OWNED_DEFAULT:
				setOwnedDefault((ParameterableElement)newValue);
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
			case UML2Package.TEMPLATE_PARAMETER__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.TEMPLATE_PARAMETER__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.TEMPLATE_PARAMETER__SIGNATURE:
				setSignature((TemplateSignature)null);
				return;
			case UML2Package.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT:
				setParameteredElement((ParameterableElement)null);
				return;
			case UML2Package.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT:
				setOwnedParameteredElement((ParameterableElement)null);
				return;
			case UML2Package.TEMPLATE_PARAMETER__DEFAULT:
				setDefault((ParameterableElement)null);
				return;
			case UML2Package.TEMPLATE_PARAMETER__OWNED_DEFAULT:
				setOwnedDefault((ParameterableElement)null);
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
			case UML2Package.TEMPLATE_PARAMETER__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.TEMPLATE_PARAMETER__OWNED_ELEMENT:
				return isSetOwnedElements();
			case UML2Package.TEMPLATE_PARAMETER__OWNER:
				return isSetOwner();
			case UML2Package.TEMPLATE_PARAMETER__OWNED_COMMENT:
				return ownedComments != null && !ownedComments.isEmpty();
			case UML2Package.TEMPLATE_PARAMETER__SIGNATURE:
				return getSignature() != null;
			case UML2Package.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT:
				return parameteredElement != null;
			case UML2Package.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT:
				return ownedParameteredElement != null;
			case UML2Package.TEMPLATE_PARAMETER__DEFAULT:
				return default_ != null;
			case UML2Package.TEMPLATE_PARAMETER__OWNED_DEFAULT:
				return ownedDefault != null;
		}
		return eDynamicIsSet(featureID);
	}


} //TemplateParameterImpl
