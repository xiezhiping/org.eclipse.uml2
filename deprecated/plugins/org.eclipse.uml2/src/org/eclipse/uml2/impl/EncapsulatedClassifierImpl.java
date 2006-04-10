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
 * $Id: EncapsulatedClassifierImpl.java,v 1.30 2006/04/10 20:40:16 khussey Exp $
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

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Encapsulated Classifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
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
	 * The cached value of the '{@link #getOwnedPorts() <em>Owned Port</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPorts()
	 * @generated
	 * @ordered
	 */
	protected EList ownedPorts = null;

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
		return UML2Package.Literals.ENCAPSULATED_CLASSIFIER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getFeatures() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			EList features = (EList) cache.get(eResource, this, UML2Package.Literals.CLASSIFIER__FEATURE);
			if (features == null) {
				cache.put(eResource, this, UML2Package.Literals.CLASSIFIER__FEATURE, features = new DerivedUnionEObjectEList(Feature.class, this, UML2Package.ENCAPSULATED_CLASSIFIER__FEATURE, FEATURE_ESUBSETS));
			}
			return features;
		}
		return new DerivedUnionEObjectEList(Feature.class, this, UML2Package.ENCAPSULATED_CLASSIFIER__FEATURE, FEATURE_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFeatures() {
		return super.isSetFeatures()
			|| eIsSet(UML2Package.ENCAPSULATED_CLASSIFIER__OWNED_PORT);
	}


	/**
	 * The array of subset feature identifiers for the '{@link #getFeatures() <em>Feature</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatures()
	 * @generated
	 * @ordered
	 */
	protected static final int[] FEATURE_ESUBSETS = new int[] {UML2Package.ENCAPSULATED_CLASSIFIER__ATTRIBUTE, UML2Package.ENCAPSULATED_CLASSIFIER__OWNED_CONNECTOR, UML2Package.ENCAPSULATED_CLASSIFIER__OWNED_PORT};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedPorts() {
		if (ownedPorts == null) {
			ownedPorts = new EObjectContainmentEList(Port.class, this, UML2Package.ENCAPSULATED_CLASSIFIER__OWNED_PORT);
		}
		return ownedPorts;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public Port getOwnedPort(String name) {
		return getOwnedPort(name, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port getOwnedPort(String name, boolean ignoreCase) {
		ownedPortLoop: for (Iterator i = getOwnedPorts().iterator(); i.hasNext(); ) {
			Port ownedPort = (Port) i.next();
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(ownedPort.getName()) : name.equals(ownedPort.getName())))
				continue ownedPortLoop;
			return ownedPort;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
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
				return basicSetOwningParameter(null, msgs);
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
		}
		return eDynamicInverseRemove(otherEnd, featureID, msgs);
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
	 * @generated NOT
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
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
		return eDynamicGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
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
		eDynamicSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
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
		eDynamicUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UML2Package.ENCAPSULATED_CLASSIFIER__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.ENCAPSULATED_CLASSIFIER__OWNED_ELEMENT:
				return isSetOwnedElements();
			case UML2Package.ENCAPSULATED_CLASSIFIER__OWNER:
				return isSetOwner();
			case UML2Package.ENCAPSULATED_CLASSIFIER__OWNED_COMMENT:
				return ownedComments != null && !ownedComments.isEmpty();
			case UML2Package.ENCAPSULATED_CLASSIFIER__TEMPLATE_BINDING:
				return templateBindings != null && !templateBindings.isEmpty();
			case UML2Package.ENCAPSULATED_CLASSIFIER__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case UML2Package.ENCAPSULATED_CLASSIFIER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.ENCAPSULATED_CLASSIFIER__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UML2Package.ENCAPSULATED_CLASSIFIER__VISIBILITY:
				return isSetVisibility();
			case UML2Package.ENCAPSULATED_CLASSIFIER__CLIENT_DEPENDENCY:
				return clientDependencies != null && !clientDependencies.isEmpty();
			case UML2Package.ENCAPSULATED_CLASSIFIER__NAME_EXPRESSION:
				return nameExpression != null;
			case UML2Package.ENCAPSULATED_CLASSIFIER__MEMBER:
				return isSetMembers();
			case UML2Package.ENCAPSULATED_CLASSIFIER__OWNED_RULE:
				return ownedRules != null && !ownedRules.isEmpty();
			case UML2Package.ENCAPSULATED_CLASSIFIER__IMPORTED_MEMBER:
				return !getImportedMembers().isEmpty();
			case UML2Package.ENCAPSULATED_CLASSIFIER__ELEMENT_IMPORT:
				return elementImports != null && !elementImports.isEmpty();
			case UML2Package.ENCAPSULATED_CLASSIFIER__PACKAGE_IMPORT:
				return packageImports != null && !packageImports.isEmpty();
			case UML2Package.ENCAPSULATED_CLASSIFIER__TEMPLATE_PARAMETER:
				return templateParameter != null;
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
				return generalizations != null && !generalizations.isEmpty();
			case UML2Package.ENCAPSULATED_CLASSIFIER__ATTRIBUTE:
				return isSetAttributes();
			case UML2Package.ENCAPSULATED_CLASSIFIER__REDEFINED_CLASSIFIER:
				return redefinedClassifiers != null && !redefinedClassifiers.isEmpty();
			case UML2Package.ENCAPSULATED_CLASSIFIER__SUBSTITUTION:
				return substitutions != null && !substitutions.isEmpty();
			case UML2Package.ENCAPSULATED_CLASSIFIER__POWERTYPE_EXTENT:
				return powertypeExtents != null && !powertypeExtents.isEmpty();
			case UML2Package.ENCAPSULATED_CLASSIFIER__OWNED_USE_CASE:
				return ownedUseCases != null && !ownedUseCases.isEmpty();
			case UML2Package.ENCAPSULATED_CLASSIFIER__USE_CASE:
				return useCases != null && !useCases.isEmpty();
			case UML2Package.ENCAPSULATED_CLASSIFIER__REPRESENTATION:
				return representation != null;
			case UML2Package.ENCAPSULATED_CLASSIFIER__OCCURRENCE:
				return occurrences != null && !occurrences.isEmpty();
			case UML2Package.ENCAPSULATED_CLASSIFIER__OWNED_ATTRIBUTE:
				return ownedAttributes != null && !ownedAttributes.isEmpty();
			case UML2Package.ENCAPSULATED_CLASSIFIER__PART:
				return !getParts().isEmpty();
			case UML2Package.ENCAPSULATED_CLASSIFIER__ROLE:
				return isSetRoles();
			case UML2Package.ENCAPSULATED_CLASSIFIER__OWNED_CONNECTOR:
				return ownedConnectors != null && !ownedConnectors.isEmpty();
			case UML2Package.ENCAPSULATED_CLASSIFIER__OWNED_PORT:
				return ownedPorts != null && !ownedPorts.isEmpty();
		}
		return eDynamicIsSet(featureID);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EList getOwnedMembersHelper(EList ownedMembers) {
		super.getOwnedMembersHelper(ownedMembers);
		if (eIsSet(UML2Package.ENCAPSULATED_CLASSIFIER__OWNED_PORT)) {
			ownedMembers.addAll(getOwnedPorts());
		}
		return ownedMembers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedMembers() {
		return super.isSetOwnedMembers()
			|| eIsSet(UML2Package.ENCAPSULATED_CLASSIFIER__OWNED_PORT);
	}


	/**
	 * The array of subset feature identifiers for the '{@link #getOwnedMembers() <em>Owned Member</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedMembers()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_MEMBER_ESUBSETS = new int[] {UML2Package.ENCAPSULATED_CLASSIFIER__OWNED_RULE, UML2Package.ENCAPSULATED_CLASSIFIER__OWNED_USE_CASE, UML2Package.ENCAPSULATED_CLASSIFIER__OWNED_ATTRIBUTE, UML2Package.ENCAPSULATED_CLASSIFIER__OWNED_CONNECTOR, UML2Package.ENCAPSULATED_CLASSIFIER__OWNED_PORT};

} //EncapsulatedClassifierImpl
