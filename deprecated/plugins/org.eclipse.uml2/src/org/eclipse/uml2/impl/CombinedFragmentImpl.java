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
 * $Id: CombinedFragmentImpl.java,v 1.14 2005/11/14 17:31:07 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.CombinedFragment;
import org.eclipse.uml2.Element;
import org.eclipse.uml2.Gate;
import org.eclipse.uml2.Interaction;
import org.eclipse.uml2.InteractionOperand;
import org.eclipse.uml2.InteractionOperator;
import org.eclipse.uml2.StringExpression;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.VisibilityKind;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Combined Fragment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.CombinedFragmentImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.CombinedFragmentImpl#getInteractionOperator <em>Interaction Operator</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.CombinedFragmentImpl#getOperands <em>Operand</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.CombinedFragmentImpl#getCfragmentGates <em>Cfragment Gate</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CombinedFragmentImpl extends InteractionFragmentImpl implements CombinedFragment {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * The default value of the '{@link #getInteractionOperator() <em>Interaction Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteractionOperator()
	 * @generated
	 * @ordered
	 */
	protected static final InteractionOperator INTERACTION_OPERATOR_EDEFAULT = InteractionOperator.SEQ_LITERAL;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CombinedFragmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UML2Package.eINSTANCE.getCombinedFragment();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedElements() {
		EList ownedElement = (EList)eVirtualGet(UML2Package.COMBINED_FRAGMENT__OWNED_ELEMENT);
		if (ownedElement == null) {
			eVirtualSet(UML2Package.COMBINED_FRAGMENT__OWNED_ELEMENT, ownedElement = new DerivedUnionEObjectEList(Element.class, this, UML2Package.COMBINED_FRAGMENT__OWNED_ELEMENT, new EStructuralFeature[] {UML2Package.eINSTANCE.getElement_OwnedComment(), UML2Package.eINSTANCE.getTemplateableElement_TemplateBinding(), UML2Package.eINSTANCE.getTemplateableElement_OwnedTemplateSignature(), UML2Package.eINSTANCE.getNamedElement_NameExpression(), UML2Package.eINSTANCE.getInteractionFragment_GeneralOrdering(), UML2Package.eINSTANCE.getCombinedFragment_Operand(), UML2Package.eINSTANCE.getCombinedFragment_CfragmentGate()}));
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
			|| eIsSet(UML2Package.eINSTANCE.getCombinedFragment_Operand())
			|| eIsSet(UML2Package.eINSTANCE.getCombinedFragment_CfragmentGate());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionOperator getInteractionOperator() {
		InteractionOperator interactionOperator = (InteractionOperator)eVirtualGet(UML2Package.COMBINED_FRAGMENT__INTERACTION_OPERATOR);
		return interactionOperator == null ? INTERACTION_OPERATOR_EDEFAULT : interactionOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInteractionOperator(InteractionOperator newInteractionOperator) {
		InteractionOperator interactionOperator = newInteractionOperator == null ? INTERACTION_OPERATOR_EDEFAULT : newInteractionOperator;
		Object oldInteractionOperator = eVirtualSet(UML2Package.COMBINED_FRAGMENT__INTERACTION_OPERATOR, interactionOperator);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.COMBINED_FRAGMENT__INTERACTION_OPERATOR, oldInteractionOperator == EVIRTUAL_NO_VALUE ? INTERACTION_OPERATOR_EDEFAULT : oldInteractionOperator, interactionOperator));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOperands() {
		EList operand = (EList)eVirtualGet(UML2Package.COMBINED_FRAGMENT__OPERAND);
		if (operand == null) {
			eVirtualSet(UML2Package.COMBINED_FRAGMENT__OPERAND, operand = new EObjectContainmentEList(InteractionOperand.class, this, UML2Package.COMBINED_FRAGMENT__OPERAND));
		}
		return operand;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public InteractionOperand getOperand(String name) {
		for (Iterator i = getOperands().iterator(); i.hasNext(); ) {
			InteractionOperand operand = (InteractionOperand) i.next();
			if (name.equals(operand.getName())) {
				return operand;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @deprecated Use #createOperand() instead.
	 */
	public InteractionOperand createOperand(EClass eClass) {
		InteractionOperand newOperand = (InteractionOperand) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.COMBINED_FRAGMENT__OPERAND, null, newOperand));
		}
		getOperands().add(newOperand);
		return newOperand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionOperand createOperand() {
		InteractionOperand newOperand = UML2Factory.eINSTANCE.createInteractionOperand();
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.COMBINED_FRAGMENT__OPERAND, null, newOperand));
		}
		getOperands().add(newOperand);
		return newOperand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getCfragmentGates() {
		EList cfragmentGate = (EList)eVirtualGet(UML2Package.COMBINED_FRAGMENT__CFRAGMENT_GATE);
		if (cfragmentGate == null) {
			eVirtualSet(UML2Package.COMBINED_FRAGMENT__CFRAGMENT_GATE, cfragmentGate = new EObjectContainmentEList(Gate.class, this, UML2Package.COMBINED_FRAGMENT__CFRAGMENT_GATE));
		}
		return cfragmentGate;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public Gate getCfragmentGate(String name) {
		for (Iterator i = getCfragmentGates().iterator(); i.hasNext(); ) {
			Gate cfragmentGate = (Gate) i.next();
			if (name.equals(cfragmentGate.getName())) {
				return cfragmentGate;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @deprecated Use #createCfragmentGate() instead.
	 */
	public Gate createCfragmentGate(EClass eClass) {
		Gate newCfragmentGate = (Gate) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.COMBINED_FRAGMENT__CFRAGMENT_GATE, null, newCfragmentGate));
		}
		getCfragmentGates().add(newCfragmentGate);
		return newCfragmentGate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gate createCfragmentGate() {
		Gate newCfragmentGate = UML2Factory.eINSTANCE.createGate();
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.COMBINED_FRAGMENT__CFRAGMENT_GATE, null, newCfragmentGate));
		}
		getCfragmentGates().add(newCfragmentGate);
		return newCfragmentGate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UML2Package.COMBINED_FRAGMENT__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
				case UML2Package.COMBINED_FRAGMENT__OWNED_COMMENT:
					return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
				case UML2Package.COMBINED_FRAGMENT__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicRemove(otherEnd, msgs);
				case UML2Package.COMBINED_FRAGMENT__OWNED_TEMPLATE_SIGNATURE:
					return basicSetOwnedTemplateSignature(null, msgs);
				case UML2Package.COMBINED_FRAGMENT__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicRemove(otherEnd, msgs);
				case UML2Package.COMBINED_FRAGMENT__NAME_EXPRESSION:
					return basicSetNameExpression(null, msgs);
				case UML2Package.COMBINED_FRAGMENT__COVERED:
					return ((InternalEList)getCovereds()).basicRemove(otherEnd, msgs);
				case UML2Package.COMBINED_FRAGMENT__GENERAL_ORDERING:
					return ((InternalEList)getGeneralOrderings()).basicRemove(otherEnd, msgs);
				case UML2Package.COMBINED_FRAGMENT__ENCLOSING_INTERACTION:
					return eBasicSetContainer(null, UML2Package.COMBINED_FRAGMENT__ENCLOSING_INTERACTION, msgs);
				case UML2Package.COMBINED_FRAGMENT__ENCLOSING_OPERAND:
					return eBasicSetContainer(null, UML2Package.COMBINED_FRAGMENT__ENCLOSING_OPERAND, msgs);
				case UML2Package.COMBINED_FRAGMENT__OPERAND:
					return ((InternalEList)getOperands()).basicRemove(otherEnd, msgs);
				case UML2Package.COMBINED_FRAGMENT__CFRAGMENT_GATE:
					return ((InternalEList)getCfragmentGates()).basicRemove(otherEnd, msgs);
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
			case UML2Package.COMBINED_FRAGMENT__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.COMBINED_FRAGMENT__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.COMBINED_FRAGMENT__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.COMBINED_FRAGMENT__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.COMBINED_FRAGMENT__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.COMBINED_FRAGMENT__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UML2Package.COMBINED_FRAGMENT__NAME:
				return getName();
			case UML2Package.COMBINED_FRAGMENT__QUALIFIED_NAME:
				return getQualifiedName();
			case UML2Package.COMBINED_FRAGMENT__VISIBILITY:
				return getVisibility();
			case UML2Package.COMBINED_FRAGMENT__CLIENT_DEPENDENCY:
				return getClientDependencies();
			case UML2Package.COMBINED_FRAGMENT__NAME_EXPRESSION:
				return getNameExpression();
			case UML2Package.COMBINED_FRAGMENT__COVERED:
				return getCovereds();
			case UML2Package.COMBINED_FRAGMENT__GENERAL_ORDERING:
				return getGeneralOrderings();
			case UML2Package.COMBINED_FRAGMENT__ENCLOSING_INTERACTION:
				return getEnclosingInteraction();
			case UML2Package.COMBINED_FRAGMENT__ENCLOSING_OPERAND:
				return getEnclosingOperand();
			case UML2Package.COMBINED_FRAGMENT__INTERACTION_OPERATOR:
				return getInteractionOperator();
			case UML2Package.COMBINED_FRAGMENT__OPERAND:
				return getOperands();
			case UML2Package.COMBINED_FRAGMENT__CFRAGMENT_GATE:
				return getCfragmentGates();
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
			case UML2Package.COMBINED_FRAGMENT__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.COMBINED_FRAGMENT__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.COMBINED_FRAGMENT__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection)newValue);
				return;
			case UML2Package.COMBINED_FRAGMENT__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case UML2Package.COMBINED_FRAGMENT__NAME:
				setName((String)newValue);
				return;
			case UML2Package.COMBINED_FRAGMENT__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case UML2Package.COMBINED_FRAGMENT__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection)newValue);
				return;
			case UML2Package.COMBINED_FRAGMENT__NAME_EXPRESSION:
				setNameExpression((StringExpression)newValue);
				return;
			case UML2Package.COMBINED_FRAGMENT__COVERED:
				getCovereds().clear();
				getCovereds().addAll((Collection)newValue);
				return;
			case UML2Package.COMBINED_FRAGMENT__GENERAL_ORDERING:
				getGeneralOrderings().clear();
				getGeneralOrderings().addAll((Collection)newValue);
				return;
			case UML2Package.COMBINED_FRAGMENT__ENCLOSING_INTERACTION:
				setEnclosingInteraction((Interaction)newValue);
				return;
			case UML2Package.COMBINED_FRAGMENT__ENCLOSING_OPERAND:
				setEnclosingOperand((InteractionOperand)newValue);
				return;
			case UML2Package.COMBINED_FRAGMENT__INTERACTION_OPERATOR:
				setInteractionOperator((InteractionOperator)newValue);
				return;
			case UML2Package.COMBINED_FRAGMENT__OPERAND:
				getOperands().clear();
				getOperands().addAll((Collection)newValue);
				return;
			case UML2Package.COMBINED_FRAGMENT__CFRAGMENT_GATE:
				getCfragmentGates().clear();
				getCfragmentGates().addAll((Collection)newValue);
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
			case UML2Package.COMBINED_FRAGMENT__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.COMBINED_FRAGMENT__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.COMBINED_FRAGMENT__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				return;
			case UML2Package.COMBINED_FRAGMENT__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case UML2Package.COMBINED_FRAGMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UML2Package.COMBINED_FRAGMENT__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UML2Package.COMBINED_FRAGMENT__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				return;
			case UML2Package.COMBINED_FRAGMENT__NAME_EXPRESSION:
				setNameExpression((StringExpression)null);
				return;
			case UML2Package.COMBINED_FRAGMENT__COVERED:
				getCovereds().clear();
				return;
			case UML2Package.COMBINED_FRAGMENT__GENERAL_ORDERING:
				getGeneralOrderings().clear();
				return;
			case UML2Package.COMBINED_FRAGMENT__ENCLOSING_INTERACTION:
				setEnclosingInteraction((Interaction)null);
				return;
			case UML2Package.COMBINED_FRAGMENT__ENCLOSING_OPERAND:
				setEnclosingOperand((InteractionOperand)null);
				return;
			case UML2Package.COMBINED_FRAGMENT__INTERACTION_OPERATOR:
				setInteractionOperator(INTERACTION_OPERATOR_EDEFAULT);
				return;
			case UML2Package.COMBINED_FRAGMENT__OPERAND:
				getOperands().clear();
				return;
			case UML2Package.COMBINED_FRAGMENT__CFRAGMENT_GATE:
				getCfragmentGates().clear();
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
			case UML2Package.COMBINED_FRAGMENT__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.COMBINED_FRAGMENT__OWNED_ELEMENT:
				return isSetOwnedElements();
			case UML2Package.COMBINED_FRAGMENT__OWNER:
				return isSetOwner();
			case UML2Package.COMBINED_FRAGMENT__OWNED_COMMENT:
				EList ownedComment = (EList)eVirtualGet(UML2Package.COMBINED_FRAGMENT__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.COMBINED_FRAGMENT__TEMPLATE_BINDING:
				EList templateBinding = (EList)eVirtualGet(UML2Package.COMBINED_FRAGMENT__TEMPLATE_BINDING);
				return templateBinding != null && !templateBinding.isEmpty();
			case UML2Package.COMBINED_FRAGMENT__OWNED_TEMPLATE_SIGNATURE:
				return eVirtualGet(UML2Package.COMBINED_FRAGMENT__OWNED_TEMPLATE_SIGNATURE) != null;
			case UML2Package.COMBINED_FRAGMENT__NAME:
				String name = eVirtualIsSet(UML2Package.COMBINED_FRAGMENT__NAME) ? (String)eVirtualGet(UML2Package.COMBINED_FRAGMENT__NAME) : NAME_EDEFAULT;
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.COMBINED_FRAGMENT__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UML2Package.COMBINED_FRAGMENT__VISIBILITY:
				return eVirtualIsSet(UML2Package.COMBINED_FRAGMENT__VISIBILITY) && eVirtualGet(UML2Package.COMBINED_FRAGMENT__VISIBILITY) != VISIBILITY_EDEFAULT;
			case UML2Package.COMBINED_FRAGMENT__CLIENT_DEPENDENCY:
				EList clientDependency = (EList)eVirtualGet(UML2Package.COMBINED_FRAGMENT__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UML2Package.COMBINED_FRAGMENT__NAME_EXPRESSION:
				return eVirtualGet(UML2Package.COMBINED_FRAGMENT__NAME_EXPRESSION) != null;
			case UML2Package.COMBINED_FRAGMENT__COVERED:
				EList covered = (EList)eVirtualGet(UML2Package.COMBINED_FRAGMENT__COVERED);
				return covered != null && !covered.isEmpty();
			case UML2Package.COMBINED_FRAGMENT__GENERAL_ORDERING:
				EList generalOrdering = (EList)eVirtualGet(UML2Package.COMBINED_FRAGMENT__GENERAL_ORDERING);
				return generalOrdering != null && !generalOrdering.isEmpty();
			case UML2Package.COMBINED_FRAGMENT__ENCLOSING_INTERACTION:
				return getEnclosingInteraction() != null;
			case UML2Package.COMBINED_FRAGMENT__ENCLOSING_OPERAND:
				return getEnclosingOperand() != null;
			case UML2Package.COMBINED_FRAGMENT__INTERACTION_OPERATOR:
				return eVirtualIsSet(UML2Package.COMBINED_FRAGMENT__INTERACTION_OPERATOR) && eVirtualGet(UML2Package.COMBINED_FRAGMENT__INTERACTION_OPERATOR) != INTERACTION_OPERATOR_EDEFAULT;
			case UML2Package.COMBINED_FRAGMENT__OPERAND:
				EList operand = (EList)eVirtualGet(UML2Package.COMBINED_FRAGMENT__OPERAND);
				return operand != null && !operand.isEmpty();
			case UML2Package.COMBINED_FRAGMENT__CFRAGMENT_GATE:
				EList cfragmentGate = (EList)eVirtualGet(UML2Package.COMBINED_FRAGMENT__CFRAGMENT_GATE);
				return cfragmentGate != null && !cfragmentGate.isEmpty();
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
		result.append(" (interactionOperator: "); //$NON-NLS-1$
		result.append(eVirtualIsSet(UML2Package.COMBINED_FRAGMENT__INTERACTION_OPERATOR) ? eVirtualGet(UML2Package.COMBINED_FRAGMENT__INTERACTION_OPERATOR) : INTERACTION_OPERATOR_EDEFAULT);
		result.append(')');
		return result.toString();
	}


} //CombinedFragmentImpl
