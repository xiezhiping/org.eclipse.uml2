/*
 * Copyright (c) 2003, 2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: ManifestationImpl.java,v 1.26 2006/05/26 18:16:45 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

//import org.eclipse.uml2.Element;
import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.uml2.Manifestation;
import org.eclipse.uml2.NamedElement;
import org.eclipse.uml2.OpaqueExpression;
import org.eclipse.uml2.PackageableElement;
import org.eclipse.uml2.StringExpression;
import org.eclipse.uml2.TemplateParameter;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.VisibilityKind;

//import org.eclipse.uml2.common.util.CacheAdapter;
//import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;
import org.eclipse.uml2.common.util.SubsetSupersetEObjectResolvingEList;

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
	 * The cached value of the '{@link #getUtilizedElement() <em>Utilized Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUtilizedElement()
	 * @generated
	 * @ordered
	 */
	protected PackageableElement utilizedElement = null;

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
		return UML2Package.Literals.MANIFESTATION;
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
		if (utilizedElement != null && utilizedElement.eIsProxy()) {
			InternalEObject oldUtilizedElement = (InternalEObject)utilizedElement;
			utilizedElement = (PackageableElement)eResolveProxy(oldUtilizedElement);
			if (utilizedElement != oldUtilizedElement) {
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
		return utilizedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUtilizedElement(PackageableElement newUtilizedElement) {
		PackageableElement oldUtilizedElement = utilizedElement;
		utilizedElement = newUtilizedElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.MANIFESTATION__UTILIZED_ELEMENT, oldUtilizedElement, utilizedElement));


		Resource.Internal eInternalResource = eInternalResource();
		if (eInternalResource == null || !eInternalResource.isLoading()) {
			if (newUtilizedElement != null) {
				EList suppliers = getSuppliers();
				if (!suppliers.contains(newUtilizedElement)) {
					suppliers.add(newUtilizedElement);
				}
			}
		}
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
				return ownedComments != null && !ownedComments.isEmpty();
			case UML2Package.MANIFESTATION__TEMPLATE_BINDING:
				return templateBindings != null && !templateBindings.isEmpty();
			case UML2Package.MANIFESTATION__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case UML2Package.MANIFESTATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.MANIFESTATION__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UML2Package.MANIFESTATION__VISIBILITY:
				return isSetVisibility();
			case UML2Package.MANIFESTATION__CLIENT_DEPENDENCY:
				return clientDependencies != null && !clientDependencies.isEmpty();
			case UML2Package.MANIFESTATION__NAME_EXPRESSION:
				return nameExpression != null;
			case UML2Package.MANIFESTATION__TEMPLATE_PARAMETER:
				return templateParameter != null;
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
				return clients != null && !clients.isEmpty();
			case UML2Package.MANIFESTATION__SUPPLIER:
				return suppliers != null && !suppliers.isEmpty();
			case UML2Package.MANIFESTATION__MAPPING:
				return mapping != null;
			case UML2Package.MANIFESTATION__UTILIZED_ELEMENT:
				return utilizedElement != null;
		}
		return eDynamicIsSet(featureID);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSuppliers() {
		if (suppliers == null) {
			suppliers = new SubsetSupersetEObjectResolvingEList(NamedElement.class, this, UML2Package.MANIFESTATION__SUPPLIER, null, SUPPLIER_ESUBSETS);
		}
		return suppliers;
	}


	/**
	 * The array of subset feature identifiers for the '{@link #getTargets() <em>Target</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargets()
	 * @generated
	 * @ordered
	 */
	protected static final int[] TARGET_ESUBSETS = new int[] {UML2Package.MANIFESTATION__UTILIZED_ELEMENT};

	/**
	 * The array of subset feature identifiers for the '{@link #getSuppliers() <em>Supplier</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuppliers()
	 * @generated
	 * @ordered
	 */
	protected static final int[] SUPPLIER_ESUBSETS = new int[] {UML2Package.MANIFESTATION__UTILIZED_ELEMENT};

} //ManifestationImpl
