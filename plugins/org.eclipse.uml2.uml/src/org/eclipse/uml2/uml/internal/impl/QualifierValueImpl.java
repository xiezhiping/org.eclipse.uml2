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
import org.eclipse.uml2.uml.InputPin;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.QualifierValue;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLPackage;

import org.eclipse.uml2.uml.internal.operations.QualifierValueOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Qualifier Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.QualifierValueImpl#getQualifier <em>Qualifier</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.QualifierValueImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QualifierValueImpl
		extends ElementImpl
		implements QualifierValue {

	/**
	 * The cached value of the '{@link #getQualifier() <em>Qualifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifier()
	 * @generated
	 * @ordered
	 */
	protected Property qualifier;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected InputPin value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QualifierValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.QUALIFIER_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getQualifier() {
		if (qualifier != null && qualifier.eIsProxy()) {
			InternalEObject oldQualifier = (InternalEObject) qualifier;
			qualifier = (Property) eResolveProxy(oldQualifier);
			if (qualifier != oldQualifier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.QUALIFIER_VALUE__QUALIFIER, oldQualifier,
						qualifier));
			}
		}
		return qualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property basicGetQualifier() {
		return qualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQualifier(Property newQualifier) {
		Property oldQualifier = qualifier;
		qualifier = newQualifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.QUALIFIER_VALUE__QUALIFIER, oldQualifier,
				qualifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin getValue() {
		if (value != null && value.eIsProxy()) {
			InternalEObject oldValue = (InternalEObject) value;
			value = (InputPin) eResolveProxy(oldValue);
			if (value != oldValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.QUALIFIER_VALUE__VALUE, oldValue, value));
			}
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin basicGetValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(InputPin newValue) {
		InputPin oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.QUALIFIER_VALUE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQualifierAttribute(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return QualifierValueOperations.validateQualifierAttribute(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeOfQualifier(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return QualifierValueOperations.validateTypeOfQualifier(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultiplicityOfQualifier(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return QualifierValueOperations.validateMultiplicityOfQualifier(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.QUALIFIER_VALUE__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.QUALIFIER_VALUE__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.QUALIFIER_VALUE__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.QUALIFIER_VALUE__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.QUALIFIER_VALUE__QUALIFIER :
				if (resolve)
					return getQualifier();
				return basicGetQualifier();
			case UMLPackage.QUALIFIER_VALUE__VALUE :
				if (resolve)
					return getValue();
				return basicGetValue();
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
			case UMLPackage.QUALIFIER_VALUE__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations()
					.addAll((Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.QUALIFIER_VALUE__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments()
					.addAll((Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.QUALIFIER_VALUE__QUALIFIER :
				setQualifier((Property) newValue);
				return;
			case UMLPackage.QUALIFIER_VALUE__VALUE :
				setValue((InputPin) newValue);
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
			case UMLPackage.QUALIFIER_VALUE__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.QUALIFIER_VALUE__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.QUALIFIER_VALUE__QUALIFIER :
				setQualifier((Property) null);
				return;
			case UMLPackage.QUALIFIER_VALUE__VALUE :
				setValue((InputPin) null);
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
			case UMLPackage.QUALIFIER_VALUE__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.QUALIFIER_VALUE__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.QUALIFIER_VALUE__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.QUALIFIER_VALUE__OWNER :
				return isSetOwner();
			case UMLPackage.QUALIFIER_VALUE__QUALIFIER :
				return qualifier != null;
			case UMLPackage.QUALIFIER_VALUE__VALUE :
				return value != null;
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
			case UMLPackage.QUALIFIER_VALUE___GET_EANNOTATION__STRING :
				return getEAnnotation((String) arguments.get(0));
			case UMLPackage.QUALIFIER_VALUE___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP :
				return validateHasOwner((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.QUALIFIER_VALUE___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP :
				return validateNotOwnSelf((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.QUALIFIER_VALUE___ADD_KEYWORD__STRING :
				return addKeyword((String) arguments.get(0));
			case UMLPackage.QUALIFIER_VALUE___APPLY_STEREOTYPE__STEREOTYPE :
				return applyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.QUALIFIER_VALUE___CREATE_EANNOTATION__STRING :
				return createEAnnotation((String) arguments.get(0));
			case UMLPackage.QUALIFIER_VALUE___DESTROY :
				destroy();
				return null;
			case UMLPackage.QUALIFIER_VALUE___GET_KEYWORDS :
				return getKeywords();
			case UMLPackage.QUALIFIER_VALUE___GET_APPLICABLE_STEREOTYPE__STRING :
				return getApplicableStereotype((String) arguments.get(0));
			case UMLPackage.QUALIFIER_VALUE___GET_APPLICABLE_STEREOTYPES :
				return getApplicableStereotypes();
			case UMLPackage.QUALIFIER_VALUE___GET_APPLIED_STEREOTYPE__STRING :
				return getAppliedStereotype((String) arguments.get(0));
			case UMLPackage.QUALIFIER_VALUE___GET_APPLIED_STEREOTYPES :
				return getAppliedStereotypes();
			case UMLPackage.QUALIFIER_VALUE___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING :
				return getAppliedSubstereotype((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.QUALIFIER_VALUE___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE :
				return getAppliedSubstereotypes((Stereotype) arguments.get(0));
			case UMLPackage.QUALIFIER_VALUE___GET_MODEL :
				return getModel();
			case UMLPackage.QUALIFIER_VALUE___GET_NEAREST_PACKAGE :
				return getNearestPackage();
			case UMLPackage.QUALIFIER_VALUE___GET_RELATIONSHIPS :
				return getRelationships();
			case UMLPackage.QUALIFIER_VALUE___GET_RELATIONSHIPS__ECLASS :
				return getRelationships((EClass) arguments.get(0));
			case UMLPackage.QUALIFIER_VALUE___GET_REQUIRED_STEREOTYPE__STRING :
				return getRequiredStereotype((String) arguments.get(0));
			case UMLPackage.QUALIFIER_VALUE___GET_REQUIRED_STEREOTYPES :
				return getRequiredStereotypes();
			case UMLPackage.QUALIFIER_VALUE___GET_SOURCE_DIRECTED_RELATIONSHIPS :
				return getSourceDirectedRelationships();
			case UMLPackage.QUALIFIER_VALUE___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS :
				return getSourceDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.QUALIFIER_VALUE___GET_STEREOTYPE_APPLICATION__STEREOTYPE :
				return getStereotypeApplication((Stereotype) arguments.get(0));
			case UMLPackage.QUALIFIER_VALUE___GET_STEREOTYPE_APPLICATIONS :
				return getStereotypeApplications();
			case UMLPackage.QUALIFIER_VALUE___GET_TARGET_DIRECTED_RELATIONSHIPS :
				return getTargetDirectedRelationships();
			case UMLPackage.QUALIFIER_VALUE___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS :
				return getTargetDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.QUALIFIER_VALUE___GET_VALUE__STEREOTYPE_STRING :
				return getValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.QUALIFIER_VALUE___HAS_KEYWORD__STRING :
				return hasKeyword((String) arguments.get(0));
			case UMLPackage.QUALIFIER_VALUE___HAS_VALUE__STEREOTYPE_STRING :
				return hasValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.QUALIFIER_VALUE___IS_STEREOTYPE_APPLICABLE__STEREOTYPE :
				return isStereotypeApplicable((Stereotype) arguments.get(0));
			case UMLPackage.QUALIFIER_VALUE___IS_STEREOTYPE_APPLIED__STEREOTYPE :
				return isStereotypeApplied((Stereotype) arguments.get(0));
			case UMLPackage.QUALIFIER_VALUE___IS_STEREOTYPE_REQUIRED__STEREOTYPE :
				return isStereotypeRequired((Stereotype) arguments.get(0));
			case UMLPackage.QUALIFIER_VALUE___REMOVE_KEYWORD__STRING :
				return removeKeyword((String) arguments.get(0));
			case UMLPackage.QUALIFIER_VALUE___SET_VALUE__STEREOTYPE_STRING_OBJECT :
				setValue((Stereotype) arguments.get(0),
					(String) arguments.get(1), arguments.get(2));
				return null;
			case UMLPackage.QUALIFIER_VALUE___UNAPPLY_STEREOTYPE__STEREOTYPE :
				return unapplyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.QUALIFIER_VALUE___ALL_OWNED_ELEMENTS :
				return allOwnedElements();
			case UMLPackage.QUALIFIER_VALUE___MUST_BE_OWNED :
				return mustBeOwned();
			case UMLPackage.QUALIFIER_VALUE___VALIDATE_MULTIPLICITY_OF_QUALIFIER__DIAGNOSTICCHAIN_MAP :
				return validateMultiplicityOfQualifier(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.QUALIFIER_VALUE___VALIDATE_TYPE_OF_QUALIFIER__DIAGNOSTICCHAIN_MAP :
				return validateTypeOfQualifier(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.QUALIFIER_VALUE___VALIDATE_QUALIFIER_ATTRIBUTE__DIAGNOSTICCHAIN_MAP :
				return validateQualifierAttribute(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		}
		return eDynamicInvoke(operationID, arguments);
	}

} //QualifierValueImpl
