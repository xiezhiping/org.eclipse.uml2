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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.ExceptionHandler;
import org.eclipse.uml2.uml.ExecutableNode;
import org.eclipse.uml2.uml.ObjectNode;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLPackage;

import org.eclipse.uml2.uml.internal.operations.ExceptionHandlerOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exception Handler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ExceptionHandlerImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ExceptionHandlerImpl#getExceptionInput <em>Exception Input</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ExceptionHandlerImpl#getExceptionTypes <em>Exception Type</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ExceptionHandlerImpl#getHandlerBody <em>Handler Body</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ExceptionHandlerImpl#getProtectedNode <em>Protected Node</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExceptionHandlerImpl
		extends ElementImpl
		implements ExceptionHandler {

	/**
	 * The cached value of the '{@link #getExceptionInput() <em>Exception Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExceptionInput()
	 * @generated
	 * @ordered
	 */
	protected ObjectNode exceptionInput;

	/**
	 * The cached value of the '{@link #getExceptionTypes() <em>Exception Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExceptionTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<Classifier> exceptionTypes;

	/**
	 * The cached value of the '{@link #getHandlerBody() <em>Handler Body</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandlerBody()
	 * @generated
	 * @ordered
	 */
	protected ExecutableNode handlerBody;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExceptionHandlerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.EXCEPTION_HANDLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element getOwner() {
		Element owner = basicGetOwner();
		return owner != null && owner.eIsProxy()
			? (Element) eResolveProxy((InternalEObject) owner)
			: owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutableNode getHandlerBody() {
		if (handlerBody != null && handlerBody.eIsProxy()) {
			InternalEObject oldHandlerBody = (InternalEObject) handlerBody;
			handlerBody = (ExecutableNode) eResolveProxy(oldHandlerBody);
			if (handlerBody != oldHandlerBody) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.EXCEPTION_HANDLER__HANDLER_BODY,
						oldHandlerBody, handlerBody));
			}
		}
		return handlerBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutableNode basicGetHandlerBody() {
		return handlerBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHandlerBody(ExecutableNode newHandlerBody) {
		ExecutableNode oldHandlerBody = handlerBody;
		handlerBody = newHandlerBody;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.EXCEPTION_HANDLER__HANDLER_BODY, oldHandlerBody,
				handlerBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectNode getExceptionInput() {
		if (exceptionInput != null && exceptionInput.eIsProxy()) {
			InternalEObject oldExceptionInput = (InternalEObject) exceptionInput;
			exceptionInput = (ObjectNode) eResolveProxy(oldExceptionInput);
			if (exceptionInput != oldExceptionInput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.EXCEPTION_HANDLER__EXCEPTION_INPUT,
						oldExceptionInput, exceptionInput));
			}
		}
		return exceptionInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectNode basicGetExceptionInput() {
		return exceptionInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExceptionInput(ObjectNode newExceptionInput) {
		ObjectNode oldExceptionInput = exceptionInput;
		exceptionInput = newExceptionInput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.EXCEPTION_HANDLER__EXCEPTION_INPUT,
				oldExceptionInput, exceptionInput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Classifier> getExceptionTypes() {
		if (exceptionTypes == null) {
			exceptionTypes = new EObjectResolvingEList<Classifier>(
				Classifier.class, this,
				UMLPackage.EXCEPTION_HANDLER__EXCEPTION_TYPE);
		}
		return exceptionTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getExceptionType(String name) {
		return getExceptionType(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getExceptionType(String name, boolean ignoreCase,
			EClass eClass) {
		exceptionTypeLoop : for (Classifier exceptionType : getExceptionTypes()) {
			if (eClass != null && !eClass.isInstance(exceptionType))
				continue exceptionTypeLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(exceptionType.getName())
				: name.equals(exceptionType.getName())))
				continue exceptionTypeLoop;
			return exceptionType;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutableNode getProtectedNode() {
		if (eContainerFeatureID() != UMLPackage.EXCEPTION_HANDLER__PROTECTED_NODE)
			return null;
		return (ExecutableNode) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutableNode basicGetProtectedNode() {
		if (eContainerFeatureID() != UMLPackage.EXCEPTION_HANDLER__PROTECTED_NODE)
			return null;
		return (ExecutableNode) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProtectedNode(
			ExecutableNode newProtectedNode, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newProtectedNode,
			UMLPackage.EXCEPTION_HANDLER__PROTECTED_NODE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtectedNode(ExecutableNode newProtectedNode) {
		if (newProtectedNode != eInternalContainer()
			|| (eContainerFeatureID() != UMLPackage.EXCEPTION_HANDLER__PROTECTED_NODE
				&& newProtectedNode != null)) {
			if (EcoreUtil.isAncestor(this, newProtectedNode))
				throw new IllegalArgumentException(
					"Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newProtectedNode != null)
				msgs = ((InternalEObject) newProtectedNode).eInverseAdd(this,
					UMLPackage.EXECUTABLE_NODE__HANDLER, ExecutableNode.class,
					msgs);
			msgs = basicSetProtectedNode(newProtectedNode, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.EXCEPTION_HANDLER__PROTECTED_NODE, newProtectedNode,
				newProtectedNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHandlerBodyEdges(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ExceptionHandlerOperations.validateHandlerBodyEdges(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutputPins(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ExceptionHandlerOperations.validateOutputPins(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOneInput(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ExceptionHandlerOperations.validateOneInput(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEdgeSourceTarget(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ExceptionHandlerOperations.validateEdgeSourceTarget(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHandlerBodyOwner(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ExceptionHandlerOperations.validateHandlerBodyOwner(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExceptionInputType(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ExceptionHandlerOperations.validateExceptionInputType(this,
			diagnostics, context);
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
			case UMLPackage.EXCEPTION_HANDLER__EANNOTATIONS :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getEAnnotations())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.EXCEPTION_HANDLER__PROTECTED_NODE :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetProtectedNode((ExecutableNode) otherEnd, msgs);
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
			case UMLPackage.EXCEPTION_HANDLER__EANNOTATIONS :
				return ((InternalEList<?>) getEAnnotations())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.EXCEPTION_HANDLER__OWNED_COMMENT :
				return ((InternalEList<?>) getOwnedComments())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.EXCEPTION_HANDLER__PROTECTED_NODE :
				return basicSetProtectedNode(null, msgs);
		}
		return eDynamicInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(
			NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case UMLPackage.EXCEPTION_HANDLER__PROTECTED_NODE :
				return eInternalContainer().eInverseRemove(this,
					UMLPackage.EXECUTABLE_NODE__HANDLER, ExecutableNode.class,
					msgs);
		}
		return eDynamicBasicRemoveFromContainer(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.EXCEPTION_HANDLER__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.EXCEPTION_HANDLER__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.EXCEPTION_HANDLER__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.EXCEPTION_HANDLER__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.EXCEPTION_HANDLER__EXCEPTION_INPUT :
				if (resolve)
					return getExceptionInput();
				return basicGetExceptionInput();
			case UMLPackage.EXCEPTION_HANDLER__EXCEPTION_TYPE :
				return getExceptionTypes();
			case UMLPackage.EXCEPTION_HANDLER__HANDLER_BODY :
				if (resolve)
					return getHandlerBody();
				return basicGetHandlerBody();
			case UMLPackage.EXCEPTION_HANDLER__PROTECTED_NODE :
				if (resolve)
					return getProtectedNode();
				return basicGetProtectedNode();
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
			case UMLPackage.EXCEPTION_HANDLER__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations()
					.addAll((Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.EXCEPTION_HANDLER__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments()
					.addAll((Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.EXCEPTION_HANDLER__EXCEPTION_INPUT :
				setExceptionInput((ObjectNode) newValue);
				return;
			case UMLPackage.EXCEPTION_HANDLER__EXCEPTION_TYPE :
				getExceptionTypes().clear();
				getExceptionTypes()
					.addAll((Collection<? extends Classifier>) newValue);
				return;
			case UMLPackage.EXCEPTION_HANDLER__HANDLER_BODY :
				setHandlerBody((ExecutableNode) newValue);
				return;
			case UMLPackage.EXCEPTION_HANDLER__PROTECTED_NODE :
				setProtectedNode((ExecutableNode) newValue);
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
			case UMLPackage.EXCEPTION_HANDLER__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.EXCEPTION_HANDLER__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.EXCEPTION_HANDLER__EXCEPTION_INPUT :
				setExceptionInput((ObjectNode) null);
				return;
			case UMLPackage.EXCEPTION_HANDLER__EXCEPTION_TYPE :
				getExceptionTypes().clear();
				return;
			case UMLPackage.EXCEPTION_HANDLER__HANDLER_BODY :
				setHandlerBody((ExecutableNode) null);
				return;
			case UMLPackage.EXCEPTION_HANDLER__PROTECTED_NODE :
				setProtectedNode((ExecutableNode) null);
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
			case UMLPackage.EXCEPTION_HANDLER__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.EXCEPTION_HANDLER__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.EXCEPTION_HANDLER__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.EXCEPTION_HANDLER__OWNER :
				return isSetOwner();
			case UMLPackage.EXCEPTION_HANDLER__EXCEPTION_INPUT :
				return exceptionInput != null;
			case UMLPackage.EXCEPTION_HANDLER__EXCEPTION_TYPE :
				return exceptionTypes != null && !exceptionTypes.isEmpty();
			case UMLPackage.EXCEPTION_HANDLER__HANDLER_BODY :
				return handlerBody != null;
			case UMLPackage.EXCEPTION_HANDLER__PROTECTED_NODE :
				return basicGetProtectedNode() != null;
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
			case UMLPackage.EXCEPTION_HANDLER___GET_EANNOTATION__STRING :
				return getEAnnotation((String) arguments.get(0));
			case UMLPackage.EXCEPTION_HANDLER___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP :
				return validateHasOwner((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.EXCEPTION_HANDLER___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP :
				return validateNotOwnSelf((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.EXCEPTION_HANDLER___ADD_KEYWORD__STRING :
				return addKeyword((String) arguments.get(0));
			case UMLPackage.EXCEPTION_HANDLER___APPLY_STEREOTYPE__STEREOTYPE :
				return applyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.EXCEPTION_HANDLER___CREATE_EANNOTATION__STRING :
				return createEAnnotation((String) arguments.get(0));
			case UMLPackage.EXCEPTION_HANDLER___DESTROY :
				destroy();
				return null;
			case UMLPackage.EXCEPTION_HANDLER___GET_KEYWORDS :
				return getKeywords();
			case UMLPackage.EXCEPTION_HANDLER___GET_APPLICABLE_STEREOTYPE__STRING :
				return getApplicableStereotype((String) arguments.get(0));
			case UMLPackage.EXCEPTION_HANDLER___GET_APPLICABLE_STEREOTYPES :
				return getApplicableStereotypes();
			case UMLPackage.EXCEPTION_HANDLER___GET_APPLIED_STEREOTYPE__STRING :
				return getAppliedStereotype((String) arguments.get(0));
			case UMLPackage.EXCEPTION_HANDLER___GET_APPLIED_STEREOTYPES :
				return getAppliedStereotypes();
			case UMLPackage.EXCEPTION_HANDLER___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING :
				return getAppliedSubstereotype((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.EXCEPTION_HANDLER___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE :
				return getAppliedSubstereotypes((Stereotype) arguments.get(0));
			case UMLPackage.EXCEPTION_HANDLER___GET_MODEL :
				return getModel();
			case UMLPackage.EXCEPTION_HANDLER___GET_NEAREST_PACKAGE :
				return getNearestPackage();
			case UMLPackage.EXCEPTION_HANDLER___GET_RELATIONSHIPS :
				return getRelationships();
			case UMLPackage.EXCEPTION_HANDLER___GET_RELATIONSHIPS__ECLASS :
				return getRelationships((EClass) arguments.get(0));
			case UMLPackage.EXCEPTION_HANDLER___GET_REQUIRED_STEREOTYPE__STRING :
				return getRequiredStereotype((String) arguments.get(0));
			case UMLPackage.EXCEPTION_HANDLER___GET_REQUIRED_STEREOTYPES :
				return getRequiredStereotypes();
			case UMLPackage.EXCEPTION_HANDLER___GET_SOURCE_DIRECTED_RELATIONSHIPS :
				return getSourceDirectedRelationships();
			case UMLPackage.EXCEPTION_HANDLER___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS :
				return getSourceDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.EXCEPTION_HANDLER___GET_STEREOTYPE_APPLICATION__STEREOTYPE :
				return getStereotypeApplication((Stereotype) arguments.get(0));
			case UMLPackage.EXCEPTION_HANDLER___GET_STEREOTYPE_APPLICATIONS :
				return getStereotypeApplications();
			case UMLPackage.EXCEPTION_HANDLER___GET_TARGET_DIRECTED_RELATIONSHIPS :
				return getTargetDirectedRelationships();
			case UMLPackage.EXCEPTION_HANDLER___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS :
				return getTargetDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.EXCEPTION_HANDLER___GET_VALUE__STEREOTYPE_STRING :
				return getValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.EXCEPTION_HANDLER___HAS_KEYWORD__STRING :
				return hasKeyword((String) arguments.get(0));
			case UMLPackage.EXCEPTION_HANDLER___HAS_VALUE__STEREOTYPE_STRING :
				return hasValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.EXCEPTION_HANDLER___IS_STEREOTYPE_APPLICABLE__STEREOTYPE :
				return isStereotypeApplicable((Stereotype) arguments.get(0));
			case UMLPackage.EXCEPTION_HANDLER___IS_STEREOTYPE_APPLIED__STEREOTYPE :
				return isStereotypeApplied((Stereotype) arguments.get(0));
			case UMLPackage.EXCEPTION_HANDLER___IS_STEREOTYPE_REQUIRED__STEREOTYPE :
				return isStereotypeRequired((Stereotype) arguments.get(0));
			case UMLPackage.EXCEPTION_HANDLER___REMOVE_KEYWORD__STRING :
				return removeKeyword((String) arguments.get(0));
			case UMLPackage.EXCEPTION_HANDLER___SET_VALUE__STEREOTYPE_STRING_OBJECT :
				setValue((Stereotype) arguments.get(0),
					(String) arguments.get(1), arguments.get(2));
				return null;
			case UMLPackage.EXCEPTION_HANDLER___UNAPPLY_STEREOTYPE__STEREOTYPE :
				return unapplyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.EXCEPTION_HANDLER___ALL_OWNED_ELEMENTS :
				return allOwnedElements();
			case UMLPackage.EXCEPTION_HANDLER___MUST_BE_OWNED :
				return mustBeOwned();
			case UMLPackage.EXCEPTION_HANDLER___VALIDATE_HANDLER_BODY_EDGES__DIAGNOSTICCHAIN_MAP :
				return validateHandlerBodyEdges(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.EXCEPTION_HANDLER___VALIDATE_OUTPUT_PINS__DIAGNOSTICCHAIN_MAP :
				return validateOutputPins((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.EXCEPTION_HANDLER___VALIDATE_ONE_INPUT__DIAGNOSTICCHAIN_MAP :
				return validateOneInput((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.EXCEPTION_HANDLER___VALIDATE_EDGE_SOURCE_TARGET__DIAGNOSTICCHAIN_MAP :
				return validateEdgeSourceTarget(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.EXCEPTION_HANDLER___VALIDATE_HANDLER_BODY_OWNER__DIAGNOSTICCHAIN_MAP :
				return validateHandlerBodyOwner(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.EXCEPTION_HANDLER___VALIDATE_EXCEPTION_INPUT_TYPE__DIAGNOSTICCHAIN_MAP :
				return validateExceptionInputType(
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
	public Element basicGetOwner() {
		ExecutableNode protectedNode = basicGetProtectedNode();
		if (protectedNode != null) {
			return protectedNode;
		}
		return super.basicGetOwner();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOwner() {
		return super.isSetOwner()
			|| eIsSet(UMLPackage.EXCEPTION_HANDLER__PROTECTED_NODE);
	}

} //ExceptionHandlerImpl
