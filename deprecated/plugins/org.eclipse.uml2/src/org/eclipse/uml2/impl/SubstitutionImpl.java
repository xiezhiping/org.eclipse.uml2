/*
 * Copyright (c) 2003, 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *
 * $Id: SubstitutionImpl.java,v 1.5 2004/06/02 05:02:26 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.uml2.Classifier;
import org.eclipse.uml2.Component;
import org.eclipse.uml2.NamedElement;
import org.eclipse.uml2.OpaqueExpression;
import org.eclipse.uml2.StringExpression;
import org.eclipse.uml2.Substitution;
import org.eclipse.uml2.TemplateParameter;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.VisibilityKind;
import org.eclipse.uml2.internal.util.SupersetEObjectResolvingEList;
import org.eclipse.uml2.internal.util.SupersetEObjectWithInverseResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Substitution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.SubstitutionImpl#getContract <em>Contract</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.SubstitutionImpl#getSubstitutingClassifier <em>Substituting Classifier</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubstitutionImpl extends RealizationImpl implements Substitution {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getContract() <em>Contract</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContract()
	 * @generated
	 * @ordered
	 */
	protected Classifier contract = null;

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
		return UML2Package.eINSTANCE.getSubstitution();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getContract() {
		Classifier contract = basicGetContract();
		return contract == null ? null : (Classifier)eResolveProxy((InternalEObject)contract);
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
		if (null != newContract && !getSuppliers().contains(newContract)) {
			getSuppliers().add(newContract);
		}
		Classifier oldContract = contract;
		contract = newContract;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.SUBSTITUTION__CONTRACT, oldContract, contract));
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getSubstitutingClassifier() {
		if (eContainerFeatureID != UML2Package.SUBSTITUTION__SUBSTITUTING_CLASSIFIER) {
			return null;
		}
		return (Classifier) eContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubstitutingClassifier(Classifier newSubstitutingClassifier) {
		if (null != newSubstitutingClassifier && !getClients().contains(newSubstitutingClassifier)) {
			getClients().add(newSubstitutingClassifier);
		}
		EObject oldSubstitutingClassifier = eContainer;
		if (eContainer != newSubstitutingClassifier || (eContainerFeatureID != UML2Package.SUBSTITUTION__SUBSTITUTING_CLASSIFIER && null != newSubstitutingClassifier)) {
			if (EcoreUtil.isAncestor(this, newSubstitutingClassifier)) {
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			}
			NotificationChain msgs = null;
			if (null != eContainer) {
				msgs = eBasicRemoveFromContainer(msgs);
			}
			if (null != newSubstitutingClassifier) {
				msgs = ((InternalEObject) newSubstitutingClassifier).eInverseAdd(this, UML2Package.CLASSIFIER__SUBSTITUTION, Classifier.class, msgs);
			}
			msgs = eBasicSetContainer((InternalEObject) newSubstitutingClassifier, UML2Package.SUBSTITUTION__SUBSTITUTING_CLASSIFIER, msgs);
			if (null != msgs) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.SUBSTITUTION__SUBSTITUTING_CLASSIFIER, newSubstitutingClassifier, newSubstitutingClassifier));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSuppliers() {
		if (supplier == null) {
			supplier = new SupersetEObjectResolvingEList(NamedElement.class, this, UML2Package.SUBSTITUTION__SUPPLIER, new int[] {UML2Package.SUBSTITUTION__REALIZING_CLASSIFIER, UML2Package.SUBSTITUTION__CONTRACT});
		}
		return supplier;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getTargets() {
		EList target = (EList) getCacheAdapter().get(this, UML2Package.eINSTANCE.getDirectedRelationship_Target());

		if (null == target) {
			Set union = new LinkedHashSet();
			union.addAll(super.getTargets());
			if (null != getContract()) {
				union.add(getContract());
			}

			target = new EcoreEList.UnmodifiableEList(this, UML2Package.eINSTANCE.getDirectedRelationship_Target(), union.size(), union.toArray());
			getCacheAdapter().put(this, UML2Package.eINSTANCE.getDirectedRelationship_Target(), target);
		}

		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getClients() {
		if (client == null) {
			client = new SupersetEObjectWithInverseResolvingEList.ManyInverse(NamedElement.class, this, UML2Package.SUBSTITUTION__CLIENT, new int[] {UML2Package.SUBSTITUTION__ABSTRACTION, UML2Package.SUBSTITUTION__SUBSTITUTING_CLASSIFIER}, UML2Package.NAMED_ELEMENT__CLIENT_DEPENDENCY);
		}
		return client;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSources() {
		EList source = (EList) getCacheAdapter().get(this, UML2Package.eINSTANCE.getDirectedRelationship_Source());

		if (null == source) {
			Set union = new LinkedHashSet();
			union.addAll(super.getSources());
			if (null != getSubstitutingClassifier()) {
				union.add(getSubstitutingClassifier());
			}

			source = new EcoreEList.UnmodifiableEList(this, UML2Package.eINSTANCE.getDirectedRelationship_Source(), union.size(), union.toArray());
			getCacheAdapter().put(this, UML2Package.eINSTANCE.getDirectedRelationship_Source(), source);
		}

		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UML2Package.SUBSTITUTION__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicAdd(otherEnd, msgs);
				case UML2Package.SUBSTITUTION__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicAdd(otherEnd, msgs);
				case UML2Package.SUBSTITUTION__OWNED_TEMPLATE_SIGNATURE:
					if (ownedTemplateSignature != null)
						msgs = ((InternalEObject)ownedTemplateSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.SUBSTITUTION__OWNED_TEMPLATE_SIGNATURE, null, msgs);
					return basicSetOwnedTemplateSignature((TemplateSignature)otherEnd, msgs);
				case UML2Package.SUBSTITUTION__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicAdd(otherEnd, msgs);
				case UML2Package.SUBSTITUTION__TEMPLATE_PARAMETER:
					if (templateParameter != null)
						msgs = ((InternalEObject)templateParameter).eInverseRemove(this, UML2Package.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
					return basicSetTemplateParameter((TemplateParameter)otherEnd, msgs);
				case UML2Package.SUBSTITUTION__OWNING_PARAMETER:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, UML2Package.SUBSTITUTION__OWNING_PARAMETER, msgs);
				case UML2Package.SUBSTITUTION__CLIENT:
					return ((InternalEList)getClients()).basicAdd(otherEnd, msgs);
				case UML2Package.SUBSTITUTION__ABSTRACTION:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, UML2Package.SUBSTITUTION__ABSTRACTION, msgs);
				case UML2Package.SUBSTITUTION__SUBSTITUTING_CLASSIFIER:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, UML2Package.SUBSTITUTION__SUBSTITUTING_CLASSIFIER, msgs);
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
				case UML2Package.SUBSTITUTION__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
				case UML2Package.SUBSTITUTION__OWNED_COMMENT:
					return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
				case UML2Package.SUBSTITUTION__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicRemove(otherEnd, msgs);
				case UML2Package.SUBSTITUTION__OWNED_TEMPLATE_SIGNATURE:
					return basicSetOwnedTemplateSignature(null, msgs);
				case UML2Package.SUBSTITUTION__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicRemove(otherEnd, msgs);
				case UML2Package.SUBSTITUTION__NAME_EXPRESSION:
					return basicSetNameExpression(null, msgs);
				case UML2Package.SUBSTITUTION__TEMPLATE_PARAMETER:
					return basicSetTemplateParameter(null, msgs);
				case UML2Package.SUBSTITUTION__OWNING_PARAMETER:
					return eBasicSetContainer(null, UML2Package.SUBSTITUTION__OWNING_PARAMETER, msgs);
				case UML2Package.SUBSTITUTION__CLIENT:
					return ((InternalEList)getClients()).basicRemove(otherEnd, msgs);
				case UML2Package.SUBSTITUTION__MAPPING:
					return basicSetMapping(null, msgs);
				case UML2Package.SUBSTITUTION__ABSTRACTION:
					return eBasicSetContainer(null, UML2Package.SUBSTITUTION__ABSTRACTION, msgs);
				case UML2Package.SUBSTITUTION__SUBSTITUTING_CLASSIFIER:
					return eBasicSetContainer(null, UML2Package.SUBSTITUTION__SUBSTITUTING_CLASSIFIER, msgs);
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
				case UML2Package.SUBSTITUTION__OWNING_PARAMETER:
					return eContainer.eInverseRemove(this, UML2Package.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
				case UML2Package.SUBSTITUTION__ABSTRACTION:
					return eContainer.eInverseRemove(this, UML2Package.COMPONENT__REALIZATION, Component.class, msgs);
				case UML2Package.SUBSTITUTION__SUBSTITUTING_CLASSIFIER:
					return eContainer.eInverseRemove(this, UML2Package.CLASSIFIER__SUBSTITUTION, Classifier.class, msgs);
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
			case UML2Package.SUBSTITUTION__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.SUBSTITUTION__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.SUBSTITUTION__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.SUBSTITUTION__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.SUBSTITUTION__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.SUBSTITUTION__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UML2Package.SUBSTITUTION__NAME:
				return getName();
			case UML2Package.SUBSTITUTION__QUALIFIED_NAME:
				return getQualifiedName();
			case UML2Package.SUBSTITUTION__VISIBILITY:
				return getVisibility();
			case UML2Package.SUBSTITUTION__CLIENT_DEPENDENCY:
				return getClientDependencies();
			case UML2Package.SUBSTITUTION__NAME_EXPRESSION:
				return getNameExpression();
			case UML2Package.SUBSTITUTION__TEMPLATE_PARAMETER:
				if (resolve) return getTemplateParameter();
				return basicGetTemplateParameter();
			case UML2Package.SUBSTITUTION__OWNING_PARAMETER:
				return getOwningParameter();
			case UML2Package.SUBSTITUTION__PACKAGEABLE_ELEMENT_VISIBILITY:
				return getPackageableElement_visibility();
			case UML2Package.SUBSTITUTION__RELATED_ELEMENT:
				return getRelatedElements();
			case UML2Package.SUBSTITUTION__SOURCE:
				return getSources();
			case UML2Package.SUBSTITUTION__TARGET:
				return getTargets();
			case UML2Package.SUBSTITUTION__CLIENT:
				return getClients();
			case UML2Package.SUBSTITUTION__SUPPLIER:
				return getSuppliers();
			case UML2Package.SUBSTITUTION__MAPPING:
				return getMapping();
			case UML2Package.SUBSTITUTION__ABSTRACTION:
				return getAbstraction();
			case UML2Package.SUBSTITUTION__REALIZING_CLASSIFIER:
				if (resolve) return getRealizingClassifier();
				return basicGetRealizingClassifier();
			case UML2Package.SUBSTITUTION__CONTRACT:
				if (resolve) return getContract();
				return basicGetContract();
			case UML2Package.SUBSTITUTION__SUBSTITUTING_CLASSIFIER:
				return getSubstitutingClassifier();
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
			case UML2Package.SUBSTITUTION__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.SUBSTITUTION__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.SUBSTITUTION__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection)newValue);
				return;
			case UML2Package.SUBSTITUTION__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case UML2Package.SUBSTITUTION__NAME:
				setName((String)newValue);
				return;
			case UML2Package.SUBSTITUTION__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case UML2Package.SUBSTITUTION__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection)newValue);
				return;
			case UML2Package.SUBSTITUTION__NAME_EXPRESSION:
				setNameExpression((StringExpression)newValue);
				return;
			case UML2Package.SUBSTITUTION__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)newValue);
				return;
			case UML2Package.SUBSTITUTION__OWNING_PARAMETER:
				setOwningParameter((TemplateParameter)newValue);
				return;
			case UML2Package.SUBSTITUTION__PACKAGEABLE_ELEMENT_VISIBILITY:
				setPackageableElement_visibility((VisibilityKind)newValue);
				return;
			case UML2Package.SUBSTITUTION__CLIENT:
				getClients().clear();
				getClients().addAll((Collection)newValue);
				return;
			case UML2Package.SUBSTITUTION__SUPPLIER:
				getSuppliers().clear();
				getSuppliers().addAll((Collection)newValue);
				return;
			case UML2Package.SUBSTITUTION__MAPPING:
				setMapping((OpaqueExpression)newValue);
				return;
			case UML2Package.SUBSTITUTION__ABSTRACTION:
				setAbstraction((Component)newValue);
				return;
			case UML2Package.SUBSTITUTION__REALIZING_CLASSIFIER:
				setRealizingClassifier((Classifier)newValue);
				return;
			case UML2Package.SUBSTITUTION__CONTRACT:
				setContract((Classifier)newValue);
				return;
			case UML2Package.SUBSTITUTION__SUBSTITUTING_CLASSIFIER:
				setSubstitutingClassifier((Classifier)newValue);
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
			case UML2Package.SUBSTITUTION__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.SUBSTITUTION__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.SUBSTITUTION__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				return;
			case UML2Package.SUBSTITUTION__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case UML2Package.SUBSTITUTION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UML2Package.SUBSTITUTION__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UML2Package.SUBSTITUTION__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				return;
			case UML2Package.SUBSTITUTION__NAME_EXPRESSION:
				setNameExpression((StringExpression)null);
				return;
			case UML2Package.SUBSTITUTION__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)null);
				return;
			case UML2Package.SUBSTITUTION__OWNING_PARAMETER:
				setOwningParameter(null);
				return;
			case UML2Package.SUBSTITUTION__PACKAGEABLE_ELEMENT_VISIBILITY:
				setPackageableElement_visibility(PACKAGEABLE_ELEMENT_VISIBILITY_EDEFAULT);
				return;
			case UML2Package.SUBSTITUTION__CLIENT:
				getClients().clear();
				return;
			case UML2Package.SUBSTITUTION__SUPPLIER:
				getSuppliers().clear();
				return;
			case UML2Package.SUBSTITUTION__MAPPING:
				setMapping((OpaqueExpression)null);
				return;
			case UML2Package.SUBSTITUTION__ABSTRACTION:
				setAbstraction(null);
				return;
			case UML2Package.SUBSTITUTION__REALIZING_CLASSIFIER:
				setRealizingClassifier((Classifier)null);
				return;
			case UML2Package.SUBSTITUTION__CONTRACT:
				setContract((Classifier)null);
				return;
			case UML2Package.SUBSTITUTION__SUBSTITUTING_CLASSIFIER:
				setSubstitutingClassifier(null);
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
			case UML2Package.SUBSTITUTION__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.SUBSTITUTION__OWNED_ELEMENT:
				return !getOwnedElements().isEmpty();
			case UML2Package.SUBSTITUTION__OWNER:
				return basicGetOwner() != null;
			case UML2Package.SUBSTITUTION__OWNED_COMMENT:
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.SUBSTITUTION__TEMPLATE_BINDING:
				return templateBinding != null && !templateBinding.isEmpty();
			case UML2Package.SUBSTITUTION__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case UML2Package.SUBSTITUTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.SUBSTITUTION__QUALIFIED_NAME:
				return !"".equals(getQualifiedName()); //$NON-NLS-1$
			case UML2Package.SUBSTITUTION__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case UML2Package.SUBSTITUTION__CLIENT_DEPENDENCY:
				return clientDependency != null && !clientDependency.isEmpty();
			case UML2Package.SUBSTITUTION__NAME_EXPRESSION:
				return nameExpression != null;
			case UML2Package.SUBSTITUTION__TEMPLATE_PARAMETER:
				return templateParameter != null;
			case UML2Package.SUBSTITUTION__OWNING_PARAMETER:
				return getOwningParameter() != null;
			case UML2Package.SUBSTITUTION__PACKAGEABLE_ELEMENT_VISIBILITY:
				return packageableElement_visibility != PACKAGEABLE_ELEMENT_VISIBILITY_EDEFAULT;
			case UML2Package.SUBSTITUTION__RELATED_ELEMENT:
				return !getRelatedElements().isEmpty();
			case UML2Package.SUBSTITUTION__SOURCE:
				return !getSources().isEmpty();
			case UML2Package.SUBSTITUTION__TARGET:
				return !getTargets().isEmpty();
			case UML2Package.SUBSTITUTION__CLIENT:
				return client != null && !client.isEmpty();
			case UML2Package.SUBSTITUTION__SUPPLIER:
				return supplier != null && !supplier.isEmpty();
			case UML2Package.SUBSTITUTION__MAPPING:
				return mapping != null;
			case UML2Package.SUBSTITUTION__ABSTRACTION:
				return getAbstraction() != null;
			case UML2Package.SUBSTITUTION__REALIZING_CLASSIFIER:
				return realizingClassifier != null;
			case UML2Package.SUBSTITUTION__CONTRACT:
				return contract != null;
			case UML2Package.SUBSTITUTION__SUBSTITUTING_CLASSIFIER:
				return getSubstitutingClassifier() != null;
		}
		return eDynamicIsSet(eFeature);
	}

} //SubstitutionImpl
