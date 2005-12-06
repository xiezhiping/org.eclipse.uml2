/*
 * Copyright (c) 2003, 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: SlotImpl.java,v 1.19 2005/12/06 23:18:02 khussey Exp $
 */
package org.eclipse.uml2.impl;

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

import org.eclipse.uml2.Element;
import org.eclipse.uml2.InstanceSpecification;
import org.eclipse.uml2.Slot;
import org.eclipse.uml2.StructuralFeature;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.ValueSpecification;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Slot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.SlotImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.SlotImpl#getOwningInstance <em>Owning Instance</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.SlotImpl#getValues <em>Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.SlotImpl#getDefiningFeature <em>Defining Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SlotImpl extends ElementImpl implements Slot {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

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
		return UML2Package.Literals.SLOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedElements() {
		EList ownedElement = (EList)eVirtualGet(UML2Package.SLOT__OWNED_ELEMENT);
		if (ownedElement == null) {
			eVirtualSet(UML2Package.SLOT__OWNED_ELEMENT, ownedElement = new DerivedUnionEObjectEList(Element.class, this, UML2Package.SLOT__OWNED_ELEMENT, new int[] {UML2Package.SLOT__OWNED_COMMENT, UML2Package.SLOT__VALUE}));
		}
		return ownedElement;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| eIsSet(UML2Package.SLOT__VALUE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceSpecification getOwningInstance() {
		if (eContainerFeatureID != UML2Package.SLOT__OWNING_INSTANCE) return null;
		return (InstanceSpecification)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningInstance(InstanceSpecification newOwningInstance) {
		if (newOwningInstance != eInternalContainer() || (eContainerFeatureID != UML2Package.SLOT__OWNING_INSTANCE && newOwningInstance != null)) {
			if (EcoreUtil.isAncestor(this, newOwningInstance))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningInstance != null)
				msgs = ((InternalEObject)newOwningInstance).eInverseAdd(this, UML2Package.INSTANCE_SPECIFICATION__SLOT, InstanceSpecification.class, msgs);
			msgs = eBasicSetContainer((InternalEObject)newOwningInstance, UML2Package.SLOT__OWNING_INSTANCE, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.SLOT__OWNING_INSTANCE, newOwningInstance, newOwningInstance));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getValues() {
		EList value = (EList)eVirtualGet(UML2Package.SLOT__VALUE);
		if (value == null) {
			eVirtualSet(UML2Package.SLOT__VALUE, value = new EObjectContainmentEList(ValueSpecification.class, this, UML2Package.SLOT__VALUE));
		}
		return value;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public ValueSpecification getValue(String name) {
		for (Iterator i = getValues().iterator(); i.hasNext(); ) {
			ValueSpecification value = (ValueSpecification) i.next();
			if (name.equals(value.getName())) {
				return value;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ValueSpecification createValue(EClass eClass) {
		ValueSpecification newValue = (ValueSpecification) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.SLOT__VALUE, null, newValue));
		}
		getValues().add(newValue);
		return newValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuralFeature getDefiningFeature() {
		StructuralFeature definingFeature = (StructuralFeature)eVirtualGet(UML2Package.SLOT__DEFINING_FEATURE);
		if (definingFeature != null && definingFeature.eIsProxy()) {
			InternalEObject oldDefiningFeature = (InternalEObject)definingFeature;
			definingFeature = (StructuralFeature)eResolveProxy(oldDefiningFeature);
			if (definingFeature != oldDefiningFeature) {
				eVirtualSet(UML2Package.SLOT__DEFINING_FEATURE, definingFeature);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2Package.SLOT__DEFINING_FEATURE, oldDefiningFeature, definingFeature));
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
		return (StructuralFeature)eVirtualGet(UML2Package.SLOT__DEFINING_FEATURE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefiningFeature(StructuralFeature newDefiningFeature) {
		StructuralFeature definingFeature = newDefiningFeature;
		Object oldDefiningFeature = eVirtualSet(UML2Package.SLOT__DEFINING_FEATURE, definingFeature);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.SLOT__DEFINING_FEATURE, oldDefiningFeature == EVIRTUAL_NO_VALUE ? null : oldDefiningFeature, definingFeature));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UML2Package.SLOT__EANNOTATIONS:
				return ((InternalEList)getEAnnotations()).basicAdd(otherEnd, msgs);
			case UML2Package.SLOT__OWNING_INSTANCE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, UML2Package.SLOT__OWNING_INSTANCE, msgs);
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
			case UML2Package.SLOT__EANNOTATIONS:
				return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
			case UML2Package.SLOT__OWNED_COMMENT:
				return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
			case UML2Package.SLOT__OWNING_INSTANCE:
				return eBasicSetContainer(null, UML2Package.SLOT__OWNING_INSTANCE, msgs);
			case UML2Package.SLOT__VALUE:
				return ((InternalEList)getValues()).basicRemove(otherEnd, msgs);
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
			case UML2Package.SLOT__OWNING_INSTANCE:
				return eInternalContainer().eInverseRemove(this, UML2Package.INSTANCE_SPECIFICATION__SLOT, InstanceSpecification.class, msgs);
		}
		return eDynamicBasicRemoveFromContainer(msgs);
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
		return super.isSetOwner()
			|| eIsSet(UML2Package.SLOT__OWNING_INSTANCE);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UML2Package.SLOT__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.SLOT__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.SLOT__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.SLOT__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.SLOT__OWNING_INSTANCE:
				return getOwningInstance();
			case UML2Package.SLOT__VALUE:
				return getValues();
			case UML2Package.SLOT__DEFINING_FEATURE:
				if (resolve) return getDefiningFeature();
				return basicGetDefiningFeature();
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
			case UML2Package.SLOT__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.SLOT__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.SLOT__OWNING_INSTANCE:
				setOwningInstance((InstanceSpecification)newValue);
				return;
			case UML2Package.SLOT__VALUE:
				getValues().clear();
				getValues().addAll((Collection)newValue);
				return;
			case UML2Package.SLOT__DEFINING_FEATURE:
				setDefiningFeature((StructuralFeature)newValue);
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
			case UML2Package.SLOT__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.SLOT__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.SLOT__OWNING_INSTANCE:
				setOwningInstance((InstanceSpecification)null);
				return;
			case UML2Package.SLOT__VALUE:
				getValues().clear();
				return;
			case UML2Package.SLOT__DEFINING_FEATURE:
				setDefiningFeature((StructuralFeature)null);
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
			case UML2Package.SLOT__EANNOTATIONS:
				EList eAnnotations = (EList)eVirtualGet(UML2Package.SLOT__EANNOTATIONS);
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.SLOT__OWNED_ELEMENT:
				return isSetOwnedElements();
			case UML2Package.SLOT__OWNER:
				return isSetOwner();
			case UML2Package.SLOT__OWNED_COMMENT:
				EList ownedComment = (EList)eVirtualGet(UML2Package.SLOT__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.SLOT__OWNING_INSTANCE:
				return getOwningInstance() != null;
			case UML2Package.SLOT__VALUE:
				EList value = (EList)eVirtualGet(UML2Package.SLOT__VALUE);
				return value != null && !value.isEmpty();
			case UML2Package.SLOT__DEFINING_FEATURE:
				return eVirtualGet(UML2Package.SLOT__DEFINING_FEATURE) != null;
		}
		return eDynamicIsSet(featureID);
	}


} //SlotImpl
