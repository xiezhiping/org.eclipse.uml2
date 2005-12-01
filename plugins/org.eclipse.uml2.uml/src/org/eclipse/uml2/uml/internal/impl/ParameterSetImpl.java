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
 * $Id: ParameterSetImpl.java,v 1.6 2005/12/01 20:04:37 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.ParameterSet;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.UMLFactory;
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
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ParameterSetImpl#getOwnedElements <em>Owned Element</em>}</li>
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
	public List getOwnedElements() {
		List ownedElement = (List) eVirtualGet(UMLPackage.PARAMETER_SET__OWNED_ELEMENT);
		if (ownedElement == null) {
			eVirtualSet(UMLPackage.PARAMETER_SET__OWNED_ELEMENT,
				ownedElement = new DerivedUnionEObjectEList(Element.class,
					this, UMLPackage.PARAMETER_SET__OWNED_ELEMENT, new int[]{
						UMLPackage.PARAMETER_SET__OWNED_COMMENT,
						UMLPackage.PARAMETER_SET__NAME_EXPRESSION,
						UMLPackage.PARAMETER_SET__CONDITION}));
		}
		return ownedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getParameters() {
		List parameter = (List) eVirtualGet(UMLPackage.PARAMETER_SET__PARAMETER);
		if (parameter == null) {
			eVirtualSet(UMLPackage.PARAMETER_SET__PARAMETER,
				parameter = new EObjectWithInverseResolvingEList.ManyInverse(
					Parameter.class, this, UMLPackage.PARAMETER_SET__PARAMETER,
					UMLPackage.PARAMETER__PARAMETER_SET));
		}
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter getParameter(String name) {
		for (Iterator i = getParameters().iterator(); i.hasNext();) {
			Parameter parameter = (Parameter) i.next();
			if (name.equals(parameter.getName())) {
				return parameter;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getConditions() {
		List condition = (List) eVirtualGet(UMLPackage.PARAMETER_SET__CONDITION);
		if (condition == null) {
			eVirtualSet(UMLPackage.PARAMETER_SET__CONDITION,
				condition = new EObjectContainmentEList(Constraint.class, this,
					UMLPackage.PARAMETER_SET__CONDITION));
		}
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint createCondition(EClass eClass) {
		Constraint newCondition = (Constraint) eClass.getEPackage()
			.getEFactoryInstance().create(eClass);
		getConditions().add(newCondition);
		return newCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint createCondition() {
		Constraint newCondition = UMLFactory.eINSTANCE.createConstraint();
		getConditions().add(newCondition);
		return newCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint getCondition(String name) {
		for (Iterator i = getConditions().iterator(); i.hasNext();) {
			Constraint condition = (Constraint) i.next();
			if (name.equals(condition.getName())) {
				return condition;
			}
		}
		return null;
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
				return getNameExpression();
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
				setName(NAME_EDEFAULT);
				return;
			case UMLPackage.PARAMETER_SET__VISIBILITY :
				setVisibility(VISIBILITY_EDEFAULT);
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
				List ownedComment = (List) eVirtualGet(UMLPackage.PARAMETER_SET__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.PARAMETER_SET__NAME :
				String name = (String) eVirtualGet(
					UMLPackage.PARAMETER_SET__NAME, NAME_EDEFAULT);
				return NAME_EDEFAULT == null
					? name != null
					: !NAME_EDEFAULT.equals(name);
			case UMLPackage.PARAMETER_SET__VISIBILITY :
				return eVirtualGet(UMLPackage.PARAMETER_SET__VISIBILITY,
					VISIBILITY_EDEFAULT) != VISIBILITY_EDEFAULT;
			case UMLPackage.PARAMETER_SET__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.PARAMETER_SET__CLIENT_DEPENDENCY :
				List clientDependency = (List) eVirtualGet(UMLPackage.PARAMETER_SET__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.PARAMETER_SET__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.PARAMETER_SET__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.PARAMETER_SET__NAME_EXPRESSION) != null;
			case UMLPackage.PARAMETER_SET__PARAMETER :
				List parameter = (List) eVirtualGet(UMLPackage.PARAMETER_SET__PARAMETER);
				return parameter != null && !parameter.isEmpty();
			case UMLPackage.PARAMETER_SET__CONDITION :
				List condition = (List) eVirtualGet(UMLPackage.PARAMETER_SET__CONDITION);
				return condition != null && !condition.isEmpty();
		}
		return eDynamicIsSet(featureID);
	}

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
