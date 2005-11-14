/*
 * Copyright (c) 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: AssociationClassOperations.java,v 1.1 2005/11/14 22:25:54 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.uml2.uml.AssociationClass;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Association Class</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.AssociationClass#validateCannotBeDefined(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cannot Be Defined</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.AssociationClass#allConnections() <em>All Connections</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public final class AssociationClassOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private AssociationClassOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An AssociationClass cannot be defined between itself and something else.
	 * self.endType->excludes(self) and self.endType>collect(et|et.allparents()->excludes(self))
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateCannotBeDefined(
			AssociationClass associationClass, DiagnosticChain diagnostics,
			Map context) {
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
						UMLValidator.ASSOCIATION_CLASS__CANNOT_BE_DEFINED,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateCannotBeDefined", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(associationClass, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{associationClass}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The operation allConnections results in the set of all AssociationEnds of the Association.
	 * result = memberEnd->union ( self.parents ()->collect (p | p.allConnections () )
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static List allConnections(AssociationClass associationClass) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

} // AssociationClassOperations