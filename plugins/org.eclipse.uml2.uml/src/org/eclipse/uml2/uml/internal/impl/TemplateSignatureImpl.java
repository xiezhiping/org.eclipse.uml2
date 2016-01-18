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
 *   Kenn Hussey (CEA) - 327039, 418466, 451350, 485756
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

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;
import org.eclipse.uml2.common.util.SubsetSupersetEObjectContainmentWithInverseEList;
import org.eclipse.uml2.common.util.SubsetSupersetEObjectResolvingEList;

import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.TemplateSignature;
import org.eclipse.uml2.uml.TemplateableElement;
import org.eclipse.uml2.uml.UMLPackage;

import org.eclipse.uml2.uml.internal.operations.TemplateSignatureOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Template Signature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.TemplateSignatureImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.TemplateSignatureImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.TemplateSignatureImpl#getParameters <em>Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.TemplateSignatureImpl#getTemplate <em>Template</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.TemplateSignatureImpl#getOwnedParameters <em>Owned Parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TemplateSignatureImpl
		extends ElementImpl
		implements TemplateSignature {

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameter</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<TemplateParameter> parameters;

	/**
	 * The cached value of the '{@link #getOwnedParameters() <em>Owned Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<TemplateParameter> ownedParameters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemplateSignatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.TEMPLATE_SIGNATURE;
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
						UMLPackage.TEMPLATE_SIGNATURE__OWNED_ELEMENT,
						OWNED_ELEMENT_ESUBSETS));
			}
			return ownedElements;
		}
		return new DerivedUnionEObjectEList<Element>(Element.class, this,
			UMLPackage.TEMPLATE_SIGNATURE__OWNED_ELEMENT,
			OWNED_ELEMENT_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TemplateParameter> getParameters() {
		if (parameters == null) {
			parameters = new SubsetSupersetEObjectResolvingEList<TemplateParameter>(
				TemplateParameter.class, this,
				UMLPackage.TEMPLATE_SIGNATURE__PARAMETER, null,
				PARAMETER_ESUBSETS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateableElement getTemplate() {
		if (eContainerFeatureID() != UMLPackage.TEMPLATE_SIGNATURE__TEMPLATE)
			return null;
		return (TemplateableElement) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateableElement basicGetTemplate() {
		if (eContainerFeatureID() != UMLPackage.TEMPLATE_SIGNATURE__TEMPLATE)
			return null;
		return (TemplateableElement) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemplate(TemplateableElement newTemplate,
			NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newTemplate,
			UMLPackage.TEMPLATE_SIGNATURE__TEMPLATE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemplate(TemplateableElement newTemplate) {
		if (newTemplate != eInternalContainer()
			|| (eContainerFeatureID() != UMLPackage.TEMPLATE_SIGNATURE__TEMPLATE
				&& newTemplate != null)) {
			if (EcoreUtil.isAncestor(this, newTemplate))
				throw new IllegalArgumentException(
					"Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTemplate != null)
				msgs = ((InternalEObject) newTemplate).eInverseAdd(this,
					UMLPackage.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE,
					TemplateableElement.class, msgs);
			msgs = basicSetTemplate(newTemplate, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.TEMPLATE_SIGNATURE__TEMPLATE, newTemplate,
				newTemplate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TemplateParameter> getOwnedParameters() {
		if (ownedParameters == null) {
			ownedParameters = new SubsetSupersetEObjectContainmentWithInverseEList.Resolving<TemplateParameter>(
				TemplateParameter.class, this,
				UMLPackage.TEMPLATE_SIGNATURE__OWNED_PARAMETER,
				OWNED_PARAMETER_ESUPERSETS, null,
				UMLPackage.TEMPLATE_PARAMETER__SIGNATURE);
		}
		return ownedParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateParameter createOwnedParameter(EClass eClass) {
		TemplateParameter newOwnedParameter = (TemplateParameter) create(
			eClass);
		getOwnedParameters().add(newOwnedParameter);
		return newOwnedParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateParameter createOwnedParameter() {
		return createOwnedParameter(UMLPackage.Literals.TEMPLATE_PARAMETER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOwnElements(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return TemplateSignatureOperations.validateOwnElements(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUniqueParameters(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return TemplateSignatureOperations.validateUniqueParameters(this,
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
			case UMLPackage.TEMPLATE_SIGNATURE__EANNOTATIONS :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getEAnnotations())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.TEMPLATE_SIGNATURE__TEMPLATE :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTemplate((TemplateableElement) otherEnd, msgs);
			case UMLPackage.TEMPLATE_SIGNATURE__OWNED_PARAMETER :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getOwnedParameters())
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
			case UMLPackage.TEMPLATE_SIGNATURE__EANNOTATIONS :
				return ((InternalEList<?>) getEAnnotations())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.TEMPLATE_SIGNATURE__OWNED_COMMENT :
				return ((InternalEList<?>) getOwnedComments())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.TEMPLATE_SIGNATURE__TEMPLATE :
				return basicSetTemplate(null, msgs);
			case UMLPackage.TEMPLATE_SIGNATURE__OWNED_PARAMETER :
				return ((InternalEList<?>) getOwnedParameters())
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
	public NotificationChain eBasicRemoveFromContainerFeature(
			NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case UMLPackage.TEMPLATE_SIGNATURE__TEMPLATE :
				return eInternalContainer().eInverseRemove(this,
					UMLPackage.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE,
					TemplateableElement.class, msgs);
		}
		return eDynamicBasicRemoveFromContainer(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.TEMPLATE_SIGNATURE__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.TEMPLATE_SIGNATURE__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.TEMPLATE_SIGNATURE__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.TEMPLATE_SIGNATURE__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.TEMPLATE_SIGNATURE__PARAMETER :
				return getParameters();
			case UMLPackage.TEMPLATE_SIGNATURE__TEMPLATE :
				if (resolve)
					return getTemplate();
				return basicGetTemplate();
			case UMLPackage.TEMPLATE_SIGNATURE__OWNED_PARAMETER :
				return getOwnedParameters();
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
			case UMLPackage.TEMPLATE_SIGNATURE__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations()
					.addAll((Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.TEMPLATE_SIGNATURE__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments()
					.addAll((Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.TEMPLATE_SIGNATURE__PARAMETER :
				getParameters().clear();
				getParameters()
					.addAll((Collection<? extends TemplateParameter>) newValue);
				return;
			case UMLPackage.TEMPLATE_SIGNATURE__TEMPLATE :
				setTemplate((TemplateableElement) newValue);
				return;
			case UMLPackage.TEMPLATE_SIGNATURE__OWNED_PARAMETER :
				getOwnedParameters().clear();
				getOwnedParameters()
					.addAll((Collection<? extends TemplateParameter>) newValue);
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
			case UMLPackage.TEMPLATE_SIGNATURE__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.TEMPLATE_SIGNATURE__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.TEMPLATE_SIGNATURE__PARAMETER :
				getParameters().clear();
				return;
			case UMLPackage.TEMPLATE_SIGNATURE__TEMPLATE :
				setTemplate((TemplateableElement) null);
				return;
			case UMLPackage.TEMPLATE_SIGNATURE__OWNED_PARAMETER :
				getOwnedParameters().clear();
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
			case UMLPackage.TEMPLATE_SIGNATURE__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.TEMPLATE_SIGNATURE__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.TEMPLATE_SIGNATURE__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.TEMPLATE_SIGNATURE__OWNER :
				return isSetOwner();
			case UMLPackage.TEMPLATE_SIGNATURE__PARAMETER :
				return parameters != null && !parameters.isEmpty();
			case UMLPackage.TEMPLATE_SIGNATURE__TEMPLATE :
				return basicGetTemplate() != null;
			case UMLPackage.TEMPLATE_SIGNATURE__OWNED_PARAMETER :
				return ownedParameters != null && !ownedParameters.isEmpty();
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
			case UMLPackage.TEMPLATE_SIGNATURE___GET_EANNOTATION__STRING :
				return getEAnnotation((String) arguments.get(0));
			case UMLPackage.TEMPLATE_SIGNATURE___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP :
				return validateHasOwner((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.TEMPLATE_SIGNATURE___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP :
				return validateNotOwnSelf((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.TEMPLATE_SIGNATURE___ADD_KEYWORD__STRING :
				return addKeyword((String) arguments.get(0));
			case UMLPackage.TEMPLATE_SIGNATURE___APPLY_STEREOTYPE__STEREOTYPE :
				return applyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.TEMPLATE_SIGNATURE___CREATE_EANNOTATION__STRING :
				return createEAnnotation((String) arguments.get(0));
			case UMLPackage.TEMPLATE_SIGNATURE___DESTROY :
				destroy();
				return null;
			case UMLPackage.TEMPLATE_SIGNATURE___GET_KEYWORDS :
				return getKeywords();
			case UMLPackage.TEMPLATE_SIGNATURE___GET_APPLICABLE_STEREOTYPE__STRING :
				return getApplicableStereotype((String) arguments.get(0));
			case UMLPackage.TEMPLATE_SIGNATURE___GET_APPLICABLE_STEREOTYPES :
				return getApplicableStereotypes();
			case UMLPackage.TEMPLATE_SIGNATURE___GET_APPLIED_STEREOTYPE__STRING :
				return getAppliedStereotype((String) arguments.get(0));
			case UMLPackage.TEMPLATE_SIGNATURE___GET_APPLIED_STEREOTYPES :
				return getAppliedStereotypes();
			case UMLPackage.TEMPLATE_SIGNATURE___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING :
				return getAppliedSubstereotype((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.TEMPLATE_SIGNATURE___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE :
				return getAppliedSubstereotypes((Stereotype) arguments.get(0));
			case UMLPackage.TEMPLATE_SIGNATURE___GET_MODEL :
				return getModel();
			case UMLPackage.TEMPLATE_SIGNATURE___GET_NEAREST_PACKAGE :
				return getNearestPackage();
			case UMLPackage.TEMPLATE_SIGNATURE___GET_RELATIONSHIPS :
				return getRelationships();
			case UMLPackage.TEMPLATE_SIGNATURE___GET_RELATIONSHIPS__ECLASS :
				return getRelationships((EClass) arguments.get(0));
			case UMLPackage.TEMPLATE_SIGNATURE___GET_REQUIRED_STEREOTYPE__STRING :
				return getRequiredStereotype((String) arguments.get(0));
			case UMLPackage.TEMPLATE_SIGNATURE___GET_REQUIRED_STEREOTYPES :
				return getRequiredStereotypes();
			case UMLPackage.TEMPLATE_SIGNATURE___GET_SOURCE_DIRECTED_RELATIONSHIPS :
				return getSourceDirectedRelationships();
			case UMLPackage.TEMPLATE_SIGNATURE___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS :
				return getSourceDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.TEMPLATE_SIGNATURE___GET_STEREOTYPE_APPLICATION__STEREOTYPE :
				return getStereotypeApplication((Stereotype) arguments.get(0));
			case UMLPackage.TEMPLATE_SIGNATURE___GET_STEREOTYPE_APPLICATIONS :
				return getStereotypeApplications();
			case UMLPackage.TEMPLATE_SIGNATURE___GET_TARGET_DIRECTED_RELATIONSHIPS :
				return getTargetDirectedRelationships();
			case UMLPackage.TEMPLATE_SIGNATURE___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS :
				return getTargetDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.TEMPLATE_SIGNATURE___GET_VALUE__STEREOTYPE_STRING :
				return getValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.TEMPLATE_SIGNATURE___HAS_KEYWORD__STRING :
				return hasKeyword((String) arguments.get(0));
			case UMLPackage.TEMPLATE_SIGNATURE___HAS_VALUE__STEREOTYPE_STRING :
				return hasValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.TEMPLATE_SIGNATURE___IS_STEREOTYPE_APPLICABLE__STEREOTYPE :
				return isStereotypeApplicable((Stereotype) arguments.get(0));
			case UMLPackage.TEMPLATE_SIGNATURE___IS_STEREOTYPE_APPLIED__STEREOTYPE :
				return isStereotypeApplied((Stereotype) arguments.get(0));
			case UMLPackage.TEMPLATE_SIGNATURE___IS_STEREOTYPE_REQUIRED__STEREOTYPE :
				return isStereotypeRequired((Stereotype) arguments.get(0));
			case UMLPackage.TEMPLATE_SIGNATURE___REMOVE_KEYWORD__STRING :
				return removeKeyword((String) arguments.get(0));
			case UMLPackage.TEMPLATE_SIGNATURE___SET_VALUE__STEREOTYPE_STRING_OBJECT :
				setValue((Stereotype) arguments.get(0),
					(String) arguments.get(1), arguments.get(2));
				return null;
			case UMLPackage.TEMPLATE_SIGNATURE___UNAPPLY_STEREOTYPE__STEREOTYPE :
				return unapplyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.TEMPLATE_SIGNATURE___ALL_OWNED_ELEMENTS :
				return allOwnedElements();
			case UMLPackage.TEMPLATE_SIGNATURE___MUST_BE_OWNED :
				return mustBeOwned();
			case UMLPackage.TEMPLATE_SIGNATURE___VALIDATE_OWN_ELEMENTS__DIAGNOSTICCHAIN_MAP :
				return validateOwnElements((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.TEMPLATE_SIGNATURE___VALIDATE_UNIQUE_PARAMETERS__DIAGNOSTICCHAIN_MAP :
				return validateUniqueParameters(
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
		UMLPackage.TEMPLATE_SIGNATURE__OWNED_COMMENT,
		UMLPackage.TEMPLATE_SIGNATURE__OWNED_PARAMETER};

	/**
	 * The array of subset feature identifiers for the '{@link #getParameters() <em>Parameter</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected static final int[] PARAMETER_ESUBSETS = new int[]{
		UMLPackage.TEMPLATE_SIGNATURE__OWNED_PARAMETER};

	/**
	 * The array of superset feature identifiers for the '{@link #getOwnedParameters() <em>Owned Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedParameters()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_PARAMETER_ESUPERSETS = new int[]{
		UMLPackage.TEMPLATE_SIGNATURE__PARAMETER};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element getOwner() {
		Element owner = basicGetOwner();
		return owner != null && owner.eIsProxy()
			? (Element) eResolveProxy((InternalEObject) owner)
			: owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element basicGetOwner() {
		TemplateableElement template = basicGetTemplate();
		if (template != null) {
			return template;
		}
		return super.basicGetOwner();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOwner() {
		return super.isSetOwner()
			|| eIsSet(UMLPackage.TEMPLATE_SIGNATURE__TEMPLATE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| eIsSet(UMLPackage.TEMPLATE_SIGNATURE__OWNED_PARAMETER);
	}

} //TemplateSignatureImpl
