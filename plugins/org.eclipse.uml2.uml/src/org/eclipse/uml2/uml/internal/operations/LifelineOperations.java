/*
 * Copyright (c) 2005, 2016 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 327039, 351774, 418466, 433194, 451350, 485756
 *
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.uml2.uml.Lifeline;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Lifeline</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Lifeline#validateSelectorSpecified(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Selector Specified</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Lifeline#validateInteractionUsesShareLifeline(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Interaction Uses Share Lifeline</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Lifeline#validateSameClassifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Same Classifier</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Lifeline#validateSelectorIntOrString(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Selector Int Or String</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LifelineOperations
		extends NamedElementOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LifelineOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If a lifeline is in an Interaction referred to by an InteractionUse in an enclosing Interaction,  and that lifeline is common with another lifeline in an Interaction referred to by another InteractonUse within that same enclosing Interaction, it must be common to a lifeline within that enclosing Interaction. By common Lifelines we mean Lifelines with the same selector and represents associations.
	 * let intUses : Set(InteractionUse) = interaction.interactionUse  in 
	 * intUses->forAll
	 * ( iuse : InteractionUse | 
	 * let usingInteraction : Set(Interaction)  = iuse.enclosingInteraction->asSet()
	 * ->union(
	 * iuse.enclosingOperand.combinedFragment->asSet()->closure(enclosingOperand.combinedFragment).enclosingInteraction->asSet()
	 *                ) 
	 * in
	 * let peerUses : Set(InteractionUse) = usingInteraction.fragment->select(oclIsKindOf(InteractionUse)).oclAsType(InteractionUse)->asSet()
	 * ->union(
	 * usingInteraction.fragment->select(oclIsKindOf(CombinedFragment)).oclAsType(CombinedFragment)->asSet()
	 * ->closure(operand.fragment->select(oclIsKindOf(CombinedFragment)).oclAsType(CombinedFragment)).operand.fragment->
	 * select(oclIsKindOf(InteractionUse)).oclAsType(InteractionUse)->asSet()
	 *                )->excluding(iuse)
	 *  in
	 * peerUses->forAll( peerUse : InteractionUse |
	 *  peerUse.refersTo.lifeline->forAll( l : Lifeline | (l.represents = self.represents and 
	 *  ( self.selector.oclIsKindOf(LiteralString) implies
	 *   l.selector.oclIsKindOf(LiteralString) and 
	 *   self.selector.oclAsType(LiteralString).value = l.selector.oclAsType(LiteralString).value )
	 *   and 
	 * ( self.selector.oclIsKindOf(LiteralInteger) implies
	 *   l.selector.oclIsKindOf(LiteralInteger) and 
	 *   self.selector.oclAsType(LiteralInteger).value = l.selector.oclAsType(LiteralInteger).value )
	 * )  
	 * implies
	 *  usingInteraction.lifeline->exists(represents = self.represents and
	 *  ( self.selector.oclIsKindOf(LiteralString) implies
	 *   l.selector.oclIsKindOf(LiteralString) and 
	 *   self.selector.oclAsType(LiteralString).value = l.selector.oclAsType(LiteralString).value )
	 * and 
	 * ( self.selector.oclIsKindOf(LiteralInteger) implies
	 *   l.selector.oclIsKindOf(LiteralInteger) and 
	 *   self.selector.oclAsType(LiteralInteger).value = l.selector.oclAsType(LiteralInteger).value )
	 * )
	 *                                                 )
	 *                     )
	 * )
	 * @param lifeline The receiving '<em><b>Lifeline</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateInteractionUsesShareLifeline(
			Lifeline lifeline, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.LIFELINE__INTERACTION_USES_SHARE_LIFELINE,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateInteractionUsesShareLifeline", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(lifeline, context)}),
					new Object[]{lifeline}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The selector for a Lifeline must only be specified if the referenced Part is multivalued.
	 *  self.selector->notEmpty() = (self.represents.oclIsKindOf(MultiplicityElement) and self.represents.oclAsType(MultiplicityElement).isMultivalued())
	 * @param lifeline The receiving '<em><b>Lifeline</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateSelectorSpecified(Lifeline lifeline,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.LIFELINE__SELECTOR_SPECIFIED,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateSelectorSpecified", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(lifeline, context)}),
					new Object[]{lifeline}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The classifier containing the referenced ConnectableElement must be the same classifier, or an ancestor, of the classifier that contains the interaction enclosing this lifeline.
	 * represents.namespace->closure(namespace)->includes(interaction._'context')
	 * @param lifeline The receiving '<em><b>Lifeline</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateSameClassifier(Lifeline lifeline,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.LIFELINE__SAME_CLASSIFIER,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateSameClassifier", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(lifeline, context)}),
					new Object[]{lifeline}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The selector value, if present, must be a LiteralString or a LiteralInteger
	 * self.selector->notEmpty() implies 
	 * self.selector.oclIsKindOf(LiteralInteger) or 
	 * self.selector.oclIsKindOf(LiteralString)
	 * @param lifeline The receiving '<em><b>Lifeline</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateSelectorIntOrString(Lifeline lifeline,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.LIFELINE__SELECTOR_INT_OR_STRING,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateSelectorIntOrString", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(lifeline, context)}),
					new Object[]{lifeline}));
			}
			return false;
		}
		return true;
	}

} // LifelineOperations