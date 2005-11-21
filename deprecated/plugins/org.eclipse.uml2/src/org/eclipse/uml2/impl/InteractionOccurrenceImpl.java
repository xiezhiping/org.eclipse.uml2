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
 * $Id: InteractionOccurrenceImpl.java,v 1.16 2005/11/21 21:48:01 khussey Exp $
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

import org.eclipse.uml2.Element;
import org.eclipse.uml2.Gate;
import org.eclipse.uml2.InputPin;
import org.eclipse.uml2.Interaction;
import org.eclipse.uml2.InteractionOccurrence;
import org.eclipse.uml2.InteractionOperand;
import org.eclipse.uml2.StringExpression;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.VisibilityKind;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interaction Occurrence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.InteractionOccurrenceImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.InteractionOccurrenceImpl#getRefersTo <em>Refers To</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.InteractionOccurrenceImpl#getActualGates <em>Actual Gate</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.InteractionOccurrenceImpl#getArguments <em>Argument</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InteractionOccurrenceImpl extends InteractionFragmentImpl implements InteractionOccurrence {
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
	protected InteractionOccurrenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UML2Package.eINSTANCE.getInteractionOccurrence();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedElements() {
		EList ownedElement = (EList)eVirtualGet(UML2Package.INTERACTION_OCCURRENCE__OWNED_ELEMENT);
		if (ownedElement == null) {
			eVirtualSet(UML2Package.INTERACTION_OCCURRENCE__OWNED_ELEMENT, ownedElement = new DerivedUnionEObjectEList(Element.class, this, UML2Package.INTERACTION_OCCURRENCE__OWNED_ELEMENT, new EStructuralFeature[] {UML2Package.eINSTANCE.getElement_OwnedComment(), UML2Package.eINSTANCE.getTemplateableElement_TemplateBinding(), UML2Package.eINSTANCE.getTemplateableElement_OwnedTemplateSignature(), UML2Package.eINSTANCE.getNamedElement_NameExpression(), UML2Package.eINSTANCE.getInteractionFragment_GeneralOrdering(), UML2Package.eINSTANCE.getInteractionOccurrence_ActualGate()}));
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
			|| eIsSet(UML2Package.eINSTANCE.getInteractionOccurrence_ActualGate());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interaction getRefersTo() {
		Interaction refersTo = (Interaction)eVirtualGet(UML2Package.INTERACTION_OCCURRENCE__REFERS_TO);
		if (refersTo != null && refersTo.eIsProxy()) {
			InternalEObject oldRefersTo = (InternalEObject)refersTo;
			refersTo = (Interaction)eResolveProxy(oldRefersTo);
			if (refersTo != oldRefersTo) {
				eVirtualSet(UML2Package.INTERACTION_OCCURRENCE__REFERS_TO, refersTo);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2Package.INTERACTION_OCCURRENCE__REFERS_TO, oldRefersTo, refersTo));
			}
		}
		return refersTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interaction basicGetRefersTo() {
		return (Interaction)eVirtualGet(UML2Package.INTERACTION_OCCURRENCE__REFERS_TO);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefersTo(Interaction newRefersTo) {
		Interaction refersTo = newRefersTo;
		Object oldRefersTo = eVirtualSet(UML2Package.INTERACTION_OCCURRENCE__REFERS_TO, refersTo);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.INTERACTION_OCCURRENCE__REFERS_TO, oldRefersTo == EVIRTUAL_NO_VALUE ? null : oldRefersTo, refersTo));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getActualGates() {
		EList actualGate = (EList)eVirtualGet(UML2Package.INTERACTION_OCCURRENCE__ACTUAL_GATE);
		if (actualGate == null) {
			eVirtualSet(UML2Package.INTERACTION_OCCURRENCE__ACTUAL_GATE, actualGate = new EObjectContainmentEList(Gate.class, this, UML2Package.INTERACTION_OCCURRENCE__ACTUAL_GATE));
		}
		return actualGate;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public Gate getActualGate(String name) {
		for (Iterator i = getActualGates().iterator(); i.hasNext(); ) {
			Gate actualGate = (Gate) i.next();
			if (name.equals(actualGate.getName())) {
				return actualGate;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @deprecated Use #createActualGate() instead.
	 */
	public Gate createActualGate(EClass eClass) {
		Gate newActualGate = (Gate) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.INTERACTION_OCCURRENCE__ACTUAL_GATE, null, newActualGate));
		}
		getActualGates().add(newActualGate);
		return newActualGate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Gate createActualGate() {
		Gate newActualGate = UML2Factory.eINSTANCE.createGate();
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.INTERACTION_OCCURRENCE__ACTUAL_GATE, null, newActualGate));
		}
		getActualGates().add(newActualGate);
		return newActualGate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getArguments() {
		EList argument = (EList)eVirtualGet(UML2Package.INTERACTION_OCCURRENCE__ARGUMENT);
		if (argument == null) {
			eVirtualSet(UML2Package.INTERACTION_OCCURRENCE__ARGUMENT, argument = new EObjectContainmentEList(InputPin.class, this, UML2Package.INTERACTION_OCCURRENCE__ARGUMENT));
		}
		return argument;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public InputPin getArgument(String name) {
		for (Iterator i = getArguments().iterator(); i.hasNext(); ) {
			InputPin argument = (InputPin) i.next();
			if (name.equals(argument.getName())) {
				return argument;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public InputPin createArgument(EClass eClass) {
		InputPin newArgument = (InputPin) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.INTERACTION_OCCURRENCE__ARGUMENT, null, newArgument));
		}
		getArguments().add(newArgument);
		return newArgument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public InputPin createArgument() {
		InputPin newArgument = UML2Factory.eINSTANCE.createInputPin();
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.INTERACTION_OCCURRENCE__ARGUMENT, null, newArgument));
		}
		getArguments().add(newArgument);
		return newArgument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UML2Package.INTERACTION_OCCURRENCE__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
				case UML2Package.INTERACTION_OCCURRENCE__OWNED_COMMENT:
					return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
				case UML2Package.INTERACTION_OCCURRENCE__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicRemove(otherEnd, msgs);
				case UML2Package.INTERACTION_OCCURRENCE__OWNED_TEMPLATE_SIGNATURE:
					return basicSetOwnedTemplateSignature(null, msgs);
				case UML2Package.INTERACTION_OCCURRENCE__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicRemove(otherEnd, msgs);
				case UML2Package.INTERACTION_OCCURRENCE__NAME_EXPRESSION:
					return basicSetNameExpression(null, msgs);
				case UML2Package.INTERACTION_OCCURRENCE__COVERED:
					return ((InternalEList)getCovereds()).basicRemove(otherEnd, msgs);
				case UML2Package.INTERACTION_OCCURRENCE__GENERAL_ORDERING:
					return ((InternalEList)getGeneralOrderings()).basicRemove(otherEnd, msgs);
				case UML2Package.INTERACTION_OCCURRENCE__ENCLOSING_INTERACTION:
					return eBasicSetContainer(null, UML2Package.INTERACTION_OCCURRENCE__ENCLOSING_INTERACTION, msgs);
				case UML2Package.INTERACTION_OCCURRENCE__ENCLOSING_OPERAND:
					return eBasicSetContainer(null, UML2Package.INTERACTION_OCCURRENCE__ENCLOSING_OPERAND, msgs);
				case UML2Package.INTERACTION_OCCURRENCE__ACTUAL_GATE:
					return ((InternalEList)getActualGates()).basicRemove(otherEnd, msgs);
				case UML2Package.INTERACTION_OCCURRENCE__ARGUMENT:
					return ((InternalEList)getArguments()).basicRemove(otherEnd, msgs);
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
			case UML2Package.INTERACTION_OCCURRENCE__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.INTERACTION_OCCURRENCE__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.INTERACTION_OCCURRENCE__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.INTERACTION_OCCURRENCE__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.INTERACTION_OCCURRENCE__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.INTERACTION_OCCURRENCE__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UML2Package.INTERACTION_OCCURRENCE__NAME:
				return getName();
			case UML2Package.INTERACTION_OCCURRENCE__QUALIFIED_NAME:
				return getQualifiedName();
			case UML2Package.INTERACTION_OCCURRENCE__VISIBILITY:
				return getVisibility();
			case UML2Package.INTERACTION_OCCURRENCE__CLIENT_DEPENDENCY:
				return getClientDependencies();
			case UML2Package.INTERACTION_OCCURRENCE__NAME_EXPRESSION:
				return getNameExpression();
			case UML2Package.INTERACTION_OCCURRENCE__COVERED:
				return getCovereds();
			case UML2Package.INTERACTION_OCCURRENCE__GENERAL_ORDERING:
				return getGeneralOrderings();
			case UML2Package.INTERACTION_OCCURRENCE__ENCLOSING_INTERACTION:
				return getEnclosingInteraction();
			case UML2Package.INTERACTION_OCCURRENCE__ENCLOSING_OPERAND:
				return getEnclosingOperand();
			case UML2Package.INTERACTION_OCCURRENCE__REFERS_TO:
				if (resolve) return getRefersTo();
				return basicGetRefersTo();
			case UML2Package.INTERACTION_OCCURRENCE__ACTUAL_GATE:
				return getActualGates();
			case UML2Package.INTERACTION_OCCURRENCE__ARGUMENT:
				return getArguments();
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
			case UML2Package.INTERACTION_OCCURRENCE__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.INTERACTION_OCCURRENCE__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.INTERACTION_OCCURRENCE__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection)newValue);
				return;
			case UML2Package.INTERACTION_OCCURRENCE__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case UML2Package.INTERACTION_OCCURRENCE__NAME:
				setName((String)newValue);
				return;
			case UML2Package.INTERACTION_OCCURRENCE__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case UML2Package.INTERACTION_OCCURRENCE__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection)newValue);
				return;
			case UML2Package.INTERACTION_OCCURRENCE__NAME_EXPRESSION:
				setNameExpression((StringExpression)newValue);
				return;
			case UML2Package.INTERACTION_OCCURRENCE__COVERED:
				getCovereds().clear();
				getCovereds().addAll((Collection)newValue);
				return;
			case UML2Package.INTERACTION_OCCURRENCE__GENERAL_ORDERING:
				getGeneralOrderings().clear();
				getGeneralOrderings().addAll((Collection)newValue);
				return;
			case UML2Package.INTERACTION_OCCURRENCE__ENCLOSING_INTERACTION:
				setEnclosingInteraction((Interaction)newValue);
				return;
			case UML2Package.INTERACTION_OCCURRENCE__ENCLOSING_OPERAND:
				setEnclosingOperand((InteractionOperand)newValue);
				return;
			case UML2Package.INTERACTION_OCCURRENCE__REFERS_TO:
				setRefersTo((Interaction)newValue);
				return;
			case UML2Package.INTERACTION_OCCURRENCE__ACTUAL_GATE:
				getActualGates().clear();
				getActualGates().addAll((Collection)newValue);
				return;
			case UML2Package.INTERACTION_OCCURRENCE__ARGUMENT:
				getArguments().clear();
				getArguments().addAll((Collection)newValue);
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
			case UML2Package.INTERACTION_OCCURRENCE__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.INTERACTION_OCCURRENCE__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.INTERACTION_OCCURRENCE__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				return;
			case UML2Package.INTERACTION_OCCURRENCE__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case UML2Package.INTERACTION_OCCURRENCE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UML2Package.INTERACTION_OCCURRENCE__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UML2Package.INTERACTION_OCCURRENCE__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				return;
			case UML2Package.INTERACTION_OCCURRENCE__NAME_EXPRESSION:
				setNameExpression((StringExpression)null);
				return;
			case UML2Package.INTERACTION_OCCURRENCE__COVERED:
				getCovereds().clear();
				return;
			case UML2Package.INTERACTION_OCCURRENCE__GENERAL_ORDERING:
				getGeneralOrderings().clear();
				return;
			case UML2Package.INTERACTION_OCCURRENCE__ENCLOSING_INTERACTION:
				setEnclosingInteraction((Interaction)null);
				return;
			case UML2Package.INTERACTION_OCCURRENCE__ENCLOSING_OPERAND:
				setEnclosingOperand((InteractionOperand)null);
				return;
			case UML2Package.INTERACTION_OCCURRENCE__REFERS_TO:
				setRefersTo((Interaction)null);
				return;
			case UML2Package.INTERACTION_OCCURRENCE__ACTUAL_GATE:
				getActualGates().clear();
				return;
			case UML2Package.INTERACTION_OCCURRENCE__ARGUMENT:
				getArguments().clear();
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
			case UML2Package.INTERACTION_OCCURRENCE__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.INTERACTION_OCCURRENCE__OWNED_ELEMENT:
				return isSetOwnedElements();
			case UML2Package.INTERACTION_OCCURRENCE__OWNER:
				return isSetOwner();
			case UML2Package.INTERACTION_OCCURRENCE__OWNED_COMMENT:
				EList ownedComment = (EList)eVirtualGet(UML2Package.INTERACTION_OCCURRENCE__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.INTERACTION_OCCURRENCE__TEMPLATE_BINDING:
				EList templateBinding = (EList)eVirtualGet(UML2Package.INTERACTION_OCCURRENCE__TEMPLATE_BINDING);
				return templateBinding != null && !templateBinding.isEmpty();
			case UML2Package.INTERACTION_OCCURRENCE__OWNED_TEMPLATE_SIGNATURE:
				return eVirtualGet(UML2Package.INTERACTION_OCCURRENCE__OWNED_TEMPLATE_SIGNATURE) != null;
			case UML2Package.INTERACTION_OCCURRENCE__NAME:
				String name = eVirtualIsSet(UML2Package.INTERACTION_OCCURRENCE__NAME) ? (String)eVirtualGet(UML2Package.INTERACTION_OCCURRENCE__NAME) : NAME_EDEFAULT;
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.INTERACTION_OCCURRENCE__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UML2Package.INTERACTION_OCCURRENCE__VISIBILITY:
				return eVirtualIsSet(UML2Package.INTERACTION_OCCURRENCE__VISIBILITY) && eVirtualGet(UML2Package.INTERACTION_OCCURRENCE__VISIBILITY) != VISIBILITY_EDEFAULT;
			case UML2Package.INTERACTION_OCCURRENCE__CLIENT_DEPENDENCY:
				EList clientDependency = (EList)eVirtualGet(UML2Package.INTERACTION_OCCURRENCE__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UML2Package.INTERACTION_OCCURRENCE__NAME_EXPRESSION:
				return eVirtualGet(UML2Package.INTERACTION_OCCURRENCE__NAME_EXPRESSION) != null;
			case UML2Package.INTERACTION_OCCURRENCE__COVERED:
				EList covered = (EList)eVirtualGet(UML2Package.INTERACTION_OCCURRENCE__COVERED);
				return covered != null && !covered.isEmpty();
			case UML2Package.INTERACTION_OCCURRENCE__GENERAL_ORDERING:
				EList generalOrdering = (EList)eVirtualGet(UML2Package.INTERACTION_OCCURRENCE__GENERAL_ORDERING);
				return generalOrdering != null && !generalOrdering.isEmpty();
			case UML2Package.INTERACTION_OCCURRENCE__ENCLOSING_INTERACTION:
				return getEnclosingInteraction() != null;
			case UML2Package.INTERACTION_OCCURRENCE__ENCLOSING_OPERAND:
				return getEnclosingOperand() != null;
			case UML2Package.INTERACTION_OCCURRENCE__REFERS_TO:
				return eVirtualGet(UML2Package.INTERACTION_OCCURRENCE__REFERS_TO) != null;
			case UML2Package.INTERACTION_OCCURRENCE__ACTUAL_GATE:
				EList actualGate = (EList)eVirtualGet(UML2Package.INTERACTION_OCCURRENCE__ACTUAL_GATE);
				return actualGate != null && !actualGate.isEmpty();
			case UML2Package.INTERACTION_OCCURRENCE__ARGUMENT:
				EList argument = (EList)eVirtualGet(UML2Package.INTERACTION_OCCURRENCE__ARGUMENT);
				return argument != null && !argument.isEmpty();
		}
		return eDynamicIsSet(eFeature);
	}


} //InteractionOccurrenceImpl
