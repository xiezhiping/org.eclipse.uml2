/*
 * Copyright (c) 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: SequenceNodeImpl.java,v 1.5 2005/11/28 20:26:02 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.ExecutableNode;
import org.eclipse.uml2.uml.SequenceNode;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.StructuredActivityNode;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sequence Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.SequenceNodeImpl#getExecutableNodes <em>Executable Node</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SequenceNodeImpl
		extends StructuredActivityNodeImpl
		implements SequenceNode {

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
	protected EClass eStaticClass() {
		return UMLPackage.Literals.SEQUENCE_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getExecutableNodes() {
		List executableNode = (List) eVirtualGet(UMLPackage.SEQUENCE_NODE__EXECUTABLE_NODE);
		if (executableNode == null) {
			eVirtualSet(UMLPackage.SEQUENCE_NODE__EXECUTABLE_NODE,
				executableNode = new EObjectContainmentEList(
					ExecutableNode.class, this,
					UMLPackage.SEQUENCE_NODE__EXECUTABLE_NODE));
		}
		return executableNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutableNode createExecutableNode(EClass eClass) {
		ExecutableNode newExecutableNode = (ExecutableNode) eClass
			.getEPackage().getEFactoryInstance().create(eClass);
		getExecutableNodes().add(newExecutableNode);
		return newExecutableNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutableNode getExecutableNode(String name) {
		for (Iterator i = getExecutableNodes().iterator(); i.hasNext();) {
			ExecutableNode executableNode = (ExecutableNode) i.next();
			if (name.equals(executableNode.getName())) {
				return executableNode;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetExecutableNodes() {
		List executableNode = (List) eVirtualGet(UMLPackage.SEQUENCE_NODE__EXECUTABLE_NODE);
		return executableNode != null && !executableNode.isEmpty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.SEQUENCE_NODE__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.SEQUENCE_NODE__OWNED_COMMENT :
				return ((InternalEList) getOwnedComments()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.SEQUENCE_NODE__CLIENT_DEPENDENCY :
				return ((InternalEList) getClientDependencies()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.SEQUENCE_NODE__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.SEQUENCE_NODE__OUTGOING :
				return ((InternalEList) getOutgoings()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.SEQUENCE_NODE__IN_PARTITION :
				return ((InternalEList) getInPartitions()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.SEQUENCE_NODE__IN_STRUCTURED_NODE :
				return eBasicSetContainer(null,
					UMLPackage.SEQUENCE_NODE__IN_STRUCTURED_NODE, msgs);
			case UMLPackage.SEQUENCE_NODE__ACTIVITY :
				return eBasicSetContainer(null,
					UMLPackage.SEQUENCE_NODE__ACTIVITY, msgs);
			case UMLPackage.SEQUENCE_NODE__INCOMING :
				return ((InternalEList) getIncomings()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.SEQUENCE_NODE__IN_INTERRUPTIBLE_REGION :
				return ((InternalEList) getInInterruptibleRegions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.SEQUENCE_NODE__HANDLER :
				return ((InternalEList) getHandlers()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.SEQUENCE_NODE__LOCAL_PRECONDITION :
				return ((InternalEList) getLocalPreconditions()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.SEQUENCE_NODE__LOCAL_POSTCONDITION :
				return ((InternalEList) getLocalPostconditions()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.SEQUENCE_NODE__ELEMENT_IMPORT :
				return ((InternalEList) getElementImports()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.SEQUENCE_NODE__PACKAGE_IMPORT :
				return ((InternalEList) getPackageImports()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.SEQUENCE_NODE__OWNED_RULE :
				return ((InternalEList) getOwnedRules()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.SEQUENCE_NODE__IN_ACTIVITY :
				return eBasicSetContainer(null,
					UMLPackage.SEQUENCE_NODE__IN_ACTIVITY, msgs);
			case UMLPackage.SEQUENCE_NODE__VARIABLE :
				return ((InternalEList) getVariables()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.SEQUENCE_NODE__NODE :
				return ((InternalEList) getNodes()).basicRemove(otherEnd, msgs);
			case UMLPackage.SEQUENCE_NODE__EDGE :
				return ((InternalEList) getEdges()).basicRemove(otherEnd, msgs);
			case UMLPackage.SEQUENCE_NODE__EXECUTABLE_NODE :
				return ((InternalEList) getExecutableNodes()).basicRemove(
					otherEnd, msgs);
		}
		return eDynamicInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.SEQUENCE_NODE__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.SEQUENCE_NODE__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.SEQUENCE_NODE__OWNER :
				return getOwner();
			case UMLPackage.SEQUENCE_NODE__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.SEQUENCE_NODE__NAME :
				return getName();
			case UMLPackage.SEQUENCE_NODE__VISIBILITY :
				return getVisibility();
			case UMLPackage.SEQUENCE_NODE__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.SEQUENCE_NODE__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.SEQUENCE_NODE__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.SEQUENCE_NODE__NAME_EXPRESSION :
				return getNameExpression();
			case UMLPackage.SEQUENCE_NODE__IS_LEAF :
				return isLeaf()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.SEQUENCE_NODE__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.SEQUENCE_NODE__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.SEQUENCE_NODE__OUTGOING :
				return getOutgoings();
			case UMLPackage.SEQUENCE_NODE__IN_GROUP :
				return getInGroups();
			case UMLPackage.SEQUENCE_NODE__IN_PARTITION :
				return getInPartitions();
			case UMLPackage.SEQUENCE_NODE__IN_STRUCTURED_NODE :
				return getInStructuredNode();
			case UMLPackage.SEQUENCE_NODE__ACTIVITY :
				return getActivity();
			case UMLPackage.SEQUENCE_NODE__INCOMING :
				return getIncomings();
			case UMLPackage.SEQUENCE_NODE__IN_INTERRUPTIBLE_REGION :
				return getInInterruptibleRegions();
			case UMLPackage.SEQUENCE_NODE__REDEFINED_NODE :
				return getRedefinedNodes();
			case UMLPackage.SEQUENCE_NODE__HANDLER :
				return getHandlers();
			case UMLPackage.SEQUENCE_NODE__OUTPUT :
				return getOutputs();
			case UMLPackage.SEQUENCE_NODE__INPUT :
				return getInputs();
			case UMLPackage.SEQUENCE_NODE__CONTEXT :
				return getContext();
			case UMLPackage.SEQUENCE_NODE__LOCAL_PRECONDITION :
				return getLocalPreconditions();
			case UMLPackage.SEQUENCE_NODE__LOCAL_POSTCONDITION :
				return getLocalPostconditions();
			case UMLPackage.SEQUENCE_NODE__ELEMENT_IMPORT :
				return getElementImports();
			case UMLPackage.SEQUENCE_NODE__PACKAGE_IMPORT :
				return getPackageImports();
			case UMLPackage.SEQUENCE_NODE__OWNED_RULE :
				return getOwnedRules();
			case UMLPackage.SEQUENCE_NODE__MEMBER :
				return getMembers();
			case UMLPackage.SEQUENCE_NODE__IMPORTED_MEMBER :
				return getImportedMembers();
			case UMLPackage.SEQUENCE_NODE__OWNED_MEMBER :
				return getOwnedMembers();
			case UMLPackage.SEQUENCE_NODE__SUBGROUP :
				return getSubgroups();
			case UMLPackage.SEQUENCE_NODE__SUPER_GROUP :
				return getSuperGroup();
			case UMLPackage.SEQUENCE_NODE__CONTAINED_NODE :
				return getContainedNodes();
			case UMLPackage.SEQUENCE_NODE__IN_ACTIVITY :
				return getInActivity();
			case UMLPackage.SEQUENCE_NODE__CONTAINED_EDGE :
				return getContainedEdges();
			case UMLPackage.SEQUENCE_NODE__VARIABLE :
				return getVariables();
			case UMLPackage.SEQUENCE_NODE__NODE :
				return getNodes();
			case UMLPackage.SEQUENCE_NODE__MUST_ISOLATE :
				return isMustIsolate()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.SEQUENCE_NODE__EDGE :
				return getEdges();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UMLPackage.SEQUENCE_NODE__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.SEQUENCE_NODE__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.SEQUENCE_NODE__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.SEQUENCE_NODE__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.SEQUENCE_NODE__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.SEQUENCE_NODE__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.SEQUENCE_NODE__IS_LEAF :
				setIsLeaf(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.SEQUENCE_NODE__OUTGOING :
				getOutgoings().clear();
				getOutgoings().addAll((Collection) newValue);
				return;
			case UMLPackage.SEQUENCE_NODE__IN_PARTITION :
				getInPartitions().clear();
				getInPartitions().addAll((Collection) newValue);
				return;
			case UMLPackage.SEQUENCE_NODE__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) newValue);
				return;
			case UMLPackage.SEQUENCE_NODE__ACTIVITY :
				setActivity((Activity) newValue);
				return;
			case UMLPackage.SEQUENCE_NODE__INCOMING :
				getIncomings().clear();
				getIncomings().addAll((Collection) newValue);
				return;
			case UMLPackage.SEQUENCE_NODE__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				getInInterruptibleRegions().addAll((Collection) newValue);
				return;
			case UMLPackage.SEQUENCE_NODE__REDEFINED_NODE :
				getRedefinedNodes().clear();
				getRedefinedNodes().addAll((Collection) newValue);
				return;
			case UMLPackage.SEQUENCE_NODE__HANDLER :
				getHandlers().clear();
				getHandlers().addAll((Collection) newValue);
				return;
			case UMLPackage.SEQUENCE_NODE__LOCAL_PRECONDITION :
				getLocalPreconditions().clear();
				getLocalPreconditions().addAll((Collection) newValue);
				return;
			case UMLPackage.SEQUENCE_NODE__LOCAL_POSTCONDITION :
				getLocalPostconditions().clear();
				getLocalPostconditions().addAll((Collection) newValue);
				return;
			case UMLPackage.SEQUENCE_NODE__ELEMENT_IMPORT :
				getElementImports().clear();
				getElementImports().addAll((Collection) newValue);
				return;
			case UMLPackage.SEQUENCE_NODE__PACKAGE_IMPORT :
				getPackageImports().clear();
				getPackageImports().addAll((Collection) newValue);
				return;
			case UMLPackage.SEQUENCE_NODE__OWNED_RULE :
				getOwnedRules().clear();
				getOwnedRules().addAll((Collection) newValue);
				return;
			case UMLPackage.SEQUENCE_NODE__IN_ACTIVITY :
				setInActivity((Activity) newValue);
				return;
			case UMLPackage.SEQUENCE_NODE__VARIABLE :
				getVariables().clear();
				getVariables().addAll((Collection) newValue);
				return;
			case UMLPackage.SEQUENCE_NODE__NODE :
				getNodes().clear();
				getNodes().addAll((Collection) newValue);
				return;
			case UMLPackage.SEQUENCE_NODE__MUST_ISOLATE :
				setMustIsolate(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.SEQUENCE_NODE__EDGE :
				getEdges().clear();
				getEdges().addAll((Collection) newValue);
				return;
			case UMLPackage.SEQUENCE_NODE__EXECUTABLE_NODE :
				getExecutableNodes().clear();
				getExecutableNodes().addAll((Collection) newValue);
				return;
		}
		eDynamicSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case UMLPackage.SEQUENCE_NODE__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.SEQUENCE_NODE__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.SEQUENCE_NODE__NAME :
				setName(NAME_EDEFAULT);
				return;
			case UMLPackage.SEQUENCE_NODE__VISIBILITY :
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UMLPackage.SEQUENCE_NODE__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.SEQUENCE_NODE__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.SEQUENCE_NODE__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.SEQUENCE_NODE__OUTGOING :
				getOutgoings().clear();
				return;
			case UMLPackage.SEQUENCE_NODE__IN_PARTITION :
				getInPartitions().clear();
				return;
			case UMLPackage.SEQUENCE_NODE__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) null);
				return;
			case UMLPackage.SEQUENCE_NODE__ACTIVITY :
				setActivity((Activity) null);
				return;
			case UMLPackage.SEQUENCE_NODE__INCOMING :
				getIncomings().clear();
				return;
			case UMLPackage.SEQUENCE_NODE__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				return;
			case UMLPackage.SEQUENCE_NODE__REDEFINED_NODE :
				getRedefinedNodes().clear();
				return;
			case UMLPackage.SEQUENCE_NODE__HANDLER :
				getHandlers().clear();
				return;
			case UMLPackage.SEQUENCE_NODE__LOCAL_PRECONDITION :
				getLocalPreconditions().clear();
				return;
			case UMLPackage.SEQUENCE_NODE__LOCAL_POSTCONDITION :
				getLocalPostconditions().clear();
				return;
			case UMLPackage.SEQUENCE_NODE__ELEMENT_IMPORT :
				getElementImports().clear();
				return;
			case UMLPackage.SEQUENCE_NODE__PACKAGE_IMPORT :
				getPackageImports().clear();
				return;
			case UMLPackage.SEQUENCE_NODE__OWNED_RULE :
				getOwnedRules().clear();
				return;
			case UMLPackage.SEQUENCE_NODE__IN_ACTIVITY :
				setInActivity((Activity) null);
				return;
			case UMLPackage.SEQUENCE_NODE__VARIABLE :
				getVariables().clear();
				return;
			case UMLPackage.SEQUENCE_NODE__NODE :
				getNodes().clear();
				return;
			case UMLPackage.SEQUENCE_NODE__MUST_ISOLATE :
				unsetMustIsolate();
				return;
			case UMLPackage.SEQUENCE_NODE__EDGE :
				getEdges().clear();
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UMLPackage.SEQUENCE_NODE__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.SEQUENCE_NODE__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.SEQUENCE_NODE__OWNER :
				return isSetOwner();
			case UMLPackage.SEQUENCE_NODE__OWNED_COMMENT :
				List ownedComment = (List) eVirtualGet(UMLPackage.SEQUENCE_NODE__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.SEQUENCE_NODE__NAME :
				String name = (String) eVirtualGet(
					UMLPackage.SEQUENCE_NODE__NAME, NAME_EDEFAULT);
				return NAME_EDEFAULT == null
					? name != null
					: !NAME_EDEFAULT.equals(name);
			case UMLPackage.SEQUENCE_NODE__VISIBILITY :
				return eVirtualGet(UMLPackage.SEQUENCE_NODE__VISIBILITY,
					VISIBILITY_EDEFAULT) != VISIBILITY_EDEFAULT;
			case UMLPackage.SEQUENCE_NODE__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.SEQUENCE_NODE__CLIENT_DEPENDENCY :
				List clientDependency = (List) eVirtualGet(UMLPackage.SEQUENCE_NODE__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.SEQUENCE_NODE__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.SEQUENCE_NODE__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.SEQUENCE_NODE__NAME_EXPRESSION) != null;
			case UMLPackage.SEQUENCE_NODE__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.SEQUENCE_NODE__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.SEQUENCE_NODE__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.SEQUENCE_NODE__OUTGOING :
				List outgoing = (List) eVirtualGet(UMLPackage.SEQUENCE_NODE__OUTGOING);
				return outgoing != null && !outgoing.isEmpty();
			case UMLPackage.SEQUENCE_NODE__IN_GROUP :
				return isSetInGroups();
			case UMLPackage.SEQUENCE_NODE__IN_PARTITION :
				List inPartition = (List) eVirtualGet(UMLPackage.SEQUENCE_NODE__IN_PARTITION);
				return inPartition != null && !inPartition.isEmpty();
			case UMLPackage.SEQUENCE_NODE__IN_STRUCTURED_NODE :
				return getInStructuredNode() != null;
			case UMLPackage.SEQUENCE_NODE__ACTIVITY :
				return isSetActivity();
			case UMLPackage.SEQUENCE_NODE__INCOMING :
				List incoming = (List) eVirtualGet(UMLPackage.SEQUENCE_NODE__INCOMING);
				return incoming != null && !incoming.isEmpty();
			case UMLPackage.SEQUENCE_NODE__IN_INTERRUPTIBLE_REGION :
				List inInterruptibleRegion = (List) eVirtualGet(UMLPackage.SEQUENCE_NODE__IN_INTERRUPTIBLE_REGION);
				return inInterruptibleRegion != null
					&& !inInterruptibleRegion.isEmpty();
			case UMLPackage.SEQUENCE_NODE__REDEFINED_NODE :
				List redefinedNode = (List) eVirtualGet(UMLPackage.SEQUENCE_NODE__REDEFINED_NODE);
				return redefinedNode != null && !redefinedNode.isEmpty();
			case UMLPackage.SEQUENCE_NODE__HANDLER :
				List handler = (List) eVirtualGet(UMLPackage.SEQUENCE_NODE__HANDLER);
				return handler != null && !handler.isEmpty();
			case UMLPackage.SEQUENCE_NODE__OUTPUT :
				return isSetOutputs();
			case UMLPackage.SEQUENCE_NODE__INPUT :
				return isSetInputs();
			case UMLPackage.SEQUENCE_NODE__CONTEXT :
				return getContext() != null;
			case UMLPackage.SEQUENCE_NODE__LOCAL_PRECONDITION :
				List localPrecondition = (List) eVirtualGet(UMLPackage.SEQUENCE_NODE__LOCAL_PRECONDITION);
				return localPrecondition != null
					&& !localPrecondition.isEmpty();
			case UMLPackage.SEQUENCE_NODE__LOCAL_POSTCONDITION :
				List localPostcondition = (List) eVirtualGet(UMLPackage.SEQUENCE_NODE__LOCAL_POSTCONDITION);
				return localPostcondition != null
					&& !localPostcondition.isEmpty();
			case UMLPackage.SEQUENCE_NODE__ELEMENT_IMPORT :
				List elementImport = (List) eVirtualGet(UMLPackage.SEQUENCE_NODE__ELEMENT_IMPORT);
				return elementImport != null && !elementImport.isEmpty();
			case UMLPackage.SEQUENCE_NODE__PACKAGE_IMPORT :
				List packageImport = (List) eVirtualGet(UMLPackage.SEQUENCE_NODE__PACKAGE_IMPORT);
				return packageImport != null && !packageImport.isEmpty();
			case UMLPackage.SEQUENCE_NODE__OWNED_RULE :
				List ownedRule = (List) eVirtualGet(UMLPackage.SEQUENCE_NODE__OWNED_RULE);
				return ownedRule != null && !ownedRule.isEmpty();
			case UMLPackage.SEQUENCE_NODE__MEMBER :
				return isSetMembers();
			case UMLPackage.SEQUENCE_NODE__IMPORTED_MEMBER :
				return !getImportedMembers().isEmpty();
			case UMLPackage.SEQUENCE_NODE__OWNED_MEMBER :
				return isSetOwnedMembers();
			case UMLPackage.SEQUENCE_NODE__SUBGROUP :
				return isSetSubgroups();
			case UMLPackage.SEQUENCE_NODE__SUPER_GROUP :
				return isSetSuperGroup();
			case UMLPackage.SEQUENCE_NODE__CONTAINED_NODE :
				return isSetContainedNodes();
			case UMLPackage.SEQUENCE_NODE__IN_ACTIVITY :
				return isSetInActivity();
			case UMLPackage.SEQUENCE_NODE__CONTAINED_EDGE :
				return isSetContainedEdges();
			case UMLPackage.SEQUENCE_NODE__VARIABLE :
				List variable = (List) eVirtualGet(UMLPackage.SEQUENCE_NODE__VARIABLE);
				return variable != null && !variable.isEmpty();
			case UMLPackage.SEQUENCE_NODE__NODE :
				return isSetNodes();
			case UMLPackage.SEQUENCE_NODE__MUST_ISOLATE :
				return isSetMustIsolate();
			case UMLPackage.SEQUENCE_NODE__EDGE :
				List edge = (List) eVirtualGet(UMLPackage.SEQUENCE_NODE__EDGE);
				return edge != null && !edge.isEmpty();
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
	public List getNodes() {
		return getExecutableNodes();
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
