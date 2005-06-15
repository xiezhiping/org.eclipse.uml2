/*
 * Copyright (c) 2003, 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: MultiplicityElement.java,v 1.12 2005/06/15 20:06:01 khussey Exp $
 */
package org.eclipse.uml2;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multiplicity Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A MultiplicityElement is an abstract metaclass which includes optional attributes for defining the bounds of a multiplicity. A MultiplicityElement also includes specifications of whether the values in an instantiation of this element must be unique or ordered. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.MultiplicityElement#isOrdered <em>Is Ordered</em>}</li>
 *   <li>{@link org.eclipse.uml2.MultiplicityElement#isUnique <em>Is Unique</em>}</li>
 *   <li>{@link org.eclipse.uml2.MultiplicityElement#getLower <em>Lower</em>}</li>
 *   <li>{@link org.eclipse.uml2.MultiplicityElement#getUpper <em>Upper</em>}</li>
 *   <li>{@link org.eclipse.uml2.MultiplicityElement#getUpperValue <em>Upper Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.MultiplicityElement#getLowerValue <em>Lower Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.UML2Package#getMultiplicityElement()
 * @model abstract="true"
 * @generated
 */
public interface MultiplicityElement extends Element{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Is Ordered</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Ordered</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * For a multivalued multiplicity, this attribute specifies whether the values in an instantiation of this element are sequentially ordered. Default is false.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Ordered</em>' attribute.
	 * @see #setIsOrdered(boolean)
	 * @see org.eclipse.uml2.UML2Package#getMultiplicityElement_IsOrdered()
	 * @model default="false" dataType="org.eclipse.uml2.Boolean"
	 * @generated
	 */
	boolean isOrdered();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.MultiplicityElement#isOrdered <em>Is Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Ordered</em>' attribute.
	 * @see #isOrdered()
	 * @generated
	 */
	void setIsOrdered(boolean value);


	/**
	 * Returns the value of the '<em><b>Is Unique</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Unique</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * For a multivalued multiplicity, this attributes specifies whether the values in an instantiation of this element are unique. Default is true.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Unique</em>' attribute.
	 * @see #setIsUnique(boolean)
	 * @see org.eclipse.uml2.UML2Package#getMultiplicityElement_IsUnique()
	 * @model default="true" dataType="org.eclipse.uml2.Boolean"
	 * @generated
	 */
	boolean isUnique();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.MultiplicityElement#isUnique <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Unique</em>' attribute.
	 * @see #isUnique()
	 * @generated
	 */
	void setIsUnique(boolean value);


	/**
	 * Returns the value of the '<em><b>Lower</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the lower bound of the multiplicity interval, if it is expressed as an integer.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lower</em>' attribute.
	 * @see org.eclipse.uml2.UML2Package#getMultiplicityElement_Lower()
	 * @model default="1" dataType="org.eclipse.uml2.Integer" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	int getLower();


	/**
	 * Returns the value of the '<em><b>Upper</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the upper bound of the multiplicity interval, if it is expressed as an unlimited natural.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Upper</em>' attribute.
	 * @see org.eclipse.uml2.UML2Package#getMultiplicityElement_Upper()
	 * @model default="1" dataType="org.eclipse.uml2.UnlimitedNatural" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	int getUpper();


	/**
	 * Returns the value of the '<em><b>Upper Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The specification of the upper bound for this multiplicity. Subsets Element::ownedElement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Upper Value</em>' containment reference.
	 * @see #setUpperValue(ValueSpecification)
	 * @see org.eclipse.uml2.UML2Package#getMultiplicityElement_UpperValue()
	 * @model containment="true"
	 * @generated
	 */
	ValueSpecification getUpperValue();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.MultiplicityElement#getUpperValue <em>Upper Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Value</em>' containment reference.
	 * @see #getUpperValue()
	 * @generated
	 */
	void setUpperValue(ValueSpecification value);


	/**
	 * Creates a {@link org.eclipse.uml2.ValueSpecification} and sets the '<em><b>Upper Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.ValueSpecification} to create.
	 * @return The new {@link org.eclipse.uml2.ValueSpecification}.
	 * @see #getUpperValue()
	 * @generated
	 */
    ValueSpecification createUpperValue(EClass eClass);

	/**
	 * Returns the value of the '<em><b>Lower Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The specification of the lower bound for this multiplicity. Subsets Element::ownedElement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lower Value</em>' containment reference.
	 * @see #setLowerValue(ValueSpecification)
	 * @see org.eclipse.uml2.UML2Package#getMultiplicityElement_LowerValue()
	 * @model containment="true"
	 * @generated
	 */
	ValueSpecification getLowerValue();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.MultiplicityElement#getLowerValue <em>Lower Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Value</em>' containment reference.
	 * @see #getLowerValue()
	 * @generated
	 */
	void setLowerValue(ValueSpecification value);


	/**
	 * Creates a {@link org.eclipse.uml2.ValueSpecification} and sets the '<em><b>Lower Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.ValueSpecification} to create.
	 * @return The new {@link org.eclipse.uml2.ValueSpecification}.
	 * @see #getLowerValue()
	 * @generated
	 */
    ValueSpecification createLowerValue(EClass eClass);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A query based on the following OCL expression:
	 * <code>
	 * if lowerValue->isEmpty() then 1 else lowerValue.integerValue() endif
	 * </code>
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.uml2.Integer"
	 * @generated
	 */
	int lowerBound();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A query based on the following OCL expression:
	 * <code>
	 * if upperValue->isEmpty() then 1 else upperValue.unlimitedValue() endif
	 * </code>
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.uml2.UnlimitedNatural"
	 * @generated
	 */
	int upperBound();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A query based on the following OCL expression:
	 * <code>
	 * upperBound() > 1
	 * </code>
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.uml2.Boolean" parameters=""
	 * @generated
	 */
	boolean isMultivalued();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A query based on the following OCL expression:
	 * <code>
	 * (lowerBound() <= C) and (upperBound() >= C)
	 * 
	 * </code>
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.uml2.Boolean" CDataType="org.eclipse.uml2.Integer"
	 * @generated
	 */
	boolean includesCardinality(int C);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A query based on the following OCL expression:
	 * <code>
	 * (self.lowerBound() <= M.lowerBound()) and (self.upperBound() >= M.upperBound())
	 * </code>
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.uml2.Boolean"
	 * @generated
	 */
	boolean includesMultiplicity(MultiplicityElement M);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An invariant constraint based on the following OCL expression:
	 * <code>
	 * upperBound()->notEmpty() implies upperBound() > 0
	 * </code>
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.uml2.Boolean"
	 * @generated
	 */
	boolean validateUpperGt0(DiagnosticChain diagnostics, Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An invariant constraint based on the following OCL expression:
	 * <code>
	 * lowerBound()->notEmpty() implies lowerBound() >= 0
	 * </code>
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.uml2.Boolean"
	 * @generated
	 */
	boolean validateLowerGe0(DiagnosticChain diagnostics, Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An invariant constraint based on the following OCL expression:
	 * <code>
	 * (upperBound()->notEmpty() and lowerBound()->notEmpty()) implies upperBound() >= lowerBound()
	 * </code>
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.uml2.Boolean"
	 * @generated
	 */
	boolean validateUpperGeLower(DiagnosticChain diagnostics, Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An invariant constraint based on the following OCL expression:
	 * <code>
	 * lower=lowerBound()
	 * </code>
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.uml2.Boolean"
	 * @generated
	 */
	boolean validateLowerEqLowerbound(DiagnosticChain diagnostics, Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An invariant constraint based on the following OCL expression:
	 * <code>
	 * upper = upperBound()
	 * </code>
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.uml2.Boolean"
	 * @generated
	 */
	boolean validateUpperEqUpperbound(DiagnosticChain diagnostics, Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A query based on the following OCL expression:
	 * <code>
	 * lowerBound()
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
	 * upperBound()
	 * </code>
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.uml2.UnlimitedNatural"
	 * @generated
	 */
	int upper();

	// <!-- begin-custom-operations -->

	static final int UNLIMITED_UPPER_BOUND = -1;

	/**
	 * Sets the lower bound to the specified integer value.
	 * 
	 * @param value The new value of the lower bound.
	 * @exception IllegalArgumentException If the new lower bound is invalid.
	 * @see #lowerBound()
	 */
	void setLowerBound(int value);

	/**
	 * Sets the upper bound to the specified unlimited natural value.
	 * 
	 * @param value The new value of the upper bound.
	 * @exception IllegalArgumentException If the new upper bound is invalid.
	 * @see #upperBound()
	 */
	void setUpperBound(int value);

	// <!-- end-custom-operations -->

} // MultiplicityElement
