/*
 * Copyright (c) 2003, 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 */
package org.eclipse.uml2.impl;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.uml2.Abstraction;
import org.eclipse.uml2.OpaqueExpression;
import org.eclipse.uml2.StringExpression;
import org.eclipse.uml2.TemplateParameter;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstraction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.AbstractionImpl#getMapping <em>Mapping</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AbstractionImpl extends DependencyImpl implements Abstraction {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getMapping() <em>Mapping</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapping()
	 * @generated
	 * @ordered
	 */
	protected OpaqueExpression mapping = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UML2Package.eINSTANCE.getAbstraction();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Mapping</b></em>' containment reference.
	 * <p>
	 * Subsets the following features:
	 * <ul>
	 *   <li>{@link org.eclipse.uml2.Element#getOwnedElements}</li>
	 * </ul>
	 * </p>
	 * @generated
	 */
	public OpaqueExpression getMapping() {
		return mapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMapping(OpaqueExpression newMapping, NotificationChain msgs) {
		OpaqueExpression oldMapping = mapping;
		mapping = newMapping;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UML2Package.ABSTRACTION__MAPPING, oldMapping, newMapping);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMapping(OpaqueExpression newMapping) {
		if (newMapping != mapping) {
			NotificationChain msgs = null;
			if (mapping != null)
				msgs = ((InternalEObject)mapping).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.ABSTRACTION__MAPPING, null, msgs);
			if (newMapping != null)
				msgs = ((InternalEObject)newMapping).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UML2Package.ABSTRACTION__MAPPING, null, msgs);
			msgs = basicSetMapping(newMapping, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.ABSTRACTION__MAPPING, newMapping, newMapping));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpaqueExpression createMapping(EClass eClass) {
		OpaqueExpression newMapping = (OpaqueExpression) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.CREATE, UML2Package.ABSTRACTION__MAPPING, null, newMapping));
		}
        setMapping(newMapping);
		return newMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Owned Element</b></em>' reference list, a derived union.
	 * The list contents are of type {@link org.eclipse.uml2.Element}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.Element#getOwner <em>Owner</em>}'.
	 * @generated
	 */
	public EList getOwnedElements() {
		// TODO: test this union getter
		if (!getCacheAdapter().containsKey(this, UML2Package.eINSTANCE.getElement_OwnedElement())) {
			Set union = new LinkedHashSet();
			union.addAll(super.getOwnedElements());
			if (null != getMapping()) {
				union.add(getMapping());
			}
			getCacheAdapter().put(
				this,
				UML2Package.eINSTANCE.getElement_OwnedElement(),
				new EcoreEList.UnmodifiableEList(this, 
					UML2Package.eINSTANCE.getElement_OwnedElement(),
					union.size(),
					union.toArray()));
		}
		return (EList) getCacheAdapter().get(this, UML2Package.eINSTANCE.getElement_OwnedElement());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UML2Package.ABSTRACTION__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicAdd(otherEnd, msgs);
				case UML2Package.ABSTRACTION__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicAdd(otherEnd, msgs);
				case UML2Package.ABSTRACTION__OWNED_TEMPLATE_SIGNATURE:
					if (ownedTemplateSignature != null)
						msgs = ((InternalEObject)ownedTemplateSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.ABSTRACTION__OWNED_TEMPLATE_SIGNATURE, null, msgs);
					return basicSetOwnedTemplateSignature((TemplateSignature)otherEnd, msgs);
				case UML2Package.ABSTRACTION__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicAdd(otherEnd, msgs);
				case UML2Package.ABSTRACTION__TEMPLATE_PARAMETER:
					if (templateParameter != null)
						msgs = ((InternalEObject)templateParameter).eInverseRemove(this, UML2Package.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
					return basicSetTemplateParameter((TemplateParameter)otherEnd, msgs);
				case UML2Package.ABSTRACTION__OWNING_PARAMETER:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, UML2Package.ABSTRACTION__OWNING_PARAMETER, msgs);
				case UML2Package.ABSTRACTION__CLIENT:
					return ((InternalEList)getClients()).basicAdd(otherEnd, msgs);
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
				case UML2Package.ABSTRACTION__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
				case UML2Package.ABSTRACTION__OWNED_COMMENT:
					return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
				case UML2Package.ABSTRACTION__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicRemove(otherEnd, msgs);
				case UML2Package.ABSTRACTION__OWNED_TEMPLATE_SIGNATURE:
					return basicSetOwnedTemplateSignature(null, msgs);
				case UML2Package.ABSTRACTION__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicRemove(otherEnd, msgs);
				case UML2Package.ABSTRACTION__NAME_EXPRESSION:
					return basicSetNameExpression(null, msgs);
				case UML2Package.ABSTRACTION__TEMPLATE_PARAMETER:
					return basicSetTemplateParameter(null, msgs);
				case UML2Package.ABSTRACTION__OWNING_PARAMETER:
					return eBasicSetContainer(null, UML2Package.ABSTRACTION__OWNING_PARAMETER, msgs);
				case UML2Package.ABSTRACTION__CLIENT:
					return ((InternalEList)getClients()).basicRemove(otherEnd, msgs);
				case UML2Package.ABSTRACTION__MAPPING:
					return basicSetMapping(null, msgs);
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
				case UML2Package.ABSTRACTION__OWNING_PARAMETER:
					return eContainer.eInverseRemove(this, UML2Package.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
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
			case UML2Package.ABSTRACTION__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.ABSTRACTION__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.ABSTRACTION__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.ABSTRACTION__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.ABSTRACTION__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.ABSTRACTION__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UML2Package.ABSTRACTION__NAME:
				return getName();
			case UML2Package.ABSTRACTION__QUALIFIED_NAME:
				return getQualifiedName();
			case UML2Package.ABSTRACTION__VISIBILITY:
				return getVisibility();
			case UML2Package.ABSTRACTION__CLIENT_DEPENDENCY:
				return getClientDependencies();
			case UML2Package.ABSTRACTION__NAME_EXPRESSION:
				return getNameExpression();
			case UML2Package.ABSTRACTION__TEMPLATE_PARAMETER:
				if (resolve) return getTemplateParameter();
				return basicGetTemplateParameter();
			case UML2Package.ABSTRACTION__OWNING_PARAMETER:
				return getOwningParameter();
			case UML2Package.ABSTRACTION__PACKAGEABLE_ELEMENT_VISIBILITY:
				return getPackageableElement_visibility();
			case UML2Package.ABSTRACTION__RELATED_ELEMENT:
				return getRelatedElements();
			case UML2Package.ABSTRACTION__SOURCE:
				return getSources();
			case UML2Package.ABSTRACTION__TARGET:
				return getTargets();
			case UML2Package.ABSTRACTION__CLIENT:
				return getClients();
			case UML2Package.ABSTRACTION__SUPPLIER:
				return getSuppliers();
			case UML2Package.ABSTRACTION__MAPPING:
				return getMapping();
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
			case UML2Package.ABSTRACTION__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.ABSTRACTION__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.ABSTRACTION__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection)newValue);
				return;
			case UML2Package.ABSTRACTION__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case UML2Package.ABSTRACTION__NAME:
				setName((String)newValue);
				return;
			case UML2Package.ABSTRACTION__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case UML2Package.ABSTRACTION__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection)newValue);
				return;
			case UML2Package.ABSTRACTION__NAME_EXPRESSION:
				setNameExpression((StringExpression)newValue);
				return;
			case UML2Package.ABSTRACTION__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)newValue);
				return;
			case UML2Package.ABSTRACTION__OWNING_PARAMETER:
				setOwningParameter((TemplateParameter)newValue);
				return;
			case UML2Package.ABSTRACTION__PACKAGEABLE_ELEMENT_VISIBILITY:
				setPackageableElement_visibility((VisibilityKind)newValue);
				return;
			case UML2Package.ABSTRACTION__CLIENT:
				getClients().clear();
				getClients().addAll((Collection)newValue);
				return;
			case UML2Package.ABSTRACTION__SUPPLIER:
				getSuppliers().clear();
				getSuppliers().addAll((Collection)newValue);
				return;
			case UML2Package.ABSTRACTION__MAPPING:
				setMapping((OpaqueExpression)newValue);
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
			case UML2Package.ABSTRACTION__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.ABSTRACTION__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.ABSTRACTION__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				return;
			case UML2Package.ABSTRACTION__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case UML2Package.ABSTRACTION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UML2Package.ABSTRACTION__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UML2Package.ABSTRACTION__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				return;
			case UML2Package.ABSTRACTION__NAME_EXPRESSION:
				setNameExpression((StringExpression)null);
				return;
			case UML2Package.ABSTRACTION__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)null);
				return;
			case UML2Package.ABSTRACTION__OWNING_PARAMETER:
				setOwningParameter(null);
				return;
			case UML2Package.ABSTRACTION__PACKAGEABLE_ELEMENT_VISIBILITY:
				setPackageableElement_visibility(PACKAGEABLE_ELEMENT_VISIBILITY_EDEFAULT);
				return;
			case UML2Package.ABSTRACTION__CLIENT:
				getClients().clear();
				return;
			case UML2Package.ABSTRACTION__SUPPLIER:
				getSuppliers().clear();
				return;
			case UML2Package.ABSTRACTION__MAPPING:
				setMapping((OpaqueExpression)null);
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
			case UML2Package.ABSTRACTION__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.ABSTRACTION__OWNED_ELEMENT:
				return !getOwnedElements().isEmpty();
			case UML2Package.ABSTRACTION__OWNER:
				return basicGetOwner() != null;
			case UML2Package.ABSTRACTION__OWNED_COMMENT:
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.ABSTRACTION__TEMPLATE_BINDING:
				return templateBinding != null && !templateBinding.isEmpty();
			case UML2Package.ABSTRACTION__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case UML2Package.ABSTRACTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.ABSTRACTION__QUALIFIED_NAME:
				return !"".equals(getQualifiedName()); //$NON-NLS-1$
			case UML2Package.ABSTRACTION__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case UML2Package.ABSTRACTION__CLIENT_DEPENDENCY:
				return clientDependency != null && !clientDependency.isEmpty();
			case UML2Package.ABSTRACTION__NAME_EXPRESSION:
				return nameExpression != null;
			case UML2Package.ABSTRACTION__TEMPLATE_PARAMETER:
				return templateParameter != null;
			case UML2Package.ABSTRACTION__OWNING_PARAMETER:
				return getOwningParameter() != null;
			case UML2Package.ABSTRACTION__PACKAGEABLE_ELEMENT_VISIBILITY:
				return packageableElement_visibility != PACKAGEABLE_ELEMENT_VISIBILITY_EDEFAULT;
			case UML2Package.ABSTRACTION__RELATED_ELEMENT:
				return !getRelatedElements().isEmpty();
			case UML2Package.ABSTRACTION__SOURCE:
				return !getSources().isEmpty();
			case UML2Package.ABSTRACTION__TARGET:
				return !getTargets().isEmpty();
			case UML2Package.ABSTRACTION__CLIENT:
				return client != null && !client.isEmpty();
			case UML2Package.ABSTRACTION__SUPPLIER:
				return supplier != null && !supplier.isEmpty();
			case UML2Package.ABSTRACTION__MAPPING:
				return mapping != null;
		}
		return eDynamicIsSet(eFeature);
	}

} //AbstractionImpl
