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
 * $Id: ConnectableElementImpl.java,v 1.17 2006/12/14 15:49:29 khussey Exp $
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

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.ConnectableElement;
import org.eclipse.uml2.uml.ConnectableElementTemplateParameter;
import org.eclipse.uml2.uml.ConnectorEnd;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.ParameterableElement;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.ParameterableElementOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connectable Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ConnectableElementImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ConnectableElementImpl#getTemplateParameter <em>Template Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ConnectableElementImpl#getOwningTemplateParameter <em>Owning Template Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ConnectableElementImpl#getEnds <em>End</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ConnectableElementImpl
		extends TypedElementImpl
		implements ConnectableElement {

	/**
	 * The cached value of the '{@link #getTemplateParameter() <em>Template Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateParameter()
	 * @generated
	 * @ordered
	 */
	protected TemplateParameter templateParameter = null;

	/**
	 * The cached value of the '{@link #getEnds() <em>End</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnds()
	 * @generated
	 * @ordered
	 */
	protected EList<ConnectorEnd> ends = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectableElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.CONNECTABLE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getOwner() {
		Element owner = basicGetOwner();
		return owner != null && owner.eIsProxy()
			? (Element) eResolveProxy((InternalEObject) owner)
			: owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateParameter getTemplateParameter() {
		if (templateParameter != null && templateParameter.eIsProxy()) {
			InternalEObject oldTemplateParameter = (InternalEObject) templateParameter;
			templateParameter = (TemplateParameter) eResolveProxy(oldTemplateParameter);
			if (templateParameter != oldTemplateParameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.CONNECTABLE_ELEMENT__TEMPLATE_PARAMETER,
						oldTemplateParameter, templateParameter));
			}
		}
		return templateParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateParameter basicGetTemplateParameter() {
		return templateParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemplateParameterGen(
			TemplateParameter newTemplateParameter, NotificationChain msgs) {
		TemplateParameter oldTemplateParameter = templateParameter;
		templateParameter = newTemplateParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET,
				UMLPackage.CONNECTABLE_ELEMENT__TEMPLATE_PARAMETER,
				oldTemplateParameter, newTemplateParameter);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}

		return msgs;
	}

	public NotificationChain basicSetTemplateParameter(
			TemplateParameter newTemplateParameter, NotificationChain msgs) {

		if (newTemplateParameter != null
			&& !(newTemplateParameter instanceof ConnectableElementTemplateParameter)) {

			throw new IllegalArgumentException(newTemplateParameter.toString());
		}

		msgs = basicSetTemplateParameterGen(newTemplateParameter, msgs);

		Resource.Internal eInternalResource = eInternalResource();

		if (eInternalResource == null || !eInternalResource.isLoading()) {
			TemplateParameter owningTemplateParameter = basicGetOwningTemplateParameter();

			if (owningTemplateParameter != null
				&& owningTemplateParameter != newTemplateParameter) {

				setOwningTemplateParameter(null);
			}
		}

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemplateParameter(TemplateParameter newTemplateParameter) {

		if (newTemplateParameter != templateParameter) {
			NotificationChain msgs = null;
			if (templateParameter != null)
				msgs = ((InternalEObject) templateParameter).eInverseRemove(
					this, UMLPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT,
					TemplateParameter.class, msgs);
			if (newTemplateParameter != null)
				msgs = ((InternalEObject) newTemplateParameter).eInverseAdd(
					this, UMLPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT,
					TemplateParameter.class, msgs);
			msgs = basicSetTemplateParameter(newTemplateParameter, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.CONNECTABLE_ELEMENT__TEMPLATE_PARAMETER,
				newTemplateParameter, newTemplateParameter));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTemplateParameter() {
		return templateParameter != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateParameter getOwningTemplateParameter() {
		if (eContainerFeatureID != UMLPackage.CONNECTABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER)
			return null;
		return (TemplateParameter) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateParameter basicGetOwningTemplateParameter() {
		if (eContainerFeatureID != UMLPackage.CONNECTABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER)
			return null;
		return (TemplateParameter) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningTemplateParameter(
			TemplateParameter newOwningTemplateParameter, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newOwningTemplateParameter,
			UMLPackage.CONNECTABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER, msgs);

		Resource.Internal eInternalResource = eInternalResource();
		if (eInternalResource == null || !eInternalResource.isLoading()) {
			if (newOwningTemplateParameter != null) {
				if (newOwningTemplateParameter != templateParameter) {
					setTemplateParameter(newOwningTemplateParameter);
				}
			}
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningTemplateParameter(
			TemplateParameter newOwningTemplateParameter) {

		if (newOwningTemplateParameter != eInternalContainer()
			|| (eContainerFeatureID != UMLPackage.CONNECTABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER && newOwningTemplateParameter != null)) {
			if (EcoreUtil.isAncestor(this, newOwningTemplateParameter))
				throw new IllegalArgumentException(
					"Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningTemplateParameter != null)
				msgs = ((InternalEObject) newOwningTemplateParameter)
					.eInverseAdd(
						this,
						UMLPackage.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
						TemplateParameter.class, msgs);
			msgs = basicSetOwningTemplateParameter(newOwningTemplateParameter,
				msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.CONNECTABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER,
				newOwningTemplateParameter, newOwningTemplateParameter));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConnectorEnd> getEnds() {
		if (ends == null) {
			ends = new EObjectWithInverseResolvingEList<ConnectorEnd>(
				ConnectorEnd.class, this, UMLPackage.CONNECTABLE_ELEMENT__END,
				UMLPackage.CONNECTOR_END__ROLE);
		}
		return ends;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCompatibleWith(ParameterableElement p) {
		return ParameterableElementOperations.isCompatibleWith(this, p);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTemplateParameter() {
		return ParameterableElementOperations.isTemplateParameter(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.CONNECTABLE_ELEMENT__EANNOTATIONS :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getEAnnotations())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.CONNECTABLE_ELEMENT__CLIENT_DEPENDENCY :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getClientDependencies())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.CONNECTABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningTemplateParameter(
					(TemplateParameter) otherEnd, msgs);
			case UMLPackage.CONNECTABLE_ELEMENT__TEMPLATE_PARAMETER :
				if (templateParameter != null)
					msgs = ((InternalEObject) templateParameter)
						.eInverseRemove(this,
							UMLPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT,
							TemplateParameter.class, msgs);
				return basicSetTemplateParameter((TemplateParameter) otherEnd,
					msgs);
			case UMLPackage.CONNECTABLE_ELEMENT__END :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getEnds())
					.basicAdd(otherEnd, msgs);
		}
		return eDynamicInverseAdd(otherEnd, featureID, msgs);
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
			case UMLPackage.CONNECTABLE_ELEMENT__EANNOTATIONS :
				return ((InternalEList<?>) getEAnnotations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.CONNECTABLE_ELEMENT__OWNED_COMMENT :
				return ((InternalEList<?>) getOwnedComments()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.CONNECTABLE_ELEMENT__CLIENT_DEPENDENCY :
				return ((InternalEList<?>) getClientDependencies())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.CONNECTABLE_ELEMENT__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.CONNECTABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER :
				return basicSetOwningTemplateParameter(null, msgs);
			case UMLPackage.CONNECTABLE_ELEMENT__TEMPLATE_PARAMETER :
				return basicSetTemplateParameter(null, msgs);
			case UMLPackage.CONNECTABLE_ELEMENT__END :
				return ((InternalEList<?>) getEnds()).basicRemove(otherEnd,
					msgs);
		}
		return eDynamicInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(
			NotificationChain msgs) {
		switch (eContainerFeatureID) {
			case UMLPackage.CONNECTABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER :
				return eInternalContainer().eInverseRemove(this,
					UMLPackage.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
					TemplateParameter.class, msgs);
		}
		return eDynamicBasicRemoveFromContainer(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.CONNECTABLE_ELEMENT__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.CONNECTABLE_ELEMENT__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.CONNECTABLE_ELEMENT__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.CONNECTABLE_ELEMENT__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.CONNECTABLE_ELEMENT__NAME :
				return getName();
			case UMLPackage.CONNECTABLE_ELEMENT__VISIBILITY :
				return getVisibility();
			case UMLPackage.CONNECTABLE_ELEMENT__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.CONNECTABLE_ELEMENT__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.CONNECTABLE_ELEMENT__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.CONNECTABLE_ELEMENT__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.CONNECTABLE_ELEMENT__TYPE :
				if (resolve)
					return getType();
				return basicGetType();
			case UMLPackage.CONNECTABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER :
				if (resolve)
					return getOwningTemplateParameter();
				return basicGetOwningTemplateParameter();
			case UMLPackage.CONNECTABLE_ELEMENT__TEMPLATE_PARAMETER :
				if (resolve)
					return getTemplateParameter();
				return basicGetTemplateParameter();
			case UMLPackage.CONNECTABLE_ELEMENT__END :
				return getEnds();
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
			case UMLPackage.CONNECTABLE_ELEMENT__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll(
					(Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.CONNECTABLE_ELEMENT__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll(
					(Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.CONNECTABLE_ELEMENT__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.CONNECTABLE_ELEMENT__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.CONNECTABLE_ELEMENT__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll(
					(Collection<? extends Dependency>) newValue);
				return;
			case UMLPackage.CONNECTABLE_ELEMENT__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.CONNECTABLE_ELEMENT__TYPE :
				setType((Type) newValue);
				return;
			case UMLPackage.CONNECTABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.CONNECTABLE_ELEMENT__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.CONNECTABLE_ELEMENT__END :
				getEnds().clear();
				getEnds().addAll((Collection<? extends ConnectorEnd>) newValue);
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
			case UMLPackage.CONNECTABLE_ELEMENT__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.CONNECTABLE_ELEMENT__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.CONNECTABLE_ELEMENT__NAME :
				unsetName();
				return;
			case UMLPackage.CONNECTABLE_ELEMENT__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.CONNECTABLE_ELEMENT__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.CONNECTABLE_ELEMENT__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.CONNECTABLE_ELEMENT__TYPE :
				setType((Type) null);
				return;
			case UMLPackage.CONNECTABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.CONNECTABLE_ELEMENT__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.CONNECTABLE_ELEMENT__END :
				getEnds().clear();
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
			case UMLPackage.CONNECTABLE_ELEMENT__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.CONNECTABLE_ELEMENT__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.CONNECTABLE_ELEMENT__OWNER :
				return isSetOwner();
			case UMLPackage.CONNECTABLE_ELEMENT__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.CONNECTABLE_ELEMENT__NAME :
				return isSetName();
			case UMLPackage.CONNECTABLE_ELEMENT__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.CONNECTABLE_ELEMENT__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.CONNECTABLE_ELEMENT__CLIENT_DEPENDENCY :
				return clientDependencies != null
					&& !clientDependencies.isEmpty();
			case UMLPackage.CONNECTABLE_ELEMENT__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.CONNECTABLE_ELEMENT__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.CONNECTABLE_ELEMENT__TYPE :
				return type != null;
			case UMLPackage.CONNECTABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER :
				return basicGetOwningTemplateParameter() != null;
			case UMLPackage.CONNECTABLE_ELEMENT__TEMPLATE_PARAMETER :
				return isSetTemplateParameter();
			case UMLPackage.CONNECTABLE_ELEMENT__END :
				return ends != null && !ends.isEmpty();
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ParameterableElement.class) {
			switch (derivedFeatureID) {
				case UMLPackage.CONNECTABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER :
					return UMLPackage.PARAMETERABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER;
				case UMLPackage.CONNECTABLE_ELEMENT__TEMPLATE_PARAMETER :
					return UMLPackage.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER;
				default :
					return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ParameterableElement.class) {
			switch (baseFeatureID) {
				case UMLPackage.PARAMETERABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER :
					return UMLPackage.CONNECTABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER;
				case UMLPackage.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER :
					return UMLPackage.CONNECTABLE_ELEMENT__TEMPLATE_PARAMETER;
				default :
					return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetOwner() {

		TemplateParameter owningTemplateParameter = basicGetOwningTemplateParameter();
		if (owningTemplateParameter != null) {
			return owningTemplateParameter;
		}
		return super.basicGetOwner();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOwner() {
		return super.isSetOwner()
			|| eIsSet(UMLPackage.CONNECTABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER);
	}

} //ConnectableElementImpl
