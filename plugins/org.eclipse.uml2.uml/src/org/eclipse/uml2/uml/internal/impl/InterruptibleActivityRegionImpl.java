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

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.ActivityEdge;
import org.eclipse.uml2.uml.ActivityNode;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.InterruptibleActivityRegion;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.UMLPackage;

import org.eclipse.uml2.uml.VisibilityKind;
import org.eclipse.uml2.uml.internal.operations.InterruptibleActivityRegionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interruptible Activity Region</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InterruptibleActivityRegionImpl#getContainedNodes <em>Contained Node</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InterruptibleActivityRegionImpl#getInterruptingEdges <em>Interrupting Edge</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InterruptibleActivityRegionImpl#getNodes <em>Node</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterruptibleActivityRegionImpl
		extends ActivityGroupImpl
		implements InterruptibleActivityRegion {

	/**
	 * The cached value of the '{@link #getInterruptingEdges() <em>Interrupting Edge</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterruptingEdges()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityEdge> interruptingEdges;

	/**
	 * The cached value of the '{@link #getNodes() <em>Node</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityNode> nodes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterruptibleActivityRegionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.INTERRUPTIBLE_ACTIVITY_REGION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ActivityNode> getContainedNodes() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			@SuppressWarnings("unchecked")
			EList<ActivityNode> containedNodes = (EList<ActivityNode>) cache
				.get(eResource, this,
					UMLPackage.Literals.ACTIVITY_GROUP__CONTAINED_NODE);
			if (containedNodes == null) {
				cache.put(eResource, this,
					UMLPackage.Literals.ACTIVITY_GROUP__CONTAINED_NODE,
					containedNodes = new DerivedUnionEObjectEList<ActivityNode>(
						ActivityNode.class, this,
						UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__CONTAINED_NODE,
						CONTAINED_NODE_ESUBSETS));
			}
			return containedNodes;
		}
		return new DerivedUnionEObjectEList<ActivityNode>(ActivityNode.class,
			this, UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__CONTAINED_NODE,
			CONTAINED_NODE_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityNode> getNodes() {
		if (nodes == null) {
			nodes = new EObjectWithInverseResolvingEList.ManyInverse<ActivityNode>(
				ActivityNode.class, this,
				UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__NODE,
				UMLPackage.ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION);
		}
		return nodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNode getNode(String name) {
		return getNode(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNode getNode(String name, boolean ignoreCase,
			EClass eClass) {
		nodeLoop : for (ActivityNode node : getNodes()) {
			if (eClass != null && !eClass.isInstance(node))
				continue nodeLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(node.getName())
				: name.equals(node.getName())))
				continue nodeLoop;
			return node;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityEdge> getInterruptingEdges() {
		if (interruptingEdges == null) {
			interruptingEdges = new EObjectWithInverseResolvingEList<ActivityEdge>(
				ActivityEdge.class, this,
				UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__INTERRUPTING_EDGE,
				UMLPackage.ACTIVITY_EDGE__INTERRUPTS);
		}
		return interruptingEdges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityEdge getInterruptingEdge(String name) {
		return getInterruptingEdge(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityEdge getInterruptingEdge(String name, boolean ignoreCase,
			EClass eClass) {
		interruptingEdgeLoop : for (ActivityEdge interruptingEdge : getInterruptingEdges()) {
			if (eClass != null && !eClass.isInstance(interruptingEdge))
				continue interruptingEdgeLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(interruptingEdge.getName())
				: name.equals(interruptingEdge.getName())))
				continue interruptingEdgeLoop;
			return interruptingEdge;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterruptingEdges(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return InterruptibleActivityRegionOperations
			.validateInterruptingEdges(this, diagnostics, context);
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
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__EANNOTATIONS :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getEAnnotations())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__INTERRUPTING_EDGE :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getInterruptingEdges())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__NODE :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getNodes())
					.basicAdd(otherEnd, msgs);
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
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__EANNOTATIONS :
				return ((InternalEList<?>) getEAnnotations())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__OWNED_COMMENT :
				return ((InternalEList<?>) getOwnedComments())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__INTERRUPTING_EDGE :
				return ((InternalEList<?>) getInterruptingEdges())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__NODE :
				return ((InternalEList<?>) getNodes()).basicRemove(otherEnd,
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
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__NAME :
				return getName();
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__VISIBILITY :
				return getVisibility();
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__CONTAINED_EDGE :
				return getContainedEdges();
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__CONTAINED_NODE :
				return getContainedNodes();
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__IN_ACTIVITY :
				if (resolve)
					return getInActivity();
				return basicGetInActivity();
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__SUBGROUP :
				return getSubgroups();
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__SUPER_GROUP :
				if (resolve)
					return getSuperGroup();
				return basicGetSuperGroup();
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__INTERRUPTING_EDGE :
				return getInterruptingEdges();
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__NODE :
				return getNodes();
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
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations()
					.addAll((Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments()
					.addAll((Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__IN_ACTIVITY :
				setInActivity((Activity) newValue);
				return;
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__INTERRUPTING_EDGE :
				getInterruptingEdges().clear();
				getInterruptingEdges()
					.addAll((Collection<? extends ActivityEdge>) newValue);
				return;
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__NODE :
				getNodes().clear();
				getNodes()
					.addAll((Collection<? extends ActivityNode>) newValue);
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
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__NAME :
				unsetName();
				return;
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__IN_ACTIVITY :
				setInActivity((Activity) null);
				return;
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__INTERRUPTING_EDGE :
				getInterruptingEdges().clear();
				return;
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__NODE :
				getNodes().clear();
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
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__OWNER :
				return isSetOwner();
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__CLIENT_DEPENDENCY :
				return !getClientDependencies().isEmpty();
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__NAME :
				return isSetName();
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__CONTAINED_EDGE :
				return isSetContainedEdges();
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__CONTAINED_NODE :
				return isSetContainedNodes();
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__IN_ACTIVITY :
				return basicGetInActivity() != null;
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__SUBGROUP :
				return isSetSubgroups();
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__SUPER_GROUP :
				return isSetSuperGroup();
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__INTERRUPTING_EDGE :
				return interruptingEdges != null
					&& !interruptingEdges.isEmpty();
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__NODE :
				return nodes != null && !nodes.isEmpty();
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
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION___GET_EANNOTATION__STRING :
				return getEAnnotation((String) arguments.get(0));
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP :
				return validateHasOwner((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP :
				return validateNotOwnSelf((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION___ADD_KEYWORD__STRING :
				return addKeyword((String) arguments.get(0));
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION___APPLY_STEREOTYPE__STEREOTYPE :
				return applyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION___CREATE_EANNOTATION__STRING :
				return createEAnnotation((String) arguments.get(0));
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION___DESTROY :
				destroy();
				return null;
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION___GET_KEYWORDS :
				return getKeywords();
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION___GET_APPLICABLE_STEREOTYPE__STRING :
				return getApplicableStereotype((String) arguments.get(0));
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION___GET_APPLICABLE_STEREOTYPES :
				return getApplicableStereotypes();
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION___GET_APPLIED_STEREOTYPE__STRING :
				return getAppliedStereotype((String) arguments.get(0));
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION___GET_APPLIED_STEREOTYPES :
				return getAppliedStereotypes();
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING :
				return getAppliedSubstereotype((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE :
				return getAppliedSubstereotypes((Stereotype) arguments.get(0));
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION___GET_MODEL :
				return getModel();
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION___GET_NEAREST_PACKAGE :
				return getNearestPackage();
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION___GET_RELATIONSHIPS :
				return getRelationships();
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION___GET_RELATIONSHIPS__ECLASS :
				return getRelationships((EClass) arguments.get(0));
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION___GET_REQUIRED_STEREOTYPE__STRING :
				return getRequiredStereotype((String) arguments.get(0));
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION___GET_REQUIRED_STEREOTYPES :
				return getRequiredStereotypes();
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION___GET_SOURCE_DIRECTED_RELATIONSHIPS :
				return getSourceDirectedRelationships();
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS :
				return getSourceDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION___GET_STEREOTYPE_APPLICATION__STEREOTYPE :
				return getStereotypeApplication((Stereotype) arguments.get(0));
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION___GET_STEREOTYPE_APPLICATIONS :
				return getStereotypeApplications();
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION___GET_TARGET_DIRECTED_RELATIONSHIPS :
				return getTargetDirectedRelationships();
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS :
				return getTargetDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION___GET_VALUE__STEREOTYPE_STRING :
				return getValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION___HAS_KEYWORD__STRING :
				return hasKeyword((String) arguments.get(0));
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION___HAS_VALUE__STEREOTYPE_STRING :
				return hasValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION___IS_STEREOTYPE_APPLICABLE__STEREOTYPE :
				return isStereotypeApplicable((Stereotype) arguments.get(0));
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION___IS_STEREOTYPE_APPLIED__STEREOTYPE :
				return isStereotypeApplied((Stereotype) arguments.get(0));
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION___IS_STEREOTYPE_REQUIRED__STEREOTYPE :
				return isStereotypeRequired((Stereotype) arguments.get(0));
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION___REMOVE_KEYWORD__STRING :
				return removeKeyword((String) arguments.get(0));
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION___SET_VALUE__STEREOTYPE_STRING_OBJECT :
				setValue((Stereotype) arguments.get(0),
					(String) arguments.get(1), arguments.get(2));
				return null;
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION___UNAPPLY_STEREOTYPE__STEREOTYPE :
				return unapplyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION___ALL_OWNED_ELEMENTS :
				return allOwnedElements();
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION___MUST_BE_OWNED :
				return mustBeOwned();
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP :
				return validateVisibilityNeedsOwnership(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasNoQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION___CREATE_DEPENDENCY__NAMEDELEMENT :
				return createDependency((NamedElement) arguments.get(0));
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION___CREATE_USAGE__NAMEDELEMENT :
				return createUsage((NamedElement) arguments.get(0));
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION___GET_LABEL :
				return getLabel();
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION___GET_LABEL__BOOLEAN :
				return getLabel((Boolean) arguments.get(0));
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION___GET_NAMESPACE :
				return getNamespace();
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION___ALL_NAMESPACES :
				return allNamespaces();
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION___ALL_OWNING_PACKAGES :
				return allOwningPackages();
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE :
				return isDistinguishableFrom((NamedElement) arguments.get(0),
					(Namespace) arguments.get(1));
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION___GET_QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION___SEPARATOR :
				return separator();
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION___GET_CLIENT_DEPENDENCIES :
				return getClientDependencies();
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION___CONTAINING_ACTIVITY :
				return containingActivity();
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION___VALIDATE_NODES_AND_EDGES__DIAGNOSTICCHAIN_MAP :
				return validateNodesAndEdges((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION___VALIDATE_NOT_CONTAINED__DIAGNOSTICCHAIN_MAP :
				return validateNotContained((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION___VALIDATE_INTERRUPTING_EDGES__DIAGNOSTICCHAIN_MAP :
				return validateInterruptingEdges(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		}
		return eDynamicInvoke(operationID, arguments);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getContainedNodes() <em>Contained Node</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedNodes()
	 * @generated
	 * @ordered
	 */
	protected static final int[] CONTAINED_NODE_ESUBSETS = new int[]{
		UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__NODE};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetContainedNodes() {
		return super.isSetContainedNodes()
			|| eIsSet(UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__NODE);
	}

} //InterruptibleActivityRegionImpl
