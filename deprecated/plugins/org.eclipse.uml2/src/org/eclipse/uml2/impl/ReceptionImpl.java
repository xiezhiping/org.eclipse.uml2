/*
 * Copyright (c) 2003, 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: ReceptionImpl.java,v 1.6 2005/03/15 18:44:38 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.uml2.CallConcurrencyKind;
import org.eclipse.uml2.Reception;
import org.eclipse.uml2.Signal;
import org.eclipse.uml2.StringExpression;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reception</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.ReceptionImpl#getSignal <em>Signal</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReceptionImpl extends BehavioralFeatureImpl implements Reception {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getSignal() <em>Signal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignal()
	 * @generated
	 * @ordered
	 */
	protected Signal signal = null;

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
		return UML2Package.eINSTANCE.getReception();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signal getSignal() {
		if (signal != null && signal.eIsProxy()) {
			Signal oldSignal = signal;
			signal = (Signal)eResolveProxy((InternalEObject)signal);
			if (signal != oldSignal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2Package.RECEPTION__SIGNAL, oldSignal, signal));
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
		return signal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignal(Signal newSignal) {
		Signal oldSignal = signal;
		signal = newSignal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.RECEPTION__SIGNAL, oldSignal, signal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UML2Package.RECEPTION__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicAdd(otherEnd, msgs);
				case UML2Package.RECEPTION__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicAdd(otherEnd, msgs);
				case UML2Package.RECEPTION__OWNED_TEMPLATE_SIGNATURE:
					if (ownedTemplateSignature != null)
						msgs = ((InternalEObject)ownedTemplateSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.RECEPTION__OWNED_TEMPLATE_SIGNATURE, null, msgs);
					return basicSetOwnedTemplateSignature((TemplateSignature)otherEnd, msgs);
				case UML2Package.RECEPTION__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicAdd(otherEnd, msgs);
				case UML2Package.RECEPTION__OWNED_RULE:
					return ((InternalEList)getOwnedRules()).basicAdd(otherEnd, msgs);
				case UML2Package.RECEPTION__ELEMENT_IMPORT:
					return ((InternalEList)getElementImports()).basicAdd(otherEnd, msgs);
				case UML2Package.RECEPTION__PACKAGE_IMPORT:
					return ((InternalEList)getPackageImports()).basicAdd(otherEnd, msgs);
				case UML2Package.RECEPTION__METHOD:
					return ((InternalEList)getMethods()).basicAdd(otherEnd, msgs);
				default:
					return eDynamicInverseAdd(otherEnd, featureID, baseClass, msgs);
			}
		}
		if (eContainer != null)
			msgs = eBasicRemoveFromContainer(msgs);
		return eBasicSetContainer(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UML2Package.RECEPTION__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
				case UML2Package.RECEPTION__OWNED_COMMENT:
					return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
				case UML2Package.RECEPTION__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicRemove(otherEnd, msgs);
				case UML2Package.RECEPTION__OWNED_TEMPLATE_SIGNATURE:
					return basicSetOwnedTemplateSignature(null, msgs);
				case UML2Package.RECEPTION__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicRemove(otherEnd, msgs);
				case UML2Package.RECEPTION__NAME_EXPRESSION:
					return basicSetNameExpression(null, msgs);
				case UML2Package.RECEPTION__OWNED_RULE:
					return ((InternalEList)getOwnedRules()).basicRemove(otherEnd, msgs);
				case UML2Package.RECEPTION__ELEMENT_IMPORT:
					return ((InternalEList)getElementImports()).basicRemove(otherEnd, msgs);
				case UML2Package.RECEPTION__PACKAGE_IMPORT:
					return ((InternalEList)getPackageImports()).basicRemove(otherEnd, msgs);
				case UML2Package.RECEPTION__FORMAL_PARAMETER:
					return ((InternalEList)getFormalParameters()).basicRemove(otherEnd, msgs);
				case UML2Package.RECEPTION__RETURN_RESULT:
					return ((InternalEList)getReturnResults()).basicRemove(otherEnd, msgs);
				case UML2Package.RECEPTION__METHOD:
					return ((InternalEList)getMethods()).basicRemove(otherEnd, msgs);
				default:
					return eDynamicInverseRemove(otherEnd, featureID, baseClass, msgs);
			}
		}
		return eBasicSetContainer(null, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UML2Package.RECEPTION__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.RECEPTION__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.RECEPTION__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.RECEPTION__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.RECEPTION__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.RECEPTION__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UML2Package.RECEPTION__NAME:
				return getName();
			case UML2Package.RECEPTION__QUALIFIED_NAME:
				return getQualifiedName();
			case UML2Package.RECEPTION__VISIBILITY:
				return getVisibility();
			case UML2Package.RECEPTION__CLIENT_DEPENDENCY:
				return getClientDependencies();
			case UML2Package.RECEPTION__NAME_EXPRESSION:
				return getNameExpression();
			case UML2Package.RECEPTION__MEMBER:
				return getMembers();
			case UML2Package.RECEPTION__OWNED_RULE:
				return getOwnedRules();
			case UML2Package.RECEPTION__IMPORTED_MEMBER:
				return getImportedMembers();
			case UML2Package.RECEPTION__ELEMENT_IMPORT:
				return getElementImports();
			case UML2Package.RECEPTION__PACKAGE_IMPORT:
				return getPackageImports();
			case UML2Package.RECEPTION__REDEFINITION_CONTEXT:
				return getRedefinitionContexts();
			case UML2Package.RECEPTION__IS_LEAF:
				return isLeaf() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.RECEPTION__FEATURING_CLASSIFIER:
				return getFeaturingClassifiers();
			case UML2Package.RECEPTION__IS_STATIC:
				return isStatic() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.RECEPTION__PARAMETER:
				return getParameters();
			case UML2Package.RECEPTION__FORMAL_PARAMETER:
				return getFormalParameters();
			case UML2Package.RECEPTION__RETURN_RESULT:
				return getReturnResults();
			case UML2Package.RECEPTION__RAISED_EXCEPTION:
				return getRaisedExceptions();
			case UML2Package.RECEPTION__IS_ABSTRACT:
				return isAbstract() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.RECEPTION__METHOD:
				return getMethods();
			case UML2Package.RECEPTION__CONCURRENCY:
				return getConcurrency();
			case UML2Package.RECEPTION__SIGNAL:
				if (resolve) return getSignal();
				return basicGetSignal();
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
			case UML2Package.RECEPTION__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.RECEPTION__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.RECEPTION__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection)newValue);
				return;
			case UML2Package.RECEPTION__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case UML2Package.RECEPTION__NAME:
				setName((String)newValue);
				return;
			case UML2Package.RECEPTION__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case UML2Package.RECEPTION__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection)newValue);
				return;
			case UML2Package.RECEPTION__NAME_EXPRESSION:
				setNameExpression((StringExpression)newValue);
				return;
			case UML2Package.RECEPTION__OWNED_RULE:
				getOwnedRules().clear();
				getOwnedRules().addAll((Collection)newValue);
				return;
			case UML2Package.RECEPTION__ELEMENT_IMPORT:
				getElementImports().clear();
				getElementImports().addAll((Collection)newValue);
				return;
			case UML2Package.RECEPTION__PACKAGE_IMPORT:
				getPackageImports().clear();
				getPackageImports().addAll((Collection)newValue);
				return;
			case UML2Package.RECEPTION__IS_LEAF:
				setIsLeaf(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.RECEPTION__IS_STATIC:
				setIsStatic(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.RECEPTION__FORMAL_PARAMETER:
				getFormalParameters().clear();
				getFormalParameters().addAll((Collection)newValue);
				return;
			case UML2Package.RECEPTION__RETURN_RESULT:
				getReturnResults().clear();
				getReturnResults().addAll((Collection)newValue);
				return;
			case UML2Package.RECEPTION__RAISED_EXCEPTION:
				getRaisedExceptions().clear();
				getRaisedExceptions().addAll((Collection)newValue);
				return;
			case UML2Package.RECEPTION__IS_ABSTRACT:
				setIsAbstract(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.RECEPTION__METHOD:
				getMethods().clear();
				getMethods().addAll((Collection)newValue);
				return;
			case UML2Package.RECEPTION__CONCURRENCY:
				setConcurrency((CallConcurrencyKind)newValue);
				return;
			case UML2Package.RECEPTION__SIGNAL:
				setSignal((Signal)newValue);
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
			case UML2Package.RECEPTION__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.RECEPTION__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.RECEPTION__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				return;
			case UML2Package.RECEPTION__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case UML2Package.RECEPTION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UML2Package.RECEPTION__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UML2Package.RECEPTION__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				return;
			case UML2Package.RECEPTION__NAME_EXPRESSION:
				setNameExpression((StringExpression)null);
				return;
			case UML2Package.RECEPTION__OWNED_RULE:
				getOwnedRules().clear();
				return;
			case UML2Package.RECEPTION__ELEMENT_IMPORT:
				getElementImports().clear();
				return;
			case UML2Package.RECEPTION__PACKAGE_IMPORT:
				getPackageImports().clear();
				return;
			case UML2Package.RECEPTION__IS_LEAF:
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UML2Package.RECEPTION__IS_STATIC:
				setIsStatic(IS_STATIC_EDEFAULT);
				return;
			case UML2Package.RECEPTION__FORMAL_PARAMETER:
				getFormalParameters().clear();
				return;
			case UML2Package.RECEPTION__RETURN_RESULT:
				getReturnResults().clear();
				return;
			case UML2Package.RECEPTION__RAISED_EXCEPTION:
				getRaisedExceptions().clear();
				return;
			case UML2Package.RECEPTION__IS_ABSTRACT:
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case UML2Package.RECEPTION__METHOD:
				getMethods().clear();
				return;
			case UML2Package.RECEPTION__CONCURRENCY:
				setConcurrency(CONCURRENCY_EDEFAULT);
				return;
			case UML2Package.RECEPTION__SIGNAL:
				setSignal((Signal)null);
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
			case UML2Package.RECEPTION__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.RECEPTION__OWNED_ELEMENT:
				return !getOwnedElements().isEmpty();
			case UML2Package.RECEPTION__OWNER:
				return basicGetOwner() != null;
			case UML2Package.RECEPTION__OWNED_COMMENT:
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.RECEPTION__TEMPLATE_BINDING:
				return templateBinding != null && !templateBinding.isEmpty();
			case UML2Package.RECEPTION__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case UML2Package.RECEPTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.RECEPTION__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UML2Package.RECEPTION__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case UML2Package.RECEPTION__CLIENT_DEPENDENCY:
				return clientDependency != null && !clientDependency.isEmpty();
			case UML2Package.RECEPTION__NAME_EXPRESSION:
				return nameExpression != null;
			case UML2Package.RECEPTION__MEMBER:
				return !getMembers().isEmpty();
			case UML2Package.RECEPTION__OWNED_RULE:
				return ownedRule != null && !ownedRule.isEmpty();
			case UML2Package.RECEPTION__IMPORTED_MEMBER:
				return !getImportedMembers().isEmpty();
			case UML2Package.RECEPTION__ELEMENT_IMPORT:
				return elementImport != null && !elementImport.isEmpty();
			case UML2Package.RECEPTION__PACKAGE_IMPORT:
				return packageImport != null && !packageImport.isEmpty();
			case UML2Package.RECEPTION__REDEFINITION_CONTEXT:
				return !getRedefinitionContexts().isEmpty();
			case UML2Package.RECEPTION__IS_LEAF:
				return isLeaf() != IS_LEAF_EDEFAULT;
			case UML2Package.RECEPTION__FEATURING_CLASSIFIER:
				return !getFeaturingClassifiers().isEmpty();
			case UML2Package.RECEPTION__IS_STATIC:
				return isStatic() != IS_STATIC_EDEFAULT;
			case UML2Package.RECEPTION__PARAMETER:
				return !getParameters().isEmpty();
			case UML2Package.RECEPTION__FORMAL_PARAMETER:
				return formalParameter != null && !formalParameter.isEmpty();
			case UML2Package.RECEPTION__RETURN_RESULT:
				return returnResult != null && !returnResult.isEmpty();
			case UML2Package.RECEPTION__RAISED_EXCEPTION:
				return raisedException != null && !raisedException.isEmpty();
			case UML2Package.RECEPTION__IS_ABSTRACT:
				return isAbstract() != IS_ABSTRACT_EDEFAULT;
			case UML2Package.RECEPTION__METHOD:
				return method != null && !method.isEmpty();
			case UML2Package.RECEPTION__CONCURRENCY:
				return concurrency != CONCURRENCY_EDEFAULT;
			case UML2Package.RECEPTION__SIGNAL:
				return signal != null;
		}
		return eDynamicIsSet(eFeature);
	}

} //ReceptionImpl
