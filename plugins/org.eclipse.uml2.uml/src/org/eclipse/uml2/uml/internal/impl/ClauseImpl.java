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
 * $Id: ClauseImpl.java,v 1.1 2005/11/14 22:26:05 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.uml.Clause;
import org.eclipse.uml2.uml.ExecutableNode;
import org.eclipse.uml2.uml.OutputPin;
import org.eclipse.uml2.uml.UMLPackage;

import org.eclipse.uml2.uml.internal.operations.ClauseOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Clause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClauseImpl#getTests <em>Test</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClauseImpl#getBodies <em>Body</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClauseImpl#getPredecessorClauses <em>Predecessor Clause</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClauseImpl#getSuccessorClauses <em>Successor Clause</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClauseImpl#getDecider <em>Decider</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClauseImpl#getBodyOutputs <em>Body Output</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClauseImpl
		extends ElementImpl
		implements Clause {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClauseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.eINSTANCE.getClause();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getTests() {
		List test = (List) eVirtualGet(UMLPackage.CLAUSE__TEST);
		if (test == null) {
			eVirtualSet(UMLPackage.CLAUSE__TEST,
				test = new EObjectResolvingEList(ExecutableNode.class, this,
					UMLPackage.CLAUSE__TEST));
		}
		return test;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutableNode getTest(String name) {
		for (Iterator i = getTests().iterator(); i.hasNext();) {
			ExecutableNode test = (ExecutableNode) i.next();
			if (name.equals(test.getName())) {
				return test;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getBodies() {
		List body = (List) eVirtualGet(UMLPackage.CLAUSE__BODY);
		if (body == null) {
			eVirtualSet(UMLPackage.CLAUSE__BODY,
				body = new EObjectResolvingEList(ExecutableNode.class, this,
					UMLPackage.CLAUSE__BODY));
		}
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutableNode getBody(String name) {
		for (Iterator i = getBodies().iterator(); i.hasNext();) {
			ExecutableNode body = (ExecutableNode) i.next();
			if (name.equals(body.getName())) {
				return body;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getPredecessorClauses() {
		List predecessorClause = (List) eVirtualGet(UMLPackage.CLAUSE__PREDECESSOR_CLAUSE);
		if (predecessorClause == null) {
			eVirtualSet(
				UMLPackage.CLAUSE__PREDECESSOR_CLAUSE,
				predecessorClause = new EObjectWithInverseResolvingEList.ManyInverse(
					Clause.class, this, UMLPackage.CLAUSE__PREDECESSOR_CLAUSE,
					UMLPackage.CLAUSE__SUCCESSOR_CLAUSE));
		}
		return predecessorClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getSuccessorClauses() {
		List successorClause = (List) eVirtualGet(UMLPackage.CLAUSE__SUCCESSOR_CLAUSE);
		if (successorClause == null) {
			eVirtualSet(
				UMLPackage.CLAUSE__SUCCESSOR_CLAUSE,
				successorClause = new EObjectWithInverseResolvingEList.ManyInverse(
					Clause.class, this, UMLPackage.CLAUSE__SUCCESSOR_CLAUSE,
					UMLPackage.CLAUSE__PREDECESSOR_CLAUSE));
		}
		return successorClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPin getDecider() {
		OutputPin decider = (OutputPin) eVirtualGet(UMLPackage.CLAUSE__DECIDER);
		if (decider != null && decider.eIsProxy()) {
			OutputPin oldDecider = decider;
			decider = (OutputPin) eResolveProxy((InternalEObject) decider);
			if (decider != oldDecider) {
				eVirtualSet(UMLPackage.CLAUSE__DECIDER, decider);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.CLAUSE__DECIDER, oldDecider, decider));
			}
		}
		return decider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPin basicGetDecider() {
		return (OutputPin) eVirtualGet(UMLPackage.CLAUSE__DECIDER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecider(OutputPin newDecider) {
		OutputPin decider = newDecider;
		Object oldDecider = eVirtualSet(UMLPackage.CLAUSE__DECIDER, decider);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.CLAUSE__DECIDER, oldDecider == EVIRTUAL_NO_VALUE
					? null
					: oldDecider, decider));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getBodyOutputs() {
		List bodyOutput = (List) eVirtualGet(UMLPackage.CLAUSE__BODY_OUTPUT);
		if (bodyOutput == null) {
			eVirtualSet(UMLPackage.CLAUSE__BODY_OUTPUT,
				bodyOutput = new EObjectResolvingEList(OutputPin.class, this,
					UMLPackage.CLAUSE__BODY_OUTPUT));
		}
		return bodyOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPin getBodyOutput(String name) {
		for (Iterator i = getBodyOutputs().iterator(); i.hasNext();) {
			OutputPin bodyOutput = (OutputPin) i.next();
			if (name.equals(bodyOutput.getName())) {
				return bodyOutput;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeciderOutput(DiagnosticChain diagnostics,
			Map context) {
		return ClauseOperations.validateDeciderOutput(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBodyOutput(DiagnosticChain diagnostics, Map context) {
		return ClauseOperations.validateBodyOutput(this, diagnostics, context);
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
				case UMLPackage.CLAUSE__EANNOTATIONS :
					return ((InternalEList) getEAnnotations()).basicAdd(
						otherEnd, msgs);
				case UMLPackage.CLAUSE__PREDECESSOR_CLAUSE :
					return ((InternalEList) getPredecessorClauses()).basicAdd(
						otherEnd, msgs);
				case UMLPackage.CLAUSE__SUCCESSOR_CLAUSE :
					return ((InternalEList) getSuccessorClauses()).basicAdd(
						otherEnd, msgs);
				default :
					return eDynamicInverseAdd(otherEnd, featureID, baseClass,
						msgs);
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UMLPackage.CLAUSE__EANNOTATIONS :
					return ((InternalEList) getEAnnotations()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.CLAUSE__OWNED_COMMENT :
					return ((InternalEList) getOwnedComments()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.CLAUSE__PREDECESSOR_CLAUSE :
					return ((InternalEList) getPredecessorClauses())
						.basicRemove(otherEnd, msgs);
				case UMLPackage.CLAUSE__SUCCESSOR_CLAUSE :
					return ((InternalEList) getSuccessorClauses()).basicRemove(
						otherEnd, msgs);
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
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UMLPackage.CLAUSE__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.CLAUSE__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.CLAUSE__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.CLAUSE__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.CLAUSE__TEST :
				return getTests();
			case UMLPackage.CLAUSE__BODY :
				return getBodies();
			case UMLPackage.CLAUSE__PREDECESSOR_CLAUSE :
				return getPredecessorClauses();
			case UMLPackage.CLAUSE__SUCCESSOR_CLAUSE :
				return getSuccessorClauses();
			case UMLPackage.CLAUSE__DECIDER :
				if (resolve)
					return getDecider();
				return basicGetDecider();
			case UMLPackage.CLAUSE__BODY_OUTPUT :
				return getBodyOutputs();
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
			case UMLPackage.CLAUSE__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.CLAUSE__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.CLAUSE__TEST :
				getTests().clear();
				getTests().addAll((Collection) newValue);
				return;
			case UMLPackage.CLAUSE__BODY :
				getBodies().clear();
				getBodies().addAll((Collection) newValue);
				return;
			case UMLPackage.CLAUSE__PREDECESSOR_CLAUSE :
				getPredecessorClauses().clear();
				getPredecessorClauses().addAll((Collection) newValue);
				return;
			case UMLPackage.CLAUSE__SUCCESSOR_CLAUSE :
				getSuccessorClauses().clear();
				getSuccessorClauses().addAll((Collection) newValue);
				return;
			case UMLPackage.CLAUSE__DECIDER :
				setDecider((OutputPin) newValue);
				return;
			case UMLPackage.CLAUSE__BODY_OUTPUT :
				getBodyOutputs().clear();
				getBodyOutputs().addAll((Collection) newValue);
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
			case UMLPackage.CLAUSE__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.CLAUSE__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.CLAUSE__TEST :
				getTests().clear();
				return;
			case UMLPackage.CLAUSE__BODY :
				getBodies().clear();
				return;
			case UMLPackage.CLAUSE__PREDECESSOR_CLAUSE :
				getPredecessorClauses().clear();
				return;
			case UMLPackage.CLAUSE__SUCCESSOR_CLAUSE :
				getSuccessorClauses().clear();
				return;
			case UMLPackage.CLAUSE__DECIDER :
				setDecider((OutputPin) null);
				return;
			case UMLPackage.CLAUSE__BODY_OUTPUT :
				getBodyOutputs().clear();
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
			case UMLPackage.CLAUSE__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.CLAUSE__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.CLAUSE__OWNER :
				return isSetOwner();
			case UMLPackage.CLAUSE__OWNED_COMMENT :
				List ownedComment = (List) eVirtualGet(UMLPackage.CLAUSE__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.CLAUSE__TEST :
				List test = (List) eVirtualGet(UMLPackage.CLAUSE__TEST);
				return test != null && !test.isEmpty();
			case UMLPackage.CLAUSE__BODY :
				List body = (List) eVirtualGet(UMLPackage.CLAUSE__BODY);
				return body != null && !body.isEmpty();
			case UMLPackage.CLAUSE__PREDECESSOR_CLAUSE :
				List predecessorClause = (List) eVirtualGet(UMLPackage.CLAUSE__PREDECESSOR_CLAUSE);
				return predecessorClause != null
					&& !predecessorClause.isEmpty();
			case UMLPackage.CLAUSE__SUCCESSOR_CLAUSE :
				List successorClause = (List) eVirtualGet(UMLPackage.CLAUSE__SUCCESSOR_CLAUSE);
				return successorClause != null && !successorClause.isEmpty();
			case UMLPackage.CLAUSE__DECIDER :
				return eVirtualGet(UMLPackage.CLAUSE__DECIDER) != null;
			case UMLPackage.CLAUSE__BODY_OUTPUT :
				List bodyOutput = (List) eVirtualGet(UMLPackage.CLAUSE__BODY_OUTPUT);
				return bodyOutput != null && !bodyOutput.isEmpty();
		}
		return eDynamicIsSet(eFeature);
	}

} //ClauseImpl
