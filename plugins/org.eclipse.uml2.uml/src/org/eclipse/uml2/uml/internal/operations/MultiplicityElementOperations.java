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
 * $Id: MultiplicityElementOperations.java,v 1.9 2005/12/12 18:11:59 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.impl.BasicEObjectImpl;

import org.eclipse.uml2.uml.LiteralInteger;
import org.eclipse.uml2.uml.LiteralUnlimitedNatural;
import org.eclipse.uml2.uml.MultiplicityElement;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.ValueSpecification;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Multiplicity Element</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.MultiplicityElement#validateUpperGt0(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Upper Gt0</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.MultiplicityElement#validateLowerGe0(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Lower Ge0</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.MultiplicityElement#validateUpperGeLower(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Upper Ge Lower</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.MultiplicityElement#validateValueSpecificationNoSideEffects(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Value Specification No Side Effects</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.MultiplicityElement#validateValueSpecificationConstant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Value Specification Constant</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.MultiplicityElement#getLower() <em>Get Lower</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.MultiplicityElement#getUpper() <em>Get Upper</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.MultiplicityElement#isMultivalued() <em>Is Multivalued</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.MultiplicityElement#includesCardinality(int) <em>Includes Cardinality</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.MultiplicityElement#includesMultiplicity(org.eclipse.uml2.uml.MultiplicityElement) <em>Includes Multiplicity</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.MultiplicityElement#lowerBound() <em>Lower Bound</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.MultiplicityElement#upperBound() <em>Upper Bound</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.MultiplicityElement#setLower(int) <em>Set Lower</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.MultiplicityElement#setUpper(int) <em>Set Upper</em>}</li>
 * </ul>
 * </p>
 *
 * @generated not
 */
public final class MultiplicityElementOperations
		extends UMLOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private MultiplicityElementOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A multiplicity must define at least one valid cardinality that is greater than zero.
	 * upperBound()->notEmpty() implies upperBound() > 0
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUpperGt0(
			MultiplicityElement multiplicityElement,
			DiagnosticChain diagnostics, Map context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics
					.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						UMLValidator.DIAGNOSTIC_SOURCE,
						UMLValidator.MULTIPLICITY_ELEMENT__UPPER_GT0,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateUpperGt0", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(multiplicityElement, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{multiplicityElement}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The lower bound must be a non-negative integer literal.
	 * lowerBound()->notEmpty() implies lowerBound() >= 0
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateLowerGe0(
			MultiplicityElement multiplicityElement,
			DiagnosticChain diagnostics, Map context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics
					.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						UMLValidator.DIAGNOSTIC_SOURCE,
						UMLValidator.MULTIPLICITY_ELEMENT__LOWER_GE0,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateLowerGe0", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(multiplicityElement, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{multiplicityElement}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The upper bound must be greater than or equal to the lower bound.
	 * (upperBound()->notEmpty() and lowerBound()->notEmpty()) implies upperBound() >= lowerBound()
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUpperGeLower(
			MultiplicityElement multiplicityElement,
			DiagnosticChain diagnostics, Map context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics
					.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						UMLValidator.DIAGNOSTIC_SOURCE,
						UMLValidator.MULTIPLICITY_ELEMENT__UPPER_GE_LOWER,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateUpperGeLower", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(multiplicityElement, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{multiplicityElement}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If a non-literal ValueSpecification is used for the lower or upper bound, then evaluating that specification must not have side effects.
	 * true
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateValueSpecificationNoSideEffects(
			MultiplicityElement multiplicityElement,
			DiagnosticChain diagnostics, Map context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics
					.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						UMLValidator.DIAGNOSTIC_SOURCE,
						UMLValidator.MULTIPLICITY_ELEMENT__VALUE_SPECIFICATION_NO_SIDE_EFFECTS,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateValueSpecificationNoSideEffects", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(multiplicityElement, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{multiplicityElement}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If a non-literal ValueSpecification is used for the lower or upper bound, then that specification must be a constant expression.
	 * true
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateValueSpecificationConstant(
			MultiplicityElement multiplicityElement,
			DiagnosticChain diagnostics, Map context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics
					.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						UMLValidator.DIAGNOSTIC_SOURCE,
						UMLValidator.MULTIPLICITY_ELEMENT__VALUE_SPECIFICATION_CONSTANT,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateValueSpecificationConstant", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(multiplicityElement, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{multiplicityElement}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The derived lower attribute must equal the lowerBound.
	 * result = lowerBound()
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static int getLower(MultiplicityElement multiplicityElement) {
		return multiplicityElement.lowerBound();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The derived upper attribute must equal the upperBound.
	 * result = upperBound()
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static int getUpper(MultiplicityElement multiplicityElement) {
		return multiplicityElement.upperBound();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query isMultivalued() checks whether this multiplicity has an upper bound greater than one.
	 * upperBound()->notEmpty()
	 * result = upperBound() > 1
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean isMultivalued(MultiplicityElement multiplicityElement) {
		int upperBound = multiplicityElement.upperBound();
		return upperBound == LiteralUnlimitedNatural.UNLIMITED
			|| upperBound > 1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query includesCardinality() checks whether the specified cardinality is valid for this multiplicity.
	 * upperBound()->notEmpty() and lowerBound()->notEmpty()
	 * result = (lowerBound() <= C) and (upperBound() >= C)
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean includesCardinality(
			MultiplicityElement multiplicityElement, int C) {

		if (C == LiteralUnlimitedNatural.UNLIMITED) {
			return multiplicityElement.upperBound() == LiteralUnlimitedNatural.UNLIMITED;
		} else {

			if (multiplicityElement.lowerBound() <= C) {
				int upperBound = multiplicityElement.upperBound();
				return upperBound == LiteralUnlimitedNatural.UNLIMITED
					? true
					: upperBound >= C;
			} else {
				return false;
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query includesMultiplicity() checks whether this multiplicity includes all the cardinalities allowed by the specified multiplicity.
	 * self.upperBound()->notEmpty() and self.lowerBound()->notEmpty()
	 * and M.upperBound()->notEmpty() and M.lowerBound()->notEmpty()
	 * 
	 * result = (self.lowerBound() <= M.lowerBound()) and (self.upperBound() >= M.upperBound())
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean includesMultiplicity(
			MultiplicityElement multiplicityElement, MultiplicityElement M) {

		if (multiplicityElement.lowerBound() <= M.lowerBound()) {
			int upperBound = multiplicityElement.upperBound();

			if (upperBound == LiteralUnlimitedNatural.UNLIMITED) {
				return true;
			} else {
				int mUpperBound = M.upperBound();
				return mUpperBound == LiteralUnlimitedNatural.UNLIMITED
					? false
					: upperBound >= mUpperBound;
			}
		} else {
			return false;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query lowerBound() returns the lower bound of the multiplicity as an integer.
	 * result = if lowerValue->isEmpty() then 1 else lowerValue.integerValue() endif
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static int lowerBound(MultiplicityElement multiplicityElement) {
		ValueSpecification lowerValue = multiplicityElement.getLowerValue();

		if (lowerValue instanceof LiteralInteger) {
			return lowerValue.integerValue();
		} else {
			BasicEObjectImpl basicEObjectImpl = (BasicEObjectImpl) multiplicityElement;
			return ((Integer) basicEObjectImpl
				.eVirtualGet(
					basicEObjectImpl
						.eDerivedStructuralFeatureID(UMLPackage.Literals.MULTIPLICITY_ELEMENT__LOWER),
					new Integer(1))).intValue();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query upperBound() returns the upper bound of the multiplicity for a bounded multiplicity as an unlimited natural.
	 * result = if upperValue->isEmpty() then 1 else upperValue.unlimitedValue() endif
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static int upperBound(MultiplicityElement multiplicityElement) {
		ValueSpecification upperValue = multiplicityElement.getUpperValue();

		if (upperValue instanceof LiteralUnlimitedNatural) {
			return upperValue.unlimitedValue();
		} else {
			BasicEObjectImpl basicEObjectImpl = (BasicEObjectImpl) multiplicityElement;
			return ((Integer) basicEObjectImpl
				.eVirtualGet(
					basicEObjectImpl
						.eDerivedStructuralFeatureID(UMLPackage.Literals.MULTIPLICITY_ELEMENT__UPPER),
					new Integer(1))).intValue();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static void setLower(MultiplicityElement multiplicityElement,
			int newLower) {
		ValueSpecification lowerValue = multiplicityElement.getLowerValue();

		if (lowerValue != null) {

			if (lowerValue instanceof LiteralInteger) {
				((LiteralInteger) lowerValue).setValue(newLower);
			} else {
				throw new IllegalArgumentException(String.valueOf(newLower));
			}
		} else {
			BasicEObjectImpl basicEObjectImpl = (BasicEObjectImpl) multiplicityElement;
			basicEObjectImpl
				.eVirtualSet(
					basicEObjectImpl
						.eDerivedStructuralFeatureID(UMLPackage.Literals.MULTIPLICITY_ELEMENT__LOWER),
					new Integer(newLower));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static void setUpper(MultiplicityElement multiplicityElement,
			int newUpper) {
		ValueSpecification upperValue = multiplicityElement.getUpperValue();

		if (upperValue != null) {

			if (upperValue instanceof LiteralUnlimitedNatural) {
				((LiteralUnlimitedNatural) upperValue).setValue(newUpper);
			} else {
				throw new IllegalArgumentException(String.valueOf(newUpper));
			}
		} else {
			BasicEObjectImpl basicEObjectImpl = (BasicEObjectImpl) multiplicityElement;
			basicEObjectImpl
				.eVirtualSet(
					basicEObjectImpl
						.eDerivedStructuralFeatureID(UMLPackage.Literals.MULTIPLICITY_ELEMENT__UPPER),
					new Integer(newUpper));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static boolean isSetLower(MultiplicityElement multiplicityElement) {
		BasicEObjectImpl basicEObjectImpl = (BasicEObjectImpl) multiplicityElement;
		return basicEObjectImpl
			.eVirtualIsSet(basicEObjectImpl
				.eDerivedStructuralFeatureID(UMLPackage.Literals.MULTIPLICITY_ELEMENT__LOWER));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static void unsetLower(MultiplicityElement multiplicityElement) {
		BasicEObjectImpl basicEObjectImpl = (BasicEObjectImpl) multiplicityElement;
		basicEObjectImpl
			.eVirtualUnset(basicEObjectImpl
				.eDerivedStructuralFeatureID(UMLPackage.Literals.MULTIPLICITY_ELEMENT__LOWER));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static boolean isSetUpper(MultiplicityElement multiplicityElement) {
		BasicEObjectImpl basicEObjectImpl = (BasicEObjectImpl) multiplicityElement;
		return basicEObjectImpl
			.eVirtualIsSet(basicEObjectImpl
				.eDerivedStructuralFeatureID(UMLPackage.Literals.MULTIPLICITY_ELEMENT__UPPER));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static void unsetUpper(MultiplicityElement multiplicityElement) {
		BasicEObjectImpl basicEObjectImpl = (BasicEObjectImpl) multiplicityElement;
		basicEObjectImpl
			.eVirtualUnset(basicEObjectImpl
				.eDerivedStructuralFeatureID(UMLPackage.Literals.MULTIPLICITY_ELEMENT__UPPER));
	}

} // MultiplicityElementOperations