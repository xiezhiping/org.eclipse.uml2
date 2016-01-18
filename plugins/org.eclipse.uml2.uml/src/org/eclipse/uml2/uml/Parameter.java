/*
 * Copyright (c) 2005, 2016 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 327039, 351774, 418466, 451350, 485756
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
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Parameter is a specification of an argument used to pass information into or out of an invocation of a BehavioralFeature.  Parameters can be treated as ConnectableElements within Collaborations.
 * <p>From package UML::Classification.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Parameter#getDefault <em>Default</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Parameter#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Parameter#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Parameter#getEffect <em>Effect</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Parameter#isException <em>Is Exception</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Parameter#isStream <em>Is Stream</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Parameter#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Parameter#getParameterSets <em>Parameter Set</em>}</li>
 * </ul>
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
	 * The ParameterSets containing the parameter. See ParameterSet.
	 * <p>From package UML::Classification.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameter Set</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getParameter_ParameterSet()
	 * @see org.eclipse.uml2.uml.ParameterSet#getParameters
	 * @model opposite="parameter" ordered="false"
	 * @generated
	 */
	EList<ParameterSet> getParameterSets();

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.ParameterSet} with the specified '<em><b>Name</b></em>' from the '<em><b>Parameter Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.ParameterSet} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.ParameterSet} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getParameterSets()
	 * @generated
	 */
	ParameterSet getParameterSet(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.ParameterSet} with the specified '<em><b>Name</b></em>' from the '<em><b>Parameter Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.ParameterSet} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @return The first {@link org.eclipse.uml2.uml.ParameterSet} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getParameterSets()
	 * @generated
	 */
	ParameterSet getParameterSet(String name, boolean ignoreCase);

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' reference.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.NamedElement#getNamespace() <em>Namespace</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Operation owning this parameter.
	 * <p>From package UML::Classification.</p>
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
	 * <p>From package UML::Classification.</p>
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
	 * A String that represents a value to be used when no argument is supplied for the Parameter.
	 * <p>From package UML::Classification.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default</em>' attribute.
	 * @see #isSetDefault()
	 * @see #unsetDefault()
	 * @see #setDefault(String)
	 * @see org.eclipse.uml2.uml.UMLPackage#getParameter_Default()
	 * @model unsettable="true" dataType="org.eclipse.uml2.types.String" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	String getDefault();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.Parameter#getDefault <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default</em>' attribute.
	 * @see #isSetDefault()
	 * @see #unsetDefault()
	 * @see #getDefault()
	 * @generated
	 */
	void setDefault(String value);

	/**
	 * Unsets the value of the '{@link org.eclipse.uml2.uml.Parameter#getDefault <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDefault()
	 * @see #getDefault()
	 * @see #setDefault(String)
	 * @generated
	 */
	void unsetDefault();

	/**
	 * Returns whether the value of the '{@link org.eclipse.uml2.uml.Parameter#getDefault <em>Default</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Default</em>' attribute is set.
	 * @see #unsetDefault()
	 * @see #getDefault()
	 * @see #setDefault(String)
	 * @generated
	 */
	boolean isSetDefault();

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' containment reference.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Element#getOwnedElements() <em>Owned Element</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a ValueSpecification that represents a value to be used when no argument is supplied for the Parameter.
	 * <p>From package UML::Classification.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Value</em>' containment reference.
	 * @see #setDefaultValue(ValueSpecification)
	 * @see org.eclipse.uml2.uml.UMLPackage#getParameter_DefaultValue()
	 * @model containment="true" resolveProxies="true" ordered="false"
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
	 * Creates a new {@link org.eclipse.uml2.uml.ValueSpecification}, with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>', and sets the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.ValueSpecification}, or <code>null</code>.
	 * @param type The '<em><b>Type</b></em>' for the new {@link org.eclipse.uml2.uml.ValueSpecification}, or <code>null</code>.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.ValueSpecification} to create.
	 * @return The new {@link org.eclipse.uml2.uml.ValueSpecification}.
	 * @see #getDefaultValue()
	 * @generated
	 */
	ValueSpecification createDefaultValue(String name, Type type,
			EClass eClass);

	/**
	 * Returns the value of the '<em><b>Is Exception</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Tells whether an output parameter may emit a value to the exclusion of the other outputs.
	 * <p>From package UML::Classification.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Exception</em>' attribute.
	 * @see #setIsException(boolean)
	 * @see org.eclipse.uml2.uml.UMLPackage#getParameter_IsException()
	 * @model default="false" dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
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
	 * Tells whether an input parameter may accept values while its behavior is executing, or whether an output parameter may post values while the behavior is executing.
	 * <p>From package UML::Classification.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Stream</em>' attribute.
	 * @see #setIsStream(boolean)
	 * @see org.eclipse.uml2.uml.UMLPackage#getParameter_IsStream()
	 * @model default="false" dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
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
	 * Specifies the effect that executions of the owner of the Parameter have on objects passed in or out of the parameter.
	 * <p>From package UML::Classification.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Effect</em>' attribute.
	 * @see org.eclipse.uml2.uml.ParameterEffectKind
	 * @see #isSetEffect()
	 * @see #unsetEffect()
	 * @see #setEffect(ParameterEffectKind)
	 * @see org.eclipse.uml2.uml.UMLPackage#getParameter_Effect()
	 * @model unsettable="true" ordered="false"
	 * @generated
	 */
	ParameterEffectKind getEffect();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.Parameter#getEffect <em>Effect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effect</em>' attribute.
	 * @see org.eclipse.uml2.uml.ParameterEffectKind
	 * @see #isSetEffect()
	 * @see #unsetEffect()
	 * @see #getEffect()
	 * @generated
	 */
	void setEffect(ParameterEffectKind value);

	/**
	 * Unsets the value of the '{@link org.eclipse.uml2.uml.Parameter#getEffect <em>Effect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEffect()
	 * @see #getEffect()
	 * @see #setEffect(ParameterEffectKind)
	 * @generated
	 */
	void unsetEffect();

	/**
	 * Returns whether the value of the '{@link org.eclipse.uml2.uml.Parameter#getEffect <em>Effect</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Effect</em>' attribute is set.
	 * @see #unsetEffect()
	 * @see #getEffect()
	 * @see #setEffect(ParameterEffectKind)
	 * @generated
	 */
	boolean isSetEffect();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A Parameter may only be associated with a Connector end within the context of a Collaboration.
	 * end->notEmpty() implies collaboration->notEmpty()
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateConnectorEnd(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A Parameter cannot be a stream and exception at the same time.
	 * not (isException and isStream)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateStreamAndException(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Parameters typed by DataTypes cannot have an effect.
	 * (type.oclIsKindOf(DataType)) implies (effect = null)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateObjectEffect(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An input Parameter cannot be an exception.
	 * isException implies (direction <> ParameterDirectionKind::_'in' and direction <> ParameterDirectionKind::inout)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateNotException(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reentrant behaviors cannot have stream Parameters.
	 * (isStream and behavior <> null) implies not behavior.isReentrant
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateReentrantBehaviors(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Only in and inout Parameters may have a delete effect. Only out, inout, and return Parameters may have a create effect.
	 * (effect = ParameterEffectKind::delete implies (direction = ParameterDirectionKind::_'in' or direction = ParameterDirectionKind::inout))
	 * and
	 * (effect = ParameterEffectKind::create implies (direction = ParameterDirectionKind::out or direction = ParameterDirectionKind::inout or direction = ParameterDirectionKind::return))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateInAndOut(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sets the default value for this parameter to the specified Boolean value.
	 * @param value The new default value.
	 * <!-- end-model-doc -->
	 * @model valueDataType="org.eclipse.uml2.types.Boolean" valueRequired="true" valueOrdered="false"
	 * @generated
	 */
	void setBooleanDefaultValue(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sets the default value for this parameter to the specified integer value.
	 * @param value The new default value.
	 * <!-- end-model-doc -->
	 * @model valueDataType="org.eclipse.uml2.types.Integer" valueRequired="true" valueOrdered="false"
	 * @generated
	 */
	void setIntegerDefaultValue(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sets the default value for this parameter to the specified string value.
	 * @param value The new default value.
	 * <!-- end-model-doc -->
	 * @model valueDataType="org.eclipse.uml2.types.String" valueRequired="true" valueOrdered="false"
	 * @generated
	 */
	void setStringDefaultValue(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sets the default value for this parameter to the specified unlimited natural value.
	 * @param value The new default value.
	 * <!-- end-model-doc -->
	 * @model valueDataType="org.eclipse.uml2.types.UnlimitedNatural" valueRequired="true" valueOrdered="false"
	 * @generated
	 */
	void setUnlimitedNaturalDefaultValue(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sets the default value for this parameter to the null value.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void setNullDefaultValue();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sets the default value for this parameter to the specified real value.
	 * @param value The new default value.
	 * <!-- end-model-doc -->
	 * @model valueDataType="org.eclipse.uml2.types.Real" valueRequired="true" valueOrdered="false"
	 * @generated
	 */
	void setRealDefaultValue(double value);

} // Parameter
