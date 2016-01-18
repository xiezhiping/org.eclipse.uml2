/*
 * Copyright (c) 2005, 2016 IBM Corporation and others.
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

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.uml2.uml.ExtensionEnd;
import org.eclipse.uml2.uml.ValueSpecification;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Extension End</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.ExtensionEnd#validateMultiplicity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiplicity</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ExtensionEnd#validateAggregation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Aggregation</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ExtensionEnd#getLower() <em>Get Lower</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ExtensionEnd#setLower(int) <em>Set Lower</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ExtensionEnd#lowerBound() <em>Lower Bound</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExtensionEndOperations
		extends PropertyOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtensionEndOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The multiplicity of ExtensionEnd is 0..1 or 1.
	 * (lowerBound() = 0 or lowerBound() = 1) and upperBound() = 1
	 * @param extensionEnd The receiving '<em><b>Extension End</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMultiplicity(ExtensionEnd extensionEnd,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.EXTENSION_END__MULTIPLICITY,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateMultiplicity", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(extensionEnd, context)}),
					new Object[]{extensionEnd}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The aggregation of an ExtensionEnd is composite.
	 * self.aggregation = AggregationKind::composite
	 * @param extensionEnd The receiving '<em><b>Extension End</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAggregation(ExtensionEnd extensionEnd,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.EXTENSION_END__AGGREGATION,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateAggregation", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(extensionEnd, context)}),
					new Object[]{extensionEnd}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query lowerBound() returns the lower bound of the multiplicity as an Integer. This is a redefinition of the default lower bound, which normally, for MultiplicityElements, evaluates to 1 if empty.
	 * result = (if lowerValue=null then 0 else lowerValue.integerValue() endif)
	 * <p>From package UML::Packages.</p>
	 * @param extensionEnd The receiving '<em><b>Extension End</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static int lowerBound(ExtensionEnd extensionEnd) {
		ValueSpecification lowerValue = extensionEnd.getLowerValue();

		if (lowerValue != null) {

			try {
				return lowerValue.integerValue();
			} catch (UnsupportedOperationException uoe) {
				// do nothing
			}
		}

		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static int getLower(ExtensionEnd extensionEnd) {
		return extensionEnd.lowerBound();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static void setLower(ExtensionEnd extensionEnd, int newLower) {
		MultiplicityElementOperations.setLower(extensionEnd, newLower);
	}

} // ExtensionEndOperations