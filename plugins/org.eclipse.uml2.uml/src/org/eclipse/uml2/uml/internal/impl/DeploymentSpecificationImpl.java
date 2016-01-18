/*
 * Copyright (c) 2005, 2016 IBM Corporation, Embarcadero Technologies, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (Embarcadero Technologies) - 204200
 *   Kenn Hussey - 286329, 323181
 *   Kenn Hussey (CEA) - 327039, 351774, 418466, 451350, 485756
 *
 */
package org.eclipse.uml2.uml.internal.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.uml.AggregationKind;
import org.eclipse.uml2.uml.Artifact;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.CollaborationUse;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Deployment;
import org.eclipse.uml2.uml.DeploymentSpecification;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.ElementImport;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.GeneralizationSet;
import org.eclipse.uml2.uml.Manifestation;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.PackageImport;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.ParameterableElement;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.RedefinableElement;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.Substitution;
import org.eclipse.uml2.uml.TemplateBinding;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.TemplateSignature;
import org.eclipse.uml2.uml.Type;
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
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.DeploymentSpecificationImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.DeploymentSpecificationImpl#getDeploymentLocation <em>Deployment Location</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.DeploymentSpecificationImpl#getExecutionLocation <em>Execution Location</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.DeploymentSpecificationImpl#getDeployment <em>Deployment</em>}</li>
 * </ul>
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
	protected static final int DEPLOYMENT_LOCATION_ESETFLAG = 1 << 16;

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
	protected static final int EXECUTION_LOCATION_ESETFLAG = 1 << 17;

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
	@Override
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
	@Override
	public Element basicGetOwner() {
		Deployment deployment = basicGetDeployment();
		if (deployment != null) {
			return deployment;
		}
		return super.basicGetOwner();
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
		boolean oldDeploymentLocationESet = (eFlags
			& DEPLOYMENT_LOCATION_ESETFLAG) != 0;
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
		boolean oldDeploymentLocationESet = (eFlags
			& DEPLOYMENT_LOCATION_ESETFLAG) != 0;
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
		boolean oldExecutionLocationESet = (eFlags
			& EXECUTION_LOCATION_ESETFLAG) != 0;
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
		boolean oldExecutionLocationESet = (eFlags
			& EXECUTION_LOCATION_ESETFLAG) != 0;
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
			|| (eContainerFeatureID() != UMLPackage.DEPLOYMENT_SPECIFICATION__DEPLOYMENT
				&& newDeployment != null)) {
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
			case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNED_RULE :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getOwnedRules())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.DEPLOYMENT_SPECIFICATION__ELEMENT_IMPORT :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getElementImports())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.DEPLOYMENT_SPECIFICATION__PACKAGE_IMPORT :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getPackageImports())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNING_TEMPLATE_PARAMETER :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningTemplateParameter(
					(TemplateParameter) otherEnd, msgs);
			case UMLPackage.DEPLOYMENT_SPECIFICATION__TEMPLATE_PARAMETER :
				if (templateParameter != null)
					msgs = ((InternalEObject) templateParameter).eInverseRemove(
						this,
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
						.eInverseRemove(this,
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
			case UMLPackage.DEPLOYMENT_SPECIFICATION__USE_CASE :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getUseCases())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.DEPLOYMENT_SPECIFICATION__SUBSTITUTION :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getSubstitutions())
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
				return ((InternalEList<?>) getEAnnotations())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNED_COMMENT :
				return ((InternalEList<?>) getOwnedComments())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.DEPLOYMENT_SPECIFICATION__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNED_RULE :
				return ((InternalEList<?>) getOwnedRules())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.DEPLOYMENT_SPECIFICATION__ELEMENT_IMPORT :
				return ((InternalEList<?>) getElementImports())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.DEPLOYMENT_SPECIFICATION__PACKAGE_IMPORT :
				return ((InternalEList<?>) getPackageImports())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNING_TEMPLATE_PARAMETER :
				return basicSetOwningTemplateParameter(null, msgs);
			case UMLPackage.DEPLOYMENT_SPECIFICATION__TEMPLATE_PARAMETER :
				return basicSetTemplateParameter(null, msgs);
			case UMLPackage.DEPLOYMENT_SPECIFICATION__TEMPLATE_BINDING :
				return ((InternalEList<?>) getTemplateBindings())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNED_TEMPLATE_SIGNATURE :
				return basicSetOwnedTemplateSignature(null, msgs);
			case UMLPackage.DEPLOYMENT_SPECIFICATION__COLLABORATION_USE :
				return ((InternalEList<?>) getCollaborationUses())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.DEPLOYMENT_SPECIFICATION__GENERALIZATION :
				return ((InternalEList<?>) getGeneralizations())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.DEPLOYMENT_SPECIFICATION__POWERTYPE_EXTENT :
				return ((InternalEList<?>) getPowertypeExtents())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNED_USE_CASE :
				return ((InternalEList<?>) getOwnedUseCases())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.DEPLOYMENT_SPECIFICATION__USE_CASE :
				return ((InternalEList<?>) getUseCases()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.DEPLOYMENT_SPECIFICATION__SUBSTITUTION :
				return ((InternalEList<?>) getSubstitutions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.DEPLOYMENT_SPECIFICATION__MANIFESTATION :
				return ((InternalEList<?>) getManifestations())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.DEPLOYMENT_SPECIFICATION__NESTED_ARTIFACT :
				return ((InternalEList<?>) getNestedArtifacts())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNED_ATTRIBUTE :
				return ((InternalEList<?>) getOwnedAttributes())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNED_OPERATION :
				return ((InternalEList<?>) getOwnedOperations())
					.basicRemove(otherEnd, msgs);
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
			case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__NAME :
				return getName();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__VISIBILITY :
				return getVisibility();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNED_RULE :
				return getOwnedRules();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__ELEMENT_IMPORT :
				return getElementImports();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__PACKAGE_IMPORT :
				return getPackageImports();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNED_MEMBER :
				return getOwnedMembers();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__IMPORTED_MEMBER :
				return getImportedMembers();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__MEMBER :
				return getMembers();
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
			case UMLPackage.DEPLOYMENT_SPECIFICATION__FEATURE :
				return getFeatures();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__ATTRIBUTE :
				return getAttributes();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__COLLABORATION_USE :
				return getCollaborationUses();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__GENERAL :
				return getGenerals();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__GENERALIZATION :
				return getGeneralizations();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__POWERTYPE_EXTENT :
				return getPowertypeExtents();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__INHERITED_MEMBER :
				return getInheritedMembers();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__IS_ABSTRACT :
				return isAbstract();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__IS_FINAL_SPECIALIZATION :
				return isFinalSpecialization();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNED_USE_CASE :
				return getOwnedUseCases();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__USE_CASE :
				return getUseCases();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__REDEFINED_CLASSIFIER :
				return getRedefinedClassifiers();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__REPRESENTATION :
				if (resolve)
					return getRepresentation();
				return basicGetRepresentation();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__SUBSTITUTION :
				return getSubstitutions();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__FILE_NAME :
				return getFileName();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__MANIFESTATION :
				return getManifestations();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__NESTED_ARTIFACT :
				return getNestedArtifacts();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNED_ATTRIBUTE :
				return getOwnedAttributes();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNED_OPERATION :
				return getOwnedOperations();
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
				getEAnnotations()
					.addAll((Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments()
					.addAll((Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNED_RULE :
				getOwnedRules().clear();
				getOwnedRules()
					.addAll((Collection<? extends Constraint>) newValue);
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__ELEMENT_IMPORT :
				getElementImports().clear();
				getElementImports()
					.addAll((Collection<? extends ElementImport>) newValue);
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__PACKAGE_IMPORT :
				getPackageImports().clear();
				getPackageImports()
					.addAll((Collection<? extends PackageImport>) newValue);
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
				getTemplateBindings()
					.addAll((Collection<? extends TemplateBinding>) newValue);
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNED_TEMPLATE_SIGNATURE :
				setOwnedTemplateSignature((TemplateSignature) newValue);
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__COLLABORATION_USE :
				getCollaborationUses().clear();
				getCollaborationUses()
					.addAll((Collection<? extends CollaborationUse>) newValue);
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__GENERAL :
				getGenerals().clear();
				getGenerals()
					.addAll((Collection<? extends Classifier>) newValue);
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__GENERALIZATION :
				getGeneralizations().clear();
				getGeneralizations()
					.addAll((Collection<? extends Generalization>) newValue);
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__POWERTYPE_EXTENT :
				getPowertypeExtents().clear();
				getPowertypeExtents()
					.addAll((Collection<? extends GeneralizationSet>) newValue);
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__IS_ABSTRACT :
				setIsAbstract((Boolean) newValue);
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__IS_FINAL_SPECIALIZATION :
				setIsFinalSpecialization((Boolean) newValue);
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNED_USE_CASE :
				getOwnedUseCases().clear();
				getOwnedUseCases()
					.addAll((Collection<? extends UseCase>) newValue);
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__USE_CASE :
				getUseCases().clear();
				getUseCases().addAll((Collection<? extends UseCase>) newValue);
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__REDEFINED_CLASSIFIER :
				getRedefinedClassifiers().clear();
				getRedefinedClassifiers()
					.addAll((Collection<? extends Classifier>) newValue);
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__REPRESENTATION :
				setRepresentation((CollaborationUse) newValue);
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__SUBSTITUTION :
				getSubstitutions().clear();
				getSubstitutions()
					.addAll((Collection<? extends Substitution>) newValue);
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__FILE_NAME :
				setFileName((String) newValue);
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__MANIFESTATION :
				getManifestations().clear();
				getManifestations()
					.addAll((Collection<? extends Manifestation>) newValue);
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__NESTED_ARTIFACT :
				getNestedArtifacts().clear();
				getNestedArtifacts()
					.addAll((Collection<? extends Artifact>) newValue);
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNED_ATTRIBUTE :
				getOwnedAttributes().clear();
				getOwnedAttributes()
					.addAll((Collection<? extends Property>) newValue);
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNED_OPERATION :
				getOwnedOperations().clear();
				getOwnedOperations()
					.addAll((Collection<? extends Operation>) newValue);
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
			case UMLPackage.DEPLOYMENT_SPECIFICATION__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNED_RULE :
				getOwnedRules().clear();
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__ELEMENT_IMPORT :
				getElementImports().clear();
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__PACKAGE_IMPORT :
				getPackageImports().clear();
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
			case UMLPackage.DEPLOYMENT_SPECIFICATION__COLLABORATION_USE :
				getCollaborationUses().clear();
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__GENERAL :
				getGenerals().clear();
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__GENERALIZATION :
				getGeneralizations().clear();
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__POWERTYPE_EXTENT :
				getPowertypeExtents().clear();
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__IS_ABSTRACT :
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__IS_FINAL_SPECIALIZATION :
				setIsFinalSpecialization(IS_FINAL_SPECIALIZATION_EDEFAULT);
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNED_USE_CASE :
				getOwnedUseCases().clear();
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__USE_CASE :
				getUseCases().clear();
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__REDEFINED_CLASSIFIER :
				getRedefinedClassifiers().clear();
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__REPRESENTATION :
				setRepresentation((CollaborationUse) null);
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__SUBSTITUTION :
				getSubstitutions().clear();
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__FILE_NAME :
				unsetFileName();
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__MANIFESTATION :
				getManifestations().clear();
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__NESTED_ARTIFACT :
				getNestedArtifacts().clear();
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNED_ATTRIBUTE :
				getOwnedAttributes().clear();
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNED_OPERATION :
				getOwnedOperations().clear();
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
			case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNER :
				return isSetOwner();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__CLIENT_DEPENDENCY :
				return !getClientDependencies().isEmpty();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__NAME :
				return isSetName();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.DEPLOYMENT_SPECIFICATION__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNED_RULE :
				return ownedRules != null && !ownedRules.isEmpty();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__ELEMENT_IMPORT :
				return elementImports != null && !elementImports.isEmpty();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__PACKAGE_IMPORT :
				return packageImports != null && !packageImports.isEmpty();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNED_MEMBER :
				return isSetOwnedMembers();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__IMPORTED_MEMBER :
				return !getImportedMembers().isEmpty();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__MEMBER :
				return isSetMembers();
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
			case UMLPackage.DEPLOYMENT_SPECIFICATION__FEATURE :
				return isSetFeatures();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__ATTRIBUTE :
				return isSetAttributes();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__COLLABORATION_USE :
				return collaborationUses != null
					&& !collaborationUses.isEmpty();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__GENERAL :
				return !getGenerals().isEmpty();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__GENERALIZATION :
				return generalizations != null && !generalizations.isEmpty();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__POWERTYPE_EXTENT :
				return powertypeExtents != null && !powertypeExtents.isEmpty();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__INHERITED_MEMBER :
				return !getInheritedMembers().isEmpty();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__IS_ABSTRACT :
				return ((eFlags
					& IS_ABSTRACT_EFLAG) != 0) != IS_ABSTRACT_EDEFAULT;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__IS_FINAL_SPECIALIZATION :
				return ((eFlags
					& IS_FINAL_SPECIALIZATION_EFLAG) != 0) != IS_FINAL_SPECIALIZATION_EDEFAULT;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNED_USE_CASE :
				return ownedUseCases != null && !ownedUseCases.isEmpty();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__USE_CASE :
				return useCases != null && !useCases.isEmpty();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__REDEFINED_CLASSIFIER :
				return redefinedClassifiers != null
					&& !redefinedClassifiers.isEmpty();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__REPRESENTATION :
				return representation != null;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__SUBSTITUTION :
				return substitutions != null && !substitutions.isEmpty();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__FILE_NAME :
				return isSetFileName();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__MANIFESTATION :
				return manifestations != null && !manifestations.isEmpty();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__NESTED_ARTIFACT :
				return nestedArtifacts != null && !nestedArtifacts.isEmpty();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNED_ATTRIBUTE :
				return ownedAttributes != null && !ownedAttributes.isEmpty();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNED_OPERATION :
				return ownedOperations != null && !ownedOperations.isEmpty();
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
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments)
			throws InvocationTargetException {
		switch (operationID) {
			case UMLPackage.DEPLOYMENT_SPECIFICATION___GET_EANNOTATION__STRING :
				return getEAnnotation((String) arguments.get(0));
			case UMLPackage.DEPLOYMENT_SPECIFICATION___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP :
				return validateHasOwner((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.DEPLOYMENT_SPECIFICATION___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP :
				return validateNotOwnSelf((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.DEPLOYMENT_SPECIFICATION___ADD_KEYWORD__STRING :
				return addKeyword((String) arguments.get(0));
			case UMLPackage.DEPLOYMENT_SPECIFICATION___APPLY_STEREOTYPE__STEREOTYPE :
				return applyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.DEPLOYMENT_SPECIFICATION___CREATE_EANNOTATION__STRING :
				return createEAnnotation((String) arguments.get(0));
			case UMLPackage.DEPLOYMENT_SPECIFICATION___DESTROY :
				destroy();
				return null;
			case UMLPackage.DEPLOYMENT_SPECIFICATION___GET_KEYWORDS :
				return getKeywords();
			case UMLPackage.DEPLOYMENT_SPECIFICATION___GET_APPLICABLE_STEREOTYPE__STRING :
				return getApplicableStereotype((String) arguments.get(0));
			case UMLPackage.DEPLOYMENT_SPECIFICATION___GET_APPLICABLE_STEREOTYPES :
				return getApplicableStereotypes();
			case UMLPackage.DEPLOYMENT_SPECIFICATION___GET_APPLIED_STEREOTYPE__STRING :
				return getAppliedStereotype((String) arguments.get(0));
			case UMLPackage.DEPLOYMENT_SPECIFICATION___GET_APPLIED_STEREOTYPES :
				return getAppliedStereotypes();
			case UMLPackage.DEPLOYMENT_SPECIFICATION___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING :
				return getAppliedSubstereotype((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.DEPLOYMENT_SPECIFICATION___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE :
				return getAppliedSubstereotypes((Stereotype) arguments.get(0));
			case UMLPackage.DEPLOYMENT_SPECIFICATION___GET_MODEL :
				return getModel();
			case UMLPackage.DEPLOYMENT_SPECIFICATION___GET_NEAREST_PACKAGE :
				return getNearestPackage();
			case UMLPackage.DEPLOYMENT_SPECIFICATION___GET_RELATIONSHIPS :
				return getRelationships();
			case UMLPackage.DEPLOYMENT_SPECIFICATION___GET_RELATIONSHIPS__ECLASS :
				return getRelationships((EClass) arguments.get(0));
			case UMLPackage.DEPLOYMENT_SPECIFICATION___GET_REQUIRED_STEREOTYPE__STRING :
				return getRequiredStereotype((String) arguments.get(0));
			case UMLPackage.DEPLOYMENT_SPECIFICATION___GET_REQUIRED_STEREOTYPES :
				return getRequiredStereotypes();
			case UMLPackage.DEPLOYMENT_SPECIFICATION___GET_SOURCE_DIRECTED_RELATIONSHIPS :
				return getSourceDirectedRelationships();
			case UMLPackage.DEPLOYMENT_SPECIFICATION___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS :
				return getSourceDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.DEPLOYMENT_SPECIFICATION___GET_STEREOTYPE_APPLICATION__STEREOTYPE :
				return getStereotypeApplication((Stereotype) arguments.get(0));
			case UMLPackage.DEPLOYMENT_SPECIFICATION___GET_STEREOTYPE_APPLICATIONS :
				return getStereotypeApplications();
			case UMLPackage.DEPLOYMENT_SPECIFICATION___GET_TARGET_DIRECTED_RELATIONSHIPS :
				return getTargetDirectedRelationships();
			case UMLPackage.DEPLOYMENT_SPECIFICATION___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS :
				return getTargetDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.DEPLOYMENT_SPECIFICATION___GET_VALUE__STEREOTYPE_STRING :
				return getValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.DEPLOYMENT_SPECIFICATION___HAS_KEYWORD__STRING :
				return hasKeyword((String) arguments.get(0));
			case UMLPackage.DEPLOYMENT_SPECIFICATION___HAS_VALUE__STEREOTYPE_STRING :
				return hasValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.DEPLOYMENT_SPECIFICATION___IS_STEREOTYPE_APPLICABLE__STEREOTYPE :
				return isStereotypeApplicable((Stereotype) arguments.get(0));
			case UMLPackage.DEPLOYMENT_SPECIFICATION___IS_STEREOTYPE_APPLIED__STEREOTYPE :
				return isStereotypeApplied((Stereotype) arguments.get(0));
			case UMLPackage.DEPLOYMENT_SPECIFICATION___IS_STEREOTYPE_REQUIRED__STEREOTYPE :
				return isStereotypeRequired((Stereotype) arguments.get(0));
			case UMLPackage.DEPLOYMENT_SPECIFICATION___REMOVE_KEYWORD__STRING :
				return removeKeyword((String) arguments.get(0));
			case UMLPackage.DEPLOYMENT_SPECIFICATION___SET_VALUE__STEREOTYPE_STRING_OBJECT :
				setValue((Stereotype) arguments.get(0),
					(String) arguments.get(1), arguments.get(2));
				return null;
			case UMLPackage.DEPLOYMENT_SPECIFICATION___UNAPPLY_STEREOTYPE__STEREOTYPE :
				return unapplyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.DEPLOYMENT_SPECIFICATION___ALL_OWNED_ELEMENTS :
				return allOwnedElements();
			case UMLPackage.DEPLOYMENT_SPECIFICATION___MUST_BE_OWNED :
				return mustBeOwned();
			case UMLPackage.DEPLOYMENT_SPECIFICATION___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP :
				return validateVisibilityNeedsOwnership(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.DEPLOYMENT_SPECIFICATION___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.DEPLOYMENT_SPECIFICATION___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasNoQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.DEPLOYMENT_SPECIFICATION___CREATE_DEPENDENCY__NAMEDELEMENT :
				return createDependency((NamedElement) arguments.get(0));
			case UMLPackage.DEPLOYMENT_SPECIFICATION___CREATE_USAGE__NAMEDELEMENT :
				return createUsage((NamedElement) arguments.get(0));
			case UMLPackage.DEPLOYMENT_SPECIFICATION___GET_LABEL :
				return getLabel();
			case UMLPackage.DEPLOYMENT_SPECIFICATION___GET_LABEL__BOOLEAN :
				return getLabel((Boolean) arguments.get(0));
			case UMLPackage.DEPLOYMENT_SPECIFICATION___GET_NAMESPACE :
				return getNamespace();
			case UMLPackage.DEPLOYMENT_SPECIFICATION___ALL_NAMESPACES :
				return allNamespaces();
			case UMLPackage.DEPLOYMENT_SPECIFICATION___ALL_OWNING_PACKAGES :
				return allOwningPackages();
			case UMLPackage.DEPLOYMENT_SPECIFICATION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE :
				return isDistinguishableFrom((NamedElement) arguments.get(0),
					(Namespace) arguments.get(1));
			case UMLPackage.DEPLOYMENT_SPECIFICATION___GET_QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.DEPLOYMENT_SPECIFICATION___SEPARATOR :
				return separator();
			case UMLPackage.DEPLOYMENT_SPECIFICATION___GET_CLIENT_DEPENDENCIES :
				return getClientDependencies();
			case UMLPackage.DEPLOYMENT_SPECIFICATION___VALIDATE_MEMBERS_DISTINGUISHABLE__DIAGNOSTICCHAIN_MAP :
				return validateMembersDistinguishable(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.DEPLOYMENT_SPECIFICATION___VALIDATE_CANNOT_IMPORT_SELF__DIAGNOSTICCHAIN_MAP :
				return validateCannotImportSelf(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.DEPLOYMENT_SPECIFICATION___VALIDATE_CANNOT_IMPORT_OWNED_MEMBERS__DIAGNOSTICCHAIN_MAP :
				return validateCannotImportOwnedMembers(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.DEPLOYMENT_SPECIFICATION___CREATE_ELEMENT_IMPORT__PACKAGEABLEELEMENT_VISIBILITYKIND :
				return createElementImport(
					(PackageableElement) arguments.get(0),
					(VisibilityKind) arguments.get(1));
			case UMLPackage.DEPLOYMENT_SPECIFICATION___CREATE_PACKAGE_IMPORT__PACKAGE_VISIBILITYKIND :
				return createPackageImport(
					(org.eclipse.uml2.uml.Package) arguments.get(0),
					(VisibilityKind) arguments.get(1));
			case UMLPackage.DEPLOYMENT_SPECIFICATION___GET_IMPORTED_ELEMENTS :
				return getImportedElements();
			case UMLPackage.DEPLOYMENT_SPECIFICATION___GET_IMPORTED_PACKAGES :
				return getImportedPackages();
			case UMLPackage.DEPLOYMENT_SPECIFICATION___GET_OWNED_MEMBERS :
				return getOwnedMembers();
			case UMLPackage.DEPLOYMENT_SPECIFICATION___EXCLUDE_COLLISIONS__ELIST :
				return excludeCollisions(
					(EList<PackageableElement>) arguments.get(0));
			case UMLPackage.DEPLOYMENT_SPECIFICATION___GET_NAMES_OF_MEMBER__NAMEDELEMENT :
				return getNamesOfMember((NamedElement) arguments.get(0));
			case UMLPackage.DEPLOYMENT_SPECIFICATION___IMPORT_MEMBERS__ELIST :
				return importMembers(
					(EList<PackageableElement>) arguments.get(0));
			case UMLPackage.DEPLOYMENT_SPECIFICATION___GET_IMPORTED_MEMBERS :
				return getImportedMembers();
			case UMLPackage.DEPLOYMENT_SPECIFICATION___MEMBERS_ARE_DISTINGUISHABLE :
				return membersAreDistinguishable();
			case UMLPackage.DEPLOYMENT_SPECIFICATION___VALIDATE_REDEFINITION_CONSISTENT__DIAGNOSTICCHAIN_MAP :
				return validateRedefinitionConsistent(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.DEPLOYMENT_SPECIFICATION___VALIDATE_NON_LEAF_REDEFINITION__DIAGNOSTICCHAIN_MAP :
				return validateNonLeafRedefinition(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.DEPLOYMENT_SPECIFICATION___VALIDATE_REDEFINITION_CONTEXT_VALID__DIAGNOSTICCHAIN_MAP :
				return validateRedefinitionContextValid(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.DEPLOYMENT_SPECIFICATION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT :
				return isConsistentWith((RedefinableElement) arguments.get(0));
			case UMLPackage.DEPLOYMENT_SPECIFICATION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT :
				return isRedefinitionContextValid(
					(RedefinableElement) arguments.get(0));
			case UMLPackage.DEPLOYMENT_SPECIFICATION___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT :
				return isCompatibleWith(
					(ParameterableElement) arguments.get(0));
			case UMLPackage.DEPLOYMENT_SPECIFICATION___IS_TEMPLATE_PARAMETER :
				return isTemplateParameter();
			case UMLPackage.DEPLOYMENT_SPECIFICATION___VALIDATE_NAMESPACE_NEEDS_VISIBILITY__DIAGNOSTICCHAIN_MAP :
				return validateNamespaceNeedsVisibility(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.DEPLOYMENT_SPECIFICATION___CREATE_ASSOCIATION__BOOLEAN_AGGREGATIONKIND_STRING_INT_INT_TYPE_BOOLEAN_AGGREGATIONKIND_STRING_INT_INT :
				return createAssociation((Boolean) arguments.get(0),
					(AggregationKind) arguments.get(1),
					(String) arguments.get(2), (Integer) arguments.get(3),
					(Integer) arguments.get(4), (Type) arguments.get(5),
					(Boolean) arguments.get(6),
					(AggregationKind) arguments.get(7),
					(String) arguments.get(8), (Integer) arguments.get(9),
					(Integer) arguments.get(10));
			case UMLPackage.DEPLOYMENT_SPECIFICATION___GET_ASSOCIATIONS :
				return getAssociations();
			case UMLPackage.DEPLOYMENT_SPECIFICATION___CONFORMS_TO__TYPE :
				return conformsTo((Type) arguments.get(0));
			case UMLPackage.DEPLOYMENT_SPECIFICATION___IS_TEMPLATE :
				return isTemplate();
			case UMLPackage.DEPLOYMENT_SPECIFICATION___PARAMETERABLE_ELEMENTS :
				return parameterableElements();
			case UMLPackage.DEPLOYMENT_SPECIFICATION___VALIDATE_SPECIALIZE_TYPE__DIAGNOSTICCHAIN_MAP :
				return validateSpecializeType(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.DEPLOYMENT_SPECIFICATION___VALIDATE_MAPS_TO_GENERALIZATION_SET__DIAGNOSTICCHAIN_MAP :
				return validateMapsToGeneralizationSet(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.DEPLOYMENT_SPECIFICATION___VALIDATE_NON_FINAL_PARENTS__DIAGNOSTICCHAIN_MAP :
				return validateNonFinalParents(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.DEPLOYMENT_SPECIFICATION___VALIDATE_NO_CYCLES_IN_GENERALIZATION__DIAGNOSTICCHAIN_MAP :
				return validateNoCyclesInGeneralization(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.DEPLOYMENT_SPECIFICATION___GET_ALL_ATTRIBUTES :
				return getAllAttributes();
			case UMLPackage.DEPLOYMENT_SPECIFICATION___GET_ALL_OPERATIONS :
				return getAllOperations();
			case UMLPackage.DEPLOYMENT_SPECIFICATION___GET_ALL_USED_INTERFACES :
				return getAllUsedInterfaces();
			case UMLPackage.DEPLOYMENT_SPECIFICATION___GET_OPERATION__STRING_ELIST_ELIST :
				return getOperation((String) arguments.get(0),
					(EList<String>) arguments.get(1),
					(EList<Type>) arguments.get(2));
			case UMLPackage.DEPLOYMENT_SPECIFICATION___GET_OPERATION__STRING_ELIST_ELIST_BOOLEAN :
				return getOperation((String) arguments.get(0),
					(EList<String>) arguments.get(1),
					(EList<Type>) arguments.get(2), (Boolean) arguments.get(3));
			case UMLPackage.DEPLOYMENT_SPECIFICATION___GET_OPERATIONS :
				return getOperations();
			case UMLPackage.DEPLOYMENT_SPECIFICATION___GET_USED_INTERFACES :
				return getUsedInterfaces();
			case UMLPackage.DEPLOYMENT_SPECIFICATION___ALL_FEATURES :
				return allFeatures();
			case UMLPackage.DEPLOYMENT_SPECIFICATION___ALL_PARENTS :
				return allParents();
			case UMLPackage.DEPLOYMENT_SPECIFICATION___GET_GENERALS :
				return getGenerals();
			case UMLPackage.DEPLOYMENT_SPECIFICATION___HAS_VISIBILITY_OF__NAMEDELEMENT :
				return hasVisibilityOf((NamedElement) arguments.get(0));
			case UMLPackage.DEPLOYMENT_SPECIFICATION___INHERIT__ELIST :
				return inherit((EList<NamedElement>) arguments.get(0));
			case UMLPackage.DEPLOYMENT_SPECIFICATION___INHERITABLE_MEMBERS__CLASSIFIER :
				return inheritableMembers((Classifier) arguments.get(0));
			case UMLPackage.DEPLOYMENT_SPECIFICATION___GET_INHERITED_MEMBERS :
				return getInheritedMembers();
			case UMLPackage.DEPLOYMENT_SPECIFICATION___MAY_SPECIALIZE_TYPE__CLASSIFIER :
				return maySpecializeType((Classifier) arguments.get(0));
			case UMLPackage.DEPLOYMENT_SPECIFICATION___PARENTS :
				return parents();
			case UMLPackage.DEPLOYMENT_SPECIFICATION___DIRECTLY_REALIZED_INTERFACES :
				return directlyRealizedInterfaces();
			case UMLPackage.DEPLOYMENT_SPECIFICATION___DIRECTLY_USED_INTERFACES :
				return directlyUsedInterfaces();
			case UMLPackage.DEPLOYMENT_SPECIFICATION___ALL_REALIZED_INTERFACES :
				return allRealizedInterfaces();
			case UMLPackage.DEPLOYMENT_SPECIFICATION___ALL_USED_INTERFACES :
				return allUsedInterfaces();
			case UMLPackage.DEPLOYMENT_SPECIFICATION___IS_SUBSTITUTABLE_FOR__CLASSIFIER :
				return isSubstitutableFor((Classifier) arguments.get(0));
			case UMLPackage.DEPLOYMENT_SPECIFICATION___ALL_ATTRIBUTES :
				return allAttributes();
			case UMLPackage.DEPLOYMENT_SPECIFICATION___ALL_SLOTTABLE_FEATURES :
				return allSlottableFeatures();
			case UMLPackage.DEPLOYMENT_SPECIFICATION___CREATE_OWNED_ATTRIBUTE__STRING_TYPE_INT_INT :
				return createOwnedAttribute((String) arguments.get(0),
					(Type) arguments.get(1), (Integer) arguments.get(2),
					(Integer) arguments.get(3));
			case UMLPackage.DEPLOYMENT_SPECIFICATION___CREATE_OWNED_OPERATION__STRING_ELIST_ELIST_TYPE :
				return createOwnedOperation((String) arguments.get(0),
					(EList<String>) arguments.get(1),
					(EList<Type>) arguments.get(2), (Type) arguments.get(3));
			case UMLPackage.DEPLOYMENT_SPECIFICATION___VALIDATE_DEPLOYMENT_TARGET__DIAGNOSTICCHAIN_MAP :
				return validateDeploymentTarget(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.DEPLOYMENT_SPECIFICATION___VALIDATE_DEPLOYED_ELEMENTS__DIAGNOSTICCHAIN_MAP :
				return validateDeployedElements(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		}
		return eDynamicInvoke(operationID, arguments);
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOwner() {
		return super.isSetOwner()
			|| eIsSet(UMLPackage.DEPLOYMENT_SPECIFICATION__DEPLOYMENT);
	}

} //DeploymentSpecificationImpl
