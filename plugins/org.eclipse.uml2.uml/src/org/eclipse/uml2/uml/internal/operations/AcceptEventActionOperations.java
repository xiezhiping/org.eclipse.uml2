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

import org.eclipse.uml2.uml.AcceptEventAction;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Accept Event Action</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.AcceptEventAction#validateOneOutputPin(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate One Output Pin</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.AcceptEventAction#validateNoInputPins(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate No Input Pins</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.AcceptEventAction#validateNoOutputPins(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate No Output Pins</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.AcceptEventAction#validateUnmarshallSignalEvents(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unmarshall Signal Events</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.AcceptEventAction#validateConformingType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Conforming Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AcceptEventActionOperations
		extends ActionOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AcceptEventActionOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If isUnmarshall=false and any of the triggers are for SignalEvents or TimeEvents, there must be exactly one result OutputPin with multiplicity 1..1.
	 * not isUnmarshall and trigger->exists(event.oclIsKindOf(SignalEvent) or event.oclIsKindOf(TimeEvent)) implies 
	 * 	output->size() = 1 and output->first().is(1,1)
	 * @param acceptEventAction The receiving '<em><b>Accept Event Action</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateOneOutputPin(
			AcceptEventAction acceptEventAction, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.ACCEPT_EVENT_ACTION__ONE_OUTPUT_PIN,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateOneOutputPin", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(acceptEventAction, context)}),
					new Object[]{acceptEventAction}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * AcceptEventActions may have no input pins.
	 * input->size() = 0
	 * @param acceptEventAction The receiving '<em><b>Accept Event Action</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateNoInputPins(
			AcceptEventAction acceptEventAction, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.ACCEPT_EVENT_ACTION__NO_INPUT_PINS,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateNoInputPins", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(acceptEventAction, context)}),
					new Object[]{acceptEventAction}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * There are no OutputPins if the trigger events are only ChangeEvents and/or CallEvents when this action is an instance of AcceptEventAction and not an instance of a descendant of AcceptEventAction (such as AcceptCallAction).
	 * (self.oclIsTypeOf(AcceptEventAction) and
	 *    (trigger->forAll(event.oclIsKindOf(ChangeEvent) or  
	 *                              event.oclIsKindOf(CallEvent))))
	 * implies output->size() = 0
	 * @param acceptEventAction The receiving '<em><b>Accept Event Action</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateNoOutputPins(
			AcceptEventAction acceptEventAction, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.ACCEPT_EVENT_ACTION__NO_OUTPUT_PINS,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateNoOutputPins", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(acceptEventAction, context)}),
					new Object[]{acceptEventAction}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If isUnmarshall is true (and this is not an AcceptCallAction), there must be exactly one trigger, which is for a SignalEvent. The number of result output pins must be the same as the number of attributes of the signal. The type and ordering of each result output pin must be the same as the corresponding attribute of the signal. The multiplicity of each result output pin must be compatible with the multiplicity of the corresponding attribute.
	 * isUnmarshall and self.oclIsTypeOf(AcceptEventAction) implies
	 * 	trigger->size()=1 and
	 * 	trigger->asSequence()->first().event.oclIsKindOf(SignalEvent) and
	 * 	let attribute: OrderedSet(Property) = trigger->asSequence()->first().event.oclAsType(SignalEvent).signal.allAttributes() in
	 * 	attribute->size()>0 and result->size() = attribute->size() and
	 * 	Sequence{1..result->size()}->forAll(i | 
	 * 		result->at(i).type = attribute->at(i).type and 
	 * 		result->at(i).isOrdered = attribute->at(i).isOrdered and
	 * 		result->at(i).includesMultiplicity(attribute->at(i)))
	 * @param acceptEventAction The receiving '<em><b>Accept Event Action</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnmarshallSignalEvents(
			AcceptEventAction acceptEventAction, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.ACCEPT_EVENT_ACTION__UNMARSHALL_SIGNAL_EVENTS,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateUnmarshallSignalEvents", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(acceptEventAction, context)}),
					new Object[]{acceptEventAction}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If isUnmarshall=false and all the triggers are for SignalEvents, then the type of the single result OutputPin must either be null or all the signals must conform to it.
	 * not isUnmarshall implies 
	 * 	result->isEmpty() or
	 * 	let type: Type = result->first().type in
	 * 	type=null or 
	 * 		(trigger->forAll(event.oclIsKindOf(SignalEvent)) and 
	 * 		 trigger.event.oclAsType(SignalEvent).signal->forAll(s | s.conformsTo(type)))
	 * @param acceptEventAction The receiving '<em><b>Accept Event Action</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConformingType(
			AcceptEventAction acceptEventAction, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.ACCEPT_EVENT_ACTION__CONFORMING_TYPE,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateConformingType", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(acceptEventAction, context)}),
					new Object[]{acceptEventAction}));
			}
			return false;
		}
		return true;
	}

} // AcceptEventActionOperations