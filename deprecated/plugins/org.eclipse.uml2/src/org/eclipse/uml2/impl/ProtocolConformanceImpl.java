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
import java.util.LinkedHashSet;
import java.util.Set;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.uml2.Element;
import org.eclipse.uml2.ProtocolConformance;
import org.eclipse.uml2.ProtocolStateMachine;
import org.eclipse.uml2.UML2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Protocol Conformance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
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
	public static final String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getGeneralMachine() <em>General Machine</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralMachine()
	 * @generated
	 * @ordered
	 */
	protected ProtocolStateMachine generalMachine = null;

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
		return UML2Package.eINSTANCE.getProtocolConformance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Specific Machine</b></em>' container reference.
	 * <p>
	 * Subsets the following features:
	 * <ul>
	 *   <li>{@link org.eclipse.uml2.DirectedRelationship#getSources}</li>
	 *   <li>{@link org.eclipse.uml2.Element#getOwner}</li>
	 * </ul>
	 * </p>
	 * @generated
	 */
	public ProtocolStateMachine getSpecificMachine() {
		if (eContainerFeatureID != UML2Package.PROTOCOL_CONFORMANCE__SPECIFIC_MACHINE) return null;
		return (ProtocolStateMachine)eContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecificMachine(ProtocolStateMachine newSpecificMachine) {
		if (newSpecificMachine != eContainer || (eContainerFeatureID != UML2Package.PROTOCOL_CONFORMANCE__SPECIFIC_MACHINE && newSpecificMachine != null)) {
			if (EcoreUtil.isAncestor(this, newSpecificMachine))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eContainer != null)
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
	 * Returns the value of the '<em><b>General Machine</b></em>' reference.
	 * <p>
	 * Subsets the following features:
	 * <ul>
	 *   <li>{@link org.eclipse.uml2.DirectedRelationship#getTargets}</li>
	 * </ul>
	 * </p>
	 * @generated
	 */
	public ProtocolStateMachine getGeneralMachine() {
		if (generalMachine != null && generalMachine.eIsProxy()) {
			ProtocolStateMachine oldGeneralMachine = generalMachine;
			generalMachine = (ProtocolStateMachine)eResolveProxy((InternalEObject)generalMachine);
			if (generalMachine != oldGeneralMachine) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2Package.PROTOCOL_CONFORMANCE__GENERAL_MACHINE, oldGeneralMachine, generalMachine));
			}
		}
		return generalMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>General Machine</b></em>' reference.
	 * <p>
	 * Subsets the following features:
	 * <ul>
	 *   <li>{@link org.eclipse.uml2.DirectedRelationship#getTargets}</li>
	 * </ul>
	 * </p>
	 * @generated
	 */
	public ProtocolStateMachine basicGetGeneralMachine() {
		return generalMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneralMachine(ProtocolStateMachine newGeneralMachine) {
		ProtocolStateMachine oldGeneralMachine = generalMachine;
		generalMachine = newGeneralMachine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.PROTOCOL_CONFORMANCE__GENERAL_MACHINE, oldGeneralMachine, generalMachine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Source</b></em>' reference list, a derived union.
	 * The list contents are of type {@link org.eclipse.uml2.Element}.
	 * @generated
	 */
	public EList getSources() {
		// TODO: test this union getter
		if (!getCacheAdapter().containsKey(this, UML2Package.eINSTANCE.getDirectedRelationship_Source())) {
			Set union = new LinkedHashSet();
			union.addAll(super.getSources());
			if (null != getSpecificMachine()) {
				union.add(getSpecificMachine());
			}
			getCacheAdapter().put(
				this,
				UML2Package.eINSTANCE.getDirectedRelationship_Source(),
				new EcoreEList.UnmodifiableEList(this, 
					UML2Package.eINSTANCE.getDirectedRelationship_Source(),
					union.size(),
					union.toArray()));
		}
		return (EList) getCacheAdapter().get(this, UML2Package.eINSTANCE.getDirectedRelationship_Source());
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
		if (null != getSpecificMachine()) {
			return (Element) getSpecificMachine();
		}
		return super.basicGetOwner();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Target</b></em>' reference list, a derived union.
	 * The list contents are of type {@link org.eclipse.uml2.Element}.
	 * @generated
	 */
	public EList getTargets() {
		// TODO: test this union getter
		if (!getCacheAdapter().containsKey(this, UML2Package.eINSTANCE.getDirectedRelationship_Target())) {
			Set union = new LinkedHashSet();
			union.addAll(super.getTargets());
			if (null != getGeneralMachine()) {
				union.add(getGeneralMachine());
			}
			getCacheAdapter().put(
				this,
				UML2Package.eINSTANCE.getDirectedRelationship_Target(),
				new EcoreEList.UnmodifiableEList(this, 
					UML2Package.eINSTANCE.getDirectedRelationship_Target(),
					union.size(),
					union.toArray()));
		}
		return (EList) getCacheAdapter().get(this, UML2Package.eINSTANCE.getDirectedRelationship_Target());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UML2Package.PROTOCOL_CONFORMANCE__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicAdd(otherEnd, msgs);
				case UML2Package.PROTOCOL_CONFORMANCE__SPECIFIC_MACHINE:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, UML2Package.PROTOCOL_CONFORMANCE__SPECIFIC_MACHINE, msgs);
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
				case UML2Package.PROTOCOL_CONFORMANCE__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
				case UML2Package.PROTOCOL_CONFORMANCE__OWNED_COMMENT:
					return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
				case UML2Package.PROTOCOL_CONFORMANCE__SPECIFIC_MACHINE:
					return eBasicSetContainer(null, UML2Package.PROTOCOL_CONFORMANCE__SPECIFIC_MACHINE, msgs);
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
				case UML2Package.PROTOCOL_CONFORMANCE__SPECIFIC_MACHINE:
					return eContainer.eInverseRemove(this, UML2Package.PROTOCOL_STATE_MACHINE__CONFORMANCE, ProtocolStateMachine.class, msgs);
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
		return eDynamicGet(eFeature, resolve);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(EStructuralFeature eFeature, Object newValue) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
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
		eDynamicSet(eFeature, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
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
		eDynamicUnset(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UML2Package.PROTOCOL_CONFORMANCE__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.PROTOCOL_CONFORMANCE__OWNED_ELEMENT:
				return !getOwnedElements().isEmpty();
			case UML2Package.PROTOCOL_CONFORMANCE__OWNER:
				return basicGetOwner() != null;
			case UML2Package.PROTOCOL_CONFORMANCE__OWNED_COMMENT:
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.PROTOCOL_CONFORMANCE__RELATED_ELEMENT:
				return !getRelatedElements().isEmpty();
			case UML2Package.PROTOCOL_CONFORMANCE__SOURCE:
				return !getSources().isEmpty();
			case UML2Package.PROTOCOL_CONFORMANCE__TARGET:
				return !getTargets().isEmpty();
			case UML2Package.PROTOCOL_CONFORMANCE__SPECIFIC_MACHINE:
				return getSpecificMachine() != null;
			case UML2Package.PROTOCOL_CONFORMANCE__GENERAL_MACHINE:
				return generalMachine != null;
		}
		return eDynamicIsSet(eFeature);
	}

} //ProtocolConformanceImpl
