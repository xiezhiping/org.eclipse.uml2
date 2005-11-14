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
 * $Id: DurationConstraintImpl.java,v 1.13 2005/11/14 17:31:09 khussey Exp $
 */
package org.eclipse.uml2.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.DurationConstraint;
import org.eclipse.uml2.DurationInterval;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.ValueSpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Duration Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.DurationConstraintImpl#getSpecification <em>Specification</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DurationConstraintImpl extends IntervalConstraintImpl implements DurationConstraint {

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
	protected DurationConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UML2Package.eINSTANCE.getDurationConstraint();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ValueSpecification getSpecification() {
		return basicGetSpecification();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification basicGetSpecification() {
		return (ValueSpecification)eVirtualGet(UML2Package.DURATION_CONSTRAINT__SPECIFICATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setSpecification(ValueSpecification newSpecification) {
		if (newSpecification != null && !(newSpecification instanceof DurationInterval)) {
			throw new IllegalArgumentException(String.valueOf(newSpecification));
		}
		ValueSpecification specification = (ValueSpecification)eVirtualGet(UML2Package.DURATION_CONSTRAINT__SPECIFICATION);
		if (newSpecification != specification) {
			NotificationChain msgs = null;
			if (specification != null)
				msgs = ((InternalEObject)specification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.DURATION_CONSTRAINT__SPECIFICATION, null, msgs);
			if (newSpecification != null)
				msgs = ((InternalEObject)newSpecification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UML2Package.DURATION_CONSTRAINT__SPECIFICATION, null, msgs);
			msgs = basicSetSpecification(newSpecification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.DURATION_CONSTRAINT__SPECIFICATION, newSpecification, newSpecification));
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSpecification() {
		return eVirtualGet(UML2Package.DURATION_CONSTRAINT__SPECIFICATION) != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UML2Package.DURATION_CONSTRAINT__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.DURATION_CONSTRAINT__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.DURATION_CONSTRAINT__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.DURATION_CONSTRAINT__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.DURATION_CONSTRAINT__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.DURATION_CONSTRAINT__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UML2Package.DURATION_CONSTRAINT__NAME:
				return getName();
			case UML2Package.DURATION_CONSTRAINT__QUALIFIED_NAME:
				return getQualifiedName();
			case UML2Package.DURATION_CONSTRAINT__VISIBILITY:
				return getVisibility();
			case UML2Package.DURATION_CONSTRAINT__CLIENT_DEPENDENCY:
				return getClientDependencies();
			case UML2Package.DURATION_CONSTRAINT__NAME_EXPRESSION:
				return getNameExpression();
			case UML2Package.DURATION_CONSTRAINT__TEMPLATE_PARAMETER:
				if (resolve) return getTemplateParameter();
				return basicGetTemplateParameter();
			case UML2Package.DURATION_CONSTRAINT__OWNING_PARAMETER:
				return getOwningParameter();
			case UML2Package.DURATION_CONSTRAINT__PACKAGEABLE_ELEMENT_VISIBILITY:
				return getPackageableElement_visibility();
			case UML2Package.DURATION_CONSTRAINT__CONTEXT:
				if (resolve) return getContext();
				return basicGetContext();
			case UML2Package.DURATION_CONSTRAINT__NAMESPACE:
				return getNamespace();
			case UML2Package.DURATION_CONSTRAINT__SPECIFICATION:
				return getSpecification();
			case UML2Package.DURATION_CONSTRAINT__CONSTRAINED_ELEMENT:
				return getConstrainedElements();
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
			case UML2Package.DURATION_CONSTRAINT__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.DURATION_CONSTRAINT__OWNED_ELEMENT:
				return isSetOwnedElements();
			case UML2Package.DURATION_CONSTRAINT__OWNER:
				return isSetOwner();
			case UML2Package.DURATION_CONSTRAINT__OWNED_COMMENT:
				EList ownedComment = (EList)eVirtualGet(UML2Package.DURATION_CONSTRAINT__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.DURATION_CONSTRAINT__TEMPLATE_BINDING:
				EList templateBinding = (EList)eVirtualGet(UML2Package.DURATION_CONSTRAINT__TEMPLATE_BINDING);
				return templateBinding != null && !templateBinding.isEmpty();
			case UML2Package.DURATION_CONSTRAINT__OWNED_TEMPLATE_SIGNATURE:
				return eVirtualGet(UML2Package.DURATION_CONSTRAINT__OWNED_TEMPLATE_SIGNATURE) != null;
			case UML2Package.DURATION_CONSTRAINT__NAME:
				String name = eVirtualIsSet(UML2Package.DURATION_CONSTRAINT__NAME) ? (String)eVirtualGet(UML2Package.DURATION_CONSTRAINT__NAME) : NAME_EDEFAULT;
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.DURATION_CONSTRAINT__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UML2Package.DURATION_CONSTRAINT__VISIBILITY:
				return eVirtualIsSet(UML2Package.DURATION_CONSTRAINT__VISIBILITY) && eVirtualGet(UML2Package.DURATION_CONSTRAINT__VISIBILITY) != VISIBILITY_EDEFAULT;
			case UML2Package.DURATION_CONSTRAINT__CLIENT_DEPENDENCY:
				EList clientDependency = (EList)eVirtualGet(UML2Package.DURATION_CONSTRAINT__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UML2Package.DURATION_CONSTRAINT__NAME_EXPRESSION:
				return eVirtualGet(UML2Package.DURATION_CONSTRAINT__NAME_EXPRESSION) != null;
			case UML2Package.DURATION_CONSTRAINT__TEMPLATE_PARAMETER:
				return eVirtualGet(UML2Package.DURATION_CONSTRAINT__TEMPLATE_PARAMETER) != null;
			case UML2Package.DURATION_CONSTRAINT__OWNING_PARAMETER:
				return getOwningParameter() != null;
			case UML2Package.DURATION_CONSTRAINT__PACKAGEABLE_ELEMENT_VISIBILITY:
				return isSetPackageableElement_visibility();
			case UML2Package.DURATION_CONSTRAINT__CONTEXT:
				return isSetContext();
			case UML2Package.DURATION_CONSTRAINT__NAMESPACE:
				return isSetNamespace();
			case UML2Package.DURATION_CONSTRAINT__SPECIFICATION:
				return eVirtualGet(UML2Package.DURATION_CONSTRAINT__SPECIFICATION) != null;
			case UML2Package.DURATION_CONSTRAINT__CONSTRAINED_ELEMENT:
				EList constrainedElement = (EList)eVirtualGet(UML2Package.DURATION_CONSTRAINT__CONSTRAINED_ELEMENT);
				return constrainedElement != null && !constrainedElement.isEmpty();
		}
		return eDynamicIsSet(eFeature);
	}


} //DurationConstraintImpl
