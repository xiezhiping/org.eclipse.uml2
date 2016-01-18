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

import org.eclipse.uml2.uml.ReadLinkObjectEndQualifierAction;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Read Link Object End Qualifier Action</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.ReadLinkObjectEndQualifierAction#validateMultiplicityOfObject(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiplicity Of Object</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ReadLinkObjectEndQualifierAction#validateTypeOfObject(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Type Of Object</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ReadLinkObjectEndQualifierAction#validateMultiplicityOfQualifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiplicity Of Qualifier</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ReadLinkObjectEndQualifierAction#validateEndsOfAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Ends Of Association</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ReadLinkObjectEndQualifierAction#validateMultiplicityOfResult(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiplicity Of Result</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ReadLinkObjectEndQualifierAction#validateSameType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Same Type</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ReadLinkObjectEndQualifierAction#validateAssociationOfAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Association Of Association</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ReadLinkObjectEndQualifierAction#validateQualifierAttribute(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Qualifier Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReadLinkObjectEndQualifierActionOperations
		extends ActionOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReadLinkObjectEndQualifierActionOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The qualifier Property must be a qualifier of an Association end.
	 * qualifier.associationEnd <> null
	 * @param readLinkObjectEndQualifierAction The receiving '<em><b>Read Link Object End Qualifier Action</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateQualifierAttribute(
			ReadLinkObjectEndQualifierAction readLinkObjectEndQualifierAction,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.READ_LINK_OBJECT_END_QUALIFIER_ACTION__QUALIFIER_ATTRIBUTE,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateQualifierAttribute", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(
									readLinkObjectEndQualifierAction,
									context)}),
					new Object[]{readLinkObjectEndQualifierAction}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The association of the Association end of the qualifier Property must be an AssociationClass.
	 * qualifier.associationEnd.association.oclIsKindOf(AssociationClass)
	 * @param readLinkObjectEndQualifierAction The receiving '<em><b>Read Link Object End Qualifier Action</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAssociationOfAssociation(
			ReadLinkObjectEndQualifierAction readLinkObjectEndQualifierAction,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.READ_LINK_OBJECT_END_QUALIFIER_ACTION__ASSOCIATION_OF_ASSOCIATION,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateAssociationOfAssociation", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(
									readLinkObjectEndQualifierAction,
									context)}),
					new Object[]{readLinkObjectEndQualifierAction}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ends of the Association must not be static.
	 * qualifier.associationEnd.association.memberEnd->forAll(e | not e.isStatic)
	 * @param readLinkObjectEndQualifierAction The receiving '<em><b>Read Link Object End Qualifier Action</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateEndsOfAssociation(
			ReadLinkObjectEndQualifierAction readLinkObjectEndQualifierAction,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.READ_LINK_OBJECT_END_QUALIFIER_ACTION__ENDS_OF_ASSOCIATION,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateEndsOfAssociation", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(
									readLinkObjectEndQualifierAction,
									context)}),
					new Object[]{readLinkObjectEndQualifierAction}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of the object InputPin is the AssociationClass that owns the Association end that has the given qualifier Property.
	 * object.type = qualifier.associationEnd.association
	 * @param readLinkObjectEndQualifierAction The receiving '<em><b>Read Link Object End Qualifier Action</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateTypeOfObject(
			ReadLinkObjectEndQualifierAction readLinkObjectEndQualifierAction,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.READ_LINK_OBJECT_END_QUALIFIER_ACTION__TYPE_OF_OBJECT,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateTypeOfObject", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(
									readLinkObjectEndQualifierAction,
									context)}),
					new Object[]{readLinkObjectEndQualifierAction}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The multiplicity of the qualifier Property is 1..1.
	 * qualifier.is(1,1)
	 * @param readLinkObjectEndQualifierAction The receiving '<em><b>Read Link Object End Qualifier Action</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMultiplicityOfQualifier(
			ReadLinkObjectEndQualifierAction readLinkObjectEndQualifierAction,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.READ_LINK_OBJECT_END_QUALIFIER_ACTION__MULTIPLICITY_OF_QUALIFIER,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateMultiplicityOfQualifier", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(
									readLinkObjectEndQualifierAction,
									context)}),
					new Object[]{readLinkObjectEndQualifierAction}));
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
	 * @param readLinkObjectEndQualifierAction The receiving '<em><b>Read Link Object End Qualifier Action</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMultiplicityOfObject(
			ReadLinkObjectEndQualifierAction readLinkObjectEndQualifierAction,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.READ_LINK_OBJECT_END_QUALIFIER_ACTION__MULTIPLICITY_OF_OBJECT,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateMultiplicityOfObject", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(
									readLinkObjectEndQualifierAction,
									context)}),
					new Object[]{readLinkObjectEndQualifierAction}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of the result OutputPin is the same as the type of the qualifier Property.
	 * result.type = qualifier.type
	 * @param readLinkObjectEndQualifierAction The receiving '<em><b>Read Link Object End Qualifier Action</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateSameType(
			ReadLinkObjectEndQualifierAction readLinkObjectEndQualifierAction,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.READ_LINK_OBJECT_END_QUALIFIER_ACTION__SAME_TYPE,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateSameType", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(
									readLinkObjectEndQualifierAction,
									context)}),
					new Object[]{readLinkObjectEndQualifierAction}));
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
	 * @param readLinkObjectEndQualifierAction The receiving '<em><b>Read Link Object End Qualifier Action</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMultiplicityOfResult(
			ReadLinkObjectEndQualifierAction readLinkObjectEndQualifierAction,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.READ_LINK_OBJECT_END_QUALIFIER_ACTION__MULTIPLICITY_OF_RESULT,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateMultiplicityOfResult", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(
									readLinkObjectEndQualifierAction,
									context)}),
					new Object[]{readLinkObjectEndQualifierAction}));
			}
			return false;
		}
		return true;
	}

} // ReadLinkObjectEndQualifierActionOperations