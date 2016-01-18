/*
 * Copyright (c) 2005, 2016 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 327039, 451350, 485756
 *
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.InstanceSpecification;
import org.eclipse.uml2.uml.Slot;
import org.eclipse.uml2.uml.StructuralFeature;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.ValueSpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Slot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.SlotImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.SlotImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.SlotImpl#getDefiningFeature <em>Defining Feature</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.SlotImpl#getValues <em>Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.SlotImpl#getOwningInstance <em>Owning Instance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SlotImpl
		extends ElementImpl
		implements Slot {

	/**
	 * The cached value of the '{@link #getDefiningFeature() <em>Defining Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefiningFeature()
	 * @generated
	 * @ordered
	 */
	protected StructuralFeature definingFeature;

	/**
	 * The cached value of the '{@link #getValues() <em>Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValues()
	 * @generated
	 * @ordered
	 */
	protected EList<ValueSpecification> values;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SlotImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.SLOT;
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
						Element.class, this, UMLPackage.SLOT__OWNED_ELEMENT,
						OWNED_ELEMENT_ESUBSETS));
			}
			return ownedElements;
		}
		return new DerivedUnionEObjectEList<Element>(Element.class, this,
			UMLPackage.SLOT__OWNED_ELEMENT, OWNED_ELEMENT_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceSpecification getOwningInstance() {
		if (eContainerFeatureID() != UMLPackage.SLOT__OWNING_INSTANCE)
			return null;
		return (InstanceSpecification) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceSpecification basicGetOwningInstance() {
		if (eContainerFeatureID() != UMLPackage.SLOT__OWNING_INSTANCE)
			return null;
		return (InstanceSpecification) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningInstance(
			InstanceSpecification newOwningInstance, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newOwningInstance,
			UMLPackage.SLOT__OWNING_INSTANCE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningInstance(InstanceSpecification newOwningInstance) {
		if (newOwningInstance != eInternalContainer()
			|| (eContainerFeatureID() != UMLPackage.SLOT__OWNING_INSTANCE
				&& newOwningInstance != null)) {
			if (EcoreUtil.isAncestor(this, newOwningInstance))
				throw new IllegalArgumentException(
					"Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningInstance != null)
				msgs = ((InternalEObject) newOwningInstance).eInverseAdd(this,
					UMLPackage.INSTANCE_SPECIFICATION__SLOT,
					InstanceSpecification.class, msgs);
			msgs = basicSetOwningInstance(newOwningInstance, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.SLOT__OWNING_INSTANCE, newOwningInstance,
				newOwningInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuralFeature getDefiningFeature() {
		if (definingFeature != null && definingFeature.eIsProxy()) {
			InternalEObject oldDefiningFeature = (InternalEObject) definingFeature;
			definingFeature = (StructuralFeature) eResolveProxy(
				oldDefiningFeature);
			if (definingFeature != oldDefiningFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.SLOT__DEFINING_FEATURE, oldDefiningFeature,
						definingFeature));
			}
		}
		return definingFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuralFeature basicGetDefiningFeature() {
		return definingFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefiningFeature(StructuralFeature newDefiningFeature) {
		StructuralFeature oldDefiningFeature = definingFeature;
		definingFeature = newDefiningFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.SLOT__DEFINING_FEATURE, oldDefiningFeature,
				definingFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValueSpecification> getValues() {
		if (values == null) {
			values = new EObjectContainmentEList.Resolving<ValueSpecification>(
				ValueSpecification.class, this, UMLPackage.SLOT__VALUE);
		}
		return values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification createValue(String name, Type type,
			EClass eClass) {
		ValueSpecification newValue = (ValueSpecification) create(eClass);
		getValues().add(newValue);
		if (name != null)
			newValue.setName(name);
		if (type != null)
			newValue.setType(type);
		return newValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getValue(String name, Type type) {
		return getValue(name, type, false, null, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getValue(String name, Type type,
			boolean ignoreCase, EClass eClass, boolean createOnDemand) {
		valueLoop : for (ValueSpecification value : getValues()) {
			if (eClass != null && !eClass.isInstance(value))
				continue valueLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(value.getName())
				: name.equals(value.getName())))
				continue valueLoop;
			if (type != null && !type.equals(value.getType()))
				continue valueLoop;
			return value;
		}
		return createOnDemand && eClass != null
			? createValue(name, type, eClass)
			: null;
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
			case UMLPackage.SLOT__EANNOTATIONS :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getEAnnotations())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.SLOT__OWNING_INSTANCE :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningInstance((InstanceSpecification) otherEnd,
					msgs);
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
			case UMLPackage.SLOT__EANNOTATIONS :
				return ((InternalEList<?>) getEAnnotations())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.SLOT__OWNED_COMMENT :
				return ((InternalEList<?>) getOwnedComments())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.SLOT__VALUE :
				return ((InternalEList<?>) getValues()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.SLOT__OWNING_INSTANCE :
				return basicSetOwningInstance(null, msgs);
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
			case UMLPackage.SLOT__OWNING_INSTANCE :
				return eInternalContainer().eInverseRemove(this,
					UMLPackage.INSTANCE_SPECIFICATION__SLOT,
					InstanceSpecification.class, msgs);
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
			case UMLPackage.SLOT__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.SLOT__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.SLOT__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.SLOT__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.SLOT__DEFINING_FEATURE :
				if (resolve)
					return getDefiningFeature();
				return basicGetDefiningFeature();
			case UMLPackage.SLOT__VALUE :
				return getValues();
			case UMLPackage.SLOT__OWNING_INSTANCE :
				if (resolve)
					return getOwningInstance();
				return basicGetOwningInstance();
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
			case UMLPackage.SLOT__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations()
					.addAll((Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.SLOT__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments()
					.addAll((Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.SLOT__DEFINING_FEATURE :
				setDefiningFeature((StructuralFeature) newValue);
				return;
			case UMLPackage.SLOT__VALUE :
				getValues().clear();
				getValues().addAll(
					(Collection<? extends ValueSpecification>) newValue);
				return;
			case UMLPackage.SLOT__OWNING_INSTANCE :
				setOwningInstance((InstanceSpecification) newValue);
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
			case UMLPackage.SLOT__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.SLOT__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.SLOT__DEFINING_FEATURE :
				setDefiningFeature((StructuralFeature) null);
				return;
			case UMLPackage.SLOT__VALUE :
				getValues().clear();
				return;
			case UMLPackage.SLOT__OWNING_INSTANCE :
				setOwningInstance((InstanceSpecification) null);
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
			case UMLPackage.SLOT__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.SLOT__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.SLOT__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.SLOT__OWNER :
				return isSetOwner();
			case UMLPackage.SLOT__DEFINING_FEATURE :
				return definingFeature != null;
			case UMLPackage.SLOT__VALUE :
				return values != null && !values.isEmpty();
			case UMLPackage.SLOT__OWNING_INSTANCE :
				return basicGetOwningInstance() != null;
		}
		return eDynamicIsSet(featureID);
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
		UMLPackage.SLOT__OWNED_COMMENT, UMLPackage.SLOT__VALUE};

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
	public Element basicGetOwner() {
		InstanceSpecification owningInstance = basicGetOwningInstance();
		if (owningInstance != null) {
			return owningInstance;
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
		return super.isSetOwner() || eIsSet(UMLPackage.SLOT__OWNING_INSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements() || eIsSet(UMLPackage.SLOT__VALUE);
	}

} //SlotImpl
