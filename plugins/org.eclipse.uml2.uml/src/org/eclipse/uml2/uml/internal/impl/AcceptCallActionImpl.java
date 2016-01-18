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

import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.AcceptCallAction;
import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.ActivityEdge;
import org.eclipse.uml2.uml.ActivityNode;
import org.eclipse.uml2.uml.ActivityPartition;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Constraint;
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

import org.eclipse.uml2.uml.internal.operations.AcceptCallActionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Accept Call Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.AcceptCallActionImpl#getOutputs <em>Output</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.AcceptCallActionImpl#getReturnInformation <em>Return Information</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AcceptCallActionImpl
		extends AcceptEventActionImpl
		implements AcceptCallAction {

	/**
	 * The cached value of the '{@link #getReturnInformation() <em>Return Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnInformation()
	 * @generated
	 * @ordered
	 */
	protected OutputPin returnInformation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AcceptCallActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.ACCEPT_CALL_ACTION;
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
						UMLPackage.ACCEPT_CALL_ACTION__OUTPUT,
						OUTPUT_ESUBSETS));
			}
			return outputs;
		}
		return new DerivedUnionEObjectEList<OutputPin>(OutputPin.class, this,
			UMLPackage.ACCEPT_CALL_ACTION__OUTPUT, OUTPUT_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPin getReturnInformation() {
		if (returnInformation != null && returnInformation.eIsProxy()) {
			InternalEObject oldReturnInformation = (InternalEObject) returnInformation;
			returnInformation = (OutputPin) eResolveProxy(oldReturnInformation);
			if (returnInformation != oldReturnInformation) {
				InternalEObject newReturnInformation = (InternalEObject) returnInformation;
				NotificationChain msgs = oldReturnInformation.eInverseRemove(
					this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.ACCEPT_CALL_ACTION__RETURN_INFORMATION,
					null, null);
				if (newReturnInformation.eInternalContainer() == null) {
					msgs = newReturnInformation.eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
							- UMLPackage.ACCEPT_CALL_ACTION__RETURN_INFORMATION,
						null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.ACCEPT_CALL_ACTION__RETURN_INFORMATION,
						oldReturnInformation, returnInformation));
			}
		}
		return returnInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPin basicGetReturnInformation() {
		return returnInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReturnInformation(
			OutputPin newReturnInformation, NotificationChain msgs) {
		OutputPin oldReturnInformation = returnInformation;
		returnInformation = newReturnInformation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET,
				UMLPackage.ACCEPT_CALL_ACTION__RETURN_INFORMATION,
				oldReturnInformation, newReturnInformation);
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
	public void setReturnInformation(OutputPin newReturnInformation) {
		if (newReturnInformation != returnInformation) {
			NotificationChain msgs = null;
			if (returnInformation != null)
				msgs = ((InternalEObject) returnInformation).eInverseRemove(
					this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.ACCEPT_CALL_ACTION__RETURN_INFORMATION,
					null, msgs);
			if (newReturnInformation != null)
				msgs = ((InternalEObject) newReturnInformation).eInverseAdd(
					this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.ACCEPT_CALL_ACTION__RETURN_INFORMATION,
					null, msgs);
			msgs = basicSetReturnInformation(newReturnInformation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.ACCEPT_CALL_ACTION__RETURN_INFORMATION,
				newReturnInformation, newReturnInformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPin createReturnInformation(String name, Type type) {
		OutputPin newReturnInformation = (OutputPin) create(
			UMLPackage.Literals.OUTPUT_PIN);
		setReturnInformation(newReturnInformation);
		if (name != null)
			newReturnInformation.setName(name);
		if (type != null)
			newReturnInformation.setType(type);
		return newReturnInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultPins(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AcceptCallActionOperations.validateResultPins(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTriggerCallEvent(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AcceptCallActionOperations.validateTriggerCallEvent(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnmarshall(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AcceptCallActionOperations.validateUnmarshall(this, diagnostics,
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
			case UMLPackage.ACCEPT_CALL_ACTION__EANNOTATIONS :
				return ((InternalEList<?>) getEAnnotations())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.ACCEPT_CALL_ACTION__OWNED_COMMENT :
				return ((InternalEList<?>) getOwnedComments())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.ACCEPT_CALL_ACTION__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.ACCEPT_CALL_ACTION__IN_INTERRUPTIBLE_REGION :
				return ((InternalEList<?>) getInInterruptibleRegions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.ACCEPT_CALL_ACTION__IN_STRUCTURED_NODE :
				return basicSetInStructuredNode(null, msgs);
			case UMLPackage.ACCEPT_CALL_ACTION__INCOMING :
				return ((InternalEList<?>) getIncomings()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.ACCEPT_CALL_ACTION__OUTGOING :
				return ((InternalEList<?>) getOutgoings()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.ACCEPT_CALL_ACTION__IN_PARTITION :
				return ((InternalEList<?>) getInPartitions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.ACCEPT_CALL_ACTION__HANDLER :
				return ((InternalEList<?>) getHandlers()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.ACCEPT_CALL_ACTION__LOCAL_POSTCONDITION :
				return ((InternalEList<?>) getLocalPostconditions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.ACCEPT_CALL_ACTION__LOCAL_PRECONDITION :
				return ((InternalEList<?>) getLocalPreconditions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.ACCEPT_CALL_ACTION__RESULT :
				return ((InternalEList<?>) getResults()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.ACCEPT_CALL_ACTION__TRIGGER :
				return ((InternalEList<?>) getTriggers()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.ACCEPT_CALL_ACTION__RETURN_INFORMATION :
				return basicSetReturnInformation(null, msgs);
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
			case UMLPackage.ACCEPT_CALL_ACTION__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.ACCEPT_CALL_ACTION__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.ACCEPT_CALL_ACTION__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.ACCEPT_CALL_ACTION__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.ACCEPT_CALL_ACTION__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.ACCEPT_CALL_ACTION__NAME :
				return getName();
			case UMLPackage.ACCEPT_CALL_ACTION__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.ACCEPT_CALL_ACTION__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.ACCEPT_CALL_ACTION__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.ACCEPT_CALL_ACTION__VISIBILITY :
				return getVisibility();
			case UMLPackage.ACCEPT_CALL_ACTION__IS_LEAF :
				return isLeaf();
			case UMLPackage.ACCEPT_CALL_ACTION__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.ACCEPT_CALL_ACTION__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.ACCEPT_CALL_ACTION__ACTIVITY :
				if (resolve)
					return getActivity();
				return basicGetActivity();
			case UMLPackage.ACCEPT_CALL_ACTION__IN_GROUP :
				return getInGroups();
			case UMLPackage.ACCEPT_CALL_ACTION__IN_INTERRUPTIBLE_REGION :
				return getInInterruptibleRegions();
			case UMLPackage.ACCEPT_CALL_ACTION__IN_STRUCTURED_NODE :
				if (resolve)
					return getInStructuredNode();
				return basicGetInStructuredNode();
			case UMLPackage.ACCEPT_CALL_ACTION__INCOMING :
				return getIncomings();
			case UMLPackage.ACCEPT_CALL_ACTION__OUTGOING :
				return getOutgoings();
			case UMLPackage.ACCEPT_CALL_ACTION__REDEFINED_NODE :
				return getRedefinedNodes();
			case UMLPackage.ACCEPT_CALL_ACTION__IN_PARTITION :
				return getInPartitions();
			case UMLPackage.ACCEPT_CALL_ACTION__HANDLER :
				return getHandlers();
			case UMLPackage.ACCEPT_CALL_ACTION__CONTEXT :
				if (resolve)
					return getContext();
				return basicGetContext();
			case UMLPackage.ACCEPT_CALL_ACTION__INPUT :
				return getInputs();
			case UMLPackage.ACCEPT_CALL_ACTION__IS_LOCALLY_REENTRANT :
				return isLocallyReentrant();
			case UMLPackage.ACCEPT_CALL_ACTION__LOCAL_POSTCONDITION :
				return getLocalPostconditions();
			case UMLPackage.ACCEPT_CALL_ACTION__LOCAL_PRECONDITION :
				return getLocalPreconditions();
			case UMLPackage.ACCEPT_CALL_ACTION__OUTPUT :
				return getOutputs();
			case UMLPackage.ACCEPT_CALL_ACTION__IS_UNMARSHALL :
				return isUnmarshall();
			case UMLPackage.ACCEPT_CALL_ACTION__RESULT :
				return getResults();
			case UMLPackage.ACCEPT_CALL_ACTION__TRIGGER :
				return getTriggers();
			case UMLPackage.ACCEPT_CALL_ACTION__RETURN_INFORMATION :
				if (resolve)
					return getReturnInformation();
				return basicGetReturnInformation();
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
			case UMLPackage.ACCEPT_CALL_ACTION__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations()
					.addAll((Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.ACCEPT_CALL_ACTION__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments()
					.addAll((Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.ACCEPT_CALL_ACTION__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.ACCEPT_CALL_ACTION__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.ACCEPT_CALL_ACTION__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.ACCEPT_CALL_ACTION__IS_LEAF :
				setIsLeaf((Boolean) newValue);
				return;
			case UMLPackage.ACCEPT_CALL_ACTION__ACTIVITY :
				setActivity((Activity) newValue);
				return;
			case UMLPackage.ACCEPT_CALL_ACTION__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				getInInterruptibleRegions().addAll(
					(Collection<? extends InterruptibleActivityRegion>) newValue);
				return;
			case UMLPackage.ACCEPT_CALL_ACTION__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) newValue);
				return;
			case UMLPackage.ACCEPT_CALL_ACTION__INCOMING :
				getIncomings().clear();
				getIncomings()
					.addAll((Collection<? extends ActivityEdge>) newValue);
				return;
			case UMLPackage.ACCEPT_CALL_ACTION__OUTGOING :
				getOutgoings().clear();
				getOutgoings()
					.addAll((Collection<? extends ActivityEdge>) newValue);
				return;
			case UMLPackage.ACCEPT_CALL_ACTION__REDEFINED_NODE :
				getRedefinedNodes().clear();
				getRedefinedNodes()
					.addAll((Collection<? extends ActivityNode>) newValue);
				return;
			case UMLPackage.ACCEPT_CALL_ACTION__IN_PARTITION :
				getInPartitions().clear();
				getInPartitions()
					.addAll((Collection<? extends ActivityPartition>) newValue);
				return;
			case UMLPackage.ACCEPT_CALL_ACTION__HANDLER :
				getHandlers().clear();
				getHandlers()
					.addAll((Collection<? extends ExceptionHandler>) newValue);
				return;
			case UMLPackage.ACCEPT_CALL_ACTION__IS_LOCALLY_REENTRANT :
				setIsLocallyReentrant((Boolean) newValue);
				return;
			case UMLPackage.ACCEPT_CALL_ACTION__LOCAL_POSTCONDITION :
				getLocalPostconditions().clear();
				getLocalPostconditions()
					.addAll((Collection<? extends Constraint>) newValue);
				return;
			case UMLPackage.ACCEPT_CALL_ACTION__LOCAL_PRECONDITION :
				getLocalPreconditions().clear();
				getLocalPreconditions()
					.addAll((Collection<? extends Constraint>) newValue);
				return;
			case UMLPackage.ACCEPT_CALL_ACTION__IS_UNMARSHALL :
				setIsUnmarshall((Boolean) newValue);
				return;
			case UMLPackage.ACCEPT_CALL_ACTION__RESULT :
				getResults().clear();
				getResults().addAll((Collection<? extends OutputPin>) newValue);
				return;
			case UMLPackage.ACCEPT_CALL_ACTION__TRIGGER :
				getTriggers().clear();
				getTriggers().addAll((Collection<? extends Trigger>) newValue);
				return;
			case UMLPackage.ACCEPT_CALL_ACTION__RETURN_INFORMATION :
				setReturnInformation((OutputPin) newValue);
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
			case UMLPackage.ACCEPT_CALL_ACTION__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.ACCEPT_CALL_ACTION__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.ACCEPT_CALL_ACTION__NAME :
				unsetName();
				return;
			case UMLPackage.ACCEPT_CALL_ACTION__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.ACCEPT_CALL_ACTION__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.ACCEPT_CALL_ACTION__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.ACCEPT_CALL_ACTION__ACTIVITY :
				setActivity((Activity) null);
				return;
			case UMLPackage.ACCEPT_CALL_ACTION__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				return;
			case UMLPackage.ACCEPT_CALL_ACTION__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) null);
				return;
			case UMLPackage.ACCEPT_CALL_ACTION__INCOMING :
				getIncomings().clear();
				return;
			case UMLPackage.ACCEPT_CALL_ACTION__OUTGOING :
				getOutgoings().clear();
				return;
			case UMLPackage.ACCEPT_CALL_ACTION__REDEFINED_NODE :
				getRedefinedNodes().clear();
				return;
			case UMLPackage.ACCEPT_CALL_ACTION__IN_PARTITION :
				getInPartitions().clear();
				return;
			case UMLPackage.ACCEPT_CALL_ACTION__HANDLER :
				getHandlers().clear();
				return;
			case UMLPackage.ACCEPT_CALL_ACTION__IS_LOCALLY_REENTRANT :
				setIsLocallyReentrant(IS_LOCALLY_REENTRANT_EDEFAULT);
				return;
			case UMLPackage.ACCEPT_CALL_ACTION__LOCAL_POSTCONDITION :
				getLocalPostconditions().clear();
				return;
			case UMLPackage.ACCEPT_CALL_ACTION__LOCAL_PRECONDITION :
				getLocalPreconditions().clear();
				return;
			case UMLPackage.ACCEPT_CALL_ACTION__IS_UNMARSHALL :
				setIsUnmarshall(IS_UNMARSHALL_EDEFAULT);
				return;
			case UMLPackage.ACCEPT_CALL_ACTION__RESULT :
				getResults().clear();
				return;
			case UMLPackage.ACCEPT_CALL_ACTION__TRIGGER :
				getTriggers().clear();
				return;
			case UMLPackage.ACCEPT_CALL_ACTION__RETURN_INFORMATION :
				setReturnInformation((OutputPin) null);
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
			case UMLPackage.ACCEPT_CALL_ACTION__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.ACCEPT_CALL_ACTION__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.ACCEPT_CALL_ACTION__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.ACCEPT_CALL_ACTION__OWNER :
				return isSetOwner();
			case UMLPackage.ACCEPT_CALL_ACTION__CLIENT_DEPENDENCY :
				return !getClientDependencies().isEmpty();
			case UMLPackage.ACCEPT_CALL_ACTION__NAME :
				return isSetName();
			case UMLPackage.ACCEPT_CALL_ACTION__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.ACCEPT_CALL_ACTION__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.ACCEPT_CALL_ACTION__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.ACCEPT_CALL_ACTION__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.ACCEPT_CALL_ACTION__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.ACCEPT_CALL_ACTION__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.ACCEPT_CALL_ACTION__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.ACCEPT_CALL_ACTION__ACTIVITY :
				return basicGetActivity() != null;
			case UMLPackage.ACCEPT_CALL_ACTION__IN_GROUP :
				return isSetInGroups();
			case UMLPackage.ACCEPT_CALL_ACTION__IN_INTERRUPTIBLE_REGION :
				return inInterruptibleRegions != null
					&& !inInterruptibleRegions.isEmpty();
			case UMLPackage.ACCEPT_CALL_ACTION__IN_STRUCTURED_NODE :
				return basicGetInStructuredNode() != null;
			case UMLPackage.ACCEPT_CALL_ACTION__INCOMING :
				return incomings != null && !incomings.isEmpty();
			case UMLPackage.ACCEPT_CALL_ACTION__OUTGOING :
				return outgoings != null && !outgoings.isEmpty();
			case UMLPackage.ACCEPT_CALL_ACTION__REDEFINED_NODE :
				return redefinedNodes != null && !redefinedNodes.isEmpty();
			case UMLPackage.ACCEPT_CALL_ACTION__IN_PARTITION :
				return inPartitions != null && !inPartitions.isEmpty();
			case UMLPackage.ACCEPT_CALL_ACTION__HANDLER :
				return handlers != null && !handlers.isEmpty();
			case UMLPackage.ACCEPT_CALL_ACTION__CONTEXT :
				return basicGetContext() != null;
			case UMLPackage.ACCEPT_CALL_ACTION__INPUT :
				return isSetInputs();
			case UMLPackage.ACCEPT_CALL_ACTION__IS_LOCALLY_REENTRANT :
				return ((eFlags
					& IS_LOCALLY_REENTRANT_EFLAG) != 0) != IS_LOCALLY_REENTRANT_EDEFAULT;
			case UMLPackage.ACCEPT_CALL_ACTION__LOCAL_POSTCONDITION :
				return localPostconditions != null
					&& !localPostconditions.isEmpty();
			case UMLPackage.ACCEPT_CALL_ACTION__LOCAL_PRECONDITION :
				return localPreconditions != null
					&& !localPreconditions.isEmpty();
			case UMLPackage.ACCEPT_CALL_ACTION__OUTPUT :
				return isSetOutputs();
			case UMLPackage.ACCEPT_CALL_ACTION__IS_UNMARSHALL :
				return ((eFlags
					& IS_UNMARSHALL_EFLAG) != 0) != IS_UNMARSHALL_EDEFAULT;
			case UMLPackage.ACCEPT_CALL_ACTION__RESULT :
				return results != null && !results.isEmpty();
			case UMLPackage.ACCEPT_CALL_ACTION__TRIGGER :
				return triggers != null && !triggers.isEmpty();
			case UMLPackage.ACCEPT_CALL_ACTION__RETURN_INFORMATION :
				return returnInformation != null;
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
			case UMLPackage.ACCEPT_CALL_ACTION___GET_EANNOTATION__STRING :
				return getEAnnotation((String) arguments.get(0));
			case UMLPackage.ACCEPT_CALL_ACTION___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP :
				return validateHasOwner((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ACCEPT_CALL_ACTION___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP :
				return validateNotOwnSelf((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ACCEPT_CALL_ACTION___ADD_KEYWORD__STRING :
				return addKeyword((String) arguments.get(0));
			case UMLPackage.ACCEPT_CALL_ACTION___APPLY_STEREOTYPE__STEREOTYPE :
				return applyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.ACCEPT_CALL_ACTION___CREATE_EANNOTATION__STRING :
				return createEAnnotation((String) arguments.get(0));
			case UMLPackage.ACCEPT_CALL_ACTION___DESTROY :
				destroy();
				return null;
			case UMLPackage.ACCEPT_CALL_ACTION___GET_KEYWORDS :
				return getKeywords();
			case UMLPackage.ACCEPT_CALL_ACTION___GET_APPLICABLE_STEREOTYPE__STRING :
				return getApplicableStereotype((String) arguments.get(0));
			case UMLPackage.ACCEPT_CALL_ACTION___GET_APPLICABLE_STEREOTYPES :
				return getApplicableStereotypes();
			case UMLPackage.ACCEPT_CALL_ACTION___GET_APPLIED_STEREOTYPE__STRING :
				return getAppliedStereotype((String) arguments.get(0));
			case UMLPackage.ACCEPT_CALL_ACTION___GET_APPLIED_STEREOTYPES :
				return getAppliedStereotypes();
			case UMLPackage.ACCEPT_CALL_ACTION___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING :
				return getAppliedSubstereotype((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.ACCEPT_CALL_ACTION___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE :
				return getAppliedSubstereotypes((Stereotype) arguments.get(0));
			case UMLPackage.ACCEPT_CALL_ACTION___GET_MODEL :
				return getModel();
			case UMLPackage.ACCEPT_CALL_ACTION___GET_NEAREST_PACKAGE :
				return getNearestPackage();
			case UMLPackage.ACCEPT_CALL_ACTION___GET_RELATIONSHIPS :
				return getRelationships();
			case UMLPackage.ACCEPT_CALL_ACTION___GET_RELATIONSHIPS__ECLASS :
				return getRelationships((EClass) arguments.get(0));
			case UMLPackage.ACCEPT_CALL_ACTION___GET_REQUIRED_STEREOTYPE__STRING :
				return getRequiredStereotype((String) arguments.get(0));
			case UMLPackage.ACCEPT_CALL_ACTION___GET_REQUIRED_STEREOTYPES :
				return getRequiredStereotypes();
			case UMLPackage.ACCEPT_CALL_ACTION___GET_SOURCE_DIRECTED_RELATIONSHIPS :
				return getSourceDirectedRelationships();
			case UMLPackage.ACCEPT_CALL_ACTION___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS :
				return getSourceDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.ACCEPT_CALL_ACTION___GET_STEREOTYPE_APPLICATION__STEREOTYPE :
				return getStereotypeApplication((Stereotype) arguments.get(0));
			case UMLPackage.ACCEPT_CALL_ACTION___GET_STEREOTYPE_APPLICATIONS :
				return getStereotypeApplications();
			case UMLPackage.ACCEPT_CALL_ACTION___GET_TARGET_DIRECTED_RELATIONSHIPS :
				return getTargetDirectedRelationships();
			case UMLPackage.ACCEPT_CALL_ACTION___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS :
				return getTargetDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.ACCEPT_CALL_ACTION___GET_VALUE__STEREOTYPE_STRING :
				return getValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.ACCEPT_CALL_ACTION___HAS_KEYWORD__STRING :
				return hasKeyword((String) arguments.get(0));
			case UMLPackage.ACCEPT_CALL_ACTION___HAS_VALUE__STEREOTYPE_STRING :
				return hasValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.ACCEPT_CALL_ACTION___IS_STEREOTYPE_APPLICABLE__STEREOTYPE :
				return isStereotypeApplicable((Stereotype) arguments.get(0));
			case UMLPackage.ACCEPT_CALL_ACTION___IS_STEREOTYPE_APPLIED__STEREOTYPE :
				return isStereotypeApplied((Stereotype) arguments.get(0));
			case UMLPackage.ACCEPT_CALL_ACTION___IS_STEREOTYPE_REQUIRED__STEREOTYPE :
				return isStereotypeRequired((Stereotype) arguments.get(0));
			case UMLPackage.ACCEPT_CALL_ACTION___REMOVE_KEYWORD__STRING :
				return removeKeyword((String) arguments.get(0));
			case UMLPackage.ACCEPT_CALL_ACTION___SET_VALUE__STEREOTYPE_STRING_OBJECT :
				setValue((Stereotype) arguments.get(0),
					(String) arguments.get(1), arguments.get(2));
				return null;
			case UMLPackage.ACCEPT_CALL_ACTION___UNAPPLY_STEREOTYPE__STEREOTYPE :
				return unapplyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.ACCEPT_CALL_ACTION___ALL_OWNED_ELEMENTS :
				return allOwnedElements();
			case UMLPackage.ACCEPT_CALL_ACTION___MUST_BE_OWNED :
				return mustBeOwned();
			case UMLPackage.ACCEPT_CALL_ACTION___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP :
				return validateVisibilityNeedsOwnership(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ACCEPT_CALL_ACTION___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ACCEPT_CALL_ACTION___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasNoQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ACCEPT_CALL_ACTION___CREATE_DEPENDENCY__NAMEDELEMENT :
				return createDependency((NamedElement) arguments.get(0));
			case UMLPackage.ACCEPT_CALL_ACTION___CREATE_USAGE__NAMEDELEMENT :
				return createUsage((NamedElement) arguments.get(0));
			case UMLPackage.ACCEPT_CALL_ACTION___GET_LABEL :
				return getLabel();
			case UMLPackage.ACCEPT_CALL_ACTION___GET_LABEL__BOOLEAN :
				return getLabel((Boolean) arguments.get(0));
			case UMLPackage.ACCEPT_CALL_ACTION___GET_NAMESPACE :
				return getNamespace();
			case UMLPackage.ACCEPT_CALL_ACTION___ALL_NAMESPACES :
				return allNamespaces();
			case UMLPackage.ACCEPT_CALL_ACTION___ALL_OWNING_PACKAGES :
				return allOwningPackages();
			case UMLPackage.ACCEPT_CALL_ACTION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE :
				return isDistinguishableFrom((NamedElement) arguments.get(0),
					(Namespace) arguments.get(1));
			case UMLPackage.ACCEPT_CALL_ACTION___GET_QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.ACCEPT_CALL_ACTION___SEPARATOR :
				return separator();
			case UMLPackage.ACCEPT_CALL_ACTION___GET_CLIENT_DEPENDENCIES :
				return getClientDependencies();
			case UMLPackage.ACCEPT_CALL_ACTION___VALIDATE_REDEFINITION_CONSISTENT__DIAGNOSTICCHAIN_MAP :
				return validateRedefinitionConsistent(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ACCEPT_CALL_ACTION___VALIDATE_NON_LEAF_REDEFINITION__DIAGNOSTICCHAIN_MAP :
				return validateNonLeafRedefinition(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ACCEPT_CALL_ACTION___VALIDATE_REDEFINITION_CONTEXT_VALID__DIAGNOSTICCHAIN_MAP :
				return validateRedefinitionContextValid(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ACCEPT_CALL_ACTION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT :
				return isConsistentWith((RedefinableElement) arguments.get(0));
			case UMLPackage.ACCEPT_CALL_ACTION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT :
				return isRedefinitionContextValid(
					(RedefinableElement) arguments.get(0));
			case UMLPackage.ACCEPT_CALL_ACTION___CONTAINING_ACTIVITY :
				return containingActivity();
			case UMLPackage.ACCEPT_CALL_ACTION___GET_CONTEXT :
				return getContext();
			case UMLPackage.ACCEPT_CALL_ACTION___ALL_ACTIONS :
				return allActions();
			case UMLPackage.ACCEPT_CALL_ACTION___ALL_OWNED_NODES :
				return allOwnedNodes();
			case UMLPackage.ACCEPT_CALL_ACTION___CONTAINING_BEHAVIOR :
				return containingBehavior();
			case UMLPackage.ACCEPT_CALL_ACTION___VALIDATE_ONE_OUTPUT_PIN__DIAGNOSTICCHAIN_MAP :
				return validateOneOutputPin((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ACCEPT_CALL_ACTION___VALIDATE_NO_INPUT_PINS__DIAGNOSTICCHAIN_MAP :
				return validateNoInputPins((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ACCEPT_CALL_ACTION___VALIDATE_NO_OUTPUT_PINS__DIAGNOSTICCHAIN_MAP :
				return validateNoOutputPins((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ACCEPT_CALL_ACTION___VALIDATE_UNMARSHALL_SIGNAL_EVENTS__DIAGNOSTICCHAIN_MAP :
				return validateUnmarshallSignalEvents(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ACCEPT_CALL_ACTION___VALIDATE_CONFORMING_TYPE__DIAGNOSTICCHAIN_MAP :
				return validateConformingType(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ACCEPT_CALL_ACTION___VALIDATE_RESULT_PINS__DIAGNOSTICCHAIN_MAP :
				return validateResultPins((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ACCEPT_CALL_ACTION___VALIDATE_TRIGGER_CALL_EVENT__DIAGNOSTICCHAIN_MAP :
				return validateTriggerCallEvent(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ACCEPT_CALL_ACTION___VALIDATE_UNMARSHALL__DIAGNOSTICCHAIN_MAP :
				return validateUnmarshall((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		}
		return eDynamicInvoke(operationID, arguments);
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
		UMLPackage.ACCEPT_CALL_ACTION__RESULT,
		UMLPackage.ACCEPT_CALL_ACTION__RETURN_INFORMATION};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOutputs() {
		return super.isSetOutputs()
			|| eIsSet(UMLPackage.ACCEPT_CALL_ACTION__RETURN_INFORMATION);
	}

} //AcceptCallActionImpl
