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

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Partition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An ActivityPartition is a kind of ActivityGroup for identifying ActivityNodes that have some characteristic in common.
 * <p>From package UML::Activities.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.ActivityPartition#isDimension <em>Is Dimension</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ActivityPartition#isExternal <em>Is External</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ActivityPartition#getNodes <em>Node</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ActivityPartition#getRepresents <em>Represents</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ActivityPartition#getSubpartitions <em>Subpartition</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ActivityPartition#getSuperPartition <em>Super Partition</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ActivityPartition#getEdges <em>Edge</em>}</li>
 * </ul>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getActivityPartition()
 * @model
 * @generated
 */
public interface ActivityPartition
		extends ActivityGroup {

	/**
	 * Returns the value of the '<em><b>Is Dimension</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether the ActivityPartition groups other ActivityPartitions along a dimension.
	 * <p>From package UML::Activities.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Dimension</em>' attribute.
	 * @see #setIsDimension(boolean)
	 * @see org.eclipse.uml2.uml.UMLPackage#getActivityPartition_IsDimension()
	 * @model default="false" dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isDimension();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.ActivityPartition#isDimension <em>Is Dimension</em>}' attribute.
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
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether the ActivityPartition represents an entity to which the partitioning structure does not apply.
	 * <p>From package UML::Activities.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is External</em>' attribute.
	 * @see #setIsExternal(boolean)
	 * @see org.eclipse.uml2.uml.UMLPackage#getActivityPartition_IsExternal()
	 * @model default="false" dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isExternal();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.ActivityPartition#isExternal <em>Is External</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is External</em>' attribute.
	 * @see #isExternal()
	 * @generated
	 */
	void setIsExternal(boolean value);

	/**
	 * Returns the value of the '<em><b>Edge</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.ActivityEdge}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.ActivityEdge#getInPartitions <em>In Partition</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.ActivityGroup#getContainedEdges() <em>Contained Edge</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ActivityEdges immediately contained in the ActivityPartition.
	 * <p>From package UML::Activities.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Edge</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getActivityPartition_Edge()
	 * @see org.eclipse.uml2.uml.ActivityEdge#getInPartitions
	 * @model opposite="inPartition" ordered="false"
	 * @generated
	 */
	EList<ActivityEdge> getEdges();

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.ActivityEdge} with the specified '<em><b>Name</b></em>' from the '<em><b>Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.ActivityEdge} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.ActivityEdge} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getEdges()
	 * @generated
	 */
	ActivityEdge getEdge(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.ActivityEdge} with the specified '<em><b>Name</b></em>' from the '<em><b>Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.ActivityEdge} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.ActivityEdge} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.ActivityEdge} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getEdges()
	 * @generated
	 */
	ActivityEdge getEdge(String name, boolean ignoreCase, EClass eClass);

	/**
	 * Returns the value of the '<em><b>Node</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.ActivityNode}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.ActivityNode#getInPartitions <em>In Partition</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.ActivityGroup#getContainedNodes() <em>Contained Node</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ActivityNodes immediately contained in the ActivityPartition.
	 * <p>From package UML::Activities.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Node</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getActivityPartition_Node()
	 * @see org.eclipse.uml2.uml.ActivityNode#getInPartitions
	 * @model opposite="inPartition" ordered="false"
	 * @generated
	 */
	EList<ActivityNode> getNodes();

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.ActivityNode} with the specified '<em><b>Name</b></em>' from the '<em><b>Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.ActivityNode} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.ActivityNode} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getNodes()
	 * @generated
	 */
	ActivityNode getNode(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.ActivityNode} with the specified '<em><b>Name</b></em>' from the '<em><b>Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.ActivityNode} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.ActivityNode} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.ActivityNode} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getNodes()
	 * @generated
	 */
	ActivityNode getNode(String name, boolean ignoreCase, EClass eClass);

	/**
	 * Returns the value of the '<em><b>Subpartition</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.ActivityPartition}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.ActivityPartition#getSuperPartition <em>Super Partition</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.ActivityGroup#getSubgroups() <em>Subgroup</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Other ActivityPartitions immediately contained in this ActivityPartition (as its subgroups).
	 * <p>From package UML::Activities.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subpartition</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getActivityPartition_Subpartition()
	 * @see org.eclipse.uml2.uml.ActivityPartition#getSuperPartition
	 * @model opposite="superPartition" containment="true" resolveProxies="true" ordered="false"
	 * @generated
	 */
	EList<ActivityPartition> getSubpartitions();

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.ActivityPartition}, with the specified '<em><b>Name</b></em>', and appends it to the '<em><b>Subpartition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.ActivityPartition}, or <code>null</code>.
	 * @return The new {@link org.eclipse.uml2.uml.ActivityPartition}.
	 * @see #getSubpartitions()
	 * @generated
	 */
	ActivityPartition createSubpartition(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.ActivityPartition} with the specified '<em><b>Name</b></em>' from the '<em><b>Subpartition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.ActivityPartition} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.ActivityPartition} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getSubpartitions()
	 * @generated
	 */
	ActivityPartition getSubpartition(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.ActivityPartition} with the specified '<em><b>Name</b></em>' from the '<em><b>Subpartition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.ActivityPartition} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param createOnDemand Whether to create a {@link org.eclipse.uml2.uml.ActivityPartition} on demand if not found.
	 * @return The first {@link org.eclipse.uml2.uml.ActivityPartition} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getSubpartitions()
	 * @generated
	 */
	ActivityPartition getSubpartition(String name, boolean ignoreCase,
			boolean createOnDemand);

	/**
	 * Returns the value of the '<em><b>Super Partition</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.ActivityPartition#getSubpartitions <em>Subpartition</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.ActivityGroup#getSuperGroup() <em>Super Group</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Other ActivityPartitions immediately containing this ActivityPartition (as its superGroups).
	 * <p>From package UML::Activities.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Super Partition</em>' container reference.
	 * @see #setSuperPartition(ActivityPartition)
	 * @see org.eclipse.uml2.uml.UMLPackage#getActivityPartition_SuperPartition()
	 * @see org.eclipse.uml2.uml.ActivityPartition#getSubpartitions
	 * @model opposite="subpartition" transient="false" ordered="false"
	 * @generated
	 */
	ActivityPartition getSuperPartition();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.ActivityPartition#getSuperPartition <em>Super Partition</em>}' container reference.
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
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An Element represented by the functionality modeled within the ActivityPartition.
	 * <p>From package UML::Activities.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Represents</em>' reference.
	 * @see #setRepresents(Element)
	 * @see org.eclipse.uml2.uml.UMLPackage#getActivityPartition_Represents()
	 * @model ordered="false"
	 * @generated
	 */
	Element getRepresents();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.ActivityPartition#getRepresents <em>Represents</em>}' reference.
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
	 * <!-- begin-model-doc -->
	 * An ActvivityPartition with isDimension = true may not be contained by another ActivityPartition.
	 * isDimension implies superPartition->isEmpty()
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateDimensionNotContained(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If a non-external ActivityPartition represents a Classifier and has a superPartition, then the superPartition must represent a Classifier, and the Classifier of the subpartition must be nested (nestedClassifier or ownedBehavior) in the Classifier represented by the superPartition, or be at the contained end of a composition Association with the Classifier represented by the superPartition.
	 * (not isExternal and represents.oclIsKindOf(Classifier) and superPartition->notEmpty()) implies
	 * (
	 *    let representedClassifier : Classifier = represents.oclAsType(Classifier) in
	 *      superPartition.represents.oclIsKindOf(Classifier) and
	 *       let representedSuperClassifier : Classifier = superPartition.represents.oclAsType(Classifier) in
	 *        (representedSuperClassifier.oclIsKindOf(BehavioredClassifier) and representedClassifier.oclIsKindOf(Behavior) and 
	 *         representedSuperClassifier.oclAsType(BehavioredClassifier).ownedBehavior->includes(representedClassifier.oclAsType(Behavior))) 
	 *        or
	 *        (representedSuperClassifier.oclIsKindOf(Class) and  representedSuperClassifier.oclAsType(Class).nestedClassifier->includes(representedClassifier))
	 *        or
	 *        (Association.allInstances()->exists(a | a.memberEnd->exists(end1 | end1.isComposite and end1.type = representedClassifier and 
	 *                                                                       a.memberEnd->exists(end2 | end1<>end2 and end2.type = representedSuperClassifier))))
	 * )
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateRepresentsClassifier(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If an ActivityPartition represents a Property and has a superPartition, then the Property must be of a Classifier represented by the superPartition, or of a Classifier that is the type of a Property represented by the superPartition.
	 * (represents.oclIsKindOf(Property) and superPartition->notEmpty()) implies
	 * (
	 *   (superPartition.represents.oclIsKindOf(Classifier) and represents.owner = superPartition.represents) or 
	 *   (superPartition.represents.oclIsKindOf(Property) and represents.owner = superPartition.represents.oclAsType(Property).type)
	 * )
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateRepresentsPropertyAndIsContained(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If an ActivityPartition represents a Property and has a superPartition representing a Classifier, then all the other non-external subpartitions of the superPartition must represent Properties directly owned by the same Classifier.
	 * (represents.oclIsKindOf(Property) and superPartition->notEmpty() and superPartition.represents.oclIsKindOf(Classifier)) implies
	 * (
	 *   let representedClassifier : Classifier = superPartition.represents.oclAsType(Classifier)
	 *   in
	 *     superPartition.subpartition->reject(isExternal)->forAll(p | 
	 *        p.represents.oclIsKindOf(Property) and p.owner=representedClassifier)
	 * )
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateRepresentsProperty(DiagnosticChain diagnostics,
			Map<Object, Object> context);

} // ActivityPartition
