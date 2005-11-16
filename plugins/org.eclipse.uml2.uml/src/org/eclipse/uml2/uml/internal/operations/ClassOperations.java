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
 * $Id: ClassOperations.java,v 1.2 2005/11/16 19:03:05 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Class</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Class#validatePassiveClass(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Passive Class</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Class#getExtensions() <em>Get Extensions</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Class#inherit(java.util.List) <em>Inherit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public final class ClassOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ClassOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A passive class may not own receptions.
	 * not self.isActive implies self.ownedReception.isEmpty()
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePassiveClass(
			org.eclipse.uml2.uml.Class class_, DiagnosticChain diagnostics,
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
						UMLValidator.CLASS__PASSIVE_CLASS,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validatePassiveClass", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(class_, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{class_}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static List getExtensions(org.eclipse.uml2.uml.Class class_) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The inherit operation is overridden to exclude redefined properties.
	 * result = inhs->excluding(inh | ownedMember->select(oclIsKindOf(RedefinableElement))->select(redefinedElement->includes(inh)))
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static List inherit(org.eclipse.uml2.uml.Class class_, List inhs) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

} // ClassOperations