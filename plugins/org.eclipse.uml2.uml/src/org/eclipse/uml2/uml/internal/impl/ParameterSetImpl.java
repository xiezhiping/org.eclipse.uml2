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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.ParameterSet;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.ParameterSetOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ParameterSetImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ParameterSetImpl#getConditions <em>Condition</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ParameterSetImpl#getParameters <em>Parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterSetImpl
		extends NamedElementImpl
		implements ParameterSet {

	/**
	 * The cached value of the '{@link #getConditions() <em>Condition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditions()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> conditions;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameter</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> parameters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.PARAMETER_SET;
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
						UMLPackage.PARAMETER_SET__OWNED_ELEMENT,
						OWNED_ELEMENT_ESUBSETS));
			}
			return ownedElements;
		}
		return new DerivedUnionEObjectEList<Element>(Element.class, this,
			UMLPackage.PARAMETER_SET__OWNED_ELEMENT, OWNED_ELEMENT_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectWithInverseResolvingEList.ManyInverse<Parameter>(
				Parameter.class, this, UMLPackage.PARAMETER_SET__PARAMETER,
				UMLPackage.PARAMETER__PARAMETER_SET);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter getParameter(String name, Type type) {
		return getParameter(name, type, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter getParameter(String name, Type type, boolean ignoreCase) {
		parameterLoop : for (Parameter parameter : getParameters()) {
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(parameter.getName())
				: name.equals(parameter.getName())))
				continue parameterLoop;
			if (type != null && !type.equals(parameter.getType()))
				continue parameterLoop;
			return parameter;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getConditions() {
		if (conditions == null) {
			conditions = new EObjectContainmentEList.Resolving<Constraint>(
				Constraint.class, this, UMLPackage.PARAMETER_SET__CONDITION);
		}
		return conditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint createCondition(String name, EClass eClass) {
		Constraint newCondition = (Constraint) create(eClass);
		getConditions().add(newCondition);
		if (name != null)
			newCondition.setName(name);
		return newCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint createCondition(String name) {
		return createCondition(name, UMLPackage.Literals.CONSTRAINT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint getCondition(String name) {
		return getCondition(name, false, null, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint getCondition(String name, boolean ignoreCase,
			EClass eClass, boolean createOnDemand) {
		conditionLoop : for (Constraint condition : getConditions()) {
			if (eClass != null && !eClass.isInstance(condition))
				continue conditionLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(condition.getName())
				: name.equals(condition.getName())))
				continue conditionLoop;
			return condition;
		}
		return createOnDemand && eClass != null
			? createCondition(name, eClass)
			: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSameParameterizedEntity(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ParameterSetOperations.validateSameParameterizedEntity(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInput(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ParameterSetOperations.validateInput(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTwoParameterSets(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ParameterSetOperations.validateTwoParameterSets(this,
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
			case UMLPackage.PARAMETER_SET__EANNOTATIONS :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getEAnnotations())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.PARAMETER_SET__PARAMETER :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getParameters())
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
			case UMLPackage.PARAMETER_SET__EANNOTATIONS :
				return ((InternalEList<?>) getEAnnotations())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.PARAMETER_SET__OWNED_COMMENT :
				return ((InternalEList<?>) getOwnedComments())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.PARAMETER_SET__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.PARAMETER_SET__CONDITION :
				return ((InternalEList<?>) getConditions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.PARAMETER_SET__PARAMETER :
				return ((InternalEList<?>) getParameters())
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
			case UMLPackage.PARAMETER_SET__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.PARAMETER_SET__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.PARAMETER_SET__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.PARAMETER_SET__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.PARAMETER_SET__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.PARAMETER_SET__NAME :
				return getName();
			case UMLPackage.PARAMETER_SET__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.PARAMETER_SET__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.PARAMETER_SET__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.PARAMETER_SET__VISIBILITY :
				return getVisibility();
			case UMLPackage.PARAMETER_SET__CONDITION :
				return getConditions();
			case UMLPackage.PARAMETER_SET__PARAMETER :
				return getParameters();
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
			case UMLPackage.PARAMETER_SET__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations()
					.addAll((Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.PARAMETER_SET__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments()
					.addAll((Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.PARAMETER_SET__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.PARAMETER_SET__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.PARAMETER_SET__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.PARAMETER_SET__CONDITION :
				getConditions().clear();
				getConditions()
					.addAll((Collection<? extends Constraint>) newValue);
				return;
			case UMLPackage.PARAMETER_SET__PARAMETER :
				getParameters().clear();
				getParameters()
					.addAll((Collection<? extends Parameter>) newValue);
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
			case UMLPackage.PARAMETER_SET__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.PARAMETER_SET__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.PARAMETER_SET__NAME :
				unsetName();
				return;
			case UMLPackage.PARAMETER_SET__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.PARAMETER_SET__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.PARAMETER_SET__CONDITION :
				getConditions().clear();
				return;
			case UMLPackage.PARAMETER_SET__PARAMETER :
				getParameters().clear();
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
			case UMLPackage.PARAMETER_SET__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.PARAMETER_SET__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.PARAMETER_SET__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.PARAMETER_SET__OWNER :
				return isSetOwner();
			case UMLPackage.PARAMETER_SET__CLIENT_DEPENDENCY :
				return !getClientDependencies().isEmpty();
			case UMLPackage.PARAMETER_SET__NAME :
				return isSetName();
			case UMLPackage.PARAMETER_SET__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.PARAMETER_SET__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.PARAMETER_SET__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.PARAMETER_SET__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.PARAMETER_SET__CONDITION :
				return conditions != null && !conditions.isEmpty();
			case UMLPackage.PARAMETER_SET__PARAMETER :
				return parameters != null && !parameters.isEmpty();
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
			case UMLPackage.PARAMETER_SET___GET_EANNOTATION__STRING :
				return getEAnnotation((String) arguments.get(0));
			case UMLPackage.PARAMETER_SET___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP :
				return validateHasOwner((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PARAMETER_SET___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP :
				return validateNotOwnSelf((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PARAMETER_SET___ADD_KEYWORD__STRING :
				return addKeyword((String) arguments.get(0));
			case UMLPackage.PARAMETER_SET___APPLY_STEREOTYPE__STEREOTYPE :
				return applyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.PARAMETER_SET___CREATE_EANNOTATION__STRING :
				return createEAnnotation((String) arguments.get(0));
			case UMLPackage.PARAMETER_SET___DESTROY :
				destroy();
				return null;
			case UMLPackage.PARAMETER_SET___GET_KEYWORDS :
				return getKeywords();
			case UMLPackage.PARAMETER_SET___GET_APPLICABLE_STEREOTYPE__STRING :
				return getApplicableStereotype((String) arguments.get(0));
			case UMLPackage.PARAMETER_SET___GET_APPLICABLE_STEREOTYPES :
				return getApplicableStereotypes();
			case UMLPackage.PARAMETER_SET___GET_APPLIED_STEREOTYPE__STRING :
				return getAppliedStereotype((String) arguments.get(0));
			case UMLPackage.PARAMETER_SET___GET_APPLIED_STEREOTYPES :
				return getAppliedStereotypes();
			case UMLPackage.PARAMETER_SET___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING :
				return getAppliedSubstereotype((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.PARAMETER_SET___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE :
				return getAppliedSubstereotypes((Stereotype) arguments.get(0));
			case UMLPackage.PARAMETER_SET___GET_MODEL :
				return getModel();
			case UMLPackage.PARAMETER_SET___GET_NEAREST_PACKAGE :
				return getNearestPackage();
			case UMLPackage.PARAMETER_SET___GET_RELATIONSHIPS :
				return getRelationships();
			case UMLPackage.PARAMETER_SET___GET_RELATIONSHIPS__ECLASS :
				return getRelationships((EClass) arguments.get(0));
			case UMLPackage.PARAMETER_SET___GET_REQUIRED_STEREOTYPE__STRING :
				return getRequiredStereotype((String) arguments.get(0));
			case UMLPackage.PARAMETER_SET___GET_REQUIRED_STEREOTYPES :
				return getRequiredStereotypes();
			case UMLPackage.PARAMETER_SET___GET_SOURCE_DIRECTED_RELATIONSHIPS :
				return getSourceDirectedRelationships();
			case UMLPackage.PARAMETER_SET___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS :
				return getSourceDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.PARAMETER_SET___GET_STEREOTYPE_APPLICATION__STEREOTYPE :
				return getStereotypeApplication((Stereotype) arguments.get(0));
			case UMLPackage.PARAMETER_SET___GET_STEREOTYPE_APPLICATIONS :
				return getStereotypeApplications();
			case UMLPackage.PARAMETER_SET___GET_TARGET_DIRECTED_RELATIONSHIPS :
				return getTargetDirectedRelationships();
			case UMLPackage.PARAMETER_SET___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS :
				return getTargetDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.PARAMETER_SET___GET_VALUE__STEREOTYPE_STRING :
				return getValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.PARAMETER_SET___HAS_KEYWORD__STRING :
				return hasKeyword((String) arguments.get(0));
			case UMLPackage.PARAMETER_SET___HAS_VALUE__STEREOTYPE_STRING :
				return hasValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.PARAMETER_SET___IS_STEREOTYPE_APPLICABLE__STEREOTYPE :
				return isStereotypeApplicable((Stereotype) arguments.get(0));
			case UMLPackage.PARAMETER_SET___IS_STEREOTYPE_APPLIED__STEREOTYPE :
				return isStereotypeApplied((Stereotype) arguments.get(0));
			case UMLPackage.PARAMETER_SET___IS_STEREOTYPE_REQUIRED__STEREOTYPE :
				return isStereotypeRequired((Stereotype) arguments.get(0));
			case UMLPackage.PARAMETER_SET___REMOVE_KEYWORD__STRING :
				return removeKeyword((String) arguments.get(0));
			case UMLPackage.PARAMETER_SET___SET_VALUE__STEREOTYPE_STRING_OBJECT :
				setValue((Stereotype) arguments.get(0),
					(String) arguments.get(1), arguments.get(2));
				return null;
			case UMLPackage.PARAMETER_SET___UNAPPLY_STEREOTYPE__STEREOTYPE :
				return unapplyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.PARAMETER_SET___ALL_OWNED_ELEMENTS :
				return allOwnedElements();
			case UMLPackage.PARAMETER_SET___MUST_BE_OWNED :
				return mustBeOwned();
			case UMLPackage.PARAMETER_SET___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP :
				return validateVisibilityNeedsOwnership(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PARAMETER_SET___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PARAMETER_SET___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasNoQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PARAMETER_SET___CREATE_DEPENDENCY__NAMEDELEMENT :
				return createDependency((NamedElement) arguments.get(0));
			case UMLPackage.PARAMETER_SET___CREATE_USAGE__NAMEDELEMENT :
				return createUsage((NamedElement) arguments.get(0));
			case UMLPackage.PARAMETER_SET___GET_LABEL :
				return getLabel();
			case UMLPackage.PARAMETER_SET___GET_LABEL__BOOLEAN :
				return getLabel((Boolean) arguments.get(0));
			case UMLPackage.PARAMETER_SET___GET_NAMESPACE :
				return getNamespace();
			case UMLPackage.PARAMETER_SET___ALL_NAMESPACES :
				return allNamespaces();
			case UMLPackage.PARAMETER_SET___ALL_OWNING_PACKAGES :
				return allOwningPackages();
			case UMLPackage.PARAMETER_SET___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE :
				return isDistinguishableFrom((NamedElement) arguments.get(0),
					(Namespace) arguments.get(1));
			case UMLPackage.PARAMETER_SET___GET_QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.PARAMETER_SET___SEPARATOR :
				return separator();
			case UMLPackage.PARAMETER_SET___GET_CLIENT_DEPENDENCIES :
				return getClientDependencies();
			case UMLPackage.PARAMETER_SET___VALIDATE_SAME_PARAMETERIZED_ENTITY__DIAGNOSTICCHAIN_MAP :
				return validateSameParameterizedEntity(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PARAMETER_SET___VALIDATE_INPUT__DIAGNOSTICCHAIN_MAP :
				return validateInput((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PARAMETER_SET___VALIDATE_TWO_PARAMETER_SETS__DIAGNOSTICCHAIN_MAP :
				return validateTwoParameterSets(
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
		UMLPackage.PARAMETER_SET__OWNED_COMMENT,
		UMLPackage.PARAMETER_SET__NAME_EXPRESSION,
		UMLPackage.PARAMETER_SET__CONDITION};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| eIsSet(UMLPackage.PARAMETER_SET__CONDITION);
	}

} //ParameterSetImpl
