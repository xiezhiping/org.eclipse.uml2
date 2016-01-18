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
import org.eclipse.uml2.uml.InputPin;
import org.eclipse.uml2.uml.LinkEndData;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.QualifierValue;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLPackage;

import org.eclipse.uml2.uml.internal.operations.LinkEndDataOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link End Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.LinkEndDataImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.LinkEndDataImpl#getEnd <em>End</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.LinkEndDataImpl#getQualifiers <em>Qualifier</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.LinkEndDataImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LinkEndDataImpl
		extends ElementImpl
		implements LinkEndData {

	/**
	 * The cached value of the '{@link #getEnd() <em>End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected Property end;

	/**
	 * The cached value of the '{@link #getQualifiers() <em>Qualifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<QualifierValue> qualifiers;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected InputPin value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkEndDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.LINK_END_DATA;
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
						UMLPackage.LINK_END_DATA__OWNED_ELEMENT,
						OWNED_ELEMENT_ESUBSETS));
			}
			return ownedElements;
		}
		return new DerivedUnionEObjectEList<Element>(Element.class, this,
			UMLPackage.LINK_END_DATA__OWNED_ELEMENT, OWNED_ELEMENT_ESUBSETS);
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
		UMLPackage.LINK_END_DATA__OWNED_COMMENT,
		UMLPackage.LINK_END_DATA__QUALIFIER};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin getValue() {
		if (value != null && value.eIsProxy()) {
			InternalEObject oldValue = (InternalEObject) value;
			value = (InputPin) eResolveProxy(oldValue);
			if (value != oldValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.LINK_END_DATA__VALUE, oldValue, value));
			}
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin basicGetValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(InputPin newValue) {
		InputPin oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.LINK_END_DATA__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getEnd() {
		if (end != null && end.eIsProxy()) {
			InternalEObject oldEnd = (InternalEObject) end;
			end = (Property) eResolveProxy(oldEnd);
			if (end != oldEnd) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.LINK_END_DATA__END, oldEnd, end));
			}
		}
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property basicGetEnd() {
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnd(Property newEnd) {
		Property oldEnd = end;
		end = newEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.LINK_END_DATA__END, oldEnd, end));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QualifierValue> getQualifiers() {
		if (qualifiers == null) {
			qualifiers = new EObjectContainmentEList.Resolving<QualifierValue>(
				QualifierValue.class, this,
				UMLPackage.LINK_END_DATA__QUALIFIER);
		}
		return qualifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualifierValue createQualifier() {
		QualifierValue newQualifier = (QualifierValue) create(
			UMLPackage.Literals.QUALIFIER_VALUE);
		getQualifiers().add(newQualifier);
		return newQualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertyIsAssociationEnd(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return LinkEndDataOperations.validatePropertyIsAssociationEnd(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSameType(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return LinkEndDataOperations.validateSameType(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultiplicity(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return LinkEndDataOperations.validateMultiplicity(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQualifiers(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return LinkEndDataOperations.validateQualifiers(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputPin> allPins() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			@SuppressWarnings("unchecked")
			EList<InputPin> result = (EList<InputPin>) cache.get(this,
				UMLPackage.Literals.LINK_END_DATA___ALL_PINS);
			if (result == null) {
				cache.put(this, UMLPackage.Literals.LINK_END_DATA___ALL_PINS,
					result = LinkEndDataOperations.allPins(this));
			}
			return result;
		}
		return LinkEndDataOperations.allPins(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEndObjectInputPin(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return LinkEndDataOperations.validateEndObjectInputPin(this,
			diagnostics, context);
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
			case UMLPackage.LINK_END_DATA__EANNOTATIONS :
				return ((InternalEList<?>) getEAnnotations())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.LINK_END_DATA__OWNED_COMMENT :
				return ((InternalEList<?>) getOwnedComments())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.LINK_END_DATA__QUALIFIER :
				return ((InternalEList<?>) getQualifiers())
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
			case UMLPackage.LINK_END_DATA__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.LINK_END_DATA__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.LINK_END_DATA__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.LINK_END_DATA__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.LINK_END_DATA__END :
				if (resolve)
					return getEnd();
				return basicGetEnd();
			case UMLPackage.LINK_END_DATA__QUALIFIER :
				return getQualifiers();
			case UMLPackage.LINK_END_DATA__VALUE :
				if (resolve)
					return getValue();
				return basicGetValue();
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
			case UMLPackage.LINK_END_DATA__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations()
					.addAll((Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.LINK_END_DATA__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments()
					.addAll((Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.LINK_END_DATA__END :
				setEnd((Property) newValue);
				return;
			case UMLPackage.LINK_END_DATA__QUALIFIER :
				getQualifiers().clear();
				getQualifiers()
					.addAll((Collection<? extends QualifierValue>) newValue);
				return;
			case UMLPackage.LINK_END_DATA__VALUE :
				setValue((InputPin) newValue);
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
			case UMLPackage.LINK_END_DATA__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.LINK_END_DATA__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.LINK_END_DATA__END :
				setEnd((Property) null);
				return;
			case UMLPackage.LINK_END_DATA__QUALIFIER :
				getQualifiers().clear();
				return;
			case UMLPackage.LINK_END_DATA__VALUE :
				setValue((InputPin) null);
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
			case UMLPackage.LINK_END_DATA__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.LINK_END_DATA__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.LINK_END_DATA__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.LINK_END_DATA__OWNER :
				return isSetOwner();
			case UMLPackage.LINK_END_DATA__END :
				return end != null;
			case UMLPackage.LINK_END_DATA__QUALIFIER :
				return qualifiers != null && !qualifiers.isEmpty();
			case UMLPackage.LINK_END_DATA__VALUE :
				return value != null;
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
			case UMLPackage.LINK_END_DATA___GET_EANNOTATION__STRING :
				return getEAnnotation((String) arguments.get(0));
			case UMLPackage.LINK_END_DATA___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP :
				return validateHasOwner((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.LINK_END_DATA___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP :
				return validateNotOwnSelf((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.LINK_END_DATA___ADD_KEYWORD__STRING :
				return addKeyword((String) arguments.get(0));
			case UMLPackage.LINK_END_DATA___APPLY_STEREOTYPE__STEREOTYPE :
				return applyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.LINK_END_DATA___CREATE_EANNOTATION__STRING :
				return createEAnnotation((String) arguments.get(0));
			case UMLPackage.LINK_END_DATA___DESTROY :
				destroy();
				return null;
			case UMLPackage.LINK_END_DATA___GET_KEYWORDS :
				return getKeywords();
			case UMLPackage.LINK_END_DATA___GET_APPLICABLE_STEREOTYPE__STRING :
				return getApplicableStereotype((String) arguments.get(0));
			case UMLPackage.LINK_END_DATA___GET_APPLICABLE_STEREOTYPES :
				return getApplicableStereotypes();
			case UMLPackage.LINK_END_DATA___GET_APPLIED_STEREOTYPE__STRING :
				return getAppliedStereotype((String) arguments.get(0));
			case UMLPackage.LINK_END_DATA___GET_APPLIED_STEREOTYPES :
				return getAppliedStereotypes();
			case UMLPackage.LINK_END_DATA___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING :
				return getAppliedSubstereotype((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.LINK_END_DATA___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE :
				return getAppliedSubstereotypes((Stereotype) arguments.get(0));
			case UMLPackage.LINK_END_DATA___GET_MODEL :
				return getModel();
			case UMLPackage.LINK_END_DATA___GET_NEAREST_PACKAGE :
				return getNearestPackage();
			case UMLPackage.LINK_END_DATA___GET_RELATIONSHIPS :
				return getRelationships();
			case UMLPackage.LINK_END_DATA___GET_RELATIONSHIPS__ECLASS :
				return getRelationships((EClass) arguments.get(0));
			case UMLPackage.LINK_END_DATA___GET_REQUIRED_STEREOTYPE__STRING :
				return getRequiredStereotype((String) arguments.get(0));
			case UMLPackage.LINK_END_DATA___GET_REQUIRED_STEREOTYPES :
				return getRequiredStereotypes();
			case UMLPackage.LINK_END_DATA___GET_SOURCE_DIRECTED_RELATIONSHIPS :
				return getSourceDirectedRelationships();
			case UMLPackage.LINK_END_DATA___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS :
				return getSourceDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.LINK_END_DATA___GET_STEREOTYPE_APPLICATION__STEREOTYPE :
				return getStereotypeApplication((Stereotype) arguments.get(0));
			case UMLPackage.LINK_END_DATA___GET_STEREOTYPE_APPLICATIONS :
				return getStereotypeApplications();
			case UMLPackage.LINK_END_DATA___GET_TARGET_DIRECTED_RELATIONSHIPS :
				return getTargetDirectedRelationships();
			case UMLPackage.LINK_END_DATA___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS :
				return getTargetDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.LINK_END_DATA___GET_VALUE__STEREOTYPE_STRING :
				return getValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.LINK_END_DATA___HAS_KEYWORD__STRING :
				return hasKeyword((String) arguments.get(0));
			case UMLPackage.LINK_END_DATA___HAS_VALUE__STEREOTYPE_STRING :
				return hasValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.LINK_END_DATA___IS_STEREOTYPE_APPLICABLE__STEREOTYPE :
				return isStereotypeApplicable((Stereotype) arguments.get(0));
			case UMLPackage.LINK_END_DATA___IS_STEREOTYPE_APPLIED__STEREOTYPE :
				return isStereotypeApplied((Stereotype) arguments.get(0));
			case UMLPackage.LINK_END_DATA___IS_STEREOTYPE_REQUIRED__STEREOTYPE :
				return isStereotypeRequired((Stereotype) arguments.get(0));
			case UMLPackage.LINK_END_DATA___REMOVE_KEYWORD__STRING :
				return removeKeyword((String) arguments.get(0));
			case UMLPackage.LINK_END_DATA___SET_VALUE__STEREOTYPE_STRING_OBJECT :
				setValue((Stereotype) arguments.get(0),
					(String) arguments.get(1), arguments.get(2));
				return null;
			case UMLPackage.LINK_END_DATA___UNAPPLY_STEREOTYPE__STEREOTYPE :
				return unapplyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.LINK_END_DATA___ALL_OWNED_ELEMENTS :
				return allOwnedElements();
			case UMLPackage.LINK_END_DATA___MUST_BE_OWNED :
				return mustBeOwned();
			case UMLPackage.LINK_END_DATA___VALIDATE_SAME_TYPE__DIAGNOSTICCHAIN_MAP :
				return validateSameType((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.LINK_END_DATA___VALIDATE_MULTIPLICITY__DIAGNOSTICCHAIN_MAP :
				return validateMultiplicity((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.LINK_END_DATA___VALIDATE_END_OBJECT_INPUT_PIN__DIAGNOSTICCHAIN_MAP :
				return validateEndObjectInputPin(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.LINK_END_DATA___VALIDATE_PROPERTY_IS_ASSOCIATION_END__DIAGNOSTICCHAIN_MAP :
				return validatePropertyIsAssociationEnd(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.LINK_END_DATA___VALIDATE_QUALIFIERS__DIAGNOSTICCHAIN_MAP :
				return validateQualifiers((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.LINK_END_DATA___ALL_PINS :
				return allPins();
		}
		return eDynamicInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| eIsSet(UMLPackage.LINK_END_DATA__QUALIFIER);
	}

} //LinkEndDataImpl
