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
 * $Id: ProfileApplicationOperations.java,v 1.5 2006/01/25 18:51:32 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.operations;

import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.uml2.uml.NamedElement;
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
 *   <li>{@link org.eclipse.uml2.uml.ProfileApplication#getAppliedDefinition() <em>Get Applied Definition</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ProfileApplication#getAppliedDefinition(org.eclipse.uml2.uml.NamedElement) <em>Get Applied Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProfileApplicationOperations
		extends ElementOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProfileApplicationOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static EPackage getAppliedDefinition(
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static ENamedElement getAppliedDefinition(
			ProfileApplication profileApplication, NamedElement namedElement) {
		return ProfileOperations.getDefinition(profileApplication
			.getAppliedProfile(), namedElement, profileApplication
			.getAppliedDefinition());
	}

} // ProfileApplicationOperations