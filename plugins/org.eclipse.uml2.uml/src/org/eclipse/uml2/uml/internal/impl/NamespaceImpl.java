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
 * $Id: NamespaceImpl.java,v 1.6 2005/11/23 20:01:20 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.ElementImport;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.PackageImport;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.NamespaceOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Namespace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.NamespaceImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.NamespaceImpl#getOwnedMembers <em>Owned Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.NamespaceImpl#getMembers <em>Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.NamespaceImpl#getElementImports <em>Element Import</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.NamespaceImpl#getPackageImports <em>Package Import</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.NamespaceImpl#getOwnedRules <em>Owned Rule</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.NamespaceImpl#getImportedMembers <em>Imported Member</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class NamespaceImpl
		extends NamedElementImpl
		implements Namespace {

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
	protected EClass eStaticClass() {
		return UMLPackage.Literals.NAMESPACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getOwnedElements() {
		List ownedElement = (List) eVirtualGet(UMLPackage.NAMESPACE__OWNED_ELEMENT);
		if (ownedElement == null) {
			eVirtualSet(UMLPackage.NAMESPACE__OWNED_ELEMENT,
				ownedElement = new DerivedUnionEObjectEList(Element.class,
					this, UMLPackage.NAMESPACE__OWNED_ELEMENT, new int[]{
						UMLPackage.NAMESPACE__OWNED_COMMENT,
						UMLPackage.NAMESPACE__NAME_EXPRESSION,
						UMLPackage.NAMESPACE__ELEMENT_IMPORT,
						UMLPackage.NAMESPACE__PACKAGE_IMPORT,
						UMLPackage.NAMESPACE__OWNED_MEMBER}));
		}
		return ownedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getOwnedMembers() {
		List ownedMember = (List) eVirtualGet(UMLPackage.NAMESPACE__OWNED_MEMBER);
		if (ownedMember == null) {
			eVirtualSet(UMLPackage.NAMESPACE__OWNED_MEMBER,
				ownedMember = new DerivedUnionEObjectEList(NamedElement.class,
					this, UMLPackage.NAMESPACE__OWNED_MEMBER,
					new int[]{UMLPackage.NAMESPACE__OWNED_RULE}));
		}
		return ownedMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement getOwnedMember(String name) {
		for (Iterator i = getOwnedMembers().iterator(); i.hasNext();) {
			NamedElement ownedMember = (NamedElement) i.next();
			if (name.equals(ownedMember.getName())) {
				return ownedMember;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getMembers() {
		List member = (List) eVirtualGet(UMLPackage.NAMESPACE__MEMBER);
		if (member == null) {
			eVirtualSet(UMLPackage.NAMESPACE__MEMBER,
				member = new DerivedUnionEObjectEList(NamedElement.class, this,
					UMLPackage.NAMESPACE__MEMBER, new int[]{
						UMLPackage.NAMESPACE__IMPORTED_MEMBER,
						UMLPackage.NAMESPACE__OWNED_MEMBER}));
		}
		return member;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement getMember(String name) {
		for (Iterator i = getMembers().iterator(); i.hasNext();) {
			NamedElement member = (NamedElement) i.next();
			if (name.equals(member.getName())) {
				return member;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getElementImports() {
		List elementImport = (List) eVirtualGet(UMLPackage.NAMESPACE__ELEMENT_IMPORT);
		if (elementImport == null) {
			eVirtualSet(UMLPackage.NAMESPACE__ELEMENT_IMPORT,
				elementImport = new EObjectContainmentWithInverseEList(
					ElementImport.class, this,
					UMLPackage.NAMESPACE__ELEMENT_IMPORT,
					UMLPackage.ELEMENT_IMPORT__IMPORTING_NAMESPACE));
		}
		return elementImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementImport createElementImport() {
		ElementImport newElementImport = UMLFactory.eINSTANCE
			.createElementImport();
		getElementImports().add(newElementImport);
		return newElementImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getPackageImports() {
		List packageImport = (List) eVirtualGet(UMLPackage.NAMESPACE__PACKAGE_IMPORT);
		if (packageImport == null) {
			eVirtualSet(UMLPackage.NAMESPACE__PACKAGE_IMPORT,
				packageImport = new EObjectContainmentWithInverseEList(
					PackageImport.class, this,
					UMLPackage.NAMESPACE__PACKAGE_IMPORT,
					UMLPackage.PACKAGE_IMPORT__IMPORTING_NAMESPACE));
		}
		return packageImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageImport createPackageImport(EClass eClass) {
		PackageImport newPackageImport = (PackageImport) eClass.getEPackage()
			.getEFactoryInstance().create(eClass);
		getPackageImports().add(newPackageImport);
		return newPackageImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageImport createPackageImport() {
		PackageImport newPackageImport = UMLFactory.eINSTANCE
			.createPackageImport();
		getPackageImports().add(newPackageImport);
		return newPackageImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getOwnedRules() {
		List ownedRule = (List) eVirtualGet(UMLPackage.NAMESPACE__OWNED_RULE);
		if (ownedRule == null) {
			eVirtualSet(UMLPackage.NAMESPACE__OWNED_RULE,
				ownedRule = new EObjectContainmentWithInverseEList(
					Constraint.class, this, UMLPackage.NAMESPACE__OWNED_RULE,
					UMLPackage.CONSTRAINT__CONTEXT));
		}
		return ownedRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint createOwnedRule(EClass eClass) {
		Constraint newOwnedRule = (Constraint) eClass.getEPackage()
			.getEFactoryInstance().create(eClass);
		getOwnedRules().add(newOwnedRule);
		return newOwnedRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint createOwnedRule() {
		Constraint newOwnedRule = UMLFactory.eINSTANCE.createConstraint();
		getOwnedRules().add(newOwnedRule);
		return newOwnedRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint getOwnedRule(String name) {
		for (Iterator i = getOwnedRules().iterator(); i.hasNext();) {
			Constraint ownedRule = (Constraint) i.next();
			if (name.equals(ownedRule.getName())) {
				return ownedRule;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getImportedMembers() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			List result = (List) cache.get(this,
				UMLPackage.Literals.NAMESPACE__IMPORTED_MEMBER);
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
		for (Iterator i = getImportedMembers().iterator(); i.hasNext();) {
			PackageableElement importedMember = (PackageableElement) i.next();
			if (name.equals(importedMember.getName())) {
				return importedMember;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMembersDistinguishable(DiagnosticChain diagnostics,
			Map context) {
		return NamespaceOperations.validateMembersDistinguishable(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getNamesOfMember(NamedElement element) {
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
	public List importMembers(List imps) {
		return NamespaceOperations.importMembers(this, imps);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List excludeCollisions(List imps) {
		return NamespaceOperations.excludeCollisions(this, imps);
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
				case UMLPackage.NAMESPACE__EANNOTATIONS :
					return ((InternalEList) getEAnnotations()).basicAdd(
						otherEnd, msgs);
				case UMLPackage.NAMESPACE__CLIENT_DEPENDENCY :
					return ((InternalEList) getClientDependencies()).basicAdd(
						otherEnd, msgs);
				case UMLPackage.NAMESPACE__ELEMENT_IMPORT :
					return ((InternalEList) getElementImports()).basicAdd(
						otherEnd, msgs);
				case UMLPackage.NAMESPACE__PACKAGE_IMPORT :
					return ((InternalEList) getPackageImports()).basicAdd(
						otherEnd, msgs);
				case UMLPackage.NAMESPACE__OWNED_RULE :
					return ((InternalEList) getOwnedRules()).basicAdd(otherEnd,
						msgs);
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
				case UMLPackage.NAMESPACE__EANNOTATIONS :
					return ((InternalEList) getEAnnotations()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.NAMESPACE__OWNED_COMMENT :
					return ((InternalEList) getOwnedComments()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.NAMESPACE__CLIENT_DEPENDENCY :
					return ((InternalEList) getClientDependencies())
						.basicRemove(otherEnd, msgs);
				case UMLPackage.NAMESPACE__NAME_EXPRESSION :
					return basicSetNameExpression(null, msgs);
				case UMLPackage.NAMESPACE__ELEMENT_IMPORT :
					return ((InternalEList) getElementImports()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.NAMESPACE__PACKAGE_IMPORT :
					return ((InternalEList) getPackageImports()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.NAMESPACE__OWNED_RULE :
					return ((InternalEList) getOwnedRules()).basicRemove(
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.NAMESPACE__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.NAMESPACE__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.NAMESPACE__OWNER :
				return getOwner();
			case UMLPackage.NAMESPACE__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.NAMESPACE__NAME :
				return getName();
			case UMLPackage.NAMESPACE__VISIBILITY :
				return getVisibility();
			case UMLPackage.NAMESPACE__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.NAMESPACE__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.NAMESPACE__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.NAMESPACE__NAME_EXPRESSION :
				return getNameExpression();
			case UMLPackage.NAMESPACE__ELEMENT_IMPORT :
				return getElementImports();
			case UMLPackage.NAMESPACE__PACKAGE_IMPORT :
				return getPackageImports();
			case UMLPackage.NAMESPACE__OWNED_RULE :
				return getOwnedRules();
			case UMLPackage.NAMESPACE__MEMBER :
				return getMembers();
			case UMLPackage.NAMESPACE__IMPORTED_MEMBER :
				return getImportedMembers();
			case UMLPackage.NAMESPACE__OWNED_MEMBER :
				return getOwnedMembers();
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
			case UMLPackage.NAMESPACE__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.NAMESPACE__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.NAMESPACE__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.NAMESPACE__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.NAMESPACE__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.NAMESPACE__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.NAMESPACE__ELEMENT_IMPORT :
				getElementImports().clear();
				getElementImports().addAll((Collection) newValue);
				return;
			case UMLPackage.NAMESPACE__PACKAGE_IMPORT :
				getPackageImports().clear();
				getPackageImports().addAll((Collection) newValue);
				return;
			case UMLPackage.NAMESPACE__OWNED_RULE :
				getOwnedRules().clear();
				getOwnedRules().addAll((Collection) newValue);
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
			case UMLPackage.NAMESPACE__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.NAMESPACE__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.NAMESPACE__NAME :
				setName(NAME_EDEFAULT);
				return;
			case UMLPackage.NAMESPACE__VISIBILITY :
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UMLPackage.NAMESPACE__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.NAMESPACE__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.NAMESPACE__ELEMENT_IMPORT :
				getElementImports().clear();
				return;
			case UMLPackage.NAMESPACE__PACKAGE_IMPORT :
				getPackageImports().clear();
				return;
			case UMLPackage.NAMESPACE__OWNED_RULE :
				getOwnedRules().clear();
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
			case UMLPackage.NAMESPACE__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.NAMESPACE__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.NAMESPACE__OWNER :
				return isSetOwner();
			case UMLPackage.NAMESPACE__OWNED_COMMENT :
				List ownedComment = (List) eVirtualGet(UMLPackage.NAMESPACE__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.NAMESPACE__NAME :
				String name = (String) eVirtualGet(UMLPackage.NAMESPACE__NAME,
					NAME_EDEFAULT);
				return NAME_EDEFAULT == null
					? name != null
					: !NAME_EDEFAULT.equals(name);
			case UMLPackage.NAMESPACE__VISIBILITY :
				return eVirtualGet(UMLPackage.NAMESPACE__VISIBILITY,
					VISIBILITY_EDEFAULT) != VISIBILITY_EDEFAULT;
			case UMLPackage.NAMESPACE__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.NAMESPACE__CLIENT_DEPENDENCY :
				List clientDependency = (List) eVirtualGet(UMLPackage.NAMESPACE__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.NAMESPACE__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.NAMESPACE__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.NAMESPACE__NAME_EXPRESSION) != null;
			case UMLPackage.NAMESPACE__ELEMENT_IMPORT :
				List elementImport = (List) eVirtualGet(UMLPackage.NAMESPACE__ELEMENT_IMPORT);
				return elementImport != null && !elementImport.isEmpty();
			case UMLPackage.NAMESPACE__PACKAGE_IMPORT :
				List packageImport = (List) eVirtualGet(UMLPackage.NAMESPACE__PACKAGE_IMPORT);
				return packageImport != null && !packageImport.isEmpty();
			case UMLPackage.NAMESPACE__OWNED_RULE :
				List ownedRule = (List) eVirtualGet(UMLPackage.NAMESPACE__OWNED_RULE);
				return ownedRule != null && !ownedRule.isEmpty();
			case UMLPackage.NAMESPACE__MEMBER :
				return isSetMembers();
			case UMLPackage.NAMESPACE__IMPORTED_MEMBER :
				return !getImportedMembers().isEmpty();
			case UMLPackage.NAMESPACE__OWNED_MEMBER :
				return isSetOwnedMembers();
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| eIsSet(UMLPackage.NAMESPACE__ELEMENT_IMPORT)
			|| eIsSet(UMLPackage.NAMESPACE__PACKAGE_IMPORT)
			|| isSetOwnedMembers();
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
		return eIsSet(UMLPackage.NAMESPACE__IMPORTED_MEMBER)
			|| isSetOwnedMembers();
	}

} //NamespaceImpl
