/*
 * Copyright (c) 2005, 2016 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 327039, 418466, 451350, 485756
 *
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Gate;

import org.eclipse.uml2.uml.CombinedFragment;
import org.eclipse.uml2.uml.InteractionFragment;
import org.eclipse.uml2.uml.InteractionOperand;
import org.eclipse.uml2.uml.Message;
import org.eclipse.uml2.uml.MessageEnd;
import org.eclipse.uml2.uml.MessageOccurrenceSpecification;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Gate</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Gate#validateActualGateMatched(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Actual Gate Matched</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Gate#validateInsideCfMatched(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inside Cf Matched</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Gate#validateOutsideCfMatched(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outside Cf Matched</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Gate#validateFormalGateDistinguishable(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Formal Gate Distinguishable</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Gate#validateActualGateDistinguishable(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Actual Gate Distinguishable</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Gate#validateOutsideCfGateDistinguishable(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outside Cf Gate Distinguishable</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Gate#validateInsideCfGateDistinguishable(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inside Cf Gate Distinguishable</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Gate#isOutsideCF() <em>Is Outside CF</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Gate#isInsideCF() <em>Is Inside CF</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Gate#isActual() <em>Is Actual</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Gate#isFormal() <em>Is Formal</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Gate#getName() <em>Get Name</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Gate#matches(org.eclipse.uml2.uml.Gate) <em>Matches</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Gate#getOperand() <em>Get Operand</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Gate#isDistinguishableFrom(org.eclipse.uml2.uml.NamedElement, org.eclipse.uml2.uml.Namespace) <em>Is Distinguishable From</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GateOperations
		extends MessageEndOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GateOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If this Gate is an actualGate, it must have exactly one matching formalGate within the referred Interaction.
	 * interactionUse->notEmpty() implies interactionUse.refersTo.formalGate->select(matches(self))->size()=1
	 * @param gate The receiving '<em><b>Gate</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateActualGateMatched(Gate gate,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.GATE__ACTUAL_GATE_MATCHED,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateActualGateMatched", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(gate, context)}),
					new Object[]{gate}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If this Gate is inside a CombinedFragment, it must have exactly one matching Gate which is outside of that CombinedFragment.
	 * isInsideCF() implies combinedFragment.cfragmentGate->select(isOutsideCF() and matches(self))->size()=1
	 * @param gate The receiving '<em><b>Gate</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateInsideCfMatched(Gate gate,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.GATE__INSIDE_CF_MATCHED,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateInsideCfMatched", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(gate, context)}),
					new Object[]{gate}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If this Gate is outside an 'alt' CombinedFragment,  for every InteractionOperator inside that CombinedFragment there must be exactly one matching Gate inside the CombindedFragment with its opposing end enclosed by that InteractionOperator. If this Gate is outside CombinedFragment with operator other than 'alt',   there must be exactly one matching Gate inside that CombinedFragment.
	 * isOutsideCF() implies
	 *  if self.combinedFragment.interactionOperator->asOrderedSet()->first() = InteractionOperatorKind::alt
	 *  then self.combinedFragment.operand->forAll(op : InteractionOperand |
	 *  self.combinedFragment.cfragmentGate->select(isInsideCF() and 
	 *  oppositeEnd().enclosingFragment()->includes(self.combinedFragment) and matches(self))->size()=1)
	 *  else  self.combinedFragment.cfragmentGate->select(isInsideCF() and matches(self))->size()=1
	 *  endif
	 * @param gate The receiving '<em><b>Gate</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateOutsideCfMatched(Gate gate,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.GATE__OUTSIDE_CF_MATCHED,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateOutsideCfMatched", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(gate, context)}),
					new Object[]{gate}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * isFormal() implies that no other formalGate of the parent Interaction returns the same getName() as returned for self
	 * isFormal() implies interaction.formalGate->select(getName() = self.getName())->size()=1
	 * @param gate The receiving '<em><b>Gate</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateFormalGateDistinguishable(Gate gate,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.GATE__FORMAL_GATE_DISTINGUISHABLE,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateFormalGateDistinguishable", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(gate, context)}),
					new Object[]{gate}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * isActual() implies that no other actualGate of the parent InteractionUse returns the same getName() as returned for self
	 * isActual() implies interactionUse.actualGate->select(getName() = self.getName())->size()=1
	 * @param gate The receiving '<em><b>Gate</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateActualGateDistinguishable(Gate gate,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.GATE__ACTUAL_GATE_DISTINGUISHABLE,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateActualGateDistinguishable", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(gate, context)}),
					new Object[]{gate}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * isOutsideCF() implies that no other outside cfragmentGate of the parent CombinedFragment returns the same getName() as returned for self
	 * isOutsideCF() implies combinedFragment.cfragmentGate->select(getName() = self.getName())->size()=1
	 * @param gate The receiving '<em><b>Gate</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateOutsideCfGateDistinguishable(Gate gate,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.GATE__OUTSIDE_CF_GATE_DISTINGUISHABLE,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateOutsideCfGateDistinguishable", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(gate, context)}),
					new Object[]{gate}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * isInsideCF() implies that no other inside cfragmentGate attached to a message with its other end in the same InteractionOperator as self, returns the same getName() as returned for self
	 * isInsideCF() implies
	 * let selfOperand : InteractionOperand = self.getOperand() in
	 *   combinedFragment.cfragmentGate->select(isInsideCF() and getName() = self.getName())->select(getOperand() = selfOperand)->size()=1
	 * @param gate The receiving '<em><b>Gate</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateInsideCfGateDistinguishable(Gate gate,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.GATE__INSIDE_CF_GATE_DISTINGUISHABLE,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateInsideCfGateDistinguishable", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(gate, context)}),
					new Object[]{gate}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This query returns true if this Gate is attached to the boundary of a CombinedFragment, and its other end (if present)  is outside of the same CombinedFragment.
	 * result = (self.oppositeEnd()-> notEmpty() and combinedFragment->notEmpty() implies
	 * let oppEnd : MessageEnd = self.oppositeEnd()->asOrderedSet()->first() in
	 * if oppEnd.oclIsKindOf(MessageOccurrenceSpecification) 
	 * then let oppMOS : MessageOccurrenceSpecification = oppEnd.oclAsType(MessageOccurrenceSpecification)
	 * in  self.combinedFragment.enclosingInteraction.oclAsType(InteractionFragment)->asSet()->
	 *      union(self.combinedFragment.enclosingOperand.oclAsType(InteractionFragment)->asSet()) =
	 *      oppMOS.enclosingInteraction.oclAsType(InteractionFragment)->asSet()->
	 *      union(oppMOS.enclosingOperand.oclAsType(InteractionFragment)->asSet())
	 * else let oppGate : Gate = oppEnd.oclAsType(Gate) 
	 * in self.combinedFragment.enclosingInteraction.oclAsType(InteractionFragment)->asSet()->
	 *      union(self.combinedFragment.enclosingOperand.oclAsType(InteractionFragment)->asSet()) =
	 *      oppGate.combinedFragment.enclosingInteraction.oclAsType(InteractionFragment)->asSet()->
	 *      union(oppGate.combinedFragment.enclosingOperand.oclAsType(InteractionFragment)->asSet())
	 * endif)
	 * <p>From package UML::Interactions.</p>
	 * @param gate The receiving '<em><b>Gate</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean isOutsideCF(Gate gate) {
		EList<MessageEnd> oppositeEnd = gate.oppositeEnd();
		EObject eContainer = gate.eContainer();

		if (oppositeEnd.size() > 0 && eContainer instanceof CombinedFragment) {
			MessageEnd oppEnd = oppositeEnd.get(0);
			CombinedFragment combinedFragment = (CombinedFragment) eContainer;

			EList<InteractionFragment> cfFragments = new UniqueEList.FastCompare<InteractionFragment>();

			InteractionFragment cfEnclosingInteraction = combinedFragment
				.getEnclosingInteraction();

			if (cfEnclosingInteraction != null) {
				cfFragments.add(cfEnclosingInteraction);
			}

			InteractionFragment cfEnclosingOperand = combinedFragment
				.getEnclosingOperand();

			if (cfEnclosingOperand != null) {
				cfFragments.add(cfEnclosingOperand);
			}

			EList<InteractionFragment> oppFragments = new UniqueEList.FastCompare<InteractionFragment>();

			if (oppEnd instanceof MessageOccurrenceSpecification) {
				MessageOccurrenceSpecification oppMOS = (MessageOccurrenceSpecification) oppEnd;

				InteractionFragment oppEnclosingInteraction = oppMOS
					.getEnclosingInteraction();

				if (oppEnclosingInteraction != null) {
					oppFragments.add(oppEnclosingInteraction);
				}

				InteractionFragment oppEnclosingOperand = oppMOS
					.getEnclosingOperand();

				if (oppEnclosingOperand != null) {
					oppFragments.add(oppEnclosingOperand);
				}
			} else if (oppEnd instanceof Gate) {
				EObject oppGateEContainer = oppEnd.eContainer();

				if (oppGateEContainer instanceof CombinedFragment) {
					CombinedFragment oppGateCF = (CombinedFragment) oppGateEContainer;

					InteractionFragment oppEnclosingInteraction = oppGateCF
						.getEnclosingInteraction();

					if (oppEnclosingInteraction != null) {
						oppFragments.add(oppEnclosingInteraction);
					}

					InteractionFragment oppEnclosingOperand = oppGateCF
						.getEnclosingOperand();

					if (oppEnclosingOperand != null) {
						oppFragments.add(oppEnclosingOperand);
					}
				}
			}

			return cfFragments.equals(oppFragments);
		}

		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This query returns true if this Gate is attached to the boundary of a CombinedFragment, and its other end (if present) is inside of an InteractionOperator of the same CombinedFragment.
	 * result = (self.oppositeEnd()-> notEmpty() and combinedFragment->notEmpty() implies
	 * let oppEnd : MessageEnd = self.oppositeEnd()->asOrderedSet()->first() in
	 * if oppEnd.oclIsKindOf(MessageOccurrenceSpecification)
	 * then let oppMOS : MessageOccurrenceSpecification
	 * = oppEnd.oclAsType(MessageOccurrenceSpecification)
	 * in combinedFragment = oppMOS.enclosingOperand.combinedFragment
	 * else let oppGate : Gate = oppEnd.oclAsType(Gate)
	 * in combinedFragment = oppGate.combinedFragment.enclosingOperand.combinedFragment
	 * endif)
	 * <p>From package UML::Interactions.</p>
	 * @param gate The receiving '<em><b>Gate</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean isInsideCF(Gate gate) {
		EList<MessageEnd> oppositeEnd = gate.oppositeEnd();
		EObject eContainer = gate.eContainer();

		if (oppositeEnd.size() > 0 && eContainer instanceof CombinedFragment) {
			MessageEnd oppEnd = oppositeEnd.get(0);
			CombinedFragment combinedFragment = (CombinedFragment) eContainer;

			if (oppEnd instanceof MessageOccurrenceSpecification) {
				InteractionFragment oppEnclosingOperand = ((MessageOccurrenceSpecification) oppEnd)
					.getEnclosingOperand();

				return combinedFragment == (oppEnclosingOperand == null
					? null
					: oppEnclosingOperand.eContainer());
			} else {
				EObject oppGateEContainer = oppEnd.eContainer();

				if (oppGateEContainer instanceof CombinedFragment) {
					InteractionFragment oppEnclosingOperand = ((CombinedFragment) oppGateEContainer)
						.getEnclosingOperand();

					return combinedFragment == (oppEnclosingOperand == null
						? null
						: oppEnclosingOperand.eContainer());
				}
			}
		}

		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This query returns true value if this Gate is an actualGate of an InteractionUse.
	 * result = (interactionUse->notEmpty())
	 * <p>From package UML::Interactions.</p>
	 * @param gate The receiving '<em><b>Gate</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean isActual(Gate gate) {
		return gate
			.eContainingFeature() == UMLPackage.Literals.INTERACTION_USE__ACTUAL_GATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This query returns true if this Gate is a formalGate of an Interaction.
	 * result = (interaction->notEmpty())
	 * <p>From package UML::Interactions.</p>
	 * @param gate The receiving '<em><b>Gate</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean isFormal(Gate gate) {
		return gate
			.eContainingFeature() == UMLPackage.Literals.INTERACTION__FORMAL_GATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This query returns the name of the gate, either the explicit name (.name) or the constructed name ('out_" or 'in_' concatenated in front of .message.name) if the explicit name is not present.
	 * result = (if name->notEmpty() then name->asOrderedSet()->first()
	 * else  if isActual() or isOutsideCF() 
	 *   then if isSend() 
	 *     then 'out_'.concat(self.message.name->asOrderedSet()->first())
	 *     else 'in_'.concat(self.message.name->asOrderedSet()->first())
	 *     endif
	 *   else if isSend()
	 *     then 'in_'.concat(self.message.name->asOrderedSet()->first())
	 *     else 'out_'.concat(self.message.name->asOrderedSet()->first())
	 *     endif
	 *   endif
	 * endif)
	 * <p>From package UML::Interactions.</p>
	 * @param gate The receiving '<em><b>Gate</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static String getName(Gate gate) {
		return gate.getName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This query returns true if the name of this Gate matches the name of the in parameter Gate, and the messages for the two Gates correspond. The Message for one Gate (say A) corresponds to the Message for another Gate (say B) if (A and B have the same name value) and (if A is a sendEvent then B is a receiveEvent) and (if A is a receiveEvent then B is a sendEvent) and (A and B have the same messageSort value) and (A and B have the same signature value).
	 * result = (self.getName() = gateToMatch.getName() and 
	 * self.message.messageSort = gateToMatch.message.messageSort and
	 * self.message.name = gateToMatch.message.name and
	 * self.message.sendEvent->includes(self) implies gateToMatch.message.receiveEvent->includes(gateToMatch)  and
	 * self.message.receiveEvent->includes(self) implies gateToMatch.message.sendEvent->includes(gateToMatch) and
	 * self.message.signature = gateToMatch.message.signature)
	 * <p>From package UML::Interactions.</p>
	 * @param gate The receiving '<em><b>Gate</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean matches(Gate gate, Gate gateToMatch) {

		if (safeEquals(gate.getName(), gateToMatch.getName())) {
			Message message = gate.getMessage();
			Message messageToMatch = gateToMatch.getMessage();

			if (message == null) {
				return messageToMatch == null;
			} else {
				if (messageToMatch == null) {
					return false;
				} else {
					return safeEquals(message.getMessageSort(),
						messageToMatch.getMessageSort())
						&& safeEquals(message.getName(),
							messageToMatch.getName())
						&& (message.getSendEvent() == gate
							? messageToMatch.getReceiveEvent() == gateToMatch
							: true)
						&& (message.getReceiveEvent() == gate
							? messageToMatch.getSendEvent() == gateToMatch
							: true)
						&& safeEquals(message.getSignature(),
							messageToMatch.getSignature());
				}
			}
		}

		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the Gate is an inside Combined Fragment Gate, this operation returns the InteractionOperand that the opposite end of this Gate is included within.
	 * result = (if isInsideCF() then
	 *   let oppEnd : MessageEnd = self.oppositeEnd()->asOrderedSet()->first() in
	 *     if oppEnd.oclIsKindOf(MessageOccurrenceSpecification)
	 *     then let oppMOS : MessageOccurrenceSpecification = oppEnd.oclAsType(MessageOccurrenceSpecification)
	 *         in oppMOS.enclosingOperand->asOrderedSet()->first()
	 *     else let oppGate : Gate = oppEnd.oclAsType(Gate)
	 *         in oppGate.combinedFragment.enclosingOperand->asOrderedSet()->first()
	 *     endif
	 *   else null
	 * endif)
	 * <p>From package UML::Interactions.</p>
	 * @param gate The receiving '<em><b>Gate</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static InteractionOperand getOperand(Gate gate) {

		if (gate.isInsideCF()) {
			EList<MessageEnd> oppositeEnd = gate.oppositeEnd();

			if (oppositeEnd.size() > 0) {
				MessageEnd oppEnd = oppositeEnd.get(0);

				if (oppEnd instanceof MessageOccurrenceSpecification) {
					return ((MessageOccurrenceSpecification) oppEnd)
						.getEnclosingOperand();
				} else if (oppEnd instanceof Gate) {
					EObject eContainer = oppEnd.eContainer();

					if (eContainer instanceof CombinedFragment) {
						return ((CombinedFragment) eContainer)
							.getEnclosingOperand();
					}
				}
			}
		}

		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query isDistinguishableFrom() specifies that two Gates may coexist in the same Namespace, without an explicit name property. The association end formalGate subsets ownedElement, and since the Gate name attribute
	 * is optional, it is allowed to have two formal gates without an explicit name, but having derived names which are distinct.
	 * result = (true)
	 * <p>From package UML::Interactions.</p>
	 * @param gate The receiving '<em><b>Gate</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean isDistinguishableFrom(Gate gate, NamedElement n,
			Namespace ns) {
		return true;
	}

} // GateOperations