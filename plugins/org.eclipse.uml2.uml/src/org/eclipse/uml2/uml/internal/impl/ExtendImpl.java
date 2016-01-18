/*
 * Copyright (c) 2005, 2016 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey - 286329, 323181
 *   Kenn Hussey (CEA) - 327039, 351774, 418466, 451350, 485756
 *
 */
package org.eclipse.uml2.uml.internal.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.DirectedRelationship;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Extend;
import org.eclipse.uml2.uml.ExtensionPoint;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.Relationship;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.UseCase;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.ExtendOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extend</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ExtendImpl#getRelatedElements <em>Related Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ExtendImpl#getSources <em>Source</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ExtendImpl#getTargets <em>Target</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ExtendImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ExtendImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ExtendImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ExtendImpl#getExtendedCase <em>Extended Case</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ExtendImpl#getExtensionLocations <em>Extension Location</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ExtendImpl#getExtension <em>Extension</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExtendImpl
		extends NamedElementImpl
		implements Extend {

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected Constraint condition;

	/**
	 * The cached value of the '{@link #getExtendedCase() <em>Extended Case</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendedCase()
	 * @generated
	 * @ordered
	 */
	protected UseCase extendedCase;

	/**
	 * The cached value of the '{@link #getExtensionLocations() <em>Extension Location</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensionLocations()
	 * @generated
	 * @ordered
	 */
	protected EList<ExtensionPoint> extensionLocations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtendImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.EXTEND;
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
						Element.class, this, UMLPackage.EXTEND__RELATED_ELEMENT,
						RELATED_ELEMENT_ESUBSETS));
			}
			return relatedElements;
		}
		return new DerivedUnionEObjectEList<Element>(Element.class, this,
			UMLPackage.EXTEND__RELATED_ELEMENT, RELATED_ELEMENT_ESUBSETS);
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
						Element.class, this, UMLPackage.EXTEND__SOURCE,
						SOURCE_ESUBSETS));
			}
			return sources;
		}
		return new DerivedUnionEObjectEList<Element>(Element.class, this,
			UMLPackage.EXTEND__SOURCE, SOURCE_ESUBSETS);
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
						Element.class, this, UMLPackage.EXTEND__TARGET,
						TARGET_ESUBSETS));
			}
			return targets;
		}
		return new DerivedUnionEObjectEList<Element>(Element.class, this,
			UMLPackage.EXTEND__TARGET, TARGET_ESUBSETS);
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
						Element.class, this, UMLPackage.EXTEND__OWNED_ELEMENT,
						OWNED_ELEMENT_ESUBSETS));
			}
			return ownedElements;
		}
		return new DerivedUnionEObjectEList<Element>(Element.class, this,
			UMLPackage.EXTEND__OWNED_ELEMENT, OWNED_ELEMENT_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCase getExtendedCase() {
		if (extendedCase != null && extendedCase.eIsProxy()) {
			InternalEObject oldExtendedCase = (InternalEObject) extendedCase;
			extendedCase = (UseCase) eResolveProxy(oldExtendedCase);
			if (extendedCase != oldExtendedCase) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.EXTEND__EXTENDED_CASE, oldExtendedCase,
						extendedCase));
			}
		}
		return extendedCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCase basicGetExtendedCase() {
		return extendedCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtendedCase(UseCase newExtendedCase) {
		UseCase oldExtendedCase = extendedCase;
		extendedCase = newExtendedCase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.EXTEND__EXTENDED_CASE, oldExtendedCase,
				extendedCase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint getCondition() {
		if (condition != null && condition.eIsProxy()) {
			InternalEObject oldCondition = (InternalEObject) condition;
			condition = (Constraint) eResolveProxy(oldCondition);
			if (condition != oldCondition) {
				InternalEObject newCondition = (InternalEObject) condition;
				NotificationChain msgs = oldCondition.eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE - UMLPackage.EXTEND__CONDITION, null,
					null);
				if (newCondition.eInternalContainer() == null) {
					msgs = newCondition.eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - UMLPackage.EXTEND__CONDITION,
						null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.EXTEND__CONDITION, oldCondition, condition));
			}
		}
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint basicGetCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(Constraint newCondition,
			NotificationChain msgs) {
		Constraint oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET, UMLPackage.EXTEND__CONDITION, oldCondition,
				newCondition);
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
	public void setCondition(Constraint newCondition) {
		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject) condition).eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE - UMLPackage.EXTEND__CONDITION, null,
					msgs);
			if (newCondition != null)
				msgs = ((InternalEObject) newCondition).eInverseAdd(this,
					EOPPOSITE_FEATURE_BASE - UMLPackage.EXTEND__CONDITION, null,
					msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.EXTEND__CONDITION, newCondition, newCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint createCondition(String name, EClass eClass) {
		Constraint newCondition = (Constraint) create(eClass);
		setCondition(newCondition);
		if (name != null)
			newCondition.setName(name);
		return newCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint createCondition(String name) {
		return createCondition(name, UMLPackage.Literals.CONSTRAINT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExtensionPoint> getExtensionLocations() {
		if (extensionLocations == null) {
			extensionLocations = new EObjectResolvingEList<ExtensionPoint>(
				ExtensionPoint.class, this,
				UMLPackage.EXTEND__EXTENSION_LOCATION);
		}
		return extensionLocations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionPoint getExtensionLocation(String name) {
		return getExtensionLocation(name, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionPoint getExtensionLocation(String name,
			boolean ignoreCase) {
		extensionLocationLoop : for (ExtensionPoint extensionLocation : getExtensionLocations()) {
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(extensionLocation.getName())
				: name.equals(extensionLocation.getName())))
				continue extensionLocationLoop;
			return extensionLocation;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCase getExtension() {
		if (eContainerFeatureID() != UMLPackage.EXTEND__EXTENSION)
			return null;
		return (UseCase) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCase basicGetExtension() {
		if (eContainerFeatureID() != UMLPackage.EXTEND__EXTENSION)
			return null;
		return (UseCase) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtension(UseCase newExtension,
			NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newExtension,
			UMLPackage.EXTEND__EXTENSION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtension(UseCase newExtension) {
		if (newExtension != eInternalContainer()
			|| (eContainerFeatureID() != UMLPackage.EXTEND__EXTENSION
				&& newExtension != null)) {
			if (EcoreUtil.isAncestor(this, newExtension))
				throw new IllegalArgumentException(
					"Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newExtension != null)
				msgs = ((InternalEObject) newExtension).eInverseAdd(this,
					UMLPackage.USE_CASE__EXTEND, UseCase.class, msgs);
			msgs = basicSetExtension(newExtension, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.EXTEND__EXTENSION, newExtension, newExtension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtensionPoints(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ExtendOperations.validateExtensionPoints(this, diagnostics,
			context);
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
			case UMLPackage.EXTEND__EANNOTATIONS :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getEAnnotations())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.EXTEND__EXTENSION :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetExtension((UseCase) otherEnd, msgs);
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
			case UMLPackage.EXTEND__EANNOTATIONS :
				return ((InternalEList<?>) getEAnnotations())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.EXTEND__OWNED_COMMENT :
				return ((InternalEList<?>) getOwnedComments())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.EXTEND__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.EXTEND__CONDITION :
				return basicSetCondition(null, msgs);
			case UMLPackage.EXTEND__EXTENSION :
				return basicSetExtension(null, msgs);
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
			case UMLPackage.EXTEND__EXTENSION :
				return eInternalContainer().eInverseRemove(this,
					UMLPackage.USE_CASE__EXTEND, UseCase.class, msgs);
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
			case UMLPackage.EXTEND__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.EXTEND__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.EXTEND__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.EXTEND__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.EXTEND__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.EXTEND__NAME :
				return getName();
			case UMLPackage.EXTEND__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.EXTEND__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.EXTEND__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.EXTEND__VISIBILITY :
				return getVisibility();
			case UMLPackage.EXTEND__RELATED_ELEMENT :
				return getRelatedElements();
			case UMLPackage.EXTEND__SOURCE :
				return getSources();
			case UMLPackage.EXTEND__TARGET :
				return getTargets();
			case UMLPackage.EXTEND__CONDITION :
				if (resolve)
					return getCondition();
				return basicGetCondition();
			case UMLPackage.EXTEND__EXTENDED_CASE :
				if (resolve)
					return getExtendedCase();
				return basicGetExtendedCase();
			case UMLPackage.EXTEND__EXTENSION_LOCATION :
				return getExtensionLocations();
			case UMLPackage.EXTEND__EXTENSION :
				if (resolve)
					return getExtension();
				return basicGetExtension();
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
			case UMLPackage.EXTEND__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations()
					.addAll((Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.EXTEND__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments()
					.addAll((Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.EXTEND__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.EXTEND__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.EXTEND__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.EXTEND__CONDITION :
				setCondition((Constraint) newValue);
				return;
			case UMLPackage.EXTEND__EXTENDED_CASE :
				setExtendedCase((UseCase) newValue);
				return;
			case UMLPackage.EXTEND__EXTENSION_LOCATION :
				getExtensionLocations().clear();
				getExtensionLocations()
					.addAll((Collection<? extends ExtensionPoint>) newValue);
				return;
			case UMLPackage.EXTEND__EXTENSION :
				setExtension((UseCase) newValue);
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
			case UMLPackage.EXTEND__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.EXTEND__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.EXTEND__NAME :
				unsetName();
				return;
			case UMLPackage.EXTEND__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.EXTEND__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.EXTEND__CONDITION :
				setCondition((Constraint) null);
				return;
			case UMLPackage.EXTEND__EXTENDED_CASE :
				setExtendedCase((UseCase) null);
				return;
			case UMLPackage.EXTEND__EXTENSION_LOCATION :
				getExtensionLocations().clear();
				return;
			case UMLPackage.EXTEND__EXTENSION :
				setExtension((UseCase) null);
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
			case UMLPackage.EXTEND__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.EXTEND__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.EXTEND__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.EXTEND__OWNER :
				return isSetOwner();
			case UMLPackage.EXTEND__CLIENT_DEPENDENCY :
				return !getClientDependencies().isEmpty();
			case UMLPackage.EXTEND__NAME :
				return isSetName();
			case UMLPackage.EXTEND__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.EXTEND__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.EXTEND__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.EXTEND__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.EXTEND__RELATED_ELEMENT :
				return isSetRelatedElements();
			case UMLPackage.EXTEND__SOURCE :
				return isSetSources();
			case UMLPackage.EXTEND__TARGET :
				return isSetTargets();
			case UMLPackage.EXTEND__CONDITION :
				return condition != null;
			case UMLPackage.EXTEND__EXTENDED_CASE :
				return extendedCase != null;
			case UMLPackage.EXTEND__EXTENSION_LOCATION :
				return extensionLocations != null
					&& !extensionLocations.isEmpty();
			case UMLPackage.EXTEND__EXTENSION :
				return basicGetExtension() != null;
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
				case UMLPackage.EXTEND__RELATED_ELEMENT :
					return UMLPackage.RELATIONSHIP__RELATED_ELEMENT;
				default :
					return -1;
			}
		}
		if (baseClass == DirectedRelationship.class) {
			switch (derivedFeatureID) {
				case UMLPackage.EXTEND__SOURCE :
					return UMLPackage.DIRECTED_RELATIONSHIP__SOURCE;
				case UMLPackage.EXTEND__TARGET :
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
					return UMLPackage.EXTEND__RELATED_ELEMENT;
				default :
					return -1;
			}
		}
		if (baseClass == DirectedRelationship.class) {
			switch (baseFeatureID) {
				case UMLPackage.DIRECTED_RELATIONSHIP__SOURCE :
					return UMLPackage.EXTEND__SOURCE;
				case UMLPackage.DIRECTED_RELATIONSHIP__TARGET :
					return UMLPackage.EXTEND__TARGET;
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
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments)
			throws InvocationTargetException {
		switch (operationID) {
			case UMLPackage.EXTEND___GET_EANNOTATION__STRING :
				return getEAnnotation((String) arguments.get(0));
			case UMLPackage.EXTEND___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP :
				return validateHasOwner((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.EXTEND___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP :
				return validateNotOwnSelf((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.EXTEND___ADD_KEYWORD__STRING :
				return addKeyword((String) arguments.get(0));
			case UMLPackage.EXTEND___APPLY_STEREOTYPE__STEREOTYPE :
				return applyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.EXTEND___CREATE_EANNOTATION__STRING :
				return createEAnnotation((String) arguments.get(0));
			case UMLPackage.EXTEND___DESTROY :
				destroy();
				return null;
			case UMLPackage.EXTEND___GET_KEYWORDS :
				return getKeywords();
			case UMLPackage.EXTEND___GET_APPLICABLE_STEREOTYPE__STRING :
				return getApplicableStereotype((String) arguments.get(0));
			case UMLPackage.EXTEND___GET_APPLICABLE_STEREOTYPES :
				return getApplicableStereotypes();
			case UMLPackage.EXTEND___GET_APPLIED_STEREOTYPE__STRING :
				return getAppliedStereotype((String) arguments.get(0));
			case UMLPackage.EXTEND___GET_APPLIED_STEREOTYPES :
				return getAppliedStereotypes();
			case UMLPackage.EXTEND___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING :
				return getAppliedSubstereotype((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.EXTEND___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE :
				return getAppliedSubstereotypes((Stereotype) arguments.get(0));
			case UMLPackage.EXTEND___GET_MODEL :
				return getModel();
			case UMLPackage.EXTEND___GET_NEAREST_PACKAGE :
				return getNearestPackage();
			case UMLPackage.EXTEND___GET_RELATIONSHIPS :
				return getRelationships();
			case UMLPackage.EXTEND___GET_RELATIONSHIPS__ECLASS :
				return getRelationships((EClass) arguments.get(0));
			case UMLPackage.EXTEND___GET_REQUIRED_STEREOTYPE__STRING :
				return getRequiredStereotype((String) arguments.get(0));
			case UMLPackage.EXTEND___GET_REQUIRED_STEREOTYPES :
				return getRequiredStereotypes();
			case UMLPackage.EXTEND___GET_SOURCE_DIRECTED_RELATIONSHIPS :
				return getSourceDirectedRelationships();
			case UMLPackage.EXTEND___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS :
				return getSourceDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.EXTEND___GET_STEREOTYPE_APPLICATION__STEREOTYPE :
				return getStereotypeApplication((Stereotype) arguments.get(0));
			case UMLPackage.EXTEND___GET_STEREOTYPE_APPLICATIONS :
				return getStereotypeApplications();
			case UMLPackage.EXTEND___GET_TARGET_DIRECTED_RELATIONSHIPS :
				return getTargetDirectedRelationships();
			case UMLPackage.EXTEND___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS :
				return getTargetDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.EXTEND___GET_VALUE__STEREOTYPE_STRING :
				return getValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.EXTEND___HAS_KEYWORD__STRING :
				return hasKeyword((String) arguments.get(0));
			case UMLPackage.EXTEND___HAS_VALUE__STEREOTYPE_STRING :
				return hasValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.EXTEND___IS_STEREOTYPE_APPLICABLE__STEREOTYPE :
				return isStereotypeApplicable((Stereotype) arguments.get(0));
			case UMLPackage.EXTEND___IS_STEREOTYPE_APPLIED__STEREOTYPE :
				return isStereotypeApplied((Stereotype) arguments.get(0));
			case UMLPackage.EXTEND___IS_STEREOTYPE_REQUIRED__STEREOTYPE :
				return isStereotypeRequired((Stereotype) arguments.get(0));
			case UMLPackage.EXTEND___REMOVE_KEYWORD__STRING :
				return removeKeyword((String) arguments.get(0));
			case UMLPackage.EXTEND___SET_VALUE__STEREOTYPE_STRING_OBJECT :
				setValue((Stereotype) arguments.get(0),
					(String) arguments.get(1), arguments.get(2));
				return null;
			case UMLPackage.EXTEND___UNAPPLY_STEREOTYPE__STEREOTYPE :
				return unapplyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.EXTEND___ALL_OWNED_ELEMENTS :
				return allOwnedElements();
			case UMLPackage.EXTEND___MUST_BE_OWNED :
				return mustBeOwned();
			case UMLPackage.EXTEND___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP :
				return validateVisibilityNeedsOwnership(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.EXTEND___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.EXTEND___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasNoQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.EXTEND___CREATE_DEPENDENCY__NAMEDELEMENT :
				return createDependency((NamedElement) arguments.get(0));
			case UMLPackage.EXTEND___CREATE_USAGE__NAMEDELEMENT :
				return createUsage((NamedElement) arguments.get(0));
			case UMLPackage.EXTEND___GET_LABEL :
				return getLabel();
			case UMLPackage.EXTEND___GET_LABEL__BOOLEAN :
				return getLabel((Boolean) arguments.get(0));
			case UMLPackage.EXTEND___GET_NAMESPACE :
				return getNamespace();
			case UMLPackage.EXTEND___ALL_NAMESPACES :
				return allNamespaces();
			case UMLPackage.EXTEND___ALL_OWNING_PACKAGES :
				return allOwningPackages();
			case UMLPackage.EXTEND___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE :
				return isDistinguishableFrom((NamedElement) arguments.get(0),
					(Namespace) arguments.get(1));
			case UMLPackage.EXTEND___GET_QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.EXTEND___SEPARATOR :
				return separator();
			case UMLPackage.EXTEND___GET_CLIENT_DEPENDENCIES :
				return getClientDependencies();
			case UMLPackage.EXTEND___VALIDATE_EXTENSION_POINTS__DIAGNOSTICCHAIN_MAP :
				return validateExtensionPoints(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		}
		return eDynamicInvoke(operationID, arguments);
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
		UMLPackage.EXTEND__SOURCE, UMLPackage.EXTEND__TARGET};

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
		UMLPackage.EXTEND__EXTENSION};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSources() {
		return eIsSet(UMLPackage.EXTEND__EXTENSION);
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
		UMLPackage.EXTEND__EXTENDED_CASE};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTargets() {
		return eIsSet(UMLPackage.EXTEND__EXTENDED_CASE);
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
		UMLPackage.EXTEND__OWNED_COMMENT, UMLPackage.EXTEND__NAME_EXPRESSION,
		UMLPackage.EXTEND__CONDITION};

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
		UseCase extension = basicGetExtension();
		if (extension != null) {
			return extension;
		}
		return super.basicGetNamespace();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| eIsSet(UMLPackage.EXTEND__CONDITION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetNamespace() {
		return super.isSetNamespace() || eIsSet(UMLPackage.EXTEND__EXTENSION);
	}

} //ExtendImpl
