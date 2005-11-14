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
 * $Id: DirectedRelationship.java,v 1.1 2005/11/14 22:26:01 khussey Exp $
 */
package org.eclipse.uml2.uml;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Directed Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A directed relationship references one or more source elements and one or more target elements. DirectedRelationship is an abstract metaclass.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.DirectedRelationship#getSources <em>Source</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.DirectedRelationship#getTargets <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getDirectedRelationship()
 * @model abstract="true"
 * @generated
 */
public interface DirectedRelationship
		extends Relationship {

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Element}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the sources of the DirectedRelationship.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getDirectedRelationship_Source()
	 * @model type="org.eclipse.uml2.uml.Element" required="true" transient="true" changeable="false" derived="true" ordered="false"
	 * @generated
	 */
	List getSources();

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Element}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the targets of the DirectedRelationship.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getDirectedRelationship_Target()
	 * @model type="org.eclipse.uml2.uml.Element" required="true" transient="true" changeable="false" derived="true" ordered="false"
	 * @generated
	 */
	List getTargets();

} // DirectedRelationship
