/*
 * Copyright (c) 2003, 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 */
package org.eclipse.uml2.impl;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.uml2.Constraint;
import org.eclipse.uml2.Interaction;
import org.eclipse.uml2.InteractionOperand;
import org.eclipse.uml2.Lifeline;
import org.eclipse.uml2.StateInvariant;
import org.eclipse.uml2.StringExpression;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Invariant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.StateInvariantImpl#getInvariant <em>Invariant</em>}</li>
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
	public static final String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getInvariant() <em>Invariant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvariant()
	 * @generated
	 * @ordered
	 */
	protected Constraint invariant = null;

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
		return UML2Package.eINSTANCE.getStateInvariant();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Invariant</b></em>' containment reference.
	 * <p>
	 * Subsets the following features:
	 * <ul>
	 *   <li>{@link org.eclipse.uml2.Element#getOwnedElements}</li>
	 * </ul>
	 * </p>
	 * @generated
	 */
	public Constraint getInvariant() {
		return invariant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInvariant(Constraint newInvariant, NotificationChain msgs) {
		Constraint oldInvariant = invariant;
		invariant = newInvariant;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UML2Package.STATE_INVARIANT__INVARIANT, oldInvariant, newInvariant);
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
	 * @generated
	 */
	public Constraint createInvariant(EClass eClass) {
		Constraint newInvariant = (Constraint) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.CREATE, UML2Package.STATE_INVARIANT__INVARIANT, null, newInvariant));
		}
        setInvariant(newInvariant);
		return newInvariant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Covered</b></em>' reference.
	 * <p>
	 * Redefines the following features:
	 * <ul>
	 *   <li>{@link org.eclipse.uml2.InteractionFragment#getCovereds}</li>
	 * </ul>
	 * </p>
	 * @generated
	 */
	public EList getCoveredsGen() {
		// TODO: implement this redefinition getter
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	public EList getCovereds() {
		// TODO: test this redefinition getter
		if (covered == null) {
			covered =
				new EObjectWithInverseResolvingEList.ManyInverse(Lifeline.class, this, UML2Package.STATE_INVARIANT__COVERED, UML2Package.LIFELINE__COVERED_BY);
		}
		return covered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Owned Element</b></em>' reference list, a derived union.
	 * The list contents are of type {@link org.eclipse.uml2.Element}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.Element#getOwner <em>Owner</em>}'.
	 * @generated
	 */
	public EList getOwnedElements() {
		// TODO: test this union getter
		if (!getCacheAdapter().containsKey(this, UML2Package.eINSTANCE.getElement_OwnedElement())) {
			Set union = new LinkedHashSet();
			union.addAll(super.getOwnedElements());
			if (null != getInvariant()) {
				union.add(getInvariant());
			}
			getCacheAdapter().put(
				this,
				UML2Package.eINSTANCE.getElement_OwnedElement(),
				new EcoreEList.UnmodifiableEList(this, 
					UML2Package.eINSTANCE.getElement_OwnedElement(),
					union.size(),
					union.toArray()));
		}
		return (EList) getCacheAdapter().get(this, UML2Package.eINSTANCE.getElement_OwnedElement());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UML2Package.STATE_INVARIANT__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicAdd(otherEnd, msgs);
				case UML2Package.STATE_INVARIANT__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicAdd(otherEnd, msgs);
				case UML2Package.STATE_INVARIANT__OWNED_TEMPLATE_SIGNATURE:
					if (ownedTemplateSignature != null)
						msgs = ((InternalEObject)ownedTemplateSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.STATE_INVARIANT__OWNED_TEMPLATE_SIGNATURE, null, msgs);
					return basicSetOwnedTemplateSignature((TemplateSignature)otherEnd, msgs);
				case UML2Package.STATE_INVARIANT__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicAdd(otherEnd, msgs);
				case UML2Package.STATE_INVARIANT__COVERED:
					return ((InternalEList)getCovereds()).basicAdd(otherEnd, msgs);
				case UML2Package.STATE_INVARIANT__ENCLOSING_INTERACTION:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, UML2Package.STATE_INVARIANT__ENCLOSING_INTERACTION, msgs);
				case UML2Package.STATE_INVARIANT__ENCLOSING_OPERAND:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, UML2Package.STATE_INVARIANT__ENCLOSING_OPERAND, msgs);
				default:
					return eDynamicInverseAdd(otherEnd, featureID, baseClass, msgs);
			}
		}
		if (eContainer != null)
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
	public NotificationChain eBasicRemoveFromContainer(NotificationChain msgs) {
		if (eContainerFeatureID >= 0) {
			switch (eContainerFeatureID) {
				case UML2Package.STATE_INVARIANT__ENCLOSING_INTERACTION:
					return eContainer.eInverseRemove(this, UML2Package.INTERACTION__FRAGMENT, Interaction.class, msgs);
				case UML2Package.STATE_INVARIANT__ENCLOSING_OPERAND:
					return eContainer.eInverseRemove(this, UML2Package.INTERACTION_OPERAND__FRAGMENT, InteractionOperand.class, msgs);
				default:
					return eDynamicBasicRemoveFromContainer(msgs);
			}
		}
		return eContainer.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - eContainerFeatureID, null, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
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
		return eDynamicGet(eFeature, resolve);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(EStructuralFeature eFeature, Object newValue) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
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
		eDynamicSet(eFeature, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
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
		eDynamicUnset(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UML2Package.STATE_INVARIANT__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.STATE_INVARIANT__OWNED_ELEMENT:
				return !getOwnedElements().isEmpty();
			case UML2Package.STATE_INVARIANT__OWNER:
				return basicGetOwner() != null;
			case UML2Package.STATE_INVARIANT__OWNED_COMMENT:
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.STATE_INVARIANT__TEMPLATE_BINDING:
				return templateBinding != null && !templateBinding.isEmpty();
			case UML2Package.STATE_INVARIANT__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case UML2Package.STATE_INVARIANT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.STATE_INVARIANT__QUALIFIED_NAME:
				return !"".equals(getQualifiedName()); //$NON-NLS-1$
			case UML2Package.STATE_INVARIANT__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case UML2Package.STATE_INVARIANT__CLIENT_DEPENDENCY:
				return clientDependency != null && !clientDependency.isEmpty();
			case UML2Package.STATE_INVARIANT__NAME_EXPRESSION:
				return nameExpression != null;
			case UML2Package.STATE_INVARIANT__COVERED:
				return covered != null && !covered.isEmpty();
			case UML2Package.STATE_INVARIANT__GENERAL_ORDERING:
				return generalOrdering != null && !generalOrdering.isEmpty();
			case UML2Package.STATE_INVARIANT__ENCLOSING_INTERACTION:
				return getEnclosingInteraction() != null;
			case UML2Package.STATE_INVARIANT__ENCLOSING_OPERAND:
				return getEnclosingOperand() != null;
			case UML2Package.STATE_INVARIANT__INVARIANT:
				return invariant != null;
		}
		return eDynamicIsSet(eFeature);
	}

} //StateInvariantImpl
