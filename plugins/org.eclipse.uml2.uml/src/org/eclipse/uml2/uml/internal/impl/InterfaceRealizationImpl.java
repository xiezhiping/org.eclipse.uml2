/*
 * Copyright (c) 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: InterfaceRealizationImpl.java,v 1.4 2005/11/23 20:01:16 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;
import org.eclipse.uml2.common.util.SupersetEObjectResolvingEList;
import org.eclipse.uml2.common.util.SupersetEObjectWithInverseResolvingEList;

import org.eclipse.uml2.uml.BehavioredClassifier;
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
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InterfaceRealizationImpl#getTargets <em>Target</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InterfaceRealizationImpl#getSources <em>Source</em>}</li>
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
	public List getTargets() {
		List target = (List) eVirtualGet(UMLPackage.INTERFACE_REALIZATION__TARGET);
		if (target == null) {
			eVirtualSet(UMLPackage.INTERFACE_REALIZATION__TARGET,
				target = new DerivedUnionEObjectEList(Element.class, this,
					UMLPackage.INTERFACE_REALIZATION__TARGET, new int[]{
						UMLPackage.INTERFACE_REALIZATION__SUPPLIER,
						UMLPackage.INTERFACE_REALIZATION__CONTRACT}));
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getSources() {
		List source = (List) eVirtualGet(UMLPackage.INTERFACE_REALIZATION__SOURCE);
		if (source == null) {
			eVirtualSet(
				UMLPackage.INTERFACE_REALIZATION__SOURCE,
				source = new DerivedUnionEObjectEList(
					Element.class,
					this,
					UMLPackage.INTERFACE_REALIZATION__SOURCE,
					new int[]{
						UMLPackage.INTERFACE_REALIZATION__CLIENT,
						UMLPackage.INTERFACE_REALIZATION__IMPLEMENTING_CLASSIFIER}));
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getSuppliers() {
		List supplier = (List) eVirtualGet(UMLPackage.INTERFACE_REALIZATION__SUPPLIER);
		if (supplier == null) {
			eVirtualSet(UMLPackage.INTERFACE_REALIZATION__SUPPLIER,
				supplier = new SupersetEObjectResolvingEList(
					NamedElement.class, this,
					UMLPackage.INTERFACE_REALIZATION__SUPPLIER,
					new int[]{UMLPackage.INTERFACE_REALIZATION__CONTRACT}));
		}
		return supplier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getClients() {
		List client = (List) eVirtualGet(UMLPackage.INTERFACE_REALIZATION__CLIENT);
		if (client == null) {
			eVirtualSet(
				UMLPackage.INTERFACE_REALIZATION__CLIENT,
				client = new SupersetEObjectWithInverseResolvingEList.ManyInverse(
					NamedElement.class,
					this,
					UMLPackage.INTERFACE_REALIZATION__CLIENT,
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
		if (newContract != null && !getSuppliers().contains(newContract)) {
			getSuppliers().add(newContract);
		}
		Interface contract = newContract;
		Object oldContract = eVirtualSet(
			UMLPackage.INTERFACE_REALIZATION__CONTRACT, contract);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.INTERFACE_REALIZATION__CONTRACT,
				oldContract == EVIRTUAL_NO_VALUE
					? null
					: oldContract, contract));

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
	public void setImplementingClassifier(
			BehavioredClassifier newImplementingClassifier) {
		if (newImplementingClassifier != null
			&& !getClients().contains(newImplementingClassifier)) {
			getClients().add(newImplementingClassifier);
		}
		if (newImplementingClassifier != eInternalContainer()
			|| (eContainerFeatureID != UMLPackage.INTERFACE_REALIZATION__IMPLEMENTING_CLASSIFIER && newImplementingClassifier != null)) {
			if (EcoreUtil.isAncestor(this, (EObject) newImplementingClassifier))
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
			msgs = eBasicSetContainer(
				(InternalEObject) newImplementingClassifier,
				UMLPackage.INTERFACE_REALIZATION__IMPLEMENTING_CLASSIFIER, msgs);
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
			int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UMLPackage.INTERFACE_REALIZATION__EANNOTATIONS :
					return ((InternalEList) getEAnnotations()).basicAdd(
						otherEnd, msgs);
				case UMLPackage.INTERFACE_REALIZATION__CLIENT_DEPENDENCY :
					return ((InternalEList) getClientDependencies()).basicAdd(
						otherEnd, msgs);
				case UMLPackage.INTERFACE_REALIZATION__TEMPLATE_PARAMETER :
					TemplateParameter templateParameter = (TemplateParameter) eVirtualGet(UMLPackage.INTERFACE_REALIZATION__TEMPLATE_PARAMETER);
					if (templateParameter != null)
						msgs = ((InternalEObject) templateParameter)
							.eInverseRemove(
								this,
								UMLPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT,
								TemplateParameter.class, msgs);
					return basicSetTemplateParameter(
						(TemplateParameter) otherEnd, msgs);
				case UMLPackage.INTERFACE_REALIZATION__OWNING_TEMPLATE_PARAMETER :
					if (eInternalContainer() != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(
						otherEnd,
						UMLPackage.INTERFACE_REALIZATION__OWNING_TEMPLATE_PARAMETER,
						msgs);
				case UMLPackage.INTERFACE_REALIZATION__CLIENT :
					return ((InternalEList) getClients()).basicAdd(otherEnd,
						msgs);
				case UMLPackage.INTERFACE_REALIZATION__IMPLEMENTING_CLASSIFIER :
					if (eInternalContainer() != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(
						otherEnd,
						UMLPackage.INTERFACE_REALIZATION__IMPLEMENTING_CLASSIFIER,
						msgs);
				default :
					return eDynamicInverseAdd(otherEnd, featureID, baseClass,
						msgs);
			}
		}
		if (eInternalContainer() != null)
			msgs = eBasicRemoveFromContainer(msgs);
		return eBasicSetContainer(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UMLPackage.INTERFACE_REALIZATION__EANNOTATIONS :
					return ((InternalEList) getEAnnotations()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.INTERFACE_REALIZATION__OWNED_COMMENT :
					return ((InternalEList) getOwnedComments()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.INTERFACE_REALIZATION__CLIENT_DEPENDENCY :
					return ((InternalEList) getClientDependencies())
						.basicRemove(otherEnd, msgs);
				case UMLPackage.INTERFACE_REALIZATION__NAME_EXPRESSION :
					return basicSetNameExpression(null, msgs);
				case UMLPackage.INTERFACE_REALIZATION__TEMPLATE_PARAMETER :
					return basicSetTemplateParameter(null, msgs);
				case UMLPackage.INTERFACE_REALIZATION__OWNING_TEMPLATE_PARAMETER :
					return eBasicSetContainer(
						null,
						UMLPackage.INTERFACE_REALIZATION__OWNING_TEMPLATE_PARAMETER,
						msgs);
				case UMLPackage.INTERFACE_REALIZATION__CLIENT :
					return ((InternalEList) getClients()).basicRemove(otherEnd,
						msgs);
				case UMLPackage.INTERFACE_REALIZATION__MAPPING :
					return basicSetMapping(null, msgs);
				case UMLPackage.INTERFACE_REALIZATION__IMPLEMENTING_CLASSIFIER :
					return eBasicSetContainer(
						null,
						UMLPackage.INTERFACE_REALIZATION__IMPLEMENTING_CLASSIFIER,
						msgs);
				default :
					return eDynamicInverseRemove(otherEnd, featureID,
						baseClass, msgs);
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
				case UMLPackage.INTERFACE_REALIZATION__OWNING_TEMPLATE_PARAMETER :
					return eInternalContainer()
						.eInverseRemove(
							this,
							UMLPackage.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
							TemplateParameter.class, msgs);
				case UMLPackage.INTERFACE_REALIZATION__IMPLEMENTING_CLASSIFIER :
					return eInternalContainer()
						.eInverseRemove(
							this,
							UMLPackage.BEHAVIORED_CLASSIFIER__INTERFACE_REALIZATION,
							BehavioredClassifier.class, msgs);
				default :
					return eDynamicBasicRemoveFromContainer(msgs);
			}
		}
		return eInternalContainer().eInverseRemove(this,
			EOPPOSITE_FEATURE_BASE - eContainerFeatureID, null, msgs);
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
				return getOwner();
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
				return getNameExpression();
			case UMLPackage.INTERFACE_REALIZATION__TEMPLATE_PARAMETER :
				if (resolve)
					return getTemplateParameter();
				return basicGetTemplateParameter();
			case UMLPackage.INTERFACE_REALIZATION__OWNING_TEMPLATE_PARAMETER :
				if (resolve)
					return getOwningTemplateParameter();
				return basicGetOwningTemplateParameter();
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
				return getMapping();
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
			case UMLPackage.INTERFACE_REALIZATION__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.INTERFACE_REALIZATION__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) newValue);
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
				setName(NAME_EDEFAULT);
				return;
			case UMLPackage.INTERFACE_REALIZATION__VISIBILITY :
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UMLPackage.INTERFACE_REALIZATION__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.INTERFACE_REALIZATION__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.INTERFACE_REALIZATION__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.INTERFACE_REALIZATION__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) null);
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
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.INTERFACE_REALIZATION__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.INTERFACE_REALIZATION__OWNER :
				return isSetOwner();
			case UMLPackage.INTERFACE_REALIZATION__OWNED_COMMENT :
				List ownedComment = (List) eVirtualGet(UMLPackage.INTERFACE_REALIZATION__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.INTERFACE_REALIZATION__NAME :
				String name = (String) eVirtualGet(
					UMLPackage.INTERFACE_REALIZATION__NAME, NAME_EDEFAULT);
				return NAME_EDEFAULT == null
					? name != null
					: !NAME_EDEFAULT.equals(name);
			case UMLPackage.INTERFACE_REALIZATION__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.INTERFACE_REALIZATION__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.INTERFACE_REALIZATION__CLIENT_DEPENDENCY :
				List clientDependency = (List) eVirtualGet(UMLPackage.INTERFACE_REALIZATION__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.INTERFACE_REALIZATION__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.INTERFACE_REALIZATION__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.INTERFACE_REALIZATION__NAME_EXPRESSION) != null;
			case UMLPackage.INTERFACE_REALIZATION__TEMPLATE_PARAMETER :
				return eVirtualGet(UMLPackage.INTERFACE_REALIZATION__TEMPLATE_PARAMETER) != null;
			case UMLPackage.INTERFACE_REALIZATION__OWNING_TEMPLATE_PARAMETER :
				return basicGetOwningTemplateParameter() != null;
			case UMLPackage.INTERFACE_REALIZATION__RELATED_ELEMENT :
				return isSetRelatedElements();
			case UMLPackage.INTERFACE_REALIZATION__SOURCE :
				return isSetSources();
			case UMLPackage.INTERFACE_REALIZATION__TARGET :
				return isSetTargets();
			case UMLPackage.INTERFACE_REALIZATION__SUPPLIER :
				List supplier = (List) eVirtualGet(UMLPackage.INTERFACE_REALIZATION__SUPPLIER);
				return supplier != null && !supplier.isEmpty();
			case UMLPackage.INTERFACE_REALIZATION__CLIENT :
				List client = (List) eVirtualGet(UMLPackage.INTERFACE_REALIZATION__CLIENT);
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTargets() {
		return super.isSetTargets()
			|| eIsSet(UMLPackage.INTERFACE_REALIZATION__CONTRACT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSources() {
		return super.isSetSources()
			|| eIsSet(UMLPackage.INTERFACE_REALIZATION__IMPLEMENTING_CLASSIFIER);
	}

} //InterfaceRealizationImpl
