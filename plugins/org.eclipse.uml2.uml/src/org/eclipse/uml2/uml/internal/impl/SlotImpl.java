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
 * $Id: SlotImpl.java,v 1.11 2006/02/22 23:07:14 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.Iterator;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

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
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.SlotImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.SlotImpl#getDefiningFeature <em>Defining Feature</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.SlotImpl#getValues <em>Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.SlotImpl#getOwningInstance <em>Owning Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SlotImpl
		extends ElementImpl
		implements Slot {

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
	protected EClass eStaticClass() {
		return UMLPackage.Literals.SLOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedElements() {
		EList ownedElement = (EList) eVirtualGet(UMLPackage.SLOT__OWNED_ELEMENT);
		if (ownedElement == null) {
			eVirtualSet(
				UMLPackage.SLOT__OWNED_ELEMENT,
				ownedElement = new DerivedUnionEObjectEList(Element.class,
					this, UMLPackage.SLOT__OWNED_ELEMENT, new int[]{
						UMLPackage.SLOT__OWNED_COMMENT, UMLPackage.SLOT__VALUE}));
		}
		return ownedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceSpecification getOwningInstance() {
		if (eContainerFeatureID != UMLPackage.SLOT__OWNING_INSTANCE)
			return null;
		return (InstanceSpecification) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningInstance(InstanceSpecification newOwningInstance) {
		if (newOwningInstance != eInternalContainer()
			|| (eContainerFeatureID != UMLPackage.SLOT__OWNING_INSTANCE && newOwningInstance != null)) {
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
			msgs = eBasicSetContainer((InternalEObject) newOwningInstance,
				UMLPackage.SLOT__OWNING_INSTANCE, msgs);
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
		StructuralFeature definingFeature = (StructuralFeature) eVirtualGet(UMLPackage.SLOT__DEFINING_FEATURE);
		if (definingFeature != null && definingFeature.eIsProxy()) {
			InternalEObject oldDefiningFeature = (InternalEObject) definingFeature;
			definingFeature = (StructuralFeature) eResolveProxy(oldDefiningFeature);
			if (definingFeature != oldDefiningFeature) {
				eVirtualSet(UMLPackage.SLOT__DEFINING_FEATURE, definingFeature);
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
		return (StructuralFeature) eVirtualGet(UMLPackage.SLOT__DEFINING_FEATURE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefiningFeature(StructuralFeature newDefiningFeature) {
		StructuralFeature definingFeature = newDefiningFeature;
		Object oldDefiningFeature = eVirtualSet(
			UMLPackage.SLOT__DEFINING_FEATURE, definingFeature);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.SLOT__DEFINING_FEATURE,
				oldDefiningFeature == EVIRTUAL_NO_VALUE
					? null
					: oldDefiningFeature, definingFeature));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getValues() {
		EList value = (EList) eVirtualGet(UMLPackage.SLOT__VALUE);
		if (value == null) {
			eVirtualSet(UMLPackage.SLOT__VALUE,
				value = new EObjectContainmentEList.Resolving(
					ValueSpecification.class, this, UMLPackage.SLOT__VALUE));
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification createValue(String name, Type type, EClass eClass) {
		ValueSpecification newValue = (ValueSpecification) EcoreUtil
			.create(eClass);
		if (name != null)
			newValue.setName(name);
		if (type != null)
			newValue.setType(type);
		getValues().add(newValue);
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
		valueLoop : for (Iterator i = getValues().iterator(); i.hasNext();) {
			ValueSpecification value = (ValueSpecification) i.next();
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
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.SLOT__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.SLOT__OWNING_INSTANCE :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd,
					UMLPackage.SLOT__OWNING_INSTANCE, msgs);
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
			case UMLPackage.SLOT__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.SLOT__OWNED_COMMENT :
				return ((InternalEList) getOwnedComments()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.SLOT__VALUE :
				return ((InternalEList) getValues())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.SLOT__OWNING_INSTANCE :
				return eBasicSetContainer(null,
					UMLPackage.SLOT__OWNING_INSTANCE, msgs);
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.SLOT__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.SLOT__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.SLOT__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.SLOT__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.SLOT__DEFINING_FEATURE :
				if (resolve)
					return getDefiningFeature();
				return basicGetDefiningFeature();
			case UMLPackage.SLOT__VALUE :
				return getValues();
			case UMLPackage.SLOT__OWNING_INSTANCE :
				return getOwningInstance();
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
			case UMLPackage.SLOT__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.SLOT__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.SLOT__DEFINING_FEATURE :
				setDefiningFeature((StructuralFeature) newValue);
				return;
			case UMLPackage.SLOT__VALUE :
				getValues().clear();
				getValues().addAll((Collection) newValue);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UMLPackage.SLOT__EANNOTATIONS :
				EList eAnnotations = (EList) eVirtualGet(UMLPackage.SLOT__EANNOTATIONS);
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.SLOT__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.SLOT__OWNER :
				return isSetOwner();
			case UMLPackage.SLOT__OWNED_COMMENT :
				EList ownedComment = (EList) eVirtualGet(UMLPackage.SLOT__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.SLOT__DEFINING_FEATURE :
				return eVirtualGet(UMLPackage.SLOT__DEFINING_FEATURE) != null;
			case UMLPackage.SLOT__VALUE :
				EList value = (EList) eVirtualGet(UMLPackage.SLOT__VALUE);
				return value != null && !value.isEmpty();
			case UMLPackage.SLOT__OWNING_INSTANCE :
				return getOwningInstance() != null;
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetOwner() {
		InstanceSpecification owningInstance = getOwningInstance();
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
	public boolean isSetOwner() {
		return super.isSetOwner() || eIsSet(UMLPackage.SLOT__OWNING_INSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements() || eIsSet(UMLPackage.SLOT__VALUE);
	}

} //SlotImpl
