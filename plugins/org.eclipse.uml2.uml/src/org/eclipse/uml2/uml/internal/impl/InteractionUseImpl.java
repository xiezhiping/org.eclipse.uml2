/*
 * Copyright (c) 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: InteractionUseImpl.java,v 1.9 2005/12/14 22:34:17 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.Action;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Gate;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.InteractionOperand;
import org.eclipse.uml2.uml.InteractionUse;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.InteractionUseOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interaction Use</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InteractionUseImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InteractionUseImpl#getRefersTo <em>Refers To</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InteractionUseImpl#getActualGates <em>Actual Gate</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InteractionUseImpl#getArguments <em>Argument</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InteractionUseImpl
		extends InteractionFragmentImpl
		implements InteractionUse {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InteractionUseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.Literals.INTERACTION_USE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedElements() {
		EList ownedElement = (EList) eVirtualGet(UMLPackage.INTERACTION_USE__OWNED_ELEMENT);
		if (ownedElement == null) {
			eVirtualSet(UMLPackage.INTERACTION_USE__OWNED_ELEMENT,
				ownedElement = new DerivedUnionEObjectEList(Element.class,
					this, UMLPackage.INTERACTION_USE__OWNED_ELEMENT, new int[]{
						UMLPackage.INTERACTION_USE__OWNED_COMMENT,
						UMLPackage.INTERACTION_USE__NAME_EXPRESSION,
						UMLPackage.INTERACTION_USE__GENERAL_ORDERING,
						UMLPackage.INTERACTION_USE__ACTUAL_GATE}));
		}
		return ownedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interaction getRefersTo() {
		Interaction refersTo = (Interaction) eVirtualGet(UMLPackage.INTERACTION_USE__REFERS_TO);
		if (refersTo != null && refersTo.eIsProxy()) {
			InternalEObject oldRefersTo = (InternalEObject) refersTo;
			refersTo = (Interaction) eResolveProxy(oldRefersTo);
			if (refersTo != oldRefersTo) {
				eVirtualSet(UMLPackage.INTERACTION_USE__REFERS_TO, refersTo);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.INTERACTION_USE__REFERS_TO, oldRefersTo,
						refersTo));
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
		return (Interaction) eVirtualGet(UMLPackage.INTERACTION_USE__REFERS_TO);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefersTo(Interaction newRefersTo) {
		Interaction refersTo = newRefersTo;
		Object oldRefersTo = eVirtualSet(UMLPackage.INTERACTION_USE__REFERS_TO,
			refersTo);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.INTERACTION_USE__REFERS_TO,
				oldRefersTo == EVIRTUAL_NO_VALUE
					? null
					: oldRefersTo, refersTo));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getActualGates() {
		EList actualGate = (EList) eVirtualGet(UMLPackage.INTERACTION_USE__ACTUAL_GATE);
		if (actualGate == null) {
			eVirtualSet(UMLPackage.INTERACTION_USE__ACTUAL_GATE,
				actualGate = new EObjectContainmentEList(Gate.class, this,
					UMLPackage.INTERACTION_USE__ACTUAL_GATE));
		}
		return actualGate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gate createActualGate() {
		Gate newActualGate = UMLFactory.eINSTANCE.createGate();
		getActualGates().add(newActualGate);
		return newActualGate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gate getActualGate(String name) {
		for (Iterator i = getActualGates().iterator(); i.hasNext();) {
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
	 * @generated
	 */
	public EList getArguments() {
		EList argument = (EList) eVirtualGet(UMLPackage.INTERACTION_USE__ARGUMENT);
		if (argument == null) {
			eVirtualSet(UMLPackage.INTERACTION_USE__ARGUMENT,
				argument = new EObjectContainmentEList(Action.class, this,
					UMLPackage.INTERACTION_USE__ARGUMENT));
		}
		return argument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action createArgument(EClass eClass) {
		Action newArgument = (Action) eClass.getEPackage()
			.getEFactoryInstance().create(eClass);
		getArguments().add(newArgument);
		return newArgument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action createArgument() {
		Action newArgument = UMLFactory.eINSTANCE.createAction();
		getArguments().add(newArgument);
		return newArgument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action getArgument(String name) {
		for (Iterator i = getArguments().iterator(); i.hasNext();) {
			Action argument = (Action) i.next();
			if (name.equals(argument.getName())) {
				return argument;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGatesMatch(DiagnosticChain diagnostics, Map context) {
		return InteractionUseOperations.validateGatesMatch(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllLifelines(DiagnosticChain diagnostics, Map context) {
		return InteractionUseOperations.validateAllLifelines(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArgumentsCorrespondToParameters(
			DiagnosticChain diagnostics, Map context) {
		return InteractionUseOperations
			.validateArgumentsCorrespondToParameters(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArgumentsAreConstants(DiagnosticChain diagnostics,
			Map context) {
		return InteractionUseOperations.validateArgumentsAreConstants(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.INTERACTION_USE__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.INTERACTION_USE__OWNED_COMMENT :
				return ((InternalEList) getOwnedComments()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.INTERACTION_USE__CLIENT_DEPENDENCY :
				return ((InternalEList) getClientDependencies()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.INTERACTION_USE__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.INTERACTION_USE__COVERED :
				return ((InternalEList) getCovereds()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.INTERACTION_USE__GENERAL_ORDERING :
				return ((InternalEList) getGeneralOrderings()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.INTERACTION_USE__ENCLOSING_INTERACTION :
				return eBasicSetContainer(null,
					UMLPackage.INTERACTION_USE__ENCLOSING_INTERACTION, msgs);
			case UMLPackage.INTERACTION_USE__ENCLOSING_OPERAND :
				return eBasicSetContainer(null,
					UMLPackage.INTERACTION_USE__ENCLOSING_OPERAND, msgs);
			case UMLPackage.INTERACTION_USE__ACTUAL_GATE :
				return ((InternalEList) getActualGates()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.INTERACTION_USE__ARGUMENT :
				return ((InternalEList) getArguments()).basicRemove(otherEnd,
					msgs);
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
			case UMLPackage.INTERACTION_USE__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.INTERACTION_USE__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.INTERACTION_USE__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.INTERACTION_USE__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.INTERACTION_USE__NAME :
				return getName();
			case UMLPackage.INTERACTION_USE__VISIBILITY :
				return getVisibility();
			case UMLPackage.INTERACTION_USE__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.INTERACTION_USE__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.INTERACTION_USE__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.INTERACTION_USE__NAME_EXPRESSION :
				return getNameExpression();
			case UMLPackage.INTERACTION_USE__COVERED :
				return getCovereds();
			case UMLPackage.INTERACTION_USE__GENERAL_ORDERING :
				return getGeneralOrderings();
			case UMLPackage.INTERACTION_USE__ENCLOSING_INTERACTION :
				return getEnclosingInteraction();
			case UMLPackage.INTERACTION_USE__ENCLOSING_OPERAND :
				return getEnclosingOperand();
			case UMLPackage.INTERACTION_USE__REFERS_TO :
				if (resolve)
					return getRefersTo();
				return basicGetRefersTo();
			case UMLPackage.INTERACTION_USE__ACTUAL_GATE :
				return getActualGates();
			case UMLPackage.INTERACTION_USE__ARGUMENT :
				return getArguments();
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
			case UMLPackage.INTERACTION_USE__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.INTERACTION_USE__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.INTERACTION_USE__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.INTERACTION_USE__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.INTERACTION_USE__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.INTERACTION_USE__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.INTERACTION_USE__COVERED :
				getCovereds().clear();
				getCovereds().addAll((Collection) newValue);
				return;
			case UMLPackage.INTERACTION_USE__GENERAL_ORDERING :
				getGeneralOrderings().clear();
				getGeneralOrderings().addAll((Collection) newValue);
				return;
			case UMLPackage.INTERACTION_USE__ENCLOSING_INTERACTION :
				setEnclosingInteraction((Interaction) newValue);
				return;
			case UMLPackage.INTERACTION_USE__ENCLOSING_OPERAND :
				setEnclosingOperand((InteractionOperand) newValue);
				return;
			case UMLPackage.INTERACTION_USE__REFERS_TO :
				setRefersTo((Interaction) newValue);
				return;
			case UMLPackage.INTERACTION_USE__ACTUAL_GATE :
				getActualGates().clear();
				getActualGates().addAll((Collection) newValue);
				return;
			case UMLPackage.INTERACTION_USE__ARGUMENT :
				getArguments().clear();
				getArguments().addAll((Collection) newValue);
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
			case UMLPackage.INTERACTION_USE__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.INTERACTION_USE__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.INTERACTION_USE__NAME :
				unsetName();
				return;
			case UMLPackage.INTERACTION_USE__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.INTERACTION_USE__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.INTERACTION_USE__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.INTERACTION_USE__COVERED :
				getCovereds().clear();
				return;
			case UMLPackage.INTERACTION_USE__GENERAL_ORDERING :
				getGeneralOrderings().clear();
				return;
			case UMLPackage.INTERACTION_USE__ENCLOSING_INTERACTION :
				setEnclosingInteraction((Interaction) null);
				return;
			case UMLPackage.INTERACTION_USE__ENCLOSING_OPERAND :
				setEnclosingOperand((InteractionOperand) null);
				return;
			case UMLPackage.INTERACTION_USE__REFERS_TO :
				setRefersTo((Interaction) null);
				return;
			case UMLPackage.INTERACTION_USE__ACTUAL_GATE :
				getActualGates().clear();
				return;
			case UMLPackage.INTERACTION_USE__ARGUMENT :
				getArguments().clear();
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
			case UMLPackage.INTERACTION_USE__EANNOTATIONS :
				EList eAnnotations = (EList) eVirtualGet(UMLPackage.INTERACTION_USE__EANNOTATIONS);
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.INTERACTION_USE__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.INTERACTION_USE__OWNER :
				return isSetOwner();
			case UMLPackage.INTERACTION_USE__OWNED_COMMENT :
				EList ownedComment = (EList) eVirtualGet(UMLPackage.INTERACTION_USE__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.INTERACTION_USE__NAME :
				return isSetName();
			case UMLPackage.INTERACTION_USE__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.INTERACTION_USE__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.INTERACTION_USE__CLIENT_DEPENDENCY :
				EList clientDependency = (EList) eVirtualGet(UMLPackage.INTERACTION_USE__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.INTERACTION_USE__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.INTERACTION_USE__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.INTERACTION_USE__NAME_EXPRESSION) != null;
			case UMLPackage.INTERACTION_USE__COVERED :
				EList covered = (EList) eVirtualGet(UMLPackage.INTERACTION_USE__COVERED);
				return covered != null && !covered.isEmpty();
			case UMLPackage.INTERACTION_USE__GENERAL_ORDERING :
				EList generalOrdering = (EList) eVirtualGet(UMLPackage.INTERACTION_USE__GENERAL_ORDERING);
				return generalOrdering != null && !generalOrdering.isEmpty();
			case UMLPackage.INTERACTION_USE__ENCLOSING_INTERACTION :
				return getEnclosingInteraction() != null;
			case UMLPackage.INTERACTION_USE__ENCLOSING_OPERAND :
				return getEnclosingOperand() != null;
			case UMLPackage.INTERACTION_USE__REFERS_TO :
				return eVirtualGet(UMLPackage.INTERACTION_USE__REFERS_TO) != null;
			case UMLPackage.INTERACTION_USE__ACTUAL_GATE :
				EList actualGate = (EList) eVirtualGet(UMLPackage.INTERACTION_USE__ACTUAL_GATE);
				return actualGate != null && !actualGate.isEmpty();
			case UMLPackage.INTERACTION_USE__ARGUMENT :
				EList argument = (EList) eVirtualGet(UMLPackage.INTERACTION_USE__ARGUMENT);
				return argument != null && !argument.isEmpty();
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| eIsSet(UMLPackage.INTERACTION_USE__ACTUAL_GATE);
	}

} //InteractionUseImpl
