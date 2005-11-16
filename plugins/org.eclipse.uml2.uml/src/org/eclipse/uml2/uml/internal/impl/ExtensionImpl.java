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
 * $Id: ExtensionImpl.java,v 1.2 2005/11/16 19:03:04 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.uml2.common.util.SubsetEObjectEList;

import org.eclipse.uml2.uml.Extension;
import org.eclipse.uml2.uml.ExtensionEnd;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.UMLPackage;

import org.eclipse.uml2.uml.internal.operations.ExtensionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extension</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ExtensionImpl#getOwnedEnds <em>Owned End</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ExtensionImpl#isRequired <em>Is Required</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ExtensionImpl#getMetaclass <em>Metaclass</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExtensionImpl
		extends AssociationImpl
		implements Extension {

	/**
	 * The default value of the '{@link #isRequired() <em>Is Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequired()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_REQUIRED_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtensionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.eINSTANCE.getExtension();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getOwnedEnds() {
		List ownedEnd = (List) eVirtualGet(UMLPackage.EXTENSION__OWNED_END);
		if (ownedEnd == null) {
			eVirtualSet(UMLPackage.EXTENSION__OWNED_END,
				ownedEnd = new SubsetEObjectEList(ExtensionEnd.class, this,
					UMLPackage.EXTENSION__OWNED_END,
					new int[]{UMLPackage.EXTENSION__OWNED_END}));
		}
		return ownedEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getOwnedEnd(String name) {
		for (Iterator i = getOwnedEnds().iterator(); i.hasNext();) {
			ExtensionEnd ownedEnd = (ExtensionEnd) i.next();
			if (name.equals(ownedEnd.getName())) {
				return ownedEnd;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedEnds() {
		List ownedEnd = (List) eVirtualGet(UMLPackage.EXTENSION__OWNED_END);
		return ownedEnd != null && !ownedEnd.isEmpty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRequired() {
		return ExtensionOperations.isRequired(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Class getMetaclass() {
		org.eclipse.uml2.uml.Class metaclass = basicGetMetaclass();
		return metaclass == null
			? null
			: (metaclass.eIsProxy()
				? (org.eclipse.uml2.uml.Class) eResolveProxy((InternalEObject) metaclass)
				: metaclass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Class basicGetMetaclass() {
		return ExtensionOperations.getMetaclass(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonOwnedEnd(DiagnosticChain diagnostics, Map context) {
		return ExtensionOperations.validateNonOwnedEnd(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIsBinary(DiagnosticChain diagnostics, Map context) {
		return ExtensionOperations.validateIsBinary(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property metaclassEnd() {
		return ExtensionOperations.metaclassEnd(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UMLPackage.EXTENSION__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.EXTENSION__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.EXTENSION__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.EXTENSION__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.EXTENSION__NAME :
				return getName();
			case UMLPackage.EXTENSION__VISIBILITY :
				return getVisibility();
			case UMLPackage.EXTENSION__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.EXTENSION__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.EXTENSION__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.EXTENSION__NAME_EXPRESSION :
				return getNameExpression();
			case UMLPackage.EXTENSION__ELEMENT_IMPORT :
				return getElementImports();
			case UMLPackage.EXTENSION__PACKAGE_IMPORT :
				return getPackageImports();
			case UMLPackage.EXTENSION__OWNED_RULE :
				return getOwnedRules();
			case UMLPackage.EXTENSION__MEMBER :
				return getMembers();
			case UMLPackage.EXTENSION__IMPORTED_MEMBER :
				return getImportedMembers();
			case UMLPackage.EXTENSION__OWNED_MEMBER :
				return getOwnedMembers();
			case UMLPackage.EXTENSION__IS_LEAF :
				return isLeaf()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.EXTENSION__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.EXTENSION__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.EXTENSION__TEMPLATE_PARAMETER :
				if (resolve)
					return getTemplateParameter();
				return basicGetTemplateParameter();
			case UMLPackage.EXTENSION__OWNING_TEMPLATE_PARAMETER :
				return getOwningTemplateParameter();
			case UMLPackage.EXTENSION__PACKAGE :
				return getPackage();
			case UMLPackage.EXTENSION__TEMPLATE_BINDING :
				return getTemplateBindings();
			case UMLPackage.EXTENSION__OWNED_TEMPLATE_SIGNATURE :
				return getOwnedTemplateSignature();
			case UMLPackage.EXTENSION__IS_ABSTRACT :
				return isAbstract()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.EXTENSION__GENERALIZATION :
				return getGeneralizations();
			case UMLPackage.EXTENSION__POWERTYPE_EXTENT :
				return getPowertypeExtents();
			case UMLPackage.EXTENSION__FEATURE :
				return getFeatures();
			case UMLPackage.EXTENSION__INHERITED_MEMBER :
				return getInheritedMembers();
			case UMLPackage.EXTENSION__REDEFINED_CLASSIFIER :
				return getRedefinedClassifiers();
			case UMLPackage.EXTENSION__GENERAL :
				return getGenerals();
			case UMLPackage.EXTENSION__OWNED_USE_CASE :
				return getOwnedUseCases();
			case UMLPackage.EXTENSION__USE_CASE :
				return getUseCases();
			case UMLPackage.EXTENSION__SUBSTITUTION :
				return getSubstitutions();
			case UMLPackage.EXTENSION__ATTRIBUTE :
				return getAttributes();
			case UMLPackage.EXTENSION__REPRESENTATION :
				return getRepresentation();
			case UMLPackage.EXTENSION__COLLABORATION_USE :
				return getCollaborationUses();
			case UMLPackage.EXTENSION__OWNED_SIGNATURE :
				return getOwnedSignature();
			case UMLPackage.EXTENSION__RELATED_ELEMENT :
				return getRelatedElements();
			case UMLPackage.EXTENSION__IS_DERIVED :
				return isDerived()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.EXTENSION__END_TYPE :
				return getEndTypes();
			case UMLPackage.EXTENSION__MEMBER_END :
				return getMemberEnds();
			case UMLPackage.EXTENSION__NAVIGABLE_OWNED_END :
				return getNavigableOwnedEnds();
			case UMLPackage.EXTENSION__OWNED_END :
				return getOwnedEnds();
			case UMLPackage.EXTENSION__IS_REQUIRED :
				return isRequired()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.EXTENSION__METACLASS :
				if (resolve)
					return getMetaclass();
				return basicGetMetaclass();
		}
		return eDynamicGet(eFeature, resolve);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UMLPackage.EXTENSION__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.EXTENSION__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.EXTENSION__OWNER :
				return isSetOwner();
			case UMLPackage.EXTENSION__OWNED_COMMENT :
				List ownedComment = (List) eVirtualGet(UMLPackage.EXTENSION__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.EXTENSION__NAME :
				String name = eVirtualIsSet(UMLPackage.EXTENSION__NAME)
					? (String) eVirtualGet(UMLPackage.EXTENSION__NAME)
					: NAME_EDEFAULT;
				return NAME_EDEFAULT == null
					? name != null
					: !NAME_EDEFAULT.equals(name);
			case UMLPackage.EXTENSION__VISIBILITY :
				return eVirtualIsSet(UMLPackage.EXTENSION__VISIBILITY)
					&& eVirtualGet(UMLPackage.EXTENSION__VISIBILITY) != VISIBILITY_EDEFAULT;
			case UMLPackage.EXTENSION__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.EXTENSION__CLIENT_DEPENDENCY :
				List clientDependency = (List) eVirtualGet(UMLPackage.EXTENSION__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.EXTENSION__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.EXTENSION__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.EXTENSION__NAME_EXPRESSION) != null;
			case UMLPackage.EXTENSION__ELEMENT_IMPORT :
				List elementImport = (List) eVirtualGet(UMLPackage.EXTENSION__ELEMENT_IMPORT);
				return elementImport != null && !elementImport.isEmpty();
			case UMLPackage.EXTENSION__PACKAGE_IMPORT :
				List packageImport = (List) eVirtualGet(UMLPackage.EXTENSION__PACKAGE_IMPORT);
				return packageImport != null && !packageImport.isEmpty();
			case UMLPackage.EXTENSION__OWNED_RULE :
				List ownedRule = (List) eVirtualGet(UMLPackage.EXTENSION__OWNED_RULE);
				return ownedRule != null && !ownedRule.isEmpty();
			case UMLPackage.EXTENSION__MEMBER :
				return isSetMembers();
			case UMLPackage.EXTENSION__IMPORTED_MEMBER :
				return !getImportedMembers().isEmpty();
			case UMLPackage.EXTENSION__OWNED_MEMBER :
				return isSetOwnedMembers();
			case UMLPackage.EXTENSION__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.EXTENSION__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.EXTENSION__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.EXTENSION__TEMPLATE_PARAMETER :
				return eVirtualGet(UMLPackage.EXTENSION__TEMPLATE_PARAMETER) != null;
			case UMLPackage.EXTENSION__OWNING_TEMPLATE_PARAMETER :
				return getOwningTemplateParameter() != null;
			case UMLPackage.EXTENSION__PACKAGE :
				return getPackage() != null;
			case UMLPackage.EXTENSION__TEMPLATE_BINDING :
				List templateBinding = (List) eVirtualGet(UMLPackage.EXTENSION__TEMPLATE_BINDING);
				return templateBinding != null && !templateBinding.isEmpty();
			case UMLPackage.EXTENSION__OWNED_TEMPLATE_SIGNATURE :
				return eVirtualGet(UMLPackage.EXTENSION__OWNED_TEMPLATE_SIGNATURE) != null;
			case UMLPackage.EXTENSION__IS_ABSTRACT :
				return ((eFlags & IS_ABSTRACT_EFLAG) != 0) != IS_ABSTRACT_EDEFAULT;
			case UMLPackage.EXTENSION__GENERALIZATION :
				List generalization = (List) eVirtualGet(UMLPackage.EXTENSION__GENERALIZATION);
				return generalization != null && !generalization.isEmpty();
			case UMLPackage.EXTENSION__POWERTYPE_EXTENT :
				List powertypeExtent = (List) eVirtualGet(UMLPackage.EXTENSION__POWERTYPE_EXTENT);
				return powertypeExtent != null && !powertypeExtent.isEmpty();
			case UMLPackage.EXTENSION__FEATURE :
				return isSetFeatures();
			case UMLPackage.EXTENSION__INHERITED_MEMBER :
				return !getInheritedMembers().isEmpty();
			case UMLPackage.EXTENSION__REDEFINED_CLASSIFIER :
				List redefinedClassifier = (List) eVirtualGet(UMLPackage.EXTENSION__REDEFINED_CLASSIFIER);
				return redefinedClassifier != null
					&& !redefinedClassifier.isEmpty();
			case UMLPackage.EXTENSION__GENERAL :
				return !getGenerals().isEmpty();
			case UMLPackage.EXTENSION__OWNED_USE_CASE :
				List ownedUseCase = (List) eVirtualGet(UMLPackage.EXTENSION__OWNED_USE_CASE);
				return ownedUseCase != null && !ownedUseCase.isEmpty();
			case UMLPackage.EXTENSION__USE_CASE :
				List useCase = (List) eVirtualGet(UMLPackage.EXTENSION__USE_CASE);
				return useCase != null && !useCase.isEmpty();
			case UMLPackage.EXTENSION__SUBSTITUTION :
				List substitution = (List) eVirtualGet(UMLPackage.EXTENSION__SUBSTITUTION);
				return substitution != null && !substitution.isEmpty();
			case UMLPackage.EXTENSION__ATTRIBUTE :
				return isSetAttributes();
			case UMLPackage.EXTENSION__REPRESENTATION :
				return eVirtualGet(UMLPackage.EXTENSION__REPRESENTATION) != null;
			case UMLPackage.EXTENSION__COLLABORATION_USE :
				List collaborationUse = (List) eVirtualGet(UMLPackage.EXTENSION__COLLABORATION_USE);
				return collaborationUse != null && !collaborationUse.isEmpty();
			case UMLPackage.EXTENSION__OWNED_SIGNATURE :
				return eVirtualGet(UMLPackage.EXTENSION__OWNED_SIGNATURE) != null;
			case UMLPackage.EXTENSION__RELATED_ELEMENT :
				return isSetRelatedElements();
			case UMLPackage.EXTENSION__IS_DERIVED :
				return ((eFlags & IS_DERIVED_EFLAG) != 0) != IS_DERIVED_EDEFAULT;
			case UMLPackage.EXTENSION__END_TYPE :
				return !getEndTypes().isEmpty();
			case UMLPackage.EXTENSION__MEMBER_END :
				List memberEnd = (List) eVirtualGet(UMLPackage.EXTENSION__MEMBER_END);
				return memberEnd != null && !memberEnd.isEmpty();
			case UMLPackage.EXTENSION__NAVIGABLE_OWNED_END :
				List navigableOwnedEnd = (List) eVirtualGet(UMLPackage.EXTENSION__NAVIGABLE_OWNED_END);
				return navigableOwnedEnd != null
					&& !navigableOwnedEnd.isEmpty();
			case UMLPackage.EXTENSION__OWNED_END :
				List ownedEnd = (List) eVirtualGet(UMLPackage.EXTENSION__OWNED_END);
				return ownedEnd != null && !ownedEnd.isEmpty();
			case UMLPackage.EXTENSION__IS_REQUIRED :
				return isRequired() != IS_REQUIRED_EDEFAULT;
			case UMLPackage.EXTENSION__METACLASS :
				return basicGetMetaclass() != null;
		}
		return eDynamicIsSet(eFeature);
	}

} //ExtensionImpl
