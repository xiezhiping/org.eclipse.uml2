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
 * $Id: ParameterableElementOperations.java,v 1.2 2005/12/02 04:55:51 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.operations;

import org.eclipse.uml2.uml.ParameterableElement;
import org.eclipse.uml2.uml.internal.impl.ParameterableElementImpl;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Parameterable Element</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.ParameterableElement#isCompatibleWith(org.eclipse.uml2.uml.ParameterableElement) <em>Is Compatible With</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ParameterableElement#isTemplateParameter() <em>Is Template Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated not
 */
public final class ParameterableElementOperations extends UMLOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ParameterableElementOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query isCompatibleWith() determines if this parameterable element is compatible with the specified parameterable element. By default parameterable element P is compatible with parameterable element Q if the kind of P is the same or a subtype as the kind of Q. Subclasses should override this operation to specify different compatibility constraints.
	 * result = p->oclIsKindOf(self.oclType)
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
	 * The query isTemplateParameter() determines if this parameterable element is exposed as a formal template parameter.
	 * result = templateParameter->notEmpty()
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean isTemplateParameter(
			ParameterableElement parameterableElement) {
		return ((ParameterableElementImpl) parameterableElement)
			.basicGetTemplateParameter() != null;
	}

} // ParameterableElementOperations