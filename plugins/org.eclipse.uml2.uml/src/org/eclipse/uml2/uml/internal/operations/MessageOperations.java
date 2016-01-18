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
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;

import org.eclipse.uml2.uml.Expression;
import org.eclipse.uml2.uml.Message;
import org.eclipse.uml2.uml.MessageKind;
import org.eclipse.uml2.uml.MessageSort;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Signal;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.UMLPlugin;
import org.eclipse.uml2.uml.ValueSpecification;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Message</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Message#validateSendingReceivingMessageEvent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sending Receiving Message Event</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Message#validateArguments(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Arguments</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Message#validateCannotCrossBoundaries(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cannot Cross Boundaries</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Message#validateSignatureIsSignal(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Signature Is Signal</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Message#validateOccurrenceSpecifications(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Occurrence Specifications</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Message#validateSignatureReferTo(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Signature Refer To</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Message#validateSignatureIsOperationRequest(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Signature Is Operation Request</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Message#validateSignatureIsOperationReply(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Signature Is Operation Reply</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Message#getMessageKind() <em>Get Message Kind</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Message#isDistinguishableFrom(org.eclipse.uml2.uml.NamedElement, org.eclipse.uml2.uml.Namespace) <em>Is Distinguishable From</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MessageOperations
		extends NamedElementOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the sendEvent and the receiveEvent of the same Message are on the same Lifeline, the sendEvent must be ordered before the receiveEvent.
	 * receiveEvent.oclIsKindOf(MessageOccurrenceSpecification)
	 * implies
	 * let f :  Lifeline = sendEvent->select(oclIsKindOf(MessageOccurrenceSpecification)).oclAsType(MessageOccurrenceSpecification)->asOrderedSet()->first().covered in
	 * f = receiveEvent->select(oclIsKindOf(MessageOccurrenceSpecification)).oclAsType(MessageOccurrenceSpecification)->asOrderedSet()->first().covered  implies
	 * f.events->indexOf(sendEvent.oclAsType(MessageOccurrenceSpecification)->asOrderedSet()->first() ) < 
	 * f.events->indexOf(receiveEvent.oclAsType(MessageOccurrenceSpecification)->asOrderedSet()->first() )
	 * @param message The receiving '<em><b>Message</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateSendingReceivingMessageEvent(Message message,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.MESSAGE__SENDING_RECEIVING_MESSAGE_EVENT,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateSendingReceivingMessageEvent", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(message, context)}),
					new Object[]{message}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The signature must either refer an Operation (in which case messageSort is either synchCall or asynchCall or reply) or a Signal (in which case messageSort is asynchSignal). The name of the NamedElement referenced by signature must be the same as that of the Message.
	 * signature->notEmpty() implies 
	 * ((signature.oclIsKindOf(Operation) and 
	 * (messageSort = MessageSort::asynchCall or messageSort = MessageSort::synchCall or messageSort = MessageSort::reply) 
	 * ) or (signature.oclIsKindOf(Signal)  and messageSort = MessageSort::asynchSignal )
	 *  ) and name = signature.name
	 * @param message The receiving '<em><b>Message</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateSignatureReferTo(Message message,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.MESSAGE__SIGNATURE_REFER_TO,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateSignatureReferTo", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(message, context)}),
					new Object[]{message}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In the case when a Message with messageSort synchCall or asynchCall has a non empty Operation signature, the arguments of the Message must correspond to the in and inout parameters of the Operation. A Parameter corresponds to an Argument if the Argument is of the same Class or a specialization of that of the Parameter.
	 * (messageSort = MessageSort::asynchCall or messageSort = MessageSort::synchCall) and signature.oclIsKindOf(Operation)  implies 
	 *  let requestParms : OrderedSet(Parameter) = signature.oclAsType(Operation).ownedParameter->
	 *  select(direction = ParameterDirectionKind::inout or direction = ParameterDirectionKind::_'in'  )
	 * in requestParms->size() = self.argument->size() and
	 * self.argument->forAll( o: ValueSpecification | 
	 * not (o.oclIsKindOf(Expression) and o.oclAsType(Expression).symbol->size()=0 and o.oclAsType(Expression).operand->isEmpty() ) implies 
	 * let p : Parameter = requestParms->at(self.argument->indexOf(o)) in
	 * o.type.oclAsType(Classifier).conformsTo(p.type.oclAsType(Classifier))
	 * )
	 * @param message The receiving '<em><b>Message</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateSignatureIsOperationRequest(Message message,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.MESSAGE__SIGNATURE_IS_OPERATION_REQUEST,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateSignatureIsOperationRequest", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(message, context)}),
					new Object[]{message}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In the case when a Message with messageSort reply has a non empty Operation signature, the arguments of the Message must correspond to the out, inout, and return parameters of the Operation. A Parameter corresponds to an Argument if the Argument is of the same Class or a specialization of that of the Parameter.
	 * (messageSort = MessageSort::reply) and signature.oclIsKindOf(Operation) implies 
	 *  let replyParms : OrderedSet(Parameter) = signature.oclAsType(Operation).ownedParameter->
	 * select(direction = ParameterDirectionKind::inout or direction = ParameterDirectionKind::out or direction = ParameterDirectionKind::return)
	 * in replyParms->size() = self.argument->size() and
	 * self.argument->forAll( o: ValueSpecification | o.oclIsKindOf(Expression) and let e : Expression = o.oclAsType(Expression) in
	 * e.operand->notEmpty()  implies 
	 * let p : Parameter = replyParms->at(self.argument->indexOf(o)) in
	 * e.operand->asSequence()->first().type.oclAsType(Classifier).conformsTo(p.type.oclAsType(Classifier))
	 * )
	 * @param message The receiving '<em><b>Message</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateSignatureIsOperationReply(Message message,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.MESSAGE__SIGNATURE_IS_OPERATION_REPLY,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateSignatureIsOperationReply", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(message, context)}),
					new Object[]{message}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In the case when the Message signature is a Signal, the arguments of the Message must correspond to the attributes of the Signal. A Message Argument corresponds to a Signal Attribute if the Argument is of the same Class or a specialization of that of the Attribute.
	 * (messageSort = MessageSort::asynchSignal ) and signature.oclIsKindOf(Signal) implies
	 *    let signalAttributes : OrderedSet(Property) = signature.oclAsType(Signal).inheritedMember()->
	 *              select(n:NamedElement | n.oclIsTypeOf(Property))->collect(oclAsType(Property))->asOrderedSet()
	 *    in signalAttributes->size() = self.argument->size()
	 *    and self.argument->forAll( o: ValueSpecification |
	 *           not (o.oclIsKindOf(Expression)
	 *           and o.oclAsType(Expression).symbol->size()=0
	 *           and o.oclAsType(Expression).operand->isEmpty() ) implies
	 *               let p : Property = signalAttributes->at(self.argument->indexOf(o))
	 *               in o.type.oclAsType(Classifier).conformsTo(p.type.oclAsType(Classifier)))
	 * @param message The receiving '<em><b>Message</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean validateSignatureIsSignal(Message message,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;

		if (message.getMessageSort() == MessageSort.ASYNCH_SIGNAL_LITERAL) {
			NamedElement signature = message.getSignature();

			if (signature instanceof Signal) {
				EList<ValueSpecification> arguments = message.getArguments();

				if (!arguments.isEmpty()) {
					EList<Property> signalAttributes = new UniqueEList.FastCompare<Property>();

					for (NamedElement n : ((Signal) signature)
						.getInheritedMembers()) {

						if (n instanceof Property) {
							signalAttributes.add((Property) n);
						}
					}

					if (arguments.size() != signalAttributes.size()) {
						result = false;
					} else {
						for (ValueSpecification o : arguments) {

							if (!(o instanceof Expression
								&& isEmpty(((Expression) o).getSymbol())
								&& ((Expression) o).getOperands().isEmpty())) {

								Type oType = o.getType();
								Type pType = signalAttributes
									.get(arguments.indexOf(o)).getType();

								if (oType == null
									? pType != null
									: !oType.conformsTo(pType)) {

									result = false;
									break;
								}
							}
						}
					}
				}
			}
		}

		if (!result && diagnostics != null) {
			diagnostics.add(new BasicDiagnostic(Diagnostic.WARNING,
				UMLValidator.DIAGNOSTIC_SOURCE,
				UMLValidator.MESSAGE__SIGNATURE_IS_SIGNAL,
				UMLPlugin.INSTANCE.getString(
					"_UI_Message_SignatureIsSignal_diagnostic", //$NON-NLS-1$
					getMessageSubstitutions(context, message)),
				new Object[]{message}));
		}

		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Arguments of a Message must only be: i) attributes of the sending lifeline, ii) constants, iii) symbolic values (which are wildcard values representing any legal value), iv) explicit parameters of the enclosing Interaction, v) attributes of the class owning the Interaction.
	 * @param message The receiving '<em><b>Message</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateArguments(Message message,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.MESSAGE__ARGUMENTS,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateArguments", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(message, context)}),
					new Object[]{message}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Messages cannot cross boundaries of CombinedFragments or their operands.  This is true if and only if both MessageEnds are enclosed within the same InteractionFragment (i.e., an InteractionOperand or an Interaction).
	 * sendEvent->notEmpty() and receiveEvent->notEmpty() implies
	 * let sendEnclosingFrag : Set(InteractionFragment) = 
	 * sendEvent->asOrderedSet()->first().enclosingFragment()
	 * in 
	 * let receiveEnclosingFrag : Set(InteractionFragment) = 
	 * receiveEvent->asOrderedSet()->first().enclosingFragment()
	 * in  sendEnclosingFrag = receiveEnclosingFrag
	 * @param message The receiving '<em><b>Message</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateCannotCrossBoundaries(Message message,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.MESSAGE__CANNOT_CROSS_BOUNDARIES,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateCannotCrossBoundaries", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(message, context)}),
					new Object[]{message}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the MessageEnds are both OccurrenceSpecifications, then the connector must go between the Parts represented by the Lifelines of the two MessageEnds.
	 * @param message The receiving '<em><b>Message</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateOccurrenceSpecifications(Message message,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.MESSAGE__OCCURRENCE_SPECIFICATIONS,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateOccurrenceSpecifications", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(message, context)}),
					new Object[]{message}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This query returns the MessageKind value for this Message.
	 * result = (messageKind)
	 * <p>From package UML::Interactions.</p>
	 * @param message The receiving '<em><b>Message</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static MessageKind getMessageKind(Message message) {
		return message.eGet(UMLPackage.Literals.MESSAGE__SEND_EVENT,
			false) == null
				? (message.eGet(UMLPackage.Literals.MESSAGE__RECEIVE_EVENT,
					false) == null
						? MessageKind.UNKNOWN_LITERAL
						: MessageKind.FOUND_LITERAL)
				: (message.eGet(UMLPackage.Literals.MESSAGE__RECEIVE_EVENT,
					false) == null
						? MessageKind.LOST_LITERAL
						: MessageKind.COMPLETE_LITERAL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query isDistinguishableFrom() specifies that any two Messages may coexist in the same Namespace, regardless of their names.
	 * result = (true)
	 * <p>From package UML::Interactions.</p>
	 * @param message The receiving '<em><b>Message</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean isDistinguishableFrom(Message message, NamedElement n,
			Namespace ns) {
		return true;
	}

} // MessageOperations