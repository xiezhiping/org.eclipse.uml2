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
 * $Id: TemplateSignatureImpl.java,v 1.11 2006/02/22 20:48:16 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;
import org.eclipse.uml2.common.util.SubsetSupersetEObjectContainmentWithInverseEList;
import org.eclipse.uml2.common.util.SubsetSupersetEObjectResolvingEList;

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
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.TemplateSignatureImpl#getOwnedParameters <em>Owned Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.TemplateSignatureImpl#getTemplate <em>Template</em>}</li>
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
		return UMLPackage.Literals.TEMPLATE_SIGNATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedElements() {
		EList ownedElement = (EList) eVirtualGet(UMLPackage.TEMPLATE_SIGNATURE__OWNED_ELEMENT);
		if (ownedElement == null) {
			eVirtualSet(UMLPackage.TEMPLATE_SIGNATURE__OWNED_ELEMENT,
				ownedElement = new DerivedUnionEObjectEList(Element.class,
					this, UMLPackage.TEMPLATE_SIGNATURE__OWNED_ELEMENT,
					new int[]{UMLPackage.TEMPLATE_SIGNATURE__OWNED_COMMENT,
						UMLPackage.TEMPLATE_SIGNATURE__OWNED_PARAMETER}));
		}
		return ownedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getParameters() {
		EList parameter = (EList) eVirtualGet(UMLPackage.TEMPLATE_SIGNATURE__PARAMETER);
		if (parameter == null) {
			eVirtualSet(UMLPackage.TEMPLATE_SIGNATURE__PARAMETER,
				parameter = new SubsetSupersetEObjectResolvingEList(
					TemplateParameter.class, this,
					UMLPackage.TEMPLATE_SIGNATURE__PARAMETER, null,
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
		return (TemplateableElement) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemplate(TemplateableElement newTemplate) {
		if (newTemplate != eInternalContainer()
			|| (eContainerFeatureID != UMLPackage.TEMPLATE_SIGNATURE__TEMPLATE && newTemplate != null)) {
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
	public EList getOwnedParameters() {
		EList ownedParameter = (EList) eVirtualGet(UMLPackage.TEMPLATE_SIGNATURE__OWNED_PARAMETER);
		if (ownedParameter == null) {
			eVirtualSet(
				UMLPackage.TEMPLATE_SIGNATURE__OWNED_PARAMETER,
				ownedParameter = new SubsetSupersetEObjectContainmentWithInverseEList.Resolving(
					TemplateParameter.class, this,
					UMLPackage.TEMPLATE_SIGNATURE__OWNED_PARAMETER,
					new int[]{UMLPackage.TEMPLATE_SIGNATURE__PARAMETER}, null,
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
		TemplateParameter newOwnedParameter = (TemplateParameter) EcoreUtil
			.create(eClass);
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
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.TEMPLATE_SIGNATURE__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.TEMPLATE_SIGNATURE__OWNED_PARAMETER :
				return ((InternalEList) getOwnedParameters()).basicAdd(
					otherEnd, msgs);
			case UMLPackage.TEMPLATE_SIGNATURE__TEMPLATE :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd,
					UMLPackage.TEMPLATE_SIGNATURE__TEMPLATE, msgs);
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
			case UMLPackage.TEMPLATE_SIGNATURE__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.TEMPLATE_SIGNATURE__OWNED_COMMENT :
				return ((InternalEList) getOwnedComments()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.TEMPLATE_SIGNATURE__OWNED_PARAMETER :
				return ((InternalEList) getOwnedParameters()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.TEMPLATE_SIGNATURE__TEMPLATE :
				return eBasicSetContainer(null,
					UMLPackage.TEMPLATE_SIGNATURE__TEMPLATE, msgs);
		}
		return eDynamicInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eBasicRemoveFromContainerFeature(
			NotificationChain msgs) {
		switch (eContainerFeatureID) {
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
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
			case UMLPackage.TEMPLATE_SIGNATURE__OWNED_PARAMETER :
				return getOwnedParameters();
			case UMLPackage.TEMPLATE_SIGNATURE__TEMPLATE :
				return getTemplate();
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
			case UMLPackage.TEMPLATE_SIGNATURE__OWNED_PARAMETER :
				getOwnedParameters().clear();
				getOwnedParameters().addAll((Collection) newValue);
				return;
			case UMLPackage.TEMPLATE_SIGNATURE__TEMPLATE :
				setTemplate((TemplateableElement) newValue);
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
			case UMLPackage.TEMPLATE_SIGNATURE__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.TEMPLATE_SIGNATURE__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.TEMPLATE_SIGNATURE__PARAMETER :
				getParameters().clear();
				return;
			case UMLPackage.TEMPLATE_SIGNATURE__OWNED_PARAMETER :
				getOwnedParameters().clear();
				return;
			case UMLPackage.TEMPLATE_SIGNATURE__TEMPLATE :
				setTemplate((TemplateableElement) null);
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
			case UMLPackage.TEMPLATE_SIGNATURE__EANNOTATIONS :
				EList eAnnotations = (EList) eVirtualGet(UMLPackage.TEMPLATE_SIGNATURE__EANNOTATIONS);
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.TEMPLATE_SIGNATURE__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.TEMPLATE_SIGNATURE__OWNER :
				return isSetOwner();
			case UMLPackage.TEMPLATE_SIGNATURE__OWNED_COMMENT :
				EList ownedComment = (EList) eVirtualGet(UMLPackage.TEMPLATE_SIGNATURE__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.TEMPLATE_SIGNATURE__PARAMETER :
				EList parameter = (EList) eVirtualGet(UMLPackage.TEMPLATE_SIGNATURE__PARAMETER);
				return parameter != null && !parameter.isEmpty();
			case UMLPackage.TEMPLATE_SIGNATURE__OWNED_PARAMETER :
				EList ownedParameter = (EList) eVirtualGet(UMLPackage.TEMPLATE_SIGNATURE__OWNED_PARAMETER);
				return ownedParameter != null && !ownedParameter.isEmpty();
			case UMLPackage.TEMPLATE_SIGNATURE__TEMPLATE :
				return getTemplate() != null;
		}
		return eDynamicIsSet(featureID);
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
			|| eIsSet(UMLPackage.TEMPLATE_SIGNATURE__TEMPLATE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| eIsSet(UMLPackage.TEMPLATE_SIGNATURE__OWNED_PARAMETER);
	}

} //TemplateSignatureImpl
