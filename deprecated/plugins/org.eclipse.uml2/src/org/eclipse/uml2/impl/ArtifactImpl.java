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
 * $Id: ArtifactImpl.java,v 1.32 2005/11/28 17:18:06 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.Artifact;
import org.eclipse.uml2.CollaborationOccurrence;
import org.eclipse.uml2.Dependency;
import org.eclipse.uml2.Feature;
import org.eclipse.uml2.Manifestation;
import org.eclipse.uml2.Operation;
import org.eclipse.uml2.Property;
import org.eclipse.uml2.StringExpression;
import org.eclipse.uml2.TemplateParameter;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.VisibilityKind;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;
import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.SubsetEObjectContainmentEList;
import org.eclipse.uml2.common.util.SupersetEObjectWithInverseResolvingEList;
import org.eclipse.uml2.internal.operation.ClassifierOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Artifact</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.ArtifactImpl#getFeatures <em>Feature</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ArtifactImpl#getAttributes <em>Attribute</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ArtifactImpl#getClientDependencies <em>Client Dependency</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ArtifactImpl#getFileName <em>File Name</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ArtifactImpl#getNestedArtifacts <em>Nested Artifact</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ArtifactImpl#getManifestations <em>Manifestation</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ArtifactImpl#getOwnedOperations <em>Owned Operation</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ArtifactImpl#getOwnedAttributes <em>Owned Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArtifactImpl extends ClassifierImpl implements Artifact {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * The default value of the '{@link #getFileName() <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileName()
	 * @generated
	 * @ordered
	 */
	protected static final String FILE_NAME_EDEFAULT = ""; //$NON-NLS-1$

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArtifactImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UML2Package.Literals.ARTIFACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getFeatures() {
		EList feature = (EList)eVirtualGet(UML2Package.ARTIFACT__FEATURE);
		if (feature == null) {
			eVirtualSet(UML2Package.ARTIFACT__FEATURE, feature = new DerivedUnionEObjectEList(Feature.class, this, UML2Package.ARTIFACT__FEATURE, new int[] {UML2Package.ARTIFACT__ATTRIBUTE, UML2Package.ARTIFACT__OWNED_OPERATION}));
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
			|| eIsSet(UML2Package.ARTIFACT__OWNED_OPERATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAttributes() {
		EList attribute = (EList)eVirtualGet(UML2Package.ARTIFACT__ATTRIBUTE);
		if (attribute == null) {
			eVirtualSet(UML2Package.ARTIFACT__ATTRIBUTE, attribute = new DerivedUnionEObjectEList(Property.class, this, UML2Package.ARTIFACT__ATTRIBUTE, new int[] {UML2Package.ARTIFACT__OWNED_ATTRIBUTE}));
		}
		return attribute;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAttributes() {
		return super.isSetAttributes()
			|| eIsSet(UML2Package.ARTIFACT__OWNED_ATTRIBUTE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFileName() {
		return (String)eVirtualGet(UML2Package.ARTIFACT__FILE_NAME, FILE_NAME_EDEFAULT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFileName(String newFileName) {
		newFileName = newFileName == null ? FILE_NAME_EDEFAULT : newFileName;
		String fileName = newFileName;
		Object oldFileName = eVirtualSet(UML2Package.ARTIFACT__FILE_NAME, fileName);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.ARTIFACT__FILE_NAME, oldFileName == EVIRTUAL_NO_VALUE ? FILE_NAME_EDEFAULT : oldFileName, fileName));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getNestedArtifacts() {
		EList nestedArtifact = (EList)eVirtualGet(UML2Package.ARTIFACT__NESTED_ARTIFACT);
		if (nestedArtifact == null) {
			eVirtualSet(UML2Package.ARTIFACT__NESTED_ARTIFACT, nestedArtifact = new EObjectContainmentEList(Artifact.class, this, UML2Package.ARTIFACT__NESTED_ARTIFACT));
		}
		return nestedArtifact;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public Artifact getNestedArtifact(String name) {
		for (Iterator i = getNestedArtifacts().iterator(); i.hasNext(); ) {
			Artifact nestedArtifact = (Artifact) i.next();
			if (name.equals(nestedArtifact.getName())) {
				return nestedArtifact;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Artifact createNestedArtifact(EClass eClass) {
		Artifact newNestedArtifact = (Artifact) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.ARTIFACT__NESTED_ARTIFACT, null, newNestedArtifact));
		}
		getNestedArtifacts().add(newNestedArtifact);
		return newNestedArtifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Artifact createNestedArtifact() {
		Artifact newNestedArtifact = UML2Factory.eINSTANCE.createArtifact();
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.ARTIFACT__NESTED_ARTIFACT, null, newNestedArtifact));
		}
		getNestedArtifacts().add(newNestedArtifact);
		return newNestedArtifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getManifestations() {
		EList manifestation = (EList)eVirtualGet(UML2Package.ARTIFACT__MANIFESTATION);
		if (manifestation == null) {
			eVirtualSet(UML2Package.ARTIFACT__MANIFESTATION, manifestation = new SubsetEObjectContainmentEList(Manifestation.class, this, UML2Package.ARTIFACT__MANIFESTATION, new int[] {UML2Package.ARTIFACT__CLIENT_DEPENDENCY}));
		}
		return manifestation;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public Manifestation getManifestation(String name) {
		for (Iterator i = getManifestations().iterator(); i.hasNext(); ) {
			Manifestation manifestation = (Manifestation) i.next();
			if (name.equals(manifestation.getName())) {
				return manifestation;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @deprecated Use #createManifestation() instead.
	 */
	public Manifestation createManifestation(EClass eClass) {
		Manifestation newManifestation = (Manifestation) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.ARTIFACT__MANIFESTATION, null, newManifestation));
		}
		getManifestations().add(newManifestation);
		return newManifestation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Manifestation createManifestation() {
		Manifestation newManifestation = UML2Factory.eINSTANCE.createManifestation();
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.ARTIFACT__MANIFESTATION, null, newManifestation));
		}
		getManifestations().add(newManifestation);
		return newManifestation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedOperations() {
		EList ownedOperation = (EList)eVirtualGet(UML2Package.ARTIFACT__OWNED_OPERATION);
		if (ownedOperation == null) {
			eVirtualSet(UML2Package.ARTIFACT__OWNED_OPERATION, ownedOperation = new EObjectContainmentEList(Operation.class, this, UML2Package.ARTIFACT__OWNED_OPERATION));
		}
		return ownedOperation;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public Operation getOwnedOperation(String name) {
		for (Iterator i = getOwnedOperations().iterator(); i.hasNext(); ) {
			Operation ownedOperation = (Operation) i.next();
			if (name.equals(ownedOperation.getName())) {
				return ownedOperation;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @deprecated Use #createOwnedOperation() instead.
	 */
	public Operation createOwnedOperation(EClass eClass) {
		Operation newOwnedOperation = (Operation) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.ARTIFACT__OWNED_OPERATION, null, newOwnedOperation));
		}
		getOwnedOperations().add(newOwnedOperation);
		return newOwnedOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Operation createOwnedOperation() {
		Operation newOwnedOperation = UML2Factory.eINSTANCE.createOperation();
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.ARTIFACT__OWNED_OPERATION, null, newOwnedOperation));
		}
		getOwnedOperations().add(newOwnedOperation);
		return newOwnedOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedAttributes() {
		EList ownedAttribute = (EList)eVirtualGet(UML2Package.ARTIFACT__OWNED_ATTRIBUTE);
		if (ownedAttribute == null) {
			eVirtualSet(UML2Package.ARTIFACT__OWNED_ATTRIBUTE, ownedAttribute = new EObjectContainmentEList(Property.class, this, UML2Package.ARTIFACT__OWNED_ATTRIBUTE));
		}
		return ownedAttribute;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public Property getOwnedAttribute(String name) {
		for (Iterator i = getOwnedAttributes().iterator(); i.hasNext(); ) {
			Property ownedAttribute = (Property) i.next();
			if (name.equals(ownedAttribute.getName())) {
				return ownedAttribute;
			}
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
			case UML2Package.ARTIFACT__EANNOTATIONS:
				return ((InternalEList)getEAnnotations()).basicAdd(otherEnd, msgs);
			case UML2Package.ARTIFACT__TEMPLATE_BINDING:
				return ((InternalEList)getTemplateBindings()).basicAdd(otherEnd, msgs);
			case UML2Package.ARTIFACT__OWNED_TEMPLATE_SIGNATURE:
				TemplateSignature ownedTemplateSignature = (TemplateSignature)eVirtualGet(UML2Package.ARTIFACT__OWNED_TEMPLATE_SIGNATURE);
				if (ownedTemplateSignature != null)
					msgs = ((InternalEObject)ownedTemplateSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.ARTIFACT__OWNED_TEMPLATE_SIGNATURE, null, msgs);
				return basicSetOwnedTemplateSignature((TemplateSignature)otherEnd, msgs);
			case UML2Package.ARTIFACT__CLIENT_DEPENDENCY:
				return ((InternalEList)getClientDependencies()).basicAdd(otherEnd, msgs);
			case UML2Package.ARTIFACT__OWNED_RULE:
				return ((InternalEList)getOwnedRules()).basicAdd(otherEnd, msgs);
			case UML2Package.ARTIFACT__ELEMENT_IMPORT:
				return ((InternalEList)getElementImports()).basicAdd(otherEnd, msgs);
			case UML2Package.ARTIFACT__PACKAGE_IMPORT:
				return ((InternalEList)getPackageImports()).basicAdd(otherEnd, msgs);
			case UML2Package.ARTIFACT__TEMPLATE_PARAMETER:
				TemplateParameter templateParameter = (TemplateParameter)eVirtualGet(UML2Package.ARTIFACT__TEMPLATE_PARAMETER);
				if (templateParameter != null)
					msgs = ((InternalEObject)templateParameter).eInverseRemove(this, UML2Package.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
				return basicSetTemplateParameter((TemplateParameter)otherEnd, msgs);
			case UML2Package.ARTIFACT__OWNING_PARAMETER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, UML2Package.ARTIFACT__OWNING_PARAMETER, msgs);
			case UML2Package.ARTIFACT__GENERALIZATION:
				return ((InternalEList)getGeneralizations()).basicAdd(otherEnd, msgs);
			case UML2Package.ARTIFACT__SUBSTITUTION:
				return ((InternalEList)getSubstitutions()).basicAdd(otherEnd, msgs);
			case UML2Package.ARTIFACT__POWERTYPE_EXTENT:
				return ((InternalEList)getPowertypeExtents()).basicAdd(otherEnd, msgs);
			case UML2Package.ARTIFACT__USE_CASE:
				return ((InternalEList)getUseCases()).basicAdd(otherEnd, msgs);
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
			case UML2Package.ARTIFACT__EANNOTATIONS:
				return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
			case UML2Package.ARTIFACT__OWNED_COMMENT:
				return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
			case UML2Package.ARTIFACT__TEMPLATE_BINDING:
				return ((InternalEList)getTemplateBindings()).basicRemove(otherEnd, msgs);
			case UML2Package.ARTIFACT__OWNED_TEMPLATE_SIGNATURE:
				return basicSetOwnedTemplateSignature(null, msgs);
			case UML2Package.ARTIFACT__CLIENT_DEPENDENCY:
				return ((InternalEList)getClientDependencies()).basicRemove(otherEnd, msgs);
			case UML2Package.ARTIFACT__NAME_EXPRESSION:
				return basicSetNameExpression(null, msgs);
			case UML2Package.ARTIFACT__OWNED_RULE:
				return ((InternalEList)getOwnedRules()).basicRemove(otherEnd, msgs);
			case UML2Package.ARTIFACT__ELEMENT_IMPORT:
				return ((InternalEList)getElementImports()).basicRemove(otherEnd, msgs);
			case UML2Package.ARTIFACT__PACKAGE_IMPORT:
				return ((InternalEList)getPackageImports()).basicRemove(otherEnd, msgs);
			case UML2Package.ARTIFACT__TEMPLATE_PARAMETER:
				return basicSetTemplateParameter(null, msgs);
			case UML2Package.ARTIFACT__OWNING_PARAMETER:
				return eBasicSetContainer(null, UML2Package.ARTIFACT__OWNING_PARAMETER, msgs);
			case UML2Package.ARTIFACT__GENERALIZATION:
				return ((InternalEList)getGeneralizations()).basicRemove(otherEnd, msgs);
			case UML2Package.ARTIFACT__SUBSTITUTION:
				return ((InternalEList)getSubstitutions()).basicRemove(otherEnd, msgs);
			case UML2Package.ARTIFACT__POWERTYPE_EXTENT:
				return ((InternalEList)getPowertypeExtents()).basicRemove(otherEnd, msgs);
			case UML2Package.ARTIFACT__OWNED_USE_CASE:
				return ((InternalEList)getOwnedUseCases()).basicRemove(otherEnd, msgs);
			case UML2Package.ARTIFACT__USE_CASE:
				return ((InternalEList)getUseCases()).basicRemove(otherEnd, msgs);
			case UML2Package.ARTIFACT__OCCURRENCE:
				return ((InternalEList)getOccurrences()).basicRemove(otherEnd, msgs);
			case UML2Package.ARTIFACT__NESTED_ARTIFACT:
				return ((InternalEList)getNestedArtifacts()).basicRemove(otherEnd, msgs);
			case UML2Package.ARTIFACT__MANIFESTATION:
				return ((InternalEList)getManifestations()).basicRemove(otherEnd, msgs);
			case UML2Package.ARTIFACT__OWNED_OPERATION:
				return ((InternalEList)getOwnedOperations()).basicRemove(otherEnd, msgs);
			case UML2Package.ARTIFACT__OWNED_ATTRIBUTE:
				return ((InternalEList)getOwnedAttributes()).basicRemove(otherEnd, msgs);
		}
		return eDynamicInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Property createOwnedAttribute(EClass eClass) {
		Property newOwnedAttribute = (Property) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.ARTIFACT__OWNED_ATTRIBUTE, null, newOwnedAttribute));
		}
		getOwnedAttributes().add(newOwnedAttribute);
		return newOwnedAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Property createOwnedAttribute() {
		Property newOwnedAttribute = UML2Factory.eINSTANCE.createProperty();
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.ARTIFACT__OWNED_ATTRIBUTE, null, newOwnedAttribute));
		}
		getOwnedAttributes().add(newOwnedAttribute);
		return newOwnedAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getClientDependencies() {
		EList clientDependency = (EList)eVirtualGet(UML2Package.ARTIFACT__CLIENT_DEPENDENCY);
		if (clientDependency == null) {
			eVirtualSet(UML2Package.ARTIFACT__CLIENT_DEPENDENCY, clientDependency = new SupersetEObjectWithInverseResolvingEList.ManyInverse(Dependency.class, this, UML2Package.ARTIFACT__CLIENT_DEPENDENCY, new int[] {UML2Package.ARTIFACT__SUBSTITUTION, UML2Package.ARTIFACT__MANIFESTATION}, UML2Package.DEPENDENCY__CLIENT));
		}
		return clientDependency;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UML2Package.ARTIFACT__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.ARTIFACT__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.ARTIFACT__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.ARTIFACT__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.ARTIFACT__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.ARTIFACT__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UML2Package.ARTIFACT__NAME:
				return getName();
			case UML2Package.ARTIFACT__QUALIFIED_NAME:
				return getQualifiedName();
			case UML2Package.ARTIFACT__VISIBILITY:
				return getVisibility();
			case UML2Package.ARTIFACT__CLIENT_DEPENDENCY:
				return getClientDependencies();
			case UML2Package.ARTIFACT__NAME_EXPRESSION:
				return getNameExpression();
			case UML2Package.ARTIFACT__MEMBER:
				return getMembers();
			case UML2Package.ARTIFACT__OWNED_RULE:
				return getOwnedRules();
			case UML2Package.ARTIFACT__IMPORTED_MEMBER:
				return getImportedMembers();
			case UML2Package.ARTIFACT__ELEMENT_IMPORT:
				return getElementImports();
			case UML2Package.ARTIFACT__PACKAGE_IMPORT:
				return getPackageImports();
			case UML2Package.ARTIFACT__TEMPLATE_PARAMETER:
				if (resolve) return getTemplateParameter();
				return basicGetTemplateParameter();
			case UML2Package.ARTIFACT__OWNING_PARAMETER:
				return getOwningParameter();
			case UML2Package.ARTIFACT__PACKAGEABLE_ELEMENT_VISIBILITY:
				return getPackageableElement_visibility();
			case UML2Package.ARTIFACT__PACKAGE:
				return getPackage();
			case UML2Package.ARTIFACT__REDEFINITION_CONTEXT:
				return getRedefinitionContexts();
			case UML2Package.ARTIFACT__IS_LEAF:
				return isLeaf() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.ARTIFACT__FEATURE:
				return getFeatures();
			case UML2Package.ARTIFACT__IS_ABSTRACT:
				return isAbstract() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.ARTIFACT__INHERITED_MEMBER:
				return getInheritedMembers();
			case UML2Package.ARTIFACT__GENERAL:
				return getGenerals();
			case UML2Package.ARTIFACT__GENERALIZATION:
				return getGeneralizations();
			case UML2Package.ARTIFACT__ATTRIBUTE:
				return getAttributes();
			case UML2Package.ARTIFACT__REDEFINED_CLASSIFIER:
				return getRedefinedClassifiers();
			case UML2Package.ARTIFACT__SUBSTITUTION:
				return getSubstitutions();
			case UML2Package.ARTIFACT__POWERTYPE_EXTENT:
				return getPowertypeExtents();
			case UML2Package.ARTIFACT__OWNED_USE_CASE:
				return getOwnedUseCases();
			case UML2Package.ARTIFACT__USE_CASE:
				return getUseCases();
			case UML2Package.ARTIFACT__REPRESENTATION:
				return getRepresentation();
			case UML2Package.ARTIFACT__OCCURRENCE:
				return getOccurrences();
			case UML2Package.ARTIFACT__FILE_NAME:
				return getFileName();
			case UML2Package.ARTIFACT__NESTED_ARTIFACT:
				return getNestedArtifacts();
			case UML2Package.ARTIFACT__MANIFESTATION:
				return getManifestations();
			case UML2Package.ARTIFACT__OWNED_OPERATION:
				return getOwnedOperations();
			case UML2Package.ARTIFACT__OWNED_ATTRIBUTE:
				return getOwnedAttributes();
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
			case UML2Package.ARTIFACT__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.ARTIFACT__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.ARTIFACT__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection)newValue);
				return;
			case UML2Package.ARTIFACT__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case UML2Package.ARTIFACT__NAME:
				setName((String)newValue);
				return;
			case UML2Package.ARTIFACT__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case UML2Package.ARTIFACT__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection)newValue);
				return;
			case UML2Package.ARTIFACT__NAME_EXPRESSION:
				setNameExpression((StringExpression)newValue);
				return;
			case UML2Package.ARTIFACT__OWNED_RULE:
				getOwnedRules().clear();
				getOwnedRules().addAll((Collection)newValue);
				return;
			case UML2Package.ARTIFACT__ELEMENT_IMPORT:
				getElementImports().clear();
				getElementImports().addAll((Collection)newValue);
				return;
			case UML2Package.ARTIFACT__PACKAGE_IMPORT:
				getPackageImports().clear();
				getPackageImports().addAll((Collection)newValue);
				return;
			case UML2Package.ARTIFACT__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)newValue);
				return;
			case UML2Package.ARTIFACT__OWNING_PARAMETER:
				setOwningParameter((TemplateParameter)newValue);
				return;
			case UML2Package.ARTIFACT__PACKAGEABLE_ELEMENT_VISIBILITY:
				setPackageableElement_visibility((VisibilityKind)newValue);
				return;
			case UML2Package.ARTIFACT__IS_LEAF:
				setIsLeaf(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.ARTIFACT__IS_ABSTRACT:
				setIsAbstract(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.ARTIFACT__GENERALIZATION:
				getGeneralizations().clear();
				getGeneralizations().addAll((Collection)newValue);
				return;
			case UML2Package.ARTIFACT__REDEFINED_CLASSIFIER:
				getRedefinedClassifiers().clear();
				getRedefinedClassifiers().addAll((Collection)newValue);
				return;
			case UML2Package.ARTIFACT__SUBSTITUTION:
				getSubstitutions().clear();
				getSubstitutions().addAll((Collection)newValue);
				return;
			case UML2Package.ARTIFACT__POWERTYPE_EXTENT:
				getPowertypeExtents().clear();
				getPowertypeExtents().addAll((Collection)newValue);
				return;
			case UML2Package.ARTIFACT__OWNED_USE_CASE:
				getOwnedUseCases().clear();
				getOwnedUseCases().addAll((Collection)newValue);
				return;
			case UML2Package.ARTIFACT__USE_CASE:
				getUseCases().clear();
				getUseCases().addAll((Collection)newValue);
				return;
			case UML2Package.ARTIFACT__REPRESENTATION:
				setRepresentation((CollaborationOccurrence)newValue);
				return;
			case UML2Package.ARTIFACT__OCCURRENCE:
				getOccurrences().clear();
				getOccurrences().addAll((Collection)newValue);
				return;
			case UML2Package.ARTIFACT__FILE_NAME:
				setFileName((String)newValue);
				return;
			case UML2Package.ARTIFACT__NESTED_ARTIFACT:
				getNestedArtifacts().clear();
				getNestedArtifacts().addAll((Collection)newValue);
				return;
			case UML2Package.ARTIFACT__MANIFESTATION:
				getManifestations().clear();
				getManifestations().addAll((Collection)newValue);
				return;
			case UML2Package.ARTIFACT__OWNED_OPERATION:
				getOwnedOperations().clear();
				getOwnedOperations().addAll((Collection)newValue);
				return;
			case UML2Package.ARTIFACT__OWNED_ATTRIBUTE:
				getOwnedAttributes().clear();
				getOwnedAttributes().addAll((Collection)newValue);
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
			case UML2Package.ARTIFACT__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.ARTIFACT__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.ARTIFACT__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				return;
			case UML2Package.ARTIFACT__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case UML2Package.ARTIFACT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UML2Package.ARTIFACT__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UML2Package.ARTIFACT__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				return;
			case UML2Package.ARTIFACT__NAME_EXPRESSION:
				setNameExpression((StringExpression)null);
				return;
			case UML2Package.ARTIFACT__OWNED_RULE:
				getOwnedRules().clear();
				return;
			case UML2Package.ARTIFACT__ELEMENT_IMPORT:
				getElementImports().clear();
				return;
			case UML2Package.ARTIFACT__PACKAGE_IMPORT:
				getPackageImports().clear();
				return;
			case UML2Package.ARTIFACT__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)null);
				return;
			case UML2Package.ARTIFACT__OWNING_PARAMETER:
				setOwningParameter((TemplateParameter)null);
				return;
			case UML2Package.ARTIFACT__PACKAGEABLE_ELEMENT_VISIBILITY:
				setPackageableElement_visibility(PACKAGEABLE_ELEMENT_VISIBILITY_EDEFAULT);
				return;
			case UML2Package.ARTIFACT__IS_LEAF:
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UML2Package.ARTIFACT__IS_ABSTRACT:
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case UML2Package.ARTIFACT__GENERALIZATION:
				getGeneralizations().clear();
				return;
			case UML2Package.ARTIFACT__REDEFINED_CLASSIFIER:
				getRedefinedClassifiers().clear();
				return;
			case UML2Package.ARTIFACT__SUBSTITUTION:
				getSubstitutions().clear();
				return;
			case UML2Package.ARTIFACT__POWERTYPE_EXTENT:
				getPowertypeExtents().clear();
				return;
			case UML2Package.ARTIFACT__OWNED_USE_CASE:
				getOwnedUseCases().clear();
				return;
			case UML2Package.ARTIFACT__USE_CASE:
				getUseCases().clear();
				return;
			case UML2Package.ARTIFACT__REPRESENTATION:
				setRepresentation((CollaborationOccurrence)null);
				return;
			case UML2Package.ARTIFACT__OCCURRENCE:
				getOccurrences().clear();
				return;
			case UML2Package.ARTIFACT__FILE_NAME:
				setFileName(FILE_NAME_EDEFAULT);
				return;
			case UML2Package.ARTIFACT__NESTED_ARTIFACT:
				getNestedArtifacts().clear();
				return;
			case UML2Package.ARTIFACT__MANIFESTATION:
				getManifestations().clear();
				return;
			case UML2Package.ARTIFACT__OWNED_OPERATION:
				getOwnedOperations().clear();
				return;
			case UML2Package.ARTIFACT__OWNED_ATTRIBUTE:
				getOwnedAttributes().clear();
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
			case UML2Package.ARTIFACT__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.ARTIFACT__OWNED_ELEMENT:
				return isSetOwnedElements();
			case UML2Package.ARTIFACT__OWNER:
				return isSetOwner();
			case UML2Package.ARTIFACT__OWNED_COMMENT:
				EList ownedComment = (EList)eVirtualGet(UML2Package.ARTIFACT__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.ARTIFACT__TEMPLATE_BINDING:
				EList templateBinding = (EList)eVirtualGet(UML2Package.ARTIFACT__TEMPLATE_BINDING);
				return templateBinding != null && !templateBinding.isEmpty();
			case UML2Package.ARTIFACT__OWNED_TEMPLATE_SIGNATURE:
				return eVirtualGet(UML2Package.ARTIFACT__OWNED_TEMPLATE_SIGNATURE) != null;
			case UML2Package.ARTIFACT__NAME:
				String name = (String)eVirtualGet(UML2Package.ARTIFACT__NAME, NAME_EDEFAULT);
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.ARTIFACT__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UML2Package.ARTIFACT__VISIBILITY:
				return isSetVisibility();
			case UML2Package.ARTIFACT__CLIENT_DEPENDENCY:
				EList clientDependency = (EList)eVirtualGet(UML2Package.ARTIFACT__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UML2Package.ARTIFACT__NAME_EXPRESSION:
				return eVirtualGet(UML2Package.ARTIFACT__NAME_EXPRESSION) != null;
			case UML2Package.ARTIFACT__MEMBER:
				return isSetMembers();
			case UML2Package.ARTIFACT__OWNED_RULE:
				EList ownedRule = (EList)eVirtualGet(UML2Package.ARTIFACT__OWNED_RULE);
				return ownedRule != null && !ownedRule.isEmpty();
			case UML2Package.ARTIFACT__IMPORTED_MEMBER:
				return !getImportedMembers().isEmpty();
			case UML2Package.ARTIFACT__ELEMENT_IMPORT:
				EList elementImport = (EList)eVirtualGet(UML2Package.ARTIFACT__ELEMENT_IMPORT);
				return elementImport != null && !elementImport.isEmpty();
			case UML2Package.ARTIFACT__PACKAGE_IMPORT:
				EList packageImport = (EList)eVirtualGet(UML2Package.ARTIFACT__PACKAGE_IMPORT);
				return packageImport != null && !packageImport.isEmpty();
			case UML2Package.ARTIFACT__TEMPLATE_PARAMETER:
				return eVirtualGet(UML2Package.ARTIFACT__TEMPLATE_PARAMETER) != null;
			case UML2Package.ARTIFACT__OWNING_PARAMETER:
				return getOwningParameter() != null;
			case UML2Package.ARTIFACT__PACKAGEABLE_ELEMENT_VISIBILITY:
				return isSetPackageableElement_visibility();
			case UML2Package.ARTIFACT__PACKAGE:
				return getPackage() != null;
			case UML2Package.ARTIFACT__REDEFINITION_CONTEXT:
				return isSetRedefinitionContexts();
			case UML2Package.ARTIFACT__IS_LEAF:
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UML2Package.ARTIFACT__FEATURE:
				return isSetFeatures();
			case UML2Package.ARTIFACT__IS_ABSTRACT:
				return ((eFlags & IS_ABSTRACT_EFLAG) != 0) != IS_ABSTRACT_EDEFAULT;
			case UML2Package.ARTIFACT__INHERITED_MEMBER:
				return !getInheritedMembers().isEmpty();
			case UML2Package.ARTIFACT__GENERAL:
				return !getGenerals().isEmpty();
			case UML2Package.ARTIFACT__GENERALIZATION:
				EList generalization = (EList)eVirtualGet(UML2Package.ARTIFACT__GENERALIZATION);
				return generalization != null && !generalization.isEmpty();
			case UML2Package.ARTIFACT__ATTRIBUTE:
				return isSetAttributes();
			case UML2Package.ARTIFACT__REDEFINED_CLASSIFIER:
				EList redefinedClassifier = (EList)eVirtualGet(UML2Package.ARTIFACT__REDEFINED_CLASSIFIER);
				return redefinedClassifier != null && !redefinedClassifier.isEmpty();
			case UML2Package.ARTIFACT__SUBSTITUTION:
				EList substitution = (EList)eVirtualGet(UML2Package.ARTIFACT__SUBSTITUTION);
				return substitution != null && !substitution.isEmpty();
			case UML2Package.ARTIFACT__POWERTYPE_EXTENT:
				EList powertypeExtent = (EList)eVirtualGet(UML2Package.ARTIFACT__POWERTYPE_EXTENT);
				return powertypeExtent != null && !powertypeExtent.isEmpty();
			case UML2Package.ARTIFACT__OWNED_USE_CASE:
				EList ownedUseCase = (EList)eVirtualGet(UML2Package.ARTIFACT__OWNED_USE_CASE);
				return ownedUseCase != null && !ownedUseCase.isEmpty();
			case UML2Package.ARTIFACT__USE_CASE:
				EList useCase = (EList)eVirtualGet(UML2Package.ARTIFACT__USE_CASE);
				return useCase != null && !useCase.isEmpty();
			case UML2Package.ARTIFACT__REPRESENTATION:
				return eVirtualGet(UML2Package.ARTIFACT__REPRESENTATION) != null;
			case UML2Package.ARTIFACT__OCCURRENCE:
				EList occurrence = (EList)eVirtualGet(UML2Package.ARTIFACT__OCCURRENCE);
				return occurrence != null && !occurrence.isEmpty();
			case UML2Package.ARTIFACT__FILE_NAME:
				String fileName = (String)eVirtualGet(UML2Package.ARTIFACT__FILE_NAME, FILE_NAME_EDEFAULT);
				return FILE_NAME_EDEFAULT == null ? fileName != null : !FILE_NAME_EDEFAULT.equals(fileName);
			case UML2Package.ARTIFACT__NESTED_ARTIFACT:
				EList nestedArtifact = (EList)eVirtualGet(UML2Package.ARTIFACT__NESTED_ARTIFACT);
				return nestedArtifact != null && !nestedArtifact.isEmpty();
			case UML2Package.ARTIFACT__MANIFESTATION:
				EList manifestation = (EList)eVirtualGet(UML2Package.ARTIFACT__MANIFESTATION);
				return manifestation != null && !manifestation.isEmpty();
			case UML2Package.ARTIFACT__OWNED_OPERATION:
				EList ownedOperation = (EList)eVirtualGet(UML2Package.ARTIFACT__OWNED_OPERATION);
				return ownedOperation != null && !ownedOperation.isEmpty();
			case UML2Package.ARTIFACT__OWNED_ATTRIBUTE:
				EList ownedAttribute = (EList)eVirtualGet(UML2Package.ARTIFACT__OWNED_ATTRIBUTE);
				return ownedAttribute != null && !ownedAttribute.isEmpty();
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (fileName: "); //$NON-NLS-1$
		result.append(eVirtualGet(UML2Package.ARTIFACT__FILE_NAME, FILE_NAME_EDEFAULT));
		result.append(')');
		return result.toString();
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EList getOwnedElementsHelper(EList ownedElement) {
		super.getOwnedElementsHelper(ownedElement);
		EList manifestation = getManifestations();
		if (!manifestation.isEmpty()) {
			ownedElement.addAll(manifestation);
		}
		return ownedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| eIsSet(UML2Package.ARTIFACT__MANIFESTATION);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EList getOwnedMembersHelper(EList ownedMember) {
		super.getOwnedMembersHelper(ownedMember);
		EList ownedOperation = getOwnedOperations();
		if (!ownedOperation.isEmpty()) {
			ownedMember.addAll(ownedOperation);
		}
		EList ownedAttribute = getOwnedAttributes();
		if (!ownedAttribute.isEmpty()) {
			ownedMember.addAll(ownedAttribute);
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
			|| eIsSet(UML2Package.ARTIFACT__OWNED_OPERATION)
			|| eIsSet(UML2Package.ARTIFACT__OWNED_ATTRIBUTE);
	}


	// <!-- begin-custom-operations -->
	
	private static Method GET_ALL_OPERATIONS = null;

	static {
		try {
			GET_ALL_OPERATIONS = ArtifactImpl.class.getMethod(
				"getAllOperations", null); //$NON-NLS-1$
		} catch (Exception e) {
			// ignore
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.Artifact#getAllOperations()
	 */
	public Set getAllOperations() {
		CacheAdapter cache = getCacheAdapter();

		if (cache != null) {
			Set result = (Set) cache.get(this, GET_ALL_OPERATIONS);

			if (result == null) {
				cache.put(this, GET_ALL_OPERATIONS, result = Collections
					.unmodifiableSet(ClassifierOperations
						.getAllOperations(this)));
			}

			return result;
		}

		return Collections.unmodifiableSet(ClassifierOperations
			.getAllOperations(this));
	}

	// <!-- end-custom-operations -->

} //ArtifactImpl
