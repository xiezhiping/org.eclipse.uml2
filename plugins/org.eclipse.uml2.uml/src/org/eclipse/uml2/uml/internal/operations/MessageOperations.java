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
 * $Id: MessageOperations.java,v 1.11 2007/05/03 21:11:51 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;

import org.eclipse.uml2.uml.CallEvent;
import org.eclipse.uml2.uml.Event;
import org.eclipse.uml2.uml.Message;
import org.eclipse.uml2.uml.MessageEnd;
import org.eclipse.uml2.uml.MessageEvent;
import org.eclipse.uml2.uml.MessageKind;
import org.eclipse.uml2.uml.MessageOccurrenceSpecification;
import org.eclipse.uml2.uml.MessageSort;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.ParameterDirectionKind;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.ReceiveOperationEvent;
import org.eclipse.uml2.uml.ReceiveSignalEvent;
import org.eclipse.uml2.uml.SendOperationEvent;
import org.eclipse.uml2.uml.SendSignalEvent;
import org.eclipse.uml2.uml.Signal;
import org.eclipse.uml2.uml.SignalEvent;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.UMLPlugin;
import org.eclipse.uml2.uml.ValueSpecification;

import org.eclipse.uml2.uml.util.UMLSwitch;
import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Message</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Message#validateSendingReceivingMessageEvent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sending Receiving Message Event</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Message#validateSignatureReferTo(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Signature Refer To</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Message#validateSignatureIsOperation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Signature Is Operation</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Message#validateSignatureIsSignal(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Signature Is Signal</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Message#validateArguments(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Arguments</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Message#validateCannotCrossBoundaries(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cannot Cross Boundaries</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Message#validateOccurrenceSpecifications(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Occurrence Specifications</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Message#getMessageKind() <em>Get Message Kind</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Message#getSignature() <em>Get Signature</em>}</li>
 * </ul>
 * </p>
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
	 * If the sending MessageEvent and the receiving MessageEvent of the same Message are on the same Lifeline, the sending MessageEvent must be ordered before the receiving MessageEvent.
	 * true
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
				diagnostics
					.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						UMLValidator.DIAGNOSTIC_SOURCE,
						UMLValidator.MESSAGE__SENDING_RECEIVING_MESSAGE_EVENT,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateSendingReceivingMessageEvent", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(message, context)}), //$NON-NLS-1$ //$NON-NLS-2$
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
	 * The signature must either refer an Operation (in which case messageSort is either synchCall or asynchCall) or a Signal (in which case messageSort is asynchSignal). The name of the NamedElement referenced by signature must be the same as that of the Message.
	 * true
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
				diagnostics
					.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						UMLValidator.DIAGNOSTIC_SOURCE,
						UMLValidator.MESSAGE__SIGNATURE_REFER_TO,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateSignatureReferTo", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(message, context)}), //$NON-NLS-1$ //$NON-NLS-2$
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
	 * In the case when the Message signature is an Operation, the arguments of the Message must correspond to the parameters of the Operation. A Parameter corresponds to an Argument if the Argument is of the same Class or a specialization of that of the Parameter.
	 * true
	 * @param message The receiving '<em><b>Message</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean validateSignatureIsOperation(Message message,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		NamedElement signature = message.getSignature();

		if (signature instanceof Operation) {
			EList<ValueSpecification> arguments = message.getArguments();

			if (!arguments.isEmpty()) {
				EList<Parameter> parameters = new UniqueEList.FastCompare<Parameter>(
					((Operation) signature).getOwnedParameters());

				if (message.getMessageSort() == MessageSort.REPLY_LITERAL) {

					for (Iterator<Parameter> p = parameters.iterator(); p
						.hasNext();) {

						if (p.next().getDirection() == ParameterDirectionKind.IN_LITERAL) {
							p.remove();
						}
					}
				}

				if (arguments.size() != parameters.size()) {
					result = false;
				} else {
					Iterator<ValueSpecification> a = arguments.iterator();
					Iterator<Parameter> p = parameters.iterator();

					while (a.hasNext() && p.hasNext()) {
						Type argumentType = a.next().getType();
						Type parameterType = p.next().getType();

						if (argumentType == null
							? parameterType != null
							: !argumentType.conformsTo(parameterType)) {

							result = false;
							break;
						}
					}
				}
			}
		}

		if (!result && diagnostics != null) {
			diagnostics.add(new BasicDiagnostic(Diagnostic.WARNING,
				UMLValidator.DIAGNOSTIC_SOURCE,
				UMLValidator.MESSAGE__SIGNATURE_IS_OPERATION,
				UMLPlugin.INSTANCE.getString(
					"_UI_Message_SignatureIsOperation_diagnostic", //$NON-NLS-1$
					getMessageSubstitutions(context, message)),
				new Object[]{message}));
		}

		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In the case when the Message signature is a Signal, the arguments of the Message must correspond to the attributes of the Signal. A Message Argument corresponds to a Signal Attribute if the Arguement is of the same Class or a specialization of that of the Attribute.
	 * true
	 * @param message The receiving '<em><b>Message</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean validateSignatureIsSignal(Message message,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		NamedElement signature = message.getSignature();

		if (signature instanceof Signal) {
			EList<ValueSpecification> arguments = message.getArguments();

			if (!arguments.isEmpty()) {
				EList<Property> attributes = ((Signal) signature)
					.getAttributes();

				if (arguments.size() != attributes.size()) {
					result = false;
				} else {
					Iterator<ValueSpecification> ma = arguments.iterator();
					Iterator<Property> sa = attributes.iterator();

					while (ma.hasNext() && sa.hasNext()) {
						Type argumentType = ma.next().getType();
						Type attributeType = sa.next().getType();

						if (argumentType == null
							? attributeType != null
							: !argumentType.conformsTo(attributeType)) {

							result = false;
							break;
						}
					}
				}
			}
		}

		if (!result && diagnostics != null) {
			diagnostics.add(new BasicDiagnostic(Diagnostic.WARNING,
				UMLValidator.DIAGNOSTIC_SOURCE,
				UMLValidator.MESSAGE__SIGNATURE_IS_SIGNAL, UMLPlugin.INSTANCE
					.getString("_UI_Message_SignatureIsSignal_diagnostic", //$NON-NLS-1$
						getMessageSubstitutions(context, message)),
				new Object[]{message}));
		}

		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Arguments of a Message must only be:
	 * i) attributes of the sending lifeline
	 * ii) constants
	 * iii) symbolic values (which are wildcard values representing any legal value)
	 * iv) explicit parameters of the enclosing Interaction
	 * v) attributes of the class owning the Interaction
	 * 
	 * true
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
				diagnostics
					.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						UMLValidator.DIAGNOSTIC_SOURCE,
						UMLValidator.MESSAGE__ARGUMENTS,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateArguments", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(message, context)}), //$NON-NLS-1$ //$NON-NLS-2$
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
	 * Messages cannot cross bounderies of CombinedFragments or their operands.
	 * true
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
				diagnostics
					.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						UMLValidator.DIAGNOSTIC_SOURCE,
						UMLValidator.MESSAGE__CANNOT_CROSS_BOUNDARIES,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateCannotCrossBoundaries", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(message, context)}), //$NON-NLS-1$ //$NON-NLS-2$
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
	 * If the MessageEnds are both OccurrenceSpecifications then the connector must go between the Parts represented by the Lifelines of the two MessageEnds.
	 * true
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
				diagnostics
					.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						UMLValidator.DIAGNOSTIC_SOURCE,
						UMLValidator.MESSAGE__OCCURRENCE_SPECIFICATIONS,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateOccurrenceSpecifications", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(message, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{message}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static MessageKind getMessageKind(Message message) {
		return message.eGet(UMLPackage.Literals.MESSAGE__SEND_EVENT, false) == null
			? (message.eGet(UMLPackage.Literals.MESSAGE__RECEIVE_EVENT, false) == null
				? MessageKind.UNKNOWN_LITERAL
				: MessageKind.FOUND_LITERAL)
			: (message.eGet(UMLPackage.Literals.MESSAGE__RECEIVE_EVENT, false) == null
				? MessageKind.LOST_LITERAL
				: MessageKind.COMPLETE_LITERAL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static NamedElement getSignature(Message message) {
		MessageEvent messageEvent = null;

		MessageEnd sendEvent = message.getSendEvent();

		if (sendEvent instanceof MessageOccurrenceSpecification) {
			Event event = ((MessageOccurrenceSpecification) sendEvent)
				.getEvent();

			if (event instanceof MessageEvent) {
				messageEvent = (MessageEvent) event;
			}
		}

		if (messageEvent == null) {
			MessageEnd receiveEvent = message.getReceiveEvent();

			if (receiveEvent instanceof MessageOccurrenceSpecification) {
				Event event = ((MessageOccurrenceSpecification) receiveEvent)
					.getEvent();

				if (event instanceof MessageEvent) {
					messageEvent = (MessageEvent) event;
				}
			}
		}

		if (messageEvent == null) {
			return null;
		} else {
			return (NamedElement) new UMLSwitch<Object>() {

				@Override
				public Object caseCallEvent(CallEvent callEvent) {
					return callEvent.eGet(
						UMLPackage.Literals.CALL_EVENT__OPERATION, false);
				}

				@Override
				public Object caseReceiveOperationEvent(
						ReceiveOperationEvent receiveOperationEvent) {
					return receiveOperationEvent.eGet(
						UMLPackage.Literals.RECEIVE_OPERATION_EVENT__OPERATION,
						false);
				}

				@Override
				public Object caseReceiveSignalEvent(
						ReceiveSignalEvent receiveSignalEvent) {
					return receiveSignalEvent
						.eGet(UMLPackage.Literals.RECEIVE_SIGNAL_EVENT__SIGNAL,
							false);
				}

				@Override
				public Object caseSendOperationEvent(
						SendOperationEvent sendOperationEvent) {
					return sendOperationEvent.eGet(
						UMLPackage.Literals.SEND_OPERATION_EVENT__OPERATION,
						false);
				}

				@Override
				public Object caseSendSignalEvent(
						SendSignalEvent sendSignalEvent) {
					return sendSignalEvent.eGet(
						UMLPackage.Literals.SEND_SIGNAL_EVENT__SIGNAL, false);
				}

				@Override
				public Object caseSignalEvent(SignalEvent signalEvent) {
					return signalEvent.eGet(
						UMLPackage.Literals.SIGNAL_EVENT__SIGNAL, false);
				}
			}.doSwitch(messageEvent);
		}
	}

} // MessageOperations