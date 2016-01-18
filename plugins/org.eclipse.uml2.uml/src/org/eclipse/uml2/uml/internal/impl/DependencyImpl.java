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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.Comment;
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
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.DependencyImpl#getRelatedElements <em>Related Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.DependencyImpl#getSources <em>Source</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.DependencyImpl#getTargets <em>Target</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.DependencyImpl#getClients <em>Client</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.DependencyImpl#getSuppliers <em>Supplier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DependencyImpl
		extends PackageableElementImpl
		implements Dependency {

	/**
	 * The cached value of the '{@link #getClients() <em>Client</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClients()
	 * @generated
	 * @ordered
	 */
	protected EList<NamedElement> clients;

	/**
	 * The cached value of the '{@link #getSuppliers() <em>Supplier</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuppliers()
	 * @generated
	 * @ordered
	 */
	protected EList<NamedElement> suppliers;

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
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.DEPENDENCY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getRelatedElements() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			@SuppressWarnings("unchecked")
			EList<Element> relatedElements = (EList<Element>) cache.get(
				eResource, this,
				UMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
			if (relatedElements == null) {
				cache.put(eResource, this,
					UMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT,
					relatedElements = new DerivedUnionEObjectEList<Element>(
						Element.class, this,
						UMLPackage.DEPENDENCY__RELATED_ELEMENT,
						RELATED_ELEMENT_ESUBSETS));
			}
			return relatedElements;
		}
		return new DerivedUnionEObjectEList<Element>(Element.class, this,
			UMLPackage.DEPENDENCY__RELATED_ELEMENT, RELATED_ELEMENT_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getSources() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			@SuppressWarnings("unchecked")
			EList<Element> sources = (EList<Element>) cache.get(eResource, this,
				UMLPackage.Literals.DIRECTED_RELATIONSHIP__SOURCE);
			if (sources == null) {
				cache.put(eResource, this,
					UMLPackage.Literals.DIRECTED_RELATIONSHIP__SOURCE,
					sources = new DerivedUnionEObjectEList<Element>(
						Element.class, this, UMLPackage.DEPENDENCY__SOURCE,
						SOURCE_ESUBSETS));
			}
			return sources;
		}
		return new DerivedUnionEObjectEList<Element>(Element.class, this,
			UMLPackage.DEPENDENCY__SOURCE, SOURCE_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getTargets() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			@SuppressWarnings("unchecked")
			EList<Element> targets = (EList<Element>) cache.get(eResource, this,
				UMLPackage.Literals.DIRECTED_RELATIONSHIP__TARGET);
			if (targets == null) {
				cache.put(eResource, this,
					UMLPackage.Literals.DIRECTED_RELATIONSHIP__TARGET,
					targets = new DerivedUnionEObjectEList<Element>(
						Element.class, this, UMLPackage.DEPENDENCY__TARGET,
						TARGET_ESUBSETS));
			}
			return targets;
		}
		return new DerivedUnionEObjectEList<Element>(Element.class, this,
			UMLPackage.DEPENDENCY__TARGET, TARGET_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NamedElement> getSuppliers() {
		if (suppliers == null) {
			suppliers = new EObjectResolvingEList<NamedElement>(
				NamedElement.class, this, UMLPackage.DEPENDENCY__SUPPLIER);
		}
		return suppliers;
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
		supplierLoop : for (NamedElement supplier : getSuppliers()) {
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
	public EList<NamedElement> getClients() {
		if (clients == null) {
			clients = new EObjectResolvingEList<NamedElement>(
				NamedElement.class, this, UMLPackage.DEPENDENCY__CLIENT);
		}
		return clients;
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
	public NamedElement getClient(String name, boolean ignoreCase,
			EClass eClass) {
		clientLoop : for (NamedElement client : getClients()) {
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.DEPENDENCY__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.DEPENDENCY__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.DEPENDENCY__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.DEPENDENCY__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.DEPENDENCY__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.DEPENDENCY__NAME :
				return getName();
			case UMLPackage.DEPENDENCY__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.DEPENDENCY__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.DEPENDENCY__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.DEPENDENCY__VISIBILITY :
				return getVisibility();
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
			case UMLPackage.DEPENDENCY__CLIENT :
				return getClients();
			case UMLPackage.DEPENDENCY__SUPPLIER :
				return getSuppliers();
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
			case UMLPackage.DEPENDENCY__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations()
					.addAll((Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.DEPENDENCY__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments()
					.addAll((Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.DEPENDENCY__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.DEPENDENCY__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.DEPENDENCY__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.DEPENDENCY__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.DEPENDENCY__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.DEPENDENCY__CLIENT :
				getClients().clear();
				getClients()
					.addAll((Collection<? extends NamedElement>) newValue);
				return;
			case UMLPackage.DEPENDENCY__SUPPLIER :
				getSuppliers().clear();
				getSuppliers()
					.addAll((Collection<? extends NamedElement>) newValue);
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
			case UMLPackage.DEPENDENCY__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.DEPENDENCY__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.DEPENDENCY__NAME :
				unsetName();
				return;
			case UMLPackage.DEPENDENCY__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.DEPENDENCY__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.DEPENDENCY__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.DEPENDENCY__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.DEPENDENCY__CLIENT :
				getClients().clear();
				return;
			case UMLPackage.DEPENDENCY__SUPPLIER :
				getSuppliers().clear();
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
			case UMLPackage.DEPENDENCY__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.DEPENDENCY__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.DEPENDENCY__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.DEPENDENCY__OWNER :
				return isSetOwner();
			case UMLPackage.DEPENDENCY__CLIENT_DEPENDENCY :
				return !getClientDependencies().isEmpty();
			case UMLPackage.DEPENDENCY__NAME :
				return isSetName();
			case UMLPackage.DEPENDENCY__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.DEPENDENCY__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.DEPENDENCY__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.DEPENDENCY__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.DEPENDENCY__OWNING_TEMPLATE_PARAMETER :
				return basicGetOwningTemplateParameter() != null;
			case UMLPackage.DEPENDENCY__TEMPLATE_PARAMETER :
				return templateParameter != null;
			case UMLPackage.DEPENDENCY__RELATED_ELEMENT :
				return isSetRelatedElements();
			case UMLPackage.DEPENDENCY__SOURCE :
				return isSetSources();
			case UMLPackage.DEPENDENCY__TARGET :
				return isSetTargets();
			case UMLPackage.DEPENDENCY__CLIENT :
				return clients != null && !clients.isEmpty();
			case UMLPackage.DEPENDENCY__SUPPLIER :
				return suppliers != null && !suppliers.isEmpty();
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID,
			Class<?> baseClass) {
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
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID,
			Class<?> baseClass) {
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
	 * The array of subset feature identifiers for the '{@link #getRelatedElements() <em>Related Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedElements()
	 * @generated
	 * @ordered
	 */
	protected static final int[] RELATED_ELEMENT_ESUBSETS = new int[]{
		UMLPackage.DEPENDENCY__SOURCE, UMLPackage.DEPENDENCY__TARGET};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRelatedElements() {
		return isSetSources() || isSetTargets();
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getSources() <em>Source</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSources()
	 * @generated
	 * @ordered
	 */
	protected static final int[] SOURCE_ESUBSETS = new int[]{
		UMLPackage.DEPENDENCY__CLIENT};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSources() {
		return eIsSet(UMLPackage.DEPENDENCY__CLIENT);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getTargets() <em>Target</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargets()
	 * @generated
	 * @ordered
	 */
	protected static final int[] TARGET_ESUBSETS = new int[]{
		UMLPackage.DEPENDENCY__SUPPLIER};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTargets() {
		return eIsSet(UMLPackage.DEPENDENCY__SUPPLIER);
	}

} //DependencyImpl
