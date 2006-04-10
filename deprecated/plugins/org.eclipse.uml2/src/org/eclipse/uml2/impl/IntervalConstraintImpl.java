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
 * $Id: IntervalConstraintImpl.java,v 1.18 2006/04/10 20:40:17 khussey Exp $
 */
package org.eclipse.uml2.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.Interval;
import org.eclipse.uml2.IntervalConstraint;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.ValueSpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interval Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.IntervalConstraintImpl#getSpecification <em>Specification</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IntervalConstraintImpl extends ConstraintImpl implements IntervalConstraint {
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
	protected IntervalConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UML2Package.Literals.INTERVAL_CONSTRAINT;
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
		return specification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setSpecification(ValueSpecification newSpecification) {
		if (newSpecification != null && !(newSpecification instanceof Interval)) {
			throw new IllegalArgumentException(String.valueOf(newSpecification));
		}
		if (newSpecification != specification) {
			NotificationChain msgs = null;
			if (specification != null)
				msgs = ((InternalEObject)specification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.INTERVAL_CONSTRAINT__SPECIFICATION, null, msgs);
			if (newSpecification != null)
				msgs = ((InternalEObject)newSpecification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UML2Package.INTERVAL_CONSTRAINT__SPECIFICATION, null, msgs);
			msgs = basicSetSpecification(newSpecification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.INTERVAL_CONSTRAINT__SPECIFICATION, newSpecification, newSpecification));
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSpecification() {
		return specification != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UML2Package.INTERVAL_CONSTRAINT__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.INTERVAL_CONSTRAINT__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.INTERVAL_CONSTRAINT__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.INTERVAL_CONSTRAINT__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.INTERVAL_CONSTRAINT__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.INTERVAL_CONSTRAINT__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UML2Package.INTERVAL_CONSTRAINT__NAME:
				return getName();
			case UML2Package.INTERVAL_CONSTRAINT__QUALIFIED_NAME:
				return getQualifiedName();
			case UML2Package.INTERVAL_CONSTRAINT__VISIBILITY:
				return getVisibility();
			case UML2Package.INTERVAL_CONSTRAINT__CLIENT_DEPENDENCY:
				return getClientDependencies();
			case UML2Package.INTERVAL_CONSTRAINT__NAME_EXPRESSION:
				return getNameExpression();
			case UML2Package.INTERVAL_CONSTRAINT__TEMPLATE_PARAMETER:
				if (resolve) return getTemplateParameter();
				return basicGetTemplateParameter();
			case UML2Package.INTERVAL_CONSTRAINT__OWNING_PARAMETER:
				return getOwningParameter();
			case UML2Package.INTERVAL_CONSTRAINT__PACKAGEABLE_ELEMENT_VISIBILITY:
				return getPackageableElement_visibility();
			case UML2Package.INTERVAL_CONSTRAINT__CONTEXT:
				if (resolve) return getContext();
				return basicGetContext();
			case UML2Package.INTERVAL_CONSTRAINT__NAMESPACE:
				return getNamespace();
			case UML2Package.INTERVAL_CONSTRAINT__SPECIFICATION:
				return getSpecification();
			case UML2Package.INTERVAL_CONSTRAINT__CONSTRAINED_ELEMENT:
				return getConstrainedElements();
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
			case UML2Package.INTERVAL_CONSTRAINT__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.INTERVAL_CONSTRAINT__OWNED_ELEMENT:
				return isSetOwnedElements();
			case UML2Package.INTERVAL_CONSTRAINT__OWNER:
				return isSetOwner();
			case UML2Package.INTERVAL_CONSTRAINT__OWNED_COMMENT:
				return ownedComments != null && !ownedComments.isEmpty();
			case UML2Package.INTERVAL_CONSTRAINT__TEMPLATE_BINDING:
				return templateBindings != null && !templateBindings.isEmpty();
			case UML2Package.INTERVAL_CONSTRAINT__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case UML2Package.INTERVAL_CONSTRAINT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.INTERVAL_CONSTRAINT__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UML2Package.INTERVAL_CONSTRAINT__VISIBILITY:
				return isSetVisibility();
			case UML2Package.INTERVAL_CONSTRAINT__CLIENT_DEPENDENCY:
				return clientDependencies != null && !clientDependencies.isEmpty();
			case UML2Package.INTERVAL_CONSTRAINT__NAME_EXPRESSION:
				return nameExpression != null;
			case UML2Package.INTERVAL_CONSTRAINT__TEMPLATE_PARAMETER:
				return templateParameter != null;
			case UML2Package.INTERVAL_CONSTRAINT__OWNING_PARAMETER:
				return getOwningParameter() != null;
			case UML2Package.INTERVAL_CONSTRAINT__PACKAGEABLE_ELEMENT_VISIBILITY:
				return isSetPackageableElement_visibility();
			case UML2Package.INTERVAL_CONSTRAINT__CONTEXT:
				return isSetContext();
			case UML2Package.INTERVAL_CONSTRAINT__NAMESPACE:
				return isSetNamespace();
			case UML2Package.INTERVAL_CONSTRAINT__SPECIFICATION:
				return isSetSpecification();
			case UML2Package.INTERVAL_CONSTRAINT__CONSTRAINED_ELEMENT:
				return constrainedElements != null && !constrainedElements.isEmpty();
		}
		return eDynamicIsSet(featureID);
	}


} //IntervalConstraintImpl
