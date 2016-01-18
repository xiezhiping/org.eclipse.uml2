/*
 * Copyright (c) 2005, 2016 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 327039, 351774, 418466, 451350, 485756
 *
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.uml2.uml.CombinedFragment;
import org.eclipse.uml2.uml.InteractionOperatorKind;
import org.eclipse.uml2.uml.UMLPlugin;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Combined Fragment</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.CombinedFragment#validateBreak(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Break</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.CombinedFragment#validateConsiderAndIgnore(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consider And Ignore</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.CombinedFragment#validateOptLoopBreakNeg(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Opt Loop Break Neg</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CombinedFragmentOperations
		extends NamedElementOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CombinedFragmentOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the interactionOperator is opt, loop, break, assert or neg, there must be exactly one operand.
	 * (interactionOperator =  InteractionOperatorKind::opt or interactionOperator = InteractionOperatorKind::loop or
	 * interactionOperator = InteractionOperatorKind::break or interactionOperator = InteractionOperatorKind::assert or
	 * interactionOperator = InteractionOperatorKind::neg)
	 * implies operand->size()=1
	 * @param combinedFragment The receiving '<em><b>Combined Fragment</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean validateOptLoopBreakNeg(
			CombinedFragment combinedFragment, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		switch (combinedFragment.getInteractionOperator().getValue()) {
			case InteractionOperatorKind.OPT :
			case InteractionOperatorKind.BREAK :
			case InteractionOperatorKind.LOOP :
			case InteractionOperatorKind.NEG :
			case InteractionOperatorKind.ASSERT :
				if (combinedFragment.getOperands().size() != 1) {

					if (diagnostics != null) {
						diagnostics.add(new BasicDiagnostic(Diagnostic.WARNING,
							UMLValidator.DIAGNOSTIC_SOURCE,
							UMLValidator.COMBINED_FRAGMENT__OPT_LOOP_BREAK_NEG,
							UMLPlugin.INSTANCE.getString(
								"_UI_CombinedFragment_OptLoopBreakNeg_diagnostic", //$NON-NLS-1$
								getMessageSubstitutions(context,
									combinedFragment)),
							new Object[]{combinedFragment}));
					}

					return false;
				}
		}

		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the interactionOperator is break, the corresponding InteractionOperand must cover all Lifelines covered by the enclosing InteractionFragment.
	 * interactionOperator=InteractionOperatorKind::break  implies   
	 * enclosingInteraction.oclAsType(InteractionFragment)->asSet()->union(
	 *    enclosingOperand.oclAsType(InteractionFragment)->asSet()).covered->asSet() = self.covered->asSet()
	 * @param combinedFragment The receiving '<em><b>Combined Fragment</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateBreak(CombinedFragment combinedFragment,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.COMBINED_FRAGMENT__BREAK,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateBreak", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(combinedFragment, context)}),
					new Object[]{combinedFragment}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The interaction operators 'consider' and 'ignore' can only be used for the ConsiderIgnoreFragment subtype of CombinedFragment
	 * ((interactionOperator = InteractionOperatorKind::consider) or (interactionOperator =  InteractionOperatorKind::ignore)) implies oclIsKindOf(ConsiderIgnoreFragment)
	 * @param combinedFragment The receiving '<em><b>Combined Fragment</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsiderAndIgnore(
			CombinedFragment combinedFragment, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.COMBINED_FRAGMENT__CONSIDER_AND_IGNORE,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateConsiderAndIgnore", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(combinedFragment, context)}),
					new Object[]{combinedFragment}));
			}
			return false;
		}
		return true;
	}

} // CombinedFragmentOperations