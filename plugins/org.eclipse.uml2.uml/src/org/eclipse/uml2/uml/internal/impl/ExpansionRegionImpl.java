/*
 * Copyright (c) 2005, 2009 IBM Corporation, Embarcadero Technologies, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (Embarcadero Technologies) - 204200
 *   Kenn Hussey - 286329
 *
 * $Id: ExpansionRegionImpl.java,v 1.23 2009/12/04 15:30:46 khussey Exp $
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

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.ActivityEdge;
import org.eclipse.uml2.uml.ActivityNode;
import org.eclipse.uml2.uml.ActivityPartition;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.ElementImport;
import org.eclipse.uml2.uml.ExceptionHandler;
import org.eclipse.uml2.uml.ExpansionKind;
import org.eclipse.uml2.uml.ExpansionNode;
import org.eclipse.uml2.uml.ExpansionRegion;
import org.eclipse.uml2.uml.InterruptibleActivityRegion;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.PackageImport;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.RedefinableElement;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.StructuredActivityNode;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.Variable;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.ExpansionRegionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expansion Region</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ExpansionRegionImpl#getMode <em>Mode</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ExpansionRegionImpl#getInputElements <em>Input Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ExpansionRegionImpl#getOutputElements <em>Output Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExpansionRegionImpl
		extends StructuredActivityNodeImpl
		implements ExpansionRegion {

	/**
	 * The default value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected static final ExpansionKind MODE_EDEFAULT = ExpansionKind.ITERATIVE_LITERAL;

	/**
	 * The offset of the flags representing the value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int MODE_EFLAG_OFFSET = 14;

	/**
	 * The flags representing the default value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int MODE_EFLAG_DEFAULT = MODE_EDEFAULT.ordinal() << MODE_EFLAG_OFFSET;

	/**
	 * The array of enumeration values for '{@link ExpansionKind Expansion Kind}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	private static final ExpansionKind[] MODE_EFLAG_VALUES = ExpansionKind
		.values();

	/**
	 * The flags representing the value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected static final int MODE_EFLAG = 0x3 << MODE_EFLAG_OFFSET;

	/**
	 * The cached value of the '{@link #getInputElements() <em>Input Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputElements()
	 * @generated
	 * @ordered
	 */
	protected EList<ExpansionNode> inputElements;

	/**
	 * The cached value of the '{@link #getOutputElements() <em>Output Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputElements()
	 * @generated
	 * @ordered
	 */
	protected EList<ExpansionNode> outputElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpansionRegionImpl() {
		super();
		eFlags |= MODE_EFLAG_DEFAULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.EXPANSION_REGION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpansionKind getMode() {
		return MODE_EFLAG_VALUES[(eFlags & MODE_EFLAG) >>> MODE_EFLAG_OFFSET];
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMode(ExpansionKind newMode) {
		ExpansionKind oldMode = MODE_EFLAG_VALUES[(eFlags & MODE_EFLAG) >>> MODE_EFLAG_OFFSET];
		if (newMode == null)
			newMode = MODE_EDEFAULT;
		eFlags = eFlags & ~MODE_EFLAG | newMode.ordinal() << MODE_EFLAG_OFFSET;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.EXPANSION_REGION__MODE, oldMode, newMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExpansionNode> getInputElements() {
		if (inputElements == null) {
			inputElements = new EObjectWithInverseResolvingEList<ExpansionNode>(
				ExpansionNode.class, this,
				UMLPackage.EXPANSION_REGION__INPUT_ELEMENT,
				UMLPackage.EXPANSION_NODE__REGION_AS_INPUT);
		}
		return inputElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpansionNode getInputElement(String name, Type type) {
		return getInputElement(name, type, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpansionNode getInputElement(String name, Type type,
			boolean ignoreCase) {
		inputElementLoop : for (ExpansionNode inputElement : getInputElements()) {
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(inputElement.getName())
				: name.equals(inputElement.getName())))
				continue inputElementLoop;
			if (type != null && !type.equals(inputElement.getType()))
				continue inputElementLoop;
			return inputElement;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExpansionNode> getOutputElements() {
		if (outputElements == null) {
			outputElements = new EObjectWithInverseResolvingEList<ExpansionNode>(
				ExpansionNode.class, this,
				UMLPackage.EXPANSION_REGION__OUTPUT_ELEMENT,
				UMLPackage.EXPANSION_NODE__REGION_AS_OUTPUT);
		}
		return outputElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpansionNode getOutputElement(String name, Type type) {
		return getOutputElement(name, type, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpansionNode getOutputElement(String name, Type type,
			boolean ignoreCase) {
		outputElementLoop : for (ExpansionNode outputElement : getOutputElements()) {
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(outputElement.getName())
				: name.equals(outputElement.getName())))
				continue outputElementLoop;
			if (type != null && !type.equals(outputElement.getType()))
				continue outputElementLoop;
			return outputElement;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExpansionNodes(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ExpansionRegionOperations.validateExpansionNodes(this,
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
			case UMLPackage.EXPANSION_REGION__EANNOTATIONS :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getEAnnotations())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.EXPANSION_REGION__CLIENT_DEPENDENCY :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getClientDependencies())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.EXPANSION_REGION__IN_STRUCTURED_NODE :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetInStructuredNode(
					(StructuredActivityNode) otherEnd, msgs);
			case UMLPackage.EXPANSION_REGION__ACTIVITY :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetActivity((Activity) otherEnd, msgs);
			case UMLPackage.EXPANSION_REGION__OUTGOING :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getOutgoings())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.EXPANSION_REGION__INCOMING :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getIncomings())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.EXPANSION_REGION__IN_PARTITION :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getInPartitions())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.EXPANSION_REGION__IN_INTERRUPTIBLE_REGION :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getInInterruptibleRegions())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.EXPANSION_REGION__HANDLER :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getHandlers())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.EXPANSION_REGION__ELEMENT_IMPORT :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getElementImports())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.EXPANSION_REGION__PACKAGE_IMPORT :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getPackageImports())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.EXPANSION_REGION__OWNED_RULE :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getOwnedRules())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.EXPANSION_REGION__IN_ACTIVITY :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetInActivity((Activity) otherEnd, msgs);
			case UMLPackage.EXPANSION_REGION__VARIABLE :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getVariables())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.EXPANSION_REGION__EDGE :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getEdges())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.EXPANSION_REGION__NODE :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getNodes())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.EXPANSION_REGION__INPUT_ELEMENT :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getInputElements())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.EXPANSION_REGION__OUTPUT_ELEMENT :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getOutputElements())
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
			case UMLPackage.EXPANSION_REGION__EANNOTATIONS :
				return ((InternalEList<?>) getEAnnotations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.EXPANSION_REGION__OWNED_COMMENT :
				return ((InternalEList<?>) getOwnedComments()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.EXPANSION_REGION__CLIENT_DEPENDENCY :
				return ((InternalEList<?>) getClientDependencies())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.EXPANSION_REGION__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.EXPANSION_REGION__IN_STRUCTURED_NODE :
				return basicSetInStructuredNode(null, msgs);
			case UMLPackage.EXPANSION_REGION__ACTIVITY :
				return basicSetActivity(null, msgs);
			case UMLPackage.EXPANSION_REGION__OUTGOING :
				return ((InternalEList<?>) getOutgoings()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.EXPANSION_REGION__INCOMING :
				return ((InternalEList<?>) getIncomings()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.EXPANSION_REGION__IN_PARTITION :
				return ((InternalEList<?>) getInPartitions()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.EXPANSION_REGION__IN_INTERRUPTIBLE_REGION :
				return ((InternalEList<?>) getInInterruptibleRegions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.EXPANSION_REGION__HANDLER :
				return ((InternalEList<?>) getHandlers()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.EXPANSION_REGION__LOCAL_PRECONDITION :
				return ((InternalEList<?>) getLocalPreconditions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.EXPANSION_REGION__LOCAL_POSTCONDITION :
				return ((InternalEList<?>) getLocalPostconditions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.EXPANSION_REGION__ELEMENT_IMPORT :
				return ((InternalEList<?>) getElementImports()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.EXPANSION_REGION__PACKAGE_IMPORT :
				return ((InternalEList<?>) getPackageImports()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.EXPANSION_REGION__OWNED_RULE :
				return ((InternalEList<?>) getOwnedRules()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.EXPANSION_REGION__IN_ACTIVITY :
				return basicSetInActivity(null, msgs);
			case UMLPackage.EXPANSION_REGION__VARIABLE :
				return ((InternalEList<?>) getVariables()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.EXPANSION_REGION__EDGE :
				return ((InternalEList<?>) getEdges()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.EXPANSION_REGION__NODE :
				return ((InternalEList<?>) getNodes()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.EXPANSION_REGION__INPUT_ELEMENT :
				return ((InternalEList<?>) getInputElements()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.EXPANSION_REGION__OUTPUT_ELEMENT :
				return ((InternalEList<?>) getOutputElements()).basicRemove(
					otherEnd, msgs);
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
			case UMLPackage.EXPANSION_REGION__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.EXPANSION_REGION__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.EXPANSION_REGION__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.EXPANSION_REGION__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.EXPANSION_REGION__NAME :
				return getName();
			case UMLPackage.EXPANSION_REGION__VISIBILITY :
				return getVisibility();
			case UMLPackage.EXPANSION_REGION__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.EXPANSION_REGION__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.EXPANSION_REGION__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.EXPANSION_REGION__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.EXPANSION_REGION__IS_LEAF :
				return isLeaf();
			case UMLPackage.EXPANSION_REGION__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.EXPANSION_REGION__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.EXPANSION_REGION__IN_STRUCTURED_NODE :
				if (resolve)
					return getInStructuredNode();
				return basicGetInStructuredNode();
			case UMLPackage.EXPANSION_REGION__ACTIVITY :
				if (resolve)
					return getActivity();
				return basicGetActivity();
			case UMLPackage.EXPANSION_REGION__OUTGOING :
				return getOutgoings();
			case UMLPackage.EXPANSION_REGION__INCOMING :
				return getIncomings();
			case UMLPackage.EXPANSION_REGION__IN_PARTITION :
				return getInPartitions();
			case UMLPackage.EXPANSION_REGION__IN_INTERRUPTIBLE_REGION :
				return getInInterruptibleRegions();
			case UMLPackage.EXPANSION_REGION__IN_GROUP :
				return getInGroups();
			case UMLPackage.EXPANSION_REGION__REDEFINED_NODE :
				return getRedefinedNodes();
			case UMLPackage.EXPANSION_REGION__HANDLER :
				return getHandlers();
			case UMLPackage.EXPANSION_REGION__OUTPUT :
				return getOutputs();
			case UMLPackage.EXPANSION_REGION__INPUT :
				return getInputs();
			case UMLPackage.EXPANSION_REGION__CONTEXT :
				if (resolve)
					return getContext();
				return basicGetContext();
			case UMLPackage.EXPANSION_REGION__LOCAL_PRECONDITION :
				return getLocalPreconditions();
			case UMLPackage.EXPANSION_REGION__LOCAL_POSTCONDITION :
				return getLocalPostconditions();
			case UMLPackage.EXPANSION_REGION__ELEMENT_IMPORT :
				return getElementImports();
			case UMLPackage.EXPANSION_REGION__PACKAGE_IMPORT :
				return getPackageImports();
			case UMLPackage.EXPANSION_REGION__OWNED_RULE :
				return getOwnedRules();
			case UMLPackage.EXPANSION_REGION__MEMBER :
				return getMembers();
			case UMLPackage.EXPANSION_REGION__IMPORTED_MEMBER :
				return getImportedMembers();
			case UMLPackage.EXPANSION_REGION__OWNED_MEMBER :
				return getOwnedMembers();
			case UMLPackage.EXPANSION_REGION__SUBGROUP :
				return getSubgroups();
			case UMLPackage.EXPANSION_REGION__SUPER_GROUP :
				if (resolve)
					return getSuperGroup();
				return basicGetSuperGroup();
			case UMLPackage.EXPANSION_REGION__IN_ACTIVITY :
				if (resolve)
					return getInActivity();
				return basicGetInActivity();
			case UMLPackage.EXPANSION_REGION__CONTAINED_EDGE :
				return getContainedEdges();
			case UMLPackage.EXPANSION_REGION__CONTAINED_NODE :
				return getContainedNodes();
			case UMLPackage.EXPANSION_REGION__VARIABLE :
				return getVariables();
			case UMLPackage.EXPANSION_REGION__EDGE :
				return getEdges();
			case UMLPackage.EXPANSION_REGION__MUST_ISOLATE :
				return isMustIsolate();
			case UMLPackage.EXPANSION_REGION__NODE :
				return getNodes();
			case UMLPackage.EXPANSION_REGION__MODE :
				return getMode();
			case UMLPackage.EXPANSION_REGION__INPUT_ELEMENT :
				return getInputElements();
			case UMLPackage.EXPANSION_REGION__OUTPUT_ELEMENT :
				return getOutputElements();
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
			case UMLPackage.EXPANSION_REGION__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll(
					(Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.EXPANSION_REGION__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll(
					(Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.EXPANSION_REGION__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.EXPANSION_REGION__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.EXPANSION_REGION__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll(
					(Collection<? extends Dependency>) newValue);
				return;
			case UMLPackage.EXPANSION_REGION__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.EXPANSION_REGION__IS_LEAF :
				setIsLeaf((Boolean) newValue);
				return;
			case UMLPackage.EXPANSION_REGION__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) newValue);
				return;
			case UMLPackage.EXPANSION_REGION__ACTIVITY :
				setActivity((Activity) newValue);
				return;
			case UMLPackage.EXPANSION_REGION__OUTGOING :
				getOutgoings().clear();
				getOutgoings().addAll(
					(Collection<? extends ActivityEdge>) newValue);
				return;
			case UMLPackage.EXPANSION_REGION__INCOMING :
				getIncomings().clear();
				getIncomings().addAll(
					(Collection<? extends ActivityEdge>) newValue);
				return;
			case UMLPackage.EXPANSION_REGION__IN_PARTITION :
				getInPartitions().clear();
				getInPartitions().addAll(
					(Collection<? extends ActivityPartition>) newValue);
				return;
			case UMLPackage.EXPANSION_REGION__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				getInInterruptibleRegions()
					.addAll(
						(Collection<? extends InterruptibleActivityRegion>) newValue);
				return;
			case UMLPackage.EXPANSION_REGION__REDEFINED_NODE :
				getRedefinedNodes().clear();
				getRedefinedNodes().addAll(
					(Collection<? extends ActivityNode>) newValue);
				return;
			case UMLPackage.EXPANSION_REGION__HANDLER :
				getHandlers().clear();
				getHandlers().addAll(
					(Collection<? extends ExceptionHandler>) newValue);
				return;
			case UMLPackage.EXPANSION_REGION__LOCAL_PRECONDITION :
				getLocalPreconditions().clear();
				getLocalPreconditions().addAll(
					(Collection<? extends Constraint>) newValue);
				return;
			case UMLPackage.EXPANSION_REGION__LOCAL_POSTCONDITION :
				getLocalPostconditions().clear();
				getLocalPostconditions().addAll(
					(Collection<? extends Constraint>) newValue);
				return;
			case UMLPackage.EXPANSION_REGION__ELEMENT_IMPORT :
				getElementImports().clear();
				getElementImports().addAll(
					(Collection<? extends ElementImport>) newValue);
				return;
			case UMLPackage.EXPANSION_REGION__PACKAGE_IMPORT :
				getPackageImports().clear();
				getPackageImports().addAll(
					(Collection<? extends PackageImport>) newValue);
				return;
			case UMLPackage.EXPANSION_REGION__OWNED_RULE :
				getOwnedRules().clear();
				getOwnedRules().addAll(
					(Collection<? extends Constraint>) newValue);
				return;
			case UMLPackage.EXPANSION_REGION__IN_ACTIVITY :
				setInActivity((Activity) newValue);
				return;
			case UMLPackage.EXPANSION_REGION__VARIABLE :
				getVariables().clear();
				getVariables()
					.addAll((Collection<? extends Variable>) newValue);
				return;
			case UMLPackage.EXPANSION_REGION__EDGE :
				getEdges().clear();
				getEdges()
					.addAll((Collection<? extends ActivityEdge>) newValue);
				return;
			case UMLPackage.EXPANSION_REGION__MUST_ISOLATE :
				setMustIsolate((Boolean) newValue);
				return;
			case UMLPackage.EXPANSION_REGION__NODE :
				getNodes().clear();
				getNodes()
					.addAll((Collection<? extends ActivityNode>) newValue);
				return;
			case UMLPackage.EXPANSION_REGION__MODE :
				setMode((ExpansionKind) newValue);
				return;
			case UMLPackage.EXPANSION_REGION__INPUT_ELEMENT :
				getInputElements().clear();
				getInputElements().addAll(
					(Collection<? extends ExpansionNode>) newValue);
				return;
			case UMLPackage.EXPANSION_REGION__OUTPUT_ELEMENT :
				getOutputElements().clear();
				getOutputElements().addAll(
					(Collection<? extends ExpansionNode>) newValue);
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
			case UMLPackage.EXPANSION_REGION__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.EXPANSION_REGION__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.EXPANSION_REGION__NAME :
				unsetName();
				return;
			case UMLPackage.EXPANSION_REGION__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.EXPANSION_REGION__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.EXPANSION_REGION__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.EXPANSION_REGION__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.EXPANSION_REGION__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) null);
				return;
			case UMLPackage.EXPANSION_REGION__ACTIVITY :
				setActivity((Activity) null);
				return;
			case UMLPackage.EXPANSION_REGION__OUTGOING :
				getOutgoings().clear();
				return;
			case UMLPackage.EXPANSION_REGION__INCOMING :
				getIncomings().clear();
				return;
			case UMLPackage.EXPANSION_REGION__IN_PARTITION :
				getInPartitions().clear();
				return;
			case UMLPackage.EXPANSION_REGION__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				return;
			case UMLPackage.EXPANSION_REGION__REDEFINED_NODE :
				getRedefinedNodes().clear();
				return;
			case UMLPackage.EXPANSION_REGION__HANDLER :
				getHandlers().clear();
				return;
			case UMLPackage.EXPANSION_REGION__LOCAL_PRECONDITION :
				getLocalPreconditions().clear();
				return;
			case UMLPackage.EXPANSION_REGION__LOCAL_POSTCONDITION :
				getLocalPostconditions().clear();
				return;
			case UMLPackage.EXPANSION_REGION__ELEMENT_IMPORT :
				getElementImports().clear();
				return;
			case UMLPackage.EXPANSION_REGION__PACKAGE_IMPORT :
				getPackageImports().clear();
				return;
			case UMLPackage.EXPANSION_REGION__OWNED_RULE :
				getOwnedRules().clear();
				return;
			case UMLPackage.EXPANSION_REGION__IN_ACTIVITY :
				setInActivity((Activity) null);
				return;
			case UMLPackage.EXPANSION_REGION__VARIABLE :
				getVariables().clear();
				return;
			case UMLPackage.EXPANSION_REGION__EDGE :
				getEdges().clear();
				return;
			case UMLPackage.EXPANSION_REGION__MUST_ISOLATE :
				setMustIsolate(MUST_ISOLATE_EDEFAULT);
				return;
			case UMLPackage.EXPANSION_REGION__NODE :
				getNodes().clear();
				return;
			case UMLPackage.EXPANSION_REGION__MODE :
				setMode(MODE_EDEFAULT);
				return;
			case UMLPackage.EXPANSION_REGION__INPUT_ELEMENT :
				getInputElements().clear();
				return;
			case UMLPackage.EXPANSION_REGION__OUTPUT_ELEMENT :
				getOutputElements().clear();
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
			case UMLPackage.EXPANSION_REGION__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.EXPANSION_REGION__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.EXPANSION_REGION__OWNER :
				return isSetOwner();
			case UMLPackage.EXPANSION_REGION__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.EXPANSION_REGION__NAME :
				return isSetName();
			case UMLPackage.EXPANSION_REGION__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.EXPANSION_REGION__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.EXPANSION_REGION__CLIENT_DEPENDENCY :
				return clientDependencies != null
					&& !clientDependencies.isEmpty();
			case UMLPackage.EXPANSION_REGION__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.EXPANSION_REGION__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.EXPANSION_REGION__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.EXPANSION_REGION__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.EXPANSION_REGION__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.EXPANSION_REGION__IN_STRUCTURED_NODE :
				return basicGetInStructuredNode() != null;
			case UMLPackage.EXPANSION_REGION__ACTIVITY :
				return isSetActivity();
			case UMLPackage.EXPANSION_REGION__OUTGOING :
				return outgoings != null && !outgoings.isEmpty();
			case UMLPackage.EXPANSION_REGION__INCOMING :
				return incomings != null && !incomings.isEmpty();
			case UMLPackage.EXPANSION_REGION__IN_PARTITION :
				return inPartitions != null && !inPartitions.isEmpty();
			case UMLPackage.EXPANSION_REGION__IN_INTERRUPTIBLE_REGION :
				return inInterruptibleRegions != null
					&& !inInterruptibleRegions.isEmpty();
			case UMLPackage.EXPANSION_REGION__IN_GROUP :
				return isSetInGroups();
			case UMLPackage.EXPANSION_REGION__REDEFINED_NODE :
				return redefinedNodes != null && !redefinedNodes.isEmpty();
			case UMLPackage.EXPANSION_REGION__HANDLER :
				return handlers != null && !handlers.isEmpty();
			case UMLPackage.EXPANSION_REGION__OUTPUT :
				return isSetOutputs();
			case UMLPackage.EXPANSION_REGION__INPUT :
				return isSetInputs();
			case UMLPackage.EXPANSION_REGION__CONTEXT :
				return basicGetContext() != null;
			case UMLPackage.EXPANSION_REGION__LOCAL_PRECONDITION :
				return localPreconditions != null
					&& !localPreconditions.isEmpty();
			case UMLPackage.EXPANSION_REGION__LOCAL_POSTCONDITION :
				return localPostconditions != null
					&& !localPostconditions.isEmpty();
			case UMLPackage.EXPANSION_REGION__ELEMENT_IMPORT :
				return elementImports != null && !elementImports.isEmpty();
			case UMLPackage.EXPANSION_REGION__PACKAGE_IMPORT :
				return packageImports != null && !packageImports.isEmpty();
			case UMLPackage.EXPANSION_REGION__OWNED_RULE :
				return ownedRules != null && !ownedRules.isEmpty();
			case UMLPackage.EXPANSION_REGION__MEMBER :
				return isSetMembers();
			case UMLPackage.EXPANSION_REGION__IMPORTED_MEMBER :
				return !getImportedMembers().isEmpty();
			case UMLPackage.EXPANSION_REGION__OWNED_MEMBER :
				return isSetOwnedMembers();
			case UMLPackage.EXPANSION_REGION__SUBGROUP :
				return isSetSubgroups();
			case UMLPackage.EXPANSION_REGION__SUPER_GROUP :
				return isSetSuperGroup();
			case UMLPackage.EXPANSION_REGION__IN_ACTIVITY :
				return isSetInActivity();
			case UMLPackage.EXPANSION_REGION__CONTAINED_EDGE :
				return isSetContainedEdges();
			case UMLPackage.EXPANSION_REGION__CONTAINED_NODE :
				return isSetContainedNodes();
			case UMLPackage.EXPANSION_REGION__VARIABLE :
				return variables != null && !variables.isEmpty();
			case UMLPackage.EXPANSION_REGION__EDGE :
				return edges != null && !edges.isEmpty();
			case UMLPackage.EXPANSION_REGION__MUST_ISOLATE :
				return ((eFlags & MUST_ISOLATE_EFLAG) != 0) != MUST_ISOLATE_EDEFAULT;
			case UMLPackage.EXPANSION_REGION__NODE :
				return nodes != null && !nodes.isEmpty();
			case UMLPackage.EXPANSION_REGION__MODE :
				return (eFlags & MODE_EFLAG) != MODE_EFLAG_DEFAULT;
			case UMLPackage.EXPANSION_REGION__INPUT_ELEMENT :
				return inputElements != null && !inputElements.isEmpty();
			case UMLPackage.EXPANSION_REGION__OUTPUT_ELEMENT :
				return outputElements != null && !outputElements.isEmpty();
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
			case UMLPackage.EXPANSION_REGION___GET_EANNOTATION__STRING :
				return getEAnnotation((String) arguments.get(0));
			case UMLPackage.EXPANSION_REGION___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP :
				return validateNotOwnSelf((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.EXPANSION_REGION___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP :
				return validateHasOwner((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.EXPANSION_REGION___DESTROY :
				destroy();
				return null;
			case UMLPackage.EXPANSION_REGION___HAS_KEYWORD__STRING :
				return hasKeyword((String) arguments.get(0));
			case UMLPackage.EXPANSION_REGION___GET_KEYWORDS :
				return getKeywords();
			case UMLPackage.EXPANSION_REGION___ADD_KEYWORD__STRING :
				return addKeyword((String) arguments.get(0));
			case UMLPackage.EXPANSION_REGION___REMOVE_KEYWORD__STRING :
				return removeKeyword((String) arguments.get(0));
			case UMLPackage.EXPANSION_REGION___GET_NEAREST_PACKAGE :
				return getNearestPackage();
			case UMLPackage.EXPANSION_REGION___GET_MODEL :
				return getModel();
			case UMLPackage.EXPANSION_REGION___IS_STEREOTYPE_APPLICABLE__STEREOTYPE :
				return isStereotypeApplicable((Stereotype) arguments.get(0));
			case UMLPackage.EXPANSION_REGION___IS_STEREOTYPE_REQUIRED__STEREOTYPE :
				return isStereotypeRequired((Stereotype) arguments.get(0));
			case UMLPackage.EXPANSION_REGION___IS_STEREOTYPE_APPLIED__STEREOTYPE :
				return isStereotypeApplied((Stereotype) arguments.get(0));
			case UMLPackage.EXPANSION_REGION___APPLY_STEREOTYPE__STEREOTYPE :
				return applyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.EXPANSION_REGION___UNAPPLY_STEREOTYPE__STEREOTYPE :
				return unapplyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.EXPANSION_REGION___GET_APPLICABLE_STEREOTYPES :
				return getApplicableStereotypes();
			case UMLPackage.EXPANSION_REGION___GET_APPLICABLE_STEREOTYPE__STRING :
				return getApplicableStereotype((String) arguments.get(0));
			case UMLPackage.EXPANSION_REGION___GET_STEREOTYPE_APPLICATIONS :
				return getStereotypeApplications();
			case UMLPackage.EXPANSION_REGION___GET_STEREOTYPE_APPLICATION__STEREOTYPE :
				return getStereotypeApplication((Stereotype) arguments.get(0));
			case UMLPackage.EXPANSION_REGION___GET_REQUIRED_STEREOTYPES :
				return getRequiredStereotypes();
			case UMLPackage.EXPANSION_REGION___GET_REQUIRED_STEREOTYPE__STRING :
				return getRequiredStereotype((String) arguments.get(0));
			case UMLPackage.EXPANSION_REGION___GET_APPLIED_STEREOTYPES :
				return getAppliedStereotypes();
			case UMLPackage.EXPANSION_REGION___GET_APPLIED_STEREOTYPE__STRING :
				return getAppliedStereotype((String) arguments.get(0));
			case UMLPackage.EXPANSION_REGION___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE :
				return getAppliedSubstereotypes((Stereotype) arguments.get(0));
			case UMLPackage.EXPANSION_REGION___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING :
				return getAppliedSubstereotype((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.EXPANSION_REGION___HAS_VALUE__STEREOTYPE_STRING :
				return hasValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.EXPANSION_REGION___GET_VALUE__STEREOTYPE_STRING :
				return getValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.EXPANSION_REGION___SET_VALUE__STEREOTYPE_STRING_OBJECT :
				setValue((Stereotype) arguments.get(0), (String) arguments
					.get(1), arguments.get(2));
				return null;
			case UMLPackage.EXPANSION_REGION___CREATE_EANNOTATION__STRING :
				return createEAnnotation((String) arguments.get(0));
			case UMLPackage.EXPANSION_REGION___GET_RELATIONSHIPS :
				return getRelationships();
			case UMLPackage.EXPANSION_REGION___GET_RELATIONSHIPS__ECLASS :
				return getRelationships((EClass) arguments.get(0));
			case UMLPackage.EXPANSION_REGION___GET_SOURCE_DIRECTED_RELATIONSHIPS :
				return getSourceDirectedRelationships();
			case UMLPackage.EXPANSION_REGION___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS :
				return getSourceDirectedRelationships((EClass) arguments.get(0));
			case UMLPackage.EXPANSION_REGION___GET_TARGET_DIRECTED_RELATIONSHIPS :
				return getTargetDirectedRelationships();
			case UMLPackage.EXPANSION_REGION___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS :
				return getTargetDirectedRelationships((EClass) arguments.get(0));
			case UMLPackage.EXPANSION_REGION___ALL_OWNED_ELEMENTS :
				return allOwnedElements();
			case UMLPackage.EXPANSION_REGION___MUST_BE_OWNED :
				return mustBeOwned();
			case UMLPackage.EXPANSION_REGION___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasNoQualifiedName((DiagnosticChain) arguments
					.get(0), (Map<Object, Object>) arguments.get(1));
			case UMLPackage.EXPANSION_REGION___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasQualifiedName((DiagnosticChain) arguments
					.get(0), (Map<Object, Object>) arguments.get(1));
			case UMLPackage.EXPANSION_REGION___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP :
				return validateVisibilityNeedsOwnership(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.EXPANSION_REGION___CREATE_DEPENDENCY__NAMEDELEMENT :
				return createDependency((NamedElement) arguments.get(0));
			case UMLPackage.EXPANSION_REGION___GET_LABEL :
				return getLabel();
			case UMLPackage.EXPANSION_REGION___GET_LABEL__BOOLEAN :
				return getLabel((Boolean) arguments.get(0));
			case UMLPackage.EXPANSION_REGION___CREATE_USAGE__NAMEDELEMENT :
				return createUsage((NamedElement) arguments.get(0));
			case UMLPackage.EXPANSION_REGION___GET_QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.EXPANSION_REGION___ALL_NAMESPACES :
				return allNamespaces();
			case UMLPackage.EXPANSION_REGION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE :
				return isDistinguishableFrom((NamedElement) arguments.get(0),
					(Namespace) arguments.get(1));
			case UMLPackage.EXPANSION_REGION___SEPARATOR :
				return separator();
			case UMLPackage.EXPANSION_REGION___ALL_OWNING_PACKAGES :
				return allOwningPackages();
			case UMLPackage.EXPANSION_REGION___VALIDATE_REDEFINITION_CONTEXT_VALID__DIAGNOSTICCHAIN_MAP :
				return validateRedefinitionContextValid(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.EXPANSION_REGION___VALIDATE_REDEFINITION_CONSISTENT__DIAGNOSTICCHAIN_MAP :
				return validateRedefinitionConsistent(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.EXPANSION_REGION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT :
				return isConsistentWith((RedefinableElement) arguments.get(0));
			case UMLPackage.EXPANSION_REGION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT :
				return isRedefinitionContextValid((RedefinableElement) arguments
					.get(0));
			case UMLPackage.EXPANSION_REGION___VALIDATE_OWNED_STRUCTURED_NODE__DIAGNOSTICCHAIN_MAP :
				return validateOwnedStructuredNode((DiagnosticChain) arguments
					.get(0), (Map<Object, Object>) arguments.get(1));
			case UMLPackage.EXPANSION_REGION___VALIDATE_OWNED__DIAGNOSTICCHAIN_MAP :
				return validateOwned((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.EXPANSION_REGION___VALIDATE_MEMBERS_DISTINGUISHABLE__DIAGNOSTICCHAIN_MAP :
				return validateMembersDistinguishable(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.EXPANSION_REGION___CREATE_ELEMENT_IMPORT__PACKAGEABLEELEMENT_VISIBILITYKIND :
				return createElementImport((PackageableElement) arguments
					.get(0), (VisibilityKind) arguments.get(1));
			case UMLPackage.EXPANSION_REGION___CREATE_PACKAGE_IMPORT__PACKAGE_VISIBILITYKIND :
				return createPackageImport(
					(org.eclipse.uml2.uml.Package) arguments.get(0),
					(VisibilityKind) arguments.get(1));
			case UMLPackage.EXPANSION_REGION___GET_IMPORTED_ELEMENTS :
				return getImportedElements();
			case UMLPackage.EXPANSION_REGION___GET_IMPORTED_PACKAGES :
				return getImportedPackages();
			case UMLPackage.EXPANSION_REGION___GET_IMPORTED_MEMBERS :
				return getImportedMembers();
			case UMLPackage.EXPANSION_REGION___GET_NAMES_OF_MEMBER__NAMEDELEMENT :
				return getNamesOfMember((NamedElement) arguments.get(0));
			case UMLPackage.EXPANSION_REGION___MEMBERS_ARE_DISTINGUISHABLE :
				return membersAreDistinguishable();
			case UMLPackage.EXPANSION_REGION___IMPORT_MEMBERS__ELIST :
				return importMembers((EList<PackageableElement>) arguments
					.get(0));
			case UMLPackage.EXPANSION_REGION___EXCLUDE_COLLISIONS__ELIST :
				return excludeCollisions((EList<PackageableElement>) arguments
					.get(0));
			case UMLPackage.EXPANSION_REGION___VALIDATE_NODES_AND_EDGES__DIAGNOSTICCHAIN_MAP :
				return validateNodesAndEdges(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.EXPANSION_REGION___VALIDATE_NOT_CONTAINED__DIAGNOSTICCHAIN_MAP :
				return validateNotContained((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.EXPANSION_REGION___VALIDATE_GROUP_OWNED__DIAGNOSTICCHAIN_MAP :
				return validateGroupOwned((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.EXPANSION_REGION___VALIDATE_EDGES__DIAGNOSTICCHAIN_MAP :
				return validateEdges((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.EXPANSION_REGION___VALIDATE_EXPANSION_NODES__DIAGNOSTICCHAIN_MAP :
				return validateExpansionNodes((DiagnosticChain) arguments
					.get(0), (Map<Object, Object>) arguments.get(1));
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
		result.append(" (mode: "); //$NON-NLS-1$
		result
			.append(MODE_EFLAG_VALUES[(eFlags & MODE_EFLAG) >>> MODE_EFLAG_OFFSET]);
		result.append(')');
		return result.toString();
	}

} //ExpansionRegionImpl
