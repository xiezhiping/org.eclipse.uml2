/*
 * Copyright (c) 2005, 2009 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey - 286329
 *
 * $Id: ExtensionEndImpl.java,v 1.25 2009/12/04 15:30:42 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.uml.ExtensionEnd;
import org.eclipse.uml2.uml.MultiplicityElement;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.ParameterableElement;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.RedefinableElement;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;

import org.eclipse.uml2.uml.internal.operations.ExtensionEndOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extension End</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl#getLower <em>Lower</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExtensionEndImpl
		extends PropertyImpl
		implements ExtensionEnd {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtensionEndImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.EXTENSION_END;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject) type;
			type = (Type) eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.EXTENSION_END__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(Type newType) {
		Type oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.EXTENSION_END__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetType() {
		return type != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getLower() {
		return ExtensionEndOperations.getLower(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLower(int newLower) {
		ExtensionEndOperations.setLower(this, newLower);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isSetLower() {
		return getLower() != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultiplicity(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ExtensionEndOperations.validateMultiplicity(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAggregation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ExtensionEndOperations.validateAggregation(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int lowerBound() {
		return ExtensionEndOperations.lowerBound(this);
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
			case UMLPackage.EXTENSION_END___GET_EANNOTATION__STRING :
				return getEAnnotation((String) arguments.get(0));
			case UMLPackage.EXTENSION_END___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP :
				return validateNotOwnSelf((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.EXTENSION_END___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP :
				return validateHasOwner((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.EXTENSION_END___DESTROY :
				destroy();
				return null;
			case UMLPackage.EXTENSION_END___HAS_KEYWORD__STRING :
				return hasKeyword((String) arguments.get(0));
			case UMLPackage.EXTENSION_END___GET_KEYWORDS :
				return getKeywords();
			case UMLPackage.EXTENSION_END___ADD_KEYWORD__STRING :
				return addKeyword((String) arguments.get(0));
			case UMLPackage.EXTENSION_END___REMOVE_KEYWORD__STRING :
				return removeKeyword((String) arguments.get(0));
			case UMLPackage.EXTENSION_END___GET_NEAREST_PACKAGE :
				return getNearestPackage();
			case UMLPackage.EXTENSION_END___GET_MODEL :
				return getModel();
			case UMLPackage.EXTENSION_END___IS_STEREOTYPE_APPLICABLE__STEREOTYPE :
				return isStereotypeApplicable((Stereotype) arguments.get(0));
			case UMLPackage.EXTENSION_END___IS_STEREOTYPE_REQUIRED__STEREOTYPE :
				return isStereotypeRequired((Stereotype) arguments.get(0));
			case UMLPackage.EXTENSION_END___IS_STEREOTYPE_APPLIED__STEREOTYPE :
				return isStereotypeApplied((Stereotype) arguments.get(0));
			case UMLPackage.EXTENSION_END___APPLY_STEREOTYPE__STEREOTYPE :
				return applyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.EXTENSION_END___UNAPPLY_STEREOTYPE__STEREOTYPE :
				return unapplyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.EXTENSION_END___GET_APPLICABLE_STEREOTYPES :
				return getApplicableStereotypes();
			case UMLPackage.EXTENSION_END___GET_APPLICABLE_STEREOTYPE__STRING :
				return getApplicableStereotype((String) arguments.get(0));
			case UMLPackage.EXTENSION_END___GET_STEREOTYPE_APPLICATIONS :
				return getStereotypeApplications();
			case UMLPackage.EXTENSION_END___GET_STEREOTYPE_APPLICATION__STEREOTYPE :
				return getStereotypeApplication((Stereotype) arguments.get(0));
			case UMLPackage.EXTENSION_END___GET_REQUIRED_STEREOTYPES :
				return getRequiredStereotypes();
			case UMLPackage.EXTENSION_END___GET_REQUIRED_STEREOTYPE__STRING :
				return getRequiredStereotype((String) arguments.get(0));
			case UMLPackage.EXTENSION_END___GET_APPLIED_STEREOTYPES :
				return getAppliedStereotypes();
			case UMLPackage.EXTENSION_END___GET_APPLIED_STEREOTYPE__STRING :
				return getAppliedStereotype((String) arguments.get(0));
			case UMLPackage.EXTENSION_END___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE :
				return getAppliedSubstereotypes((Stereotype) arguments.get(0));
			case UMLPackage.EXTENSION_END___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING :
				return getAppliedSubstereotype((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.EXTENSION_END___HAS_VALUE__STEREOTYPE_STRING :
				return hasValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.EXTENSION_END___GET_VALUE__STEREOTYPE_STRING :
				return getValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.EXTENSION_END___SET_VALUE__STEREOTYPE_STRING_OBJECT :
				setValue((Stereotype) arguments.get(0), (String) arguments
					.get(1), arguments.get(2));
				return null;
			case UMLPackage.EXTENSION_END___CREATE_EANNOTATION__STRING :
				return createEAnnotation((String) arguments.get(0));
			case UMLPackage.EXTENSION_END___GET_RELATIONSHIPS :
				return getRelationships();
			case UMLPackage.EXTENSION_END___GET_RELATIONSHIPS__ECLASS :
				return getRelationships((EClass) arguments.get(0));
			case UMLPackage.EXTENSION_END___GET_SOURCE_DIRECTED_RELATIONSHIPS :
				return getSourceDirectedRelationships();
			case UMLPackage.EXTENSION_END___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS :
				return getSourceDirectedRelationships((EClass) arguments.get(0));
			case UMLPackage.EXTENSION_END___GET_TARGET_DIRECTED_RELATIONSHIPS :
				return getTargetDirectedRelationships();
			case UMLPackage.EXTENSION_END___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS :
				return getTargetDirectedRelationships((EClass) arguments.get(0));
			case UMLPackage.EXTENSION_END___ALL_OWNED_ELEMENTS :
				return allOwnedElements();
			case UMLPackage.EXTENSION_END___MUST_BE_OWNED :
				return mustBeOwned();
			case UMLPackage.EXTENSION_END___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasNoQualifiedName((DiagnosticChain) arguments
					.get(0), (Map<Object, Object>) arguments.get(1));
			case UMLPackage.EXTENSION_END___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasQualifiedName((DiagnosticChain) arguments
					.get(0), (Map<Object, Object>) arguments.get(1));
			case UMLPackage.EXTENSION_END___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP :
				return validateVisibilityNeedsOwnership(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.EXTENSION_END___CREATE_DEPENDENCY__NAMEDELEMENT :
				return createDependency((NamedElement) arguments.get(0));
			case UMLPackage.EXTENSION_END___GET_LABEL :
				return getLabel();
			case UMLPackage.EXTENSION_END___GET_LABEL__BOOLEAN :
				return getLabel((Boolean) arguments.get(0));
			case UMLPackage.EXTENSION_END___CREATE_USAGE__NAMEDELEMENT :
				return createUsage((NamedElement) arguments.get(0));
			case UMLPackage.EXTENSION_END___GET_QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.EXTENSION_END___ALL_NAMESPACES :
				return allNamespaces();
			case UMLPackage.EXTENSION_END___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE :
				return isDistinguishableFrom((NamedElement) arguments.get(0),
					(Namespace) arguments.get(1));
			case UMLPackage.EXTENSION_END___SEPARATOR :
				return separator();
			case UMLPackage.EXTENSION_END___ALL_OWNING_PACKAGES :
				return allOwningPackages();
			case UMLPackage.EXTENSION_END___VALIDATE_REDEFINITION_CONTEXT_VALID__DIAGNOSTICCHAIN_MAP :
				return validateRedefinitionContextValid(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.EXTENSION_END___VALIDATE_REDEFINITION_CONSISTENT__DIAGNOSTICCHAIN_MAP :
				return validateRedefinitionConsistent(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.EXTENSION_END___IS_CONSISTENT_WITH__REDEFINABLEELEMENT :
				return isConsistentWith((RedefinableElement) arguments.get(0));
			case UMLPackage.EXTENSION_END___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT :
				return isRedefinitionContextValid((RedefinableElement) arguments
					.get(0));
			case UMLPackage.EXTENSION_END___VALIDATE_LOWER_GE0__DIAGNOSTICCHAIN_MAP :
				return validateLowerGe0((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.EXTENSION_END___VALIDATE_UPPER_GE_LOWER__DIAGNOSTICCHAIN_MAP :
				return validateUpperGeLower((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.EXTENSION_END___VALIDATE_VALUE_SPECIFICATION_NO_SIDE_EFFECTS__DIAGNOSTICCHAIN_MAP :
				return validateValueSpecificationNoSideEffects(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.EXTENSION_END___VALIDATE_VALUE_SPECIFICATION_CONSTANT__DIAGNOSTICCHAIN_MAP :
				return validateValueSpecificationConstant(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.EXTENSION_END___SET_LOWER__INT :
				setLower((Integer) arguments.get(0));
				return null;
			case UMLPackage.EXTENSION_END___SET_UPPER__INT :
				setUpper((Integer) arguments.get(0));
				return null;
			case UMLPackage.EXTENSION_END___GET_LOWER :
				return getLower();
			case UMLPackage.EXTENSION_END___GET_UPPER :
				return getUpper();
			case UMLPackage.EXTENSION_END___IS_MULTIVALUED :
				return isMultivalued();
			case UMLPackage.EXTENSION_END___INCLUDES_CARDINALITY__INT :
				return includesCardinality((Integer) arguments.get(0));
			case UMLPackage.EXTENSION_END___INCLUDES_MULTIPLICITY__MULTIPLICITYELEMENT :
				return includesMultiplicity((MultiplicityElement) arguments
					.get(0));
			case UMLPackage.EXTENSION_END___LOWER_BOUND :
				return lowerBound();
			case UMLPackage.EXTENSION_END___UPPER_BOUND :
				return upperBound();
			case UMLPackage.EXTENSION_END___COMPATIBLE_WITH__MULTIPLICITYELEMENT :
				return compatibleWith((MultiplicityElement) arguments.get(0));
			case UMLPackage.EXTENSION_END___IS__INT_INT :
				return is((Integer) arguments.get(0), (Integer) arguments
					.get(1));
			case UMLPackage.EXTENSION_END___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT :
				return isCompatibleWith((ParameterableElement) arguments.get(0));
			case UMLPackage.EXTENSION_END___IS_TEMPLATE_PARAMETER :
				return isTemplateParameter();
			case UMLPackage.EXTENSION_END___GET_ENDS :
				return getEnds();
			case UMLPackage.EXTENSION_END___GET_DEPLOYED_ELEMENTS :
				return getDeployedElements();
			case UMLPackage.EXTENSION_END___VALIDATE_MULTIPLICITY_OF_COMPOSITE__DIAGNOSTICCHAIN_MAP :
				return validateMultiplicityOfComposite(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.EXTENSION_END___VALIDATE_SUBSETTING_CONTEXT_CONFORMS__DIAGNOSTICCHAIN_MAP :
				return validateSubsettingContextConforms(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.EXTENSION_END___VALIDATE_REDEFINED_PROPERTY_INHERITED__DIAGNOSTICCHAIN_MAP :
				return validateRedefinedPropertyInherited(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.EXTENSION_END___VALIDATE_SUBSETTING_RULES__DIAGNOSTICCHAIN_MAP :
				return validateSubsettingRules((DiagnosticChain) arguments
					.get(0), (Map<Object, Object>) arguments.get(1));
			case UMLPackage.EXTENSION_END___VALIDATE_NAVIGABLE_READONLY__DIAGNOSTICCHAIN_MAP :
				return validateNavigableReadonly((DiagnosticChain) arguments
					.get(0), (Map<Object, Object>) arguments.get(1));
			case UMLPackage.EXTENSION_END___VALIDATE_DERIVED_UNION_IS_DERIVED__DIAGNOSTICCHAIN_MAP :
				return validateDerivedUnionIsDerived(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.EXTENSION_END___VALIDATE_DERIVED_UNION_IS_READ_ONLY__DIAGNOSTICCHAIN_MAP :
				return validateDerivedUnionIsReadOnly(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.EXTENSION_END___VALIDATE_SUBSETTED_PROPERTY_NAMES__DIAGNOSTICCHAIN_MAP :
				return validateSubsettedPropertyNames(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.EXTENSION_END___VALIDATE_DEPLOYMENT_TARGET__DIAGNOSTICCHAIN_MAP :
				return validateDeploymentTarget((DiagnosticChain) arguments
					.get(0), (Map<Object, Object>) arguments.get(1));
			case UMLPackage.EXTENSION_END___VALIDATE_BINDING_TO_ATTRIBUTE__DIAGNOSTICCHAIN_MAP :
				return validateBindingToAttribute((DiagnosticChain) arguments
					.get(0), (Map<Object, Object>) arguments.get(1));
			case UMLPackage.EXTENSION_END___GET_DEFAULT :
				return getDefault();
			case UMLPackage.EXTENSION_END___IS_SET_DEFAULT :
				return isSetDefault();
			case UMLPackage.EXTENSION_END___SET_DEFAULT__STRING :
				setDefault((String) arguments.get(0));
				return null;
			case UMLPackage.EXTENSION_END___SET_IS_COMPOSITE__BOOLEAN :
				setIsComposite((Boolean) arguments.get(0));
				return null;
			case UMLPackage.EXTENSION_END___SET_OPPOSITE__PROPERTY :
				setOpposite((Property) arguments.get(0));
				return null;
			case UMLPackage.EXTENSION_END___UNSET_DEFAULT :
				unsetDefault();
				return null;
			case UMLPackage.EXTENSION_END___SET_IS_NAVIGABLE__BOOLEAN :
				setIsNavigable((Boolean) arguments.get(0));
				return null;
			case UMLPackage.EXTENSION_END___GET_OTHER_END :
				return getOtherEnd();
			case UMLPackage.EXTENSION_END___SET_BOOLEAN_DEFAULT_VALUE__BOOLEAN :
				setBooleanDefaultValue((Boolean) arguments.get(0));
				return null;
			case UMLPackage.EXTENSION_END___SET_INTEGER_DEFAULT_VALUE__INT :
				setIntegerDefaultValue((Integer) arguments.get(0));
				return null;
			case UMLPackage.EXTENSION_END___SET_STRING_DEFAULT_VALUE__STRING :
				setStringDefaultValue((String) arguments.get(0));
				return null;
			case UMLPackage.EXTENSION_END___SET_UNLIMITED_NATURAL_DEFAULT_VALUE__INT :
				setUnlimitedNaturalDefaultValue((Integer) arguments.get(0));
				return null;
			case UMLPackage.EXTENSION_END___SET_NULL_DEFAULT_VALUE :
				setNullDefaultValue();
				return null;
			case UMLPackage.EXTENSION_END___IS_ATTRIBUTE__PROPERTY :
				return isAttribute((Property) arguments.get(0));
			case UMLPackage.EXTENSION_END___GET_OPPOSITE :
				return getOpposite();
			case UMLPackage.EXTENSION_END___IS_COMPOSITE :
				return isComposite();
			case UMLPackage.EXTENSION_END___SUBSETTING_CONTEXT :
				return subsettingContext();
			case UMLPackage.EXTENSION_END___IS_NAVIGABLE :
				return isNavigable();
			case UMLPackage.EXTENSION_END___VALIDATE_MULTIPLICITY__DIAGNOSTICCHAIN_MAP :
				return validateMultiplicity((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.EXTENSION_END___VALIDATE_AGGREGATION__DIAGNOSTICCHAIN_MAP :
				return validateAggregation((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		}
		return eDynamicInvoke(operationID, arguments);
	}

} //ExtensionEndImpl
