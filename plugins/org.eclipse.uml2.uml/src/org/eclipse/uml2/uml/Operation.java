/*
 * Copyright (c) 2005, 2015 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 327039, 351774, 418466, 433204, 451350
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
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An Operation is a BehavioralFeature of a Classifier that specifies the name, type, parameters, and constraints for invoking an associated Behavior. An Operation may invoke both the execution of method behaviors as well as other behavioral responses. Operation specializes TemplateableElement in order to support specification of template operations and bound operations. Operation specializes ParameterableElement to specify that an operation can be exposed as a formal template parameter, and provided as an actual parameter in a binding of a template.
 * <p>From package UML::Classification.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Operation#getBodyCondition <em>Body Condition</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Operation#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Operation#getDatatype <em>Datatype</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Operation#getInterface <em>Interface</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Operation#isOrdered <em>Is Ordered</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Operation#isQuery <em>Is Query</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Operation#isUnique <em>Is Unique</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Operation#getLower <em>Lower</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Operation#getPostconditions <em>Postcondition</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Operation#getPreconditions <em>Precondition</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Operation#getRedefinedOperations <em>Redefined Operation</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Operation#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Operation#getUpper <em>Upper</em>}</li>
 * </ul>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getOperation()
 * @model
 * @generated
 */
public interface Operation
		extends BehavioralFeature, ParameterableElement, TemplateableElement {

	/**
	 * Returns the value of the '<em><b>Is Query</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies whether an execution of the BehavioralFeature leaves the state of the system unchanged (isQuery=true) or whether side effects may occur (isQuery=false).
	 * <p>From package UML::Classification.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Query</em>' attribute.
	 * @see #setIsQuery(boolean)
	 * @see org.eclipse.uml2.uml.UMLPackage#getOperation_IsQuery()
	 * @model default="false" dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isQuery();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.Operation#isQuery <em>Is Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Query</em>' attribute.
	 * @see #isQuery()
	 * @generated
	 */
	void setIsQuery(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies whether the return parameter is ordered or not, if present.  This information is derived from the return result for this Operation.
	 * <p>From package UML::Classification.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Ordered</em>' attribute.
	 * @see org.eclipse.uml2.uml.UMLPackage#getOperation_IsOrdered()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	boolean isOrdered();

	/**
	 * Returns the value of the '<em><b>Is Unique</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies whether the return parameter is unique or not, if present. This information is derived from the return result for this Operation.
	 * <p>From package UML::Classification.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Unique</em>' attribute.
	 * @see org.eclipse.uml2.uml.UMLPackage#getOperation_IsUnique()
	 * @model default="true" dataType="org.eclipse.uml2.types.Boolean" required="true" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	boolean isUnique();

	/**
	 * Returns the value of the '<em><b>Lower</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the lower multiplicity of the return parameter, if present. This information is derived from the return result for this Operation.
	 * <p>From package UML::Classification.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lower</em>' attribute.
	 * @see org.eclipse.uml2.uml.UMLPackage#getOperation_Lower()
	 * @model default="1" dataType="org.eclipse.uml2.types.Integer" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	int getLower();

	/**
	 * Returns the value of the '<em><b>Upper</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The upper multiplicity of the return parameter, if present. This information is derived from the return result for this Operation.
	 * <p>From package UML::Classification.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Upper</em>' attribute.
	 * @see org.eclipse.uml2.uml.UMLPackage#getOperation_Upper()
	 * @model default="1" dataType="org.eclipse.uml2.types.UnlimitedNatural" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	int getUpper();

	/**
	 * Returns the value of the '<em><b>Class</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.Class#getOwnedOperations <em>Owned Operation</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Feature#getFeaturingClassifiers() <em>Featuring Classifier</em>}'</li>
	 *   <li>'{@link org.eclipse.uml2.uml.NamedElement#getNamespace() <em>Namespace</em>}'</li>
	 *   <li>'{@link org.eclipse.uml2.uml.RedefinableElement#getRedefinitionContexts() <em>Redefinition Context</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Class that owns this operation, if any.
	 * <p>From package UML::Classification.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Class</em>' container reference.
	 * @see #setClass_(org.eclipse.uml2.uml.Class)
	 * @see org.eclipse.uml2.uml.UMLPackage#getOperation_Class()
	 * @see org.eclipse.uml2.uml.Class#getOwnedOperations
	 * @model opposite="ownedOperation" transient="false" ordered="false"
	 * @generated
	 */
	org.eclipse.uml2.uml.Class getClass_();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.Operation#getClass_ <em>Class</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' container reference.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass_(org.eclipse.uml2.uml.Class value);

	/**
	 * Returns the value of the '<em><b>Precondition</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Constraint}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Namespace#getOwnedRules() <em>Owned Rule</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An optional set of Constraints on the state of the system when the Operation is invoked.
	 * <p>From package UML::Classification.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Precondition</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getOperation_Precondition()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Constraint> getPreconditions();

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.Constraint}, with the specified '<em><b>Name</b></em>', and appends it to the '<em><b>Precondition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.Constraint}, or <code>null</code>.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.Constraint} to create.
	 * @return The new {@link org.eclipse.uml2.uml.Constraint}.
	 * @see #getPreconditions()
	 * @generated
	 */
	Constraint createPrecondition(String name, EClass eClass);

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.Constraint}, with the specified '<em><b>Name</b></em>', and appends it to the '<em><b>Precondition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.Constraint}, or <code>null</code>.
	 * @return The new {@link org.eclipse.uml2.uml.Constraint}.
	 * @see #getPreconditions()
	 * @generated
	 */
	Constraint createPrecondition(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Constraint} with the specified '<em><b>Name</b></em>' from the '<em><b>Precondition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Constraint} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.Constraint} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getPreconditions()
	 * @generated
	 */
	Constraint getPrecondition(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Constraint} with the specified '<em><b>Name</b></em>' from the '<em><b>Precondition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Constraint} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.Constraint} to retrieve, or <code>null</code>.
	 * @param createOnDemand Whether to create a {@link org.eclipse.uml2.uml.Constraint} on demand if not found.
	 * @return The first {@link org.eclipse.uml2.uml.Constraint} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getPreconditions()
	 * @generated
	 */
	Constraint getPrecondition(String name, boolean ignoreCase, EClass eClass,
			boolean createOnDemand);

	/**
	 * Returns the value of the '<em><b>Postcondition</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Constraint}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Namespace#getOwnedRules() <em>Owned Rule</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An optional set of Constraints specifying the state of the system when the Operation is completed.
	 * <p>From package UML::Classification.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Postcondition</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getOperation_Postcondition()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Constraint> getPostconditions();

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.Constraint}, with the specified '<em><b>Name</b></em>', and appends it to the '<em><b>Postcondition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.Constraint}, or <code>null</code>.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.Constraint} to create.
	 * @return The new {@link org.eclipse.uml2.uml.Constraint}.
	 * @see #getPostconditions()
	 * @generated
	 */
	Constraint createPostcondition(String name, EClass eClass);

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.Constraint}, with the specified '<em><b>Name</b></em>', and appends it to the '<em><b>Postcondition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.Constraint}, or <code>null</code>.
	 * @return The new {@link org.eclipse.uml2.uml.Constraint}.
	 * @see #getPostconditions()
	 * @generated
	 */
	Constraint createPostcondition(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Constraint} with the specified '<em><b>Name</b></em>' from the '<em><b>Postcondition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Constraint} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.Constraint} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getPostconditions()
	 * @generated
	 */
	Constraint getPostcondition(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Constraint} with the specified '<em><b>Name</b></em>' from the '<em><b>Postcondition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Constraint} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.Constraint} to retrieve, or <code>null</code>.
	 * @param createOnDemand Whether to create a {@link org.eclipse.uml2.uml.Constraint} on demand if not found.
	 * @return The first {@link org.eclipse.uml2.uml.Constraint} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getPostconditions()
	 * @generated
	 */
	Constraint getPostcondition(String name, boolean ignoreCase, EClass eClass,
			boolean createOnDemand);

	/**
	 * Returns the value of the '<em><b>Redefined Operation</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Operation}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.RedefinableElement#getRedefinedElements() <em>Redefined Element</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Operations that are redefined by this Operation.
	 * <p>From package UML::Classification.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Redefined Operation</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getOperation_RedefinedOperation()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Operation> getRedefinedOperations();

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Operation} with the specified '<em><b>Name</b></em>', '<em><b>Owned Parameter Names</b></em>', and '<em><b>Owned Parameter Types</b></em>' from the '<em><b>Redefined Operation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Operation} to retrieve, or <code>null</code>.
	 * @param ownedParameterNames The '<em><b>Owned Parameter Names</b></em>' of the {@link org.eclipse.uml2.uml.Operation} to retrieve, or <code>null</code>.
	 * @param ownedParameterTypes The '<em><b>Owned Parameter Types</b></em>' of the {@link org.eclipse.uml2.uml.Operation} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.Operation} with the specified '<em><b>Name</b></em>', '<em><b>Owned Parameter Names</b></em>', and '<em><b>Owned Parameter Types</b></em>', or <code>null</code>.
	 * @see #getRedefinedOperations()
	 * @generated
	 */
	Operation getRedefinedOperation(String name,
			EList<String> ownedParameterNames, EList<Type> ownedParameterTypes);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Operation} with the specified '<em><b>Name</b></em>', '<em><b>Owned Parameter Names</b></em>', and '<em><b>Owned Parameter Types</b></em>' from the '<em><b>Redefined Operation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Operation} to retrieve, or <code>null</code>.
	 * @param ownedParameterNames The '<em><b>Owned Parameter Names</b></em>' of the {@link org.eclipse.uml2.uml.Operation} to retrieve, or <code>null</code>.
	 * @param ownedParameterTypes The '<em><b>Owned Parameter Types</b></em>' of the {@link org.eclipse.uml2.uml.Operation} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @return The first {@link org.eclipse.uml2.uml.Operation} with the specified '<em><b>Name</b></em>', '<em><b>Owned Parameter Names</b></em>', and '<em><b>Owned Parameter Types</b></em>', or <code>null</code>.
	 * @see #getRedefinedOperations()
	 * @generated
	 */
	Operation getRedefinedOperation(String name,
			EList<String> ownedParameterNames, EList<Type> ownedParameterTypes,
			boolean ignoreCase);

	/**
	 * Returns the value of the '<em><b>Datatype</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.DataType#getOwnedOperations <em>Owned Operation</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Feature#getFeaturingClassifiers() <em>Featuring Classifier</em>}'</li>
	 *   <li>'{@link org.eclipse.uml2.uml.NamedElement#getNamespace() <em>Namespace</em>}'</li>
	 *   <li>'{@link org.eclipse.uml2.uml.RedefinableElement#getRedefinitionContexts() <em>Redefinition Context</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The DataType that owns this Operation, if any.
	 * <p>From package UML::Classification.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Datatype</em>' container reference.
	 * @see #setDatatype(DataType)
	 * @see org.eclipse.uml2.uml.UMLPackage#getOperation_Datatype()
	 * @see org.eclipse.uml2.uml.DataType#getOwnedOperations
	 * @model opposite="ownedOperation" transient="false" ordered="false"
	 * @generated
	 */
	DataType getDatatype();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.Operation#getDatatype <em>Datatype</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datatype</em>' container reference.
	 * @see #getDatatype()
	 * @generated
	 */
	void setDatatype(DataType value);

	/**
	 * Returns the value of the '<em><b>Body Condition</b></em>' reference.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Namespace#getOwnedRules() <em>Owned Rule</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An optional Constraint on the result values of an invocation of this Operation.
	 * <p>From package UML::Classification.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Body Condition</em>' reference.
	 * @see #setBodyCondition(Constraint)
	 * @see org.eclipse.uml2.uml.UMLPackage#getOperation_BodyCondition()
	 * @model ordered="false"
	 * @generated
	 */
	Constraint getBodyCondition();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.Operation#getBodyCondition <em>Body Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body Condition</em>' reference.
	 * @see #getBodyCondition()
	 * @generated
	 */
	void setBodyCondition(Constraint value);

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.Constraint}, with the specified '<em><b>Name</b></em>', and sets the '<em><b>Body Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.Constraint}, or <code>null</code>.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.Constraint} to create.
	 * @return The new {@link org.eclipse.uml2.uml.Constraint}.
	 * @see #getBodyCondition()
	 * @generated
	 */
	Constraint createBodyCondition(String name, EClass eClass);

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.Constraint},with the specified '<em><b>Name</b></em>', and sets the '<em><b>Body Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.Constraint}, or <code>null</code>.
	 * @return The new {@link org.eclipse.uml2.uml.Constraint}.
	 * @see #getBodyCondition()
	 * @generated
	 */
	Constraint createBodyCondition(String name);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The return type of the operation, if present. This information is derived from the return result for this Operation.
	 * <p>From package UML::Classification.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see org.eclipse.uml2.uml.UMLPackage#getOperation_Type()
	 * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	Type getType();

	/**
	 * Returns the value of the '<em><b>Interface</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.Interface#getOwnedOperations <em>Owned Operation</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Feature#getFeaturingClassifiers() <em>Featuring Classifier</em>}'</li>
	 *   <li>'{@link org.eclipse.uml2.uml.NamedElement#getNamespace() <em>Namespace</em>}'</li>
	 *   <li>'{@link org.eclipse.uml2.uml.RedefinableElement#getRedefinitionContexts() <em>Redefinition Context</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Interface that owns this Operation, if any.
	 * <p>From package UML::Classification.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interface</em>' container reference.
	 * @see #setInterface(Interface)
	 * @see org.eclipse.uml2.uml.UMLPackage#getOperation_Interface()
	 * @see org.eclipse.uml2.uml.Interface#getOwnedOperations
	 * @model opposite="ownedOperation" transient="false" ordered="false"
	 * @generated
	 */
	Interface getInterface();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.Operation#getInterface <em>Interface</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface</em>' container reference.
	 * @see #getInterface()
	 * @generated
	 */
	void setInterface(Interface value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An Operation can have at most one return parameter; i.e., an owned parameter with the direction set to 'return.'
	 * self.ownedParameter->select(direction = ParameterDirectionKind::return)->size() <= 1
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateAtMostOneReturn(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A bodyCondition can only be specified for a query Operation.
	 * bodyCondition <> null implies isQuery
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateOnlyBodyForQuery(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the (only) return result parameter for this operation.
	 * <!-- end-model-doc -->
	 * @model kind="operation" ordered="false"
	 * @generated
	 */
	Parameter getReturnResult();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model newIsOrderedDataType="org.eclipse.uml2.types.Boolean" newIsOrderedRequired="true" newIsOrderedOrdered="false"
	 * @generated
	 */
	void setIsOrdered(boolean newIsOrdered);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model newIsUniqueDataType="org.eclipse.uml2.types.Boolean" newIsUniqueRequired="true" newIsUniqueOrdered="false"
	 * @generated
	 */
	void setIsUnique(boolean newIsUnique);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model newLowerDataType="org.eclipse.uml2.types.Integer" newLowerRequired="true" newLowerOrdered="false"
	 * @generated
	 */
	void setLower(int newLower);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model newTypeRequired="true" newTypeOrdered="false"
	 * @generated
	 */
	void setType(Type newType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model newUpperDataType="org.eclipse.uml2.types.UnlimitedNatural" newUpperRequired="true" newUpperOrdered="false"
	 * @generated
	 */
	void setUpper(int newUpper);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query returnResult() returns the set containing the return parameter of the Operation if one exists, otherwise, it returns an empty set
	 * result = (ownedParameter->select (direction = ParameterDirectionKind::return)->asSet())
	 * <p>From package UML::Classification.</p>
	 * <!-- end-model-doc -->
	 * @model ordered="false"
	 * @generated
	 */
	EList<Parameter> returnResult();

} // Operation
