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
 * $Id: FeatureImpl.java,v 1.1 2005/11/14 22:26:03 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.Classifier;
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
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.FeatureImpl#getFeaturingClassifiers <em>Featuring Classifier</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.FeatureImpl#isStatic <em>Is Static</em>}</li>
 * </ul>
 * </p>
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
	protected static final int IS_STATIC_EFLAG = 1 << 9;

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
	protected EClass eStaticClass() {
		return UMLPackage.eINSTANCE.getFeature();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getFeaturingClassifiers() {
		List featuringClassifier = (List) eVirtualGet(UMLPackage.FEATURE__FEATURING_CLASSIFIER);
		if (featuringClassifier == null) {
			eVirtualSet(UMLPackage.FEATURE__FEATURING_CLASSIFIER,
				featuringClassifier = new DerivedUnionEObjectEList(
					Classifier.class, this,
					UMLPackage.FEATURE__FEATURING_CLASSIFIER,
					new EStructuralFeature[]{}));
		}
		return featuringClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getFeaturingClassifier(String name) {
		for (Iterator i = getFeaturingClassifiers().iterator(); i.hasNext();) {
			Classifier featuringClassifier = (Classifier) i.next();
			if (name.equals(featuringClassifier.getName())) {
				return featuringClassifier;
			}
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
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UMLPackage.FEATURE__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.FEATURE__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.FEATURE__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.FEATURE__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.FEATURE__NAME :
				return getName();
			case UMLPackage.FEATURE__VISIBILITY :
				return getVisibility();
			case UMLPackage.FEATURE__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.FEATURE__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.FEATURE__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.FEATURE__NAME_EXPRESSION :
				return getNameExpression();
			case UMLPackage.FEATURE__IS_LEAF :
				return isLeaf()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.FEATURE__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.FEATURE__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.FEATURE__IS_STATIC :
				return isStatic()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.FEATURE__FEATURING_CLASSIFIER :
				return getFeaturingClassifiers();
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
			case UMLPackage.FEATURE__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.FEATURE__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.FEATURE__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.FEATURE__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.FEATURE__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.FEATURE__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.FEATURE__IS_LEAF :
				setIsLeaf(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.FEATURE__IS_STATIC :
				setIsStatic(((Boolean) newValue).booleanValue());
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
			case UMLPackage.FEATURE__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.FEATURE__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.FEATURE__NAME :
				setName(NAME_EDEFAULT);
				return;
			case UMLPackage.FEATURE__VISIBILITY :
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UMLPackage.FEATURE__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.FEATURE__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.FEATURE__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.FEATURE__IS_STATIC :
				setIsStatic(IS_STATIC_EDEFAULT);
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
			case UMLPackage.FEATURE__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.FEATURE__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.FEATURE__OWNER :
				return isSetOwner();
			case UMLPackage.FEATURE__OWNED_COMMENT :
				List ownedComment = (List) eVirtualGet(UMLPackage.FEATURE__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.FEATURE__NAME :
				String name = eVirtualIsSet(UMLPackage.FEATURE__NAME)
					? (String) eVirtualGet(UMLPackage.FEATURE__NAME)
					: NAME_EDEFAULT;
				return NAME_EDEFAULT == null
					? name != null
					: !NAME_EDEFAULT.equals(name);
			case UMLPackage.FEATURE__VISIBILITY :
				return eVirtualIsSet(UMLPackage.FEATURE__VISIBILITY)
					&& eVirtualGet(UMLPackage.FEATURE__VISIBILITY) != VISIBILITY_EDEFAULT;
			case UMLPackage.FEATURE__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.FEATURE__CLIENT_DEPENDENCY :
				List clientDependency = (List) eVirtualGet(UMLPackage.FEATURE__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.FEATURE__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.FEATURE__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.FEATURE__NAME_EXPRESSION) != null;
			case UMLPackage.FEATURE__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.FEATURE__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.FEATURE__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.FEATURE__IS_STATIC :
				return ((eFlags & IS_STATIC_EFLAG) != 0) != IS_STATIC_EDEFAULT;
			case UMLPackage.FEATURE__FEATURING_CLASSIFIER :
				return isSetFeaturingClassifiers();
		}
		return eDynamicIsSet(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
