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
 * $Id: PackageImpl.java,v 1.28 2005/06/03 20:12:50 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.lang.reflect.Method;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.Element;
import org.eclipse.uml2.Enumeration;
import org.eclipse.uml2.NamedElement;
import org.eclipse.uml2.Namespace;
import org.eclipse.uml2.PackageImport;
import org.eclipse.uml2.PackageMerge;
import org.eclipse.uml2.PackageableElement;
import org.eclipse.uml2.ParameterableElement;
import org.eclipse.uml2.PrimitiveType;
import org.eclipse.uml2.Profile;
import org.eclipse.uml2.ProfileApplication;
import org.eclipse.uml2.StringExpression;
import org.eclipse.uml2.TemplateParameter;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.Type;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.VisibilityKind;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.SubsetEObjectEList;
import org.eclipse.uml2.common.util.SupersetEObjectContainmentWithInverseEList;

import org.eclipse.uml2.internal.operation.PackageOperations;
import org.eclipse.uml2.internal.operation.ProfileOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.PackageImpl#getTemplateParameter <em>Template Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.PackageImpl#getOwningParameter <em>Owning Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.PackageImpl#getPackageableElement_visibility <em>Packageable Element visibility</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.PackageImpl#getOwnedMembers <em>Owned Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.PackageImpl#getPackageImports <em>Package Import</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.PackageImpl#getNestedPackages <em>Nested Package</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.PackageImpl#getNestingPackage <em>Nesting Package</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.PackageImpl#getOwnedTypes <em>Owned Type</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.PackageImpl#getPackageMerges <em>Package Merge</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.PackageImpl#getAppliedProfiles <em>Applied Profile</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.PackageImpl#getPackageExtensions <em>Package Extension</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PackageImpl extends NamespaceImpl implements org.eclipse.uml2.Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getTemplateParameter() <em>Template Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateParameter()
	 * @generated
	 * @ordered
	 */
	protected TemplateParameter templateParameter = null;

	/**
	 * The default value of the '{@link #getPackageableElement_visibility() <em>Packageable Element visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageableElement_visibility()
	 * @generated
	 * @ordered
	 */
	protected static final VisibilityKind PACKAGEABLE_ELEMENT_VISIBILITY_EDEFAULT = VisibilityKind.PUBLIC_LITERAL;

	/**
	 * The cached value of the '{@link #getOwnedMembers() <em>Owned Member</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedMembers()
	 * @generated
	 * @ordered
	 */
	protected EList ownedMember = null;

	/**
	 * The cached value of the '{@link #getPackageMerges() <em>Package Merge</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageMerges()
	 * @generated
	 * @ordered
	 */
	protected EList packageMerge = null;

	/**
	 * The cached value of the '{@link #getAppliedProfiles() <em>Applied Profile</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppliedProfiles()
	 * @generated
	 * @ordered
	 */
	protected EList appliedProfile = null;

	/**
	 * The cached value of the '{@link #getPackageExtensions() <em>Package Extension</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageExtensions()
	 * @generated
	 * @ordered
	 */
	protected EList packageExtension = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UML2Package.eINSTANCE.getPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateParameter getTemplateParameter() {
		if (templateParameter != null && templateParameter.eIsProxy()) {
			TemplateParameter oldTemplateParameter = templateParameter;
			templateParameter = (TemplateParameter)eResolveProxy((InternalEObject)templateParameter);
			if (templateParameter != oldTemplateParameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2Package.PACKAGE__TEMPLATE_PARAMETER, oldTemplateParameter, templateParameter));
			}
		}
		return templateParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateParameter basicGetTemplateParameter() {
		return templateParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemplateParameter(TemplateParameter newTemplateParameter, NotificationChain msgs) {
		TemplateParameter oldTemplateParameter = templateParameter;
		templateParameter = newTemplateParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UML2Package.PACKAGE__TEMPLATE_PARAMETER, oldTemplateParameter, newTemplateParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}

		if (getOwningParameter() != null && getOwningParameter() != newTemplateParameter) {
			setOwningParameter(null);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemplateParameter(TemplateParameter newTemplateParameter) {
		if (newTemplateParameter != templateParameter) {
			NotificationChain msgs = null;
			if (templateParameter != null)
				msgs = ((InternalEObject)templateParameter).eInverseRemove(this, UML2Package.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
			if (newTemplateParameter != null)
				msgs = ((InternalEObject)newTemplateParameter).eInverseAdd(this, UML2Package.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
			msgs = basicSetTemplateParameter(newTemplateParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.PACKAGE__TEMPLATE_PARAMETER, newTemplateParameter, newTemplateParameter));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateParameter getOwningParameter() {
		if (eContainerFeatureID != UML2Package.PACKAGE__OWNING_PARAMETER) return null;
		return (TemplateParameter)eContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningParameter(TemplateParameter newOwningParameter) {
		EObject oldOwningParameter = eContainer;
		if (newOwningParameter != eContainer || (eContainerFeatureID != UML2Package.PACKAGE__OWNING_PARAMETER && newOwningParameter != null)) {
			if (EcoreUtil.isAncestor(this, newOwningParameter))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eContainer != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningParameter != null)
				msgs = ((InternalEObject)newOwningParameter).eInverseAdd(this, UML2Package.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
			msgs = eBasicSetContainer((InternalEObject)newOwningParameter, UML2Package.PACKAGE__OWNING_PARAMETER, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.PACKAGE__OWNING_PARAMETER, newOwningParameter, newOwningParameter));

		if (newOwningParameter != null || oldOwningParameter == templateParameter) {
			setTemplateParameter(newOwningParameter);
		}
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public VisibilityKind getPackageableElement_visibility() {
		return visibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setPackageableElement_visibility(VisibilityKind newPackageableElement_visibility) {
		VisibilityKind oldVisibility = visibility;
		visibility = newPackageableElement_visibility == null ? VISIBILITY_EDEFAULT : newPackageableElement_visibility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.PACKAGEABLE_ELEMENT__PACKAGEABLE_ELEMENT_VISIBILITY, oldVisibility, visibility));
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList getNestedPackages() {
		CacheAdapter cache = getCacheAdapter();

		if (cache != null) {
			EList result = (EList) cache.get(eResource(), this,
				UML2Package.eINSTANCE.getPackage_NestedPackage());

			if (result == null) {
				EList nestedPackages = PackageOperations
					.getNestedPackages(this);
				cache.put(eResource(), this, UML2Package.eINSTANCE
					.getPackage_NestedPackage(),
					result = new EcoreEList.UnmodifiableEList(this,
						UML2Package.eINSTANCE.getPackage_NestedPackage(),
						nestedPackages.size(), nestedPackages.toArray()));
			}

			return result;
		}

		EList nestedPackages = PackageOperations.getNestedPackages(this);
		return new EcoreEList.UnmodifiableEList(this, UML2Package.eINSTANCE
			.getPackage_NestedPackage(), nestedPackages.size(), nestedPackages
			.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public org.eclipse.uml2.Package getNestedPackage(String name) {
		for (Iterator i = getNestedPackages().iterator(); i.hasNext(); ) {
			org.eclipse.uml2.Package nestedPackage = (org.eclipse.uml2.Package) i.next();
			if (name.equals(nestedPackage.getName())) {
				return nestedPackage;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.Package getNestingPackage() {
		org.eclipse.uml2.Package nestingPackage = basicGetNestingPackage();
		return nestingPackage == null ? null : (org.eclipse.uml2.Package)eResolveProxy((InternalEObject)nestingPackage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public org.eclipse.uml2.Package basicGetNestingPackage() {
		return eContainer instanceof org.eclipse.uml2.Package ? (org.eclipse.uml2.Package) eContainer : null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList getOwnedTypes() {
		CacheAdapter cache = getCacheAdapter();

		if (cache != null) {
			EList result = (EList) cache.get(eResource(), this,
				UML2Package.eINSTANCE.getPackage_OwnedType());

			if (result == null) {
				EList ownedTypes = PackageOperations.getOwnedTypes(this);
				cache.put(eResource(), this, UML2Package.eINSTANCE
					.getPackage_OwnedType(),
					result = new EcoreEList.UnmodifiableEList(this,
						UML2Package.eINSTANCE.getPackage_OwnedType(),
						ownedTypes.size(), ownedTypes.toArray()));
			}

			return result;
		}

		EList ownedTypes = PackageOperations.getOwnedTypes(this);
		return new EcoreEList.UnmodifiableEList(this, UML2Package.eINSTANCE
			.getPackage_OwnedType(), ownedTypes.size(), ownedTypes.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public Type getOwnedType(String name) {
		for (Iterator i = getOwnedTypes().iterator(); i.hasNext(); ) {
			Type ownedType = (Type) i.next();
			if (name.equals(ownedType.getName())) {
				return ownedType;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedMembers() {
		if (ownedMember == null) {
			ownedMember = new EObjectContainmentEList(PackageableElement.class, this, UML2Package.PACKAGE__OWNED_MEMBER);
		}
		return ownedMember;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public NamedElement getOwnedMember(String name) {
		for (Iterator i = getOwnedMembers().iterator(); i.hasNext(); ) {
			PackageableElement ownedMember = (PackageableElement) i.next();
			if (name.equals(ownedMember.getName())) {
				return ownedMember;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public PackageableElement createOwnedMember(EClass eClass) {
		PackageableElement newOwnedMember = (PackageableElement) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.PACKAGE__OWNED_MEMBER, null, newOwnedMember));
		}
		getOwnedMembers().add(newOwnedMember);
		return newOwnedMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getPackageMerges() {
		if (packageMerge == null) {
			packageMerge = new EObjectContainmentWithInverseEList(PackageMerge.class, this, UML2Package.PACKAGE__PACKAGE_MERGE, UML2Package.PACKAGE_MERGE__MERGING_PACKAGE);
		}
		return packageMerge;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @deprecated Use #createPackageMerge() instead.
	 */
	public PackageMerge createPackageMerge(EClass eClass) {
		PackageMerge newPackageMerge = (PackageMerge) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.PACKAGE__PACKAGE_MERGE, null, newPackageMerge));
		}
		getPackageMerges().add(newPackageMerge);
		return newPackageMerge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageMerge createPackageMerge() {
		PackageMerge newPackageMerge = UML2Factory.eINSTANCE.createPackageMerge();
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.PACKAGE__PACKAGE_MERGE, null, newPackageMerge));
		}
		getPackageMerges().add(newPackageMerge);
		return newPackageMerge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAppliedProfiles() {
		if (appliedProfile == null) {
			appliedProfile = new SubsetEObjectEList(ProfileApplication.class, this, UML2Package.PACKAGE__APPLIED_PROFILE, new int[] {UML2Package.PACKAGE__PACKAGE_IMPORT});
		}
		return appliedProfile;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getPackageExtensions() {
		if (packageExtension == null) {
			packageExtension = new EObjectContainmentEList(PackageMerge.class, this, UML2Package.PACKAGE__PACKAGE_EXTENSION);
		}
		return packageExtension;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @deprecated Use #createPackageExtension() instead.
	 */
	public PackageMerge createPackageExtension(EClass eClass) {
		PackageMerge newPackageExtension = (PackageMerge) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.PACKAGE__PACKAGE_EXTENSION, null, newPackageExtension));
		}
		getPackageExtensions().add(newPackageExtension);
		return newPackageExtension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageMerge createPackageExtension() {
		PackageMerge newPackageExtension = UML2Factory.eINSTANCE.createPackageMerge();
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.PACKAGE__PACKAGE_EXTENSION, null, newPackageExtension));
		}
		getPackageExtensions().add(newPackageExtension);
		return newPackageExtension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElementsPublicOrPrivate(DiagnosticChain diagnostics, Map context) {
		return PackageOperations.validateElementsPublicOrPrivate(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetOwner() {
		TemplateParameter owningParameter = getOwningParameter();			
		if (owningParameter != null) {
			return owningParameter;
		}
		return super.basicGetOwner();
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisibilityKind getVisibility() {
		return getPackageableElement_visibility();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibility(VisibilityKind newVisibility) {
		setPackageableElement_visibility(newVisibility);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean mustBeOwned() {
		return PackageOperations.mustBeOwned(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Set visibleMembers() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Set result = (Set) cache.get(this, UML2Package.eINSTANCE.getPackage().getEOperations().get(1));
			if (result == null) {
				cache.put(this, UML2Package.eINSTANCE.getPackage().getEOperations().get(1), result = PackageOperations.visibleMembers(this));
			}
			return result;
		}
		return PackageOperations.visibleMembers(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean makesVisible(NamedElement el) {
		return PackageOperations.makesVisible(this, el);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace basicGetNamespace() {
		org.eclipse.uml2.Package nestingPackage = basicGetNestingPackage();			
		if (nestingPackage != null) {
			return nestingPackage;
		}
		return super.basicGetNamespace();
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected EList getOwnedElementsHelper(EList ownedElement) {
		super.getOwnedElementsHelper(ownedElement);
		if (packageMerge != null) {
			ownedElement.addAll(packageMerge);
		}
		if (packageExtension != null) {
			ownedElement.addAll(packageExtension);
		}
		for (Iterator i = ((InternalEList) super.getOwnedMembers()).basicIterator(); i.hasNext(); ) {
			ownedElement.add(i.next());
		}
		return ownedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getPackageImports() {
		if (packageImport == null) {
			packageImport = new SupersetEObjectContainmentWithInverseEList(PackageImport.class, this, UML2Package.PACKAGE__PACKAGE_IMPORT, new int[] {UML2Package.PACKAGE__APPLIED_PROFILE}, UML2Package.PACKAGE_IMPORT__IMPORTING_NAMESPACE);
		}
		return packageImport;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UML2Package.PACKAGE__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicAdd(otherEnd, msgs);
				case UML2Package.PACKAGE__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicAdd(otherEnd, msgs);
				case UML2Package.PACKAGE__OWNED_TEMPLATE_SIGNATURE:
					if (ownedTemplateSignature != null)
						msgs = ((InternalEObject)ownedTemplateSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.PACKAGE__OWNED_TEMPLATE_SIGNATURE, null, msgs);
					return basicSetOwnedTemplateSignature((TemplateSignature)otherEnd, msgs);
				case UML2Package.PACKAGE__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicAdd(otherEnd, msgs);
				case UML2Package.PACKAGE__OWNED_RULE:
					return ((InternalEList)getOwnedRules()).basicAdd(otherEnd, msgs);
				case UML2Package.PACKAGE__ELEMENT_IMPORT:
					return ((InternalEList)getElementImports()).basicAdd(otherEnd, msgs);
				case UML2Package.PACKAGE__PACKAGE_IMPORT:
					return ((InternalEList)getPackageImports()).basicAdd(otherEnd, msgs);
				case UML2Package.PACKAGE__TEMPLATE_PARAMETER:
					if (templateParameter != null)
						msgs = ((InternalEObject)templateParameter).eInverseRemove(this, UML2Package.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
					return basicSetTemplateParameter((TemplateParameter)otherEnd, msgs);
				case UML2Package.PACKAGE__OWNING_PARAMETER:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, UML2Package.PACKAGE__OWNING_PARAMETER, msgs);
				case UML2Package.PACKAGE__PACKAGE_MERGE:
					return ((InternalEList)getPackageMerges()).basicAdd(otherEnd, msgs);
				default:
					return eDynamicInverseAdd(otherEnd, featureID, baseClass, msgs);
			}
		}
		if (eContainer != null)
			msgs = eBasicRemoveFromContainer(msgs);
		return eBasicSetContainer(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UML2Package.PACKAGE__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
				case UML2Package.PACKAGE__OWNED_COMMENT:
					return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
				case UML2Package.PACKAGE__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicRemove(otherEnd, msgs);
				case UML2Package.PACKAGE__OWNED_TEMPLATE_SIGNATURE:
					return basicSetOwnedTemplateSignature(null, msgs);
				case UML2Package.PACKAGE__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicRemove(otherEnd, msgs);
				case UML2Package.PACKAGE__NAME_EXPRESSION:
					return basicSetNameExpression(null, msgs);
				case UML2Package.PACKAGE__OWNED_RULE:
					return ((InternalEList)getOwnedRules()).basicRemove(otherEnd, msgs);
				case UML2Package.PACKAGE__ELEMENT_IMPORT:
					return ((InternalEList)getElementImports()).basicRemove(otherEnd, msgs);
				case UML2Package.PACKAGE__PACKAGE_IMPORT:
					return ((InternalEList)getPackageImports()).basicRemove(otherEnd, msgs);
				case UML2Package.PACKAGE__TEMPLATE_PARAMETER:
					return basicSetTemplateParameter(null, msgs);
				case UML2Package.PACKAGE__OWNING_PARAMETER:
					return eBasicSetContainer(null, UML2Package.PACKAGE__OWNING_PARAMETER, msgs);
				case UML2Package.PACKAGE__OWNED_MEMBER:
					return ((InternalEList)getOwnedMembers()).basicRemove(otherEnd, msgs);
				case UML2Package.PACKAGE__PACKAGE_MERGE:
					return ((InternalEList)getPackageMerges()).basicRemove(otherEnd, msgs);
				case UML2Package.PACKAGE__PACKAGE_EXTENSION:
					return ((InternalEList)getPackageExtensions()).basicRemove(otherEnd, msgs);
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
	public NotificationChain eBasicRemoveFromContainer(NotificationChain msgs) {
		if (eContainerFeatureID >= 0) {
			switch (eContainerFeatureID) {
				case UML2Package.PACKAGE__OWNING_PARAMETER:
					return eContainer.eInverseRemove(this, UML2Package.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
				default:
					return eDynamicBasicRemoveFromContainer(msgs);
			}
		}
		return eContainer.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - eContainerFeatureID, null, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UML2Package.PACKAGE__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.PACKAGE__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.PACKAGE__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.PACKAGE__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.PACKAGE__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.PACKAGE__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UML2Package.PACKAGE__NAME:
				return getName();
			case UML2Package.PACKAGE__QUALIFIED_NAME:
				return getQualifiedName();
			case UML2Package.PACKAGE__VISIBILITY:
				return getVisibility();
			case UML2Package.PACKAGE__CLIENT_DEPENDENCY:
				return getClientDependencies();
			case UML2Package.PACKAGE__NAME_EXPRESSION:
				return getNameExpression();
			case UML2Package.PACKAGE__MEMBER:
				return getMembers();
			case UML2Package.PACKAGE__OWNED_RULE:
				return getOwnedRules();
			case UML2Package.PACKAGE__IMPORTED_MEMBER:
				return getImportedMembers();
			case UML2Package.PACKAGE__ELEMENT_IMPORT:
				return getElementImports();
			case UML2Package.PACKAGE__PACKAGE_IMPORT:
				return getPackageImports();
			case UML2Package.PACKAGE__TEMPLATE_PARAMETER:
				if (resolve) return getTemplateParameter();
				return basicGetTemplateParameter();
			case UML2Package.PACKAGE__OWNING_PARAMETER:
				return getOwningParameter();
			case UML2Package.PACKAGE__PACKAGEABLE_ELEMENT_VISIBILITY:
				return getPackageableElement_visibility();
			case UML2Package.PACKAGE__NESTED_PACKAGE:
				return getNestedPackages();
			case UML2Package.PACKAGE__NESTING_PACKAGE:
				if (resolve) return getNestingPackage();
				return basicGetNestingPackage();
			case UML2Package.PACKAGE__OWNED_TYPE:
				return getOwnedTypes();
			case UML2Package.PACKAGE__OWNED_MEMBER:
				return getOwnedMembers();
			case UML2Package.PACKAGE__PACKAGE_MERGE:
				return getPackageMerges();
			case UML2Package.PACKAGE__APPLIED_PROFILE:
				return getAppliedProfiles();
			case UML2Package.PACKAGE__PACKAGE_EXTENSION:
				return getPackageExtensions();
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
			case UML2Package.PACKAGE__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.PACKAGE__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.PACKAGE__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection)newValue);
				return;
			case UML2Package.PACKAGE__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case UML2Package.PACKAGE__NAME:
				setName((String)newValue);
				return;
			case UML2Package.PACKAGE__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case UML2Package.PACKAGE__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection)newValue);
				return;
			case UML2Package.PACKAGE__NAME_EXPRESSION:
				setNameExpression((StringExpression)newValue);
				return;
			case UML2Package.PACKAGE__OWNED_RULE:
				getOwnedRules().clear();
				getOwnedRules().addAll((Collection)newValue);
				return;
			case UML2Package.PACKAGE__ELEMENT_IMPORT:
				getElementImports().clear();
				getElementImports().addAll((Collection)newValue);
				return;
			case UML2Package.PACKAGE__PACKAGE_IMPORT:
				getPackageImports().clear();
				getPackageImports().addAll((Collection)newValue);
				return;
			case UML2Package.PACKAGE__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)newValue);
				return;
			case UML2Package.PACKAGE__OWNING_PARAMETER:
				setOwningParameter((TemplateParameter)newValue);
				return;
			case UML2Package.PACKAGE__PACKAGEABLE_ELEMENT_VISIBILITY:
				setPackageableElement_visibility((VisibilityKind)newValue);
				return;
			case UML2Package.PACKAGE__OWNED_MEMBER:
				getOwnedMembers().clear();
				getOwnedMembers().addAll((Collection)newValue);
				return;
			case UML2Package.PACKAGE__PACKAGE_MERGE:
				getPackageMerges().clear();
				getPackageMerges().addAll((Collection)newValue);
				return;
			case UML2Package.PACKAGE__APPLIED_PROFILE:
				getAppliedProfiles().clear();
				getAppliedProfiles().addAll((Collection)newValue);
				return;
			case UML2Package.PACKAGE__PACKAGE_EXTENSION:
				getPackageExtensions().clear();
				getPackageExtensions().addAll((Collection)newValue);
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
			case UML2Package.PACKAGE__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.PACKAGE__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.PACKAGE__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				return;
			case UML2Package.PACKAGE__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case UML2Package.PACKAGE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UML2Package.PACKAGE__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UML2Package.PACKAGE__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				return;
			case UML2Package.PACKAGE__NAME_EXPRESSION:
				setNameExpression((StringExpression)null);
				return;
			case UML2Package.PACKAGE__OWNED_RULE:
				getOwnedRules().clear();
				return;
			case UML2Package.PACKAGE__ELEMENT_IMPORT:
				getElementImports().clear();
				return;
			case UML2Package.PACKAGE__PACKAGE_IMPORT:
				getPackageImports().clear();
				return;
			case UML2Package.PACKAGE__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)null);
				return;
			case UML2Package.PACKAGE__OWNING_PARAMETER:
				setOwningParameter((TemplateParameter)null);
				return;
			case UML2Package.PACKAGE__PACKAGEABLE_ELEMENT_VISIBILITY:
				setPackageableElement_visibility(PACKAGEABLE_ELEMENT_VISIBILITY_EDEFAULT);
				return;
			case UML2Package.PACKAGE__OWNED_MEMBER:
				getOwnedMembers().clear();
				return;
			case UML2Package.PACKAGE__PACKAGE_MERGE:
				getPackageMerges().clear();
				return;
			case UML2Package.PACKAGE__APPLIED_PROFILE:
				getAppliedProfiles().clear();
				return;
			case UML2Package.PACKAGE__PACKAGE_EXTENSION:
				getPackageExtensions().clear();
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
			case UML2Package.PACKAGE__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.PACKAGE__OWNED_ELEMENT:
				return !getOwnedElements().isEmpty();
			case UML2Package.PACKAGE__OWNER:
				return basicGetOwner() != null;
			case UML2Package.PACKAGE__OWNED_COMMENT:
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.PACKAGE__TEMPLATE_BINDING:
				return templateBinding != null && !templateBinding.isEmpty();
			case UML2Package.PACKAGE__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case UML2Package.PACKAGE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.PACKAGE__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UML2Package.PACKAGE__VISIBILITY:
				return getVisibility() != VISIBILITY_EDEFAULT;
			case UML2Package.PACKAGE__CLIENT_DEPENDENCY:
				return clientDependency != null && !clientDependency.isEmpty();
			case UML2Package.PACKAGE__NAME_EXPRESSION:
				return nameExpression != null;
			case UML2Package.PACKAGE__MEMBER:
				return !getMembers().isEmpty();
			case UML2Package.PACKAGE__OWNED_RULE:
				return ownedRule != null && !ownedRule.isEmpty();
			case UML2Package.PACKAGE__IMPORTED_MEMBER:
				return !getImportedMembers().isEmpty();
			case UML2Package.PACKAGE__ELEMENT_IMPORT:
				return elementImport != null && !elementImport.isEmpty();
			case UML2Package.PACKAGE__PACKAGE_IMPORT:
				return packageImport != null && !packageImport.isEmpty();
			case UML2Package.PACKAGE__TEMPLATE_PARAMETER:
				return templateParameter != null;
			case UML2Package.PACKAGE__OWNING_PARAMETER:
				return getOwningParameter() != null;
			case UML2Package.PACKAGE__PACKAGEABLE_ELEMENT_VISIBILITY:
				return getPackageableElement_visibility() != PACKAGEABLE_ELEMENT_VISIBILITY_EDEFAULT;
			case UML2Package.PACKAGE__NESTED_PACKAGE:
				return !getNestedPackages().isEmpty();
			case UML2Package.PACKAGE__NESTING_PACKAGE:
				return basicGetNestingPackage() != null;
			case UML2Package.PACKAGE__OWNED_TYPE:
				return !getOwnedTypes().isEmpty();
			case UML2Package.PACKAGE__OWNED_MEMBER:
				return ownedMember != null && !ownedMember.isEmpty();
			case UML2Package.PACKAGE__PACKAGE_MERGE:
				return packageMerge != null && !packageMerge.isEmpty();
			case UML2Package.PACKAGE__APPLIED_PROFILE:
				return appliedProfile != null && !appliedProfile.isEmpty();
			case UML2Package.PACKAGE__PACKAGE_EXTENSION:
				return packageExtension != null && !packageExtension.isEmpty();
		}
		return eDynamicIsSet(eFeature);
	}

	public boolean eIsSet(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UML2Package.PACKAGE__VISIBILITY:
				return false;
			case UML2Package.PACKAGE__PACKAGEABLE_ELEMENT_VISIBILITY:
				return visibility != PACKAGEABLE_ELEMENT_VISIBILITY_EDEFAULT;
		}
		return eIsSetGen(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == ParameterableElement.class) {
			switch (derivedFeatureID) {
				case UML2Package.PACKAGE__TEMPLATE_PARAMETER: return UML2Package.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER;
				case UML2Package.PACKAGE__OWNING_PARAMETER: return UML2Package.PARAMETERABLE_ELEMENT__OWNING_PARAMETER;
				default: return -1;
			}
		}
		if (baseClass == PackageableElement.class) {
			switch (derivedFeatureID) {
				case UML2Package.PACKAGE__PACKAGEABLE_ELEMENT_VISIBILITY: return UML2Package.PACKAGEABLE_ELEMENT__PACKAGEABLE_ELEMENT_VISIBILITY;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class baseClass) {
		if (baseClass == ParameterableElement.class) {
			switch (baseFeatureID) {
				case UML2Package.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER: return UML2Package.PACKAGE__TEMPLATE_PARAMETER;
				case UML2Package.PARAMETERABLE_ELEMENT__OWNING_PARAMETER: return UML2Package.PACKAGE__OWNING_PARAMETER;
				default: return -1;
			}
		}
		if (baseClass == PackageableElement.class) {
			switch (baseFeatureID) {
				case UML2Package.PACKAGEABLE_ELEMENT__PACKAGEABLE_ELEMENT_VISIBILITY: return UML2Package.PACKAGE__PACKAGEABLE_ELEMENT_VISIBILITY;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}


	// <!-- begin-custom-operations -->

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.impl.NamespaceImpl#getMembersHelper(org.eclipse.emf.common.util.EList)
	 */
	protected EList getMembersHelper(EList member) {
		super.getMembersHelper(member);
		for (Iterator i = ((InternalEList) super.getOwnedMembers()).basicIterator(); i.hasNext();) {
			member.add(i.next());
		}
		return member;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.Namespace#getNamesOfMember(org.eclipse.uml2.NamedElement)
	 */
	public Set getNamesOfMember(NamedElement element) {
		return PackageOperations.getNamesOfMember(this, element);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.Namespace#importMembers(java.util.Set)
	 */
	public Set importMembers(Set imps) {
		return PackageOperations.importMembers(this, imps);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.Package#apply(org.eclipse.uml2.Profile)
	 */
	public void apply(Profile profile) {
		ProfileOperations.apply(profile, this);
	}

	private static Method GET_ALL_APPLIED_PROFILES = null;

	static {
		try {
			GET_ALL_APPLIED_PROFILES = PackageImpl.class.getMethod(
				"getAllAppliedProfiles", null); //$NON-NLS-1$
		} catch (Exception e) {
			// ignore
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.Package#getAllAppliedProfiles()
	 */
	public Set getAllAppliedProfiles() {
		CacheAdapter cache = getCacheAdapter();

		if (cache != null) {
			Set result = (Set) cache.get(eResource(), this,
				GET_ALL_APPLIED_PROFILES);

			if (result == null) {
				cache.put(eResource(), this, GET_ALL_APPLIED_PROFILES,
					result = Collections.unmodifiableSet(ProfileOperations
						.getAllAppliedProfiles(this)));
			}

			return result;
		}

		return Collections.unmodifiableSet(ProfileOperations
			.getAllAppliedProfiles(this));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.Package#isApplied(org.eclipse.uml2.Profile)
	 */
	public boolean isApplied(Profile profile) {
		return ProfileOperations.isApplied(profile, this);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.Package#unapply(org.eclipse.uml2.Profile)
	 */
	public void unapply(Profile profile) {
		ProfileOperations.unapply(profile, this);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.Package#getAppliedVersion(org.eclipse.uml2.Profile)
	 */
	public String getAppliedVersion(Profile profile) {
		return ProfileOperations.getAppliedVersion(profile, this);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.Package#createNestedPackage(java.lang.String)
	 */
	public org.eclipse.uml2.Package createNestedPackage(String name) {
		return PackageOperations.createNestedPackage(this, name);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.Package#createOwnedClass(java.lang.String, boolean)
	 */
	public org.eclipse.uml2.Class createOwnedClass(String name,
			boolean isAbstract) {
		return PackageOperations.createOwnedClass(this, name, isAbstract);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.Package#createOwnedEnumeraton(java.lang.String)
	 */
	public Enumeration createOwnedEnumeraton(String name) {
		return PackageOperations.createOwnedEnumeration(this, name);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.Package#createOwnedPrimitiveType(java.lang.String)
	 */
	public PrimitiveType createOwnedPrimitiveType(String name) {
		return PackageOperations.createOwnedPrimitiveType(this, name);
	}

	// <!-- end-custom-operations -->

} //PackageImpl
