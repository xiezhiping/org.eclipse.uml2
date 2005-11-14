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
 * $Id: ChangeEventImpl.java,v 1.1 2005/11/14 22:26:02 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.ChangeEvent;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.ValueSpecification;
import org.eclipse.uml2.uml.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Change Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ChangeEventImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ChangeEventImpl#getChangeExpression <em>Change Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChangeEventImpl
		extends EventImpl
		implements ChangeEvent {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChangeEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.eINSTANCE.getChangeEvent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getOwnedElements() {
		List ownedElement = (List) eVirtualGet(UMLPackage.CHANGE_EVENT__OWNED_ELEMENT);
		if (ownedElement == null) {
			eVirtualSet(
				UMLPackage.CHANGE_EVENT__OWNED_ELEMENT,
				ownedElement = new DerivedUnionEObjectEList(Element.class,
					this, UMLPackage.CHANGE_EVENT__OWNED_ELEMENT,
					new EStructuralFeature[]{
						UMLPackage.eINSTANCE.getElement_OwnedComment(),
						UMLPackage.eINSTANCE.getNamedElement_NameExpression(),
						UMLPackage.eINSTANCE.getChangeEvent_ChangeExpression()}));
		}
		return ownedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getChangeExpression() {
		ValueSpecification changeExpression = (ValueSpecification) eVirtualGet(UMLPackage.CHANGE_EVENT__CHANGE_EXPRESSION);
		return changeExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChangeExpression(
			ValueSpecification newChangeExpression, NotificationChain msgs) {
		Object oldChangeExpression = eVirtualSet(
			UMLPackage.CHANGE_EVENT__CHANGE_EXPRESSION, newChangeExpression);
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET, UMLPackage.CHANGE_EVENT__CHANGE_EXPRESSION,
				oldChangeExpression == EVIRTUAL_NO_VALUE
					? null
					: oldChangeExpression, newChangeExpression);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChangeExpression(ValueSpecification newChangeExpression) {
		ValueSpecification changeExpression = (ValueSpecification) eVirtualGet(UMLPackage.CHANGE_EVENT__CHANGE_EXPRESSION);
		if (newChangeExpression != changeExpression) {
			NotificationChain msgs = null;
			if (changeExpression != null)
				msgs = ((InternalEObject) changeExpression).eInverseRemove(
					this, EOPPOSITE_FEATURE_BASE
						- UMLPackage.CHANGE_EVENT__CHANGE_EXPRESSION, null,
					msgs);
			if (newChangeExpression != null)
				msgs = ((InternalEObject) newChangeExpression).eInverseAdd(
					this, EOPPOSITE_FEATURE_BASE
						- UMLPackage.CHANGE_EVENT__CHANGE_EXPRESSION, null,
					msgs);
			msgs = basicSetChangeExpression(newChangeExpression, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.CHANGE_EVENT__CHANGE_EXPRESSION,
				newChangeExpression, newChangeExpression));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification createChangeExpression(EClass eClass) {
		ValueSpecification newChangeExpression = (ValueSpecification) eClass
			.getEPackage().getEFactoryInstance().create(eClass);
		setChangeExpression(newChangeExpression);
		return newChangeExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UMLPackage.CHANGE_EVENT__EANNOTATIONS :
					return ((InternalEList) getEAnnotations()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.CHANGE_EVENT__OWNED_COMMENT :
					return ((InternalEList) getOwnedComments()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.CHANGE_EVENT__CLIENT_DEPENDENCY :
					return ((InternalEList) getClientDependencies())
						.basicRemove(otherEnd, msgs);
				case UMLPackage.CHANGE_EVENT__NAME_EXPRESSION :
					return basicSetNameExpression(null, msgs);
				case UMLPackage.CHANGE_EVENT__TEMPLATE_PARAMETER :
					return basicSetTemplateParameter(null, msgs);
				case UMLPackage.CHANGE_EVENT__OWNING_TEMPLATE_PARAMETER :
					return eBasicSetContainer(null,
						UMLPackage.CHANGE_EVENT__OWNING_TEMPLATE_PARAMETER,
						msgs);
				case UMLPackage.CHANGE_EVENT__CHANGE_EXPRESSION :
					return basicSetChangeExpression(null, msgs);
				default :
					return eDynamicInverseRemove(otherEnd, featureID,
						baseClass, msgs);
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
			case UMLPackage.CHANGE_EVENT__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.CHANGE_EVENT__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.CHANGE_EVENT__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.CHANGE_EVENT__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.CHANGE_EVENT__NAME :
				return getName();
			case UMLPackage.CHANGE_EVENT__VISIBILITY :
				return getVisibility();
			case UMLPackage.CHANGE_EVENT__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.CHANGE_EVENT__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.CHANGE_EVENT__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.CHANGE_EVENT__NAME_EXPRESSION :
				return getNameExpression();
			case UMLPackage.CHANGE_EVENT__TEMPLATE_PARAMETER :
				if (resolve)
					return getTemplateParameter();
				return basicGetTemplateParameter();
			case UMLPackage.CHANGE_EVENT__OWNING_TEMPLATE_PARAMETER :
				return getOwningTemplateParameter();
			case UMLPackage.CHANGE_EVENT__CHANGE_EXPRESSION :
				return getChangeExpression();
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
			case UMLPackage.CHANGE_EVENT__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.CHANGE_EVENT__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.CHANGE_EVENT__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.CHANGE_EVENT__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.CHANGE_EVENT__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.CHANGE_EVENT__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.CHANGE_EVENT__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.CHANGE_EVENT__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.CHANGE_EVENT__CHANGE_EXPRESSION :
				setChangeExpression((ValueSpecification) newValue);
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
			case UMLPackage.CHANGE_EVENT__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.CHANGE_EVENT__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.CHANGE_EVENT__NAME :
				setName(NAME_EDEFAULT);
				return;
			case UMLPackage.CHANGE_EVENT__VISIBILITY :
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UMLPackage.CHANGE_EVENT__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.CHANGE_EVENT__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.CHANGE_EVENT__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.CHANGE_EVENT__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.CHANGE_EVENT__CHANGE_EXPRESSION :
				setChangeExpression((ValueSpecification) null);
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
			case UMLPackage.CHANGE_EVENT__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.CHANGE_EVENT__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.CHANGE_EVENT__OWNER :
				return isSetOwner();
			case UMLPackage.CHANGE_EVENT__OWNED_COMMENT :
				List ownedComment = (List) eVirtualGet(UMLPackage.CHANGE_EVENT__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.CHANGE_EVENT__NAME :
				String name = eVirtualIsSet(UMLPackage.CHANGE_EVENT__NAME)
					? (String) eVirtualGet(UMLPackage.CHANGE_EVENT__NAME)
					: NAME_EDEFAULT;
				return NAME_EDEFAULT == null
					? name != null
					: !NAME_EDEFAULT.equals(name);
			case UMLPackage.CHANGE_EVENT__VISIBILITY :
				return eVirtualIsSet(UMLPackage.CHANGE_EVENT__VISIBILITY)
					&& eVirtualGet(UMLPackage.CHANGE_EVENT__VISIBILITY) != VISIBILITY_EDEFAULT;
			case UMLPackage.CHANGE_EVENT__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.CHANGE_EVENT__CLIENT_DEPENDENCY :
				List clientDependency = (List) eVirtualGet(UMLPackage.CHANGE_EVENT__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.CHANGE_EVENT__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.CHANGE_EVENT__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.CHANGE_EVENT__NAME_EXPRESSION) != null;
			case UMLPackage.CHANGE_EVENT__TEMPLATE_PARAMETER :
				return eVirtualGet(UMLPackage.CHANGE_EVENT__TEMPLATE_PARAMETER) != null;
			case UMLPackage.CHANGE_EVENT__OWNING_TEMPLATE_PARAMETER :
				return getOwningTemplateParameter() != null;
			case UMLPackage.CHANGE_EVENT__CHANGE_EXPRESSION :
				return eVirtualGet(UMLPackage.CHANGE_EVENT__CHANGE_EXPRESSION) != null;
		}
		return eDynamicIsSet(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| eIsSet(UMLPackage.eINSTANCE.getChangeEvent_ChangeExpression());
	}

} //ChangeEventImpl
