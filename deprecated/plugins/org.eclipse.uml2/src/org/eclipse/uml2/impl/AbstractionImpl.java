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
 * $Id: AbstractionImpl.java,v 1.20 2005/11/23 13:25:33 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.Abstraction;
import org.eclipse.uml2.Element;
import org.eclipse.uml2.OpaqueExpression;
import org.eclipse.uml2.StringExpression;
import org.eclipse.uml2.TemplateParameter;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.VisibilityKind;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstraction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.AbstractionImpl#getOwnedElements <em>Owned Element</em>}</li>
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
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

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
	 * @generated
	 */
	public EList getOwnedElements() {
		EList ownedElement = (EList)eVirtualGet(UML2Package.ABSTRACTION__OWNED_ELEMENT);
		if (ownedElement == null) {
			eVirtualSet(UML2Package.ABSTRACTION__OWNED_ELEMENT, ownedElement = new DerivedUnionEObjectEList(Element.class, this, UML2Package.ABSTRACTION__OWNED_ELEMENT, new int[] {UML2Package.ABSTRACTION__OWNED_COMMENT, UML2Package.ABSTRACTION__TEMPLATE_BINDING, UML2Package.ABSTRACTION__OWNED_TEMPLATE_SIGNATURE, UML2Package.ABSTRACTION__NAME_EXPRESSION, UML2Package.ABSTRACTION__MAPPING}));
		}
		return ownedElement;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| eIsSet(UML2Package.ABSTRACTION__MAPPING);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpaqueExpression getMapping() {
		return (OpaqueExpression)eVirtualGet(UML2Package.ABSTRACTION__MAPPING);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMapping(OpaqueExpression newMapping, NotificationChain msgs) {
		Object oldMapping = eVirtualSet(UML2Package.ABSTRACTION__MAPPING, newMapping);
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UML2Package.ABSTRACTION__MAPPING, oldMapping == EVIRTUAL_NO_VALUE ? null : oldMapping, newMapping);
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
		OpaqueExpression mapping = (OpaqueExpression)eVirtualGet(UML2Package.ABSTRACTION__MAPPING);
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
	 * @generated NOT
	 */
	public OpaqueExpression createMapping(EClass eClass) {
		OpaqueExpression newMapping = (OpaqueExpression) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.ABSTRACTION__MAPPING, null, newMapping));
		}
		setMapping(newMapping);
		return newMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public OpaqueExpression createMapping() {
		OpaqueExpression newMapping = UML2Factory.eINSTANCE.createOpaqueExpression();
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.ABSTRACTION__MAPPING, null, newMapping));
		}
		setMapping(newMapping);
		return newMapping;
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
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
		return eDynamicGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
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
		eDynamicSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
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
				setOwningParameter((TemplateParameter)null);
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
		eDynamicUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UML2Package.ABSTRACTION__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.ABSTRACTION__OWNED_ELEMENT:
				return isSetOwnedElements();
			case UML2Package.ABSTRACTION__OWNER:
				return isSetOwner();
			case UML2Package.ABSTRACTION__OWNED_COMMENT:
				EList ownedComment = (EList)eVirtualGet(UML2Package.ABSTRACTION__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.ABSTRACTION__TEMPLATE_BINDING:
				EList templateBinding = (EList)eVirtualGet(UML2Package.ABSTRACTION__TEMPLATE_BINDING);
				return templateBinding != null && !templateBinding.isEmpty();
			case UML2Package.ABSTRACTION__OWNED_TEMPLATE_SIGNATURE:
				return eVirtualGet(UML2Package.ABSTRACTION__OWNED_TEMPLATE_SIGNATURE) != null;
			case UML2Package.ABSTRACTION__NAME:
				String name = (String)eVirtualGet(UML2Package.ABSTRACTION__NAME, NAME_EDEFAULT);
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.ABSTRACTION__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UML2Package.ABSTRACTION__VISIBILITY:
				return isSetVisibility();
			case UML2Package.ABSTRACTION__CLIENT_DEPENDENCY:
				EList clientDependency = (EList)eVirtualGet(UML2Package.ABSTRACTION__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UML2Package.ABSTRACTION__NAME_EXPRESSION:
				return eVirtualGet(UML2Package.ABSTRACTION__NAME_EXPRESSION) != null;
			case UML2Package.ABSTRACTION__TEMPLATE_PARAMETER:
				return eVirtualGet(UML2Package.ABSTRACTION__TEMPLATE_PARAMETER) != null;
			case UML2Package.ABSTRACTION__OWNING_PARAMETER:
				return getOwningParameter() != null;
			case UML2Package.ABSTRACTION__PACKAGEABLE_ELEMENT_VISIBILITY:
				return isSetPackageableElement_visibility();
			case UML2Package.ABSTRACTION__RELATED_ELEMENT:
				return isSetRelatedElements();
			case UML2Package.ABSTRACTION__SOURCE:
				return isSetSources();
			case UML2Package.ABSTRACTION__TARGET:
				return isSetTargets();
			case UML2Package.ABSTRACTION__CLIENT:
				EList client = (EList)eVirtualGet(UML2Package.ABSTRACTION__CLIENT);
				return client != null && !client.isEmpty();
			case UML2Package.ABSTRACTION__SUPPLIER:
				EList supplier = (EList)eVirtualGet(UML2Package.ABSTRACTION__SUPPLIER);
				return supplier != null && !supplier.isEmpty();
			case UML2Package.ABSTRACTION__MAPPING:
				return eVirtualGet(UML2Package.ABSTRACTION__MAPPING) != null;
		}
		return eDynamicIsSet(featureID);
	}


} //AbstractionImpl
