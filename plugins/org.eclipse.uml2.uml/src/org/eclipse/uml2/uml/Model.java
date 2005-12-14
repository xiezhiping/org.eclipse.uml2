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
 * $Id: Model.java,v 1.4 2005/12/14 22:34:16 khussey Exp $
 */
package org.eclipse.uml2.uml;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The Model construct is defined as a Package. It contains a (hierarchical) set of elements that together describe the physical system being modeled. A Model may also contain a set of elements that represents the environment of the system, typically Actors, together with their interrelationships, such as Associations and Dependencies
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Model#getViewpoint <em>Viewpoint</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getModel()
 * @model
 * @generated
 */
public interface Model
		extends org.eclipse.uml2.uml.Package {

	/**
	 * Returns the value of the '<em><b>Viewpoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the viewpoint that is expressed by a model (This name may refer to a profile definition).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Viewpoint</em>' attribute.
	 * @see #isSetViewpoint()
	 * @see #unsetViewpoint()
	 * @see #setViewpoint(String)
	 * @see org.eclipse.uml2.uml.UMLPackage#getModel_Viewpoint()
	 * @model unsettable="true" dataType="org.eclipse.uml2.uml.String" ordered="false"
	 * @generated
	 */
	String getViewpoint();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.Model#getViewpoint <em>Viewpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Viewpoint</em>' attribute.
	 * @see #isSetViewpoint()
	 * @see #unsetViewpoint()
	 * @see #getViewpoint()
	 * @generated
	 */
	void setViewpoint(String value);

	/**
	 * Unsets the value of the '{@link org.eclipse.uml2.uml.Model#getViewpoint <em>Viewpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetViewpoint()
	 * @see #getViewpoint()
	 * @see #setViewpoint(String)
	 * @generated
	 */
	void unsetViewpoint();

	/**
	 * Returns whether the value of the '{@link org.eclipse.uml2.uml.Model#getViewpoint <em>Viewpoint</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Viewpoint</em>' attribute is set.
	 * @see #unsetViewpoint()
	 * @see #getViewpoint()
	 * @see #setViewpoint(String)
	 * @generated
	 */
	boolean isSetViewpoint();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.eclipse.uml2.uml.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isMetamodel();

} // Model
