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
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.UniqueEList;

import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.LinkEndData;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.ReadLinkAction;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Read Link Action</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.ReadLinkAction#validateTypeAndOrdering(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Type And Ordering</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ReadLinkAction#validateCompatibleMultiplicity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Compatible Multiplicity</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ReadLinkAction#validateVisibility(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visibility</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ReadLinkAction#validateOneOpenEnd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate One Open End</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ReadLinkAction#validateNavigableOpenEnd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Navigable Open End</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ReadLinkAction#openEnd() <em>Open End</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReadLinkActionOperations
		extends LinkActionOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReadLinkActionOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Exactly one linkEndData specification (corresponding to the "open" end) must not have an value InputPin.
	 * self.openEnd()->size() = 1
	 * @param readLinkAction The receiving '<em><b>Read Link Action</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateOneOpenEnd(ReadLinkAction readLinkAction,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.READ_LINK_ACTION__ONE_OPEN_END,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateOneOpenEnd", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(readLinkAction, context)}),
					new Object[]{readLinkAction}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type and ordering of the result OutputPin are same as the type and ordering of the open Association end.
	 * self.openEnd()->forAll(type=result.type and isOrdered=result.isOrdered)
	 * @param readLinkAction The receiving '<em><b>Read Link Action</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateTypeAndOrdering(ReadLinkAction readLinkAction,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.READ_LINK_ACTION__TYPE_AND_ORDERING,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateTypeAndOrdering", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(readLinkAction, context)}),
					new Object[]{readLinkAction}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The multiplicity of the open Association end must be compatible with the multiplicity of the result OutputPin.
	 * self.openEnd()->first().compatibleWith(result)
	 * @param readLinkAction The receiving '<em><b>Read Link Action</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateCompatibleMultiplicity(
			ReadLinkAction readLinkAction, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.READ_LINK_ACTION__COMPATIBLE_MULTIPLICITY,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateCompatibleMultiplicity", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(readLinkAction, context)}),
					new Object[]{readLinkAction}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The open end must be navigable.
	 * self.openEnd()->first().isNavigable()
	 * @param readLinkAction The receiving '<em><b>Read Link Action</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateNavigableOpenEnd(
			ReadLinkAction readLinkAction, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.READ_LINK_ACTION__NAVIGABLE_OPEN_END,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateNavigableOpenEnd", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(readLinkAction, context)}),
					new Object[]{readLinkAction}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the ends corresponding to endData with no value InputPin. (A well-formed ReadLinkAction is constrained to have only one of these.)
	 * result = (endData->select(value=null).end->asOrderedSet())
	 * <p>From package UML::Actions.</p>
	 * @param readLinkAction The receiving '<em><b>Read Link Action</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<Property> openEnd(ReadLinkAction readLinkAction) {
		EList<Property> openEnd = new UniqueEList.FastCompare<Property>();

		for (LinkEndData endData : readLinkAction.getEndData()) {

			if (endData.getValue() == null) {
				Property end = endData.getEnd();

				if (end != null) {
					openEnd.add(end);
				}
			}
		}

		return ECollections.unmodifiableEList(openEnd);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Visibility of the open end must allow access from the object performing the action.
	 * let openEnd : Property = self.openEnd()->first() in
	 *   openEnd.visibility = VisibilityKind::public or 
	 *   endData->exists(oed | 
	 *     oed.end<>openEnd and 
	 *     (_'context' = oed.end.type or 
	 *       (openEnd.visibility = VisibilityKind::protected and 
	 *         _'context'.conformsTo(oed.end.type.oclAsType(Classifier)))))
	 * @param readLinkAction The receiving '<em><b>Read Link Action</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateVisibility(ReadLinkAction readLinkAction,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.READ_LINK_ACTION__VISIBILITY,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateVisibility", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(readLinkAction, context)}),
					new Object[]{readLinkAction}));
			}
			return false;
		}
		return true;
	}

} // ReadLinkActionOperations