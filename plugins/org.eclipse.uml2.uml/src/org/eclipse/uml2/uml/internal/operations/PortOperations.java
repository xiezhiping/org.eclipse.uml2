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
 * $Id: PortOperations.java,v 1.2 2005/11/16 19:03:05 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.uml2.uml.Port;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Port</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Port#validateRequiredInterfaces(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Required Interfaces</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Port#validatePortAggregation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Port Aggregation</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Port#validatePortDestroyed(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Port Destroyed</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Port#validateDefaultValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Default Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Port#getProvideds() <em>Get Provideds</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Port#getRequireds() <em>Get Requireds</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public final class PortOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private PortOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The required interfaces of a port must be provided by elements to which the port is connected.
	 * true
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateRequiredInterfaces(Port port,
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
						UMLValidator.PORT__REQUIRED_INTERFACES,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateRequiredInterfaces", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(port, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{port}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Port.aggregation must be composite.
	 * true
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePortAggregation(Port port,
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
						UMLValidator.PORT__PORT_AGGREGATION,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validatePortAggregation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(port, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{port}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When a port is destroyed, all connectors attached to this port will be destroyed also.
	 * true
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePortDestroyed(Port port,
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
						UMLValidator.PORT__PORT_DESTROYED,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validatePortDestroyed", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(port, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{port}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A defaultValue for port cannot be specified when the type of the Port is an Interface
	 * true
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateDefaultValue(Port port,
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
						UMLValidator.PORT__DEFAULT_VALUE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateDefaultValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(port, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{port}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static List getProvideds(Port port) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static List getRequireds(Port port) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

} // PortOperations