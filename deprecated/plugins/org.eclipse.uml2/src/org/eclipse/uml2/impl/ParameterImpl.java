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
 * $Id: ParameterImpl.java,v 1.26 2005/11/28 17:18:05 khussey Exp $
 */
package org.eclipse.uml2.impl;

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

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.Element;
import org.eclipse.uml2.MultiplicityElement;
import org.eclipse.uml2.Namespace;
import org.eclipse.uml2.Operation;
import org.eclipse.uml2.Parameter;
import org.eclipse.uml2.ParameterDirectionKind;
import org.eclipse.uml2.ParameterEffectKind;
import org.eclipse.uml2.ParameterSet;
import org.eclipse.uml2.StringExpression;
import org.eclipse.uml2.TemplateParameter;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.Type;
import org.eclipse.uml2.TypedElement;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.ValueSpecification;
import org.eclipse.uml2.VisibilityKind;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.internal.operation.MultiplicityElementOperations;
import org.eclipse.uml2.internal.operation.ParameterOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.ParameterImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ParameterImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ParameterImpl#isOrdered <em>Is Ordered</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ParameterImpl#isUnique <em>Is Unique</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ParameterImpl#getLower <em>Lower</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ParameterImpl#getUpper <em>Upper</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ParameterImpl#getUpperValue <em>Upper Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ParameterImpl#getLowerValue <em>Lower Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ParameterImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ParameterImpl#getDefault <em>Default</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ParameterImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ParameterImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ParameterImpl#isException <em>Is Exception</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ParameterImpl#isStream <em>Is Stream</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ParameterImpl#getEffect <em>Effect</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ParameterImpl#getParameterSets <em>Parameter Set</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParameterImpl extends ConnectableElementImpl implements Parameter {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

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
	 * The default value of the '{@link #getLower() <em>Lower</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLower()
	 * @generated
	 * @ordered
	 */
	protected static final int LOWER_EDEFAULT = 1;

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
	 * The default value of the '{@link #getDefault() <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_EDEFAULT = ""; //$NON-NLS-1$

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
		return UML2Package.Literals.PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getType() {
		Type type = (Type)eVirtualGet(UML2Package.PARAMETER__TYPE);
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (Type)eResolveProxy(oldType);
			if (type != oldType) {
				eVirtualSet(UML2Package.PARAMETER__TYPE, type);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2Package.PARAMETER__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetType() {
		return (Type)eVirtualGet(UML2Package.PARAMETER__TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Type newType) {
		Type type = newType;
		Object oldType = eVirtualSet(UML2Package.PARAMETER__TYPE, type);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.PARAMETER__TYPE, oldType == EVIRTUAL_NO_VALUE ? null : oldType, type));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedElements() {
		EList ownedElement = (EList)eVirtualGet(UML2Package.PARAMETER__OWNED_ELEMENT);
		if (ownedElement == null) {
			eVirtualSet(UML2Package.PARAMETER__OWNED_ELEMENT, ownedElement = new DerivedUnionEObjectEList(Element.class, this, UML2Package.PARAMETER__OWNED_ELEMENT, new int[] {UML2Package.PARAMETER__OWNED_COMMENT, UML2Package.PARAMETER__TEMPLATE_BINDING, UML2Package.PARAMETER__OWNED_TEMPLATE_SIGNATURE, UML2Package.PARAMETER__NAME_EXPRESSION, UML2Package.PARAMETER__UPPER_VALUE, UML2Package.PARAMETER__LOWER_VALUE, UML2Package.PARAMETER__DEFAULT_VALUE}));
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
			|| eIsSet(UML2Package.PARAMETER__UPPER_VALUE)
			|| eIsSet(UML2Package.PARAMETER__LOWER_VALUE)
			|| eIsSet(UML2Package.PARAMETER__DEFAULT_VALUE);
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
		if (newIsOrdered) eFlags |= IS_ORDERED_EFLAG; else eFlags &= ~IS_ORDERED_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.PARAMETER__IS_ORDERED, oldIsOrdered, newIsOrdered));

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
		if (newIsUnique) eFlags |= IS_UNIQUE_EFLAG; else eFlags &= ~IS_UNIQUE_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.PARAMETER__IS_UNIQUE, oldIsUnique, newIsUnique));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int getLower() {
		return lower();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int getUpper() {
		return upper();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getUpperValue() {
		return (ValueSpecification)eVirtualGet(UML2Package.PARAMETER__UPPER_VALUE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpperValue(ValueSpecification newUpperValue, NotificationChain msgs) {
		Object oldUpperValue = eVirtualSet(UML2Package.PARAMETER__UPPER_VALUE, newUpperValue);
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UML2Package.PARAMETER__UPPER_VALUE, oldUpperValue == EVIRTUAL_NO_VALUE ? null : oldUpperValue, newUpperValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpperValue(ValueSpecification newUpperValue) {
		ValueSpecification upperValue = (ValueSpecification)eVirtualGet(UML2Package.PARAMETER__UPPER_VALUE);
		if (newUpperValue != upperValue) {
			NotificationChain msgs = null;
			if (upperValue != null)
				msgs = ((InternalEObject)upperValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.PARAMETER__UPPER_VALUE, null, msgs);
			if (newUpperValue != null)
				msgs = ((InternalEObject)newUpperValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UML2Package.PARAMETER__UPPER_VALUE, null, msgs);
			msgs = basicSetUpperValue(newUpperValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.PARAMETER__UPPER_VALUE, newUpperValue, newUpperValue));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ValueSpecification createUpperValue(EClass eClass) {
		ValueSpecification newUpperValue = (ValueSpecification) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.PARAMETER__UPPER_VALUE, null, newUpperValue));
		}
		setUpperValue(newUpperValue);
		return newUpperValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getLowerValue() {
		return (ValueSpecification)eVirtualGet(UML2Package.PARAMETER__LOWER_VALUE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLowerValue(ValueSpecification newLowerValue, NotificationChain msgs) {
		Object oldLowerValue = eVirtualSet(UML2Package.PARAMETER__LOWER_VALUE, newLowerValue);
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UML2Package.PARAMETER__LOWER_VALUE, oldLowerValue == EVIRTUAL_NO_VALUE ? null : oldLowerValue, newLowerValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowerValue(ValueSpecification newLowerValue) {
		ValueSpecification lowerValue = (ValueSpecification)eVirtualGet(UML2Package.PARAMETER__LOWER_VALUE);
		if (newLowerValue != lowerValue) {
			NotificationChain msgs = null;
			if (lowerValue != null)
				msgs = ((InternalEObject)lowerValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.PARAMETER__LOWER_VALUE, null, msgs);
			if (newLowerValue != null)
				msgs = ((InternalEObject)newLowerValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UML2Package.PARAMETER__LOWER_VALUE, null, msgs);
			msgs = basicSetLowerValue(newLowerValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.PARAMETER__LOWER_VALUE, newLowerValue, newLowerValue));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ValueSpecification createLowerValue(EClass eClass) {
		ValueSpecification newLowerValue = (ValueSpecification) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.PARAMETER__LOWER_VALUE, null, newLowerValue));
		}
		setLowerValue(newLowerValue);
		return newLowerValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getDefault() {
		return org.eclipse.uml2.internal.operation.ParameterOperations.getDefault(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterDirectionKind getDirection() {
		return (ParameterDirectionKind)eVirtualGet(UML2Package.PARAMETER__DIRECTION, DIRECTION_EDEFAULT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirection(ParameterDirectionKind newDirection) {
		ParameterDirectionKind direction = newDirection == null ? DIRECTION_EDEFAULT : newDirection;
		Object oldDirection = eVirtualSet(UML2Package.PARAMETER__DIRECTION, direction);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.PARAMETER__DIRECTION, oldDirection == EVIRTUAL_NO_VALUE ? DIRECTION_EDEFAULT : oldDirection, direction));

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
		if (newIsException) eFlags |= IS_EXCEPTION_EFLAG; else eFlags &= ~IS_EXCEPTION_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.PARAMETER__IS_EXCEPTION, oldIsException, newIsException));

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
		if (newIsStream) eFlags |= IS_STREAM_EFLAG; else eFlags &= ~IS_STREAM_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.PARAMETER__IS_STREAM, oldIsStream, newIsStream));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterEffectKind getEffect() {
		return (ParameterEffectKind)eVirtualGet(UML2Package.PARAMETER__EFFECT, EFFECT_EDEFAULT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffect(ParameterEffectKind newEffect) {
		ParameterEffectKind effect = newEffect == null ? EFFECT_EDEFAULT : newEffect;
		Object oldEffect = eVirtualSet(UML2Package.PARAMETER__EFFECT, effect);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.PARAMETER__EFFECT, oldEffect == EVIRTUAL_NO_VALUE ? EFFECT_EDEFAULT : oldEffect, effect));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getOperation() {
		if (eContainerFeatureID != UML2Package.PARAMETER__OPERATION) return null;
		return (Operation)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperation(Operation newOperation) {
		if (newOperation != eInternalContainer() || (eContainerFeatureID != UML2Package.PARAMETER__OPERATION && newOperation != null)) {
			if (EcoreUtil.isAncestor(this, newOperation))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOperation != null)
				msgs = ((InternalEObject)newOperation).eInverseAdd(this, UML2Package.OPERATION__OWNED_PARAMETER, Operation.class, msgs);
			msgs = eBasicSetContainer((InternalEObject)newOperation, UML2Package.PARAMETER__OPERATION, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.PARAMETER__OPERATION, newOperation, newOperation));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getDefaultValue() {
		return (ValueSpecification)eVirtualGet(UML2Package.PARAMETER__DEFAULT_VALUE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultValue(ValueSpecification newDefaultValue, NotificationChain msgs) {
		Object oldDefaultValue = eVirtualSet(UML2Package.PARAMETER__DEFAULT_VALUE, newDefaultValue);
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UML2Package.PARAMETER__DEFAULT_VALUE, oldDefaultValue == EVIRTUAL_NO_VALUE ? null : oldDefaultValue, newDefaultValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValue(ValueSpecification newDefaultValue) {
		ValueSpecification defaultValue = (ValueSpecification)eVirtualGet(UML2Package.PARAMETER__DEFAULT_VALUE);
		if (newDefaultValue != defaultValue) {
			NotificationChain msgs = null;
			if (defaultValue != null)
				msgs = ((InternalEObject)defaultValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.PARAMETER__DEFAULT_VALUE, null, msgs);
			if (newDefaultValue != null)
				msgs = ((InternalEObject)newDefaultValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UML2Package.PARAMETER__DEFAULT_VALUE, null, msgs);
			msgs = basicSetDefaultValue(newDefaultValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.PARAMETER__DEFAULT_VALUE, newDefaultValue, newDefaultValue));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ValueSpecification createDefaultValue(EClass eClass) {
		ValueSpecification newDefaultValue = (ValueSpecification) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.PARAMETER__DEFAULT_VALUE, null, newDefaultValue));
		}
		setDefaultValue(newDefaultValue);
		return newDefaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getParameterSets() {
		EList parameterSet = (EList)eVirtualGet(UML2Package.PARAMETER__PARAMETER_SET);
		if (parameterSet == null) {
			eVirtualSet(UML2Package.PARAMETER__PARAMETER_SET, parameterSet = new EObjectWithInverseResolvingEList.ManyInverse(ParameterSet.class, this, UML2Package.PARAMETER__PARAMETER_SET, UML2Package.PARAMETER_SET__PARAMETER));
		}
		return parameterSet;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public ParameterSet getParameterSet(String name) {
		for (Iterator i = getParameterSets().iterator(); i.hasNext(); ) {
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
	public boolean validateUpperGt0(DiagnosticChain diagnostics, Map context) {
		return MultiplicityElementOperations.validateUpperGt0(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLowerGe0(DiagnosticChain diagnostics, Map context) {
		return MultiplicityElementOperations.validateLowerGe0(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUpperGeLower(DiagnosticChain diagnostics, Map context) {
		return MultiplicityElementOperations.validateUpperGeLower(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLowerEqLowerbound(DiagnosticChain diagnostics, Map context) {
		return MultiplicityElementOperations.validateLowerEqLowerbound(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUpperEqUpperbound(DiagnosticChain diagnostics, Map context) {
		return MultiplicityElementOperations.validateUpperEqUpperbound(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int lower() {
		return MultiplicityElementOperations.lower(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int upper() {
		return MultiplicityElementOperations.upper(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UML2Package.PARAMETER__EANNOTATIONS:
				return ((InternalEList)getEAnnotations()).basicAdd(otherEnd, msgs);
			case UML2Package.PARAMETER__TEMPLATE_BINDING:
				return ((InternalEList)getTemplateBindings()).basicAdd(otherEnd, msgs);
			case UML2Package.PARAMETER__OWNED_TEMPLATE_SIGNATURE:
				TemplateSignature ownedTemplateSignature = (TemplateSignature)eVirtualGet(UML2Package.PARAMETER__OWNED_TEMPLATE_SIGNATURE);
				if (ownedTemplateSignature != null)
					msgs = ((InternalEObject)ownedTemplateSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.PARAMETER__OWNED_TEMPLATE_SIGNATURE, null, msgs);
				return basicSetOwnedTemplateSignature((TemplateSignature)otherEnd, msgs);
			case UML2Package.PARAMETER__CLIENT_DEPENDENCY:
				return ((InternalEList)getClientDependencies()).basicAdd(otherEnd, msgs);
			case UML2Package.PARAMETER__TEMPLATE_PARAMETER:
				TemplateParameter templateParameter = (TemplateParameter)eVirtualGet(UML2Package.PARAMETER__TEMPLATE_PARAMETER);
				if (templateParameter != null)
					msgs = ((InternalEObject)templateParameter).eInverseRemove(this, UML2Package.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
				return basicSetTemplateParameter((TemplateParameter)otherEnd, msgs);
			case UML2Package.PARAMETER__OWNING_PARAMETER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, UML2Package.PARAMETER__OWNING_PARAMETER, msgs);
			case UML2Package.PARAMETER__END:
				return ((InternalEList)getEnds()).basicAdd(otherEnd, msgs);
			case UML2Package.PARAMETER__OPERATION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, UML2Package.PARAMETER__OPERATION, msgs);
			case UML2Package.PARAMETER__PARAMETER_SET:
				return ((InternalEList)getParameterSets()).basicAdd(otherEnd, msgs);
		}
		return eDynamicInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UML2Package.PARAMETER__EANNOTATIONS:
				return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
			case UML2Package.PARAMETER__OWNED_COMMENT:
				return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
			case UML2Package.PARAMETER__TEMPLATE_BINDING:
				return ((InternalEList)getTemplateBindings()).basicRemove(otherEnd, msgs);
			case UML2Package.PARAMETER__OWNED_TEMPLATE_SIGNATURE:
				return basicSetOwnedTemplateSignature(null, msgs);
			case UML2Package.PARAMETER__CLIENT_DEPENDENCY:
				return ((InternalEList)getClientDependencies()).basicRemove(otherEnd, msgs);
			case UML2Package.PARAMETER__NAME_EXPRESSION:
				return basicSetNameExpression(null, msgs);
			case UML2Package.PARAMETER__TEMPLATE_PARAMETER:
				return basicSetTemplateParameter(null, msgs);
			case UML2Package.PARAMETER__OWNING_PARAMETER:
				return eBasicSetContainer(null, UML2Package.PARAMETER__OWNING_PARAMETER, msgs);
			case UML2Package.PARAMETER__END:
				return ((InternalEList)getEnds()).basicRemove(otherEnd, msgs);
			case UML2Package.PARAMETER__UPPER_VALUE:
				return basicSetUpperValue(null, msgs);
			case UML2Package.PARAMETER__LOWER_VALUE:
				return basicSetLowerValue(null, msgs);
			case UML2Package.PARAMETER__OPERATION:
				return eBasicSetContainer(null, UML2Package.PARAMETER__OPERATION, msgs);
			case UML2Package.PARAMETER__DEFAULT_VALUE:
				return basicSetDefaultValue(null, msgs);
			case UML2Package.PARAMETER__PARAMETER_SET:
				return ((InternalEList)getParameterSets()).basicRemove(otherEnd, msgs);
		}
		return eDynamicInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID) {
			case UML2Package.PARAMETER__OWNING_PARAMETER:
				return eInternalContainer().eInverseRemove(this, UML2Package.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
			case UML2Package.PARAMETER__OPERATION:
				return eInternalContainer().eInverseRemove(this, UML2Package.OPERATION__OWNED_PARAMETER, Operation.class, msgs);
		}
		return eDynamicBasicRemoveFromContainer(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace basicGetNamespace() {
		Operation operation = getOperation();			
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
			|| eIsSet(UML2Package.PARAMETER__OPERATION);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UML2Package.PARAMETER__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.PARAMETER__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.PARAMETER__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.PARAMETER__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.PARAMETER__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.PARAMETER__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UML2Package.PARAMETER__NAME:
				return getName();
			case UML2Package.PARAMETER__QUALIFIED_NAME:
				return getQualifiedName();
			case UML2Package.PARAMETER__VISIBILITY:
				return getVisibility();
			case UML2Package.PARAMETER__CLIENT_DEPENDENCY:
				return getClientDependencies();
			case UML2Package.PARAMETER__NAME_EXPRESSION:
				return getNameExpression();
			case UML2Package.PARAMETER__TEMPLATE_PARAMETER:
				if (resolve) return getTemplateParameter();
				return basicGetTemplateParameter();
			case UML2Package.PARAMETER__OWNING_PARAMETER:
				return getOwningParameter();
			case UML2Package.PARAMETER__END:
				return getEnds();
			case UML2Package.PARAMETER__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case UML2Package.PARAMETER__IS_ORDERED:
				return isOrdered() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.PARAMETER__IS_UNIQUE:
				return isUnique() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.PARAMETER__LOWER:
				return new Integer(getLower());
			case UML2Package.PARAMETER__UPPER:
				return new Integer(getUpper());
			case UML2Package.PARAMETER__UPPER_VALUE:
				return getUpperValue();
			case UML2Package.PARAMETER__LOWER_VALUE:
				return getLowerValue();
			case UML2Package.PARAMETER__OPERATION:
				return getOperation();
			case UML2Package.PARAMETER__DEFAULT:
				return getDefault();
			case UML2Package.PARAMETER__DIRECTION:
				return getDirection();
			case UML2Package.PARAMETER__DEFAULT_VALUE:
				return getDefaultValue();
			case UML2Package.PARAMETER__IS_EXCEPTION:
				return isException() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.PARAMETER__IS_STREAM:
				return isStream() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.PARAMETER__EFFECT:
				return getEffect();
			case UML2Package.PARAMETER__PARAMETER_SET:
				return getParameterSets();
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
			case UML2Package.PARAMETER__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.PARAMETER__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.PARAMETER__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection)newValue);
				return;
			case UML2Package.PARAMETER__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case UML2Package.PARAMETER__NAME:
				setName((String)newValue);
				return;
			case UML2Package.PARAMETER__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case UML2Package.PARAMETER__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection)newValue);
				return;
			case UML2Package.PARAMETER__NAME_EXPRESSION:
				setNameExpression((StringExpression)newValue);
				return;
			case UML2Package.PARAMETER__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)newValue);
				return;
			case UML2Package.PARAMETER__OWNING_PARAMETER:
				setOwningParameter((TemplateParameter)newValue);
				return;
			case UML2Package.PARAMETER__END:
				getEnds().clear();
				getEnds().addAll((Collection)newValue);
				return;
			case UML2Package.PARAMETER__TYPE:
				setType((Type)newValue);
				return;
			case UML2Package.PARAMETER__IS_ORDERED:
				setIsOrdered(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.PARAMETER__IS_UNIQUE:
				setIsUnique(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.PARAMETER__UPPER_VALUE:
				setUpperValue((ValueSpecification)newValue);
				return;
			case UML2Package.PARAMETER__LOWER_VALUE:
				setLowerValue((ValueSpecification)newValue);
				return;
			case UML2Package.PARAMETER__OPERATION:
				setOperation((Operation)newValue);
				return;
			case UML2Package.PARAMETER__DIRECTION:
				setDirection((ParameterDirectionKind)newValue);
				return;
			case UML2Package.PARAMETER__DEFAULT_VALUE:
				setDefaultValue((ValueSpecification)newValue);
				return;
			case UML2Package.PARAMETER__IS_EXCEPTION:
				setIsException(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.PARAMETER__IS_STREAM:
				setIsStream(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.PARAMETER__EFFECT:
				setEffect((ParameterEffectKind)newValue);
				return;
			case UML2Package.PARAMETER__PARAMETER_SET:
				getParameterSets().clear();
				getParameterSets().addAll((Collection)newValue);
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
			case UML2Package.PARAMETER__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.PARAMETER__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.PARAMETER__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				return;
			case UML2Package.PARAMETER__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case UML2Package.PARAMETER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UML2Package.PARAMETER__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UML2Package.PARAMETER__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				return;
			case UML2Package.PARAMETER__NAME_EXPRESSION:
				setNameExpression((StringExpression)null);
				return;
			case UML2Package.PARAMETER__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)null);
				return;
			case UML2Package.PARAMETER__OWNING_PARAMETER:
				setOwningParameter((TemplateParameter)null);
				return;
			case UML2Package.PARAMETER__END:
				getEnds().clear();
				return;
			case UML2Package.PARAMETER__TYPE:
				setType((Type)null);
				return;
			case UML2Package.PARAMETER__IS_ORDERED:
				setIsOrdered(IS_ORDERED_EDEFAULT);
				return;
			case UML2Package.PARAMETER__IS_UNIQUE:
				setIsUnique(IS_UNIQUE_EDEFAULT);
				return;
			case UML2Package.PARAMETER__UPPER_VALUE:
				setUpperValue((ValueSpecification)null);
				return;
			case UML2Package.PARAMETER__LOWER_VALUE:
				setLowerValue((ValueSpecification)null);
				return;
			case UML2Package.PARAMETER__OPERATION:
				setOperation((Operation)null);
				return;
			case UML2Package.PARAMETER__DIRECTION:
				setDirection(DIRECTION_EDEFAULT);
				return;
			case UML2Package.PARAMETER__DEFAULT_VALUE:
				setDefaultValue((ValueSpecification)null);
				return;
			case UML2Package.PARAMETER__IS_EXCEPTION:
				setIsException(IS_EXCEPTION_EDEFAULT);
				return;
			case UML2Package.PARAMETER__IS_STREAM:
				setIsStream(IS_STREAM_EDEFAULT);
				return;
			case UML2Package.PARAMETER__EFFECT:
				setEffect(EFFECT_EDEFAULT);
				return;
			case UML2Package.PARAMETER__PARAMETER_SET:
				getParameterSets().clear();
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
			case UML2Package.PARAMETER__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.PARAMETER__OWNED_ELEMENT:
				return isSetOwnedElements();
			case UML2Package.PARAMETER__OWNER:
				return isSetOwner();
			case UML2Package.PARAMETER__OWNED_COMMENT:
				EList ownedComment = (EList)eVirtualGet(UML2Package.PARAMETER__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.PARAMETER__TEMPLATE_BINDING:
				EList templateBinding = (EList)eVirtualGet(UML2Package.PARAMETER__TEMPLATE_BINDING);
				return templateBinding != null && !templateBinding.isEmpty();
			case UML2Package.PARAMETER__OWNED_TEMPLATE_SIGNATURE:
				return eVirtualGet(UML2Package.PARAMETER__OWNED_TEMPLATE_SIGNATURE) != null;
			case UML2Package.PARAMETER__NAME:
				String name = (String)eVirtualGet(UML2Package.PARAMETER__NAME, NAME_EDEFAULT);
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.PARAMETER__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UML2Package.PARAMETER__VISIBILITY:
				return eVirtualGet(UML2Package.PARAMETER__VISIBILITY, VISIBILITY_EDEFAULT) != VISIBILITY_EDEFAULT;
			case UML2Package.PARAMETER__CLIENT_DEPENDENCY:
				EList clientDependency = (EList)eVirtualGet(UML2Package.PARAMETER__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UML2Package.PARAMETER__NAME_EXPRESSION:
				return eVirtualGet(UML2Package.PARAMETER__NAME_EXPRESSION) != null;
			case UML2Package.PARAMETER__TEMPLATE_PARAMETER:
				return eVirtualGet(UML2Package.PARAMETER__TEMPLATE_PARAMETER) != null;
			case UML2Package.PARAMETER__OWNING_PARAMETER:
				return getOwningParameter() != null;
			case UML2Package.PARAMETER__END:
				EList end = (EList)eVirtualGet(UML2Package.PARAMETER__END);
				return end != null && !end.isEmpty();
			case UML2Package.PARAMETER__TYPE:
				return eVirtualGet(UML2Package.PARAMETER__TYPE) != null;
			case UML2Package.PARAMETER__IS_ORDERED:
				return ((eFlags & IS_ORDERED_EFLAG) != 0) != IS_ORDERED_EDEFAULT;
			case UML2Package.PARAMETER__IS_UNIQUE:
				return ((eFlags & IS_UNIQUE_EFLAG) != 0) != IS_UNIQUE_EDEFAULT;
			case UML2Package.PARAMETER__LOWER:
				return getLower() != LOWER_EDEFAULT;
			case UML2Package.PARAMETER__UPPER:
				return getUpper() != UPPER_EDEFAULT;
			case UML2Package.PARAMETER__UPPER_VALUE:
				return eVirtualGet(UML2Package.PARAMETER__UPPER_VALUE) != null;
			case UML2Package.PARAMETER__LOWER_VALUE:
				return eVirtualGet(UML2Package.PARAMETER__LOWER_VALUE) != null;
			case UML2Package.PARAMETER__OPERATION:
				return getOperation() != null;
			case UML2Package.PARAMETER__DEFAULT:
				return DEFAULT_EDEFAULT == null ? getDefault() != null : !DEFAULT_EDEFAULT.equals(getDefault());
			case UML2Package.PARAMETER__DIRECTION:
				return eVirtualGet(UML2Package.PARAMETER__DIRECTION, DIRECTION_EDEFAULT) != DIRECTION_EDEFAULT;
			case UML2Package.PARAMETER__DEFAULT_VALUE:
				return eVirtualGet(UML2Package.PARAMETER__DEFAULT_VALUE) != null;
			case UML2Package.PARAMETER__IS_EXCEPTION:
				return ((eFlags & IS_EXCEPTION_EFLAG) != 0) != IS_EXCEPTION_EDEFAULT;
			case UML2Package.PARAMETER__IS_STREAM:
				return ((eFlags & IS_STREAM_EFLAG) != 0) != IS_STREAM_EDEFAULT;
			case UML2Package.PARAMETER__EFFECT:
				return eVirtualGet(UML2Package.PARAMETER__EFFECT, EFFECT_EDEFAULT) != EFFECT_EDEFAULT;
			case UML2Package.PARAMETER__PARAMETER_SET:
				EList parameterSet = (EList)eVirtualGet(UML2Package.PARAMETER__PARAMETER_SET);
				return parameterSet != null && !parameterSet.isEmpty();
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == TypedElement.class) {
			switch (derivedFeatureID) {
				case UML2Package.PARAMETER__TYPE: return UML2Package.TYPED_ELEMENT__TYPE;
				default: return -1;
			}
		}
		if (baseClass == MultiplicityElement.class) {
			switch (derivedFeatureID) {
				case UML2Package.PARAMETER__IS_ORDERED: return UML2Package.MULTIPLICITY_ELEMENT__IS_ORDERED;
				case UML2Package.PARAMETER__IS_UNIQUE: return UML2Package.MULTIPLICITY_ELEMENT__IS_UNIQUE;
				case UML2Package.PARAMETER__LOWER: return UML2Package.MULTIPLICITY_ELEMENT__LOWER;
				case UML2Package.PARAMETER__UPPER: return UML2Package.MULTIPLICITY_ELEMENT__UPPER;
				case UML2Package.PARAMETER__UPPER_VALUE: return UML2Package.MULTIPLICITY_ELEMENT__UPPER_VALUE;
				case UML2Package.PARAMETER__LOWER_VALUE: return UML2Package.MULTIPLICITY_ELEMENT__LOWER_VALUE;
				default: return -1;
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
		if (baseClass == TypedElement.class) {
			switch (baseFeatureID) {
				case UML2Package.TYPED_ELEMENT__TYPE: return UML2Package.PARAMETER__TYPE;
				default: return -1;
			}
		}
		if (baseClass == MultiplicityElement.class) {
			switch (baseFeatureID) {
				case UML2Package.MULTIPLICITY_ELEMENT__IS_ORDERED: return UML2Package.PARAMETER__IS_ORDERED;
				case UML2Package.MULTIPLICITY_ELEMENT__IS_UNIQUE: return UML2Package.PARAMETER__IS_UNIQUE;
				case UML2Package.MULTIPLICITY_ELEMENT__LOWER: return UML2Package.PARAMETER__LOWER;
				case UML2Package.MULTIPLICITY_ELEMENT__UPPER: return UML2Package.PARAMETER__UPPER;
				case UML2Package.MULTIPLICITY_ELEMENT__UPPER_VALUE: return UML2Package.PARAMETER__UPPER_VALUE;
				case UML2Package.MULTIPLICITY_ELEMENT__LOWER_VALUE: return UML2Package.PARAMETER__LOWER_VALUE;
				default: return -1;
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
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isOrdered: "); //$NON-NLS-1$
		result.append((eFlags & IS_ORDERED_EFLAG) != 0);
		result.append(", isUnique: "); //$NON-NLS-1$
		result.append((eFlags & IS_UNIQUE_EFLAG) != 0);
		result.append(", direction: "); //$NON-NLS-1$
		result.append(eVirtualGet(UML2Package.PARAMETER__DIRECTION, DIRECTION_EDEFAULT));
		result.append(", isException: "); //$NON-NLS-1$
		result.append((eFlags & IS_EXCEPTION_EFLAG) != 0);
		result.append(", isStream: "); //$NON-NLS-1$
		result.append((eFlags & IS_STREAM_EFLAG) != 0);
		result.append(", effect: "); //$NON-NLS-1$
		result.append(eVirtualGet(UML2Package.PARAMETER__EFFECT, EFFECT_EDEFAULT));
		result.append(')');
		return result.toString();
	}


	// <!-- begin-custom-operations -->

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.Parameter#setBooleanDefault(boolean)
	 */
	public void setBooleanDefault(boolean value) {
		ParameterOperations.setBooleanDefault(this, value);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.Parameter#setIntegerDefault(int)
	 */
	public void setIntegerDefault(int value) {
		ParameterOperations.setIntegerDefault(this, value);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.Parameter#setStringDefault(java.lang.String)
	 */
	public void setStringDefault(String value) {
		ParameterOperations.setStringDefault(this, value);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.Parameter#setUnlimitedNaturalDefault(int)
	 */
	public void setUnlimitedNaturalDefault(int value) {
		ParameterOperations.setUnlimitedNaturalDefault(this, value);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.MultiplicityElement#setLowerBound(int)
	 */
	public void setLowerBound(int value) {
		MultiplicityElementOperations.setLowerBound(this, value);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.MultiplicityElement#setUpperBound(int)
	 */
	public void setUpperBound(int value) {
		MultiplicityElementOperations.setUpperBound(this, value);
	}

	// <!-- end-custom-operations -->

} //ParameterImpl
