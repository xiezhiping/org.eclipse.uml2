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
 * $Id: ConnectableElement.java,v 1.3 2006/04/05 13:49:57 khussey Exp $
 */
package org.eclipse.uml2.uml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connectable Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A ConnectableElement is an abstract metaclass representing a set of instances that play roles of a classifier. Connectable elements may be joined by attached connectors and specify configurations of linked instances to be created within an instance of the containing classifier.
 * ConnectableElement is the connectable element of a ConnectableElementTemplateParameter.
 * The ConnectableElements attached as role to each ConnectorEnd owned by a Connector must be roles of the classifier that owned the Connector, or they must be ports of such roles. 
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.ConnectableElement#getEnds <em>End</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getConnectableElement()
 * @model abstract="true"
 * @generated
 */
public interface ConnectableElement
		extends TypedElement, ParameterableElement {

	/**
	 * Returns the value of the '<em><b>End</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.ConnectorEnd}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.ConnectorEnd#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Denotes a connector that attaches to this connectable element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>End</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getConnectableElement_End()
	 * @see org.eclipse.uml2.uml.ConnectorEnd#getRole
	 * @model type="org.eclipse.uml2.uml.ConnectorEnd" opposite="role"
	 * @generated
	 */
	EList getEnds();

} // ConnectableElement
