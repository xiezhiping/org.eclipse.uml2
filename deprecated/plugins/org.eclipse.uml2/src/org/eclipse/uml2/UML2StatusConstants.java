/*
 * Copyright (c) 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 */
package org.eclipse.uml2;

/**
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * Status constants for this plug-in.
 * <p>
 * This interface declares constants only; it is not intended to be implemented
 * or extended.
 * </p>
 *
 * @see org.eclipse.uml2.util.Status#getCode()
 * @generated
 */
public interface UML2StatusConstants {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * A constant indicating the plug-in identifier for status objects.
	 * @generated
	 */
	public static final String PLUGIN_ID = "org.eclipse.uml2"; //$NON-NLS-1$

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * A code indicating an unspecified status.
	 * @generated
	 */
	public static final int UNSPECIFIED = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * A code indicating that a constraint was violated.
	 * @see org.eclipse.uml2.Element#validateNotOwnSelf(org.eclipse.uml2.util.Validator.ValidationContext)
	 * @generated
	 */
	public static final int ELEMENT__NOT_OWN_SELF = 1;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * A code indicating that a constraint was violated.
	 * @see org.eclipse.uml2.Element#validateHasOwner(org.eclipse.uml2.util.Validator.ValidationContext)
	 * @generated
	 */
	public static final int ELEMENT__HAS_OWNER = 2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * A code indicating that a constraint was violated.
	 * @see org.eclipse.uml2.MultiplicityElement#validateUpperGt0(org.eclipse.uml2.util.Validator.ValidationContext)
	 * @generated
	 */
	public static final int MULTIPLICITY_ELEMENT__UPPER_GT0 = 3;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * A code indicating that a constraint was violated.
	 * @see org.eclipse.uml2.MultiplicityElement#validateLowerGe0(org.eclipse.uml2.util.Validator.ValidationContext)
	 * @generated
	 */
	public static final int MULTIPLICITY_ELEMENT__LOWER_GE0 = 4;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * A code indicating that a constraint was violated.
	 * @see org.eclipse.uml2.MultiplicityElement#validateUpperGeLower(org.eclipse.uml2.util.Validator.ValidationContext)
	 * @generated
	 */
	public static final int MULTIPLICITY_ELEMENT__UPPER_GE_LOWER = 5;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * A code indicating that a constraint was violated.
	 * @see org.eclipse.uml2.MultiplicityElement#validateLowerEqLowerbound(org.eclipse.uml2.util.Validator.ValidationContext)
	 * @generated
	 */
	public static final int MULTIPLICITY_ELEMENT__LOWER_EQ_LOWERBOUND = 6;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * A code indicating that a constraint was violated.
	 * @see org.eclipse.uml2.MultiplicityElement#validateUpperEqUpperbound(org.eclipse.uml2.util.Validator.ValidationContext)
	 * @generated
	 */
	public static final int MULTIPLICITY_ELEMENT__UPPER_EQ_UPPERBOUND = 7;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * A code indicating that a constraint was violated.
	 * @see org.eclipse.uml2.Property#validateOppositeIsOtherEnd(org.eclipse.uml2.util.Validator.ValidationContext)
	 * @generated
	 */
	public static final int PROPERTY__OPPOSITE_IS_OTHER_END = 8;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * A code indicating that a constraint was violated.
	 * @see org.eclipse.uml2.Property#validateMultiplicityOfComposite(org.eclipse.uml2.util.Validator.ValidationContext)
	 * @generated
	 */
	public static final int PROPERTY__MULTIPLICITY_OF_COMPOSITE = 9;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * A code indicating that a constraint was violated.
	 * @see org.eclipse.uml2.Property#validateSubsettingContext(org.eclipse.uml2.util.Validator.ValidationContext)
	 * @generated
	 */
	public static final int PROPERTY__SUBSETTING_CONTEXT = 10;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * A code indicating that a constraint was violated.
	 * @see org.eclipse.uml2.Property#validateNavigablePropertyRedefinition(org.eclipse.uml2.util.Validator.ValidationContext)
	 * @generated
	 */
	public static final int PROPERTY__NAVIGABLE_PROPERTY_REDEFINITION = 11;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * A code indicating that a constraint was violated.
	 * @see org.eclipse.uml2.Property#validateSubsettingRules(org.eclipse.uml2.util.Validator.ValidationContext)
	 * @generated
	 */
	public static final int PROPERTY__SUBSETTING_RULES = 12;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * A code indicating that a constraint was violated.
	 * @see org.eclipse.uml2.Property#validateNavigableReadonly(org.eclipse.uml2.util.Validator.ValidationContext)
	 * @generated
	 */
	public static final int PROPERTY__NAVIGABLE_READONLY = 13;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * A code indicating that a constraint was violated.
	 * @see org.eclipse.uml2.Property#validateDerivedUnionIsDerived(org.eclipse.uml2.util.Validator.ValidationContext)
	 * @generated
	 */
	public static final int PROPERTY__DERIVED_UNION_IS_DERIVED = 14;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * A code indicating that a constraint was violated.
	 * @see org.eclipse.uml2.Operation#validateTypeOfResult(org.eclipse.uml2.util.Validator.ValidationContext)
	 * @generated
	 */
	public static final int OPERATION__TYPE_OF_RESULT = 15;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * A code indicating that a constraint was violated.
	 * @see org.eclipse.uml2.Operation#validateOnlyBodyForQuery(org.eclipse.uml2.util.Validator.ValidationContext)
	 * @generated
	 */
	public static final int OPERATION__ONLY_BODY_FOR_QUERY = 16;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * A code indicating that a constraint was violated.
	 * @see org.eclipse.uml2.NamedElement#validateNoName(org.eclipse.uml2.util.Validator.ValidationContext)
	 * @generated
	 */
	public static final int NAMED_ELEMENT__NO_NAME = 17;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * A code indicating that a constraint was violated.
	 * @see org.eclipse.uml2.NamedElement#validateQualifiedName(org.eclipse.uml2.util.Validator.ValidationContext)
	 * @generated
	 */
	public static final int NAMED_ELEMENT__QUALIFIED_NAME = 18;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * A code indicating that a constraint was violated.
	 * @see org.eclipse.uml2.NamedElement#validateVisibilityNeedsOwnership(org.eclipse.uml2.util.Validator.ValidationContext)
	 * @generated
	 */
	public static final int NAMED_ELEMENT__VISIBILITY_NEEDS_OWNERSHIP = 19;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * A code indicating that a constraint was violated.
	 * @see org.eclipse.uml2.Package#validateElementsPublicOrPrivate(org.eclipse.uml2.util.Validator.ValidationContext)
	 * @generated
	 */
	public static final int PACKAGE__ELEMENTS_PUBLIC_OR_PRIVATE = 20;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * A code indicating that a constraint was violated.
	 * @see org.eclipse.uml2.Namespace#validateMembersAreDistinguishable(org.eclipse.uml2.util.Validator.ValidationContext)
	 * @generated
	 */
	public static final int NAMESPACE__MEMBERS_ARE_DISTINGUISHABLE = 21;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * A code indicating that a constraint was violated.
	 * @see org.eclipse.uml2.Namespace#validateImportedMemberDerived(org.eclipse.uml2.util.Validator.ValidationContext)
	 * @generated
	 */
	public static final int NAMESPACE__IMPORTED_MEMBER_DERIVED = 22;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * A code indicating that a constraint was violated.
	 * @see org.eclipse.uml2.Classifier#validateNoCyclesInGeneralization(org.eclipse.uml2.util.Validator.ValidationContext)
	 * @generated
	 */
	public static final int CLASSIFIER__NO_CYCLES_IN_GENERALIZATION = 23;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * A code indicating that a constraint was violated.
	 * @see org.eclipse.uml2.Classifier#validateSpecializeType(org.eclipse.uml2.util.Validator.ValidationContext)
	 * @generated
	 */
	public static final int CLASSIFIER__SPECIALIZE_TYPE = 24;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * A code indicating that a constraint was violated.
	 * @see org.eclipse.uml2.Classifier#validateInheritedMember(org.eclipse.uml2.util.Validator.ValidationContext)
	 * @generated
	 */
	public static final int CLASSIFIER__INHERITED_MEMBER = 25;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * A code indicating that a constraint was violated.
	 * @see org.eclipse.uml2.Classifier#validateGeneralEqualsParents(org.eclipse.uml2.util.Validator.ValidationContext)
	 * @generated
	 */
	public static final int CLASSIFIER__GENERAL_EQUALS_PARENTS = 26;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * A code indicating that a constraint was violated.
	 * @see org.eclipse.uml2.Constraint#validateNotApplyToSelf(org.eclipse.uml2.util.Validator.ValidationContext)
	 * @generated
	 */
	public static final int CONSTRAINT__NOT_APPLY_TO_SELF = 27;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * A code indicating that a constraint was violated.
	 * @see org.eclipse.uml2.InstanceSpecification#validateSlotsAreDefined(org.eclipse.uml2.util.Validator.ValidationContext)
	 * @generated
	 */
	public static final int INSTANCE_SPECIFICATION__SLOTS_ARE_DEFINED = 28;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * A code indicating that a constraint was violated.
	 * @see org.eclipse.uml2.InstanceSpecification#validateNoDuplicateSlots(org.eclipse.uml2.util.Validator.ValidationContext)
	 * @generated
	 */
	public static final int INSTANCE_SPECIFICATION__NO_DUPLICATE_SLOTS = 29;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * A code indicating that a constraint was violated.
	 * @see org.eclipse.uml2.RedefinableElement#validateRedefinitionContextValid(org.eclipse.uml2.util.Validator.ValidationContext)
	 * @generated
	 */
	public static final int REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT_VALID = 30;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * A code indicating that a constraint was violated.
	 * @see org.eclipse.uml2.RedefinableElement#validateRedefinitionConsistent(org.eclipse.uml2.util.Validator.ValidationContext)
	 * @generated
	 */
	public static final int REDEFINABLE_ELEMENT__REDEFINITION_CONSISTENT = 31;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * A code indicating that a constraint was violated.
	 * @see org.eclipse.uml2.ElementImport#validateVisibilityPublicOrPrivate(org.eclipse.uml2.util.Validator.ValidationContext)
	 * @generated
	 */
	public static final int ELEMENT_IMPORT__VISIBILITY_PUBLIC_OR_PRIVATE = 32;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * A code indicating that a constraint was violated.
	 * @see org.eclipse.uml2.ElementImport#validateImportedElementIsPublic(org.eclipse.uml2.util.Validator.ValidationContext)
	 * @generated
	 */
	public static final int ELEMENT_IMPORT__IMPORTED_ELEMENT_IS_PUBLIC = 33;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * A code indicating that a constraint was violated.
	 * @see org.eclipse.uml2.PackageImport#validatePublicOrPrivate(org.eclipse.uml2.util.Validator.ValidationContext)
	 * @generated
	 */
	public static final int PACKAGE_IMPORT__PUBLIC_OR_PRIVATE = 34;

} //UML2StatusConstants
