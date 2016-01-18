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

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

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
import org.eclipse.uml2.uml.ProtocolConformance;
import org.eclipse.uml2.uml.ProtocolStateMachine;
import org.eclipse.uml2.uml.Pseudostate;
import org.eclipse.uml2.uml.Reception;
import org.eclipse.uml2.uml.RedefinableElement;
import org.eclipse.uml2.uml.Region;
import org.eclipse.uml2.uml.State;
import org.eclipse.uml2.uml.StateMachine;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.Substitution;
import org.eclipse.uml2.uml.TemplateBinding;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.TemplateSignature;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.UseCase;
import org.eclipse.uml2.uml.Vertex;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.ProtocolStateMachineOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Protocol State Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ProtocolStateMachineImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ProtocolStateMachineImpl#getConformances <em>Conformance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProtocolStateMachineImpl
		extends StateMachineImpl
		implements ProtocolStateMachine {

	/**
	 * The cached value of the '{@link #getConformances() <em>Conformance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConformances()
	 * @generated
	 * @ordered
	 */
	protected EList<ProtocolConformance> conformances;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProtocolStateMachineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.PROTOCOL_STATE_MACHINE;
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
						UMLPackage.PROTOCOL_STATE_MACHINE__OWNED_ELEMENT,
						OWNED_ELEMENT_ESUBSETS));
			}
			return ownedElements;
		}
		return new DerivedUnionEObjectEList<Element>(Element.class, this,
			UMLPackage.PROTOCOL_STATE_MACHINE__OWNED_ELEMENT,
			OWNED_ELEMENT_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProtocolConformance> getConformances() {
		if (conformances == null) {
			conformances = new EObjectContainmentWithInverseEList.Resolving<ProtocolConformance>(
				ProtocolConformance.class, this,
				UMLPackage.PROTOCOL_STATE_MACHINE__CONFORMANCE,
				UMLPackage.PROTOCOL_CONFORMANCE__SPECIFIC_MACHINE);
		}
		return conformances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolConformance createConformance(
			ProtocolStateMachine generalMachine) {
		ProtocolConformance newConformance = (ProtocolConformance) create(
			UMLPackage.Literals.PROTOCOL_CONFORMANCE);
		getConformances().add(newConformance);
		if (generalMachine != null)
			newConformance.setGeneralMachine(generalMachine);
		return newConformance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolConformance getConformance(
			ProtocolStateMachine generalMachine) {
		return getConformance(generalMachine, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolConformance getConformance(
			ProtocolStateMachine generalMachine, boolean createOnDemand) {
		conformanceLoop : for (ProtocolConformance conformance : getConformances()) {
			if (generalMachine != null
				&& !generalMachine.equals(conformance.getGeneralMachine()))
				continue conformanceLoop;
			return conformance;
		}
		return createOnDemand
			? createConformance(generalMachine)
			: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProtocolTransitions(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProtocolStateMachineOperations.validateProtocolTransitions(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntryExitDo(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProtocolStateMachineOperations.validateEntryExitDo(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeepOrShallowHistory(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProtocolStateMachineOperations.validateDeepOrShallowHistory(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateClassifierContext(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProtocolStateMachineOperations.validateClassifierContext(this,
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
			case UMLPackage.PROTOCOL_STATE_MACHINE__EANNOTATIONS :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getEAnnotations())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.PROTOCOL_STATE_MACHINE__OWNED_RULE :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getOwnedRules())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.PROTOCOL_STATE_MACHINE__ELEMENT_IMPORT :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getElementImports())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.PROTOCOL_STATE_MACHINE__PACKAGE_IMPORT :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getPackageImports())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.PROTOCOL_STATE_MACHINE__OWNING_TEMPLATE_PARAMETER :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningTemplateParameter(
					(TemplateParameter) otherEnd, msgs);
			case UMLPackage.PROTOCOL_STATE_MACHINE__TEMPLATE_PARAMETER :
				if (templateParameter != null)
					msgs = ((InternalEObject) templateParameter).eInverseRemove(
						this,
						UMLPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT,
						TemplateParameter.class, msgs);
				return basicSetTemplateParameter((TemplateParameter) otherEnd,
					msgs);
			case UMLPackage.PROTOCOL_STATE_MACHINE__TEMPLATE_BINDING :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getTemplateBindings())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.PROTOCOL_STATE_MACHINE__OWNED_TEMPLATE_SIGNATURE :
				if (ownedTemplateSignature != null)
					msgs = ((InternalEObject) ownedTemplateSignature)
						.eInverseRemove(this,
							EOPPOSITE_FEATURE_BASE
								- UMLPackage.PROTOCOL_STATE_MACHINE__OWNED_TEMPLATE_SIGNATURE,
							null, msgs);
				return basicSetOwnedTemplateSignature(
					(TemplateSignature) otherEnd, msgs);
			case UMLPackage.PROTOCOL_STATE_MACHINE__GENERALIZATION :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getGeneralizations())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.PROTOCOL_STATE_MACHINE__POWERTYPE_EXTENT :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getPowertypeExtents())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.PROTOCOL_STATE_MACHINE__USE_CASE :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getUseCases())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.PROTOCOL_STATE_MACHINE__SUBSTITUTION :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getSubstitutions())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.PROTOCOL_STATE_MACHINE__INTERFACE_REALIZATION :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getInterfaceRealizations())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.PROTOCOL_STATE_MACHINE__OWNED_OPERATION :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getOwnedOperations())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.PROTOCOL_STATE_MACHINE__SPECIFICATION :
				if (specification != null)
					msgs = ((InternalEObject) specification).eInverseRemove(
						this, UMLPackage.BEHAVIORAL_FEATURE__METHOD,
						BehavioralFeature.class, msgs);
				return basicSetSpecification((BehavioralFeature) otherEnd,
					msgs);
			case UMLPackage.PROTOCOL_STATE_MACHINE__CONNECTION_POINT :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getConnectionPoints())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.PROTOCOL_STATE_MACHINE__SUBMACHINE_STATE :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getSubmachineStates())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.PROTOCOL_STATE_MACHINE__REGION :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getRegions())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.PROTOCOL_STATE_MACHINE__CONFORMANCE :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getConformances())
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
			case UMLPackage.PROTOCOL_STATE_MACHINE__EANNOTATIONS :
				return ((InternalEList<?>) getEAnnotations())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.PROTOCOL_STATE_MACHINE__OWNED_COMMENT :
				return ((InternalEList<?>) getOwnedComments())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.PROTOCOL_STATE_MACHINE__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.PROTOCOL_STATE_MACHINE__OWNED_RULE :
				return ((InternalEList<?>) getOwnedRules())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.PROTOCOL_STATE_MACHINE__ELEMENT_IMPORT :
				return ((InternalEList<?>) getElementImports())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.PROTOCOL_STATE_MACHINE__PACKAGE_IMPORT :
				return ((InternalEList<?>) getPackageImports())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.PROTOCOL_STATE_MACHINE__OWNING_TEMPLATE_PARAMETER :
				return basicSetOwningTemplateParameter(null, msgs);
			case UMLPackage.PROTOCOL_STATE_MACHINE__TEMPLATE_PARAMETER :
				return basicSetTemplateParameter(null, msgs);
			case UMLPackage.PROTOCOL_STATE_MACHINE__TEMPLATE_BINDING :
				return ((InternalEList<?>) getTemplateBindings())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.PROTOCOL_STATE_MACHINE__OWNED_TEMPLATE_SIGNATURE :
				return basicSetOwnedTemplateSignature(null, msgs);
			case UMLPackage.PROTOCOL_STATE_MACHINE__COLLABORATION_USE :
				return ((InternalEList<?>) getCollaborationUses())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.PROTOCOL_STATE_MACHINE__GENERALIZATION :
				return ((InternalEList<?>) getGeneralizations())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.PROTOCOL_STATE_MACHINE__POWERTYPE_EXTENT :
				return ((InternalEList<?>) getPowertypeExtents())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.PROTOCOL_STATE_MACHINE__OWNED_USE_CASE :
				return ((InternalEList<?>) getOwnedUseCases())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.PROTOCOL_STATE_MACHINE__USE_CASE :
				return ((InternalEList<?>) getUseCases()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.PROTOCOL_STATE_MACHINE__SUBSTITUTION :
				return ((InternalEList<?>) getSubstitutions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.PROTOCOL_STATE_MACHINE__OWNED_ATTRIBUTE :
				return ((InternalEList<?>) getOwnedAttributes())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.PROTOCOL_STATE_MACHINE__OWNED_CONNECTOR :
				return ((InternalEList<?>) getOwnedConnectors())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.PROTOCOL_STATE_MACHINE__INTERFACE_REALIZATION :
				return ((InternalEList<?>) getInterfaceRealizations())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.PROTOCOL_STATE_MACHINE__OWNED_BEHAVIOR :
				return ((InternalEList<?>) getOwnedBehaviors())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.PROTOCOL_STATE_MACHINE__OWNED_OPERATION :
				return ((InternalEList<?>) getOwnedOperations())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.PROTOCOL_STATE_MACHINE__NESTED_CLASSIFIER :
				return ((InternalEList<?>) getNestedClassifiers())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.PROTOCOL_STATE_MACHINE__OWNED_RECEPTION :
				return ((InternalEList<?>) getOwnedReceptions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.PROTOCOL_STATE_MACHINE__SPECIFICATION :
				return basicSetSpecification(null, msgs);
			case UMLPackage.PROTOCOL_STATE_MACHINE__OWNED_PARAMETER :
				return ((InternalEList<?>) getOwnedParameters())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.PROTOCOL_STATE_MACHINE__OWNED_PARAMETER_SET :
				return ((InternalEList<?>) getOwnedParameterSets())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.PROTOCOL_STATE_MACHINE__CONNECTION_POINT :
				return ((InternalEList<?>) getConnectionPoints())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.PROTOCOL_STATE_MACHINE__SUBMACHINE_STATE :
				return ((InternalEList<?>) getSubmachineStates())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.PROTOCOL_STATE_MACHINE__REGION :
				return ((InternalEList<?>) getRegions()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.PROTOCOL_STATE_MACHINE__CONFORMANCE :
				return ((InternalEList<?>) getConformances())
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
			case UMLPackage.PROTOCOL_STATE_MACHINE__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.PROTOCOL_STATE_MACHINE__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.PROTOCOL_STATE_MACHINE__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.PROTOCOL_STATE_MACHINE__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.PROTOCOL_STATE_MACHINE__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.PROTOCOL_STATE_MACHINE__NAME :
				return getName();
			case UMLPackage.PROTOCOL_STATE_MACHINE__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.PROTOCOL_STATE_MACHINE__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.PROTOCOL_STATE_MACHINE__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.PROTOCOL_STATE_MACHINE__VISIBILITY :
				return getVisibility();
			case UMLPackage.PROTOCOL_STATE_MACHINE__OWNED_RULE :
				return getOwnedRules();
			case UMLPackage.PROTOCOL_STATE_MACHINE__ELEMENT_IMPORT :
				return getElementImports();
			case UMLPackage.PROTOCOL_STATE_MACHINE__PACKAGE_IMPORT :
				return getPackageImports();
			case UMLPackage.PROTOCOL_STATE_MACHINE__OWNED_MEMBER :
				return getOwnedMembers();
			case UMLPackage.PROTOCOL_STATE_MACHINE__IMPORTED_MEMBER :
				return getImportedMembers();
			case UMLPackage.PROTOCOL_STATE_MACHINE__MEMBER :
				return getMembers();
			case UMLPackage.PROTOCOL_STATE_MACHINE__IS_LEAF :
				return isLeaf();
			case UMLPackage.PROTOCOL_STATE_MACHINE__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.PROTOCOL_STATE_MACHINE__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.PROTOCOL_STATE_MACHINE__OWNING_TEMPLATE_PARAMETER :
				if (resolve)
					return getOwningTemplateParameter();
				return basicGetOwningTemplateParameter();
			case UMLPackage.PROTOCOL_STATE_MACHINE__TEMPLATE_PARAMETER :
				if (resolve)
					return getTemplateParameter();
				return basicGetTemplateParameter();
			case UMLPackage.PROTOCOL_STATE_MACHINE__PACKAGE :
				if (resolve)
					return getPackage();
				return basicGetPackage();
			case UMLPackage.PROTOCOL_STATE_MACHINE__TEMPLATE_BINDING :
				return getTemplateBindings();
			case UMLPackage.PROTOCOL_STATE_MACHINE__OWNED_TEMPLATE_SIGNATURE :
				if (resolve)
					return getOwnedTemplateSignature();
				return basicGetOwnedTemplateSignature();
			case UMLPackage.PROTOCOL_STATE_MACHINE__FEATURE :
				return getFeatures();
			case UMLPackage.PROTOCOL_STATE_MACHINE__ATTRIBUTE :
				return getAttributes();
			case UMLPackage.PROTOCOL_STATE_MACHINE__COLLABORATION_USE :
				return getCollaborationUses();
			case UMLPackage.PROTOCOL_STATE_MACHINE__GENERAL :
				return getGenerals();
			case UMLPackage.PROTOCOL_STATE_MACHINE__GENERALIZATION :
				return getGeneralizations();
			case UMLPackage.PROTOCOL_STATE_MACHINE__POWERTYPE_EXTENT :
				return getPowertypeExtents();
			case UMLPackage.PROTOCOL_STATE_MACHINE__INHERITED_MEMBER :
				return getInheritedMembers();
			case UMLPackage.PROTOCOL_STATE_MACHINE__IS_ABSTRACT :
				return isAbstract();
			case UMLPackage.PROTOCOL_STATE_MACHINE__IS_FINAL_SPECIALIZATION :
				return isFinalSpecialization();
			case UMLPackage.PROTOCOL_STATE_MACHINE__OWNED_USE_CASE :
				return getOwnedUseCases();
			case UMLPackage.PROTOCOL_STATE_MACHINE__USE_CASE :
				return getUseCases();
			case UMLPackage.PROTOCOL_STATE_MACHINE__REDEFINED_CLASSIFIER :
				return getRedefinedClassifiers();
			case UMLPackage.PROTOCOL_STATE_MACHINE__REPRESENTATION :
				if (resolve)
					return getRepresentation();
				return basicGetRepresentation();
			case UMLPackage.PROTOCOL_STATE_MACHINE__SUBSTITUTION :
				return getSubstitutions();
			case UMLPackage.PROTOCOL_STATE_MACHINE__OWNED_ATTRIBUTE :
				return getOwnedAttributes();
			case UMLPackage.PROTOCOL_STATE_MACHINE__OWNED_CONNECTOR :
				return getOwnedConnectors();
			case UMLPackage.PROTOCOL_STATE_MACHINE__PART :
				return getParts();
			case UMLPackage.PROTOCOL_STATE_MACHINE__ROLE :
				return getRoles();
			case UMLPackage.PROTOCOL_STATE_MACHINE__OWNED_PORT :
				return getOwnedPorts();
			case UMLPackage.PROTOCOL_STATE_MACHINE__CLASSIFIER_BEHAVIOR :
				if (resolve)
					return getClassifierBehavior();
				return basicGetClassifierBehavior();
			case UMLPackage.PROTOCOL_STATE_MACHINE__INTERFACE_REALIZATION :
				return getInterfaceRealizations();
			case UMLPackage.PROTOCOL_STATE_MACHINE__OWNED_BEHAVIOR :
				return getOwnedBehaviors();
			case UMLPackage.PROTOCOL_STATE_MACHINE__OWNED_OPERATION :
				return getOwnedOperations();
			case UMLPackage.PROTOCOL_STATE_MACHINE__EXTENSION :
				return getExtensions();
			case UMLPackage.PROTOCOL_STATE_MACHINE__IS_ACTIVE :
				return isActive();
			case UMLPackage.PROTOCOL_STATE_MACHINE__NESTED_CLASSIFIER :
				return getNestedClassifiers();
			case UMLPackage.PROTOCOL_STATE_MACHINE__OWNED_RECEPTION :
				return getOwnedReceptions();
			case UMLPackage.PROTOCOL_STATE_MACHINE__SUPER_CLASS :
				return getSuperClasses();
			case UMLPackage.PROTOCOL_STATE_MACHINE__SPECIFICATION :
				if (resolve)
					return getSpecification();
				return basicGetSpecification();
			case UMLPackage.PROTOCOL_STATE_MACHINE__CONTEXT :
				if (resolve)
					return getContext();
				return basicGetContext();
			case UMLPackage.PROTOCOL_STATE_MACHINE__IS_REENTRANT :
				return isReentrant();
			case UMLPackage.PROTOCOL_STATE_MACHINE__OWNED_PARAMETER :
				return getOwnedParameters();
			case UMLPackage.PROTOCOL_STATE_MACHINE__OWNED_PARAMETER_SET :
				return getOwnedParameterSets();
			case UMLPackage.PROTOCOL_STATE_MACHINE__POSTCONDITION :
				return getPostconditions();
			case UMLPackage.PROTOCOL_STATE_MACHINE__PRECONDITION :
				return getPreconditions();
			case UMLPackage.PROTOCOL_STATE_MACHINE__REDEFINED_BEHAVIOR :
				return getRedefinedBehaviors();
			case UMLPackage.PROTOCOL_STATE_MACHINE__CONNECTION_POINT :
				return getConnectionPoints();
			case UMLPackage.PROTOCOL_STATE_MACHINE__SUBMACHINE_STATE :
				return getSubmachineStates();
			case UMLPackage.PROTOCOL_STATE_MACHINE__REGION :
				return getRegions();
			case UMLPackage.PROTOCOL_STATE_MACHINE__EXTENDED_STATE_MACHINE :
				return getExtendedStateMachines();
			case UMLPackage.PROTOCOL_STATE_MACHINE__CONFORMANCE :
				return getConformances();
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
			case UMLPackage.PROTOCOL_STATE_MACHINE__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations()
					.addAll((Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.PROTOCOL_STATE_MACHINE__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments()
					.addAll((Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.PROTOCOL_STATE_MACHINE__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.PROTOCOL_STATE_MACHINE__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.PROTOCOL_STATE_MACHINE__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.PROTOCOL_STATE_MACHINE__OWNED_RULE :
				getOwnedRules().clear();
				getOwnedRules()
					.addAll((Collection<? extends Constraint>) newValue);
				return;
			case UMLPackage.PROTOCOL_STATE_MACHINE__ELEMENT_IMPORT :
				getElementImports().clear();
				getElementImports()
					.addAll((Collection<? extends ElementImport>) newValue);
				return;
			case UMLPackage.PROTOCOL_STATE_MACHINE__PACKAGE_IMPORT :
				getPackageImports().clear();
				getPackageImports()
					.addAll((Collection<? extends PackageImport>) newValue);
				return;
			case UMLPackage.PROTOCOL_STATE_MACHINE__IS_LEAF :
				setIsLeaf((Boolean) newValue);
				return;
			case UMLPackage.PROTOCOL_STATE_MACHINE__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.PROTOCOL_STATE_MACHINE__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.PROTOCOL_STATE_MACHINE__PACKAGE :
				setPackage((org.eclipse.uml2.uml.Package) newValue);
				return;
			case UMLPackage.PROTOCOL_STATE_MACHINE__TEMPLATE_BINDING :
				getTemplateBindings().clear();
				getTemplateBindings()
					.addAll((Collection<? extends TemplateBinding>) newValue);
				return;
			case UMLPackage.PROTOCOL_STATE_MACHINE__OWNED_TEMPLATE_SIGNATURE :
				setOwnedTemplateSignature((TemplateSignature) newValue);
				return;
			case UMLPackage.PROTOCOL_STATE_MACHINE__COLLABORATION_USE :
				getCollaborationUses().clear();
				getCollaborationUses()
					.addAll((Collection<? extends CollaborationUse>) newValue);
				return;
			case UMLPackage.PROTOCOL_STATE_MACHINE__GENERAL :
				getGenerals().clear();
				getGenerals()
					.addAll((Collection<? extends Classifier>) newValue);
				return;
			case UMLPackage.PROTOCOL_STATE_MACHINE__GENERALIZATION :
				getGeneralizations().clear();
				getGeneralizations()
					.addAll((Collection<? extends Generalization>) newValue);
				return;
			case UMLPackage.PROTOCOL_STATE_MACHINE__POWERTYPE_EXTENT :
				getPowertypeExtents().clear();
				getPowertypeExtents()
					.addAll((Collection<? extends GeneralizationSet>) newValue);
				return;
			case UMLPackage.PROTOCOL_STATE_MACHINE__IS_ABSTRACT :
				setIsAbstract((Boolean) newValue);
				return;
			case UMLPackage.PROTOCOL_STATE_MACHINE__IS_FINAL_SPECIALIZATION :
				setIsFinalSpecialization((Boolean) newValue);
				return;
			case UMLPackage.PROTOCOL_STATE_MACHINE__OWNED_USE_CASE :
				getOwnedUseCases().clear();
				getOwnedUseCases()
					.addAll((Collection<? extends UseCase>) newValue);
				return;
			case UMLPackage.PROTOCOL_STATE_MACHINE__USE_CASE :
				getUseCases().clear();
				getUseCases().addAll((Collection<? extends UseCase>) newValue);
				return;
			case UMLPackage.PROTOCOL_STATE_MACHINE__REDEFINED_CLASSIFIER :
				getRedefinedClassifiers().clear();
				getRedefinedClassifiers()
					.addAll((Collection<? extends Classifier>) newValue);
				return;
			case UMLPackage.PROTOCOL_STATE_MACHINE__REPRESENTATION :
				setRepresentation((CollaborationUse) newValue);
				return;
			case UMLPackage.PROTOCOL_STATE_MACHINE__SUBSTITUTION :
				getSubstitutions().clear();
				getSubstitutions()
					.addAll((Collection<? extends Substitution>) newValue);
				return;
			case UMLPackage.PROTOCOL_STATE_MACHINE__OWNED_ATTRIBUTE :
				getOwnedAttributes().clear();
				getOwnedAttributes()
					.addAll((Collection<? extends Property>) newValue);
				return;
			case UMLPackage.PROTOCOL_STATE_MACHINE__OWNED_CONNECTOR :
				getOwnedConnectors().clear();
				getOwnedConnectors()
					.addAll((Collection<? extends Connector>) newValue);
				return;
			case UMLPackage.PROTOCOL_STATE_MACHINE__CLASSIFIER_BEHAVIOR :
				setClassifierBehavior((Behavior) newValue);
				return;
			case UMLPackage.PROTOCOL_STATE_MACHINE__INTERFACE_REALIZATION :
				getInterfaceRealizations().clear();
				getInterfaceRealizations().addAll(
					(Collection<? extends InterfaceRealization>) newValue);
				return;
			case UMLPackage.PROTOCOL_STATE_MACHINE__OWNED_BEHAVIOR :
				getOwnedBehaviors().clear();
				getOwnedBehaviors()
					.addAll((Collection<? extends Behavior>) newValue);
				return;
			case UMLPackage.PROTOCOL_STATE_MACHINE__OWNED_OPERATION :
				getOwnedOperations().clear();
				getOwnedOperations()
					.addAll((Collection<? extends Operation>) newValue);
				return;
			case UMLPackage.PROTOCOL_STATE_MACHINE__IS_ACTIVE :
				setIsActive((Boolean) newValue);
				return;
			case UMLPackage.PROTOCOL_STATE_MACHINE__NESTED_CLASSIFIER :
				getNestedClassifiers().clear();
				getNestedClassifiers()
					.addAll((Collection<? extends Classifier>) newValue);
				return;
			case UMLPackage.PROTOCOL_STATE_MACHINE__OWNED_RECEPTION :
				getOwnedReceptions().clear();
				getOwnedReceptions()
					.addAll((Collection<? extends Reception>) newValue);
				return;
			case UMLPackage.PROTOCOL_STATE_MACHINE__SUPER_CLASS :
				getSuperClasses().clear();
				getSuperClasses().addAll(
					(Collection<? extends org.eclipse.uml2.uml.Class>) newValue);
				return;
			case UMLPackage.PROTOCOL_STATE_MACHINE__SPECIFICATION :
				setSpecification((BehavioralFeature) newValue);
				return;
			case UMLPackage.PROTOCOL_STATE_MACHINE__IS_REENTRANT :
				setIsReentrant((Boolean) newValue);
				return;
			case UMLPackage.PROTOCOL_STATE_MACHINE__OWNED_PARAMETER :
				getOwnedParameters().clear();
				getOwnedParameters()
					.addAll((Collection<? extends Parameter>) newValue);
				return;
			case UMLPackage.PROTOCOL_STATE_MACHINE__OWNED_PARAMETER_SET :
				getOwnedParameterSets().clear();
				getOwnedParameterSets()
					.addAll((Collection<? extends ParameterSet>) newValue);
				return;
			case UMLPackage.PROTOCOL_STATE_MACHINE__POSTCONDITION :
				getPostconditions().clear();
				getPostconditions()
					.addAll((Collection<? extends Constraint>) newValue);
				return;
			case UMLPackage.PROTOCOL_STATE_MACHINE__PRECONDITION :
				getPreconditions().clear();
				getPreconditions()
					.addAll((Collection<? extends Constraint>) newValue);
				return;
			case UMLPackage.PROTOCOL_STATE_MACHINE__REDEFINED_BEHAVIOR :
				getRedefinedBehaviors().clear();
				getRedefinedBehaviors()
					.addAll((Collection<? extends Behavior>) newValue);
				return;
			case UMLPackage.PROTOCOL_STATE_MACHINE__CONNECTION_POINT :
				getConnectionPoints().clear();
				getConnectionPoints()
					.addAll((Collection<? extends Pseudostate>) newValue);
				return;
			case UMLPackage.PROTOCOL_STATE_MACHINE__SUBMACHINE_STATE :
				getSubmachineStates().clear();
				getSubmachineStates()
					.addAll((Collection<? extends State>) newValue);
				return;
			case UMLPackage.PROTOCOL_STATE_MACHINE__REGION :
				getRegions().clear();
				getRegions().addAll((Collection<? extends Region>) newValue);
				return;
			case UMLPackage.PROTOCOL_STATE_MACHINE__EXTENDED_STATE_MACHINE :
				getExtendedStateMachines().clear();
				getExtendedStateMachines()
					.addAll((Collection<? extends StateMachine>) newValue);
				return;
			case UMLPackage.PROTOCOL_STATE_MACHINE__CONFORMANCE :
				getConformances().clear();
				getConformances().addAll(
					(Collection<? extends ProtocolConformance>) newValue);
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
			case UMLPackage.PROTOCOL_STATE_MACHINE__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.PROTOCOL_STATE_MACHINE__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.PROTOCOL_STATE_MACHINE__NAME :
				unsetName();
				return;
			case UMLPackage.PROTOCOL_STATE_MACHINE__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.PROTOCOL_STATE_MACHINE__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.PROTOCOL_STATE_MACHINE__OWNED_RULE :
				getOwnedRules().clear();
				return;
			case UMLPackage.PROTOCOL_STATE_MACHINE__ELEMENT_IMPORT :
				getElementImports().clear();
				return;
			case UMLPackage.PROTOCOL_STATE_MACHINE__PACKAGE_IMPORT :
				getPackageImports().clear();
				return;
			case UMLPackage.PROTOCOL_STATE_MACHINE__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.PROTOCOL_STATE_MACHINE__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.PROTOCOL_STATE_MACHINE__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.PROTOCOL_STATE_MACHINE__PACKAGE :
				setPackage((org.eclipse.uml2.uml.Package) null);
				return;
			case UMLPackage.PROTOCOL_STATE_MACHINE__TEMPLATE_BINDING :
				getTemplateBindings().clear();
				return;
			case UMLPackage.PROTOCOL_STATE_MACHINE__OWNED_TEMPLATE_SIGNATURE :
				setOwnedTemplateSignature((TemplateSignature) null);
				return;
			case UMLPackage.PROTOCOL_STATE_MACHINE__COLLABORATION_USE :
				getCollaborationUses().clear();
				return;
			case UMLPackage.PROTOCOL_STATE_MACHINE__GENERAL :
				getGenerals().clear();
				return;
			case UMLPackage.PROTOCOL_STATE_MACHINE__GENERALIZATION :
				getGeneralizations().clear();
				return;
			case UMLPackage.PROTOCOL_STATE_MACHINE__POWERTYPE_EXTENT :
				getPowertypeExtents().clear();
				return;
			case UMLPackage.PROTOCOL_STATE_MACHINE__IS_ABSTRACT :
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case UMLPackage.PROTOCOL_STATE_MACHINE__IS_FINAL_SPECIALIZATION :
				setIsFinalSpecialization(IS_FINAL_SPECIALIZATION_EDEFAULT);
				return;
			case UMLPackage.PROTOCOL_STATE_MACHINE__OWNED_USE_CASE :
				getOwnedUseCases().clear();
				return;
			case UMLPackage.PROTOCOL_STATE_MACHINE__USE_CASE :
				getUseCases().clear();
				return;
			case UMLPackage.PROTOCOL_STATE_MACHINE__REDEFINED_CLASSIFIER :
				getRedefinedClassifiers().clear();
				return;
			case UMLPackage.PROTOCOL_STATE_MACHINE__REPRESENTATION :
				setRepresentation((CollaborationUse) null);
				return;
			case UMLPackage.PROTOCOL_STATE_MACHINE__SUBSTITUTION :
				getSubstitutions().clear();
				return;
			case UMLPackage.PROTOCOL_STATE_MACHINE__OWNED_ATTRIBUTE :
				getOwnedAttributes().clear();
				return;
			case UMLPackage.PROTOCOL_STATE_MACHINE__OWNED_CONNECTOR :
				getOwnedConnectors().clear();
				return;
			case UMLPackage.PROTOCOL_STATE_MACHINE__CLASSIFIER_BEHAVIOR :
				setClassifierBehavior((Behavior) null);
				return;
			case UMLPackage.PROTOCOL_STATE_MACHINE__INTERFACE_REALIZATION :
				getInterfaceRealizations().clear();
				return;
			case UMLPackage.PROTOCOL_STATE_MACHINE__OWNED_BEHAVIOR :
				getOwnedBehaviors().clear();
				return;
			case UMLPackage.PROTOCOL_STATE_MACHINE__OWNED_OPERATION :
				getOwnedOperations().clear();
				return;
			case UMLPackage.PROTOCOL_STATE_MACHINE__IS_ACTIVE :
				setIsActive(IS_ACTIVE_EDEFAULT);
				return;
			case UMLPackage.PROTOCOL_STATE_MACHINE__NESTED_CLASSIFIER :
				getNestedClassifiers().clear();
				return;
			case UMLPackage.PROTOCOL_STATE_MACHINE__OWNED_RECEPTION :
				getOwnedReceptions().clear();
				return;
			case UMLPackage.PROTOCOL_STATE_MACHINE__SUPER_CLASS :
				getSuperClasses().clear();
				return;
			case UMLPackage.PROTOCOL_STATE_MACHINE__SPECIFICATION :
				setSpecification((BehavioralFeature) null);
				return;
			case UMLPackage.PROTOCOL_STATE_MACHINE__IS_REENTRANT :
				unsetIsReentrant();
				return;
			case UMLPackage.PROTOCOL_STATE_MACHINE__OWNED_PARAMETER :
				getOwnedParameters().clear();
				return;
			case UMLPackage.PROTOCOL_STATE_MACHINE__OWNED_PARAMETER_SET :
				getOwnedParameterSets().clear();
				return;
			case UMLPackage.PROTOCOL_STATE_MACHINE__POSTCONDITION :
				getPostconditions().clear();
				return;
			case UMLPackage.PROTOCOL_STATE_MACHINE__PRECONDITION :
				getPreconditions().clear();
				return;
			case UMLPackage.PROTOCOL_STATE_MACHINE__REDEFINED_BEHAVIOR :
				getRedefinedBehaviors().clear();
				return;
			case UMLPackage.PROTOCOL_STATE_MACHINE__CONNECTION_POINT :
				getConnectionPoints().clear();
				return;
			case UMLPackage.PROTOCOL_STATE_MACHINE__SUBMACHINE_STATE :
				getSubmachineStates().clear();
				return;
			case UMLPackage.PROTOCOL_STATE_MACHINE__REGION :
				getRegions().clear();
				return;
			case UMLPackage.PROTOCOL_STATE_MACHINE__EXTENDED_STATE_MACHINE :
				getExtendedStateMachines().clear();
				return;
			case UMLPackage.PROTOCOL_STATE_MACHINE__CONFORMANCE :
				getConformances().clear();
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
			case UMLPackage.PROTOCOL_STATE_MACHINE__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.PROTOCOL_STATE_MACHINE__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.PROTOCOL_STATE_MACHINE__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.PROTOCOL_STATE_MACHINE__OWNER :
				return isSetOwner();
			case UMLPackage.PROTOCOL_STATE_MACHINE__CLIENT_DEPENDENCY :
				return !getClientDependencies().isEmpty();
			case UMLPackage.PROTOCOL_STATE_MACHINE__NAME :
				return isSetName();
			case UMLPackage.PROTOCOL_STATE_MACHINE__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.PROTOCOL_STATE_MACHINE__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.PROTOCOL_STATE_MACHINE__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.PROTOCOL_STATE_MACHINE__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.PROTOCOL_STATE_MACHINE__OWNED_RULE :
				return ownedRules != null && !ownedRules.isEmpty();
			case UMLPackage.PROTOCOL_STATE_MACHINE__ELEMENT_IMPORT :
				return elementImports != null && !elementImports.isEmpty();
			case UMLPackage.PROTOCOL_STATE_MACHINE__PACKAGE_IMPORT :
				return packageImports != null && !packageImports.isEmpty();
			case UMLPackage.PROTOCOL_STATE_MACHINE__OWNED_MEMBER :
				return isSetOwnedMembers();
			case UMLPackage.PROTOCOL_STATE_MACHINE__IMPORTED_MEMBER :
				return !getImportedMembers().isEmpty();
			case UMLPackage.PROTOCOL_STATE_MACHINE__MEMBER :
				return isSetMembers();
			case UMLPackage.PROTOCOL_STATE_MACHINE__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.PROTOCOL_STATE_MACHINE__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.PROTOCOL_STATE_MACHINE__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.PROTOCOL_STATE_MACHINE__OWNING_TEMPLATE_PARAMETER :
				return basicGetOwningTemplateParameter() != null;
			case UMLPackage.PROTOCOL_STATE_MACHINE__TEMPLATE_PARAMETER :
				return isSetTemplateParameter();
			case UMLPackage.PROTOCOL_STATE_MACHINE__PACKAGE :
				return basicGetPackage() != null;
			case UMLPackage.PROTOCOL_STATE_MACHINE__TEMPLATE_BINDING :
				return templateBindings != null && !templateBindings.isEmpty();
			case UMLPackage.PROTOCOL_STATE_MACHINE__OWNED_TEMPLATE_SIGNATURE :
				return isSetOwnedTemplateSignature();
			case UMLPackage.PROTOCOL_STATE_MACHINE__FEATURE :
				return isSetFeatures();
			case UMLPackage.PROTOCOL_STATE_MACHINE__ATTRIBUTE :
				return isSetAttributes();
			case UMLPackage.PROTOCOL_STATE_MACHINE__COLLABORATION_USE :
				return collaborationUses != null
					&& !collaborationUses.isEmpty();
			case UMLPackage.PROTOCOL_STATE_MACHINE__GENERAL :
				return isSetGenerals();
			case UMLPackage.PROTOCOL_STATE_MACHINE__GENERALIZATION :
				return generalizations != null && !generalizations.isEmpty();
			case UMLPackage.PROTOCOL_STATE_MACHINE__POWERTYPE_EXTENT :
				return powertypeExtents != null && !powertypeExtents.isEmpty();
			case UMLPackage.PROTOCOL_STATE_MACHINE__INHERITED_MEMBER :
				return !getInheritedMembers().isEmpty();
			case UMLPackage.PROTOCOL_STATE_MACHINE__IS_ABSTRACT :
				return isSetIsAbstract();
			case UMLPackage.PROTOCOL_STATE_MACHINE__IS_FINAL_SPECIALIZATION :
				return ((eFlags
					& IS_FINAL_SPECIALIZATION_EFLAG) != 0) != IS_FINAL_SPECIALIZATION_EDEFAULT;
			case UMLPackage.PROTOCOL_STATE_MACHINE__OWNED_USE_CASE :
				return ownedUseCases != null && !ownedUseCases.isEmpty();
			case UMLPackage.PROTOCOL_STATE_MACHINE__USE_CASE :
				return useCases != null && !useCases.isEmpty();
			case UMLPackage.PROTOCOL_STATE_MACHINE__REDEFINED_CLASSIFIER :
				return redefinedClassifiers != null
					&& !redefinedClassifiers.isEmpty();
			case UMLPackage.PROTOCOL_STATE_MACHINE__REPRESENTATION :
				return representation != null;
			case UMLPackage.PROTOCOL_STATE_MACHINE__SUBSTITUTION :
				return substitutions != null && !substitutions.isEmpty();
			case UMLPackage.PROTOCOL_STATE_MACHINE__OWNED_ATTRIBUTE :
				return isSetOwnedAttributes();
			case UMLPackage.PROTOCOL_STATE_MACHINE__OWNED_CONNECTOR :
				return ownedConnectors != null && !ownedConnectors.isEmpty();
			case UMLPackage.PROTOCOL_STATE_MACHINE__PART :
				return !getParts().isEmpty();
			case UMLPackage.PROTOCOL_STATE_MACHINE__ROLE :
				return isSetRoles();
			case UMLPackage.PROTOCOL_STATE_MACHINE__OWNED_PORT :
				return !getOwnedPorts().isEmpty();
			case UMLPackage.PROTOCOL_STATE_MACHINE__CLASSIFIER_BEHAVIOR :
				return classifierBehavior != null;
			case UMLPackage.PROTOCOL_STATE_MACHINE__INTERFACE_REALIZATION :
				return interfaceRealizations != null
					&& !interfaceRealizations.isEmpty();
			case UMLPackage.PROTOCOL_STATE_MACHINE__OWNED_BEHAVIOR :
				return ownedBehaviors != null && !ownedBehaviors.isEmpty();
			case UMLPackage.PROTOCOL_STATE_MACHINE__OWNED_OPERATION :
				return ownedOperations != null && !ownedOperations.isEmpty();
			case UMLPackage.PROTOCOL_STATE_MACHINE__EXTENSION :
				return !getExtensions().isEmpty();
			case UMLPackage.PROTOCOL_STATE_MACHINE__IS_ACTIVE :
				return ((eFlags & IS_ACTIVE_EFLAG) != 0) != IS_ACTIVE_EDEFAULT;
			case UMLPackage.PROTOCOL_STATE_MACHINE__NESTED_CLASSIFIER :
				return nestedClassifiers != null
					&& !nestedClassifiers.isEmpty();
			case UMLPackage.PROTOCOL_STATE_MACHINE__OWNED_RECEPTION :
				return ownedReceptions != null && !ownedReceptions.isEmpty();
			case UMLPackage.PROTOCOL_STATE_MACHINE__SUPER_CLASS :
				return isSetSuperClasses();
			case UMLPackage.PROTOCOL_STATE_MACHINE__SPECIFICATION :
				return specification != null;
			case UMLPackage.PROTOCOL_STATE_MACHINE__CONTEXT :
				return basicGetContext() != null;
			case UMLPackage.PROTOCOL_STATE_MACHINE__IS_REENTRANT :
				return isSetIsReentrant();
			case UMLPackage.PROTOCOL_STATE_MACHINE__OWNED_PARAMETER :
				return ownedParameters != null && !ownedParameters.isEmpty();
			case UMLPackage.PROTOCOL_STATE_MACHINE__OWNED_PARAMETER_SET :
				return ownedParameterSets != null
					&& !ownedParameterSets.isEmpty();
			case UMLPackage.PROTOCOL_STATE_MACHINE__POSTCONDITION :
				return postconditions != null && !postconditions.isEmpty();
			case UMLPackage.PROTOCOL_STATE_MACHINE__PRECONDITION :
				return preconditions != null && !preconditions.isEmpty();
			case UMLPackage.PROTOCOL_STATE_MACHINE__REDEFINED_BEHAVIOR :
				return isSetRedefinedBehaviors();
			case UMLPackage.PROTOCOL_STATE_MACHINE__CONNECTION_POINT :
				return connectionPoints != null && !connectionPoints.isEmpty();
			case UMLPackage.PROTOCOL_STATE_MACHINE__SUBMACHINE_STATE :
				return submachineStates != null && !submachineStates.isEmpty();
			case UMLPackage.PROTOCOL_STATE_MACHINE__REGION :
				return regions != null && !regions.isEmpty();
			case UMLPackage.PROTOCOL_STATE_MACHINE__EXTENDED_STATE_MACHINE :
				return isSetExtendedStateMachines();
			case UMLPackage.PROTOCOL_STATE_MACHINE__CONFORMANCE :
				return conformances != null && !conformances.isEmpty();
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
			case UMLPackage.PROTOCOL_STATE_MACHINE___GET_EANNOTATION__STRING :
				return getEAnnotation((String) arguments.get(0));
			case UMLPackage.PROTOCOL_STATE_MACHINE___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP :
				return validateHasOwner((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PROTOCOL_STATE_MACHINE___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP :
				return validateNotOwnSelf((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PROTOCOL_STATE_MACHINE___ADD_KEYWORD__STRING :
				return addKeyword((String) arguments.get(0));
			case UMLPackage.PROTOCOL_STATE_MACHINE___APPLY_STEREOTYPE__STEREOTYPE :
				return applyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.PROTOCOL_STATE_MACHINE___CREATE_EANNOTATION__STRING :
				return createEAnnotation((String) arguments.get(0));
			case UMLPackage.PROTOCOL_STATE_MACHINE___DESTROY :
				destroy();
				return null;
			case UMLPackage.PROTOCOL_STATE_MACHINE___GET_KEYWORDS :
				return getKeywords();
			case UMLPackage.PROTOCOL_STATE_MACHINE___GET_APPLICABLE_STEREOTYPE__STRING :
				return getApplicableStereotype((String) arguments.get(0));
			case UMLPackage.PROTOCOL_STATE_MACHINE___GET_APPLICABLE_STEREOTYPES :
				return getApplicableStereotypes();
			case UMLPackage.PROTOCOL_STATE_MACHINE___GET_APPLIED_STEREOTYPE__STRING :
				return getAppliedStereotype((String) arguments.get(0));
			case UMLPackage.PROTOCOL_STATE_MACHINE___GET_APPLIED_STEREOTYPES :
				return getAppliedStereotypes();
			case UMLPackage.PROTOCOL_STATE_MACHINE___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING :
				return getAppliedSubstereotype((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.PROTOCOL_STATE_MACHINE___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE :
				return getAppliedSubstereotypes((Stereotype) arguments.get(0));
			case UMLPackage.PROTOCOL_STATE_MACHINE___GET_MODEL :
				return getModel();
			case UMLPackage.PROTOCOL_STATE_MACHINE___GET_NEAREST_PACKAGE :
				return getNearestPackage();
			case UMLPackage.PROTOCOL_STATE_MACHINE___GET_RELATIONSHIPS :
				return getRelationships();
			case UMLPackage.PROTOCOL_STATE_MACHINE___GET_RELATIONSHIPS__ECLASS :
				return getRelationships((EClass) arguments.get(0));
			case UMLPackage.PROTOCOL_STATE_MACHINE___GET_REQUIRED_STEREOTYPE__STRING :
				return getRequiredStereotype((String) arguments.get(0));
			case UMLPackage.PROTOCOL_STATE_MACHINE___GET_REQUIRED_STEREOTYPES :
				return getRequiredStereotypes();
			case UMLPackage.PROTOCOL_STATE_MACHINE___GET_SOURCE_DIRECTED_RELATIONSHIPS :
				return getSourceDirectedRelationships();
			case UMLPackage.PROTOCOL_STATE_MACHINE___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS :
				return getSourceDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.PROTOCOL_STATE_MACHINE___GET_STEREOTYPE_APPLICATION__STEREOTYPE :
				return getStereotypeApplication((Stereotype) arguments.get(0));
			case UMLPackage.PROTOCOL_STATE_MACHINE___GET_STEREOTYPE_APPLICATIONS :
				return getStereotypeApplications();
			case UMLPackage.PROTOCOL_STATE_MACHINE___GET_TARGET_DIRECTED_RELATIONSHIPS :
				return getTargetDirectedRelationships();
			case UMLPackage.PROTOCOL_STATE_MACHINE___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS :
				return getTargetDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.PROTOCOL_STATE_MACHINE___GET_VALUE__STEREOTYPE_STRING :
				return getValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.PROTOCOL_STATE_MACHINE___HAS_KEYWORD__STRING :
				return hasKeyword((String) arguments.get(0));
			case UMLPackage.PROTOCOL_STATE_MACHINE___HAS_VALUE__STEREOTYPE_STRING :
				return hasValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.PROTOCOL_STATE_MACHINE___IS_STEREOTYPE_APPLICABLE__STEREOTYPE :
				return isStereotypeApplicable((Stereotype) arguments.get(0));
			case UMLPackage.PROTOCOL_STATE_MACHINE___IS_STEREOTYPE_APPLIED__STEREOTYPE :
				return isStereotypeApplied((Stereotype) arguments.get(0));
			case UMLPackage.PROTOCOL_STATE_MACHINE___IS_STEREOTYPE_REQUIRED__STEREOTYPE :
				return isStereotypeRequired((Stereotype) arguments.get(0));
			case UMLPackage.PROTOCOL_STATE_MACHINE___REMOVE_KEYWORD__STRING :
				return removeKeyword((String) arguments.get(0));
			case UMLPackage.PROTOCOL_STATE_MACHINE___SET_VALUE__STEREOTYPE_STRING_OBJECT :
				setValue((Stereotype) arguments.get(0),
					(String) arguments.get(1), arguments.get(2));
				return null;
			case UMLPackage.PROTOCOL_STATE_MACHINE___UNAPPLY_STEREOTYPE__STEREOTYPE :
				return unapplyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.PROTOCOL_STATE_MACHINE___ALL_OWNED_ELEMENTS :
				return allOwnedElements();
			case UMLPackage.PROTOCOL_STATE_MACHINE___MUST_BE_OWNED :
				return mustBeOwned();
			case UMLPackage.PROTOCOL_STATE_MACHINE___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP :
				return validateVisibilityNeedsOwnership(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PROTOCOL_STATE_MACHINE___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PROTOCOL_STATE_MACHINE___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasNoQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PROTOCOL_STATE_MACHINE___CREATE_DEPENDENCY__NAMEDELEMENT :
				return createDependency((NamedElement) arguments.get(0));
			case UMLPackage.PROTOCOL_STATE_MACHINE___CREATE_USAGE__NAMEDELEMENT :
				return createUsage((NamedElement) arguments.get(0));
			case UMLPackage.PROTOCOL_STATE_MACHINE___GET_LABEL :
				return getLabel();
			case UMLPackage.PROTOCOL_STATE_MACHINE___GET_LABEL__BOOLEAN :
				return getLabel((Boolean) arguments.get(0));
			case UMLPackage.PROTOCOL_STATE_MACHINE___GET_NAMESPACE :
				return getNamespace();
			case UMLPackage.PROTOCOL_STATE_MACHINE___ALL_NAMESPACES :
				return allNamespaces();
			case UMLPackage.PROTOCOL_STATE_MACHINE___ALL_OWNING_PACKAGES :
				return allOwningPackages();
			case UMLPackage.PROTOCOL_STATE_MACHINE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE :
				return isDistinguishableFrom((NamedElement) arguments.get(0),
					(Namespace) arguments.get(1));
			case UMLPackage.PROTOCOL_STATE_MACHINE___GET_QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.PROTOCOL_STATE_MACHINE___SEPARATOR :
				return separator();
			case UMLPackage.PROTOCOL_STATE_MACHINE___GET_CLIENT_DEPENDENCIES :
				return getClientDependencies();
			case UMLPackage.PROTOCOL_STATE_MACHINE___VALIDATE_MEMBERS_DISTINGUISHABLE__DIAGNOSTICCHAIN_MAP :
				return validateMembersDistinguishable(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PROTOCOL_STATE_MACHINE___VALIDATE_CANNOT_IMPORT_SELF__DIAGNOSTICCHAIN_MAP :
				return validateCannotImportSelf(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PROTOCOL_STATE_MACHINE___VALIDATE_CANNOT_IMPORT_OWNED_MEMBERS__DIAGNOSTICCHAIN_MAP :
				return validateCannotImportOwnedMembers(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PROTOCOL_STATE_MACHINE___CREATE_ELEMENT_IMPORT__PACKAGEABLEELEMENT_VISIBILITYKIND :
				return createElementImport(
					(PackageableElement) arguments.get(0),
					(VisibilityKind) arguments.get(1));
			case UMLPackage.PROTOCOL_STATE_MACHINE___CREATE_PACKAGE_IMPORT__PACKAGE_VISIBILITYKIND :
				return createPackageImport(
					(org.eclipse.uml2.uml.Package) arguments.get(0),
					(VisibilityKind) arguments.get(1));
			case UMLPackage.PROTOCOL_STATE_MACHINE___GET_IMPORTED_ELEMENTS :
				return getImportedElements();
			case UMLPackage.PROTOCOL_STATE_MACHINE___GET_IMPORTED_PACKAGES :
				return getImportedPackages();
			case UMLPackage.PROTOCOL_STATE_MACHINE___GET_OWNED_MEMBERS :
				return getOwnedMembers();
			case UMLPackage.PROTOCOL_STATE_MACHINE___EXCLUDE_COLLISIONS__ELIST :
				return excludeCollisions(
					(EList<PackageableElement>) arguments.get(0));
			case UMLPackage.PROTOCOL_STATE_MACHINE___GET_NAMES_OF_MEMBER__NAMEDELEMENT :
				return getNamesOfMember((NamedElement) arguments.get(0));
			case UMLPackage.PROTOCOL_STATE_MACHINE___IMPORT_MEMBERS__ELIST :
				return importMembers(
					(EList<PackageableElement>) arguments.get(0));
			case UMLPackage.PROTOCOL_STATE_MACHINE___GET_IMPORTED_MEMBERS :
				return getImportedMembers();
			case UMLPackage.PROTOCOL_STATE_MACHINE___MEMBERS_ARE_DISTINGUISHABLE :
				return membersAreDistinguishable();
			case UMLPackage.PROTOCOL_STATE_MACHINE___VALIDATE_REDEFINITION_CONSISTENT__DIAGNOSTICCHAIN_MAP :
				return validateRedefinitionConsistent(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PROTOCOL_STATE_MACHINE___VALIDATE_NON_LEAF_REDEFINITION__DIAGNOSTICCHAIN_MAP :
				return validateNonLeafRedefinition(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PROTOCOL_STATE_MACHINE___VALIDATE_REDEFINITION_CONTEXT_VALID__DIAGNOSTICCHAIN_MAP :
				return validateRedefinitionContextValid(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PROTOCOL_STATE_MACHINE___IS_CONSISTENT_WITH__REDEFINABLEELEMENT :
				return isConsistentWith((RedefinableElement) arguments.get(0));
			case UMLPackage.PROTOCOL_STATE_MACHINE___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT :
				return isRedefinitionContextValid(
					(RedefinableElement) arguments.get(0));
			case UMLPackage.PROTOCOL_STATE_MACHINE___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT :
				return isCompatibleWith(
					(ParameterableElement) arguments.get(0));
			case UMLPackage.PROTOCOL_STATE_MACHINE___IS_TEMPLATE_PARAMETER :
				return isTemplateParameter();
			case UMLPackage.PROTOCOL_STATE_MACHINE___VALIDATE_NAMESPACE_NEEDS_VISIBILITY__DIAGNOSTICCHAIN_MAP :
				return validateNamespaceNeedsVisibility(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PROTOCOL_STATE_MACHINE___CREATE_ASSOCIATION__BOOLEAN_AGGREGATIONKIND_STRING_INT_INT_TYPE_BOOLEAN_AGGREGATIONKIND_STRING_INT_INT :
				return createAssociation((Boolean) arguments.get(0),
					(AggregationKind) arguments.get(1),
					(String) arguments.get(2), (Integer) arguments.get(3),
					(Integer) arguments.get(4), (Type) arguments.get(5),
					(Boolean) arguments.get(6),
					(AggregationKind) arguments.get(7),
					(String) arguments.get(8), (Integer) arguments.get(9),
					(Integer) arguments.get(10));
			case UMLPackage.PROTOCOL_STATE_MACHINE___GET_ASSOCIATIONS :
				return getAssociations();
			case UMLPackage.PROTOCOL_STATE_MACHINE___CONFORMS_TO__TYPE :
				return conformsTo((Type) arguments.get(0));
			case UMLPackage.PROTOCOL_STATE_MACHINE___IS_TEMPLATE :
				return isTemplate();
			case UMLPackage.PROTOCOL_STATE_MACHINE___PARAMETERABLE_ELEMENTS :
				return parameterableElements();
			case UMLPackage.PROTOCOL_STATE_MACHINE___VALIDATE_SPECIALIZE_TYPE__DIAGNOSTICCHAIN_MAP :
				return validateSpecializeType(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PROTOCOL_STATE_MACHINE___VALIDATE_MAPS_TO_GENERALIZATION_SET__DIAGNOSTICCHAIN_MAP :
				return validateMapsToGeneralizationSet(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PROTOCOL_STATE_MACHINE___VALIDATE_NON_FINAL_PARENTS__DIAGNOSTICCHAIN_MAP :
				return validateNonFinalParents(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PROTOCOL_STATE_MACHINE___VALIDATE_NO_CYCLES_IN_GENERALIZATION__DIAGNOSTICCHAIN_MAP :
				return validateNoCyclesInGeneralization(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PROTOCOL_STATE_MACHINE___GET_ALL_ATTRIBUTES :
				return getAllAttributes();
			case UMLPackage.PROTOCOL_STATE_MACHINE___GET_ALL_OPERATIONS :
				return getAllOperations();
			case UMLPackage.PROTOCOL_STATE_MACHINE___GET_ALL_USED_INTERFACES :
				return getAllUsedInterfaces();
			case UMLPackage.PROTOCOL_STATE_MACHINE___GET_OPERATION__STRING_ELIST_ELIST :
				return getOperation((String) arguments.get(0),
					(EList<String>) arguments.get(1),
					(EList<Type>) arguments.get(2));
			case UMLPackage.PROTOCOL_STATE_MACHINE___GET_OPERATION__STRING_ELIST_ELIST_BOOLEAN :
				return getOperation((String) arguments.get(0),
					(EList<String>) arguments.get(1),
					(EList<Type>) arguments.get(2), (Boolean) arguments.get(3));
			case UMLPackage.PROTOCOL_STATE_MACHINE___GET_OPERATIONS :
				return getOperations();
			case UMLPackage.PROTOCOL_STATE_MACHINE___GET_USED_INTERFACES :
				return getUsedInterfaces();
			case UMLPackage.PROTOCOL_STATE_MACHINE___ALL_FEATURES :
				return allFeatures();
			case UMLPackage.PROTOCOL_STATE_MACHINE___ALL_PARENTS :
				return allParents();
			case UMLPackage.PROTOCOL_STATE_MACHINE___GET_GENERALS :
				return getGenerals();
			case UMLPackage.PROTOCOL_STATE_MACHINE___HAS_VISIBILITY_OF__NAMEDELEMENT :
				return hasVisibilityOf((NamedElement) arguments.get(0));
			case UMLPackage.PROTOCOL_STATE_MACHINE___INHERIT__ELIST :
				return inherit((EList<NamedElement>) arguments.get(0));
			case UMLPackage.PROTOCOL_STATE_MACHINE___INHERITABLE_MEMBERS__CLASSIFIER :
				return inheritableMembers((Classifier) arguments.get(0));
			case UMLPackage.PROTOCOL_STATE_MACHINE___GET_INHERITED_MEMBERS :
				return getInheritedMembers();
			case UMLPackage.PROTOCOL_STATE_MACHINE___MAY_SPECIALIZE_TYPE__CLASSIFIER :
				return maySpecializeType((Classifier) arguments.get(0));
			case UMLPackage.PROTOCOL_STATE_MACHINE___PARENTS :
				return parents();
			case UMLPackage.PROTOCOL_STATE_MACHINE___DIRECTLY_REALIZED_INTERFACES :
				return directlyRealizedInterfaces();
			case UMLPackage.PROTOCOL_STATE_MACHINE___DIRECTLY_USED_INTERFACES :
				return directlyUsedInterfaces();
			case UMLPackage.PROTOCOL_STATE_MACHINE___ALL_REALIZED_INTERFACES :
				return allRealizedInterfaces();
			case UMLPackage.PROTOCOL_STATE_MACHINE___ALL_USED_INTERFACES :
				return allUsedInterfaces();
			case UMLPackage.PROTOCOL_STATE_MACHINE___IS_SUBSTITUTABLE_FOR__CLASSIFIER :
				return isSubstitutableFor((Classifier) arguments.get(0));
			case UMLPackage.PROTOCOL_STATE_MACHINE___ALL_ATTRIBUTES :
				return allAttributes();
			case UMLPackage.PROTOCOL_STATE_MACHINE___ALL_SLOTTABLE_FEATURES :
				return allSlottableFeatures();
			case UMLPackage.PROTOCOL_STATE_MACHINE___CREATE_OWNED_ATTRIBUTE__STRING_TYPE_INT_INT :
				return createOwnedAttribute((String) arguments.get(0),
					(Type) arguments.get(1), (Integer) arguments.get(2),
					(Integer) arguments.get(3));
			case UMLPackage.PROTOCOL_STATE_MACHINE___GET_PARTS :
				return getParts();
			case UMLPackage.PROTOCOL_STATE_MACHINE___ALL_ROLES :
				return allRoles();
			case UMLPackage.PROTOCOL_STATE_MACHINE___GET_OWNED_PORTS :
				return getOwnedPorts();
			case UMLPackage.PROTOCOL_STATE_MACHINE___VALIDATE_CLASS_BEHAVIOR__DIAGNOSTICCHAIN_MAP :
				return validateClassBehavior((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PROTOCOL_STATE_MACHINE___GET_ALL_IMPLEMENTED_INTERFACES :
				return getAllImplementedInterfaces();
			case UMLPackage.PROTOCOL_STATE_MACHINE___GET_IMPLEMENTED_INTERFACES :
				return getImplementedInterfaces();
			case UMLPackage.PROTOCOL_STATE_MACHINE___VALIDATE_PASSIVE_CLASS__DIAGNOSTICCHAIN_MAP :
				return validatePassiveClass((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PROTOCOL_STATE_MACHINE___CREATE_OWNED_OPERATION__STRING_ELIST_ELIST_TYPE :
				return createOwnedOperation((String) arguments.get(0),
					(EList<String>) arguments.get(1),
					(EList<Type>) arguments.get(2), (Type) arguments.get(3));
			case UMLPackage.PROTOCOL_STATE_MACHINE___IS_METACLASS :
				return isMetaclass();
			case UMLPackage.PROTOCOL_STATE_MACHINE___GET_EXTENSIONS :
				return getExtensions();
			case UMLPackage.PROTOCOL_STATE_MACHINE___GET_SUPER_CLASSES :
				return getSuperClasses();
			case UMLPackage.PROTOCOL_STATE_MACHINE___VALIDATE_MOST_ONE_BEHAVIOR__DIAGNOSTICCHAIN_MAP :
				return validateMostOneBehavior(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PROTOCOL_STATE_MACHINE___VALIDATE_PARAMETERS_MATCH__DIAGNOSTICCHAIN_MAP :
				return validateParametersMatch(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PROTOCOL_STATE_MACHINE___VALIDATE_FEATURE_OF_CONTEXT_CLASSIFIER__DIAGNOSTICCHAIN_MAP :
				return validateFeatureOfContextClassifier(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PROTOCOL_STATE_MACHINE___GET_CONTEXT :
				return getContext();
			case UMLPackage.PROTOCOL_STATE_MACHINE___BEHAVIORED_CLASSIFIER__ELEMENT :
				return behavioredClassifier((Element) arguments.get(0));
			case UMLPackage.PROTOCOL_STATE_MACHINE___INPUT_PARAMETERS :
				return inputParameters();
			case UMLPackage.PROTOCOL_STATE_MACHINE___OUTPUT_PARAMETERS :
				return outputParameters();
			case UMLPackage.PROTOCOL_STATE_MACHINE___VALIDATE_CONNECTION_POINTS__DIAGNOSTICCHAIN_MAP :
				return validateConnectionPoints(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PROTOCOL_STATE_MACHINE___VALIDATE_CLASSIFIER_CONTEXT__DIAGNOSTICCHAIN_MAP :
				return validateClassifierContext(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PROTOCOL_STATE_MACHINE___VALIDATE_METHOD__DIAGNOSTICCHAIN_MAP :
				return validateMethod((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PROTOCOL_STATE_MACHINE___VALIDATE_CONTEXT_CLASSIFIER__DIAGNOSTICCHAIN_MAP :
				return validateContextClassifier(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PROTOCOL_STATE_MACHINE___LCA__VERTEX_VERTEX :
				return LCA((Vertex) arguments.get(0),
					(Vertex) arguments.get(1));
			case UMLPackage.PROTOCOL_STATE_MACHINE___ANCESTOR__VERTEX_VERTEX :
				return ancestor((Vertex) arguments.get(0),
					(Vertex) arguments.get(1));
			case UMLPackage.PROTOCOL_STATE_MACHINE___LCA_STATE__VERTEX_VERTEX :
				return LCAState((Vertex) arguments.get(0),
					(Vertex) arguments.get(1));
			case UMLPackage.PROTOCOL_STATE_MACHINE___VALIDATE_DEEP_OR_SHALLOW_HISTORY__DIAGNOSTICCHAIN_MAP :
				return validateDeepOrShallowHistory(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PROTOCOL_STATE_MACHINE___VALIDATE_ENTRY_EXIT_DO__DIAGNOSTICCHAIN_MAP :
				return validateEntryExitDo((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PROTOCOL_STATE_MACHINE___VALIDATE_PROTOCOL_TRANSITIONS__DIAGNOSTICCHAIN_MAP :
				return validateProtocolTransitions(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		}
		return eDynamicInvoke(operationID, arguments);
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
		UMLPackage.PROTOCOL_STATE_MACHINE__OWNED_COMMENT,
		UMLPackage.PROTOCOL_STATE_MACHINE__NAME_EXPRESSION,
		UMLPackage.PROTOCOL_STATE_MACHINE__ELEMENT_IMPORT,
		UMLPackage.PROTOCOL_STATE_MACHINE__PACKAGE_IMPORT,
		UMLPackage.PROTOCOL_STATE_MACHINE__OWNED_MEMBER,
		UMLPackage.PROTOCOL_STATE_MACHINE__TEMPLATE_BINDING,
		UMLPackage.PROTOCOL_STATE_MACHINE__OWNED_TEMPLATE_SIGNATURE,
		UMLPackage.PROTOCOL_STATE_MACHINE__COLLABORATION_USE,
		UMLPackage.PROTOCOL_STATE_MACHINE__GENERALIZATION,
		UMLPackage.PROTOCOL_STATE_MACHINE__SUBSTITUTION,
		UMLPackage.PROTOCOL_STATE_MACHINE__INTERFACE_REALIZATION,
		UMLPackage.PROTOCOL_STATE_MACHINE__CONFORMANCE};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| eIsSet(UMLPackage.PROTOCOL_STATE_MACHINE__CONFORMANCE);
	}

} //ProtocolStateMachineImpl
