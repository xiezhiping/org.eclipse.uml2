/*
 * Copyright (c) 2005, 2016 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 212765, 418466, 451350, 485756
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

import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.OperationTemplateParameter;
import org.eclipse.uml2.uml.ParameterableElement;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.TemplateSignature;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.internal.operations.OperationTemplateParameterOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation Template Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.OperationTemplateParameterImpl#getParameteredElement <em>Parametered Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationTemplateParameterImpl
		extends TemplateParameterImpl
		implements OperationTemplateParameter {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationTemplateParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.OPERATION_TEMPLATE_PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParameterableElement getParameteredElement() {
		if (parameteredElement != null && parameteredElement.eIsProxy()) {
			InternalEObject oldParameteredElement = (InternalEObject) parameteredElement;
			parameteredElement = (ParameterableElement) eResolveProxy(
				oldParameteredElement);
			if (parameteredElement != oldParameteredElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.OPERATION_TEMPLATE_PARAMETER__PARAMETERED_ELEMENT,
						oldParameteredElement, parameteredElement));
			}
		}
		return parameteredElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParameterableElement basicGetParameteredElement() {
		return parameteredElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParameteredElementGen(
			ParameterableElement newParameteredElement,
			NotificationChain msgs) {
		if (newParameteredElement != null
			&& !(newParameteredElement instanceof Operation)) {
			throw new IllegalArgumentException(
				"newParameteredElement must be an instance of Operation"); //$NON-NLS-1$
		}
		ParameterableElement oldParameteredElement = parameteredElement;
		parameteredElement = newParameteredElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET,
				UMLPackage.OPERATION_TEMPLATE_PARAMETER__PARAMETERED_ELEMENT,
				oldParameteredElement, newParameteredElement);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	@Override
	public NotificationChain basicSetParameteredElement(
			ParameterableElement newParameteredElement,
			NotificationChain msgs) {
		msgs = basicSetParameteredElementGen(newParameteredElement, msgs);

		Resource.Internal eInternalResource = eInternalResource();

		if (eInternalResource == null || !eInternalResource.isLoading()) {

			if (ownedParameteredElement != null
				&& ownedParameteredElement != newParameteredElement) {

				setOwnedParameteredElement(null);
			}
		}

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParameteredElement(
			ParameterableElement newParameteredElement) {
		if (newParameteredElement != null
			&& !(newParameteredElement instanceof Operation)) {
			throw new IllegalArgumentException(
				"newParameteredElement must be an instance of Operation"); //$NON-NLS-1$
		}
		if (newParameteredElement != parameteredElement) {
			NotificationChain msgs = null;
			if (parameteredElement != null)
				msgs = ((InternalEObject) parameteredElement).eInverseRemove(
					this, UMLPackage.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER,
					ParameterableElement.class, msgs);
			if (newParameteredElement != null)
				msgs = ((InternalEObject) newParameteredElement).eInverseAdd(
					this, UMLPackage.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER,
					ParameterableElement.class, msgs);
			msgs = basicSetParameteredElement(newParameteredElement, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.OPERATION_TEMPLATE_PARAMETER__PARAMETERED_ELEMENT,
				newParameteredElement, newParameteredElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetParameteredElement() {
		return parameteredElement != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMatchDefaultSignature(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return OperationTemplateParameterOperations
			.validateMatchDefaultSignature(this, diagnostics, context);
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
			case UMLPackage.OPERATION_TEMPLATE_PARAMETER__EANNOTATIONS :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getEAnnotations())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.OPERATION_TEMPLATE_PARAMETER__PARAMETERED_ELEMENT :
				if (parameteredElement != null)
					msgs = ((InternalEObject) parameteredElement)
						.eInverseRemove(this,
							UMLPackage.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER,
							ParameterableElement.class, msgs);
				return basicSetParameteredElement(
					(ParameterableElement) otherEnd, msgs);
			case UMLPackage.OPERATION_TEMPLATE_PARAMETER__SIGNATURE :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSignature((TemplateSignature) otherEnd, msgs);
			case UMLPackage.OPERATION_TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT :
				if (ownedParameteredElement != null)
					msgs = ((InternalEObject) ownedParameteredElement)
						.eInverseRemove(this,
							EOPPOSITE_FEATURE_BASE
								- UMLPackage.OPERATION_TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
							null, msgs);
				return basicSetOwnedParameteredElement(
					(ParameterableElement) otherEnd, msgs);
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
			case UMLPackage.OPERATION_TEMPLATE_PARAMETER__EANNOTATIONS :
				return ((InternalEList<?>) getEAnnotations())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.OPERATION_TEMPLATE_PARAMETER__OWNED_COMMENT :
				return ((InternalEList<?>) getOwnedComments())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.OPERATION_TEMPLATE_PARAMETER__OWNED_DEFAULT :
				return basicSetOwnedDefault(null, msgs);
			case UMLPackage.OPERATION_TEMPLATE_PARAMETER__PARAMETERED_ELEMENT :
				return basicSetParameteredElement(null, msgs);
			case UMLPackage.OPERATION_TEMPLATE_PARAMETER__SIGNATURE :
				return basicSetSignature(null, msgs);
			case UMLPackage.OPERATION_TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT :
				return basicSetOwnedParameteredElement(null, msgs);
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
			case UMLPackage.OPERATION_TEMPLATE_PARAMETER__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.OPERATION_TEMPLATE_PARAMETER__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.OPERATION_TEMPLATE_PARAMETER__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.OPERATION_TEMPLATE_PARAMETER__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.OPERATION_TEMPLATE_PARAMETER__DEFAULT :
				if (resolve)
					return getDefault();
				return basicGetDefault();
			case UMLPackage.OPERATION_TEMPLATE_PARAMETER__OWNED_DEFAULT :
				if (resolve)
					return getOwnedDefault();
				return basicGetOwnedDefault();
			case UMLPackage.OPERATION_TEMPLATE_PARAMETER__PARAMETERED_ELEMENT :
				if (resolve)
					return getParameteredElement();
				return basicGetParameteredElement();
			case UMLPackage.OPERATION_TEMPLATE_PARAMETER__SIGNATURE :
				if (resolve)
					return getSignature();
				return basicGetSignature();
			case UMLPackage.OPERATION_TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT :
				if (resolve)
					return getOwnedParameteredElement();
				return basicGetOwnedParameteredElement();
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
			case UMLPackage.OPERATION_TEMPLATE_PARAMETER__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations()
					.addAll((Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.OPERATION_TEMPLATE_PARAMETER__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments()
					.addAll((Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.OPERATION_TEMPLATE_PARAMETER__DEFAULT :
				setDefault((ParameterableElement) newValue);
				return;
			case UMLPackage.OPERATION_TEMPLATE_PARAMETER__OWNED_DEFAULT :
				setOwnedDefault((ParameterableElement) newValue);
				return;
			case UMLPackage.OPERATION_TEMPLATE_PARAMETER__PARAMETERED_ELEMENT :
				setParameteredElement((ParameterableElement) newValue);
				return;
			case UMLPackage.OPERATION_TEMPLATE_PARAMETER__SIGNATURE :
				setSignature((TemplateSignature) newValue);
				return;
			case UMLPackage.OPERATION_TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT :
				setOwnedParameteredElement((ParameterableElement) newValue);
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
			case UMLPackage.OPERATION_TEMPLATE_PARAMETER__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.OPERATION_TEMPLATE_PARAMETER__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.OPERATION_TEMPLATE_PARAMETER__DEFAULT :
				setDefault((ParameterableElement) null);
				return;
			case UMLPackage.OPERATION_TEMPLATE_PARAMETER__OWNED_DEFAULT :
				setOwnedDefault((ParameterableElement) null);
				return;
			case UMLPackage.OPERATION_TEMPLATE_PARAMETER__PARAMETERED_ELEMENT :
				setParameteredElement((ParameterableElement) null);
				return;
			case UMLPackage.OPERATION_TEMPLATE_PARAMETER__SIGNATURE :
				setSignature((TemplateSignature) null);
				return;
			case UMLPackage.OPERATION_TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT :
				setOwnedParameteredElement((ParameterableElement) null);
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
			case UMLPackage.OPERATION_TEMPLATE_PARAMETER__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.OPERATION_TEMPLATE_PARAMETER__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.OPERATION_TEMPLATE_PARAMETER__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.OPERATION_TEMPLATE_PARAMETER__OWNER :
				return isSetOwner();
			case UMLPackage.OPERATION_TEMPLATE_PARAMETER__DEFAULT :
				return default_ != null;
			case UMLPackage.OPERATION_TEMPLATE_PARAMETER__OWNED_DEFAULT :
				return ownedDefault != null;
			case UMLPackage.OPERATION_TEMPLATE_PARAMETER__PARAMETERED_ELEMENT :
				return isSetParameteredElement();
			case UMLPackage.OPERATION_TEMPLATE_PARAMETER__SIGNATURE :
				return basicGetSignature() != null;
			case UMLPackage.OPERATION_TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT :
				return ownedParameteredElement != null;
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
			case UMLPackage.OPERATION_TEMPLATE_PARAMETER___GET_EANNOTATION__STRING :
				return getEAnnotation((String) arguments.get(0));
			case UMLPackage.OPERATION_TEMPLATE_PARAMETER___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP :
				return validateHasOwner((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.OPERATION_TEMPLATE_PARAMETER___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP :
				return validateNotOwnSelf((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.OPERATION_TEMPLATE_PARAMETER___ADD_KEYWORD__STRING :
				return addKeyword((String) arguments.get(0));
			case UMLPackage.OPERATION_TEMPLATE_PARAMETER___APPLY_STEREOTYPE__STEREOTYPE :
				return applyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.OPERATION_TEMPLATE_PARAMETER___CREATE_EANNOTATION__STRING :
				return createEAnnotation((String) arguments.get(0));
			case UMLPackage.OPERATION_TEMPLATE_PARAMETER___DESTROY :
				destroy();
				return null;
			case UMLPackage.OPERATION_TEMPLATE_PARAMETER___GET_KEYWORDS :
				return getKeywords();
			case UMLPackage.OPERATION_TEMPLATE_PARAMETER___GET_APPLICABLE_STEREOTYPE__STRING :
				return getApplicableStereotype((String) arguments.get(0));
			case UMLPackage.OPERATION_TEMPLATE_PARAMETER___GET_APPLICABLE_STEREOTYPES :
				return getApplicableStereotypes();
			case UMLPackage.OPERATION_TEMPLATE_PARAMETER___GET_APPLIED_STEREOTYPE__STRING :
				return getAppliedStereotype((String) arguments.get(0));
			case UMLPackage.OPERATION_TEMPLATE_PARAMETER___GET_APPLIED_STEREOTYPES :
				return getAppliedStereotypes();
			case UMLPackage.OPERATION_TEMPLATE_PARAMETER___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING :
				return getAppliedSubstereotype((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.OPERATION_TEMPLATE_PARAMETER___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE :
				return getAppliedSubstereotypes((Stereotype) arguments.get(0));
			case UMLPackage.OPERATION_TEMPLATE_PARAMETER___GET_MODEL :
				return getModel();
			case UMLPackage.OPERATION_TEMPLATE_PARAMETER___GET_NEAREST_PACKAGE :
				return getNearestPackage();
			case UMLPackage.OPERATION_TEMPLATE_PARAMETER___GET_RELATIONSHIPS :
				return getRelationships();
			case UMLPackage.OPERATION_TEMPLATE_PARAMETER___GET_RELATIONSHIPS__ECLASS :
				return getRelationships((EClass) arguments.get(0));
			case UMLPackage.OPERATION_TEMPLATE_PARAMETER___GET_REQUIRED_STEREOTYPE__STRING :
				return getRequiredStereotype((String) arguments.get(0));
			case UMLPackage.OPERATION_TEMPLATE_PARAMETER___GET_REQUIRED_STEREOTYPES :
				return getRequiredStereotypes();
			case UMLPackage.OPERATION_TEMPLATE_PARAMETER___GET_SOURCE_DIRECTED_RELATIONSHIPS :
				return getSourceDirectedRelationships();
			case UMLPackage.OPERATION_TEMPLATE_PARAMETER___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS :
				return getSourceDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.OPERATION_TEMPLATE_PARAMETER___GET_STEREOTYPE_APPLICATION__STEREOTYPE :
				return getStereotypeApplication((Stereotype) arguments.get(0));
			case UMLPackage.OPERATION_TEMPLATE_PARAMETER___GET_STEREOTYPE_APPLICATIONS :
				return getStereotypeApplications();
			case UMLPackage.OPERATION_TEMPLATE_PARAMETER___GET_TARGET_DIRECTED_RELATIONSHIPS :
				return getTargetDirectedRelationships();
			case UMLPackage.OPERATION_TEMPLATE_PARAMETER___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS :
				return getTargetDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.OPERATION_TEMPLATE_PARAMETER___GET_VALUE__STEREOTYPE_STRING :
				return getValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.OPERATION_TEMPLATE_PARAMETER___HAS_KEYWORD__STRING :
				return hasKeyword((String) arguments.get(0));
			case UMLPackage.OPERATION_TEMPLATE_PARAMETER___HAS_VALUE__STEREOTYPE_STRING :
				return hasValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.OPERATION_TEMPLATE_PARAMETER___IS_STEREOTYPE_APPLICABLE__STEREOTYPE :
				return isStereotypeApplicable((Stereotype) arguments.get(0));
			case UMLPackage.OPERATION_TEMPLATE_PARAMETER___IS_STEREOTYPE_APPLIED__STEREOTYPE :
				return isStereotypeApplied((Stereotype) arguments.get(0));
			case UMLPackage.OPERATION_TEMPLATE_PARAMETER___IS_STEREOTYPE_REQUIRED__STEREOTYPE :
				return isStereotypeRequired((Stereotype) arguments.get(0));
			case UMLPackage.OPERATION_TEMPLATE_PARAMETER___REMOVE_KEYWORD__STRING :
				return removeKeyword((String) arguments.get(0));
			case UMLPackage.OPERATION_TEMPLATE_PARAMETER___SET_VALUE__STEREOTYPE_STRING_OBJECT :
				setValue((Stereotype) arguments.get(0),
					(String) arguments.get(1), arguments.get(2));
				return null;
			case UMLPackage.OPERATION_TEMPLATE_PARAMETER___UNAPPLY_STEREOTYPE__STEREOTYPE :
				return unapplyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.OPERATION_TEMPLATE_PARAMETER___ALL_OWNED_ELEMENTS :
				return allOwnedElements();
			case UMLPackage.OPERATION_TEMPLATE_PARAMETER___MUST_BE_OWNED :
				return mustBeOwned();
			case UMLPackage.OPERATION_TEMPLATE_PARAMETER___VALIDATE_MUST_BE_COMPATIBLE__DIAGNOSTICCHAIN_MAP :
				return validateMustBeCompatible(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.OPERATION_TEMPLATE_PARAMETER___VALIDATE_MATCH_DEFAULT_SIGNATURE__DIAGNOSTICCHAIN_MAP :
				return validateMatchDefaultSignature(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		}
		return eDynamicInvoke(operationID, arguments);
	}

} //OperationTemplateParameterImpl
