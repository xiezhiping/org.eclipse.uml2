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
 * $Id: InstanceSpecification.java,v 1.2 2005/12/14 22:34:16 khussey Exp $
 */
package org.eclipse.uml2.uml;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An instance specification specifies existence of an entity in a modeled system and completely or partially describes the entity.
 * 
 * The description may include:
 * 
 * 
 * 
 * - Classification of the entity by one or more classifiers of which the entity is an instance. If the only classifier specified is abstract, then the instance specification only partially describes the entity.
 * 
 * - The kind of instance, based on its classifier or classifiers -- for example, an instance specification whose classifier is a class describes an object of that class, while an instance specification whose classifier is an association describes a link of that association.
 * 
 * - Specification of values of structural features of the entity. Not all structural features of all classifiers of the instance specification need be represented by slots, in which case the instance specification is a partial description.
 * 
 * - Specification of how to compute, derive or construct the instance (optional).
 * 
 * 
 * 
 * InstanceSpecification is a concrete class.
 * 
 * 
 * In the metamodel, InstanceSpecification is a specialization of DeploymentTarget and DeployedArtifact.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.InstanceSpecification#getClassifiers <em>Classifier</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.InstanceSpecification#getSlots <em>Slot</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.InstanceSpecification#getSpecification <em>Specification</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getInstanceSpecification()
 * @model
 * @generated
 */
public interface InstanceSpecification
		extends DeploymentTarget, PackageableElement, DeployedArtifact {

	/**
	 * Returns the value of the '<em><b>Classifier</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Classifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The classifier or classifiers of the represented instance. If multiple classifiers are specified, the instance is classified by all of them.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Classifier</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getInstanceSpecification_Classifier()
	 * @model type="org.eclipse.uml2.uml.Classifier" ordered="false"
	 * @generated
	 */
	EList getClassifiers();

	/**
	 * Retrieves the {@link org.eclipse.uml2.uml.Classifier} with the specified '<em><b>Name</b></em>' from the '<em><b>Classifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Classifier} to retrieve.
	 * @return The {@link org.eclipse.uml2.uml.Classifier} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getClassifiers()
	 * @generated
	 */
	Classifier getClassifier(String name);

	/**
	 * Returns the value of the '<em><b>Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A specification of how to compute, derive, or construct the instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Specification</em>' containment reference.
	 * @see #setSpecification(ValueSpecification)
	 * @see org.eclipse.uml2.uml.UMLPackage#getInstanceSpecification_Specification()
	 * @model containment="true" resolveProxies="false" ordered="false"
	 * @generated
	 */
	ValueSpecification getSpecification();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.InstanceSpecification#getSpecification <em>Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specification</em>' containment reference.
	 * @see #getSpecification()
	 * @generated
	 */
	void setSpecification(ValueSpecification value);

	/**
	 * Creates a {@link org.eclipse.uml2.uml.ValueSpecification} and sets the '<em><b>Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.ValueSpecification} to create.
	 * @return The new {@link org.eclipse.uml2.uml.ValueSpecification}.
	 * @see #getSpecification()
	 * @generated
	 */
	ValueSpecification createSpecification(EClass eClass);

	/**
	 * Returns the value of the '<em><b>Slot</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Slot}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.Slot#getOwningInstance <em>Owning Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A slot giving the value or values of a structural feature of the instance. An instance specification can have one slot per structural feature of its classifiers, including inherited features. It is not necessary to model a slot for each structural feature, in which case the instance specification is a partial description.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Slot</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getInstanceSpecification_Slot()
	 * @see org.eclipse.uml2.uml.Slot#getOwningInstance
	 * @model type="org.eclipse.uml2.uml.Slot" opposite="owningInstance" containment="true" resolveProxies="false" ordered="false"
	 * @generated
	 */
	EList getSlots();

	/**
	 * Creates a {@link org.eclipse.uml2.uml.Slot} and appends it to the '<em><b>Slot</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The new {@link org.eclipse.uml2.uml.Slot}.
	 * @see #getSlots()
	 * @generated
	 */
	Slot createSlot();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The defining feature of each slot is a structural feature (directly or inherited) of a classifier of the instance specification.
	 * slot->forAll(s | classifier->exists (c | c.allFeatures()->includes (s.definingFeature)))
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateDefiningFeature(DiagnosticChain diagnostics, Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * One structural feature (including the same feature inherited from multiple classifiers) is the defining feature of at most one slot in an instance specification.
	 * classifier->forAll(c | (c.allFeatures()->forAll(f | slot->select(s | s.definingFeature = f)->size() <= 1)))
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateStructuralFeature(DiagnosticChain diagnostics, Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An InstanceSpecification can be a DeploymentTarget if it is the instance specification of a Node and functions as a part in the internal structure of an encompassing Node.
	 * true
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateDeploymentTarget(DiagnosticChain diagnostics, Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An InstanceSpecification can be a DeployedArtifact if it is the instance specification of an Artifact.
	 * true
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateDeploymentArtifact(DiagnosticChain diagnostics, Map context);

} // InstanceSpecification
