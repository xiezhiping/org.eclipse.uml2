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
 * A representation of the model object '<em><b>Connectable Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * ConnectableElement is an abstract metaclass representing a set of instances that play roles of a StructuredClassifier. ConnectableElements may be joined by attached Connectors and specify configurations of linked instances to be created within an instance of the containing StructuredClassifier.
 * <p>From package UML::StructuredClassifiers.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.ConnectableElement#getEnds <em>End</em>}</li>
 * </ul>
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A set of ConnectorEnds that attach to this ConnectableElement.
	 * <p>From package UML::StructuredClassifiers.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>End</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getConnectableElement_End()
	 * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<ConnectorEnd> getEnds();

} // ConnectableElement
