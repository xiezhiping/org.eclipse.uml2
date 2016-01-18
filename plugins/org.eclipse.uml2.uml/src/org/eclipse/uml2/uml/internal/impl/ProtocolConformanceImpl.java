/*
 * Copyright (c) 2005, 2016 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 327039, 351774, 418466, 451350, 485756
 *
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.Comment;
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
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ProtocolConformanceImpl#getTargets <em>Target</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ProtocolConformanceImpl#getSources <em>Source</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ProtocolConformanceImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ProtocolConformanceImpl#getGeneralMachine <em>General Machine</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ProtocolConformanceImpl#getSpecificMachine <em>Specific Machine</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProtocolConformanceImpl
		extends DirectedRelationshipImpl
		implements ProtocolConformance {

	/**
	 * The cached value of the '{@link #getGeneralMachine() <em>General Machine</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralMachine()
	 * @generated
	 * @ordered
	 */
	protected ProtocolStateMachine generalMachine;

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
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.PROTOCOL_CONFORMANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Element> getTargets() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			@SuppressWarnings("unchecked")
			EList<Element> targets = (EList<Element>) cache.get(eResource, this,
				UMLPackage.Literals.DIRECTED_RELATIONSHIP__TARGET);
			if (targets == null) {
				cache.put(eResource, this,
					UMLPackage.Literals.DIRECTED_RELATIONSHIP__TARGET,
					targets = new DerivedUnionEObjectEList<Element>(
						Element.class, this,
						UMLPackage.PROTOCOL_CONFORMANCE__TARGET,
						TARGET_ESUBSETS));
			}
			return targets;
		}
		return new DerivedUnionEObjectEList<Element>(Element.class, this,
			UMLPackage.PROTOCOL_CONFORMANCE__TARGET, TARGET_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Element> getSources() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			@SuppressWarnings("unchecked")
			EList<Element> sources = (EList<Element>) cache.get(eResource, this,
				UMLPackage.Literals.DIRECTED_RELATIONSHIP__SOURCE);
			if (sources == null) {
				cache.put(eResource, this,
					UMLPackage.Literals.DIRECTED_RELATIONSHIP__SOURCE,
					sources = new DerivedUnionEObjectEList<Element>(
						Element.class, this,
						UMLPackage.PROTOCOL_CONFORMANCE__SOURCE,
						SOURCE_ESUBSETS));
			}
			return sources;
		}
		return new DerivedUnionEObjectEList<Element>(Element.class, this,
			UMLPackage.PROTOCOL_CONFORMANCE__SOURCE, SOURCE_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolStateMachine getGeneralMachine() {
		if (generalMachine != null && generalMachine.eIsProxy()) {
			InternalEObject oldGeneralMachine = (InternalEObject) generalMachine;
			generalMachine = (ProtocolStateMachine) eResolveProxy(
				oldGeneralMachine);
			if (generalMachine != oldGeneralMachine) {
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
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.PROTOCOL_CONFORMANCE__GENERAL_MACHINE,
				oldGeneralMachine, generalMachine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolStateMachine getSpecificMachine() {
		if (eContainerFeatureID() != UMLPackage.PROTOCOL_CONFORMANCE__SPECIFIC_MACHINE)
			return null;
		return (ProtocolStateMachine) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolStateMachine basicGetSpecificMachine() {
		if (eContainerFeatureID() != UMLPackage.PROTOCOL_CONFORMANCE__SPECIFIC_MACHINE)
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
			|| (eContainerFeatureID() != UMLPackage.PROTOCOL_CONFORMANCE__SPECIFIC_MACHINE
				&& newSpecificMachine != null)) {
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
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.PROTOCOL_CONFORMANCE__EANNOTATIONS :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getEAnnotations())
					.basicAdd(otherEnd, msgs);
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
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.PROTOCOL_CONFORMANCE__EANNOTATIONS :
				return ((InternalEList<?>) getEAnnotations())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.PROTOCOL_CONFORMANCE__OWNED_COMMENT :
				return ((InternalEList<?>) getOwnedComments())
					.basicRemove(otherEnd, msgs);
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
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(
			NotificationChain msgs) {
		switch (eContainerFeatureID()) {
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.PROTOCOL_CONFORMANCE__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.PROTOCOL_CONFORMANCE__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.PROTOCOL_CONFORMANCE__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.PROTOCOL_CONFORMANCE__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UMLPackage.PROTOCOL_CONFORMANCE__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations()
					.addAll((Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.PROTOCOL_CONFORMANCE__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments()
					.addAll((Collection<? extends Comment>) newValue);
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
	@Override
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
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UMLPackage.PROTOCOL_CONFORMANCE__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.PROTOCOL_CONFORMANCE__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.PROTOCOL_CONFORMANCE__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.PROTOCOL_CONFORMANCE__OWNER :
				return isSetOwner();
			case UMLPackage.PROTOCOL_CONFORMANCE__RELATED_ELEMENT :
				return isSetRelatedElements();
			case UMLPackage.PROTOCOL_CONFORMANCE__SOURCE :
				return isSetSources();
			case UMLPackage.PROTOCOL_CONFORMANCE__TARGET :
				return isSetTargets();
			case UMLPackage.PROTOCOL_CONFORMANCE__GENERAL_MACHINE :
				return generalMachine != null;
			case UMLPackage.PROTOCOL_CONFORMANCE__SPECIFIC_MACHINE :
				return basicGetSpecificMachine() != null;
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getTargets() <em>Target</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargets()
	 * @generated
	 * @ordered
	 */
	protected static final int[] TARGET_ESUBSETS = new int[]{
		UMLPackage.PROTOCOL_CONFORMANCE__GENERAL_MACHINE};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetTargets() {
		return super.isSetTargets()
			|| eIsSet(UMLPackage.PROTOCOL_CONFORMANCE__GENERAL_MACHINE);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getSources() <em>Source</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSources()
	 * @generated
	 * @ordered
	 */
	protected static final int[] SOURCE_ESUBSETS = new int[]{
		UMLPackage.PROTOCOL_CONFORMANCE__SPECIFIC_MACHINE};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element getOwner() {
		Element owner = basicGetOwner();
		return owner != null && owner.eIsProxy()
			? (Element) eResolveProxy((InternalEObject) owner)
			: owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetSources() {
		return super.isSetSources()
			|| eIsSet(UMLPackage.PROTOCOL_CONFORMANCE__SPECIFIC_MACHINE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	@Override
	public boolean isSetOwner() {
		return super.isSetOwner()
			|| eIsSet(UMLPackage.PROTOCOL_CONFORMANCE__SPECIFIC_MACHINE);
	}

} //ProtocolConformanceImpl
