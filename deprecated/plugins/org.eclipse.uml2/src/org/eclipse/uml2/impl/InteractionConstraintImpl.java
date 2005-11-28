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
 * $Id: InteractionConstraintImpl.java,v 1.22 2005/11/28 17:18:06 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.Element;
import org.eclipse.uml2.InteractionConstraint;
import org.eclipse.uml2.Namespace;
import org.eclipse.uml2.StringExpression;
import org.eclipse.uml2.TemplateParameter;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.ValueSpecification;
import org.eclipse.uml2.VisibilityKind;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interaction Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.InteractionConstraintImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.InteractionConstraintImpl#getMinint <em>Minint</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.InteractionConstraintImpl#getMaxint <em>Maxint</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InteractionConstraintImpl extends ConstraintImpl implements InteractionConstraint {
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
	protected InteractionConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UML2Package.Literals.INTERACTION_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedElements() {
		EList ownedElement = (EList)eVirtualGet(UML2Package.INTERACTION_CONSTRAINT__OWNED_ELEMENT);
		if (ownedElement == null) {
			eVirtualSet(UML2Package.INTERACTION_CONSTRAINT__OWNED_ELEMENT, ownedElement = new DerivedUnionEObjectEList(Element.class, this, UML2Package.INTERACTION_CONSTRAINT__OWNED_ELEMENT, new int[] {UML2Package.INTERACTION_CONSTRAINT__OWNED_COMMENT, UML2Package.INTERACTION_CONSTRAINT__TEMPLATE_BINDING, UML2Package.INTERACTION_CONSTRAINT__OWNED_TEMPLATE_SIGNATURE, UML2Package.INTERACTION_CONSTRAINT__NAME_EXPRESSION, UML2Package.INTERACTION_CONSTRAINT__SPECIFICATION, UML2Package.INTERACTION_CONSTRAINT__MININT, UML2Package.INTERACTION_CONSTRAINT__MAXINT}));
		}
		return ownedElement;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| eIsSet(UML2Package.INTERACTION_CONSTRAINT__MININT)
			|| eIsSet(UML2Package.INTERACTION_CONSTRAINT__MAXINT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getMinint() {
		return (ValueSpecification)eVirtualGet(UML2Package.INTERACTION_CONSTRAINT__MININT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMinint(ValueSpecification newMinint, NotificationChain msgs) {
		Object oldMinint = eVirtualSet(UML2Package.INTERACTION_CONSTRAINT__MININT, newMinint);
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UML2Package.INTERACTION_CONSTRAINT__MININT, oldMinint == EVIRTUAL_NO_VALUE ? null : oldMinint, newMinint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinint(ValueSpecification newMinint) {
		ValueSpecification minint = (ValueSpecification)eVirtualGet(UML2Package.INTERACTION_CONSTRAINT__MININT);
		if (newMinint != minint) {
			NotificationChain msgs = null;
			if (minint != null)
				msgs = ((InternalEObject)minint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.INTERACTION_CONSTRAINT__MININT, null, msgs);
			if (newMinint != null)
				msgs = ((InternalEObject)newMinint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UML2Package.INTERACTION_CONSTRAINT__MININT, null, msgs);
			msgs = basicSetMinint(newMinint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.INTERACTION_CONSTRAINT__MININT, newMinint, newMinint));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ValueSpecification createMinint(EClass eClass) {
		ValueSpecification newMinint = (ValueSpecification) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.INTERACTION_CONSTRAINT__MININT, null, newMinint));
		}
		setMinint(newMinint);
		return newMinint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getMaxint() {
		return (ValueSpecification)eVirtualGet(UML2Package.INTERACTION_CONSTRAINT__MAXINT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaxint(ValueSpecification newMaxint, NotificationChain msgs) {
		Object oldMaxint = eVirtualSet(UML2Package.INTERACTION_CONSTRAINT__MAXINT, newMaxint);
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UML2Package.INTERACTION_CONSTRAINT__MAXINT, oldMaxint == EVIRTUAL_NO_VALUE ? null : oldMaxint, newMaxint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxint(ValueSpecification newMaxint) {
		ValueSpecification maxint = (ValueSpecification)eVirtualGet(UML2Package.INTERACTION_CONSTRAINT__MAXINT);
		if (newMaxint != maxint) {
			NotificationChain msgs = null;
			if (maxint != null)
				msgs = ((InternalEObject)maxint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.INTERACTION_CONSTRAINT__MAXINT, null, msgs);
			if (newMaxint != null)
				msgs = ((InternalEObject)newMaxint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UML2Package.INTERACTION_CONSTRAINT__MAXINT, null, msgs);
			msgs = basicSetMaxint(newMaxint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.INTERACTION_CONSTRAINT__MAXINT, newMaxint, newMaxint));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ValueSpecification createMaxint(EClass eClass) {
		ValueSpecification newMaxint = (ValueSpecification) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.INTERACTION_CONSTRAINT__MAXINT, null, newMaxint));
		}
		setMaxint(newMaxint);
		return newMaxint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UML2Package.INTERACTION_CONSTRAINT__EANNOTATIONS:
				return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
			case UML2Package.INTERACTION_CONSTRAINT__OWNED_COMMENT:
				return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
			case UML2Package.INTERACTION_CONSTRAINT__TEMPLATE_BINDING:
				return ((InternalEList)getTemplateBindings()).basicRemove(otherEnd, msgs);
			case UML2Package.INTERACTION_CONSTRAINT__OWNED_TEMPLATE_SIGNATURE:
				return basicSetOwnedTemplateSignature(null, msgs);
			case UML2Package.INTERACTION_CONSTRAINT__CLIENT_DEPENDENCY:
				return ((InternalEList)getClientDependencies()).basicRemove(otherEnd, msgs);
			case UML2Package.INTERACTION_CONSTRAINT__NAME_EXPRESSION:
				return basicSetNameExpression(null, msgs);
			case UML2Package.INTERACTION_CONSTRAINT__TEMPLATE_PARAMETER:
				return basicSetTemplateParameter(null, msgs);
			case UML2Package.INTERACTION_CONSTRAINT__OWNING_PARAMETER:
				return eBasicSetContainer(null, UML2Package.INTERACTION_CONSTRAINT__OWNING_PARAMETER, msgs);
			case UML2Package.INTERACTION_CONSTRAINT__NAMESPACE:
				return eBasicSetContainer(null, UML2Package.INTERACTION_CONSTRAINT__NAMESPACE, msgs);
			case UML2Package.INTERACTION_CONSTRAINT__SPECIFICATION:
				return basicSetSpecification(null, msgs);
			case UML2Package.INTERACTION_CONSTRAINT__MININT:
				return basicSetMinint(null, msgs);
			case UML2Package.INTERACTION_CONSTRAINT__MAXINT:
				return basicSetMaxint(null, msgs);
		}
		return eDynamicInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UML2Package.INTERACTION_CONSTRAINT__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.INTERACTION_CONSTRAINT__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.INTERACTION_CONSTRAINT__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.INTERACTION_CONSTRAINT__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.INTERACTION_CONSTRAINT__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.INTERACTION_CONSTRAINT__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UML2Package.INTERACTION_CONSTRAINT__NAME:
				return getName();
			case UML2Package.INTERACTION_CONSTRAINT__QUALIFIED_NAME:
				return getQualifiedName();
			case UML2Package.INTERACTION_CONSTRAINT__VISIBILITY:
				return getVisibility();
			case UML2Package.INTERACTION_CONSTRAINT__CLIENT_DEPENDENCY:
				return getClientDependencies();
			case UML2Package.INTERACTION_CONSTRAINT__NAME_EXPRESSION:
				return getNameExpression();
			case UML2Package.INTERACTION_CONSTRAINT__TEMPLATE_PARAMETER:
				if (resolve) return getTemplateParameter();
				return basicGetTemplateParameter();
			case UML2Package.INTERACTION_CONSTRAINT__OWNING_PARAMETER:
				return getOwningParameter();
			case UML2Package.INTERACTION_CONSTRAINT__PACKAGEABLE_ELEMENT_VISIBILITY:
				return getPackageableElement_visibility();
			case UML2Package.INTERACTION_CONSTRAINT__CONTEXT:
				if (resolve) return getContext();
				return basicGetContext();
			case UML2Package.INTERACTION_CONSTRAINT__NAMESPACE:
				return getNamespace();
			case UML2Package.INTERACTION_CONSTRAINT__SPECIFICATION:
				return getSpecification();
			case UML2Package.INTERACTION_CONSTRAINT__CONSTRAINED_ELEMENT:
				return getConstrainedElements();
			case UML2Package.INTERACTION_CONSTRAINT__MININT:
				return getMinint();
			case UML2Package.INTERACTION_CONSTRAINT__MAXINT:
				return getMaxint();
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
			case UML2Package.INTERACTION_CONSTRAINT__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.INTERACTION_CONSTRAINT__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.INTERACTION_CONSTRAINT__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection)newValue);
				return;
			case UML2Package.INTERACTION_CONSTRAINT__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case UML2Package.INTERACTION_CONSTRAINT__NAME:
				setName((String)newValue);
				return;
			case UML2Package.INTERACTION_CONSTRAINT__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case UML2Package.INTERACTION_CONSTRAINT__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection)newValue);
				return;
			case UML2Package.INTERACTION_CONSTRAINT__NAME_EXPRESSION:
				setNameExpression((StringExpression)newValue);
				return;
			case UML2Package.INTERACTION_CONSTRAINT__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)newValue);
				return;
			case UML2Package.INTERACTION_CONSTRAINT__OWNING_PARAMETER:
				setOwningParameter((TemplateParameter)newValue);
				return;
			case UML2Package.INTERACTION_CONSTRAINT__PACKAGEABLE_ELEMENT_VISIBILITY:
				setPackageableElement_visibility((VisibilityKind)newValue);
				return;
			case UML2Package.INTERACTION_CONSTRAINT__NAMESPACE:
				setNamespace((Namespace)newValue);
				return;
			case UML2Package.INTERACTION_CONSTRAINT__SPECIFICATION:
				setSpecification((ValueSpecification)newValue);
				return;
			case UML2Package.INTERACTION_CONSTRAINT__CONSTRAINED_ELEMENT:
				getConstrainedElements().clear();
				getConstrainedElements().addAll((Collection)newValue);
				return;
			case UML2Package.INTERACTION_CONSTRAINT__MININT:
				setMinint((ValueSpecification)newValue);
				return;
			case UML2Package.INTERACTION_CONSTRAINT__MAXINT:
				setMaxint((ValueSpecification)newValue);
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
			case UML2Package.INTERACTION_CONSTRAINT__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.INTERACTION_CONSTRAINT__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.INTERACTION_CONSTRAINT__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				return;
			case UML2Package.INTERACTION_CONSTRAINT__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case UML2Package.INTERACTION_CONSTRAINT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UML2Package.INTERACTION_CONSTRAINT__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UML2Package.INTERACTION_CONSTRAINT__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				return;
			case UML2Package.INTERACTION_CONSTRAINT__NAME_EXPRESSION:
				setNameExpression((StringExpression)null);
				return;
			case UML2Package.INTERACTION_CONSTRAINT__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)null);
				return;
			case UML2Package.INTERACTION_CONSTRAINT__OWNING_PARAMETER:
				setOwningParameter((TemplateParameter)null);
				return;
			case UML2Package.INTERACTION_CONSTRAINT__PACKAGEABLE_ELEMENT_VISIBILITY:
				setPackageableElement_visibility(PACKAGEABLE_ELEMENT_VISIBILITY_EDEFAULT);
				return;
			case UML2Package.INTERACTION_CONSTRAINT__NAMESPACE:
				setNamespace((Namespace)null);
				return;
			case UML2Package.INTERACTION_CONSTRAINT__SPECIFICATION:
				setSpecification((ValueSpecification)null);
				return;
			case UML2Package.INTERACTION_CONSTRAINT__CONSTRAINED_ELEMENT:
				getConstrainedElements().clear();
				return;
			case UML2Package.INTERACTION_CONSTRAINT__MININT:
				setMinint((ValueSpecification)null);
				return;
			case UML2Package.INTERACTION_CONSTRAINT__MAXINT:
				setMaxint((ValueSpecification)null);
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
			case UML2Package.INTERACTION_CONSTRAINT__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.INTERACTION_CONSTRAINT__OWNED_ELEMENT:
				return isSetOwnedElements();
			case UML2Package.INTERACTION_CONSTRAINT__OWNER:
				return isSetOwner();
			case UML2Package.INTERACTION_CONSTRAINT__OWNED_COMMENT:
				EList ownedComment = (EList)eVirtualGet(UML2Package.INTERACTION_CONSTRAINT__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.INTERACTION_CONSTRAINT__TEMPLATE_BINDING:
				EList templateBinding = (EList)eVirtualGet(UML2Package.INTERACTION_CONSTRAINT__TEMPLATE_BINDING);
				return templateBinding != null && !templateBinding.isEmpty();
			case UML2Package.INTERACTION_CONSTRAINT__OWNED_TEMPLATE_SIGNATURE:
				return eVirtualGet(UML2Package.INTERACTION_CONSTRAINT__OWNED_TEMPLATE_SIGNATURE) != null;
			case UML2Package.INTERACTION_CONSTRAINT__NAME:
				String name = (String)eVirtualGet(UML2Package.INTERACTION_CONSTRAINT__NAME, NAME_EDEFAULT);
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.INTERACTION_CONSTRAINT__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UML2Package.INTERACTION_CONSTRAINT__VISIBILITY:
				return isSetVisibility();
			case UML2Package.INTERACTION_CONSTRAINT__CLIENT_DEPENDENCY:
				EList clientDependency = (EList)eVirtualGet(UML2Package.INTERACTION_CONSTRAINT__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UML2Package.INTERACTION_CONSTRAINT__NAME_EXPRESSION:
				return eVirtualGet(UML2Package.INTERACTION_CONSTRAINT__NAME_EXPRESSION) != null;
			case UML2Package.INTERACTION_CONSTRAINT__TEMPLATE_PARAMETER:
				return eVirtualGet(UML2Package.INTERACTION_CONSTRAINT__TEMPLATE_PARAMETER) != null;
			case UML2Package.INTERACTION_CONSTRAINT__OWNING_PARAMETER:
				return getOwningParameter() != null;
			case UML2Package.INTERACTION_CONSTRAINT__PACKAGEABLE_ELEMENT_VISIBILITY:
				return isSetPackageableElement_visibility();
			case UML2Package.INTERACTION_CONSTRAINT__CONTEXT:
				return isSetContext();
			case UML2Package.INTERACTION_CONSTRAINT__NAMESPACE:
				return isSetNamespace();
			case UML2Package.INTERACTION_CONSTRAINT__SPECIFICATION:
				return eVirtualGet(UML2Package.INTERACTION_CONSTRAINT__SPECIFICATION) != null;
			case UML2Package.INTERACTION_CONSTRAINT__CONSTRAINED_ELEMENT:
				EList constrainedElement = (EList)eVirtualGet(UML2Package.INTERACTION_CONSTRAINT__CONSTRAINED_ELEMENT);
				return constrainedElement != null && !constrainedElement.isEmpty();
			case UML2Package.INTERACTION_CONSTRAINT__MININT:
				return eVirtualGet(UML2Package.INTERACTION_CONSTRAINT__MININT) != null;
			case UML2Package.INTERACTION_CONSTRAINT__MAXINT:
				return eVirtualGet(UML2Package.INTERACTION_CONSTRAINT__MAXINT) != null;
		}
		return eDynamicIsSet(featureID);
	}


} //InteractionConstraintImpl
