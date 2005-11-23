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
 * $Id: AbstractionImpl.java,v 1.4 2005/11/23 20:01:18 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.Abstraction;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.OpaqueExpression;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstraction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.AbstractionImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.AbstractionImpl#getMapping <em>Mapping</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AbstractionImpl
		extends DependencyImpl
		implements Abstraction {

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
		return UMLPackage.Literals.ABSTRACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getOwnedElements() {
		List ownedElement = (List) eVirtualGet(UMLPackage.ABSTRACTION__OWNED_ELEMENT);
		if (ownedElement == null) {
			eVirtualSet(UMLPackage.ABSTRACTION__OWNED_ELEMENT,
				ownedElement = new DerivedUnionEObjectEList(Element.class,
					this, UMLPackage.ABSTRACTION__OWNED_ELEMENT, new int[]{
						UMLPackage.ABSTRACTION__OWNED_COMMENT,
						UMLPackage.ABSTRACTION__NAME_EXPRESSION,
						UMLPackage.ABSTRACTION__MAPPING}));
		}
		return ownedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpaqueExpression getMapping() {
		return (OpaqueExpression) eVirtualGet(UMLPackage.ABSTRACTION__MAPPING);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMapping(OpaqueExpression newMapping,
			NotificationChain msgs) {
		Object oldMapping = eVirtualSet(UMLPackage.ABSTRACTION__MAPPING,
			newMapping);
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET, UMLPackage.ABSTRACTION__MAPPING,
				oldMapping == EVIRTUAL_NO_VALUE
					? null
					: oldMapping, newMapping);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMapping(OpaqueExpression newMapping) {
		OpaqueExpression mapping = (OpaqueExpression) eVirtualGet(UMLPackage.ABSTRACTION__MAPPING);
		if (newMapping != mapping) {
			NotificationChain msgs = null;
			if (mapping != null)
				msgs = ((InternalEObject) mapping).eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE - UMLPackage.ABSTRACTION__MAPPING,
					null, msgs);
			if (newMapping != null)
				msgs = ((InternalEObject) newMapping).eInverseAdd(this,
					EOPPOSITE_FEATURE_BASE - UMLPackage.ABSTRACTION__MAPPING,
					null, msgs);
			msgs = basicSetMapping(newMapping, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.ABSTRACTION__MAPPING, newMapping, newMapping));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpaqueExpression createMapping() {
		OpaqueExpression newMapping = UMLFactory.eINSTANCE
			.createOpaqueExpression();
		setMapping(newMapping);
		return newMapping;
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
				case UMLPackage.ABSTRACTION__EANNOTATIONS :
					return ((InternalEList) getEAnnotations()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.ABSTRACTION__OWNED_COMMENT :
					return ((InternalEList) getOwnedComments()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.ABSTRACTION__CLIENT_DEPENDENCY :
					return ((InternalEList) getClientDependencies())
						.basicRemove(otherEnd, msgs);
				case UMLPackage.ABSTRACTION__NAME_EXPRESSION :
					return basicSetNameExpression(null, msgs);
				case UMLPackage.ABSTRACTION__TEMPLATE_PARAMETER :
					return basicSetTemplateParameter(null, msgs);
				case UMLPackage.ABSTRACTION__OWNING_TEMPLATE_PARAMETER :
					return eBasicSetContainer(null,
						UMLPackage.ABSTRACTION__OWNING_TEMPLATE_PARAMETER, msgs);
				case UMLPackage.ABSTRACTION__CLIENT :
					return ((InternalEList) getClients()).basicRemove(otherEnd,
						msgs);
				case UMLPackage.ABSTRACTION__MAPPING :
					return basicSetMapping(null, msgs);
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.ABSTRACTION__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.ABSTRACTION__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.ABSTRACTION__OWNER :
				return getOwner();
			case UMLPackage.ABSTRACTION__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.ABSTRACTION__NAME :
				return getName();
			case UMLPackage.ABSTRACTION__VISIBILITY :
				return getVisibility();
			case UMLPackage.ABSTRACTION__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.ABSTRACTION__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.ABSTRACTION__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.ABSTRACTION__NAME_EXPRESSION :
				return getNameExpression();
			case UMLPackage.ABSTRACTION__TEMPLATE_PARAMETER :
				if (resolve)
					return getTemplateParameter();
				return basicGetTemplateParameter();
			case UMLPackage.ABSTRACTION__OWNING_TEMPLATE_PARAMETER :
				if (resolve)
					return getOwningTemplateParameter();
				return basicGetOwningTemplateParameter();
			case UMLPackage.ABSTRACTION__RELATED_ELEMENT :
				return getRelatedElements();
			case UMLPackage.ABSTRACTION__SOURCE :
				return getSources();
			case UMLPackage.ABSTRACTION__TARGET :
				return getTargets();
			case UMLPackage.ABSTRACTION__SUPPLIER :
				return getSuppliers();
			case UMLPackage.ABSTRACTION__CLIENT :
				return getClients();
			case UMLPackage.ABSTRACTION__MAPPING :
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
			case UMLPackage.ABSTRACTION__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.ABSTRACTION__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.ABSTRACTION__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.ABSTRACTION__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.ABSTRACTION__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.ABSTRACTION__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.ABSTRACTION__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.ABSTRACTION__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.ABSTRACTION__SUPPLIER :
				getSuppliers().clear();
				getSuppliers().addAll((Collection) newValue);
				return;
			case UMLPackage.ABSTRACTION__CLIENT :
				getClients().clear();
				getClients().addAll((Collection) newValue);
				return;
			case UMLPackage.ABSTRACTION__MAPPING :
				setMapping((OpaqueExpression) newValue);
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
			case UMLPackage.ABSTRACTION__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.ABSTRACTION__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.ABSTRACTION__NAME :
				setName(NAME_EDEFAULT);
				return;
			case UMLPackage.ABSTRACTION__VISIBILITY :
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UMLPackage.ABSTRACTION__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.ABSTRACTION__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.ABSTRACTION__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.ABSTRACTION__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.ABSTRACTION__SUPPLIER :
				getSuppliers().clear();
				return;
			case UMLPackage.ABSTRACTION__CLIENT :
				getClients().clear();
				return;
			case UMLPackage.ABSTRACTION__MAPPING :
				setMapping((OpaqueExpression) null);
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
			case UMLPackage.ABSTRACTION__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.ABSTRACTION__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.ABSTRACTION__OWNER :
				return isSetOwner();
			case UMLPackage.ABSTRACTION__OWNED_COMMENT :
				List ownedComment = (List) eVirtualGet(UMLPackage.ABSTRACTION__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.ABSTRACTION__NAME :
				String name = (String) eVirtualGet(
					UMLPackage.ABSTRACTION__NAME, NAME_EDEFAULT);
				return NAME_EDEFAULT == null
					? name != null
					: !NAME_EDEFAULT.equals(name);
			case UMLPackage.ABSTRACTION__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.ABSTRACTION__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.ABSTRACTION__CLIENT_DEPENDENCY :
				List clientDependency = (List) eVirtualGet(UMLPackage.ABSTRACTION__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.ABSTRACTION__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.ABSTRACTION__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.ABSTRACTION__NAME_EXPRESSION) != null;
			case UMLPackage.ABSTRACTION__TEMPLATE_PARAMETER :
				return eVirtualGet(UMLPackage.ABSTRACTION__TEMPLATE_PARAMETER) != null;
			case UMLPackage.ABSTRACTION__OWNING_TEMPLATE_PARAMETER :
				return basicGetOwningTemplateParameter() != null;
			case UMLPackage.ABSTRACTION__RELATED_ELEMENT :
				return isSetRelatedElements();
			case UMLPackage.ABSTRACTION__SOURCE :
				return isSetSources();
			case UMLPackage.ABSTRACTION__TARGET :
				return isSetTargets();
			case UMLPackage.ABSTRACTION__SUPPLIER :
				List supplier = (List) eVirtualGet(UMLPackage.ABSTRACTION__SUPPLIER);
				return supplier != null && !supplier.isEmpty();
			case UMLPackage.ABSTRACTION__CLIENT :
				List client = (List) eVirtualGet(UMLPackage.ABSTRACTION__CLIENT);
				return client != null && !client.isEmpty();
			case UMLPackage.ABSTRACTION__MAPPING :
				return eVirtualGet(UMLPackage.ABSTRACTION__MAPPING) != null;
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| eIsSet(UMLPackage.ABSTRACTION__MAPPING);
	}

} //AbstractionImpl
