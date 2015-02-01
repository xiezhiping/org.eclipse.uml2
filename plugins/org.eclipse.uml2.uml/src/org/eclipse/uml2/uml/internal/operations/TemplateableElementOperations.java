/*
 * Copyright (c) 2005, 2015 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 327039, 418466, 451350
 *
 */
package org.eclipse.uml2.uml.internal.operations;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.ParameterableElement;
import org.eclipse.uml2.uml.TemplateableElement;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Templateable Element</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.TemplateableElement#isTemplate() <em>Is Template</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.TemplateableElement#parameterableElements() <em>Parameterable Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TemplateableElementOperations
		extends ElementOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemplateableElementOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query parameterableElements() returns the set of ParameterableElements that may be used as the parameteredElements for a TemplateParameter of this TemplateableElement. By default, this set includes all the ownedElements. Subclasses may override this operation if they choose to restrict the set of ParameterableElements.
	 * result = (self.allOwnedElements()->select(oclIsKindOf(ParameterableElement)).oclAsType(ParameterableElement)->asSet())
	 * <p>From package UML::CommonStructure.</p>
	 * @param templateableElement The receiving '<em><b>Templateable Element</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<ParameterableElement> parameterableElements(
			TemplateableElement templateableElement) {
		EList<ParameterableElement> parameterableElements = new UniqueEList.FastCompare<ParameterableElement>();

		for (Element ownedElement : templateableElement.allOwnedElements()) {

			if (ownedElement instanceof ParameterableElement) {
				parameterableElements.add((ParameterableElement) ownedElement);
			}
		}

		return ECollections.unmodifiableEList(parameterableElements);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query isTemplate() returns whether this TemplateableElement is actually a template.
	 * result = (ownedTemplateSignature <> null)
	 * <p>From package UML::CommonStructure.</p>
	 * @param templateableElement The receiving '<em><b>Templateable Element</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean isTemplate(TemplateableElement templateableElement) {
		return templateableElement.getOwnedTemplateSignature() != null;
	}

} // TemplateableElementOperations