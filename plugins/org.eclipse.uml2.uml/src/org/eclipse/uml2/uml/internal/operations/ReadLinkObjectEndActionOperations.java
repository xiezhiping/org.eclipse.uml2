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

import org.eclipse.uml2.uml.ReadLinkObjectEndAction;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Read Link Object End Action</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.ReadLinkObjectEndAction#validateProperty(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Property</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ReadLinkObjectEndAction#validateMultiplicityOfObject(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiplicity Of Object</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ReadLinkObjectEndAction#validateEndsOfAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Ends Of Association</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ReadLinkObjectEndAction#validateTypeOfResult(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Type Of Result</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ReadLinkObjectEndAction#validateMultiplicityOfResult(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiplicity Of Result</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ReadLinkObjectEndAction#validateTypeOfObject(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Type Of Object</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ReadLinkObjectEndAction#validateAssociationOfAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Association Of Association</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReadLinkObjectEndActionOperations
		extends ActionOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReadLinkObjectEndActionOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The end Property must be an Association memberEnd.
	 * end.association <> null
	 * @param readLinkObjectEndAction The receiving '<em><b>Read Link Object End Action</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProperty(
			ReadLinkObjectEndAction readLinkObjectEndAction,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.READ_LINK_OBJECT_END_ACTION__PROPERTY,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateProperty", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(readLinkObjectEndAction,
									context)}),
					new Object[]{readLinkObjectEndAction}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The association of the end must be an AssociationClass.
	 * end.association.oclIsKindOf(AssociationClass)
	 * @param readLinkObjectEndAction The receiving '<em><b>Read Link Object End Action</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAssociationOfAssociation(
			ReadLinkObjectEndAction readLinkObjectEndAction,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.READ_LINK_OBJECT_END_ACTION__ASSOCIATION_OF_ASSOCIATION,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateAssociationOfAssociation", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(readLinkObjectEndAction,
									context)}),
					new Object[]{readLinkObjectEndAction}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ends of the association must not be static.
	 * end.association.memberEnd->forAll(e | not e.isStatic)
	 * @param readLinkObjectEndAction The receiving '<em><b>Read Link Object End Action</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateEndsOfAssociation(
			ReadLinkObjectEndAction readLinkObjectEndAction,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.READ_LINK_OBJECT_END_ACTION__ENDS_OF_ASSOCIATION,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateEndsOfAssociation", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(readLinkObjectEndAction,
									context)}),
					new Object[]{readLinkObjectEndAction}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of the object InputPin is the AssociationClass that owns the end Property.
	 * object.type = end.association
	 * @param readLinkObjectEndAction The receiving '<em><b>Read Link Object End Action</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateTypeOfObject(
			ReadLinkObjectEndAction readLinkObjectEndAction,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.READ_LINK_OBJECT_END_ACTION__TYPE_OF_OBJECT,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateTypeOfObject", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(readLinkObjectEndAction,
									context)}),
					new Object[]{readLinkObjectEndAction}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The multiplicity of the object InputPin is 1..1.
	 * object.is(1,1)
	 * @param readLinkObjectEndAction The receiving '<em><b>Read Link Object End Action</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMultiplicityOfObject(
			ReadLinkObjectEndAction readLinkObjectEndAction,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.READ_LINK_OBJECT_END_ACTION__MULTIPLICITY_OF_OBJECT,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateMultiplicityOfObject", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(readLinkObjectEndAction,
									context)}),
					new Object[]{readLinkObjectEndAction}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of the result OutputPin is the same as the type of the end Property.
	 * result.type = end.type
	 * @param readLinkObjectEndAction The receiving '<em><b>Read Link Object End Action</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateTypeOfResult(
			ReadLinkObjectEndAction readLinkObjectEndAction,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.READ_LINK_OBJECT_END_ACTION__TYPE_OF_RESULT,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateTypeOfResult", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(readLinkObjectEndAction,
									context)}),
					new Object[]{readLinkObjectEndAction}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The multiplicity of the result OutputPin is 1..1.
	 * result.is(1,1)
	 * @param readLinkObjectEndAction The receiving '<em><b>Read Link Object End Action</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMultiplicityOfResult(
			ReadLinkObjectEndAction readLinkObjectEndAction,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.READ_LINK_OBJECT_END_ACTION__MULTIPLICITY_OF_RESULT,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateMultiplicityOfResult", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(readLinkObjectEndAction,
									context)}),
					new Object[]{readLinkObjectEndAction}));
			}
			return false;
		}
		return true;
	}

} // ReadLinkObjectEndActionOperations