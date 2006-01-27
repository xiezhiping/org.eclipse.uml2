/*
 * Copyright (c) 2005, 2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: UseCaseOperations.java,v 1.6 2006/01/27 04:55:56 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.common.util.UniqueEList;

import org.eclipse.uml2.uml.UseCase;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Use Case</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.UseCase#validateMustHaveName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Must Have Name</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.UseCase#validateBinaryAssociations(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Binary Associations</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.UseCase#validateNoAssociationToUseCase(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate No Association To Use Case</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.UseCase#validateCannotIncludeSelf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cannot Include Self</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.UseCase#allIncludedUseCases() <em>All Included Use Cases</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UseCaseOperations
		extends BehavioredClassifierOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UseCaseOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A UseCase must have a name.
	 * self.name -> notEmpty ()
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMustHaveName(UseCase useCase,
			DiagnosticChain diagnostics, Map context) {
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
						UMLValidator.USE_CASE__MUST_HAVE_NAME,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateMustHaveName", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(useCase, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{useCase}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * UseCases can only be involved in binary Associations.
	 * true
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateBinaryAssociations(UseCase useCase,
			DiagnosticChain diagnostics, Map context) {
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
						UMLValidator.USE_CASE__BINARY_ASSOCIATIONS,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateBinaryAssociations", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(useCase, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{useCase}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * UseCases can not have Associations to UseCases specifying the same subject.
	 * true
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateNoAssociationToUseCase(UseCase useCase,
			DiagnosticChain diagnostics, Map context) {
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
						UMLValidator.USE_CASE__NO_ASSOCIATION_TO_USE_CASE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateNoAssociationToUseCase", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(useCase, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{useCase}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A use case cannot include use cases that directly or indirectly include it.
	 * not self.allIncludedUseCases()->includes(self)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateCannotIncludeSelf(UseCase useCase,
			DiagnosticChain diagnostics, Map context) {
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
						UMLValidator.USE_CASE__CANNOT_INCLUDE_SELF,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateCannotIncludeSelf", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(useCase, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{useCase}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query allIncludedUseCases() returns the transitive closure of all use cases (directly or indirectly) included by this use case.
	 * result = self.include->union(self.include->collect(in | in.allIncludedUseCases()))
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList allIncludedUseCases(UseCase useCase) {
		EList includes = useCase.getIncludes();
		EList allIncludedUseCases = new UniqueEList.FastCompare(includes);

		for (Iterator i = includes.iterator(); i.hasNext();) {
			allIncludedUseCases.addAll(((UseCase) i.next())
				.allIncludedUseCases());
		}

		return ECollections.unmodifiableEList(allIncludedUseCases);
	}

} // UseCaseOperations