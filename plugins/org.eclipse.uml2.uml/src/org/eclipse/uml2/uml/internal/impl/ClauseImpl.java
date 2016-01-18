/*
 * Copyright (c) 2005, 2016 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey - 286329, 323181
 *   Kenn Hussey (CEA) - 327039, 351774, 418466, 451350, 485756
 *
 */
package org.eclipse.uml2.uml.internal.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.uml.Clause;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.ExecutableNode;
import org.eclipse.uml2.uml.OutputPin;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;

import org.eclipse.uml2.uml.internal.operations.ClauseOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Clause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClauseImpl#getBodies <em>Body</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClauseImpl#getBodyOutputs <em>Body Output</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClauseImpl#getDecider <em>Decider</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClauseImpl#getPredecessorClauses <em>Predecessor Clause</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClauseImpl#getSuccessorClauses <em>Successor Clause</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClauseImpl#getTests <em>Test</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClauseImpl
		extends ElementImpl
		implements Clause {

	/**
	 * The cached value of the '{@link #getBodies() <em>Body</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodies()
	 * @generated
	 * @ordered
	 */
	protected EList<ExecutableNode> bodies;

	/**
	 * The cached value of the '{@link #getBodyOutputs() <em>Body Output</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodyOutputs()
	 * @generated
	 * @ordered
	 */
	protected EList<OutputPin> bodyOutputs;

	/**
	 * The cached value of the '{@link #getDecider() <em>Decider</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecider()
	 * @generated
	 * @ordered
	 */
	protected OutputPin decider;

	/**
	 * The cached value of the '{@link #getPredecessorClauses() <em>Predecessor Clause</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredecessorClauses()
	 * @generated
	 * @ordered
	 */
	protected EList<Clause> predecessorClauses;

	/**
	 * The cached value of the '{@link #getSuccessorClauses() <em>Successor Clause</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccessorClauses()
	 * @generated
	 * @ordered
	 */
	protected EList<Clause> successorClauses;

	/**
	 * The cached value of the '{@link #getTests() <em>Test</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTests()
	 * @generated
	 * @ordered
	 */
	protected EList<ExecutableNode> tests;

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
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.CLAUSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExecutableNode> getTests() {
		if (tests == null) {
			tests = new EObjectResolvingEList<ExecutableNode>(
				ExecutableNode.class, this, UMLPackage.CLAUSE__TEST);
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
	public ExecutableNode getTest(String name, boolean ignoreCase,
			EClass eClass) {
		testLoop : for (ExecutableNode test : getTests()) {
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
	public EList<ExecutableNode> getBodies() {
		if (bodies == null) {
			bodies = new EObjectResolvingEList<ExecutableNode>(
				ExecutableNode.class, this, UMLPackage.CLAUSE__BODY);
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
	public ExecutableNode getBody(String name, boolean ignoreCase,
			EClass eClass) {
		bodyLoop : for (ExecutableNode body : getBodies()) {
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
	public EList<Clause> getPredecessorClauses() {
		if (predecessorClauses == null) {
			predecessorClauses = new EObjectWithInverseResolvingEList.ManyInverse<Clause>(
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
	public EList<Clause> getSuccessorClauses() {
		if (successorClauses == null) {
			successorClauses = new EObjectWithInverseResolvingEList.ManyInverse<Clause>(
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
	public EList<OutputPin> getBodyOutputs() {
		if (bodyOutputs == null) {
			bodyOutputs = new EObjectResolvingEList<OutputPin>(OutputPin.class,
				this, UMLPackage.CLAUSE__BODY_OUTPUT);
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
		bodyOutputLoop : for (OutputPin bodyOutput : getBodyOutputs()) {
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
			Map<Object, Object> context) {
		return ClauseOperations.validateDeciderOutput(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestAndBody(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ClauseOperations.validateTestAndBody(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBodyOutputPins(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ClauseOperations.validateBodyOutputPins(this, diagnostics,
			context);
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
			case UMLPackage.CLAUSE__EANNOTATIONS :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getEAnnotations())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.CLAUSE__PREDECESSOR_CLAUSE :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getPredecessorClauses())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.CLAUSE__SUCCESSOR_CLAUSE :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getSuccessorClauses())
					.basicAdd(otherEnd, msgs);
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
			case UMLPackage.CLAUSE__EANNOTATIONS :
				return ((InternalEList<?>) getEAnnotations())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.CLAUSE__OWNED_COMMENT :
				return ((InternalEList<?>) getOwnedComments())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.CLAUSE__PREDECESSOR_CLAUSE :
				return ((InternalEList<?>) getPredecessorClauses())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.CLAUSE__SUCCESSOR_CLAUSE :
				return ((InternalEList<?>) getSuccessorClauses())
					.basicRemove(otherEnd, msgs);
		}
		return eDynamicInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.CLAUSE__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.CLAUSE__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.CLAUSE__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.CLAUSE__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.CLAUSE__BODY :
				return getBodies();
			case UMLPackage.CLAUSE__BODY_OUTPUT :
				return getBodyOutputs();
			case UMLPackage.CLAUSE__DECIDER :
				if (resolve)
					return getDecider();
				return basicGetDecider();
			case UMLPackage.CLAUSE__PREDECESSOR_CLAUSE :
				return getPredecessorClauses();
			case UMLPackage.CLAUSE__SUCCESSOR_CLAUSE :
				return getSuccessorClauses();
			case UMLPackage.CLAUSE__TEST :
				return getTests();
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
			case UMLPackage.CLAUSE__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations()
					.addAll((Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.CLAUSE__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments()
					.addAll((Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.CLAUSE__BODY :
				getBodies().clear();
				getBodies()
					.addAll((Collection<? extends ExecutableNode>) newValue);
				return;
			case UMLPackage.CLAUSE__BODY_OUTPUT :
				getBodyOutputs().clear();
				getBodyOutputs()
					.addAll((Collection<? extends OutputPin>) newValue);
				return;
			case UMLPackage.CLAUSE__DECIDER :
				setDecider((OutputPin) newValue);
				return;
			case UMLPackage.CLAUSE__PREDECESSOR_CLAUSE :
				getPredecessorClauses().clear();
				getPredecessorClauses()
					.addAll((Collection<? extends Clause>) newValue);
				return;
			case UMLPackage.CLAUSE__SUCCESSOR_CLAUSE :
				getSuccessorClauses().clear();
				getSuccessorClauses()
					.addAll((Collection<? extends Clause>) newValue);
				return;
			case UMLPackage.CLAUSE__TEST :
				getTests().clear();
				getTests()
					.addAll((Collection<? extends ExecutableNode>) newValue);
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
			case UMLPackage.CLAUSE__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.CLAUSE__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.CLAUSE__BODY :
				getBodies().clear();
				return;
			case UMLPackage.CLAUSE__BODY_OUTPUT :
				getBodyOutputs().clear();
				return;
			case UMLPackage.CLAUSE__DECIDER :
				setDecider((OutputPin) null);
				return;
			case UMLPackage.CLAUSE__PREDECESSOR_CLAUSE :
				getPredecessorClauses().clear();
				return;
			case UMLPackage.CLAUSE__SUCCESSOR_CLAUSE :
				getSuccessorClauses().clear();
				return;
			case UMLPackage.CLAUSE__TEST :
				getTests().clear();
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
			case UMLPackage.CLAUSE__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.CLAUSE__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.CLAUSE__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.CLAUSE__OWNER :
				return isSetOwner();
			case UMLPackage.CLAUSE__BODY :
				return bodies != null && !bodies.isEmpty();
			case UMLPackage.CLAUSE__BODY_OUTPUT :
				return bodyOutputs != null && !bodyOutputs.isEmpty();
			case UMLPackage.CLAUSE__DECIDER :
				return decider != null;
			case UMLPackage.CLAUSE__PREDECESSOR_CLAUSE :
				return predecessorClauses != null
					&& !predecessorClauses.isEmpty();
			case UMLPackage.CLAUSE__SUCCESSOR_CLAUSE :
				return successorClauses != null && !successorClauses.isEmpty();
			case UMLPackage.CLAUSE__TEST :
				return tests != null && !tests.isEmpty();
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments)
			throws InvocationTargetException {
		switch (operationID) {
			case UMLPackage.CLAUSE___GET_EANNOTATION__STRING :
				return getEAnnotation((String) arguments.get(0));
			case UMLPackage.CLAUSE___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP :
				return validateHasOwner((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.CLAUSE___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP :
				return validateNotOwnSelf((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.CLAUSE___ADD_KEYWORD__STRING :
				return addKeyword((String) arguments.get(0));
			case UMLPackage.CLAUSE___APPLY_STEREOTYPE__STEREOTYPE :
				return applyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.CLAUSE___CREATE_EANNOTATION__STRING :
				return createEAnnotation((String) arguments.get(0));
			case UMLPackage.CLAUSE___DESTROY :
				destroy();
				return null;
			case UMLPackage.CLAUSE___GET_KEYWORDS :
				return getKeywords();
			case UMLPackage.CLAUSE___GET_APPLICABLE_STEREOTYPE__STRING :
				return getApplicableStereotype((String) arguments.get(0));
			case UMLPackage.CLAUSE___GET_APPLICABLE_STEREOTYPES :
				return getApplicableStereotypes();
			case UMLPackage.CLAUSE___GET_APPLIED_STEREOTYPE__STRING :
				return getAppliedStereotype((String) arguments.get(0));
			case UMLPackage.CLAUSE___GET_APPLIED_STEREOTYPES :
				return getAppliedStereotypes();
			case UMLPackage.CLAUSE___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING :
				return getAppliedSubstereotype((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.CLAUSE___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE :
				return getAppliedSubstereotypes((Stereotype) arguments.get(0));
			case UMLPackage.CLAUSE___GET_MODEL :
				return getModel();
			case UMLPackage.CLAUSE___GET_NEAREST_PACKAGE :
				return getNearestPackage();
			case UMLPackage.CLAUSE___GET_RELATIONSHIPS :
				return getRelationships();
			case UMLPackage.CLAUSE___GET_RELATIONSHIPS__ECLASS :
				return getRelationships((EClass) arguments.get(0));
			case UMLPackage.CLAUSE___GET_REQUIRED_STEREOTYPE__STRING :
				return getRequiredStereotype((String) arguments.get(0));
			case UMLPackage.CLAUSE___GET_REQUIRED_STEREOTYPES :
				return getRequiredStereotypes();
			case UMLPackage.CLAUSE___GET_SOURCE_DIRECTED_RELATIONSHIPS :
				return getSourceDirectedRelationships();
			case UMLPackage.CLAUSE___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS :
				return getSourceDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.CLAUSE___GET_STEREOTYPE_APPLICATION__STEREOTYPE :
				return getStereotypeApplication((Stereotype) arguments.get(0));
			case UMLPackage.CLAUSE___GET_STEREOTYPE_APPLICATIONS :
				return getStereotypeApplications();
			case UMLPackage.CLAUSE___GET_TARGET_DIRECTED_RELATIONSHIPS :
				return getTargetDirectedRelationships();
			case UMLPackage.CLAUSE___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS :
				return getTargetDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.CLAUSE___GET_VALUE__STEREOTYPE_STRING :
				return getValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.CLAUSE___HAS_KEYWORD__STRING :
				return hasKeyword((String) arguments.get(0));
			case UMLPackage.CLAUSE___HAS_VALUE__STEREOTYPE_STRING :
				return hasValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.CLAUSE___IS_STEREOTYPE_APPLICABLE__STEREOTYPE :
				return isStereotypeApplicable((Stereotype) arguments.get(0));
			case UMLPackage.CLAUSE___IS_STEREOTYPE_APPLIED__STEREOTYPE :
				return isStereotypeApplied((Stereotype) arguments.get(0));
			case UMLPackage.CLAUSE___IS_STEREOTYPE_REQUIRED__STEREOTYPE :
				return isStereotypeRequired((Stereotype) arguments.get(0));
			case UMLPackage.CLAUSE___REMOVE_KEYWORD__STRING :
				return removeKeyword((String) arguments.get(0));
			case UMLPackage.CLAUSE___SET_VALUE__STEREOTYPE_STRING_OBJECT :
				setValue((Stereotype) arguments.get(0),
					(String) arguments.get(1), arguments.get(2));
				return null;
			case UMLPackage.CLAUSE___UNAPPLY_STEREOTYPE__STEREOTYPE :
				return unapplyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.CLAUSE___ALL_OWNED_ELEMENTS :
				return allOwnedElements();
			case UMLPackage.CLAUSE___MUST_BE_OWNED :
				return mustBeOwned();
			case UMLPackage.CLAUSE___VALIDATE_BODY_OUTPUT_PINS__DIAGNOSTICCHAIN_MAP :
				return validateBodyOutputPins(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.CLAUSE___VALIDATE_DECIDER_OUTPUT__DIAGNOSTICCHAIN_MAP :
				return validateDeciderOutput((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.CLAUSE___VALIDATE_TEST_AND_BODY__DIAGNOSTICCHAIN_MAP :
				return validateTestAndBody((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		}
		return eDynamicInvoke(operationID, arguments);
	}

} //ClauseImpl
