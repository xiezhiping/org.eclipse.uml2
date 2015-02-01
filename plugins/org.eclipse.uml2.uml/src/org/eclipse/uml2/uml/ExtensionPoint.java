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
 *   Christian W. Damus (CEA) - 251963
 *
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
 * An ExtensionPoint identifies a point in the behavior of a UseCase where that behavior can be extended by the behavior of some other (extending) UseCase, as specified by an Extend relationship.
 * <p>From package UML::UseCases.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.ExtensionPoint#getUseCase <em>Use Case</em>}</li>
 * </ul>
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
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.NamedElement#getNamespace() <em>Namespace</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The UseCase that owns this ExtensionPoint.
	 * <p>From package UML::UseCases.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Use Case</em>' container reference.
	 * @see #setUseCase(UseCase)
	 * @see org.eclipse.uml2.uml.UMLPackage#getExtensionPoint_UseCase()
	 * @see org.eclipse.uml2.uml.UseCase#getExtensionPoints
	 * @model opposite="extensionPoint" required="true" transient="false" ordered="false"
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
	 * name->notEmpty ()
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateMustHaveName(DiagnosticChain diagnostics,
			Map<Object, Object> context);

} // ExtensionPoint
