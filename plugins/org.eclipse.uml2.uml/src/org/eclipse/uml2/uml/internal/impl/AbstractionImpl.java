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

import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.Abstraction;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.OpaqueExpression;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstraction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.AbstractionImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.AbstractionImpl#getMapping <em>Mapping</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AbstractionImpl
		extends DependencyImpl
		implements Abstraction {

	/**
	 * The cached value of the '{@link #getMapping() <em>Mapping</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapping()
	 * @generated
	 * @ordered
	 */
	protected OpaqueExpression mapping;

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
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.ABSTRACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Element> getOwnedElements() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			@SuppressWarnings("unchecked")
			EList<Element> ownedElements = (EList<Element>) cache.get(eResource,
				this, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
			if (ownedElements == null) {
				cache.put(eResource, this,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT,
					ownedElements = new DerivedUnionEObjectEList<Element>(
						Element.class, this,
						UMLPackage.ABSTRACTION__OWNED_ELEMENT,
						OWNED_ELEMENT_ESUBSETS));
			}
			return ownedElements;
		}
		return new DerivedUnionEObjectEList<Element>(Element.class, this,
			UMLPackage.ABSTRACTION__OWNED_ELEMENT, OWNED_ELEMENT_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpaqueExpression getMapping() {
		if (mapping != null && mapping.eIsProxy()) {
			InternalEObject oldMapping = (InternalEObject) mapping;
			mapping = (OpaqueExpression) eResolveProxy(oldMapping);
			if (mapping != oldMapping) {
				InternalEObject newMapping = (InternalEObject) mapping;
				NotificationChain msgs = oldMapping.eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE - UMLPackage.ABSTRACTION__MAPPING,
					null, null);
				if (newMapping.eInternalContainer() == null) {
					msgs = newMapping.eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- UMLPackage.ABSTRACTION__MAPPING, null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.ABSTRACTION__MAPPING, oldMapping, mapping));
			}
		}
		return mapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpaqueExpression basicGetMapping() {
		return mapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMapping(OpaqueExpression newMapping,
			NotificationChain msgs) {
		OpaqueExpression oldMapping = mapping;
		mapping = newMapping;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET, UMLPackage.ABSTRACTION__MAPPING, oldMapping,
				newMapping);
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
	public OpaqueExpression createMapping(String name, Type type) {
		OpaqueExpression newMapping = (OpaqueExpression) create(
			UMLPackage.Literals.OPAQUE_EXPRESSION);
		setMapping(newMapping);
		if (name != null)
			newMapping.setName(name);
		if (type != null)
			newMapping.setType(type);
		return newMapping;
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
			case UMLPackage.ABSTRACTION__EANNOTATIONS :
				return ((InternalEList<?>) getEAnnotations())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.ABSTRACTION__OWNED_COMMENT :
				return ((InternalEList<?>) getOwnedComments())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.ABSTRACTION__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.ABSTRACTION__OWNING_TEMPLATE_PARAMETER :
				return basicSetOwningTemplateParameter(null, msgs);
			case UMLPackage.ABSTRACTION__TEMPLATE_PARAMETER :
				return basicSetTemplateParameter(null, msgs);
			case UMLPackage.ABSTRACTION__MAPPING :
				return basicSetMapping(null, msgs);
		}
		return eDynamicInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.ABSTRACTION__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.ABSTRACTION__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.ABSTRACTION__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.ABSTRACTION__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.ABSTRACTION__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.ABSTRACTION__NAME :
				return getName();
			case UMLPackage.ABSTRACTION__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.ABSTRACTION__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.ABSTRACTION__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.ABSTRACTION__VISIBILITY :
				return getVisibility();
			case UMLPackage.ABSTRACTION__OWNING_TEMPLATE_PARAMETER :
				if (resolve)
					return getOwningTemplateParameter();
				return basicGetOwningTemplateParameter();
			case UMLPackage.ABSTRACTION__TEMPLATE_PARAMETER :
				if (resolve)
					return getTemplateParameter();
				return basicGetTemplateParameter();
			case UMLPackage.ABSTRACTION__RELATED_ELEMENT :
				return getRelatedElements();
			case UMLPackage.ABSTRACTION__SOURCE :
				return getSources();
			case UMLPackage.ABSTRACTION__TARGET :
				return getTargets();
			case UMLPackage.ABSTRACTION__CLIENT :
				return getClients();
			case UMLPackage.ABSTRACTION__SUPPLIER :
				return getSuppliers();
			case UMLPackage.ABSTRACTION__MAPPING :
				if (resolve)
					return getMapping();
				return basicGetMapping();
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
			case UMLPackage.ABSTRACTION__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations()
					.addAll((Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.ABSTRACTION__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments()
					.addAll((Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.ABSTRACTION__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.ABSTRACTION__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.ABSTRACTION__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.ABSTRACTION__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.ABSTRACTION__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.ABSTRACTION__CLIENT :
				getClients().clear();
				getClients()
					.addAll((Collection<? extends NamedElement>) newValue);
				return;
			case UMLPackage.ABSTRACTION__SUPPLIER :
				getSuppliers().clear();
				getSuppliers()
					.addAll((Collection<? extends NamedElement>) newValue);
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
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case UMLPackage.ABSTRACTION__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.ABSTRACTION__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.ABSTRACTION__NAME :
				unsetName();
				return;
			case UMLPackage.ABSTRACTION__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.ABSTRACTION__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.ABSTRACTION__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.ABSTRACTION__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.ABSTRACTION__CLIENT :
				getClients().clear();
				return;
			case UMLPackage.ABSTRACTION__SUPPLIER :
				getSuppliers().clear();
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
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UMLPackage.ABSTRACTION__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.ABSTRACTION__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.ABSTRACTION__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.ABSTRACTION__OWNER :
				return isSetOwner();
			case UMLPackage.ABSTRACTION__CLIENT_DEPENDENCY :
				return !getClientDependencies().isEmpty();
			case UMLPackage.ABSTRACTION__NAME :
				return isSetName();
			case UMLPackage.ABSTRACTION__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.ABSTRACTION__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.ABSTRACTION__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.ABSTRACTION__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.ABSTRACTION__OWNING_TEMPLATE_PARAMETER :
				return basicGetOwningTemplateParameter() != null;
			case UMLPackage.ABSTRACTION__TEMPLATE_PARAMETER :
				return templateParameter != null;
			case UMLPackage.ABSTRACTION__RELATED_ELEMENT :
				return isSetRelatedElements();
			case UMLPackage.ABSTRACTION__SOURCE :
				return isSetSources();
			case UMLPackage.ABSTRACTION__TARGET :
				return isSetTargets();
			case UMLPackage.ABSTRACTION__CLIENT :
				return clients != null && !clients.isEmpty();
			case UMLPackage.ABSTRACTION__SUPPLIER :
				return suppliers != null && !suppliers.isEmpty();
			case UMLPackage.ABSTRACTION__MAPPING :
				return mapping != null;
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getOwnedElements() <em>Owned Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedElements()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_ELEMENT_ESUBSETS = new int[]{
		UMLPackage.ABSTRACTION__OWNED_COMMENT,
		UMLPackage.ABSTRACTION__NAME_EXPRESSION,
		UMLPackage.ABSTRACTION__MAPPING};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| eIsSet(UMLPackage.ABSTRACTION__MAPPING);
	}

} //AbstractionImpl
