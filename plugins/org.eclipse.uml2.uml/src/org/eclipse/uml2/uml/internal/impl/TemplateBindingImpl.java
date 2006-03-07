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
 * $Id: TemplateBindingImpl.java,v 1.12 2006/03/07 20:25:15 khussey Exp $
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

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.TemplateBinding;
import org.eclipse.uml2.uml.TemplateParameterSubstitution;
import org.eclipse.uml2.uml.TemplateSignature;
import org.eclipse.uml2.uml.TemplateableElement;
import org.eclipse.uml2.uml.UMLPackage;

import org.eclipse.uml2.uml.internal.operations.TemplateBindingOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Template Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.TemplateBindingImpl#getTargets <em>Target</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.TemplateBindingImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.TemplateBindingImpl#getSources <em>Source</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.TemplateBindingImpl#getSignature <em>Signature</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.TemplateBindingImpl#getParameterSubstitutions <em>Parameter Substitution</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.TemplateBindingImpl#getBoundElement <em>Bound Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TemplateBindingImpl
		extends DirectedRelationshipImpl
		implements TemplateBinding {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemplateBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.Literals.TEMPLATE_BINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getTargets() {
		EList target = (EList) eVirtualGet(UMLPackage.TEMPLATE_BINDING__TARGET);
		if (target == null) {
			eVirtualSet(UMLPackage.TEMPLATE_BINDING__TARGET,
				target = new DerivedUnionEObjectEList(Element.class, this,
					UMLPackage.TEMPLATE_BINDING__TARGET,
					new int[]{UMLPackage.TEMPLATE_BINDING__SIGNATURE}));
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedElements() {
		EList ownedElement = (EList) eVirtualGet(UMLPackage.TEMPLATE_BINDING__OWNED_ELEMENT);
		if (ownedElement == null) {
			eVirtualSet(UMLPackage.TEMPLATE_BINDING__OWNED_ELEMENT,
				ownedElement = new DerivedUnionEObjectEList(Element.class,
					this, UMLPackage.TEMPLATE_BINDING__OWNED_ELEMENT,
					new int[]{UMLPackage.TEMPLATE_BINDING__OWNED_COMMENT,
						UMLPackage.TEMPLATE_BINDING__PARAMETER_SUBSTITUTION}));
		}
		return ownedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSources() {
		EList source = (EList) eVirtualGet(UMLPackage.TEMPLATE_BINDING__SOURCE);
		if (source == null) {
			eVirtualSet(UMLPackage.TEMPLATE_BINDING__SOURCE,
				source = new DerivedUnionEObjectEList(Element.class, this,
					UMLPackage.TEMPLATE_BINDING__SOURCE,
					new int[]{UMLPackage.TEMPLATE_BINDING__BOUND_ELEMENT}));
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateSignature getSignature() {
		TemplateSignature signature = (TemplateSignature) eVirtualGet(UMLPackage.TEMPLATE_BINDING__SIGNATURE);
		if (signature != null && signature.eIsProxy()) {
			InternalEObject oldSignature = (InternalEObject) signature;
			signature = (TemplateSignature) eResolveProxy(oldSignature);
			if (signature != oldSignature) {
				eVirtualSet(UMLPackage.TEMPLATE_BINDING__SIGNATURE, signature);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.TEMPLATE_BINDING__SIGNATURE, oldSignature,
						signature));
			}
		}
		return signature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateSignature basicGetSignature() {
		return (TemplateSignature) eVirtualGet(UMLPackage.TEMPLATE_BINDING__SIGNATURE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignature(TemplateSignature newSignature) {
		TemplateSignature signature = newSignature;
		Object oldSignature = eVirtualSet(
			UMLPackage.TEMPLATE_BINDING__SIGNATURE, signature);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.TEMPLATE_BINDING__SIGNATURE,
				oldSignature == EVIRTUAL_NO_VALUE
					? null
					: oldSignature, signature));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getParameterSubstitutions() {
		EList parameterSubstitution = (EList) eVirtualGet(UMLPackage.TEMPLATE_BINDING__PARAMETER_SUBSTITUTION);
		if (parameterSubstitution == null) {
			eVirtualSet(
				UMLPackage.TEMPLATE_BINDING__PARAMETER_SUBSTITUTION,
				parameterSubstitution = new EObjectContainmentWithInverseEList.Resolving(
					TemplateParameterSubstitution.class,
					this,
					UMLPackage.TEMPLATE_BINDING__PARAMETER_SUBSTITUTION,
					UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION__TEMPLATE_BINDING));
		}
		return parameterSubstitution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateParameterSubstitution createParameterSubstitution() {
		TemplateParameterSubstitution newParameterSubstitution = (TemplateParameterSubstitution) create(UMLPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION);
		getParameterSubstitutions().add(newParameterSubstitution);
		return newParameterSubstitution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateableElement getBoundElement() {
		if (eContainerFeatureID != UMLPackage.TEMPLATE_BINDING__BOUND_ELEMENT)
			return null;
		return (TemplateableElement) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBoundElement(
			TemplateableElement newBoundElement, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newBoundElement,
			UMLPackage.TEMPLATE_BINDING__BOUND_ELEMENT, msgs);

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoundElement(TemplateableElement newBoundElement) {
		if (newBoundElement != eInternalContainer()
			|| (eContainerFeatureID != UMLPackage.TEMPLATE_BINDING__BOUND_ELEMENT && newBoundElement != null)) {
			if (EcoreUtil.isAncestor(this, newBoundElement))
				throw new IllegalArgumentException(
					"Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newBoundElement != null)
				msgs = ((InternalEObject) newBoundElement).eInverseAdd(this,
					UMLPackage.TEMPLATEABLE_ELEMENT__TEMPLATE_BINDING,
					TemplateableElement.class, msgs);
			msgs = basicSetBoundElement(newBoundElement, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.TEMPLATE_BINDING__BOUND_ELEMENT, newBoundElement,
				newBoundElement));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterSubstitutionFormal(
			DiagnosticChain diagnostics, Map context) {
		return TemplateBindingOperations.validateParameterSubstitutionFormal(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOneParameterSubstitution(
			DiagnosticChain diagnostics, Map context) {
		return TemplateBindingOperations.validateOneParameterSubstitution(this,
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
			case UMLPackage.TEMPLATE_BINDING__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.TEMPLATE_BINDING__PARAMETER_SUBSTITUTION :
				return ((InternalEList) getParameterSubstitutions()).basicAdd(
					otherEnd, msgs);
			case UMLPackage.TEMPLATE_BINDING__BOUND_ELEMENT :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetBoundElement((TemplateableElement) otherEnd,
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
			case UMLPackage.TEMPLATE_BINDING__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.TEMPLATE_BINDING__OWNED_COMMENT :
				return ((InternalEList) getOwnedComments()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.TEMPLATE_BINDING__PARAMETER_SUBSTITUTION :
				return ((InternalEList) getParameterSubstitutions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.TEMPLATE_BINDING__BOUND_ELEMENT :
				return basicSetBoundElement(null, msgs);
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
			case UMLPackage.TEMPLATE_BINDING__BOUND_ELEMENT :
				return eInternalContainer().eInverseRemove(this,
					UMLPackage.TEMPLATEABLE_ELEMENT__TEMPLATE_BINDING,
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
			case UMLPackage.TEMPLATE_BINDING__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.TEMPLATE_BINDING__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.TEMPLATE_BINDING__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.TEMPLATE_BINDING__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.TEMPLATE_BINDING__RELATED_ELEMENT :
				return getRelatedElements();
			case UMLPackage.TEMPLATE_BINDING__SOURCE :
				return getSources();
			case UMLPackage.TEMPLATE_BINDING__TARGET :
				return getTargets();
			case UMLPackage.TEMPLATE_BINDING__SIGNATURE :
				if (resolve)
					return getSignature();
				return basicGetSignature();
			case UMLPackage.TEMPLATE_BINDING__PARAMETER_SUBSTITUTION :
				return getParameterSubstitutions();
			case UMLPackage.TEMPLATE_BINDING__BOUND_ELEMENT :
				return getBoundElement();
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
			case UMLPackage.TEMPLATE_BINDING__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.TEMPLATE_BINDING__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.TEMPLATE_BINDING__SIGNATURE :
				setSignature((TemplateSignature) newValue);
				return;
			case UMLPackage.TEMPLATE_BINDING__PARAMETER_SUBSTITUTION :
				getParameterSubstitutions().clear();
				getParameterSubstitutions().addAll((Collection) newValue);
				return;
			case UMLPackage.TEMPLATE_BINDING__BOUND_ELEMENT :
				setBoundElement((TemplateableElement) newValue);
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
			case UMLPackage.TEMPLATE_BINDING__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.TEMPLATE_BINDING__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.TEMPLATE_BINDING__SIGNATURE :
				setSignature((TemplateSignature) null);
				return;
			case UMLPackage.TEMPLATE_BINDING__PARAMETER_SUBSTITUTION :
				getParameterSubstitutions().clear();
				return;
			case UMLPackage.TEMPLATE_BINDING__BOUND_ELEMENT :
				setBoundElement((TemplateableElement) null);
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
			case UMLPackage.TEMPLATE_BINDING__EANNOTATIONS :
				EList eAnnotations = (EList) eVirtualGet(UMLPackage.TEMPLATE_BINDING__EANNOTATIONS);
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.TEMPLATE_BINDING__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.TEMPLATE_BINDING__OWNER :
				return isSetOwner();
			case UMLPackage.TEMPLATE_BINDING__OWNED_COMMENT :
				EList ownedComment = (EList) eVirtualGet(UMLPackage.TEMPLATE_BINDING__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.TEMPLATE_BINDING__RELATED_ELEMENT :
				return isSetRelatedElements();
			case UMLPackage.TEMPLATE_BINDING__SOURCE :
				return isSetSources();
			case UMLPackage.TEMPLATE_BINDING__TARGET :
				return isSetTargets();
			case UMLPackage.TEMPLATE_BINDING__SIGNATURE :
				return eVirtualGet(UMLPackage.TEMPLATE_BINDING__SIGNATURE) != null;
			case UMLPackage.TEMPLATE_BINDING__PARAMETER_SUBSTITUTION :
				EList parameterSubstitution = (EList) eVirtualGet(UMLPackage.TEMPLATE_BINDING__PARAMETER_SUBSTITUTION);
				return parameterSubstitution != null
					&& !parameterSubstitution.isEmpty();
			case UMLPackage.TEMPLATE_BINDING__BOUND_ELEMENT :
				return getBoundElement() != null;
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTargets() {
		return super.isSetTargets()
			|| eIsSet(UMLPackage.TEMPLATE_BINDING__SIGNATURE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| eIsSet(UMLPackage.TEMPLATE_BINDING__PARAMETER_SUBSTITUTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetOwner() {
		TemplateableElement boundElement = getBoundElement();
		if (boundElement != null) {
			return boundElement;
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
			|| eIsSet(UMLPackage.TEMPLATE_BINDING__BOUND_ELEMENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSources() {
		return super.isSetSources()
			|| eIsSet(UMLPackage.TEMPLATE_BINDING__BOUND_ELEMENT);
	}

} //TemplateBindingImpl
