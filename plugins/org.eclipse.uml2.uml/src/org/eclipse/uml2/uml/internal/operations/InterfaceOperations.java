/*
 * Copyright (c) 2005, 2016 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 327039, 418466, 451350, 485756
 *
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.Feature;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPlugin;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Interface</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Interface#validateVisibility(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visibility</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Interface#createOwnedAttribute(java.lang.String, org.eclipse.uml2.uml.Type, int, int) <em>Create Owned Attribute</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Interface#createOwnedOperation(java.lang.String, org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, org.eclipse.uml2.uml.Type) <em>Create Owned Operation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterfaceOperations
		extends ClassifierOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The visibility of all Features owned by an Interface must be public.
	 * feature->forAll(visibility = VisibilityKind::public)
	 * @param interface_ The receiving '<em><b>Interface</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean validateVisibility(Interface interface_,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		for (Feature feature : interface_.getFeatures()) {

			if (feature.getVisibility() != VisibilityKind.PUBLIC_LITERAL) {

				if (diagnostics != null) {
					diagnostics.add(new BasicDiagnostic(Diagnostic.WARNING,
						UMLValidator.DIAGNOSTIC_SOURCE,
						UMLValidator.INTERFACE__VISIBILITY,
						UMLPlugin.INSTANCE.getString(
							"_UI_Interface_Visibility_diagnostic", //$NON-NLS-1$
							getMessageSubstitutions(context, interface_)),
						new Object[]{interface_}));
				}

				return false;
			}
		}

		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates an operation with the specified name, parameter names, parameter types, and return type (or null) as an owned operation of this interface.
	 * @param interface_ The receiving '<em><b>Interface</b></em>' model object.
	 * @param name The name for the new operation, or null.
	 * @param parameterNames The parameter names for the new operation, or null.
	 * @param parameterTypes The parameter types for the new operation, or null.
	 * @param returnType The return type for the new operation, or null.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static Operation createOwnedOperation(Interface interface_,
			String name, EList<String> parameterNames,
			EList<Type> parameterTypes, Type returnType) {
		return TypeOperations.createOwnedOperation(interface_, name,
			parameterNames, parameterTypes, returnType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates a property with the specified name, type, lower bound, and upper bound as an owned attribute of this interface.
	 * @param interface_ The receiving '<em><b>Interface</b></em>' model object.
	 * @param name The name for the new attribute, or null.
	 * @param type The type for the new attribute, or null.
	 * @param lower The lower bound for the new attribute.
	 * @param upper The upper bound for the new attribute.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static Property createOwnedAttribute(Interface interface_,
			String name, Type type, int lower, int upper) {
		return TypeOperations.createOwnedAttribute(interface_, name, type,
			lower, upper);
	}

} // InterfaceOperations