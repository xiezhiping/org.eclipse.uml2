/*
 * Copyright (c) 2005, 2013 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 327039, 351774, 412684
 *
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.ConnectableElement;
import org.eclipse.uml2.uml.Connector;
import org.eclipse.uml2.uml.ConnectorEnd;
import org.eclipse.uml2.uml.ConnectorKind;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPlugin;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Connector</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Connector#validateCompatible(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Compatible</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Connector#validateRoles(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Roles</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Connector#validateBetweenInterfacesPorts(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Between Interfaces Ports</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Connector#validateTypes(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Types</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Connector#getKind() <em>Get Kind</em>}</li>
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
	 * @param connector The receiving '<em><b>Connector</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean validateTypes(Connector connector,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		Association connectorType = connector.getType();

		if (connectorType != null) {
			Iterator<ConnectorEnd> ends = connector.getEnds().iterator();
			Iterator<Property> memberEnds = connectorType.getMemberEnds()
				.iterator();

			while (ends.hasNext() && memberEnds.hasNext()) {
				ConnectableElement role = ends.next().getRole();
				Type type = role == null
					? null
					: role.getType();

				Type memberEndType = memberEnds.next().getType();

				if (type == null
					? memberEndType != null
					: !type.conformsTo(memberEndType)) {

					result = false;
					break;
				}
			}

			if (ends.hasNext() || memberEnds.hasNext()) {
				result = false;
			}
		}

		if (!result && diagnostics != null) {
			diagnostics.add(new BasicDiagnostic(Diagnostic.WARNING,
				UMLValidator.DIAGNOSTIC_SOURCE, UMLValidator.CONNECTOR__TYPES,
				UMLPlugin.INSTANCE.getString("_UI_Connector_Types_diagnostic", //$NON-NLS-1$
					getMessageSubstitutions(context, connector)),
				new Object[]{connector}));
		}

		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The connectable elements attached to the ends of a connector must be compatible.
	 * true
	 * @param connector The receiving '<em><b>Connector</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateCompatible(Connector connector,
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
	 * Missing derivation for Connector::/kind : ConnectorKind
	 * result =
	 * if end->exists(
	 * 		role.oclIsKindOf(Port) 
	 * 		and partWithPort->isEmpty()
	 * 		and not role.oclAsType(Port).isBehavior)
	 * then ConnectorKind::delegation 
	 * else ConnectorKind::assembly 
	 * endif
	 * @param connector The receiving '<em><b>Connector</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static ConnectorKind getKind(Connector connector) {

		for (ConnectorEnd end : connector.getEnds()) {
			ConnectableElement role = end.getRole();

			if ((role instanceof Port) && !((Port) role).isBehavior()
				&& end.getPartWithPort() == null) {

				return ConnectorKind.DELEGATION_LITERAL;
			}
		}

		return ConnectorKind.ASSEMBLY_LITERAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ConnectableElements attached as roles to each ConnectorEnd owned by a Connector must be roles of the Classifier that owned the Connector, or they must be ports of such roles.
	 * true
	 * @param connector The receiving '<em><b>Connector</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean validateRoles(Connector connector,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		Iterator<ConnectorEnd> ends = connector.getEnds().iterator();

		while (ends.hasNext()) {
			ConnectorEnd end = ends.next();
			ConnectableElement role = end.getRole();

			Element owner = null;

			if (role instanceof Port) {
				Property partWithPort = end.getPartWithPort();
				owner = partWithPort == null
					? role.getOwner()
					: partWithPort.getOwner();
			} else {
				owner = role == null
					? null
					: role.getOwner();
			}

			if (connector.getOwner() != owner) {

				if (diagnostics != null) {
					diagnostics.add(new BasicDiagnostic(Diagnostic.WARNING,
						UMLValidator.DIAGNOSTIC_SOURCE,
						UMLValidator.CONNECTOR__ROLES, UMLPlugin.INSTANCE
							.getString("_UI_Connector_Roles_diagnostic", //$NON-NLS-1$
								getMessageSubstitutions(context, connector)),
						new Object[]{connector}));
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
	 * A delegation connector must only be defined between used Interfaces or Ports of the same kind, e.g. between two provided Ports or between two required Ports.
	 * true
	 * @param connector The receiving '<em><b>Connector</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean validateBetweenInterfacesPorts(Connector connector,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		EList<ConnectorEnd> ends = connector.getEnds();

		if (connector.getKind() == ConnectorKind.DELEGATION_LITERAL
			&& ends.size() == 2) {

			ConnectableElement role1 = ends.get(0).getRole();
			EList<Interface> required1 = ConnectableElementOperations
				.getRequiredInterfaces(role1);
			EList<Interface> provided1 = ConnectableElementOperations
				.getProvidedInterfaces(role1);

			ConnectableElement role2 = ends.get(1).getRole();
			EList<Interface> required2 = ConnectableElementOperations
				.getRequiredInterfaces(role2);
			EList<Interface> provided2 = ConnectableElementOperations
				.getProvidedInterfaces(role2);

			boolean providedIntersect = true;

			if (provided1.size() > 0 || provided2.size() > 0) {
				providedIntersect = intersect(provided1, provided2);
			}

			boolean requiredIntersect = true;

			if (required1.size() > 0 || required2.size() > 0) {
				requiredIntersect = intersect(required1, required2);
			}

			if (!providedIntersect && !requiredIntersect) {

				if (diagnostics != null) {
					diagnostics.add(new BasicDiagnostic(Diagnostic.WARNING,
						UMLValidator.DIAGNOSTIC_SOURCE,
						UMLValidator.CONNECTOR__BETWEEN_INTERFACES_PORTS,
						UMLPlugin.INSTANCE.getString(
							"_UI_Connector_BetweenInterfacesPorts_diagnostic", //$NON-NLS-1$
							getMessageSubstitutions(context, connector)),
						new Object[]{connector}));
				}

				return false;
			}
		}

		return true;
	}

} // ConnectorOperations