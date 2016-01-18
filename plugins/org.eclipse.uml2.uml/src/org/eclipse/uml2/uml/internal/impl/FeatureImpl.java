/*
 * Copyright (c) 2005, 2016 IBM Corporation, Embarcadero Technologies, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (Embarcadero Technologies) - 204200
 *   Kenn Hussey (CEA) - 327039, 418466, 451350, 485756
 *
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Feature;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.FeatureImpl#getFeaturingClassifiers <em>Featuring Classifier</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.FeatureImpl#isStatic <em>Is Static</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class FeatureImpl
		extends RedefinableElementImpl
		implements Feature {

	/**
	 * The default value of the '{@link #isStatic() <em>Is Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStatic()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_STATIC_EDEFAULT = false;

	/**
	 * The flag representing the value of the '{@link #isStatic() <em>Is Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStatic()
	 * @generated
	 * @ordered
	 */
	protected static final int IS_STATIC_EFLAG = 1 << 13;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.FEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Classifier> getFeaturingClassifiersGen() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			@SuppressWarnings("unchecked")
			EList<Classifier> featuringClassifiers = (EList<Classifier>) cache
				.get(eResource, this,
					UMLPackage.Literals.FEATURE__FEATURING_CLASSIFIER);
			if (featuringClassifiers == null) {
				cache.put(eResource, this,
					UMLPackage.Literals.FEATURE__FEATURING_CLASSIFIER,
					featuringClassifiers = new DerivedUnionEObjectEList<Classifier>(
						Classifier.class, this,
						UMLPackage.FEATURE__FEATURING_CLASSIFIER, null));
			}
			return featuringClassifiers;
		}
		return new DerivedUnionEObjectEList<Classifier>(Classifier.class, this,
			UMLPackage.FEATURE__FEATURING_CLASSIFIER, null);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getFeaturingClassifiers() <em>Featuring Classifier</em>}' reference list.
	 * @see #getFeaturingClassifiers()
	 */
	protected static final int[] FEATURING_CLASSIFIER_ESUBSETS = new int[]{
		UMLPackage.FEATURE__NAMESPACE};

	public EList<Classifier> getFeaturingClassifiers() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			@SuppressWarnings("unchecked")
			EList<Classifier> featuringClassifiers = (EList<Classifier>) cache
				.get(eResource, this,
					UMLPackage.Literals.FEATURE__FEATURING_CLASSIFIER);
			if (featuringClassifiers == null) {
				cache.put(eResource, this,
					UMLPackage.Literals.FEATURE__FEATURING_CLASSIFIER,
					featuringClassifiers = new DerivedUnionEObjectEList<Classifier>(
						Classifier.class, this,
						UMLPackage.FEATURE__FEATURING_CLASSIFIER,
						FEATURING_CLASSIFIER_ESUBSETS));
			}
			return featuringClassifiers;
		}
		return new DerivedUnionEObjectEList<Classifier>(Classifier.class, this,
			UMLPackage.FEATURE__FEATURING_CLASSIFIER,
			FEATURING_CLASSIFIER_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getFeaturingClassifier(String name) {
		return getFeaturingClassifier(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getFeaturingClassifier(String name, boolean ignoreCase,
			EClass eClass) {
		featuringClassifierLoop : for (Classifier featuringClassifier : getFeaturingClassifiers()) {
			if (eClass != null && !eClass.isInstance(featuringClassifier))
				continue featuringClassifierLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(featuringClassifier.getName())
				: name.equals(featuringClassifier.getName())))
				continue featuringClassifierLoop;
			return featuringClassifier;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStatic() {
		return (eFlags & IS_STATIC_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsStatic(boolean newIsStatic) {
		boolean oldIsStatic = (eFlags & IS_STATIC_EFLAG) != 0;
		if (newIsStatic)
			eFlags |= IS_STATIC_EFLAG;
		else
			eFlags &= ~IS_STATIC_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.FEATURE__IS_STATIC, oldIsStatic, newIsStatic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.FEATURE__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.FEATURE__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.FEATURE__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.FEATURE__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.FEATURE__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.FEATURE__NAME :
				return getName();
			case UMLPackage.FEATURE__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.FEATURE__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.FEATURE__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.FEATURE__VISIBILITY :
				return getVisibility();
			case UMLPackage.FEATURE__IS_LEAF :
				return isLeaf();
			case UMLPackage.FEATURE__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.FEATURE__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.FEATURE__FEATURING_CLASSIFIER :
				return getFeaturingClassifiers();
			case UMLPackage.FEATURE__IS_STATIC :
				return isStatic();
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
			case UMLPackage.FEATURE__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations()
					.addAll((Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.FEATURE__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments()
					.addAll((Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.FEATURE__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.FEATURE__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.FEATURE__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.FEATURE__IS_LEAF :
				setIsLeaf((Boolean) newValue);
				return;
			case UMLPackage.FEATURE__IS_STATIC :
				setIsStatic((Boolean) newValue);
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
			case UMLPackage.FEATURE__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.FEATURE__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.FEATURE__NAME :
				unsetName();
				return;
			case UMLPackage.FEATURE__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.FEATURE__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.FEATURE__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.FEATURE__IS_STATIC :
				setIsStatic(IS_STATIC_EDEFAULT);
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
			case UMLPackage.FEATURE__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.FEATURE__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.FEATURE__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.FEATURE__OWNER :
				return isSetOwner();
			case UMLPackage.FEATURE__CLIENT_DEPENDENCY :
				return !getClientDependencies().isEmpty();
			case UMLPackage.FEATURE__NAME :
				return isSetName();
			case UMLPackage.FEATURE__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.FEATURE__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.FEATURE__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.FEATURE__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.FEATURE__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.FEATURE__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.FEATURE__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.FEATURE__FEATURING_CLASSIFIER :
				return isSetFeaturingClassifiers();
			case UMLPackage.FEATURE__IS_STATIC :
				return ((eFlags & IS_STATIC_EFLAG) != 0) != IS_STATIC_EDEFAULT;
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
		result.append(" (isStatic: "); //$NON-NLS-1$
		result.append((eFlags & IS_STATIC_EFLAG) != 0);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFeaturingClassifiers() {
		return false;
	}

} //FeatureImpl
