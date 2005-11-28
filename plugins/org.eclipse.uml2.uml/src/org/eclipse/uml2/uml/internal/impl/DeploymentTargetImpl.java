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
 * $Id: DeploymentTargetImpl.java,v 1.6 2005/11/28 20:26:02 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;
import org.eclipse.uml2.common.util.SubsetEObjectContainmentWithInverseEList;
import org.eclipse.uml2.common.util.SupersetEObjectWithInverseResolvingEList;

import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.Deployment;
import org.eclipse.uml2.uml.DeploymentTarget;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.DeploymentTargetOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deployment Target</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.DeploymentTargetImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.DeploymentTargetImpl#getClientDependencies <em>Client Dependency</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.DeploymentTargetImpl#getDeployments <em>Deployment</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.DeploymentTargetImpl#getDeployedElements <em>Deployed Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class DeploymentTargetImpl
		extends NamedElementImpl
		implements DeploymentTarget {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeploymentTargetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.Literals.DEPLOYMENT_TARGET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getOwnedElements() {
		List ownedElement = (List) eVirtualGet(UMLPackage.DEPLOYMENT_TARGET__OWNED_ELEMENT);
		if (ownedElement == null) {
			eVirtualSet(UMLPackage.DEPLOYMENT_TARGET__OWNED_ELEMENT,
				ownedElement = new DerivedUnionEObjectEList(Element.class,
					this, UMLPackage.DEPLOYMENT_TARGET__OWNED_ELEMENT,
					new int[]{UMLPackage.DEPLOYMENT_TARGET__OWNED_COMMENT,
						UMLPackage.DEPLOYMENT_TARGET__NAME_EXPRESSION,
						UMLPackage.DEPLOYMENT_TARGET__DEPLOYMENT}));
		}
		return ownedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getClientDependencies() {
		List clientDependency = (List) eVirtualGet(UMLPackage.DEPLOYMENT_TARGET__CLIENT_DEPENDENCY);
		if (clientDependency == null) {
			eVirtualSet(
				UMLPackage.DEPLOYMENT_TARGET__CLIENT_DEPENDENCY,
				clientDependency = new SupersetEObjectWithInverseResolvingEList.ManyInverse(
					Dependency.class, this,
					UMLPackage.DEPLOYMENT_TARGET__CLIENT_DEPENDENCY,
					new int[]{UMLPackage.DEPLOYMENT_TARGET__DEPLOYMENT},
					UMLPackage.DEPENDENCY__CLIENT));
		}
		return clientDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getDeployments() {
		List deployment = (List) eVirtualGet(UMLPackage.DEPLOYMENT_TARGET__DEPLOYMENT);
		if (deployment == null) {
			eVirtualSet(UMLPackage.DEPLOYMENT_TARGET__DEPLOYMENT,
				deployment = new SubsetEObjectContainmentWithInverseEList(
					Deployment.class, this,
					UMLPackage.DEPLOYMENT_TARGET__DEPLOYMENT,
					new int[]{UMLPackage.DEPLOYMENT_TARGET__CLIENT_DEPENDENCY},
					UMLPackage.DEPLOYMENT__LOCATION));
		}
		return deployment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deployment createDeployment() {
		Deployment newDeployment = UMLFactory.eINSTANCE.createDeployment();
		getDeployments().add(newDeployment);
		return newDeployment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deployment getDeployment(String name) {
		for (Iterator i = getDeployments().iterator(); i.hasNext();) {
			Deployment deployment = (Deployment) i.next();
			if (name.equals(deployment.getName())) {
				return deployment;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getDeployedElements() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			List result = (List) cache.get(this,
				UMLPackage.Literals.DEPLOYMENT_TARGET__DEPLOYED_ELEMENT);
			if (result == null) {
				cache.put(this,
					UMLPackage.Literals.DEPLOYMENT_TARGET__DEPLOYED_ELEMENT,
					result = DeploymentTargetOperations
						.getDeployedElements(this));
			}
			return result;
		}
		return DeploymentTargetOperations.getDeployedElements(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageableElement getDeployedElement(String name) {
		for (Iterator i = getDeployedElements().iterator(); i.hasNext();) {
			PackageableElement deployedElement = (PackageableElement) i.next();
			if (name.equals(deployedElement.getName())) {
				return deployedElement;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.DEPLOYMENT_TARGET__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.DEPLOYMENT_TARGET__CLIENT_DEPENDENCY :
				return ((InternalEList) getClientDependencies()).basicAdd(
					otherEnd, msgs);
			case UMLPackage.DEPLOYMENT_TARGET__DEPLOYMENT :
				return ((InternalEList) getDeployments()).basicAdd(otherEnd,
					msgs);
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
			case UMLPackage.DEPLOYMENT_TARGET__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.DEPLOYMENT_TARGET__OWNED_COMMENT :
				return ((InternalEList) getOwnedComments()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.DEPLOYMENT_TARGET__CLIENT_DEPENDENCY :
				return ((InternalEList) getClientDependencies()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.DEPLOYMENT_TARGET__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.DEPLOYMENT_TARGET__DEPLOYMENT :
				return ((InternalEList) getDeployments()).basicRemove(otherEnd,
					msgs);
		}
		return eDynamicInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.DEPLOYMENT_TARGET__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.DEPLOYMENT_TARGET__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.DEPLOYMENT_TARGET__OWNER :
				return getOwner();
			case UMLPackage.DEPLOYMENT_TARGET__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.DEPLOYMENT_TARGET__NAME :
				return getName();
			case UMLPackage.DEPLOYMENT_TARGET__VISIBILITY :
				return getVisibility();
			case UMLPackage.DEPLOYMENT_TARGET__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.DEPLOYMENT_TARGET__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.DEPLOYMENT_TARGET__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.DEPLOYMENT_TARGET__NAME_EXPRESSION :
				return getNameExpression();
			case UMLPackage.DEPLOYMENT_TARGET__DEPLOYMENT :
				return getDeployments();
			case UMLPackage.DEPLOYMENT_TARGET__DEPLOYED_ELEMENT :
				return getDeployedElements();
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
			case UMLPackage.DEPLOYMENT_TARGET__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.DEPLOYMENT_TARGET__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.DEPLOYMENT_TARGET__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.DEPLOYMENT_TARGET__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.DEPLOYMENT_TARGET__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.DEPLOYMENT_TARGET__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.DEPLOYMENT_TARGET__DEPLOYMENT :
				getDeployments().clear();
				getDeployments().addAll((Collection) newValue);
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
			case UMLPackage.DEPLOYMENT_TARGET__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.DEPLOYMENT_TARGET__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.DEPLOYMENT_TARGET__NAME :
				setName(NAME_EDEFAULT);
				return;
			case UMLPackage.DEPLOYMENT_TARGET__VISIBILITY :
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UMLPackage.DEPLOYMENT_TARGET__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.DEPLOYMENT_TARGET__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.DEPLOYMENT_TARGET__DEPLOYMENT :
				getDeployments().clear();
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
			case UMLPackage.DEPLOYMENT_TARGET__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.DEPLOYMENT_TARGET__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.DEPLOYMENT_TARGET__OWNER :
				return isSetOwner();
			case UMLPackage.DEPLOYMENT_TARGET__OWNED_COMMENT :
				List ownedComment = (List) eVirtualGet(UMLPackage.DEPLOYMENT_TARGET__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.DEPLOYMENT_TARGET__NAME :
				String name = (String) eVirtualGet(
					UMLPackage.DEPLOYMENT_TARGET__NAME, NAME_EDEFAULT);
				return NAME_EDEFAULT == null
					? name != null
					: !NAME_EDEFAULT.equals(name);
			case UMLPackage.DEPLOYMENT_TARGET__VISIBILITY :
				return eVirtualGet(UMLPackage.DEPLOYMENT_TARGET__VISIBILITY,
					VISIBILITY_EDEFAULT) != VISIBILITY_EDEFAULT;
			case UMLPackage.DEPLOYMENT_TARGET__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.DEPLOYMENT_TARGET__CLIENT_DEPENDENCY :
				List clientDependency = (List) eVirtualGet(UMLPackage.DEPLOYMENT_TARGET__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.DEPLOYMENT_TARGET__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.DEPLOYMENT_TARGET__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.DEPLOYMENT_TARGET__NAME_EXPRESSION) != null;
			case UMLPackage.DEPLOYMENT_TARGET__DEPLOYMENT :
				List deployment = (List) eVirtualGet(UMLPackage.DEPLOYMENT_TARGET__DEPLOYMENT);
				return deployment != null && !deployment.isEmpty();
			case UMLPackage.DEPLOYMENT_TARGET__DEPLOYED_ELEMENT :
				return !getDeployedElements().isEmpty();
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| eIsSet(UMLPackage.DEPLOYMENT_TARGET__DEPLOYMENT);
	}

} //DeploymentTargetImpl
