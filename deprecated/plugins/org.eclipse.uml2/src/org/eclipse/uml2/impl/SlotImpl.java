/*
 * Copyright (c) 2003, 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 */
package org.eclipse.uml2.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.uml2.Element;
import org.eclipse.uml2.InstanceSpecification;
import org.eclipse.uml2.Slot;
import org.eclipse.uml2.StructuralFeature;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.ValueSpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Slot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
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
	public static final String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getValues() <em>Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValues()
	 * @generated
	 * @ordered
	 */
	protected EList value = null;

	/**
	 * The cached value of the '{@link #getDefiningFeature() <em>Defining Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefiningFeature()
	 * @generated
	 * @ordered
	 */
	protected StructuralFeature definingFeature = null;

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
		return UML2Package.eINSTANCE.getSlot();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Owning Instance</b></em>' container reference.
	 * <p>
	 * Subsets the following features:
	 * <ul>
	 *   <li>{@link org.eclipse.uml2.Element#getOwner}</li>
	 * </ul>
	 * </p>
	 * @generated
	 */
	public InstanceSpecification getOwningInstance() {
		if (eContainerFeatureID != UML2Package.SLOT__OWNING_INSTANCE) return null;
		return (InstanceSpecification)eContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningInstance(InstanceSpecification newOwningInstance) {
		if (newOwningInstance != eContainer || (eContainerFeatureID != UML2Package.SLOT__OWNING_INSTANCE && newOwningInstance != null)) {
			if (EcoreUtil.isAncestor(this, newOwningInstance))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eContainer != null)
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
	 * Returns the value of the '<em><b>Value</b></em>' containment reference list.
	 * <p>
	 * Subsets the following features:
	 * <ul>
	 *   <li>{@link org.eclipse.uml2.Element#getOwnedElements}</li>
	 * </ul>
	 * </p>
	 * @generated
	 */
	public EList getValues() {
		if (value == null) {
			value = new EObjectContainmentEList(ValueSpecification.class, this, UML2Package.SLOT__VALUE);
		}
		return value;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
     */
    public ValueSpecification getValue(String unqualifiedName) {
    	for (Iterator i = getValues().iterator(); i.hasNext(); ) {
    		ValueSpecification namedValue = (ValueSpecification) i.next();
    		
    		if (unqualifiedName.equals(namedValue.getName())) {
    			return namedValue;
    		}
    	}
    	
    	return null;
    }
      
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification createValue(EClass eClass) {
		ValueSpecification newValue = (ValueSpecification) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.CREATE, UML2Package.SLOT__VALUE, null, newValue));
		}
		getValues().add(newValue);
		return newValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Defining Feature</b></em>' reference.
	 * @generated
	 */
	public StructuralFeature getDefiningFeature() {
		if (definingFeature != null && definingFeature.eIsProxy()) {
			StructuralFeature oldDefiningFeature = definingFeature;
			definingFeature = (StructuralFeature)eResolveProxy((InternalEObject)definingFeature);
			if (definingFeature != oldDefiningFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2Package.SLOT__DEFINING_FEATURE, oldDefiningFeature, definingFeature));
			}
		}
		return definingFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Defining Feature</b></em>' reference.
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
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.SLOT__DEFINING_FEATURE, oldDefiningFeature, definingFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Owner</b></em>' reference, a derived union.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.Element#getOwnedElements <em>Owned Element</em>}'.
	 * @generated
	 */
	public Element basicGetOwner() {
		// TODO: test this union basic getter
		if (null != getOwningInstance()) {
			return (Element) getOwningInstance();
		}
		return super.basicGetOwner();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Owned Element</b></em>' reference list, a derived union.
	 * The list contents are of type {@link org.eclipse.uml2.Element}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.Element#getOwner <em>Owner</em>}'.
	 * @generated
	 */
	public EList getOwnedElements() {
		// TODO: test this union getter
		if (!getCacheAdapter().containsKey(this, UML2Package.eINSTANCE.getElement_OwnedElement())) {
			Set union = new LinkedHashSet();
			union.addAll(super.getOwnedElements());
			union.addAll(getValues());
			getCacheAdapter().put(
				this,
				UML2Package.eINSTANCE.getElement_OwnedElement(),
				new EcoreEList.UnmodifiableEList(this, 
					UML2Package.eINSTANCE.getElement_OwnedElement(),
					union.size(),
					union.toArray()));
		}
		return (EList) getCacheAdapter().get(this, UML2Package.eINSTANCE.getElement_OwnedElement());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UML2Package.SLOT__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicAdd(otherEnd, msgs);
				case UML2Package.SLOT__OWNING_INSTANCE:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, UML2Package.SLOT__OWNING_INSTANCE, msgs);
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
				case UML2Package.SLOT__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
				case UML2Package.SLOT__OWNED_COMMENT:
					return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
				case UML2Package.SLOT__OWNING_INSTANCE:
					return eBasicSetContainer(null, UML2Package.SLOT__OWNING_INSTANCE, msgs);
				case UML2Package.SLOT__VALUE:
					return ((InternalEList)getValues()).basicRemove(otherEnd, msgs);
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
				case UML2Package.SLOT__OWNING_INSTANCE:
					return eContainer.eInverseRemove(this, UML2Package.INSTANCE_SPECIFICATION__SLOT, InstanceSpecification.class, msgs);
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
		return eDynamicGet(eFeature, resolve);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(EStructuralFeature eFeature, Object newValue) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
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
		eDynamicSet(eFeature, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
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
		eDynamicUnset(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UML2Package.SLOT__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.SLOT__OWNED_ELEMENT:
				return !getOwnedElements().isEmpty();
			case UML2Package.SLOT__OWNER:
				return basicGetOwner() != null;
			case UML2Package.SLOT__OWNED_COMMENT:
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.SLOT__OWNING_INSTANCE:
				return getOwningInstance() != null;
			case UML2Package.SLOT__VALUE:
				return value != null && !value.isEmpty();
			case UML2Package.SLOT__DEFINING_FEATURE:
				return definingFeature != null;
		}
		return eDynamicIsSet(eFeature);
	}

} //SlotImpl
