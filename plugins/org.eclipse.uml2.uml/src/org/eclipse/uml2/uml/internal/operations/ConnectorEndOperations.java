/*
 * Copyright (c) 2005, 2007 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: ConnectorEndOperations.java,v 1.9 2007/05/03 21:11:52 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Connector;
import org.eclipse.uml2.uml.ConnectorEnd;
import org.eclipse.uml2.uml.Element;

import org.eclipse.uml2.uml.Property;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Connector End</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.ConnectorEnd#validateMultiplicity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiplicity</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ConnectorEnd#validatePartWithPortEmpty(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Part With Port Empty</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ConnectorEnd#validateRoleAndPartWithPort(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Role And Part With Port</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ConnectorEnd#validateSelfPartWithPort(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Self Part With Port</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ConnectorEnd#getDefiningEnd() <em>Get Defining End</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConnectorEndOperations
		extends MultiplicityElementOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectorEndOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The multiplicity of the connector end may not be more general than the multiplicity of the association typing the owning connector.
	 * true
	 * @param connectorEnd The receiving '<em><b>Connector End</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMultiplicity(ConnectorEnd connectorEnd,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						UMLValidator.CONNECTOR_END__MULTIPLICITY,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateMultiplicity", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(connectorEnd, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{connectorEnd}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If a connector end is attached to a port of the containing classifier, partWithPort will be empty.
	 * true
	 * @param connectorEnd The receiving '<em><b>Connector End</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePartWithPortEmpty(ConnectorEnd connectorEnd,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						UMLValidator.CONNECTOR_END__PART_WITH_PORT_EMPTY,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validatePartWithPortEmpty", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(connectorEnd, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{connectorEnd}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If a connector end references both a role and a partWithPort, then the role must be a port that is defined by the type of the partWithPort.
	 * true
	 * @param connectorEnd The receiving '<em><b>Connector End</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateRoleAndPartWithPort(
			ConnectorEnd connectorEnd, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
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
						UMLValidator.CONNECTOR_END__ROLE_AND_PART_WITH_PORT,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateRoleAndPartWithPort", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(connectorEnd, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{connectorEnd}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The property held in self.partWithPort must not be a Port.
	 * true
	 * @param connectorEnd The receiving '<em><b>Connector End</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateSelfPartWithPort(ConnectorEnd connectorEnd,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						UMLValidator.CONNECTOR_END__SELF_PART_WITH_PORT,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateSelfPartWithPort", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(connectorEnd, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{connectorEnd}));
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
	public static Property getDefiningEnd(ConnectorEnd connectorEnd) {
		Element owner = connectorEnd.getOwner();

		if (owner instanceof Connector) {
			Connector connector = (Connector) owner;
			Association type = connector.getType();

			if (type != null) {
				List<ConnectorEnd> ends = ((InternalEList<ConnectorEnd>) connector
					.getEnds()).basicList();
				List<Property> memberEnds = ((InternalEList<Property>) type
					.getMemberEnds()).basicList();

				if (ends.size() == memberEnds.size()) {
					return memberEnds.get(ends.indexOf(connectorEnd));
				}
			}
		}

		return null;
	}

} // ConnectorEndOperations