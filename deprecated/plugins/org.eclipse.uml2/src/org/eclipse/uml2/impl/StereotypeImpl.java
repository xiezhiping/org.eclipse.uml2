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
 * $Id: StereotypeImpl.java,v 1.36 2005/11/04 22:23:01 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Set;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.Extension;
import org.eclipse.uml2.Profile;
import org.eclipse.uml2.Stereotype;
import org.eclipse.uml2.UML2Package;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.internal.operation.StereotypeOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stereotype</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class StereotypeImpl extends ClassImpl implements Stereotype {

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
	protected StereotypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UML2Package.eINSTANCE.getStereotype();
	}


	public NotificationChain eDynamicInverseAdd(InternalEObject otherEnd, int featureID, Class inverseClass, NotificationChain msgs) {
		switch (eDerivedStructuralFeatureID(featureID, inverseClass)) {
			case UML2Package.STEREOTYPE__OWNED_STATE_MACHINE:
				return ((InternalEList)getOwnedStateMachines()).basicAdd(otherEnd, msgs);
			default :
				return super.eDynamicInverseAdd(otherEnd, featureID, inverseClass, msgs);
		}
	}

	public boolean eIsSet(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UML2Package.STEREOTYPE__VISIBILITY:
				return false;
			case UML2Package.STEREOTYPE__OWNED_BEHAVIOR:
				return ownedBehavior != null && !ownedBehavior.isEmpty();
			case UML2Package.STEREOTYPE__OWNED_ATTRIBUTE:
				return ownedAttribute != null && !ownedAttribute.isEmpty();
		}
		return eIsSetGen(eFeature);
	}

	// <!-- begin-custom-operations -->

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.Stereotype#createExtension(org.eclipse.emf.ecore.EClass,
	 *      boolean)
	 */
	public Extension createExtension(EClass eClass, boolean required) {
		return StereotypeOperations.createExtension(this, eClass, required);
	}

	private static Method GET_ALL_EXTENDED_E_CLASSES = null;

	static {
		try {
			GET_ALL_EXTENDED_E_CLASSES = StereotypeImpl.class.getMethod(
				"getAllExtendedEClasses", null); //$NON-NLS-1$
		} catch (Exception e) {
			// ignore
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.Stereotype#getExtendedEClasses()
	 */
	public Set getAllExtendedEClasses() {
		CacheAdapter cache = getCacheAdapter();

		if (cache != null) {
			Set result = (Set) cache.get(this, GET_ALL_EXTENDED_E_CLASSES);

			if (result == null) {
				cache.put(this, GET_ALL_EXTENDED_E_CLASSES,
					result = Collections.unmodifiableSet(StereotypeOperations
						.getAllExtendedEClasses(this)));
			}

			return result;
		}

		return Collections.unmodifiableSet(StereotypeOperations
			.getAllExtendedEClasses(this));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.Stereotype#getProfile()
	 */
	public Profile getProfile() {
		return StereotypeOperations.getProfile(this);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.Stereotype#getKeyword()
	 */
	public String getKeyword() {
		return StereotypeOperations.getKeyword(this);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.Stereotype#getKeyword(boolean)
	 */
	public String getKeyword(boolean localize) {
		return StereotypeOperations.getKeyword(this, localize);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.Stereotype#createExtension(org.eclipse.uml2.Class,
	 *      boolean)
	 */
	public Extension createExtension(org.eclipse.uml2.Class metaclass,
			boolean required) {
		return StereotypeOperations.createExtension(this, metaclass, required);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.Stereotype#getExtendedMetaclasses()
	 */
	public Set getExtendedMetaclasses() {
		return StereotypeOperations.getExtendedMetaclasses(this);
	}

	private static Method GET_ALL_EXTENDED_METACLASSES = null;

	static {
		try {
			GET_ALL_EXTENDED_METACLASSES = StereotypeImpl.class.getMethod(
				"getAllExtendedMetaclasses", null); //$NON-NLS-1$
		} catch (Exception e) {
			// ignore
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.Stereotype#getAllExtendedMetaclasses()
	 */
	public Set getAllExtendedMetaclasses() {
		CacheAdapter cache = getCacheAdapter();

		if (cache != null) {
			Set result = (Set) cache.get(this, GET_ALL_EXTENDED_METACLASSES);

			if (result == null) {
				cache.put(this, GET_ALL_EXTENDED_METACLASSES,
					result = Collections.unmodifiableSet(StereotypeOperations
						.getAllExtendedMetaclasses(this)));
			}

			return result;
		}

		return Collections.unmodifiableSet(StereotypeOperations
			.getAllExtendedMetaclasses(this));
	}

	// <!-- end-custom-operations -->

} //StereotypeImpl
