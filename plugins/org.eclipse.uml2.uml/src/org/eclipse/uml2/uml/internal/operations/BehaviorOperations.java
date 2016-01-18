/*
 * Copyright (c) 2005, 2016 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 327039, 351774, 383550, 418466, 432898, 451350, 485756
 *
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.BehavioralFeature;
import org.eclipse.uml2.uml.BehavioredClassifier;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.ParameterDirectionKind;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.UMLPlugin;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Behavior</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Behavior#validateMostOneBehavior(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Most One Behavior</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Behavior#validateParametersMatch(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Parameters Match</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Behavior#validateFeatureOfContextClassifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Feature Of Context Classifier</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Behavior#getContext() <em>Get Context</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Behavior#behavioredClassifier(org.eclipse.uml2.uml.Element) <em>Behaviored Classifier</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Behavior#inputParameters() <em>Input Parameters</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Behavior#outputParameters() <em>Output Parameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BehaviorOperations
		extends ClassOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BehaviorOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * There may be at most one Behavior for a given pairing of BehavioredClassifier (as owner of the Behavior) and BehavioralFeature (as specification of the Behavior).
	 * specification <> null implies _'context'.ownedBehavior->select(specification=self.specification)->size() = 1
	 * @param behavior The receiving '<em><b>Behavior</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMostOneBehavior(Behavior behavior,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.BEHAVIOR__MOST_ONE_BEHAVIOR,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateMostOneBehavior", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(behavior, context)}),
					new Object[]{behavior}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If a Behavior has a specification BehavioralFeature, then it must have the same number of ownedParameters as its specification. The Behavior Parameters must also "match" the BehavioralParameter Parameters, but the exact requirements for this matching are not formalized.
	 * specification <> null implies ownedParameter->size() = specification.ownedParameter->size()
	 * @param behavior The receiving '<em><b>Behavior</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean validateParametersMatch(Behavior behavior,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		BehavioralFeature specification = behavior.getSpecification();

		if (specification != null) {
			EList<Parameter> behaviorOwnedParameters = behavior
				.getOwnedParameters();
			EList<Parameter> specificationOwnedParameters = specification
				.getOwnedParameters();

			if (behaviorOwnedParameters.size() != specificationOwnedParameters
				.size()) {

				result = false;
			} else {
				Iterator<Parameter> bop = behaviorOwnedParameters.iterator();
				Iterator<Parameter> sop = specificationOwnedParameters
					.iterator();

				while (bop.hasNext() && sop.hasNext()) {

					if (!ParameterOperations.matches(bop.next(), sop.next())) {
						result = false;
						break;
					}
				}
			}

			if (!result && diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.WARNING,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.BEHAVIOR__PARAMETERS_MATCH,
					UMLPlugin.INSTANCE.getString(
						"_UI_Behavior_ParametersMatch_diagnostic", //$NON-NLS-1$
						getMessageSubstitutions(context, behavior)),
					new Object[]{behavior}));
			}
		}

		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The specification BehavioralFeature must be a feature (possibly inherited) of the context BehavioredClassifier of the Behavior.
	 * _'context'.feature->includes(specification)
	 * @param behavior The receiving '<em><b>Behavior</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean validateFeatureOfContextClassifier(Behavior behavior,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		BehavioralFeature specification = behavior.getSpecification();

		if (specification != null) {
			Classifier contextClassifier = behavior.getContext();

			if (contextClassifier == null
				|| !contextClassifier.allFeatures().contains(specification)) {

				if (diagnostics != null) {
					diagnostics.add(new BasicDiagnostic(Diagnostic.WARNING,
						UMLValidator.DIAGNOSTIC_SOURCE,
						UMLValidator.BEHAVIOR__FEATURE_OF_CONTEXT_CLASSIFIER,
						UMLPlugin.INSTANCE.getString(
							"_UI_Behavior_FeatureOfContextClassifier_diagnostic", //$NON-NLS-1$
							getMessageSubstitutions(context, behavior)),
						new Object[]{behavior}));
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
	 * A Behavior that is directly owned as a nestedClassifier does not have a context. Otherwise, to determine the context of a Behavior, find the first BehavioredClassifier reached by following the chain of owner relationships from the Behavior, if any. If there is such a BehavioredClassifier, then it is the context, unless it is itself a Behavior with a non-empty context, in which case that is also the context for the original Behavior.
	 * result = (if nestingClass <> null then
	 *     null
	 * else
	 *     let b:BehavioredClassifier = self.behavioredClassifier(self.owner) in
	 *     if b.oclIsKindOf(Behavior) and b.oclAsType(Behavior)._'context' <> null then 
	 *         b.oclAsType(Behavior)._'context'
	 *     else 
	 *         b
	 *     endif
	 * endif
	 *         )
	 * <p>From package UML::CommonBehavior.</p>
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static BehavioredClassifier getContext(Behavior behavior) {
		BehavioredClassifier context = null;

		EReference containmentFeature = behavior.eContainmentFeature();

		if (containmentFeature != UMLPackage.Literals.CLASS__NESTED_CLASSIFIER
			&& containmentFeature != UMLPackage.Literals.INTERFACE__NESTED_CLASSIFIER) {

			BehavioredClassifier b = behavior
				.behavioredClassifier(behavior.getOwner());

			if (b != null) {

				if (b instanceof Behavior) {
					context = ((Behavior) b).getContext();
				}

				if (context == null) {
					context = b;
				}
			}
		}

		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The first BehavioredClassifier reached by following the chain of owner relationships from the Behavior, if any.
	 * if from.oclIsKindOf(BehavioredClassifier) then
	 *     from.oclAsType(BehavioredClassifier)
	 * else if from.owner = null then
	 *     null
	 * else
	 *     self.behavioredClassifier(from.owner)
	 * endif
	 * endif
	 * <p>From package UML::CommonBehavior.</p>
	 * @param behavior The receiving '<em><b>Behavior</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static BehavioredClassifier behavioredClassifier(Behavior behavior,
			Element from) {

		if (from instanceof BehavioredClassifier) {
			return (BehavioredClassifier) from;
		} else {
			Element owner = from == null
				? null
				: from.getOwner();

			return owner == null
				? null
				: behavior.behavioredClassifier(owner);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The in and inout ownedParameters of the Behavior.
	 * result = (ownedParameter->select(direction=ParameterDirectionKind::_'in' or direction=ParameterDirectionKind::inout))
	 * <p>From package UML::CommonBehavior.</p>
	 * @param behavior The receiving '<em><b>Behavior</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<Parameter> inputParameters(Behavior behavior) {
		EList<Parameter> inputParameters = new UniqueEList.FastCompare<Parameter>();

		for (Parameter ownedParameter : behavior.getOwnedParameters()) {
			ParameterDirectionKind direction = ownedParameter.getDirection();

			if (direction == ParameterDirectionKind.IN_LITERAL
				|| direction == ParameterDirectionKind.INOUT_LITERAL) {

				inputParameters.add(ownedParameter);
			}
		}

		return ECollections.unmodifiableEList(inputParameters);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The out, inout and return ownedParameters.
	 * result = (ownedParameter->select(direction=ParameterDirectionKind::out or direction=ParameterDirectionKind::inout or direction=ParameterDirectionKind::return))
	 * <p>From package UML::CommonBehavior.</p>
	 * @param behavior The receiving '<em><b>Behavior</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<Parameter> outputParameters(Behavior behavior) {
		EList<Parameter> outputParameters = new UniqueEList.FastCompare<Parameter>();

		for (Parameter ownedParameter : behavior.getOwnedParameters()) {
			ParameterDirectionKind direction = ownedParameter.getDirection();

			if (direction == ParameterDirectionKind.OUT_LITERAL
				|| direction == ParameterDirectionKind.INOUT_LITERAL
				|| direction == ParameterDirectionKind.RETURN_LITERAL) {

				outputParameters.add(ownedParameter);
			}
		}

		return ECollections.unmodifiableEList(outputParameters);
	}

} // BehaviorOperations