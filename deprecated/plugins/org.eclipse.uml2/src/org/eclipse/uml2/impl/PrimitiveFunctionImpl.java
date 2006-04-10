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
 * $Id: PrimitiveFunctionImpl.java,v 1.18 2006/04/10 20:40:18 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.uml2.PrimitiveFunction;
import org.eclipse.uml2.StringExpression;
import org.eclipse.uml2.TemplateParameter;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.UML2Package;

import org.eclipse.uml2.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Primitive Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.PrimitiveFunctionImpl#getBody <em>Body</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.PrimitiveFunctionImpl#getLanguage <em>Language</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PrimitiveFunctionImpl extends PackageableElementImpl implements PrimitiveFunction {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * The default value of the '{@link #getBody() <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected static final String BODY_EDEFAULT = ""; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected String body = BODY_EDEFAULT;

	/**
	 * The default value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final String LANGUAGE_EDEFAULT = ""; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected String language = LANGUAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrimitiveFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UML2Package.Literals.PRIMITIVE_FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBody() {
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody(String newBody) {
		newBody = newBody == null ? BODY_EDEFAULT : newBody;
		String oldBody = body;
		body = newBody;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.PRIMITIVE_FUNCTION__BODY, oldBody, body));


	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLanguage(String newLanguage) {
		newLanguage = newLanguage == null ? LANGUAGE_EDEFAULT : newLanguage;
		String oldLanguage = language;
		language = newLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.PRIMITIVE_FUNCTION__LANGUAGE, oldLanguage, language));


	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UML2Package.PRIMITIVE_FUNCTION__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.PRIMITIVE_FUNCTION__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.PRIMITIVE_FUNCTION__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.PRIMITIVE_FUNCTION__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.PRIMITIVE_FUNCTION__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.PRIMITIVE_FUNCTION__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UML2Package.PRIMITIVE_FUNCTION__NAME:
				return getName();
			case UML2Package.PRIMITIVE_FUNCTION__QUALIFIED_NAME:
				return getQualifiedName();
			case UML2Package.PRIMITIVE_FUNCTION__VISIBILITY:
				return getVisibility();
			case UML2Package.PRIMITIVE_FUNCTION__CLIENT_DEPENDENCY:
				return getClientDependencies();
			case UML2Package.PRIMITIVE_FUNCTION__NAME_EXPRESSION:
				return getNameExpression();
			case UML2Package.PRIMITIVE_FUNCTION__TEMPLATE_PARAMETER:
				if (resolve) return getTemplateParameter();
				return basicGetTemplateParameter();
			case UML2Package.PRIMITIVE_FUNCTION__OWNING_PARAMETER:
				return getOwningParameter();
			case UML2Package.PRIMITIVE_FUNCTION__PACKAGEABLE_ELEMENT_VISIBILITY:
				return getPackageableElement_visibility();
			case UML2Package.PRIMITIVE_FUNCTION__BODY:
				return getBody();
			case UML2Package.PRIMITIVE_FUNCTION__LANGUAGE:
				return getLanguage();
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
			case UML2Package.PRIMITIVE_FUNCTION__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.PRIMITIVE_FUNCTION__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.PRIMITIVE_FUNCTION__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection)newValue);
				return;
			case UML2Package.PRIMITIVE_FUNCTION__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case UML2Package.PRIMITIVE_FUNCTION__NAME:
				setName((String)newValue);
				return;
			case UML2Package.PRIMITIVE_FUNCTION__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case UML2Package.PRIMITIVE_FUNCTION__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection)newValue);
				return;
			case UML2Package.PRIMITIVE_FUNCTION__NAME_EXPRESSION:
				setNameExpression((StringExpression)newValue);
				return;
			case UML2Package.PRIMITIVE_FUNCTION__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)newValue);
				return;
			case UML2Package.PRIMITIVE_FUNCTION__OWNING_PARAMETER:
				setOwningParameter((TemplateParameter)newValue);
				return;
			case UML2Package.PRIMITIVE_FUNCTION__PACKAGEABLE_ELEMENT_VISIBILITY:
				setPackageableElement_visibility((VisibilityKind)newValue);
				return;
			case UML2Package.PRIMITIVE_FUNCTION__BODY:
				setBody((String)newValue);
				return;
			case UML2Package.PRIMITIVE_FUNCTION__LANGUAGE:
				setLanguage((String)newValue);
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
			case UML2Package.PRIMITIVE_FUNCTION__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.PRIMITIVE_FUNCTION__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.PRIMITIVE_FUNCTION__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				return;
			case UML2Package.PRIMITIVE_FUNCTION__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case UML2Package.PRIMITIVE_FUNCTION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UML2Package.PRIMITIVE_FUNCTION__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UML2Package.PRIMITIVE_FUNCTION__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				return;
			case UML2Package.PRIMITIVE_FUNCTION__NAME_EXPRESSION:
				setNameExpression((StringExpression)null);
				return;
			case UML2Package.PRIMITIVE_FUNCTION__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)null);
				return;
			case UML2Package.PRIMITIVE_FUNCTION__OWNING_PARAMETER:
				setOwningParameter((TemplateParameter)null);
				return;
			case UML2Package.PRIMITIVE_FUNCTION__PACKAGEABLE_ELEMENT_VISIBILITY:
				setPackageableElement_visibility(PACKAGEABLE_ELEMENT_VISIBILITY_EDEFAULT);
				return;
			case UML2Package.PRIMITIVE_FUNCTION__BODY:
				setBody(BODY_EDEFAULT);
				return;
			case UML2Package.PRIMITIVE_FUNCTION__LANGUAGE:
				setLanguage(LANGUAGE_EDEFAULT);
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
			case UML2Package.PRIMITIVE_FUNCTION__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.PRIMITIVE_FUNCTION__OWNED_ELEMENT:
				return isSetOwnedElements();
			case UML2Package.PRIMITIVE_FUNCTION__OWNER:
				return isSetOwner();
			case UML2Package.PRIMITIVE_FUNCTION__OWNED_COMMENT:
				return ownedComments != null && !ownedComments.isEmpty();
			case UML2Package.PRIMITIVE_FUNCTION__TEMPLATE_BINDING:
				return templateBindings != null && !templateBindings.isEmpty();
			case UML2Package.PRIMITIVE_FUNCTION__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case UML2Package.PRIMITIVE_FUNCTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.PRIMITIVE_FUNCTION__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UML2Package.PRIMITIVE_FUNCTION__VISIBILITY:
				return isSetVisibility();
			case UML2Package.PRIMITIVE_FUNCTION__CLIENT_DEPENDENCY:
				return clientDependencies != null && !clientDependencies.isEmpty();
			case UML2Package.PRIMITIVE_FUNCTION__NAME_EXPRESSION:
				return nameExpression != null;
			case UML2Package.PRIMITIVE_FUNCTION__TEMPLATE_PARAMETER:
				return templateParameter != null;
			case UML2Package.PRIMITIVE_FUNCTION__OWNING_PARAMETER:
				return getOwningParameter() != null;
			case UML2Package.PRIMITIVE_FUNCTION__PACKAGEABLE_ELEMENT_VISIBILITY:
				return isSetPackageableElement_visibility();
			case UML2Package.PRIMITIVE_FUNCTION__BODY:
				return BODY_EDEFAULT == null ? body != null : !BODY_EDEFAULT.equals(body);
			case UML2Package.PRIMITIVE_FUNCTION__LANGUAGE:
				return LANGUAGE_EDEFAULT == null ? language != null : !LANGUAGE_EDEFAULT.equals(language);
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
		result.append(" (body: "); //$NON-NLS-1$
		result.append(body);
		result.append(", language: "); //$NON-NLS-1$
		result.append(language);
		result.append(')');
		return result.toString();
	}


} //PrimitiveFunctionImpl
