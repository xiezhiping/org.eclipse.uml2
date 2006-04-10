/*
 * Copyright (c) 2005, 2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: ActivityImpl.java,v 1.26 2006/04/10 19:16:19 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedEObjectEList;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;
import org.eclipse.uml2.common.util.SubsetSupersetEObjectContainmentWithInverseEList;
import org.eclipse.uml2.common.util.SubsetSupersetEObjectResolvingEList;

import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.ActivityEdge;
import org.eclipse.uml2.uml.ActivityGroup;
import org.eclipse.uml2.uml.ActivityNode;
import org.eclipse.uml2.uml.ActivityPartition;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.BehavioralFeature;
import org.eclipse.uml2.uml.CollaborationUse;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.StructuredActivityNode;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.TemplateSignature;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.Variable;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.ActivityOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ActivityImpl#getNodes <em>Node</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ActivityImpl#getGroups <em>Group</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ActivityImpl#getStructuredNodes <em>Structured Node</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ActivityImpl#getVariables <em>Variable</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ActivityImpl#isReadOnly <em>Is Read Only</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ActivityImpl#getEdges <em>Edge</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ActivityImpl#getPartitions <em>Partition</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ActivityImpl#isSingleExecution <em>Is Single Execution</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActivityImpl
		extends BehaviorImpl
		implements Activity {

	/**
	 * The cached value of the '{@link #getNodes() <em>Node</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodes()
	 * @generated
	 * @ordered
	 */
	protected EList nodes = null;

	/**
	 * The cached value of the '{@link #getGroups() <em>Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroups()
	 * @generated
	 * @ordered
	 */
	protected EList groups = null;

	/**
	 * The cached value of the '{@link #getVariables() <em>Variable</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariables()
	 * @generated
	 * @ordered
	 */
	protected EList variables = null;

	/**
	 * The default value of the '{@link #isReadOnly() <em>Is Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReadOnly()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_READ_ONLY_EDEFAULT = false;

	/**
	 * The flag representing the value of the '{@link #isReadOnly() <em>Is Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReadOnly()
	 * @generated
	 * @ordered
	 */
	protected static final int IS_READ_ONLY_EFLAG = 1 << 14;

	/**
	 * The cached value of the '{@link #getEdges() <em>Edge</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdges()
	 * @generated
	 * @ordered
	 */
	protected EList edges = null;

	/**
	 * The cached value of the '{@link #getPartitions() <em>Partition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartitions()
	 * @generated
	 * @ordered
	 */
	protected EList partitions = null;

	/**
	 * The default value of the '{@link #isSingleExecution() <em>Is Single Execution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSingleExecution()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_SINGLE_EXECUTION_EDEFAULT = false;

	/**
	 * The flag representing the value of the '{@link #isSingleExecution() <em>Is Single Execution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSingleExecution()
	 * @generated
	 * @ordered
	 */
	protected static final int IS_SINGLE_EXECUTION_EFLAG = 1 << 15;

	/**
	 * The array of subset feature identifiers for the '{@link #getGroups() <em>Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroups()
	 * @generated
	 * @ordered
	 */
	protected static final int[] GROUP_ESUBSETS = new int[]{UMLPackage.ACTIVITY__PARTITION};

	/**
	 * The array of superset feature identifiers for the '{@link #getStructuredNodes() <em>Structured Node</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructuredNodes()
	 * @generated
	 * @ordered
	 */
	protected static final int[] STRUCTURED_NODE_ESUPERSETS = new int[]{
		UMLPackage.ACTIVITY__NODE, UMLPackage.ACTIVITY__GROUP};

	/**
	 * The array of superset feature identifiers for the '{@link #getPartitions() <em>Partition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartitions()
	 * @generated
	 * @ordered
	 */
	protected static final int[] PARTITION_ESUPERSETS = new int[]{UMLPackage.ACTIVITY__GROUP};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.Literals.ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedElements() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			EList ownedElements = (EList) cache.get(eResource, this,
				UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
			if (ownedElements == null) {
				cache.put(eResource, this,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT,
					ownedElements = new DerivedUnionEObjectEList(Element.class,
						this, UMLPackage.ACTIVITY__OWNED_ELEMENT,
						OWNED_ELEMENT_ESUBSETS));
			}
			return ownedElements;
		}
		return new DerivedUnionEObjectEList(Element.class, this,
			UMLPackage.ACTIVITY__OWNED_ELEMENT, OWNED_ELEMENT_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedMembers() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			EList ownedMembers = (EList) cache.get(eResource, this,
				UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
			if (ownedMembers == null) {
				cache.put(eResource, this,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER,
					ownedMembers = new DerivedUnionEObjectEList(
						NamedElement.class, this,
						UMLPackage.ACTIVITY__OWNED_MEMBER,
						OWNED_MEMBER_ESUBSETS));
			}
			return ownedMembers;
		}
		return new DerivedUnionEObjectEList(NamedElement.class, this,
			UMLPackage.ACTIVITY__OWNED_MEMBER, OWNED_MEMBER_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getGroups() {
		if (groups == null) {
			groups = new SubsetSupersetEObjectContainmentWithInverseEList.Resolving(
				ActivityGroup.class, this, UMLPackage.ACTIVITY__GROUP, null,
				GROUP_ESUBSETS, UMLPackage.ACTIVITY_GROUP__IN_ACTIVITY);
		}
		return groups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityGroup createGroup(EClass eClass) {
		ActivityGroup newGroup = (ActivityGroup) create(eClass);
		getGroups().add(newGroup);
		return newGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getNodes() {
		if (nodes == null) {
			nodes = new EObjectContainmentWithInverseEList.Resolving(
				ActivityNode.class, this, UMLPackage.ACTIVITY__NODE,
				UMLPackage.ACTIVITY_NODE__ACTIVITY);
		}
		return nodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNode createNode(String name, EClass eClass) {
		ActivityNode newNode = (ActivityNode) create(eClass);
		if (name != null)
			newNode.setName(name);
		getNodes().add(newNode);
		return newNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNode getNode(String name) {
		return getNode(name, false, null, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNode getNode(String name, boolean ignoreCase, EClass eClass,
			boolean createOnDemand) {
		nodeLoop : for (Iterator i = getNodes().iterator(); i.hasNext();) {
			ActivityNode node = (ActivityNode) i.next();
			if (eClass != null && !eClass.isInstance(node))
				continue nodeLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(node.getName())
				: name.equals(node.getName())))
				continue nodeLoop;
			return node;
		}
		return createOnDemand && eClass != null
			? createNode(name, eClass)
			: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReadOnly() {
		return (eFlags & IS_READ_ONLY_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsReadOnly(boolean newIsReadOnly) {
		boolean oldIsReadOnly = (eFlags & IS_READ_ONLY_EFLAG) != 0;
		if (newIsReadOnly)
			eFlags |= IS_READ_ONLY_EFLAG;
		else
			eFlags &= ~IS_READ_ONLY_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.ACTIVITY__IS_READ_ONLY, oldIsReadOnly, newIsReadOnly));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSingleExecution() {
		return (eFlags & IS_SINGLE_EXECUTION_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsSingleExecution(boolean newIsSingleExecution) {
		boolean oldIsSingleExecution = (eFlags & IS_SINGLE_EXECUTION_EFLAG) != 0;
		if (newIsSingleExecution)
			eFlags |= IS_SINGLE_EXECUTION_EFLAG;
		else
			eFlags &= ~IS_SINGLE_EXECUTION_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.ACTIVITY__IS_SINGLE_EXECUTION, oldIsSingleExecution,
				newIsSingleExecution));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList getStructuredNodes() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			EList structuredNodes = (EList) cache.get(eResource, this,
				UMLPackage.Literals.ACTIVITY__STRUCTURED_NODE);
			if (structuredNodes == null) {
				cache.put(eResource, this,
					UMLPackage.Literals.ACTIVITY__STRUCTURED_NODE,
					structuredNodes = new DerivedEObjectEList(
						StructuredActivityNode.class, this,
						UMLPackage.ACTIVITY__STRUCTURED_NODE,
						STRUCTURED_NODE_ESUPERSETS));
			}
			return structuredNodes;
		}
		return new DerivedEObjectEList(StructuredActivityNode.class, this,
			UMLPackage.ACTIVITY__STRUCTURED_NODE, STRUCTURED_NODE_ESUPERSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredActivityNode getStructuredNode(String name) {
		return getStructuredNode(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredActivityNode getStructuredNode(String name,
			boolean ignoreCase, EClass eClass) {
		structuredNodeLoop : for (Iterator i = getStructuredNodes().iterator(); i
			.hasNext();) {
			StructuredActivityNode structuredNode = (StructuredActivityNode) i
				.next();
			if (eClass != null && !eClass.isInstance(structuredNode))
				continue structuredNodeLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(structuredNode.getName())
				: name.equals(structuredNode.getName())))
				continue structuredNodeLoop;
			return structuredNode;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getVariables() {
		if (variables == null) {
			variables = new EObjectContainmentWithInverseEList.Resolving(
				Variable.class, this, UMLPackage.ACTIVITY__VARIABLE,
				UMLPackage.VARIABLE__ACTIVITY_SCOPE);
		}
		return variables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable createVariable(String name, Type type) {
		Variable newVariable = (Variable) create(UMLPackage.Literals.VARIABLE);
		if (name != null)
			newVariable.setName(name);
		if (type != null)
			newVariable.setType(type);
		getVariables().add(newVariable);
		return newVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getVariable(String name, Type type) {
		return getVariable(name, type, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getVariable(String name, Type type, boolean ignoreCase,
			boolean createOnDemand) {
		variableLoop : for (Iterator i = getVariables().iterator(); i.hasNext();) {
			Variable variable = (Variable) i.next();
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(variable.getName())
				: name.equals(variable.getName())))
				continue variableLoop;
			if (type != null && !type.equals(variable.getType()))
				continue variableLoop;
			return variable;
		}
		return createOnDemand
			? createVariable(name, type)
			: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getEdges() {
		if (edges == null) {
			edges = new EObjectContainmentWithInverseEList.Resolving(
				ActivityEdge.class, this, UMLPackage.ACTIVITY__EDGE,
				UMLPackage.ACTIVITY_EDGE__ACTIVITY);
		}
		return edges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityEdge createEdge(String name, EClass eClass) {
		ActivityEdge newEdge = (ActivityEdge) create(eClass);
		if (name != null)
			newEdge.setName(name);
		getEdges().add(newEdge);
		return newEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityEdge getEdge(String name) {
		return getEdge(name, false, null, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityEdge getEdge(String name, boolean ignoreCase, EClass eClass,
			boolean createOnDemand) {
		edgeLoop : for (Iterator i = getEdges().iterator(); i.hasNext();) {
			ActivityEdge edge = (ActivityEdge) i.next();
			if (eClass != null && !eClass.isInstance(edge))
				continue edgeLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(edge.getName())
				: name.equals(edge.getName())))
				continue edgeLoop;
			return edge;
		}
		return createOnDemand && eClass != null
			? createEdge(name, eClass)
			: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getPartitions() {
		if (partitions == null) {
			partitions = new SubsetSupersetEObjectResolvingEList(
				ActivityPartition.class, this, UMLPackage.ACTIVITY__PARTITION,
				PARTITION_ESUPERSETS, null);
		}
		return partitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityPartition createPartition(String name) {
		ActivityPartition newPartition = (ActivityPartition) create(UMLPackage.Literals.ACTIVITY_PARTITION);
		if (name != null)
			newPartition.setName(name);
		getPartitions().add(newPartition);
		return newPartition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityPartition getPartition(String name) {
		return getPartition(name, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityPartition getPartition(String name, boolean ignoreCase,
			boolean createOnDemand) {
		partitionLoop : for (Iterator i = getPartitions().iterator(); i
			.hasNext();) {
			ActivityPartition partition = (ActivityPartition) i.next();
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(partition.getName())
				: name.equals(partition.getName())))
				continue partitionLoop;
			return partition;
		}
		return createOnDemand
			? createPartition(name)
			: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNoSupergroups(DiagnosticChain diagnostics,
			Map context) {
		return ActivityOperations.validateNoSupergroups(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivityParameterNode(DiagnosticChain diagnostics,
			Map context) {
		return ActivityOperations.validateActivityParameterNode(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAutonomous(DiagnosticChain diagnostics, Map context) {
		return ActivityOperations
			.validateAutonomous(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.ACTIVITY__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.ACTIVITY__CLIENT_DEPENDENCY :
				return ((InternalEList) getClientDependencies()).basicAdd(
					otherEnd, msgs);
			case UMLPackage.ACTIVITY__ELEMENT_IMPORT :
				return ((InternalEList) getElementImports()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.ACTIVITY__PACKAGE_IMPORT :
				return ((InternalEList) getPackageImports()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.ACTIVITY__OWNED_RULE :
				return ((InternalEList) getOwnedRules()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.ACTIVITY__OWNING_TEMPLATE_PARAMETER :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningTemplateParameter(
					(TemplateParameter) otherEnd, msgs);
			case UMLPackage.ACTIVITY__TEMPLATE_PARAMETER :
				if (templateParameter != null)
					msgs = ((InternalEObject) templateParameter)
						.eInverseRemove(this,
							UMLPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT,
							TemplateParameter.class, msgs);
				return basicSetTemplateParameter((TemplateParameter) otherEnd,
					msgs);
			case UMLPackage.ACTIVITY__TEMPLATE_BINDING :
				return ((InternalEList) getTemplateBindings()).basicAdd(
					otherEnd, msgs);
			case UMLPackage.ACTIVITY__OWNED_TEMPLATE_SIGNATURE :
				if (ownedTemplateSignature != null)
					msgs = ((InternalEObject) ownedTemplateSignature)
						.eInverseRemove(this, EOPPOSITE_FEATURE_BASE
							- UMLPackage.ACTIVITY__OWNED_TEMPLATE_SIGNATURE,
							null, msgs);
				return basicSetOwnedTemplateSignature(
					(TemplateSignature) otherEnd, msgs);
			case UMLPackage.ACTIVITY__GENERALIZATION :
				return ((InternalEList) getGeneralizations()).basicAdd(
					otherEnd, msgs);
			case UMLPackage.ACTIVITY__POWERTYPE_EXTENT :
				return ((InternalEList) getPowertypeExtents()).basicAdd(
					otherEnd, msgs);
			case UMLPackage.ACTIVITY__SUBSTITUTION :
				return ((InternalEList) getSubstitutions()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.ACTIVITY__USE_CASE :
				return ((InternalEList) getUseCases()).basicAdd(otherEnd, msgs);
			case UMLPackage.ACTIVITY__INTERFACE_REALIZATION :
				return ((InternalEList) getInterfaceRealizations()).basicAdd(
					otherEnd, msgs);
			case UMLPackage.ACTIVITY__OWNED_OPERATION :
				return ((InternalEList) getOwnedOperations()).basicAdd(
					otherEnd, msgs);
			case UMLPackage.ACTIVITY__SPECIFICATION :
				if (specification != null)
					msgs = ((InternalEObject) specification).eInverseRemove(
						this, UMLPackage.BEHAVIORAL_FEATURE__METHOD,
						BehavioralFeature.class, msgs);
				return basicSetSpecification((BehavioralFeature) otherEnd, msgs);
			case UMLPackage.ACTIVITY__VARIABLE :
				return ((InternalEList) getVariables())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.ACTIVITY__NODE :
				return ((InternalEList) getNodes()).basicAdd(otherEnd, msgs);
			case UMLPackage.ACTIVITY__EDGE :
				return ((InternalEList) getEdges()).basicAdd(otherEnd, msgs);
			case UMLPackage.ACTIVITY__GROUP :
				return ((InternalEList) getGroups()).basicAdd(otherEnd, msgs);
		}
		return eDynamicInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.ACTIVITY__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.ACTIVITY__OWNED_COMMENT :
				return ((InternalEList) getOwnedComments()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.ACTIVITY__CLIENT_DEPENDENCY :
				return ((InternalEList) getClientDependencies()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.ACTIVITY__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.ACTIVITY__ELEMENT_IMPORT :
				return ((InternalEList) getElementImports()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.ACTIVITY__PACKAGE_IMPORT :
				return ((InternalEList) getPackageImports()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.ACTIVITY__OWNED_RULE :
				return ((InternalEList) getOwnedRules()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.ACTIVITY__OWNING_TEMPLATE_PARAMETER :
				return basicSetOwningTemplateParameter(null, msgs);
			case UMLPackage.ACTIVITY__TEMPLATE_PARAMETER :
				return basicSetTemplateParameter(null, msgs);
			case UMLPackage.ACTIVITY__TEMPLATE_BINDING :
				return ((InternalEList) getTemplateBindings()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.ACTIVITY__OWNED_TEMPLATE_SIGNATURE :
				return basicSetOwnedTemplateSignature(null, msgs);
			case UMLPackage.ACTIVITY__GENERALIZATION :
				return ((InternalEList) getGeneralizations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.ACTIVITY__POWERTYPE_EXTENT :
				return ((InternalEList) getPowertypeExtents()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.ACTIVITY__SUBSTITUTION :
				return ((InternalEList) getSubstitutions()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.ACTIVITY__COLLABORATION_USE :
				return ((InternalEList) getCollaborationUses()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.ACTIVITY__OWNED_USE_CASE :
				return ((InternalEList) getOwnedUseCases()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.ACTIVITY__USE_CASE :
				return ((InternalEList) getUseCases()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.ACTIVITY__OWNED_ATTRIBUTE :
				return ((InternalEList) getOwnedAttributes()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.ACTIVITY__OWNED_CONNECTOR :
				return ((InternalEList) getOwnedConnectors()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.ACTIVITY__OWNED_BEHAVIOR :
				return ((InternalEList) getOwnedBehaviors()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.ACTIVITY__INTERFACE_REALIZATION :
				return ((InternalEList) getInterfaceRealizations())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.ACTIVITY__OWNED_TRIGGER :
				return ((InternalEList) getOwnedTriggers()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.ACTIVITY__NESTED_CLASSIFIER :
				return ((InternalEList) getNestedClassifiers()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.ACTIVITY__OWNED_OPERATION :
				return ((InternalEList) getOwnedOperations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.ACTIVITY__OWNED_RECEPTION :
				return ((InternalEList) getOwnedReceptions()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.ACTIVITY__OWNED_PARAMETER :
				return ((InternalEList) getOwnedParameters()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.ACTIVITY__PRECONDITION :
				return ((InternalEList) getPreconditions()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.ACTIVITY__POSTCONDITION :
				return ((InternalEList) getPostconditions()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.ACTIVITY__OWNED_PARAMETER_SET :
				return ((InternalEList) getOwnedParameterSets()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.ACTIVITY__SPECIFICATION :
				return basicSetSpecification(null, msgs);
			case UMLPackage.ACTIVITY__VARIABLE :
				return ((InternalEList) getVariables()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.ACTIVITY__NODE :
				return ((InternalEList) getNodes()).basicRemove(otherEnd, msgs);
			case UMLPackage.ACTIVITY__EDGE :
				return ((InternalEList) getEdges()).basicRemove(otherEnd, msgs);
			case UMLPackage.ACTIVITY__GROUP :
				return ((InternalEList) getGroups())
					.basicRemove(otherEnd, msgs);
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
			case UMLPackage.ACTIVITY__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.ACTIVITY__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.ACTIVITY__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.ACTIVITY__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.ACTIVITY__NAME :
				return getName();
			case UMLPackage.ACTIVITY__VISIBILITY :
				return getVisibility();
			case UMLPackage.ACTIVITY__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.ACTIVITY__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.ACTIVITY__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.ACTIVITY__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.ACTIVITY__ELEMENT_IMPORT :
				return getElementImports();
			case UMLPackage.ACTIVITY__PACKAGE_IMPORT :
				return getPackageImports();
			case UMLPackage.ACTIVITY__OWNED_RULE :
				return getOwnedRules();
			case UMLPackage.ACTIVITY__MEMBER :
				return getMembers();
			case UMLPackage.ACTIVITY__IMPORTED_MEMBER :
				return getImportedMembers();
			case UMLPackage.ACTIVITY__OWNED_MEMBER :
				return getOwnedMembers();
			case UMLPackage.ACTIVITY__IS_LEAF :
				return isLeaf()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.ACTIVITY__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.ACTIVITY__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.ACTIVITY__OWNING_TEMPLATE_PARAMETER :
				if (resolve)
					return getOwningTemplateParameter();
				return basicGetOwningTemplateParameter();
			case UMLPackage.ACTIVITY__TEMPLATE_PARAMETER :
				if (resolve)
					return getTemplateParameter();
				return basicGetTemplateParameter();
			case UMLPackage.ACTIVITY__PACKAGE :
				if (resolve)
					return getPackage();
				return basicGetPackage();
			case UMLPackage.ACTIVITY__TEMPLATE_BINDING :
				return getTemplateBindings();
			case UMLPackage.ACTIVITY__OWNED_TEMPLATE_SIGNATURE :
				if (resolve)
					return getOwnedTemplateSignature();
				return basicGetOwnedTemplateSignature();
			case UMLPackage.ACTIVITY__IS_ABSTRACT :
				return isAbstract()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.ACTIVITY__GENERALIZATION :
				return getGeneralizations();
			case UMLPackage.ACTIVITY__POWERTYPE_EXTENT :
				return getPowertypeExtents();
			case UMLPackage.ACTIVITY__FEATURE :
				return getFeatures();
			case UMLPackage.ACTIVITY__INHERITED_MEMBER :
				return getInheritedMembers();
			case UMLPackage.ACTIVITY__REDEFINED_CLASSIFIER :
				return getRedefinedClassifiers();
			case UMLPackage.ACTIVITY__GENERAL :
				return getGenerals();
			case UMLPackage.ACTIVITY__SUBSTITUTION :
				return getSubstitutions();
			case UMLPackage.ACTIVITY__ATTRIBUTE :
				return getAttributes();
			case UMLPackage.ACTIVITY__REPRESENTATION :
				if (resolve)
					return getRepresentation();
				return basicGetRepresentation();
			case UMLPackage.ACTIVITY__COLLABORATION_USE :
				return getCollaborationUses();
			case UMLPackage.ACTIVITY__OWNED_USE_CASE :
				return getOwnedUseCases();
			case UMLPackage.ACTIVITY__USE_CASE :
				return getUseCases();
			case UMLPackage.ACTIVITY__OWNED_ATTRIBUTE :
				return getOwnedAttributes();
			case UMLPackage.ACTIVITY__PART :
				return getParts();
			case UMLPackage.ACTIVITY__ROLE :
				return getRoles();
			case UMLPackage.ACTIVITY__OWNED_CONNECTOR :
				return getOwnedConnectors();
			case UMLPackage.ACTIVITY__OWNED_PORT :
				return getOwnedPorts();
			case UMLPackage.ACTIVITY__OWNED_BEHAVIOR :
				return getOwnedBehaviors();
			case UMLPackage.ACTIVITY__CLASSIFIER_BEHAVIOR :
				if (resolve)
					return getClassifierBehavior();
				return basicGetClassifierBehavior();
			case UMLPackage.ACTIVITY__INTERFACE_REALIZATION :
				return getInterfaceRealizations();
			case UMLPackage.ACTIVITY__OWNED_TRIGGER :
				return getOwnedTriggers();
			case UMLPackage.ACTIVITY__NESTED_CLASSIFIER :
				return getNestedClassifiers();
			case UMLPackage.ACTIVITY__OWNED_OPERATION :
				return getOwnedOperations();
			case UMLPackage.ACTIVITY__SUPER_CLASS :
				return getSuperClasses();
			case UMLPackage.ACTIVITY__IS_ACTIVE :
				return isActive()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.ACTIVITY__OWNED_RECEPTION :
				return getOwnedReceptions();
			case UMLPackage.ACTIVITY__EXTENSION :
				return getExtensions();
			case UMLPackage.ACTIVITY__IS_REENTRANT :
				return isReentrant()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.ACTIVITY__REDEFINED_BEHAVIOR :
				return getRedefinedBehaviors();
			case UMLPackage.ACTIVITY__OWNED_PARAMETER :
				return getOwnedParameters();
			case UMLPackage.ACTIVITY__CONTEXT :
				if (resolve)
					return getContext();
				return basicGetContext();
			case UMLPackage.ACTIVITY__PRECONDITION :
				return getPreconditions();
			case UMLPackage.ACTIVITY__POSTCONDITION :
				return getPostconditions();
			case UMLPackage.ACTIVITY__OWNED_PARAMETER_SET :
				return getOwnedParameterSets();
			case UMLPackage.ACTIVITY__SPECIFICATION :
				if (resolve)
					return getSpecification();
				return basicGetSpecification();
			case UMLPackage.ACTIVITY__STRUCTURED_NODE :
				return getStructuredNodes();
			case UMLPackage.ACTIVITY__VARIABLE :
				return getVariables();
			case UMLPackage.ACTIVITY__NODE :
				return getNodes();
			case UMLPackage.ACTIVITY__IS_READ_ONLY :
				return isReadOnly()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.ACTIVITY__EDGE :
				return getEdges();
			case UMLPackage.ACTIVITY__PARTITION :
				return getPartitions();
			case UMLPackage.ACTIVITY__IS_SINGLE_EXECUTION :
				return isSingleExecution()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.ACTIVITY__GROUP :
				return getGroups();
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
			case UMLPackage.ACTIVITY__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.ACTIVITY__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.ACTIVITY__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.ACTIVITY__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.ACTIVITY__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.ACTIVITY__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.ACTIVITY__ELEMENT_IMPORT :
				getElementImports().clear();
				getElementImports().addAll((Collection) newValue);
				return;
			case UMLPackage.ACTIVITY__PACKAGE_IMPORT :
				getPackageImports().clear();
				getPackageImports().addAll((Collection) newValue);
				return;
			case UMLPackage.ACTIVITY__OWNED_RULE :
				getOwnedRules().clear();
				getOwnedRules().addAll((Collection) newValue);
				return;
			case UMLPackage.ACTIVITY__IS_LEAF :
				setIsLeaf(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.ACTIVITY__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.ACTIVITY__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.ACTIVITY__PACKAGE :
				setPackage((org.eclipse.uml2.uml.Package) newValue);
				return;
			case UMLPackage.ACTIVITY__TEMPLATE_BINDING :
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection) newValue);
				return;
			case UMLPackage.ACTIVITY__OWNED_TEMPLATE_SIGNATURE :
				setOwnedTemplateSignature((TemplateSignature) newValue);
				return;
			case UMLPackage.ACTIVITY__IS_ABSTRACT :
				setIsAbstract(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.ACTIVITY__GENERALIZATION :
				getGeneralizations().clear();
				getGeneralizations().addAll((Collection) newValue);
				return;
			case UMLPackage.ACTIVITY__POWERTYPE_EXTENT :
				getPowertypeExtents().clear();
				getPowertypeExtents().addAll((Collection) newValue);
				return;
			case UMLPackage.ACTIVITY__REDEFINED_CLASSIFIER :
				getRedefinedClassifiers().clear();
				getRedefinedClassifiers().addAll((Collection) newValue);
				return;
			case UMLPackage.ACTIVITY__GENERAL :
				getGenerals().clear();
				getGenerals().addAll((Collection) newValue);
				return;
			case UMLPackage.ACTIVITY__SUBSTITUTION :
				getSubstitutions().clear();
				getSubstitutions().addAll((Collection) newValue);
				return;
			case UMLPackage.ACTIVITY__REPRESENTATION :
				setRepresentation((CollaborationUse) newValue);
				return;
			case UMLPackage.ACTIVITY__COLLABORATION_USE :
				getCollaborationUses().clear();
				getCollaborationUses().addAll((Collection) newValue);
				return;
			case UMLPackage.ACTIVITY__OWNED_USE_CASE :
				getOwnedUseCases().clear();
				getOwnedUseCases().addAll((Collection) newValue);
				return;
			case UMLPackage.ACTIVITY__USE_CASE :
				getUseCases().clear();
				getUseCases().addAll((Collection) newValue);
				return;
			case UMLPackage.ACTIVITY__OWNED_ATTRIBUTE :
				getOwnedAttributes().clear();
				getOwnedAttributes().addAll((Collection) newValue);
				return;
			case UMLPackage.ACTIVITY__OWNED_CONNECTOR :
				getOwnedConnectors().clear();
				getOwnedConnectors().addAll((Collection) newValue);
				return;
			case UMLPackage.ACTIVITY__OWNED_PORT :
				getOwnedPorts().clear();
				getOwnedPorts().addAll((Collection) newValue);
				return;
			case UMLPackage.ACTIVITY__OWNED_BEHAVIOR :
				getOwnedBehaviors().clear();
				getOwnedBehaviors().addAll((Collection) newValue);
				return;
			case UMLPackage.ACTIVITY__CLASSIFIER_BEHAVIOR :
				setClassifierBehavior((Behavior) newValue);
				return;
			case UMLPackage.ACTIVITY__INTERFACE_REALIZATION :
				getInterfaceRealizations().clear();
				getInterfaceRealizations().addAll((Collection) newValue);
				return;
			case UMLPackage.ACTIVITY__OWNED_TRIGGER :
				getOwnedTriggers().clear();
				getOwnedTriggers().addAll((Collection) newValue);
				return;
			case UMLPackage.ACTIVITY__NESTED_CLASSIFIER :
				getNestedClassifiers().clear();
				getNestedClassifiers().addAll((Collection) newValue);
				return;
			case UMLPackage.ACTIVITY__OWNED_OPERATION :
				getOwnedOperations().clear();
				getOwnedOperations().addAll((Collection) newValue);
				return;
			case UMLPackage.ACTIVITY__SUPER_CLASS :
				getSuperClasses().clear();
				getSuperClasses().addAll((Collection) newValue);
				return;
			case UMLPackage.ACTIVITY__IS_ACTIVE :
				setIsActive(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.ACTIVITY__OWNED_RECEPTION :
				getOwnedReceptions().clear();
				getOwnedReceptions().addAll((Collection) newValue);
				return;
			case UMLPackage.ACTIVITY__IS_REENTRANT :
				setIsReentrant(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.ACTIVITY__REDEFINED_BEHAVIOR :
				getRedefinedBehaviors().clear();
				getRedefinedBehaviors().addAll((Collection) newValue);
				return;
			case UMLPackage.ACTIVITY__OWNED_PARAMETER :
				getOwnedParameters().clear();
				getOwnedParameters().addAll((Collection) newValue);
				return;
			case UMLPackage.ACTIVITY__PRECONDITION :
				getPreconditions().clear();
				getPreconditions().addAll((Collection) newValue);
				return;
			case UMLPackage.ACTIVITY__POSTCONDITION :
				getPostconditions().clear();
				getPostconditions().addAll((Collection) newValue);
				return;
			case UMLPackage.ACTIVITY__OWNED_PARAMETER_SET :
				getOwnedParameterSets().clear();
				getOwnedParameterSets().addAll((Collection) newValue);
				return;
			case UMLPackage.ACTIVITY__SPECIFICATION :
				setSpecification((BehavioralFeature) newValue);
				return;
			case UMLPackage.ACTIVITY__VARIABLE :
				getVariables().clear();
				getVariables().addAll((Collection) newValue);
				return;
			case UMLPackage.ACTIVITY__NODE :
				getNodes().clear();
				getNodes().addAll((Collection) newValue);
				return;
			case UMLPackage.ACTIVITY__IS_READ_ONLY :
				setIsReadOnly(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.ACTIVITY__EDGE :
				getEdges().clear();
				getEdges().addAll((Collection) newValue);
				return;
			case UMLPackage.ACTIVITY__PARTITION :
				getPartitions().clear();
				getPartitions().addAll((Collection) newValue);
				return;
			case UMLPackage.ACTIVITY__IS_SINGLE_EXECUTION :
				setIsSingleExecution(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.ACTIVITY__GROUP :
				getGroups().clear();
				getGroups().addAll((Collection) newValue);
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
			case UMLPackage.ACTIVITY__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.ACTIVITY__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.ACTIVITY__NAME :
				unsetName();
				return;
			case UMLPackage.ACTIVITY__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.ACTIVITY__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.ACTIVITY__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.ACTIVITY__ELEMENT_IMPORT :
				getElementImports().clear();
				return;
			case UMLPackage.ACTIVITY__PACKAGE_IMPORT :
				getPackageImports().clear();
				return;
			case UMLPackage.ACTIVITY__OWNED_RULE :
				getOwnedRules().clear();
				return;
			case UMLPackage.ACTIVITY__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.ACTIVITY__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.ACTIVITY__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.ACTIVITY__PACKAGE :
				setPackage((org.eclipse.uml2.uml.Package) null);
				return;
			case UMLPackage.ACTIVITY__TEMPLATE_BINDING :
				getTemplateBindings().clear();
				return;
			case UMLPackage.ACTIVITY__OWNED_TEMPLATE_SIGNATURE :
				setOwnedTemplateSignature((TemplateSignature) null);
				return;
			case UMLPackage.ACTIVITY__IS_ABSTRACT :
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case UMLPackage.ACTIVITY__GENERALIZATION :
				getGeneralizations().clear();
				return;
			case UMLPackage.ACTIVITY__POWERTYPE_EXTENT :
				getPowertypeExtents().clear();
				return;
			case UMLPackage.ACTIVITY__REDEFINED_CLASSIFIER :
				getRedefinedClassifiers().clear();
				return;
			case UMLPackage.ACTIVITY__GENERAL :
				getGenerals().clear();
				return;
			case UMLPackage.ACTIVITY__SUBSTITUTION :
				getSubstitutions().clear();
				return;
			case UMLPackage.ACTIVITY__REPRESENTATION :
				setRepresentation((CollaborationUse) null);
				return;
			case UMLPackage.ACTIVITY__COLLABORATION_USE :
				getCollaborationUses().clear();
				return;
			case UMLPackage.ACTIVITY__OWNED_USE_CASE :
				getOwnedUseCases().clear();
				return;
			case UMLPackage.ACTIVITY__USE_CASE :
				getUseCases().clear();
				return;
			case UMLPackage.ACTIVITY__OWNED_ATTRIBUTE :
				getOwnedAttributes().clear();
				return;
			case UMLPackage.ACTIVITY__OWNED_CONNECTOR :
				getOwnedConnectors().clear();
				return;
			case UMLPackage.ACTIVITY__OWNED_PORT :
				getOwnedPorts().clear();
				return;
			case UMLPackage.ACTIVITY__OWNED_BEHAVIOR :
				getOwnedBehaviors().clear();
				return;
			case UMLPackage.ACTIVITY__CLASSIFIER_BEHAVIOR :
				setClassifierBehavior((Behavior) null);
				return;
			case UMLPackage.ACTIVITY__INTERFACE_REALIZATION :
				getInterfaceRealizations().clear();
				return;
			case UMLPackage.ACTIVITY__OWNED_TRIGGER :
				getOwnedTriggers().clear();
				return;
			case UMLPackage.ACTIVITY__NESTED_CLASSIFIER :
				getNestedClassifiers().clear();
				return;
			case UMLPackage.ACTIVITY__OWNED_OPERATION :
				getOwnedOperations().clear();
				return;
			case UMLPackage.ACTIVITY__SUPER_CLASS :
				getSuperClasses().clear();
				return;
			case UMLPackage.ACTIVITY__IS_ACTIVE :
				setIsActive(IS_ACTIVE_EDEFAULT);
				return;
			case UMLPackage.ACTIVITY__OWNED_RECEPTION :
				getOwnedReceptions().clear();
				return;
			case UMLPackage.ACTIVITY__IS_REENTRANT :
				setIsReentrant(IS_REENTRANT_EDEFAULT);
				return;
			case UMLPackage.ACTIVITY__REDEFINED_BEHAVIOR :
				getRedefinedBehaviors().clear();
				return;
			case UMLPackage.ACTIVITY__OWNED_PARAMETER :
				getOwnedParameters().clear();
				return;
			case UMLPackage.ACTIVITY__PRECONDITION :
				getPreconditions().clear();
				return;
			case UMLPackage.ACTIVITY__POSTCONDITION :
				getPostconditions().clear();
				return;
			case UMLPackage.ACTIVITY__OWNED_PARAMETER_SET :
				getOwnedParameterSets().clear();
				return;
			case UMLPackage.ACTIVITY__SPECIFICATION :
				setSpecification((BehavioralFeature) null);
				return;
			case UMLPackage.ACTIVITY__VARIABLE :
				getVariables().clear();
				return;
			case UMLPackage.ACTIVITY__NODE :
				getNodes().clear();
				return;
			case UMLPackage.ACTIVITY__IS_READ_ONLY :
				setIsReadOnly(IS_READ_ONLY_EDEFAULT);
				return;
			case UMLPackage.ACTIVITY__EDGE :
				getEdges().clear();
				return;
			case UMLPackage.ACTIVITY__PARTITION :
				getPartitions().clear();
				return;
			case UMLPackage.ACTIVITY__IS_SINGLE_EXECUTION :
				setIsSingleExecution(IS_SINGLE_EXECUTION_EDEFAULT);
				return;
			case UMLPackage.ACTIVITY__GROUP :
				getGroups().clear();
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
			case UMLPackage.ACTIVITY__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.ACTIVITY__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.ACTIVITY__OWNER :
				return isSetOwner();
			case UMLPackage.ACTIVITY__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.ACTIVITY__NAME :
				return isSetName();
			case UMLPackage.ACTIVITY__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.ACTIVITY__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.ACTIVITY__CLIENT_DEPENDENCY :
				return clientDependencies != null
					&& !clientDependencies.isEmpty();
			case UMLPackage.ACTIVITY__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.ACTIVITY__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.ACTIVITY__ELEMENT_IMPORT :
				return elementImports != null && !elementImports.isEmpty();
			case UMLPackage.ACTIVITY__PACKAGE_IMPORT :
				return packageImports != null && !packageImports.isEmpty();
			case UMLPackage.ACTIVITY__OWNED_RULE :
				return ownedRules != null && !ownedRules.isEmpty();
			case UMLPackage.ACTIVITY__MEMBER :
				return isSetMembers();
			case UMLPackage.ACTIVITY__IMPORTED_MEMBER :
				return !getImportedMembers().isEmpty();
			case UMLPackage.ACTIVITY__OWNED_MEMBER :
				return isSetOwnedMembers();
			case UMLPackage.ACTIVITY__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.ACTIVITY__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.ACTIVITY__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.ACTIVITY__OWNING_TEMPLATE_PARAMETER :
				return basicGetOwningTemplateParameter() != null;
			case UMLPackage.ACTIVITY__TEMPLATE_PARAMETER :
				return isSetTemplateParameter();
			case UMLPackage.ACTIVITY__PACKAGE :
				return basicGetPackage() != null;
			case UMLPackage.ACTIVITY__TEMPLATE_BINDING :
				return templateBindings != null && !templateBindings.isEmpty();
			case UMLPackage.ACTIVITY__OWNED_TEMPLATE_SIGNATURE :
				return isSetOwnedTemplateSignature();
			case UMLPackage.ACTIVITY__IS_ABSTRACT :
				return isSetIsAbstract();
			case UMLPackage.ACTIVITY__GENERALIZATION :
				return generalizations != null && !generalizations.isEmpty();
			case UMLPackage.ACTIVITY__POWERTYPE_EXTENT :
				return powertypeExtents != null && !powertypeExtents.isEmpty();
			case UMLPackage.ACTIVITY__FEATURE :
				return isSetFeatures();
			case UMLPackage.ACTIVITY__INHERITED_MEMBER :
				return !getInheritedMembers().isEmpty();
			case UMLPackage.ACTIVITY__REDEFINED_CLASSIFIER :
				return redefinedClassifiers != null
					&& !redefinedClassifiers.isEmpty();
			case UMLPackage.ACTIVITY__GENERAL :
				return isSetGenerals();
			case UMLPackage.ACTIVITY__SUBSTITUTION :
				return substitutions != null && !substitutions.isEmpty();
			case UMLPackage.ACTIVITY__ATTRIBUTE :
				return isSetAttributes();
			case UMLPackage.ACTIVITY__REPRESENTATION :
				return representation != null;
			case UMLPackage.ACTIVITY__COLLABORATION_USE :
				return collaborationUses != null
					&& !collaborationUses.isEmpty();
			case UMLPackage.ACTIVITY__OWNED_USE_CASE :
				return ownedUseCases != null && !ownedUseCases.isEmpty();
			case UMLPackage.ACTIVITY__USE_CASE :
				return useCases != null && !useCases.isEmpty();
			case UMLPackage.ACTIVITY__OWNED_ATTRIBUTE :
				return isSetOwnedAttributes();
			case UMLPackage.ACTIVITY__PART :
				return !getParts().isEmpty();
			case UMLPackage.ACTIVITY__ROLE :
				return isSetRoles();
			case UMLPackage.ACTIVITY__OWNED_CONNECTOR :
				return ownedConnectors != null && !ownedConnectors.isEmpty();
			case UMLPackage.ACTIVITY__OWNED_PORT :
				return !getOwnedPorts().isEmpty();
			case UMLPackage.ACTIVITY__OWNED_BEHAVIOR :
				return ownedBehaviors != null && !ownedBehaviors.isEmpty();
			case UMLPackage.ACTIVITY__CLASSIFIER_BEHAVIOR :
				return classifierBehavior != null;
			case UMLPackage.ACTIVITY__INTERFACE_REALIZATION :
				return interfaceRealizations != null
					&& !interfaceRealizations.isEmpty();
			case UMLPackage.ACTIVITY__OWNED_TRIGGER :
				return ownedTriggers != null && !ownedTriggers.isEmpty();
			case UMLPackage.ACTIVITY__NESTED_CLASSIFIER :
				return nestedClassifiers != null
					&& !nestedClassifiers.isEmpty();
			case UMLPackage.ACTIVITY__OWNED_OPERATION :
				return ownedOperations != null && !ownedOperations.isEmpty();
			case UMLPackage.ACTIVITY__SUPER_CLASS :
				return isSetSuperClasses();
			case UMLPackage.ACTIVITY__IS_ACTIVE :
				return ((eFlags & IS_ACTIVE_EFLAG) != 0) != IS_ACTIVE_EDEFAULT;
			case UMLPackage.ACTIVITY__OWNED_RECEPTION :
				return ownedReceptions != null && !ownedReceptions.isEmpty();
			case UMLPackage.ACTIVITY__EXTENSION :
				return !getExtensions().isEmpty();
			case UMLPackage.ACTIVITY__IS_REENTRANT :
				return ((eFlags & IS_REENTRANT_EFLAG) != 0) != IS_REENTRANT_EDEFAULT;
			case UMLPackage.ACTIVITY__REDEFINED_BEHAVIOR :
				return redefinedBehaviors != null
					&& !redefinedBehaviors.isEmpty();
			case UMLPackage.ACTIVITY__OWNED_PARAMETER :
				return ownedParameters != null && !ownedParameters.isEmpty();
			case UMLPackage.ACTIVITY__CONTEXT :
				return basicGetContext() != null;
			case UMLPackage.ACTIVITY__PRECONDITION :
				return preconditions != null && !preconditions.isEmpty();
			case UMLPackage.ACTIVITY__POSTCONDITION :
				return postconditions != null && !postconditions.isEmpty();
			case UMLPackage.ACTIVITY__OWNED_PARAMETER_SET :
				return ownedParameterSets != null
					&& !ownedParameterSets.isEmpty();
			case UMLPackage.ACTIVITY__SPECIFICATION :
				return specification != null;
			case UMLPackage.ACTIVITY__STRUCTURED_NODE :
				return !getStructuredNodes().isEmpty();
			case UMLPackage.ACTIVITY__VARIABLE :
				return variables != null && !variables.isEmpty();
			case UMLPackage.ACTIVITY__NODE :
				return nodes != null && !nodes.isEmpty();
			case UMLPackage.ACTIVITY__IS_READ_ONLY :
				return ((eFlags & IS_READ_ONLY_EFLAG) != 0) != IS_READ_ONLY_EDEFAULT;
			case UMLPackage.ACTIVITY__EDGE :
				return edges != null && !edges.isEmpty();
			case UMLPackage.ACTIVITY__PARTITION :
				return partitions != null && !partitions.isEmpty();
			case UMLPackage.ACTIVITY__IS_SINGLE_EXECUTION :
				return ((eFlags & IS_SINGLE_EXECUTION_EFLAG) != 0) != IS_SINGLE_EXECUTION_EDEFAULT;
			case UMLPackage.ACTIVITY__GROUP :
				return groups != null && !groups.isEmpty();
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isReadOnly: "); //$NON-NLS-1$
		result.append((eFlags & IS_READ_ONLY_EFLAG) != 0);
		result.append(", isSingleExecution: "); //$NON-NLS-1$
		result.append((eFlags & IS_SINGLE_EXECUTION_EFLAG) != 0);
		result.append(')');
		return result.toString();
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getOwnedMembers() <em>Owned Member</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedMembers()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_MEMBER_ESUBSETS = new int[]{
		UMLPackage.ACTIVITY__OWNED_RULE, UMLPackage.ACTIVITY__OWNED_USE_CASE,
		UMLPackage.ACTIVITY__OWNED_ATTRIBUTE,
		UMLPackage.ACTIVITY__OWNED_CONNECTOR,
		UMLPackage.ACTIVITY__OWNED_BEHAVIOR,
		UMLPackage.ACTIVITY__OWNED_TRIGGER,
		UMLPackage.ACTIVITY__NESTED_CLASSIFIER,
		UMLPackage.ACTIVITY__OWNED_OPERATION,
		UMLPackage.ACTIVITY__OWNED_RECEPTION,
		UMLPackage.ACTIVITY__OWNED_PARAMETER,
		UMLPackage.ACTIVITY__OWNED_PARAMETER_SET, UMLPackage.ACTIVITY__VARIABLE};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements() || eIsSet(UMLPackage.ACTIVITY__NODE)
			|| eIsSet(UMLPackage.ACTIVITY__EDGE)
			|| eIsSet(UMLPackage.ACTIVITY__GROUP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedMembers() {
		return super.isSetOwnedMembers()
			|| eIsSet(UMLPackage.ACTIVITY__VARIABLE);
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
		UMLPackage.ACTIVITY__OWNED_COMMENT,
		UMLPackage.ACTIVITY__NAME_EXPRESSION,
		UMLPackage.ACTIVITY__ELEMENT_IMPORT,
		UMLPackage.ACTIVITY__PACKAGE_IMPORT, UMLPackage.ACTIVITY__OWNED_MEMBER,
		UMLPackage.ACTIVITY__TEMPLATE_BINDING,
		UMLPackage.ACTIVITY__OWNED_TEMPLATE_SIGNATURE,
		UMLPackage.ACTIVITY__GENERALIZATION, UMLPackage.ACTIVITY__SUBSTITUTION,
		UMLPackage.ACTIVITY__COLLABORATION_USE,
		UMLPackage.ACTIVITY__INTERFACE_REALIZATION, UMLPackage.ACTIVITY__NODE,
		UMLPackage.ACTIVITY__EDGE, UMLPackage.ACTIVITY__GROUP};

} //ActivityImpl
