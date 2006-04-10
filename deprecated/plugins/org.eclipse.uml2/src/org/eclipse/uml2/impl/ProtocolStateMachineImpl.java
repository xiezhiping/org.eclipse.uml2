/*
 * Copyright (c) 2003, 2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: ProtocolStateMachineImpl.java,v 1.36 2006/04/10 20:40:19 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.Behavior;
import org.eclipse.uml2.BehavioralFeature;
import org.eclipse.uml2.BehavioredClassifier;
import org.eclipse.uml2.CollaborationOccurrence;
import org.eclipse.uml2.ProtocolConformance;
import org.eclipse.uml2.ProtocolStateMachine;
import org.eclipse.uml2.StateMachine;
import org.eclipse.uml2.StringExpression;
import org.eclipse.uml2.TemplateParameter;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Protocol State Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.ProtocolStateMachineImpl#getConformances <em>Conformance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProtocolStateMachineImpl extends StateMachineImpl implements ProtocolStateMachine {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getConformances() <em>Conformance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConformances()
	 * @generated
	 * @ordered
	 */
	protected EList conformances = null;

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
	protected EClass eStaticClass() {
		return UML2Package.Literals.PROTOCOL_STATE_MACHINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getConformances() {
		if (conformances == null) {
			conformances = new EObjectContainmentWithInverseEList(ProtocolConformance.class, this, UML2Package.PROTOCOL_STATE_MACHINE__CONFORMANCE, UML2Package.PROTOCOL_CONFORMANCE__SPECIFIC_MACHINE);
		}
		return conformances;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @deprecated Use #createConformance() instead.
	 */
	public ProtocolConformance createConformance(EClass eClass) {
		ProtocolConformance newConformance = (ProtocolConformance) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.PROTOCOL_STATE_MACHINE__CONFORMANCE, null, newConformance));
		}
		getConformances().add(newConformance);
		return newConformance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ProtocolConformance createConformance() {
		ProtocolConformance newConformance = UML2Factory.eINSTANCE.createProtocolConformance();
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.PROTOCOL_STATE_MACHINE__CONFORMANCE, null, newConformance));
		}
		getConformances().add(newConformance);
		return newConformance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UML2Package.PROTOCOL_STATE_MACHINE__EANNOTATIONS:
				return ((InternalEList)getEAnnotations()).basicAdd(otherEnd, msgs);
			case UML2Package.PROTOCOL_STATE_MACHINE__TEMPLATE_BINDING:
				return ((InternalEList)getTemplateBindings()).basicAdd(otherEnd, msgs);
			case UML2Package.PROTOCOL_STATE_MACHINE__OWNED_TEMPLATE_SIGNATURE:
				if (ownedTemplateSignature != null)
					msgs = ((InternalEObject)ownedTemplateSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.PROTOCOL_STATE_MACHINE__OWNED_TEMPLATE_SIGNATURE, null, msgs);
				return basicSetOwnedTemplateSignature((TemplateSignature)otherEnd, msgs);
			case UML2Package.PROTOCOL_STATE_MACHINE__CLIENT_DEPENDENCY:
				return ((InternalEList)getClientDependencies()).basicAdd(otherEnd, msgs);
			case UML2Package.PROTOCOL_STATE_MACHINE__OWNED_RULE:
				return ((InternalEList)getOwnedRules()).basicAdd(otherEnd, msgs);
			case UML2Package.PROTOCOL_STATE_MACHINE__ELEMENT_IMPORT:
				return ((InternalEList)getElementImports()).basicAdd(otherEnd, msgs);
			case UML2Package.PROTOCOL_STATE_MACHINE__PACKAGE_IMPORT:
				return ((InternalEList)getPackageImports()).basicAdd(otherEnd, msgs);
			case UML2Package.PROTOCOL_STATE_MACHINE__TEMPLATE_PARAMETER:
				if (templateParameter != null)
					msgs = ((InternalEObject)templateParameter).eInverseRemove(this, UML2Package.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
				return basicSetTemplateParameter((TemplateParameter)otherEnd, msgs);
			case UML2Package.PROTOCOL_STATE_MACHINE__OWNING_PARAMETER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningParameter((TemplateParameter)otherEnd, msgs);
			case UML2Package.PROTOCOL_STATE_MACHINE__GENERALIZATION:
				return ((InternalEList)getGeneralizations()).basicAdd(otherEnd, msgs);
			case UML2Package.PROTOCOL_STATE_MACHINE__SUBSTITUTION:
				return ((InternalEList)getSubstitutions()).basicAdd(otherEnd, msgs);
			case UML2Package.PROTOCOL_STATE_MACHINE__POWERTYPE_EXTENT:
				return ((InternalEList)getPowertypeExtents()).basicAdd(otherEnd, msgs);
			case UML2Package.PROTOCOL_STATE_MACHINE__USE_CASE:
				return ((InternalEList)getUseCases()).basicAdd(otherEnd, msgs);
			case UML2Package.PROTOCOL_STATE_MACHINE__OWNED_BEHAVIOR:
				return ((InternalEList)getOwnedBehaviors()).basicAdd(otherEnd, msgs);
			case UML2Package.PROTOCOL_STATE_MACHINE__IMPLEMENTATION:
				return ((InternalEList)getImplementations()).basicAdd(otherEnd, msgs);
			case UML2Package.PROTOCOL_STATE_MACHINE__OWNED_STATE_MACHINE:
				return ((InternalEList)getOwnedStateMachines()).basicAdd(otherEnd, msgs);
			case UML2Package.PROTOCOL_STATE_MACHINE__OWNED_OPERATION:
				return ((InternalEList)getOwnedOperations()).basicAdd(otherEnd, msgs);
			case UML2Package.PROTOCOL_STATE_MACHINE__CONTEXT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetContext((BehavioredClassifier)otherEnd, msgs);
			case UML2Package.PROTOCOL_STATE_MACHINE__SPECIFICATION:
				if (specification != null)
					msgs = ((InternalEObject)specification).eInverseRemove(this, UML2Package.BEHAVIORAL_FEATURE__METHOD, BehavioralFeature.class, msgs);
				return basicSetSpecification((BehavioralFeature)otherEnd, msgs);
			case UML2Package.PROTOCOL_STATE_MACHINE__REGION:
				return ((InternalEList)getRegions()).basicAdd(otherEnd, msgs);
			case UML2Package.PROTOCOL_STATE_MACHINE__STATE_MACHINE_REDEFINITION_CONTEXT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetStateMachine_redefinitionContext((BehavioredClassifier)otherEnd, msgs);
			case UML2Package.PROTOCOL_STATE_MACHINE__CONFORMANCE:
				return ((InternalEList)getConformances()).basicAdd(otherEnd, msgs);
		}
		return eDynamicInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UML2Package.PROTOCOL_STATE_MACHINE__EANNOTATIONS:
				return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
			case UML2Package.PROTOCOL_STATE_MACHINE__OWNED_COMMENT:
				return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
			case UML2Package.PROTOCOL_STATE_MACHINE__TEMPLATE_BINDING:
				return ((InternalEList)getTemplateBindings()).basicRemove(otherEnd, msgs);
			case UML2Package.PROTOCOL_STATE_MACHINE__OWNED_TEMPLATE_SIGNATURE:
				return basicSetOwnedTemplateSignature(null, msgs);
			case UML2Package.PROTOCOL_STATE_MACHINE__CLIENT_DEPENDENCY:
				return ((InternalEList)getClientDependencies()).basicRemove(otherEnd, msgs);
			case UML2Package.PROTOCOL_STATE_MACHINE__NAME_EXPRESSION:
				return basicSetNameExpression(null, msgs);
			case UML2Package.PROTOCOL_STATE_MACHINE__OWNED_RULE:
				return ((InternalEList)getOwnedRules()).basicRemove(otherEnd, msgs);
			case UML2Package.PROTOCOL_STATE_MACHINE__ELEMENT_IMPORT:
				return ((InternalEList)getElementImports()).basicRemove(otherEnd, msgs);
			case UML2Package.PROTOCOL_STATE_MACHINE__PACKAGE_IMPORT:
				return ((InternalEList)getPackageImports()).basicRemove(otherEnd, msgs);
			case UML2Package.PROTOCOL_STATE_MACHINE__TEMPLATE_PARAMETER:
				return basicSetTemplateParameter(null, msgs);
			case UML2Package.PROTOCOL_STATE_MACHINE__OWNING_PARAMETER:
				return basicSetOwningParameter(null, msgs);
			case UML2Package.PROTOCOL_STATE_MACHINE__GENERALIZATION:
				return ((InternalEList)getGeneralizations()).basicRemove(otherEnd, msgs);
			case UML2Package.PROTOCOL_STATE_MACHINE__SUBSTITUTION:
				return ((InternalEList)getSubstitutions()).basicRemove(otherEnd, msgs);
			case UML2Package.PROTOCOL_STATE_MACHINE__POWERTYPE_EXTENT:
				return ((InternalEList)getPowertypeExtents()).basicRemove(otherEnd, msgs);
			case UML2Package.PROTOCOL_STATE_MACHINE__OWNED_USE_CASE:
				return ((InternalEList)getOwnedUseCases()).basicRemove(otherEnd, msgs);
			case UML2Package.PROTOCOL_STATE_MACHINE__USE_CASE:
				return ((InternalEList)getUseCases()).basicRemove(otherEnd, msgs);
			case UML2Package.PROTOCOL_STATE_MACHINE__OCCURRENCE:
				return ((InternalEList)getOccurrences()).basicRemove(otherEnd, msgs);
			case UML2Package.PROTOCOL_STATE_MACHINE__OWNED_BEHAVIOR:
				return ((InternalEList)getOwnedBehaviors()).basicRemove(otherEnd, msgs);
			case UML2Package.PROTOCOL_STATE_MACHINE__IMPLEMENTATION:
				return ((InternalEList)getImplementations()).basicRemove(otherEnd, msgs);
			case UML2Package.PROTOCOL_STATE_MACHINE__OWNED_TRIGGER:
				return ((InternalEList)getOwnedTriggers()).basicRemove(otherEnd, msgs);
			case UML2Package.PROTOCOL_STATE_MACHINE__OWNED_STATE_MACHINE:
				return ((InternalEList)getOwnedStateMachines()).basicRemove(otherEnd, msgs);
			case UML2Package.PROTOCOL_STATE_MACHINE__OWNED_ATTRIBUTE:
				return ((InternalEList)getOwnedAttributes()).basicRemove(otherEnd, msgs);
			case UML2Package.PROTOCOL_STATE_MACHINE__OWNED_CONNECTOR:
				return ((InternalEList)getOwnedConnectors()).basicRemove(otherEnd, msgs);
			case UML2Package.PROTOCOL_STATE_MACHINE__OWNED_PORT:
				return ((InternalEList)getOwnedPorts()).basicRemove(otherEnd, msgs);
			case UML2Package.PROTOCOL_STATE_MACHINE__OWNED_OPERATION:
				return ((InternalEList)getOwnedOperations()).basicRemove(otherEnd, msgs);
			case UML2Package.PROTOCOL_STATE_MACHINE__NESTED_CLASSIFIER:
				return ((InternalEList)getNestedClassifiers()).basicRemove(otherEnd, msgs);
			case UML2Package.PROTOCOL_STATE_MACHINE__OWNED_RECEPTION:
				return ((InternalEList)getOwnedReceptions()).basicRemove(otherEnd, msgs);
			case UML2Package.PROTOCOL_STATE_MACHINE__CONTEXT:
				return basicSetContext(null, msgs);
			case UML2Package.PROTOCOL_STATE_MACHINE__SPECIFICATION:
				return basicSetSpecification(null, msgs);
			case UML2Package.PROTOCOL_STATE_MACHINE__PARAMETER:
				return ((InternalEList)getParameters()).basicRemove(otherEnd, msgs);
			case UML2Package.PROTOCOL_STATE_MACHINE__OWNED_PARAMETER_SET:
				return ((InternalEList)getOwnedParameterSets()).basicRemove(otherEnd, msgs);
			case UML2Package.PROTOCOL_STATE_MACHINE__REGION:
				return ((InternalEList)getRegions()).basicRemove(otherEnd, msgs);
			case UML2Package.PROTOCOL_STATE_MACHINE__CONNECTION_POINT:
				return ((InternalEList)getConnectionPoints()).basicRemove(otherEnd, msgs);
			case UML2Package.PROTOCOL_STATE_MACHINE__STATE_MACHINE_REDEFINITION_CONTEXT:
				return basicSetStateMachine_redefinitionContext(null, msgs);
			case UML2Package.PROTOCOL_STATE_MACHINE__CONFORMANCE:
				return ((InternalEList)getConformances()).basicRemove(otherEnd, msgs);
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
			case UML2Package.PROTOCOL_STATE_MACHINE__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.PROTOCOL_STATE_MACHINE__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.PROTOCOL_STATE_MACHINE__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.PROTOCOL_STATE_MACHINE__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.PROTOCOL_STATE_MACHINE__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.PROTOCOL_STATE_MACHINE__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UML2Package.PROTOCOL_STATE_MACHINE__NAME:
				return getName();
			case UML2Package.PROTOCOL_STATE_MACHINE__QUALIFIED_NAME:
				return getQualifiedName();
			case UML2Package.PROTOCOL_STATE_MACHINE__VISIBILITY:
				return getVisibility();
			case UML2Package.PROTOCOL_STATE_MACHINE__CLIENT_DEPENDENCY:
				return getClientDependencies();
			case UML2Package.PROTOCOL_STATE_MACHINE__NAME_EXPRESSION:
				return getNameExpression();
			case UML2Package.PROTOCOL_STATE_MACHINE__MEMBER:
				return getMembers();
			case UML2Package.PROTOCOL_STATE_MACHINE__OWNED_RULE:
				return getOwnedRules();
			case UML2Package.PROTOCOL_STATE_MACHINE__IMPORTED_MEMBER:
				return getImportedMembers();
			case UML2Package.PROTOCOL_STATE_MACHINE__ELEMENT_IMPORT:
				return getElementImports();
			case UML2Package.PROTOCOL_STATE_MACHINE__PACKAGE_IMPORT:
				return getPackageImports();
			case UML2Package.PROTOCOL_STATE_MACHINE__TEMPLATE_PARAMETER:
				if (resolve) return getTemplateParameter();
				return basicGetTemplateParameter();
			case UML2Package.PROTOCOL_STATE_MACHINE__OWNING_PARAMETER:
				return getOwningParameter();
			case UML2Package.PROTOCOL_STATE_MACHINE__PACKAGEABLE_ELEMENT_VISIBILITY:
				return getPackageableElement_visibility();
			case UML2Package.PROTOCOL_STATE_MACHINE__PACKAGE:
				return getPackage();
			case UML2Package.PROTOCOL_STATE_MACHINE__REDEFINITION_CONTEXT:
				return getRedefinitionContexts();
			case UML2Package.PROTOCOL_STATE_MACHINE__IS_LEAF:
				return isLeaf() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.PROTOCOL_STATE_MACHINE__FEATURE:
				return getFeatures();
			case UML2Package.PROTOCOL_STATE_MACHINE__IS_ABSTRACT:
				return isAbstract() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.PROTOCOL_STATE_MACHINE__INHERITED_MEMBER:
				return getInheritedMembers();
			case UML2Package.PROTOCOL_STATE_MACHINE__GENERAL:
				return getGenerals();
			case UML2Package.PROTOCOL_STATE_MACHINE__GENERALIZATION:
				return getGeneralizations();
			case UML2Package.PROTOCOL_STATE_MACHINE__ATTRIBUTE:
				return getAttributes();
			case UML2Package.PROTOCOL_STATE_MACHINE__REDEFINED_CLASSIFIER:
				return getRedefinedClassifiers();
			case UML2Package.PROTOCOL_STATE_MACHINE__SUBSTITUTION:
				return getSubstitutions();
			case UML2Package.PROTOCOL_STATE_MACHINE__POWERTYPE_EXTENT:
				return getPowertypeExtents();
			case UML2Package.PROTOCOL_STATE_MACHINE__OWNED_USE_CASE:
				return getOwnedUseCases();
			case UML2Package.PROTOCOL_STATE_MACHINE__USE_CASE:
				return getUseCases();
			case UML2Package.PROTOCOL_STATE_MACHINE__REPRESENTATION:
				return getRepresentation();
			case UML2Package.PROTOCOL_STATE_MACHINE__OCCURRENCE:
				return getOccurrences();
			case UML2Package.PROTOCOL_STATE_MACHINE__OWNED_BEHAVIOR:
				return getOwnedBehaviors();
			case UML2Package.PROTOCOL_STATE_MACHINE__CLASSIFIER_BEHAVIOR:
				return getClassifierBehavior();
			case UML2Package.PROTOCOL_STATE_MACHINE__IMPLEMENTATION:
				return getImplementations();
			case UML2Package.PROTOCOL_STATE_MACHINE__OWNED_TRIGGER:
				return getOwnedTriggers();
			case UML2Package.PROTOCOL_STATE_MACHINE__OWNED_STATE_MACHINE:
				return getOwnedStateMachines();
			case UML2Package.PROTOCOL_STATE_MACHINE__OWNED_ATTRIBUTE:
				return getOwnedAttributes();
			case UML2Package.PROTOCOL_STATE_MACHINE__PART:
				return getParts();
			case UML2Package.PROTOCOL_STATE_MACHINE__ROLE:
				return getRoles();
			case UML2Package.PROTOCOL_STATE_MACHINE__OWNED_CONNECTOR:
				return getOwnedConnectors();
			case UML2Package.PROTOCOL_STATE_MACHINE__OWNED_PORT:
				return getOwnedPorts();
			case UML2Package.PROTOCOL_STATE_MACHINE__OWNED_OPERATION:
				return getOwnedOperations();
			case UML2Package.PROTOCOL_STATE_MACHINE__SUPER_CLASS:
				return getSuperClasses();
			case UML2Package.PROTOCOL_STATE_MACHINE__EXTENSION:
				return getExtensions();
			case UML2Package.PROTOCOL_STATE_MACHINE__NESTED_CLASSIFIER:
				return getNestedClassifiers();
			case UML2Package.PROTOCOL_STATE_MACHINE__IS_ACTIVE:
				return isActive() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.PROTOCOL_STATE_MACHINE__OWNED_RECEPTION:
				return getOwnedReceptions();
			case UML2Package.PROTOCOL_STATE_MACHINE__IS_REENTRANT:
				return isReentrant() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.PROTOCOL_STATE_MACHINE__CONTEXT:
				return getContext();
			case UML2Package.PROTOCOL_STATE_MACHINE__REDEFINED_BEHAVIOR:
				return getRedefinedBehaviors();
			case UML2Package.PROTOCOL_STATE_MACHINE__SPECIFICATION:
				if (resolve) return getSpecification();
				return basicGetSpecification();
			case UML2Package.PROTOCOL_STATE_MACHINE__PARAMETER:
				return getParameters();
			case UML2Package.PROTOCOL_STATE_MACHINE__FORMAL_PARAMETER:
				return getFormalParameters();
			case UML2Package.PROTOCOL_STATE_MACHINE__RETURN_RESULT:
				return getReturnResults();
			case UML2Package.PROTOCOL_STATE_MACHINE__PRECONDITION:
				return getPreconditions();
			case UML2Package.PROTOCOL_STATE_MACHINE__POSTCONDITION:
				return getPostconditions();
			case UML2Package.PROTOCOL_STATE_MACHINE__OWNED_PARAMETER_SET:
				return getOwnedParameterSets();
			case UML2Package.PROTOCOL_STATE_MACHINE__REGION:
				return getRegions();
			case UML2Package.PROTOCOL_STATE_MACHINE__CONNECTION_POINT:
				return getConnectionPoints();
			case UML2Package.PROTOCOL_STATE_MACHINE__EXTENDED_STATE_MACHINE:
				if (resolve) return getExtendedStateMachine();
				return basicGetExtendedStateMachine();
			case UML2Package.PROTOCOL_STATE_MACHINE__STATE_MACHINE_REDEFINITION_CONTEXT:
				return getStateMachine_redefinitionContext();
			case UML2Package.PROTOCOL_STATE_MACHINE__CONFORMANCE:
				return getConformances();
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
			case UML2Package.PROTOCOL_STATE_MACHINE__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.PROTOCOL_STATE_MACHINE__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.PROTOCOL_STATE_MACHINE__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection)newValue);
				return;
			case UML2Package.PROTOCOL_STATE_MACHINE__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case UML2Package.PROTOCOL_STATE_MACHINE__NAME:
				setName((String)newValue);
				return;
			case UML2Package.PROTOCOL_STATE_MACHINE__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case UML2Package.PROTOCOL_STATE_MACHINE__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection)newValue);
				return;
			case UML2Package.PROTOCOL_STATE_MACHINE__NAME_EXPRESSION:
				setNameExpression((StringExpression)newValue);
				return;
			case UML2Package.PROTOCOL_STATE_MACHINE__OWNED_RULE:
				getOwnedRules().clear();
				getOwnedRules().addAll((Collection)newValue);
				return;
			case UML2Package.PROTOCOL_STATE_MACHINE__ELEMENT_IMPORT:
				getElementImports().clear();
				getElementImports().addAll((Collection)newValue);
				return;
			case UML2Package.PROTOCOL_STATE_MACHINE__PACKAGE_IMPORT:
				getPackageImports().clear();
				getPackageImports().addAll((Collection)newValue);
				return;
			case UML2Package.PROTOCOL_STATE_MACHINE__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)newValue);
				return;
			case UML2Package.PROTOCOL_STATE_MACHINE__OWNING_PARAMETER:
				setOwningParameter((TemplateParameter)newValue);
				return;
			case UML2Package.PROTOCOL_STATE_MACHINE__PACKAGEABLE_ELEMENT_VISIBILITY:
				setPackageableElement_visibility((VisibilityKind)newValue);
				return;
			case UML2Package.PROTOCOL_STATE_MACHINE__IS_LEAF:
				setIsLeaf(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.PROTOCOL_STATE_MACHINE__IS_ABSTRACT:
				setIsAbstract(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.PROTOCOL_STATE_MACHINE__GENERALIZATION:
				getGeneralizations().clear();
				getGeneralizations().addAll((Collection)newValue);
				return;
			case UML2Package.PROTOCOL_STATE_MACHINE__REDEFINED_CLASSIFIER:
				getRedefinedClassifiers().clear();
				getRedefinedClassifiers().addAll((Collection)newValue);
				return;
			case UML2Package.PROTOCOL_STATE_MACHINE__SUBSTITUTION:
				getSubstitutions().clear();
				getSubstitutions().addAll((Collection)newValue);
				return;
			case UML2Package.PROTOCOL_STATE_MACHINE__POWERTYPE_EXTENT:
				getPowertypeExtents().clear();
				getPowertypeExtents().addAll((Collection)newValue);
				return;
			case UML2Package.PROTOCOL_STATE_MACHINE__OWNED_USE_CASE:
				getOwnedUseCases().clear();
				getOwnedUseCases().addAll((Collection)newValue);
				return;
			case UML2Package.PROTOCOL_STATE_MACHINE__USE_CASE:
				getUseCases().clear();
				getUseCases().addAll((Collection)newValue);
				return;
			case UML2Package.PROTOCOL_STATE_MACHINE__REPRESENTATION:
				setRepresentation((CollaborationOccurrence)newValue);
				return;
			case UML2Package.PROTOCOL_STATE_MACHINE__OCCURRENCE:
				getOccurrences().clear();
				getOccurrences().addAll((Collection)newValue);
				return;
			case UML2Package.PROTOCOL_STATE_MACHINE__OWNED_BEHAVIOR:
				getOwnedBehaviors().clear();
				getOwnedBehaviors().addAll((Collection)newValue);
				return;
			case UML2Package.PROTOCOL_STATE_MACHINE__CLASSIFIER_BEHAVIOR:
				setClassifierBehavior((Behavior)newValue);
				return;
			case UML2Package.PROTOCOL_STATE_MACHINE__IMPLEMENTATION:
				getImplementations().clear();
				getImplementations().addAll((Collection)newValue);
				return;
			case UML2Package.PROTOCOL_STATE_MACHINE__OWNED_TRIGGER:
				getOwnedTriggers().clear();
				getOwnedTriggers().addAll((Collection)newValue);
				return;
			case UML2Package.PROTOCOL_STATE_MACHINE__OWNED_STATE_MACHINE:
				getOwnedStateMachines().clear();
				getOwnedStateMachines().addAll((Collection)newValue);
				return;
			case UML2Package.PROTOCOL_STATE_MACHINE__OWNED_ATTRIBUTE:
				getOwnedAttributes().clear();
				getOwnedAttributes().addAll((Collection)newValue);
				return;
			case UML2Package.PROTOCOL_STATE_MACHINE__OWNED_CONNECTOR:
				getOwnedConnectors().clear();
				getOwnedConnectors().addAll((Collection)newValue);
				return;
			case UML2Package.PROTOCOL_STATE_MACHINE__OWNED_PORT:
				getOwnedPorts().clear();
				getOwnedPorts().addAll((Collection)newValue);
				return;
			case UML2Package.PROTOCOL_STATE_MACHINE__OWNED_OPERATION:
				getOwnedOperations().clear();
				getOwnedOperations().addAll((Collection)newValue);
				return;
			case UML2Package.PROTOCOL_STATE_MACHINE__NESTED_CLASSIFIER:
				getNestedClassifiers().clear();
				getNestedClassifiers().addAll((Collection)newValue);
				return;
			case UML2Package.PROTOCOL_STATE_MACHINE__IS_ACTIVE:
				setIsActive(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.PROTOCOL_STATE_MACHINE__OWNED_RECEPTION:
				getOwnedReceptions().clear();
				getOwnedReceptions().addAll((Collection)newValue);
				return;
			case UML2Package.PROTOCOL_STATE_MACHINE__IS_REENTRANT:
				setIsReentrant(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.PROTOCOL_STATE_MACHINE__CONTEXT:
				setContext((BehavioredClassifier)newValue);
				return;
			case UML2Package.PROTOCOL_STATE_MACHINE__REDEFINED_BEHAVIOR:
				getRedefinedBehaviors().clear();
				getRedefinedBehaviors().addAll((Collection)newValue);
				return;
			case UML2Package.PROTOCOL_STATE_MACHINE__SPECIFICATION:
				setSpecification((BehavioralFeature)newValue);
				return;
			case UML2Package.PROTOCOL_STATE_MACHINE__PARAMETER:
				getParameters().clear();
				getParameters().addAll((Collection)newValue);
				return;
			case UML2Package.PROTOCOL_STATE_MACHINE__PRECONDITION:
				getPreconditions().clear();
				getPreconditions().addAll((Collection)newValue);
				return;
			case UML2Package.PROTOCOL_STATE_MACHINE__POSTCONDITION:
				getPostconditions().clear();
				getPostconditions().addAll((Collection)newValue);
				return;
			case UML2Package.PROTOCOL_STATE_MACHINE__OWNED_PARAMETER_SET:
				getOwnedParameterSets().clear();
				getOwnedParameterSets().addAll((Collection)newValue);
				return;
			case UML2Package.PROTOCOL_STATE_MACHINE__REGION:
				getRegions().clear();
				getRegions().addAll((Collection)newValue);
				return;
			case UML2Package.PROTOCOL_STATE_MACHINE__CONNECTION_POINT:
				getConnectionPoints().clear();
				getConnectionPoints().addAll((Collection)newValue);
				return;
			case UML2Package.PROTOCOL_STATE_MACHINE__EXTENDED_STATE_MACHINE:
				setExtendedStateMachine((StateMachine)newValue);
				return;
			case UML2Package.PROTOCOL_STATE_MACHINE__STATE_MACHINE_REDEFINITION_CONTEXT:
				setStateMachine_redefinitionContext((BehavioredClassifier)newValue);
				return;
			case UML2Package.PROTOCOL_STATE_MACHINE__CONFORMANCE:
				getConformances().clear();
				getConformances().addAll((Collection)newValue);
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
			case UML2Package.PROTOCOL_STATE_MACHINE__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.PROTOCOL_STATE_MACHINE__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.PROTOCOL_STATE_MACHINE__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				return;
			case UML2Package.PROTOCOL_STATE_MACHINE__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case UML2Package.PROTOCOL_STATE_MACHINE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UML2Package.PROTOCOL_STATE_MACHINE__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UML2Package.PROTOCOL_STATE_MACHINE__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				return;
			case UML2Package.PROTOCOL_STATE_MACHINE__NAME_EXPRESSION:
				setNameExpression((StringExpression)null);
				return;
			case UML2Package.PROTOCOL_STATE_MACHINE__OWNED_RULE:
				getOwnedRules().clear();
				return;
			case UML2Package.PROTOCOL_STATE_MACHINE__ELEMENT_IMPORT:
				getElementImports().clear();
				return;
			case UML2Package.PROTOCOL_STATE_MACHINE__PACKAGE_IMPORT:
				getPackageImports().clear();
				return;
			case UML2Package.PROTOCOL_STATE_MACHINE__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)null);
				return;
			case UML2Package.PROTOCOL_STATE_MACHINE__OWNING_PARAMETER:
				setOwningParameter((TemplateParameter)null);
				return;
			case UML2Package.PROTOCOL_STATE_MACHINE__PACKAGEABLE_ELEMENT_VISIBILITY:
				setPackageableElement_visibility(PACKAGEABLE_ELEMENT_VISIBILITY_EDEFAULT);
				return;
			case UML2Package.PROTOCOL_STATE_MACHINE__IS_LEAF:
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UML2Package.PROTOCOL_STATE_MACHINE__IS_ABSTRACT:
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case UML2Package.PROTOCOL_STATE_MACHINE__GENERALIZATION:
				getGeneralizations().clear();
				return;
			case UML2Package.PROTOCOL_STATE_MACHINE__REDEFINED_CLASSIFIER:
				getRedefinedClassifiers().clear();
				return;
			case UML2Package.PROTOCOL_STATE_MACHINE__SUBSTITUTION:
				getSubstitutions().clear();
				return;
			case UML2Package.PROTOCOL_STATE_MACHINE__POWERTYPE_EXTENT:
				getPowertypeExtents().clear();
				return;
			case UML2Package.PROTOCOL_STATE_MACHINE__OWNED_USE_CASE:
				getOwnedUseCases().clear();
				return;
			case UML2Package.PROTOCOL_STATE_MACHINE__USE_CASE:
				getUseCases().clear();
				return;
			case UML2Package.PROTOCOL_STATE_MACHINE__REPRESENTATION:
				setRepresentation((CollaborationOccurrence)null);
				return;
			case UML2Package.PROTOCOL_STATE_MACHINE__OCCURRENCE:
				getOccurrences().clear();
				return;
			case UML2Package.PROTOCOL_STATE_MACHINE__OWNED_BEHAVIOR:
				getOwnedBehaviors().clear();
				return;
			case UML2Package.PROTOCOL_STATE_MACHINE__CLASSIFIER_BEHAVIOR:
				setClassifierBehavior((Behavior)null);
				return;
			case UML2Package.PROTOCOL_STATE_MACHINE__IMPLEMENTATION:
				getImplementations().clear();
				return;
			case UML2Package.PROTOCOL_STATE_MACHINE__OWNED_TRIGGER:
				getOwnedTriggers().clear();
				return;
			case UML2Package.PROTOCOL_STATE_MACHINE__OWNED_STATE_MACHINE:
				getOwnedStateMachines().clear();
				return;
			case UML2Package.PROTOCOL_STATE_MACHINE__OWNED_ATTRIBUTE:
				getOwnedAttributes().clear();
				return;
			case UML2Package.PROTOCOL_STATE_MACHINE__OWNED_CONNECTOR:
				getOwnedConnectors().clear();
				return;
			case UML2Package.PROTOCOL_STATE_MACHINE__OWNED_PORT:
				getOwnedPorts().clear();
				return;
			case UML2Package.PROTOCOL_STATE_MACHINE__OWNED_OPERATION:
				getOwnedOperations().clear();
				return;
			case UML2Package.PROTOCOL_STATE_MACHINE__NESTED_CLASSIFIER:
				getNestedClassifiers().clear();
				return;
			case UML2Package.PROTOCOL_STATE_MACHINE__IS_ACTIVE:
				setIsActive(IS_ACTIVE_EDEFAULT);
				return;
			case UML2Package.PROTOCOL_STATE_MACHINE__OWNED_RECEPTION:
				getOwnedReceptions().clear();
				return;
			case UML2Package.PROTOCOL_STATE_MACHINE__IS_REENTRANT:
				setIsReentrant(IS_REENTRANT_EDEFAULT);
				return;
			case UML2Package.PROTOCOL_STATE_MACHINE__CONTEXT:
				setContext((BehavioredClassifier)null);
				return;
			case UML2Package.PROTOCOL_STATE_MACHINE__REDEFINED_BEHAVIOR:
				getRedefinedBehaviors().clear();
				return;
			case UML2Package.PROTOCOL_STATE_MACHINE__SPECIFICATION:
				setSpecification((BehavioralFeature)null);
				return;
			case UML2Package.PROTOCOL_STATE_MACHINE__PARAMETER:
				getParameters().clear();
				return;
			case UML2Package.PROTOCOL_STATE_MACHINE__PRECONDITION:
				getPreconditions().clear();
				return;
			case UML2Package.PROTOCOL_STATE_MACHINE__POSTCONDITION:
				getPostconditions().clear();
				return;
			case UML2Package.PROTOCOL_STATE_MACHINE__OWNED_PARAMETER_SET:
				getOwnedParameterSets().clear();
				return;
			case UML2Package.PROTOCOL_STATE_MACHINE__REGION:
				getRegions().clear();
				return;
			case UML2Package.PROTOCOL_STATE_MACHINE__CONNECTION_POINT:
				getConnectionPoints().clear();
				return;
			case UML2Package.PROTOCOL_STATE_MACHINE__EXTENDED_STATE_MACHINE:
				setExtendedStateMachine((StateMachine)null);
				return;
			case UML2Package.PROTOCOL_STATE_MACHINE__STATE_MACHINE_REDEFINITION_CONTEXT:
				setStateMachine_redefinitionContext((BehavioredClassifier)null);
				return;
			case UML2Package.PROTOCOL_STATE_MACHINE__CONFORMANCE:
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UML2Package.PROTOCOL_STATE_MACHINE__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.PROTOCOL_STATE_MACHINE__OWNED_ELEMENT:
				return isSetOwnedElements();
			case UML2Package.PROTOCOL_STATE_MACHINE__OWNER:
				return isSetOwner();
			case UML2Package.PROTOCOL_STATE_MACHINE__OWNED_COMMENT:
				return ownedComments != null && !ownedComments.isEmpty();
			case UML2Package.PROTOCOL_STATE_MACHINE__TEMPLATE_BINDING:
				return templateBindings != null && !templateBindings.isEmpty();
			case UML2Package.PROTOCOL_STATE_MACHINE__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case UML2Package.PROTOCOL_STATE_MACHINE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.PROTOCOL_STATE_MACHINE__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UML2Package.PROTOCOL_STATE_MACHINE__VISIBILITY:
				return isSetVisibility();
			case UML2Package.PROTOCOL_STATE_MACHINE__CLIENT_DEPENDENCY:
				return clientDependencies != null && !clientDependencies.isEmpty();
			case UML2Package.PROTOCOL_STATE_MACHINE__NAME_EXPRESSION:
				return nameExpression != null;
			case UML2Package.PROTOCOL_STATE_MACHINE__MEMBER:
				return isSetMembers();
			case UML2Package.PROTOCOL_STATE_MACHINE__OWNED_RULE:
				return ownedRules != null && !ownedRules.isEmpty();
			case UML2Package.PROTOCOL_STATE_MACHINE__IMPORTED_MEMBER:
				return !getImportedMembers().isEmpty();
			case UML2Package.PROTOCOL_STATE_MACHINE__ELEMENT_IMPORT:
				return elementImports != null && !elementImports.isEmpty();
			case UML2Package.PROTOCOL_STATE_MACHINE__PACKAGE_IMPORT:
				return packageImports != null && !packageImports.isEmpty();
			case UML2Package.PROTOCOL_STATE_MACHINE__TEMPLATE_PARAMETER:
				return templateParameter != null;
			case UML2Package.PROTOCOL_STATE_MACHINE__OWNING_PARAMETER:
				return getOwningParameter() != null;
			case UML2Package.PROTOCOL_STATE_MACHINE__PACKAGEABLE_ELEMENT_VISIBILITY:
				return isSetPackageableElement_visibility();
			case UML2Package.PROTOCOL_STATE_MACHINE__PACKAGE:
				return getPackage() != null;
			case UML2Package.PROTOCOL_STATE_MACHINE__REDEFINITION_CONTEXT:
				return isSetRedefinitionContexts();
			case UML2Package.PROTOCOL_STATE_MACHINE__IS_LEAF:
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UML2Package.PROTOCOL_STATE_MACHINE__FEATURE:
				return isSetFeatures();
			case UML2Package.PROTOCOL_STATE_MACHINE__IS_ABSTRACT:
				return isSetIsAbstract();
			case UML2Package.PROTOCOL_STATE_MACHINE__INHERITED_MEMBER:
				return !getInheritedMembers().isEmpty();
			case UML2Package.PROTOCOL_STATE_MACHINE__GENERAL:
				return isSetGenerals();
			case UML2Package.PROTOCOL_STATE_MACHINE__GENERALIZATION:
				return generalizations != null && !generalizations.isEmpty();
			case UML2Package.PROTOCOL_STATE_MACHINE__ATTRIBUTE:
				return isSetAttributes();
			case UML2Package.PROTOCOL_STATE_MACHINE__REDEFINED_CLASSIFIER:
				return redefinedClassifiers != null && !redefinedClassifiers.isEmpty();
			case UML2Package.PROTOCOL_STATE_MACHINE__SUBSTITUTION:
				return substitutions != null && !substitutions.isEmpty();
			case UML2Package.PROTOCOL_STATE_MACHINE__POWERTYPE_EXTENT:
				return powertypeExtents != null && !powertypeExtents.isEmpty();
			case UML2Package.PROTOCOL_STATE_MACHINE__OWNED_USE_CASE:
				return ownedUseCases != null && !ownedUseCases.isEmpty();
			case UML2Package.PROTOCOL_STATE_MACHINE__USE_CASE:
				return useCases != null && !useCases.isEmpty();
			case UML2Package.PROTOCOL_STATE_MACHINE__REPRESENTATION:
				return representation != null;
			case UML2Package.PROTOCOL_STATE_MACHINE__OCCURRENCE:
				return occurrences != null && !occurrences.isEmpty();
			case UML2Package.PROTOCOL_STATE_MACHINE__OWNED_BEHAVIOR:
				return isSetOwnedBehaviors();
			case UML2Package.PROTOCOL_STATE_MACHINE__CLASSIFIER_BEHAVIOR:
				return classifierBehavior != null;
			case UML2Package.PROTOCOL_STATE_MACHINE__IMPLEMENTATION:
				return implementations != null && !implementations.isEmpty();
			case UML2Package.PROTOCOL_STATE_MACHINE__OWNED_TRIGGER:
				return ownedTriggers != null && !ownedTriggers.isEmpty();
			case UML2Package.PROTOCOL_STATE_MACHINE__OWNED_STATE_MACHINE:
				return isSetOwnedStateMachines();
			case UML2Package.PROTOCOL_STATE_MACHINE__OWNED_ATTRIBUTE:
				return isSetOwnedAttributes();
			case UML2Package.PROTOCOL_STATE_MACHINE__PART:
				return !getParts().isEmpty();
			case UML2Package.PROTOCOL_STATE_MACHINE__ROLE:
				return isSetRoles();
			case UML2Package.PROTOCOL_STATE_MACHINE__OWNED_CONNECTOR:
				return ownedConnectors != null && !ownedConnectors.isEmpty();
			case UML2Package.PROTOCOL_STATE_MACHINE__OWNED_PORT:
				return ownedPorts != null && !ownedPorts.isEmpty();
			case UML2Package.PROTOCOL_STATE_MACHINE__OWNED_OPERATION:
				return ownedOperations != null && !ownedOperations.isEmpty();
			case UML2Package.PROTOCOL_STATE_MACHINE__SUPER_CLASS:
				return isSetSuperClasses();
			case UML2Package.PROTOCOL_STATE_MACHINE__EXTENSION:
				return !getExtensions().isEmpty();
			case UML2Package.PROTOCOL_STATE_MACHINE__NESTED_CLASSIFIER:
				return nestedClassifiers != null && !nestedClassifiers.isEmpty();
			case UML2Package.PROTOCOL_STATE_MACHINE__IS_ACTIVE:
				return ((eFlags & IS_ACTIVE_EFLAG) != 0) != IS_ACTIVE_EDEFAULT;
			case UML2Package.PROTOCOL_STATE_MACHINE__OWNED_RECEPTION:
				return ownedReceptions != null && !ownedReceptions.isEmpty();
			case UML2Package.PROTOCOL_STATE_MACHINE__IS_REENTRANT:
				return ((eFlags & IS_REENTRANT_EFLAG) != 0) != IS_REENTRANT_EDEFAULT;
			case UML2Package.PROTOCOL_STATE_MACHINE__CONTEXT:
				return getContext() != null;
			case UML2Package.PROTOCOL_STATE_MACHINE__REDEFINED_BEHAVIOR:
				return redefinedBehaviors != null && !redefinedBehaviors.isEmpty();
			case UML2Package.PROTOCOL_STATE_MACHINE__SPECIFICATION:
				return specification != null;
			case UML2Package.PROTOCOL_STATE_MACHINE__PARAMETER:
				return parameters != null && !parameters.isEmpty();
			case UML2Package.PROTOCOL_STATE_MACHINE__FORMAL_PARAMETER:
				return !getFormalParameters().isEmpty();
			case UML2Package.PROTOCOL_STATE_MACHINE__RETURN_RESULT:
				return !getReturnResults().isEmpty();
			case UML2Package.PROTOCOL_STATE_MACHINE__PRECONDITION:
				return preconditions != null && !preconditions.isEmpty();
			case UML2Package.PROTOCOL_STATE_MACHINE__POSTCONDITION:
				return postconditions != null && !postconditions.isEmpty();
			case UML2Package.PROTOCOL_STATE_MACHINE__OWNED_PARAMETER_SET:
				return ownedParameterSets != null && !ownedParameterSets.isEmpty();
			case UML2Package.PROTOCOL_STATE_MACHINE__REGION:
				return regions != null && !regions.isEmpty();
			case UML2Package.PROTOCOL_STATE_MACHINE__CONNECTION_POINT:
				return connectionPoints != null && !connectionPoints.isEmpty();
			case UML2Package.PROTOCOL_STATE_MACHINE__EXTENDED_STATE_MACHINE:
				return isSetExtendedStateMachine();
			case UML2Package.PROTOCOL_STATE_MACHINE__STATE_MACHINE_REDEFINITION_CONTEXT:
				return isSetStateMachine_redefinitionContext();
			case UML2Package.PROTOCOL_STATE_MACHINE__CONFORMANCE:
				return conformances != null && !conformances.isEmpty();
		}
		return eDynamicIsSet(featureID);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EList getOwnedElementsHelper(EList ownedElements) {
		super.getOwnedElementsHelper(ownedElements);
		if (eIsSet(UML2Package.PROTOCOL_STATE_MACHINE__CONFORMANCE)) {
			ownedElements.addAll(getConformances());
		}
		return ownedElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| eIsSet(UML2Package.PROTOCOL_STATE_MACHINE__CONFORMANCE);
	}


	/**
	 * The array of subset feature identifiers for the '{@link #getOwnedElements() <em>Owned Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedElements()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_ELEMENT_ESUBSETS = new int[] {UML2Package.PROTOCOL_STATE_MACHINE__OWNED_COMMENT, UML2Package.PROTOCOL_STATE_MACHINE__TEMPLATE_BINDING, UML2Package.PROTOCOL_STATE_MACHINE__OWNED_TEMPLATE_SIGNATURE, UML2Package.PROTOCOL_STATE_MACHINE__NAME_EXPRESSION, UML2Package.PROTOCOL_STATE_MACHINE__ELEMENT_IMPORT, UML2Package.PROTOCOL_STATE_MACHINE__PACKAGE_IMPORT, UML2Package.PROTOCOL_STATE_MACHINE__GENERALIZATION, UML2Package.PROTOCOL_STATE_MACHINE__SUBSTITUTION, UML2Package.PROTOCOL_STATE_MACHINE__OCCURRENCE, UML2Package.PROTOCOL_STATE_MACHINE__IMPLEMENTATION, UML2Package.PROTOCOL_STATE_MACHINE__CONFORMANCE};

} //ProtocolStateMachineImpl
