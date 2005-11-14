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
 * $Id: Parameter.java,v 1.1 2005/11/14 22:25:59 khussey Exp $
 */
package org.eclipse.uml2.uml;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A parameter is a kind of typed element in order to allow the specification of an optional multiplicity on parameters. In addition, it supports the specification of an optional default value.
 * A parameter is a specification of an argument used to pass information into or out of an invocation of a behavioral feature. It has a type, and may have a multiplicity and an optional default value.
 * Parameters are allowed to be treated as connectable elements.
 * Parameters are extended in complete activities to add support for streaming, exceptions, and parameter sets.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Parameter#getParameterSets <em>Parameter Set</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Parameter#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Parameter#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Parameter#getDefault <em>Default</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Parameter#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Parameter#isException <em>Is Exception</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Parameter#isStream <em>Is Stream</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Parameter#getEffect <em>Effect</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter
		extends ConnectableElement, MultiplicityElement {

	/**
	 * Returns the value of the '<em><b>Parameter Set</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.ParameterSet}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.ParameterSet#getParameters <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The parameter sets containing the parameter. See ParameterSet.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameter Set</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getParameter_ParameterSet()
	 * @see org.eclipse.uml2.uml.ParameterSet#getParameters
	 * @model type="org.eclipse.uml2.uml.ParameterSet" opposite="parameter" ordered="false"
	 * @generated
	 */
	List getParameterSets();

	/**
	 * Retrieves the {@link org.eclipse.uml2.uml.ParameterSet} with the specified '<em><b>Name</b></em>' from the '<em><b>Parameter Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.ParameterSet} to retrieve.
	 * @return The {@link org.eclipse.uml2.uml.ParameterSet} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getParameterSets()
	 * @generated
	 */
	ParameterSet getParameterSet(String name);

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the Operation for which this is a formal parameter.
	 * References the Operation owning this parameter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Operation</em>' reference.
	 * @see org.eclipse.uml2.uml.UMLPackage#getParameter_Operation()
	 * @model transient="true" changeable="false" volatile="true" ordered="false"
	 * @generated
	 */
	Operation getOperation();

	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The default value is <code>"in"</code>.
	 * The literals are from the enumeration {@link org.eclipse.uml2.uml.ParameterDirectionKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether a parameter is being sent into or out of a behavioral element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see org.eclipse.uml2.uml.ParameterDirectionKind
	 * @see #setDirection(ParameterDirectionKind)
	 * @see org.eclipse.uml2.uml.UMLPackage#getParameter_Direction()
	 * @model default="in" required="true" ordered="false"
	 * @generated
	 */
	ParameterDirectionKind getDirection();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.Parameter#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see org.eclipse.uml2.uml.ParameterDirectionKind
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(ParameterDirectionKind value);

	/**
	 * Returns the value of the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a String that represents a value to be used when no argument is supplied for the Parameter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default</em>' attribute.
	 * @see #setDefault(String)
	 * @see org.eclipse.uml2.uml.UMLPackage#getParameter_Default()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	String getDefault();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.Parameter#getDefault <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default</em>' attribute.
	 * @see #getDefault()
	 * @generated
	 */
	void setDefault(String value);

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a ValueSpecification that represents a value to be used when no argument is supplied for the Parameter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Value</em>' containment reference.
	 * @see #setDefaultValue(ValueSpecification)
	 * @see org.eclipse.uml2.uml.UMLPackage#getParameter_DefaultValue()
	 * @model containment="true" resolveProxies="false" ordered="false"
	 * @generated
	 */
	ValueSpecification getDefaultValue();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.Parameter#getDefaultValue <em>Default Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' containment reference.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(ValueSpecification value);

	/**
	 * Creates a {@link org.eclipse.uml2.uml.ValueSpecification} and sets the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.ValueSpecification} to create.
	 * @return The new {@link org.eclipse.uml2.uml.ValueSpecification}.
	 * @see #getDefaultValue()
	 * @generated
	 */
	ValueSpecification createDefaultValue(EClass eClass);

	/**
	 * Returns the value of the '<em><b>Is Exception</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Tells whether an output parameter may emit a value to the exclusion of the other outputs.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Exception</em>' attribute.
	 * @see #setIsException(boolean)
	 * @see org.eclipse.uml2.uml.UMLPackage#getParameter_IsException()
	 * @model default="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isException();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.Parameter#isException <em>Is Exception</em>}' attribute.
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
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Tells whether an input parameter may accept values while its behavior is executing, or whether an output parameter post values while the behavior is executing.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Stream</em>' attribute.
	 * @see #setIsStream(boolean)
	 * @see org.eclipse.uml2.uml.UMLPackage#getParameter_IsStream()
	 * @model default="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isStream();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.Parameter#isStream <em>Is Stream</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Stream</em>' attribute.
	 * @see #isStream()
	 * @generated
	 */
	void setIsStream(boolean value);

	/**
	 * Returns the value of the '<em><b>Effect</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.uml2.uml.ParameterEffectKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the effect that the owner of the parameter has on values passed in or out of the parameter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Effect</em>' attribute.
	 * @see org.eclipse.uml2.uml.ParameterEffectKind
	 * @see #setEffect(ParameterEffectKind)
	 * @see org.eclipse.uml2.uml.UMLPackage#getParameter_Effect()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ParameterEffectKind getEffect();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.Parameter#getEffect <em>Effect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effect</em>' attribute.
	 * @see org.eclipse.uml2.uml.ParameterEffectKind
	 * @see #getEffect()
	 * @generated
	 */
	void setEffect(ParameterEffectKind value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A parameter may only be associated with a connector end within the context of a collaboration.
	 * self.end.notEmpty() implies self.collaboration.notEmpty()
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateConnectorEnd(DiagnosticChain diagnostics, Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A parameter cannot be a stream and exception at the same time.
	 * true
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateStreamAndException(DiagnosticChain diagnostics, Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An input parameter cannot be an exception.
	 * true
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateNotException(DiagnosticChain diagnostics, Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reentrant behaviors cannot have stream parameters.
	 * true
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateReentrantBehaviors(DiagnosticChain diagnostics, Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Only in and inout parameters may have a delete effect. Only out, inout, and return parameters may have a create effect.
	 * true
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateInAndOut(DiagnosticChain diagnostics, Map context);

} // Parameter
