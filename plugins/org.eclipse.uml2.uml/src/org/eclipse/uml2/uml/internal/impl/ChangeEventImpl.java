/*
 * Copyright (c) 2005, 2016 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 327039, 418466, 451350, 485756
 *
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.ChangeEvent;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.ValueSpecification;
import org.eclipse.uml2.uml.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Change Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ChangeEventImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ChangeEventImpl#getChangeExpression <em>Change Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChangeEventImpl
		extends EventImpl
		implements ChangeEvent {

	/**
	 * The cached value of the '{@link #getChangeExpression() <em>Change Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeExpression()
	 * @generated
	 * @ordered
	 */
	protected ValueSpecification changeExpression;

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
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.CHANGE_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Element> getOwnedElements() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			@SuppressWarnings("unchecked")
			EList<Element> ownedElements = (EList<Element>) cache.get(eResource,
				this, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
			if (ownedElements == null) {
				cache.put(eResource, this,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT,
					ownedElements = new DerivedUnionEObjectEList<Element>(
						Element.class, this,
						UMLPackage.CHANGE_EVENT__OWNED_ELEMENT,
						OWNED_ELEMENT_ESUBSETS));
			}
			return ownedElements;
		}
		return new DerivedUnionEObjectEList<Element>(Element.class, this,
			UMLPackage.CHANGE_EVENT__OWNED_ELEMENT, OWNED_ELEMENT_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getChangeExpression() {
		if (changeExpression != null && changeExpression.eIsProxy()) {
			InternalEObject oldChangeExpression = (InternalEObject) changeExpression;
			changeExpression = (ValueSpecification) eResolveProxy(
				oldChangeExpression);
			if (changeExpression != oldChangeExpression) {
				InternalEObject newChangeExpression = (InternalEObject) changeExpression;
				NotificationChain msgs = oldChangeExpression.eInverseRemove(
					this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.CHANGE_EVENT__CHANGE_EXPRESSION,
					null, null);
				if (newChangeExpression.eInternalContainer() == null) {
					msgs = newChangeExpression.eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
							- UMLPackage.CHANGE_EVENT__CHANGE_EXPRESSION,
						null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.CHANGE_EVENT__CHANGE_EXPRESSION,
						oldChangeExpression, changeExpression));
			}
		}
		return changeExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification basicGetChangeExpression() {
		return changeExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChangeExpression(
			ValueSpecification newChangeExpression, NotificationChain msgs) {
		ValueSpecification oldChangeExpression = changeExpression;
		changeExpression = newChangeExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET, UMLPackage.CHANGE_EVENT__CHANGE_EXPRESSION,
				oldChangeExpression, newChangeExpression);
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
		if (newChangeExpression != changeExpression) {
			NotificationChain msgs = null;
			if (changeExpression != null)
				msgs = ((InternalEObject) changeExpression).eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.CHANGE_EVENT__CHANGE_EXPRESSION,
					null, msgs);
			if (newChangeExpression != null)
				msgs = ((InternalEObject) newChangeExpression).eInverseAdd(this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.CHANGE_EVENT__CHANGE_EXPRESSION,
					null, msgs);
			msgs = basicSetChangeExpression(newChangeExpression, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.CHANGE_EVENT__CHANGE_EXPRESSION, newChangeExpression,
				newChangeExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification createChangeExpression(String name, Type type,
			EClass eClass) {
		ValueSpecification newChangeExpression = (ValueSpecification) create(
			eClass);
		setChangeExpression(newChangeExpression);
		if (name != null)
			newChangeExpression.setName(name);
		if (type != null)
			newChangeExpression.setType(type);
		return newChangeExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.CHANGE_EVENT__EANNOTATIONS :
				return ((InternalEList<?>) getEAnnotations())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.CHANGE_EVENT__OWNED_COMMENT :
				return ((InternalEList<?>) getOwnedComments())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.CHANGE_EVENT__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.CHANGE_EVENT__OWNING_TEMPLATE_PARAMETER :
				return basicSetOwningTemplateParameter(null, msgs);
			case UMLPackage.CHANGE_EVENT__TEMPLATE_PARAMETER :
				return basicSetTemplateParameter(null, msgs);
			case UMLPackage.CHANGE_EVENT__CHANGE_EXPRESSION :
				return basicSetChangeExpression(null, msgs);
		}
		return eDynamicInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.CHANGE_EVENT__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.CHANGE_EVENT__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.CHANGE_EVENT__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.CHANGE_EVENT__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.CHANGE_EVENT__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.CHANGE_EVENT__NAME :
				return getName();
			case UMLPackage.CHANGE_EVENT__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.CHANGE_EVENT__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.CHANGE_EVENT__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.CHANGE_EVENT__VISIBILITY :
				return getVisibility();
			case UMLPackage.CHANGE_EVENT__OWNING_TEMPLATE_PARAMETER :
				if (resolve)
					return getOwningTemplateParameter();
				return basicGetOwningTemplateParameter();
			case UMLPackage.CHANGE_EVENT__TEMPLATE_PARAMETER :
				if (resolve)
					return getTemplateParameter();
				return basicGetTemplateParameter();
			case UMLPackage.CHANGE_EVENT__CHANGE_EXPRESSION :
				if (resolve)
					return getChangeExpression();
				return basicGetChangeExpression();
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
			case UMLPackage.CHANGE_EVENT__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations()
					.addAll((Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.CHANGE_EVENT__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments()
					.addAll((Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.CHANGE_EVENT__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.CHANGE_EVENT__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.CHANGE_EVENT__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.CHANGE_EVENT__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.CHANGE_EVENT__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.CHANGE_EVENT__CHANGE_EXPRESSION :
				setChangeExpression((ValueSpecification) newValue);
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
			case UMLPackage.CHANGE_EVENT__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.CHANGE_EVENT__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.CHANGE_EVENT__NAME :
				unsetName();
				return;
			case UMLPackage.CHANGE_EVENT__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.CHANGE_EVENT__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.CHANGE_EVENT__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.CHANGE_EVENT__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.CHANGE_EVENT__CHANGE_EXPRESSION :
				setChangeExpression((ValueSpecification) null);
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
			case UMLPackage.CHANGE_EVENT__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.CHANGE_EVENT__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.CHANGE_EVENT__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.CHANGE_EVENT__OWNER :
				return isSetOwner();
			case UMLPackage.CHANGE_EVENT__CLIENT_DEPENDENCY :
				return !getClientDependencies().isEmpty();
			case UMLPackage.CHANGE_EVENT__NAME :
				return isSetName();
			case UMLPackage.CHANGE_EVENT__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.CHANGE_EVENT__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.CHANGE_EVENT__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.CHANGE_EVENT__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.CHANGE_EVENT__OWNING_TEMPLATE_PARAMETER :
				return basicGetOwningTemplateParameter() != null;
			case UMLPackage.CHANGE_EVENT__TEMPLATE_PARAMETER :
				return templateParameter != null;
			case UMLPackage.CHANGE_EVENT__CHANGE_EXPRESSION :
				return changeExpression != null;
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getOwnedElements() <em>Owned Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedElements()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_ELEMENT_ESUBSETS = new int[]{
		UMLPackage.CHANGE_EVENT__OWNED_COMMENT,
		UMLPackage.CHANGE_EVENT__NAME_EXPRESSION,
		UMLPackage.CHANGE_EVENT__CHANGE_EXPRESSION};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| eIsSet(UMLPackage.CHANGE_EVENT__CHANGE_EXPRESSION);
	}

} //ChangeEventImpl
