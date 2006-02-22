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
 * $Id: DependencyImpl.java,v 1.11 2006/02/22 20:48:16 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.Iterator;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.DirectedRelationship;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Relationship;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.DependencyImpl#getRelatedElements <em>Related Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.DependencyImpl#getSources <em>Source</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.DependencyImpl#getTargets <em>Target</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.DependencyImpl#getSuppliers <em>Supplier</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.DependencyImpl#getClients <em>Client</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DependencyImpl
		extends PackageableElementImpl
		implements Dependency {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DependencyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.Literals.DEPENDENCY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRelatedElements() {
		EList relatedElement = (EList) eVirtualGet(UMLPackage.DEPENDENCY__RELATED_ELEMENT);
		if (relatedElement == null) {
			eVirtualSet(UMLPackage.DEPENDENCY__RELATED_ELEMENT,
				relatedElement = new DerivedUnionEObjectEList(Element.class,
					this, UMLPackage.DEPENDENCY__RELATED_ELEMENT, new int[]{
						UMLPackage.DEPENDENCY__SOURCE,
						UMLPackage.DEPENDENCY__TARGET}));
		}
		return relatedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSources() {
		EList source = (EList) eVirtualGet(UMLPackage.DEPENDENCY__SOURCE);
		if (source == null) {
			eVirtualSet(UMLPackage.DEPENDENCY__SOURCE,
				source = new DerivedUnionEObjectEList(Element.class, this,
					UMLPackage.DEPENDENCY__SOURCE,
					new int[]{UMLPackage.DEPENDENCY__CLIENT}));
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getTargets() {
		EList target = (EList) eVirtualGet(UMLPackage.DEPENDENCY__TARGET);
		if (target == null) {
			eVirtualSet(UMLPackage.DEPENDENCY__TARGET,
				target = new DerivedUnionEObjectEList(Element.class, this,
					UMLPackage.DEPENDENCY__TARGET,
					new int[]{UMLPackage.DEPENDENCY__SUPPLIER}));
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSuppliers() {
		EList supplier = (EList) eVirtualGet(UMLPackage.DEPENDENCY__SUPPLIER);
		if (supplier == null) {
			eVirtualSet(UMLPackage.DEPENDENCY__SUPPLIER,
				supplier = new EObjectResolvingEList(NamedElement.class, this,
					UMLPackage.DEPENDENCY__SUPPLIER));
		}
		return supplier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement getSupplier(String name) {
		return getSupplier(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement getSupplier(String name, boolean ignoreCase,
			EClass eClass) {
		supplierLoop : for (Iterator i = getSuppliers().iterator(); i.hasNext();) {
			NamedElement supplier = (NamedElement) i.next();
			if (eClass != null && !eClass.isInstance(supplier))
				continue supplierLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(supplier.getName())
				: name.equals(supplier.getName())))
				continue supplierLoop;
			return supplier;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getClients() {
		EList client = (EList) eVirtualGet(UMLPackage.DEPENDENCY__CLIENT);
		if (client == null) {
			eVirtualSet(UMLPackage.DEPENDENCY__CLIENT,
				client = new EObjectWithInverseResolvingEList.ManyInverse(
					NamedElement.class, this, UMLPackage.DEPENDENCY__CLIENT,
					UMLPackage.NAMED_ELEMENT__CLIENT_DEPENDENCY));
		}
		return client;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement getClient(String name) {
		return getClient(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement getClient(String name, boolean ignoreCase, EClass eClass) {
		clientLoop : for (Iterator i = getClients().iterator(); i.hasNext();) {
			NamedElement client = (NamedElement) i.next();
			if (eClass != null && !eClass.isInstance(client))
				continue clientLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(client.getName())
				: name.equals(client.getName())))
				continue clientLoop;
			return client;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.DEPENDENCY__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.DEPENDENCY__CLIENT_DEPENDENCY :
				return ((InternalEList) getClientDependencies()).basicAdd(
					otherEnd, msgs);
			case UMLPackage.DEPENDENCY__OWNING_TEMPLATE_PARAMETER :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd,
					UMLPackage.DEPENDENCY__OWNING_TEMPLATE_PARAMETER, msgs);
			case UMLPackage.DEPENDENCY__TEMPLATE_PARAMETER :
				TemplateParameter templateParameter = (TemplateParameter) eVirtualGet(UMLPackage.DEPENDENCY__TEMPLATE_PARAMETER);
				if (templateParameter != null)
					msgs = ((InternalEObject) templateParameter)
						.eInverseRemove(this,
							UMLPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT,
							TemplateParameter.class, msgs);
				return basicSetTemplateParameter((TemplateParameter) otherEnd,
					msgs);
			case UMLPackage.DEPENDENCY__CLIENT :
				return ((InternalEList) getClients()).basicAdd(otherEnd, msgs);
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
			case UMLPackage.DEPENDENCY__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.DEPENDENCY__OWNED_COMMENT :
				return ((InternalEList) getOwnedComments()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.DEPENDENCY__CLIENT_DEPENDENCY :
				return ((InternalEList) getClientDependencies()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.DEPENDENCY__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.DEPENDENCY__OWNING_TEMPLATE_PARAMETER :
				return eBasicSetContainer(null,
					UMLPackage.DEPENDENCY__OWNING_TEMPLATE_PARAMETER, msgs);
			case UMLPackage.DEPENDENCY__TEMPLATE_PARAMETER :
				return basicSetTemplateParameter(null, msgs);
			case UMLPackage.DEPENDENCY__CLIENT :
				return ((InternalEList) getClients()).basicRemove(otherEnd,
					msgs);
		}
		return eDynamicInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.DEPENDENCY__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.DEPENDENCY__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.DEPENDENCY__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.DEPENDENCY__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.DEPENDENCY__NAME :
				return getName();
			case UMLPackage.DEPENDENCY__VISIBILITY :
				return getVisibility();
			case UMLPackage.DEPENDENCY__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.DEPENDENCY__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.DEPENDENCY__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.DEPENDENCY__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.DEPENDENCY__OWNING_TEMPLATE_PARAMETER :
				if (resolve)
					return getOwningTemplateParameter();
				return basicGetOwningTemplateParameter();
			case UMLPackage.DEPENDENCY__TEMPLATE_PARAMETER :
				if (resolve)
					return getTemplateParameter();
				return basicGetTemplateParameter();
			case UMLPackage.DEPENDENCY__RELATED_ELEMENT :
				return getRelatedElements();
			case UMLPackage.DEPENDENCY__SOURCE :
				return getSources();
			case UMLPackage.DEPENDENCY__TARGET :
				return getTargets();
			case UMLPackage.DEPENDENCY__SUPPLIER :
				return getSuppliers();
			case UMLPackage.DEPENDENCY__CLIENT :
				return getClients();
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
			case UMLPackage.DEPENDENCY__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.DEPENDENCY__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.DEPENDENCY__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.DEPENDENCY__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.DEPENDENCY__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.DEPENDENCY__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.DEPENDENCY__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.DEPENDENCY__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.DEPENDENCY__SUPPLIER :
				getSuppliers().clear();
				getSuppliers().addAll((Collection) newValue);
				return;
			case UMLPackage.DEPENDENCY__CLIENT :
				getClients().clear();
				getClients().addAll((Collection) newValue);
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
			case UMLPackage.DEPENDENCY__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.DEPENDENCY__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.DEPENDENCY__NAME :
				unsetName();
				return;
			case UMLPackage.DEPENDENCY__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.DEPENDENCY__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.DEPENDENCY__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.DEPENDENCY__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.DEPENDENCY__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.DEPENDENCY__SUPPLIER :
				getSuppliers().clear();
				return;
			case UMLPackage.DEPENDENCY__CLIENT :
				getClients().clear();
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
			case UMLPackage.DEPENDENCY__EANNOTATIONS :
				EList eAnnotations = (EList) eVirtualGet(UMLPackage.DEPENDENCY__EANNOTATIONS);
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.DEPENDENCY__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.DEPENDENCY__OWNER :
				return isSetOwner();
			case UMLPackage.DEPENDENCY__OWNED_COMMENT :
				EList ownedComment = (EList) eVirtualGet(UMLPackage.DEPENDENCY__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.DEPENDENCY__NAME :
				return isSetName();
			case UMLPackage.DEPENDENCY__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.DEPENDENCY__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.DEPENDENCY__CLIENT_DEPENDENCY :
				EList clientDependency = (EList) eVirtualGet(UMLPackage.DEPENDENCY__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.DEPENDENCY__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.DEPENDENCY__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.DEPENDENCY__NAME_EXPRESSION) != null;
			case UMLPackage.DEPENDENCY__OWNING_TEMPLATE_PARAMETER :
				return basicGetOwningTemplateParameter() != null;
			case UMLPackage.DEPENDENCY__TEMPLATE_PARAMETER :
				return eVirtualGet(UMLPackage.DEPENDENCY__TEMPLATE_PARAMETER) != null;
			case UMLPackage.DEPENDENCY__RELATED_ELEMENT :
				return isSetRelatedElements();
			case UMLPackage.DEPENDENCY__SOURCE :
				return isSetSources();
			case UMLPackage.DEPENDENCY__TARGET :
				return isSetTargets();
			case UMLPackage.DEPENDENCY__SUPPLIER :
				EList supplier = (EList) eVirtualGet(UMLPackage.DEPENDENCY__SUPPLIER);
				return supplier != null && !supplier.isEmpty();
			case UMLPackage.DEPENDENCY__CLIENT :
				EList client = (EList) eVirtualGet(UMLPackage.DEPENDENCY__CLIENT);
				return client != null && !client.isEmpty();
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == Relationship.class) {
			switch (derivedFeatureID) {
				case UMLPackage.DEPENDENCY__RELATED_ELEMENT :
					return UMLPackage.RELATIONSHIP__RELATED_ELEMENT;
				default :
					return -1;
			}
		}
		if (baseClass == DirectedRelationship.class) {
			switch (derivedFeatureID) {
				case UMLPackage.DEPENDENCY__SOURCE :
					return UMLPackage.DIRECTED_RELATIONSHIP__SOURCE;
				case UMLPackage.DEPENDENCY__TARGET :
					return UMLPackage.DIRECTED_RELATIONSHIP__TARGET;
				default :
					return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class baseClass) {
		if (baseClass == Relationship.class) {
			switch (baseFeatureID) {
				case UMLPackage.RELATIONSHIP__RELATED_ELEMENT :
					return UMLPackage.DEPENDENCY__RELATED_ELEMENT;
				default :
					return -1;
			}
		}
		if (baseClass == DirectedRelationship.class) {
			switch (baseFeatureID) {
				case UMLPackage.DIRECTED_RELATIONSHIP__SOURCE :
					return UMLPackage.DEPENDENCY__SOURCE;
				case UMLPackage.DIRECTED_RELATIONSHIP__TARGET :
					return UMLPackage.DEPENDENCY__TARGET;
				default :
					return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRelatedElements() {
		return isSetSources() || isSetTargets();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSources() {
		return eIsSet(UMLPackage.DEPENDENCY__CLIENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTargets() {
		return eIsSet(UMLPackage.DEPENDENCY__SUPPLIER);
	}

} //DependencyImpl
