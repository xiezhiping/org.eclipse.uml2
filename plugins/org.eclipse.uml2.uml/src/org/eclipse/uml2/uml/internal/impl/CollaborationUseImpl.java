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

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.Collaboration;
import org.eclipse.uml2.uml.CollaborationUse;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.CollaborationUseOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Collaboration Use</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.CollaborationUseImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.CollaborationUseImpl#getRoleBindings <em>Role Binding</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.CollaborationUseImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CollaborationUseImpl
		extends NamedElementImpl
		implements CollaborationUse {

	/**
	 * The cached value of the '{@link #getRoleBindings() <em>Role Binding</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleBindings()
	 * @generated
	 * @ordered
	 */
	protected EList<Dependency> roleBindings;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Collaboration type;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CollaborationUseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.COLLABORATION_USE;
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
						UMLPackage.COLLABORATION_USE__OWNED_ELEMENT,
						OWNED_ELEMENT_ESUBSETS));
			}
			return ownedElements;
		}
		return new DerivedUnionEObjectEList<Element>(Element.class, this,
			UMLPackage.COLLABORATION_USE__OWNED_ELEMENT,
			OWNED_ELEMENT_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collaboration getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject) type;
			type = (Collaboration) eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.COLLABORATION_USE__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collaboration basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Collaboration newType) {
		Collaboration oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.COLLABORATION_USE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Dependency> getRoleBindings() {
		if (roleBindings == null) {
			roleBindings = new EObjectContainmentEList.Resolving<Dependency>(
				Dependency.class, this,
				UMLPackage.COLLABORATION_USE__ROLE_BINDING);
		}
		return roleBindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dependency createRoleBinding(String name, EClass eClass) {
		Dependency newRoleBinding = (Dependency) create(eClass);
		getRoleBindings().add(newRoleBinding);
		if (name != null)
			newRoleBinding.setName(name);
		return newRoleBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dependency createRoleBinding(String name) {
		return createRoleBinding(name, UMLPackage.Literals.DEPENDENCY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dependency getRoleBinding(String name) {
		return getRoleBinding(name, false, null, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dependency getRoleBinding(String name, boolean ignoreCase,
			EClass eClass, boolean createOnDemand) {
		roleBindingLoop : for (Dependency roleBinding : getRoleBindings()) {
			if (eClass != null && !eClass.isInstance(roleBinding))
				continue roleBindingLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(roleBinding.getName())
				: name.equals(roleBinding.getName())))
				continue roleBindingLoop;
			return roleBinding;
		}
		return createOnDemand && eClass != null
			? createRoleBinding(name, eClass)
			: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClientElements(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CollaborationUseOperations.validateClientElements(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEveryRole(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CollaborationUseOperations.validateEveryRole(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectors(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CollaborationUseOperations.validateConnectors(this, diagnostics,
			context);
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
			case UMLPackage.COLLABORATION_USE__EANNOTATIONS :
				return ((InternalEList<?>) getEAnnotations())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.COLLABORATION_USE__OWNED_COMMENT :
				return ((InternalEList<?>) getOwnedComments())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.COLLABORATION_USE__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.COLLABORATION_USE__ROLE_BINDING :
				return ((InternalEList<?>) getRoleBindings())
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
			case UMLPackage.COLLABORATION_USE__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.COLLABORATION_USE__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.COLLABORATION_USE__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.COLLABORATION_USE__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.COLLABORATION_USE__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.COLLABORATION_USE__NAME :
				return getName();
			case UMLPackage.COLLABORATION_USE__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.COLLABORATION_USE__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.COLLABORATION_USE__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.COLLABORATION_USE__VISIBILITY :
				return getVisibility();
			case UMLPackage.COLLABORATION_USE__ROLE_BINDING :
				return getRoleBindings();
			case UMLPackage.COLLABORATION_USE__TYPE :
				if (resolve)
					return getType();
				return basicGetType();
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
			case UMLPackage.COLLABORATION_USE__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations()
					.addAll((Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.COLLABORATION_USE__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments()
					.addAll((Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.COLLABORATION_USE__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.COLLABORATION_USE__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.COLLABORATION_USE__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.COLLABORATION_USE__ROLE_BINDING :
				getRoleBindings().clear();
				getRoleBindings()
					.addAll((Collection<? extends Dependency>) newValue);
				return;
			case UMLPackage.COLLABORATION_USE__TYPE :
				setType((Collaboration) newValue);
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
			case UMLPackage.COLLABORATION_USE__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.COLLABORATION_USE__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.COLLABORATION_USE__NAME :
				unsetName();
				return;
			case UMLPackage.COLLABORATION_USE__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.COLLABORATION_USE__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.COLLABORATION_USE__ROLE_BINDING :
				getRoleBindings().clear();
				return;
			case UMLPackage.COLLABORATION_USE__TYPE :
				setType((Collaboration) null);
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
			case UMLPackage.COLLABORATION_USE__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.COLLABORATION_USE__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.COLLABORATION_USE__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.COLLABORATION_USE__OWNER :
				return isSetOwner();
			case UMLPackage.COLLABORATION_USE__CLIENT_DEPENDENCY :
				return !getClientDependencies().isEmpty();
			case UMLPackage.COLLABORATION_USE__NAME :
				return isSetName();
			case UMLPackage.COLLABORATION_USE__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.COLLABORATION_USE__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.COLLABORATION_USE__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.COLLABORATION_USE__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.COLLABORATION_USE__ROLE_BINDING :
				return roleBindings != null && !roleBindings.isEmpty();
			case UMLPackage.COLLABORATION_USE__TYPE :
				return type != null;
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
			case UMLPackage.COLLABORATION_USE___GET_EANNOTATION__STRING :
				return getEAnnotation((String) arguments.get(0));
			case UMLPackage.COLLABORATION_USE___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP :
				return validateHasOwner((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.COLLABORATION_USE___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP :
				return validateNotOwnSelf((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.COLLABORATION_USE___ADD_KEYWORD__STRING :
				return addKeyword((String) arguments.get(0));
			case UMLPackage.COLLABORATION_USE___APPLY_STEREOTYPE__STEREOTYPE :
				return applyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.COLLABORATION_USE___CREATE_EANNOTATION__STRING :
				return createEAnnotation((String) arguments.get(0));
			case UMLPackage.COLLABORATION_USE___DESTROY :
				destroy();
				return null;
			case UMLPackage.COLLABORATION_USE___GET_KEYWORDS :
				return getKeywords();
			case UMLPackage.COLLABORATION_USE___GET_APPLICABLE_STEREOTYPE__STRING :
				return getApplicableStereotype((String) arguments.get(0));
			case UMLPackage.COLLABORATION_USE___GET_APPLICABLE_STEREOTYPES :
				return getApplicableStereotypes();
			case UMLPackage.COLLABORATION_USE___GET_APPLIED_STEREOTYPE__STRING :
				return getAppliedStereotype((String) arguments.get(0));
			case UMLPackage.COLLABORATION_USE___GET_APPLIED_STEREOTYPES :
				return getAppliedStereotypes();
			case UMLPackage.COLLABORATION_USE___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING :
				return getAppliedSubstereotype((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.COLLABORATION_USE___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE :
				return getAppliedSubstereotypes((Stereotype) arguments.get(0));
			case UMLPackage.COLLABORATION_USE___GET_MODEL :
				return getModel();
			case UMLPackage.COLLABORATION_USE___GET_NEAREST_PACKAGE :
				return getNearestPackage();
			case UMLPackage.COLLABORATION_USE___GET_RELATIONSHIPS :
				return getRelationships();
			case UMLPackage.COLLABORATION_USE___GET_RELATIONSHIPS__ECLASS :
				return getRelationships((EClass) arguments.get(0));
			case UMLPackage.COLLABORATION_USE___GET_REQUIRED_STEREOTYPE__STRING :
				return getRequiredStereotype((String) arguments.get(0));
			case UMLPackage.COLLABORATION_USE___GET_REQUIRED_STEREOTYPES :
				return getRequiredStereotypes();
			case UMLPackage.COLLABORATION_USE___GET_SOURCE_DIRECTED_RELATIONSHIPS :
				return getSourceDirectedRelationships();
			case UMLPackage.COLLABORATION_USE___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS :
				return getSourceDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.COLLABORATION_USE___GET_STEREOTYPE_APPLICATION__STEREOTYPE :
				return getStereotypeApplication((Stereotype) arguments.get(0));
			case UMLPackage.COLLABORATION_USE___GET_STEREOTYPE_APPLICATIONS :
				return getStereotypeApplications();
			case UMLPackage.COLLABORATION_USE___GET_TARGET_DIRECTED_RELATIONSHIPS :
				return getTargetDirectedRelationships();
			case UMLPackage.COLLABORATION_USE___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS :
				return getTargetDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.COLLABORATION_USE___GET_VALUE__STEREOTYPE_STRING :
				return getValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.COLLABORATION_USE___HAS_KEYWORD__STRING :
				return hasKeyword((String) arguments.get(0));
			case UMLPackage.COLLABORATION_USE___HAS_VALUE__STEREOTYPE_STRING :
				return hasValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.COLLABORATION_USE___IS_STEREOTYPE_APPLICABLE__STEREOTYPE :
				return isStereotypeApplicable((Stereotype) arguments.get(0));
			case UMLPackage.COLLABORATION_USE___IS_STEREOTYPE_APPLIED__STEREOTYPE :
				return isStereotypeApplied((Stereotype) arguments.get(0));
			case UMLPackage.COLLABORATION_USE___IS_STEREOTYPE_REQUIRED__STEREOTYPE :
				return isStereotypeRequired((Stereotype) arguments.get(0));
			case UMLPackage.COLLABORATION_USE___REMOVE_KEYWORD__STRING :
				return removeKeyword((String) arguments.get(0));
			case UMLPackage.COLLABORATION_USE___SET_VALUE__STEREOTYPE_STRING_OBJECT :
				setValue((Stereotype) arguments.get(0),
					(String) arguments.get(1), arguments.get(2));
				return null;
			case UMLPackage.COLLABORATION_USE___UNAPPLY_STEREOTYPE__STEREOTYPE :
				return unapplyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.COLLABORATION_USE___ALL_OWNED_ELEMENTS :
				return allOwnedElements();
			case UMLPackage.COLLABORATION_USE___MUST_BE_OWNED :
				return mustBeOwned();
			case UMLPackage.COLLABORATION_USE___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP :
				return validateVisibilityNeedsOwnership(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.COLLABORATION_USE___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.COLLABORATION_USE___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasNoQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.COLLABORATION_USE___CREATE_DEPENDENCY__NAMEDELEMENT :
				return createDependency((NamedElement) arguments.get(0));
			case UMLPackage.COLLABORATION_USE___CREATE_USAGE__NAMEDELEMENT :
				return createUsage((NamedElement) arguments.get(0));
			case UMLPackage.COLLABORATION_USE___GET_LABEL :
				return getLabel();
			case UMLPackage.COLLABORATION_USE___GET_LABEL__BOOLEAN :
				return getLabel((Boolean) arguments.get(0));
			case UMLPackage.COLLABORATION_USE___GET_NAMESPACE :
				return getNamespace();
			case UMLPackage.COLLABORATION_USE___ALL_NAMESPACES :
				return allNamespaces();
			case UMLPackage.COLLABORATION_USE___ALL_OWNING_PACKAGES :
				return allOwningPackages();
			case UMLPackage.COLLABORATION_USE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE :
				return isDistinguishableFrom((NamedElement) arguments.get(0),
					(Namespace) arguments.get(1));
			case UMLPackage.COLLABORATION_USE___GET_QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.COLLABORATION_USE___SEPARATOR :
				return separator();
			case UMLPackage.COLLABORATION_USE___GET_CLIENT_DEPENDENCIES :
				return getClientDependencies();
			case UMLPackage.COLLABORATION_USE___VALIDATE_CLIENT_ELEMENTS__DIAGNOSTICCHAIN_MAP :
				return validateClientElements(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.COLLABORATION_USE___VALIDATE_EVERY_ROLE__DIAGNOSTICCHAIN_MAP :
				return validateEveryRole((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.COLLABORATION_USE___VALIDATE_CONNECTORS__DIAGNOSTICCHAIN_MAP :
				return validateConnectors((DiagnosticChain) arguments.get(0),
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
		UMLPackage.COLLABORATION_USE__OWNED_COMMENT,
		UMLPackage.COLLABORATION_USE__NAME_EXPRESSION,
		UMLPackage.COLLABORATION_USE__ROLE_BINDING};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| eIsSet(UMLPackage.COLLABORATION_USE__ROLE_BINDING);
	}

} //CollaborationUseImpl
