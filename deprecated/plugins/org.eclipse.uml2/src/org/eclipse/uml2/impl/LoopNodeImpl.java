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
 * $Id: LoopNodeImpl.java,v 1.15 2005/11/04 22:23:01 khussey Exp $
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

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Loop Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.LoopNodeImpl#getOutputs <em>Output</em>}</li>
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
	protected EList bodyPart = null;

	/**
	 * The cached value of the '{@link #getSetupParts() <em>Setup Part</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetupParts()
	 * @generated
	 * @ordered
	 */
	protected EList setupPart = null;

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
	protected EList test = null;

	/**
	 * The cached value of the '{@link #getResults() <em>Result</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResults()
	 * @generated
	 * @ordered
	 */
	protected EList result = null;

	/**
	 * The cached value of the '{@link #getLoopVariables() <em>Loop Variable</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoopVariables()
	 * @generated
	 * @ordered
	 */
	protected EList loopVariable = null;

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
	 * The cached value of the '{@link #getLoopVariableInputs() <em>Loop Variable Input</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoopVariableInputs()
	 * @generated
	 * @ordered
	 */
	protected EList loopVariableInput = null;

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
		return UML2Package.eINSTANCE.getLoopNode();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOutputs() {
		if (output == null) {
			output = new DerivedUnionEObjectEList(OutputPin.class, this, UML2Package.LOOP_NODE__OUTPUT, new EStructuralFeature[] {UML2Package.eINSTANCE.getLoopNode_Result()});
		}
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOutputs() {
		return super.isSetOutputs()
			|| eIsSet(UML2Package.eINSTANCE.getLoopNode_Result());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getInputs() {
		if (input == null) {
			input = new DerivedUnionEObjectEList(InputPin.class, this, UML2Package.LOOP_NODE__INPUT, new EStructuralFeature[] {UML2Package.eINSTANCE.getLoopNode_LoopVariableInput()});
		}
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInputs() {
		return super.isSetInputs()
			|| eIsSet(UML2Package.eINSTANCE.getLoopNode_LoopVariableInput());
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
		if (bodyPart == null) {
			bodyPart = new EObjectResolvingEList(ActivityNode.class, this, UML2Package.LOOP_NODE__BODY_PART);
		}
		return bodyPart;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public ActivityNode getBodyPart(String name) {
		for (Iterator i = getBodyParts().iterator(); i.hasNext(); ) {
			ActivityNode bodyPart = (ActivityNode) i.next();
			if (name.equals(bodyPart.getName())) {
				return bodyPart;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSetupParts() {
		if (setupPart == null) {
			setupPart = new EObjectResolvingEList(ActivityNode.class, this, UML2Package.LOOP_NODE__SETUP_PART);
		}
		return setupPart;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public ActivityNode getSetupPart(String name) {
		for (Iterator i = getSetupParts().iterator(); i.hasNext(); ) {
			ActivityNode setupPart = (ActivityNode) i.next();
			if (name.equals(setupPart.getName())) {
				return setupPart;
			}
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
			OutputPin oldDecider = decider;
			decider = (OutputPin)eResolveProxy((InternalEObject)decider);
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
		if (test == null) {
			test = new EObjectResolvingEList(ActivityNode.class, this, UML2Package.LOOP_NODE__TEST);
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
	public EList getResults() {
		if (result == null) {
			result = new EObjectContainmentEList(OutputPin.class, this, UML2Package.LOOP_NODE__RESULT);
		}
		return result;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public OutputPin getResult(String name) {
		for (Iterator i = getResults().iterator(); i.hasNext(); ) {
			OutputPin result = (OutputPin) i.next();
			if (name.equals(result.getName())) {
				return result;
			}
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
	 * @generated
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
		if (loopVariable == null) {
			loopVariable = new EObjectContainmentEList(OutputPin.class, this, UML2Package.LOOP_NODE__LOOP_VARIABLE);
		}
		return loopVariable;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public OutputPin getLoopVariable(String name) {
		for (Iterator i = getLoopVariables().iterator(); i.hasNext(); ) {
			OutputPin loopVariable = (OutputPin) i.next();
			if (name.equals(loopVariable.getName())) {
				return loopVariable;
			}
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
	 * @generated
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
		if (bodyOutput == null) {
			bodyOutput = new EObjectResolvingEList(OutputPin.class, this, UML2Package.LOOP_NODE__BODY_OUTPUT);
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
	public EList getLoopVariableInputs() {
		if (loopVariableInput == null) {
			loopVariableInput = new EObjectContainmentEList(InputPin.class, this, UML2Package.LOOP_NODE__LOOP_VARIABLE_INPUT);
		}
		return loopVariableInput;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public InputPin getLoopVariableInput(String name) {
		for (Iterator i = getLoopVariableInputs().iterator(); i.hasNext(); ) {
			InputPin loopVariableInput = (InputPin) i.next();
			if (name.equals(loopVariableInput.getName())) {
				return loopVariableInput;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
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
	 * @generated
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
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
					return eBasicSetContainer(null, UML2Package.LOOP_NODE__ACTIVITY, msgs);
				case UML2Package.LOOP_NODE__IN_STRUCTURED_NODE:
					return eBasicSetContainer(null, UML2Package.LOOP_NODE__IN_STRUCTURED_NODE, msgs);
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
				default:
					return eDynamicInverseRemove(otherEnd, featureID, baseClass, msgs);
			}
		}
		return eBasicSetContainer(null, featureID, msgs);
	}

	public NotificationChain eDynamicInverseRemove(InternalEObject otherEnd, int featureID, Class inverseClass, NotificationChain msgs) {
		switch (eDerivedStructuralFeatureID(featureID, inverseClass)) {
			case UML2Package.LOOP_NODE__ACTIVITY_GROUP_ACTIVITY:
				return eBasicSetContainer(null, UML2Package.LOOP_NODE__ACTIVITY_GROUP_ACTIVITY, msgs);
			default :
				return super.eDynamicInverseRemove(otherEnd, featureID, inverseClass, msgs);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
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
		return eDynamicGet(eFeature, resolve);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(EStructuralFeature eFeature, Object newValue) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
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
		eDynamicSet(eFeature, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
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
		eDynamicUnset(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSetGen(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UML2Package.LOOP_NODE__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.LOOP_NODE__OWNED_ELEMENT:
				return isSetOwnedElements();
			case UML2Package.LOOP_NODE__OWNER:
				return isSetOwner();
			case UML2Package.LOOP_NODE__OWNED_COMMENT:
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.LOOP_NODE__TEMPLATE_BINDING:
				return templateBinding != null && !templateBinding.isEmpty();
			case UML2Package.LOOP_NODE__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case UML2Package.LOOP_NODE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.LOOP_NODE__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UML2Package.LOOP_NODE__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case UML2Package.LOOP_NODE__CLIENT_DEPENDENCY:
				return clientDependency != null && !clientDependency.isEmpty();
			case UML2Package.LOOP_NODE__NAME_EXPRESSION:
				return nameExpression != null;
			case UML2Package.LOOP_NODE__REDEFINITION_CONTEXT:
				return isSetRedefinitionContexts();
			case UML2Package.LOOP_NODE__IS_LEAF:
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UML2Package.LOOP_NODE__OUTGOING:
				return outgoing != null && !outgoing.isEmpty();
			case UML2Package.LOOP_NODE__INCOMING:
				return incoming != null && !incoming.isEmpty();
			case UML2Package.LOOP_NODE__IN_GROUP:
				return isSetInGroups();
			case UML2Package.LOOP_NODE__ACTIVITY:
				return getActivity() != null;
			case UML2Package.LOOP_NODE__REDEFINED_ELEMENT:
				return isSetRedefinedElements();
			case UML2Package.LOOP_NODE__IN_STRUCTURED_NODE:
				return getInStructuredNode() != null;
			case UML2Package.LOOP_NODE__IN_PARTITION:
				return inPartition != null && !inPartition.isEmpty();
			case UML2Package.LOOP_NODE__IN_INTERRUPTIBLE_REGION:
				return inInterruptibleRegion != null && !inInterruptibleRegion.isEmpty();
			case UML2Package.LOOP_NODE__HANDLER:
				return handler != null && !handler.isEmpty();
			case UML2Package.LOOP_NODE__EFFECT:
				return EFFECT_EDEFAULT == null ? effect != null : !EFFECT_EDEFAULT.equals(effect);
			case UML2Package.LOOP_NODE__OUTPUT:
				return isSetOutputs();
			case UML2Package.LOOP_NODE__INPUT:
				return isSetInputs();
			case UML2Package.LOOP_NODE__CONTEXT:
				return getContext() != null;
			case UML2Package.LOOP_NODE__LOCAL_PRECONDITION:
				return localPrecondition != null && !localPrecondition.isEmpty();
			case UML2Package.LOOP_NODE__LOCAL_POSTCONDITION:
				return localPostcondition != null && !localPostcondition.isEmpty();
			case UML2Package.LOOP_NODE__MEMBER:
				return isSetMembers();
			case UML2Package.LOOP_NODE__OWNED_RULE:
				return ownedRule != null && !ownedRule.isEmpty();
			case UML2Package.LOOP_NODE__IMPORTED_MEMBER:
				return !getImportedMembers().isEmpty();
			case UML2Package.LOOP_NODE__ELEMENT_IMPORT:
				return elementImport != null && !elementImport.isEmpty();
			case UML2Package.LOOP_NODE__PACKAGE_IMPORT:
				return packageImport != null && !packageImport.isEmpty();
			case UML2Package.LOOP_NODE__SUPER_GROUP:
				return isSetSuperGroup();
			case UML2Package.LOOP_NODE__ACTIVITY_GROUP_ACTIVITY:
				return isSetActivityGroup_activity();
			case UML2Package.LOOP_NODE__VARIABLE:
				return variable != null && !variable.isEmpty();
			case UML2Package.LOOP_NODE__CONTAINED_NODE:
				return isSetContainedNodes();
			case UML2Package.LOOP_NODE__CONTAINED_EDGE:
				return isSetContainedEdges();
			case UML2Package.LOOP_NODE__MUST_ISOLATE:
				return ((eFlags & MUST_ISOLATE_EFLAG) != 0) != MUST_ISOLATE_EDEFAULT;
			case UML2Package.LOOP_NODE__IS_TESTED_FIRST:
				return ((eFlags & IS_TESTED_FIRST_EFLAG) != 0) != IS_TESTED_FIRST_EDEFAULT;
			case UML2Package.LOOP_NODE__BODY_PART:
				return bodyPart != null && !bodyPart.isEmpty();
			case UML2Package.LOOP_NODE__SETUP_PART:
				return setupPart != null && !setupPart.isEmpty();
			case UML2Package.LOOP_NODE__DECIDER:
				return decider != null;
			case UML2Package.LOOP_NODE__TEST:
				return test != null && !test.isEmpty();
			case UML2Package.LOOP_NODE__RESULT:
				return result != null && !result.isEmpty();
			case UML2Package.LOOP_NODE__LOOP_VARIABLE:
				return loopVariable != null && !loopVariable.isEmpty();
			case UML2Package.LOOP_NODE__BODY_OUTPUT:
				return bodyOutput != null && !bodyOutput.isEmpty();
			case UML2Package.LOOP_NODE__LOOP_VARIABLE_INPUT:
				return loopVariableInput != null && !loopVariableInput.isEmpty();
		}
		return eDynamicIsSet(eFeature);
	}

	public boolean eIsSet(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UML2Package.LOOP_NODE__ACTIVITY:
				return false;
			case UML2Package.LOOP_NODE__ACTIVITY_GROUP_ACTIVITY:
				return false;
		}
		return eIsSetGen(eFeature);
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
	protected EList getOwnedElementsHelper(EList ownedElement) {
		super.getOwnedElementsHelper(ownedElement);
		if (eIsSet(UML2Package.eINSTANCE.getLoopNode_LoopVariable())) {
			ownedElement.addAll(getLoopVariables());
		}
		return ownedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| eIsSet(UML2Package.eINSTANCE.getLoopNode_LoopVariable());
	}

} //LoopNodeImpl
