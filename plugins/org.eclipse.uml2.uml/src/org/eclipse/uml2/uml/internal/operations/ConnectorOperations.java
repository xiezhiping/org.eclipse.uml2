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
 * $Id: ConnectorOperations.java,v 1.4 2006/01/05 22:43:26 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.uml2.uml.Connector;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Connector</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Connector#validateTypes(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Types</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Connector#validateCompatible(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Compatible</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Connector#validateRoles(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Roles</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Connector#validateBetweenInterfacesPorts(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Between Interfaces Ports</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Connector#validateBetweenInterfacePortImplements(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Between Interface Port Implements</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Connector#validateBetweenInterfacePortSignature(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Between Interface Port Signature</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Connector#validateUnionSignatureCompatible(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Union Signature Compatible</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Connector#validateAssemblyConnector(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assembly Connector</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConnectorOperations
		extends RedefinableElementOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectorOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The types of the connectable elements that the ends of a connector are attached to must conform to the types of the association ends of the association that types the connector, if any.
	 * true
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateTypes(Connector connector,
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
						UMLValidator.CONNECTOR__TYPES,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateTypes", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(connector, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{connector}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The connectable elements attached to the ends of a connector must be compatible.
	 * true
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateCompatible(Connector connector,
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
						UMLValidator.CONNECTOR__COMPATIBLE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateCompatible", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(connector, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{connector}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ConnectableElements attached as roles to each ConnectorEnd owned by a Connector must be roles of the Classifier that owned the Connector, or they must be ports of such roles.
	 * true
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateRoles(Connector connector,
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
						UMLValidator.CONNECTOR__ROLES,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateRoles", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(connector, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{connector}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A delegation connector must only be defined between used Interfaces or Ports of the same kind, e.g. between two provided Ports or between two required Ports.
	 * true
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateBetweenInterfacesPorts(Connector connector,
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
						UMLValidator.CONNECTOR__BETWEEN_INTERFACES_PORTS,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateBetweenInterfacesPorts", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(connector, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{connector}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If a delegation connector is defined between a used Interface or Port and an internal Part Classifier, then that Classifier must have an 'implements' relationship to the Interface type of that Port.
	 * true
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateBetweenInterfacePortImplements(
			Connector connector, DiagnosticChain diagnostics, Map context) {
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
						UMLValidator.CONNECTOR__BETWEEN_INTERFACE_PORT_IMPLEMENTS,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateBetweenInterfacePortImplements", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(connector, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{connector}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If a delegation connector is defined between a source Interface or Port and a target Interface or Port, then the target Interface must support a signature compatible subset of Operations of the source Interface or Port.
	 * true
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateBetweenInterfacePortSignature(
			Connector connector, DiagnosticChain diagnostics, Map context) {
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
						UMLValidator.CONNECTOR__BETWEEN_INTERFACE_PORT_SIGNATURE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateBetweenInterfacePortSignature", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(connector, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{connector}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In a complete model, if a source Port has delegation connectors to a set of delegated target Ports, then the union of the Interfaces of these target Ports must be signature compatible with the Interface that types the source Port.
	 * true
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnionSignatureCompatible(Connector connector,
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
						UMLValidator.CONNECTOR__UNION_SIGNATURE_COMPATIBLE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateUnionSignatureCompatible", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(connector, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{connector}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An assembly connector must only be defined from a required Interface or Ports to a provided Interface or Port.
	 * true
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAssemblyConnector(Connector connector,
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
						UMLValidator.CONNECTOR__ASSEMBLY_CONNECTOR,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateAssemblyConnector", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(connector, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{connector}));
			}
			return false;
		}
		return true;
	}

} // ConnectorOperations