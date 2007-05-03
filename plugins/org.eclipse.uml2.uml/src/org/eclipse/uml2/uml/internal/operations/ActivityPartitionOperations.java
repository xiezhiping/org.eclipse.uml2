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
 * $Id: ActivityPartitionOperations.java,v 1.8 2007/05/03 21:11:51 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.uml2.uml.ActivityPartition;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Activity Partition</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.ActivityPartition#validateDimensionNotContained(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dimension Not Contained</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ActivityPartition#validateRepresentsPart(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Represents Part</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ActivityPartition#validateRepresentsClassifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Represents Classifier</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ActivityPartition#validateRepresentsPartAndIsContained(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Represents Part And Is Contained</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActivityPartitionOperations
		extends NamedElementOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityPartitionOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A partition with isDimension = true may not be contained by another partition.
	 * true
	 * @param activityPartition The receiving '<em><b>Activity Partition</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateDimensionNotContained(
			ActivityPartition activityPartition, DiagnosticChain diagnostics,
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
						UMLValidator.ACTIVITY_PARTITION__DIMENSION_NOT_CONTAINED,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateDimensionNotContained", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(activityPartition, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{activityPartition}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If a partition represents a part, then all the non-external partitions in the same dimension and at the same level of nesting in that dimension must represent parts directly contained in the internal structure of the same classifier.
	 * true
	 * @param activityPartition The receiving '<em><b>Activity Partition</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateRepresentsPart(
			ActivityPartition activityPartition, DiagnosticChain diagnostics,
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
						UMLValidator.ACTIVITY_PARTITION__REPRESENTS_PART,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateRepresentsPart", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(activityPartition, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{activityPartition}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If a non-external partition represents a classifier and is contained in another partition, then the containing partition must represent a classifier, and the classifier of the subpartition must be nested in the classifier represented by the containing partition, or be at the contained end of a strong composition association with the classifier represented by the containing partition.
	 * true
	 * @param activityPartition The receiving '<em><b>Activity Partition</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateRepresentsClassifier(
			ActivityPartition activityPartition, DiagnosticChain diagnostics,
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
						UMLValidator.ACTIVITY_PARTITION__REPRESENTS_CLASSIFIER,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateRepresentsClassifier", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(activityPartition, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{activityPartition}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If a partition represents a part and is contained by another partition, then the part must be of a classifier represented by the containing partition, or of a classifier that is the type of a part representing the containing partition.
	 * true
	 * @param activityPartition The receiving '<em><b>Activity Partition</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateRepresentsPartAndIsContained(
			ActivityPartition activityPartition, DiagnosticChain diagnostics,
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
						UMLValidator.ACTIVITY_PARTITION__REPRESENTS_PART_AND_IS_CONTAINED,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateRepresentsPartAndIsContained", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(activityPartition, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{activityPartition}));
			}
			return false;
		}
		return true;
	}

} // ActivityPartitionOperations