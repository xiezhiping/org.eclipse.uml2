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
 * $Id: ArtifactImpl.java,v 1.35 2006/04/10 20:40:19 khussey Exp $
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

import org.eclipse.emf.ecore.resource.Resource;

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
import org.eclipse.uml2.common.util.SubsetSupersetEObjectContainmentEList;
import org.eclipse.uml2.common.util.SubsetSupersetEObjectWithInverseResolvingEList;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.internal.operation.ClassifierOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Artifact</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
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
	 * The cached value of the '{@link #getFileName() <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileName()
	 * @generated
	 * @ordered
	 */
	protected String fileName = FILE_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNestedArtifacts() <em>Nested Artifact</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNestedArtifacts()
	 * @generated
	 * @ordered
	 */
	protected EList nestedArtifacts = null;

	/**
	 * The cached value of the '{@link #getManifestations() <em>Manifestation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManifestations()
	 * @generated
	 * @ordered
	 */
	protected EList manifestations = null;

	/**
	 * The cached value of the '{@link #getOwnedOperations() <em>Owned Operation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedOperations()
	 * @generated
	 * @ordered
	 */
	protected EList ownedOperations = null;

	/**
	 * The cached value of the '{@link #getOwnedAttributes() <em>Owned Attribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList ownedAttributes = null;

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
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			EList features = (EList) cache.get(eResource, this, UML2Package.Literals.CLASSIFIER__FEATURE);
			if (features == null) {
				cache.put(eResource, this, UML2Package.Literals.CLASSIFIER__FEATURE, features = new DerivedUnionEObjectEList(Feature.class, this, UML2Package.ARTIFACT__FEATURE, FEATURE_ESUBSETS));
			}
			return features;
		}
		return new DerivedUnionEObjectEList(Feature.class, this, UML2Package.ARTIFACT__FEATURE, FEATURE_ESUBSETS);
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
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			EList attributes = (EList) cache.get(eResource, this, UML2Package.Literals.CLASSIFIER__ATTRIBUTE);
			if (attributes == null) {
				cache.put(eResource, this, UML2Package.Literals.CLASSIFIER__ATTRIBUTE, attributes = new DerivedUnionEObjectEList(Property.class, this, UML2Package.ARTIFACT__ATTRIBUTE, ATTRIBUTE_ESUBSETS));
			}
			return attributes;
		}
		return new DerivedUnionEObjectEList(Property.class, this, UML2Package.ARTIFACT__ATTRIBUTE, ATTRIBUTE_ESUBSETS);
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
		return fileName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFileName(String newFileName) {
		newFileName = newFileName == null ? FILE_NAME_EDEFAULT : newFileName;
		String oldFileName = fileName;
		fileName = newFileName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.ARTIFACT__FILE_NAME, oldFileName, fileName));


	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getNestedArtifacts() {
		if (nestedArtifacts == null) {
			nestedArtifacts = new EObjectContainmentEList(Artifact.class, this, UML2Package.ARTIFACT__NESTED_ARTIFACT);
		}
		return nestedArtifacts;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public Artifact getNestedArtifact(String name) {
		return getNestedArtifact(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Artifact getNestedArtifact(String name, boolean ignoreCase, EClass eClass) {
		nestedArtifactLoop: for (Iterator i = getNestedArtifacts().iterator(); i.hasNext(); ) {
			Artifact nestedArtifact = (Artifact) i.next();
			if (eClass != null && !eClass.isInstance(nestedArtifact))
				continue nestedArtifactLoop;
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(nestedArtifact.getName()) : name.equals(nestedArtifact.getName())))
				continue nestedArtifactLoop;
			return nestedArtifact;
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
		if (manifestations == null) {
			manifestations = new SubsetSupersetEObjectContainmentEList(Manifestation.class, this, UML2Package.ARTIFACT__MANIFESTATION, MANIFESTATION_ESUPERSETS, null);
		}
		return manifestations;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public Manifestation getManifestation(String name) {
		return getManifestation(name, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Manifestation getManifestation(String name, boolean ignoreCase) {
		manifestationLoop: for (Iterator i = getManifestations().iterator(); i.hasNext(); ) {
			Manifestation manifestation = (Manifestation) i.next();
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(manifestation.getName()) : name.equals(manifestation.getName())))
				continue manifestationLoop;
			return manifestation;
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
		if (ownedOperations == null) {
			ownedOperations = new EObjectContainmentEList(Operation.class, this, UML2Package.ARTIFACT__OWNED_OPERATION);
		}
		return ownedOperations;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public Operation getOwnedOperation(String name) {
		return getOwnedOperation(name, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getOwnedOperation(String name, boolean ignoreCase) {
		ownedOperationLoop: for (Iterator i = getOwnedOperations().iterator(); i.hasNext(); ) {
			Operation ownedOperation = (Operation) i.next();
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(ownedOperation.getName()) : name.equals(ownedOperation.getName())))
				continue ownedOperationLoop;
			return ownedOperation;
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
		if (ownedAttributes == null) {
			ownedAttributes = new EObjectContainmentEList(Property.class, this, UML2Package.ARTIFACT__OWNED_ATTRIBUTE);
		}
		return ownedAttributes;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public Property getOwnedAttribute(String name) {
		return getOwnedAttribute(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getOwnedAttribute(String name, boolean ignoreCase, EClass eClass) {
		ownedAttributeLoop: for (Iterator i = getOwnedAttributes().iterator(); i.hasNext(); ) {
			Property ownedAttribute = (Property) i.next();
			if (eClass != null && !eClass.isInstance(ownedAttribute))
				continue ownedAttributeLoop;
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(ownedAttribute.getName()) : name.equals(ownedAttribute.getName())))
				continue ownedAttributeLoop;
			return ownedAttribute;
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
				if (templateParameter != null)
					msgs = ((InternalEObject)templateParameter).eInverseRemove(this, UML2Package.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
				return basicSetTemplateParameter((TemplateParameter)otherEnd, msgs);
			case UML2Package.ARTIFACT__OWNING_PARAMETER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningParameter((TemplateParameter)otherEnd, msgs);
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
				return basicSetOwningParameter(null, msgs);
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
		if (clientDependencies == null) {
			clientDependencies = new SubsetSupersetEObjectWithInverseResolvingEList.ManyInverse(Dependency.class, this, UML2Package.ARTIFACT__CLIENT_DEPENDENCY, null, CLIENT_DEPENDENCY_ESUBSETS, UML2Package.DEPENDENCY__CLIENT);
		}
		return clientDependencies;
	}


	/**
	 * The array of subset feature identifiers for the '{@link #getClientDependencies() <em>Client Dependency</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientDependencies()
	 * @generated
	 * @ordered
	 */
	protected static final int[] CLIENT_DEPENDENCY_ESUBSETS = new int[] {UML2Package.ARTIFACT__SUBSTITUTION, UML2Package.ARTIFACT__MANIFESTATION};

	/**
	 * The array of superset feature identifiers for the '{@link #getManifestations() <em>Manifestation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManifestations()
	 * @generated
	 * @ordered
	 */
	protected static final int[] MANIFESTATION_ESUPERSETS = new int[] {UML2Package.ARTIFACT__CLIENT_DEPENDENCY};

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
				return ownedComments != null && !ownedComments.isEmpty();
			case UML2Package.ARTIFACT__TEMPLATE_BINDING:
				return templateBindings != null && !templateBindings.isEmpty();
			case UML2Package.ARTIFACT__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case UML2Package.ARTIFACT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.ARTIFACT__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UML2Package.ARTIFACT__VISIBILITY:
				return isSetVisibility();
			case UML2Package.ARTIFACT__CLIENT_DEPENDENCY:
				return clientDependencies != null && !clientDependencies.isEmpty();
			case UML2Package.ARTIFACT__NAME_EXPRESSION:
				return nameExpression != null;
			case UML2Package.ARTIFACT__MEMBER:
				return isSetMembers();
			case UML2Package.ARTIFACT__OWNED_RULE:
				return ownedRules != null && !ownedRules.isEmpty();
			case UML2Package.ARTIFACT__IMPORTED_MEMBER:
				return !getImportedMembers().isEmpty();
			case UML2Package.ARTIFACT__ELEMENT_IMPORT:
				return elementImports != null && !elementImports.isEmpty();
			case UML2Package.ARTIFACT__PACKAGE_IMPORT:
				return packageImports != null && !packageImports.isEmpty();
			case UML2Package.ARTIFACT__TEMPLATE_PARAMETER:
				return templateParameter != null;
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
				return generalizations != null && !generalizations.isEmpty();
			case UML2Package.ARTIFACT__ATTRIBUTE:
				return isSetAttributes();
			case UML2Package.ARTIFACT__REDEFINED_CLASSIFIER:
				return redefinedClassifiers != null && !redefinedClassifiers.isEmpty();
			case UML2Package.ARTIFACT__SUBSTITUTION:
				return substitutions != null && !substitutions.isEmpty();
			case UML2Package.ARTIFACT__POWERTYPE_EXTENT:
				return powertypeExtents != null && !powertypeExtents.isEmpty();
			case UML2Package.ARTIFACT__OWNED_USE_CASE:
				return ownedUseCases != null && !ownedUseCases.isEmpty();
			case UML2Package.ARTIFACT__USE_CASE:
				return useCases != null && !useCases.isEmpty();
			case UML2Package.ARTIFACT__REPRESENTATION:
				return representation != null;
			case UML2Package.ARTIFACT__OCCURRENCE:
				return occurrences != null && !occurrences.isEmpty();
			case UML2Package.ARTIFACT__FILE_NAME:
				return FILE_NAME_EDEFAULT == null ? fileName != null : !FILE_NAME_EDEFAULT.equals(fileName);
			case UML2Package.ARTIFACT__NESTED_ARTIFACT:
				return nestedArtifacts != null && !nestedArtifacts.isEmpty();
			case UML2Package.ARTIFACT__MANIFESTATION:
				return manifestations != null && !manifestations.isEmpty();
			case UML2Package.ARTIFACT__OWNED_OPERATION:
				return ownedOperations != null && !ownedOperations.isEmpty();
			case UML2Package.ARTIFACT__OWNED_ATTRIBUTE:
				return ownedAttributes != null && !ownedAttributes.isEmpty();
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
		result.append(fileName);
		result.append(')');
		return result.toString();
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EList getOwnedElementsHelper(EList ownedElements) {
		super.getOwnedElementsHelper(ownedElements);
		if (eIsSet(UML2Package.ARTIFACT__MANIFESTATION)) {
			ownedElements.addAll(getManifestations());
		}
		return ownedElements;
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
	 * The array of subset feature identifiers for the '{@link #getOwnedElements() <em>Owned Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedElements()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_ELEMENT_ESUBSETS = new int[] {UML2Package.ARTIFACT__OWNED_COMMENT, UML2Package.ARTIFACT__TEMPLATE_BINDING, UML2Package.ARTIFACT__OWNED_TEMPLATE_SIGNATURE, UML2Package.ARTIFACT__NAME_EXPRESSION, UML2Package.ARTIFACT__ELEMENT_IMPORT, UML2Package.ARTIFACT__PACKAGE_IMPORT, UML2Package.ARTIFACT__GENERALIZATION, UML2Package.ARTIFACT__SUBSTITUTION, UML2Package.ARTIFACT__OCCURRENCE, UML2Package.ARTIFACT__MANIFESTATION};

	/**
	 * The array of subset feature identifiers for the '{@link #getFeatures() <em>Feature</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatures()
	 * @generated
	 * @ordered
	 */
	protected static final int[] FEATURE_ESUBSETS = new int[] {UML2Package.ARTIFACT__ATTRIBUTE, UML2Package.ARTIFACT__OWNED_OPERATION};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EList getOwnedMembersHelper(EList ownedMembers) {
		super.getOwnedMembersHelper(ownedMembers);
		if (eIsSet(UML2Package.ARTIFACT__OWNED_OPERATION)) {
			ownedMembers.addAll(getOwnedOperations());
		}
		if (eIsSet(UML2Package.ARTIFACT__OWNED_ATTRIBUTE)) {
			ownedMembers.addAll(getOwnedAttributes());
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
			|| eIsSet(UML2Package.ARTIFACT__OWNED_OPERATION)
			|| eIsSet(UML2Package.ARTIFACT__OWNED_ATTRIBUTE);
	}


	/**
	 * The array of subset feature identifiers for the '{@link #getOwnedMembers() <em>Owned Member</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedMembers()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_MEMBER_ESUBSETS = new int[] {UML2Package.ARTIFACT__OWNED_RULE, UML2Package.ARTIFACT__OWNED_USE_CASE, UML2Package.ARTIFACT__OWNED_OPERATION, UML2Package.ARTIFACT__OWNED_ATTRIBUTE};

	/**
	 * The array of subset feature identifiers for the '{@link #getAttributes() <em>Attribute</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected static final int[] ATTRIBUTE_ESUBSETS = new int[] {UML2Package.ARTIFACT__OWNED_ATTRIBUTE};

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
