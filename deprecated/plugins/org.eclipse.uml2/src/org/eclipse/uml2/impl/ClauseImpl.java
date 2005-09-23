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
 * $Id: ClauseImpl.java,v 1.7 2005/09/23 21:22:53 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.util.Collection;

import java.util.Iterator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.uml2.ActivityNode;
import org.eclipse.uml2.Clause;
import org.eclipse.uml2.OutputPin;
import org.eclipse.uml2.UML2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Clause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.ClauseImpl#getTests <em>Test</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClauseImpl#getBodies <em>Body</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClauseImpl#getPredecessorClauses <em>Predecessor Clause</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClauseImpl#getSuccessorClauses <em>Successor Clause</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClauseImpl#getDecider <em>Decider</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClauseImpl#getBodyOutputs <em>Body Output</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClauseImpl extends ElementImpl implements Clause {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getTests() <em>Test</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTests()
	 * @generated
	 * @ordered
	 */
	protected EList test = null;

	/**
	 * The cached value of the '{@link #getBodies() <em>Body</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodies()
	 * @generated
	 * @ordered
	 */
	protected EList body = null;

	/**
	 * The cached value of the '{@link #getPredecessorClauses() <em>Predecessor Clause</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredecessorClauses()
	 * @generated
	 * @ordered
	 */
	protected EList predecessorClause = null;

	/**
	 * The cached value of the '{@link #getSuccessorClauses() <em>Successor Clause</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccessorClauses()
	 * @generated
	 * @ordered
	 */
	protected EList successorClause = null;

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
	protected EList bodyOutput = null;

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
		return UML2Package.eINSTANCE.getClause();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getTests() {
		if (test == null) {
			test = new EObjectResolvingEList(ActivityNode.class, this, UML2Package.CLAUSE__TEST);
		}
		return test;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public ActivityNode getTest(String name) {
		for (Iterator i = getTests().iterator(); i.hasNext(); ) {
			ActivityNode test = (ActivityNode) i.next();
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
	public EList getBodies() {
		if (body == null) {
			body = new EObjectResolvingEList(ActivityNode.class, this, UML2Package.CLAUSE__BODY);
		}
		return body;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public ActivityNode getBody(String name) {
		for (Iterator i = getBodies().iterator(); i.hasNext(); ) {
			ActivityNode body = (ActivityNode) i.next();
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
	public EList getPredecessorClauses() {
		if (predecessorClause == null) {
			predecessorClause = new EObjectWithInverseResolvingEList.ManyInverse(Clause.class, this, UML2Package.CLAUSE__PREDECESSOR_CLAUSE, UML2Package.CLAUSE__SUCCESSOR_CLAUSE);
		}
		return predecessorClause;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSuccessorClauses() {
		if (successorClause == null) {
			successorClause = new EObjectWithInverseResolvingEList.ManyInverse(Clause.class, this, UML2Package.CLAUSE__SUCCESSOR_CLAUSE, UML2Package.CLAUSE__PREDECESSOR_CLAUSE);
		}
		return successorClause;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPin getDecider() {
		if (decider != null && decider.eIsProxy()) {
			OutputPin oldDecider = decider;
			decider = (OutputPin)eResolveProxy((InternalEObject)decider);
			if (decider != oldDecider) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2Package.CLAUSE__DECIDER, oldDecider, decider));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.CLAUSE__DECIDER, oldDecider, decider));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getBodyOutputs() {
		if (bodyOutput == null) {
			bodyOutput = new EObjectResolvingEList(OutputPin.class, this, UML2Package.CLAUSE__BODY_OUTPUT);
		}
		return bodyOutput;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public OutputPin getBodyOutput(String name) {
		for (Iterator i = getBodyOutputs().iterator(); i.hasNext(); ) {
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
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UML2Package.CLAUSE__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicAdd(otherEnd, msgs);
				case UML2Package.CLAUSE__PREDECESSOR_CLAUSE:
					return ((InternalEList)getPredecessorClauses()).basicAdd(otherEnd, msgs);
				case UML2Package.CLAUSE__SUCCESSOR_CLAUSE:
					return ((InternalEList)getSuccessorClauses()).basicAdd(otherEnd, msgs);
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
				case UML2Package.CLAUSE__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
				case UML2Package.CLAUSE__OWNED_COMMENT:
					return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
				case UML2Package.CLAUSE__PREDECESSOR_CLAUSE:
					return ((InternalEList)getPredecessorClauses()).basicRemove(otherEnd, msgs);
				case UML2Package.CLAUSE__SUCCESSOR_CLAUSE:
					return ((InternalEList)getSuccessorClauses()).basicRemove(otherEnd, msgs);
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
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UML2Package.CLAUSE__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.CLAUSE__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.CLAUSE__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.CLAUSE__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.CLAUSE__TEST:
				return getTests();
			case UML2Package.CLAUSE__BODY:
				return getBodies();
			case UML2Package.CLAUSE__PREDECESSOR_CLAUSE:
				return getPredecessorClauses();
			case UML2Package.CLAUSE__SUCCESSOR_CLAUSE:
				return getSuccessorClauses();
			case UML2Package.CLAUSE__DECIDER:
				if (resolve) return getDecider();
				return basicGetDecider();
			case UML2Package.CLAUSE__BODY_OUTPUT:
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
			case UML2Package.CLAUSE__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.CLAUSE__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.CLAUSE__TEST:
				getTests().clear();
				getTests().addAll((Collection)newValue);
				return;
			case UML2Package.CLAUSE__BODY:
				getBodies().clear();
				getBodies().addAll((Collection)newValue);
				return;
			case UML2Package.CLAUSE__PREDECESSOR_CLAUSE:
				getPredecessorClauses().clear();
				getPredecessorClauses().addAll((Collection)newValue);
				return;
			case UML2Package.CLAUSE__SUCCESSOR_CLAUSE:
				getSuccessorClauses().clear();
				getSuccessorClauses().addAll((Collection)newValue);
				return;
			case UML2Package.CLAUSE__DECIDER:
				setDecider((OutputPin)newValue);
				return;
			case UML2Package.CLAUSE__BODY_OUTPUT:
				getBodyOutputs().clear();
				getBodyOutputs().addAll((Collection)newValue);
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
			case UML2Package.CLAUSE__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.CLAUSE__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.CLAUSE__TEST:
				getTests().clear();
				return;
			case UML2Package.CLAUSE__BODY:
				getBodies().clear();
				return;
			case UML2Package.CLAUSE__PREDECESSOR_CLAUSE:
				getPredecessorClauses().clear();
				return;
			case UML2Package.CLAUSE__SUCCESSOR_CLAUSE:
				getSuccessorClauses().clear();
				return;
			case UML2Package.CLAUSE__DECIDER:
				setDecider((OutputPin)null);
				return;
			case UML2Package.CLAUSE__BODY_OUTPUT:
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
			case UML2Package.CLAUSE__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.CLAUSE__OWNED_ELEMENT:
				return eIsSet(UML2Package.eINSTANCE.getElement_OwnedComment());
			case UML2Package.CLAUSE__OWNER:
				return basicGetOwner() != null;
			case UML2Package.CLAUSE__OWNED_COMMENT:
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.CLAUSE__TEST:
				return test != null && !test.isEmpty();
			case UML2Package.CLAUSE__BODY:
				return body != null && !body.isEmpty();
			case UML2Package.CLAUSE__PREDECESSOR_CLAUSE:
				return predecessorClause != null && !predecessorClause.isEmpty();
			case UML2Package.CLAUSE__SUCCESSOR_CLAUSE:
				return successorClause != null && !successorClause.isEmpty();
			case UML2Package.CLAUSE__DECIDER:
				return decider != null;
			case UML2Package.CLAUSE__BODY_OUTPUT:
				return bodyOutput != null && !bodyOutput.isEmpty();
		}
		return eDynamicIsSet(eFeature);
	}


} //ClauseImpl
