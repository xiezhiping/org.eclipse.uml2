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

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.InputPin;
import org.eclipse.uml2.uml.LinkEndCreationData;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.QualifierValue;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLPackage;

import org.eclipse.uml2.uml.internal.operations.LinkEndCreationDataOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link End Creation Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.LinkEndCreationDataImpl#getInsertAt <em>Insert At</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.LinkEndCreationDataImpl#isReplaceAll <em>Is Replace All</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LinkEndCreationDataImpl
		extends LinkEndDataImpl
		implements LinkEndCreationData {

	/**
	 * The cached value of the '{@link #getInsertAt() <em>Insert At</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsertAt()
	 * @generated
	 * @ordered
	 */
	protected InputPin insertAt;

	/**
	 * The default value of the '{@link #isReplaceAll() <em>Is Replace All</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReplaceAll()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_REPLACE_ALL_EDEFAULT = false;

	/**
	 * The flag representing the value of the '{@link #isReplaceAll() <em>Is Replace All</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReplaceAll()
	 * @generated
	 * @ordered
	 */
	protected static final int IS_REPLACE_ALL_EFLAG = 1 << 8;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkEndCreationDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.LINK_END_CREATION_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReplaceAll() {
		return (eFlags & IS_REPLACE_ALL_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsReplaceAll(boolean newIsReplaceAll) {
		boolean oldIsReplaceAll = (eFlags & IS_REPLACE_ALL_EFLAG) != 0;
		if (newIsReplaceAll)
			eFlags |= IS_REPLACE_ALL_EFLAG;
		else
			eFlags &= ~IS_REPLACE_ALL_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.LINK_END_CREATION_DATA__IS_REPLACE_ALL,
				oldIsReplaceAll, newIsReplaceAll));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInsertAtPin(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return LinkEndCreationDataOperations.validateInsertAtPin(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InputPin> allPins() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			@SuppressWarnings("unchecked")
			EList<InputPin> result = (EList<InputPin>) cache.get(this,
				UMLPackage.Literals.LINK_END_DATA___ALL_PINS);
			if (result == null) {
				cache.put(this, UMLPackage.Literals.LINK_END_DATA___ALL_PINS,
					result = LinkEndCreationDataOperations.allPins(this));
			}
			return result;
		}
		return LinkEndCreationDataOperations.allPins(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin getInsertAt() {
		if (insertAt != null && insertAt.eIsProxy()) {
			InternalEObject oldInsertAt = (InternalEObject) insertAt;
			insertAt = (InputPin) eResolveProxy(oldInsertAt);
			if (insertAt != oldInsertAt) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.LINK_END_CREATION_DATA__INSERT_AT,
						oldInsertAt, insertAt));
			}
		}
		return insertAt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin basicGetInsertAt() {
		return insertAt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInsertAt(InputPin newInsertAt) {
		InputPin oldInsertAt = insertAt;
		insertAt = newInsertAt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.LINK_END_CREATION_DATA__INSERT_AT, oldInsertAt,
				insertAt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.LINK_END_CREATION_DATA__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.LINK_END_CREATION_DATA__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.LINK_END_CREATION_DATA__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.LINK_END_CREATION_DATA__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.LINK_END_CREATION_DATA__END :
				if (resolve)
					return getEnd();
				return basicGetEnd();
			case UMLPackage.LINK_END_CREATION_DATA__QUALIFIER :
				return getQualifiers();
			case UMLPackage.LINK_END_CREATION_DATA__VALUE :
				if (resolve)
					return getValue();
				return basicGetValue();
			case UMLPackage.LINK_END_CREATION_DATA__INSERT_AT :
				if (resolve)
					return getInsertAt();
				return basicGetInsertAt();
			case UMLPackage.LINK_END_CREATION_DATA__IS_REPLACE_ALL :
				return isReplaceAll();
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
			case UMLPackage.LINK_END_CREATION_DATA__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations()
					.addAll((Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.LINK_END_CREATION_DATA__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments()
					.addAll((Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.LINK_END_CREATION_DATA__END :
				setEnd((Property) newValue);
				return;
			case UMLPackage.LINK_END_CREATION_DATA__QUALIFIER :
				getQualifiers().clear();
				getQualifiers()
					.addAll((Collection<? extends QualifierValue>) newValue);
				return;
			case UMLPackage.LINK_END_CREATION_DATA__VALUE :
				setValue((InputPin) newValue);
				return;
			case UMLPackage.LINK_END_CREATION_DATA__INSERT_AT :
				setInsertAt((InputPin) newValue);
				return;
			case UMLPackage.LINK_END_CREATION_DATA__IS_REPLACE_ALL :
				setIsReplaceAll((Boolean) newValue);
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
			case UMLPackage.LINK_END_CREATION_DATA__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.LINK_END_CREATION_DATA__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.LINK_END_CREATION_DATA__END :
				setEnd((Property) null);
				return;
			case UMLPackage.LINK_END_CREATION_DATA__QUALIFIER :
				getQualifiers().clear();
				return;
			case UMLPackage.LINK_END_CREATION_DATA__VALUE :
				setValue((InputPin) null);
				return;
			case UMLPackage.LINK_END_CREATION_DATA__INSERT_AT :
				setInsertAt((InputPin) null);
				return;
			case UMLPackage.LINK_END_CREATION_DATA__IS_REPLACE_ALL :
				setIsReplaceAll(IS_REPLACE_ALL_EDEFAULT);
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
			case UMLPackage.LINK_END_CREATION_DATA__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.LINK_END_CREATION_DATA__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.LINK_END_CREATION_DATA__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.LINK_END_CREATION_DATA__OWNER :
				return isSetOwner();
			case UMLPackage.LINK_END_CREATION_DATA__END :
				return end != null;
			case UMLPackage.LINK_END_CREATION_DATA__QUALIFIER :
				return qualifiers != null && !qualifiers.isEmpty();
			case UMLPackage.LINK_END_CREATION_DATA__VALUE :
				return value != null;
			case UMLPackage.LINK_END_CREATION_DATA__INSERT_AT :
				return insertAt != null;
			case UMLPackage.LINK_END_CREATION_DATA__IS_REPLACE_ALL :
				return ((eFlags
					& IS_REPLACE_ALL_EFLAG) != 0) != IS_REPLACE_ALL_EDEFAULT;
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
			case UMLPackage.LINK_END_CREATION_DATA___GET_EANNOTATION__STRING :
				return getEAnnotation((String) arguments.get(0));
			case UMLPackage.LINK_END_CREATION_DATA___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP :
				return validateHasOwner((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.LINK_END_CREATION_DATA___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP :
				return validateNotOwnSelf((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.LINK_END_CREATION_DATA___ADD_KEYWORD__STRING :
				return addKeyword((String) arguments.get(0));
			case UMLPackage.LINK_END_CREATION_DATA___APPLY_STEREOTYPE__STEREOTYPE :
				return applyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.LINK_END_CREATION_DATA___CREATE_EANNOTATION__STRING :
				return createEAnnotation((String) arguments.get(0));
			case UMLPackage.LINK_END_CREATION_DATA___DESTROY :
				destroy();
				return null;
			case UMLPackage.LINK_END_CREATION_DATA___GET_KEYWORDS :
				return getKeywords();
			case UMLPackage.LINK_END_CREATION_DATA___GET_APPLICABLE_STEREOTYPE__STRING :
				return getApplicableStereotype((String) arguments.get(0));
			case UMLPackage.LINK_END_CREATION_DATA___GET_APPLICABLE_STEREOTYPES :
				return getApplicableStereotypes();
			case UMLPackage.LINK_END_CREATION_DATA___GET_APPLIED_STEREOTYPE__STRING :
				return getAppliedStereotype((String) arguments.get(0));
			case UMLPackage.LINK_END_CREATION_DATA___GET_APPLIED_STEREOTYPES :
				return getAppliedStereotypes();
			case UMLPackage.LINK_END_CREATION_DATA___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING :
				return getAppliedSubstereotype((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.LINK_END_CREATION_DATA___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE :
				return getAppliedSubstereotypes((Stereotype) arguments.get(0));
			case UMLPackage.LINK_END_CREATION_DATA___GET_MODEL :
				return getModel();
			case UMLPackage.LINK_END_CREATION_DATA___GET_NEAREST_PACKAGE :
				return getNearestPackage();
			case UMLPackage.LINK_END_CREATION_DATA___GET_RELATIONSHIPS :
				return getRelationships();
			case UMLPackage.LINK_END_CREATION_DATA___GET_RELATIONSHIPS__ECLASS :
				return getRelationships((EClass) arguments.get(0));
			case UMLPackage.LINK_END_CREATION_DATA___GET_REQUIRED_STEREOTYPE__STRING :
				return getRequiredStereotype((String) arguments.get(0));
			case UMLPackage.LINK_END_CREATION_DATA___GET_REQUIRED_STEREOTYPES :
				return getRequiredStereotypes();
			case UMLPackage.LINK_END_CREATION_DATA___GET_SOURCE_DIRECTED_RELATIONSHIPS :
				return getSourceDirectedRelationships();
			case UMLPackage.LINK_END_CREATION_DATA___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS :
				return getSourceDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.LINK_END_CREATION_DATA___GET_STEREOTYPE_APPLICATION__STEREOTYPE :
				return getStereotypeApplication((Stereotype) arguments.get(0));
			case UMLPackage.LINK_END_CREATION_DATA___GET_STEREOTYPE_APPLICATIONS :
				return getStereotypeApplications();
			case UMLPackage.LINK_END_CREATION_DATA___GET_TARGET_DIRECTED_RELATIONSHIPS :
				return getTargetDirectedRelationships();
			case UMLPackage.LINK_END_CREATION_DATA___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS :
				return getTargetDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.LINK_END_CREATION_DATA___GET_VALUE__STEREOTYPE_STRING :
				return getValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.LINK_END_CREATION_DATA___HAS_KEYWORD__STRING :
				return hasKeyword((String) arguments.get(0));
			case UMLPackage.LINK_END_CREATION_DATA___HAS_VALUE__STEREOTYPE_STRING :
				return hasValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.LINK_END_CREATION_DATA___IS_STEREOTYPE_APPLICABLE__STEREOTYPE :
				return isStereotypeApplicable((Stereotype) arguments.get(0));
			case UMLPackage.LINK_END_CREATION_DATA___IS_STEREOTYPE_APPLIED__STEREOTYPE :
				return isStereotypeApplied((Stereotype) arguments.get(0));
			case UMLPackage.LINK_END_CREATION_DATA___IS_STEREOTYPE_REQUIRED__STEREOTYPE :
				return isStereotypeRequired((Stereotype) arguments.get(0));
			case UMLPackage.LINK_END_CREATION_DATA___REMOVE_KEYWORD__STRING :
				return removeKeyword((String) arguments.get(0));
			case UMLPackage.LINK_END_CREATION_DATA___SET_VALUE__STEREOTYPE_STRING_OBJECT :
				setValue((Stereotype) arguments.get(0),
					(String) arguments.get(1), arguments.get(2));
				return null;
			case UMLPackage.LINK_END_CREATION_DATA___UNAPPLY_STEREOTYPE__STEREOTYPE :
				return unapplyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.LINK_END_CREATION_DATA___ALL_OWNED_ELEMENTS :
				return allOwnedElements();
			case UMLPackage.LINK_END_CREATION_DATA___MUST_BE_OWNED :
				return mustBeOwned();
			case UMLPackage.LINK_END_CREATION_DATA___VALIDATE_SAME_TYPE__DIAGNOSTICCHAIN_MAP :
				return validateSameType((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.LINK_END_CREATION_DATA___VALIDATE_MULTIPLICITY__DIAGNOSTICCHAIN_MAP :
				return validateMultiplicity((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.LINK_END_CREATION_DATA___VALIDATE_END_OBJECT_INPUT_PIN__DIAGNOSTICCHAIN_MAP :
				return validateEndObjectInputPin(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.LINK_END_CREATION_DATA___VALIDATE_PROPERTY_IS_ASSOCIATION_END__DIAGNOSTICCHAIN_MAP :
				return validatePropertyIsAssociationEnd(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.LINK_END_CREATION_DATA___VALIDATE_QUALIFIERS__DIAGNOSTICCHAIN_MAP :
				return validateQualifiers((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.LINK_END_CREATION_DATA___ALL_PINS :
				return allPins();
			case UMLPackage.LINK_END_CREATION_DATA___VALIDATE_INSERT_AT_PIN__DIAGNOSTICCHAIN_MAP :
				return validateInsertAtPin((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
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
		result.append(" (isReplaceAll: "); //$NON-NLS-1$
		result.append((eFlags & IS_REPLACE_ALL_EFLAG) != 0);
		result.append(')');
		return result.toString();
	}

} //LinkEndCreationDataImpl
