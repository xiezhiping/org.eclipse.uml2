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
 * $Id: StateInvariantImpl.java,v 1.22 2005/11/23 20:05:07 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

//import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.Constraint;
import org.eclipse.uml2.Element;
import org.eclipse.uml2.Interaction;
import org.eclipse.uml2.InteractionOperand;
import org.eclipse.uml2.Lifeline;
import org.eclipse.uml2.StateInvariant;
import org.eclipse.uml2.StringExpression;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.VisibilityKind;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Invariant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.StateInvariantImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.StateInvariantImpl#getInvariant <em>Invariant</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.StateInvariantImpl#getCovereds <em>Covered</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StateInvariantImpl extends InteractionFragmentImpl implements StateInvariant {
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
	protected StateInvariantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UML2Package.Literals.STATE_INVARIANT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedElements() {
		EList ownedElement = (EList)eVirtualGet(UML2Package.STATE_INVARIANT__OWNED_ELEMENT);
		if (ownedElement == null) {
			eVirtualSet(UML2Package.STATE_INVARIANT__OWNED_ELEMENT, ownedElement = new DerivedUnionEObjectEList(Element.class, this, UML2Package.STATE_INVARIANT__OWNED_ELEMENT, new int[] {UML2Package.STATE_INVARIANT__OWNED_COMMENT, UML2Package.STATE_INVARIANT__TEMPLATE_BINDING, UML2Package.STATE_INVARIANT__OWNED_TEMPLATE_SIGNATURE, UML2Package.STATE_INVARIANT__NAME_EXPRESSION, UML2Package.STATE_INVARIANT__GENERAL_ORDERING, UML2Package.STATE_INVARIANT__INVARIANT}));
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
			|| eIsSet(UML2Package.STATE_INVARIANT__INVARIANT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint getInvariant() {
		return (Constraint)eVirtualGet(UML2Package.STATE_INVARIANT__INVARIANT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInvariant(Constraint newInvariant, NotificationChain msgs) {
		Object oldInvariant = eVirtualSet(UML2Package.STATE_INVARIANT__INVARIANT, newInvariant);
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UML2Package.STATE_INVARIANT__INVARIANT, oldInvariant == EVIRTUAL_NO_VALUE ? null : oldInvariant, newInvariant);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInvariant(Constraint newInvariant) {
		Constraint invariant = (Constraint)eVirtualGet(UML2Package.STATE_INVARIANT__INVARIANT);
		if (newInvariant != invariant) {
			NotificationChain msgs = null;
			if (invariant != null)
				msgs = ((InternalEObject)invariant).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.STATE_INVARIANT__INVARIANT, null, msgs);
			if (newInvariant != null)
				msgs = ((InternalEObject)newInvariant).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UML2Package.STATE_INVARIANT__INVARIANT, null, msgs);
			msgs = basicSetInvariant(newInvariant, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.STATE_INVARIANT__INVARIANT, newInvariant, newInvariant));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Constraint createInvariant(EClass eClass) {
		Constraint newInvariant = (Constraint) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.STATE_INVARIANT__INVARIANT, null, newInvariant));
		}
		setInvariant(newInvariant);
		return newInvariant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Constraint createInvariant() {
		Constraint newInvariant = UML2Factory.eINSTANCE.createConstraint();
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.STATE_INVARIANT__INVARIANT, null, newInvariant));
		}
		setInvariant(newInvariant);
		return newInvariant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList getCovereds() {
		EList covered = (EList)eVirtualGet(UML2Package.STATE_INVARIANT__COVERED);
		if (covered == null) {
			eVirtualSet(UML2Package.STATE_INVARIANT__COVERED, covered = new EObjectWithInverseResolvingEList.ManyInverse(Lifeline.class, this, UML2Package.STATE_INVARIANT__COVERED, UML2Package.LIFELINE__COVERED_BY));
		}
		return covered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCovereds() {
		EList covered = (EList)eVirtualGet(UML2Package.STATE_INVARIANT__COVERED);
		return covered != null && !covered.isEmpty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public Lifeline getCovered(String name) {
		for (Iterator i = getCovereds().iterator(); i.hasNext(); ) {
			Lifeline covered = (Lifeline) i.next();
			if (name.equals(covered.getName())) {
				return covered;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UML2Package.STATE_INVARIANT__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
				case UML2Package.STATE_INVARIANT__OWNED_COMMENT:
					return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
				case UML2Package.STATE_INVARIANT__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicRemove(otherEnd, msgs);
				case UML2Package.STATE_INVARIANT__OWNED_TEMPLATE_SIGNATURE:
					return basicSetOwnedTemplateSignature(null, msgs);
				case UML2Package.STATE_INVARIANT__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicRemove(otherEnd, msgs);
				case UML2Package.STATE_INVARIANT__NAME_EXPRESSION:
					return basicSetNameExpression(null, msgs);
				case UML2Package.STATE_INVARIANT__COVERED:
					return ((InternalEList)getCovereds()).basicRemove(otherEnd, msgs);
				case UML2Package.STATE_INVARIANT__GENERAL_ORDERING:
					return ((InternalEList)getGeneralOrderings()).basicRemove(otherEnd, msgs);
				case UML2Package.STATE_INVARIANT__ENCLOSING_INTERACTION:
					return eBasicSetContainer(null, UML2Package.STATE_INVARIANT__ENCLOSING_INTERACTION, msgs);
				case UML2Package.STATE_INVARIANT__ENCLOSING_OPERAND:
					return eBasicSetContainer(null, UML2Package.STATE_INVARIANT__ENCLOSING_OPERAND, msgs);
				case UML2Package.STATE_INVARIANT__INVARIANT:
					return basicSetInvariant(null, msgs);
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UML2Package.STATE_INVARIANT__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.STATE_INVARIANT__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.STATE_INVARIANT__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.STATE_INVARIANT__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.STATE_INVARIANT__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.STATE_INVARIANT__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UML2Package.STATE_INVARIANT__NAME:
				return getName();
			case UML2Package.STATE_INVARIANT__QUALIFIED_NAME:
				return getQualifiedName();
			case UML2Package.STATE_INVARIANT__VISIBILITY:
				return getVisibility();
			case UML2Package.STATE_INVARIANT__CLIENT_DEPENDENCY:
				return getClientDependencies();
			case UML2Package.STATE_INVARIANT__NAME_EXPRESSION:
				return getNameExpression();
			case UML2Package.STATE_INVARIANT__COVERED:
				return getCovereds();
			case UML2Package.STATE_INVARIANT__GENERAL_ORDERING:
				return getGeneralOrderings();
			case UML2Package.STATE_INVARIANT__ENCLOSING_INTERACTION:
				return getEnclosingInteraction();
			case UML2Package.STATE_INVARIANT__ENCLOSING_OPERAND:
				return getEnclosingOperand();
			case UML2Package.STATE_INVARIANT__INVARIANT:
				return getInvariant();
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
			case UML2Package.STATE_INVARIANT__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.STATE_INVARIANT__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.STATE_INVARIANT__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection)newValue);
				return;
			case UML2Package.STATE_INVARIANT__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case UML2Package.STATE_INVARIANT__NAME:
				setName((String)newValue);
				return;
			case UML2Package.STATE_INVARIANT__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case UML2Package.STATE_INVARIANT__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection)newValue);
				return;
			case UML2Package.STATE_INVARIANT__NAME_EXPRESSION:
				setNameExpression((StringExpression)newValue);
				return;
			case UML2Package.STATE_INVARIANT__COVERED:
				getCovereds().clear();
				getCovereds().addAll((Collection)newValue);
				return;
			case UML2Package.STATE_INVARIANT__GENERAL_ORDERING:
				getGeneralOrderings().clear();
				getGeneralOrderings().addAll((Collection)newValue);
				return;
			case UML2Package.STATE_INVARIANT__ENCLOSING_INTERACTION:
				setEnclosingInteraction((Interaction)newValue);
				return;
			case UML2Package.STATE_INVARIANT__ENCLOSING_OPERAND:
				setEnclosingOperand((InteractionOperand)newValue);
				return;
			case UML2Package.STATE_INVARIANT__INVARIANT:
				setInvariant((Constraint)newValue);
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
			case UML2Package.STATE_INVARIANT__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.STATE_INVARIANT__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.STATE_INVARIANT__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				return;
			case UML2Package.STATE_INVARIANT__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case UML2Package.STATE_INVARIANT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UML2Package.STATE_INVARIANT__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UML2Package.STATE_INVARIANT__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				return;
			case UML2Package.STATE_INVARIANT__NAME_EXPRESSION:
				setNameExpression((StringExpression)null);
				return;
			case UML2Package.STATE_INVARIANT__COVERED:
				getCovereds().clear();
				return;
			case UML2Package.STATE_INVARIANT__GENERAL_ORDERING:
				getGeneralOrderings().clear();
				return;
			case UML2Package.STATE_INVARIANT__ENCLOSING_INTERACTION:
				setEnclosingInteraction((Interaction)null);
				return;
			case UML2Package.STATE_INVARIANT__ENCLOSING_OPERAND:
				setEnclosingOperand((InteractionOperand)null);
				return;
			case UML2Package.STATE_INVARIANT__INVARIANT:
				setInvariant((Constraint)null);
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
			case UML2Package.STATE_INVARIANT__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.STATE_INVARIANT__OWNED_ELEMENT:
				return isSetOwnedElements();
			case UML2Package.STATE_INVARIANT__OWNER:
				return isSetOwner();
			case UML2Package.STATE_INVARIANT__OWNED_COMMENT:
				EList ownedComment = (EList)eVirtualGet(UML2Package.STATE_INVARIANT__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.STATE_INVARIANT__TEMPLATE_BINDING:
				EList templateBinding = (EList)eVirtualGet(UML2Package.STATE_INVARIANT__TEMPLATE_BINDING);
				return templateBinding != null && !templateBinding.isEmpty();
			case UML2Package.STATE_INVARIANT__OWNED_TEMPLATE_SIGNATURE:
				return eVirtualGet(UML2Package.STATE_INVARIANT__OWNED_TEMPLATE_SIGNATURE) != null;
			case UML2Package.STATE_INVARIANT__NAME:
				String name = (String)eVirtualGet(UML2Package.STATE_INVARIANT__NAME, NAME_EDEFAULT);
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.STATE_INVARIANT__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UML2Package.STATE_INVARIANT__VISIBILITY:
				return eVirtualGet(UML2Package.STATE_INVARIANT__VISIBILITY, VISIBILITY_EDEFAULT) != VISIBILITY_EDEFAULT;
			case UML2Package.STATE_INVARIANT__CLIENT_DEPENDENCY:
				EList clientDependency = (EList)eVirtualGet(UML2Package.STATE_INVARIANT__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UML2Package.STATE_INVARIANT__NAME_EXPRESSION:
				return eVirtualGet(UML2Package.STATE_INVARIANT__NAME_EXPRESSION) != null;
			case UML2Package.STATE_INVARIANT__COVERED:
				return isSetCovereds();
			case UML2Package.STATE_INVARIANT__GENERAL_ORDERING:
				EList generalOrdering = (EList)eVirtualGet(UML2Package.STATE_INVARIANT__GENERAL_ORDERING);
				return generalOrdering != null && !generalOrdering.isEmpty();
			case UML2Package.STATE_INVARIANT__ENCLOSING_INTERACTION:
				return getEnclosingInteraction() != null;
			case UML2Package.STATE_INVARIANT__ENCLOSING_OPERAND:
				return getEnclosingOperand() != null;
			case UML2Package.STATE_INVARIANT__INVARIANT:
				return eVirtualGet(UML2Package.STATE_INVARIANT__INVARIANT) != null;
		}
		return eDynamicIsSet(featureID);
	}


} //StateInvariantImpl
