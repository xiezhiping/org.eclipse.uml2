/*
 * Copyright (c) 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *
 * $Id: UML2DiagnosticConstants.java,v 1.3 2004/04/30 17:21:46 khussey Exp $
 */
package org.eclipse.uml2;

/**
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * Diagnostic constants for this plug-in.
 * <p>
 * This interface declares constants only; it is not intended to be implemented
 * or extended.
 * </p>
 *
 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
 * @generated
 */
public interface UML2DiagnosticConstants {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * A constant indicating the plug-in identifier for diagnostic objects.
	 * @generated
	 */
	public static final String PLUGIN_ID = "org.eclipse.uml2"; //$NON-NLS-1$

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * A code indicating an unspecified diagnostic.
	 * @generated
	 */
	public static final int UNSPECIFIED = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * A code indicating that a constraint was violated.
	 * @see org.eclipse.uml2.Element#validateNotOwnSelf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public static final int ELEMENT__NOT_OWN_SELF = 1;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * A code indicating that a constraint was violated.
	 * @see org.eclipse.uml2.Element#validateHasOwner(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public static final int ELEMENT__HAS_OWNER = 2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * A code indicating that a constraint was violated.
	 * @see org.eclipse.uml2.MultiplicityElement#validateUpperGt0(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public static final int MULTIPLICITY_ELEMENT__UPPER_GT0 = 3;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * A code indicating that a constraint was violated.
	 * @see org.eclipse.uml2.MultiplicityElement#validateLowerGe0(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public static final int MULTIPLICITY_ELEMENT__LOWER_GE0 = 4;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * A code indicating that a constraint was violated.
	 * @see org.eclipse.uml2.MultiplicityElement#validateUpperGeLower(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public static final int MULTIPLICITY_ELEMENT__UPPER_GE_LOWER = 5;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * A code indicating that a constraint was violated.
	 * @see org.eclipse.uml2.MultiplicityElement#validateLowerEqLowerbound(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public static final int MULTIPLICITY_ELEMENT__LOWER_EQ_LOWERBOUND = 6;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * A code indicating that a constraint was violated.
	 * @see org.eclipse.uml2.MultiplicityElement#validateUpperEqUpperbound(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public static final int MULTIPLICITY_ELEMENT__UPPER_EQ_UPPERBOUND = 7;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * A code indicating that a constraint was violated.
	 * @see org.eclipse.uml2.Property#validateOppositeIsOtherEnd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public static final int PROPERTY__OPPOSITE_IS_OTHER_END = 13;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * A code indicating that a constraint was violated.
	 * @see org.eclipse.uml2.Property#validateMultiplicityOfComposite(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public static final int PROPERTY__MULTIPLICITY_OF_COMPOSITE = 14;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * A code indicating that a constraint was violated.
	 * @see org.eclipse.uml2.Property#validateSubsettingContext(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public static final int PROPERTY__SUBSETTING_CONTEXT = 15;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * A code indicating that a constraint was violated.
	 * @see org.eclipse.uml2.Property#validateNavigablePropertyRedefinition(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public static final int PROPERTY__NAVIGABLE_PROPERTY_REDEFINITION = 16;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * A code indicating that a constraint was violated.
	 * @see org.eclipse.uml2.Property#validateSubsettingRules(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public static final int PROPERTY__SUBSETTING_RULES = 17;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * A code indicating that a constraint was violated.
	 * @see org.eclipse.uml2.Property#validateNavigableReadonly(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public static final int PROPERTY__NAVIGABLE_READONLY = 18;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * A code indicating that a constraint was violated.
	 * @see org.eclipse.uml2.Property#validateDerivedUnionIsDerived(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public static final int PROPERTY__DERIVED_UNION_IS_DERIVED = 19;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * A code indicating that a constraint was violated.
	 * @see org.eclipse.uml2.Operation#validateTypeOfResult(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public static final int OPERATION__TYPE_OF_RESULT = 20;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * A code indicating that a constraint was violated.
	 * @see org.eclipse.uml2.Operation#validateOnlyBodyForQuery(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public static final int OPERATION__ONLY_BODY_FOR_QUERY = 21;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * A code indicating that a constraint was violated.
	 * @see org.eclipse.uml2.NamedElement#validateNoName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public static final int NAMED_ELEMENT__NO_NAME = 8;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * A code indicating that a constraint was violated.
	 * @see org.eclipse.uml2.NamedElement#validateQualifiedName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public static final int NAMED_ELEMENT__QUALIFIED_NAME = 9;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * A code indicating that a constraint was violated.
	 * @see org.eclipse.uml2.NamedElement#validateVisibilityNeedsOwnership(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public static final int NAMED_ELEMENT__VISIBILITY_NEEDS_OWNERSHIP = 10;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * A code indicating that a constraint was violated.
	 * @see org.eclipse.uml2.Package#validateElementsPublicOrPrivate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public static final int PACKAGE__ELEMENTS_PUBLIC_OR_PRIVATE = 22;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * A code indicating that a constraint was violated.
	 * @see org.eclipse.uml2.Namespace#validateMembersAreDistinguishable(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public static final int NAMESPACE__MEMBERS_ARE_DISTINGUISHABLE = 11;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * A code indicating that a constraint was violated.
	 * @see org.eclipse.uml2.Namespace#validateImportedMemberDerived(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public static final int NAMESPACE__IMPORTED_MEMBER_DERIVED = 12;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * A code indicating that a constraint was violated.
	 * @see org.eclipse.uml2.Classifier#validateNoCyclesInGeneralization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public static final int CLASSIFIER__NO_CYCLES_IN_GENERALIZATION = 24;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * A code indicating that a constraint was violated.
	 * @see org.eclipse.uml2.Classifier#validateSpecializeType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public static final int CLASSIFIER__SPECIALIZE_TYPE = 25;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * A code indicating that a constraint was violated.
	 * @see org.eclipse.uml2.Classifier#validateInheritedMember(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public static final int CLASSIFIER__INHERITED_MEMBER = 26;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * A code indicating that a constraint was violated.
	 * @see org.eclipse.uml2.Classifier#validateGeneralEqualsParents(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public static final int CLASSIFIER__GENERAL_EQUALS_PARENTS = 27;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * A code indicating that a constraint was violated.
	 * @see org.eclipse.uml2.Constraint#validateNotApplyToSelf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public static final int CONSTRAINT__NOT_APPLY_TO_SELF = 23;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * A code indicating that a constraint was violated.
	 * @see org.eclipse.uml2.InstanceSpecification#validateSlotsAreDefined(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public static final int INSTANCE_SPECIFICATION__SLOTS_ARE_DEFINED = 30;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * A code indicating that a constraint was violated.
	 * @see org.eclipse.uml2.InstanceSpecification#validateNoDuplicateSlots(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public static final int INSTANCE_SPECIFICATION__NO_DUPLICATE_SLOTS = 31;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * A code indicating that a constraint was violated.
	 * @see org.eclipse.uml2.RedefinableElement#validateRedefinitionContextValid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public static final int REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT_VALID = 28;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * A code indicating that a constraint was violated.
	 * @see org.eclipse.uml2.RedefinableElement#validateRedefinitionConsistent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public static final int REDEFINABLE_ELEMENT__REDEFINITION_CONSISTENT = 29;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * A code indicating that a constraint was violated.
	 * @see org.eclipse.uml2.ElementImport#validateVisibilityPublicOrPrivate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public static final int ELEMENT_IMPORT__VISIBILITY_PUBLIC_OR_PRIVATE = 32;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * A code indicating that a constraint was violated.
	 * @see org.eclipse.uml2.ElementImport#validateImportedElementIsPublic(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public static final int ELEMENT_IMPORT__IMPORTED_ELEMENT_IS_PUBLIC = 33;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * A code indicating that a constraint was violated.
	 * @see org.eclipse.uml2.PackageImport#validatePublicOrPrivate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public static final int PACKAGE_IMPORT__PUBLIC_OR_PRIVATE = 34;

} //UML2DiagnosticConstants
