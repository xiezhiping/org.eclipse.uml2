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

import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.MultiplicityElement;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.RedefinableElement;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.StructuralFeature;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.TypedElement;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.ValueSpecification;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.MultiplicityElementOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Structural Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StructuralFeatureImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StructuralFeatureImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StructuralFeatureImpl#isOrdered <em>Is Ordered</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StructuralFeatureImpl#isUnique <em>Is Unique</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StructuralFeatureImpl#getLower <em>Lower</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StructuralFeatureImpl#getLowerValue <em>Lower Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StructuralFeatureImpl#getUpper <em>Upper</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StructuralFeatureImpl#getUpperValue <em>Upper Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StructuralFeatureImpl#isReadOnly <em>Is Read Only</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class StructuralFeatureImpl
		extends FeatureImpl
		implements StructuralFeature {

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Type type;

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
	protected static final int IS_ORDERED_EFLAG = 1 << 14;

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
	protected static final int IS_UNIQUE_EFLAG = 1 << 15;

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
	 * The default value of the '{@link #isReadOnly() <em>Is Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReadOnly()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_READ_ONLY_EDEFAULT = false;

	/**
	 * The flag representing the value of the '{@link #isReadOnly() <em>Is Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReadOnly()
	 * @generated
	 * @ordered
	 */
	protected static final int IS_READ_ONLY_EFLAG = 1 << 16;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructuralFeatureImpl() {
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
		return UMLPackage.Literals.STRUCTURAL_FEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject) type;
			type = (Type) eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.STRUCTURAL_FEATURE__TYPE, oldType, type));
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
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Type newType) {
		Type oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.STRUCTURAL_FEATURE__TYPE, oldType, type));
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
						UMLPackage.STRUCTURAL_FEATURE__OWNED_ELEMENT,
						OWNED_ELEMENT_ESUBSETS));
			}
			return ownedElements;
		}
		return new DerivedUnionEObjectEList<Element>(Element.class, this,
			UMLPackage.STRUCTURAL_FEATURE__OWNED_ELEMENT,
			OWNED_ELEMENT_ESUBSETS);
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
				UMLPackage.STRUCTURAL_FEATURE__IS_ORDERED, oldIsOrdered,
				newIsOrdered));
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
				UMLPackage.STRUCTURAL_FEATURE__IS_UNIQUE, oldIsUnique,
				newIsUnique));
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
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.STRUCTURAL_FEATURE__UPPER_VALUE,
					null, null);
				if (newUpperValue.eInternalContainer() == null) {
					msgs = newUpperValue.eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
							- UMLPackage.STRUCTURAL_FEATURE__UPPER_VALUE,
						null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.STRUCTURAL_FEATURE__UPPER_VALUE,
						oldUpperValue, upperValue));
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
				Notification.SET, UMLPackage.STRUCTURAL_FEATURE__UPPER_VALUE,
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
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.STRUCTURAL_FEATURE__UPPER_VALUE,
					null, msgs);
			if (newUpperValue != null)
				msgs = ((InternalEObject) newUpperValue).eInverseAdd(this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.STRUCTURAL_FEATURE__UPPER_VALUE,
					null, msgs);
			msgs = basicSetUpperValue(newUpperValue, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.STRUCTURAL_FEATURE__UPPER_VALUE, newUpperValue,
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
	public ValueSpecification getLowerValue() {
		if (lowerValue != null && lowerValue.eIsProxy()) {
			InternalEObject oldLowerValue = (InternalEObject) lowerValue;
			lowerValue = (ValueSpecification) eResolveProxy(oldLowerValue);
			if (lowerValue != oldLowerValue) {
				InternalEObject newLowerValue = (InternalEObject) lowerValue;
				NotificationChain msgs = oldLowerValue.eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.STRUCTURAL_FEATURE__LOWER_VALUE,
					null, null);
				if (newLowerValue.eInternalContainer() == null) {
					msgs = newLowerValue.eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
							- UMLPackage.STRUCTURAL_FEATURE__LOWER_VALUE,
						null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.STRUCTURAL_FEATURE__LOWER_VALUE,
						oldLowerValue, lowerValue));
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
				Notification.SET, UMLPackage.STRUCTURAL_FEATURE__LOWER_VALUE,
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
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.STRUCTURAL_FEATURE__LOWER_VALUE,
					null, msgs);
			if (newLowerValue != null)
				msgs = ((InternalEObject) newLowerValue).eInverseAdd(this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.STRUCTURAL_FEATURE__LOWER_VALUE,
					null, msgs);
			msgs = basicSetLowerValue(newLowerValue, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.STRUCTURAL_FEATURE__LOWER_VALUE, newLowerValue,
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
	public boolean isReadOnly() {
		return (eFlags & IS_READ_ONLY_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsReadOnly(boolean newIsReadOnly) {
		boolean oldIsReadOnly = (eFlags & IS_READ_ONLY_EFLAG) != 0;
		if (newIsReadOnly)
			eFlags |= IS_READ_ONLY_EFLAG;
		else
			eFlags &= ~IS_READ_ONLY_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.STRUCTURAL_FEATURE__IS_READ_ONLY, oldIsReadOnly,
				newIsReadOnly));
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
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.STRUCTURAL_FEATURE__EANNOTATIONS :
				return ((InternalEList<?>) getEAnnotations())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.STRUCTURAL_FEATURE__OWNED_COMMENT :
				return ((InternalEList<?>) getOwnedComments())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.STRUCTURAL_FEATURE__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.STRUCTURAL_FEATURE__LOWER_VALUE :
				return basicSetLowerValue(null, msgs);
			case UMLPackage.STRUCTURAL_FEATURE__UPPER_VALUE :
				return basicSetUpperValue(null, msgs);
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
			case UMLPackage.STRUCTURAL_FEATURE__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.STRUCTURAL_FEATURE__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.STRUCTURAL_FEATURE__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.STRUCTURAL_FEATURE__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.STRUCTURAL_FEATURE__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.STRUCTURAL_FEATURE__NAME :
				return getName();
			case UMLPackage.STRUCTURAL_FEATURE__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.STRUCTURAL_FEATURE__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.STRUCTURAL_FEATURE__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.STRUCTURAL_FEATURE__VISIBILITY :
				return getVisibility();
			case UMLPackage.STRUCTURAL_FEATURE__IS_LEAF :
				return isLeaf();
			case UMLPackage.STRUCTURAL_FEATURE__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.STRUCTURAL_FEATURE__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.STRUCTURAL_FEATURE__FEATURING_CLASSIFIER :
				return getFeaturingClassifiers();
			case UMLPackage.STRUCTURAL_FEATURE__IS_STATIC :
				return isStatic();
			case UMLPackage.STRUCTURAL_FEATURE__TYPE :
				if (resolve)
					return getType();
				return basicGetType();
			case UMLPackage.STRUCTURAL_FEATURE__IS_ORDERED :
				return isOrdered();
			case UMLPackage.STRUCTURAL_FEATURE__IS_UNIQUE :
				return isUnique();
			case UMLPackage.STRUCTURAL_FEATURE__LOWER :
				return getLower();
			case UMLPackage.STRUCTURAL_FEATURE__LOWER_VALUE :
				if (resolve)
					return getLowerValue();
				return basicGetLowerValue();
			case UMLPackage.STRUCTURAL_FEATURE__UPPER :
				return getUpper();
			case UMLPackage.STRUCTURAL_FEATURE__UPPER_VALUE :
				if (resolve)
					return getUpperValue();
				return basicGetUpperValue();
			case UMLPackage.STRUCTURAL_FEATURE__IS_READ_ONLY :
				return isReadOnly();
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
			case UMLPackage.STRUCTURAL_FEATURE__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations()
					.addAll((Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.STRUCTURAL_FEATURE__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments()
					.addAll((Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.STRUCTURAL_FEATURE__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.STRUCTURAL_FEATURE__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.STRUCTURAL_FEATURE__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.STRUCTURAL_FEATURE__IS_LEAF :
				setIsLeaf((Boolean) newValue);
				return;
			case UMLPackage.STRUCTURAL_FEATURE__IS_STATIC :
				setIsStatic((Boolean) newValue);
				return;
			case UMLPackage.STRUCTURAL_FEATURE__TYPE :
				setType((Type) newValue);
				return;
			case UMLPackage.STRUCTURAL_FEATURE__IS_ORDERED :
				setIsOrdered((Boolean) newValue);
				return;
			case UMLPackage.STRUCTURAL_FEATURE__IS_UNIQUE :
				setIsUnique((Boolean) newValue);
				return;
			case UMLPackage.STRUCTURAL_FEATURE__LOWER :
				setLower((Integer) newValue);
				return;
			case UMLPackage.STRUCTURAL_FEATURE__LOWER_VALUE :
				setLowerValue((ValueSpecification) newValue);
				return;
			case UMLPackage.STRUCTURAL_FEATURE__UPPER :
				setUpper((Integer) newValue);
				return;
			case UMLPackage.STRUCTURAL_FEATURE__UPPER_VALUE :
				setUpperValue((ValueSpecification) newValue);
				return;
			case UMLPackage.STRUCTURAL_FEATURE__IS_READ_ONLY :
				setIsReadOnly((Boolean) newValue);
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
			case UMLPackage.STRUCTURAL_FEATURE__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.STRUCTURAL_FEATURE__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.STRUCTURAL_FEATURE__NAME :
				unsetName();
				return;
			case UMLPackage.STRUCTURAL_FEATURE__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.STRUCTURAL_FEATURE__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.STRUCTURAL_FEATURE__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.STRUCTURAL_FEATURE__IS_STATIC :
				setIsStatic(IS_STATIC_EDEFAULT);
				return;
			case UMLPackage.STRUCTURAL_FEATURE__TYPE :
				setType((Type) null);
				return;
			case UMLPackage.STRUCTURAL_FEATURE__IS_ORDERED :
				setIsOrdered(IS_ORDERED_EDEFAULT);
				return;
			case UMLPackage.STRUCTURAL_FEATURE__IS_UNIQUE :
				setIsUnique(IS_UNIQUE_EDEFAULT);
				return;
			case UMLPackage.STRUCTURAL_FEATURE__LOWER :
				setLower(LOWER_EDEFAULT);
				return;
			case UMLPackage.STRUCTURAL_FEATURE__LOWER_VALUE :
				setLowerValue((ValueSpecification) null);
				return;
			case UMLPackage.STRUCTURAL_FEATURE__UPPER :
				setUpper(UPPER_EDEFAULT);
				return;
			case UMLPackage.STRUCTURAL_FEATURE__UPPER_VALUE :
				setUpperValue((ValueSpecification) null);
				return;
			case UMLPackage.STRUCTURAL_FEATURE__IS_READ_ONLY :
				setIsReadOnly(IS_READ_ONLY_EDEFAULT);
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
			case UMLPackage.STRUCTURAL_FEATURE__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.STRUCTURAL_FEATURE__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.STRUCTURAL_FEATURE__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.STRUCTURAL_FEATURE__OWNER :
				return isSetOwner();
			case UMLPackage.STRUCTURAL_FEATURE__CLIENT_DEPENDENCY :
				return !getClientDependencies().isEmpty();
			case UMLPackage.STRUCTURAL_FEATURE__NAME :
				return isSetName();
			case UMLPackage.STRUCTURAL_FEATURE__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.STRUCTURAL_FEATURE__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.STRUCTURAL_FEATURE__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.STRUCTURAL_FEATURE__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.STRUCTURAL_FEATURE__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.STRUCTURAL_FEATURE__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.STRUCTURAL_FEATURE__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.STRUCTURAL_FEATURE__FEATURING_CLASSIFIER :
				return isSetFeaturingClassifiers();
			case UMLPackage.STRUCTURAL_FEATURE__IS_STATIC :
				return ((eFlags & IS_STATIC_EFLAG) != 0) != IS_STATIC_EDEFAULT;
			case UMLPackage.STRUCTURAL_FEATURE__TYPE :
				return type != null;
			case UMLPackage.STRUCTURAL_FEATURE__IS_ORDERED :
				return ((eFlags
					& IS_ORDERED_EFLAG) != 0) != IS_ORDERED_EDEFAULT;
			case UMLPackage.STRUCTURAL_FEATURE__IS_UNIQUE :
				return ((eFlags & IS_UNIQUE_EFLAG) != 0) != IS_UNIQUE_EDEFAULT;
			case UMLPackage.STRUCTURAL_FEATURE__LOWER :
				return getLower() != LOWER_EDEFAULT;
			case UMLPackage.STRUCTURAL_FEATURE__LOWER_VALUE :
				return lowerValue != null;
			case UMLPackage.STRUCTURAL_FEATURE__UPPER :
				return getUpper() != UPPER_EDEFAULT;
			case UMLPackage.STRUCTURAL_FEATURE__UPPER_VALUE :
				return upperValue != null;
			case UMLPackage.STRUCTURAL_FEATURE__IS_READ_ONLY :
				return ((eFlags
					& IS_READ_ONLY_EFLAG) != 0) != IS_READ_ONLY_EDEFAULT;
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
		if (baseClass == TypedElement.class) {
			switch (derivedFeatureID) {
				case UMLPackage.STRUCTURAL_FEATURE__TYPE :
					return UMLPackage.TYPED_ELEMENT__TYPE;
				default :
					return -1;
			}
		}
		if (baseClass == MultiplicityElement.class) {
			switch (derivedFeatureID) {
				case UMLPackage.STRUCTURAL_FEATURE__IS_ORDERED :
					return UMLPackage.MULTIPLICITY_ELEMENT__IS_ORDERED;
				case UMLPackage.STRUCTURAL_FEATURE__IS_UNIQUE :
					return UMLPackage.MULTIPLICITY_ELEMENT__IS_UNIQUE;
				case UMLPackage.STRUCTURAL_FEATURE__LOWER :
					return UMLPackage.MULTIPLICITY_ELEMENT__LOWER;
				case UMLPackage.STRUCTURAL_FEATURE__LOWER_VALUE :
					return UMLPackage.MULTIPLICITY_ELEMENT__LOWER_VALUE;
				case UMLPackage.STRUCTURAL_FEATURE__UPPER :
					return UMLPackage.MULTIPLICITY_ELEMENT__UPPER;
				case UMLPackage.STRUCTURAL_FEATURE__UPPER_VALUE :
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
		if (baseClass == TypedElement.class) {
			switch (baseFeatureID) {
				case UMLPackage.TYPED_ELEMENT__TYPE :
					return UMLPackage.STRUCTURAL_FEATURE__TYPE;
				default :
					return -1;
			}
		}
		if (baseClass == MultiplicityElement.class) {
			switch (baseFeatureID) {
				case UMLPackage.MULTIPLICITY_ELEMENT__IS_ORDERED :
					return UMLPackage.STRUCTURAL_FEATURE__IS_ORDERED;
				case UMLPackage.MULTIPLICITY_ELEMENT__IS_UNIQUE :
					return UMLPackage.STRUCTURAL_FEATURE__IS_UNIQUE;
				case UMLPackage.MULTIPLICITY_ELEMENT__LOWER :
					return UMLPackage.STRUCTURAL_FEATURE__LOWER;
				case UMLPackage.MULTIPLICITY_ELEMENT__LOWER_VALUE :
					return UMLPackage.STRUCTURAL_FEATURE__LOWER_VALUE;
				case UMLPackage.MULTIPLICITY_ELEMENT__UPPER :
					return UMLPackage.STRUCTURAL_FEATURE__UPPER;
				case UMLPackage.MULTIPLICITY_ELEMENT__UPPER_VALUE :
					return UMLPackage.STRUCTURAL_FEATURE__UPPER_VALUE;
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
		if (baseClass == TypedElement.class) {
			switch (baseOperationID) {
				default :
					return -1;
			}
		}
		if (baseClass == MultiplicityElement.class) {
			switch (baseOperationID) {
				case UMLPackage.MULTIPLICITY_ELEMENT___VALIDATE_UPPER_GE_LOWER__DIAGNOSTICCHAIN_MAP :
					return UMLPackage.STRUCTURAL_FEATURE___VALIDATE_UPPER_GE_LOWER__DIAGNOSTICCHAIN_MAP;
				case UMLPackage.MULTIPLICITY_ELEMENT___VALIDATE_LOWER_GE0__DIAGNOSTICCHAIN_MAP :
					return UMLPackage.STRUCTURAL_FEATURE___VALIDATE_LOWER_GE0__DIAGNOSTICCHAIN_MAP;
				case UMLPackage.MULTIPLICITY_ELEMENT___VALIDATE_VALUE_SPECIFICATION_NO_SIDE_EFFECTS__DIAGNOSTICCHAIN_MAP :
					return UMLPackage.STRUCTURAL_FEATURE___VALIDATE_VALUE_SPECIFICATION_NO_SIDE_EFFECTS__DIAGNOSTICCHAIN_MAP;
				case UMLPackage.MULTIPLICITY_ELEMENT___VALIDATE_VALUE_SPECIFICATION_CONSTANT__DIAGNOSTICCHAIN_MAP :
					return UMLPackage.STRUCTURAL_FEATURE___VALIDATE_VALUE_SPECIFICATION_CONSTANT__DIAGNOSTICCHAIN_MAP;
				case UMLPackage.MULTIPLICITY_ELEMENT___VALIDATE_LOWER_IS_INTEGER__DIAGNOSTICCHAIN_MAP :
					return UMLPackage.STRUCTURAL_FEATURE___VALIDATE_LOWER_IS_INTEGER__DIAGNOSTICCHAIN_MAP;
				case UMLPackage.MULTIPLICITY_ELEMENT___VALIDATE_UPPER_IS_UNLIMITED_NATURAL__DIAGNOSTICCHAIN_MAP :
					return UMLPackage.STRUCTURAL_FEATURE___VALIDATE_UPPER_IS_UNLIMITED_NATURAL__DIAGNOSTICCHAIN_MAP;
				case UMLPackage.MULTIPLICITY_ELEMENT___SET_LOWER__INT :
					return UMLPackage.STRUCTURAL_FEATURE___SET_LOWER__INT;
				case UMLPackage.MULTIPLICITY_ELEMENT___SET_UPPER__INT :
					return UMLPackage.STRUCTURAL_FEATURE___SET_UPPER__INT;
				case UMLPackage.MULTIPLICITY_ELEMENT___COMPATIBLE_WITH__MULTIPLICITYELEMENT :
					return UMLPackage.STRUCTURAL_FEATURE___COMPATIBLE_WITH__MULTIPLICITYELEMENT;
				case UMLPackage.MULTIPLICITY_ELEMENT___INCLUDES_MULTIPLICITY__MULTIPLICITYELEMENT :
					return UMLPackage.STRUCTURAL_FEATURE___INCLUDES_MULTIPLICITY__MULTIPLICITYELEMENT;
				case UMLPackage.MULTIPLICITY_ELEMENT___IS__INT_INT :
					return UMLPackage.STRUCTURAL_FEATURE___IS__INT_INT;
				case UMLPackage.MULTIPLICITY_ELEMENT___IS_MULTIVALUED :
					return UMLPackage.STRUCTURAL_FEATURE___IS_MULTIVALUED;
				case UMLPackage.MULTIPLICITY_ELEMENT___GET_LOWER :
					return UMLPackage.STRUCTURAL_FEATURE___GET_LOWER;
				case UMLPackage.MULTIPLICITY_ELEMENT___LOWER_BOUND :
					return UMLPackage.STRUCTURAL_FEATURE___LOWER_BOUND;
				case UMLPackage.MULTIPLICITY_ELEMENT___GET_UPPER :
					return UMLPackage.STRUCTURAL_FEATURE___GET_UPPER;
				case UMLPackage.MULTIPLICITY_ELEMENT___UPPER_BOUND :
					return UMLPackage.STRUCTURAL_FEATURE___UPPER_BOUND;
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
			case UMLPackage.STRUCTURAL_FEATURE___GET_EANNOTATION__STRING :
				return getEAnnotation((String) arguments.get(0));
			case UMLPackage.STRUCTURAL_FEATURE___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP :
				return validateHasOwner((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.STRUCTURAL_FEATURE___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP :
				return validateNotOwnSelf((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.STRUCTURAL_FEATURE___ADD_KEYWORD__STRING :
				return addKeyword((String) arguments.get(0));
			case UMLPackage.STRUCTURAL_FEATURE___APPLY_STEREOTYPE__STEREOTYPE :
				return applyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.STRUCTURAL_FEATURE___CREATE_EANNOTATION__STRING :
				return createEAnnotation((String) arguments.get(0));
			case UMLPackage.STRUCTURAL_FEATURE___DESTROY :
				destroy();
				return null;
			case UMLPackage.STRUCTURAL_FEATURE___GET_KEYWORDS :
				return getKeywords();
			case UMLPackage.STRUCTURAL_FEATURE___GET_APPLICABLE_STEREOTYPE__STRING :
				return getApplicableStereotype((String) arguments.get(0));
			case UMLPackage.STRUCTURAL_FEATURE___GET_APPLICABLE_STEREOTYPES :
				return getApplicableStereotypes();
			case UMLPackage.STRUCTURAL_FEATURE___GET_APPLIED_STEREOTYPE__STRING :
				return getAppliedStereotype((String) arguments.get(0));
			case UMLPackage.STRUCTURAL_FEATURE___GET_APPLIED_STEREOTYPES :
				return getAppliedStereotypes();
			case UMLPackage.STRUCTURAL_FEATURE___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING :
				return getAppliedSubstereotype((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.STRUCTURAL_FEATURE___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE :
				return getAppliedSubstereotypes((Stereotype) arguments.get(0));
			case UMLPackage.STRUCTURAL_FEATURE___GET_MODEL :
				return getModel();
			case UMLPackage.STRUCTURAL_FEATURE___GET_NEAREST_PACKAGE :
				return getNearestPackage();
			case UMLPackage.STRUCTURAL_FEATURE___GET_RELATIONSHIPS :
				return getRelationships();
			case UMLPackage.STRUCTURAL_FEATURE___GET_RELATIONSHIPS__ECLASS :
				return getRelationships((EClass) arguments.get(0));
			case UMLPackage.STRUCTURAL_FEATURE___GET_REQUIRED_STEREOTYPE__STRING :
				return getRequiredStereotype((String) arguments.get(0));
			case UMLPackage.STRUCTURAL_FEATURE___GET_REQUIRED_STEREOTYPES :
				return getRequiredStereotypes();
			case UMLPackage.STRUCTURAL_FEATURE___GET_SOURCE_DIRECTED_RELATIONSHIPS :
				return getSourceDirectedRelationships();
			case UMLPackage.STRUCTURAL_FEATURE___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS :
				return getSourceDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.STRUCTURAL_FEATURE___GET_STEREOTYPE_APPLICATION__STEREOTYPE :
				return getStereotypeApplication((Stereotype) arguments.get(0));
			case UMLPackage.STRUCTURAL_FEATURE___GET_STEREOTYPE_APPLICATIONS :
				return getStereotypeApplications();
			case UMLPackage.STRUCTURAL_FEATURE___GET_TARGET_DIRECTED_RELATIONSHIPS :
				return getTargetDirectedRelationships();
			case UMLPackage.STRUCTURAL_FEATURE___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS :
				return getTargetDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.STRUCTURAL_FEATURE___GET_VALUE__STEREOTYPE_STRING :
				return getValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.STRUCTURAL_FEATURE___HAS_KEYWORD__STRING :
				return hasKeyword((String) arguments.get(0));
			case UMLPackage.STRUCTURAL_FEATURE___HAS_VALUE__STEREOTYPE_STRING :
				return hasValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.STRUCTURAL_FEATURE___IS_STEREOTYPE_APPLICABLE__STEREOTYPE :
				return isStereotypeApplicable((Stereotype) arguments.get(0));
			case UMLPackage.STRUCTURAL_FEATURE___IS_STEREOTYPE_APPLIED__STEREOTYPE :
				return isStereotypeApplied((Stereotype) arguments.get(0));
			case UMLPackage.STRUCTURAL_FEATURE___IS_STEREOTYPE_REQUIRED__STEREOTYPE :
				return isStereotypeRequired((Stereotype) arguments.get(0));
			case UMLPackage.STRUCTURAL_FEATURE___REMOVE_KEYWORD__STRING :
				return removeKeyword((String) arguments.get(0));
			case UMLPackage.STRUCTURAL_FEATURE___SET_VALUE__STEREOTYPE_STRING_OBJECT :
				setValue((Stereotype) arguments.get(0),
					(String) arguments.get(1), arguments.get(2));
				return null;
			case UMLPackage.STRUCTURAL_FEATURE___UNAPPLY_STEREOTYPE__STEREOTYPE :
				return unapplyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.STRUCTURAL_FEATURE___ALL_OWNED_ELEMENTS :
				return allOwnedElements();
			case UMLPackage.STRUCTURAL_FEATURE___MUST_BE_OWNED :
				return mustBeOwned();
			case UMLPackage.STRUCTURAL_FEATURE___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP :
				return validateVisibilityNeedsOwnership(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.STRUCTURAL_FEATURE___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.STRUCTURAL_FEATURE___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasNoQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.STRUCTURAL_FEATURE___CREATE_DEPENDENCY__NAMEDELEMENT :
				return createDependency((NamedElement) arguments.get(0));
			case UMLPackage.STRUCTURAL_FEATURE___CREATE_USAGE__NAMEDELEMENT :
				return createUsage((NamedElement) arguments.get(0));
			case UMLPackage.STRUCTURAL_FEATURE___GET_LABEL :
				return getLabel();
			case UMLPackage.STRUCTURAL_FEATURE___GET_LABEL__BOOLEAN :
				return getLabel((Boolean) arguments.get(0));
			case UMLPackage.STRUCTURAL_FEATURE___GET_NAMESPACE :
				return getNamespace();
			case UMLPackage.STRUCTURAL_FEATURE___ALL_NAMESPACES :
				return allNamespaces();
			case UMLPackage.STRUCTURAL_FEATURE___ALL_OWNING_PACKAGES :
				return allOwningPackages();
			case UMLPackage.STRUCTURAL_FEATURE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE :
				return isDistinguishableFrom((NamedElement) arguments.get(0),
					(Namespace) arguments.get(1));
			case UMLPackage.STRUCTURAL_FEATURE___GET_QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.STRUCTURAL_FEATURE___SEPARATOR :
				return separator();
			case UMLPackage.STRUCTURAL_FEATURE___GET_CLIENT_DEPENDENCIES :
				return getClientDependencies();
			case UMLPackage.STRUCTURAL_FEATURE___VALIDATE_REDEFINITION_CONSISTENT__DIAGNOSTICCHAIN_MAP :
				return validateRedefinitionConsistent(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.STRUCTURAL_FEATURE___VALIDATE_NON_LEAF_REDEFINITION__DIAGNOSTICCHAIN_MAP :
				return validateNonLeafRedefinition(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.STRUCTURAL_FEATURE___VALIDATE_REDEFINITION_CONTEXT_VALID__DIAGNOSTICCHAIN_MAP :
				return validateRedefinitionContextValid(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.STRUCTURAL_FEATURE___IS_CONSISTENT_WITH__REDEFINABLEELEMENT :
				return isConsistentWith((RedefinableElement) arguments.get(0));
			case UMLPackage.STRUCTURAL_FEATURE___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT :
				return isRedefinitionContextValid(
					(RedefinableElement) arguments.get(0));
			case UMLPackage.STRUCTURAL_FEATURE___VALIDATE_UPPER_GE_LOWER__DIAGNOSTICCHAIN_MAP :
				return validateUpperGeLower((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.STRUCTURAL_FEATURE___VALIDATE_LOWER_GE0__DIAGNOSTICCHAIN_MAP :
				return validateLowerGe0((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.STRUCTURAL_FEATURE___VALIDATE_VALUE_SPECIFICATION_NO_SIDE_EFFECTS__DIAGNOSTICCHAIN_MAP :
				return validateValueSpecificationNoSideEffects(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.STRUCTURAL_FEATURE___VALIDATE_VALUE_SPECIFICATION_CONSTANT__DIAGNOSTICCHAIN_MAP :
				return validateValueSpecificationConstant(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.STRUCTURAL_FEATURE___VALIDATE_LOWER_IS_INTEGER__DIAGNOSTICCHAIN_MAP :
				return validateLowerIsInteger(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.STRUCTURAL_FEATURE___VALIDATE_UPPER_IS_UNLIMITED_NATURAL__DIAGNOSTICCHAIN_MAP :
				return validateUpperIsUnlimitedNatural(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.STRUCTURAL_FEATURE___SET_LOWER__INT :
				setLower((Integer) arguments.get(0));
				return null;
			case UMLPackage.STRUCTURAL_FEATURE___SET_UPPER__INT :
				setUpper((Integer) arguments.get(0));
				return null;
			case UMLPackage.STRUCTURAL_FEATURE___COMPATIBLE_WITH__MULTIPLICITYELEMENT :
				return compatibleWith((MultiplicityElement) arguments.get(0));
			case UMLPackage.STRUCTURAL_FEATURE___INCLUDES_MULTIPLICITY__MULTIPLICITYELEMENT :
				return includesMultiplicity(
					(MultiplicityElement) arguments.get(0));
			case UMLPackage.STRUCTURAL_FEATURE___IS__INT_INT :
				return is((Integer) arguments.get(0),
					(Integer) arguments.get(1));
			case UMLPackage.STRUCTURAL_FEATURE___IS_MULTIVALUED :
				return isMultivalued();
			case UMLPackage.STRUCTURAL_FEATURE___GET_LOWER :
				return getLower();
			case UMLPackage.STRUCTURAL_FEATURE___LOWER_BOUND :
				return lowerBound();
			case UMLPackage.STRUCTURAL_FEATURE___GET_UPPER :
				return getUpper();
			case UMLPackage.STRUCTURAL_FEATURE___UPPER_BOUND :
				return upperBound();
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
		result.append(", isReadOnly: "); //$NON-NLS-1$
		result.append((eFlags & IS_READ_ONLY_EFLAG) != 0);
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
		UMLPackage.STRUCTURAL_FEATURE__OWNED_COMMENT,
		UMLPackage.STRUCTURAL_FEATURE__NAME_EXPRESSION,
		UMLPackage.STRUCTURAL_FEATURE__LOWER_VALUE,
		UMLPackage.STRUCTURAL_FEATURE__UPPER_VALUE};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| eIsSet(UMLPackage.STRUCTURAL_FEATURE__LOWER_VALUE)
			|| eIsSet(UMLPackage.STRUCTURAL_FEATURE__UPPER_VALUE);
	}

} //StructuralFeatureImpl
