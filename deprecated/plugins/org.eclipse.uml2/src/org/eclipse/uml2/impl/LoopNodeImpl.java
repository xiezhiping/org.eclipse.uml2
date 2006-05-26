/*
 * Copyright (c) 2003, 2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: LoopNodeImpl.java,v 1.26 2006/05/26 18:16:43 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.util.Collection;
import java.util.Iterator;

import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.common.util.UniqueEList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.Activity;
import org.eclipse.uml2.ActivityNode;
import org.eclipse.uml2.InputPin;
import org.eclipse.uml2.LoopNode;
import org.eclipse.uml2.OutputPin;
import org.eclipse.uml2.StringExpression;
import org.eclipse.uml2.StructuredActivityNode;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.VisibilityKind;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.common.util.UnionEObjectEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Loop Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.LoopNodeImpl#getOutputs <em>Output</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.LoopNodeImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.LoopNodeImpl#getInputs <em>Input</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.LoopNodeImpl#isTestedFirst <em>Is Tested First</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.LoopNodeImpl#getBodyParts <em>Body Part</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.LoopNodeImpl#getSetupParts <em>Setup Part</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.LoopNodeImpl#getDecider <em>Decider</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.LoopNodeImpl#getTests <em>Test</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.LoopNodeImpl#getResults <em>Result</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.LoopNodeImpl#getLoopVariables <em>Loop Variable</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.LoopNodeImpl#getBodyOutputs <em>Body Output</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.LoopNodeImpl#getLoopVariableInputs <em>Loop Variable Input</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LoopNodeImpl extends StructuredActivityNodeImpl implements LoopNode {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

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
	protected static final int IS_TESTED_FIRST_EFLAG = 1 << 10;

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
	 * The cached value of the '{@link #getLoopVariables() <em>Loop Variable</em>}' containment reference list.
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
		return UML2Package.Literals.LOOP_NODE;
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
			EList outputs = (EList) cache.get(eResource, this, UML2Package.Literals.ACTION__OUTPUT);
			if (outputs == null) {
				cache.put(eResource, this, UML2Package.Literals.ACTION__OUTPUT, outputs = new DerivedUnionEObjectEList(OutputPin.class, this, UML2Package.LOOP_NODE__OUTPUT, OUTPUT_ESUBSETS));
			}
			return outputs;
		}
		return new DerivedUnionEObjectEList(OutputPin.class, this, UML2Package.LOOP_NODE__OUTPUT, OUTPUT_ESUBSETS);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOutputs() {
		return super.isSetOutputs()
			|| eIsSet(UML2Package.LOOP_NODE__RESULT);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getOutputs() <em>Output</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputs()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OUTPUT_ESUBSETS = new int[] {UML2Package.LOOP_NODE__RESULT};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedElements() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			EList ownedElements = (EList) cache.get(eResource(), this, UML2Package.Literals.ELEMENT__OWNED_ELEMENT);
			if (ownedElements == null) {
				List union = getOwnedElementsHelper(new UniqueEList.FastCompare());
				cache.put(eResource(), this, UML2Package.Literals.ELEMENT__OWNED_ELEMENT, ownedElements = new UnionEObjectEList(this, UML2Package.Literals.ELEMENT__OWNED_ELEMENT, union.size(), union.toArray()));
			}
			return ownedElements;
		}
		List union = getOwnedElementsHelper(new UniqueEList.FastCompare());
		return new UnionEObjectEList(this, UML2Package.Literals.ELEMENT__OWNED_ELEMENT, union.size(), union.toArray());
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
			EList inputs = (EList) cache.get(eResource, this, UML2Package.Literals.ACTION__INPUT);
			if (inputs == null) {
				cache.put(eResource, this, UML2Package.Literals.ACTION__INPUT, inputs = new DerivedUnionEObjectEList(InputPin.class, this, UML2Package.LOOP_NODE__INPUT, INPUT_ESUBSETS));
			}
			return inputs;
		}
		return new DerivedUnionEObjectEList(InputPin.class, this, UML2Package.LOOP_NODE__INPUT, INPUT_ESUBSETS);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInputs() {
		return super.isSetInputs()
			|| eIsSet(UML2Package.LOOP_NODE__LOOP_VARIABLE_INPUT);
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
		if (newIsTestedFirst) eFlags |= IS_TESTED_FIRST_EFLAG; else eFlags &= ~IS_TESTED_FIRST_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.LOOP_NODE__IS_TESTED_FIRST, oldIsTestedFirst, newIsTestedFirst));


	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getBodyParts() {
		if (bodyParts == null) {
			bodyParts = new EObjectResolvingEList(ActivityNode.class, this, UML2Package.LOOP_NODE__BODY_PART);
		}
		return bodyParts;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public ActivityNode getBodyPart(String name) {
		return getBodyPart(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNode getBodyPart(String name, boolean ignoreCase, EClass eClass) {
		bodyPartLoop: for (Iterator i = getBodyParts().iterator(); i.hasNext(); ) {
			ActivityNode bodyPart = (ActivityNode) i.next();
			if (eClass != null && !eClass.isInstance(bodyPart))
				continue bodyPartLoop;
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(bodyPart.getName()) : name.equals(bodyPart.getName())))
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
			setupParts = new EObjectResolvingEList(ActivityNode.class, this, UML2Package.LOOP_NODE__SETUP_PART);
		}
		return setupParts;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public ActivityNode getSetupPart(String name) {
		return getSetupPart(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNode getSetupPart(String name, boolean ignoreCase, EClass eClass) {
		setupPartLoop: for (Iterator i = getSetupParts().iterator(); i.hasNext(); ) {
			ActivityNode setupPart = (ActivityNode) i.next();
			if (eClass != null && !eClass.isInstance(setupPart))
				continue setupPartLoop;
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(setupPart.getName()) : name.equals(setupPart.getName())))
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
			InternalEObject oldDecider = (InternalEObject)decider;
			decider = (OutputPin)eResolveProxy(oldDecider);
			if (decider != oldDecider) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2Package.LOOP_NODE__DECIDER, oldDecider, decider));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.LOOP_NODE__DECIDER, oldDecider, decider));


	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getTests() {
		if (tests == null) {
			tests = new EObjectResolvingEList(ActivityNode.class, this, UML2Package.LOOP_NODE__TEST);
		}
		return tests;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public ActivityNode getTest(String name) {
		return getTest(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNode getTest(String name, boolean ignoreCase, EClass eClass) {
		testLoop: for (Iterator i = getTests().iterator(); i.hasNext(); ) {
			ActivityNode test = (ActivityNode) i.next();
			if (eClass != null && !eClass.isInstance(test))
				continue testLoop;
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(test.getName()) : name.equals(test.getName())))
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
			results = new EObjectContainmentEList(OutputPin.class, this, UML2Package.LOOP_NODE__RESULT);
		}
		return results;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public OutputPin getResult(String name) {
		return getResult(name, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPin getResult(String name, boolean ignoreCase) {
		resultLoop: for (Iterator i = getResults().iterator(); i.hasNext(); ) {
			OutputPin result = (OutputPin) i.next();
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(result.getName()) : name.equals(result.getName())))
				continue resultLoop;
			return result;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @deprecated Use #createResult() instead.
	 */
	public OutputPin createResult(EClass eClass) {
		OutputPin newResult = (OutputPin) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.LOOP_NODE__RESULT, null, newResult));
		}
		getResults().add(newResult);
		return newResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public OutputPin createResult() {
		OutputPin newResult = UML2Factory.eINSTANCE.createOutputPin();
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.LOOP_NODE__RESULT, null, newResult));
		}
		getResults().add(newResult);
		return newResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getLoopVariables() {
		if (loopVariables == null) {
			loopVariables = new EObjectContainmentEList(OutputPin.class, this, UML2Package.LOOP_NODE__LOOP_VARIABLE);
		}
		return loopVariables;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public OutputPin getLoopVariable(String name) {
		return getLoopVariable(name, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPin getLoopVariable(String name, boolean ignoreCase) {
		loopVariableLoop: for (Iterator i = getLoopVariables().iterator(); i.hasNext(); ) {
			OutputPin loopVariable = (OutputPin) i.next();
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(loopVariable.getName()) : name.equals(loopVariable.getName())))
				continue loopVariableLoop;
			return loopVariable;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @deprecated Use #createLoopVariable() instead.
	 */
	public OutputPin createLoopVariable(EClass eClass) {
		OutputPin newLoopVariable = (OutputPin) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.LOOP_NODE__LOOP_VARIABLE, null, newLoopVariable));
		}
		getLoopVariables().add(newLoopVariable);
		return newLoopVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public OutputPin createLoopVariable() {
		OutputPin newLoopVariable = UML2Factory.eINSTANCE.createOutputPin();
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.LOOP_NODE__LOOP_VARIABLE, null, newLoopVariable));
		}
		getLoopVariables().add(newLoopVariable);
		return newLoopVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getBodyOutputs() {
		if (bodyOutputs == null) {
			bodyOutputs = new EObjectResolvingEList(OutputPin.class, this, UML2Package.LOOP_NODE__BODY_OUTPUT);
		}
		return bodyOutputs;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public OutputPin getBodyOutput(String name) {
		return getBodyOutput(name, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPin getBodyOutput(String name, boolean ignoreCase) {
		bodyOutputLoop: for (Iterator i = getBodyOutputs().iterator(); i.hasNext(); ) {
			OutputPin bodyOutput = (OutputPin) i.next();
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(bodyOutput.getName()) : name.equals(bodyOutput.getName())))
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
			loopVariableInputs = new EObjectContainmentEList(InputPin.class, this, UML2Package.LOOP_NODE__LOOP_VARIABLE_INPUT);
		}
		return loopVariableInputs;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public InputPin getLoopVariableInput(String name) {
		return getLoopVariableInput(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin getLoopVariableInput(String name, boolean ignoreCase, EClass eClass) {
		loopVariableInputLoop: for (Iterator i = getLoopVariableInputs().iterator(); i.hasNext(); ) {
			InputPin loopVariableInput = (InputPin) i.next();
			if (eClass != null && !eClass.isInstance(loopVariableInput))
				continue loopVariableInputLoop;
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(loopVariableInput.getName()) : name.equals(loopVariableInput.getName())))
				continue loopVariableInputLoop;
			return loopVariableInput;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UML2Package.LOOP_NODE__EANNOTATIONS:
				return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
			case UML2Package.LOOP_NODE__OWNED_COMMENT:
				return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
			case UML2Package.LOOP_NODE__TEMPLATE_BINDING:
				return ((InternalEList)getTemplateBindings()).basicRemove(otherEnd, msgs);
			case UML2Package.LOOP_NODE__OWNED_TEMPLATE_SIGNATURE:
				return basicSetOwnedTemplateSignature(null, msgs);
			case UML2Package.LOOP_NODE__CLIENT_DEPENDENCY:
				return ((InternalEList)getClientDependencies()).basicRemove(otherEnd, msgs);
			case UML2Package.LOOP_NODE__NAME_EXPRESSION:
				return basicSetNameExpression(null, msgs);
			case UML2Package.LOOP_NODE__OUTGOING:
				return ((InternalEList)getOutgoings()).basicRemove(otherEnd, msgs);
			case UML2Package.LOOP_NODE__INCOMING:
				return ((InternalEList)getIncomings()).basicRemove(otherEnd, msgs);
			case UML2Package.LOOP_NODE__ACTIVITY:
				return basicSetActivity(null, msgs);
			case UML2Package.LOOP_NODE__IN_STRUCTURED_NODE:
				return basicSetInStructuredNode(null, msgs);
			case UML2Package.LOOP_NODE__IN_PARTITION:
				return ((InternalEList)getInPartitions()).basicRemove(otherEnd, msgs);
			case UML2Package.LOOP_NODE__IN_INTERRUPTIBLE_REGION:
				return ((InternalEList)getInInterruptibleRegions()).basicRemove(otherEnd, msgs);
			case UML2Package.LOOP_NODE__HANDLER:
				return ((InternalEList)getHandlers()).basicRemove(otherEnd, msgs);
			case UML2Package.LOOP_NODE__LOCAL_PRECONDITION:
				return ((InternalEList)getLocalPreconditions()).basicRemove(otherEnd, msgs);
			case UML2Package.LOOP_NODE__LOCAL_POSTCONDITION:
				return ((InternalEList)getLocalPostconditions()).basicRemove(otherEnd, msgs);
			case UML2Package.LOOP_NODE__OWNED_RULE:
				return ((InternalEList)getOwnedRules()).basicRemove(otherEnd, msgs);
			case UML2Package.LOOP_NODE__ELEMENT_IMPORT:
				return ((InternalEList)getElementImports()).basicRemove(otherEnd, msgs);
			case UML2Package.LOOP_NODE__PACKAGE_IMPORT:
				return ((InternalEList)getPackageImports()).basicRemove(otherEnd, msgs);
			case UML2Package.LOOP_NODE__ACTIVITY_GROUP_ACTIVITY:
				return basicSetActivityGroup_activity(null, msgs);
			case UML2Package.LOOP_NODE__VARIABLE:
				return ((InternalEList)getVariables()).basicRemove(otherEnd, msgs);
			case UML2Package.LOOP_NODE__CONTAINED_NODE:
				return ((InternalEList)getContainedNodes()).basicRemove(otherEnd, msgs);
			case UML2Package.LOOP_NODE__CONTAINED_EDGE:
				return ((InternalEList)getContainedEdges()).basicRemove(otherEnd, msgs);
			case UML2Package.LOOP_NODE__RESULT:
				return ((InternalEList)getResults()).basicRemove(otherEnd, msgs);
			case UML2Package.LOOP_NODE__LOOP_VARIABLE:
				return ((InternalEList)getLoopVariables()).basicRemove(otherEnd, msgs);
			case UML2Package.LOOP_NODE__LOOP_VARIABLE_INPUT:
				return ((InternalEList)getLoopVariableInputs()).basicRemove(otherEnd, msgs);
		}
		return eDynamicInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public InputPin createLoopVariableInput(EClass eClass) {
		InputPin newLoopVariableInput = (InputPin) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.LOOP_NODE__LOOP_VARIABLE_INPUT, null, newLoopVariableInput));
		}
		getLoopVariableInputs().add(newLoopVariableInput);
		return newLoopVariableInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public InputPin createLoopVariableInput() {
		InputPin newLoopVariableInput = UML2Factory.eINSTANCE.createInputPin();
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.LOOP_NODE__LOOP_VARIABLE_INPUT, null, newLoopVariableInput));
		}
		getLoopVariableInputs().add(newLoopVariableInput);
		return newLoopVariableInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UML2Package.LOOP_NODE__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.LOOP_NODE__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.LOOP_NODE__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.LOOP_NODE__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.LOOP_NODE__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.LOOP_NODE__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UML2Package.LOOP_NODE__NAME:
				return getName();
			case UML2Package.LOOP_NODE__QUALIFIED_NAME:
				return getQualifiedName();
			case UML2Package.LOOP_NODE__VISIBILITY:
				return getVisibility();
			case UML2Package.LOOP_NODE__CLIENT_DEPENDENCY:
				return getClientDependencies();
			case UML2Package.LOOP_NODE__NAME_EXPRESSION:
				return getNameExpression();
			case UML2Package.LOOP_NODE__REDEFINITION_CONTEXT:
				return getRedefinitionContexts();
			case UML2Package.LOOP_NODE__IS_LEAF:
				return isLeaf() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.LOOP_NODE__OUTGOING:
				return getOutgoings();
			case UML2Package.LOOP_NODE__INCOMING:
				return getIncomings();
			case UML2Package.LOOP_NODE__IN_GROUP:
				return getInGroups();
			case UML2Package.LOOP_NODE__ACTIVITY:
				return getActivity();
			case UML2Package.LOOP_NODE__REDEFINED_ELEMENT:
				return getRedefinedElements();
			case UML2Package.LOOP_NODE__IN_STRUCTURED_NODE:
				return getInStructuredNode();
			case UML2Package.LOOP_NODE__IN_PARTITION:
				return getInPartitions();
			case UML2Package.LOOP_NODE__IN_INTERRUPTIBLE_REGION:
				return getInInterruptibleRegions();
			case UML2Package.LOOP_NODE__HANDLER:
				return getHandlers();
			case UML2Package.LOOP_NODE__EFFECT:
				return getEffect();
			case UML2Package.LOOP_NODE__OUTPUT:
				return getOutputs();
			case UML2Package.LOOP_NODE__INPUT:
				return getInputs();
			case UML2Package.LOOP_NODE__CONTEXT:
				return getContext();
			case UML2Package.LOOP_NODE__LOCAL_PRECONDITION:
				return getLocalPreconditions();
			case UML2Package.LOOP_NODE__LOCAL_POSTCONDITION:
				return getLocalPostconditions();
			case UML2Package.LOOP_NODE__MEMBER:
				return getMembers();
			case UML2Package.LOOP_NODE__OWNED_RULE:
				return getOwnedRules();
			case UML2Package.LOOP_NODE__IMPORTED_MEMBER:
				return getImportedMembers();
			case UML2Package.LOOP_NODE__ELEMENT_IMPORT:
				return getElementImports();
			case UML2Package.LOOP_NODE__PACKAGE_IMPORT:
				return getPackageImports();
			case UML2Package.LOOP_NODE__SUPER_GROUP:
				if (resolve) return getSuperGroup();
				return basicGetSuperGroup();
			case UML2Package.LOOP_NODE__ACTIVITY_GROUP_ACTIVITY:
				return getActivityGroup_activity();
			case UML2Package.LOOP_NODE__VARIABLE:
				return getVariables();
			case UML2Package.LOOP_NODE__CONTAINED_NODE:
				return getContainedNodes();
			case UML2Package.LOOP_NODE__CONTAINED_EDGE:
				return getContainedEdges();
			case UML2Package.LOOP_NODE__MUST_ISOLATE:
				return isMustIsolate() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.LOOP_NODE__IS_TESTED_FIRST:
				return isTestedFirst() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.LOOP_NODE__BODY_PART:
				return getBodyParts();
			case UML2Package.LOOP_NODE__SETUP_PART:
				return getSetupParts();
			case UML2Package.LOOP_NODE__DECIDER:
				if (resolve) return getDecider();
				return basicGetDecider();
			case UML2Package.LOOP_NODE__TEST:
				return getTests();
			case UML2Package.LOOP_NODE__RESULT:
				return getResults();
			case UML2Package.LOOP_NODE__LOOP_VARIABLE:
				return getLoopVariables();
			case UML2Package.LOOP_NODE__BODY_OUTPUT:
				return getBodyOutputs();
			case UML2Package.LOOP_NODE__LOOP_VARIABLE_INPUT:
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
			case UML2Package.LOOP_NODE__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.LOOP_NODE__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.LOOP_NODE__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection)newValue);
				return;
			case UML2Package.LOOP_NODE__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case UML2Package.LOOP_NODE__NAME:
				setName((String)newValue);
				return;
			case UML2Package.LOOP_NODE__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case UML2Package.LOOP_NODE__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection)newValue);
				return;
			case UML2Package.LOOP_NODE__NAME_EXPRESSION:
				setNameExpression((StringExpression)newValue);
				return;
			case UML2Package.LOOP_NODE__IS_LEAF:
				setIsLeaf(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.LOOP_NODE__OUTGOING:
				getOutgoings().clear();
				getOutgoings().addAll((Collection)newValue);
				return;
			case UML2Package.LOOP_NODE__INCOMING:
				getIncomings().clear();
				getIncomings().addAll((Collection)newValue);
				return;
			case UML2Package.LOOP_NODE__ACTIVITY:
				setActivity((Activity)newValue);
				return;
			case UML2Package.LOOP_NODE__REDEFINED_ELEMENT:
				getRedefinedElements().clear();
				getRedefinedElements().addAll((Collection)newValue);
				return;
			case UML2Package.LOOP_NODE__IN_STRUCTURED_NODE:
				setInStructuredNode((StructuredActivityNode)newValue);
				return;
			case UML2Package.LOOP_NODE__IN_PARTITION:
				getInPartitions().clear();
				getInPartitions().addAll((Collection)newValue);
				return;
			case UML2Package.LOOP_NODE__IN_INTERRUPTIBLE_REGION:
				getInInterruptibleRegions().clear();
				getInInterruptibleRegions().addAll((Collection)newValue);
				return;
			case UML2Package.LOOP_NODE__HANDLER:
				getHandlers().clear();
				getHandlers().addAll((Collection)newValue);
				return;
			case UML2Package.LOOP_NODE__EFFECT:
				setEffect((String)newValue);
				return;
			case UML2Package.LOOP_NODE__LOCAL_PRECONDITION:
				getLocalPreconditions().clear();
				getLocalPreconditions().addAll((Collection)newValue);
				return;
			case UML2Package.LOOP_NODE__LOCAL_POSTCONDITION:
				getLocalPostconditions().clear();
				getLocalPostconditions().addAll((Collection)newValue);
				return;
			case UML2Package.LOOP_NODE__OWNED_RULE:
				getOwnedRules().clear();
				getOwnedRules().addAll((Collection)newValue);
				return;
			case UML2Package.LOOP_NODE__ELEMENT_IMPORT:
				getElementImports().clear();
				getElementImports().addAll((Collection)newValue);
				return;
			case UML2Package.LOOP_NODE__PACKAGE_IMPORT:
				getPackageImports().clear();
				getPackageImports().addAll((Collection)newValue);
				return;
			case UML2Package.LOOP_NODE__ACTIVITY_GROUP_ACTIVITY:
				setActivityGroup_activity((Activity)newValue);
				return;
			case UML2Package.LOOP_NODE__VARIABLE:
				getVariables().clear();
				getVariables().addAll((Collection)newValue);
				return;
			case UML2Package.LOOP_NODE__CONTAINED_NODE:
				getContainedNodes().clear();
				getContainedNodes().addAll((Collection)newValue);
				return;
			case UML2Package.LOOP_NODE__CONTAINED_EDGE:
				getContainedEdges().clear();
				getContainedEdges().addAll((Collection)newValue);
				return;
			case UML2Package.LOOP_NODE__MUST_ISOLATE:
				setMustIsolate(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.LOOP_NODE__IS_TESTED_FIRST:
				setIsTestedFirst(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.LOOP_NODE__BODY_PART:
				getBodyParts().clear();
				getBodyParts().addAll((Collection)newValue);
				return;
			case UML2Package.LOOP_NODE__SETUP_PART:
				getSetupParts().clear();
				getSetupParts().addAll((Collection)newValue);
				return;
			case UML2Package.LOOP_NODE__DECIDER:
				setDecider((OutputPin)newValue);
				return;
			case UML2Package.LOOP_NODE__TEST:
				getTests().clear();
				getTests().addAll((Collection)newValue);
				return;
			case UML2Package.LOOP_NODE__RESULT:
				getResults().clear();
				getResults().addAll((Collection)newValue);
				return;
			case UML2Package.LOOP_NODE__LOOP_VARIABLE:
				getLoopVariables().clear();
				getLoopVariables().addAll((Collection)newValue);
				return;
			case UML2Package.LOOP_NODE__BODY_OUTPUT:
				getBodyOutputs().clear();
				getBodyOutputs().addAll((Collection)newValue);
				return;
			case UML2Package.LOOP_NODE__LOOP_VARIABLE_INPUT:
				getLoopVariableInputs().clear();
				getLoopVariableInputs().addAll((Collection)newValue);
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
			case UML2Package.LOOP_NODE__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.LOOP_NODE__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.LOOP_NODE__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				return;
			case UML2Package.LOOP_NODE__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case UML2Package.LOOP_NODE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UML2Package.LOOP_NODE__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UML2Package.LOOP_NODE__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				return;
			case UML2Package.LOOP_NODE__NAME_EXPRESSION:
				setNameExpression((StringExpression)null);
				return;
			case UML2Package.LOOP_NODE__IS_LEAF:
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UML2Package.LOOP_NODE__OUTGOING:
				getOutgoings().clear();
				return;
			case UML2Package.LOOP_NODE__INCOMING:
				getIncomings().clear();
				return;
			case UML2Package.LOOP_NODE__ACTIVITY:
				setActivity((Activity)null);
				return;
			case UML2Package.LOOP_NODE__REDEFINED_ELEMENT:
				getRedefinedElements().clear();
				return;
			case UML2Package.LOOP_NODE__IN_STRUCTURED_NODE:
				setInStructuredNode((StructuredActivityNode)null);
				return;
			case UML2Package.LOOP_NODE__IN_PARTITION:
				getInPartitions().clear();
				return;
			case UML2Package.LOOP_NODE__IN_INTERRUPTIBLE_REGION:
				getInInterruptibleRegions().clear();
				return;
			case UML2Package.LOOP_NODE__HANDLER:
				getHandlers().clear();
				return;
			case UML2Package.LOOP_NODE__EFFECT:
				setEffect(EFFECT_EDEFAULT);
				return;
			case UML2Package.LOOP_NODE__LOCAL_PRECONDITION:
				getLocalPreconditions().clear();
				return;
			case UML2Package.LOOP_NODE__LOCAL_POSTCONDITION:
				getLocalPostconditions().clear();
				return;
			case UML2Package.LOOP_NODE__OWNED_RULE:
				getOwnedRules().clear();
				return;
			case UML2Package.LOOP_NODE__ELEMENT_IMPORT:
				getElementImports().clear();
				return;
			case UML2Package.LOOP_NODE__PACKAGE_IMPORT:
				getPackageImports().clear();
				return;
			case UML2Package.LOOP_NODE__ACTIVITY_GROUP_ACTIVITY:
				setActivityGroup_activity((Activity)null);
				return;
			case UML2Package.LOOP_NODE__VARIABLE:
				getVariables().clear();
				return;
			case UML2Package.LOOP_NODE__CONTAINED_NODE:
				getContainedNodes().clear();
				return;
			case UML2Package.LOOP_NODE__CONTAINED_EDGE:
				getContainedEdges().clear();
				return;
			case UML2Package.LOOP_NODE__MUST_ISOLATE:
				setMustIsolate(MUST_ISOLATE_EDEFAULT);
				return;
			case UML2Package.LOOP_NODE__IS_TESTED_FIRST:
				setIsTestedFirst(IS_TESTED_FIRST_EDEFAULT);
				return;
			case UML2Package.LOOP_NODE__BODY_PART:
				getBodyParts().clear();
				return;
			case UML2Package.LOOP_NODE__SETUP_PART:
				getSetupParts().clear();
				return;
			case UML2Package.LOOP_NODE__DECIDER:
				setDecider((OutputPin)null);
				return;
			case UML2Package.LOOP_NODE__TEST:
				getTests().clear();
				return;
			case UML2Package.LOOP_NODE__RESULT:
				getResults().clear();
				return;
			case UML2Package.LOOP_NODE__LOOP_VARIABLE:
				getLoopVariables().clear();
				return;
			case UML2Package.LOOP_NODE__BODY_OUTPUT:
				getBodyOutputs().clear();
				return;
			case UML2Package.LOOP_NODE__LOOP_VARIABLE_INPUT:
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
			case UML2Package.LOOP_NODE__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.LOOP_NODE__OWNED_ELEMENT:
				return isSetOwnedElements();
			case UML2Package.LOOP_NODE__OWNER:
				return isSetOwner();
			case UML2Package.LOOP_NODE__OWNED_COMMENT:
				return ownedComments != null && !ownedComments.isEmpty();
			case UML2Package.LOOP_NODE__TEMPLATE_BINDING:
				return templateBindings != null && !templateBindings.isEmpty();
			case UML2Package.LOOP_NODE__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case UML2Package.LOOP_NODE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.LOOP_NODE__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UML2Package.LOOP_NODE__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case UML2Package.LOOP_NODE__CLIENT_DEPENDENCY:
				return clientDependencies != null && !clientDependencies.isEmpty();
			case UML2Package.LOOP_NODE__NAME_EXPRESSION:
				return nameExpression != null;
			case UML2Package.LOOP_NODE__REDEFINITION_CONTEXT:
				return isSetRedefinitionContexts();
			case UML2Package.LOOP_NODE__IS_LEAF:
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UML2Package.LOOP_NODE__OUTGOING:
				return outgoings != null && !outgoings.isEmpty();
			case UML2Package.LOOP_NODE__INCOMING:
				return incomings != null && !incomings.isEmpty();
			case UML2Package.LOOP_NODE__IN_GROUP:
				return isSetInGroups();
			case UML2Package.LOOP_NODE__ACTIVITY:
				return isSetActivity();
			case UML2Package.LOOP_NODE__REDEFINED_ELEMENT:
				return isSetRedefinedElements();
			case UML2Package.LOOP_NODE__IN_STRUCTURED_NODE:
				return getInStructuredNode() != null;
			case UML2Package.LOOP_NODE__IN_PARTITION:
				return inPartitions != null && !inPartitions.isEmpty();
			case UML2Package.LOOP_NODE__IN_INTERRUPTIBLE_REGION:
				return inInterruptibleRegions != null && !inInterruptibleRegions.isEmpty();
			case UML2Package.LOOP_NODE__HANDLER:
				return handlers != null && !handlers.isEmpty();
			case UML2Package.LOOP_NODE__EFFECT:
				return EFFECT_EDEFAULT == null ? effect != null : !EFFECT_EDEFAULT.equals(effect);
			case UML2Package.LOOP_NODE__OUTPUT:
				return isSetOutputs();
			case UML2Package.LOOP_NODE__INPUT:
				return isSetInputs();
			case UML2Package.LOOP_NODE__CONTEXT:
				return getContext() != null;
			case UML2Package.LOOP_NODE__LOCAL_PRECONDITION:
				return localPreconditions != null && !localPreconditions.isEmpty();
			case UML2Package.LOOP_NODE__LOCAL_POSTCONDITION:
				return localPostconditions != null && !localPostconditions.isEmpty();
			case UML2Package.LOOP_NODE__MEMBER:
				return isSetMembers();
			case UML2Package.LOOP_NODE__OWNED_RULE:
				return ownedRules != null && !ownedRules.isEmpty();
			case UML2Package.LOOP_NODE__IMPORTED_MEMBER:
				return !getImportedMembers().isEmpty();
			case UML2Package.LOOP_NODE__ELEMENT_IMPORT:
				return elementImports != null && !elementImports.isEmpty();
			case UML2Package.LOOP_NODE__PACKAGE_IMPORT:
				return packageImports != null && !packageImports.isEmpty();
			case UML2Package.LOOP_NODE__SUPER_GROUP:
				return isSetSuperGroup();
			case UML2Package.LOOP_NODE__ACTIVITY_GROUP_ACTIVITY:
				return isSetActivityGroup_activity();
			case UML2Package.LOOP_NODE__VARIABLE:
				return variables != null && !variables.isEmpty();
			case UML2Package.LOOP_NODE__CONTAINED_NODE:
				return isSetContainedNodes();
			case UML2Package.LOOP_NODE__CONTAINED_EDGE:
				return isSetContainedEdges();
			case UML2Package.LOOP_NODE__MUST_ISOLATE:
				return ((eFlags & MUST_ISOLATE_EFLAG) != 0) != MUST_ISOLATE_EDEFAULT;
			case UML2Package.LOOP_NODE__IS_TESTED_FIRST:
				return ((eFlags & IS_TESTED_FIRST_EFLAG) != 0) != IS_TESTED_FIRST_EDEFAULT;
			case UML2Package.LOOP_NODE__BODY_PART:
				return bodyParts != null && !bodyParts.isEmpty();
			case UML2Package.LOOP_NODE__SETUP_PART:
				return setupParts != null && !setupParts.isEmpty();
			case UML2Package.LOOP_NODE__DECIDER:
				return decider != null;
			case UML2Package.LOOP_NODE__TEST:
				return tests != null && !tests.isEmpty();
			case UML2Package.LOOP_NODE__RESULT:
				return results != null && !results.isEmpty();
			case UML2Package.LOOP_NODE__LOOP_VARIABLE:
				return loopVariables != null && !loopVariables.isEmpty();
			case UML2Package.LOOP_NODE__BODY_OUTPUT:
				return bodyOutputs != null && !bodyOutputs.isEmpty();
			case UML2Package.LOOP_NODE__LOOP_VARIABLE_INPUT:
				return loopVariableInputs != null && !loopVariableInputs.isEmpty();
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

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
	protected EList getOwnedElementsHelper(EList ownedElements) {
		super.getOwnedElementsHelper(ownedElements);
		if (eIsSet(UML2Package.LOOP_NODE__LOOP_VARIABLE)) {
			ownedElements.addAll(getLoopVariables());
		}
		return ownedElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| eIsSet(UML2Package.LOOP_NODE__LOOP_VARIABLE);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getOwnedElements() <em>Owned Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedElements()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_ELEMENT_ESUBSETS = new int[] {UML2Package.LOOP_NODE__OWNED_COMMENT, UML2Package.LOOP_NODE__TEMPLATE_BINDING, UML2Package.LOOP_NODE__OWNED_TEMPLATE_SIGNATURE, UML2Package.LOOP_NODE__NAME_EXPRESSION, UML2Package.LOOP_NODE__HANDLER, UML2Package.LOOP_NODE__LOCAL_PRECONDITION, UML2Package.LOOP_NODE__LOCAL_POSTCONDITION, UML2Package.LOOP_NODE__ELEMENT_IMPORT, UML2Package.LOOP_NODE__PACKAGE_IMPORT, UML2Package.LOOP_NODE__LOOP_VARIABLE};

	/**
	 * The array of subset feature identifiers for the '{@link #getInputs() <em>Input</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputs()
	 * @generated
	 * @ordered
	 */
	protected static final int[] INPUT_ESUBSETS = new int[] {UML2Package.LOOP_NODE__LOOP_VARIABLE_INPUT};

} //LoopNodeImpl
