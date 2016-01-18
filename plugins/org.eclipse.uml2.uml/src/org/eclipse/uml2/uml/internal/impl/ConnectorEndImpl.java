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

import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.ConnectableElement;
import org.eclipse.uml2.uml.ConnectorEnd;
import org.eclipse.uml2.uml.MultiplicityElement;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.ValueSpecification;

import org.eclipse.uml2.uml.internal.operations.ConnectorEndOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector End</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ConnectorEndImpl#getDefiningEnd <em>Defining End</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ConnectorEndImpl#getPartWithPort <em>Part With Port</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ConnectorEndImpl#getRole <em>Role</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectorEndImpl
		extends MultiplicityElementImpl
		implements ConnectorEnd {

	/**
	 * The cached value of the '{@link #getPartWithPort() <em>Part With Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartWithPort()
	 * @generated
	 * @ordered
	 */
	protected Property partWithPort;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected ConnectableElement role;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectorEndImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.CONNECTOR_END;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getDefiningEnd() {
		Property definingEnd = basicGetDefiningEnd();
		return definingEnd != null && definingEnd.eIsProxy()
			? (Property) eResolveProxy((InternalEObject) definingEnd)
			: definingEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property basicGetDefiningEnd() {
		return ConnectorEndOperations.getDefiningEnd(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getPartWithPort() {
		if (partWithPort != null && partWithPort.eIsProxy()) {
			InternalEObject oldPartWithPort = (InternalEObject) partWithPort;
			partWithPort = (Property) eResolveProxy(oldPartWithPort);
			if (partWithPort != oldPartWithPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.CONNECTOR_END__PART_WITH_PORT,
						oldPartWithPort, partWithPort));
			}
		}
		return partWithPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property basicGetPartWithPort() {
		return partWithPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartWithPort(Property newPartWithPort) {
		Property oldPartWithPort = partWithPort;
		partWithPort = newPartWithPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.CONNECTOR_END__PART_WITH_PORT, oldPartWithPort,
				partWithPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectableElement getRole() {
		if (role != null && role.eIsProxy()) {
			InternalEObject oldRole = (InternalEObject) role;
			role = (ConnectableElement) eResolveProxy(oldRole);
			if (role != oldRole) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.CONNECTOR_END__ROLE, oldRole, role));
			}
		}
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectableElement basicGetRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole(ConnectableElement newRole) {
		ConnectableElement oldRole = role;
		role = newRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.CONNECTOR_END__ROLE, oldRole, role));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultiplicity(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConnectorEndOperations.validateMultiplicity(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePartWithPortEmpty(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConnectorEndOperations.validatePartWithPortEmpty(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoleAndPartWithPort(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConnectorEndOperations.validateRoleAndPartWithPort(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSelfPartWithPort(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConnectorEndOperations.validateSelfPartWithPort(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.CONNECTOR_END__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.CONNECTOR_END__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.CONNECTOR_END__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.CONNECTOR_END__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.CONNECTOR_END__IS_ORDERED :
				return isOrdered();
			case UMLPackage.CONNECTOR_END__IS_UNIQUE :
				return isUnique();
			case UMLPackage.CONNECTOR_END__LOWER :
				return getLower();
			case UMLPackage.CONNECTOR_END__LOWER_VALUE :
				if (resolve)
					return getLowerValue();
				return basicGetLowerValue();
			case UMLPackage.CONNECTOR_END__UPPER :
				return getUpper();
			case UMLPackage.CONNECTOR_END__UPPER_VALUE :
				if (resolve)
					return getUpperValue();
				return basicGetUpperValue();
			case UMLPackage.CONNECTOR_END__DEFINING_END :
				if (resolve)
					return getDefiningEnd();
				return basicGetDefiningEnd();
			case UMLPackage.CONNECTOR_END__PART_WITH_PORT :
				if (resolve)
					return getPartWithPort();
				return basicGetPartWithPort();
			case UMLPackage.CONNECTOR_END__ROLE :
				if (resolve)
					return getRole();
				return basicGetRole();
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
			case UMLPackage.CONNECTOR_END__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations()
					.addAll((Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.CONNECTOR_END__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments()
					.addAll((Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.CONNECTOR_END__IS_ORDERED :
				setIsOrdered((Boolean) newValue);
				return;
			case UMLPackage.CONNECTOR_END__IS_UNIQUE :
				setIsUnique((Boolean) newValue);
				return;
			case UMLPackage.CONNECTOR_END__LOWER :
				setLower((Integer) newValue);
				return;
			case UMLPackage.CONNECTOR_END__LOWER_VALUE :
				setLowerValue((ValueSpecification) newValue);
				return;
			case UMLPackage.CONNECTOR_END__UPPER :
				setUpper((Integer) newValue);
				return;
			case UMLPackage.CONNECTOR_END__UPPER_VALUE :
				setUpperValue((ValueSpecification) newValue);
				return;
			case UMLPackage.CONNECTOR_END__PART_WITH_PORT :
				setPartWithPort((Property) newValue);
				return;
			case UMLPackage.CONNECTOR_END__ROLE :
				setRole((ConnectableElement) newValue);
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
			case UMLPackage.CONNECTOR_END__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.CONNECTOR_END__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.CONNECTOR_END__IS_ORDERED :
				setIsOrdered(IS_ORDERED_EDEFAULT);
				return;
			case UMLPackage.CONNECTOR_END__IS_UNIQUE :
				setIsUnique(IS_UNIQUE_EDEFAULT);
				return;
			case UMLPackage.CONNECTOR_END__LOWER :
				setLower(LOWER_EDEFAULT);
				return;
			case UMLPackage.CONNECTOR_END__LOWER_VALUE :
				setLowerValue((ValueSpecification) null);
				return;
			case UMLPackage.CONNECTOR_END__UPPER :
				setUpper(UPPER_EDEFAULT);
				return;
			case UMLPackage.CONNECTOR_END__UPPER_VALUE :
				setUpperValue((ValueSpecification) null);
				return;
			case UMLPackage.CONNECTOR_END__PART_WITH_PORT :
				setPartWithPort((Property) null);
				return;
			case UMLPackage.CONNECTOR_END__ROLE :
				setRole((ConnectableElement) null);
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
			case UMLPackage.CONNECTOR_END__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.CONNECTOR_END__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.CONNECTOR_END__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.CONNECTOR_END__OWNER :
				return isSetOwner();
			case UMLPackage.CONNECTOR_END__IS_ORDERED :
				return ((eFlags
					& IS_ORDERED_EFLAG) != 0) != IS_ORDERED_EDEFAULT;
			case UMLPackage.CONNECTOR_END__IS_UNIQUE :
				return ((eFlags & IS_UNIQUE_EFLAG) != 0) != IS_UNIQUE_EDEFAULT;
			case UMLPackage.CONNECTOR_END__LOWER :
				return getLower() != LOWER_EDEFAULT;
			case UMLPackage.CONNECTOR_END__LOWER_VALUE :
				return lowerValue != null;
			case UMLPackage.CONNECTOR_END__UPPER :
				return getUpper() != UPPER_EDEFAULT;
			case UMLPackage.CONNECTOR_END__UPPER_VALUE :
				return upperValue != null;
			case UMLPackage.CONNECTOR_END__DEFINING_END :
				return basicGetDefiningEnd() != null;
			case UMLPackage.CONNECTOR_END__PART_WITH_PORT :
				return partWithPort != null;
			case UMLPackage.CONNECTOR_END__ROLE :
				return role != null;
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
			case UMLPackage.CONNECTOR_END___GET_EANNOTATION__STRING :
				return getEAnnotation((String) arguments.get(0));
			case UMLPackage.CONNECTOR_END___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP :
				return validateHasOwner((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.CONNECTOR_END___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP :
				return validateNotOwnSelf((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.CONNECTOR_END___ADD_KEYWORD__STRING :
				return addKeyword((String) arguments.get(0));
			case UMLPackage.CONNECTOR_END___APPLY_STEREOTYPE__STEREOTYPE :
				return applyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.CONNECTOR_END___CREATE_EANNOTATION__STRING :
				return createEAnnotation((String) arguments.get(0));
			case UMLPackage.CONNECTOR_END___DESTROY :
				destroy();
				return null;
			case UMLPackage.CONNECTOR_END___GET_KEYWORDS :
				return getKeywords();
			case UMLPackage.CONNECTOR_END___GET_APPLICABLE_STEREOTYPE__STRING :
				return getApplicableStereotype((String) arguments.get(0));
			case UMLPackage.CONNECTOR_END___GET_APPLICABLE_STEREOTYPES :
				return getApplicableStereotypes();
			case UMLPackage.CONNECTOR_END___GET_APPLIED_STEREOTYPE__STRING :
				return getAppliedStereotype((String) arguments.get(0));
			case UMLPackage.CONNECTOR_END___GET_APPLIED_STEREOTYPES :
				return getAppliedStereotypes();
			case UMLPackage.CONNECTOR_END___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING :
				return getAppliedSubstereotype((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.CONNECTOR_END___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE :
				return getAppliedSubstereotypes((Stereotype) arguments.get(0));
			case UMLPackage.CONNECTOR_END___GET_MODEL :
				return getModel();
			case UMLPackage.CONNECTOR_END___GET_NEAREST_PACKAGE :
				return getNearestPackage();
			case UMLPackage.CONNECTOR_END___GET_RELATIONSHIPS :
				return getRelationships();
			case UMLPackage.CONNECTOR_END___GET_RELATIONSHIPS__ECLASS :
				return getRelationships((EClass) arguments.get(0));
			case UMLPackage.CONNECTOR_END___GET_REQUIRED_STEREOTYPE__STRING :
				return getRequiredStereotype((String) arguments.get(0));
			case UMLPackage.CONNECTOR_END___GET_REQUIRED_STEREOTYPES :
				return getRequiredStereotypes();
			case UMLPackage.CONNECTOR_END___GET_SOURCE_DIRECTED_RELATIONSHIPS :
				return getSourceDirectedRelationships();
			case UMLPackage.CONNECTOR_END___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS :
				return getSourceDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.CONNECTOR_END___GET_STEREOTYPE_APPLICATION__STEREOTYPE :
				return getStereotypeApplication((Stereotype) arguments.get(0));
			case UMLPackage.CONNECTOR_END___GET_STEREOTYPE_APPLICATIONS :
				return getStereotypeApplications();
			case UMLPackage.CONNECTOR_END___GET_TARGET_DIRECTED_RELATIONSHIPS :
				return getTargetDirectedRelationships();
			case UMLPackage.CONNECTOR_END___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS :
				return getTargetDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.CONNECTOR_END___GET_VALUE__STEREOTYPE_STRING :
				return getValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.CONNECTOR_END___HAS_KEYWORD__STRING :
				return hasKeyword((String) arguments.get(0));
			case UMLPackage.CONNECTOR_END___HAS_VALUE__STEREOTYPE_STRING :
				return hasValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.CONNECTOR_END___IS_STEREOTYPE_APPLICABLE__STEREOTYPE :
				return isStereotypeApplicable((Stereotype) arguments.get(0));
			case UMLPackage.CONNECTOR_END___IS_STEREOTYPE_APPLIED__STEREOTYPE :
				return isStereotypeApplied((Stereotype) arguments.get(0));
			case UMLPackage.CONNECTOR_END___IS_STEREOTYPE_REQUIRED__STEREOTYPE :
				return isStereotypeRequired((Stereotype) arguments.get(0));
			case UMLPackage.CONNECTOR_END___REMOVE_KEYWORD__STRING :
				return removeKeyword((String) arguments.get(0));
			case UMLPackage.CONNECTOR_END___SET_VALUE__STEREOTYPE_STRING_OBJECT :
				setValue((Stereotype) arguments.get(0),
					(String) arguments.get(1), arguments.get(2));
				return null;
			case UMLPackage.CONNECTOR_END___UNAPPLY_STEREOTYPE__STEREOTYPE :
				return unapplyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.CONNECTOR_END___ALL_OWNED_ELEMENTS :
				return allOwnedElements();
			case UMLPackage.CONNECTOR_END___MUST_BE_OWNED :
				return mustBeOwned();
			case UMLPackage.CONNECTOR_END___VALIDATE_UPPER_GE_LOWER__DIAGNOSTICCHAIN_MAP :
				return validateUpperGeLower((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.CONNECTOR_END___VALIDATE_LOWER_GE0__DIAGNOSTICCHAIN_MAP :
				return validateLowerGe0((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.CONNECTOR_END___VALIDATE_VALUE_SPECIFICATION_NO_SIDE_EFFECTS__DIAGNOSTICCHAIN_MAP :
				return validateValueSpecificationNoSideEffects(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.CONNECTOR_END___VALIDATE_VALUE_SPECIFICATION_CONSTANT__DIAGNOSTICCHAIN_MAP :
				return validateValueSpecificationConstant(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.CONNECTOR_END___VALIDATE_LOWER_IS_INTEGER__DIAGNOSTICCHAIN_MAP :
				return validateLowerIsInteger(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.CONNECTOR_END___VALIDATE_UPPER_IS_UNLIMITED_NATURAL__DIAGNOSTICCHAIN_MAP :
				return validateUpperIsUnlimitedNatural(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.CONNECTOR_END___SET_LOWER__INT :
				setLower((Integer) arguments.get(0));
				return null;
			case UMLPackage.CONNECTOR_END___SET_UPPER__INT :
				setUpper((Integer) arguments.get(0));
				return null;
			case UMLPackage.CONNECTOR_END___COMPATIBLE_WITH__MULTIPLICITYELEMENT :
				return compatibleWith((MultiplicityElement) arguments.get(0));
			case UMLPackage.CONNECTOR_END___INCLUDES_MULTIPLICITY__MULTIPLICITYELEMENT :
				return includesMultiplicity(
					(MultiplicityElement) arguments.get(0));
			case UMLPackage.CONNECTOR_END___IS__INT_INT :
				return is((Integer) arguments.get(0),
					(Integer) arguments.get(1));
			case UMLPackage.CONNECTOR_END___IS_MULTIVALUED :
				return isMultivalued();
			case UMLPackage.CONNECTOR_END___GET_LOWER :
				return getLower();
			case UMLPackage.CONNECTOR_END___LOWER_BOUND :
				return lowerBound();
			case UMLPackage.CONNECTOR_END___GET_UPPER :
				return getUpper();
			case UMLPackage.CONNECTOR_END___UPPER_BOUND :
				return upperBound();
			case UMLPackage.CONNECTOR_END___VALIDATE_ROLE_AND_PART_WITH_PORT__DIAGNOSTICCHAIN_MAP :
				return validateRoleAndPartWithPort(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.CONNECTOR_END___VALIDATE_PART_WITH_PORT_EMPTY__DIAGNOSTICCHAIN_MAP :
				return validatePartWithPortEmpty(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.CONNECTOR_END___VALIDATE_MULTIPLICITY__DIAGNOSTICCHAIN_MAP :
				return validateMultiplicity((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.CONNECTOR_END___VALIDATE_SELF_PART_WITH_PORT__DIAGNOSTICCHAIN_MAP :
				return validateSelfPartWithPort(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.CONNECTOR_END___GET_DEFINING_END :
				return getDefiningEnd();
		}
		return eDynamicInvoke(operationID, arguments);
	}

} //ConnectorEndImpl
