/*
 * Copyright (c) 2005, 2015 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 327039, 351774, 418466, 451350
 *   Christian W. Damus (CEA) - 251963
 *
 */
package org.eclipse.uml2.uml;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Include</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An Include relationship specifies that a UseCase contains the behavior defined in another UseCase.
 * <p>From package UML::UseCases.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Include#getAddition <em>Addition</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Include#getIncludingCase <em>Including Case</em>}</li>
 * </ul>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getInclude()
 * @model
 * @generated
 */
public interface Include
		extends NamedElement, DirectedRelationship {

	/**
	 * Returns the value of the '<em><b>Addition</b></em>' reference.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.DirectedRelationship#getTargets() <em>Target</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The UseCase that is to be included.
	 * <p>From package UML::UseCases.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Addition</em>' reference.
	 * @see #setAddition(UseCase)
	 * @see org.eclipse.uml2.uml.UMLPackage#getInclude_Addition()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	UseCase getAddition();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.Include#getAddition <em>Addition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Addition</em>' reference.
	 * @see #getAddition()
	 * @generated
	 */
	void setAddition(UseCase value);

	/**
	 * Returns the value of the '<em><b>Including Case</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.UseCase#getIncludes <em>Include</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.DirectedRelationship#getSources() <em>Source</em>}'</li>
	 *   <li>'{@link org.eclipse.uml2.uml.NamedElement#getNamespace() <em>Namespace</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The UseCase which includes the addition and owns the Include relationship.
	 * <p>From package UML::UseCases.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Including Case</em>' container reference.
	 * @see #setIncludingCase(UseCase)
	 * @see org.eclipse.uml2.uml.UMLPackage#getInclude_IncludingCase()
	 * @see org.eclipse.uml2.uml.UseCase#getIncludes
	 * @model opposite="include" required="true" transient="false" ordered="false"
	 * @generated
	 */
	UseCase getIncludingCase();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.Include#getIncludingCase <em>Including Case</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Including Case</em>' container reference.
	 * @see #getIncludingCase()
	 * @generated
	 */
	void setIncludingCase(UseCase value);

} // Include
