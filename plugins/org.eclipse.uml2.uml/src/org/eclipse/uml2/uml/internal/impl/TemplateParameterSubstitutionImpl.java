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
 * $Id: TemplateParameterSubstitutionImpl.java,v 1.16 2006/05/24 20:54:28 khussey Exp $
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

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.CacheAdapter;
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
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.TemplateParameterSubstitutionImpl#getOwner <em>Owner</em>}</li>
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
	 * The cached value of the '{@link #getActuals() <em>Actual</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActuals()
	 * @generated
	 * @ordered
	 */
	protected EList actuals = null;

	/**
	 * The cached value of the '{@link #getFormal() <em>Formal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormal()
	 * @generated
	 * @ordered
	 */
	protected TemplateParameter formal = null;

	/**
	 * The cached value of the '{@link #getOwnedActuals() <em>Owned Actual</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedActuals()
	 * @generated
	 * @ordered
	 */
	protected EList ownedActuals = null;

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
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			EList ownedElements = (EList) cache.get(eResource, this,
				UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
			if (ownedElements == null) {
				cache
					.put(
						eResource,
						this,
						UMLPackage.Literals.ELEMENT__OWNED_ELEMENT,
						ownedElements = new DerivedUnionEObjectEList(
							Element.class,
							this,
							UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ELEMENT,
							OWNED_ELEMENT_ESUBSETS));
			}
			return ownedElements;
		}
		return new DerivedUnionEObjectEList(Element.class, this,
			UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ELEMENT,
			OWNED_ELEMENT_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getActuals() {
		if (actuals == null) {
			actuals = new SubsetSupersetEObjectResolvingEList(
				ParameterableElement.class, this,
				UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION__ACTUAL, null,
				ACTUAL_ESUBSETS);
		}
		return actuals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateParameter getFormal() {
		if (formal != null && formal.eIsProxy()) {
			InternalEObject oldFormal = (InternalEObject) formal;
			formal = (TemplateParameter) eResolveProxy(oldFormal);
			if (formal != oldFormal) {
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
		return formal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormal(TemplateParameter newFormal) {
		TemplateParameter oldFormal = formal;
		formal = newFormal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION__FORMAL, oldFormal,
				formal));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedActuals() {
		if (ownedActuals == null) {
			ownedActuals = new SubsetSupersetEObjectContainmentEList.Resolving(
				ParameterableElement.class, this,
				UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				OWNED_ACTUAL_ESUPERSETS, null);
		}
		return ownedActuals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterableElement createOwnedActual(EClass eClass) {
		ParameterableElement newOwnedActual = (ParameterableElement) create(eClass);
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
	public TemplateBinding basicGetTemplateBinding() {
		if (eContainerFeatureID != UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION__TEMPLATE_BINDING)
			return null;
		return (TemplateBinding) eInternalContainer();
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
				if (resolve)
					return getTemplateBinding();
				return basicGetTemplateBinding();
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
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION__OWNER :
				return isSetOwner();
			case UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION__FORMAL :
				return formal != null;
			case UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION__ACTUAL :
				return actuals != null && !actuals.isEmpty();
			case UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL :
				return ownedActuals != null && !ownedActuals.isEmpty();
			case UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION__TEMPLATE_BINDING :
				return basicGetTemplateBinding() != null;
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
		UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_COMMENT,
		UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL};

	/**
	 * The array of subset feature identifiers for the '{@link #getActuals() <em>Actual</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActuals()
	 * @generated
	 * @ordered
	 */
	protected static final int[] ACTUAL_ESUBSETS = new int[]{UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL};

	/**
	 * The array of superset feature identifiers for the '{@link #getOwnedActuals() <em>Owned Actual</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedActuals()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_ACTUAL_ESUPERSETS = new int[]{UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION__ACTUAL};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
		TemplateBinding templateBinding = basicGetTemplateBinding();
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
