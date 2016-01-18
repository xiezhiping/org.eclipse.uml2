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
 *   Kenn Hussey (CEA) - 327039, 351774, 418466, 451350, 465214, 485756
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

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.ActivityContent;
import org.eclipse.uml2.uml.ActivityEdge;
import org.eclipse.uml2.uml.ActivityGroup;
import org.eclipse.uml2.uml.ActivityNode;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.UMLPackage;

import org.eclipse.uml2.uml.VisibilityKind;
import org.eclipse.uml2.uml.internal.operations.ActivityGroupOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ActivityGroupImpl#getContainedEdges <em>Contained Edge</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ActivityGroupImpl#getContainedNodes <em>Contained Node</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ActivityGroupImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ActivityGroupImpl#getSubgroups <em>Subgroup</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ActivityGroupImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ActivityGroupImpl#getSuperGroup <em>Super Group</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ActivityGroupImpl#getInActivity <em>In Activity</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ActivityGroupImpl
		extends NamedElementImpl
		implements ActivityGroup {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.ACTIVITY_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityGroup> getSubgroups() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			@SuppressWarnings("unchecked")
			EList<ActivityGroup> subgroups = (EList<ActivityGroup>) cache.get(
				eResource, this, UMLPackage.Literals.ACTIVITY_GROUP__SUBGROUP);
			if (subgroups == null) {
				cache.put(eResource, this,
					UMLPackage.Literals.ACTIVITY_GROUP__SUBGROUP,
					subgroups = new DerivedUnionEObjectEList<ActivityGroup>(
						ActivityGroup.class, this,
						UMLPackage.ACTIVITY_GROUP__SUBGROUP, null));
			}
			return subgroups;
		}
		return new DerivedUnionEObjectEList<ActivityGroup>(ActivityGroup.class,
			this, UMLPackage.ACTIVITY_GROUP__SUBGROUP, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityGroup getSubgroup(String name) {
		return getSubgroup(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityGroup getSubgroup(String name, boolean ignoreCase,
			EClass eClass) {
		subgroupLoop : for (ActivityGroup subgroup : getSubgroups()) {
			if (eClass != null && !eClass.isInstance(subgroup))
				continue subgroupLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(subgroup.getName())
				: name.equals(subgroup.getName())))
				continue subgroupLoop;
			return subgroup;
		}
		return null;
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
						UMLPackage.ACTIVITY_GROUP__OWNED_ELEMENT,
						OWNED_ELEMENT_ESUBSETS));
			}
			return ownedElements;
		}
		return new DerivedUnionEObjectEList<Element>(Element.class, this,
			UMLPackage.ACTIVITY_GROUP__OWNED_ELEMENT, OWNED_ELEMENT_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
						UMLPackage.ACTIVITY_GROUP__CONTAINED_NODE, null));
			}
			return containedNodes;
		}
		return new DerivedUnionEObjectEList<ActivityNode>(ActivityNode.class,
			this, UMLPackage.ACTIVITY_GROUP__CONTAINED_NODE, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNode getContainedNode(String name) {
		return getContainedNode(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNode getContainedNode(String name, boolean ignoreCase,
			EClass eClass) {
		containedNodeLoop : for (ActivityNode containedNode : getContainedNodes()) {
			if (eClass != null && !eClass.isInstance(containedNode))
				continue containedNodeLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(containedNode.getName())
				: name.equals(containedNode.getName())))
				continue containedNodeLoop;
			return containedNode;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityEdge> getContainedEdges() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			@SuppressWarnings("unchecked")
			EList<ActivityEdge> containedEdges = (EList<ActivityEdge>) cache
				.get(eResource, this,
					UMLPackage.Literals.ACTIVITY_GROUP__CONTAINED_EDGE);
			if (containedEdges == null) {
				cache.put(eResource, this,
					UMLPackage.Literals.ACTIVITY_GROUP__CONTAINED_EDGE,
					containedEdges = new DerivedUnionEObjectEList<ActivityEdge>(
						ActivityEdge.class, this,
						UMLPackage.ACTIVITY_GROUP__CONTAINED_EDGE, null));
			}
			return containedEdges;
		}
		return new DerivedUnionEObjectEList<ActivityEdge>(ActivityEdge.class,
			this, UMLPackage.ACTIVITY_GROUP__CONTAINED_EDGE, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityEdge getContainedEdge(String name) {
		return getContainedEdge(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityEdge getContainedEdge(String name, boolean ignoreCase,
			EClass eClass) {
		containedEdgeLoop : for (ActivityEdge containedEdge : getContainedEdges()) {
			if (eClass != null && !eClass.isInstance(containedEdge))
				continue containedEdgeLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(containedEdge.getName())
				: name.equals(containedEdge.getName())))
				continue containedEdgeLoop;
			return containedEdge;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity getInActivity() {
		Activity inActivity = basicGetInActivity();
		return inActivity != null && inActivity.eIsProxy()
			? (Activity) eResolveProxy((InternalEObject) inActivity)
			: inActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Activity basicGetInActivity() {
		InternalEObject eInternalContainer = eInternalContainer();
		return eInternalContainer instanceof Activity
			? (Activity) eInternalContainer
			: null;
	}

	public NotificationChain eBasicRemoveFromContainer(NotificationChain msgs) {
		InternalEObject eInternalContainer = eInternalContainer();
		if (eInternalContainer instanceof Activity) {
			return ((InternalEList<ActivityGroup>) ((Activity) eInternalContainer)
				.getGroups()).basicRemove(this, msgs);
		}
		return super.eBasicRemoveFromContainer(msgs);
	}

	@Override
	public NotificationChain eBasicSetContainer(InternalEObject newContainer,
			int newContainerFeatureID, NotificationChain msgs) {
		InternalEObject eInternalContainer = eInternalContainer();
		if (eInternalContainer instanceof Activity) {
			msgs = ((InternalEList<ActivityGroup>) ((Activity) eInternalContainer)
				.getGroups()).basicRemove(this, msgs);
		}
		return super.eBasicSetContainer(newContainer, newContainerFeatureID,
			msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setInActivity(Activity newInActivity) {
		if (newInActivity != eInternalContainer()) {
			if (EcoreUtil.isAncestor(this, newInActivity))
				throw new IllegalArgumentException(
					"Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newInActivity != null)
				msgs = ((InternalEList<ActivityGroup>) newInActivity
					.getOwnedGroups()).basicAdd(this, msgs);
			msgs = eBasicSetContainer((InternalEObject) newInActivity,
				InternalEObject.EOPPOSITE_FEATURE_BASE
					- UMLPackage.ACTIVITY__OWNED_GROUP,
				msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.ACTIVITY_GROUP__IN_ACTIVITY, newInActivity,
				newInActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity containingActivity() {
		return ActivityGroupOperations.containingActivity(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNodesAndEdges(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ActivityGroupOperations.validateNodesAndEdges(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNotContained(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ActivityGroupOperations.validateNotContained(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.ACTIVITY_GROUP__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.ACTIVITY_GROUP__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.ACTIVITY_GROUP__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.ACTIVITY_GROUP__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.ACTIVITY_GROUP__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.ACTIVITY_GROUP__NAME :
				return getName();
			case UMLPackage.ACTIVITY_GROUP__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.ACTIVITY_GROUP__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.ACTIVITY_GROUP__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.ACTIVITY_GROUP__VISIBILITY :
				return getVisibility();
			case UMLPackage.ACTIVITY_GROUP__CONTAINED_EDGE :
				return getContainedEdges();
			case UMLPackage.ACTIVITY_GROUP__CONTAINED_NODE :
				return getContainedNodes();
			case UMLPackage.ACTIVITY_GROUP__IN_ACTIVITY :
				if (resolve)
					return getInActivity();
				return basicGetInActivity();
			case UMLPackage.ACTIVITY_GROUP__SUBGROUP :
				return getSubgroups();
			case UMLPackage.ACTIVITY_GROUP__SUPER_GROUP :
				if (resolve)
					return getSuperGroup();
				return basicGetSuperGroup();
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
			case UMLPackage.ACTIVITY_GROUP__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations()
					.addAll((Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.ACTIVITY_GROUP__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments()
					.addAll((Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.ACTIVITY_GROUP__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.ACTIVITY_GROUP__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.ACTIVITY_GROUP__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.ACTIVITY_GROUP__IN_ACTIVITY :
				setInActivity((Activity) newValue);
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
			case UMLPackage.ACTIVITY_GROUP__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.ACTIVITY_GROUP__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.ACTIVITY_GROUP__NAME :
				unsetName();
				return;
			case UMLPackage.ACTIVITY_GROUP__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.ACTIVITY_GROUP__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.ACTIVITY_GROUP__IN_ACTIVITY :
				setInActivity((Activity) null);
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
			case UMLPackage.ACTIVITY_GROUP__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.ACTIVITY_GROUP__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.ACTIVITY_GROUP__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.ACTIVITY_GROUP__OWNER :
				return isSetOwner();
			case UMLPackage.ACTIVITY_GROUP__CLIENT_DEPENDENCY :
				return !getClientDependencies().isEmpty();
			case UMLPackage.ACTIVITY_GROUP__NAME :
				return isSetName();
			case UMLPackage.ACTIVITY_GROUP__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.ACTIVITY_GROUP__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.ACTIVITY_GROUP__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.ACTIVITY_GROUP__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.ACTIVITY_GROUP__CONTAINED_EDGE :
				return isSetContainedEdges();
			case UMLPackage.ACTIVITY_GROUP__CONTAINED_NODE :
				return isSetContainedNodes();
			case UMLPackage.ACTIVITY_GROUP__IN_ACTIVITY :
				return basicGetInActivity() != null;
			case UMLPackage.ACTIVITY_GROUP__SUBGROUP :
				return isSetSubgroups();
			case UMLPackage.ACTIVITY_GROUP__SUPER_GROUP :
				return isSetSuperGroup();
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == ActivityContent.class) {
			switch (baseOperationID) {
				case UMLPackage.ACTIVITY_CONTENT___CONTAINING_ACTIVITY :
					return UMLPackage.ACTIVITY_GROUP___CONTAINING_ACTIVITY;
				default :
					return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
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
			case UMLPackage.ACTIVITY_GROUP___GET_EANNOTATION__STRING :
				return getEAnnotation((String) arguments.get(0));
			case UMLPackage.ACTIVITY_GROUP___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP :
				return validateHasOwner((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ACTIVITY_GROUP___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP :
				return validateNotOwnSelf((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ACTIVITY_GROUP___ADD_KEYWORD__STRING :
				return addKeyword((String) arguments.get(0));
			case UMLPackage.ACTIVITY_GROUP___APPLY_STEREOTYPE__STEREOTYPE :
				return applyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.ACTIVITY_GROUP___CREATE_EANNOTATION__STRING :
				return createEAnnotation((String) arguments.get(0));
			case UMLPackage.ACTIVITY_GROUP___DESTROY :
				destroy();
				return null;
			case UMLPackage.ACTIVITY_GROUP___GET_KEYWORDS :
				return getKeywords();
			case UMLPackage.ACTIVITY_GROUP___GET_APPLICABLE_STEREOTYPE__STRING :
				return getApplicableStereotype((String) arguments.get(0));
			case UMLPackage.ACTIVITY_GROUP___GET_APPLICABLE_STEREOTYPES :
				return getApplicableStereotypes();
			case UMLPackage.ACTIVITY_GROUP___GET_APPLIED_STEREOTYPE__STRING :
				return getAppliedStereotype((String) arguments.get(0));
			case UMLPackage.ACTIVITY_GROUP___GET_APPLIED_STEREOTYPES :
				return getAppliedStereotypes();
			case UMLPackage.ACTIVITY_GROUP___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING :
				return getAppliedSubstereotype((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.ACTIVITY_GROUP___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE :
				return getAppliedSubstereotypes((Stereotype) arguments.get(0));
			case UMLPackage.ACTIVITY_GROUP___GET_MODEL :
				return getModel();
			case UMLPackage.ACTIVITY_GROUP___GET_NEAREST_PACKAGE :
				return getNearestPackage();
			case UMLPackage.ACTIVITY_GROUP___GET_RELATIONSHIPS :
				return getRelationships();
			case UMLPackage.ACTIVITY_GROUP___GET_RELATIONSHIPS__ECLASS :
				return getRelationships((EClass) arguments.get(0));
			case UMLPackage.ACTIVITY_GROUP___GET_REQUIRED_STEREOTYPE__STRING :
				return getRequiredStereotype((String) arguments.get(0));
			case UMLPackage.ACTIVITY_GROUP___GET_REQUIRED_STEREOTYPES :
				return getRequiredStereotypes();
			case UMLPackage.ACTIVITY_GROUP___GET_SOURCE_DIRECTED_RELATIONSHIPS :
				return getSourceDirectedRelationships();
			case UMLPackage.ACTIVITY_GROUP___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS :
				return getSourceDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.ACTIVITY_GROUP___GET_STEREOTYPE_APPLICATION__STEREOTYPE :
				return getStereotypeApplication((Stereotype) arguments.get(0));
			case UMLPackage.ACTIVITY_GROUP___GET_STEREOTYPE_APPLICATIONS :
				return getStereotypeApplications();
			case UMLPackage.ACTIVITY_GROUP___GET_TARGET_DIRECTED_RELATIONSHIPS :
				return getTargetDirectedRelationships();
			case UMLPackage.ACTIVITY_GROUP___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS :
				return getTargetDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.ACTIVITY_GROUP___GET_VALUE__STEREOTYPE_STRING :
				return getValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.ACTIVITY_GROUP___HAS_KEYWORD__STRING :
				return hasKeyword((String) arguments.get(0));
			case UMLPackage.ACTIVITY_GROUP___HAS_VALUE__STEREOTYPE_STRING :
				return hasValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.ACTIVITY_GROUP___IS_STEREOTYPE_APPLICABLE__STEREOTYPE :
				return isStereotypeApplicable((Stereotype) arguments.get(0));
			case UMLPackage.ACTIVITY_GROUP___IS_STEREOTYPE_APPLIED__STEREOTYPE :
				return isStereotypeApplied((Stereotype) arguments.get(0));
			case UMLPackage.ACTIVITY_GROUP___IS_STEREOTYPE_REQUIRED__STEREOTYPE :
				return isStereotypeRequired((Stereotype) arguments.get(0));
			case UMLPackage.ACTIVITY_GROUP___REMOVE_KEYWORD__STRING :
				return removeKeyword((String) arguments.get(0));
			case UMLPackage.ACTIVITY_GROUP___SET_VALUE__STEREOTYPE_STRING_OBJECT :
				setValue((Stereotype) arguments.get(0),
					(String) arguments.get(1), arguments.get(2));
				return null;
			case UMLPackage.ACTIVITY_GROUP___UNAPPLY_STEREOTYPE__STEREOTYPE :
				return unapplyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.ACTIVITY_GROUP___ALL_OWNED_ELEMENTS :
				return allOwnedElements();
			case UMLPackage.ACTIVITY_GROUP___MUST_BE_OWNED :
				return mustBeOwned();
			case UMLPackage.ACTIVITY_GROUP___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP :
				return validateVisibilityNeedsOwnership(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ACTIVITY_GROUP___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ACTIVITY_GROUP___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasNoQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ACTIVITY_GROUP___CREATE_DEPENDENCY__NAMEDELEMENT :
				return createDependency((NamedElement) arguments.get(0));
			case UMLPackage.ACTIVITY_GROUP___CREATE_USAGE__NAMEDELEMENT :
				return createUsage((NamedElement) arguments.get(0));
			case UMLPackage.ACTIVITY_GROUP___GET_LABEL :
				return getLabel();
			case UMLPackage.ACTIVITY_GROUP___GET_LABEL__BOOLEAN :
				return getLabel((Boolean) arguments.get(0));
			case UMLPackage.ACTIVITY_GROUP___GET_NAMESPACE :
				return getNamespace();
			case UMLPackage.ACTIVITY_GROUP___ALL_NAMESPACES :
				return allNamespaces();
			case UMLPackage.ACTIVITY_GROUP___ALL_OWNING_PACKAGES :
				return allOwningPackages();
			case UMLPackage.ACTIVITY_GROUP___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE :
				return isDistinguishableFrom((NamedElement) arguments.get(0),
					(Namespace) arguments.get(1));
			case UMLPackage.ACTIVITY_GROUP___GET_QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.ACTIVITY_GROUP___SEPARATOR :
				return separator();
			case UMLPackage.ACTIVITY_GROUP___GET_CLIENT_DEPENDENCIES :
				return getClientDependencies();
			case UMLPackage.ACTIVITY_GROUP___CONTAINING_ACTIVITY :
				return containingActivity();
			case UMLPackage.ACTIVITY_GROUP___VALIDATE_NODES_AND_EDGES__DIAGNOSTICCHAIN_MAP :
				return validateNodesAndEdges((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ACTIVITY_GROUP___VALIDATE_NOT_CONTAINED__DIAGNOSTICCHAIN_MAP :
				return validateNotContained((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		}
		return eDynamicInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSubgroups() {
		return false;
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
		UMLPackage.ACTIVITY_GROUP__OWNED_COMMENT,
		UMLPackage.ACTIVITY_GROUP__NAME_EXPRESSION,
		UMLPackage.ACTIVITY_GROUP__SUBGROUP};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements() || isSetSubgroups();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityGroup basicGetSuperGroup() {
		return null;
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
	public ActivityGroup getSuperGroup() {
		ActivityGroup superGroup = basicGetSuperGroup();
		return superGroup != null && superGroup.eIsProxy()
			? (ActivityGroup) eResolveProxy((InternalEObject) superGroup)
			: superGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSuperGroup() {
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element basicGetOwner() {
		Activity inActivity = basicGetInActivity();
		if (inActivity != null) {
			return inActivity;
		}
		if (isSetSuperGroup()) {
			return basicGetSuperGroup();
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
			|| eIsSet(UMLPackage.ACTIVITY_GROUP__IN_ACTIVITY)
			|| isSetSuperGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetContainedNodes() {
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetContainedEdges() {
		return false;
	}

} //ActivityGroupImpl
