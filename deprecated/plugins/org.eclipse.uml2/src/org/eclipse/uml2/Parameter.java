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
 * $Id: Parameter.java,v 1.7 2005/03/15 18:44:43 khussey Exp $
 */
package org.eclipse.uml2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A parameter is a specification of an argument used to pass information into or out of an invocation of a behavioral feature. It has a type, and may have a multiplicity and an optional default value. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.Parameter#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.eclipse.uml2.Parameter#getDefault <em>Default</em>}</li>
 *   <li>{@link org.eclipse.uml2.Parameter#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.eclipse.uml2.Parameter#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.Parameter#isException <em>Is Exception</em>}</li>
 *   <li>{@link org.eclipse.uml2.Parameter#isStream <em>Is Stream</em>}</li>
 *   <li>{@link org.eclipse.uml2.Parameter#getEffect <em>Effect</em>}</li>
 *   <li>{@link org.eclipse.uml2.Parameter#getParameterSets <em>Parameter Set</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.UML2Package#getParameter()
 * @model 
 * @generated
 */
public interface Parameter extends ConnectableElement, TypedElement, MultiplicityElement{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Default</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default</em>' attribute.
	 * @see org.eclipse.uml2.UML2Package#getParameter_Default()
	 * @model default="" dataType="org.eclipse.uml2.String" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getDefault();

	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The default value is <code>"in"</code>.
	 * The literals are from the enumeration {@link org.eclipse.uml2.ParameterDirectionKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether a parameter is being sent into or out of a behavioral element. The default value is in.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see org.eclipse.uml2.ParameterDirectionKind
	 * @see #setDirection(ParameterDirectionKind)
	 * @see org.eclipse.uml2.UML2Package#getParameter_Direction()
	 * @model default="in"
	 * @generated
	 */
	ParameterDirectionKind getDirection();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.Parameter#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see org.eclipse.uml2.ParameterDirectionKind
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(ParameterDirectionKind value);

	/**
	 * Returns the value of the '<em><b>Is Exception</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Exception</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Exception</em>' attribute.
	 * @see #setIsException(boolean)
	 * @see org.eclipse.uml2.UML2Package#getParameter_IsException()
	 * @model default="false" dataType="org.eclipse.uml2.Boolean" volatile="true"
	 * @generated
	 */
	boolean isException();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.Parameter#isException <em>Is Exception</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Exception</em>' attribute.
	 * @see #isException()
	 * @generated
	 */
	void setIsException(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Stream</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Stream</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Stream</em>' attribute.
	 * @see #setIsStream(boolean)
	 * @see org.eclipse.uml2.UML2Package#getParameter_IsStream()
	 * @model default="false" dataType="org.eclipse.uml2.Boolean" volatile="true"
	 * @generated
	 */
	boolean isStream();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.Parameter#isStream <em>Is Stream</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Stream</em>' attribute.
	 * @see #isStream()
	 * @generated
	 */
	void setIsStream(boolean value);

	/**
	 * Returns the value of the '<em><b>Effect</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.uml2.ParameterEffectKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effect</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effect</em>' attribute.
	 * @see org.eclipse.uml2.ParameterEffectKind
	 * @see #setEffect(ParameterEffectKind)
	 * @see org.eclipse.uml2.UML2Package#getParameter_Effect()
	 * @model 
	 * @generated
	 */
	ParameterEffectKind getEffect();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.Parameter#getEffect <em>Effect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effect</em>' attribute.
	 * @see org.eclipse.uml2.ParameterEffectKind
	 * @see #getEffect()
	 * @generated
	 */
	void setEffect(ParameterEffectKind value);

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.Operation#getOwnedParameters <em>Owned Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the Operation for which this is a formal parameter. Subsets NamedElement:: namespace.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Operation</em>' container reference.
	 * @see #setOperation(Operation)
	 * @see org.eclipse.uml2.UML2Package#getParameter_Operation()
	 * @see org.eclipse.uml2.Operation#getOwnedParameters
	 * @model opposite="ownedParameter"
	 * @generated
	 */
	Operation getOperation();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.Parameter#getOperation <em>Operation</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' container reference.
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(Operation value);

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a ValueSpecification that represents a value to be used when no argument is supplied for the Parameter. Subsets Element::ownedElement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Value</em>' containment reference.
	 * @see #setDefaultValue(ValueSpecification)
	 * @see org.eclipse.uml2.UML2Package#getParameter_DefaultValue()
	 * @model containment="true"
	 * @generated
	 */
	ValueSpecification getDefaultValue();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.Parameter#getDefaultValue <em>Default Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' containment reference.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(ValueSpecification value);

    /**
     * Creates a {@link org.eclipse.uml2.ValueSpecification} and sets the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.ValueSpecification} to create.
	 * @return The new {@link org.eclipse.uml2.ValueSpecification}.
	 * @see #getDefaultValue()
	 * @generated
     */
    ValueSpecification createDefaultValue(EClass eClass);
     
	/**
	 * Returns the value of the '<em><b>Parameter Set</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.ParameterSet}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.ParameterSet#getParameters <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Set</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Set</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getParameter_ParameterSet()
	 * @see org.eclipse.uml2.ParameterSet#getParameters
	 * @model type="org.eclipse.uml2.ParameterSet" opposite="parameter" ordered="false"
	 * @generated
	 */
	EList getParameterSets();

    /**
     * Retrieves the {@link org.eclipse.uml2.ParameterSet} with the specified name from the '<em><b>Parameter Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param unqualifiedName The unqualified name of the {@link org.eclipse.uml2.ParameterSet} to retrieve.
	 * @return The {@link org.eclipse.uml2.ParameterSet} with the specified name, or <code>null</code>.
	 * @see #getParameterSets()
	 * @generated
     */
    ParameterSet getParameterSet(String unqualifiedName);
      
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
	EList getOwnedElements();

	// <!-- begin-custom-operations -->

	/**
	 * Sets the default to the specified boolean value.
	 * 
	 * @param value The new value of the default.
	 * @see #getDefault()
	 */
	void setBooleanDefault(boolean value);

	/**
	 * Sets the default to the specified integer value.
	 * 
	 * @param value The new value of the default.
	 * @see #getDefault()
	 */
	void setIntegerDefault(int value);

	/**
	 * Sets the default to the specified string value.
	 * 
	 * @param value The new value of the default.
	 * @see #getDefault()
	 */
	void setStringDefault(String value);

	/**
	 * Sets the default to the specified unlimited natural value.
	 * 
	 * @param value The new value of the default.
	 * @see #getDefault()
	 */
	void setUnlimitedNaturalDefault(int value);

	// <!-- end-custom-operations -->

} // Parameter
