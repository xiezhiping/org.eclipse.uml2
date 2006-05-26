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
 * $Id: TemplateableElementImpl.java,v 1.24 2006/05/26 18:16:42 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.util.Collection;
import java.util.Set;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.Element;
import org.eclipse.uml2.TemplateBinding;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.TemplateableElement;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;

import org.eclipse.uml2.common.util.CacheAdapter;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.internal.operation.TemplateableElementOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Templateable Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.TemplateableElementImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.TemplateableElementImpl#getTemplateBindings <em>Template Binding</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.TemplateableElementImpl#getOwnedTemplateSignature <em>Owned Template Signature</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TemplateableElementImpl extends ElementImpl implements TemplateableElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getTemplateBindings() <em>Template Binding</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateBindings()
	 * @generated
	 * @ordered
	 */
	protected EList templateBindings = null;

	/**
	 * The cached value of the '{@link #getOwnedTemplateSignature() <em>Owned Template Signature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedTemplateSignature()
	 * @generated
	 * @ordered
	 */
	protected TemplateSignature ownedTemplateSignature = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemplateableElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UML2Package.Literals.TEMPLATEABLE_ELEMENT;
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
				cache.put(eResource, this, UML2Package.Literals.ELEMENT__OWNED_ELEMENT, ownedElements = new DerivedUnionEObjectEList(Element.class, this, UML2Package.TEMPLATEABLE_ELEMENT__OWNED_ELEMENT, OWNED_ELEMENT_ESUBSETS));
			}
			return ownedElements;
		}
		return new DerivedUnionEObjectEList(Element.class, this, UML2Package.TEMPLATEABLE_ELEMENT__OWNED_ELEMENT, OWNED_ELEMENT_ESUBSETS);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| eIsSet(UML2Package.TEMPLATEABLE_ELEMENT__TEMPLATE_BINDING)
			|| eIsSet(UML2Package.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getOwnedElements() <em>Owned Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedElements()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_ELEMENT_ESUBSETS = new int[] {UML2Package.TEMPLATEABLE_ELEMENT__OWNED_COMMENT, UML2Package.TEMPLATEABLE_ELEMENT__TEMPLATE_BINDING, UML2Package.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getTemplateBindings() {
		if (templateBindings == null) {
			templateBindings = new EObjectContainmentWithInverseEList(TemplateBinding.class, this, UML2Package.TEMPLATEABLE_ELEMENT__TEMPLATE_BINDING, UML2Package.TEMPLATE_BINDING__BOUND_ELEMENT);
		}
		return templateBindings;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @deprecated Use #createTemplateBinding() instead.
	 */
	public TemplateBinding createTemplateBinding(EClass eClass) {
		TemplateBinding newTemplateBinding = (TemplateBinding) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.TEMPLATEABLE_ELEMENT__TEMPLATE_BINDING, null, newTemplateBinding));
		}
		getTemplateBindings().add(newTemplateBinding);
		return newTemplateBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public TemplateBinding createTemplateBinding() {
		TemplateBinding newTemplateBinding = UML2Factory.eINSTANCE.createTemplateBinding();
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.TEMPLATEABLE_ELEMENT__TEMPLATE_BINDING, null, newTemplateBinding));
		}
		getTemplateBindings().add(newTemplateBinding);
		return newTemplateBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateSignature getOwnedTemplateSignature() {
		return ownedTemplateSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedTemplateSignature(TemplateSignature newOwnedTemplateSignature, NotificationChain msgs) {
		TemplateSignature oldOwnedTemplateSignature = ownedTemplateSignature;
		ownedTemplateSignature = newOwnedTemplateSignature;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UML2Package.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE, oldOwnedTemplateSignature, newOwnedTemplateSignature);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedTemplateSignature(TemplateSignature newOwnedTemplateSignature) {
		if (newOwnedTemplateSignature != ownedTemplateSignature) {
			NotificationChain msgs = null;
			if (ownedTemplateSignature != null)
				msgs = ((InternalEObject)ownedTemplateSignature).eInverseRemove(this, UML2Package.TEMPLATE_SIGNATURE__TEMPLATE, TemplateSignature.class, msgs);
			if (newOwnedTemplateSignature != null)
				msgs = ((InternalEObject)newOwnedTemplateSignature).eInverseAdd(this, UML2Package.TEMPLATE_SIGNATURE__TEMPLATE, TemplateSignature.class, msgs);
			msgs = basicSetOwnedTemplateSignature(newOwnedTemplateSignature, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE, newOwnedTemplateSignature, newOwnedTemplateSignature));

	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public TemplateSignature createOwnedTemplateSignature(EClass eClass) {
		TemplateSignature newOwnedTemplateSignature = (TemplateSignature) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE, null, newOwnedTemplateSignature));
		}
		setOwnedTemplateSignature(newOwnedTemplateSignature);
		return newOwnedTemplateSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public TemplateSignature createOwnedTemplateSignature() {
		TemplateSignature newOwnedTemplateSignature = UML2Factory.eINSTANCE.createTemplateSignature();
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE, null, newOwnedTemplateSignature));
		}
		setOwnedTemplateSignature(newOwnedTemplateSignature);
		return newOwnedTemplateSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Set parameterableElements() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Set result = (Set) cache.get(eResource(), this, UML2Package.Literals.TEMPLATEABLE_ELEMENT.getEOperations().get(0));
			if (result == null) {
				cache.put(eResource(), this, UML2Package.Literals.TEMPLATEABLE_ELEMENT.getEOperations().get(0), result = TemplateableElementOperations.parameterableElements(this));
			}
			return result;
		}
		return TemplateableElementOperations.parameterableElements(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UML2Package.TEMPLATEABLE_ELEMENT__EANNOTATIONS:
				return ((InternalEList)getEAnnotations()).basicAdd(otherEnd, msgs);
			case UML2Package.TEMPLATEABLE_ELEMENT__TEMPLATE_BINDING:
				return ((InternalEList)getTemplateBindings()).basicAdd(otherEnd, msgs);
			case UML2Package.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE:
				if (ownedTemplateSignature != null)
					msgs = ((InternalEObject)ownedTemplateSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE, null, msgs);
				return basicSetOwnedTemplateSignature((TemplateSignature)otherEnd, msgs);
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
			case UML2Package.TEMPLATEABLE_ELEMENT__EANNOTATIONS:
				return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
			case UML2Package.TEMPLATEABLE_ELEMENT__OWNED_COMMENT:
				return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
			case UML2Package.TEMPLATEABLE_ELEMENT__TEMPLATE_BINDING:
				return ((InternalEList)getTemplateBindings()).basicRemove(otherEnd, msgs);
			case UML2Package.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE:
				return basicSetOwnedTemplateSignature(null, msgs);
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
			case UML2Package.TEMPLATEABLE_ELEMENT__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.TEMPLATEABLE_ELEMENT__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.TEMPLATEABLE_ELEMENT__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.TEMPLATEABLE_ELEMENT__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.TEMPLATEABLE_ELEMENT__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
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
			case UML2Package.TEMPLATEABLE_ELEMENT__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.TEMPLATEABLE_ELEMENT__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.TEMPLATEABLE_ELEMENT__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection)newValue);
				return;
			case UML2Package.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
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
			case UML2Package.TEMPLATEABLE_ELEMENT__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.TEMPLATEABLE_ELEMENT__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.TEMPLATEABLE_ELEMENT__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				return;
			case UML2Package.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
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
			case UML2Package.TEMPLATEABLE_ELEMENT__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.TEMPLATEABLE_ELEMENT__OWNED_ELEMENT:
				return isSetOwnedElements();
			case UML2Package.TEMPLATEABLE_ELEMENT__OWNER:
				return isSetOwner();
			case UML2Package.TEMPLATEABLE_ELEMENT__OWNED_COMMENT:
				return ownedComments != null && !ownedComments.isEmpty();
			case UML2Package.TEMPLATEABLE_ELEMENT__TEMPLATE_BINDING:
				return templateBindings != null && !templateBindings.isEmpty();
			case UML2Package.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
		}
		return eDynamicIsSet(featureID);
	}


} //TemplateableElementImpl
