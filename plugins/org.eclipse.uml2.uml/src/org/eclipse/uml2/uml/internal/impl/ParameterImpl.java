/*
 * Copyright (c) 2005, 2016 IBM Corporation, Embarcadero Technologies, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (Embarcadero Technologies) - 204200
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

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.MultiplicityElement;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.ParameterDirectionKind;
import org.eclipse.uml2.uml.ParameterEffectKind;
import org.eclipse.uml2.uml.ParameterSet;
import org.eclipse.uml2.uml.ParameterableElement;
import org.eclipse.uml2.uml.Stereotype;
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
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ParameterImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ParameterImpl#isOrdered <em>Is Ordered</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ParameterImpl#isUnique <em>Is Unique</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ParameterImpl#getLower <em>Lower</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ParameterImpl#getLowerValue <em>Lower Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ParameterImpl#getUpper <em>Upper</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ParameterImpl#getUpperValue <em>Upper Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ParameterImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ParameterImpl#getDefault <em>Default</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ParameterImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ParameterImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ParameterImpl#getEffect <em>Effect</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ParameterImpl#isException <em>Is Exception</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ParameterImpl#isStream <em>Is Stream</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ParameterImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ParameterImpl#getParameterSets <em>Parameter Set</em>}</li>
 * </ul>
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
	protected static final int IS_ORDERED_EFLAG = 1 << 12;

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
	protected static final int IS_UNIQUE_EFLAG = 1 << 13;

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
	 * The cached value of the '{@link #getLowerValue() <em>Lower Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerValue()
	 * @generated
	 * @ordered
	 */
	protected ValueSpecification lowerValue;

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
	 * The cached value of the '{@link #getUpperValue() <em>Upper Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperValue()
	 * @generated
	 * @ordered
	 */
	protected ValueSpecification upperValue;

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
	 * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected ValueSpecification defaultValue;

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
	 * The offset of the flags representing the value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int DIRECTION_EFLAG_OFFSET = 14;

	/**
	 * The flags representing the default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int DIRECTION_EFLAG_DEFAULT = DIRECTION_EDEFAULT
		.ordinal() << DIRECTION_EFLAG_OFFSET;

	/**
	 * The array of enumeration values for '{@link ParameterDirectionKind Parameter Direction Kind}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	private static final ParameterDirectionKind[] DIRECTION_EFLAG_VALUES = ParameterDirectionKind
		.values();

	/**
	 * The flags representing the value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected static final int DIRECTION_EFLAG = 0x3 << DIRECTION_EFLAG_OFFSET;

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
	 * The offset of the flags representing the value of the '{@link #getEffect() <em>Effect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int EFFECT_EFLAG_OFFSET = 16;

	/**
	 * The flags representing the default value of the '{@link #getEffect() <em>Effect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int EFFECT_EFLAG_DEFAULT = EFFECT_EDEFAULT
		.ordinal() << EFFECT_EFLAG_OFFSET;

	/**
	 * The array of enumeration values for '{@link ParameterEffectKind Parameter Effect Kind}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	private static final ParameterEffectKind[] EFFECT_EFLAG_VALUES = ParameterEffectKind
		.values();

	/**
	 * The flags representing the value of the '{@link #getEffect() <em>Effect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffect()
	 * @generated
	 * @ordered
	 */
	protected static final int EFFECT_EFLAG = 0x3 << EFFECT_EFLAG_OFFSET;

	/**
	 * The flag representing whether the Effect attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int EFFECT_ESETFLAG = 1 << 18;

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
	protected static final int IS_EXCEPTION_EFLAG = 1 << 19;

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
	protected static final int IS_STREAM_EFLAG = 1 << 20;

	/**
	 * The cached value of the '{@link #getParameterSets() <em>Parameter Set</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterSets()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterSet> parameterSets;

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
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.PARAMETER;
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
						UMLPackage.PARAMETER__OWNED_ELEMENT,
						OWNED_ELEMENT_ESUBSETS));
			}
			return ownedElements;
		}
		return new DerivedUnionEObjectEList<Element>(Element.class, this,
			UMLPackage.PARAMETER__OWNED_ELEMENT, OWNED_ELEMENT_ESUBSETS);
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
		return MultiplicityElementOperations.getUpper(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpper(int newUpper) {
		MultiplicityElementOperations.setUpper(this, newUpper);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLower() {
		return MultiplicityElementOperations.getLower(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLower(int newLower) {
		MultiplicityElementOperations.setLower(this, newLower);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getUpperValue() {
		if (upperValue != null && upperValue.eIsProxy()) {
			InternalEObject oldUpperValue = (InternalEObject) upperValue;
			upperValue = (ValueSpecification) eResolveProxy(oldUpperValue);
			if (upperValue != oldUpperValue) {
				InternalEObject newUpperValue = (InternalEObject) upperValue;
				NotificationChain msgs = oldUpperValue.eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE - UMLPackage.PARAMETER__UPPER_VALUE,
					null, null);
				if (newUpperValue.eInternalContainer() == null) {
					msgs = newUpperValue
						.eInverseAdd(this,
							EOPPOSITE_FEATURE_BASE
								- UMLPackage.PARAMETER__UPPER_VALUE,
							null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.PARAMETER__UPPER_VALUE, oldUpperValue,
						upperValue));
			}
		}
		return upperValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification basicGetUpperValue() {
		return upperValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpperValue(
			ValueSpecification newUpperValue, NotificationChain msgs) {
		ValueSpecification oldUpperValue = upperValue;
		upperValue = newUpperValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET, UMLPackage.PARAMETER__UPPER_VALUE,
				oldUpperValue, newUpperValue);
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
				UMLPackage.PARAMETER__UPPER_VALUE, newUpperValue,
				newUpperValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification createUpperValue(String name, Type type,
			EClass eClass) {
		ValueSpecification newUpperValue = (ValueSpecification) create(eClass);
		setUpperValue(newUpperValue);
		if (name != null)
			newUpperValue.setName(name);
		if (type != null)
			newUpperValue.setType(type);
		return newUpperValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Namespace getNamespace() {
		Namespace namespace = basicGetNamespace();
		return namespace != null && namespace.eIsProxy()
			? (Namespace) eResolveProxy((InternalEObject) namespace)
			: namespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	public ValueSpecification getLowerValue() {
		if (lowerValue != null && lowerValue.eIsProxy()) {
			InternalEObject oldLowerValue = (InternalEObject) lowerValue;
			lowerValue = (ValueSpecification) eResolveProxy(oldLowerValue);
			if (lowerValue != oldLowerValue) {
				InternalEObject newLowerValue = (InternalEObject) lowerValue;
				NotificationChain msgs = oldLowerValue.eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE - UMLPackage.PARAMETER__LOWER_VALUE,
					null, null);
				if (newLowerValue.eInternalContainer() == null) {
					msgs = newLowerValue
						.eInverseAdd(this,
							EOPPOSITE_FEATURE_BASE
								- UMLPackage.PARAMETER__LOWER_VALUE,
							null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.PARAMETER__LOWER_VALUE, oldLowerValue,
						lowerValue));
			}
		}
		return lowerValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification basicGetLowerValue() {
		return lowerValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLowerValue(
			ValueSpecification newLowerValue, NotificationChain msgs) {
		ValueSpecification oldLowerValue = lowerValue;
		lowerValue = newLowerValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET, UMLPackage.PARAMETER__LOWER_VALUE,
				oldLowerValue, newLowerValue);
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
				UMLPackage.PARAMETER__LOWER_VALUE, newLowerValue,
				newLowerValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification createLowerValue(String name, Type type,
			EClass eClass) {
		ValueSpecification newLowerValue = (ValueSpecification) create(eClass);
		setLowerValue(newLowerValue);
		if (name != null)
			newLowerValue.setName(name);
		if (type != null)
			newLowerValue.setType(type);
		return newLowerValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParameterSet> getParameterSets() {
		if (parameterSets == null) {
			parameterSets = new EObjectWithInverseResolvingEList.ManyInverse<ParameterSet>(
				ParameterSet.class, this, UMLPackage.PARAMETER__PARAMETER_SET,
				UMLPackage.PARAMETER_SET__PARAMETER);
		}
		return parameterSets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterSet getParameterSet(String name) {
		return getParameterSet(name, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterSet getParameterSet(String name, boolean ignoreCase) {
		parameterSetLoop : for (ParameterSet parameterSet : getParameterSets()) {
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(parameterSet.getName())
				: name.equals(parameterSet.getName())))
				continue parameterSetLoop;
			return parameterSet;
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
		return operation != null && operation.eIsProxy()
			? (Operation) eResolveProxy((InternalEObject) operation)
			: operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Operation basicGetOperation() {
		InternalEObject eInternalContainer = eInternalContainer();
		return eInternalContainer instanceof Operation
			? (Operation) eInternalContainer
			: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setOperation(Operation newOperation) {
		if (newOperation != eInternalContainer()) {
			if (EcoreUtil.isAncestor(this, newOperation))
				throw new IllegalArgumentException(
					"Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOperation != null)
				msgs = ((InternalEList<Parameter>) newOperation
					.getOwnedParameters()).basicAdd(this, msgs);
			msgs = eBasicSetContainer((InternalEObject) newOperation,
				InternalEObject.EOPPOSITE_FEATURE_BASE
					- UMLPackage.OPERATION__OWNED_PARAMETER,
				msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.PARAMETER__OPERATION, newOperation, newOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterDirectionKind getDirection() {
		return DIRECTION_EFLAG_VALUES[(eFlags
			& DIRECTION_EFLAG) >>> DIRECTION_EFLAG_OFFSET];
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirection(ParameterDirectionKind newDirection) {
		ParameterDirectionKind oldDirection = DIRECTION_EFLAG_VALUES[(eFlags
			& DIRECTION_EFLAG) >>> DIRECTION_EFLAG_OFFSET];
		if (newDirection == null)
			newDirection = DIRECTION_EDEFAULT;
		eFlags = eFlags & ~DIRECTION_EFLAG
			| newDirection.ordinal() << DIRECTION_EFLAG_OFFSET;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.PARAMETER__DIRECTION, oldDirection, newDirection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefault() {
		return ParameterOperations.getDefault(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefault(String newDefault) {
		ParameterOperations.setDefault(this, newDefault);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDefault() {
		ParameterOperations.unsetDefault(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDefault() {
		return ParameterOperations.isSetDefault(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getDefaultValue() {
		if (defaultValue != null && defaultValue.eIsProxy()) {
			InternalEObject oldDefaultValue = (InternalEObject) defaultValue;
			defaultValue = (ValueSpecification) eResolveProxy(oldDefaultValue);
			if (defaultValue != oldDefaultValue) {
				InternalEObject newDefaultValue = (InternalEObject) defaultValue;
				NotificationChain msgs = oldDefaultValue.eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.PARAMETER__DEFAULT_VALUE,
					null, null);
				if (newDefaultValue.eInternalContainer() == null) {
					msgs = newDefaultValue
						.eInverseAdd(this,
							EOPPOSITE_FEATURE_BASE
								- UMLPackage.PARAMETER__DEFAULT_VALUE,
							null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.PARAMETER__DEFAULT_VALUE, oldDefaultValue,
						defaultValue));
			}
		}
		return defaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification basicGetDefaultValue() {
		return defaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultValue(
			ValueSpecification newDefaultValue, NotificationChain msgs) {
		ValueSpecification oldDefaultValue = defaultValue;
		defaultValue = newDefaultValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET, UMLPackage.PARAMETER__DEFAULT_VALUE,
				oldDefaultValue, newDefaultValue);
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
		if (newDefaultValue != defaultValue) {
			NotificationChain msgs = null;
			if (defaultValue != null)
				msgs = ((InternalEObject) defaultValue).eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.PARAMETER__DEFAULT_VALUE,
					null, msgs);
			if (newDefaultValue != null)
				msgs = ((InternalEObject) newDefaultValue).eInverseAdd(this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.PARAMETER__DEFAULT_VALUE,
					null, msgs);
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
	public ValueSpecification createDefaultValue(String name, Type type,
			EClass eClass) {
		ValueSpecification newDefaultValue = (ValueSpecification) create(
			eClass);
		setDefaultValue(newDefaultValue);
		if (name != null)
			newDefaultValue.setName(name);
		if (type != null)
			newDefaultValue.setType(type);
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
		return EFFECT_EFLAG_VALUES[(eFlags
			& EFFECT_EFLAG) >>> EFFECT_EFLAG_OFFSET];
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffect(ParameterEffectKind newEffect) {
		ParameterEffectKind oldEffect = EFFECT_EFLAG_VALUES[(eFlags
			& EFFECT_EFLAG) >>> EFFECT_EFLAG_OFFSET];
		if (newEffect == null)
			newEffect = EFFECT_EDEFAULT;
		eFlags = eFlags & ~EFFECT_EFLAG
			| newEffect.ordinal() << EFFECT_EFLAG_OFFSET;
		boolean oldEffectESet = (eFlags & EFFECT_ESETFLAG) != 0;
		eFlags |= EFFECT_ESETFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.PARAMETER__EFFECT, oldEffect, newEffect,
				!oldEffectESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEffect() {
		ParameterEffectKind oldEffect = EFFECT_EFLAG_VALUES[(eFlags
			& EFFECT_EFLAG) >>> EFFECT_EFLAG_OFFSET];
		boolean oldEffectESet = (eFlags & EFFECT_ESETFLAG) != 0;
		eFlags = eFlags & ~EFFECT_EFLAG | EFFECT_EFLAG_DEFAULT;
		eFlags &= ~EFFECT_ESETFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
				UMLPackage.PARAMETER__EFFECT, oldEffect, EFFECT_EDEFAULT,
				oldEffectESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEffect() {
		return (eFlags & EFFECT_ESETFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLowerGe0(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MultiplicityElementOperations.validateLowerGe0(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUpperGeLower(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MultiplicityElementOperations.validateUpperGeLower(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueSpecificationNoSideEffects(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MultiplicityElementOperations
			.validateValueSpecificationNoSideEffects(this, diagnostics,
				context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueSpecificationConstant(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MultiplicityElementOperations
			.validateValueSpecificationConstant(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLowerIsInteger(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MultiplicityElementOperations.validateLowerIsInteger(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUpperIsUnlimitedNatural(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MultiplicityElementOperations
			.validateUpperIsUnlimitedNatural(this, diagnostics, context);
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
	public boolean compatibleWith(MultiplicityElement other) {
		return MultiplicityElementOperations.compatibleWith(this, other);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean is(int lowerbound, int upperbound) {
		return MultiplicityElementOperations.is(this, lowerbound, upperbound);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectorEnd(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ParameterOperations.validateConnectorEnd(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStreamAndException(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ParameterOperations.validateStreamAndException(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectEffect(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ParameterOperations.validateObjectEffect(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNotException(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ParameterOperations.validateNotException(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReentrantBehaviors(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ParameterOperations.validateReentrantBehaviors(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInAndOut(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ParameterOperations.validateInAndOut(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBooleanDefaultValue(boolean value) {
		ParameterOperations.setBooleanDefaultValue(this, value);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntegerDefaultValue(int value) {
		ParameterOperations.setIntegerDefaultValue(this, value);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStringDefaultValue(String value) {
		ParameterOperations.setStringDefaultValue(this, value);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnlimitedNaturalDefaultValue(int value) {
		ParameterOperations.setUnlimitedNaturalDefaultValue(this, value);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNullDefaultValue() {
		ParameterOperations.setNullDefaultValue(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRealDefaultValue(double value) {
		ParameterOperations.setRealDefaultValue(this, value);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.PARAMETER__EANNOTATIONS :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getEAnnotations())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.PARAMETER__OWNING_TEMPLATE_PARAMETER :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningTemplateParameter(
					(TemplateParameter) otherEnd, msgs);
			case UMLPackage.PARAMETER__TEMPLATE_PARAMETER :
				if (templateParameter != null)
					msgs = ((InternalEObject) templateParameter).eInverseRemove(
						this,
						UMLPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT,
						TemplateParameter.class, msgs);
				return basicSetTemplateParameter((TemplateParameter) otherEnd,
					msgs);
			case UMLPackage.PARAMETER__PARAMETER_SET :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getParameterSets())
					.basicAdd(otherEnd, msgs);
		}
		return eDynamicInverseAdd(otherEnd, featureID, msgs);
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
			case UMLPackage.PARAMETER__EANNOTATIONS :
				return ((InternalEList<?>) getEAnnotations())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.PARAMETER__OWNED_COMMENT :
				return ((InternalEList<?>) getOwnedComments())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.PARAMETER__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.PARAMETER__OWNING_TEMPLATE_PARAMETER :
				return basicSetOwningTemplateParameter(null, msgs);
			case UMLPackage.PARAMETER__TEMPLATE_PARAMETER :
				return basicSetTemplateParameter(null, msgs);
			case UMLPackage.PARAMETER__LOWER_VALUE :
				return basicSetLowerValue(null, msgs);
			case UMLPackage.PARAMETER__UPPER_VALUE :
				return basicSetUpperValue(null, msgs);
			case UMLPackage.PARAMETER__DEFAULT_VALUE :
				return basicSetDefaultValue(null, msgs);
			case UMLPackage.PARAMETER__PARAMETER_SET :
				return ((InternalEList<?>) getParameterSets())
					.basicRemove(otherEnd, msgs);
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
			case UMLPackage.PARAMETER__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.PARAMETER__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.PARAMETER__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.PARAMETER__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.PARAMETER__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.PARAMETER__NAME :
				return getName();
			case UMLPackage.PARAMETER__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.PARAMETER__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.PARAMETER__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.PARAMETER__VISIBILITY :
				return getVisibility();
			case UMLPackage.PARAMETER__TYPE :
				if (resolve)
					return getType();
				return basicGetType();
			case UMLPackage.PARAMETER__OWNING_TEMPLATE_PARAMETER :
				if (resolve)
					return getOwningTemplateParameter();
				return basicGetOwningTemplateParameter();
			case UMLPackage.PARAMETER__TEMPLATE_PARAMETER :
				if (resolve)
					return getTemplateParameter();
				return basicGetTemplateParameter();
			case UMLPackage.PARAMETER__END :
				return getEnds();
			case UMLPackage.PARAMETER__IS_ORDERED :
				return isOrdered();
			case UMLPackage.PARAMETER__IS_UNIQUE :
				return isUnique();
			case UMLPackage.PARAMETER__LOWER :
				return getLower();
			case UMLPackage.PARAMETER__LOWER_VALUE :
				if (resolve)
					return getLowerValue();
				return basicGetLowerValue();
			case UMLPackage.PARAMETER__UPPER :
				return getUpper();
			case UMLPackage.PARAMETER__UPPER_VALUE :
				if (resolve)
					return getUpperValue();
				return basicGetUpperValue();
			case UMLPackage.PARAMETER__DEFAULT :
				return getDefault();
			case UMLPackage.PARAMETER__DEFAULT_VALUE :
				if (resolve)
					return getDefaultValue();
				return basicGetDefaultValue();
			case UMLPackage.PARAMETER__DIRECTION :
				return getDirection();
			case UMLPackage.PARAMETER__EFFECT :
				return getEffect();
			case UMLPackage.PARAMETER__IS_EXCEPTION :
				return isException();
			case UMLPackage.PARAMETER__IS_STREAM :
				return isStream();
			case UMLPackage.PARAMETER__OPERATION :
				if (resolve)
					return getOperation();
				return basicGetOperation();
			case UMLPackage.PARAMETER__PARAMETER_SET :
				return getParameterSets();
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
			case UMLPackage.PARAMETER__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations()
					.addAll((Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.PARAMETER__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments()
					.addAll((Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.PARAMETER__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.PARAMETER__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.PARAMETER__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.PARAMETER__TYPE :
				setType((Type) newValue);
				return;
			case UMLPackage.PARAMETER__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.PARAMETER__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.PARAMETER__IS_ORDERED :
				setIsOrdered((Boolean) newValue);
				return;
			case UMLPackage.PARAMETER__IS_UNIQUE :
				setIsUnique((Boolean) newValue);
				return;
			case UMLPackage.PARAMETER__LOWER :
				setLower((Integer) newValue);
				return;
			case UMLPackage.PARAMETER__LOWER_VALUE :
				setLowerValue((ValueSpecification) newValue);
				return;
			case UMLPackage.PARAMETER__UPPER :
				setUpper((Integer) newValue);
				return;
			case UMLPackage.PARAMETER__UPPER_VALUE :
				setUpperValue((ValueSpecification) newValue);
				return;
			case UMLPackage.PARAMETER__DEFAULT :
				setDefault((String) newValue);
				return;
			case UMLPackage.PARAMETER__DEFAULT_VALUE :
				setDefaultValue((ValueSpecification) newValue);
				return;
			case UMLPackage.PARAMETER__DIRECTION :
				setDirection((ParameterDirectionKind) newValue);
				return;
			case UMLPackage.PARAMETER__EFFECT :
				setEffect((ParameterEffectKind) newValue);
				return;
			case UMLPackage.PARAMETER__IS_EXCEPTION :
				setIsException((Boolean) newValue);
				return;
			case UMLPackage.PARAMETER__IS_STREAM :
				setIsStream((Boolean) newValue);
				return;
			case UMLPackage.PARAMETER__PARAMETER_SET :
				getParameterSets().clear();
				getParameterSets()
					.addAll((Collection<? extends ParameterSet>) newValue);
				return;
		}
		eDynamicSet(featureID, newValue);
	}

	@Override
	public void eDynamicSet(int featureID, Object newValue) {

		if (featureID == UMLPackage.PARAMETER__OPERATION) {
			setOperation((Operation) newValue);
			return;
		}

		super.eDynamicSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case UMLPackage.PARAMETER__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.PARAMETER__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.PARAMETER__NAME :
				unsetName();
				return;
			case UMLPackage.PARAMETER__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.PARAMETER__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.PARAMETER__TYPE :
				setType((Type) null);
				return;
			case UMLPackage.PARAMETER__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.PARAMETER__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.PARAMETER__IS_ORDERED :
				setIsOrdered(IS_ORDERED_EDEFAULT);
				return;
			case UMLPackage.PARAMETER__IS_UNIQUE :
				setIsUnique(IS_UNIQUE_EDEFAULT);
				return;
			case UMLPackage.PARAMETER__LOWER :
				setLower(LOWER_EDEFAULT);
				return;
			case UMLPackage.PARAMETER__LOWER_VALUE :
				setLowerValue((ValueSpecification) null);
				return;
			case UMLPackage.PARAMETER__UPPER :
				setUpper(UPPER_EDEFAULT);
				return;
			case UMLPackage.PARAMETER__UPPER_VALUE :
				setUpperValue((ValueSpecification) null);
				return;
			case UMLPackage.PARAMETER__DEFAULT :
				unsetDefault();
				return;
			case UMLPackage.PARAMETER__DEFAULT_VALUE :
				setDefaultValue((ValueSpecification) null);
				return;
			case UMLPackage.PARAMETER__DIRECTION :
				setDirection(DIRECTION_EDEFAULT);
				return;
			case UMLPackage.PARAMETER__EFFECT :
				unsetEffect();
				return;
			case UMLPackage.PARAMETER__IS_EXCEPTION :
				setIsException(IS_EXCEPTION_EDEFAULT);
				return;
			case UMLPackage.PARAMETER__IS_STREAM :
				setIsStream(IS_STREAM_EDEFAULT);
				return;
			case UMLPackage.PARAMETER__PARAMETER_SET :
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
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UMLPackage.PARAMETER__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.PARAMETER__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.PARAMETER__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.PARAMETER__OWNER :
				return isSetOwner();
			case UMLPackage.PARAMETER__CLIENT_DEPENDENCY :
				return !getClientDependencies().isEmpty();
			case UMLPackage.PARAMETER__NAME :
				return isSetName();
			case UMLPackage.PARAMETER__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.PARAMETER__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.PARAMETER__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.PARAMETER__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.PARAMETER__TYPE :
				return type != null;
			case UMLPackage.PARAMETER__OWNING_TEMPLATE_PARAMETER :
				return basicGetOwningTemplateParameter() != null;
			case UMLPackage.PARAMETER__TEMPLATE_PARAMETER :
				return isSetTemplateParameter();
			case UMLPackage.PARAMETER__END :
				return !getEnds().isEmpty();
			case UMLPackage.PARAMETER__IS_ORDERED :
				return ((eFlags
					& IS_ORDERED_EFLAG) != 0) != IS_ORDERED_EDEFAULT;
			case UMLPackage.PARAMETER__IS_UNIQUE :
				return ((eFlags & IS_UNIQUE_EFLAG) != 0) != IS_UNIQUE_EDEFAULT;
			case UMLPackage.PARAMETER__LOWER :
				return getLower() != LOWER_EDEFAULT;
			case UMLPackage.PARAMETER__LOWER_VALUE :
				return lowerValue != null;
			case UMLPackage.PARAMETER__UPPER :
				return getUpper() != UPPER_EDEFAULT;
			case UMLPackage.PARAMETER__UPPER_VALUE :
				return upperValue != null;
			case UMLPackage.PARAMETER__DEFAULT :
				return isSetDefault();
			case UMLPackage.PARAMETER__DEFAULT_VALUE :
				return defaultValue != null;
			case UMLPackage.PARAMETER__DIRECTION :
				return (eFlags & DIRECTION_EFLAG) != DIRECTION_EFLAG_DEFAULT;
			case UMLPackage.PARAMETER__EFFECT :
				return isSetEffect();
			case UMLPackage.PARAMETER__IS_EXCEPTION :
				return ((eFlags
					& IS_EXCEPTION_EFLAG) != 0) != IS_EXCEPTION_EDEFAULT;
			case UMLPackage.PARAMETER__IS_STREAM :
				return ((eFlags & IS_STREAM_EFLAG) != 0) != IS_STREAM_EDEFAULT;
			case UMLPackage.PARAMETER__OPERATION :
				return basicGetOperation() != null;
			case UMLPackage.PARAMETER__PARAMETER_SET :
				return parameterSets != null && !parameterSets.isEmpty();
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID,
			Class<?> baseClass) {
		if (baseClass == MultiplicityElement.class) {
			switch (derivedFeatureID) {
				case UMLPackage.PARAMETER__IS_ORDERED :
					return UMLPackage.MULTIPLICITY_ELEMENT__IS_ORDERED;
				case UMLPackage.PARAMETER__IS_UNIQUE :
					return UMLPackage.MULTIPLICITY_ELEMENT__IS_UNIQUE;
				case UMLPackage.PARAMETER__LOWER :
					return UMLPackage.MULTIPLICITY_ELEMENT__LOWER;
				case UMLPackage.PARAMETER__LOWER_VALUE :
					return UMLPackage.MULTIPLICITY_ELEMENT__LOWER_VALUE;
				case UMLPackage.PARAMETER__UPPER :
					return UMLPackage.MULTIPLICITY_ELEMENT__UPPER;
				case UMLPackage.PARAMETER__UPPER_VALUE :
					return UMLPackage.MULTIPLICITY_ELEMENT__UPPER_VALUE;
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
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID,
			Class<?> baseClass) {
		if (baseClass == MultiplicityElement.class) {
			switch (baseFeatureID) {
				case UMLPackage.MULTIPLICITY_ELEMENT__IS_ORDERED :
					return UMLPackage.PARAMETER__IS_ORDERED;
				case UMLPackage.MULTIPLICITY_ELEMENT__IS_UNIQUE :
					return UMLPackage.PARAMETER__IS_UNIQUE;
				case UMLPackage.MULTIPLICITY_ELEMENT__LOWER :
					return UMLPackage.PARAMETER__LOWER;
				case UMLPackage.MULTIPLICITY_ELEMENT__LOWER_VALUE :
					return UMLPackage.PARAMETER__LOWER_VALUE;
				case UMLPackage.MULTIPLICITY_ELEMENT__UPPER :
					return UMLPackage.PARAMETER__UPPER;
				case UMLPackage.MULTIPLICITY_ELEMENT__UPPER_VALUE :
					return UMLPackage.PARAMETER__UPPER_VALUE;
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
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == MultiplicityElement.class) {
			switch (baseOperationID) {
				case UMLPackage.MULTIPLICITY_ELEMENT___VALIDATE_UPPER_GE_LOWER__DIAGNOSTICCHAIN_MAP :
					return UMLPackage.PARAMETER___VALIDATE_UPPER_GE_LOWER__DIAGNOSTICCHAIN_MAP;
				case UMLPackage.MULTIPLICITY_ELEMENT___VALIDATE_LOWER_GE0__DIAGNOSTICCHAIN_MAP :
					return UMLPackage.PARAMETER___VALIDATE_LOWER_GE0__DIAGNOSTICCHAIN_MAP;
				case UMLPackage.MULTIPLICITY_ELEMENT___VALIDATE_VALUE_SPECIFICATION_NO_SIDE_EFFECTS__DIAGNOSTICCHAIN_MAP :
					return UMLPackage.PARAMETER___VALIDATE_VALUE_SPECIFICATION_NO_SIDE_EFFECTS__DIAGNOSTICCHAIN_MAP;
				case UMLPackage.MULTIPLICITY_ELEMENT___VALIDATE_VALUE_SPECIFICATION_CONSTANT__DIAGNOSTICCHAIN_MAP :
					return UMLPackage.PARAMETER___VALIDATE_VALUE_SPECIFICATION_CONSTANT__DIAGNOSTICCHAIN_MAP;
				case UMLPackage.MULTIPLICITY_ELEMENT___VALIDATE_LOWER_IS_INTEGER__DIAGNOSTICCHAIN_MAP :
					return UMLPackage.PARAMETER___VALIDATE_LOWER_IS_INTEGER__DIAGNOSTICCHAIN_MAP;
				case UMLPackage.MULTIPLICITY_ELEMENT___VALIDATE_UPPER_IS_UNLIMITED_NATURAL__DIAGNOSTICCHAIN_MAP :
					return UMLPackage.PARAMETER___VALIDATE_UPPER_IS_UNLIMITED_NATURAL__DIAGNOSTICCHAIN_MAP;
				case UMLPackage.MULTIPLICITY_ELEMENT___SET_LOWER__INT :
					return UMLPackage.PARAMETER___SET_LOWER__INT;
				case UMLPackage.MULTIPLICITY_ELEMENT___SET_UPPER__INT :
					return UMLPackage.PARAMETER___SET_UPPER__INT;
				case UMLPackage.MULTIPLICITY_ELEMENT___COMPATIBLE_WITH__MULTIPLICITYELEMENT :
					return UMLPackage.PARAMETER___COMPATIBLE_WITH__MULTIPLICITYELEMENT;
				case UMLPackage.MULTIPLICITY_ELEMENT___INCLUDES_MULTIPLICITY__MULTIPLICITYELEMENT :
					return UMLPackage.PARAMETER___INCLUDES_MULTIPLICITY__MULTIPLICITYELEMENT;
				case UMLPackage.MULTIPLICITY_ELEMENT___IS__INT_INT :
					return UMLPackage.PARAMETER___IS__INT_INT;
				case UMLPackage.MULTIPLICITY_ELEMENT___IS_MULTIVALUED :
					return UMLPackage.PARAMETER___IS_MULTIVALUED;
				case UMLPackage.MULTIPLICITY_ELEMENT___GET_LOWER :
					return UMLPackage.PARAMETER___GET_LOWER;
				case UMLPackage.MULTIPLICITY_ELEMENT___LOWER_BOUND :
					return UMLPackage.PARAMETER___LOWER_BOUND;
				case UMLPackage.MULTIPLICITY_ELEMENT___GET_UPPER :
					return UMLPackage.PARAMETER___GET_UPPER;
				case UMLPackage.MULTIPLICITY_ELEMENT___UPPER_BOUND :
					return UMLPackage.PARAMETER___UPPER_BOUND;
				default :
					return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
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
			case UMLPackage.PARAMETER___GET_EANNOTATION__STRING :
				return getEAnnotation((String) arguments.get(0));
			case UMLPackage.PARAMETER___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP :
				return validateHasOwner((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PARAMETER___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP :
				return validateNotOwnSelf((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PARAMETER___ADD_KEYWORD__STRING :
				return addKeyword((String) arguments.get(0));
			case UMLPackage.PARAMETER___APPLY_STEREOTYPE__STEREOTYPE :
				return applyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.PARAMETER___CREATE_EANNOTATION__STRING :
				return createEAnnotation((String) arguments.get(0));
			case UMLPackage.PARAMETER___DESTROY :
				destroy();
				return null;
			case UMLPackage.PARAMETER___GET_KEYWORDS :
				return getKeywords();
			case UMLPackage.PARAMETER___GET_APPLICABLE_STEREOTYPE__STRING :
				return getApplicableStereotype((String) arguments.get(0));
			case UMLPackage.PARAMETER___GET_APPLICABLE_STEREOTYPES :
				return getApplicableStereotypes();
			case UMLPackage.PARAMETER___GET_APPLIED_STEREOTYPE__STRING :
				return getAppliedStereotype((String) arguments.get(0));
			case UMLPackage.PARAMETER___GET_APPLIED_STEREOTYPES :
				return getAppliedStereotypes();
			case UMLPackage.PARAMETER___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING :
				return getAppliedSubstereotype((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.PARAMETER___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE :
				return getAppliedSubstereotypes((Stereotype) arguments.get(0));
			case UMLPackage.PARAMETER___GET_MODEL :
				return getModel();
			case UMLPackage.PARAMETER___GET_NEAREST_PACKAGE :
				return getNearestPackage();
			case UMLPackage.PARAMETER___GET_RELATIONSHIPS :
				return getRelationships();
			case UMLPackage.PARAMETER___GET_RELATIONSHIPS__ECLASS :
				return getRelationships((EClass) arguments.get(0));
			case UMLPackage.PARAMETER___GET_REQUIRED_STEREOTYPE__STRING :
				return getRequiredStereotype((String) arguments.get(0));
			case UMLPackage.PARAMETER___GET_REQUIRED_STEREOTYPES :
				return getRequiredStereotypes();
			case UMLPackage.PARAMETER___GET_SOURCE_DIRECTED_RELATIONSHIPS :
				return getSourceDirectedRelationships();
			case UMLPackage.PARAMETER___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS :
				return getSourceDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.PARAMETER___GET_STEREOTYPE_APPLICATION__STEREOTYPE :
				return getStereotypeApplication((Stereotype) arguments.get(0));
			case UMLPackage.PARAMETER___GET_STEREOTYPE_APPLICATIONS :
				return getStereotypeApplications();
			case UMLPackage.PARAMETER___GET_TARGET_DIRECTED_RELATIONSHIPS :
				return getTargetDirectedRelationships();
			case UMLPackage.PARAMETER___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS :
				return getTargetDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.PARAMETER___GET_VALUE__STEREOTYPE_STRING :
				return getValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.PARAMETER___HAS_KEYWORD__STRING :
				return hasKeyword((String) arguments.get(0));
			case UMLPackage.PARAMETER___HAS_VALUE__STEREOTYPE_STRING :
				return hasValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.PARAMETER___IS_STEREOTYPE_APPLICABLE__STEREOTYPE :
				return isStereotypeApplicable((Stereotype) arguments.get(0));
			case UMLPackage.PARAMETER___IS_STEREOTYPE_APPLIED__STEREOTYPE :
				return isStereotypeApplied((Stereotype) arguments.get(0));
			case UMLPackage.PARAMETER___IS_STEREOTYPE_REQUIRED__STEREOTYPE :
				return isStereotypeRequired((Stereotype) arguments.get(0));
			case UMLPackage.PARAMETER___REMOVE_KEYWORD__STRING :
				return removeKeyword((String) arguments.get(0));
			case UMLPackage.PARAMETER___SET_VALUE__STEREOTYPE_STRING_OBJECT :
				setValue((Stereotype) arguments.get(0),
					(String) arguments.get(1), arguments.get(2));
				return null;
			case UMLPackage.PARAMETER___UNAPPLY_STEREOTYPE__STEREOTYPE :
				return unapplyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.PARAMETER___ALL_OWNED_ELEMENTS :
				return allOwnedElements();
			case UMLPackage.PARAMETER___MUST_BE_OWNED :
				return mustBeOwned();
			case UMLPackage.PARAMETER___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP :
				return validateVisibilityNeedsOwnership(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PARAMETER___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PARAMETER___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasNoQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PARAMETER___CREATE_DEPENDENCY__NAMEDELEMENT :
				return createDependency((NamedElement) arguments.get(0));
			case UMLPackage.PARAMETER___CREATE_USAGE__NAMEDELEMENT :
				return createUsage((NamedElement) arguments.get(0));
			case UMLPackage.PARAMETER___GET_LABEL :
				return getLabel();
			case UMLPackage.PARAMETER___GET_LABEL__BOOLEAN :
				return getLabel((Boolean) arguments.get(0));
			case UMLPackage.PARAMETER___GET_NAMESPACE :
				return getNamespace();
			case UMLPackage.PARAMETER___ALL_NAMESPACES :
				return allNamespaces();
			case UMLPackage.PARAMETER___ALL_OWNING_PACKAGES :
				return allOwningPackages();
			case UMLPackage.PARAMETER___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE :
				return isDistinguishableFrom((NamedElement) arguments.get(0),
					(Namespace) arguments.get(1));
			case UMLPackage.PARAMETER___GET_QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.PARAMETER___SEPARATOR :
				return separator();
			case UMLPackage.PARAMETER___GET_CLIENT_DEPENDENCIES :
				return getClientDependencies();
			case UMLPackage.PARAMETER___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT :
				return isCompatibleWith(
					(ParameterableElement) arguments.get(0));
			case UMLPackage.PARAMETER___IS_TEMPLATE_PARAMETER :
				return isTemplateParameter();
			case UMLPackage.PARAMETER___GET_ENDS :
				return getEnds();
			case UMLPackage.PARAMETER___VALIDATE_UPPER_GE_LOWER__DIAGNOSTICCHAIN_MAP :
				return validateUpperGeLower((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PARAMETER___VALIDATE_LOWER_GE0__DIAGNOSTICCHAIN_MAP :
				return validateLowerGe0((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PARAMETER___VALIDATE_VALUE_SPECIFICATION_NO_SIDE_EFFECTS__DIAGNOSTICCHAIN_MAP :
				return validateValueSpecificationNoSideEffects(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PARAMETER___VALIDATE_VALUE_SPECIFICATION_CONSTANT__DIAGNOSTICCHAIN_MAP :
				return validateValueSpecificationConstant(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PARAMETER___VALIDATE_LOWER_IS_INTEGER__DIAGNOSTICCHAIN_MAP :
				return validateLowerIsInteger(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PARAMETER___VALIDATE_UPPER_IS_UNLIMITED_NATURAL__DIAGNOSTICCHAIN_MAP :
				return validateUpperIsUnlimitedNatural(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PARAMETER___SET_LOWER__INT :
				setLower((Integer) arguments.get(0));
				return null;
			case UMLPackage.PARAMETER___SET_UPPER__INT :
				setUpper((Integer) arguments.get(0));
				return null;
			case UMLPackage.PARAMETER___COMPATIBLE_WITH__MULTIPLICITYELEMENT :
				return compatibleWith((MultiplicityElement) arguments.get(0));
			case UMLPackage.PARAMETER___INCLUDES_MULTIPLICITY__MULTIPLICITYELEMENT :
				return includesMultiplicity(
					(MultiplicityElement) arguments.get(0));
			case UMLPackage.PARAMETER___IS__INT_INT :
				return is((Integer) arguments.get(0),
					(Integer) arguments.get(1));
			case UMLPackage.PARAMETER___IS_MULTIVALUED :
				return isMultivalued();
			case UMLPackage.PARAMETER___GET_LOWER :
				return getLower();
			case UMLPackage.PARAMETER___LOWER_BOUND :
				return lowerBound();
			case UMLPackage.PARAMETER___GET_UPPER :
				return getUpper();
			case UMLPackage.PARAMETER___UPPER_BOUND :
				return upperBound();
			case UMLPackage.PARAMETER___VALIDATE_IN_AND_OUT__DIAGNOSTICCHAIN_MAP :
				return validateInAndOut((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PARAMETER___VALIDATE_NOT_EXCEPTION__DIAGNOSTICCHAIN_MAP :
				return validateNotException((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PARAMETER___VALIDATE_CONNECTOR_END__DIAGNOSTICCHAIN_MAP :
				return validateConnectorEnd((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PARAMETER___VALIDATE_REENTRANT_BEHAVIORS__DIAGNOSTICCHAIN_MAP :
				return validateReentrantBehaviors(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PARAMETER___VALIDATE_STREAM_AND_EXCEPTION__DIAGNOSTICCHAIN_MAP :
				return validateStreamAndException(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PARAMETER___VALIDATE_OBJECT_EFFECT__DIAGNOSTICCHAIN_MAP :
				return validateObjectEffect((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.PARAMETER___IS_SET_DEFAULT :
				return isSetDefault();
			case UMLPackage.PARAMETER___SET_BOOLEAN_DEFAULT_VALUE__BOOLEAN :
				setBooleanDefaultValue((Boolean) arguments.get(0));
				return null;
			case UMLPackage.PARAMETER___SET_DEFAULT__STRING :
				setDefault((String) arguments.get(0));
				return null;
			case UMLPackage.PARAMETER___SET_INTEGER_DEFAULT_VALUE__INT :
				setIntegerDefaultValue((Integer) arguments.get(0));
				return null;
			case UMLPackage.PARAMETER___SET_NULL_DEFAULT_VALUE :
				setNullDefaultValue();
				return null;
			case UMLPackage.PARAMETER___SET_REAL_DEFAULT_VALUE__DOUBLE :
				setRealDefaultValue((Double) arguments.get(0));
				return null;
			case UMLPackage.PARAMETER___SET_STRING_DEFAULT_VALUE__STRING :
				setStringDefaultValue((String) arguments.get(0));
				return null;
			case UMLPackage.PARAMETER___SET_UNLIMITED_NATURAL_DEFAULT_VALUE__INT :
				setUnlimitedNaturalDefaultValue((Integer) arguments.get(0));
				return null;
			case UMLPackage.PARAMETER___UNSET_DEFAULT :
				unsetDefault();
				return null;
			case UMLPackage.PARAMETER___GET_DEFAULT :
				return getDefault();
		}
		return eDynamicInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isOrdered: "); //$NON-NLS-1$
		result.append((eFlags & IS_ORDERED_EFLAG) != 0);
		result.append(", isUnique: "); //$NON-NLS-1$
		result.append((eFlags & IS_UNIQUE_EFLAG) != 0);
		result.append(", direction: "); //$NON-NLS-1$
		result.append(DIRECTION_EFLAG_VALUES[(eFlags
			& DIRECTION_EFLAG) >>> DIRECTION_EFLAG_OFFSET]);
		result.append(", effect: "); //$NON-NLS-1$
		if ((eFlags & EFFECT_ESETFLAG) != 0)
			result.append(EFFECT_EFLAG_VALUES[(eFlags
				& EFFECT_EFLAG) >>> EFFECT_EFLAG_OFFSET]);
		else
			result.append("<unset>"); //$NON-NLS-1$
		result.append(", isException: "); //$NON-NLS-1$
		result.append((eFlags & IS_EXCEPTION_EFLAG) != 0);
		result.append(", isStream: "); //$NON-NLS-1$
		result.append((eFlags & IS_STREAM_EFLAG) != 0);
		result.append(')');
		return result.toString();
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
		UMLPackage.PARAMETER__OWNED_COMMENT,
		UMLPackage.PARAMETER__NAME_EXPRESSION,
		UMLPackage.PARAMETER__LOWER_VALUE, UMLPackage.PARAMETER__UPPER_VALUE,
		UMLPackage.PARAMETER__DEFAULT_VALUE};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| eIsSet(UMLPackage.PARAMETER__LOWER_VALUE)
			|| eIsSet(UMLPackage.PARAMETER__UPPER_VALUE)
			|| eIsSet(UMLPackage.PARAMETER__DEFAULT_VALUE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetNamespace() {
		return super.isSetNamespace()
			|| eIsSet(UMLPackage.PARAMETER__OPERATION);
	}

} //ParameterImpl
