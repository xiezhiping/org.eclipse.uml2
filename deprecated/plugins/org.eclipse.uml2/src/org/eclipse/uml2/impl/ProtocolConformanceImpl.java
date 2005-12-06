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
 * $Id: ProtocolConformanceImpl.java,v 1.18 2005/12/06 23:18:04 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.Element;
import org.eclipse.uml2.ProtocolConformance;
import org.eclipse.uml2.ProtocolStateMachine;
import org.eclipse.uml2.UML2Package;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Protocol Conformance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.ProtocolConformanceImpl#getSources <em>Source</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ProtocolConformanceImpl#getTargets <em>Target</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ProtocolConformanceImpl#getSpecificMachine <em>Specific Machine</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ProtocolConformanceImpl#getGeneralMachine <em>General Machine</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProtocolConformanceImpl extends DirectedRelationshipImpl implements ProtocolConformance {
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
	protected ProtocolConformanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UML2Package.Literals.PROTOCOL_CONFORMANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSources() {
		EList source = (EList)eVirtualGet(UML2Package.PROTOCOL_CONFORMANCE__SOURCE);
		if (source == null) {
			eVirtualSet(UML2Package.PROTOCOL_CONFORMANCE__SOURCE, source = new DerivedUnionEObjectEList(Element.class, this, UML2Package.PROTOCOL_CONFORMANCE__SOURCE, new int[] {UML2Package.PROTOCOL_CONFORMANCE__SPECIFIC_MACHINE}));
		}
		return source;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSources() {
		return super.isSetSources()
			|| eIsSet(UML2Package.PROTOCOL_CONFORMANCE__SPECIFIC_MACHINE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getTargets() {
		EList target = (EList)eVirtualGet(UML2Package.PROTOCOL_CONFORMANCE__TARGET);
		if (target == null) {
			eVirtualSet(UML2Package.PROTOCOL_CONFORMANCE__TARGET, target = new DerivedUnionEObjectEList(Element.class, this, UML2Package.PROTOCOL_CONFORMANCE__TARGET, new int[] {UML2Package.PROTOCOL_CONFORMANCE__GENERAL_MACHINE}));
		}
		return target;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTargets() {
		return super.isSetTargets()
			|| eIsSet(UML2Package.PROTOCOL_CONFORMANCE__GENERAL_MACHINE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolStateMachine getSpecificMachine() {
		if (eContainerFeatureID != UML2Package.PROTOCOL_CONFORMANCE__SPECIFIC_MACHINE) return null;
		return (ProtocolStateMachine)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecificMachine(ProtocolStateMachine newSpecificMachine) {
		if (newSpecificMachine != eInternalContainer() || (eContainerFeatureID != UML2Package.PROTOCOL_CONFORMANCE__SPECIFIC_MACHINE && newSpecificMachine != null)) {
			if (EcoreUtil.isAncestor(this, newSpecificMachine))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSpecificMachine != null)
				msgs = ((InternalEObject)newSpecificMachine).eInverseAdd(this, UML2Package.PROTOCOL_STATE_MACHINE__CONFORMANCE, ProtocolStateMachine.class, msgs);
			msgs = eBasicSetContainer((InternalEObject)newSpecificMachine, UML2Package.PROTOCOL_CONFORMANCE__SPECIFIC_MACHINE, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.PROTOCOL_CONFORMANCE__SPECIFIC_MACHINE, newSpecificMachine, newSpecificMachine));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolStateMachine getGeneralMachine() {
		ProtocolStateMachine generalMachine = (ProtocolStateMachine)eVirtualGet(UML2Package.PROTOCOL_CONFORMANCE__GENERAL_MACHINE);
		if (generalMachine != null && generalMachine.eIsProxy()) {
			InternalEObject oldGeneralMachine = (InternalEObject)generalMachine;
			generalMachine = (ProtocolStateMachine)eResolveProxy(oldGeneralMachine);
			if (generalMachine != oldGeneralMachine) {
				eVirtualSet(UML2Package.PROTOCOL_CONFORMANCE__GENERAL_MACHINE, generalMachine);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2Package.PROTOCOL_CONFORMANCE__GENERAL_MACHINE, oldGeneralMachine, generalMachine));
			}
		}
		return generalMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolStateMachine basicGetGeneralMachine() {
		return (ProtocolStateMachine)eVirtualGet(UML2Package.PROTOCOL_CONFORMANCE__GENERAL_MACHINE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneralMachine(ProtocolStateMachine newGeneralMachine) {
		ProtocolStateMachine generalMachine = newGeneralMachine;
		Object oldGeneralMachine = eVirtualSet(UML2Package.PROTOCOL_CONFORMANCE__GENERAL_MACHINE, generalMachine);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.PROTOCOL_CONFORMANCE__GENERAL_MACHINE, oldGeneralMachine == EVIRTUAL_NO_VALUE ? null : oldGeneralMachine, generalMachine));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UML2Package.PROTOCOL_CONFORMANCE__EANNOTATIONS:
				return ((InternalEList)getEAnnotations()).basicAdd(otherEnd, msgs);
			case UML2Package.PROTOCOL_CONFORMANCE__SPECIFIC_MACHINE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, UML2Package.PROTOCOL_CONFORMANCE__SPECIFIC_MACHINE, msgs);
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
			case UML2Package.PROTOCOL_CONFORMANCE__EANNOTATIONS:
				return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
			case UML2Package.PROTOCOL_CONFORMANCE__OWNED_COMMENT:
				return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
			case UML2Package.PROTOCOL_CONFORMANCE__SPECIFIC_MACHINE:
				return eBasicSetContainer(null, UML2Package.PROTOCOL_CONFORMANCE__SPECIFIC_MACHINE, msgs);
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
			case UML2Package.PROTOCOL_CONFORMANCE__SPECIFIC_MACHINE:
				return eInternalContainer().eInverseRemove(this, UML2Package.PROTOCOL_STATE_MACHINE__CONFORMANCE, ProtocolStateMachine.class, msgs);
		}
		return eDynamicBasicRemoveFromContainer(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetOwner() {
		ProtocolStateMachine specificMachine = getSpecificMachine();			
		if (specificMachine != null) {
			return specificMachine;
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
			|| eIsSet(UML2Package.PROTOCOL_CONFORMANCE__SPECIFIC_MACHINE);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UML2Package.PROTOCOL_CONFORMANCE__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.PROTOCOL_CONFORMANCE__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.PROTOCOL_CONFORMANCE__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.PROTOCOL_CONFORMANCE__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.PROTOCOL_CONFORMANCE__RELATED_ELEMENT:
				return getRelatedElements();
			case UML2Package.PROTOCOL_CONFORMANCE__SOURCE:
				return getSources();
			case UML2Package.PROTOCOL_CONFORMANCE__TARGET:
				return getTargets();
			case UML2Package.PROTOCOL_CONFORMANCE__SPECIFIC_MACHINE:
				return getSpecificMachine();
			case UML2Package.PROTOCOL_CONFORMANCE__GENERAL_MACHINE:
				if (resolve) return getGeneralMachine();
				return basicGetGeneralMachine();
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
			case UML2Package.PROTOCOL_CONFORMANCE__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.PROTOCOL_CONFORMANCE__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.PROTOCOL_CONFORMANCE__SPECIFIC_MACHINE:
				setSpecificMachine((ProtocolStateMachine)newValue);
				return;
			case UML2Package.PROTOCOL_CONFORMANCE__GENERAL_MACHINE:
				setGeneralMachine((ProtocolStateMachine)newValue);
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
			case UML2Package.PROTOCOL_CONFORMANCE__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.PROTOCOL_CONFORMANCE__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.PROTOCOL_CONFORMANCE__SPECIFIC_MACHINE:
				setSpecificMachine((ProtocolStateMachine)null);
				return;
			case UML2Package.PROTOCOL_CONFORMANCE__GENERAL_MACHINE:
				setGeneralMachine((ProtocolStateMachine)null);
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
			case UML2Package.PROTOCOL_CONFORMANCE__EANNOTATIONS:
				EList eAnnotations = (EList)eVirtualGet(UML2Package.PROTOCOL_CONFORMANCE__EANNOTATIONS);
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.PROTOCOL_CONFORMANCE__OWNED_ELEMENT:
				return isSetOwnedElements();
			case UML2Package.PROTOCOL_CONFORMANCE__OWNER:
				return isSetOwner();
			case UML2Package.PROTOCOL_CONFORMANCE__OWNED_COMMENT:
				EList ownedComment = (EList)eVirtualGet(UML2Package.PROTOCOL_CONFORMANCE__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.PROTOCOL_CONFORMANCE__RELATED_ELEMENT:
				return isSetRelatedElements();
			case UML2Package.PROTOCOL_CONFORMANCE__SOURCE:
				return isSetSources();
			case UML2Package.PROTOCOL_CONFORMANCE__TARGET:
				return isSetTargets();
			case UML2Package.PROTOCOL_CONFORMANCE__SPECIFIC_MACHINE:
				return getSpecificMachine() != null;
			case UML2Package.PROTOCOL_CONFORMANCE__GENERAL_MACHINE:
				return eVirtualGet(UML2Package.PROTOCOL_CONFORMANCE__GENERAL_MACHINE) != null;
		}
		return eDynamicIsSet(featureID);
	}


} //ProtocolConformanceImpl
