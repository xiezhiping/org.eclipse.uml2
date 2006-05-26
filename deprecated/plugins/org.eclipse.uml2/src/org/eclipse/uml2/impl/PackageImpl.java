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
 * $Id: PackageImpl.java,v 1.48 2006/05/26 18:16:42 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.lang.reflect.Method;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.common.util.UniqueEList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
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
import org.eclipse.uml2.common.util.SubsetSupersetEObjectContainmentWithInverseEList;
import org.eclipse.uml2.common.util.SubsetSupersetEObjectEList;

import org.eclipse.uml2.common.util.UnionEObjectEList;

import org.eclipse.uml2.common.util.DerivedEObjectEList;
import org.eclipse.uml2.internal.operation.PackageOperations;
import org.eclipse.uml2.internal.operation.ProfileOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.PackageImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.PackageImpl#getTemplateParameter <em>Template Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.PackageImpl#getOwningParameter <em>Owning Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.PackageImpl#getPackageableElement_visibility <em>Packageable Element visibility</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.PackageImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.PackageImpl#getOwnedElements <em>Owned Element</em>}</li>
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
	protected EList ownedMembers = null;

	/**
	 * The cached value of the '{@link #getPackageMerges() <em>Package Merge</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageMerges()
	 * @generated
	 * @ordered
	 */
	protected EList packageMerges = null;

	/**
	 * The cached value of the '{@link #getAppliedProfiles() <em>Applied Profile</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppliedProfiles()
	 * @generated
	 * @ordered
	 */
	protected EList appliedProfiles = null;

	/**
	 * The cached value of the '{@link #getPackageExtensions() <em>Package Extension</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageExtensions()
	 * @generated
	 * @ordered
	 */
	protected EList packageExtensions = null;

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
		return UML2Package.Literals.PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getOwner() {
		Element owner = basicGetOwner();
		return owner != null && owner.eIsProxy() ? (Element)eResolveProxy((InternalEObject)owner) : owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateParameter getTemplateParameter() {
		if (templateParameter != null && templateParameter.eIsProxy()) {
			InternalEObject oldTemplateParameter = (InternalEObject)templateParameter;
			templateParameter = (TemplateParameter)eResolveProxy(oldTemplateParameter);
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

		Resource.Internal eInternalResource = eInternalResource();
		if (eInternalResource == null || !eInternalResource.isLoading()) {
			TemplateParameter owningParameter = getOwningParameter();
			if (owningParameter != null && owningParameter != newTemplateParameter) {
				setOwningParameter(null);
			}
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
		return (TemplateParameter)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningParameter(TemplateParameter newOwningParameter, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningParameter, UML2Package.PACKAGE__OWNING_PARAMETER, msgs);

		Resource.Internal eInternalResource = eInternalResource();
		if (eInternalResource == null || !eInternalResource.isLoading()) {
			if (newOwningParameter != null) {
				if (newOwningParameter != templateParameter) {
					setTemplateParameter(newOwningParameter);
				}
			}
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningParameter(TemplateParameter newOwningParameter) {
		if (newOwningParameter != eInternalContainer() || (eContainerFeatureID != UML2Package.PACKAGE__OWNING_PARAMETER && newOwningParameter != null)) {
			if (EcoreUtil.isAncestor(this, newOwningParameter))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningParameter != null)
				msgs = ((InternalEObject)newOwningParameter).eInverseAdd(this, UML2Package.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
			msgs = basicSetOwningParameter(newOwningParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.PACKAGE__OWNING_PARAMETER, newOwningParameter, newOwningParameter));

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
		Object oldPackageableElement_visibility = visibility;
		visibility = newPackageableElement_visibility == null ? PACKAGEABLE_ELEMENT_VISIBILITY_EDEFAULT : newPackageableElement_visibility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.PACKAGE__PACKAGEABLE_ELEMENT_VISIBILITY, oldPackageableElement_visibility, visibility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isSetPackageableElement_visibility() {
		return visibility != PACKAGEABLE_ELEMENT_VISIBILITY_EDEFAULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace getNamespace() {
		Namespace namespace = basicGetNamespace();
		return namespace != null && namespace.eIsProxy() ? (Namespace)eResolveProxy((InternalEObject)namespace) : namespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList getNestedPackages() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			EList nestedPackages = (EList) cache.get(eResource, this,
				UML2Package.Literals.PACKAGE__NESTED_PACKAGE);
			if (nestedPackages == null) {
				cache.put(eResource, this,
					UML2Package.Literals.PACKAGE__NESTED_PACKAGE,
					nestedPackages = new DerivedEObjectEList(
						org.eclipse.uml2.Package.class, this,
						UML2Package.PACKAGE__NESTED_PACKAGE,
						NESTED_PACKAGE_ESUPERSETS));
			}
			return nestedPackages;
		}
		return new DerivedEObjectEList(org.eclipse.uml2.Package.class, this,
			UML2Package.PACKAGE__NESTED_PACKAGE, NESTED_PACKAGE_ESUPERSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public org.eclipse.uml2.Package getNestedPackage(String name) {
		return getNestedPackage(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.Package getNestedPackage(String name, boolean ignoreCase, EClass eClass) {
		nestedPackageLoop: for (Iterator i = getNestedPackages().iterator(); i.hasNext(); ) {
			org.eclipse.uml2.Package nestedPackage = (org.eclipse.uml2.Package) i.next();
			if (eClass != null && !eClass.isInstance(nestedPackage))
				continue nestedPackageLoop;
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(nestedPackage.getName()) : name.equals(nestedPackage.getName())))
				continue nestedPackageLoop;
			return nestedPackage;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public org.eclipse.uml2.Package getNestingPackage() {
		EObject eContainer = eContainer();
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
			Resource eResource = eResource();
			EList ownedTypes = (EList) cache.get(eResource, this,
				UML2Package.Literals.PACKAGE__OWNED_TYPE);
			if (ownedTypes == null) {
				cache.put(eResource, this,
					UML2Package.Literals.PACKAGE__OWNED_TYPE,
					ownedTypes = new DerivedEObjectEList(Type.class, this,
						UML2Package.PACKAGE__OWNED_TYPE, OWNED_TYPE_ESUPERSETS));
			}
			return ownedTypes;
		}
		return new DerivedEObjectEList(Type.class, this,
			UML2Package.PACKAGE__OWNED_TYPE, OWNED_TYPE_ESUPERSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public Type getOwnedType(String name) {
		return getOwnedType(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getOwnedType(String name, boolean ignoreCase, EClass eClass) {
		ownedTypeLoop: for (Iterator i = getOwnedTypes().iterator(); i.hasNext(); ) {
			Type ownedType = (Type) i.next();
			if (eClass != null && !eClass.isInstance(ownedType))
				continue ownedTypeLoop;
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(ownedType.getName()) : name.equals(ownedType.getName())))
				continue ownedTypeLoop;
			return ownedType;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedMembers() {
		if (ownedMembers == null) {
			ownedMembers = new EObjectContainmentEList(PackageableElement.class, this, UML2Package.PACKAGE__OWNED_MEMBER);
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
	 * @generated
	 */
    public NamedElement getOwnedMember(String name) {
		return getOwnedMember(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement getOwnedMember(String name, boolean ignoreCase, EClass eClass) {
		ownedMemberLoop: for (Iterator i = getOwnedMembers().iterator(); i.hasNext(); ) {
			PackageableElement ownedMember = (PackageableElement) i.next();
			if (eClass != null && !eClass.isInstance(ownedMember))
				continue ownedMemberLoop;
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(ownedMember.getName()) : name.equals(ownedMember.getName())))
				continue ownedMemberLoop;
			return ownedMember;
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
		if (packageMerges == null) {
			packageMerges = new EObjectContainmentWithInverseEList(PackageMerge.class, this, UML2Package.PACKAGE__PACKAGE_MERGE, UML2Package.PACKAGE_MERGE__MERGING_PACKAGE);
		}
		return packageMerges;
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
	 * @generated NOT
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
		if (appliedProfiles == null) {
			appliedProfiles = new SubsetSupersetEObjectEList(ProfileApplication.class, this, UML2Package.PACKAGE__APPLIED_PROFILE, APPLIED_PROFILE_ESUPERSETS, null);
		}
		return appliedProfiles;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getPackageExtensions() {
		if (packageExtensions == null) {
			packageExtensions = new EObjectContainmentEList(PackageMerge.class, this, UML2Package.PACKAGE__PACKAGE_EXTENSION);
		}
		return packageExtensions;
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
	 * @generated NOT
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
	public boolean isSetOwner() {
		return super.isSetOwner()
			|| eIsSet(UML2Package.PACKAGE__OWNING_PARAMETER);
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
	public boolean isSetVisibility() {
  		return false;
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
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
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
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningParameter((TemplateParameter)otherEnd, msgs);
			case UML2Package.PACKAGE__PACKAGE_MERGE:
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
				return basicSetOwningParameter(null, msgs);
			case UML2Package.PACKAGE__OWNED_MEMBER:
				return ((InternalEList)getOwnedMembers()).basicRemove(otherEnd, msgs);
			case UML2Package.PACKAGE__PACKAGE_MERGE:
				return ((InternalEList)getPackageMerges()).basicRemove(otherEnd, msgs);
			case UML2Package.PACKAGE__PACKAGE_EXTENSION:
				return ((InternalEList)getPackageExtensions()).basicRemove(otherEnd, msgs);
		}
		return eDynamicInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID) {
			case UML2Package.PACKAGE__OWNING_PARAMETER:
				return eInternalContainer().eInverseRemove(this, UML2Package.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
		}
		return eDynamicBasicRemoveFromContainer(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Set visibleMembers() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Set result = (Set) cache.get(this, UML2Package.Literals.PACKAGE.getEOperations().get(1));
			if (result == null) {
				cache.put(this, UML2Package.Literals.PACKAGE.getEOperations().get(1), result = PackageOperations.visibleMembers(this));
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
		org.eclipse.uml2.Package nestingPackage = getNestingPackage();			
		if (nestingPackage != null) {
			return nestingPackage;
		}
		return super.basicGetNamespace();
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedElements() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			EList ownedElements = (EList) cache.get(eResource(), this, UML2Package.Literals.ELEMENT__OWNED_ELEMENT);
			if (ownedElements == null) {
				List union = getOwnedElementsHelper(new UniqueEList.FastCompare());
				cache.put(eResource(), this, UML2Package.Literals.ELEMENT__OWNED_ELEMENT, ownedElements = new UnionEObjectEList(this, UML2Package.Literals.ELEMENT__OWNED_ELEMENT, union.size(), union.toArray()));
			}
			return ownedElements;
		}
		List union = getOwnedElementsHelper(new UniqueEList.FastCompare());
		return new UnionEObjectEList(this, UML2Package.Literals.ELEMENT__OWNED_ELEMENT, union.size(), union.toArray());
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNamespace() {
		return super.isSetNamespace()
			|| eIsSet(UML2Package.PACKAGE__NESTING_PACKAGE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected EList getOwnedElementsHelper(EList ownedElements) {
		super.getOwnedElementsHelper(ownedElements);
		if (eIsSet(UML2Package.Literals.PACKAGE__PACKAGE_MERGE)) {
			ownedElements.addAll(getPackageMerges());
		}
		if (eIsSet(UML2Package.Literals.PACKAGE__PACKAGE_EXTENSION)) {
			ownedElements.addAll(getPackageExtensions());
		}
		EList ownedMember = super.getOwnedMembers();
		if (!ownedMember.isEmpty()) {
			for (Iterator i = ((InternalEList) ownedMember).basicIterator(); i.hasNext(); ) {
				ownedElements.add(i.next());
			}
		}
		return ownedElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| eIsSet(UML2Package.Literals.PACKAGE__PACKAGE_MERGE)
			|| eIsSet(UML2Package.Literals.PACKAGE__PACKAGE_EXTENSION)
			|| super.isSetOwnedMembers();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getPackageImports() {
		if (packageImports == null) {
			packageImports = new SubsetSupersetEObjectContainmentWithInverseEList(PackageImport.class, this, UML2Package.PACKAGE__PACKAGE_IMPORT, null, PACKAGE_IMPORT_ESUBSETS, UML2Package.PACKAGE_IMPORT__IMPORTING_NAMESPACE);
		}
		return packageImports;
	}


	/**
	 * The array of subset feature identifiers for the '{@link #getOwnedElements() <em>Owned Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedElements()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_ELEMENT_ESUBSETS = new int[] {UML2Package.PACKAGE__OWNED_COMMENT, UML2Package.PACKAGE__TEMPLATE_BINDING, UML2Package.PACKAGE__OWNED_TEMPLATE_SIGNATURE, UML2Package.PACKAGE__NAME_EXPRESSION, UML2Package.PACKAGE__ELEMENT_IMPORT, UML2Package.PACKAGE__PACKAGE_IMPORT, UML2Package.PACKAGE__PACKAGE_MERGE, UML2Package.PACKAGE__PACKAGE_EXTENSION};

	/**
	 * The array of subset feature identifiers for the '{@link #getPackageImports() <em>Package Import</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageImports()
	 * @generated
	 * @ordered
	 */
	protected static final int[] PACKAGE_IMPORT_ESUBSETS = new int[] {UML2Package.PACKAGE__APPLIED_PROFILE};

	/**
	 * The array of superset feature identifiers for the '{@link #getNestedPackages() <em>Nested Package</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNestedPackages()
	 * @generated
	 * @ordered
	 */
	protected static final int[] NESTED_PACKAGE_ESUPERSETS = new int[] {UML2Package.PACKAGE__OWNED_MEMBER};

	/**
	 * The array of superset feature identifiers for the '{@link #getOwnedTypes() <em>Owned Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedTypes()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_TYPE_ESUPERSETS = new int[] {UML2Package.PACKAGE__OWNED_MEMBER};

	/**
	 * The array of superset feature identifiers for the '{@link #getAppliedProfiles() <em>Applied Profile</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppliedProfiles()
	 * @generated
	 * @ordered
	 */
	protected static final int[] APPLIED_PROFILE_ESUPERSETS = new int[] {UML2Package.PACKAGE__PACKAGE_IMPORT};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
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
				return getNestingPackage();
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
		return eDynamicGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
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
		eDynamicSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
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
		eDynamicUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UML2Package.PACKAGE__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.PACKAGE__OWNED_ELEMENT:
				return isSetOwnedElements();
			case UML2Package.PACKAGE__OWNER:
				return isSetOwner();
			case UML2Package.PACKAGE__OWNED_COMMENT:
				return ownedComments != null && !ownedComments.isEmpty();
			case UML2Package.PACKAGE__TEMPLATE_BINDING:
				return templateBindings != null && !templateBindings.isEmpty();
			case UML2Package.PACKAGE__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case UML2Package.PACKAGE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.PACKAGE__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UML2Package.PACKAGE__VISIBILITY:
				return isSetVisibility();
			case UML2Package.PACKAGE__CLIENT_DEPENDENCY:
				return clientDependencies != null && !clientDependencies.isEmpty();
			case UML2Package.PACKAGE__NAME_EXPRESSION:
				return nameExpression != null;
			case UML2Package.PACKAGE__MEMBER:
				return isSetMembers();
			case UML2Package.PACKAGE__OWNED_RULE:
				return ownedRules != null && !ownedRules.isEmpty();
			case UML2Package.PACKAGE__IMPORTED_MEMBER:
				return !getImportedMembers().isEmpty();
			case UML2Package.PACKAGE__ELEMENT_IMPORT:
				return elementImports != null && !elementImports.isEmpty();
			case UML2Package.PACKAGE__PACKAGE_IMPORT:
				return packageImports != null && !packageImports.isEmpty();
			case UML2Package.PACKAGE__TEMPLATE_PARAMETER:
				return templateParameter != null;
			case UML2Package.PACKAGE__OWNING_PARAMETER:
				return getOwningParameter() != null;
			case UML2Package.PACKAGE__PACKAGEABLE_ELEMENT_VISIBILITY:
				return isSetPackageableElement_visibility();
			case UML2Package.PACKAGE__NESTED_PACKAGE:
				return !getNestedPackages().isEmpty();
			case UML2Package.PACKAGE__NESTING_PACKAGE:
				return getNestingPackage() != null;
			case UML2Package.PACKAGE__OWNED_TYPE:
				return !getOwnedTypes().isEmpty();
			case UML2Package.PACKAGE__OWNED_MEMBER:
				return isSetOwnedMembers();
			case UML2Package.PACKAGE__PACKAGE_MERGE:
				return packageMerges != null && !packageMerges.isEmpty();
			case UML2Package.PACKAGE__APPLIED_PROFILE:
				return appliedProfiles != null && !appliedProfiles.isEmpty();
			case UML2Package.PACKAGE__PACKAGE_EXTENSION:
				return packageExtensions != null && !packageExtensions.isEmpty();
		}
		return eDynamicIsSet(featureID);
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
	 * @see org.eclipse.uml2.impl.NamespaceImpl#isSetMembers()
	 */
	public boolean isSetMembers() {
		return super.isSetMembers() || super.isSetOwnedMembers();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.impl.NamespaceImpl#getMembersHelper(org.eclipse.emf.common.util.EList)
	 */
	protected EList getMembersHelper(EList member) {
		super.getMembersHelper(member);
		EList ownedMember = super.getOwnedMembers();
		if (!ownedMember.isEmpty()) {
			for (Iterator i = ((InternalEList) ownedMember).basicIterator(); i.hasNext();) {
				member.add(i.next());
			}
		}
		return member;
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
