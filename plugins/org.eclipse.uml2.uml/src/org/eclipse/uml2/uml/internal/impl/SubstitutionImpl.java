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
 * $Id: SubstitutionImpl.java,v 1.4 2005/11/23 20:01:15 khussey Exp $
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

import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.OpaqueExpression;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.Substitution;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Substitution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.SubstitutionImpl#getTargets <em>Target</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.SubstitutionImpl#getSources <em>Source</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.SubstitutionImpl#getSuppliers <em>Supplier</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.SubstitutionImpl#getClients <em>Client</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.SubstitutionImpl#getContract <em>Contract</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.SubstitutionImpl#getSubstitutingClassifier <em>Substituting Classifier</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubstitutionImpl
		extends RealizationImpl
		implements Substitution {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubstitutionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.Literals.SUBSTITUTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getTargets() {
		List target = (List) eVirtualGet(UMLPackage.SUBSTITUTION__TARGET);
		if (target == null) {
			eVirtualSet(UMLPackage.SUBSTITUTION__TARGET,
				target = new DerivedUnionEObjectEList(Element.class, this,
					UMLPackage.SUBSTITUTION__TARGET, new int[]{
						UMLPackage.SUBSTITUTION__SUPPLIER,
						UMLPackage.SUBSTITUTION__CONTRACT}));
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getSources() {
		List source = (List) eVirtualGet(UMLPackage.SUBSTITUTION__SOURCE);
		if (source == null) {
			eVirtualSet(UMLPackage.SUBSTITUTION__SOURCE,
				source = new DerivedUnionEObjectEList(Element.class, this,
					UMLPackage.SUBSTITUTION__SOURCE, new int[]{
						UMLPackage.SUBSTITUTION__CLIENT,
						UMLPackage.SUBSTITUTION__SUBSTITUTING_CLASSIFIER}));
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getSuppliers() {
		List supplier = (List) eVirtualGet(UMLPackage.SUBSTITUTION__SUPPLIER);
		if (supplier == null) {
			eVirtualSet(UMLPackage.SUBSTITUTION__SUPPLIER,
				supplier = new SupersetEObjectResolvingEList(
					NamedElement.class, this,
					UMLPackage.SUBSTITUTION__SUPPLIER,
					new int[]{UMLPackage.SUBSTITUTION__CONTRACT}));
		}
		return supplier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getClients() {
		List client = (List) eVirtualGet(UMLPackage.SUBSTITUTION__CLIENT);
		if (client == null) {
			eVirtualSet(
				UMLPackage.SUBSTITUTION__CLIENT,
				client = new SupersetEObjectWithInverseResolvingEList.ManyInverse(
					NamedElement.class,
					this,
					UMLPackage.SUBSTITUTION__CLIENT,
					new int[]{UMLPackage.SUBSTITUTION__SUBSTITUTING_CLASSIFIER},
					UMLPackage.NAMED_ELEMENT__CLIENT_DEPENDENCY));
		}
		return client;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getContract() {
		Classifier contract = (Classifier) eVirtualGet(UMLPackage.SUBSTITUTION__CONTRACT);
		if (contract != null && contract.eIsProxy()) {
			InternalEObject oldContract = (InternalEObject) contract;
			contract = (Classifier) eResolveProxy(oldContract);
			if (contract != oldContract) {
				eVirtualSet(UMLPackage.SUBSTITUTION__CONTRACT, contract);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.SUBSTITUTION__CONTRACT, oldContract,
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
	public Classifier basicGetContract() {
		return (Classifier) eVirtualGet(UMLPackage.SUBSTITUTION__CONTRACT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContract(Classifier newContract) {
		if (newContract != null && !getSuppliers().contains(newContract)) {
			getSuppliers().add(newContract);
		}
		Classifier contract = newContract;
		Object oldContract = eVirtualSet(UMLPackage.SUBSTITUTION__CONTRACT,
			contract);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.SUBSTITUTION__CONTRACT,
				oldContract == EVIRTUAL_NO_VALUE
					? null
					: oldContract, contract));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getSubstitutingClassifier() {
		if (eContainerFeatureID != UMLPackage.SUBSTITUTION__SUBSTITUTING_CLASSIFIER)
			return null;
		return (Classifier) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier basicGetSubstitutingClassifier() {
		if (eContainerFeatureID != UMLPackage.SUBSTITUTION__SUBSTITUTING_CLASSIFIER)
			return null;
		return (Classifier) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubstitutingClassifier(Classifier newSubstitutingClassifier) {
		if (newSubstitutingClassifier != null
			&& !getClients().contains(newSubstitutingClassifier)) {
			getClients().add(newSubstitutingClassifier);
		}
		if (newSubstitutingClassifier != eInternalContainer()
			|| (eContainerFeatureID != UMLPackage.SUBSTITUTION__SUBSTITUTING_CLASSIFIER && newSubstitutingClassifier != null)) {
			if (EcoreUtil.isAncestor(this, (EObject) newSubstitutingClassifier))
				throw new IllegalArgumentException(
					"Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSubstitutingClassifier != null)
				msgs = ((InternalEObject) newSubstitutingClassifier)
					.eInverseAdd(this, UMLPackage.CLASSIFIER__SUBSTITUTION,
						Classifier.class, msgs);
			msgs = eBasicSetContainer(
				(InternalEObject) newSubstitutingClassifier,
				UMLPackage.SUBSTITUTION__SUBSTITUTING_CLASSIFIER, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.SUBSTITUTION__SUBSTITUTING_CLASSIFIER,
				newSubstitutingClassifier, newSubstitutingClassifier));

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
				case UMLPackage.SUBSTITUTION__EANNOTATIONS :
					return ((InternalEList) getEAnnotations()).basicAdd(
						otherEnd, msgs);
				case UMLPackage.SUBSTITUTION__CLIENT_DEPENDENCY :
					return ((InternalEList) getClientDependencies()).basicAdd(
						otherEnd, msgs);
				case UMLPackage.SUBSTITUTION__TEMPLATE_PARAMETER :
					TemplateParameter templateParameter = (TemplateParameter) eVirtualGet(UMLPackage.SUBSTITUTION__TEMPLATE_PARAMETER);
					if (templateParameter != null)
						msgs = ((InternalEObject) templateParameter)
							.eInverseRemove(
								this,
								UMLPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT,
								TemplateParameter.class, msgs);
					return basicSetTemplateParameter(
						(TemplateParameter) otherEnd, msgs);
				case UMLPackage.SUBSTITUTION__OWNING_TEMPLATE_PARAMETER :
					if (eInternalContainer() != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd,
						UMLPackage.SUBSTITUTION__OWNING_TEMPLATE_PARAMETER,
						msgs);
				case UMLPackage.SUBSTITUTION__CLIENT :
					return ((InternalEList) getClients()).basicAdd(otherEnd,
						msgs);
				case UMLPackage.SUBSTITUTION__SUBSTITUTING_CLASSIFIER :
					if (eInternalContainer() != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd,
						UMLPackage.SUBSTITUTION__SUBSTITUTING_CLASSIFIER, msgs);
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
				case UMLPackage.SUBSTITUTION__EANNOTATIONS :
					return ((InternalEList) getEAnnotations()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.SUBSTITUTION__OWNED_COMMENT :
					return ((InternalEList) getOwnedComments()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.SUBSTITUTION__CLIENT_DEPENDENCY :
					return ((InternalEList) getClientDependencies())
						.basicRemove(otherEnd, msgs);
				case UMLPackage.SUBSTITUTION__NAME_EXPRESSION :
					return basicSetNameExpression(null, msgs);
				case UMLPackage.SUBSTITUTION__TEMPLATE_PARAMETER :
					return basicSetTemplateParameter(null, msgs);
				case UMLPackage.SUBSTITUTION__OWNING_TEMPLATE_PARAMETER :
					return eBasicSetContainer(null,
						UMLPackage.SUBSTITUTION__OWNING_TEMPLATE_PARAMETER,
						msgs);
				case UMLPackage.SUBSTITUTION__CLIENT :
					return ((InternalEList) getClients()).basicRemove(otherEnd,
						msgs);
				case UMLPackage.SUBSTITUTION__MAPPING :
					return basicSetMapping(null, msgs);
				case UMLPackage.SUBSTITUTION__SUBSTITUTING_CLASSIFIER :
					return eBasicSetContainer(null,
						UMLPackage.SUBSTITUTION__SUBSTITUTING_CLASSIFIER, msgs);
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
				case UMLPackage.SUBSTITUTION__OWNING_TEMPLATE_PARAMETER :
					return eInternalContainer()
						.eInverseRemove(
							this,
							UMLPackage.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
							TemplateParameter.class, msgs);
				case UMLPackage.SUBSTITUTION__SUBSTITUTING_CLASSIFIER :
					return eInternalContainer().eInverseRemove(this,
						UMLPackage.CLASSIFIER__SUBSTITUTION, Classifier.class,
						msgs);
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
			case UMLPackage.SUBSTITUTION__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.SUBSTITUTION__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.SUBSTITUTION__OWNER :
				return getOwner();
			case UMLPackage.SUBSTITUTION__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.SUBSTITUTION__NAME :
				return getName();
			case UMLPackage.SUBSTITUTION__VISIBILITY :
				return getVisibility();
			case UMLPackage.SUBSTITUTION__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.SUBSTITUTION__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.SUBSTITUTION__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.SUBSTITUTION__NAME_EXPRESSION :
				return getNameExpression();
			case UMLPackage.SUBSTITUTION__TEMPLATE_PARAMETER :
				if (resolve)
					return getTemplateParameter();
				return basicGetTemplateParameter();
			case UMLPackage.SUBSTITUTION__OWNING_TEMPLATE_PARAMETER :
				if (resolve)
					return getOwningTemplateParameter();
				return basicGetOwningTemplateParameter();
			case UMLPackage.SUBSTITUTION__RELATED_ELEMENT :
				return getRelatedElements();
			case UMLPackage.SUBSTITUTION__SOURCE :
				return getSources();
			case UMLPackage.SUBSTITUTION__TARGET :
				return getTargets();
			case UMLPackage.SUBSTITUTION__SUPPLIER :
				return getSuppliers();
			case UMLPackage.SUBSTITUTION__CLIENT :
				return getClients();
			case UMLPackage.SUBSTITUTION__MAPPING :
				return getMapping();
			case UMLPackage.SUBSTITUTION__CONTRACT :
				if (resolve)
					return getContract();
				return basicGetContract();
			case UMLPackage.SUBSTITUTION__SUBSTITUTING_CLASSIFIER :
				if (resolve)
					return getSubstitutingClassifier();
				return basicGetSubstitutingClassifier();
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
			case UMLPackage.SUBSTITUTION__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.SUBSTITUTION__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.SUBSTITUTION__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.SUBSTITUTION__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.SUBSTITUTION__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.SUBSTITUTION__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.SUBSTITUTION__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.SUBSTITUTION__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.SUBSTITUTION__SUPPLIER :
				getSuppliers().clear();
				getSuppliers().addAll((Collection) newValue);
				return;
			case UMLPackage.SUBSTITUTION__CLIENT :
				getClients().clear();
				getClients().addAll((Collection) newValue);
				return;
			case UMLPackage.SUBSTITUTION__MAPPING :
				setMapping((OpaqueExpression) newValue);
				return;
			case UMLPackage.SUBSTITUTION__CONTRACT :
				setContract((Classifier) newValue);
				return;
			case UMLPackage.SUBSTITUTION__SUBSTITUTING_CLASSIFIER :
				setSubstitutingClassifier((Classifier) newValue);
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
			case UMLPackage.SUBSTITUTION__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.SUBSTITUTION__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.SUBSTITUTION__NAME :
				setName(NAME_EDEFAULT);
				return;
			case UMLPackage.SUBSTITUTION__VISIBILITY :
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UMLPackage.SUBSTITUTION__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.SUBSTITUTION__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.SUBSTITUTION__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.SUBSTITUTION__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.SUBSTITUTION__SUPPLIER :
				getSuppliers().clear();
				return;
			case UMLPackage.SUBSTITUTION__CLIENT :
				getClients().clear();
				return;
			case UMLPackage.SUBSTITUTION__MAPPING :
				setMapping((OpaqueExpression) null);
				return;
			case UMLPackage.SUBSTITUTION__CONTRACT :
				setContract((Classifier) null);
				return;
			case UMLPackage.SUBSTITUTION__SUBSTITUTING_CLASSIFIER :
				setSubstitutingClassifier((Classifier) null);
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
			case UMLPackage.SUBSTITUTION__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.SUBSTITUTION__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.SUBSTITUTION__OWNER :
				return isSetOwner();
			case UMLPackage.SUBSTITUTION__OWNED_COMMENT :
				List ownedComment = (List) eVirtualGet(UMLPackage.SUBSTITUTION__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.SUBSTITUTION__NAME :
				String name = (String) eVirtualGet(
					UMLPackage.SUBSTITUTION__NAME, NAME_EDEFAULT);
				return NAME_EDEFAULT == null
					? name != null
					: !NAME_EDEFAULT.equals(name);
			case UMLPackage.SUBSTITUTION__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.SUBSTITUTION__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.SUBSTITUTION__CLIENT_DEPENDENCY :
				List clientDependency = (List) eVirtualGet(UMLPackage.SUBSTITUTION__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.SUBSTITUTION__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.SUBSTITUTION__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.SUBSTITUTION__NAME_EXPRESSION) != null;
			case UMLPackage.SUBSTITUTION__TEMPLATE_PARAMETER :
				return eVirtualGet(UMLPackage.SUBSTITUTION__TEMPLATE_PARAMETER) != null;
			case UMLPackage.SUBSTITUTION__OWNING_TEMPLATE_PARAMETER :
				return basicGetOwningTemplateParameter() != null;
			case UMLPackage.SUBSTITUTION__RELATED_ELEMENT :
				return isSetRelatedElements();
			case UMLPackage.SUBSTITUTION__SOURCE :
				return isSetSources();
			case UMLPackage.SUBSTITUTION__TARGET :
				return isSetTargets();
			case UMLPackage.SUBSTITUTION__SUPPLIER :
				List supplier = (List) eVirtualGet(UMLPackage.SUBSTITUTION__SUPPLIER);
				return supplier != null && !supplier.isEmpty();
			case UMLPackage.SUBSTITUTION__CLIENT :
				List client = (List) eVirtualGet(UMLPackage.SUBSTITUTION__CLIENT);
				return client != null && !client.isEmpty();
			case UMLPackage.SUBSTITUTION__MAPPING :
				return eVirtualGet(UMLPackage.SUBSTITUTION__MAPPING) != null;
			case UMLPackage.SUBSTITUTION__CONTRACT :
				return eVirtualGet(UMLPackage.SUBSTITUTION__CONTRACT) != null;
			case UMLPackage.SUBSTITUTION__SUBSTITUTING_CLASSIFIER :
				return basicGetSubstitutingClassifier() != null;
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
			|| eIsSet(UMLPackage.SUBSTITUTION__CONTRACT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSources() {
		return super.isSetSources()
			|| eIsSet(UMLPackage.SUBSTITUTION__SUBSTITUTING_CLASSIFIER);
	}

} //SubstitutionImpl
