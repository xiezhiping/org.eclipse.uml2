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
 * $Id: TemplateableElementOperations.java,v 1.2 2005/12/08 19:38:06 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.uml2.uml.ParameterableElement;
import org.eclipse.uml2.uml.TemplateableElement;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Templateable Element</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.TemplateableElement#parameterableElements() <em>Parameterable Elements</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.TemplateableElement#isTemplate() <em>Is Template</em>}</li>
 * </ul>
 * </p>
 *
 * @generated not
 */
public final class TemplateableElementOperations extends UMLOperations {

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
	 * <!-- begin-model-doc -->
	 * The query parameterableElements() returns the set of elements that may be used as the parametered elements for a template parameter of this templateable element. By default, this set includes all the owned elements. Subclasses may override this operation if they choose to restrict the set of parameterable elements.
	 * result = allOwnedElements->select(oclIsKindOf(ParameterableElement))
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static List parameterableElements(
			TemplateableElement templateableElement) {
		List parameterableElements = new UniqueEList();

		for (Iterator allOwnedElements = templateableElement.allOwnedElements()
			.iterator(); allOwnedElements.hasNext();) {

			Object ownedElement = allOwnedElements.next();

			if (ownedElement instanceof ParameterableElement) {
				parameterableElements.add(ownedElement);
			}
		}

		return Collections.unmodifiableList(parameterableElements);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query isTemplate() returns whether this templateable element is actually a template.
	 * result = ownedSignature->notEmpty()
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean isTemplate(TemplateableElement templateableElement) {
		return templateableElement.getOwnedTemplateSignature() != null;
	}

} // TemplateableElementOperations