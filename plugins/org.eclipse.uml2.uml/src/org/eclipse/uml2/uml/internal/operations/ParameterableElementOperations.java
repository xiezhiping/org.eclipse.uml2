/*
 * Copyright (c) 2005, 2015 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 418466, 451350
 *
 */
package org.eclipse.uml2.uml.internal.operations;

import org.eclipse.uml2.uml.ParameterableElement;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Parameterable Element</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.ParameterableElement#isCompatibleWith(org.eclipse.uml2.uml.ParameterableElement) <em>Is Compatible With</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ParameterableElement#isTemplateParameter() <em>Is Template Parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterableElementOperations
		extends ElementOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterableElementOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query isCompatibleWith() determines if this ParameterableElement is compatible with the specified ParameterableElement. By default, this ParameterableElement is compatible with another ParameterableElement p if the kind of this ParameterableElement is the same as or a subtype of the kind of p. Subclasses of ParameterableElement should override this operation to specify different compatibility constraints.
	 * result = (self.oclIsKindOf(p.oclType()))
	 * <p>From package UML::CommonStructure.</p>
	 * @param parameterableElement The receiving '<em><b>Parameterable Element</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean isCompatibleWith(
			ParameterableElement parameterableElement, ParameterableElement p) {
		return parameterableElement.eClass().isInstance(p);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query isTemplateParameter() determines if this ParameterableElement is exposed as a formal TemplateParameter.
	 * result = (templateParameter->notEmpty())
	 * <p>From package UML::CommonStructure.</p>
	 * @param parameterableElement The receiving '<em><b>Parameterable Element</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean isTemplateParameter(
			ParameterableElement parameterableElement) {
		return parameterableElement.eGet(
			UMLPackage.Literals.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER,
			false) != null;
	}

} // ParameterableElementOperations