/*
 * Copyright (c) 2005, 2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: ParameterOperations.java,v 1.13 2006/01/05 22:43:26 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.impl.BasicEObjectImpl;

import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.ValueSpecification;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Parameter</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Parameter#validateConnectorEnd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Connector End</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Parameter#validateStreamAndException(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Stream And Exception</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Parameter#validateNotException(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Not Exception</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Parameter#validateReentrantBehaviors(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reentrant Behaviors</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Parameter#validateInAndOut(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate In And Out</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Parameter#getDefault() <em>Get Default</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Parameter#isSetDefault() <em>Is Set Default</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Parameter#setDefault(java.lang.String) <em>Set Default</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Parameter#unsetDefault() <em>Unset Default</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParameterOperations
		extends NamedElementOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A parameter may only be associated with a connector end within the context of a collaboration.
	 * self.end.notEmpty() implies self.collaboration.notEmpty()
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConnectorEnd(Parameter parameter,
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
						UMLValidator.PARAMETER__CONNECTOR_END,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateConnectorEnd", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(parameter, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{parameter}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A parameter cannot be a stream and exception at the same time.
	 * true
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateStreamAndException(Parameter parameter,
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
						UMLValidator.PARAMETER__STREAM_AND_EXCEPTION,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateStreamAndException", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(parameter, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{parameter}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An input parameter cannot be an exception.
	 * true
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateNotException(Parameter parameter,
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
						UMLValidator.PARAMETER__NOT_EXCEPTION,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateNotException", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(parameter, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{parameter}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reentrant behaviors cannot have stream parameters.
	 * true
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateReentrantBehaviors(Parameter parameter,
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
						UMLValidator.PARAMETER__REENTRANT_BEHAVIORS,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateReentrantBehaviors", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(parameter, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{parameter}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Only in and inout parameters may have a delete effect. Only out, inout, and return parameters may have a create effect.
	 * true
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateInAndOut(Parameter parameter,
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
						UMLValidator.PARAMETER__IN_AND_OUT,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateInAndOut", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(parameter, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{parameter}));
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
	public static String getDefault(Parameter parameter) {
		ValueSpecification defaultValue = parameter.getDefaultValue();

		if (defaultValue != null) {
			return defaultValue.stringValue();
		} else {
			BasicEObjectImpl basicEObjectImpl = (BasicEObjectImpl) parameter;
			return (String) basicEObjectImpl
				.eVirtualGet(
					basicEObjectImpl
						.eDerivedStructuralFeatureID(UMLPackage.Literals.PARAMETER__DEFAULT),
					null);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static void setDefault(Parameter parameter, String newDefault) {
		ValueSpecification defaultValue = parameter.getDefaultValue();

		if (defaultValue != null) {
			ValueSpecificationOperations.setValue(defaultValue, newDefault);
		} else {
			BasicEObjectImpl basicEObjectImpl = (BasicEObjectImpl) parameter;
			basicEObjectImpl
				.eVirtualSet(
					basicEObjectImpl
						.eDerivedStructuralFeatureID(UMLPackage.Literals.PARAMETER__DEFAULT),
					newDefault);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static boolean isSetDefault(Parameter parameter) {
		BasicEObjectImpl basicEObjectImpl = (BasicEObjectImpl) parameter;
		return basicEObjectImpl
			.eVirtualIsSet(basicEObjectImpl
				.eDerivedStructuralFeatureID(UMLPackage.Literals.PARAMETER__DEFAULT));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static void unsetDefault(Parameter parameter) {
		BasicEObjectImpl basicEObjectImpl = (BasicEObjectImpl) parameter;
		basicEObjectImpl
			.eVirtualUnset(basicEObjectImpl
				.eDerivedStructuralFeatureID(UMLPackage.Literals.PARAMETER__DEFAULT));
	}

} // ParameterOperations