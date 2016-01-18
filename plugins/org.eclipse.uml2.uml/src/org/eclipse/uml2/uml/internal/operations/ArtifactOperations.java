/*
 * Copyright (c) 2005, 2016 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 327039, 451350, 485756
 *
 */
package org.eclipse.uml2.uml.internal.operations;

import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.Artifact;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Artifact</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Artifact#createOwnedAttribute(java.lang.String, org.eclipse.uml2.uml.Type, int, int) <em>Create Owned Attribute</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Artifact#createOwnedOperation(java.lang.String, org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, org.eclipse.uml2.uml.Type) <em>Create Owned Operation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArtifactOperations
		extends ClassifierOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArtifactOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates an operation with the specified name, parameter names, parameter types, and return type (or null) as an owned operation of this artifact.
	 * @param artifact The receiving '<em><b>Artifact</b></em>' model object.
	 * @param name The name for the new operation, or null.
	 * @param parameterNames The parameter names for  the new operation, or null.
	 * @param parameterTypes The parameter types for the new operation, or null.
	 * @param returnType The return type for the new operation, or null.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static Operation createOwnedOperation(Artifact artifact, String name,
			EList<String> parameterNames, EList<Type> parameterTypes,
			Type returnType) {
		return TypeOperations.createOwnedOperation(artifact, name,
			parameterNames, parameterTypes, returnType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates a property with the specified name, type, lower bound, and upper bound as an owned attribute of this artifact.
	 * @param artifact The receiving '<em><b>Artifact</b></em>' model object.
	 * @param name The name for the new attribute, or null.
	 * @param type The type for the new attribute, or null.
	 * @param lower The lower bound for the new attribute.
	 * @param upper The upper bound for the new attribute.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static Property createOwnedAttribute(Artifact artifact, String name,
			Type type, int lower, int upper) {
		return TypeOperations.createOwnedAttribute(artifact, name, type, lower,
			upper);
	}

} // ArtifactOperations