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
 * $Id: CollaborationUseImpl.java,v 1.1 2005/11/14 22:26:03 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.Collaboration;
import org.eclipse.uml2.uml.CollaborationUse;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.CollaborationUseOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Collaboration Use</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.CollaborationUseImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.CollaborationUseImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.CollaborationUseImpl#getRoleBindings <em>Role Binding</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CollaborationUseImpl
		extends NamedElementImpl
		implements CollaborationUse {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CollaborationUseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.eINSTANCE.getCollaborationUse();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getOwnedElements() {
		List ownedElement = (List) eVirtualGet(UMLPackage.COLLABORATION_USE__OWNED_ELEMENT);
		if (ownedElement == null) {
			eVirtualSet(
				UMLPackage.COLLABORATION_USE__OWNED_ELEMENT,
				ownedElement = new DerivedUnionEObjectEList(Element.class,
					this, UMLPackage.COLLABORATION_USE__OWNED_ELEMENT,
					new EStructuralFeature[]{
						UMLPackage.eINSTANCE.getElement_OwnedComment(),
						UMLPackage.eINSTANCE.getNamedElement_NameExpression(),
						UMLPackage.eINSTANCE.getCollaborationUse_RoleBinding()}));
		}
		return ownedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collaboration getType() {
		Collaboration type = (Collaboration) eVirtualGet(UMLPackage.COLLABORATION_USE__TYPE);
		if (type != null && type.eIsProxy()) {
			Collaboration oldType = type;
			type = (Collaboration) eResolveProxy((InternalEObject) type);
			if (type != oldType) {
				eVirtualSet(UMLPackage.COLLABORATION_USE__TYPE, type);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.COLLABORATION_USE__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collaboration basicGetType() {
		return (Collaboration) eVirtualGet(UMLPackage.COLLABORATION_USE__TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Collaboration newType) {
		Collaboration type = newType;
		Object oldType = eVirtualSet(UMLPackage.COLLABORATION_USE__TYPE, type);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.COLLABORATION_USE__TYPE,
				oldType == EVIRTUAL_NO_VALUE
					? null
					: oldType, type));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getRoleBindings() {
		List roleBinding = (List) eVirtualGet(UMLPackage.COLLABORATION_USE__ROLE_BINDING);
		if (roleBinding == null) {
			eVirtualSet(UMLPackage.COLLABORATION_USE__ROLE_BINDING,
				roleBinding = new EObjectContainmentEList(Dependency.class,
					this, UMLPackage.COLLABORATION_USE__ROLE_BINDING));
		}
		return roleBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dependency createRoleBinding(EClass eClass) {
		Dependency newRoleBinding = (Dependency) eClass.getEPackage()
			.getEFactoryInstance().create(eClass);
		getRoleBindings().add(newRoleBinding);
		return newRoleBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dependency createRoleBinding() {
		Dependency newRoleBinding = UMLFactory.eINSTANCE.createDependency();
		getRoleBindings().add(newRoleBinding);
		return newRoleBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dependency getRoleBinding(String name) {
		for (Iterator i = getRoleBindings().iterator(); i.hasNext();) {
			Dependency roleBinding = (Dependency) i.next();
			if (name.equals(roleBinding.getName())) {
				return roleBinding;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClientElements(DiagnosticChain diagnostics,
			Map context) {
		return CollaborationUseOperations.validateClientElements(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEveryRole(DiagnosticChain diagnostics, Map context) {
		return CollaborationUseOperations.validateEveryRole(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectors(DiagnosticChain diagnostics, Map context) {
		return CollaborationUseOperations.validateConnectors(this, diagnostics,
			context);
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
				case UMLPackage.COLLABORATION_USE__EANNOTATIONS :
					return ((InternalEList) getEAnnotations()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.COLLABORATION_USE__OWNED_COMMENT :
					return ((InternalEList) getOwnedComments()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.COLLABORATION_USE__CLIENT_DEPENDENCY :
					return ((InternalEList) getClientDependencies())
						.basicRemove(otherEnd, msgs);
				case UMLPackage.COLLABORATION_USE__NAME_EXPRESSION :
					return basicSetNameExpression(null, msgs);
				case UMLPackage.COLLABORATION_USE__ROLE_BINDING :
					return ((InternalEList) getRoleBindings()).basicRemove(
						otherEnd, msgs);
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
			case UMLPackage.COLLABORATION_USE__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.COLLABORATION_USE__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.COLLABORATION_USE__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.COLLABORATION_USE__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.COLLABORATION_USE__NAME :
				return getName();
			case UMLPackage.COLLABORATION_USE__VISIBILITY :
				return getVisibility();
			case UMLPackage.COLLABORATION_USE__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.COLLABORATION_USE__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.COLLABORATION_USE__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.COLLABORATION_USE__NAME_EXPRESSION :
				return getNameExpression();
			case UMLPackage.COLLABORATION_USE__TYPE :
				if (resolve)
					return getType();
				return basicGetType();
			case UMLPackage.COLLABORATION_USE__ROLE_BINDING :
				return getRoleBindings();
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
			case UMLPackage.COLLABORATION_USE__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.COLLABORATION_USE__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.COLLABORATION_USE__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.COLLABORATION_USE__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.COLLABORATION_USE__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.COLLABORATION_USE__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.COLLABORATION_USE__TYPE :
				setType((Collaboration) newValue);
				return;
			case UMLPackage.COLLABORATION_USE__ROLE_BINDING :
				getRoleBindings().clear();
				getRoleBindings().addAll((Collection) newValue);
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
			case UMLPackage.COLLABORATION_USE__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.COLLABORATION_USE__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.COLLABORATION_USE__NAME :
				setName(NAME_EDEFAULT);
				return;
			case UMLPackage.COLLABORATION_USE__VISIBILITY :
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UMLPackage.COLLABORATION_USE__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.COLLABORATION_USE__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.COLLABORATION_USE__TYPE :
				setType((Collaboration) null);
				return;
			case UMLPackage.COLLABORATION_USE__ROLE_BINDING :
				getRoleBindings().clear();
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
			case UMLPackage.COLLABORATION_USE__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.COLLABORATION_USE__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.COLLABORATION_USE__OWNER :
				return isSetOwner();
			case UMLPackage.COLLABORATION_USE__OWNED_COMMENT :
				List ownedComment = (List) eVirtualGet(UMLPackage.COLLABORATION_USE__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.COLLABORATION_USE__NAME :
				String name = eVirtualIsSet(UMLPackage.COLLABORATION_USE__NAME)
					? (String) eVirtualGet(UMLPackage.COLLABORATION_USE__NAME)
					: NAME_EDEFAULT;
				return NAME_EDEFAULT == null
					? name != null
					: !NAME_EDEFAULT.equals(name);
			case UMLPackage.COLLABORATION_USE__VISIBILITY :
				return eVirtualIsSet(UMLPackage.COLLABORATION_USE__VISIBILITY)
					&& eVirtualGet(UMLPackage.COLLABORATION_USE__VISIBILITY) != VISIBILITY_EDEFAULT;
			case UMLPackage.COLLABORATION_USE__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.COLLABORATION_USE__CLIENT_DEPENDENCY :
				List clientDependency = (List) eVirtualGet(UMLPackage.COLLABORATION_USE__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.COLLABORATION_USE__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.COLLABORATION_USE__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.COLLABORATION_USE__NAME_EXPRESSION) != null;
			case UMLPackage.COLLABORATION_USE__TYPE :
				return eVirtualGet(UMLPackage.COLLABORATION_USE__TYPE) != null;
			case UMLPackage.COLLABORATION_USE__ROLE_BINDING :
				List roleBinding = (List) eVirtualGet(UMLPackage.COLLABORATION_USE__ROLE_BINDING);
				return roleBinding != null && !roleBinding.isEmpty();
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
			|| eIsSet(UMLPackage.eINSTANCE.getCollaborationUse_RoleBinding());
	}

} //CollaborationUseImpl
