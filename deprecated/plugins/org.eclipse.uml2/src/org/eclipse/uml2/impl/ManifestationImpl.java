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
 * $Id: ManifestationImpl.java,v 1.21 2005/11/23 13:25:34 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

//import org.eclipse.uml2.Element;
import org.eclipse.uml2.Manifestation;
import org.eclipse.uml2.NamedElement;
import org.eclipse.uml2.OpaqueExpression;
import org.eclipse.uml2.PackageableElement;
import org.eclipse.uml2.StringExpression;
import org.eclipse.uml2.TemplateParameter;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.VisibilityKind;

//import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;
import org.eclipse.uml2.common.util.SupersetEObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Manifestation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.ManifestationImpl#getTargets <em>Target</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ManifestationImpl#getSuppliers <em>Supplier</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ManifestationImpl#getUtilizedElement <em>Utilized Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ManifestationImpl extends AbstractionImpl implements Manifestation {
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
	protected ManifestationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UML2Package.eINSTANCE.getManifestation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList getTargets() {
		return super.getTargets();
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTargets() {
		return super.isSetTargets()
			|| eIsSet(UML2Package.MANIFESTATION__UTILIZED_ELEMENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageableElement getUtilizedElement() {
		PackageableElement utilizedElement = (PackageableElement)eVirtualGet(UML2Package.MANIFESTATION__UTILIZED_ELEMENT);
		if (utilizedElement != null && utilizedElement.eIsProxy()) {
			InternalEObject oldUtilizedElement = (InternalEObject)utilizedElement;
			utilizedElement = (PackageableElement)eResolveProxy(oldUtilizedElement);
			if (utilizedElement != oldUtilizedElement) {
				eVirtualSet(UML2Package.MANIFESTATION__UTILIZED_ELEMENT, utilizedElement);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2Package.MANIFESTATION__UTILIZED_ELEMENT, oldUtilizedElement, utilizedElement));
			}
		}
		return utilizedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageableElement basicGetUtilizedElement() {
		return (PackageableElement)eVirtualGet(UML2Package.MANIFESTATION__UTILIZED_ELEMENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUtilizedElement(PackageableElement newUtilizedElement) {
		if (newUtilizedElement != null && !getSuppliers().contains(newUtilizedElement)) {
			getSuppliers().add(newUtilizedElement);
		}
		PackageableElement utilizedElement = newUtilizedElement;
		Object oldUtilizedElement = eVirtualSet(UML2Package.MANIFESTATION__UTILIZED_ELEMENT, utilizedElement);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.MANIFESTATION__UTILIZED_ELEMENT, oldUtilizedElement == EVIRTUAL_NO_VALUE ? null : oldUtilizedElement, utilizedElement));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UML2Package.MANIFESTATION__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.MANIFESTATION__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.MANIFESTATION__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.MANIFESTATION__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.MANIFESTATION__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.MANIFESTATION__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UML2Package.MANIFESTATION__NAME:
				return getName();
			case UML2Package.MANIFESTATION__QUALIFIED_NAME:
				return getQualifiedName();
			case UML2Package.MANIFESTATION__VISIBILITY:
				return getVisibility();
			case UML2Package.MANIFESTATION__CLIENT_DEPENDENCY:
				return getClientDependencies();
			case UML2Package.MANIFESTATION__NAME_EXPRESSION:
				return getNameExpression();
			case UML2Package.MANIFESTATION__TEMPLATE_PARAMETER:
				if (resolve) return getTemplateParameter();
				return basicGetTemplateParameter();
			case UML2Package.MANIFESTATION__OWNING_PARAMETER:
				return getOwningParameter();
			case UML2Package.MANIFESTATION__PACKAGEABLE_ELEMENT_VISIBILITY:
				return getPackageableElement_visibility();
			case UML2Package.MANIFESTATION__RELATED_ELEMENT:
				return getRelatedElements();
			case UML2Package.MANIFESTATION__SOURCE:
				return getSources();
			case UML2Package.MANIFESTATION__TARGET:
				return getTargets();
			case UML2Package.MANIFESTATION__CLIENT:
				return getClients();
			case UML2Package.MANIFESTATION__SUPPLIER:
				return getSuppliers();
			case UML2Package.MANIFESTATION__MAPPING:
				return getMapping();
			case UML2Package.MANIFESTATION__UTILIZED_ELEMENT:
				if (resolve) return getUtilizedElement();
				return basicGetUtilizedElement();
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
			case UML2Package.MANIFESTATION__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.MANIFESTATION__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.MANIFESTATION__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection)newValue);
				return;
			case UML2Package.MANIFESTATION__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case UML2Package.MANIFESTATION__NAME:
				setName((String)newValue);
				return;
			case UML2Package.MANIFESTATION__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case UML2Package.MANIFESTATION__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection)newValue);
				return;
			case UML2Package.MANIFESTATION__NAME_EXPRESSION:
				setNameExpression((StringExpression)newValue);
				return;
			case UML2Package.MANIFESTATION__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)newValue);
				return;
			case UML2Package.MANIFESTATION__OWNING_PARAMETER:
				setOwningParameter((TemplateParameter)newValue);
				return;
			case UML2Package.MANIFESTATION__PACKAGEABLE_ELEMENT_VISIBILITY:
				setPackageableElement_visibility((VisibilityKind)newValue);
				return;
			case UML2Package.MANIFESTATION__CLIENT:
				getClients().clear();
				getClients().addAll((Collection)newValue);
				return;
			case UML2Package.MANIFESTATION__SUPPLIER:
				getSuppliers().clear();
				getSuppliers().addAll((Collection)newValue);
				return;
			case UML2Package.MANIFESTATION__MAPPING:
				setMapping((OpaqueExpression)newValue);
				return;
			case UML2Package.MANIFESTATION__UTILIZED_ELEMENT:
				setUtilizedElement((PackageableElement)newValue);
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
			case UML2Package.MANIFESTATION__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.MANIFESTATION__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.MANIFESTATION__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				return;
			case UML2Package.MANIFESTATION__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case UML2Package.MANIFESTATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UML2Package.MANIFESTATION__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UML2Package.MANIFESTATION__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				return;
			case UML2Package.MANIFESTATION__NAME_EXPRESSION:
				setNameExpression((StringExpression)null);
				return;
			case UML2Package.MANIFESTATION__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)null);
				return;
			case UML2Package.MANIFESTATION__OWNING_PARAMETER:
				setOwningParameter((TemplateParameter)null);
				return;
			case UML2Package.MANIFESTATION__PACKAGEABLE_ELEMENT_VISIBILITY:
				setPackageableElement_visibility(PACKAGEABLE_ELEMENT_VISIBILITY_EDEFAULT);
				return;
			case UML2Package.MANIFESTATION__CLIENT:
				getClients().clear();
				return;
			case UML2Package.MANIFESTATION__SUPPLIER:
				getSuppliers().clear();
				return;
			case UML2Package.MANIFESTATION__MAPPING:
				setMapping((OpaqueExpression)null);
				return;
			case UML2Package.MANIFESTATION__UTILIZED_ELEMENT:
				setUtilizedElement((PackageableElement)null);
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
			case UML2Package.MANIFESTATION__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.MANIFESTATION__OWNED_ELEMENT:
				return isSetOwnedElements();
			case UML2Package.MANIFESTATION__OWNER:
				return isSetOwner();
			case UML2Package.MANIFESTATION__OWNED_COMMENT:
				EList ownedComment = (EList)eVirtualGet(UML2Package.MANIFESTATION__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.MANIFESTATION__TEMPLATE_BINDING:
				EList templateBinding = (EList)eVirtualGet(UML2Package.MANIFESTATION__TEMPLATE_BINDING);
				return templateBinding != null && !templateBinding.isEmpty();
			case UML2Package.MANIFESTATION__OWNED_TEMPLATE_SIGNATURE:
				return eVirtualGet(UML2Package.MANIFESTATION__OWNED_TEMPLATE_SIGNATURE) != null;
			case UML2Package.MANIFESTATION__NAME:
				String name = (String)eVirtualGet(UML2Package.MANIFESTATION__NAME, NAME_EDEFAULT);
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.MANIFESTATION__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UML2Package.MANIFESTATION__VISIBILITY:
				return isSetVisibility();
			case UML2Package.MANIFESTATION__CLIENT_DEPENDENCY:
				EList clientDependency = (EList)eVirtualGet(UML2Package.MANIFESTATION__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UML2Package.MANIFESTATION__NAME_EXPRESSION:
				return eVirtualGet(UML2Package.MANIFESTATION__NAME_EXPRESSION) != null;
			case UML2Package.MANIFESTATION__TEMPLATE_PARAMETER:
				return eVirtualGet(UML2Package.MANIFESTATION__TEMPLATE_PARAMETER) != null;
			case UML2Package.MANIFESTATION__OWNING_PARAMETER:
				return getOwningParameter() != null;
			case UML2Package.MANIFESTATION__PACKAGEABLE_ELEMENT_VISIBILITY:
				return isSetPackageableElement_visibility();
			case UML2Package.MANIFESTATION__RELATED_ELEMENT:
				return isSetRelatedElements();
			case UML2Package.MANIFESTATION__SOURCE:
				return isSetSources();
			case UML2Package.MANIFESTATION__TARGET:
				return isSetTargets();
			case UML2Package.MANIFESTATION__CLIENT:
				EList client = (EList)eVirtualGet(UML2Package.MANIFESTATION__CLIENT);
				return client != null && !client.isEmpty();
			case UML2Package.MANIFESTATION__SUPPLIER:
				EList supplier = (EList)eVirtualGet(UML2Package.MANIFESTATION__SUPPLIER);
				return supplier != null && !supplier.isEmpty();
			case UML2Package.MANIFESTATION__MAPPING:
				return eVirtualGet(UML2Package.MANIFESTATION__MAPPING) != null;
			case UML2Package.MANIFESTATION__UTILIZED_ELEMENT:
				return eVirtualGet(UML2Package.MANIFESTATION__UTILIZED_ELEMENT) != null;
		}
		return eDynamicIsSet(featureID);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSuppliers() {
		EList supplier = (EList)eVirtualGet(UML2Package.MANIFESTATION__SUPPLIER);
		if (supplier == null) {
			eVirtualSet(UML2Package.MANIFESTATION__SUPPLIER, supplier = new SupersetEObjectResolvingEList(NamedElement.class, this, UML2Package.MANIFESTATION__SUPPLIER, new int[] {UML2Package.MANIFESTATION__UTILIZED_ELEMENT}));
		}
		return supplier;
	}


} //ManifestationImpl
