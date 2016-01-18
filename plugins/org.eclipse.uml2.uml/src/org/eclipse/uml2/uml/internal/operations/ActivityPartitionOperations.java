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

import org.eclipse.uml2.uml.ActivityPartition;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Activity Partition</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.ActivityPartition#validateRepresentsClassifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Represents Classifier</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ActivityPartition#validateRepresentsPropertyAndIsContained(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Represents Property And Is Contained</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ActivityPartition#validateRepresentsProperty(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Represents Property</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ActivityPartition#validateDimensionNotContained(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dimension Not Contained</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActivityPartitionOperations
		extends ActivityGroupOperations {

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
	 * An ActvivityPartition with isDimension = true may not be contained by another ActivityPartition.
	 * isDimension implies superPartition->isEmpty()
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
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.ACTIVITY_PARTITION__DIMENSION_NOT_CONTAINED,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateDimensionNotContained", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(activityPartition, context)}),
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
	 * If a non-external ActivityPartition represents a Classifier and has a superPartition, then the superPartition must represent a Classifier, and the Classifier of the subpartition must be nested (nestedClassifier or ownedBehavior) in the Classifier represented by the superPartition, or be at the contained end of a composition Association with the Classifier represented by the superPartition.
	 * (not isExternal and represents.oclIsKindOf(Classifier) and superPartition->notEmpty()) implies
	 * (
	 *    let representedClassifier : Classifier = represents.oclAsType(Classifier) in
	 *      superPartition.represents.oclIsKindOf(Classifier) and
	 *       let representedSuperClassifier : Classifier = superPartition.represents.oclAsType(Classifier) in
	 *        (representedSuperClassifier.oclIsKindOf(BehavioredClassifier) and representedClassifier.oclIsKindOf(Behavior) and 
	 *         representedSuperClassifier.oclAsType(BehavioredClassifier).ownedBehavior->includes(representedClassifier.oclAsType(Behavior))) 
	 *        or
	 *        (representedSuperClassifier.oclIsKindOf(Class) and  representedSuperClassifier.oclAsType(Class).nestedClassifier->includes(representedClassifier))
	 *        or
	 *        (Association.allInstances()->exists(a | a.memberEnd->exists(end1 | end1.isComposite and end1.type = representedClassifier and 
	 *                                                                       a.memberEnd->exists(end2 | end1<>end2 and end2.type = representedSuperClassifier))))
	 * )
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
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.ACTIVITY_PARTITION__REPRESENTS_CLASSIFIER,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateRepresentsClassifier", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(activityPartition, context)}),
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
	 * If an ActivityPartition represents a Property and has a superPartition, then the Property must be of a Classifier represented by the superPartition, or of a Classifier that is the type of a Property represented by the superPartition.
	 * (represents.oclIsKindOf(Property) and superPartition->notEmpty()) implies
	 * (
	 *   (superPartition.represents.oclIsKindOf(Classifier) and represents.owner = superPartition.represents) or 
	 *   (superPartition.represents.oclIsKindOf(Property) and represents.owner = superPartition.represents.oclAsType(Property).type)
	 * )
	 * @param activityPartition The receiving '<em><b>Activity Partition</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateRepresentsPropertyAndIsContained(
			ActivityPartition activityPartition, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.ACTIVITY_PARTITION__REPRESENTS_PROPERTY_AND_IS_CONTAINED,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateRepresentsPropertyAndIsContained", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(activityPartition, context)}),
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
	 * If an ActivityPartition represents a Property and has a superPartition representing a Classifier, then all the other non-external subpartitions of the superPartition must represent Properties directly owned by the same Classifier.
	 * (represents.oclIsKindOf(Property) and superPartition->notEmpty() and superPartition.represents.oclIsKindOf(Classifier)) implies
	 * (
	 *   let representedClassifier : Classifier = superPartition.represents.oclAsType(Classifier)
	 *   in
	 *     superPartition.subpartition->reject(isExternal)->forAll(p | 
	 *        p.represents.oclIsKindOf(Property) and p.owner=representedClassifier)
	 * )
	 * @param activityPartition The receiving '<em><b>Activity Partition</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateRepresentsProperty(
			ActivityPartition activityPartition, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.ACTIVITY_PARTITION__REPRESENTS_PROPERTY,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateRepresentsProperty", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(activityPartition, context)}),
					new Object[]{activityPartition}));
			}
			return false;
		}
		return true;
	}

} // ActivityPartitionOperations