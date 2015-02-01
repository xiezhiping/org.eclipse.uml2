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
 * A representation of the model object '<em><b>Information Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * InformationFlows describe circulation of information through a system in a general manner. They do not specify the nature of the information, mechanisms by which it is conveyed, sequences of exchange or any control conditions. During more detailed modeling, representation and realization links may be added to specify which model elements implement an InformationFlow and to show how information is conveyed.  InformationFlows require some kind of “information channel” for unidirectional transmission of information items from sources to targets.  They specify the information channel’s realizations, if any, and identify the information that flows along them.  Information moving along the information channel may be represented by abstract InformationItems and by concrete Classifiers.
 * <p>From package UML::InformationFlows.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.InformationFlow#getConveyeds <em>Conveyed</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.InformationFlow#getInformationSources <em>Information Source</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.InformationFlow#getInformationTargets <em>Information Target</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.InformationFlow#getRealizations <em>Realization</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.InformationFlow#getRealizingActivityEdges <em>Realizing Activity Edge</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.InformationFlow#getRealizingConnectors <em>Realizing Connector</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.InformationFlow#getRealizingMessages <em>Realizing Message</em>}</li>
 * </ul>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getInformationFlow()
 * @model
 * @generated
 */
public interface InformationFlow
		extends PackageableElement, DirectedRelationship {

	/**
	 * Returns the value of the '<em><b>Realization</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Relationship}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Determines which Relationship will realize the specified flow.
	 * <p>From package UML::InformationFlows.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Realization</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getInformationFlow_Realization()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Relationship> getRealizations();

	/**
	 * Returns the value of the '<em><b>Conveyed</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Classifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the information items that may circulate on this information flow.
	 * <p>From package UML::InformationFlows.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conveyed</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getInformationFlow_Conveyed()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<Classifier> getConveyeds();

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Classifier} with the specified '<em><b>Name</b></em>' from the '<em><b>Conveyed</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Classifier} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.Classifier} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getConveyeds()
	 * @generated
	 */
	Classifier getConveyed(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Classifier} with the specified '<em><b>Name</b></em>' from the '<em><b>Conveyed</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Classifier} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.Classifier} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.Classifier} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getConveyeds()
	 * @generated
	 */
	Classifier getConveyed(String name, boolean ignoreCase, EClass eClass);

	/**
	 * Returns the value of the '<em><b>Information Source</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.NamedElement}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.DirectedRelationship#getSources() <em>Source</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines from which source the conveyed InformationItems are initiated.
	 * <p>From package UML::InformationFlows.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Information Source</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getInformationFlow_InformationSource()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<NamedElement> getInformationSources();

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.NamedElement} with the specified '<em><b>Name</b></em>' from the '<em><b>Information Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.NamedElement} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.NamedElement} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getInformationSources()
	 * @generated
	 */
	NamedElement getInformationSource(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.NamedElement} with the specified '<em><b>Name</b></em>' from the '<em><b>Information Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.NamedElement} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.NamedElement} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.NamedElement} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getInformationSources()
	 * @generated
	 */
	NamedElement getInformationSource(String name, boolean ignoreCase,
			EClass eClass);

	/**
	 * Returns the value of the '<em><b>Information Target</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.NamedElement}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.DirectedRelationship#getTargets() <em>Target</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines to which target the conveyed InformationItems are directed.
	 * <p>From package UML::InformationFlows.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Information Target</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getInformationFlow_InformationTarget()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<NamedElement> getInformationTargets();

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.NamedElement} with the specified '<em><b>Name</b></em>' from the '<em><b>Information Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.NamedElement} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.NamedElement} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getInformationTargets()
	 * @generated
	 */
	NamedElement getInformationTarget(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.NamedElement} with the specified '<em><b>Name</b></em>' from the '<em><b>Information Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.NamedElement} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.NamedElement} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.NamedElement} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getInformationTargets()
	 * @generated
	 */
	NamedElement getInformationTarget(String name, boolean ignoreCase,
			EClass eClass);

	/**
	 * Returns the value of the '<em><b>Realizing Activity Edge</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.ActivityEdge}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Determines which ActivityEdges will realize the specified flow.
	 * <p>From package UML::InformationFlows.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Realizing Activity Edge</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getInformationFlow_RealizingActivityEdge()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ActivityEdge> getRealizingActivityEdges();

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.ActivityEdge} with the specified '<em><b>Name</b></em>' from the '<em><b>Realizing Activity Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.ActivityEdge} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.ActivityEdge} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getRealizingActivityEdges()
	 * @generated
	 */
	ActivityEdge getRealizingActivityEdge(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.ActivityEdge} with the specified '<em><b>Name</b></em>' from the '<em><b>Realizing Activity Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.ActivityEdge} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.ActivityEdge} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.ActivityEdge} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getRealizingActivityEdges()
	 * @generated
	 */
	ActivityEdge getRealizingActivityEdge(String name, boolean ignoreCase,
			EClass eClass);

	/**
	 * Returns the value of the '<em><b>Realizing Connector</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Connector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Determines which Connectors will realize the specified flow.
	 * <p>From package UML::InformationFlows.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Realizing Connector</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getInformationFlow_RealizingConnector()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Connector> getRealizingConnectors();

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Connector} with the specified '<em><b>Name</b></em>' from the '<em><b>Realizing Connector</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Connector} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.Connector} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getRealizingConnectors()
	 * @generated
	 */
	Connector getRealizingConnector(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Connector} with the specified '<em><b>Name</b></em>' from the '<em><b>Realizing Connector</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Connector} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @return The first {@link org.eclipse.uml2.uml.Connector} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getRealizingConnectors()
	 * @generated
	 */
	Connector getRealizingConnector(String name, boolean ignoreCase);

	/**
	 * Returns the value of the '<em><b>Realizing Message</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Message}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Determines which Messages will realize the specified flow.
	 * <p>From package UML::InformationFlows.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Realizing Message</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getInformationFlow_RealizingMessage()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Message> getRealizingMessages();

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Message} with the specified '<em><b>Name</b></em>' from the '<em><b>Realizing Message</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Message} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.Message} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getRealizingMessages()
	 * @generated
	 */
	Message getRealizingMessage(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Message} with the specified '<em><b>Name</b></em>' from the '<em><b>Realizing Message</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Message} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @return The first {@link org.eclipse.uml2.uml.Message} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getRealizingMessages()
	 * @generated
	 */
	Message getRealizingMessage(String name, boolean ignoreCase);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The sources and targets of the information flow can only be one of the following kind: Actor, Node, UseCase, Artifact, Class, Component, Port, Property, Interface, Package, ActivityNode, ActivityPartition,
	 * Behavior and InstanceSpecification except when its classifier is a relationship (i.e. it represents a link).
	 * (self.informationSource->forAll( sis |
	 *   oclIsKindOf(Actor) or oclIsKindOf(Node) or oclIsKindOf(UseCase) or oclIsKindOf(Artifact) or 
	 *   oclIsKindOf(Class) or oclIsKindOf(Component) or oclIsKindOf(Port) or oclIsKindOf(Property) or 
	 *   oclIsKindOf(Interface) or oclIsKindOf(Package) or oclIsKindOf(ActivityNode) or oclIsKindOf(ActivityPartition) or 
	 *   (oclIsKindOf(InstanceSpecification) and not sis.oclAsType(InstanceSpecification).classifier->exists(oclIsKindOf(Relationship))))) 
	 * 
	 * and
	 * 
	 * (self.informationTarget->forAll( sit | 
	 *   oclIsKindOf(Actor) or oclIsKindOf(Node) or oclIsKindOf(UseCase) or oclIsKindOf(Artifact) or 
	 *   oclIsKindOf(Class) or oclIsKindOf(Component) or oclIsKindOf(Port) or oclIsKindOf(Property) or 
	 *   oclIsKindOf(Interface) or oclIsKindOf(Package) or oclIsKindOf(ActivityNode) or oclIsKindOf(ActivityPartition) or 
	 * (oclIsKindOf(InstanceSpecification) and not sit.oclAsType(InstanceSpecification).classifier->exists(oclIsKindOf(Relationship)))))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateSourcesAndTargetsKind(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The sources and targets of the information flow must conform to the sources and targets or conversely the targets and sources of the realization relationships.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateMustConform(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An information flow can only convey classifiers that are allowed to represent an information item.
	 * self.conveyed->forAll(oclIsKindOf(Class) or oclIsKindOf(Interface)
	 *   or oclIsKindOf(InformationItem) or oclIsKindOf(Signal) or oclIsKindOf(Component))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateConveyClassifiers(DiagnosticChain diagnostics,
			Map<Object, Object> context);

} // InformationFlow
