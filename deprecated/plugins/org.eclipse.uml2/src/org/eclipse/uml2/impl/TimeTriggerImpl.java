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
 * $Id: TimeTriggerImpl.java,v 1.16 2005/11/14 17:31:07 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.Element;
import org.eclipse.uml2.StringExpression;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.TimeTrigger;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.ValueSpecification;

import org.eclipse.uml2.VisibilityKind;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Trigger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.TimeTriggerImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.TimeTriggerImpl#isRelative <em>Is Relative</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.TimeTriggerImpl#getWhen <em>When</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TimeTriggerImpl extends TriggerImpl implements TimeTrigger {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * The default value of the '{@link #isRelative() <em>Is Relative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRelative()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_RELATIVE_EDEFAULT = false;

	/**
	 * The flag representing the value of the '{@link #isRelative() <em>Is Relative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRelative()
	 * @generated
	 * @ordered
	 */
	protected static final int IS_RELATIVE_EFLAG = 1 << 8;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeTriggerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UML2Package.eINSTANCE.getTimeTrigger();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedElements() {
		EList ownedElement = (EList)eVirtualGet(UML2Package.TIME_TRIGGER__OWNED_ELEMENT);
		if (ownedElement == null) {
			eVirtualSet(UML2Package.TIME_TRIGGER__OWNED_ELEMENT, ownedElement = new DerivedUnionEObjectEList(Element.class, this, UML2Package.TIME_TRIGGER__OWNED_ELEMENT, new EStructuralFeature[] {UML2Package.eINSTANCE.getElement_OwnedComment(), UML2Package.eINSTANCE.getTemplateableElement_TemplateBinding(), UML2Package.eINSTANCE.getTemplateableElement_OwnedTemplateSignature(), UML2Package.eINSTANCE.getNamedElement_NameExpression(), UML2Package.eINSTANCE.getTimeTrigger_When()}));
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
			|| eIsSet(UML2Package.eINSTANCE.getTimeTrigger_When());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRelative() {
		return (eFlags & IS_RELATIVE_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsRelative(boolean newIsRelative) {
		boolean oldIsRelative = (eFlags & IS_RELATIVE_EFLAG) != 0;
		if (newIsRelative) eFlags |= IS_RELATIVE_EFLAG; else eFlags &= ~IS_RELATIVE_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.TIME_TRIGGER__IS_RELATIVE, oldIsRelative, newIsRelative));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getWhen() {
		ValueSpecification when = (ValueSpecification)eVirtualGet(UML2Package.TIME_TRIGGER__WHEN);
		return when;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhen(ValueSpecification newWhen, NotificationChain msgs) {
		Object oldWhen = eVirtualSet(UML2Package.TIME_TRIGGER__WHEN, newWhen);
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UML2Package.TIME_TRIGGER__WHEN, oldWhen == EVIRTUAL_NO_VALUE ? null : oldWhen, newWhen);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhen(ValueSpecification newWhen) {
		ValueSpecification when = (ValueSpecification)eVirtualGet(UML2Package.TIME_TRIGGER__WHEN);
		if (newWhen != when) {
			NotificationChain msgs = null;
			if (when != null)
				msgs = ((InternalEObject)when).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.TIME_TRIGGER__WHEN, null, msgs);
			if (newWhen != null)
				msgs = ((InternalEObject)newWhen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UML2Package.TIME_TRIGGER__WHEN, null, msgs);
			msgs = basicSetWhen(newWhen, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.TIME_TRIGGER__WHEN, newWhen, newWhen));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification createWhen(EClass eClass) {
		ValueSpecification newWhen = (ValueSpecification) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.TIME_TRIGGER__WHEN, null, newWhen));
		}
		setWhen(newWhen);
		return newWhen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UML2Package.TIME_TRIGGER__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
				case UML2Package.TIME_TRIGGER__OWNED_COMMENT:
					return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
				case UML2Package.TIME_TRIGGER__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicRemove(otherEnd, msgs);
				case UML2Package.TIME_TRIGGER__OWNED_TEMPLATE_SIGNATURE:
					return basicSetOwnedTemplateSignature(null, msgs);
				case UML2Package.TIME_TRIGGER__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicRemove(otherEnd, msgs);
				case UML2Package.TIME_TRIGGER__NAME_EXPRESSION:
					return basicSetNameExpression(null, msgs);
				case UML2Package.TIME_TRIGGER__WHEN:
					return basicSetWhen(null, msgs);
				default:
					return eDynamicInverseRemove(otherEnd, featureID, baseClass, msgs);
			}
		}
		return eBasicSetContainer(null, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UML2Package.TIME_TRIGGER__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.TIME_TRIGGER__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.TIME_TRIGGER__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.TIME_TRIGGER__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.TIME_TRIGGER__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.TIME_TRIGGER__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UML2Package.TIME_TRIGGER__NAME:
				return getName();
			case UML2Package.TIME_TRIGGER__QUALIFIED_NAME:
				return getQualifiedName();
			case UML2Package.TIME_TRIGGER__VISIBILITY:
				return getVisibility();
			case UML2Package.TIME_TRIGGER__CLIENT_DEPENDENCY:
				return getClientDependencies();
			case UML2Package.TIME_TRIGGER__NAME_EXPRESSION:
				return getNameExpression();
			case UML2Package.TIME_TRIGGER__PORT:
				return getPorts();
			case UML2Package.TIME_TRIGGER__IS_RELATIVE:
				return isRelative() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.TIME_TRIGGER__WHEN:
				return getWhen();
		}
		return eDynamicGet(eFeature, resolve);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(EStructuralFeature eFeature, Object newValue) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UML2Package.TIME_TRIGGER__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.TIME_TRIGGER__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.TIME_TRIGGER__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection)newValue);
				return;
			case UML2Package.TIME_TRIGGER__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case UML2Package.TIME_TRIGGER__NAME:
				setName((String)newValue);
				return;
			case UML2Package.TIME_TRIGGER__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case UML2Package.TIME_TRIGGER__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection)newValue);
				return;
			case UML2Package.TIME_TRIGGER__NAME_EXPRESSION:
				setNameExpression((StringExpression)newValue);
				return;
			case UML2Package.TIME_TRIGGER__PORT:
				getPorts().clear();
				getPorts().addAll((Collection)newValue);
				return;
			case UML2Package.TIME_TRIGGER__IS_RELATIVE:
				setIsRelative(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.TIME_TRIGGER__WHEN:
				setWhen((ValueSpecification)newValue);
				return;
		}
		eDynamicSet(eFeature, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UML2Package.TIME_TRIGGER__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.TIME_TRIGGER__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.TIME_TRIGGER__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				return;
			case UML2Package.TIME_TRIGGER__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case UML2Package.TIME_TRIGGER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UML2Package.TIME_TRIGGER__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UML2Package.TIME_TRIGGER__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				return;
			case UML2Package.TIME_TRIGGER__NAME_EXPRESSION:
				setNameExpression((StringExpression)null);
				return;
			case UML2Package.TIME_TRIGGER__PORT:
				getPorts().clear();
				return;
			case UML2Package.TIME_TRIGGER__IS_RELATIVE:
				setIsRelative(IS_RELATIVE_EDEFAULT);
				return;
			case UML2Package.TIME_TRIGGER__WHEN:
				setWhen((ValueSpecification)null);
				return;
		}
		eDynamicUnset(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UML2Package.TIME_TRIGGER__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.TIME_TRIGGER__OWNED_ELEMENT:
				return isSetOwnedElements();
			case UML2Package.TIME_TRIGGER__OWNER:
				return isSetOwner();
			case UML2Package.TIME_TRIGGER__OWNED_COMMENT:
				EList ownedComment = (EList)eVirtualGet(UML2Package.TIME_TRIGGER__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.TIME_TRIGGER__TEMPLATE_BINDING:
				EList templateBinding = (EList)eVirtualGet(UML2Package.TIME_TRIGGER__TEMPLATE_BINDING);
				return templateBinding != null && !templateBinding.isEmpty();
			case UML2Package.TIME_TRIGGER__OWNED_TEMPLATE_SIGNATURE:
				return eVirtualGet(UML2Package.TIME_TRIGGER__OWNED_TEMPLATE_SIGNATURE) != null;
			case UML2Package.TIME_TRIGGER__NAME:
				String name = eVirtualIsSet(UML2Package.TIME_TRIGGER__NAME) ? (String)eVirtualGet(UML2Package.TIME_TRIGGER__NAME) : NAME_EDEFAULT;
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.TIME_TRIGGER__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UML2Package.TIME_TRIGGER__VISIBILITY:
				return eVirtualIsSet(UML2Package.TIME_TRIGGER__VISIBILITY) && eVirtualGet(UML2Package.TIME_TRIGGER__VISIBILITY) != VISIBILITY_EDEFAULT;
			case UML2Package.TIME_TRIGGER__CLIENT_DEPENDENCY:
				EList clientDependency = (EList)eVirtualGet(UML2Package.TIME_TRIGGER__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UML2Package.TIME_TRIGGER__NAME_EXPRESSION:
				return eVirtualGet(UML2Package.TIME_TRIGGER__NAME_EXPRESSION) != null;
			case UML2Package.TIME_TRIGGER__PORT:
				EList port = (EList)eVirtualGet(UML2Package.TIME_TRIGGER__PORT);
				return port != null && !port.isEmpty();
			case UML2Package.TIME_TRIGGER__IS_RELATIVE:
				return ((eFlags & IS_RELATIVE_EFLAG) != 0) != IS_RELATIVE_EDEFAULT;
			case UML2Package.TIME_TRIGGER__WHEN:
				return eVirtualGet(UML2Package.TIME_TRIGGER__WHEN) != null;
		}
		return eDynamicIsSet(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isRelative: "); //$NON-NLS-1$
		result.append((eFlags & IS_RELATIVE_EFLAG) != 0);
		result.append(')');
		return result.toString();
	}


} //TimeTriggerImpl
