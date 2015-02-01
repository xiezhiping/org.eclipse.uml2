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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Comment is a textual annotation that can be attached to a set of Elements.
 * <p>From package UML::CommonStructure.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Comment#getAnnotatedElements <em>Annotated Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Comment#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getComment()
 * @model
 * @generated
 */
public interface Comment
		extends Element {

	/**
	 * Returns the value of the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a string that is the comment.
	 * <p>From package UML::CommonStructure.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Body</em>' attribute.
	 * @see #isSetBody()
	 * @see #unsetBody()
	 * @see #setBody(String)
	 * @see org.eclipse.uml2.uml.UMLPackage#getComment_Body()
	 * @model unsettable="true" dataType="org.eclipse.uml2.types.String" ordered="false"
	 *        extendedMetaData="kind='element'"
	 * @generated
	 */
	String getBody();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.Comment#getBody <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' attribute.
	 * @see #isSetBody()
	 * @see #unsetBody()
	 * @see #getBody()
	 * @generated
	 */
	void setBody(String value);

	/**
	 * Unsets the value of the '{@link org.eclipse.uml2.uml.Comment#getBody <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBody()
	 * @see #getBody()
	 * @see #setBody(String)
	 * @generated
	 */
	void unsetBody();

	/**
	 * Returns whether the value of the '{@link org.eclipse.uml2.uml.Comment#getBody <em>Body</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Body</em>' attribute is set.
	 * @see #unsetBody()
	 * @see #getBody()
	 * @see #setBody(String)
	 * @generated
	 */
	boolean isSetBody();

	/**
	 * Returns the value of the '<em><b>Annotated Element</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Element}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the Element(s) being commented.
	 * <p>From package UML::CommonStructure.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Annotated Element</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getComment_AnnotatedElement()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Element> getAnnotatedElements();

} // Comment
