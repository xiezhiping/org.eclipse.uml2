/*
 * Copyright (c) 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *
 * $Id: ModelOperations.java,v 1.1 2004/05/13 03:16:20 khussey Exp $
 */
package org.eclipse.uml2.internal.operation;

import org.eclipse.uml2.Model;
import org.eclipse.uml2.NamedElement;

/**
 * A static utility class that provides operations related to models.
 */
public final class ModelOperations
	extends UML2Operations {

	/**
	 * Constructs a new Model Operations. This constructor should never be
	 * called because this is a static utility class.
	 */
	private ModelOperations() {
		super();
	}

	/**
	 * Determines whether the specified model is a library.
	 * 
	 * @param model
	 *            The model in question.
	 * @return <code>true</code> if the specified model is stereotyped as a
	 *         model library; <code>false</code> otherwise.
	 */
	public static boolean isLibrary(Model model) {
		return null != model.getAppliedStereotype("Basic" //$NON-NLS-1$
			+ NamedElement.SEPARATOR + "ModelLibrary"); //$NON-NLS-1$
	}

	/**
	 * Determines whether the specified model is a metamodel.
	 * 
	 * @param model
	 *            The model in question.
	 * @return <code>true</code> if the specified model is stereotyped as a
	 *         metamodel; <code>false</code> otherwise.
	 */
	public static boolean isMetamodel(Model model) {
		return null != model.getAppliedStereotype("Complete" //$NON-NLS-1$
			+ NamedElement.SEPARATOR + "Metamodel"); //$NON-NLS-1$
	}

}