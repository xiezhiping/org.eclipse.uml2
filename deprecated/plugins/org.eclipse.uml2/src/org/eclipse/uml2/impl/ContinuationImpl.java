/*
 * Copyright (c) 2003, 2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: ContinuationImpl.java,v 1.16 2006/04/10 20:40:16 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.uml2.Continuation;
import org.eclipse.uml2.Interaction;
import org.eclipse.uml2.InteractionOperand;
import org.eclipse.uml2.StringExpression;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Continuation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.ContinuationImpl#isSetting <em>Setting</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContinuationImpl extends InteractionFragmentImpl implements Continuation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

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
	protected static final int SETTING_EFLAG = 1 << 8;

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
	protected EClass eStaticClass() {
		return UML2Package.Literals.CONTINUATION;
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
		if (newSetting) eFlags |= SETTING_EFLAG; else eFlags &= ~SETTING_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.CONTINUATION__SETTING, oldSetting, newSetting));


	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UML2Package.CONTINUATION__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.CONTINUATION__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.CONTINUATION__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.CONTINUATION__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.CONTINUATION__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.CONTINUATION__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UML2Package.CONTINUATION__NAME:
				return getName();
			case UML2Package.CONTINUATION__QUALIFIED_NAME:
				return getQualifiedName();
			case UML2Package.CONTINUATION__VISIBILITY:
				return getVisibility();
			case UML2Package.CONTINUATION__CLIENT_DEPENDENCY:
				return getClientDependencies();
			case UML2Package.CONTINUATION__NAME_EXPRESSION:
				return getNameExpression();
			case UML2Package.CONTINUATION__COVERED:
				return getCovereds();
			case UML2Package.CONTINUATION__GENERAL_ORDERING:
				return getGeneralOrderings();
			case UML2Package.CONTINUATION__ENCLOSING_INTERACTION:
				return getEnclosingInteraction();
			case UML2Package.CONTINUATION__ENCLOSING_OPERAND:
				return getEnclosingOperand();
			case UML2Package.CONTINUATION__SETTING:
				return isSetting() ? Boolean.TRUE : Boolean.FALSE;
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
			case UML2Package.CONTINUATION__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.CONTINUATION__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.CONTINUATION__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection)newValue);
				return;
			case UML2Package.CONTINUATION__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case UML2Package.CONTINUATION__NAME:
				setName((String)newValue);
				return;
			case UML2Package.CONTINUATION__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case UML2Package.CONTINUATION__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection)newValue);
				return;
			case UML2Package.CONTINUATION__NAME_EXPRESSION:
				setNameExpression((StringExpression)newValue);
				return;
			case UML2Package.CONTINUATION__COVERED:
				getCovereds().clear();
				getCovereds().addAll((Collection)newValue);
				return;
			case UML2Package.CONTINUATION__GENERAL_ORDERING:
				getGeneralOrderings().clear();
				getGeneralOrderings().addAll((Collection)newValue);
				return;
			case UML2Package.CONTINUATION__ENCLOSING_INTERACTION:
				setEnclosingInteraction((Interaction)newValue);
				return;
			case UML2Package.CONTINUATION__ENCLOSING_OPERAND:
				setEnclosingOperand((InteractionOperand)newValue);
				return;
			case UML2Package.CONTINUATION__SETTING:
				setSetting(((Boolean)newValue).booleanValue());
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
			case UML2Package.CONTINUATION__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.CONTINUATION__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.CONTINUATION__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				return;
			case UML2Package.CONTINUATION__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case UML2Package.CONTINUATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UML2Package.CONTINUATION__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UML2Package.CONTINUATION__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				return;
			case UML2Package.CONTINUATION__NAME_EXPRESSION:
				setNameExpression((StringExpression)null);
				return;
			case UML2Package.CONTINUATION__COVERED:
				getCovereds().clear();
				return;
			case UML2Package.CONTINUATION__GENERAL_ORDERING:
				getGeneralOrderings().clear();
				return;
			case UML2Package.CONTINUATION__ENCLOSING_INTERACTION:
				setEnclosingInteraction((Interaction)null);
				return;
			case UML2Package.CONTINUATION__ENCLOSING_OPERAND:
				setEnclosingOperand((InteractionOperand)null);
				return;
			case UML2Package.CONTINUATION__SETTING:
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UML2Package.CONTINUATION__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.CONTINUATION__OWNED_ELEMENT:
				return isSetOwnedElements();
			case UML2Package.CONTINUATION__OWNER:
				return isSetOwner();
			case UML2Package.CONTINUATION__OWNED_COMMENT:
				return ownedComments != null && !ownedComments.isEmpty();
			case UML2Package.CONTINUATION__TEMPLATE_BINDING:
				return templateBindings != null && !templateBindings.isEmpty();
			case UML2Package.CONTINUATION__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case UML2Package.CONTINUATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.CONTINUATION__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UML2Package.CONTINUATION__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case UML2Package.CONTINUATION__CLIENT_DEPENDENCY:
				return clientDependencies != null && !clientDependencies.isEmpty();
			case UML2Package.CONTINUATION__NAME_EXPRESSION:
				return nameExpression != null;
			case UML2Package.CONTINUATION__COVERED:
				return covereds != null && !covereds.isEmpty();
			case UML2Package.CONTINUATION__GENERAL_ORDERING:
				return generalOrderings != null && !generalOrderings.isEmpty();
			case UML2Package.CONTINUATION__ENCLOSING_INTERACTION:
				return getEnclosingInteraction() != null;
			case UML2Package.CONTINUATION__ENCLOSING_OPERAND:
				return getEnclosingOperand() != null;
			case UML2Package.CONTINUATION__SETTING:
				return ((eFlags & SETTING_EFLAG) != 0) != SETTING_EDEFAULT;
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (setting: "); //$NON-NLS-1$
		result.append((eFlags & SETTING_EFLAG) != 0);
		result.append(')');
		return result.toString();
	}


} //ContinuationImpl
