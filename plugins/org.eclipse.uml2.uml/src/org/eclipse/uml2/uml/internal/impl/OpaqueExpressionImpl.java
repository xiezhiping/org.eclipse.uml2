/*
 * Copyright (c) 2005, 2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: OpaqueExpressionImpl.java,v 1.19 2006/12/14 15:49:29 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.OpaqueExpression;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.OpaqueExpressionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Opaque Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.OpaqueExpressionImpl#getBodies <em>Body</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.OpaqueExpressionImpl#getLanguages <em>Language</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.OpaqueExpressionImpl#getResult <em>Result</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.OpaqueExpressionImpl#getBehavior <em>Behavior</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OpaqueExpressionImpl
		extends ValueSpecificationImpl
		implements OpaqueExpression {

	/**
	 * The cached value of the '{@link #getBodies() <em>Body</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodies()
	 * @generated
	 * @ordered
	 */
	protected EList<String> bodies = null;

	/**
	 * The cached value of the '{@link #getLanguages() <em>Language</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguages()
	 * @generated
	 * @ordered
	 */
	protected EList<String> languages = null;

	/**
	 * The cached value of the '{@link #getBehavior() <em>Behavior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehavior()
	 * @generated
	 * @ordered
	 */
	protected Behavior behavior = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OpaqueExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.OPAQUE_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getBodies() {
		if (bodies == null) {
			bodies = new EDataTypeEList.Unsettable<String>(String.class, this,
				UMLPackage.OPAQUE_EXPRESSION__BODY);
		}
		return bodies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBodies() {
		if (bodies != null)
			((InternalEList.Unsettable<?>) bodies).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBodies() {
		return bodies != null && ((InternalEList.Unsettable<?>) bodies).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getLanguages() {
		if (languages == null) {
			languages = new EDataTypeUniqueEList.Unsettable<String>(
				String.class, this, UMLPackage.OPAQUE_EXPRESSION__LANGUAGE);
		}
		return languages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLanguages() {
		if (languages != null)
			((InternalEList.Unsettable<?>) languages).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLanguages() {
		return languages != null
			&& ((InternalEList.Unsettable<?>) languages).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter getResult() {
		Parameter result = basicGetResult();
		return result != null && result.eIsProxy()
			? (Parameter) eResolveProxy((InternalEObject) result)
			: result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter basicGetResult() {

		return OpaqueExpressionOperations.getResult(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior getBehavior() {
		if (behavior != null && behavior.eIsProxy()) {
			InternalEObject oldBehavior = (InternalEObject) behavior;
			behavior = (Behavior) eResolveProxy(oldBehavior);
			if (behavior != oldBehavior) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.OPAQUE_EXPRESSION__BEHAVIOR, oldBehavior,
						behavior));
			}
		}
		return behavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior basicGetBehavior() {
		return behavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBehavior(Behavior newBehavior) {

		Behavior oldBehavior = behavior;
		behavior = newBehavior;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.OPAQUE_EXPRESSION__BEHAVIOR, oldBehavior, behavior));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLanguageBodySize(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return OpaqueExpressionOperations.validateLanguageBodySize(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOnlyReturnResultParameters(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OpaqueExpressionOperations.validateOnlyReturnResultParameters(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOneReturnResultParameter(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OpaqueExpressionOperations.validateOneReturnResultParameter(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int value() {
		return OpaqueExpressionOperations.value(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIntegral() {
		return OpaqueExpressionOperations.isIntegral(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPositive() {
		return OpaqueExpressionOperations.isPositive(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNonNegative() {
		return OpaqueExpressionOperations.isNonNegative(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String stringValue() {
		return OpaqueExpressionOperations.stringValue(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.OPAQUE_EXPRESSION__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.OPAQUE_EXPRESSION__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.OPAQUE_EXPRESSION__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.OPAQUE_EXPRESSION__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.OPAQUE_EXPRESSION__NAME :
				return getName();
			case UMLPackage.OPAQUE_EXPRESSION__VISIBILITY :
				return getVisibility();
			case UMLPackage.OPAQUE_EXPRESSION__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.OPAQUE_EXPRESSION__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.OPAQUE_EXPRESSION__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.OPAQUE_EXPRESSION__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.OPAQUE_EXPRESSION__OWNING_TEMPLATE_PARAMETER :
				if (resolve)
					return getOwningTemplateParameter();
				return basicGetOwningTemplateParameter();
			case UMLPackage.OPAQUE_EXPRESSION__TEMPLATE_PARAMETER :
				if (resolve)
					return getTemplateParameter();
				return basicGetTemplateParameter();
			case UMLPackage.OPAQUE_EXPRESSION__TYPE :
				if (resolve)
					return getType();
				return basicGetType();
			case UMLPackage.OPAQUE_EXPRESSION__BODY :
				return getBodies();
			case UMLPackage.OPAQUE_EXPRESSION__LANGUAGE :
				return getLanguages();
			case UMLPackage.OPAQUE_EXPRESSION__RESULT :
				if (resolve)
					return getResult();
				return basicGetResult();
			case UMLPackage.OPAQUE_EXPRESSION__BEHAVIOR :
				if (resolve)
					return getBehavior();
				return basicGetBehavior();
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
			case UMLPackage.OPAQUE_EXPRESSION__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll(
					(Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.OPAQUE_EXPRESSION__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll(
					(Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.OPAQUE_EXPRESSION__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.OPAQUE_EXPRESSION__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.OPAQUE_EXPRESSION__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll(
					(Collection<? extends Dependency>) newValue);
				return;
			case UMLPackage.OPAQUE_EXPRESSION__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.OPAQUE_EXPRESSION__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.OPAQUE_EXPRESSION__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.OPAQUE_EXPRESSION__TYPE :
				setType((Type) newValue);
				return;
			case UMLPackage.OPAQUE_EXPRESSION__BODY :
				getBodies().clear();
				getBodies().addAll((Collection<? extends String>) newValue);
				return;
			case UMLPackage.OPAQUE_EXPRESSION__LANGUAGE :
				getLanguages().clear();
				getLanguages().addAll((Collection<? extends String>) newValue);
				return;
			case UMLPackage.OPAQUE_EXPRESSION__BEHAVIOR :
				setBehavior((Behavior) newValue);
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
			case UMLPackage.OPAQUE_EXPRESSION__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.OPAQUE_EXPRESSION__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.OPAQUE_EXPRESSION__NAME :
				unsetName();
				return;
			case UMLPackage.OPAQUE_EXPRESSION__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.OPAQUE_EXPRESSION__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.OPAQUE_EXPRESSION__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.OPAQUE_EXPRESSION__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.OPAQUE_EXPRESSION__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.OPAQUE_EXPRESSION__TYPE :
				setType((Type) null);
				return;
			case UMLPackage.OPAQUE_EXPRESSION__BODY :
				unsetBodies();
				return;
			case UMLPackage.OPAQUE_EXPRESSION__LANGUAGE :
				unsetLanguages();
				return;
			case UMLPackage.OPAQUE_EXPRESSION__BEHAVIOR :
				setBehavior((Behavior) null);
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
			case UMLPackage.OPAQUE_EXPRESSION__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.OPAQUE_EXPRESSION__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.OPAQUE_EXPRESSION__OWNER :
				return isSetOwner();
			case UMLPackage.OPAQUE_EXPRESSION__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.OPAQUE_EXPRESSION__NAME :
				return isSetName();
			case UMLPackage.OPAQUE_EXPRESSION__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.OPAQUE_EXPRESSION__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.OPAQUE_EXPRESSION__CLIENT_DEPENDENCY :
				return clientDependencies != null
					&& !clientDependencies.isEmpty();
			case UMLPackage.OPAQUE_EXPRESSION__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.OPAQUE_EXPRESSION__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.OPAQUE_EXPRESSION__OWNING_TEMPLATE_PARAMETER :
				return basicGetOwningTemplateParameter() != null;
			case UMLPackage.OPAQUE_EXPRESSION__TEMPLATE_PARAMETER :
				return templateParameter != null;
			case UMLPackage.OPAQUE_EXPRESSION__TYPE :
				return type != null;
			case UMLPackage.OPAQUE_EXPRESSION__BODY :
				return isSetBodies();
			case UMLPackage.OPAQUE_EXPRESSION__LANGUAGE :
				return isSetLanguages();
			case UMLPackage.OPAQUE_EXPRESSION__RESULT :
				return basicGetResult() != null;
			case UMLPackage.OPAQUE_EXPRESSION__BEHAVIOR :
				return behavior != null;
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (body: "); //$NON-NLS-1$
		result.append(bodies);
		result.append(", language: "); //$NON-NLS-1$
		result.append(languages);
		result.append(')');
		return result.toString();
	}

} //OpaqueExpressionImpl
