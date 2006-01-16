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
 * $Id: ModelOperations.java,v 1.6 2006/01/16 22:44:13 khussey Exp $
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
 * @generated
 */
public class ModelOperations
		extends PackageOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static boolean isMetamodel(Model model) {
		return model.getAppliedStereotype("Standard" //$NON-NLS-1$
			+ NamedElement.SEPARATOR + "Metamodel") != null; //$NON-NLS-1$
	}

} // ModelOperations