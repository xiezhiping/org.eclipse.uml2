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
 * $Id: Model.java,v 1.6 2005/03/15 18:44:42 khussey Exp $
 */
package org.eclipse.uml2;


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
 *   <li>{@link org.eclipse.uml2.Model#getViewpoint <em>Viewpoint</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.UML2Package#getModel()
 * @model 
 * @generated
 */
public interface Model extends org.eclipse.uml2.Package{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Viewpoint</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Viewpoint</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the viewpoint that is expressed by a model (This name may refer to a profile definition).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Viewpoint</em>' attribute.
	 * @see #setViewpoint(String)
	 * @see org.eclipse.uml2.UML2Package#getModel_Viewpoint()
	 * @model default="" dataType="org.eclipse.uml2.String"
	 * @generated
	 */
	String getViewpoint();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.Model#getViewpoint <em>Viewpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Viewpoint</em>' attribute.
	 * @see #getViewpoint()
	 * @generated
	 */
	void setViewpoint(String value);

	// <!-- begin-custom-operations -->

	/**
	 * Determines whether this model is a library.
	 * 
	 * @return <code>true</code> if this model is stereotyped as a model
	 *         library; <code>false</code> otherwise.
	 */
	public boolean isLibrary();

	/**
	 * Determines whether this model is a metamodel.
	 * 
	 * @return <code>true</code> if this model is stereotyped as a metamodel;
	 *         <code>false</code> otherwise.
	 */
	public boolean isMetamodel();

	// <!-- end-custom-operations -->

} // Model
