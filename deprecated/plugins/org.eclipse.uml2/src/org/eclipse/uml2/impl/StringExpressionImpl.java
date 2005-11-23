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
 * $Id: StringExpressionImpl.java,v 1.17 2005/11/23 20:05:09 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.Element;
import org.eclipse.uml2.StringExpression;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>String Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.StringExpressionImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.StringExpressionImpl#getSubExpressions <em>Sub Expression</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.StringExpressionImpl#getOwningExpression <em>Owning Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StringExpressionImpl extends TemplateableElementImpl implements StringExpression {
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
	protected StringExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UML2Package.Literals.STRING_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedElements() {
		EList ownedElement = (EList)eVirtualGet(UML2Package.STRING_EXPRESSION__OWNED_ELEMENT);
		if (ownedElement == null) {
			eVirtualSet(UML2Package.STRING_EXPRESSION__OWNED_ELEMENT, ownedElement = new DerivedUnionEObjectEList(Element.class, this, UML2Package.STRING_EXPRESSION__OWNED_ELEMENT, new int[] {UML2Package.STRING_EXPRESSION__OWNED_COMMENT, UML2Package.STRING_EXPRESSION__TEMPLATE_BINDING, UML2Package.STRING_EXPRESSION__OWNED_TEMPLATE_SIGNATURE, UML2Package.STRING_EXPRESSION__SUB_EXPRESSION}));
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
			|| eIsSet(UML2Package.STRING_EXPRESSION__SUB_EXPRESSION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSubExpressions() {
		EList subExpression = (EList)eVirtualGet(UML2Package.STRING_EXPRESSION__SUB_EXPRESSION);
		if (subExpression == null) {
			eVirtualSet(UML2Package.STRING_EXPRESSION__SUB_EXPRESSION, subExpression = new EObjectContainmentWithInverseEList(StringExpression.class, this, UML2Package.STRING_EXPRESSION__SUB_EXPRESSION, UML2Package.STRING_EXPRESSION__OWNING_EXPRESSION));
		}
		return subExpression;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @deprecated Use #createSubExpression() instead.
	 */
	public StringExpression createSubExpression(EClass eClass) {
		StringExpression newSubExpression = (StringExpression) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.STRING_EXPRESSION__SUB_EXPRESSION, null, newSubExpression));
		}
		getSubExpressions().add(newSubExpression);
		return newSubExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public StringExpression createSubExpression() {
		StringExpression newSubExpression = UML2Factory.eINSTANCE.createStringExpression();
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.STRING_EXPRESSION__SUB_EXPRESSION, null, newSubExpression));
		}
		getSubExpressions().add(newSubExpression);
		return newSubExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringExpression getOwningExpression() {
		if (eContainerFeatureID != UML2Package.STRING_EXPRESSION__OWNING_EXPRESSION) return null;
		return (StringExpression)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningExpression(StringExpression newOwningExpression) {
		if (newOwningExpression != eInternalContainer() || (eContainerFeatureID != UML2Package.STRING_EXPRESSION__OWNING_EXPRESSION && newOwningExpression != null)) {
			if (EcoreUtil.isAncestor(this, newOwningExpression))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningExpression != null)
				msgs = ((InternalEObject)newOwningExpression).eInverseAdd(this, UML2Package.STRING_EXPRESSION__SUB_EXPRESSION, StringExpression.class, msgs);
			msgs = eBasicSetContainer((InternalEObject)newOwningExpression, UML2Package.STRING_EXPRESSION__OWNING_EXPRESSION, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.STRING_EXPRESSION__OWNING_EXPRESSION, newOwningExpression, newOwningExpression));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetOwner() {
		StringExpression owningExpression = getOwningExpression();			
		if (owningExpression != null) {
			return owningExpression;
		}
		return super.basicGetOwner();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwner() {
		return super.isSetOwner()
			|| eIsSet(UML2Package.STRING_EXPRESSION__OWNING_EXPRESSION);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UML2Package.STRING_EXPRESSION__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicAdd(otherEnd, msgs);
				case UML2Package.STRING_EXPRESSION__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicAdd(otherEnd, msgs);
				case UML2Package.STRING_EXPRESSION__OWNED_TEMPLATE_SIGNATURE:
					TemplateSignature ownedTemplateSignature = (TemplateSignature)eVirtualGet(UML2Package.STRING_EXPRESSION__OWNED_TEMPLATE_SIGNATURE);
					if (ownedTemplateSignature != null)
						msgs = ((InternalEObject)ownedTemplateSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.STRING_EXPRESSION__OWNED_TEMPLATE_SIGNATURE, null, msgs);
					return basicSetOwnedTemplateSignature((TemplateSignature)otherEnd, msgs);
				case UML2Package.STRING_EXPRESSION__SUB_EXPRESSION:
					return ((InternalEList)getSubExpressions()).basicAdd(otherEnd, msgs);
				case UML2Package.STRING_EXPRESSION__OWNING_EXPRESSION:
					if (eInternalContainer() != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, UML2Package.STRING_EXPRESSION__OWNING_EXPRESSION, msgs);
				default:
					return eDynamicInverseAdd(otherEnd, featureID, baseClass, msgs);
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UML2Package.STRING_EXPRESSION__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
				case UML2Package.STRING_EXPRESSION__OWNED_COMMENT:
					return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
				case UML2Package.STRING_EXPRESSION__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicRemove(otherEnd, msgs);
				case UML2Package.STRING_EXPRESSION__OWNED_TEMPLATE_SIGNATURE:
					return basicSetOwnedTemplateSignature(null, msgs);
				case UML2Package.STRING_EXPRESSION__SUB_EXPRESSION:
					return ((InternalEList)getSubExpressions()).basicRemove(otherEnd, msgs);
				case UML2Package.STRING_EXPRESSION__OWNING_EXPRESSION:
					return eBasicSetContainer(null, UML2Package.STRING_EXPRESSION__OWNING_EXPRESSION, msgs);
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
	public NotificationChain eBasicRemoveFromContainer(NotificationChain msgs) {
		if (eContainerFeatureID >= 0) {
			switch (eContainerFeatureID) {
				case UML2Package.STRING_EXPRESSION__OWNING_EXPRESSION:
					return eInternalContainer().eInverseRemove(this, UML2Package.STRING_EXPRESSION__SUB_EXPRESSION, StringExpression.class, msgs);
				default:
					return eDynamicBasicRemoveFromContainer(msgs);
			}
		}
		return eInternalContainer().eInverseRemove(this, EOPPOSITE_FEATURE_BASE - eContainerFeatureID, null, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UML2Package.STRING_EXPRESSION__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.STRING_EXPRESSION__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.STRING_EXPRESSION__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.STRING_EXPRESSION__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.STRING_EXPRESSION__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.STRING_EXPRESSION__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UML2Package.STRING_EXPRESSION__SUB_EXPRESSION:
				return getSubExpressions();
			case UML2Package.STRING_EXPRESSION__OWNING_EXPRESSION:
				return getOwningExpression();
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
			case UML2Package.STRING_EXPRESSION__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.STRING_EXPRESSION__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.STRING_EXPRESSION__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection)newValue);
				return;
			case UML2Package.STRING_EXPRESSION__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case UML2Package.STRING_EXPRESSION__SUB_EXPRESSION:
				getSubExpressions().clear();
				getSubExpressions().addAll((Collection)newValue);
				return;
			case UML2Package.STRING_EXPRESSION__OWNING_EXPRESSION:
				setOwningExpression((StringExpression)newValue);
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
			case UML2Package.STRING_EXPRESSION__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.STRING_EXPRESSION__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.STRING_EXPRESSION__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				return;
			case UML2Package.STRING_EXPRESSION__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case UML2Package.STRING_EXPRESSION__SUB_EXPRESSION:
				getSubExpressions().clear();
				return;
			case UML2Package.STRING_EXPRESSION__OWNING_EXPRESSION:
				setOwningExpression((StringExpression)null);
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
			case UML2Package.STRING_EXPRESSION__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.STRING_EXPRESSION__OWNED_ELEMENT:
				return isSetOwnedElements();
			case UML2Package.STRING_EXPRESSION__OWNER:
				return isSetOwner();
			case UML2Package.STRING_EXPRESSION__OWNED_COMMENT:
				EList ownedComment = (EList)eVirtualGet(UML2Package.STRING_EXPRESSION__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.STRING_EXPRESSION__TEMPLATE_BINDING:
				EList templateBinding = (EList)eVirtualGet(UML2Package.STRING_EXPRESSION__TEMPLATE_BINDING);
				return templateBinding != null && !templateBinding.isEmpty();
			case UML2Package.STRING_EXPRESSION__OWNED_TEMPLATE_SIGNATURE:
				return eVirtualGet(UML2Package.STRING_EXPRESSION__OWNED_TEMPLATE_SIGNATURE) != null;
			case UML2Package.STRING_EXPRESSION__SUB_EXPRESSION:
				EList subExpression = (EList)eVirtualGet(UML2Package.STRING_EXPRESSION__SUB_EXPRESSION);
				return subExpression != null && !subExpression.isEmpty();
			case UML2Package.STRING_EXPRESSION__OWNING_EXPRESSION:
				return getOwningExpression() != null;
		}
		return eDynamicIsSet(featureID);
	}


} //StringExpressionImpl
