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
 * $Id: ProfileImpl.java,v 1.36 2006/05/26 18:16:42 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.Classifier;
import org.eclipse.uml2.ElementImport;
import org.eclipse.uml2.Model;
import org.eclipse.uml2.PackageImport;
import org.eclipse.uml2.PackageableElement;
import org.eclipse.uml2.Profile;
import org.eclipse.uml2.Stereotype;
import org.eclipse.uml2.StringExpression;
import org.eclipse.uml2.TemplateParameter;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.VisibilityKind;

import org.eclipse.uml2.common.util.SubsetSupersetEObjectContainmentWithInverseEList;
import org.eclipse.uml2.common.util.SubsetSupersetEObjectEList;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedEObjectEList;
import org.eclipse.uml2.internal.operation.ProfileOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Profile</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.ProfileImpl#getOwnedMembers <em>Owned Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ProfileImpl#getElementImports <em>Element Import</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ProfileImpl#getPackageImports <em>Package Import</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ProfileImpl#getOwnedStereotypes <em>Owned Stereotype</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ProfileImpl#getMetaclassReferences <em>Metaclass Reference</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ProfileImpl#getMetamodelReferences <em>Metamodel Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProfileImpl extends PackageImpl implements Profile {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

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
		return UML2Package.Literals.PROFILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedMembers() {
		if (ownedMembers == null) {
			ownedMembers = new EObjectContainmentEList(PackageableElement.class, this, UML2Package.PROFILE__OWNED_MEMBER);
		}
		return ownedMembers;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedMembers() {
		return ownedMembers != null && !ownedMembers.isEmpty();
	}

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
				UML2Package.Literals.PROFILE__OWNED_STEREOTYPE);
			if (ownedStereotypes == null) {
				cache.put(eResource, this,
					UML2Package.Literals.PROFILE__OWNED_STEREOTYPE,
					ownedStereotypes = new DerivedEObjectEList(Stereotype.class,
						this, UML2Package.PROFILE__OWNED_STEREOTYPE,
						OWNED_STEREOTYPE_ESUPERSETS));
			}
			return ownedStereotypes;
		}
		return new DerivedEObjectEList(Stereotype.class, this,
			UML2Package.PROFILE__OWNED_STEREOTYPE, OWNED_STEREOTYPE_ESUPERSETS);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    public Stereotype getOwnedStereotype(String name) {
		return getOwnedStereotype(name, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stereotype getOwnedStereotype(String name, boolean ignoreCase) {
		ownedStereotypeLoop: for (Iterator i = getOwnedStereotypes().iterator(); i.hasNext(); ) {
			Stereotype ownedStereotype = (Stereotype) i.next();
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(ownedStereotype.getName()) : name.equals(ownedStereotype.getName())))
				continue ownedStereotypeLoop;
			return ownedStereotype;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getMetaclassReferences() {
		if (metaclassReferences == null) {
			metaclassReferences = new SubsetSupersetEObjectEList(ElementImport.class, this, UML2Package.PROFILE__METACLASS_REFERENCE, METACLASS_REFERENCE_ESUPERSETS, null);
		}
		return metaclassReferences;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getMetamodelReferences() {
		if (metamodelReferences == null) {
			metamodelReferences = new SubsetSupersetEObjectEList(PackageImport.class, this, UML2Package.PROFILE__METAMODEL_REFERENCE, METAMODEL_REFERENCE_ESUPERSETS, null);
		}
		return metamodelReferences;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UML2Package.PROFILE__EANNOTATIONS:
				return ((InternalEList)getEAnnotations()).basicAdd(otherEnd, msgs);
			case UML2Package.PROFILE__TEMPLATE_BINDING:
				return ((InternalEList)getTemplateBindings()).basicAdd(otherEnd, msgs);
			case UML2Package.PROFILE__OWNED_TEMPLATE_SIGNATURE:
				if (ownedTemplateSignature != null)
					msgs = ((InternalEObject)ownedTemplateSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.PROFILE__OWNED_TEMPLATE_SIGNATURE, null, msgs);
				return basicSetOwnedTemplateSignature((TemplateSignature)otherEnd, msgs);
			case UML2Package.PROFILE__CLIENT_DEPENDENCY:
				return ((InternalEList)getClientDependencies()).basicAdd(otherEnd, msgs);
			case UML2Package.PROFILE__OWNED_RULE:
				return ((InternalEList)getOwnedRules()).basicAdd(otherEnd, msgs);
			case UML2Package.PROFILE__ELEMENT_IMPORT:
				return ((InternalEList)getElementImports()).basicAdd(otherEnd, msgs);
			case UML2Package.PROFILE__PACKAGE_IMPORT:
				return ((InternalEList)getPackageImports()).basicAdd(otherEnd, msgs);
			case UML2Package.PROFILE__TEMPLATE_PARAMETER:
				if (templateParameter != null)
					msgs = ((InternalEObject)templateParameter).eInverseRemove(this, UML2Package.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
				return basicSetTemplateParameter((TemplateParameter)otherEnd, msgs);
			case UML2Package.PROFILE__OWNING_PARAMETER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningParameter((TemplateParameter)otherEnd, msgs);
			case UML2Package.PROFILE__PACKAGE_MERGE:
				return ((InternalEList)getPackageMerges()).basicAdd(otherEnd, msgs);
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
			case UML2Package.PROFILE__EANNOTATIONS:
				return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
			case UML2Package.PROFILE__OWNED_COMMENT:
				return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
			case UML2Package.PROFILE__TEMPLATE_BINDING:
				return ((InternalEList)getTemplateBindings()).basicRemove(otherEnd, msgs);
			case UML2Package.PROFILE__OWNED_TEMPLATE_SIGNATURE:
				return basicSetOwnedTemplateSignature(null, msgs);
			case UML2Package.PROFILE__CLIENT_DEPENDENCY:
				return ((InternalEList)getClientDependencies()).basicRemove(otherEnd, msgs);
			case UML2Package.PROFILE__NAME_EXPRESSION:
				return basicSetNameExpression(null, msgs);
			case UML2Package.PROFILE__OWNED_RULE:
				return ((InternalEList)getOwnedRules()).basicRemove(otherEnd, msgs);
			case UML2Package.PROFILE__ELEMENT_IMPORT:
				return ((InternalEList)getElementImports()).basicRemove(otherEnd, msgs);
			case UML2Package.PROFILE__PACKAGE_IMPORT:
				return ((InternalEList)getPackageImports()).basicRemove(otherEnd, msgs);
			case UML2Package.PROFILE__TEMPLATE_PARAMETER:
				return basicSetTemplateParameter(null, msgs);
			case UML2Package.PROFILE__OWNING_PARAMETER:
				return basicSetOwningParameter(null, msgs);
			case UML2Package.PROFILE__OWNED_MEMBER:
				return ((InternalEList)getOwnedMembers()).basicRemove(otherEnd, msgs);
			case UML2Package.PROFILE__PACKAGE_MERGE:
				return ((InternalEList)getPackageMerges()).basicRemove(otherEnd, msgs);
			case UML2Package.PROFILE__PACKAGE_EXTENSION:
				return ((InternalEList)getPackageExtensions()).basicRemove(otherEnd, msgs);
		}
		return eDynamicInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getElementImports() {
		if (elementImports == null) {
			elementImports = new SubsetSupersetEObjectContainmentWithInverseEList(ElementImport.class, this, UML2Package.PROFILE__ELEMENT_IMPORT, null, ELEMENT_IMPORT_ESUBSETS, UML2Package.ELEMENT_IMPORT__IMPORTING_NAMESPACE);
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
	protected static final int[] ELEMENT_IMPORT_ESUBSETS = new int[] {UML2Package.PROFILE__METACLASS_REFERENCE};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getPackageImports() {
		if (packageImports == null) {
			packageImports = new SubsetSupersetEObjectContainmentWithInverseEList(PackageImport.class, this, UML2Package.PROFILE__PACKAGE_IMPORT, null, PACKAGE_IMPORT_ESUBSETS, UML2Package.PACKAGE_IMPORT__IMPORTING_NAMESPACE);
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
	protected static final int[] PACKAGE_IMPORT_ESUBSETS = new int[] {UML2Package.PROFILE__APPLIED_PROFILE, UML2Package.PROFILE__METAMODEL_REFERENCE};

	/**
	 * The array of superset feature identifiers for the '{@link #getOwnedStereotypes() <em>Owned Stereotype</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedStereotypes()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_STEREOTYPE_ESUPERSETS = new int[] {UML2Package.PROFILE__OWNED_MEMBER};

	/**
	 * The array of superset feature identifiers for the '{@link #getMetaclassReferences() <em>Metaclass Reference</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaclassReferences()
	 * @generated
	 * @ordered
	 */
	protected static final int[] METACLASS_REFERENCE_ESUPERSETS = new int[] {UML2Package.PROFILE__ELEMENT_IMPORT};

	/**
	 * The array of superset feature identifiers for the '{@link #getMetamodelReferences() <em>Metamodel Reference</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetamodelReferences()
	 * @generated
	 * @ordered
	 */
	protected static final int[] METAMODEL_REFERENCE_ESUPERSETS = new int[] {UML2Package.PROFILE__PACKAGE_IMPORT};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UML2Package.PROFILE__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.PROFILE__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.PROFILE__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.PROFILE__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.PROFILE__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.PROFILE__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UML2Package.PROFILE__NAME:
				return getName();
			case UML2Package.PROFILE__QUALIFIED_NAME:
				return getQualifiedName();
			case UML2Package.PROFILE__VISIBILITY:
				return getVisibility();
			case UML2Package.PROFILE__CLIENT_DEPENDENCY:
				return getClientDependencies();
			case UML2Package.PROFILE__NAME_EXPRESSION:
				return getNameExpression();
			case UML2Package.PROFILE__MEMBER:
				return getMembers();
			case UML2Package.PROFILE__OWNED_RULE:
				return getOwnedRules();
			case UML2Package.PROFILE__IMPORTED_MEMBER:
				return getImportedMembers();
			case UML2Package.PROFILE__ELEMENT_IMPORT:
				return getElementImports();
			case UML2Package.PROFILE__PACKAGE_IMPORT:
				return getPackageImports();
			case UML2Package.PROFILE__TEMPLATE_PARAMETER:
				if (resolve) return getTemplateParameter();
				return basicGetTemplateParameter();
			case UML2Package.PROFILE__OWNING_PARAMETER:
				return getOwningParameter();
			case UML2Package.PROFILE__PACKAGEABLE_ELEMENT_VISIBILITY:
				return getPackageableElement_visibility();
			case UML2Package.PROFILE__NESTED_PACKAGE:
				return getNestedPackages();
			case UML2Package.PROFILE__NESTING_PACKAGE:
				return getNestingPackage();
			case UML2Package.PROFILE__OWNED_TYPE:
				return getOwnedTypes();
			case UML2Package.PROFILE__OWNED_MEMBER:
				return getOwnedMembers();
			case UML2Package.PROFILE__PACKAGE_MERGE:
				return getPackageMerges();
			case UML2Package.PROFILE__APPLIED_PROFILE:
				return getAppliedProfiles();
			case UML2Package.PROFILE__PACKAGE_EXTENSION:
				return getPackageExtensions();
			case UML2Package.PROFILE__OWNED_STEREOTYPE:
				return getOwnedStereotypes();
			case UML2Package.PROFILE__METACLASS_REFERENCE:
				return getMetaclassReferences();
			case UML2Package.PROFILE__METAMODEL_REFERENCE:
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
			case UML2Package.PROFILE__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.PROFILE__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.PROFILE__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection)newValue);
				return;
			case UML2Package.PROFILE__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case UML2Package.PROFILE__NAME:
				setName((String)newValue);
				return;
			case UML2Package.PROFILE__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case UML2Package.PROFILE__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection)newValue);
				return;
			case UML2Package.PROFILE__NAME_EXPRESSION:
				setNameExpression((StringExpression)newValue);
				return;
			case UML2Package.PROFILE__OWNED_RULE:
				getOwnedRules().clear();
				getOwnedRules().addAll((Collection)newValue);
				return;
			case UML2Package.PROFILE__ELEMENT_IMPORT:
				getElementImports().clear();
				getElementImports().addAll((Collection)newValue);
				return;
			case UML2Package.PROFILE__PACKAGE_IMPORT:
				getPackageImports().clear();
				getPackageImports().addAll((Collection)newValue);
				return;
			case UML2Package.PROFILE__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)newValue);
				return;
			case UML2Package.PROFILE__OWNING_PARAMETER:
				setOwningParameter((TemplateParameter)newValue);
				return;
			case UML2Package.PROFILE__PACKAGEABLE_ELEMENT_VISIBILITY:
				setPackageableElement_visibility((VisibilityKind)newValue);
				return;
			case UML2Package.PROFILE__OWNED_MEMBER:
				getOwnedMembers().clear();
				getOwnedMembers().addAll((Collection)newValue);
				return;
			case UML2Package.PROFILE__PACKAGE_MERGE:
				getPackageMerges().clear();
				getPackageMerges().addAll((Collection)newValue);
				return;
			case UML2Package.PROFILE__APPLIED_PROFILE:
				getAppliedProfiles().clear();
				getAppliedProfiles().addAll((Collection)newValue);
				return;
			case UML2Package.PROFILE__PACKAGE_EXTENSION:
				getPackageExtensions().clear();
				getPackageExtensions().addAll((Collection)newValue);
				return;
			case UML2Package.PROFILE__METACLASS_REFERENCE:
				getMetaclassReferences().clear();
				getMetaclassReferences().addAll((Collection)newValue);
				return;
			case UML2Package.PROFILE__METAMODEL_REFERENCE:
				getMetamodelReferences().clear();
				getMetamodelReferences().addAll((Collection)newValue);
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
			case UML2Package.PROFILE__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.PROFILE__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.PROFILE__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				return;
			case UML2Package.PROFILE__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case UML2Package.PROFILE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UML2Package.PROFILE__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UML2Package.PROFILE__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				return;
			case UML2Package.PROFILE__NAME_EXPRESSION:
				setNameExpression((StringExpression)null);
				return;
			case UML2Package.PROFILE__OWNED_RULE:
				getOwnedRules().clear();
				return;
			case UML2Package.PROFILE__ELEMENT_IMPORT:
				getElementImports().clear();
				return;
			case UML2Package.PROFILE__PACKAGE_IMPORT:
				getPackageImports().clear();
				return;
			case UML2Package.PROFILE__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)null);
				return;
			case UML2Package.PROFILE__OWNING_PARAMETER:
				setOwningParameter((TemplateParameter)null);
				return;
			case UML2Package.PROFILE__PACKAGEABLE_ELEMENT_VISIBILITY:
				setPackageableElement_visibility(PACKAGEABLE_ELEMENT_VISIBILITY_EDEFAULT);
				return;
			case UML2Package.PROFILE__OWNED_MEMBER:
				getOwnedMembers().clear();
				return;
			case UML2Package.PROFILE__PACKAGE_MERGE:
				getPackageMerges().clear();
				return;
			case UML2Package.PROFILE__APPLIED_PROFILE:
				getAppliedProfiles().clear();
				return;
			case UML2Package.PROFILE__PACKAGE_EXTENSION:
				getPackageExtensions().clear();
				return;
			case UML2Package.PROFILE__METACLASS_REFERENCE:
				getMetaclassReferences().clear();
				return;
			case UML2Package.PROFILE__METAMODEL_REFERENCE:
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
			case UML2Package.PROFILE__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.PROFILE__OWNED_ELEMENT:
				return isSetOwnedElements();
			case UML2Package.PROFILE__OWNER:
				return isSetOwner();
			case UML2Package.PROFILE__OWNED_COMMENT:
				return ownedComments != null && !ownedComments.isEmpty();
			case UML2Package.PROFILE__TEMPLATE_BINDING:
				return templateBindings != null && !templateBindings.isEmpty();
			case UML2Package.PROFILE__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case UML2Package.PROFILE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.PROFILE__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UML2Package.PROFILE__VISIBILITY:
				return isSetVisibility();
			case UML2Package.PROFILE__CLIENT_DEPENDENCY:
				return clientDependencies != null && !clientDependencies.isEmpty();
			case UML2Package.PROFILE__NAME_EXPRESSION:
				return nameExpression != null;
			case UML2Package.PROFILE__MEMBER:
				return isSetMembers();
			case UML2Package.PROFILE__OWNED_RULE:
				return ownedRules != null && !ownedRules.isEmpty();
			case UML2Package.PROFILE__IMPORTED_MEMBER:
				return !getImportedMembers().isEmpty();
			case UML2Package.PROFILE__ELEMENT_IMPORT:
				return elementImports != null && !elementImports.isEmpty();
			case UML2Package.PROFILE__PACKAGE_IMPORT:
				return packageImports != null && !packageImports.isEmpty();
			case UML2Package.PROFILE__TEMPLATE_PARAMETER:
				return templateParameter != null;
			case UML2Package.PROFILE__OWNING_PARAMETER:
				return getOwningParameter() != null;
			case UML2Package.PROFILE__PACKAGEABLE_ELEMENT_VISIBILITY:
				return isSetPackageableElement_visibility();
			case UML2Package.PROFILE__NESTED_PACKAGE:
				return !getNestedPackages().isEmpty();
			case UML2Package.PROFILE__NESTING_PACKAGE:
				return getNestingPackage() != null;
			case UML2Package.PROFILE__OWNED_TYPE:
				return !getOwnedTypes().isEmpty();
			case UML2Package.PROFILE__OWNED_MEMBER:
				return isSetOwnedMembers();
			case UML2Package.PROFILE__PACKAGE_MERGE:
				return packageMerges != null && !packageMerges.isEmpty();
			case UML2Package.PROFILE__APPLIED_PROFILE:
				return appliedProfiles != null && !appliedProfiles.isEmpty();
			case UML2Package.PROFILE__PACKAGE_EXTENSION:
				return packageExtensions != null && !packageExtensions.isEmpty();
			case UML2Package.PROFILE__OWNED_STEREOTYPE:
				return !getOwnedStereotypes().isEmpty();
			case UML2Package.PROFILE__METACLASS_REFERENCE:
				return metaclassReferences != null && !metaclassReferences.isEmpty();
			case UML2Package.PROFILE__METAMODEL_REFERENCE:
				return metamodelReferences != null && !metamodelReferences.isEmpty();
		}
		return eDynamicIsSet(featureID);
	}


	// <!-- begin-custom-operations -->

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.Profile#define()
	 */
	public void define() {
		ProfileOperations.define(this);
	}

	private static Method GET_REFERENCED_METACLASSES = null;

	static {
		try {
			GET_REFERENCED_METACLASSES = ProfileImpl.class.getMethod(
				"getReferencedMetaclasses", null); //$NON-NLS-1$
		} catch (Exception e) {
			// ignore
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.Profile#getReferencedMetaclasses()
	 */
	public Set getReferencedMetaclasses() {
		CacheAdapter cache = getCacheAdapter();

		if (cache != null) {
			Set result = (Set) cache.get(eResource(), this,
				GET_REFERENCED_METACLASSES);

			if (result == null) {
				getCacheAdapter().put(
					eResource(),
					this,
					GET_REFERENCED_METACLASSES,
					result = Collections.unmodifiableSet(ProfileOperations
						.getReferencedMetaclasses(this)));
			}

			return result;
		}

		return Collections.unmodifiableSet(ProfileOperations
			.getReferencedMetaclasses(this));
	}

	private static Method GET_REFERENCED_METAMODELS = null;

	static {
		try {
			GET_REFERENCED_METAMODELS = ProfileImpl.class.getMethod(
				"getReferencedMetamodels", null); //$NON-NLS-1$
		} catch (Exception e) {
			// ignore
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.Profile#getReferencedMetamodels()
	 */
	public Set getReferencedMetamodels() {
		CacheAdapter cache = getCacheAdapter();

		if (cache != null) {
			Set result = (Set) cache.get(eResource(), this,
				GET_REFERENCED_METAMODELS);

			if (result == null) {
				getCacheAdapter().put(
					eResource(),
					this,
					GET_REFERENCED_METAMODELS,
					result = Collections.unmodifiableSet(ProfileOperations
						.getReferencedMetamodels(this)));
			}

			return result;
		}

		return Collections.unmodifiableSet(ProfileOperations
			.getReferencedMetamodels(this));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.Profile#getVersion()
	 */
	public String getVersion() {
		return ProfileOperations.getVersion(this);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.Profile#isDefined()
	 */
	public boolean isDefined() {
		return ProfileOperations.isDefined(this);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.Profile#referenceMetaclass(org.eclipse.uml2.Class)
	 */
	public void referenceMetaclass(org.eclipse.uml2.Class class_) {
		ProfileOperations.referenceMetaclass(this, class_);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.Profile#referenceMetamodel(org.eclipse.uml2.Model)
	 */
	public void referenceMetamodel(Model model) {
		ProfileOperations.referenceMetamodel(this, model);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.Profile#create(org.eclipse.uml2.Classifier)
	 */
	public EObject create(Classifier classifier) {
		return ProfileOperations.create(this, classifier);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.Profile#createOwnedStereotype(java.lang.String,
	 *      boolean)
	 */
	public Stereotype createOwnedStereotype(String name, boolean isAbstract) {
		return ProfileOperations.createOwnedStereotype(this, name, isAbstract);
	}
	
	// <!-- end-custom-operations -->

} //ProfileImpl
