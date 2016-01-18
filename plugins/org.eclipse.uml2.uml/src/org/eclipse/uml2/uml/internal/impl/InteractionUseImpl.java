/*
 * Copyright (c) 2005, 2016 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey - 286329, 323181
 *   Kenn Hussey (CEA) - 327039, 351774, 418466, 451350, 485756
 *
 */
package org.eclipse.uml2.uml.internal.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Gate;
import org.eclipse.uml2.uml.GeneralOrdering;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.InteractionOperand;
import org.eclipse.uml2.uml.InteractionUse;
import org.eclipse.uml2.uml.Lifeline;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.ValueSpecification;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.InteractionUseOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interaction Use</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InteractionUseImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InteractionUseImpl#getActualGates <em>Actual Gate</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InteractionUseImpl#getArguments <em>Argument</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InteractionUseImpl#getRefersTo <em>Refers To</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InteractionUseImpl#getReturnValue <em>Return Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InteractionUseImpl#getReturnValueRecipient <em>Return Value Recipient</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InteractionUseImpl
		extends InteractionFragmentImpl
		implements InteractionUse {

	/**
	 * The cached value of the '{@link #getActualGates() <em>Actual Gate</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualGates()
	 * @generated
	 * @ordered
	 */
	protected EList<Gate> actualGates;

	/**
	 * The cached value of the '{@link #getArguments() <em>Argument</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArguments()
	 * @generated
	 * @ordered
	 */
	protected EList<ValueSpecification> arguments;

	/**
	 * The cached value of the '{@link #getRefersTo() <em>Refers To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefersTo()
	 * @generated
	 * @ordered
	 */
	protected Interaction refersTo;

	/**
	 * The cached value of the '{@link #getReturnValue() <em>Return Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnValue()
	 * @generated
	 * @ordered
	 */
	protected ValueSpecification returnValue;

	/**
	 * The cached value of the '{@link #getReturnValueRecipient() <em>Return Value Recipient</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnValueRecipient()
	 * @generated
	 * @ordered
	 */
	protected Property returnValueRecipient;

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
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.INTERACTION_USE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Element> getOwnedElements() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			@SuppressWarnings("unchecked")
			EList<Element> ownedElements = (EList<Element>) cache.get(eResource,
				this, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
			if (ownedElements == null) {
				cache.put(eResource, this,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT,
					ownedElements = new DerivedUnionEObjectEList<Element>(
						Element.class, this,
						UMLPackage.INTERACTION_USE__OWNED_ELEMENT,
						OWNED_ELEMENT_ESUBSETS));
			}
			return ownedElements;
		}
		return new DerivedUnionEObjectEList<Element>(Element.class, this,
			UMLPackage.INTERACTION_USE__OWNED_ELEMENT, OWNED_ELEMENT_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interaction getRefersTo() {
		if (refersTo != null && refersTo.eIsProxy()) {
			InternalEObject oldRefersTo = (InternalEObject) refersTo;
			refersTo = (Interaction) eResolveProxy(oldRefersTo);
			if (refersTo != oldRefersTo) {
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
		return refersTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefersTo(Interaction newRefersTo) {
		Interaction oldRefersTo = refersTo;
		refersTo = newRefersTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.INTERACTION_USE__REFERS_TO, oldRefersTo, refersTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getReturnValue() {
		if (returnValue != null && returnValue.eIsProxy()) {
			InternalEObject oldReturnValue = (InternalEObject) returnValue;
			returnValue = (ValueSpecification) eResolveProxy(oldReturnValue);
			if (returnValue != oldReturnValue) {
				InternalEObject newReturnValue = (InternalEObject) returnValue;
				NotificationChain msgs = oldReturnValue
					.eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
							- UMLPackage.INTERACTION_USE__RETURN_VALUE,
						null, null);
				if (newReturnValue.eInternalContainer() == null) {
					msgs = newReturnValue.eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
							- UMLPackage.INTERACTION_USE__RETURN_VALUE,
						null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.INTERACTION_USE__RETURN_VALUE,
						oldReturnValue, returnValue));
			}
		}
		return returnValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification basicGetReturnValue() {
		return returnValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReturnValue(
			ValueSpecification newReturnValue, NotificationChain msgs) {
		ValueSpecification oldReturnValue = returnValue;
		returnValue = newReturnValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET, UMLPackage.INTERACTION_USE__RETURN_VALUE,
				oldReturnValue, newReturnValue);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnValue(ValueSpecification newReturnValue) {
		if (newReturnValue != returnValue) {
			NotificationChain msgs = null;
			if (returnValue != null)
				msgs = ((InternalEObject) returnValue)
					.eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
							- UMLPackage.INTERACTION_USE__RETURN_VALUE,
						null, msgs);
			if (newReturnValue != null)
				msgs = ((InternalEObject) newReturnValue)
					.eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
							- UMLPackage.INTERACTION_USE__RETURN_VALUE,
						null, msgs);
			msgs = basicSetReturnValue(newReturnValue, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.INTERACTION_USE__RETURN_VALUE, newReturnValue,
				newReturnValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification createReturnValue(String name, Type type,
			EClass eClass) {
		ValueSpecification newReturnValue = (ValueSpecification) create(eClass);
		setReturnValue(newReturnValue);
		if (name != null)
			newReturnValue.setName(name);
		if (type != null)
			newReturnValue.setType(type);
		return newReturnValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getReturnValueRecipient() {
		if (returnValueRecipient != null && returnValueRecipient.eIsProxy()) {
			InternalEObject oldReturnValueRecipient = (InternalEObject) returnValueRecipient;
			returnValueRecipient = (Property) eResolveProxy(
				oldReturnValueRecipient);
			if (returnValueRecipient != oldReturnValueRecipient) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.INTERACTION_USE__RETURN_VALUE_RECIPIENT,
						oldReturnValueRecipient, returnValueRecipient));
			}
		}
		return returnValueRecipient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property basicGetReturnValueRecipient() {
		return returnValueRecipient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnValueRecipient(Property newReturnValueRecipient) {
		Property oldReturnValueRecipient = returnValueRecipient;
		returnValueRecipient = newReturnValueRecipient;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.INTERACTION_USE__RETURN_VALUE_RECIPIENT,
				oldReturnValueRecipient, returnValueRecipient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Gate> getActualGates() {
		if (actualGates == null) {
			actualGates = new EObjectContainmentEList.Resolving<Gate>(
				Gate.class, this, UMLPackage.INTERACTION_USE__ACTUAL_GATE);
		}
		return actualGates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gate createActualGate(String name) {
		Gate newActualGate = (Gate) create(UMLPackage.Literals.GATE);
		getActualGates().add(newActualGate);
		if (name != null)
			newActualGate.setName(name);
		return newActualGate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gate getActualGate(String name) {
		return getActualGate(name, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gate getActualGate(String name, boolean ignoreCase,
			boolean createOnDemand) {
		actualGateLoop : for (Gate actualGate : getActualGates()) {
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(actualGate.getName())
				: name.equals(actualGate.getName())))
				continue actualGateLoop;
			return actualGate;
		}
		return createOnDemand
			? createActualGate(name)
			: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValueSpecification> getArguments() {
		if (arguments == null) {
			arguments = new EObjectContainmentEList.Resolving<ValueSpecification>(
				ValueSpecification.class, this,
				UMLPackage.INTERACTION_USE__ARGUMENT);
		}
		return arguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification createArgument(String name, Type type,
			EClass eClass) {
		ValueSpecification newArgument = (ValueSpecification) create(eClass);
		getArguments().add(newArgument);
		if (name != null)
			newArgument.setName(name);
		if (type != null)
			newArgument.setType(type);
		return newArgument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getArgument(String name, Type type) {
		return getArgument(name, type, false, null, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getArgument(String name, Type type,
			boolean ignoreCase, EClass eClass, boolean createOnDemand) {
		argumentLoop : for (ValueSpecification argument : getArguments()) {
			if (eClass != null && !eClass.isInstance(argument))
				continue argumentLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(argument.getName())
				: name.equals(argument.getName())))
				continue argumentLoop;
			if (type != null && !type.equals(argument.getType()))
				continue argumentLoop;
			return argument;
		}
		return createOnDemand && eClass != null
			? createArgument(name, type, eClass)
			: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGatesMatch(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return InteractionUseOperations.validateGatesMatch(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllLifelines(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return InteractionUseOperations.validateAllLifelines(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArgumentsCorrespondToParameters(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InteractionUseOperations.validateArgumentsCorrespondToParameters(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReturnValueTypeRecipientCorrespondence(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InteractionUseOperations
			.validateReturnValueTypeRecipientCorrespondence(this, diagnostics,
				context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArgumentsAreConstants(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return InteractionUseOperations.validateArgumentsAreConstants(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReturnValueRecipientCoverage(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InteractionUseOperations
			.validateReturnValueRecipientCoverage(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.INTERACTION_USE__EANNOTATIONS :
				return ((InternalEList<?>) getEAnnotations())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.INTERACTION_USE__OWNED_COMMENT :
				return ((InternalEList<?>) getOwnedComments())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.INTERACTION_USE__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.INTERACTION_USE__COVERED :
				return ((InternalEList<?>) getCovereds()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.INTERACTION_USE__ENCLOSING_OPERAND :
				return basicSetEnclosingOperand(null, msgs);
			case UMLPackage.INTERACTION_USE__ENCLOSING_INTERACTION :
				return basicSetEnclosingInteraction(null, msgs);
			case UMLPackage.INTERACTION_USE__GENERAL_ORDERING :
				return ((InternalEList<?>) getGeneralOrderings())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.INTERACTION_USE__ACTUAL_GATE :
				return ((InternalEList<?>) getActualGates())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.INTERACTION_USE__ARGUMENT :
				return ((InternalEList<?>) getArguments()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.INTERACTION_USE__RETURN_VALUE :
				return basicSetReturnValue(null, msgs);
		}
		return eDynamicInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.INTERACTION_USE__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.INTERACTION_USE__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.INTERACTION_USE__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.INTERACTION_USE__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.INTERACTION_USE__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.INTERACTION_USE__NAME :
				return getName();
			case UMLPackage.INTERACTION_USE__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.INTERACTION_USE__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.INTERACTION_USE__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.INTERACTION_USE__VISIBILITY :
				return getVisibility();
			case UMLPackage.INTERACTION_USE__COVERED :
				return getCovereds();
			case UMLPackage.INTERACTION_USE__ENCLOSING_OPERAND :
				if (resolve)
					return getEnclosingOperand();
				return basicGetEnclosingOperand();
			case UMLPackage.INTERACTION_USE__ENCLOSING_INTERACTION :
				if (resolve)
					return getEnclosingInteraction();
				return basicGetEnclosingInteraction();
			case UMLPackage.INTERACTION_USE__GENERAL_ORDERING :
				return getGeneralOrderings();
			case UMLPackage.INTERACTION_USE__ACTUAL_GATE :
				return getActualGates();
			case UMLPackage.INTERACTION_USE__ARGUMENT :
				return getArguments();
			case UMLPackage.INTERACTION_USE__REFERS_TO :
				if (resolve)
					return getRefersTo();
				return basicGetRefersTo();
			case UMLPackage.INTERACTION_USE__RETURN_VALUE :
				if (resolve)
					return getReturnValue();
				return basicGetReturnValue();
			case UMLPackage.INTERACTION_USE__RETURN_VALUE_RECIPIENT :
				if (resolve)
					return getReturnValueRecipient();
				return basicGetReturnValueRecipient();
		}
		return eDynamicGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UMLPackage.INTERACTION_USE__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations()
					.addAll((Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.INTERACTION_USE__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments()
					.addAll((Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.INTERACTION_USE__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.INTERACTION_USE__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.INTERACTION_USE__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.INTERACTION_USE__COVERED :
				getCovereds().clear();
				getCovereds().addAll((Collection<? extends Lifeline>) newValue);
				return;
			case UMLPackage.INTERACTION_USE__ENCLOSING_OPERAND :
				setEnclosingOperand((InteractionOperand) newValue);
				return;
			case UMLPackage.INTERACTION_USE__ENCLOSING_INTERACTION :
				setEnclosingInteraction((Interaction) newValue);
				return;
			case UMLPackage.INTERACTION_USE__GENERAL_ORDERING :
				getGeneralOrderings().clear();
				getGeneralOrderings()
					.addAll((Collection<? extends GeneralOrdering>) newValue);
				return;
			case UMLPackage.INTERACTION_USE__ACTUAL_GATE :
				getActualGates().clear();
				getActualGates().addAll((Collection<? extends Gate>) newValue);
				return;
			case UMLPackage.INTERACTION_USE__ARGUMENT :
				getArguments().clear();
				getArguments().addAll(
					(Collection<? extends ValueSpecification>) newValue);
				return;
			case UMLPackage.INTERACTION_USE__REFERS_TO :
				setRefersTo((Interaction) newValue);
				return;
			case UMLPackage.INTERACTION_USE__RETURN_VALUE :
				setReturnValue((ValueSpecification) newValue);
				return;
			case UMLPackage.INTERACTION_USE__RETURN_VALUE_RECIPIENT :
				setReturnValueRecipient((Property) newValue);
				return;
		}
		eDynamicSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			case UMLPackage.INTERACTION_USE__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.INTERACTION_USE__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.INTERACTION_USE__COVERED :
				getCovereds().clear();
				return;
			case UMLPackage.INTERACTION_USE__ENCLOSING_OPERAND :
				setEnclosingOperand((InteractionOperand) null);
				return;
			case UMLPackage.INTERACTION_USE__ENCLOSING_INTERACTION :
				setEnclosingInteraction((Interaction) null);
				return;
			case UMLPackage.INTERACTION_USE__GENERAL_ORDERING :
				getGeneralOrderings().clear();
				return;
			case UMLPackage.INTERACTION_USE__ACTUAL_GATE :
				getActualGates().clear();
				return;
			case UMLPackage.INTERACTION_USE__ARGUMENT :
				getArguments().clear();
				return;
			case UMLPackage.INTERACTION_USE__REFERS_TO :
				setRefersTo((Interaction) null);
				return;
			case UMLPackage.INTERACTION_USE__RETURN_VALUE :
				setReturnValue((ValueSpecification) null);
				return;
			case UMLPackage.INTERACTION_USE__RETURN_VALUE_RECIPIENT :
				setReturnValueRecipient((Property) null);
				return;
		}
		eDynamicUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UMLPackage.INTERACTION_USE__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.INTERACTION_USE__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.INTERACTION_USE__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.INTERACTION_USE__OWNER :
				return isSetOwner();
			case UMLPackage.INTERACTION_USE__CLIENT_DEPENDENCY :
				return !getClientDependencies().isEmpty();
			case UMLPackage.INTERACTION_USE__NAME :
				return isSetName();
			case UMLPackage.INTERACTION_USE__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.INTERACTION_USE__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.INTERACTION_USE__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.INTERACTION_USE__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.INTERACTION_USE__COVERED :
				return covereds != null && !covereds.isEmpty();
			case UMLPackage.INTERACTION_USE__ENCLOSING_OPERAND :
				return basicGetEnclosingOperand() != null;
			case UMLPackage.INTERACTION_USE__ENCLOSING_INTERACTION :
				return basicGetEnclosingInteraction() != null;
			case UMLPackage.INTERACTION_USE__GENERAL_ORDERING :
				return generalOrderings != null && !generalOrderings.isEmpty();
			case UMLPackage.INTERACTION_USE__ACTUAL_GATE :
				return actualGates != null && !actualGates.isEmpty();
			case UMLPackage.INTERACTION_USE__ARGUMENT :
				return arguments != null && !arguments.isEmpty();
			case UMLPackage.INTERACTION_USE__REFERS_TO :
				return refersTo != null;
			case UMLPackage.INTERACTION_USE__RETURN_VALUE :
				return returnValue != null;
			case UMLPackage.INTERACTION_USE__RETURN_VALUE_RECIPIENT :
				return returnValueRecipient != null;
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments)
			throws InvocationTargetException {
		switch (operationID) {
			case UMLPackage.INTERACTION_USE___GET_EANNOTATION__STRING :
				return getEAnnotation((String) arguments.get(0));
			case UMLPackage.INTERACTION_USE___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP :
				return validateHasOwner((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.INTERACTION_USE___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP :
				return validateNotOwnSelf((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.INTERACTION_USE___ADD_KEYWORD__STRING :
				return addKeyword((String) arguments.get(0));
			case UMLPackage.INTERACTION_USE___APPLY_STEREOTYPE__STEREOTYPE :
				return applyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.INTERACTION_USE___CREATE_EANNOTATION__STRING :
				return createEAnnotation((String) arguments.get(0));
			case UMLPackage.INTERACTION_USE___DESTROY :
				destroy();
				return null;
			case UMLPackage.INTERACTION_USE___GET_KEYWORDS :
				return getKeywords();
			case UMLPackage.INTERACTION_USE___GET_APPLICABLE_STEREOTYPE__STRING :
				return getApplicableStereotype((String) arguments.get(0));
			case UMLPackage.INTERACTION_USE___GET_APPLICABLE_STEREOTYPES :
				return getApplicableStereotypes();
			case UMLPackage.INTERACTION_USE___GET_APPLIED_STEREOTYPE__STRING :
				return getAppliedStereotype((String) arguments.get(0));
			case UMLPackage.INTERACTION_USE___GET_APPLIED_STEREOTYPES :
				return getAppliedStereotypes();
			case UMLPackage.INTERACTION_USE___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING :
				return getAppliedSubstereotype((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.INTERACTION_USE___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE :
				return getAppliedSubstereotypes((Stereotype) arguments.get(0));
			case UMLPackage.INTERACTION_USE___GET_MODEL :
				return getModel();
			case UMLPackage.INTERACTION_USE___GET_NEAREST_PACKAGE :
				return getNearestPackage();
			case UMLPackage.INTERACTION_USE___GET_RELATIONSHIPS :
				return getRelationships();
			case UMLPackage.INTERACTION_USE___GET_RELATIONSHIPS__ECLASS :
				return getRelationships((EClass) arguments.get(0));
			case UMLPackage.INTERACTION_USE___GET_REQUIRED_STEREOTYPE__STRING :
				return getRequiredStereotype((String) arguments.get(0));
			case UMLPackage.INTERACTION_USE___GET_REQUIRED_STEREOTYPES :
				return getRequiredStereotypes();
			case UMLPackage.INTERACTION_USE___GET_SOURCE_DIRECTED_RELATIONSHIPS :
				return getSourceDirectedRelationships();
			case UMLPackage.INTERACTION_USE___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS :
				return getSourceDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.INTERACTION_USE___GET_STEREOTYPE_APPLICATION__STEREOTYPE :
				return getStereotypeApplication((Stereotype) arguments.get(0));
			case UMLPackage.INTERACTION_USE___GET_STEREOTYPE_APPLICATIONS :
				return getStereotypeApplications();
			case UMLPackage.INTERACTION_USE___GET_TARGET_DIRECTED_RELATIONSHIPS :
				return getTargetDirectedRelationships();
			case UMLPackage.INTERACTION_USE___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS :
				return getTargetDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.INTERACTION_USE___GET_VALUE__STEREOTYPE_STRING :
				return getValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.INTERACTION_USE___HAS_KEYWORD__STRING :
				return hasKeyword((String) arguments.get(0));
			case UMLPackage.INTERACTION_USE___HAS_VALUE__STEREOTYPE_STRING :
				return hasValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.INTERACTION_USE___IS_STEREOTYPE_APPLICABLE__STEREOTYPE :
				return isStereotypeApplicable((Stereotype) arguments.get(0));
			case UMLPackage.INTERACTION_USE___IS_STEREOTYPE_APPLIED__STEREOTYPE :
				return isStereotypeApplied((Stereotype) arguments.get(0));
			case UMLPackage.INTERACTION_USE___IS_STEREOTYPE_REQUIRED__STEREOTYPE :
				return isStereotypeRequired((Stereotype) arguments.get(0));
			case UMLPackage.INTERACTION_USE___REMOVE_KEYWORD__STRING :
				return removeKeyword((String) arguments.get(0));
			case UMLPackage.INTERACTION_USE___SET_VALUE__STEREOTYPE_STRING_OBJECT :
				setValue((Stereotype) arguments.get(0),
					(String) arguments.get(1), arguments.get(2));
				return null;
			case UMLPackage.INTERACTION_USE___UNAPPLY_STEREOTYPE__STEREOTYPE :
				return unapplyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.INTERACTION_USE___ALL_OWNED_ELEMENTS :
				return allOwnedElements();
			case UMLPackage.INTERACTION_USE___MUST_BE_OWNED :
				return mustBeOwned();
			case UMLPackage.INTERACTION_USE___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP :
				return validateVisibilityNeedsOwnership(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.INTERACTION_USE___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.INTERACTION_USE___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasNoQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.INTERACTION_USE___CREATE_DEPENDENCY__NAMEDELEMENT :
				return createDependency((NamedElement) arguments.get(0));
			case UMLPackage.INTERACTION_USE___CREATE_USAGE__NAMEDELEMENT :
				return createUsage((NamedElement) arguments.get(0));
			case UMLPackage.INTERACTION_USE___GET_LABEL :
				return getLabel();
			case UMLPackage.INTERACTION_USE___GET_LABEL__BOOLEAN :
				return getLabel((Boolean) arguments.get(0));
			case UMLPackage.INTERACTION_USE___GET_NAMESPACE :
				return getNamespace();
			case UMLPackage.INTERACTION_USE___ALL_NAMESPACES :
				return allNamespaces();
			case UMLPackage.INTERACTION_USE___ALL_OWNING_PACKAGES :
				return allOwningPackages();
			case UMLPackage.INTERACTION_USE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE :
				return isDistinguishableFrom((NamedElement) arguments.get(0),
					(Namespace) arguments.get(1));
			case UMLPackage.INTERACTION_USE___GET_QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.INTERACTION_USE___SEPARATOR :
				return separator();
			case UMLPackage.INTERACTION_USE___GET_CLIENT_DEPENDENCIES :
				return getClientDependencies();
			case UMLPackage.INTERACTION_USE___VALIDATE_GATES_MATCH__DIAGNOSTICCHAIN_MAP :
				return validateGatesMatch((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.INTERACTION_USE___VALIDATE_ARGUMENTS_ARE_CONSTANTS__DIAGNOSTICCHAIN_MAP :
				return validateArgumentsAreConstants(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.INTERACTION_USE___VALIDATE_RETURN_VALUE_RECIPIENT_COVERAGE__DIAGNOSTICCHAIN_MAP :
				return validateReturnValueRecipientCoverage(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.INTERACTION_USE___VALIDATE_ARGUMENTS_CORRESPOND_TO_PARAMETERS__DIAGNOSTICCHAIN_MAP :
				return validateArgumentsCorrespondToParameters(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.INTERACTION_USE___VALIDATE_RETURN_VALUE_TYPE_RECIPIENT_CORRESPONDENCE__DIAGNOSTICCHAIN_MAP :
				return validateReturnValueTypeRecipientCorrespondence(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.INTERACTION_USE___VALIDATE_ALL_LIFELINES__DIAGNOSTICCHAIN_MAP :
				return validateAllLifelines((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		}
		return eDynamicInvoke(operationID, arguments);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getOwnedElements() <em>Owned Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedElements()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_ELEMENT_ESUBSETS = new int[]{
		UMLPackage.INTERACTION_USE__OWNED_COMMENT,
		UMLPackage.INTERACTION_USE__NAME_EXPRESSION,
		UMLPackage.INTERACTION_USE__GENERAL_ORDERING,
		UMLPackage.INTERACTION_USE__ACTUAL_GATE,
		UMLPackage.INTERACTION_USE__ARGUMENT,
		UMLPackage.INTERACTION_USE__RETURN_VALUE};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| eIsSet(UMLPackage.INTERACTION_USE__ACTUAL_GATE)
			|| eIsSet(UMLPackage.INTERACTION_USE__ARGUMENT)
			|| eIsSet(UMLPackage.INTERACTION_USE__RETURN_VALUE);
	}

} //InteractionUseImpl
