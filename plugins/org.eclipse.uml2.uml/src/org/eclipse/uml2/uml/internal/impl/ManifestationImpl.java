/*
 * Copyright (c) 2005, 2016 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 327039, 418466, 451350, 485756
 *
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.uml2.common.util.SubsetSupersetEObjectResolvingEList;

import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Manifestation;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.OpaqueExpression;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Manifestation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ManifestationImpl#getSuppliers <em>Supplier</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ManifestationImpl#getUtilizedElement <em>Utilized Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ManifestationImpl
		extends AbstractionImpl
		implements Manifestation {

	/**
	 * The cached value of the '{@link #getUtilizedElement() <em>Utilized Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUtilizedElement()
	 * @generated
	 * @ordered
	 */
	protected PackageableElement utilizedElement;

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
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.MANIFESTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NamedElement> getSuppliers() {
		if (suppliers == null) {
			suppliers = new SubsetSupersetEObjectResolvingEList<NamedElement>(
				NamedElement.class, this, UMLPackage.MANIFESTATION__SUPPLIER,
				null, SUPPLIER_ESUBSETS);
		}
		return suppliers;
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getSuppliers() <em>Supplier</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuppliers()
	 * @generated
	 * @ordered
	 */
	protected static final int[] SUPPLIER_ESUBSETS = new int[]{
		UMLPackage.MANIFESTATION__UTILIZED_ELEMENT};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageableElement getUtilizedElement() {
		if (utilizedElement != null && utilizedElement.eIsProxy()) {
			InternalEObject oldUtilizedElement = (InternalEObject) utilizedElement;
			utilizedElement = (PackageableElement) eResolveProxy(
				oldUtilizedElement);
			if (utilizedElement != oldUtilizedElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.MANIFESTATION__UTILIZED_ELEMENT,
						oldUtilizedElement, utilizedElement));
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
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.MANIFESTATION__UTILIZED_ELEMENT, oldUtilizedElement,
				utilizedElement));
		Resource.Internal eInternalResource = eInternalResource();
		if (eInternalResource == null || !eInternalResource.isLoading()) {
			if (newUtilizedElement != null) {
				EList<NamedElement> suppliers = getSuppliers();
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.MANIFESTATION__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.MANIFESTATION__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.MANIFESTATION__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.MANIFESTATION__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.MANIFESTATION__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.MANIFESTATION__NAME :
				return getName();
			case UMLPackage.MANIFESTATION__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.MANIFESTATION__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.MANIFESTATION__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.MANIFESTATION__VISIBILITY :
				return getVisibility();
			case UMLPackage.MANIFESTATION__OWNING_TEMPLATE_PARAMETER :
				if (resolve)
					return getOwningTemplateParameter();
				return basicGetOwningTemplateParameter();
			case UMLPackage.MANIFESTATION__TEMPLATE_PARAMETER :
				if (resolve)
					return getTemplateParameter();
				return basicGetTemplateParameter();
			case UMLPackage.MANIFESTATION__RELATED_ELEMENT :
				return getRelatedElements();
			case UMLPackage.MANIFESTATION__SOURCE :
				return getSources();
			case UMLPackage.MANIFESTATION__TARGET :
				return getTargets();
			case UMLPackage.MANIFESTATION__CLIENT :
				return getClients();
			case UMLPackage.MANIFESTATION__SUPPLIER :
				return getSuppliers();
			case UMLPackage.MANIFESTATION__MAPPING :
				if (resolve)
					return getMapping();
				return basicGetMapping();
			case UMLPackage.MANIFESTATION__UTILIZED_ELEMENT :
				if (resolve)
					return getUtilizedElement();
				return basicGetUtilizedElement();
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
			case UMLPackage.MANIFESTATION__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations()
					.addAll((Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.MANIFESTATION__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments()
					.addAll((Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.MANIFESTATION__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.MANIFESTATION__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.MANIFESTATION__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.MANIFESTATION__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.MANIFESTATION__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.MANIFESTATION__CLIENT :
				getClients().clear();
				getClients()
					.addAll((Collection<? extends NamedElement>) newValue);
				return;
			case UMLPackage.MANIFESTATION__SUPPLIER :
				getSuppliers().clear();
				getSuppliers()
					.addAll((Collection<? extends NamedElement>) newValue);
				return;
			case UMLPackage.MANIFESTATION__MAPPING :
				setMapping((OpaqueExpression) newValue);
				return;
			case UMLPackage.MANIFESTATION__UTILIZED_ELEMENT :
				setUtilizedElement((PackageableElement) newValue);
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
			case UMLPackage.MANIFESTATION__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.MANIFESTATION__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.MANIFESTATION__NAME :
				unsetName();
				return;
			case UMLPackage.MANIFESTATION__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.MANIFESTATION__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.MANIFESTATION__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.MANIFESTATION__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.MANIFESTATION__CLIENT :
				getClients().clear();
				return;
			case UMLPackage.MANIFESTATION__SUPPLIER :
				getSuppliers().clear();
				return;
			case UMLPackage.MANIFESTATION__MAPPING :
				setMapping((OpaqueExpression) null);
				return;
			case UMLPackage.MANIFESTATION__UTILIZED_ELEMENT :
				setUtilizedElement((PackageableElement) null);
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
			case UMLPackage.MANIFESTATION__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.MANIFESTATION__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.MANIFESTATION__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.MANIFESTATION__OWNER :
				return isSetOwner();
			case UMLPackage.MANIFESTATION__CLIENT_DEPENDENCY :
				return !getClientDependencies().isEmpty();
			case UMLPackage.MANIFESTATION__NAME :
				return isSetName();
			case UMLPackage.MANIFESTATION__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.MANIFESTATION__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.MANIFESTATION__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.MANIFESTATION__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.MANIFESTATION__OWNING_TEMPLATE_PARAMETER :
				return basicGetOwningTemplateParameter() != null;
			case UMLPackage.MANIFESTATION__TEMPLATE_PARAMETER :
				return templateParameter != null;
			case UMLPackage.MANIFESTATION__RELATED_ELEMENT :
				return isSetRelatedElements();
			case UMLPackage.MANIFESTATION__SOURCE :
				return isSetSources();
			case UMLPackage.MANIFESTATION__TARGET :
				return isSetTargets();
			case UMLPackage.MANIFESTATION__CLIENT :
				return clients != null && !clients.isEmpty();
			case UMLPackage.MANIFESTATION__SUPPLIER :
				return suppliers != null && !suppliers.isEmpty();
			case UMLPackage.MANIFESTATION__MAPPING :
				return mapping != null;
			case UMLPackage.MANIFESTATION__UTILIZED_ELEMENT :
				return utilizedElement != null;
		}
		return eDynamicIsSet(featureID);
	}

} //ManifestationImpl
