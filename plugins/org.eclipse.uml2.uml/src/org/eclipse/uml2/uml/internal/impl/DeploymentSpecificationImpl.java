/*
 * Copyright (c) 2005, 2009 IBM Corporation, Embarcadero Technologies, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (Embarcadero Technologies) - 204200
 *
 * $Id: DeploymentSpecificationImpl.java,v 1.23 2009/01/07 15:55:30 jbruck Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.uml.Artifact;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.CollaborationUse;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.Deployment;
import org.eclipse.uml2.uml.DeploymentSpecification;
import org.eclipse.uml2.uml.ElementImport;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.GeneralizationSet;
import org.eclipse.uml2.uml.Manifestation;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.PackageImport;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.Substitution;
import org.eclipse.uml2.uml.TemplateBinding;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.TemplateSignature;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.UseCase;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.DeploymentSpecificationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deployment Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.DeploymentSpecificationImpl#getDeploymentLocation <em>Deployment Location</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.DeploymentSpecificationImpl#getExecutionLocation <em>Execution Location</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.DeploymentSpecificationImpl#getDeployment <em>Deployment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeploymentSpecificationImpl
		extends ArtifactImpl
		implements DeploymentSpecification {

	/**
	 * The default value of the '{@link #getDeploymentLocation() <em>Deployment Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeploymentLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String DEPLOYMENT_LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeploymentLocation() <em>Deployment Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeploymentLocation()
	 * @generated
	 * @ordered
	 */
	protected String deploymentLocation = DEPLOYMENT_LOCATION_EDEFAULT;

	/**
	 * The flag representing whether the Deployment Location attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int DEPLOYMENT_LOCATION_ESETFLAG = 1 << 15;

	/**
	 * The default value of the '{@link #getExecutionLocation() <em>Execution Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String EXECUTION_LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExecutionLocation() <em>Execution Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionLocation()
	 * @generated
	 * @ordered
	 */
	protected String executionLocation = EXECUTION_LOCATION_EDEFAULT;

	/**
	 * The flag representing whether the Execution Location attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int EXECUTION_LOCATION_ESETFLAG = 1 << 16;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeploymentSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.DEPLOYMENT_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDeploymentLocation() {
		return deploymentLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeploymentLocation(String newDeploymentLocation) {
		String oldDeploymentLocation = deploymentLocation;
		deploymentLocation = newDeploymentLocation;
		boolean oldDeploymentLocationESet = (eFlags & DEPLOYMENT_LOCATION_ESETFLAG) != 0;
		eFlags |= DEPLOYMENT_LOCATION_ESETFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.DEPLOYMENT_SPECIFICATION__DEPLOYMENT_LOCATION,
				oldDeploymentLocation, deploymentLocation,
				!oldDeploymentLocationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDeploymentLocation() {
		String oldDeploymentLocation = deploymentLocation;
		boolean oldDeploymentLocationESet = (eFlags & DEPLOYMENT_LOCATION_ESETFLAG) != 0;
		deploymentLocation = DEPLOYMENT_LOCATION_EDEFAULT;
		eFlags &= ~DEPLOYMENT_LOCATION_ESETFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
				UMLPackage.DEPLOYMENT_SPECIFICATION__DEPLOYMENT_LOCATION,
				oldDeploymentLocation, DEPLOYMENT_LOCATION_EDEFAULT,
				oldDeploymentLocationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDeploymentLocation() {
		return (eFlags & DEPLOYMENT_LOCATION_ESETFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExecutionLocation() {
		return executionLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExecutionLocation(String newExecutionLocation) {
		String oldExecutionLocation = executionLocation;
		executionLocation = newExecutionLocation;
		boolean oldExecutionLocationESet = (eFlags & EXECUTION_LOCATION_ESETFLAG) != 0;
		eFlags |= EXECUTION_LOCATION_ESETFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.DEPLOYMENT_SPECIFICATION__EXECUTION_LOCATION,
				oldExecutionLocation, executionLocation,
				!oldExecutionLocationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetExecutionLocation() {
		String oldExecutionLocation = executionLocation;
		boolean oldExecutionLocationESet = (eFlags & EXECUTION_LOCATION_ESETFLAG) != 0;
		executionLocation = EXECUTION_LOCATION_EDEFAULT;
		eFlags &= ~EXECUTION_LOCATION_ESETFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
				UMLPackage.DEPLOYMENT_SPECIFICATION__EXECUTION_LOCATION,
				oldExecutionLocation, EXECUTION_LOCATION_EDEFAULT,
				oldExecutionLocationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetExecutionLocation() {
		return (eFlags & EXECUTION_LOCATION_ESETFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deployment getDeployment() {
		if (eContainerFeatureID() != UMLPackage.DEPLOYMENT_SPECIFICATION__DEPLOYMENT)
			return null;
		return (Deployment) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deployment basicGetDeployment() {
		if (eContainerFeatureID() != UMLPackage.DEPLOYMENT_SPECIFICATION__DEPLOYMENT)
			return null;
		return (Deployment) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeployment(Deployment newDeployment,
			NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newDeployment,
			UMLPackage.DEPLOYMENT_SPECIFICATION__DEPLOYMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeployment(Deployment newDeployment) {
		if (newDeployment != eInternalContainer()
			|| (eContainerFeatureID() != UMLPackage.DEPLOYMENT_SPECIFICATION__DEPLOYMENT && newDeployment != null)) {
			if (EcoreUtil.isAncestor(this, newDeployment))
				throw new IllegalArgumentException(
					"Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDeployment != null)
				msgs = ((InternalEObject) newDeployment).eInverseAdd(this,
					UMLPackage.DEPLOYMENT__CONFIGURATION, Deployment.class,
					msgs);
			msgs = basicSetDeployment(newDeployment, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.DEPLOYMENT_SPECIFICATION__DEPLOYMENT, newDeployment,
				newDeployment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeployedElements(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DeploymentSpecificationOperations.validateDeployedElements(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeploymentTarget(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DeploymentSpecificationOperations.validateDeploymentTarget(this,
			diagnostics, context);
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
			case UMLPackage.DEPLOYMENT_SPECIFICATION__EANNOTATIONS :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getEAnnotations())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.DEPLOYMENT_SPECIFICATION__CLIENT_DEPENDENCY :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getClientDependencies())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.DEPLOYMENT_SPECIFICATION__ELEMENT_IMPORT :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getElementImports())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.DEPLOYMENT_SPECIFICATION__PACKAGE_IMPORT :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getPackageImports())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNED_RULE :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getOwnedRules())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNING_TEMPLATE_PARAMETER :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningTemplateParameter(
					(TemplateParameter) otherEnd, msgs);
			case UMLPackage.DEPLOYMENT_SPECIFICATION__TEMPLATE_PARAMETER :
				if (templateParameter != null)
					msgs = ((InternalEObject) templateParameter)
						.eInverseRemove(this,
							UMLPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT,
							TemplateParameter.class, msgs);
				return basicSetTemplateParameter((TemplateParameter) otherEnd,
					msgs);
			case UMLPackage.DEPLOYMENT_SPECIFICATION__TEMPLATE_BINDING :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getTemplateBindings())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNED_TEMPLATE_SIGNATURE :
				if (ownedTemplateSignature != null)
					msgs = ((InternalEObject) ownedTemplateSignature)
						.eInverseRemove(
							this,
							EOPPOSITE_FEATURE_BASE
								- UMLPackage.DEPLOYMENT_SPECIFICATION__OWNED_TEMPLATE_SIGNATURE,
							null, msgs);
				return basicSetOwnedTemplateSignature(
					(TemplateSignature) otherEnd, msgs);
			case UMLPackage.DEPLOYMENT_SPECIFICATION__GENERALIZATION :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getGeneralizations())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.DEPLOYMENT_SPECIFICATION__POWERTYPE_EXTENT :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getPowertypeExtents())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.DEPLOYMENT_SPECIFICATION__SUBSTITUTION :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getSubstitutions())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.DEPLOYMENT_SPECIFICATION__USE_CASE :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getUseCases())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.DEPLOYMENT_SPECIFICATION__DEPLOYMENT :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDeployment((Deployment) otherEnd, msgs);
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
			case UMLPackage.DEPLOYMENT_SPECIFICATION__EANNOTATIONS :
				return ((InternalEList<?>) getEAnnotations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNED_COMMENT :
				return ((InternalEList<?>) getOwnedComments()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.DEPLOYMENT_SPECIFICATION__CLIENT_DEPENDENCY :
				return ((InternalEList<?>) getClientDependencies())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.DEPLOYMENT_SPECIFICATION__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.DEPLOYMENT_SPECIFICATION__ELEMENT_IMPORT :
				return ((InternalEList<?>) getElementImports()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.DEPLOYMENT_SPECIFICATION__PACKAGE_IMPORT :
				return ((InternalEList<?>) getPackageImports()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNED_RULE :
				return ((InternalEList<?>) getOwnedRules()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNING_TEMPLATE_PARAMETER :
				return basicSetOwningTemplateParameter(null, msgs);
			case UMLPackage.DEPLOYMENT_SPECIFICATION__TEMPLATE_PARAMETER :
				return basicSetTemplateParameter(null, msgs);
			case UMLPackage.DEPLOYMENT_SPECIFICATION__TEMPLATE_BINDING :
				return ((InternalEList<?>) getTemplateBindings()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNED_TEMPLATE_SIGNATURE :
				return basicSetOwnedTemplateSignature(null, msgs);
			case UMLPackage.DEPLOYMENT_SPECIFICATION__GENERALIZATION :
				return ((InternalEList<?>) getGeneralizations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.DEPLOYMENT_SPECIFICATION__POWERTYPE_EXTENT :
				return ((InternalEList<?>) getPowertypeExtents()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.DEPLOYMENT_SPECIFICATION__SUBSTITUTION :
				return ((InternalEList<?>) getSubstitutions()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.DEPLOYMENT_SPECIFICATION__COLLABORATION_USE :
				return ((InternalEList<?>) getCollaborationUses()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNED_USE_CASE :
				return ((InternalEList<?>) getOwnedUseCases()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.DEPLOYMENT_SPECIFICATION__USE_CASE :
				return ((InternalEList<?>) getUseCases()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.DEPLOYMENT_SPECIFICATION__NESTED_ARTIFACT :
				return ((InternalEList<?>) getNestedArtifacts()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.DEPLOYMENT_SPECIFICATION__MANIFESTATION :
				return ((InternalEList<?>) getManifestations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNED_OPERATION :
				return ((InternalEList<?>) getOwnedOperations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNED_ATTRIBUTE :
				return ((InternalEList<?>) getOwnedAttributes()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.DEPLOYMENT_SPECIFICATION__DEPLOYMENT :
				return basicSetDeployment(null, msgs);
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
		switch (eContainerFeatureID()) {
			case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNING_TEMPLATE_PARAMETER :
				return eInternalContainer().eInverseRemove(this,
					UMLPackage.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
					TemplateParameter.class, msgs);
			case UMLPackage.DEPLOYMENT_SPECIFICATION__DEPLOYMENT :
				return eInternalContainer().eInverseRemove(this,
					UMLPackage.DEPLOYMENT__CONFIGURATION, Deployment.class,
					msgs);
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
			case UMLPackage.DEPLOYMENT_SPECIFICATION__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__NAME :
				return getName();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__VISIBILITY :
				return getVisibility();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__ELEMENT_IMPORT :
				return getElementImports();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__PACKAGE_IMPORT :
				return getPackageImports();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNED_RULE :
				return getOwnedRules();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__MEMBER :
				return getMembers();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__IMPORTED_MEMBER :
				return getImportedMembers();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNED_MEMBER :
				return getOwnedMembers();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__IS_LEAF :
				return isLeaf();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNING_TEMPLATE_PARAMETER :
				if (resolve)
					return getOwningTemplateParameter();
				return basicGetOwningTemplateParameter();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__TEMPLATE_PARAMETER :
				if (resolve)
					return getTemplateParameter();
				return basicGetTemplateParameter();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__PACKAGE :
				if (resolve)
					return getPackage();
				return basicGetPackage();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__TEMPLATE_BINDING :
				return getTemplateBindings();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNED_TEMPLATE_SIGNATURE :
				if (resolve)
					return getOwnedTemplateSignature();
				return basicGetOwnedTemplateSignature();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__IS_ABSTRACT :
				return isAbstract();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__GENERALIZATION :
				return getGeneralizations();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__POWERTYPE_EXTENT :
				return getPowertypeExtents();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__FEATURE :
				return getFeatures();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__INHERITED_MEMBER :
				return getInheritedMembers();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__REDEFINED_CLASSIFIER :
				return getRedefinedClassifiers();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__GENERAL :
				return getGenerals();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__SUBSTITUTION :
				return getSubstitutions();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__ATTRIBUTE :
				return getAttributes();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__REPRESENTATION :
				if (resolve)
					return getRepresentation();
				return basicGetRepresentation();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__COLLABORATION_USE :
				return getCollaborationUses();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNED_USE_CASE :
				return getOwnedUseCases();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__USE_CASE :
				return getUseCases();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__FILE_NAME :
				return getFileName();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__NESTED_ARTIFACT :
				return getNestedArtifacts();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__MANIFESTATION :
				return getManifestations();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNED_OPERATION :
				return getOwnedOperations();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNED_ATTRIBUTE :
				return getOwnedAttributes();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__DEPLOYMENT_LOCATION :
				return getDeploymentLocation();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__EXECUTION_LOCATION :
				return getExecutionLocation();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__DEPLOYMENT :
				if (resolve)
					return getDeployment();
				return basicGetDeployment();
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
			case UMLPackage.DEPLOYMENT_SPECIFICATION__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll(
					(Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll(
					(Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll(
					(Collection<? extends Dependency>) newValue);
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__ELEMENT_IMPORT :
				getElementImports().clear();
				getElementImports().addAll(
					(Collection<? extends ElementImport>) newValue);
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__PACKAGE_IMPORT :
				getPackageImports().clear();
				getPackageImports().addAll(
					(Collection<? extends PackageImport>) newValue);
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNED_RULE :
				getOwnedRules().clear();
				getOwnedRules().addAll(
					(Collection<? extends Constraint>) newValue);
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__IS_LEAF :
				setIsLeaf((Boolean) newValue);
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__PACKAGE :
				setPackage((org.eclipse.uml2.uml.Package) newValue);
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__TEMPLATE_BINDING :
				getTemplateBindings().clear();
				getTemplateBindings().addAll(
					(Collection<? extends TemplateBinding>) newValue);
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNED_TEMPLATE_SIGNATURE :
				setOwnedTemplateSignature((TemplateSignature) newValue);
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__IS_ABSTRACT :
				setIsAbstract((Boolean) newValue);
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__GENERALIZATION :
				getGeneralizations().clear();
				getGeneralizations().addAll(
					(Collection<? extends Generalization>) newValue);
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__POWERTYPE_EXTENT :
				getPowertypeExtents().clear();
				getPowertypeExtents().addAll(
					(Collection<? extends GeneralizationSet>) newValue);
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__REDEFINED_CLASSIFIER :
				getRedefinedClassifiers().clear();
				getRedefinedClassifiers().addAll(
					(Collection<? extends Classifier>) newValue);
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__GENERAL :
				getGenerals().clear();
				getGenerals().addAll(
					(Collection<? extends Classifier>) newValue);
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__SUBSTITUTION :
				getSubstitutions().clear();
				getSubstitutions().addAll(
					(Collection<? extends Substitution>) newValue);
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__REPRESENTATION :
				setRepresentation((CollaborationUse) newValue);
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__COLLABORATION_USE :
				getCollaborationUses().clear();
				getCollaborationUses().addAll(
					(Collection<? extends CollaborationUse>) newValue);
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNED_USE_CASE :
				getOwnedUseCases().clear();
				getOwnedUseCases().addAll(
					(Collection<? extends UseCase>) newValue);
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__USE_CASE :
				getUseCases().clear();
				getUseCases().addAll((Collection<? extends UseCase>) newValue);
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__FILE_NAME :
				setFileName((String) newValue);
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__NESTED_ARTIFACT :
				getNestedArtifacts().clear();
				getNestedArtifacts().addAll(
					(Collection<? extends Artifact>) newValue);
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__MANIFESTATION :
				getManifestations().clear();
				getManifestations().addAll(
					(Collection<? extends Manifestation>) newValue);
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNED_OPERATION :
				getOwnedOperations().clear();
				getOwnedOperations().addAll(
					(Collection<? extends Operation>) newValue);
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNED_ATTRIBUTE :
				getOwnedAttributes().clear();
				getOwnedAttributes().addAll(
					(Collection<? extends Property>) newValue);
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__DEPLOYMENT_LOCATION :
				setDeploymentLocation((String) newValue);
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__EXECUTION_LOCATION :
				setExecutionLocation((String) newValue);
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__DEPLOYMENT :
				setDeployment((Deployment) newValue);
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
			case UMLPackage.DEPLOYMENT_SPECIFICATION__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__NAME :
				unsetName();
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__ELEMENT_IMPORT :
				getElementImports().clear();
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__PACKAGE_IMPORT :
				getPackageImports().clear();
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNED_RULE :
				getOwnedRules().clear();
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__PACKAGE :
				setPackage((org.eclipse.uml2.uml.Package) null);
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__TEMPLATE_BINDING :
				getTemplateBindings().clear();
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNED_TEMPLATE_SIGNATURE :
				setOwnedTemplateSignature((TemplateSignature) null);
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__IS_ABSTRACT :
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__GENERALIZATION :
				getGeneralizations().clear();
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__POWERTYPE_EXTENT :
				getPowertypeExtents().clear();
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__REDEFINED_CLASSIFIER :
				getRedefinedClassifiers().clear();
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__GENERAL :
				getGenerals().clear();
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__SUBSTITUTION :
				getSubstitutions().clear();
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__REPRESENTATION :
				setRepresentation((CollaborationUse) null);
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__COLLABORATION_USE :
				getCollaborationUses().clear();
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNED_USE_CASE :
				getOwnedUseCases().clear();
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__USE_CASE :
				getUseCases().clear();
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__FILE_NAME :
				unsetFileName();
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__NESTED_ARTIFACT :
				getNestedArtifacts().clear();
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__MANIFESTATION :
				getManifestations().clear();
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNED_OPERATION :
				getOwnedOperations().clear();
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNED_ATTRIBUTE :
				getOwnedAttributes().clear();
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__DEPLOYMENT_LOCATION :
				unsetDeploymentLocation();
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__EXECUTION_LOCATION :
				unsetExecutionLocation();
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__DEPLOYMENT :
				setDeployment((Deployment) null);
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
			case UMLPackage.DEPLOYMENT_SPECIFICATION__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNER :
				return isSetOwner();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__NAME :
				return isSetName();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.DEPLOYMENT_SPECIFICATION__CLIENT_DEPENDENCY :
				return clientDependencies != null
					&& !clientDependencies.isEmpty();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__ELEMENT_IMPORT :
				return elementImports != null && !elementImports.isEmpty();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__PACKAGE_IMPORT :
				return packageImports != null && !packageImports.isEmpty();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNED_RULE :
				return ownedRules != null && !ownedRules.isEmpty();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__MEMBER :
				return isSetMembers();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__IMPORTED_MEMBER :
				return !getImportedMembers().isEmpty();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNED_MEMBER :
				return isSetOwnedMembers();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNING_TEMPLATE_PARAMETER :
				return basicGetOwningTemplateParameter() != null;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__TEMPLATE_PARAMETER :
				return isSetTemplateParameter();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__PACKAGE :
				return basicGetPackage() != null;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__TEMPLATE_BINDING :
				return templateBindings != null && !templateBindings.isEmpty();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNED_TEMPLATE_SIGNATURE :
				return isSetOwnedTemplateSignature();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__IS_ABSTRACT :
				return ((eFlags & IS_ABSTRACT_EFLAG) != 0) != IS_ABSTRACT_EDEFAULT;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__GENERALIZATION :
				return generalizations != null && !generalizations.isEmpty();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__POWERTYPE_EXTENT :
				return powertypeExtents != null && !powertypeExtents.isEmpty();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__FEATURE :
				return isSetFeatures();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__INHERITED_MEMBER :
				return !getInheritedMembers().isEmpty();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__REDEFINED_CLASSIFIER :
				return redefinedClassifiers != null
					&& !redefinedClassifiers.isEmpty();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__GENERAL :
				return !getGenerals().isEmpty();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__SUBSTITUTION :
				return substitutions != null && !substitutions.isEmpty();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__ATTRIBUTE :
				return isSetAttributes();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__REPRESENTATION :
				return representation != null;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__COLLABORATION_USE :
				return collaborationUses != null
					&& !collaborationUses.isEmpty();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNED_USE_CASE :
				return ownedUseCases != null && !ownedUseCases.isEmpty();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__USE_CASE :
				return useCases != null && !useCases.isEmpty();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__FILE_NAME :
				return isSetFileName();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__NESTED_ARTIFACT :
				return nestedArtifacts != null && !nestedArtifacts.isEmpty();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__MANIFESTATION :
				return manifestations != null && !manifestations.isEmpty();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNED_OPERATION :
				return ownedOperations != null && !ownedOperations.isEmpty();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNED_ATTRIBUTE :
				return ownedAttributes != null && !ownedAttributes.isEmpty();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__DEPLOYMENT_LOCATION :
				return isSetDeploymentLocation();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__EXECUTION_LOCATION :
				return isSetExecutionLocation();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__DEPLOYMENT :
				return basicGetDeployment() != null;
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (deploymentLocation: "); //$NON-NLS-1$
		if ((eFlags & DEPLOYMENT_LOCATION_ESETFLAG) != 0)
			result.append(deploymentLocation);
		else
			result.append("<unset>"); //$NON-NLS-1$
		result.append(", executionLocation: "); //$NON-NLS-1$
		if ((eFlags & EXECUTION_LOCATION_ESETFLAG) != 0)
			result.append(executionLocation);
		else
			result.append("<unset>"); //$NON-NLS-1$
		result.append(')');
		return result.toString();
	}

} //DeploymentSpecificationImpl
