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
 * $Id: MessageOperations.java,v 1.6 2005/12/12 18:37:47 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.uml2.uml.Message;

import org.eclipse.uml2.uml.MessageEnd;
import org.eclipse.uml2.uml.MessageKind;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.UMLPackage;

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
 * @generated not
 */
public final class MessageOperations
		extends UMLOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private MessageOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the sending MessageEvent and the receiving MessageEvent of the same Message are on the same Lifeline, the sending MessageEvent must be ordered before the receiving MessageEvent.
	 * true
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateSendingReceivingMessageEvent(Message message,
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
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateSignatureReferTo(Message message,
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
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateSignatureIsOperation(Message message,
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
						UMLValidator.MESSAGE__SIGNATURE_IS_OPERATION,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateSignatureIsOperation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(message, context)}), //$NON-NLS-1$ //$NON-NLS-2$
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
	 * In the case when the Message signature is a Signal, the arguments of the Message must correspond to the attributes of the Signal. A Message Argument corresponds to a Signal Attribute if the Arguement is of the same Class or a specialization of that of the Attribute.
	 * true
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateSignatureIsSignal(Message message,
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
						UMLValidator.MESSAGE__SIGNATURE_IS_SIGNAL,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateSignatureIsSignal", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(message, context)}), //$NON-NLS-1$ //$NON-NLS-2$
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
	 * Arguments of a Message must only be:
	 * i) attributes of the sending lifeline
	 * ii) constants
	 * iii) symbolic values (which are wildcard values representing any legal value)
	 * iv) explicit parameters of the enclosing Interaction
	 * v) attributes of the class owning the Interaction
	 * 
	 * true
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateArguments(Message message,
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
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateCannotCrossBoundaries(Message message,
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
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateOccurrenceSpecifications(Message message,
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
		MessageEnd sendEvent = (MessageEnd) message.eGet(
			UMLPackage.Literals.MESSAGE__SEND_EVENT, false);
		return sendEvent == null
			? (MessageEnd) message.eGet(
				UMLPackage.Literals.MESSAGE__RECEIVE_EVENT, false)
			: sendEvent;
	}

} // MessageOperations