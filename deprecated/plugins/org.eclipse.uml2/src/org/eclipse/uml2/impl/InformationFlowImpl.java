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

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.uml2.Classifier;
import org.eclipse.uml2.InformationFlow;
import org.eclipse.uml2.Relationship;
import org.eclipse.uml2.UML2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Information Flow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.InformationFlowImpl#getRealizations <em>Realization</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.InformationFlowImpl#getConveyeds <em>Conveyed</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InformationFlowImpl extends DirectedRelationshipImpl implements InformationFlow {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getRealizations() <em>Realization</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizations()
	 * @generated
	 * @ordered
	 */
	protected EList realization = null;

	/**
	 * The cached value of the '{@link #getConveyeds() <em>Conveyed</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConveyeds()
	 * @generated
	 * @ordered
	 */
	protected EList conveyed = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InformationFlowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UML2Package.eINSTANCE.getInformationFlow();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Realization</b></em>' reference list.
	 * @generated
	 */
	public EList getRealizations() {
		if (realization == null) {
			realization = new EObjectResolvingEList(Relationship.class, this, UML2Package.INFORMATION_FLOW__REALIZATION);
		}
		return realization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Conveyed</b></em>' reference list.
	 * @generated
	 */
	public EList getConveyeds() {
		if (conveyed == null) {
			conveyed = new EObjectResolvingEList(Classifier.class, this, UML2Package.INFORMATION_FLOW__CONVEYED);
		}
		return conveyed;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
     */
    public Classifier getConveyed(String unqualifiedName) {
    	for (Iterator i = getConveyeds().iterator(); i.hasNext(); ) {
    		Classifier namedConveyed = (Classifier) i.next();
    		
    		if (unqualifiedName.equals(namedConveyed.getName())) {
    			return namedConveyed;
    		}
    	}
    	
    	return null;
    }
      
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UML2Package.INFORMATION_FLOW__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicAdd(otherEnd, msgs);
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
				case UML2Package.INFORMATION_FLOW__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
				case UML2Package.INFORMATION_FLOW__OWNED_COMMENT:
					return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
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
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UML2Package.INFORMATION_FLOW__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.INFORMATION_FLOW__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.INFORMATION_FLOW__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.INFORMATION_FLOW__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.INFORMATION_FLOW__RELATED_ELEMENT:
				return getRelatedElements();
			case UML2Package.INFORMATION_FLOW__SOURCE:
				return getSources();
			case UML2Package.INFORMATION_FLOW__TARGET:
				return getTargets();
			case UML2Package.INFORMATION_FLOW__REALIZATION:
				return getRealizations();
			case UML2Package.INFORMATION_FLOW__CONVEYED:
				return getConveyeds();
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
			case UML2Package.INFORMATION_FLOW__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.INFORMATION_FLOW__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.INFORMATION_FLOW__REALIZATION:
				getRealizations().clear();
				getRealizations().addAll((Collection)newValue);
				return;
			case UML2Package.INFORMATION_FLOW__CONVEYED:
				getConveyeds().clear();
				getConveyeds().addAll((Collection)newValue);
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
			case UML2Package.INFORMATION_FLOW__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.INFORMATION_FLOW__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.INFORMATION_FLOW__REALIZATION:
				getRealizations().clear();
				return;
			case UML2Package.INFORMATION_FLOW__CONVEYED:
				getConveyeds().clear();
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
			case UML2Package.INFORMATION_FLOW__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.INFORMATION_FLOW__OWNED_ELEMENT:
				return !getOwnedElements().isEmpty();
			case UML2Package.INFORMATION_FLOW__OWNER:
				return basicGetOwner() != null;
			case UML2Package.INFORMATION_FLOW__OWNED_COMMENT:
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.INFORMATION_FLOW__RELATED_ELEMENT:
				return !getRelatedElements().isEmpty();
			case UML2Package.INFORMATION_FLOW__SOURCE:
				return !getSources().isEmpty();
			case UML2Package.INFORMATION_FLOW__TARGET:
				return !getTargets().isEmpty();
			case UML2Package.INFORMATION_FLOW__REALIZATION:
				return realization != null && !realization.isEmpty();
			case UML2Package.INFORMATION_FLOW__CONVEYED:
				return conveyed != null && !conveyed.isEmpty();
		}
		return eDynamicIsSet(eFeature);
	}

} //InformationFlowImpl
