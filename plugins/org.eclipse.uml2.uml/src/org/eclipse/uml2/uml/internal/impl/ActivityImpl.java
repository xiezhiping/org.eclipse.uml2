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
 * $Id: ActivityImpl.java,v 1.9 2005/12/06 23:21:49 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.DerivedEObjectEList;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;
import org.eclipse.uml2.common.util.SupersetEObjectContainmentWithInverseEList;

import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.ActivityEdge;
import org.eclipse.uml2.uml.ActivityGroup;
import org.eclipse.uml2.uml.ActivityNode;
import org.eclipse.uml2.uml.ActivityPartition;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.BehavioralFeature;
import org.eclipse.uml2.uml.BehavioredClassifier;
import org.eclipse.uml2.uml.CollaborationUse;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.RedefinableTemplateSignature;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.StructuredActivityNode;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.TemplateSignature;
import org.eclipse.uml2.uml.UMLFactory;
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
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ActivityImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ActivityImpl#getOwnedMembers <em>Owned Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ActivityImpl#getGroups <em>Group</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ActivityImpl#getNodes <em>Node</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ActivityImpl#isReadOnly <em>Is Read Only</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ActivityImpl#getPartition <em>Partition</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ActivityImpl#isSingleExecution <em>Is Single Execution</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ActivityImpl#getStructuredNodes <em>Structured Node</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ActivityImpl#getVariables <em>Variable</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ActivityImpl#getEdges <em>Edge</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActivityImpl
		extends BehaviorImpl
		implements Activity {

	/**
	 * A bit field representing the indices of non-primitive feature values.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected int eVirtualIndexBits2 = 0;

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
	public List getOwnedElements() {
		List ownedElement = (List) eVirtualGet(UMLPackage.ACTIVITY__OWNED_ELEMENT);
		if (ownedElement == null) {
			eVirtualSet(UMLPackage.ACTIVITY__OWNED_ELEMENT,
				ownedElement = new DerivedUnionEObjectEList(Element.class,
					this, UMLPackage.ACTIVITY__OWNED_ELEMENT, new int[]{
						UMLPackage.ACTIVITY__OWNED_COMMENT,
						UMLPackage.ACTIVITY__NAME_EXPRESSION,
						UMLPackage.ACTIVITY__ELEMENT_IMPORT,
						UMLPackage.ACTIVITY__PACKAGE_IMPORT,
						UMLPackage.ACTIVITY__OWNED_MEMBER,
						UMLPackage.ACTIVITY__TEMPLATE_BINDING,
						UMLPackage.ACTIVITY__OWNED_TEMPLATE_SIGNATURE,
						UMLPackage.ACTIVITY__GENERALIZATION,
						UMLPackage.ACTIVITY__SUBSTITUTION,
						UMLPackage.ACTIVITY__COLLABORATION_USE,
						UMLPackage.ACTIVITY__OWNED_SIGNATURE,
						UMLPackage.ACTIVITY__INTERFACE_REALIZATION,
						UMLPackage.ACTIVITY__GROUP, UMLPackage.ACTIVITY__NODE,
						UMLPackage.ACTIVITY__EDGE}));
		}
		return ownedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getOwnedMembers() {
		List ownedMember = (List) eVirtualGet(UMLPackage.ACTIVITY__OWNED_MEMBER);
		if (ownedMember == null) {
			eVirtualSet(UMLPackage.ACTIVITY__OWNED_MEMBER,
				ownedMember = new DerivedUnionEObjectEList(NamedElement.class,
					this, UMLPackage.ACTIVITY__OWNED_MEMBER, new int[]{
						UMLPackage.ACTIVITY__OWNED_RULE,
						UMLPackage.ACTIVITY__OWNED_USE_CASE,
						UMLPackage.ACTIVITY__OWNED_ATTRIBUTE,
						UMLPackage.ACTIVITY__OWNED_CONNECTOR,
						UMLPackage.ACTIVITY__OWNED_BEHAVIOR,
						UMLPackage.ACTIVITY__OWNED_TRIGGER,
						UMLPackage.ACTIVITY__OWNED_OPERATION,
						UMLPackage.ACTIVITY__NESTED_CLASSIFIER,
						UMLPackage.ACTIVITY__OWNED_RECEPTION,
						UMLPackage.ACTIVITY__OWNED_PARAMETER,
						UMLPackage.ACTIVITY__OWNED_PARAMETER_SET,
						UMLPackage.ACTIVITY__VARIABLE}));
		}
		return ownedMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getGroups() {
		List group = (List) eVirtualGet(UMLPackage.ACTIVITY__GROUP);
		if (group == null) {
			eVirtualSet(UMLPackage.ACTIVITY__GROUP,
				group = new SupersetEObjectContainmentWithInverseEList(
					ActivityGroup.class, this, UMLPackage.ACTIVITY__GROUP,
					new int[]{UMLPackage.ACTIVITY__PARTITION},
					UMLPackage.ACTIVITY_GROUP__IN_ACTIVITY));
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityGroup createGroup(EClass eClass) {
		ActivityGroup newGroup = (ActivityGroup) eClass.getEPackage()
			.getEFactoryInstance().create(eClass);
		getGroups().add(newGroup);
		return newGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getNodes() {
		List node = (List) eVirtualGet(UMLPackage.ACTIVITY__NODE);
		if (node == null) {
			eVirtualSet(UMLPackage.ACTIVITY__NODE,
				node = new EObjectContainmentWithInverseEList(
					ActivityNode.class, this, UMLPackage.ACTIVITY__NODE,
					UMLPackage.ACTIVITY_NODE__ACTIVITY));
		}
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNode createNode(EClass eClass) {
		ActivityNode newNode = (ActivityNode) eClass.getEPackage()
			.getEFactoryInstance().create(eClass);
		getNodes().add(newNode);
		return newNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNode getNode(String name) {
		for (Iterator i = getNodes().iterator(); i.hasNext();) {
			ActivityNode node = (ActivityNode) i.next();
			if (name.equals(node.getName())) {
				return node;
			}
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
				UMLPackage.ACTIVITY__IS_READ_ONLY, oldIsReadOnly, newIsReadOnly));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityPartition getPartition() {
		return (ActivityPartition) eVirtualGet(UMLPackage.ACTIVITY__PARTITION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartition(ActivityPartition newPartition) {
		if (newPartition != null && !getGroups().contains(newPartition)) {
			getGroups().add(newPartition);
		}
		ActivityPartition partition = newPartition;
		Object oldPartition = eVirtualSet(UMLPackage.ACTIVITY__PARTITION,
			partition);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.ACTIVITY__PARTITION,
				oldPartition == EVIRTUAL_NO_VALUE
					? null
					: oldPartition, partition));

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
	public List getStructuredNodes() {
		List structuredNode = (List) eVirtualGet(UMLPackage.ACTIVITY__STRUCTURED_NODE);
		if (structuredNode == null) {
			eVirtualSet(UMLPackage.ACTIVITY__STRUCTURED_NODE,
				structuredNode = new DerivedEObjectEList(
					StructuredActivityNode.class, this,
					UMLPackage.ACTIVITY__STRUCTURED_NODE, new int[]{
						UMLPackage.ACTIVITY__NODE, UMLPackage.ACTIVITY__GROUP}));
		}
		return structuredNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredActivityNode getStructuredNode(String name) {
		for (Iterator i = getStructuredNodes().iterator(); i.hasNext();) {
			StructuredActivityNode structuredNode = (StructuredActivityNode) i
				.next();
			if (name.equals(structuredNode.getName())) {
				return structuredNode;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getVariables() {
		List variable = (List) eVirtualGet(UMLPackage.ACTIVITY__VARIABLE);
		if (variable == null) {
			eVirtualSet(UMLPackage.ACTIVITY__VARIABLE,
				variable = new EObjectContainmentWithInverseEList(
					Variable.class, this, UMLPackage.ACTIVITY__VARIABLE,
					UMLPackage.VARIABLE__ACTIVITY_SCOPE));
		}
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable createVariable() {
		Variable newVariable = UMLFactory.eINSTANCE.createVariable();
		getVariables().add(newVariable);
		return newVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getVariable(String name) {
		for (Iterator i = getVariables().iterator(); i.hasNext();) {
			Variable variable = (Variable) i.next();
			if (name.equals(variable.getName())) {
				return variable;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getEdges() {
		List edge = (List) eVirtualGet(UMLPackage.ACTIVITY__EDGE);
		if (edge == null) {
			eVirtualSet(UMLPackage.ACTIVITY__EDGE,
				edge = new EObjectContainmentWithInverseEList(
					ActivityEdge.class, this, UMLPackage.ACTIVITY__EDGE,
					UMLPackage.ACTIVITY_EDGE__ACTIVITY));
		}
		return edge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityEdge createEdge(EClass eClass) {
		ActivityEdge newEdge = (ActivityEdge) eClass.getEPackage()
			.getEFactoryInstance().create(eClass);
		getEdges().add(newEdge);
		return newEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityEdge createEdge() {
		ActivityEdge newEdge = UMLFactory.eINSTANCE.createActivityEdge();
		getEdges().add(newEdge);
		return newEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityEdge getEdge(String name) {
		for (Iterator i = getEdges().iterator(); i.hasNext();) {
			ActivityEdge edge = (ActivityEdge) i.next();
			if (name.equals(edge.getName())) {
				return edge;
			}
		}
		return null;
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
			case UMLPackage.ACTIVITY__TEMPLATE_PARAMETER :
				TemplateParameter templateParameter = (TemplateParameter) eVirtualGet(UMLPackage.ACTIVITY__TEMPLATE_PARAMETER);
				if (templateParameter != null)
					msgs = ((InternalEObject) templateParameter)
						.eInverseRemove(this,
							UMLPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT,
							TemplateParameter.class, msgs);
				return basicSetTemplateParameter((TemplateParameter) otherEnd,
					msgs);
			case UMLPackage.ACTIVITY__OWNING_TEMPLATE_PARAMETER :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd,
					UMLPackage.ACTIVITY__OWNING_TEMPLATE_PARAMETER, msgs);
			case UMLPackage.ACTIVITY__TEMPLATE_BINDING :
				return ((InternalEList) getTemplateBindings()).basicAdd(
					otherEnd, msgs);
			case UMLPackage.ACTIVITY__OWNED_TEMPLATE_SIGNATURE :
				TemplateSignature ownedTemplateSignature = (TemplateSignature) eVirtualGet(UMLPackage.ACTIVITY__OWNED_TEMPLATE_SIGNATURE);
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
			case UMLPackage.ACTIVITY__USE_CASE :
				return ((InternalEList) getUseCases()).basicAdd(otherEnd, msgs);
			case UMLPackage.ACTIVITY__SUBSTITUTION :
				return ((InternalEList) getSubstitutions()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.ACTIVITY__OWNED_SIGNATURE :
				RedefinableTemplateSignature ownedSignature = (RedefinableTemplateSignature) eVirtualGet(UMLPackage.ACTIVITY__OWNED_SIGNATURE);
				if (ownedSignature != null)
					msgs = ((InternalEObject) ownedSignature).eInverseRemove(
						this, EOPPOSITE_FEATURE_BASE
							- UMLPackage.ACTIVITY__OWNED_SIGNATURE, null, msgs);
				return basicSetOwnedSignature(
					(RedefinableTemplateSignature) otherEnd, msgs);
			case UMLPackage.ACTIVITY__INTERFACE_REALIZATION :
				return ((InternalEList) getInterfaceRealizations()).basicAdd(
					otherEnd, msgs);
			case UMLPackage.ACTIVITY__OWNED_OPERATION :
				return ((InternalEList) getOwnedOperations()).basicAdd(
					otherEnd, msgs);
			case UMLPackage.ACTIVITY__SPECIFICATION :
				BehavioralFeature specification = (BehavioralFeature) eVirtualGet(UMLPackage.ACTIVITY__SPECIFICATION);
				if (specification != null)
					msgs = ((InternalEObject) specification).eInverseRemove(
						this, UMLPackage.BEHAVIORAL_FEATURE__METHOD,
						BehavioralFeature.class, msgs);
				return basicSetSpecification((BehavioralFeature) otherEnd, msgs);
			case UMLPackage.ACTIVITY__GROUP :
				return ((InternalEList) getGroups()).basicAdd(otherEnd, msgs);
			case UMLPackage.ACTIVITY__VARIABLE :
				return ((InternalEList) getVariables())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.ACTIVITY__NODE :
				return ((InternalEList) getNodes()).basicAdd(otherEnd, msgs);
			case UMLPackage.ACTIVITY__EDGE :
				return ((InternalEList) getEdges()).basicAdd(otherEnd, msgs);
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
			case UMLPackage.ACTIVITY__TEMPLATE_PARAMETER :
				return basicSetTemplateParameter(null, msgs);
			case UMLPackage.ACTIVITY__OWNING_TEMPLATE_PARAMETER :
				return eBasicSetContainer(null,
					UMLPackage.ACTIVITY__OWNING_TEMPLATE_PARAMETER, msgs);
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
			case UMLPackage.ACTIVITY__OWNED_USE_CASE :
				return ((InternalEList) getOwnedUseCases()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.ACTIVITY__USE_CASE :
				return ((InternalEList) getUseCases()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.ACTIVITY__SUBSTITUTION :
				return ((InternalEList) getSubstitutions()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.ACTIVITY__COLLABORATION_USE :
				return ((InternalEList) getCollaborationUses()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.ACTIVITY__OWNED_SIGNATURE :
				return basicSetOwnedSignature(null, msgs);
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
			case UMLPackage.ACTIVITY__OWNED_OPERATION :
				return ((InternalEList) getOwnedOperations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.ACTIVITY__NESTED_CLASSIFIER :
				return ((InternalEList) getNestedClassifiers()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.ACTIVITY__OWNED_RECEPTION :
				return ((InternalEList) getOwnedReceptions()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.ACTIVITY__OWNED_PARAMETER :
				return ((InternalEList) getOwnedParameters()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.ACTIVITY__OWNED_PARAMETER_SET :
				return ((InternalEList) getOwnedParameterSets()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.ACTIVITY__SPECIFICATION :
				return basicSetSpecification(null, msgs);
			case UMLPackage.ACTIVITY__GROUP :
				return ((InternalEList) getGroups())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.ACTIVITY__VARIABLE :
				return ((InternalEList) getVariables()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.ACTIVITY__NODE :
				return ((InternalEList) getNodes()).basicRemove(otherEnd, msgs);
			case UMLPackage.ACTIVITY__EDGE :
				return ((InternalEList) getEdges()).basicRemove(otherEnd, msgs);
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
				return getNameExpression();
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
			case UMLPackage.ACTIVITY__TEMPLATE_PARAMETER :
				if (resolve)
					return getTemplateParameter();
				return basicGetTemplateParameter();
			case UMLPackage.ACTIVITY__OWNING_TEMPLATE_PARAMETER :
				if (resolve)
					return getOwningTemplateParameter();
				return basicGetOwningTemplateParameter();
			case UMLPackage.ACTIVITY__PACKAGE :
				if (resolve)
					return getPackage();
				return basicGetPackage();
			case UMLPackage.ACTIVITY__TEMPLATE_BINDING :
				return getTemplateBindings();
			case UMLPackage.ACTIVITY__OWNED_TEMPLATE_SIGNATURE :
				return getOwnedTemplateSignature();
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
			case UMLPackage.ACTIVITY__OWNED_USE_CASE :
				return getOwnedUseCases();
			case UMLPackage.ACTIVITY__USE_CASE :
				return getUseCases();
			case UMLPackage.ACTIVITY__SUBSTITUTION :
				return getSubstitutions();
			case UMLPackage.ACTIVITY__ATTRIBUTE :
				return getAttributes();
			case UMLPackage.ACTIVITY__REPRESENTATION :
				return getRepresentation();
			case UMLPackage.ACTIVITY__COLLABORATION_USE :
				return getCollaborationUses();
			case UMLPackage.ACTIVITY__OWNED_SIGNATURE :
				return getOwnedSignature();
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
				return getClassifierBehavior();
			case UMLPackage.ACTIVITY__INTERFACE_REALIZATION :
				return getInterfaceRealizations();
			case UMLPackage.ACTIVITY__OWNED_TRIGGER :
				return getOwnedTriggers();
			case UMLPackage.ACTIVITY__OWNED_OPERATION :
				return getOwnedOperations();
			case UMLPackage.ACTIVITY__NESTED_CLASSIFIER :
				return getNestedClassifiers();
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
			case UMLPackage.ACTIVITY__OWNED_PARAMETER_SET :
				return getOwnedParameterSets();
			case UMLPackage.ACTIVITY__SPECIFICATION :
				if (resolve)
					return getSpecification();
				return basicGetSpecification();
			case UMLPackage.ACTIVITY__IS_READ_ONLY :
				return isReadOnly()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.ACTIVITY__PARTITION :
				return getPartition();
			case UMLPackage.ACTIVITY__GROUP :
				return getGroups();
			case UMLPackage.ACTIVITY__IS_SINGLE_EXECUTION :
				return isSingleExecution()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.ACTIVITY__STRUCTURED_NODE :
				return getStructuredNodes();
			case UMLPackage.ACTIVITY__VARIABLE :
				return getVariables();
			case UMLPackage.ACTIVITY__NODE :
				return getNodes();
			case UMLPackage.ACTIVITY__EDGE :
				return getEdges();
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
			case UMLPackage.ACTIVITY__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.ACTIVITY__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) newValue);
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
			case UMLPackage.ACTIVITY__INHERITED_MEMBER :
				getInheritedMembers().clear();
				getInheritedMembers().addAll((Collection) newValue);
				return;
			case UMLPackage.ACTIVITY__REDEFINED_CLASSIFIER :
				getRedefinedClassifiers().clear();
				getRedefinedClassifiers().addAll((Collection) newValue);
				return;
			case UMLPackage.ACTIVITY__GENERAL :
				getGenerals().clear();
				getGenerals().addAll((Collection) newValue);
				return;
			case UMLPackage.ACTIVITY__OWNED_USE_CASE :
				getOwnedUseCases().clear();
				getOwnedUseCases().addAll((Collection) newValue);
				return;
			case UMLPackage.ACTIVITY__USE_CASE :
				getUseCases().clear();
				getUseCases().addAll((Collection) newValue);
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
			case UMLPackage.ACTIVITY__OWNED_SIGNATURE :
				setOwnedSignature((RedefinableTemplateSignature) newValue);
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
			case UMLPackage.ACTIVITY__OWNED_OPERATION :
				getOwnedOperations().clear();
				getOwnedOperations().addAll((Collection) newValue);
				return;
			case UMLPackage.ACTIVITY__NESTED_CLASSIFIER :
				getNestedClassifiers().clear();
				getNestedClassifiers().addAll((Collection) newValue);
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
			case UMLPackage.ACTIVITY__CONTEXT :
				setContext((BehavioredClassifier) newValue);
				return;
			case UMLPackage.ACTIVITY__OWNED_PARAMETER_SET :
				getOwnedParameterSets().clear();
				getOwnedParameterSets().addAll((Collection) newValue);
				return;
			case UMLPackage.ACTIVITY__SPECIFICATION :
				setSpecification((BehavioralFeature) newValue);
				return;
			case UMLPackage.ACTIVITY__IS_READ_ONLY :
				setIsReadOnly(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.ACTIVITY__PARTITION :
				setPartition((ActivityPartition) newValue);
				return;
			case UMLPackage.ACTIVITY__GROUP :
				getGroups().clear();
				getGroups().addAll((Collection) newValue);
				return;
			case UMLPackage.ACTIVITY__IS_SINGLE_EXECUTION :
				setIsSingleExecution(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.ACTIVITY__VARIABLE :
				getVariables().clear();
				getVariables().addAll((Collection) newValue);
				return;
			case UMLPackage.ACTIVITY__NODE :
				getNodes().clear();
				getNodes().addAll((Collection) newValue);
				return;
			case UMLPackage.ACTIVITY__EDGE :
				getEdges().clear();
				getEdges().addAll((Collection) newValue);
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
				setName(NAME_EDEFAULT);
				return;
			case UMLPackage.ACTIVITY__VISIBILITY :
				setVisibility(VISIBILITY_EDEFAULT);
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
			case UMLPackage.ACTIVITY__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.ACTIVITY__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) null);
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
			case UMLPackage.ACTIVITY__INHERITED_MEMBER :
				getInheritedMembers().clear();
				return;
			case UMLPackage.ACTIVITY__REDEFINED_CLASSIFIER :
				getRedefinedClassifiers().clear();
				return;
			case UMLPackage.ACTIVITY__GENERAL :
				getGenerals().clear();
				return;
			case UMLPackage.ACTIVITY__OWNED_USE_CASE :
				getOwnedUseCases().clear();
				return;
			case UMLPackage.ACTIVITY__USE_CASE :
				getUseCases().clear();
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
			case UMLPackage.ACTIVITY__OWNED_SIGNATURE :
				setOwnedSignature((RedefinableTemplateSignature) null);
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
			case UMLPackage.ACTIVITY__OWNED_OPERATION :
				getOwnedOperations().clear();
				return;
			case UMLPackage.ACTIVITY__NESTED_CLASSIFIER :
				getNestedClassifiers().clear();
				return;
			case UMLPackage.ACTIVITY__SUPER_CLASS :
				getSuperClasses().clear();
				return;
			case UMLPackage.ACTIVITY__IS_ACTIVE :
				unsetIsActive();
				return;
			case UMLPackage.ACTIVITY__OWNED_RECEPTION :
				getOwnedReceptions().clear();
				return;
			case UMLPackage.ACTIVITY__IS_REENTRANT :
				unsetIsReentrant();
				return;
			case UMLPackage.ACTIVITY__REDEFINED_BEHAVIOR :
				getRedefinedBehaviors().clear();
				return;
			case UMLPackage.ACTIVITY__OWNED_PARAMETER :
				getOwnedParameters().clear();
				return;
			case UMLPackage.ACTIVITY__CONTEXT :
				setContext((BehavioredClassifier) null);
				return;
			case UMLPackage.ACTIVITY__OWNED_PARAMETER_SET :
				getOwnedParameterSets().clear();
				return;
			case UMLPackage.ACTIVITY__SPECIFICATION :
				setSpecification((BehavioralFeature) null);
				return;
			case UMLPackage.ACTIVITY__IS_READ_ONLY :
				setIsReadOnly(IS_READ_ONLY_EDEFAULT);
				return;
			case UMLPackage.ACTIVITY__PARTITION :
				setPartition((ActivityPartition) null);
				return;
			case UMLPackage.ACTIVITY__GROUP :
				getGroups().clear();
				return;
			case UMLPackage.ACTIVITY__IS_SINGLE_EXECUTION :
				setIsSingleExecution(IS_SINGLE_EXECUTION_EDEFAULT);
				return;
			case UMLPackage.ACTIVITY__VARIABLE :
				getVariables().clear();
				return;
			case UMLPackage.ACTIVITY__NODE :
				getNodes().clear();
				return;
			case UMLPackage.ACTIVITY__EDGE :
				getEdges().clear();
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
				EList eAnnotations = (EList) eVirtualGet(UMLPackage.ACTIVITY__EANNOTATIONS);
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.ACTIVITY__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.ACTIVITY__OWNER :
				return isSetOwner();
			case UMLPackage.ACTIVITY__OWNED_COMMENT :
				List ownedComment = (List) eVirtualGet(UMLPackage.ACTIVITY__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.ACTIVITY__NAME :
				String name = (String) eVirtualGet(UMLPackage.ACTIVITY__NAME,
					NAME_EDEFAULT);
				return NAME_EDEFAULT == null
					? name != null
					: !NAME_EDEFAULT.equals(name);
			case UMLPackage.ACTIVITY__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.ACTIVITY__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.ACTIVITY__CLIENT_DEPENDENCY :
				List clientDependency = (List) eVirtualGet(UMLPackage.ACTIVITY__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.ACTIVITY__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.ACTIVITY__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.ACTIVITY__NAME_EXPRESSION) != null;
			case UMLPackage.ACTIVITY__ELEMENT_IMPORT :
				List elementImport = (List) eVirtualGet(UMLPackage.ACTIVITY__ELEMENT_IMPORT);
				return elementImport != null && !elementImport.isEmpty();
			case UMLPackage.ACTIVITY__PACKAGE_IMPORT :
				List packageImport = (List) eVirtualGet(UMLPackage.ACTIVITY__PACKAGE_IMPORT);
				return packageImport != null && !packageImport.isEmpty();
			case UMLPackage.ACTIVITY__OWNED_RULE :
				List ownedRule = (List) eVirtualGet(UMLPackage.ACTIVITY__OWNED_RULE);
				return ownedRule != null && !ownedRule.isEmpty();
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
			case UMLPackage.ACTIVITY__TEMPLATE_PARAMETER :
				return isSetTemplateParameter();
			case UMLPackage.ACTIVITY__OWNING_TEMPLATE_PARAMETER :
				return basicGetOwningTemplateParameter() != null;
			case UMLPackage.ACTIVITY__PACKAGE :
				return basicGetPackage() != null;
			case UMLPackage.ACTIVITY__TEMPLATE_BINDING :
				List templateBinding = (List) eVirtualGet(UMLPackage.ACTIVITY__TEMPLATE_BINDING);
				return templateBinding != null && !templateBinding.isEmpty();
			case UMLPackage.ACTIVITY__OWNED_TEMPLATE_SIGNATURE :
				return eVirtualGet(UMLPackage.ACTIVITY__OWNED_TEMPLATE_SIGNATURE) != null;
			case UMLPackage.ACTIVITY__IS_ABSTRACT :
				return isSetIsAbstract();
			case UMLPackage.ACTIVITY__GENERALIZATION :
				List generalization = (List) eVirtualGet(UMLPackage.ACTIVITY__GENERALIZATION);
				return generalization != null && !generalization.isEmpty();
			case UMLPackage.ACTIVITY__POWERTYPE_EXTENT :
				List powertypeExtent = (List) eVirtualGet(UMLPackage.ACTIVITY__POWERTYPE_EXTENT);
				return powertypeExtent != null && !powertypeExtent.isEmpty();
			case UMLPackage.ACTIVITY__FEATURE :
				return isSetFeatures();
			case UMLPackage.ACTIVITY__INHERITED_MEMBER :
				return !getInheritedMembers().isEmpty();
			case UMLPackage.ACTIVITY__REDEFINED_CLASSIFIER :
				List redefinedClassifier = (List) eVirtualGet(UMLPackage.ACTIVITY__REDEFINED_CLASSIFIER);
				return redefinedClassifier != null
					&& !redefinedClassifier.isEmpty();
			case UMLPackage.ACTIVITY__GENERAL :
				return isSetGenerals();
			case UMLPackage.ACTIVITY__OWNED_USE_CASE :
				List ownedUseCase = (List) eVirtualGet(UMLPackage.ACTIVITY__OWNED_USE_CASE);
				return ownedUseCase != null && !ownedUseCase.isEmpty();
			case UMLPackage.ACTIVITY__USE_CASE :
				List useCase = (List) eVirtualGet(UMLPackage.ACTIVITY__USE_CASE);
				return useCase != null && !useCase.isEmpty();
			case UMLPackage.ACTIVITY__SUBSTITUTION :
				List substitution = (List) eVirtualGet(UMLPackage.ACTIVITY__SUBSTITUTION);
				return substitution != null && !substitution.isEmpty();
			case UMLPackage.ACTIVITY__ATTRIBUTE :
				return isSetAttributes();
			case UMLPackage.ACTIVITY__REPRESENTATION :
				return eVirtualGet(UMLPackage.ACTIVITY__REPRESENTATION) != null;
			case UMLPackage.ACTIVITY__COLLABORATION_USE :
				List collaborationUse = (List) eVirtualGet(UMLPackage.ACTIVITY__COLLABORATION_USE);
				return collaborationUse != null && !collaborationUse.isEmpty();
			case UMLPackage.ACTIVITY__OWNED_SIGNATURE :
				return eVirtualGet(UMLPackage.ACTIVITY__OWNED_SIGNATURE) != null;
			case UMLPackage.ACTIVITY__OWNED_ATTRIBUTE :
				return isSetOwnedAttributes();
			case UMLPackage.ACTIVITY__PART :
				return !getParts().isEmpty();
			case UMLPackage.ACTIVITY__ROLE :
				return isSetRoles();
			case UMLPackage.ACTIVITY__OWNED_CONNECTOR :
				List ownedConnector = (List) eVirtualGet(UMLPackage.ACTIVITY__OWNED_CONNECTOR);
				return ownedConnector != null && !ownedConnector.isEmpty();
			case UMLPackage.ACTIVITY__OWNED_PORT :
				List ownedPort = (List) eVirtualGet(UMLPackage.ACTIVITY__OWNED_PORT);
				return ownedPort != null && !ownedPort.isEmpty();
			case UMLPackage.ACTIVITY__OWNED_BEHAVIOR :
				List ownedBehavior = (List) eVirtualGet(UMLPackage.ACTIVITY__OWNED_BEHAVIOR);
				return ownedBehavior != null && !ownedBehavior.isEmpty();
			case UMLPackage.ACTIVITY__CLASSIFIER_BEHAVIOR :
				return eVirtualGet(UMLPackage.ACTIVITY__CLASSIFIER_BEHAVIOR) != null;
			case UMLPackage.ACTIVITY__INTERFACE_REALIZATION :
				List interfaceRealization = (List) eVirtualGet(UMLPackage.ACTIVITY__INTERFACE_REALIZATION);
				return interfaceRealization != null
					&& !interfaceRealization.isEmpty();
			case UMLPackage.ACTIVITY__OWNED_TRIGGER :
				List ownedTrigger = (List) eVirtualGet(UMLPackage.ACTIVITY__OWNED_TRIGGER);
				return ownedTrigger != null && !ownedTrigger.isEmpty();
			case UMLPackage.ACTIVITY__OWNED_OPERATION :
				List ownedOperation = (List) eVirtualGet(UMLPackage.ACTIVITY__OWNED_OPERATION);
				return ownedOperation != null && !ownedOperation.isEmpty();
			case UMLPackage.ACTIVITY__NESTED_CLASSIFIER :
				List nestedClassifier = (List) eVirtualGet(UMLPackage.ACTIVITY__NESTED_CLASSIFIER);
				return nestedClassifier != null && !nestedClassifier.isEmpty();
			case UMLPackage.ACTIVITY__SUPER_CLASS :
				return isSetSuperClasses();
			case UMLPackage.ACTIVITY__IS_ACTIVE :
				return isSetIsActive();
			case UMLPackage.ACTIVITY__OWNED_RECEPTION :
				List ownedReception = (List) eVirtualGet(UMLPackage.ACTIVITY__OWNED_RECEPTION);
				return ownedReception != null && !ownedReception.isEmpty();
			case UMLPackage.ACTIVITY__EXTENSION :
				return !getExtensions().isEmpty();
			case UMLPackage.ACTIVITY__IS_REENTRANT :
				return isSetIsReentrant();
			case UMLPackage.ACTIVITY__REDEFINED_BEHAVIOR :
				List redefinedBehavior = (List) eVirtualGet(UMLPackage.ACTIVITY__REDEFINED_BEHAVIOR);
				return redefinedBehavior != null
					&& !redefinedBehavior.isEmpty();
			case UMLPackage.ACTIVITY__OWNED_PARAMETER :
				List ownedParameter = (List) eVirtualGet(UMLPackage.ACTIVITY__OWNED_PARAMETER);
				return ownedParameter != null && !ownedParameter.isEmpty();
			case UMLPackage.ACTIVITY__CONTEXT :
				return basicGetContext() != null;
			case UMLPackage.ACTIVITY__OWNED_PARAMETER_SET :
				List ownedParameterSet = (List) eVirtualGet(UMLPackage.ACTIVITY__OWNED_PARAMETER_SET);
				return ownedParameterSet != null
					&& !ownedParameterSet.isEmpty();
			case UMLPackage.ACTIVITY__SPECIFICATION :
				return eVirtualGet(UMLPackage.ACTIVITY__SPECIFICATION) != null;
			case UMLPackage.ACTIVITY__IS_READ_ONLY :
				return ((eFlags & IS_READ_ONLY_EFLAG) != 0) != IS_READ_ONLY_EDEFAULT;
			case UMLPackage.ACTIVITY__PARTITION :
				return eVirtualGet(UMLPackage.ACTIVITY__PARTITION) != null;
			case UMLPackage.ACTIVITY__GROUP :
				List group = (List) eVirtualGet(UMLPackage.ACTIVITY__GROUP);
				return group != null && !group.isEmpty();
			case UMLPackage.ACTIVITY__IS_SINGLE_EXECUTION :
				return ((eFlags & IS_SINGLE_EXECUTION_EFLAG) != 0) != IS_SINGLE_EXECUTION_EDEFAULT;
			case UMLPackage.ACTIVITY__STRUCTURED_NODE :
				return !getStructuredNodes().isEmpty();
			case UMLPackage.ACTIVITY__VARIABLE :
				List variable = (List) eVirtualGet(UMLPackage.ACTIVITY__VARIABLE);
				return variable != null && !variable.isEmpty();
			case UMLPackage.ACTIVITY__NODE :
				List node = (List) eVirtualGet(UMLPackage.ACTIVITY__NODE);
				return node != null && !node.isEmpty();
			case UMLPackage.ACTIVITY__EDGE :
				List edge = (List) eVirtualGet(UMLPackage.ACTIVITY__EDGE);
				return edge != null && !edge.isEmpty();
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected int eVirtualIndexBits(int offset) {
		switch (offset) {
			case 0 :
				return eVirtualIndexBits0;
			case 1 :
				return eVirtualIndexBits1;
			case 2 :
				return eVirtualIndexBits2;
			default :
				throw new IndexOutOfBoundsException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void eSetVirtualIndexBits(int offset, int newIndexBits) {
		switch (offset) {
			case 0 :
				eVirtualIndexBits0 = newIndexBits;
				break;
			case 1 :
				eVirtualIndexBits1 = newIndexBits;
				break;
			case 2 :
				eVirtualIndexBits2 = newIndexBits;
				break;
			default :
				throw new IndexOutOfBoundsException();
		}
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements() || eIsSet(UMLPackage.ACTIVITY__GROUP)
			|| eIsSet(UMLPackage.ACTIVITY__NODE)
			|| eIsSet(UMLPackage.ACTIVITY__EDGE);
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

} //ActivityImpl
