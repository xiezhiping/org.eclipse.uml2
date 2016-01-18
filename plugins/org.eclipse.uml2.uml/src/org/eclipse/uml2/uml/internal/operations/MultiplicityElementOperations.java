/*
 * Copyright (c) 2005, 2016 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 327039, 351774, 418466, 451350, 480914, 485756
 *
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.uml2.uml.LiteralInteger;
import org.eclipse.uml2.uml.LiteralUnlimitedNatural;
import org.eclipse.uml2.uml.MultiplicityElement;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.UMLPlugin;
import org.eclipse.uml2.uml.ValueSpecification;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Multiplicity Element</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.MultiplicityElement#validateUpperGeLower(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Upper Ge Lower</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.MultiplicityElement#validateLowerGe0(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Lower Ge0</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.MultiplicityElement#validateValueSpecificationNoSideEffects(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Value Specification No Side Effects</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.MultiplicityElement#validateValueSpecificationConstant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Value Specification Constant</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.MultiplicityElement#validateLowerIsInteger(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Lower Is Integer</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.MultiplicityElement#validateUpperIsUnlimitedNatural(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Upper Is Unlimited Natural</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.MultiplicityElement#setLower(int) <em>Set Lower</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.MultiplicityElement#setUpper(int) <em>Set Upper</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.MultiplicityElement#compatibleWith(org.eclipse.uml2.uml.MultiplicityElement) <em>Compatible With</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.MultiplicityElement#includesMultiplicity(org.eclipse.uml2.uml.MultiplicityElement) <em>Includes Multiplicity</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.MultiplicityElement#is(int, int) <em>Is</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.MultiplicityElement#isMultivalued() <em>Is Multivalued</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.MultiplicityElement#getLower() <em>Get Lower</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.MultiplicityElement#lowerBound() <em>Lower Bound</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.MultiplicityElement#getUpper() <em>Get Upper</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.MultiplicityElement#upperBound() <em>Upper Bound</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MultiplicityElementOperations
		extends ElementOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultiplicityElementOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The lower bound must be a non-negative integer literal.
	 * lowerBound() >= 0
	 * @param multiplicityElement The receiving '<em><b>Multiplicity Element</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean validateLowerGe0(
			MultiplicityElement multiplicityElement,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;

		int lowerBound = multiplicityElement.lowerBound();

		if (lowerBound < 0) {
			result = false;

			if (diagnostics != null) {
				diagnostics
					.add(new BasicDiagnostic(Diagnostic.WARNING,
						UMLValidator.DIAGNOSTIC_SOURCE,
						UMLValidator.MULTIPLICITY_ELEMENT__LOWER_GE0,
						UMLPlugin.INSTANCE.getString(
							"_UI_MultiplicityElement_LowerGE0_diagnostic", //$NON-NLS-1$
							getMessageSubstitutions(context,
								multiplicityElement)),
					new Object[]{multiplicityElement,
						new Integer(lowerBound)}));
			}
		}

		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The upper bound must be greater than or equal to the lower bound.
	 * upperBound() >= lowerBound()
	 * @param multiplicityElement The receiving '<em><b>Multiplicity Element</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean validateUpperGeLower(
			MultiplicityElement multiplicityElement,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;

		int upperBound = 1;
		ValueSpecification upperValue = multiplicityElement.getUpperValue();

		if (upperValue != null) {

			try {
				upperBound = upperValue.unlimitedValue();
			} catch (UnsupportedOperationException uoe) {
				return result;
			}
		}

		if (upperBound != LiteralUnlimitedNatural.UNLIMITED) {
			int lowerBound = 1;
			ValueSpecification lowerValue = multiplicityElement.getLowerValue();

			if (lowerValue != null) {

				try {
					lowerBound = lowerValue.integerValue();
				} catch (UnsupportedOperationException uoe) {
					return result;
				}
			}

			if (upperBound < lowerBound) {
				result = false;

				if (diagnostics != null) {
					diagnostics.add(new BasicDiagnostic(Diagnostic.WARNING,
						UMLValidator.DIAGNOSTIC_SOURCE,
						UMLValidator.MULTIPLICITY_ELEMENT__UPPER_GE_LOWER,
						UMLPlugin.INSTANCE.getString(
							"_UI_MultiplicityElement_UpperGELower_diagnostic", //$NON-NLS-1$
							getMessageSubstitutions(context,
								multiplicityElement)),
						new Object[]{multiplicityElement,
							new Integer(upperBound)}));
				}
			}
		}

		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If a non-literal ValueSpecification is used for lowerValue or upperValue, then evaluating that specification must not have side effects.
	 * @param multiplicityElement The receiving '<em><b>Multiplicity Element</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateValueSpecificationNoSideEffects(
			MultiplicityElement multiplicityElement,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.MULTIPLICITY_ELEMENT__VALUE_SPECIFICATION_NO_SIDE_EFFECTS,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateValueSpecificationNoSideEffects", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(multiplicityElement, context)}),
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
	 * If a non-literal ValueSpecification is used for lowerValue or upperValue, then that specification must be a constant expression.
	 * @param multiplicityElement The receiving '<em><b>Multiplicity Element</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateValueSpecificationConstant(
			MultiplicityElement multiplicityElement,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.MULTIPLICITY_ELEMENT__VALUE_SPECIFICATION_CONSTANT,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateValueSpecificationConstant", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(multiplicityElement, context)}),
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
	 * If it is not empty, then lowerValue must have an Integer value.
	 * lowerValue <> null implies lowerValue.integerValue() <> null
	 * @param multiplicityElement The receiving '<em><b>Multiplicity Element</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateLowerIsInteger(
			MultiplicityElement multiplicityElement,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.MULTIPLICITY_ELEMENT__LOWER_IS_INTEGER,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateLowerIsInteger", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(multiplicityElement, context)}),
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
	 * If it is not empty, then upperValue must have an UnlimitedNatural value.
	 * upperValue <> null implies upperValue.unlimitedValue() <> null
	 * @param multiplicityElement The receiving '<em><b>Multiplicity Element</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUpperIsUnlimitedNatural(
			MultiplicityElement multiplicityElement,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.MULTIPLICITY_ELEMENT__UPPER_IS_UNLIMITED_NATURAL,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateUpperIsUnlimitedNatural", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(multiplicityElement, context)}),
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
	 * result = (lowerBound())
	 * <p>From package UML::CommonStructure.</p>
	 * @param multiplicityElement The receiving '<em><b>Multiplicity Element</b></em>' model object.
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
	 * result = (upperBound())
	 * <p>From package UML::CommonStructure.</p>
	 * @param multiplicityElement The receiving '<em><b>Multiplicity Element</b></em>' model object.
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
	 * result = (upperBound() > 1)
	 * <p>From package UML::CommonStructure.</p>
	 * @param multiplicityElement The receiving '<em><b>Multiplicity Element</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean isMultivalued(
			MultiplicityElement multiplicityElement) {
		int upperBound = multiplicityElement.upperBound();
		return upperBound == LiteralUnlimitedNatural.UNLIMITED
			|| upperBound > 1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query includesMultiplicity() checks whether this multiplicity includes all the cardinalities allowed by the specified multiplicity.
	 * self.upperBound()->notEmpty() and self.lowerBound()->notEmpty() and M.upperBound()->notEmpty() and M.lowerBound()->notEmpty()
	 * result = ((self.lowerBound() <= M.lowerBound()) and (self.upperBound() >= M.upperBound()))
	 * <p>From package UML::CommonStructure.</p>
	 * @param multiplicityElement The receiving '<em><b>Multiplicity Element</b></em>' model object.
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
	 * The query lowerBound() returns the lower bound of the multiplicity as an integer, which is the integerValue of lowerValue, if this is given, and 1 otherwise.
	 * result = (if (lowerValue=null or lowerValue.integerValue()=null) then 1 else lowerValue.integerValue() endif)
	 * <p>From package UML::CommonStructure.</p>
	 * @param multiplicityElement The receiving '<em><b>Multiplicity Element</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static int lowerBound(MultiplicityElement multiplicityElement) {
		ValueSpecification lowerValue = multiplicityElement.getLowerValue();

		if (lowerValue != null) {

			try {
				return lowerValue.integerValue();
			} catch (UnsupportedOperationException uoe) {
				// do nothing
			}
		}

		return 1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query upperBound() returns the upper bound of the multiplicity for a bounded multiplicity as an unlimited natural, which is the unlimitedNaturalValue of upperValue, if given, and 1, otherwise.
	 * result = (if (upperValue=null or upperValue.unlimitedValue()=null) then 1 else upperValue.unlimitedValue() endif)
	 * <p>From package UML::CommonStructure.</p>
	 * @param multiplicityElement The receiving '<em><b>Multiplicity Element</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static int upperBound(MultiplicityElement multiplicityElement) {
		ValueSpecification upperValue = multiplicityElement.getUpperValue();

		if (upperValue != null) {

			try {
				return upperValue.unlimitedValue();
			} catch (UnsupportedOperationException uoe) {
				// do nothing
			}
		}

		return 1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The operation compatibleWith takes another multiplicity as input. It returns true if the other multiplicity is wider than, or the same as, self.
	 * result = ((other.lowerBound() <= self.lowerBound()) and ((other.upperBound() = *) or (self.upperBound() <= other.upperBound())))
	 * <p>From package UML::CommonStructure.</p>
	 * @param multiplicityElement The receiving '<em><b>Multiplicity Element</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean compatibleWith(
			MultiplicityElement multiplicityElement,
			MultiplicityElement other) {
		return other != null && other.includesMultiplicity(multiplicityElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The operation is determines if the upper and lower bound of the ranges are the ones given.
	 * result = (lowerbound = self.lowerBound() and upperbound = self.upperBound())
	 * <p>From package UML::CommonStructure.</p>
	 * @param multiplicityElement The receiving '<em><b>Multiplicity Element</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean is(MultiplicityElement multiplicityElement,
			int lowerbound, int upperbound) {
		return multiplicityElement.lowerBound() == lowerbound
			&& multiplicityElement.upperBound() == upperbound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static void setLower(MultiplicityElement multiplicityElement,
			int newLower) {
		ValueSpecification lowerValue = multiplicityElement.getLowerValue();

		((LiteralInteger) (lowerValue instanceof LiteralInteger
			? lowerValue
			: multiplicityElement.createLowerValue(null, null,
				UMLPackage.Literals.LITERAL_INTEGER))).setValue(newLower);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static void setUpper(MultiplicityElement multiplicityElement,
			int newUpper) {
		ValueSpecification upperValue = multiplicityElement.getUpperValue();

		((LiteralUnlimitedNatural) (upperValue instanceof LiteralUnlimitedNatural
			? upperValue
			: multiplicityElement.createUpperValue(null, null,
				UMLPackage.Literals.LITERAL_UNLIMITED_NATURAL)))
					.setValue(newUpper);
	}

} // MultiplicityElementOperations