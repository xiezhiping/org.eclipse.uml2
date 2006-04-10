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
 * $Id: ParameterSetImpl.java,v 1.15 2006/04/10 19:16:19 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.ParameterSet;
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
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ParameterSetImpl#getParameters <em>Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ParameterSetImpl#getConditions <em>Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParameterSetImpl
		extends NamedElementImpl
		implements ParameterSet {

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameter</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList parameters = null;

	/**
	 * The cached value of the '{@link #getConditions() <em>Condition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditions()
	 * @generated
	 * @ordered
	 */
	protected EList conditions = null;

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
	protected EClass eStaticClass() {
		return UMLPackage.Literals.PARAMETER_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedElements() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			EList ownedElements = (EList) cache.get(eResource, this,
				UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
			if (ownedElements == null) {
				cache.put(eResource, this,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT,
					ownedElements = new DerivedUnionEObjectEList(Element.class,
						this, UMLPackage.PARAMETER_SET__OWNED_ELEMENT,
						OWNED_ELEMENT_ESUBSETS));
			}
			return ownedElements;
		}
		return new DerivedUnionEObjectEList(Element.class, this,
			UMLPackage.PARAMETER_SET__OWNED_ELEMENT, OWNED_ELEMENT_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getParameters() {
		if (parameters == null) {
			parameters = new EObjectWithInverseResolvingEList.ManyInverse(
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
		parameterLoop : for (Iterator i = getParameters().iterator(); i
			.hasNext();) {
			Parameter parameter = (Parameter) i.next();
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
	public EList getConditions() {
		if (conditions == null) {
			conditions = new EObjectContainmentEList.Resolving(
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
		if (name != null)
			newCondition.setName(name);
		getConditions().add(newCondition);
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
		conditionLoop : for (Iterator i = getConditions().iterator(); i
			.hasNext();) {
			Constraint condition = (Constraint) i.next();
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
			Map context) {
		return ParameterSetOperations.validateSameParameterizedEntity(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInput(DiagnosticChain diagnostics, Map context) {
		return ParameterSetOperations.validateInput(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTwoParameterSets(DiagnosticChain diagnostics,
			Map context) {
		return ParameterSetOperations.validateTwoParameterSets(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.PARAMETER_SET__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.PARAMETER_SET__CLIENT_DEPENDENCY :
				return ((InternalEList) getClientDependencies()).basicAdd(
					otherEnd, msgs);
			case UMLPackage.PARAMETER_SET__PARAMETER :
				return ((InternalEList) getParameters()).basicAdd(otherEnd,
					msgs);
		}
		return eDynamicInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.PARAMETER_SET__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.PARAMETER_SET__OWNED_COMMENT :
				return ((InternalEList) getOwnedComments()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.PARAMETER_SET__CLIENT_DEPENDENCY :
				return ((InternalEList) getClientDependencies()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.PARAMETER_SET__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.PARAMETER_SET__PARAMETER :
				return ((InternalEList) getParameters()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.PARAMETER_SET__CONDITION :
				return ((InternalEList) getConditions()).basicRemove(otherEnd,
					msgs);
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
			case UMLPackage.PARAMETER_SET__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.PARAMETER_SET__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.PARAMETER_SET__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.PARAMETER_SET__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.PARAMETER_SET__NAME :
				return getName();
			case UMLPackage.PARAMETER_SET__VISIBILITY :
				return getVisibility();
			case UMLPackage.PARAMETER_SET__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.PARAMETER_SET__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.PARAMETER_SET__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.PARAMETER_SET__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.PARAMETER_SET__PARAMETER :
				return getParameters();
			case UMLPackage.PARAMETER_SET__CONDITION :
				return getConditions();
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
			case UMLPackage.PARAMETER_SET__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.PARAMETER_SET__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.PARAMETER_SET__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.PARAMETER_SET__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.PARAMETER_SET__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.PARAMETER_SET__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.PARAMETER_SET__PARAMETER :
				getParameters().clear();
				getParameters().addAll((Collection) newValue);
				return;
			case UMLPackage.PARAMETER_SET__CONDITION :
				getConditions().clear();
				getConditions().addAll((Collection) newValue);
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
			case UMLPackage.PARAMETER_SET__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.PARAMETER_SET__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.PARAMETER_SET__NAME :
				unsetName();
				return;
			case UMLPackage.PARAMETER_SET__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.PARAMETER_SET__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.PARAMETER_SET__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.PARAMETER_SET__PARAMETER :
				getParameters().clear();
				return;
			case UMLPackage.PARAMETER_SET__CONDITION :
				getConditions().clear();
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
			case UMLPackage.PARAMETER_SET__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.PARAMETER_SET__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.PARAMETER_SET__OWNER :
				return isSetOwner();
			case UMLPackage.PARAMETER_SET__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.PARAMETER_SET__NAME :
				return isSetName();
			case UMLPackage.PARAMETER_SET__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.PARAMETER_SET__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.PARAMETER_SET__CLIENT_DEPENDENCY :
				return clientDependencies != null
					&& !clientDependencies.isEmpty();
			case UMLPackage.PARAMETER_SET__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.PARAMETER_SET__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.PARAMETER_SET__PARAMETER :
				return parameters != null && !parameters.isEmpty();
			case UMLPackage.PARAMETER_SET__CONDITION :
				return conditions != null && !conditions.isEmpty();
		}
		return eDynamicIsSet(featureID);
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
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| eIsSet(UMLPackage.PARAMETER_SET__CONDITION);
	}

} //ParameterSetImpl
