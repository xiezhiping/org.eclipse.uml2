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
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.ElementImport;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.PackageImport;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.NamespaceOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Namespace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.NamespaceImpl#getOwnedMembers <em>Owned Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.NamespaceImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.NamespaceImpl#getMembers <em>Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.NamespaceImpl#getOwnedRules <em>Owned Rule</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.NamespaceImpl#getElementImports <em>Element Import</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.NamespaceImpl#getPackageImports <em>Package Import</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.NamespaceImpl#getImportedMembers <em>Imported Member</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class NamespaceImpl
		extends NamedElementImpl
		implements Namespace {

	/**
	 * The cached value of the '{@link #getOwnedRules() <em>Owned Rule</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedRules()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> ownedRules;

	/**
	 * The cached value of the '{@link #getElementImports() <em>Element Import</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementImports()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementImport> elementImports;

	/**
	 * The cached value of the '{@link #getPackageImports() <em>Package Import</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageImports()
	 * @generated
	 * @ordered
	 */
	protected EList<PackageImport> packageImports;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NamespaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.NAMESPACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Element> getOwnedElements() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			@SuppressWarnings("unchecked")
			EList<Element> ownedElements = (EList<Element>) cache.get(eResource,
				this, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
			if (ownedElements == null) {
				cache.put(eResource, this,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT,
					ownedElements = new DerivedUnionEObjectEList<Element>(
						Element.class, this,
						UMLPackage.NAMESPACE__OWNED_ELEMENT,
						OWNED_ELEMENT_ESUBSETS));
			}
			return ownedElements;
		}
		return new DerivedUnionEObjectEList<Element>(Element.class, this,
			UMLPackage.NAMESPACE__OWNED_ELEMENT, OWNED_ELEMENT_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<NamedElement> getOwnedMembers() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			@SuppressWarnings("unchecked")
			EList<NamedElement> ownedMembers = (EList<NamedElement>) cache.get(
				eResource, this, UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
			if (ownedMembers == null) {
				cache.put(eResource, this,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER,
					ownedMembers = new DerivedUnionEObjectEList<NamedElement>(
						NamedElement.class, this,
						UMLPackage.NAMESPACE__OWNED_MEMBER,
						OWNED_MEMBER_ESUBSETS));
			}
			return ownedMembers;
		}
		return new DerivedUnionEObjectEList<NamedElement>(NamedElement.class,
			this, UMLPackage.NAMESPACE__OWNED_MEMBER, OWNED_MEMBER_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NamedElement> getMembers() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			@SuppressWarnings("unchecked")
			EList<NamedElement> members = (EList<NamedElement>) cache
				.get(eResource, this, UMLPackage.Literals.NAMESPACE__MEMBER);
			if (members == null) {
				cache.put(eResource, this,
					UMLPackage.Literals.NAMESPACE__MEMBER,
					members = new DerivedUnionEObjectEList<NamedElement>(
						NamedElement.class, this, UMLPackage.NAMESPACE__MEMBER,
						MEMBER_ESUBSETS));
			}
			return members;
		}
		return new DerivedUnionEObjectEList<NamedElement>(NamedElement.class,
			this, UMLPackage.NAMESPACE__MEMBER, MEMBER_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElementImport> getElementImports() {
		if (elementImports == null) {
			elementImports = new EObjectContainmentWithInverseEList.Resolving<ElementImport>(
				ElementImport.class, this, UMLPackage.NAMESPACE__ELEMENT_IMPORT,
				UMLPackage.ELEMENT_IMPORT__IMPORTING_NAMESPACE);
		}
		return elementImports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementImport createElementImport(
			PackageableElement importedElement) {
		ElementImport newElementImport = (ElementImport) create(
			UMLPackage.Literals.ELEMENT_IMPORT);
		getElementImports().add(newElementImport);
		if (importedElement != null)
			newElementImport.setImportedElement(importedElement);
		return newElementImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementImport getElementImport(PackageableElement importedElement) {
		return getElementImport(importedElement, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementImport getElementImport(PackageableElement importedElement,
			boolean createOnDemand) {
		elementImportLoop : for (ElementImport elementImport : getElementImports()) {
			if (importedElement != null
				&& !importedElement.equals(elementImport.getImportedElement()))
				continue elementImportLoop;
			return elementImport;
		}
		return createOnDemand
			? createElementImport(importedElement)
			: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PackageImport> getPackageImports() {
		if (packageImports == null) {
			packageImports = new EObjectContainmentWithInverseEList.Resolving<PackageImport>(
				PackageImport.class, this, UMLPackage.NAMESPACE__PACKAGE_IMPORT,
				UMLPackage.PACKAGE_IMPORT__IMPORTING_NAMESPACE);
		}
		return packageImports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageImport createPackageImport(
			org.eclipse.uml2.uml.Package importedPackage) {
		PackageImport newPackageImport = (PackageImport) create(
			UMLPackage.Literals.PACKAGE_IMPORT);
		getPackageImports().add(newPackageImport);
		if (importedPackage != null)
			newPackageImport.setImportedPackage(importedPackage);
		return newPackageImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageImport getPackageImport(
			org.eclipse.uml2.uml.Package importedPackage) {
		return getPackageImport(importedPackage, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageImport getPackageImport(
			org.eclipse.uml2.uml.Package importedPackage,
			boolean createOnDemand) {
		packageImportLoop : for (PackageImport packageImport : getPackageImports()) {
			if (importedPackage != null
				&& !importedPackage.equals(packageImport.getImportedPackage()))
				continue packageImportLoop;
			return packageImport;
		}
		return createOnDemand
			? createPackageImport(importedPackage)
			: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getOwnedRules() {
		if (ownedRules == null) {
			ownedRules = new EObjectContainmentWithInverseEList.Resolving<Constraint>(
				Constraint.class, this, UMLPackage.NAMESPACE__OWNED_RULE,
				UMLPackage.CONSTRAINT__CONTEXT);
		}
		return ownedRules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint createOwnedRule(String name, EClass eClass) {
		Constraint newOwnedRule = (Constraint) create(eClass);
		getOwnedRules().add(newOwnedRule);
		if (name != null)
			newOwnedRule.setName(name);
		return newOwnedRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint createOwnedRule(String name) {
		return createOwnedRule(name, UMLPackage.Literals.CONSTRAINT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint getOwnedRule(String name) {
		return getOwnedRule(name, false, null, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint getOwnedRule(String name, boolean ignoreCase,
			EClass eClass, boolean createOnDemand) {
		ownedRuleLoop : for (Constraint ownedRule : getOwnedRules()) {
			if (eClass != null && !eClass.isInstance(ownedRule))
				continue ownedRuleLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(ownedRule.getName())
				: name.equals(ownedRule.getName())))
				continue ownedRuleLoop;
			return ownedRule;
		}
		return createOnDemand && eClass != null
			? createOwnedRule(name, eClass)
			: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PackageableElement> getImportedMembers() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			@SuppressWarnings("unchecked")
			EList<PackageableElement> result = (EList<PackageableElement>) cache
				.get(this, UMLPackage.Literals.NAMESPACE__IMPORTED_MEMBER);
			if (result == null) {
				cache.put(this, UMLPackage.Literals.NAMESPACE__IMPORTED_MEMBER,
					result = NamespaceOperations.getImportedMembers(this));
			}
			return result;
		}
		return NamespaceOperations.getImportedMembers(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageableElement getImportedMember(String name) {
		return getImportedMember(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageableElement getImportedMember(String name, boolean ignoreCase,
			EClass eClass) {
		importedMemberLoop : for (PackageableElement importedMember : getImportedMembers()) {
			if (eClass != null && !eClass.isInstance(importedMember))
				continue importedMemberLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(importedMember.getName())
				: name.equals(importedMember.getName())))
				continue importedMemberLoop;
			return importedMember;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMembersDistinguishable(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return NamespaceOperations.validateMembersDistinguishable(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCannotImportSelf(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return NamespaceOperations.validateCannotImportSelf(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCannotImportOwnedMembers(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return NamespaceOperations.validateCannotImportOwnedMembers(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementImport createElementImport(PackageableElement element,
			VisibilityKind visibility) {
		return NamespaceOperations.createElementImport(this, element,
			visibility);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageImport createPackageImport(
			org.eclipse.uml2.uml.Package package_, VisibilityKind visibility) {
		return NamespaceOperations.createPackageImport(this, package_,
			visibility);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PackageableElement> getImportedElements() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			@SuppressWarnings("unchecked")
			EList<PackageableElement> result = (EList<PackageableElement>) cache
				.get(this,
					UMLPackage.Literals.NAMESPACE___GET_IMPORTED_ELEMENTS);
			if (result == null) {
				cache.put(this,
					UMLPackage.Literals.NAMESPACE___GET_IMPORTED_ELEMENTS,
					result = NamespaceOperations.getImportedElements(this));
			}
			return result;
		}
		return NamespaceOperations.getImportedElements(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.eclipse.uml2.uml.Package> getImportedPackages() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			@SuppressWarnings("unchecked")
			EList<org.eclipse.uml2.uml.Package> result = (EList<org.eclipse.uml2.uml.Package>) cache
				.get(this,
					UMLPackage.Literals.NAMESPACE___GET_IMPORTED_PACKAGES);
			if (result == null) {
				cache.put(this,
					UMLPackage.Literals.NAMESPACE___GET_IMPORTED_PACKAGES,
					result = NamespaceOperations.getImportedPackages(this));
			}
			return result;
		}
		return NamespaceOperations.getImportedPackages(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getNamesOfMember(NamedElement element) {
		return NamespaceOperations.getNamesOfMember(this, element);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean membersAreDistinguishable() {
		return NamespaceOperations.membersAreDistinguishable(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PackageableElement> importMembers(
			EList<PackageableElement> imps) {
		return NamespaceOperations.importMembers(this, imps);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PackageableElement> excludeCollisions(
			EList<PackageableElement> imps) {
		return NamespaceOperations.excludeCollisions(this, imps);
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
			case UMLPackage.NAMESPACE__EANNOTATIONS :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getEAnnotations())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.NAMESPACE__OWNED_RULE :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getOwnedRules())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.NAMESPACE__ELEMENT_IMPORT :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getElementImports())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.NAMESPACE__PACKAGE_IMPORT :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getPackageImports())
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
			case UMLPackage.NAMESPACE__EANNOTATIONS :
				return ((InternalEList<?>) getEAnnotations())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.NAMESPACE__OWNED_COMMENT :
				return ((InternalEList<?>) getOwnedComments())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.NAMESPACE__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.NAMESPACE__OWNED_RULE :
				return ((InternalEList<?>) getOwnedRules())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.NAMESPACE__ELEMENT_IMPORT :
				return ((InternalEList<?>) getElementImports())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.NAMESPACE__PACKAGE_IMPORT :
				return ((InternalEList<?>) getPackageImports())
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
			case UMLPackage.NAMESPACE__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.NAMESPACE__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.NAMESPACE__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.NAMESPACE__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.NAMESPACE__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.NAMESPACE__NAME :
				return getName();
			case UMLPackage.NAMESPACE__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.NAMESPACE__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.NAMESPACE__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.NAMESPACE__VISIBILITY :
				return getVisibility();
			case UMLPackage.NAMESPACE__OWNED_RULE :
				return getOwnedRules();
			case UMLPackage.NAMESPACE__ELEMENT_IMPORT :
				return getElementImports();
			case UMLPackage.NAMESPACE__PACKAGE_IMPORT :
				return getPackageImports();
			case UMLPackage.NAMESPACE__OWNED_MEMBER :
				return getOwnedMembers();
			case UMLPackage.NAMESPACE__IMPORTED_MEMBER :
				return getImportedMembers();
			case UMLPackage.NAMESPACE__MEMBER :
				return getMembers();
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
			case UMLPackage.NAMESPACE__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations()
					.addAll((Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.NAMESPACE__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments()
					.addAll((Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.NAMESPACE__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.NAMESPACE__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.NAMESPACE__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.NAMESPACE__OWNED_RULE :
				getOwnedRules().clear();
				getOwnedRules()
					.addAll((Collection<? extends Constraint>) newValue);
				return;
			case UMLPackage.NAMESPACE__ELEMENT_IMPORT :
				getElementImports().clear();
				getElementImports()
					.addAll((Collection<? extends ElementImport>) newValue);
				return;
			case UMLPackage.NAMESPACE__PACKAGE_IMPORT :
				getPackageImports().clear();
				getPackageImports()
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
			case UMLPackage.NAMESPACE__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.NAMESPACE__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.NAMESPACE__NAME :
				unsetName();
				return;
			case UMLPackage.NAMESPACE__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.NAMESPACE__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.NAMESPACE__OWNED_RULE :
				getOwnedRules().clear();
				return;
			case UMLPackage.NAMESPACE__ELEMENT_IMPORT :
				getElementImports().clear();
				return;
			case UMLPackage.NAMESPACE__PACKAGE_IMPORT :
				getPackageImports().clear();
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
			case UMLPackage.NAMESPACE__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.NAMESPACE__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.NAMESPACE__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.NAMESPACE__OWNER :
				return isSetOwner();
			case UMLPackage.NAMESPACE__CLIENT_DEPENDENCY :
				return !getClientDependencies().isEmpty();
			case UMLPackage.NAMESPACE__NAME :
				return isSetName();
			case UMLPackage.NAMESPACE__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.NAMESPACE__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.NAMESPACE__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.NAMESPACE__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.NAMESPACE__OWNED_RULE :
				return ownedRules != null && !ownedRules.isEmpty();
			case UMLPackage.NAMESPACE__ELEMENT_IMPORT :
				return elementImports != null && !elementImports.isEmpty();
			case UMLPackage.NAMESPACE__PACKAGE_IMPORT :
				return packageImports != null && !packageImports.isEmpty();
			case UMLPackage.NAMESPACE__OWNED_MEMBER :
				return isSetOwnedMembers();
			case UMLPackage.NAMESPACE__IMPORTED_MEMBER :
				return !getImportedMembers().isEmpty();
			case UMLPackage.NAMESPACE__MEMBER :
				return isSetMembers();
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
			case UMLPackage.NAMESPACE___GET_EANNOTATION__STRING :
				return getEAnnotation((String) arguments.get(0));
			case UMLPackage.NAMESPACE___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP :
				return validateHasOwner((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.NAMESPACE___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP :
				return validateNotOwnSelf((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.NAMESPACE___ADD_KEYWORD__STRING :
				return addKeyword((String) arguments.get(0));
			case UMLPackage.NAMESPACE___APPLY_STEREOTYPE__STEREOTYPE :
				return applyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.NAMESPACE___CREATE_EANNOTATION__STRING :
				return createEAnnotation((String) arguments.get(0));
			case UMLPackage.NAMESPACE___DESTROY :
				destroy();
				return null;
			case UMLPackage.NAMESPACE___GET_KEYWORDS :
				return getKeywords();
			case UMLPackage.NAMESPACE___GET_APPLICABLE_STEREOTYPE__STRING :
				return getApplicableStereotype((String) arguments.get(0));
			case UMLPackage.NAMESPACE___GET_APPLICABLE_STEREOTYPES :
				return getApplicableStereotypes();
			case UMLPackage.NAMESPACE___GET_APPLIED_STEREOTYPE__STRING :
				return getAppliedStereotype((String) arguments.get(0));
			case UMLPackage.NAMESPACE___GET_APPLIED_STEREOTYPES :
				return getAppliedStereotypes();
			case UMLPackage.NAMESPACE___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING :
				return getAppliedSubstereotype((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.NAMESPACE___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE :
				return getAppliedSubstereotypes((Stereotype) arguments.get(0));
			case UMLPackage.NAMESPACE___GET_MODEL :
				return getModel();
			case UMLPackage.NAMESPACE___GET_NEAREST_PACKAGE :
				return getNearestPackage();
			case UMLPackage.NAMESPACE___GET_RELATIONSHIPS :
				return getRelationships();
			case UMLPackage.NAMESPACE___GET_RELATIONSHIPS__ECLASS :
				return getRelationships((EClass) arguments.get(0));
			case UMLPackage.NAMESPACE___GET_REQUIRED_STEREOTYPE__STRING :
				return getRequiredStereotype((String) arguments.get(0));
			case UMLPackage.NAMESPACE___GET_REQUIRED_STEREOTYPES :
				return getRequiredStereotypes();
			case UMLPackage.NAMESPACE___GET_SOURCE_DIRECTED_RELATIONSHIPS :
				return getSourceDirectedRelationships();
			case UMLPackage.NAMESPACE___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS :
				return getSourceDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.NAMESPACE___GET_STEREOTYPE_APPLICATION__STEREOTYPE :
				return getStereotypeApplication((Stereotype) arguments.get(0));
			case UMLPackage.NAMESPACE___GET_STEREOTYPE_APPLICATIONS :
				return getStereotypeApplications();
			case UMLPackage.NAMESPACE___GET_TARGET_DIRECTED_RELATIONSHIPS :
				return getTargetDirectedRelationships();
			case UMLPackage.NAMESPACE___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS :
				return getTargetDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.NAMESPACE___GET_VALUE__STEREOTYPE_STRING :
				return getValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.NAMESPACE___HAS_KEYWORD__STRING :
				return hasKeyword((String) arguments.get(0));
			case UMLPackage.NAMESPACE___HAS_VALUE__STEREOTYPE_STRING :
				return hasValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.NAMESPACE___IS_STEREOTYPE_APPLICABLE__STEREOTYPE :
				return isStereotypeApplicable((Stereotype) arguments.get(0));
			case UMLPackage.NAMESPACE___IS_STEREOTYPE_APPLIED__STEREOTYPE :
				return isStereotypeApplied((Stereotype) arguments.get(0));
			case UMLPackage.NAMESPACE___IS_STEREOTYPE_REQUIRED__STEREOTYPE :
				return isStereotypeRequired((Stereotype) arguments.get(0));
			case UMLPackage.NAMESPACE___REMOVE_KEYWORD__STRING :
				return removeKeyword((String) arguments.get(0));
			case UMLPackage.NAMESPACE___SET_VALUE__STEREOTYPE_STRING_OBJECT :
				setValue((Stereotype) arguments.get(0),
					(String) arguments.get(1), arguments.get(2));
				return null;
			case UMLPackage.NAMESPACE___UNAPPLY_STEREOTYPE__STEREOTYPE :
				return unapplyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.NAMESPACE___ALL_OWNED_ELEMENTS :
				return allOwnedElements();
			case UMLPackage.NAMESPACE___MUST_BE_OWNED :
				return mustBeOwned();
			case UMLPackage.NAMESPACE___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP :
				return validateVisibilityNeedsOwnership(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.NAMESPACE___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.NAMESPACE___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasNoQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.NAMESPACE___CREATE_DEPENDENCY__NAMEDELEMENT :
				return createDependency((NamedElement) arguments.get(0));
			case UMLPackage.NAMESPACE___CREATE_USAGE__NAMEDELEMENT :
				return createUsage((NamedElement) arguments.get(0));
			case UMLPackage.NAMESPACE___GET_LABEL :
				return getLabel();
			case UMLPackage.NAMESPACE___GET_LABEL__BOOLEAN :
				return getLabel((Boolean) arguments.get(0));
			case UMLPackage.NAMESPACE___GET_NAMESPACE :
				return getNamespace();
			case UMLPackage.NAMESPACE___ALL_NAMESPACES :
				return allNamespaces();
			case UMLPackage.NAMESPACE___ALL_OWNING_PACKAGES :
				return allOwningPackages();
			case UMLPackage.NAMESPACE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE :
				return isDistinguishableFrom((NamedElement) arguments.get(0),
					(Namespace) arguments.get(1));
			case UMLPackage.NAMESPACE___GET_QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.NAMESPACE___SEPARATOR :
				return separator();
			case UMLPackage.NAMESPACE___GET_CLIENT_DEPENDENCIES :
				return getClientDependencies();
			case UMLPackage.NAMESPACE___VALIDATE_MEMBERS_DISTINGUISHABLE__DIAGNOSTICCHAIN_MAP :
				return validateMembersDistinguishable(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.NAMESPACE___VALIDATE_CANNOT_IMPORT_SELF__DIAGNOSTICCHAIN_MAP :
				return validateCannotImportSelf(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.NAMESPACE___VALIDATE_CANNOT_IMPORT_OWNED_MEMBERS__DIAGNOSTICCHAIN_MAP :
				return validateCannotImportOwnedMembers(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.NAMESPACE___CREATE_ELEMENT_IMPORT__PACKAGEABLEELEMENT_VISIBILITYKIND :
				return createElementImport(
					(PackageableElement) arguments.get(0),
					(VisibilityKind) arguments.get(1));
			case UMLPackage.NAMESPACE___CREATE_PACKAGE_IMPORT__PACKAGE_VISIBILITYKIND :
				return createPackageImport(
					(org.eclipse.uml2.uml.Package) arguments.get(0),
					(VisibilityKind) arguments.get(1));
			case UMLPackage.NAMESPACE___GET_IMPORTED_ELEMENTS :
				return getImportedElements();
			case UMLPackage.NAMESPACE___GET_IMPORTED_PACKAGES :
				return getImportedPackages();
			case UMLPackage.NAMESPACE___GET_OWNED_MEMBERS :
				return getOwnedMembers();
			case UMLPackage.NAMESPACE___EXCLUDE_COLLISIONS__ELIST :
				return excludeCollisions(
					(EList<PackageableElement>) arguments.get(0));
			case UMLPackage.NAMESPACE___GET_NAMES_OF_MEMBER__NAMEDELEMENT :
				return getNamesOfMember((NamedElement) arguments.get(0));
			case UMLPackage.NAMESPACE___IMPORT_MEMBERS__ELIST :
				return importMembers(
					(EList<PackageableElement>) arguments.get(0));
			case UMLPackage.NAMESPACE___GET_IMPORTED_MEMBERS :
				return getImportedMembers();
			case UMLPackage.NAMESPACE___MEMBERS_ARE_DISTINGUISHABLE :
				return membersAreDistinguishable();
		}
		return eDynamicInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| eIsSet(UMLPackage.NAMESPACE__ELEMENT_IMPORT)
			|| eIsSet(UMLPackage.NAMESPACE__PACKAGE_IMPORT)
			|| isSetOwnedMembers();
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getOwnedMembers() <em>Owned Member</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedMembers()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_MEMBER_ESUBSETS = new int[]{
		UMLPackage.NAMESPACE__OWNED_RULE};

	/**
	 * The array of subset feature identifiers for the '{@link #getOwnedElements() <em>Owned Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedElements()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_ELEMENT_ESUBSETS = new int[]{
		UMLPackage.NAMESPACE__OWNED_COMMENT,
		UMLPackage.NAMESPACE__NAME_EXPRESSION,
		UMLPackage.NAMESPACE__ELEMENT_IMPORT,
		UMLPackage.NAMESPACE__PACKAGE_IMPORT,
		UMLPackage.NAMESPACE__OWNED_MEMBER};

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
	public NamedElement getOwnedMember(String name, boolean ignoreCase,
			EClass eClass) {
		ownedMemberLoop : for (NamedElement ownedMember : getOwnedMembers()) {
			if (eClass != null && !eClass.isInstance(ownedMember))
				continue ownedMemberLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(ownedMember.getName())
				: name.equals(ownedMember.getName())))
				continue ownedMemberLoop;
			return ownedMember;
		}
		return null;
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getMembers() <em>Member</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMembers()
	 * @generated
	 * @ordered
	 */
	protected static final int[] MEMBER_ESUBSETS = new int[]{
		UMLPackage.NAMESPACE__OWNED_MEMBER,
		UMLPackage.NAMESPACE__IMPORTED_MEMBER};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement getMember(String name) {
		return getMember(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement getMember(String name, boolean ignoreCase,
			EClass eClass) {
		memberLoop : for (NamedElement member : getMembers()) {
			if (eClass != null && !eClass.isInstance(member))
				continue memberLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(member.getName())
				: name.equals(member.getName())))
				continue memberLoop;
			return member;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedMembers() {
		return eIsSet(UMLPackage.NAMESPACE__OWNED_RULE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMembers() {
		return isSetOwnedMembers()
			|| eIsSet(UMLPackage.NAMESPACE__IMPORTED_MEMBER);
	}

} //NamespaceImpl
