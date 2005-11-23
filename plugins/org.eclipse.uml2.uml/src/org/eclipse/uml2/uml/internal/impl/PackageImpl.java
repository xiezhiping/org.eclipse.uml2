/*
 * Copyright (c) 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: PackageImpl.java,v 1.4 2005/11/23 20:01:19 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;
import org.eclipse.uml2.common.util.SubsetEObjectEList;
import org.eclipse.uml2.common.util.SupersetEObjectContainmentWithInverseEList;

import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.PackageImport;
import org.eclipse.uml2.uml.PackageMerge;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.ParameterableElement;
import org.eclipse.uml2.uml.ProfileApplication;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.TemplateBinding;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.TemplateSignature;
import org.eclipse.uml2.uml.TemplateableElement;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.PackageOperations;
import org.eclipse.uml2.uml.internal.operations.ParameterableElementOperations;
import org.eclipse.uml2.uml.internal.operations.TemplateableElementOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PackageImpl#getTemplateParameter <em>Template Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PackageImpl#getOwningTemplateParameter <em>Owning Template Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PackageImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PackageImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PackageImpl#getTemplateBindings <em>Template Binding</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PackageImpl#getOwnedTemplateSignature <em>Owned Template Signature</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PackageImpl#getOwnedMembers <em>Owned Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PackageImpl#getPackagedElements <em>Packaged Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PackageImpl#getPackageImports <em>Package Import</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PackageImpl#getPackageMerges <em>Package Merge</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PackageImpl#getOwnedTypes <em>Owned Type</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PackageImpl#getNestedPackages <em>Nested Package</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PackageImpl#getNestingPackage <em>Nesting Package</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PackageImpl#getAppliedProfiles <em>Applied Profile</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PackageImpl
		extends NamespaceImpl
		implements org.eclipse.uml2.uml.Package {

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
		return UMLPackage.Literals.PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateParameter getTemplateParameter() {
		TemplateParameter templateParameter = (TemplateParameter) eVirtualGet(UMLPackage.PACKAGE__TEMPLATE_PARAMETER);
		if (templateParameter != null && templateParameter.eIsProxy()) {
			InternalEObject oldTemplateParameter = (InternalEObject) templateParameter;
			templateParameter = (TemplateParameter) eResolveProxy(oldTemplateParameter);
			if (templateParameter != oldTemplateParameter) {
				eVirtualSet(UMLPackage.PACKAGE__TEMPLATE_PARAMETER,
					templateParameter);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.PACKAGE__TEMPLATE_PARAMETER,
						oldTemplateParameter, templateParameter));
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
		return (TemplateParameter) eVirtualGet(UMLPackage.PACKAGE__TEMPLATE_PARAMETER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemplateParameter(
			TemplateParameter newTemplateParameter, NotificationChain msgs) {
		Object oldTemplateParameter = eVirtualSet(
			UMLPackage.PACKAGE__TEMPLATE_PARAMETER, newTemplateParameter);
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET, UMLPackage.PACKAGE__TEMPLATE_PARAMETER,
				oldTemplateParameter == EVIRTUAL_NO_VALUE
					? null
					: oldTemplateParameter, newTemplateParameter);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}

		if (getOwningTemplateParameter() != null
			&& getOwningTemplateParameter() != newTemplateParameter) {
			setOwningTemplateParameter(null);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemplateParameter(TemplateParameter newTemplateParameter) {
		TemplateParameter templateParameter = (TemplateParameter) eVirtualGet(UMLPackage.PACKAGE__TEMPLATE_PARAMETER);
		if (newTemplateParameter != templateParameter) {
			NotificationChain msgs = null;
			if (templateParameter != null)
				msgs = ((InternalEObject) templateParameter).eInverseRemove(
					this, UMLPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT,
					TemplateParameter.class, msgs);
			if (newTemplateParameter != null)
				msgs = ((InternalEObject) newTemplateParameter).eInverseAdd(
					this, UMLPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT,
					TemplateParameter.class, msgs);
			msgs = basicSetTemplateParameter(newTemplateParameter, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.PACKAGE__TEMPLATE_PARAMETER, newTemplateParameter,
				newTemplateParameter));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateParameter getOwningTemplateParameter() {
		if (eContainerFeatureID != UMLPackage.PACKAGE__OWNING_TEMPLATE_PARAMETER)
			return null;
		return (TemplateParameter) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateParameter basicGetOwningTemplateParameter() {
		if (eContainerFeatureID != UMLPackage.PACKAGE__OWNING_TEMPLATE_PARAMETER)
			return null;
		return (TemplateParameter) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningTemplateParameter(
			TemplateParameter newOwningTemplateParameter) {
		EObject oldOwningTemplateParameter = eContainer();
		if (newOwningTemplateParameter != eInternalContainer()
			|| (eContainerFeatureID != UMLPackage.PACKAGE__OWNING_TEMPLATE_PARAMETER && newOwningTemplateParameter != null)) {
			if (EcoreUtil
				.isAncestor(this, (EObject) newOwningTemplateParameter))
				throw new IllegalArgumentException(
					"Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningTemplateParameter != null)
				msgs = ((InternalEObject) newOwningTemplateParameter)
					.eInverseAdd(
						this,
						UMLPackage.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
						TemplateParameter.class, msgs);
			msgs = eBasicSetContainer(
				(InternalEObject) newOwningTemplateParameter,
				UMLPackage.PACKAGE__OWNING_TEMPLATE_PARAMETER, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.PACKAGE__OWNING_TEMPLATE_PARAMETER,
				newOwningTemplateParameter, newOwningTemplateParameter));

		if (newOwningTemplateParameter != null
			|| oldOwningTemplateParameter == eVirtualGet(UMLPackage.PACKAGE__TEMPLATE_PARAMETER)) {
			setTemplateParameter(newOwningTemplateParameter);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisibilityKind getVisibility() {
		return (VisibilityKind) eVirtualGet(UMLPackage.PACKAGE__VISIBILITY,
			VISIBILITY_EDEFAULT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibility(VisibilityKind newVisibility) {
		VisibilityKind visibility = newVisibility == null
			? VISIBILITY_EDEFAULT
			: newVisibility;
		Object oldVisibility = eVirtualSet(UMLPackage.PACKAGE__VISIBILITY,
			visibility);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.PACKAGE__VISIBILITY,
				oldVisibility == EVIRTUAL_NO_VALUE
					? VISIBILITY_EDEFAULT
					: oldVisibility, visibility));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVisibility() {
		return eVirtualGet(UMLPackage.PACKAGE__VISIBILITY, VISIBILITY_EDEFAULT) != VISIBILITY_EDEFAULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getOwnedElements() {
		List ownedElement = (List) eVirtualGet(UMLPackage.PACKAGE__OWNED_ELEMENT);
		if (ownedElement == null) {
			eVirtualSet(UMLPackage.PACKAGE__OWNED_ELEMENT,
				ownedElement = new DerivedUnionEObjectEList(Element.class,
					this, UMLPackage.PACKAGE__OWNED_ELEMENT, new int[]{
						UMLPackage.PACKAGE__OWNED_COMMENT,
						UMLPackage.PACKAGE__NAME_EXPRESSION,
						UMLPackage.PACKAGE__ELEMENT_IMPORT,
						UMLPackage.PACKAGE__PACKAGE_IMPORT,
						UMLPackage.PACKAGE__OWNED_MEMBER,
						UMLPackage.PACKAGE__TEMPLATE_BINDING,
						UMLPackage.PACKAGE__OWNED_TEMPLATE_SIGNATURE,
						UMLPackage.PACKAGE__PACKAGE_MERGE}));
		}
		return ownedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getTemplateBindings() {
		List templateBinding = (List) eVirtualGet(UMLPackage.PACKAGE__TEMPLATE_BINDING);
		if (templateBinding == null) {
			eVirtualSet(UMLPackage.PACKAGE__TEMPLATE_BINDING,
				templateBinding = new EObjectContainmentWithInverseEList(
					TemplateBinding.class, this,
					UMLPackage.PACKAGE__TEMPLATE_BINDING,
					UMLPackage.TEMPLATE_BINDING__BOUND_ELEMENT));
		}
		return templateBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateBinding createTemplateBinding() {
		TemplateBinding newTemplateBinding = UMLFactory.eINSTANCE
			.createTemplateBinding();
		getTemplateBindings().add(newTemplateBinding);
		return newTemplateBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateSignature getOwnedTemplateSignature() {
		return (TemplateSignature) eVirtualGet(UMLPackage.PACKAGE__OWNED_TEMPLATE_SIGNATURE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedTemplateSignature(
			TemplateSignature newOwnedTemplateSignature, NotificationChain msgs) {
		Object oldOwnedTemplateSignature = eVirtualSet(
			UMLPackage.PACKAGE__OWNED_TEMPLATE_SIGNATURE,
			newOwnedTemplateSignature);
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET, UMLPackage.PACKAGE__OWNED_TEMPLATE_SIGNATURE,
				oldOwnedTemplateSignature == EVIRTUAL_NO_VALUE
					? null
					: oldOwnedTemplateSignature, newOwnedTemplateSignature);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedTemplateSignature(
			TemplateSignature newOwnedTemplateSignature) {
		TemplateSignature ownedTemplateSignature = (TemplateSignature) eVirtualGet(UMLPackage.PACKAGE__OWNED_TEMPLATE_SIGNATURE);
		if (newOwnedTemplateSignature != ownedTemplateSignature) {
			NotificationChain msgs = null;
			if (ownedTemplateSignature != null)
				msgs = ((InternalEObject) ownedTemplateSignature)
					.eInverseRemove(this,
						UMLPackage.TEMPLATE_SIGNATURE__TEMPLATE,
						TemplateSignature.class, msgs);
			if (newOwnedTemplateSignature != null)
				msgs = ((InternalEObject) newOwnedTemplateSignature)
					.eInverseAdd(this, UMLPackage.TEMPLATE_SIGNATURE__TEMPLATE,
						TemplateSignature.class, msgs);
			msgs = basicSetOwnedTemplateSignature(newOwnedTemplateSignature,
				msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.PACKAGE__OWNED_TEMPLATE_SIGNATURE,
				newOwnedTemplateSignature, newOwnedTemplateSignature));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateSignature createOwnedTemplateSignature(EClass eClass) {
		TemplateSignature newOwnedTemplateSignature = (TemplateSignature) eClass
			.getEPackage().getEFactoryInstance().create(eClass);
		setOwnedTemplateSignature(newOwnedTemplateSignature);
		return newOwnedTemplateSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateSignature createOwnedTemplateSignature() {
		TemplateSignature newOwnedTemplateSignature = UMLFactory.eINSTANCE
			.createTemplateSignature();
		setOwnedTemplateSignature(newOwnedTemplateSignature);
		return newOwnedTemplateSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getOwnedMembers() {
		List ownedMember = (List) eVirtualGet(UMLPackage.PACKAGE__OWNED_MEMBER);
		if (ownedMember == null) {
			eVirtualSet(UMLPackage.PACKAGE__OWNED_MEMBER,
				ownedMember = new DerivedUnionEObjectEList(NamedElement.class,
					this, UMLPackage.PACKAGE__OWNED_MEMBER, new int[]{
						UMLPackage.PACKAGE__OWNED_RULE,
						UMLPackage.PACKAGE__PACKAGED_ELEMENT}));
		}
		return ownedMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getPackagedElements() {
		List packagedElement = (List) eVirtualGet(UMLPackage.PACKAGE__PACKAGED_ELEMENT);
		if (packagedElement == null) {
			eVirtualSet(UMLPackage.PACKAGE__PACKAGED_ELEMENT,
				packagedElement = new EObjectContainmentEList.Resolving(
					PackageableElement.class, this,
					UMLPackage.PACKAGE__PACKAGED_ELEMENT));
		}
		return packagedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageableElement createPackagedElement(EClass eClass) {
		PackageableElement newPackagedElement = (PackageableElement) eClass
			.getEPackage().getEFactoryInstance().create(eClass);
		getPackagedElements().add(newPackagedElement);
		return newPackagedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageableElement getPackagedElement(String name) {
		for (Iterator i = getPackagedElements().iterator(); i.hasNext();) {
			PackageableElement packagedElement = (PackageableElement) i.next();
			if (name.equals(packagedElement.getName())) {
				return packagedElement;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getPackageImports() {
		List packageImport = (List) eVirtualGet(UMLPackage.PACKAGE__PACKAGE_IMPORT);
		if (packageImport == null) {
			eVirtualSet(UMLPackage.PACKAGE__PACKAGE_IMPORT,
				packageImport = new SupersetEObjectContainmentWithInverseEList(
					PackageImport.class, this,
					UMLPackage.PACKAGE__PACKAGE_IMPORT,
					new int[]{UMLPackage.PACKAGE__APPLIED_PROFILE},
					UMLPackage.PACKAGE_IMPORT__IMPORTING_NAMESPACE));
		}
		return packageImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getPackageMerges() {
		List packageMerge = (List) eVirtualGet(UMLPackage.PACKAGE__PACKAGE_MERGE);
		if (packageMerge == null) {
			eVirtualSet(UMLPackage.PACKAGE__PACKAGE_MERGE,
				packageMerge = new EObjectContainmentWithInverseEList(
					PackageMerge.class, this,
					UMLPackage.PACKAGE__PACKAGE_MERGE,
					UMLPackage.PACKAGE_MERGE__RECEIVING_PACKAGE));
		}
		return packageMerge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageMerge createPackageMerge() {
		PackageMerge newPackageMerge = UMLFactory.eINSTANCE
			.createPackageMerge();
		getPackageMerges().add(newPackageMerge);
		return newPackageMerge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getOwnedTypes() {
		// TODO: implement this method to return the 'Owned Type' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getOwnedType(String name) {
		for (Iterator i = getOwnedTypes().iterator(); i.hasNext();) {
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
	public List getNestedPackages() {
		// TODO: implement this method to return the 'Nested Package' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Package getNestedPackage(String name) {
		for (Iterator i = getNestedPackages().iterator(); i.hasNext();) {
			org.eclipse.uml2.uml.Package nestedPackage = (org.eclipse.uml2.uml.Package) i
				.next();
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
	public org.eclipse.uml2.uml.Package getNestingPackage() {
		org.eclipse.uml2.uml.Package nestingPackage = basicGetNestingPackage();
		return nestingPackage != null && nestingPackage.eIsProxy()
			? (org.eclipse.uml2.uml.Package) eResolveProxy((InternalEObject) nestingPackage)
			: nestingPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Package basicGetNestingPackage() {
		// TODO: implement this method to return the 'Nesting Package' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNestingPackage(org.eclipse.uml2.uml.Package newNestingPackage) {
		// TODO: implement this method to set the 'Nesting Package' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getAppliedProfiles() {
		List appliedProfile = (List) eVirtualGet(UMLPackage.PACKAGE__APPLIED_PROFILE);
		if (appliedProfile == null) {
			eVirtualSet(UMLPackage.PACKAGE__APPLIED_PROFILE,
				appliedProfile = new SubsetEObjectEList(
					ProfileApplication.class, this,
					UMLPackage.PACKAGE__APPLIED_PROFILE,
					new int[]{UMLPackage.PACKAGE__PACKAGE_IMPORT}));
		}
		return appliedProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCompatibleWith(ParameterableElement p) {
		return ParameterableElementOperations.isCompatibleWith(this, p);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTemplateParameter() {
		return ParameterableElementOperations.isTemplateParameter(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List parameterableElements() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			List result = (List) cache.get(eResource(), this,
				UMLPackage.Literals.TEMPLATEABLE_ELEMENT.getEOperations()
					.get(0));
			if (result == null) {
				cache.put(eResource(), this,
					UMLPackage.Literals.TEMPLATEABLE_ELEMENT.getEOperations()
						.get(0), result = TemplateableElementOperations
						.parameterableElements(this));
			}
			return result;
		}
		return TemplateableElementOperations.parameterableElements(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTemplate() {
		return TemplateableElementOperations.isTemplate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElementsPublicOrPrivate(DiagnosticChain diagnostics,
			Map context) {
		return PackageOperations.validateElementsPublicOrPrivate(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List visibleMembers() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			List result = (List) cache.get(this, UMLPackage.Literals.PACKAGE
				.getEOperations().get(1));
			if (result == null) {
				cache.put(this, UMLPackage.Literals.PACKAGE.getEOperations()
					.get(1), result = PackageOperations.visibleMembers(this));
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
	public boolean mustBeOwned() {
		return PackageOperations.mustBeOwned(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UMLPackage.PACKAGE__EANNOTATIONS :
					return ((InternalEList) getEAnnotations()).basicAdd(
						otherEnd, msgs);
				case UMLPackage.PACKAGE__CLIENT_DEPENDENCY :
					return ((InternalEList) getClientDependencies()).basicAdd(
						otherEnd, msgs);
				case UMLPackage.PACKAGE__ELEMENT_IMPORT :
					return ((InternalEList) getElementImports()).basicAdd(
						otherEnd, msgs);
				case UMLPackage.PACKAGE__PACKAGE_IMPORT :
					return ((InternalEList) getPackageImports()).basicAdd(
						otherEnd, msgs);
				case UMLPackage.PACKAGE__OWNED_RULE :
					return ((InternalEList) getOwnedRules()).basicAdd(otherEnd,
						msgs);
				case UMLPackage.PACKAGE__TEMPLATE_PARAMETER :
					TemplateParameter templateParameter = (TemplateParameter) eVirtualGet(UMLPackage.PACKAGE__TEMPLATE_PARAMETER);
					if (templateParameter != null)
						msgs = ((InternalEObject) templateParameter)
							.eInverseRemove(
								this,
								UMLPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT,
								TemplateParameter.class, msgs);
					return basicSetTemplateParameter(
						(TemplateParameter) otherEnd, msgs);
				case UMLPackage.PACKAGE__OWNING_TEMPLATE_PARAMETER :
					if (eInternalContainer() != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd,
						UMLPackage.PACKAGE__OWNING_TEMPLATE_PARAMETER, msgs);
				case UMLPackage.PACKAGE__TEMPLATE_BINDING :
					return ((InternalEList) getTemplateBindings()).basicAdd(
						otherEnd, msgs);
				case UMLPackage.PACKAGE__OWNED_TEMPLATE_SIGNATURE :
					TemplateSignature ownedTemplateSignature = (TemplateSignature) eVirtualGet(UMLPackage.PACKAGE__OWNED_TEMPLATE_SIGNATURE);
					if (ownedTemplateSignature != null)
						msgs = ((InternalEObject) ownedTemplateSignature)
							.eInverseRemove(this, EOPPOSITE_FEATURE_BASE
								- UMLPackage.PACKAGE__OWNED_TEMPLATE_SIGNATURE,
								null, msgs);
					return basicSetOwnedTemplateSignature(
						(TemplateSignature) otherEnd, msgs);
				case UMLPackage.PACKAGE__PACKAGE_MERGE :
					return ((InternalEList) getPackageMerges()).basicAdd(
						otherEnd, msgs);
				default :
					return eDynamicInverseAdd(otherEnd, featureID, baseClass,
						msgs);
			}
		}
		if (eInternalContainer() != null)
			msgs = eBasicRemoveFromContainer(msgs);
		return eBasicSetContainer(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UMLPackage.PACKAGE__EANNOTATIONS :
					return ((InternalEList) getEAnnotations()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.PACKAGE__OWNED_COMMENT :
					return ((InternalEList) getOwnedComments()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.PACKAGE__CLIENT_DEPENDENCY :
					return ((InternalEList) getClientDependencies())
						.basicRemove(otherEnd, msgs);
				case UMLPackage.PACKAGE__NAME_EXPRESSION :
					return basicSetNameExpression(null, msgs);
				case UMLPackage.PACKAGE__ELEMENT_IMPORT :
					return ((InternalEList) getElementImports()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.PACKAGE__PACKAGE_IMPORT :
					return ((InternalEList) getPackageImports()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.PACKAGE__OWNED_RULE :
					return ((InternalEList) getOwnedRules()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.PACKAGE__TEMPLATE_PARAMETER :
					return basicSetTemplateParameter(null, msgs);
				case UMLPackage.PACKAGE__OWNING_TEMPLATE_PARAMETER :
					return eBasicSetContainer(null,
						UMLPackage.PACKAGE__OWNING_TEMPLATE_PARAMETER, msgs);
				case UMLPackage.PACKAGE__TEMPLATE_BINDING :
					return ((InternalEList) getTemplateBindings()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.PACKAGE__OWNED_TEMPLATE_SIGNATURE :
					return basicSetOwnedTemplateSignature(null, msgs);
				case UMLPackage.PACKAGE__PACKAGE_MERGE :
					return ((InternalEList) getPackageMerges()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.PACKAGE__PACKAGED_ELEMENT :
					return ((InternalEList) getPackagedElements()).basicRemove(
						otherEnd, msgs);
				default :
					return eDynamicInverseRemove(otherEnd, featureID,
						baseClass, msgs);
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
				case UMLPackage.PACKAGE__OWNING_TEMPLATE_PARAMETER :
					return eInternalContainer()
						.eInverseRemove(
							this,
							UMLPackage.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
							TemplateParameter.class, msgs);
				default :
					return eDynamicBasicRemoveFromContainer(msgs);
			}
		}
		return eInternalContainer().eInverseRemove(this,
			EOPPOSITE_FEATURE_BASE - eContainerFeatureID, null, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.PACKAGE__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.PACKAGE__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.PACKAGE__OWNER :
				return getOwner();
			case UMLPackage.PACKAGE__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.PACKAGE__NAME :
				return getName();
			case UMLPackage.PACKAGE__VISIBILITY :
				return getVisibility();
			case UMLPackage.PACKAGE__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.PACKAGE__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.PACKAGE__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.PACKAGE__NAME_EXPRESSION :
				return getNameExpression();
			case UMLPackage.PACKAGE__ELEMENT_IMPORT :
				return getElementImports();
			case UMLPackage.PACKAGE__PACKAGE_IMPORT :
				return getPackageImports();
			case UMLPackage.PACKAGE__OWNED_RULE :
				return getOwnedRules();
			case UMLPackage.PACKAGE__MEMBER :
				return getMembers();
			case UMLPackage.PACKAGE__IMPORTED_MEMBER :
				return getImportedMembers();
			case UMLPackage.PACKAGE__OWNED_MEMBER :
				return getOwnedMembers();
			case UMLPackage.PACKAGE__TEMPLATE_PARAMETER :
				if (resolve)
					return getTemplateParameter();
				return basicGetTemplateParameter();
			case UMLPackage.PACKAGE__OWNING_TEMPLATE_PARAMETER :
				if (resolve)
					return getOwningTemplateParameter();
				return basicGetOwningTemplateParameter();
			case UMLPackage.PACKAGE__TEMPLATE_BINDING :
				return getTemplateBindings();
			case UMLPackage.PACKAGE__OWNED_TEMPLATE_SIGNATURE :
				return getOwnedTemplateSignature();
			case UMLPackage.PACKAGE__PACKAGE_MERGE :
				return getPackageMerges();
			case UMLPackage.PACKAGE__PACKAGED_ELEMENT :
				return getPackagedElements();
			case UMLPackage.PACKAGE__OWNED_TYPE :
				return getOwnedTypes();
			case UMLPackage.PACKAGE__NESTED_PACKAGE :
				return getNestedPackages();
			case UMLPackage.PACKAGE__NESTING_PACKAGE :
				if (resolve)
					return getNestingPackage();
				return basicGetNestingPackage();
			case UMLPackage.PACKAGE__APPLIED_PROFILE :
				return getAppliedProfiles();
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
			case UMLPackage.PACKAGE__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.PACKAGE__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.PACKAGE__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.PACKAGE__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.PACKAGE__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.PACKAGE__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.PACKAGE__ELEMENT_IMPORT :
				getElementImports().clear();
				getElementImports().addAll((Collection) newValue);
				return;
			case UMLPackage.PACKAGE__PACKAGE_IMPORT :
				getPackageImports().clear();
				getPackageImports().addAll((Collection) newValue);
				return;
			case UMLPackage.PACKAGE__OWNED_RULE :
				getOwnedRules().clear();
				getOwnedRules().addAll((Collection) newValue);
				return;
			case UMLPackage.PACKAGE__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.PACKAGE__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.PACKAGE__TEMPLATE_BINDING :
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection) newValue);
				return;
			case UMLPackage.PACKAGE__OWNED_TEMPLATE_SIGNATURE :
				setOwnedTemplateSignature((TemplateSignature) newValue);
				return;
			case UMLPackage.PACKAGE__PACKAGE_MERGE :
				getPackageMerges().clear();
				getPackageMerges().addAll((Collection) newValue);
				return;
			case UMLPackage.PACKAGE__PACKAGED_ELEMENT :
				getPackagedElements().clear();
				getPackagedElements().addAll((Collection) newValue);
				return;
			case UMLPackage.PACKAGE__OWNED_TYPE :
				getOwnedTypes().clear();
				getOwnedTypes().addAll((Collection) newValue);
				return;
			case UMLPackage.PACKAGE__NESTED_PACKAGE :
				getNestedPackages().clear();
				getNestedPackages().addAll((Collection) newValue);
				return;
			case UMLPackage.PACKAGE__NESTING_PACKAGE :
				setNestingPackage((org.eclipse.uml2.uml.Package) newValue);
				return;
			case UMLPackage.PACKAGE__APPLIED_PROFILE :
				getAppliedProfiles().clear();
				getAppliedProfiles().addAll((Collection) newValue);
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
			case UMLPackage.PACKAGE__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.PACKAGE__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.PACKAGE__NAME :
				setName(NAME_EDEFAULT);
				return;
			case UMLPackage.PACKAGE__VISIBILITY :
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UMLPackage.PACKAGE__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.PACKAGE__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.PACKAGE__ELEMENT_IMPORT :
				getElementImports().clear();
				return;
			case UMLPackage.PACKAGE__PACKAGE_IMPORT :
				getPackageImports().clear();
				return;
			case UMLPackage.PACKAGE__OWNED_RULE :
				getOwnedRules().clear();
				return;
			case UMLPackage.PACKAGE__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.PACKAGE__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.PACKAGE__TEMPLATE_BINDING :
				getTemplateBindings().clear();
				return;
			case UMLPackage.PACKAGE__OWNED_TEMPLATE_SIGNATURE :
				setOwnedTemplateSignature((TemplateSignature) null);
				return;
			case UMLPackage.PACKAGE__PACKAGE_MERGE :
				getPackageMerges().clear();
				return;
			case UMLPackage.PACKAGE__PACKAGED_ELEMENT :
				getPackagedElements().clear();
				return;
			case UMLPackage.PACKAGE__OWNED_TYPE :
				getOwnedTypes().clear();
				return;
			case UMLPackage.PACKAGE__NESTED_PACKAGE :
				getNestedPackages().clear();
				return;
			case UMLPackage.PACKAGE__NESTING_PACKAGE :
				setNestingPackage((org.eclipse.uml2.uml.Package) null);
				return;
			case UMLPackage.PACKAGE__APPLIED_PROFILE :
				getAppliedProfiles().clear();
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
			case UMLPackage.PACKAGE__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.PACKAGE__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.PACKAGE__OWNER :
				return isSetOwner();
			case UMLPackage.PACKAGE__OWNED_COMMENT :
				List ownedComment = (List) eVirtualGet(UMLPackage.PACKAGE__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.PACKAGE__NAME :
				String name = (String) eVirtualGet(UMLPackage.PACKAGE__NAME,
					NAME_EDEFAULT);
				return NAME_EDEFAULT == null
					? name != null
					: !NAME_EDEFAULT.equals(name);
			case UMLPackage.PACKAGE__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.PACKAGE__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.PACKAGE__CLIENT_DEPENDENCY :
				List clientDependency = (List) eVirtualGet(UMLPackage.PACKAGE__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.PACKAGE__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.PACKAGE__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.PACKAGE__NAME_EXPRESSION) != null;
			case UMLPackage.PACKAGE__ELEMENT_IMPORT :
				List elementImport = (List) eVirtualGet(UMLPackage.PACKAGE__ELEMENT_IMPORT);
				return elementImport != null && !elementImport.isEmpty();
			case UMLPackage.PACKAGE__PACKAGE_IMPORT :
				List packageImport = (List) eVirtualGet(UMLPackage.PACKAGE__PACKAGE_IMPORT);
				return packageImport != null && !packageImport.isEmpty();
			case UMLPackage.PACKAGE__OWNED_RULE :
				List ownedRule = (List) eVirtualGet(UMLPackage.PACKAGE__OWNED_RULE);
				return ownedRule != null && !ownedRule.isEmpty();
			case UMLPackage.PACKAGE__MEMBER :
				return isSetMembers();
			case UMLPackage.PACKAGE__IMPORTED_MEMBER :
				return !getImportedMembers().isEmpty();
			case UMLPackage.PACKAGE__OWNED_MEMBER :
				return isSetOwnedMembers();
			case UMLPackage.PACKAGE__TEMPLATE_PARAMETER :
				return eVirtualGet(UMLPackage.PACKAGE__TEMPLATE_PARAMETER) != null;
			case UMLPackage.PACKAGE__OWNING_TEMPLATE_PARAMETER :
				return basicGetOwningTemplateParameter() != null;
			case UMLPackage.PACKAGE__TEMPLATE_BINDING :
				List templateBinding = (List) eVirtualGet(UMLPackage.PACKAGE__TEMPLATE_BINDING);
				return templateBinding != null && !templateBinding.isEmpty();
			case UMLPackage.PACKAGE__OWNED_TEMPLATE_SIGNATURE :
				return eVirtualGet(UMLPackage.PACKAGE__OWNED_TEMPLATE_SIGNATURE) != null;
			case UMLPackage.PACKAGE__PACKAGE_MERGE :
				List packageMerge = (List) eVirtualGet(UMLPackage.PACKAGE__PACKAGE_MERGE);
				return packageMerge != null && !packageMerge.isEmpty();
			case UMLPackage.PACKAGE__PACKAGED_ELEMENT :
				List packagedElement = (List) eVirtualGet(UMLPackage.PACKAGE__PACKAGED_ELEMENT);
				return packagedElement != null && !packagedElement.isEmpty();
			case UMLPackage.PACKAGE__OWNED_TYPE :
				return !getOwnedTypes().isEmpty();
			case UMLPackage.PACKAGE__NESTED_PACKAGE :
				return !getNestedPackages().isEmpty();
			case UMLPackage.PACKAGE__NESTING_PACKAGE :
				return basicGetNestingPackage() != null;
			case UMLPackage.PACKAGE__APPLIED_PROFILE :
				List appliedProfile = (List) eVirtualGet(UMLPackage.PACKAGE__APPLIED_PROFILE);
				return appliedProfile != null && !appliedProfile.isEmpty();
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
				case UMLPackage.PACKAGE__TEMPLATE_PARAMETER :
					return UMLPackage.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER;
				case UMLPackage.PACKAGE__OWNING_TEMPLATE_PARAMETER :
					return UMLPackage.PARAMETERABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER;
				default :
					return -1;
			}
		}
		if (baseClass == PackageableElement.class) {
			switch (derivedFeatureID) {
				default :
					return -1;
			}
		}
		if (baseClass == TemplateableElement.class) {
			switch (derivedFeatureID) {
				case UMLPackage.PACKAGE__TEMPLATE_BINDING :
					return UMLPackage.TEMPLATEABLE_ELEMENT__TEMPLATE_BINDING;
				case UMLPackage.PACKAGE__OWNED_TEMPLATE_SIGNATURE :
					return UMLPackage.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE;
				default :
					return -1;
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
				case UMLPackage.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER :
					return UMLPackage.PACKAGE__TEMPLATE_PARAMETER;
				case UMLPackage.PARAMETERABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER :
					return UMLPackage.PACKAGE__OWNING_TEMPLATE_PARAMETER;
				default :
					return -1;
			}
		}
		if (baseClass == PackageableElement.class) {
			switch (baseFeatureID) {
				default :
					return -1;
			}
		}
		if (baseClass == TemplateableElement.class) {
			switch (baseFeatureID) {
				case UMLPackage.TEMPLATEABLE_ELEMENT__TEMPLATE_BINDING :
					return UMLPackage.PACKAGE__TEMPLATE_BINDING;
				case UMLPackage.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE :
					return UMLPackage.PACKAGE__OWNED_TEMPLATE_SIGNATURE;
				default :
					return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (visibility: "); //$NON-NLS-1$
		result.append(eVirtualGet(UMLPackage.PACKAGE__VISIBILITY,
			VISIBILITY_EDEFAULT));
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getOwner() {
		TemplateParameter owningTemplateParameter = getOwningTemplateParameter();
		if (owningTemplateParameter != null) {
			return owningTemplateParameter;
		}
		return super.getOwner();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwner() {
		return super.isSetOwner()
			|| eIsSet(UMLPackage.PACKAGE__OWNING_TEMPLATE_PARAMETER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| eIsSet(UMLPackage.PACKAGE__TEMPLATE_BINDING)
			|| eIsSet(UMLPackage.PACKAGE__OWNED_TEMPLATE_SIGNATURE)
			|| eIsSet(UMLPackage.PACKAGE__PACKAGE_MERGE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedMembers() {
		return super.isSetOwnedMembers()
			|| eIsSet(UMLPackage.PACKAGE__PACKAGED_ELEMENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace basicGetNamespace() {
		org.eclipse.uml2.uml.Package nestingPackage = basicGetNestingPackage();
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
	public boolean isSetNamespace() {
		return super.isSetNamespace()
			|| eIsSet(UMLPackage.PACKAGE__NESTING_PACKAGE);
	}

} //PackageImpl
