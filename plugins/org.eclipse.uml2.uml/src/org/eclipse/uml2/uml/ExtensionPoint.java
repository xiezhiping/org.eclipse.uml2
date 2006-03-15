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
 * $Id: ExtensionPoint.java,v 1.3 2006/03/15 19:33:52 khussey Exp $
 */
package org.eclipse.uml2.uml;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extension Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An ExtensionPoint is a feature of a use case that identifies a point where the behavior of a use case can be augmented with elements of another (extending) use case.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.ExtensionPoint#getUseCase <em>Use Case</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getExtensionPoint()
 * @model
 * @generated
 */
public interface ExtensionPoint
		extends RedefinableElement {

	/**
	 * Returns the value of the '<em><b>Use Case</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.UseCase#getExtensionPoints <em>Extension Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the use case that owns this extension point.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Use Case</em>' container reference.
	 * @see #setUseCase(UseCase)
	 * @see org.eclipse.uml2.uml.UMLPackage#getExtensionPoint_UseCase()
	 * @see org.eclipse.uml2.uml.UseCase#getExtensionPoints
	 * @model opposite="extensionPoint" required="true" ordered="false"
	 * @generated
	 */
	UseCase getUseCase();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.ExtensionPoint#getUseCase <em>Use Case</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Case</em>' container reference.
	 * @see #getUseCase()
	 * @generated
	 */
	void setUseCase(UseCase value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An ExtensionPoint must have a name.
	 * self.name->notEmpty ()
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateMustHaveName(DiagnosticChain diagnostics, Map context);

} // ExtensionPoint
