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
 * $Id: FeatureImpl.java,v 1.9 2006/01/05 13:54:02 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.Iterator;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
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
		return UMLPackage.Literals.FEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getFeaturingClassifiers() {
		EList featuringClassifier = (EList) eVirtualGet(UMLPackage.FEATURE__FEATURING_CLASSIFIER);
		if (featuringClassifier == null) {
			eVirtualSet(UMLPackage.FEATURE__FEATURING_CLASSIFIER,
				featuringClassifier = new DerivedUnionEObjectEList(
					Classifier.class, this,
					UMLPackage.FEATURE__FEATURING_CLASSIFIER, null));
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
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
		return eDynamicGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
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
		eDynamicSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
			case UMLPackage.FEATURE__VISIBILITY :
				unsetVisibility();
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
		eDynamicUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UMLPackage.FEATURE__EANNOTATIONS :
				EList eAnnotations = (EList) eVirtualGet(UMLPackage.FEATURE__EANNOTATIONS);
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.FEATURE__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.FEATURE__OWNER :
				return isSetOwner();
			case UMLPackage.FEATURE__OWNED_COMMENT :
				EList ownedComment = (EList) eVirtualGet(UMLPackage.FEATURE__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.FEATURE__NAME :
				return isSetName();
			case UMLPackage.FEATURE__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.FEATURE__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.FEATURE__CLIENT_DEPENDENCY :
				EList clientDependency = (EList) eVirtualGet(UMLPackage.FEATURE__CLIENT_DEPENDENCY);
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
		return eDynamicIsSet(featureID);
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
