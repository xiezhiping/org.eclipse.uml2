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
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.SubsetSupersetEObjectResolvingEList;

import org.eclipse.uml2.uml.BehavioredClassifier;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Element;
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
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InterfaceRealizationImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InterfaceRealizationImpl#getSuppliers <em>Supplier</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InterfaceRealizationImpl#getClients <em>Client</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InterfaceRealizationImpl#getContract <em>Contract</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InterfaceRealizationImpl#getImplementingClassifier <em>Implementing Classifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterfaceRealizationImpl
		extends RealizationImpl
		implements InterfaceRealization {

	/**
	 * The cached value of the '{@link #getContract() <em>Contract</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContract()
	 * @generated
	 * @ordered
	 */
	protected Interface contract;

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
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.INTERFACE_REALIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	@Override
	public Element basicGetOwner() {
		BehavioredClassifier implementingClassifier = basicGetImplementingClassifier();
		if (implementingClassifier != null) {
			return implementingClassifier;
		}
		return super.basicGetOwner();
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
				NamedElement.class, this,
				UMLPackage.INTERFACE_REALIZATION__SUPPLIER, null,
				SUPPLIER_ESUBSETS);
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
		UMLPackage.INTERFACE_REALIZATION__CONTRACT};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NamedElement> getClients() {
		if (clients == null) {
			clients = new SubsetSupersetEObjectResolvingEList<NamedElement>(
				NamedElement.class, this,
				UMLPackage.INTERFACE_REALIZATION__CLIENT, null,
				CLIENT_ESUBSETS);
		}
		return clients;
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getClients() <em>Client</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClients()
	 * @generated
	 * @ordered
	 */
	protected static final int[] CLIENT_ESUBSETS = new int[]{
		UMLPackage.INTERFACE_REALIZATION__IMPLEMENTING_CLASSIFIER};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface getContract() {
		if (contract != null && contract.eIsProxy()) {
			InternalEObject oldContract = (InternalEObject) contract;
			contract = (Interface) eResolveProxy(oldContract);
			if (contract != oldContract) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.INTERFACE_REALIZATION__CONTRACT, oldContract,
						contract));
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
		return contract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContract(Interface newContract) {
		Interface oldContract = contract;
		contract = newContract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.INTERFACE_REALIZATION__CONTRACT, oldContract,
				contract));
		Resource.Internal eInternalResource = eInternalResource();
		if (eInternalResource == null || !eInternalResource.isLoading()) {
			if (newContract != null) {
				EList<NamedElement> suppliers = getSuppliers();
				if (!suppliers.contains(newContract)) {
					suppliers.add(newContract);
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
		if (eContainerFeatureID() != UMLPackage.INTERFACE_REALIZATION__IMPLEMENTING_CLASSIFIER)
			return null;
		return (BehavioredClassifier) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehavioredClassifier basicGetImplementingClassifier() {
		if (eContainerFeatureID() != UMLPackage.INTERFACE_REALIZATION__IMPLEMENTING_CLASSIFIER)
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
				EList<NamedElement> clients = getClients();
				if (!clients.contains(newImplementingClassifier)) {
					clients.add(newImplementingClassifier);
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
			|| (eContainerFeatureID() != UMLPackage.INTERFACE_REALIZATION__IMPLEMENTING_CLASSIFIER
				&& newImplementingClassifier != null)) {
			if (EcoreUtil.isAncestor(this, newImplementingClassifier))
				throw new IllegalArgumentException(
					"Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newImplementingClassifier != null)
				msgs = ((InternalEObject) newImplementingClassifier)
					.eInverseAdd(this,
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
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.INTERFACE_REALIZATION__EANNOTATIONS :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getEAnnotations())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.INTERFACE_REALIZATION__OWNING_TEMPLATE_PARAMETER :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningTemplateParameter(
					(TemplateParameter) otherEnd, msgs);
			case UMLPackage.INTERFACE_REALIZATION__TEMPLATE_PARAMETER :
				if (templateParameter != null)
					msgs = ((InternalEObject) templateParameter).eInverseRemove(
						this,
						UMLPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT,
						TemplateParameter.class, msgs);
				return basicSetTemplateParameter((TemplateParameter) otherEnd,
					msgs);
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
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.INTERFACE_REALIZATION__EANNOTATIONS :
				return ((InternalEList<?>) getEAnnotations())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.INTERFACE_REALIZATION__OWNED_COMMENT :
				return ((InternalEList<?>) getOwnedComments())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.INTERFACE_REALIZATION__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.INTERFACE_REALIZATION__OWNING_TEMPLATE_PARAMETER :
				return basicSetOwningTemplateParameter(null, msgs);
			case UMLPackage.INTERFACE_REALIZATION__TEMPLATE_PARAMETER :
				return basicSetTemplateParameter(null, msgs);
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
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(
			NotificationChain msgs) {
		switch (eContainerFeatureID()) {
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.INTERFACE_REALIZATION__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.INTERFACE_REALIZATION__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.INTERFACE_REALIZATION__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.INTERFACE_REALIZATION__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.INTERFACE_REALIZATION__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.INTERFACE_REALIZATION__NAME :
				return getName();
			case UMLPackage.INTERFACE_REALIZATION__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.INTERFACE_REALIZATION__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.INTERFACE_REALIZATION__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.INTERFACE_REALIZATION__VISIBILITY :
				return getVisibility();
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
			case UMLPackage.INTERFACE_REALIZATION__CLIENT :
				return getClients();
			case UMLPackage.INTERFACE_REALIZATION__SUPPLIER :
				return getSuppliers();
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UMLPackage.INTERFACE_REALIZATION__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations()
					.addAll((Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.INTERFACE_REALIZATION__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments()
					.addAll((Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.INTERFACE_REALIZATION__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.INTERFACE_REALIZATION__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.INTERFACE_REALIZATION__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.INTERFACE_REALIZATION__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.INTERFACE_REALIZATION__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.INTERFACE_REALIZATION__CLIENT :
				getClients().clear();
				getClients()
					.addAll((Collection<? extends NamedElement>) newValue);
				return;
			case UMLPackage.INTERFACE_REALIZATION__SUPPLIER :
				getSuppliers().clear();
				getSuppliers()
					.addAll((Collection<? extends NamedElement>) newValue);
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
	@Override
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
			case UMLPackage.INTERFACE_REALIZATION__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.INTERFACE_REALIZATION__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.INTERFACE_REALIZATION__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.INTERFACE_REALIZATION__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.INTERFACE_REALIZATION__CLIENT :
				getClients().clear();
				return;
			case UMLPackage.INTERFACE_REALIZATION__SUPPLIER :
				getSuppliers().clear();
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
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UMLPackage.INTERFACE_REALIZATION__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.INTERFACE_REALIZATION__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.INTERFACE_REALIZATION__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.INTERFACE_REALIZATION__OWNER :
				return isSetOwner();
			case UMLPackage.INTERFACE_REALIZATION__CLIENT_DEPENDENCY :
				return !getClientDependencies().isEmpty();
			case UMLPackage.INTERFACE_REALIZATION__NAME :
				return isSetName();
			case UMLPackage.INTERFACE_REALIZATION__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.INTERFACE_REALIZATION__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.INTERFACE_REALIZATION__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.INTERFACE_REALIZATION__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.INTERFACE_REALIZATION__OWNING_TEMPLATE_PARAMETER :
				return basicGetOwningTemplateParameter() != null;
			case UMLPackage.INTERFACE_REALIZATION__TEMPLATE_PARAMETER :
				return templateParameter != null;
			case UMLPackage.INTERFACE_REALIZATION__RELATED_ELEMENT :
				return isSetRelatedElements();
			case UMLPackage.INTERFACE_REALIZATION__SOURCE :
				return isSetSources();
			case UMLPackage.INTERFACE_REALIZATION__TARGET :
				return isSetTargets();
			case UMLPackage.INTERFACE_REALIZATION__CLIENT :
				return clients != null && !clients.isEmpty();
			case UMLPackage.INTERFACE_REALIZATION__SUPPLIER :
				return suppliers != null && !suppliers.isEmpty();
			case UMLPackage.INTERFACE_REALIZATION__MAPPING :
				return mapping != null;
			case UMLPackage.INTERFACE_REALIZATION__CONTRACT :
				return contract != null;
			case UMLPackage.INTERFACE_REALIZATION__IMPLEMENTING_CLASSIFIER :
				return basicGetImplementingClassifier() != null;
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOwner() {
		return super.isSetOwner() || eIsSet(
			UMLPackage.INTERFACE_REALIZATION__IMPLEMENTING_CLASSIFIER);
	}

} //InterfaceRealizationImpl
