/*
 * Copyright (c) 2003, 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *
 * $Id: Operation.java,v 1.8 2004/10/01 19:36:29 khussey Exp $
 */
package org.eclipse.uml2;

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
 * An operation is a behavioral feature of a classifier that specifies the name, type, parameters, and constraints for invoking an associated behavior. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.Operation#getOwnedParameters <em>Owned Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.Operation#getClass_ <em>Class </em>}</li>
 *   <li>{@link org.eclipse.uml2.Operation#isQuery <em>Is Query</em>}</li>
 *   <li>{@link org.eclipse.uml2.Operation#getDatatype <em>Datatype</em>}</li>
 *   <li>{@link org.eclipse.uml2.Operation#getPreconditions <em>Precondition</em>}</li>
 *   <li>{@link org.eclipse.uml2.Operation#getPostconditions <em>Postcondition</em>}</li>
 *   <li>{@link org.eclipse.uml2.Operation#getRedefinedOperations <em>Redefined Operation</em>}</li>
 *   <li>{@link org.eclipse.uml2.Operation#getBodyCondition <em>Body Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.UML2Package#getOperation()
 * @model 
 * @generated
 */
public interface Operation extends BehavioralFeature, TypedElement, MultiplicityElement, ParameterableElement{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Is Query</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Query</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies whether an execution of the BehavioralFeature leaves the state of the system unchanged (isQuery=true) or whether side effects may occur (isQuery=false). The default value is false.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Query</em>' attribute.
	 * @see #setIsQuery(boolean)
	 * @see org.eclipse.uml2.UML2Package#getOperation_IsQuery()
	 * @model default="false" dataType="org.eclipse.uml2.Boolean" volatile="true"
	 * @generated
	 */
	boolean isQuery();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.Operation#isQuery <em>Is Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Query</em>' attribute.
	 * @see #isQuery()
	 * @generated
	 */
	void setIsQuery(boolean value);

	/**
	 * Returns the value of the '<em><b>Owned Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.Parameter}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.Parameter#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Parameter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Parameter</em>' containment reference list.
	 * @see org.eclipse.uml2.UML2Package#getOperation_OwnedParameter()
	 * @see org.eclipse.uml2.Parameter#getOperation
	 * @model type="org.eclipse.uml2.Parameter" opposite="operation" containment="true"
	 * @generated
	 */
	EList getOwnedParameters();

    /**
     * Retrieves the {@link org.eclipse.uml2.Parameter} with the specified name from the '<em><b>Owned Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param unqualifiedName The unqualified name of the {@link org.eclipse.uml2.Parameter} to retrieve.
	 * @return The {@link org.eclipse.uml2.Parameter} with the specified name, or <code>null</code>.
	 * @see #getOwnedParameters()
	 * @generated
     */
    Parameter getOwnedParameter(String unqualifiedName);
      
    /**
     * Creates a {@link org.eclipse.uml2.Parameter} and appends it to the '<em><b>Owned Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.Parameter} to create.
	 * @return The new {@link org.eclipse.uml2.Parameter}.
	 * @see #getOwnedParameters()
	 * @generated
     */
    Parameter createOwnedParameter(EClass eClass);

	/**
	 * Returns the value of the '<em><b>Class </b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.Class#getOwnedOperations <em>Owned Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class </em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class </em>' container reference.
	 * @see #setClass_(org.eclipse.uml2.Class)
	 * @see org.eclipse.uml2.UML2Package#getOperation_Class_()
	 * @see org.eclipse.uml2.Class#getOwnedOperations
	 * @model opposite="ownedOperation"
	 * @generated
	 */
	org.eclipse.uml2.Class getClass_();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.Operation#getClass_ <em>Class </em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class </em>' container reference.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass_(org.eclipse.uml2.Class value);

	/**
	 * Returns the value of the '<em><b>Datatype</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.DataType#getOwnedOperations <em>Owned Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datatype</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datatype</em>' container reference.
	 * @see #setDatatype(DataType)
	 * @see org.eclipse.uml2.UML2Package#getOperation_Datatype()
	 * @see org.eclipse.uml2.DataType#getOwnedOperations
	 * @model opposite="ownedOperation"
	 * @generated
	 */
	DataType getDatatype();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.Operation#getDatatype <em>Datatype</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datatype</em>' container reference.
	 * @see #getDatatype()
	 * @generated
	 */
	void setDatatype(DataType value);

	/**
	 * Returns the value of the '<em><b>Precondition</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.Constraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precondition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An optional set of Constraints on the state of the system when the Operation is invoked. Subsets Namespace::ownedMember.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Precondition</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getOperation_Precondition()
	 * @model type="org.eclipse.uml2.Constraint" resolveProxies="false" volatile="true" ordered="false"
	 * @generated
	 */
	EList getPreconditions();

    /**
     * Retrieves the {@link org.eclipse.uml2.Constraint} with the specified name from the '<em><b>Precondition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param unqualifiedName The unqualified name of the {@link org.eclipse.uml2.Constraint} to retrieve.
	 * @return The {@link org.eclipse.uml2.Constraint} with the specified name, or <code>null</code>.
	 * @see #getPreconditions()
	 * @generated
     */
    Constraint getPrecondition(String unqualifiedName);
      
	/**
	 * Returns the value of the '<em><b>Postcondition</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.Constraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Postcondition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An optional set of Constraints specifying the state of the system when the Operation is completed. Subsets Namespace::ownedMember.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Postcondition</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getOperation_Postcondition()
	 * @model type="org.eclipse.uml2.Constraint" resolveProxies="false" volatile="true" ordered="false"
	 * @generated
	 */
	EList getPostconditions();

    /**
     * Retrieves the {@link org.eclipse.uml2.Constraint} with the specified name from the '<em><b>Postcondition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param unqualifiedName The unqualified name of the {@link org.eclipse.uml2.Constraint} to retrieve.
	 * @return The {@link org.eclipse.uml2.Constraint} with the specified name, or <code>null</code>.
	 * @see #getPostconditions()
	 * @generated
     */
    Constraint getPostcondition(String unqualifiedName);
      
	/**
	 * Returns the value of the '<em><b>Redefined Operation</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.Operation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Redefined Operation</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the Operations that are redefined by this Operation. Subsets RedefinableElement. redefinedElement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Redefined Operation</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getOperation_RedefinedOperation()
	 * @model type="org.eclipse.uml2.Operation" ordered="false"
	 * @generated
	 */
	EList getRedefinedOperations();

    /**
     * Retrieves the {@link org.eclipse.uml2.Operation} with the specified name from the '<em><b>Redefined Operation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param unqualifiedName The unqualified name of the {@link org.eclipse.uml2.Operation} to retrieve.
	 * @return The {@link org.eclipse.uml2.Operation} with the specified name, or <code>null</code>.
	 * @see #getRedefinedOperations()
	 * @generated
     */
    Operation getRedefinedOperation(String unqualifiedName);
      
	/**
	 * Returns the value of the '<em><b>Body Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * optional Constraint on the result values of an invocation of this Operation. Subsets Namespace::ownedMember.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Body Condition</em>' reference.
	 * @see #setBodyCondition(Constraint)
	 * @see org.eclipse.uml2.UML2Package#getOperation_BodyCondition()
	 * @model resolveProxies="false" volatile="true"
	 * @generated
	 */
	Constraint getBodyCondition();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.Operation#getBodyCondition <em>Body Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body Condition</em>' reference.
	 * @see #getBodyCondition()
	 * @generated
	 */
	void setBodyCondition(Constraint value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An invariant constraint based on the following OCL expression:
	 * <code>
	 * if returnResult->size() = 1 then
	 *   type = returnResult.type
	 * else
	 *   type = nil
	 * endif
	 * 
	 * </code>
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.uml2.Boolean" 
	 * @generated
	 */
	boolean validateTypeOfResult(DiagnosticChain diagnostics, Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A query based on the following OCL expression:
	 * <code>
	 * if returnResult->size() = 1 then returnResult->any().isOrdered else false endif
	 * </code>
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.uml2.Boolean" 
	 * @generated
	 */
	boolean isOrdered();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A query based on the following OCL expression:
	 * <code>
	 *  if returnResult->size() = 1 then returnResult->any().isUnique else true endif
	 * </code>
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.uml2.Boolean" 
	 * @generated
	 */
	boolean isUnique();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A query based on the following OCL expression:
	 * <code>
	 * if returnResult->size() = 1 then returnResult->any().lower else Set{} endif
	 * </code>
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.uml2.Integer" 
	 * @generated
	 */
	int lower();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A query based on the following OCL expression:
	 * <code>
	 * if returnResult->size() = 1 then returnResult->any().upper else Set{} endif
	 * </code>
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.uml2.UnlimitedNatural" 
	 * @generated
	 */
	int upper();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A query based on the following OCL expression:
	 * <code>
	 * if returnResult->size() = 1 then returnResult->any().type else Set{} endif
	 * </code>
	 * <!-- end-model-doc -->
	 * @model 
	 * @generated
	 */
	Classifier type();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An invariant constraint based on the following OCL expression:
	 * <code>
	 * bodyCondition->notEmpty() implies isQuery
	 * </code>
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.uml2.Boolean" 
	 * @generated
	 */
	boolean validateOnlyBodyForQuery(DiagnosticChain diagnostics, Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A query based on the following OCL expression:
	 * <code>
	 * (redefinee.oclIsKindOf(Operation) and
	 *     let op: Operation = redefinee.oclAsType(Operation) in
	 *         self.formalParameter.size() = op.formalParameter.size() and
	 *         self.returnResult.size() = op.returnResult.size() and
	 *         forAll(i | op.formalParameter[i].type.conformsTo(self.formalParameter[i].type)) and
	 *         forAll(i | op.returnResult[i].type.conformsTo(self.returnResult[i].type))
	 * )
	 * </code>
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.uml2.Boolean" 
	 * @generated
	 */
	boolean isConsistentWith(RedefinableElement redefinee);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parameters="org.eclipse.uml2.Boolean"
	 * @generated
	 */
	void setIsOrdered(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parameters="org.eclipse.uml2.Boolean"
	 * @generated
	 */
	void setIsUnique(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.Integer" parameters=""
	 * @generated
	 */
	int getLower();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.UnlimitedNatural" parameters=""
	 * @generated
	 */
	int getUpper();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parameters=""
	 * @generated
	 */
	EList getRaisedExceptions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parameters=""
	 * @generated
	 */
	EList getFormalParameters();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parameters=""
	 * @generated
	 */
	Type getType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model 
	 * @generated
	 */
	void setType(Type value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parameters=""
	 * @generated
	 */
	EList getRedefinitionContexts();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parameters=""
	 * @generated
	 */
	Namespace getNamespace();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parameters=""
	 * @generated
	 */
	EList getFeaturingClassifiers();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parameters=""
	 * @generated
	 */
	EList getOwnedMembers();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parameters=""
	 * @generated
	 */
	EList getOwnedRules();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parameters=""
	 * @generated
	 */
	EList getRedefinedElements();

} // Operation
