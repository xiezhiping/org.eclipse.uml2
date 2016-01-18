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

//import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;
import org.eclipse.uml2.common.util.SubsetSupersetEObjectContainmentEList;
import org.eclipse.uml2.common.util.SubsetSupersetEObjectResolvingEList;

import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.ActivityEdge;
import org.eclipse.uml2.uml.ActivityGroup;
import org.eclipse.uml2.uml.ActivityNode;
import org.eclipse.uml2.uml.ActivityPartition;
import org.eclipse.uml2.uml.AggregationKind;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.BehavioralFeature;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.CollaborationUse;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Connector;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.ElementImport;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.GeneralizationSet;
import org.eclipse.uml2.uml.InterfaceRealization;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.PackageImport;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.ParameterSet;
import org.eclipse.uml2.uml.ParameterableElement;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Reception;
import org.eclipse.uml2.uml.RedefinableElement;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.StructuredActivityNode;
import org.eclipse.uml2.uml.Substitution;
import org.eclipse.uml2.uml.TemplateBinding;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.TemplateSignature;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.UseCase;
import org.eclipse.uml2.uml.Variable;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.ActivityOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ActivityImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ActivityImpl#getOwnedMembers <em>Owned Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ActivityImpl#getOwnedGroups <em>Owned Group</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ActivityImpl#getEdges <em>Edge</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ActivityImpl#getNodes <em>Node</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ActivityImpl#getVariables <em>Variable</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ActivityImpl#getGroups <em>Group</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ActivityImpl#getOwnedNodes <em>Owned Node</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ActivityImpl#isReadOnly <em>Is Read Only</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ActivityImpl#isSingleExecution <em>Is Single Execution</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ActivityImpl#getPartitions <em>Partition</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ActivityImpl#getStructuredNodes <em>Structured Node</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActivityImpl
		extends BehaviorImpl
		implements Activity {

	/**
	 * The cached value of the '{@link #getGroups() <em>Group</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroups()
	 * @generated NOT
	 * @ordered
	 */
	protected EList<ActivityGroup> groups;

	/**
	 * The cached value of the '{@link #getOwnedGroups() <em>Owned Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityGroup> ownedGroups;

	/**
	 * The cached value of the '{@link #getEdges() <em>Edge</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdges()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityEdge> edges;

	/**
	 * The cached value of the '{@link #getVariables() <em>Variable</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> variables;

	/**
	 * The cached value of the '{@link #getNodes() <em>Node</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodes()
	 * @generated NOT
	 * @ordered
	 */
	protected EList<ActivityNode> nodes;

	/**
	 * The cached value of the '{@link #getOwnedNodes() <em>Owned Node</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityNode> ownedNodes;

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
	protected static final int IS_READ_ONLY_EFLAG = 1 << 18;

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
	protected static final int IS_SINGLE_EXECUTION_EFLAG = 1 << 19;

	/**
	 * The cached value of the '{@link #getPartitions() <em>Partition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartitions()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityPartition> partitions;

	/**
	 * The cached value of the '{@link #getStructuredNodes() <em>Structured Node</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructuredNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<StructuredActivityNode> structuredNodes;

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
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.ACTIVITY;
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
						Element.class, this, UMLPackage.ACTIVITY__OWNED_ELEMENT,
						OWNED_ELEMENT_ESUBSETS));
			}
			return ownedElements;
		}
		return new DerivedUnionEObjectEList<Element>(Element.class, this,
			UMLPackage.ACTIVITY__OWNED_ELEMENT, OWNED_ELEMENT_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NamedElement> getOwnedMembers() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			@SuppressWarnings("unchecked")
			EList<NamedElement> ownedMembers = (EList<NamedElement>) cache.get(
				eResource, this, UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
			if (ownedMembers == null) {
				cache.put(eResource, this,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER,
					ownedMembers = new DerivedUnionEObjectEList<NamedElement>(
						NamedElement.class, this,
						UMLPackage.ACTIVITY__OWNED_MEMBER,
						OWNED_MEMBER_ESUBSETS));
			}
			return ownedMembers;
		}
		return new DerivedUnionEObjectEList<NamedElement>(NamedElement.class,
			this, UMLPackage.ACTIVITY__OWNED_MEMBER, OWNED_MEMBER_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<ActivityGroup> getGroups() {
		if (groups == null) {
			groups = new SubsetSupersetEObjectResolvingEList<ActivityGroup>(
				ActivityGroup.class, this, UMLPackage.ACTIVITY__GROUP, null,
				GROUP_ESUBSETS);
		}
		return groups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<ActivityNode> getNodes() {
		if (nodes == null) {
			nodes = new SubsetSupersetEObjectResolvingEList<ActivityNode>(
				ActivityNode.class, this, UMLPackage.ACTIVITY__NODE, null,
				NODE_ESUBSETS);
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
	 * @generated NOT
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
				UMLPackage.ACTIVITY__IS_READ_ONLY, oldIsReadOnly,
				newIsReadOnly));
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
		boolean oldIsSingleExecution = (eFlags
			& IS_SINGLE_EXECUTION_EFLAG) != 0;
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
	public EList<StructuredActivityNode> getStructuredNodes() {
		if (structuredNodes == null) {
			structuredNodes = new SubsetSupersetEObjectContainmentEList.Resolving<StructuredActivityNode>(
				StructuredActivityNode.class, this,
				UMLPackage.ACTIVITY__STRUCTURED_NODE,
				STRUCTURED_NODE_ESUPERSETS, null);
		}
		return structuredNodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredActivityNode createStructuredNode(String name,
			EClass eClass) {
		StructuredActivityNode newStructuredNode = (StructuredActivityNode) create(
			eClass);
		getStructuredNodes().add(newStructuredNode);
		if (name != null)
			newStructuredNode.setName(name);
		return newStructuredNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredActivityNode createStructuredNode(String name) {
		return createStructuredNode(name,
			UMLPackage.Literals.STRUCTURED_ACTIVITY_NODE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getVariables() {
		if (variables == null) {
			variables = new EObjectContainmentWithInverseEList.Resolving<Variable>(
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
		getVariables().add(newVariable);
		if (name != null)
			newVariable.setName(name);
		if (type != null)
			newVariable.setType(type);
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
		variableLoop : for (Variable variable : getVariables()) {
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
	public EList<ActivityEdge> getEdges() {
		if (edges == null) {
			edges = new EObjectContainmentWithInverseEList.Resolving<ActivityEdge>(
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
		getEdges().add(newEdge);
		if (name != null)
			newEdge.setName(name);
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
		edgeLoop : for (ActivityEdge edge : getEdges()) {
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
	public EList<ActivityPartition> getPartitions() {
		if (partitions == null) {
			partitions = new SubsetSupersetEObjectResolvingEList<ActivityPartition>(
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
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.ACTIVITY__EANNOTATIONS :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getEAnnotations())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.ACTIVITY__OWNED_RULE :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getOwnedRules())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.ACTIVITY__ELEMENT_IMPORT :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getElementImports())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.ACTIVITY__PACKAGE_IMPORT :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getPackageImports())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.ACTIVITY__OWNING_TEMPLATE_PARAMETER :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningTemplateParameter(
					(TemplateParameter) otherEnd, msgs);
			case UMLPackage.ACTIVITY__TEMPLATE_PARAMETER :
				if (templateParameter != null)
					msgs = ((InternalEObject) templateParameter).eInverseRemove(
						this,
						UMLPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT,
						TemplateParameter.class, msgs);
				return basicSetTemplateParameter((TemplateParameter) otherEnd,
					msgs);
			case UMLPackage.ACTIVITY__TEMPLATE_BINDING :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getTemplateBindings())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.ACTIVITY__OWNED_TEMPLATE_SIGNATURE :
				if (ownedTemplateSignature != null)
					msgs = ((InternalEObject) ownedTemplateSignature)
						.eInverseRemove(this,
							EOPPOSITE_FEATURE_BASE
								- UMLPackage.ACTIVITY__OWNED_TEMPLATE_SIGNATURE,
							null, msgs);
				return basicSetOwnedTemplateSignature(
					(TemplateSignature) otherEnd, msgs);
			case UMLPackage.ACTIVITY__GENERALIZATION :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getGeneralizations())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.ACTIVITY__POWERTYPE_EXTENT :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getPowertypeExtents())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.ACTIVITY__USE_CASE :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getUseCases())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.ACTIVITY__SUBSTITUTION :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getSubstitutions())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.ACTIVITY__INTERFACE_REALIZATION :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getInterfaceRealizations())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.ACTIVITY__OWNED_OPERATION :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getOwnedOperations())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.ACTIVITY__SPECIFICATION :
				if (specification != null)
					msgs = ((InternalEObject) specification).eInverseRemove(
						this, UMLPackage.BEHAVIORAL_FEATURE__METHOD,
						BehavioralFeature.class, msgs);
				return basicSetSpecification((BehavioralFeature) otherEnd,
					msgs);
			case UMLPackage.ACTIVITY__EDGE :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getEdges())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.ACTIVITY__VARIABLE :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getVariables())
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
			case UMLPackage.ACTIVITY__EANNOTATIONS :
				return ((InternalEList<?>) getEAnnotations())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.ACTIVITY__OWNED_COMMENT :
				return ((InternalEList<?>) getOwnedComments())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.ACTIVITY__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.ACTIVITY__OWNED_RULE :
				return ((InternalEList<?>) getOwnedRules())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.ACTIVITY__ELEMENT_IMPORT :
				return ((InternalEList<?>) getElementImports())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.ACTIVITY__PACKAGE_IMPORT :
				return ((InternalEList<?>) getPackageImports())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.ACTIVITY__OWNING_TEMPLATE_PARAMETER :
				return basicSetOwningTemplateParameter(null, msgs);
			case UMLPackage.ACTIVITY__TEMPLATE_PARAMETER :
				return basicSetTemplateParameter(null, msgs);
			case UMLPackage.ACTIVITY__TEMPLATE_BINDING :
				return ((InternalEList<?>) getTemplateBindings())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.ACTIVITY__OWNED_TEMPLATE_SIGNATURE :
				return basicSetOwnedTemplateSignature(null, msgs);
			case UMLPackage.ACTIVITY__COLLABORATION_USE :
				return ((InternalEList<?>) getCollaborationUses())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.ACTIVITY__GENERALIZATION :
				return ((InternalEList<?>) getGeneralizations())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.ACTIVITY__POWERTYPE_EXTENT :
				return ((InternalEList<?>) getPowertypeExtents())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.ACTIVITY__OWNED_USE_CASE :
				return ((InternalEList<?>) getOwnedUseCases())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.ACTIVITY__USE_CASE :
				return ((InternalEList<?>) getUseCases()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.ACTIVITY__SUBSTITUTION :
				return ((InternalEList<?>) getSubstitutions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.ACTIVITY__OWNED_ATTRIBUTE :
				return ((InternalEList<?>) getOwnedAttributes())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.ACTIVITY__OWNED_CONNECTOR :
				return ((InternalEList<?>) getOwnedConnectors())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.ACTIVITY__INTERFACE_REALIZATION :
				return ((InternalEList<?>) getInterfaceRealizations())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.ACTIVITY__OWNED_BEHAVIOR :
				return ((InternalEList<?>) getOwnedBehaviors())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.ACTIVITY__OWNED_OPERATION :
				return ((InternalEList<?>) getOwnedOperations())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.ACTIVITY__NESTED_CLASSIFIER :
				return ((InternalEList<?>) getNestedClassifiers())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.ACTIVITY__OWNED_RECEPTION :
				return ((InternalEList<?>) getOwnedReceptions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.ACTIVITY__SPECIFICATION :
				return basicSetSpecification(null, msgs);
			case UMLPackage.ACTIVITY__OWNED_PARAMETER :
				return ((InternalEList<?>) getOwnedParameters())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.ACTIVITY__OWNED_PARAMETER_SET :
				return ((InternalEList<?>) getOwnedParameterSets())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.ACTIVITY__OWNED_GROUP :
				return ((InternalEList<?>) getOwnedGroups())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.ACTIVITY__EDGE :
				return ((InternalEList<?>) getEdges()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.ACTIVITY__VARIABLE :
				return ((InternalEList<?>) getVariables()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.ACTIVITY__OWNED_NODE :
				return ((InternalEList<?>) getOwnedNodes())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.ACTIVITY__STRUCTURED_NODE :
				return ((InternalEList<?>) getStructuredNodes())
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
			case UMLPackage.ACTIVITY__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.ACTIVITY__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.ACTIVITY__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.ACTIVITY__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.ACTIVITY__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.ACTIVITY__NAME :
				return getName();
			case UMLPackage.ACTIVITY__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.ACTIVITY__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.ACTIVITY__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.ACTIVITY__VISIBILITY :
				return getVisibility();
			case UMLPackage.ACTIVITY__OWNED_RULE :
				return getOwnedRules();
			case UMLPackage.ACTIVITY__ELEMENT_IMPORT :
				return getElementImports();
			case UMLPackage.ACTIVITY__PACKAGE_IMPORT :
				return getPackageImports();
			case UMLPackage.ACTIVITY__OWNED_MEMBER :
				return getOwnedMembers();
			case UMLPackage.ACTIVITY__IMPORTED_MEMBER :
				return getImportedMembers();
			case UMLPackage.ACTIVITY__MEMBER :
				return getMembers();
			case UMLPackage.ACTIVITY__IS_LEAF :
				return isLeaf();
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
			case UMLPackage.ACTIVITY__FEATURE :
				return getFeatures();
			case UMLPackage.ACTIVITY__ATTRIBUTE :
				return getAttributes();
			case UMLPackage.ACTIVITY__COLLABORATION_USE :
				return getCollaborationUses();
			case UMLPackage.ACTIVITY__GENERAL :
				return getGenerals();
			case UMLPackage.ACTIVITY__GENERALIZATION :
				return getGeneralizations();
			case UMLPackage.ACTIVITY__POWERTYPE_EXTENT :
				return getPowertypeExtents();
			case UMLPackage.ACTIVITY__INHERITED_MEMBER :
				return getInheritedMembers();
			case UMLPackage.ACTIVITY__IS_ABSTRACT :
				return isAbstract();
			case UMLPackage.ACTIVITY__IS_FINAL_SPECIALIZATION :
				return isFinalSpecialization();
			case UMLPackage.ACTIVITY__OWNED_USE_CASE :
				return getOwnedUseCases();
			case UMLPackage.ACTIVITY__USE_CASE :
				return getUseCases();
			case UMLPackage.ACTIVITY__REDEFINED_CLASSIFIER :
				return getRedefinedClassifiers();
			case UMLPackage.ACTIVITY__REPRESENTATION :
				if (resolve)
					return getRepresentation();
				return basicGetRepresentation();
			case UMLPackage.ACTIVITY__SUBSTITUTION :
				return getSubstitutions();
			case UMLPackage.ACTIVITY__OWNED_ATTRIBUTE :
				return getOwnedAttributes();
			case UMLPackage.ACTIVITY__OWNED_CONNECTOR :
				return getOwnedConnectors();
			case UMLPackage.ACTIVITY__PART :
				return getParts();
			case UMLPackage.ACTIVITY__ROLE :
				return getRoles();
			case UMLPackage.ACTIVITY__OWNED_PORT :
				return getOwnedPorts();
			case UMLPackage.ACTIVITY__CLASSIFIER_BEHAVIOR :
				if (resolve)
					return getClassifierBehavior();
				return basicGetClassifierBehavior();
			case UMLPackage.ACTIVITY__INTERFACE_REALIZATION :
				return getInterfaceRealizations();
			case UMLPackage.ACTIVITY__OWNED_BEHAVIOR :
				return getOwnedBehaviors();
			case UMLPackage.ACTIVITY__OWNED_OPERATION :
				return getOwnedOperations();
			case UMLPackage.ACTIVITY__EXTENSION :
				return getExtensions();
			case UMLPackage.ACTIVITY__IS_ACTIVE :
				return isActive();
			case UMLPackage.ACTIVITY__NESTED_CLASSIFIER :
				return getNestedClassifiers();
			case UMLPackage.ACTIVITY__OWNED_RECEPTION :
				return getOwnedReceptions();
			case UMLPackage.ACTIVITY__SUPER_CLASS :
				return getSuperClasses();
			case UMLPackage.ACTIVITY__SPECIFICATION :
				if (resolve)
					return getSpecification();
				return basicGetSpecification();
			case UMLPackage.ACTIVITY__CONTEXT :
				if (resolve)
					return getContext();
				return basicGetContext();
			case UMLPackage.ACTIVITY__IS_REENTRANT :
				return isReentrant();
			case UMLPackage.ACTIVITY__OWNED_PARAMETER :
				return getOwnedParameters();
			case UMLPackage.ACTIVITY__OWNED_PARAMETER_SET :
				return getOwnedParameterSets();
			case UMLPackage.ACTIVITY__POSTCONDITION :
				return getPostconditions();
			case UMLPackage.ACTIVITY__PRECONDITION :
				return getPreconditions();
			case UMLPackage.ACTIVITY__REDEFINED_BEHAVIOR :
				return getRedefinedBehaviors();
			case UMLPackage.ACTIVITY__OWNED_GROUP :
				return getOwnedGroups();
			case UMLPackage.ACTIVITY__EDGE :
				return getEdges();
			case UMLPackage.ACTIVITY__NODE :
				return getNodes();
			case UMLPackage.ACTIVITY__VARIABLE :
				return getVariables();
			case UMLPackage.ACTIVITY__GROUP :
				return getGroups();
			case UMLPackage.ACTIVITY__OWNED_NODE :
				return getOwnedNodes();
			case UMLPackage.ACTIVITY__IS_READ_ONLY :
				return isReadOnly();
			case UMLPackage.ACTIVITY__IS_SINGLE_EXECUTION :
				return isSingleExecution();
			case UMLPackage.ACTIVITY__PARTITION :
				return getPartitions();
			case UMLPackage.ACTIVITY__STRUCTURED_NODE :
				return getStructuredNodes();
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
			case UMLPackage.ACTIVITY__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations()
					.addAll((Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.ACTIVITY__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments()
					.addAll((Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.ACTIVITY__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.ACTIVITY__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.ACTIVITY__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.ACTIVITY__OWNED_RULE :
				getOwnedRules().clear();
				getOwnedRules()
					.addAll((Collection<? extends Constraint>) newValue);
				return;
			case UMLPackage.ACTIVITY__ELEMENT_IMPORT :
				getElementImports().clear();
				getElementImports()
					.addAll((Collection<? extends ElementImport>) newValue);
				return;
			case UMLPackage.ACTIVITY__PACKAGE_IMPORT :
				getPackageImports().clear();
				getPackageImports()
					.addAll((Collection<? extends PackageImport>) newValue);
				return;
			case UMLPackage.ACTIVITY__IS_LEAF :
				setIsLeaf((Boolean) newValue);
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
				getTemplateBindings()
					.addAll((Collection<? extends TemplateBinding>) newValue);
				return;
			case UMLPackage.ACTIVITY__OWNED_TEMPLATE_SIGNATURE :
				setOwnedTemplateSignature((TemplateSignature) newValue);
				return;
			case UMLPackage.ACTIVITY__COLLABORATION_USE :
				getCollaborationUses().clear();
				getCollaborationUses()
					.addAll((Collection<? extends CollaborationUse>) newValue);
				return;
			case UMLPackage.ACTIVITY__GENERAL :
				getGenerals().clear();
				getGenerals()
					.addAll((Collection<? extends Classifier>) newValue);
				return;
			case UMLPackage.ACTIVITY__GENERALIZATION :
				getGeneralizations().clear();
				getGeneralizations()
					.addAll((Collection<? extends Generalization>) newValue);
				return;
			case UMLPackage.ACTIVITY__POWERTYPE_EXTENT :
				getPowertypeExtents().clear();
				getPowertypeExtents()
					.addAll((Collection<? extends GeneralizationSet>) newValue);
				return;
			case UMLPackage.ACTIVITY__IS_ABSTRACT :
				setIsAbstract((Boolean) newValue);
				return;
			case UMLPackage.ACTIVITY__IS_FINAL_SPECIALIZATION :
				setIsFinalSpecialization((Boolean) newValue);
				return;
			case UMLPackage.ACTIVITY__OWNED_USE_CASE :
				getOwnedUseCases().clear();
				getOwnedUseCases()
					.addAll((Collection<? extends UseCase>) newValue);
				return;
			case UMLPackage.ACTIVITY__USE_CASE :
				getUseCases().clear();
				getUseCases().addAll((Collection<? extends UseCase>) newValue);
				return;
			case UMLPackage.ACTIVITY__REDEFINED_CLASSIFIER :
				getRedefinedClassifiers().clear();
				getRedefinedClassifiers()
					.addAll((Collection<? extends Classifier>) newValue);
				return;
			case UMLPackage.ACTIVITY__REPRESENTATION :
				setRepresentation((CollaborationUse) newValue);
				return;
			case UMLPackage.ACTIVITY__SUBSTITUTION :
				getSubstitutions().clear();
				getSubstitutions()
					.addAll((Collection<? extends Substitution>) newValue);
				return;
			case UMLPackage.ACTIVITY__OWNED_ATTRIBUTE :
				getOwnedAttributes().clear();
				getOwnedAttributes()
					.addAll((Collection<? extends Property>) newValue);
				return;
			case UMLPackage.ACTIVITY__OWNED_CONNECTOR :
				getOwnedConnectors().clear();
				getOwnedConnectors()
					.addAll((Collection<? extends Connector>) newValue);
				return;
			case UMLPackage.ACTIVITY__CLASSIFIER_BEHAVIOR :
				setClassifierBehavior((Behavior) newValue);
				return;
			case UMLPackage.ACTIVITY__INTERFACE_REALIZATION :
				getInterfaceRealizations().clear();
				getInterfaceRealizations().addAll(
					(Collection<? extends InterfaceRealization>) newValue);
				return;
			case UMLPackage.ACTIVITY__OWNED_BEHAVIOR :
				getOwnedBehaviors().clear();
				getOwnedBehaviors()
					.addAll((Collection<? extends Behavior>) newValue);
				return;
			case UMLPackage.ACTIVITY__OWNED_OPERATION :
				getOwnedOperations().clear();
				getOwnedOperations()
					.addAll((Collection<? extends Operation>) newValue);
				return;
			case UMLPackage.ACTIVITY__IS_ACTIVE :
				setIsActive((Boolean) newValue);
				return;
			case UMLPackage.ACTIVITY__NESTED_CLASSIFIER :
				getNestedClassifiers().clear();
				getNestedClassifiers()
					.addAll((Collection<? extends Classifier>) newValue);
				return;
			case UMLPackage.ACTIVITY__OWNED_RECEPTION :
				getOwnedReceptions().clear();
				getOwnedReceptions()
					.addAll((Collection<? extends Reception>) newValue);
				return;
			case UMLPackage.ACTIVITY__SUPER_CLASS :
				getSuperClasses().clear();
				getSuperClasses().addAll(
					(Collection<? extends org.eclipse.uml2.uml.Class>) newValue);
				return;
			case UMLPackage.ACTIVITY__SPECIFICATION :
				setSpecification((BehavioralFeature) newValue);
				return;
			case UMLPackage.ACTIVITY__IS_REENTRANT :
				setIsReentrant((Boolean) newValue);
				return;
			case UMLPackage.ACTIVITY__OWNED_PARAMETER :
				getOwnedParameters().clear();
				getOwnedParameters()
					.addAll((Collection<? extends Parameter>) newValue);
				return;
			case UMLPackage.ACTIVITY__OWNED_PARAMETER_SET :
				getOwnedParameterSets().clear();
				getOwnedParameterSets()
					.addAll((Collection<? extends ParameterSet>) newValue);
				return;
			case UMLPackage.ACTIVITY__POSTCONDITION :
				getPostconditions().clear();
				getPostconditions()
					.addAll((Collection<? extends Constraint>) newValue);
				return;
			case UMLPackage.ACTIVITY__PRECONDITION :
				getPreconditions().clear();
				getPreconditions()
					.addAll((Collection<? extends Constraint>) newValue);
				return;
			case UMLPackage.ACTIVITY__REDEFINED_BEHAVIOR :
				getRedefinedBehaviors().clear();
				getRedefinedBehaviors()
					.addAll((Collection<? extends Behavior>) newValue);
				return;
			case UMLPackage.ACTIVITY__OWNED_GROUP :
				getOwnedGroups().clear();
				getOwnedGroups()
					.addAll((Collection<? extends ActivityGroup>) newValue);
				return;
			case UMLPackage.ACTIVITY__EDGE :
				getEdges().clear();
				getEdges()
					.addAll((Collection<? extends ActivityEdge>) newValue);
				return;
			case UMLPackage.ACTIVITY__NODE :
				getNodes().clear();
				getNodes()
					.addAll((Collection<? extends ActivityNode>) newValue);
				return;
			case UMLPackage.ACTIVITY__VARIABLE :
				getVariables().clear();
				getVariables()
					.addAll((Collection<? extends Variable>) newValue);
				return;
			case UMLPackage.ACTIVITY__GROUP :
				getGroups().clear();
				getGroups()
					.addAll((Collection<? extends ActivityGroup>) newValue);
				return;
			case UMLPackage.ACTIVITY__OWNED_NODE :
				getOwnedNodes().clear();
				getOwnedNodes()
					.addAll((Collection<? extends ActivityNode>) newValue);
				return;
			case UMLPackage.ACTIVITY__IS_READ_ONLY :
				setIsReadOnly((Boolean) newValue);
				return;
			case UMLPackage.ACTIVITY__IS_SINGLE_EXECUTION :
				setIsSingleExecution((Boolean) newValue);
				return;
			case UMLPackage.ACTIVITY__PARTITION :
				getPartitions().clear();
				getPartitions()
					.addAll((Collection<? extends ActivityPartition>) newValue);
				return;
			case UMLPackage.ACTIVITY__STRUCTURED_NODE :
				getStructuredNodes().clear();
				getStructuredNodes().addAll(
					(Collection<? extends StructuredActivityNode>) newValue);
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
			case UMLPackage.ACTIVITY__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.ACTIVITY__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.ACTIVITY__NAME :
				unsetName();
				return;
			case UMLPackage.ACTIVITY__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.ACTIVITY__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.ACTIVITY__OWNED_RULE :
				getOwnedRules().clear();
				return;
			case UMLPackage.ACTIVITY__ELEMENT_IMPORT :
				getElementImports().clear();
				return;
			case UMLPackage.ACTIVITY__PACKAGE_IMPORT :
				getPackageImports().clear();
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
			case UMLPackage.ACTIVITY__COLLABORATION_USE :
				getCollaborationUses().clear();
				return;
			case UMLPackage.ACTIVITY__GENERAL :
				getGenerals().clear();
				return;
			case UMLPackage.ACTIVITY__GENERALIZATION :
				getGeneralizations().clear();
				return;
			case UMLPackage.ACTIVITY__POWERTYPE_EXTENT :
				getPowertypeExtents().clear();
				return;
			case UMLPackage.ACTIVITY__IS_ABSTRACT :
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case UMLPackage.ACTIVITY__IS_FINAL_SPECIALIZATION :
				setIsFinalSpecialization(IS_FINAL_SPECIALIZATION_EDEFAULT);
				return;
			case UMLPackage.ACTIVITY__OWNED_USE_CASE :
				getOwnedUseCases().clear();
				return;
			case UMLPackage.ACTIVITY__USE_CASE :
				getUseCases().clear();
				return;
			case UMLPackage.ACTIVITY__REDEFINED_CLASSIFIER :
				getRedefinedClassifiers().clear();
				return;
			case UMLPackage.ACTIVITY__REPRESENTATION :
				setRepresentation((CollaborationUse) null);
				return;
			case UMLPackage.ACTIVITY__SUBSTITUTION :
				getSubstitutions().clear();
				return;
			case UMLPackage.ACTIVITY__OWNED_ATTRIBUTE :
				getOwnedAttributes().clear();
				return;
			case UMLPackage.ACTIVITY__OWNED_CONNECTOR :
				getOwnedConnectors().clear();
				return;
			case UMLPackage.ACTIVITY__CLASSIFIER_BEHAVIOR :
				setClassifierBehavior((Behavior) null);
				return;
			case UMLPackage.ACTIVITY__INTERFACE_REALIZATION :
				getInterfaceRealizations().clear();
				return;
			case UMLPackage.ACTIVITY__OWNED_BEHAVIOR :
				getOwnedBehaviors().clear();
				return;
			case UMLPackage.ACTIVITY__OWNED_OPERATION :
				getOwnedOperations().clear();
				return;
			case UMLPackage.ACTIVITY__IS_ACTIVE :
				setIsActive(IS_ACTIVE_EDEFAULT);
				return;
			case UMLPackage.ACTIVITY__NESTED_CLASSIFIER :
				getNestedClassifiers().clear();
				return;
			case UMLPackage.ACTIVITY__OWNED_RECEPTION :
				getOwnedReceptions().clear();
				return;
			case UMLPackage.ACTIVITY__SUPER_CLASS :
				getSuperClasses().clear();
				return;
			case UMLPackage.ACTIVITY__SPECIFICATION :
				setSpecification((BehavioralFeature) null);
				return;
			case UMLPackage.ACTIVITY__IS_REENTRANT :
				unsetIsReentrant();
				return;
			case UMLPackage.ACTIVITY__OWNED_PARAMETER :
				getOwnedParameters().clear();
				return;
			case UMLPackage.ACTIVITY__OWNED_PARAMETER_SET :
				getOwnedParameterSets().clear();
				return;
			case UMLPackage.ACTIVITY__POSTCONDITION :
				getPostconditions().clear();
				return;
			case UMLPackage.ACTIVITY__PRECONDITION :
				getPreconditions().clear();
				return;
			case UMLPackage.ACTIVITY__REDEFINED_BEHAVIOR :
				getRedefinedBehaviors().clear();
				return;
			case UMLPackage.ACTIVITY__OWNED_GROUP :
				getOwnedGroups().clear();
				return;
			case UMLPackage.ACTIVITY__EDGE :
				getEdges().clear();
				return;
			case UMLPackage.ACTIVITY__NODE :
				getNodes().clear();
				return;
			case UMLPackage.ACTIVITY__VARIABLE :
				getVariables().clear();
				return;
			case UMLPackage.ACTIVITY__GROUP :
				getGroups().clear();
				return;
			case UMLPackage.ACTIVITY__OWNED_NODE :
				getOwnedNodes().clear();
				return;
			case UMLPackage.ACTIVITY__IS_READ_ONLY :
				setIsReadOnly(IS_READ_ONLY_EDEFAULT);
				return;
			case UMLPackage.ACTIVITY__IS_SINGLE_EXECUTION :
				setIsSingleExecution(IS_SINGLE_EXECUTION_EDEFAULT);
				return;
			case UMLPackage.ACTIVITY__PARTITION :
				getPartitions().clear();
				return;
			case UMLPackage.ACTIVITY__STRUCTURED_NODE :
				getStructuredNodes().clear();
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
			case UMLPackage.ACTIVITY__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.ACTIVITY__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.ACTIVITY__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.ACTIVITY__OWNER :
				return isSetOwner();
			case UMLPackage.ACTIVITY__CLIENT_DEPENDENCY :
				return !getClientDependencies().isEmpty();
			case UMLPackage.ACTIVITY__NAME :
				return isSetName();
			case UMLPackage.ACTIVITY__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.ACTIVITY__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.ACTIVITY__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.ACTIVITY__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.ACTIVITY__OWNED_RULE :
				return ownedRules != null && !ownedRules.isEmpty();
			case UMLPackage.ACTIVITY__ELEMENT_IMPORT :
				return elementImports != null && !elementImports.isEmpty();
			case UMLPackage.ACTIVITY__PACKAGE_IMPORT :
				return packageImports != null && !packageImports.isEmpty();
			case UMLPackage.ACTIVITY__OWNED_MEMBER :
				return isSetOwnedMembers();
			case UMLPackage.ACTIVITY__IMPORTED_MEMBER :
				return !getImportedMembers().isEmpty();
			case UMLPackage.ACTIVITY__MEMBER :
				return isSetMembers();
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
			case UMLPackage.ACTIVITY__FEATURE :
				return isSetFeatures();
			case UMLPackage.ACTIVITY__ATTRIBUTE :
				return isSetAttributes();
			case UMLPackage.ACTIVITY__COLLABORATION_USE :
				return collaborationUses != null
					&& !collaborationUses.isEmpty();
			case UMLPackage.ACTIVITY__GENERAL :
				return isSetGenerals();
			case UMLPackage.ACTIVITY__GENERALIZATION :
				return generalizations != null && !generalizations.isEmpty();
			case UMLPackage.ACTIVITY__POWERTYPE_EXTENT :
				return powertypeExtents != null && !powertypeExtents.isEmpty();
			case UMLPackage.ACTIVITY__INHERITED_MEMBER :
				return !getInheritedMembers().isEmpty();
			case UMLPackage.ACTIVITY__IS_ABSTRACT :
				return isSetIsAbstract();
			case UMLPackage.ACTIVITY__IS_FINAL_SPECIALIZATION :
				return ((eFlags
					& IS_FINAL_SPECIALIZATION_EFLAG) != 0) != IS_FINAL_SPECIALIZATION_EDEFAULT;
			case UMLPackage.ACTIVITY__OWNED_USE_CASE :
				return ownedUseCases != null && !ownedUseCases.isEmpty();
			case UMLPackage.ACTIVITY__USE_CASE :
				return useCases != null && !useCases.isEmpty();
			case UMLPackage.ACTIVITY__REDEFINED_CLASSIFIER :
				return redefinedClassifiers != null
					&& !redefinedClassifiers.isEmpty();
			case UMLPackage.ACTIVITY__REPRESENTATION :
				return representation != null;
			case UMLPackage.ACTIVITY__SUBSTITUTION :
				return substitutions != null && !substitutions.isEmpty();
			case UMLPackage.ACTIVITY__OWNED_ATTRIBUTE :
				return isSetOwnedAttributes();
			case UMLPackage.ACTIVITY__OWNED_CONNECTOR :
				return ownedConnectors != null && !ownedConnectors.isEmpty();
			case UMLPackage.ACTIVITY__PART :
				return !getParts().isEmpty();
			case UMLPackage.ACTIVITY__ROLE :
				return isSetRoles();
			case UMLPackage.ACTIVITY__OWNED_PORT :
				return !getOwnedPorts().isEmpty();
			case UMLPackage.ACTIVITY__CLASSIFIER_BEHAVIOR :
				return classifierBehavior != null;
			case UMLPackage.ACTIVITY__INTERFACE_REALIZATION :
				return interfaceRealizations != null
					&& !interfaceRealizations.isEmpty();
			case UMLPackage.ACTIVITY__OWNED_BEHAVIOR :
				return ownedBehaviors != null && !ownedBehaviors.isEmpty();
			case UMLPackage.ACTIVITY__OWNED_OPERATION :
				return ownedOperations != null && !ownedOperations.isEmpty();
			case UMLPackage.ACTIVITY__EXTENSION :
				return !getExtensions().isEmpty();
			case UMLPackage.ACTIVITY__IS_ACTIVE :
				return ((eFlags & IS_ACTIVE_EFLAG) != 0) != IS_ACTIVE_EDEFAULT;
			case UMLPackage.ACTIVITY__NESTED_CLASSIFIER :
				return nestedClassifiers != null
					&& !nestedClassifiers.isEmpty();
			case UMLPackage.ACTIVITY__OWNED_RECEPTION :
				return ownedReceptions != null && !ownedReceptions.isEmpty();
			case UMLPackage.ACTIVITY__SUPER_CLASS :
				return isSetSuperClasses();
			case UMLPackage.ACTIVITY__SPECIFICATION :
				return specification != null;
			case UMLPackage.ACTIVITY__CONTEXT :
				return basicGetContext() != null;
			case UMLPackage.ACTIVITY__IS_REENTRANT :
				return isSetIsReentrant();
			case UMLPackage.ACTIVITY__OWNED_PARAMETER :
				return ownedParameters != null && !ownedParameters.isEmpty();
			case UMLPackage.ACTIVITY__OWNED_PARAMETER_SET :
				return ownedParameterSets != null
					&& !ownedParameterSets.isEmpty();
			case UMLPackage.ACTIVITY__POSTCONDITION :
				return postconditions != null && !postconditions.isEmpty();
			case UMLPackage.ACTIVITY__PRECONDITION :
				return preconditions != null && !preconditions.isEmpty();
			case UMLPackage.ACTIVITY__REDEFINED_BEHAVIOR :
				return redefinedBehaviors != null
					&& !redefinedBehaviors.isEmpty();
			case UMLPackage.ACTIVITY__OWNED_GROUP :
				return ownedGroups != null && !ownedGroups.isEmpty();
			case UMLPackage.ACTIVITY__EDGE :
				return edges != null && !edges.isEmpty();
			case UMLPackage.ACTIVITY__NODE :
				return !getNodes().isEmpty();
			case UMLPackage.ACTIVITY__VARIABLE :
				return variables != null && !variables.isEmpty();
			case UMLPackage.ACTIVITY__GROUP :
				return !getGroups().isEmpty();
			case UMLPackage.ACTIVITY__OWNED_NODE :
				return ownedNodes != null && !ownedNodes.isEmpty();
			case UMLPackage.ACTIVITY__IS_READ_ONLY :
				return ((eFlags
					& IS_READ_ONLY_EFLAG) != 0) != IS_READ_ONLY_EDEFAULT;
			case UMLPackage.ACTIVITY__IS_SINGLE_EXECUTION :
				return ((eFlags
					& IS_SINGLE_EXECUTION_EFLAG) != 0) != IS_SINGLE_EXECUTION_EDEFAULT;
			case UMLPackage.ACTIVITY__PARTITION :
				return partitions != null && !partitions.isEmpty();
			case UMLPackage.ACTIVITY__STRUCTURED_NODE :
				return structuredNodes != null && !structuredNodes.isEmpty();
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
			case UMLPackage.ACTIVITY___GET_EANNOTATION__STRING :
				return getEAnnotation((String) arguments.get(0));
			case UMLPackage.ACTIVITY___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP :
				return validateHasOwner((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ACTIVITY___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP :
				return validateNotOwnSelf((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ACTIVITY___ADD_KEYWORD__STRING :
				return addKeyword((String) arguments.get(0));
			case UMLPackage.ACTIVITY___APPLY_STEREOTYPE__STEREOTYPE :
				return applyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.ACTIVITY___CREATE_EANNOTATION__STRING :
				return createEAnnotation((String) arguments.get(0));
			case UMLPackage.ACTIVITY___DESTROY :
				destroy();
				return null;
			case UMLPackage.ACTIVITY___GET_KEYWORDS :
				return getKeywords();
			case UMLPackage.ACTIVITY___GET_APPLICABLE_STEREOTYPE__STRING :
				return getApplicableStereotype((String) arguments.get(0));
			case UMLPackage.ACTIVITY___GET_APPLICABLE_STEREOTYPES :
				return getApplicableStereotypes();
			case UMLPackage.ACTIVITY___GET_APPLIED_STEREOTYPE__STRING :
				return getAppliedStereotype((String) arguments.get(0));
			case UMLPackage.ACTIVITY___GET_APPLIED_STEREOTYPES :
				return getAppliedStereotypes();
			case UMLPackage.ACTIVITY___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING :
				return getAppliedSubstereotype((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.ACTIVITY___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE :
				return getAppliedSubstereotypes((Stereotype) arguments.get(0));
			case UMLPackage.ACTIVITY___GET_MODEL :
				return getModel();
			case UMLPackage.ACTIVITY___GET_NEAREST_PACKAGE :
				return getNearestPackage();
			case UMLPackage.ACTIVITY___GET_RELATIONSHIPS :
				return getRelationships();
			case UMLPackage.ACTIVITY___GET_RELATIONSHIPS__ECLASS :
				return getRelationships((EClass) arguments.get(0));
			case UMLPackage.ACTIVITY___GET_REQUIRED_STEREOTYPE__STRING :
				return getRequiredStereotype((String) arguments.get(0));
			case UMLPackage.ACTIVITY___GET_REQUIRED_STEREOTYPES :
				return getRequiredStereotypes();
			case UMLPackage.ACTIVITY___GET_SOURCE_DIRECTED_RELATIONSHIPS :
				return getSourceDirectedRelationships();
			case UMLPackage.ACTIVITY___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS :
				return getSourceDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.ACTIVITY___GET_STEREOTYPE_APPLICATION__STEREOTYPE :
				return getStereotypeApplication((Stereotype) arguments.get(0));
			case UMLPackage.ACTIVITY___GET_STEREOTYPE_APPLICATIONS :
				return getStereotypeApplications();
			case UMLPackage.ACTIVITY___GET_TARGET_DIRECTED_RELATIONSHIPS :
				return getTargetDirectedRelationships();
			case UMLPackage.ACTIVITY___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS :
				return getTargetDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.ACTIVITY___GET_VALUE__STEREOTYPE_STRING :
				return getValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.ACTIVITY___HAS_KEYWORD__STRING :
				return hasKeyword((String) arguments.get(0));
			case UMLPackage.ACTIVITY___HAS_VALUE__STEREOTYPE_STRING :
				return hasValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.ACTIVITY___IS_STEREOTYPE_APPLICABLE__STEREOTYPE :
				return isStereotypeApplicable((Stereotype) arguments.get(0));
			case UMLPackage.ACTIVITY___IS_STEREOTYPE_APPLIED__STEREOTYPE :
				return isStereotypeApplied((Stereotype) arguments.get(0));
			case UMLPackage.ACTIVITY___IS_STEREOTYPE_REQUIRED__STEREOTYPE :
				return isStereotypeRequired((Stereotype) arguments.get(0));
			case UMLPackage.ACTIVITY___REMOVE_KEYWORD__STRING :
				return removeKeyword((String) arguments.get(0));
			case UMLPackage.ACTIVITY___SET_VALUE__STEREOTYPE_STRING_OBJECT :
				setValue((Stereotype) arguments.get(0),
					(String) arguments.get(1), arguments.get(2));
				return null;
			case UMLPackage.ACTIVITY___UNAPPLY_STEREOTYPE__STEREOTYPE :
				return unapplyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.ACTIVITY___ALL_OWNED_ELEMENTS :
				return allOwnedElements();
			case UMLPackage.ACTIVITY___MUST_BE_OWNED :
				return mustBeOwned();
			case UMLPackage.ACTIVITY___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP :
				return validateVisibilityNeedsOwnership(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ACTIVITY___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ACTIVITY___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasNoQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ACTIVITY___CREATE_DEPENDENCY__NAMEDELEMENT :
				return createDependency((NamedElement) arguments.get(0));
			case UMLPackage.ACTIVITY___CREATE_USAGE__NAMEDELEMENT :
				return createUsage((NamedElement) arguments.get(0));
			case UMLPackage.ACTIVITY___GET_LABEL :
				return getLabel();
			case UMLPackage.ACTIVITY___GET_LABEL__BOOLEAN :
				return getLabel((Boolean) arguments.get(0));
			case UMLPackage.ACTIVITY___GET_NAMESPACE :
				return getNamespace();
			case UMLPackage.ACTIVITY___ALL_NAMESPACES :
				return allNamespaces();
			case UMLPackage.ACTIVITY___ALL_OWNING_PACKAGES :
				return allOwningPackages();
			case UMLPackage.ACTIVITY___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE :
				return isDistinguishableFrom((NamedElement) arguments.get(0),
					(Namespace) arguments.get(1));
			case UMLPackage.ACTIVITY___GET_QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.ACTIVITY___SEPARATOR :
				return separator();
			case UMLPackage.ACTIVITY___GET_CLIENT_DEPENDENCIES :
				return getClientDependencies();
			case UMLPackage.ACTIVITY___VALIDATE_MEMBERS_DISTINGUISHABLE__DIAGNOSTICCHAIN_MAP :
				return validateMembersDistinguishable(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ACTIVITY___VALIDATE_CANNOT_IMPORT_SELF__DIAGNOSTICCHAIN_MAP :
				return validateCannotImportSelf(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ACTIVITY___VALIDATE_CANNOT_IMPORT_OWNED_MEMBERS__DIAGNOSTICCHAIN_MAP :
				return validateCannotImportOwnedMembers(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ACTIVITY___CREATE_ELEMENT_IMPORT__PACKAGEABLEELEMENT_VISIBILITYKIND :
				return createElementImport(
					(PackageableElement) arguments.get(0),
					(VisibilityKind) arguments.get(1));
			case UMLPackage.ACTIVITY___CREATE_PACKAGE_IMPORT__PACKAGE_VISIBILITYKIND :
				return createPackageImport(
					(org.eclipse.uml2.uml.Package) arguments.get(0),
					(VisibilityKind) arguments.get(1));
			case UMLPackage.ACTIVITY___GET_IMPORTED_ELEMENTS :
				return getImportedElements();
			case UMLPackage.ACTIVITY___GET_IMPORTED_PACKAGES :
				return getImportedPackages();
			case UMLPackage.ACTIVITY___GET_OWNED_MEMBERS :
				return getOwnedMembers();
			case UMLPackage.ACTIVITY___EXCLUDE_COLLISIONS__ELIST :
				return excludeCollisions(
					(EList<PackageableElement>) arguments.get(0));
			case UMLPackage.ACTIVITY___GET_NAMES_OF_MEMBER__NAMEDELEMENT :
				return getNamesOfMember((NamedElement) arguments.get(0));
			case UMLPackage.ACTIVITY___IMPORT_MEMBERS__ELIST :
				return importMembers(
					(EList<PackageableElement>) arguments.get(0));
			case UMLPackage.ACTIVITY___GET_IMPORTED_MEMBERS :
				return getImportedMembers();
			case UMLPackage.ACTIVITY___MEMBERS_ARE_DISTINGUISHABLE :
				return membersAreDistinguishable();
			case UMLPackage.ACTIVITY___VALIDATE_REDEFINITION_CONSISTENT__DIAGNOSTICCHAIN_MAP :
				return validateRedefinitionConsistent(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ACTIVITY___VALIDATE_NON_LEAF_REDEFINITION__DIAGNOSTICCHAIN_MAP :
				return validateNonLeafRedefinition(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ACTIVITY___VALIDATE_REDEFINITION_CONTEXT_VALID__DIAGNOSTICCHAIN_MAP :
				return validateRedefinitionContextValid(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ACTIVITY___IS_CONSISTENT_WITH__REDEFINABLEELEMENT :
				return isConsistentWith((RedefinableElement) arguments.get(0));
			case UMLPackage.ACTIVITY___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT :
				return isRedefinitionContextValid(
					(RedefinableElement) arguments.get(0));
			case UMLPackage.ACTIVITY___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT :
				return isCompatibleWith(
					(ParameterableElement) arguments.get(0));
			case UMLPackage.ACTIVITY___IS_TEMPLATE_PARAMETER :
				return isTemplateParameter();
			case UMLPackage.ACTIVITY___VALIDATE_NAMESPACE_NEEDS_VISIBILITY__DIAGNOSTICCHAIN_MAP :
				return validateNamespaceNeedsVisibility(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ACTIVITY___CREATE_ASSOCIATION__BOOLEAN_AGGREGATIONKIND_STRING_INT_INT_TYPE_BOOLEAN_AGGREGATIONKIND_STRING_INT_INT :
				return createAssociation((Boolean) arguments.get(0),
					(AggregationKind) arguments.get(1),
					(String) arguments.get(2), (Integer) arguments.get(3),
					(Integer) arguments.get(4), (Type) arguments.get(5),
					(Boolean) arguments.get(6),
					(AggregationKind) arguments.get(7),
					(String) arguments.get(8), (Integer) arguments.get(9),
					(Integer) arguments.get(10));
			case UMLPackage.ACTIVITY___GET_ASSOCIATIONS :
				return getAssociations();
			case UMLPackage.ACTIVITY___CONFORMS_TO__TYPE :
				return conformsTo((Type) arguments.get(0));
			case UMLPackage.ACTIVITY___IS_TEMPLATE :
				return isTemplate();
			case UMLPackage.ACTIVITY___PARAMETERABLE_ELEMENTS :
				return parameterableElements();
			case UMLPackage.ACTIVITY___VALIDATE_SPECIALIZE_TYPE__DIAGNOSTICCHAIN_MAP :
				return validateSpecializeType(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ACTIVITY___VALIDATE_MAPS_TO_GENERALIZATION_SET__DIAGNOSTICCHAIN_MAP :
				return validateMapsToGeneralizationSet(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ACTIVITY___VALIDATE_NON_FINAL_PARENTS__DIAGNOSTICCHAIN_MAP :
				return validateNonFinalParents(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ACTIVITY___VALIDATE_NO_CYCLES_IN_GENERALIZATION__DIAGNOSTICCHAIN_MAP :
				return validateNoCyclesInGeneralization(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ACTIVITY___GET_ALL_ATTRIBUTES :
				return getAllAttributes();
			case UMLPackage.ACTIVITY___GET_ALL_OPERATIONS :
				return getAllOperations();
			case UMLPackage.ACTIVITY___GET_ALL_USED_INTERFACES :
				return getAllUsedInterfaces();
			case UMLPackage.ACTIVITY___GET_OPERATION__STRING_ELIST_ELIST :
				return getOperation((String) arguments.get(0),
					(EList<String>) arguments.get(1),
					(EList<Type>) arguments.get(2));
			case UMLPackage.ACTIVITY___GET_OPERATION__STRING_ELIST_ELIST_BOOLEAN :
				return getOperation((String) arguments.get(0),
					(EList<String>) arguments.get(1),
					(EList<Type>) arguments.get(2), (Boolean) arguments.get(3));
			case UMLPackage.ACTIVITY___GET_OPERATIONS :
				return getOperations();
			case UMLPackage.ACTIVITY___GET_USED_INTERFACES :
				return getUsedInterfaces();
			case UMLPackage.ACTIVITY___ALL_FEATURES :
				return allFeatures();
			case UMLPackage.ACTIVITY___ALL_PARENTS :
				return allParents();
			case UMLPackage.ACTIVITY___GET_GENERALS :
				return getGenerals();
			case UMLPackage.ACTIVITY___HAS_VISIBILITY_OF__NAMEDELEMENT :
				return hasVisibilityOf((NamedElement) arguments.get(0));
			case UMLPackage.ACTIVITY___INHERIT__ELIST :
				return inherit((EList<NamedElement>) arguments.get(0));
			case UMLPackage.ACTIVITY___INHERITABLE_MEMBERS__CLASSIFIER :
				return inheritableMembers((Classifier) arguments.get(0));
			case UMLPackage.ACTIVITY___GET_INHERITED_MEMBERS :
				return getInheritedMembers();
			case UMLPackage.ACTIVITY___MAY_SPECIALIZE_TYPE__CLASSIFIER :
				return maySpecializeType((Classifier) arguments.get(0));
			case UMLPackage.ACTIVITY___PARENTS :
				return parents();
			case UMLPackage.ACTIVITY___DIRECTLY_REALIZED_INTERFACES :
				return directlyRealizedInterfaces();
			case UMLPackage.ACTIVITY___DIRECTLY_USED_INTERFACES :
				return directlyUsedInterfaces();
			case UMLPackage.ACTIVITY___ALL_REALIZED_INTERFACES :
				return allRealizedInterfaces();
			case UMLPackage.ACTIVITY___ALL_USED_INTERFACES :
				return allUsedInterfaces();
			case UMLPackage.ACTIVITY___IS_SUBSTITUTABLE_FOR__CLASSIFIER :
				return isSubstitutableFor((Classifier) arguments.get(0));
			case UMLPackage.ACTIVITY___ALL_ATTRIBUTES :
				return allAttributes();
			case UMLPackage.ACTIVITY___ALL_SLOTTABLE_FEATURES :
				return allSlottableFeatures();
			case UMLPackage.ACTIVITY___CREATE_OWNED_ATTRIBUTE__STRING_TYPE_INT_INT :
				return createOwnedAttribute((String) arguments.get(0),
					(Type) arguments.get(1), (Integer) arguments.get(2),
					(Integer) arguments.get(3));
			case UMLPackage.ACTIVITY___GET_PARTS :
				return getParts();
			case UMLPackage.ACTIVITY___ALL_ROLES :
				return allRoles();
			case UMLPackage.ACTIVITY___GET_OWNED_PORTS :
				return getOwnedPorts();
			case UMLPackage.ACTIVITY___VALIDATE_CLASS_BEHAVIOR__DIAGNOSTICCHAIN_MAP :
				return validateClassBehavior((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ACTIVITY___GET_ALL_IMPLEMENTED_INTERFACES :
				return getAllImplementedInterfaces();
			case UMLPackage.ACTIVITY___GET_IMPLEMENTED_INTERFACES :
				return getImplementedInterfaces();
			case UMLPackage.ACTIVITY___VALIDATE_PASSIVE_CLASS__DIAGNOSTICCHAIN_MAP :
				return validatePassiveClass((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ACTIVITY___CREATE_OWNED_OPERATION__STRING_ELIST_ELIST_TYPE :
				return createOwnedOperation((String) arguments.get(0),
					(EList<String>) arguments.get(1),
					(EList<Type>) arguments.get(2), (Type) arguments.get(3));
			case UMLPackage.ACTIVITY___IS_METACLASS :
				return isMetaclass();
			case UMLPackage.ACTIVITY___GET_EXTENSIONS :
				return getExtensions();
			case UMLPackage.ACTIVITY___GET_SUPER_CLASSES :
				return getSuperClasses();
			case UMLPackage.ACTIVITY___VALIDATE_MOST_ONE_BEHAVIOR__DIAGNOSTICCHAIN_MAP :
				return validateMostOneBehavior(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ACTIVITY___VALIDATE_PARAMETERS_MATCH__DIAGNOSTICCHAIN_MAP :
				return validateParametersMatch(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ACTIVITY___VALIDATE_FEATURE_OF_CONTEXT_CLASSIFIER__DIAGNOSTICCHAIN_MAP :
				return validateFeatureOfContextClassifier(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ACTIVITY___GET_CONTEXT :
				return getContext();
			case UMLPackage.ACTIVITY___BEHAVIORED_CLASSIFIER__ELEMENT :
				return behavioredClassifier((Element) arguments.get(0));
			case UMLPackage.ACTIVITY___INPUT_PARAMETERS :
				return inputParameters();
			case UMLPackage.ACTIVITY___OUTPUT_PARAMETERS :
				return outputParameters();
			case UMLPackage.ACTIVITY___VALIDATE_MAXIMUM_ONE_PARAMETER_NODE__DIAGNOSTICCHAIN_MAP :
				return validateMaximumOneParameterNode(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ACTIVITY___VALIDATE_MAXIMUM_TWO_PARAMETER_NODES__DIAGNOSTICCHAIN_MAP :
				return validateMaximumTwoParameterNodes(
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
		result.append(" (isReadOnly: "); //$NON-NLS-1$
		result.append((eFlags & IS_READ_ONLY_EFLAG) != 0);
		result.append(", isSingleExecution: "); //$NON-NLS-1$
		result.append((eFlags & IS_SINGLE_EXECUTION_EFLAG) != 0);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements() || eIsSet(UMLPackage.ACTIVITY__EDGE)
			|| eIsSet(UMLPackage.ACTIVITY__NODE)
			|| eIsSet(UMLPackage.ACTIVITY__GROUP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
		UMLPackage.ACTIVITY__COLLABORATION_USE,
		UMLPackage.ACTIVITY__GENERALIZATION, UMLPackage.ACTIVITY__SUBSTITUTION,
		UMLPackage.ACTIVITY__INTERFACE_REALIZATION, UMLPackage.ACTIVITY__EDGE,
		UMLPackage.ACTIVITY__NODE, UMLPackage.ACTIVITY__GROUP};

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
		UMLPackage.ACTIVITY__OWNED_OPERATION,
		UMLPackage.ACTIVITY__NESTED_CLASSIFIER,
		UMLPackage.ACTIVITY__OWNED_RECEPTION,
		UMLPackage.ACTIVITY__OWNED_PARAMETER,
		UMLPackage.ACTIVITY__OWNED_PARAMETER_SET,
		UMLPackage.ACTIVITY__VARIABLE};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<ActivityGroup> getOwnedGroups() {
		if (ownedGroups == null) {
			ownedGroups = new SubsetSupersetEObjectContainmentEList.Resolving<ActivityGroup>(
				ActivityGroup.class, this, UMLPackage.ACTIVITY__OWNED_GROUP,
				OWNED_GROUP_ESUPERSETS, OWNED_GROUP_ESUBSETS);
		}
		return ownedGroups;
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getOwnedGroups() <em>Owned Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedGroups()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_GROUP_ESUBSETS = new int[]{
		UMLPackage.ACTIVITY__PARTITION};

	protected static final int[] OWNED_GROUP_ESUPERSETS = new int[]{
		UMLPackage.ACTIVITY__GROUP};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityGroup createOwnedGroup(String name, EClass eClass) {
		ActivityGroup newOwnedGroup = (ActivityGroup) create(eClass);
		getOwnedGroups().add(newOwnedGroup);
		if (name != null)
			newOwnedGroup.setName(name);
		return newOwnedGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityGroup getOwnedGroup(String name) {
		return getOwnedGroup(name, false, null, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityGroup getOwnedGroup(String name, boolean ignoreCase,
			EClass eClass, boolean createOnDemand) {
		ownedGroupLoop : for (ActivityGroup ownedGroup : getOwnedGroups()) {
			if (eClass != null && !eClass.isInstance(ownedGroup))
				continue ownedGroupLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(ownedGroup.getName())
				: name.equals(ownedGroup.getName())))
				continue ownedGroupLoop;
			return ownedGroup;
		}
		return createOnDemand && eClass != null
			? createOwnedGroup(name, eClass)
			: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityGroup getGroup(String name) {
		return getGroup(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ActivityGroup getGroup(String name, boolean ignoreCase,
			EClass eClass) {
		groupLoop : for (ActivityGroup group : getGroups()) {
			if (eClass != null && !eClass.isInstance(group))
				continue groupLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(group.getName())
				: name.equals(group.getName())))
				continue groupLoop;
			return group;
		}
		return null;
	}

	/**
	 * The array of superset feature identifiers for the '{@link #getStructuredNodes() <em>Structured Node</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructuredNodes()
	 * @generated NOT
	 * @ordered
	 */
	protected static final int[] STRUCTURED_NODE_ESUPERSETS = new int[]{
		UMLPackage.ACTIVITY__GROUP, UMLPackage.ACTIVITY__NODE};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<ActivityNode> getOwnedNodes() {
		if (ownedNodes == null) {
			ownedNodes = new SubsetSupersetEObjectContainmentEList.Resolving<ActivityNode>(
				ActivityNode.class, this, UMLPackage.ACTIVITY__OWNED_NODE,
				OWNED_NODE_ESUPERSETS, null);
		}
		return ownedNodes;
	}

	protected static final int[] OWNED_NODE_ESUPERSETS = new int[]{
		UMLPackage.ACTIVITY__NODE};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNode createOwnedNode(String name, EClass eClass) {
		ActivityNode newOwnedNode = (ActivityNode) create(eClass);
		getOwnedNodes().add(newOwnedNode);
		if (name != null)
			newOwnedNode.setName(name);
		return newOwnedNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNode getOwnedNode(String name) {
		return getOwnedNode(name, false, null, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNode getOwnedNode(String name, boolean ignoreCase,
			EClass eClass, boolean createOnDemand) {
		ownedNodeLoop : for (ActivityNode ownedNode : getOwnedNodes()) {
			if (eClass != null && !eClass.isInstance(ownedNode))
				continue ownedNodeLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(ownedNode.getName())
				: name.equals(ownedNode.getName())))
				continue ownedNodeLoop;
			return ownedNode;
		}
		return createOnDemand && eClass != null
			? createOwnedNode(name, eClass)
			: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredActivityNode getStructuredNode(String name) {
		return getStructuredNode(name, false, null, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public StructuredActivityNode getStructuredNode(String name,
			boolean ignoreCase, EClass eClass) {
		return getStructuredNode(name, ignoreCase, eClass, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredActivityNode getStructuredNode(String name,
			boolean ignoreCase, EClass eClass, boolean createOnDemand) {
		structuredNodeLoop : for (StructuredActivityNode structuredNode : getStructuredNodes()) {
			if (eClass != null && !eClass.isInstance(structuredNode))
				continue structuredNodeLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(structuredNode.getName())
				: name.equals(structuredNode.getName())))
				continue structuredNodeLoop;
			return structuredNode;
		}
		return createOnDemand && eClass != null
			? createStructuredNode(name, eClass)
			: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaximumOneParameterNode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ActivityOperations.validateMaximumOneParameterNode(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaximumTwoParameterNodes(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ActivityOperations.validateMaximumTwoParameterNodes(this,
			diagnostics, context);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getNodes() <em>Node</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodes()
	 * @generated
	 * @ordered
	 */
	protected static final int[] NODE_ESUBSETS = new int[]{
		UMLPackage.ACTIVITY__OWNED_NODE, UMLPackage.ACTIVITY__STRUCTURED_NODE};

	/**
	 * The array of subset feature identifiers for the '{@link #getGroups() <em>Group</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroups()
	 * @generated NOT
	 * @ordered
	 */
	protected static final int[] GROUP_ESUBSETS = new int[]{
		UMLPackage.ACTIVITY__OWNED_GROUP, UMLPackage.ACTIVITY__STRUCTURED_NODE};

	/**
	 * The array of superset feature identifiers for the '{@link #getPartitions() <em>Partition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartitions()
	 * @generated
	 * @ordered
	 */
	protected static final int[] PARTITION_ESUPERSETS = new int[]{
		UMLPackage.ACTIVITY__OWNED_GROUP};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityPartition createPartition(String name) {
		ActivityPartition newPartition = (ActivityPartition) create(
			UMLPackage.Literals.ACTIVITY_PARTITION);
		getPartitions().add(newPartition);
		if (name != null)
			newPartition.setName(name);
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
		partitionLoop : for (ActivityPartition partition : getPartitions()) {
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

} //ActivityImpl
