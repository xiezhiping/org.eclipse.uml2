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

import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.ActivityGroup;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Activity Group</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.ActivityGroup#containingActivity() <em>Containing Activity</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ActivityGroup#validateNodesAndEdges(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nodes And Edges</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ActivityGroup#validateNotContained(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Not Contained</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActivityGroupOperations
		extends NamedElementOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityGroupOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Activity that directly or indirectly contains this ActivityGroup.
	 * result = (if superGroup<>null then superGroup.containingActivity()
	 * else inActivity
	 * endif)
	 * <p>From package UML::Activities.</p>
	 * @param activityGroup The receiving '<em><b>Activity Group</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static Activity containingActivity(ActivityGroup activityGroup) {
		ActivityGroup superGroup = activityGroup.getSuperGroup();

		return superGroup != null
			? superGroup.containingActivity()
			: activityGroup.getInActivity();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All containedNodes and containeEdges of an ActivityGroup must be in the same Activity as the group.
	 * containedNode->forAll(activity = self.containingActivity()) and 
	 * containedEdge->forAll(activity = self.containingActivity())
	 * @param activityGroup The receiving '<em><b>Activity Group</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateNodesAndEdges(ActivityGroup activityGroup,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.ACTIVITY_GROUP__NODES_AND_EDGES,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateNodesAndEdges", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(activityGroup, context)}),
					new Object[]{activityGroup}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * No containedNode or containedEdge of an ActivityGroup may be contained by its subgroups or its superGroups, transitively.
	 * subgroup->closure(subgroup).containedNode->excludesAll(containedNode) and
	 * superGroup->closure(superGroup).containedNode->excludesAll(containedNode) and 
	 * subgroup->closure(subgroup).containedEdge->excludesAll(containedEdge) and 
	 * superGroup->closure(superGroup).containedEdge->excludesAll(containedEdge)
	 * @param activityGroup The receiving '<em><b>Activity Group</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateNotContained(ActivityGroup activityGroup,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.ACTIVITY_GROUP__NOT_CONTAINED,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateNotContained", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(activityGroup, context)}),
					new Object[]{activityGroup}));
			}
			return false;
		}
		return true;
	}

} // ActivityGroupOperations