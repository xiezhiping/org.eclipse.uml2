/*
 * Copyright (c) 2008, 2016 IBM Corporation, CEA, and others.
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
import org.eclipse.emf.common.util.ECollections;

import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.BehavioredClassifier;
import org.eclipse.uml2.uml.InputPin;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.StartObjectBehaviorAction;
import org.eclipse.uml2.uml.Type;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Start Object Behavior Action</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.StartObjectBehaviorAction#validateMultiplicityOfObject(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiplicity Of Object</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.StartObjectBehaviorAction#validateTypeOfObject(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Type Of Object</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.StartObjectBehaviorAction#validateNoOnport(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate No Onport</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.StartObjectBehaviorAction#behavior() <em>Behavior</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.StartObjectBehaviorAction#outputParameters() <em>Output Parameters</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.StartObjectBehaviorAction#inputParameters() <em>Input Parameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StartObjectBehaviorActionOperations
		extends CallActionOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StartObjectBehaviorActionOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of the object InputPin must be either a Behavior or a BehavioredClassifier with a classifierBehavior.
	 * self.behavior()<>null
	 * @param startObjectBehaviorAction The receiving '<em><b>Start Object Behavior Action</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateTypeOfObject(
			StartObjectBehaviorAction startObjectBehaviorAction,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.START_OBJECT_BEHAVIOR_ACTION__TYPE_OF_OBJECT,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateTypeOfObject", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(startObjectBehaviorAction,
									context)}),
					new Object[]{startObjectBehaviorAction}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A StartObjectBehaviorAction may not specify onPort.
	 * onPort->isEmpty()
	 * @param startObjectBehaviorAction The receiving '<em><b>Start Object Behavior Action</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateNoOnport(
			StartObjectBehaviorAction startObjectBehaviorAction,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.START_OBJECT_BEHAVIOR_ACTION__NO_ONPORT,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateNoOnport", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(startObjectBehaviorAction,
									context)}),
					new Object[]{startObjectBehaviorAction}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the type of the object InputPin is a Behavior, then that Behavior. Otherwise, if the type of the object InputPin is a BehavioredClassifier, then the classifierBehavior of that BehavioredClassifier.
	 * result = (if object.type.oclIsKindOf(Behavior) then
	 *   object.type.oclAsType(Behavior)
	 * else if object.type.oclIsKindOf(BehavioredClassifier) then
	 *   object.type.oclAsType(BehavioredClassifier).classifierBehavior
	 * else
	 *   null
	 * endif
	 * endif)
	 * <p>From package UML::Actions.</p>
	 * @param startObjectBehaviorAction The receiving '<em><b>Start Object Behavior Action</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static Behavior behavior(
			StartObjectBehaviorAction startObjectBehaviorAction) {
		InputPin object = startObjectBehaviorAction.getObject();
		Type type = object == null
			? null
			: object.getType();

		if (type instanceof Behavior) {
			return (Behavior) type;
		} else {
			return type instanceof BehavioredClassifier
				? ((BehavioredClassifier) type).getClassifierBehavior()
				: null;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Return the inout, out and return ownedParameters of the Behavior being called.
	 * result = (self.behavior().outputParameters())
	 * <p>From package UML::Actions.</p>
	 * @param startObjectBehaviorAction The receiving '<em><b>Start Object Behavior Action</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<Parameter> outputParameters(
			StartObjectBehaviorAction startObjectBehaviorAction) {
		Behavior behavior = startObjectBehaviorAction.behavior();

		if (behavior != null) {
			return behavior.outputParameters();
		} else {
			return ECollections.emptyEList();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Return the in and inout ownedParameters of the Behavior being called.
	 * result = (self.behavior().inputParameters())
	 * <p>From package UML::Actions.</p>
	 * @param startObjectBehaviorAction The receiving '<em><b>Start Object Behavior Action</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<Parameter> inputParameters(
			StartObjectBehaviorAction startObjectBehaviorAction) {
		Behavior behavior = startObjectBehaviorAction.behavior();

		if (behavior != null) {
			return behavior.inputParameters();
		} else {
			return ECollections.emptyEList();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The multiplicity of the object InputPin must be 1..1.
	 * object.is(1,1)
	 * @param startObjectBehaviorAction The receiving '<em><b>Start Object Behavior Action</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMultiplicityOfObject(
			StartObjectBehaviorAction startObjectBehaviorAction,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.START_OBJECT_BEHAVIOR_ACTION__MULTIPLICITY_OF_OBJECT,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateMultiplicityOfObject", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(startObjectBehaviorAction,
									context)}),
					new Object[]{startObjectBehaviorAction}));
			}
			return false;
		}
		return true;
	}

} // StartObjectBehaviorActionOperations
