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
 * $Id: ExtensionImpl.java,v 1.35 2006/04/10 20:40:20 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.util.Iterator;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

//import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.Extension;
import org.eclipse.uml2.ExtensionEnd;
import org.eclipse.uml2.Property;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;

import org.eclipse.uml2.common.util.SubsetSupersetEObjectContainmentWithInverseEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extension</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.ExtensionImpl#isRequired <em>Is Required</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ExtensionImpl#getMetaclass <em>Metaclass</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ExtensionImpl#getOwnedEnds <em>Owned End</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExtensionImpl extends AssociationImpl implements Extension {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

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
		return UML2Package.Literals.EXTENSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isRequired() {
		ExtensionEnd ownedEnd = 0 < getOwnedEnds().size() ? (ExtensionEnd) getOwnedEnds().get(0) : null;
		return null != ownedEnd && 1 == ownedEnd.getLower();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.Class getMetaclass() {
		org.eclipse.uml2.Class metaclass = basicGetMetaclass();
		return metaclass != null && metaclass.eIsProxy() ? (org.eclipse.uml2.Class)eResolveProxy((InternalEObject)metaclass) : metaclass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public org.eclipse.uml2.Class basicGetMetaclass() {
		EList ownedEnds = getOwnedEnds();

		for (Iterator memberEnds = getMemberEnds().iterator(); memberEnds.hasNext();) {
			Property memberEnd = (Property) memberEnds.next();

			if (!ownedEnds.contains(memberEnd)) {
				return (org.eclipse.uml2.Class) memberEnd.getType();
			}
		}

		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList getOwnedEnds() {
		if (ownedEnds == null) {
			ownedEnds = new SubsetSupersetEObjectContainmentWithInverseEList(
				ExtensionEnd.class, this, UML2Package.EXTENSION__OWNED_END,
				OWNED_END_ESUPERSETS, null,
				UML2Package.PROPERTY__OWNING_ASSOCIATION);
		}
		return ownedEnds;
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UML2Package.EXTENSION__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.EXTENSION__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.EXTENSION__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.EXTENSION__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.EXTENSION__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.EXTENSION__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UML2Package.EXTENSION__NAME:
				return getName();
			case UML2Package.EXTENSION__QUALIFIED_NAME:
				return getQualifiedName();
			case UML2Package.EXTENSION__VISIBILITY:
				return getVisibility();
			case UML2Package.EXTENSION__CLIENT_DEPENDENCY:
				return getClientDependencies();
			case UML2Package.EXTENSION__NAME_EXPRESSION:
				return getNameExpression();
			case UML2Package.EXTENSION__MEMBER:
				return getMembers();
			case UML2Package.EXTENSION__OWNED_RULE:
				return getOwnedRules();
			case UML2Package.EXTENSION__IMPORTED_MEMBER:
				return getImportedMembers();
			case UML2Package.EXTENSION__ELEMENT_IMPORT:
				return getElementImports();
			case UML2Package.EXTENSION__PACKAGE_IMPORT:
				return getPackageImports();
			case UML2Package.EXTENSION__TEMPLATE_PARAMETER:
				if (resolve) return getTemplateParameter();
				return basicGetTemplateParameter();
			case UML2Package.EXTENSION__OWNING_PARAMETER:
				return getOwningParameter();
			case UML2Package.EXTENSION__PACKAGEABLE_ELEMENT_VISIBILITY:
				return getPackageableElement_visibility();
			case UML2Package.EXTENSION__PACKAGE:
				return getPackage();
			case UML2Package.EXTENSION__REDEFINITION_CONTEXT:
				return getRedefinitionContexts();
			case UML2Package.EXTENSION__IS_LEAF:
				return isLeaf() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.EXTENSION__FEATURE:
				return getFeatures();
			case UML2Package.EXTENSION__IS_ABSTRACT:
				return isAbstract() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.EXTENSION__INHERITED_MEMBER:
				return getInheritedMembers();
			case UML2Package.EXTENSION__GENERAL:
				return getGenerals();
			case UML2Package.EXTENSION__GENERALIZATION:
				return getGeneralizations();
			case UML2Package.EXTENSION__ATTRIBUTE:
				return getAttributes();
			case UML2Package.EXTENSION__REDEFINED_CLASSIFIER:
				return getRedefinedClassifiers();
			case UML2Package.EXTENSION__SUBSTITUTION:
				return getSubstitutions();
			case UML2Package.EXTENSION__POWERTYPE_EXTENT:
				return getPowertypeExtents();
			case UML2Package.EXTENSION__OWNED_USE_CASE:
				return getOwnedUseCases();
			case UML2Package.EXTENSION__USE_CASE:
				return getUseCases();
			case UML2Package.EXTENSION__REPRESENTATION:
				return getRepresentation();
			case UML2Package.EXTENSION__OCCURRENCE:
				return getOccurrences();
			case UML2Package.EXTENSION__RELATED_ELEMENT:
				return getRelatedElements();
			case UML2Package.EXTENSION__IS_DERIVED:
				return isDerived() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.EXTENSION__OWNED_END:
				return getOwnedEnds();
			case UML2Package.EXTENSION__END_TYPE:
				return getEndTypes();
			case UML2Package.EXTENSION__MEMBER_END:
				return getMemberEnds();
			case UML2Package.EXTENSION__IS_REQUIRED:
				return isRequired() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.EXTENSION__METACLASS:
				if (resolve) return getMetaclass();
				return basicGetMetaclass();
		}
		return eDynamicGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UML2Package.EXTENSION__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.EXTENSION__OWNED_ELEMENT:
				return isSetOwnedElements();
			case UML2Package.EXTENSION__OWNER:
				return isSetOwner();
			case UML2Package.EXTENSION__OWNED_COMMENT:
				return ownedComments != null && !ownedComments.isEmpty();
			case UML2Package.EXTENSION__TEMPLATE_BINDING:
				return templateBindings != null && !templateBindings.isEmpty();
			case UML2Package.EXTENSION__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case UML2Package.EXTENSION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.EXTENSION__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UML2Package.EXTENSION__VISIBILITY:
				return isSetVisibility();
			case UML2Package.EXTENSION__CLIENT_DEPENDENCY:
				return clientDependencies != null && !clientDependencies.isEmpty();
			case UML2Package.EXTENSION__NAME_EXPRESSION:
				return nameExpression != null;
			case UML2Package.EXTENSION__MEMBER:
				return isSetMembers();
			case UML2Package.EXTENSION__OWNED_RULE:
				return ownedRules != null && !ownedRules.isEmpty();
			case UML2Package.EXTENSION__IMPORTED_MEMBER:
				return !getImportedMembers().isEmpty();
			case UML2Package.EXTENSION__ELEMENT_IMPORT:
				return elementImports != null && !elementImports.isEmpty();
			case UML2Package.EXTENSION__PACKAGE_IMPORT:
				return packageImports != null && !packageImports.isEmpty();
			case UML2Package.EXTENSION__TEMPLATE_PARAMETER:
				return templateParameter != null;
			case UML2Package.EXTENSION__OWNING_PARAMETER:
				return getOwningParameter() != null;
			case UML2Package.EXTENSION__PACKAGEABLE_ELEMENT_VISIBILITY:
				return isSetPackageableElement_visibility();
			case UML2Package.EXTENSION__PACKAGE:
				return getPackage() != null;
			case UML2Package.EXTENSION__REDEFINITION_CONTEXT:
				return isSetRedefinitionContexts();
			case UML2Package.EXTENSION__IS_LEAF:
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UML2Package.EXTENSION__FEATURE:
				return isSetFeatures();
			case UML2Package.EXTENSION__IS_ABSTRACT:
				return ((eFlags & IS_ABSTRACT_EFLAG) != 0) != IS_ABSTRACT_EDEFAULT;
			case UML2Package.EXTENSION__INHERITED_MEMBER:
				return !getInheritedMembers().isEmpty();
			case UML2Package.EXTENSION__GENERAL:
				return !getGenerals().isEmpty();
			case UML2Package.EXTENSION__GENERALIZATION:
				return generalizations != null && !generalizations.isEmpty();
			case UML2Package.EXTENSION__ATTRIBUTE:
				return isSetAttributes();
			case UML2Package.EXTENSION__REDEFINED_CLASSIFIER:
				return redefinedClassifiers != null && !redefinedClassifiers.isEmpty();
			case UML2Package.EXTENSION__SUBSTITUTION:
				return substitutions != null && !substitutions.isEmpty();
			case UML2Package.EXTENSION__POWERTYPE_EXTENT:
				return powertypeExtents != null && !powertypeExtents.isEmpty();
			case UML2Package.EXTENSION__OWNED_USE_CASE:
				return ownedUseCases != null && !ownedUseCases.isEmpty();
			case UML2Package.EXTENSION__USE_CASE:
				return useCases != null && !useCases.isEmpty();
			case UML2Package.EXTENSION__REPRESENTATION:
				return representation != null;
			case UML2Package.EXTENSION__OCCURRENCE:
				return occurrences != null && !occurrences.isEmpty();
			case UML2Package.EXTENSION__RELATED_ELEMENT:
				return isSetRelatedElements();
			case UML2Package.EXTENSION__IS_DERIVED:
				return ((eFlags & IS_DERIVED_EFLAG) != 0) != IS_DERIVED_EDEFAULT;
			case UML2Package.EXTENSION__OWNED_END:
				return isSetOwnedEnds();
			case UML2Package.EXTENSION__END_TYPE:
				return !getEndTypes().isEmpty();
			case UML2Package.EXTENSION__MEMBER_END:
				return memberEnds != null && !memberEnds.isEmpty();
			case UML2Package.EXTENSION__IS_REQUIRED:
				return isRequired() != IS_REQUIRED_EDEFAULT;
			case UML2Package.EXTENSION__METACLASS:
				return basicGetMetaclass() != null;
		}
		return eDynamicIsSet(featureID);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @deprecated Use #createOwnedEnd() instead.
	 */
	public Property createOwnedEnd(EClass eClass) {
		ExtensionEnd newOwnedEnd = (ExtensionEnd) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.EXTENSION__OWNED_END, null, newOwnedEnd));
		}
		getOwnedEnds().add(newOwnedEnd);
		return newOwnedEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Property createOwnedEnd() {
		ExtensionEnd newOwnedEnd = UML2Factory.eINSTANCE.createExtensionEnd();
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.EXTENSION__OWNED_END, null, newOwnedEnd));
		}
		getOwnedEnds().add(newOwnedEnd);
		return newOwnedEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public Property getOwnedEnd(String name) {
		return getOwnedEnd(name, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getOwnedEnd(String name, boolean ignoreCase) {
		ownedEndLoop: for (Iterator i = getOwnedEnds().iterator(); i.hasNext(); ) {
			ExtensionEnd ownedEnd = (ExtensionEnd) i.next();
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(ownedEnd.getName()) : name.equals(ownedEnd.getName())))
				continue ownedEndLoop;
			return ownedEnd;
		}
		return null;
	}

} //ExtensionImpl
