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

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.ActivityEdge;
import org.eclipse.uml2.uml.ActivityNode;
import org.eclipse.uml2.uml.ActivityPartition;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.InterruptibleActivityRegion;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.ObjectFlow;
import org.eclipse.uml2.uml.RedefinableElement;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.StructuredActivityNode;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.ValueSpecification;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.ObjectFlowOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Flow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ObjectFlowImpl#isMulticast <em>Is Multicast</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ObjectFlowImpl#isMultireceive <em>Is Multireceive</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ObjectFlowImpl#getSelection <em>Selection</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ObjectFlowImpl#getTransformation <em>Transformation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjectFlowImpl
		extends ActivityEdgeImpl
		implements ObjectFlow {

	/**
	 * The default value of the '{@link #isMulticast() <em>Is Multicast</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMulticast()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_MULTICAST_EDEFAULT = false;

	/**
	 * The flag representing the value of the '{@link #isMulticast() <em>Is Multicast</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMulticast()
	 * @generated
	 * @ordered
	 */
	protected static final int IS_MULTICAST_EFLAG = 1 << 13;

	/**
	 * The default value of the '{@link #isMultireceive() <em>Is Multireceive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMultireceive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_MULTIRECEIVE_EDEFAULT = false;

	/**
	 * The flag representing the value of the '{@link #isMultireceive() <em>Is Multireceive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMultireceive()
	 * @generated
	 * @ordered
	 */
	protected static final int IS_MULTIRECEIVE_EFLAG = 1 << 14;

	/**
	 * The cached value of the '{@link #getSelection() <em>Selection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelection()
	 * @generated
	 * @ordered
	 */
	protected Behavior selection;

	/**
	 * The cached value of the '{@link #getTransformation() <em>Transformation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformation()
	 * @generated
	 * @ordered
	 */
	protected Behavior transformation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectFlowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.OBJECT_FLOW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMulticast() {
		return (eFlags & IS_MULTICAST_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsMulticast(boolean newIsMulticast) {
		boolean oldIsMulticast = (eFlags & IS_MULTICAST_EFLAG) != 0;
		if (newIsMulticast)
			eFlags |= IS_MULTICAST_EFLAG;
		else
			eFlags &= ~IS_MULTICAST_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.OBJECT_FLOW__IS_MULTICAST, oldIsMulticast,
				newIsMulticast));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMultireceive() {
		return (eFlags & IS_MULTIRECEIVE_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsMultireceive(boolean newIsMultireceive) {
		boolean oldIsMultireceive = (eFlags & IS_MULTIRECEIVE_EFLAG) != 0;
		if (newIsMultireceive)
			eFlags |= IS_MULTIRECEIVE_EFLAG;
		else
			eFlags &= ~IS_MULTIRECEIVE_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.OBJECT_FLOW__IS_MULTIRECEIVE, oldIsMultireceive,
				newIsMultireceive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior getTransformation() {
		if (transformation != null && transformation.eIsProxy()) {
			InternalEObject oldTransformation = (InternalEObject) transformation;
			transformation = (Behavior) eResolveProxy(oldTransformation);
			if (transformation != oldTransformation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.OBJECT_FLOW__TRANSFORMATION,
						oldTransformation, transformation));
			}
		}
		return transformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior basicGetTransformation() {
		return transformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransformation(Behavior newTransformation) {
		Behavior oldTransformation = transformation;
		transformation = newTransformation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.OBJECT_FLOW__TRANSFORMATION, oldTransformation,
				transformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior getSelection() {
		if (selection != null && selection.eIsProxy()) {
			InternalEObject oldSelection = (InternalEObject) selection;
			selection = (Behavior) eResolveProxy(oldSelection);
			if (selection != oldSelection) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.OBJECT_FLOW__SELECTION, oldSelection,
						selection));
			}
		}
		return selection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior basicGetSelection() {
		return selection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelection(Behavior newSelection) {
		Behavior oldSelection = selection;
		selection = newSelection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.OBJECT_FLOW__SELECTION, oldSelection, selection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompatibleTypes(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ObjectFlowOperations.validateCompatibleTypes(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSameUpperBounds(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ObjectFlowOperations.validateSameUpperBounds(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTarget(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ObjectFlowOperations.validateTarget(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInputAndOutputParameter(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ObjectFlowOperations.validateInputAndOutputParameter(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNoExecutableNodes(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ObjectFlowOperations.validateNoExecutableNodes(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransformationBehavior(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ObjectFlowOperations.validateTransformationBehavior(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSelectionBehavior(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ObjectFlowOperations.validateSelectionBehavior(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIsMulticastOrIsMultireceive(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ObjectFlowOperations.validateIsMulticastOrIsMultireceive(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.OBJECT_FLOW__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.OBJECT_FLOW__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.OBJECT_FLOW__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.OBJECT_FLOW__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.OBJECT_FLOW__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.OBJECT_FLOW__NAME :
				return getName();
			case UMLPackage.OBJECT_FLOW__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.OBJECT_FLOW__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.OBJECT_FLOW__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.OBJECT_FLOW__VISIBILITY :
				return getVisibility();
			case UMLPackage.OBJECT_FLOW__IS_LEAF :
				return isLeaf();
			case UMLPackage.OBJECT_FLOW__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.OBJECT_FLOW__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.OBJECT_FLOW__ACTIVITY :
				if (resolve)
					return getActivity();
				return basicGetActivity();
			case UMLPackage.OBJECT_FLOW__GUARD :
				if (resolve)
					return getGuard();
				return basicGetGuard();
			case UMLPackage.OBJECT_FLOW__IN_PARTITION :
				return getInPartitions();
			case UMLPackage.OBJECT_FLOW__INTERRUPTS :
				if (resolve)
					return getInterrupts();
				return basicGetInterrupts();
			case UMLPackage.OBJECT_FLOW__IN_STRUCTURED_NODE :
				if (resolve)
					return getInStructuredNode();
				return basicGetInStructuredNode();
			case UMLPackage.OBJECT_FLOW__TARGET :
				if (resolve)
					return getTarget();
				return basicGetTarget();
			case UMLPackage.OBJECT_FLOW__SOURCE :
				if (resolve)
					return getSource();
				return basicGetSource();
			case UMLPackage.OBJECT_FLOW__REDEFINED_EDGE :
				return getRedefinedEdges();
			case UMLPackage.OBJECT_FLOW__WEIGHT :
				if (resolve)
					return getWeight();
				return basicGetWeight();
			case UMLPackage.OBJECT_FLOW__IN_GROUP :
				return getInGroups();
			case UMLPackage.OBJECT_FLOW__IS_MULTICAST :
				return isMulticast();
			case UMLPackage.OBJECT_FLOW__IS_MULTIRECEIVE :
				return isMultireceive();
			case UMLPackage.OBJECT_FLOW__SELECTION :
				if (resolve)
					return getSelection();
				return basicGetSelection();
			case UMLPackage.OBJECT_FLOW__TRANSFORMATION :
				if (resolve)
					return getTransformation();
				return basicGetTransformation();
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
			case UMLPackage.OBJECT_FLOW__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations()
					.addAll((Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.OBJECT_FLOW__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments()
					.addAll((Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.OBJECT_FLOW__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.OBJECT_FLOW__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.OBJECT_FLOW__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.OBJECT_FLOW__IS_LEAF :
				setIsLeaf((Boolean) newValue);
				return;
			case UMLPackage.OBJECT_FLOW__ACTIVITY :
				setActivity((Activity) newValue);
				return;
			case UMLPackage.OBJECT_FLOW__GUARD :
				setGuard((ValueSpecification) newValue);
				return;
			case UMLPackage.OBJECT_FLOW__IN_PARTITION :
				getInPartitions().clear();
				getInPartitions()
					.addAll((Collection<? extends ActivityPartition>) newValue);
				return;
			case UMLPackage.OBJECT_FLOW__INTERRUPTS :
				setInterrupts((InterruptibleActivityRegion) newValue);
				return;
			case UMLPackage.OBJECT_FLOW__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) newValue);
				return;
			case UMLPackage.OBJECT_FLOW__TARGET :
				setTarget((ActivityNode) newValue);
				return;
			case UMLPackage.OBJECT_FLOW__SOURCE :
				setSource((ActivityNode) newValue);
				return;
			case UMLPackage.OBJECT_FLOW__REDEFINED_EDGE :
				getRedefinedEdges().clear();
				getRedefinedEdges()
					.addAll((Collection<? extends ActivityEdge>) newValue);
				return;
			case UMLPackage.OBJECT_FLOW__WEIGHT :
				setWeight((ValueSpecification) newValue);
				return;
			case UMLPackage.OBJECT_FLOW__IS_MULTICAST :
				setIsMulticast((Boolean) newValue);
				return;
			case UMLPackage.OBJECT_FLOW__IS_MULTIRECEIVE :
				setIsMultireceive((Boolean) newValue);
				return;
			case UMLPackage.OBJECT_FLOW__SELECTION :
				setSelection((Behavior) newValue);
				return;
			case UMLPackage.OBJECT_FLOW__TRANSFORMATION :
				setTransformation((Behavior) newValue);
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
			case UMLPackage.OBJECT_FLOW__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.OBJECT_FLOW__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.OBJECT_FLOW__NAME :
				unsetName();
				return;
			case UMLPackage.OBJECT_FLOW__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.OBJECT_FLOW__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.OBJECT_FLOW__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.OBJECT_FLOW__ACTIVITY :
				setActivity((Activity) null);
				return;
			case UMLPackage.OBJECT_FLOW__GUARD :
				setGuard((ValueSpecification) null);
				return;
			case UMLPackage.OBJECT_FLOW__IN_PARTITION :
				getInPartitions().clear();
				return;
			case UMLPackage.OBJECT_FLOW__INTERRUPTS :
				setInterrupts((InterruptibleActivityRegion) null);
				return;
			case UMLPackage.OBJECT_FLOW__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) null);
				return;
			case UMLPackage.OBJECT_FLOW__TARGET :
				setTarget((ActivityNode) null);
				return;
			case UMLPackage.OBJECT_FLOW__SOURCE :
				setSource((ActivityNode) null);
				return;
			case UMLPackage.OBJECT_FLOW__REDEFINED_EDGE :
				getRedefinedEdges().clear();
				return;
			case UMLPackage.OBJECT_FLOW__WEIGHT :
				setWeight((ValueSpecification) null);
				return;
			case UMLPackage.OBJECT_FLOW__IS_MULTICAST :
				setIsMulticast(IS_MULTICAST_EDEFAULT);
				return;
			case UMLPackage.OBJECT_FLOW__IS_MULTIRECEIVE :
				setIsMultireceive(IS_MULTIRECEIVE_EDEFAULT);
				return;
			case UMLPackage.OBJECT_FLOW__SELECTION :
				setSelection((Behavior) null);
				return;
			case UMLPackage.OBJECT_FLOW__TRANSFORMATION :
				setTransformation((Behavior) null);
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
			case UMLPackage.OBJECT_FLOW__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.OBJECT_FLOW__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.OBJECT_FLOW__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.OBJECT_FLOW__OWNER :
				return isSetOwner();
			case UMLPackage.OBJECT_FLOW__CLIENT_DEPENDENCY :
				return !getClientDependencies().isEmpty();
			case UMLPackage.OBJECT_FLOW__NAME :
				return isSetName();
			case UMLPackage.OBJECT_FLOW__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.OBJECT_FLOW__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.OBJECT_FLOW__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.OBJECT_FLOW__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.OBJECT_FLOW__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.OBJECT_FLOW__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.OBJECT_FLOW__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.OBJECT_FLOW__ACTIVITY :
				return basicGetActivity() != null;
			case UMLPackage.OBJECT_FLOW__GUARD :
				return guard != null;
			case UMLPackage.OBJECT_FLOW__IN_PARTITION :
				return inPartitions != null && !inPartitions.isEmpty();
			case UMLPackage.OBJECT_FLOW__INTERRUPTS :
				return interrupts != null;
			case UMLPackage.OBJECT_FLOW__IN_STRUCTURED_NODE :
				return basicGetInStructuredNode() != null;
			case UMLPackage.OBJECT_FLOW__TARGET :
				return target != null;
			case UMLPackage.OBJECT_FLOW__SOURCE :
				return source != null;
			case UMLPackage.OBJECT_FLOW__REDEFINED_EDGE :
				return redefinedEdges != null && !redefinedEdges.isEmpty();
			case UMLPackage.OBJECT_FLOW__WEIGHT :
				return weight != null;
			case UMLPackage.OBJECT_FLOW__IN_GROUP :
				return isSetInGroups();
			case UMLPackage.OBJECT_FLOW__IS_MULTICAST :
				return ((eFlags
					& IS_MULTICAST_EFLAG) != 0) != IS_MULTICAST_EDEFAULT;
			case UMLPackage.OBJECT_FLOW__IS_MULTIRECEIVE :
				return ((eFlags
					& IS_MULTIRECEIVE_EFLAG) != 0) != IS_MULTIRECEIVE_EDEFAULT;
			case UMLPackage.OBJECT_FLOW__SELECTION :
				return selection != null;
			case UMLPackage.OBJECT_FLOW__TRANSFORMATION :
				return transformation != null;
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
			case UMLPackage.OBJECT_FLOW___GET_EANNOTATION__STRING :
				return getEAnnotation((String) arguments.get(0));
			case UMLPackage.OBJECT_FLOW___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP :
				return validateHasOwner((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.OBJECT_FLOW___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP :
				return validateNotOwnSelf((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.OBJECT_FLOW___ADD_KEYWORD__STRING :
				return addKeyword((String) arguments.get(0));
			case UMLPackage.OBJECT_FLOW___APPLY_STEREOTYPE__STEREOTYPE :
				return applyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.OBJECT_FLOW___CREATE_EANNOTATION__STRING :
				return createEAnnotation((String) arguments.get(0));
			case UMLPackage.OBJECT_FLOW___DESTROY :
				destroy();
				return null;
			case UMLPackage.OBJECT_FLOW___GET_KEYWORDS :
				return getKeywords();
			case UMLPackage.OBJECT_FLOW___GET_APPLICABLE_STEREOTYPE__STRING :
				return getApplicableStereotype((String) arguments.get(0));
			case UMLPackage.OBJECT_FLOW___GET_APPLICABLE_STEREOTYPES :
				return getApplicableStereotypes();
			case UMLPackage.OBJECT_FLOW___GET_APPLIED_STEREOTYPE__STRING :
				return getAppliedStereotype((String) arguments.get(0));
			case UMLPackage.OBJECT_FLOW___GET_APPLIED_STEREOTYPES :
				return getAppliedStereotypes();
			case UMLPackage.OBJECT_FLOW___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING :
				return getAppliedSubstereotype((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.OBJECT_FLOW___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE :
				return getAppliedSubstereotypes((Stereotype) arguments.get(0));
			case UMLPackage.OBJECT_FLOW___GET_MODEL :
				return getModel();
			case UMLPackage.OBJECT_FLOW___GET_NEAREST_PACKAGE :
				return getNearestPackage();
			case UMLPackage.OBJECT_FLOW___GET_RELATIONSHIPS :
				return getRelationships();
			case UMLPackage.OBJECT_FLOW___GET_RELATIONSHIPS__ECLASS :
				return getRelationships((EClass) arguments.get(0));
			case UMLPackage.OBJECT_FLOW___GET_REQUIRED_STEREOTYPE__STRING :
				return getRequiredStereotype((String) arguments.get(0));
			case UMLPackage.OBJECT_FLOW___GET_REQUIRED_STEREOTYPES :
				return getRequiredStereotypes();
			case UMLPackage.OBJECT_FLOW___GET_SOURCE_DIRECTED_RELATIONSHIPS :
				return getSourceDirectedRelationships();
			case UMLPackage.OBJECT_FLOW___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS :
				return getSourceDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.OBJECT_FLOW___GET_STEREOTYPE_APPLICATION__STEREOTYPE :
				return getStereotypeApplication((Stereotype) arguments.get(0));
			case UMLPackage.OBJECT_FLOW___GET_STEREOTYPE_APPLICATIONS :
				return getStereotypeApplications();
			case UMLPackage.OBJECT_FLOW___GET_TARGET_DIRECTED_RELATIONSHIPS :
				return getTargetDirectedRelationships();
			case UMLPackage.OBJECT_FLOW___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS :
				return getTargetDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.OBJECT_FLOW___GET_VALUE__STEREOTYPE_STRING :
				return getValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.OBJECT_FLOW___HAS_KEYWORD__STRING :
				return hasKeyword((String) arguments.get(0));
			case UMLPackage.OBJECT_FLOW___HAS_VALUE__STEREOTYPE_STRING :
				return hasValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.OBJECT_FLOW___IS_STEREOTYPE_APPLICABLE__STEREOTYPE :
				return isStereotypeApplicable((Stereotype) arguments.get(0));
			case UMLPackage.OBJECT_FLOW___IS_STEREOTYPE_APPLIED__STEREOTYPE :
				return isStereotypeApplied((Stereotype) arguments.get(0));
			case UMLPackage.OBJECT_FLOW___IS_STEREOTYPE_REQUIRED__STEREOTYPE :
				return isStereotypeRequired((Stereotype) arguments.get(0));
			case UMLPackage.OBJECT_FLOW___REMOVE_KEYWORD__STRING :
				return removeKeyword((String) arguments.get(0));
			case UMLPackage.OBJECT_FLOW___SET_VALUE__STEREOTYPE_STRING_OBJECT :
				setValue((Stereotype) arguments.get(0),
					(String) arguments.get(1), arguments.get(2));
				return null;
			case UMLPackage.OBJECT_FLOW___UNAPPLY_STEREOTYPE__STEREOTYPE :
				return unapplyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.OBJECT_FLOW___ALL_OWNED_ELEMENTS :
				return allOwnedElements();
			case UMLPackage.OBJECT_FLOW___MUST_BE_OWNED :
				return mustBeOwned();
			case UMLPackage.OBJECT_FLOW___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP :
				return validateVisibilityNeedsOwnership(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.OBJECT_FLOW___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.OBJECT_FLOW___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasNoQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.OBJECT_FLOW___CREATE_DEPENDENCY__NAMEDELEMENT :
				return createDependency((NamedElement) arguments.get(0));
			case UMLPackage.OBJECT_FLOW___CREATE_USAGE__NAMEDELEMENT :
				return createUsage((NamedElement) arguments.get(0));
			case UMLPackage.OBJECT_FLOW___GET_LABEL :
				return getLabel();
			case UMLPackage.OBJECT_FLOW___GET_LABEL__BOOLEAN :
				return getLabel((Boolean) arguments.get(0));
			case UMLPackage.OBJECT_FLOW___GET_NAMESPACE :
				return getNamespace();
			case UMLPackage.OBJECT_FLOW___ALL_NAMESPACES :
				return allNamespaces();
			case UMLPackage.OBJECT_FLOW___ALL_OWNING_PACKAGES :
				return allOwningPackages();
			case UMLPackage.OBJECT_FLOW___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE :
				return isDistinguishableFrom((NamedElement) arguments.get(0),
					(Namespace) arguments.get(1));
			case UMLPackage.OBJECT_FLOW___GET_QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.OBJECT_FLOW___SEPARATOR :
				return separator();
			case UMLPackage.OBJECT_FLOW___GET_CLIENT_DEPENDENCIES :
				return getClientDependencies();
			case UMLPackage.OBJECT_FLOW___VALIDATE_REDEFINITION_CONSISTENT__DIAGNOSTICCHAIN_MAP :
				return validateRedefinitionConsistent(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.OBJECT_FLOW___VALIDATE_NON_LEAF_REDEFINITION__DIAGNOSTICCHAIN_MAP :
				return validateNonLeafRedefinition(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.OBJECT_FLOW___VALIDATE_REDEFINITION_CONTEXT_VALID__DIAGNOSTICCHAIN_MAP :
				return validateRedefinitionContextValid(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.OBJECT_FLOW___IS_CONSISTENT_WITH__REDEFINABLEELEMENT :
				return isConsistentWith((RedefinableElement) arguments.get(0));
			case UMLPackage.OBJECT_FLOW___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT :
				return isRedefinitionContextValid(
					(RedefinableElement) arguments.get(0));
			case UMLPackage.OBJECT_FLOW___VALIDATE_SOURCE_AND_TARGET__DIAGNOSTICCHAIN_MAP :
				return validateSourceAndTarget(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.OBJECT_FLOW___VALIDATE_INPUT_AND_OUTPUT_PARAMETER__DIAGNOSTICCHAIN_MAP :
				return validateInputAndOutputParameter(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.OBJECT_FLOW___VALIDATE_NO_EXECUTABLE_NODES__DIAGNOSTICCHAIN_MAP :
				return validateNoExecutableNodes(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.OBJECT_FLOW___VALIDATE_TRANSFORMATION_BEHAVIOR__DIAGNOSTICCHAIN_MAP :
				return validateTransformationBehavior(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.OBJECT_FLOW___VALIDATE_SELECTION_BEHAVIOR__DIAGNOSTICCHAIN_MAP :
				return validateSelectionBehavior(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.OBJECT_FLOW___VALIDATE_COMPATIBLE_TYPES__DIAGNOSTICCHAIN_MAP :
				return validateCompatibleTypes(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.OBJECT_FLOW___VALIDATE_SAME_UPPER_BOUNDS__DIAGNOSTICCHAIN_MAP :
				return validateSameUpperBounds(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.OBJECT_FLOW___VALIDATE_TARGET__DIAGNOSTICCHAIN_MAP :
				return validateTarget((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.OBJECT_FLOW___VALIDATE_IS_MULTICAST_OR_IS_MULTIRECEIVE__DIAGNOSTICCHAIN_MAP :
				return validateIsMulticastOrIsMultireceive(
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
		result.append(" (isMulticast: "); //$NON-NLS-1$
		result.append((eFlags & IS_MULTICAST_EFLAG) != 0);
		result.append(", isMultireceive: "); //$NON-NLS-1$
		result.append((eFlags & IS_MULTIRECEIVE_EFLAG) != 0);
		result.append(')');
		return result.toString();
	}

} //ObjectFlowImpl
