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
 * $Id: ReadLinkObjectEndQualifierActionOperations.java,v 1.6 2007/05/03 21:11:51 khussey Exp $
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
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.ReadLinkObjectEndQualifierAction#validateQualifierAttribute(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Qualifier Attribute</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ReadLinkObjectEndQualifierAction#validateAssociationOfAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Association Of Association</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ReadLinkObjectEndQualifierAction#validateEndsOfAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Ends Of Association</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ReadLinkObjectEndQualifierAction#validateTypeOfObject(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Type Of Object</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ReadLinkObjectEndQualifierAction#validateMultiplicityOfQualifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiplicity Of Qualifier</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ReadLinkObjectEndQualifierAction#validateMultiplicityOfObject(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiplicity Of Object</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ReadLinkObjectEndQualifierAction#validateSameType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Same Type</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ReadLinkObjectEndQualifierAction#validateMultiplicityOfResult(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiplicity Of Result</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReadLinkObjectEndQualifierActionOperations
		extends ActivityNodeOperations {

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
	 * The qualifier attribute must be a qualifier attribute of an association end.
	 * self.qualifier.associationEnd->size() = 1
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
				diagnostics
					.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						UMLValidator.DIAGNOSTIC_SOURCE,
						UMLValidator.READ_LINK_OBJECT_END_QUALIFIER_ACTION__QUALIFIER_ATTRIBUTE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateQualifierAttribute", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(readLinkObjectEndQualifierAction, context)}), //$NON-NLS-1$ //$NON-NLS-2$
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
	 * The association of the association end of the qualifier attribute must be an association class.
	 * self.qualifier.associationEnd.association.oclIsKindOf(AssociationClass)
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
				diagnostics
					.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						UMLValidator.DIAGNOSTIC_SOURCE,
						UMLValidator.READ_LINK_OBJECT_END_QUALIFIER_ACTION__ASSOCIATION_OF_ASSOCIATION,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateAssociationOfAssociation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(readLinkObjectEndQualifierAction, context)}), //$NON-NLS-1$ //$NON-NLS-2$
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
	 * The ends of the association must not be static.
	 * self.qualifier.associationEnd.association.memberEnd->forall(e | not e.isStatic)
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
				diagnostics
					.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						UMLValidator.DIAGNOSTIC_SOURCE,
						UMLValidator.READ_LINK_OBJECT_END_QUALIFIER_ACTION__ENDS_OF_ASSOCIATION,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateEndsOfAssociation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(readLinkObjectEndQualifierAction, context)}), //$NON-NLS-1$ //$NON-NLS-2$
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
	 * The type of the object input pin is the association class that owns the association end that has the given qualifier attribute.
	 * self.object.type = self.qualifier.associationEnd.association
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
				diagnostics
					.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						UMLValidator.DIAGNOSTIC_SOURCE,
						UMLValidator.READ_LINK_OBJECT_END_QUALIFIER_ACTION__TYPE_OF_OBJECT,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateTypeOfObject", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(readLinkObjectEndQualifierAction, context)}), //$NON-NLS-1$ //$NON-NLS-2$
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
	 * The multiplicity of the qualifier attribute is 1..1.
	 * self.qualifier.multiplicity.is(1,1)
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
				diagnostics
					.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						UMLValidator.DIAGNOSTIC_SOURCE,
						UMLValidator.READ_LINK_OBJECT_END_QUALIFIER_ACTION__MULTIPLICITY_OF_QUALIFIER,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateMultiplicityOfQualifier", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(readLinkObjectEndQualifierAction, context)}), //$NON-NLS-1$ //$NON-NLS-2$
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
	 * The multiplicity of the object input pin is 1..1.
	 * self.object.multiplicity.is(1,1)
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
				diagnostics
					.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						UMLValidator.DIAGNOSTIC_SOURCE,
						UMLValidator.READ_LINK_OBJECT_END_QUALIFIER_ACTION__MULTIPLICITY_OF_OBJECT,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateMultiplicityOfObject", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(readLinkObjectEndQualifierAction, context)}), //$NON-NLS-1$ //$NON-NLS-2$
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
	 * The type of the result output pin is the same as the type of the qualifier attribute.
	 * self.result.type = self.qualifier.type
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
				diagnostics
					.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						UMLValidator.DIAGNOSTIC_SOURCE,
						UMLValidator.READ_LINK_OBJECT_END_QUALIFIER_ACTION__SAME_TYPE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateSameType", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(readLinkObjectEndQualifierAction, context)}), //$NON-NLS-1$ //$NON-NLS-2$
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
	 * The multiplicity of the result output pin is 1..1.
	 * self.result.multiplicity.is(1,1)
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
				diagnostics
					.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						UMLValidator.DIAGNOSTIC_SOURCE,
						UMLValidator.READ_LINK_OBJECT_END_QUALIFIER_ACTION__MULTIPLICITY_OF_RESULT,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateMultiplicityOfResult", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(readLinkObjectEndQualifierAction, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{readLinkObjectEndQualifierAction}));
			}
			return false;
		}
		return true;
	}

} // ReadLinkObjectEndQualifierActionOperations