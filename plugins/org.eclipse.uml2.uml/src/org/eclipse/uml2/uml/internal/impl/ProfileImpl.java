/*
 * Copyright (c) 2005, 2016 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey - 286329, 323181
 *   Kenn Hussey (CEA) - 327039, 351774, 418466, 451350, 485756
 *
 */
package org.eclipse.uml2.uml.internal.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.SubsetSupersetEObjectContainmentWithInverseEList;
import org.eclipse.uml2.common.util.SubsetSupersetEObjectResolvingEList;

import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.ElementImport;
import org.eclipse.uml2.uml.Extension;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.PackageImport;
import org.eclipse.uml2.uml.PackageMerge;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.ParameterableElement;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.ProfileApplication;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.TemplateBinding;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.TemplateSignature;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.ProfileOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Profile</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ProfileImpl#getElementImports <em>Element Import</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ProfileImpl#getPackageImports <em>Package Import</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ProfileImpl#getMetaclassReferences <em>Metaclass Reference</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ProfileImpl#getMetamodelReferences <em>Metamodel Reference</em>}</li>
 * </ul>
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
	protected EList<ElementImport> metaclassReferences;

	/**
	 * The cached value of the '{@link #getMetamodelReferences() <em>Metamodel Reference</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetamodelReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<PackageImport> metamodelReferences;

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
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.PROFILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ElementImport> getElementImports() {
		if (elementImports == null) {
			elementImports = new SubsetSupersetEObjectContainmentWithInverseEList.Resolving<ElementImport>(
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
	protected static final int[] ELEMENT_IMPORT_ESUBSETS = new int[]{
		UMLPackage.PROFILE__METACLASS_REFERENCE};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PackageImport> getPackageImports() {
		if (packageImports == null) {
			packageImports = new SubsetSupersetEObjectContainmentWithInverseEList.Resolving<PackageImport>(
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
	protected static final int[] PACKAGE_IMPORT_ESUBSETS = new int[]{
		UMLPackage.PROFILE__METAMODEL_REFERENCE};

	/**
	 * The array of superset feature identifiers for the '{@link #getMetaclassReferences() <em>Metaclass Reference</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaclassReferences()
	 * @generated
	 * @ordered
	 */
	protected static final int[] METACLASS_REFERENCE_ESUPERSETS = new int[]{
		UMLPackage.PROFILE__ELEMENT_IMPORT};

	/**
	 * The array of superset feature identifiers for the '{@link #getMetamodelReferences() <em>Metamodel Reference</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetamodelReferences()
	 * @generated
	 * @ordered
	 */
	protected static final int[] METAMODEL_REFERENCE_ESUPERSETS = new int[]{
		UMLPackage.PROFILE__PACKAGE_IMPORT};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElementImport> getMetaclassReferences() {
		if (metaclassReferences == null) {
			metaclassReferences = new SubsetSupersetEObjectResolvingEList<ElementImport>(
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
		ElementImport newMetaclassReference = (ElementImport) create(
			UMLPackage.Literals.ELEMENT_IMPORT);
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
		metaclassReferenceLoop : for (ElementImport metaclassReference : getMetaclassReferences()) {
			if (importedElement != null && !importedElement
				.equals(metaclassReference.getImportedElement()))
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
	public EList<PackageImport> getMetamodelReferences() {
		if (metamodelReferences == null) {
			metamodelReferences = new SubsetSupersetEObjectResolvingEList<PackageImport>(
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
		PackageImport newMetamodelReference = (PackageImport) create(
			UMLPackage.Literals.PACKAGE_IMPORT);
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
			org.eclipse.uml2.uml.Package importedPackage,
			boolean createOnDemand) {
		metamodelReferenceLoop : for (PackageImport metamodelReference : getMetamodelReferences()) {
			if (importedPackage != null && !importedPackage
				.equals(metamodelReference.getImportedPackage()))
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
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProfileOperations.validateMetaclassReferenceNotSpecialized(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferencesSameMetamodel(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
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

	public EPackage define(Map<String, String> options,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProfileOperations.define(this, options, diagnostics, context);
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
	public EList<org.eclipse.uml2.uml.Class> getReferencedMetaclasses() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			@SuppressWarnings("unchecked")
			EList<org.eclipse.uml2.uml.Class> result = (EList<org.eclipse.uml2.uml.Class>) cache
				.get(this,
					UMLPackage.Literals.PROFILE___GET_REFERENCED_METACLASSES);
			if (result == null) {
				cache.put(this,
					UMLPackage.Literals.PROFILE___GET_REFERENCED_METACLASSES,
					result = ProfileOperations.getReferencedMetaclasses(this));
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
	public EList<Model> getReferencedMetamodels() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			@SuppressWarnings("unchecked")
			EList<Model> result = (EList<Model>) cache.get(this,
				UMLPackage.Literals.PROFILE___GET_REFERENCED_METAMODELS);
			if (result == null) {
				cache.put(this,
					UMLPackage.Literals.PROFILE___GET_REFERENCED_METAMODELS,
					result = ProfileOperations.getReferencedMetamodels(this));
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
	public EList<Extension> getOwnedExtensions(boolean requiredOnly) {
		return ProfileOperations.getOwnedExtensions(this, requiredOnly);
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
			case UMLPackage.PROFILE__EANNOTATIONS :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getEAnnotations())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.PROFILE__OWNED_RULE :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getOwnedRules())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.PROFILE__ELEMENT_IMPORT :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getElementImports())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.PROFILE__PACKAGE_IMPORT :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getPackageImports())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.PROFILE__OWNING_TEMPLATE_PARAMETER :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningTemplateParameter(
					(TemplateParameter) otherEnd, msgs);
			case UMLPackage.PROFILE__TEMPLATE_PARAMETER :
				if (templateParameter != null)
					msgs = ((InternalEObject) templateParameter).eInverseRemove(
						this,
						UMLPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT,
						TemplateParameter.class, msgs);
				return basicSetTemplateParameter((TemplateParameter) otherEnd,
					msgs);
			case UMLPackage.PROFILE__TEMPLATE_BINDING :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getTemplateBindings())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.PROFILE__OWNED_TEMPLATE_SIGNATURE :
				if (ownedTemplateSignature != null)
					msgs = ((InternalEObject) ownedTemplateSignature)
						.eInverseRemove(this,
							EOPPOSITE_FEATURE_BASE
								- UMLPackage.PROFILE__OWNED_TEMPLATE_SIGNATURE,
							null, msgs);
				return basicSetOwnedTemplateSignature(
					(TemplateSignature) otherEnd, msgs);
			case UMLPackage.PROFILE__PACKAGE_MERGE :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getPackageMerges())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.PROFILE__PROFILE_APPLICATION :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getProfileApplications())
					.basicAdd(otherEnd, msgs);
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
			case UMLPackage.PROFILE__EANNOTATIONS :
				return ((InternalEList<?>) getEAnnotations())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.PROFILE__OWNED_COMMENT :
				return ((InternalEList<?>) getOwnedComments())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.PROFILE__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.PROFILE__OWNED_RULE :
				return ((InternalEList<?>) getOwnedRules())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.PROFILE__ELEMENT_IMPORT :
				return ((InternalEList<?>) getElementImports())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.PROFILE__PACKAGE_IMPORT :
				return ((InternalEList<?>) getPackageImports())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.PROFILE__OWNING_TEMPLATE_PARAMETER :
				return basicSetOwningTemplateParameter(null, msgs);
			case UMLPackage.PROFILE__TEMPLATE_PARAMETER :
				return basicSetTemplateParameter(null, msgs);
			case UMLPackage.PROFILE__TEMPLATE_BINDING :
				return ((InternalEList<?>) getTemplateBindings())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.PROFILE__OWNED_TEMPLATE_SIGNATURE :
				return basicSetOwnedTemplateSignature(null, msgs);
			case UMLPackage.PROFILE__PACKAGE_MERGE :
				return ((InternalEList<?>) getPackageMerges())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.PROFILE__PACKAGED_ELEMENT :
				return ((InternalEList<?>) getPackagedElements())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.PROFILE__PROFILE_APPLICATION :
				return ((InternalEList<?>) getProfileApplications())
					.basicRemove(otherEnd, msgs);
		}
		return eDynamicInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.PROFILE__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.PROFILE__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.PROFILE__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.PROFILE__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.PROFILE__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.PROFILE__NAME :
				return getName();
			case UMLPackage.PROFILE__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.PROFILE__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.PROFILE__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.PROFILE__VISIBILITY :
				return getVisibility();
			case UMLPackage.PROFILE__OWNED_RULE :
				return getOwnedRules();
			case UMLPackage.PROFILE__ELEMENT_IMPORT :
				return getElementImports();
			case UMLPackage.PROFILE__PACKAGE_IMPORT :
				return getPackageImports();
			case UMLPackage.PROFILE__OWNED_MEMBER :
				return getOwnedMembers();
			case UMLPackage.PROFILE__IMPORTED_MEMBER :
				return getImportedMembers();
			case UMLPackage.PROFILE__MEMBER :
				return getMembers();
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
			case UMLPackage.PROFILE__URI :
				return getURI();
			case UMLPackage.PROFILE__NESTED_PACKAGE :
				return getNestedPackages();
			case UMLPackage.PROFILE__NESTING_PACKAGE :
				if (resolve)
					return getNestingPackage();
				return basicGetNestingPackage();
			case UMLPackage.PROFILE__OWNED_STEREOTYPE :
				return getOwnedStereotypes();
			case UMLPackage.PROFILE__OWNED_TYPE :
				return getOwnedTypes();
			case UMLPackage.PROFILE__PACKAGE_MERGE :
				return getPackageMerges();
			case UMLPackage.PROFILE__PACKAGED_ELEMENT :
				return getPackagedElements();
			case UMLPackage.PROFILE__PROFILE_APPLICATION :
				return getProfileApplications();
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UMLPackage.PROFILE__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations()
					.addAll((Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.PROFILE__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments()
					.addAll((Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.PROFILE__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.PROFILE__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.PROFILE__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.PROFILE__OWNED_RULE :
				getOwnedRules().clear();
				getOwnedRules()
					.addAll((Collection<? extends Constraint>) newValue);
				return;
			case UMLPackage.PROFILE__ELEMENT_IMPORT :
				getElementImports().clear();
				getElementImports()
					.addAll((Collection<? extends ElementImport>) newValue);
				return;
			case UMLPackage.PROFILE__PACKAGE_IMPORT :
				getPackageImports().clear();
				getPackageImports()
					.addAll((Collection<? extends PackageImport>) newValue);
				return;
			case UMLPackage.PROFILE__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.PROFILE__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.PROFILE__TEMPLATE_BINDING :
				getTemplateBindings().clear();
				getTemplateBindings()
					.addAll((Collection<? extends TemplateBinding>) newValue);
				return;
			case UMLPackage.PROFILE__OWNED_TEMPLATE_SIGNATURE :
				setOwnedTemplateSignature((TemplateSignature) newValue);
				return;
			case UMLPackage.PROFILE__URI :
				setURI((String) newValue);
				return;
			case UMLPackage.PROFILE__NESTED_PACKAGE :
				getNestedPackages().clear();
				getNestedPackages().addAll(
					(Collection<? extends org.eclipse.uml2.uml.Package>) newValue);
				return;
			case UMLPackage.PROFILE__NESTING_PACKAGE :
				setNestingPackage((org.eclipse.uml2.uml.Package) newValue);
				return;
			case UMLPackage.PROFILE__OWNED_TYPE :
				getOwnedTypes().clear();
				getOwnedTypes().addAll((Collection<? extends Type>) newValue);
				return;
			case UMLPackage.PROFILE__PACKAGE_MERGE :
				getPackageMerges().clear();
				getPackageMerges()
					.addAll((Collection<? extends PackageMerge>) newValue);
				return;
			case UMLPackage.PROFILE__PACKAGED_ELEMENT :
				getPackagedElements().clear();
				getPackagedElements().addAll(
					(Collection<? extends PackageableElement>) newValue);
				return;
			case UMLPackage.PROFILE__PROFILE_APPLICATION :
				getProfileApplications().clear();
				getProfileApplications().addAll(
					(Collection<? extends ProfileApplication>) newValue);
				return;
			case UMLPackage.PROFILE__METACLASS_REFERENCE :
				getMetaclassReferences().clear();
				getMetaclassReferences()
					.addAll((Collection<? extends ElementImport>) newValue);
				return;
			case UMLPackage.PROFILE__METAMODEL_REFERENCE :
				getMetamodelReferences().clear();
				getMetamodelReferences()
					.addAll((Collection<? extends PackageImport>) newValue);
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
			case UMLPackage.PROFILE__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.PROFILE__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.PROFILE__NAME :
				unsetName();
				return;
			case UMLPackage.PROFILE__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.PROFILE__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.PROFILE__OWNED_RULE :
				getOwnedRules().clear();
				return;
			case UMLPackage.PROFILE__ELEMENT_IMPORT :
				getElementImports().clear();
				return;
			case UMLPackage.PROFILE__PACKAGE_IMPORT :
				getPackageImports().clear();
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
			case UMLPackage.PROFILE__URI :
				setURI(URI_EDEFAULT);
				return;
			case UMLPackage.PROFILE__NESTED_PACKAGE :
				getNestedPackages().clear();
				return;
			case UMLPackage.PROFILE__NESTING_PACKAGE :
				setNestingPackage((org.eclipse.uml2.uml.Package) null);
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
			case UMLPackage.PROFILE__PROFILE_APPLICATION :
				getProfileApplications().clear();
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
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UMLPackage.PROFILE__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.PROFILE__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.PROFILE__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.PROFILE__OWNER :
				return isSetOwner();
			case UMLPackage.PROFILE__CLIENT_DEPENDENCY :
				return !getClientDependencies().isEmpty();
			case UMLPackage.PROFILE__NAME :
				return isSetName();
			case UMLPackage.PROFILE__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.PROFILE__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.PROFILE__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.PROFILE__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.PROFILE__OWNED_RULE :
				return ownedRules != null && !ownedRules.isEmpty();
			case UMLPackage.PROFILE__ELEMENT_IMPORT :
				return elementImports != null && !elementImports.isEmpty();
			case UMLPackage.PROFILE__PACKAGE_IMPORT :
				return packageImports != null && !packageImports.isEmpty();
			case UMLPackage.PROFILE__OWNED_MEMBER :
				return isSetOwnedMembers();
			case UMLPackage.PROFILE__IMPORTED_MEMBER :
				return !getImportedMembers().isEmpty();
			case UMLPackage.PROFILE__MEMBER :
				return isSetMembers();
			case UMLPackage.PROFILE__OWNING_TEMPLATE_PARAMETER :
				return basicGetOwningTemplateParameter() != null;
			case UMLPackage.PROFILE__TEMPLATE_PARAMETER :
				return templateParameter != null;
			case UMLPackage.PROFILE__TEMPLATE_BINDING :
				return templateBindings != null && !templateBindings.isEmpty();
			case UMLPackage.PROFILE__OWNED_TEMPLATE_SIGNATURE :
				return ownedTemplateSignature != null;
			case UMLPackage.PROFILE__URI :
				return URI_EDEFAULT == null
					? uri != null
					: !URI_EDEFAULT.equals(uri);
			case UMLPackage.PROFILE__NESTED_PACKAGE :
				return !getNestedPackages().isEmpty();
			case UMLPackage.PROFILE__NESTING_PACKAGE :
				return basicGetNestingPackage() != null;
			case UMLPackage.PROFILE__OWNED_STEREOTYPE :
				return !getOwnedStereotypes().isEmpty();
			case UMLPackage.PROFILE__OWNED_TYPE :
				return !getOwnedTypes().isEmpty();
			case UMLPackage.PROFILE__PACKAGE_MERGE :
				return packageMerges != null && !packageMerges.isEmpty();
			case UMLPackage.PROFILE__PACKAGED_ELEMENT :
				return packagedElements != null && !packagedElements.isEmpty();
			case UMLPackage.PROFILE__PROFILE_APPLICATION :
				return profileApplications != null
					&& !profileApplications.isEmpty();
			case UMLPackage.PROFILE__METACLASS_REFERENCE :
				return metaclassReferences != null
					&& !metaclassReferences.isEmpty();
			case UMLPackage.PROFILE__METAMODEL_REFERENCE :
				return metamodelReferences != null
					&& !metamodelReferences.isEmpty();
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
			case UMLPackage.PROFILE___GET_EANNOTATION__STRING :
				return getEAnnotation((String) arguments.get(0));
			case UMLPackage.PROFILE___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP :
				return validateHasOwner((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PROFILE___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP :
				return validateNotOwnSelf((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PROFILE___ADD_KEYWORD__STRING :
				return addKeyword((String) arguments.get(0));
			case UMLPackage.PROFILE___APPLY_STEREOTYPE__STEREOTYPE :
				return applyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.PROFILE___CREATE_EANNOTATION__STRING :
				return createEAnnotation((String) arguments.get(0));
			case UMLPackage.PROFILE___DESTROY :
				destroy();
				return null;
			case UMLPackage.PROFILE___GET_KEYWORDS :
				return getKeywords();
			case UMLPackage.PROFILE___GET_APPLICABLE_STEREOTYPE__STRING :
				return getApplicableStereotype((String) arguments.get(0));
			case UMLPackage.PROFILE___GET_APPLICABLE_STEREOTYPES :
				return getApplicableStereotypes();
			case UMLPackage.PROFILE___GET_APPLIED_STEREOTYPE__STRING :
				return getAppliedStereotype((String) arguments.get(0));
			case UMLPackage.PROFILE___GET_APPLIED_STEREOTYPES :
				return getAppliedStereotypes();
			case UMLPackage.PROFILE___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING :
				return getAppliedSubstereotype((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.PROFILE___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE :
				return getAppliedSubstereotypes((Stereotype) arguments.get(0));
			case UMLPackage.PROFILE___GET_MODEL :
				return getModel();
			case UMLPackage.PROFILE___GET_NEAREST_PACKAGE :
				return getNearestPackage();
			case UMLPackage.PROFILE___GET_RELATIONSHIPS :
				return getRelationships();
			case UMLPackage.PROFILE___GET_RELATIONSHIPS__ECLASS :
				return getRelationships((EClass) arguments.get(0));
			case UMLPackage.PROFILE___GET_REQUIRED_STEREOTYPE__STRING :
				return getRequiredStereotype((String) arguments.get(0));
			case UMLPackage.PROFILE___GET_REQUIRED_STEREOTYPES :
				return getRequiredStereotypes();
			case UMLPackage.PROFILE___GET_SOURCE_DIRECTED_RELATIONSHIPS :
				return getSourceDirectedRelationships();
			case UMLPackage.PROFILE___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS :
				return getSourceDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.PROFILE___GET_STEREOTYPE_APPLICATION__STEREOTYPE :
				return getStereotypeApplication((Stereotype) arguments.get(0));
			case UMLPackage.PROFILE___GET_STEREOTYPE_APPLICATIONS :
				return getStereotypeApplications();
			case UMLPackage.PROFILE___GET_TARGET_DIRECTED_RELATIONSHIPS :
				return getTargetDirectedRelationships();
			case UMLPackage.PROFILE___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS :
				return getTargetDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.PROFILE___GET_VALUE__STEREOTYPE_STRING :
				return getValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.PROFILE___HAS_KEYWORD__STRING :
				return hasKeyword((String) arguments.get(0));
			case UMLPackage.PROFILE___HAS_VALUE__STEREOTYPE_STRING :
				return hasValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.PROFILE___IS_STEREOTYPE_APPLICABLE__STEREOTYPE :
				return isStereotypeApplicable((Stereotype) arguments.get(0));
			case UMLPackage.PROFILE___IS_STEREOTYPE_APPLIED__STEREOTYPE :
				return isStereotypeApplied((Stereotype) arguments.get(0));
			case UMLPackage.PROFILE___IS_STEREOTYPE_REQUIRED__STEREOTYPE :
				return isStereotypeRequired((Stereotype) arguments.get(0));
			case UMLPackage.PROFILE___REMOVE_KEYWORD__STRING :
				return removeKeyword((String) arguments.get(0));
			case UMLPackage.PROFILE___SET_VALUE__STEREOTYPE_STRING_OBJECT :
				setValue((Stereotype) arguments.get(0),
					(String) arguments.get(1), arguments.get(2));
				return null;
			case UMLPackage.PROFILE___UNAPPLY_STEREOTYPE__STEREOTYPE :
				return unapplyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.PROFILE___ALL_OWNED_ELEMENTS :
				return allOwnedElements();
			case UMLPackage.PROFILE___MUST_BE_OWNED :
				return mustBeOwned();
			case UMLPackage.PROFILE___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP :
				return validateVisibilityNeedsOwnership(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PROFILE___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PROFILE___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasNoQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PROFILE___CREATE_DEPENDENCY__NAMEDELEMENT :
				return createDependency((NamedElement) arguments.get(0));
			case UMLPackage.PROFILE___CREATE_USAGE__NAMEDELEMENT :
				return createUsage((NamedElement) arguments.get(0));
			case UMLPackage.PROFILE___GET_LABEL :
				return getLabel();
			case UMLPackage.PROFILE___GET_LABEL__BOOLEAN :
				return getLabel((Boolean) arguments.get(0));
			case UMLPackage.PROFILE___GET_NAMESPACE :
				return getNamespace();
			case UMLPackage.PROFILE___ALL_NAMESPACES :
				return allNamespaces();
			case UMLPackage.PROFILE___ALL_OWNING_PACKAGES :
				return allOwningPackages();
			case UMLPackage.PROFILE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE :
				return isDistinguishableFrom((NamedElement) arguments.get(0),
					(Namespace) arguments.get(1));
			case UMLPackage.PROFILE___GET_QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.PROFILE___SEPARATOR :
				return separator();
			case UMLPackage.PROFILE___GET_CLIENT_DEPENDENCIES :
				return getClientDependencies();
			case UMLPackage.PROFILE___VALIDATE_MEMBERS_DISTINGUISHABLE__DIAGNOSTICCHAIN_MAP :
				return validateMembersDistinguishable(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PROFILE___VALIDATE_CANNOT_IMPORT_SELF__DIAGNOSTICCHAIN_MAP :
				return validateCannotImportSelf(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PROFILE___VALIDATE_CANNOT_IMPORT_OWNED_MEMBERS__DIAGNOSTICCHAIN_MAP :
				return validateCannotImportOwnedMembers(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PROFILE___CREATE_ELEMENT_IMPORT__PACKAGEABLEELEMENT_VISIBILITYKIND :
				return createElementImport(
					(PackageableElement) arguments.get(0),
					(VisibilityKind) arguments.get(1));
			case UMLPackage.PROFILE___CREATE_PACKAGE_IMPORT__PACKAGE_VISIBILITYKIND :
				return createPackageImport(
					(org.eclipse.uml2.uml.Package) arguments.get(0),
					(VisibilityKind) arguments.get(1));
			case UMLPackage.PROFILE___GET_IMPORTED_ELEMENTS :
				return getImportedElements();
			case UMLPackage.PROFILE___GET_IMPORTED_PACKAGES :
				return getImportedPackages();
			case UMLPackage.PROFILE___GET_OWNED_MEMBERS :
				return getOwnedMembers();
			case UMLPackage.PROFILE___EXCLUDE_COLLISIONS__ELIST :
				return excludeCollisions(
					(EList<PackageableElement>) arguments.get(0));
			case UMLPackage.PROFILE___GET_NAMES_OF_MEMBER__NAMEDELEMENT :
				return getNamesOfMember((NamedElement) arguments.get(0));
			case UMLPackage.PROFILE___IMPORT_MEMBERS__ELIST :
				return importMembers(
					(EList<PackageableElement>) arguments.get(0));
			case UMLPackage.PROFILE___GET_IMPORTED_MEMBERS :
				return getImportedMembers();
			case UMLPackage.PROFILE___MEMBERS_ARE_DISTINGUISHABLE :
				return membersAreDistinguishable();
			case UMLPackage.PROFILE___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT :
				return isCompatibleWith(
					(ParameterableElement) arguments.get(0));
			case UMLPackage.PROFILE___IS_TEMPLATE_PARAMETER :
				return isTemplateParameter();
			case UMLPackage.PROFILE___VALIDATE_NAMESPACE_NEEDS_VISIBILITY__DIAGNOSTICCHAIN_MAP :
				return validateNamespaceNeedsVisibility(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PROFILE___IS_TEMPLATE :
				return isTemplate();
			case UMLPackage.PROFILE___PARAMETERABLE_ELEMENTS :
				return parameterableElements();
			case UMLPackage.PROFILE___VALIDATE_ELEMENTS_PUBLIC_OR_PRIVATE__DIAGNOSTICCHAIN_MAP :
				return validateElementsPublicOrPrivate(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PROFILE___APPLY_PROFILE__PROFILE :
				return applyProfile((Profile) arguments.get(0));
			case UMLPackage.PROFILE___CREATE_OWNED_CLASS__STRING_BOOLEAN :
				return createOwnedClass((String) arguments.get(0),
					(Boolean) arguments.get(1));
			case UMLPackage.PROFILE___CREATE_OWNED_ENUMERATION__STRING :
				return createOwnedEnumeration((String) arguments.get(0));
			case UMLPackage.PROFILE___CREATE_OWNED_INTERFACE__STRING :
				return createOwnedInterface((String) arguments.get(0));
			case UMLPackage.PROFILE___CREATE_OWNED_PRIMITIVE_TYPE__STRING :
				return createOwnedPrimitiveType((String) arguments.get(0));
			case UMLPackage.PROFILE___CREATE_OWNED_STEREOTYPE__STRING_BOOLEAN :
				return createOwnedStereotype((String) arguments.get(0),
					(Boolean) arguments.get(1));
			case UMLPackage.PROFILE___GET_ALL_APPLIED_PROFILES :
				return getAllAppliedProfiles();
			case UMLPackage.PROFILE___GET_ALL_PROFILE_APPLICATIONS :
				return getAllProfileApplications();
			case UMLPackage.PROFILE___GET_APPLIED_PROFILE__STRING :
				return getAppliedProfile((String) arguments.get(0));
			case UMLPackage.PROFILE___GET_APPLIED_PROFILE__STRING_BOOLEAN :
				return getAppliedProfile((String) arguments.get(0),
					(Boolean) arguments.get(1));
			case UMLPackage.PROFILE___GET_APPLIED_PROFILES :
				return getAppliedProfiles();
			case UMLPackage.PROFILE___GET_PROFILE_APPLICATION__PROFILE :
				return getProfileApplication((Profile) arguments.get(0));
			case UMLPackage.PROFILE___GET_PROFILE_APPLICATION__PROFILE_BOOLEAN :
				return getProfileApplication((Profile) arguments.get(0),
					(Boolean) arguments.get(1));
			case UMLPackage.PROFILE___IS_MODEL_LIBRARY :
				return isModelLibrary();
			case UMLPackage.PROFILE___IS_PROFILE_APPLIED__PROFILE :
				return isProfileApplied((Profile) arguments.get(0));
			case UMLPackage.PROFILE___UNAPPLY_PROFILE__PROFILE :
				return unapplyProfile((Profile) arguments.get(0));
			case UMLPackage.PROFILE___APPLY_PROFILES__ELIST :
				return applyProfiles((EList<Profile>) arguments.get(0));
			case UMLPackage.PROFILE___ALL_APPLICABLE_STEREOTYPES :
				return allApplicableStereotypes();
			case UMLPackage.PROFILE___CONTAINING_PROFILE :
				return containingProfile();
			case UMLPackage.PROFILE___MAKES_VISIBLE__NAMEDELEMENT :
				return makesVisible((NamedElement) arguments.get(0));
			case UMLPackage.PROFILE___GET_NESTED_PACKAGES :
				return getNestedPackages();
			case UMLPackage.PROFILE___GET_OWNED_STEREOTYPES :
				return getOwnedStereotypes();
			case UMLPackage.PROFILE___GET_OWNED_TYPES :
				return getOwnedTypes();
			case UMLPackage.PROFILE___VISIBLE_MEMBERS :
				return visibleMembers();
			case UMLPackage.PROFILE___VALIDATE_METACLASS_REFERENCE_NOT_SPECIALIZED__DIAGNOSTICCHAIN_MAP :
				return validateMetaclassReferenceNotSpecialized(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PROFILE___VALIDATE_REFERENCES_SAME_METAMODEL__DIAGNOSTICCHAIN_MAP :
				return validateReferencesSameMetamodel(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PROFILE___CREATE__CLASSIFIER :
				return create((Classifier) arguments.get(0));
			case UMLPackage.PROFILE___DEFINE :
				return define();
			case UMLPackage.PROFILE___DEFINE__MAP_DIAGNOSTICCHAIN_MAP :
				return define((Map<String, String>) arguments.get(0),
					(DiagnosticChain) arguments.get(1),
					(Map<Object, Object>) arguments.get(2));
			case UMLPackage.PROFILE___GET_DEFINITION :
				return getDefinition();
			case UMLPackage.PROFILE___GET_DEFINITION__NAMEDELEMENT :
				return getDefinition((NamedElement) arguments.get(0));
			case UMLPackage.PROFILE___GET_OWNED_EXTENSIONS__BOOLEAN :
				return getOwnedExtensions((Boolean) arguments.get(0));
			case UMLPackage.PROFILE___GET_REFERENCED_METACLASSES :
				return getReferencedMetaclasses();
			case UMLPackage.PROFILE___GET_REFERENCED_METAMODELS :
				return getReferencedMetamodels();
			case UMLPackage.PROFILE___IS_DEFINED :
				return isDefined();
		}
		return eDynamicInvoke(operationID, arguments);
	}

} //ProfileImpl
