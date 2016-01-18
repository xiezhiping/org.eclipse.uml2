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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.ConnectionPointReference;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.Pseudostate;
import org.eclipse.uml2.uml.Region;
import org.eclipse.uml2.uml.State;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.ConnectionPointReferenceOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection Point Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ConnectionPointReferenceImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ConnectionPointReferenceImpl#getEntries <em>Entry</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ConnectionPointReferenceImpl#getExits <em>Exit</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ConnectionPointReferenceImpl#getState <em>State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectionPointReferenceImpl
		extends VertexImpl
		implements ConnectionPointReference {

	/**
	 * The cached value of the '{@link #getEntries() <em>Entry</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntries()
	 * @generated
	 * @ordered
	 */
	protected EList<Pseudostate> entries;

	/**
	 * The cached value of the '{@link #getExits() <em>Exit</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExits()
	 * @generated
	 * @ordered
	 */
	protected EList<Pseudostate> exits;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionPointReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.CONNECTION_POINT_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Namespace getNamespace() {
		Namespace namespace = basicGetNamespace();
		return namespace != null && namespace.eIsProxy()
			? (Namespace) eResolveProxy((InternalEObject) namespace)
			: namespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pseudostate> getEntries() {
		if (entries == null) {
			entries = new EObjectResolvingEList<Pseudostate>(Pseudostate.class,
				this, UMLPackage.CONNECTION_POINT_REFERENCE__ENTRY);
		}
		return entries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pseudostate getEntry(String name) {
		return getEntry(name, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pseudostate getEntry(String name, boolean ignoreCase) {
		entryLoop : for (Pseudostate entry : getEntries()) {
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(entry.getName())
				: name.equals(entry.getName())))
				continue entryLoop;
			return entry;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pseudostate> getExits() {
		if (exits == null) {
			exits = new EObjectResolvingEList<Pseudostate>(Pseudostate.class,
				this, UMLPackage.CONNECTION_POINT_REFERENCE__EXIT);
		}
		return exits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pseudostate getExit(String name) {
		return getExit(name, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pseudostate getExit(String name, boolean ignoreCase) {
		exitLoop : for (Pseudostate exit : getExits()) {
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(exit.getName())
				: name.equals(exit.getName())))
				continue exitLoop;
			return exit;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getState() {
		if (eContainerFeatureID() != UMLPackage.CONNECTION_POINT_REFERENCE__STATE)
			return null;
		return (State) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetState() {
		if (eContainerFeatureID() != UMLPackage.CONNECTION_POINT_REFERENCE__STATE)
			return null;
		return (State) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetState(State newState,
			NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newState,
			UMLPackage.CONNECTION_POINT_REFERENCE__STATE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(State newState) {
		if (newState != eInternalContainer()
			|| (eContainerFeatureID() != UMLPackage.CONNECTION_POINT_REFERENCE__STATE
				&& newState != null)) {
			if (EcoreUtil.isAncestor(this, newState))
				throw new IllegalArgumentException(
					"Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newState != null)
				msgs = ((InternalEObject) newState).eInverseAdd(this,
					UMLPackage.STATE__CONNECTION, State.class, msgs);
			msgs = basicSetState(newState, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.CONNECTION_POINT_REFERENCE__STATE, newState,
				newState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntryPseudostates(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConnectionPointReferenceOperations
			.validateEntryPseudostates(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExitPseudostates(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConnectionPointReferenceOperations.validateExitPseudostates(this,
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
			case UMLPackage.CONNECTION_POINT_REFERENCE__EANNOTATIONS :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getEAnnotations())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.CONNECTION_POINT_REFERENCE__CONTAINER :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetContainer((Region) otherEnd, msgs);
			case UMLPackage.CONNECTION_POINT_REFERENCE__STATE :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetState((State) otherEnd, msgs);
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
			case UMLPackage.CONNECTION_POINT_REFERENCE__EANNOTATIONS :
				return ((InternalEList<?>) getEAnnotations())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.CONNECTION_POINT_REFERENCE__OWNED_COMMENT :
				return ((InternalEList<?>) getOwnedComments())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.CONNECTION_POINT_REFERENCE__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.CONNECTION_POINT_REFERENCE__CONTAINER :
				return basicSetContainer(null, msgs);
			case UMLPackage.CONNECTION_POINT_REFERENCE__STATE :
				return basicSetState(null, msgs);
		}
		return eDynamicInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(
			NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case UMLPackage.CONNECTION_POINT_REFERENCE__CONTAINER :
				return eInternalContainer().eInverseRemove(this,
					UMLPackage.REGION__SUBVERTEX, Region.class, msgs);
			case UMLPackage.CONNECTION_POINT_REFERENCE__STATE :
				return eInternalContainer().eInverseRemove(this,
					UMLPackage.STATE__CONNECTION, State.class, msgs);
		}
		return eDynamicBasicRemoveFromContainer(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.CONNECTION_POINT_REFERENCE__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.CONNECTION_POINT_REFERENCE__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.CONNECTION_POINT_REFERENCE__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.CONNECTION_POINT_REFERENCE__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.CONNECTION_POINT_REFERENCE__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.CONNECTION_POINT_REFERENCE__NAME :
				return getName();
			case UMLPackage.CONNECTION_POINT_REFERENCE__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.CONNECTION_POINT_REFERENCE__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.CONNECTION_POINT_REFERENCE__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.CONNECTION_POINT_REFERENCE__VISIBILITY :
				return getVisibility();
			case UMLPackage.CONNECTION_POINT_REFERENCE__CONTAINER :
				if (resolve)
					return getContainer();
				return basicGetContainer();
			case UMLPackage.CONNECTION_POINT_REFERENCE__INCOMING :
				return getIncomings();
			case UMLPackage.CONNECTION_POINT_REFERENCE__OUTGOING :
				return getOutgoings();
			case UMLPackage.CONNECTION_POINT_REFERENCE__ENTRY :
				return getEntries();
			case UMLPackage.CONNECTION_POINT_REFERENCE__EXIT :
				return getExits();
			case UMLPackage.CONNECTION_POINT_REFERENCE__STATE :
				if (resolve)
					return getState();
				return basicGetState();
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
			case UMLPackage.CONNECTION_POINT_REFERENCE__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations()
					.addAll((Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.CONNECTION_POINT_REFERENCE__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments()
					.addAll((Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.CONNECTION_POINT_REFERENCE__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.CONNECTION_POINT_REFERENCE__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.CONNECTION_POINT_REFERENCE__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.CONNECTION_POINT_REFERENCE__CONTAINER :
				setContainer((Region) newValue);
				return;
			case UMLPackage.CONNECTION_POINT_REFERENCE__ENTRY :
				getEntries().clear();
				getEntries()
					.addAll((Collection<? extends Pseudostate>) newValue);
				return;
			case UMLPackage.CONNECTION_POINT_REFERENCE__EXIT :
				getExits().clear();
				getExits().addAll((Collection<? extends Pseudostate>) newValue);
				return;
			case UMLPackage.CONNECTION_POINT_REFERENCE__STATE :
				setState((State) newValue);
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
			case UMLPackage.CONNECTION_POINT_REFERENCE__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.CONNECTION_POINT_REFERENCE__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.CONNECTION_POINT_REFERENCE__NAME :
				unsetName();
				return;
			case UMLPackage.CONNECTION_POINT_REFERENCE__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.CONNECTION_POINT_REFERENCE__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.CONNECTION_POINT_REFERENCE__CONTAINER :
				setContainer((Region) null);
				return;
			case UMLPackage.CONNECTION_POINT_REFERENCE__ENTRY :
				getEntries().clear();
				return;
			case UMLPackage.CONNECTION_POINT_REFERENCE__EXIT :
				getExits().clear();
				return;
			case UMLPackage.CONNECTION_POINT_REFERENCE__STATE :
				setState((State) null);
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
			case UMLPackage.CONNECTION_POINT_REFERENCE__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.CONNECTION_POINT_REFERENCE__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.CONNECTION_POINT_REFERENCE__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.CONNECTION_POINT_REFERENCE__OWNER :
				return isSetOwner();
			case UMLPackage.CONNECTION_POINT_REFERENCE__CLIENT_DEPENDENCY :
				return !getClientDependencies().isEmpty();
			case UMLPackage.CONNECTION_POINT_REFERENCE__NAME :
				return isSetName();
			case UMLPackage.CONNECTION_POINT_REFERENCE__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.CONNECTION_POINT_REFERENCE__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.CONNECTION_POINT_REFERENCE__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.CONNECTION_POINT_REFERENCE__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.CONNECTION_POINT_REFERENCE__CONTAINER :
				return basicGetContainer() != null;
			case UMLPackage.CONNECTION_POINT_REFERENCE__INCOMING :
				return !getIncomings().isEmpty();
			case UMLPackage.CONNECTION_POINT_REFERENCE__OUTGOING :
				return !getOutgoings().isEmpty();
			case UMLPackage.CONNECTION_POINT_REFERENCE__ENTRY :
				return entries != null && !entries.isEmpty();
			case UMLPackage.CONNECTION_POINT_REFERENCE__EXIT :
				return exits != null && !exits.isEmpty();
			case UMLPackage.CONNECTION_POINT_REFERENCE__STATE :
				return basicGetState() != null;
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
			case UMLPackage.CONNECTION_POINT_REFERENCE___GET_EANNOTATION__STRING :
				return getEAnnotation((String) arguments.get(0));
			case UMLPackage.CONNECTION_POINT_REFERENCE___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP :
				return validateHasOwner((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.CONNECTION_POINT_REFERENCE___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP :
				return validateNotOwnSelf((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.CONNECTION_POINT_REFERENCE___ADD_KEYWORD__STRING :
				return addKeyword((String) arguments.get(0));
			case UMLPackage.CONNECTION_POINT_REFERENCE___APPLY_STEREOTYPE__STEREOTYPE :
				return applyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.CONNECTION_POINT_REFERENCE___CREATE_EANNOTATION__STRING :
				return createEAnnotation((String) arguments.get(0));
			case UMLPackage.CONNECTION_POINT_REFERENCE___DESTROY :
				destroy();
				return null;
			case UMLPackage.CONNECTION_POINT_REFERENCE___GET_KEYWORDS :
				return getKeywords();
			case UMLPackage.CONNECTION_POINT_REFERENCE___GET_APPLICABLE_STEREOTYPE__STRING :
				return getApplicableStereotype((String) arguments.get(0));
			case UMLPackage.CONNECTION_POINT_REFERENCE___GET_APPLICABLE_STEREOTYPES :
				return getApplicableStereotypes();
			case UMLPackage.CONNECTION_POINT_REFERENCE___GET_APPLIED_STEREOTYPE__STRING :
				return getAppliedStereotype((String) arguments.get(0));
			case UMLPackage.CONNECTION_POINT_REFERENCE___GET_APPLIED_STEREOTYPES :
				return getAppliedStereotypes();
			case UMLPackage.CONNECTION_POINT_REFERENCE___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING :
				return getAppliedSubstereotype((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.CONNECTION_POINT_REFERENCE___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE :
				return getAppliedSubstereotypes((Stereotype) arguments.get(0));
			case UMLPackage.CONNECTION_POINT_REFERENCE___GET_MODEL :
				return getModel();
			case UMLPackage.CONNECTION_POINT_REFERENCE___GET_NEAREST_PACKAGE :
				return getNearestPackage();
			case UMLPackage.CONNECTION_POINT_REFERENCE___GET_RELATIONSHIPS :
				return getRelationships();
			case UMLPackage.CONNECTION_POINT_REFERENCE___GET_RELATIONSHIPS__ECLASS :
				return getRelationships((EClass) arguments.get(0));
			case UMLPackage.CONNECTION_POINT_REFERENCE___GET_REQUIRED_STEREOTYPE__STRING :
				return getRequiredStereotype((String) arguments.get(0));
			case UMLPackage.CONNECTION_POINT_REFERENCE___GET_REQUIRED_STEREOTYPES :
				return getRequiredStereotypes();
			case UMLPackage.CONNECTION_POINT_REFERENCE___GET_SOURCE_DIRECTED_RELATIONSHIPS :
				return getSourceDirectedRelationships();
			case UMLPackage.CONNECTION_POINT_REFERENCE___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS :
				return getSourceDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.CONNECTION_POINT_REFERENCE___GET_STEREOTYPE_APPLICATION__STEREOTYPE :
				return getStereotypeApplication((Stereotype) arguments.get(0));
			case UMLPackage.CONNECTION_POINT_REFERENCE___GET_STEREOTYPE_APPLICATIONS :
				return getStereotypeApplications();
			case UMLPackage.CONNECTION_POINT_REFERENCE___GET_TARGET_DIRECTED_RELATIONSHIPS :
				return getTargetDirectedRelationships();
			case UMLPackage.CONNECTION_POINT_REFERENCE___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS :
				return getTargetDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.CONNECTION_POINT_REFERENCE___GET_VALUE__STEREOTYPE_STRING :
				return getValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.CONNECTION_POINT_REFERENCE___HAS_KEYWORD__STRING :
				return hasKeyword((String) arguments.get(0));
			case UMLPackage.CONNECTION_POINT_REFERENCE___HAS_VALUE__STEREOTYPE_STRING :
				return hasValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.CONNECTION_POINT_REFERENCE___IS_STEREOTYPE_APPLICABLE__STEREOTYPE :
				return isStereotypeApplicable((Stereotype) arguments.get(0));
			case UMLPackage.CONNECTION_POINT_REFERENCE___IS_STEREOTYPE_APPLIED__STEREOTYPE :
				return isStereotypeApplied((Stereotype) arguments.get(0));
			case UMLPackage.CONNECTION_POINT_REFERENCE___IS_STEREOTYPE_REQUIRED__STEREOTYPE :
				return isStereotypeRequired((Stereotype) arguments.get(0));
			case UMLPackage.CONNECTION_POINT_REFERENCE___REMOVE_KEYWORD__STRING :
				return removeKeyword((String) arguments.get(0));
			case UMLPackage.CONNECTION_POINT_REFERENCE___SET_VALUE__STEREOTYPE_STRING_OBJECT :
				setValue((Stereotype) arguments.get(0),
					(String) arguments.get(1), arguments.get(2));
				return null;
			case UMLPackage.CONNECTION_POINT_REFERENCE___UNAPPLY_STEREOTYPE__STEREOTYPE :
				return unapplyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.CONNECTION_POINT_REFERENCE___ALL_OWNED_ELEMENTS :
				return allOwnedElements();
			case UMLPackage.CONNECTION_POINT_REFERENCE___MUST_BE_OWNED :
				return mustBeOwned();
			case UMLPackage.CONNECTION_POINT_REFERENCE___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP :
				return validateVisibilityNeedsOwnership(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.CONNECTION_POINT_REFERENCE___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.CONNECTION_POINT_REFERENCE___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasNoQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.CONNECTION_POINT_REFERENCE___CREATE_DEPENDENCY__NAMEDELEMENT :
				return createDependency((NamedElement) arguments.get(0));
			case UMLPackage.CONNECTION_POINT_REFERENCE___CREATE_USAGE__NAMEDELEMENT :
				return createUsage((NamedElement) arguments.get(0));
			case UMLPackage.CONNECTION_POINT_REFERENCE___GET_LABEL :
				return getLabel();
			case UMLPackage.CONNECTION_POINT_REFERENCE___GET_LABEL__BOOLEAN :
				return getLabel((Boolean) arguments.get(0));
			case UMLPackage.CONNECTION_POINT_REFERENCE___GET_NAMESPACE :
				return getNamespace();
			case UMLPackage.CONNECTION_POINT_REFERENCE___ALL_NAMESPACES :
				return allNamespaces();
			case UMLPackage.CONNECTION_POINT_REFERENCE___ALL_OWNING_PACKAGES :
				return allOwningPackages();
			case UMLPackage.CONNECTION_POINT_REFERENCE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE :
				return isDistinguishableFrom((NamedElement) arguments.get(0),
					(Namespace) arguments.get(1));
			case UMLPackage.CONNECTION_POINT_REFERENCE___GET_QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.CONNECTION_POINT_REFERENCE___SEPARATOR :
				return separator();
			case UMLPackage.CONNECTION_POINT_REFERENCE___GET_CLIENT_DEPENDENCIES :
				return getClientDependencies();
			case UMLPackage.CONNECTION_POINT_REFERENCE___CONTAINING_STATE_MACHINE :
				return containingStateMachine();
			case UMLPackage.CONNECTION_POINT_REFERENCE___GET_INCOMINGS :
				return getIncomings();
			case UMLPackage.CONNECTION_POINT_REFERENCE___GET_OUTGOINGS :
				return getOutgoings();
			case UMLPackage.CONNECTION_POINT_REFERENCE___IS_CONTAINED_IN_STATE__STATE :
				return isContainedInState((State) arguments.get(0));
			case UMLPackage.CONNECTION_POINT_REFERENCE___IS_CONTAINED_IN_REGION__REGION :
				return isContainedInRegion((Region) arguments.get(0));
			case UMLPackage.CONNECTION_POINT_REFERENCE___VALIDATE_EXIT_PSEUDOSTATES__DIAGNOSTICCHAIN_MAP :
				return validateExitPseudostates(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.CONNECTION_POINT_REFERENCE___VALIDATE_ENTRY_PSEUDOSTATES__DIAGNOSTICCHAIN_MAP :
				return validateEntryPseudostates(
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
	public Namespace basicGetNamespace() {
		State state = basicGetState();
		if (state != null) {
			return state;
		}
		return super.basicGetNamespace();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetNamespace() {
		return super.isSetNamespace()
			|| eIsSet(UMLPackage.CONNECTION_POINT_REFERENCE__STATE);
	}

} //ConnectionPointReferenceImpl
