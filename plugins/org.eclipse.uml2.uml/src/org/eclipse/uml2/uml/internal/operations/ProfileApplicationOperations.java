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
 * $Id: ProfileApplicationOperations.java,v 1.3 2005/12/21 20:13:08 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.operations;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.uml2.uml.ProfileApplication;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Profile Application</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.ProfileApplication#getProfileDefinition() <em>Get Profile Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated not
 */
public final class ProfileApplicationOperations
		extends UMLOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ProfileApplicationOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static EPackage getProfileDefinition(
			ProfileApplication profileApplication) {
		EAnnotation eAnnotation = profileApplication
			.getEAnnotation(UMLPackage.eNS_URI);

		if (eAnnotation != null) {
			EList references = eAnnotation.getReferences();

			if (references.size() > 0) {
				return (EPackage) references.get(0);
			}
		}

		return null;
	}

} // ProfileApplicationOperations