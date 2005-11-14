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
 * $Id: TemplateSignatureImpl.java,v 1.1 2005/11/14 22:26:02 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;
import org.eclipse.uml2.common.util.SubsetEObjectContainmentWithInverseEList;
import org.eclipse.uml2.common.util.SupersetEObjectResolvingEList;

import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.TemplateSignature;
import org.eclipse.uml2.uml.TemplateableElement;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;

import org.eclipse.uml2.uml.internal.operations.TemplateSignatureOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Template Signature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.TemplateSignatureImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.TemplateSignatureImpl#getParameters <em>Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.TemplateSignatureImpl#getTemplate <em>Template</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.TemplateSignatureImpl#getOwnedParameters <em>Owned Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TemplateSignatureImpl
		extends ElementImpl
		implements TemplateSignature {

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
	protected EClass eStaticClass() {
		return UMLPackage.eINSTANCE.getTemplateSignature();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getOwnedElements() {
		List ownedElement = (List) eVirtualGet(UMLPackage.TEMPLATE_SIGNATURE__OWNED_ELEMENT);
		if (ownedElement == null) {
			eVirtualSet(UMLPackage.TEMPLATE_SIGNATURE__OWNED_ELEMENT,
				ownedElement = new DerivedUnionEObjectEList(Element.class,
					this, UMLPackage.TEMPLATE_SIGNATURE__OWNED_ELEMENT,
					new EStructuralFeature[]{
						UMLPackage.eINSTANCE.getElement_OwnedComment(),
						UMLPackage.eINSTANCE
							.getTemplateSignature_OwnedParameter()}));
		}
		return ownedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getParameters() {
		List parameter = (List) eVirtualGet(UMLPackage.TEMPLATE_SIGNATURE__PARAMETER);
		if (parameter == null) {
			eVirtualSet(UMLPackage.TEMPLATE_SIGNATURE__PARAMETER,
				parameter = new SupersetEObjectResolvingEList(
					TemplateParameter.class, this,
					UMLPackage.TEMPLATE_SIGNATURE__PARAMETER,
					new int[]{UMLPackage.TEMPLATE_SIGNATURE__OWNED_PARAMETER}));
		}
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateableElement getTemplate() {
		if (eContainerFeatureID != UMLPackage.TEMPLATE_SIGNATURE__TEMPLATE)
			return null;
		return (TemplateableElement) eContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemplate(TemplateableElement newTemplate) {
		if (newTemplate != eContainer
			|| (eContainerFeatureID != UMLPackage.TEMPLATE_SIGNATURE__TEMPLATE && newTemplate != null)) {
			if (EcoreUtil.isAncestor(this, (EObject) newTemplate))
				throw new IllegalArgumentException(
					"Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eContainer != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTemplate != null)
				msgs = ((InternalEObject) newTemplate).eInverseAdd(this,
					UMLPackage.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE,
					TemplateableElement.class, msgs);
			msgs = eBasicSetContainer((InternalEObject) newTemplate,
				UMLPackage.TEMPLATE_SIGNATURE__TEMPLATE, msgs);
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
	public List getOwnedParameters() {
		List ownedParameter = (List) eVirtualGet(UMLPackage.TEMPLATE_SIGNATURE__OWNED_PARAMETER);
		if (ownedParameter == null) {
			eVirtualSet(UMLPackage.TEMPLATE_SIGNATURE__OWNED_PARAMETER,
				ownedParameter = new SubsetEObjectContainmentWithInverseEList(
					TemplateParameter.class, this,
					UMLPackage.TEMPLATE_SIGNATURE__OWNED_PARAMETER,
					new int[]{UMLPackage.TEMPLATE_SIGNATURE__PARAMETER},
					UMLPackage.TEMPLATE_PARAMETER__SIGNATURE));
		}
		return ownedParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateParameter createOwnedParameter(EClass eClass) {
		TemplateParameter newOwnedParameter = (TemplateParameter) eClass
			.getEPackage().getEFactoryInstance().create(eClass);
		getOwnedParameters().add(newOwnedParameter);
		return newOwnedParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateParameter createOwnedParameter() {
		TemplateParameter newOwnedParameter = UMLFactory.eINSTANCE
			.createTemplateParameter();
		getOwnedParameters().add(newOwnedParameter);
		return newOwnedParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOwnElements(DiagnosticChain diagnostics, Map context) {
		return TemplateSignatureOperations.validateOwnElements(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UMLPackage.TEMPLATE_SIGNATURE__EANNOTATIONS :
					return ((InternalEList) getEAnnotations()).basicAdd(
						otherEnd, msgs);
				case UMLPackage.TEMPLATE_SIGNATURE__TEMPLATE :
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd,
						UMLPackage.TEMPLATE_SIGNATURE__TEMPLATE, msgs);
				case UMLPackage.TEMPLATE_SIGNATURE__OWNED_PARAMETER :
					return ((InternalEList) getOwnedParameters()).basicAdd(
						otherEnd, msgs);
				default :
					return eDynamicInverseAdd(otherEnd, featureID, baseClass,
						msgs);
			}
		}
		if (eContainer != null)
			msgs = eBasicRemoveFromContainer(msgs);
		return eBasicSetContainer(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UMLPackage.TEMPLATE_SIGNATURE__EANNOTATIONS :
					return ((InternalEList) getEAnnotations()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.TEMPLATE_SIGNATURE__OWNED_COMMENT :
					return ((InternalEList) getOwnedComments()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.TEMPLATE_SIGNATURE__TEMPLATE :
					return eBasicSetContainer(null,
						UMLPackage.TEMPLATE_SIGNATURE__TEMPLATE, msgs);
				case UMLPackage.TEMPLATE_SIGNATURE__OWNED_PARAMETER :
					return ((InternalEList) getOwnedParameters()).basicRemove(
						otherEnd, msgs);
				default :
					return eDynamicInverseRemove(otherEnd, featureID,
						baseClass, msgs);
			}
		}
		return eBasicSetContainer(null, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eBasicRemoveFromContainer(NotificationChain msgs) {
		if (eContainerFeatureID >= 0) {
			switch (eContainerFeatureID) {
				case UMLPackage.TEMPLATE_SIGNATURE__TEMPLATE :
					return eContainer
						.eInverseRemove(
							this,
							UMLPackage.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE,
							TemplateableElement.class, msgs);
				default :
					return eDynamicBasicRemoveFromContainer(msgs);
			}
		}
		return eContainer.eInverseRemove(this, EOPPOSITE_FEATURE_BASE
			- eContainerFeatureID, null, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UMLPackage.TEMPLATE_SIGNATURE__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.TEMPLATE_SIGNATURE__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.TEMPLATE_SIGNATURE__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.TEMPLATE_SIGNATURE__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.TEMPLATE_SIGNATURE__PARAMETER :
				return getParameters();
			case UMLPackage.TEMPLATE_SIGNATURE__TEMPLATE :
				return getTemplate();
			case UMLPackage.TEMPLATE_SIGNATURE__OWNED_PARAMETER :
				return getOwnedParameters();
		}
		return eDynamicGet(eFeature, resolve);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(EStructuralFeature eFeature, Object newValue) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UMLPackage.TEMPLATE_SIGNATURE__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.TEMPLATE_SIGNATURE__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.TEMPLATE_SIGNATURE__PARAMETER :
				getParameters().clear();
				getParameters().addAll((Collection) newValue);
				return;
			case UMLPackage.TEMPLATE_SIGNATURE__TEMPLATE :
				setTemplate((TemplateableElement) newValue);
				return;
			case UMLPackage.TEMPLATE_SIGNATURE__OWNED_PARAMETER :
				getOwnedParameters().clear();
				getOwnedParameters().addAll((Collection) newValue);
				return;
		}
		eDynamicSet(eFeature, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
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
		eDynamicUnset(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UMLPackage.TEMPLATE_SIGNATURE__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.TEMPLATE_SIGNATURE__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.TEMPLATE_SIGNATURE__OWNER :
				return isSetOwner();
			case UMLPackage.TEMPLATE_SIGNATURE__OWNED_COMMENT :
				List ownedComment = (List) eVirtualGet(UMLPackage.TEMPLATE_SIGNATURE__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.TEMPLATE_SIGNATURE__PARAMETER :
				List parameter = (List) eVirtualGet(UMLPackage.TEMPLATE_SIGNATURE__PARAMETER);
				return parameter != null && !parameter.isEmpty();
			case UMLPackage.TEMPLATE_SIGNATURE__TEMPLATE :
				return getTemplate() != null;
			case UMLPackage.TEMPLATE_SIGNATURE__OWNED_PARAMETER :
				List ownedParameter = (List) eVirtualGet(UMLPackage.TEMPLATE_SIGNATURE__OWNED_PARAMETER);
				return ownedParameter != null && !ownedParameter.isEmpty();
		}
		return eDynamicIsSet(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetOwner() {
		TemplateableElement template = getTemplate();
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
	public boolean isSetOwner() {
		return super.isSetOwner()
			|| eIsSet(UMLPackage.eINSTANCE.getTemplateSignature_Template());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| eIsSet(UMLPackage.eINSTANCE
				.getTemplateSignature_OwnedParameter());
	}

} //TemplateSignatureImpl
