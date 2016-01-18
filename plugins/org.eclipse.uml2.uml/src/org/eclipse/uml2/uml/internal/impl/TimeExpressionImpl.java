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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.Observation;
import org.eclipse.uml2.uml.ParameterableElement;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.TimeExpression;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.ValueSpecification;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.TimeExpressionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.TimeExpressionImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.TimeExpressionImpl#getExpr <em>Expr</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.TimeExpressionImpl#getObservations <em>Observation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimeExpressionImpl
		extends ValueSpecificationImpl
		implements TimeExpression {

	/**
	 * The cached value of the '{@link #getExpr() <em>Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpr()
	 * @generated
	 * @ordered
	 */
	protected ValueSpecification expr;

	/**
	 * The cached value of the '{@link #getObservations() <em>Observation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObservations()
	 * @generated
	 * @ordered
	 */
	protected EList<Observation> observations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.TIME_EXPRESSION;
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
						UMLPackage.TIME_EXPRESSION__OWNED_ELEMENT,
						OWNED_ELEMENT_ESUBSETS));
			}
			return ownedElements;
		}
		return new DerivedUnionEObjectEList<Element>(Element.class, this,
			UMLPackage.TIME_EXPRESSION__OWNED_ELEMENT, OWNED_ELEMENT_ESUBSETS);
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
		UMLPackage.TIME_EXPRESSION__OWNED_COMMENT,
		UMLPackage.TIME_EXPRESSION__NAME_EXPRESSION,
		UMLPackage.TIME_EXPRESSION__EXPR};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getExpr() {
		if (expr != null && expr.eIsProxy()) {
			InternalEObject oldExpr = (InternalEObject) expr;
			expr = (ValueSpecification) eResolveProxy(oldExpr);
			if (expr != oldExpr) {
				InternalEObject newExpr = (InternalEObject) expr;
				NotificationChain msgs = oldExpr.eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE - UMLPackage.TIME_EXPRESSION__EXPR,
					null, null);
				if (newExpr.eInternalContainer() == null) {
					msgs = newExpr.eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- UMLPackage.TIME_EXPRESSION__EXPR, null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.TIME_EXPRESSION__EXPR, oldExpr, expr));
			}
		}
		return expr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification basicGetExpr() {
		return expr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpr(ValueSpecification newExpr,
			NotificationChain msgs) {
		ValueSpecification oldExpr = expr;
		expr = newExpr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET, UMLPackage.TIME_EXPRESSION__EXPR, oldExpr,
				newExpr);
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
	public void setExpr(ValueSpecification newExpr) {
		if (newExpr != expr) {
			NotificationChain msgs = null;
			if (expr != null)
				msgs = ((InternalEObject) expr).eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE - UMLPackage.TIME_EXPRESSION__EXPR,
					null, msgs);
			if (newExpr != null)
				msgs = ((InternalEObject) newExpr).eInverseAdd(this,
					EOPPOSITE_FEATURE_BASE - UMLPackage.TIME_EXPRESSION__EXPR,
					null, msgs);
			msgs = basicSetExpr(newExpr, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.TIME_EXPRESSION__EXPR, newExpr, newExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification createExpr(String name, Type type,
			EClass eClass) {
		ValueSpecification newExpr = (ValueSpecification) create(eClass);
		setExpr(newExpr);
		if (name != null)
			newExpr.setName(name);
		if (type != null)
			newExpr.setType(type);
		return newExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Observation> getObservations() {
		if (observations == null) {
			observations = new EObjectResolvingEList<Observation>(
				Observation.class, this,
				UMLPackage.TIME_EXPRESSION__OBSERVATION);
		}
		return observations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Observation getObservation(String name) {
		return getObservation(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Observation getObservation(String name, boolean ignoreCase,
			EClass eClass) {
		observationLoop : for (Observation observation : getObservations()) {
			if (eClass != null && !eClass.isInstance(observation))
				continue observationLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(observation.getName())
				: name.equals(observation.getName())))
				continue observationLoop;
			return observation;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNoExprRequiresObservation(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TimeExpressionOperations.validateNoExprRequiresObservation(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String stringValue() {
		return TimeExpressionOperations.stringValue(this);
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
			case UMLPackage.TIME_EXPRESSION__EANNOTATIONS :
				return ((InternalEList<?>) getEAnnotations())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.TIME_EXPRESSION__OWNED_COMMENT :
				return ((InternalEList<?>) getOwnedComments())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.TIME_EXPRESSION__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.TIME_EXPRESSION__OWNING_TEMPLATE_PARAMETER :
				return basicSetOwningTemplateParameter(null, msgs);
			case UMLPackage.TIME_EXPRESSION__TEMPLATE_PARAMETER :
				return basicSetTemplateParameter(null, msgs);
			case UMLPackage.TIME_EXPRESSION__EXPR :
				return basicSetExpr(null, msgs);
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
			case UMLPackage.TIME_EXPRESSION__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.TIME_EXPRESSION__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.TIME_EXPRESSION__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.TIME_EXPRESSION__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.TIME_EXPRESSION__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.TIME_EXPRESSION__NAME :
				return getName();
			case UMLPackage.TIME_EXPRESSION__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.TIME_EXPRESSION__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.TIME_EXPRESSION__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.TIME_EXPRESSION__VISIBILITY :
				return getVisibility();
			case UMLPackage.TIME_EXPRESSION__OWNING_TEMPLATE_PARAMETER :
				if (resolve)
					return getOwningTemplateParameter();
				return basicGetOwningTemplateParameter();
			case UMLPackage.TIME_EXPRESSION__TEMPLATE_PARAMETER :
				if (resolve)
					return getTemplateParameter();
				return basicGetTemplateParameter();
			case UMLPackage.TIME_EXPRESSION__TYPE :
				if (resolve)
					return getType();
				return basicGetType();
			case UMLPackage.TIME_EXPRESSION__EXPR :
				if (resolve)
					return getExpr();
				return basicGetExpr();
			case UMLPackage.TIME_EXPRESSION__OBSERVATION :
				return getObservations();
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
			case UMLPackage.TIME_EXPRESSION__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations()
					.addAll((Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.TIME_EXPRESSION__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments()
					.addAll((Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.TIME_EXPRESSION__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.TIME_EXPRESSION__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.TIME_EXPRESSION__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.TIME_EXPRESSION__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.TIME_EXPRESSION__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.TIME_EXPRESSION__TYPE :
				setType((Type) newValue);
				return;
			case UMLPackage.TIME_EXPRESSION__EXPR :
				setExpr((ValueSpecification) newValue);
				return;
			case UMLPackage.TIME_EXPRESSION__OBSERVATION :
				getObservations().clear();
				getObservations()
					.addAll((Collection<? extends Observation>) newValue);
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
			case UMLPackage.TIME_EXPRESSION__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.TIME_EXPRESSION__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.TIME_EXPRESSION__NAME :
				unsetName();
				return;
			case UMLPackage.TIME_EXPRESSION__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.TIME_EXPRESSION__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.TIME_EXPRESSION__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.TIME_EXPRESSION__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.TIME_EXPRESSION__TYPE :
				setType((Type) null);
				return;
			case UMLPackage.TIME_EXPRESSION__EXPR :
				setExpr((ValueSpecification) null);
				return;
			case UMLPackage.TIME_EXPRESSION__OBSERVATION :
				getObservations().clear();
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
			case UMLPackage.TIME_EXPRESSION__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.TIME_EXPRESSION__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.TIME_EXPRESSION__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.TIME_EXPRESSION__OWNER :
				return isSetOwner();
			case UMLPackage.TIME_EXPRESSION__CLIENT_DEPENDENCY :
				return !getClientDependencies().isEmpty();
			case UMLPackage.TIME_EXPRESSION__NAME :
				return isSetName();
			case UMLPackage.TIME_EXPRESSION__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.TIME_EXPRESSION__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.TIME_EXPRESSION__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.TIME_EXPRESSION__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.TIME_EXPRESSION__OWNING_TEMPLATE_PARAMETER :
				return basicGetOwningTemplateParameter() != null;
			case UMLPackage.TIME_EXPRESSION__TEMPLATE_PARAMETER :
				return templateParameter != null;
			case UMLPackage.TIME_EXPRESSION__TYPE :
				return type != null;
			case UMLPackage.TIME_EXPRESSION__EXPR :
				return expr != null;
			case UMLPackage.TIME_EXPRESSION__OBSERVATION :
				return observations != null && !observations.isEmpty();
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
			case UMLPackage.TIME_EXPRESSION___GET_EANNOTATION__STRING :
				return getEAnnotation((String) arguments.get(0));
			case UMLPackage.TIME_EXPRESSION___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP :
				return validateHasOwner((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.TIME_EXPRESSION___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP :
				return validateNotOwnSelf((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.TIME_EXPRESSION___ADD_KEYWORD__STRING :
				return addKeyword((String) arguments.get(0));
			case UMLPackage.TIME_EXPRESSION___APPLY_STEREOTYPE__STEREOTYPE :
				return applyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.TIME_EXPRESSION___CREATE_EANNOTATION__STRING :
				return createEAnnotation((String) arguments.get(0));
			case UMLPackage.TIME_EXPRESSION___DESTROY :
				destroy();
				return null;
			case UMLPackage.TIME_EXPRESSION___GET_KEYWORDS :
				return getKeywords();
			case UMLPackage.TIME_EXPRESSION___GET_APPLICABLE_STEREOTYPE__STRING :
				return getApplicableStereotype((String) arguments.get(0));
			case UMLPackage.TIME_EXPRESSION___GET_APPLICABLE_STEREOTYPES :
				return getApplicableStereotypes();
			case UMLPackage.TIME_EXPRESSION___GET_APPLIED_STEREOTYPE__STRING :
				return getAppliedStereotype((String) arguments.get(0));
			case UMLPackage.TIME_EXPRESSION___GET_APPLIED_STEREOTYPES :
				return getAppliedStereotypes();
			case UMLPackage.TIME_EXPRESSION___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING :
				return getAppliedSubstereotype((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.TIME_EXPRESSION___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE :
				return getAppliedSubstereotypes((Stereotype) arguments.get(0));
			case UMLPackage.TIME_EXPRESSION___GET_MODEL :
				return getModel();
			case UMLPackage.TIME_EXPRESSION___GET_NEAREST_PACKAGE :
				return getNearestPackage();
			case UMLPackage.TIME_EXPRESSION___GET_RELATIONSHIPS :
				return getRelationships();
			case UMLPackage.TIME_EXPRESSION___GET_RELATIONSHIPS__ECLASS :
				return getRelationships((EClass) arguments.get(0));
			case UMLPackage.TIME_EXPRESSION___GET_REQUIRED_STEREOTYPE__STRING :
				return getRequiredStereotype((String) arguments.get(0));
			case UMLPackage.TIME_EXPRESSION___GET_REQUIRED_STEREOTYPES :
				return getRequiredStereotypes();
			case UMLPackage.TIME_EXPRESSION___GET_SOURCE_DIRECTED_RELATIONSHIPS :
				return getSourceDirectedRelationships();
			case UMLPackage.TIME_EXPRESSION___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS :
				return getSourceDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.TIME_EXPRESSION___GET_STEREOTYPE_APPLICATION__STEREOTYPE :
				return getStereotypeApplication((Stereotype) arguments.get(0));
			case UMLPackage.TIME_EXPRESSION___GET_STEREOTYPE_APPLICATIONS :
				return getStereotypeApplications();
			case UMLPackage.TIME_EXPRESSION___GET_TARGET_DIRECTED_RELATIONSHIPS :
				return getTargetDirectedRelationships();
			case UMLPackage.TIME_EXPRESSION___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS :
				return getTargetDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.TIME_EXPRESSION___GET_VALUE__STEREOTYPE_STRING :
				return getValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.TIME_EXPRESSION___HAS_KEYWORD__STRING :
				return hasKeyword((String) arguments.get(0));
			case UMLPackage.TIME_EXPRESSION___HAS_VALUE__STEREOTYPE_STRING :
				return hasValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.TIME_EXPRESSION___IS_STEREOTYPE_APPLICABLE__STEREOTYPE :
				return isStereotypeApplicable((Stereotype) arguments.get(0));
			case UMLPackage.TIME_EXPRESSION___IS_STEREOTYPE_APPLIED__STEREOTYPE :
				return isStereotypeApplied((Stereotype) arguments.get(0));
			case UMLPackage.TIME_EXPRESSION___IS_STEREOTYPE_REQUIRED__STEREOTYPE :
				return isStereotypeRequired((Stereotype) arguments.get(0));
			case UMLPackage.TIME_EXPRESSION___REMOVE_KEYWORD__STRING :
				return removeKeyword((String) arguments.get(0));
			case UMLPackage.TIME_EXPRESSION___SET_VALUE__STEREOTYPE_STRING_OBJECT :
				setValue((Stereotype) arguments.get(0),
					(String) arguments.get(1), arguments.get(2));
				return null;
			case UMLPackage.TIME_EXPRESSION___UNAPPLY_STEREOTYPE__STEREOTYPE :
				return unapplyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.TIME_EXPRESSION___ALL_OWNED_ELEMENTS :
				return allOwnedElements();
			case UMLPackage.TIME_EXPRESSION___MUST_BE_OWNED :
				return mustBeOwned();
			case UMLPackage.TIME_EXPRESSION___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP :
				return validateVisibilityNeedsOwnership(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.TIME_EXPRESSION___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.TIME_EXPRESSION___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasNoQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.TIME_EXPRESSION___CREATE_DEPENDENCY__NAMEDELEMENT :
				return createDependency((NamedElement) arguments.get(0));
			case UMLPackage.TIME_EXPRESSION___CREATE_USAGE__NAMEDELEMENT :
				return createUsage((NamedElement) arguments.get(0));
			case UMLPackage.TIME_EXPRESSION___GET_LABEL :
				return getLabel();
			case UMLPackage.TIME_EXPRESSION___GET_LABEL__BOOLEAN :
				return getLabel((Boolean) arguments.get(0));
			case UMLPackage.TIME_EXPRESSION___GET_NAMESPACE :
				return getNamespace();
			case UMLPackage.TIME_EXPRESSION___ALL_NAMESPACES :
				return allNamespaces();
			case UMLPackage.TIME_EXPRESSION___ALL_OWNING_PACKAGES :
				return allOwningPackages();
			case UMLPackage.TIME_EXPRESSION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE :
				return isDistinguishableFrom((NamedElement) arguments.get(0),
					(Namespace) arguments.get(1));
			case UMLPackage.TIME_EXPRESSION___GET_QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.TIME_EXPRESSION___SEPARATOR :
				return separator();
			case UMLPackage.TIME_EXPRESSION___GET_CLIENT_DEPENDENCIES :
				return getClientDependencies();
			case UMLPackage.TIME_EXPRESSION___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT :
				return isCompatibleWith(
					(ParameterableElement) arguments.get(0));
			case UMLPackage.TIME_EXPRESSION___IS_TEMPLATE_PARAMETER :
				return isTemplateParameter();
			case UMLPackage.TIME_EXPRESSION___VALIDATE_NAMESPACE_NEEDS_VISIBILITY__DIAGNOSTICCHAIN_MAP :
				return validateNamespaceNeedsVisibility(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.TIME_EXPRESSION___BOOLEAN_VALUE :
				return booleanValue();
			case UMLPackage.TIME_EXPRESSION___INTEGER_VALUE :
				return integerValue();
			case UMLPackage.TIME_EXPRESSION___IS_COMPUTABLE :
				return isComputable();
			case UMLPackage.TIME_EXPRESSION___IS_NULL :
				return isNull();
			case UMLPackage.TIME_EXPRESSION___REAL_VALUE :
				return realValue();
			case UMLPackage.TIME_EXPRESSION___STRING_VALUE :
				return stringValue();
			case UMLPackage.TIME_EXPRESSION___UNLIMITED_VALUE :
				return unlimitedValue();
			case UMLPackage.TIME_EXPRESSION___VALIDATE_NO_EXPR_REQUIRES_OBSERVATION__DIAGNOSTICCHAIN_MAP :
				return validateNoExprRequiresObservation(
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
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| eIsSet(UMLPackage.TIME_EXPRESSION__EXPR);
	}

} //TimeExpressionImpl
