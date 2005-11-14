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
 * $Id: ParameterImpl.java,v 1.1 2005/11/14 22:26:05 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.MultiplicityElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.ParameterDirectionKind;
import org.eclipse.uml2.uml.ParameterEffectKind;
import org.eclipse.uml2.uml.ParameterSet;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.ValueSpecification;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.MultiplicityElementOperations;
import org.eclipse.uml2.uml.internal.operations.ParameterOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ParameterImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ParameterImpl#isOrdered <em>Is Ordered</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ParameterImpl#isUnique <em>Is Unique</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ParameterImpl#getUpper <em>Upper</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ParameterImpl#getLower <em>Lower</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ParameterImpl#getUpperValue <em>Upper Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ParameterImpl#getLowerValue <em>Lower Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ParameterImpl#getParameterSets <em>Parameter Set</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ParameterImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ParameterImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ParameterImpl#getDefault <em>Default</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ParameterImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ParameterImpl#isException <em>Is Exception</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ParameterImpl#isStream <em>Is Stream</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ParameterImpl#getEffect <em>Effect</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParameterImpl
		extends ConnectableElementImpl
		implements Parameter {

	/**
	 * The default value of the '{@link #isOrdered() <em>Is Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOrdered()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ORDERED_EDEFAULT = false;

	/**
	 * The flag representing the value of the '{@link #isOrdered() <em>Is Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOrdered()
	 * @generated
	 * @ordered
	 */
	protected static final int IS_ORDERED_EFLAG = 1 << 8;

	/**
	 * The default value of the '{@link #isUnique() <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnique()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_UNIQUE_EDEFAULT = true;

	/**
	 * The flag representing the value of the '{@link #isUnique() <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnique()
	 * @generated
	 * @ordered
	 */
	protected static final int IS_UNIQUE_EFLAG = 1 << 9;

	/**
	 * The default value of the '{@link #getUpper() <em>Upper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpper()
	 * @generated
	 * @ordered
	 */
	protected static final int UPPER_EDEFAULT = 1;

	/**
	 * The default value of the '{@link #getLower() <em>Lower</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLower()
	 * @generated
	 * @ordered
	 */
	protected static final int LOWER_EDEFAULT = 1;

	/**
	 * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected static final ParameterDirectionKind DIRECTION_EDEFAULT = ParameterDirectionKind.IN_LITERAL;

	/**
	 * The default value of the '{@link #getDefault() <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #isException() <em>Is Exception</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isException()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_EXCEPTION_EDEFAULT = false;

	/**
	 * The flag representing the value of the '{@link #isException() <em>Is Exception</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isException()
	 * @generated
	 * @ordered
	 */
	protected static final int IS_EXCEPTION_EFLAG = 1 << 10;

	/**
	 * The default value of the '{@link #isStream() <em>Is Stream</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStream()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_STREAM_EDEFAULT = false;

	/**
	 * The flag representing the value of the '{@link #isStream() <em>Is Stream</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStream()
	 * @generated
	 * @ordered
	 */
	protected static final int IS_STREAM_EFLAG = 1 << 11;

	/**
	 * The default value of the '{@link #getEffect() <em>Effect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffect()
	 * @generated
	 * @ordered
	 */
	protected static final ParameterEffectKind EFFECT_EDEFAULT = ParameterEffectKind.CREATE_LITERAL;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterImpl() {
		super();
		eFlags |= IS_UNIQUE_EFLAG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.eINSTANCE.getParameter();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getOwnedElements() {
		List ownedElement = (List) eVirtualGet(UMLPackage.PARAMETER__OWNED_ELEMENT);
		if (ownedElement == null) {
			eVirtualSet(UMLPackage.PARAMETER__OWNED_ELEMENT,
				ownedElement = new DerivedUnionEObjectEList(Element.class,
					this, UMLPackage.PARAMETER__OWNED_ELEMENT,
					new EStructuralFeature[]{
						UMLPackage.eINSTANCE.getElement_OwnedComment(),
						UMLPackage.eINSTANCE.getNamedElement_NameExpression(),
						UMLPackage.eINSTANCE
							.getMultiplicityElement_UpperValue(),
						UMLPackage.eINSTANCE
							.getMultiplicityElement_LowerValue(),
						UMLPackage.eINSTANCE.getParameter_DefaultValue()}));
		}
		return ownedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOrdered() {
		return (eFlags & IS_ORDERED_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsOrdered(boolean newIsOrdered) {
		boolean oldIsOrdered = (eFlags & IS_ORDERED_EFLAG) != 0;
		if (newIsOrdered)
			eFlags |= IS_ORDERED_EFLAG;
		else
			eFlags &= ~IS_ORDERED_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.PARAMETER__IS_ORDERED, oldIsOrdered, newIsOrdered));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUnique() {
		return (eFlags & IS_UNIQUE_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsUnique(boolean newIsUnique) {
		boolean oldIsUnique = (eFlags & IS_UNIQUE_EFLAG) != 0;
		if (newIsUnique)
			eFlags |= IS_UNIQUE_EFLAG;
		else
			eFlags &= ~IS_UNIQUE_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.PARAMETER__IS_UNIQUE, oldIsUnique, newIsUnique));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getUpper() {
		// TODO: implement this method to return the 'Upper' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpper(int newUpper) {
		// TODO: implement this method to set the 'Upper' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLower() {
		// TODO: implement this method to return the 'Lower' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLower(int newLower) {
		// TODO: implement this method to set the 'Lower' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getUpperValue() {
		ValueSpecification upperValue = (ValueSpecification) eVirtualGet(UMLPackage.PARAMETER__UPPER_VALUE);
		return upperValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpperValue(
			ValueSpecification newUpperValue, NotificationChain msgs) {
		Object oldUpperValue = eVirtualSet(UMLPackage.PARAMETER__UPPER_VALUE,
			newUpperValue);
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET, UMLPackage.PARAMETER__UPPER_VALUE,
				oldUpperValue == EVIRTUAL_NO_VALUE
					? null
					: oldUpperValue, newUpperValue);
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
	public void setUpperValue(ValueSpecification newUpperValue) {
		ValueSpecification upperValue = (ValueSpecification) eVirtualGet(UMLPackage.PARAMETER__UPPER_VALUE);
		if (newUpperValue != upperValue) {
			NotificationChain msgs = null;
			if (upperValue != null)
				msgs = ((InternalEObject) upperValue).eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE - UMLPackage.PARAMETER__UPPER_VALUE,
					null, msgs);
			if (newUpperValue != null)
				msgs = ((InternalEObject) newUpperValue).eInverseAdd(this,
					EOPPOSITE_FEATURE_BASE - UMLPackage.PARAMETER__UPPER_VALUE,
					null, msgs);
			msgs = basicSetUpperValue(newUpperValue, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.PARAMETER__UPPER_VALUE, newUpperValue, newUpperValue));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification createUpperValue(EClass eClass) {
		ValueSpecification newUpperValue = (ValueSpecification) eClass
			.getEPackage().getEFactoryInstance().create(eClass);
		setUpperValue(newUpperValue);
		return newUpperValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getLowerValue() {
		ValueSpecification lowerValue = (ValueSpecification) eVirtualGet(UMLPackage.PARAMETER__LOWER_VALUE);
		return lowerValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLowerValue(
			ValueSpecification newLowerValue, NotificationChain msgs) {
		Object oldLowerValue = eVirtualSet(UMLPackage.PARAMETER__LOWER_VALUE,
			newLowerValue);
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET, UMLPackage.PARAMETER__LOWER_VALUE,
				oldLowerValue == EVIRTUAL_NO_VALUE
					? null
					: oldLowerValue, newLowerValue);
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
	public void setLowerValue(ValueSpecification newLowerValue) {
		ValueSpecification lowerValue = (ValueSpecification) eVirtualGet(UMLPackage.PARAMETER__LOWER_VALUE);
		if (newLowerValue != lowerValue) {
			NotificationChain msgs = null;
			if (lowerValue != null)
				msgs = ((InternalEObject) lowerValue).eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE - UMLPackage.PARAMETER__LOWER_VALUE,
					null, msgs);
			if (newLowerValue != null)
				msgs = ((InternalEObject) newLowerValue).eInverseAdd(this,
					EOPPOSITE_FEATURE_BASE - UMLPackage.PARAMETER__LOWER_VALUE,
					null, msgs);
			msgs = basicSetLowerValue(newLowerValue, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.PARAMETER__LOWER_VALUE, newLowerValue, newLowerValue));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification createLowerValue(EClass eClass) {
		ValueSpecification newLowerValue = (ValueSpecification) eClass
			.getEPackage().getEFactoryInstance().create(eClass);
		setLowerValue(newLowerValue);
		return newLowerValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getParameterSets() {
		List parameterSet = (List) eVirtualGet(UMLPackage.PARAMETER__PARAMETER_SET);
		if (parameterSet == null) {
			eVirtualSet(
				UMLPackage.PARAMETER__PARAMETER_SET,
				parameterSet = new EObjectWithInverseResolvingEList.ManyInverse(
					ParameterSet.class, this,
					UMLPackage.PARAMETER__PARAMETER_SET,
					UMLPackage.PARAMETER_SET__PARAMETER));
		}
		return parameterSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterSet getParameterSet(String name) {
		for (Iterator i = getParameterSets().iterator(); i.hasNext();) {
			ParameterSet parameterSet = (ParameterSet) i.next();
			if (name.equals(parameterSet.getName())) {
				return parameterSet;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getOperation() {
		Operation operation = basicGetOperation();
		return operation == null
			? null
			: (operation.eIsProxy()
				? (Operation) eResolveProxy((InternalEObject) operation)
				: operation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation basicGetOperation() {
		// TODO: implement this method to return the 'Operation' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterDirectionKind getDirection() {
		ParameterDirectionKind direction = (ParameterDirectionKind) eVirtualGet(UMLPackage.PARAMETER__DIRECTION);
		return direction == null
			? DIRECTION_EDEFAULT
			: direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirection(ParameterDirectionKind newDirection) {
		ParameterDirectionKind direction = newDirection == null
			? DIRECTION_EDEFAULT
			: newDirection;
		Object oldDirection = eVirtualSet(UMLPackage.PARAMETER__DIRECTION,
			direction);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.PARAMETER__DIRECTION,
				oldDirection == EVIRTUAL_NO_VALUE
					? DIRECTION_EDEFAULT
					: oldDirection, direction));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefault() {
		// TODO: implement this method to return the 'Default' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefault(String newDefault) {
		newDefault = newDefault == null
			? DEFAULT_EDEFAULT
			: newDefault;
		// TODO: implement this method to set the 'Default' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getDefaultValue() {
		ValueSpecification defaultValue = (ValueSpecification) eVirtualGet(UMLPackage.PARAMETER__DEFAULT_VALUE);
		return defaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultValue(
			ValueSpecification newDefaultValue, NotificationChain msgs) {
		Object oldDefaultValue = eVirtualSet(
			UMLPackage.PARAMETER__DEFAULT_VALUE, newDefaultValue);
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET, UMLPackage.PARAMETER__DEFAULT_VALUE,
				oldDefaultValue == EVIRTUAL_NO_VALUE
					? null
					: oldDefaultValue, newDefaultValue);
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
	public void setDefaultValue(ValueSpecification newDefaultValue) {
		ValueSpecification defaultValue = (ValueSpecification) eVirtualGet(UMLPackage.PARAMETER__DEFAULT_VALUE);
		if (newDefaultValue != defaultValue) {
			NotificationChain msgs = null;
			if (defaultValue != null)
				msgs = ((InternalEObject) defaultValue).eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.PARAMETER__DEFAULT_VALUE, null, msgs);
			if (newDefaultValue != null)
				msgs = ((InternalEObject) newDefaultValue).eInverseAdd(this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.PARAMETER__DEFAULT_VALUE, null, msgs);
			msgs = basicSetDefaultValue(newDefaultValue, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.PARAMETER__DEFAULT_VALUE, newDefaultValue,
				newDefaultValue));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification createDefaultValue(EClass eClass) {
		ValueSpecification newDefaultValue = (ValueSpecification) eClass
			.getEPackage().getEFactoryInstance().create(eClass);
		setDefaultValue(newDefaultValue);
		return newDefaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isException() {
		return (eFlags & IS_EXCEPTION_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsException(boolean newIsException) {
		boolean oldIsException = (eFlags & IS_EXCEPTION_EFLAG) != 0;
		if (newIsException)
			eFlags |= IS_EXCEPTION_EFLAG;
		else
			eFlags &= ~IS_EXCEPTION_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.PARAMETER__IS_EXCEPTION, oldIsException,
				newIsException));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStream() {
		return (eFlags & IS_STREAM_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsStream(boolean newIsStream) {
		boolean oldIsStream = (eFlags & IS_STREAM_EFLAG) != 0;
		if (newIsStream)
			eFlags |= IS_STREAM_EFLAG;
		else
			eFlags &= ~IS_STREAM_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.PARAMETER__IS_STREAM, oldIsStream, newIsStream));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterEffectKind getEffect() {
		ParameterEffectKind effect = (ParameterEffectKind) eVirtualGet(UMLPackage.PARAMETER__EFFECT);
		return effect == null
			? EFFECT_EDEFAULT
			: effect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffect(ParameterEffectKind newEffect) {
		ParameterEffectKind effect = newEffect == null
			? EFFECT_EDEFAULT
			: newEffect;
		Object oldEffect = eVirtualSet(UMLPackage.PARAMETER__EFFECT, effect);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.PARAMETER__EFFECT, oldEffect == EVIRTUAL_NO_VALUE
					? EFFECT_EDEFAULT
					: oldEffect, effect));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUpperGt0(DiagnosticChain diagnostics, Map context) {
		return MultiplicityElementOperations.validateUpperGt0(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLowerGe0(DiagnosticChain diagnostics, Map context) {
		return MultiplicityElementOperations.validateLowerGe0(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUpperGeLower(DiagnosticChain diagnostics, Map context) {
		return MultiplicityElementOperations.validateUpperGeLower(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueSpecificationNoSideEffects(
			DiagnosticChain diagnostics, Map context) {
		return MultiplicityElementOperations
			.validateValueSpecificationNoSideEffects(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueSpecificationConstant(
			DiagnosticChain diagnostics, Map context) {
		return MultiplicityElementOperations
			.validateValueSpecificationConstant(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMultivalued() {
		return MultiplicityElementOperations.isMultivalued(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean includesCardinality(int C) {
		return MultiplicityElementOperations.includesCardinality(this, C);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean includesMultiplicity(MultiplicityElement M) {
		return MultiplicityElementOperations.includesMultiplicity(this, M);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int lowerBound() {
		return MultiplicityElementOperations.lowerBound(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int upperBound() {
		return MultiplicityElementOperations.upperBound(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectorEnd(DiagnosticChain diagnostics, Map context) {
		return ParameterOperations.validateConnectorEnd(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStreamAndException(DiagnosticChain diagnostics,
			Map context) {
		return ParameterOperations.validateStreamAndException(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNotException(DiagnosticChain diagnostics, Map context) {
		return ParameterOperations.validateNotException(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReentrantBehaviors(DiagnosticChain diagnostics,
			Map context) {
		return ParameterOperations.validateReentrantBehaviors(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInAndOut(DiagnosticChain diagnostics, Map context) {
		return ParameterOperations.validateInAndOut(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UMLPackage.PARAMETER__EANNOTATIONS :
					return ((InternalEList) getEAnnotations()).basicAdd(
						otherEnd, msgs);
				case UMLPackage.PARAMETER__CLIENT_DEPENDENCY :
					return ((InternalEList) getClientDependencies()).basicAdd(
						otherEnd, msgs);
				case UMLPackage.PARAMETER__TEMPLATE_PARAMETER :
					TemplateParameter templateParameter = (TemplateParameter) eVirtualGet(UMLPackage.PARAMETER__TEMPLATE_PARAMETER);
					if (templateParameter != null)
						msgs = ((InternalEObject) templateParameter)
							.eInverseRemove(
								this,
								UMLPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT,
								TemplateParameter.class, msgs);
					return basicSetTemplateParameter(
						(TemplateParameter) otherEnd, msgs);
				case UMLPackage.PARAMETER__OWNING_TEMPLATE_PARAMETER :
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd,
						UMLPackage.PARAMETER__OWNING_TEMPLATE_PARAMETER, msgs);
				case UMLPackage.PARAMETER__END :
					return ((InternalEList) getEnds()).basicAdd(otherEnd, msgs);
				case UMLPackage.PARAMETER__PARAMETER_SET :
					return ((InternalEList) getParameterSets()).basicAdd(
						otherEnd, msgs);
				default :
					return eDynamicInverseAdd(otherEnd, featureID, baseClass,
						msgs);
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UMLPackage.PARAMETER__EANNOTATIONS :
					return ((InternalEList) getEAnnotations()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.PARAMETER__OWNED_COMMENT :
					return ((InternalEList) getOwnedComments()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.PARAMETER__CLIENT_DEPENDENCY :
					return ((InternalEList) getClientDependencies())
						.basicRemove(otherEnd, msgs);
				case UMLPackage.PARAMETER__NAME_EXPRESSION :
					return basicSetNameExpression(null, msgs);
				case UMLPackage.PARAMETER__TEMPLATE_PARAMETER :
					return basicSetTemplateParameter(null, msgs);
				case UMLPackage.PARAMETER__OWNING_TEMPLATE_PARAMETER :
					return eBasicSetContainer(null,
						UMLPackage.PARAMETER__OWNING_TEMPLATE_PARAMETER, msgs);
				case UMLPackage.PARAMETER__END :
					return ((InternalEList) getEnds()).basicRemove(otherEnd,
						msgs);
				case UMLPackage.PARAMETER__UPPER_VALUE :
					return basicSetUpperValue(null, msgs);
				case UMLPackage.PARAMETER__LOWER_VALUE :
					return basicSetLowerValue(null, msgs);
				case UMLPackage.PARAMETER__PARAMETER_SET :
					return ((InternalEList) getParameterSets()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.PARAMETER__DEFAULT_VALUE :
					return basicSetDefaultValue(null, msgs);
				default :
					return eDynamicInverseRemove(otherEnd, featureID,
						baseClass, msgs);
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
			case UMLPackage.PARAMETER__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.PARAMETER__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.PARAMETER__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.PARAMETER__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.PARAMETER__NAME :
				return getName();
			case UMLPackage.PARAMETER__VISIBILITY :
				return getVisibility();
			case UMLPackage.PARAMETER__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.PARAMETER__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.PARAMETER__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.PARAMETER__NAME_EXPRESSION :
				return getNameExpression();
			case UMLPackage.PARAMETER__TYPE :
				if (resolve)
					return getType();
				return basicGetType();
			case UMLPackage.PARAMETER__TEMPLATE_PARAMETER :
				if (resolve)
					return getTemplateParameter();
				return basicGetTemplateParameter();
			case UMLPackage.PARAMETER__OWNING_TEMPLATE_PARAMETER :
				return getOwningTemplateParameter();
			case UMLPackage.PARAMETER__END :
				return getEnds();
			case UMLPackage.PARAMETER__IS_ORDERED :
				return isOrdered()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.PARAMETER__IS_UNIQUE :
				return isUnique()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.PARAMETER__UPPER :
				return new Integer(getUpper());
			case UMLPackage.PARAMETER__LOWER :
				return new Integer(getLower());
			case UMLPackage.PARAMETER__UPPER_VALUE :
				return getUpperValue();
			case UMLPackage.PARAMETER__LOWER_VALUE :
				return getLowerValue();
			case UMLPackage.PARAMETER__PARAMETER_SET :
				return getParameterSets();
			case UMLPackage.PARAMETER__OPERATION :
				if (resolve)
					return getOperation();
				return basicGetOperation();
			case UMLPackage.PARAMETER__DIRECTION :
				return getDirection();
			case UMLPackage.PARAMETER__DEFAULT :
				return getDefault();
			case UMLPackage.PARAMETER__DEFAULT_VALUE :
				return getDefaultValue();
			case UMLPackage.PARAMETER__IS_EXCEPTION :
				return isException()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.PARAMETER__IS_STREAM :
				return isStream()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.PARAMETER__EFFECT :
				return getEffect();
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
			case UMLPackage.PARAMETER__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.PARAMETER__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.PARAMETER__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.PARAMETER__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.PARAMETER__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.PARAMETER__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.PARAMETER__TYPE :
				setType((Type) newValue);
				return;
			case UMLPackage.PARAMETER__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.PARAMETER__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.PARAMETER__END :
				getEnds().clear();
				getEnds().addAll((Collection) newValue);
				return;
			case UMLPackage.PARAMETER__IS_ORDERED :
				setIsOrdered(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.PARAMETER__IS_UNIQUE :
				setIsUnique(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.PARAMETER__UPPER :
				setUpper(((Integer) newValue).intValue());
				return;
			case UMLPackage.PARAMETER__LOWER :
				setLower(((Integer) newValue).intValue());
				return;
			case UMLPackage.PARAMETER__UPPER_VALUE :
				setUpperValue((ValueSpecification) newValue);
				return;
			case UMLPackage.PARAMETER__LOWER_VALUE :
				setLowerValue((ValueSpecification) newValue);
				return;
			case UMLPackage.PARAMETER__PARAMETER_SET :
				getParameterSets().clear();
				getParameterSets().addAll((Collection) newValue);
				return;
			case UMLPackage.PARAMETER__DIRECTION :
				setDirection((ParameterDirectionKind) newValue);
				return;
			case UMLPackage.PARAMETER__DEFAULT :
				setDefault((String) newValue);
				return;
			case UMLPackage.PARAMETER__DEFAULT_VALUE :
				setDefaultValue((ValueSpecification) newValue);
				return;
			case UMLPackage.PARAMETER__IS_EXCEPTION :
				setIsException(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.PARAMETER__IS_STREAM :
				setIsStream(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.PARAMETER__EFFECT :
				setEffect((ParameterEffectKind) newValue);
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
			case UMLPackage.PARAMETER__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.PARAMETER__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.PARAMETER__NAME :
				setName(NAME_EDEFAULT);
				return;
			case UMLPackage.PARAMETER__VISIBILITY :
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UMLPackage.PARAMETER__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.PARAMETER__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.PARAMETER__TYPE :
				setType((Type) null);
				return;
			case UMLPackage.PARAMETER__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.PARAMETER__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.PARAMETER__END :
				getEnds().clear();
				return;
			case UMLPackage.PARAMETER__IS_ORDERED :
				setIsOrdered(IS_ORDERED_EDEFAULT);
				return;
			case UMLPackage.PARAMETER__IS_UNIQUE :
				setIsUnique(IS_UNIQUE_EDEFAULT);
				return;
			case UMLPackage.PARAMETER__UPPER :
				setUpper(UPPER_EDEFAULT);
				return;
			case UMLPackage.PARAMETER__LOWER :
				setLower(LOWER_EDEFAULT);
				return;
			case UMLPackage.PARAMETER__UPPER_VALUE :
				setUpperValue((ValueSpecification) null);
				return;
			case UMLPackage.PARAMETER__LOWER_VALUE :
				setLowerValue((ValueSpecification) null);
				return;
			case UMLPackage.PARAMETER__PARAMETER_SET :
				getParameterSets().clear();
				return;
			case UMLPackage.PARAMETER__DIRECTION :
				setDirection(DIRECTION_EDEFAULT);
				return;
			case UMLPackage.PARAMETER__DEFAULT :
				setDefault(DEFAULT_EDEFAULT);
				return;
			case UMLPackage.PARAMETER__DEFAULT_VALUE :
				setDefaultValue((ValueSpecification) null);
				return;
			case UMLPackage.PARAMETER__IS_EXCEPTION :
				setIsException(IS_EXCEPTION_EDEFAULT);
				return;
			case UMLPackage.PARAMETER__IS_STREAM :
				setIsStream(IS_STREAM_EDEFAULT);
				return;
			case UMLPackage.PARAMETER__EFFECT :
				setEffect(EFFECT_EDEFAULT);
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
			case UMLPackage.PARAMETER__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.PARAMETER__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.PARAMETER__OWNER :
				return isSetOwner();
			case UMLPackage.PARAMETER__OWNED_COMMENT :
				List ownedComment = (List) eVirtualGet(UMLPackage.PARAMETER__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.PARAMETER__NAME :
				String name = eVirtualIsSet(UMLPackage.PARAMETER__NAME)
					? (String) eVirtualGet(UMLPackage.PARAMETER__NAME)
					: NAME_EDEFAULT;
				return NAME_EDEFAULT == null
					? name != null
					: !NAME_EDEFAULT.equals(name);
			case UMLPackage.PARAMETER__VISIBILITY :
				return eVirtualIsSet(UMLPackage.PARAMETER__VISIBILITY)
					&& eVirtualGet(UMLPackage.PARAMETER__VISIBILITY) != VISIBILITY_EDEFAULT;
			case UMLPackage.PARAMETER__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.PARAMETER__CLIENT_DEPENDENCY :
				List clientDependency = (List) eVirtualGet(UMLPackage.PARAMETER__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.PARAMETER__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.PARAMETER__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.PARAMETER__NAME_EXPRESSION) != null;
			case UMLPackage.PARAMETER__TYPE :
				return eVirtualGet(UMLPackage.PARAMETER__TYPE) != null;
			case UMLPackage.PARAMETER__TEMPLATE_PARAMETER :
				return eVirtualGet(UMLPackage.PARAMETER__TEMPLATE_PARAMETER) != null;
			case UMLPackage.PARAMETER__OWNING_TEMPLATE_PARAMETER :
				return getOwningTemplateParameter() != null;
			case UMLPackage.PARAMETER__END :
				List end = (List) eVirtualGet(UMLPackage.PARAMETER__END);
				return end != null && !end.isEmpty();
			case UMLPackage.PARAMETER__IS_ORDERED :
				return ((eFlags & IS_ORDERED_EFLAG) != 0) != IS_ORDERED_EDEFAULT;
			case UMLPackage.PARAMETER__IS_UNIQUE :
				return ((eFlags & IS_UNIQUE_EFLAG) != 0) != IS_UNIQUE_EDEFAULT;
			case UMLPackage.PARAMETER__UPPER :
				return getUpper() != UPPER_EDEFAULT;
			case UMLPackage.PARAMETER__LOWER :
				return getLower() != LOWER_EDEFAULT;
			case UMLPackage.PARAMETER__UPPER_VALUE :
				return eVirtualGet(UMLPackage.PARAMETER__UPPER_VALUE) != null;
			case UMLPackage.PARAMETER__LOWER_VALUE :
				return eVirtualGet(UMLPackage.PARAMETER__LOWER_VALUE) != null;
			case UMLPackage.PARAMETER__PARAMETER_SET :
				List parameterSet = (List) eVirtualGet(UMLPackage.PARAMETER__PARAMETER_SET);
				return parameterSet != null && !parameterSet.isEmpty();
			case UMLPackage.PARAMETER__OPERATION :
				return basicGetOperation() != null;
			case UMLPackage.PARAMETER__DIRECTION :
				return eVirtualIsSet(UMLPackage.PARAMETER__DIRECTION)
					&& eVirtualGet(UMLPackage.PARAMETER__DIRECTION) != DIRECTION_EDEFAULT;
			case UMLPackage.PARAMETER__DEFAULT :
				return DEFAULT_EDEFAULT == null
					? getDefault() != null
					: !DEFAULT_EDEFAULT.equals(getDefault());
			case UMLPackage.PARAMETER__DEFAULT_VALUE :
				return eVirtualGet(UMLPackage.PARAMETER__DEFAULT_VALUE) != null;
			case UMLPackage.PARAMETER__IS_EXCEPTION :
				return ((eFlags & IS_EXCEPTION_EFLAG) != 0) != IS_EXCEPTION_EDEFAULT;
			case UMLPackage.PARAMETER__IS_STREAM :
				return ((eFlags & IS_STREAM_EFLAG) != 0) != IS_STREAM_EDEFAULT;
			case UMLPackage.PARAMETER__EFFECT :
				return eVirtualIsSet(UMLPackage.PARAMETER__EFFECT)
					&& eVirtualGet(UMLPackage.PARAMETER__EFFECT) != EFFECT_EDEFAULT;
		}
		return eDynamicIsSet(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == MultiplicityElement.class) {
			switch (derivedFeatureID) {
				case UMLPackage.PARAMETER__IS_ORDERED :
					return UMLPackage.MULTIPLICITY_ELEMENT__IS_ORDERED;
				case UMLPackage.PARAMETER__IS_UNIQUE :
					return UMLPackage.MULTIPLICITY_ELEMENT__IS_UNIQUE;
				case UMLPackage.PARAMETER__UPPER :
					return UMLPackage.MULTIPLICITY_ELEMENT__UPPER;
				case UMLPackage.PARAMETER__LOWER :
					return UMLPackage.MULTIPLICITY_ELEMENT__LOWER;
				case UMLPackage.PARAMETER__UPPER_VALUE :
					return UMLPackage.MULTIPLICITY_ELEMENT__UPPER_VALUE;
				case UMLPackage.PARAMETER__LOWER_VALUE :
					return UMLPackage.MULTIPLICITY_ELEMENT__LOWER_VALUE;
				default :
					return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class baseClass) {
		if (baseClass == MultiplicityElement.class) {
			switch (baseFeatureID) {
				case UMLPackage.MULTIPLICITY_ELEMENT__IS_ORDERED :
					return UMLPackage.PARAMETER__IS_ORDERED;
				case UMLPackage.MULTIPLICITY_ELEMENT__IS_UNIQUE :
					return UMLPackage.PARAMETER__IS_UNIQUE;
				case UMLPackage.MULTIPLICITY_ELEMENT__UPPER :
					return UMLPackage.PARAMETER__UPPER;
				case UMLPackage.MULTIPLICITY_ELEMENT__LOWER :
					return UMLPackage.PARAMETER__LOWER;
				case UMLPackage.MULTIPLICITY_ELEMENT__UPPER_VALUE :
					return UMLPackage.PARAMETER__UPPER_VALUE;
				case UMLPackage.MULTIPLICITY_ELEMENT__LOWER_VALUE :
					return UMLPackage.PARAMETER__LOWER_VALUE;
				default :
					return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (isOrdered: "); //$NON-NLS-1$
		result.append((eFlags & IS_ORDERED_EFLAG) != 0);
		result.append(", isUnique: "); //$NON-NLS-1$
		result.append((eFlags & IS_UNIQUE_EFLAG) != 0);
		result.append(", direction: "); //$NON-NLS-1$
		result.append(eVirtualIsSet(UMLPackage.PARAMETER__DIRECTION)
			? eVirtualGet(UMLPackage.PARAMETER__DIRECTION)
			: DIRECTION_EDEFAULT);
		result.append(", isException: "); //$NON-NLS-1$
		result.append((eFlags & IS_EXCEPTION_EFLAG) != 0);
		result.append(", isStream: "); //$NON-NLS-1$
		result.append((eFlags & IS_STREAM_EFLAG) != 0);
		result.append(", effect: "); //$NON-NLS-1$
		result.append(eVirtualIsSet(UMLPackage.PARAMETER__EFFECT)
			? eVirtualGet(UMLPackage.PARAMETER__EFFECT)
			: EFFECT_EDEFAULT);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| eIsSet(UMLPackage.eINSTANCE.getMultiplicityElement_UpperValue())
			|| eIsSet(UMLPackage.eINSTANCE.getMultiplicityElement_LowerValue())
			|| eIsSet(UMLPackage.eINSTANCE.getParameter_DefaultValue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace basicGetNamespace() {
		Operation operation = basicGetOperation();
		if (operation != null) {
			return operation;
		}
		return super.basicGetNamespace();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNamespace() {
		return super.isSetNamespace()
			|| eIsSet(UMLPackage.eINSTANCE.getParameter_Operation());
	}

} //ParameterImpl
