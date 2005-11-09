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
 * $Id: ActivityEdge.java,v 1.10 2005/11/09 22:53:10 khussey Exp $
 */
package org.eclipse.uml2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.ActivityEdge#getActivity <em>Activity</em>}</li>
 *   <li>{@link org.eclipse.uml2.ActivityEdge#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.uml2.ActivityEdge#getTarget <em>Target</em>}</li>
 *   <li>{@link org.eclipse.uml2.ActivityEdge#getInGroups <em>In Group</em>}</li>
 *   <li>{@link org.eclipse.uml2.ActivityEdge#getGuard <em>Guard</em>}</li>
 *   <li>{@link org.eclipse.uml2.ActivityEdge#getRedefinedElements <em>Redefined Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.ActivityEdge#getInStructuredNode <em>In Structured Node</em>}</li>
 *   <li>{@link org.eclipse.uml2.ActivityEdge#getInPartitions <em>In Partition</em>}</li>
 *   <li>{@link org.eclipse.uml2.ActivityEdge#getWeight <em>Weight</em>}</li>
 *   <li>{@link org.eclipse.uml2.ActivityEdge#getInterrupts <em>Interrupts</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.UML2Package#getActivityEdge()
 * @model abstract="true"
 * @generated
 */
public interface ActivityEdge extends RedefinableElement{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Activity</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.Activity#getEdges <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity</em>' container reference.
	 * @see #setActivity(Activity)
	 * @see org.eclipse.uml2.UML2Package#getActivityEdge_Activity()
	 * @see org.eclipse.uml2.Activity#getEdges
	 * @model opposite="edge"
	 * @generated
	 */
	Activity getActivity();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.ActivityEdge#getActivity <em>Activity</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity</em>' container reference.
	 * @see #getActivity()
	 * @generated
	 */
	void setActivity(Activity value);


	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.ActivityNode#getOutgoings <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(ActivityNode)
	 * @see org.eclipse.uml2.UML2Package#getActivityEdge_Source()
	 * @see org.eclipse.uml2.ActivityNode#getOutgoings
	 * @model opposite="outgoing" required="true"
	 * @generated
	 */
	ActivityNode getSource();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.ActivityEdge#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(ActivityNode value);


	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.ActivityNode#getIncomings <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(ActivityNode)
	 * @see org.eclipse.uml2.UML2Package#getActivityEdge_Target()
	 * @see org.eclipse.uml2.ActivityNode#getIncomings
	 * @model opposite="incoming" required="true"
	 * @generated
	 */
	ActivityNode getTarget();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.ActivityEdge#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(ActivityNode value);


	/**
	 * Returns the value of the '<em><b>In Group</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.ActivityGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Group</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Group</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getActivityEdge_InGroup()
	 * @model type="org.eclipse.uml2.ActivityGroup" transient="true" changeable="false" derived="true" ordered="false"
	 * @generated
	 */
	EList getInGroups();


	/**
	 * Returns the value of the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guard</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard</em>' containment reference.
	 * @see #setGuard(ValueSpecification)
	 * @see org.eclipse.uml2.UML2Package#getActivityEdge_Guard()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ValueSpecification getGuard();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.ActivityEdge#getGuard <em>Guard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard</em>' containment reference.
	 * @see #getGuard()
	 * @generated
	 */
	void setGuard(ValueSpecification value);


	/**
	 * Creates a {@link org.eclipse.uml2.ValueSpecification} and sets the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.ValueSpecification} to create.
	 * @return The new {@link org.eclipse.uml2.ValueSpecification}.
	 * @see #getGuard()
	 * @generated
	 */
    ValueSpecification createGuard(EClass eClass);

	/**
	 * Returns the value of the '<em><b>Redefined Element</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.ActivityEdge}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Redefined Element</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Redefined Element</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getActivityEdge_RedefinedElement()
	 * @model type="org.eclipse.uml2.ActivityEdge" ordered="false"
	 * @generated
	 */
	EList getRedefinedElements();


	/**
	 * Retrieves the {@link org.eclipse.uml2.ActivityEdge} with the specified '<em><b>Name</b></em>' from the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.ActivityEdge} to retrieve.
	 * @return The {@link org.eclipse.uml2.ActivityEdge} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getRedefinedElements()
	 * @generated
	 */
    RedefinableElement getRedefinedElement(String name);

	/**
	 * Returns the value of the '<em><b>In Structured Node</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.StructuredActivityNode#getContainedEdges <em>Contained Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Structured Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Structured activity node containing the edge.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>In Structured Node</em>' container reference.
	 * @see #setInStructuredNode(StructuredActivityNode)
	 * @see org.eclipse.uml2.UML2Package#getActivityEdge_InStructuredNode()
	 * @see org.eclipse.uml2.StructuredActivityNode#getContainedEdges
	 * @model opposite="containedEdge"
	 * @generated
	 */
	StructuredActivityNode getInStructuredNode();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.ActivityEdge#getInStructuredNode <em>In Structured Node</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Structured Node</em>' container reference.
	 * @see #getInStructuredNode()
	 * @generated
	 */
	void setInStructuredNode(StructuredActivityNode value);


	/**
	 * Returns the value of the '<em><b>In Partition</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.ActivityPartition}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.ActivityPartition#getContainedEdges <em>Contained Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Partition</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Partition</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getActivityEdge_InPartition()
	 * @see org.eclipse.uml2.ActivityPartition#getContainedEdges
	 * @model type="org.eclipse.uml2.ActivityPartition" opposite="containedEdge" ordered="false"
	 * @generated
	 */
	EList getInPartitions();


	/**
	 * Retrieves the {@link org.eclipse.uml2.ActivityPartition} with the specified '<em><b>Name</b></em>' from the '<em><b>In Partition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.ActivityPartition} to retrieve.
	 * @return The {@link org.eclipse.uml2.ActivityPartition} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getInPartitions()
	 * @generated
	 */
    ActivityPartition getInPartition(String name);

	/**
	 * Returns the value of the '<em><b>Weight</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Weight</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weight</em>' containment reference.
	 * @see #setWeight(ValueSpecification)
	 * @see org.eclipse.uml2.UML2Package#getActivityEdge_Weight()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ValueSpecification getWeight();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.ActivityEdge#getWeight <em>Weight</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight</em>' containment reference.
	 * @see #getWeight()
	 * @generated
	 */
	void setWeight(ValueSpecification value);


	/**
	 * Creates a {@link org.eclipse.uml2.ValueSpecification} and sets the '<em><b>Weight</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.ValueSpecification} to create.
	 * @return The new {@link org.eclipse.uml2.ValueSpecification}.
	 * @see #getWeight()
	 * @generated
	 */
    ValueSpecification createWeight(EClass eClass);

	/**
	 * Returns the value of the '<em><b>Interrupts</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.InterruptibleActivityRegion#getInterruptingEdges <em>Interrupting Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interrupts</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interrupts</em>' reference.
	 * @see #setInterrupts(InterruptibleActivityRegion)
	 * @see org.eclipse.uml2.UML2Package#getActivityEdge_Interrupts()
	 * @see org.eclipse.uml2.InterruptibleActivityRegion#getInterruptingEdges
	 * @model opposite="interruptingEdge"
	 * @generated
	 */
	InterruptibleActivityRegion getInterrupts();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.ActivityEdge#getInterrupts <em>Interrupts</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interrupts</em>' reference.
	 * @see #getInterrupts()
	 * @generated
	 */
	void setInterrupts(InterruptibleActivityRegion value);


} // ActivityEdge
