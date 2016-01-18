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

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.ActivityEdge;
import org.eclipse.uml2.uml.ActivityNode;
import org.eclipse.uml2.uml.ActivityPartition;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.ExceptionHandler;
import org.eclipse.uml2.uml.InputPin;
import org.eclipse.uml2.uml.InterruptibleActivityRegion;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.OutputPin;
import org.eclipse.uml2.uml.RedefinableElement;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.StructuredActivityNode;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.UnmarshallAction;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.UnmarshallActionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unmarshall Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.UnmarshallActionImpl#getInputs <em>Input</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.UnmarshallActionImpl#getOutputs <em>Output</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.UnmarshallActionImpl#getObject <em>Object</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.UnmarshallActionImpl#getResults <em>Result</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.UnmarshallActionImpl#getUnmarshallType <em>Unmarshall Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnmarshallActionImpl
		extends ActionImpl
		implements UnmarshallAction {

	/**
	 * The cached value of the '{@link #getObject() <em>Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObject()
	 * @generated
	 * @ordered
	 */
	protected InputPin object;

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
	 * The cached value of the '{@link #getUnmarshallType() <em>Unmarshall Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnmarshallType()
	 * @generated
	 * @ordered
	 */
	protected Classifier unmarshallType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnmarshallActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.UNMARSHALL_ACTION;
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
						OutputPin.class, this,
						UMLPackage.UNMARSHALL_ACTION__OUTPUT, OUTPUT_ESUBSETS));
			}
			return outputs;
		}
		return new DerivedUnionEObjectEList<OutputPin>(OutputPin.class, this,
			UMLPackage.UNMARSHALL_ACTION__OUTPUT, OUTPUT_ESUBSETS);
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
						InputPin.class, this,
						UMLPackage.UNMARSHALL_ACTION__INPUT, INPUT_ESUBSETS));
			}
			return inputs;
		}
		return new DerivedUnionEObjectEList<InputPin>(InputPin.class, this,
			UMLPackage.UNMARSHALL_ACTION__INPUT, INPUT_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutputPin> getResults() {
		if (results == null) {
			results = new EObjectContainmentEList.Resolving<OutputPin>(
				OutputPin.class, this, UMLPackage.UNMARSHALL_ACTION__RESULT);
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
	 * @generated NOT
	 */
	public OutputPin getResult(String name, Type type, boolean ignoreCase) {
		return getResult(name, type, ignoreCase, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getUnmarshallType() {
		if (unmarshallType != null && unmarshallType.eIsProxy()) {
			InternalEObject oldUnmarshallType = (InternalEObject) unmarshallType;
			unmarshallType = (Classifier) eResolveProxy(oldUnmarshallType);
			if (unmarshallType != oldUnmarshallType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.UNMARSHALL_ACTION__UNMARSHALL_TYPE,
						oldUnmarshallType, unmarshallType));
			}
		}
		return unmarshallType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier basicGetUnmarshallType() {
		return unmarshallType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnmarshallType(Classifier newUnmarshallType) {
		Classifier oldUnmarshallType = unmarshallType;
		unmarshallType = newUnmarshallType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.UNMARSHALL_ACTION__UNMARSHALL_TYPE,
				oldUnmarshallType, unmarshallType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin getObject() {
		if (object != null && object.eIsProxy()) {
			InternalEObject oldObject = (InternalEObject) object;
			object = (InputPin) eResolveProxy(oldObject);
			if (object != oldObject) {
				InternalEObject newObject = (InternalEObject) object;
				NotificationChain msgs = oldObject.eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.UNMARSHALL_ACTION__OBJECT,
					null, null);
				if (newObject.eInternalContainer() == null) {
					msgs = newObject
						.eInverseAdd(this,
							EOPPOSITE_FEATURE_BASE
								- UMLPackage.UNMARSHALL_ACTION__OBJECT,
							null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.UNMARSHALL_ACTION__OBJECT, oldObject,
						object));
			}
		}
		return object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin basicGetObject() {
		return object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObject(InputPin newObject,
			NotificationChain msgs) {
		InputPin oldObject = object;
		object = newObject;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET, UMLPackage.UNMARSHALL_ACTION__OBJECT,
				oldObject, newObject);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObject(InputPin newObject) {
		if (newObject != object) {
			NotificationChain msgs = null;
			if (object != null)
				msgs = ((InternalEObject) object).eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.UNMARSHALL_ACTION__OBJECT,
					null, msgs);
			if (newObject != null)
				msgs = ((InternalEObject) newObject).eInverseAdd(this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.UNMARSHALL_ACTION__OBJECT,
					null, msgs);
			msgs = basicSetObject(newObject, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.UNMARSHALL_ACTION__OBJECT, newObject, newObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin createObject(String name, Type type, EClass eClass) {
		InputPin newObject = (InputPin) create(eClass);
		setObject(newObject);
		if (name != null)
			newObject.setName(name);
		if (type != null)
			newObject.setType(type);
		return newObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin createObject(String name, Type type) {
		return createObject(name, type, UMLPackage.Literals.INPUT_PIN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultiplicityOfObject(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return UnmarshallActionOperations.validateMultiplicityOfObject(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectType(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return UnmarshallActionOperations.validateObjectType(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumberOfResult(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return UnmarshallActionOperations.validateNumberOfResult(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeOrderingAndMultiplicity(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UnmarshallActionOperations
			.validateTypeOrderingAndMultiplicity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructuralFeature(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return UnmarshallActionOperations.validateStructuralFeature(this,
			diagnostics, context);
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
			case UMLPackage.UNMARSHALL_ACTION__EANNOTATIONS :
				return ((InternalEList<?>) getEAnnotations())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.UNMARSHALL_ACTION__OWNED_COMMENT :
				return ((InternalEList<?>) getOwnedComments())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.UNMARSHALL_ACTION__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.UNMARSHALL_ACTION__IN_INTERRUPTIBLE_REGION :
				return ((InternalEList<?>) getInInterruptibleRegions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.UNMARSHALL_ACTION__IN_STRUCTURED_NODE :
				return basicSetInStructuredNode(null, msgs);
			case UMLPackage.UNMARSHALL_ACTION__INCOMING :
				return ((InternalEList<?>) getIncomings()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.UNMARSHALL_ACTION__OUTGOING :
				return ((InternalEList<?>) getOutgoings()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.UNMARSHALL_ACTION__IN_PARTITION :
				return ((InternalEList<?>) getInPartitions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.UNMARSHALL_ACTION__HANDLER :
				return ((InternalEList<?>) getHandlers()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.UNMARSHALL_ACTION__LOCAL_POSTCONDITION :
				return ((InternalEList<?>) getLocalPostconditions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.UNMARSHALL_ACTION__LOCAL_PRECONDITION :
				return ((InternalEList<?>) getLocalPreconditions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.UNMARSHALL_ACTION__OBJECT :
				return basicSetObject(null, msgs);
			case UMLPackage.UNMARSHALL_ACTION__RESULT :
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
			case UMLPackage.UNMARSHALL_ACTION__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.UNMARSHALL_ACTION__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.UNMARSHALL_ACTION__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.UNMARSHALL_ACTION__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.UNMARSHALL_ACTION__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.UNMARSHALL_ACTION__NAME :
				return getName();
			case UMLPackage.UNMARSHALL_ACTION__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.UNMARSHALL_ACTION__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.UNMARSHALL_ACTION__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.UNMARSHALL_ACTION__VISIBILITY :
				return getVisibility();
			case UMLPackage.UNMARSHALL_ACTION__IS_LEAF :
				return isLeaf();
			case UMLPackage.UNMARSHALL_ACTION__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.UNMARSHALL_ACTION__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.UNMARSHALL_ACTION__ACTIVITY :
				if (resolve)
					return getActivity();
				return basicGetActivity();
			case UMLPackage.UNMARSHALL_ACTION__IN_GROUP :
				return getInGroups();
			case UMLPackage.UNMARSHALL_ACTION__IN_INTERRUPTIBLE_REGION :
				return getInInterruptibleRegions();
			case UMLPackage.UNMARSHALL_ACTION__IN_STRUCTURED_NODE :
				if (resolve)
					return getInStructuredNode();
				return basicGetInStructuredNode();
			case UMLPackage.UNMARSHALL_ACTION__INCOMING :
				return getIncomings();
			case UMLPackage.UNMARSHALL_ACTION__OUTGOING :
				return getOutgoings();
			case UMLPackage.UNMARSHALL_ACTION__REDEFINED_NODE :
				return getRedefinedNodes();
			case UMLPackage.UNMARSHALL_ACTION__IN_PARTITION :
				return getInPartitions();
			case UMLPackage.UNMARSHALL_ACTION__HANDLER :
				return getHandlers();
			case UMLPackage.UNMARSHALL_ACTION__CONTEXT :
				if (resolve)
					return getContext();
				return basicGetContext();
			case UMLPackage.UNMARSHALL_ACTION__INPUT :
				return getInputs();
			case UMLPackage.UNMARSHALL_ACTION__IS_LOCALLY_REENTRANT :
				return isLocallyReentrant();
			case UMLPackage.UNMARSHALL_ACTION__LOCAL_POSTCONDITION :
				return getLocalPostconditions();
			case UMLPackage.UNMARSHALL_ACTION__LOCAL_PRECONDITION :
				return getLocalPreconditions();
			case UMLPackage.UNMARSHALL_ACTION__OUTPUT :
				return getOutputs();
			case UMLPackage.UNMARSHALL_ACTION__OBJECT :
				if (resolve)
					return getObject();
				return basicGetObject();
			case UMLPackage.UNMARSHALL_ACTION__RESULT :
				return getResults();
			case UMLPackage.UNMARSHALL_ACTION__UNMARSHALL_TYPE :
				if (resolve)
					return getUnmarshallType();
				return basicGetUnmarshallType();
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
			case UMLPackage.UNMARSHALL_ACTION__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations()
					.addAll((Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.UNMARSHALL_ACTION__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments()
					.addAll((Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.UNMARSHALL_ACTION__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.UNMARSHALL_ACTION__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.UNMARSHALL_ACTION__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.UNMARSHALL_ACTION__IS_LEAF :
				setIsLeaf((Boolean) newValue);
				return;
			case UMLPackage.UNMARSHALL_ACTION__ACTIVITY :
				setActivity((Activity) newValue);
				return;
			case UMLPackage.UNMARSHALL_ACTION__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				getInInterruptibleRegions().addAll(
					(Collection<? extends InterruptibleActivityRegion>) newValue);
				return;
			case UMLPackage.UNMARSHALL_ACTION__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) newValue);
				return;
			case UMLPackage.UNMARSHALL_ACTION__INCOMING :
				getIncomings().clear();
				getIncomings()
					.addAll((Collection<? extends ActivityEdge>) newValue);
				return;
			case UMLPackage.UNMARSHALL_ACTION__OUTGOING :
				getOutgoings().clear();
				getOutgoings()
					.addAll((Collection<? extends ActivityEdge>) newValue);
				return;
			case UMLPackage.UNMARSHALL_ACTION__REDEFINED_NODE :
				getRedefinedNodes().clear();
				getRedefinedNodes()
					.addAll((Collection<? extends ActivityNode>) newValue);
				return;
			case UMLPackage.UNMARSHALL_ACTION__IN_PARTITION :
				getInPartitions().clear();
				getInPartitions()
					.addAll((Collection<? extends ActivityPartition>) newValue);
				return;
			case UMLPackage.UNMARSHALL_ACTION__HANDLER :
				getHandlers().clear();
				getHandlers()
					.addAll((Collection<? extends ExceptionHandler>) newValue);
				return;
			case UMLPackage.UNMARSHALL_ACTION__IS_LOCALLY_REENTRANT :
				setIsLocallyReentrant((Boolean) newValue);
				return;
			case UMLPackage.UNMARSHALL_ACTION__LOCAL_POSTCONDITION :
				getLocalPostconditions().clear();
				getLocalPostconditions()
					.addAll((Collection<? extends Constraint>) newValue);
				return;
			case UMLPackage.UNMARSHALL_ACTION__LOCAL_PRECONDITION :
				getLocalPreconditions().clear();
				getLocalPreconditions()
					.addAll((Collection<? extends Constraint>) newValue);
				return;
			case UMLPackage.UNMARSHALL_ACTION__OBJECT :
				setObject((InputPin) newValue);
				return;
			case UMLPackage.UNMARSHALL_ACTION__RESULT :
				getResults().clear();
				getResults().addAll((Collection<? extends OutputPin>) newValue);
				return;
			case UMLPackage.UNMARSHALL_ACTION__UNMARSHALL_TYPE :
				setUnmarshallType((Classifier) newValue);
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
			case UMLPackage.UNMARSHALL_ACTION__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.UNMARSHALL_ACTION__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.UNMARSHALL_ACTION__NAME :
				unsetName();
				return;
			case UMLPackage.UNMARSHALL_ACTION__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.UNMARSHALL_ACTION__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.UNMARSHALL_ACTION__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.UNMARSHALL_ACTION__ACTIVITY :
				setActivity((Activity) null);
				return;
			case UMLPackage.UNMARSHALL_ACTION__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				return;
			case UMLPackage.UNMARSHALL_ACTION__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) null);
				return;
			case UMLPackage.UNMARSHALL_ACTION__INCOMING :
				getIncomings().clear();
				return;
			case UMLPackage.UNMARSHALL_ACTION__OUTGOING :
				getOutgoings().clear();
				return;
			case UMLPackage.UNMARSHALL_ACTION__REDEFINED_NODE :
				getRedefinedNodes().clear();
				return;
			case UMLPackage.UNMARSHALL_ACTION__IN_PARTITION :
				getInPartitions().clear();
				return;
			case UMLPackage.UNMARSHALL_ACTION__HANDLER :
				getHandlers().clear();
				return;
			case UMLPackage.UNMARSHALL_ACTION__IS_LOCALLY_REENTRANT :
				setIsLocallyReentrant(IS_LOCALLY_REENTRANT_EDEFAULT);
				return;
			case UMLPackage.UNMARSHALL_ACTION__LOCAL_POSTCONDITION :
				getLocalPostconditions().clear();
				return;
			case UMLPackage.UNMARSHALL_ACTION__LOCAL_PRECONDITION :
				getLocalPreconditions().clear();
				return;
			case UMLPackage.UNMARSHALL_ACTION__OBJECT :
				setObject((InputPin) null);
				return;
			case UMLPackage.UNMARSHALL_ACTION__RESULT :
				getResults().clear();
				return;
			case UMLPackage.UNMARSHALL_ACTION__UNMARSHALL_TYPE :
				setUnmarshallType((Classifier) null);
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
			case UMLPackage.UNMARSHALL_ACTION__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.UNMARSHALL_ACTION__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.UNMARSHALL_ACTION__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.UNMARSHALL_ACTION__OWNER :
				return isSetOwner();
			case UMLPackage.UNMARSHALL_ACTION__CLIENT_DEPENDENCY :
				return !getClientDependencies().isEmpty();
			case UMLPackage.UNMARSHALL_ACTION__NAME :
				return isSetName();
			case UMLPackage.UNMARSHALL_ACTION__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.UNMARSHALL_ACTION__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.UNMARSHALL_ACTION__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.UNMARSHALL_ACTION__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.UNMARSHALL_ACTION__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.UNMARSHALL_ACTION__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.UNMARSHALL_ACTION__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.UNMARSHALL_ACTION__ACTIVITY :
				return basicGetActivity() != null;
			case UMLPackage.UNMARSHALL_ACTION__IN_GROUP :
				return isSetInGroups();
			case UMLPackage.UNMARSHALL_ACTION__IN_INTERRUPTIBLE_REGION :
				return inInterruptibleRegions != null
					&& !inInterruptibleRegions.isEmpty();
			case UMLPackage.UNMARSHALL_ACTION__IN_STRUCTURED_NODE :
				return basicGetInStructuredNode() != null;
			case UMLPackage.UNMARSHALL_ACTION__INCOMING :
				return incomings != null && !incomings.isEmpty();
			case UMLPackage.UNMARSHALL_ACTION__OUTGOING :
				return outgoings != null && !outgoings.isEmpty();
			case UMLPackage.UNMARSHALL_ACTION__REDEFINED_NODE :
				return redefinedNodes != null && !redefinedNodes.isEmpty();
			case UMLPackage.UNMARSHALL_ACTION__IN_PARTITION :
				return inPartitions != null && !inPartitions.isEmpty();
			case UMLPackage.UNMARSHALL_ACTION__HANDLER :
				return handlers != null && !handlers.isEmpty();
			case UMLPackage.UNMARSHALL_ACTION__CONTEXT :
				return basicGetContext() != null;
			case UMLPackage.UNMARSHALL_ACTION__INPUT :
				return isSetInputs();
			case UMLPackage.UNMARSHALL_ACTION__IS_LOCALLY_REENTRANT :
				return ((eFlags
					& IS_LOCALLY_REENTRANT_EFLAG) != 0) != IS_LOCALLY_REENTRANT_EDEFAULT;
			case UMLPackage.UNMARSHALL_ACTION__LOCAL_POSTCONDITION :
				return localPostconditions != null
					&& !localPostconditions.isEmpty();
			case UMLPackage.UNMARSHALL_ACTION__LOCAL_PRECONDITION :
				return localPreconditions != null
					&& !localPreconditions.isEmpty();
			case UMLPackage.UNMARSHALL_ACTION__OUTPUT :
				return isSetOutputs();
			case UMLPackage.UNMARSHALL_ACTION__OBJECT :
				return object != null;
			case UMLPackage.UNMARSHALL_ACTION__RESULT :
				return results != null && !results.isEmpty();
			case UMLPackage.UNMARSHALL_ACTION__UNMARSHALL_TYPE :
				return unmarshallType != null;
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
			case UMLPackage.UNMARSHALL_ACTION___GET_EANNOTATION__STRING :
				return getEAnnotation((String) arguments.get(0));
			case UMLPackage.UNMARSHALL_ACTION___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP :
				return validateHasOwner((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.UNMARSHALL_ACTION___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP :
				return validateNotOwnSelf((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.UNMARSHALL_ACTION___ADD_KEYWORD__STRING :
				return addKeyword((String) arguments.get(0));
			case UMLPackage.UNMARSHALL_ACTION___APPLY_STEREOTYPE__STEREOTYPE :
				return applyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.UNMARSHALL_ACTION___CREATE_EANNOTATION__STRING :
				return createEAnnotation((String) arguments.get(0));
			case UMLPackage.UNMARSHALL_ACTION___DESTROY :
				destroy();
				return null;
			case UMLPackage.UNMARSHALL_ACTION___GET_KEYWORDS :
				return getKeywords();
			case UMLPackage.UNMARSHALL_ACTION___GET_APPLICABLE_STEREOTYPE__STRING :
				return getApplicableStereotype((String) arguments.get(0));
			case UMLPackage.UNMARSHALL_ACTION___GET_APPLICABLE_STEREOTYPES :
				return getApplicableStereotypes();
			case UMLPackage.UNMARSHALL_ACTION___GET_APPLIED_STEREOTYPE__STRING :
				return getAppliedStereotype((String) arguments.get(0));
			case UMLPackage.UNMARSHALL_ACTION___GET_APPLIED_STEREOTYPES :
				return getAppliedStereotypes();
			case UMLPackage.UNMARSHALL_ACTION___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING :
				return getAppliedSubstereotype((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.UNMARSHALL_ACTION___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE :
				return getAppliedSubstereotypes((Stereotype) arguments.get(0));
			case UMLPackage.UNMARSHALL_ACTION___GET_MODEL :
				return getModel();
			case UMLPackage.UNMARSHALL_ACTION___GET_NEAREST_PACKAGE :
				return getNearestPackage();
			case UMLPackage.UNMARSHALL_ACTION___GET_RELATIONSHIPS :
				return getRelationships();
			case UMLPackage.UNMARSHALL_ACTION___GET_RELATIONSHIPS__ECLASS :
				return getRelationships((EClass) arguments.get(0));
			case UMLPackage.UNMARSHALL_ACTION___GET_REQUIRED_STEREOTYPE__STRING :
				return getRequiredStereotype((String) arguments.get(0));
			case UMLPackage.UNMARSHALL_ACTION___GET_REQUIRED_STEREOTYPES :
				return getRequiredStereotypes();
			case UMLPackage.UNMARSHALL_ACTION___GET_SOURCE_DIRECTED_RELATIONSHIPS :
				return getSourceDirectedRelationships();
			case UMLPackage.UNMARSHALL_ACTION___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS :
				return getSourceDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.UNMARSHALL_ACTION___GET_STEREOTYPE_APPLICATION__STEREOTYPE :
				return getStereotypeApplication((Stereotype) arguments.get(0));
			case UMLPackage.UNMARSHALL_ACTION___GET_STEREOTYPE_APPLICATIONS :
				return getStereotypeApplications();
			case UMLPackage.UNMARSHALL_ACTION___GET_TARGET_DIRECTED_RELATIONSHIPS :
				return getTargetDirectedRelationships();
			case UMLPackage.UNMARSHALL_ACTION___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS :
				return getTargetDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.UNMARSHALL_ACTION___GET_VALUE__STEREOTYPE_STRING :
				return getValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.UNMARSHALL_ACTION___HAS_KEYWORD__STRING :
				return hasKeyword((String) arguments.get(0));
			case UMLPackage.UNMARSHALL_ACTION___HAS_VALUE__STEREOTYPE_STRING :
				return hasValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.UNMARSHALL_ACTION___IS_STEREOTYPE_APPLICABLE__STEREOTYPE :
				return isStereotypeApplicable((Stereotype) arguments.get(0));
			case UMLPackage.UNMARSHALL_ACTION___IS_STEREOTYPE_APPLIED__STEREOTYPE :
				return isStereotypeApplied((Stereotype) arguments.get(0));
			case UMLPackage.UNMARSHALL_ACTION___IS_STEREOTYPE_REQUIRED__STEREOTYPE :
				return isStereotypeRequired((Stereotype) arguments.get(0));
			case UMLPackage.UNMARSHALL_ACTION___REMOVE_KEYWORD__STRING :
				return removeKeyword((String) arguments.get(0));
			case UMLPackage.UNMARSHALL_ACTION___SET_VALUE__STEREOTYPE_STRING_OBJECT :
				setValue((Stereotype) arguments.get(0),
					(String) arguments.get(1), arguments.get(2));
				return null;
			case UMLPackage.UNMARSHALL_ACTION___UNAPPLY_STEREOTYPE__STEREOTYPE :
				return unapplyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.UNMARSHALL_ACTION___ALL_OWNED_ELEMENTS :
				return allOwnedElements();
			case UMLPackage.UNMARSHALL_ACTION___MUST_BE_OWNED :
				return mustBeOwned();
			case UMLPackage.UNMARSHALL_ACTION___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP :
				return validateVisibilityNeedsOwnership(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.UNMARSHALL_ACTION___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.UNMARSHALL_ACTION___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasNoQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.UNMARSHALL_ACTION___CREATE_DEPENDENCY__NAMEDELEMENT :
				return createDependency((NamedElement) arguments.get(0));
			case UMLPackage.UNMARSHALL_ACTION___CREATE_USAGE__NAMEDELEMENT :
				return createUsage((NamedElement) arguments.get(0));
			case UMLPackage.UNMARSHALL_ACTION___GET_LABEL :
				return getLabel();
			case UMLPackage.UNMARSHALL_ACTION___GET_LABEL__BOOLEAN :
				return getLabel((Boolean) arguments.get(0));
			case UMLPackage.UNMARSHALL_ACTION___GET_NAMESPACE :
				return getNamespace();
			case UMLPackage.UNMARSHALL_ACTION___ALL_NAMESPACES :
				return allNamespaces();
			case UMLPackage.UNMARSHALL_ACTION___ALL_OWNING_PACKAGES :
				return allOwningPackages();
			case UMLPackage.UNMARSHALL_ACTION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE :
				return isDistinguishableFrom((NamedElement) arguments.get(0),
					(Namespace) arguments.get(1));
			case UMLPackage.UNMARSHALL_ACTION___GET_QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.UNMARSHALL_ACTION___SEPARATOR :
				return separator();
			case UMLPackage.UNMARSHALL_ACTION___GET_CLIENT_DEPENDENCIES :
				return getClientDependencies();
			case UMLPackage.UNMARSHALL_ACTION___VALIDATE_REDEFINITION_CONSISTENT__DIAGNOSTICCHAIN_MAP :
				return validateRedefinitionConsistent(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.UNMARSHALL_ACTION___VALIDATE_NON_LEAF_REDEFINITION__DIAGNOSTICCHAIN_MAP :
				return validateNonLeafRedefinition(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.UNMARSHALL_ACTION___VALIDATE_REDEFINITION_CONTEXT_VALID__DIAGNOSTICCHAIN_MAP :
				return validateRedefinitionContextValid(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.UNMARSHALL_ACTION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT :
				return isConsistentWith((RedefinableElement) arguments.get(0));
			case UMLPackage.UNMARSHALL_ACTION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT :
				return isRedefinitionContextValid(
					(RedefinableElement) arguments.get(0));
			case UMLPackage.UNMARSHALL_ACTION___CONTAINING_ACTIVITY :
				return containingActivity();
			case UMLPackage.UNMARSHALL_ACTION___GET_CONTEXT :
				return getContext();
			case UMLPackage.UNMARSHALL_ACTION___ALL_ACTIONS :
				return allActions();
			case UMLPackage.UNMARSHALL_ACTION___ALL_OWNED_NODES :
				return allOwnedNodes();
			case UMLPackage.UNMARSHALL_ACTION___CONTAINING_BEHAVIOR :
				return containingBehavior();
			case UMLPackage.UNMARSHALL_ACTION___VALIDATE_STRUCTURAL_FEATURE__DIAGNOSTICCHAIN_MAP :
				return validateStructuralFeature(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.UNMARSHALL_ACTION___VALIDATE_NUMBER_OF_RESULT__DIAGNOSTICCHAIN_MAP :
				return validateNumberOfResult(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.UNMARSHALL_ACTION___VALIDATE_TYPE_ORDERING_AND_MULTIPLICITY__DIAGNOSTICCHAIN_MAP :
				return validateTypeOrderingAndMultiplicity(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.UNMARSHALL_ACTION___VALIDATE_MULTIPLICITY_OF_OBJECT__DIAGNOSTICCHAIN_MAP :
				return validateMultiplicityOfObject(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.UNMARSHALL_ACTION___VALIDATE_OBJECT_TYPE__DIAGNOSTICCHAIN_MAP :
				return validateObjectType((DiagnosticChain) arguments.get(0),
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
	public boolean isSetOutputs() {
		return super.isSetOutputs()
			|| eIsSet(UMLPackage.UNMARSHALL_ACTION__RESULT);
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
		UMLPackage.UNMARSHALL_ACTION__OBJECT};

	/**
	 * The array of subset feature identifiers for the '{@link #getOutputs() <em>Output</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputs()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OUTPUT_ESUBSETS = new int[]{
		UMLPackage.UNMARSHALL_ACTION__RESULT};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetInputs() {
		return super.isSetInputs()
			|| eIsSet(UMLPackage.UNMARSHALL_ACTION__OBJECT);
	}

} //UnmarshallActionImpl
