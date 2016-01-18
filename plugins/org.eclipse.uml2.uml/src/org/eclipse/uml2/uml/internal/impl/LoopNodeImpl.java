/*
 * Copyright (c) 2005, 2016 IBM Corporation, Embarcadero Technologies, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (Embarcadero Technologies) - 204200
 *   Kenn Hussey - 286329, 323181
 *   Kenn Hussey (CEA) - 327039, 351774, 397139, 397141, 418466, 451350, 485756
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

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;
import org.eclipse.uml2.uml.Action;
import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.ActivityEdge;
import org.eclipse.uml2.uml.ActivityNode;
import org.eclipse.uml2.uml.ActivityPartition;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.ElementImport;
import org.eclipse.uml2.uml.ExceptionHandler;
import org.eclipse.uml2.uml.ExecutableNode;
import org.eclipse.uml2.uml.InputPin;
import org.eclipse.uml2.uml.InterruptibleActivityRegion;
import org.eclipse.uml2.uml.LoopNode;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.OutputPin;
import org.eclipse.uml2.uml.PackageImport;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.RedefinableElement;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.StructuredActivityNode;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.Variable;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.LoopNodeOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Loop Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.LoopNodeImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.LoopNodeImpl#getBodyOutputs <em>Body Output</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.LoopNodeImpl#getBodyParts <em>Body Part</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.LoopNodeImpl#getDecider <em>Decider</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.LoopNodeImpl#isTestedFirst <em>Is Tested First</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.LoopNodeImpl#getLoopVariables <em>Loop Variable</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.LoopNodeImpl#getLoopVariableInputs <em>Loop Variable Input</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.LoopNodeImpl#getResults <em>Result</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.LoopNodeImpl#getSetupParts <em>Setup Part</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.LoopNodeImpl#getTests <em>Test</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LoopNodeImpl
		extends StructuredActivityNodeImpl
		implements LoopNode {

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
	 * The cached value of the '{@link #getBodyParts() <em>Body Part</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodyParts()
	 * @generated
	 * @ordered
	 */
	protected EList<ExecutableNode> bodyParts;

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
	protected static final int IS_TESTED_FIRST_EFLAG = 1 << 15;

	/**
	 * The cached value of the '{@link #getLoopVariables() <em>Loop Variable</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoopVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<OutputPin> loopVariables;

	/**
	 * The cached value of the '{@link #getLoopVariableInputs() <em>Loop Variable Input</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoopVariableInputs()
	 * @generated
	 * @ordered
	 */
	protected EList<InputPin> loopVariableInputs;

	/**
	 * The cached value of the '{@link #getResults() <em>Result</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResults()
	 * @generated
	 * @ordered
	 */
	protected EList<OutputPin> results;

	/**
	 * The cached value of the '{@link #getSetupParts() <em>Setup Part</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetupParts()
	 * @generated
	 * @ordered
	 */
	protected EList<ExecutableNode> setupParts;

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
	protected LoopNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.LOOP_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Element> getOwnedElements() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			@SuppressWarnings("unchecked")
			EList<Element> ownedElements = (EList<Element>) cache.get(eResource,
				this, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
			if (ownedElements == null) {
				cache.put(eResource, this,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT,
					ownedElements = new DerivedUnionEObjectEList<Element>(
						Element.class, this,
						UMLPackage.LOOP_NODE__OWNED_ELEMENT,
						OWNED_ELEMENT_ESUBSETS));
			}
			return ownedElements;
		}
		return new DerivedUnionEObjectEList<Element>(Element.class, this,
			UMLPackage.LOOP_NODE__OWNED_ELEMENT, OWNED_ELEMENT_ESUBSETS);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getOwnedElements() <em>Owned Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedElements()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_ELEMENT_ESUBSETS = new int[]{
		UMLPackage.LOOP_NODE__OWNED_COMMENT,
		UMLPackage.LOOP_NODE__NAME_EXPRESSION, UMLPackage.LOOP_NODE__HANDLER,
		UMLPackage.LOOP_NODE__INPUT, UMLPackage.LOOP_NODE__LOCAL_POSTCONDITION,
		UMLPackage.LOOP_NODE__LOCAL_PRECONDITION, UMLPackage.LOOP_NODE__OUTPUT,
		UMLPackage.LOOP_NODE__ELEMENT_IMPORT,
		UMLPackage.LOOP_NODE__PACKAGE_IMPORT,
		UMLPackage.LOOP_NODE__OWNED_MEMBER, UMLPackage.LOOP_NODE__SUBGROUP,
		UMLPackage.LOOP_NODE__EDGE, UMLPackage.LOOP_NODE__NODE,
		UMLPackage.LOOP_NODE__LOOP_VARIABLE};

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
	public EList<ExecutableNode> getBodyParts() {
		if (bodyParts == null) {
			bodyParts = new EObjectResolvingEList<ExecutableNode>(
				ExecutableNode.class, this, UMLPackage.LOOP_NODE__BODY_PART);
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
		bodyPartLoop : for (ExecutableNode bodyPart : getBodyParts()) {
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
	public EList<ExecutableNode> getSetupParts() {
		if (setupParts == null) {
			setupParts = new EObjectResolvingEList<ExecutableNode>(
				ExecutableNode.class, this, UMLPackage.LOOP_NODE__SETUP_PART);
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
		setupPartLoop : for (ExecutableNode setupPart : getSetupParts()) {
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
	public EList<ExecutableNode> getTests() {
		if (tests == null) {
			tests = new EObjectResolvingEList<ExecutableNode>(
				ExecutableNode.class, this, UMLPackage.LOOP_NODE__TEST);
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
	public EList<OutputPin> getResults() {
		if (results == null) {
			results = new EObjectContainmentEList.Resolving<OutputPin>(
				OutputPin.class, this, UMLPackage.LOOP_NODE__RESULT);
		}
		return results;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPin createResult(String name, Type type) {
		OutputPin newResult = (OutputPin) create(
			UMLPackage.Literals.OUTPUT_PIN);
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
		resultLoop : for (OutputPin result : getResults()) {
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
	public boolean isSetResults() {
		return results != null && !results.isEmpty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutputPin> getLoopVariables() {
		if (loopVariables == null) {
			loopVariables = new EObjectContainmentEList.Resolving<OutputPin>(
				OutputPin.class, this, UMLPackage.LOOP_NODE__LOOP_VARIABLE);
		}
		return loopVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPin createLoopVariable(String name, Type type) {
		OutputPin newLoopVariable = (OutputPin) create(
			UMLPackage.Literals.OUTPUT_PIN);
		getLoopVariables().add(newLoopVariable);
		if (name != null)
			newLoopVariable.setName(name);
		if (type != null)
			newLoopVariable.setType(type);
		return newLoopVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPin getLoopVariable(String name, Type type) {
		return getLoopVariable(name, type, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public OutputPin getLoopVariable(String name, Type type,
			boolean ignoreCase) {
		return getLoopVariable(name, type, ignoreCase, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPin getLoopVariable(String name, Type type, boolean ignoreCase,
			boolean createOnDemand) {
		loopVariableLoop : for (OutputPin loopVariable : getLoopVariables()) {
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(loopVariable.getName())
				: name.equals(loopVariable.getName())))
				continue loopVariableLoop;
			if (type != null && !type.equals(loopVariable.getType()))
				continue loopVariableLoop;
			return loopVariable;
		}
		return createOnDemand
			? createLoopVariable(name, type)
			: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutputPin> getBodyOutputs() {
		if (bodyOutputs == null) {
			bodyOutputs = new EObjectResolvingEList<OutputPin>(OutputPin.class,
				this, UMLPackage.LOOP_NODE__BODY_OUTPUT);
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
	public EList<InputPin> getLoopVariableInputs() {
		if (loopVariableInputs == null) {
			loopVariableInputs = new EObjectContainmentEList.Resolving<InputPin>(
				InputPin.class, this,
				UMLPackage.LOOP_NODE__LOOP_VARIABLE_INPUT);
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
		loopVariableInputLoop : for (InputPin loopVariableInput : getLoopVariableInputs()) {
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
	public boolean isSetLoopVariableInputs() {
		return loopVariableInputs != null && !loopVariableInputs.isEmpty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInputEdges(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return LoopNodeOperations.validateInputEdges(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExecutableNodes(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return LoopNodeOperations.validateExecutableNodes(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBodyOutputPins(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return LoopNodeOperations.validateBodyOutputPins(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSetupTestAndBody(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return LoopNodeOperations.validateSetupTestAndBody(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMatchingOutputPins(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return LoopNodeOperations.validateMatchingOutputPins(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMatchingLoopVariables(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return LoopNodeOperations.validateMatchingLoopVariables(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMatchingResultPins(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return LoopNodeOperations.validateMatchingResultPins(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLoopVariableOutgoing(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return LoopNodeOperations.validateLoopVariableOutgoing(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Action> allActions() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			@SuppressWarnings("unchecked")
			EList<Action> result = (EList<Action>) cache.get(this,
				UMLPackage.Literals.ACTION___ALL_ACTIONS);
			if (result == null) {
				cache.put(this, UMLPackage.Literals.ACTION___ALL_ACTIONS,
					result = LoopNodeOperations.allActions(this));
			}
			return result;
		}
		return LoopNodeOperations.allActions(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ActivityNode> sourceNodes() {
		return LoopNodeOperations.sourceNodes(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultNoIncoming(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return LoopNodeOperations.validateResultNoIncoming(this, diagnostics,
			context);
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
			case UMLPackage.LOOP_NODE__EANNOTATIONS :
				return ((InternalEList<?>) getEAnnotations())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.LOOP_NODE__OWNED_COMMENT :
				return ((InternalEList<?>) getOwnedComments())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.LOOP_NODE__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.LOOP_NODE__IN_INTERRUPTIBLE_REGION :
				return ((InternalEList<?>) getInInterruptibleRegions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.LOOP_NODE__IN_STRUCTURED_NODE :
				return basicSetInStructuredNode(null, msgs);
			case UMLPackage.LOOP_NODE__INCOMING :
				return ((InternalEList<?>) getIncomings()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.LOOP_NODE__OUTGOING :
				return ((InternalEList<?>) getOutgoings()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.LOOP_NODE__IN_PARTITION :
				return ((InternalEList<?>) getInPartitions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.LOOP_NODE__HANDLER :
				return ((InternalEList<?>) getHandlers()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.LOOP_NODE__LOCAL_POSTCONDITION :
				return ((InternalEList<?>) getLocalPostconditions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.LOOP_NODE__LOCAL_PRECONDITION :
				return ((InternalEList<?>) getLocalPreconditions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.LOOP_NODE__OWNED_RULE :
				return ((InternalEList<?>) getOwnedRules())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.LOOP_NODE__ELEMENT_IMPORT :
				return ((InternalEList<?>) getElementImports())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.LOOP_NODE__PACKAGE_IMPORT :
				return ((InternalEList<?>) getPackageImports())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.LOOP_NODE__EDGE :
				return ((InternalEList<?>) getEdges()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.LOOP_NODE__STRUCTURED_NODE_INPUT :
				return ((InternalEList<?>) getStructuredNodeInputs())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.LOOP_NODE__STRUCTURED_NODE_OUTPUT :
				return ((InternalEList<?>) getStructuredNodeOutputs())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.LOOP_NODE__VARIABLE :
				return ((InternalEList<?>) getVariables()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.LOOP_NODE__NODE :
				return ((InternalEList<?>) getNodes()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.LOOP_NODE__LOOP_VARIABLE :
				return ((InternalEList<?>) getLoopVariables())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.LOOP_NODE__LOOP_VARIABLE_INPUT :
				return ((InternalEList<?>) getLoopVariableInputs())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.LOOP_NODE__RESULT :
				return ((InternalEList<?>) getResults()).basicRemove(otherEnd,
					msgs);
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
			case UMLPackage.LOOP_NODE__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.LOOP_NODE__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.LOOP_NODE__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.LOOP_NODE__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.LOOP_NODE__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.LOOP_NODE__NAME :
				return getName();
			case UMLPackage.LOOP_NODE__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.LOOP_NODE__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.LOOP_NODE__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.LOOP_NODE__VISIBILITY :
				return getVisibility();
			case UMLPackage.LOOP_NODE__IS_LEAF :
				return isLeaf();
			case UMLPackage.LOOP_NODE__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.LOOP_NODE__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.LOOP_NODE__ACTIVITY :
				if (resolve)
					return getActivity();
				return basicGetActivity();
			case UMLPackage.LOOP_NODE__IN_GROUP :
				return getInGroups();
			case UMLPackage.LOOP_NODE__IN_INTERRUPTIBLE_REGION :
				return getInInterruptibleRegions();
			case UMLPackage.LOOP_NODE__IN_STRUCTURED_NODE :
				if (resolve)
					return getInStructuredNode();
				return basicGetInStructuredNode();
			case UMLPackage.LOOP_NODE__INCOMING :
				return getIncomings();
			case UMLPackage.LOOP_NODE__OUTGOING :
				return getOutgoings();
			case UMLPackage.LOOP_NODE__REDEFINED_NODE :
				return getRedefinedNodes();
			case UMLPackage.LOOP_NODE__IN_PARTITION :
				return getInPartitions();
			case UMLPackage.LOOP_NODE__HANDLER :
				return getHandlers();
			case UMLPackage.LOOP_NODE__CONTEXT :
				if (resolve)
					return getContext();
				return basicGetContext();
			case UMLPackage.LOOP_NODE__INPUT :
				return getInputs();
			case UMLPackage.LOOP_NODE__IS_LOCALLY_REENTRANT :
				return isLocallyReentrant();
			case UMLPackage.LOOP_NODE__LOCAL_POSTCONDITION :
				return getLocalPostconditions();
			case UMLPackage.LOOP_NODE__LOCAL_PRECONDITION :
				return getLocalPreconditions();
			case UMLPackage.LOOP_NODE__OUTPUT :
				return getOutputs();
			case UMLPackage.LOOP_NODE__OWNED_RULE :
				return getOwnedRules();
			case UMLPackage.LOOP_NODE__ELEMENT_IMPORT :
				return getElementImports();
			case UMLPackage.LOOP_NODE__PACKAGE_IMPORT :
				return getPackageImports();
			case UMLPackage.LOOP_NODE__OWNED_MEMBER :
				return getOwnedMembers();
			case UMLPackage.LOOP_NODE__IMPORTED_MEMBER :
				return getImportedMembers();
			case UMLPackage.LOOP_NODE__MEMBER :
				return getMembers();
			case UMLPackage.LOOP_NODE__CONTAINED_EDGE :
				return getContainedEdges();
			case UMLPackage.LOOP_NODE__CONTAINED_NODE :
				return getContainedNodes();
			case UMLPackage.LOOP_NODE__IN_ACTIVITY :
				if (resolve)
					return getInActivity();
				return basicGetInActivity();
			case UMLPackage.LOOP_NODE__SUBGROUP :
				return getSubgroups();
			case UMLPackage.LOOP_NODE__SUPER_GROUP :
				if (resolve)
					return getSuperGroup();
				return basicGetSuperGroup();
			case UMLPackage.LOOP_NODE__EDGE :
				return getEdges();
			case UMLPackage.LOOP_NODE__MUST_ISOLATE :
				return isMustIsolate();
			case UMLPackage.LOOP_NODE__STRUCTURED_NODE_INPUT :
				return getStructuredNodeInputs();
			case UMLPackage.LOOP_NODE__STRUCTURED_NODE_OUTPUT :
				return getStructuredNodeOutputs();
			case UMLPackage.LOOP_NODE__VARIABLE :
				return getVariables();
			case UMLPackage.LOOP_NODE__NODE :
				return getNodes();
			case UMLPackage.LOOP_NODE__BODY_OUTPUT :
				return getBodyOutputs();
			case UMLPackage.LOOP_NODE__BODY_PART :
				return getBodyParts();
			case UMLPackage.LOOP_NODE__DECIDER :
				if (resolve)
					return getDecider();
				return basicGetDecider();
			case UMLPackage.LOOP_NODE__IS_TESTED_FIRST :
				return isTestedFirst();
			case UMLPackage.LOOP_NODE__LOOP_VARIABLE :
				return getLoopVariables();
			case UMLPackage.LOOP_NODE__LOOP_VARIABLE_INPUT :
				return getLoopVariableInputs();
			case UMLPackage.LOOP_NODE__RESULT :
				return getResults();
			case UMLPackage.LOOP_NODE__SETUP_PART :
				return getSetupParts();
			case UMLPackage.LOOP_NODE__TEST :
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
			case UMLPackage.LOOP_NODE__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations()
					.addAll((Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.LOOP_NODE__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments()
					.addAll((Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.LOOP_NODE__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.LOOP_NODE__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.LOOP_NODE__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.LOOP_NODE__IS_LEAF :
				setIsLeaf((Boolean) newValue);
				return;
			case UMLPackage.LOOP_NODE__ACTIVITY :
				setActivity((Activity) newValue);
				return;
			case UMLPackage.LOOP_NODE__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				getInInterruptibleRegions().addAll(
					(Collection<? extends InterruptibleActivityRegion>) newValue);
				return;
			case UMLPackage.LOOP_NODE__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) newValue);
				return;
			case UMLPackage.LOOP_NODE__INCOMING :
				getIncomings().clear();
				getIncomings()
					.addAll((Collection<? extends ActivityEdge>) newValue);
				return;
			case UMLPackage.LOOP_NODE__OUTGOING :
				getOutgoings().clear();
				getOutgoings()
					.addAll((Collection<? extends ActivityEdge>) newValue);
				return;
			case UMLPackage.LOOP_NODE__REDEFINED_NODE :
				getRedefinedNodes().clear();
				getRedefinedNodes()
					.addAll((Collection<? extends ActivityNode>) newValue);
				return;
			case UMLPackage.LOOP_NODE__IN_PARTITION :
				getInPartitions().clear();
				getInPartitions()
					.addAll((Collection<? extends ActivityPartition>) newValue);
				return;
			case UMLPackage.LOOP_NODE__HANDLER :
				getHandlers().clear();
				getHandlers()
					.addAll((Collection<? extends ExceptionHandler>) newValue);
				return;
			case UMLPackage.LOOP_NODE__IS_LOCALLY_REENTRANT :
				setIsLocallyReentrant((Boolean) newValue);
				return;
			case UMLPackage.LOOP_NODE__LOCAL_POSTCONDITION :
				getLocalPostconditions().clear();
				getLocalPostconditions()
					.addAll((Collection<? extends Constraint>) newValue);
				return;
			case UMLPackage.LOOP_NODE__LOCAL_PRECONDITION :
				getLocalPreconditions().clear();
				getLocalPreconditions()
					.addAll((Collection<? extends Constraint>) newValue);
				return;
			case UMLPackage.LOOP_NODE__OWNED_RULE :
				getOwnedRules().clear();
				getOwnedRules()
					.addAll((Collection<? extends Constraint>) newValue);
				return;
			case UMLPackage.LOOP_NODE__ELEMENT_IMPORT :
				getElementImports().clear();
				getElementImports()
					.addAll((Collection<? extends ElementImport>) newValue);
				return;
			case UMLPackage.LOOP_NODE__PACKAGE_IMPORT :
				getPackageImports().clear();
				getPackageImports()
					.addAll((Collection<? extends PackageImport>) newValue);
				return;
			case UMLPackage.LOOP_NODE__IN_ACTIVITY :
				setInActivity((Activity) newValue);
				return;
			case UMLPackage.LOOP_NODE__EDGE :
				getEdges().clear();
				getEdges()
					.addAll((Collection<? extends ActivityEdge>) newValue);
				return;
			case UMLPackage.LOOP_NODE__MUST_ISOLATE :
				setMustIsolate((Boolean) newValue);
				return;
			case UMLPackage.LOOP_NODE__STRUCTURED_NODE_INPUT :
				getStructuredNodeInputs().clear();
				getStructuredNodeInputs()
					.addAll((Collection<? extends InputPin>) newValue);
				return;
			case UMLPackage.LOOP_NODE__STRUCTURED_NODE_OUTPUT :
				getStructuredNodeOutputs().clear();
				getStructuredNodeOutputs()
					.addAll((Collection<? extends OutputPin>) newValue);
				return;
			case UMLPackage.LOOP_NODE__VARIABLE :
				getVariables().clear();
				getVariables()
					.addAll((Collection<? extends Variable>) newValue);
				return;
			case UMLPackage.LOOP_NODE__NODE :
				getNodes().clear();
				getNodes()
					.addAll((Collection<? extends ActivityNode>) newValue);
				return;
			case UMLPackage.LOOP_NODE__BODY_OUTPUT :
				getBodyOutputs().clear();
				getBodyOutputs()
					.addAll((Collection<? extends OutputPin>) newValue);
				return;
			case UMLPackage.LOOP_NODE__BODY_PART :
				getBodyParts().clear();
				getBodyParts()
					.addAll((Collection<? extends ExecutableNode>) newValue);
				return;
			case UMLPackage.LOOP_NODE__DECIDER :
				setDecider((OutputPin) newValue);
				return;
			case UMLPackage.LOOP_NODE__IS_TESTED_FIRST :
				setIsTestedFirst((Boolean) newValue);
				return;
			case UMLPackage.LOOP_NODE__LOOP_VARIABLE :
				getLoopVariables().clear();
				getLoopVariables()
					.addAll((Collection<? extends OutputPin>) newValue);
				return;
			case UMLPackage.LOOP_NODE__LOOP_VARIABLE_INPUT :
				getLoopVariableInputs().clear();
				getLoopVariableInputs()
					.addAll((Collection<? extends InputPin>) newValue);
				return;
			case UMLPackage.LOOP_NODE__RESULT :
				getResults().clear();
				getResults().addAll((Collection<? extends OutputPin>) newValue);
				return;
			case UMLPackage.LOOP_NODE__SETUP_PART :
				getSetupParts().clear();
				getSetupParts()
					.addAll((Collection<? extends ExecutableNode>) newValue);
				return;
			case UMLPackage.LOOP_NODE__TEST :
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
			case UMLPackage.LOOP_NODE__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.LOOP_NODE__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.LOOP_NODE__NAME :
				unsetName();
				return;
			case UMLPackage.LOOP_NODE__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.LOOP_NODE__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.LOOP_NODE__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.LOOP_NODE__ACTIVITY :
				setActivity((Activity) null);
				return;
			case UMLPackage.LOOP_NODE__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				return;
			case UMLPackage.LOOP_NODE__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) null);
				return;
			case UMLPackage.LOOP_NODE__INCOMING :
				getIncomings().clear();
				return;
			case UMLPackage.LOOP_NODE__OUTGOING :
				getOutgoings().clear();
				return;
			case UMLPackage.LOOP_NODE__REDEFINED_NODE :
				getRedefinedNodes().clear();
				return;
			case UMLPackage.LOOP_NODE__IN_PARTITION :
				getInPartitions().clear();
				return;
			case UMLPackage.LOOP_NODE__HANDLER :
				getHandlers().clear();
				return;
			case UMLPackage.LOOP_NODE__IS_LOCALLY_REENTRANT :
				setIsLocallyReentrant(IS_LOCALLY_REENTRANT_EDEFAULT);
				return;
			case UMLPackage.LOOP_NODE__LOCAL_POSTCONDITION :
				getLocalPostconditions().clear();
				return;
			case UMLPackage.LOOP_NODE__LOCAL_PRECONDITION :
				getLocalPreconditions().clear();
				return;
			case UMLPackage.LOOP_NODE__OWNED_RULE :
				getOwnedRules().clear();
				return;
			case UMLPackage.LOOP_NODE__ELEMENT_IMPORT :
				getElementImports().clear();
				return;
			case UMLPackage.LOOP_NODE__PACKAGE_IMPORT :
				getPackageImports().clear();
				return;
			case UMLPackage.LOOP_NODE__IN_ACTIVITY :
				setInActivity((Activity) null);
				return;
			case UMLPackage.LOOP_NODE__EDGE :
				getEdges().clear();
				return;
			case UMLPackage.LOOP_NODE__MUST_ISOLATE :
				setMustIsolate(MUST_ISOLATE_EDEFAULT);
				return;
			case UMLPackage.LOOP_NODE__STRUCTURED_NODE_INPUT :
				getStructuredNodeInputs().clear();
				return;
			case UMLPackage.LOOP_NODE__STRUCTURED_NODE_OUTPUT :
				getStructuredNodeOutputs().clear();
				return;
			case UMLPackage.LOOP_NODE__VARIABLE :
				getVariables().clear();
				return;
			case UMLPackage.LOOP_NODE__NODE :
				getNodes().clear();
				return;
			case UMLPackage.LOOP_NODE__BODY_OUTPUT :
				getBodyOutputs().clear();
				return;
			case UMLPackage.LOOP_NODE__BODY_PART :
				getBodyParts().clear();
				return;
			case UMLPackage.LOOP_NODE__DECIDER :
				setDecider((OutputPin) null);
				return;
			case UMLPackage.LOOP_NODE__IS_TESTED_FIRST :
				setIsTestedFirst(IS_TESTED_FIRST_EDEFAULT);
				return;
			case UMLPackage.LOOP_NODE__LOOP_VARIABLE :
				getLoopVariables().clear();
				return;
			case UMLPackage.LOOP_NODE__LOOP_VARIABLE_INPUT :
				getLoopVariableInputs().clear();
				return;
			case UMLPackage.LOOP_NODE__RESULT :
				getResults().clear();
				return;
			case UMLPackage.LOOP_NODE__SETUP_PART :
				getSetupParts().clear();
				return;
			case UMLPackage.LOOP_NODE__TEST :
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
			case UMLPackage.LOOP_NODE__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.LOOP_NODE__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.LOOP_NODE__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.LOOP_NODE__OWNER :
				return isSetOwner();
			case UMLPackage.LOOP_NODE__CLIENT_DEPENDENCY :
				return !getClientDependencies().isEmpty();
			case UMLPackage.LOOP_NODE__NAME :
				return isSetName();
			case UMLPackage.LOOP_NODE__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.LOOP_NODE__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.LOOP_NODE__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.LOOP_NODE__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.LOOP_NODE__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.LOOP_NODE__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.LOOP_NODE__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.LOOP_NODE__ACTIVITY :
				return isSetActivity();
			case UMLPackage.LOOP_NODE__IN_GROUP :
				return isSetInGroups();
			case UMLPackage.LOOP_NODE__IN_INTERRUPTIBLE_REGION :
				return inInterruptibleRegions != null
					&& !inInterruptibleRegions.isEmpty();
			case UMLPackage.LOOP_NODE__IN_STRUCTURED_NODE :
				return basicGetInStructuredNode() != null;
			case UMLPackage.LOOP_NODE__INCOMING :
				return incomings != null && !incomings.isEmpty();
			case UMLPackage.LOOP_NODE__OUTGOING :
				return outgoings != null && !outgoings.isEmpty();
			case UMLPackage.LOOP_NODE__REDEFINED_NODE :
				return redefinedNodes != null && !redefinedNodes.isEmpty();
			case UMLPackage.LOOP_NODE__IN_PARTITION :
				return inPartitions != null && !inPartitions.isEmpty();
			case UMLPackage.LOOP_NODE__HANDLER :
				return handlers != null && !handlers.isEmpty();
			case UMLPackage.LOOP_NODE__CONTEXT :
				return basicGetContext() != null;
			case UMLPackage.LOOP_NODE__INPUT :
				return isSetInputs();
			case UMLPackage.LOOP_NODE__IS_LOCALLY_REENTRANT :
				return ((eFlags
					& IS_LOCALLY_REENTRANT_EFLAG) != 0) != IS_LOCALLY_REENTRANT_EDEFAULT;
			case UMLPackage.LOOP_NODE__LOCAL_POSTCONDITION :
				return localPostconditions != null
					&& !localPostconditions.isEmpty();
			case UMLPackage.LOOP_NODE__LOCAL_PRECONDITION :
				return localPreconditions != null
					&& !localPreconditions.isEmpty();
			case UMLPackage.LOOP_NODE__OUTPUT :
				return isSetOutputs();
			case UMLPackage.LOOP_NODE__OWNED_RULE :
				return ownedRules != null && !ownedRules.isEmpty();
			case UMLPackage.LOOP_NODE__ELEMENT_IMPORT :
				return elementImports != null && !elementImports.isEmpty();
			case UMLPackage.LOOP_NODE__PACKAGE_IMPORT :
				return packageImports != null && !packageImports.isEmpty();
			case UMLPackage.LOOP_NODE__OWNED_MEMBER :
				return isSetOwnedMembers();
			case UMLPackage.LOOP_NODE__IMPORTED_MEMBER :
				return !getImportedMembers().isEmpty();
			case UMLPackage.LOOP_NODE__MEMBER :
				return isSetMembers();
			case UMLPackage.LOOP_NODE__CONTAINED_EDGE :
				return isSetContainedEdges();
			case UMLPackage.LOOP_NODE__CONTAINED_NODE :
				return isSetContainedNodes();
			case UMLPackage.LOOP_NODE__IN_ACTIVITY :
				return isSetInActivity();
			case UMLPackage.LOOP_NODE__SUBGROUP :
				return isSetSubgroups();
			case UMLPackage.LOOP_NODE__SUPER_GROUP :
				return isSetSuperGroup();
			case UMLPackage.LOOP_NODE__EDGE :
				return edges != null && !edges.isEmpty();
			case UMLPackage.LOOP_NODE__MUST_ISOLATE :
				return ((eFlags
					& MUST_ISOLATE_EFLAG) != 0) != MUST_ISOLATE_EDEFAULT;
			case UMLPackage.LOOP_NODE__STRUCTURED_NODE_INPUT :
				return isSetStructuredNodeInputs();
			case UMLPackage.LOOP_NODE__STRUCTURED_NODE_OUTPUT :
				return isSetStructuredNodeOutputs();
			case UMLPackage.LOOP_NODE__VARIABLE :
				return variables != null && !variables.isEmpty();
			case UMLPackage.LOOP_NODE__NODE :
				return nodes != null && !nodes.isEmpty();
			case UMLPackage.LOOP_NODE__BODY_OUTPUT :
				return bodyOutputs != null && !bodyOutputs.isEmpty();
			case UMLPackage.LOOP_NODE__BODY_PART :
				return bodyParts != null && !bodyParts.isEmpty();
			case UMLPackage.LOOP_NODE__DECIDER :
				return decider != null;
			case UMLPackage.LOOP_NODE__IS_TESTED_FIRST :
				return ((eFlags
					& IS_TESTED_FIRST_EFLAG) != 0) != IS_TESTED_FIRST_EDEFAULT;
			case UMLPackage.LOOP_NODE__LOOP_VARIABLE :
				return loopVariables != null && !loopVariables.isEmpty();
			case UMLPackage.LOOP_NODE__LOOP_VARIABLE_INPUT :
				return isSetLoopVariableInputs();
			case UMLPackage.LOOP_NODE__RESULT :
				return isSetResults();
			case UMLPackage.LOOP_NODE__SETUP_PART :
				return setupParts != null && !setupParts.isEmpty();
			case UMLPackage.LOOP_NODE__TEST :
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
			case UMLPackage.LOOP_NODE___GET_EANNOTATION__STRING :
				return getEAnnotation((String) arguments.get(0));
			case UMLPackage.LOOP_NODE___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP :
				return validateHasOwner((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.LOOP_NODE___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP :
				return validateNotOwnSelf((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.LOOP_NODE___ADD_KEYWORD__STRING :
				return addKeyword((String) arguments.get(0));
			case UMLPackage.LOOP_NODE___APPLY_STEREOTYPE__STEREOTYPE :
				return applyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.LOOP_NODE___CREATE_EANNOTATION__STRING :
				return createEAnnotation((String) arguments.get(0));
			case UMLPackage.LOOP_NODE___DESTROY :
				destroy();
				return null;
			case UMLPackage.LOOP_NODE___GET_KEYWORDS :
				return getKeywords();
			case UMLPackage.LOOP_NODE___GET_APPLICABLE_STEREOTYPE__STRING :
				return getApplicableStereotype((String) arguments.get(0));
			case UMLPackage.LOOP_NODE___GET_APPLICABLE_STEREOTYPES :
				return getApplicableStereotypes();
			case UMLPackage.LOOP_NODE___GET_APPLIED_STEREOTYPE__STRING :
				return getAppliedStereotype((String) arguments.get(0));
			case UMLPackage.LOOP_NODE___GET_APPLIED_STEREOTYPES :
				return getAppliedStereotypes();
			case UMLPackage.LOOP_NODE___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING :
				return getAppliedSubstereotype((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.LOOP_NODE___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE :
				return getAppliedSubstereotypes((Stereotype) arguments.get(0));
			case UMLPackage.LOOP_NODE___GET_MODEL :
				return getModel();
			case UMLPackage.LOOP_NODE___GET_NEAREST_PACKAGE :
				return getNearestPackage();
			case UMLPackage.LOOP_NODE___GET_RELATIONSHIPS :
				return getRelationships();
			case UMLPackage.LOOP_NODE___GET_RELATIONSHIPS__ECLASS :
				return getRelationships((EClass) arguments.get(0));
			case UMLPackage.LOOP_NODE___GET_REQUIRED_STEREOTYPE__STRING :
				return getRequiredStereotype((String) arguments.get(0));
			case UMLPackage.LOOP_NODE___GET_REQUIRED_STEREOTYPES :
				return getRequiredStereotypes();
			case UMLPackage.LOOP_NODE___GET_SOURCE_DIRECTED_RELATIONSHIPS :
				return getSourceDirectedRelationships();
			case UMLPackage.LOOP_NODE___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS :
				return getSourceDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.LOOP_NODE___GET_STEREOTYPE_APPLICATION__STEREOTYPE :
				return getStereotypeApplication((Stereotype) arguments.get(0));
			case UMLPackage.LOOP_NODE___GET_STEREOTYPE_APPLICATIONS :
				return getStereotypeApplications();
			case UMLPackage.LOOP_NODE___GET_TARGET_DIRECTED_RELATIONSHIPS :
				return getTargetDirectedRelationships();
			case UMLPackage.LOOP_NODE___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS :
				return getTargetDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.LOOP_NODE___GET_VALUE__STEREOTYPE_STRING :
				return getValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.LOOP_NODE___HAS_KEYWORD__STRING :
				return hasKeyword((String) arguments.get(0));
			case UMLPackage.LOOP_NODE___HAS_VALUE__STEREOTYPE_STRING :
				return hasValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.LOOP_NODE___IS_STEREOTYPE_APPLICABLE__STEREOTYPE :
				return isStereotypeApplicable((Stereotype) arguments.get(0));
			case UMLPackage.LOOP_NODE___IS_STEREOTYPE_APPLIED__STEREOTYPE :
				return isStereotypeApplied((Stereotype) arguments.get(0));
			case UMLPackage.LOOP_NODE___IS_STEREOTYPE_REQUIRED__STEREOTYPE :
				return isStereotypeRequired((Stereotype) arguments.get(0));
			case UMLPackage.LOOP_NODE___REMOVE_KEYWORD__STRING :
				return removeKeyword((String) arguments.get(0));
			case UMLPackage.LOOP_NODE___SET_VALUE__STEREOTYPE_STRING_OBJECT :
				setValue((Stereotype) arguments.get(0),
					(String) arguments.get(1), arguments.get(2));
				return null;
			case UMLPackage.LOOP_NODE___UNAPPLY_STEREOTYPE__STEREOTYPE :
				return unapplyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.LOOP_NODE___ALL_OWNED_ELEMENTS :
				return allOwnedElements();
			case UMLPackage.LOOP_NODE___MUST_BE_OWNED :
				return mustBeOwned();
			case UMLPackage.LOOP_NODE___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP :
				return validateVisibilityNeedsOwnership(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.LOOP_NODE___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.LOOP_NODE___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasNoQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.LOOP_NODE___CREATE_DEPENDENCY__NAMEDELEMENT :
				return createDependency((NamedElement) arguments.get(0));
			case UMLPackage.LOOP_NODE___CREATE_USAGE__NAMEDELEMENT :
				return createUsage((NamedElement) arguments.get(0));
			case UMLPackage.LOOP_NODE___GET_LABEL :
				return getLabel();
			case UMLPackage.LOOP_NODE___GET_LABEL__BOOLEAN :
				return getLabel((Boolean) arguments.get(0));
			case UMLPackage.LOOP_NODE___GET_NAMESPACE :
				return getNamespace();
			case UMLPackage.LOOP_NODE___ALL_NAMESPACES :
				return allNamespaces();
			case UMLPackage.LOOP_NODE___ALL_OWNING_PACKAGES :
				return allOwningPackages();
			case UMLPackage.LOOP_NODE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE :
				return isDistinguishableFrom((NamedElement) arguments.get(0),
					(Namespace) arguments.get(1));
			case UMLPackage.LOOP_NODE___GET_QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.LOOP_NODE___SEPARATOR :
				return separator();
			case UMLPackage.LOOP_NODE___GET_CLIENT_DEPENDENCIES :
				return getClientDependencies();
			case UMLPackage.LOOP_NODE___VALIDATE_REDEFINITION_CONSISTENT__DIAGNOSTICCHAIN_MAP :
				return validateRedefinitionConsistent(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.LOOP_NODE___VALIDATE_NON_LEAF_REDEFINITION__DIAGNOSTICCHAIN_MAP :
				return validateNonLeafRedefinition(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.LOOP_NODE___VALIDATE_REDEFINITION_CONTEXT_VALID__DIAGNOSTICCHAIN_MAP :
				return validateRedefinitionContextValid(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.LOOP_NODE___IS_CONSISTENT_WITH__REDEFINABLEELEMENT :
				return isConsistentWith((RedefinableElement) arguments.get(0));
			case UMLPackage.LOOP_NODE___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT :
				return isRedefinitionContextValid(
					(RedefinableElement) arguments.get(0));
			case UMLPackage.LOOP_NODE___CONTAINING_ACTIVITY :
				return containingActivity();
			case UMLPackage.LOOP_NODE___GET_CONTEXT :
				return getContext();
			case UMLPackage.LOOP_NODE___ALL_ACTIONS :
				return allActions();
			case UMLPackage.LOOP_NODE___ALL_OWNED_NODES :
				return allOwnedNodes();
			case UMLPackage.LOOP_NODE___CONTAINING_BEHAVIOR :
				return containingBehavior();
			case UMLPackage.LOOP_NODE___VALIDATE_MEMBERS_DISTINGUISHABLE__DIAGNOSTICCHAIN_MAP :
				return validateMembersDistinguishable(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.LOOP_NODE___VALIDATE_CANNOT_IMPORT_SELF__DIAGNOSTICCHAIN_MAP :
				return validateCannotImportSelf(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.LOOP_NODE___VALIDATE_CANNOT_IMPORT_OWNED_MEMBERS__DIAGNOSTICCHAIN_MAP :
				return validateCannotImportOwnedMembers(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.LOOP_NODE___CREATE_ELEMENT_IMPORT__PACKAGEABLEELEMENT_VISIBILITYKIND :
				return createElementImport(
					(PackageableElement) arguments.get(0),
					(VisibilityKind) arguments.get(1));
			case UMLPackage.LOOP_NODE___CREATE_PACKAGE_IMPORT__PACKAGE_VISIBILITYKIND :
				return createPackageImport(
					(org.eclipse.uml2.uml.Package) arguments.get(0),
					(VisibilityKind) arguments.get(1));
			case UMLPackage.LOOP_NODE___GET_IMPORTED_ELEMENTS :
				return getImportedElements();
			case UMLPackage.LOOP_NODE___GET_IMPORTED_PACKAGES :
				return getImportedPackages();
			case UMLPackage.LOOP_NODE___GET_OWNED_MEMBERS :
				return getOwnedMembers();
			case UMLPackage.LOOP_NODE___EXCLUDE_COLLISIONS__ELIST :
				return excludeCollisions(
					(EList<PackageableElement>) arguments.get(0));
			case UMLPackage.LOOP_NODE___GET_NAMES_OF_MEMBER__NAMEDELEMENT :
				return getNamesOfMember((NamedElement) arguments.get(0));
			case UMLPackage.LOOP_NODE___IMPORT_MEMBERS__ELIST :
				return importMembers(
					(EList<PackageableElement>) arguments.get(0));
			case UMLPackage.LOOP_NODE___GET_IMPORTED_MEMBERS :
				return getImportedMembers();
			case UMLPackage.LOOP_NODE___MEMBERS_ARE_DISTINGUISHABLE :
				return membersAreDistinguishable();
			case UMLPackage.LOOP_NODE___VALIDATE_NODES_AND_EDGES__DIAGNOSTICCHAIN_MAP :
				return validateNodesAndEdges((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.LOOP_NODE___VALIDATE_NOT_CONTAINED__DIAGNOSTICCHAIN_MAP :
				return validateNotContained((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.LOOP_NODE___VALIDATE_OUTPUT_PIN_EDGES__DIAGNOSTICCHAIN_MAP :
				return validateOutputPinEdges(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.LOOP_NODE___VALIDATE_EDGES__DIAGNOSTICCHAIN_MAP :
				return validateEdges((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.LOOP_NODE___VALIDATE_INPUT_PIN_EDGES__DIAGNOSTICCHAIN_MAP :
				return validateInputPinEdges((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.LOOP_NODE___SOURCE_NODES :
				return sourceNodes();
			case UMLPackage.LOOP_NODE___TARGET_NODES :
				return targetNodes();
			case UMLPackage.LOOP_NODE___VALIDATE_RESULT_NO_INCOMING__DIAGNOSTICCHAIN_MAP :
				return validateResultNoIncoming(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.LOOP_NODE___VALIDATE_INPUT_EDGES__DIAGNOSTICCHAIN_MAP :
				return validateInputEdges((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.LOOP_NODE___VALIDATE_EXECUTABLE_NODES__DIAGNOSTICCHAIN_MAP :
				return validateExecutableNodes(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.LOOP_NODE___VALIDATE_BODY_OUTPUT_PINS__DIAGNOSTICCHAIN_MAP :
				return validateBodyOutputPins(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.LOOP_NODE___VALIDATE_SETUP_TEST_AND_BODY__DIAGNOSTICCHAIN_MAP :
				return validateSetupTestAndBody(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.LOOP_NODE___VALIDATE_MATCHING_OUTPUT_PINS__DIAGNOSTICCHAIN_MAP :
				return validateMatchingOutputPins(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.LOOP_NODE___VALIDATE_MATCHING_LOOP_VARIABLES__DIAGNOSTICCHAIN_MAP :
				return validateMatchingLoopVariables(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.LOOP_NODE___VALIDATE_MATCHING_RESULT_PINS__DIAGNOSTICCHAIN_MAP :
				return validateMatchingResultPins(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.LOOP_NODE___VALIDATE_LOOP_VARIABLE_OUTGOING__DIAGNOSTICCHAIN_MAP :
				return validateLoopVariableOutgoing(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		}
		return eDynamicInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| eIsSet(UMLPackage.LOOP_NODE__LOOP_VARIABLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InputPin> getStructuredNodeInputs() {
		return getLoopVariableInputs();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStructuredNodeInputs() {
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OutputPin> getStructuredNodeOutputs() {
		return getResults();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStructuredNodeOutputs() {
		return false;
	}

	protected static final int[] INPUT_ESUBSETS = new int[]{
		UMLPackage.LOOP_NODE__LOOP_VARIABLE_INPUT};

	@Override
	public EList<InputPin> getInputs() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			@SuppressWarnings("unchecked")
			EList<InputPin> inputs = (EList<InputPin>) cache.get(eResource,
				this, UMLPackage.Literals.ACTION__INPUT);
			if (inputs == null) {
				cache.put(eResource, this, UMLPackage.Literals.ACTION__INPUT,
					inputs = new DerivedUnionEObjectEList<InputPin>(
						InputPin.class, this, UMLPackage.LOOP_NODE__INPUT,
						INPUT_ESUBSETS));
			}
			return inputs;
		}
		return new DerivedUnionEObjectEList<InputPin>(InputPin.class, this,
			UMLPackage.LOOP_NODE__INPUT, INPUT_ESUBSETS);
	}

	protected static final int[] OUTPUT_ESUBSETS = new int[]{
		UMLPackage.LOOP_NODE__RESULT};

	@Override
	public EList<OutputPin> getOutputs() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			@SuppressWarnings("unchecked")
			EList<OutputPin> outputs = (EList<OutputPin>) cache.get(eResource,
				this, UMLPackage.Literals.ACTION__OUTPUT);
			if (outputs == null) {
				cache.put(eResource, this, UMLPackage.Literals.ACTION__OUTPUT,
					outputs = new DerivedUnionEObjectEList<OutputPin>(
						OutputPin.class, this, UMLPackage.LOOP_NODE__OUTPUT,
						OUTPUT_ESUBSETS));
			}
			return outputs;
		}
		return new DerivedUnionEObjectEList<OutputPin>(OutputPin.class, this,
			UMLPackage.LOOP_NODE__OUTPUT, OUTPUT_ESUBSETS);
	}

} //LoopNodeImpl
