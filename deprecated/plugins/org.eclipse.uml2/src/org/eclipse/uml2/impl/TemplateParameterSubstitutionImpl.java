/*
 * Copyright (c) 2003, 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: TemplateParameterSubstitutionImpl.java,v 1.20 2005/11/28 17:18:06 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.Element;
import org.eclipse.uml2.ParameterableElement;
import org.eclipse.uml2.TemplateBinding;
import org.eclipse.uml2.TemplateParameter;
import org.eclipse.uml2.TemplateParameterSubstitution;
import org.eclipse.uml2.UML2Package;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;
import org.eclipse.uml2.common.util.SubsetEObjectContainmentEList;
import org.eclipse.uml2.common.util.SupersetEObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Template Parameter Substitution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.TemplateParameterSubstitutionImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.TemplateParameterSubstitutionImpl#getActuals <em>Actual</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.TemplateParameterSubstitutionImpl#getFormal <em>Formal</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.TemplateParameterSubstitutionImpl#getTemplateBinding <em>Template Binding</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.TemplateParameterSubstitutionImpl#getOwnedActuals <em>Owned Actual</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TemplateParameterSubstitutionImpl extends ElementImpl implements TemplateParameterSubstitution {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

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
		return UML2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedElements() {
		EList ownedElement = (EList)eVirtualGet(UML2Package.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ELEMENT);
		if (ownedElement == null) {
			eVirtualSet(UML2Package.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ELEMENT, ownedElement = new DerivedUnionEObjectEList(Element.class, this, UML2Package.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ELEMENT, new int[] {UML2Package.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_COMMENT, UML2Package.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL}));
		}
		return ownedElement;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| eIsSet(UML2Package.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateParameter getFormal() {
		TemplateParameter formal = (TemplateParameter)eVirtualGet(UML2Package.TEMPLATE_PARAMETER_SUBSTITUTION__FORMAL);
		if (formal != null && formal.eIsProxy()) {
			InternalEObject oldFormal = (InternalEObject)formal;
			formal = (TemplateParameter)eResolveProxy(oldFormal);
			if (formal != oldFormal) {
				eVirtualSet(UML2Package.TEMPLATE_PARAMETER_SUBSTITUTION__FORMAL, formal);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2Package.TEMPLATE_PARAMETER_SUBSTITUTION__FORMAL, oldFormal, formal));
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
		return (TemplateParameter)eVirtualGet(UML2Package.TEMPLATE_PARAMETER_SUBSTITUTION__FORMAL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormal(TemplateParameter newFormal) {
		TemplateParameter formal = newFormal;
		Object oldFormal = eVirtualSet(UML2Package.TEMPLATE_PARAMETER_SUBSTITUTION__FORMAL, formal);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.TEMPLATE_PARAMETER_SUBSTITUTION__FORMAL, oldFormal == EVIRTUAL_NO_VALUE ? null : oldFormal, formal));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateBinding getTemplateBinding() {
		if (eContainerFeatureID != UML2Package.TEMPLATE_PARAMETER_SUBSTITUTION__TEMPLATE_BINDING) return null;
		return (TemplateBinding)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemplateBinding(TemplateBinding newTemplateBinding) {
		if (newTemplateBinding != eInternalContainer() || (eContainerFeatureID != UML2Package.TEMPLATE_PARAMETER_SUBSTITUTION__TEMPLATE_BINDING && newTemplateBinding != null)) {
			if (EcoreUtil.isAncestor(this, newTemplateBinding))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTemplateBinding != null)
				msgs = ((InternalEObject)newTemplateBinding).eInverseAdd(this, UML2Package.TEMPLATE_BINDING__PARAMETER_SUBSTITUTION, TemplateBinding.class, msgs);
			msgs = eBasicSetContainer((InternalEObject)newTemplateBinding, UML2Package.TEMPLATE_PARAMETER_SUBSTITUTION__TEMPLATE_BINDING, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.TEMPLATE_PARAMETER_SUBSTITUTION__TEMPLATE_BINDING, newTemplateBinding, newTemplateBinding));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getActuals() {
		EList actual = (EList)eVirtualGet(UML2Package.TEMPLATE_PARAMETER_SUBSTITUTION__ACTUAL);
		if (actual == null) {
			eVirtualSet(UML2Package.TEMPLATE_PARAMETER_SUBSTITUTION__ACTUAL, actual = new SupersetEObjectResolvingEList(ParameterableElement.class, this, UML2Package.TEMPLATE_PARAMETER_SUBSTITUTION__ACTUAL, new int[] {UML2Package.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL}));
		}
		return actual;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedActuals() {
		EList ownedActual = (EList)eVirtualGet(UML2Package.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL);
		if (ownedActual == null) {
			eVirtualSet(UML2Package.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL, ownedActual = new SubsetEObjectContainmentEList(ParameterableElement.class, this, UML2Package.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL, new int[] {UML2Package.TEMPLATE_PARAMETER_SUBSTITUTION__ACTUAL}));
		}
		return ownedActual;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ParameterableElement createOwnedActual(EClass eClass) {
		ParameterableElement newOwnedActual = (ParameterableElement) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL, null, newOwnedActual));
		}
		getOwnedActuals().add(newOwnedActual);
		return newOwnedActual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UML2Package.TEMPLATE_PARAMETER_SUBSTITUTION__EANNOTATIONS:
				return ((InternalEList)getEAnnotations()).basicAdd(otherEnd, msgs);
			case UML2Package.TEMPLATE_PARAMETER_SUBSTITUTION__TEMPLATE_BINDING:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, UML2Package.TEMPLATE_PARAMETER_SUBSTITUTION__TEMPLATE_BINDING, msgs);
		}
		return eDynamicInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UML2Package.TEMPLATE_PARAMETER_SUBSTITUTION__EANNOTATIONS:
				return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
			case UML2Package.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_COMMENT:
				return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
			case UML2Package.TEMPLATE_PARAMETER_SUBSTITUTION__TEMPLATE_BINDING:
				return eBasicSetContainer(null, UML2Package.TEMPLATE_PARAMETER_SUBSTITUTION__TEMPLATE_BINDING, msgs);
			case UML2Package.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL:
				return ((InternalEList)getOwnedActuals()).basicRemove(otherEnd, msgs);
		}
		return eDynamicInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID) {
			case UML2Package.TEMPLATE_PARAMETER_SUBSTITUTION__TEMPLATE_BINDING:
				return eInternalContainer().eInverseRemove(this, UML2Package.TEMPLATE_BINDING__PARAMETER_SUBSTITUTION, TemplateBinding.class, msgs);
		}
		return eDynamicBasicRemoveFromContainer(msgs);
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
			|| eIsSet(UML2Package.TEMPLATE_PARAMETER_SUBSTITUTION__TEMPLATE_BINDING);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UML2Package.TEMPLATE_PARAMETER_SUBSTITUTION__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.TEMPLATE_PARAMETER_SUBSTITUTION__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.TEMPLATE_PARAMETER_SUBSTITUTION__FORMAL:
				if (resolve) return getFormal();
				return basicGetFormal();
			case UML2Package.TEMPLATE_PARAMETER_SUBSTITUTION__TEMPLATE_BINDING:
				return getTemplateBinding();
			case UML2Package.TEMPLATE_PARAMETER_SUBSTITUTION__ACTUAL:
				return getActuals();
			case UML2Package.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL:
				return getOwnedActuals();
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
			case UML2Package.TEMPLATE_PARAMETER_SUBSTITUTION__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.TEMPLATE_PARAMETER_SUBSTITUTION__FORMAL:
				setFormal((TemplateParameter)newValue);
				return;
			case UML2Package.TEMPLATE_PARAMETER_SUBSTITUTION__TEMPLATE_BINDING:
				setTemplateBinding((TemplateBinding)newValue);
				return;
			case UML2Package.TEMPLATE_PARAMETER_SUBSTITUTION__ACTUAL:
				getActuals().clear();
				getActuals().addAll((Collection)newValue);
				return;
			case UML2Package.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL:
				getOwnedActuals().clear();
				getOwnedActuals().addAll((Collection)newValue);
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
			case UML2Package.TEMPLATE_PARAMETER_SUBSTITUTION__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.TEMPLATE_PARAMETER_SUBSTITUTION__FORMAL:
				setFormal((TemplateParameter)null);
				return;
			case UML2Package.TEMPLATE_PARAMETER_SUBSTITUTION__TEMPLATE_BINDING:
				setTemplateBinding((TemplateBinding)null);
				return;
			case UML2Package.TEMPLATE_PARAMETER_SUBSTITUTION__ACTUAL:
				getActuals().clear();
				return;
			case UML2Package.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL:
				getOwnedActuals().clear();
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
			case UML2Package.TEMPLATE_PARAMETER_SUBSTITUTION__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ELEMENT:
				return isSetOwnedElements();
			case UML2Package.TEMPLATE_PARAMETER_SUBSTITUTION__OWNER:
				return isSetOwner();
			case UML2Package.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_COMMENT:
				EList ownedComment = (EList)eVirtualGet(UML2Package.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.TEMPLATE_PARAMETER_SUBSTITUTION__FORMAL:
				return eVirtualGet(UML2Package.TEMPLATE_PARAMETER_SUBSTITUTION__FORMAL) != null;
			case UML2Package.TEMPLATE_PARAMETER_SUBSTITUTION__TEMPLATE_BINDING:
				return getTemplateBinding() != null;
			case UML2Package.TEMPLATE_PARAMETER_SUBSTITUTION__ACTUAL:
				EList actual = (EList)eVirtualGet(UML2Package.TEMPLATE_PARAMETER_SUBSTITUTION__ACTUAL);
				return actual != null && !actual.isEmpty();
			case UML2Package.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL:
				EList ownedActual = (EList)eVirtualGet(UML2Package.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL);
				return ownedActual != null && !ownedActual.isEmpty();
		}
		return eDynamicIsSet(featureID);
	}


} //TemplateParameterSubstitutionImpl
