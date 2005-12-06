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
 * $Id: OpaqueExpressionImpl.java,v 1.9 2005/12/06 23:21:49 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.uml.Behavior;
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
	protected EClass eStaticClass() {
		return UMLPackage.Literals.OPAQUE_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getBodies() {
		List body = (List) eVirtualGet(UMLPackage.OPAQUE_EXPRESSION__BODY);
		if (body == null) {
			eVirtualSet(UMLPackage.OPAQUE_EXPRESSION__BODY,
				body = new EDataTypeUniqueEList.Unsettable(String.class, this,
					UMLPackage.OPAQUE_EXPRESSION__BODY));
		}
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBodies() {
		((InternalEList.Unsettable) getBodies()).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBodies() {
		List body = (List) eVirtualGet(UMLPackage.OPAQUE_EXPRESSION__BODY);
		return body != null && ((InternalEList.Unsettable) body).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getLanguages() {
		List language = (List) eVirtualGet(UMLPackage.OPAQUE_EXPRESSION__LANGUAGE);
		if (language == null) {
			eVirtualSet(UMLPackage.OPAQUE_EXPRESSION__LANGUAGE,
				language = new EDataTypeUniqueEList(String.class, this,
					UMLPackage.OPAQUE_EXPRESSION__LANGUAGE));
		}
		return language;
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
		Behavior behavior = (Behavior) eVirtualGet(UMLPackage.OPAQUE_EXPRESSION__BEHAVIOR);
		if (behavior != null && behavior.eIsProxy()) {
			InternalEObject oldBehavior = (InternalEObject) behavior;
			behavior = (Behavior) eResolveProxy(oldBehavior);
			if (behavior != oldBehavior) {
				eVirtualSet(UMLPackage.OPAQUE_EXPRESSION__BEHAVIOR, behavior);
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
		return (Behavior) eVirtualGet(UMLPackage.OPAQUE_EXPRESSION__BEHAVIOR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBehavior(Behavior newBehavior) {
		Behavior behavior = newBehavior;
		Object oldBehavior = eVirtualSet(
			UMLPackage.OPAQUE_EXPRESSION__BEHAVIOR, behavior);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.OPAQUE_EXPRESSION__BEHAVIOR,
				oldBehavior == EVIRTUAL_NO_VALUE
					? null
					: oldBehavior, behavior));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLanguageBodySize(DiagnosticChain diagnostics,
			Map context) {
		return OpaqueExpressionOperations.validateLanguageBodySize(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOneBodyDefaultLanguage(DiagnosticChain diagnostics,
			Map context) {
		return OpaqueExpressionOperations.validateOneBodyDefaultLanguage(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOnlyReturnResultParameters(
			DiagnosticChain diagnostics, Map context) {
		return OpaqueExpressionOperations.validateOnlyReturnResultParameters(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOneReturnResultParameter(
			DiagnosticChain diagnostics, Map context) {
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
				return getNameExpression();
			case UMLPackage.OPAQUE_EXPRESSION__TEMPLATE_PARAMETER :
				if (resolve)
					return getTemplateParameter();
				return basicGetTemplateParameter();
			case UMLPackage.OPAQUE_EXPRESSION__OWNING_TEMPLATE_PARAMETER :
				if (resolve)
					return getOwningTemplateParameter();
				return basicGetOwningTemplateParameter();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UMLPackage.OPAQUE_EXPRESSION__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.OPAQUE_EXPRESSION__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.OPAQUE_EXPRESSION__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.OPAQUE_EXPRESSION__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.OPAQUE_EXPRESSION__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.OPAQUE_EXPRESSION__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.OPAQUE_EXPRESSION__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.OPAQUE_EXPRESSION__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.OPAQUE_EXPRESSION__TYPE :
				setType((Type) newValue);
				return;
			case UMLPackage.OPAQUE_EXPRESSION__BODY :
				getBodies().clear();
				getBodies().addAll((Collection) newValue);
				return;
			case UMLPackage.OPAQUE_EXPRESSION__LANGUAGE :
				getLanguages().clear();
				getLanguages().addAll((Collection) newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case UMLPackage.OPAQUE_EXPRESSION__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.OPAQUE_EXPRESSION__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.OPAQUE_EXPRESSION__NAME :
				setName(NAME_EDEFAULT);
				return;
			case UMLPackage.OPAQUE_EXPRESSION__VISIBILITY :
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UMLPackage.OPAQUE_EXPRESSION__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.OPAQUE_EXPRESSION__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.OPAQUE_EXPRESSION__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.OPAQUE_EXPRESSION__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.OPAQUE_EXPRESSION__TYPE :
				setType((Type) null);
				return;
			case UMLPackage.OPAQUE_EXPRESSION__BODY :
				unsetBodies();
				return;
			case UMLPackage.OPAQUE_EXPRESSION__LANGUAGE :
				getLanguages().clear();
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UMLPackage.OPAQUE_EXPRESSION__EANNOTATIONS :
				EList eAnnotations = (EList) eVirtualGet(UMLPackage.OPAQUE_EXPRESSION__EANNOTATIONS);
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.OPAQUE_EXPRESSION__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.OPAQUE_EXPRESSION__OWNER :
				return isSetOwner();
			case UMLPackage.OPAQUE_EXPRESSION__OWNED_COMMENT :
				List ownedComment = (List) eVirtualGet(UMLPackage.OPAQUE_EXPRESSION__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.OPAQUE_EXPRESSION__NAME :
				String name = (String) eVirtualGet(
					UMLPackage.OPAQUE_EXPRESSION__NAME, NAME_EDEFAULT);
				return NAME_EDEFAULT == null
					? name != null
					: !NAME_EDEFAULT.equals(name);
			case UMLPackage.OPAQUE_EXPRESSION__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.OPAQUE_EXPRESSION__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.OPAQUE_EXPRESSION__CLIENT_DEPENDENCY :
				List clientDependency = (List) eVirtualGet(UMLPackage.OPAQUE_EXPRESSION__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.OPAQUE_EXPRESSION__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.OPAQUE_EXPRESSION__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.OPAQUE_EXPRESSION__NAME_EXPRESSION) != null;
			case UMLPackage.OPAQUE_EXPRESSION__TEMPLATE_PARAMETER :
				return eVirtualGet(UMLPackage.OPAQUE_EXPRESSION__TEMPLATE_PARAMETER) != null;
			case UMLPackage.OPAQUE_EXPRESSION__OWNING_TEMPLATE_PARAMETER :
				return basicGetOwningTemplateParameter() != null;
			case UMLPackage.OPAQUE_EXPRESSION__TYPE :
				return eVirtualGet(UMLPackage.OPAQUE_EXPRESSION__TYPE) != null;
			case UMLPackage.OPAQUE_EXPRESSION__BODY :
				return isSetBodies();
			case UMLPackage.OPAQUE_EXPRESSION__LANGUAGE :
				List language = (List) eVirtualGet(UMLPackage.OPAQUE_EXPRESSION__LANGUAGE);
				return language != null && !language.isEmpty();
			case UMLPackage.OPAQUE_EXPRESSION__RESULT :
				return basicGetResult() != null;
			case UMLPackage.OPAQUE_EXPRESSION__BEHAVIOR :
				return eVirtualGet(UMLPackage.OPAQUE_EXPRESSION__BEHAVIOR) != null;
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (body: "); //$NON-NLS-1$
		result.append(eVirtualGet(UMLPackage.OPAQUE_EXPRESSION__BODY));
		result.append(", language: "); //$NON-NLS-1$
		result.append(eVirtualGet(UMLPackage.OPAQUE_EXPRESSION__LANGUAGE));
		result.append(')');
		return result.toString();
	}

} //OpaqueExpressionImpl
