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
 * $Id: Activity.java,v 1.12 2005/11/21 21:48:02 khussey Exp $
 */
package org.eclipse.uml2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An activity contains a language-specific text string used to describe a computation, and an optional specification of the language. OCL, natural language, or programming languages may be used to specify an activity. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.Activity#getBody <em>Body</em>}</li>
 *   <li>{@link org.eclipse.uml2.Activity#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.eclipse.uml2.Activity#getEdges <em>Edge</em>}</li>
 *   <li>{@link org.eclipse.uml2.Activity#getGroups <em>Group</em>}</li>
 *   <li>{@link org.eclipse.uml2.Activity#getNodes <em>Node</em>}</li>
 *   <li>{@link org.eclipse.uml2.Activity#getActions <em>Action</em>}</li>
 *   <li>{@link org.eclipse.uml2.Activity#getStructuredNodes <em>Structured Node</em>}</li>
 *   <li>{@link org.eclipse.uml2.Activity#isSingleExecution <em>Is Single Execution</em>}</li>
 *   <li>{@link org.eclipse.uml2.Activity#isReadOnly <em>Is Read Only</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.UML2Package#getActivity()
 * @model
 * @generated
 */
public interface Activity extends Behavior{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Body</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A textual representation of the computation in the surface language determined by the language attribute.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Body</em>' attribute.
	 * @see #setBody(String)
	 * @see org.eclipse.uml2.UML2Package#getActivity_Body()
	 * @model default="" dataType="org.eclipse.uml2.String"
	 * @generated
	 */
	String getBody();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.Activity#getBody <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' attribute.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(String value);


	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the language in which the body of the activity is stated. The interpretation of the expression body depends on the language.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see #setLanguage(String)
	 * @see org.eclipse.uml2.UML2Package#getActivity_Language()
	 * @model default="" dataType="org.eclipse.uml2.String"
	 * @generated
	 */
	String getLanguage();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.Activity#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(String value);


	/**
	 * Returns the value of the '<em><b>Is Read Only</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Read Only</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Read Only</em>' attribute.
	 * @see #setIsReadOnly(boolean)
	 * @see org.eclipse.uml2.UML2Package#getActivity_IsReadOnly()
	 * @model default="false" dataType="org.eclipse.uml2.Boolean"
	 * @generated
	 */
	boolean isReadOnly();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.Activity#isReadOnly <em>Is Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Read Only</em>' attribute.
	 * @see #isReadOnly()
	 * @generated
	 */
	void setIsReadOnly(boolean value);


	/**
	 * Returns the value of the '<em><b>Is Single Execution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Single Execution</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Single Execution</em>' attribute.
	 * @see #setIsSingleExecution(boolean)
	 * @see org.eclipse.uml2.UML2Package#getActivity_IsSingleExecution()
	 * @model dataType="org.eclipse.uml2.Boolean"
	 * @generated
	 */
	boolean isSingleExecution();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.Activity#isSingleExecution <em>Is Single Execution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Single Execution</em>' attribute.
	 * @see #isSingleExecution()
	 * @generated
	 */
	void setIsSingleExecution(boolean value);


	/**
	 * Returns the value of the '<em><b>Edge</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.ActivityEdge}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.ActivityEdge#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edge</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edge</em>' containment reference list.
	 * @see org.eclipse.uml2.UML2Package#getActivity_Edge()
	 * @see org.eclipse.uml2.ActivityEdge#getActivity
	 * @model type="org.eclipse.uml2.ActivityEdge" opposite="activity" containment="true" resolveProxies="false" ordered="false"
	 * @generated
	 */
	EList getEdges();


	/**
	 * Retrieves the {@link org.eclipse.uml2.ActivityEdge} with the specified '<em><b>Name</b></em>' from the '<em><b>Edge</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.ActivityEdge} to retrieve.
	 * @return The {@link org.eclipse.uml2.ActivityEdge} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getEdges()
	 * @generated
	 */
    ActivityEdge getEdge(String name);

	/**
	 * Creates a {@link org.eclipse.uml2.ActivityEdge} and appends it to the '<em><b>Edge</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.ActivityEdge} to create.
	 * @return The new {@link org.eclipse.uml2.ActivityEdge}.
	 * @see #getEdges()
	 * @generated
	 */
    ActivityEdge createEdge(EClass eClass);

	/**
	 * Returns the value of the '<em><b>Group</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.ActivityGroup}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.ActivityGroup#getActivityGroup_activity <em>Activity Group activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' containment reference list.
	 * @see org.eclipse.uml2.UML2Package#getActivity_Group()
	 * @see org.eclipse.uml2.ActivityGroup#getActivityGroup_activity
	 * @model type="org.eclipse.uml2.ActivityGroup" opposite="activityGroup_activity" containment="true" resolveProxies="false" ordered="false"
	 * @generated
	 */
	EList getGroups();


	/**
	 * Creates a {@link org.eclipse.uml2.ActivityGroup} and appends it to the '<em><b>Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.ActivityGroup} to create.
	 * @return The new {@link org.eclipse.uml2.ActivityGroup}.
	 * @see #getGroups()
	 * @generated
	 */
    ActivityGroup createGroup(EClass eClass);

	/**
	 * Returns the value of the '<em><b>Node</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.ActivityNode}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.ActivityNode#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node</em>' containment reference list.
	 * @see org.eclipse.uml2.UML2Package#getActivity_Node()
	 * @see org.eclipse.uml2.ActivityNode#getActivity
	 * @model type="org.eclipse.uml2.ActivityNode" opposite="activity" containment="true" resolveProxies="false" ordered="false"
	 * @generated
	 */
	EList getNodes();


	/**
	 * Retrieves the {@link org.eclipse.uml2.ActivityNode} with the specified '<em><b>Name</b></em>' from the '<em><b>Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.ActivityNode} to retrieve.
	 * @return The {@link org.eclipse.uml2.ActivityNode} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getNodes()
	 * @generated
	 */
    ActivityNode getNode(String name);

	/**
	 * Creates a {@link org.eclipse.uml2.ActivityNode} and appends it to the '<em><b>Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.ActivityNode} to create.
	 * @return The new {@link org.eclipse.uml2.ActivityNode}.
	 * @see #getNodes()
	 * @generated
	 */
    ActivityNode createNode(EClass eClass);

	/**
	 * Returns the value of the '<em><b>Action</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getActivity_Action()
	 * @model type="org.eclipse.uml2.Action" resolveProxies="false"
	 * @generated
	 */
	EList getActions();


	/**
	 * Retrieves the {@link org.eclipse.uml2.Action} with the specified '<em><b>Name</b></em>' from the '<em><b>Action</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.Action} to retrieve.
	 * @return The {@link org.eclipse.uml2.Action} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getActions()
	 * @generated
	 */
    Action getAction(String name);

	/**
	 * Returns the value of the '<em><b>Structured Node</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.StructuredActivityNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Structured Node</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structured Node</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getActivity_StructuredNode()
	 * @model type="org.eclipse.uml2.StructuredActivityNode" resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList getStructuredNodes();


	/**
	 * Retrieves the {@link org.eclipse.uml2.StructuredActivityNode} with the specified '<em><b>Name</b></em>' from the '<em><b>Structured Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.StructuredActivityNode} to retrieve.
	 * @return The {@link org.eclipse.uml2.StructuredActivityNode} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getStructuredNodes()
	 * @generated
	 */
    StructuredActivityNode getStructuredNode(String name);

} // Activity
