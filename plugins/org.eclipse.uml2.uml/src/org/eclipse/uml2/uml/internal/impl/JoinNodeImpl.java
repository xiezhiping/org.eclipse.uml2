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

import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.ActivityEdge;
import org.eclipse.uml2.uml.ActivityNode;
import org.eclipse.uml2.uml.ActivityPartition;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.InterruptibleActivityRegion;
import org.eclipse.uml2.uml.JoinNode;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.RedefinableElement;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.StructuredActivityNode;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.ValueSpecification;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.JoinNodeOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Join Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.JoinNodeImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.JoinNodeImpl#isCombineDuplicate <em>Is Combine Duplicate</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.JoinNodeImpl#getJoinSpec <em>Join Spec</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JoinNodeImpl
		extends ControlNodeImpl
		implements JoinNode {

	/**
	 * The default value of the '{@link #isCombineDuplicate() <em>Is Combine Duplicate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCombineDuplicate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_COMBINE_DUPLICATE_EDEFAULT = true;

	/**
	 * The flag representing the value of the '{@link #isCombineDuplicate() <em>Is Combine Duplicate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCombineDuplicate()
	 * @generated
	 * @ordered
	 */
	protected static final int IS_COMBINE_DUPLICATE_EFLAG = 1 << 13;

	/**
	 * The cached value of the '{@link #getJoinSpec() <em>Join Spec</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJoinSpec()
	 * @generated
	 * @ordered
	 */
	protected ValueSpecification joinSpec;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JoinNodeImpl() {
		super();
		eFlags |= IS_COMBINE_DUPLICATE_EFLAG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.JOIN_NODE;
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
						UMLPackage.JOIN_NODE__OWNED_ELEMENT,
						OWNED_ELEMENT_ESUBSETS));
			}
			return ownedElements;
		}
		return new DerivedUnionEObjectEList<Element>(Element.class, this,
			UMLPackage.JOIN_NODE__OWNED_ELEMENT, OWNED_ELEMENT_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCombineDuplicate() {
		return (eFlags & IS_COMBINE_DUPLICATE_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsCombineDuplicate(boolean newIsCombineDuplicate) {
		boolean oldIsCombineDuplicate = (eFlags
			& IS_COMBINE_DUPLICATE_EFLAG) != 0;
		if (newIsCombineDuplicate)
			eFlags |= IS_COMBINE_DUPLICATE_EFLAG;
		else
			eFlags &= ~IS_COMBINE_DUPLICATE_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.JOIN_NODE__IS_COMBINE_DUPLICATE,
				oldIsCombineDuplicate, newIsCombineDuplicate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getJoinSpec() {
		if (joinSpec != null && joinSpec.eIsProxy()) {
			InternalEObject oldJoinSpec = (InternalEObject) joinSpec;
			joinSpec = (ValueSpecification) eResolveProxy(oldJoinSpec);
			if (joinSpec != oldJoinSpec) {
				InternalEObject newJoinSpec = (InternalEObject) joinSpec;
				NotificationChain msgs = oldJoinSpec.eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE - UMLPackage.JOIN_NODE__JOIN_SPEC,
					null, null);
				if (newJoinSpec.eInternalContainer() == null) {
					msgs = newJoinSpec.eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- UMLPackage.JOIN_NODE__JOIN_SPEC, null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.JOIN_NODE__JOIN_SPEC, oldJoinSpec,
						joinSpec));
			}
		}
		return joinSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification basicGetJoinSpec() {
		return joinSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJoinSpec(ValueSpecification newJoinSpec,
			NotificationChain msgs) {
		ValueSpecification oldJoinSpec = joinSpec;
		joinSpec = newJoinSpec;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET, UMLPackage.JOIN_NODE__JOIN_SPEC, oldJoinSpec,
				newJoinSpec);
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
	public void setJoinSpec(ValueSpecification newJoinSpec) {
		if (newJoinSpec != joinSpec) {
			NotificationChain msgs = null;
			if (joinSpec != null)
				msgs = ((InternalEObject) joinSpec).eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE - UMLPackage.JOIN_NODE__JOIN_SPEC,
					null, msgs);
			if (newJoinSpec != null)
				msgs = ((InternalEObject) newJoinSpec).eInverseAdd(this,
					EOPPOSITE_FEATURE_BASE - UMLPackage.JOIN_NODE__JOIN_SPEC,
					null, msgs);
			msgs = basicSetJoinSpec(newJoinSpec, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.JOIN_NODE__JOIN_SPEC, newJoinSpec, newJoinSpec));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification createJoinSpec(String name, Type type,
			EClass eClass) {
		ValueSpecification newJoinSpec = (ValueSpecification) create(eClass);
		setJoinSpec(newJoinSpec);
		if (name != null)
			newJoinSpec.setName(name);
		if (type != null)
			newJoinSpec.setType(type);
		return newJoinSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOneOutgoingEdge(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return JoinNodeOperations.validateOneOutgoingEdge(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIncomingObjectFlow(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return JoinNodeOperations.validateIncomingObjectFlow(this, diagnostics,
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
			case UMLPackage.JOIN_NODE__EANNOTATIONS :
				return ((InternalEList<?>) getEAnnotations())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.JOIN_NODE__OWNED_COMMENT :
				return ((InternalEList<?>) getOwnedComments())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.JOIN_NODE__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.JOIN_NODE__IN_INTERRUPTIBLE_REGION :
				return ((InternalEList<?>) getInInterruptibleRegions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.JOIN_NODE__IN_STRUCTURED_NODE :
				return basicSetInStructuredNode(null, msgs);
			case UMLPackage.JOIN_NODE__INCOMING :
				return ((InternalEList<?>) getIncomings()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.JOIN_NODE__OUTGOING :
				return ((InternalEList<?>) getOutgoings()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.JOIN_NODE__IN_PARTITION :
				return ((InternalEList<?>) getInPartitions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.JOIN_NODE__JOIN_SPEC :
				return basicSetJoinSpec(null, msgs);
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
			case UMLPackage.JOIN_NODE__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.JOIN_NODE__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.JOIN_NODE__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.JOIN_NODE__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.JOIN_NODE__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.JOIN_NODE__NAME :
				return getName();
			case UMLPackage.JOIN_NODE__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.JOIN_NODE__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.JOIN_NODE__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.JOIN_NODE__VISIBILITY :
				return getVisibility();
			case UMLPackage.JOIN_NODE__IS_LEAF :
				return isLeaf();
			case UMLPackage.JOIN_NODE__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.JOIN_NODE__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.JOIN_NODE__ACTIVITY :
				if (resolve)
					return getActivity();
				return basicGetActivity();
			case UMLPackage.JOIN_NODE__IN_GROUP :
				return getInGroups();
			case UMLPackage.JOIN_NODE__IN_INTERRUPTIBLE_REGION :
				return getInInterruptibleRegions();
			case UMLPackage.JOIN_NODE__IN_STRUCTURED_NODE :
				if (resolve)
					return getInStructuredNode();
				return basicGetInStructuredNode();
			case UMLPackage.JOIN_NODE__INCOMING :
				return getIncomings();
			case UMLPackage.JOIN_NODE__OUTGOING :
				return getOutgoings();
			case UMLPackage.JOIN_NODE__REDEFINED_NODE :
				return getRedefinedNodes();
			case UMLPackage.JOIN_NODE__IN_PARTITION :
				return getInPartitions();
			case UMLPackage.JOIN_NODE__IS_COMBINE_DUPLICATE :
				return isCombineDuplicate();
			case UMLPackage.JOIN_NODE__JOIN_SPEC :
				if (resolve)
					return getJoinSpec();
				return basicGetJoinSpec();
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
			case UMLPackage.JOIN_NODE__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations()
					.addAll((Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.JOIN_NODE__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments()
					.addAll((Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.JOIN_NODE__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.JOIN_NODE__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.JOIN_NODE__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.JOIN_NODE__IS_LEAF :
				setIsLeaf((Boolean) newValue);
				return;
			case UMLPackage.JOIN_NODE__ACTIVITY :
				setActivity((Activity) newValue);
				return;
			case UMLPackage.JOIN_NODE__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				getInInterruptibleRegions().addAll(
					(Collection<? extends InterruptibleActivityRegion>) newValue);
				return;
			case UMLPackage.JOIN_NODE__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) newValue);
				return;
			case UMLPackage.JOIN_NODE__INCOMING :
				getIncomings().clear();
				getIncomings()
					.addAll((Collection<? extends ActivityEdge>) newValue);
				return;
			case UMLPackage.JOIN_NODE__OUTGOING :
				getOutgoings().clear();
				getOutgoings()
					.addAll((Collection<? extends ActivityEdge>) newValue);
				return;
			case UMLPackage.JOIN_NODE__REDEFINED_NODE :
				getRedefinedNodes().clear();
				getRedefinedNodes()
					.addAll((Collection<? extends ActivityNode>) newValue);
				return;
			case UMLPackage.JOIN_NODE__IN_PARTITION :
				getInPartitions().clear();
				getInPartitions()
					.addAll((Collection<? extends ActivityPartition>) newValue);
				return;
			case UMLPackage.JOIN_NODE__IS_COMBINE_DUPLICATE :
				setIsCombineDuplicate((Boolean) newValue);
				return;
			case UMLPackage.JOIN_NODE__JOIN_SPEC :
				setJoinSpec((ValueSpecification) newValue);
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
			case UMLPackage.JOIN_NODE__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.JOIN_NODE__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.JOIN_NODE__NAME :
				unsetName();
				return;
			case UMLPackage.JOIN_NODE__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.JOIN_NODE__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.JOIN_NODE__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.JOIN_NODE__ACTIVITY :
				setActivity((Activity) null);
				return;
			case UMLPackage.JOIN_NODE__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				return;
			case UMLPackage.JOIN_NODE__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) null);
				return;
			case UMLPackage.JOIN_NODE__INCOMING :
				getIncomings().clear();
				return;
			case UMLPackage.JOIN_NODE__OUTGOING :
				getOutgoings().clear();
				return;
			case UMLPackage.JOIN_NODE__REDEFINED_NODE :
				getRedefinedNodes().clear();
				return;
			case UMLPackage.JOIN_NODE__IN_PARTITION :
				getInPartitions().clear();
				return;
			case UMLPackage.JOIN_NODE__IS_COMBINE_DUPLICATE :
				setIsCombineDuplicate(IS_COMBINE_DUPLICATE_EDEFAULT);
				return;
			case UMLPackage.JOIN_NODE__JOIN_SPEC :
				setJoinSpec((ValueSpecification) null);
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
			case UMLPackage.JOIN_NODE__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.JOIN_NODE__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.JOIN_NODE__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.JOIN_NODE__OWNER :
				return isSetOwner();
			case UMLPackage.JOIN_NODE__CLIENT_DEPENDENCY :
				return !getClientDependencies().isEmpty();
			case UMLPackage.JOIN_NODE__NAME :
				return isSetName();
			case UMLPackage.JOIN_NODE__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.JOIN_NODE__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.JOIN_NODE__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.JOIN_NODE__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.JOIN_NODE__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.JOIN_NODE__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.JOIN_NODE__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.JOIN_NODE__ACTIVITY :
				return basicGetActivity() != null;
			case UMLPackage.JOIN_NODE__IN_GROUP :
				return isSetInGroups();
			case UMLPackage.JOIN_NODE__IN_INTERRUPTIBLE_REGION :
				return inInterruptibleRegions != null
					&& !inInterruptibleRegions.isEmpty();
			case UMLPackage.JOIN_NODE__IN_STRUCTURED_NODE :
				return basicGetInStructuredNode() != null;
			case UMLPackage.JOIN_NODE__INCOMING :
				return incomings != null && !incomings.isEmpty();
			case UMLPackage.JOIN_NODE__OUTGOING :
				return outgoings != null && !outgoings.isEmpty();
			case UMLPackage.JOIN_NODE__REDEFINED_NODE :
				return redefinedNodes != null && !redefinedNodes.isEmpty();
			case UMLPackage.JOIN_NODE__IN_PARTITION :
				return inPartitions != null && !inPartitions.isEmpty();
			case UMLPackage.JOIN_NODE__IS_COMBINE_DUPLICATE :
				return ((eFlags
					& IS_COMBINE_DUPLICATE_EFLAG) != 0) != IS_COMBINE_DUPLICATE_EDEFAULT;
			case UMLPackage.JOIN_NODE__JOIN_SPEC :
				return joinSpec != null;
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
			case UMLPackage.JOIN_NODE___GET_EANNOTATION__STRING :
				return getEAnnotation((String) arguments.get(0));
			case UMLPackage.JOIN_NODE___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP :
				return validateHasOwner((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.JOIN_NODE___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP :
				return validateNotOwnSelf((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.JOIN_NODE___ADD_KEYWORD__STRING :
				return addKeyword((String) arguments.get(0));
			case UMLPackage.JOIN_NODE___APPLY_STEREOTYPE__STEREOTYPE :
				return applyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.JOIN_NODE___CREATE_EANNOTATION__STRING :
				return createEAnnotation((String) arguments.get(0));
			case UMLPackage.JOIN_NODE___DESTROY :
				destroy();
				return null;
			case UMLPackage.JOIN_NODE___GET_KEYWORDS :
				return getKeywords();
			case UMLPackage.JOIN_NODE___GET_APPLICABLE_STEREOTYPE__STRING :
				return getApplicableStereotype((String) arguments.get(0));
			case UMLPackage.JOIN_NODE___GET_APPLICABLE_STEREOTYPES :
				return getApplicableStereotypes();
			case UMLPackage.JOIN_NODE___GET_APPLIED_STEREOTYPE__STRING :
				return getAppliedStereotype((String) arguments.get(0));
			case UMLPackage.JOIN_NODE___GET_APPLIED_STEREOTYPES :
				return getAppliedStereotypes();
			case UMLPackage.JOIN_NODE___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING :
				return getAppliedSubstereotype((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.JOIN_NODE___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE :
				return getAppliedSubstereotypes((Stereotype) arguments.get(0));
			case UMLPackage.JOIN_NODE___GET_MODEL :
				return getModel();
			case UMLPackage.JOIN_NODE___GET_NEAREST_PACKAGE :
				return getNearestPackage();
			case UMLPackage.JOIN_NODE___GET_RELATIONSHIPS :
				return getRelationships();
			case UMLPackage.JOIN_NODE___GET_RELATIONSHIPS__ECLASS :
				return getRelationships((EClass) arguments.get(0));
			case UMLPackage.JOIN_NODE___GET_REQUIRED_STEREOTYPE__STRING :
				return getRequiredStereotype((String) arguments.get(0));
			case UMLPackage.JOIN_NODE___GET_REQUIRED_STEREOTYPES :
				return getRequiredStereotypes();
			case UMLPackage.JOIN_NODE___GET_SOURCE_DIRECTED_RELATIONSHIPS :
				return getSourceDirectedRelationships();
			case UMLPackage.JOIN_NODE___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS :
				return getSourceDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.JOIN_NODE___GET_STEREOTYPE_APPLICATION__STEREOTYPE :
				return getStereotypeApplication((Stereotype) arguments.get(0));
			case UMLPackage.JOIN_NODE___GET_STEREOTYPE_APPLICATIONS :
				return getStereotypeApplications();
			case UMLPackage.JOIN_NODE___GET_TARGET_DIRECTED_RELATIONSHIPS :
				return getTargetDirectedRelationships();
			case UMLPackage.JOIN_NODE___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS :
				return getTargetDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.JOIN_NODE___GET_VALUE__STEREOTYPE_STRING :
				return getValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.JOIN_NODE___HAS_KEYWORD__STRING :
				return hasKeyword((String) arguments.get(0));
			case UMLPackage.JOIN_NODE___HAS_VALUE__STEREOTYPE_STRING :
				return hasValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.JOIN_NODE___IS_STEREOTYPE_APPLICABLE__STEREOTYPE :
				return isStereotypeApplicable((Stereotype) arguments.get(0));
			case UMLPackage.JOIN_NODE___IS_STEREOTYPE_APPLIED__STEREOTYPE :
				return isStereotypeApplied((Stereotype) arguments.get(0));
			case UMLPackage.JOIN_NODE___IS_STEREOTYPE_REQUIRED__STEREOTYPE :
				return isStereotypeRequired((Stereotype) arguments.get(0));
			case UMLPackage.JOIN_NODE___REMOVE_KEYWORD__STRING :
				return removeKeyword((String) arguments.get(0));
			case UMLPackage.JOIN_NODE___SET_VALUE__STEREOTYPE_STRING_OBJECT :
				setValue((Stereotype) arguments.get(0),
					(String) arguments.get(1), arguments.get(2));
				return null;
			case UMLPackage.JOIN_NODE___UNAPPLY_STEREOTYPE__STEREOTYPE :
				return unapplyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.JOIN_NODE___ALL_OWNED_ELEMENTS :
				return allOwnedElements();
			case UMLPackage.JOIN_NODE___MUST_BE_OWNED :
				return mustBeOwned();
			case UMLPackage.JOIN_NODE___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP :
				return validateVisibilityNeedsOwnership(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.JOIN_NODE___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.JOIN_NODE___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasNoQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.JOIN_NODE___CREATE_DEPENDENCY__NAMEDELEMENT :
				return createDependency((NamedElement) arguments.get(0));
			case UMLPackage.JOIN_NODE___CREATE_USAGE__NAMEDELEMENT :
				return createUsage((NamedElement) arguments.get(0));
			case UMLPackage.JOIN_NODE___GET_LABEL :
				return getLabel();
			case UMLPackage.JOIN_NODE___GET_LABEL__BOOLEAN :
				return getLabel((Boolean) arguments.get(0));
			case UMLPackage.JOIN_NODE___GET_NAMESPACE :
				return getNamespace();
			case UMLPackage.JOIN_NODE___ALL_NAMESPACES :
				return allNamespaces();
			case UMLPackage.JOIN_NODE___ALL_OWNING_PACKAGES :
				return allOwningPackages();
			case UMLPackage.JOIN_NODE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE :
				return isDistinguishableFrom((NamedElement) arguments.get(0),
					(Namespace) arguments.get(1));
			case UMLPackage.JOIN_NODE___GET_QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.JOIN_NODE___SEPARATOR :
				return separator();
			case UMLPackage.JOIN_NODE___GET_CLIENT_DEPENDENCIES :
				return getClientDependencies();
			case UMLPackage.JOIN_NODE___VALIDATE_REDEFINITION_CONSISTENT__DIAGNOSTICCHAIN_MAP :
				return validateRedefinitionConsistent(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.JOIN_NODE___VALIDATE_NON_LEAF_REDEFINITION__DIAGNOSTICCHAIN_MAP :
				return validateNonLeafRedefinition(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.JOIN_NODE___VALIDATE_REDEFINITION_CONTEXT_VALID__DIAGNOSTICCHAIN_MAP :
				return validateRedefinitionContextValid(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.JOIN_NODE___IS_CONSISTENT_WITH__REDEFINABLEELEMENT :
				return isConsistentWith((RedefinableElement) arguments.get(0));
			case UMLPackage.JOIN_NODE___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT :
				return isRedefinitionContextValid(
					(RedefinableElement) arguments.get(0));
			case UMLPackage.JOIN_NODE___CONTAINING_ACTIVITY :
				return containingActivity();
			case UMLPackage.JOIN_NODE___VALIDATE_ONE_OUTGOING_EDGE__DIAGNOSTICCHAIN_MAP :
				return validateOneOutgoingEdge(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.JOIN_NODE___VALIDATE_INCOMING_OBJECT_FLOW__DIAGNOSTICCHAIN_MAP :
				return validateIncomingObjectFlow(
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
		result.append(" (isCombineDuplicate: "); //$NON-NLS-1$
		result.append((eFlags & IS_COMBINE_DUPLICATE_EFLAG) != 0);
		result.append(')');
		return result.toString();
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
		UMLPackage.JOIN_NODE__OWNED_COMMENT,
		UMLPackage.JOIN_NODE__NAME_EXPRESSION, UMLPackage.JOIN_NODE__JOIN_SPEC};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| eIsSet(UMLPackage.JOIN_NODE__JOIN_SPEC);
	}

} //JoinNodeImpl
