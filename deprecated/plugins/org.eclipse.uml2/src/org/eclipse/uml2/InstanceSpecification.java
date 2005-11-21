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
 * $Id: InstanceSpecification.java,v 1.12 2005/11/21 21:48:03 khussey Exp $
 */
package org.eclipse.uml2;

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
 * In the metamodel, InstanceSpecification is a specialization of DeploymentTarget and DeployedArtifact. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.InstanceSpecification#getSlots <em>Slot</em>}</li>
 *   <li>{@link org.eclipse.uml2.InstanceSpecification#getClassifiers <em>Classifier</em>}</li>
 *   <li>{@link org.eclipse.uml2.InstanceSpecification#getSpecification <em>Specification</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.UML2Package#getInstanceSpecification()
 * @model
 * @generated
 */
public interface InstanceSpecification extends PackageableElement, DeploymentTarget, DeployedArtifact{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Slot</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.Slot}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.Slot#getOwningInstance <em>Owning Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Slot</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A slot giving the value or values of a structural feature of the instance. An instance specification can have one slot per structural feature of its classifiers, including inherited features. It is not necessary to model a slot for each structural feature, in which case the instance specification is a partial description. Subsets Element::ownedElement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Slot</em>' containment reference list.
	 * @see org.eclipse.uml2.UML2Package#getInstanceSpecification_Slot()
	 * @see org.eclipse.uml2.Slot#getOwningInstance
	 * @model type="org.eclipse.uml2.Slot" opposite="owningInstance" containment="true" resolveProxies="false" ordered="false"
	 * @generated
	 */
	EList getSlots();


    /**
     * Creates a {@link org.eclipse.uml2.Slot} and appends it to the '<em><b>Slot</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.Slot} to create.
	 * @return The new {@link org.eclipse.uml2.Slot}.
	 * @see #getSlots()
	 * @generated NOT
	 * @deprecated Use #createSlot() instead.
     */
    Slot createSlot(EClass eClass);

	/**
	 * Creates a {@link org.eclipse.uml2.Slot} and appends it to the '<em><b>Slot</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The new {@link org.eclipse.uml2.Slot}.
	 * @see #getSlots()
	 * @generated
	 */
    Slot createSlot();

	/**
	 * Returns the value of the '<em><b>Classifier</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.Classifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classifier</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The classifier or classifiers of the represented instance. If multiple classifiers are specified, the instance is classified by all of them.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Classifier</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getInstanceSpecification_Classifier()
	 * @model type="org.eclipse.uml2.Classifier" ordered="false"
	 * @generated
	 */
	EList getClassifiers();


	/**
	 * Retrieves the {@link org.eclipse.uml2.Classifier} with the specified '<em><b>Name</b></em>' from the '<em><b>Classifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.Classifier} to retrieve.
	 * @return The {@link org.eclipse.uml2.Classifier} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getClassifiers()
	 * @generated
	 */
    Classifier getClassifier(String name);

	/**
	 * Returns the value of the '<em><b>Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specification</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A specification of how to compute, derive, or construct the instance. Subsets Element:: ownedElement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Specification</em>' containment reference.
	 * @see #setSpecification(ValueSpecification)
	 * @see org.eclipse.uml2.UML2Package#getInstanceSpecification_Specification()
	 * @model containment="true" resolveProxies="false"
	 * @generated
	 */
	ValueSpecification getSpecification();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.InstanceSpecification#getSpecification <em>Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specification</em>' containment reference.
	 * @see #getSpecification()
	 * @generated
	 */
	void setSpecification(ValueSpecification value);


	/**
	 * Creates a {@link org.eclipse.uml2.ValueSpecification} and sets the '<em><b>Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.ValueSpecification} to create.
	 * @return The new {@link org.eclipse.uml2.ValueSpecification}.
	 * @see #getSpecification()
	 * @generated
	 */
    ValueSpecification createSpecification(EClass eClass);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An invariant constraint based on the following OCL expression:
	 * <code>
	 * slot->forAll(s |
	 *   classifier->exists(c | c.allFeatures()->includes(s.definingFeature))
	 * </code>
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.uml2.Boolean"
	 * @generated
	 */
	boolean validateSlotsAreDefined(DiagnosticChain diagnostics, Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An invariant constraint based on the following OCL expression:
	 * <code>
	 * classifier->forAll(c |
	 * 	(c.allFeatures()->forAll(f | slot->select(s | s.definingFeature = f)->size() <= 1)
	 * 	)
	 * </code>
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.uml2.Boolean"
	 * @generated
	 */
	boolean validateNoDuplicateSlots(DiagnosticChain diagnostics, Map context);

} // InstanceSpecification
