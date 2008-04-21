/*
 * Copyright (c) 2005, 2008 IBM Corporation, Embarcadero Technologies, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (Embarcadero Technologies) - 204200
 *
 * $Id: ContinuationImpl.java,v 1.16 2008/04/21 16:32:41 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Continuation;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.GeneralOrdering;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.InteractionOperand;
import org.eclipse.uml2.uml.Lifeline;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.ContinuationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Continuation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ContinuationImpl#isSetting <em>Setting</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContinuationImpl
		extends InteractionFragmentImpl
		implements Continuation {

	/**
	 * The default value of the '{@link #isSetting() <em>Setting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetting()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SETTING_EDEFAULT = true;

	/**
	 * The flag representing the value of the '{@link #isSetting() <em>Setting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetting()
	 * @generated
	 * @ordered
	 */
	protected static final int SETTING_EFLAG = 1 << 12;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContinuationImpl() {
		super();
		eFlags |= SETTING_EFLAG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.CONTINUATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetting() {
		return (eFlags & SETTING_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSetting(boolean newSetting) {
		boolean oldSetting = (eFlags & SETTING_EFLAG) != 0;
		if (newSetting)
			eFlags |= SETTING_EFLAG;
		else
			eFlags &= ~SETTING_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.CONTINUATION__SETTING, oldSetting, newSetting));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSameName(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ContinuationOperations.validateSameName(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGlobal(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ContinuationOperations
			.validateGlobal(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFirstOrLastInteractionFragment(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuationOperations.validateFirstOrLastInteractionFragment(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.CONTINUATION__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.CONTINUATION__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.CONTINUATION__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.CONTINUATION__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.CONTINUATION__NAME :
				return getName();
			case UMLPackage.CONTINUATION__VISIBILITY :
				return getVisibility();
			case UMLPackage.CONTINUATION__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.CONTINUATION__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.CONTINUATION__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.CONTINUATION__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.CONTINUATION__COVERED :
				return getCovereds();
			case UMLPackage.CONTINUATION__GENERAL_ORDERING :
				return getGeneralOrderings();
			case UMLPackage.CONTINUATION__ENCLOSING_INTERACTION :
				if (resolve)
					return getEnclosingInteraction();
				return basicGetEnclosingInteraction();
			case UMLPackage.CONTINUATION__ENCLOSING_OPERAND :
				if (resolve)
					return getEnclosingOperand();
				return basicGetEnclosingOperand();
			case UMLPackage.CONTINUATION__SETTING :
				return isSetting()
					? Boolean.TRUE
					: Boolean.FALSE;
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
			case UMLPackage.CONTINUATION__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll(
					(Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.CONTINUATION__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll(
					(Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.CONTINUATION__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.CONTINUATION__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.CONTINUATION__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll(
					(Collection<? extends Dependency>) newValue);
				return;
			case UMLPackage.CONTINUATION__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.CONTINUATION__COVERED :
				getCovereds().clear();
				getCovereds().addAll((Collection<? extends Lifeline>) newValue);
				return;
			case UMLPackage.CONTINUATION__GENERAL_ORDERING :
				getGeneralOrderings().clear();
				getGeneralOrderings().addAll(
					(Collection<? extends GeneralOrdering>) newValue);
				return;
			case UMLPackage.CONTINUATION__ENCLOSING_INTERACTION :
				setEnclosingInteraction((Interaction) newValue);
				return;
			case UMLPackage.CONTINUATION__ENCLOSING_OPERAND :
				setEnclosingOperand((InteractionOperand) newValue);
				return;
			case UMLPackage.CONTINUATION__SETTING :
				setSetting(((Boolean) newValue).booleanValue());
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
			case UMLPackage.CONTINUATION__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.CONTINUATION__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.CONTINUATION__NAME :
				unsetName();
				return;
			case UMLPackage.CONTINUATION__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.CONTINUATION__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.CONTINUATION__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.CONTINUATION__COVERED :
				getCovereds().clear();
				return;
			case UMLPackage.CONTINUATION__GENERAL_ORDERING :
				getGeneralOrderings().clear();
				return;
			case UMLPackage.CONTINUATION__ENCLOSING_INTERACTION :
				setEnclosingInteraction((Interaction) null);
				return;
			case UMLPackage.CONTINUATION__ENCLOSING_OPERAND :
				setEnclosingOperand((InteractionOperand) null);
				return;
			case UMLPackage.CONTINUATION__SETTING :
				setSetting(SETTING_EDEFAULT);
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
			case UMLPackage.CONTINUATION__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.CONTINUATION__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.CONTINUATION__OWNER :
				return isSetOwner();
			case UMLPackage.CONTINUATION__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.CONTINUATION__NAME :
				return isSetName();
			case UMLPackage.CONTINUATION__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.CONTINUATION__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.CONTINUATION__CLIENT_DEPENDENCY :
				return clientDependencies != null
					&& !clientDependencies.isEmpty();
			case UMLPackage.CONTINUATION__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.CONTINUATION__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.CONTINUATION__COVERED :
				return covereds != null && !covereds.isEmpty();
			case UMLPackage.CONTINUATION__GENERAL_ORDERING :
				return generalOrderings != null && !generalOrderings.isEmpty();
			case UMLPackage.CONTINUATION__ENCLOSING_INTERACTION :
				return basicGetEnclosingInteraction() != null;
			case UMLPackage.CONTINUATION__ENCLOSING_OPERAND :
				return basicGetEnclosingOperand() != null;
			case UMLPackage.CONTINUATION__SETTING :
				return ((eFlags & SETTING_EFLAG) != 0) != SETTING_EDEFAULT;
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
		result.append(" (setting: "); //$NON-NLS-1$
		result.append((eFlags & SETTING_EFLAG) != 0);
		result.append(')');
		return result.toString();
	}

} //ContinuationImpl
