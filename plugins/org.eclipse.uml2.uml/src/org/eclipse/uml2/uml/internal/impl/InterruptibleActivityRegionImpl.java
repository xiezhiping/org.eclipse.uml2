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
 * $Id: InterruptibleActivityRegionImpl.java,v 1.11 2006/02/22 20:48:16 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.ActivityEdge;
import org.eclipse.uml2.uml.ActivityNode;
import org.eclipse.uml2.uml.InterruptibleActivityRegion;
import org.eclipse.uml2.uml.UMLPackage;

import org.eclipse.uml2.uml.internal.operations.InterruptibleActivityRegionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interruptible Activity Region</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InterruptibleActivityRegionImpl#getContainedNodes <em>Contained Node</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InterruptibleActivityRegionImpl#getNodes <em>Node</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InterruptibleActivityRegionImpl#getInterruptingEdges <em>Interrupting Edge</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InterruptibleActivityRegionImpl
		extends ActivityGroupImpl
		implements InterruptibleActivityRegion {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterruptibleActivityRegionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.Literals.INTERRUPTIBLE_ACTIVITY_REGION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getContainedNodes() {
		EList containedNode = (EList) eVirtualGet(UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__CONTAINED_NODE);
		if (containedNode == null) {
			eVirtualSet(
				UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__CONTAINED_NODE,
				containedNode = new DerivedUnionEObjectEList(
					ActivityNode.class, this,
					UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__CONTAINED_NODE,
					new int[]{UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__NODE}));
		}
		return containedNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getNodes() {
		EList node = (EList) eVirtualGet(UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__NODE);
		if (node == null) {
			eVirtualSet(UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__NODE,
				node = new EObjectWithInverseResolvingEList.ManyInverse(
					ActivityNode.class, this,
					UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__NODE,
					UMLPackage.ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION));
		}
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNode getNode(String name) {
		return getNode(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNode getNode(String name, boolean ignoreCase, EClass eClass) {
		nodeLoop : for (Iterator i = getNodes().iterator(); i.hasNext();) {
			ActivityNode node = (ActivityNode) i.next();
			if (eClass != null && !eClass.isInstance(node))
				continue nodeLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(node.getName())
				: name.equals(node.getName())))
				continue nodeLoop;
			return node;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getInterruptingEdges() {
		EList interruptingEdge = (EList) eVirtualGet(UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__INTERRUPTING_EDGE);
		if (interruptingEdge == null) {
			eVirtualSet(
				UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__INTERRUPTING_EDGE,
				interruptingEdge = new EObjectWithInverseResolvingEList(
					ActivityEdge.class,
					this,
					UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__INTERRUPTING_EDGE,
					UMLPackage.ACTIVITY_EDGE__INTERRUPTS));
		}
		return interruptingEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityEdge getInterruptingEdge(String name) {
		return getInterruptingEdge(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityEdge getInterruptingEdge(String name, boolean ignoreCase,
			EClass eClass) {
		interruptingEdgeLoop : for (Iterator i = getInterruptingEdges()
			.iterator(); i.hasNext();) {
			ActivityEdge interruptingEdge = (ActivityEdge) i.next();
			if (eClass != null && !eClass.isInstance(interruptingEdge))
				continue interruptingEdgeLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(interruptingEdge.getName())
				: name.equals(interruptingEdge.getName())))
				continue interruptingEdgeLoop;
			return interruptingEdge;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterruptingEdges(DiagnosticChain diagnostics,
			Map context) {
		return InterruptibleActivityRegionOperations.validateInterruptingEdges(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__IN_ACTIVITY :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd,
					UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__IN_ACTIVITY, msgs);
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__NODE :
				return ((InternalEList) getNodes()).basicAdd(otherEnd, msgs);
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__INTERRUPTING_EDGE :
				return ((InternalEList) getInterruptingEdges()).basicAdd(
					otherEnd, msgs);
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
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__OWNED_COMMENT :
				return ((InternalEList) getOwnedComments()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__IN_ACTIVITY :
				return eBasicSetContainer(null,
					UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__IN_ACTIVITY, msgs);
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__NODE :
				return ((InternalEList) getNodes()).basicRemove(otherEnd, msgs);
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__INTERRUPTING_EDGE :
				return ((InternalEList) getInterruptingEdges()).basicRemove(
					otherEnd, msgs);
		}
		return eDynamicInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__SUBGROUP :
				return getSubgroups();
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__SUPER_GROUP :
				return getSuperGroup();
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__IN_ACTIVITY :
				return getInActivity();
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__CONTAINED_EDGE :
				return getContainedEdges();
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__CONTAINED_NODE :
				return getContainedNodes();
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__NODE :
				return getNodes();
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__INTERRUPTING_EDGE :
				return getInterruptingEdges();
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
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__IN_ACTIVITY :
				setInActivity((Activity) newValue);
				return;
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__NODE :
				getNodes().clear();
				getNodes().addAll((Collection) newValue);
				return;
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__INTERRUPTING_EDGE :
				getInterruptingEdges().clear();
				getInterruptingEdges().addAll((Collection) newValue);
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
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__IN_ACTIVITY :
				setInActivity((Activity) null);
				return;
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__NODE :
				getNodes().clear();
				return;
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__INTERRUPTING_EDGE :
				getInterruptingEdges().clear();
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
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__EANNOTATIONS :
				EList eAnnotations = (EList) eVirtualGet(UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__EANNOTATIONS);
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__OWNER :
				return isSetOwner();
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__OWNED_COMMENT :
				EList ownedComment = (EList) eVirtualGet(UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__SUBGROUP :
				return isSetSubgroups();
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__SUPER_GROUP :
				return isSetSuperGroup();
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__IN_ACTIVITY :
				return getInActivity() != null;
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__CONTAINED_EDGE :
				return isSetContainedEdges();
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__CONTAINED_NODE :
				return isSetContainedNodes();
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__NODE :
				EList node = (EList) eVirtualGet(UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__NODE);
				return node != null && !node.isEmpty();
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__INTERRUPTING_EDGE :
				EList interruptingEdge = (EList) eVirtualGet(UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__INTERRUPTING_EDGE);
				return interruptingEdge != null && !interruptingEdge.isEmpty();
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetContainedNodes() {
		return super.isSetContainedNodes()
			|| eIsSet(UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__NODE);
	}

} //InterruptibleActivityRegionImpl
