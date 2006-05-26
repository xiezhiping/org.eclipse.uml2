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
 * $Id: TypeImpl.java,v 1.23 2006/05/26 18:16:43 khussey Exp $
 */
package org.eclipse.uml2.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.uml2.AggregationKind;
import org.eclipse.uml2.Association;
import org.eclipse.uml2.Namespace;
import org.eclipse.uml2.Type;
import org.eclipse.uml2.UML2Package;

import org.eclipse.uml2.internal.operation.TypeOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.TypeImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.TypeImpl#getPackage <em>Package</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TypeImpl extends PackageableElementImpl implements Type {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UML2Package.Literals.TYPE;
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
	public org.eclipse.uml2.Package getPackage() {
		return eInternalContainer() instanceof org.eclipse.uml2.Package ? (org.eclipse.uml2.Package) eContainer() : null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean conformsTo(Type other) {
		return TypeOperations.conformsTo(this, other);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UML2Package.TYPE__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.TYPE__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.TYPE__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.TYPE__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.TYPE__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.TYPE__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UML2Package.TYPE__NAME:
				return getName();
			case UML2Package.TYPE__QUALIFIED_NAME:
				return getQualifiedName();
			case UML2Package.TYPE__VISIBILITY:
				return getVisibility();
			case UML2Package.TYPE__CLIENT_DEPENDENCY:
				return getClientDependencies();
			case UML2Package.TYPE__NAME_EXPRESSION:
				return getNameExpression();
			case UML2Package.TYPE__TEMPLATE_PARAMETER:
				if (resolve) return getTemplateParameter();
				return basicGetTemplateParameter();
			case UML2Package.TYPE__OWNING_PARAMETER:
				return getOwningParameter();
			case UML2Package.TYPE__PACKAGEABLE_ELEMENT_VISIBILITY:
				return getPackageableElement_visibility();
			case UML2Package.TYPE__PACKAGE:
				return getPackage();
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
			case UML2Package.TYPE__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.TYPE__OWNED_ELEMENT:
				return isSetOwnedElements();
			case UML2Package.TYPE__OWNER:
				return isSetOwner();
			case UML2Package.TYPE__OWNED_COMMENT:
				return ownedComments != null && !ownedComments.isEmpty();
			case UML2Package.TYPE__TEMPLATE_BINDING:
				return templateBindings != null && !templateBindings.isEmpty();
			case UML2Package.TYPE__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case UML2Package.TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.TYPE__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UML2Package.TYPE__VISIBILITY:
				return isSetVisibility();
			case UML2Package.TYPE__CLIENT_DEPENDENCY:
				return clientDependencies != null && !clientDependencies.isEmpty();
			case UML2Package.TYPE__NAME_EXPRESSION:
				return nameExpression != null;
			case UML2Package.TYPE__TEMPLATE_PARAMETER:
				return templateParameter != null;
			case UML2Package.TYPE__OWNING_PARAMETER:
				return getOwningParameter() != null;
			case UML2Package.TYPE__PACKAGEABLE_ELEMENT_VISIBILITY:
				return isSetPackageableElement_visibility();
			case UML2Package.TYPE__PACKAGE:
				return getPackage() != null;
		}
		return eDynamicIsSet(featureID);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace basicGetNamespace() {
		org.eclipse.uml2.Package package_ = getPackage();			
		if (package_ != null) {
			return package_;
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
			|| eIsSet(UML2Package.TYPE__PACKAGE);
	}

	// <!-- begin-custom-operations -->

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.Type#createAssociation(boolean, org.eclipse.uml2.AggregationKind, java.lang.String, int, int, org.eclipse.uml2.Type, boolean, org.eclipse.uml2.AggregationKind, java.lang.String, int, int)
	 */
	public Association createAssociation(
		boolean thisEndIsNavigable,
		AggregationKind thisEndAggregation,
		String thisEndName,
		int thisEndLowerBound,
		int thisEndUpperBound,
		Type otherType,
		boolean otherEndIsNavigable,
		AggregationKind otherEndAggregation,
		String otherEndName,
		int otherEndLowerBound,
		int otherEndUpperBound) {

		return TypeOperations.createAssociation(
			this,
			thisEndIsNavigable,
			thisEndAggregation,
			thisEndName,
			thisEndLowerBound,
			thisEndUpperBound,
			otherType,
			otherEndIsNavigable,
			otherEndAggregation,
			otherEndName,
			otherEndLowerBound,
			otherEndUpperBound);
	}

	// <!-- end-custom-operations -->

} //TypeImpl
