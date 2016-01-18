/*
 * Copyright (c) 2005, 2016 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 327039, 351774, 212765, 418466, 451350, 485756
 *
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.ActivityEdge;
import org.eclipse.uml2.uml.ActivityNode;
import org.eclipse.uml2.uml.ActivityPartition;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.ElementImport;
import org.eclipse.uml2.uml.ExceptionHandler;
import org.eclipse.uml2.uml.ExecutableNode;
import org.eclipse.uml2.uml.InputPin;
import org.eclipse.uml2.uml.InterruptibleActivityRegion;
import org.eclipse.uml2.uml.OutputPin;
import org.eclipse.uml2.uml.PackageImport;
import org.eclipse.uml2.uml.SequenceNode;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.StructuredActivityNode;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.Variable;
import org.eclipse.uml2.uml.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sequence Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.SequenceNodeImpl#getExecutableNodes <em>Executable Node</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SequenceNodeImpl
		extends StructuredActivityNodeImpl
		implements SequenceNode {

	/**
	 * The cached value of the '{@link #getExecutableNodes() <em>Executable Node</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutableNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<ExecutableNode> executableNodes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SequenceNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.SEQUENCE_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExecutableNode> getExecutableNodes() {
		if (executableNodes == null) {
			executableNodes = new EObjectContainmentEList.Resolving<ExecutableNode>(
				ExecutableNode.class, this,
				UMLPackage.SEQUENCE_NODE__EXECUTABLE_NODE);
		}
		return executableNodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutableNode createExecutableNode(String name, EClass eClass) {
		ExecutableNode newExecutableNode = (ExecutableNode) create(eClass);
		getExecutableNodes().add(newExecutableNode);
		if (name != null)
			newExecutableNode.setName(name);
		return newExecutableNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutableNode getExecutableNode(String name) {
		return getExecutableNode(name, false, null, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutableNode getExecutableNode(String name, boolean ignoreCase,
			EClass eClass, boolean createOnDemand) {
		executableNodeLoop : for (ExecutableNode executableNode : getExecutableNodes()) {
			if (eClass != null && !eClass.isInstance(executableNode))
				continue executableNodeLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(executableNode.getName())
				: name.equals(executableNode.getName())))
				continue executableNodeLoop;
			return executableNode;
		}
		return createOnDemand && eClass != null
			? createExecutableNode(name, eClass)
			: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetExecutableNodes() {
		return executableNodes != null && !executableNodes.isEmpty();
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
			case UMLPackage.SEQUENCE_NODE__EANNOTATIONS :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getEAnnotations())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.SEQUENCE_NODE__IN_INTERRUPTIBLE_REGION :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getInInterruptibleRegions())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.SEQUENCE_NODE__IN_STRUCTURED_NODE :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetInStructuredNode(
					(StructuredActivityNode) otherEnd, msgs);
			case UMLPackage.SEQUENCE_NODE__INCOMING :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getIncomings())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.SEQUENCE_NODE__OUTGOING :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getOutgoings())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.SEQUENCE_NODE__IN_PARTITION :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getInPartitions())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.SEQUENCE_NODE__HANDLER :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getHandlers())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.SEQUENCE_NODE__OWNED_RULE :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getOwnedRules())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.SEQUENCE_NODE__ELEMENT_IMPORT :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getElementImports())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.SEQUENCE_NODE__PACKAGE_IMPORT :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getPackageImports())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.SEQUENCE_NODE__EDGE :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getEdges())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.SEQUENCE_NODE__VARIABLE :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getVariables())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.SEQUENCE_NODE__NODE :
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
			case UMLPackage.SEQUENCE_NODE__EANNOTATIONS :
				return ((InternalEList<?>) getEAnnotations())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.SEQUENCE_NODE__OWNED_COMMENT :
				return ((InternalEList<?>) getOwnedComments())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.SEQUENCE_NODE__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.SEQUENCE_NODE__IN_INTERRUPTIBLE_REGION :
				return ((InternalEList<?>) getInInterruptibleRegions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.SEQUENCE_NODE__IN_STRUCTURED_NODE :
				return basicSetInStructuredNode(null, msgs);
			case UMLPackage.SEQUENCE_NODE__INCOMING :
				return ((InternalEList<?>) getIncomings()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.SEQUENCE_NODE__OUTGOING :
				return ((InternalEList<?>) getOutgoings()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.SEQUENCE_NODE__IN_PARTITION :
				return ((InternalEList<?>) getInPartitions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.SEQUENCE_NODE__HANDLER :
				return ((InternalEList<?>) getHandlers()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.SEQUENCE_NODE__LOCAL_POSTCONDITION :
				return ((InternalEList<?>) getLocalPostconditions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.SEQUENCE_NODE__LOCAL_PRECONDITION :
				return ((InternalEList<?>) getLocalPreconditions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.SEQUENCE_NODE__OWNED_RULE :
				return ((InternalEList<?>) getOwnedRules())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.SEQUENCE_NODE__ELEMENT_IMPORT :
				return ((InternalEList<?>) getElementImports())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.SEQUENCE_NODE__PACKAGE_IMPORT :
				return ((InternalEList<?>) getPackageImports())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.SEQUENCE_NODE__EDGE :
				return ((InternalEList<?>) getEdges()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.SEQUENCE_NODE__STRUCTURED_NODE_INPUT :
				return ((InternalEList<?>) getStructuredNodeInputs())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.SEQUENCE_NODE__STRUCTURED_NODE_OUTPUT :
				return ((InternalEList<?>) getStructuredNodeOutputs())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.SEQUENCE_NODE__VARIABLE :
				return ((InternalEList<?>) getVariables()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.SEQUENCE_NODE__NODE :
				return ((InternalEList<?>) getNodes()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.SEQUENCE_NODE__EXECUTABLE_NODE :
				return ((InternalEList<?>) getExecutableNodes())
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
			case UMLPackage.SEQUENCE_NODE__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.SEQUENCE_NODE__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.SEQUENCE_NODE__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.SEQUENCE_NODE__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.SEQUENCE_NODE__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.SEQUENCE_NODE__NAME :
				return getName();
			case UMLPackage.SEQUENCE_NODE__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.SEQUENCE_NODE__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.SEQUENCE_NODE__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.SEQUENCE_NODE__VISIBILITY :
				return getVisibility();
			case UMLPackage.SEQUENCE_NODE__IS_LEAF :
				return isLeaf();
			case UMLPackage.SEQUENCE_NODE__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.SEQUENCE_NODE__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.SEQUENCE_NODE__ACTIVITY :
				if (resolve)
					return getActivity();
				return basicGetActivity();
			case UMLPackage.SEQUENCE_NODE__IN_GROUP :
				return getInGroups();
			case UMLPackage.SEQUENCE_NODE__IN_INTERRUPTIBLE_REGION :
				return getInInterruptibleRegions();
			case UMLPackage.SEQUENCE_NODE__IN_STRUCTURED_NODE :
				if (resolve)
					return getInStructuredNode();
				return basicGetInStructuredNode();
			case UMLPackage.SEQUENCE_NODE__INCOMING :
				return getIncomings();
			case UMLPackage.SEQUENCE_NODE__OUTGOING :
				return getOutgoings();
			case UMLPackage.SEQUENCE_NODE__REDEFINED_NODE :
				return getRedefinedNodes();
			case UMLPackage.SEQUENCE_NODE__IN_PARTITION :
				return getInPartitions();
			case UMLPackage.SEQUENCE_NODE__HANDLER :
				return getHandlers();
			case UMLPackage.SEQUENCE_NODE__CONTEXT :
				if (resolve)
					return getContext();
				return basicGetContext();
			case UMLPackage.SEQUENCE_NODE__INPUT :
				return getInputs();
			case UMLPackage.SEQUENCE_NODE__IS_LOCALLY_REENTRANT :
				return isLocallyReentrant();
			case UMLPackage.SEQUENCE_NODE__LOCAL_POSTCONDITION :
				return getLocalPostconditions();
			case UMLPackage.SEQUENCE_NODE__LOCAL_PRECONDITION :
				return getLocalPreconditions();
			case UMLPackage.SEQUENCE_NODE__OUTPUT :
				return getOutputs();
			case UMLPackage.SEQUENCE_NODE__OWNED_RULE :
				return getOwnedRules();
			case UMLPackage.SEQUENCE_NODE__ELEMENT_IMPORT :
				return getElementImports();
			case UMLPackage.SEQUENCE_NODE__PACKAGE_IMPORT :
				return getPackageImports();
			case UMLPackage.SEQUENCE_NODE__OWNED_MEMBER :
				return getOwnedMembers();
			case UMLPackage.SEQUENCE_NODE__IMPORTED_MEMBER :
				return getImportedMembers();
			case UMLPackage.SEQUENCE_NODE__MEMBER :
				return getMembers();
			case UMLPackage.SEQUENCE_NODE__CONTAINED_EDGE :
				return getContainedEdges();
			case UMLPackage.SEQUENCE_NODE__CONTAINED_NODE :
				return getContainedNodes();
			case UMLPackage.SEQUENCE_NODE__IN_ACTIVITY :
				if (resolve)
					return getInActivity();
				return basicGetInActivity();
			case UMLPackage.SEQUENCE_NODE__SUBGROUP :
				return getSubgroups();
			case UMLPackage.SEQUENCE_NODE__SUPER_GROUP :
				if (resolve)
					return getSuperGroup();
				return basicGetSuperGroup();
			case UMLPackage.SEQUENCE_NODE__EDGE :
				return getEdges();
			case UMLPackage.SEQUENCE_NODE__MUST_ISOLATE :
				return isMustIsolate();
			case UMLPackage.SEQUENCE_NODE__STRUCTURED_NODE_INPUT :
				return getStructuredNodeInputs();
			case UMLPackage.SEQUENCE_NODE__STRUCTURED_NODE_OUTPUT :
				return getStructuredNodeOutputs();
			case UMLPackage.SEQUENCE_NODE__VARIABLE :
				return getVariables();
			case UMLPackage.SEQUENCE_NODE__NODE :
				return getNodes();
			case UMLPackage.SEQUENCE_NODE__EXECUTABLE_NODE :
				return getExecutableNodes();
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
			case UMLPackage.SEQUENCE_NODE__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations()
					.addAll((Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.SEQUENCE_NODE__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments()
					.addAll((Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.SEQUENCE_NODE__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.SEQUENCE_NODE__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.SEQUENCE_NODE__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.SEQUENCE_NODE__IS_LEAF :
				setIsLeaf((Boolean) newValue);
				return;
			case UMLPackage.SEQUENCE_NODE__ACTIVITY :
				setActivity((Activity) newValue);
				return;
			case UMLPackage.SEQUENCE_NODE__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				getInInterruptibleRegions().addAll(
					(Collection<? extends InterruptibleActivityRegion>) newValue);
				return;
			case UMLPackage.SEQUENCE_NODE__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) newValue);
				return;
			case UMLPackage.SEQUENCE_NODE__INCOMING :
				getIncomings().clear();
				getIncomings()
					.addAll((Collection<? extends ActivityEdge>) newValue);
				return;
			case UMLPackage.SEQUENCE_NODE__OUTGOING :
				getOutgoings().clear();
				getOutgoings()
					.addAll((Collection<? extends ActivityEdge>) newValue);
				return;
			case UMLPackage.SEQUENCE_NODE__REDEFINED_NODE :
				getRedefinedNodes().clear();
				getRedefinedNodes()
					.addAll((Collection<? extends ActivityNode>) newValue);
				return;
			case UMLPackage.SEQUENCE_NODE__IN_PARTITION :
				getInPartitions().clear();
				getInPartitions()
					.addAll((Collection<? extends ActivityPartition>) newValue);
				return;
			case UMLPackage.SEQUENCE_NODE__HANDLER :
				getHandlers().clear();
				getHandlers()
					.addAll((Collection<? extends ExceptionHandler>) newValue);
				return;
			case UMLPackage.SEQUENCE_NODE__IS_LOCALLY_REENTRANT :
				setIsLocallyReentrant((Boolean) newValue);
				return;
			case UMLPackage.SEQUENCE_NODE__LOCAL_POSTCONDITION :
				getLocalPostconditions().clear();
				getLocalPostconditions()
					.addAll((Collection<? extends Constraint>) newValue);
				return;
			case UMLPackage.SEQUENCE_NODE__LOCAL_PRECONDITION :
				getLocalPreconditions().clear();
				getLocalPreconditions()
					.addAll((Collection<? extends Constraint>) newValue);
				return;
			case UMLPackage.SEQUENCE_NODE__OWNED_RULE :
				getOwnedRules().clear();
				getOwnedRules()
					.addAll((Collection<? extends Constraint>) newValue);
				return;
			case UMLPackage.SEQUENCE_NODE__ELEMENT_IMPORT :
				getElementImports().clear();
				getElementImports()
					.addAll((Collection<? extends ElementImport>) newValue);
				return;
			case UMLPackage.SEQUENCE_NODE__PACKAGE_IMPORT :
				getPackageImports().clear();
				getPackageImports()
					.addAll((Collection<? extends PackageImport>) newValue);
				return;
			case UMLPackage.SEQUENCE_NODE__IN_ACTIVITY :
				setInActivity((Activity) newValue);
				return;
			case UMLPackage.SEQUENCE_NODE__EDGE :
				getEdges().clear();
				getEdges()
					.addAll((Collection<? extends ActivityEdge>) newValue);
				return;
			case UMLPackage.SEQUENCE_NODE__MUST_ISOLATE :
				setMustIsolate((Boolean) newValue);
				return;
			case UMLPackage.SEQUENCE_NODE__STRUCTURED_NODE_INPUT :
				getStructuredNodeInputs().clear();
				getStructuredNodeInputs()
					.addAll((Collection<? extends InputPin>) newValue);
				return;
			case UMLPackage.SEQUENCE_NODE__STRUCTURED_NODE_OUTPUT :
				getStructuredNodeOutputs().clear();
				getStructuredNodeOutputs()
					.addAll((Collection<? extends OutputPin>) newValue);
				return;
			case UMLPackage.SEQUENCE_NODE__VARIABLE :
				getVariables().clear();
				getVariables()
					.addAll((Collection<? extends Variable>) newValue);
				return;
			case UMLPackage.SEQUENCE_NODE__NODE :
				getNodes().clear();
				getNodes()
					.addAll((Collection<? extends ActivityNode>) newValue);
				return;
			case UMLPackage.SEQUENCE_NODE__EXECUTABLE_NODE :
				getExecutableNodes().clear();
				getExecutableNodes()
					.addAll((Collection<? extends ExecutableNode>) newValue);
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
			case UMLPackage.SEQUENCE_NODE__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.SEQUENCE_NODE__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.SEQUENCE_NODE__NAME :
				unsetName();
				return;
			case UMLPackage.SEQUENCE_NODE__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.SEQUENCE_NODE__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.SEQUENCE_NODE__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.SEQUENCE_NODE__ACTIVITY :
				setActivity((Activity) null);
				return;
			case UMLPackage.SEQUENCE_NODE__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				return;
			case UMLPackage.SEQUENCE_NODE__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) null);
				return;
			case UMLPackage.SEQUENCE_NODE__INCOMING :
				getIncomings().clear();
				return;
			case UMLPackage.SEQUENCE_NODE__OUTGOING :
				getOutgoings().clear();
				return;
			case UMLPackage.SEQUENCE_NODE__REDEFINED_NODE :
				getRedefinedNodes().clear();
				return;
			case UMLPackage.SEQUENCE_NODE__IN_PARTITION :
				getInPartitions().clear();
				return;
			case UMLPackage.SEQUENCE_NODE__HANDLER :
				getHandlers().clear();
				return;
			case UMLPackage.SEQUENCE_NODE__IS_LOCALLY_REENTRANT :
				setIsLocallyReentrant(IS_LOCALLY_REENTRANT_EDEFAULT);
				return;
			case UMLPackage.SEQUENCE_NODE__LOCAL_POSTCONDITION :
				getLocalPostconditions().clear();
				return;
			case UMLPackage.SEQUENCE_NODE__LOCAL_PRECONDITION :
				getLocalPreconditions().clear();
				return;
			case UMLPackage.SEQUENCE_NODE__OWNED_RULE :
				getOwnedRules().clear();
				return;
			case UMLPackage.SEQUENCE_NODE__ELEMENT_IMPORT :
				getElementImports().clear();
				return;
			case UMLPackage.SEQUENCE_NODE__PACKAGE_IMPORT :
				getPackageImports().clear();
				return;
			case UMLPackage.SEQUENCE_NODE__IN_ACTIVITY :
				setInActivity((Activity) null);
				return;
			case UMLPackage.SEQUENCE_NODE__EDGE :
				getEdges().clear();
				return;
			case UMLPackage.SEQUENCE_NODE__MUST_ISOLATE :
				setMustIsolate(MUST_ISOLATE_EDEFAULT);
				return;
			case UMLPackage.SEQUENCE_NODE__STRUCTURED_NODE_INPUT :
				getStructuredNodeInputs().clear();
				return;
			case UMLPackage.SEQUENCE_NODE__STRUCTURED_NODE_OUTPUT :
				getStructuredNodeOutputs().clear();
				return;
			case UMLPackage.SEQUENCE_NODE__VARIABLE :
				getVariables().clear();
				return;
			case UMLPackage.SEQUENCE_NODE__NODE :
				getNodes().clear();
				return;
			case UMLPackage.SEQUENCE_NODE__EXECUTABLE_NODE :
				getExecutableNodes().clear();
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
			case UMLPackage.SEQUENCE_NODE__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.SEQUENCE_NODE__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.SEQUENCE_NODE__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.SEQUENCE_NODE__OWNER :
				return isSetOwner();
			case UMLPackage.SEQUENCE_NODE__CLIENT_DEPENDENCY :
				return !getClientDependencies().isEmpty();
			case UMLPackage.SEQUENCE_NODE__NAME :
				return isSetName();
			case UMLPackage.SEQUENCE_NODE__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.SEQUENCE_NODE__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.SEQUENCE_NODE__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.SEQUENCE_NODE__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.SEQUENCE_NODE__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.SEQUENCE_NODE__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.SEQUENCE_NODE__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.SEQUENCE_NODE__ACTIVITY :
				return isSetActivity();
			case UMLPackage.SEQUENCE_NODE__IN_GROUP :
				return isSetInGroups();
			case UMLPackage.SEQUENCE_NODE__IN_INTERRUPTIBLE_REGION :
				return inInterruptibleRegions != null
					&& !inInterruptibleRegions.isEmpty();
			case UMLPackage.SEQUENCE_NODE__IN_STRUCTURED_NODE :
				return basicGetInStructuredNode() != null;
			case UMLPackage.SEQUENCE_NODE__INCOMING :
				return incomings != null && !incomings.isEmpty();
			case UMLPackage.SEQUENCE_NODE__OUTGOING :
				return outgoings != null && !outgoings.isEmpty();
			case UMLPackage.SEQUENCE_NODE__REDEFINED_NODE :
				return redefinedNodes != null && !redefinedNodes.isEmpty();
			case UMLPackage.SEQUENCE_NODE__IN_PARTITION :
				return inPartitions != null && !inPartitions.isEmpty();
			case UMLPackage.SEQUENCE_NODE__HANDLER :
				return handlers != null && !handlers.isEmpty();
			case UMLPackage.SEQUENCE_NODE__CONTEXT :
				return basicGetContext() != null;
			case UMLPackage.SEQUENCE_NODE__INPUT :
				return isSetInputs();
			case UMLPackage.SEQUENCE_NODE__IS_LOCALLY_REENTRANT :
				return ((eFlags
					& IS_LOCALLY_REENTRANT_EFLAG) != 0) != IS_LOCALLY_REENTRANT_EDEFAULT;
			case UMLPackage.SEQUENCE_NODE__LOCAL_POSTCONDITION :
				return localPostconditions != null
					&& !localPostconditions.isEmpty();
			case UMLPackage.SEQUENCE_NODE__LOCAL_PRECONDITION :
				return localPreconditions != null
					&& !localPreconditions.isEmpty();
			case UMLPackage.SEQUENCE_NODE__OUTPUT :
				return isSetOutputs();
			case UMLPackage.SEQUENCE_NODE__OWNED_RULE :
				return ownedRules != null && !ownedRules.isEmpty();
			case UMLPackage.SEQUENCE_NODE__ELEMENT_IMPORT :
				return elementImports != null && !elementImports.isEmpty();
			case UMLPackage.SEQUENCE_NODE__PACKAGE_IMPORT :
				return packageImports != null && !packageImports.isEmpty();
			case UMLPackage.SEQUENCE_NODE__OWNED_MEMBER :
				return isSetOwnedMembers();
			case UMLPackage.SEQUENCE_NODE__IMPORTED_MEMBER :
				return !getImportedMembers().isEmpty();
			case UMLPackage.SEQUENCE_NODE__MEMBER :
				return isSetMembers();
			case UMLPackage.SEQUENCE_NODE__CONTAINED_EDGE :
				return isSetContainedEdges();
			case UMLPackage.SEQUENCE_NODE__CONTAINED_NODE :
				return isSetContainedNodes();
			case UMLPackage.SEQUENCE_NODE__IN_ACTIVITY :
				return isSetInActivity();
			case UMLPackage.SEQUENCE_NODE__SUBGROUP :
				return isSetSubgroups();
			case UMLPackage.SEQUENCE_NODE__SUPER_GROUP :
				return isSetSuperGroup();
			case UMLPackage.SEQUENCE_NODE__EDGE :
				return edges != null && !edges.isEmpty();
			case UMLPackage.SEQUENCE_NODE__MUST_ISOLATE :
				return ((eFlags
					& MUST_ISOLATE_EFLAG) != 0) != MUST_ISOLATE_EDEFAULT;
			case UMLPackage.SEQUENCE_NODE__STRUCTURED_NODE_INPUT :
				return structuredNodeInputs != null
					&& !structuredNodeInputs.isEmpty();
			case UMLPackage.SEQUENCE_NODE__STRUCTURED_NODE_OUTPUT :
				return structuredNodeOutputs != null
					&& !structuredNodeOutputs.isEmpty();
			case UMLPackage.SEQUENCE_NODE__VARIABLE :
				return variables != null && !variables.isEmpty();
			case UMLPackage.SEQUENCE_NODE__NODE :
				return isSetNodes();
			case UMLPackage.SEQUENCE_NODE__EXECUTABLE_NODE :
				return isSetExecutableNodes();
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ActivityNode> getNodes() {
		@SuppressWarnings("unchecked")
		EList<ActivityNode> executableNode = (EList<ActivityNode>) ((EList<?>) getExecutableNodes());
		return executableNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNodes() {
		return false;
	}

} //SequenceNodeImpl
