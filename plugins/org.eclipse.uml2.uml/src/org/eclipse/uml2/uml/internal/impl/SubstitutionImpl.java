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

import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Comment;
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
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.SubstitutionImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.SubstitutionImpl#getSuppliers <em>Supplier</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.SubstitutionImpl#getClients <em>Client</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.SubstitutionImpl#getContract <em>Contract</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.SubstitutionImpl#getSubstitutingClassifier <em>Substituting Classifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubstitutionImpl
		extends RealizationImpl
		implements Substitution {

	/**
	 * The cached value of the '{@link #getContract() <em>Contract</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContract()
	 * @generated
	 * @ordered
	 */
	protected Classifier contract;

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
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.SUBSTITUTION;
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
		Classifier substitutingClassifier = basicGetSubstitutingClassifier();
		if (substitutingClassifier != null) {
			return substitutingClassifier;
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
				NamedElement.class, this, UMLPackage.SUBSTITUTION__SUPPLIER,
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
		UMLPackage.SUBSTITUTION__CONTRACT};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NamedElement> getClients() {
		if (clients == null) {
			clients = new SubsetSupersetEObjectResolvingEList<NamedElement>(
				NamedElement.class, this, UMLPackage.SUBSTITUTION__CLIENT, null,
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
		UMLPackage.SUBSTITUTION__SUBSTITUTING_CLASSIFIER};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getContract() {
		if (contract != null && contract.eIsProxy()) {
			InternalEObject oldContract = (InternalEObject) contract;
			contract = (Classifier) eResolveProxy(oldContract);
			if (contract != oldContract) {
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
		return contract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContract(Classifier newContract) {
		Classifier oldContract = contract;
		contract = newContract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.SUBSTITUTION__CONTRACT, oldContract, contract));
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
	public Classifier getSubstitutingClassifier() {
		if (eContainerFeatureID() != UMLPackage.SUBSTITUTION__SUBSTITUTING_CLASSIFIER)
			return null;
		return (Classifier) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier basicGetSubstitutingClassifier() {
		if (eContainerFeatureID() != UMLPackage.SUBSTITUTION__SUBSTITUTING_CLASSIFIER)
			return null;
		return (Classifier) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubstitutingClassifier(
			Classifier newSubstitutingClassifier, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newSubstitutingClassifier,
			UMLPackage.SUBSTITUTION__SUBSTITUTING_CLASSIFIER, msgs);
		Resource.Internal eInternalResource = eInternalResource();
		if (eInternalResource == null || !eInternalResource.isLoading()) {
			if (newSubstitutingClassifier != null) {
				EList<NamedElement> clients = getClients();
				if (!clients.contains(newSubstitutingClassifier)) {
					clients.add(newSubstitutingClassifier);
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
	public void setSubstitutingClassifier(
			Classifier newSubstitutingClassifier) {
		if (newSubstitutingClassifier != eInternalContainer()
			|| (eContainerFeatureID() != UMLPackage.SUBSTITUTION__SUBSTITUTING_CLASSIFIER
				&& newSubstitutingClassifier != null)) {
			if (EcoreUtil.isAncestor(this, newSubstitutingClassifier))
				throw new IllegalArgumentException(
					"Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSubstitutingClassifier != null)
				msgs = ((InternalEObject) newSubstitutingClassifier)
					.eInverseAdd(this, UMLPackage.CLASSIFIER__SUBSTITUTION,
						Classifier.class, msgs);
			msgs = basicSetSubstitutingClassifier(newSubstitutingClassifier,
				msgs);
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
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.SUBSTITUTION__EANNOTATIONS :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getEAnnotations())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.SUBSTITUTION__OWNING_TEMPLATE_PARAMETER :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningTemplateParameter(
					(TemplateParameter) otherEnd, msgs);
			case UMLPackage.SUBSTITUTION__TEMPLATE_PARAMETER :
				if (templateParameter != null)
					msgs = ((InternalEObject) templateParameter).eInverseRemove(
						this,
						UMLPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT,
						TemplateParameter.class, msgs);
				return basicSetTemplateParameter((TemplateParameter) otherEnd,
					msgs);
			case UMLPackage.SUBSTITUTION__SUBSTITUTING_CLASSIFIER :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSubstitutingClassifier((Classifier) otherEnd,
					msgs);
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
			case UMLPackage.SUBSTITUTION__EANNOTATIONS :
				return ((InternalEList<?>) getEAnnotations())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.SUBSTITUTION__OWNED_COMMENT :
				return ((InternalEList<?>) getOwnedComments())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.SUBSTITUTION__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.SUBSTITUTION__OWNING_TEMPLATE_PARAMETER :
				return basicSetOwningTemplateParameter(null, msgs);
			case UMLPackage.SUBSTITUTION__TEMPLATE_PARAMETER :
				return basicSetTemplateParameter(null, msgs);
			case UMLPackage.SUBSTITUTION__MAPPING :
				return basicSetMapping(null, msgs);
			case UMLPackage.SUBSTITUTION__SUBSTITUTING_CLASSIFIER :
				return basicSetSubstitutingClassifier(null, msgs);
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
			case UMLPackage.SUBSTITUTION__OWNING_TEMPLATE_PARAMETER :
				return eInternalContainer().eInverseRemove(this,
					UMLPackage.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
					TemplateParameter.class, msgs);
			case UMLPackage.SUBSTITUTION__SUBSTITUTING_CLASSIFIER :
				return eInternalContainer().eInverseRemove(this,
					UMLPackage.CLASSIFIER__SUBSTITUTION, Classifier.class,
					msgs);
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
			case UMLPackage.SUBSTITUTION__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.SUBSTITUTION__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.SUBSTITUTION__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.SUBSTITUTION__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.SUBSTITUTION__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.SUBSTITUTION__NAME :
				return getName();
			case UMLPackage.SUBSTITUTION__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.SUBSTITUTION__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.SUBSTITUTION__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.SUBSTITUTION__VISIBILITY :
				return getVisibility();
			case UMLPackage.SUBSTITUTION__OWNING_TEMPLATE_PARAMETER :
				if (resolve)
					return getOwningTemplateParameter();
				return basicGetOwningTemplateParameter();
			case UMLPackage.SUBSTITUTION__TEMPLATE_PARAMETER :
				if (resolve)
					return getTemplateParameter();
				return basicGetTemplateParameter();
			case UMLPackage.SUBSTITUTION__RELATED_ELEMENT :
				return getRelatedElements();
			case UMLPackage.SUBSTITUTION__SOURCE :
				return getSources();
			case UMLPackage.SUBSTITUTION__TARGET :
				return getTargets();
			case UMLPackage.SUBSTITUTION__CLIENT :
				return getClients();
			case UMLPackage.SUBSTITUTION__SUPPLIER :
				return getSuppliers();
			case UMLPackage.SUBSTITUTION__MAPPING :
				if (resolve)
					return getMapping();
				return basicGetMapping();
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UMLPackage.SUBSTITUTION__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations()
					.addAll((Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.SUBSTITUTION__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments()
					.addAll((Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.SUBSTITUTION__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.SUBSTITUTION__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.SUBSTITUTION__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.SUBSTITUTION__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.SUBSTITUTION__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.SUBSTITUTION__CLIENT :
				getClients().clear();
				getClients()
					.addAll((Collection<? extends NamedElement>) newValue);
				return;
			case UMLPackage.SUBSTITUTION__SUPPLIER :
				getSuppliers().clear();
				getSuppliers()
					.addAll((Collection<? extends NamedElement>) newValue);
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
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case UMLPackage.SUBSTITUTION__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.SUBSTITUTION__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.SUBSTITUTION__NAME :
				unsetName();
				return;
			case UMLPackage.SUBSTITUTION__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.SUBSTITUTION__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.SUBSTITUTION__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.SUBSTITUTION__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.SUBSTITUTION__CLIENT :
				getClients().clear();
				return;
			case UMLPackage.SUBSTITUTION__SUPPLIER :
				getSuppliers().clear();
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
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UMLPackage.SUBSTITUTION__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.SUBSTITUTION__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.SUBSTITUTION__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.SUBSTITUTION__OWNER :
				return isSetOwner();
			case UMLPackage.SUBSTITUTION__CLIENT_DEPENDENCY :
				return !getClientDependencies().isEmpty();
			case UMLPackage.SUBSTITUTION__NAME :
				return isSetName();
			case UMLPackage.SUBSTITUTION__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.SUBSTITUTION__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.SUBSTITUTION__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.SUBSTITUTION__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.SUBSTITUTION__OWNING_TEMPLATE_PARAMETER :
				return basicGetOwningTemplateParameter() != null;
			case UMLPackage.SUBSTITUTION__TEMPLATE_PARAMETER :
				return templateParameter != null;
			case UMLPackage.SUBSTITUTION__RELATED_ELEMENT :
				return isSetRelatedElements();
			case UMLPackage.SUBSTITUTION__SOURCE :
				return isSetSources();
			case UMLPackage.SUBSTITUTION__TARGET :
				return isSetTargets();
			case UMLPackage.SUBSTITUTION__CLIENT :
				return clients != null && !clients.isEmpty();
			case UMLPackage.SUBSTITUTION__SUPPLIER :
				return suppliers != null && !suppliers.isEmpty();
			case UMLPackage.SUBSTITUTION__MAPPING :
				return mapping != null;
			case UMLPackage.SUBSTITUTION__CONTRACT :
				return contract != null;
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
	@Override
	public boolean isSetOwner() {
		return super.isSetOwner()
			|| eIsSet(UMLPackage.SUBSTITUTION__SUBSTITUTING_CLASSIFIER);
	}

} //SubstitutionImpl
