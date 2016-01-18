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

import org.eclipse.uml2.uml.UnmarshallAction;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Unmarshall Action</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.UnmarshallAction#validateStructuralFeature(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Structural Feature</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.UnmarshallAction#validateNumberOfResult(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Result</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.UnmarshallAction#validateTypeOrderingAndMultiplicity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Type Ordering And Multiplicity</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.UnmarshallAction#validateMultiplicityOfObject(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiplicity Of Object</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.UnmarshallAction#validateObjectType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Object Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnmarshallActionOperations
		extends ActionOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnmarshallActionOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The multiplicity of the object InputPin is 1..1
	 * object.is(1,1)
	 * @param unmarshallAction The receiving '<em><b>Unmarshall Action</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMultiplicityOfObject(
			UnmarshallAction unmarshallAction, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.UNMARSHALL_ACTION__MULTIPLICITY_OF_OBJECT,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateMultiplicityOfObject", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(unmarshallAction, context)}),
					new Object[]{unmarshallAction}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of the object InputPin conform to the unmarshallType.
	 * object.type.conformsTo(unmarshallType)
	 * @param unmarshallAction The receiving '<em><b>Unmarshall Action</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateObjectType(UnmarshallAction unmarshallAction,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.UNMARSHALL_ACTION__OBJECT_TYPE,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateObjectType", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(unmarshallAction, context)}),
					new Object[]{unmarshallAction}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of result outputPins must be the same as the number of attributes of the unmarshallType.
	 * unmarshallType.allAttributes()->size() = result->size()
	 * @param unmarshallAction The receiving '<em><b>Unmarshall Action</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateNumberOfResult(
			UnmarshallAction unmarshallAction, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.UNMARSHALL_ACTION__NUMBER_OF_RESULT,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateNumberOfResult", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(unmarshallAction, context)}),
					new Object[]{unmarshallAction}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type, ordering and multiplicity of each attribute of the unmarshallType must be compatible with the type, ordering and multiplicity of the corresponding result OutputPin.
	 * let attribute:OrderedSet(Property) = unmarshallType.allAttributes() in
	 * Sequence{1..result->size()}->forAll(i | 
	 * 	attribute->at(i).type.conformsTo(result->at(i).type) and
	 * 	attribute->at(i).isOrdered=result->at(i).isOrdered and
	 * 	attribute->at(i).compatibleWith(result->at(i)))
	 * @param unmarshallAction The receiving '<em><b>Unmarshall Action</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateTypeOrderingAndMultiplicity(
			UnmarshallAction unmarshallAction, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.UNMARSHALL_ACTION__TYPE_ORDERING_AND_MULTIPLICITY,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateTypeOrderingAndMultiplicity", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(unmarshallAction, context)}),
					new Object[]{unmarshallAction}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The unmarshallType must have at least one StructuralFeature.
	 * unmarshallType.allAttributes()->size() >= 1
	 * @param unmarshallAction The receiving '<em><b>Unmarshall Action</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateStructuralFeature(
			UnmarshallAction unmarshallAction, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.UNMARSHALL_ACTION__STRUCTURAL_FEATURE,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateStructuralFeature", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(unmarshallAction, context)}),
					new Object[]{unmarshallAction}));
			}
			return false;
		}
		return true;
	}

} // UnmarshallActionOperations