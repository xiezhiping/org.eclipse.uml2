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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A model captures a view of a physical system. It is an abstraction of the physical system, with a certain purpose. This purpose determines what is to be included in the model and what is irrelevant. Thus the model completely describes those aspects of the physical system that are relevant to the purpose of the model, at the appropriate level of detail.
 * <p>From package UML::Packages.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Model#getViewpoint <em>Viewpoint</em>}</li>
 * </ul>
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
	 * The name of the viewpoint that is expressed by a model (this name may refer to a profile definition).
	 * <p>From package UML::Packages.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Viewpoint</em>' attribute.
	 * @see #isSetViewpoint()
	 * @see #unsetViewpoint()
	 * @see #setViewpoint(String)
	 * @see org.eclipse.uml2.uml.UMLPackage#getModel_Viewpoint()
	 * @model unsettable="true" dataType="org.eclipse.uml2.types.String" ordered="false"
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
	 * <!-- begin-model-doc -->
	 * Determines whether this model is a metamodel.
	 * <!-- end-model-doc -->
	 * @model kind="operation" dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isMetamodel();

} // Model
