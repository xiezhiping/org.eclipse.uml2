/*
 * Copyright (c) 2005, 2007 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: ConstraintOperations.java,v 1.7 2007/05/03 21:11:51 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.UMLPlugin;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Constraint</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Constraint#validateNotApplyToSelf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Not Apply To Self</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Constraint#validateValueSpecificationBoolean(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Value Specification Boolean</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Constraint#validateBooleanValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Boolean Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Constraint#validateNoSideEffects(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate No Side Effects</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Constraint#validateNotAppliedToSelf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Not Applied To Self</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConstraintOperations
		extends NamedElementOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstraintOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A constraint cannot be applied to itself.
	 * not constrainedElement->includes(self)
	 * @param constraint The receiving '<em><b>Constraint</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean validateNotApplyToSelf(Constraint constraint,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;

		if (constraint.getConstrainedElements().contains(constraint)) {
			result = false;

			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.WARNING,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.CONSTRAINT__NOT_APPLY_TO_SELF,
					UMLPlugin.INSTANCE.getString(
						"_UI_Constraint_NotApplyToSelf_diagnostic", //$NON-NLS-1$
						getMessageSubstitutions(context, constraint)),
					new Object[]{constraint}));
			}
		}

		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value specification for a constraint must evaluate to a Boolean value.
	 * self.specification().booleanValue().isOclKindOf(Boolean)
	 * @param constraint The receiving '<em><b>Constraint</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateValueSpecificationBoolean(
			Constraint constraint, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
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
						UMLValidator.CONSTRAINT__VALUE_SPECIFICATION_BOOLEAN,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateValueSpecificationBoolean", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(constraint, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{constraint}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value specification for a constraint must evaluate to a Boolean value.
	 * true
	 * @param constraint The receiving '<em><b>Constraint</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateBooleanValue(Constraint constraint,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						UMLValidator.CONSTRAINT__BOOLEAN_VALUE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateBooleanValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(constraint, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{constraint}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Evaluating the value specification for a constraint must not have side effects.
	 * true
	 * @param constraint The receiving '<em><b>Constraint</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateNoSideEffects(Constraint constraint,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						UMLValidator.CONSTRAINT__NO_SIDE_EFFECTS,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateNoSideEffects", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(constraint, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{constraint}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A constraint cannot be applied to itself.
	 * not constrainedElement->includes(self)
	 * @param constraint The receiving '<em><b>Constraint</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateNotAppliedToSelf(Constraint constraint,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						UMLValidator.CONSTRAINT__NOT_APPLIED_TO_SELF,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateNotAppliedToSelf", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(constraint, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{constraint}));
			}
			return false;
		}
		return true;
	}

} // ConstraintOperations