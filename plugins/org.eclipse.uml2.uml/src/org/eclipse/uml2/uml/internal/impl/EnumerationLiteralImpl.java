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
 * $Id: EnumerationLiteralImpl.java,v 1.11 2006/03/01 17:56:37 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.ValueSpecification;
import org.eclipse.uml2.uml.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enumeration Literal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.EnumerationLiteralImpl#getEnumeration <em>Enumeration</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnumerationLiteralImpl
		extends InstanceSpecificationImpl
		implements EnumerationLiteral {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumerationLiteralImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.Literals.ENUMERATION_LITERAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumeration getEnumeration() {
		if (eContainerFeatureID != UMLPackage.ENUMERATION_LITERAL__ENUMERATION)
			return null;
		return (Enumeration) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnumeration(Enumeration newEnumeration,
			NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newEnumeration,
			UMLPackage.ENUMERATION_LITERAL__ENUMERATION, msgs);

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnumeration(Enumeration newEnumeration) {
		if (newEnumeration != eInternalContainer()
			|| (eContainerFeatureID != UMLPackage.ENUMERATION_LITERAL__ENUMERATION && newEnumeration != null)) {
			if (EcoreUtil.isAncestor(this, newEnumeration))
				throw new IllegalArgumentException(
					"Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEnumeration != null)
				msgs = ((InternalEObject) newEnumeration).eInverseAdd(this,
					UMLPackage.ENUMERATION__OWNED_LITERAL, Enumeration.class,
					msgs);
			msgs = basicSetEnumeration(newEnumeration, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.ENUMERATION_LITERAL__ENUMERATION, newEnumeration,
				newEnumeration));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.ENUMERATION_LITERAL__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.ENUMERATION_LITERAL__CLIENT_DEPENDENCY :
				return ((InternalEList) getClientDependencies()).basicAdd(
					otherEnd, msgs);
			case UMLPackage.ENUMERATION_LITERAL__DEPLOYMENT :
				return ((InternalEList) getDeployments()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.ENUMERATION_LITERAL__OWNING_TEMPLATE_PARAMETER :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningTemplateParameter(
					(TemplateParameter) otherEnd, msgs);
			case UMLPackage.ENUMERATION_LITERAL__TEMPLATE_PARAMETER :
				TemplateParameter templateParameter = (TemplateParameter) eVirtualGet(UMLPackage.ENUMERATION_LITERAL__TEMPLATE_PARAMETER);
				if (templateParameter != null)
					msgs = ((InternalEObject) templateParameter)
						.eInverseRemove(this,
							UMLPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT,
							TemplateParameter.class, msgs);
				return basicSetTemplateParameter((TemplateParameter) otherEnd,
					msgs);
			case UMLPackage.ENUMERATION_LITERAL__SLOT :
				return ((InternalEList) getSlots()).basicAdd(otherEnd, msgs);
			case UMLPackage.ENUMERATION_LITERAL__ENUMERATION :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetEnumeration((Enumeration) otherEnd, msgs);
		}
		return eDynamicInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.ENUMERATION_LITERAL__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.ENUMERATION_LITERAL__OWNED_COMMENT :
				return ((InternalEList) getOwnedComments()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.ENUMERATION_LITERAL__CLIENT_DEPENDENCY :
				return ((InternalEList) getClientDependencies()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.ENUMERATION_LITERAL__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.ENUMERATION_LITERAL__DEPLOYMENT :
				return ((InternalEList) getDeployments()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.ENUMERATION_LITERAL__OWNING_TEMPLATE_PARAMETER :
				return basicSetOwningTemplateParameter(null, msgs);
			case UMLPackage.ENUMERATION_LITERAL__TEMPLATE_PARAMETER :
				return basicSetTemplateParameter(null, msgs);
			case UMLPackage.ENUMERATION_LITERAL__SLOT :
				return ((InternalEList) getSlots()).basicRemove(otherEnd, msgs);
			case UMLPackage.ENUMERATION_LITERAL__SPECIFICATION :
				return basicSetSpecification(null, msgs);
			case UMLPackage.ENUMERATION_LITERAL__ENUMERATION :
				return basicSetEnumeration(null, msgs);
		}
		return eDynamicInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eBasicRemoveFromContainerFeature(
			NotificationChain msgs) {
		switch (eContainerFeatureID) {
			case UMLPackage.ENUMERATION_LITERAL__OWNING_TEMPLATE_PARAMETER :
				return eInternalContainer().eInverseRemove(this,
					UMLPackage.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
					TemplateParameter.class, msgs);
			case UMLPackage.ENUMERATION_LITERAL__ENUMERATION :
				return eInternalContainer().eInverseRemove(this,
					UMLPackage.ENUMERATION__OWNED_LITERAL, Enumeration.class,
					msgs);
		}
		return eDynamicBasicRemoveFromContainer(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.ENUMERATION_LITERAL__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.ENUMERATION_LITERAL__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.ENUMERATION_LITERAL__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.ENUMERATION_LITERAL__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.ENUMERATION_LITERAL__NAME :
				return getName();
			case UMLPackage.ENUMERATION_LITERAL__VISIBILITY :
				return getVisibility();
			case UMLPackage.ENUMERATION_LITERAL__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.ENUMERATION_LITERAL__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.ENUMERATION_LITERAL__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.ENUMERATION_LITERAL__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.ENUMERATION_LITERAL__DEPLOYMENT :
				return getDeployments();
			case UMLPackage.ENUMERATION_LITERAL__DEPLOYED_ELEMENT :
				return getDeployedElements();
			case UMLPackage.ENUMERATION_LITERAL__OWNING_TEMPLATE_PARAMETER :
				if (resolve)
					return getOwningTemplateParameter();
				return basicGetOwningTemplateParameter();
			case UMLPackage.ENUMERATION_LITERAL__TEMPLATE_PARAMETER :
				if (resolve)
					return getTemplateParameter();
				return basicGetTemplateParameter();
			case UMLPackage.ENUMERATION_LITERAL__CLASSIFIER :
				return getClassifiers();
			case UMLPackage.ENUMERATION_LITERAL__SLOT :
				return getSlots();
			case UMLPackage.ENUMERATION_LITERAL__SPECIFICATION :
				if (resolve)
					return getSpecification();
				return basicGetSpecification();
			case UMLPackage.ENUMERATION_LITERAL__ENUMERATION :
				return getEnumeration();
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
			case UMLPackage.ENUMERATION_LITERAL__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.ENUMERATION_LITERAL__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.ENUMERATION_LITERAL__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.ENUMERATION_LITERAL__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.ENUMERATION_LITERAL__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.ENUMERATION_LITERAL__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.ENUMERATION_LITERAL__DEPLOYMENT :
				getDeployments().clear();
				getDeployments().addAll((Collection) newValue);
				return;
			case UMLPackage.ENUMERATION_LITERAL__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.ENUMERATION_LITERAL__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.ENUMERATION_LITERAL__CLASSIFIER :
				getClassifiers().clear();
				getClassifiers().addAll((Collection) newValue);
				return;
			case UMLPackage.ENUMERATION_LITERAL__SLOT :
				getSlots().clear();
				getSlots().addAll((Collection) newValue);
				return;
			case UMLPackage.ENUMERATION_LITERAL__SPECIFICATION :
				setSpecification((ValueSpecification) newValue);
				return;
			case UMLPackage.ENUMERATION_LITERAL__ENUMERATION :
				setEnumeration((Enumeration) newValue);
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
			case UMLPackage.ENUMERATION_LITERAL__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.ENUMERATION_LITERAL__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.ENUMERATION_LITERAL__NAME :
				unsetName();
				return;
			case UMLPackage.ENUMERATION_LITERAL__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.ENUMERATION_LITERAL__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.ENUMERATION_LITERAL__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.ENUMERATION_LITERAL__DEPLOYMENT :
				getDeployments().clear();
				return;
			case UMLPackage.ENUMERATION_LITERAL__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.ENUMERATION_LITERAL__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.ENUMERATION_LITERAL__CLASSIFIER :
				getClassifiers().clear();
				return;
			case UMLPackage.ENUMERATION_LITERAL__SLOT :
				getSlots().clear();
				return;
			case UMLPackage.ENUMERATION_LITERAL__SPECIFICATION :
				setSpecification((ValueSpecification) null);
				return;
			case UMLPackage.ENUMERATION_LITERAL__ENUMERATION :
				setEnumeration((Enumeration) null);
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
			case UMLPackage.ENUMERATION_LITERAL__EANNOTATIONS :
				EList eAnnotations = (EList) eVirtualGet(UMLPackage.ENUMERATION_LITERAL__EANNOTATIONS);
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.ENUMERATION_LITERAL__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.ENUMERATION_LITERAL__OWNER :
				return isSetOwner();
			case UMLPackage.ENUMERATION_LITERAL__OWNED_COMMENT :
				EList ownedComment = (EList) eVirtualGet(UMLPackage.ENUMERATION_LITERAL__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.ENUMERATION_LITERAL__NAME :
				return isSetName();
			case UMLPackage.ENUMERATION_LITERAL__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.ENUMERATION_LITERAL__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.ENUMERATION_LITERAL__CLIENT_DEPENDENCY :
				EList clientDependency = (EList) eVirtualGet(UMLPackage.ENUMERATION_LITERAL__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.ENUMERATION_LITERAL__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.ENUMERATION_LITERAL__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.ENUMERATION_LITERAL__NAME_EXPRESSION) != null;
			case UMLPackage.ENUMERATION_LITERAL__DEPLOYMENT :
				EList deployment = (EList) eVirtualGet(UMLPackage.ENUMERATION_LITERAL__DEPLOYMENT);
				return deployment != null && !deployment.isEmpty();
			case UMLPackage.ENUMERATION_LITERAL__DEPLOYED_ELEMENT :
				return !getDeployedElements().isEmpty();
			case UMLPackage.ENUMERATION_LITERAL__OWNING_TEMPLATE_PARAMETER :
				return basicGetOwningTemplateParameter() != null;
			case UMLPackage.ENUMERATION_LITERAL__TEMPLATE_PARAMETER :
				return eVirtualGet(UMLPackage.ENUMERATION_LITERAL__TEMPLATE_PARAMETER) != null;
			case UMLPackage.ENUMERATION_LITERAL__CLASSIFIER :
				EList classifier = (EList) eVirtualGet(UMLPackage.ENUMERATION_LITERAL__CLASSIFIER);
				return classifier != null && !classifier.isEmpty();
			case UMLPackage.ENUMERATION_LITERAL__SLOT :
				EList slot = (EList) eVirtualGet(UMLPackage.ENUMERATION_LITERAL__SLOT);
				return slot != null && !slot.isEmpty();
			case UMLPackage.ENUMERATION_LITERAL__SPECIFICATION :
				return eVirtualGet(UMLPackage.ENUMERATION_LITERAL__SPECIFICATION) != null;
			case UMLPackage.ENUMERATION_LITERAL__ENUMERATION :
				return getEnumeration() != null;
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace basicGetNamespace() {
		Enumeration enumeration = getEnumeration();
		if (enumeration != null) {
			return enumeration;
		}
		return super.basicGetNamespace();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNamespace() {
		return super.isSetNamespace()
			|| eIsSet(UMLPackage.ENUMERATION_LITERAL__ENUMERATION);
	}

} //EnumerationLiteralImpl
