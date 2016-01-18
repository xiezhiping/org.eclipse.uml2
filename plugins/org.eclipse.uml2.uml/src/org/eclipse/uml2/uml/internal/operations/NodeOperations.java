/*
 * Copyright (c) 2005, 2016 IBM Corporation, Embarcadero Technologies, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (Embarcadero Technologies) - 205188
 *   Kenn Hussey (CEA) - 418466, 451350, 485756
 *
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.UniqueEList;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.uml2.uml.AggregationKind;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.CommunicationPath;
import org.eclipse.uml2.uml.Node;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.UMLPackage;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Node</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Node#validateInternalStructure(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Internal Structure</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Node#createCommunicationPath(boolean, org.eclipse.uml2.uml.AggregationKind, java.lang.String, int, int, org.eclipse.uml2.uml.Node, boolean, org.eclipse.uml2.uml.AggregationKind, java.lang.String, int, int) <em>Create Communication Path</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Node#getCommunicationPaths() <em>Get Communication Paths</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeOperations
		extends ClassOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The internal structure of a Node (if defined) consists solely of parts of type Node.
	 * part->forAll(oclIsKindOf(Node))
	 * @param node The receiving '<em><b>Node</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateInternalStructure(Node node,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.NODE__INTERNAL_STRUCTURE,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateInternalStructure", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(node, context)}),
					new Object[]{node}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates a (binary) communication path between this node and the specified other node, with the specified navigabilities, aggregations, names, lower bounds, and upper bounds, and owned by this node's nearest package.
	 * @param node The receiving '<em><b>Node</b></em>' model object.
	 * @param end1IsNavigable The navigability for the first end of the new communication path.
	 * @param end1Aggregation The aggregation for the first end of the new communication path.
	 * @param end1Name The name for the first end of the new communication path.
	 * @param end1Lower The lower bound for the first end of the new communication path.
	 * @param end1Upper The upper bound for the first end of the new communication path.
	 * @param end1Node The type for the first end of the new communication path.
	 * @param end2IsNavigable The navigability for the second end of the new communication path.
	 * @param end2Aggregation The aggregation for the second end of the new communication path.
	 * @param end2Name The name for the second end of the new communication path.
	 * @param end2Lower The lower bound for the second end of the new communication path.
	 * @param end2Upper The upper bound for the second end of the new communication path.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static CommunicationPath createCommunicationPath(Node node,
			boolean end1IsNavigable, AggregationKind end1Aggregation,
			String end1Name, int end1Lower, int end1Upper, Node end1Node,
			boolean end2IsNavigable, AggregationKind end2Aggregation,
			String end2Name, int end2Lower, int end2Upper) {
		return (CommunicationPath) TypeOperations.createAssociation(node,
			end1IsNavigable, end1Aggregation, end1Name, end1Lower, end1Upper,
			end1Node, end2IsNavigable, end2Aggregation, end2Name, end2Lower,
			end2Upper, UMLPackage.Literals.COMMUNICATION_PATH);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the communication paths in which this node is involved.
	 * @param node The receiving '<em><b>Node</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<CommunicationPath> getCommunicationPaths(Node node) {
		EList<CommunicationPath> communicationPaths = new UniqueEList.FastCompare<CommunicationPath>();

		for (EStructuralFeature.Setting nonNavigableInverseReference : getNonNavigableInverseReferences(
			node)) {

			if (nonNavigableInverseReference
				.getEStructuralFeature() == UMLPackage.Literals.TYPED_ELEMENT__TYPE) {
				EObject eObject = nonNavigableInverseReference.getEObject();

				if (eObject instanceof Property) {
					Association association = ((Property) eObject)
						.getAssociation();

					if (association instanceof CommunicationPath) {
						communicationPaths.add((CommunicationPath) association);
					}
				}
			}
		}

		return ECollections.unmodifiableEList(communicationPaths);
	}

} // NodeOperations