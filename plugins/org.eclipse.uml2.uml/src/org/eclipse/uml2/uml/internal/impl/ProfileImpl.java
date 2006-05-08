/*
 * Copyright (c) 2005, 2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: ProfileImpl.java,v 1.25 2006/05/08 17:46:11 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.SubsetSupersetEObjectContainmentWithInverseEList;
import org.eclipse.uml2.common.util.SubsetSupersetEObjectResolvingEList;

import org.eclipse.uml2.common.util.DerivedSubsetEObjectEList;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.ElementImport;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.PackageImport;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.TemplateSignature;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.ProfileOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Profile</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ProfileImpl#getPackagedElements <em>Packaged Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ProfileImpl#getElementImports <em>Element Import</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ProfileImpl#getPackageImports <em>Package Import</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ProfileImpl#getOwnedStereotypes <em>Owned Stereotype</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ProfileImpl#getMetaclassReferences <em>Metaclass Reference</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ProfileImpl#getMetamodelReferences <em>Metamodel Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProfileImpl
		extends PackageImpl
		implements Profile {

	/**
	 * The cached value of the '{@link #getMetaclassReferences() <em>Metaclass Reference</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaclassReferences()
	 * @generated
	 * @ordered
	 */
	protected EList metaclassReferences = null;

	/**
	 * The cached value of the '{@link #getMetamodelReferences() <em>Metamodel Reference</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetamodelReferences()
	 * @generated
	 * @ordered
	 */
	protected EList metamodelReferences = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProfileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.Literals.PROFILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getPackagedElements() {
		if (packagedElements == null) {
			packagedElements = new EObjectContainmentEList.Resolving(
				PackageableElement.class, this,
				UMLPackage.PROFILE__PACKAGED_ELEMENT);
		}
		return packagedElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getElementImports() {
		if (elementImports == null) {
			elementImports = new SubsetSupersetEObjectContainmentWithInverseEList.Resolving(
				ElementImport.class, this, UMLPackage.PROFILE__ELEMENT_IMPORT,
				null, ELEMENT_IMPORT_ESUBSETS,
				UMLPackage.ELEMENT_IMPORT__IMPORTING_NAMESPACE);
		}
		return elementImports;
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getElementImports() <em>Element Import</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementImports()
	 * @generated
	 * @ordered
	 */
	protected static final int[] ELEMENT_IMPORT_ESUBSETS = new int[]{UMLPackage.PROFILE__METACLASS_REFERENCE};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getPackageImports() {
		if (packageImports == null) {
			packageImports = new SubsetSupersetEObjectContainmentWithInverseEList.Resolving(
				PackageImport.class, this, UMLPackage.PROFILE__PACKAGE_IMPORT,
				null, PACKAGE_IMPORT_ESUBSETS,
				UMLPackage.PACKAGE_IMPORT__IMPORTING_NAMESPACE);
		}
		return packageImports;
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getPackageImports() <em>Package Import</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageImports()
	 * @generated
	 * @ordered
	 */
	protected static final int[] PACKAGE_IMPORT_ESUBSETS = new int[]{UMLPackage.PROFILE__METAMODEL_REFERENCE};

	/**
	 * The array of superset feature identifiers for the '{@link #getOwnedStereotypes() <em>Owned Stereotype</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedStereotypes()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_STEREOTYPE_ESUPERSETS = new int[]{UMLPackage.PROFILE__PACKAGED_ELEMENT};

	/**
	 * The array of superset feature identifiers for the '{@link #getMetaclassReferences() <em>Metaclass Reference</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaclassReferences()
	 * @generated
	 * @ordered
	 */
	protected static final int[] METACLASS_REFERENCE_ESUPERSETS = new int[]{UMLPackage.PROFILE__ELEMENT_IMPORT};

	/**
	 * The array of superset feature identifiers for the '{@link #getMetamodelReferences() <em>Metamodel Reference</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetamodelReferences()
	 * @generated
	 * @ordered
	 */
	protected static final int[] METAMODEL_REFERENCE_ESUPERSETS = new int[]{UMLPackage.PROFILE__PACKAGE_IMPORT};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList getOwnedStereotypes() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			EList ownedStereotypes = (EList) cache.get(eResource, this,
				UMLPackage.Literals.PROFILE__OWNED_STEREOTYPE);
			if (ownedStereotypes == null) {
				cache.put(eResource, this,
					UMLPackage.Literals.PROFILE__OWNED_STEREOTYPE,
					ownedStereotypes = new DerivedSubsetEObjectEList(
						Stereotype.class, this,
						UMLPackage.PROFILE__OWNED_STEREOTYPE,
						OWNED_STEREOTYPE_ESUPERSETS));
			}
			return ownedStereotypes;
		}
		return new DerivedSubsetEObjectEList(Stereotype.class, this,
			UMLPackage.PROFILE__OWNED_STEREOTYPE, OWNED_STEREOTYPE_ESUPERSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stereotype createOwnedStereotype(String name) {
		Stereotype newOwnedStereotype = (Stereotype) create(UMLPackage.Literals.STEREOTYPE);
		getOwnedStereotypes().add(newOwnedStereotype);
		if (name != null)
			newOwnedStereotype.setName(name);
		return newOwnedStereotype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stereotype getOwnedStereotype(String name) {
		return getOwnedStereotype(name, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stereotype getOwnedStereotype(String name, boolean ignoreCase,
			boolean createOnDemand) {
		ownedStereotypeLoop : for (Iterator i = getOwnedStereotypes()
			.iterator(); i.hasNext();) {
			Stereotype ownedStereotype = (Stereotype) i.next();
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(ownedStereotype.getName())
				: name.equals(ownedStereotype.getName())))
				continue ownedStereotypeLoop;
			return ownedStereotype;
		}
		return createOnDemand
			? createOwnedStereotype(name)
			: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getMetaclassReferences() {
		if (metaclassReferences == null) {
			metaclassReferences = new SubsetSupersetEObjectResolvingEList(
				ElementImport.class, this,
				UMLPackage.PROFILE__METACLASS_REFERENCE,
				METACLASS_REFERENCE_ESUPERSETS, null);
		}
		return metaclassReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementImport createMetaclassReference(
			PackageableElement importedElement) {
		ElementImport newMetaclassReference = (ElementImport) create(UMLPackage.Literals.ELEMENT_IMPORT);
		getMetaclassReferences().add(newMetaclassReference);
		if (importedElement != null)
			newMetaclassReference.setImportedElement(importedElement);
		return newMetaclassReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementImport getMetaclassReference(
			PackageableElement importedElement) {
		return getMetaclassReference(importedElement, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementImport getMetaclassReference(
			PackageableElement importedElement, boolean createOnDemand) {
		metaclassReferenceLoop : for (Iterator i = getMetaclassReferences()
			.iterator(); i.hasNext();) {
			ElementImport metaclassReference = (ElementImport) i.next();
			if (importedElement != null
				&& !importedElement.equals(metaclassReference
					.getImportedElement()))
				continue metaclassReferenceLoop;
			return metaclassReference;
		}
		return createOnDemand
			? createMetaclassReference(importedElement)
			: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getMetamodelReferences() {
		if (metamodelReferences == null) {
			metamodelReferences = new SubsetSupersetEObjectResolvingEList(
				PackageImport.class, this,
				UMLPackage.PROFILE__METAMODEL_REFERENCE,
				METAMODEL_REFERENCE_ESUPERSETS, null);
		}
		return metamodelReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageImport createMetamodelReference(
			org.eclipse.uml2.uml.Package importedPackage) {
		PackageImport newMetamodelReference = (PackageImport) create(UMLPackage.Literals.PACKAGE_IMPORT);
		getMetamodelReferences().add(newMetamodelReference);
		if (importedPackage != null)
			newMetamodelReference.setImportedPackage(importedPackage);
		return newMetamodelReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageImport getMetamodelReference(
			org.eclipse.uml2.uml.Package importedPackage) {
		return getMetamodelReference(importedPackage, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageImport getMetamodelReference(
			org.eclipse.uml2.uml.Package importedPackage, boolean createOnDemand) {
		metamodelReferenceLoop : for (Iterator i = getMetamodelReferences()
			.iterator(); i.hasNext();) {
			PackageImport metamodelReference = (PackageImport) i.next();
			if (importedPackage != null
				&& !importedPackage.equals(metamodelReference
					.getImportedPackage()))
				continue metamodelReferenceLoop;
			return metamodelReference;
		}
		return createOnDemand
			? createMetamodelReference(importedPackage)
			: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMetaclassReferenceNotSpecialized(
			DiagnosticChain diagnostics, Map context) {
		return ProfileOperations.validateMetaclassReferenceNotSpecialized(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferencesSameMetamodel(DiagnosticChain diagnostics,
			Map context) {
		return ProfileOperations.validateReferencesSameMetamodel(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(Classifier classifier) {
		return ProfileOperations.create(this, classifier);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stereotype createOwnedStereotype(String name, boolean isAbstract) {
		return ProfileOperations.createOwnedStereotype(this, name, isAbstract);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDefined() {
		return ProfileOperations.isDefined(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EPackage define() {
		return ProfileOperations.define(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EPackage getDefinition() {
		return ProfileOperations.getDefinition(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENamedElement getDefinition(NamedElement namedElement) {
		return ProfileOperations.getDefinition(this, namedElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getReferencedMetaclasses() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			EList result = (EList) cache.get(this, UMLPackage.Literals.PROFILE
				.getEOperations().get(8));
			if (result == null) {
				cache.put(this, UMLPackage.Literals.PROFILE.getEOperations()
					.get(8), result = ProfileOperations
					.getReferencedMetaclasses(this));
			}
			return result;
		}
		return ProfileOperations.getReferencedMetaclasses(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getReferencedMetamodels() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			EList result = (EList) cache.get(this, UMLPackage.Literals.PROFILE
				.getEOperations().get(9));
			if (result == null) {
				cache.put(this, UMLPackage.Literals.PROFILE.getEOperations()
					.get(9), result = ProfileOperations
					.getReferencedMetamodels(this));
			}
			return result;
		}
		return ProfileOperations.getReferencedMetamodels(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedExtensions(boolean requiredOnly) {
		return ProfileOperations.getOwnedExtensions(this, requiredOnly);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.PROFILE__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.PROFILE__CLIENT_DEPENDENCY :
				return ((InternalEList) getClientDependencies()).basicAdd(
					otherEnd, msgs);
			case UMLPackage.PROFILE__ELEMENT_IMPORT :
				return ((InternalEList) getElementImports()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.PROFILE__PACKAGE_IMPORT :
				return ((InternalEList) getPackageImports()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.PROFILE__OWNED_RULE :
				return ((InternalEList) getOwnedRules()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.PROFILE__OWNING_TEMPLATE_PARAMETER :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningTemplateParameter(
					(TemplateParameter) otherEnd, msgs);
			case UMLPackage.PROFILE__TEMPLATE_PARAMETER :
				if (templateParameter != null)
					msgs = ((InternalEObject) templateParameter)
						.eInverseRemove(this,
							UMLPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT,
							TemplateParameter.class, msgs);
				return basicSetTemplateParameter((TemplateParameter) otherEnd,
					msgs);
			case UMLPackage.PROFILE__TEMPLATE_BINDING :
				return ((InternalEList) getTemplateBindings()).basicAdd(
					otherEnd, msgs);
			case UMLPackage.PROFILE__OWNED_TEMPLATE_SIGNATURE :
				if (ownedTemplateSignature != null)
					msgs = ((InternalEObject) ownedTemplateSignature)
						.eInverseRemove(this, EOPPOSITE_FEATURE_BASE
							- UMLPackage.PROFILE__OWNED_TEMPLATE_SIGNATURE,
							null, msgs);
				return basicSetOwnedTemplateSignature(
					(TemplateSignature) otherEnd, msgs);
			case UMLPackage.PROFILE__PACKAGE_MERGE :
				return ((InternalEList) getPackageMerges()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.PROFILE__PROFILE_APPLICATION :
				return ((InternalEList) getProfileApplications()).basicAdd(
					otherEnd, msgs);
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
			case UMLPackage.PROFILE__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.PROFILE__OWNED_COMMENT :
				return ((InternalEList) getOwnedComments()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.PROFILE__CLIENT_DEPENDENCY :
				return ((InternalEList) getClientDependencies()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.PROFILE__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.PROFILE__ELEMENT_IMPORT :
				return ((InternalEList) getElementImports()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.PROFILE__PACKAGE_IMPORT :
				return ((InternalEList) getPackageImports()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.PROFILE__OWNED_RULE :
				return ((InternalEList) getOwnedRules()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.PROFILE__OWNING_TEMPLATE_PARAMETER :
				return basicSetOwningTemplateParameter(null, msgs);
			case UMLPackage.PROFILE__TEMPLATE_PARAMETER :
				return basicSetTemplateParameter(null, msgs);
			case UMLPackage.PROFILE__TEMPLATE_BINDING :
				return ((InternalEList) getTemplateBindings()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.PROFILE__OWNED_TEMPLATE_SIGNATURE :
				return basicSetOwnedTemplateSignature(null, msgs);
			case UMLPackage.PROFILE__PACKAGE_MERGE :
				return ((InternalEList) getPackageMerges()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.PROFILE__PACKAGED_ELEMENT :
				return ((InternalEList) getPackagedElements()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.PROFILE__PROFILE_APPLICATION :
				return ((InternalEList) getProfileApplications()).basicRemove(
					otherEnd, msgs);
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
			case UMLPackage.PROFILE__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.PROFILE__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.PROFILE__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.PROFILE__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.PROFILE__NAME :
				return getName();
			case UMLPackage.PROFILE__VISIBILITY :
				return getVisibility();
			case UMLPackage.PROFILE__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.PROFILE__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.PROFILE__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.PROFILE__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.PROFILE__ELEMENT_IMPORT :
				return getElementImports();
			case UMLPackage.PROFILE__PACKAGE_IMPORT :
				return getPackageImports();
			case UMLPackage.PROFILE__OWNED_RULE :
				return getOwnedRules();
			case UMLPackage.PROFILE__MEMBER :
				return getMembers();
			case UMLPackage.PROFILE__IMPORTED_MEMBER :
				return getImportedMembers();
			case UMLPackage.PROFILE__OWNED_MEMBER :
				return getOwnedMembers();
			case UMLPackage.PROFILE__OWNING_TEMPLATE_PARAMETER :
				if (resolve)
					return getOwningTemplateParameter();
				return basicGetOwningTemplateParameter();
			case UMLPackage.PROFILE__TEMPLATE_PARAMETER :
				if (resolve)
					return getTemplateParameter();
				return basicGetTemplateParameter();
			case UMLPackage.PROFILE__TEMPLATE_BINDING :
				return getTemplateBindings();
			case UMLPackage.PROFILE__OWNED_TEMPLATE_SIGNATURE :
				if (resolve)
					return getOwnedTemplateSignature();
				return basicGetOwnedTemplateSignature();
			case UMLPackage.PROFILE__OWNED_TYPE :
				return getOwnedTypes();
			case UMLPackage.PROFILE__PACKAGE_MERGE :
				return getPackageMerges();
			case UMLPackage.PROFILE__PACKAGED_ELEMENT :
				return getPackagedElements();
			case UMLPackage.PROFILE__NESTED_PACKAGE :
				return getNestedPackages();
			case UMLPackage.PROFILE__NESTING_PACKAGE :
				if (resolve)
					return getNestingPackage();
				return basicGetNestingPackage();
			case UMLPackage.PROFILE__PROFILE_APPLICATION :
				return getProfileApplications();
			case UMLPackage.PROFILE__OWNED_STEREOTYPE :
				return getOwnedStereotypes();
			case UMLPackage.PROFILE__METACLASS_REFERENCE :
				return getMetaclassReferences();
			case UMLPackage.PROFILE__METAMODEL_REFERENCE :
				return getMetamodelReferences();
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
			case UMLPackage.PROFILE__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.PROFILE__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.PROFILE__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.PROFILE__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.PROFILE__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.PROFILE__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.PROFILE__ELEMENT_IMPORT :
				getElementImports().clear();
				getElementImports().addAll((Collection) newValue);
				return;
			case UMLPackage.PROFILE__PACKAGE_IMPORT :
				getPackageImports().clear();
				getPackageImports().addAll((Collection) newValue);
				return;
			case UMLPackage.PROFILE__OWNED_RULE :
				getOwnedRules().clear();
				getOwnedRules().addAll((Collection) newValue);
				return;
			case UMLPackage.PROFILE__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.PROFILE__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.PROFILE__TEMPLATE_BINDING :
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection) newValue);
				return;
			case UMLPackage.PROFILE__OWNED_TEMPLATE_SIGNATURE :
				setOwnedTemplateSignature((TemplateSignature) newValue);
				return;
			case UMLPackage.PROFILE__OWNED_TYPE :
				getOwnedTypes().clear();
				getOwnedTypes().addAll((Collection) newValue);
				return;
			case UMLPackage.PROFILE__PACKAGE_MERGE :
				getPackageMerges().clear();
				getPackageMerges().addAll((Collection) newValue);
				return;
			case UMLPackage.PROFILE__PACKAGED_ELEMENT :
				getPackagedElements().clear();
				getPackagedElements().addAll((Collection) newValue);
				return;
			case UMLPackage.PROFILE__NESTED_PACKAGE :
				getNestedPackages().clear();
				getNestedPackages().addAll((Collection) newValue);
				return;
			case UMLPackage.PROFILE__NESTING_PACKAGE :
				setNestingPackage((org.eclipse.uml2.uml.Package) newValue);
				return;
			case UMLPackage.PROFILE__PROFILE_APPLICATION :
				getProfileApplications().clear();
				getProfileApplications().addAll((Collection) newValue);
				return;
			case UMLPackage.PROFILE__OWNED_STEREOTYPE :
				getOwnedStereotypes().clear();
				getOwnedStereotypes().addAll((Collection) newValue);
				return;
			case UMLPackage.PROFILE__METACLASS_REFERENCE :
				getMetaclassReferences().clear();
				getMetaclassReferences().addAll((Collection) newValue);
				return;
			case UMLPackage.PROFILE__METAMODEL_REFERENCE :
				getMetamodelReferences().clear();
				getMetamodelReferences().addAll((Collection) newValue);
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
			case UMLPackage.PROFILE__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.PROFILE__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.PROFILE__NAME :
				unsetName();
				return;
			case UMLPackage.PROFILE__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.PROFILE__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.PROFILE__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.PROFILE__ELEMENT_IMPORT :
				getElementImports().clear();
				return;
			case UMLPackage.PROFILE__PACKAGE_IMPORT :
				getPackageImports().clear();
				return;
			case UMLPackage.PROFILE__OWNED_RULE :
				getOwnedRules().clear();
				return;
			case UMLPackage.PROFILE__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.PROFILE__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.PROFILE__TEMPLATE_BINDING :
				getTemplateBindings().clear();
				return;
			case UMLPackage.PROFILE__OWNED_TEMPLATE_SIGNATURE :
				setOwnedTemplateSignature((TemplateSignature) null);
				return;
			case UMLPackage.PROFILE__OWNED_TYPE :
				getOwnedTypes().clear();
				return;
			case UMLPackage.PROFILE__PACKAGE_MERGE :
				getPackageMerges().clear();
				return;
			case UMLPackage.PROFILE__PACKAGED_ELEMENT :
				getPackagedElements().clear();
				return;
			case UMLPackage.PROFILE__NESTED_PACKAGE :
				getNestedPackages().clear();
				return;
			case UMLPackage.PROFILE__NESTING_PACKAGE :
				setNestingPackage((org.eclipse.uml2.uml.Package) null);
				return;
			case UMLPackage.PROFILE__PROFILE_APPLICATION :
				getProfileApplications().clear();
				return;
			case UMLPackage.PROFILE__OWNED_STEREOTYPE :
				getOwnedStereotypes().clear();
				return;
			case UMLPackage.PROFILE__METACLASS_REFERENCE :
				getMetaclassReferences().clear();
				return;
			case UMLPackage.PROFILE__METAMODEL_REFERENCE :
				getMetamodelReferences().clear();
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
			case UMLPackage.PROFILE__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.PROFILE__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.PROFILE__OWNER :
				return isSetOwner();
			case UMLPackage.PROFILE__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.PROFILE__NAME :
				return isSetName();
			case UMLPackage.PROFILE__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.PROFILE__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.PROFILE__CLIENT_DEPENDENCY :
				return clientDependencies != null
					&& !clientDependencies.isEmpty();
			case UMLPackage.PROFILE__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.PROFILE__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.PROFILE__ELEMENT_IMPORT :
				return elementImports != null && !elementImports.isEmpty();
			case UMLPackage.PROFILE__PACKAGE_IMPORT :
				return packageImports != null && !packageImports.isEmpty();
			case UMLPackage.PROFILE__OWNED_RULE :
				return ownedRules != null && !ownedRules.isEmpty();
			case UMLPackage.PROFILE__MEMBER :
				return isSetMembers();
			case UMLPackage.PROFILE__IMPORTED_MEMBER :
				return !getImportedMembers().isEmpty();
			case UMLPackage.PROFILE__OWNED_MEMBER :
				return isSetOwnedMembers();
			case UMLPackage.PROFILE__OWNING_TEMPLATE_PARAMETER :
				return basicGetOwningTemplateParameter() != null;
			case UMLPackage.PROFILE__TEMPLATE_PARAMETER :
				return templateParameter != null;
			case UMLPackage.PROFILE__TEMPLATE_BINDING :
				return templateBindings != null && !templateBindings.isEmpty();
			case UMLPackage.PROFILE__OWNED_TEMPLATE_SIGNATURE :
				return ownedTemplateSignature != null;
			case UMLPackage.PROFILE__OWNED_TYPE :
				return !getOwnedTypes().isEmpty();
			case UMLPackage.PROFILE__PACKAGE_MERGE :
				return packageMerges != null && !packageMerges.isEmpty();
			case UMLPackage.PROFILE__PACKAGED_ELEMENT :
				return packagedElements != null && !packagedElements.isEmpty();
			case UMLPackage.PROFILE__NESTED_PACKAGE :
				return !getNestedPackages().isEmpty();
			case UMLPackage.PROFILE__NESTING_PACKAGE :
				return basicGetNestingPackage() != null;
			case UMLPackage.PROFILE__PROFILE_APPLICATION :
				return profileApplications != null
					&& !profileApplications.isEmpty();
			case UMLPackage.PROFILE__OWNED_STEREOTYPE :
				return !getOwnedStereotypes().isEmpty();
			case UMLPackage.PROFILE__METACLASS_REFERENCE :
				return metaclassReferences != null
					&& !metaclassReferences.isEmpty();
			case UMLPackage.PROFILE__METAMODEL_REFERENCE :
				return metamodelReferences != null
					&& !metamodelReferences.isEmpty();
		}
		return eDynamicIsSet(featureID);
	}

} //ProfileImpl
