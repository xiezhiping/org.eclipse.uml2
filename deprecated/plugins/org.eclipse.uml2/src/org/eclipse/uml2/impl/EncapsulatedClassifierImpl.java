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
 * $Id: EncapsulatedClassifierImpl.java,v 1.23 2005/11/14 17:31:06 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.CollaborationOccurrence;
import org.eclipse.uml2.EncapsulatedClassifier;
import org.eclipse.uml2.Feature;
import org.eclipse.uml2.Port;
import org.eclipse.uml2.StringExpression;
import org.eclipse.uml2.TemplateParameter;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.VisibilityKind;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Encapsulated Classifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.EncapsulatedClassifierImpl#getFeatures <em>Feature</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.EncapsulatedClassifierImpl#getOwnedPorts <em>Owned Port</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class EncapsulatedClassifierImpl extends StructuredClassifierImpl implements EncapsulatedClassifier {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EncapsulatedClassifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UML2Package.eINSTANCE.getEncapsulatedClassifier();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getFeatures() {
		EList feature = (EList)eVirtualGet(UML2Package.ENCAPSULATED_CLASSIFIER__FEATURE);
		if (feature == null) {
			eVirtualSet(UML2Package.ENCAPSULATED_CLASSIFIER__FEATURE, feature = new DerivedUnionEObjectEList(Feature.class, this, UML2Package.ENCAPSULATED_CLASSIFIER__FEATURE, new EStructuralFeature[] {UML2Package.eINSTANCE.getClassifier_Attribute(), UML2Package.eINSTANCE.getStructuredClassifier_OwnedConnector(), UML2Package.eINSTANCE.getEncapsulatedClassifier_OwnedPort()}));
		}
		return feature;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFeatures() {
		return super.isSetFeatures()
			|| eIsSet(UML2Package.eINSTANCE.getEncapsulatedClassifier_OwnedPort());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedPorts() {
		EList ownedPort = (EList)eVirtualGet(UML2Package.ENCAPSULATED_CLASSIFIER__OWNED_PORT);
		if (ownedPort == null) {
			eVirtualSet(UML2Package.ENCAPSULATED_CLASSIFIER__OWNED_PORT, ownedPort = new EObjectContainmentEList(Port.class, this, UML2Package.ENCAPSULATED_CLASSIFIER__OWNED_PORT));
		}
		return ownedPort;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public Port getOwnedPort(String name) {
		for (Iterator i = getOwnedPorts().iterator(); i.hasNext(); ) {
			Port ownedPort = (Port) i.next();
			if (name.equals(ownedPort.getName())) {
				return ownedPort;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @deprecated Use #createOwnedPort() instead.
	 */
	public Port createOwnedPort(EClass eClass) {
		Port newOwnedPort = (Port) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.ENCAPSULATED_CLASSIFIER__OWNED_PORT, null, newOwnedPort));
		}
		getOwnedPorts().add(newOwnedPort);
		return newOwnedPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port createOwnedPort() {
		Port newOwnedPort = UML2Factory.eINSTANCE.createPort();
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.ENCAPSULATED_CLASSIFIER__OWNED_PORT, null, newOwnedPort));
		}
		getOwnedPorts().add(newOwnedPort);
		return newOwnedPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UML2Package.ENCAPSULATED_CLASSIFIER__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
				case UML2Package.ENCAPSULATED_CLASSIFIER__OWNED_COMMENT:
					return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
				case UML2Package.ENCAPSULATED_CLASSIFIER__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicRemove(otherEnd, msgs);
				case UML2Package.ENCAPSULATED_CLASSIFIER__OWNED_TEMPLATE_SIGNATURE:
					return basicSetOwnedTemplateSignature(null, msgs);
				case UML2Package.ENCAPSULATED_CLASSIFIER__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicRemove(otherEnd, msgs);
				case UML2Package.ENCAPSULATED_CLASSIFIER__NAME_EXPRESSION:
					return basicSetNameExpression(null, msgs);
				case UML2Package.ENCAPSULATED_CLASSIFIER__OWNED_RULE:
					return ((InternalEList)getOwnedRules()).basicRemove(otherEnd, msgs);
				case UML2Package.ENCAPSULATED_CLASSIFIER__ELEMENT_IMPORT:
					return ((InternalEList)getElementImports()).basicRemove(otherEnd, msgs);
				case UML2Package.ENCAPSULATED_CLASSIFIER__PACKAGE_IMPORT:
					return ((InternalEList)getPackageImports()).basicRemove(otherEnd, msgs);
				case UML2Package.ENCAPSULATED_CLASSIFIER__TEMPLATE_PARAMETER:
					return basicSetTemplateParameter(null, msgs);
				case UML2Package.ENCAPSULATED_CLASSIFIER__OWNING_PARAMETER:
					return eBasicSetContainer(null, UML2Package.ENCAPSULATED_CLASSIFIER__OWNING_PARAMETER, msgs);
				case UML2Package.ENCAPSULATED_CLASSIFIER__GENERALIZATION:
					return ((InternalEList)getGeneralizations()).basicRemove(otherEnd, msgs);
				case UML2Package.ENCAPSULATED_CLASSIFIER__SUBSTITUTION:
					return ((InternalEList)getSubstitutions()).basicRemove(otherEnd, msgs);
				case UML2Package.ENCAPSULATED_CLASSIFIER__POWERTYPE_EXTENT:
					return ((InternalEList)getPowertypeExtents()).basicRemove(otherEnd, msgs);
				case UML2Package.ENCAPSULATED_CLASSIFIER__OWNED_USE_CASE:
					return ((InternalEList)getOwnedUseCases()).basicRemove(otherEnd, msgs);
				case UML2Package.ENCAPSULATED_CLASSIFIER__USE_CASE:
					return ((InternalEList)getUseCases()).basicRemove(otherEnd, msgs);
				case UML2Package.ENCAPSULATED_CLASSIFIER__OCCURRENCE:
					return ((InternalEList)getOccurrences()).basicRemove(otherEnd, msgs);
				case UML2Package.ENCAPSULATED_CLASSIFIER__OWNED_ATTRIBUTE:
					return ((InternalEList)getOwnedAttributes()).basicRemove(otherEnd, msgs);
				case UML2Package.ENCAPSULATED_CLASSIFIER__OWNED_CONNECTOR:
					return ((InternalEList)getOwnedConnectors()).basicRemove(otherEnd, msgs);
				case UML2Package.ENCAPSULATED_CLASSIFIER__OWNED_PORT:
					return ((InternalEList)getOwnedPorts()).basicRemove(otherEnd, msgs);
				default:
					return eDynamicInverseRemove(otherEnd, featureID, baseClass, msgs);
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
			case UML2Package.ENCAPSULATED_CLASSIFIER__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.ENCAPSULATED_CLASSIFIER__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.ENCAPSULATED_CLASSIFIER__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.ENCAPSULATED_CLASSIFIER__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.ENCAPSULATED_CLASSIFIER__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.ENCAPSULATED_CLASSIFIER__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UML2Package.ENCAPSULATED_CLASSIFIER__NAME:
				return getName();
			case UML2Package.ENCAPSULATED_CLASSIFIER__QUALIFIED_NAME:
				return getQualifiedName();
			case UML2Package.ENCAPSULATED_CLASSIFIER__VISIBILITY:
				return getVisibility();
			case UML2Package.ENCAPSULATED_CLASSIFIER__CLIENT_DEPENDENCY:
				return getClientDependencies();
			case UML2Package.ENCAPSULATED_CLASSIFIER__NAME_EXPRESSION:
				return getNameExpression();
			case UML2Package.ENCAPSULATED_CLASSIFIER__MEMBER:
				return getMembers();
			case UML2Package.ENCAPSULATED_CLASSIFIER__OWNED_RULE:
				return getOwnedRules();
			case UML2Package.ENCAPSULATED_CLASSIFIER__IMPORTED_MEMBER:
				return getImportedMembers();
			case UML2Package.ENCAPSULATED_CLASSIFIER__ELEMENT_IMPORT:
				return getElementImports();
			case UML2Package.ENCAPSULATED_CLASSIFIER__PACKAGE_IMPORT:
				return getPackageImports();
			case UML2Package.ENCAPSULATED_CLASSIFIER__TEMPLATE_PARAMETER:
				if (resolve) return getTemplateParameter();
				return basicGetTemplateParameter();
			case UML2Package.ENCAPSULATED_CLASSIFIER__OWNING_PARAMETER:
				return getOwningParameter();
			case UML2Package.ENCAPSULATED_CLASSIFIER__PACKAGEABLE_ELEMENT_VISIBILITY:
				return getPackageableElement_visibility();
			case UML2Package.ENCAPSULATED_CLASSIFIER__PACKAGE:
				return getPackage();
			case UML2Package.ENCAPSULATED_CLASSIFIER__REDEFINITION_CONTEXT:
				return getRedefinitionContexts();
			case UML2Package.ENCAPSULATED_CLASSIFIER__IS_LEAF:
				return isLeaf() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.ENCAPSULATED_CLASSIFIER__FEATURE:
				return getFeatures();
			case UML2Package.ENCAPSULATED_CLASSIFIER__IS_ABSTRACT:
				return isAbstract() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.ENCAPSULATED_CLASSIFIER__INHERITED_MEMBER:
				return getInheritedMembers();
			case UML2Package.ENCAPSULATED_CLASSIFIER__GENERAL:
				return getGenerals();
			case UML2Package.ENCAPSULATED_CLASSIFIER__GENERALIZATION:
				return getGeneralizations();
			case UML2Package.ENCAPSULATED_CLASSIFIER__ATTRIBUTE:
				return getAttributes();
			case UML2Package.ENCAPSULATED_CLASSIFIER__REDEFINED_CLASSIFIER:
				return getRedefinedClassifiers();
			case UML2Package.ENCAPSULATED_CLASSIFIER__SUBSTITUTION:
				return getSubstitutions();
			case UML2Package.ENCAPSULATED_CLASSIFIER__POWERTYPE_EXTENT:
				return getPowertypeExtents();
			case UML2Package.ENCAPSULATED_CLASSIFIER__OWNED_USE_CASE:
				return getOwnedUseCases();
			case UML2Package.ENCAPSULATED_CLASSIFIER__USE_CASE:
				return getUseCases();
			case UML2Package.ENCAPSULATED_CLASSIFIER__REPRESENTATION:
				return getRepresentation();
			case UML2Package.ENCAPSULATED_CLASSIFIER__OCCURRENCE:
				return getOccurrences();
			case UML2Package.ENCAPSULATED_CLASSIFIER__OWNED_ATTRIBUTE:
				return getOwnedAttributes();
			case UML2Package.ENCAPSULATED_CLASSIFIER__PART:
				return getParts();
			case UML2Package.ENCAPSULATED_CLASSIFIER__ROLE:
				return getRoles();
			case UML2Package.ENCAPSULATED_CLASSIFIER__OWNED_CONNECTOR:
				return getOwnedConnectors();
			case UML2Package.ENCAPSULATED_CLASSIFIER__OWNED_PORT:
				return getOwnedPorts();
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
			case UML2Package.ENCAPSULATED_CLASSIFIER__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.ENCAPSULATED_CLASSIFIER__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.ENCAPSULATED_CLASSIFIER__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection)newValue);
				return;
			case UML2Package.ENCAPSULATED_CLASSIFIER__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case UML2Package.ENCAPSULATED_CLASSIFIER__NAME:
				setName((String)newValue);
				return;
			case UML2Package.ENCAPSULATED_CLASSIFIER__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case UML2Package.ENCAPSULATED_CLASSIFIER__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection)newValue);
				return;
			case UML2Package.ENCAPSULATED_CLASSIFIER__NAME_EXPRESSION:
				setNameExpression((StringExpression)newValue);
				return;
			case UML2Package.ENCAPSULATED_CLASSIFIER__OWNED_RULE:
				getOwnedRules().clear();
				getOwnedRules().addAll((Collection)newValue);
				return;
			case UML2Package.ENCAPSULATED_CLASSIFIER__ELEMENT_IMPORT:
				getElementImports().clear();
				getElementImports().addAll((Collection)newValue);
				return;
			case UML2Package.ENCAPSULATED_CLASSIFIER__PACKAGE_IMPORT:
				getPackageImports().clear();
				getPackageImports().addAll((Collection)newValue);
				return;
			case UML2Package.ENCAPSULATED_CLASSIFIER__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)newValue);
				return;
			case UML2Package.ENCAPSULATED_CLASSIFIER__OWNING_PARAMETER:
				setOwningParameter((TemplateParameter)newValue);
				return;
			case UML2Package.ENCAPSULATED_CLASSIFIER__PACKAGEABLE_ELEMENT_VISIBILITY:
				setPackageableElement_visibility((VisibilityKind)newValue);
				return;
			case UML2Package.ENCAPSULATED_CLASSIFIER__IS_LEAF:
				setIsLeaf(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.ENCAPSULATED_CLASSIFIER__IS_ABSTRACT:
				setIsAbstract(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.ENCAPSULATED_CLASSIFIER__GENERALIZATION:
				getGeneralizations().clear();
				getGeneralizations().addAll((Collection)newValue);
				return;
			case UML2Package.ENCAPSULATED_CLASSIFIER__REDEFINED_CLASSIFIER:
				getRedefinedClassifiers().clear();
				getRedefinedClassifiers().addAll((Collection)newValue);
				return;
			case UML2Package.ENCAPSULATED_CLASSIFIER__SUBSTITUTION:
				getSubstitutions().clear();
				getSubstitutions().addAll((Collection)newValue);
				return;
			case UML2Package.ENCAPSULATED_CLASSIFIER__POWERTYPE_EXTENT:
				getPowertypeExtents().clear();
				getPowertypeExtents().addAll((Collection)newValue);
				return;
			case UML2Package.ENCAPSULATED_CLASSIFIER__OWNED_USE_CASE:
				getOwnedUseCases().clear();
				getOwnedUseCases().addAll((Collection)newValue);
				return;
			case UML2Package.ENCAPSULATED_CLASSIFIER__USE_CASE:
				getUseCases().clear();
				getUseCases().addAll((Collection)newValue);
				return;
			case UML2Package.ENCAPSULATED_CLASSIFIER__REPRESENTATION:
				setRepresentation((CollaborationOccurrence)newValue);
				return;
			case UML2Package.ENCAPSULATED_CLASSIFIER__OCCURRENCE:
				getOccurrences().clear();
				getOccurrences().addAll((Collection)newValue);
				return;
			case UML2Package.ENCAPSULATED_CLASSIFIER__OWNED_ATTRIBUTE:
				getOwnedAttributes().clear();
				getOwnedAttributes().addAll((Collection)newValue);
				return;
			case UML2Package.ENCAPSULATED_CLASSIFIER__OWNED_CONNECTOR:
				getOwnedConnectors().clear();
				getOwnedConnectors().addAll((Collection)newValue);
				return;
			case UML2Package.ENCAPSULATED_CLASSIFIER__OWNED_PORT:
				getOwnedPorts().clear();
				getOwnedPorts().addAll((Collection)newValue);
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
			case UML2Package.ENCAPSULATED_CLASSIFIER__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.ENCAPSULATED_CLASSIFIER__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.ENCAPSULATED_CLASSIFIER__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				return;
			case UML2Package.ENCAPSULATED_CLASSIFIER__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case UML2Package.ENCAPSULATED_CLASSIFIER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UML2Package.ENCAPSULATED_CLASSIFIER__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UML2Package.ENCAPSULATED_CLASSIFIER__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				return;
			case UML2Package.ENCAPSULATED_CLASSIFIER__NAME_EXPRESSION:
				setNameExpression((StringExpression)null);
				return;
			case UML2Package.ENCAPSULATED_CLASSIFIER__OWNED_RULE:
				getOwnedRules().clear();
				return;
			case UML2Package.ENCAPSULATED_CLASSIFIER__ELEMENT_IMPORT:
				getElementImports().clear();
				return;
			case UML2Package.ENCAPSULATED_CLASSIFIER__PACKAGE_IMPORT:
				getPackageImports().clear();
				return;
			case UML2Package.ENCAPSULATED_CLASSIFIER__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)null);
				return;
			case UML2Package.ENCAPSULATED_CLASSIFIER__OWNING_PARAMETER:
				setOwningParameter((TemplateParameter)null);
				return;
			case UML2Package.ENCAPSULATED_CLASSIFIER__PACKAGEABLE_ELEMENT_VISIBILITY:
				setPackageableElement_visibility(PACKAGEABLE_ELEMENT_VISIBILITY_EDEFAULT);
				return;
			case UML2Package.ENCAPSULATED_CLASSIFIER__IS_LEAF:
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UML2Package.ENCAPSULATED_CLASSIFIER__IS_ABSTRACT:
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case UML2Package.ENCAPSULATED_CLASSIFIER__GENERALIZATION:
				getGeneralizations().clear();
				return;
			case UML2Package.ENCAPSULATED_CLASSIFIER__REDEFINED_CLASSIFIER:
				getRedefinedClassifiers().clear();
				return;
			case UML2Package.ENCAPSULATED_CLASSIFIER__SUBSTITUTION:
				getSubstitutions().clear();
				return;
			case UML2Package.ENCAPSULATED_CLASSIFIER__POWERTYPE_EXTENT:
				getPowertypeExtents().clear();
				return;
			case UML2Package.ENCAPSULATED_CLASSIFIER__OWNED_USE_CASE:
				getOwnedUseCases().clear();
				return;
			case UML2Package.ENCAPSULATED_CLASSIFIER__USE_CASE:
				getUseCases().clear();
				return;
			case UML2Package.ENCAPSULATED_CLASSIFIER__REPRESENTATION:
				setRepresentation((CollaborationOccurrence)null);
				return;
			case UML2Package.ENCAPSULATED_CLASSIFIER__OCCURRENCE:
				getOccurrences().clear();
				return;
			case UML2Package.ENCAPSULATED_CLASSIFIER__OWNED_ATTRIBUTE:
				getOwnedAttributes().clear();
				return;
			case UML2Package.ENCAPSULATED_CLASSIFIER__OWNED_CONNECTOR:
				getOwnedConnectors().clear();
				return;
			case UML2Package.ENCAPSULATED_CLASSIFIER__OWNED_PORT:
				getOwnedPorts().clear();
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
			case UML2Package.ENCAPSULATED_CLASSIFIER__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.ENCAPSULATED_CLASSIFIER__OWNED_ELEMENT:
				return isSetOwnedElements();
			case UML2Package.ENCAPSULATED_CLASSIFIER__OWNER:
				return isSetOwner();
			case UML2Package.ENCAPSULATED_CLASSIFIER__OWNED_COMMENT:
				EList ownedComment = (EList)eVirtualGet(UML2Package.ENCAPSULATED_CLASSIFIER__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.ENCAPSULATED_CLASSIFIER__TEMPLATE_BINDING:
				EList templateBinding = (EList)eVirtualGet(UML2Package.ENCAPSULATED_CLASSIFIER__TEMPLATE_BINDING);
				return templateBinding != null && !templateBinding.isEmpty();
			case UML2Package.ENCAPSULATED_CLASSIFIER__OWNED_TEMPLATE_SIGNATURE:
				return eVirtualGet(UML2Package.ENCAPSULATED_CLASSIFIER__OWNED_TEMPLATE_SIGNATURE) != null;
			case UML2Package.ENCAPSULATED_CLASSIFIER__NAME:
				String name = eVirtualIsSet(UML2Package.ENCAPSULATED_CLASSIFIER__NAME) ? (String)eVirtualGet(UML2Package.ENCAPSULATED_CLASSIFIER__NAME) : NAME_EDEFAULT;
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.ENCAPSULATED_CLASSIFIER__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UML2Package.ENCAPSULATED_CLASSIFIER__VISIBILITY:
				return eVirtualIsSet(UML2Package.ENCAPSULATED_CLASSIFIER__VISIBILITY) && eVirtualGet(UML2Package.ENCAPSULATED_CLASSIFIER__VISIBILITY) != VISIBILITY_EDEFAULT;
			case UML2Package.ENCAPSULATED_CLASSIFIER__CLIENT_DEPENDENCY:
				EList clientDependency = (EList)eVirtualGet(UML2Package.ENCAPSULATED_CLASSIFIER__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UML2Package.ENCAPSULATED_CLASSIFIER__NAME_EXPRESSION:
				return eVirtualGet(UML2Package.ENCAPSULATED_CLASSIFIER__NAME_EXPRESSION) != null;
			case UML2Package.ENCAPSULATED_CLASSIFIER__MEMBER:
				return isSetMembers();
			case UML2Package.ENCAPSULATED_CLASSIFIER__OWNED_RULE:
				EList ownedRule = (EList)eVirtualGet(UML2Package.ENCAPSULATED_CLASSIFIER__OWNED_RULE);
				return ownedRule != null && !ownedRule.isEmpty();
			case UML2Package.ENCAPSULATED_CLASSIFIER__IMPORTED_MEMBER:
				return !getImportedMembers().isEmpty();
			case UML2Package.ENCAPSULATED_CLASSIFIER__ELEMENT_IMPORT:
				EList elementImport = (EList)eVirtualGet(UML2Package.ENCAPSULATED_CLASSIFIER__ELEMENT_IMPORT);
				return elementImport != null && !elementImport.isEmpty();
			case UML2Package.ENCAPSULATED_CLASSIFIER__PACKAGE_IMPORT:
				EList packageImport = (EList)eVirtualGet(UML2Package.ENCAPSULATED_CLASSIFIER__PACKAGE_IMPORT);
				return packageImport != null && !packageImport.isEmpty();
			case UML2Package.ENCAPSULATED_CLASSIFIER__TEMPLATE_PARAMETER:
				return eVirtualGet(UML2Package.ENCAPSULATED_CLASSIFIER__TEMPLATE_PARAMETER) != null;
			case UML2Package.ENCAPSULATED_CLASSIFIER__OWNING_PARAMETER:
				return getOwningParameter() != null;
			case UML2Package.ENCAPSULATED_CLASSIFIER__PACKAGEABLE_ELEMENT_VISIBILITY:
				return isSetPackageableElement_visibility();
			case UML2Package.ENCAPSULATED_CLASSIFIER__PACKAGE:
				return getPackage() != null;
			case UML2Package.ENCAPSULATED_CLASSIFIER__REDEFINITION_CONTEXT:
				return isSetRedefinitionContexts();
			case UML2Package.ENCAPSULATED_CLASSIFIER__IS_LEAF:
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UML2Package.ENCAPSULATED_CLASSIFIER__FEATURE:
				return isSetFeatures();
			case UML2Package.ENCAPSULATED_CLASSIFIER__IS_ABSTRACT:
				return ((eFlags & IS_ABSTRACT_EFLAG) != 0) != IS_ABSTRACT_EDEFAULT;
			case UML2Package.ENCAPSULATED_CLASSIFIER__INHERITED_MEMBER:
				return !getInheritedMembers().isEmpty();
			case UML2Package.ENCAPSULATED_CLASSIFIER__GENERAL:
				return !getGenerals().isEmpty();
			case UML2Package.ENCAPSULATED_CLASSIFIER__GENERALIZATION:
				EList generalization = (EList)eVirtualGet(UML2Package.ENCAPSULATED_CLASSIFIER__GENERALIZATION);
				return generalization != null && !generalization.isEmpty();
			case UML2Package.ENCAPSULATED_CLASSIFIER__ATTRIBUTE:
				return isSetAttributes();
			case UML2Package.ENCAPSULATED_CLASSIFIER__REDEFINED_CLASSIFIER:
				EList redefinedClassifier = (EList)eVirtualGet(UML2Package.ENCAPSULATED_CLASSIFIER__REDEFINED_CLASSIFIER);
				return redefinedClassifier != null && !redefinedClassifier.isEmpty();
			case UML2Package.ENCAPSULATED_CLASSIFIER__SUBSTITUTION:
				EList substitution = (EList)eVirtualGet(UML2Package.ENCAPSULATED_CLASSIFIER__SUBSTITUTION);
				return substitution != null && !substitution.isEmpty();
			case UML2Package.ENCAPSULATED_CLASSIFIER__POWERTYPE_EXTENT:
				EList powertypeExtent = (EList)eVirtualGet(UML2Package.ENCAPSULATED_CLASSIFIER__POWERTYPE_EXTENT);
				return powertypeExtent != null && !powertypeExtent.isEmpty();
			case UML2Package.ENCAPSULATED_CLASSIFIER__OWNED_USE_CASE:
				EList ownedUseCase = (EList)eVirtualGet(UML2Package.ENCAPSULATED_CLASSIFIER__OWNED_USE_CASE);
				return ownedUseCase != null && !ownedUseCase.isEmpty();
			case UML2Package.ENCAPSULATED_CLASSIFIER__USE_CASE:
				EList useCase = (EList)eVirtualGet(UML2Package.ENCAPSULATED_CLASSIFIER__USE_CASE);
				return useCase != null && !useCase.isEmpty();
			case UML2Package.ENCAPSULATED_CLASSIFIER__REPRESENTATION:
				return eVirtualGet(UML2Package.ENCAPSULATED_CLASSIFIER__REPRESENTATION) != null;
			case UML2Package.ENCAPSULATED_CLASSIFIER__OCCURRENCE:
				EList occurrence = (EList)eVirtualGet(UML2Package.ENCAPSULATED_CLASSIFIER__OCCURRENCE);
				return occurrence != null && !occurrence.isEmpty();
			case UML2Package.ENCAPSULATED_CLASSIFIER__OWNED_ATTRIBUTE:
				EList ownedAttribute = (EList)eVirtualGet(UML2Package.ENCAPSULATED_CLASSIFIER__OWNED_ATTRIBUTE);
				return ownedAttribute != null && !ownedAttribute.isEmpty();
			case UML2Package.ENCAPSULATED_CLASSIFIER__PART:
				return !getParts().isEmpty();
			case UML2Package.ENCAPSULATED_CLASSIFIER__ROLE:
				return isSetRoles();
			case UML2Package.ENCAPSULATED_CLASSIFIER__OWNED_CONNECTOR:
				EList ownedConnector = (EList)eVirtualGet(UML2Package.ENCAPSULATED_CLASSIFIER__OWNED_CONNECTOR);
				return ownedConnector != null && !ownedConnector.isEmpty();
			case UML2Package.ENCAPSULATED_CLASSIFIER__OWNED_PORT:
				EList ownedPort = (EList)eVirtualGet(UML2Package.ENCAPSULATED_CLASSIFIER__OWNED_PORT);
				return ownedPort != null && !ownedPort.isEmpty();
		}
		return eDynamicIsSet(eFeature);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EList getOwnedMembersHelper(EList ownedMember) {
		super.getOwnedMembersHelper(ownedMember);
		EList ownedPort = getOwnedPorts();
		if (!ownedPort.isEmpty()) {
			ownedMember.addAll(ownedPort);
		}
		return ownedMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedMembers() {
		return super.isSetOwnedMembers()
			|| eIsSet(UML2Package.eINSTANCE.getEncapsulatedClassifier_OwnedPort());
	}


} //EncapsulatedClassifierImpl
