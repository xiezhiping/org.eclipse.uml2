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

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.Constraint#getContext <em>Context</em>}</li>
 *   <li>{@link org.eclipse.uml2.Constraint#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link org.eclipse.uml2.Constraint#getSpecification <em>Specification</em>}</li>
 *   <li>{@link org.eclipse.uml2.Constraint#getConstrainedElements <em>Constrained Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.UML2Package#getConstraint()
 * @model 
 * @generated
 */
public interface Constraint extends PackageableElement{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' reference.
	 * @see org.eclipse.uml2.UML2Package#getConstraint_Context()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	Namespace getContext();

	/**
	 * Returns the value of the '<em><b>Namespace</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.Namespace#getOwnedRules <em>Owned Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Namespace</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namespace</em>' container reference.
	 * @see #setNamespace(Namespace)
	 * @see org.eclipse.uml2.UML2Package#getConstraint_Namespace()
	 * @see org.eclipse.uml2.Namespace#getOwnedRules
	 * @model opposite="ownedRule" volatile="true"
	 * @generated
	 */
	Namespace getNamespace();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.Constraint#getNamespace <em>Namespace</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namespace</em>' container reference.
	 * @see #getNamespace()
	 * @generated
	 */
	void setNamespace(Namespace value);

	/**
	 * Returns the value of the '<em><b>Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specification</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specification</em>' containment reference.
	 * @see #setSpecification(ValueSpecification)
	 * @see org.eclipse.uml2.UML2Package#getConstraint_Specification()
	 * @model containment="true" required="true" volatile="true"
	 * @generated
	 */
	ValueSpecification getSpecification();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.Constraint#getSpecification <em>Specification</em>}' containment reference.
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
	 * Returns the value of the '<em><b>Constrained Element</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.Element}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constrained Element</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constrained Element</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getConstraint_ConstrainedElement()
	 * @model type="org.eclipse.uml2.Element"
	 * @generated
	 */
	EList getConstrainedElements();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An invariant constraint based on the following OCL expression:
	 * <code>
	 * not constrainedElement->includes(self)
	 * </code>
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.uml2.Boolean" 
	 * @generated
	 */
	boolean validateNotApplyToSelf(DiagnosticChain diagnostics, Map data);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parameters=""
	 * @generated
	 */
	EList getOwnedElements();

} // Constraint
