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
 * $Id: StateMachineImpl.java,v 1.9 2005/12/06 23:21:50 khussey Exp $
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

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.BehavioralFeature;
import org.eclipse.uml2.uml.BehavioredClassifier;
import org.eclipse.uml2.uml.CollaborationUse;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.Pseudostate;
import org.eclipse.uml2.uml.RedefinableElement;
import org.eclipse.uml2.uml.RedefinableTemplateSignature;
import org.eclipse.uml2.uml.Region;
import org.eclipse.uml2.uml.State;
import org.eclipse.uml2.uml.StateMachine;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.TemplateSignature;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.StateMachineOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StateMachineImpl#getOwnedMembers <em>Owned Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StateMachineImpl#getRedefinedElements <em>Redefined Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StateMachineImpl#getRegions <em>Region</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StateMachineImpl#getConnectionPoints <em>Connection Point</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StateMachineImpl#getExtendedStateMachine <em>Extended State Machine</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StateMachineImpl
		extends BehaviorImpl
		implements StateMachine {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateMachineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.Literals.STATE_MACHINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getOwnedMembers() {
		List ownedMember = (List) eVirtualGet(UMLPackage.STATE_MACHINE__OWNED_MEMBER);
		if (ownedMember == null) {
			eVirtualSet(UMLPackage.STATE_MACHINE__OWNED_MEMBER,
				ownedMember = new DerivedUnionEObjectEList(NamedElement.class,
					this, UMLPackage.STATE_MACHINE__OWNED_MEMBER, new int[]{
						UMLPackage.STATE_MACHINE__OWNED_RULE,
						UMLPackage.STATE_MACHINE__OWNED_USE_CASE,
						UMLPackage.STATE_MACHINE__OWNED_ATTRIBUTE,
						UMLPackage.STATE_MACHINE__OWNED_CONNECTOR,
						UMLPackage.STATE_MACHINE__OWNED_BEHAVIOR,
						UMLPackage.STATE_MACHINE__OWNED_TRIGGER,
						UMLPackage.STATE_MACHINE__OWNED_OPERATION,
						UMLPackage.STATE_MACHINE__NESTED_CLASSIFIER,
						UMLPackage.STATE_MACHINE__OWNED_RECEPTION,
						UMLPackage.STATE_MACHINE__OWNED_PARAMETER,
						UMLPackage.STATE_MACHINE__OWNED_PARAMETER_SET,
						UMLPackage.STATE_MACHINE__REGION,
						UMLPackage.STATE_MACHINE__CONNECTION_POINT}));
		}
		return ownedMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getRedefinedElements() {
		List redefinedElement = (List) eVirtualGet(UMLPackage.STATE_MACHINE__REDEFINED_ELEMENT);
		if (redefinedElement == null) {
			eVirtualSet(UMLPackage.STATE_MACHINE__REDEFINED_ELEMENT,
				redefinedElement = new DerivedUnionEObjectEList(
					RedefinableElement.class, this,
					UMLPackage.STATE_MACHINE__REDEFINED_ELEMENT, new int[]{
						UMLPackage.STATE_MACHINE__REDEFINED_CLASSIFIER,
						UMLPackage.STATE_MACHINE__REDEFINED_BEHAVIOR,
						UMLPackage.STATE_MACHINE__EXTENDED_STATE_MACHINE}));
		}
		return redefinedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getRegions() {
		List region = (List) eVirtualGet(UMLPackage.STATE_MACHINE__REGION);
		if (region == null) {
			eVirtualSet(UMLPackage.STATE_MACHINE__REGION,
				region = new EObjectContainmentWithInverseEList(Region.class,
					this, UMLPackage.STATE_MACHINE__REGION,
					UMLPackage.REGION__STATE_MACHINE));
		}
		return region;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Region createRegion() {
		Region newRegion = UMLFactory.eINSTANCE.createRegion();
		getRegions().add(newRegion);
		return newRegion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Region getRegion(String name) {
		for (Iterator i = getRegions().iterator(); i.hasNext();) {
			Region region = (Region) i.next();
			if (name.equals(region.getName())) {
				return region;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getConnectionPoints() {
		List connectionPoint = (List) eVirtualGet(UMLPackage.STATE_MACHINE__CONNECTION_POINT);
		if (connectionPoint == null) {
			eVirtualSet(UMLPackage.STATE_MACHINE__CONNECTION_POINT,
				connectionPoint = new EObjectContainmentWithInverseEList(
					Pseudostate.class, this,
					UMLPackage.STATE_MACHINE__CONNECTION_POINT,
					UMLPackage.PSEUDOSTATE__STATE_MACHINE));
		}
		return connectionPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pseudostate createConnectionPoint() {
		Pseudostate newConnectionPoint = UMLFactory.eINSTANCE
			.createPseudostate();
		getConnectionPoints().add(newConnectionPoint);
		return newConnectionPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pseudostate getConnectionPoint(String name) {
		for (Iterator i = getConnectionPoints().iterator(); i.hasNext();) {
			Pseudostate connectionPoint = (Pseudostate) i.next();
			if (name.equals(connectionPoint.getName())) {
				return connectionPoint;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachine getExtendedStateMachine() {
		StateMachine extendedStateMachine = (StateMachine) eVirtualGet(UMLPackage.STATE_MACHINE__EXTENDED_STATE_MACHINE);
		if (extendedStateMachine != null && extendedStateMachine.eIsProxy()) {
			InternalEObject oldExtendedStateMachine = (InternalEObject) extendedStateMachine;
			extendedStateMachine = (StateMachine) eResolveProxy(oldExtendedStateMachine);
			if (extendedStateMachine != oldExtendedStateMachine) {
				eVirtualSet(UMLPackage.STATE_MACHINE__EXTENDED_STATE_MACHINE,
					extendedStateMachine);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.STATE_MACHINE__EXTENDED_STATE_MACHINE,
						oldExtendedStateMachine, extendedStateMachine));
			}
		}
		return extendedStateMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachine basicGetExtendedStateMachine() {
		return (StateMachine) eVirtualGet(UMLPackage.STATE_MACHINE__EXTENDED_STATE_MACHINE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtendedStateMachine(StateMachine newExtendedStateMachine) {
		StateMachine extendedStateMachine = newExtendedStateMachine;
		Object oldExtendedStateMachine = eVirtualSet(
			UMLPackage.STATE_MACHINE__EXTENDED_STATE_MACHINE,
			extendedStateMachine);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.STATE_MACHINE__EXTENDED_STATE_MACHINE,
				oldExtendedStateMachine == EVIRTUAL_NO_VALUE
					? null
					: oldExtendedStateMachine, extendedStateMachine));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassifierContext(DiagnosticChain diagnostics,
			Map context) {
		return StateMachineOperations.validateClassifierContext(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContextClassifier(DiagnosticChain diagnostics,
			Map context) {
		return StateMachineOperations.validateContextClassifier(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectionPoints(DiagnosticChain diagnostics,
			Map context) {
		return StateMachineOperations.validateConnectionPoints(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMethod(DiagnosticChain diagnostics, Map context) {
		return StateMachineOperations
			.validateMethod(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace LCA(State s1, State s2) {
		return StateMachineOperations.LCA(this, s1, s2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean ancestor(State s1, State s2) {
		return StateMachineOperations.ancestor(this, s1, s2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRedefinitionContextValid(StateMachine redefined) {
		return StateMachineOperations.isRedefinitionContextValid(this,
			redefined);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isConsistentWith(RedefinableElement redefinee) {
		return StateMachineOperations.isConsistentWith(this, redefinee);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.STATE_MACHINE__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.STATE_MACHINE__CLIENT_DEPENDENCY :
				return ((InternalEList) getClientDependencies()).basicAdd(
					otherEnd, msgs);
			case UMLPackage.STATE_MACHINE__ELEMENT_IMPORT :
				return ((InternalEList) getElementImports()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.STATE_MACHINE__PACKAGE_IMPORT :
				return ((InternalEList) getPackageImports()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.STATE_MACHINE__OWNED_RULE :
				return ((InternalEList) getOwnedRules()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.STATE_MACHINE__TEMPLATE_PARAMETER :
				TemplateParameter templateParameter = (TemplateParameter) eVirtualGet(UMLPackage.STATE_MACHINE__TEMPLATE_PARAMETER);
				if (templateParameter != null)
					msgs = ((InternalEObject) templateParameter)
						.eInverseRemove(this,
							UMLPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT,
							TemplateParameter.class, msgs);
				return basicSetTemplateParameter((TemplateParameter) otherEnd,
					msgs);
			case UMLPackage.STATE_MACHINE__OWNING_TEMPLATE_PARAMETER :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd,
					UMLPackage.STATE_MACHINE__OWNING_TEMPLATE_PARAMETER, msgs);
			case UMLPackage.STATE_MACHINE__TEMPLATE_BINDING :
				return ((InternalEList) getTemplateBindings()).basicAdd(
					otherEnd, msgs);
			case UMLPackage.STATE_MACHINE__OWNED_TEMPLATE_SIGNATURE :
				TemplateSignature ownedTemplateSignature = (TemplateSignature) eVirtualGet(UMLPackage.STATE_MACHINE__OWNED_TEMPLATE_SIGNATURE);
				if (ownedTemplateSignature != null)
					msgs = ((InternalEObject) ownedTemplateSignature)
						.eInverseRemove(
							this,
							EOPPOSITE_FEATURE_BASE
								- UMLPackage.STATE_MACHINE__OWNED_TEMPLATE_SIGNATURE,
							null, msgs);
				return basicSetOwnedTemplateSignature(
					(TemplateSignature) otherEnd, msgs);
			case UMLPackage.STATE_MACHINE__GENERALIZATION :
				return ((InternalEList) getGeneralizations()).basicAdd(
					otherEnd, msgs);
			case UMLPackage.STATE_MACHINE__POWERTYPE_EXTENT :
				return ((InternalEList) getPowertypeExtents()).basicAdd(
					otherEnd, msgs);
			case UMLPackage.STATE_MACHINE__USE_CASE :
				return ((InternalEList) getUseCases()).basicAdd(otherEnd, msgs);
			case UMLPackage.STATE_MACHINE__SUBSTITUTION :
				return ((InternalEList) getSubstitutions()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.STATE_MACHINE__OWNED_SIGNATURE :
				RedefinableTemplateSignature ownedSignature = (RedefinableTemplateSignature) eVirtualGet(UMLPackage.STATE_MACHINE__OWNED_SIGNATURE);
				if (ownedSignature != null)
					msgs = ((InternalEObject) ownedSignature).eInverseRemove(
						this, EOPPOSITE_FEATURE_BASE
							- UMLPackage.STATE_MACHINE__OWNED_SIGNATURE, null,
						msgs);
				return basicSetOwnedSignature(
					(RedefinableTemplateSignature) otherEnd, msgs);
			case UMLPackage.STATE_MACHINE__INTERFACE_REALIZATION :
				return ((InternalEList) getInterfaceRealizations()).basicAdd(
					otherEnd, msgs);
			case UMLPackage.STATE_MACHINE__OWNED_OPERATION :
				return ((InternalEList) getOwnedOperations()).basicAdd(
					otherEnd, msgs);
			case UMLPackage.STATE_MACHINE__SPECIFICATION :
				BehavioralFeature specification = (BehavioralFeature) eVirtualGet(UMLPackage.STATE_MACHINE__SPECIFICATION);
				if (specification != null)
					msgs = ((InternalEObject) specification).eInverseRemove(
						this, UMLPackage.BEHAVIORAL_FEATURE__METHOD,
						BehavioralFeature.class, msgs);
				return basicSetSpecification((BehavioralFeature) otherEnd, msgs);
			case UMLPackage.STATE_MACHINE__REGION :
				return ((InternalEList) getRegions()).basicAdd(otherEnd, msgs);
			case UMLPackage.STATE_MACHINE__CONNECTION_POINT :
				return ((InternalEList) getConnectionPoints()).basicAdd(
					otherEnd, msgs);
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
			case UMLPackage.STATE_MACHINE__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.STATE_MACHINE__OWNED_COMMENT :
				return ((InternalEList) getOwnedComments()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.STATE_MACHINE__CLIENT_DEPENDENCY :
				return ((InternalEList) getClientDependencies()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.STATE_MACHINE__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.STATE_MACHINE__ELEMENT_IMPORT :
				return ((InternalEList) getElementImports()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.STATE_MACHINE__PACKAGE_IMPORT :
				return ((InternalEList) getPackageImports()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.STATE_MACHINE__OWNED_RULE :
				return ((InternalEList) getOwnedRules()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.STATE_MACHINE__TEMPLATE_PARAMETER :
				return basicSetTemplateParameter(null, msgs);
			case UMLPackage.STATE_MACHINE__OWNING_TEMPLATE_PARAMETER :
				return eBasicSetContainer(null,
					UMLPackage.STATE_MACHINE__OWNING_TEMPLATE_PARAMETER, msgs);
			case UMLPackage.STATE_MACHINE__TEMPLATE_BINDING :
				return ((InternalEList) getTemplateBindings()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.STATE_MACHINE__OWNED_TEMPLATE_SIGNATURE :
				return basicSetOwnedTemplateSignature(null, msgs);
			case UMLPackage.STATE_MACHINE__GENERALIZATION :
				return ((InternalEList) getGeneralizations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.STATE_MACHINE__POWERTYPE_EXTENT :
				return ((InternalEList) getPowertypeExtents()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.STATE_MACHINE__OWNED_USE_CASE :
				return ((InternalEList) getOwnedUseCases()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.STATE_MACHINE__USE_CASE :
				return ((InternalEList) getUseCases()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.STATE_MACHINE__SUBSTITUTION :
				return ((InternalEList) getSubstitutions()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.STATE_MACHINE__COLLABORATION_USE :
				return ((InternalEList) getCollaborationUses()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.STATE_MACHINE__OWNED_SIGNATURE :
				return basicSetOwnedSignature(null, msgs);
			case UMLPackage.STATE_MACHINE__OWNED_ATTRIBUTE :
				return ((InternalEList) getOwnedAttributes()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.STATE_MACHINE__OWNED_CONNECTOR :
				return ((InternalEList) getOwnedConnectors()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.STATE_MACHINE__OWNED_BEHAVIOR :
				return ((InternalEList) getOwnedBehaviors()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.STATE_MACHINE__INTERFACE_REALIZATION :
				return ((InternalEList) getInterfaceRealizations())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.STATE_MACHINE__OWNED_TRIGGER :
				return ((InternalEList) getOwnedTriggers()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.STATE_MACHINE__OWNED_OPERATION :
				return ((InternalEList) getOwnedOperations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.STATE_MACHINE__NESTED_CLASSIFIER :
				return ((InternalEList) getNestedClassifiers()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.STATE_MACHINE__OWNED_RECEPTION :
				return ((InternalEList) getOwnedReceptions()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.STATE_MACHINE__OWNED_PARAMETER :
				return ((InternalEList) getOwnedParameters()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.STATE_MACHINE__OWNED_PARAMETER_SET :
				return ((InternalEList) getOwnedParameterSets()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.STATE_MACHINE__SPECIFICATION :
				return basicSetSpecification(null, msgs);
			case UMLPackage.STATE_MACHINE__REGION :
				return ((InternalEList) getRegions()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.STATE_MACHINE__CONNECTION_POINT :
				return ((InternalEList) getConnectionPoints()).basicRemove(
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
			case UMLPackage.STATE_MACHINE__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.STATE_MACHINE__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.STATE_MACHINE__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.STATE_MACHINE__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.STATE_MACHINE__NAME :
				return getName();
			case UMLPackage.STATE_MACHINE__VISIBILITY :
				return getVisibility();
			case UMLPackage.STATE_MACHINE__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.STATE_MACHINE__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.STATE_MACHINE__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.STATE_MACHINE__NAME_EXPRESSION :
				return getNameExpression();
			case UMLPackage.STATE_MACHINE__ELEMENT_IMPORT :
				return getElementImports();
			case UMLPackage.STATE_MACHINE__PACKAGE_IMPORT :
				return getPackageImports();
			case UMLPackage.STATE_MACHINE__OWNED_RULE :
				return getOwnedRules();
			case UMLPackage.STATE_MACHINE__MEMBER :
				return getMembers();
			case UMLPackage.STATE_MACHINE__IMPORTED_MEMBER :
				return getImportedMembers();
			case UMLPackage.STATE_MACHINE__OWNED_MEMBER :
				return getOwnedMembers();
			case UMLPackage.STATE_MACHINE__IS_LEAF :
				return isLeaf()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.STATE_MACHINE__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.STATE_MACHINE__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.STATE_MACHINE__TEMPLATE_PARAMETER :
				if (resolve)
					return getTemplateParameter();
				return basicGetTemplateParameter();
			case UMLPackage.STATE_MACHINE__OWNING_TEMPLATE_PARAMETER :
				if (resolve)
					return getOwningTemplateParameter();
				return basicGetOwningTemplateParameter();
			case UMLPackage.STATE_MACHINE__PACKAGE :
				if (resolve)
					return getPackage();
				return basicGetPackage();
			case UMLPackage.STATE_MACHINE__TEMPLATE_BINDING :
				return getTemplateBindings();
			case UMLPackage.STATE_MACHINE__OWNED_TEMPLATE_SIGNATURE :
				return getOwnedTemplateSignature();
			case UMLPackage.STATE_MACHINE__IS_ABSTRACT :
				return isAbstract()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.STATE_MACHINE__GENERALIZATION :
				return getGeneralizations();
			case UMLPackage.STATE_MACHINE__POWERTYPE_EXTENT :
				return getPowertypeExtents();
			case UMLPackage.STATE_MACHINE__FEATURE :
				return getFeatures();
			case UMLPackage.STATE_MACHINE__INHERITED_MEMBER :
				return getInheritedMembers();
			case UMLPackage.STATE_MACHINE__REDEFINED_CLASSIFIER :
				return getRedefinedClassifiers();
			case UMLPackage.STATE_MACHINE__GENERAL :
				return getGenerals();
			case UMLPackage.STATE_MACHINE__OWNED_USE_CASE :
				return getOwnedUseCases();
			case UMLPackage.STATE_MACHINE__USE_CASE :
				return getUseCases();
			case UMLPackage.STATE_MACHINE__SUBSTITUTION :
				return getSubstitutions();
			case UMLPackage.STATE_MACHINE__ATTRIBUTE :
				return getAttributes();
			case UMLPackage.STATE_MACHINE__REPRESENTATION :
				return getRepresentation();
			case UMLPackage.STATE_MACHINE__COLLABORATION_USE :
				return getCollaborationUses();
			case UMLPackage.STATE_MACHINE__OWNED_SIGNATURE :
				return getOwnedSignature();
			case UMLPackage.STATE_MACHINE__OWNED_ATTRIBUTE :
				return getOwnedAttributes();
			case UMLPackage.STATE_MACHINE__PART :
				return getParts();
			case UMLPackage.STATE_MACHINE__ROLE :
				return getRoles();
			case UMLPackage.STATE_MACHINE__OWNED_CONNECTOR :
				return getOwnedConnectors();
			case UMLPackage.STATE_MACHINE__OWNED_PORT :
				return getOwnedPorts();
			case UMLPackage.STATE_MACHINE__OWNED_BEHAVIOR :
				return getOwnedBehaviors();
			case UMLPackage.STATE_MACHINE__CLASSIFIER_BEHAVIOR :
				return getClassifierBehavior();
			case UMLPackage.STATE_MACHINE__INTERFACE_REALIZATION :
				return getInterfaceRealizations();
			case UMLPackage.STATE_MACHINE__OWNED_TRIGGER :
				return getOwnedTriggers();
			case UMLPackage.STATE_MACHINE__OWNED_OPERATION :
				return getOwnedOperations();
			case UMLPackage.STATE_MACHINE__NESTED_CLASSIFIER :
				return getNestedClassifiers();
			case UMLPackage.STATE_MACHINE__SUPER_CLASS :
				return getSuperClasses();
			case UMLPackage.STATE_MACHINE__IS_ACTIVE :
				return isActive()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.STATE_MACHINE__OWNED_RECEPTION :
				return getOwnedReceptions();
			case UMLPackage.STATE_MACHINE__EXTENSION :
				return getExtensions();
			case UMLPackage.STATE_MACHINE__IS_REENTRANT :
				return isReentrant()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.STATE_MACHINE__REDEFINED_BEHAVIOR :
				return getRedefinedBehaviors();
			case UMLPackage.STATE_MACHINE__OWNED_PARAMETER :
				return getOwnedParameters();
			case UMLPackage.STATE_MACHINE__CONTEXT :
				if (resolve)
					return getContext();
				return basicGetContext();
			case UMLPackage.STATE_MACHINE__OWNED_PARAMETER_SET :
				return getOwnedParameterSets();
			case UMLPackage.STATE_MACHINE__SPECIFICATION :
				if (resolve)
					return getSpecification();
				return basicGetSpecification();
			case UMLPackage.STATE_MACHINE__REGION :
				return getRegions();
			case UMLPackage.STATE_MACHINE__CONNECTION_POINT :
				return getConnectionPoints();
			case UMLPackage.STATE_MACHINE__EXTENDED_STATE_MACHINE :
				if (resolve)
					return getExtendedStateMachine();
				return basicGetExtendedStateMachine();
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
			case UMLPackage.STATE_MACHINE__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.STATE_MACHINE__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.STATE_MACHINE__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.STATE_MACHINE__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.STATE_MACHINE__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.STATE_MACHINE__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.STATE_MACHINE__ELEMENT_IMPORT :
				getElementImports().clear();
				getElementImports().addAll((Collection) newValue);
				return;
			case UMLPackage.STATE_MACHINE__PACKAGE_IMPORT :
				getPackageImports().clear();
				getPackageImports().addAll((Collection) newValue);
				return;
			case UMLPackage.STATE_MACHINE__OWNED_RULE :
				getOwnedRules().clear();
				getOwnedRules().addAll((Collection) newValue);
				return;
			case UMLPackage.STATE_MACHINE__IS_LEAF :
				setIsLeaf(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.STATE_MACHINE__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.STATE_MACHINE__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.STATE_MACHINE__PACKAGE :
				setPackage((org.eclipse.uml2.uml.Package) newValue);
				return;
			case UMLPackage.STATE_MACHINE__TEMPLATE_BINDING :
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection) newValue);
				return;
			case UMLPackage.STATE_MACHINE__OWNED_TEMPLATE_SIGNATURE :
				setOwnedTemplateSignature((TemplateSignature) newValue);
				return;
			case UMLPackage.STATE_MACHINE__IS_ABSTRACT :
				setIsAbstract(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.STATE_MACHINE__GENERALIZATION :
				getGeneralizations().clear();
				getGeneralizations().addAll((Collection) newValue);
				return;
			case UMLPackage.STATE_MACHINE__POWERTYPE_EXTENT :
				getPowertypeExtents().clear();
				getPowertypeExtents().addAll((Collection) newValue);
				return;
			case UMLPackage.STATE_MACHINE__INHERITED_MEMBER :
				getInheritedMembers().clear();
				getInheritedMembers().addAll((Collection) newValue);
				return;
			case UMLPackage.STATE_MACHINE__REDEFINED_CLASSIFIER :
				getRedefinedClassifiers().clear();
				getRedefinedClassifiers().addAll((Collection) newValue);
				return;
			case UMLPackage.STATE_MACHINE__GENERAL :
				getGenerals().clear();
				getGenerals().addAll((Collection) newValue);
				return;
			case UMLPackage.STATE_MACHINE__OWNED_USE_CASE :
				getOwnedUseCases().clear();
				getOwnedUseCases().addAll((Collection) newValue);
				return;
			case UMLPackage.STATE_MACHINE__USE_CASE :
				getUseCases().clear();
				getUseCases().addAll((Collection) newValue);
				return;
			case UMLPackage.STATE_MACHINE__SUBSTITUTION :
				getSubstitutions().clear();
				getSubstitutions().addAll((Collection) newValue);
				return;
			case UMLPackage.STATE_MACHINE__REPRESENTATION :
				setRepresentation((CollaborationUse) newValue);
				return;
			case UMLPackage.STATE_MACHINE__COLLABORATION_USE :
				getCollaborationUses().clear();
				getCollaborationUses().addAll((Collection) newValue);
				return;
			case UMLPackage.STATE_MACHINE__OWNED_SIGNATURE :
				setOwnedSignature((RedefinableTemplateSignature) newValue);
				return;
			case UMLPackage.STATE_MACHINE__OWNED_ATTRIBUTE :
				getOwnedAttributes().clear();
				getOwnedAttributes().addAll((Collection) newValue);
				return;
			case UMLPackage.STATE_MACHINE__OWNED_CONNECTOR :
				getOwnedConnectors().clear();
				getOwnedConnectors().addAll((Collection) newValue);
				return;
			case UMLPackage.STATE_MACHINE__OWNED_PORT :
				getOwnedPorts().clear();
				getOwnedPorts().addAll((Collection) newValue);
				return;
			case UMLPackage.STATE_MACHINE__OWNED_BEHAVIOR :
				getOwnedBehaviors().clear();
				getOwnedBehaviors().addAll((Collection) newValue);
				return;
			case UMLPackage.STATE_MACHINE__CLASSIFIER_BEHAVIOR :
				setClassifierBehavior((Behavior) newValue);
				return;
			case UMLPackage.STATE_MACHINE__INTERFACE_REALIZATION :
				getInterfaceRealizations().clear();
				getInterfaceRealizations().addAll((Collection) newValue);
				return;
			case UMLPackage.STATE_MACHINE__OWNED_TRIGGER :
				getOwnedTriggers().clear();
				getOwnedTriggers().addAll((Collection) newValue);
				return;
			case UMLPackage.STATE_MACHINE__OWNED_OPERATION :
				getOwnedOperations().clear();
				getOwnedOperations().addAll((Collection) newValue);
				return;
			case UMLPackage.STATE_MACHINE__NESTED_CLASSIFIER :
				getNestedClassifiers().clear();
				getNestedClassifiers().addAll((Collection) newValue);
				return;
			case UMLPackage.STATE_MACHINE__SUPER_CLASS :
				getSuperClasses().clear();
				getSuperClasses().addAll((Collection) newValue);
				return;
			case UMLPackage.STATE_MACHINE__IS_ACTIVE :
				setIsActive(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.STATE_MACHINE__OWNED_RECEPTION :
				getOwnedReceptions().clear();
				getOwnedReceptions().addAll((Collection) newValue);
				return;
			case UMLPackage.STATE_MACHINE__IS_REENTRANT :
				setIsReentrant(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.STATE_MACHINE__REDEFINED_BEHAVIOR :
				getRedefinedBehaviors().clear();
				getRedefinedBehaviors().addAll((Collection) newValue);
				return;
			case UMLPackage.STATE_MACHINE__OWNED_PARAMETER :
				getOwnedParameters().clear();
				getOwnedParameters().addAll((Collection) newValue);
				return;
			case UMLPackage.STATE_MACHINE__CONTEXT :
				setContext((BehavioredClassifier) newValue);
				return;
			case UMLPackage.STATE_MACHINE__OWNED_PARAMETER_SET :
				getOwnedParameterSets().clear();
				getOwnedParameterSets().addAll((Collection) newValue);
				return;
			case UMLPackage.STATE_MACHINE__SPECIFICATION :
				setSpecification((BehavioralFeature) newValue);
				return;
			case UMLPackage.STATE_MACHINE__REGION :
				getRegions().clear();
				getRegions().addAll((Collection) newValue);
				return;
			case UMLPackage.STATE_MACHINE__CONNECTION_POINT :
				getConnectionPoints().clear();
				getConnectionPoints().addAll((Collection) newValue);
				return;
			case UMLPackage.STATE_MACHINE__EXTENDED_STATE_MACHINE :
				setExtendedStateMachine((StateMachine) newValue);
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
			case UMLPackage.STATE_MACHINE__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.STATE_MACHINE__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.STATE_MACHINE__NAME :
				setName(NAME_EDEFAULT);
				return;
			case UMLPackage.STATE_MACHINE__VISIBILITY :
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UMLPackage.STATE_MACHINE__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.STATE_MACHINE__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.STATE_MACHINE__ELEMENT_IMPORT :
				getElementImports().clear();
				return;
			case UMLPackage.STATE_MACHINE__PACKAGE_IMPORT :
				getPackageImports().clear();
				return;
			case UMLPackage.STATE_MACHINE__OWNED_RULE :
				getOwnedRules().clear();
				return;
			case UMLPackage.STATE_MACHINE__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.STATE_MACHINE__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.STATE_MACHINE__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.STATE_MACHINE__PACKAGE :
				setPackage((org.eclipse.uml2.uml.Package) null);
				return;
			case UMLPackage.STATE_MACHINE__TEMPLATE_BINDING :
				getTemplateBindings().clear();
				return;
			case UMLPackage.STATE_MACHINE__OWNED_TEMPLATE_SIGNATURE :
				setOwnedTemplateSignature((TemplateSignature) null);
				return;
			case UMLPackage.STATE_MACHINE__IS_ABSTRACT :
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case UMLPackage.STATE_MACHINE__GENERALIZATION :
				getGeneralizations().clear();
				return;
			case UMLPackage.STATE_MACHINE__POWERTYPE_EXTENT :
				getPowertypeExtents().clear();
				return;
			case UMLPackage.STATE_MACHINE__INHERITED_MEMBER :
				getInheritedMembers().clear();
				return;
			case UMLPackage.STATE_MACHINE__REDEFINED_CLASSIFIER :
				getRedefinedClassifiers().clear();
				return;
			case UMLPackage.STATE_MACHINE__GENERAL :
				getGenerals().clear();
				return;
			case UMLPackage.STATE_MACHINE__OWNED_USE_CASE :
				getOwnedUseCases().clear();
				return;
			case UMLPackage.STATE_MACHINE__USE_CASE :
				getUseCases().clear();
				return;
			case UMLPackage.STATE_MACHINE__SUBSTITUTION :
				getSubstitutions().clear();
				return;
			case UMLPackage.STATE_MACHINE__REPRESENTATION :
				setRepresentation((CollaborationUse) null);
				return;
			case UMLPackage.STATE_MACHINE__COLLABORATION_USE :
				getCollaborationUses().clear();
				return;
			case UMLPackage.STATE_MACHINE__OWNED_SIGNATURE :
				setOwnedSignature((RedefinableTemplateSignature) null);
				return;
			case UMLPackage.STATE_MACHINE__OWNED_ATTRIBUTE :
				getOwnedAttributes().clear();
				return;
			case UMLPackage.STATE_MACHINE__OWNED_CONNECTOR :
				getOwnedConnectors().clear();
				return;
			case UMLPackage.STATE_MACHINE__OWNED_PORT :
				getOwnedPorts().clear();
				return;
			case UMLPackage.STATE_MACHINE__OWNED_BEHAVIOR :
				getOwnedBehaviors().clear();
				return;
			case UMLPackage.STATE_MACHINE__CLASSIFIER_BEHAVIOR :
				setClassifierBehavior((Behavior) null);
				return;
			case UMLPackage.STATE_MACHINE__INTERFACE_REALIZATION :
				getInterfaceRealizations().clear();
				return;
			case UMLPackage.STATE_MACHINE__OWNED_TRIGGER :
				getOwnedTriggers().clear();
				return;
			case UMLPackage.STATE_MACHINE__OWNED_OPERATION :
				getOwnedOperations().clear();
				return;
			case UMLPackage.STATE_MACHINE__NESTED_CLASSIFIER :
				getNestedClassifiers().clear();
				return;
			case UMLPackage.STATE_MACHINE__SUPER_CLASS :
				getSuperClasses().clear();
				return;
			case UMLPackage.STATE_MACHINE__IS_ACTIVE :
				unsetIsActive();
				return;
			case UMLPackage.STATE_MACHINE__OWNED_RECEPTION :
				getOwnedReceptions().clear();
				return;
			case UMLPackage.STATE_MACHINE__IS_REENTRANT :
				unsetIsReentrant();
				return;
			case UMLPackage.STATE_MACHINE__REDEFINED_BEHAVIOR :
				getRedefinedBehaviors().clear();
				return;
			case UMLPackage.STATE_MACHINE__OWNED_PARAMETER :
				getOwnedParameters().clear();
				return;
			case UMLPackage.STATE_MACHINE__CONTEXT :
				setContext((BehavioredClassifier) null);
				return;
			case UMLPackage.STATE_MACHINE__OWNED_PARAMETER_SET :
				getOwnedParameterSets().clear();
				return;
			case UMLPackage.STATE_MACHINE__SPECIFICATION :
				setSpecification((BehavioralFeature) null);
				return;
			case UMLPackage.STATE_MACHINE__REGION :
				getRegions().clear();
				return;
			case UMLPackage.STATE_MACHINE__CONNECTION_POINT :
				getConnectionPoints().clear();
				return;
			case UMLPackage.STATE_MACHINE__EXTENDED_STATE_MACHINE :
				setExtendedStateMachine((StateMachine) null);
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
			case UMLPackage.STATE_MACHINE__EANNOTATIONS :
				EList eAnnotations = (EList) eVirtualGet(UMLPackage.STATE_MACHINE__EANNOTATIONS);
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.STATE_MACHINE__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.STATE_MACHINE__OWNER :
				return isSetOwner();
			case UMLPackage.STATE_MACHINE__OWNED_COMMENT :
				List ownedComment = (List) eVirtualGet(UMLPackage.STATE_MACHINE__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.STATE_MACHINE__NAME :
				String name = (String) eVirtualGet(
					UMLPackage.STATE_MACHINE__NAME, NAME_EDEFAULT);
				return NAME_EDEFAULT == null
					? name != null
					: !NAME_EDEFAULT.equals(name);
			case UMLPackage.STATE_MACHINE__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.STATE_MACHINE__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.STATE_MACHINE__CLIENT_DEPENDENCY :
				List clientDependency = (List) eVirtualGet(UMLPackage.STATE_MACHINE__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.STATE_MACHINE__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.STATE_MACHINE__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.STATE_MACHINE__NAME_EXPRESSION) != null;
			case UMLPackage.STATE_MACHINE__ELEMENT_IMPORT :
				List elementImport = (List) eVirtualGet(UMLPackage.STATE_MACHINE__ELEMENT_IMPORT);
				return elementImport != null && !elementImport.isEmpty();
			case UMLPackage.STATE_MACHINE__PACKAGE_IMPORT :
				List packageImport = (List) eVirtualGet(UMLPackage.STATE_MACHINE__PACKAGE_IMPORT);
				return packageImport != null && !packageImport.isEmpty();
			case UMLPackage.STATE_MACHINE__OWNED_RULE :
				List ownedRule = (List) eVirtualGet(UMLPackage.STATE_MACHINE__OWNED_RULE);
				return ownedRule != null && !ownedRule.isEmpty();
			case UMLPackage.STATE_MACHINE__MEMBER :
				return isSetMembers();
			case UMLPackage.STATE_MACHINE__IMPORTED_MEMBER :
				return !getImportedMembers().isEmpty();
			case UMLPackage.STATE_MACHINE__OWNED_MEMBER :
				return isSetOwnedMembers();
			case UMLPackage.STATE_MACHINE__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.STATE_MACHINE__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.STATE_MACHINE__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.STATE_MACHINE__TEMPLATE_PARAMETER :
				return isSetTemplateParameter();
			case UMLPackage.STATE_MACHINE__OWNING_TEMPLATE_PARAMETER :
				return basicGetOwningTemplateParameter() != null;
			case UMLPackage.STATE_MACHINE__PACKAGE :
				return basicGetPackage() != null;
			case UMLPackage.STATE_MACHINE__TEMPLATE_BINDING :
				List templateBinding = (List) eVirtualGet(UMLPackage.STATE_MACHINE__TEMPLATE_BINDING);
				return templateBinding != null && !templateBinding.isEmpty();
			case UMLPackage.STATE_MACHINE__OWNED_TEMPLATE_SIGNATURE :
				return eVirtualGet(UMLPackage.STATE_MACHINE__OWNED_TEMPLATE_SIGNATURE) != null;
			case UMLPackage.STATE_MACHINE__IS_ABSTRACT :
				return isSetIsAbstract();
			case UMLPackage.STATE_MACHINE__GENERALIZATION :
				List generalization = (List) eVirtualGet(UMLPackage.STATE_MACHINE__GENERALIZATION);
				return generalization != null && !generalization.isEmpty();
			case UMLPackage.STATE_MACHINE__POWERTYPE_EXTENT :
				List powertypeExtent = (List) eVirtualGet(UMLPackage.STATE_MACHINE__POWERTYPE_EXTENT);
				return powertypeExtent != null && !powertypeExtent.isEmpty();
			case UMLPackage.STATE_MACHINE__FEATURE :
				return isSetFeatures();
			case UMLPackage.STATE_MACHINE__INHERITED_MEMBER :
				return !getInheritedMembers().isEmpty();
			case UMLPackage.STATE_MACHINE__REDEFINED_CLASSIFIER :
				List redefinedClassifier = (List) eVirtualGet(UMLPackage.STATE_MACHINE__REDEFINED_CLASSIFIER);
				return redefinedClassifier != null
					&& !redefinedClassifier.isEmpty();
			case UMLPackage.STATE_MACHINE__GENERAL :
				return isSetGenerals();
			case UMLPackage.STATE_MACHINE__OWNED_USE_CASE :
				List ownedUseCase = (List) eVirtualGet(UMLPackage.STATE_MACHINE__OWNED_USE_CASE);
				return ownedUseCase != null && !ownedUseCase.isEmpty();
			case UMLPackage.STATE_MACHINE__USE_CASE :
				List useCase = (List) eVirtualGet(UMLPackage.STATE_MACHINE__USE_CASE);
				return useCase != null && !useCase.isEmpty();
			case UMLPackage.STATE_MACHINE__SUBSTITUTION :
				List substitution = (List) eVirtualGet(UMLPackage.STATE_MACHINE__SUBSTITUTION);
				return substitution != null && !substitution.isEmpty();
			case UMLPackage.STATE_MACHINE__ATTRIBUTE :
				return isSetAttributes();
			case UMLPackage.STATE_MACHINE__REPRESENTATION :
				return eVirtualGet(UMLPackage.STATE_MACHINE__REPRESENTATION) != null;
			case UMLPackage.STATE_MACHINE__COLLABORATION_USE :
				List collaborationUse = (List) eVirtualGet(UMLPackage.STATE_MACHINE__COLLABORATION_USE);
				return collaborationUse != null && !collaborationUse.isEmpty();
			case UMLPackage.STATE_MACHINE__OWNED_SIGNATURE :
				return eVirtualGet(UMLPackage.STATE_MACHINE__OWNED_SIGNATURE) != null;
			case UMLPackage.STATE_MACHINE__OWNED_ATTRIBUTE :
				return isSetOwnedAttributes();
			case UMLPackage.STATE_MACHINE__PART :
				return !getParts().isEmpty();
			case UMLPackage.STATE_MACHINE__ROLE :
				return isSetRoles();
			case UMLPackage.STATE_MACHINE__OWNED_CONNECTOR :
				List ownedConnector = (List) eVirtualGet(UMLPackage.STATE_MACHINE__OWNED_CONNECTOR);
				return ownedConnector != null && !ownedConnector.isEmpty();
			case UMLPackage.STATE_MACHINE__OWNED_PORT :
				List ownedPort = (List) eVirtualGet(UMLPackage.STATE_MACHINE__OWNED_PORT);
				return ownedPort != null && !ownedPort.isEmpty();
			case UMLPackage.STATE_MACHINE__OWNED_BEHAVIOR :
				List ownedBehavior = (List) eVirtualGet(UMLPackage.STATE_MACHINE__OWNED_BEHAVIOR);
				return ownedBehavior != null && !ownedBehavior.isEmpty();
			case UMLPackage.STATE_MACHINE__CLASSIFIER_BEHAVIOR :
				return eVirtualGet(UMLPackage.STATE_MACHINE__CLASSIFIER_BEHAVIOR) != null;
			case UMLPackage.STATE_MACHINE__INTERFACE_REALIZATION :
				List interfaceRealization = (List) eVirtualGet(UMLPackage.STATE_MACHINE__INTERFACE_REALIZATION);
				return interfaceRealization != null
					&& !interfaceRealization.isEmpty();
			case UMLPackage.STATE_MACHINE__OWNED_TRIGGER :
				List ownedTrigger = (List) eVirtualGet(UMLPackage.STATE_MACHINE__OWNED_TRIGGER);
				return ownedTrigger != null && !ownedTrigger.isEmpty();
			case UMLPackage.STATE_MACHINE__OWNED_OPERATION :
				List ownedOperation = (List) eVirtualGet(UMLPackage.STATE_MACHINE__OWNED_OPERATION);
				return ownedOperation != null && !ownedOperation.isEmpty();
			case UMLPackage.STATE_MACHINE__NESTED_CLASSIFIER :
				List nestedClassifier = (List) eVirtualGet(UMLPackage.STATE_MACHINE__NESTED_CLASSIFIER);
				return nestedClassifier != null && !nestedClassifier.isEmpty();
			case UMLPackage.STATE_MACHINE__SUPER_CLASS :
				return isSetSuperClasses();
			case UMLPackage.STATE_MACHINE__IS_ACTIVE :
				return isSetIsActive();
			case UMLPackage.STATE_MACHINE__OWNED_RECEPTION :
				List ownedReception = (List) eVirtualGet(UMLPackage.STATE_MACHINE__OWNED_RECEPTION);
				return ownedReception != null && !ownedReception.isEmpty();
			case UMLPackage.STATE_MACHINE__EXTENSION :
				return !getExtensions().isEmpty();
			case UMLPackage.STATE_MACHINE__IS_REENTRANT :
				return isSetIsReentrant();
			case UMLPackage.STATE_MACHINE__REDEFINED_BEHAVIOR :
				List redefinedBehavior = (List) eVirtualGet(UMLPackage.STATE_MACHINE__REDEFINED_BEHAVIOR);
				return redefinedBehavior != null
					&& !redefinedBehavior.isEmpty();
			case UMLPackage.STATE_MACHINE__OWNED_PARAMETER :
				List ownedParameter = (List) eVirtualGet(UMLPackage.STATE_MACHINE__OWNED_PARAMETER);
				return ownedParameter != null && !ownedParameter.isEmpty();
			case UMLPackage.STATE_MACHINE__CONTEXT :
				return basicGetContext() != null;
			case UMLPackage.STATE_MACHINE__OWNED_PARAMETER_SET :
				List ownedParameterSet = (List) eVirtualGet(UMLPackage.STATE_MACHINE__OWNED_PARAMETER_SET);
				return ownedParameterSet != null
					&& !ownedParameterSet.isEmpty();
			case UMLPackage.STATE_MACHINE__SPECIFICATION :
				return eVirtualGet(UMLPackage.STATE_MACHINE__SPECIFICATION) != null;
			case UMLPackage.STATE_MACHINE__REGION :
				List region = (List) eVirtualGet(UMLPackage.STATE_MACHINE__REGION);
				return region != null && !region.isEmpty();
			case UMLPackage.STATE_MACHINE__CONNECTION_POINT :
				List connectionPoint = (List) eVirtualGet(UMLPackage.STATE_MACHINE__CONNECTION_POINT);
				return connectionPoint != null && !connectionPoint.isEmpty();
			case UMLPackage.STATE_MACHINE__EXTENDED_STATE_MACHINE :
				return eVirtualGet(UMLPackage.STATE_MACHINE__EXTENDED_STATE_MACHINE) != null;
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedMembers() {
		return super.isSetOwnedMembers()
			|| eIsSet(UMLPackage.STATE_MACHINE__REGION)
			|| eIsSet(UMLPackage.STATE_MACHINE__CONNECTION_POINT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRedefinedElements() {
		return super.isSetRedefinedElements()
			|| eIsSet(UMLPackage.STATE_MACHINE__EXTENDED_STATE_MACHINE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRedefinitionContextValid(RedefinableElement redefined) {
		return isRedefinitionContextValid(redefined);
	}

} //StateMachineImpl
