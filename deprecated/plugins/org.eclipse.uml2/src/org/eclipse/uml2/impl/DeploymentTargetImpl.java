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
 * $Id: DeploymentTargetImpl.java,v 1.27 2006/05/26 18:16:42 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.Dependency;
import org.eclipse.uml2.Deployment;
import org.eclipse.uml2.DeploymentTarget;
import org.eclipse.uml2.Element;
import org.eclipse.uml2.PackageableElement;
import org.eclipse.uml2.StringExpression;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.VisibilityKind;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;
import org.eclipse.uml2.common.util.SubsetSupersetEObjectContainmentWithInverseEList;
import org.eclipse.uml2.common.util.SubsetSupersetEObjectWithInverseResolvingEList;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.internal.operation.DeploymentTargetOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deployment Target</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.DeploymentTargetImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.DeploymentTargetImpl#getClientDependencies <em>Client Dependency</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.DeploymentTargetImpl#getDeployments <em>Deployment</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.DeploymentTargetImpl#getDeployedElements <em>Deployed Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class DeploymentTargetImpl extends NamedElementImpl implements DeploymentTarget {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getDeployments() <em>Deployment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployments()
	 * @generated
	 * @ordered
	 */
	protected EList deployments = null;

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
		return UML2Package.Literals.DEPLOYMENT_TARGET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedElements() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			EList ownedElements = (EList) cache.get(eResource, this, UML2Package.Literals.ELEMENT__OWNED_ELEMENT);
			if (ownedElements == null) {
				cache.put(eResource, this, UML2Package.Literals.ELEMENT__OWNED_ELEMENT, ownedElements = new DerivedUnionEObjectEList(Element.class, this, UML2Package.DEPLOYMENT_TARGET__OWNED_ELEMENT, OWNED_ELEMENT_ESUBSETS));
			}
			return ownedElements;
		}
		return new DerivedUnionEObjectEList(Element.class, this, UML2Package.DEPLOYMENT_TARGET__OWNED_ELEMENT, OWNED_ELEMENT_ESUBSETS);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| eIsSet(UML2Package.DEPLOYMENT_TARGET__DEPLOYMENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getDeployments() {
		if (deployments == null) {
			deployments = new SubsetSupersetEObjectContainmentWithInverseEList(Deployment.class, this, UML2Package.DEPLOYMENT_TARGET__DEPLOYMENT, DEPLOYMENT_ESUPERSETS, null, UML2Package.DEPLOYMENT__LOCATION);
		}
		return deployments;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public Deployment getDeployment(String name) {
		return getDeployment(name, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deployment getDeployment(String name, boolean ignoreCase) {
		deploymentLoop: for (Iterator i = getDeployments().iterator(); i.hasNext(); ) {
			Deployment deployment = (Deployment) i.next();
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(deployment.getName()) : name.equals(deployment.getName())))
				continue deploymentLoop;
			return deployment;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @deprecated Use #createDeployment() instead.
	 */
	public Deployment createDeployment(EClass eClass) {
		Deployment newDeployment = (Deployment) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.DEPLOYMENT_TARGET__DEPLOYMENT, null, newDeployment));
		}
		getDeployments().add(newDeployment);
		return newDeployment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Deployment createDeployment() {
		Deployment newDeployment = UML2Factory.eINSTANCE.createDeployment();
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.DEPLOYMENT_TARGET__DEPLOYMENT, null, newDeployment));
		}
		getDeployments().add(newDeployment);
		return newDeployment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList getDeployedElements() {
		CacheAdapter cache = getCacheAdapter();

		if (cache != null) {
			EList result = (EList) cache.get(this,
				UML2Package.Literals.DEPLOYMENT_TARGET__DEPLOYED_ELEMENT);

			if (result == null) {
				EList deployedElements = DeploymentTargetOperations
					.getDeployedElements(this);
				cache
					.put(
						this,
						UML2Package.Literals.DEPLOYMENT_TARGET__DEPLOYED_ELEMENT,
						result = new EcoreEList.UnmodifiableEList(
							this,
							UML2Package.Literals.DEPLOYMENT_TARGET__DEPLOYED_ELEMENT,
							deployedElements.size(), deployedElements.toArray()));
			}

			return result;
		}

		EList deployedElements = DeploymentTargetOperations
			.getDeployedElements(this);
		return new EcoreEList.UnmodifiableEList(this,
			UML2Package.Literals.DEPLOYMENT_TARGET__DEPLOYED_ELEMENT,
			deployedElements.size(), deployedElements.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public PackageableElement getDeployedElement(String name) {
		return getDeployedElement(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageableElement getDeployedElement(String name, boolean ignoreCase, EClass eClass) {
		deployedElementLoop: for (Iterator i = getDeployedElements().iterator(); i.hasNext(); ) {
			PackageableElement deployedElement = (PackageableElement) i.next();
			if (eClass != null && !eClass.isInstance(deployedElement))
				continue deployedElementLoop;
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(deployedElement.getName()) : name.equals(deployedElement.getName())))
				continue deployedElementLoop;
			return deployedElement;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UML2Package.DEPLOYMENT_TARGET__EANNOTATIONS:
				return ((InternalEList)getEAnnotations()).basicAdd(otherEnd, msgs);
			case UML2Package.DEPLOYMENT_TARGET__TEMPLATE_BINDING:
				return ((InternalEList)getTemplateBindings()).basicAdd(otherEnd, msgs);
			case UML2Package.DEPLOYMENT_TARGET__OWNED_TEMPLATE_SIGNATURE:
				if (ownedTemplateSignature != null)
					msgs = ((InternalEObject)ownedTemplateSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.DEPLOYMENT_TARGET__OWNED_TEMPLATE_SIGNATURE, null, msgs);
				return basicSetOwnedTemplateSignature((TemplateSignature)otherEnd, msgs);
			case UML2Package.DEPLOYMENT_TARGET__CLIENT_DEPENDENCY:
				return ((InternalEList)getClientDependencies()).basicAdd(otherEnd, msgs);
			case UML2Package.DEPLOYMENT_TARGET__DEPLOYMENT:
				return ((InternalEList)getDeployments()).basicAdd(otherEnd, msgs);
		}
		return eDynamicInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UML2Package.DEPLOYMENT_TARGET__EANNOTATIONS:
				return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
			case UML2Package.DEPLOYMENT_TARGET__OWNED_COMMENT:
				return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
			case UML2Package.DEPLOYMENT_TARGET__TEMPLATE_BINDING:
				return ((InternalEList)getTemplateBindings()).basicRemove(otherEnd, msgs);
			case UML2Package.DEPLOYMENT_TARGET__OWNED_TEMPLATE_SIGNATURE:
				return basicSetOwnedTemplateSignature(null, msgs);
			case UML2Package.DEPLOYMENT_TARGET__CLIENT_DEPENDENCY:
				return ((InternalEList)getClientDependencies()).basicRemove(otherEnd, msgs);
			case UML2Package.DEPLOYMENT_TARGET__NAME_EXPRESSION:
				return basicSetNameExpression(null, msgs);
			case UML2Package.DEPLOYMENT_TARGET__DEPLOYMENT:
				return ((InternalEList)getDeployments()).basicRemove(otherEnd, msgs);
		}
		return eDynamicInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getClientDependencies() {
		if (clientDependencies == null) {
			clientDependencies = new SubsetSupersetEObjectWithInverseResolvingEList.ManyInverse(Dependency.class, this, UML2Package.DEPLOYMENT_TARGET__CLIENT_DEPENDENCY, null, CLIENT_DEPENDENCY_ESUBSETS, UML2Package.DEPENDENCY__CLIENT);
		}
		return clientDependencies;
	}


	/**
	 * The array of subset feature identifiers for the '{@link #getOwnedElements() <em>Owned Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedElements()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_ELEMENT_ESUBSETS = new int[] {UML2Package.DEPLOYMENT_TARGET__OWNED_COMMENT, UML2Package.DEPLOYMENT_TARGET__TEMPLATE_BINDING, UML2Package.DEPLOYMENT_TARGET__OWNED_TEMPLATE_SIGNATURE, UML2Package.DEPLOYMENT_TARGET__NAME_EXPRESSION, UML2Package.DEPLOYMENT_TARGET__DEPLOYMENT};

	/**
	 * The array of subset feature identifiers for the '{@link #getClientDependencies() <em>Client Dependency</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientDependencies()
	 * @generated
	 * @ordered
	 */
	protected static final int[] CLIENT_DEPENDENCY_ESUBSETS = new int[] {UML2Package.DEPLOYMENT_TARGET__DEPLOYMENT};

	/**
	 * The array of superset feature identifiers for the '{@link #getDeployments() <em>Deployment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployments()
	 * @generated
	 * @ordered
	 */
	protected static final int[] DEPLOYMENT_ESUPERSETS = new int[] {UML2Package.DEPLOYMENT_TARGET__CLIENT_DEPENDENCY};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UML2Package.DEPLOYMENT_TARGET__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.DEPLOYMENT_TARGET__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.DEPLOYMENT_TARGET__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.DEPLOYMENT_TARGET__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.DEPLOYMENT_TARGET__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.DEPLOYMENT_TARGET__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UML2Package.DEPLOYMENT_TARGET__NAME:
				return getName();
			case UML2Package.DEPLOYMENT_TARGET__QUALIFIED_NAME:
				return getQualifiedName();
			case UML2Package.DEPLOYMENT_TARGET__VISIBILITY:
				return getVisibility();
			case UML2Package.DEPLOYMENT_TARGET__CLIENT_DEPENDENCY:
				return getClientDependencies();
			case UML2Package.DEPLOYMENT_TARGET__NAME_EXPRESSION:
				return getNameExpression();
			case UML2Package.DEPLOYMENT_TARGET__DEPLOYMENT:
				return getDeployments();
			case UML2Package.DEPLOYMENT_TARGET__DEPLOYED_ELEMENT:
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
			case UML2Package.DEPLOYMENT_TARGET__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.DEPLOYMENT_TARGET__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.DEPLOYMENT_TARGET__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection)newValue);
				return;
			case UML2Package.DEPLOYMENT_TARGET__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case UML2Package.DEPLOYMENT_TARGET__NAME:
				setName((String)newValue);
				return;
			case UML2Package.DEPLOYMENT_TARGET__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case UML2Package.DEPLOYMENT_TARGET__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection)newValue);
				return;
			case UML2Package.DEPLOYMENT_TARGET__NAME_EXPRESSION:
				setNameExpression((StringExpression)newValue);
				return;
			case UML2Package.DEPLOYMENT_TARGET__DEPLOYMENT:
				getDeployments().clear();
				getDeployments().addAll((Collection)newValue);
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
			case UML2Package.DEPLOYMENT_TARGET__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.DEPLOYMENT_TARGET__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.DEPLOYMENT_TARGET__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				return;
			case UML2Package.DEPLOYMENT_TARGET__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case UML2Package.DEPLOYMENT_TARGET__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UML2Package.DEPLOYMENT_TARGET__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UML2Package.DEPLOYMENT_TARGET__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				return;
			case UML2Package.DEPLOYMENT_TARGET__NAME_EXPRESSION:
				setNameExpression((StringExpression)null);
				return;
			case UML2Package.DEPLOYMENT_TARGET__DEPLOYMENT:
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
			case UML2Package.DEPLOYMENT_TARGET__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.DEPLOYMENT_TARGET__OWNED_ELEMENT:
				return isSetOwnedElements();
			case UML2Package.DEPLOYMENT_TARGET__OWNER:
				return isSetOwner();
			case UML2Package.DEPLOYMENT_TARGET__OWNED_COMMENT:
				return ownedComments != null && !ownedComments.isEmpty();
			case UML2Package.DEPLOYMENT_TARGET__TEMPLATE_BINDING:
				return templateBindings != null && !templateBindings.isEmpty();
			case UML2Package.DEPLOYMENT_TARGET__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case UML2Package.DEPLOYMENT_TARGET__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.DEPLOYMENT_TARGET__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UML2Package.DEPLOYMENT_TARGET__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case UML2Package.DEPLOYMENT_TARGET__CLIENT_DEPENDENCY:
				return clientDependencies != null && !clientDependencies.isEmpty();
			case UML2Package.DEPLOYMENT_TARGET__NAME_EXPRESSION:
				return nameExpression != null;
			case UML2Package.DEPLOYMENT_TARGET__DEPLOYMENT:
				return deployments != null && !deployments.isEmpty();
			case UML2Package.DEPLOYMENT_TARGET__DEPLOYED_ELEMENT:
				return !getDeployedElements().isEmpty();
		}
		return eDynamicIsSet(featureID);
	}


} //DeploymentTargetImpl
