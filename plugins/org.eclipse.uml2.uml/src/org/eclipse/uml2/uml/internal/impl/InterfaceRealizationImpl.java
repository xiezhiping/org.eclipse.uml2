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
 * $Id: InterfaceRealizationImpl.java,v 1.12 2006/03/01 17:56:38 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.SubsetSupersetEObjectResolvingEList;
import org.eclipse.uml2.common.util.SubsetSupersetEObjectWithInverseResolvingEList;

import org.eclipse.uml2.uml.BehavioredClassifier;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.InterfaceRealization;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.OpaqueExpression;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface Realization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InterfaceRealizationImpl#getSuppliers <em>Supplier</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InterfaceRealizationImpl#getClients <em>Client</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InterfaceRealizationImpl#getContract <em>Contract</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InterfaceRealizationImpl#getImplementingClassifier <em>Implementing Classifier</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InterfaceRealizationImpl
		extends RealizationImpl
		implements InterfaceRealization {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceRealizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.Literals.INTERFACE_REALIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSuppliers() {
		EList supplier = (EList) eVirtualGet(UMLPackage.INTERFACE_REALIZATION__SUPPLIER);
		if (supplier == null) {
			eVirtualSet(UMLPackage.INTERFACE_REALIZATION__SUPPLIER,
				supplier = new SubsetSupersetEObjectResolvingEList(
					NamedElement.class, this,
					UMLPackage.INTERFACE_REALIZATION__SUPPLIER, null,
					new int[]{UMLPackage.INTERFACE_REALIZATION__CONTRACT}));
		}
		return supplier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getClients() {
		EList client = (EList) eVirtualGet(UMLPackage.INTERFACE_REALIZATION__CLIENT);
		if (client == null) {
			eVirtualSet(
				UMLPackage.INTERFACE_REALIZATION__CLIENT,
				client = new SubsetSupersetEObjectWithInverseResolvingEList.ManyInverse(
					NamedElement.class,
					this,
					UMLPackage.INTERFACE_REALIZATION__CLIENT,
					null,
					new int[]{UMLPackage.INTERFACE_REALIZATION__IMPLEMENTING_CLASSIFIER},
					UMLPackage.NAMED_ELEMENT__CLIENT_DEPENDENCY));
		}
		return client;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface getContract() {
		Interface contract = (Interface) eVirtualGet(UMLPackage.INTERFACE_REALIZATION__CONTRACT);
		if (contract != null && contract.eIsProxy()) {
			InternalEObject oldContract = (InternalEObject) contract;
			contract = (Interface) eResolveProxy(oldContract);
			if (contract != oldContract) {
				eVirtualSet(UMLPackage.INTERFACE_REALIZATION__CONTRACT,
					contract);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.INTERFACE_REALIZATION__CONTRACT,
						oldContract, contract));
			}
		}
		return contract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface basicGetContract() {
		return (Interface) eVirtualGet(UMLPackage.INTERFACE_REALIZATION__CONTRACT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContract(Interface newContract) {
		Interface contract = newContract;
		Object oldContract = eVirtualSet(
			UMLPackage.INTERFACE_REALIZATION__CONTRACT, contract);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.INTERFACE_REALIZATION__CONTRACT,
				oldContract == EVIRTUAL_NO_VALUE
					? null
					: oldContract, contract));

		Resource.Internal eInternalResource = eInternalResource();
		if (eInternalResource == null || !eInternalResource.isLoading()) {
			if (newContract != null) {
				EList supplier = getSuppliers();
				if (!supplier.contains(newContract)) {
					supplier.add(newContract);
				}
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehavioredClassifier getImplementingClassifier() {
		if (eContainerFeatureID != UMLPackage.INTERFACE_REALIZATION__IMPLEMENTING_CLASSIFIER)
			return null;
		return (BehavioredClassifier) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehavioredClassifier basicGetImplementingClassifier() {
		if (eContainerFeatureID != UMLPackage.INTERFACE_REALIZATION__IMPLEMENTING_CLASSIFIER)
			return null;
		return (BehavioredClassifier) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImplementingClassifier(
			BehavioredClassifier newImplementingClassifier,
			NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newImplementingClassifier,
			UMLPackage.INTERFACE_REALIZATION__IMPLEMENTING_CLASSIFIER, msgs);

		Resource.Internal eInternalResource = eInternalResource();
		if (eInternalResource == null || !eInternalResource.isLoading()) {
			if (newImplementingClassifier != null) {
				EList client = getClients();
				if (!client.contains(newImplementingClassifier)) {
					client.add(newImplementingClassifier);
				}
			}
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplementingClassifier(
			BehavioredClassifier newImplementingClassifier) {
		if (newImplementingClassifier != eInternalContainer()
			|| (eContainerFeatureID != UMLPackage.INTERFACE_REALIZATION__IMPLEMENTING_CLASSIFIER && newImplementingClassifier != null)) {
			if (EcoreUtil.isAncestor(this, newImplementingClassifier))
				throw new IllegalArgumentException(
					"Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newImplementingClassifier != null)
				msgs = ((InternalEObject) newImplementingClassifier)
					.eInverseAdd(
						this,
						UMLPackage.BEHAVIORED_CLASSIFIER__INTERFACE_REALIZATION,
						BehavioredClassifier.class, msgs);
			msgs = basicSetImplementingClassifier(newImplementingClassifier,
				msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.INTERFACE_REALIZATION__IMPLEMENTING_CLASSIFIER,
				newImplementingClassifier, newImplementingClassifier));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.INTERFACE_REALIZATION__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.INTERFACE_REALIZATION__CLIENT_DEPENDENCY :
				return ((InternalEList) getClientDependencies()).basicAdd(
					otherEnd, msgs);
			case UMLPackage.INTERFACE_REALIZATION__OWNING_TEMPLATE_PARAMETER :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningTemplateParameter(
					(TemplateParameter) otherEnd, msgs);
			case UMLPackage.INTERFACE_REALIZATION__TEMPLATE_PARAMETER :
				TemplateParameter templateParameter = (TemplateParameter) eVirtualGet(UMLPackage.INTERFACE_REALIZATION__TEMPLATE_PARAMETER);
				if (templateParameter != null)
					msgs = ((InternalEObject) templateParameter)
						.eInverseRemove(this,
							UMLPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT,
							TemplateParameter.class, msgs);
				return basicSetTemplateParameter((TemplateParameter) otherEnd,
					msgs);
			case UMLPackage.INTERFACE_REALIZATION__CLIENT :
				return ((InternalEList) getClients()).basicAdd(otherEnd, msgs);
			case UMLPackage.INTERFACE_REALIZATION__IMPLEMENTING_CLASSIFIER :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetImplementingClassifier(
					(BehavioredClassifier) otherEnd, msgs);
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
			case UMLPackage.INTERFACE_REALIZATION__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.INTERFACE_REALIZATION__OWNED_COMMENT :
				return ((InternalEList) getOwnedComments()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.INTERFACE_REALIZATION__CLIENT_DEPENDENCY :
				return ((InternalEList) getClientDependencies()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.INTERFACE_REALIZATION__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.INTERFACE_REALIZATION__OWNING_TEMPLATE_PARAMETER :
				return basicSetOwningTemplateParameter(null, msgs);
			case UMLPackage.INTERFACE_REALIZATION__TEMPLATE_PARAMETER :
				return basicSetTemplateParameter(null, msgs);
			case UMLPackage.INTERFACE_REALIZATION__CLIENT :
				return ((InternalEList) getClients()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.INTERFACE_REALIZATION__MAPPING :
				return basicSetMapping(null, msgs);
			case UMLPackage.INTERFACE_REALIZATION__IMPLEMENTING_CLASSIFIER :
				return basicSetImplementingClassifier(null, msgs);
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
			case UMLPackage.INTERFACE_REALIZATION__OWNING_TEMPLATE_PARAMETER :
				return eInternalContainer().eInverseRemove(this,
					UMLPackage.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
					TemplateParameter.class, msgs);
			case UMLPackage.INTERFACE_REALIZATION__IMPLEMENTING_CLASSIFIER :
				return eInternalContainer().eInverseRemove(this,
					UMLPackage.BEHAVIORED_CLASSIFIER__INTERFACE_REALIZATION,
					BehavioredClassifier.class, msgs);
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
			case UMLPackage.INTERFACE_REALIZATION__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.INTERFACE_REALIZATION__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.INTERFACE_REALIZATION__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.INTERFACE_REALIZATION__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.INTERFACE_REALIZATION__NAME :
				return getName();
			case UMLPackage.INTERFACE_REALIZATION__VISIBILITY :
				return getVisibility();
			case UMLPackage.INTERFACE_REALIZATION__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.INTERFACE_REALIZATION__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.INTERFACE_REALIZATION__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.INTERFACE_REALIZATION__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.INTERFACE_REALIZATION__OWNING_TEMPLATE_PARAMETER :
				if (resolve)
					return getOwningTemplateParameter();
				return basicGetOwningTemplateParameter();
			case UMLPackage.INTERFACE_REALIZATION__TEMPLATE_PARAMETER :
				if (resolve)
					return getTemplateParameter();
				return basicGetTemplateParameter();
			case UMLPackage.INTERFACE_REALIZATION__RELATED_ELEMENT :
				return getRelatedElements();
			case UMLPackage.INTERFACE_REALIZATION__SOURCE :
				return getSources();
			case UMLPackage.INTERFACE_REALIZATION__TARGET :
				return getTargets();
			case UMLPackage.INTERFACE_REALIZATION__SUPPLIER :
				return getSuppliers();
			case UMLPackage.INTERFACE_REALIZATION__CLIENT :
				return getClients();
			case UMLPackage.INTERFACE_REALIZATION__MAPPING :
				if (resolve)
					return getMapping();
				return basicGetMapping();
			case UMLPackage.INTERFACE_REALIZATION__CONTRACT :
				if (resolve)
					return getContract();
				return basicGetContract();
			case UMLPackage.INTERFACE_REALIZATION__IMPLEMENTING_CLASSIFIER :
				if (resolve)
					return getImplementingClassifier();
				return basicGetImplementingClassifier();
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
			case UMLPackage.INTERFACE_REALIZATION__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.INTERFACE_REALIZATION__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.INTERFACE_REALIZATION__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.INTERFACE_REALIZATION__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.INTERFACE_REALIZATION__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.INTERFACE_REALIZATION__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.INTERFACE_REALIZATION__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.INTERFACE_REALIZATION__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.INTERFACE_REALIZATION__SUPPLIER :
				getSuppliers().clear();
				getSuppliers().addAll((Collection) newValue);
				return;
			case UMLPackage.INTERFACE_REALIZATION__CLIENT :
				getClients().clear();
				getClients().addAll((Collection) newValue);
				return;
			case UMLPackage.INTERFACE_REALIZATION__MAPPING :
				setMapping((OpaqueExpression) newValue);
				return;
			case UMLPackage.INTERFACE_REALIZATION__CONTRACT :
				setContract((Interface) newValue);
				return;
			case UMLPackage.INTERFACE_REALIZATION__IMPLEMENTING_CLASSIFIER :
				setImplementingClassifier((BehavioredClassifier) newValue);
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
			case UMLPackage.INTERFACE_REALIZATION__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.INTERFACE_REALIZATION__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.INTERFACE_REALIZATION__NAME :
				unsetName();
				return;
			case UMLPackage.INTERFACE_REALIZATION__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.INTERFACE_REALIZATION__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.INTERFACE_REALIZATION__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.INTERFACE_REALIZATION__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.INTERFACE_REALIZATION__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.INTERFACE_REALIZATION__SUPPLIER :
				getSuppliers().clear();
				return;
			case UMLPackage.INTERFACE_REALIZATION__CLIENT :
				getClients().clear();
				return;
			case UMLPackage.INTERFACE_REALIZATION__MAPPING :
				setMapping((OpaqueExpression) null);
				return;
			case UMLPackage.INTERFACE_REALIZATION__CONTRACT :
				setContract((Interface) null);
				return;
			case UMLPackage.INTERFACE_REALIZATION__IMPLEMENTING_CLASSIFIER :
				setImplementingClassifier((BehavioredClassifier) null);
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
			case UMLPackage.INTERFACE_REALIZATION__EANNOTATIONS :
				EList eAnnotations = (EList) eVirtualGet(UMLPackage.INTERFACE_REALIZATION__EANNOTATIONS);
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.INTERFACE_REALIZATION__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.INTERFACE_REALIZATION__OWNER :
				return isSetOwner();
			case UMLPackage.INTERFACE_REALIZATION__OWNED_COMMENT :
				EList ownedComment = (EList) eVirtualGet(UMLPackage.INTERFACE_REALIZATION__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.INTERFACE_REALIZATION__NAME :
				return isSetName();
			case UMLPackage.INTERFACE_REALIZATION__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.INTERFACE_REALIZATION__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.INTERFACE_REALIZATION__CLIENT_DEPENDENCY :
				EList clientDependency = (EList) eVirtualGet(UMLPackage.INTERFACE_REALIZATION__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.INTERFACE_REALIZATION__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.INTERFACE_REALIZATION__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.INTERFACE_REALIZATION__NAME_EXPRESSION) != null;
			case UMLPackage.INTERFACE_REALIZATION__OWNING_TEMPLATE_PARAMETER :
				return basicGetOwningTemplateParameter() != null;
			case UMLPackage.INTERFACE_REALIZATION__TEMPLATE_PARAMETER :
				return eVirtualGet(UMLPackage.INTERFACE_REALIZATION__TEMPLATE_PARAMETER) != null;
			case UMLPackage.INTERFACE_REALIZATION__RELATED_ELEMENT :
				return isSetRelatedElements();
			case UMLPackage.INTERFACE_REALIZATION__SOURCE :
				return isSetSources();
			case UMLPackage.INTERFACE_REALIZATION__TARGET :
				return isSetTargets();
			case UMLPackage.INTERFACE_REALIZATION__SUPPLIER :
				EList supplier = (EList) eVirtualGet(UMLPackage.INTERFACE_REALIZATION__SUPPLIER);
				return supplier != null && !supplier.isEmpty();
			case UMLPackage.INTERFACE_REALIZATION__CLIENT :
				EList client = (EList) eVirtualGet(UMLPackage.INTERFACE_REALIZATION__CLIENT);
				return client != null && !client.isEmpty();
			case UMLPackage.INTERFACE_REALIZATION__MAPPING :
				return eVirtualGet(UMLPackage.INTERFACE_REALIZATION__MAPPING) != null;
			case UMLPackage.INTERFACE_REALIZATION__CONTRACT :
				return eVirtualGet(UMLPackage.INTERFACE_REALIZATION__CONTRACT) != null;
			case UMLPackage.INTERFACE_REALIZATION__IMPLEMENTING_CLASSIFIER :
				return basicGetImplementingClassifier() != null;
		}
		return eDynamicIsSet(featureID);
	}

} //InterfaceRealizationImpl
