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

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Partition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.ActivityPartition#isDimension <em>Is Dimension</em>}</li>
 *   <li>{@link org.eclipse.uml2.ActivityPartition#isExternal <em>Is External</em>}</li>
 *   <li>{@link org.eclipse.uml2.ActivityPartition#getContainedEdges <em>Contained Edge</em>}</li>
 *   <li>{@link org.eclipse.uml2.ActivityPartition#getContainedNodes <em>Contained Node</em>}</li>
 *   <li>{@link org.eclipse.uml2.ActivityPartition#getSubgroups <em>Subgroup</em>}</li>
 *   <li>{@link org.eclipse.uml2.ActivityPartition#getSuperPartition <em>Super Partition</em>}</li>
 *   <li>{@link org.eclipse.uml2.ActivityPartition#getRepresents <em>Represents</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.UML2Package#getActivityPartition()
 * @model 
 * @generated
 */
public interface ActivityPartition extends NamedElement, ActivityGroup{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Is Dimension</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Dimension</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Dimension</em>' attribute.
	 * @see #setIsDimension(boolean)
	 * @see org.eclipse.uml2.UML2Package#getActivityPartition_IsDimension()
	 * @model default="false" dataType="org.eclipse.uml2.Boolean"
	 * @generated
	 */
	boolean isDimension();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.ActivityPartition#isDimension <em>Is Dimension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Dimension</em>' attribute.
	 * @see #isDimension()
	 * @generated
	 */
	void setIsDimension(boolean value);

	/**
	 * Returns the value of the '<em><b>Is External</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is External</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is External</em>' attribute.
	 * @see #setIsExternal(boolean)
	 * @see org.eclipse.uml2.UML2Package#getActivityPartition_IsExternal()
	 * @model default="false" dataType="org.eclipse.uml2.Boolean"
	 * @generated
	 */
	boolean isExternal();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.ActivityPartition#isExternal <em>Is External</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is External</em>' attribute.
	 * @see #isExternal()
	 * @generated
	 */
	void setIsExternal(boolean value);

	/**
	 * Returns the value of the '<em><b>Contained Edge</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.ActivityEdge}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.ActivityEdge#getInPartitions <em>In Partition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained Edge</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Edge</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getActivityPartition_ContainedEdge()
	 * @see org.eclipse.uml2.ActivityEdge#getInPartitions
	 * @model type="org.eclipse.uml2.ActivityEdge" opposite="inPartition"
	 * @generated
	 */
	EList getContainedEdges();

    /**
     * Retrieves the {@link org.eclipse.uml2.ActivityEdge} with the specified name from the '<em><b>Contained Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param unqualifiedName The unqualified name of the {@link org.eclipse.uml2.ActivityEdge} to retrieve.
	 * @return The {@link org.eclipse.uml2.ActivityEdge} with the specified name, or <code>null</code>.
	 * @see #getContainedEdges()
	 * @generated
     */
    ActivityEdge getContainedEdge(String unqualifiedName);
      
	/**
	 * Returns the value of the '<em><b>Contained Node</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.ActivityNode}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.ActivityNode#getInPartitions <em>In Partition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained Node</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Node</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getActivityPartition_ContainedNode()
	 * @see org.eclipse.uml2.ActivityNode#getInPartitions
	 * @model type="org.eclipse.uml2.ActivityNode" opposite="inPartition"
	 * @generated
	 */
	EList getContainedNodes();

    /**
     * Retrieves the {@link org.eclipse.uml2.ActivityNode} with the specified name from the '<em><b>Contained Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param unqualifiedName The unqualified name of the {@link org.eclipse.uml2.ActivityNode} to retrieve.
	 * @return The {@link org.eclipse.uml2.ActivityNode} with the specified name, or <code>null</code>.
	 * @see #getContainedNodes()
	 * @generated
     */
    ActivityNode getContainedNode(String unqualifiedName);
      
	/**
	 * Returns the value of the '<em><b>Subgroup</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.ActivityPartition}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.ActivityPartition#getSuperPartition <em>Super Partition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subgroup</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subgroup</em>' containment reference list.
	 * @see org.eclipse.uml2.UML2Package#getActivityPartition_Subgroup()
	 * @see org.eclipse.uml2.ActivityPartition#getSuperPartition
	 * @model type="org.eclipse.uml2.ActivityPartition" opposite="superPartition" containment="true"
	 * @generated
	 */
	EList getSubgroups();

    /**
     * Retrieves the {@link org.eclipse.uml2.ActivityPartition} with the specified name from the '<em><b>Subgroup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param unqualifiedName The unqualified name of the {@link org.eclipse.uml2.ActivityPartition} to retrieve.
	 * @return The {@link org.eclipse.uml2.ActivityPartition} with the specified name, or <code>null</code>.
	 * @see #getSubgroups()
	 * @generated
     */
    ActivityPartition getSubgroup(String unqualifiedName);
      
    /**
     * Creates a {@link org.eclipse.uml2.ActivityPartition} and appends it to the '<em><b>Subgroup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.ActivityPartition} to create.
	 * @return The new {@link org.eclipse.uml2.ActivityPartition}.
	 * @see #getSubgroups()
	 * @generated
     */
    ActivityPartition createSubgroup(EClass eClass);

	/**
	 * Returns the value of the '<em><b>Super Partition</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.ActivityPartition#getSubgroups <em>Subgroup</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Partition</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Partition</em>' container reference.
	 * @see #setSuperPartition(ActivityPartition)
	 * @see org.eclipse.uml2.UML2Package#getActivityPartition_SuperPartition()
	 * @see org.eclipse.uml2.ActivityPartition#getSubgroups
	 * @model opposite="subgroup"
	 * @generated
	 */
	ActivityPartition getSuperPartition();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.ActivityPartition#getSuperPartition <em>Super Partition</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super Partition</em>' container reference.
	 * @see #getSuperPartition()
	 * @generated
	 */
	void setSuperPartition(ActivityPartition value);

	/**
	 * Returns the value of the '<em><b>Represents</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Represents</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Represents</em>' reference.
	 * @see #setRepresents(Element)
	 * @see org.eclipse.uml2.UML2Package#getActivityPartition_Represents()
	 * @model 
	 * @generated
	 */
	Element getRepresents();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.ActivityPartition#getRepresents <em>Represents</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Represents</em>' reference.
	 * @see #getRepresents()
	 * @generated
	 */
	void setRepresents(Element value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parameters=""
	 * @generated
	 */
	ActivityGroup getSuperGroup();

} // ActivityPartition
