/*
 * Copyright (c) 2005, 2016 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
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

import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.GeneralOrdering;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.OccurrenceSpecification;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;
import org.eclipse.uml2.uml.internal.operations.GeneralOrderingOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>General Ordering</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.GeneralOrderingImpl#getAfter <em>After</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.GeneralOrderingImpl#getBefore <em>Before</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GeneralOrderingImpl
		extends NamedElementImpl
		implements GeneralOrdering {

	/**
	 * The cached value of the '{@link #getAfter() <em>After</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAfter()
	 * @generated
	 * @ordered
	 */
	protected OccurrenceSpecification after;

	/**
	 * The cached value of the '{@link #getBefore() <em>Before</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBefore()
	 * @generated
	 * @ordered
	 */
	protected OccurrenceSpecification before;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneralOrderingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.GENERAL_ORDERING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OccurrenceSpecification getBefore() {
		if (before != null && before.eIsProxy()) {
			InternalEObject oldBefore = (InternalEObject) before;
			before = (OccurrenceSpecification) eResolveProxy(oldBefore);
			if (before != oldBefore) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.GENERAL_ORDERING__BEFORE, oldBefore,
						before));
			}
		}
		return before;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OccurrenceSpecification basicGetBefore() {
		return before;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBefore(OccurrenceSpecification newBefore,
			NotificationChain msgs) {
		OccurrenceSpecification oldBefore = before;
		before = newBefore;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET, UMLPackage.GENERAL_ORDERING__BEFORE,
				oldBefore, newBefore);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBefore(OccurrenceSpecification newBefore) {
		if (newBefore != before) {
			NotificationChain msgs = null;
			if (before != null)
				msgs = ((InternalEObject) before).eInverseRemove(this,
					UMLPackage.OCCURRENCE_SPECIFICATION__TO_AFTER,
					OccurrenceSpecification.class, msgs);
			if (newBefore != null)
				msgs = ((InternalEObject) newBefore).eInverseAdd(this,
					UMLPackage.OCCURRENCE_SPECIFICATION__TO_AFTER,
					OccurrenceSpecification.class, msgs);
			msgs = basicSetBefore(newBefore, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.GENERAL_ORDERING__BEFORE, newBefore, newBefore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIrreflexiveTransitiveClosure(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralOrderingOperations
			.validateIrreflexiveTransitiveClosure(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OccurrenceSpecification getAfter() {
		if (after != null && after.eIsProxy()) {
			InternalEObject oldAfter = (InternalEObject) after;
			after = (OccurrenceSpecification) eResolveProxy(oldAfter);
			if (after != oldAfter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.GENERAL_ORDERING__AFTER, oldAfter, after));
			}
		}
		return after;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OccurrenceSpecification basicGetAfter() {
		return after;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAfter(OccurrenceSpecification newAfter,
			NotificationChain msgs) {
		OccurrenceSpecification oldAfter = after;
		after = newAfter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET, UMLPackage.GENERAL_ORDERING__AFTER, oldAfter,
				newAfter);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAfter(OccurrenceSpecification newAfter) {
		if (newAfter != after) {
			NotificationChain msgs = null;
			if (after != null)
				msgs = ((InternalEObject) after).eInverseRemove(this,
					UMLPackage.OCCURRENCE_SPECIFICATION__TO_BEFORE,
					OccurrenceSpecification.class, msgs);
			if (newAfter != null)
				msgs = ((InternalEObject) newAfter).eInverseAdd(this,
					UMLPackage.OCCURRENCE_SPECIFICATION__TO_BEFORE,
					OccurrenceSpecification.class, msgs);
			msgs = basicSetAfter(newAfter, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.GENERAL_ORDERING__AFTER, newAfter, newAfter));
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
			case UMLPackage.GENERAL_ORDERING__EANNOTATIONS :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getEAnnotations())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.GENERAL_ORDERING__AFTER :
				if (after != null)
					msgs = ((InternalEObject) after).eInverseRemove(this,
						UMLPackage.OCCURRENCE_SPECIFICATION__TO_BEFORE,
						OccurrenceSpecification.class, msgs);
				return basicSetAfter((OccurrenceSpecification) otherEnd, msgs);
			case UMLPackage.GENERAL_ORDERING__BEFORE :
				if (before != null)
					msgs = ((InternalEObject) before).eInverseRemove(this,
						UMLPackage.OCCURRENCE_SPECIFICATION__TO_AFTER,
						OccurrenceSpecification.class, msgs);
				return basicSetBefore((OccurrenceSpecification) otherEnd, msgs);
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
			case UMLPackage.GENERAL_ORDERING__EANNOTATIONS :
				return ((InternalEList<?>) getEAnnotations())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.GENERAL_ORDERING__OWNED_COMMENT :
				return ((InternalEList<?>) getOwnedComments())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.GENERAL_ORDERING__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.GENERAL_ORDERING__AFTER :
				return basicSetAfter(null, msgs);
			case UMLPackage.GENERAL_ORDERING__BEFORE :
				return basicSetBefore(null, msgs);
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
			case UMLPackage.GENERAL_ORDERING__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.GENERAL_ORDERING__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.GENERAL_ORDERING__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.GENERAL_ORDERING__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.GENERAL_ORDERING__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.GENERAL_ORDERING__NAME :
				return getName();
			case UMLPackage.GENERAL_ORDERING__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.GENERAL_ORDERING__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.GENERAL_ORDERING__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.GENERAL_ORDERING__VISIBILITY :
				return getVisibility();
			case UMLPackage.GENERAL_ORDERING__AFTER :
				if (resolve)
					return getAfter();
				return basicGetAfter();
			case UMLPackage.GENERAL_ORDERING__BEFORE :
				if (resolve)
					return getBefore();
				return basicGetBefore();
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
			case UMLPackage.GENERAL_ORDERING__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations()
					.addAll((Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.GENERAL_ORDERING__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments()
					.addAll((Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.GENERAL_ORDERING__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.GENERAL_ORDERING__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.GENERAL_ORDERING__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.GENERAL_ORDERING__AFTER :
				setAfter((OccurrenceSpecification) newValue);
				return;
			case UMLPackage.GENERAL_ORDERING__BEFORE :
				setBefore((OccurrenceSpecification) newValue);
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
			case UMLPackage.GENERAL_ORDERING__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.GENERAL_ORDERING__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.GENERAL_ORDERING__NAME :
				unsetName();
				return;
			case UMLPackage.GENERAL_ORDERING__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.GENERAL_ORDERING__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.GENERAL_ORDERING__AFTER :
				setAfter((OccurrenceSpecification) null);
				return;
			case UMLPackage.GENERAL_ORDERING__BEFORE :
				setBefore((OccurrenceSpecification) null);
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
			case UMLPackage.GENERAL_ORDERING__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.GENERAL_ORDERING__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.GENERAL_ORDERING__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.GENERAL_ORDERING__OWNER :
				return isSetOwner();
			case UMLPackage.GENERAL_ORDERING__CLIENT_DEPENDENCY :
				return !getClientDependencies().isEmpty();
			case UMLPackage.GENERAL_ORDERING__NAME :
				return isSetName();
			case UMLPackage.GENERAL_ORDERING__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.GENERAL_ORDERING__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.GENERAL_ORDERING__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.GENERAL_ORDERING__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.GENERAL_ORDERING__AFTER :
				return after != null;
			case UMLPackage.GENERAL_ORDERING__BEFORE :
				return before != null;
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
			case UMLPackage.GENERAL_ORDERING___GET_EANNOTATION__STRING :
				return getEAnnotation((String) arguments.get(0));
			case UMLPackage.GENERAL_ORDERING___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP :
				return validateHasOwner((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.GENERAL_ORDERING___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP :
				return validateNotOwnSelf((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.GENERAL_ORDERING___ADD_KEYWORD__STRING :
				return addKeyword((String) arguments.get(0));
			case UMLPackage.GENERAL_ORDERING___APPLY_STEREOTYPE__STEREOTYPE :
				return applyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.GENERAL_ORDERING___CREATE_EANNOTATION__STRING :
				return createEAnnotation((String) arguments.get(0));
			case UMLPackage.GENERAL_ORDERING___DESTROY :
				destroy();
				return null;
			case UMLPackage.GENERAL_ORDERING___GET_KEYWORDS :
				return getKeywords();
			case UMLPackage.GENERAL_ORDERING___GET_APPLICABLE_STEREOTYPE__STRING :
				return getApplicableStereotype((String) arguments.get(0));
			case UMLPackage.GENERAL_ORDERING___GET_APPLICABLE_STEREOTYPES :
				return getApplicableStereotypes();
			case UMLPackage.GENERAL_ORDERING___GET_APPLIED_STEREOTYPE__STRING :
				return getAppliedStereotype((String) arguments.get(0));
			case UMLPackage.GENERAL_ORDERING___GET_APPLIED_STEREOTYPES :
				return getAppliedStereotypes();
			case UMLPackage.GENERAL_ORDERING___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING :
				return getAppliedSubstereotype((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.GENERAL_ORDERING___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE :
				return getAppliedSubstereotypes((Stereotype) arguments.get(0));
			case UMLPackage.GENERAL_ORDERING___GET_MODEL :
				return getModel();
			case UMLPackage.GENERAL_ORDERING___GET_NEAREST_PACKAGE :
				return getNearestPackage();
			case UMLPackage.GENERAL_ORDERING___GET_RELATIONSHIPS :
				return getRelationships();
			case UMLPackage.GENERAL_ORDERING___GET_RELATIONSHIPS__ECLASS :
				return getRelationships((EClass) arguments.get(0));
			case UMLPackage.GENERAL_ORDERING___GET_REQUIRED_STEREOTYPE__STRING :
				return getRequiredStereotype((String) arguments.get(0));
			case UMLPackage.GENERAL_ORDERING___GET_REQUIRED_STEREOTYPES :
				return getRequiredStereotypes();
			case UMLPackage.GENERAL_ORDERING___GET_SOURCE_DIRECTED_RELATIONSHIPS :
				return getSourceDirectedRelationships();
			case UMLPackage.GENERAL_ORDERING___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS :
				return getSourceDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.GENERAL_ORDERING___GET_STEREOTYPE_APPLICATION__STEREOTYPE :
				return getStereotypeApplication((Stereotype) arguments.get(0));
			case UMLPackage.GENERAL_ORDERING___GET_STEREOTYPE_APPLICATIONS :
				return getStereotypeApplications();
			case UMLPackage.GENERAL_ORDERING___GET_TARGET_DIRECTED_RELATIONSHIPS :
				return getTargetDirectedRelationships();
			case UMLPackage.GENERAL_ORDERING___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS :
				return getTargetDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.GENERAL_ORDERING___GET_VALUE__STEREOTYPE_STRING :
				return getValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.GENERAL_ORDERING___HAS_KEYWORD__STRING :
				return hasKeyword((String) arguments.get(0));
			case UMLPackage.GENERAL_ORDERING___HAS_VALUE__STEREOTYPE_STRING :
				return hasValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.GENERAL_ORDERING___IS_STEREOTYPE_APPLICABLE__STEREOTYPE :
				return isStereotypeApplicable((Stereotype) arguments.get(0));
			case UMLPackage.GENERAL_ORDERING___IS_STEREOTYPE_APPLIED__STEREOTYPE :
				return isStereotypeApplied((Stereotype) arguments.get(0));
			case UMLPackage.GENERAL_ORDERING___IS_STEREOTYPE_REQUIRED__STEREOTYPE :
				return isStereotypeRequired((Stereotype) arguments.get(0));
			case UMLPackage.GENERAL_ORDERING___REMOVE_KEYWORD__STRING :
				return removeKeyword((String) arguments.get(0));
			case UMLPackage.GENERAL_ORDERING___SET_VALUE__STEREOTYPE_STRING_OBJECT :
				setValue((Stereotype) arguments.get(0),
					(String) arguments.get(1), arguments.get(2));
				return null;
			case UMLPackage.GENERAL_ORDERING___UNAPPLY_STEREOTYPE__STEREOTYPE :
				return unapplyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.GENERAL_ORDERING___ALL_OWNED_ELEMENTS :
				return allOwnedElements();
			case UMLPackage.GENERAL_ORDERING___MUST_BE_OWNED :
				return mustBeOwned();
			case UMLPackage.GENERAL_ORDERING___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP :
				return validateVisibilityNeedsOwnership(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.GENERAL_ORDERING___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.GENERAL_ORDERING___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasNoQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.GENERAL_ORDERING___CREATE_DEPENDENCY__NAMEDELEMENT :
				return createDependency((NamedElement) arguments.get(0));
			case UMLPackage.GENERAL_ORDERING___CREATE_USAGE__NAMEDELEMENT :
				return createUsage((NamedElement) arguments.get(0));
			case UMLPackage.GENERAL_ORDERING___GET_LABEL :
				return getLabel();
			case UMLPackage.GENERAL_ORDERING___GET_LABEL__BOOLEAN :
				return getLabel((Boolean) arguments.get(0));
			case UMLPackage.GENERAL_ORDERING___GET_NAMESPACE :
				return getNamespace();
			case UMLPackage.GENERAL_ORDERING___ALL_NAMESPACES :
				return allNamespaces();
			case UMLPackage.GENERAL_ORDERING___ALL_OWNING_PACKAGES :
				return allOwningPackages();
			case UMLPackage.GENERAL_ORDERING___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE :
				return isDistinguishableFrom((NamedElement) arguments.get(0),
					(Namespace) arguments.get(1));
			case UMLPackage.GENERAL_ORDERING___GET_QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.GENERAL_ORDERING___SEPARATOR :
				return separator();
			case UMLPackage.GENERAL_ORDERING___GET_CLIENT_DEPENDENCIES :
				return getClientDependencies();
			case UMLPackage.GENERAL_ORDERING___VALIDATE_IRREFLEXIVE_TRANSITIVE_CLOSURE__DIAGNOSTICCHAIN_MAP :
				return validateIrreflexiveTransitiveClosure(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		}
		return eDynamicInvoke(operationID, arguments);
	}

} //GeneralOrderingImpl
