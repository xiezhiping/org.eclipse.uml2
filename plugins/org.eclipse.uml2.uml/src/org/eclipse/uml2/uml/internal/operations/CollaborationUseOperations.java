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

import org.eclipse.uml2.uml.CollaborationUse;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Collaboration Use</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.CollaborationUse#validateClientElements(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Client Elements</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.CollaborationUse#validateEveryRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Every Role</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.CollaborationUse#validateConnectors(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Connectors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CollaborationUseOperations
		extends NamedElementOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CollaborationUseOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All the client elements of a roleBinding are in one Classifier and all supplier elements of a roleBinding are in one Collaboration.
	 * roleBinding->collect(client)->forAll(ne1, ne2 |
	 *   ne1.oclIsKindOf(ConnectableElement) and ne2.oclIsKindOf(ConnectableElement) and
	 *     let ce1 : ConnectableElement = ne1.oclAsType(ConnectableElement), ce2 : ConnectableElement = ne2.oclAsType(ConnectableElement) in
	 *       ce1.structuredClassifier = ce2.structuredClassifier)
	 * and
	 *   roleBinding->collect(supplier)->forAll(ne1, ne2 |
	 *   ne1.oclIsKindOf(ConnectableElement) and ne2.oclIsKindOf(ConnectableElement) and
	 *     let ce1 : ConnectableElement = ne1.oclAsType(ConnectableElement), ce2 : ConnectableElement = ne2.oclAsType(ConnectableElement) in
	 *       ce1.collaboration = ce2.collaboration)
	 * @param collaborationUse The receiving '<em><b>Collaboration Use</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateClientElements(
			CollaborationUse collaborationUse, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.COLLABORATION_USE__CLIENT_ELEMENTS,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateClientElements", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(collaborationUse, context)}),
					new Object[]{collaborationUse}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Every collaborationRole in the Collaboration is bound within the CollaborationUse.
	 * type.collaborationRole->forAll(role | roleBinding->exists(rb | rb.supplier->includes(role)))
	 * @param collaborationUse The receiving '<em><b>Collaboration Use</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateEveryRole(CollaborationUse collaborationUse,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.COLLABORATION_USE__EVERY_ROLE,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateEveryRole", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(collaborationUse, context)}),
					new Object[]{collaborationUse}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Connectors in a Collaboration typing a CollaborationUse must have corresponding Connectors between elements bound in the context Classifier, and these corresponding Connectors must have the same or more general type than the Collaboration Connectors.
	 * type.ownedConnector->forAll(connector |
	 *   let rolesConnectedInCollab : Set(ConnectableElement) = connector.end.role->asSet(),
	 *         relevantBindings : Set(Dependency) = roleBinding->select(rb | rb.supplier->intersection(rolesConnectedInCollab)->notEmpty()),
	 *         boundRoles : Set(ConnectableElement) = relevantBindings->collect(client.oclAsType(ConnectableElement))->asSet(),
	 *         contextClassifier : StructuredClassifier = boundRoles->any(true).structuredClassifier->any(true) in
	 *           contextClassifier.ownedConnector->exists( correspondingConnector | 
	 *               correspondingConnector.end.role->forAll( role | boundRoles->includes(role) )
	 *               and (connector.type->notEmpty() and correspondingConnector.type->notEmpty()) implies connector.type->forAll(conformsTo(correspondingConnector.type)) )
	 * )
	 * @param collaborationUse The receiving '<em><b>Collaboration Use</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConnectors(CollaborationUse collaborationUse,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.COLLABORATION_USE__CONNECTORS,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateConnectors", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(collaborationUse, context)}),
					new Object[]{collaborationUse}));
			}
			return false;
		}
		return true;
	}

} // CollaborationUseOperations