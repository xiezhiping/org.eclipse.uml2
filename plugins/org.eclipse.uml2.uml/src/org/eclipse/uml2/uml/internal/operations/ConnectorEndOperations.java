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
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.ConnectorEnd#validateRoleAndPartWithPort(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Role And Part With Port</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ConnectorEnd#validatePartWithPortEmpty(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Part With Port Empty</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ConnectorEnd#validateMultiplicity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiplicity</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ConnectorEnd#validateSelfPartWithPort(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Self Part With Port</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ConnectorEnd#getDefiningEnd() <em>Get Defining End</em>}</li>
 * </ul>
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
	 * The multiplicity of the ConnectorEnd may not be more general than the multiplicity of the corresponding end of the Association typing the owning Connector, if any.
	 * self.compatibleWith(definingEnd)
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
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.CONNECTOR_END__MULTIPLICITY,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateMultiplicity", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(connectorEnd, context)}),
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
	 * If a ConnectorEnd is attached to a Port of the containing Classifier, partWithPort will be empty.
	 * (role.oclIsKindOf(Port) and role.owner = connector.owner) implies partWithPort->isEmpty()
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
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.CONNECTOR_END__PART_WITH_PORT_EMPTY,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validatePartWithPortEmpty", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(connectorEnd, context)}),
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
	 * If a ConnectorEnd references a partWithPort, then the role must be a Port that is defined or inherited by the type of the partWithPort.
	 * partWithPort->notEmpty() implies 
	 *   (role.oclIsKindOf(Port) and partWithPort.type.oclAsType(Namespace).member->includes(role))
	 * @param connectorEnd The receiving '<em><b>Connector End</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateRoleAndPartWithPort(ConnectorEnd connectorEnd,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.CONNECTOR_END__ROLE_AND_PART_WITH_PORT,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateRoleAndPartWithPort", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(connectorEnd, context)}),
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
	 * The Property held in self.partWithPort must not be a Port.
	 * partWithPort->notEmpty() implies not partWithPort.oclIsKindOf(Port)
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
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.CONNECTOR_END__SELF_PART_WITH_PORT,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateSelfPartWithPort", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(connectorEnd, context)}),
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
	 * Derivation for ConnectorEnd::/definingEnd : Property
	 * result = (if connector.type = null 
	 * then
	 *   null 
	 * else
	 *   let index : Integer = connector.end->indexOf(self) in
	 *     connector.type.memberEnd->at(index)
	 * endif)
	 * <p>From package UML::StructuredClassifiers.</p>
	 * @param connectorEnd The receiving '<em><b>Connector End</b></em>' model object.
	 * <!-- end-model-doc -->
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