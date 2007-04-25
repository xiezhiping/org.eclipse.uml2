/*
 * Copyright (c) 2005, 2007 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: ExtensionImpl.java,v 1.28 2007/04/25 17:47:02 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;

import org.eclipse.uml2.common.util.SubsetSupersetEObjectContainmentWithInverseEList;
import org.eclipse.uml2.uml.Extension;
import org.eclipse.uml2.uml.ExtensionEnd;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;

import org.eclipse.uml2.uml.internal.operations.ExtensionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extension</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ExtensionImpl#isRequired <em>Is Required</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ExtensionImpl#getMetaclass <em>Metaclass</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ExtensionImpl#getOwnedEnds <em>Owned End</em>}</li>
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
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.EXTENSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getOwnedEndsGen() {
		if (ownedEnds == null) {
			ownedEnds = new EObjectContainmentWithInverseEList.Resolving<Property>(
				ExtensionEnd.class, this, UMLPackage.EXTENSION__OWNED_END,
				UMLPackage.PROPERTY__OWNING_ASSOCIATION);
		}
		return ownedEnds;
	}

	@Override
	public EList<Property> getOwnedEnds() {
		if (ownedEnds == null) {
			ownedEnds = new SubsetSupersetEObjectContainmentWithInverseEList.Resolving<Property>(
				ExtensionEnd.class, this, UMLPackage.EXTENSION__OWNED_END,
				OWNED_END_ESUPERSETS, OWNED_END_ESUBSETS,
				UMLPackage.PROPERTY__OWNING_ASSOCIATION);
		}
		return ownedEnds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Property createOwnedEnd(String name, Type type) {
		ExtensionEnd newOwnedEnd = (ExtensionEnd) create(UMLPackage.Literals.EXTENSION_END);
		getOwnedEnds().add(newOwnedEnd);
		if (name != null)
			newOwnedEnd.setName(name);
		if (type != null)
			newOwnedEnd.setType(type);
		return newOwnedEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Property getOwnedEnd(String name, Type type) {
		return getOwnedEnd(name, type, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getOwnedEnd(String name, Type type, boolean ignoreCase,
			boolean createOnDemand) {
		ownedEndLoop : for (Property ownedEnd : getOwnedEnds()) {
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(ownedEnd.getName())
				: name.equals(ownedEnd.getName())))
				continue ownedEndLoop;
			if (type != null && !type.equals(ownedEnd.getType()))
				continue ownedEndLoop;
			return ownedEnd;
		}
		return createOnDemand
			? createOwnedEnd(name, type)
			: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedEnds() {
		return ownedEnds != null && !ownedEnds.isEmpty();
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
		return metaclass != null && metaclass.eIsProxy()
			? (org.eclipse.uml2.uml.Class) eResolveProxy((InternalEObject) metaclass)
			: metaclass;
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
	public boolean validateNonOwnedEnd(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ExtensionOperations.validateNonOwnedEnd(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIsBinary(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ExtensionOperations.validateIsBinary(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getStereotypeEnd() {
		return ExtensionOperations.getStereotypeEnd(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stereotype getStereotype() {
		return ExtensionOperations.getStereotype(this);
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
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
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
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
			case UMLPackage.EXTENSION__OWNING_TEMPLATE_PARAMETER :
				if (resolve)
					return getOwningTemplateParameter();
				return basicGetOwningTemplateParameter();
			case UMLPackage.EXTENSION__TEMPLATE_PARAMETER :
				if (resolve)
					return getTemplateParameter();
				return basicGetTemplateParameter();
			case UMLPackage.EXTENSION__PACKAGE :
				if (resolve)
					return getPackage();
				return basicGetPackage();
			case UMLPackage.EXTENSION__TEMPLATE_BINDING :
				return getTemplateBindings();
			case UMLPackage.EXTENSION__OWNED_TEMPLATE_SIGNATURE :
				if (resolve)
					return getOwnedTemplateSignature();
				return basicGetOwnedTemplateSignature();
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
			case UMLPackage.EXTENSION__SUBSTITUTION :
				return getSubstitutions();
			case UMLPackage.EXTENSION__ATTRIBUTE :
				return getAttributes();
			case UMLPackage.EXTENSION__REPRESENTATION :
				if (resolve)
					return getRepresentation();
				return basicGetRepresentation();
			case UMLPackage.EXTENSION__COLLABORATION_USE :
				return getCollaborationUses();
			case UMLPackage.EXTENSION__OWNED_USE_CASE :
				return getOwnedUseCases();
			case UMLPackage.EXTENSION__USE_CASE :
				return getUseCases();
			case UMLPackage.EXTENSION__RELATED_ELEMENT :
				return getRelatedElements();
			case UMLPackage.EXTENSION__OWNED_END :
				return getOwnedEnds();
			case UMLPackage.EXTENSION__MEMBER_END :
				return getMemberEnds();
			case UMLPackage.EXTENSION__IS_DERIVED :
				return isDerived()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.EXTENSION__END_TYPE :
				return getEndTypes();
			case UMLPackage.EXTENSION__NAVIGABLE_OWNED_END :
				return getNavigableOwnedEnds();
			case UMLPackage.EXTENSION__IS_REQUIRED :
				return isRequired()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.EXTENSION__METACLASS :
				if (resolve)
					return getMetaclass();
				return basicGetMetaclass();
		}
		return eDynamicGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UMLPackage.EXTENSION__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.EXTENSION__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.EXTENSION__OWNER :
				return isSetOwner();
			case UMLPackage.EXTENSION__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.EXTENSION__NAME :
				return isSetName();
			case UMLPackage.EXTENSION__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.EXTENSION__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.EXTENSION__CLIENT_DEPENDENCY :
				return clientDependencies != null
					&& !clientDependencies.isEmpty();
			case UMLPackage.EXTENSION__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.EXTENSION__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.EXTENSION__ELEMENT_IMPORT :
				return elementImports != null && !elementImports.isEmpty();
			case UMLPackage.EXTENSION__PACKAGE_IMPORT :
				return packageImports != null && !packageImports.isEmpty();
			case UMLPackage.EXTENSION__OWNED_RULE :
				return ownedRules != null && !ownedRules.isEmpty();
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
			case UMLPackage.EXTENSION__OWNING_TEMPLATE_PARAMETER :
				return basicGetOwningTemplateParameter() != null;
			case UMLPackage.EXTENSION__TEMPLATE_PARAMETER :
				return isSetTemplateParameter();
			case UMLPackage.EXTENSION__PACKAGE :
				return basicGetPackage() != null;
			case UMLPackage.EXTENSION__TEMPLATE_BINDING :
				return templateBindings != null && !templateBindings.isEmpty();
			case UMLPackage.EXTENSION__OWNED_TEMPLATE_SIGNATURE :
				return isSetOwnedTemplateSignature();
			case UMLPackage.EXTENSION__IS_ABSTRACT :
				return ((eFlags & IS_ABSTRACT_EFLAG) != 0) != IS_ABSTRACT_EDEFAULT;
			case UMLPackage.EXTENSION__GENERALIZATION :
				return generalizations != null && !generalizations.isEmpty();
			case UMLPackage.EXTENSION__POWERTYPE_EXTENT :
				return powertypeExtents != null && !powertypeExtents.isEmpty();
			case UMLPackage.EXTENSION__FEATURE :
				return isSetFeatures();
			case UMLPackage.EXTENSION__INHERITED_MEMBER :
				return !getInheritedMembers().isEmpty();
			case UMLPackage.EXTENSION__REDEFINED_CLASSIFIER :
				return redefinedClassifiers != null
					&& !redefinedClassifiers.isEmpty();
			case UMLPackage.EXTENSION__GENERAL :
				return !getGenerals().isEmpty();
			case UMLPackage.EXTENSION__SUBSTITUTION :
				return substitutions != null && !substitutions.isEmpty();
			case UMLPackage.EXTENSION__ATTRIBUTE :
				return isSetAttributes();
			case UMLPackage.EXTENSION__REPRESENTATION :
				return representation != null;
			case UMLPackage.EXTENSION__COLLABORATION_USE :
				return collaborationUses != null
					&& !collaborationUses.isEmpty();
			case UMLPackage.EXTENSION__OWNED_USE_CASE :
				return ownedUseCases != null && !ownedUseCases.isEmpty();
			case UMLPackage.EXTENSION__USE_CASE :
				return useCases != null && !useCases.isEmpty();
			case UMLPackage.EXTENSION__RELATED_ELEMENT :
				return isSetRelatedElements();
			case UMLPackage.EXTENSION__OWNED_END :
				return isSetOwnedEnds();
			case UMLPackage.EXTENSION__MEMBER_END :
				return memberEnds != null && !memberEnds.isEmpty();
			case UMLPackage.EXTENSION__IS_DERIVED :
				return ((eFlags & IS_DERIVED_EFLAG) != 0) != IS_DERIVED_EDEFAULT;
			case UMLPackage.EXTENSION__END_TYPE :
				return !getEndTypes().isEmpty();
			case UMLPackage.EXTENSION__NAVIGABLE_OWNED_END :
				return navigableOwnedEnds != null
					&& !navigableOwnedEnds.isEmpty();
			case UMLPackage.EXTENSION__IS_REQUIRED :
				return isRequired() != IS_REQUIRED_EDEFAULT;
			case UMLPackage.EXTENSION__METACLASS :
				return basicGetMetaclass() != null;
		}
		return eDynamicIsSet(featureID);
	}

} //ExtensionImpl
