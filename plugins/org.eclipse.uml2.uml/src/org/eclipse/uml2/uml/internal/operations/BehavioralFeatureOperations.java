/*
 * Copyright (c) 2005, 2016 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 418466, 451350, 485756
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
import org.eclipse.uml2.uml.BehavioralFeature;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.ParameterDirectionKind;

import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Behavioral Feature</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.BehavioralFeature#validateAbstractNoMethod(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Abstract No Method</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.BehavioralFeature#createReturnResult(java.lang.String, org.eclipse.uml2.uml.Type) <em>Create Return Result</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.BehavioralFeature#inputParameters() <em>Input Parameters</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.BehavioralFeature#outputParameters() <em>Output Parameters</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.BehavioralFeature#isDistinguishableFrom(org.eclipse.uml2.uml.NamedElement, org.eclipse.uml2.uml.Namespace) <em>Is Distinguishable From</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BehavioralFeatureOperations
		extends NamespaceOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BehavioralFeatureOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When isAbstract is true there are no methods.
	 * isAbstract implies method->isEmpty()
	 * @param behavioralFeature The receiving '<em><b>Behavioral Feature</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAbstractNoMethod(
			BehavioralFeature behavioralFeature, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.BEHAVIORAL_FEATURE__ABSTRACT_NO_METHOD,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateAbstractNoMethod", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(behavioralFeature, context)}),
					new Object[]{behavioralFeature}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates a return result parameter with the specified name and type.
	 * @param behavioralFeature The receiving '<em><b>Behavioral Feature</b></em>' model object.
	 * @param name The name for the new return result, or null.
	 * @param type The type for the new return result, or null.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static Parameter createReturnResult(
			BehavioralFeature behavioralFeature, String name, Type type) {
		Parameter returnResult = behavioralFeature.createOwnedParameter(name,
			type);
		returnResult.setDirection(ParameterDirectionKind.RETURN_LITERAL);
		return returnResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ownedParameters with direction in and inout.
	 * result = (ownedParameter->select(direction=ParameterDirectionKind::_'in' or direction=ParameterDirectionKind::inout))
	 * <p>From package UML::Classification.</p>
	 * @param behavioralFeature The receiving '<em><b>Behavioral Feature</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<Parameter> inputParameters(
			BehavioralFeature behavioralFeature) {
		EList<Parameter> inputParameters = new UniqueEList.FastCompare<Parameter>();

		for (Parameter ownedParameter : behavioralFeature
			.getOwnedParameters()) {
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
	 * The ownedParameters with direction out, inout, or return.
	 * result = (ownedParameter->select(direction=ParameterDirectionKind::out or direction=ParameterDirectionKind::inout or direction=ParameterDirectionKind::return))
	 * <p>From package UML::Classification.</p>
	 * @param behavioralFeature The receiving '<em><b>Behavioral Feature</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<Parameter> outputParameters(
			BehavioralFeature behavioralFeature) {
		EList<Parameter> outputParameters = new UniqueEList.FastCompare<Parameter>();

		for (Parameter ownedParameter : behavioralFeature
			.getOwnedParameters()) {
			ParameterDirectionKind direction = ownedParameter.getDirection();

			if (direction == ParameterDirectionKind.OUT_LITERAL
				|| direction == ParameterDirectionKind.INOUT_LITERAL
				|| direction == ParameterDirectionKind.RETURN_LITERAL) {

				outputParameters.add(ownedParameter);
			}
		}

		return ECollections.unmodifiableEList(outputParameters);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query isDistinguishableFrom() determines whether two BehavioralFeatures may coexist in the same Namespace. It specifies that they must have different signatures.
	 * result = ((n.oclIsKindOf(BehavioralFeature) and ns.getNamesOfMember(self)->intersection(ns.getNamesOfMember(n))->notEmpty()) implies
	 *   Set{self}->including(n.oclAsType(BehavioralFeature))->isUnique(ownedParameter->collect(p|
	 *   Tuple { name=p.name, type=p.type,effect=p.effect,direction=p.direction,isException=p.isException,
	 *           isStream=p.isStream,isOrdered=p.isOrdered,isUnique=p.isUnique,lower=p.lower, upper=p.upper }))
	 *   )
	 * <p>From package UML::Classification.</p>
	 * @param behavioralFeature The receiving '<em><b>Behavioral Feature</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean isDistinguishableFrom(
			BehavioralFeature behavioralFeature, NamedElement n, Namespace ns) {

		if (n instanceof BehavioralFeature) {
			EList<String> namesOfMemberN = ns.getNamesOfMember(n);

			for (String nameOfMemberBF : ns
				.getNamesOfMember(behavioralFeature)) {

				if (namesOfMemberN.contains(nameOfMemberBF)) {
					Iterator<Parameter> bfParameters = behavioralFeature
						.getOwnedParameters().iterator();
					Iterator<Parameter> nParameters = ((BehavioralFeature) n)
						.getOwnedParameters().iterator();

					while (bfParameters.hasNext() && nParameters.hasNext()) {

						if (!ParameterOperations.matches(bfParameters.next(),
							nParameters.next())) {

							return true;
						}
					}

					return bfParameters.hasNext() || nParameters.hasNext();
				}
			}
		}

		return true;
	}

} // BehavioralFeatureOperations
