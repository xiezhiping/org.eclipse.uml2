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
 * $Id: TemplateParameterSubstitutionImpl.java,v 1.12 2006/03/01 17:56:37 khussey Exp $
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
import org.eclipse.uml2.common.util.SubsetSupersetEObjectContainmentEList;
import org.eclipse.uml2.common.util.SubsetSupersetEObjectResolvingEList;

import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.ParameterableElement;
import org.eclipse.uml2.uml.TemplateBinding;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.TemplateParameterSubstitution;
import org.eclipse.uml2.uml.UMLPackage;

import org.eclipse.uml2.uml.internal.operations.TemplateParameterSubstitutionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Template Parameter Substitution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.TemplateParameterSubstitutionImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.TemplateParameterSubstitutionImpl#getActuals <em>Actual</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.TemplateParameterSubstitutionImpl#getFormal <em>Formal</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.TemplateParameterSubstitutionImpl#getOwnedActuals <em>Owned Actual</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.TemplateParameterSubstitutionImpl#getTemplateBinding <em>Template Binding</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TemplateParameterSubstitutionImpl
		extends ElementImpl
		implements TemplateParameterSubstitution {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemplateParameterSubstitutionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedElements() {
		EList ownedElement = (EList) eVirtualGet(UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ELEMENT);
		if (ownedElement == null) {
			eVirtualSet(
				UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ELEMENT,
				ownedElement = new DerivedUnionEObjectEList(
					Element.class,
					this,
					UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ELEMENT,
					new int[]{
						UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_COMMENT,
						UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL}));
		}
		return ownedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getActuals() {
		EList actual = (EList) eVirtualGet(UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION__ACTUAL);
		if (actual == null) {
			eVirtualSet(
				UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION__ACTUAL,
				actual = new SubsetSupersetEObjectResolvingEList(
					ParameterableElement.class,
					this,
					UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION__ACTUAL,
					null,
					new int[]{UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL}));
		}
		return actual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateParameter getFormal() {
		TemplateParameter formal = (TemplateParameter) eVirtualGet(UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION__FORMAL);
		if (formal != null && formal.eIsProxy()) {
			InternalEObject oldFormal = (InternalEObject) formal;
			formal = (TemplateParameter) eResolveProxy(oldFormal);
			if (formal != oldFormal) {
				eVirtualSet(UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION__FORMAL,
					formal);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION__FORMAL,
						oldFormal, formal));
			}
		}
		return formal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateParameter basicGetFormal() {
		return (TemplateParameter) eVirtualGet(UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION__FORMAL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormal(TemplateParameter newFormal) {
		TemplateParameter formal = newFormal;
		Object oldFormal = eVirtualSet(
			UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION__FORMAL, formal);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION__FORMAL,
				oldFormal == EVIRTUAL_NO_VALUE
					? null
					: oldFormal, formal));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedActuals() {
		EList ownedActual = (EList) eVirtualGet(UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL);
		if (ownedActual == null) {
			eVirtualSet(
				UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				ownedActual = new SubsetSupersetEObjectContainmentEList.Resolving(
					ParameterableElement.class,
					this,
					UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
					new int[]{UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION__ACTUAL},
					null));
		}
		return ownedActual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterableElement createOwnedActual(EClass eClass) {
		ParameterableElement newOwnedActual = (ParameterableElement) EcoreUtil
			.create(eClass);
		getOwnedActuals().add(newOwnedActual);
		return newOwnedActual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateBinding getTemplateBinding() {
		if (eContainerFeatureID != UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION__TEMPLATE_BINDING)
			return null;
		return (TemplateBinding) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemplateBinding(
			TemplateBinding newTemplateBinding, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newTemplateBinding,
			UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION__TEMPLATE_BINDING, msgs);

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemplateBinding(TemplateBinding newTemplateBinding) {
		if (newTemplateBinding != eInternalContainer()
			|| (eContainerFeatureID != UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION__TEMPLATE_BINDING && newTemplateBinding != null)) {
			if (EcoreUtil.isAncestor(this, newTemplateBinding))
				throw new IllegalArgumentException(
					"Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTemplateBinding != null)
				msgs = ((InternalEObject) newTemplateBinding).eInverseAdd(this,
					UMLPackage.TEMPLATE_BINDING__PARAMETER_SUBSTITUTION,
					TemplateBinding.class, msgs);
			msgs = basicSetTemplateBinding(newTemplateBinding, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION__TEMPLATE_BINDING,
				newTemplateBinding, newTemplateBinding));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMustBeCompatible(DiagnosticChain diagnostics,
			Map context) {
		return TemplateParameterSubstitutionOperations
			.validateMustBeCompatible(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION__TEMPLATE_BINDING :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTemplateBinding((TemplateBinding) otherEnd, msgs);
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
			case UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_COMMENT :
				return ((InternalEList) getOwnedComments()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL :
				return ((InternalEList) getOwnedActuals()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION__TEMPLATE_BINDING :
				return basicSetTemplateBinding(null, msgs);
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
			case UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION__TEMPLATE_BINDING :
				return eInternalContainer().eInverseRemove(this,
					UMLPackage.TEMPLATE_BINDING__PARAMETER_SUBSTITUTION,
					TemplateBinding.class, msgs);
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
			case UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION__FORMAL :
				if (resolve)
					return getFormal();
				return basicGetFormal();
			case UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION__ACTUAL :
				return getActuals();
			case UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL :
				return getOwnedActuals();
			case UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION__TEMPLATE_BINDING :
				return getTemplateBinding();
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
			case UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION__FORMAL :
				setFormal((TemplateParameter) newValue);
				return;
			case UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION__ACTUAL :
				getActuals().clear();
				getActuals().addAll((Collection) newValue);
				return;
			case UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL :
				getOwnedActuals().clear();
				getOwnedActuals().addAll((Collection) newValue);
				return;
			case UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION__TEMPLATE_BINDING :
				setTemplateBinding((TemplateBinding) newValue);
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
			case UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION__FORMAL :
				setFormal((TemplateParameter) null);
				return;
			case UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION__ACTUAL :
				getActuals().clear();
				return;
			case UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL :
				getOwnedActuals().clear();
				return;
			case UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION__TEMPLATE_BINDING :
				setTemplateBinding((TemplateBinding) null);
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
			case UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION__EANNOTATIONS :
				EList eAnnotations = (EList) eVirtualGet(UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION__EANNOTATIONS);
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION__OWNER :
				return isSetOwner();
			case UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_COMMENT :
				EList ownedComment = (EList) eVirtualGet(UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION__FORMAL :
				return eVirtualGet(UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION__FORMAL) != null;
			case UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION__ACTUAL :
				EList actual = (EList) eVirtualGet(UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION__ACTUAL);
				return actual != null && !actual.isEmpty();
			case UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL :
				EList ownedActual = (EList) eVirtualGet(UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL);
				return ownedActual != null && !ownedActual.isEmpty();
			case UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION__TEMPLATE_BINDING :
				return getTemplateBinding() != null;
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
			|| eIsSet(UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetOwner() {
		TemplateBinding templateBinding = getTemplateBinding();
		if (templateBinding != null) {
			return templateBinding;
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
			|| eIsSet(UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION__TEMPLATE_BINDING);
	}

} //TemplateParameterSubstitutionImpl
