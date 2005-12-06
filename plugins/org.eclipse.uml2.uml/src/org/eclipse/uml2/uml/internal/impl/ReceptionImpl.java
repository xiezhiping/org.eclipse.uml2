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
 * $Id: ReceptionImpl.java,v 1.7 2005/12/06 23:21:51 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.uml.CallConcurrencyKind;
import org.eclipse.uml2.uml.Reception;
import org.eclipse.uml2.uml.Signal;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.ReceptionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reception</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ReceptionImpl#getSignal <em>Signal</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReceptionImpl
		extends BehavioralFeatureImpl
		implements Reception {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReceptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.Literals.RECEPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signal getSignal() {
		Signal signal = (Signal) eVirtualGet(UMLPackage.RECEPTION__SIGNAL);
		if (signal != null && signal.eIsProxy()) {
			InternalEObject oldSignal = (InternalEObject) signal;
			signal = (Signal) eResolveProxy(oldSignal);
			if (signal != oldSignal) {
				eVirtualSet(UMLPackage.RECEPTION__SIGNAL, signal);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.RECEPTION__SIGNAL, oldSignal, signal));
			}
		}
		return signal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signal basicGetSignal() {
		return (Signal) eVirtualGet(UMLPackage.RECEPTION__SIGNAL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignal(Signal newSignal) {
		Signal signal = newSignal;
		Object oldSignal = eVirtualSet(UMLPackage.RECEPTION__SIGNAL, signal);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.RECEPTION__SIGNAL, oldSignal == EVIRTUAL_NO_VALUE
					? null
					: oldSignal, signal));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNotQuery(DiagnosticChain diagnostics, Map context) {
		return ReceptionOperations.validateNotQuery(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.RECEPTION__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.RECEPTION__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.RECEPTION__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.RECEPTION__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.RECEPTION__NAME :
				return getName();
			case UMLPackage.RECEPTION__VISIBILITY :
				return getVisibility();
			case UMLPackage.RECEPTION__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.RECEPTION__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.RECEPTION__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.RECEPTION__NAME_EXPRESSION :
				return getNameExpression();
			case UMLPackage.RECEPTION__ELEMENT_IMPORT :
				return getElementImports();
			case UMLPackage.RECEPTION__PACKAGE_IMPORT :
				return getPackageImports();
			case UMLPackage.RECEPTION__OWNED_RULE :
				return getOwnedRules();
			case UMLPackage.RECEPTION__MEMBER :
				return getMembers();
			case UMLPackage.RECEPTION__IMPORTED_MEMBER :
				return getImportedMembers();
			case UMLPackage.RECEPTION__OWNED_MEMBER :
				return getOwnedMembers();
			case UMLPackage.RECEPTION__IS_LEAF :
				return isLeaf()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.RECEPTION__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.RECEPTION__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.RECEPTION__IS_STATIC :
				return isStatic()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.RECEPTION__FEATURING_CLASSIFIER :
				return getFeaturingClassifiers();
			case UMLPackage.RECEPTION__OWNED_PARAMETER :
				return getOwnedParameters();
			case UMLPackage.RECEPTION__IS_ABSTRACT :
				return isAbstract()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.RECEPTION__METHOD :
				return getMethods();
			case UMLPackage.RECEPTION__CONCURRENCY :
				return getConcurrency();
			case UMLPackage.RECEPTION__RAISED_EXCEPTION :
				return getRaisedExceptions();
			case UMLPackage.RECEPTION__OWNED_PARAMETER_SET :
				return getOwnedParameterSets();
			case UMLPackage.RECEPTION__SIGNAL :
				if (resolve)
					return getSignal();
				return basicGetSignal();
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
			case UMLPackage.RECEPTION__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.RECEPTION__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.RECEPTION__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.RECEPTION__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.RECEPTION__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.RECEPTION__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.RECEPTION__ELEMENT_IMPORT :
				getElementImports().clear();
				getElementImports().addAll((Collection) newValue);
				return;
			case UMLPackage.RECEPTION__PACKAGE_IMPORT :
				getPackageImports().clear();
				getPackageImports().addAll((Collection) newValue);
				return;
			case UMLPackage.RECEPTION__OWNED_RULE :
				getOwnedRules().clear();
				getOwnedRules().addAll((Collection) newValue);
				return;
			case UMLPackage.RECEPTION__IS_LEAF :
				setIsLeaf(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.RECEPTION__IS_STATIC :
				setIsStatic(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.RECEPTION__OWNED_PARAMETER :
				getOwnedParameters().clear();
				getOwnedParameters().addAll((Collection) newValue);
				return;
			case UMLPackage.RECEPTION__IS_ABSTRACT :
				setIsAbstract(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.RECEPTION__METHOD :
				getMethods().clear();
				getMethods().addAll((Collection) newValue);
				return;
			case UMLPackage.RECEPTION__CONCURRENCY :
				setConcurrency((CallConcurrencyKind) newValue);
				return;
			case UMLPackage.RECEPTION__RAISED_EXCEPTION :
				getRaisedExceptions().clear();
				getRaisedExceptions().addAll((Collection) newValue);
				return;
			case UMLPackage.RECEPTION__OWNED_PARAMETER_SET :
				getOwnedParameterSets().clear();
				getOwnedParameterSets().addAll((Collection) newValue);
				return;
			case UMLPackage.RECEPTION__SIGNAL :
				setSignal((Signal) newValue);
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
			case UMLPackage.RECEPTION__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.RECEPTION__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.RECEPTION__NAME :
				setName(NAME_EDEFAULT);
				return;
			case UMLPackage.RECEPTION__VISIBILITY :
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UMLPackage.RECEPTION__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.RECEPTION__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.RECEPTION__ELEMENT_IMPORT :
				getElementImports().clear();
				return;
			case UMLPackage.RECEPTION__PACKAGE_IMPORT :
				getPackageImports().clear();
				return;
			case UMLPackage.RECEPTION__OWNED_RULE :
				getOwnedRules().clear();
				return;
			case UMLPackage.RECEPTION__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.RECEPTION__IS_STATIC :
				setIsStatic(IS_STATIC_EDEFAULT);
				return;
			case UMLPackage.RECEPTION__OWNED_PARAMETER :
				getOwnedParameters().clear();
				return;
			case UMLPackage.RECEPTION__IS_ABSTRACT :
				unsetIsAbstract();
				return;
			case UMLPackage.RECEPTION__METHOD :
				getMethods().clear();
				return;
			case UMLPackage.RECEPTION__CONCURRENCY :
				unsetConcurrency();
				return;
			case UMLPackage.RECEPTION__RAISED_EXCEPTION :
				getRaisedExceptions().clear();
				return;
			case UMLPackage.RECEPTION__OWNED_PARAMETER_SET :
				getOwnedParameterSets().clear();
				return;
			case UMLPackage.RECEPTION__SIGNAL :
				setSignal((Signal) null);
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
			case UMLPackage.RECEPTION__EANNOTATIONS :
				EList eAnnotations = (EList) eVirtualGet(UMLPackage.RECEPTION__EANNOTATIONS);
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.RECEPTION__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.RECEPTION__OWNER :
				return isSetOwner();
			case UMLPackage.RECEPTION__OWNED_COMMENT :
				List ownedComment = (List) eVirtualGet(UMLPackage.RECEPTION__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.RECEPTION__NAME :
				String name = (String) eVirtualGet(UMLPackage.RECEPTION__NAME,
					NAME_EDEFAULT);
				return NAME_EDEFAULT == null
					? name != null
					: !NAME_EDEFAULT.equals(name);
			case UMLPackage.RECEPTION__VISIBILITY :
				return eVirtualGet(UMLPackage.RECEPTION__VISIBILITY,
					VISIBILITY_EDEFAULT) != VISIBILITY_EDEFAULT;
			case UMLPackage.RECEPTION__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.RECEPTION__CLIENT_DEPENDENCY :
				List clientDependency = (List) eVirtualGet(UMLPackage.RECEPTION__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.RECEPTION__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.RECEPTION__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.RECEPTION__NAME_EXPRESSION) != null;
			case UMLPackage.RECEPTION__ELEMENT_IMPORT :
				List elementImport = (List) eVirtualGet(UMLPackage.RECEPTION__ELEMENT_IMPORT);
				return elementImport != null && !elementImport.isEmpty();
			case UMLPackage.RECEPTION__PACKAGE_IMPORT :
				List packageImport = (List) eVirtualGet(UMLPackage.RECEPTION__PACKAGE_IMPORT);
				return packageImport != null && !packageImport.isEmpty();
			case UMLPackage.RECEPTION__OWNED_RULE :
				List ownedRule = (List) eVirtualGet(UMLPackage.RECEPTION__OWNED_RULE);
				return ownedRule != null && !ownedRule.isEmpty();
			case UMLPackage.RECEPTION__MEMBER :
				return isSetMembers();
			case UMLPackage.RECEPTION__IMPORTED_MEMBER :
				return !getImportedMembers().isEmpty();
			case UMLPackage.RECEPTION__OWNED_MEMBER :
				return isSetOwnedMembers();
			case UMLPackage.RECEPTION__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.RECEPTION__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.RECEPTION__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.RECEPTION__IS_STATIC :
				return ((eFlags & IS_STATIC_EFLAG) != 0) != IS_STATIC_EDEFAULT;
			case UMLPackage.RECEPTION__FEATURING_CLASSIFIER :
				return isSetFeaturingClassifiers();
			case UMLPackage.RECEPTION__OWNED_PARAMETER :
				List ownedParameter = (List) eVirtualGet(UMLPackage.RECEPTION__OWNED_PARAMETER);
				return ownedParameter != null && !ownedParameter.isEmpty();
			case UMLPackage.RECEPTION__IS_ABSTRACT :
				return isSetIsAbstract();
			case UMLPackage.RECEPTION__METHOD :
				List method = (List) eVirtualGet(UMLPackage.RECEPTION__METHOD);
				return method != null && !method.isEmpty();
			case UMLPackage.RECEPTION__CONCURRENCY :
				return isSetConcurrency();
			case UMLPackage.RECEPTION__RAISED_EXCEPTION :
				List raisedException = (List) eVirtualGet(UMLPackage.RECEPTION__RAISED_EXCEPTION);
				return raisedException != null && !raisedException.isEmpty();
			case UMLPackage.RECEPTION__OWNED_PARAMETER_SET :
				List ownedParameterSet = (List) eVirtualGet(UMLPackage.RECEPTION__OWNED_PARAMETER_SET);
				return ownedParameterSet != null
					&& !ownedParameterSet.isEmpty();
			case UMLPackage.RECEPTION__SIGNAL :
				return eVirtualGet(UMLPackage.RECEPTION__SIGNAL) != null;
		}
		return eDynamicIsSet(featureID);
	}

} //ReceptionImpl
