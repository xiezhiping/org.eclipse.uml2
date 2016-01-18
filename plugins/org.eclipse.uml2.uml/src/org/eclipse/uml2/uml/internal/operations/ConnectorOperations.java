/*
 * Copyright (c) 2005, 2016 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 327039, 351774, 412684, 418466, 451350, 485756
 *
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.ConnectableElement;
import org.eclipse.uml2.uml.Connector;
import org.eclipse.uml2.uml.ConnectorEnd;
import org.eclipse.uml2.uml.ConnectorKind;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.StructuredClassifier;
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
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Connector#validateTypes(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Types</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Connector#validateRoles(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Roles</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Connector#getKind() <em>Get Kind</em>}</li>
 * </ul>
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
	 * The types of the ConnectableElements that the ends of a Connector are attached to must conform to the types of the ends of the Association that types the Connector, if any.
	 * type<>null implies 
	 *   let noOfEnds : Integer = end->size() in 
	 *   (type.memberEnd->size() = noOfEnds) and Sequence{1..noOfEnds}->forAll(i | end->at(i).role.type.conformsTo(type.memberEnd->at(i).type))
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
	 * Derivation for Connector::/kind : ConnectorKind
	 * result = (if end->exists(
	 *         role.oclIsKindOf(Port) 
	 *         and partWithPort->isEmpty()
	 *         and not role.oclAsType(Port).isBehavior)
	 * then ConnectorKind::delegation 
	 * else ConnectorKind::assembly 
	 * endif)
	 * <p>From package UML::StructuredClassifiers.</p>
	 * @param connector The receiving '<em><b>Connector</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static ConnectorKind getKind(Connector connector) {

		for (ConnectorEnd end : connector.getEnds()) {
			ConnectableElement role = end.getRole();

			if ((role instanceof Port) && end.getPartWithPort() == null
				&& !((Port) role).isBehavior()) {

				return ConnectorKind.DELEGATION_LITERAL;
			}
		}

		return ConnectorKind.ASSEMBLY_LITERAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ConnectableElements attached as roles to each ConnectorEnd owned by a Connector must be owned or inherited roles of the Classifier that owned the Connector, or they must be Ports of such roles.
	 * structuredClassifier <> null
	 * and
	 *   end->forAll( e | structuredClassifier.allRoles()->includes(e.role)
	 * or
	 *   e.role.oclIsKindOf(Port) and structuredClassifier.allRoles()->includes(e.partWithPort))
	 * @param connector The receiving '<em><b>Connector</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean validateRoles(Connector connector,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		EObject eContainer = connector.eContainer();

		if (eContainer instanceof StructuredClassifier) {
			EList<ConnectableElement> allRoles = ((StructuredClassifier) eContainer)
				.allRoles();

			for (ConnectorEnd e : connector.getEnds()) {
				ConnectableElement role = e.getRole();

				if (role != null) {

					if (!allRoles.contains(role)) {

						if (!(role instanceof Port)
							|| !(allRoles.contains(e.getPartWithPort()))) {

							if (diagnostics != null) {
								diagnostics
									.add(new BasicDiagnostic(Diagnostic.WARNING,
										UMLValidator.DIAGNOSTIC_SOURCE,
										UMLValidator.CONNECTOR__ROLES,
										UMLPlugin.INSTANCE.getString(
											"_UI_Connector_Roles_diagnostic", //$NON-NLS-1$
											getMessageSubstitutions(context,
												connector)),
									new Object[]{connector}));
							}

							return false;
						}
					}
				}
			}
		}

		return true;
	}

} // ConnectorOperations