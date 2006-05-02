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
 * $Id: ConnectorOperations.java,v 1.8 2006/05/02 20:18:32 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.BehavioredClassifier;
import org.eclipse.uml2.uml.ConnectableElement;
import org.eclipse.uml2.uml.Connector;
import org.eclipse.uml2.uml.ConnectorEnd;
import org.eclipse.uml2.uml.ConnectorKind;
import org.eclipse.uml2.uml.Element;
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
	 * @generated NOT
	 */
	public static boolean validateTypes(Connector connector,
			DiagnosticChain diagnostics, Map context) {
		boolean result = true;
		Association connectorType = connector.getType();

		if (connectorType != null) {
			Iterator ends = connector.getEnds().iterator();
			Iterator memberEnds = connectorType.getMemberEnds().iterator();

			while (ends.hasNext() && memberEnds.hasNext()) {
				ConnectableElement role = ((ConnectorEnd) ends.next())
					.getRole();
				Type type = role == null
					? null
					: role.getType();

				Type memberEndType = ((Property) memberEnds.next()).getType();

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
	 * @generated NOT
	 */
	public static boolean validateRoles(Connector connector,
			DiagnosticChain diagnostics, Map context) {
		EList ends = connector.getEnds();

		if (ends.size() == 2) {
			ConnectorEnd fromEnd = (ConnectorEnd) ends.get(0);
			ConnectableElement fromRole = fromEnd.getRole();
			Element fromOwner = null;

			if (fromRole instanceof Port) {
				fromOwner = fromEnd.getPartWithPort().getOwner();
			} else {
				fromOwner = fromRole == null
					? null
					: fromRole.getOwner();
			}

			ConnectorEnd toEnd = (ConnectorEnd) ends.get(1);
			ConnectableElement toRole = toEnd.getRole();
			Element toOwner = null;

			if (toRole instanceof Port) {
				toOwner = toEnd.getPartWithPort().getOwner();
			} else {
				toOwner = toRole == null
					? null
					: toRole.getOwner();
			}

			Element connectorOwner = connector.getOwner();

			if (connectorOwner != fromOwner || connectorOwner != toOwner) {

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
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean validateBetweenInterfacesPorts(Connector connector,
			DiagnosticChain diagnostics, Map context) {
		EList ends = connector.getEnds();

		if (connector.getKind() == ConnectorKind.DELEGATION_LITERAL
			&& ends.size() == 2) {

			ConnectableElement fromRole = ((ConnectorEnd) ends.get(0))
				.getRole();
			Collection fromRequired = ConnectableElementOperations
				.getRequiredInterfaces(fromRole);
			Collection fromProvided = ConnectableElementOperations
				.getProvidedInterfaces(fromRole);

			ConnectableElement toRole = ((ConnectorEnd) ends.get(1)).getRole();
			Collection toRequired = ConnectableElementOperations
				.getRequiredInterfaces(toRole);
			Collection toProvided = ConnectableElementOperations
				.getProvidedInterfaces(toRole);

			if (intersect(toProvided, fromRequired)
				|| intersect(fromProvided, toRequired)) {

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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If a delegation connector is defined between a used Interface or Port and an internal Part Classifier, then that Classifier must have an 'implements' relationship to the Interface type of that Port.
	 * true
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean validateBetweenInterfacePortImplements(
			Connector connector, DiagnosticChain diagnostics, Map context) {
		EList ends = connector.getEnds();

		if (connector.getKind() == ConnectorKind.DELEGATION_LITERAL
			&& ends.size() == 2) {

			ConnectorEnd fromEnd = (ConnectorEnd) ends.get(0);
			ConnectableElement fromRole = fromEnd.getRole();

			ConnectorEnd toEnd = (ConnectorEnd) ends.get(1);
			ConnectableElement toRole = toEnd.getRole();

			Collection fromProvided = ConnectableElementOperations
				.getProvidedInterfaces(fromRole);

			if (!fromProvided.isEmpty() && !(toRole instanceof Port)
				&& toRole instanceof Property) {

				Type toType = ((Property) toRole).getType();

				if (toType instanceof BehavioredClassifier
					&& (!((BehavioredClassifier) toType)
						.getAllImplementedInterfaces()
						.containsAll(fromProvided))) {

					if (diagnostics != null) {
						diagnostics
							.add(new BasicDiagnostic(
								Diagnostic.WARNING,
								UMLValidator.DIAGNOSTIC_SOURCE,
								UMLValidator.CONNECTOR__BETWEEN_INTERFACE_PORT_IMPLEMENTS,
								UMLPlugin.INSTANCE
									.getString(
										"_UI_Connector_BetweenInterfacePortImplements_diagnostic", //$NON-NLS-1$
										getMessageSubstitutions(context,
											connector)),
								new Object[]{connector}));
					}

					return false;
				}
			}
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
	 * @generated NOT
	 */

	public static boolean validateBetweenInterfacePortSignature(
			Connector connector, DiagnosticChain diagnostics, Map context) {
		boolean result = true;
		EList ends = connector.getEnds();

		if (connector.getKind() == ConnectorKind.DELEGATION_LITERAL
			&& ends.size() == 2) {

			ConnectableElement fromRole = ((ConnectorEnd) ends.get(0))
				.getRole();
			Collection fromRequired = ConnectableElementOperations
				.getRequiredInterfaces(fromRole);
			Collection fromProvided = ConnectableElementOperations
				.getProvidedInterfaces(fromRole);

			ConnectableElement toRole = ((ConnectorEnd) ends.get(1)).getRole();
			Collection toRequired = ConnectableElementOperations
				.getRequiredInterfaces(toRole);
			Collection toProvided = ConnectableElementOperations
				.getProvidedInterfaces(toRole);

			if (!fromProvided.isEmpty() && !toProvided.isEmpty()) {
				result = result && intersect(fromProvided, toProvided);
			}

			if (!fromRequired.isEmpty() && !toRequired.isEmpty()) {
				result = result && intersect(fromRequired, toRequired);
			}

			if (!result && diagnostics != null) {
				diagnostics
					.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						UMLValidator.DIAGNOSTIC_SOURCE,
						UMLValidator.CONNECTOR__BETWEEN_INTERFACE_PORT_SIGNATURE,
						UMLPlugin.INSTANCE
							.getString(
								"_UI_Connector_BetweenInterfacePortSignature_diagnostic", //$NON-NLS-1$
								getMessageSubstitutions(context, connector)),
						new Object[]{connector}));
			}
		}

		return result;
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
	 * @generated NOT
	 */
	public static boolean validateAssemblyConnector(Connector connector,
			DiagnosticChain diagnostics, Map context) {
		EList ends = connector.getEnds();

		if (connector.getKind() == ConnectorKind.ASSEMBLY_LITERAL
			&& ends.size() == 2) {

			ConnectableElement fromRole = ((ConnectorEnd) ends.get(0))
				.getRole();
			Collection fromRequired = ConnectableElementOperations
				.getRequiredInterfaces(fromRole);
			Collection fromProvided = ConnectableElementOperations
				.getProvidedInterfaces(fromRole);

			ConnectableElement toRole = ((ConnectorEnd) ends.get(1)).getRole();
			Collection toRequired = ConnectableElementOperations
				.getRequiredInterfaces(toRole);
			Collection toProvided = ConnectableElementOperations
				.getProvidedInterfaces(toRole);

			if (!intersect(fromProvided, toRequired)
				&& !intersect(toProvided, fromRequired)) {

				if (diagnostics != null) {
					diagnostics.add(new BasicDiagnostic(Diagnostic.WARNING,
						UMLValidator.DIAGNOSTIC_SOURCE,
						UMLValidator.CONNECTOR__ASSEMBLY_CONNECTOR,
						UMLPlugin.INSTANCE.getString(
							"_UI_Connector_AssemblyConnector_diagnostic", //$NON-NLS-1$
							getMessageSubstitutions(context, connector)),
						new Object[]{connector}));
				}

				return false;
			}
		}

		return true;
	}

} // ConnectorOperations