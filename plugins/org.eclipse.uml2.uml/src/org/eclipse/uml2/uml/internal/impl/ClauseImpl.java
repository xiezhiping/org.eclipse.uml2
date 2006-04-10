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
 * $Id: ClauseImpl.java,v 1.11 2006/04/10 19:16:18 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.uml.Clause;
import org.eclipse.uml2.uml.ExecutableNode;
import org.eclipse.uml2.uml.OutputPin;
import org.eclipse.uml2.uml.Type;
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
	 * The cached value of the '{@link #getTests() <em>Test</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTests()
	 * @generated
	 * @ordered
	 */
	protected EList tests = null;

	/**
	 * The cached value of the '{@link #getBodies() <em>Body</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodies()
	 * @generated
	 * @ordered
	 */
	protected EList bodies = null;

	/**
	 * The cached value of the '{@link #getPredecessorClauses() <em>Predecessor Clause</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredecessorClauses()
	 * @generated
	 * @ordered
	 */
	protected EList predecessorClauses = null;

	/**
	 * The cached value of the '{@link #getSuccessorClauses() <em>Successor Clause</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccessorClauses()
	 * @generated
	 * @ordered
	 */
	protected EList successorClauses = null;

	/**
	 * The cached value of the '{@link #getDecider() <em>Decider</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecider()
	 * @generated
	 * @ordered
	 */
	protected OutputPin decider = null;

	/**
	 * The cached value of the '{@link #getBodyOutputs() <em>Body Output</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodyOutputs()
	 * @generated
	 * @ordered
	 */
	protected EList bodyOutputs = null;

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
		return UMLPackage.Literals.CLAUSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getTests() {
		if (tests == null) {
			tests = new EObjectResolvingEList(ExecutableNode.class, this,
				UMLPackage.CLAUSE__TEST);
		}
		return tests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutableNode getTest(String name) {
		return getTest(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutableNode getTest(String name, boolean ignoreCase, EClass eClass) {
		testLoop : for (Iterator i = getTests().iterator(); i.hasNext();) {
			ExecutableNode test = (ExecutableNode) i.next();
			if (eClass != null && !eClass.isInstance(test))
				continue testLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(test.getName())
				: name.equals(test.getName())))
				continue testLoop;
			return test;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getBodies() {
		if (bodies == null) {
			bodies = new EObjectResolvingEList(ExecutableNode.class, this,
				UMLPackage.CLAUSE__BODY);
		}
		return bodies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutableNode getBody(String name) {
		return getBody(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutableNode getBody(String name, boolean ignoreCase, EClass eClass) {
		bodyLoop : for (Iterator i = getBodies().iterator(); i.hasNext();) {
			ExecutableNode body = (ExecutableNode) i.next();
			if (eClass != null && !eClass.isInstance(body))
				continue bodyLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(body.getName())
				: name.equals(body.getName())))
				continue bodyLoop;
			return body;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getPredecessorClauses() {
		if (predecessorClauses == null) {
			predecessorClauses = new EObjectWithInverseResolvingEList.ManyInverse(
				Clause.class, this, UMLPackage.CLAUSE__PREDECESSOR_CLAUSE,
				UMLPackage.CLAUSE__SUCCESSOR_CLAUSE);
		}
		return predecessorClauses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSuccessorClauses() {
		if (successorClauses == null) {
			successorClauses = new EObjectWithInverseResolvingEList.ManyInverse(
				Clause.class, this, UMLPackage.CLAUSE__SUCCESSOR_CLAUSE,
				UMLPackage.CLAUSE__PREDECESSOR_CLAUSE);
		}
		return successorClauses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPin getDecider() {
		if (decider != null && decider.eIsProxy()) {
			InternalEObject oldDecider = (InternalEObject) decider;
			decider = (OutputPin) eResolveProxy(oldDecider);
			if (decider != oldDecider) {
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
		return decider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecider(OutputPin newDecider) {
		OutputPin oldDecider = decider;
		decider = newDecider;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.CLAUSE__DECIDER, oldDecider, decider));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getBodyOutputs() {
		if (bodyOutputs == null) {
			bodyOutputs = new EObjectResolvingEList(OutputPin.class, this,
				UMLPackage.CLAUSE__BODY_OUTPUT);
		}
		return bodyOutputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPin getBodyOutput(String name, Type type) {
		return getBodyOutput(name, type, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPin getBodyOutput(String name, Type type, boolean ignoreCase) {
		bodyOutputLoop : for (Iterator i = getBodyOutputs().iterator(); i
			.hasNext();) {
			OutputPin bodyOutput = (OutputPin) i.next();
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(bodyOutput.getName())
				: name.equals(bodyOutput.getName())))
				continue bodyOutputLoop;
			if (type != null && !type.equals(bodyOutput.getType()))
				continue bodyOutputLoop;
			return bodyOutput;
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
	public boolean validateBodyOutputPins(DiagnosticChain diagnostics,
			Map context) {
		return ClauseOperations.validateBodyOutputPins(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.CLAUSE__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.CLAUSE__PREDECESSOR_CLAUSE :
				return ((InternalEList) getPredecessorClauses()).basicAdd(
					otherEnd, msgs);
			case UMLPackage.CLAUSE__SUCCESSOR_CLAUSE :
				return ((InternalEList) getSuccessorClauses()).basicAdd(
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
			case UMLPackage.CLAUSE__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.CLAUSE__OWNED_COMMENT :
				return ((InternalEList) getOwnedComments()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.CLAUSE__PREDECESSOR_CLAUSE :
				return ((InternalEList) getPredecessorClauses()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.CLAUSE__SUCCESSOR_CLAUSE :
				return ((InternalEList) getSuccessorClauses()).basicRemove(
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
		return eDynamicGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
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
		eDynamicSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
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
		eDynamicUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UMLPackage.CLAUSE__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.CLAUSE__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.CLAUSE__OWNER :
				return isSetOwner();
			case UMLPackage.CLAUSE__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.CLAUSE__TEST :
				return tests != null && !tests.isEmpty();
			case UMLPackage.CLAUSE__BODY :
				return bodies != null && !bodies.isEmpty();
			case UMLPackage.CLAUSE__PREDECESSOR_CLAUSE :
				return predecessorClauses != null
					&& !predecessorClauses.isEmpty();
			case UMLPackage.CLAUSE__SUCCESSOR_CLAUSE :
				return successorClauses != null && !successorClauses.isEmpty();
			case UMLPackage.CLAUSE__DECIDER :
				return decider != null;
			case UMLPackage.CLAUSE__BODY_OUTPUT :
				return bodyOutputs != null && !bodyOutputs.isEmpty();
		}
		return eDynamicIsSet(featureID);
	}

} //ClauseImpl
