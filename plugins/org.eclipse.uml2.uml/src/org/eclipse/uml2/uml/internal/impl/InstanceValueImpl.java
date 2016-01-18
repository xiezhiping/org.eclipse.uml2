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

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.InstanceSpecification;
import org.eclipse.uml2.uml.InstanceValue;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.ParameterableElement;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.InstanceValueOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instance Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InstanceValueImpl#getInstance <em>Instance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InstanceValueImpl
		extends ValueSpecificationImpl
		implements InstanceValue {

	/**
	 * The cached value of the '{@link #getInstance() <em>Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstance()
	 * @generated
	 * @ordered
	 */
	protected InstanceSpecification instance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstanceValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.INSTANCE_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceSpecification getInstance() {
		if (instance != null && instance.eIsProxy()) {
			InternalEObject oldInstance = (InternalEObject) instance;
			instance = (InstanceSpecification) eResolveProxy(oldInstance);
			if (instance != oldInstance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.INSTANCE_VALUE__INSTANCE, oldInstance,
						instance));
			}
		}
		return instance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceSpecification basicGetInstance() {
		return instance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstance(InstanceSpecification newInstance) {
		InstanceSpecification oldInstance = instance;
		instance = newInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.INSTANCE_VALUE__INSTANCE, oldInstance, instance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String stringValue() {
		return InstanceValueOperations.stringValue(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.INSTANCE_VALUE__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.INSTANCE_VALUE__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.INSTANCE_VALUE__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.INSTANCE_VALUE__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.INSTANCE_VALUE__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.INSTANCE_VALUE__NAME :
				return getName();
			case UMLPackage.INSTANCE_VALUE__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.INSTANCE_VALUE__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.INSTANCE_VALUE__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.INSTANCE_VALUE__VISIBILITY :
				return getVisibility();
			case UMLPackage.INSTANCE_VALUE__OWNING_TEMPLATE_PARAMETER :
				if (resolve)
					return getOwningTemplateParameter();
				return basicGetOwningTemplateParameter();
			case UMLPackage.INSTANCE_VALUE__TEMPLATE_PARAMETER :
				if (resolve)
					return getTemplateParameter();
				return basicGetTemplateParameter();
			case UMLPackage.INSTANCE_VALUE__TYPE :
				if (resolve)
					return getType();
				return basicGetType();
			case UMLPackage.INSTANCE_VALUE__INSTANCE :
				if (resolve)
					return getInstance();
				return basicGetInstance();
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
			case UMLPackage.INSTANCE_VALUE__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations()
					.addAll((Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.INSTANCE_VALUE__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments()
					.addAll((Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.INSTANCE_VALUE__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.INSTANCE_VALUE__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.INSTANCE_VALUE__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.INSTANCE_VALUE__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.INSTANCE_VALUE__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.INSTANCE_VALUE__TYPE :
				setType((Type) newValue);
				return;
			case UMLPackage.INSTANCE_VALUE__INSTANCE :
				setInstance((InstanceSpecification) newValue);
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
			case UMLPackage.INSTANCE_VALUE__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.INSTANCE_VALUE__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.INSTANCE_VALUE__NAME :
				unsetName();
				return;
			case UMLPackage.INSTANCE_VALUE__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.INSTANCE_VALUE__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.INSTANCE_VALUE__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.INSTANCE_VALUE__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.INSTANCE_VALUE__TYPE :
				setType((Type) null);
				return;
			case UMLPackage.INSTANCE_VALUE__INSTANCE :
				setInstance((InstanceSpecification) null);
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
			case UMLPackage.INSTANCE_VALUE__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.INSTANCE_VALUE__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.INSTANCE_VALUE__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.INSTANCE_VALUE__OWNER :
				return isSetOwner();
			case UMLPackage.INSTANCE_VALUE__CLIENT_DEPENDENCY :
				return !getClientDependencies().isEmpty();
			case UMLPackage.INSTANCE_VALUE__NAME :
				return isSetName();
			case UMLPackage.INSTANCE_VALUE__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.INSTANCE_VALUE__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.INSTANCE_VALUE__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.INSTANCE_VALUE__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.INSTANCE_VALUE__OWNING_TEMPLATE_PARAMETER :
				return basicGetOwningTemplateParameter() != null;
			case UMLPackage.INSTANCE_VALUE__TEMPLATE_PARAMETER :
				return templateParameter != null;
			case UMLPackage.INSTANCE_VALUE__TYPE :
				return type != null;
			case UMLPackage.INSTANCE_VALUE__INSTANCE :
				return instance != null;
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
			case UMLPackage.INSTANCE_VALUE___GET_EANNOTATION__STRING :
				return getEAnnotation((String) arguments.get(0));
			case UMLPackage.INSTANCE_VALUE___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP :
				return validateHasOwner((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.INSTANCE_VALUE___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP :
				return validateNotOwnSelf((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.INSTANCE_VALUE___ADD_KEYWORD__STRING :
				return addKeyword((String) arguments.get(0));
			case UMLPackage.INSTANCE_VALUE___APPLY_STEREOTYPE__STEREOTYPE :
				return applyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.INSTANCE_VALUE___CREATE_EANNOTATION__STRING :
				return createEAnnotation((String) arguments.get(0));
			case UMLPackage.INSTANCE_VALUE___DESTROY :
				destroy();
				return null;
			case UMLPackage.INSTANCE_VALUE___GET_KEYWORDS :
				return getKeywords();
			case UMLPackage.INSTANCE_VALUE___GET_APPLICABLE_STEREOTYPE__STRING :
				return getApplicableStereotype((String) arguments.get(0));
			case UMLPackage.INSTANCE_VALUE___GET_APPLICABLE_STEREOTYPES :
				return getApplicableStereotypes();
			case UMLPackage.INSTANCE_VALUE___GET_APPLIED_STEREOTYPE__STRING :
				return getAppliedStereotype((String) arguments.get(0));
			case UMLPackage.INSTANCE_VALUE___GET_APPLIED_STEREOTYPES :
				return getAppliedStereotypes();
			case UMLPackage.INSTANCE_VALUE___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING :
				return getAppliedSubstereotype((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.INSTANCE_VALUE___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE :
				return getAppliedSubstereotypes((Stereotype) arguments.get(0));
			case UMLPackage.INSTANCE_VALUE___GET_MODEL :
				return getModel();
			case UMLPackage.INSTANCE_VALUE___GET_NEAREST_PACKAGE :
				return getNearestPackage();
			case UMLPackage.INSTANCE_VALUE___GET_RELATIONSHIPS :
				return getRelationships();
			case UMLPackage.INSTANCE_VALUE___GET_RELATIONSHIPS__ECLASS :
				return getRelationships((EClass) arguments.get(0));
			case UMLPackage.INSTANCE_VALUE___GET_REQUIRED_STEREOTYPE__STRING :
				return getRequiredStereotype((String) arguments.get(0));
			case UMLPackage.INSTANCE_VALUE___GET_REQUIRED_STEREOTYPES :
				return getRequiredStereotypes();
			case UMLPackage.INSTANCE_VALUE___GET_SOURCE_DIRECTED_RELATIONSHIPS :
				return getSourceDirectedRelationships();
			case UMLPackage.INSTANCE_VALUE___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS :
				return getSourceDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.INSTANCE_VALUE___GET_STEREOTYPE_APPLICATION__STEREOTYPE :
				return getStereotypeApplication((Stereotype) arguments.get(0));
			case UMLPackage.INSTANCE_VALUE___GET_STEREOTYPE_APPLICATIONS :
				return getStereotypeApplications();
			case UMLPackage.INSTANCE_VALUE___GET_TARGET_DIRECTED_RELATIONSHIPS :
				return getTargetDirectedRelationships();
			case UMLPackage.INSTANCE_VALUE___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS :
				return getTargetDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.INSTANCE_VALUE___GET_VALUE__STEREOTYPE_STRING :
				return getValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.INSTANCE_VALUE___HAS_KEYWORD__STRING :
				return hasKeyword((String) arguments.get(0));
			case UMLPackage.INSTANCE_VALUE___HAS_VALUE__STEREOTYPE_STRING :
				return hasValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.INSTANCE_VALUE___IS_STEREOTYPE_APPLICABLE__STEREOTYPE :
				return isStereotypeApplicable((Stereotype) arguments.get(0));
			case UMLPackage.INSTANCE_VALUE___IS_STEREOTYPE_APPLIED__STEREOTYPE :
				return isStereotypeApplied((Stereotype) arguments.get(0));
			case UMLPackage.INSTANCE_VALUE___IS_STEREOTYPE_REQUIRED__STEREOTYPE :
				return isStereotypeRequired((Stereotype) arguments.get(0));
			case UMLPackage.INSTANCE_VALUE___REMOVE_KEYWORD__STRING :
				return removeKeyword((String) arguments.get(0));
			case UMLPackage.INSTANCE_VALUE___SET_VALUE__STEREOTYPE_STRING_OBJECT :
				setValue((Stereotype) arguments.get(0),
					(String) arguments.get(1), arguments.get(2));
				return null;
			case UMLPackage.INSTANCE_VALUE___UNAPPLY_STEREOTYPE__STEREOTYPE :
				return unapplyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.INSTANCE_VALUE___ALL_OWNED_ELEMENTS :
				return allOwnedElements();
			case UMLPackage.INSTANCE_VALUE___MUST_BE_OWNED :
				return mustBeOwned();
			case UMLPackage.INSTANCE_VALUE___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP :
				return validateVisibilityNeedsOwnership(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.INSTANCE_VALUE___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.INSTANCE_VALUE___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasNoQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.INSTANCE_VALUE___CREATE_DEPENDENCY__NAMEDELEMENT :
				return createDependency((NamedElement) arguments.get(0));
			case UMLPackage.INSTANCE_VALUE___CREATE_USAGE__NAMEDELEMENT :
				return createUsage((NamedElement) arguments.get(0));
			case UMLPackage.INSTANCE_VALUE___GET_LABEL :
				return getLabel();
			case UMLPackage.INSTANCE_VALUE___GET_LABEL__BOOLEAN :
				return getLabel((Boolean) arguments.get(0));
			case UMLPackage.INSTANCE_VALUE___GET_NAMESPACE :
				return getNamespace();
			case UMLPackage.INSTANCE_VALUE___ALL_NAMESPACES :
				return allNamespaces();
			case UMLPackage.INSTANCE_VALUE___ALL_OWNING_PACKAGES :
				return allOwningPackages();
			case UMLPackage.INSTANCE_VALUE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE :
				return isDistinguishableFrom((NamedElement) arguments.get(0),
					(Namespace) arguments.get(1));
			case UMLPackage.INSTANCE_VALUE___GET_QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.INSTANCE_VALUE___SEPARATOR :
				return separator();
			case UMLPackage.INSTANCE_VALUE___GET_CLIENT_DEPENDENCIES :
				return getClientDependencies();
			case UMLPackage.INSTANCE_VALUE___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT :
				return isCompatibleWith(
					(ParameterableElement) arguments.get(0));
			case UMLPackage.INSTANCE_VALUE___IS_TEMPLATE_PARAMETER :
				return isTemplateParameter();
			case UMLPackage.INSTANCE_VALUE___VALIDATE_NAMESPACE_NEEDS_VISIBILITY__DIAGNOSTICCHAIN_MAP :
				return validateNamespaceNeedsVisibility(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.INSTANCE_VALUE___BOOLEAN_VALUE :
				return booleanValue();
			case UMLPackage.INSTANCE_VALUE___INTEGER_VALUE :
				return integerValue();
			case UMLPackage.INSTANCE_VALUE___IS_COMPUTABLE :
				return isComputable();
			case UMLPackage.INSTANCE_VALUE___IS_NULL :
				return isNull();
			case UMLPackage.INSTANCE_VALUE___REAL_VALUE :
				return realValue();
			case UMLPackage.INSTANCE_VALUE___STRING_VALUE :
				return stringValue();
			case UMLPackage.INSTANCE_VALUE___UNLIMITED_VALUE :
				return unlimitedValue();
		}
		return eDynamicInvoke(operationID, arguments);
	}

} //InstanceValueImpl
