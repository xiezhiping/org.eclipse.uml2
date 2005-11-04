/*
 * Copyright (c) 2003, 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: DeploymentSpecificationImpl.java,v 1.20 2005/11/04 22:23:01 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.uml2.CollaborationOccurrence;
import org.eclipse.uml2.DeploymentSpecification;
import org.eclipse.uml2.StringExpression;
import org.eclipse.uml2.TemplateParameter;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deployment Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.DeploymentSpecificationImpl#getDeploymentLocation <em>Deployment Location</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.DeploymentSpecificationImpl#getExecutionLocation <em>Execution Location</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeploymentSpecificationImpl extends ArtifactImpl implements DeploymentSpecification {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * The default value of the '{@link #getDeploymentLocation() <em>Deployment Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeploymentLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String DEPLOYMENT_LOCATION_EDEFAULT = ""; //$NON-NLS-1$

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
	 * The default value of the '{@link #getExecutionLocation() <em>Execution Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String EXECUTION_LOCATION_EDEFAULT = ""; //$NON-NLS-1$

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
	protected EClass eStaticClass() {
		return UML2Package.eINSTANCE.getDeploymentSpecification();
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
		newDeploymentLocation = newDeploymentLocation == null ? DEPLOYMENT_LOCATION_EDEFAULT : newDeploymentLocation;
		String oldDeploymentLocation = deploymentLocation;
		deploymentLocation = newDeploymentLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.DEPLOYMENT_SPECIFICATION__DEPLOYMENT_LOCATION, oldDeploymentLocation, deploymentLocation));

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
		newExecutionLocation = newExecutionLocation == null ? EXECUTION_LOCATION_EDEFAULT : newExecutionLocation;
		String oldExecutionLocation = executionLocation;
		executionLocation = newExecutionLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.DEPLOYMENT_SPECIFICATION__EXECUTION_LOCATION, oldExecutionLocation, executionLocation));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UML2Package.DEPLOYMENT_SPECIFICATION__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.DEPLOYMENT_SPECIFICATION__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.DEPLOYMENT_SPECIFICATION__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.DEPLOYMENT_SPECIFICATION__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.DEPLOYMENT_SPECIFICATION__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.DEPLOYMENT_SPECIFICATION__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UML2Package.DEPLOYMENT_SPECIFICATION__NAME:
				return getName();
			case UML2Package.DEPLOYMENT_SPECIFICATION__QUALIFIED_NAME:
				return getQualifiedName();
			case UML2Package.DEPLOYMENT_SPECIFICATION__VISIBILITY:
				return getVisibility();
			case UML2Package.DEPLOYMENT_SPECIFICATION__CLIENT_DEPENDENCY:
				return getClientDependencies();
			case UML2Package.DEPLOYMENT_SPECIFICATION__NAME_EXPRESSION:
				return getNameExpression();
			case UML2Package.DEPLOYMENT_SPECIFICATION__MEMBER:
				return getMembers();
			case UML2Package.DEPLOYMENT_SPECIFICATION__OWNED_RULE:
				return getOwnedRules();
			case UML2Package.DEPLOYMENT_SPECIFICATION__IMPORTED_MEMBER:
				return getImportedMembers();
			case UML2Package.DEPLOYMENT_SPECIFICATION__ELEMENT_IMPORT:
				return getElementImports();
			case UML2Package.DEPLOYMENT_SPECIFICATION__PACKAGE_IMPORT:
				return getPackageImports();
			case UML2Package.DEPLOYMENT_SPECIFICATION__TEMPLATE_PARAMETER:
				if (resolve) return getTemplateParameter();
				return basicGetTemplateParameter();
			case UML2Package.DEPLOYMENT_SPECIFICATION__OWNING_PARAMETER:
				return getOwningParameter();
			case UML2Package.DEPLOYMENT_SPECIFICATION__PACKAGEABLE_ELEMENT_VISIBILITY:
				return getPackageableElement_visibility();
			case UML2Package.DEPLOYMENT_SPECIFICATION__PACKAGE:
				return getPackage();
			case UML2Package.DEPLOYMENT_SPECIFICATION__REDEFINITION_CONTEXT:
				return getRedefinitionContexts();
			case UML2Package.DEPLOYMENT_SPECIFICATION__IS_LEAF:
				return isLeaf() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.DEPLOYMENT_SPECIFICATION__FEATURE:
				return getFeatures();
			case UML2Package.DEPLOYMENT_SPECIFICATION__IS_ABSTRACT:
				return isAbstract() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.DEPLOYMENT_SPECIFICATION__INHERITED_MEMBER:
				return getInheritedMembers();
			case UML2Package.DEPLOYMENT_SPECIFICATION__GENERAL:
				return getGenerals();
			case UML2Package.DEPLOYMENT_SPECIFICATION__GENERALIZATION:
				return getGeneralizations();
			case UML2Package.DEPLOYMENT_SPECIFICATION__ATTRIBUTE:
				return getAttributes();
			case UML2Package.DEPLOYMENT_SPECIFICATION__REDEFINED_CLASSIFIER:
				return getRedefinedClassifiers();
			case UML2Package.DEPLOYMENT_SPECIFICATION__SUBSTITUTION:
				return getSubstitutions();
			case UML2Package.DEPLOYMENT_SPECIFICATION__POWERTYPE_EXTENT:
				return getPowertypeExtents();
			case UML2Package.DEPLOYMENT_SPECIFICATION__OWNED_USE_CASE:
				return getOwnedUseCases();
			case UML2Package.DEPLOYMENT_SPECIFICATION__USE_CASE:
				return getUseCases();
			case UML2Package.DEPLOYMENT_SPECIFICATION__REPRESENTATION:
				return getRepresentation();
			case UML2Package.DEPLOYMENT_SPECIFICATION__OCCURRENCE:
				return getOccurrences();
			case UML2Package.DEPLOYMENT_SPECIFICATION__FILE_NAME:
				return getFileName();
			case UML2Package.DEPLOYMENT_SPECIFICATION__NESTED_ARTIFACT:
				return getNestedArtifacts();
			case UML2Package.DEPLOYMENT_SPECIFICATION__MANIFESTATION:
				return getManifestations();
			case UML2Package.DEPLOYMENT_SPECIFICATION__OWNED_OPERATION:
				return getOwnedOperations();
			case UML2Package.DEPLOYMENT_SPECIFICATION__OWNED_ATTRIBUTE:
				return getOwnedAttributes();
			case UML2Package.DEPLOYMENT_SPECIFICATION__DEPLOYMENT_LOCATION:
				return getDeploymentLocation();
			case UML2Package.DEPLOYMENT_SPECIFICATION__EXECUTION_LOCATION:
				return getExecutionLocation();
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
			case UML2Package.DEPLOYMENT_SPECIFICATION__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.DEPLOYMENT_SPECIFICATION__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.DEPLOYMENT_SPECIFICATION__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection)newValue);
				return;
			case UML2Package.DEPLOYMENT_SPECIFICATION__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case UML2Package.DEPLOYMENT_SPECIFICATION__NAME:
				setName((String)newValue);
				return;
			case UML2Package.DEPLOYMENT_SPECIFICATION__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case UML2Package.DEPLOYMENT_SPECIFICATION__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection)newValue);
				return;
			case UML2Package.DEPLOYMENT_SPECIFICATION__NAME_EXPRESSION:
				setNameExpression((StringExpression)newValue);
				return;
			case UML2Package.DEPLOYMENT_SPECIFICATION__OWNED_RULE:
				getOwnedRules().clear();
				getOwnedRules().addAll((Collection)newValue);
				return;
			case UML2Package.DEPLOYMENT_SPECIFICATION__ELEMENT_IMPORT:
				getElementImports().clear();
				getElementImports().addAll((Collection)newValue);
				return;
			case UML2Package.DEPLOYMENT_SPECIFICATION__PACKAGE_IMPORT:
				getPackageImports().clear();
				getPackageImports().addAll((Collection)newValue);
				return;
			case UML2Package.DEPLOYMENT_SPECIFICATION__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)newValue);
				return;
			case UML2Package.DEPLOYMENT_SPECIFICATION__OWNING_PARAMETER:
				setOwningParameter((TemplateParameter)newValue);
				return;
			case UML2Package.DEPLOYMENT_SPECIFICATION__PACKAGEABLE_ELEMENT_VISIBILITY:
				setPackageableElement_visibility((VisibilityKind)newValue);
				return;
			case UML2Package.DEPLOYMENT_SPECIFICATION__IS_LEAF:
				setIsLeaf(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.DEPLOYMENT_SPECIFICATION__IS_ABSTRACT:
				setIsAbstract(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.DEPLOYMENT_SPECIFICATION__GENERALIZATION:
				getGeneralizations().clear();
				getGeneralizations().addAll((Collection)newValue);
				return;
			case UML2Package.DEPLOYMENT_SPECIFICATION__REDEFINED_CLASSIFIER:
				getRedefinedClassifiers().clear();
				getRedefinedClassifiers().addAll((Collection)newValue);
				return;
			case UML2Package.DEPLOYMENT_SPECIFICATION__SUBSTITUTION:
				getSubstitutions().clear();
				getSubstitutions().addAll((Collection)newValue);
				return;
			case UML2Package.DEPLOYMENT_SPECIFICATION__POWERTYPE_EXTENT:
				getPowertypeExtents().clear();
				getPowertypeExtents().addAll((Collection)newValue);
				return;
			case UML2Package.DEPLOYMENT_SPECIFICATION__OWNED_USE_CASE:
				getOwnedUseCases().clear();
				getOwnedUseCases().addAll((Collection)newValue);
				return;
			case UML2Package.DEPLOYMENT_SPECIFICATION__USE_CASE:
				getUseCases().clear();
				getUseCases().addAll((Collection)newValue);
				return;
			case UML2Package.DEPLOYMENT_SPECIFICATION__REPRESENTATION:
				setRepresentation((CollaborationOccurrence)newValue);
				return;
			case UML2Package.DEPLOYMENT_SPECIFICATION__OCCURRENCE:
				getOccurrences().clear();
				getOccurrences().addAll((Collection)newValue);
				return;
			case UML2Package.DEPLOYMENT_SPECIFICATION__FILE_NAME:
				setFileName((String)newValue);
				return;
			case UML2Package.DEPLOYMENT_SPECIFICATION__NESTED_ARTIFACT:
				getNestedArtifacts().clear();
				getNestedArtifacts().addAll((Collection)newValue);
				return;
			case UML2Package.DEPLOYMENT_SPECIFICATION__MANIFESTATION:
				getManifestations().clear();
				getManifestations().addAll((Collection)newValue);
				return;
			case UML2Package.DEPLOYMENT_SPECIFICATION__OWNED_OPERATION:
				getOwnedOperations().clear();
				getOwnedOperations().addAll((Collection)newValue);
				return;
			case UML2Package.DEPLOYMENT_SPECIFICATION__OWNED_ATTRIBUTE:
				getOwnedAttributes().clear();
				getOwnedAttributes().addAll((Collection)newValue);
				return;
			case UML2Package.DEPLOYMENT_SPECIFICATION__DEPLOYMENT_LOCATION:
				setDeploymentLocation((String)newValue);
				return;
			case UML2Package.DEPLOYMENT_SPECIFICATION__EXECUTION_LOCATION:
				setExecutionLocation((String)newValue);
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
			case UML2Package.DEPLOYMENT_SPECIFICATION__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.DEPLOYMENT_SPECIFICATION__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.DEPLOYMENT_SPECIFICATION__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				return;
			case UML2Package.DEPLOYMENT_SPECIFICATION__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case UML2Package.DEPLOYMENT_SPECIFICATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UML2Package.DEPLOYMENT_SPECIFICATION__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UML2Package.DEPLOYMENT_SPECIFICATION__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				return;
			case UML2Package.DEPLOYMENT_SPECIFICATION__NAME_EXPRESSION:
				setNameExpression((StringExpression)null);
				return;
			case UML2Package.DEPLOYMENT_SPECIFICATION__OWNED_RULE:
				getOwnedRules().clear();
				return;
			case UML2Package.DEPLOYMENT_SPECIFICATION__ELEMENT_IMPORT:
				getElementImports().clear();
				return;
			case UML2Package.DEPLOYMENT_SPECIFICATION__PACKAGE_IMPORT:
				getPackageImports().clear();
				return;
			case UML2Package.DEPLOYMENT_SPECIFICATION__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)null);
				return;
			case UML2Package.DEPLOYMENT_SPECIFICATION__OWNING_PARAMETER:
				setOwningParameter((TemplateParameter)null);
				return;
			case UML2Package.DEPLOYMENT_SPECIFICATION__PACKAGEABLE_ELEMENT_VISIBILITY:
				setPackageableElement_visibility(PACKAGEABLE_ELEMENT_VISIBILITY_EDEFAULT);
				return;
			case UML2Package.DEPLOYMENT_SPECIFICATION__IS_LEAF:
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UML2Package.DEPLOYMENT_SPECIFICATION__IS_ABSTRACT:
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case UML2Package.DEPLOYMENT_SPECIFICATION__GENERALIZATION:
				getGeneralizations().clear();
				return;
			case UML2Package.DEPLOYMENT_SPECIFICATION__REDEFINED_CLASSIFIER:
				getRedefinedClassifiers().clear();
				return;
			case UML2Package.DEPLOYMENT_SPECIFICATION__SUBSTITUTION:
				getSubstitutions().clear();
				return;
			case UML2Package.DEPLOYMENT_SPECIFICATION__POWERTYPE_EXTENT:
				getPowertypeExtents().clear();
				return;
			case UML2Package.DEPLOYMENT_SPECIFICATION__OWNED_USE_CASE:
				getOwnedUseCases().clear();
				return;
			case UML2Package.DEPLOYMENT_SPECIFICATION__USE_CASE:
				getUseCases().clear();
				return;
			case UML2Package.DEPLOYMENT_SPECIFICATION__REPRESENTATION:
				setRepresentation((CollaborationOccurrence)null);
				return;
			case UML2Package.DEPLOYMENT_SPECIFICATION__OCCURRENCE:
				getOccurrences().clear();
				return;
			case UML2Package.DEPLOYMENT_SPECIFICATION__FILE_NAME:
				setFileName(FILE_NAME_EDEFAULT);
				return;
			case UML2Package.DEPLOYMENT_SPECIFICATION__NESTED_ARTIFACT:
				getNestedArtifacts().clear();
				return;
			case UML2Package.DEPLOYMENT_SPECIFICATION__MANIFESTATION:
				getManifestations().clear();
				return;
			case UML2Package.DEPLOYMENT_SPECIFICATION__OWNED_OPERATION:
				getOwnedOperations().clear();
				return;
			case UML2Package.DEPLOYMENT_SPECIFICATION__OWNED_ATTRIBUTE:
				getOwnedAttributes().clear();
				return;
			case UML2Package.DEPLOYMENT_SPECIFICATION__DEPLOYMENT_LOCATION:
				setDeploymentLocation(DEPLOYMENT_LOCATION_EDEFAULT);
				return;
			case UML2Package.DEPLOYMENT_SPECIFICATION__EXECUTION_LOCATION:
				setExecutionLocation(EXECUTION_LOCATION_EDEFAULT);
				return;
		}
		eDynamicUnset(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSetGen(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UML2Package.DEPLOYMENT_SPECIFICATION__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.DEPLOYMENT_SPECIFICATION__OWNED_ELEMENT:
				return isSetOwnedElements();
			case UML2Package.DEPLOYMENT_SPECIFICATION__OWNER:
				return isSetOwner();
			case UML2Package.DEPLOYMENT_SPECIFICATION__OWNED_COMMENT:
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.DEPLOYMENT_SPECIFICATION__TEMPLATE_BINDING:
				return templateBinding != null && !templateBinding.isEmpty();
			case UML2Package.DEPLOYMENT_SPECIFICATION__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case UML2Package.DEPLOYMENT_SPECIFICATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.DEPLOYMENT_SPECIFICATION__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UML2Package.DEPLOYMENT_SPECIFICATION__VISIBILITY:
				return getVisibility() != VISIBILITY_EDEFAULT;
			case UML2Package.DEPLOYMENT_SPECIFICATION__CLIENT_DEPENDENCY:
				return clientDependency != null && !clientDependency.isEmpty();
			case UML2Package.DEPLOYMENT_SPECIFICATION__NAME_EXPRESSION:
				return nameExpression != null;
			case UML2Package.DEPLOYMENT_SPECIFICATION__MEMBER:
				return isSetMembers();
			case UML2Package.DEPLOYMENT_SPECIFICATION__OWNED_RULE:
				return ownedRule != null && !ownedRule.isEmpty();
			case UML2Package.DEPLOYMENT_SPECIFICATION__IMPORTED_MEMBER:
				return !getImportedMembers().isEmpty();
			case UML2Package.DEPLOYMENT_SPECIFICATION__ELEMENT_IMPORT:
				return elementImport != null && !elementImport.isEmpty();
			case UML2Package.DEPLOYMENT_SPECIFICATION__PACKAGE_IMPORT:
				return packageImport != null && !packageImport.isEmpty();
			case UML2Package.DEPLOYMENT_SPECIFICATION__TEMPLATE_PARAMETER:
				return templateParameter != null;
			case UML2Package.DEPLOYMENT_SPECIFICATION__OWNING_PARAMETER:
				return getOwningParameter() != null;
			case UML2Package.DEPLOYMENT_SPECIFICATION__PACKAGEABLE_ELEMENT_VISIBILITY:
				return isSetPackageableElement_visibility();
			case UML2Package.DEPLOYMENT_SPECIFICATION__PACKAGE:
				return getPackage() != null;
			case UML2Package.DEPLOYMENT_SPECIFICATION__REDEFINITION_CONTEXT:
				return isSetRedefinitionContexts();
			case UML2Package.DEPLOYMENT_SPECIFICATION__IS_LEAF:
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UML2Package.DEPLOYMENT_SPECIFICATION__FEATURE:
				return isSetFeatures();
			case UML2Package.DEPLOYMENT_SPECIFICATION__IS_ABSTRACT:
				return ((eFlags & IS_ABSTRACT_EFLAG) != 0) != IS_ABSTRACT_EDEFAULT;
			case UML2Package.DEPLOYMENT_SPECIFICATION__INHERITED_MEMBER:
				return !getInheritedMembers().isEmpty();
			case UML2Package.DEPLOYMENT_SPECIFICATION__GENERAL:
				return !getGenerals().isEmpty();
			case UML2Package.DEPLOYMENT_SPECIFICATION__GENERALIZATION:
				return generalization != null && !generalization.isEmpty();
			case UML2Package.DEPLOYMENT_SPECIFICATION__ATTRIBUTE:
				return isSetAttributes();
			case UML2Package.DEPLOYMENT_SPECIFICATION__REDEFINED_CLASSIFIER:
				return redefinedClassifier != null && !redefinedClassifier.isEmpty();
			case UML2Package.DEPLOYMENT_SPECIFICATION__SUBSTITUTION:
				return substitution != null && !substitution.isEmpty();
			case UML2Package.DEPLOYMENT_SPECIFICATION__POWERTYPE_EXTENT:
				return powertypeExtent != null && !powertypeExtent.isEmpty();
			case UML2Package.DEPLOYMENT_SPECIFICATION__OWNED_USE_CASE:
				return ownedUseCase != null && !ownedUseCase.isEmpty();
			case UML2Package.DEPLOYMENT_SPECIFICATION__USE_CASE:
				return useCase != null && !useCase.isEmpty();
			case UML2Package.DEPLOYMENT_SPECIFICATION__REPRESENTATION:
				return representation != null;
			case UML2Package.DEPLOYMENT_SPECIFICATION__OCCURRENCE:
				return occurrence != null && !occurrence.isEmpty();
			case UML2Package.DEPLOYMENT_SPECIFICATION__FILE_NAME:
				return FILE_NAME_EDEFAULT == null ? fileName != null : !FILE_NAME_EDEFAULT.equals(fileName);
			case UML2Package.DEPLOYMENT_SPECIFICATION__NESTED_ARTIFACT:
				return nestedArtifact != null && !nestedArtifact.isEmpty();
			case UML2Package.DEPLOYMENT_SPECIFICATION__MANIFESTATION:
				return manifestation != null && !manifestation.isEmpty();
			case UML2Package.DEPLOYMENT_SPECIFICATION__OWNED_OPERATION:
				return ownedOperation != null && !ownedOperation.isEmpty();
			case UML2Package.DEPLOYMENT_SPECIFICATION__OWNED_ATTRIBUTE:
				return ownedAttribute != null && !ownedAttribute.isEmpty();
			case UML2Package.DEPLOYMENT_SPECIFICATION__DEPLOYMENT_LOCATION:
				return DEPLOYMENT_LOCATION_EDEFAULT == null ? deploymentLocation != null : !DEPLOYMENT_LOCATION_EDEFAULT.equals(deploymentLocation);
			case UML2Package.DEPLOYMENT_SPECIFICATION__EXECUTION_LOCATION:
				return EXECUTION_LOCATION_EDEFAULT == null ? executionLocation != null : !EXECUTION_LOCATION_EDEFAULT.equals(executionLocation);
		}
		return eDynamicIsSet(eFeature);
	}

	public boolean eIsSet(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UML2Package.DEPLOYMENT_SPECIFICATION__VISIBILITY:
				return false;
		}
		return eIsSetGen(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (deploymentLocation: "); //$NON-NLS-1$
		result.append(deploymentLocation);
		result.append(", executionLocation: "); //$NON-NLS-1$
		result.append(executionLocation);
		result.append(')');
		return result.toString();
	}


} //DeploymentSpecificationImpl
