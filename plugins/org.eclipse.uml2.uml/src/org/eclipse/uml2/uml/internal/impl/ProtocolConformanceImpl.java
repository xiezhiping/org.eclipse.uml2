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
 * $Id: ProtocolConformanceImpl.java,v 1.10 2006/03/15 19:34:05 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.ProtocolConformance;
import org.eclipse.uml2.uml.ProtocolStateMachine;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Protocol Conformance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ProtocolConformanceImpl#getTargets <em>Target</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ProtocolConformanceImpl#getSources <em>Source</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ProtocolConformanceImpl#getGeneralMachine <em>General Machine</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ProtocolConformanceImpl#getSpecificMachine <em>Specific Machine</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProtocolConformanceImpl
		extends DirectedRelationshipImpl
		implements ProtocolConformance {

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
		return UMLPackage.Literals.PROTOCOL_CONFORMANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getTargets() {
		EList target = (EList) eVirtualGet(UMLPackage.PROTOCOL_CONFORMANCE__TARGET);
		if (target == null) {
			eVirtualSet(
				UMLPackage.PROTOCOL_CONFORMANCE__TARGET,
				target = new DerivedUnionEObjectEList(Element.class, this,
					UMLPackage.PROTOCOL_CONFORMANCE__TARGET,
					new int[]{UMLPackage.PROTOCOL_CONFORMANCE__GENERAL_MACHINE}));
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSources() {
		EList source = (EList) eVirtualGet(UMLPackage.PROTOCOL_CONFORMANCE__SOURCE);
		if (source == null) {
			eVirtualSet(
				UMLPackage.PROTOCOL_CONFORMANCE__SOURCE,
				source = new DerivedUnionEObjectEList(
					Element.class,
					this,
					UMLPackage.PROTOCOL_CONFORMANCE__SOURCE,
					new int[]{UMLPackage.PROTOCOL_CONFORMANCE__SPECIFIC_MACHINE}));
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolStateMachine getGeneralMachine() {
		ProtocolStateMachine generalMachine = (ProtocolStateMachine) eVirtualGet(UMLPackage.PROTOCOL_CONFORMANCE__GENERAL_MACHINE);
		if (generalMachine != null && generalMachine.eIsProxy()) {
			InternalEObject oldGeneralMachine = (InternalEObject) generalMachine;
			generalMachine = (ProtocolStateMachine) eResolveProxy(oldGeneralMachine);
			if (generalMachine != oldGeneralMachine) {
				eVirtualSet(UMLPackage.PROTOCOL_CONFORMANCE__GENERAL_MACHINE,
					generalMachine);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.PROTOCOL_CONFORMANCE__GENERAL_MACHINE,
						oldGeneralMachine, generalMachine));
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
		return (ProtocolStateMachine) eVirtualGet(UMLPackage.PROTOCOL_CONFORMANCE__GENERAL_MACHINE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneralMachine(ProtocolStateMachine newGeneralMachine) {
		ProtocolStateMachine generalMachine = newGeneralMachine;
		Object oldGeneralMachine = eVirtualSet(
			UMLPackage.PROTOCOL_CONFORMANCE__GENERAL_MACHINE, generalMachine);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.PROTOCOL_CONFORMANCE__GENERAL_MACHINE,
				oldGeneralMachine == EVIRTUAL_NO_VALUE
					? null
					: oldGeneralMachine, generalMachine));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolStateMachine getSpecificMachine() {
		if (eContainerFeatureID != UMLPackage.PROTOCOL_CONFORMANCE__SPECIFIC_MACHINE)
			return null;
		return (ProtocolStateMachine) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolStateMachine basicGetSpecificMachine() {
		if (eContainerFeatureID != UMLPackage.PROTOCOL_CONFORMANCE__SPECIFIC_MACHINE)
			return null;
		return (ProtocolStateMachine) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecificMachine(
			ProtocolStateMachine newSpecificMachine, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newSpecificMachine,
			UMLPackage.PROTOCOL_CONFORMANCE__SPECIFIC_MACHINE, msgs);

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecificMachine(ProtocolStateMachine newSpecificMachine) {
		if (newSpecificMachine != eInternalContainer()
			|| (eContainerFeatureID != UMLPackage.PROTOCOL_CONFORMANCE__SPECIFIC_MACHINE && newSpecificMachine != null)) {
			if (EcoreUtil.isAncestor(this, newSpecificMachine))
				throw new IllegalArgumentException(
					"Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSpecificMachine != null)
				msgs = ((InternalEObject) newSpecificMachine).eInverseAdd(this,
					UMLPackage.PROTOCOL_STATE_MACHINE__CONFORMANCE,
					ProtocolStateMachine.class, msgs);
			msgs = basicSetSpecificMachine(newSpecificMachine, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.PROTOCOL_CONFORMANCE__SPECIFIC_MACHINE,
				newSpecificMachine, newSpecificMachine));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.PROTOCOL_CONFORMANCE__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.PROTOCOL_CONFORMANCE__SPECIFIC_MACHINE :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSpecificMachine((ProtocolStateMachine) otherEnd,
					msgs);
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
			case UMLPackage.PROTOCOL_CONFORMANCE__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.PROTOCOL_CONFORMANCE__OWNED_COMMENT :
				return ((InternalEList) getOwnedComments()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.PROTOCOL_CONFORMANCE__SPECIFIC_MACHINE :
				return basicSetSpecificMachine(null, msgs);
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
			case UMLPackage.PROTOCOL_CONFORMANCE__SPECIFIC_MACHINE :
				return eInternalContainer().eInverseRemove(this,
					UMLPackage.PROTOCOL_STATE_MACHINE__CONFORMANCE,
					ProtocolStateMachine.class, msgs);
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
			case UMLPackage.PROTOCOL_CONFORMANCE__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.PROTOCOL_CONFORMANCE__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.PROTOCOL_CONFORMANCE__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.PROTOCOL_CONFORMANCE__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.PROTOCOL_CONFORMANCE__RELATED_ELEMENT :
				return getRelatedElements();
			case UMLPackage.PROTOCOL_CONFORMANCE__SOURCE :
				return getSources();
			case UMLPackage.PROTOCOL_CONFORMANCE__TARGET :
				return getTargets();
			case UMLPackage.PROTOCOL_CONFORMANCE__GENERAL_MACHINE :
				if (resolve)
					return getGeneralMachine();
				return basicGetGeneralMachine();
			case UMLPackage.PROTOCOL_CONFORMANCE__SPECIFIC_MACHINE :
				if (resolve)
					return getSpecificMachine();
				return basicGetSpecificMachine();
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
			case UMLPackage.PROTOCOL_CONFORMANCE__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.PROTOCOL_CONFORMANCE__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.PROTOCOL_CONFORMANCE__GENERAL_MACHINE :
				setGeneralMachine((ProtocolStateMachine) newValue);
				return;
			case UMLPackage.PROTOCOL_CONFORMANCE__SPECIFIC_MACHINE :
				setSpecificMachine((ProtocolStateMachine) newValue);
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
			case UMLPackage.PROTOCOL_CONFORMANCE__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.PROTOCOL_CONFORMANCE__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.PROTOCOL_CONFORMANCE__GENERAL_MACHINE :
				setGeneralMachine((ProtocolStateMachine) null);
				return;
			case UMLPackage.PROTOCOL_CONFORMANCE__SPECIFIC_MACHINE :
				setSpecificMachine((ProtocolStateMachine) null);
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
			case UMLPackage.PROTOCOL_CONFORMANCE__EANNOTATIONS :
				EList eAnnotations = (EList) eVirtualGet(UMLPackage.PROTOCOL_CONFORMANCE__EANNOTATIONS);
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.PROTOCOL_CONFORMANCE__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.PROTOCOL_CONFORMANCE__OWNER :
				return isSetOwner();
			case UMLPackage.PROTOCOL_CONFORMANCE__OWNED_COMMENT :
				EList ownedComment = (EList) eVirtualGet(UMLPackage.PROTOCOL_CONFORMANCE__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.PROTOCOL_CONFORMANCE__RELATED_ELEMENT :
				return isSetRelatedElements();
			case UMLPackage.PROTOCOL_CONFORMANCE__SOURCE :
				return isSetSources();
			case UMLPackage.PROTOCOL_CONFORMANCE__TARGET :
				return isSetTargets();
			case UMLPackage.PROTOCOL_CONFORMANCE__GENERAL_MACHINE :
				return eVirtualGet(UMLPackage.PROTOCOL_CONFORMANCE__GENERAL_MACHINE) != null;
			case UMLPackage.PROTOCOL_CONFORMANCE__SPECIFIC_MACHINE :
				return basicGetSpecificMachine() != null;
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTargets() {
		return super.isSetTargets()
			|| eIsSet(UMLPackage.PROTOCOL_CONFORMANCE__GENERAL_MACHINE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSources() {
		return super.isSetSources()
			|| eIsSet(UMLPackage.PROTOCOL_CONFORMANCE__SPECIFIC_MACHINE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetOwner() {
		ProtocolStateMachine specificMachine = basicGetSpecificMachine();
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
			|| eIsSet(UMLPackage.PROTOCOL_CONFORMANCE__SPECIFIC_MACHINE);
	}

} //ProtocolConformanceImpl
