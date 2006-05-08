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
 * $Id: LoopNodeImpl.java,v 1.22 2006/05/08 17:46:11 khussey Exp $
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

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.ExecutableNode;
import org.eclipse.uml2.uml.InputPin;
import org.eclipse.uml2.uml.LoopNode;
import org.eclipse.uml2.uml.OutputPin;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.StructuredActivityNode;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.LoopNodeOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Loop Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.LoopNodeImpl#isTestedFirst <em>Is Tested First</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.LoopNodeImpl#getBodyParts <em>Body Part</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.LoopNodeImpl#getSetupParts <em>Setup Part</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.LoopNodeImpl#getDecider <em>Decider</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.LoopNodeImpl#getTests <em>Test</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.LoopNodeImpl#getResults <em>Result</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.LoopNodeImpl#getLoopVariables <em>Loop Variable</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.LoopNodeImpl#getBodyOutputs <em>Body Output</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.LoopNodeImpl#getLoopVariableInputs <em>Loop Variable Input</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LoopNodeImpl
		extends StructuredActivityNodeImpl
		implements LoopNode {

	/**
	 * The default value of the '{@link #isTestedFirst() <em>Is Tested First</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTestedFirst()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_TESTED_FIRST_EDEFAULT = false;

	/**
	 * The flag representing the value of the '{@link #isTestedFirst() <em>Is Tested First</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTestedFirst()
	 * @generated
	 * @ordered
	 */
	protected static final int IS_TESTED_FIRST_EFLAG = 1 << 12;

	/**
	 * The cached value of the '{@link #getBodyParts() <em>Body Part</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodyParts()
	 * @generated
	 * @ordered
	 */
	protected EList bodyParts = null;

	/**
	 * The cached value of the '{@link #getSetupParts() <em>Setup Part</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetupParts()
	 * @generated
	 * @ordered
	 */
	protected EList setupParts = null;

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
	 * The cached value of the '{@link #getTests() <em>Test</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTests()
	 * @generated
	 * @ordered
	 */
	protected EList tests = null;

	/**
	 * The cached value of the '{@link #getResults() <em>Result</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResults()
	 * @generated
	 * @ordered
	 */
	protected EList results = null;

	/**
	 * The cached value of the '{@link #getLoopVariables() <em>Loop Variable</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoopVariables()
	 * @generated
	 * @ordered
	 */
	protected EList loopVariables = null;

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
	 * The cached value of the '{@link #getLoopVariableInputs() <em>Loop Variable Input</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoopVariableInputs()
	 * @generated
	 * @ordered
	 */
	protected EList loopVariableInputs = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoopNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.Literals.LOOP_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOutputs() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			EList outputs = (EList) cache.get(eResource, this,
				UMLPackage.Literals.ACTION__OUTPUT);
			if (outputs == null) {
				cache.put(eResource, this, UMLPackage.Literals.ACTION__OUTPUT,
					outputs = new DerivedUnionEObjectEList(OutputPin.class,
						this, UMLPackage.LOOP_NODE__OUTPUT, OUTPUT_ESUBSETS));
			}
			return outputs;
		}
		return new DerivedUnionEObjectEList(OutputPin.class, this,
			UMLPackage.LOOP_NODE__OUTPUT, OUTPUT_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getInputs() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			EList inputs = (EList) cache.get(eResource, this,
				UMLPackage.Literals.ACTION__INPUT);
			if (inputs == null) {
				cache.put(eResource, this, UMLPackage.Literals.ACTION__INPUT,
					inputs = new DerivedUnionEObjectEList(InputPin.class, this,
						UMLPackage.LOOP_NODE__INPUT, INPUT_ESUBSETS));
			}
			return inputs;
		}
		return new DerivedUnionEObjectEList(InputPin.class, this,
			UMLPackage.LOOP_NODE__INPUT, INPUT_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTestedFirst() {
		return (eFlags & IS_TESTED_FIRST_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsTestedFirst(boolean newIsTestedFirst) {
		boolean oldIsTestedFirst = (eFlags & IS_TESTED_FIRST_EFLAG) != 0;
		if (newIsTestedFirst)
			eFlags |= IS_TESTED_FIRST_EFLAG;
		else
			eFlags &= ~IS_TESTED_FIRST_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.LOOP_NODE__IS_TESTED_FIRST, oldIsTestedFirst,
				newIsTestedFirst));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getBodyParts() {
		if (bodyParts == null) {
			bodyParts = new EObjectResolvingEList(ExecutableNode.class, this,
				UMLPackage.LOOP_NODE__BODY_PART);
		}
		return bodyParts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutableNode getBodyPart(String name) {
		return getBodyPart(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutableNode getBodyPart(String name, boolean ignoreCase,
			EClass eClass) {
		bodyPartLoop : for (Iterator i = getBodyParts().iterator(); i.hasNext();) {
			ExecutableNode bodyPart = (ExecutableNode) i.next();
			if (eClass != null && !eClass.isInstance(bodyPart))
				continue bodyPartLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(bodyPart.getName())
				: name.equals(bodyPart.getName())))
				continue bodyPartLoop;
			return bodyPart;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSetupParts() {
		if (setupParts == null) {
			setupParts = new EObjectResolvingEList(ExecutableNode.class, this,
				UMLPackage.LOOP_NODE__SETUP_PART);
		}
		return setupParts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutableNode getSetupPart(String name) {
		return getSetupPart(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutableNode getSetupPart(String name, boolean ignoreCase,
			EClass eClass) {
		setupPartLoop : for (Iterator i = getSetupParts().iterator(); i
			.hasNext();) {
			ExecutableNode setupPart = (ExecutableNode) i.next();
			if (eClass != null && !eClass.isInstance(setupPart))
				continue setupPartLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(setupPart.getName())
				: name.equals(setupPart.getName())))
				continue setupPartLoop;
			return setupPart;
		}
		return null;
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
						UMLPackage.LOOP_NODE__DECIDER, oldDecider, decider));
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
				UMLPackage.LOOP_NODE__DECIDER, oldDecider, decider));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getTests() {
		if (tests == null) {
			tests = new EObjectResolvingEList(ExecutableNode.class, this,
				UMLPackage.LOOP_NODE__TEST);
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
	public EList getResults() {
		if (results == null) {
			results = new EObjectContainmentEList.Resolving(OutputPin.class,
				this, UMLPackage.LOOP_NODE__RESULT);
		}
		return results;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPin createResult(String name, Type type) {
		OutputPin newResult = (OutputPin) create(UMLPackage.Literals.OUTPUT_PIN);
		getResults().add(newResult);
		if (name != null)
			newResult.setName(name);
		if (type != null)
			newResult.setType(type);
		return newResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPin getResult(String name, Type type) {
		return getResult(name, type, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPin getResult(String name, Type type, boolean ignoreCase,
			boolean createOnDemand) {
		resultLoop : for (Iterator i = getResults().iterator(); i.hasNext();) {
			OutputPin result = (OutputPin) i.next();
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(result.getName())
				: name.equals(result.getName())))
				continue resultLoop;
			if (type != null && !type.equals(result.getType()))
				continue resultLoop;
			return result;
		}
		return createOnDemand
			? createResult(name, type)
			: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getLoopVariables() {
		if (loopVariables == null) {
			loopVariables = new EObjectResolvingEList(OutputPin.class, this,
				UMLPackage.LOOP_NODE__LOOP_VARIABLE);
		}
		return loopVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPin getLoopVariable(String name, Type type) {
		return getLoopVariable(name, type, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPin getLoopVariable(String name, Type type, boolean ignoreCase) {
		loopVariableLoop : for (Iterator i = getLoopVariables().iterator(); i
			.hasNext();) {
			OutputPin loopVariable = (OutputPin) i.next();
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(loopVariable.getName())
				: name.equals(loopVariable.getName())))
				continue loopVariableLoop;
			if (type != null && !type.equals(loopVariable.getType()))
				continue loopVariableLoop;
			return loopVariable;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getBodyOutputs() {
		if (bodyOutputs == null) {
			bodyOutputs = new EObjectResolvingEList(OutputPin.class, this,
				UMLPackage.LOOP_NODE__BODY_OUTPUT);
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
	public EList getLoopVariableInputs() {
		if (loopVariableInputs == null) {
			loopVariableInputs = new EObjectContainmentEList.Resolving(
				InputPin.class, this, UMLPackage.LOOP_NODE__LOOP_VARIABLE_INPUT);
		}
		return loopVariableInputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin createLoopVariableInput(String name, Type type,
			EClass eClass) {
		InputPin newLoopVariableInput = (InputPin) create(eClass);
		getLoopVariableInputs().add(newLoopVariableInput);
		if (name != null)
			newLoopVariableInput.setName(name);
		if (type != null)
			newLoopVariableInput.setType(type);
		return newLoopVariableInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin createLoopVariableInput(String name, Type type) {
		return createLoopVariableInput(name, type,
			UMLPackage.Literals.INPUT_PIN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin getLoopVariableInput(String name, Type type) {
		return getLoopVariableInput(name, type, false, null, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin getLoopVariableInput(String name, Type type,
			boolean ignoreCase, EClass eClass, boolean createOnDemand) {
		loopVariableInputLoop : for (Iterator i = getLoopVariableInputs()
			.iterator(); i.hasNext();) {
			InputPin loopVariableInput = (InputPin) i.next();
			if (eClass != null && !eClass.isInstance(loopVariableInput))
				continue loopVariableInputLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(loopVariableInput.getName())
				: name.equals(loopVariableInput.getName())))
				continue loopVariableInputLoop;
			if (type != null && !type.equals(loopVariableInput.getType()))
				continue loopVariableInputLoop;
			return loopVariableInput;
		}
		return createOnDemand && eClass != null
			? createLoopVariableInput(name, type, eClass)
			: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInputEdges(DiagnosticChain diagnostics, Map context) {
		return LoopNodeOperations
			.validateInputEdges(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBodyOutputPins(DiagnosticChain diagnostics,
			Map context) {
		return LoopNodeOperations.validateBodyOutputPins(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultNoIncoming(DiagnosticChain diagnostics,
			Map context) {
		return LoopNodeOperations.validateResultNoIncoming(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.LOOP_NODE__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.LOOP_NODE__OWNED_COMMENT :
				return ((InternalEList) getOwnedComments()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.LOOP_NODE__CLIENT_DEPENDENCY :
				return ((InternalEList) getClientDependencies()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.LOOP_NODE__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.LOOP_NODE__IN_STRUCTURED_NODE :
				return basicSetInStructuredNode(null, msgs);
			case UMLPackage.LOOP_NODE__ACTIVITY :
				return basicSetActivity(null, msgs);
			case UMLPackage.LOOP_NODE__OUTGOING :
				return ((InternalEList) getOutgoings()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.LOOP_NODE__INCOMING :
				return ((InternalEList) getIncomings()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.LOOP_NODE__IN_PARTITION :
				return ((InternalEList) getInPartitions()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.LOOP_NODE__IN_INTERRUPTIBLE_REGION :
				return ((InternalEList) getInInterruptibleRegions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.LOOP_NODE__HANDLER :
				return ((InternalEList) getHandlers()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.LOOP_NODE__LOCAL_PRECONDITION :
				return ((InternalEList) getLocalPreconditions()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.LOOP_NODE__LOCAL_POSTCONDITION :
				return ((InternalEList) getLocalPostconditions()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.LOOP_NODE__ELEMENT_IMPORT :
				return ((InternalEList) getElementImports()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.LOOP_NODE__PACKAGE_IMPORT :
				return ((InternalEList) getPackageImports()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.LOOP_NODE__OWNED_RULE :
				return ((InternalEList) getOwnedRules()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.LOOP_NODE__IN_ACTIVITY :
				return basicSetInActivity(null, msgs);
			case UMLPackage.LOOP_NODE__VARIABLE :
				return ((InternalEList) getVariables()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.LOOP_NODE__EDGE :
				return ((InternalEList) getEdges()).basicRemove(otherEnd, msgs);
			case UMLPackage.LOOP_NODE__NODE :
				return ((InternalEList) getNodes()).basicRemove(otherEnd, msgs);
			case UMLPackage.LOOP_NODE__RESULT :
				return ((InternalEList) getResults()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.LOOP_NODE__LOOP_VARIABLE_INPUT :
				return ((InternalEList) getLoopVariableInputs()).basicRemove(
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
			case UMLPackage.LOOP_NODE__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.LOOP_NODE__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.LOOP_NODE__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.LOOP_NODE__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.LOOP_NODE__NAME :
				return getName();
			case UMLPackage.LOOP_NODE__VISIBILITY :
				return getVisibility();
			case UMLPackage.LOOP_NODE__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.LOOP_NODE__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.LOOP_NODE__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.LOOP_NODE__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.LOOP_NODE__IS_LEAF :
				return isLeaf()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.LOOP_NODE__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.LOOP_NODE__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.LOOP_NODE__IN_STRUCTURED_NODE :
				if (resolve)
					return getInStructuredNode();
				return basicGetInStructuredNode();
			case UMLPackage.LOOP_NODE__ACTIVITY :
				if (resolve)
					return getActivity();
				return basicGetActivity();
			case UMLPackage.LOOP_NODE__OUTGOING :
				return getOutgoings();
			case UMLPackage.LOOP_NODE__INCOMING :
				return getIncomings();
			case UMLPackage.LOOP_NODE__IN_PARTITION :
				return getInPartitions();
			case UMLPackage.LOOP_NODE__IN_INTERRUPTIBLE_REGION :
				return getInInterruptibleRegions();
			case UMLPackage.LOOP_NODE__IN_GROUP :
				return getInGroups();
			case UMLPackage.LOOP_NODE__REDEFINED_NODE :
				return getRedefinedNodes();
			case UMLPackage.LOOP_NODE__HANDLER :
				return getHandlers();
			case UMLPackage.LOOP_NODE__OUTPUT :
				return getOutputs();
			case UMLPackage.LOOP_NODE__INPUT :
				return getInputs();
			case UMLPackage.LOOP_NODE__CONTEXT :
				if (resolve)
					return getContext();
				return basicGetContext();
			case UMLPackage.LOOP_NODE__LOCAL_PRECONDITION :
				return getLocalPreconditions();
			case UMLPackage.LOOP_NODE__LOCAL_POSTCONDITION :
				return getLocalPostconditions();
			case UMLPackage.LOOP_NODE__ELEMENT_IMPORT :
				return getElementImports();
			case UMLPackage.LOOP_NODE__PACKAGE_IMPORT :
				return getPackageImports();
			case UMLPackage.LOOP_NODE__OWNED_RULE :
				return getOwnedRules();
			case UMLPackage.LOOP_NODE__MEMBER :
				return getMembers();
			case UMLPackage.LOOP_NODE__IMPORTED_MEMBER :
				return getImportedMembers();
			case UMLPackage.LOOP_NODE__OWNED_MEMBER :
				return getOwnedMembers();
			case UMLPackage.LOOP_NODE__SUBGROUP :
				return getSubgroups();
			case UMLPackage.LOOP_NODE__SUPER_GROUP :
				if (resolve)
					return getSuperGroup();
				return basicGetSuperGroup();
			case UMLPackage.LOOP_NODE__IN_ACTIVITY :
				if (resolve)
					return getInActivity();
				return basicGetInActivity();
			case UMLPackage.LOOP_NODE__CONTAINED_EDGE :
				return getContainedEdges();
			case UMLPackage.LOOP_NODE__CONTAINED_NODE :
				return getContainedNodes();
			case UMLPackage.LOOP_NODE__VARIABLE :
				return getVariables();
			case UMLPackage.LOOP_NODE__EDGE :
				return getEdges();
			case UMLPackage.LOOP_NODE__MUST_ISOLATE :
				return isMustIsolate()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.LOOP_NODE__NODE :
				return getNodes();
			case UMLPackage.LOOP_NODE__IS_TESTED_FIRST :
				return isTestedFirst()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.LOOP_NODE__BODY_PART :
				return getBodyParts();
			case UMLPackage.LOOP_NODE__SETUP_PART :
				return getSetupParts();
			case UMLPackage.LOOP_NODE__DECIDER :
				if (resolve)
					return getDecider();
				return basicGetDecider();
			case UMLPackage.LOOP_NODE__TEST :
				return getTests();
			case UMLPackage.LOOP_NODE__RESULT :
				return getResults();
			case UMLPackage.LOOP_NODE__LOOP_VARIABLE :
				return getLoopVariables();
			case UMLPackage.LOOP_NODE__BODY_OUTPUT :
				return getBodyOutputs();
			case UMLPackage.LOOP_NODE__LOOP_VARIABLE_INPUT :
				return getLoopVariableInputs();
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
			case UMLPackage.LOOP_NODE__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.LOOP_NODE__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.LOOP_NODE__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.LOOP_NODE__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.LOOP_NODE__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.LOOP_NODE__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.LOOP_NODE__IS_LEAF :
				setIsLeaf(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.LOOP_NODE__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) newValue);
				return;
			case UMLPackage.LOOP_NODE__ACTIVITY :
				setActivity((Activity) newValue);
				return;
			case UMLPackage.LOOP_NODE__OUTGOING :
				getOutgoings().clear();
				getOutgoings().addAll((Collection) newValue);
				return;
			case UMLPackage.LOOP_NODE__INCOMING :
				getIncomings().clear();
				getIncomings().addAll((Collection) newValue);
				return;
			case UMLPackage.LOOP_NODE__IN_PARTITION :
				getInPartitions().clear();
				getInPartitions().addAll((Collection) newValue);
				return;
			case UMLPackage.LOOP_NODE__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				getInInterruptibleRegions().addAll((Collection) newValue);
				return;
			case UMLPackage.LOOP_NODE__REDEFINED_NODE :
				getRedefinedNodes().clear();
				getRedefinedNodes().addAll((Collection) newValue);
				return;
			case UMLPackage.LOOP_NODE__HANDLER :
				getHandlers().clear();
				getHandlers().addAll((Collection) newValue);
				return;
			case UMLPackage.LOOP_NODE__LOCAL_PRECONDITION :
				getLocalPreconditions().clear();
				getLocalPreconditions().addAll((Collection) newValue);
				return;
			case UMLPackage.LOOP_NODE__LOCAL_POSTCONDITION :
				getLocalPostconditions().clear();
				getLocalPostconditions().addAll((Collection) newValue);
				return;
			case UMLPackage.LOOP_NODE__ELEMENT_IMPORT :
				getElementImports().clear();
				getElementImports().addAll((Collection) newValue);
				return;
			case UMLPackage.LOOP_NODE__PACKAGE_IMPORT :
				getPackageImports().clear();
				getPackageImports().addAll((Collection) newValue);
				return;
			case UMLPackage.LOOP_NODE__OWNED_RULE :
				getOwnedRules().clear();
				getOwnedRules().addAll((Collection) newValue);
				return;
			case UMLPackage.LOOP_NODE__IN_ACTIVITY :
				setInActivity((Activity) newValue);
				return;
			case UMLPackage.LOOP_NODE__VARIABLE :
				getVariables().clear();
				getVariables().addAll((Collection) newValue);
				return;
			case UMLPackage.LOOP_NODE__EDGE :
				getEdges().clear();
				getEdges().addAll((Collection) newValue);
				return;
			case UMLPackage.LOOP_NODE__MUST_ISOLATE :
				setMustIsolate(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.LOOP_NODE__NODE :
				getNodes().clear();
				getNodes().addAll((Collection) newValue);
				return;
			case UMLPackage.LOOP_NODE__IS_TESTED_FIRST :
				setIsTestedFirst(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.LOOP_NODE__BODY_PART :
				getBodyParts().clear();
				getBodyParts().addAll((Collection) newValue);
				return;
			case UMLPackage.LOOP_NODE__SETUP_PART :
				getSetupParts().clear();
				getSetupParts().addAll((Collection) newValue);
				return;
			case UMLPackage.LOOP_NODE__DECIDER :
				setDecider((OutputPin) newValue);
				return;
			case UMLPackage.LOOP_NODE__TEST :
				getTests().clear();
				getTests().addAll((Collection) newValue);
				return;
			case UMLPackage.LOOP_NODE__RESULT :
				getResults().clear();
				getResults().addAll((Collection) newValue);
				return;
			case UMLPackage.LOOP_NODE__LOOP_VARIABLE :
				getLoopVariables().clear();
				getLoopVariables().addAll((Collection) newValue);
				return;
			case UMLPackage.LOOP_NODE__BODY_OUTPUT :
				getBodyOutputs().clear();
				getBodyOutputs().addAll((Collection) newValue);
				return;
			case UMLPackage.LOOP_NODE__LOOP_VARIABLE_INPUT :
				getLoopVariableInputs().clear();
				getLoopVariableInputs().addAll((Collection) newValue);
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
			case UMLPackage.LOOP_NODE__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.LOOP_NODE__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.LOOP_NODE__NAME :
				unsetName();
				return;
			case UMLPackage.LOOP_NODE__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.LOOP_NODE__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.LOOP_NODE__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.LOOP_NODE__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.LOOP_NODE__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) null);
				return;
			case UMLPackage.LOOP_NODE__ACTIVITY :
				setActivity((Activity) null);
				return;
			case UMLPackage.LOOP_NODE__OUTGOING :
				getOutgoings().clear();
				return;
			case UMLPackage.LOOP_NODE__INCOMING :
				getIncomings().clear();
				return;
			case UMLPackage.LOOP_NODE__IN_PARTITION :
				getInPartitions().clear();
				return;
			case UMLPackage.LOOP_NODE__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				return;
			case UMLPackage.LOOP_NODE__REDEFINED_NODE :
				getRedefinedNodes().clear();
				return;
			case UMLPackage.LOOP_NODE__HANDLER :
				getHandlers().clear();
				return;
			case UMLPackage.LOOP_NODE__LOCAL_PRECONDITION :
				getLocalPreconditions().clear();
				return;
			case UMLPackage.LOOP_NODE__LOCAL_POSTCONDITION :
				getLocalPostconditions().clear();
				return;
			case UMLPackage.LOOP_NODE__ELEMENT_IMPORT :
				getElementImports().clear();
				return;
			case UMLPackage.LOOP_NODE__PACKAGE_IMPORT :
				getPackageImports().clear();
				return;
			case UMLPackage.LOOP_NODE__OWNED_RULE :
				getOwnedRules().clear();
				return;
			case UMLPackage.LOOP_NODE__IN_ACTIVITY :
				setInActivity((Activity) null);
				return;
			case UMLPackage.LOOP_NODE__VARIABLE :
				getVariables().clear();
				return;
			case UMLPackage.LOOP_NODE__EDGE :
				getEdges().clear();
				return;
			case UMLPackage.LOOP_NODE__MUST_ISOLATE :
				setMustIsolate(MUST_ISOLATE_EDEFAULT);
				return;
			case UMLPackage.LOOP_NODE__NODE :
				getNodes().clear();
				return;
			case UMLPackage.LOOP_NODE__IS_TESTED_FIRST :
				setIsTestedFirst(IS_TESTED_FIRST_EDEFAULT);
				return;
			case UMLPackage.LOOP_NODE__BODY_PART :
				getBodyParts().clear();
				return;
			case UMLPackage.LOOP_NODE__SETUP_PART :
				getSetupParts().clear();
				return;
			case UMLPackage.LOOP_NODE__DECIDER :
				setDecider((OutputPin) null);
				return;
			case UMLPackage.LOOP_NODE__TEST :
				getTests().clear();
				return;
			case UMLPackage.LOOP_NODE__RESULT :
				getResults().clear();
				return;
			case UMLPackage.LOOP_NODE__LOOP_VARIABLE :
				getLoopVariables().clear();
				return;
			case UMLPackage.LOOP_NODE__BODY_OUTPUT :
				getBodyOutputs().clear();
				return;
			case UMLPackage.LOOP_NODE__LOOP_VARIABLE_INPUT :
				getLoopVariableInputs().clear();
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
			case UMLPackage.LOOP_NODE__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.LOOP_NODE__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.LOOP_NODE__OWNER :
				return isSetOwner();
			case UMLPackage.LOOP_NODE__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.LOOP_NODE__NAME :
				return isSetName();
			case UMLPackage.LOOP_NODE__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.LOOP_NODE__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.LOOP_NODE__CLIENT_DEPENDENCY :
				return clientDependencies != null
					&& !clientDependencies.isEmpty();
			case UMLPackage.LOOP_NODE__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.LOOP_NODE__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.LOOP_NODE__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.LOOP_NODE__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.LOOP_NODE__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.LOOP_NODE__IN_STRUCTURED_NODE :
				return basicGetInStructuredNode() != null;
			case UMLPackage.LOOP_NODE__ACTIVITY :
				return isSetActivity();
			case UMLPackage.LOOP_NODE__OUTGOING :
				return outgoings != null && !outgoings.isEmpty();
			case UMLPackage.LOOP_NODE__INCOMING :
				return incomings != null && !incomings.isEmpty();
			case UMLPackage.LOOP_NODE__IN_PARTITION :
				return inPartitions != null && !inPartitions.isEmpty();
			case UMLPackage.LOOP_NODE__IN_INTERRUPTIBLE_REGION :
				return inInterruptibleRegions != null
					&& !inInterruptibleRegions.isEmpty();
			case UMLPackage.LOOP_NODE__IN_GROUP :
				return isSetInGroups();
			case UMLPackage.LOOP_NODE__REDEFINED_NODE :
				return redefinedNodes != null && !redefinedNodes.isEmpty();
			case UMLPackage.LOOP_NODE__HANDLER :
				return handlers != null && !handlers.isEmpty();
			case UMLPackage.LOOP_NODE__OUTPUT :
				return isSetOutputs();
			case UMLPackage.LOOP_NODE__INPUT :
				return isSetInputs();
			case UMLPackage.LOOP_NODE__CONTEXT :
				return basicGetContext() != null;
			case UMLPackage.LOOP_NODE__LOCAL_PRECONDITION :
				return localPreconditions != null
					&& !localPreconditions.isEmpty();
			case UMLPackage.LOOP_NODE__LOCAL_POSTCONDITION :
				return localPostconditions != null
					&& !localPostconditions.isEmpty();
			case UMLPackage.LOOP_NODE__ELEMENT_IMPORT :
				return elementImports != null && !elementImports.isEmpty();
			case UMLPackage.LOOP_NODE__PACKAGE_IMPORT :
				return packageImports != null && !packageImports.isEmpty();
			case UMLPackage.LOOP_NODE__OWNED_RULE :
				return ownedRules != null && !ownedRules.isEmpty();
			case UMLPackage.LOOP_NODE__MEMBER :
				return isSetMembers();
			case UMLPackage.LOOP_NODE__IMPORTED_MEMBER :
				return !getImportedMembers().isEmpty();
			case UMLPackage.LOOP_NODE__OWNED_MEMBER :
				return isSetOwnedMembers();
			case UMLPackage.LOOP_NODE__SUBGROUP :
				return isSetSubgroups();
			case UMLPackage.LOOP_NODE__SUPER_GROUP :
				return isSetSuperGroup();
			case UMLPackage.LOOP_NODE__IN_ACTIVITY :
				return isSetInActivity();
			case UMLPackage.LOOP_NODE__CONTAINED_EDGE :
				return isSetContainedEdges();
			case UMLPackage.LOOP_NODE__CONTAINED_NODE :
				return isSetContainedNodes();
			case UMLPackage.LOOP_NODE__VARIABLE :
				return variables != null && !variables.isEmpty();
			case UMLPackage.LOOP_NODE__EDGE :
				return edges != null && !edges.isEmpty();
			case UMLPackage.LOOP_NODE__MUST_ISOLATE :
				return ((eFlags & MUST_ISOLATE_EFLAG) != 0) != MUST_ISOLATE_EDEFAULT;
			case UMLPackage.LOOP_NODE__NODE :
				return nodes != null && !nodes.isEmpty();
			case UMLPackage.LOOP_NODE__IS_TESTED_FIRST :
				return ((eFlags & IS_TESTED_FIRST_EFLAG) != 0) != IS_TESTED_FIRST_EDEFAULT;
			case UMLPackage.LOOP_NODE__BODY_PART :
				return bodyParts != null && !bodyParts.isEmpty();
			case UMLPackage.LOOP_NODE__SETUP_PART :
				return setupParts != null && !setupParts.isEmpty();
			case UMLPackage.LOOP_NODE__DECIDER :
				return decider != null;
			case UMLPackage.LOOP_NODE__TEST :
				return tests != null && !tests.isEmpty();
			case UMLPackage.LOOP_NODE__RESULT :
				return results != null && !results.isEmpty();
			case UMLPackage.LOOP_NODE__LOOP_VARIABLE :
				return loopVariables != null && !loopVariables.isEmpty();
			case UMLPackage.LOOP_NODE__BODY_OUTPUT :
				return bodyOutputs != null && !bodyOutputs.isEmpty();
			case UMLPackage.LOOP_NODE__LOOP_VARIABLE_INPUT :
				return loopVariableInputs != null
					&& !loopVariableInputs.isEmpty();
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isTestedFirst: "); //$NON-NLS-1$
		result.append((eFlags & IS_TESTED_FIRST_EFLAG) != 0);
		result.append(')');
		return result.toString();
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getOutputs() <em>Output</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputs()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OUTPUT_ESUBSETS = new int[]{UMLPackage.LOOP_NODE__RESULT};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOutputs() {
		return super.isSetOutputs() || eIsSet(UMLPackage.LOOP_NODE__RESULT);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getInputs() <em>Input</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputs()
	 * @generated
	 * @ordered
	 */
	protected static final int[] INPUT_ESUBSETS = new int[]{UMLPackage.LOOP_NODE__LOOP_VARIABLE_INPUT};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInputs() {
		return super.isSetInputs()
			|| eIsSet(UMLPackage.LOOP_NODE__LOOP_VARIABLE_INPUT);
	}

} //LoopNodeImpl
