/*
 * Copyright (c) 2003, 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: ConnectableElement.java,v 1.8 2005/05/18 16:38:30 khussey Exp $
 */
package org.eclipse.uml2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connectable Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A ConnectableElement is an abstract metaclass representing a set of instances that are owned by a containing classifier instance. Connectable elements may be joined by attached connectors and specify configurations of linked instances to be created within an instance of the containing classifier. 
 * <!-- end-model-doc -->
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
	String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

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
	 * <!-- begin-model-doc -->
	 * Denotes a connector that attaches to this connectable element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>End</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getConnectableElement_End()
	 * @see org.eclipse.uml2.ConnectorEnd#getRole
	 * @model type="org.eclipse.uml2.ConnectorEnd" opposite="role" ordered="false"
	 * @generated
	 */
	EList getEnds();


} // ConnectableElement
