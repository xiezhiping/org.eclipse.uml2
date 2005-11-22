/*
 * Copyright (c) 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: ProtocolConformanceImpl.java,v 1.2 2005/11/22 15:32:36 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
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
		return UMLPackage.eINSTANCE.getProtocolConformance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getTargets() {
		List target = (List) eVirtualGet(UMLPackage.PROTOCOL_CONFORMANCE__TARGET);
		if (target == null) {
			eVirtualSet(UMLPackage.PROTOCOL_CONFORMANCE__TARGET,
				target = new DerivedUnionEObjectEList(Element.class, this,
					UMLPackage.PROTOCOL_CONFORMANCE__TARGET,
					new EStructuralFeature[]{UMLPackage.eINSTANCE
						.getProtocolConformance_GeneralMachine()}));
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getSources() {
		List source = (List) eVirtualGet(UMLPackage.PROTOCOL_CONFORMANCE__SOURCE);
		if (source == null) {
			eVirtualSet(UMLPackage.PROTOCOL_CONFORMANCE__SOURCE,
				source = new DerivedUnionEObjectEList(Element.class, this,
					UMLPackage.PROTOCOL_CONFORMANCE__SOURCE,
					new EStructuralFeature[]{UMLPackage.eINSTANCE
						.getProtocolConformance_SpecificMachine()}));
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
	public void setSpecificMachine(ProtocolStateMachine newSpecificMachine) {
		if (newSpecificMachine != eInternalContainer()
			|| (eContainerFeatureID != UMLPackage.PROTOCOL_CONFORMANCE__SPECIFIC_MACHINE && newSpecificMachine != null)) {
			if (EcoreUtil.isAncestor(this, (EObject) newSpecificMachine))
				throw new IllegalArgumentException(
					"Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSpecificMachine != null)
				msgs = ((InternalEObject) newSpecificMachine).eInverseAdd(this,
					UMLPackage.PROTOCOL_STATE_MACHINE__CONFORMANCE,
					ProtocolStateMachine.class, msgs);
			msgs = eBasicSetContainer((InternalEObject) newSpecificMachine,
				UMLPackage.PROTOCOL_CONFORMANCE__SPECIFIC_MACHINE, msgs);
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
			int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UMLPackage.PROTOCOL_CONFORMANCE__EANNOTATIONS :
					return ((InternalEList) getEAnnotations()).basicAdd(
						otherEnd, msgs);
				case UMLPackage.PROTOCOL_CONFORMANCE__SPECIFIC_MACHINE :
					if (eInternalContainer() != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd,
						UMLPackage.PROTOCOL_CONFORMANCE__SPECIFIC_MACHINE, msgs);
				default :
					return eDynamicInverseAdd(otherEnd, featureID, baseClass,
						msgs);
			}
		}
		if (eInternalContainer() != null)
			msgs = eBasicRemoveFromContainer(msgs);
		return eBasicSetContainer(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UMLPackage.PROTOCOL_CONFORMANCE__EANNOTATIONS :
					return ((InternalEList) getEAnnotations()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.PROTOCOL_CONFORMANCE__OWNED_COMMENT :
					return ((InternalEList) getOwnedComments()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.PROTOCOL_CONFORMANCE__SPECIFIC_MACHINE :
					return eBasicSetContainer(null,
						UMLPackage.PROTOCOL_CONFORMANCE__SPECIFIC_MACHINE, msgs);
				default :
					return eDynamicInverseRemove(otherEnd, featureID,
						baseClass, msgs);
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
				case UMLPackage.PROTOCOL_CONFORMANCE__SPECIFIC_MACHINE :
					return eInternalContainer().eInverseRemove(this,
						UMLPackage.PROTOCOL_STATE_MACHINE__CONFORMANCE,
						ProtocolStateMachine.class, msgs);
				default :
					return eDynamicBasicRemoveFromContainer(msgs);
			}
		}
		return eInternalContainer().eInverseRemove(this,
			EOPPOSITE_FEATURE_BASE - eContainerFeatureID, null, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UMLPackage.PROTOCOL_CONFORMANCE__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.PROTOCOL_CONFORMANCE__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.PROTOCOL_CONFORMANCE__OWNER :
				return getOwner();
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
				return getSpecificMachine();
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
		eDynamicSet(eFeature, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
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
		eDynamicUnset(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UMLPackage.PROTOCOL_CONFORMANCE__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.PROTOCOL_CONFORMANCE__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.PROTOCOL_CONFORMANCE__OWNER :
				return isSetOwner();
			case UMLPackage.PROTOCOL_CONFORMANCE__OWNED_COMMENT :
				List ownedComment = (List) eVirtualGet(UMLPackage.PROTOCOL_CONFORMANCE__OWNED_COMMENT);
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
				return getSpecificMachine() != null;
		}
		return eDynamicIsSet(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTargets() {
		return super.isSetTargets()
			|| eIsSet(UMLPackage.eINSTANCE
				.getProtocolConformance_GeneralMachine());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSources() {
		return super.isSetSources()
			|| eIsSet(UMLPackage.eINSTANCE
				.getProtocolConformance_SpecificMachine());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getOwner() {
		ProtocolStateMachine specificMachine = getSpecificMachine();
		if (specificMachine != null) {
			return specificMachine;
		}
		return super.getOwner();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwner() {
		return super.isSetOwner()
			|| eIsSet(UMLPackage.eINSTANCE
				.getProtocolConformance_SpecificMachine());
	}

} //ProtocolConformanceImpl
