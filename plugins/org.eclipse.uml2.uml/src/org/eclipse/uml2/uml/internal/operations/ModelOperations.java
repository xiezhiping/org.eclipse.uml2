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
 * $Id: ModelOperations.java,v 1.4 2005/12/23 06:48:22 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.operations;

import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Model</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Model#isMetamodel() <em>Is Metamodel</em>}</li>
 * </ul>
 * </p>
 *
 * @generated not
 */
public final class ModelOperations
		extends UMLOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ModelOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static boolean isMetamodel(Model model) {
		return null != model.getAppliedStereotype("UML" //$NON-NLS-1$
			+ NamedElement.SEPARATOR + "Metamodel"); //$NON-NLS-1$
	}

} // ModelOperations