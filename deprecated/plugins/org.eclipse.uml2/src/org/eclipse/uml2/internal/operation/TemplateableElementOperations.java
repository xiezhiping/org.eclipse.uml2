/*
 * Copyright (c) 2003, 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: TemplateableElementOperations.java,v 1.4 2005/05/18 16:38:32 khussey Exp $
 */
package org.eclipse.uml2.internal.operation;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.eclipse.uml2.Element;
import org.eclipse.uml2.ParameterableElement;
import org.eclipse.uml2.TemplateableElement;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Templateable Element</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.TemplateableElement#parameterableElements() <em>Parameterable Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated not
 */
public final class TemplateableElementOperations extends UML2Operations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TemplateableElementOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static Set parameterableElements(TemplateableElement templateableElement) {
		Set parameterableElements = new HashSet();

		for (Iterator allOwnedElements = templateableElement.allOwnedElements()
			.iterator(); allOwnedElements.hasNext();) {

			Element ownedElement = (Element) allOwnedElements.next();

			if (ParameterableElement.class.isInstance(ownedElement)) {
				parameterableElements.add(ownedElement);
			}
		}

		return Collections.unmodifiableSet(parameterableElements);
	}
} // TemplateableElementOperations