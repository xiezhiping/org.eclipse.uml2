/*
 * Copyright (c) 2003, 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *
 * $Id: TemplateParameterImpl.java,v 1.6 2004/06/02 05:02:25 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.uml2.Element;
import org.eclipse.uml2.ParameterableElement;
import org.eclipse.uml2.TemplateParameter;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.UML2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Template Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.TemplateParameterImpl#getSignature <em>Signature</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.TemplateParameterImpl#getParameteredElement <em>Parametered Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.TemplateParameterImpl#getOwnedParameteredElement <em>Owned Parametered Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.TemplateParameterImpl#getDefault <em>Default</em>}</li>
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
	public static final String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

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
	 * The cached value of the '{@link #getOwnedParameteredElement() <em>Owned Parametered Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedParameteredElement()
	 * @generated
	 * @ordered
	 */
	protected ParameterableElement ownedParameteredElement = null;

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
		return UML2Package.eINSTANCE.getTemplateParameter();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateSignature getSignature() {
		if (eContainerFeatureID != UML2Package.TEMPLATE_PARAMETER__SIGNATURE) {
			return null;
		}
		return (TemplateSignature) eContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignature(TemplateSignature newSignature) {
		if (eContainer != newSignature || (eContainerFeatureID != UML2Package.TEMPLATE_PARAMETER__SIGNATURE && null != newSignature)) {
			if (EcoreUtil.isAncestor(this, newSignature)) {
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			}
			NotificationChain msgs = null;
			if (null != eContainer) {
				msgs = eBasicRemoveFromContainer(msgs);
			}
			if (null != newSignature) {
				msgs = ((InternalEObject) newSignature).eInverseAdd(this, UML2Package.TEMPLATE_SIGNATURE__OWNED_PARAMETER, TemplateSignature.class, msgs);
			}
			msgs = eBasicSetContainer((InternalEObject) newSignature, UML2Package.TEMPLATE_PARAMETER__SIGNATURE, msgs);
			if (null != msgs) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.TEMPLATE_PARAMETER__SIGNATURE, newSignature, newSignature));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterableElement getParameteredElement() {
		ParameterableElement parameteredElement = basicGetParameteredElement();
		return parameteredElement == null ? null : (ParameterableElement)eResolveProxy((InternalEObject)parameteredElement);
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
		if (null != getOwnedParameteredElement() && newParameteredElement != getOwnedParameteredElement()) {
			setOwnedParameteredElement(null);
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
			if (null != parameteredElement) {
				msgs = ((InternalEObject) parameteredElement).eInverseRemove(this, UML2Package.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER, ParameterableElement.class, msgs);
			}
			if (null != newParameteredElement) {
				msgs = ((InternalEObject) newParameteredElement).eInverseAdd(this, UML2Package.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER, ParameterableElement.class, msgs);
			}
			msgs = basicSetParameteredElement(newParameteredElement, msgs);
			if (null != msgs) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT, newParameteredElement, newParameteredElement));
		}

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
		if (null != newOwnedParameteredElement || oldOwnedParameteredElement == basicGetParameteredElement()) {
			setParameteredElement(newOwnedParameteredElement);
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
			if (null != ownedParameteredElement) {
				msgs = ((InternalEObject) ownedParameteredElement).eInverseRemove(this, UML2Package.PARAMETERABLE_ELEMENT__OWNING_PARAMETER, ParameterableElement.class, msgs);
			}
			if (null != newOwnedParameteredElement) {
				msgs = ((InternalEObject) newOwnedParameteredElement).eInverseAdd(this, UML2Package.PARAMETERABLE_ELEMENT__OWNING_PARAMETER, ParameterableElement.class, msgs);
			}
			msgs = basicSetOwnedParameteredElement(newOwnedParameteredElement, msgs);
			if (null != msgs) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT, newOwnedParameteredElement, newOwnedParameteredElement));
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
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
		ParameterableElement default_ = basicGetDefault();
		return default_ == null ? null : (ParameterableElement)eResolveProxy((InternalEObject)default_);
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
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.TEMPLATE_PARAMETER__DEFAULT, oldDefault, default_));
		}
		if (null != getOwnedDefault() && newDefault != getOwnedDefault()) {
			setOwnedDefault(null);
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
		if (null != newOwnedDefault || oldOwnedDefault == basicGetDefault()) {
			setDefault(newOwnedDefault);
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
			if (null != ownedDefault) {
				msgs = ((InternalEObject) ownedDefault).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.TEMPLATE_PARAMETER__OWNED_DEFAULT, null, msgs);
			}
			if (null != newOwnedDefault) {
				msgs = ((InternalEObject) newOwnedDefault).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UML2Package.TEMPLATE_PARAMETER__OWNED_DEFAULT, null, msgs);
			}
			msgs = basicSetOwnedDefault(newOwnedDefault, msgs);
			if (null != msgs) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.TEMPLATE_PARAMETER__OWNED_DEFAULT, newOwnedDefault, newOwnedDefault));
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
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
	public Element basicGetOwner() {
		if (null != getSignature()) {
			return (Element) getSignature();
		}
		return super.basicGetOwner();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedElements() {
		EList ownedElement = (EList) getCacheAdapter().get(this, UML2Package.eINSTANCE.getElement_OwnedElement());

		if (null == ownedElement) {
			Set union = new LinkedHashSet();
			union.addAll(super.getOwnedElements());
			if (null != getOwnedParameteredElement()) {
				union.add(getOwnedParameteredElement());
			}
			if (null != getOwnedDefault()) {
				union.add(getOwnedDefault());
			}

			ownedElement = new EcoreEList.UnmodifiableEList(this, UML2Package.eINSTANCE.getElement_OwnedElement(), union.size(), union.toArray());
			getCacheAdapter().put(this, UML2Package.eINSTANCE.getElement_OwnedElement(), ownedElement);
		}

		return ownedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UML2Package.TEMPLATE_PARAMETER__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicAdd(otherEnd, msgs);
				case UML2Package.TEMPLATE_PARAMETER__SIGNATURE:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, UML2Package.TEMPLATE_PARAMETER__SIGNATURE, msgs);
				case UML2Package.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT:
					if (parameteredElement != null)
						msgs = ((InternalEObject)parameteredElement).eInverseRemove(this, UML2Package.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER, ParameterableElement.class, msgs);
					return basicSetParameteredElement((ParameterableElement)otherEnd, msgs);
				case UML2Package.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT:
					if (ownedParameteredElement != null)
						msgs = ((InternalEObject)ownedParameteredElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT, null, msgs);
					return basicSetOwnedParameteredElement((ParameterableElement)otherEnd, msgs);
				default:
					return eDynamicInverseAdd(otherEnd, featureID, baseClass, msgs);
			}
		}
		if (eContainer != null)
			msgs = eBasicRemoveFromContainer(msgs);
		return eBasicSetContainer(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UML2Package.TEMPLATE_PARAMETER__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
				case UML2Package.TEMPLATE_PARAMETER__OWNED_COMMENT:
					return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
				case UML2Package.TEMPLATE_PARAMETER__SIGNATURE:
					return eBasicSetContainer(null, UML2Package.TEMPLATE_PARAMETER__SIGNATURE, msgs);
				case UML2Package.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT:
					return basicSetParameteredElement(null, msgs);
				case UML2Package.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT:
					return basicSetOwnedParameteredElement(null, msgs);
				case UML2Package.TEMPLATE_PARAMETER__OWNED_DEFAULT:
					return basicSetOwnedDefault(null, msgs);
				default:
					return eDynamicInverseRemove(otherEnd, featureID, baseClass, msgs);
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
				case UML2Package.TEMPLATE_PARAMETER__SIGNATURE:
					return eContainer.eInverseRemove(this, UML2Package.TEMPLATE_SIGNATURE__OWNED_PARAMETER, TemplateSignature.class, msgs);
				default:
					return eDynamicBasicRemoveFromContainer(msgs);
			}
		}
		return eContainer.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - eContainerFeatureID, null, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
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
		return eDynamicGet(eFeature, resolve);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(EStructuralFeature eFeature, Object newValue) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
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
		eDynamicSet(eFeature, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UML2Package.TEMPLATE_PARAMETER__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.TEMPLATE_PARAMETER__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.TEMPLATE_PARAMETER__SIGNATURE:
				setSignature(null);
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
		eDynamicUnset(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UML2Package.TEMPLATE_PARAMETER__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.TEMPLATE_PARAMETER__OWNED_ELEMENT:
				return !getOwnedElements().isEmpty();
			case UML2Package.TEMPLATE_PARAMETER__OWNER:
				return basicGetOwner() != null;
			case UML2Package.TEMPLATE_PARAMETER__OWNED_COMMENT:
				return ownedComment != null && !ownedComment.isEmpty();
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
		return eDynamicIsSet(eFeature);
	}

} //TemplateParameterImpl
