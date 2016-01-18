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

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.DirectedRelationship;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Include;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.Relationship;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.UseCase;
import org.eclipse.uml2.uml.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Include</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.IncludeImpl#getRelatedElements <em>Related Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.IncludeImpl#getSources <em>Source</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.IncludeImpl#getTargets <em>Target</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.IncludeImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.IncludeImpl#getAddition <em>Addition</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.IncludeImpl#getIncludingCase <em>Including Case</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IncludeImpl
		extends NamedElementImpl
		implements Include {

	/**
	 * The cached value of the '{@link #getAddition() <em>Addition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddition()
	 * @generated
	 * @ordered
	 */
	protected UseCase addition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IncludeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.INCLUDE;
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
						UMLPackage.INCLUDE__RELATED_ELEMENT,
						RELATED_ELEMENT_ESUBSETS));
			}
			return relatedElements;
		}
		return new DerivedUnionEObjectEList<Element>(Element.class, this,
			UMLPackage.INCLUDE__RELATED_ELEMENT, RELATED_ELEMENT_ESUBSETS);
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
						Element.class, this, UMLPackage.INCLUDE__SOURCE,
						SOURCE_ESUBSETS));
			}
			return sources;
		}
		return new DerivedUnionEObjectEList<Element>(Element.class, this,
			UMLPackage.INCLUDE__SOURCE, SOURCE_ESUBSETS);
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
						Element.class, this, UMLPackage.INCLUDE__TARGET,
						TARGET_ESUBSETS));
			}
			return targets;
		}
		return new DerivedUnionEObjectEList<Element>(Element.class, this,
			UMLPackage.INCLUDE__TARGET, TARGET_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCase getAddition() {
		if (addition != null && addition.eIsProxy()) {
			InternalEObject oldAddition = (InternalEObject) addition;
			addition = (UseCase) eResolveProxy(oldAddition);
			if (addition != oldAddition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.INCLUDE__ADDITION, oldAddition, addition));
			}
		}
		return addition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCase basicGetAddition() {
		return addition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddition(UseCase newAddition) {
		UseCase oldAddition = addition;
		addition = newAddition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.INCLUDE__ADDITION, oldAddition, addition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCase getIncludingCase() {
		if (eContainerFeatureID() != UMLPackage.INCLUDE__INCLUDING_CASE)
			return null;
		return (UseCase) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCase basicGetIncludingCase() {
		if (eContainerFeatureID() != UMLPackage.INCLUDE__INCLUDING_CASE)
			return null;
		return (UseCase) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIncludingCase(UseCase newIncludingCase,
			NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newIncludingCase,
			UMLPackage.INCLUDE__INCLUDING_CASE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncludingCase(UseCase newIncludingCase) {
		if (newIncludingCase != eInternalContainer()
			|| (eContainerFeatureID() != UMLPackage.INCLUDE__INCLUDING_CASE
				&& newIncludingCase != null)) {
			if (EcoreUtil.isAncestor(this, newIncludingCase))
				throw new IllegalArgumentException(
					"Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newIncludingCase != null)
				msgs = ((InternalEObject) newIncludingCase).eInverseAdd(this,
					UMLPackage.USE_CASE__INCLUDE, UseCase.class, msgs);
			msgs = basicSetIncludingCase(newIncludingCase, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.INCLUDE__INCLUDING_CASE, newIncludingCase,
				newIncludingCase));
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
			case UMLPackage.INCLUDE__EANNOTATIONS :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getEAnnotations())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.INCLUDE__INCLUDING_CASE :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetIncludingCase((UseCase) otherEnd, msgs);
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
			case UMLPackage.INCLUDE__EANNOTATIONS :
				return ((InternalEList<?>) getEAnnotations())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.INCLUDE__OWNED_COMMENT :
				return ((InternalEList<?>) getOwnedComments())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.INCLUDE__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.INCLUDE__INCLUDING_CASE :
				return basicSetIncludingCase(null, msgs);
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
			case UMLPackage.INCLUDE__INCLUDING_CASE :
				return eInternalContainer().eInverseRemove(this,
					UMLPackage.USE_CASE__INCLUDE, UseCase.class, msgs);
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
			case UMLPackage.INCLUDE__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.INCLUDE__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.INCLUDE__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.INCLUDE__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.INCLUDE__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.INCLUDE__NAME :
				return getName();
			case UMLPackage.INCLUDE__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.INCLUDE__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.INCLUDE__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.INCLUDE__VISIBILITY :
				return getVisibility();
			case UMLPackage.INCLUDE__RELATED_ELEMENT :
				return getRelatedElements();
			case UMLPackage.INCLUDE__SOURCE :
				return getSources();
			case UMLPackage.INCLUDE__TARGET :
				return getTargets();
			case UMLPackage.INCLUDE__ADDITION :
				if (resolve)
					return getAddition();
				return basicGetAddition();
			case UMLPackage.INCLUDE__INCLUDING_CASE :
				if (resolve)
					return getIncludingCase();
				return basicGetIncludingCase();
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
			case UMLPackage.INCLUDE__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations()
					.addAll((Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.INCLUDE__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments()
					.addAll((Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.INCLUDE__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.INCLUDE__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.INCLUDE__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.INCLUDE__ADDITION :
				setAddition((UseCase) newValue);
				return;
			case UMLPackage.INCLUDE__INCLUDING_CASE :
				setIncludingCase((UseCase) newValue);
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
			case UMLPackage.INCLUDE__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.INCLUDE__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.INCLUDE__NAME :
				unsetName();
				return;
			case UMLPackage.INCLUDE__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.INCLUDE__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.INCLUDE__ADDITION :
				setAddition((UseCase) null);
				return;
			case UMLPackage.INCLUDE__INCLUDING_CASE :
				setIncludingCase((UseCase) null);
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
			case UMLPackage.INCLUDE__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.INCLUDE__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.INCLUDE__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.INCLUDE__OWNER :
				return isSetOwner();
			case UMLPackage.INCLUDE__CLIENT_DEPENDENCY :
				return !getClientDependencies().isEmpty();
			case UMLPackage.INCLUDE__NAME :
				return isSetName();
			case UMLPackage.INCLUDE__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.INCLUDE__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.INCLUDE__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.INCLUDE__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.INCLUDE__RELATED_ELEMENT :
				return isSetRelatedElements();
			case UMLPackage.INCLUDE__SOURCE :
				return isSetSources();
			case UMLPackage.INCLUDE__TARGET :
				return isSetTargets();
			case UMLPackage.INCLUDE__ADDITION :
				return addition != null;
			case UMLPackage.INCLUDE__INCLUDING_CASE :
				return basicGetIncludingCase() != null;
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
				case UMLPackage.INCLUDE__RELATED_ELEMENT :
					return UMLPackage.RELATIONSHIP__RELATED_ELEMENT;
				default :
					return -1;
			}
		}
		if (baseClass == DirectedRelationship.class) {
			switch (derivedFeatureID) {
				case UMLPackage.INCLUDE__SOURCE :
					return UMLPackage.DIRECTED_RELATIONSHIP__SOURCE;
				case UMLPackage.INCLUDE__TARGET :
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
					return UMLPackage.INCLUDE__RELATED_ELEMENT;
				default :
					return -1;
			}
		}
		if (baseClass == DirectedRelationship.class) {
			switch (baseFeatureID) {
				case UMLPackage.DIRECTED_RELATIONSHIP__SOURCE :
					return UMLPackage.INCLUDE__SOURCE;
				case UMLPackage.DIRECTED_RELATIONSHIP__TARGET :
					return UMLPackage.INCLUDE__TARGET;
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
		UMLPackage.INCLUDE__SOURCE, UMLPackage.INCLUDE__TARGET};

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
		UMLPackage.INCLUDE__INCLUDING_CASE};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSources() {
		return eIsSet(UMLPackage.INCLUDE__INCLUDING_CASE);
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
		UMLPackage.INCLUDE__ADDITION};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Namespace getNamespace() {
		Namespace namespace = basicGetNamespace();
		return namespace != null && namespace.eIsProxy()
			? (Namespace) eResolveProxy((InternalEObject) namespace)
			: namespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Namespace basicGetNamespace() {
		UseCase includingCase = basicGetIncludingCase();
		if (includingCase != null) {
			return includingCase;
		}
		return super.basicGetNamespace();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTargets() {
		return eIsSet(UMLPackage.INCLUDE__ADDITION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetNamespace() {
		return super.isSetNamespace()
			|| eIsSet(UMLPackage.INCLUDE__INCLUDING_CASE);
	}

} //IncludeImpl
