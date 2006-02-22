/*
 * Copyright (c) 2005, 2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: TimeConstraintImpl.java,v 1.14 2006/02/22 20:48:16 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.TimeConstraint;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.TimeInterval;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.ValueSpecification;

import org.eclipse.uml2.uml.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.TimeConstraintImpl#isFirstEvent <em>First Event</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.TimeConstraintImpl#getSpecification <em>Specification</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TimeConstraintImpl
		extends IntervalConstraintImpl
		implements TimeConstraint {

	/**
	 * The default value of the '{@link #isFirstEvent() <em>First Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFirstEvent()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FIRST_EVENT_EDEFAULT = true;

	/**
	 * The flag representing the value of the '{@link #isFirstEvent() <em>First Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFirstEvent()
	 * @generated
	 * @ordered
	 */
	protected static final int FIRST_EVENT_EFLAG = 1 << 8;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeConstraintImpl() {
		super();
		eFlags |= FIRST_EVENT_EFLAG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.Literals.TIME_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFirstEvent() {
		return (eFlags & FIRST_EVENT_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstEvent(boolean newFirstEvent) {
		boolean oldFirstEvent = (eFlags & FIRST_EVENT_EFLAG) != 0;
		if (newFirstEvent)
			eFlags |= FIRST_EVENT_EFLAG;
		else
			eFlags &= ~FIRST_EVENT_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.TIME_CONSTRAINT__FIRST_EVENT, oldFirstEvent,
				newFirstEvent));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getSpecification() {
		ValueSpecification specification = (ValueSpecification) eVirtualGet(UMLPackage.TIME_CONSTRAINT__SPECIFICATION);
		if (specification != null && specification.eIsProxy()) {
			InternalEObject oldSpecification = (InternalEObject) specification;
			specification = (ValueSpecification) eResolveProxy(oldSpecification);
			if (specification != oldSpecification) {
				InternalEObject newSpecification = (InternalEObject) specification;
				NotificationChain msgs = oldSpecification
					.eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- UMLPackage.TIME_CONSTRAINT__SPECIFICATION, null, null);
				if (newSpecification.eInternalContainer() == null) {
					msgs = newSpecification.eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
							- UMLPackage.TIME_CONSTRAINT__SPECIFICATION, null,
						msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.TIME_CONSTRAINT__SPECIFICATION,
						oldSpecification, specification));
			}
		}
		return specification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification basicGetSpecification() {
		return (ValueSpecification) eVirtualGet(UMLPackage.TIME_CONSTRAINT__SPECIFICATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecificationGen(
			ValueSpecification newSpecification, NotificationChain msgs) {
		Object oldSpecification = eVirtualSet(
			UMLPackage.TIME_CONSTRAINT__SPECIFICATION, newSpecification);
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET, UMLPackage.TIME_CONSTRAINT__SPECIFICATION,
				oldSpecification == EVIRTUAL_NO_VALUE
					? null
					: oldSpecification, newSpecification);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}

		return msgs;
	}

	public NotificationChain basicSetSpecification(
			ValueSpecification newSpecification, NotificationChain msgs) {

		if (newSpecification != null
			&& !(newSpecification instanceof TimeInterval)) {

			throw new IllegalArgumentException(newSpecification.toString());
		}

		return basicSetSpecificationGen(newSpecification, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecification(ValueSpecification newSpecification) {
		ValueSpecification specification = (ValueSpecification) eVirtualGet(UMLPackage.TIME_CONSTRAINT__SPECIFICATION);
		if (newSpecification != specification) {
			NotificationChain msgs = null;
			if (specification != null)
				msgs = ((InternalEObject) specification)
					.eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- UMLPackage.TIME_CONSTRAINT__SPECIFICATION, null, msgs);
			if (newSpecification != null)
				msgs = ((InternalEObject) newSpecification)
					.eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- UMLPackage.TIME_CONSTRAINT__SPECIFICATION, null, msgs);
			msgs = basicSetSpecification(newSpecification, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.TIME_CONSTRAINT__SPECIFICATION, newSpecification,
				newSpecification));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification createSpecification(String name, Type type,
			EClass eClass) {
		ValueSpecification newSpecification = (ValueSpecification) EcoreUtil
			.create(eClass);
		newSpecification.setName(name);
		newSpecification.setType(type);
		setSpecification(newSpecification);
		return newSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSpecification() {
		return eVirtualGet(UMLPackage.TIME_CONSTRAINT__SPECIFICATION) != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.TIME_CONSTRAINT__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.TIME_CONSTRAINT__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.TIME_CONSTRAINT__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.TIME_CONSTRAINT__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.TIME_CONSTRAINT__NAME :
				return getName();
			case UMLPackage.TIME_CONSTRAINT__VISIBILITY :
				return getVisibility();
			case UMLPackage.TIME_CONSTRAINT__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.TIME_CONSTRAINT__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.TIME_CONSTRAINT__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.TIME_CONSTRAINT__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.TIME_CONSTRAINT__OWNING_TEMPLATE_PARAMETER :
				if (resolve)
					return getOwningTemplateParameter();
				return basicGetOwningTemplateParameter();
			case UMLPackage.TIME_CONSTRAINT__TEMPLATE_PARAMETER :
				if (resolve)
					return getTemplateParameter();
				return basicGetTemplateParameter();
			case UMLPackage.TIME_CONSTRAINT__CONSTRAINED_ELEMENT :
				return getConstrainedElements();
			case UMLPackage.TIME_CONSTRAINT__SPECIFICATION :
				if (resolve)
					return getSpecification();
				return basicGetSpecification();
			case UMLPackage.TIME_CONSTRAINT__CONTEXT :
				return getContext();
			case UMLPackage.TIME_CONSTRAINT__FIRST_EVENT :
				return isFirstEvent()
					? Boolean.TRUE
					: Boolean.FALSE;
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
			case UMLPackage.TIME_CONSTRAINT__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.TIME_CONSTRAINT__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.TIME_CONSTRAINT__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.TIME_CONSTRAINT__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.TIME_CONSTRAINT__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.TIME_CONSTRAINT__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.TIME_CONSTRAINT__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.TIME_CONSTRAINT__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.TIME_CONSTRAINT__CONSTRAINED_ELEMENT :
				getConstrainedElements().clear();
				getConstrainedElements().addAll((Collection) newValue);
				return;
			case UMLPackage.TIME_CONSTRAINT__SPECIFICATION :
				setSpecification((ValueSpecification) newValue);
				return;
			case UMLPackage.TIME_CONSTRAINT__CONTEXT :
				setContext((Namespace) newValue);
				return;
			case UMLPackage.TIME_CONSTRAINT__FIRST_EVENT :
				setFirstEvent(((Boolean) newValue).booleanValue());
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
			case UMLPackage.TIME_CONSTRAINT__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.TIME_CONSTRAINT__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.TIME_CONSTRAINT__NAME :
				unsetName();
				return;
			case UMLPackage.TIME_CONSTRAINT__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.TIME_CONSTRAINT__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.TIME_CONSTRAINT__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.TIME_CONSTRAINT__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.TIME_CONSTRAINT__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.TIME_CONSTRAINT__CONSTRAINED_ELEMENT :
				getConstrainedElements().clear();
				return;
			case UMLPackage.TIME_CONSTRAINT__SPECIFICATION :
				setSpecification((ValueSpecification) null);
				return;
			case UMLPackage.TIME_CONSTRAINT__CONTEXT :
				setContext((Namespace) null);
				return;
			case UMLPackage.TIME_CONSTRAINT__FIRST_EVENT :
				setFirstEvent(FIRST_EVENT_EDEFAULT);
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
			case UMLPackage.TIME_CONSTRAINT__EANNOTATIONS :
				EList eAnnotations = (EList) eVirtualGet(UMLPackage.TIME_CONSTRAINT__EANNOTATIONS);
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.TIME_CONSTRAINT__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.TIME_CONSTRAINT__OWNER :
				return isSetOwner();
			case UMLPackage.TIME_CONSTRAINT__OWNED_COMMENT :
				EList ownedComment = (EList) eVirtualGet(UMLPackage.TIME_CONSTRAINT__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.TIME_CONSTRAINT__NAME :
				return isSetName();
			case UMLPackage.TIME_CONSTRAINT__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.TIME_CONSTRAINT__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.TIME_CONSTRAINT__CLIENT_DEPENDENCY :
				EList clientDependency = (EList) eVirtualGet(UMLPackage.TIME_CONSTRAINT__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.TIME_CONSTRAINT__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.TIME_CONSTRAINT__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.TIME_CONSTRAINT__NAME_EXPRESSION) != null;
			case UMLPackage.TIME_CONSTRAINT__OWNING_TEMPLATE_PARAMETER :
				return basicGetOwningTemplateParameter() != null;
			case UMLPackage.TIME_CONSTRAINT__TEMPLATE_PARAMETER :
				return eVirtualGet(UMLPackage.TIME_CONSTRAINT__TEMPLATE_PARAMETER) != null;
			case UMLPackage.TIME_CONSTRAINT__CONSTRAINED_ELEMENT :
				EList constrainedElement = (EList) eVirtualGet(UMLPackage.TIME_CONSTRAINT__CONSTRAINED_ELEMENT);
				return constrainedElement != null
					&& !constrainedElement.isEmpty();
			case UMLPackage.TIME_CONSTRAINT__SPECIFICATION :
				return isSetSpecification();
			case UMLPackage.TIME_CONSTRAINT__CONTEXT :
				return getContext() != null;
			case UMLPackage.TIME_CONSTRAINT__FIRST_EVENT :
				return ((eFlags & FIRST_EVENT_EFLAG) != 0) != FIRST_EVENT_EDEFAULT;
		}
		return eDynamicIsSet(featureID);
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
		result.append(" (firstEvent: "); //$NON-NLS-1$
		result.append((eFlags & FIRST_EVENT_EFLAG) != 0);
		result.append(')');
		return result.toString();
	}

} //TimeConstraintImpl
