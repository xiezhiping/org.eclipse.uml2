/*
 * Copyright (c) 2003, 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
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
import org.eclipse.uml2.Behavior;
import org.eclipse.uml2.OpaqueExpression;
import org.eclipse.uml2.Parameter;
import org.eclipse.uml2.StringExpression;
import org.eclipse.uml2.TemplateParameter;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.Type;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Opaque Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.OpaqueExpressionImpl#getBody <em>Body</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.OpaqueExpressionImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.OpaqueExpressionImpl#getResult <em>Result</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.OpaqueExpressionImpl#getBehavior <em>Behavior</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OpaqueExpressionImpl extends ValueSpecificationImpl implements OpaqueExpression {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

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
	 * The cached value of the '{@link #getBehavior() <em>Behavior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehavior()
	 * @generated
	 * @ordered
	 */
	protected Behavior behavior = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OpaqueExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UML2Package.eINSTANCE.getOpaqueExpression();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Body</b></em>' attribute.
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
		String oldBody = body;
		body = newBody == null ? BODY_EDEFAULT : newBody;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.OPAQUE_EXPRESSION__BODY, oldBody, body));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
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
		String oldLanguage = language;
		language = newLanguage == null ? LANGUAGE_EDEFAULT : newLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.OPAQUE_EXPRESSION__LANGUAGE, oldLanguage, language));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the derived value of the '<em><b>Result</b></em>' reference.
	 * @generated
	 */
	public Parameter getResult() {
		Parameter result = basicGetResult();
		return result == null ? null : (Parameter)eResolveProxy((InternalEObject)result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the derived value of the '<em><b>Result</b></em>' reference.
	 * @generated
	 */
	public Parameter basicGetResultGen() {
		// TODO: implement this derived basic getter to return the 'Result' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	public Parameter basicGetResult() {
		// TODO: implement this derived basic getter to return the 'Result' reference
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Behavior</b></em>' reference.
	 * @generated
	 */
	public Behavior getBehavior() {
		if (behavior != null && behavior.eIsProxy()) {
			Behavior oldBehavior = behavior;
			behavior = (Behavior)eResolveProxy((InternalEObject)behavior);
			if (behavior != oldBehavior) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2Package.OPAQUE_EXPRESSION__BEHAVIOR, oldBehavior, behavior));
			}
		}
		return behavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Behavior</b></em>' reference.
	 * @generated
	 */
	public Behavior basicGetBehavior() {
		return behavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBehavior(Behavior newBehavior) {
		Behavior oldBehavior = behavior;
		behavior = newBehavior;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.OPAQUE_EXPRESSION__BEHAVIOR, oldBehavior, behavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UML2Package.OPAQUE_EXPRESSION__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicAdd(otherEnd, msgs);
				case UML2Package.OPAQUE_EXPRESSION__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicAdd(otherEnd, msgs);
				case UML2Package.OPAQUE_EXPRESSION__OWNED_TEMPLATE_SIGNATURE:
					if (ownedTemplateSignature != null)
						msgs = ((InternalEObject)ownedTemplateSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.OPAQUE_EXPRESSION__OWNED_TEMPLATE_SIGNATURE, null, msgs);
					return basicSetOwnedTemplateSignature((TemplateSignature)otherEnd, msgs);
				case UML2Package.OPAQUE_EXPRESSION__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicAdd(otherEnd, msgs);
				case UML2Package.OPAQUE_EXPRESSION__TEMPLATE_PARAMETER:
					if (templateParameter != null)
						msgs = ((InternalEObject)templateParameter).eInverseRemove(this, UML2Package.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
					return basicSetTemplateParameter((TemplateParameter)otherEnd, msgs);
				case UML2Package.OPAQUE_EXPRESSION__OWNING_PARAMETER:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, UML2Package.OPAQUE_EXPRESSION__OWNING_PARAMETER, msgs);
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
				case UML2Package.OPAQUE_EXPRESSION__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
				case UML2Package.OPAQUE_EXPRESSION__OWNED_COMMENT:
					return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
				case UML2Package.OPAQUE_EXPRESSION__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicRemove(otherEnd, msgs);
				case UML2Package.OPAQUE_EXPRESSION__OWNED_TEMPLATE_SIGNATURE:
					return basicSetOwnedTemplateSignature(null, msgs);
				case UML2Package.OPAQUE_EXPRESSION__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicRemove(otherEnd, msgs);
				case UML2Package.OPAQUE_EXPRESSION__NAME_EXPRESSION:
					return basicSetNameExpression(null, msgs);
				case UML2Package.OPAQUE_EXPRESSION__TEMPLATE_PARAMETER:
					return basicSetTemplateParameter(null, msgs);
				case UML2Package.OPAQUE_EXPRESSION__OWNING_PARAMETER:
					return eBasicSetContainer(null, UML2Package.OPAQUE_EXPRESSION__OWNING_PARAMETER, msgs);
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
	public NotificationChain eBasicRemoveFromContainer(NotificationChain msgs) {
		if (eContainerFeatureID >= 0) {
			switch (eContainerFeatureID) {
				case UML2Package.OPAQUE_EXPRESSION__OWNING_PARAMETER:
					return eContainer.eInverseRemove(this, UML2Package.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
				default:
					return eDynamicBasicRemoveFromContainer(msgs);
			}
		}
		return eContainer.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - eContainerFeatureID, null, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UML2Package.OPAQUE_EXPRESSION__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.OPAQUE_EXPRESSION__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.OPAQUE_EXPRESSION__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.OPAQUE_EXPRESSION__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.OPAQUE_EXPRESSION__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.OPAQUE_EXPRESSION__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UML2Package.OPAQUE_EXPRESSION__NAME:
				return getName();
			case UML2Package.OPAQUE_EXPRESSION__QUALIFIED_NAME:
				return getQualifiedName();
			case UML2Package.OPAQUE_EXPRESSION__VISIBILITY:
				return getVisibility();
			case UML2Package.OPAQUE_EXPRESSION__CLIENT_DEPENDENCY:
				return getClientDependencies();
			case UML2Package.OPAQUE_EXPRESSION__NAME_EXPRESSION:
				return getNameExpression();
			case UML2Package.OPAQUE_EXPRESSION__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case UML2Package.OPAQUE_EXPRESSION__TEMPLATE_PARAMETER:
				if (resolve) return getTemplateParameter();
				return basicGetTemplateParameter();
			case UML2Package.OPAQUE_EXPRESSION__OWNING_PARAMETER:
				return getOwningParameter();
			case UML2Package.OPAQUE_EXPRESSION__BODY:
				return getBody();
			case UML2Package.OPAQUE_EXPRESSION__LANGUAGE:
				return getLanguage();
			case UML2Package.OPAQUE_EXPRESSION__RESULT:
				if (resolve) return getResult();
				return basicGetResult();
			case UML2Package.OPAQUE_EXPRESSION__BEHAVIOR:
				if (resolve) return getBehavior();
				return basicGetBehavior();
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
			case UML2Package.OPAQUE_EXPRESSION__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.OPAQUE_EXPRESSION__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.OPAQUE_EXPRESSION__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection)newValue);
				return;
			case UML2Package.OPAQUE_EXPRESSION__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case UML2Package.OPAQUE_EXPRESSION__NAME:
				setName((String)newValue);
				return;
			case UML2Package.OPAQUE_EXPRESSION__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case UML2Package.OPAQUE_EXPRESSION__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection)newValue);
				return;
			case UML2Package.OPAQUE_EXPRESSION__NAME_EXPRESSION:
				setNameExpression((StringExpression)newValue);
				return;
			case UML2Package.OPAQUE_EXPRESSION__TYPE:
				setType((Type)newValue);
				return;
			case UML2Package.OPAQUE_EXPRESSION__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)newValue);
				return;
			case UML2Package.OPAQUE_EXPRESSION__OWNING_PARAMETER:
				setOwningParameter((TemplateParameter)newValue);
				return;
			case UML2Package.OPAQUE_EXPRESSION__BODY:
				setBody((String)newValue);
				return;
			case UML2Package.OPAQUE_EXPRESSION__LANGUAGE:
				setLanguage((String)newValue);
				return;
			case UML2Package.OPAQUE_EXPRESSION__BEHAVIOR:
				setBehavior((Behavior)newValue);
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
			case UML2Package.OPAQUE_EXPRESSION__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.OPAQUE_EXPRESSION__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.OPAQUE_EXPRESSION__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				return;
			case UML2Package.OPAQUE_EXPRESSION__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case UML2Package.OPAQUE_EXPRESSION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UML2Package.OPAQUE_EXPRESSION__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UML2Package.OPAQUE_EXPRESSION__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				return;
			case UML2Package.OPAQUE_EXPRESSION__NAME_EXPRESSION:
				setNameExpression((StringExpression)null);
				return;
			case UML2Package.OPAQUE_EXPRESSION__TYPE:
				setType((Type)null);
				return;
			case UML2Package.OPAQUE_EXPRESSION__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)null);
				return;
			case UML2Package.OPAQUE_EXPRESSION__OWNING_PARAMETER:
				setOwningParameter(null);
				return;
			case UML2Package.OPAQUE_EXPRESSION__BODY:
				setBody(BODY_EDEFAULT);
				return;
			case UML2Package.OPAQUE_EXPRESSION__LANGUAGE:
				setLanguage(LANGUAGE_EDEFAULT);
				return;
			case UML2Package.OPAQUE_EXPRESSION__BEHAVIOR:
				setBehavior((Behavior)null);
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
			case UML2Package.OPAQUE_EXPRESSION__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.OPAQUE_EXPRESSION__OWNED_ELEMENT:
				return !getOwnedElements().isEmpty();
			case UML2Package.OPAQUE_EXPRESSION__OWNER:
				return basicGetOwner() != null;
			case UML2Package.OPAQUE_EXPRESSION__OWNED_COMMENT:
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.OPAQUE_EXPRESSION__TEMPLATE_BINDING:
				return templateBinding != null && !templateBinding.isEmpty();
			case UML2Package.OPAQUE_EXPRESSION__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case UML2Package.OPAQUE_EXPRESSION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.OPAQUE_EXPRESSION__QUALIFIED_NAME:
				return !"".equals(getQualifiedName()); //$NON-NLS-1$
			case UML2Package.OPAQUE_EXPRESSION__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case UML2Package.OPAQUE_EXPRESSION__CLIENT_DEPENDENCY:
				return clientDependency != null && !clientDependency.isEmpty();
			case UML2Package.OPAQUE_EXPRESSION__NAME_EXPRESSION:
				return nameExpression != null;
			case UML2Package.OPAQUE_EXPRESSION__TYPE:
				return type != null;
			case UML2Package.OPAQUE_EXPRESSION__TEMPLATE_PARAMETER:
				return templateParameter != null;
			case UML2Package.OPAQUE_EXPRESSION__OWNING_PARAMETER:
				return getOwningParameter() != null;
			case UML2Package.OPAQUE_EXPRESSION__BODY:
				return BODY_EDEFAULT == null ? body != null : !BODY_EDEFAULT.equals(body);
			case UML2Package.OPAQUE_EXPRESSION__LANGUAGE:
				return LANGUAGE_EDEFAULT == null ? language != null : !LANGUAGE_EDEFAULT.equals(language);
			case UML2Package.OPAQUE_EXPRESSION__RESULT:
				return basicGetResult() != null;
			case UML2Package.OPAQUE_EXPRESSION__BEHAVIOR:
				return behavior != null;
		}
		return eDynamicIsSet(eFeature);
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

} //OpaqueExpressionImpl
