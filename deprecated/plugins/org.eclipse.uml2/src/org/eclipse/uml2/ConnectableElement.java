/*
 * Copyright (c) 2003, 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 */
package org.eclipse.uml2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connectable Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.ConnectableElement#getEnds <em>End</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.UML2Package#getConnectableElement()
 * @model abstract="true"
 * @generated
 */
public interface ConnectableElement extends NamedElement, ParameterableElement{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>End</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.ConnectorEnd}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.ConnectorEnd#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getConnectableElement_End()
	 * @see org.eclipse.uml2.ConnectorEnd#getRole
	 * @model type="org.eclipse.uml2.ConnectorEnd" opposite="role"
	 * @generated
	 */
	EList getEnds();

} // ConnectableElement
