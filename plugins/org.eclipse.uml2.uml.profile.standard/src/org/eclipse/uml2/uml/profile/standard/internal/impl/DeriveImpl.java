/*
 * Copyright (c) 2014, 2015 CEA and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Kenn Hussey (CEA) - initial API and implementation
 *   Kenn Hussey (CEA) - 451350
 *
 */
package org.eclipse.uml2.uml.profile.standard.internal.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.uml2.uml.Abstraction;

import org.eclipse.uml2.uml.ValueSpecification;
import org.eclipse.uml2.uml.profile.standard.Derive;
import org.eclipse.uml2.uml.profile.standard.StandardPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Derive</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.profile.standard.internal.impl.DeriveImpl#getComputation <em>Computation</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.profile.standard.internal.impl.DeriveImpl#getBase_Abstraction <em>Base Abstraction</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeriveImpl
		extends EObjectImpl
		implements Derive {

	/**
	 * The cached value of the '{@link #getComputation() <em>Computation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComputation()
	 * @generated
	 * @ordered
	 */
	protected ValueSpecification computation;

	/**
	 * The cached value of the '{@link #getBase_Abstraction() <em>Base Abstraction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Abstraction()
	 * @generated
	 * @ordered
	 */
	protected Abstraction base_Abstraction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeriveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StandardPackage.Literals.DERIVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getComputation() {
		if (computation != null && computation.eIsProxy()) {
			InternalEObject oldComputation = (InternalEObject) computation;
			computation = (ValueSpecification) eResolveProxy(oldComputation);
			if (computation != oldComputation) {
				InternalEObject newComputation = (InternalEObject) computation;
				NotificationChain msgs = oldComputation.eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE
						- StandardPackage.DERIVE__COMPUTATION, null, null);
				if (newComputation.eInternalContainer() == null) {
					msgs = newComputation.eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
							- StandardPackage.DERIVE__COMPUTATION, null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						StandardPackage.DERIVE__COMPUTATION, oldComputation,
						computation));
			}
		}
		return computation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification basicGetComputation() {
		return computation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComputation(
			ValueSpecification newComputation, NotificationChain msgs) {
		ValueSpecification oldComputation = computation;
		computation = newComputation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET, StandardPackage.DERIVE__COMPUTATION,
				oldComputation, newComputation);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComputation(ValueSpecification newComputation) {
		if (newComputation != computation) {
			NotificationChain msgs = null;
			if (computation != null)
				msgs = ((InternalEObject) computation).eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE
						- StandardPackage.DERIVE__COMPUTATION, null, msgs);
			if (newComputation != null)
				msgs = ((InternalEObject) newComputation).eInverseAdd(this,
					EOPPOSITE_FEATURE_BASE
						- StandardPackage.DERIVE__COMPUTATION, null, msgs);
			msgs = basicSetComputation(newComputation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				StandardPackage.DERIVE__COMPUTATION, newComputation,
				newComputation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Abstraction getBase_Abstraction() {
		if (base_Abstraction != null && base_Abstraction.eIsProxy()) {
			InternalEObject oldBase_Abstraction = (InternalEObject) base_Abstraction;
			base_Abstraction = (Abstraction) eResolveProxy(oldBase_Abstraction);
			if (base_Abstraction != oldBase_Abstraction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						StandardPackage.DERIVE__BASE_ABSTRACTION,
						oldBase_Abstraction, base_Abstraction));
			}
		}
		return base_Abstraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Abstraction basicGetBase_Abstraction() {
		return base_Abstraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Abstraction(Abstraction newBase_Abstraction) {
		Abstraction oldBase_Abstraction = base_Abstraction;
		base_Abstraction = newBase_Abstraction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				StandardPackage.DERIVE__BASE_ABSTRACTION, oldBase_Abstraction,
				base_Abstraction));
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
			case StandardPackage.DERIVE__COMPUTATION :
				return basicSetComputation(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StandardPackage.DERIVE__COMPUTATION :
				if (resolve)
					return getComputation();
				return basicGetComputation();
			case StandardPackage.DERIVE__BASE_ABSTRACTION :
				if (resolve)
					return getBase_Abstraction();
				return basicGetBase_Abstraction();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StandardPackage.DERIVE__COMPUTATION :
				setComputation((ValueSpecification) newValue);
				return;
			case StandardPackage.DERIVE__BASE_ABSTRACTION :
				setBase_Abstraction((Abstraction) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case StandardPackage.DERIVE__COMPUTATION :
				setComputation((ValueSpecification) null);
				return;
			case StandardPackage.DERIVE__BASE_ABSTRACTION :
				setBase_Abstraction((Abstraction) null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case StandardPackage.DERIVE__COMPUTATION :
				return computation != null;
			case StandardPackage.DERIVE__BASE_ABSTRACTION :
				return base_Abstraction != null;
		}
		return super.eIsSet(featureID);
	}

} //DeriveImpl
