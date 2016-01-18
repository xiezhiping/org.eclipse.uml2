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

import org.eclipse.uml2.uml.AcceptEventAction;
import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.ActivityEdge;
import org.eclipse.uml2.uml.ActivityNode;
import org.eclipse.uml2.uml.ActivityPartition;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.ExceptionHandler;
import org.eclipse.uml2.uml.InterruptibleActivityRegion;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.OutputPin;
import org.eclipse.uml2.uml.RedefinableElement;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.StructuredActivityNode;
import org.eclipse.uml2.uml.Trigger;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.AcceptEventActionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Accept Event Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.AcceptEventActionImpl#getOutputs <em>Output</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.AcceptEventActionImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.AcceptEventActionImpl#isUnmarshall <em>Is Unmarshall</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.AcceptEventActionImpl#getResults <em>Result</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.AcceptEventActionImpl#getTriggers <em>Trigger</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AcceptEventActionImpl
		extends ActionImpl
		implements AcceptEventAction {

	/**
	 * The default value of the '{@link #isUnmarshall() <em>Is Unmarshall</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnmarshall()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_UNMARSHALL_EDEFAULT = false;

	/**
	 * The flag representing the value of the '{@link #isUnmarshall() <em>Is Unmarshall</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnmarshall()
	 * @generated
	 * @ordered
	 */
	protected static final int IS_UNMARSHALL_EFLAG = 1 << 14;

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
	 * The cached value of the '{@link #getTriggers() <em>Trigger</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggers()
	 * @generated
	 * @ordered
	 */
	protected EList<Trigger> triggers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AcceptEventActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.ACCEPT_EVENT_ACTION;
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
						UMLPackage.ACCEPT_EVENT_ACTION__OUTPUT,
						OUTPUT_ESUBSETS));
			}
			return outputs;
		}
		return new DerivedUnionEObjectEList<OutputPin>(OutputPin.class, this,
			UMLPackage.ACCEPT_EVENT_ACTION__OUTPUT, OUTPUT_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUnmarshall() {
		return (eFlags & IS_UNMARSHALL_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsUnmarshall(boolean newIsUnmarshall) {
		boolean oldIsUnmarshall = (eFlags & IS_UNMARSHALL_EFLAG) != 0;
		if (newIsUnmarshall)
			eFlags |= IS_UNMARSHALL_EFLAG;
		else
			eFlags &= ~IS_UNMARSHALL_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.ACCEPT_EVENT_ACTION__IS_UNMARSHALL, oldIsUnmarshall,
				newIsUnmarshall));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutputPin> getResults() {
		if (results == null) {
			results = new EObjectContainmentEList.Resolving<OutputPin>(
				OutputPin.class, this, UMLPackage.ACCEPT_EVENT_ACTION__RESULT);
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
	public EList<Trigger> getTriggers() {
		if (triggers == null) {
			triggers = new EObjectContainmentEList.Resolving<Trigger>(
				Trigger.class, this, UMLPackage.ACCEPT_EVENT_ACTION__TRIGGER);
		}
		return triggers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trigger createTrigger(String name) {
		Trigger newTrigger = (Trigger) create(UMLPackage.Literals.TRIGGER);
		getTriggers().add(newTrigger);
		if (name != null)
			newTrigger.setName(name);
		return newTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trigger getTrigger(String name) {
		return getTrigger(name, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trigger getTrigger(String name, boolean ignoreCase,
			boolean createOnDemand) {
		triggerLoop : for (Trigger trigger : getTriggers()) {
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(trigger.getName())
				: name.equals(trigger.getName())))
				continue triggerLoop;
			return trigger;
		}
		return createOnDemand
			? createTrigger(name)
			: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOneOutputPin(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AcceptEventActionOperations.validateOneOutputPin(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNoInputPins(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AcceptEventActionOperations.validateNoInputPins(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNoOutputPins(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AcceptEventActionOperations.validateNoOutputPins(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnmarshallSignalEvents(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AcceptEventActionOperations.validateUnmarshallSignalEvents(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConformingType(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AcceptEventActionOperations.validateConformingType(this,
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
			case UMLPackage.ACCEPT_EVENT_ACTION__EANNOTATIONS :
				return ((InternalEList<?>) getEAnnotations())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.ACCEPT_EVENT_ACTION__OWNED_COMMENT :
				return ((InternalEList<?>) getOwnedComments())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.ACCEPT_EVENT_ACTION__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.ACCEPT_EVENT_ACTION__IN_INTERRUPTIBLE_REGION :
				return ((InternalEList<?>) getInInterruptibleRegions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.ACCEPT_EVENT_ACTION__IN_STRUCTURED_NODE :
				return basicSetInStructuredNode(null, msgs);
			case UMLPackage.ACCEPT_EVENT_ACTION__INCOMING :
				return ((InternalEList<?>) getIncomings()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.ACCEPT_EVENT_ACTION__OUTGOING :
				return ((InternalEList<?>) getOutgoings()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.ACCEPT_EVENT_ACTION__IN_PARTITION :
				return ((InternalEList<?>) getInPartitions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.ACCEPT_EVENT_ACTION__HANDLER :
				return ((InternalEList<?>) getHandlers()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.ACCEPT_EVENT_ACTION__LOCAL_POSTCONDITION :
				return ((InternalEList<?>) getLocalPostconditions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.ACCEPT_EVENT_ACTION__LOCAL_PRECONDITION :
				return ((InternalEList<?>) getLocalPreconditions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.ACCEPT_EVENT_ACTION__RESULT :
				return ((InternalEList<?>) getResults()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.ACCEPT_EVENT_ACTION__TRIGGER :
				return ((InternalEList<?>) getTriggers()).basicRemove(otherEnd,
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
			case UMLPackage.ACCEPT_EVENT_ACTION__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.ACCEPT_EVENT_ACTION__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.ACCEPT_EVENT_ACTION__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.ACCEPT_EVENT_ACTION__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.ACCEPT_EVENT_ACTION__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.ACCEPT_EVENT_ACTION__NAME :
				return getName();
			case UMLPackage.ACCEPT_EVENT_ACTION__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.ACCEPT_EVENT_ACTION__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.ACCEPT_EVENT_ACTION__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.ACCEPT_EVENT_ACTION__VISIBILITY :
				return getVisibility();
			case UMLPackage.ACCEPT_EVENT_ACTION__IS_LEAF :
				return isLeaf();
			case UMLPackage.ACCEPT_EVENT_ACTION__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.ACCEPT_EVENT_ACTION__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.ACCEPT_EVENT_ACTION__ACTIVITY :
				if (resolve)
					return getActivity();
				return basicGetActivity();
			case UMLPackage.ACCEPT_EVENT_ACTION__IN_GROUP :
				return getInGroups();
			case UMLPackage.ACCEPT_EVENT_ACTION__IN_INTERRUPTIBLE_REGION :
				return getInInterruptibleRegions();
			case UMLPackage.ACCEPT_EVENT_ACTION__IN_STRUCTURED_NODE :
				if (resolve)
					return getInStructuredNode();
				return basicGetInStructuredNode();
			case UMLPackage.ACCEPT_EVENT_ACTION__INCOMING :
				return getIncomings();
			case UMLPackage.ACCEPT_EVENT_ACTION__OUTGOING :
				return getOutgoings();
			case UMLPackage.ACCEPT_EVENT_ACTION__REDEFINED_NODE :
				return getRedefinedNodes();
			case UMLPackage.ACCEPT_EVENT_ACTION__IN_PARTITION :
				return getInPartitions();
			case UMLPackage.ACCEPT_EVENT_ACTION__HANDLER :
				return getHandlers();
			case UMLPackage.ACCEPT_EVENT_ACTION__CONTEXT :
				if (resolve)
					return getContext();
				return basicGetContext();
			case UMLPackage.ACCEPT_EVENT_ACTION__INPUT :
				return getInputs();
			case UMLPackage.ACCEPT_EVENT_ACTION__IS_LOCALLY_REENTRANT :
				return isLocallyReentrant();
			case UMLPackage.ACCEPT_EVENT_ACTION__LOCAL_POSTCONDITION :
				return getLocalPostconditions();
			case UMLPackage.ACCEPT_EVENT_ACTION__LOCAL_PRECONDITION :
				return getLocalPreconditions();
			case UMLPackage.ACCEPT_EVENT_ACTION__OUTPUT :
				return getOutputs();
			case UMLPackage.ACCEPT_EVENT_ACTION__IS_UNMARSHALL :
				return isUnmarshall();
			case UMLPackage.ACCEPT_EVENT_ACTION__RESULT :
				return getResults();
			case UMLPackage.ACCEPT_EVENT_ACTION__TRIGGER :
				return getTriggers();
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
			case UMLPackage.ACCEPT_EVENT_ACTION__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations()
					.addAll((Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.ACCEPT_EVENT_ACTION__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments()
					.addAll((Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.ACCEPT_EVENT_ACTION__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.ACCEPT_EVENT_ACTION__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.ACCEPT_EVENT_ACTION__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.ACCEPT_EVENT_ACTION__IS_LEAF :
				setIsLeaf((Boolean) newValue);
				return;
			case UMLPackage.ACCEPT_EVENT_ACTION__ACTIVITY :
				setActivity((Activity) newValue);
				return;
			case UMLPackage.ACCEPT_EVENT_ACTION__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				getInInterruptibleRegions().addAll(
					(Collection<? extends InterruptibleActivityRegion>) newValue);
				return;
			case UMLPackage.ACCEPT_EVENT_ACTION__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) newValue);
				return;
			case UMLPackage.ACCEPT_EVENT_ACTION__INCOMING :
				getIncomings().clear();
				getIncomings()
					.addAll((Collection<? extends ActivityEdge>) newValue);
				return;
			case UMLPackage.ACCEPT_EVENT_ACTION__OUTGOING :
				getOutgoings().clear();
				getOutgoings()
					.addAll((Collection<? extends ActivityEdge>) newValue);
				return;
			case UMLPackage.ACCEPT_EVENT_ACTION__REDEFINED_NODE :
				getRedefinedNodes().clear();
				getRedefinedNodes()
					.addAll((Collection<? extends ActivityNode>) newValue);
				return;
			case UMLPackage.ACCEPT_EVENT_ACTION__IN_PARTITION :
				getInPartitions().clear();
				getInPartitions()
					.addAll((Collection<? extends ActivityPartition>) newValue);
				return;
			case UMLPackage.ACCEPT_EVENT_ACTION__HANDLER :
				getHandlers().clear();
				getHandlers()
					.addAll((Collection<? extends ExceptionHandler>) newValue);
				return;
			case UMLPackage.ACCEPT_EVENT_ACTION__IS_LOCALLY_REENTRANT :
				setIsLocallyReentrant((Boolean) newValue);
				return;
			case UMLPackage.ACCEPT_EVENT_ACTION__LOCAL_POSTCONDITION :
				getLocalPostconditions().clear();
				getLocalPostconditions()
					.addAll((Collection<? extends Constraint>) newValue);
				return;
			case UMLPackage.ACCEPT_EVENT_ACTION__LOCAL_PRECONDITION :
				getLocalPreconditions().clear();
				getLocalPreconditions()
					.addAll((Collection<? extends Constraint>) newValue);
				return;
			case UMLPackage.ACCEPT_EVENT_ACTION__IS_UNMARSHALL :
				setIsUnmarshall((Boolean) newValue);
				return;
			case UMLPackage.ACCEPT_EVENT_ACTION__RESULT :
				getResults().clear();
				getResults().addAll((Collection<? extends OutputPin>) newValue);
				return;
			case UMLPackage.ACCEPT_EVENT_ACTION__TRIGGER :
				getTriggers().clear();
				getTriggers().addAll((Collection<? extends Trigger>) newValue);
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
			case UMLPackage.ACCEPT_EVENT_ACTION__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.ACCEPT_EVENT_ACTION__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.ACCEPT_EVENT_ACTION__NAME :
				unsetName();
				return;
			case UMLPackage.ACCEPT_EVENT_ACTION__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.ACCEPT_EVENT_ACTION__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.ACCEPT_EVENT_ACTION__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.ACCEPT_EVENT_ACTION__ACTIVITY :
				setActivity((Activity) null);
				return;
			case UMLPackage.ACCEPT_EVENT_ACTION__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				return;
			case UMLPackage.ACCEPT_EVENT_ACTION__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) null);
				return;
			case UMLPackage.ACCEPT_EVENT_ACTION__INCOMING :
				getIncomings().clear();
				return;
			case UMLPackage.ACCEPT_EVENT_ACTION__OUTGOING :
				getOutgoings().clear();
				return;
			case UMLPackage.ACCEPT_EVENT_ACTION__REDEFINED_NODE :
				getRedefinedNodes().clear();
				return;
			case UMLPackage.ACCEPT_EVENT_ACTION__IN_PARTITION :
				getInPartitions().clear();
				return;
			case UMLPackage.ACCEPT_EVENT_ACTION__HANDLER :
				getHandlers().clear();
				return;
			case UMLPackage.ACCEPT_EVENT_ACTION__IS_LOCALLY_REENTRANT :
				setIsLocallyReentrant(IS_LOCALLY_REENTRANT_EDEFAULT);
				return;
			case UMLPackage.ACCEPT_EVENT_ACTION__LOCAL_POSTCONDITION :
				getLocalPostconditions().clear();
				return;
			case UMLPackage.ACCEPT_EVENT_ACTION__LOCAL_PRECONDITION :
				getLocalPreconditions().clear();
				return;
			case UMLPackage.ACCEPT_EVENT_ACTION__IS_UNMARSHALL :
				setIsUnmarshall(IS_UNMARSHALL_EDEFAULT);
				return;
			case UMLPackage.ACCEPT_EVENT_ACTION__RESULT :
				getResults().clear();
				return;
			case UMLPackage.ACCEPT_EVENT_ACTION__TRIGGER :
				getTriggers().clear();
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
			case UMLPackage.ACCEPT_EVENT_ACTION__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.ACCEPT_EVENT_ACTION__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.ACCEPT_EVENT_ACTION__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.ACCEPT_EVENT_ACTION__OWNER :
				return isSetOwner();
			case UMLPackage.ACCEPT_EVENT_ACTION__CLIENT_DEPENDENCY :
				return !getClientDependencies().isEmpty();
			case UMLPackage.ACCEPT_EVENT_ACTION__NAME :
				return isSetName();
			case UMLPackage.ACCEPT_EVENT_ACTION__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.ACCEPT_EVENT_ACTION__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.ACCEPT_EVENT_ACTION__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.ACCEPT_EVENT_ACTION__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.ACCEPT_EVENT_ACTION__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.ACCEPT_EVENT_ACTION__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.ACCEPT_EVENT_ACTION__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.ACCEPT_EVENT_ACTION__ACTIVITY :
				return basicGetActivity() != null;
			case UMLPackage.ACCEPT_EVENT_ACTION__IN_GROUP :
				return isSetInGroups();
			case UMLPackage.ACCEPT_EVENT_ACTION__IN_INTERRUPTIBLE_REGION :
				return inInterruptibleRegions != null
					&& !inInterruptibleRegions.isEmpty();
			case UMLPackage.ACCEPT_EVENT_ACTION__IN_STRUCTURED_NODE :
				return basicGetInStructuredNode() != null;
			case UMLPackage.ACCEPT_EVENT_ACTION__INCOMING :
				return incomings != null && !incomings.isEmpty();
			case UMLPackage.ACCEPT_EVENT_ACTION__OUTGOING :
				return outgoings != null && !outgoings.isEmpty();
			case UMLPackage.ACCEPT_EVENT_ACTION__REDEFINED_NODE :
				return redefinedNodes != null && !redefinedNodes.isEmpty();
			case UMLPackage.ACCEPT_EVENT_ACTION__IN_PARTITION :
				return inPartitions != null && !inPartitions.isEmpty();
			case UMLPackage.ACCEPT_EVENT_ACTION__HANDLER :
				return handlers != null && !handlers.isEmpty();
			case UMLPackage.ACCEPT_EVENT_ACTION__CONTEXT :
				return basicGetContext() != null;
			case UMLPackage.ACCEPT_EVENT_ACTION__INPUT :
				return isSetInputs();
			case UMLPackage.ACCEPT_EVENT_ACTION__IS_LOCALLY_REENTRANT :
				return ((eFlags
					& IS_LOCALLY_REENTRANT_EFLAG) != 0) != IS_LOCALLY_REENTRANT_EDEFAULT;
			case UMLPackage.ACCEPT_EVENT_ACTION__LOCAL_POSTCONDITION :
				return localPostconditions != null
					&& !localPostconditions.isEmpty();
			case UMLPackage.ACCEPT_EVENT_ACTION__LOCAL_PRECONDITION :
				return localPreconditions != null
					&& !localPreconditions.isEmpty();
			case UMLPackage.ACCEPT_EVENT_ACTION__OUTPUT :
				return isSetOutputs();
			case UMLPackage.ACCEPT_EVENT_ACTION__IS_UNMARSHALL :
				return ((eFlags
					& IS_UNMARSHALL_EFLAG) != 0) != IS_UNMARSHALL_EDEFAULT;
			case UMLPackage.ACCEPT_EVENT_ACTION__RESULT :
				return results != null && !results.isEmpty();
			case UMLPackage.ACCEPT_EVENT_ACTION__TRIGGER :
				return triggers != null && !triggers.isEmpty();
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
			case UMLPackage.ACCEPT_EVENT_ACTION___GET_EANNOTATION__STRING :
				return getEAnnotation((String) arguments.get(0));
			case UMLPackage.ACCEPT_EVENT_ACTION___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP :
				return validateHasOwner((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ACCEPT_EVENT_ACTION___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP :
				return validateNotOwnSelf((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ACCEPT_EVENT_ACTION___ADD_KEYWORD__STRING :
				return addKeyword((String) arguments.get(0));
			case UMLPackage.ACCEPT_EVENT_ACTION___APPLY_STEREOTYPE__STEREOTYPE :
				return applyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.ACCEPT_EVENT_ACTION___CREATE_EANNOTATION__STRING :
				return createEAnnotation((String) arguments.get(0));
			case UMLPackage.ACCEPT_EVENT_ACTION___DESTROY :
				destroy();
				return null;
			case UMLPackage.ACCEPT_EVENT_ACTION___GET_KEYWORDS :
				return getKeywords();
			case UMLPackage.ACCEPT_EVENT_ACTION___GET_APPLICABLE_STEREOTYPE__STRING :
				return getApplicableStereotype((String) arguments.get(0));
			case UMLPackage.ACCEPT_EVENT_ACTION___GET_APPLICABLE_STEREOTYPES :
				return getApplicableStereotypes();
			case UMLPackage.ACCEPT_EVENT_ACTION___GET_APPLIED_STEREOTYPE__STRING :
				return getAppliedStereotype((String) arguments.get(0));
			case UMLPackage.ACCEPT_EVENT_ACTION___GET_APPLIED_STEREOTYPES :
				return getAppliedStereotypes();
			case UMLPackage.ACCEPT_EVENT_ACTION___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING :
				return getAppliedSubstereotype((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.ACCEPT_EVENT_ACTION___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE :
				return getAppliedSubstereotypes((Stereotype) arguments.get(0));
			case UMLPackage.ACCEPT_EVENT_ACTION___GET_MODEL :
				return getModel();
			case UMLPackage.ACCEPT_EVENT_ACTION___GET_NEAREST_PACKAGE :
				return getNearestPackage();
			case UMLPackage.ACCEPT_EVENT_ACTION___GET_RELATIONSHIPS :
				return getRelationships();
			case UMLPackage.ACCEPT_EVENT_ACTION___GET_RELATIONSHIPS__ECLASS :
				return getRelationships((EClass) arguments.get(0));
			case UMLPackage.ACCEPT_EVENT_ACTION___GET_REQUIRED_STEREOTYPE__STRING :
				return getRequiredStereotype((String) arguments.get(0));
			case UMLPackage.ACCEPT_EVENT_ACTION___GET_REQUIRED_STEREOTYPES :
				return getRequiredStereotypes();
			case UMLPackage.ACCEPT_EVENT_ACTION___GET_SOURCE_DIRECTED_RELATIONSHIPS :
				return getSourceDirectedRelationships();
			case UMLPackage.ACCEPT_EVENT_ACTION___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS :
				return getSourceDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.ACCEPT_EVENT_ACTION___GET_STEREOTYPE_APPLICATION__STEREOTYPE :
				return getStereotypeApplication((Stereotype) arguments.get(0));
			case UMLPackage.ACCEPT_EVENT_ACTION___GET_STEREOTYPE_APPLICATIONS :
				return getStereotypeApplications();
			case UMLPackage.ACCEPT_EVENT_ACTION___GET_TARGET_DIRECTED_RELATIONSHIPS :
				return getTargetDirectedRelationships();
			case UMLPackage.ACCEPT_EVENT_ACTION___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS :
				return getTargetDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.ACCEPT_EVENT_ACTION___GET_VALUE__STEREOTYPE_STRING :
				return getValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.ACCEPT_EVENT_ACTION___HAS_KEYWORD__STRING :
				return hasKeyword((String) arguments.get(0));
			case UMLPackage.ACCEPT_EVENT_ACTION___HAS_VALUE__STEREOTYPE_STRING :
				return hasValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.ACCEPT_EVENT_ACTION___IS_STEREOTYPE_APPLICABLE__STEREOTYPE :
				return isStereotypeApplicable((Stereotype) arguments.get(0));
			case UMLPackage.ACCEPT_EVENT_ACTION___IS_STEREOTYPE_APPLIED__STEREOTYPE :
				return isStereotypeApplied((Stereotype) arguments.get(0));
			case UMLPackage.ACCEPT_EVENT_ACTION___IS_STEREOTYPE_REQUIRED__STEREOTYPE :
				return isStereotypeRequired((Stereotype) arguments.get(0));
			case UMLPackage.ACCEPT_EVENT_ACTION___REMOVE_KEYWORD__STRING :
				return removeKeyword((String) arguments.get(0));
			case UMLPackage.ACCEPT_EVENT_ACTION___SET_VALUE__STEREOTYPE_STRING_OBJECT :
				setValue((Stereotype) arguments.get(0),
					(String) arguments.get(1), arguments.get(2));
				return null;
			case UMLPackage.ACCEPT_EVENT_ACTION___UNAPPLY_STEREOTYPE__STEREOTYPE :
				return unapplyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.ACCEPT_EVENT_ACTION___ALL_OWNED_ELEMENTS :
				return allOwnedElements();
			case UMLPackage.ACCEPT_EVENT_ACTION___MUST_BE_OWNED :
				return mustBeOwned();
			case UMLPackage.ACCEPT_EVENT_ACTION___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP :
				return validateVisibilityNeedsOwnership(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ACCEPT_EVENT_ACTION___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ACCEPT_EVENT_ACTION___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasNoQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ACCEPT_EVENT_ACTION___CREATE_DEPENDENCY__NAMEDELEMENT :
				return createDependency((NamedElement) arguments.get(0));
			case UMLPackage.ACCEPT_EVENT_ACTION___CREATE_USAGE__NAMEDELEMENT :
				return createUsage((NamedElement) arguments.get(0));
			case UMLPackage.ACCEPT_EVENT_ACTION___GET_LABEL :
				return getLabel();
			case UMLPackage.ACCEPT_EVENT_ACTION___GET_LABEL__BOOLEAN :
				return getLabel((Boolean) arguments.get(0));
			case UMLPackage.ACCEPT_EVENT_ACTION___GET_NAMESPACE :
				return getNamespace();
			case UMLPackage.ACCEPT_EVENT_ACTION___ALL_NAMESPACES :
				return allNamespaces();
			case UMLPackage.ACCEPT_EVENT_ACTION___ALL_OWNING_PACKAGES :
				return allOwningPackages();
			case UMLPackage.ACCEPT_EVENT_ACTION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE :
				return isDistinguishableFrom((NamedElement) arguments.get(0),
					(Namespace) arguments.get(1));
			case UMLPackage.ACCEPT_EVENT_ACTION___GET_QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.ACCEPT_EVENT_ACTION___SEPARATOR :
				return separator();
			case UMLPackage.ACCEPT_EVENT_ACTION___GET_CLIENT_DEPENDENCIES :
				return getClientDependencies();
			case UMLPackage.ACCEPT_EVENT_ACTION___VALIDATE_REDEFINITION_CONSISTENT__DIAGNOSTICCHAIN_MAP :
				return validateRedefinitionConsistent(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ACCEPT_EVENT_ACTION___VALIDATE_NON_LEAF_REDEFINITION__DIAGNOSTICCHAIN_MAP :
				return validateNonLeafRedefinition(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ACCEPT_EVENT_ACTION___VALIDATE_REDEFINITION_CONTEXT_VALID__DIAGNOSTICCHAIN_MAP :
				return validateRedefinitionContextValid(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ACCEPT_EVENT_ACTION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT :
				return isConsistentWith((RedefinableElement) arguments.get(0));
			case UMLPackage.ACCEPT_EVENT_ACTION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT :
				return isRedefinitionContextValid(
					(RedefinableElement) arguments.get(0));
			case UMLPackage.ACCEPT_EVENT_ACTION___CONTAINING_ACTIVITY :
				return containingActivity();
			case UMLPackage.ACCEPT_EVENT_ACTION___GET_CONTEXT :
				return getContext();
			case UMLPackage.ACCEPT_EVENT_ACTION___ALL_ACTIONS :
				return allActions();
			case UMLPackage.ACCEPT_EVENT_ACTION___ALL_OWNED_NODES :
				return allOwnedNodes();
			case UMLPackage.ACCEPT_EVENT_ACTION___CONTAINING_BEHAVIOR :
				return containingBehavior();
			case UMLPackage.ACCEPT_EVENT_ACTION___VALIDATE_ONE_OUTPUT_PIN__DIAGNOSTICCHAIN_MAP :
				return validateOneOutputPin((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ACCEPT_EVENT_ACTION___VALIDATE_NO_INPUT_PINS__DIAGNOSTICCHAIN_MAP :
				return validateNoInputPins((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ACCEPT_EVENT_ACTION___VALIDATE_NO_OUTPUT_PINS__DIAGNOSTICCHAIN_MAP :
				return validateNoOutputPins((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ACCEPT_EVENT_ACTION___VALIDATE_UNMARSHALL_SIGNAL_EVENTS__DIAGNOSTICCHAIN_MAP :
				return validateUnmarshallSignalEvents(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ACCEPT_EVENT_ACTION___VALIDATE_CONFORMING_TYPE__DIAGNOSTICCHAIN_MAP :
				return validateConformingType(
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
		result.append(" (isUnmarshall: "); //$NON-NLS-1$
		result.append((eFlags & IS_UNMARSHALL_EFLAG) != 0);
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
	protected static final int[] OUTPUT_ESUBSETS = new int[]{
		UMLPackage.ACCEPT_EVENT_ACTION__RESULT};

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
						UMLPackage.ACCEPT_EVENT_ACTION__OWNED_ELEMENT,
						OWNED_ELEMENT_ESUBSETS));
			}
			return ownedElements;
		}
		return new DerivedUnionEObjectEList<Element>(Element.class, this,
			UMLPackage.ACCEPT_EVENT_ACTION__OWNED_ELEMENT,
			OWNED_ELEMENT_ESUBSETS);
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
		UMLPackage.ACCEPT_EVENT_ACTION__OWNED_COMMENT,
		UMLPackage.ACCEPT_EVENT_ACTION__NAME_EXPRESSION,
		UMLPackage.ACCEPT_EVENT_ACTION__HANDLER,
		UMLPackage.ACCEPT_EVENT_ACTION__INPUT,
		UMLPackage.ACCEPT_EVENT_ACTION__LOCAL_POSTCONDITION,
		UMLPackage.ACCEPT_EVENT_ACTION__LOCAL_PRECONDITION,
		UMLPackage.ACCEPT_EVENT_ACTION__OUTPUT,
		UMLPackage.ACCEPT_EVENT_ACTION__TRIGGER};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOutputs() {
		return super.isSetOutputs()
			|| eIsSet(UMLPackage.ACCEPT_EVENT_ACTION__RESULT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| eIsSet(UMLPackage.ACCEPT_EVENT_ACTION__TRIGGER);
	}

} //AcceptEventActionImpl
