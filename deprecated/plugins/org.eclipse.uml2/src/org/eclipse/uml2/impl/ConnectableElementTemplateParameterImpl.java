/*
 * Copyright (c) 2003, 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: ConnectableElementTemplateParameterImpl.java,v 1.4 2005/03/15 18:44:30 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.uml2.ConnectableElementTemplateParameter;
import org.eclipse.uml2.ParameterableElement;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.UML2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connectable Element Template Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ConnectableElementTemplateParameterImpl extends TemplateParameterImpl implements ConnectableElementTemplateParameter {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectableElementTemplateParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UML2Package.eINSTANCE.getConnectableElementTemplateParameter();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UML2Package.CONNECTABLE_ELEMENT_TEMPLATE_PARAMETER__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicAdd(otherEnd, msgs);
				case UML2Package.CONNECTABLE_ELEMENT_TEMPLATE_PARAMETER__SIGNATURE:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, UML2Package.CONNECTABLE_ELEMENT_TEMPLATE_PARAMETER__SIGNATURE, msgs);
				case UML2Package.CONNECTABLE_ELEMENT_TEMPLATE_PARAMETER__PARAMETERED_ELEMENT:
					if (parameteredElement != null)
						msgs = ((InternalEObject)parameteredElement).eInverseRemove(this, UML2Package.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER, ParameterableElement.class, msgs);
					return basicSetParameteredElement((ParameterableElement)otherEnd, msgs);
				case UML2Package.CONNECTABLE_ELEMENT_TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT:
					if (ownedParameteredElement != null)
						msgs = ((InternalEObject)ownedParameteredElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.CONNECTABLE_ELEMENT_TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT, null, msgs);
					return basicSetOwnedParameteredElement((ParameterableElement)otherEnd, msgs);
				default:
					return eDynamicInverseAdd(otherEnd, featureID, baseClass, msgs);
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UML2Package.CONNECTABLE_ELEMENT_TEMPLATE_PARAMETER__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
				case UML2Package.CONNECTABLE_ELEMENT_TEMPLATE_PARAMETER__OWNED_COMMENT:
					return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
				case UML2Package.CONNECTABLE_ELEMENT_TEMPLATE_PARAMETER__SIGNATURE:
					return eBasicSetContainer(null, UML2Package.CONNECTABLE_ELEMENT_TEMPLATE_PARAMETER__SIGNATURE, msgs);
				case UML2Package.CONNECTABLE_ELEMENT_TEMPLATE_PARAMETER__PARAMETERED_ELEMENT:
					return basicSetParameteredElement(null, msgs);
				case UML2Package.CONNECTABLE_ELEMENT_TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT:
					return basicSetOwnedParameteredElement(null, msgs);
				case UML2Package.CONNECTABLE_ELEMENT_TEMPLATE_PARAMETER__OWNED_DEFAULT:
					return basicSetOwnedDefault(null, msgs);
				default:
					return eDynamicInverseRemove(otherEnd, featureID, baseClass, msgs);
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
				case UML2Package.CONNECTABLE_ELEMENT_TEMPLATE_PARAMETER__SIGNATURE:
					return eContainer.eInverseRemove(this, UML2Package.TEMPLATE_SIGNATURE__OWNED_PARAMETER, TemplateSignature.class, msgs);
				default:
					return eDynamicBasicRemoveFromContainer(msgs);
			}
		}
		return eContainer.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - eContainerFeatureID, null, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UML2Package.CONNECTABLE_ELEMENT_TEMPLATE_PARAMETER__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.CONNECTABLE_ELEMENT_TEMPLATE_PARAMETER__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.CONNECTABLE_ELEMENT_TEMPLATE_PARAMETER__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.CONNECTABLE_ELEMENT_TEMPLATE_PARAMETER__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.CONNECTABLE_ELEMENT_TEMPLATE_PARAMETER__SIGNATURE:
				return getSignature();
			case UML2Package.CONNECTABLE_ELEMENT_TEMPLATE_PARAMETER__PARAMETERED_ELEMENT:
				if (resolve) return getParameteredElement();
				return basicGetParameteredElement();
			case UML2Package.CONNECTABLE_ELEMENT_TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT:
				return getOwnedParameteredElement();
			case UML2Package.CONNECTABLE_ELEMENT_TEMPLATE_PARAMETER__DEFAULT:
				if (resolve) return getDefault();
				return basicGetDefault();
			case UML2Package.CONNECTABLE_ELEMENT_TEMPLATE_PARAMETER__OWNED_DEFAULT:
				return getOwnedDefault();
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
			case UML2Package.CONNECTABLE_ELEMENT_TEMPLATE_PARAMETER__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.CONNECTABLE_ELEMENT_TEMPLATE_PARAMETER__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.CONNECTABLE_ELEMENT_TEMPLATE_PARAMETER__SIGNATURE:
				setSignature((TemplateSignature)newValue);
				return;
			case UML2Package.CONNECTABLE_ELEMENT_TEMPLATE_PARAMETER__PARAMETERED_ELEMENT:
				setParameteredElement((ParameterableElement)newValue);
				return;
			case UML2Package.CONNECTABLE_ELEMENT_TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT:
				setOwnedParameteredElement((ParameterableElement)newValue);
				return;
			case UML2Package.CONNECTABLE_ELEMENT_TEMPLATE_PARAMETER__DEFAULT:
				setDefault((ParameterableElement)newValue);
				return;
			case UML2Package.CONNECTABLE_ELEMENT_TEMPLATE_PARAMETER__OWNED_DEFAULT:
				setOwnedDefault((ParameterableElement)newValue);
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
			case UML2Package.CONNECTABLE_ELEMENT_TEMPLATE_PARAMETER__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.CONNECTABLE_ELEMENT_TEMPLATE_PARAMETER__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.CONNECTABLE_ELEMENT_TEMPLATE_PARAMETER__SIGNATURE:
				setSignature((TemplateSignature)null);
				return;
			case UML2Package.CONNECTABLE_ELEMENT_TEMPLATE_PARAMETER__PARAMETERED_ELEMENT:
				setParameteredElement((ParameterableElement)null);
				return;
			case UML2Package.CONNECTABLE_ELEMENT_TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT:
				setOwnedParameteredElement((ParameterableElement)null);
				return;
			case UML2Package.CONNECTABLE_ELEMENT_TEMPLATE_PARAMETER__DEFAULT:
				setDefault((ParameterableElement)null);
				return;
			case UML2Package.CONNECTABLE_ELEMENT_TEMPLATE_PARAMETER__OWNED_DEFAULT:
				setOwnedDefault((ParameterableElement)null);
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
			case UML2Package.CONNECTABLE_ELEMENT_TEMPLATE_PARAMETER__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.CONNECTABLE_ELEMENT_TEMPLATE_PARAMETER__OWNED_ELEMENT:
				return !getOwnedElements().isEmpty();
			case UML2Package.CONNECTABLE_ELEMENT_TEMPLATE_PARAMETER__OWNER:
				return basicGetOwner() != null;
			case UML2Package.CONNECTABLE_ELEMENT_TEMPLATE_PARAMETER__OWNED_COMMENT:
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.CONNECTABLE_ELEMENT_TEMPLATE_PARAMETER__SIGNATURE:
				return getSignature() != null;
			case UML2Package.CONNECTABLE_ELEMENT_TEMPLATE_PARAMETER__PARAMETERED_ELEMENT:
				return parameteredElement != null;
			case UML2Package.CONNECTABLE_ELEMENT_TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT:
				return ownedParameteredElement != null;
			case UML2Package.CONNECTABLE_ELEMENT_TEMPLATE_PARAMETER__DEFAULT:
				return default_ != null;
			case UML2Package.CONNECTABLE_ELEMENT_TEMPLATE_PARAMETER__OWNED_DEFAULT:
				return ownedDefault != null;
		}
		return eDynamicIsSet(eFeature);
	}

} //ConnectableElementTemplateParameterImpl
