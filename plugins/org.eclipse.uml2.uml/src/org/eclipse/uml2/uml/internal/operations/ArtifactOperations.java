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
 * $Id: ArtifactOperations.java,v 1.3 2005/12/22 22:44:54 khussey Exp $
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
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Artifact#createOwnedOperation(java.lang.String, org.eclipse.uml2.uml.Type, org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList) <em>Create Owned Operation</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Artifact#createOwnedAttribute(java.lang.String, org.eclipse.uml2.uml.Type, int, int) <em>Create Owned Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated not
 */
public final class ArtifactOperations
		extends UMLOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ArtifactOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static Operation createOwnedOperation(Artifact artifact,
			String name, Type returnType, EList parameterNames,
			EList parameterTypes) {
		return TypeOperations.createOwnedOperation(artifact, name, returnType,
			parameterNames, parameterTypes);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static Property createOwnedAttribute(Artifact artifact, String name,
			Type type, int lower, int upper) {
		return TypeOperations.createOwnedAttribute(artifact, name, type, lower,
			upper);
	}

} // ArtifactOperations