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

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Map;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;

import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.ActivityEdge;
import org.eclipse.uml2.uml.ActivityNode;
import org.eclipse.uml2.uml.ActivityPartition;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.ExceptionHandler;
import org.eclipse.uml2.uml.InputPin;
import org.eclipse.uml2.uml.InterruptibleActivityRegion;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.OpaqueAction;
import org.eclipse.uml2.uml.OutputPin;
import org.eclipse.uml2.uml.RedefinableElement;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.StructuredActivityNode;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;
import org.eclipse.uml2.uml.internal.operations.OpaqueActionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Opaque Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.OpaqueActionImpl#getInputs <em>Input</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.OpaqueActionImpl#getOutputs <em>Output</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.OpaqueActionImpl#getBodies <em>Body</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.OpaqueActionImpl#getInputValues <em>Input Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.OpaqueActionImpl#getLanguages <em>Language</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.OpaqueActionImpl#getOutputValues <em>Output Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OpaqueActionImpl
		extends ActionImpl
		implements OpaqueAction {

	/**
	 * The cached value of the '{@link #getBodies() <em>Body</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodies()
	 * @generated
	 * @ordered
	 */
	protected EList<String> bodies;

	/**
	 * The cached value of the '{@link #getInputValues() <em>Input Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputValues()
	 * @generated
	 * @ordered
	 */
	protected EList<InputPin> inputValues;

	/**
	 * The cached value of the '{@link #getLanguages() <em>Language</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguages()
	 * @generated
	 * @ordered
	 */
	protected EList<String> languages;

	/**
	 * The cached value of the '{@link #getOutputValues() <em>Output Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputValues()
	 * @generated
	 * @ordered
	 */
	protected EList<OutputPin> outputValues;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OpaqueActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.OPAQUE_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
						InputPin.class, this, UMLPackage.OPAQUE_ACTION__INPUT,
						INPUT_ESUBSETS));
			}
			return inputs;
		}
		return new DerivedUnionEObjectEList<InputPin>(InputPin.class, this,
			UMLPackage.OPAQUE_ACTION__INPUT, INPUT_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
						OutputPin.class, this, UMLPackage.OPAQUE_ACTION__OUTPUT,
						OUTPUT_ESUBSETS));
			}
			return outputs;
		}
		return new DerivedUnionEObjectEList<OutputPin>(OutputPin.class, this,
			UMLPackage.OPAQUE_ACTION__OUTPUT, OUTPUT_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getBodies() {
		if (bodies == null) {
			bodies = new EDataTypeEList.Unsettable<String>(String.class, this,
				UMLPackage.OPAQUE_ACTION__BODY);
		}
		return bodies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBodies() {
		if (bodies != null)
			((InternalEList.Unsettable<?>) bodies).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBodies() {
		return bodies != null && ((InternalEList.Unsettable<?>) bodies).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getLanguages() {
		if (languages == null) {
			languages = new EDataTypeUniqueEList.Unsettable<String>(
				String.class, this, UMLPackage.OPAQUE_ACTION__LANGUAGE);
		}
		return languages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLanguages() {
		if (languages != null)
			((InternalEList.Unsettable<?>) languages).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLanguages() {
		return languages != null
			&& ((InternalEList.Unsettable<?>) languages).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputPin> getInputValues() {
		if (inputValues == null) {
			inputValues = new EObjectContainmentEList.Resolving<InputPin>(
				InputPin.class, this, UMLPackage.OPAQUE_ACTION__INPUT_VALUE);
		}
		return inputValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin createInputValue(String name, Type type, EClass eClass) {
		InputPin newInputValue = (InputPin) create(eClass);
		getInputValues().add(newInputValue);
		if (name != null)
			newInputValue.setName(name);
		if (type != null)
			newInputValue.setType(type);
		return newInputValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin createInputValue(String name, Type type) {
		return createInputValue(name, type, UMLPackage.Literals.INPUT_PIN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin getInputValue(String name, Type type) {
		return getInputValue(name, type, false, null, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin getInputValue(String name, Type type, boolean ignoreCase,
			EClass eClass, boolean createOnDemand) {
		inputValueLoop : for (InputPin inputValue : getInputValues()) {
			if (eClass != null && !eClass.isInstance(inputValue))
				continue inputValueLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(inputValue.getName())
				: name.equals(inputValue.getName())))
				continue inputValueLoop;
			if (type != null && !type.equals(inputValue.getType()))
				continue inputValueLoop;
			return inputValue;
		}
		return createOnDemand && eClass != null
			? createInputValue(name, type, eClass)
			: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public InputPin getInputValue(String name, Type type, boolean ignoreCase,
			EClass eClass) {
		return getInputValue(name, type, ignoreCase, eClass, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutputPin> getOutputValues() {
		if (outputValues == null) {
			outputValues = new EObjectContainmentEList.Resolving<OutputPin>(
				OutputPin.class, this, UMLPackage.OPAQUE_ACTION__OUTPUT_VALUE);
		}
		return outputValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPin createOutputValue(String name, Type type) {
		OutputPin newOutputValue = (OutputPin) create(
			UMLPackage.Literals.OUTPUT_PIN);
		getOutputValues().add(newOutputValue);
		if (name != null)
			newOutputValue.setName(name);
		if (type != null)
			newOutputValue.setType(type);
		return newOutputValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPin getOutputValue(String name, Type type) {
		return getOutputValue(name, type, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPin getOutputValue(String name, Type type, boolean ignoreCase,
			boolean createOnDemand) {
		outputValueLoop : for (OutputPin outputValue : getOutputValues()) {
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(outputValue.getName())
				: name.equals(outputValue.getName())))
				continue outputValueLoop;
			if (type != null && !type.equals(outputValue.getType()))
				continue outputValueLoop;
			return outputValue;
		}
		return createOnDemand
			? createOutputValue(name, type)
			: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLanguageBodySize(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return OpaqueActionOperations.validateLanguageBodySize(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public OutputPin getOutputValue(String name, Type type,
			boolean ignoreCase) {
		return getOutputValue(name, type, ignoreCase, false);
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
			case UMLPackage.OPAQUE_ACTION__EANNOTATIONS :
				return ((InternalEList<?>) getEAnnotations())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.OPAQUE_ACTION__OWNED_COMMENT :
				return ((InternalEList<?>) getOwnedComments())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.OPAQUE_ACTION__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.OPAQUE_ACTION__IN_INTERRUPTIBLE_REGION :
				return ((InternalEList<?>) getInInterruptibleRegions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.OPAQUE_ACTION__IN_STRUCTURED_NODE :
				return basicSetInStructuredNode(null, msgs);
			case UMLPackage.OPAQUE_ACTION__INCOMING :
				return ((InternalEList<?>) getIncomings()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.OPAQUE_ACTION__OUTGOING :
				return ((InternalEList<?>) getOutgoings()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.OPAQUE_ACTION__IN_PARTITION :
				return ((InternalEList<?>) getInPartitions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.OPAQUE_ACTION__HANDLER :
				return ((InternalEList<?>) getHandlers()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.OPAQUE_ACTION__LOCAL_POSTCONDITION :
				return ((InternalEList<?>) getLocalPostconditions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.OPAQUE_ACTION__LOCAL_PRECONDITION :
				return ((InternalEList<?>) getLocalPreconditions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.OPAQUE_ACTION__INPUT_VALUE :
				return ((InternalEList<?>) getInputValues())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.OPAQUE_ACTION__OUTPUT_VALUE :
				return ((InternalEList<?>) getOutputValues())
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
			case UMLPackage.OPAQUE_ACTION__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.OPAQUE_ACTION__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.OPAQUE_ACTION__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.OPAQUE_ACTION__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.OPAQUE_ACTION__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.OPAQUE_ACTION__NAME :
				return getName();
			case UMLPackage.OPAQUE_ACTION__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.OPAQUE_ACTION__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.OPAQUE_ACTION__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.OPAQUE_ACTION__VISIBILITY :
				return getVisibility();
			case UMLPackage.OPAQUE_ACTION__IS_LEAF :
				return isLeaf();
			case UMLPackage.OPAQUE_ACTION__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.OPAQUE_ACTION__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.OPAQUE_ACTION__ACTIVITY :
				if (resolve)
					return getActivity();
				return basicGetActivity();
			case UMLPackage.OPAQUE_ACTION__IN_GROUP :
				return getInGroups();
			case UMLPackage.OPAQUE_ACTION__IN_INTERRUPTIBLE_REGION :
				return getInInterruptibleRegions();
			case UMLPackage.OPAQUE_ACTION__IN_STRUCTURED_NODE :
				if (resolve)
					return getInStructuredNode();
				return basicGetInStructuredNode();
			case UMLPackage.OPAQUE_ACTION__INCOMING :
				return getIncomings();
			case UMLPackage.OPAQUE_ACTION__OUTGOING :
				return getOutgoings();
			case UMLPackage.OPAQUE_ACTION__REDEFINED_NODE :
				return getRedefinedNodes();
			case UMLPackage.OPAQUE_ACTION__IN_PARTITION :
				return getInPartitions();
			case UMLPackage.OPAQUE_ACTION__HANDLER :
				return getHandlers();
			case UMLPackage.OPAQUE_ACTION__CONTEXT :
				if (resolve)
					return getContext();
				return basicGetContext();
			case UMLPackage.OPAQUE_ACTION__INPUT :
				return getInputs();
			case UMLPackage.OPAQUE_ACTION__IS_LOCALLY_REENTRANT :
				return isLocallyReentrant();
			case UMLPackage.OPAQUE_ACTION__LOCAL_POSTCONDITION :
				return getLocalPostconditions();
			case UMLPackage.OPAQUE_ACTION__LOCAL_PRECONDITION :
				return getLocalPreconditions();
			case UMLPackage.OPAQUE_ACTION__OUTPUT :
				return getOutputs();
			case UMLPackage.OPAQUE_ACTION__BODY :
				return getBodies();
			case UMLPackage.OPAQUE_ACTION__INPUT_VALUE :
				return getInputValues();
			case UMLPackage.OPAQUE_ACTION__LANGUAGE :
				return getLanguages();
			case UMLPackage.OPAQUE_ACTION__OUTPUT_VALUE :
				return getOutputValues();
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
			case UMLPackage.OPAQUE_ACTION__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations()
					.addAll((Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.OPAQUE_ACTION__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments()
					.addAll((Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.OPAQUE_ACTION__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.OPAQUE_ACTION__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.OPAQUE_ACTION__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.OPAQUE_ACTION__IS_LEAF :
				setIsLeaf((Boolean) newValue);
				return;
			case UMLPackage.OPAQUE_ACTION__ACTIVITY :
				setActivity((Activity) newValue);
				return;
			case UMLPackage.OPAQUE_ACTION__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				getInInterruptibleRegions().addAll(
					(Collection<? extends InterruptibleActivityRegion>) newValue);
				return;
			case UMLPackage.OPAQUE_ACTION__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) newValue);
				return;
			case UMLPackage.OPAQUE_ACTION__INCOMING :
				getIncomings().clear();
				getIncomings()
					.addAll((Collection<? extends ActivityEdge>) newValue);
				return;
			case UMLPackage.OPAQUE_ACTION__OUTGOING :
				getOutgoings().clear();
				getOutgoings()
					.addAll((Collection<? extends ActivityEdge>) newValue);
				return;
			case UMLPackage.OPAQUE_ACTION__REDEFINED_NODE :
				getRedefinedNodes().clear();
				getRedefinedNodes()
					.addAll((Collection<? extends ActivityNode>) newValue);
				return;
			case UMLPackage.OPAQUE_ACTION__IN_PARTITION :
				getInPartitions().clear();
				getInPartitions()
					.addAll((Collection<? extends ActivityPartition>) newValue);
				return;
			case UMLPackage.OPAQUE_ACTION__HANDLER :
				getHandlers().clear();
				getHandlers()
					.addAll((Collection<? extends ExceptionHandler>) newValue);
				return;
			case UMLPackage.OPAQUE_ACTION__IS_LOCALLY_REENTRANT :
				setIsLocallyReentrant((Boolean) newValue);
				return;
			case UMLPackage.OPAQUE_ACTION__LOCAL_POSTCONDITION :
				getLocalPostconditions().clear();
				getLocalPostconditions()
					.addAll((Collection<? extends Constraint>) newValue);
				return;
			case UMLPackage.OPAQUE_ACTION__LOCAL_PRECONDITION :
				getLocalPreconditions().clear();
				getLocalPreconditions()
					.addAll((Collection<? extends Constraint>) newValue);
				return;
			case UMLPackage.OPAQUE_ACTION__BODY :
				getBodies().clear();
				getBodies().addAll((Collection<? extends String>) newValue);
				return;
			case UMLPackage.OPAQUE_ACTION__INPUT_VALUE :
				getInputValues().clear();
				getInputValues()
					.addAll((Collection<? extends InputPin>) newValue);
				return;
			case UMLPackage.OPAQUE_ACTION__LANGUAGE :
				getLanguages().clear();
				getLanguages().addAll((Collection<? extends String>) newValue);
				return;
			case UMLPackage.OPAQUE_ACTION__OUTPUT_VALUE :
				getOutputValues().clear();
				getOutputValues()
					.addAll((Collection<? extends OutputPin>) newValue);
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
			case UMLPackage.OPAQUE_ACTION__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.OPAQUE_ACTION__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.OPAQUE_ACTION__NAME :
				unsetName();
				return;
			case UMLPackage.OPAQUE_ACTION__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.OPAQUE_ACTION__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.OPAQUE_ACTION__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.OPAQUE_ACTION__ACTIVITY :
				setActivity((Activity) null);
				return;
			case UMLPackage.OPAQUE_ACTION__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				return;
			case UMLPackage.OPAQUE_ACTION__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) null);
				return;
			case UMLPackage.OPAQUE_ACTION__INCOMING :
				getIncomings().clear();
				return;
			case UMLPackage.OPAQUE_ACTION__OUTGOING :
				getOutgoings().clear();
				return;
			case UMLPackage.OPAQUE_ACTION__REDEFINED_NODE :
				getRedefinedNodes().clear();
				return;
			case UMLPackage.OPAQUE_ACTION__IN_PARTITION :
				getInPartitions().clear();
				return;
			case UMLPackage.OPAQUE_ACTION__HANDLER :
				getHandlers().clear();
				return;
			case UMLPackage.OPAQUE_ACTION__IS_LOCALLY_REENTRANT :
				setIsLocallyReentrant(IS_LOCALLY_REENTRANT_EDEFAULT);
				return;
			case UMLPackage.OPAQUE_ACTION__LOCAL_POSTCONDITION :
				getLocalPostconditions().clear();
				return;
			case UMLPackage.OPAQUE_ACTION__LOCAL_PRECONDITION :
				getLocalPreconditions().clear();
				return;
			case UMLPackage.OPAQUE_ACTION__BODY :
				unsetBodies();
				return;
			case UMLPackage.OPAQUE_ACTION__INPUT_VALUE :
				getInputValues().clear();
				return;
			case UMLPackage.OPAQUE_ACTION__LANGUAGE :
				unsetLanguages();
				return;
			case UMLPackage.OPAQUE_ACTION__OUTPUT_VALUE :
				getOutputValues().clear();
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
			case UMLPackage.OPAQUE_ACTION__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.OPAQUE_ACTION__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.OPAQUE_ACTION__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.OPAQUE_ACTION__OWNER :
				return isSetOwner();
			case UMLPackage.OPAQUE_ACTION__CLIENT_DEPENDENCY :
				return !getClientDependencies().isEmpty();
			case UMLPackage.OPAQUE_ACTION__NAME :
				return isSetName();
			case UMLPackage.OPAQUE_ACTION__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.OPAQUE_ACTION__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.OPAQUE_ACTION__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.OPAQUE_ACTION__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.OPAQUE_ACTION__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.OPAQUE_ACTION__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.OPAQUE_ACTION__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.OPAQUE_ACTION__ACTIVITY :
				return basicGetActivity() != null;
			case UMLPackage.OPAQUE_ACTION__IN_GROUP :
				return isSetInGroups();
			case UMLPackage.OPAQUE_ACTION__IN_INTERRUPTIBLE_REGION :
				return inInterruptibleRegions != null
					&& !inInterruptibleRegions.isEmpty();
			case UMLPackage.OPAQUE_ACTION__IN_STRUCTURED_NODE :
				return basicGetInStructuredNode() != null;
			case UMLPackage.OPAQUE_ACTION__INCOMING :
				return incomings != null && !incomings.isEmpty();
			case UMLPackage.OPAQUE_ACTION__OUTGOING :
				return outgoings != null && !outgoings.isEmpty();
			case UMLPackage.OPAQUE_ACTION__REDEFINED_NODE :
				return redefinedNodes != null && !redefinedNodes.isEmpty();
			case UMLPackage.OPAQUE_ACTION__IN_PARTITION :
				return inPartitions != null && !inPartitions.isEmpty();
			case UMLPackage.OPAQUE_ACTION__HANDLER :
				return handlers != null && !handlers.isEmpty();
			case UMLPackage.OPAQUE_ACTION__CONTEXT :
				return basicGetContext() != null;
			case UMLPackage.OPAQUE_ACTION__INPUT :
				return isSetInputs();
			case UMLPackage.OPAQUE_ACTION__IS_LOCALLY_REENTRANT :
				return ((eFlags
					& IS_LOCALLY_REENTRANT_EFLAG) != 0) != IS_LOCALLY_REENTRANT_EDEFAULT;
			case UMLPackage.OPAQUE_ACTION__LOCAL_POSTCONDITION :
				return localPostconditions != null
					&& !localPostconditions.isEmpty();
			case UMLPackage.OPAQUE_ACTION__LOCAL_PRECONDITION :
				return localPreconditions != null
					&& !localPreconditions.isEmpty();
			case UMLPackage.OPAQUE_ACTION__OUTPUT :
				return isSetOutputs();
			case UMLPackage.OPAQUE_ACTION__BODY :
				return isSetBodies();
			case UMLPackage.OPAQUE_ACTION__INPUT_VALUE :
				return inputValues != null && !inputValues.isEmpty();
			case UMLPackage.OPAQUE_ACTION__LANGUAGE :
				return isSetLanguages();
			case UMLPackage.OPAQUE_ACTION__OUTPUT_VALUE :
				return outputValues != null && !outputValues.isEmpty();
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
			case UMLPackage.OPAQUE_ACTION___GET_EANNOTATION__STRING :
				return getEAnnotation((String) arguments.get(0));
			case UMLPackage.OPAQUE_ACTION___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP :
				return validateHasOwner((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.OPAQUE_ACTION___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP :
				return validateNotOwnSelf((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.OPAQUE_ACTION___ADD_KEYWORD__STRING :
				return addKeyword((String) arguments.get(0));
			case UMLPackage.OPAQUE_ACTION___APPLY_STEREOTYPE__STEREOTYPE :
				return applyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.OPAQUE_ACTION___CREATE_EANNOTATION__STRING :
				return createEAnnotation((String) arguments.get(0));
			case UMLPackage.OPAQUE_ACTION___DESTROY :
				destroy();
				return null;
			case UMLPackage.OPAQUE_ACTION___GET_KEYWORDS :
				return getKeywords();
			case UMLPackage.OPAQUE_ACTION___GET_APPLICABLE_STEREOTYPE__STRING :
				return getApplicableStereotype((String) arguments.get(0));
			case UMLPackage.OPAQUE_ACTION___GET_APPLICABLE_STEREOTYPES :
				return getApplicableStereotypes();
			case UMLPackage.OPAQUE_ACTION___GET_APPLIED_STEREOTYPE__STRING :
				return getAppliedStereotype((String) arguments.get(0));
			case UMLPackage.OPAQUE_ACTION___GET_APPLIED_STEREOTYPES :
				return getAppliedStereotypes();
			case UMLPackage.OPAQUE_ACTION___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING :
				return getAppliedSubstereotype((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.OPAQUE_ACTION___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE :
				return getAppliedSubstereotypes((Stereotype) arguments.get(0));
			case UMLPackage.OPAQUE_ACTION___GET_MODEL :
				return getModel();
			case UMLPackage.OPAQUE_ACTION___GET_NEAREST_PACKAGE :
				return getNearestPackage();
			case UMLPackage.OPAQUE_ACTION___GET_RELATIONSHIPS :
				return getRelationships();
			case UMLPackage.OPAQUE_ACTION___GET_RELATIONSHIPS__ECLASS :
				return getRelationships((EClass) arguments.get(0));
			case UMLPackage.OPAQUE_ACTION___GET_REQUIRED_STEREOTYPE__STRING :
				return getRequiredStereotype((String) arguments.get(0));
			case UMLPackage.OPAQUE_ACTION___GET_REQUIRED_STEREOTYPES :
				return getRequiredStereotypes();
			case UMLPackage.OPAQUE_ACTION___GET_SOURCE_DIRECTED_RELATIONSHIPS :
				return getSourceDirectedRelationships();
			case UMLPackage.OPAQUE_ACTION___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS :
				return getSourceDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.OPAQUE_ACTION___GET_STEREOTYPE_APPLICATION__STEREOTYPE :
				return getStereotypeApplication((Stereotype) arguments.get(0));
			case UMLPackage.OPAQUE_ACTION___GET_STEREOTYPE_APPLICATIONS :
				return getStereotypeApplications();
			case UMLPackage.OPAQUE_ACTION___GET_TARGET_DIRECTED_RELATIONSHIPS :
				return getTargetDirectedRelationships();
			case UMLPackage.OPAQUE_ACTION___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS :
				return getTargetDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.OPAQUE_ACTION___GET_VALUE__STEREOTYPE_STRING :
				return getValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.OPAQUE_ACTION___HAS_KEYWORD__STRING :
				return hasKeyword((String) arguments.get(0));
			case UMLPackage.OPAQUE_ACTION___HAS_VALUE__STEREOTYPE_STRING :
				return hasValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.OPAQUE_ACTION___IS_STEREOTYPE_APPLICABLE__STEREOTYPE :
				return isStereotypeApplicable((Stereotype) arguments.get(0));
			case UMLPackage.OPAQUE_ACTION___IS_STEREOTYPE_APPLIED__STEREOTYPE :
				return isStereotypeApplied((Stereotype) arguments.get(0));
			case UMLPackage.OPAQUE_ACTION___IS_STEREOTYPE_REQUIRED__STEREOTYPE :
				return isStereotypeRequired((Stereotype) arguments.get(0));
			case UMLPackage.OPAQUE_ACTION___REMOVE_KEYWORD__STRING :
				return removeKeyword((String) arguments.get(0));
			case UMLPackage.OPAQUE_ACTION___SET_VALUE__STEREOTYPE_STRING_OBJECT :
				setValue((Stereotype) arguments.get(0),
					(String) arguments.get(1), arguments.get(2));
				return null;
			case UMLPackage.OPAQUE_ACTION___UNAPPLY_STEREOTYPE__STEREOTYPE :
				return unapplyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.OPAQUE_ACTION___ALL_OWNED_ELEMENTS :
				return allOwnedElements();
			case UMLPackage.OPAQUE_ACTION___MUST_BE_OWNED :
				return mustBeOwned();
			case UMLPackage.OPAQUE_ACTION___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP :
				return validateVisibilityNeedsOwnership(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.OPAQUE_ACTION___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.OPAQUE_ACTION___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasNoQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.OPAQUE_ACTION___CREATE_DEPENDENCY__NAMEDELEMENT :
				return createDependency((NamedElement) arguments.get(0));
			case UMLPackage.OPAQUE_ACTION___CREATE_USAGE__NAMEDELEMENT :
				return createUsage((NamedElement) arguments.get(0));
			case UMLPackage.OPAQUE_ACTION___GET_LABEL :
				return getLabel();
			case UMLPackage.OPAQUE_ACTION___GET_LABEL__BOOLEAN :
				return getLabel((Boolean) arguments.get(0));
			case UMLPackage.OPAQUE_ACTION___GET_NAMESPACE :
				return getNamespace();
			case UMLPackage.OPAQUE_ACTION___ALL_NAMESPACES :
				return allNamespaces();
			case UMLPackage.OPAQUE_ACTION___ALL_OWNING_PACKAGES :
				return allOwningPackages();
			case UMLPackage.OPAQUE_ACTION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE :
				return isDistinguishableFrom((NamedElement) arguments.get(0),
					(Namespace) arguments.get(1));
			case UMLPackage.OPAQUE_ACTION___GET_QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.OPAQUE_ACTION___SEPARATOR :
				return separator();
			case UMLPackage.OPAQUE_ACTION___GET_CLIENT_DEPENDENCIES :
				return getClientDependencies();
			case UMLPackage.OPAQUE_ACTION___VALIDATE_REDEFINITION_CONSISTENT__DIAGNOSTICCHAIN_MAP :
				return validateRedefinitionConsistent(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.OPAQUE_ACTION___VALIDATE_NON_LEAF_REDEFINITION__DIAGNOSTICCHAIN_MAP :
				return validateNonLeafRedefinition(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.OPAQUE_ACTION___VALIDATE_REDEFINITION_CONTEXT_VALID__DIAGNOSTICCHAIN_MAP :
				return validateRedefinitionContextValid(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.OPAQUE_ACTION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT :
				return isConsistentWith((RedefinableElement) arguments.get(0));
			case UMLPackage.OPAQUE_ACTION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT :
				return isRedefinitionContextValid(
					(RedefinableElement) arguments.get(0));
			case UMLPackage.OPAQUE_ACTION___CONTAINING_ACTIVITY :
				return containingActivity();
			case UMLPackage.OPAQUE_ACTION___GET_CONTEXT :
				return getContext();
			case UMLPackage.OPAQUE_ACTION___ALL_ACTIONS :
				return allActions();
			case UMLPackage.OPAQUE_ACTION___ALL_OWNED_NODES :
				return allOwnedNodes();
			case UMLPackage.OPAQUE_ACTION___CONTAINING_BEHAVIOR :
				return containingBehavior();
			case UMLPackage.OPAQUE_ACTION___VALIDATE_LANGUAGE_BODY_SIZE__DIAGNOSTICCHAIN_MAP :
				return validateLanguageBodySize(
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
		result.append(" (body: "); //$NON-NLS-1$
		result.append(bodies);
		result.append(", language: "); //$NON-NLS-1$
		result.append(languages);
		result.append(')');
		return result.toString();
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getInputs() <em>Input</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputs()
	 * @generated
	 * @ordered
	 */
	protected static final int[] INPUT_ESUBSETS = new int[]{
		UMLPackage.OPAQUE_ACTION__INPUT_VALUE};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetInputs() {
		return super.isSetInputs()
			|| eIsSet(UMLPackage.OPAQUE_ACTION__INPUT_VALUE);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getOutputs() <em>Output</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputs()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OUTPUT_ESUBSETS = new int[]{
		UMLPackage.OPAQUE_ACTION__OUTPUT_VALUE};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOutputs() {
		return super.isSetOutputs()
			|| eIsSet(UMLPackage.OPAQUE_ACTION__OUTPUT_VALUE);
	}

} //OpaqueActionImpl
