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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.GeneralizationSet;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generalization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.GeneralizationImpl#getTargets <em>Target</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.GeneralizationImpl#getSources <em>Source</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.GeneralizationImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.GeneralizationImpl#getGeneral <em>General</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.GeneralizationImpl#getGeneralizationSets <em>Generalization Set</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.GeneralizationImpl#isSubstitutable <em>Is Substitutable</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.GeneralizationImpl#getSpecific <em>Specific</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GeneralizationImpl
		extends DirectedRelationshipImpl
		implements Generalization {

	/**
	 * The cached value of the '{@link #getGeneral() <em>General</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneral()
	 * @generated
	 * @ordered
	 */
	protected Classifier general;

	/**
	 * The cached value of the '{@link #getGeneralizationSets() <em>Generalization Set</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralizationSets()
	 * @generated
	 * @ordered
	 */
	protected EList<GeneralizationSet> generalizationSets;

	/**
	 * The default value of the '{@link #isSubstitutable() <em>Is Substitutable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSubstitutable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_SUBSTITUTABLE_EDEFAULT = true;

	/**
	 * The flag representing the value of the '{@link #isSubstitutable() <em>Is Substitutable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSubstitutable()
	 * @generated
	 * @ordered
	 */
	protected static final int IS_SUBSTITUTABLE_EFLAG = 1 << 8;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneralizationImpl() {
		super();
		eFlags |= IS_SUBSTITUTABLE_EFLAG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.GENERALIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
						Element.class, this, UMLPackage.GENERALIZATION__TARGET,
						TARGET_ESUBSETS));
			}
			return targets;
		}
		return new DerivedUnionEObjectEList<Element>(Element.class, this,
			UMLPackage.GENERALIZATION__TARGET, TARGET_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
						Element.class, this, UMLPackage.GENERALIZATION__SOURCE,
						SOURCE_ESUBSETS));
			}
			return sources;
		}
		return new DerivedUnionEObjectEList<Element>(Element.class, this,
			UMLPackage.GENERALIZATION__SOURCE, SOURCE_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSubstitutable() {
		return (eFlags & IS_SUBSTITUTABLE_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsSubstitutable(boolean newIsSubstitutable) {
		boolean oldIsSubstitutable = (eFlags & IS_SUBSTITUTABLE_EFLAG) != 0;
		if (newIsSubstitutable)
			eFlags |= IS_SUBSTITUTABLE_EFLAG;
		else
			eFlags &= ~IS_SUBSTITUTABLE_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.GENERALIZATION__IS_SUBSTITUTABLE, oldIsSubstitutable,
				newIsSubstitutable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getGeneral() {
		if (general != null && general.eIsProxy()) {
			InternalEObject oldGeneral = (InternalEObject) general;
			general = (Classifier) eResolveProxy(oldGeneral);
			if (general != oldGeneral) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.GENERALIZATION__GENERAL, oldGeneral,
						general));
			}
		}
		return general;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier basicGetGeneral() {
		return general;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneral(Classifier newGeneral) {
		Classifier oldGeneral = general;
		general = newGeneral;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.GENERALIZATION__GENERAL, oldGeneral, general));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GeneralizationSet> getGeneralizationSets() {
		if (generalizationSets == null) {
			generalizationSets = new EObjectWithInverseResolvingEList.ManyInverse<GeneralizationSet>(
				GeneralizationSet.class, this,
				UMLPackage.GENERALIZATION__GENERALIZATION_SET,
				UMLPackage.GENERALIZATION_SET__GENERALIZATION);
		}
		return generalizationSets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralizationSet getGeneralizationSet(String name) {
		return getGeneralizationSet(name, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralizationSet getGeneralizationSet(String name,
			boolean ignoreCase) {
		generalizationSetLoop : for (GeneralizationSet generalizationSet : getGeneralizationSets()) {
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(generalizationSet.getName())
				: name.equals(generalizationSet.getName())))
				continue generalizationSetLoop;
			return generalizationSet;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getSpecific() {
		if (eContainerFeatureID() != UMLPackage.GENERALIZATION__SPECIFIC)
			return null;
		return (Classifier) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier basicGetSpecific() {
		if (eContainerFeatureID() != UMLPackage.GENERALIZATION__SPECIFIC)
			return null;
		return (Classifier) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecific(Classifier newSpecific,
			NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newSpecific,
			UMLPackage.GENERALIZATION__SPECIFIC, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecific(Classifier newSpecific) {
		if (newSpecific != eInternalContainer()
			|| (eContainerFeatureID() != UMLPackage.GENERALIZATION__SPECIFIC
				&& newSpecific != null)) {
			if (EcoreUtil.isAncestor(this, newSpecific))
				throw new IllegalArgumentException(
					"Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSpecific != null)
				msgs = ((InternalEObject) newSpecific).eInverseAdd(this,
					UMLPackage.CLASSIFIER__GENERALIZATION, Classifier.class,
					msgs);
			msgs = basicSetSpecific(newSpecific, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.GENERALIZATION__SPECIFIC, newSpecific, newSpecific));
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
			case UMLPackage.GENERALIZATION__EANNOTATIONS :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getEAnnotations())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.GENERALIZATION__GENERALIZATION_SET :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getGeneralizationSets())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.GENERALIZATION__SPECIFIC :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSpecific((Classifier) otherEnd, msgs);
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
			case UMLPackage.GENERALIZATION__EANNOTATIONS :
				return ((InternalEList<?>) getEAnnotations())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.GENERALIZATION__OWNED_COMMENT :
				return ((InternalEList<?>) getOwnedComments())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.GENERALIZATION__GENERALIZATION_SET :
				return ((InternalEList<?>) getGeneralizationSets())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.GENERALIZATION__SPECIFIC :
				return basicSetSpecific(null, msgs);
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
			case UMLPackage.GENERALIZATION__SPECIFIC :
				return eInternalContainer().eInverseRemove(this,
					UMLPackage.CLASSIFIER__GENERALIZATION, Classifier.class,
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
			case UMLPackage.GENERALIZATION__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.GENERALIZATION__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.GENERALIZATION__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.GENERALIZATION__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.GENERALIZATION__RELATED_ELEMENT :
				return getRelatedElements();
			case UMLPackage.GENERALIZATION__SOURCE :
				return getSources();
			case UMLPackage.GENERALIZATION__TARGET :
				return getTargets();
			case UMLPackage.GENERALIZATION__GENERAL :
				if (resolve)
					return getGeneral();
				return basicGetGeneral();
			case UMLPackage.GENERALIZATION__GENERALIZATION_SET :
				return getGeneralizationSets();
			case UMLPackage.GENERALIZATION__IS_SUBSTITUTABLE :
				return isSubstitutable();
			case UMLPackage.GENERALIZATION__SPECIFIC :
				if (resolve)
					return getSpecific();
				return basicGetSpecific();
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
			case UMLPackage.GENERALIZATION__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations()
					.addAll((Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.GENERALIZATION__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments()
					.addAll((Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.GENERALIZATION__GENERAL :
				setGeneral((Classifier) newValue);
				return;
			case UMLPackage.GENERALIZATION__GENERALIZATION_SET :
				getGeneralizationSets().clear();
				getGeneralizationSets()
					.addAll((Collection<? extends GeneralizationSet>) newValue);
				return;
			case UMLPackage.GENERALIZATION__IS_SUBSTITUTABLE :
				setIsSubstitutable((Boolean) newValue);
				return;
			case UMLPackage.GENERALIZATION__SPECIFIC :
				setSpecific((Classifier) newValue);
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
			case UMLPackage.GENERALIZATION__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.GENERALIZATION__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.GENERALIZATION__GENERAL :
				setGeneral((Classifier) null);
				return;
			case UMLPackage.GENERALIZATION__GENERALIZATION_SET :
				getGeneralizationSets().clear();
				return;
			case UMLPackage.GENERALIZATION__IS_SUBSTITUTABLE :
				setIsSubstitutable(IS_SUBSTITUTABLE_EDEFAULT);
				return;
			case UMLPackage.GENERALIZATION__SPECIFIC :
				setSpecific((Classifier) null);
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
			case UMLPackage.GENERALIZATION__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.GENERALIZATION__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.GENERALIZATION__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.GENERALIZATION__OWNER :
				return isSetOwner();
			case UMLPackage.GENERALIZATION__RELATED_ELEMENT :
				return isSetRelatedElements();
			case UMLPackage.GENERALIZATION__SOURCE :
				return isSetSources();
			case UMLPackage.GENERALIZATION__TARGET :
				return isSetTargets();
			case UMLPackage.GENERALIZATION__GENERAL :
				return general != null;
			case UMLPackage.GENERALIZATION__GENERALIZATION_SET :
				return generalizationSets != null
					&& !generalizationSets.isEmpty();
			case UMLPackage.GENERALIZATION__IS_SUBSTITUTABLE :
				return ((eFlags
					& IS_SUBSTITUTABLE_EFLAG) != 0) != IS_SUBSTITUTABLE_EDEFAULT;
			case UMLPackage.GENERALIZATION__SPECIFIC :
				return basicGetSpecific() != null;
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isSubstitutable: "); //$NON-NLS-1$
		result.append((eFlags & IS_SUBSTITUTABLE_EFLAG) != 0);
		result.append(')');
		return result.toString();
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
		UMLPackage.GENERALIZATION__GENERAL};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetTargets() {
		return super.isSetTargets()
			|| eIsSet(UMLPackage.GENERALIZATION__GENERAL);
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
		UMLPackage.GENERALIZATION__SPECIFIC};

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
	public boolean isSetSources() {
		return super.isSetSources()
			|| eIsSet(UMLPackage.GENERALIZATION__SPECIFIC);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element basicGetOwner() {
		Classifier specific = basicGetSpecific();
		if (specific != null) {
			return specific;
		}
		return super.basicGetOwner();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOwner() {
		return super.isSetOwner()
			|| eIsSet(UMLPackage.GENERALIZATION__SPECIFIC);
	}

} //GeneralizationImpl
